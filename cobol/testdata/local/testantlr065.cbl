       Identification Division.
       Program-ID. testantlr065.
       Environment Division.
       Configuration Section.
       Special-Names.
           Currency Sign Is '!' With Picture Symbol '_'
           .
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr065'.
           05  PGM1                 Picture X(008) VALUE 'PGM00001'.

      * 

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           CALL PGM1

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           .

