       Identification Division.
       Program-ID. testantlr049.
       Data Division.
       Working-Storage Section.

       >>DEFINE JULIA 'WICKER'
       >>DEFINE ELIOT 'WAUGH'
       >>DEFINE PENNY 'ADIYODI'
       >>DEFINE MARGOT 'HANSON'
       >>DEFINE ALICE 'QUINN'
       >>DEFINE QUENTIN 'COLDWATER'
       >>DEFINE KADY 'ORLOFF-DIAZ'
       >>DEFINE JOSH 'HOBERMAN'

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr049'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.
           05  PGM-0004             PIC X(008) VALUE 'PGMA0004'.
           05  PGM-0005             PIC X(008) VALUE 'PGMA0005'.
           05  PGM-0006             PIC X(008) VALUE 'PGMA0006'.
           05  PGM-0007             PIC X(008) VALUE 'PGMA0007'.
           05  PGM-0008             PIC X(008) VALUE 'PGMA0008'.
           05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.

      *

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           >>IF JULIA = 'WICKER'
           CALL PGM-0001 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF ELIOT = 'WAUGH'
           CALL PGM-0002 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF PENNY = 'ADIYODI'
           CALL PGM-0003 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF MARGOT = 'HANSON'
           CALL PGM-0004 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF ALICE = 'QUINN'
           CALL PGM-0005 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF QUENTIN = 'COLDWATER'
           CALL PGM-0006 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF KADY = 'ORLOFF-DIAZ'
           CALL PGM-0007 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF JOSH = 'HOBERMAN'
           CALL PGM-0008 USING
             MYNAME
           END-CALL
           >>END-IF
           >>IF ELIOT = 'QUENTIN'
           CALL PGM-0009 USING
             MYNAME
           END-CALL
           >>END-IF

           >>IF JULIA = 'WICKER'
               CALL 'JULIA' USING
                 MYNAME
               END-CALL
               >>IF ELIOT = 'WAUGH'
                   CALL 'ELIOT' USING
                     MYNAME
                   END-CALL
                   >>IF PENNY = 'ADIYODI'
                       CALL 'PENNY' USING
                         MYNAME
                       END-CALL
                   >>END-IF
               >>END-IF
               >>IF MARGOT = 'WAUGH'
                   CALL 'WAUGH' USING
                     MYNAME
                   END-CALL
               >>ELSE
                   CALL 'MARGOT' USING
                     MYNAME
                   END-CALL
                   >>IF ALICE = 'QUINN'
                       CALL 'ALICE' USING
                         MYNAME
                       END-CALL
                   >>ELSE
                       CALL 'QUINN' USING
                         MYNAME
                       END-CALL
                   >>END-IF
               >>END-IF
           >>ELSE
               CALL 'WICKER' USING
                 MYNAME
               END-CALL
           >>END-IF


           DISPLAY MYNAME ' End'
           
           GOBACK
           .


