       Identification Division.
       Program-ID. testantlr022.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr022'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.

      *

       COPY 'testantlr005.cpy' REPLACING ==:PRFX:== BY ==AA-==
       .
       

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


