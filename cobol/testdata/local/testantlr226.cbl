       Identification Division.                                         00000001
       Program-ID. testantlr226.                                        00000002
       Data Division.                                                   00000003
       Working-Storage Section.                                         00000004
                                                                        00000005
      *                                                                 00000006
      *comment                                                          00000007
      *                                                                 00000008
                                                                        00000009
       01  CONSTANTS.                                                   00000010
           05  MYNAME               PIC X(012) VALUE 'testantlr226'.    00000011
                                                                        00000012
      *                                                                 00000013
                                                                        00000014
       01 WORK-AREAS.                                                   00000015
          05  A                     PIC A USAGE IS DISPLAY.             00000016
          05  B                     PIC A USAGE IS DISPLAY-1.           00000017
          05  C                     PIC S9(4) USAGE IS COMP.            00000018
          05  S94USAGECOMP1         PIC S9(4) USAGE IS COMP-1.          00000019
          05  S95USAGECOMP3         PIC S9(005) USAGE IS COMP-3.        00000020
          05  S9SFLOAT              USAGE IS COMP-2.                    00000021
          05  S9DFLOAT              USAGE IS COMP-4.                    00000022
          05  S98USAGECOMP5         PIC S9(008) USAGE IS COMP-5.        00000023
          05  S99USAGEDISPLAY-V     PIC S99 USAGE IS DISPLAY VALUE +1.  00000024
          05  S99USAGEDISPLAY1-V    PIC S99 USAGE IS DISPLAY-1 VALUE +1.00000025
          05  S94USAGECOMP-V        PIC S9(4) USAGE IS COMP VALUE +3.   00000026
          05  S94USAGECOMP1-V       PIC S9(4) USAGE IS COMP-1 VALUE -7. 00000027
          05  S95USAGECOMP3-V       PIC S9(005) USAGE IS COMP-3         00000028
                                    VALUE -14.                          00000029
          05  S98USAGECOMP5-V       PIC S9(008) USAGE IS COMP-5         00000030
                                    VALUE +2.                           00000031
          05  S94USAGECOMPU         PIC S9(4) USAGE IS COMPUTATIONAL.   00000032
          05  S94USAGECOMPU1        PIC S9(4) USAGE IS COMPUTATIONAL-1. 00000033
          05  S95USAGECOMPU3        PIC S9(005) USAGE IS                00000034
                                    COMPUTATIONAL-3.                    00000035
          05  S9SFLOATU             USAGE COMPUTATIONAL-2.              00000036
          05  S9DFLOATU             USAGE COMPUTATIONAL-4.              00000037
          05  S98USAGECOMPU5        PIC S9(008) USAGE IS                00000038
                                    COMPUTATIONAL-5.                    00000039
          05  S94USAGECOMPU-V       PIC S9(4)                           00000040
                                    USAGE IS COMPUTATIONAL VALUE +3.    00000041
          05  S94USAGECOMPU1-V      PIC S9(4)                           00000042
                                    USAGE IS COMPUTATIONAL-1 VALUE -7.  00000043
          05  S95USAGECOMPU3-V      PIC S9(005)                         00000044
                                    USAGE IS COMPUTATIONAL-3 VALUE -14. 00000045
          05  S98USAGECOMPU5-V      PIC S9(008)                         00000046
                                    USAGE IS COMPUTATIONAL-5 VALUE +2.  00000047
                                                                        00000048
                                                                        00000049
                                                                        00000050
       Procedure Division.                                              00000051
           DISPLAY MYNAME ' Begin'                                      00000052
                                                                        00000053
                                                                        00000054
           DISPLAY MYNAME ' End'                                        00000055
                                                                        00000056
           GOBACK                                                       00000057
           .                                                            00000058
                                                                        00000059
                                                                        00000060
