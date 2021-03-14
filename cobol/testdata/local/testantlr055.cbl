       ID Division.
       Program-ID. testantlr055.
       Procedure Division.

       >>DEFINE VAR1 'ALICE'
       >>DEFINE VAR2 'JULIA'
       >>DEFINE VAR3 'KADY'
       >>DEFINE VAR4 'MARGOT'

       >>EVALUATE VAR1
       >>WHEN 'MARGOT'
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
       >>WHEN 'ALICE'
           EXEC CICS 
                LINK
                PROGRAM('PGM00005')
           END-EXEC
       >>WHEN VAR2
           EXEC CICS 
                LINK
                PROGRAM('PGM00006')
           END-EXEC
       >>WHEN VAR4
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

       >>IF VAR2 = 'BRAKEBILLS'
           EXEC CICS 
                LINK
                PROGRAM('PGM00009')
           END-EXEC
       >>ELSE
           EXEC CICS 
                LINK
                PROGRAM('PGM00010')
           END-EXEC
       >>END-IF

       >>IF VAR1 DEFINED
           EXEC CICS 
                LINK
                PROGRAM('PGM00011')
           END-EXEC
       >>END-IF

       >>IF VAR5 DEFINED
           >>IF VAR5 = 'QUENTIN'
               EXEC CICS 
                    LINK
                    PROGRAM('PGM00012')
               END-EXEC
           >>END-IF
       >>ELSE
           >>DEFINE VAR5 'PENNY'
       >>END-IF

       >>IF VAR5 = 'PENNY'
           EXEC CICS 
                LINK
                PROGRAM('PGM00013')
           END-EXEC
       >>END-IF


           GOBACK.
