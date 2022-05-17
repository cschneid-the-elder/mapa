       Identification Division.                                         00000001
       Program-ID. testantlr264.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
      *                                                                 00000006
      *comment                                                          00000007
      *                                                                 00000008
                                                                        00000009
       01  CONSTANTS.                                                   00000010
           05  MYNAME               PIC X(012) VALUE 'testantlr264'.    00000011
           05  PGM1                 PIC X(008) VALUE                  'P00000012
      -                                                               'G00000013
      -                                                               'M00000014
      -                                                               '000000015
      -                                                               '000000016
      -                                                               '000000017
      -                                                               '000000018
      -                                                           '1'.  00000019
           05  PGM2                 PIC X(008) VALUE 'PGM'-             00000020
                                '0000'-                                 00000021
                                '2'.                                    00000022
           05  PGM3                 PIC X(008) VALUE                  "P00000023
      -                                                               "G00000024
      -                                                               "M00000025
      -                                                               "000000026
      -                                                               "000000027
      -                                                               "000000028
      -                                                               "000000029
      -                                                           "3".  00000030
           05  PGM4                 PIC X(008) VALUE "PGM"-             00000031
                                "0000"-                                 00000032
                                "4".                                    00000033
           05  HEX-LITERAL1         PIC X(008) VALUE                 X'A00000034
      -                                                               'B00000035
      -                                                               'C00000036
      -                                                               'D00000037
      -                                                               '000000038
      -                                                               '100000039
      -                                                               '200000040
      -                                                             '3'.00000041
           05  HEX-LITERAL2         PIC X(008) VALUE X'ABCD'-           00000042
                                '0123'.                                 00000043
           05  BOOLEAN-LITERAL1     PIC X(001) VALUE                 B'000000044
      -                                                               '100000045
      -                                                               '000000046
      -                                                               '100000047
      -                                                               '000000048
      -                                                               '100000049
      -                                                               '000000050
      -                                                             '1'.00000051
           05  BOOLEAN-LITERAL2     PIC X(001) VALUE B'0101'-           00000052
                                '0101'.                                 00000053
           05  HEX-BOOLEAN-LITERAL1 PIC X(008) VALUE                BX'000000054
      -                                                               '100000055
      -                                                               '200000056
      -                                                               '300000057
      -                                                               'A00000058
      -                                                               'B00000059
      -                                                               'C00000060
      -                                                             'D'.00000061
           05  HEX-BOOLEAN-LITERAL2 PIC X(008) VALUE BX'0123'-          00000062
                                'ABCD'.                                 00000063
           05  HEX-LITERAL3         PIC X(008) VALUE                 X"A00000064
      -                                                               "B00000065
      -                                                               "C00000066
      -                                                               "D00000067
      -                                                               "000000068
      -                                                               "100000069
      -                                                               "200000070
      -                                                             "3".00000071
           05  HEX-LITERAL4         PIC X(008) VALUE X"ABCD"-           00000072
                                "0123".                                 00000073
           05  BOOLEAN-LITERAL3     PIC X(001) VALUE                 B"000000074
      -                                                               "100000075
      -                                                               "000000076
      -                                                               "100000077
      -                                                               "000000078
      -                                                               "100000079
      -                                                               "000000080
      -                                                             "1".00000081
           05  BOOLEAN-LITERAL4     PIC X(001) VALUE B"0101"-           00000082
                                "0101".                                 00000083
           05  HEX-BOOLEAN-LITERAL3 PIC X(008) VALUE                BX"000000084
      -                                                               "100000085
      -                                                               "200000086
      -                                                               "300000087
      -                                                               "A00000088
      -                                                               "B00000089
      -                                                               "C00000090
      -                                                             "D".00000091
           05  HEX-BOOLEAN-LITERAL4 PIC X(008) VALUE BX"0123"-          00000092
                                "ABCD".                                 00000093
           05  NULL-TERM-LITERAL1         PIC X(009) VALUE           Z'A00000094
      -                                                               'B00000095
      -                                                               'C00000096
      -                                                               'D00000097
      -                                                               '000000098
      -                                                               '100000099
      -                                                               '200000100
      -                                                             '3'.00000101
           05  NULL-TERM-LITERAL2         PIC X(009) VALUE Z'ABCD'-     00000102
                                '0123'.                                 00000103
           05  NULL-TERM-LITERAL3         PIC X(009) VALUE           Z"A00000104
      -                                                               "B00000105
      -                                                               "C00000106
      -                                                               "D00000107
      -                                                               "000000108
      -                                                               "100000109
      -                                                               "200000110
      -                                                             "3".00000111
           05  NULL-TERM-LITERAL4         PIC X(009) VALUE Z"ABCD"-     00000112
                                "0123".                                 00000113
           05  DBCS-LITERAL1         PIC X(008) VALUE                G'A00000114
      -                                                               'B00000115
      -                                                               'C00000116
      -                                                               'D00000117
      -                                                               '000000118
      -                                                               '100000119
      -                                                               '200000120
      -                                                             '3'.00000121
           05  DBCS-LITERAL2         PIC X(008) VALUE G'ABCD'-          00000122
                                '0123'.                                 00000123
           05  DBCS-LITERAL3         PIC X(008) VALUE                G"A00000124
      -                                                               "B00000125
      -                                                               "C00000126
      -                                                               "D00000127
      -                                                               "000000128
      -                                                               "100000129
      -                                                               "200000130
      -                                                             "3".00000131
           05  DBCS-LITERAL4         PIC X(008) VALUE G"ABCD"-          00000132
                                "0123".                                 00000133
           05  NATIONAL-LITERAL1         PIC X(008) VALUE            N'A00000134
      -                                                               'B00000135
      -                                                               'C00000136
      -                                                               'D00000137
      -                                                               '000000138
      -                                                               '100000139
      -                                                               '200000140
      -                                                             '3'.00000141
           05  NATIONAL-LITERAL2         PIC X(008) VALUE N'ABCD'-      00000142
                                '0123'.                                 00000143
           05  NATIONAL-LITERAL3         PIC X(008) VALUE            N"A00000144
      -                                                               "B00000145
      -                                                               "C00000146
      -                                                               "D00000147
      -                                                               "000000148
      -                                                               "100000149
      -                                                               "200000150
      -                                                             "3".00000151
           05  NATIONAL-LITERAL4         PIC X(008) VALUE N"ABCD"-      00000152
                                "0123".                                 00000153
           05  UTF8-LITERAL1         PIC X(008) VALUE                U'A00000154
      -                                                               'B00000155
      -                                                               'C00000156
      -                                                               'D00000157
      -                                                               '000000158
      -                                                               '100000159
      -                                                               '200000160
      -                                                             '3'.00000161
           05  UTF8-LITERAL2         PIC X(008) VALUE U'ABCD'-          00000162
                                '0123'.                                 00000163
           05  UTF8-LITERAL3         PIC X(008) VALUE                U"A00000164
      -                                                               "B00000165
      -                                                               "C00000166
      -                                                               "D00000167
      -                                                               "000000168
      -                                                               "100000169
      -                                                               "200000170
      -                                                             "3".00000171
           05  UTF8-LITERAL4         PIC X(008) VALUE U"ABCD"-          00000172
                                "0123".                                 00000173
           05  NATIONAL-HEX-LITERAL1         PIC X(008) VALUE       NX'A00000174
      -                                                               'B00000175
      -                                                               'C00000176
      -                                                               'D00000177
      -                                                               '000000178
      -                                                               '100000179
      -                                                               '200000180
      -                                                             '3'.00000181
           05  NATIONAL-HEX-LITERAL2         PIC X(008) VALUE NX'ABCD'- 00000182
                                '0123'.                                 00000183
           05  NATIONAL-HEX-LITERAL3         PIC X(008) VALUE       NX"A00000184
      -                                                               "B00000185
      -                                                               "C00000186
      -                                                               "D00000187
      -                                                               "000000188
      -                                                               "100000189
      -                                                               "200000190
      -                                                             "3".00000191
           05  NATIONAL-HEX-LITERAL4         PIC X(008) VALUE NX"ABCD"- 00000192
                                "0123".                                 00000193
           05  UTF8-HEX-LITERAL1         PIC X(008) VALUE           UX'A00000194
      -                                                               'B00000195
      -                                                               'C00000196
      -                                                               'D00000197
      -                                                               '000000198
      -                                                               '100000199
      -                                                               '200000200
      -                                                             '3'.00000201
           05  UTF8-HEX-LITERAL2         PIC X(008) VALUE UX'ABCD'-     00000202
                                '0123'.                                 00000203
           05  UTF8-HEX-LITERAL3         PIC X(008) VALUE           UX"A00000204
      -                                                               "B00000205
      -                                                               "C00000206
      -                                                               "D00000207
      -                                                               "000000208
      -                                                               "100000209
      -                                                               "200000210
      -                                                             "3".00000211
           05  UTF8-HEX-LITERAL4         PIC X(008) VALUE UX"ABCD"-     00000212
                                "0123".                                 00000213
      *                                                                 00000214
                                                                        00000215
       01 WORK-AREAS.                                                   00000216
          05  X                     PIC X USAGE IS DISPLAY VALUE IS 'ABC00000217
      -'DEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000218
      -'ghijklmnopqrstuvwxyz '.                                         00000219
          05  A                     PIC X USAGE IS DISPLAY VALUE IS "ABC00000220
      -"DEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000221
      -"ghijklmnopqrstuvwxyz ".                                         00000222
                                                                        00000223
       Procedure Division.                                              00000224
           DISPLAY MYNAME ' Begin'                                      00000225
                                                                        00000226
           IF X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?\|1234567890!@#$%^00000227
      -"&*()-=_+ ." DISPLAY MYNAME 'IS EQUAL' END-IF                    00000228
                                                                        00000229
           IF A EQUAL TO 'ABCDEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?\|12345678900000230
      -'0!@#$%^&*()-=_+ .' DISPLAY MYNAME 'IS EQUAL' END-IF             00000231
                                                                        00000232
                                                                        00000233
           CALL PGM1                                                    00000234
           CALL PGM2                                                    00000235
           CALL PGM3                                                    00000236
           CALL PGM4                                                    00000237
                                                                        00000238
           DISPLAY MYNAME ' End'                                        00000239
                                                                        00000240
           GOBACK                                                       00000241
           .                                                            00000242
                                                                        00000243
                                                                        00000244
