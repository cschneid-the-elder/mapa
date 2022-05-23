       Identification Division.                                         00000001
       Program-ID. testantlr265.                                        00000002
       Environment Division.                                            00000003
       Configuration Section.                                           00000004
       Special-Names.                                                   00000005
           Currency Sign Is '!' With Picture Symbol '_'                 00000006
           .                                                            00000007
       Data Division.                                                   00000008
       Working-Storage Section.                                         00000009
       01  CONSTANTS.                                                   00000010
           05  MYNAME               PIC X(012) VALUE 'testantlr265'.    00000011
           05  PGM1                 Picture X(008) VALUE 'PGM00001'.    00000012
                                                                        00000013
      *                                                                 00000014
                                                                        00000015
       Procedure Division.                                              00000016
           DISPLAY MYNAME ' Begin'                                      00000017
                                                                        00000018
           CALL PGM1                                                    00000019
                                                                        00000020
           DISPLAY MYNAME ' End'                                        00000021
                                                                        00000022
           GOBACK                                                       00000023
           .                                                            00000024
                                                                        00000025
       1000-para.                                                       00000026
                                                                        00000027
           .                                                            00000028
                                                                        00000029
