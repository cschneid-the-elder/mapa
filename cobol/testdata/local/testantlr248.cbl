       Identification Division.                                         00000001
       Program-ID. testantlr248.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
       >>DEFINE JULIA 'WICKER'                                          00000006
       >>DEFINE ELIOT 'WAUGH'                                           00000007
       >>DEFINE PENNY 'ADIYODI'                                         00000008
       >>DEFINE MARGOT 'HANSON'                                         00000009
       >>DEFINE ALICE 'QUINN'                                           00000010
       >>DEFINE QUENTIN 'COLDWATER'                                     00000011
       >>DEFINE KADY 'ORLOFF-DIAZ'                                      00000012
       >>DEFINE JOSH 'HOBERMAN'                                         00000013
                                                                        00000014
       01  CONSTANTS.                                                   00000015
           05  MYNAME               PIC X(012) VALUE 'testantlr248'.    00000016
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000017
           05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000018
           05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000019
           05  PGM-0004             PIC X(008) VALUE 'PGMA0004'.        00000020
           05  PGM-0005             PIC X(008) VALUE 'PGMA0005'.        00000021
           05  PGM-0006             PIC X(008) VALUE 'PGMA0006'.        00000022
           05  PGM-0007             PIC X(008) VALUE 'PGMA0007'.        00000023
           05  PGM-0008             PIC X(008) VALUE 'PGMA0008'.        00000024
           05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.        00000025
                                                                        00000026
      *                                                                 00000027
                                                                        00000028
       Procedure Division.                                              00000029
           DISPLAY MYNAME ' Begin'                                      00000030
                                                                        00000031
           >>EVALUATE TRUE                                              00000032
           >>WHEN JULIA = 'WICKER'                                      00000033
           CALL PGM-0001 USING                                          00000034
             MYNAME                                                     00000035
           END-CALL                                                     00000036
           >>WHEN ELIOT = 'WAUGH'                                       00000037
           CALL PGM-0002                                                00000038
             MYNAME                                                     00000039
           END-CALL                                                     00000040
           >>WHEN PENNY = 'ADIYODI'                                     00000041
           CALL PGM-0003                                                00000042
             MYNAME                                                     00000043
           END-CALL                                                     00000044
           >>WHEN MARGOT = 'HANSON'                                     00000045
           CALL PGM-0004                                                00000046
             MYNAME                                                     00000047
           END-CALL                                                     00000048
           >>WHEN ALICE = 'QUINN'                                       00000049
           CALL PGM-0005                                                00000050
             MYNAME                                                     00000051
           END-CALL                                                     00000052
           >>WHEN QUENTIN = 'COLDWATER'                                 00000053
           CALL PGM-0006                                                00000054
             MYNAME                                                     00000055
           END-CALL                                                     00000056
           >>WHEN KADY = 'ORLOFF-DIAZ'                                  00000057
           CALL PGM-0007                                                00000058
             MYNAME                                                     00000059
           END-CALL                                                     00000060
           >>WHEN JOSH = 'HOBERMAN'                                     00000061
           CALL PGM-0008                                                00000062
             MYNAME                                                     00000063
           END-CALL                                                     00000064
           >>WHEN OTHER                                                 00000065
           CALL PGM-0009                                                00000066
             MYNAME                                                     00000067
           END-CALL                                                     00000068
           >>END-EVALUATE                                               00000069
                                                                        00000070
           DISPLAY MYNAME ' End'                                        00000071
                                                                        00000072
           GOBACK                                                       00000073
           .                                                            00000074
                                                                        00000075
                                                                        00000076
