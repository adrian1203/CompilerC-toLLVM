grammar CSharp;

/*
 * Parser Rules
 */

program: statement+;

statement: decl | procedure;

decl :  ('int' | 'float') ID+';'|
        'int' ID EQUAL INT SEMICOLON|
        'float' ID EQUAL FLOAT SEMICOLON

       ;

DATATYPE : 'int'  | 'float';
procedure : 'show' (ID | INT);
ID   : ('a'..'z' | 'A'..'Z')+;
INT  : '0'..'9'+;
FLOAT : '0'..'9'+'.''0'..'9'+;
COMA: ',';
SEMICOLON:';';
EQUAL: '=';