grammar Juego;

juego: 'juego' ID '{' escenas '}';

escenas: escena+;

escena: 'escena' ID '{' acciones '}';

acciones: accion+;

accion
    : imprimir
    | leer
    | condicion
    | saltar
    ;

imprimir: 'mostrar' STRING ';';

leer: 'leer' ID ';';

condicion: 'si' comparacion 'saltar' ID ';';

comparacion: ID '==' valor;

valor: STRING | NUMBER;

saltar: 'saltar' ID ';';

ID: [a-zA-Z]+;
STRING: '"' .*? '"';
NUMBER: [0-9]+;

WS: [ \t\r\n]+ -> skip;