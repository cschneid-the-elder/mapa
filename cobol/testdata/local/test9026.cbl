       Identification Division.
       Program-ID.    test9026.
      *
      * Test all the parameters of all the CICS SPI commands.
      * This code definitely won't compile cleanly, in part
      * due to mutually exclusive options on some commands.
      * It's just here to test parsing.
      *
      * Current as of CICS TS 6.1
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
                ATOMSERVICE
                BUNDLE
                CONNECTION
                CORBASERVER
                DB2CONN
                DB2ENTRY
                DB2TRAN
                DJAR
                DOCTEMPLATE
                DUMPCODE
                ENQMODEL
                FILE
                IPCONN
                JOURNALMODEL
                JVMSERVER
                LIBRARY
                LSRPOOL
                MAPSET
                MQCONN
                PARTITIONSET
                PARTNER
                PIPELINE
                PROCESSTYPE
                PROFILE
                PROGRAM
                REQUESTMODEL
                SESSIONS
                TCPIPSERVICE
                TDQUEUE
                TERMINAL
                TRANCLASS
                TRANSACTION
                TSMODEL
                TYPETERM
                URIMAP
                WEBSERVICE
                RESID(X)
                GROUP(X)
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
                FORMATEDF
                GALENGTH(data-value)
                GALOCATION(cvda)
                GAEXECUTABLE
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
                TAEXECUTABLE
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
                SHARELOCKS(cvda)
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
                FILEPATH(data-area)
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

           EXEC CICS
                INQUIRE
                HOST(data-area)
                ENABLESTATUS(cvda)
                TCPIPSERVICE(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                IPCONN(cvda)
                APPLID(data-area)
                AUTOCONNECT(cvda)
                CERTIFICATE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CIPHERS(data-area)
                CLIENTLOC(data-area)
                CONNSTATUS(cvda)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                HA(cvda)
                HOST(data-area)
                HOSTTYPE(cvda)
                IDPROP(cvda)
                IPFAMILY(cvda)
                IPRESOLVED(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                LINKAUTH(cvda)
                MAXQTIME(data-area)
                MIRRORLIFE(cvda)
                NETWORKID(data-area)
                NUMCIPHERS(data-area)
                PARTNER(data-area)
                PENDSTATUS(cvda)
                PORT(data-area)
                QUEUELIMIT(data-area)
                RECEIVECOUNT(data-area)
                RECOVSTATUS(cvda)
                SECURITYNAME(data-area)
                SENDCOUNT(data-area)
                SERVSTATUS(cvda)
                SSLTYPE(cvda)
                TCPIPSERVICE(data-area)
                USERAUTH(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                IPFACILITY(data-value)
                IPCONN(data-area)
                IPFACILTYPE(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                IRCOPENSTATUS(cvda)
                XCFGROUP(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                JOURNALMODEL(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                JOURNALNAME(data-area)
                STREAMNAME(data-area)
                TYPE(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                JOURNALNAME(data-value)
                STATUS(cvda)
                STREAMNAME(data-area)
                TYPE(cvda)
           END-EXEC

      *    
      *    Documentation indicates INQUIRE JOURNALNUM is obsolete
      *    so I'm just checking to ensure compatibility with old code.
      *    
           EXEC CICS
                INQUIRE
                JOURNALNUM(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                JVMENDPOINT(data-value)
                JVMSERVER(data-value)
                ENABLESTATUS(cvda)
                TYPE(data-area)
                PORT(data-area)
                SECPORT(data-area)
                HOST(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                JVMSERVER(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CURRENTHEAP(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                GCPOLICY(data-area)
                INITHEAP(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                JAVAHOME(data-area)
                JVMPROFILE(data-area)
                LERUNOPTS(data-area)
                LOG(data-area)
                MAXHEAP(data-area)
                OCCUPANCY(data-area)
                PID(data-area)
                PROFILE(data-area)
                PROFILEDIR(data-area)
                STDERR(data-area)
                STDOUT(data-area)
                THREADCOUNT(data-area)
                THREADLIMIT(data-area)
                TRACE(data-area)
                WORKDIR(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                LIBRARY(data-value)
                APPLICATION(data-area)
                APPLMAJORVER(data-area)
                APPLMINORVER(data-area)
                APPLMICROVER(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CRITICALST(cvda)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DSNAMELIST(ptr-ref)
                DSNAME01(data-area)
                DSNAME02(data-area)
                DSNAME03(data-area)
                DSNAME04(data-area)
                DSNAME05(data-area)
                DSNAME06(data-area)
                DSNAME07(data-area)
                DSNAME08(data-area)
                DSNAME09(data-area)
                DSNAME10(data-area)
                DSNAME11(data-area)
                DSNAME12(data-area)
                DSNAME13(data-area)
                DSNAME14(data-area)
                DSNAME15(data-area)
                DSNAME16(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLUSRID(data-area)
                INSTALLTIME(data-area)
                NUMDSNAMES(data-area)
                PLATFORM(data-area)
                RANKING(data-area)
                SEARCHPOS(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                MODENAME(data-value)
                CONNECTION(data-value)
                ACTIVE(data-area)
                AUTOCONNECT(cvda)
                AVAILABLE(data-area)
                MAXIMUM(data-area)
                MAXWINNERS(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                MONITOR
                APPLNAMEST(cvda)
                COMPRESSST(cvda)
                CONVERSEST(cvda)
                DPLLIMIT(data-area)
                EXCEPTCLASS(cvda)
                FILELIMIT(data-area)
                FREQUENCY(data-area)
                IDNTYCLASS(cvda)
                PERFCLASS(cvda)
                RESRCECLASS(cvda)
                RMIST(cvda)
                STATUS(cvda)
                SYNCPOINTST(cvda)
                TIME(cvda)
                TSQUEUELIMIT(data-area)
                URIMAPLIMIT(data-area)
                WEBSERVLIMIT(data-area)
                FREQUENCYHRS(data-area)
                FREQUENCYMINS(data-area)
                FREQUENCYSECS(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                MQCONN
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CONNECTST(cvda)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MQNAME(data-area)
                MQQMGR(data-area)
                MQRELEASE(data-area)
                RESYNCMEMBER(cvda)
                TASKS(data-area)
                TRIGMONTASKS(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                MQINI(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INITQNAME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                MQMONITOR( data-value)
                AUTOSTART(cvda)
                CHANGEAGENT(cvda)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MONDATA(data-area)
                MONSTATUS(cvda)
                MONUSERID(data-area)
                QNAME(data-area)
                TASKID(data-area)
                TRANSACTION(data-area)
                USERID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                MVSTCB(ptr-ref)
                SET(ptr-ref)
                NUMELEMENTS(data-area)
      *    
      *    Documentation indicates ELEMENTLIST, LENGTHLIST, and
      *    SUBPOOLLIST are obsolete
      *    so I'm just checking to ensure compatibility with old code.
      *    
                ELEMENTLIST(ptr-ref)
                LENGTHLIST(ptr-ref)
                SUBPOOLLIST(ptr-ref)
           END-EXEC

           EXEC CICS
                INQUIRE
                NETNAME(data-value)
                TERMINAL(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                NODEJSAPP(data-value)
                BUNDLE(data-area)
                CHANGEAGENT(cvda)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                LERUNOPTS(data-area)
                LOG(data-area)
                NODEHOME(data-area)
                PID(data-area)
                PROFILE(data-area)
                STARTSCRIPT(data-area)
                STDERR(data-area)
                STDOUT(data-area)
                TRACE(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                OSGIBUNDLE(data-value)
                OSGIVERSION(data-value)
                JVMSERVER(data-value)
                BUNDLE(data-area)
                BUNDLEPART(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                OSGIBUNDLEID(data-area)
                OSGISTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                OSGISERVICE(data-value)
                JVMSERVER(data-value)
                BUNDLE(data-area)
                BUNDLEPART(data-area)
                OSGIBUNDLE(data-area)
                OSGIVERSION(data-area)
                SRVCNAME(data-area)
                SRVCSTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                PARTNER(data-value)
                NETWORK(data-area)
                NETNAME(data-area)
                PROFILE(data-area)
                TPNAME(data-area)
                TPNAMELEN(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                PIPELINE(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CIDDOMAIN(data-area)
                CONFIGFILE(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MODE(cvda)
                MSGFORMAT(data-area)
                MTOMNOXOPST(cvda)
                MTOMST(cvda)
                RESPWAIT(data-area)
                SENDMTOMST(cvda)
                SHELF(data-area)
                SOAPLEVEL(data-area)
                SOAPRNUM(data-area)
                SOAPVNUM(data-area)
                WSDIR(data-area)
                XOPDIRECTST(cvda)
                XOPSUPPORTST(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                POLICY(data-value)
                BUNDLE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                USERTAG(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                POLICYRULE(data-value)
                POLICY(data-value)
                ABENDCODE(data-area)
                ACTIONCOUNT(data-area)
                ACTIONTYPE(cvda)
                EPADAPTER(data-area)
                EPADAPTERSET(data-area)
                LASTACTTIME(data-area)
                RULEGROUP(cvda)
                RULEITEM(data-area)
                RULETYPE(cvda)
                THRESHOLD(data-area)
                WLMOPENST(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                PROCESSTYPE(data-value )
                AUDITLOG(data-area)
                AUDITLEVEL(cvda)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                FILE(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                STATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                PROFILE( data-value)
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
                PROGRAM( data-value)
                APIST(cvda)
                APPLICATION(data-area)
                APPLMAJORVER(data-area)
                APPLMINORVER(data-area)
                APPLMICROVER(data-area)
                CEDFSTATUS(cvda)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                COBOLTYPE(cvda)
                COPY(cvda)
                CONCURRENCY(cvda)
                DATALOCATION(cvda)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DYNAMSTATUS(cvda)
                ENTRYPOINT(ptr-ref)
                EXECKEY(cvda)
                EXECUTIONSET(cvda)
                HOLDSTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                JVMCLASS(data-area)
                JVMPROFILE(data-area)
                JVMSERVER(data-area)
                LANGDEDUCED(cvda)
                LANGUAGE(cvda)
                LENGTH(data-area)
                LIBRARY(data-area)
                LIBRARYDSN(data-area)
                LOADPOINT(ptr-ref)
                LPASTATUS(cvda)
                OPERATION(data-area)
                PLATFORM(data-area)
                PROGTYPE(cvda)
                REMOTENAME(data-area)
                REMOTESYSTEM(data-area)
                REPLICATION(cvda)
                RESIDENCY(cvda)
                RESCOUNT(data-area)
                RUNTIME(cvda)
                SHARESTATUS(cvda)
                STATUS(cvda)
                TRANSID(data-area)
                USECOUNT(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                REQID(data-value)
                REQTYPE(cvda)
                TERMID(data-area)
                TRANSID(data-area)
                TIME(data-area)
                INTERVAL(data-area)
                AFTER HOURS(data-area)
                      MINUTES(data-area)
                      SECONDS(data-area)
                AT HOURS(data-area)
                   MINUTES(data-area)
                   SECONDS(data-area)
                SET(ptr-ref)
                LENGTH(data-area)
                FMHSTATUS(cvda)
                RTRANSID(data-area)
                RTERMID(data-area)
                QUEUE(data-area)
                USERID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                RRMS
                OPENSTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                SECDISCOVERY
                STATUS( cvda)
                CMD( cvda)
                DB2( cvda)
                DCT( cvda)
                FCT( cvda)
                HFS( cvda)
                JCT( cvda)
                PCT( cvda)
                PPT( cvda)
                PSB( cvda)
                RES( cvda)
                TRAN( cvda)
                TST( cvda)
                USER( cvda)
                LASTSECDTIME( data-area)
                LASTWRITTIME( data-area)
                SECDCOUNT( data-area)
                NEWSECDCOUNT( data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                SECRECORDING(data-area)
                ODADPTRID(data-value)
                ODADPTRDATA1(data-value)
                ODADPTRDATA2(data-value)
                ODADPTRDATA3(data-value)
                ODAPPLID(data-value)
                ODCLNTIPADDR(data-value)
                ODCLNTIPADDR(data-value)
                ODCLNTPORT(data-value)
                ODFACILNAME(data-value)
                ODFACILTYPE(data-value)
                ODIPFAMILY(data-value)
                ODLUNAME(data-value)
                ODNETID(data-value)
                ODNETWORKID(data-value)
                ODSERVERPORT(data-value)
                ODTCPIPS(data-value)
                ODTRANSID(data-value)
                ODUSERID(data-value)
                MAXIMUM(data-area)
                CURRENT(area-value)                
           END-EXEC

           EXEC CICS
                INQUIRE
                STATISTICS
                ENDOFDAY(data-area)
                ENDOFDAYHRS(data-area)
                ENDOFDAYMINS(data-area)
                ENDOFDAYSECS(data-area)
                INTERVAL(data-area)
                INTERVALHRS(data-area)
                INTERVALMINS(data-area)
                INTERVALSECS(data-area)
                NEXTTIME(data-area)
                NEXTTIMEHRS(data-area)
                NEXTTIMEMINS(data-area)
                NEXTTIMESECS(data-area)
                RECORDING(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                STORAGE
                ADDRESS(ptr-value)
                ELEMENT(ptr-ref)
                FLENGTH(data-area)
                NUMELEMENTS(data-area)
                ELEMENTLIST(ptr-ref)
                LENGTHLIST(ptr-ref)
                TASK(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                STREAMNAME(data-value)
                STATUS(cvda)
                SYSTEMLOG(cvda)
                USECOUNT(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                SUBPOOL(data-area)
                DSANAME(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                SYSDUMPCODE(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CURRENT(data-area)
                DAEOPTION(cvda)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DSPLIST(data-area)
                DUMPSCOPE(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                JOBLIST(data-area)
                MAXIMUM(data-area)
                SHUTOPTION(cvda)
                SYSDUMPING(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                SYSTEM
                ACTOPENTCBS(data-area)
                AIDCOUNT(data-area)
                AKP(data-area)
                CDSASIZE(data-area)
                CICSSTATUS(cvda)
                CICSSYS(data-area)
                CICSTSLEVEL(data-area)
                CMDPROTECT(cvda)
                COLDSTATUS(cvda)
                DB2CONN(data-area)
                DEBUGTOOL(cvda)
                DFLTUSER(data-area)
                DSALIMIT(data-area)
                DSRTPROGRAM(data-area)
                DTRPROGRAM(data-area)
                DUMPING(cvda)
                ECDSASIZE(data-area)
                EDSALIMIT(data-area)
                EPCDSASIZE(data-area)
                EPUDSASIZE(data-area)
                ERDSASIZE(data-area)
                ESDSASIZE(data-area)
                ETDSASIZE(data-area) *> removed in CICS TS 6.1
                EUDSASIZE(data-area)
                FORCEQR(cvda)
                GCDSASIZE(data-area)
                GMMTEXT(data-area)
                GMMLENGTH(data-area)
                GSDSASIZE(data-area)
                GUDSASIZE(data-area)
                GMMTRANID(data-area)
                HEALTHCHECK(cvda)
                INITSTATUS(cvda)
                JOBNAME(data-area)
                LASTCOLDTIME(data-area)
                LASTEMERTIME(data-area)
                LASTINITTIME(data-area)
                LASTWARMTIME(data-area)
                LOGDEFER(data-area)
                MAXOPENTCBS(data-area)
                MAXTASKS(data-area)
                MEMLIMIT(data-area)
                MESSAGECASE(cvda)
                MQCONN(data-area)
                MROBATCH(data-area)
                MVSSMFID(data-area)
                MVSSYSNAME(data-area)
                OPREL(data-area)
                OPSYS(data-area)
                OSLEVEL(data-area)
                PCDSASIZE(data-area)
                PLTPIUSR(data-area)
                PROGAUTOCTLG(cvda)
                PROGAUTOEXIT(data-area)
                PROGAUTOINST(cvda)
                PRTYAGING(data-area)
                PUDSASIZE(data-area)
                RDSASIZE(data-area)
                REENTPROTECT(cvda)
                REGIONUSERID(data-area)
                RELEASE(data-area)
                RLSSTATUS(cvda)
                RUNAWAY(data-area)
                SCANDELAY(data-area)
                SDSASIZE(data-area)
                SDTMEMLIMIT(data-area)
                SDTRAN(data-area)
                SECURITYMGR(cvda)
                SHUTSTATUS(cvda)
                SOSABOVEBAR(cvda)
                SOSABOVELINE(cvda)
                SOSBELOWLINE(cvda)
                SOSSTATUS(cvda)
                STARTUP(cvda)
                STARTUPDATE(data-area)
                STOREPROTECT(cvda)
                TIME(data-area)
                TRANISOLATE(cvda)
                UDSASIZE(data-area)
                XRFSTATUS(cvda)
                GRPLIST(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TAG
                START
                NEXT
                END
           END-EXEC

           EXEC CICS
                INQUIRE
                TASK(data-value)
                ACTIVITY(data-area)
                ACTIVITYID(data-area)
                ATTACHTIME(data-area)
                BRFACILITY(data-area)
                BRIDGE(data-area)
                CMDSEC(cvda)
                CURRENTPROG(data-area)
                DB2PLAN(data-area)
                DTIMEOUT(data-area)
                DUMPING(cvda)
                FACILITY(data-area)
                FACILITYTYPE(cvda)
                IDENTIFIER(data-area)
                INDOUBT(cvda)
                INDOUBTMINS(data-area)
                INDOUBTWAIT(cvda)
                IPFACILITIES(ptr-ref)
                IPFLISTSIZE(data-area)
                ISOLATEST(cvda)
                PRIORITY(data-area)
                PROCESS(data-area)
                PROCESSTYPE(data-area)
                PROFILE(data-area)
                PROGRAM(data-area)
                PURGEABILITY(cvda)
                REMOTENAME(data-area)
                REMOTESYSTEM(data-area)
                RESSEC(cvda)
                ROUTING(cvda)
                RTIMEOUT(data-area)
                RUNAWAY(data-area)
                RUNSTATUS(cvda)
                SCRNSIZE(cvda)
                STARTCODE(data-area)
                STORAGECLEAR(cvda)
                SUSPENDTIME(data-area)
                SUSPENDTYPE(data-area)
                SUSPENDVALUE(data-area)
                RESNAME(data-area)
                TASKDATAKEY(cvda)
                TASKDATALOC(cvda)
                TCB(cvda)
                TRANCLASS(data-area)
                TCLASS(data-area)
                TRACING(cvda)
                TRANPRIORITY(data-area)
                TRANSACTION(data-area)
                TRPROF(data-area)
                TWASIZE(data-area)
                UOW(data-area)
                USERID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TASK LIST
                LISTSIZE(data-area)
                DISPATCHABLE
                RUNNING
                SUSPENDED
                SET(ptr-ref)
                SETTRANSID(ptr-ref)
           END-EXEC

           EXEC CICS
                INQUIRE
                TCLASS(data-value)
                CURRENT(data-area)
                MAXIMUM(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TCPIP
                ACTSOCKETS(data-value)
                MAXSOCKETS(data-value)
                OPENSTATUS(cvda)
                SSLCACHE(cvda)
                CRLPROFILE(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                TCPIPSERVICE(data-value)
                ATTACHSEC(cvda)
                AUTHENTICATE(cvda)
                BACKLOG(data-value)
                CERTIFICATE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CIPHERS(data-area)
                CLOSETIMEOUT(data-area)
                CONNECTIONS(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                GENERICTCPS(data-area)
                HOST(data-area)
                HOSTTYPE(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                IPADDRESS(data-area)
                IPFAMILY(cvda)
                IPRESOLVED(data-area)
                MAXDATALEN(data-area)
                MAXPERSIST(data-area)
                NUMCIPHERS(data-area)
                OPENSTATUS(cvda)
                OPTIONSPGM(data-area)
                PORT(data-area)
                PRIVACY(cvda)
                PROTOCOL(cvda)
                REALM(data-area)
                SOCKETCLOSE(cvda)
                SPECIFTCPS(data-area)
                SSLTYPE(cvda)
                TRANSID(data-area)
                URM(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TDQUEUE(data-value)
                ATIFACILITY(cvda)
                ATITERMID(data-area)
                ATITRANID(data-area)
                ATIUSERID(data-area)
                BLOCKFORMAT(cvda)
                BLOCKSIZE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DATABUFFERS(data-area)
                DDNAME(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DISPOSITION(cvda)
                DSNAME(data-area)
                EMPTYSTATUS(cvda)
                ENABLESTATUS(cvda)
                ERROROPTION(cvda)
                INDIRECTNAME(data-area)
                INDOUBT(cvda)
                INDOUBTWAIT(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                IOTYPE(cvda)
                MEMBER(data-area)
                NUMITEMS(data-area)
                OPENSTATUS(cvda)
                PRINTCONTROL(cvda)
                RECORDFORMAT(cvda)
                RECORDLENGTH(data-area)
                RECOVSTATUS(cvda)
                REMOTENAME(data-area)
                REMOTESYSTEM(data-area)
                REWIND(cvda)
                SYSOUTCLASS(cvda)
                TRIGGERLEVEL(data-area)
                TYPE(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                TEMPSTORAGE
                TSMAININUSE(data-value)
                TSMAINLIMIT(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                TERMINAL(data-value)
                NETNAME(data-area)
                ACCESSMETHOD(cvda)
                ACQSTATUS(cvda)
                AIDCOUNT(data-area)
                ALTPAGEHT(data-area)
                ALTPAGEWD(data-area)
                ALTPRINTER(data-area)
                ALTPRTCOPYST(cvda)
                ALTSCRNHT(data-area)
                ALTSCRNWD(data-area)
                ALTSUFFIX(data-area)
                APLKYBDST(cvda)
                APLTEXTST(cvda)
                ASCII(cvda)
                ATISTATUS(cvda)
                AUDALARMST(cvda)
                AUTOCONNECT(cvda)
                BACKTRANSST(cvda)
                COLORST(cvda)
                CONSOLE(data-area)
                COPYST(cvda)
                CORRELID(data-area)
                CREATESESS(cvda)
                DATASTREAM(cvda)
                DEFPAGEHT(data-area)
                DEFPAGEWD(data-area)
                DEFSCRNHT(data-area)
                DEFSCRNWD(data-area)
                DEVICE(cvda)
                DISCREQST(cvda)
                DUALCASEST(cvda)
                EXITTRACING(cvda)
                EXTENDEDDSST(cvda)
                FMHPARMST(cvda)
                FORMFEEDST(cvda)
                GCHARS(data-area)
                GCODES(data-area)
                HFORMST(cvda)
                HILIGHTST(cvda)
                KATAKANAST(cvda)
                LIGHTPENST(cvda)
                LINKSYSTEM(data-area)
                MAPNAME(data-area)
                MAPSETNAME(data-area)
                MODENAME(data-area)
                MSRCONTROLST(cvda)
                NATLANG(data-area)
                NATURE(cvda)
                NEXTTRANSID(data-area)
                NQNAME(data-area)
                OBFORMATST(cvda)
                OBOPERIDST(cvda)
                OPERID(data-area)
                OUTLINEST(cvda)
                PAGEHT(data-area)
                PAGESTATUS(cvda)
                PAGEWD(data-area)
                PARTITIONSST(cvda)
                PRINTADAPTST(cvda)
                PRINTER(data-area)
                PROGSYMBOLST(cvda)
                PRTCOPYST(cvda)
                QUERYST(cvda)
                RELREQST(cvda)
                REMOTENAME(data-area)
                REMOTESYSNET(data-area)
                REMOTESYSTEM(data-area)
                SCRNHT(data-area)
                SCRNWD(data-area)
                SECURITY(cvda)
                SERVSTATUS(cvda)
                SESSIONTYPE(cvda)
                SIGNONSTATUS(cvda)
                SOSIST(cvda)
                TASKID(data-area)
                TCAMCONTROL(data-area)
                TERMMODEL(data-area)
                TERMPRIORITY(data-area)
                TERMSTATUS(cvda)
                TEXTKYBDST(cvda)
                TEXTPRINTST(cvda)
                TNADDR(data-area)
                TNHOST(data-area)
                TNIPFAMILY(cvda)
                TNPORT(data-area)
                TRACING(cvda)
                TRANSACTION(data-area)
                TTISTATUS(cvda)
                UCTRANST(cvda)
                USERAREA(ptr-ref)
                USERAREALEN(data-area)
                USERID(data-area)
                USERNAME(data-area)
                VALIDATIONST(cvda)
                VFORMST(cvda)
                ZCPTRACING(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                TRACEDEST
                AUXSTATUS(cvda)
                CURAUXDS(data-area)
                GTFSTATUS(cvda)
                INTSTATUS(cvda)
                SWITCHSTATUS(cvda)
                TABLESIZE(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TRACEFLAG
                SINGLESTATUS(cvda)
                SYSTEMSTATUS(cvda)
                TCEXITSTATUS(cvda)
                USERSTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                TRACETYPE
                FLAGSET(cvda)
                SPECIAL
                STANDARD
                COMPID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TRANCLASS( data-value)
                ACTIVE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MAXACTIVE(data-area)
                PURGEACTION(cvda)
                PURGETHRESH(data-area)
                QUEUED(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TRANDUMPCODE( data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CURRENT(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DUMPSCOPE(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MAXIMUM(data-area)
                SHUTOPTION(cvda)
                SYSDUMPING(cvda)
                TRANDUMPING(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                TRANSACTION(data-value)
                APPLICATION(data-value)
                APPLMAJORVER(data-value)
                APPLMICROVER(data-value)
                AVAILSTATUS(cvda)
                APPLMINORVER(data-value)
                BREXIT(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CMDSEC(cvda)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                DTIMEOUT(data-area)
                DUMPING(cvda)
                FACILITYLIKE(data-area)
                INDOUBT(cvda)
                INDOUBTMINS(data-area)
                INDOUBTWAIT(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                ISOLATEST(cvda)
                OPERATION(data-value)
                OTSTIMEOUT(data-area)
                PLATFORM(data-value)
                PRIORITY(data-area)
                PROFILE(data-area)
                PROGRAM(data-area)
                PURGEABILITY(cvda)
                REMOTENAME(data-area)
                REMOTESYSTEM(data-area)
                RESSEC(cvda)
                ROUTING(cvda)
                ROUTESTATUS(cvda)
                RTIMEOUT(data-area)
                RUNAWAY(data-area)
                RUNAWAYTYPE(cvda)
                SCRNSIZE(cvda)
                SHUTDOWN(cvda)
                STATUS(cvda)
                STORAGECLEAR(cvda)
                TASKDATAKEY(cvda)
                TASKDATALOC(cvda)
                TCLASS(data-area)
                TRANCLASS(data-area)
                TRACING(cvda)
                TRPROF(data-area)
                TWASIZE(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                TSMODEL(data-value)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                EXPIRYINT(data-area)
                EXPIRYINTMIN(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                LOCATION(cvda)
                POOLNAME(data-area)
                PREFIX(data-area)
                RECOVSTATUS(cvda)
                REMOTEPREFIX(data-area)
                REMOTESYSTEM(data-area)
                SECURITYST(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                TSPOOL(data-value)
                CONNSTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                TSQUEUE(data-value)
                POOLNAME(data-value)
                SYSID(data-value)
                EXPIRYINT(data-area)
                EXPIRYINTMIN(data-area)
                FLENGTH(data-area)
                LASTUSEDINT(data-area)
                LOCATION(cvda)
                MAXITEMLEN(data-area)
                MINITEMLEN(data-area)
                NUMITEMS(data-area)
                RECOVSTATUS(cvda)
                TRANSID(data-area)
                TSMODEL(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                TSQNAME(data-value)
                POOLNAME(data-value)
                SYSID(data-value)
                EXPIRYINT(data-area)
                EXPIRYINTMIN(data-area)
                FLENGTH(data-area)
                LASTUSEDINT(data-area)
                LOCATION(cvda)
                MAXITEMLEN(data-area)
                MINITEMLEN(data-area)
                NUMITEMS(data-area)
                RECOVSTATUS(cvda)
                TRANSID(data-area)
                TSMODEL(data-value)
           END-EXEC

           EXEC CICS
                INQUIRE
                UOW(data-area)
                AGE(data-area)
                LINK(data-area)
                NETNAME(data-area)
                NETUOWID(data-area)
                OTSTID(data-area)
                SYSID(data-area)
                TASKID(data-area)
                TERMID(data-area)
                TRANSID(data-area)
                UOWSTATE(cvda)
                USERID(data-area)
                WAITCAUSE(cvda)
                WAITSTATE(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                UOWDSNFAIL
                CAUSE(cvda)
                DSNAME(data-area)
                NETNAME(data-area)
                REASON(cvda)
                RLSACCESS(cvda)
                SYSID(data-area)
                UOW(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                UOWENQ
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
                UOWLINK(data-area)
                HOST(data-area)
                PORT(data-area)
                BRANCHQUAL(data-area)
                LINK(data-area)
                NETUOWID(data-area)
                PROTOCOL(cvda)
                RESYNCSTATUS(cvda)
                RMIQFY(data-area)
                ROLE(cvda)
                SYSID(data-area)
                TYPE(cvda)
                UOW(data-area)
                URID(data-area)
                XID(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                URIMAP(data-value)
                ANALYZERSTAT(cvda)
                APPLICATION(data-value)
                APPLMAJORVER(data-value)
                APPLMINORVER(data-value)
                APPLMICROVER(data-value)
                ATOMSERVICE(data-area)
                AUTHENTICATE(cvda)
                AVAILSTATUS(cvda)
                CERTIFICATE(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CHARACTERSET(data-area)
                CIPHERS(data-area)
                CONVERTER(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                HFSFILE(data-area)
                HOST(data-area)
                HOSTCODEPAGE(data-area)
                HOSTTYPE(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                IPFAMILY(cvda)
                IPRESOLVED(data-area)
                LOCATION(data-area)
                MEDIATYPE(data-area)
                NUMCIPHERS(data-area)
                OPERATION(data-value)
                PATH(data-area)
                PIPELINE(data-area)
                PLATFORM(data-value)
                PORT(data-area)
                PROGRAM(data-area)
                REDIRECTTYPE(cvda)
                SCHEME(cvda)
                SOCKETCLOSE(data-area)
                SOCKPOOLSIZE(data-area)
                TCPIPSERVICE(data-area)
                TEMPLATENAME(data-area)
                TRANSACTION(data-area)
                USAGE(cvda)
                USERID(data-area)
                WEBSERVICE(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                VTAM
                GRNAME(data-area)
                GRSTATUS(cvda)
                OPENSTATUS(cvda)
                PSTYPE(cvda)
                PSDINTERVAL(data-area)
                PSDINTHRS(data-area)
                PSDINTMINS(data-area)
                PSDINTSECS(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                WEB
                GARBAGEINT(data-area)
                TIMEOUTINT(data-area)
           END-EXEC

           EXEC CICS
                INQUIRE
                WEBSERVICE(name)
                ARCHIVEFILE(data-area)
                BINDING(data-area)
                CCSID(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                CONTAINER(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENDPOINT(data-area)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                LASTMODTIME(data-area)
                MAPPINGLEVEL(data-area)
                MAPPINGRNUM(data-area)
                MAPPINGVNUM(data-area)
                MINRUNLEVEL(data-area)
                MINRUNRNUM(data-area)
                MINRUNVNUM(data-area)
                PGMINTERFACE(cvda)
                PIPELINE(data-area)
                PROGRAM(data-area)
                STATE(cvda)
                URIMAP(data-area)
                VALIDATIONST(cvda)
                WSBIND(data-area)
                WSDLFILE(data-area)
                XOPDIRECTST(cvda)
                XOPSUPPORTST(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                WLMHEALTH
                ADJUSTMENT(data-area)
                HEALTH(data-area)
                HEALTHABSTIM(data-area)
                INTERVAL(data-area)
                OPENSTATUS(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                WORKREQUEST(datavalue)
                WORKTYPE(cvda)   
                CLIENTIPADDR(dataarea)   
                CLNTIP6ADDR(dataarea)   
                CLNTIPFAMILY(cvda)   
                CORBASERVER(dataarea)   
                LISTENERPORT(dataarea)   
                OAPPLID(dataarea)   
                OTASK(dataarea)   
                OTRANSID(dataarea)   
                REQUESTID(dataarea)   
                STACK(dataarea)   
                TARGETSYS(dataarea)   
                TASK(dataarea)   
                TRANSID(dataarea)   
                TSYSTEM(dataarea)   
                TSYSTYPE(cvda)
           END-EXEC

           EXEC CICS
                INQUIRE
                XMLTRANSFORM(name)
                BUNDLE(data-area)
                CCSID(data-area)
                CHANGEAGENT(cvda)
                CHANGEAGREL(data-area)
                CHANGETIME(data-area)
                CHANGEUSRID(data-area)
                DEFINESOURCE(data-area)
                DEFINETIME(data-area)
                ENABLESTATUS(cvda)
                INSTALLAGENT(cvda)
                INSTALLTIME(data-area)
                INSTALLUSRID(data-area)
                MAPPINGLEVEL(data-area)
                MAPPINGRNUM(data-area)
                MAPPINGVNUM(data-area)
                MINRUNLEVEL(data-area)
                MINRUNRNUM(data-area)
                MINRUNVNUM(data-area)
                VALIDATIONST(cvda)
                XMLSCHEMA(data-area)
                XSDBIND(data-area)
           END-EXEC

           EXEC CICS PERFORM DELETSHIPPED END-EXEC

           EXEC CICS
                PERFORM
                DUMP
                DUMPCODE(data-value)
                TITLE(data-area)
                TITLELENGTH(data-value)
                CALLER(data-value)
                CALLERLENGTH(data-value)
                DUMPID(data-area)
           END-EXEC

           EXEC CICS
                PERFORM
                ENDAFFINITY
                NETNAME(data-value)
                NETID(data-value)
           END-EXEC

           EXEC CICS
                PERFORM
                JVMSERVER(data-area)
                JVMTYPE(cvda)
                JVM
                JVMACTION(cvda)
                DUMP
                DUMPTYPE(cvda)
                ALL
                JAVACORE
                HEAP
                SNAPTRACE
                GATHER
                GATHERTYPE(cvda)
                DIAGNOSTICS
                LIBERTY
                LIBRTYACTION(cvda)
                REFRESH
                RESOURCETYPE(cvda)
                APPLICATION
                APPID(data-area)
                APPIDLEN(data-area)
                CONFIG
                SERVERDUMP
                OSGI
                OSGIACTION(cvda)
                REFRESHPKGS
           END-EXEC

           EXEC CICS
                PERFORM 
                PIPELINE(data-value)
                ACTION(cvda)
                SCAN
           END-EXEC

           EXEC CICS PERFORM RESETTIME END-EXEC

           EXEC CICS PERFORM SECDISCOVERY ACTION(cvda) WRITE END-EXEC
           
           EXEC CICS PERFORM SECURITY REBUILD ESMRESP(data-area)
           END-EXEC

           EXEC CICS
                PERFORM
                SHUTDOWN
                PLT(data-value)
                PLTNAME(data-value)
                RESTART
                SDTRAN(data-value)
                NOSDTRAN
                XLT(data-value)
                DUMP
           END-EXEC

           EXEC CICS
                PERFORM
                SHUTDOWN
                IMMEDIATE
                NORESTART
                SDTRAN(data-value)
                NOSDTRAN
                DUMP
           END-EXEC

           EXEC CICS
                PERFORM
                SHUTDOWN
                TAKEOVER
                SDTRAN(data-value)
                NOSDTRAN
           END-EXEC

           EXEC CICS PERFORM SSL REBUILD GSKRESP(data-area) END-EXEC

           EXEC CICS
                PERFORM
                STATISTICS
                RECORD
                ALL
                RESETNOW
                ASYNCSERVICE
                ATOMSERVICE
                AUTOINSTALL
                BUNDLE
                CAPTURESPEC
                CONNECTION
                DB2
                DISPATCHER
                DOCTEMPLATE
                ENQUEUE
                EPADAPTER
                EVENTBINDING
                EVENTPROCESS
                FEPI
                FILE
                IPCONN
                JOURNALNAME
                JOURNALNUM
                JVMPROGRAM
                JVMSERVER
                LIBRARY
                LSRPOOL
                MONITOR
                MQCONN
                MQMONITOR
                NODEJSAPP
                PIPELINE
                POLICY
                PROGAUTO
                PROGRAM
                PROGRAMDEF
                RECOVERY
                SECURITY
                STATS
                STORAGE
                STREAMNAME
                SYSDUMP
                TABLEMGR
                TCPIP
                TCPIPSERVICE
                TDQUEUE
                TERMINAL
                TRANCLASS
                TCLASS
                TRANDUMP
                TRANSACTION
                TSQUEUE
                URIMAP
                USER
                VTAM
                WEBSERVICE
                XMLTRANSFORM
           END-EXEC

           EXEC CICS
                RESYNC
                ENTRYNAME(data-value)
                QUALIFIER(data-value)
                IDLIST(data-value)
                IDLISTLENGTH(data-value)
                PARTIAL
           END-EXEC

      *
      *    There are numerous SET SPI commands which do not appear
      *    to introduce any new keywords beyond their corresponding
      *    CREATE SPI command.  These are elided for brevity.
      *

           EXEC CICS
                SET
                ASSOCIATION
                USERCORRDATA(data-value)
           END-EXEC

           EXEC CICS
                SET
                AUTOINSTALL
                AIBRIDGE(cvda)
                CONSOLES(cvda)
                MAXREQS(data-value)
                PROGRAM(data-value)
           END-EXEC

           EXEC CICS
                SET
                BRFACILITY(data-value)
                TERMSTATUS(cvda)
                RELEASED
           END-EXEC

           EXEC CICS
                SET
                DELETSHIPPED
                IDLE(data-value)
                IDLEHRS(data-value)
                IDLEMINS(data-value)
                IDLESECS(data-value)
                INTERVAL(data-value)
                INTERVALHRS(data-value)
                INTERVALMINS(data-value)
                INTERVALSECS(data-value)
           END-EXEC

           EXEC CICS
                SET
                DISPATCHER
                MAXOPENTCBS(data-value)
                MAXSSLTCBS(data-value)
                MAXXPTCBS(data-value)
                MROBATCH(data-value)
                PRTYAGING(data-value)
                RUNAWAY(data-value)
                SCANDELAY(data-value)
                TIME(data-value)
           END-EXEC

           EXEC CICS
                SET
                DSNAME( data-value)
                ACTION(cvda)
                REMOVE
                RECOVERED
                RESETLOCKS
                RETRY
                AVAILABILITY(cvda)
                AVAILABLE
                RREPL
                UNAVAILABLE
                QUESCESTATE(cvda)
                QUIESCED
                IMMQUIESCED
                UNQUIESCED
                WAIT
                BUSY(cvda)
                NOWAIT
                UOWACTION(cvda)
                BACKOUT
                COMMIT
                FORCE
           END-EXEC

           EXEC CICS
                SET
                DUMPDS
                INITIALDDS(data-value)
                OPENSTATUS(cvda)
                CLOSED
                OPEN
                SWITCH
                SWITCHSTATUS(cvda)
                NOSWITCH
                SWITCHNEXT
                SWITCHALL
           END-EXEC

           EXEC CICS
                SET
                EPADAPTER(data-value)
                ENABLESTATUS(cvda)
                ENABLED
                DISABLED
           END-EXEC

           EXEC CICS
                SET
                EPADAPTERSET(data-value)
                ENABLESTATUS(cvda)
                ENABLED
                DISABLED
           END-EXEC

           EXEC CICS
                SET
                EVENTBINDING(data-value)
                ENABLESTATUS(cvda)
                ENABLED
                DISABLED
           END-EXEC

           EXEC CICS
                SET
                EVENTPROCESS
                EPSTATUS(cvda)
                STARTED
                DRAIN
                STOPPED
           END-EXEC

           EXEC CICS SET HOST(data-area) ENABLESTATUS(cvda) END-EXEC

           EXEC CICS
                SET
                IRC
                OPENSTATUS(cvda)
                CLOSED
                IMMCLOSE
                OPEN
           END-EXEC

           EXEC CICS
                SET
                JOURNALNAME(data-value)
                ACTION(cvda)
                FLUSH
                RESET
                STATUS(cvda)
                DISABLED
                ENABLED
           END-EXEC

           EXEC CICS
                SET
                SECDISCOVERY
                ON
                OFF
                STATUS( cvda)
                CMD( cvda)
                DB2( cvda)
                DCT( cvda)
                FCT( cvda)
                HFS( cvda)
                JCT( cvda)
                PCT( cvda)
                PPT( cvda)
                PSB( cvda)
                RES( cvda)
                TST( cvda)
                USER( cvda)
                DISCOVERALL
           END-EXEC

           EXEC CICS
                SET
                SECDISCOVERY
                ON
                OFF
                STATUS( cvda)
                CMD( cvda)
                DB2( cvda)
                DCT( cvda)
                FCT( cvda)
                HFS( cvda)
                JCT( cvda)
                PCT( cvda)
                PPT( cvda)
                PSB( cvda)
                RES( cvda)
                TST( cvda)
                USER( cvda)
                DISCOVERALL
           END-EXEC

           EXEC CICS
                SET
                SECDISCOVERY
                ON
           END-EXEC

           EXEC CICS
                SET
                SECDISCOVERY
                DISCOVERALL
           END-EXEC

           EXEC CICS
                SET
                SYSTEM
                AKP(data-value)
                DEBUGTOOL(cvda)
                DEBUG
                NODEBUG
                DSALIMIT(data-value)
                DSRTPROGRAM(data-value)
                DTRPROGRAM(data-value)
                DUMPING(cvda)
                NOSYSDUMP
                TABLEONLY
                SYSDUMP
                EDSALIMIT(data-value)
                FORCEQR(cvda)
                FORCE
                NOFORCE
                GMMTEXT(data-value)
                GMMLENGTH(data-value)
                LOGDEFER(data-area)
                MAXTASKS(data-value)
                NEWMAXTASKS(data-area)
                MROBATCH(data-value)
                PROGAUTOCTLG(cvda)
                CTLGALL
                CTLGMODIFY
                CTLGNONE
                PROGAUTOEXIT(data-value)
                PROGAUTOINST(cvda)
                AUTOACTIVE
                AUTOINACTIVE
                PRTYAGING(data-value)
                RUNAWAY(data-value)
                SCANDELAY(data-value)
                TIME(data-value)
           END-EXEC

           EXEC CICS
                SET
                TAGS
                REFRESH
           END-EXEC

           EXEC CICS
                SET 
                TASK (data-value)
                PRIORITY(data-value)
                PURGETYPE(cvda)
                FORCEPURGE
                KILL
                PURGE
           END-EXEC

           EXEC CICS
                SET 
                TCPIP 
                MAXSOCKETS(data-value)
                NEWMAXSOCKET(data-area)
                OPENSTATUS(data-value)
                CLOSED
                IMMCLOSE
                OPEN
           END-EXEC

           EXEC CICS
                SET 
                TCPIPSERVICE(data-value)
                BACKLOG(data-area)
                MAXDATALEN(data-area)
                OPENSTATUS(cvda)
                CLOSED
                IMMCLOSE
                OPEN
                URM(data-value)
           END-EXEC

           EXEC CICS
                SET 
                TDQUEUE(data-value)
                ATIFACILITY(cvda)
                NOTERMINAL
                TERMINAL
                ATITERMID(data-value)
                ATITRANID(data-value)
                ATIUSERID(data-value)
                ENABLESTATUS(cvda)
                DISABLED
                ENABLED
                OPENSTATUS(cvda)
                CLOSED
                OPEN
                TRIGGERLEVEL(data-value)
           END-EXEC

           EXEC CICS SET TEMPSTORAGE TSMAINLIMIT(data-value) END-EXEC

           EXEC CICS
                SET
                TERMINAL(data-value)
                ACQSTATUS(cvda)
                TERMSTATUS(cvda)
                ACQUIRED
                COLDACQ
                RELEASED
                ALTPRINTER(data-value)
                ALTPRTCOPYST(cvda)
                ALTPRTCOPY
                NOALTPRTCOPY
                ATISTATUS(cvda)
                ATI
                NOATI
                CREATESESS(cvda)
                CREATE
                NOCREATE
                DISCREQST(cvda)
                DISCREQ
                NODISCREQ
                EXITTRACING(cvda)
                EXITTRACE
                NOEXITTRACE
                MAPNAME(data-value)
                MAPSETNAME(data-value)
                NEXTTRANSID(data-value)
                OBFORMATST(cvda)
                OBFORMAT
                NOOBFORMAT
                OPERID(data-value)
                PAGESTATUS(cvda)
                AUTOPAGEABLE
                PAGEABLE
                PRINTER(data-value)
                PRTCOPYST(cvda)
                PRTCOPY
                NOPRTCOPY
                PURGETYPE(cvda)
                FORCEPURGE
                KILL
                PURGE
                FORCE
                CANCEL
                RELREQST(cvda)
                RELREQ
                NORELREQ
                SERVSTATUS(cvda)
                INSERVICE
                OUTSERVICE
                TCAMCONTROL(data-value)
                TERMPRIORITY(data-value)
                TRACING(cvda)
                SPECTRACE
                STANTRACE
                TTISTATUS(cvda)
                NOTTI
                TTI
                UCTRANST(cvda)
                UCTRAN
                NOUCTRAN
                TRANIDONLY
                ZCPTRACING(cvda)
                NOZCPTRACE
                ZCPTRACE
           END-EXEC

           EXEC CICS
                SET
                TRACEDEST
                AUXSTATUS(cvda)
                AUXPAUSE
                AUXSTART
                AUXSTOP
                GTFSTATUS(cvda)
                GTFSTART
                GTFSTOP
                INTSTATUS(cvda)
                INTSTART
                INTSTOP
                SWITCHACTION(cvda)
                SWITCH
                SWITCHSTATUS(cvda)
                NOSWITCH
                SWITCHNEXT
                SWITCHALL
                TABLESIZE(data-value)
           END-EXEC

           EXEC CICS
                SET 
                TRACEFLAG
                SINGLESTATUS(cvda)
                SINGLEOFF
                SINGLEON
                SYSTEMSTATUS(cvda)
                SYSTEMOFF
                SYSTEMON
                TCEXITSTATUS(cvda)
                TCEXITALL
                TCEXITALLOFF
                TCEXITNONE
                TCEXITSYSTEM
                USERSTATUS(cvda)
                USEROFF
                USERON
           END-EXEC

           EXEC CICS
                SET 
                TRACETYPE
                FLAGSET(cvda)
                SPECIAL
                STANDARD
                COMPID(data-value)
           END-EXEC

           EXEC CICS
                SET 
                TRANCLASS(data-value)
                MAXACTIVE(data-value)
                PURGEACTION(cvda)
                ABEND
                DISCARD
                PURGETHRESH(data-value)
           END-EXEC

           EXEC CICS
                SET 
                TRANDUMPCODE(data-value)
                ACTION(cvda)
                ADD
                REMOVE
                RESET
                DUMPSCOPE(cvda)
                LOCAL
                RELATED
                MAXIMUM(data-value)
                SHUTOPTION(cvda)
                NOSHUTDOWN
                SHUTDOWN
                SYSDUMPING(cvda)
                NOSYSDUMP
                SYSDUMP
                TRANDUMPING(cvda)
                NOTRANDUMP
                TRANDUMP
           END-EXEC

           EXEC CICS
                SET 
                TRANSACTION(data-value)
                DUMPING(cvda)
                TRANDUMP
                NOTRANDUMP
                PRIORITY(data-value)
                PURGEABILITY(cvda)
                NOTPURGEABLE
                PURGEABLE
                RUNAWAY(data-value)
                RUNAWAYTYPE(cvda)
                SYSTEM
                USER
                SHUTDOWN(cvda)
                SHUTDISABLED
                SHUTENABLED
                STATUS(cvda)
                DISABLED
                ENABLED
                TCLASS(data-value)
                TRANCLASS(data-value)
                TRACING(cvda)
                SPECTRACE
                SPRSTRACE
                STANTRACE
           END-EXEC

           EXEC CICS
                SET
                TSQUEUE(data-value)
                SYSID(data-value)
                POOLNAME(data-value)
                ACTION(cvda)
                LASTUSEDINT(data-value)
           END-EXEC

           EXEC CICS
                SET
                TSQNAME(data-value)
                SYSID(data-value)
                POOLNAME(data-value)
                ACTION(cvda)
                LASTUSEDINT(data-value)
           END-EXEC

           EXEC CICS
                SET 
                UOW(data-value)
                UOWSTATE(cvda)
                COMMIT
                BACKOUT
                FORCE
           END-EXEC

           EXEC CICS
                SET 
                UOWLINK(data-value)
                ACTION(cvda)
                DELETE
           END-EXEC

           EXEC CICS
                SET 
                URIMAP(data-area)
                ENABLESTATUS(cvda)
                DISABLED
                ENABLED
                REDIRECTTYPE(cvda)
                NONE
                PERMANENT
                TEMPORARY
                LOCATION(data-area)
           END-EXEC

           EXEC CICS
                SET 
                VTAM
                OPENSTATUS(cvda)
                CLOSED
                FORCECLOSE
                IMMCLOSE
                OPEN
                PSDINTERVAL(data-value)
                PSDINTHRS(data-value)
                PSDINTMINS(data-value)
                PSDINTSECS(data-value)
                DEREGISTERED
           END-EXEC

           EXEC CICS
                SET 
                WEB
                GARBAGEINT(data-value)
                TIMEOUTINT(data-value)
           END-EXEC

           EXEC CICS
                SET 
                WEBSERVICE(name) 
                VALIDATIONST(cvda)
                VALIDATION
                NOVALIDATION
           END-EXEC

           EXEC CICS
                SET
                WLMHEALTH 
                ADJUSTMENT(data-value)
                INTERVAL(data-value)
                OPENSTATUS(cvda)
           END-EXEC

           EXEC CICS
                SET 
                XMLTRANSFORM(name)
                VALIDATIONST(cvda)
                VALIDATION
                NOVALIDATION
           END-EXEC









           EXEC CICS RETURN END-EXEC.
