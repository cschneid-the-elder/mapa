000001 Identification Division.                                         00000001
000002 Program-ID. testantlr364.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006*                                                                 00000006
000007*comment                                                          00000007
000008*                                                                 00000008
000009                                                                  00000009
000010 01  CONSTANTS.                                                   00000010
000011     05  MYNAME               PIC X(012) VALUE 'testantlr364'.    00000011
000012     05  PGM1                 PIC X(008) VALUE                  'P00000012
000013-                                                               'G00000013
000014-                                                               'M00000014
000015-                                                               '000000015
000016-                                                               '000000016
000017-                                                               '000000017
000018-                                                               '000000018
000019-                                                           '1'.  00000019
000020     05  PGM2                 PIC X(008) VALUE 'PGM'-             00000020
000021                          '0000'-                                 00000021
000022                          '2'.                                    00000022
000023     05  PGM3                 PIC X(008) VALUE                  "P00000023
000024-                                                               "G00000024
000025-                                                               "M00000025
000026-                                                               "000000026
000027-                                                               "000000027
000028-                                                               "000000028
000029-                                                               "000000029
000030-                                                           "3".  00000030
000031     05  PGM4                 PIC X(008) VALUE "PGM"-             00000031
000032                          "0000"-                                 00000032
000033                          "4".                                    00000033
000034     05  HEX-LITERAL1         PIC X(008) VALUE                 X'A00000034
000035-                                                               'B00000035
000036-                                                               'C00000036
000037-                                                               'D00000037
000038-                                                               '000000038
000039-                                                               '100000039
000040-                                                               '200000040
000041-                                                             '3'.00000041
000042     05  HEX-LITERAL2         PIC X(008) VALUE X'ABCD'-           00000042
000043                          '0123'.                                 00000043
000044     05  BOOLEAN-LITERAL1     PIC X(001) VALUE                 B'000000044
000045-                                                               '100000045
000046-                                                               '000000046
000047-                                                               '100000047
000048-                                                               '000000048
000049-                                                               '100000049
000050-                                                               '000000050
000051-                                                             '1'.00000051
000052     05  BOOLEAN-LITERAL2     PIC X(001) VALUE B'0101'-           00000052
000053                          '0101'.                                 00000053
000054     05  HEX-BOOLEAN-LITERAL1 PIC X(008) VALUE                BX'000000054
000055-                                                               '100000055
000056-                                                               '200000056
000057-                                                               '300000057
000058-                                                               'A00000058
000059-                                                               'B00000059
000060-                                                               'C00000060
000061-                                                             'D'.00000061
000062     05  HEX-BOOLEAN-LITERAL2 PIC X(008) VALUE BX'0123'-          00000062
000063                          'ABCD'.                                 00000063
000064     05  HEX-LITERAL3         PIC X(008) VALUE                 X"A00000064
000065-                                                               "B00000065
000066-                                                               "C00000066
000067-                                                               "D00000067
000068-                                                               "000000068
000069-                                                               "100000069
000070-                                                               "200000070
000071-                                                             "3".00000071
000072     05  HEX-LITERAL4         PIC X(008) VALUE X"ABCD"-           00000072
000073                          "0123".                                 00000073
000074     05  BOOLEAN-LITERAL3     PIC X(001) VALUE                 B"000000074
000075-                                                               "100000075
000076-                                                               "000000076
000077-                                                               "100000077
000078-                                                               "000000078
000079-                                                               "100000079
000080-                                                               "000000080
000081-                                                             "1".00000081
000082     05  BOOLEAN-LITERAL4     PIC X(001) VALUE B"0101"-           00000082
000083                          "0101".                                 00000083
000084     05  HEX-BOOLEAN-LITERAL3 PIC X(008) VALUE                BX"000000084
000085-                                                               "100000085
000086-                                                               "200000086
000087-                                                               "300000087
000088-                                                               "A00000088
000089-                                                               "B00000089
000090-                                                               "C00000090
000091-                                                             "D".00000091
000092     05  HEX-BOOLEAN-LITERAL4 PIC X(008) VALUE BX"0123"-          00000092
000093                          "ABCD".                                 00000093
000094     05  NULL-TERM-LITERAL1         PIC X(009) VALUE           Z'A00000094
000095-                                                               'B00000095
000096-                                                               'C00000096
000097-                                                               'D00000097
000098-                                                               '000000098
000099-                                                               '100000099
000100-                                                               '200000100
000101-                                                             '3'.00000101
000102     05  NULL-TERM-LITERAL2         PIC X(009) VALUE Z'ABCD'-     00000102
000103                          '0123'.                                 00000103
000104     05  NULL-TERM-LITERAL3         PIC X(009) VALUE           Z"A00000104
000105-                                                               "B00000105
000106-                                                               "C00000106
000107-                                                               "D00000107
000108-                                                               "000000108
000109-                                                               "100000109
000110-                                                               "200000110
000111-                                                             "3".00000111
000112     05  NULL-TERM-LITERAL4         PIC X(009) VALUE Z"ABCD"-     00000112
000113                          "0123".                                 00000113
000114     05  DBCS-LITERAL1         PIC X(008) VALUE                G'A00000114
000115-                                                               'B00000115
000116-                                                               'C00000116
000117-                                                               'D00000117
000118-                                                               '000000118
000119-                                                               '100000119
000120-                                                               '200000120
000121-                                                             '3'.00000121
000122     05  DBCS-LITERAL2         PIC X(008) VALUE G'ABCD'-          00000122
000123                          '0123'.                                 00000123
000124     05  DBCS-LITERAL3         PIC X(008) VALUE                G"A00000124
000125-                                                               "B00000125
000126-                                                               "C00000126
000127-                                                               "D00000127
000128-                                                               "000000128
000129-                                                               "100000129
000130-                                                               "200000130
000131-                                                             "3".00000131
000132     05  DBCS-LITERAL4         PIC X(008) VALUE G"ABCD"-          00000132
000133                          "0123".                                 00000133
000134     05  NATIONAL-LITERAL1         PIC X(008) VALUE            N'A00000134
000135-                                                               'B00000135
000136-                                                               'C00000136
000137-                                                               'D00000137
000138-                                                               '000000138
000139-                                                               '100000139
000140-                                                               '200000140
000141-                                                             '3'.00000141
000142     05  NATIONAL-LITERAL2         PIC X(008) VALUE N'ABCD'-      00000142
000143                          '0123'.                                 00000143
000144     05  NATIONAL-LITERAL3         PIC X(008) VALUE            N"A00000144
000145-                                                               "B00000145
000146-                                                               "C00000146
000147-                                                               "D00000147
000148-                                                               "000000148
000149-                                                               "100000149
000150-                                                               "200000150
000151-                                                             "3".00000151
000152     05  NATIONAL-LITERAL4         PIC X(008) VALUE N"ABCD"-      00000152
000153                          "0123".                                 00000153
000154     05  UTF8-LITERAL1         PIC X(008) VALUE                U'A00000154
000155-                                                               'B00000155
000156-                                                               'C00000156
000157-                                                               'D00000157
000158-                                                               '000000158
000159-                                                               '100000159
000160-                                                               '200000160
000161-                                                             '3'.00000161
000162     05  UTF8-LITERAL2         PIC X(008) VALUE U'ABCD'-          00000162
000163                          '0123'.                                 00000163
000164     05  UTF8-LITERAL3         PIC X(008) VALUE                U"A00000164
000165-                                                               "B00000165
000166-                                                               "C00000166
000167-                                                               "D00000167
000168-                                                               "000000168
000169-                                                               "100000169
000170-                                                               "200000170
000171-                                                             "3".00000171
000172     05  UTF8-LITERAL4         PIC X(008) VALUE U"ABCD"-          00000172
000173                          "0123".                                 00000173
000174     05  NATIONAL-HEX-LITERAL1         PIC X(008) VALUE       NX'A00000174
000175-                                                               'B00000175
000176-                                                               'C00000176
000177-                                                               'D00000177
000178-                                                               '000000178
000179-                                                               '100000179
000180-                                                               '200000180
000181-                                                             '3'.00000181
000182     05  NATIONAL-HEX-LITERAL2         PIC X(008) VALUE NX'ABCD'- 00000182
000183                          '0123'.                                 00000183
000184     05  NATIONAL-HEX-LITERAL3         PIC X(008) VALUE       NX"A00000184
000185-                                                               "B00000185
000186-                                                               "C00000186
000187-                                                               "D00000187
000188-                                                               "000000188
000189-                                                               "100000189
000190-                                                               "200000190
000191-                                                             "3".00000191
000192     05  NATIONAL-HEX-LITERAL4         PIC X(008) VALUE NX"ABCD"- 00000192
000193                          "0123".                                 00000193
000194     05  UTF8-HEX-LITERAL1         PIC X(008) VALUE           UX'A00000194
000195-                                                               'B00000195
000196-                                                               'C00000196
000197-                                                               'D00000197
000198-                                                               '000000198
000199-                                                               '100000199
000200-                                                               '200000200
000201-                                                             '3'.00000201
000202     05  UTF8-HEX-LITERAL2         PIC X(008) VALUE UX'ABCD'-     00000202
000203                          '0123'.                                 00000203
000204     05  UTF8-HEX-LITERAL3         PIC X(008) VALUE           UX"A00000204
000205-                                                               "B00000205
000206-                                                               "C00000206
000207-                                                               "D00000207
000208-                                                               "000000208
000209-                                                               "100000209
000210-                                                               "200000210
000211-                                                             "3".00000211
000212     05  UTF8-HEX-LITERAL4         PIC X(008) VALUE UX"ABCD"-     00000212
000213                          "0123".                                 00000213
000214*                                                                 00000214
000215                                                                  00000215
000216 01 WORK-AREAS.                                                   00000216
000217    05  X                     PIC X USAGE IS DISPLAY VALUE IS 'ABC00000217
000218-'DEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000218
000219-'ghijklmnopqrstuvwxyz '.                                         00000219
000220    05  A                     PIC X USAGE IS DISPLAY VALUE IS "ABC00000220
000221-"DEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?1234567890-=!@#$%^&*()_+\|abcdef00000221
000222-"ghijklmnopqrstuvwxyz ".                                         00000222
000223                                                                  00000223
000224 Procedure Division.                                              00000224
000225     DISPLAY MYNAME ' Begin'                                      00000225
000226                                                                  00000226
000227     IF X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?\|1234567890!@#$%^00000227
000228-"&*()-=_+ ." DISPLAY MYNAME 'IS EQUAL' END-IF                    00000228
000229                                                                  00000229
000230     IF A EQUAL TO 'ABCDEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?\|12345678900000230
000231-'0!@#$%^&*()-=_+ .' DISPLAY MYNAME 'IS EQUAL' END-IF             00000231
000232                                                                  00000232
000233                                                                  00000233
000234     CALL PGM1                                                    00000234
000235     CALL PGM2                                                    00000235
000236     CALL PGM3                                                    00000236
000237     CALL PGM4                                                    00000237
000238                                                                  00000238
000239     DISPLAY MYNAME ' End'                                        00000239
000240                                                                  00000240
000241     GOBACK                                                       00000241
000242     .                                                            00000242
000243                                                                  00000243
000244                                                                  00000244
