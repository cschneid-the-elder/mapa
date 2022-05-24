000001 PROCESS DEFINE(GRAYZA='PGM00003')
000002 Identification Division.
000003 Program-ID. testantlr166.
000004 Data Division.
000005 Working-Storage Section.
000006 >>DEFINE Meeklo 'PGM00002'
000007 01  Scorpius Constant 'PGM00001'.
000008 01  Braca Constant From Meeklo.
000009 01  Mele-On Constant From GRAYZA.
000010 Procedure Division.
000011     Call Scorpius
000012     Call Braca
000013     Call Mele-On
000014     GOBACK.
000015
