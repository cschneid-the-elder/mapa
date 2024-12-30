       Identification Division.
       Program-ID. screen01.
       Environment Division.
       Configuration Section.
       Repository.
           Function All Intrinsic.
       Data Division.
       Working-Storage Section.
       01  WS-CONSTANTS.
           05  MYNAME                  PIC X(008) VALUE 'screen01'.

       01  WS-WORK-AREAS.
           05  WS-FIELD01              PIC X(008) VALUE SPACES.
       
       Linkage Section.

       Screen Section.
       01  SCREEN-FIELD01              PIC X(008)
                                       REVERSE-VIDEO
                                       FROM MYNAME.
       
       01  SCREEN-FIELD02              PIC X(008)
                                       AUTO
                                       AUTO-SKIP
                                       AUTOTERMINATE
                                       BELL
                                       BEEP
                                       BACKGROUND-COLOR IS 1
                                       BACKGROUND-COLOUR IS 1
                                       BLANK LINE
                                       BLANK SCREEN
                                       ERASE EOL
                                       ERASE EOS
                                       BLANK ZERO
                                       BLINK
                                       HIGHLIGHT
                                       LOWLIGHT
                                       REVERSE-VIDEO
                                       COLUMN NUMBER IS + 20
                                       FOREGROUND-COLOR 5
                                       FOREGROUND-COLOUR 5
                                       FULL
                                       LENGTH-CHECK
                                       REQUIRED
                                       EMPTY-CHECK
                                       SECURE
                                       NO-ECHO
                                       LEFTLINE
                                       OVERLINE
                                       UNDERLINE
                                       LINE 5
                                       LOWER
                                       UPPER
                                       NO-ECHO
                                       NO UPDATE
                                       PROMPT 'Well? '
                                       SCROLL DOWN
                                       SCROLL UP
                                       UPDATE
                                       .
       Procedure Division.
           DISPLAY SCREEN-FIELD01
           MOVE +0 TO RETURN-CODE
           GOBACK.


