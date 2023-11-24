package main;

import java.util.ArrayList;
import java.util.List;

public class Instruction {
    private String opcode;
    private List<Instruction> dependencies;

    public Instruction(String opcode) {
        this.opcode = opcode;
        this.dependencies = new ArrayList<>();
    }

    public void addDependency(Instruction dependent) {
        dependencies.add(dependent);
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    // setters y getters
}
