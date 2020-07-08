       Identification Division.
       Program-ID. testantlr031.
       Environment Division.
       Configuration Section.
       Special-Names.
           XML-SCHEMA OSR-DATA-FILE IS OSRDATA1.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr031'.

      * 
       01  SOME-DATA.
           05  SD-001               PIC X(008).
           05  SD-002.
               10  SD-002-A         PIC X(001).
               10  SD-002-B         PIC X(001).
           05  SD-003               PIC X(008).

       01  WS-BUF                   PIC X(100).

       01  OSR-DATA                 PIC X(1024).

       77  WS-COUNT                 PIC 9(008) COMP-5 VALUE 0.

       Procedure Division.
           DISPLAY MYNAME ' Begin'
           
           XML PARSE WS-BUF PROCESSING PROCEDURE 1000-para END-XML

           XML PARSE
               WS-BUF
               ENCODING 37
               VALIDATING OSR-DATA
               PROCESSING PROCEDURE 1000-para
               EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT EXCEPTION PERFORM 2000-para
           END-XML

           XML PARSE
               WS-BUF
               WITH ENCODING 37
               RETURNING NATIONAL
               VALIDATING WITH OSR-DATA
               PROCESSING PROCEDURE IS 1000-para
               ON EXCEPTION CALL 'CEE3ABD'
               NOT ON EXCEPTION PERFORM 2000-para
           END-XML

           XML PARSE
               WS-BUF
               WITH ENCODING 37
               RETURNING NATIONAL
               VALIDATING WITH FILE OSR-DATA-FILE
               PROCESSING PROCEDURE IS 1000-para
               ON EXCEPTION CALL 'CEE3ABD'
               NOT ON EXCEPTION PERFORM 2000-para
           END-XML

           XML PARSE WS-BUF PROCESSING PROCEDURE 1000-para THRU 
           1001-end END-XML

           XML PARSE
               WS-BUF
               ENCODING 37
               VALIDATING OSR-DATA
               PROCESSING PROCEDURE 1000-para THRU 1001-end
               EXCEPTION CALL 'CEE3ABD'
               NOT EXCEPTION PERFORM 2000-para
           END-XML

           XML PARSE
               WS-BUF
               WITH ENCODING 37
               RETURNING NATIONAL
               VALIDATING WITH OSR-DATA
               PROCESSING PROCEDURE IS 1000-para THRU 1001-end
               ON EXCEPTION CALL 'CEE3ABD' END-CALL
               NOT ON EXCEPTION PERFORM 2000-para
           END-XML

           XML PARSE
               WS-BUF
               WITH ENCODING 37
               RETURNING NATIONAL
               VALIDATING WITH FILE OSR-DATA-FILE
               PROCESSING PROCEDURE IS 1000-para THRU 1001-end
               ON EXCEPTION CALL 'CEE3ABD'
               NOT ON EXCEPTION PERFORM 2000-para
           END-XML

           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           .

       1001-end.

           .

       2000-para.

           .

