000001 Identification Division.                                         00000001
000002 Program-ID. testantlr349.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006 >>DEFINE JULIA 'WICKER'                                          00000006
000007 >>DEFINE ELIOT 'WAUGH'                                           00000007
000008 >>DEFINE PENNY 'ADIYODI'                                         00000008
000009 >>DEFINE MARGOT 'HANSON'                                         00000009
000010 >>DEFINE ALICE 'QUINN'                                           00000010
000011 >>DEFINE QUENTIN 'COLDWATER'                                     00000011
000012 >>DEFINE KADY 'ORLOFF-DIAZ'                                      00000012
000013 >>DEFINE JOSH 'HOBERMAN'                                         00000013
000014                                                                  00000014
000015 01  CONSTANTS.                                                   00000015
000016     05  MYNAME               PIC X(012) VALUE 'testantlr349'.    00000016
000017     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000017
000018     05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.        00000018
000019     05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.        00000019
000020     05  PGM-0004             PIC X(008) VALUE 'PGMA0004'.        00000020
000021     05  PGM-0005             PIC X(008) VALUE 'PGMA0005'.        00000021
000022     05  PGM-0006             PIC X(008) VALUE 'PGMA0006'.        00000022
000023     05  PGM-0007             PIC X(008) VALUE 'PGMA0007'.        00000023
000024     05  PGM-0008             PIC X(008) VALUE 'PGMA0008'.        00000024
000025     05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.        00000025
000026                                                                  00000026
000027*                                                                 00000027
000028                                                                  00000028
000029 Procedure Division.                                              00000029
000030     DISPLAY MYNAME ' Begin'                                      00000030
000031                                                                  00000031
000032     >>IF JULIA = 'WICKER'                                        00000032
000033     CALL PGM-0001 USING                                          00000033
000034       MYNAME                                                     00000034
000035     END-CALL                                                     00000035
000036     >>END-IF                                                     00000036
000037     >>IF ELIOT = 'WAUGH'                                         00000037
000038     CALL PGM-0002 USING                                          00000038
000039       MYNAME                                                     00000039
000040     END-CALL                                                     00000040
000041     >>END-IF                                                     00000041
000042     >>IF PENNY = 'ADIYODI'                                       00000042
000043     CALL PGM-0003 USING                                          00000043
000044       MYNAME                                                     00000044
000045     END-CALL                                                     00000045
000046     >>END-IF                                                     00000046
000047     >>IF MARGOT = 'HANSON'                                       00000047
000048     CALL PGM-0004 USING                                          00000048
000049       MYNAME                                                     00000049
000050     END-CALL                                                     00000050
000051     >>END-IF                                                     00000051
000052     >>IF ALICE = 'QUINN'                                         00000052
000053     CALL PGM-0005 USING                                          00000053
000054       MYNAME                                                     00000054
000055     END-CALL                                                     00000055
000056     >>END-IF                                                     00000056
000057     >>IF QUENTIN = 'COLDWATER'                                   00000057
000058     CALL PGM-0006 USING                                          00000058
000059       MYNAME                                                     00000059
000060     END-CALL                                                     00000060
000061     >>END-IF                                                     00000061
000062     >>IF KADY = 'ORLOFF-DIAZ'                                    00000062
000063     CALL PGM-0007 USING                                          00000063
000064       MYNAME                                                     00000064
000065     END-CALL                                                     00000065
000066     >>END-IF                                                     00000066
000067     >>IF JOSH = 'HOBERMAN'                                       00000067
000068     CALL PGM-0008 USING                                          00000068
000069       MYNAME                                                     00000069
000070     END-CALL                                                     00000070
000071     >>END-IF                                                     00000071
000072     >>IF ELIOT = 'QUENTIN'                                       00000072
000073     CALL PGM-0009 USING                                          00000073
000074       MYNAME                                                     00000074
000075     END-CALL                                                     00000075
000076     >>END-IF                                                     00000076
000077                                                                  00000077
000078     >>IF JULIA = 'WICKER'                                        00000078
000079         CALL 'JULIA' USING                                       00000079
000080           MYNAME                                                 00000080
000081         END-CALL                                                 00000081
000082         >>IF ELIOT = 'WAUGH'                                     00000082
000083             CALL 'ELIOT' USING                                   00000083
000084               MYNAME                                             00000084
000085             END-CALL                                             00000085
000086             >>IF PENNY = 'ADIYODI'                               00000086
000087                 CALL 'PENNY' USING                               00000087
000088                   MYNAME                                         00000088
000089                 END-CALL                                         00000089
000090             >>END-IF                                             00000090
000091         >>END-IF                                                 00000091
000092         >>IF MARGOT = 'WAUGH'                                    00000092
000093             CALL 'WAUGH' USING                                   00000093
000094               MYNAME                                             00000094
000095             END-CALL                                             00000095
000096         >>ELSE                                                   00000096
000097             CALL 'MARGOT' USING                                  00000097
000098               MYNAME                                             00000098
000099             END-CALL                                             00000099
000100             >>IF ALICE = 'QUINN'                                 00000100
000101                 CALL 'ALICE' USING                               00000101
000102                   MYNAME                                         00000102
000103                 END-CALL                                         00000103
000104             >>ELSE                                               00000104
000105                 CALL 'QUINN' USING                               00000105
000106                   MYNAME                                         00000106
000107                 END-CALL                                         00000107
000108             >>END-IF                                             00000108
000109         >>END-IF                                                 00000109
000110     >>ELSE                                                       00000110
000111         CALL 'WICKER' USING                                      00000111
000112           MYNAME                                                 00000112
000113         END-CALL                                                 00000113
000114     >>END-IF                                                     00000114
000115                                                                  00000115
000116                                                                  00000116
000117     DISPLAY MYNAME ' End'                                        00000117
000118                                                                  00000118
000119     GOBACK                                                       00000119
000120     .                                                            00000120
000121                                                                  00000121
000122                                                                  00000122
