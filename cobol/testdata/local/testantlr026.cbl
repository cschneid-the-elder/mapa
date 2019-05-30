       Identification Division.
       Program-ID. testantlr026.
       Data Division.
       Working-Storage Section.

      *
      *comment
      *

       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr026'.

      *

       01 WORK-AREAS.
          05  A                     PIC A USAGE IS DISPLAY.
          05  B                     PIC A USAGE IS DISPLAY-1.
          05  C                     PIC S9(4) USAGE IS COMP.
          05  S94USAGECOMP1         PIC S9(4) USAGE IS COMP-1.
          05  S95USAGECOMP3         PIC S9(005) USAGE IS COMP-3.
          05  S9SFLOAT              USAGE IS COMP-2.
          05  S9DFLOAT              USAGE IS COMP-4.
          05  S98USAGECOMP5         PIC S9(008) USAGE IS COMP-5.
          05  S99USAGEDISPLAY-V     PIC S99 USAGE IS DISPLAY VALUE +1.
          05  S99USAGEDISPLAY1-V    PIC S99 USAGE IS DISPLAY-1 VALUE +1.
          05  S94USAGECOMP-V        PIC S9(4) USAGE IS COMP VALUE +3.
          05  S94USAGECOMP1-V       PIC S9(4) USAGE IS COMP-1 VALUE -7.
          05  S95USAGECOMP3-V       PIC S9(005) USAGE IS COMP-3 
                                    VALUE -14.
          05  S98USAGECOMP5-V       PIC S9(008) USAGE IS COMP-5 
                                    VALUE +2.
          05  S94USAGECOMPU         PIC S9(4) USAGE IS COMPUTATIONAL.
          05  S94USAGECOMPU1        PIC S9(4) USAGE IS COMPUTATIONAL-1.
          05  S95USAGECOMPU3        PIC S9(005) USAGE IS 
                                    COMPUTATIONAL-3.
          05  S9SFLOATU             USAGE COMPUTATIONAL-2.
          05  S9DFLOATU             USAGE COMPUTATIONAL-4.
          05  S98USAGECOMPU5        PIC S9(008) USAGE IS 
                                    COMPUTATIONAL-5.
          05  S94USAGECOMPU-V       PIC S9(4) 
                                    USAGE IS COMPUTATIONAL VALUE +3.
          05  S94USAGECOMPU1-V      PIC S9(4) 
                                    USAGE IS COMPUTATIONAL-1 VALUE -7.
          05  S95USAGECOMPU3-V      PIC S9(005) 
                                    USAGE IS COMPUTATIONAL-3 VALUE -14.
          05  S98USAGECOMPU5-V      PIC S9(008) 
                                    USAGE IS COMPUTATIONAL-5 VALUE +2.



       Procedure Division.
           DISPLAY MYNAME ' Begin'
           

           DISPLAY MYNAME ' End'
           
           GOBACK
           .


