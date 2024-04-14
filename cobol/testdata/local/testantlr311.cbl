000001 Identification Division.                                         00000001
000002 Program-ID. testantlr311.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 01  CONSTANTS.                                                   00000006
000007     05  MYNAME               PIC X(012) VALUE 'testantlr311'.    00000007
000008                                                                  00000008
000009 Procedure Division.                                              00000009
000010     DISPLAY MYNAME ' Begin'                                      00000010
000011                                                                  00000011
000012     EXEC CICS                                                    00000012
000013          LINK                                                    00000013
000014          PROGRAM('PGMA0001')                                     00000014
000015          COMMAREA(CA-STUFF)                                      00000015
000016          LENGTH(CA-STUFF-LEN)                                    00000016
000017     END-EXEC                                                     00000017
000018                                                                  00000018
000019     DISPLAY MYNAME ' End'                                        00000019
000020                                                                  00000020
000021     GOBACK                                                       00000021
000022     .                                                            00000022
000023                                                                  00000023
000024                                                                  00000024
