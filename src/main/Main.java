
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = openFile("src/main/ejemplo.asm");

        try {

            MipsLexer lexer = new MipsLexer(new FileReader(inputFile.getPath()));
            parser p = new parser(lexer);
            List<Line> result;
            result = (List<Line>) p.parse().value;

            System.out.println(getBasicblocks(result));

        } catch (Exception e) {
            e.printStackTrace();
        }

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
