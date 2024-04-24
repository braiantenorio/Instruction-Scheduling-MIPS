package main;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import java.util.List;

public class DAGBuilder {
    public static Graph<Instruction, DefaultEdge> buildDAG(List<Instruction> instructions) {
        Graph<Instruction, DefaultEdge> DAG = new SimpleDirectedGraph<>(DefaultEdge.class);

        // Agregar nodos al DAG
        for (Instruction instruction : instructions) {
            DAG.addVertex(instruction);
        }

        // Agregar arcos basados en dependencias RAW, WAR y WAW
        // recorre todas las posibilidades
        for (int i = 0; i < instructions.size(); i++) {
            for (int j = i + 1; j < instructions.size(); j++) {
                Instruction instI = instructions.get(i);
                Instruction instJ = instructions.get(j);

                // Dependencia RAW 
                for (String writeRegister : instI.getWriteRegisters()) {
                    if (instJ.getReadRegisters().contains(writeRegister)) {
                        DAG.addEdge(instI, instJ);
                    }
                }

                // Dependencia WAR 
                for (String readRegister : instI.getReadRegisters()) {
                    if (instJ.getWriteRegisters().contains(readRegister)) {
                        DAG.addEdge(instI, instJ);
                    }
                }

                // Dependencia WAW 
                for (String writeRegister : instI.getWriteRegisters()) {
                    if (instJ.getWriteRegisters().contains(writeRegister)) {
                        DAG.addEdge(instI, instJ);
                    }
                }
            }
        }

        return DAG;
    }
}
