grammar TaskrGrammar;

prog: entries* EOF;

entries: entry NEWLINE
       | comment NEWLINE
       ;

entry: task description date
     | event description date
     | note description
     ;

comment: '//' description;

task: 't' modifier ':';

event: 'e' modifier ':';

note: 'n:';

date: ';' day month year
    |
    ;

modifier: '('status')'
        |
        ;

status: ('later'|'tomorrow'|'done');

day        : DIGIT (DIGIT)?;
month      : WORD;
year       : DIGIT DIGIT DIGIT DIGIT;

description: (WORD|PUNCTUATION|DIGIT)+;

// basic tokens
NEWLINE     :   [\n]              ;
DIGIT       :   [0-9]             ;
WORD        :   [a-zA-Z]+         ;
PUNCTUATION :   [.,?!'"]          ;
WS          :   [ \t]+ -> skip    ; // tells ANTLR to ignore these
