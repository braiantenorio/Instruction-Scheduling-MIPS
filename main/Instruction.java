package main;

import java.util.ArrayList;
import java.util.List;

public class Instruction {
    private String opcode; // Opcode de la instrucción
    private String line; // Línea de código completa
    private List<String> readRegisters; // Registros leídos por la instrucción
    private List<String> writeRegisters; // Registros escritos por la instrucción

    public Instruction(String opcode, String line, List<String> readRegisters, List<String> writeRegisters) {
        this.opcode = opcode;
        this.line = line;
        this.readRegisters = readRegisters;
        this.writeRegisters = writeRegisters;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public List<String> getReadRegisters() {
        return readRegisters;
    }

    public void setReadRegisters(List<String> readRegisters) {
        this.readRegisters = readRegisters;
    }

    public List<String> getWriteRegisters() {
        return writeRegisters;
    }

    public void setWriteRegisters(List<String> writeRegisters) {
        this.writeRegisters = writeRegisters;
    }

}
