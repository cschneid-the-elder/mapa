       ID Division.
       Program-ID. test9054.
       Data Division.
       Working-Storage Section.
       Linkage Section.
       01  PARM-1 PIC X.
       01  PARM-2 PIC X.
       Procedure Division Using
         PARM-1
         Optional PARM-2
         .
         
           IF PARM-2 OMITTED
               DISPLAY 'PARM-2 OMITTED'
           END-IF
           
           IF PARM-2 IS OMITTED
               DISPLAY 'PARM-2 OMITTED'
           END-IF
           
           IF PARM-2 NOT OMITTED
               DISPLAY 'PARM-2 NOT OMITTED'
           END-IF
           
           IF PARM-2 IS NOT OMITTED
               DISPLAY 'PARM-2 NOT OMITTED'
           END-IF
           
           GOBACK.
