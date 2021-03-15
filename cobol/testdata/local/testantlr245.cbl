       Identification Division.                                         00000001
       Program-ID. testantlr245.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       >>DEFINE A 4                                                     00000006
       >>DEFINE B 6                                                     00000007
       >>DEFINE C A + B                                                 00000008
       >>DEFINE D A * B                                                 00000009
       >>DEFINE E (D * A) / 3                                           00000010
                                                                        00000011
       01  CONSTANTS.                                                   00000012
           05  MYNAME               PIC X(012) VALUE 'testantlr245'.    00000013
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
           >>IF C = 5                                                   00000024
           CALL PGM-0001                                                00000025
           >>ELSE                                                       00000026
           CALL PGM-0009                                                00000027
           >>END-IF                                                     00000028
                                                                        00000029
           >>IF D = 6                                                   00000030
           CALL PGM-0002                                                00000031
           >>ELSE                                                       00000032
           CALL PGM-0009                                                00000033
           >>END-IF                                                     00000034
                                                                        00000035
           >>IF E = 4                                                   00000036
           CALL PGM-0003                                                00000037
           >>ELSE                                                       00000038
           CALL PGM-0009                                                00000039
           >>END-IF                                                     00000040
                                                                        00000041
           DISPLAY MYNAME ' End'                                        00000042
                                                                        00000043
           GOBACK                                                       00000044
           .                                                            00000045
                                                                        00000046
                                                                        00000047
