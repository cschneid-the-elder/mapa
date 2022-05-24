000001 PROCESS DEFINE(GRAYZA='PGM00003')                                00000001
000002 Identification Division.                                         00000002
000003 Program-ID. testantlr366.                                        00000003
000004 Data Division.                                                   00000004
000005 Working-Storage Section.                                         00000005
000006 >>DEFINE Meeklo 'PGM00002'                                       00000006
000007 01  Scorpius Constant 'PGM00001'.                                00000007
000008 01  Braca Constant From Meeklo.                                  00000008
000009 01  Mele-On Constant From GRAYZA.                                00000009
000010 Procedure Division.                                              00000010
000011     Call Scorpius                                                00000011
000012     Call Braca                                                   00000012
000013     Call Mele-On                                                 00000013
000014     GOBACK.                                                      00000014
000015                                                                  00000015
