000001 Identification Division.
000002 Program-ID. testantlr144.
000003 Data Division.
000004 Working-Storage Section.
000005
000006 >>DEFINE A 2
000007 >>DEFINE B 3
000008 >>DEFINE C A + B
000009 >>DEFINE D A * B
000010 >>DEFINE E (D * A) / 3
000011
000012 01  CONSTANTS.
000013     05  MYNAME               PIC X(012) VALUE 'testantlr144'.
000014     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.
000015     05  PGM-0002             PIC X(008) VALUE 'PGMA0002'.
000016     05  PGM-0003             PIC X(008) VALUE 'PGMA0003'.
000017     05  PGM-0009             PIC X(008) VALUE 'PGMA0009'.
000018
000019*
000020
000021 Procedure Division.
000022     DISPLAY MYNAME ' Begin'
000023
000024     >>IF C = 5
000025     CALL PGM-0001
000026     >>ELSE
000027     CALL PGM-0009
000028     >>END-IF
000029
000030     >>IF D = 6
000031     CALL PGM-0002
000032     >>ELSE
000033     CALL PGM-0009
000034     >>END-IF
000035
000036     >>IF E = 4
000037     CALL PGM-0003
000038     >>ELSE
000039     CALL PGM-0009
000040     >>END-IF
000041
000042     DISPLAY MYNAME ' End'
000043     
000044     GOBACK
000045     .
000046
000047
