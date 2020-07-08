       Identification Division.
       Program-ID. testantlr030.
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  MYNAME               PIC X(012) VALUE 'testantlr030'.

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
           
           XML GENERATE WS-BUF FROM SOME-DATA END-XML

           XML GENERATE
               WS-BUF FROM SOME-DATA
               COUNT WS-COUNT
               ENCODING 37
               XML-DECLARATION
               ATTRIBUTES
               NAMESPACE 'AEIOU'
               NAMESPACE-PREFIX 'ZZ9PLURALZA'
               NAME SD-001 'ARTHUR'
                    SD-002 'DENT'
               TYPE SD-003 ELEMENT SD-002-A ATTRIBUTE SD-002-B CONTENT
               SUPPRESS EVERY NONNUMERIC ELEMENT WHEN LOW-VALUES
                        EVERY NUMERIC ELEMENT 
                              WHEN LOW-VALUES OR HIGH-VALUES
               ON EXCEPTION PERFORM 1000-para
               NOT ON EXCEPTION CALL 'CEE3ABD'
           END-XML

           XML GENERATE
               WS-BUF FROM SOME-DATA
               COUNT IN WS-COUNT
               WITH ENCODING 37
               WITH XML-DECLARATION
               WITH ATTRIBUTES
               NAMESPACE IS 'AEIOU'
               NAMESPACE-PREFIX IS 'ZZ9PLURALZA'
               NAME OF SD-001 IS 'ARTHUR'
                       SD-002 IS 'DENT'
               TYPE OF SD-003 IS ELEMENT
                       SD-002-A IS ATTRIBUTE
                       SD-002-B IS CONTENT
               SUPPRESS EVERY NONNUMERIC ELEMENT WHEN LOW-VALUES
                        SD-001 WHEN ZERO OR ZEROES OR ZEROS
                        EVERY NUMERIC ELEMENT 
                              WHEN LOW-VALUES OR HIGH-VALUES
                        SD-003 WHEN HIGH-VALUES
               ON EXCEPTION PERFORM 1000-para
               NOT ON EXCEPTION CALL 'CEE3ABD'
           END-XML


           DISPLAY MYNAME ' End'
           
           GOBACK
           .

       1000-para.

           .

