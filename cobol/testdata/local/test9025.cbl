       ID Division.
       Program-ID. test9025.
       Environment Division.
       Configuration Section.
       Repository.
           Function REVERSE Intrinsic.
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
           05  WS-UTF-8-B            PIC U BYTE-LENGTH IS 2 UTF-8.
           05  WS-UTF-8-C            PIC UU BYTE-LENGTH 4 UTF-8.
           05  WS-UTF-8-D            PIC U(8) 
                                     BYTE-LENGTH IS 2
                                     USAGE IS UTF-8 NATIVE.
           05  WS-VOLATILE-1         PIC S9(008) COMP VOLATILE.
           05  WS-GROUP-1 GROUP-USAGE IS NATIONAL.
               10  WS-GROUP-1-FIELD1 PIC N.
           05  WS-GROUP-2 GROUP-USAGE IS UTF-8.
               10  WS-GROUP-2-FIELD1 PIC U BYTE-LENGTH 2.

       Procedure Division.
           MOVE REVERSE(WORK-AREAS) TO RETURN-CODE

           EXIT PROGRAM.
