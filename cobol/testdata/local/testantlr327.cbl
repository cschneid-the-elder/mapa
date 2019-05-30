000001 Identification Division.                                         00000001
000002 Program-ID. testantlr327.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006*                                                                 00000006
000007*comment                                                          00000007
000008*                                                                 00000008
000009                                                                  00000009
000010 01  CONSTANTS.                                                   00000010
000011     05  MYNAME               PIC X(012) VALUE 'testantlr327'.    00000011
000012                                                                  00000012
000013*                                                                 00000013
000014                                                                  00000014
000015 01 WORK-AREAS.                                                   00000015
000016    05  X                     PIC X USAGE IS DISPLAY VALUE IS 'ABC00000016
000017-'DEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000017
000018-'ghijklmnopqrstuvwxyz '.                                         00000018
000019    05  A                     PIC X USAGE IS DISPLAY VALUE IS "ABC00000019
000020-"DEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000020
000021-"ghijklmnopqrstuvwxyz ".                                         00000021
000022                                                                  00000022
000023 Procedure Division.                                              00000023
000024     DISPLAY MYNAME ' Begin'                                      00000024
000025                                                                  00000025
000026     IF X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?\|1234567890!@#$%^00000026
000027-"&*()-=_+ ." DISPLAY MYNAME 'IS EQUAL' END-IF                    00000027
000028                                                                  00000028
000029     IF A EQUAL TO 'ABCDEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?\|12345678900000029
000030-'0!@#$%^&*()-=_+ .' DISPLAY MYNAME 'IS EQUAL' END-IF             00000030
000031                                                                  00000031
000032                                                                  00000032
000033     DISPLAY MYNAME ' End'                                        00000033
000034                                                                  00000034
000035     GOBACK                                                       00000035
000036     .                                                            00000036
000037                                                                  00000037
000038                                                                  00000038
