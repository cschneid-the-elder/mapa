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

           >>IF IGY-ARCH <> 10
           DISPLAY "IGY-ARCH <> 10"
           >>END-IF

           >>IF IGY-ARCH >= 10
           DISPLAY "IGY-ARCH >= 10"
           >>END-IF

           >>IF IGY-ARCH <= 10
           DISPLAY "IGY-ARCH <= 10"
           >>END-IF

           >>IF (IGY-SQL OR IGY-SQLIMS) AND (IGY-ARCH GREATER THAN 9)
           DISPLAY "1"
           >>IF IGY-CICS OR (IGY-SQL OR (IGY-SQLIMS AND IGY-ARCH = 9))
           DISPLAY "2"
           >>END-IF
           >>END-IF

           >>IF IGY-ARCH NOT GREATER THAN OR EQUAL TO 10
           DISPLAY "3"
           >>END-IF

           >>IF X DEFINED
           DISPLAY "X DEFINED"
           >>END-IF

           >>IF X IS DEFINED
           DISPLAY "X DEFINED"
           >>END-IF

           >>IF X NOT DEFINED
           DISPLAY "X NOT DEFINED"
           >>END-IF

           >>IF X IS NOT DEFINED
           DISPLAY "X NOT DEFINED"
           >>END-IF

           >>JAVA-SHAREABLE ON
           >>JAVA-SHAREABLE OFF
           >>JAVA-CALLABLE

           GOBACK.
