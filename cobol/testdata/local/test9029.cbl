       Identification Division.
       Program-ID. test9029.
       Environment Division.
       Configuration Section.
       Repository.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'test9029'.
           05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.

       01  WORK-AREAS.
           05  STUFF OCCURS 5       PIC X(008).
           05  OTHER-STUFF          PIC X(008) Value X'1234abcd'.

       Procedure Division.
           DISPLAY MYNAME ' Begin'

           >>CALL-CONVENTION COBOL
           >>CALL-CONVENTION test9000
           >>COBOL-WORDS EQUATE 'SUBTRACT' WITH 'ADD'
           >>COBOL-WORDS UNDEFINE 'EQUATE'
           >>COBOL-WORDS SUBSTITUTE 'MULTIPLY' BY 'DIVIDE'
           >>COBOL-WORDS RESERVE 'PLUM'
           >>DISPLAY '1'
           >>DISPLAY IGYCICS
           >>DISPLAY 4 + 7 * 3
           >>DISPLAY A = B
           >>FLAG-02 ALL ON
           >>FLAG-02 EC-PROGRAM-EXCEPTIONS ON
           >>FLAG-02 I-O-STATUS-07 ON
           >>FLAG-02 MOVE-TO-SAME-NAME ON
           >>FLAG-02 RANGE-EXCEPTION-FOR-INDEX ON
           >>FLAG-02 TERMINATE-WITH-VARYING ON
           >>FLAG-02 ALL OFF
           >>FLAG-02 EC-PROGRAM-EXCEPTIONS OFF
           >>FLAG-02 I-O-STATUS-07 OFF
           >>FLAG-02 MOVE-TO-SAME-NAME OFF
           >>FLAG-02 RANGE-EXCEPTION-FOR-INDEX OFF
           >>FLAG-02 TERMINATE-WITH-VARYING OFF                   
           >>FLAG-14 I-O-STATUS-04 ON
           >>FLAG-14 NUM-ED-ZERO-FIGCONST ON
           >>FLAG-14 REF-MOD-ZERO-LENGTH ON
           >>FLAG-14 I-O-STATUS-04 OFF
           >>FLAG-14 NUM-ED-ZERO-FIGCONST OFF
           >>FLAG-14 REF-MOD-ZERO-LENGTH OFF
           >>LEAP-SECOND ON
           >>LEAP-SECOND OFF
           >>LISTING ON
           >>LISTING OFF
           >>PAGE
           >>PAGE A comment on the PAGE directive
           >>POP ALL
           >>POP CALL-CONVENTION
           >>POP COBOL-WORDS
           >>POP DEFINE
           >>POP FLAG-02
           >>POP FLAG-14
           >>POP LEAP-SECOND
           >>POP LISTING
           >>POP PROPOGATE
           >>POP REF-MOD-ZERO-LENGTH
           >>POP SOURCE
           >>POP TURN
           >>PROPOGATE ON
           >>PROPOGATE OFF
           >>PUSH ALL
           >>PUSH CALL-CONVENTION
           >>PUSH COBOL-WORDS
           >>PUSH DEFINE
           >>PUSH FLAG-02
           >>PUSH FLAG-14
           >>PUSH LEAP-SECOND
           >>PUSH LISTING
           >>PUSH PROPOGATE
           >>PUSH REF-MOD-ZERO-LENGTH
           >>PUSH SOURCE
           >>PUSH TURN
           >>REF-MOD-ZERO-LENGTH ON
           >>REF-MOD-ZERO-LENGTH OFF
           >>SOURCE FORMAT IS FIXED
           >>SOURCE FORMAT IS FREE
           >>SOURCE FIXED
           >>SOURCE FREE
           >>TURN EC-ALL CHECKING OFF
           >>TURN EC-ALL CHECKING ON WITH LOCATION
           >>TURN EC-ALL CHECKING ON LOCATION
           >>TURN EC-ALL CHECKING LOCATION
           >>TURN EC-I-O-WARNING SYSUT2 CHECKING ON LOCATION
           >>TURN EC-I-O-WARNING SYSUT3 CHECKING ON WITH LOCATION
           >>TURN EC-I-O-WARNING SYSUT4 CHECKING OFF
           
           DISPLAY MYNAME ' End'
           
           GOBACK
           .


