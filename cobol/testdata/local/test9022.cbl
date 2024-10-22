       Identification Division.
       Program-ID.    test9022.
      *
      * Test all the parameters of all the CICS API commands.
      * This code definitely won't compile cleanly, in part
      * due to mutually exclusive options on some commands.
      * It's just here to test parsing.
      *
      * Current as of CICS TS 6.1
      *
       Data Division.
       Working-Storage Section.
       01  CONSTANTS.
           05  X  PIC X(008) VALUE 'ABCD1234'.
           
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
                CWA(X)
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
                IUTYPE(X)
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
                CHANGE
                PHRASE(X)
                PHRASELEN(X)
                NEWPHRASE(X)
                NEWPHRASELEN(X)
                USERID(X)
                ESMREASON(X)
                ESMRESP(X)
                CHANGETIME(X)
                DAYSLEFT(X)
                EXPIRYTIME(X)
                INVALIDCOUNT(X)
                LASTUSETIME(X)
           END-EXEC

           EXEC CICS
                CHANGE
                PASSWORD(X)
                NEWPASSWORD(X)
                USERID(X)
                ESMREASON(X)
                ESMRESP(X)
                CHANGETIME(X)
                DAYSLEFT(X)
                EXPIRYTIME(X)
                INVALIDCOUNT(X)
                LASTUSETIME(X)
           END-EXEC

           EXEC CICS
                CHANGE
                TASK
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
                LDC(X)
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
                SYSID(X)
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
                DELETE
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
                SERIALNUMLEN(X)
                USERID(X)
                OWNER
                ISSUER
                COMMONNAME(X)
                COMMONNAMLEN(X)
                COUNTRY(X)
                COUNTRYLEN(X)
                STATE(X)
                STATELEN(X)
                LOCALITY(X)
                LOCALITYLEN(X)
                ORGANIZATION(X)
                ORGANIZATLEN(X)
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
                MAXDATALEN(X)
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
                GET
                COUNTER(X)
                POOL(X)
                VALUE(X)
                INCREMENT(X)
                REDUCE
                WRAP
                COMPAREMIN(X)
                COMPAREMAX(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                GET
                DCOUNTER(X)
                POOL(X)
                VALUE(X)
                INCREMENT(X)
                REDUCE
                WRAP
                COMPAREMIN(X)
                COMPAREMAX(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                GETMAIN
                SET(X)
                FLENGTH(X)
                BELOW
                LENGTH(X)
                INITIMG(X)
                EXECUTABLE
                SHARED
                NOSUSPEND
                USERDATAKEY
                CICSDATAKEY
           END-EXEC

           EXEC CICS
                GETMAIN64
                SET(X)
                FLENGTH(X)
                LOCATION(X)
                EXECUTABLE
                SHARED
                NOSUSPEND
                USERDATAKEY
                CICSDATAKEY
           END-EXEC

           EXEC CICS
                GETNEXT
                ACTIVITY(X)
                BROWSETOKEN(X)
                ACTIVITYID(X)
                LEVEL(X)
           END-EXEC

           EXEC CICS
                GETNEXT
                CONTAINER(X)
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                GETNEXT
                EVENT(X)
                BROWSETOKEN(X)
                COMPOSITE(X)
                EVENTTYPE(X)
                FIRESTATUS(X)
                PREDICATE(X)
                TIMER(X)
           END-EXEC

           EXEC CICS
                GETNEXT
                PROCESS(X)
                BROWSETOKEN(X)
                ACTIVITYID(X)
           END-EXEC

           EXEC CICS
                GETNEXT
                TIMER(X)
                ACTIVITYID(X)
                EVENT(X)
                STATUS(X)
                ABSTIME(X)
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                GET64
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
                HANDLE
                ABEND
                CANCEL
                PROGRAM(X)
                LABEL(X)
                RESET
           END-EXEC

           EXEC CICS
                HANDLE
                AID
                ANYKEY
                CLEAR
                CLRPARTN
                ENTER
                LIGHTPEN
                OPERID
                PA1
                PA2
                PA3
                PF1
                PF2
                PF3
                PF4
                PF5
                PF6
                PF7
                PF8
                PF9
                PF10
                PF11
                PF12
                PF13
                PF14
                PF15
                PF16
                PF17
                PF18
                PF19
                PF20
                PF21
                PF22
                PF23
                PF24
                TRIGGER
           END-EXEC

           EXEC CICS
                HANDLE
                CONDITION
                NORMAL
                ERROR
                RDATT
                WRBRK
                EOF
                EODS
                EOC
                INBFMH
                ENDINPT
                NONVAL
                NOSTART
                TERMIDERR
                FILENOTFOUND
                NOTFND
                DUPREC
                DUPKEY
                INVREQ
                IOERR
                NOSPACE
                NOTOPEN
                ENDFILE
                ILLOGIC
                LENGERR
                QZERO
                SIGNAL
                QBUSY
                ITEMERR
                PGMIDERR
                TRANSIDERR
                ENDDATA
                INVTSREQ
                EXPIRED
                RETPAGE
                RTEFAIL
                RTESOME
                TSIOERR
                MAPFAIL
                INVERRTERM
                INVMPSZ
                IGREQID
                OVERFLOW
                INVLDC
                NOSTG
                JIDERR
                QIDERR
                NOJBUFSP
                DSSTAT
                SELNERR
                FUNCERR
                UNEXPIN
                NOPASSBKRD
                NOPASSBKWR
                SEGIDERR
                SYSIDERR
                ISCINVREQ
                ENQBUSY
                ENVDEFERR
                IGREQCD
                SESSIONERR
                SYSBUSY
                SESSBUSY
                NOTALLOC
                CBIDERR
                INVEXITREQ
                INVPARTNSET
                INVPARTN
                PARTNFAIL
                USERIDERR
                NOTAUTH
                VOLIDERR
                SUPPRESSED
                RESIDERR
                NOSPOOL
                TERMERR
                ROLLEDBACK
                END
                DISABLED
                ALLOCERR
                STRELERR
                OPENERR
                SPOLBUSY
                SPOLERR
                NODEIDERR
                TASKIDERR
                TCIDERR
                DSNNOTFOUND
                LOADING
                MODELIDERR
                OUTDESCRERR
                PARTNERIDERR
                PROFILEIDERR
                NETNAMEIDERR
                LOCKED
                RECORDBUSY
                UOWNOTFOUND
                UOWLNOTFOUND
                LINKABEND
                CHANGED
                PROCESSBUSY
                ACTIVITYBUSY
                PROCESSERR
                ACTIVITYERR
                CONTAINERERR
                EVENTERR
                TOKENERR
                NOTFINISHED
                POOLERR
                TIMERERR
                SYMBOLERR
                TEMPLATERR
                NOTSUPERUSER
                CSDERR
                DUPRES
                RESUNAVAIL
                CHANNELERR
                CCSIDERR
                TIMEDOUT
                CODEPAGEERR
                INCOMPLETE
                APPNOTFOUND
                BUSY
           END-EXEC

           EXEC CICS
                HANDLE
                CONDITION
                NORMAL(LABEL1)
                ERROR(LABEL1)
                RDATT(LABEL1)
                WRBRK(LABEL1)
                EOF(LABEL1)
                EODS(LABEL1)
                EOC(LABEL1)
                INBFMH(LABEL1)
                ENDINPT(LABEL1)
                NONVAL(LABEL1)
                NOSTART(LABEL1)
                TERMIDERR(LABEL1)
                FILENOTFOUND(LABEL1)
                NOTFND(LABEL1)
                DUPREC(LABEL1)
                DUPKEY(LABEL1)
                INVREQ(LABEL1)
                IOERR(LABEL1)
                NOSPACE(LABEL1)
                NOTOPEN(LABEL1)
                ENDFILE(LABEL1)
                ILLOGIC(LABEL1)
                LENGERR(LABEL1)
                QZERO(LABEL1)
                SIGNAL(LABEL1)
                QBUSY(LABEL1)
                ITEMERR(LABEL1)
                PGMIDERR(LABEL1)
                TRANSIDERR(LABEL1)
                ENDDATA(LABEL1)
                INVTSREQ(LABEL1)
                EXPIRED(LABEL1)
                RETPAGE(LABEL1)
                RTEFAIL(LABEL1)
                RTESOME(LABEL1)
                TSIOERR(LABEL1)
                MAPFAIL(LABEL1)
                INVERRTERM(LABEL1)
                INVMPSZ(LABEL1)
                IGREQID(LABEL1)
                OVERFLOW(LABEL1)
                INVLDC(LABEL1)
                NOSTG(LABEL1)
                JIDERR(LABEL1)
                QIDERR(LABEL1)
                NOJBUFSP(LABEL1)
                DSSTAT(LABEL1)
                SELNERR(LABEL1)
                FUNCERR(LABEL1)
                UNEXPIN(LABEL1)
                NOPASSBKRD(LABEL1)
                NOPASSBKWR(LABEL1)
                SEGIDERR(LABEL1)
                SYSIDERR(LABEL1)
                ISCINVREQ(LABEL1)
                ENQBUSY(LABEL1)
                ENVDEFERR(LABEL1)
                IGREQCD(LABEL1)
                SESSIONERR(LABEL1)
                SYSBUSY(LABEL1)
                SESSBUSY(LABEL1)
                NOTALLOC(LABEL1)
                CBIDERR(LABEL1)
                INVEXITREQ(LABEL1)
                INVPARTNSET(LABEL1)
                INVPARTN(LABEL1)
                PARTNFAIL(LABEL1)
                USERIDERR(LABEL1)
                NOTAUTH(LABEL1)
                VOLIDERR(LABEL1)
                SUPPRESSED(LABEL1)
                RESIDERR(LABEL1)
                NOSPOOL(LABEL1)
                TERMERR(LABEL1)
                ROLLEDBACK(LABEL1)
                END(LABEL1)
                DISABLED(LABEL1)
                ALLOCERR(LABEL1)
                STRELERR(LABEL1)
                OPENERR(LABEL1)
                SPOLBUSY(LABEL1)
                SPOLERR(LABEL1)
                NODEIDERR(LABEL1)
                TASKIDERR(LABEL1)
                TCIDERR(LABEL1)
                DSNNOTFOUND(LABEL1)
                LOADING(LABEL1)
                MODELIDERR(LABEL1)
                OUTDESCRERR(LABEL1)
                PARTNERIDERR(LABEL1)
                PROFILEIDERR(LABEL1)
                NETNAMEIDERR(LABEL1)
                LOCKED(LABEL1)
                RECORDBUSY(LABEL1)
                UOWNOTFOUND(LABEL1)
                UOWLNOTFOUND(LABEL1)
                LINKABEND(LABEL1)
                CHANGED(LABEL1)
                PROCESSBUSY(LABEL1)
                ACTIVITYBUSY(LABEL1)
                PROCESSERR(LABEL1)
                ACTIVITYERR(LABEL1)
                CONTAINERERR(LABEL1)
                EVENTERR(LABEL1)
                TOKENERR(LABEL1)
                NOTFINISHED(LABEL1)
                POOLERR(LABEL1)
                TIMERERR(LABEL1)
                SYMBOLERR(LABEL1)
                TEMPLATERR(LABEL1)
                NOTSUPERUSER(LABEL1)
                CSDERR(LABEL1)
                DUPRES(LABEL1)
                RESUNAVAIL(LABEL1)
                CHANNELERR(LABEL1)
                CCSIDERR(LABEL1)
                TIMEDOUT(LABEL1)
                CODEPAGEERR(LABEL1)
                INCOMPLETE(LABEL1)
                APPNOTFOUND(LABEL1)
                BUSY(LABEL1)
           END-EXEC

           EXEC CICS
                IGNORE
                CONDITION
                NORMAL
                ERROR
                RDATT
                WRBRK
                EOF
                EODS
                EOC
                INBFMH
                ENDINPT
                NONVAL
                NOSTART
                TERMIDERR
                FILENOTFOUND
                NOTFND
                DUPREC
                DUPKEY
                INVREQ
                IOERR
                NOSPACE
                NOTOPEN
                ENDFILE
                ILLOGIC
                LENGERR
                QZERO
                SIGNAL
                QBUSY
                ITEMERR
                PGMIDERR
                TRANSIDERR
                ENDDATA
                INVTSREQ
                EXPIRED
                RETPAGE
                RTEFAIL
                RTESOME
                TSIOERR
                MAPFAIL
                INVERRTERM
                INVMPSZ
                IGREQID
                OVERFLOW
                INVLDC
                NOSTG
                JIDERR
                QIDERR
                NOJBUFSP
                DSSTAT
                SELNERR
                FUNCERR
                UNEXPIN
                NOPASSBKRD
                NOPASSBKWR
                SEGIDERR
                SYSIDERR
                ISCINVREQ
                ENQBUSY
                ENVDEFERR
                IGREQCD
                SESSIONERR
                SYSBUSY
                SESSBUSY
                NOTALLOC
                CBIDERR
                INVEXITREQ
                INVPARTNSET
                INVPARTN
                PARTNFAIL
                USERIDERR
                NOTAUTH
                VOLIDERR
                SUPPRESSED
                RESIDERR
                NOSPOOL
                TERMERR
                ROLLEDBACK
                END
                DISABLED
                ALLOCERR
                STRELERR
                OPENERR
                SPOLBUSY
                SPOLERR
                NODEIDERR
                TASKIDERR
                TCIDERR
                DSNNOTFOUND
                LOADING
                MODELIDERR
                OUTDESCRERR
                PARTNERIDERR
                PROFILEIDERR
                NETNAMEIDERR
                LOCKED
                RECORDBUSY
                UOWNOTFOUND
                UOWLNOTFOUND
                LINKABEND
                CHANGED
                PROCESSBUSY
                ACTIVITYBUSY
                PROCESSERR
                ACTIVITYERR
                CONTAINERERR
                EVENTERR
                TOKENERR
                NOTFINISHED
                POOLERR
                TIMERERR
                SYMBOLERR
                TEMPLATERR
                NOTSUPERUSER
                CSDERR
                DUPRES
                RESUNAVAIL
                CHANNELERR
                CCSIDERR
                TIMEDOUT
                CODEPAGEERR
                INCOMPLETE
                APPNOTFOUND
                BUSY
           END-EXEC

           EXEC CICS
                INQUIRE
                ACTIVITYID(X)
                ABCODE(X)
                ABPROGRAM(X)
                ACTIVITY(X)
                COMPSTATUS(X)
                EVENT(X)
                MODE(X)
                PROCESS(X)
                PROCESSTYPE(X)
                PROGRAM(X)
                SUSPSTATUS(X)
                TRANSID(X)
                USERID(X)
           END-EXEC

           EXEC CICS
                INQUIRE
                CONTAINER(X)
                ACTIVITYID(X)
                PROCESS(X)
                PROCESSTYPE(X)
                DATALENGTH(X)
                SET(X)
           END-EXEC

           EXEC CICS
                INQUIRE
                EVENT(X)
                ACTIVITYID(X)
                EVENTTYPE(X)
                FIRESTATUS(X)
                COMPOSITE(X)
                PREDICATE(X)
                TIMER(X)
           END-EXEC

           EXEC CICS
                INQUIRE
                PROCESS(X)
                PROCESSTYPE(X)
                ACTIVITYID(X)
           END-EXEC

           EXEC CICS
                INQUIRE
                TIMER(X)
                ACTIVITYID(X)
                EVENT(X)
                STATUS(X)
                ABSTIME(X)
           END-EXEC

           EXEC CICS
                INVOKE
                APPLICATION(X)
                OPERATION(X)
                PLATFORM(X)
                MAJORVERSION(X)
                MINORVERSION(X)
                EXACTMATCH
                MINIMUM
                COMMAREA(X)
                LENGTH(X)
                CHANNEL(X)
           END-EXEC

           EXEC CICS
                INVOKE
                SERVICE(X)
                CHANNEL(X)
                OPERATION(X)
                URI(X)
                URIMAP(X)
                SCOPE(X)
                SCOPELEN(X)
           END-EXEC

           EXEC CICS
                INVOKE
                WEBSERVICE(X)
                CHANNEL(X)
                OPERATION(X)
                URI(X)
                URIMAP(X)
                SCOPE(X)
                SCOPELEN(X)
           END-EXEC

           EXEC CICS
                ISSUE
                ABEND
                CONVID(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                ISSUE
                ABORT
                DESTID(X)
                DESTIDLENG(X)
                SUBADDR(X)
                CONSOLE
                PRINT
                CARD
                WPMEDIA1
                WPMEDIA2
                WPMEDIA3
                WPMEDIA4
                VOLUME(X)
                VOLUMELENG(X)
           END-EXEC

           EXEC CICS
                ISSUE
                ADD
                DESTID(X)
                DESTIDLENG(X)
                VOLUME(X)
                VOLUMELENG(X)
                FROM(X)
                LENGTH(X)
                NUMREC(X)
                DEFRESP
                NOWAIT
                RIDFLD(X)
                RRN
           END-EXEC

           EXEC CICS
                ISSUE
                CONFIRMATION
                CONVID(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                ISSUE
                COPY
                TERMID(X)
                CTLCHAR(X)
                WAIT
           END-EXEC

           EXEC CICS
                ISSUE
                DISCONNECT
                SESSION(X)
           END-EXEC

           EXEC CICS
                ISSUE
                END
                DESTID(X)
                DESTIDLENG(X)
                SUBADDR(X)
                CONSOLE
                PRINT
                CARD
                WPMEDIA1
                WPMEDIA2
                WPMEDIA3
                WPMEDIA4
                VOLUME(X)
                VOLUMELENG(X)
           END-EXEC

           EXEC CICS
                ISSUE
                ENDFILE
                ENDOUTPUT
           END-EXEC

           EXEC CICS
                ISSUE
                EODS
           END-EXEC

           EXEC CICS
                ISSUE
                ERASE
                DESTID(X)
                DESTIDLENG(X)
                VOLUME(X)
                VOLUMELENG(X)
                RIDFLD(X)
                KEYLENGTH(X)
                KEYNUMBER(X)
                NUMREC(X)
                RRN
                DEFRESP
                NOWAIT
           END-EXEC

           EXEC CICS
                ISSUE
                ERASEAUP
                WAIT
           END-EXEC

           EXEC CICS
                ISSUE
                ERROR
                CONVID(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                ISSUE
                LOAD
                PROGRAM(X)
                CONVERSE
           END-EXEC

           EXEC CICS
                ISSUE
                NOTE
                DESTID(X)
                DESTIDLENG(X)
                VOLUME(X)
                VOLUMELENG(X)
                RIDFLD(X)
                RRN
           END-EXEC

           EXEC CICS
                ISSUE
                PASS
                LUNAME(X)
                FROM(X)
                LENGTH(X)
                LOGMODE(X)
                LOGONLOGMODE
                NOQUIESCE
           END-EXEC

           EXEC CICS
                ISSUE
                PREPARE
                CONVID(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                ISSUE
                PRINT
           END-EXEC

           EXEC CICS
                ISSUE
                QUERY
                DESTID(X)
                DESTIDLENG(X)
                VOLUME(X)
                VOLUMELENG(X)
           END-EXEC

           EXEC CICS
                ISSUE
                RECEIVE
                INTO(X)
                SET(X)
                LENGTH(X)
           END-EXEC

           EXEC CICS
                ISSUE
                REPLACE
                DESTID(X)
                DESTIDLENG(X)
                VOLUME(X)
                VOLUMELENG(X)
                FROM(X)
                LENGTH(X)
                NUMREC(X)
                RIDFLD(X)
                KEYLENGTH(X)
                KEYNUMBER(X)
                RRN
                DEFRESP
                NOWAIT
           END-EXEC

           EXEC CICS
                ISSUE
                RESET
           END-EXEC

           EXEC CICS
                ISSUE
                SEND
                DESTID(X)
                DESTIDLENG(X)
                SUBADDR(X)
                CONSOLE
                PRINT
                CARD
                WPMEDIA1
                WPMEDIA2
                WPMEDIA3
                WPMEDIA4
                VOLUME(X)
                VOLUMELENG(X)
                FROM(X)
                LENGTH(X)
           END-EXEC

           EXEC CICS
                ISSUE
                SIGNAL
                CONVID(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                ISSUE
                SIGNAL
                CONVID(X)
                SESSION(X)
           END-EXEC

           EXEC CICS
                ISSUE
                SEND
                DESTID(X)
                DESTIDLENG(X)
                SUBADDR(X)
                CONSOLE
                PRINT
                CARD
                WPMEDIA1
                WPMEDIA2
                WPMEDIA3
                WPMEDIA4
                VOLUME(X)
                VOLUMELENG(X)
           END-EXEC

           EXEC CICS
                JOURNAL
           END-EXEC

           EXEC CICS
                LINK
                PROGRAM('SAMVIMES')
                COMMAREA(X)
                LENGTH(X)
                DATALENGTH(X)
                CHANNEL(X)
                INPUTMSG(X)
                INPUTMSGLEN(X)
                SYSID(X)
                SYNCONRETURN
                TRANSID(X)
           END-EXEC

           EXEC CICS
                LINK
                ACQPROCESS
                INPUTEVENT(X)
           END-EXEC

           EXEC CICS
                LINK
                ACTIVITY(X)
                ACQACTIVITY
                INPUTEVENT(X)
           END-EXEC

           EXEC CICS
                LOAD
                PROGRAM(X)
                SET(X)
                LENGTH(X)
                FLENGTH(X)
                ENTRY(X)
                HOLD
           END-EXEC

           EXEC CICS
                MONITOR
                POINT(X)
                DATA1(X)
                DATA2(X)
                ENTRYNAME(X)
           END-EXEC

           EXEC CICS
                MOVE
                CONTAINER(X)
                AS(X)
                FROMPROCESS
                FROMACTIVITY(X)
                TOPROCESS
                TOACTIVITY(X)
           END-EXEC

           EXEC CICS
                MOVE
                CONTAINER(X)
                AS(X)
                CHANNEL(X)
                TOCHANNEL(X)
           END-EXEC

           EXEC CICS
                POINT
                CONVID(X)
                SESSION(X)
           END-EXEC

           EXEC CICS
                POP
                HANDLE
           END-EXEC

           EXEC CICS
                POST
                INTERVAL(X)
                TIME(X)
                AFTER
                HOURS(X)
                MINUTES(X)
                SECONDS(X)
                AT
                SET(X)
                REQID(X)
           END-EXEC

           EXEC CICS
                PURGE
                MESSAGE
           END-EXEC

           EXEC CICS
                PUSH
                HANDLE
           END-EXEC

           EXEC CICS
                PUT
                CONTAINER(X)
                ACTIVITY(X)
                ACQACTIVITY
                PROCESS
                ACQPROCESS
                FROM(X)
                FLENGTH(X)
           END-EXEC

           EXEC CICS
                PUT
                CONTAINER(X)
                CHANNEL(X)
                FROM(X)
                FLENGTH(X)
                BIT
                DATATYPE(X)
                CHAR
                FROMCCSID(X)
                FROMCODEPAGE(X)
                APPEND
                PREPEND
           END-EXEC

           EXEC CICS
                PUT64
                CONTAINER(X)
                CHANNEL(X)
                FROM(X)
                FLENGTH(X)
                BIT
                DATATYPE(X)
                CHAR
                FROMCCSID(X)
                FROMCODEPAGE(X)
                APPEND
                PREPEND
           END-EXEC

           EXEC CICS
                QUERY
                CHANNEL(X)
                CONTAINERCNT(X)
           END-EXEC

           EXEC CICS
                QUERY
                COUNTER(X)
                POOL(X)
                VALUE(X)
                MINIMUM(X)
                MAXIMUM(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                QUERY
                DCOUNTER(X)
                POOL(X)
                VALUE(X)
                MINIMUM(X)
                MAXIMUM(X)
                NOSUSPEND
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

           EXEC CICS
                READ
                FILE(X)
                UNCOMMITTED
                CONSISTENT
                REPEATABLE
                UPDATE
                TOKEN(X)
                INTO(X)
                SET(X)
                RIDFLD(X)
                KEYLENGTH(X)
                GENERIC
                SYSID(X)
                LENGTH(X)
                DEBKEY
                DEBREC
                RBA
                XRBA
                EQUAL
                GTEQ
                NOSUSPEND
           END-EXEC

           EXEC CICS
                READNEXT
                FILE(X)
                INTO(X)
                SET(X)
                UNCOMMITTED
                CONSISTENT
                REPEATABLE
                UPDATE
                TOKEN(X)
                RIDFLD(X)
                KEYLENGTH(X)
                REQID(X)
                SYSID(X)
                LENGTH(X)
                RBA
                RRN
                XRBA
                NOSUSPEND
           END-EXEC

           EXEC CICS
                READPREV
                FILE(X)
                INTO(X)
                SET(X)
                UNCOMMITTED
                CONSISTENT
                REPEATABLE
                UPDATE
                TOKEN(X)
                RIDFLD(X)
                KEYLENGTH(X)
                REQID(X)
                SYSID(X)
                LENGTH(X)
                RBA
                RRN
                XRBA
                NOSUSPEND
           END-EXEC

           EXEC CICS
                READQ
                TD
                QUEUE(X)
                INTO(X)
                SET(X)
                LENGTH(X)
                SYSID(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                READQ
                TS
                QUEUE(X)
                QNAME(X)
                INTO(X)
                SET(X)
                LENGTH(X)
                NUMITEMS(X)
                NEXT
                ITEM(X)
                SYSID(X)
           END-EXEC

           EXEC CICS
                RECEIVE
                ASIS
                BUFFER
                CONVID(X)
                FLENGTH(X)
                INTO(X)
                LENGTH(X)
                MAXFLENGTH(X)
                MAXLENGTH(X)
                NOTRUNCATE
                SESSION(X)
                SET(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                RECEIVE
                ASIS
                BUFFER
                FLENGTH(X)
                INTO(X)
                LENGTH(X)
                MAXFLENGTH(X)
                MAXLENGTH(X)
                NOTRUNCATE
                SESSION(X)
                SET(X)
                STATE(X)
                LEAVEKB
                PASSBK
                PSEUDOBIN
           END-EXEC

           EXEC CICS
                RECEIVE
                MAP(X)
                MAPSET(X)
                INTO(X)
                SET(X)
                TERMINAL
                FROM(X)
                LENGTH(X)
                ASIS
                INPARTN(X)
           END-EXEC

           EXEC CICS
                RECEIVE
                MAP(X)
                MAPPINGDEV(X)
                FROM(X)
                LENGTH(X)
                MAPSET(X)
                INTO(X)
                SET(X)
           END-EXEC

           EXEC CICS
                RECEIVE
                PARTN(X)
                INTO(X)
                SET(X)
                LENGTH(X)
                ASIS
           END-EXEC

           EXEC CICS
                RELEASE
                PROGRAM(X)
           END-EXEC

           EXEC CICS
                REMOVE
                SUBEVENT(X)
                EVENT(X)
           END-EXEC

           EXEC CICS
                REQUEST
                ENCRYPTPTKT(X)
                FLENGTH(X)
                ENCRYPTKEY(X)
                ESMAPPNAME(X)
                ESMREASON(X)
                ESMRESP(X)
           END-EXEC

           EXEC CICS
                REQUEST
                PASSTICKET(X)
                ESMAPPNAME(X)
                ESMRESP(X)
                ESMREASON(X)
           END-EXEC

           EXEC CICS
                RESET
                ACQPROCESS
           END-EXEC

           EXEC CICS
                RESET
                ACTIVITY(X)
           END-EXEC

           EXEC CICS
                RESETBR
                FILE(X)
                RIDFLD(X)
                KEYLENGTH(X)
                GENERIC
                REQID(X)
                SYSID(X)
                GTEQ
                EQUAL
                RBA
                RRN
                XRBA
           END-EXEC

           EXEC CICS
                RESUME
                ACQACTIVITY
                ACQPROCESS
                ACTIVITY(X)
           END-EXEC

           EXEC CICS
                RETRIEVE
                INTO(X)
                SET(X)
                LENGTH(X)
                RTRANSID(X)
                RTERMID(X)
                QUEUE(X)
                WAIT
           END-EXEC

           EXEC CICS
                RETRIEVE
                REATTACH
                EVENT(X)
                EVENTTYPE(X)
           END-EXEC

           EXEC CICS
                RETRIEVE
                SUBEVENT(X)
                EVENT(X)
                EVENTTYPE(X)
           END-EXEC

           EXEC CICS
                RETURN
                TRANSID(EIBTRNID)
                COMMAREA(DFHCOMMAREA)
                LENGTH(LENGTH OF DFHCOMMAREA)
                CHANNEL(X)
                IMMEDIATE
                INPUTMSG(X)
                INPUTMSGLEN(X)
                ENDACTIVITY
           END-EXEC

           EXEC CICS
                REWIND
                COUNTER(X)
                POOL(X)
                INCREMENT(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                REWIND
                DCOUNTER(X)
                POOL(X)
                INCREMENT(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                REWRITE
                FILE(X)
                TOKEN(X)
                FROM(X)
                SYSID(X)
                LENGTH(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                ROUTE
                INTERVAL(X)
                TIME(X)
                AFTER
                HOURS(X)
                MINUTES(X)
                SECONDS(X)
                AT
                ERRTERM(X)
                TITLE(X)
                LIST(X)
                OPCLASS(X)
                REQID(X)
                LDC(X)
                NLEOM
           END-EXEC

           EXEC CICS
                RUN
                ACTIVITY(X)
                ACQACTIVITY
                ACQPROCESS
                SYNCHRONOUS
                ASYNCHRONOUS
                FACILITYTOKN(X)
                INPUTEVENT(X)
           END-EXEC

           EXEC CICS
                RUN
                TRANSID(X)
                CHANNEL(X)
                CHILD(X)
           END-EXEC

           EXEC CICS
                SEND
                ALTERNATE
                ASIS
                ATTACHID(X)
                CBUFF
                CNOTCOMPL
                CTLCHAR(X)
                DEFAULT
                DEFRESP
                ERASE
                FLENGTH(X)
                FMH
                FROM(X)
                INVITE
                LAST
                LEAVEKB
                LENGTH(X)
                LINEADDR(X)
                PASSBK
                PSEUDOBIN
                SESSION(X)
                STATE(X)
                STRFIELD
                WAIT
           END-EXEC

           EXEC CICS
                SEND
                ALTERNATE
                ATTACHID(X)
                CNOTCOMPL
                CONFIRM
                CONVID(X)
                CTLCHAR(X)
                DEFAULT
                DEFRESP
                ERASE
                FLENGTH(X)
                FMH
                FROM(X)
                INVITE
                LAST
                LDC(X)
                LENGTH(X)
                SESSION(X)
                STATE(X)
                STRFIELD
                WAIT
           END-EXEC

           EXEC CICS
                SEND
                CONTROL
                ACCUM
                ACTPARTN(X)
                ALARM
                ALTERNATE
                CURSOR(X)
                DEFAULT
                ERASE
                ERASEAUP
                FORMFEED
                FREEKB
                FRSET
                HONEOM
                LAST
                LDC(X)
                L40
                L64
                L80
                MSR(X)
                OUTPARTN(X)
                PAGING
                PRINT
                REQID(X)
                SET(X)
                TERMINAL
                WAIT
           END-EXEC

           EXEC CICS
                SEND
                MAP(X)
                ACCUM
                ACTPARTN(X)
                ALARM
                ALTERNATE
                CURSOR(X)
                DATAONLY
                DEFAULT
                ERASE
                ERASEAUP
                FMHPARM(X)
                FORMFEED
                FREEKB
                FROM(X)
                FRSET
                HONEOM
                LAST
                LDC(X)
                LENGTH(X)
                L40
                L64
                L80
                MAPONLY
                MAPSET(X)
                MSR(X)
                NLEOM
                NOFLUSH
                OUTPARTN(X)
                PAGING
                PRINT
                REQID(X)
                SET(X)
                TERMINAL
                WAIT
           END-EXEC

           EXEC CICS
                SEND
                MAP(X)
                MAPPINGDEV(X)
                SET(X)
                MAPSET(X)
                FROM(X)
                DATAONLY
                LENGTH(X)
                MAPONLY
                CURSOR(X)
                FORMFEED
                ERASE
                ERASEAUP
                PRINT
                FREEKB
                ALARM
                FRSET
           END-EXEC

           EXEC CICS
                SEND
                PAGE
                RELEASE
                RETAIN
                TRANSID(X)
                TRAILER(X)
                SET(X)
                AUTOPAGE
                CURRENT
                ALL
                NOAUTOPAGE
                OPERPURGE
                FMHPARM(X)
                LAST
           END-EXEC

           EXEC CICS
                SEND
                PARTNSET(X)
           END-EXEC

           EXEC CICS
                SEND
                TEXT
                ACCUM
                ACTPARTN(X)
                ALARM
                ALTERNATE
                CURSOR(X)
                DEFAULT
                ERASE
                FMHPARM(X)
                FORMFEED
                FREEKB
                FROM(X)
                HEADER(X)
                HONEOM
                JUSFIRST
                JUSLAST
                JUSTIFY(X)
                LAST
                LDC(X)
                LENGTH(X)
                L40
                L64
                L80
                MSR(X)
                NLEOM
                OUTPARTN(X)
                PAGING
                PRINT
                REQID(X)
                SET(X)
                TERMINAL
                TRAILER(X)
                WAIT
           END-EXEC

           EXEC CICS
                SEND
                TEXT
                MAPPED
                FROM(X)
                LENGTH(X)
                TERMINAL
                WAIT
                LAST
                PAGING
                REQID(X)
           END-EXEC

           EXEC CICS
                SEND
                TEXT
                NOEDIT
           END-EXEC

           EXEC CICS
                SIGNAL
                EVENT(X)
                FROMCHANNEL(X)
                FROM(X)
                FROMLENGTH(X)
           END-EXEC

           EXEC CICS
                SIGNOFF
           END-EXEC

           EXEC CICS
                SIGNON
                USERID(X)
                ESMREASON(X)
                ESMRESP(X)
                GROUPID(X)
                LANGUAGECODE(X)
                NATLANG(X)
                LANGINUSE(X)
                NATLANGINUSE(X)
                PASSWORD(X)
                NEWPASSWORD(X)
                PHRASE(X)
                PHRASELEN(X)
                NEWPHRASE(X)
                NEWPHRASELEN(X)
                OIDCARD(X)
                CHANGETIME(X)
                DAYSLEFT(X)
                EXPIRYTIME(X)
                INVALIDCOUNT(X)
                LASTUSETIME(X)
           END-EXEC

           EXEC CICS
                SIGNON
                TOKEN(X)
                TOKENLEN(X)
                TOKENTYPE(X)
                KERBEROS
                BIT
                DATATYPE(X)
                BASE64
                GROUPID(X)
                LANGUAGECODE(X)
                NATLANG(X)
                LANGINUSE(X)
                NATLANGINUSE(X)
                ESMREASON(X)
                ESMRESP(X)
           END-EXEC

           EXEC CICS
                SOAPFAULT
                ADD
                FAULTSTRING(X)
                FAULTSTRLEN(X)
                NATLANG(X)
                SUBCODESTR(X)
                SUBCODELEN(X)
                FROMCCSID(X)
           END-EXEC

           EXEC CICS
                SOAPFAULT
                CREATE
                FAULTCODE(X)
                CLIENT
                SERVER
                SENDER
                RECEIVER
                FAULTCODESTR(X)
                FAULTCODELEN(X)
                FAULTSTRING(X)
                FAULTSTRLEN(X)
                NATLANG(X)
                ROLE(X)
                ROLELENGTH(X)
                FAULTACTOR(X)
                FAULTACTLEN(X)
                DETAIL(X)
                DETAILLENGTH(X)
                FROMCCSID(X)
           END-EXEC

           EXEC CICS
                SOAPFAULT
                DELETE
           END-EXEC

           EXEC CICS
                SPOOLCLOSE
                TOKEN(X)
                KEEP
                DELETE
                NOHANDLE
                RESP
                RESP2
           END-EXEC

           EXEC CICS
                SPOOLOPEN
                INPUT
                TOKEN(X)
                USERID(X)
                CLASS(X)
                NOHANDLE
                RESP
                RESP2
           END-EXEC

           EXEC CICS
                SPOOLOPEN
                OUTPUT
                TOKEN(X)
                USERID(X)
                NODE(X)
                CLASS(X)
                OUTDESCR(X)
                NOCC
                ASA
                MCC
                PRINT
                RECORDLENGTH(X)
                PUNCH
                NOHANDLE
                RESP
                RESP2
           END-EXEC

           EXEC CICS
                SPOOLREAD
                TOKEN(X)
                INTO(X)
                MAXFLENGTH(X)
                TOFLENGTH(X)
                NOHANDLE
                RESP
                RESP2
           END-EXEC

           EXEC CICS
                SPOOLWRITE
                TOKEN(X)
                FROM(X)
                FLENGTH(X)
                LINE
                PAGE
                NOHANDLE
                RESP
                RESP2
           END-EXEC

           EXEC CICS
                START
                TRANSID(X)
                INTERVAL(X)
                AFTER
                HOURS(X)
                MINUTES(X)
                SECONDS(X)
                AT
                REQID(X)
                FROM(X)
                LENGTH(X)
                FMH
                TERMID(X)
                USERID(X)
                SYSID(X)
                RTRANSID(X)
                RTERMID(X)
                QUEUE(X)
                NOCHECK
                PROTECT
           END-EXEC

           EXEC CICS
                START
                ATTACH
                TRANSID(X)
                FROM(X)
                LENGTH(X)
           END-EXEC

           EXEC CICS
                START
                BREXIT(X)
                TRANSID(X)
                BRDATA(X)
                BRDATALENGTH(X)
                USERID(X)
           END-EXEC

           EXEC CICS
                START
                TRANSID(X)
                TERMID(X)
                USERID(X)
                SYSID(X)
                NOCHECK
                PROTECT
           END-EXEC

           EXEC CICS
                STARTBR
                FILE(X)
                RIDFLD(X)
                KEYLENGTH(X)
                GENERIC
                REQID(X)
                SYSID(X)
                DEBKEY
                DEBREC
                RBA
                RRN
                XRBA
                GTEQ
                EQUAL
           END-EXEC

           EXEC CICS
                STARTBROWSE
                ACTIVITY
                ACTIVITYID(X)
                PROCESS(X)
                PROCESSTYPE(X)
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                STARTBROWSE
                CONTAINER
                ACTIVITYID(X)
                PROCESS(X)
                PROCESSTYPE(X)
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                STARTBROWSE
                CONTAINER
                CHANNEL(X)
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                STARTBROWSE
                EVENT
                BROWSETOKEN(X)
                ACTIVITYID(X)
           END-EXEC

           EXEC CICS
                STARTBROWSE
                PROCESS
                PROCESSTYPE(X)
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                STARTBROWSE
                TIMER(X)
                ACTIVITYID(X)
                BROWSETOKEN(X)
           END-EXEC

           EXEC CICS
                SUSPEND
           END-EXEC

           EXEC CICS
                SUSPEND
                ACQACTIVITY
                ACQPROCESS
                ACTIVITY(X)
           END-EXEC

           EXEC CICS
                SYNCPOINT
                ROLLBACK
           END-EXEC

           EXEC CICS
                TEST
                EVENT(X)
                FIRESTATUS(X)
           END-EXEC

           EXEC CICS
                TRANSFORM
                DATATOJSON
                CHANNEL(X)
                INCONTAINER(X)
                OUTCONTAINER(X)
                TRANSFORMER(X)
           END-EXEC

           EXEC CICS
                TRANSFORM
                DATATOXML
                CHANNEL(X)
                DATCONTAINER(X)
                ELEMNAME(X)
                ELEMNAMELEN(X)
                ELEMNS(X)
                ELEMNSLEN(X)
                TYPENAME(X)
                TYPENAMELEN(X)
                TYPENS(X)
                TYPENSLEN(X)
                XMLCONTAINER(X)
                XMLTRANSFORM(X)
           END-EXEC

           EXEC CICS
                TRANSFORM
                JSONTODATA
                CHANNEL(X)
                INCONTAINER(X)
                OUTCONTAINER(X)
                TRANSFORMER(X)
           END-EXEC

           EXEC CICS
                TRANSFORM
                XMLTODATA
                CHANNEL(X)
                DATCONTAINER(X)
                ELEMNAME(X)
                ELEMNAMELEN(X)
                ELEMNS(X)
                ELEMNSLEN(X)
                NSCONTAINER(X)
                TYPENAME(X)
                TYPENAMELEN(X)
                TYPENS(X)
                TYPENSLEN(X)
                XMLCONTAINER(X)
                XMLTRANSFORM(X)
           END-EXEC

           EXEC CICS
                UNLOCK
                FILE(X)
                TOKEN(X)
                SYSID(X)
           END-EXEC

           EXEC CICS
                UPDATE
                COUNTER(X)
                POOL(X)
                VALUE(X)
                COMPAREMIN(X)
                COMPAREMAX(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                UPDATE
                DCOUNTER(X)
                POOL(X)
                VALUE(X)
                COMPAREMIN(X)
                COMPAREMAX(X)
                NOSUSPEND
           END-EXEC

           EXEC CICS
                VERIFY
                PASSWORD(X)
                USERID(X)
                GROUPID(X)
                CHANGETIME(X)
                DAYSLEFT(X)
                ESMREASON(X)
                ESMRESP(X)
                EXPIRYTIME(X)
                INVALIDCOUNT(X)
                LASTUSETIME(X)
           END-EXEC

           EXEC CICS
                VERIFY
                PHRASE(X)
                PHRASELEN(X)
                USERID(X)
                GROUPID(X)
                CHANGETIME(X)
                DAYSLEFT(X)
                ESMREASON(X)
                ESMRESP(X)
                EXPIRYTIME(X)
                INVALIDCOUNT(X)
                LASTUSETIME(X)
           END-EXEC

           EXEC CICS
                VERIFY
                TOKEN(X)
                TOKENLEN(X)
                TOKENTYPE(X)
                BASICAUTH
                JWT
                KERBEROS
                ISUSERID(X)
                BIT
                DATATYPE(X)
                BASE64
                ENCRYPTKEY(X)
                OUTTOKEN(X)
                OUTTOKENLEN(X)
                ESMRESP(X)
                ESMREASON(X)
           END-EXEC

           EXEC CICS
                WAIT
                CONVID(X)
                STATE(X)
           END-EXEC

           EXEC CICS
                WAIT
                EVENT
                ECADDR(X)
                NAME(X)
           END-EXEC

           EXEC CICS
                WAIT
                EXTERNAL
                ECBLIST(X)
                NUMEVENTS(X)
                PURGEABLE
                PURGEABILITY(X)
                NOTPURGEABLE
                NAME(X)
           END-EXEC

           EXEC CICS
                WAIT
                JOURNALNAME(X)
                REQID(X)
           END-EXEC

           EXEC CICS
                WAIT
                JOURNALNUM(X)
                REQID(X)
           END-EXEC

           EXEC CICS
                WAIT
                SIGNAL
           END-EXEC

           EXEC CICS
                WAIT
                TERMINAL
                CONVID(X)
                SESSION(X)
           END-EXEC

           EXEC CICS
                WAITCICS
                ECBLIST(X)
                NUMEVENTS(X)
                PURGEABLE
                PURGEABILITY(X)
                NOTPURGEABLE
                NAME(X)
           END-EXEC

           EXEC CICS
                WEB
                CLOSE
                SESSTOKEN(X)
           END-EXEC

           EXEC CICS
                WEB
                CONVERSE
                SESSTOKEN(X)
                PATH(X)
                PATHLENGTH(X)
                URIMAP(X)
                GET
                HEAD
                PATCH
                POST
                PUT
                TRACE
                OPTIONS
                METHOD(X)
                MEDIATYPE(X)
                QUERYSTRING(X)
                QUERYSTRLEN(X)
                ACTION(X)
                EXPECT
                NOCLOSE
                CLOSE
                CLOSESTATUS(X)
                INTO(X)
                SET(X)
                TOCONTAINER(X)
                TOCHANNEL(X)
                TOLENGTH(X)
                MAXLENGTH(X)
                NOTRUNCATE
                STATUSCODE(X)
                STATUSTEXT(X)
                STATUSLEN(X)
                BODYCHARSET(X)
                DOCTOKEN(X)
                NODOCDELETE
                DOCDELETE
                DOCSTATUS(X)
                FROM(X)
                FROMLENGTH(X)
                CONTAINER(X)
                CHANNEL(X)
                NONE
                BASICAUTH
                AUTHENTICATE(X)
                USERNAME(X)
                USERNAMELEN(X)
                PASSWORD(X)
                PASSWORDLEN(X)
                CHARACTERSET(X)
                CLICONVERT
                NOINCONVERT
                NOOUTCONVERT
                NOCLICONVERT
                CLIENTCONV(X)
           END-EXEC

           EXEC CICS
                WEB
                ENDBROWSE
                FORMFIELD
           END-EXEC

           EXEC CICS
                WEB
                ENDBROWSE
                HTTPHEADER
                SESSTOKEN(X)
           END-EXEC

           EXEC CICS
                WEB
                ENDBROWSE
                QUERYPARM
           END-EXEC

           EXEC CICS
                WEB
                EXTRACT
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
                WEB
                EXTRACT
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
                WEB
                OPEN
                URIMAP(X)
                HOST(X)
                HOSTLENGTH(X)
                PORTNUMBER(X)
                SCHEME(X)
                CERTIFICATE(X)
                CIPHERS(X)
                NUMCIPHERS(X)
                CODEPAGE(X)
                SESSTOKEN(X)
                HTTPVNUM(X)
                HTTPRNUM(X)
           END-EXEC

           EXEC CICS
                WEB
                PARSE
                URL(X)
                URLLENGTH(X)
                SCHEMENAME(X)
                HOST(X)
                HOSTLENGTH(X)
                HOSTTYPE(X)
                PORTNUMBER(X)
                PATH(X)
                PATHLENGTH(X)
                QUERYSTRING(X)
                QUERYSTRLEN(X)
           END-EXEC

           EXEC CICS
                WEB
                READ
                FORMFIELD(X)
                NAMELENGTH(X)
                VALUE(X)
                SET(X)
                VALUELENGTH(X)
                CHARACTERSET(X)
                HOSTCODEPAGE(X)
           END-EXEC

           EXEC CICS
                WEB
                READ
                HTTPHEADER(X)
                NAMELENGTH(X)
                SESSTOKEN(X)
                VALUE(X)
                VALUELENGTH(X)
           END-EXEC

           EXEC CICS
                WEB
                READ
                QUERYPARM(X)
                NAMELENGTH(X)
                VALUE(X)
                SET(X)
                VALUELENGTH(X)
                HOSTCODEPAGE(X)
           END-EXEC

           EXEC CICS
                WEB
                READNEXT
                FORMFIELD(X)
                NAMELENGTH(X)
                VALUE(X)
                VALUELENGTH(X)
           END-EXEC

           EXEC CICS
                WEB
                READNEXT
                HTTPHEADER(X)
                NAMELENGTH(X)
                SESSTOKEN(X)
                VALUE(X)
                VALUELENGTH(X)
           END-EXEC

           EXEC CICS
                WEB
                READNEXT
                QUERYPARM(X)
                NAMELENGTH(X)
                VALUE(X)
                VALUELENGTH(X)
           END-EXEC

           EXEC CICS
                WEB
                RECEIVE
                INTO(X)
                SET(X)
                LENGTH(X)
                MAXLENGTH(X)
                NOTRUNCATE
                TYPE(X)
                SRVCONVERT
                NOSRVCONVERT
                SERVERCONV(X)
                CHARACTERSET(X)
                HOSTCODEPAGE(X)
                BODYCHARSET(X)
                MEDIATYPE(X)
           END-EXEC

           EXEC CICS
                WEB
                RECEIVE
                TOCONTAINER(X)
                TOCHANNEL(X)
                TYPE(X)
                CHARACTERSET(X)
                BODYCHARSET(X)
                MEDIATYPE(X)
           END-EXEC

           EXEC CICS
                WEB
                RECEIVE
                SESSTOKEN(X)
                MEDIATYPE(X)
                STATUSCODE(X)
                STATUSTEXT(X)
                STATUSLEN(X)
                INTO(X)
                SET(X)
                LENGTH(X)
                MAXLENGTH(X)
                NOTRUNCATE
                CLICONVERT
                NOCLICONVERT
                CLIENTCONV(X)
                BODYCHARSET(X)
           END-EXEC

           EXEC CICS
                WEB
                RECEIVE
                SESSTOKEN(X)
                MEDIATYPE(X)
                STATUSCODE(X)
                STATUSTEXT(X)
                STATUSLEN(X)
                TOCONTAINER(X)
                TOCHANNEL(X)
                BODYCHARSET(X)
           END-EXEC

           EXEC CICS
                WEB
                RETRIEVE
                DOCTOKEN(X)
           END-EXEC

           EXEC CICS
                WEB
                SEND
                DOCTOKEN(data-value)
                NODOCDELETE
                DOCDELETE
                DOCSTATUS(cvda)
                FROM(data-area)
                FROMLENGTH(data-value)
                CHUNKNO
                CHUNKYES
                CHUNKEND
                CHUNKING(cvda)
                HOSTCODEPAGE(data-value)
                CONTAINER(data-value)
                CHANNEL(data-value)
                MEDIATYPE(data-value)
                SRVCONVERT
                NOSRVCONVERT
                SERVERCONV(cvda)
                CHARACTERSET(data-value)
                STATUSCODE(data-value)
                STATUSTEXT(data-area)
                STATUSLEN(data-value)
                LENGTH(data-value)
                IMMEDIATE
                EVENTUAL
                ACTION(cvda)
                NOCLOSE
                CLOSE
                CLOSESTATUS(cvda)
           END-EXEC

           EXEC CICS
                WEB
                SEND
                SESSTOKEN(data-value)
                GET
                HEAD
                PATCH
                POST
                PUT
                TRACE
                OPTIONS
                DELETE
                METHOD(cvda)
                PATH(data-area)
                PATHLENGTH(data-value)
                URIMAP(data-value)
                QUERYSTRING(data-area)
                QUERYSTRLEN(data-value)
                MEDIATYPE(data-value)
                DOCTOKEN(data-value)
                NODOCDELETE
                DOCDELETE
                DOCSTATUS(cvda)
                FROM(data-area)
                FROMLENGTH(data-value)
                CHUNKNO
                CHUNKYES
                CHUNKEND
                CHUNKING(cvda)
                CONTAINER(data-value)
                CHANNEL(data-value)
                CLICONVERT
                NOCLICONVERT
                CLIENTCONV(cvda)
                CHARACTERSET(data-value)
                EXPECT
                ACTION(cvda)
                NOCLOSE
                CLOSE
                CLOSESTATUS(cvda)
                NONE
                BASICAUTH
                AUTHENTICATE(cvda)
                USERNAME(data-value)
                USERNAMELEN(data-value)
                PASSWORD(data-value)
                PASSWORDLEN(data-value)
           END-EXEC

           EXEC CICS
                WEB
                STARTBROWSE
                FORMFIELD(X)
                NAMELENGTH(X)
                CHARACTERSET(X)
                HOSTCODEPAGE(X)
           END-EXEC

           EXEC CICS
                WEB
                STARTBROWSE
                HTTPHEADER
                SESSTOKEN(X)
           END-EXEC

           EXEC CICS
                WEB
                STARTBROWSE
                QUERYPARM(X)
                NAMELENGTH(X)
                HOSTCODEPAGE(X)
           END-EXEC

           EXEC CICS
                WEB
                WRITE
                HTTPHEADER(X)
                NAMELENGTH(X)
                SESSTOKEN(X)
                VALUE(X)
                VALUELENGTH(X)
           END-EXEC

           EXEC CICS
                WRITE
                FILE(X)
                MASSINSERT
                FROM(X)
                RIDFLD(X)
                KEYLENGTH(X)
                SYSID(X)
                LENGTH(X)
                RBA
                RRN
                XRBA
           END-EXEC

           EXEC CICS
                WRITE
                JOURNALNAME(X)
                JTYPEID(X)
                FROM(X)
                FLENGTH(X)
                REQID(X)
                PREFIX(X)
                PFXLENG(X)
                WAIT
                NOSUSPEND
           END-EXEC

           EXEC CICS
                WRITE
                JOURNALNUM(X)
           END-EXEC

           EXEC CICS
                WRITE
                OPERATOR
                TEXT(X)
                TEXTLENGTH(X)
                ROUTECODES(X)
                NUMROUTES(X)
                EVENTUAL
                ACTION(X)
                CRITICAL
                IMMEDIATE
                REPLY(X)
                MAXLENGTH(X)
                REPLYLENGTH(X)
                TIMEOUT(X)
           END-EXEC

           EXEC CICS
                WRITEQ
                TD
                QUEUE(X)
                FROM(X)
                LENGTH(X)
                SYSID(X)
           END-EXEC

           EXEC CICS
                WRITEQ
                TS
                QUEUE(X)
                QNAME(X)
                FROM(X)
                LENGTH(X)
                NUMITEMS(X)
                ITEM(X)
                REWRITE
                SYSID(X)
                AUXILIARY
                MAIN
                NOSUSPEND
           END-EXEC

           EXEC CICS
                WSACONTEXT
                BUILD
                CHANNEL(data-value)
                ACTION(data-value)
                MESSAGEID(data-value)
                RELATESURI(data-value)
                RELATESTYPE(data-value)
                EPRTYPE(cvda)
                EPRFIELD(cvda)
                EPRFROM(data-value)
                EPRLENGTH(data-value)
                FROMCCSID(data-value)
                FROMCODEPAGE(data-value)
           END-EXEC

           EXEC CICS
                WSACONTEXT
                DELETE
                CHANNEL(X)
           END-EXEC

           EXEC CICS
                WSACONTEXT
                GET
                CONTEXTTYPE(cvda)
                CHANNEL(data-value)
                ACTION(data-area)
                MESSAGEID(data-area)
                RELATESURI(data-area)
                RELATESTYPE(data-area)
                RELATESINDEX(data-value)
                EPRTYPE(cvda)
                EPRFIELD(cvda)
                EPRINTO(data-area)
                EPRSET(ptr-ref)
                EPRLENGTH(data-area)
                INTOCCSID(data-value)
                INTOCODEPAGE(data-value)
           END-EXEC

           EXEC CICS
                WSAEPR
                CREATE
                EPRINTO(data-area)
                EPRSET(data-area)
                EPRLENGTH(data-area)
                ADDRESS(data-value)
                REFPARMS(data-value)
                REFPARMSLEN(data-value)
                METADATA(data-value)
                METADATALEN(data-value)
                FROMCCSID(data-value)
                FROMCODEPAGE(data-value)
           END-EXEC

           EXEC CICS
                XCTL
                PROGRAM('SAMVIMES')
                COMMAREA(X)
                LENGTH(X)
                CHANNEL(X)
                INPUTMSG(X)
                INPUTMSGLEN(X)
           END-EXEC


           EXEC CICS RETURN END-EXEC.
