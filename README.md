# Instruction-Scheduling-MIPS
## Instalacion
Navegar a la carpeta main
```
cd ~/instructionScheduling/src/main
```

para generar el analizador sintactico

```
java -jar ../../lib/java-cup-11b.jar MipsParser.cup
```

para generar el analizador lexico

```
jflex MipsLexer.flex
```


Cambiar `sym` de class a interface
