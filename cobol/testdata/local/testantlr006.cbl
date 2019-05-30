       Identification Division.
       Program-ID. testantlr006.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr006'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC CICS LINK PROGRAM('PGMA0001') END-EXEC

           GOBACK
           .

       1000-para.

           .

