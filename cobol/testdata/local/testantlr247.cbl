       Identification Division.                                         00000001
       Program-ID. testantlr247.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       >>DEFINE A 2                                                     00000006
       >>DEFINE B 3                                                     00000007
       >>DEFINE C A + B                                                 00000008
       >>DEFINE D A * B                                                 00000009
       >>DEFINE E (D * A) / 3                                           00000010
                                                                        00000011
       01  CONSTANTS.                                                   00000012
           05  MYNAME               PIC X(012) VALUE 'testantlr247'.    00000013
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000014
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000015
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000016
           05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.        00000017
                                                                        00000018
      *                                                                 00000019
                                                                        00000020
       Procedure Division.                                              00000021
           DISPLAY MYNAME ' Begin'                                      00000022
                                                                        00000023
           >>IF F DEFINED                                               00000024
           >>IF C = 5                                                   00000025
           CALL PGM-0001                                                00000026
           >>ELSE                                                       00000027
           CALL PGM-0009                                                00000028
           >>END-IF                                                     00000029
           >>ELSE                                                       00000030
           >>IF D = 6                                                   00000031
           CALL PGM-0002                                                00000032
           >>ELSE                                                       00000033
           CALL PGM-0009                                                00000034
           >>END-IF                                                     00000035
                                                                        00000036
           >>IF E = 4                                                   00000037
           CALL PGM-0003                                                00000038
           >>ELSE                                                       00000039
           CALL PGM-0009                                                00000040
           >>END-IF                                                     00000041
           >>END-IF                                                     00000042
                                                                        00000043
           DISPLAY MYNAME ' End'                                        00000044
                                                                        00000045
           GOBACK                                                       00000046
           .                                                            00000047
                                                                        00000048
                                                                        00000049
