package main;

import java.util.ArrayList;
import java.util.List;

public class Instruction extends Line {
    private String opcode;
    private List<String> readRegisters; 
    private List<String> writeRegisters; 


    public Instruction(String line, String opcode) {
        super(line);
        this.opcode = opcode;
        this.readRegisters = new ArrayList<>();
        this.writeRegisters = new ArrayList<>();
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

    public void addWriteRegister(String writeRegister){
        this.writeRegisters.add(writeRegister);
    }

    public void addReadRegister(String readRegister){
        this.readRegisters.add(readRegister);
    }

}
