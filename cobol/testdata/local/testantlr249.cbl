       Identification Division.                                         00000001
       Program-ID. testantlr249.                                        00000002
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
           05  MYNAME               PIC X(012) VALUE 'testantlr249'.    00000016
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
           >>IF JULIA = 'WICKER'                                        00000032
           CALL PGM-0001 USING                                          00000033
             MYNAME                                                     00000034
           END-CALL                                                     00000035
           >>END-IF                                                     00000036
           >>IF ELIOT = 'WAUGH'                                         00000037
           CALL PGM-0002 USING                                          00000038
             MYNAME                                                     00000039
           END-CALL                                                     00000040
           >>END-IF                                                     00000041
           >>IF PENNY = 'ADIYODI'                                       00000042
           CALL PGM-0003 USING                                          00000043
             MYNAME                                                     00000044
           END-CALL                                                     00000045
           >>END-IF                                                     00000046
           >>IF MARGOT = 'HANSON'                                       00000047
           CALL PGM-0004 USING                                          00000048
             MYNAME                                                     00000049
           END-CALL                                                     00000050
           >>END-IF                                                     00000051
           >>IF ALICE = 'QUINN'                                         00000052
           CALL PGM-0005 USING                                          00000053
             MYNAME                                                     00000054
           END-CALL                                                     00000055
           >>END-IF                                                     00000056
           >>IF QUENTIN = 'COLDWATER'                                   00000057
           CALL PGM-0006 USING                                          00000058
             MYNAME                                                     00000059
           END-CALL                                                     00000060
           >>END-IF                                                     00000061
           >>IF KADY = 'ORLOFF-DIAZ'                                    00000062
           CALL PGM-0007 USING                                          00000063
             MYNAME                                                     00000064
           END-CALL                                                     00000065
           >>END-IF                                                     00000066
           >>IF JOSH = 'HOBERMAN'                                       00000067
           CALL PGM-0008 USING                                          00000068
             MYNAME                                                     00000069
           END-CALL                                                     00000070
           >>END-IF                                                     00000071
           >>IF ELIOT = 'QUENTIN'                                       00000072
           CALL PGM-0009 USING                                          00000073
             MYNAME                                                     00000074
           END-CALL                                                     00000075
           >>END-IF                                                     00000076
                                                                        00000077
           >>IF JULIA = 'WICKER'                                        00000078
               CALL 'JULIA' USING                                       00000079
                 MYNAME                                                 00000080
               END-CALL                                                 00000081
               >>IF ELIOT = 'WAUGH'                                     00000082
                   CALL 'ELIOT' USING                                   00000083
                     MYNAME                                             00000084
                   END-CALL                                             00000085
                   >>IF PENNY = 'ADIYODI'                               00000086
                       CALL 'PENNY' USING                               00000087
                         MYNAME                                         00000088
                       END-CALL                                         00000089
                   >>END-IF                                             00000090
               >>END-IF                                                 00000091
               >>IF MARGOT = 'WAUGH'                                    00000092
                   CALL 'WAUGH' USING                                   00000093
                     MYNAME                                             00000094
                   END-CALL                                             00000095
               >>ELSE                                                   00000096
                   CALL 'MARGOT' USING                                  00000097
                     MYNAME                                             00000098
                   END-CALL                                             00000099
                   >>IF ALICE = 'QUINN'                                 00000100
                       CALL 'ALICE' USING                               00000101
                         MYNAME                                         00000102
                       END-CALL                                         00000103
                   >>ELSE                                               00000104
                       CALL 'QUINN' USING                               00000105
                         MYNAME                                         00000106
                       END-CALL                                         00000107
                   >>END-IF                                             00000108
               >>END-IF                                                 00000109
           >>ELSE                                                       00000110
               CALL 'WICKER' USING                                      00000111
                 MYNAME                                                 00000112
               END-CALL                                                 00000113
           >>END-IF                                                     00000114
                                                                        00000115
                                                                        00000116
           DISPLAY MYNAME ' End'                                        00000117
                                                                        00000118
           GOBACK                                                       00000119
           .                                                            00000120
                                                                        00000121
                                                                        00000122
