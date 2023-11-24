package main;

import java_cup.runtime.*;

%%
%class MipsLexer
%unicode
%cup
%line
%column


%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}



LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Identifier = [:jletter:] [:jletterdigit:]*

DecIntegerLiteral = 0 | [1-9][0-9]*


%%
// Keywords
"add"           { return INST_ADD; }   
"addi"          { return INST_ADDI; }
"sub"           { return INST_SUB; }
"slt"           { return INST_SLT; }
"sltu"          { return INST_SLTU; }
"beq"           { return INST_BEQ; }
"bne"           { return INST_BNE; }
"j"             { return INST_J; }
"jal"           { return INST_JAL; }
"li"            { return INST_LI; }
"la"            { return INST_LA; }
"lw"            { return INST_LW; }
"sw"            { return INST_SW; }
"move"          { return INST_MOVE; }
"mfhi"          { return INST_MFHI; }
"mthi"          { return INST_MTHI; }
"syscall"       { return INST_SYSCALL; }

// Registers
"$t0"           { return REG_T0; }
"$t1"           { return REG_T1; }
"$t2"           { return REG_T2; }
"$t3"           { return REG_T3; }
"$s0"           { return REG_S0; }
"$s1"           { return REG_S1; }
"$s2"           { return REG_S2; }
"$s3"           { return REG_S3; }
"$a0"           { return REG_A0; }
"$a1"           { return REG_A1; }
"$a2"           { return REG_A2; }
"$a3"           { return REG_A3; }
"$v0"           { return REG_V0; }
"$v1"           { return REG_V1; }

// Integers
[0-9]+        { return INT_LITERAL; }

// Identifiers
[a-zA-Z_][a-zA-Z0-9_]* { return IDENTIFIER; }

    /* comments */
{Comment}                      { /* ignore */ }
    
    /* whitespace */
{WhiteSpace}                   { /* ignore */ }

/* error fallback */
[^]                              { throw new Error("Illegal character <"+
                                                    yytext()+">"); }