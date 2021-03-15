       ID Division.
       Program-ID. testantlr052.
       Procedure Division.

       >>DEFINE IGY-ARCH 0
       >>DEFINE VAR1 0

       >>EVALUATE TRUE
       >>WHEN IGY-CICS
           EXEC CICS 
                XCTL 
                PROGRAM('IGYCICS1')
           END-EXEC
       >>WHEN IGY-ARCH > 10
           CALL 'IGYARCH1' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR2 IS DEFINED
           CALL 'VAR2#1' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR1 + 1 = 2
           CALL 'VAR1#1' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN OTHER
           CALL 'OTHER#1' USING 
                X
                Y
                Z
           END-CALL
       >>END-EVALUATE

       >>DEFINE VAR1 AS 1

       >>EVALUATE TRUE
       >>WHEN IGY-CICS
           EXEC CICS 
                XCTL 
                PROGRAM('IGYCICS2')
           END-EXEC
       >>WHEN IGY-ARCH > 10
           CALL 'IGYARCH2' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR2 IS DEFINED
           CALL 'VAR2#2' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR1 + 1 = 2
           CALL 'VAR1#2' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN OTHER
           CALL 'OTHER#2' USING 
                X
                Y
                Z
           END-CALL
       >>END-EVALUATE

       >>DEFINE VAR2

       >>EVALUATE TRUE
       >>WHEN IGY-CICS
           EXEC CICS 
                XCTL 
                PROGRAM('IGYCICS3')
           END-EXEC
       >>WHEN IGY-ARCH > 10
           CALL 'IGYARCH3' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR2 IS DEFINED
           CALL 'VAR2#3' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR1 + 1 = 2
           CALL 'VAR1#3' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN OTHER
           CALL 'OTHER#3' USING 
                X
                Y
                Z
           END-CALL
       >>END-EVALUATE

       >>DEFINE IGY-ARCH 11

       >>EVALUATE TRUE
       >>WHEN IGY-CICS
           EXEC CICS 
                XCTL 
                PROGRAM('IGYCICS4')
           END-EXEC
       >>WHEN IGY-ARCH > 10
           CALL 'IGYARCH4' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR2 IS DEFINED
           CALL 'VAR2#4' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR1 + 1 = 2
           CALL 'VAR1#4' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN OTHER
           CALL 'OTHER#4' USING 
                X
                Y
                Z
           END-CALL
       >>END-EVALUATE

       >>DEFINE IGY-CICS

       >>EVALUATE TRUE
       >>WHEN IGY-CICS
           EXEC CICS 
                XCTL 
                PROGRAM('IGYCICS5')
           END-EXEC
       >>WHEN IGY-ARCH > 10
           CALL 'IGYARCH5' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR2 IS DEFINED
           CALL 'VAR2#5' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN VAR1 + 1 = 2
           CALL 'VAR1#5' USING 
                X
                Y
                Z
           END-CALL
       >>WHEN OTHER
           CALL 'OTHER#5' USING 
                X
                Y
                Z
           END-CALL
       >>END-EVALUATE


           GOBACK.
