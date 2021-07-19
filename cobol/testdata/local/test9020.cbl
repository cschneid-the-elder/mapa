       Identification Division.
       Program-ID.    test9020.
       Data Division.
       Working-Storage Section.

       01  CONSTANTS.
           05  MYNAME                  PIC X(008) VALUE 'J7200569'.
      *
      *        Dynamically called or LINKed subroutines.
      *
           05  CSTM-DUMP-PGM           PIC X(008) VALUE 'J7200534'.
           05  ABEND-DUMP              PIC 9(008) COMP-5 VALUE 1.
           05  SANITY-CHECK            PIC 9(008) COMP-5 VALUE 10000.

      ******************************************************************
      * DCLGEN TABLE(SYSIBM.SYSPACKSTMT)                               *
      *        ACTION(REPLACE)                                         *
      *        LANGUAGE(COBOL)                                         *
      *        APOST                                                   *
      * ... IS THE DCLGEN COMMAND THAT MADE THE FOLLOWING STATEMENTS   *
      ******************************************************************
           EXEC SQL DECLARE SYSIBM.SYSPACKSTMT TABLE
           ( LOCATION                       VARCHAR(128) NOT NULL,
             COLLID                         VARCHAR(128) NOT NULL,
             NAME                           VARCHAR(128) NOT NULL,
             CONTOKEN                       CHAR(8) NOT NULL,
             SEQNO                          INTEGER NOT NULL,
             STMTNO                         SMALLINT NOT NULL,
             SECTNO                         SMALLINT NOT NULL,
             BINDERROR                      CHAR(1) NOT NULL,
             IBMREQD                        CHAR(1) NOT NULL,
             VERSION                        VARCHAR(122) NOT NULL,
             STMT                           VARCHAR(3500) NOT NULL,
             ISOLATION                      CHAR(1) NOT NULL,
             STATUS                         CHAR(1) NOT NULL,
             ACCESSPATH                     CHAR(1) NOT NULL,
             STMTNOI                        INTEGER NOT NULL,
             SECTNOI                        INTEGER NOT NULL,
             EXPLAINABLE                    CHAR(1) NOT NULL,
             QUERYNO                        INTEGER NOT NULL,
             ROWID                           ROWID NOT NULL,
             STMT_ID                        BIGINT NOT NULL,
             STATEMENT                      CLOB(2097152) NOT NULL,
             STMTBLOB                       BLOB(2097152) NOT NULL
           ) END-EXEC.
      ******************************************************************
      * COBOL DECLARATION FOR TABLE SYSIBM.SYSPACKSTMT                 *
      ******************************************************************
       01  DCLSYSPACKSTMT.
           10 LOCATION.
              49 LOCATION-LEN      PIC S9(4) USAGE COMP.
              49 LOCATION-TEXT     PIC X(128).
           10 COLLID.
              49 COLLID-LEN        PIC S9(4) USAGE COMP.
              49 COLLID-TEXT       PIC X(128).
           10 NAME.
              49 NAME-LEN          PIC S9(4) USAGE COMP.
              49 NAME-TEXT         PIC X(128).
           10 CONTOKEN             PIC X(8).
           10 SEQNO                PIC S9(9) USAGE COMP.
           10 STMTNO               PIC S9(4) USAGE COMP.
           10 SECTNO               PIC S9(4) USAGE COMP.
           10 BINDERROR            PIC X(1).
           10 IBMREQD              PIC X(1).
           10 VERSION.
              49 VERSION-LEN       PIC S9(4) USAGE COMP.
              49 VERSION-TEXT      PIC X(122).
           10 STMT.
              49 STMT-LEN          PIC S9(4) USAGE COMP.
              49 STMT-TEXT         PIC X(3500).
           10 ISOLATION            PIC X(1).
           10 STATUS_              PIC X(1).
           10 ACCESSPATH           PIC X(1).
           10 STMTNOI              PIC S9(9) USAGE COMP.
           10 SECTNOI              PIC S9(9) USAGE COMP.
           10 EXPLAINABLE          PIC X(1).
           10 QUERYNO              PIC S9(9) USAGE COMP.
           10 ROWID                USAGE SQL TYPE IS ROWID.
           10 STMT-ID              PIC S9(18) USAGE COMP.
           10 STATEMENT            USAGE SQL TYPE IS CLOB-LOCATOR.
           10 STMTBLOB             USAGE SQL TYPE IS BLOB-LOCATOR.
      ******************************************************************
      * THE NUMBER OF COLUMNS DESCRIBED BY THIS DECLARATION IS 22      *
      ******************************************************************

       01  WS-STATEMENT USAGE SQL TYPE IS CLOB-LOCATOR.
       01  WS-STMT-TXT  USAGE SQL TYPE IS CLOB(2M).

      ******************************************************************
      * DCLGEN TABLE(SYSIBM.SYSPACKLIST)                               *
      *        ACTION(REPLACE)                                         *
      *        LANGUAGE(COBOL)                                         *
      *        APOST                                                   *
      * ... IS THE DCLGEN COMMAND THAT MADE THE FOLLOWING STATEMENTS   *
      ******************************************************************
           EXEC SQL DECLARE SYSIBM.SYSPACKLIST TABLE
           ( PLANNAME                       VARCHAR(24) NOT NULL,
             SEQNO                          SMALLINT NOT NULL,
             LOCATION                       VARCHAR(128) NOT NULL,
             COLLID                         VARCHAR(128) NOT NULL,
             NAME                           VARCHAR(128) NOT NULL,
             TIMESTAMP                      TIMESTAMP NOT NULL,
             IBMREQD                        CHAR(1) NOT NULL
           ) END-EXEC.
      ******************************************************************
      * COBOL DECLARATION FOR TABLE SYSIBM.SYSPACKLIST                 *
      ******************************************************************
       01  DCLSYSPACKLIST.
           10 PLANNAME.
              49 PLANNAME-LEN      PIC S9(4) USAGE COMP.
              49 PLANNAME-TEXT     PIC X(24).
           10 SEQNO                PIC S9(4) USAGE COMP.
           10 LOCATION.
              49 LOCATION-LEN      PIC S9(4) USAGE COMP.
              49 LOCATION-TEXT     PIC X(128).
           10 COLLID.
              49 COLLID-LEN        PIC S9(4) USAGE COMP.
              49 COLLID-TEXT       PIC X(128).
           10 NAME.
              49 NAME-LEN          PIC S9(4) USAGE COMP.
              49 NAME-TEXT         PIC X(128).
           10 TIMESTAMP            PIC X(26).
           10 IBMREQD              PIC X(1).
      ******************************************************************
      * THE NUMBER OF COLUMNS DESCRIBED BY THIS DECLARATION IS 7       *
      ******************************************************************

           EXEC SQL DECLARE PLAN_PKG CURSOR FOR
                SELECT
                    STATEMENT
                  , SYSIBM.SYSPACKSTMT.NAME
                  , STMTNO
                  , STMTNOI
                  , SYSIBM.SYSPACKSTMT.SEQNO
                  , SECTNO
                FROM
                    SYSIBM.SYSPACKSTMT
                INNER JOIN
                    SYSIBM.SYSPACKLIST
                ON
                    SYSIBM.SYSPACKSTMT.LOCATION =
                    SYSIBM.SYSPACKLIST.LOCATION
                AND
                    SYSIBM.SYSPACKSTMT.COLLID   =
                    SYSIBM.SYSPACKLIST.COLLID
                AND
                    SYSIBM.SYSPACKSTMT.NAME     =
                    SYSIBM.SYSPACKLIST.NAME
                AND
                    SYSIBM.SYSPACKLIST.PLANNAME = :PLANNAME
           END-EXEC.

      ******************************************************************
      * DCLGEN TABLE(SYSIBM.SYSCOLUMNS)                                *
      *        LIBRARY(DOTCWS.CBL.COPYBOOK(DCCOL))                     *
      *        ACTION(REPLACE)                                         *
      *        LANGUAGE(COBOL)                                         *
      *        APOST                                                   *
      * ... IS THE DCLGEN COMMAND THAT MADE THE FOLLOWING STATEMENTS   *
      ******************************************************************
           EXEC SQL DECLARE SYSIBM.SYSCOLUMNS TABLE
           ( NAME                           VARCHAR(128) NOT NULL,
             TBNAME                         VARCHAR(128) NOT NULL,
             TBCREATOR                      VARCHAR(128) NOT NULL,
             COLNO                          SMALLINT NOT NULL,
             COLTYPE                        CHAR(8) NOT NULL,
             LENGTH                         SMALLINT NOT NULL,
             SCALE                          SMALLINT NOT NULL,
             NULLS                          CHAR(1) NOT NULL,
             COLCARD                        INTEGER NOT NULL,
             HIGH2KEY                       VARCHAR(2000) NOT NULL,
             LOW2KEY                        VARCHAR(2000) NOT NULL,
             UPDATES                        CHAR(1) NOT NULL,
             IBMREQD                        CHAR(1) NOT NULL,
             REMARKS                        VARCHAR(762) NOT NULL,
             DEFAULT                        CHAR(1) NOT NULL,
             KEYSEQ                         SMALLINT NOT NULL,
             FOREIGNKEY                     CHAR(1) NOT NULL,
             FLDPROC                        CHAR(1) NOT NULL,
             LABEL                          VARCHAR(90) NOT NULL,
             STATSTIME                      TIMESTAMP NOT NULL,
             DEFAULTVALUE                   VARCHAR(1536) NOT NULL,
             COLCARDF                       FLOAT NOT NULL,
             COLSTATUS                      CHAR(1) NOT NULL,
             LENGTH2                        INTEGER NOT NULL,
             DATATYPEID                     INTEGER NOT NULL,
             SOURCETYPEID                   INTEGER NOT NULL,
             TYPESCHEMA                     VARCHAR(128) NOT NULL,
             TYPENAME                       VARCHAR(128) NOT NULL,
             CREATEDTS                      TIMESTAMP NOT NULL,
             STATS_FORMAT                   CHAR(1) NOT NULL,
             PARTKEY_COLSEQ                 SMALLINT NOT NULL,
             PARTKEY_ORDERING               CHAR(1) NOT NULL,
             ALTEREDTS                      TIMESTAMP NOT NULL,
             CCSID                          INTEGER NOT NULL,
             HIDDEN                         CHAR(1) NOT NULL,
             RELCREATED                     CHAR(1) NOT NULL,
             CONTROL_ID                     INTEGER NOT NULL,
             XML_TYPEMOD_ID                 INTEGER NOT NULL,
             PERIOD                         CHAR(1) NOT NULL,
             GENERATED_ATTR                 CHAR(1) NOT NULL,
             HASHKEY_COLSEQ                 SMALLINT NOT NULL
           ) END-EXEC.
      ******************************************************************
      * COBOL DECLARATION FOR TABLE SYSIBM.SYSCOLUMNS                  *
      ******************************************************************
       01  DCLSYSCOLUMNS.
           10 NAME.
              49 NAME-LEN          PIC S9(4) USAGE COMP.
              49 NAME-TEXT         PIC X(128).
           10 TBNAME.
              49 TBNAME-LEN        PIC S9(4) USAGE COMP.
              49 TBNAME-TEXT       PIC X(128).
           10 TBCREATOR.
              49 TBCREATOR-LEN     PIC S9(4) USAGE COMP.
              49 TBCREATOR-TEXT    PIC X(128).
           10 COLNO                PIC S9(4) USAGE COMP.
           10 COLTYPE              PIC X(8).
           10 LENGTH_              PIC S9(4) USAGE COMP.
           10 SCALE                PIC S9(4) USAGE COMP.
           10 NULLS_               PIC X(1).
           10 COLCARD              PIC S9(9) USAGE COMP.
           10 HIGH2KEY.
              49 HIGH2KEY-LEN      PIC S9(4) USAGE COMP.
              49 HIGH2KEY-TEXT     PIC X(2000).
           10 LOW2KEY.
              49 LOW2KEY-LEN       PIC S9(4) USAGE COMP.
              49 LOW2KEY-TEXT      PIC X(2000).
           10 UPDATES              PIC X(1).
           10 IBMREQD              PIC X(1).
           10 REMARKS.
              49 REMARKS-LEN       PIC S9(4) USAGE COMP.
              49 REMARKS-TEXT      PIC X(762).
           10 DEFAULT              PIC X(1).
           10 KEYSEQ               PIC S9(4) USAGE COMP.
           10 FOREIGNKEY           PIC X(1).
           10 FLDPROC              PIC X(1).
           10 LABEL_.
              49 LABEL-LEN         PIC S9(4) USAGE COMP.
              49 LABEL-TEXT        PIC X(90).
           10 STATSTIME            PIC X(26).
           10 DEFAULTVALUE.
              49 DEFAULTVALUE-LEN
                 PIC S9(4) USAGE COMP.
              49 DEFAULTVALUE-TEXT
                 PIC X(1536).
           10 COLCARDF             USAGE COMP-2.
           10 COLSTATUS            PIC X(1).
           10 LENGTH2              PIC S9(9) USAGE COMP.
           10 DATATYPEID           PIC S9(9) USAGE COMP.
           10 SOURCETYPEID         PIC S9(9) USAGE COMP.
           10 TYPESCHEMA.
              49 TYPESCHEMA-LEN    PIC S9(4) USAGE COMP.
              49 TYPESCHEMA-TEXT   PIC X(128).
           10 TYPENAME.
              49 TYPENAME-LEN      PIC S9(4) USAGE COMP.
              49 TYPENAME-TEXT     PIC X(128).
           10 CREATEDTS            PIC X(26).
           10 STATS-FORMAT         PIC X(1).
           10 PARTKEY-COLSEQ       PIC S9(4) USAGE COMP.
           10 PARTKEY-ORDERING     PIC X(1).
           10 ALTEREDTS            PIC X(26).
           10 CCSID                PIC S9(9) USAGE COMP.
           10 HIDDEN               PIC X(1).
           10 RELCREATED           PIC X(1).
           10 CONTROL-ID           PIC S9(9) USAGE COMP.
           10 XML-TYPEMOD-ID       PIC S9(9) USAGE COMP.
           10 PERIOD               PIC X(1).
           10 GENERATED-ATTR       PIC X(1).
           10 HASHKEY-COLSEQ       PIC S9(4) USAGE COMP.
      ******************************************************************
      * THE NUMBER OF COLUMNS DESCRIBED BY THIS DECLARATION IS 41      *
      ******************************************************************

           EXEC SQL DECLARE TBL_COL
            INSENSITIVE
            SCROLL
            CURSOR
            WITH ROWSET POSITIONING
            FOR
            SELECT
                NAME
            FROM
                SYSIBM.SYSCOLUMNS
            WHERE
                TBNAME = :TBNAME
              AND
                TBCREATOR = :TBCREATOR
           END-EXEC.

           EXEC SQL DECLARE TBL_COL2
            INSENSITIVE
            SCROLL
            CURSOR
            WITH ROWSET POSITIONING
            FOR
            SELECT
                NAME
            FROM
                SYSIBM.SYSCOLUMNS
            WHERE
                TBNAME = :TBNAME
           END-EXEC.

           EXEC SQL INCLUDE SQLCA END-EXEC.
       Procedure Division.

       1110-OPEN-PLAN-PKG-CSR.
      *
      * Access the data for the list of packages associated
      * with the plan read from the PLANS file.
      *
           EXEC SQL OPEN PLAN_PKG END-EXEC

           MOVE SQLCODE TO DB2-RETURN-CODE
           EVALUATE TRUE
             WHEN SQL-CALL-VALID
                  CONTINUE
             WHEN OTHER
                  CALL 'GetDiagnostics'
                  MOVE 101 TO ABEND-CODE
                  PERFORM 9999-ABEND
           END-EVALUATE
           .

       1120-FETCH-PKG-DATA.
      *
      * Pull the package data into this program.
      *
           MOVE +0 TO WS-STMT-TXT-LENGTH

           EXEC SQL FETCH PLAN_PKG INTO
               :WS-STATEMENT
             , :DCLSYSPACKSTMT.NAME
             , :STMTNO
             , :STMTNOI
             , :DCLSYSPACKSTMT.SEQNO
             , :SECTNO
           END-EXEC.

           MOVE SQLCODE TO DB2-RETURN-CODE
           EVALUATE TRUE
             WHEN STMTNO = +0
              AND SEQNO OF DCLSYSPACKSTMT = +0
              AND SECTNO = +0
      *
      *           Documentation says these values indicate the
      *           row is for internal use only.
      *
                  CONTINUE
             WHEN SQL-CALL-VALID
                  PERFORM 1122-GET-STMT-CLOB
             WHEN ROW-NOT-FOUND
                  CONTINUE
             WHEN OTHER
                  CALL 'GetDiagnostics'
                  MOVE 102 TO ABEND-CODE
                  PERFORM 9999-ABEND
           END-EVALUATE

           .


       1122-GET-STMT-CLOB.
      *
      * Go get the actual SQL statement.
      *
      *
      * Note we must process the CLOB differently.
      *
           EXEC SQL
                SET :WS-STMT-TXT = SUBSTR(:WS-STATEMENT,1)
           END-EXEC

           MOVE SQLCODE TO DB2-RETURN-CODE
           EVALUATE TRUE
             WHEN SQL-CALL-VALID
                  CONTINUE
             WHEN OTHER
                  CALL 'GetDiagnostics'
                  MOVE 103 TO ABEND-CODE
                  PERFORM 9999-ABEND
           END-EVALUATE

           EXEC SQL FREE LOCATOR :WS-STATEMENT END-EXEC
           MOVE SQLCODE TO DB2-RETURN-CODE
           EVALUATE TRUE
             WHEN SQL-CALL-VALID
                  CONTINUE
             WHEN OTHER
                  CALL 'GetDiagnostics'
                  MOVE 105 TO ABEND-CODE
                  PERFORM 9999-ABEND
           END-EVALUATE
           .

       1140-CLOSE-PLAN-PKG-CSR.
      *
      * Close up the cursor.
      *
           EXEC SQL CLOSE PLAN_PKG END-EXEC

           MOVE SQLCODE TO DB2-RETURN-CODE
           EVALUATE TRUE
             WHEN SQL-CALL-VALID
                  CONTINUE
             WHEN OTHER
                  CALL 'GetDiagnostics'
                  MOVE 104 TO ABEND-CODE
                  PERFORM 9999-ABEND
           END-EVALUATE
           .

       9010-CSTM-DUMP.
       
           MOVE WS-RTV-LN TO WS-STRT-DATA-LN
           CALL CSTM-DUMP-PGM USING
              WS-STRT-DATA-HDR
              WS-STRT-DATA-LN
              W1-TSQ-REC
           END-CALL
           .

       9999-ABEND.
      *
           CALL 'CEE3ABD' USING
               ABEND-CODE
               ABEND-DUMP
           END-CALL
           .


      *COPY XDB2EX02.
       End Program test9020.
