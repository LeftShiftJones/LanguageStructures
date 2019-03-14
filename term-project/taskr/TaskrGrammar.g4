grammar TaskrGrammar;

prog: entries* EOF;

entries: entry NEWLINE
       ;

entry: task description ';' date (NEWLINE subtask)*
     | event description ';' date
     | note description
     ;

task: 't' modifier ':';

subtask: 't' ':' description (NEWLINE note description)*;

event: 'e' modifier ':';

note: 'n:';

date: day month year repeat
    |
    ;

repeat: '['interval date']'
      |
      ;

modifier: '('status')'
        |
        ;

status: ('later'|'tomorrow'|'done');

interval: ('d'|'w'|'m'|'y'|'n' DIGIT+);

day        : DIGIT (DIGIT)?;
month      : WORD;
year       : DIGIT DIGIT DIGIT DIGIT;

description: (WORD|PUNCTUATION|DIGIT)+;


// comments
LINE_COMMENT:   '//' .*? '\r'? '\n' -> skip ;

// basic tokens
NEWLINE     :   [\n\r]            ;
DIGIT       :   [0-9]             ;
WORD        :   [a-zA-Z]+         ;
PUNCTUATION :   [.,?!'"]          ;
WS          :   [ \t]+ -> skip      ; // tells ANTLR to ignore these
