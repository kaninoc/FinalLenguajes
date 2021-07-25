grammar lenguaje;

//gramatica de Psicoder
//desde la raiz de determina si es principal funcion o estructura
raiz : (estructuras | decfuncion)* (f_principal) (estructuras | decfuncion)* EOF;
f_principal: FP contenido+ FFP;
//llena con cada una de las distintas intrucciones que pueden estar dentro de una función
contenido: declaracion | lectura | imprimir | condicional | ciclomientras | ciclohacer | ciclopara | multiple | asigfuncion ;

//declaracion y asignacion de todas las posibles variables
declaracion: varBooleano | varEntero | varReal | varCaracter | varCadena | varEstructura | varAsigEstructura | varDeclarada;
varBooleano : BOOLEANO ID extvarB;//declaraciones para variables de tipo booleano
extvarB : TK_PYC | TK_ASIG TK_BOOLEANO extvarB | TK_COMA ID extvarB;  //multiples variables y asignaciones booleano
varEntero : ENTERO ID extvarE;//declaraciones para variables de tipo entero
extvarE : TK_PYC | TK_ASIG TK_MENOS? TK_ENTERO extvarE | TK_COMA ID extvarE;  //multiples variables y asignaciones entero
varReal : REAL ID extvarR;//declaraciones para variables de tipo real
extvarR : TK_PYC | TK_ASIG TK_MENOS? TK_REAL extvarR | TK_COMA ID extvarR;  //multiples variables y asignaciones real
varCaracter : CARACTER ID extvarC;//declaraciones para variables de tipo caracter
extvarC : TK_PYC | TK_ASIG TK_CARACTER extvarC | TK_COMA ID extvarC; //multiples variables y asignaciones caracter
varCadena : CADENA ID extvarS;//declaraciones para variables de tipo cadena
extvarS : TK_PYC | TK_ASIG TK_CADENA extvarS | TK_COMA ID extvarS;//multiples variables y asignaciones cadena
varEstructura : ID ID extvarEstructura;//declaraciones para variables de Estructura
extvarEstructura : TK_PYC | TK_COMA ID extvarEstructura;//multiples variables de Estructuras ######extvarEstructura : TK_PYC | TK_COMA ID varimpresion extvarEstructura;
varAsigEstructura : ID TK_PUNTO ID (TK_PUNTO ID)* TK_ASIG varimpresion TK_PYC; //Asignacion de variables estructuras
varDeclarada : ID TK_ASIG varimpresion TK_PYC; //asigna valores a id ya declaradas
asigfuncion : ID TK_PAR_IZQ (varimpresion (repeticion)*)? TK_PAR_DER TK_PYC?;//carga variables de funciones resueltas
repeticion : TK_COMA varimpresion;//multiples parametros de funcion

//logica de parentesis y operadores que se usan para crear una operacion coherente
operacion : expresion (operador expresion)*;
expresion : tipovar | TK_PAR_IZQ operacion TK_PAR_DER;
operador : TK_MAS | TK_MENOS | TK_MULT | TK_DIV | TK_MOD;
tipovar : TK_MENOS?(TK_ENTERO | TK_REAL | ID) ;

//logica de lectura de datos por consola
lectura: LEER TK_PAR_IZQ ID TK_PAR_DER TK_PYC ;

//logica de impresion de datos por consola
imprimir: IMPRIMIR TK_PAR_IZQ impresion TK_PAR_DER TK_PYC ;
impresion: varimpresion (repeticionimpresion)*;
repeticionimpresion: TK_COMA varimpresion;
varimpresion: TK_BOOLEANO | TK_ENTERO | TK_REAL | TK_CARACTER | TK_CADENA | operacion | ID | asigfuncion;

//condiciones para declarar un if
condicional : SI operacionlogica cuerpoif ;
cuerpoif : ENTONCES contenido+ sino;
sino : (SI_NO contenido+)? FIN_SI;
operacionlogica : TK_PAR_IZQ  varimpresion  comparador varimpresion (operadorlogico varimpresion  comparador varimpresion )? TK_PAR_DER;

//tokens referentes a operaciones logicas
operadorlogico: TK_Y | TK_O;
comparador: TK_MENOR | TK_MAYOR | TK_MENOR_IGUAL | TK_MAYOR_IGUAL | TK_IGUAL | TK_DIF;

