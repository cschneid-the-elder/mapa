       ID Division.
       Program-ID. test9003.
       Data Division.
       Working-Storage Section.
           >>EVALUATE TRUE
           >>WHEN IGY-CICS AND IGY-SQL AND IGY-SQLIMS
           COPY DFHATTRS.
           COPY SQLCA.
           COPY IMSSTUFF.
           >>WHEN IGY-CICS AND IGY-SQL
           COPY DFHATTRS.
           COPY SQLCA.
           >>WHEN IGY-CICS
           COPY DFHATTRS.
           >>WHEN IGY-ARCH <> 10
       01 CONSTANT-DISPLAY PIC X(080) VALUE "IGY-ARCH <> 10".
           >>WHEN IGY-ARCH <= 10
       01 CONSTANT-DISPLAY PIC X(080) VALUE "IGY-ARCH <= 10".
           >>WHEN IGY-ARCH >= 10
       01 CONSTANT-DISPLAY PIC X(080) VALUE "IGY-ARCH >= 10".
           >>END-EVALUATE
       Procedure Division.
           >>EVALUATE IGY-ARCH
           >>WHEN 8
           DISPLAY "IGY-ARCH = 8"
           >>WHEN 9
           DISPLAY "IGY-ARCH = 9"
           >>WHEN 10
           DISPLAY "IGY-ARCH = 10"
           >>WHEN 11
           DISPLAY "IGY-ARCH = 11"
           >>WHEN 12
           DISPLAY "IGY-ARCH = 12"
           >>WHEN 13
           DISPLAY "IGY-ARCH = 13"
           >>WHEN OTHER
           DISPLAY "Something new!"
           >>END-EVALUATE

           >>EVALUATE IGY-ARCH
           >>WHEN 8 THRU 10
           DISPLAY "IGY-ARCH = 8 THRU 10"
           >>WHEN 11 THROUGH 13
           DISPLAY "IGY-ARCH = 11 THROUGH 13"
           >>WHEN OTHER
           DISPLAY "Something new!"
           >>END-EVALUATE

           >>EVALUATE TRUE
           >>WHEN IGY-CICS AND IGY-ARCH < 10
           DISPLAY "Some workaround"
           >>WHEN IGY-CICS AND (IGY-ARCH = 11 OR IGY-ARCH=13)
           >>WHEN (IGY-CICS AND IGY-ARCH = 11) OR IGY-ARCH=13
           >>WHEN (IGY-CICS AND (IGY-ARCH = 11 OR IGY-ARCH=13))
           DISPLAY "Some other workaround"
           >>WHEN OTHER
           DISPLAY "I am surprised"
           >>END-EVALUATE

           >>EVALUATE TRUE
           >>WHEN X DEFINED
           >>WHEN X IS DEFINED
           >>WHEN X NOT DEFINED
           >>WHEN X IS NOT DEFINED
           >>WHEN X DEFINED AND Y DEFINED
           >>WHEN X IS DEFINED OR Y IS DEFINED
           >>WHEN X NOT DEFINED AND Y NOT DEFINED
           >>WHEN X IS NOT DEFINED OR Y IS NOT DEFINED
           >>WHEN X DEFINED AND (Y DEFINED OR Z DEFINED)
           >>WHEN X IS DEFINED OR (Y IS DEFINED AND Z IS DEFINED)
           >>WHEN X NOT DEFINED OR (IGY-CICS AND IGY-SQL)
           >>WHEN X IS NOT DEFINED AND (Y OR Z AND (A AND B))
           >>END-EVALUATE

           GOBACK.


