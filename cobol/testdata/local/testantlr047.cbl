       Identification Division.
       Program-ID. testantlr047.
       Data Division.
       Working-Storage Section.

       >>DEFINE A 2
       >>DEFINE B 3
       >>DEFINE C A + B
       >>DEFINE D A * B
       >>DEFINE E (D * A) / 3

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr047'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.
           05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.

      *

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           >>IF F DEFINED
           >>IF C = 5
           CALL PGM-0001
           >>ELSE
           CALL PGM-0009
           >>END-IF
           >>ELSE
           >>IF D = 6
           CALL PGM-0002
           >>ELSE
           CALL PGM-0009
           >>END-IF

           >>IF E = 4
           CALL PGM-0003
           >>ELSE
           CALL PGM-0009
           >>END-IF
           >>END-IF

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


