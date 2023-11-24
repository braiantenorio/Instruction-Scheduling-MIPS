package main;

import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String assemblyCode = "lw $1, 0($0)\nadd $2, $2, $1\n";

        MipsLexer lexer = new MipsLexer(new StringReader(assemblyCode));

        try {
            while (true) {
                String token = lexer.yylex();
                if (token == null) break;

                // Aquí puedes procesar el token según sea necesario
                System.out.println("Token: " + token);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
