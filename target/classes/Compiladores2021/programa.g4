grammar programa;

@header {
package Compiladores2021;
}

//   ////////                 GITHUB DEL EQUIPO                    ////////
//   ////////  https://github.com/Lucasoviedo/TrabajoEntregable1   ////////
//   ////////            Oviedo Lucas y Varella Gaspar             ////////

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];


PA   : '(' ;  //Parentesis abierto
PC   : ')' ;  //Parentesis cerrado
CA   : '[' ;  //Corchete abierto
CC   : ']' ;  //Corchete cerrado
LA   : '{' ;  //Llave abierta
LC   : '}' ;  //Llave cerrada

PYC  : ';' ;  //Punto y coma
COMA : ',' ;  //Coma

EQ   : '=' ;  //Asignacion

MEN  : '<' ;  //Menor
MENEQ: '<=';  //Menor o igual
EQL  : '==';  //Igual
MAY  : '>' ;  //Mayor
MAYEQ: '>=';  //Mayor o igual
DST  : '!=';  //Distinto

SUM  : '+' ;  //Suma
RES  : '-' ;  //Resta
MUL  : '*' ;  //Multiplicacion
DIV  : '/' ;  //Division
MOD  : '%' ;  //Modulo o resto

INT     : 'int' ;  //Entero
CHAR    : 'char' ;  //Caracter
DOUBLE  : 'double' ;  //Double
VOID    : 'void' ;  //Vacio

ENTERO : DIGITO+;
DECIMAL : ENTERO'.'ENTERO;
CARACTER: '\''LETRA'\'';

OR   : '||' ;  //O
AND  : '&&' ;  //Y
NOT  : '!'  ;  //Negacion

IF   : 'if' ;  //If
ELSE : 'else' ;  //Else
FOR  : 'for';  //Bucle for
WHILE: 'while';  //Bucle While

ID : (LETRA | '_') (LETRA | DIGITO | '_')*;

WS : [ \n\t] -> skip ;
OTRO : . ;

programa: instrucciones ; 

instrucciones : instruccion instrucciones 
              |
              ;

bloque : LA instrucciones LC 
       ;

instruccion : declaracion PYC
            | asignacion PYC
            | ciclofor
            | ciclowhile
            | condif
            | funcion
            | llamada_funcion PYC
            | bloque
            ;

declaracion : tipodato ID
            | tipodato ID asign
            ;

asign : EQ llamada_funcion
      | EQ operacion
      ;

tipodato : INT
         | CHAR
         | DOUBLE
         | VOID
         ;

asignacion  : ID asign
            ;

ciclofor : FOR PA asignacion PYC operacion PYC ID asign PC instruccion
         ;

ciclowhile : WHILE PA operacion PC instruccion
           ;

condif : IF PA operacion PC instruccion
       | IF PA operacion PC instruccion ELSE instruccion
       ;

funcion : tipodato ID PA parametros PC bloque
        ;

parametros :  declaracion parametros
           |  COMA parametros
           |
           ;

llamada_funcion : ID PA argumentos PC
                ;

argumentos: ID argumentos
          | COMA argumentos
          |
          ;

operacion : opal ;

opal : disyuncion 
     |
     ;

disyuncion : conjuncion disy
           ;

disy : OR conjuncion disy
     |
     ;

conjuncion : comparaciones conj
           ;

conj : AND comparaciones conj
     |
     ;

comparaciones : expresion comp
              ;

comp : opcomp expresion comp
     |
     ;

opcomp : EQL
       | DST
       | MAY
       | MAYEQ
       | MEN
       | MENEQ
       ;

expresion : termino exp;

exp : SUM termino exp
    | RES termino exp
    |
    ;

termino : factor term ;

term : MUL factor term
     | DIV factor term
     | MOD factor term
     |
     ;

factor : f PA opal PC
       | f ENTERO
       | f DECIMAL
       | f CARACTER
       | f ID
       ;

f : SUM
  | RES
  | NOT
  |
  ;