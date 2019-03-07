grammar TaskerGrammar;

prog: EOF;

// terminal tokens
MOD     :   'MOD'               ;
DIGIT   :   [0-9]               ;
LETTER  :   [a-zA-Z]            ;
WS      :   [ \t\n]+ -> skip    ; // tells ANTLR to ignore these