       Identification Division.                                         00000001
       Program-ID. testantlr227.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
      *                                                                 00000006
      *comment                                                          00000007
      *                                                                 00000008
                                                                        00000009
       01  CONSTANTS.                                                   00000010
           05  MYNAME               PIC X(012) VALUE 'testantlr227'.    00000011
                                                                        00000012
      *                                                                 00000013
                                                                        00000014
       01 WORK-AREAS.                                                   00000015
          05  X                     PIC X USAGE IS DISPLAY VALUE IS 'ABC00000016
      -'DEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000017
      -'ghijklmnopqrstuvwxyz '.                                         00000018
          05  A                     PIC X USAGE IS DISPLAY VALUE IS "ABC00000019
      -"DEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000020
      -"ghijklmnopqrstuvwxyz ".                                         00000021
                                                                        00000022
       Procedure Division.                                              00000023
           DISPLAY MYNAME ' Begin'                                      00000024
                                                                        00000025
           IF X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?\|1234567890!@#$%^00000026
      -"&*()-=_+ ." DISPLAY MYNAME 'IS EQUAL' END-IF                    00000027
                                                                        00000028
           IF A EQUAL TO 'ABCDEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?\|12345678900000029
      -'0!@#$%^&*()-=_+ .' DISPLAY MYNAME 'IS EQUAL' END-IF             00000030
                                                                        00000031
                                                                        00000032
           DISPLAY MYNAME ' End'                                        00000033
                                                                        00000034
           GOBACK                                                       00000035
           .                                                            00000036
                                                                        00000037
                                                                        00000038
