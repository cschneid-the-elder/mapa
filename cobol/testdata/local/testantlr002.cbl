       Identification Division.
       Program-ID. testantlr002.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr002'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           CALL 'PGMA0001'
           
           GOBACK
           .


