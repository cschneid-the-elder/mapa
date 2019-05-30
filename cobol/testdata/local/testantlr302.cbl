000001 Identification Division.                                         00000001
000002 Program-ID. testantlr302.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  CONSTANTS.                                                   00000005
000006     05  MYNAME               PIC X(012) VALUE 'testantlr302'.    00000006
000007                                                                  00000007
000008 Procedure Division.                                              00000008
000009     DISPLAY MYNAME ' Begin'                                      00000009
000010                                                                  00000010
000011     CALL 'PGMA0001'                                              00000011
000012                                                                  00000012
000013     GOBACK                                                       00000013
000014     .                                                            00000014
000015                                                                  00000015
000016                                                                  00000016
