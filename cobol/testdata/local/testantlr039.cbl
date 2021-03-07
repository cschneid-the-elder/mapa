       Identification Division.
       Program-ID. testantlr039.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr039'.
           >>EVALUATE X
           >>WHEN 3
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           >>WHEN OTHER
           05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.
           >>END-EVALUATE

      *

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           CALL PGM-0001

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


