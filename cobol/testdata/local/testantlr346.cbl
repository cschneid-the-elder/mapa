000001 Identification Division.                                         00000001
000002 Program-ID. testantlr346.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 >>DEFINE A 2                                                     00000006
000007 >>DEFINE B 3                                                     00000007
000008 >>DEFINE C A + B                                                 00000008
000009 >>DEFINE D A * B                                                 00000009
000010 >>DEFINE E (D * A) / 3                                           00000010
000011                                                                  00000011
000012 01  CONSTANTS.                                                   00000012
000013     05  MYNAME               PIC X(012) VALUE 'testantlr346'.    00000013
000014     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000014
000015     05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000015
000016     05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000016
000017     05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.        00000017
000018                                                                  00000018
000019*                                                                 00000019
000020                                                                  00000020
000021 Procedure Division.                                              00000021
000022     DISPLAY MYNAME ' Begin'                                      00000022
000023                                                                  00000023
000024     >>EVALUATE TRUE                                              00000024
000025     >>WHEN C = 5                                                 00000025
000026     CALL PGM-0001 USING                                          00000026
000027       MYNAME                                                     00000027
000028     END-CALL                                                     00000028
000029     >>WHEN D = 6                                                 00000029
000030     CALL PGM-0002                                                00000030
000031       MYNAME                                                     00000031
000032     END-CALL                                                     00000032
000033     >>WHEN E = 4                                                 00000033
000034     CALL PGM-0003                                                00000034
000035       MYNAME                                                     00000035
000036     END-CALL                                                     00000036
000037     >>WHEN OTHER                                                 00000037
000038     CALL PGM-0009                                                00000038
000039       MYNAME                                                     00000039
000040     END-CALL                                                     00000040
000041     >>END-EVALUATE                                               00000041
000042                                                                  00000042
000043     DISPLAY MYNAME ' End'                                        00000043
000044                                                                  00000044
000045     GOBACK                                                       00000045
000046     .                                                            00000046
000047                                                                  00000047
000048                                                                  00000048
