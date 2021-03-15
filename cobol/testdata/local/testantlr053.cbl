       ID Division.
       Program-ID. testantlr053.
       Procedure Division.

           >>DEFINE A B'1'
           >>DEFINE B B'0'
           >>DEFINE C B'1'
           >>DEFINE D B'0'

           >>IF A AND B
           CALL 'PGM00001'
           >>END-IF

           >>IF (((((A AND B)))))
           CALL 'PGM00002'
           >>END-IF

           >>IF A AND (B OR C)
           CALL 'PGM00003'
           >>END-IF

           >>IF (A AND B) OR D
           CALL 'PGM00004'
           >>END-IF

           >>IF A AND (B AND (C OR D))
           CALL 'PGM00005'
           >>END-IF

           >>IF B AND (C OR D)
           CALL 'PGM00006'
           >>END-IF

           >>IF (B AND C) OR D
           CALL 'PGM00007'
           >>END-IF

           >>IF A AND (B OR C) AND D
           CALL 'PGM00008'
           >>END-IF

           >>IF (A OR D) AND (B OR C)
           CALL 'PGM00009'
           >>END-IF

           GOBACK.
