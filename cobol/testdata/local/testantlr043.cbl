       Identification Division.
       Program-ID. testantlr043.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr043'.
           >>EVALUATE TRUE
           >>WHEN X = 1
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           >>WHEN X = 2
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.
           >>WHEN X = 3
           05  PGM-0001             PIC X(008) VALUE 'PGMA0003'.
           >>WHEN OTHER
           05  PGM-0001             PIC X(008) VALUE 'PGMA0009'.
           >>END-EVALUATE

      *

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           CALL PGM-0001

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


