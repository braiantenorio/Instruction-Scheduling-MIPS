%%
"hola"      { printf("¡Hola Mundo!\n"); }
[a-zA-Z]+   { printf("Identificador: %s\n", yytext); }
%%
