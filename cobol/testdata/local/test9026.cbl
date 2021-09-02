       Identification Division.
       Program-ID.    test9026.
      *
      * Test all the parameters of all the CICS SPI commands.
      * This code definitely won't compile cleanly, in part
      * due to mutually exclusive options on some commands.
      * It's just here to test parsing.
      *
      * Current as of CICS TS 5.6
      *
       Procedure Division.

           EXEC CICS
                ACQUIRE
                TERMINAL(X)
                NOQUEUE
                QALL
                RELREQ
                QNOTENAB
                QSESSLIM
                USERDATA(X)
                USERDATALEN(X)
           END-EXEC

           EXEC CICS
                COLLECT
                STATISTICS
                SET(X)
                AUTOINSTALL 
                CONNECTION(data-value)
                DB2CONN 
                DB2ENTRY(data-value)
                DISPATCHER 
                ENQUEUE 
                FILE(data-value)
                JOURNALNAME(data-value)
                JOURNALNUM(data-value)
                JVMPROGRAM(data-value)
                LSRPOOL(data-value)
                MONITOR(data-value)
                MVSTCB(data-value)
                POOL(data-value)
                TARGET(data-value)
                PROGAUTO 
                PROGRAM(data-value)
                RECOVERY 
                STATSSTORAGE(data-value)
                STREAMNAME(data-value)
                SUBPOOL(data-value)
                SYSDUMPCODE(data-value)
                TABLEMGR 
                TARGET(data-value)
                NODE(data-value)
                TASKSUBPOOL
                TCLASS(data-value)
                TCPIP
                TCPIPSERVICE(data-value)
                TDQUEUE(data-value)
                TERMINAL(data-value)
                TRANCLASS(data-value)
                TRANDUMPCODE(data-value)
                TRANSACTION(data-value)
                TSQUEUE
                VTAM
           END-EXEC

           EXEC CICS
                CREATE
                ATOMSERVICE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                BUNDLE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                CONNECTION(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
                COMPLETE
                DISCARD
           END-EXEC

           EXEC CICS
                CREATE
                DB2CONN(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                DB2ENTRY(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                DB2TRAN(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                DOCTEMPLATE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                DUMPCODE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                ENQMODEL(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                FILE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                IPCONN(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                JOURNALMODEL(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                JVMSERVER(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                LIBRARY(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                LSRPOOL(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                MAPSET(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                MQCONN(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                MQMONITOR(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                PARTITIONSET(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                PARTNER(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                PIPELINE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                PROCESSTYPE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                PROFILE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                PROGRAM(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                SESSIONS(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                TCPIPSERVICE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                TDQUEUE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                TERMINAL(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
                COMPLETE
                DISCARD
           END-EXEC

           EXEC CICS
                CREATE
                TRANCLASS(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                TRANSACTION(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                TSMODEL(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                TYPETERM(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                URIMAP(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CREATE
                WEBSERVICE(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LOG
                NOLOG
                LOGMESSAGE(CVDA)
           END-EXEC

           EXEC CICS
                CSD
                ADD
                GROUP(X)
                LIST(X)
                BEFORE(X)
                AFTER(X)
           END-EXEC

           EXEC CICS
                CSD
                ALTER
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                NOCOMPAT
                COMPATMODE(CVDA)
                COMPAT
           END-EXEC

           EXEC CICS
                CSD
                APPEND
                LIST(X)
                TO(X)
           END-EXEC

           EXEC CICS
                CSD
                COPY
                RESTYPE(CVDA)
                RESID(X)
                AS(X)
                TO(X)
                GROUP(X)
                TO(X)
                DUPERROR
                DUPACTION(CVDA)
                DUPNOREPLACE
                DUPREPLACE
           END-EXEC

           EXEC CICS
                CSD
                DEFINE
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                NOCOMPAT
                COMPATMODE(CVDA)
                COMPAT
           END-EXEC

           EXEC CICS
                CSD
                DELETE
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                LISTACTION(CVDA)
                REMOVE
           END-EXEC

           EXEC CICS
                CSD
                DISCONNECT
           END-EXEC

           EXEC CICS
                CSD
                ENDBRGROUP
                LIST
           END-EXEC

           EXEC CICS
                CSD
                ENDBRLIST
           END-EXEC

           EXEC CICS
                CSD
                ENDBRRSRCE
           END-EXEC

           EXEC CICS
                CSD
                GETNEXTGROUP
                GROUP(X)
                LIST(X)
           END-EXEC

           EXEC CICS
                CSD
                GETNEXTLIST
                LIST(X)
           END-EXEC

           EXEC CICS
                CSD
                GETNEXTRSRCE
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
                ATTRIBUTES(X)
                ATTRLEN(X-LEN)
                SET(WS-PTR)
           END-EXEC

           EXEC CICS
                CSD
                INQUIREGROUP
                GROUP(X)
                LIST(X)
           END-EXEC

           EXEC CICS
                CSD
                INQUIRELIST
                LIST(X)
           END-EXEC

           EXEC CICS
                CSD
                INQUIRERSRCE
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                SET(WS-PTR)
           END-EXEC

           EXEC CICS
                CSD
                INSTALL
                LIST(X)
           END-EXEC

           EXEC CICS
                CSD
                INSTALL
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
           END-EXEC

           EXEC CICS
                CSD
                LOCK
                LIST(X)
                GROUP(X)
           END-EXEC

           EXEC CICS
                CSD
                REMOVE
                LIST(X)
                GROUP(X)
           END-EXEC

           EXEC CICS
                CSD
                RENAME
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
                AS(X)
           END-EXEC

           EXEC CICS
                CSD
                STARTBRGROUP
                LIST(X)
           END-EXEC

           EXEC CICS
                CSD
                STARTBRLIST
           END-EXEC

           EXEC CICS
                CSD
                STARTBRRSRCE
                GROUP(X)
           END-EXEC

           EXEC CICS
                CSD
                UNLOCK
                LIST(X)
                GROUP(X)
           END-EXEC

           EXEC CICS
                CSD
                USERDEFINE
                RESTYPE(CVDA)
                RESID(X)
                GROUP(X)
                ATTRIBUTES(X)
                ATTRLEN(LENGTH OF X)
                NOCOMPAT
                COMPATMODE(CVDA)
                COMPAT
           END-EXEC

           EXEC CICS
                DISABLE
                PROGRAM(X)
                ENTRYNAME(X)
                EXIT(X)
                EXITALL
                FORMATEDF
                PURGEABLE
                SHUTDOWN
                SPI
                STOP
                TASKSTART
           END-EXEC

           EXEC CICS
                DISCARD
                AUTINSTMODEL(X)
           END-EXEC

      *    The DISCARD API looks identical for the other 30 or so
      *    definitions, all of which have been syntax-checked for
      *    purposes of parsing in the preceding CREATE APIs.  So
      *    I'm not coding them here.

           EXEC CICS
                ENABLE
                PROGRAM('J8675309')
                ENTRY(ptr-ref)
                ENTRYNAME(data-value)
                EXIT(data-value)
                FORMATEDFGALENGTH(data-value)
                GALOCATION(cvda)
                GAENTRYNAME(data-value)
                INDOUBTWAIT 
                LINKEDITMODE
                QUASIRENT
                THREADSAFE
                OPENAPI
                REQUIRED
                PURGEABLE
                SHUTDOWN 
                SPI
                START
                TALENGTH(data-value)
                TASKSTART
           END-EXEC

           EXEC CICS
                EXTRACT
                EXIT
                PROGRAM(X)
                ENTRYNAME(X)
                GALENGTH(X)
                GASET(X)
           END-EXEC

           EXEC CICS
                EXTRACT
                STATISTICS
                RESTYPE(CVDA)
                RESID(X)
                RESIDLEN(X)
                SUBRESTYPE(CVDA)
                SUBRESID(X)
                SUBRESIDLEN(X)
                APPLICATION(X)
                APPLMAJORVER(X)
                APPLMINORVER(X)
                APPLMICROVER(X)
                PLATFORM(X)
                SET(WS-PTR)
                LASTRESET(X)
                LASTRESETABS(X)
                LASTRESETHRS(X)
                LASTRESETMIN(X)
                LASTRESETSEC(X)
           END-EXEC

           EXEC CICS
                INQUIRE 
                ASSOCIATION(X)
                ACAPPLNAME(data-area)
                ACMAJORVER(data-area)
                ACMICROVER(data-area)
                ACMINORVER(data-area)
                ACOPERNAME(data-area)
                ACPLATNAME(data-area)
                APPLDATA(data-area)
                APPLID(data-area)
                CLIENTIPADDR(data-area)
                CLIENTLOC(data-area)
                CLIENTPORT(data-area)
                CLNTIPFAMILY(cvda)
                DNAME(data-area)
                FACILNAME(data-area)
                FACILTYPE(cvda)
                INITUSERID(data-area)
                IPCONN(data-area)
                IPFAMILY(cvda)
                LUNAME(data-area)
                MVSIMAGE(data-area)
                NETID(data-area)
                ODADPTRID(data-area)
                ODADPTRDATA1(data-area)
                ODADPTRDATA2(data-area)
                ODADPTRDATA3(data-area)
                ODAPPLID(data-area)
                ODCLNTIPADDR(data-area)
                ODCLNTPORT(data-area)
                ODFACILNAME(data-area)
                ODFACILTYPE(cvda)
                ODIPFAMILY(cvda)
                ODLUNAME(data-area)
                ODNETID(data-area)
                ODNETWORKID(data-area)
                ODSERVERPORT(data-area)
                ODSTARTTIME(data-area)
                ODTASKID(data-area)
                ODTCPIPS(data-area)
                ODTRANSID(data-area)
                ODUSERID(data-area)
                PHAPPLID(data-area)
                PHCOUNT(data-area)
                PHNETWORKID(data-area)
                PHSTARTTIME(data-area)
                PHTASKID(data-area)
                PHTRANSID(data-area)
                PROGRAM(data-area)
                PTCOUNT(data-area)
                PTSTARTTIME(data-area)
                PTTASKID(data-area)
                PTTRANSID(data-area)
                REALM(data-area)
                SERVERIPADDR(data-area)
                SERVERPORT(data-area)
                SRVRIPFAMILY(cvda)
                STARTTIME(data-area)
                TCPIPJOB(data-area)
                TCPIPSERVICE(data-area)
                TCPIPZONE(data-area)
                TRNGRPID(data-area)
                TRANSACTION(data-area)
                USERCORRDATA(data-area)
                USERID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE 
                ASSOCIATION 
                LIST 
                LISTSIZE(data-area)
                DNAME(data-value)
                DNAMELEN(data-value)
                REALM(data-value)
                REALMLEN(data-value)
                SET(ptr-ref)
                USERCORRDATA(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                ATOMSERVICE(data-value)
                ATOMTYPE(cvda)
                BINDFILE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CONFIGFILE(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                RESOURCENAME(data-area)
                RESOURCETYPE(cvda)
                URIMAP(data-area)
                XMLTRANSFORM(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE 
                AUTINSTMODEL(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE 
                AUTOINSTALL 
                AIBRIDGE(cvda)
                CONSOLES(cvda)
                CURREQS(data-area)
                ENABLESTATUS(cvda)
                MAXREQS(data-area)
                PROGRAM(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE 
                BRFACILITY(data-value)
                KEEPTIME(data-area)
                LINKSYSTEM(data-area)
                LINKSYSNET(data-area)
                NAMESPACE(cvda)
                NETNAME(data-area)
                REMOTESYSNET(data-area)
                REMOTESYSTEM(data-area)
                TASKID(data-area)
                TERMID(data-area)
                TERMSTATUS(cvda)
                TRANSACTION(data-area)
                USERID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                BUNDLE(data-value)
                AVAILSTATUS(cvda)
                BASESCOPE(data-area)
                BUNDLEDIR(data-area)
                BUNDLEID(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLEDCOUNT(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MAJORVERSION(data-value)
                MGMTPART(data-value)
                MICROVERSION(data-value)
                MINORVERSION(data-value)
                PARTCOUNT(data-area)
                TARGETCOUNT(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE 
                BUNDLEPART(data-area)
                BUNDLE(data-value)
                AVAILSTATUS(cvda)
                ENABLESTATUS(cvda)
                METADATAFILE(data-area)
                PARTCLASS(cvda)
                PARTTYPE(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                CAPDATAPRED
                CAPTURESPEC(data-value)
                EVENTBINDING(data-value)
                CONTAINER(data-area)
                FIELDLENGTH(data-area)
                FIELDOFFSET(data-area)
                FILENAME(data-area)
                FILTERVALUE(data-area)
                LOCATION(data-area)
                OPERATOR(cvda)
                STRUCTNAME(data-area)
                VARIABLENAME(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                CAPINFOSRCE
                CAPTURESPEC(data-value)
                EVENTBINDING(data-value)
                CONTAINER(data-area)
                FIELDLENGTH(data-area)
                FIELDOFFSET(data-area)
                FILENAME(data-area)
                ITEMNAME(data-area)
                LOCATION(data-area)
                STRUCTNAME(data-area)
                VARIABLENAME(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                CAPOPTPRED
                CAPTURESPEC(data-value)
                EVENTBINDING(data-value)
                FILTERVALUE(data-area)
                OPERATOR(cvda)
                OPTIONNAME(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                CAPTURESPEC(data-area)
                EVENTBINDING(data-value)
                CAPTUREPOINT(data-area)
                CAPTUREPTYPE(cvda)
                CURRPGM(data-area)
                CURRPGMOP(cvda)
                CURRTRANID(data-area)
                CURRTRANIDOP(cvda)
                CURRUSERID(data-area)
                CURRUSERIDOP(cvda)
                EVENTNAME(data-area)
                NUMDATAPRED(data-area)
                NUMINFOSRCE(data-area)
                NUMOPTPRED(data-area)
                PRIMPRED(data-area)
                PRIMPREDOP(cvda)
                PRIMPREDTYPE(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                CONNECTION(data-value)
                ACCESSMETHOD(cvda)
                ACQSTATUS(cvda)
                AIDCOUNT(data-area)
                AUTOCONNECT(cvda)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CONNSTATUS(cvda)
                CONNTYPE(cvda)
                CQP(cvda)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                EXITTRACING(cvda)
                GRNAME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                LINKSYSTEM(data-area)
                MEMBERNAME(data-area)
                NETNAME(data-area)
                NQNAME(data-area)
                PENDSTATUS(cvda)
                PROTOCOL(cvda)
                RECEIVECOUNT(data-area)
                RECOVSTATUS(cvda)
                REMOTENAME(data-area)
                REMOTESYSNET(data-area)
                REMOTESYSTEM(data-area)
                SENDCOUNT(data-area)
                SERVSTATUS(cvda)
                XLNSTATUS(cvda)
                ZCPTRACING(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                CFDTPOOL(data-value)
                CONNSTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                DB2CONN
                ACCOUNTREC(cvda)
                AUTHID(data-area)
                AUTHTYPE(cvda)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                COMAUTHID(data-area)
                COMAUTHTYPE(cvda)
                COMTHREADLIM(data-area)
                COMTHREADS(data-area)
                CONNECTERROR(cvda)
                CONNECTST(cvda)
                DB2GROUPID(data-area)
                DB2ID(data-area)
                DB2RELEASE(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DROLLBACK(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MSGQUEUE1(data-area)
                MSGQUEUE2(data-area)
                MSGQUEUE3(data-area)
                NONTERMREL(cvda)
                PLAN(data-area)
                PLANEXITNAME(data-area)
                PRIORITY(cvda)
                PURGECYCLEM(data-area)
                PURGECYCLES(data-area)
                RESYNCMEMBER(cvda)
                REUSELIMIT(data-area)
                SIGNID(data-area)
                STANDBYMODE(cvda)
                STATSQUEUE(data-area)
                TCBLIMIT(data-area)
                TCBS(data-area)
                THREADERROR(cvda)
                THREADLIMIT(data-area)
                THREADS(data-area)
                THREADWAIT(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                DB2ENTRY(data-value)
                ACCOUNTREC(cvda)
                AUTHID(data-area)
                AUTHTYPE(cvda)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DISABLEDACT(cvda)
                DROLLBACK(cvda)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                PLAN(data-area)
                PLANEXITNAME(data-area)
                PRIORITY(cvda)
                PROTECTNUM(data-area)
                PTHREADS(data-area)
                THREADLIMIT(data-area)
                THREADS(data-area)
                THREADWAIT(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                DB2TRAN(data-value)
                DB2ENTRY(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                PLAN(data-area)
                PLANEXITNAME(data-area)
                TRANSID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                DELETSHIPPED
                IDLE(data-area)
                IDLEHRS(data-area)
                IDLEMINS(data-area)
                IDLESECS(data-area)
                INTERVAL(data-area)
                INTERVALHRS(data-area)
                INTERVALMINS(data-area)
                INTERVALSECS(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                DISPATCHER
                ACTOPENTCBS(data-area)
                ACTSSLTCBS(data-area)
                ACTTHRDTCBS(data-area)
                ACTXPTCBS(data-area)
                MAXOPENTCBS(data-area)
                MAXSSLTCBS(data-area)
                MAXTHRDTCBS(data-area)
                MAXXPTCBS(data-area)
                MROBATCH(data-area)
                PRTYAGING(data-area)
                RUNAWAY(data-area)
                SCANDELAY(data-area)
                SUBTASKS(data-area)
                TIME(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                DOCTEMPLATE(data-value)
                APPENDCRLF(cvda)
                CACHESIZE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DDNAME(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DSNAME(data-area)
                EXITPGM(data-area)
                FILE(data-area)
                HFSFILE(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MEMBER(data-area)
                PROGRAM(data-area)
                TDQUEUE(data-area)
                TEMPLATENAME(data-area)
                TEMPLATETYPE(cvda)
                TSQUEUE(data-area)
                TYPE(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE 
                DSNAME(data-value)
                ACCESSMETHOD(cvda)
                AVAILABILITY(cvda)
                BACKUPTYPE(cvda)
                BASEDSNAME(data-area)
                FILECOUNT(data-area)
                FWDRECOVLOG(data-area)
                FWDRECOVLSN(data-area)
                OBJECT(cvda)
                LOGREPSTATUS(cvda)
                LOSTLOCKS(cvda)
                QUIESCESTATE(cvda)
                RECOVSTATUS(cvda)
                RETLOCKS(cvda)
                VALIDITY(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                DUMPDS
                CURRENTDDS(data-area)
                INITIALDDS(data-area)
                OPENSTATUS(cvda)
                SWITCHSTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                ENQ
                ENQSCOPE(data-value)
                RESOURCE(data-value)
                RESLEN(data-value)
                UOW(data-value)
                DURATION(data-area)
                ENQFAILS(data-area)
                NETUOWID(data-area)
                QUALIFIER(data-area)
                QUALLEN(data-area)
                RELATION(cvda)
                RESLEN(data-area)
                RESOURCE(data-area)
                STATE(cvda)
                TASKID(data-area)
                TRANSID(data-area)
                TYPE(cvda)
                UOW(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                ENQMODEL(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENQSCOPE(data-area)
                ENQNAME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                STATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                EPADAPTER(data-value)
                ADAPTERTYPE(cvda)
                AUTHORITY(cvda)
                AUTHUSERID(data-area)
                CONFIGDATA1(data-area)
                DATAFORMAT(cvda)
                EMITMODE(cvda)
                ENABLESTATUS(cvda)
                INVOKETYPE(cvda)
                PRIORITY(cvda)
                PROGRAM(data-area)
                TRANSACTION(data-area)
                TRANSMODE(cvda)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                EPADAPTERSET(data-area)
                ENABLESTATUS(cvda)
                EPADAPTERNUM(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                EPADAPTINSET
                EPADAPTERSET(data-value)
                EPADAPTER(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                EVENTBINDING(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                EPADAPTER(data-area)
                EPADAPTERRES(cvda)
                EPADAPTERSET(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                USERTAG(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                EVENTPROCESSEPSTATUS(cvda)
                SCHEMALEVEL(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                EXCI(data-value)
                TASK(data-value)
                URID(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                EXITPROGRAM(data-value)
                EXIT(data-value)
                ENTRYNAME(data-area)
                APIST(cvda)
                CONCURRENTST(cvda)
                CONNECTST(cvda)
                ENTRY(ptr-ref)
                FORMATEDFST(cvda)
                GAENTRYNAME(data-area)
                GALENGTH(data-area)
                GAUSECOUNT(data-area)
                INDOUBTST(cvda)
                NUMEXITS(data-area)
                PURGEABLEST(cvda)
                QUALIFIER(data-area)
                SHUTDOWNST(cvda)
                SPIST(cvda)
                STARTSTATUS(cvda)
                TALENGTH(data-area)
                TASKSTARTST(cvda)
                USECOUNT(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                FEATUREKEY(data-value)
                VALUE(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                FILE(data-value)
                ACCESSMETHOD(cvda)
                ADD(cvda)
                BASEDSNAME(data-area)
                BLOCKFORMAT(cvda)
                BLOCKKEYLEN(data-area)
                BLOCKSIZE(data-area)
                BROWSE(cvda)
                CFDTPOOL(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DELETE(cvda)
                DISPOSITION(cvda)
                DSNAME(data-area)
                EMPTYSTATUS(cvda)
                ENABLESTATUS(cvda)
                EXCLUSIVE(cvda)
                FWDRECSTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                JOURNALNUM(data-area)
                KEYLENGTH(data-area)
                KEYPOSITION(data-area)
                LOADTYPE(cvda)
                LSRPOOLNUM(data-area)
                MAXNUMRECS(data-area)
                OBJECT(cvda)
                OPENSTATUS(cvda)
                RBATYPE(cvda)
                READ(cvda)
                READINTEG(cvda)
                RECORDFORMAT(cvda)
                RECORDSIZE(data-area)
                RECOVSTATUS(cvda)
                RELTYPE(cvda)
                REMOTENAME(data-area)
                REMOTESYSTEM(data-area)
                REMOTETABLE(cvda)
                RLSACCESS(cvda)
                STRINGS(data-area)
                TABLE(cvda)
                TABLENAME(data-area)
                TYPE(cvda)
                UPDATE(cvda)
                UPDATEMODEL(cvda)
           END-EXEC






           EXEC CICS RETURN END-EXEC.
