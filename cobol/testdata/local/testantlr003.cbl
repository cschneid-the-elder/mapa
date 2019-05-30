       Identification Division.
       Program-ID. testantlr003.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr003'.
 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           CALL 'PGMA0001' USING MYNAME

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           .

