       Identification Division.                                         00000001
       Program-ID. testantlr221.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       REPLACE                                                          00000006
         =='PGMA0001'== BY =='PGMB0001'==                               00000007
         =='PGMA0002'== BY =='PGMB0002'==                               00000008
         .                                                              00000009
                                                                        00000010
      *                                                                 00000011
      *comment                                                          00000012
      *                                                                 00000013
                                                                        00000014
       01  CONSTANTS.                                                   00000015
           05  MYNAME               PIC X(012) VALUE 'testantlr221'.    00000016
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000017
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000018
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000019
                                                                        00000020
      *                                                                 00000021
                                                                        00000022
       REPLACE OFF                                                      00000023
       .                                                                00000024
                                                                        00000025
                                                                        00000026
       Procedure Division.                                              00000027
           DISPLAY MYNAME ' Begin'                                      00000028
                                                                        00000029
           CALL PGM-0001 USING MYNAME                                   00000030
                                                                        00000031
           DISPLAY MYNAME ' End'                                        00000032
                                                                        00000033
           GOBACK                                                       00000034
           .                                                            00000035
                                                                        00000036
                                                                        00000037
