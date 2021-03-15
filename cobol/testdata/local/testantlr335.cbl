000001 Identification Division.                                         00000001
000002 Program-ID. testantlr335.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 01  CONSTANTS.                                                   00000006
000007     05  MYNAME               PIC X(012) VALUE 'testantlr335'.    00000007
000008     >>IF X DEFINED                                               00000008
000009     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000009
000010     >>ELSE                                                       00000010
000011     05  PGM-0001             PIC X(008) VALUE 'PGMA0002'.        00000011
000012     >>END-IF                                                     00000012
000013                                                                  00000013
000014*                                                                 00000014
000015                                                                  00000015
000016 Procedure Division.                                              00000016
000017     DISPLAY MYNAME ' Begin'                                      00000017
000018     CALL PGM-0001                                                00000018
000019                                                                  00000019
000020     DISPLAY MYNAME ' End'                                        00000020
000021                                                                  00000021
000022     GOBACK                                                       00000022
000023     .                                                            00000023
000024                                                                  00000024
