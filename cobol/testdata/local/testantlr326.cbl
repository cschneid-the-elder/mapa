000001 Identification Division.                                         00000001
000002 Program-ID. testantlr326.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005                                                                  00000005
000006*                                                                 00000006
000007*comment                                                          00000007
000008*                                                                 00000008
000009                                                                  00000009
000010 01  CONSTANTS.                                                   00000010
000011     05  MYNAME               PIC X(012) VALUE 'testantlr326'.    00000011
000012                                                                  00000012
000013*                                                                 00000013
000014                                                                  00000014
000015 01 WORK-AREAS.                                                   00000015
000016    05  A                     PIC A USAGE IS DISPLAY.             00000016
000017    05  B                     PIC A USAGE IS DISPLAY-1.           00000017
000018    05  C                     PIC S9(4) USAGE IS COMP.            00000018
000019    05  S94USAGECOMP1         PIC S9(4) USAGE IS COMP-1.          00000019
000020    05  S95USAGECOMP3         PIC S9(005) USAGE IS COMP-3.        00000020
000021    05  S9SFLOAT              USAGE IS COMP-2.                    00000021
000022    05  S9DFLOAT              USAGE IS COMP-4.                    00000022
000023    05  S98USAGECOMP5         PIC S9(008) USAGE IS COMP-5.        00000023
000024    05  S99USAGEDISPLAY-V     PIC S99 USAGE IS DISPLAY VALUE +1.  00000024
000025    05  S99USAGEDISPLAY1-V    PIC S99 USAGE IS DISPLAY-1 VALUE +1.00000025
000026    05  S94USAGECOMP-V        PIC S9(4) USAGE IS COMP VALUE +3.   00000026
000027    05  S94USAGECOMP1-V       PIC S9(4) USAGE IS COMP-1 VALUE -7. 00000027
000028    05  S95USAGECOMP3-V       PIC S9(005) USAGE IS COMP-3         00000028
000029                              VALUE -14.                          00000029
000030    05  S98USAGECOMP5-V       PIC S9(008) USAGE IS COMP-5         00000030
000031                              VALUE +2.                           00000031
000032    05  S94USAGECOMPU         PIC S9(4) USAGE IS COMPUTATIONAL.   00000032
000033    05  S94USAGECOMPU1        PIC S9(4) USAGE IS COMPUTATIONAL-1. 00000033
000034    05  S95USAGECOMPU3        PIC S9(005) USAGE IS                00000034
000035                              COMPUTATIONAL-3.                    00000035
000036    05  S9SFLOATU             USAGE COMPUTATIONAL-2.              00000036
000037    05  S9DFLOATU             USAGE COMPUTATIONAL-4.              00000037
000038    05  S98USAGECOMPU5        PIC S9(008) USAGE IS                00000038
000039                              COMPUTATIONAL-5.                    00000039
000040    05  S94USAGECOMPU-V       PIC S9(4)                           00000040
000041                              USAGE IS COMPUTATIONAL VALUE +3.    00000041
000042    05  S94USAGECOMPU1-V      PIC S9(4)                           00000042
000043                              USAGE IS COMPUTATIONAL-1 VALUE -7.  00000043
000044    05  S95USAGECOMPU3-V      PIC S9(005)                         00000044
000045                              USAGE IS COMPUTATIONAL-3 VALUE -14. 00000045
000046    05  S98USAGECOMPU5-V      PIC S9(008)                         00000046
000047                              USAGE IS COMPUTATIONAL-5 VALUE +2.  00000047
000048                                                                  00000048
000049                                                                  00000049
000050                                                                  00000050
000051 Procedure Division.                                              00000051
000052     DISPLAY MYNAME ' Begin'                                      00000052
000053                                                                  00000053
000054                                                                  00000054
000055     DISPLAY MYNAME ' End'                                        00000055
000056                                                                  00000056
000057     GOBACK                                                       00000057
000058     .                                                            00000058
000059                                                                  00000059
000060                                                                  00000060
