       Identification Division.
       Program-ID. testantlr048.
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
           05  MYNAME               PIC X(012) VALUE 'testantlr048'.
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

           >>EVALUATE TRUE
           >>WHEN JULIA = 'WICKER'
           CALL PGM-0001 USING
             MYNAME
           END-CALL
           >>WHEN ELIOT = 'WAUGH'
           CALL PGM-0002
             MYNAME
           END-CALL
           >>WHEN PENNY = 'ADIYODI'
           CALL PGM-0003
             MYNAME
           END-CALL
           >>WHEN MARGOT = 'HANSON'
           CALL PGM-0004
             MYNAME
           END-CALL
           >>WHEN ALICE = 'QUINN'
           CALL PGM-0005
             MYNAME
           END-CALL
           >>WHEN QUENTIN = 'COLDWATER'
           CALL PGM-0006
             MYNAME
           END-CALL
           >>WHEN KADY = 'ORLOFF-DIAZ'
           CALL PGM-0007
             MYNAME
           END-CALL
           >>WHEN JOSH = 'HOBERMAN'
           CALL PGM-0008
             MYNAME
           END-CALL
           >>WHEN OTHER
           CALL PGM-0009
             MYNAME
           END-CALL
           >>END-EVALUATE

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


