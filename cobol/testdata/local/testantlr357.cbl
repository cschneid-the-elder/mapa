000001 ID Division.                                                     00000001
000002 Program-ID. testantlr357.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  WORK-AREAS.                                                  00000005
000006     05  WS-POINTER            POINTER VALUE NULL.                00000006
000007     05  WS-COUNT              PIC S9(5) COMP-3 VALUE +0.         00000007
000008                                                                  00000008
000009 Linkage Section.                                                 00000009
000010 01  SOME-DATA                 PIC X(1024).                       00000010
000011 Procedure Division.                                              00000011
000012                                                                  00000012
000013     ALLOCATE                                                     00000013
000014       SOME-DATA                                                  00000014
000015                                                                  00000015
000016     FREE SOME-DATA                                               00000016
000017                                                                  00000017
000018     ALLOCATE                                                     00000018
000019       SOME-DATA                                                  00000019
000020       RETURNING WS-POINTER                                       00000020
000021                                                                  00000021
000022     FREE SOME-DATA WS-POINTER                                    00000022
000023                                                                  00000023
000024     MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000024
000025     ALLOCATE                                                     00000025
000026       WS-COUNT CHARACTERS                                        00000026
000027       RETURNING WS-POINTER                                       00000027
000028                                                                  00000028
000029     FREE WS-POINTER                                              00000029
000030                                                                  00000030
000031     ALLOCATE                                                     00000031
000032       SOME-DATA                                                  00000032
000033       INITIALIZED                                                00000033
000034                                                                  00000034
000035     FREE SOME-DATA                                               00000035
000036                                                                  00000036
000037     ALLOCATE                                                     00000037
000038       SOME-DATA                                                  00000038
000039       INITIALIZED                                                00000039
000040       RETURNING WS-POINTER                                       00000040
000041                                                                  00000041
000042     FREE SOME-DATA WS-POINTER                                    00000042
000043                                                                  00000043
000044     MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000044
000045     ALLOCATE                                                     00000045
000046       WS-COUNT CHARACTERS                                        00000046
000047       INITIALIZED                                                00000047
000048       RETURNING WS-POINTER                                       00000048
000049                                                                  00000049
000050     FREE WS-POINTER                                              00000050
000051                                                                  00000051
000052     ALLOCATE                                                     00000052
000053       SOME-DATA                                                  00000053
000054       LOC 24                                                     00000054
000055                                                                  00000055
000056     FREE SOME-DATA                                               00000056
000057                                                                  00000057
000058     ALLOCATE                                                     00000058
000059       SOME-DATA                                                  00000059
000060       LOC 24                                                     00000060
000061       RETURNING WS-POINTER                                       00000061
000062                                                                  00000062
000063     FREE SOME-DATA WS-POINTER                                    00000063
000064                                                                  00000064
000065     MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000065
000066     ALLOCATE                                                     00000066
000067       WS-COUNT CHARACTERS                                        00000067
000068       LOC 24                                                     00000068
000069       RETURNING WS-POINTER                                       00000069
000070                                                                  00000070
000071     FREE WS-POINTER                                              00000071
000072                                                                  00000072
000073     ALLOCATE                                                     00000073
000074       SOME-DATA                                                  00000074
000075       LOC 31                                                     00000075
000076                                                                  00000076
000077     FREE SOME-DATA                                               00000077
000078                                                                  00000078
000079     ALLOCATE                                                     00000079
000080       SOME-DATA                                                  00000080
000081       LOC 31                                                     00000081
000082       RETURNING WS-POINTER                                       00000082
000083                                                                  00000083
000084    FREE SOME-DATA WS-POINTER                                     00000084
000085                                                                  00000085
000086    MOVE LENGTH OF SOME-DATA TO WS-COUNT                          00000086
000087     ALLOCATE                                                     00000087
000088       WS-COUNT CHARACTERS                                        00000088
000089       LOC 31                                                     00000089
000090       RETURNING WS-POINTER                                       00000090
000091                                                                  00000091
000092     FREE WS-POINTER                                              00000092
000093                                                                  00000093
000094     ALLOCATE                                                     00000094
000095       SOME-DATA                                                  00000095
000096       LOC 64                                                     00000096
000097                                                                  00000097
000098     FREE SOME-DATA                                               00000098
000099                                                                  00000099
000100     ALLOCATE                                                     00000100
000101       SOME-DATA                                                  00000101
000102       LOC 64                                                     00000102
000103       RETURNING WS-POINTER                                       00000103
000104                                                                  00000104
000105     FREE SOME-DATA WS-POINTER                                    00000105
000106                                                                  00000106
000107     MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000107
000108     ALLOCATE                                                     00000108
000109       WS-COUNT CHARACTERS                                        00000109
000110       LOC 64                                                     00000110
000111       RETURNING WS-POINTER                                       00000111
000112                                                                  00000112
000113     FREE WS-POINTER                                              00000113
000114                                                                  00000114
000115     ALLOCATE                                                     00000115
000116       SOME-DATA                                                  00000116
000117       INITIALIZED                                                00000117
000118       LOC 64                                                     00000118
000119                                                                  00000119
000120     FREE SOME-DATA                                               00000120
000121                                                                  00000121
000122     ALLOCATE                                                     00000122
000123       SOME-DATA                                                  00000123
000124       INITIALIZED                                                00000124
000125       LOC 64                                                     00000125
000126       RETURNING WS-POINTER                                       00000126
000127                                                                  00000127
000128     FREE SOME-DATA WS-POINTER                                    00000128
000129                                                                  00000129
000130     MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000130
000131     ALLOCATE                                                     00000131
000132       WS-COUNT CHARACTERS                                        00000132
000133       INITIALIZED                                                00000133
000134       LOC 64                                                     00000134
000135       RETURNING WS-POINTER                                       00000135
000136                                                                  00000136
000137     FREE WS-POINTER                                              00000137
000138                                                                  00000138
000139     GOBACK.                                                      00000139
