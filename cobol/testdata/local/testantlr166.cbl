000001 Process DEFINE(GRAYZA,'PGM00001')
000002 Identification Division.
000003 Program-ID.    testantlr166.
000004 Data Division.
000005 Working-Storage Section.
000006 01  PGM1 Constant From GRAYZA.
000007 01  PGM2 Constant As   'PGM00002'.
000008 Procedure Division.
000009     Call PGM1
000010     Call PGM2
000011     Goback
000012     .
000013     
