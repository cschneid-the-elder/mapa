000001 Identification Division.
000002 Program-ID. testantlr164.
000003 Data Division.
000004 Working-Storage Section.
000005
000006*
000007*comment
000008*
000009
000010 01  CONSTANTS.
000011     05  MYNAME               PIC X(012) VALUE 'testantlr164'.
000012     05  PGM1                 PIC X(008) VALUE                  'P
000013-                                                               'G
000014-                                                               'M
000015-                                                               '0
000016-                                                               '0
000017-                                                               '0
000018-                                                               '0
000019-                                                           '1'.
000020     05  PGM2                 PIC X(008) VALUE 'PGM'-
000021                          '0000'-
000022                          '2'.
000023     05  PGM3                 PIC X(008) VALUE                  "P
000024-                                                               "G
000025-                                                               "M
000026-                                                               "0
000027-                                                               "0
000028-                                                               "0
000029-                                                               "0
000030-                                                           "3".
000031     05  PGM4                 PIC X(008) VALUE "PGM"-
000032                          "0000"-
000033                          "4".
000034     05  HEX-LITERAL1         PIC X(008) VALUE                 X'A
000035-                                                               'B
000036-                                                               'C
000037-                                                               'D
000038-                                                               '0
000039-                                                               '1
000040-                                                               '2
000041-                                                             '3'.
000042     05  HEX-LITERAL2         PIC X(008) VALUE X'ABCD'-
000043                          '0123'.
000044     05  BOOLEAN-LITERAL1     PIC X(001) VALUE                 B'0
000045-                                                               '1
000046-                                                               '0
000047-                                                               '1
000048-                                                               '0
000049-                                                               '1
000050-                                                               '0
000051-                                                             '1'.
000052     05  BOOLEAN-LITERAL2     PIC X(001) VALUE B'0101'-
000053                          '0101'.
000054     05  HEX-BOOLEAN-LITERAL1 PIC X(008) VALUE                BX'0
000055-                                                               '1
000056-                                                               '2
000057-                                                               '3
000058-                                                               'A
000059-                                                               'B
000060-                                                               'C
000061-                                                             'D'.
000062     05  HEX-BOOLEAN-LITERAL2 PIC X(008) VALUE BX'0123'-
000063                          'ABCD'.
000064     05  HEX-LITERAL3         PIC X(008) VALUE                 X"A
000065-                                                               "B
000066-                                                               "C
000067-                                                               "D
000068-                                                               "0
000069-                                                               "1
000070-                                                               "2
000071-                                                             "3".
000072     05  HEX-LITERAL4         PIC X(008) VALUE X"ABCD"-
000073                          "0123".
000074     05  BOOLEAN-LITERAL3     PIC X(001) VALUE                 B"0
000075-                                                               "1
000076-                                                               "0
000077-                                                               "1
000078-                                                               "0
000079-                                                               "1
000080-                                                               "0
000081-                                                             "1".
000082     05  BOOLEAN-LITERAL4     PIC X(001) VALUE B"0101"-
000083                          "0101".
000084     05  HEX-BOOLEAN-LITERAL3 PIC X(008) VALUE                BX"0
000085-                                                               "1
000086-                                                               "2
000087-                                                               "3
000088-                                                               "A
000089-                                                               "B
000090-                                                               "C
000091-                                                             "D".
000092     05  HEX-BOOLEAN-LITERAL4 PIC X(008) VALUE BX"0123"-
000093                          "ABCD".
000094     05  NULL-TERM-LITERAL1         PIC X(009) VALUE           Z'A
000095-                                                               'B
000096-                                                               'C
000097-                                                               'D
000098-                                                               '0
000099-                                                               '1
000100-                                                               '2
000101-                                                             '3'.
000102     05  NULL-TERM-LITERAL2         PIC X(009) VALUE Z'ABCD'-
000103                          '0123'.
000104     05  NULL-TERM-LITERAL3         PIC X(009) VALUE           Z"A
000105-                                                               "B
000106-                                                               "C
000107-                                                               "D
000108-                                                               "0
000109-                                                               "1
000110-                                                               "2
000111-                                                             "3".
000112     05  NULL-TERM-LITERAL4         PIC X(009) VALUE Z"ABCD"-
000113                          "0123".
000114     05  DBCS-LITERAL1         PIC X(008) VALUE                G'A
000115-                                                               'B
000116-                                                               'C
000117-                                                               'D
000118-                                                               '0
000119-                                                               '1
000120-                                                               '2
000121-                                                             '3'.
000122     05  DBCS-LITERAL2         PIC X(008) VALUE G'ABCD'-
000123                          '0123'.
000124     05  DBCS-LITERAL3         PIC X(008) VALUE                G"A
000125-                                                               "B
000126-                                                               "C
000127-                                                               "D
000128-                                                               "0
000129-                                                               "1
000130-                                                               "2
000131-                                                             "3".
000132     05  DBCS-LITERAL4         PIC X(008) VALUE G"ABCD"-
000133                          "0123".
000134     05  NATIONAL-LITERAL1         PIC X(008) VALUE            N'A
000135-                                                               'B
000136-                                                               'C
000137-                                                               'D
000138-                                                               '0
000139-                                                               '1
000140-                                                               '2
000141-                                                             '3'.
000142     05  NATIONAL-LITERAL2         PIC X(008) VALUE N'ABCD'-
000143                          '0123'.
000144     05  NATIONAL-LITERAL3         PIC X(008) VALUE            N"A
000145-                                                               "B
000146-                                                               "C
000147-                                                               "D
000148-                                                               "0
000149-                                                               "1
000150-                                                               "2
000151-                                                             "3".
000152     05  NATIONAL-LITERAL4         PIC X(008) VALUE N"ABCD"-
000153                          "0123".
000154     05  UTF8-LITERAL1         PIC X(008) VALUE                U'A
000155-                                                               'B
000156-                                                               'C
000157-                                                               'D
000158-                                                               '0
000159-                                                               '1
000160-                                                               '2
000161-                                                             '3'.
000162     05  UTF8-LITERAL2         PIC X(008) VALUE U'ABCD'-
000163                          '0123'.
000164     05  UTF8-LITERAL3         PIC X(008) VALUE                U"A
000165-                                                               "B
000166-                                                               "C
000167-                                                               "D
000168-                                                               "0
000169-                                                               "1
000170-                                                               "2
000171-                                                             "3".
000172     05  UTF8-LITERAL4         PIC X(008) VALUE U"ABCD"-
000173                          "0123".
000174     05  NATIONAL-HEX-LITERAL1         PIC X(008) VALUE       NX'A
000175-                                                               'B
000176-                                                               'C
000177-                                                               'D
000178-                                                               '0
000179-                                                               '1
000180-                                                               '2
000181-                                                             '3'.
000182     05  NATIONAL-HEX-LITERAL2         PIC X(008) VALUE NX'ABCD'-
000183                          '0123'.
000184     05  NATIONAL-HEX-LITERAL3         PIC X(008) VALUE       NX"A
000185-                                                               "B
000186-                                                               "C
000187-                                                               "D
000188-                                                               "0
000189-                                                               "1
000190-                                                               "2
000191-                                                             "3".
000192     05  NATIONAL-HEX-LITERAL4         PIC X(008) VALUE NX"ABCD"-
000193                          "0123".
000194     05  UTF8-HEX-LITERAL1         PIC X(008) VALUE           UX'A
000195-                                                               'B
000196-                                                               'C
000197-                                                               'D
000198-                                                               '0
000199-                                                               '1
000200-                                                               '2
000201-                                                             '3'.
000202     05  UTF8-HEX-LITERAL2         PIC X(008) VALUE UX'ABCD'-
000203                          '0123'.
000204     05  UTF8-HEX-LITERAL3         PIC X(008) VALUE           UX"A
000205-                                                               "B
000206-                                                               "C
000207-                                                               "D
000208-                                                               "0
000209-                                                               "1
000210-                                                               "2
000211-                                                             "3".
000212     05  UTF8-HEX-LITERAL4         PIC X(008) VALUE UX"ABCD"-
000213                          "0123".
000214*
000215
000216 01 WORK-AREAS.
000217    05  X                     PIC X USAGE IS DISPLAY VALUE IS 'ABC
000218-'DEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?1234567890-=!@#$%^&*()_+\|abcdef
000219-'ghijklmnopqrstuvwxyz '.
000220    05  A                     PIC X USAGE IS DISPLAY VALUE IS "ABC
000221-"DEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?1234567890-=!@#$%^&*()_+\|abcdef
000222-"ghijklmnopqrstuvwxyz ".
000223
000224 Procedure Division.
000225     DISPLAY MYNAME ' Begin'
000226
000227     IF X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?\|1234567890!@#$%^
000228-"&*()-=_+ ." DISPLAY MYNAME 'IS EQUAL' END-IF
000229
000230     IF A EQUAL TO 'ABCDEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?\|123456789
000231-'0!@#$%^&*()-=_+ .' DISPLAY MYNAME 'IS EQUAL' END-IF
000232     
000233
000234     CALL PGM1
000235     CALL PGM2
000236     CALL PGM3
000237     CALL PGM4
000238
000239     DISPLAY MYNAME ' End'
000240     
000241     GOBACK
000242     .
000243
000244
