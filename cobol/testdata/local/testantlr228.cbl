       Identification Division.                                         00000001
       Program-ID. testantlr028.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
      *                                                                 00000006
      *comment                                                          00000007
      *                                                                 00000008
                                                                        00000009
       01  CONSTANTS.                                                   00000010
           05  MYNAME               PIC X(012) VALUE 'testantlr028'.    00000011
                                                                        00000012
      *                                                                 00000013
                                                                        00000014
       01  WORK-AREAS.                                                  00000015
           05  X                     PIC X USAGE IS DISPLAY VALUE 'X'.  00000016
                                                                        00000017
       Local-Storage Section.                                           00000018
       01  LOCAL-WORK-AREAS.                                            00000019
           05  Y                     PIC X VALUE 'Y'.                   00000020
                                                                        00000021
       Linkage Section.                                                 00000022
       01  PARM-DATA.                                                   00000023
           05  PARM-DATA-LEN         PIC S9(004) COMP-5.                00000024
           05  PARM-DATA-VAL         PIC X(100).                        00000025
                                                                        00000026
       Procedure Division Using PARM-DATA.                              00000027
           DISPLAY MYNAME ' Begin'                                      00000028
                                                                        00000029
                                                                        00000030
           DISPLAY MYNAME ' End'                                        00000031
                                                                        00000032
           GOBACK                                                       00000033
           .                                                            00000034
                                                                        00000035
                                                                        00000036
