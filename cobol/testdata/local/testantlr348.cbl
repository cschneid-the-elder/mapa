000001 Identification Division.                                         00000001
000002 Program-ID. testantlr348.                                        00000002
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
000016     05  MYNAME               PIC X(012) VALUE 'testantlr348'.    00000016
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
000032     >>EVALUATE TRUE                                              00000032
000033     >>WHEN JULIA = 'WICKER'                                      00000033
000034     CALL PGM-0001 USING                                          00000034
000035       MYNAME                                                     00000035
000036     END-CALL                                                     00000036
000037     >>WHEN ELIOT = 'WAUGH'                                       00000037
000038     CALL PGM-0002                                                00000038
000039       MYNAME                                                     00000039
000040     END-CALL                                                     00000040
000041     >>WHEN PENNY = 'ADIYODI'                                     00000041
000042     CALL PGM-0003                                                00000042
000043       MYNAME                                                     00000043
000044     END-CALL                                                     00000044
000045     >>WHEN MARGOT = 'HANSON'                                     00000045
000046     CALL PGM-0004                                                00000046
000047       MYNAME                                                     00000047
000048     END-CALL                                                     00000048
000049     >>WHEN ALICE = 'QUINN'                                       00000049
000050     CALL PGM-0005                                                00000050
000051       MYNAME                                                     00000051
000052     END-CALL                                                     00000052
000053     >>WHEN QUENTIN = 'COLDWATER'                                 00000053
000054     CALL PGM-0006                                                00000054
000055       MYNAME                                                     00000055
000056     END-CALL                                                     00000056
000057     >>WHEN KADY = 'ORLOFF-DIAZ'                                  00000057
000058     CALL PGM-0007                                                00000058
000059       MYNAME                                                     00000059
000060     END-CALL                                                     00000060
000061     >>WHEN JOSH = 'HOBERMAN'                                     00000061
000062     CALL PGM-0008                                                00000062
000063       MYNAME                                                     00000063
000064     END-CALL                                                     00000064
000065     >>WHEN OTHER                                                 00000065
000066     CALL PGM-0009                                                00000066
000067       MYNAME                                                     00000067
000068     END-CALL                                                     00000068
000069     >>END-EVALUATE                                               00000069
000070                                                                  00000070
000071     DISPLAY MYNAME ' End'                                        00000071
000072                                                                  00000072
000073     GOBACK                                                       00000073
000074     .                                                            00000074
000075                                                                  00000075
000076                                                                  00000076
