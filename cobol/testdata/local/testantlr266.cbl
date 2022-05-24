       PROCESS DEFINE(GRAYZA='PGM00003')                                00000001
       Identification Division.                                         00000002
       Program-ID. testantlr266.                                        00000003
       Data Division.                                                   00000004
       Working-Storage Section.                                         00000005
       >>DEFINE Meeklo 'PGM00002'                                       00000006
       01  Scorpius Constant 'PGM00001'.                                00000007
       01  Braca Constant From Meeklo.                                  00000008
       01  Mele-On Constant From GRAYZA.                                00000009
       Procedure Division.                                              00000010
           Call Scorpius                                                00000011
           Call Braca                                                   00000012
           Call Mele-On                                                 00000013
           GOBACK.                                                      00000014
                                                                        00000015
