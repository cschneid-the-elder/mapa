       Identification Division.                                         00000001
       Program-ID. testantlr246.                                        00000002
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
           05  MYNAME               PIC X(012) VALUE 'testantlr246'.    00000013
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
           >>EVALUATE TRUE                                              00000024
           >>WHEN C = 5                                                 00000025
           CALL PGM-0001 USING                                          00000026
             MYNAME                                                     00000027
           END-CALL                                                     00000028
           >>WHEN D = 6                                                 00000029
           CALL PGM-0002                                                00000030
             MYNAME                                                     00000031
           END-CALL                                                     00000032
           >>WHEN E = 4                                                 00000033
           CALL PGM-0003                                                00000034
             MYNAME                                                     00000035
           END-CALL                                                     00000036
           >>WHEN OTHER                                                 00000037
           CALL PGM-0009                                                00000038
             MYNAME                                                     00000039
           END-CALL                                                     00000040
           >>END-EVALUATE                                               00000041
                                                                        00000042
           DISPLAY MYNAME ' End'                                        00000043
                                                                        00000044
           GOBACK                                                       00000045
           .                                                            00000046
                                                                        00000047
                                                                        00000048
