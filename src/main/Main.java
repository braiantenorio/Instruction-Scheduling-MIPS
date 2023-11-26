
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Objects;

import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = openFile("src/main/ejemplo.asm");

        try {

            MipsLexer lexer = new MipsLexer(new FileReader(inputFile.getPath()));

            while (true) {
                Symbol token = lexer.next_token();
                if (token.sym == MipsLexer.YYEOF || token.sym == MipsLexer.EOF) {
                    break;
                }
            
                // Imprimir información sobre el token, incluyendo yytext()
                System.out.println("Token: " + MipsLexer.terminalNames[token.sym] + " - " + token.value + " - " + lexer.yytext());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

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
