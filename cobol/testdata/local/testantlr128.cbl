000001 Identification Division.
000002 Program-ID. testantlr028.
000003 Data Division.
000004 Working-Storage Section.
000005
000006*
000007*comment
000008*
000009
000010 01  CONSTANTS.
000011     05  MYNAME               PIC X(012) VALUE 'testantlr028'.
000012
000013*
000014
000015 01  WORK-AREAS.
000016     05  X                     PIC X USAGE IS DISPLAY VALUE 'X'.
000017
000018 Local-Storage Section.
000019 01  LOCAL-WORK-AREAS.
000020     05  Y                     PIC X VALUE 'Y'.
000021
000022 Linkage Section.
000023 01  PARM-DATA.
000024     05  PARM-DATA-LEN         PIC S9(004) COMP-5.
000025     05  PARM-DATA-VAL         PIC X(100).
000026
000027 Procedure Division Using PARM-DATA.
000028     DISPLAY MYNAME ' Begin'
000029     
000030
000031     DISPLAY MYNAME ' End'
000032     
000033     GOBACK
000034     .
000035
000036
