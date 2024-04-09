package main;

import java_cup.runtime.*;

%%

%public
%class MipsLexer
%implements sym
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

 /* Matching Registers */
REGISTER = (\$(zero|at|gp|sp|fp|ra|[kv][0-1]|a[0-3]|t[0-9]|s[0-7]))
 
 /* Matching Immediates (signed integers) */
/*IMMEDIATE = (?:0|[-|+]?[1-9][0-9]*) */
IMMEDIATE = (0|[-+]?[1-9][0-9]*)

 
 /* Register instructions */
R_INSTRUCTION = ("add"|"sub"|"mul"|"div"|"and"|"or"|"xor"|"nor"|"slt"|"sll"|"srl"|"sra")
 
 /* Immediate instructions */
I_INSTRUCTION = ("addi"|"subi"|"andi"|"ori"|"xori")
I_MEM_INSTRUCTION = ("lw"|"sw"|"lh"|"sh"|"lb"|"sb")
 
 /* Jump instructions */
J_INSTRUCTION = ("j"|"jal"|"jr"|"beq"|"bneq"|"bltz")

PS_LA_LI_INSTRUCTION =("li"|"la")

 /* Pseudo instructions */
PS_INSTRUCTION = ("seq"|"sge"|"sgt"|"sle"|"sne"|"beqz"|"bnez"|"bge"|"bgt"|"ble")

SYSCALL = ("syscall")

/* Labels */
LABEL = [a-zA-Z_][a-zA-Z_0-9]*
LABEL_DEF = {LABEL} ":"

/* Data types */
DATA_TYPES =  (\.(word|space))

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

EndOfLineComment     = "#" {InputCharacter}* {LineTerminator}?

%%

// Keywords

<YYINITIAL> {

    {R_INSTRUCTION}		    { return symbol(ROPCODE, yytext()); }
    {J_INSTRUCTION}		    { return symbol(JOPCODE, yytext()); }
    {I_INSTRUCTION}		    { return symbol(IOPCODE, yytext()); }
    {I_MEM_INSTRUCTION}	    { return symbol(IMOPCODE, yytext()); }
    {PS_LA_LI_INSTRUCTION}  { return symbol(LALIOPCODE, yytext()); }
    {PS_INSTRUCTION}	    { return symbol(PSOPCODE, yytext()); }


    {REGISTER}	            { return symbol(REGISTER, yytext()); }
    {IMMEDIATE}	            { return symbol(IMMEDIATE, yytext()); }

    {SYSCALL}                { return symbol(SYSCALL, yytext()); }

    {LABEL}                 { return symbol(LABEL, yytext()); }
    {LABEL_DEF}             { return symbol(LABEL_DEF, yytext()); }


    {DATA_TYPES}            { return symbol(DATA_TYPE, yytext()); }

    
    {EndOfLineComment}      { /* ignore */ }

    {WhiteSpace}            { /* ignore */ }

    \.text                  { return symbol(DOT_TEXT); }
    \.data                  { return symbol(DOT_DATA); }

    \(						{ return symbol(OBRACKET, yytext()); }
    \)						{ return symbol(CBRACKET, yytext()); }
    ","                     { /* return symbol(COMMA); */ }

}

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }