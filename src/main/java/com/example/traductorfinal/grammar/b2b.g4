grammar b2b;

/*
                        ANALISIS SEMANTICO(PARSER)

    Todas las reglas gramaticales tienen un identificador que empieza por minuscula

*/

root: command* EOF;

command : gramar_excecution
        | execution_control
        | variables_expressions
        | arithmetic_logic
        | files
        | directories
        ;

//GRAMMAR AND EXCECUTION
gramar_excecution: bash
                 | echo
                 | read
                 | sleep
                 | cat
                 | comments
                 | comment_lines
                 ;
//bash
bash: PR_bash END_OF_LINE?;

//echo
echo: PR_echo END_OF_LINE?;

//read
read: PR_read ID END_OF_LINE?;

//sleep
sleep: PR_sleep (NUMERO | ID) END_OF_LINE?;

//cat
cat: PR_cat GT? paths END_OF_LINE?;

//cd
cd: PR_cd (ID '/' | opt=('..' | '.'));

//comments
comments: COMMENT END_OF_LINE?;
comment_lines: COMMENT_MUL;

//VARIABLES AND EXPRESSIONS
variables_expressions: var
                     | nill
                     ;

//instanciacion de variables ¿por que 'a' no encaja en ID? wat tf
var: ID EQ value END_OF_LINE?;
value: NUMERO
     | SQ_WORD
     | DQ_WORD
     | ID
     | '$((' ID '+' NUMERO '))'
     ;

//null
nill: PR_null;

//ARITHMETIC AND LOGIC
arithmetic_logic: boolean_val
                | logical_operators
                ;
//boolean
boolean_val: PR_true
           | PR_false
           ;
//logical operators
logical_operators: AND
                 | OR
                 | NOT
                 ;
//value arit_expr
arit_expr:    arit_expr op=(MULT | DIV | MOD) arit_expr            #MultDivExpr
            | MENOS arit_expr                                      #MenosExpr
            | arit_expr op=(MAS | MENOS) arit_expr                 #SumResExpr
            | arit_expr op=(LT | GT | LOET | GOET) arit_expr       #CompExpr
            | arit_expr AND arit_expr                              #AndExpr
            | arit_expr OR arit_expr                               #OrExpr
            | op=(NUMERO | SQ_WORD | DQ_WORD | ID)                 #NumExpr
            | var                                                  #VarExpr
            | L_BR arit_expr R_BR                                  #ParentExpr
            | boolean_val                                          #BooleanExpr
            ;

//STRINGS
//REGEX
//DATES AND TIME
//FUNCTIONS
//EXECUTION CONTROL
execution_control: b_if
                 | b_while
                 | b_for
                 ;
//if
b_if: if1 if2 if3 if4;
if1: PR_if L_SQUAREBR arit_expr R_SQUAREBR SEMIC;
if2: PR_then END_OF_LINE command*;
if3: (if3a if3b)*;
if3a: PR_elif L_SQUAREBR arit_expr R_SQUAREBR SEMIC;
if3b: PR_then END_OF_LINE command*;
if4: (PR_else END_OF_LINE command*)? PR_fi END_OF_LINE?;

//while
b_while: while1 while2;
while1: PR_while END_OF_LINE;
while2: PR_do END_OF_LINE command* PR_done END_OF_LINE?;

//for
b_for: for1 for2 for3 for4;
for1: PR_for L_BR L_BR arit_expr SEMIC;
for2: arit_expr SEMIC;
for3: arit_expr R_BR R_BR END_OF_LINE;
for4: PR_do END_OF_LINE command* PR_done END_OF_LINE?;

//FILES
files: touch
     | file_size
     | copy_rename
     | remove
     ;

//touch
touch: PR_touch paths END_OF_LINE?;

//filezise
file_size: PR_file_ls paths END_OF_LINE?;

//copy or rename file
copy_rename: opt=('cp' | 'mv') paths paths END_OF_LINE?;

//remove file
remove: PR_remove paths END_OF_LINE?;
//el token FILENAME DEBE emparejar tambien rutas de archivos

//DIRECTORIES
directories: mkdir;

mkdir: PR_mkdir OPMK? (DIR | ID) END_OF_LINE?;

paths: PATH_FILE | FILENAME;
/*
                        ANALISIS LEXICO(LEXER)

    Todos los tokens, palabras reservadas y reglas lexicas tienen un
    identificador que empieza por mayuscula

*/

//TOKENS

OPMK: '-p ~';
OR: '||';
AND: '&&';
AMP: '&';
SEMIC: ';';
DOUBLE_SEMIC: ';;';
SEMIAMP: ';&';
DOUBLE_SEMIAMP: ';;&';
PIPE: '|';
PIPEAMP: '|&';
L_BR: '(';
R_BR: ')';
L_SQUAREBR: '[';
R_SQUAREBR: ']';
L_CURLYBR: '{';
R_CURLYBR: '}';
LT: '<';
GT: '>';
EQ: '=';
NE: '!=';
GOET: '>=';
LOET: '<=';
NOT: '!';
MULT: '*';
DIV: '/';
MOD: '%';
MAS: '+';
MENOS: '-';

//quotes
DOUBLE_QUOTE: '"';
SINGLE_QUOTE: '\'';
BACKSLASH: '\\';


//PALABRAS RESERVADAS DE SHELL

//condicionales
PR_if: 'if';
PR_then: 'then';
PR_elif: 'elif';
PR_else: 'else';
PR_fi: 'fi';
PR_time: 'time';

//estructuras de control
PR_for: 'for';
PR_in: 'in';
PR_until: 'until';
PR_while: 'while' ~[\n]*;
PR_do: 'do';
PR_done: 'done';

//otros
PR_case: 'case';
PR_esac: 'esac';
PR_coproc: 'coproc';
PR_select: 'select';
PR_function: 'function';
PR_Lsquarebracket: '[[';
PR_Rsquarebracket: ']]';
PR_true: 'true';
PR_false: 'false';
PR_null: '\'\'';
PR_echo: 'echo' ~[\n]*;
PR_bash: 'bash' ~[\n]*;
PR_read: 'read';
PR_sleep: 'sleep';
PR_cat: 'cat';
PR_touch: 'touch';
PR_file_ls:'ls -l';
PR_remove:'rm';
PR_mkdir: 'mkdir';
PR_cd: 'cd';
END_OF_LINE: [\n];

//REGLAS LEXICAS (Poner más arriba las reglas menos genericas o que menos matches tienen)
// por ejemplo, poner la regla para una palabra reservada antes de la regla para un identificador
//EXT: [.][a-zA-Z0-9]+;
//WORDS

NUMERO: [0-9]+([.][0-9]+)?;
ID: [a-zA-Z$][a-zA-Z0-9_]*;
DIR: ([a-zA-Z$][a-zA-Z0-9_$]*'/')*[a-zA-Z0-9]+;
PATH_FILE: ([a-zA-Z][a-zA-Z0-9_]*'/')+[.][a-zA-Z0-9]+;
FILENAME: [a-zA-Z][a-zA-Z0-9_]*[.][a-zA-Z0-9]+; //donde se requiere un filename poner (filename | id)?
SQ_WORD: '\'' ( '\\"' | . )*? '\'' ;
DQ_WORD: '"' ( '\\"' | . )*? '"' ;
COMMENT: '#' ~[\r\n]*;
COMMENT_MUL: '<<EOF' (.)*? 'EOF';
WS		: [ \t\r]+ -> skip ;
//DIFF: ~[\n]*;