//ciclo mientras
ciclomientras : MIENTRAS operacionlogica cuerpociclomientras;
cuerpociclomientras: HACER contenido+ FIN_MIENTRAS ;
//ciclo hacer
ciclohacer : HACER contenido+ cuerpociclohacer;
cuerpociclohacer: MIENTRAS operacionlogica TK_PYC;
//ciclo para
ciclopara : PARA elementospara contenidopara;
contenidopara :HACER contenido+ FIN_PARA contparaopt?;
contparaopt :PARA elementosparados contparaoptfinal;
contparaoptfinal : HACER contenido+ FIN_PARA;
elementospara: TK_PAR_IZQ ENTERO ID TK_ASIG TK_ENTERO TK_PYC comparadorpara complementopara;
complementopara: TK_PYC varcomparable TK_PAR_DER;
elementosparados: TK_PAR_IZQ ID TK_ASIG TK_ENTERO TK_PYC comparadorpara complementopara;
comparadorpara : ID credec varcomparable segundocomparador?;
segundocomparador: operadorlogico segcomfinal;
segcomfinal: ID credec varcomparable;
varcomparable : (ID | TK_ENTERO);
credec : (TK_MENOR | TK_MAYOR | TK_MENOR_IGUAL | TK_MAYOR_IGUAL) ;

//seleccion multiple
multiple : SELECCIONAR TK_PAR_IZQ ID TK_PAR_DER ENTRE casos FIN_SELECCIONAR;
casos : multiplescasos+ defecto? | defecto;
multiplescasos: (CASO TK_ENTERO TK_DOSP contenido+ (ROMPER TK_PYC)?);
defecto: DEFECTO TK_DOSP contenido*;

//declaracion y asignacion de estructuras
estructuras : ESTRUCTURA ID declaracion+ FIN_ESTRUCTURA ;

//declaracion de funciones
decfuncion : FUNCION tipofuncion ID TK_PAR_IZQ parametros cierredecfuncion;
cierredecfuncion : TK_PAR_DER cuerpodecfuncion;
cuerpodecfuncion : HACER contenido* retornar;
retornar : RETORNAR varimpresion TK_PYC FIN_FUNCION;
parametros : tipofuncion complementoparametros?;
complementoparametros : ID masparametros*;
masparametros : TK_COMA tipofuncion nextid;
nextid : ID;
tipofuncion : BOOLEANO | ENTERO | REAL | CARACTER | CADENA;

//token de palabras y simbolos reservadas
FP : 'funcion_principal';
FFP : 'fin_principal';
LEER :'leer';
IMPRIMIR : 'imprimir';
SI : 'si';
ENTONCES: 'entonces';
FIN_SI : 'fin_si';
SI_NO: 'si_no';
MIENTRAS : 'mientras';
HACER: 'hacer';
FIN_MIENTRAS : 'fin_mientras';
PARA : 'para';
FIN_PARA : 'fin_para';
SELECCIONAR : 'seleccionar';
ENTRE : 'entre';
CASO : 'caso';
ROMPER: 'romper';
DEFECTO : 'defecto';
FIN_SELECCIONAR : 'fin_seleccionar' ;
ESTRUCTURA : 'estructura' ;
FIN_ESTRUCTURA : 'fin_estructura' ;
FUNCION : 'funcion';
RETORNAR : 'retornar';
FIN_FUNCION : 'fin_funcion';
BOOLEANO : 'booleano';
ENTERO : 'entero';
REAL : 'real';
CARACTER :'caracter';
CADENA : 'cadena';
TK_PYC : ';';
TK_DOSP : ':';
TK_ASIG : '=';
TK_COMA : ',';
TK_PUNTO : '.';
TK_MAS : '+';
TK_MENOS : '-';
TK_MULT : '*';
TK_DIV : '/';
TK_MOD : '%';
TK_PAR_IZQ : '(';
TK_PAR_DER : ')';
TK_Y : '&&';
TK_O : '||';
TK_MENOR : '<';
TK_MAYOR : '>';
TK_MENOR_IGUAL : '<=';
TK_MAYOR_IGUAL : '>=';
TK_IGUAL : '==';
TK_DIF : '!=';


TK_BOOLEANO : ( 'falso' | 'verdadero');
ID :[A-Za-z_]+[0-9]*;
TK_ENTERO: (('0'..'9') | (('1'..'9')('0'..'9')+));
TK_REAL: (('0'..'9') | (('1'..'9')('0'..'9')+))[.]('0'..'9')+;
TK_CADENA: '"'[a-zA-Z0-9_ \t\r\n]+'"';
TK_CARACTER:'\''[a-zA-Z0-9_ \t\r\n]'\'';
ESP : [ \t\r\n]+ -> skip;
COMMENT : ('//' .*? '\n') -> skip ;
COMMENTS : ('/*' .*? '*/')  -> skip ;
