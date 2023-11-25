
%%
%class MIPSAssemblerLexer
%unicode

%{
    // Puedes agregar lógica adicional aquí si es necesario
%}

// Definición de tokens
%type <String> INSTRUCTION
%type <String> REGISTER
%type <String> IMMEDIATE
%type <String> LABEL

// Especificación de tokens
%%
"add"|"sub"|"lw"|"sw"   { return "INSTRUCTION"; }
\$[0-9]+                { return "REGISTER"; }
[0-9]+                  { return "IMMEDIATE"; }
[A-Za-z_][A-Za-z0-9_]*   { return "LABEL"; }
"[^]"                    { /* Ignorar otros caracteres */ }

// Resto del código según sea necesario
