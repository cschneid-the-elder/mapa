000001 Identification Division.
000002 Program-ID. testantlr024.
000003 Data Division.
000004 Working-Storage Section.
000005
000006*
000007*comment
000008*
000009
000010 01  CONSTANTS.
000011     05  MYNAME               PIC X(012) VALUE 'testantlr024'.
000012
000013*
000014
000015 01 WORK-AREAS.
000016    05  A                     PIC A VALUE 'A'.
000017    05  X                     PIC X VALUE 'X'.
000018    05  V99                   PIC V99.
000019    05  B9                    PIC B9.
000020    05  Z                     PIC Z.
000021    05  S9                    PIC S9.       
000022
000023 Procedure Division.
000024     DISPLAY MYNAME ' Begin'
000025     
000026
000027     DISPLAY MYNAME ' End'
000028     
000029     GOBACK
000030     .
000031
000032
