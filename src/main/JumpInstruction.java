package main;

public class JumpInstruction extends Line {

    public JumpInstruction(String line) {
        super(line);
    }

    @Override
    public String toString() {
        return "\t" + super.toString();
    }

}
