       Identification Division.
       Program-ID. test9028.
       Environment Division.
       Configuration Section.
       Repository.
       FUNCTION FUNC.
      *Function bit-of intrinsic.
       function all intrinsic.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test9028'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

       01  WORK-AREAS.
           05  STUFF OCCURS 5       PIC X(008).
           05  OTHER-STUFF          PIC X(008).

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           DISPLAY STUFF(1)
           MOVE STUFF(2) TO OTHER-STUFF
           
           DISPLAY FUNC(1)
           MOVE FUNC(2) TO OTHER-STUFF
           
           move bit-of(myname) to other-stuff
           display function e
           
           DISPLAY MYNAME ' End'
           
           GOBACK
           .


