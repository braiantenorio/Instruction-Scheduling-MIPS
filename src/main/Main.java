
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

import java_cup.runtime.Symbol;
import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Graph;
import net.datastructures.Vertex;

public class Main {
    public static void main(String[] args) throws IOException {
        // File inputFile = openFile("src/main/ejemplo.asm");
        File inputFile = openFile("src/main/ejemplo.asm");

        try {

            MipsLexer lexer = new MipsLexer(new FileReader(inputFile.getPath()));
            parser p = new parser(lexer);
            List<Line> result;
            result = (List<Line>) p.parse().value;

            List<List<Line>> basicBlocks = getBasicblocks(result);
            for (List<Line> basicBlock : basicBlocks) {
                System.out.println(sort(basicBlock));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<Line> sort(List<Line> basicBlock) {
        List<Instruction> instructions = new LinkedList<Instruction>();
        Graph<Line, Integer> DAG = new AdjacencyMapGraph<>(true); // por ahora es integer pero puede mejorar
        for (Line instruction : basicBlock) {
            if (instruction instanceof Instruction) {
                instructions.add((Instruction) instruction);
            }
        }

        if (instructions.size() < 3) {
            return basicBlock; // Esto es cuando no se puede ordenar nada y lo devuelve tal cual
        }

        // Aca hay que ordenar y devolver xd

        return basicBlock;

    }

    /*
     * funciona bien pero en algunos casos genera sublistas vacias. asi que supongo
     * que es cuestion de eliminarlas
     */
    private static List<List<Line>> getBasicblocks(List<Line> program) {
        List<List<Line>> result = new ArrayList<>();
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
