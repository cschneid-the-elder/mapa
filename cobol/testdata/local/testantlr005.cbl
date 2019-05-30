       Identification Division.
       Program-ID. testantlr005.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr005'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           CALL PGM-0001 USING MYNAME END-CALL
           
           GOBACK
           .

       1000-para.

           .

