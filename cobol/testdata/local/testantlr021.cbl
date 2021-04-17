       Identification Division.
       Program-ID. testantlr021.
       Data Division.
       Working-Storage Section.

       REPLACE 
         =='PGMA0001'== BY =='PGMB0001'==
         =='PGMA0002'== BY =='PGMB0002'==
         .

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr021'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.

      *

       REPLACE OFF
       .


       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           CALL PGM-0001 USING MYNAME

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


