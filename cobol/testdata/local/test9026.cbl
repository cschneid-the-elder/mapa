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






           EXEC CICS RETURN END-EXEC.
