       Identification Division.                                         00000001
       Program-ID. testantlr024.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
      *                                                                 00000006
      *comment                                                          00000007
      *                                                                 00000008
                                                                        00000009
       01  CONSTANTS.                                                   00000010
           05  MYNAME               PIC X(012) VALUE 'testantlr024'.    00000011
                                                                        00000012
      *                                                                 00000013
                                                                        00000014
       01 WORK-AREAS.                                                   00000015
          05  A                     PIC A VALUE 'A'.                    00000016
          05  X                     PIC X VALUE 'X'.                    00000017
          05  V99                   PIC V99.                            00000018
          05  B9                    PIC B9.                             00000019
          05  Z                     PIC Z.                              00000020
          05  S9                    PIC S9.                             00000021
                                                                        00000022
       Procedure Division.                                              00000023
           DISPLAY MYNAME ' Begin'                                      00000024
                                                                        00000025
                                                                        00000026
           DISPLAY MYNAME ' End'                                        00000027
                                                                        00000028
           GOBACK                                                       00000029
           .                                                            00000030
                                                                        00000031
                                                                        00000032
