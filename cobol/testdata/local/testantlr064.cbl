       Identification Division.
       Program-ID. testantlr064.
       Data Division.
       Working-Storage Section.

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr064'.
           05  PGM1                 PIC X(008) VALUE                  'P
      -                                                               'G
      -                                                               'M
      -                                                               '0
      -                                                               '0
      -                                                               '0
      -                                                               '0
      -                                                           '1'.
           05  PGM2                 PIC X(008) VALUE 'PGM'-
                                '0000'-
                                '2'.
           05  PGM3                 PIC X(008) VALUE                  "P
      -                                                               "G
      -                                                               "M
      -                                                               "0
      -                                                               "0
      -                                                               "0
      -                                                               "0
      -                                                           "3".
           05  PGM4                 PIC X(008) VALUE "PGM"-
                                "0000"-
                                "4".
           05  HEX-LITERAL1         PIC X(008) VALUE                 X'A
      -                                                               'B
      -                                                               'C
      -                                                               'D
      -                                                               '0
      -                                                               '1
      -                                                               '2
      -                                                             '3'.
           05  HEX-LITERAL2         PIC X(008) VALUE X'ABCD'-
                                '0123'.
           05  BOOLEAN-LITERAL1     PIC X(001) VALUE                 B'0
      -                                                               '1
      -                                                               '0
      -                                                               '1
      -                                                               '0
      -                                                               '1
      -                                                               '0
      -                                                             '1'.
           05  BOOLEAN-LITERAL2     PIC X(001) VALUE B'0101'-
                                '0101'.
           05  HEX-BOOLEAN-LITERAL1 PIC X(008) VALUE                BX'0
      -                                                               '1
      -                                                               '2
      -                                                               '3
      -                                                               'A
      -                                                               'B
      -                                                               'C
      -                                                             'D'.
           05  HEX-BOOLEAN-LITERAL2 PIC X(008) VALUE BX'0123'-
                                'ABCD'.
           05  HEX-LITERAL3         PIC X(008) VALUE                 X"A
      -                                                               "B
      -                                                               "C
      -                                                               "D
      -                                                               "0
      -                                                               "1
      -                                                               "2
      -                                                             "3".
           05  HEX-LITERAL4         PIC X(008) VALUE X"ABCD"-
                                "0123".
           05  BOOLEAN-LITERAL3     PIC X(001) VALUE                 B"0
      -                                                               "1
      -                                                               "0
      -                                                               "1
      -                                                               "0
      -                                                               "1
      -                                                               "0
      -                                                             "1".
           05  BOOLEAN-LITERAL4     PIC X(001) VALUE B"0101"-
                                "0101".
           05  HEX-BOOLEAN-LITERAL3 PIC X(008) VALUE                BX"0
      -                                                               "1
      -                                                               "2
      -                                                               "3
      -                                                               "A
      -                                                               "B
      -                                                               "C
      -                                                             "D".
           05  HEX-BOOLEAN-LITERAL4 PIC X(008) VALUE BX"0123"-
                                "ABCD".
           05  NULL-TERM-LITERAL1         PIC X(009) VALUE           Z'A
      -                                                               'B
      -                                                               'C
      -                                                               'D
      -                                                               '0
      -                                                               '1
      -                                                               '2
      -                                                             '3'.
           05  NULL-TERM-LITERAL2         PIC X(009) VALUE Z'ABCD'-
                                '0123'.
           05  NULL-TERM-LITERAL3         PIC X(009) VALUE           Z"A
      -                                                               "B
      -                                                               "C
      -                                                               "D
      -                                                               "0
      -                                                               "1
      -                                                               "2
      -                                                             "3".
           05  NULL-TERM-LITERAL4         PIC X(009) VALUE Z"ABCD"-
                                "0123".
           05  DBCS-LITERAL1         PIC X(008) VALUE                G'A
      -                                                               'B
      -                                                               'C
      -                                                               'D
      -                                                               '0
      -                                                               '1
      -                                                               '2
      -                                                             '3'.
           05  DBCS-LITERAL2         PIC X(008) VALUE G'ABCD'-
                                '0123'.
           05  DBCS-LITERAL3         PIC X(008) VALUE                G"A
      -                                                               "B
      -                                                               "C
      -                                                               "D
      -                                                               "0
      -                                                               "1
      -                                                               "2
      -                                                             "3".
           05  DBCS-LITERAL4         PIC X(008) VALUE G"ABCD"-
                                "0123".
           05  NATIONAL-LITERAL1         PIC X(008) VALUE            N'A
      -                                                               'B
      -                                                               'C
      -                                                               'D
      -                                                               '0
      -                                                               '1
      -                                                               '2
      -                                                             '3'.
           05  NATIONAL-LITERAL2         PIC X(008) VALUE N'ABCD'-
                                '0123'.
           05  NATIONAL-LITERAL3         PIC X(008) VALUE            N"A
      -                                                               "B
      -                                                               "C
      -                                                               "D
      -                                                               "0
      -                                                               "1
      -                                                               "2
      -                                                             "3".
           05  NATIONAL-LITERAL4         PIC X(008) VALUE N"ABCD"-
                                "0123".
           05  UTF8-LITERAL1         PIC X(008) VALUE                U'A
      -                                                               'B
      -                                                               'C
      -                                                               'D
      -                                                               '0
      -                                                               '1
      -                                                               '2
      -                                                             '3'.
           05  UTF8-LITERAL2         PIC X(008) VALUE U'ABCD'-
                                '0123'.
           05  UTF8-LITERAL3         PIC X(008) VALUE                U"A
      -                                                               "B
      -                                                               "C
      -                                                               "D
      -                                                               "0
      -                                                               "1
      -                                                               "2
      -                                                             "3".
           05  UTF8-LITERAL4         PIC X(008) VALUE U"ABCD"-
                                "0123".
           05  NATIONAL-HEX-LITERAL1         PIC X(008) VALUE       NX'A
      -                                                               'B
      -                                                               'C
      -                                                               'D
      -                                                               '0
      -                                                               '1
      -                                                               '2
      -                                                             '3'.
           05  NATIONAL-HEX-LITERAL2         PIC X(008) VALUE NX'ABCD'-
                                '0123'.
           05  NATIONAL-HEX-LITERAL3         PIC X(008) VALUE       NX"A
      -                                                               "B
      -                                                               "C
      -                                                               "D
      -                                                               "0
      -                                                               "1
      -                                                               "2
      -                                                             "3".
           05  NATIONAL-HEX-LITERAL4         PIC X(008) VALUE NX"ABCD"-
                                "0123".
           05  UTF8-HEX-LITERAL1         PIC X(008) VALUE           UX'A
      -                                                               'B
      -                                                               'C
      -                                                               'D
      -                                                               '0
      -                                                               '1
      -                                                               '2
      -                                                             '3'.
           05  UTF8-HEX-LITERAL2         PIC X(008) VALUE UX'ABCD'-
                                '0123'.
           05  UTF8-HEX-LITERAL3         PIC X(008) VALUE           UX"A
      -                                                               "B
      -                                                               "C
      -                                                               "D
      -                                                               "0
      -                                                               "1
      -                                                               "2
      -                                                             "3".
           05  UTF8-HEX-LITERAL4         PIC X(008) VALUE UX"ABCD"-
                                "0123".
      *

       01 WORK-AREAS.
          05  X                     PIC X USAGE IS DISPLAY VALUE IS 'ABC
      -'DEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?1234567890-=!@#$%^&*()_+\|abcdef
      -'ghijklmnopqrstuvwxyz '.
          05  A                     PIC X USAGE IS DISPLAY VALUE IS "ABC
      -"DEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?1234567890-=!@#$%^&*()_+\|abcdef
      -"ghijklmnopqrstuvwxyz ".

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           IF X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ';:,./<>?\|1234567890!@#$%^
      -"&*()-=_+ ." DISPLAY MYNAME 'IS EQUAL' END-IF

           IF A EQUAL TO 'ABCDEFGHIJKLMNOPQRSTUVWXYZ";:,./<>?\|123456789
      -'0!@#$%^&*()-=_+ .' DISPLAY MYNAME 'IS EQUAL' END-IF
           

           CALL PGM1
           CALL PGM2
           CALL PGM3
           CALL PGM4

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


