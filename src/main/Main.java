
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.Graph;
import org.jgrapht.traverse.BreadthFirstIterator;
//usemos el https://jgrapht.org/javadoc/org.jgrapht.core/org/jgrapht/traverse/BreadthFirstIterator.html#getDepth(V)

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = openFile("src/main/test.asm");
        // File inputFile = openFile("src/main/ejemplo.asm");

        try {

            MipsLexer lexer = new MipsLexer(new FileReader(inputFile.getPath()));
            parser p = new parser(lexer);
            List<Line> result = (List<Line>) p.parse().value;

            List<List<Line>> basicBlocks = getBasicblocks(result);
            for (List<Line> basicBlock : basicBlocks) {
                // System.out.println(basicBlock); //para ver como son los basic blocks
                 System.out.println(sort(basicBlock));
                //sort(basicBlock);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<Line> sort(List<Line> basicBlock) {
        LinkedList<Instruction> instructions = new LinkedList<Instruction>();
        // Graph<Line, Integer> DAG = new AdjacencyMapGraph<>(true); // por ahora es
        // integer pero puede mejorar
        for (Line instruction : basicBlock) {
            if (instruction instanceof Instruction) {
                instructions.add((Instruction) instruction);
            }
        }

        if (instructions.size() <= 2) {
            return basicBlock; // Esto es cuando no se puede ordenar nada y lo devuelve tal cual
        }

        // Aca hay que ordenar y devolver
        // cuidado con la doble dependencia, seria solo 1 arco siempre

        Graph<Instruction, DefaultEdge> DAG = DAGBuilder.buildDAG(instructions);

        // System.out.println(DAG.inDegreeOf(instructions.get(0)));

        List<Instruction> sortedBasicBlock = sortDAG(DAG);

        // al parecer asi lo resolvemos (el tema de volver a poner la lista en su lugar)
        int index = 0;
        for (int i = 0; i < basicBlock.size(); i++) {
            if (basicBlock.get(i) instanceof Instruction) {
                basicBlock.set(i, sortedBasicBlock.get(index++));
            }
        }

        return basicBlock; // return de una ordenada? osea una funcion?

    }

    public static List<Instruction> sortDAG(Graph<Instruction, DefaultEdge> DAG) {
        List<Instruction> result = new ArrayList<>();
        List<Instruction> candidates = new ArrayList<>();
        for (Instruction instruction : DAG.vertexSet()) {
            if (DAG.inDegreeOf(instruction) == 0) {
                candidates.add(instruction);
            }
        }

        //System.out.println(candidates);
        

        while (DAG.vertexSet().size() != 0) {
            if (!candidates.isEmpty()) {
                Instruction selected = candidates.get(0);
                
                for (Instruction candidate : candidates) {
                    if (DAG.outDegreeOf(candidate) < DAG.outDegreeOf(selected)) {
                        selected = candidate;
                    }
                }

                // Elimina el nodo del DAG y devuelve la instrucción seleccionada
                result.add(selected);
                DAG.removeVertex(selected);
                candidates.remove(selected);
            }

            candidates.clear();
            for (Instruction instruction : DAG.vertexSet()) {
                if (DAG.inDegreeOf(instruction) == 0) {
                    candidates.add(instruction);
                }
            }
            System.out.println(candidates);

        }

        return result; // No quedan instrucciones sin dependencias pendientes
    }

    /*
     * funciona bien pero en algunos casos genera sublistas vacias. asi que supongo
     * que es cuestion de eliminarlas
     */
    private static List<List<Line>> getBasicblocks(List<Line> program) {
        List<List<Line>> result = new LinkedList<>(); // ahora lo cambiamos a linked list por que luego es mas facil
                                                      // insertar listas xd
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
