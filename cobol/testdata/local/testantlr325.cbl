000001 Identification Division.                                         00000001
000002 Program-ID. testantlr325.                                        00000002
000003 Author.                                                          00000003
000004     This is the author paragraph                                 00000004
000005 Installation.                                                    00000005
000006     This is line 01 of the Installation paragraph.               00000006
000007     This is line 02 of the installation paragraph no period      00000007
000008     Identification of the Installation paragraph extending to xxx00000008
000009 Date-Written.                                                    00000009
000010     In this Environment on this Source-Computer                  00000010
000011     is recorded the Date-Written.                                00000011
000012 Date-Compiled.                                                   00000012
000013 Security.                                                   None.00000013
000014 Data Division.                                                   00000014
000015 Working-Storage Section.                                         00000015
000016                                                                  00000016
000017*                                                                 00000017
000018*comment                                                          00000018
000019*                                                                 00000019
000020                                                                  00000020
000021 01  CONSTANTS.                                                   00000021
000022     05  MYNAME               PIC X(012) VALUE 'testantlr325'.    00000022
000023                                                                  00000023
000024*                                                                 00000024
000025                                                                  00000025
000026 01 WORK-AREAS.                                                   00000026
000027    05  A                     PIC A VALUE 'A'.                    00000027
000028    05  X                     PIC X VALUE 'X'.                    00000028
000029    05  V99                   PIC V99.                            00000029
000030    05  B9                    PIC B9.                             00000030
000031    05  Z                     PIC Z.                              00000031
000032    05  S9                    PIC S9.                             00000032
000033    05  S99DISPLAY            PIC S99 DISPLAY.                    00000033
000034    05  S99USAGEDISPLAY       PIC S99 USAGE DISPLAY.              00000034
000035    05  S99DISPLAY1           PIC S99 DISPLAY-1.                  00000035
000036    05  S99USAGEDISPLAY1      PIC S99 USAGE DISPLAY-1.            00000036
000037    05  S94COMP               PIC S9(4) COMP.                     00000037
000038    05  S94USAGECOMP          PIC S9(4) USAGE COMP.               00000038
000039    05  S94COMP1              PIC S9(4) COMP-1.                   00000039
000040    05  S94USAGECOMP1         PIC S9(4) USAGE COMP-1.             00000040
000041    05  S95COMP3              PIC S9(005) COMP-3.                 00000041
000042    05  S95USAGECOMP3         PIC S9(005) USAGE COMP-3.           00000042
000043    05  S9SFLOAT              USAGE COMP-2.                       00000043
000044    05  S9DFLOAT              USAGE COMP-4.                       00000044
000045    05  S98COMP5              PIC S9(008) COMP-5.                 00000045
000046    05  S98USAGECOMP5         PIC S9(008) USAGE COMP-5.           00000046
000047    05  S99DISPLAY-V          PIC S99 DISPLAY VALUE 1.            00000047
000048    05  S99USAGEDISPLAY-V     PIC S99 USAGE DISPLAY VALUE +1.     00000048
000049    05  S99DISPLAY1-V         PIC S99 DISPLAY-1 VALUE 1.          00000049
000050    05  S99USAGEDISPLAY1-V    PIC S99 USAGE DISPLAY-1 VALUE +1.   00000050
000051    05  S94COMP-V             PIC S9(4) COMP VALUE 3.             00000051
000052    05  S94USAGECOMP-V        PIC S9(4) USAGE COMP VALUE +3.      00000052
000053    05  S94COMP1-V            PIC S9(4) COMP-1 VALUE -3.          00000053
000054    05  S94USAGECOMP1-V       PIC S9(4) USAGE COMP-1 VALUE -7.    00000054
000055    05  S95COMP3-V            PIC S9(005) COMP-3 VALUE +14.       00000055
000056    05  S95USAGECOMP3-V       PIC S9(005) USAGE COMP-3 VALUE -14. 00000056
000057    05  S98COMP5-V            PIC S9(008) COMP-5 VALUE 2.         00000057
000058    05  S98USAGECOMP5-V       PIC S9(008) USAGE COMP-5 VALUE +2.  00000058
000059    05  S94COMPU              PIC S9(4) COMPUTATIONAL.            00000059
000060    05  S94USAGECOMPU         PIC S9(4) USAGE COMPUTATIONAL.      00000060
000061    05  S94COMPU1             PIC S9(4) COMPUTATIONAL-1.          00000061
000062    05  S94USAGECOMPU1        PIC S9(4) USAGE COMPUTATIONAL-1.    00000062
000063    05  S95COMPU3             PIC S9(005) COMPUTATIONAL-3.        00000063
000064    05  S95USAGECOMPU3        PIC S9(005) USAGE COMPUTATIONAL-3.  00000064
000065    05  S9SFLOATU             USAGE COMPUTATIONAL-2.              00000065
000066    05  S9DFLOATU             USAGE COMPUTATIONAL-4.              00000066
000067    05  S98COMPU5             PIC S9(008) COMPUTATIONAL-5.        00000067
000068    05  S98USAGECOMPU5        PIC S9(008) USAGE COMPUTATIONAL-5.  00000068
000069    05  S94COMPU-V            PIC S9(4) COMPUTATIONAL VALUE 3.    00000069
000070    05  S94USAGECOMPU-V       PIC S9(4)                           00000070
000071                              USAGE COMPUTATIONAL VALUE +3.       00000071
000072    05  S94COMPU1-V           PIC S9(4) COMPUTATIONAL-1 VALUE -3. 00000072
000073    05  S94USAGECOMPU1-V      PIC S9(4)                           00000073
000074                              USAGE COMPUTATIONAL-1 VALUE -7.     00000074
000075    05  S95COMPU3-V           PIC S9(005)                         00000075
000076                              COMPUTATIONAL-3 VALUE +1.           00000076
000077    05  S95USAGECOMPU3-V      PIC S9(005)                         00000077
000078                              USAGE COMPUTATIONAL-3 VALUE -14.    00000078
000079    05  S98COMPU5-V           PIC S9(008) COMPUTATIONAL-5 VALUE 2.00000079
000080    05  S98USAGECOMPU5-V      PIC S9(008)                         00000080
000081                              USAGE COMPUTATIONAL-5 VALUE +2.     00000081
000082                                                                  00000082
000083                                                                  00000083
000084                                                                  00000084
000085 Procedure Division.                                              00000085
000086     DISPLAY MYNAME ' Begin'                                      00000086
000087                                                                  00000087
000088                                                                  00000088
000089     DISPLAY MYNAME ' End'                                        00000089
000090                                                                  00000090
000091     GOBACK                                                       00000091
000092     .                                                            00000092
000093                                                                  00000093
000094                                                                  00000094
