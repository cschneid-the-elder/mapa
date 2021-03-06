       Identification Division.
       Program-ID. testantlr035.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr035'.
           >>IF X DEFINED
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           >>ELSE
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.
           >>END-IF

      *

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           CALL PGM-0001

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

