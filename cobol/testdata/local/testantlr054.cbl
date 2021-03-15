       ID Division.
       Program-ID. testantlr054.
       Procedure Division.

       >>DEFINE VAR1 1
       >>DEFINE VAR2 2
       >>DEFINE VAR3 3
       >>DEFINE VAR4 4

       >>EVALUATE VAR1
       >>WHEN VAR2
           EXEC CICS 
                LINK
                PROGRAM('PGM00001')
           END-EXEC
       >>WHEN VAR3
           EXEC CICS 
                LINK
                PROGRAM('PGM00002')
           END-EXEC
       >>WHEN VAR4
           EXEC CICS 
                LINK
                PROGRAM('PGM00003')
           END-EXEC
       >>WHEN OTHER
           EXEC CICS 
                LINK
                PROGRAM('PGM00004')
           END-EXEC
       >>END-EVALUATE

       >>EVALUATE VAR1
       >>WHEN VAR2 - 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00005')
           END-EXEC
       >>WHEN VAR3 - 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00006')
           END-EXEC
       >>WHEN VAR4 - 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00007')
           END-EXEC
       >>WHEN OTHER
           EXEC CICS 
                LINK
                PROGRAM('PGM00008')
           END-EXEC
       >>END-EVALUATE

       >>IF VAR1 = VAR2 - 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00009')
           END-EXEC
       >>END-IF

       >>EVALUATE VAR1 + 1
       >>WHEN VAR2 - 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00010')
           END-EXEC
       >>WHEN VAR3 - 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00011')
           END-EXEC
       >>WHEN VAR4 - 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00012')
           END-EXEC
       >>WHEN OTHER
           EXEC CICS 
                LINK
                PROGRAM('PGM00013')
           END-EXEC
       >>END-EVALUATE

       >>EVALUATE TRUE
       >>WHEN VAR1 = VAR2
           EXEC CICS 
                LINK
                PROGRAM('PGM00014')
           END-EXEC
       >>WHEN VAR3 = VAR4
           EXEC CICS 
                LINK
                PROGRAM('PGM00015')
           END-EXEC
       >>WHEN VAR4 - 1 = VAR2 + 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00016')
           END-EXEC
       >>WHEN OTHER
           EXEC CICS 
                LINK
                PROGRAM('PGM00017')
           END-EXEC
       >>END-EVALUATE

       >>IF VAR4 - 1 = VAR2 + 1
           EXEC CICS 
                LINK
                PROGRAM('PGM00018')
           END-EXEC
       >>END-IF

           GOBACK.
