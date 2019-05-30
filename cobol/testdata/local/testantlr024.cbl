       Identification Division.
       Program-ID. testantlr024.
       Data Division.
       Working-Storage Section.

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr024'.

      *

       01 WORK-AREAS.
          05  A                     PIC A VALUE 'A'.
          05  X                     PIC X VALUE 'X'.
          05  V99                   PIC V99.
          05  B9                    PIC B9.
          05  Z                     PIC Z.
          05  S9                    PIC S9.       

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


