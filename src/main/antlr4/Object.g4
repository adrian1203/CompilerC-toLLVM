grammar Object;

/* PARSER */

root: items+;

items: ('TypeId' '=' typeId) ('Name' '=' name) ('Description' '=' description)? ('Attributes' '=' attributes)? ('Flags' '=' flags)?;

typeId: NUMBER;

name: TEXT;

description: TEXT;

flags: ('{') flag+ ('}');

flag: STRING;

attributes: ('{')  attribute+ ('}');

attribute: attributeName STRING?'=' attributeValue;

attributeName: STRING;

attributeValue: NUMBER;

/* LEXER */

fragment DIGIT: ('-')? '0'..'9';

TEXT: '"' .*? '"';

STRING: ('a'..'z' | 'A'..'Z')+;

NUMBER: DIGIT+;

WHITESPACE: ' ' -> skip;

COMMA_SEPARATOR : ',' -> skip;

NEWLINE : ('\n' | '\r' | '\r\n') -> skip;

COMMENT : '#' ~( '\r' | '\n' )* -> skip;