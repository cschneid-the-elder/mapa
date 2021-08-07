       ID Division.
       Program-ID. test9025.
       Environment Division.
       Configuration Section.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
           05  WS-COUNT-1            PIC S9999 COMP-3 NATIVE VALUE +0.
           05  WS-PTR-32             POINTER-32.
           05  WS-UTF-8              PIC X USAGE IS UTF-8.
           05  WS-UTF-8-A            PIC X USAGE IS UTF-8 NATIVE.
           05  WS-DL-1               PIC X DYNAMIC.
           05  WS-DL-2               PIC X DYNAMIC LENGTH LIMIT IS 8
                                     VALUE 'SAMVIMES'.
           05  WS-DL-3               DYNAMIC LENGTH PIC X VALUE 'X'.
       Procedure Division.
           MOVE REVERSE(WORK-AREAS) TO RETURN-CODE

           EXIT PROGRAM.
