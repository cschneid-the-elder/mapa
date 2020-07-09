       Identification Division.
       Program-ID. testantlr033.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr033'.

      * 
       01  SOME-DATA.
           05  SD-001               PIC X(008).
           05  SD-002.
               10  SD-002-A         PIC X(001).
               10  SD-002-B         PIC X(001).
           05  SD-003               PIC X(008).

       01  WS-BUF                   PIC X(100).

       77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           JSON PARSE WS-BUF INTO SOME-DATA END-JSON

           JSON PARSE
               WS-BUF INTO SOME-DATA
               DETAIL
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON PARSE
               WS-BUF INTO SOME-DATA
               WITH DETAIL
               NAME OF SD-001 IS 'ARTHUR'
                       SD-002 IS OMITTED
               SUPPRESS SD-001 SD-003
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON


           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           .

