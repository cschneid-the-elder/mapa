000001 Identification Division.                                         00000001
000002 Program-ID. testantlr322.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 01  CONSTANTS.                                                   00000006
000007     05  MYNAME               PIC X(012) VALUE 'testantlr322'.    00000007
000008     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000008
000009     05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000009
000010     05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000010
000011                                                                  00000011
000012*                                                                 00000012
000013                                                                  00000013
000014 COPY 'testantlr005.cpy' REPLACING ==:PRFX:== BY ==AA-==          00000014
000015 .                                                                00000015
000016                                                                  00000016
000017                                                                  00000017
000018 Procedure Division.                                              00000018
000019     DISPLAY MYNAME ' Begin'                                      00000019
000020                                                                  00000020
000021                                                                  00000021
000022     DISPLAY MYNAME ' End'                                        00000022
000023                                                                  00000023
000024     GOBACK                                                       00000024
000025     .                                                            00000025
000026                                                                  00000026
000027                                                                  00000027
