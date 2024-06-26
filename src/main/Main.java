package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.AllDirectedPaths;

/* 
 * Las heuristics EN ORDEN van a ser 
 *  
 * - It does not interlock with the previously scheduled instruction.
 * - It has many successors in the graph (may enable successors to be scheduled with greater flexibility).
 * - is as far away as possible (along paths in the DAG) from an instruction which can validly be scheduled last.
 * 
 * Bueno habria que tener en cuenta los cortocircuitos, osea que hay que diferenciar entre loads y los demas. 
 * creo que lw lw y add add, no tienen stall. Pero si lw add
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //File inputFile = openFile("src/main/ejemplo_basico.asm");
        File inputFile = openFile("src/main/ejemplo_informe.asm");

        try {

            MipsLexer lexer = new MipsLexer(new FileReader(inputFile.getPath()));
            parser p = new parser(lexer);
            List<List<Line>> result = (List<List<Line>>) p.parse().value;

            List<List<Line>> basicBlocks = getBasicblocks(result.get(1));
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("result.asm")))) {
                for (Line line : result.get(0)) {
                    writer.write(line.toString());
                    writer.newLine();
                }
                writer.newLine();

                System.out.println("Bloques basicos:");

                for (List<Line> basicBlock : basicBlocks) {
                    System.out.println(basicBlock);
                }

                System.out.println("---------------------------");

                for (List<Line> basicBlock : basicBlocks) {
                    for (Line line : sort(basicBlock)) {
                        writer.write(line.toString());
                        writer.newLine();
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
     * Toma los bloques basicos y extre las instrucciones, osea las separa de las
     * labels y de las instrucciones de salto
     * 
     * 
     */
    private static List<Line> sort(List<Line> basicBlock) {
        LinkedList<Instruction> instructions = new LinkedList<Instruction>();
        for (Line instruction : basicBlock) {
            if (instruction instanceof Instruction) {
                instructions.add((Instruction) instruction);
            }
        }

        // Esto es cuando no se puede ordenar nada y lo devuelve tal cual
        if (instructions.size() <= 2) {
            return basicBlock;
        }

        // hacemos 2 graph, uno es el que vamos a ir modificando y el otro lo usamos
        // como referencia para algunas reglas
        Graph<Instruction, DefaultEdge> DAG = DAGBuilder.buildDAG(instructions);
        Graph<Instruction, DefaultEdge> originalDAG = DAGBuilder.buildDAG(instructions);

        // ordena las instrucciones
        List<Instruction> sortedBasicBlock = sortDAG(DAG, originalDAG);

        // reinserta la lista ya ordenada al bloque basico
        int index = 0;
        for (int i = 0; i < basicBlock.size(); i++) {
            if (basicBlock.get(i) instanceof Instruction) {
                basicBlock.set(i, sortedBasicBlock.get(index++));
            }
        }

        return basicBlock;
    }

    public static List<Instruction> sortDAG(Graph<Instruction, DefaultEdge> DAG,
            Graph<Instruction, DefaultEdge> originalDAG) {
        List<Instruction> result = new ArrayList<>();
        List<Instruction> candidates = new ArrayList<>();
        List<Instruction> possibleLast = new ArrayList<>();

        // elige candidatos por primera vez
        for (Instruction instruction : DAG.vertexSet()) {
            if (DAG.inDegreeOf(instruction) == 0) {
                candidates.add(instruction);
            } else if (DAG.outDegreeOf(instruction) == 0) {
                possibleLast.add(instruction);
                //System.out.println("posible ultimo: " + instruction);
            }
        }

        Instruction lastSelected = null;
        while (DAG.vertexSet().size() != 0) {
            if (!candidates.isEmpty()) {

                System.out.println("Candidatos: " + candidates);
                Instruction selected = selectNext(candidates, possibleLast, DAG, originalDAG, lastSelected);
                // si no selecciono ninguno, entonces elige el primero
                if (selected == null) {
                    System.out.println("Elección default: "+ candidates.get(0));
                    selected = candidates.get(0);
                }
                System.out.println("---------------------------------------");

                result.add(selected);
                lastSelected = selected;
                DAG.removeVertex(selected);
                candidates.remove(selected); // TODO: Tiene sentido?

                if (possibleLast.contains(selected)) {
                    possibleLast.remove(selected);
                }

            }

            candidates.clear();
            for (Instruction instruction : DAG.vertexSet()) {
                if (DAG.inDegreeOf(instruction) == 0) {
                    candidates.add(instruction);
                }
            }

        }
        return result;
    }

    /*
     * 
     * Metodo para elegir la siguiente instruccion
     */
    private static Instruction selectNext(List<Instruction> candidates, List<Instruction> possibleLast,
            Graph<Instruction, DefaultEdge> DAG, Graph<Instruction, DefaultEdge> originalDAG,
            Instruction lastSelected) {
        

        AluOps aluops = new AluOps();
        Instruction selected = null;

        // Unica instruccion
        if (candidates.size() == 1) {
            System.out.println("Unico candidato: " + candidates.get(0));
            return candidates.get(0);
        }

        // Primera regla
        List<Instruction> toRemoveFirstRule = new ArrayList<>();

        for (Instruction candidate : candidates) {
            if (originalDAG.containsEdge(lastSelected, candidate)) { //TODO: mejorar?
                //System.out.println("si?: " + candidate);
                //System.out.println(aluops.list.contains(candidate.getOpcode()));
                //System.out.println(lastSelected.getOpcode());
                if (lastSelected.getOpcode().equals("lw") && aluops.list.contains(candidate.getOpcode())) { //TODO: este if hay que revisarlo
                    toRemoveFirstRule.add(candidate);
                }
            }
        }

        if (!toRemoveFirstRule.isEmpty()) {
            //System.out.println(toRemoveFirstRule.size());;
            candidates.removeAll(toRemoveFirstRule);
        }

        // Si solo quedo una instruccion, la devuelve
        if (candidates.size() == 1) {
            System.out.println("primera regla, eligiendo: " + candidates.get(0));
            return candidates.get(0);
        }

        //System.out.println("Despues de primera regla: " + candidates);

        // Segunda regla
        int maxOutDegree = 0;
        List<Integer> outDegrees = new ArrayList<Integer>();
        Instruction aCandidate = null;
        for (Instruction candidate : candidates) {
            outDegrees.add(DAG.outDegreeOf(candidate));
            if (DAG.outDegreeOf(candidate) > maxOutDegree) {
                maxOutDegree = DAG.outDegreeOf(candidate);
                aCandidate = candidate; // Candidato provisorio
            }
        }

        List<Instruction> toRemoveSecondRule = new ArrayList<>();
        for (int j = 0; j < outDegrees.size(); j++) {
            if (outDegrees.get(j) != maxOutDegree) {
                toRemoveSecondRule.add(candidates.get(j));
            }
        }

        if (toRemoveSecondRule.size() == candidates.size() - 1) {
            System.out.println("segunda regla, eligiendo: " + aCandidate);
            return aCandidate;
        } else {
            candidates.removeAll(toRemoveSecondRule);
        }

        //System.out.println("Despues de segunda regla: " + candidates);

        // Tercer regla
        List<Instruction> thirdRuleGoods = new ArrayList<>();
        AllDirectedPaths<Instruction, DefaultEdge> allPaths = new AllDirectedPaths<Instruction, DefaultEdge>(
                DAG);
        int max = 0;
        // busca el tamaño del camino mas largo
        for (Instruction candidate : candidates) {
            for (Instruction last : possibleLast) {
                List<GraphPath<Instruction, DefaultEdge>> paths = allPaths.getAllPaths(candidate, last, true,
                        DAG.vertexSet().size());
                for (GraphPath<Instruction, DefaultEdge> path : paths) {
                    if (path.getLength() > max) {
                        max = path.getLength();
                    }
                }

            }
        }

        //si algun candidato tiene un camino menor al max, lo agrega a los que removemos de los candidatos
        for (Instruction candidate : candidates) {
            for (Instruction last : possibleLast) {
                List<GraphPath<Instruction, DefaultEdge>> paths = allPaths.getAllPaths(candidate, last, true,
                        DAG.vertexSet().size());
                for (GraphPath<Instruction, DefaultEdge> path : paths) {
                    if (path.getLength() == max) {
                        if (!thirdRuleGoods.contains(candidate)) {
                            thirdRuleGoods.add(candidate);
                        }
                    }
                }

            }
        }


        //System.out.println("a ver : " + candidates);
        //System.out.println("a ver 2 : " + thirdRuleGoods);

        if (!thirdRuleGoods.isEmpty()) {
            candidates = thirdRuleGoods;
        }
        
        if (candidates.size()==1) {
            System.out.println("tercera regla eligiendo: " + candidates.get(0));
            return candidates.get(0);
        }
        



        return null;

    }

    /*
     * funciona bien pero en algunos casos genera sublistas vacias. asi que supongo
     * que es cuestion de eliminarlas
     */
    private static List<List<Line>> getBasicblocks(List<Line> program) {
        List<List<Line>> result = new LinkedList<>();
        Iterator<Line> it = program.iterator();
        it.next();
        int firstIndex = 0;
        int actualIndex = 0;
        while (it.hasNext()) {
            Line actual = it.next();
            actualIndex++;
            if (actual instanceof LabelDef) {
                if (actualIndex != firstIndex) { // evita bloques vacios
                    result.add(program.subList(firstIndex, actualIndex));
                    firstIndex = actualIndex;
                }

            }
            if (actual instanceof JumpInstruction) {
                result.add(program.subList(firstIndex, actualIndex + 1));
                firstIndex = actualIndex + 1;
            }

        }

        return result;
    }

    private static File openFile(String pathName) throws IOException {
        String path = pathName;
        File file = new File("/home/braian/instructionScheduling/" + path);
        if (!file.isFile()) {
            throw new FileNotFoundException(path);
        }
        return file;
    }

}