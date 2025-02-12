       Identification Division.
       Program-ID. testantlr032.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr032'.

       01  SWITCHES.
           05  SD-001-TRUTH-SW      PIC X(008).
               88  SD-001-TRUTH     VALUE 'ZAPHOD'.

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
           
           JSON GENERATE WS-BUF FROM SOME-DATA END-JSON

           JSON GENERATE WS-BUF FROM SOME-DATA 
               ENCODING 37
           END-JSON

           JSON GENERATE WS-BUF FROM SOME-DATA 
               ENCODING WS-COUNT
           END-JSON

           JSON GENERATE WS-BUF FROM SOME-DATA 
               ENCODING FROM CODEPAGE
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT IN WS-COUNT
               NAME OF SD-001 IS 'ARTHUR'
                       SD-002 IS 'DENT'
               SUPPRESS SD-001 SD-003
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT IN WS-COUNT
               NAME OF SD-001 IS 'ARTHUR'
                       SD-002 IS 'DENT'
               SUPPRESS EVERY NUMERIC WHEN ZEROES
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT IN WS-COUNT
               NAME OF SD-001 IS 'ARTHUR'
                       SD-002 IS 'DENT'
               SUPPRESS 
                       EVERY NUMERIC WHEN ZEROES
                       EVERY NONNUMERIC WHEN SPACES
                       EVERY NONNUMERIC WHEN LOW-VALUES
                       EVERY WHEN HIGH-VALUES OR HIGH-VALUE
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001 WHEN SPACES
                    SD-002 WHEN LOW-VALUES
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-001 TO JSON BOOLEAN USING SD-001-TRUTH
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-001 JSON BOOLEAN USING SD-001-TRUTH
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-001 BOOLEAN USING SD-001-TRUTH
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-003 JSON NULL USING SPACES
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-003 NULL USING SPACES
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-001 BOOLEAN SD-001-TRUTH
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-001 TO JSON BOOL USING SD-001-TRUTH
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING SD-001 TO JSON BOOLEAN USING 'FPREFECT'
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON

           JSON GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               SUPPRESS 
                    SD-001
                    SD-002
               CONVERTING 
                    SD-001 TO JSON BOOLEAN USING 'FPREFECT'
                    ALSO SD-002 BOOL '&&'
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 1000-para
           END-JSON


           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           .

