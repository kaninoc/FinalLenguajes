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
        ;

//GRAMMAR AND EXCECUTION
gramar_excecution: dash
                 | echo
                 | read
                 | comments
                 | comment_lines
                 ;
//dash
dash: dash1 dash2 END_OF_LINE?;
dash1: 'dash' dashargs*;
dash2: (FILENAME | '\'' command '\'')?;
dashargs: arg=('-c' | '-a' | '-s');

//echo
echo: PR_echo END_OF_LINE?;

//comments
comments: COMMENT;
comment_lines: COMMENT_MUL;

//read
read: PR_read ID END_OF_LINE?;

//VARIABLES AND EXPRESSIONS
variables_expressions: var
                     | nill
                     ;

//instanciacion de variables ¿por que 'a' no encaja en ID? wat tf
var: ID EQ value END_OF_LINE?;
value: NUMERO
     | SQ_WORD
     | DQ_WORD
     | '$'ID
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
/*
arit_expr:    NEG arit_expr                                                                                 #NegExpr
            | arit_expr op=(MULT | DIV | MOD) arit_expr                                                     #MultDivExpr
            | MENOS arit_expr                                                                               #MenosExpr
            | arit_expr op=(MAS | MENOS) arit_expr                                                          #SumResExpr
            | arit_expr op=(MENOR | MAYOR | MENOR_IGUAL | MAYOR_IGUAL) arit_expr                            #CompExpr
            | arit_expr op=(IGUAL | DIF) arit_expr                                                          #EqExpr
            | arit_expr AND arit_expr                                                                       #AndExpr
            | arit_expr OR arit_expr                                                                        #OrExpr
            | op=(ENTERO | REAL | CHAR | STRING | PR_verdadero | PR_falso)                                  #NumExpr
            | var                                                                                           #VarExpr
            | callfun                                                                                       #FunExpr
            | PAR_IZQ arit_expr PAR_DER                                                                     #ParentExpr
            ;
*/

//STRINGS
//REGEX
//DATES AND TIME
//FUNCTIONS
//EXECUTION CONTROL
execution_control: b_if
                 | b_while
                 | b_for
                 | b_until
                 ;
//if
b_if: if1 if2 if3 if4;
if1: PR_if L_SQUAREBR command R_SQUAREBR SEMIC;
if2: PR_then END_OF_LINE command;
if3: (if3a if3b)*;
if3a: PR_elif L_SQUAREBR command R_SQUAREBR SEMIC;
if3b: PR_then END_OF_LINE command;
if4: (PR_else END_OF_LINE command)? PR_fi END_OF_LINE?;

//while
b_while: while1 while2;
while1: PR_while L_SQUAREBR command R_SQUAREBR SEMIC END_OF_LINE;
while2: PR_do END_OF_LINE command+ PR_done END_OF_LINE?;

//for
b_for: PR_for L_BR L_BR expr SEMIC expr SeMIC expr R_BR R_BR
       PR_do command SEMIC
       PR_done
       ;
expr: command; //esto toca arreglarlo lol
//until
b_until: PR_until L_SQUAREBR command R_SQUAREBR SEMIC
         PR_do command SEMIC
         PR_done
         ;

//EXCEPTIONS
//CONCURRENCY
//STREAMS
//FILES
//DIRECTORIES
//PROCESSES AND ENVIRONMENT
//LIBRARIES AND NAMESPACES
//REFLECTION
//DEBUGGING AND PROFILING

/*
                        ANALISIS LEXICO(LEXER)

    Todos los tokens, palabras reservadas y reglas lexicas tienen un
    identificador que empieza por mayuscula

*/

//TOKENS

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
PR_while: 'while';
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
PR_read: 'read';
END_OF_LINE: [\n];

//REGLAS LEXICAS (Poner más arriba las reglas menos genericas o que menos matches tienen)
// por ejemplo, poner la regla para una palabra reservada antes de la regla para un identificador
//EXT: [.][a-zA-Z0-9]+;
//WORDS

NUMERO: [0-9]+([.][0-9]+)?;
ID: [a-zA-Z][a-zA-Z0-9_]*;
FILENAME: [a-zA-Z][a-zA-Z0-9_]*[.][a-zA-Z0-9]+;
SQ_WORD: '\'' ( '\\"' | . )*? '\'' ;
DQ_WORD: '"' ( '\\"' | . )*? '"' ;
COMMENT: '#' ~[\r]*;
COMMENT_MUL: '<<EOF' (.)*? 'EOF';
WS		: [ \t\r]+ -> skip ;
//DIFF: ~[\n]*;
