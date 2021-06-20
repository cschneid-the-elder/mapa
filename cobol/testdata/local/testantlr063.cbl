       Identification Division.
       Program-ID. testantlr063.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr063'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

           EXEC SQL INCLUDE SQLCA END-EXEC.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           EXEC SQL
                SELECT C1, C2
                FROM T1
                WHERE C3 = 'BLUE'
           END-EXEC.

           EXEC SQL
                INSERT INTO T1
                SELECT * FROM T2
           END-EXEC.

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


