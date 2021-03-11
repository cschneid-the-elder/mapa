       ID Division.
       Program-ID. test9010.
       Procedure Division.

       >>DEFINE A 1
       >>DEFINE B 2
       >>DEFINE C 3
       >>DEFINE D A + B * C
       >>DEFINE E (A + B) * C
       >>DEFINE F A + (B * C)

           >>EVALUATE D
           >>WHEN 9
           CALL 'D#IS#9'
           >>WHEN 7
           CALL 'D#IS#7'
           >>WHEN OTHER
           CALL 'WHATTHE#'
           >>END-EVALUATE

           >>EVALUATE E
           >>WHEN 9
           CALL 'E#IS#9'
           >>WHEN 7
           CALL 'E#IS#7'
           >>WHEN OTHER
           CALL 'WHATTHE#'
           >>END-EVALUATE

           >>EVALUATE F
           >>WHEN 9
           CALL 'F#IS#9'
           >>WHEN 7
           CALL 'F#IS#7'
           >>WHEN OTHER
           CALL 'WHATTHE#'
           >>END-EVALUATE


           GOBACK.
