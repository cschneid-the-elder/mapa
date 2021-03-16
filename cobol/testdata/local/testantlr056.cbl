       ID Division.
       Program-ID. testantlr056.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
       Procedure Division.
           PERFORM 10 TIMES
             ADD 1 TO WS-COUNT
             IF WS-COUNT = 3
               EXIT PERFORM
             END-IF
           END-PERFORM

           PERFORM 10 TIMES
             ADD 1 TO WS-COUNT
             IF WS-COUNT = 4
               EXIT PERFORM CYCLE
             END-IF
           END-PERFORM

           PERFORM 10 TIMES
             ADD 1 TO WS-COUNT
             IF WS-COUNT = 13
               EXIT METHOD
             END-IF
           END-PERFORM

           EXIT SECTION
           EXIT PARAGRAPH

           EXIT PROGRAM.
