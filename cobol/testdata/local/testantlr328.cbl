000001 Identification Division.                                         00000001
000002 Program-ID. testantlr028.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006*                                                                 00000006
000007*comment                                                          00000007
000008*                                                                 00000008
000009                                                                  00000009
000010 01  CONSTANTS.                                                   00000010
000011     05  MYNAME               PIC X(012) VALUE 'testantlr028'.    00000011
000012                                                                  00000012
000013*                                                                 00000013
000014                                                                  00000014
000015 01  WORK-AREAS.                                                  00000015
000016     05  X                     PIC X USAGE IS DISPLAY VALUE 'X'.  00000016
000017                                                                  00000017
000018 Local-Storage Section.                                           00000018
000019 01  LOCAL-WORK-AREAS.                                            00000019
000020     05  Y                     PIC X VALUE 'Y'.                   00000020
000021                                                                  00000021
000022 Linkage Section.                                                 00000022
000023 01  PARM-DATA.                                                   00000023
000024     05  PARM-DATA-LEN         PIC S9(004) COMP-5.                00000024
000025     05  PARM-DATA-VAL         PIC X(100).                        00000025
000026                                                                  00000026
000027 Procedure Division Using PARM-DATA.                              00000027
000028     DISPLAY MYNAME ' Begin'                                      00000028
000029                                                                  00000029
000030                                                                  00000030
000031     DISPLAY MYNAME ' End'                                        00000031
000032                                                                  00000032
000033     GOBACK                                                       00000033
000034     .                                                            00000034
000035                                                                  00000035
000036                                                                  00000036
