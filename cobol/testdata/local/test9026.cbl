       Identification Division.
       Program-ID.    test9026.
      *
      * Test all the parameters of all the CICS SPI commands.
      * This code definitely won't compile cleanly, in part
      * due to mutually exclusive options on some commands.
      * It's just here to test parsing.
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




           EXEC CICS RETURN END-EXEC.
