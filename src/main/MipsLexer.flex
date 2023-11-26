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
I_INSTRUCTION = ("addi"|"subi"|"andi"|"ori"|"xori"|"beq"|"bneq")
I_MEM_INSTRUCTION = ("lw"|"sw"|"lh"|"sh"|"lb"|"sb")
 
 /* Jump instructions */
J_INSTRUCTION = ("j"|"jal")

%%

// Keywords

^{R_INSTRUCTION}		{ return symbol(ROPCODE, yytext()); }
^{J_INSTRUCTION}		{ return symbol(JOPCODE, yytext()); }
^{I_INSTRUCTION}		{ return symbol(IOPCODE, yytext()); }
^{I_MEM_INSTRUCTION}	{ return symbol(IMOPCODE, yytext()); }

{REGISTER}	{ return symbol(REGISTER, yytext()); }
{IMMEDIATE}	{ return symbol(IMMEDIATE, yytext()); }

\n 						{ return EOL; }
[ \t]+					{ /* Ignoring whitespaces and tabs */ }
\(						{ return symbol(OBRACKET, yytext()); }
\)						{ return symbol(CBRACKET, yytext()); }
.						{ /* manage errors bitch */ }