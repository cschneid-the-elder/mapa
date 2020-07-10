       ID Division.
       Program-ID. test9002.
       Procedure Division.
           >>IF IGY-ARCH > 10
           DISPLAY "IGY-ARCH > 10"
           >>ELSE
           DISPLAY "IGY-ARCH <= 10"
           >>END-IF

           >>IF IGY-ARCH = 8 OR IGY-ARCH = 9
           DISPLAY "IGY-ARCH = 8 OR IGY-ARCH = 9"
           >>END-IF

           >>IF IGY-ARCH = 8 OR (IGY-ARCH = 9 AND IGY-CICS)
           DISPLAY "IGY-ARCH = 8 (IGY-ARCH = 9 AND IGY-CICS)"
           >>END-IF

           >>IF (IGY-SQL OR IGY-SQLIMS) AND (IGY-ARCH GREATER THAN 9)
           DISPLAY "1"
           >>IF IGY-CICS OR (IGY-SQL OR (IGY-SQLIMS AND IGY-ARCH = 9))
           DISPLAY "2"
           >>END-IF
           >>END-IF

           GOBACK.
