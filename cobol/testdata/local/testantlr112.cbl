000001 Identification Division.
000002 Program-ID. testantlr112.
000003 Data Division.
000004 Working-Storage Section.
000005
000006 01  CONSTANTS.
000007     05  MYNAME               PIC X(012) VALUE 'testantlr112'.
000008
000009 Procedure Division.
000010     DISPLAY MYNAME ' Begin'
000011     
000012     EXEC CICS
000013          XCTL
000014          PROGRAM('PGMA0001')
000015          COMMAREA(CA-STUFF)
000016          LENGTH(CA-STUFF-LEN)
000017     END-EXEC
000018
000019     DISPLAY MYNAME ' End'
000020     
000021     GOBACK
000022     .
000023
000024
