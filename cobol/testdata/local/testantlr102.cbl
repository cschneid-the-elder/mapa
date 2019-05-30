000001 Identification Division.
000002 Program-ID. testantlr102.
000003 Data Division.
000004 Working-Storage Section.
000005 01  CONSTANTS.
000006     05  MYNAME               PIC X(012) VALUE 'testantlr102'.
000007
000008 Procedure Division.
000009     DISPLAY MYNAME ' Begin'
000010     
000011     CALL 'PGMA0001'
000012     
000013     GOBACK
000014     .
000015
000016
