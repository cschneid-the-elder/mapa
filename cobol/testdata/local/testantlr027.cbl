       Identification Division.
       Program-ID. testantlr027.
       Data Division.
       Working-Storage Section.

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr027'.

      *

       01 WORK-AREAS.
          05  X                     PIC X USAGE IS DISPLAY VALUE IS 'ABC
      -'DEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?1234567890-=!@#$%^&*()_+\|abcdef
      -'ghijklmnopqrstuvwxyz '.
          05  A                     PIC X USAGE IS DISPLAY VALUE IS "ABC
      -"DEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?1234567890-=!@#$%^&*()_+\|abcdef
      -"ghijklmnopqrstuvwxyz ".

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           IF X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?\|1234567890!@#$%^
      -"&*()-=_+ ." DISPLAY MYNAME 'IS EQUAL' END-IF

           IF A EQUAL TO 'ABCDEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?\|123456789
      -'0!@#$%^&*()-=_+ .' DISPLAY MYNAME 'IS EQUAL' END-IF
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


