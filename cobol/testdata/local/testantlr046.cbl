       Identification Division.
       Program-ID. testantlr046.
       Data Division.
       Working-Storage Section.

       >>DEFINE A 2
       >>DEFINE B 3
       >>DEFINE C A + B
       >>DEFINE D A * B
       >>DEFINE E (D * A) / 3

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr046'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.
           05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.

      *

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           >>EVALUATE TRUE
           >>WHEN C = 5
           CALL PGM-0001 USING
             MYNAME
           END-CALL
           >>WHEN D = 6
           CALL PGM-0002
             MYNAME
           END-CALL
           >>WHEN E = 4
           CALL PGM-0003
             MYNAME
           END-CALL
           >>WHEN OTHER
           CALL PGM-0009
             MYNAME
           END-CALL
           >>END-EVALUATE

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


