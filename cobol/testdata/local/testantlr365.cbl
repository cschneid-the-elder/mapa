000001 Identification Division.                                         00000001
000002 Program-ID. testantlr365.                                        00000002
000003 Environment Division.                                            00000003
000004 Configuration Section.                                           00000004
000005 Special-Names.                                                   00000005
000006     Currency Sign Is '!' With Picture Symbol '_'                 00000006
000007     .                                                            00000007
000008 Data Division.                                                   00000008
000009 Working-Storage Section.                                         00000009
000010 01  CONSTANTS.                                                   00000010
000011     05  MYNAME               PIC X(012) VALUE 'testantlr365'.    00000011
000012     05  PGM1                 Picture X(008) VALUE 'PGM00001'.    00000012
000013                                                                  00000013
000014*                                                                 00000014
000015                                                                  00000015
000016 Procedure Division.                                              00000016
000017     DISPLAY MYNAME ' Begin'                                      00000017
000018                                                                  00000018
000019     CALL PGM1                                                    00000019
000020                                                                  00000020
000021     DISPLAY MYNAME ' End'                                        00000021
000022                                                                  00000022
000023     GOBACK                                                       00000023
000024     .                                                            00000024
000025                                                                  00000025
000026 1000-para.                                                       00000026
000027                                                                  00000027
000028     .                                                            00000028
000029                                                                  00000029
