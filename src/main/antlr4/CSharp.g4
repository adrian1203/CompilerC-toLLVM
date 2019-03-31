grammar CSharp;

/*
 * Parser Rules
 */

program: statement+;

statement : declarationList | assignment;

declarationList : declaration | declarationList declaration;

declaration : (variableDec | arrayDec) Semicolon;

variableDec : varType VarName;

arrayDec : varType VarName SquareOpenBracket SquareCloseBracket (SquareOpenBracket SquareCloseBracket)*;

arrayVal : VarName SquareOpenBracket Integer SquareCloseBracket ((SquareOpenBracket Integer SquareCloseBracket)*);

varType : IntegerType | FloatType | StringType | BooleanType | CharType;


value : (VarName | arrayVal | Integer | Float | String |  CharAss ) (MathOperator (VarName | arrayVal | Integer | Float | String| CharAss ))*;

assignment : IntegerType VarName EqualMark Integer Semicolon |
             FloatType VarName EqualMark Float Semicolon |
             CharType VarName EqualMark CharAss Semicolon |
             BooleanType VarName EqualMark Boolean Semicolon |
            StringType VarName EqualMark String Semicolon;

Integer : Digit+;

Float : Integer Dot Integer;

String : QuoteMark CharSequence QuoteMark;

CharAss: Apostrophe (Char|Digit) Apostrophe;

WhiteSpace : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
SpecialChars : '!' | '@' | '#' | '$' | '%' | '^' | '&' | '_' | ',' | '/' |'?';
fragment Digit : [0-9];
fragment Char : [a-z] ;             // match lower-case identifiers
fragment CharSequence : Char+;



MathOperator : '+' | '-' | '*' | '/';
BooleanOperator : '<'|'<='|'>'|'>='|'=='|'!=';
LogicalOperator : 'and' | 'or';
Boolean : 'true' | 'false';
If : 'if';
Elsif: 'elsif';
Else: 'else';
Then: 'then';
IntegerType: 'int';
FloatType: 'float';
StringType: 'string';
BooleanType :'bool' | 'boolean';
CharType: 'char';
VarName : Char (Char | Digit)*;
EqualMark : '=' ;
Dot : '.';
QuoteMark : '"';
Semicolon :';';
OpenBracket : '(';
CloseBracket : ')';
SquareOpenBracket : '[';
SquareCloseBracket : ']';
Apostrophe: '\'';

Text : (Char)* ;
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;





