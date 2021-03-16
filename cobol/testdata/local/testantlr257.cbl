       ID Division.                                                     00000001
       Program-ID. testantlr257.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
       01  WORK-AREAS.                                                  00000005
           05  WS-POINTER            POINTER VALUE NULL.                00000006
           05  WS-COUNT              PIC S9(5) COMP-3 VALUE +0.         00000007
                                                                        00000008
       Linkage Section.                                                 00000009
       01  SOME-DATA                 PIC X(1024).                       00000010
       Procedure Division.                                              00000011
                                                                        00000012
           ALLOCATE                                                     00000013
             SOME-DATA                                                  00000014
                                                                        00000015
           FREE SOME-DATA                                               00000016
                                                                        00000017
           ALLOCATE                                                     00000018
             SOME-DATA                                                  00000019
             RETURNING WS-POINTER                                       00000020
                                                                        00000021
           FREE SOME-DATA WS-POINTER                                    00000022
                                                                        00000023
           MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000024
           ALLOCATE                                                     00000025
             WS-COUNT CHARACTERS                                        00000026
             RETURNING WS-POINTER                                       00000027
                                                                        00000028
           FREE WS-POINTER                                              00000029
                                                                        00000030
           ALLOCATE                                                     00000031
             SOME-DATA                                                  00000032
             INITIALIZED                                                00000033
                                                                        00000034
           FREE SOME-DATA                                               00000035
                                                                        00000036
           ALLOCATE                                                     00000037
             SOME-DATA                                                  00000038
             INITIALIZED                                                00000039
             RETURNING WS-POINTER                                       00000040
                                                                        00000041
           FREE SOME-DATA WS-POINTER                                    00000042
                                                                        00000043
           MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000044
           ALLOCATE                                                     00000045
             WS-COUNT CHARACTERS                                        00000046
             INITIALIZED                                                00000047
             RETURNING WS-POINTER                                       00000048
                                                                        00000049
           FREE WS-POINTER                                              00000050
                                                                        00000051
           ALLOCATE                                                     00000052
             SOME-DATA                                                  00000053
             LOC 24                                                     00000054
                                                                        00000055
           FREE SOME-DATA                                               00000056
                                                                        00000057
           ALLOCATE                                                     00000058
             SOME-DATA                                                  00000059
             LOC 24                                                     00000060
             RETURNING WS-POINTER                                       00000061
                                                                        00000062
           FREE SOME-DATA WS-POINTER                                    00000063
                                                                        00000064
           MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000065
           ALLOCATE                                                     00000066
             WS-COUNT CHARACTERS                                        00000067
             LOC 24                                                     00000068
             RETURNING WS-POINTER                                       00000069
                                                                        00000070
           FREE WS-POINTER                                              00000071
                                                                        00000072
           ALLOCATE                                                     00000073
             SOME-DATA                                                  00000074
             LOC 31                                                     00000075
                                                                        00000076
           FREE SOME-DATA                                               00000077
                                                                        00000078
           ALLOCATE                                                     00000079
             SOME-DATA                                                  00000080
             LOC 31                                                     00000081
             RETURNING WS-POINTER                                       00000082
                                                                        00000083
          FREE SOME-DATA WS-POINTER                                     00000084
                                                                        00000085
          MOVE LENGTH OF SOME-DATA TO WS-COUNT                          00000086
           ALLOCATE                                                     00000087
             WS-COUNT CHARACTERS                                        00000088
             LOC 31                                                     00000089
             RETURNING WS-POINTER                                       00000090
                                                                        00000091
           FREE WS-POINTER                                              00000092
                                                                        00000093
           ALLOCATE                                                     00000094
             SOME-DATA                                                  00000095
             LOC 64                                                     00000096
                                                                        00000097
           FREE SOME-DATA                                               00000098
                                                                        00000099
           ALLOCATE                                                     00000100
             SOME-DATA                                                  00000101
             LOC 64                                                     00000102
             RETURNING WS-POINTER                                       00000103
                                                                        00000104
           FREE SOME-DATA WS-POINTER                                    00000105
                                                                        00000106
           MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000107
           ALLOCATE                                                     00000108
             WS-COUNT CHARACTERS                                        00000109
             LOC 64                                                     00000110
             RETURNING WS-POINTER                                       00000111
                                                                        00000112
           FREE WS-POINTER                                              00000113
                                                                        00000114
           ALLOCATE                                                     00000115
             SOME-DATA                                                  00000116
             INITIALIZED                                                00000117
             LOC 64                                                     00000118
                                                                        00000119
           FREE SOME-DATA                                               00000120
                                                                        00000121
           ALLOCATE                                                     00000122
             SOME-DATA                                                  00000123
             INITIALIZED                                                00000124
             LOC 64                                                     00000125
             RETURNING WS-POINTER                                       00000126
                                                                        00000127
           FREE SOME-DATA WS-POINTER                                    00000128
                                                                        00000129
           MOVE LENGTH OF SOME-DATA TO WS-COUNT                         00000130
           ALLOCATE                                                     00000131
             WS-COUNT CHARACTERS                                        00000132
             INITIALIZED                                                00000133
             LOC 64                                                     00000134
             RETURNING WS-POINTER                                       00000135
                                                                        00000136
           FREE WS-POINTER                                              00000137
                                                                        00000138
           GOBACK.                                                      00000139
