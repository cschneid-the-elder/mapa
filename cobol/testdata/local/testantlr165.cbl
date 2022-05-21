000001 Identification Division.
000002 Program-ID. testantlr165.
000003 Environment Division.
000004 Configuration Section.
000005 Special-Names.
000006     Currency Sign Is '!' With Picture Symbol '_'
000007     .
000008 Data Division.
000009 Working-Storage Section.
000010 01  CONSTANTS.
000011     05  MYNAME               PIC X(012) VALUE 'testantlr165'.
000012     05  PGM1                 Picture X(008) VALUE 'PGM00001'.
000013
000014* 
000015
000016 Procedure Division.
000017     DISPLAY MYNAME ' Begin'
000018     
000019     CALL PGM1
000020
000021     DISPLAY MYNAME ' End'
000022     
000023     GOBACK
000024     .
000025
000026 1000-para.
000027
000028     .
000029
