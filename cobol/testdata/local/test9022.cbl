       Identification Division.
       Program-ID.    test9022.
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
