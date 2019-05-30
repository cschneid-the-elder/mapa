       Identification Division.                                         00000001
       Program-ID. testantlr225.                                        00000002
       Author.                                                          00000003
           This is the author paragraph                                 00000004
       Installation.                                                    00000005
           This is line 01 of the Installation paragraph.               00000006
           This is line 02 of the installation paragraph no period      00000007
           Identification of the Installation paragraph extending to xxx00000008
       Date-Written.                                                    00000009
           In this Environment on this Source-Computer                  00000010
           is recorded the Date-Written.                                00000011
       Date-Compiled.                                                   00000012
       Security.                                                   None.00000013
       Data Division.                                                   00000014
       Working-Storage Section.                                         00000015
                                                                        00000016
      *                                                                 00000017
      *comment                                                          00000018
      *                                                                 00000019
                                                                        00000020
       01  CONSTANTS.                                                   00000021
           05  MYNAME               PIC X(012) VALUE 'testantlr225'.    00000022
                                                                        00000023
      *                                                                 00000024
                                                                        00000025
       01 WORK-AREAS.                                                   00000026
          05  A                     PIC A VALUE 'A'.                    00000027
          05  X                     PIC X VALUE 'X'.                    00000028
          05  V99                   PIC V99.                            00000029
          05  B9                    PIC B9.                             00000030
          05  Z                     PIC Z.                              00000031
          05  S9                    PIC S9.                             00000032
          05  S99DISPLAY            PIC S99 DISPLAY.                    00000033
          05  S99USAGEDISPLAY       PIC S99 USAGE DISPLAY.              00000034
          05  S99DISPLAY1           PIC S99 DISPLAY-1.                  00000035
          05  S99USAGEDISPLAY1      PIC S99 USAGE DISPLAY-1.            00000036
          05  S94COMP               PIC S9(4) COMP.                     00000037
          05  S94USAGECOMP          PIC S9(4) USAGE COMP.               00000038
          05  S94COMP1              PIC S9(4) COMP-1.                   00000039
          05  S94USAGECOMP1         PIC S9(4) USAGE COMP-1.             00000040
          05  S95COMP3              PIC S9(005) COMP-3.                 00000041
          05  S95USAGECOMP3         PIC S9(005) USAGE COMP-3.           00000042
          05  S9SFLOAT              USAGE COMP-2.                       00000043
          05  S9DFLOAT              USAGE COMP-4.                       00000044
          05  S98COMP5              PIC S9(008) COMP-5.                 00000045
          05  S98USAGECOMP5         PIC S9(008) USAGE COMP-5.           00000046
          05  S99DISPLAY-V          PIC S99 DISPLAY VALUE 1.            00000047
          05  S99USAGEDISPLAY-V     PIC S99 USAGE DISPLAY VALUE +1.     00000048
          05  S99DISPLAY1-V         PIC S99 DISPLAY-1 VALUE 1.          00000049
          05  S99USAGEDISPLAY1-V    PIC S99 USAGE DISPLAY-1 VALUE +1.   00000050
          05  S94COMP-V             PIC S9(4) COMP VALUE 3.             00000051
          05  S94USAGECOMP-V        PIC S9(4) USAGE COMP VALUE +3.      00000052
          05  S94COMP1-V            PIC S9(4) COMP-1 VALUE -3.          00000053
          05  S94USAGECOMP1-V       PIC S9(4) USAGE COMP-1 VALUE -7.    00000054
          05  S95COMP3-V            PIC S9(005) COMP-3 VALUE +14.       00000055
          05  S95USAGECOMP3-V       PIC S9(005) USAGE COMP-3 VALUE -14. 00000056
          05  S98COMP5-V            PIC S9(008) COMP-5 VALUE 2.         00000057
          05  S98USAGECOMP5-V       PIC S9(008) USAGE COMP-5 VALUE +2.  00000058
          05  S94COMPU              PIC S9(4) COMPUTATIONAL.            00000059
          05  S94USAGECOMPU         PIC S9(4) USAGE COMPUTATIONAL.      00000060
          05  S94COMPU1             PIC S9(4) COMPUTATIONAL-1.          00000061
          05  S94USAGECOMPU1        PIC S9(4) USAGE COMPUTATIONAL-1.    00000062
          05  S95COMPU3             PIC S9(005) COMPUTATIONAL-3.        00000063
          05  S95USAGECOMPU3        PIC S9(005) USAGE COMPUTATIONAL-3.  00000064
          05  S9SFLOATU             USAGE COMPUTATIONAL-2.              00000065
          05  S9DFLOATU             USAGE COMPUTATIONAL-4.              00000066
          05  S98COMPU5             PIC S9(008) COMPUTATIONAL-5.        00000067
          05  S98USAGECOMPU5        PIC S9(008) USAGE COMPUTATIONAL-5.  00000068
          05  S94COMPU-V            PIC S9(4) COMPUTATIONAL VALUE 3.    00000069
          05  S94USAGECOMPU-V       PIC S9(4)                           00000070
                                    USAGE COMPUTATIONAL VALUE +3.       00000071
          05  S94COMPU1-V           PIC S9(4) COMPUTATIONAL-1 VALUE -3. 00000072
          05  S94USAGECOMPU1-V      PIC S9(4)                           00000073
                                    USAGE COMPUTATIONAL-1 VALUE -7.     00000074
          05  S95COMPU3-V           PIC S9(005)                         00000075
                                    COMPUTATIONAL-3 VALUE +1.           00000076
          05  S95USAGECOMPU3-V      PIC S9(005)                         00000077
                                    USAGE COMPUTATIONAL-3 VALUE -14.    00000078
          05  S98COMPU5-V           PIC S9(008) COMPUTATIONAL-5 VALUE 2.00000079
          05  S98USAGECOMPU5-V      PIC S9(008)                         00000080
                                    USAGE COMPUTATIONAL-5 VALUE +2.     00000081
                                                                        00000082
                                                                        00000083
                                                                        00000084
       Procedure Division.                                              00000085
           DISPLAY MYNAME ' Begin'                                      00000086
                                                                        00000087
                                                                        00000088
           DISPLAY MYNAME ' End'                                        00000089
                                                                        00000090
           GOBACK                                                       00000091
           .                                                            00000092
                                                                        00000093
                                                                        00000094
