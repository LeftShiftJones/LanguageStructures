grammar TaskrGrammar;

prog: entries* EOF;

entries: entry NEWLINE
       ;

entry: (task description ';' date
     | event description ';' date
     | note description)
     ;

task: 't' modifier ':';

event: 'e' modifier ':';

note: 'n:';

date: day month year repeat
    ;

rep_date: day month year
    ;

repeat: '['interval rep_date']'
      |
      ;

modifier: '('status')'
        |
        ;

status: ('later'|'tomorrow'|'done');

interval: ('d'|'w'|'m'|'y'); // 'n' DIGIT+

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
WS          :   [ ]+ -> skip      ; // tells ANTLR to ignore these
