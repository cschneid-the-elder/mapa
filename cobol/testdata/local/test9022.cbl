       Identification Division.
       Program-ID.    test9022.
      *
      * Test all the parameters of all the CICS commands.
      * This code probably wouldn't compile cleanly, in part
      * due to mutually exclusive options on some commands.
      * It's just here to test parsing.
      *
       Procedure Division.

           EXEC CICS
                ABEND
                ABCODE(X)
                CANCEL
                NODUMP
           END-EXEC

           EXEC CICS
                ACQUIRE
                PROCESS(X)
                PROCESSTYPE(X)
                ACTIVITYID(X)
           END-EXEC

           EXEC CICS
                ADD
                SUBEVENT(X)
                EVENT(X)
           END-EXEC

           EXEC CICS
                ADDRESS
                ACEE(X)
                COMMAREA(X)
                CWS(X)
                EIB(X)
                TCTUA(X)
                TWA(X)
           END-EXEC

           EXEC CICS
                ADDRESS
                SET(X)
                USING(X)
           END-EXEC

           EXEC CICS
                ALLOCATE
                SYSID(X)
                PROFILE(X)
                PARTNER(X)
                NOQUEUE
                STATE(X)
           END-EXEC

           EXEC CICS
                ALLOCATE
                SESSION(X)
                SYSID(X)
                PROFILE(X)
                NOQUEUE
           END-EXEC

           EXEC CICS
                ASKTIME ABSTIME(X)
           END-EXEC

           EXEC CICS
                ASSIGN
                ABCODE(data-area)
                ABDUMP(data-area)
                ABOFFSET(data-area)
                ABPROGRAM(data-area)
                ACTIVITY(data-area)
                ACTIVITYID(data-area)
                ALTSCRNHT(data-area)
                ALTSCRNWD(data-area)
                APLKYBD(data-area)
                APLTEXT(data-area)
                APPLICATION(data-area)
                APPLID(data-area)
                ASRAINTRPT(data-area)
                ASRAKEY(cvda)
                ASRAPSW(data-area)
                ASRAPSW16(data-area)
                ASRAREGS(data-area)
                ASRAREGS64(data-area)
                ASRASPC(cvda)
                ASRASTG(cvda)
                BRIDGE(data-area)
                BTRANS(data-area)
                CHANNEL(data-area)
                CMDSEC(data-area)
                COLOR(data-area)
                CWALENG(data-area)
                DEFSCRNHT(data-area)
                DEFSCRNWD(data-area)
                DELIMITER(data-area)
                DESTCOUNT(data-area)
                DESTID(data-area)
                DESTIDLENG(data-area)
                DSSCS(data-area)
                DS3270(data-area)
                ERRORMSG(data-area)
                ERRORMSGLEN(data-area)
                EWASUPP(data-area)
                EXTDS(data-area)
                FACILITY(data-area)
                FCI(data-area)
                GCHARS(data-area)
                GCODES(data-area)
                GMMI(data-area)
                HILIGHT(data-area)
                INITPARM(data-area)
                INITPARMLEN(data-area)
                INPARTN(data-area)
                INPUTMSGLEN(data-area)
                INVOKINGPROG(data-area)
                KATAKANA(data-area)
                LANGINUSE(data-area)
                LDCMNEM(data-area)
                LDCNUM(data-area)
                LINKLEVEL(data-area)
                LOCALCCSID(data-area)
                MAJORVERSION(data-area)
                MAPCOLUMN(data-area)
                MAPHEIGHT(data-area)
                MAPLINE(data-area)
                MAPWIDTH(data-area)
                MICROVERSION(data-area)
                MINORVERSION(data-area)
                MSRCONTROL(data-area)
                NATLANGINUSE(data-area)
                NETNAME(data-area)
                NEXTTRANSID(data-area)
                NUMTAB(data-area)
                OPCLASS(data-area)
                OPERATION(data-area)
                OPERKEYS(data-area)
                OPID(data-area)
                OPSECURITY(data-area)
                ORGABCODE(data-area)
                OUTLINE(data-area)
                PAGENUM(data-area)
                PARTNPAGE(data-area)
                PARTNS(data-area)
                PARTNSET(data-area)
                PLATFORM(data-area)
                PRINSYSID(data-area)
                PROCESS(data-area)
                PROCESSTYPE(data-area)
                PROGRAM(data-area)
                PS(data-area)
                QNAME(data-area)
                RESSEC(data-area)
                RESTART(data-area)
                RETURNPROG(data-area)
                SCRNHT(data-area)
                SCRNWD(data-area)
                SIGDATA(data-area)
                SOSI(data-area)
                STARTCODE(data-area)
                STATIONID(data-area)
                SYSID(data-area)
                TASKPRIORITY(data-area)
                TCTUALENG(data-area)
                TELLERID(data-area)
                TERMCODE(data-area)
                TERMPRIORITY(data-area)
                TEXTKYBD(data-area)
                TEXTPRINT(data-area)
                TNADDR(data-area)
                TNIPFAMILY(cvda)
                TNPORT(data-area)
                TRANPRIORITY(data-area)
                TWALENG(data-area)
                UNATTEND(data-area)
                USERID(data-area)
                USERNAME(data-area)
                USERPRIORITY(data-area)
                VALIDATION(data-area)
           END-EXEC

           EXEC CICS
                BIF
                DEEDIT
                FIELD(X)
                LENGTH(X)
           END-EXEC

           EXEC CICS
                BIF
                DIGEST
                RECORD(X)
                RECORDLEN(X)
                HEX
                BINARY
                BASE64
                DIGESTTYPE(CVDA)
                RESULT(X)
           END-EXEC

           EXEC CICS
                BUILD
                ATTACH
                ATTACHID(X)
                PROCESS(X)
                RESOURCE(X)
                RPROCESS(X)
                RRESOURCE(X)
                QUEUE(X)
                IUTYUPE(X)
                DATASTR(X)
                RECFM(X)
           END-EXEC

           EXEC CICS
                CANCEL
                REQID(X)
                SYSID(X)
                TRANSID(X)
           END-EXEC

           EXEC CICS
                CANCEL
                ACTIVITY(X)
                ACQACTIVITY
                ACQPROCESS
           END-EXEC

           EXEC CICS
                CHANGEPHRASE(X)
                PHRASELEN(X)
                NEWPHRASE(X)
                NEWPHRASELEN(X)
                USERID(X)
                ESMREASON(X)
                ESMRESP(X)
           END-EXEC

           EXEC CICS
                CHANGEPASSWORD(X)
                NEWPASSWORD(X)
                USERID(X)
                ESMREASON(X)
                ESMRESP(X)
           END-EXEC

           EXEC CICS
                CHANGE
                PRIORITY(X)
           END-EXEC

           EXEC CICS
                CHECK
                ACQPROCESS
                COMPSTATUS(X)
                ABCODE(X)
                ABPROGRAM(X)
                MODE(X)
                SUSPSTATUS(X)
           END-EXEC

           EXEC CICS
                CHECK
                ACTIVITY(X)
                ACQACTIVITY
                COMPSTATUS(X)
                ABCODE(X)
                ABPROGRAM(X)
                MODE(X)
                SUSPSTATUS(X)
           END-EXEC

           EXEC CICS
                CHECK
                TIMER(X)
                STATUS(X)
           END-EXEC

           EXEC CICS
                CONNECT
                PROCESS
                CONVID(X)
                SESSION(X)
                PROCNAME(X)
                PROCLENGTH(X)
                PARTNER(X)
                PIPLIST(X)
                PIPLENGTH(X)
                SYNCLEVEL(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                CONVERSE
                FROM(X)
                FROMLENGTH(X)
                FROMFLENGTH(X)
                INTO(X)
                SET(X)
                TOLENGTH(X)
                TOFLENGTH(X)
                MAXLENGTH(X)
                MAXFLENGTH(X)
                NOTRUNCATE
           END-EXEC

           EXEC CICS
                CONVERSE
                CONVID(X)
                FROM(X)
                FROMLENGTH(X)
                FROMFLENGTH(X)
                INTO(X)
                SET(X)
                TOLENGTH(X)
                TOFLENGTH(X)
                MAXLENGTH(X)
                MAXFLENGTH(X)
                NOTRUNCATE
                STATE(X)
           END-EXEC

           EXEC CICS
                CONVERSE
                FROM(X)
                FROMLENGTH(X)
                FROMFLENGTH(X)
                INTO(X)
                SET(X)
                ERASE
                DEFAULT
                ALTERNATE
                CTLCHAR(X)
                TOLENGTH(X)
                TOFLENGTH(X)
                MAXLENGTH(X)
                MAXFLENGTH(X)
                DEFRESP
                NOTRUNCATE
                ASIS
           END-EXEC

           EXEC CICS
                CONVERSE
                FROM(X)
                FROMLENGTH(X)
                FROMFLENGTH(X)
                INTO(X)
                SET(X)
                TOLENGTH(X)
                TOFLENGTH(X)
                MAXLENGTH(X)
                MAXFLENGTH(X)
                DEFRESP
                FMH
           END-EXEC

           EXEC CICS
                CONVERSE
                FROM(X)
                FROMLENGTH(X)
                FROMFLENGTH(X)
                FMH
                CONVID(X)
                SESSION(X)
                ATTACHID(X)
                INTO(X)
                SET(X)
                TOLENGTH(X)
                TOFLENGTH(X)
                MAXLENGTH(X)
                MAXFLENGTH(X)
                DEFRESP
                NOTRUNCATE
           END-EXEC

           EXEC CICS
                CONVERSE
                STRFIELD
                LDC(X)
                LINEADDR(X)
                LEAVEKB
                PSEUDOBIN
           END-EXEC

           EXEC CICS
                CONVERTTIME
                DATESTRING(X)
                ABSTIME(X)
           END-EXEC

           EXEC CICS
                DEFINE
                ACTIVITY(X)
                EVENT(X)
                TRANSID(X)
                PROGRAM(X)
                USERID(X)
                ACTIVITYID(X)
           END-EXEC

           EXEC CICS
                DEFINE
                COMPOSITE
                EVENT(X)
                AND
                OR
                SUBEVENT1(X)
                SUBEVENT2(X)
                SUBEVENT3(X)
                SUBEVENT4(X)
                SUBEVENT5(X)
                SUBEVENT6(X)
                SUBEVENT7(X)
                SUBEVENT8(X)
           END-EXEC

           EXEC CICS
                DEFINE
                COUNTER(X)
                POOL(X)
                VALUE(X)
                MINIMUM(X)
                MAXIMUM(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                DEFINE
                DCOUNTER(X)
                POOL(X)
                VALUE(X)
                MINIMUM(X)
                MAXIMUM(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                DEFINE
                INPUT
                EVENT(X)
           END-EXEC

           EXEC CICS
                DEFINE
                PROCESS(X)
                PROCESSTYPE(X)
                TRANSID(X)
                PROGRAM(X)
                USERID(X)
                NOCHECK
           END-EXEC

           EXEC CICS
                DEFINE
                TIMER(X)
                EVENT(X)
                AFTER
                DAYS(X)
                HOURS(X)
                MINUTES(X)
                SECONDS(X)
           END-EXEC

           EXEC CICS
                DEFINE
                TIMER(X)
                EVENT(X)
                AT
                HOURS(X)
                MINUTES(X)
                SECONDS(X)
                ON
                YEAR(X)
                MONTH(X)
                DAYOFMONTH(X)
                DAYOFYEAR(X)
           END-EXEC

           EXEC CICS
                DELAY
                INTERVAL(X)
                TIME(X)
                FOR
                HOURS(X)
                MINUTES(X)
                SECONDS(X)
                MILLISECS(X)
                UNTIL
                HOURS(X)
                MINUTES(X)
                SECONDS(X)
                REQID(X)
           END-EXEC

           EXEC CICS
                DELETE
                FILE(X)
                TOKEN(X)
                RIDFLD(X)
                KEYLENGTH(X)
                GENERIC
                NUMREC(X)
                SYSTEM(X)
                NOSUSPEND
                RBA
                RRN
           END-EXEC

           EXEC CICS
                DELETE
                ACTIVITY(X)
           END-EXEC

           EXEC CICS
                DELETE
                CHANNEL(X)
           END-EXEC

           EXEC CICS
                CONTAINER(X)
                ACTIVITY(X)
                ACQACTIVITY
                PROCESS
                ACQPROCESS
           END-EXEC

           EXEC CICS
                DELETE
                CONTAINER(X)
                CHANNEL(X)
           END-EXEC

           EXEC CICS
                DELETE
                COUNTER(X)
                POOL(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                DELETE
                DCOUNTER(X)
                POOL(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                DELETE
                EVENT(X)
           END-EXEC

           EXEC CICS
                DELETE
                TIMER(X)
           END-EXEC

           EXEC CICS
                DELETEQ
                TD
                QUEUE(X)
                SYSID(X)
           END-EXEC

           EXEC CICS
                DELETEQ
                TS
                QUEUE(X)
                QNAME(X)
                SYSID(X)
           END-EXEC

           EXEC CICS
                DEQ
                RESOURCE(X)
                LENGTH(X)
                UOW
                MAXLIFETIME(X)
                TASK
           END-EXEC

           EXEC CICS
                DOCUMENT
                CREATE
                DOCTOKEN(X)
                FROM(X)
                TEXT(X)
                BINARY(X)
                LENGTH(X)
                FROMDOC(X)
                TEMPLATE(X)
                SYMBOLLIST(X)
                LISTLENGTH(X)
                DELIMITER(X)
                UNESCAPED
                DOCSIZE(X)
                HOSTCODEPAGE(X)
           END-EXEC

           EXEC CICS
                DOCUMENT
                DELETE
                DOCTOKEN(X)
           END-EXEC

           EXEC CICS
                DOCUMENT
                INSERT
                DOCTOKEN(X)
                TEXT(X)
                BINARY(X)
                FROM(X)
                LENGTH(X)
                SYMBOL(X)
                TEMPLATE(X)
                FROMDOC(X)
                BOOKMARK(X)
                DOCSIZE(X)
                HOSTCODEPAGE(X)
                AT(X)
                TO(X)
           END-EXEC

           EXEC CICS
                DOCUMENT
                RETRIEVE
                DOCTOKEN(X)
                INTO(X)
                LENGTH(X)
                MAXLENGTH(X)
                CHARACTERSET(X)
                DATAONLY
           END-EXEC

           EXEC CICS
                DOCUMENT
                SET
                DOCTOKEN(X)
                SYMBOL(X)
                VALUE(X)
                SYMBOLLIST(X)
                DELIMITER(X)
                LENGTH(X)
                UNESCAPED
           END-EXEC

           EXEC CICS
                DUMP
                TRANSACTION
                DUMPCODE(X)
                FROM(X)
                LENGTH(X)
                FLENGTH(X)
                COMPLETE
                TRT
                SEGMENTLIST(X)
                LENGTHLIST(X)
                NUMSEGMENTS(X)
                TASK
                STORAGE
                PROGRAM
                TERMINAL
                TABLES
                FCT
                PCT
                PPT
                SIT
                TCT
                DUMPID(X)
           END-EXEC

           EXEC CICS
                ENDBR
                FILE(X)
                REQID(X)
                SYSID(X)
           END-EXEC

           EXEC CICS
                ENDBROWSE
                ACTIVITY
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                ENDBROWSE
                CONTAINER
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                ENDBROWSE
                EVENT
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                ENDBROWSE
                PROCESS
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                ENDBROWSE
                TIMER
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                ENQ
                RESOURCE(X)
                LENGTH(X)
                UOW
                MAXLIFETIME(X)
                TASK
                NOSUSPEND
           END-EXEC

           EXEC CICS
                ENTER
                TRACENUM(X)
                FROM(X)
                FROMLENGTH(X)
                RESOURCE(X)
                EXCEPTION
           END-EXEC

           EXEC CICS
                EXTRACT
                ATTACH
                ATTACHID(X)
                CONVID(X)
                SESSION(X)
                PROCESS(X)
                RESOURCE(X)
                RPROCESS(X)
                RRESOURCE(X)
                QUEUE(X)
                IUTYPE(X)
                DATASTR(X)
                RECFM(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                ATTRIBUTES
                CONVID(X)
                SESSION(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                CERTIFICATE(X)
                LENGTH(X)
                SERIALNUM(X)
                SERIALNUMLENGTH(X)
                USERID(X)
                OWNER
                ISSUER
                COMMONNAME(X)
                COMMONNAMELEN(X)
                COUNTRY(X)
                COUNTRYLEN(X)
                STATE(X)
                STATELEN(X)
                LOCALITY(X)
                LOCALITYLEN(X)
                ORGANIZATION(X)
                ORGANIZATIONLEN(X)
                ORGUNIT(X)
                ORGUNITLEN(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                LOGONMSG
                INTO(X)
                SET(X)
                LENGTH(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                PROCESS
                PROCNAME(X)
                PROCLENGTH(X)
                MAXPROCLEN(X)
                CONVID(X)
                SYNCLEVEL(X)
                PIPLIST(X)
                PIPLENGTH(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                TCPIP
                AUTHENTICATE(X)
                CLIENTNAME(X)
                CNAMELENGTH(X)
                SERVERNAME(X)
                SNAMELENGTH(X)
                CLIENTADDR(X)
                CADDRLENGTH(X)
                CLNTIPFAMILY(X)
                CLIENTADDRNU(X)
                CLNTADDR6NU(X)
                SERVERADDR(X)
                SADDRLENGTH(X)
                SRVRIPFAMILY(X)
                SERVERADDRNU(X)
                SRVRADDR6NU(X)
                SSLTYPE(X)
                TCPIPSERVICE(X)
                PORTNUMBER(X)
                PORTNUMNU(X)
                PRIVACY(X)
                MAXDATALENT(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                TCT
                NETNAME(X)
                SYSID(X)
                TERMID(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                WEB
                SCHEME(X)
                HOST(X)
                HOSTLENGTH(X)
                HOSTTYPE(X)
                HTTPMETHOD(X)
                METHODLENGTH(X)
                HTTPVERSION(X)
                VERSIONLEN(X)
                PATH(X)
                PATHLENGTH(X)
                PORTNUMBER(X)
                QUERYSTRING(X)
                QUERYSTRLEN(X)
                REQUESTTYPE(X)
                URIMAP(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                WEB
                SESSTOKEN(X)
                SCHEME(X)
                HOST(X)
                HOSTLENGTH(X)
                HOSTTYPE(X)
                HTTPVERSION(X)
                VERSIONLEN(X)
                PATH(X)
                PATHLENGTH(X)
                PORTNUMBER(X)
                URIMAP(X)
                REALM(X)
                REALMLEN(X)
           END-EXEC

           EXEC CICS
                FETCH
                ANY(X)
                CHANNEL(X)
                COMPSTATUS(X)
                ABCODE(X)
                NOSUSPEND
                TIMEOUT(X)
           END-EXEC

           EXEC CICS
                FETCH
                CHILD(X)
                CHANNEL(X)
                COMPSTATUS(X)
                ABCODE(X)
                NOSUSPEND
                TIMEOUT(X)
           END-EXEC

           EXEC CICS
                FORCE
                TIMER
                ACQACTIVITY
                ACQPROCESS
           END-EXEC

           EXEC CICS
                FORMATTIME
                ABSTIME(X)
                DATE(X)
                FULLDATE(X)
                DATEFORM(X)
                DATESEP(X)
                DATESTRING(X)
                STRINGZONE(X)
                DAYCOUNT(X)
                DAYOFMONTH(X)
                DAYOFWEEK(X)
                DDMMYY(X)
                DDMMYYYY(X)
                MILLISECONDS(X)
                MMDDYY(X)
                MMDDYYYY(X)
                MONTHOFYEAR(X)
                STRINGFORMAT(X)
                TIME(X)
                TIMESEP(X)
                YEAR(X)
                YYYYDDD(X)
                YYYYDDMM(X)
                YYYYMMDD(X)
           END-EXEC

           EXEC CICS
                FREE
                CONVID(X)
                SESSION(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                FREE
                CHILD(X)
           END-EXEC

           EXEC CICS
                FREEMAIN
                DATA(X)
                DATAPOINTER(X)
           END-EXEC

           EXEC CICS
                FREEMAIN64
                DATA(X)
                DATAPOINTER(X)
           END-EXEC

           EXEC CICS
                GDS
                ALLOCATE
                SYSID(X)
                MODENAME(X)
                PARTNER(X)
                CONVID(X)
                RETCODE(X)
                NOQUEUE
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                ASSIGN
                PRINCONVID(X)
                PRINSYSID(X)
                RETCODE(X)
           END-EXEC

           EXEC CICS
                GDS
                CONNECT
                PROCESS
                CONVID(X)
                PROCNAME(X)
                PROCLENGTH(X)
                PARTNER(X)
                PIPLIST(X)
                PIPLENGTH(X)
                SYNCLEVEL(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                EXTRACT
                ATTRIBUTES
                CONVID(X)
                STATE(X)
                CONVDATA(X)
                RETCODE(X)
           END-EXEC

           EXEC CICS
                GDS
                EXTRACT
                PROCESS
                CONVID(X)
                PROCNAME(X)
                PROCLENGTH(X)
                MAXPROCLEN(X)
                SYNCLEVEL(X)
                PIPLIST(X)
                PIPLENGTH(X)
                RETCODE(X)
           END-EXEC

           EXEC CICS
                GDS
                FREE
                CONVID(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                ISSUE
                ABEND
                CONVID(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                ISSUE
                CONFIRMATION
                CONVID(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                ISSUE
                ERROR
                CONVID(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                ISSUE
                PREPARE
                CONVID(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                ISSUE
                SIGNAL
                CONVID(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                RECEIVE
                CONVID(X)
                INTO(X)
                SET(X)
                FLENGTH(X)
                MAXFLENGTH(X)
                BUFFER
                LLID
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                SEND
                CONVID(X)
                FROM(X)
                FLENGTH(X)
                INVITE
                LAST
                CONFIRM
                WAIT
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GDS
                WAIT
                CONVID(X)
                CONVDATA(X)
                RETCODE(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                GET
                CONTAINER(X)
                ACTIVITY(X)
                ACQACTIVITY
                PROCESS
                ACQPROCESS
                INTO(X)
                SET(X)
                NODATA
                FLENGTH(X)
           END-EXEC

           EXEC CICS
                GET
                CONTAINER(X)
                CHANNEL(X)
                INTO(X)
                FLENGTH(X)
                BYTEOFFSET(X)
                SET(X)
                NODATA
                INTOCCSID(X)
                INTOCODEPAGE(X)
                CONVERTST(X)
                CCSID(X)
           END-EXEC









           EXEC CICS
                QUERY SECURITY
                RESTYPE(X)
                RESCLASS(X)
                RESIDLENGTH(X)
                RESID(X)
                LOGMESSAGE(X)
                USERID(X)
                READ(X)
                UPDATE(X)
                CONTROL(X)
                ALTER(X)
           END-EXEC

           EXEC CICS RETURN END-EXEC.
