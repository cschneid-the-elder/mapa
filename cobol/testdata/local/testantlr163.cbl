000001 Identification Division.
000002 Program-ID. testantlr163.
000003 Data Division.
000004 Working-Storage Section.
000005 01  CONSTANTS.
000006     05  MYNAME               PIC X(012) VALUE 'testantlr163'.
000007     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
000008
000009     EXEC SQL INCLUDE SQLCA END-EXEC.
000010
000011 Procedure Division.
000012     DISPLAY MYNAME ' Begin'
000013     
000014     EXEC SQL
000015          SELECT C1, C2
000016          FROM T1
000017          WHERE C3 = 'BLUE'
000018     END-EXEC.
000019
000020     EXEC SQL
000021          INSERT INTO T1
000022          SELECT * FROM T2
000023     END-EXEC.
000024
000025     DISPLAY MYNAME ' End'
000026     
000027     GOBACK
000028     .
000029
000030
