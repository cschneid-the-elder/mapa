       Identification Division.
       Program-ID. testantlr028.
       Data Division.
       Working-Storage Section.

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr028'.

      *

       01  WORK-AREAS.
           05  X                     PIC X USAGE IS DISPLAY VALUE 'X'.

       Local-Storage Section.
       01  LOCAL-WORK-AREAS.
           05  Y                     PIC X VALUE 'Y'.

       Linkage Section.
       01  PARM-DATA.
           05  PARM-DATA-LEN         PIC S9(004) COMP-5.
           05  PARM-DATA-VAL         PIC X(100).

       Procedure Division Using PARM-DATA.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


