       ID Division.
       Program-ID. test9027.
       Data Division.
       Working-Storage Section.

       >>DATA 31
       01  STUFF PIC X(1024) VALUE LOW-VALUES.
       >>DATA 64
       01  OTHER-STUFF.
           05  A PIC S9(8) COMP VALUE +0.

       Procedure Division.

           GOBACK.
