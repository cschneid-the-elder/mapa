       ID Division.
       Program-ID. test9014.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select A001 Assign UT-S-DD000001.
           Select A002 Assign S-DD000002.
           Select A003 Assign DD000003.
           Select A004 Assign BEEP.
           Select A005 Assign 'ZERO'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  WS-COUNT              PIC S9999 COMP-3 VALUE +0.
           05  PGM1                  PIC X(008) VALUE 'PGMA0001'.
       01  GLOBAL-AREAS GLOBAL.
           05  PGM2                  PIC X(008) VALUE 'PGMA0002'.
           05  ABC.
               10  DEF.
                   15  GHI.
                       20  PGM3      PIC X(008) VALUE 'PGMA0003'.
                   15  JKL.
                       20  PGM3      PIC X(008) VALUE 'PGMB0003'.
           05  PGM4                  PIC X(008) VALUE SPACES.

       Procedure Division.
           OPEN INPUT A001
           OPEN OUTPUT A002
           OPEN I-O A003
           OPEN EXTEND A004
           CALL PGM1
           MOVE 'PGMA0004' TO PGM4
           CALL 'test9014a'
           EXIT PROGRAM.
       ID Division.
       Program-ID. test9014a.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select B001 Assign UT-S-DD000011.
           Select B002 Assign S-DD000012.
           Select B003 Assign DD000013.
           Select B004 Assign ABORT.
           Select B005 Assign 'PASSWORD'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  PGM1                  PIC X(008) VALUE 'PGMB0001'.
           05  PGM5                  PIC X(008) VALUE SPACES.
       Procedure Division.
           OPEN INPUT B001 B002
           OPEN OUTPUT B003 B004
           OPEN I-O B005
           CALL PGM1
           CALL 'test9014b'
           CALL PGM4
           MOVE 'PGMB0004' TO PGM4
           EXIT PROGRAM.
       ID Division.
       Program-ID. test9014a1.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select C001 Assign UT-S-DD000111.
           Select C002 Assign S-DD000112.
           Select C003 Assign DD000113.
           Select C004 Assign ASCII.
           Select C005 Assign 'EBCDIC'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  PGM1                  PIC X(008) VALUE 'PGMC0001'.
           05  PGM6                  PIC X(008) VALUE SPACES.
               88  PGM6-B                       VALUE 'PGMB0006'.
               88  PGM6-C                       VALUE 'PGMC0006'.
       Procedure Division.
           OPEN INPUT C001 C002 OUTPUT C003 I-O C004 C005
           CALL PGM1
           CALL PGM4
           CALL PGM3 OF JKL
           MOVE 'PGMA0006' TO PGM6
           CALL PGM6
           SET PGM6-C TO TRUE
           CALL PGM6
           EXIT PROGRAM.
       END PROGRAM test9014a1.
       ID Division.
       Program-ID. test9014a2.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select D001 Assign UT-S-DD000211.
           Select D002 Assign S-DD000212.
           Select D003 Assign DD000213.
           Select D004 Assign IMPORT.
           Select D005 Assign 'INTEGER'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  PGM1                  PIC X(008) VALUE 'PGMD0001'.
           05  PGM6                  PIC X(008) VALUE SPACES.
               88  PGM6-B                       VALUE 'PGMB0006'.
               88  PGM6-C                       VALUE 'PGMC0006'.
       Procedure Division.
           CALL PGM1
           SET PGM6-B TO TRUE
           CALL PGM6
           CALL PGM3 OF GHI OF DEF OF ABC
           EXIT PROGRAM.
       END PROGRAM test9014a2.
       END PROGRAM test9014a.
       ID Division.
       Program-ID. test9014b.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select E001 Assign UT-S-DD000012.
           Select E002 Assign S-DD000022.
           Select E003 Assign DD000023.
           Select E004 Assign MAGIC.
           Select E005 Assign 'CLAMBAKE'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  PGM1                  PIC X(008) VALUE 'PGME0001'.
           05  PGM5                  PIC X(008) VALUE SPACES.
       Procedure Division.
           CALL PGM1
           CALL 'test9014b'
           CALL PGM4
           MOVE 'PGMB0004' TO PGM4
           EXIT PROGRAM.
       ID Division.
       Program-ID. test9014b1.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select F001 Assign UT-S-DD000121.
           Select F002 Assign S-DD000122.
           Select F003 Assign DD000123.
           Select F004 Assign ASCDIC.
           Select F005 Assign 'EBCII'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  PGM1                  PIC X(008) VALUE 'PGMF0001'.
           05  PGM6                  PIC X(008) VALUE SPACES.
               88  PGM6-B                       VALUE 'PGMB0006'.
               88  PGM6-C                       VALUE 'PGMC0006'.
       Procedure Division.
           CALL PGM1
           CALL PGM2
           CALL PGM3 OF JKL
           MOVE 'PGMD0006' TO PGM6
           CALL PGM6
           SET PGM6-C TO TRUE
           CALL PGM6
           EXIT PROGRAM.
       END PROGRAM test9014b1.
       ID Division.
       Program-ID. test9014b2.
       Environment Division.
       Input-Output Section.
       File-Control.
           Select G001 Assign UT-S-DD000221.
           Select G002 Assign S-DD000222.
           Select G003 Assign DD000223.
           Select G004 Assign BLURN.
           Select G005 Assign 'BLERGH'.
       Data Division.
       Working-Storage Section.
       01  WORK-AREAS.
           05  PGM1                  PIC X(008) VALUE 'PGMG0001'.
           05  PGM6                  PIC X(008) VALUE SPACES.
               88  PGM6-B                       VALUE 'PGMB0006'.
               88  PGM6-C                       VALUE 'PGMC0006'.
       Procedure Division.
           CALL PGM1
           SET PGM6-B TO TRUE
           CALL PGM6
           CALL PGM3 OF GHI OF DEF OF ABC
           EXIT PROGRAM.
       END PROGRAM test9014b2.
       END PROGRAM test9014b.
       END PROGRAM test9014.
