package main;

public class MipsSymbol extends java_cup.runtime.Symbol {
    private String tipo;

    public MipsSymbol(int type, int line, int column) {
        this(type, line, column, -1, -1, null);
    }

    public MipsSymbol(int type, int line, int column, Object value) {
        this(type, line, column, -1, -1, value);
    }

    public MipsSymbol(int type, int line, int column, int left, int right, Object value) {
        super(type, left, right, value);
        this.tipo = tipo;
    }

    

    public String toString() {
        return "sym: "
                + sym
                + (value == null ? "" : (", value: '" + value + "'"));
    }
}