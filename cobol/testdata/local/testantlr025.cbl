       Identification Division.
       Program-ID. testantlr025.
       Author.
           This is the author paragraph
       Installation.
           This is line 01 of the Installation paragraph.
           This is line 02 of the installation paragraph no period
           Identification of the Installation paragraph extending to xxx
       Date-Written.
           In this Environment on this Source-Computer
           is recorded the Date-Written.
       Date-Compiled.
       Security.                                                   None.
       Data Division.
       Working-Storage Section.

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr025'.

      *

       01 WORK-AREAS.
          05  A                     PIC A VALUE 'A'.
          05  X                     PIC X VALUE 'X'.
          05  V99                   PIC V99.
          05  B9                    PIC B9.
          05  Z                     PIC Z.
          05  S9                    PIC S9.       
          05  S99DISPLAY            PIC S99 DISPLAY.
          05  S99USAGEDISPLAY       PIC S99 USAGE DISPLAY.
          05  S99DISPLAY1           PIC S99 DISPLAY-1.
          05  S99USAGEDISPLAY1      PIC S99 USAGE DISPLAY-1.
          05  S94COMP               PIC S9(4) COMP.
          05  S94USAGECOMP          PIC S9(4) USAGE COMP.
          05  S94COMP1              PIC S9(4) COMP-1.
          05  S94USAGECOMP1         PIC S9(4) USAGE COMP-1.
          05  S95COMP3              PIC S9(005) COMP-3.
          05  S95USAGECOMP3         PIC S9(005) USAGE COMP-3.
          05  S9SFLOAT              USAGE COMP-2.
          05  S9DFLOAT              USAGE COMP-4.
          05  S98COMP5              PIC S9(008) COMP-5.
          05  S98USAGECOMP5         PIC S9(008) USAGE COMP-5.
          05  S99DISPLAY-V          PIC S99 DISPLAY VALUE 1.
          05  S99USAGEDISPLAY-V     PIC S99 USAGE DISPLAY VALUE +1.
          05  S99DISPLAY1-V         PIC S99 DISPLAY-1 VALUE 1.
          05  S99USAGEDISPLAY1-V    PIC S99 USAGE DISPLAY-1 VALUE +1.
          05  S94COMP-V             PIC S9(4) COMP VALUE 3.
          05  S94USAGECOMP-V        PIC S9(4) USAGE COMP VALUE +3.
          05  S94COMP1-V            PIC S9(4) COMP-1 VALUE -3.
          05  S94USAGECOMP1-V       PIC S9(4) USAGE COMP-1 VALUE -7.
          05  S95COMP3-V            PIC S9(005) COMP-3 VALUE +14.
          05  S95USAGECOMP3-V       PIC S9(005) USAGE COMP-3 VALUE -14.
          05  S98COMP5-V            PIC S9(008) COMP-5 VALUE 2.
          05  S98USAGECOMP5-V       PIC S9(008) USAGE COMP-5 VALUE +2.
          05  S94COMPU              PIC S9(4) COMPUTATIONAL.
          05  S94USAGECOMPU         PIC S9(4) USAGE COMPUTATIONAL.
          05  S94COMPU1             PIC S9(4) COMPUTATIONAL-1.
          05  S94USAGECOMPU1        PIC S9(4) USAGE COMPUTATIONAL-1.
          05  S95COMPU3             PIC S9(005) COMPUTATIONAL-3.
          05  S95USAGECOMPU3        PIC S9(005) USAGE COMPUTATIONAL-3.
          05  S9SFLOATU             USAGE COMPUTATIONAL-2.
          05  S9DFLOATU             USAGE COMPUTATIONAL-4.
          05  S98COMPU5             PIC S9(008) COMPUTATIONAL-5.
          05  S98USAGECOMPU5        PIC S9(008) USAGE COMPUTATIONAL-5.
          05  S94COMPU-V            PIC S9(4) COMPUTATIONAL VALUE 3.
          05  S94USAGECOMPU-V       PIC S9(4) 
                                    USAGE COMPUTATIONAL VALUE +3.
          05  S94COMPU1-V           PIC S9(4) COMPUTATIONAL-1 VALUE -3.
          05  S94USAGECOMPU1-V      PIC S9(4) 
                                    USAGE COMPUTATIONAL-1 VALUE -7.
          05  S95COMPU3-V           PIC S9(005) 
                                    COMPUTATIONAL-3 VALUE +1.
          05  S95USAGECOMPU3-V      PIC S9(005) 
                                    USAGE COMPUTATIONAL-3 VALUE -14.
          05  S98COMPU5-V           PIC S9(008) COMPUTATIONAL-5 VALUE 2.
          05  S98USAGECOMPU5-V      PIC S9(008) 
                                    USAGE COMPUTATIONAL-5 VALUE +2.



       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


