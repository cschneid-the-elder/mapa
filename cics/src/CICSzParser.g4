/*
Copyright (C) 2024 Craig Schneiderwent.  
All rights reserved.

The author(s) accept no liability for damages of any kind resulting from the use
of this software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

CICS Transaction Server for z/OS Version 6.1, CICS Transaction Server for z/OS
Version 3.1, CICS/MVS 2.1.2, CICS/DOS/VS 1.7, and CICS/VS 1.5 documentation 
served as the original source material.

*/


parser grammar CICSzParser;

options {tokenVocab=CICSzLexer;}

startRule
	: (
	cicsCommand 
	)+
	EOF
	;

cicsCommandInitiator
	: (
	EXEC_CICS
	)
	;

cicsCommandTerminator
	: (
	END_EXEC
	| SEMICOLON
	)
	;

cicsCommand
	: (
	cicsCommandInitiator
	(cicsAPI | cicsSPI)
	cicsCommandTerminator
	)
	;

cicsAPI
	: (

	abend
	| acquire
	| addSubevent
	| address
	| addressSet
	| allocateAPPC
	| allocateLU61
	| allocateMRO
	| asktime
	| assign
	| bifDeedit
	| bifDigest
	| buildAttachLU61
	| buildAttachMRO
	| cancel
	| cancelBTS
	| changePhrase
	| changePassword
	| changeTask
	| checkAcqprocess
	| checkActivity
	| checkTimer
	| connectProcess
	| conversezOSCommServer
	| converseNonzOSCommServer
	| converttime
	| defineActivity
	| defineCompositeEvent
	| defineCounter
	| defineDcounter
	| defineInputEvent
	| defineProcess
	| defineTimer
	| delay
	| delete
	| deleteActivity
	| deleteChannel
	| deleteContainerBTS
	| deleteContainer
	| deleteCounter
	| deleteDcounter
	| deleteEvent
	| deleteTimer
	| deleteqTd
	| deleteqTs
	| deq
	| documentCreate
	| documentDelete
	| documentInsert
	| documentRetrieve
	| documentSet
	| dump
	| dumpTransaction
	| endbr
	| endbrowseActivity
	| endbrowse
	| endbrowseEvent
	| endbrowseProcess
	| endbrowseTimer
	| enq
	| enterTraceid
	| enterTracenum
	| extractAttachLU61
	| extractAttachMRO
	| extractAttributesAPPC
	| extractAttributesMRO
	| extractCertificate
	| extractLogonmsg
	| extractProcess
	| extractTcpip
	| extractTct
	| extractWebAsHost
	| extractWebAsClient
	| fetchAny
	| fetchChild
	| forceTimer
	| formattime
	| free
	| freeAPPC
	| freeLU61
	| freeMRO
	| freeChild
	| freemain
	| freemain64
	| gdsAllocate
	| gdsAssign
	| gdsConnectProcess
	| gdsExtractAttributes
	| gdsExtractProcess
	| gdsFree
	| gdsIssueAbend
	| gdsIssueConfirmation
	| gdsIssueError
	| gdsIssuePrepare
	| gdsIssueSignal
	| gdsReceive
	| gdsSend
	| gdsWait
	| getContainerBTS
	| getContainer
	| getCounter
	| getDcounter
	| getmain
	| getmain64
	| getnextActivity
	| getnextContainer
	| getnextEvent
	| getnextProcess
	| getnextTimer
	| get64Container
	| handleAbend
	| handleAid
	| handleCondition
	| ignoreCondition
	| inquireActivityid
	| inquireContainer
	| inquireEvent
	| inquireProcess
	| inquireTimer
	| invokeApplication
	| invokeService
	| invokeWebservice
	| issueAbend
	| issueAbort
	| issueAdd
	| issueConfirmation
	| issueCopy
	| issueDisconnect
	| issueDisconnectLU61
	| issueEnd
	| issueEndfile
	| issueEndoutput
	| issueEods
	| issueErase
	| issueEraseaup
	| issueError
	| issueLoad
	| issueNote
	| issuePass
	| issuePrepare
	| issuePrint
	| issueQuery
	| issueReceive
	| issueReplace
	| issueReset
	| issueSend
	| issueSignal
	| issueSignalLU61
	| issueWait
	| journal
	| link
	| linkAcqprocess
	| linkActivity
	| load
	| monitor
	| moveContainerBTS
	| moveContainer
	| point
	| popHandle
	| post
	| purgeMessage
	| pushHandle
	| putContainerBTS
	| putContainer
	| put64Container
	| queryChannel
	| queryCounter
	| queryDcounter
	| querySecurity
	| read
	| readnext
	| readprev
	| readqTd
	| readqTs
	| receivezOSCommServer
	| receiveNonzOSCommServer
	| receiveMap
	| receiveMapMappingdev
	| receivePartn
	| release
	| removeSubevent
	| requestEncryptptkt
	| requestPassticket
	| resetAcqprocess
	| resetActivity
	| resetbr
	| resume
	| retrieve
	| retrieveReattach
	| retrieveSubevent
	| return
	| rewindCounter
	| rewindDcounter
	| rewrite
	| route
	| run
	| runTransid
	| sendzOSCommServer
	| sendNonzOSCommServer
	| sendControl
	| sendMap
	| sendMapMappingdev
	| sendPage
	| sendPartnset
	| sendText
	| sendTextMapped
	| sendTextNoedit
	| signalEvent
	| signoff
	| signon
	| signonToken
	| soapfaultAdd
	| soapfaultCreate
	| soapfaultDelete
	| spoolclose
	| spoolopenInput
	| spoolopenOutput
	| spoolread
	| spoolwrite
	| spoolopenReport
	| spoolwriteReport
	| spoolcloseReport
	| spoolopenResume
	| start
	| startAttach
	| startBrexit
	| startChannel
	| startbr
	| startbrowseActivity
	| startbrowseContainerBTS
	| startbrowseContainer
	| startbrowseEvent
	| startbrowseProcess
	| startbrowseTimer
	| suspend
	| suspendBTS
	| syncpoint
	| syncpointRollback
	| testEvent
	| transformDatatojson
	| transformDatatoxml
	| transformJsontodata
	| transformXmltodata
	| unlock
	| updateCounter
	| updateDcounter
	| verifyPassword
	| verifyPhrase
	| verifyToken
	| waitConvid
	| waitEvent
	| waitExternal
	| waitJournal
	| waitJournalname
	| waitJournalnum
	| waitSignal
	| waitTerminal
	| waitcics
	| webClose
	| webConverse
	| webEndbrowseFormfield
	| webEndbrowseHttpheader
	| webEndbrowseQueryparm
	| webExtractServer
	| webExtractClient
	| webOpen
	| webParse
	| webReadFormfield
	| webReadHttpheader
	| webReadQueryparm
	| webReadnextFormfield
	| webReadnextHttpheader
	| webReadnextQueryparm
	| webReceiveServerWithBuffer
	| webReceiveServerWithContainer
	| webReceiveClientWithBuffer
	| webReceiveClientWithContainer
	| webRetrieve
	| webSendServer
	| webSendClient
	| webStartbrowseFormfield
	| webStartbrowseHttpheader
	| webStartbrowseQueryparm
	| webWriteHttpheader
	| write
	| writeJournalname
	| writeJournalnum
	| writeOperator
	| writeqTd
	| writeqTs
	| wsacontextBuild
	| wsacontextDelete
	| wsacontextGet
	| wsaeprCreate
	| xctl
	)
	;

cicsSPI
	: (

	acquireTerminal
	| collectStatistics
	| createAtomservice
	| createBundle
	| createConnection
	| createDb2conn
	| createDb2entry
	| createDb2tran
	| createDoctemplate
	| createDumpcode
	| createEnqmodel
	| createFile
	| createIpconn
	| createJournalmodel
	| createJvmserver
	| createLibrary
	| createLsrpool
	| createMapset
	| createMqconn
	| createMqmonitor
	| createPartitionset
	| createPartner
	| createPipeline
	| createProcesstype
	| createProfile
	| createProgram
	| createSessions
	| createTcpipservice
	| createTdqueue
	| createTerminal
	| createTranclass
	| createTransaction
	| createTsmodel
	| createTypeterm
	| createUrimap
	| createWebservice
	| csdAdd
	| csdAlter
	| csdAppend
	| csdCopy
	| csdDefine
	| csdDelete
	| csdDisconnect
	| csdEndbrgroup
	| csdEndbrlist
	| csdEndbrrsrce
	| csdGetnextgroup
	| csdGetnextlist
	| csdGetnextrsrce
	| csdInquiregroup
	| csdInquirelist
	| csdInquirersrce
	| csdInstallList
	| csdInstallResourceOrGroup
	| csdLock
	| csdRemove
	| csdRename
	| csdStartbrgroup
	| csdStartbrlist
	| csdStartbrrsrce
	| csdUnlock
	| csdUserdefine
	| disableProgram
	| discardAtomservice
	| discardAutinstmodel
	| discardBundle
	| discardConnection
	| discardDb2conn
	| discardDb2entry
	| discardDb2tran
	| discardDoctemplate
	| discardEnqmodel
	| discardFile
	| discardIpconn
	| discardJournalmodel
	| discardJournalname
	| discardJvmserver
	| discardLibrary
	| discardMqconn
	| discardMqmonitor
	| discardPartner
	| discardPipeline
	| discardProcesstype
	| discardProfile
	| discardProgram
	| discardTcpipservice
	| discardTdqueue
	| discardTerminal
	| discardTranclass
	| discardTransaction
	| discardTsmodel
	| discardUrimap
	| discardWebservice
	| enableProgram
	| extractExit
	| extractStatistics
	| inquireAssociation
	| inquireAssociationList
	| inquireAtomservice
	| inquireAutinstmodel
	| inquireAutoinstall
	| inquireBrfacility
	| inquireBundle
	| inquireBundlepart
	| inquireCapdatapred
	| inquireCapinfosrce
	| inquireCapoptpred
	| inquireCapturespec
	| inquireConnection
	| inquireCfdtpool
	| inquireDb2conn
	| inquireDb2entry
	| inquireDb2tran
	| inquireDeletshipped
	| inquireDispatcher
	| inquireDoctemplate
	| inquireDsname
	| inquireDumpds
	| inquireEnq
	| inquireEnqmodel
	| inquireEpadapter
	| inquireEpadapterset
	| inquireEpadaptinset
	| inquireEventbinding
	| inquireEventprocess
	| inquireExci
	| inquireExitprogram
	| inquireFeaturekey
	| inquireFile
	| inquireHost
	| inquireIpconn
	| inquireIpfacility
	| inquireIrc
	| inquireJournalmodel
	| inquireJournalname
	| inquireJournalnum
	| inquireJvmendpoint
	| inquireJvmserver
	| inquireLibrary
	| inquireModename
	| inquireMonitor
	| inquireMqconn
	| inquireMqini
	| inquireMqmonitor
	| inquireMvstcb
	| inquireNetname
	| inquireNodejsapp
	| inquireOsgibundle
	| inquireOsgiservice
	| inquirePartner
	| inquirePipeline
	| inquirePolicy
	| inquirePolicyrule
	| inquireProcesstype
	| inquireProfile
	| inquireProgram
	| inquireReqid
	| inquireRrms
	| inquireSecrecording
	| inquireStatistics
	| inquireStorage
	| inquireStorage64
	| inquireStreamname
	| inquireSubpool
	| inquireSysdumpcode
	| inquireSystem
	| inquireTag
	| inquireTask
	| inquireTaskList
	| inquireTclass
	| inquireTcpip
	| inquireTcpipservice
	| inquireTdqueue
	| inquireTempstorage
	| inquireTerminal
	| inquireTracedest
	| inquireTraceflag
	| inquireTracetype
	| inquireTranclass
	| inquireTrandumpcode
	| inquireTransaction
	| inquireTsmodel
	| inquireTspool
	| inquireTsqueue
	| inquireTsqname
	| inquireUow
	| inquireUowdsnfail
	| inquireUowenq
	| inquireUowlink
	| inquireUrimap
	| inquireVtam
	| inquireWeb
	| inquireWebservice
	| inquireWlmhealth
	| inquireWorkrequest
	| inquireXmltransform
	| performDeletshipped
	| performDump
	| performEndaffinity
	| performJvmserver
	| performPipeline
	| performResettime
	| performSecurityRebuild
	| performShutdown
	| performShutdownImmediate
	| performShutdownTakeover
	| performSslRebuild
	| performStatisticsRecord
	| resyncEntryname
	| setAssociationUsercorrdata
	| setAtomservice
	| setAutoinstall
	| setBrfacility
	| setBundle
	| setConnection
	| setDb2conn
	| setDb2entry
	| setDb2tran
	| setDeletshipped
	| setDispatcher
	| setDoctemplate
	| setDsname
	| setDumpds
	| setEnqmodel
	| setEpadapter
	| setEpadapterset
	| setEventbinding
	| setEventprocess
	| setFile
	| setDataset
	| setHost
	| setIpconn
	| setIrc
	| setJournalname
	| setJournalnum
	| setJvmendpoint
	| setJvmserver
	| setLibrary
	| setModename
	| setMonitor
	| setMqconn
	| setMqmonitor
	| setNetname
	| setPipeline
	| setProcesstype
	| setProgram
	| setSecrecording
	| setStatistics
	| setSysdumpcode
	| setSystem
	| setTagsRefresh
	| setTask
	| setTclass
	| setTcpip
	| setTcpipservice
	| setTdqueue
	| setTempstorage
	| setTerminal
	| setTracedest
	| setTraceflag
	| setTracetype
	| setTranclass
	| setTrandumpcode
	| setTransaction
	| setTsqueue
	| setTsqname
	| setUow
	| setUowlink
	| setUrimap
	| setVtam
	| setWeb
	| setWebservice
	| setWlmhealth
	| setXmltransform
	)
	;

exceptionOptions
	: (
	NOHANDLE
	| RESP arg?
	| RESP2 arg?
	)
	;

arg
	: LPAREN ARG* RPAREN
	;


abend
	: (
	 abendOption abendOptions*
	)
	;

acquire
	: (
	 acquireOption acquireOptions*
	)
	;

addSubevent
	: (
	 addOption subeventOption addSubeventOptions*
	)
	;

address
	: (
	 addressOption addressOptions*
	)
	;

addressSet
	: (
	 addressOption setOption addressSetOptions*
	)
	;

allocateAPPC
	: (
	 allocateOption allocateAPPCOptions*
	)
	;

allocateLU61
	: (
	 allocateOption allocateLU61Options*
	)
	;

allocateMRO
	: (
	 allocateOption allocateMROOptions*
	)
	;

asktime
	: (
	 asktimeOption asktimeOptions*
	)
	;

assign
	: (
	 assignOption assignOptions*
	)
	;

bifDeedit
	: (
	 bifOption deeditOption bifDeeditOptions*
	)
	;

bifDigest
	: (
	 bifOption digestOption bifDigestOptions*
	)
	;

buildAttachLU61
	: (
	 buildOption attachOption buildAttachLU61Options*
	)
	;

buildAttachMRO
	: (
	 buildOption attachOption buildAttachMROOptions*
	)
	;

cancel
	: (
	 cancelOption cancelOptions*
	)
	;

cancelBTS
	: (
	 cancelOption cancelBTSOptions*
	)
	;

changePhrase
	: (
	 changeOption phraseOption changePhraseOptions*
	)
	;

changePassword
	: (
	 changeOption passwordOption changePasswordOptions*
	)
	;

changeTask
	: (
	 changeOption taskOption changeTaskOptions*
	)
	;

checkAcqprocess
	: (
	 checkOption acqprocessOption checkAcqprocessOptions*
	)
	;

checkActivity
	: (
	 checkOption activityOption checkActivityOptions*
	)
	;

checkTimer
	: (
	 checkOption timerOption checkTimerOptions*
	)
	;

connectProcess
	: (
	 connectOption processOption connectProcessOptions*
	)
	;

conversezOSCommServer
	: (
	 converseOption conversezOSCommServerOptions*
	)
	;

converseNonzOSCommServer
	: (
	 converseOption converseNonzOSCommServerOptions*
	)
	;

converttime
	: (
	 converttimeOption converttimeOptions*
	)
	;

defineActivity
	: (
	 defineOption activityOption defineActivityOptions*
	)
	;

defineCompositeEvent
	: (
	 defineOption compositeOption eventOption defineCompositeEventOptions*
	)
	;

defineCounter
	: (
	 defineOption counterOption defineCounterOptions*
	)
	;

defineDcounter
	: (
	 defineOption dcounterOption defineDcounterOptions*
	)
	;

defineInputEvent
	: (
	 defineOption inputOption eventOption defineInputEventOptions*
	)
	;

defineProcess
	: (
	 defineOption processOption defineProcessOptions*
	)
	;

defineTimer
	: (
	 defineOption timerOption defineTimerOptions*
	)
	;

delay
	: (
	 delayOption delayOptions*
	)
	;

delete
	: (
	 deleteOption deleteOptions*
	)
	;

deleteActivity
	: (
	 deleteOption activityOption deleteActivityOptions*
	)
	;

deleteChannel
	: (
	 deleteOption channelOption deleteChannelOptions*
	)
	;

deleteContainerBTS
	: (
	 deleteOption containerOption deleteContainerBTSOptions*
	)
	;

deleteContainer
	: (
	 deleteOption containerOption deleteContainerOptions*
	)
	;

deleteCounter
	: (
	 deleteOption counterOption deleteCounterOptions*
	)
	;

deleteDcounter
	: (
	 deleteOption dcounterOption deleteDcounterOptions*
	)
	;

deleteEvent
	: (
	 deleteOption eventOption deleteEventOptions*
	)
	;

deleteTimer
	: (
	 deleteOption timerOption deleteTimerOptions*
	)
	;

deleteqTd
	: (
	 deleteqOption tdOption deleteqTdOptions*
	)
	;

deleteqTs
	: (
	 deleteqOption tsOption deleteqTsOptions*
	)
	;

deq
	: (
	 deqOption deqOptions*
	)
	;

documentCreate
	: (
	 documentOption createOption documentCreateOptions*
	)
	;

documentDelete
	: (
	 documentOption deleteOption documentDeleteOptions*
	)
	;

documentInsert
	: (
	 documentOption insertOption documentInsertOptions*
	)
	;

documentRetrieve
	: (
	 documentOption retrieveOption documentRetrieveOptions*
	)
	;

documentSet
	: (
	 documentOption setOption documentSetOptions*
	)
	;

dump
	: (
	 dumpOption dumpOptions*
	)
	;

dumpTransaction
	: (
	 dumpOption transactionOption dumpTransactionOptions*
	)
	;

endbr
	: (
	 endbrOption endbrOptions*
	)
	;

endbrowseActivity
	: (
	 endbrowseOption activityOption endbrowseActivityOptions*
	)
	;

endbrowse
	: (
	 endbrowseOption endbrowseOptions*
	)
	;

endbrowseEvent
	: (
	 endbrowseOption eventOption endbrowseEventOptions*
	)
	;

endbrowseProcess
	: (
	 endbrowseOption processOption endbrowseProcessOptions*
	)
	;

endbrowseTimer
	: (
	 endbrowseOption timerOption endbrowseTimerOptions*
	)
	;

enq
	: (
	 enqOption enqOptions*
	)
	;

enterTraceid
	: (
	 enterOption traceidOption enterTraceidOptions*
	)
	;

enterTracenum
	: (
	 enterOption tracenumOption enterTracenumOptions*
	)
	;

extractAttachLU61
	: (
	 extractOption attachOption extractAttachLU61Options*
	)
	;

extractAttachMRO
	: (
	 extractOption attachOption extractAttachMROOptions*
	)
	;

extractAttributesAPPC
	: (
	 extractOption attributesOption extractAttributesAPPCOptions*
	)
	;

extractAttributesMRO
	: (
	 extractOption attributesOption extractAttributesMROOptions*
	)
	;

extractCertificate
	: (
	 extractOption certificateOption extractCertificateOptions*
	)
	;

extractLogonmsg
	: (
	 extractOption logonmsgOption extractLogonmsgOptions*
	)
	;

extractProcess
	: (
	 extractOption processOption extractProcessOptions*
	)
	;

extractTcpip
	: (
	 extractOption tcpipOption extractTcpipOptions*
	)
	;

extractTct
	: (
	 extractOption tctOption extractTctOptions*
	)
	;

extractWebAsHost
	: (
	 extractOption webOption extractWebAsHostOptions*
	)
	;

extractWebAsClient
	: (
	 extractOption webOption extractWebAsClientOptions*
	)
	;

fetchAny
	: (
	 fetchOption anyOption fetchAnyOptions*
	)
	;

fetchChild
	: (
	 fetchOption childOption fetchChildOptions*
	)
	;

forceTimer
	: (
	 forceOption timerOption forceTimerOptions*
	)
	;

formattime
	: (
	 formattimeOption formattimeOptions*
	)
	;

free
	: (
	 freeOption freeOptions*
	)
	;

freeAPPC
	: (
	 freeOption freeAPPCOptions*
	)
	;

freeLU61
	: (
	 freeOption freeLU61Options*
	)
	;

freeMRO
	: (
	 freeOption freeMROOptions*
	)
	;

freeChild
	: (
	 freeOption childOption freeChildOptions*
	)
	;

freemain
	: (
	 freemainOption freemainOptions*
	)
	;

freemain64
	: (
	 freemain64Option freemain64Options*
	)
	;

gdsAllocate
	: (
	 gdsOption allocateOption gdsAllocateOptions*
	)
	;

gdsAssign
	: (
	 gdsOption assignOption gdsAssignOptions*
	)
	;

gdsConnectProcess
	: (
	 gdsOption connectOption processOption gdsConnectProcessOptions*
	)
	;

gdsExtractAttributes
	: (
	 gdsOption extractOption attributesOption gdsExtractAttributesOptions*
	)
	;

gdsExtractProcess
	: (
	 gdsOption extractOption processOption gdsExtractProcessOptions*
	)
	;

gdsFree
	: (
	 gdsOption freeOption gdsFreeOptions*
	)
	;

gdsIssueAbend
	: (
	 gdsOption issueOption abendOption gdsIssueAbendOptions*
	)
	;

gdsIssueConfirmation
	: (
	 gdsOption issueOption confirmationOption gdsIssueConfirmationOptions*
	)
	;

gdsIssueError
	: (
	 gdsOption issueOption errorOption gdsIssueErrorOptions*
	)
	;

gdsIssuePrepare
	: (
	 gdsOption issueOption prepareOption gdsIssuePrepareOptions*
	)
	;

gdsIssueSignal
	: (
	 gdsOption issueOption signalOption gdsIssueSignalOptions*
	)
	;

gdsReceive
	: (
	 gdsOption receiveOption gdsReceiveOptions*
	)
	;

gdsSend
	: (
	 gdsOption sendOption gdsSendOptions*
	)
	;

gdsWait
	: (
	 gdsOption waitOption gdsWaitOptions*
	)
	;

getContainerBTS
	: (
	 getOption containerOption getContainerBTSOptions*
	)
	;

getContainer
	: (
	 getOption containerOption getContainerOptions*
	)
	;

getCounter
	: (
	 getOption counterOption getCounterOptions*
	)
	;

getDcounter
	: (
	 getOption dcounterOption getDcounterOptions*
	)
	;

getmain
	: (
	 getmainOption getmainOptions*
	)
	;

getmain64
	: (
	 getmain64Option getmain64Options*
	)
	;

getnextActivity
	: (
	 getnextOption activityOption getnextActivityOptions*
	)
	;

getnextContainer
	: (
	 getnextOption containerOption getnextContainerOptions*
	)
	;

getnextEvent
	: (
	 getnextOption eventOption getnextEventOptions*
	)
	;

getnextProcess
	: (
	 getnextOption processOption getnextProcessOptions*
	)
	;

getnextTimer
	: (
	 getnextOption timerOption getnextTimerOptions*
	)
	;

get64Container
	: (
	 get64Option containerOption get64ContainerOptions*
	)
	;

handleAbend
	: (
	 handleOption abendOption handleAbendOptions*
	)
	;

handleAid
	: (
	 handleOption aidOption handleAidOptions*
	)
	;

handleCondition
	: (
	 handleOption conditionOption handleConditionOptions*
	)
	;

ignoreCondition
	: (
	 ignoreOption conditionOption ignoreConditionOptions*
	)
	;

inquireActivityid
	: (
	 inquireOption activityidOption inquireActivityidOptions*
	)
	;

inquireContainer
	: (
	 inquireOption containerOption inquireContainerOptions*
	)
	;

inquireEvent
	: (
	 inquireOption eventOption inquireEventOptions*
	)
	;

inquireProcess
	: (
	 inquireOption processOption inquireProcessOptions*
	)
	;

inquireTimer
	: (
	 inquireOption timerOption inquireTimerOptions*
	)
	;

invokeApplication
	: (
	 invokeOption applicationOption invokeApplicationOptions*
	)
	;

invokeService
	: (
	 invokeOption serviceOption invokeServiceOptions*
	)
	;

invokeWebservice
	: (
	 invokeOption webserviceOption invokeWebserviceOptions*
	)
	;

issueAbend
	: (
	 issueOption abendOption issueAbendOptions*
	)
	;

issueAbort
	: (
	 issueOption abortOption issueAbortOptions*
	)
	;

issueAdd
	: (
	 issueOption addOption issueAddOptions*
	)
	;

issueConfirmation
	: (
	 issueOption confirmationOption issueConfirmationOptions*
	)
	;

issueCopy
	: (
	 issueOption copyOption issueCopyOptions*
	)
	;

issueDisconnect
	: (
	 issueOption disconnectOption issueDisconnectOptions*
	)
	;

issueDisconnectLU61
	: (
	 issueOption disconnectOption issueDisconnectLU61Options*
	)
	;

issueEnd
	: (
	 issueOption endOption issueEndOptions*
	)
	;

issueEndfile
	: (
	 issueOption endfileOption issueEndfileOptions*
	)
	;

issueEndoutput
	: (
	 issueOption endoutputOption issueEndoutputOptions*
	)
	;

issueEods
	: (
	 issueOption eodsOption issueEodsOptions*
	)
	;

issueErase
	: (
	 issueOption eraseOption issueEraseOptions*
	)
	;

issueEraseaup
	: (
	 issueOption eraseaupOption issueEraseaupOptions*
	)
	;

issueError
	: (
	 issueOption errorOption issueErrorOptions*
	)
	;

issueLoad
	: (
	 issueOption loadOption issueLoadOptions*
	)
	;

issueNote
	: (
	 issueOption noteOption issueNoteOptions*
	)
	;

issuePass
	: (
	 issueOption passOption issuePassOptions*
	)
	;

issuePrepare
	: (
	 issueOption prepareOption issuePrepareOptions*
	)
	;

issuePrint
	: (
	 issueOption printOption issuePrintOptions*
	)
	;

issueQuery
	: (
	 issueOption queryOption issueQueryOptions*
	)
	;

issueReceive
	: (
	 issueOption receiveOption issueReceiveOptions*
	)
	;

issueReplace
	: (
	 issueOption replaceOption issueReplaceOptions*
	)
	;

issueReset
	: (
	 issueOption resetOption issueResetOptions*
	)
	;

issueSend
	: (
	 issueOption sendOption issueSendOptions*
	)
	;

issueSignal
	: (
	 issueOption signalOption issueSignalOptions*
	)
	;

issueSignalLU61
	: (
	 issueOption signalOption issueSignalLU61Options*
	)
	;

issueWait
	: (
	 issueOption waitOption issueWaitOptions*
	)
	;

journal
	: (
	 journalOption journalOptions*
	)
	;

link
	: (
	 linkOption linkOptions*
	)
	;

linkAcqprocess
	: (
	 linkOption acqprocessOption linkAcqprocessOptions*
	)
	;

linkActivity
	: (
	 linkOption activityOption linkActivityOptions*
	)
	;

load
	: (
	 loadOption loadOptions*
	)
	;

monitor
	: (
	 monitorOption monitorOptions*
	)
	;

moveContainerBTS
	: (
	 moveOption containerOption moveContainerBTSOptions*
	)
	;

moveContainer
	: (
	 moveOption containerOption moveContainerOptions*
	)
	;

point
	: (
	 pointOption pointOptions*
	)
	;

popHandle
	: (
	 popOption handleOption popHandleOptions*
	)
	;

post
	: (
	 postOption postOptions*
	)
	;

purgeMessage
	: (
	 purgeOption messageOption purgeMessageOptions*
	)
	;

pushHandle
	: (
	 pushOption handleOption pushHandleOptions*
	)
	;

putContainerBTS
	: (
	 putOption containerOption putContainerBTSOptions*
	)
	;

putContainer
	: (
	 putOption containerOption putContainerOptions*
	)
	;

put64Container
	: (
	 put64Option containerOption put64ContainerOptions*
	)
	;

queryChannel
	: (
	 queryOption channelOption queryChannelOptions*
	)
	;

queryCounter
	: (
	 queryOption counterOption queryCounterOptions*
	)
	;

queryDcounter
	: (
	 queryOption dcounterOption queryDcounterOptions*
	)
	;

querySecurity
	: (
	 queryOption securityOption querySecurityOptions*
	)
	;

read
	: (
	 readOption readOptions*
	)
	;

readnext
	: (
	 readnextOption readnextOptions*
	)
	;

readprev
	: (
	 readprevOption readprevOptions*
	)
	;

readqTd
	: (
	 readqOption tdOption readqTdOptions*
	)
	;

readqTs
	: (
	 readqOption tsOption readqTsOptions*
	)
	;

receivezOSCommServer
	: (
	 receiveOption receivezOSCommServerOptions*
	)
	;

receiveNonzOSCommServer
	: (
	 receiveOption receiveNonzOSCommServerOptions*
	)
	;

receiveMap
	: (
	 receiveOption mapOption receiveMapOptions*
	)
	;

receiveMapMappingdev
	: (
	 receiveOption mapOption mappingdevOption receiveMapMappingdevOptions*
	)
	;

receivePartn
	: (
	 receiveOption partnOption receivePartnOptions*
	)
	;

release
	: (
	 releaseOption releaseOptions*
	)
	;

removeSubevent
	: (
	 removeOption subeventOption removeSubeventOptions*
	)
	;

requestEncryptptkt
	: (
	 requestOption encryptptktOption requestEncryptptktOptions*
	)
	;

requestPassticket
	: (
	 requestOption passticketOption requestPassticketOptions*
	)
	;

resetAcqprocess
	: (
	 resetOption acqprocessOption resetAcqprocessOptions*
	)
	;

resetActivity
	: (
	 resetOption activityOption resetActivityOptions*
	)
	;

resetbr
	: (
	 resetbrOption resetbrOptions*
	)
	;

resume
	: (
	 resumeOption resumeOptions*
	)
	;

retrieve
	: (
	 retrieveOption retrieveOptions*
	)
	;

retrieveReattach
	: (
	 retrieveOption reattachOption retrieveReattachOptions*
	)
	;

retrieveSubevent
	: (
	 retrieveOption subeventOption retrieveSubeventOptions*
	)
	;

return
	: (
	 returnOption returnOptions*
	)
	;

rewindCounter
	: (
	 rewindOption counterOption rewindCounterOptions*
	)
	;

rewindDcounter
	: (
	 rewindOption dcounterOption rewindDcounterOptions*
	)
	;

rewrite
	: (
	 rewriteOption rewriteOptions*
	)
	;

route
	: (
	 routeOption routeOptions*
	)
	;

run
	: (
	 runOption runOptions*
	)
	;

runTransid
	: (
	 runOption transidOption runTransidOptions*
	)
	;

sendzOSCommServer
	: (
	 sendOption sendzOSCommServerOptions*
	)
	;

sendNonzOSCommServer
	: (
	 sendOption sendNonzOSCommServerOptions*
	)
	;

sendControl
	: (
	 sendOption controlOption sendControlOptions*
	)
	;

sendMap
	: (
	 sendOption mapOption sendMapOptions*
	)
	;

sendMapMappingdev
	: (
	 sendOption mapOption mappingdevOption sendMapMappingdevOptions*
	)
	;

sendPage
	: (
	 sendOption pageOption sendPageOptions*
	)
	;

sendPartnset
	: (
	 sendOption partnsetOption sendPartnsetOptions*
	)
	;

sendText
	: (
	 sendOption textOption sendTextOptions*
	)
	;

sendTextMapped
	: (
	 sendOption textOption mappedOption sendTextMappedOptions*
	)
	;

sendTextNoedit
	: (
	 sendOption textOption noeditOption sendTextNoeditOptions*
	)
	;

signalEvent
	: (
	 signalOption eventOption signalEventOptions*
	)
	;

signoff
	: (
	 signoffOption signoffOptions*
	)
	;

signon
	: (
	 signonOption signonOptions*
	)
	;

signonToken
	: (
	 signonOption tokenOption signonTokenOptions*
	)
	;

soapfaultAdd
	: (
	 soapfaultOption addOption soapfaultAddOptions*
	)
	;

soapfaultCreate
	: (
	 soapfaultOption createOption soapfaultCreateOptions*
	)
	;

soapfaultDelete
	: (
	 soapfaultOption deleteOption soapfaultDeleteOptions*
	)
	;

spoolclose
	: (
	 spoolcloseOption spoolcloseOptions*
	)
	;

spoolopenInput
	: (
	 spoolopenOption inputOption spoolopenInputOptions*
	)
	;

spoolopenOutput
	: (
	 spoolopenOption outputOption spoolopenOutputOptions*
	)
	;

spoolread
	: (
	 spoolreadOption spoolreadOptions*
	)
	;

spoolwrite
	: (
	 spoolwriteOption spoolwriteOptions*
	)
	;

spoolopenReport
	: (
	 spoolopenOption reportOption spoolopenReportOptions*
	)
	;

spoolwriteReport
	: (
	 spoolwriteOption reportOption spoolwriteReportOptions*
	)
	;

spoolcloseReport
	: (
	 spoolcloseOption reportOption spoolcloseReportOptions*
	)
	;

spoolopenResume
	: (
	 spoolopenOption resumeOption spoolopenResumeOptions*
	)
	;

start
	: (
	 startOption startOptions*
	)
	;

startAttach
	: (
	 startOption attachOption startAttachOptions*
	)
	;

startBrexit
	: (
	 startOption brexitOption startBrexitOptions*
	)
	;

startChannel
	: (
	 startOption channelOption startChannelOptions*
	)
	;

startbr
	: (
	 startbrOption startbrOptions*
	)
	;

startbrowseActivity
	: (
	 startbrowseOption activityOption startbrowseActivityOptions*
	)
	;

startbrowseContainerBTS
	: (
	 startbrowseOption containerOption startbrowseContainerBTSOptions*
	)
	;

startbrowseContainer
	: (
	 startbrowseOption containerOption startbrowseContainerOptions*
	)
	;

startbrowseEvent
	: (
	 startbrowseOption eventOption startbrowseEventOptions*
	)
	;

startbrowseProcess
	: (
	 startbrowseOption processOption startbrowseProcessOptions*
	)
	;

startbrowseTimer
	: (
	 startbrowseOption timerOption startbrowseTimerOptions*
	)
	;

suspend
	: (
	 suspendOption suspendOptions*
	)
	;

suspendBTS
	: (
	 suspendOption suspendBTSOptions*
	)
	;

syncpoint
	: (
	 syncpointOption syncpointOptions*
	)
	;

syncpointRollback
	: (
	 syncpointOption rollbackOption syncpointRollbackOptions*
	)
	;

testEvent
	: (
	 testOption eventOption testEventOptions*
	)
	;

transformDatatojson
	: (
	 transformOption datatojsonOption transformDatatojsonOptions*
	)
	;

transformDatatoxml
	: (
	 transformOption datatoxmlOption transformDatatoxmlOptions*
	)
	;

transformJsontodata
	: (
	 transformOption jsontodataOption transformJsontodataOptions*
	)
	;

transformXmltodata
	: (
	 transformOption xmltodataOption transformXmltodataOptions*
	)
	;

unlock
	: (
	 unlockOption unlockOptions*
	)
	;

updateCounter
	: (
	 updateOption counterOption updateCounterOptions*
	)
	;

updateDcounter
	: (
	 updateOption dcounterOption updateDcounterOptions*
	)
	;

verifyPassword
	: (
	 verifyOption passwordOption verifyPasswordOptions*
	)
	;

verifyPhrase
	: (
	 verifyOption phraseOption verifyPhraseOptions*
	)
	;

verifyToken
	: (
	 verifyOption tokenOption verifyTokenOptions*
	)
	;

waitConvid
	: (
	 waitOption convidOption waitConvidOptions*
	)
	;

waitEvent
	: (
	 waitOption eventOption waitEventOptions*
	)
	;

waitExternal
	: (
	 waitOption externalOption waitExternalOptions*
	)
	;

waitJournal
	: (
	 waitOption journalOption waitJournalOptions*
	)
	;

waitJournalname
	: (
	 waitOption journalnameOption waitJournalnameOptions*
	)
	;

waitJournalnum
	: (
	 waitOption journalnumOption waitJournalnumOptions*
	)
	;

waitSignal
	: (
	 waitOption signalOption waitSignalOptions*
	)
	;

waitTerminal
	: (
	 waitOption terminalOption waitTerminalOptions*
	)
	;

waitcics
	: (
	 waitcicsOption waitcicsOptions*
	)
	;

webClose
	: (
	 webOption closeOption webCloseOptions*
	)
	;

webConverse
	: (
	 webOption converseOption webConverseOptions*
	)
	;

webEndbrowseFormfield
	: (
	 webOption endbrowseOption formfieldOption webEndbrowseFormfieldOptions*
	)
	;

webEndbrowseHttpheader
	: (
	 webOption endbrowseOption httpheaderOption webEndbrowseHttpheaderOptions*
	)
	;

webEndbrowseQueryparm
	: (
	 webOption endbrowseOption queryparmOption webEndbrowseQueryparmOptions*
	)
	;

webExtractServer
	: (
	 webOption extractOption webExtractServerOptions*
	)
	;

webExtractClient
	: (
	 webOption extractOption webExtractClientOptions*
	)
	;

webOpen
	: (
	 webOption openOption webOpenOptions*
	)
	;

webParse
	: (
	 webOption parseOption webParseOptions*
	)
	;

webReadFormfield
	: (
	 webOption readOption formfieldOption webReadFormfieldOptions*
	)
	;

webReadHttpheader
	: (
	 webOption readOption httpheaderOption webReadHttpheaderOptions*
	)
	;

webReadQueryparm
	: (
	 webOption readOption queryparmOption webReadQueryparmOptions*
	)
	;

webReadnextFormfield
	: (
	 webOption readnextOption formfieldOption webReadnextFormfieldOptions*
	)
	;

webReadnextHttpheader
	: (
	 webOption readnextOption httpheaderOption webReadnextHttpheaderOptions*
	)
	;

webReadnextQueryparm
	: (
	 webOption readnextOption queryparmOption webReadnextQueryparmOptions*
	)
	;

webReceiveServerWithBuffer
	: (
	 webOption receiveOption webReceiveServerWithBufferOptions*
	)
	;

webReceiveServerWithContainer
	: (
	 webOption receiveOption webReceiveServerWithContainerOptions*
	)
	;

webReceiveClientWithBuffer
	: (
	 webOption receiveOption webReceiveClientWithBufferOptions*
	)
	;

webReceiveClientWithContainer
	: (
	 webOption receiveOption webReceiveClientWithContainerOptions*
	)
	;

webRetrieve
	: (
	 webOption retrieveOption webRetrieveOptions*
	)
	;

webSendServer
	: (
	 webOption sendOption webSendServerOptions*
	)
	;

webSendClient
	: (
	 webOption sendOption webSendClientOptions*
	)
	;

webStartbrowseFormfield
	: (
	 webOption startbrowseOption formfieldOption webStartbrowseFormfieldOptions*
	)
	;

webStartbrowseHttpheader
	: (
	 webOption startbrowseOption httpheaderOption webStartbrowseHttpheaderOptions*
	)
	;

webStartbrowseQueryparm
	: (
	 webOption startbrowseOption queryparmOption webStartbrowseQueryparmOptions*
	)
	;

webWriteHttpheader
	: (
	 webOption writeOption httpheaderOption webWriteHttpheaderOptions*
	)
	;

write
	: (
	 writeOption writeOptions*
	)
	;

writeJournalname
	: (
	 writeOption journalnameOption writeJournalnameOptions*
	)
	;

writeJournalnum
	: (
	 writeOption journalnumOption writeJournalnumOptions*
	)
	;

writeOperator
	: (
	 writeOption operatorOption writeOperatorOptions*
	)
	;

writeqTd
	: (
	 writeqOption tdOption writeqTdOptions*
	)
	;

writeqTs
	: (
	 writeqOption tsOption writeqTsOptions*
	)
	;

wsacontextBuild
	: (
	 wsacontextOption buildOption wsacontextBuildOptions*
	)
	;

wsacontextDelete
	: (
	 wsacontextOption deleteOption wsacontextDeleteOptions*
	)
	;

wsacontextGet
	: (
	 wsacontextOption getOption wsacontextGetOptions*
	)
	;

wsaeprCreate
	: (
	 wsaeprOption createOption wsaeprCreateOptions*
	)
	;

xctl
	: (
	 xctlOption xctlOptions*
	)
	;

acquireTerminal
	: (
	 acquireOption terminalOption acquireTerminalOptions*
	)
	;

collectStatistics
	: (
	 collectOption statisticsOption collectStatisticsOptions*
	)
	;

createAtomservice
	: (
	 createOption atomserviceOption createAtomserviceOptions*
	)
	;

createBundle
	: (
	 createOption bundleOption createBundleOptions*
	)
	;

createConnection
	: (
	 createOption connectionOption createConnectionOptions*
	)
	;

createDb2conn
	: (
	 createOption db2connOption createDb2connOptions*
	)
	;

createDb2entry
	: (
	 createOption db2entryOption createDb2entryOptions*
	)
	;

createDb2tran
	: (
	 createOption db2tranOption createDb2tranOptions*
	)
	;

createDoctemplate
	: (
	 createOption doctemplateOption createDoctemplateOptions*
	)
	;

createDumpcode
	: (
	 createOption dumpcodeOption createDumpcodeOptions*
	)
	;

createEnqmodel
	: (
	 createOption enqmodelOption createEnqmodelOptions*
	)
	;

createFile
	: (
	 createOption fileOption createFileOptions*
	)
	;

createIpconn
	: (
	 createOption ipconnOption createIpconnOptions*
	)
	;

createJournalmodel
	: (
	 createOption journalmodelOption createJournalmodelOptions*
	)
	;

createJvmserver
	: (
	 createOption jvmserverOption createJvmserverOptions*
	)
	;

createLibrary
	: (
	 createOption libraryOption createLibraryOptions*
	)
	;

createLsrpool
	: (
	 createOption lsrpoolOption createLsrpoolOptions*
	)
	;

createMapset
	: (
	 createOption mapsetOption createMapsetOptions*
	)
	;

createMqconn
	: (
	 createOption mqconnOption createMqconnOptions*
	)
	;

createMqmonitor
	: (
	 createOption mqmonitorOption createMqmonitorOptions*
	)
	;

createPartitionset
	: (
	 createOption partitionsetOption createPartitionsetOptions*
	)
	;

createPartner
	: (
	 createOption partnerOption createPartnerOptions*
	)
	;

createPipeline
	: (
	 createOption pipelineOption createPipelineOptions*
	)
	;

createProcesstype
	: (
	 createOption processtypeOption createProcesstypeOptions*
	)
	;

createProfile
	: (
	 createOption profileOption createProfileOptions*
	)
	;

createProgram
	: (
	 createOption programOption createProgramOptions*
	)
	;

createSessions
	: (
	 createOption sessionsOption createSessionsOptions*
	)
	;

createTcpipservice
	: (
	 createOption tcpipserviceOption createTcpipserviceOptions*
	)
	;

createTdqueue
	: (
	 createOption tdqueueOption createTdqueueOptions*
	)
	;

createTerminal
	: (
	 createOption terminalOption createTerminalOptions*
	)
	;

createTranclass
	: (
	 createOption tranclassOption createTranclassOptions*
	)
	;

createTransaction
	: (
	 createOption transactionOption createTransactionOptions*
	)
	;

createTsmodel
	: (
	 createOption tsmodelOption createTsmodelOptions*
	)
	;

createTypeterm
	: (
	 createOption typetermOption createTypetermOptions*
	)
	;

createUrimap
	: (
	 createOption urimapOption createUrimapOptions*
	)
	;

createWebservice
	: (
	 createOption webserviceOption createWebserviceOptions*
	)
	;

csdAdd
	: (
	 csdOption addOption csdAddOptions*
	)
	;

csdAlter
	: (
	 csdOption alterOption csdAlterOptions*
	)
	;

csdAppend
	: (
	 csdOption appendOption csdAppendOptions*
	)
	;

csdCopy
	: (
	 csdOption copyOption csdCopyOptions*
	)
	;

csdDefine
	: (
	 csdOption defineOption csdDefineOptions*
	)
	;

csdDelete
	: (
	 csdOption deleteOption csdDeleteOptions*
	)
	;

csdDisconnect
	: (
	 csdOption disconnectOption csdDisconnectOptions*
	)
	;

csdEndbrgroup
	: (
	 csdOption endbrgroupOption csdEndbrgroupOptions*
	)
	;

csdEndbrlist
	: (
	 csdOption endbrlistOption csdEndbrlistOptions*
	)
	;

csdEndbrrsrce
	: (
	 csdOption endbrrsrceOption csdEndbrrsrceOptions*
	)
	;

csdGetnextgroup
	: (
	 csdOption getnextgroupOption csdGetnextgroupOptions*
	)
	;

csdGetnextlist
	: (
	 csdOption getnextlistOption csdGetnextlistOptions*
	)
	;

csdGetnextrsrce
	: (
	 csdOption getnextrsrceOption csdGetnextrsrceOptions*
	)
	;

csdInquiregroup
	: (
	 csdOption inquiregroupOption csdInquiregroupOptions*
	)
	;

csdInquirelist
	: (
	 csdOption inquirelistOption csdInquirelistOptions*
	)
	;

csdInquirersrce
	: (
	 csdOption inquirersrceOption csdInquirersrceOptions*
	)
	;

csdInstallList
	: (
	 csdOption installOption csdInstallListOptions*
	)
	;

csdInstallResourceOrGroup
	: (
	 csdOption installOption csdInstallResourceOrGroupOptions*
	)
	;

csdLock
	: (
	 csdOption lockOption csdLockOptions*
	)
	;

csdRemove
	: (
	 csdOption removeOption csdRemoveOptions*
	)
	;

csdRename
	: (
	 csdOption renameOption csdRenameOptions*
	)
	;

csdStartbrgroup
	: (
	 csdOption startbrgroupOption csdStartbrgroupOptions*
	)
	;

csdStartbrlist
	: (
	 csdOption startbrlistOption csdStartbrlistOptions*
	)
	;

csdStartbrrsrce
	: (
	 csdOption startbrrsrceOption csdStartbrrsrceOptions*
	)
	;

csdUnlock
	: (
	 csdOption unlockOption csdUnlockOptions*
	)
	;

csdUserdefine
	: (
	 csdOption userdefineOption csdUserdefineOptions*
	)
	;

disableProgram
	: (
	 disableOption programOption disableProgramOptions*
	)
	;

discardAtomservice
	: (
	 discardOption atomserviceOption discardAtomserviceOptions*
	)
	;

discardAutinstmodel
	: (
	 discardOption autinstmodelOption discardAutinstmodelOptions*
	)
	;

discardBundle
	: (
	 discardOption bundleOption discardBundleOptions*
	)
	;

discardConnection
	: (
	 discardOption connectionOption discardConnectionOptions*
	)
	;

discardDb2conn
	: (
	 discardOption db2connOption discardDb2connOptions*
	)
	;

discardDb2entry
	: (
	 discardOption db2entryOption discardDb2entryOptions*
	)
	;

discardDb2tran
	: (
	 discardOption db2tranOption discardDb2tranOptions*
	)
	;

discardDoctemplate
	: (
	 discardOption doctemplateOption discardDoctemplateOptions*
	)
	;

discardEnqmodel
	: (
	 discardOption enqmodelOption discardEnqmodelOptions*
	)
	;

discardFile
	: (
	 discardOption fileOption discardFileOptions*
	)
	;

discardIpconn
	: (
	 discardOption ipconnOption discardIpconnOptions*
	)
	;

discardJournalmodel
	: (
	 discardOption journalmodelOption discardJournalmodelOptions*
	)
	;

discardJournalname
	: (
	 discardOption journalnameOption discardJournalnameOptions*
	)
	;

discardJvmserver
	: (
	 discardOption jvmserverOption discardJvmserverOptions*
	)
	;

discardLibrary
	: (
	 discardOption libraryOption discardLibraryOptions*
	)
	;

discardMqconn
	: (
	 discardOption mqconnOption discardMqconnOptions*
	)
	;

discardMqmonitor
	: (
	 discardOption mqmonitorOption discardMqmonitorOptions*
	)
	;

discardPartner
	: (
	 discardOption partnerOption discardPartnerOptions*
	)
	;

discardPipeline
	: (
	 discardOption pipelineOption discardPipelineOptions*
	)
	;

discardProcesstype
	: (
	 discardOption processtypeOption discardProcesstypeOptions*
	)
	;

discardProfile
	: (
	 discardOption profileOption discardProfileOptions*
	)
	;

discardProgram
	: (
	 discardOption programOption discardProgramOptions*
	)
	;

discardTcpipservice
	: (
	 discardOption tcpipserviceOption discardTcpipserviceOptions*
	)
	;

discardTdqueue
	: (
	 discardOption tdqueueOption discardTdqueueOptions*
	)
	;

discardTerminal
	: (
	 discardOption terminalOption discardTerminalOptions*
	)
	;

discardTranclass
	: (
	 discardOption tranclassOption discardTranclassOptions*
	)
	;

discardTransaction
	: (
	 discardOption transactionOption discardTransactionOptions*
	)
	;

discardTsmodel
	: (
	 discardOption tsmodelOption discardTsmodelOptions*
	)
	;

discardUrimap
	: (
	 discardOption urimapOption discardUrimapOptions*
	)
	;

discardWebservice
	: (
	 discardOption webserviceOption discardWebserviceOptions*
	)
	;

enableProgram
	: (
	 enableOption programOption enableProgramOptions*
	)
	;

extractExit
	: (
	 extractOption exitOption extractExitOptions*
	)
	;

extractStatistics
	: (
	 extractOption statisticsOption extractStatisticsOptions*
	)
	;

inquireAssociation
	: (
	 inquireOption associationOption inquireAssociationOptions*
	)
	;

inquireAssociationList
	: (
	 inquireOption associationOption listOption inquireAssociationListOptions*
	)
	;

inquireAtomservice
	: (
	 inquireOption atomserviceOption inquireAtomserviceOptions*
	)
	;

inquireAutinstmodel
	: (
	 inquireOption autinstmodelOption inquireAutinstmodelOptions*
	)
	;

inquireAutoinstall
	: (
	 inquireOption autoinstallOption inquireAutoinstallOptions*
	)
	;

inquireBrfacility
	: (
	 inquireOption brfacilityOption inquireBrfacilityOptions*
	)
	;

inquireBundle
	: (
	 inquireOption bundleOption inquireBundleOptions*
	)
	;

inquireBundlepart
	: (
	 inquireOption bundlepartOption inquireBundlepartOptions*
	)
	;

inquireCapdatapred
	: (
	 inquireOption capdatapredOption inquireCapdatapredOptions*
	)
	;

inquireCapinfosrce
	: (
	 inquireOption capinfosrceOption inquireCapinfosrceOptions*
	)
	;

inquireCapoptpred
	: (
	 inquireOption capoptpredOption inquireCapoptpredOptions*
	)
	;

inquireCapturespec
	: (
	 inquireOption capturespecOption inquireCapturespecOptions*
	)
	;

inquireConnection
	: (
	 inquireOption connectionOption inquireConnectionOptions*
	)
	;

inquireCfdtpool
	: (
	 inquireOption cfdtpoolOption inquireCfdtpoolOptions*
	)
	;

inquireDb2conn
	: (
	 inquireOption db2connOption inquireDb2connOptions*
	)
	;

inquireDb2entry
	: (
	 inquireOption db2entryOption inquireDb2entryOptions*
	)
	;

inquireDb2tran
	: (
	 inquireOption db2tranOption inquireDb2tranOptions*
	)
	;

inquireDeletshipped
	: (
	 inquireOption deletshippedOption inquireDeletshippedOptions*
	)
	;

inquireDispatcher
	: (
	 inquireOption dispatcherOption inquireDispatcherOptions*
	)
	;

inquireDoctemplate
	: (
	 inquireOption doctemplateOption inquireDoctemplateOptions*
	)
	;

inquireDsname
	: (
	 inquireOption dsnameOption inquireDsnameOptions*
	)
	;

inquireDumpds
	: (
	 inquireOption dumpdsOption inquireDumpdsOptions*
	)
	;

inquireEnq
	: (
	 inquireOption enqOption inquireEnqOptions*
	)
	;

inquireEnqmodel
	: (
	 inquireOption enqmodelOption inquireEnqmodelOptions*
	)
	;

inquireEpadapter
	: (
	 inquireOption epadapterOption inquireEpadapterOptions*
	)
	;

inquireEpadapterset
	: (
	 inquireOption epadaptersetOption inquireEpadaptersetOptions*
	)
	;

inquireEpadaptinset
	: (
	 inquireOption epadaptinsetOption inquireEpadaptinsetOptions*
	)
	;

inquireEventbinding
	: (
	 inquireOption eventbindingOption inquireEventbindingOptions*
	)
	;

inquireEventprocess
	: (
	 inquireOption eventprocessOption inquireEventprocessOptions*
	)
	;

inquireExci
	: (
	 inquireOption exciOption inquireExciOptions*
	)
	;

inquireExitprogram
	: (
	 inquireOption exitprogramOption inquireExitprogramOptions*
	)
	;

inquireFeaturekey
	: (
	 inquireOption featurekeyOption inquireFeaturekeyOptions*
	)
	;

inquireFile
	: (
	 inquireOption fileOption inquireFileOptions*
	)
	;

inquireHost
	: (
	 inquireOption hostOption inquireHostOptions*
	)
	;

inquireIpconn
	: (
	 inquireOption ipconnOption inquireIpconnOptions*
	)
	;

inquireIpfacility
	: (
	 inquireOption ipfacilityOption inquireIpfacilityOptions*
	)
	;

inquireIrc
	: (
	 inquireOption ircOption inquireIrcOptions*
	)
	;

inquireJournalmodel
	: (
	 inquireOption journalmodelOption inquireJournalmodelOptions*
	)
	;

inquireJournalname
	: (
	 inquireOption journalnameOption inquireJournalnameOptions*
	)
	;

inquireJournalnum
	: (
	 inquireOption journalnumOption inquireJournalnumOptions*
	)
	;

inquireJvmendpoint
	: (
	 inquireOption jvmendpointOption inquireJvmendpointOptions*
	)
	;

inquireJvmserver
	: (
	 inquireOption jvmserverOption inquireJvmserverOptions*
	)
	;

inquireLibrary
	: (
	 inquireOption libraryOption inquireLibraryOptions*
	)
	;

inquireModename
	: (
	 inquireOption modenameOption inquireModenameOptions*
	)
	;

inquireMonitor
	: (
	 inquireOption monitorOption inquireMonitorOptions*
	)
	;

inquireMqconn
	: (
	 inquireOption mqconnOption inquireMqconnOptions*
	)
	;

inquireMqini
	: (
	 inquireOption mqiniOption inquireMqiniOptions*
	)
	;

inquireMqmonitor
	: (
	 inquireOption mqmonitorOption inquireMqmonitorOptions*
	)
	;

inquireMvstcb
	: (
	 inquireOption mvstcbOption inquireMvstcbOptions*
	)
	;

inquireNetname
	: (
	 inquireOption netnameOption inquireNetnameOptions*
	)
	;

inquireNodejsapp
	: (
	 inquireOption nodejsappOption inquireNodejsappOptions*
	)
	;

inquireOsgibundle
	: (
	 inquireOption osgibundleOption inquireOsgibundleOptions*
	)
	;

inquireOsgiservice
	: (
	 inquireOption osgiserviceOption inquireOsgiserviceOptions*
	)
	;

inquirePartner
	: (
	 inquireOption partnerOption inquirePartnerOptions*
	)
	;

inquirePipeline
	: (
	 inquireOption pipelineOption inquirePipelineOptions*
	)
	;

inquirePolicy
	: (
	 inquireOption policyOption inquirePolicyOptions*
	)
	;

inquirePolicyrule
	: (
	 inquireOption policyruleOption inquirePolicyruleOptions*
	)
	;

inquireProcesstype
	: (
	 inquireOption processtypeOption inquireProcesstypeOptions*
	)
	;

inquireProfile
	: (
	 inquireOption profileOption inquireProfileOptions*
	)
	;

inquireProgram
	: (
	 inquireOption programOption inquireProgramOptions*
	)
	;

inquireReqid
	: (
	 inquireOption reqidOption inquireReqidOptions*
	)
	;

inquireRrms
	: (
	 inquireOption rrmsOption inquireRrmsOptions*
	)
	;

inquireSecrecording
	: (
	 inquireOption secrecordingOption inquireSecrecordingOptions*
	)
	;

inquireStatistics
	: (
	 inquireOption statisticsOption inquireStatisticsOptions*
	)
	;

inquireStorage
	: (
	 inquireOption storageOption inquireStorageOptions*
	)
	;

inquireStorage64
	: (
	 inquireOption storage64Option inquireStorage64Options*
	)
	;

inquireStreamname
	: (
	 inquireOption streamnameOption inquireStreamnameOptions*
	)
	;

inquireSubpool
	: (
	 inquireOption subpoolOption inquireSubpoolOptions*
	)
	;

inquireSysdumpcode
	: (
	 inquireOption sysdumpcodeOption inquireSysdumpcodeOptions*
	)
	;

inquireSystem
	: (
	 inquireOption systemOption inquireSystemOptions*
	)
	;

inquireTag
	: (
	 inquireOption tagOption inquireTagOptions*
	)
	;

inquireTask
	: (
	 inquireOption taskOption inquireTaskOptions*
	)
	;

inquireTaskList
	: (
	 inquireOption taskOption listOption inquireTaskListOptions*
	)
	;

inquireTclass
	: (
	 inquireOption tclassOption inquireTclassOptions*
	)
	;

inquireTcpip
	: (
	 inquireOption tcpipOption inquireTcpipOptions*
	)
	;

inquireTcpipservice
	: (
	 inquireOption tcpipserviceOption inquireTcpipserviceOptions*
	)
	;

inquireTdqueue
	: (
	 inquireOption tdqueueOption inquireTdqueueOptions*
	)
	;

inquireTempstorage
	: (
	 inquireOption tempstorageOption inquireTempstorageOptions*
	)
	;

inquireTerminal
	: (
	 inquireOption terminalOption inquireTerminalOptions*
	)
	;

inquireTracedest
	: (
	 inquireOption tracedestOption inquireTracedestOptions*
	)
	;

inquireTraceflag
	: (
	 inquireOption traceflagOption inquireTraceflagOptions*
	)
	;

inquireTracetype
	: (
	 inquireOption tracetypeOption inquireTracetypeOptions*
	)
	;

inquireTranclass
	: (
	 inquireOption tranclassOption inquireTranclassOptions*
	)
	;

inquireTrandumpcode
	: (
	 inquireOption trandumpcodeOption inquireTrandumpcodeOptions*
	)
	;

inquireTransaction
	: (
	 inquireOption transactionOption inquireTransactionOptions*
	)
	;

inquireTsmodel
	: (
	 inquireOption tsmodelOption inquireTsmodelOptions*
	)
	;

inquireTspool
	: (
	 inquireOption tspoolOption inquireTspoolOptions*
	)
	;

inquireTsqueue
	: (
	 inquireOption tsqueueOption inquireTsqueueOptions*
	)
	;

inquireTsqname
	: (
	 inquireOption tsqnameOption inquireTsqnameOptions*
	)
	;

inquireUow
	: (
	 inquireOption uowOption inquireUowOptions*
	)
	;

inquireUowdsnfail
	: (
	 inquireOption uowdsnfailOption inquireUowdsnfailOptions*
	)
	;

inquireUowenq
	: (
	 inquireOption uowenqOption inquireUowenqOptions*
	)
	;

inquireUowlink
	: (
	 inquireOption uowlinkOption inquireUowlinkOptions*
	)
	;

inquireUrimap
	: (
	 inquireOption urimapOption inquireUrimapOptions*
	)
	;

inquireVtam
	: (
	 inquireOption vtamOption inquireVtamOptions*
	)
	;

inquireWeb
	: (
	 inquireOption webOption inquireWebOptions*
	)
	;

inquireWebservice
	: (
	 inquireOption webserviceOption inquireWebserviceOptions*
	)
	;

inquireWlmhealth
	: (
	 inquireOption wlmhealthOption inquireWlmhealthOptions*
	)
	;

inquireWorkrequest
	: (
	 inquireOption workrequestOption inquireWorkrequestOptions*
	)
	;

inquireXmltransform
	: (
	 inquireOption xmltransformOption inquireXmltransformOptions*
	)
	;

performDeletshipped
	: (
	 performOption deletshippedOption performDeletshippedOptions*
	)
	;

performDump
	: (
	 performOption dumpOption performDumpOptions*
	)
	;

performEndaffinity
	: (
	 performOption endaffinityOption performEndaffinityOptions*
	)
	;

performJvmserver
	: (
	 performOption jvmserverOption performJvmserverOptions*
	)
	;

performPipeline
	: (
	 performOption pipelineOption performPipelineOptions*
	)
	;

performResettime
	: (
	 performOption resettimeOption performResettimeOptions*
	)
	;

performSecurityRebuild
	: (
	 performOption securityOption rebuildOption performSecurityRebuildOptions*
	)
	;

performShutdown
	: (
	 performOption shutdownOption performShutdownOptions*
	)
	;

performShutdownImmediate
	: (
	 performOption shutdownOption immediateOption performShutdownImmediateOptions*
	)
	;

performShutdownTakeover
	: (
	 performOption shutdownOption takeoverOption performShutdownTakeoverOptions*
	)
	;

performSslRebuild
	: (
	 performOption sslOption rebuildOption performSslRebuildOptions*
	)
	;

performStatisticsRecord
	: (
	 performOption statisticsOption recordOption performStatisticsRecordOptions*
	)
	;

resyncEntryname
	: (
	 resyncOption entrynameOption resyncEntrynameOptions*
	)
	;

setAssociationUsercorrdata
	: (
	 setOption associationOption usercorrdataOption setAssociationUsercorrdataOptions*
	)
	;

setAtomservice
	: (
	 setOption atomserviceOption setAtomserviceOptions*
	)
	;

setAutoinstall
	: (
	 setOption autoinstallOption setAutoinstallOptions*
	)
	;

setBrfacility
	: (
	 setOption brfacilityOption setBrfacilityOptions*
	)
	;

setBundle
	: (
	 setOption bundleOption setBundleOptions*
	)
	;

setConnection
	: (
	 setOption connectionOption setConnectionOptions*
	)
	;

setDb2conn
	: (
	 setOption db2connOption setDb2connOptions*
	)
	;

setDb2entry
	: (
	 setOption db2entryOption setDb2entryOptions*
	)
	;

setDb2tran
	: (
	 setOption db2tranOption setDb2tranOptions*
	)
	;

setDeletshipped
	: (
	 setOption deletshippedOption setDeletshippedOptions*
	)
	;

setDispatcher
	: (
	 setOption dispatcherOption setDispatcherOptions*
	)
	;

setDoctemplate
	: (
	 setOption doctemplateOption setDoctemplateOptions*
	)
	;

setDsname
	: (
	 setOption dsnameOption setDsnameOptions*
	)
	;

setDumpds
	: (
	 setOption dumpdsOption setDumpdsOptions*
	)
	;

setEnqmodel
	: (
	 setOption enqmodelOption setEnqmodelOptions*
	)
	;

setEpadapter
	: (
	 setOption epadapterOption setEpadapterOptions*
	)
	;

setEpadapterset
	: (
	 setOption epadaptersetOption setEpadaptersetOptions*
	)
	;

setEventbinding
	: (
	 setOption eventbindingOption setEventbindingOptions*
	)
	;

setEventprocess
	: (
	 setOption eventprocessOption setEventprocessOptions*
	)
	;

setFile
	: (
	 setOption fileOption setFileOptions*
	)
	;

setDataset
	: (
	 setOption datasetOption setDatasetOptions*
	)
	;

setHost
	: (
	 setOption hostOption setHostOptions*
	)
	;

setIpconn
	: (
	 setOption ipconnOption setIpconnOptions*
	)
	;

setIrc
	: (
	 setOption ircOption setIrcOptions*
	)
	;

setJournalname
	: (
	 setOption journalnameOption setJournalnameOptions*
	)
	;

setJournalnum
	: (
	 setOption journalnumOption setJournalnumOptions*
	)
	;

setJvmendpoint
	: (
	 setOption jvmendpointOption setJvmendpointOptions*
	)
	;

setJvmserver
	: (
	 setOption jvmserverOption setJvmserverOptions*
	)
	;

setLibrary
	: (
	 setOption libraryOption setLibraryOptions*
	)
	;

setModename
	: (
	 setOption modenameOption setModenameOptions*
	)
	;

setMonitor
	: (
	 setOption monitorOption setMonitorOptions*
	)
	;

setMqconn
	: (
	 setOption mqconnOption setMqconnOptions*
	)
	;

setMqmonitor
	: (
	 setOption mqmonitorOption setMqmonitorOptions*
	)
	;

setNetname
	: (
	 setOption netnameOption setNetnameOptions*
	)
	;

setPipeline
	: (
	 setOption pipelineOption setPipelineOptions*
	)
	;

setProcesstype
	: (
	 setOption processtypeOption setProcesstypeOptions*
	)
	;

setProgram
	: (
	 setOption programOption setProgramOptions*
	)
	;

setSecrecording
	: (
	 setOption secrecordingOption setSecrecordingOptions*
	)
	;

setStatistics
	: (
	 setOption statisticsOption setStatisticsOptions*
	)
	;

setSysdumpcode
	: (
	 setOption sysdumpcodeOption setSysdumpcodeOptions*
	)
	;

setSystem
	: (
	 setOption systemOption setSystemOptions*
	)
	;

setTagsRefresh
	: (
	 setOption tagsOption refreshOption setTagsRefreshOptions*
	)
	;

setTask
	: (
	 setOption taskOption setTaskOptions*
	)
	;

setTclass
	: (
	 setOption tclassOption setTclassOptions*
	)
	;

setTcpip
	: (
	 setOption tcpipOption setTcpipOptions*
	)
	;

setTcpipservice
	: (
	 setOption tcpipserviceOption setTcpipserviceOptions*
	)
	;

setTdqueue
	: (
	 setOption tdqueueOption setTdqueueOptions*
	)
	;

setTempstorage
	: (
	 setOption tempstorageOption setTempstorageOptions*
	)
	;

setTerminal
	: (
	 setOption terminalOption setTerminalOptions*
	)
	;

setTracedest
	: (
	 setOption tracedestOption setTracedestOptions*
	)
	;

setTraceflag
	: (
	 setOption traceflagOption setTraceflagOptions*
	)
	;

setTracetype
	: (
	 setOption tracetypeOption setTracetypeOptions*
	)
	;

setTranclass
	: (
	 setOption tranclassOption setTranclassOptions*
	)
	;

setTrandumpcode
	: (
	 setOption trandumpcodeOption setTrandumpcodeOptions*
	)
	;

setTransaction
	: (
	 setOption transactionOption setTransactionOptions*
	)
	;

setTsqueue
	: (
	 setOption tsqueueOption setTsqueueOptions*
	)
	;

setTsqname
	: (
	 setOption tsqnameOption setTsqnameOptions*
	)
	;

setUow
	: (
	 setOption uowOption setUowOptions*
	)
	;

setUowlink
	: (
	 setOption uowlinkOption setUowlinkOptions*
	)
	;

setUrimap
	: (
	 setOption urimapOption setUrimapOptions*
	)
	;

setVtam
	: (
	 setOption vtamOption setVtamOptions*
	)
	;

setWeb
	: (
	 setOption webOption setWebOptions*
	)
	;

setWebservice
	: (
	 setOption webserviceOption setWebserviceOptions*
	)
	;

setWlmhealth
	: (
	 setOption wlmhealthOption setWlmhealthOptions*
	)
	;

setXmltransform
	: (
	 setOption xmltransformOption setXmltransformOptions*
	)
	;

// 569 rules generated Tue Apr  9 13:59:38 CDT 2024

abendOptions
	: (
	abcodeOption
	| cancelOption
	| nodumpOption
	| exceptionOptions
	)
	;

acquireOptions
	: (
	processOption
	| processtypeOption
	| activityidOption
	| exceptionOptions
	)
	;

addSubeventOptions
	: (
	eventOption
	| exceptionOptions
	)
	;

addressOptions
	: (
	aceeOption
	| eibOption
	| commareaOption
	| tctuaOption
	| cwaOption
	| twaOption
	| csaOption
	| exceptionOptions
	)
	;

addressSetOptions
	: (
	usingOption
	| exceptionOptions
	)
	;

allocateAPPCOptions
	: (
	sysidOption
	| profileOption
	| noqueueOption
	| partnerOption
	| stateOption
	| exceptionOptions
	)
	;

allocateLU61Options
	: (
	sessionOption
	| sysidOption
	| profileOption
	| noqueueOption
	| exceptionOptions
	)
	;

allocateMROOptions
	: (
	sysidOption
	| profileOption
	| noqueueOption
	| stateOption
	| exceptionOptions
	)
	;

asktimeOptions
	: (
	abstimeOption
	| exceptionOptions
	)
	;

assignOptions
	: (
	abcodeOption
	| abdumpOption
	| aboffsetOption
	| abprogramOption
	| activityOption
	| activityidOption
	| altscrnhtOption
	| altscrnwdOption
	| aplkybdOption
	| apltextOption
	| applicationOption
	| applidOption
	| asraintrptOption
	| asrakeyOption
	| asrapswOption
	| asrapsw16Option
	| asraregsOption
	| asraregs64Option
	| asraspcOption
	| asrastgOption
	| bridgeOption
	| btransOption
	| channelOption
	| cmdsecOption
	| colorOption
	| cwalengOption
	| defscrnhtOption
	| defscrnwdOption
	| delimiterOption
	| destcountOption
	| destidOption
	| destidlengOption
	| dsscsOption
	| ds3270Option
	| errormsgOption
	| errormsglenOption
	| ewasuppOption
	| extdsOption
	| facilityOption
	| fciOption
	| gcharsOption
	| gcodesOption
	| gmmiOption
	| gmexitoptOption
	| hilightOption
	| initparmOption
	| initparmlenOption
	| inpartnOption
	| inputmsglenOption
	| invokingprogOption
	| katakanaOption
	| langinuseOption
	| ldcmnemOption
	| ldcnumOption
	| linklevelOption
	| localccsidOption
	| majorversionOption
	| mapcolumnOption
	| mapheightOption
	| maplineOption
	| mapwidthOption
	| microversionOption
	| minorversionOption
	| msrcontrolOption
	| natlanginuseOption
	| netnameOption
	| nexttransidOption
	| numtabOption
	| opclassOption
	| operationOption
	| operkeysOption
	| opidOption
	| opsecurityOption
	| orgabcodeOption
	| outlineOption
	| pagenumOption
	| partnpageOption
	| partnsOption
	| partnsetOption
	| platformOption
	| prinsysidOption
	| processOption
	| processtypeOption
	| programOption
	| psOption
	| qnameOption
	| ressecOption
	| restartOption
	| returnprogOption
	| scrnhtOption
	| scrnwdOption
	| sigdataOption
	| sosiOption
	| startcodeOption
	| stationidOption
	| sysidOption
	| taskpriorityOption
	| tctualengOption
	| telleridOption
	| termcodeOption
	| termpriorityOption
	| textkybdOption
	| textprintOption
	| tnaddrOption
	| tnipfamilyOption
	| tnportOption
	| tranpriorityOption
	| twalengOption
	| unattendOption
	| useridOption
	| usernameOption
	| userpriorityOption
	| validationOption
	| exceptionOptions
	)
	;

bifDeeditOptions
	: (
	fieldOption
	| lengthOption
	| exceptionOptions
	)
	;

bifDigestOptions
	: (
	recordOption
	| recordlenOption
	| hexOption
	| binaryOption
	| base64Option
	| digesttypeOption
	| resultOption
	| exceptionOptions
	)
	;

buildAttachLU61Options
	: (
	attachidOption
	| processOption
	| rprocessOption
	| iutypeOption
	| rresourceOption
	| datastrOption
	| resourceOption
	| queueOption
	| recfmOption
	| exceptionOptions
	)
	;

buildAttachMROOptions
	: (
	attachidOption
	| processOption
	| rprocessOption
	| iutypeOption
	| rresourceOption
	| datastrOption
	| resourceOption
	| queueOption
	| recfmOption
	| exceptionOptions
	)
	;

cancelOptions
	: (
	reqidOption
	| sysidOption
	| transidOption
	| exceptionOptions
	)
	;

cancelBTSOptions
	: (
	activityOption
	| acqactivityOption
	| acqprocessOption
	| exceptionOptions
	)
	;

changePhraseOptions
	: (
	phraselenOption
	| newphraselenOption
	| newphraseOption
	| useridOption
	| esmreasonOption
	| esmrespOption
	| exceptionOptions
	)
	;

changePasswordOptions
	: (
	esmreasonOption
	| newpasswordOption
	| useridOption
	| esmrespOption
	| exceptionOptions
	)
	;

changeTaskOptions
	: (
	priorityOption
	| exceptionOptions
	)
	;

checkAcqprocessOptions
	: (
	compstatusOption
	| abcodeOption
	| abprogramOption
	| modeOption
	| suspstatusOption
	| exceptionOptions
	)
	;

checkActivityOptions
	: (
	compstatusOption
	| abcodeOption
	| acqactivityOption
	| abprogramOption
	| modeOption
	| suspstatusOption
	| exceptionOptions
	)
	;

checkTimerOptions
	: (
	statusOption
	| exceptionOptions
	)
	;

connectProcessOptions
	: (
	convidOption
	| sessionOption
	| procnameOption
	| proclengthOption
	| partnerOption
	| synclevelOption
	| piplistOption
	| piplengthOption
	| stateOption
	| exceptionOptions
	)
	;

conversezOSCommServerOptions
	: (
	alternateOption
	| asisOption
	| attachidOption
	| convidOption
	| ctlcharOption
	| defaultOption
	| defrespOption
	| eraseOption
	| fmhOption
	| fromOption
	| fromflengthOption
	| fromlengthOption
	| intoOption
	| ldcOption
	| maxflengthOption
	| maxlengthOption
	| notruncateOption
	| sessionOption
	| setOption
	| stateOption
	| strfieldOption
	| toflengthOption
	| tolengthOption
	| exceptionOptions
	)
	;

converseNonzOSCommServerOptions
	: (
	alternateOption
	| asisOption
	| attachidOption
	| convidOption
	| ctlcharOption
	| defaultOption
	| defrespOption
	| eraseOption
	| fmhOption
	| fromOption
	| fromflengthOption
	| fromlengthOption
	| intoOption
	| leavekbOption
	| lineaddrOption
	| maxflengthOption
	| maxlengthOption
	| notruncateOption
	| pseudobinOption
	| sessionOption
	| setOption
	| stateOption
	| strfieldOption
	| toflengthOption
	| tolengthOption
	| exceptionOptions
	)
	;

converttimeOptions
	: (
	datestringOption
	| abstimeOption
	| exceptionOptions
	)
	;

defineActivityOptions
	: (
	transidOption
	| eventOption
	| programOption
	| useridOption
	| activityidOption
	| exceptionOptions
	)
	;

defineCompositeEventOptions
	: (
	andOption
	| orOption
	| subevent1Option
	| subevent2Option
	| subevent3Option
	| subevent4Option
	| subevent5Option
	| subevent6Option
	| subevent7Option
	| subevent8Option
	| exceptionOptions
	)
	;

defineCounterOptions
	: (
	poolOption
	| valueOption
	| minimumOption
	| maximumOption
	| nosuspendOption
	| exceptionOptions
	)
	;

defineDcounterOptions
	: (
	poolOption
	| valueOption
	| maximumOption
	| minimumOption
	| nosuspendOption
	| exceptionOptions
	)
	;

defineInputEventOptions
	: (
	exceptionOptions
	)
	;

defineProcessOptions
	: (
	processtypeOption
	| programOption
	| useridOption
	| transidOption
	| nocheckOption
	| exceptionOptions
	)
	;

defineTimerOptions
	: (
	eventOption
	| afterOption
	| daysOption
	| hoursOption
	| minutesOption
	| secondsOption
	| atOption
	| hoursOption
	| onOption
	| minutesOption
	| secondsOption
	| yearOption
	| monthOption
	| dayofmonthOption
	| dayofyearOption
	| exceptionOptions
	)
	;

delayOptions
	: (
	intervalOption
	| reqidOption
	| timeOption
	| forOption
	| hoursOption
	| minutesOption
	| secondsOption
	| millisecsOption
	| untilOption
	| hoursOption
	| minutesOption
	| secondsOption
	| exceptionOptions
	)
	;

deleteOptions
	: (
	fileOption
	| datasetOption
	| tokenOption
	| ridfldOption
	| keylengthOption
	| genericOption
	| numrecOption
	| sysidOption
	| nosuspendOption
	| rbaOption
	| rrnOption
	| exceptionOptions
	)
	;

deleteActivityOptions
	: (
	exceptionOptions
	)
	;

deleteChannelOptions
	: (
	exceptionOptions
	)
	;

deleteContainerBTSOptions
	: (
	activityOption
	| acqactivityOption
	| processOption
	| acqprocessOption
	| exceptionOptions
	)
	;

deleteContainerOptions
	: (
	channelOption
	| exceptionOptions
	)
	;

deleteCounterOptions
	: (
	poolOption
	| nosuspendOption
	| exceptionOptions
	)
	;

deleteDcounterOptions
	: (
	poolOption
	| nosuspendOption
	| exceptionOptions
	)
	;

deleteEventOptions
	: (
	exceptionOptions
	)
	;

deleteTimerOptions
	: (
	exceptionOptions
	)
	;

deleteqTdOptions
	: (
	queueOption
	| sysidOption
	| exceptionOptions
	)
	;

deleteqTsOptions
	: (
	queueOption
	| qnameOption
	| sysidOption
	| exceptionOptions
	)
	;

deqOptions
	: (
	resourceOption
	| lengthOption
	| uowOption
	| maxlifetimeOption
	| taskOption
	| exceptionOptions
	)
	;

documentCreateOptions
	: (
	doctokenOption
	| fromOption
	| lengthOption
	| textOption
	| binaryOption
	| fromdocOption
	| templateOption
	| symbollistOption
	| listlengthOption
	| delimiterOption
	| docsizeOption
	| unescapedOption
	| hostcodepageOption
	| exceptionOptions
	)
	;

documentDeleteOptions
	: (
	doctokenOption
	| exceptionOptions
	)
	;

documentInsertOptions
	: (
	doctokenOption
	| textOption
	| lengthOption
	| docsizeOption
	| binaryOption
	| fromOption
	| symbolOption
	| templateOption
	| fromdocOption
	| bookmarkOption
	| hostcodepageOption
	| atOption
	| toOption
	| exceptionOptions
	)
	;

documentRetrieveOptions
	: (
	doctokenOption
	| maxlengthOption
	| intoOption
	| charactersetOption
	| lengthOption
	| dataonlyOption
	| exceptionOptions
	)
	;

documentSetOptions
	: (
	doctokenOption
	| symbolOption
	| valueOption
	| lengthOption
	| symbollistOption
	| delimiterOption
	| unescapedOption
	| exceptionOptions
	)
	;

dumpOptions
	: (
	dumpcodeOption
	| fromOption
	| lengthOption
	| flengthOption
	| completeOption
	| taskOption
	| storageOption
	| programOption
	| terminalOption
	| tablesOption
	| dctOption
	| fctOption
	| pctOption
	| pptOption
	| sitOption
	| tctOption
	| exceptionOptions
	)
	;

dumpTransactionOptions
	: (
	dumpcodeOption
	| fromOption
	| lengthOption
	| completeOption
	| flengthOption
	| trtOption
	| segmentlistOption
	| taskOption
	| storageOption
	| tablesOption
	| fctOption
	| lengthlistOption
	| terminalOption
	| programOption
	| pctOption
	| numsegmentsOption
	| pptOption
	| sitOption
	| tctOption
	| dumpidOption
	| exceptionOptions
	)
	;

endbrOptions
	: (
	fileOption
	| datasetOption
	| reqidOption
	| sysidOption
	| exceptionOptions
	)
	;

endbrowseActivityOptions
	: (
	browsetokenOption
	| exceptionOptions
	)
	;

endbrowseOptions
	: (
	containerOption
	| browsetokenOption
	| exceptionOptions
	)
	;

endbrowseEventOptions
	: (
	browsetokenOption
	| exceptionOptions
	)
	;

endbrowseProcessOptions
	: (
	browsetokenOption
	| exceptionOptions
	)
	;

endbrowseTimerOptions
	: (
	browsetokenOption
	| exceptionOptions
	)
	;

enqOptions
	: (
	resourceOption
	| lengthOption
	| uowOption
	| maxlifetimeOption
	| taskOption
	| nosuspendOption
	| exceptionOptions
	)
	;

enterTraceidOptions
	: (
	fromOption
	| resourceOption
	| entrynameOption
	| accountOption
	| monitorOption
	| performOption
	| exceptionOptions
	)
	;

enterTracenumOptions
	: (
	fromOption
	| fromlengthOption
	| resourceOption
	| exceptionOption
	| exceptionOptions
	)
	;

extractAttachLU61Options
	: (
	processOption
	| attachidOption
	| convidOption
	| sessionOption
	| resourceOption
	| rprocessOption
	| rresourceOption
	| queueOption
	| datastrOption
	| iutypeOption
	| recfmOption
	| exceptionOptions
	)
	;

extractAttachMROOptions
	: (
	processOption
	| attachidOption
	| convidOption
	| sessionOption
	| resourceOption
	| rprocessOption
	| rresourceOption
	| queueOption
	| datastrOption
	| iutypeOption
	| recfmOption
	| exceptionOptions
	)
	;

extractAttributesAPPCOptions
	: (
	convidOption
	| stateOption
	| exceptionOptions
	)
	;

extractAttributesMROOptions
	: (
	convidOption
	| sessionOption
	| stateOption
	| exceptionOptions
	)
	;

extractCertificateOptions
	: (
	lengthOption
	| serialnumOption
	| ownerOption
	| serialnumlenOption
	| commonnameOption
	| countryOption
	| statelenOption
	| useridOption
	| issuerOption
	| commonnamlenOption
	| countrylenOption
	| stateOption
	| localityOption
	| localitylenOption
	| organizationOption
	| organizatlenOption
	| orgunitOption
	| orgunitlenOption
	| exceptionOptions
	)
	;

extractLogonmsgOptions
	: (
	intoOption
	| lengthOption
	| setOption
	| exceptionOptions
	)
	;

extractProcessOptions
	: (
	procnameOption
	| proclengthOption
	| maxproclenOption
	| convidOption
	| piplistOption
	| synclevelOption
	| piplengthOption
	| exceptionOptions
	)
	;

extractTcpipOptions
	: (
	authenticateOption
	| clientnameOption
	| cnamelengthOption
	| servernameOption
	| snamelengthOption
	| clientaddrOption
	| caddrlengthOption
	| clntipfamilyOption
	| clientaddrnuOption
	| clntaddr6nuOption
	| serveraddrOption
	| srvripfamilyOption
	| saddrlengthOption
	| serveraddrnuOption
	| srvraddr6nuOption
	| ssltypeOption
	| tcpipserviceOption
	| portnumberOption
	| portnumnuOption
	| privacyOption
	| maxdatalenOption
	| exceptionOptions
	)
	;

extractTctOptions
	: (
	netnameOption
	| sysidOption
	| termidOption
	| exceptionOptions
	)
	;

extractWebAsHostOptions
	: (
	schemeOption
	| hostOption
	| hostlengthOption
	| hosttypeOption
	| httpmethodOption
	| methodlengthOption
	| httpversionOption
	| versionlenOption
	| pathOption
	| pathlengthOption
	| querystringOption
	| requesttypeOption
	| portnumberOption
	| querystrlenOption
	| urimapOption
	| exceptionOptions
	)
	;

extractWebAsClientOptions
	: (
	sesstokenOption
	| schemeOption
	| hostOption
	| hostlengthOption
	| hosttypeOption
	| httpversionOption
	| pathOption
	| versionlenOption
	| pathlengthOption
	| urimapOption
	| realmOption
	| portnumberOption
	| realmlenOption
	| exceptionOptions
	)
	;

fetchAnyOptions
	: (
	compstatusOption
	| channelOption
	| abcodeOption
	| nosuspendOption
	| timeoutOption
	| exceptionOptions
	)
	;

fetchChildOptions
	: (
	compstatusOption
	| channelOption
	| abcodeOption
	| nosuspendOption
	| timeoutOption
	| exceptionOptions
	)
	;

forceTimerOptions
	: (
	acqactivityOption
	| acqprocessOption
	| exceptionOptions
	)
	;

formattimeOptions
	: (
	abstimeOption
	| dateOption
	| fulldateOption
	| dateformOption
	| datesepOption
	| datestringOption
	| stringzoneOption
	| daycountOption
	| dayofmonthOption
	| dayofweekOption
	| ddmmyyOption
	| ddmmyyyyOption
	| millisecondsOption
	| mmddyyOption
	| mmddyyyyOption
	| monthofyearOption
	| stringformatOption
	| timeOption
	| timesepOption
	| yearOption
	| yymmddOption
	| yyyyddmmOption
	| yydddOption
	| yyddmmOption
	| yyyydddOption
	| yyyymmddOption
	| exceptionOptions
	)
	;

freeOptions
	: (
	exceptionOptions
	)
	;

freeAPPCOptions
	: (
	convidOption
	| stateOption
	| exceptionOptions
	)
	;

freeLU61Options
	: (
	convidOption
	| sessionOption
	| exceptionOptions
	)
	;

freeMROOptions
	: (
	convidOption
	| sessionOption
	| stateOption
	| exceptionOptions
	)
	;

freeChildOptions
	: (
	exceptionOptions
	)
	;

freemainOptions
	: (
	dataOption
	| datapointerOption
	| exceptionOptions
	)
	;

freemain64Options
	: (
	dataOption
	| datapointerOption
	| exceptionOptions
	)
	;

gdsAllocateOptions
	: (
	sysidOption
	| modenameOption
	| partnerOption
	| convidOption
	| retcodeOption
	| noqueueOption
	| stateOption
	| exceptionOptions
	)
	;

gdsAssignOptions
	: (
	princonvidOption
	| prinsysidOption
	| retcodeOption
	| exceptionOptions
	)
	;

gdsConnectProcessOptions
	: (
	convidOption
	| procnameOption
	| proclengthOption
	| partnerOption
	| synclevelOption
	| piplistOption
	| piplengthOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsExtractAttributesOptions
	: (
	convidOption
	| convdataOption
	| stateOption
	| retcodeOption
	| exceptionOptions
	)
	;

gdsExtractProcessOptions
	: (
	convidOption
	| procnameOption
	| proclengthOption
	| maxproclenOption
	| synclevelOption
	| piplistOption
	| piplengthOption
	| retcodeOption
	| exceptionOptions
	)
	;

gdsFreeOptions
	: (
	convidOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsIssueAbendOptions
	: (
	convidOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsIssueConfirmationOptions
	: (
	convidOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsIssueErrorOptions
	: (
	convidOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsIssuePrepareOptions
	: (
	convidOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsIssueSignalOptions
	: (
	convidOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsReceiveOptions
	: (
	convidOption
	| intoOption
	| flengthOption
	| setOption
	| bufferOption
	| maxflengthOption
	| convdataOption
	| llidOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsSendOptions
	: (
	convidOption
	| fromOption
	| flengthOption
	| convdataOption
	| inviteOption
	| confirmOption
	| lastOption
	| waitOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

gdsWaitOptions
	: (
	convidOption
	| convdataOption
	| retcodeOption
	| stateOption
	| exceptionOptions
	)
	;

getContainerBTSOptions
	: (
	intoOption
	| activityOption
	| setOption
	| acqactivityOption
	| nodataOption
	| processOption
	| acqprocessOption
	| flengthOption
	| exceptionOptions
	)
	;

getContainerOptions
	: (
	channelOption
	| intoOption
	| flengthOption
	| byteoffsetOption
	| setOption
	| flengthOption
	| byteoffsetOption
	| nodataOption
	| flengthOption
	| intoccsidOption
	| intocodepageOption
	| convertstOption
	| ccsidOption
	| exceptionOptions
	)
	;

getCounterOptions
	: (
	valueOption
	| poolOption
	| incrementOption
	| wrapOption
	| reduceOption
	| compareminOption
	| comparemaxOption
	| nosuspendOption
	| exceptionOptions
	)
	;

getDcounterOptions
	: (
	valueOption
	| poolOption
	| incrementOption
	| wrapOption
	| reduceOption
	| compareminOption
	| comparemaxOption
	| nosuspendOption
	| exceptionOptions
	)
	;

getmainOptions
	: (
	setOption
	| flengthOption
	| belowOption
	| lengthOption
	| initimgOption
	| nosuspendOption
	| executableOption
	| sharedOption
	| userdatakeyOption
	| cicsdatakeyOption
	| exceptionOptions
	)
	;

getmain64Options
	: (
	setOption
	| flengthOption
	| locationOption
	| sharedOption
	| nosuspendOption
	| executableOption
	| userdatakeyOption
	| cicsdatakeyOption
	| exceptionOptions
	)
	;

getnextActivityOptions
	: (
	activityidOption
	| browsetokenOption
	| levelOption
	| exceptionOptions
	)
	;

getnextContainerOptions
	: (
	browsetokenOption
	| exceptionOptions
	)
	;

getnextEventOptions
	: (
	browsetokenOption
	| compositeOption
	| eventtypeOption
	| firestatusOption
	| predicateOption
	| timerOption
	| exceptionOptions
	)
	;

getnextProcessOptions
	: (
	browsetokenOption
	| activityidOption
	| exceptionOptions
	)
	;

getnextTimerOptions
	: (
	activityidOption
	| eventOption
	| browsetokenOption
	| statusOption
	| abstimeOption
	| exceptionOptions
	)
	;

get64ContainerOptions
	: (
	channelOption
	| intoOption
	| flengthOption
	| byteoffsetOption
	| setOption
	| flengthOption
	| byteoffsetOption
	| nodataOption
	| flengthOption
	| intoccsidOption
	| intocodepageOption
	| convertstOption
	| ccsidOption
	| exceptionOptions
	)
	;

handleAbendOptions
	: (
	cancelOption
	| programOption
	| labelOption
	| resetOption
	| exceptionOptions
	)
	;

handleAidOptions
	: (
	anykeyOption
	| clearOption
	| clrpartnOption
	| enterOption
	| lightpenOption
	| operidOption
	| pa1Option
	| pa2Option
	| pa3Option
	| pf1Option
	| pf2Option
	| pf3Option
	| pf4Option
	| pf5Option
	| pf6Option
	| pf7Option
	| pf8Option
	| pf9Option
	| pf10Option
	| pf11Option
	| pf12Option
	| pf13Option
	| pf14Option
	| pf15Option
	| pf16Option
	| pf17Option
	| pf18Option
	| pf19Option
	| pf20Option
	| pf21Option
	| pf22Option
	| pf23Option
	| pf24Option
	| triggerOption
	| exceptionOptions
	)
	;

handleConditionOptions
	: (
	errorOption
	| activitybusyOption
	| activityerrOption
	| allocerrOption
	| appnotfoundOption
	| busyOption
	| cbiderrOption
	| ccsiderrOption
	| changedOption
	| channelerrOption
	| codepageerrOption
	| containererrOption
	| csderrOption
	| disabledOption
	| dsnnotfoundOption
	| dsstatOption
	| dupkeyOption
	| duprecOption
	| dupresOption
	| endOption
	| enddataOption
	| endfileOption
	| endinptOption
	| enqbusyOption
	| envdeferrOption
	| eocOption
	| eodsOption
	| eofOption
	| errorOption
	| eventerrOption
	| expiredOption
	| filenotfoundOption
	| funcerrOption
	| igreqcdOption
	| igreqidOption
	| illogicOption
	| inbfmhOption
	| incompleteOption
	| inverrtermOption
	| invexitreqOption
	| invldcOption
	| invmpszOption
	| invpartnOption
	| invpartnsetOption
	| invreqOption
	| invtsreqOption
	| ioerrOption
	| iscinvreqOption
	| itemerrOption
	| jiderrOption
	| lengerrOption
	| linkabendOption
	| loadingOption
	| lockedOption
	| mapfailOption
	| modeliderrOption
	| netnameiderrOption
	| nodeiderrOption
	| nojbufspOption
	| nonvalOption
	| nopassbkrdOption
	| nopassbkwrOption
	| normalOption
	| nospaceOption
	| nospoolOption
	| nostartOption
	| nostgOption
	| notallocOption
	| notauthOption
	| notfinishedOption
	| notfndOption
	| notopenOption
	| notsuperuserOption
	| openerrOption
	| outdescrerrOption
	| overflowOption
	| partneriderrOption
	| partnfailOption
	| pgmiderrOption
	| poolerrOption
	| processbusyOption
	| processerrOption
	| profileiderrOption
	| qbusyOption
	| qiderrOption
	| qzeroOption
	| rdattOption
	| recordbusyOption
	| residerrOption
	| resunavailOption
	| retpageOption
	| rolledbackOption
	| rtefailOption
	| rtesomeOption
	| segiderrOption
	| selnerrOption
	| sessbusyOption
	| sessionerrOption
	| signalOption
	| spolbusyOption
	| spolerrOption
	| strelerrOption
	| suppressedOption
	| symbolerrOption
	| sysbusyOption
	| sysiderrOption
	| taskiderrOption
	| tciderrOption
	| templaterrOption
	| termerrOption
	| termiderrOption
	| timedoutOption
	| timererrOption
	| tokenerrOption
	| transiderrOption
	| tsioerrOption
	| unexpinOption
	| uowlnotfoundOption
	| uownotfoundOption
	| useriderrOption
	| voliderrOption
	| wrbrkOption
	| exceptionOptions
	)
	;

ignoreConditionOptions
	: (
	errorOption
	| activitybusyOption
	| activityerrOption
	| allocerrOption
	| appnotfoundOption
	| busyOption
	| cbiderrOption
	| ccsiderrOption
	| changedOption
	| channelerrOption
	| codepageerrOption
	| containererrOption
	| csderrOption
	| disabledOption
	| dsnnotfoundOption
	| dsstatOption
	| dupkeyOption
	| duprecOption
	| dupresOption
	| endOption
	| enddataOption
	| endfileOption
	| endinptOption
	| enqbusyOption
	| envdeferrOption
	| eocOption
	| eodsOption
	| eofOption
	| errorOption
	| eventerrOption
	| expiredOption
	| filenotfoundOption
	| funcerrOption
	| igreqcdOption
	| igreqidOption
	| illogicOption
	| inbfmhOption
	| incompleteOption
	| inverrtermOption
	| invexitreqOption
	| invldcOption
	| invmpszOption
	| invpartnOption
	| invpartnsetOption
	| invreqOption
	| invtsreqOption
	| ioerrOption
	| iscinvreqOption
	| itemerrOption
	| jiderrOption
	| lengerrOption
	| linkabendOption
	| loadingOption
	| lockedOption
	| mapfailOption
	| modeliderrOption
	| netnameiderrOption
	| nodeiderrOption
	| nojbufspOption
	| nonvalOption
	| nopassbkrdOption
	| nopassbkwrOption
	| normalOption
	| nospaceOption
	| nospoolOption
	| nostartOption
	| nostgOption
	| notallocOption
	| notauthOption
	| notfinishedOption
	| notfndOption
	| notopenOption
	| notsuperuserOption
	| openerrOption
	| outdescrerrOption
	| overflowOption
	| partneriderrOption
	| partnfailOption
	| pgmiderrOption
	| poolerrOption
	| processbusyOption
	| processerrOption
	| profileiderrOption
	| qbusyOption
	| qiderrOption
	| qzeroOption
	| rdattOption
	| recordbusyOption
	| residerrOption
	| resunavailOption
	| retpageOption
	| rolledbackOption
	| rtefailOption
	| rtesomeOption
	| segiderrOption
	| selnerrOption
	| sessbusyOption
	| sessionerrOption
	| signalOption
	| spolbusyOption
	| spolerrOption
	| strelerrOption
	| suppressedOption
	| symbolerrOption
	| sysbusyOption
	| sysiderrOption
	| taskiderrOption
	| tciderrOption
	| templaterrOption
	| termerrOption
	| termiderrOption
	| timedoutOption
	| timererrOption
	| tokenerrOption
	| transiderrOption
	| tsioerrOption
	| unexpinOption
	| uowlnotfoundOption
	| uownotfoundOption
	| useriderrOption
	| voliderrOption
	| wrbrkOption
	| exceptionOptions
	)
	;

inquireActivityidOptions
	: (
	abcodeOption
	| abprogramOption
	| activityOption
	| compstatusOption
	| eventOption
	| processOption
	| processtypeOption
	| programOption
	| suspstatusOption
	| modeOption
	| transidOption
	| useridOption
	| exceptionOptions
	)
	;

inquireContainerOptions
	: (
	activityidOption
	| processOption
	| datalengthOption
	| processtypeOption
	| setOption
	| exceptionOptions
	)
	;

inquireEventOptions
	: (
	firestatusOption
	| activityidOption
	| eventtypeOption
	| compositeOption
	| predicateOption
	| timerOption
	| exceptionOptions
	)
	;

inquireProcessOptions
	: (
	processtypeOption
	| activityidOption
	| exceptionOptions
	)
	;

inquireTimerOptions
	: (
	activityidOption
	| statusOption
	| eventOption
	| abstimeOption
	| exceptionOptions
	)
	;

invokeApplicationOptions
	: (
	operationOption
	| platformOption
	| majorversionOption
	| minorversionOption
	| exactmatchOption
	| minimumOption
	| commareaOption
	| lengthOption
	| channelOption
	| exceptionOptions
	)
	;

invokeServiceOptions
	: (
	channelOption
	| operationOption
	| uriOption
	| urimapOption
	| scopeOption
	| scopelenOption
	| exceptionOptions
	)
	;

invokeWebserviceOptions
	: (
	channelOption
	| operationOption
	| uriOption
	| urimapOption
	| scopeOption
	| scopelenOption
	| exceptionOptions
	)
	;

issueAbendOptions
	: (
	convidOption
	| stateOption
	| exceptionOptions
	)
	;

issueAbortOptions
	: (
	destidOption
	| destidlengOption
	| consoleOption
	| subaddrOption
	| printOption
	| cardOption
	| wpmedia1Option
	| wpmedia2Option
	| wpmedia3Option
	| wpmedia4Option
	| volumeOption
	| volumelengOption
	| exceptionOptions
	)
	;

issueAddOptions
	: (
	destidOption
	| volumeOption
	| destidlengOption
	| fromOption
	| volumelengOption
	| numrecOption
	| ridfldOption
	| lengthOption
	| defrespOption
	| nowaitOption
	| rrnOption
	| exceptionOptions
	)
	;

issueConfirmationOptions
	: (
	convidOption
	| stateOption
	| exceptionOptions
	)
	;

issueCopyOptions
	: (
	termidOption
	| ctlcharOption
	| waitOption
	| exceptionOptions
	)
	;

issueDisconnectOptions
	: (
	exceptionOptions
	)
	;

issueDisconnectLU61Options
	: (
	sessionOption
	| exceptionOptions
	)
	;

issueEndOptions
	: (
	destidOption
	| destidlengOption
	| consoleOption
	| subaddrOption
	| printOption
	| cardOption
	| wpmedia1Option
	| wpmedia2Option
	| wpmedia3Option
	| wpmedia4Option
	| volumeOption
	| volumelengOption
	| exceptionOptions
	)
	;

issueEndfileOptions
	: (
	endoutputOption
	| exceptionOptions
	)
	;

issueEndoutputOptions
	: (
	endfileOption
	| exceptionOptions
	)
	;

issueEodsOptions
	: (
	exceptionOptions
	)
	;

issueEraseOptions
	: (
	destidOption
	| volumeOption
	| destidlengOption
	| ridfldOption
	| volumelengOption
	| keylengthOption
	| keynumberOption
	| rrnOption
	| numrecOption
	| defrespOption
	| nowaitOption
	| exceptionOptions
	)
	;

issueEraseaupOptions
	: (
	waitOption
	| exceptionOptions
	)
	;

issueErrorOptions
	: (
	convidOption
	| stateOption
	| exceptionOptions
	)
	;

issueLoadOptions
	: (
	programOption
	| converseOption
	| exceptionOptions
	)
	;

issueNoteOptions
	: (
	destidOption
	| volumeOption
	| destidlengOption
	| ridfldOption
	| rrnOption
	| volumelengOption
	| exceptionOptions
	)
	;

issuePassOptions
	: (
	lunameOption
	| fromOption
	| logmodeOption
	| lengthOption
	| noquiesceOption
	| logonlogmodeOption
	| exceptionOptions
	)
	;

issuePrepareOptions
	: (
	convidOption
	| stateOption
	| sessionOption
	| exceptionOptions
	)
	;

issuePrintOptions
	: (
	exceptionOptions
	)
	;

issueQueryOptions
	: (
	destidOption
	| destidlengOption
	| volumeOption
	| volumelengOption
	| exceptionOptions
	)
	;

issueReceiveOptions
	: (
	intoOption
	| setOption
	| lengthOption
	| exceptionOptions
	)
	;

issueReplaceOptions
	: (
	destidOption
	| destidlengOption
	| fromOption
	| volumeOption
	| volumelengOption
	| ridfldOption
	| lengthOption
	| numrecOption
	| keylengthOption
	| keynumberOption
	| defrespOption
	| rrnOption
	| nowaitOption
	| exceptionOptions
	)
	;

issueResetOptions
	: (
	sessionOption
	| exceptionOptions
	)
	;

issueSendOptions
	: (
	destidOption
	| destidlengOption
	| consoleOption
	| subaddrOption
	| printOption
	| cardOption
	| wpmedia1Option
	| wpmedia2Option
	| wpmedia3Option
	| wpmedia4Option
	| fromOption
	| volumeOption
	| volumelengOption
	| lengthOption
	| nowaitOption
	| defrespOption
	| exceptionOptions
	)
	;

issueSignalOptions
	: (
	convidOption
	| stateOption
	| exceptionOptions
	)
	;

issueSignalLU61Options
	: (
	convidOption
	| sessionOption
	| exceptionOptions
	)
	;

issueWaitOptions
	: (
	destidOption
	| destidlengOption
	| consoleOption
	| subaddrOption
	| printOption
	| cardOption
	| wpmedia1Option
	| wpmedia2Option
	| wpmedia3Option
	| wpmedia4Option
	| volumeOption
	| volumelengOption
	| exceptionOptions
	)
	;

journalOptions
	: (
	jfileidOption
	| jtypeidOption
	| fromOption
	| lengthOption
	| reqidOption
	| prefixOption
	| pfxlengOption
	| startioOption
	| waitOption
	| nosuspendOption
	| exceptionOptions
	)
	;

linkOptions
	: (
	programOption
	| commareaOption
	| lengthOption
	| datalengthOption
	| channelOption
	| inputmsgOption
	| inputmsglenOption
	| sysidOption
	| synconreturnOption
	| transidOption
	| exceptionOptions
	)
	;

linkAcqprocessOptions
	: (
	inputeventOption
	| exceptionOptions
	)
	;

linkActivityOptions
	: (
	acqactivityOption
	| inputeventOption
	| exceptionOptions
	)
	;

loadOptions
	: (
	programOption
	| setOption
	| lengthOption
	| flengthOption
	| entryOption
	| holdOption
	| exceptionOptions
	)
	;

monitorOptions
	: (
	pointOption
	| data1Option
	| data2Option
	| entrynameOption
	| exceptionOptions
	)
	;

moveContainerBTSOptions
	: (
	asOption
	| fromprocessOption
	| fromactivityOption
	| toprocessOption
	| toactivityOption
	| exceptionOptions
	)
	;

moveContainerOptions
	: (
	asOption
	| channelOption
	| tochannelOption
	| exceptionOptions
	)
	;

pointOptions
	: (
	convidOption
	| sessionOption
	| exceptionOptions
	)
	;

popHandleOptions
	: (
	exceptionOptions
	)
	;

postOptions
	: (
	intervalOption
	| timeOption
	| hoursOption
	| afterOption
	| minutesOption
	| secondsOption
	| atOption
	| hoursOption
	| minutesOption
	| secondsOption
	| setOption
	| reqidOption
	| exceptionOptions
	)
	;

purgeMessageOptions
	: (
	exceptionOptions
	)
	;

pushHandleOptions
	: (
	exceptionOptions
	)
	;

putContainerBTSOptions
	: (
	fromOption
	| activityOption
	| acqactivityOption
	| processOption
	| acqprocessOption
	| flengthOption
	| exceptionOptions
	)
	;

putContainerOptions
	: (
	fromOption
	| channelOption
	| bitOption
	| flengthOption
	| datatypeOption
	| charOption
	| fromccsidOption
	| appendOption
	| fromcodepageOption
	| exceptionOptions
	)
	;

put64ContainerOptions
	: (
	fromOption
	| channelOption
	| bitOption
	| flengthOption
	| datatypeOption
	| charOption
	| fromccsidOption
	| appendOption
	| fromcodepageOption
	| exceptionOptions
	)
	;

queryChannelOptions
	: (
	containercntOption
	| exceptionOptions
	)
	;

queryCounterOptions
	: (
	poolOption
	| minimumOption
	| valueOption
	| maximumOption
	| nosuspendOption
	| exceptionOptions
	)
	;

queryDcounterOptions
	: (
	poolOption
	| minimumOption
	| valueOption
	| maximumOption
	| nosuspendOption
	| exceptionOptions
	)
	;

querySecurityOptions
	: (
	restypeOption
	| resclassOption
	| residlengthOption
	| residOption
	| logmessageOption
	| readOption
	| updateOption
	| useridOption
	| controlOption
	| alterOption
	| exceptionOptions
	)
	;

readOptions
	: (
	fileOption
	| datasetOption
	| uncommittedOption
	| consistentOption
	| repeatableOption
	| updateOption
	| tokenOption
	| intoOption
	| ridfldOption
	| setOption
	| keylengthOption
	| genericOption
	| equalOption
	| sysidOption
	| lengthOption
	| lengthOption
	| debkeyOption
	| gteqOption
	| debrecOption
	| rbaOption
	| rrnOption
	| xrbaOption
	| nosuspendOption
	| exceptionOptions
	)
	;

readnextOptions
	: (
	fileOption
	| datasetOption
	| intoOption
	| setOption
	| ridfldOption
	| uncommittedOption
	| consistentOption
	| repeatableOption
	| updateOption
	| tokenOption
	| keylengthOption
	| sysidOption
	| reqidOption
	| lengthOption
	| lengthOption
	| rbaOption
	| nosuspendOption
	| rrnOption
	| xrbaOption
	| exceptionOptions
	)
	;

readprevOptions
	: (
	fileOption
	| datasetOption
	| intoOption
	| setOption
	| ridfldOption
	| uncommittedOption
	| consistentOption
	| repeatableOption
	| updateOption
	| tokenOption
	| keylengthOption
	| reqidOption
	| lengthOption
	| sysidOption
	| lengthOption
	| rbaOption
	| rrnOption
	| xrbaOption
	| nosuspendOption
	| exceptionOptions
	)
	;

readqTdOptions
	: (
	queueOption
	| intoOption
	| setOption
	| sysidOption
	| lengthOption
	| nosuspendOption
	| exceptionOptions
	)
	;

readqTsOptions
	: (
	queueOption
	| intoOption
	| qnameOption
	| setOption
	| nextOption
	| lengthOption
	| numitemsOption
	| itemOption
	| sysidOption
	| exceptionOptions
	)
	;

receivezOSCommServerOptions
	: (
	asisOption
	| bufferOption
	| convidOption
	| flengthOption
	| intoOption
	| lengthOption
	| maxflengthOption
	| maxlengthOption
	| notruncateOption
	| sessionOption
	| setOption
	| stateOption
	| exceptionOptions
	)
	;

receiveNonzOSCommServerOptions
	: (
	asisOption
	| bufferOption
	| flengthOption
	| intoOption
	| leavekbOption
	| lengthOption
	| maxflengthOption
	| maxlengthOption
	| notruncateOption
	| passbkOption
	| pseudobinOption
	| sessionOption
	| setOption
	| stateOption
	| exceptionOptions
	)
	;

receiveMapOptions
	: (
	mapsetOption
	| intoOption
	| setOption
	| terminalOption
	| fromOption
	| lengthOption
	| terminalOption
	| asisOption
	| inpartnOption
	| exceptionOptions
	)
	;

receiveMapMappingdevOptions
	: (
	lengthOption
	| fromOption
	| mapsetOption
	| intoOption
	| setOption
	| exceptionOptions
	)
	;

receivePartnOptions
	: (
	intoOption
	| lengthOption
	| setOption
	| asisOption
	| exceptionOptions
	)
	;

releaseOptions
	: (
	programOption
	| exceptionOptions
	)
	;

removeSubeventOptions
	: (
	eventOption
	| exceptionOptions
	)
	;

requestEncryptptktOptions
	: (
	flengthOption
	| encryptkeyOption
	| esmappnameOption
	| esmreasonOption
	| esmrespOption
	| exceptionOptions
	)
	;

requestPassticketOptions
	: (
	esmrespOption
	| esmappnameOption
	| esmreasonOption
	| exceptionOptions
	)
	;

resetAcqprocessOptions
	: (
	exceptionOptions
	)
	;

resetActivityOptions
	: (
	exceptionOptions
	)
	;

resetbrOptions
	: (
	fileOption
	| datasetOption
	| ridfldOption
	| keylengthOption
	| reqidOption
	| genericOption
	| gteqOption
	| sysidOption
	| equalOption
	| rbaOption
	| rrnOption
	| xrbaOption
	| exceptionOptions
	)
	;

resumeOptions
	: (
	acqactivityOption
	| acqprocessOption
	| activityOption
	| exceptionOptions
	)
	;

retrieveOptions
	: (
	intoOption
	| setOption
	| lengthOption
	| rtransidOption
	| rtermidOption
	| queueOption
	| waitOption
	| exceptionOptions
	)
	;

retrieveReattachOptions
	: (
	eventOption
	| eventtypeOption
	| exceptionOptions
	)
	;

retrieveSubeventOptions
	: (
	eventOption
	| eventtypeOption
	| exceptionOptions
	)
	;

returnOptions
	: (
	transidOption
	| commareaOption
	| immediateOption
	| lengthOption
	| channelOption
	| inputmsgOption
	| endactivityOption
	| inputmsglenOption
	| exceptionOptions
	)
	;

rewindCounterOptions
	: (
	poolOption
	| incrementOption
	| nosuspendOption
	| exceptionOptions
	)
	;

rewindDcounterOptions
	: (
	poolOption
	| incrementOption
	| nosuspendOption
	| exceptionOptions
	)
	;

rewriteOptions
	: (
	fileOption
	| datasetOption
	| tokenOption
	| fromOption
	| sysidOption
	| lengthOption
	| nosuspendOption
	| lengthOption
	| exceptionOptions
	)
	;

routeOptions
	: (
	intervalOption
	| timeOption
	| hoursOption
	| afterOption
	| minutesOption
	| secondsOption
	| hoursOption
	| atOption
	| minutesOption
	| secondsOption
	| titleOption
	| errtermOption
	| listOption
	| opclassOption
	| reqidOption
	| ldcOption
	| nleomOption
	| exceptionOptions
	)
	;

runOptions
	: (
	activityOption
	| acqactivityOption
	| acqprocessOption
	| synchronousOption
	| asynchronousOption
	| facilitytoknOption
	| inputeventOption
	| exceptionOptions
	)
	;

runTransidOptions
	: (
	childOption
	| channelOption
	| exceptionOptions
	)
	;

sendzOSCommServerOptions
	: (
	alternateOption
	| attachidOption
	| cnotcomplOption
	| confirmOption
	| convidOption
	| ctlcharOption
	| defaultOption
	| defrespOption
	| eraseOption
	| flengthOption
	| fmhOption
	| fromOption
	| inviteOption
	| lastOption
	| ldcOption
	| lengthOption
	| sessionOption
	| stateOption
	| strfieldOption
	| waitOption
	| exceptionOptions
	)
	;

sendNonzOSCommServerOptions
	: (
	alternateOption
	| asisOption
	| attachidOption
	| cbuffOption
	| cnotcomplOption
	| ctlcharOption
	| defaultOption
	| defrespOption
	| eraseOption
	| flengthOption
	| fmhOption
	| fromOption
	| inviteOption
	| lastOption
	| leavekbOption
	| lengthOption
	| lineaddrOption
	| passbkOption
	| pseudobinOption
	| sessionOption
	| stateOption
	| strfieldOption
	| waitOption
	| exceptionOptions
	)
	;

sendControlOptions
	: (
	eraseaupOption
	| eraseOption
	| alarmOption
	| alternateOption
	| defaultOption
	| freekbOption
	| frsetOption
	| cursorOption
	| printOption
	| formfeedOption
	| msrOption
	| outpartnOption
	| actpartnOption
	| ldcOption
	| accumOption
	| setOption
	| pagingOption
	| terminalOption
	| waitOption
	| lastOption
	| reqidOption
	| l40Option
	| l64Option
	| l80Option
	| honeomOption
	| exceptionOptions
	)
	;

sendMapOptions
	: (
	mapsetOption
	| fromOption
	| dataonlyOption
	| lengthOption
	| maponlyOption
	| cursorOption
	| formfeedOption
	| printOption
	| eraseOption
	| alternateOption
	| defaultOption
	| eraseaupOption
	| alarmOption
	| frsetOption
	| nleomOption
	| msrOption
	| outpartnOption
	| actpartnOption
	| ldcOption
	| fmhparmOption
	| freekbOption
	| terminalOption
	| setOption
	| accumOption
	| reqidOption
	| pagingOption
	| terminalOption
	| waitOption
	| lastOption
	| honeomOption
	| noflushOption
	| l40Option
	| l64Option
	| l80Option
	| exceptionOptions
	)
	;

sendMapMappingdevOptions
	: (
	setOption
	| mapsetOption
	| fromOption
	| dataonlyOption
	| lengthOption
	| maponlyOption
	| cursorOption
	| formfeedOption
	| printOption
	| freekbOption
	| eraseOption
	| eraseaupOption
	| alarmOption
	| frsetOption
	| exceptionOptions
	)
	;

sendPageOptions
	: (
	releaseOption
	| transidOption
	| trailerOption
	| retainOption
	| setOption
	| autopageOption
	| operpurgeOption
	| currentOption
	| allOption
	| noautopageOption
	| fmhparmOption
	| lastOption
	| exceptionOptions
	)
	;

sendPartnsetOptions
	: (
	exceptionOptions
	)
	;

sendTextOptions
	: (
	fromOption
	| lengthOption
	| formfeedOption
	| cursorOption
	| printOption
	| eraseOption
	| defaultOption
	| alternateOption
	| freekbOption
	| alarmOption
	| fmhparmOption
	| nleomOption
	| outpartnOption
	| actpartnOption
	| msrOption
	| ldcOption
	| terminalOption
	| setOption
	| reqidOption
	| pagingOption
	| terminalOption
	| waitOption
	| lastOption
	| headerOption
	| trailerOption
	| justifyOption
	| jusfirstOption
	| juslastOption
	| honeomOption
	| accumOption
	| l40Option
	| l64Option
	| l80Option
	| exceptionOptions
	)
	;

sendTextMappedOptions
	: (
	fromOption
	| lengthOption
	| terminalOption
	| reqidOption
	| pagingOption
	| terminalOption
	| waitOption
	| lastOption
	| exceptionOptions
	)
	;

sendTextNoeditOptions
	: (
	fromOption
	| lengthOption
	| printOption
	| eraseOption
	| freekbOption
	| defaultOption
	| alternateOption
	| alarmOption
	| outpartnOption
	| terminalOption
	| reqidOption
	| terminalOption
	| waitOption
	| lastOption
	| pagingOption
	| honeomOption
	| l40Option
	| l64Option
	| l80Option
	| exceptionOptions
	)
	;

signalEventOptions
	: (
	fromchannelOption
	| fromOption
	| fromlengthOption
	| exceptionOptions
	)
	;

signoffOptions
	: (
	exceptionOptions
	)
	;

signonOptions
	: (
	useridOption
	| esmreasonOption
	| esmrespOption
	| groupidOption
	| languagecodeOption
	| langinuseOption
	| natlangOption
	| natlanginuseOption
	| passwordOption
	| newpasswordOption
	| phraseOption
	| phraselenOption
	| newphraseOption
	| newphraselenOption
	| oidcardOption
	| exceptionOptions
	)
	;

signonTokenOptions
	: (
	tokenlenOption
	| tokentypeOption
	| kerberosOption
	| bitOption
	| groupidOption
	| languagecodeOption
	| langinuseOption
	| datatypeOption
	| base64Option
	| natlangOption
	| natlanginuseOption
	| esmreasonOption
	| esmrespOption
	| exceptionOptions
	)
	;

soapfaultAddOptions
	: (
	faultstringOption
	| faultstrlenOption
	| natlangOption
	| subcodestrOption
	| subcodelenOption
	| fromccsidOption
	| exceptionOptions
	)
	;

soapfaultCreateOptions
	: (
	faultcodeOption
	| clientOption
	| serverOption
	| senderOption
	| receiverOption
	| faultcodestrOption
	| faultcodelenOption
	| faultstringOption
	| faultstrlenOption
	| natlangOption
	| natlangOption
	| roleOption
	| rolelengthOption
	| faultactorOption
	| faultactlenOption
	| detailOption
	| detaillengthOption
	| fromccsidOption
	| exceptionOptions
	)
	;

soapfaultDeleteOptions
	: (
	exceptionOptions
	)
	;

spoolcloseOptions
	: (
	tokenOption
	| nohandleOption
	| keepOption
	| deleteOption
	| respOption
	| resp2Option
	| exceptionOptions
	)
	;

spoolopenInputOptions
	: (
	tokenOption
	| useridOption
	| classOption
	| nohandleOption
	| respOption
	| resp2Option
	| exceptionOptions
	)
	;

spoolopenOutputOptions
	: (
	tokenOption
	| useridOption
	| nodeOption
	| noccOption
	| classOption
	| outdescrOption
	| asaOption
	| mccOption
	| printOption
	| recordlengthOption
	| punchOption
	| exceptionOptions
	)
	;

spoolreadOptions
	: (
	tokenOption
	| intoOption
	| maxflengthOption
	| nohandleOption
	| toflengthOption
	| respOption
	| resp2Option
	| exceptionOptions
	)
	;

spoolwriteOptions
	: (
	tokenOption
	| fromOption
	| flengthOption
	| lineOption
	| nohandleOption
	| pageOption
	| respOption
	| resp2Option
	| exceptionOptions
	)
	;

spoolopenReportOptions
	: (
	tokenOption
	| asaOption
	| mccOption
	| noccOption
	| scsOption
	| t3270Option
	| jclOption
	| titleOption
	| classOption
	| logOption
	| userdataOption
	| priorityOption
	| destinationOption
	| nodeOption
	| rslOption
	| physicalOption
	| logicalOption
	| copiesOption
	| formsOption
	| sepOption
	| nosepOption
	| printfailOption
	| linesOption
	| linelengthOption
	| nonumOption
	| headnumOption
	| footnumOption
	| bothnumOption
	| headOption
	| footOption
	| datetimeOption
	| noconvOption
	| escapeOption
	| mapnameOption
	| mapsetOption
	| exceptionOptions
	)
	;

spoolwriteReportOptions
	: (
	tokenOption
	| fromOption
	| flengthOption
	| logOption
	| mapnameOption
	| maponlyOption
	| mapsetOption
	| exceptionOptions
	)
	;

spoolcloseReportOptions
	: (
	tokenOption
	| releaseOption
	| holdOption
	| resumeOption
	| deleteOption
	| exceptionOptions
	)
	;

spoolopenResumeOptions
	: (
	reportOption
	| tokenOption
	| exceptionOptions
	)
	;

startOptions
	: (
	transidOption
	| intervalOption
	| timeOption
	| hoursOption
	| afterOption
	| minutesOption
	| secondsOption
	| hoursOption
	| atOption
	| minutesOption
	| secondsOption
	| reqidOption
	| fromOption
	| lengthOption
	| fmhOption
	| termidOption
	| sysidOption
	| rtransidOption
	| useridOption
	| rtermidOption
	| queueOption
	| nocheckOption
	| protectOption
	| exceptionOptions
	)
	;

startAttachOptions
	: (
	transidOption
	| fromOption
	| lengthOption
	| exceptionOptions
	)
	;

startBrexitOptions
	: (
	transidOption
	| brexitOption
	| brdataOption
	| brdatalengthOption
	| useridOption
	| exceptionOptions
	)
	;

startChannelOptions
	: (
	transidOption
	| termidOption
	| useridOption
	| sysidOption
	| nocheckOption
	| protectOption
	| exceptionOptions
	)
	;

startbrOptions
	: (
	fileOption
	| datasetOption
	| ridfldOption
	| keylengthOption
	| reqidOption
	| genericOption
	| sysidOption
	| debkeyOption
	| debrecOption
	| gteqOption
	| equalOption
	| rbaOption
	| rrnOption
	| xrbaOption
	| exceptionOptions
	)
	;

startbrowseActivityOptions
	: (
	activityidOption
	| processOption
	| processtypeOption
	| browsetokenOption
	| exceptionOptions
	)
	;

startbrowseContainerBTSOptions
	: (
	activityidOption
	| processOption
	| processtypeOption
	| browsetokenOption
	| exceptionOptions
	)
	;

startbrowseContainerOptions
	: (
	browsetokenOption
	| channelOption
	| exceptionOptions
	)
	;

startbrowseEventOptions
	: (
	browsetokenOption
	| activityidOption
	| exceptionOptions
	)
	;

startbrowseProcessOptions
	: (
	processtypeOption
	| browsetokenOption
	| exceptionOptions
	)
	;

startbrowseTimerOptions
	: (
	activityidOption
	| browsetokenOption
	| exceptionOptions
	)
	;

suspendOptions
	: (
	exceptionOptions
	)
	;

suspendBTSOptions
	: (
	acqactivityOption
	| acqprocessOption
	| activityOption
	| exceptionOptions
	)
	;

syncpointOptions
	: (
	exceptionOptions
	)
	;

syncpointRollbackOptions
	: (
	exceptionOptions
	)
	;

testEventOptions
	: (
	firestatusOption
	| exceptionOptions
	)
	;

transformDatatojsonOptions
	: (
	channelOption
	| incontainerOption
	| transformerOption
	| outcontainerOption
	| exceptionOptions
	)
	;

transformDatatoxmlOptions
	: (
	channelOption
	| elemnameOption
	| elemnsOption
	| typenameOption
	| datcontainerOption
	| elemnamelenOption
	| elemnslenOption
	| typenamelenOption
	| typensOption
	| typenslenOption
	| xmltransformOption
	| xmlcontainerOption
	| exceptionOptions
	)
	;

transformJsontodataOptions
	: (
	channelOption
	| incontainerOption
	| transformerOption
	| outcontainerOption
	| exceptionOptions
	)
	;

transformXmltodataOptions
	: (
	channelOption
	| datcontainerOption
	| elemnameOption
	| elemnsOption
	| elemnamelenOption
	| elemnslenOption
	| typenameOption
	| nscontainerOption
	| typenamelenOption
	| xmlcontainerOption
	| typensOption
	| typenslenOption
	| xmltransformOption
	| exceptionOptions
	)
	;

unlockOptions
	: (
	fileOption
	| datasetOption
	| tokenOption
	| sysidOption
	| exceptionOptions
	)
	;

updateCounterOptions
	: (
	valueOption
	| poolOption
	| compareminOption
	| comparemaxOption
	| nosuspendOption
	| exceptionOptions
	)
	;

updateDcounterOptions
	: (
	valueOption
	| poolOption
	| compareminOption
	| comparemaxOption
	| nosuspendOption
	| exceptionOptions
	)
	;

verifyPasswordOptions
	: (
	useridOption
	| groupidOption
	| changetimeOption
	| daysleftOption
	| esmreasonOption
	| esmrespOption
	| expirytimeOption
	| invalidcountOption
	| lastusetimeOption
	| exceptionOptions
	)
	;

verifyPhraseOptions
	: (
	phraselenOption
	| useridOption
	| groupidOption
	| changetimeOption
	| daysleftOption
	| esmreasonOption
	| esmrespOption
	| expirytimeOption
	| invalidcountOption
	| lastusetimeOption
	| exceptionOptions
	)
	;

verifyTokenOptions
	: (
	tokenlenOption
	| tokentypeOption
	| basicauthOption
	| jwtOption
	| kerberosOption
	| bitOption
	| isuseridOption
	| datatypeOption
	| base64Option
	| encryptkeyOption
	| outtokenOption
	| esmrespOption
	| outtokenlenOption
	| esmreasonOption
	| exceptionOptions
	)
	;

waitConvidOptions
	: (
	stateOption
	| exceptionOptions
	)
	;

waitEventOptions
	: (
	ecaddrOption
	| nameOption
	| exceptionOptions
	)
	;

waitExternalOptions
	: (
	ecblistOption
	| numeventsOption
	| purgeableOption
	| purgeabilityOption
	| nameOption
	| notpurgeableOption
	| exceptionOptions
	)
	;

waitJournalOptions
	: (
	jfileidOption
	| reqidOption
	| startioOption
	| exceptionOptions
	)
	;

waitJournalnameOptions
	: (
	reqidOption
	| exceptionOptions
	)
	;

waitJournalnumOptions
	: (
	reqidOption
	| exceptionOptions
	)
	;

waitSignalOptions
	: (
	exceptionOptions
	)
	;

waitTerminalOptions
	: (
	convidOption
	| sessionOption
	| exceptionOptions
	)
	;

waitcicsOptions
	: (
	ecblistOption
	| numeventsOption
	| purgeableOption
	| purgeabilityOption
	| notpurgeableOption
	| nameOption
	| exceptionOptions
	)
	;

webCloseOptions
	: (
	sesstokenOption
	| exceptionOptions
	)
	;

webConverseOptions
	: (
	sesstokenOption
	| getOption
	| pathOption
	| pathlengthOption
	| headOption
	| patchOption
	| urimapOption
	| postOption
	| putOption
	| traceOption
	| optionsOption
	| deleteOption
	| methodOption
	| mediatypeOption
	| querystringOption
	| querystrlenOption
	| nocloseOption
	| actionOption
	| closeOption
	| expectOption
	| closestatusOption
	| intoOption
	| setOption
	| tocontainerOption
	| tochannelOption
	| tolengthOption
	| maxlengthOption
	| statuscodeOption
	| statustextOption
	| bodycharsetOption
	| notruncateOption
	| statuslenOption
	| nodocdeleteOption
	| doctokenOption
	| docdeleteOption
	| docstatusOption
	| fromOption
	| fromlengthOption
	| containerOption
	| channelOption
	| noneOption
	| basicauthOption
	| usernameOption
	| usernamelenOption
	| authenticateOption
	| passwordOption
	| passwordlenOption
	| cliconvertOption
	| charactersetOption
	| noinconvertOption
	| nooutconvertOption
	| nocliconvertOption
	| clientconvOption
	| exceptionOptions
	)
	;

webEndbrowseFormfieldOptions
	: (
	exceptionOptions
	)
	;

webEndbrowseHttpheaderOptions
	: (
	sesstokenOption
	| exceptionOptions
	)
	;

webEndbrowseQueryparmOptions
	: (
	exceptionOptions
	)
	;

webExtractServerOptions
	: (
	schemeOption
	| hostOption
	| hostlengthOption
	| hosttypeOption
	| httpmethodOption
	| methodlengthOption
	| httpversionOption
	| versionlenOption
	| pathOption
	| pathlengthOption
	| querystringOption
	| requesttypeOption
	| portnumberOption
	| querystrlenOption
	| urimapOption
	| exceptionOptions
	)
	;

webExtractClientOptions
	: (
	sesstokenOption
	| schemeOption
	| hostOption
	| hostlengthOption
	| hosttypeOption
	| httpversionOption
	| pathOption
	| urimapOption
	| versionlenOption
	| pathlengthOption
	| realmOption
	| portnumberOption
	| realmlenOption
	| exceptionOptions
	)
	;

webOpenOptions
	: (
	certificateOption
	| urimapOption
	| sesstokenOption
	| codepageOption
	| httpvnumOption
	| httprnumOption
	| hostOption
	| hostlengthOption
	| portnumberOption
	| schemeOption
	| ciphersOption
	| numciphersOption
	| exceptionOptions
	)
	;

webParseOptions
	: (
	urlOption
	| urllengthOption
	| schemenameOption
	| hostOption
	| hostlengthOption
	| hosttypeOption
	| portnumberOption
	| querystringOption
	| pathOption
	| pathlengthOption
	| querystrlenOption
	| exceptionOptions
	)
	;

webReadFormfieldOptions
	: (
	namelengthOption
	| valueOption
	| valuelengthOption
	| setOption
	| charactersetOption
	| hostcodepageOption
	| exceptionOptions
	)
	;

webReadHttpheaderOptions
	: (
	namelengthOption
	| valueOption
	| valuelengthOption
	| sesstokenOption
	| exceptionOptions
	)
	;

webReadQueryparmOptions
	: (
	namelengthOption
	| valueOption
	| valuelengthOption
	| setOption
	| hostcodepageOption
	| exceptionOptions
	)
	;

webReadnextFormfieldOptions
	: (
	namelengthOption
	| valueOption
	| valuelengthOption
	| exceptionOptions
	)
	;

webReadnextHttpheaderOptions
	: (
	namelengthOption
	| valueOption
	| valuelengthOption
	| sesstokenOption
	| exceptionOptions
	)
	;

webReadnextQueryparmOptions
	: (
	namelengthOption
	| valueOption
	| valuelengthOption
	| exceptionOptions
	)
	;

webReceiveServerWithBufferOptions
	: (
	intoOption
	| lengthOption
	| setOption
	| maxlengthOption
	| typeOption
	| notruncateOption
	| charactersetOption
	| srvconvertOption
	| nosrvconvertOption
	| serverconvOption
	| hostcodepageOption
	| bodycharsetOption
	| mediatypeOption
	| exceptionOptions
	)
	;

webReceiveServerWithContainerOptions
	: (
	tocontainerOption
	| tochannelOption
	| typeOption
	| charactersetOption
	| bodycharsetOption
	| mediatypeOption
	| exceptionOptions
	)
	;

webReceiveClientWithBufferOptions
	: (
	sesstokenOption
	| mediatypeOption
	| statuscodeOption
	| intoOption
	| statustextOption
	| statuslenOption
	| lengthOption
	| maxlengthOption
	| setOption
	| cliconvertOption
	| notruncateOption
	| bodycharsetOption
	| nocliconvertOption
	| clientconvOption
	| exceptionOptions
	)
	;

webReceiveClientWithContainerOptions
	: (
	sesstokenOption
	| mediatypeOption
	| statuscodeOption
	| statustextOption
	| statuslenOption
	| tocontainerOption
	| tochannelOption
	| bodycharsetOption
	| exceptionOptions
	)
	;

webRetrieveOptions
	: (
	doctokenOption
	| exceptionOptions
	)
	;

webSendServerOptions
	: (
	nodocdeleteOption
	| doctokenOption
	| docdeleteOption
	| docstatusOption
	| chunknoOption
	| fromOption
	| fromlengthOption
	| chunkyesOption
	| hostcodepageOption
	| chunkendOption
	| chunkingOption
	| containerOption
	| channelOption
	| mediatypeOption
	| srvconvertOption
	| nosrvconvertOption
	| serverconvOption
	| charactersetOption
	| statuscodeOption
	| statustextOption
	| statuslenOption
	| lengthOption
	| nocloseOption
	| immediateOption
	| closeOption
	| eventualOption
	| closestatusOption
	| actionOption
	| exceptionOptions
	)
	;

webSendClientOptions
	: (
	sesstokenOption
	| getOption
	| headOption
	| patchOption
	| postOption
	| putOption
	| traceOption
	| optionsOption
	| deleteOption
	| methodOption
	| pathOption
	| pathlengthOption
	| urimapOption
	| querystringOption
	| cliconvertOption
	| querystrlenOption
	| charactersetOption
	| expectOption
	| actionOption
	| nocliconvertOption
	| clientconvOption
	| nocloseOption
	| closeOption
	| noneOption
	| closestatusOption
	| basicauthOption
	| authenticateOption
	| mediatypeOption
	| nodocdeleteOption
	| doctokenOption
	| docdeleteOption
	| docstatusOption
	| chunknoOption
	| fromOption
	| fromlengthOption
	| chunkyesOption
	| chunkendOption
	| chunkingOption
	| containerOption
	| channelOption
	| usernameOption
	| passwordOption
	| usernamelenOption
	| passwordlenOption
	| exceptionOptions
	)
	;

webStartbrowseFormfieldOptions
	: (
	namelengthOption
	| charactersetOption
	| hostcodepageOption
	| exceptionOptions
	)
	;

webStartbrowseHttpheaderOptions
	: (
	sesstokenOption
	| exceptionOptions
	)
	;

webStartbrowseQueryparmOptions
	: (
	namelengthOption
	| hostcodepageOption
	| exceptionOptions
	)
	;

webWriteHttpheaderOptions
	: (
	namelengthOption
	| valueOption
	| sesstokenOption
	| valuelengthOption
	| exceptionOptions
	)
	;

writeOptions
	: (
	fileOption
	| datasetOption
	| fromOption
	| ridfldOption
	| massinsertOption
	| keylengthOption
	| sysidOption
	| lengthOption
	| lengthOption
	| rbaOption
	| nosuspendOption
	| rrnOption
	| xrbaOption
	| exceptionOptions
	)
	;

writeJournalnameOptions
	: (
	flengthOption
	| jtypeidOption
	| fromOption
	| reqidOption
	| prefixOption
	| waitOption
	| pfxlengOption
	| nosuspendOption
	| exceptionOptions
	)
	;

writeJournalnumOptions
	: (
	flengthOption
	| jtypeidOption
	| fromOption
	| reqidOption
	| prefixOption
	| waitOption
	| pfxlengOption
	| nosuspendOption
	| exceptionOptions
	)
	;

writeOperatorOptions
	: (
	textOption
	| textlengthOption
	| routecodesOption
	| numroutesOption
	| consnameOption
	| eventualOption
	| actionOption
	| criticalOption
	| immediateOption
	| replyOption
	| maxlengthOption
	| replylengthOption
	| timeoutOption
	| exceptionOptions
	)
	;

writeqTdOptions
	: (
	queueOption
	| fromOption
	| lengthOption
	| sysidOption
	| exceptionOptions
	)
	;

writeqTsOptions
	: (
	fromOption
	| queueOption
	| qnameOption
	| lengthOption
	| numitemsOption
	| itemOption
	| rewriteOption
	| auxiliaryOption
	| sysidOption
	| mainOption
	| nosuspendOption
	| exceptionOptions
	)
	;

wsacontextBuildOptions
	: (
	channelOption
	| actionOption
	| messageidOption
	| relatesuriOption
	| relatestypeOption
	| eprtypeOption
	| eprfieldOption
	| eprfromOption
	| eprlengthOption
	| fromccsidOption
	| fromcodepageOption
	| exceptionOptions
	)
	;

wsacontextDeleteOptions
	: (
	channelOption
	| exceptionOptions
	)
	;

wsacontextGetOptions
	: (
	contexttypeOption
	| channelOption
	| actionOption
	| messageidOption
	| relatesuriOption
	| relatestypeOption
	| eprtypeOption
	| eprfieldOption
	| relatesindexOption
	| eprintoOption
	| eprlengthOption
	| eprsetOption
	| intoccsidOption
	| intocodepageOption
	| exceptionOptions
	)
	;

wsaeprCreateOptions
	: (
	eprintoOption
	| eprlengthOption
	| eprsetOption
	| addressOption
	| refparmsOption
	| refparmslenOption
	| metadataOption
	| metadatalenOption
	| fromccsidOption
	| fromcodepageOption
	| exceptionOptions
	)
	;

xctlOptions
	: (
	programOption
	| commareaOption
	| lengthOption
	| channelOption
	| inputmsgOption
	| inputmsglenOption
	| exceptionOptions
	)
	;

acquireTerminalOptions
	: (
	noqueueOption
	| qallOption
	| relreqOption
	| qnotenabOption
	| qsesslimOption
	| relreqOption
	| userdataOption
	| userdatalenOption
	| exceptionOptions
	)
	;

collectStatisticsOptions
	: (
	setOption
	| lastresetOption
	| lastresethrsOption
	| lastresetminOption
	| lastresetsecOption
	| autoinstallOption
	| connectionOption
	| db2connOption
	| db2entryOption
	| dispatcherOption
	| enqueueOption
	| fileOption
	| journalnameOption
	| journalnumOption
	| jvmprogramOption
	| lsrpoolOption
	| monitorOption
	| mvstcbOption
	| poolOption
	| targetOption
	| progautoOption
	| programOption
	| recoveryOption
	| statsOption
	| storageOption
	| streamnameOption
	| subpoolOption
	| sysdumpcodeOption
	| tablemgrOption
	| targetOption
	| nodeOption
	| tasksubpoolOption
	| tclassOption
	| tcpipOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| trandumpcodeOption
	| transactionOption
	| tsqueueOption
	| vtamOption
	| exceptionOptions
	)
	;

createAtomserviceOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createBundleOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createConnectionOptions
	: (
	logOption
	| attributesOption
	| attrlenOption
	| nologOption
	| logmessageOption
	| completeOption
	| discardOption
	| exceptionOptions
	)
	;

createDb2connOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createDb2entryOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createDb2tranOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createDoctemplateOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createDumpcodeOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createEnqmodelOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createFileOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createIpconnOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createJournalmodelOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createJvmserverOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createLibraryOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createLsrpoolOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createMapsetOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createMqconnOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createMqmonitorOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createPartitionsetOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createPartnerOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createPipelineOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createProcesstypeOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createProfileOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createProgramOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createSessionsOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createTcpipserviceOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createTdqueueOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createTerminalOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| completeOption
	| discardOption
	| exceptionOptions
	)
	;

createTranclassOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createTransactionOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createTsmodelOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createTypetermOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createUrimapOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

createWebserviceOptions
	: (
	attributesOption
	| attrlenOption
	| logOption
	| nologOption
	| logmessageOption
	| exceptionOptions
	)
	;

csdAddOptions
	: (
	groupOption
	| listOption
	| beforeOption
	| afterOption
	| exceptionOptions
	)
	;

csdAlterOptions
	: (
	restypeOption
	| residOption
	| groupOption
	| atomserviceOption
	| bundleOption
	| connectionOption
	| corbaserverOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| djarOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| mqmonitorOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| requestmodelOption
	| sessionsOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| attributesOption
	| attrlenOption
	| nocompatOption
	| compatmodeOption
	| compatOption
	| exceptionOptions
	)
	;

csdAppendOptions
	: (
	listOption
	| toOption
	| exceptionOptions
	)
	;

csdCopyOptions
	: (
	restypeOption
	| residOption
	| atomserviceOption
	| asOption
	| toOption
	| bundleOption
	| connectionOption
	| corbaserverOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| djarOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| mqmonitorOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| requestmodelOption
	| sessionsOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| groupOption
	| toOption
	| duperrorOption
	| dupactionOption
	| dupnoreplaceOption
	| dupreplaceOption
	| exceptionOptions
	)
	;

csdDefineOptions
	: (
	restypeOption
	| residOption
	| groupOption
	| atomserviceOption
	| bundleOption
	| connectionOption
	| corbaserverOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| djarOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| mqmonitorOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| requestmodelOption
	| sessionsOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| nocompatOption
	| attributesOption
	| attrlenOption
	| compatmodeOption
	| compatOption
	| exceptionOptions
	)
	;

csdDeleteOptions
	: (
	groupOption
	| restypeOption
	| residOption
	| atomserviceOption
	| bundleOption
	| connectionOption
	| corbaserverOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| djarOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| requestmodelOption
	| sessionsOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| listactionOption
	| removeOption
	| exceptionOptions
	)
	;

csdDisconnectOptions
	: (
	exceptionOptions
	)
	;

csdEndbrgroupOptions
	: (
	listOption
	| exceptionOptions
	)
	;

csdEndbrlistOptions
	: (
	exceptionOptions
	)
	;

csdEndbrrsrceOptions
	: (
	exceptionOptions
	)
	;

csdGetnextgroupOptions
	: (
	groupOption
	| listOption
	| exceptionOptions
	)
	;

csdGetnextlistOptions
	: (
	listOption
	| exceptionOptions
	)
	;

csdGetnextrsrceOptions
	: (
	restypeOption
	| residOption
	| groupOption
	| attributesOption
	| attrlenOption
	| setOption
	| attrlenOption
	| exceptionOptions
	)
	;

csdInquiregroupOptions
	: (
	groupOption
	| listOption
	| exceptionOptions
	)
	;

csdInquirelistOptions
	: (
	listOption
	| exceptionOptions
	)
	;

csdInquirersrceOptions
	: (
	restypeOption
	| residOption
	| atomserviceOption
	| bundleOption
	| connectionOption
	| corbaserverOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| djarOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| mqmonitorOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| requestmodelOption
	| sessionsOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| attributesOption
	| attrlenOption
	| setOption
	| groupOption
	| exceptionOptions
	)
	;

csdInstallListOptions
	: (
	listOption
	| exceptionOptions
	)
	;

csdInstallResourceOrGroupOptions
	: (
	restypeOption
	| residOption
	| groupOption
	| atomserviceOption
	| bundleOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| exceptionOptions
	)
	;

csdLockOptions
	: (
	listOption
	| groupOption
	| exceptionOptions
	)
	;

csdRemoveOptions
	: (
	groupOption
	| listOption
	| exceptionOptions
	)
	;

csdRenameOptions
	: (
	groupOption
	| restypeOption
	| atomserviceOption
	| residOption
	| bundleOption
	| connectionOption
	| corbaserverOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| djarOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| mqmonitorOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| requestmodelOption
	| sessionsOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| asOption
	| exceptionOptions
	)
	;

csdStartbrgroupOptions
	: (
	listOption
	| exceptionOptions
	)
	;

csdStartbrlistOptions
	: (
	exceptionOptions
	)
	;

csdStartbrrsrceOptions
	: (
	groupOption
	| exceptionOptions
	)
	;

csdUnlockOptions
	: (
	listOption
	| groupOption
	| exceptionOptions
	)
	;

csdUserdefineOptions
	: (
	restypeOption
	| residOption
	| groupOption
	| atomserviceOption
	| bundleOption
	| connectionOption
	| corbaserverOption
	| db2connOption
	| db2entryOption
	| db2tranOption
	| djarOption
	| doctemplateOption
	| dumpcodeOption
	| enqmodelOption
	| fileOption
	| ipconnOption
	| journalmodelOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| mapsetOption
	| mqconnOption
	| mqmonitorOption
	| partitionsetOption
	| partnerOption
	| pipelineOption
	| processtypeOption
	| profileOption
	| programOption
	| requestmodelOption
	| sessionsOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| transactionOption
	| tsmodelOption
	| typetermOption
	| urimapOption
	| webserviceOption
	| nocompatOption
	| attributesOption
	| attrlenOption
	| compatmodeOption
	| compatOption
	| exceptionOptions
	)
	;

disableProgramOptions
	: (
	entrynameOption
	| exitOption
	| exitallOption
	| formatedfOption
	| stopOption
	| purgeableOption
	| shutdownOption
	| spiOption
	| taskstartOption
	| exceptionOptions
	)
	;

discardAtomserviceOptions
	: (
	exceptionOptions
	)
	;

discardAutinstmodelOptions
	: (
	exceptionOptions
	)
	;

discardBundleOptions
	: (
	exceptionOptions
	)
	;

discardConnectionOptions
	: (
	exceptionOptions
	)
	;

discardDb2connOptions
	: (
	exceptionOptions
	)
	;

discardDb2entryOptions
	: (
	exceptionOptions
	)
	;

discardDb2tranOptions
	: (
	exceptionOptions
	)
	;

discardDoctemplateOptions
	: (
	exceptionOptions
	)
	;

discardEnqmodelOptions
	: (
	exceptionOptions
	)
	;

discardFileOptions
	: (
	exceptionOptions
	)
	;

discardIpconnOptions
	: (
	exceptionOptions
	)
	;

discardJournalmodelOptions
	: (
	exceptionOptions
	)
	;

discardJournalnameOptions
	: (
	exceptionOptions
	)
	;

discardJvmserverOptions
	: (
	exceptionOptions
	)
	;

discardLibraryOptions
	: (
	exceptionOptions
	)
	;

discardMqconnOptions
	: (
	exceptionOptions
	)
	;

discardMqmonitorOptions
	: (
	exceptionOptions
	)
	;

discardPartnerOptions
	: (
	exceptionOptions
	)
	;

discardPipelineOptions
	: (
	exceptionOptions
	)
	;

discardProcesstypeOptions
	: (
	exceptionOptions
	)
	;

discardProfileOptions
	: (
	exceptionOptions
	)
	;

discardProgramOptions
	: (
	exceptionOptions
	)
	;

discardTcpipserviceOptions
	: (
	exceptionOptions
	)
	;

discardTdqueueOptions
	: (
	exceptionOptions
	)
	;

discardTerminalOptions
	: (
	exceptionOptions
	)
	;

discardTranclassOptions
	: (
	exceptionOptions
	)
	;

discardTransactionOptions
	: (
	exceptionOptions
	)
	;

discardTsmodelOptions
	: (
	exceptionOptions
	)
	;

discardUrimapOptions
	: (
	exceptionOptions
	)
	;

discardWebserviceOptions
	: (
	exceptionOptions
	)
	;

enableProgramOptions
	: (
	entryOption
	| entrynameOption
	| exitOption
	| formatedfOption
	| galengthOption
	| galocationOption
	| gaexecutableOption
	| gaentrynameOption
	| indoubtwaitOption
	| linkeditmodeOption
	| quasirentOption
	| threadsafeOption
	| openapiOption
	| requiredOption
	| openapiOption
	| openapiOption
	| purgeableOption
	| shutdownOption
	| spiOption
	| startOption
	| talengthOption
	| taexecutableOption
	| taskstartOption
	| exceptionOptions
	)
	;

extractExitOptions
	: (
	programOption
	| entrynameOption
	| galengthOption
	| gasetOption
	| exceptionOptions
	)
	;

extractStatisticsOptions
	: (
	restypeOption
	| residOption
	| residlenOption
	| setOption
	| subrestypeOption
	| subresidOption
	| subresidlenOption
	| applicationOption
	| applmajorverOption
	| applminorverOption
	| applmicroverOption
	| platformOption
	| lastresetOption
	| lastresetabsOption
	| lastresethrsOption
	| lastresetminOption
	| lastresetsecOption
	| exceptionOptions
	)
	;

inquireAssociationOptions
	: (
	acapplnameOption
	| acmajorverOption
	| acmicroverOption
	| acminorverOption
	| acopernameOption
	| acplatnameOption
	| appldataOption
	| applidOption
	| clientipaddrOption
	| clientlocOption
	| clientportOption
	| clntipfamilyOption
	| dnameOption
	| facilnameOption
	| faciltypeOption
	| inituseridOption
	| ipconnOption
	| ipfamilyOption
	| lunameOption
	| mvsimageOption
	| netidOption
	| odadptridOption
	| odadptrdata1Option
	| odadptrdata2Option
	| odadptrdata3Option
	| odapplidOption
	| odclntipaddrOption
	| odclntportOption
	| odfacilnameOption
	| odfaciltypeOption
	| odipfamilyOption
	| odlunameOption
	| odnetidOption
	| odnetworkidOption
	| odserverportOption
	| odstarttimeOption
	| odtaskidOption
	| odtcpipsOption
	| odtransidOption
	| oduseridOption
	| phapplidOption
	| phcountOption
	| phnetworkidOption
	| phstarttimeOption
	| phtaskidOption
	| phtransidOption
	| programOption
	| ptcountOption
	| ptstarttimeOption
	| pttaskidOption
	| pttransidOption
	| realmOption
	| serveripaddrOption
	| serverportOption
	| srvripfamilyOption
	| starttimeOption
	| tcpipjobOption
	| tcpipserviceOption
	| tcpipzoneOption
	| trngrpidOption
	| transactionOption
	| usercorrdataOption
	| useridOption
	| exceptionOptions
	)
	;

inquireAssociationListOptions
	: (
	listsizeOption
	| dnameOption
	| dnamelenOption
	| realmOption
	| realmlenOption
	| setOption
	| usercorrdataOption
	| exceptionOptions
	)
	;

inquireAtomserviceOptions
	: (
	startOption
	| nextOption
	| endOption
	| atomtypeOption
	| bindfileOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| configfileOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| resourcenameOption
	| resourcetypeOption
	| urimapOption
	| xmltransformOption
	| exceptionOptions
	)
	;

inquireAutinstmodelOptions
	: (
	startOption
	| nextOption
	| endOption
	| exceptionOptions
	)
	;

inquireAutoinstallOptions
	: (
	aibridgeOption
	| consolesOption
	| curreqsOption
	| enablestatusOption
	| maxreqsOption
	| programOption
	| exceptionOptions
	)
	;

inquireBrfacilityOptions
	: (
	startOption
	| nextOption
	| endOption
	| keeptimeOption
	| linksystemOption
	| linksysnetOption
	| namespaceOption
	| netnameOption
	| remotesysnetOption
	| remotesystemOption
	| taskidOption
	| termidOption
	| termstatusOption
	| transactionOption
	| useridOption
	| exceptionOptions
	)
	;

inquireBundleOptions
	: (
	startOption
	| nextOption
	| endOption
	| availstatusOption
	| basescopeOption
	| bundledirOption
	| bundleidOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| enabledcountOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| majorversionOption
	| mgmtpartOption
	| microversionOption
	| minorversionOption
	| partcountOption
	| targetcountOption
	| exceptionOptions
	)
	;

inquireBundlepartOptions
	: (
	startOption
	| nextOption
	| endOption
	| bundleOption
	| availstatusOption
	| enablestatusOption
	| metadatafileOption
	| partclassOption
	| parttypeOption
	| exceptionOptions
	)
	;

inquireCapdatapredOptions
	: (
	startOption
	| nextOption
	| endOption
	| capturespecOption
	| eventbindingOption
	| containerOption
	| fieldlengthOption
	| fieldoffsetOption
	| filenameOption
	| filtervalueOption
	| locationOption
	| operatorOption
	| structnameOption
	| variablenameOption
	| exceptionOptions
	)
	;

inquireCapinfosrceOptions
	: (
	startOption
	| nextOption
	| endOption
	| capturespecOption
	| eventbindingOption
	| containerOption
	| fieldlengthOption
	| fieldoffsetOption
	| filenameOption
	| itemnameOption
	| locationOption
	| structnameOption
	| variablenameOption
	| exceptionOptions
	)
	;

inquireCapoptpredOptions
	: (
	startOption
	| nextOption
	| endOption
	| capturespecOption
	| eventbindingOption
	| filtervalueOption
	| operatorOption
	| optionnameOption
	| exceptionOptions
	)
	;

inquireCapturespecOptions
	: (
	startOption
	| nextOption
	| endOption
	| eventbindingOption
	| capturepointOption
	| captureptypeOption
	| currpgmOption
	| currpgmopOption
	| currtranidOption
	| currtranidopOption
	| curruseridOption
	| curruseridopOption
	| eventnameOption
	| numdatapredOption
	| numinfosrceOption
	| numoptpredOption
	| primpredOption
	| primpredopOption
	| primpredtypeOption
	| exceptionOptions
	)
	;

inquireConnectionOptions
	: (
	startOption
	| nextOption
	| endOption
	| accessmethodOption
	| acqstatusOption
	| aidcountOption
	| autoconnectOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| connstatusOption
	| conntypeOption
	| cqpOption
	| definesourceOption
	| definetimeOption
	| exittracingOption
	| grnameOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| linksystemOption
	| membernameOption
	| netnameOption
	| nqnameOption
	| pendstatusOption
	| protocolOption
	| receivecountOption
	| recovstatusOption
	| remotenameOption
	| remotesysnetOption
	| remotesystemOption
	| sendcountOption
	| servstatusOption
	| xlnstatusOption
	| zcptracingOption
	| exceptionOptions
	)
	;

inquireCfdtpoolOptions
	: (
	startOption
	| nextOption
	| endOption
	| connstatusOption
	| exceptionOptions
	)
	;

inquireDb2connOptions
	: (
	accountrecOption
	| authidOption
	| authtypeOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| comauthidOption
	| comauthtypeOption
	| comthreadlimOption
	| comthreadsOption
	| connecterrorOption
	| connectstOption
	| db2groupidOption
	| db2idOption
	| db2releaseOption
	| definesourceOption
	| definetimeOption
	| drollbackOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| msgqueue1Option
	| msgqueue2Option
	| msgqueue3Option
	| nontermrelOption
	| planOption
	| planexitnameOption
	| priorityOption
	| purgecyclemOption
	| purgecyclesOption
	| resyncmemberOption
	| reuselimitOption
	| signidOption
	| standbymodeOption
	| statsqueueOption
	| tcblimitOption
	| tcbsOption
	| threaderrorOption
	| threadlimitOption
	| threadsOption
	| threadwaitOption
	| exceptionOptions
	)
	;

inquireDb2entryOptions
	: (
	startOption
	| atOption
	| nextOption
	| endOption
	| accountrecOption
	| authidOption
	| authtypeOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| disabledactOption
	| drollbackOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| planOption
	| planexitnameOption
	| priorityOption
	| protectnumOption
	| pthreadsOption
	| sharelocksOption
	| threadlimitOption
	| threadsOption
	| threadwaitOption
	| exceptionOptions
	)
	;

inquireDb2tranOptions
	: (
	startOption
	| atOption
	| nextOption
	| endOption
	| db2entryOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| planOption
	| planexitnameOption
	| transidOption
	| exceptionOptions
	)
	;

inquireDeletshippedOptions
	: (
	idleOption
	| idlehrsOption
	| idleminsOption
	| idlesecsOption
	| intervalOption
	| intervalhrsOption
	| intervalminsOption
	| intervalsecsOption
	| exceptionOptions
	)
	;

inquireDispatcherOptions
	: (
	actopentcbsOption
	| actssltcbsOption
	| actthrdtcbsOption
	| actxptcbsOption
	| maxopentcbsOption
	| maxssltcbsOption
	| maxthrdtcbsOption
	| maxxptcbsOption
	| mrobatchOption
	| prtyagingOption
	| runawayOption
	| scandelayOption
	| subtasksOption
	| timeOption
	| exceptionOptions
	)
	;

inquireDoctemplateOptions
	: (
	startOption
	| nextOption
	| endOption
	| appendcrlfOption
	| cachesizeOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| ddnameOption
	| definesourceOption
	| definetimeOption
	| dsnameOption
	| exitpgmOption
	| fileOption
	| hfsfileOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| memberOption
	| programOption
	| tdqueueOption
	| templatenameOption
	| templatetypeOption
	| tsqueueOption
	| typeOption
	| exceptionOptions
	)
	;

inquireDsnameOptions
	: (
	startOption
	| nextOption
	| endOption
	| accessmethodOption
	| availabilityOption
	| backuptypeOption
	| basedsnameOption
	| filecountOption
	| fwdrecovlogOption
	| fwdrecovlsnOption
	| objectOption
	| logrepstatusOption
	| lostlocksOption
	| quiescestateOption
	| recovstatusOption
	| retlocksOption
	| validityOption
	| exceptionOptions
	)
	;

inquireDumpdsOptions
	: (
	currentddsOption
	| initialddsOption
	| openstatusOption
	| switchstatusOption
	| exceptionOptions
	)
	;

inquireEnqOptions
	: (
	startOption
	| nextOption
	| endOption
	| enqscopeOption
	| resourceOption
	| reslenOption
	| uowOption
	| durationOption
	| enqfailsOption
	| netuowidOption
	| qualifierOption
	| quallenOption
	| relationOption
	| reslenOption
	| resourceOption
	| stateOption
	| taskidOption
	| transidOption
	| typeOption
	| uowOption
	| exceptionOptions
	)
	;

inquireEnqmodelOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| enqscopeOption
	| enqnameOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| statusOption
	| exceptionOptions
	)
	;

inquireEpadapterOptions
	: (
	startOption
	| nextOption
	| endOption
	| adaptertypeOption
	| authorityOption
	| authuseridOption
	| configdata1Option
	| dataformatOption
	| emitmodeOption
	| enablestatusOption
	| invoketypeOption
	| priorityOption
	| programOption
	| transactionOption
	| transmodeOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| exceptionOptions
	)
	;

inquireEpadaptersetOptions
	: (
	startOption
	| nextOption
	| endOption
	| enablestatusOption
	| epadapternumOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| exceptionOptions
	)
	;

inquireEpadaptinsetOptions
	: (
	startOption
	| nextOption
	| endOption
	| epadaptersetOption
	| epadapterOption
	| exceptionOptions
	)
	;

inquireEventbindingOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| epadapterOption
	| epadapterresOption
	| epadaptersetOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| usertagOption
	| exceptionOptions
	)
	;

inquireEventprocessOptions
	: (
	epstatusOption
	| schemalevelOption
	| exceptionOptions
	)
	;

inquireExciOptions
	: (
	taskOption
	| uridOption
	| exceptionOptions
	)
	;

inquireExitprogramOptions
	: (
	startOption
	| nextOption
	| endOption
	| exitOption
	| entrynameOption
	| apistOption
	| concurrentstOption
	| connectstOption
	| entryOption
	| formatedfstOption
	| gaentrynameOption
	| galengthOption
	| gausecountOption
	| indoubtstOption
	| numexitsOption
	| purgeablestOption
	| qualifierOption
	| shutdownstOption
	| spistOption
	| startstatusOption
	| talengthOption
	| taskstartstOption
	| usecountOption
	| exceptionOptions
	)
	;

inquireFeaturekeyOptions
	: (
	startOption
	| nextOption
	| endOption
	| valueOption
	| filepathOption
	| exceptionOptions
	)
	;

inquireFileOptions
	: (
	startOption
	| nextOption
	| endOption
	| accessmethodOption
	| addOption
	| basedsnameOption
	| blockformatOption
	| blockkeylenOption
	| blocksizeOption
	| browseOption
	| cfdtpoolOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| deleteOption
	| dispositionOption
	| dsnameOption
	| emptystatusOption
	| enablestatusOption
	| exclusiveOption
	| fwdrecstatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| journalnumOption
	| keylengthOption
	| keypositionOption
	| loadtypeOption
	| lsrpoolnumOption
	| maxnumrecsOption
	| objectOption
	| openstatusOption
	| rbatypeOption
	| readOption
	| readintegOption
	| recordformatOption
	| recordsizeOption
	| recovstatusOption
	| reltypeOption
	| remotenameOption
	| remotesystemOption
	| remotetableOption
	| rlsaccessOption
	| stringsOption
	| tableOption
	| tablenameOption
	| typeOption
	| updateOption
	| updatemodelOption
	| exceptionOptions
	)
	;

inquireHostOptions
	: (
	enablestatusOption
	| tcpipserviceOption
	| exceptionOptions
	)
	;

inquireIpconnOptions
	: (
	startOption
	| nextOption
	| endOption
	| applidOption
	| autoconnectOption
	| certificateOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| ciphersOption
	| clientlocOption
	| connstatusOption
	| definesourceOption
	| definetimeOption
	| haOption
	| hostOption
	| hosttypeOption
	| idpropOption
	| ipfamilyOption
	| ipresolvedOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| linkauthOption
	| maxqtimeOption
	| mirrorlifeOption
	| networkidOption
	| numciphersOption
	| partnerOption
	| pendstatusOption
	| portOption
	| queuelimitOption
	| receivecountOption
	| recovstatusOption
	| securitynameOption
	| sendcountOption
	| servstatusOption
	| ssltypeOption
	| tcpipserviceOption
	| userauthOption
	| exceptionOptions
	)
	;

inquireIpfacilityOptions
	: (
	ipconnOption
	| ipfaciltypeOption
	| exceptionOptions
	)
	;

inquireIrcOptions
	: (
	openstatusOption
	| xcfgroupOption
	| exceptionOptions
	)
	;

inquireJournalmodelOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| journalnameOption
	| streamnameOption
	| typeOption
	| exceptionOptions
	)
	;

inquireJournalnameOptions
	: (
	startOption
	| nextOption
	| endOption
	| statusOption
	| streamnameOption
	| typeOption
	| exceptionOptions
	)
	;

inquireJournalnumOptions
	: (
	startOption
	| nextOption
	| endOption
	| archstatusOption
	| diskastatusOption
	| diskbstatusOption
	| jtypeOption
	| openstatusOption
	| exceptionOptions
	)
	;

inquireJvmendpointOptions
	: (
	startOption
	| nextOption
	| endOption
	| jvmserverOption
	| enablestatusOption
	| typeOption
	| portOption
	| secportOption
	| hostOption
	| exceptionOptions
	)
	;

inquireJvmserverOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| currentheapOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| gcpolicyOption
	| initheapOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| javahomeOption
	| jvmprofileOption
	| lerunoptsOption
	| logOption
	| maxheapOption
	| occupancyOption
	| pidOption
	| profileOption
	| profiledirOption
	| stderrOption
	| stdoutOption
	| threadcountOption
	| threadlimitOption
	| traceOption
	| workdirOption
	| exceptionOptions
	)
	;

inquireLibraryOptions
	: (
	startOption
	| nextOption
	| endOption
	| applicationOption
	| applmajorverOption
	| applminorverOption
	| applmicroverOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| criticalstOption
	| definesourceOption
	| definetimeOption
	| dsnamelistOption
	| dsname01Option
	| dsname02Option
	| dsname03Option
	| dsname04Option
	| dsname05Option
	| dsname06Option
	| dsname07Option
	| dsname08Option
	| dsname09Option
	| dsname10Option
	| dsname11Option
	| dsname12Option
	| dsname13Option
	| dsname14Option
	| dsname15Option
	| dsname16Option
	| enablestatusOption
	| installagentOption
	| installusridOption
	| installtimeOption
	| numdsnamesOption
	| platformOption
	| rankingOption
	| searchposOption
	| exceptionOptions
	)
	;

inquireModenameOptions
	: (
	startOption
	| nextOption
	| endOption
	| connectionOption
	| activeOption
	| autoconnectOption
	| availableOption
	| maximumOption
	| maxwinnersOption
	| exceptionOptions
	)
	;

inquireMonitorOptions
	: (
	applnamestOption
	| compressstOption
	| conversestOption
	| dpllimitOption
	| exceptclassOption
	| filelimitOption
	| frequencyOption
	| frequencyhrsOption
	| frequencyminsOption
	| frequencysecsOption
	| idntyclassOption
	| perfclassOption
	| resrceclassOption
	| rmistOption
	| statusOption
	| syncpointstOption
	| timeOption
	| tsqueuelimitOption
	| urimaplimitOption
	| webservlimitOption
	| exceptionOptions
	)
	;

inquireMqconnOptions
	: (
	changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| connectstOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| mqnameOption
	| mqqmgrOption
	| mqreleaseOption
	| resyncmemberOption
	| tasksOption
	| trigmontasksOption
	| exceptionOptions
	)
	;

inquireMqiniOptions
	: (
	changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| initqnameOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| exceptionOptions
	)
	;

inquireMqmonitorOptions
	: (
	autostartOption
	| changeagentOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| mondataOption
	| monstatusOption
	| monuseridOption
	| qnameOption
	| taskidOption
	| transactionOption
	| useridOption
	| exceptionOptions
	)
	;

inquireMvstcbOptions
	: (
	startOption
	| nextOption
	| endOption
	| setOption
	| numelementsOption
	| elementlistOption
	| lengthlistOption
	| subpoollistOption
	| exceptionOptions
	)
	;

inquireNetnameOptions
	: (
	startOption
	| nextOption
	| endOption
	| terminalOption
	| accessmethodOption
	| acqstatusOption
	| aidcountOption
	| altpagehtOption
	| altpagewdOption
	| altprinterOption
	| altprtcopystOption
	| altscrnhtOption
	| altscrnwdOption
	| altsuffixOption
	| aplkybdstOption
	| apltextstOption
	| asciiOption
	| atistatusOption
	| audalarmstOption
	| autoconnectOption
	| backtransstOption
	| colorstOption
	| consoleOption
	| copystOption
	| correlidOption
	| createsessOption
	| datastreamOption
	| defpagehtOption
	| defpagewdOption
	| defscrnhtOption
	| defscrnwdOption
	| deviceOption
	| discreqstOption
	| dualcasestOption
	| exittracingOption
	| extendeddsstOption
	| fmhparmstOption
	| formfeedstOption
	| gcharsOption
	| gcodesOption
	| hformstOption
	| hilightstOption
	| katakanastOption
	| lightpenstOption
	| linksystemOption
	| mapnameOption
	| mapsetnameOption
	| modenameOption
	| msrcontrolstOption
	| natlangOption
	| exceptionOptions
	)
	;

inquireNodejsappOptions
	: (
	startOption
	| nextOption
	| endOption
	| bundleOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| lerunoptsOption
	| logOption
	| nodehomeOption
	| pidOption
	| profileOption
	| startscriptOption
	| stderrOption
	| stdoutOption
	| traceOption
	| exceptionOptions
	)
	;

inquireOsgibundleOptions
	: (
	startOption
	| nextOption
	| endOption
	| osgiversionOption
	| jvmserverOption
	| bundleOption
	| bundlepartOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| osgibundleidOption
	| osgistatusOption
	| exceptionOptions
	)
	;

inquireOsgiserviceOptions
	: (
	startOption
	| nextOption
	| endOption
	| jvmserverOption
	| bundleOption
	| bundlepartOption
	| osgibundleOption
	| osgiversionOption
	| srvcnameOption
	| srvcstatusOption
	| exceptionOptions
	)
	;

inquirePartnerOptions
	: (
	startOption
	| nextOption
	| endOption
	| networkOption
	| netnameOption
	| profileOption
	| tpnameOption
	| tpnamelenOption
	| exceptionOptions
	)
	;

inquirePipelineOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| ciddomainOption
	| configfileOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| modeOption
	| msgformatOption
	| mtomnoxopstOption
	| mtomstOption
	| respwaitOption
	| sendmtomstOption
	| shelfOption
	| soaplevelOption
	| soaprnumOption
	| soapvnumOption
	| wsdirOption
	| xopdirectstOption
	| xopsupportstOption
	| exceptionOptions
	)
	;

inquirePolicyOptions
	: (
	startOption
	| nextOption
	| endOption
	| bundleOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| usertagOption
	| exceptionOptions
	)
	;

inquirePolicyruleOptions
	: (
	startOption
	| nextOption
	| endOption
	| policyOption
	| abendcodeOption
	| actioncountOption
	| actiontypeOption
	| epadapterOption
	| epadaptersetOption
	| lastacttimeOption
	| rulegroupOption
	| ruleitemOption
	| ruletypeOption
	| thresholdOption
	| wlmopenstOption
	| exceptionOptions
	)
	;

inquireProcesstypeOptions
	: (
	startOption
	| nextOption
	| endOption
	| auditlogOption
	| auditlevelOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| fileOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| statusOption
	| exceptionOptions
	)
	;

inquireProfileOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| exceptionOptions
	)
	;

inquireProgramOptions
	: (
	startOption
	| atOption
	| nextOption
	| endOption
	| apistOption
	| applicationOption
	| applmajorverOption
	| applminorverOption
	| applmicroverOption
	| cedfstatusOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| coboltypeOption
	| copyOption
	| concurrencyOption
	| datalocationOption
	| definesourceOption
	| definetimeOption
	| dynamstatusOption
	| entrypointOption
	| execkeyOption
	| executionsetOption
	| holdstatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| jvmclassOption
	| jvmprofileOption
	| jvmserverOption
	| langdeducedOption
	| languageOption
	| lengthOption
	| libraryOption
	| librarydsnOption
	| loadpointOption
	| lpastatusOption
	| operationOption
	| platformOption
	| progtypeOption
	| remotenameOption
	| remotesystemOption
	| replicationOption
	| rescountOption
	| residencyOption
	| sharestatusOption
	| statusOption
	| runtimeOption
	| transidOption
	| usecountOption
	| exceptionOptions
	)
	;

inquireReqidOptions
	: (
	startOption
	| nextOption
	| endOption
	| reqtypeOption
	| termidOption
	| transidOption
	| timeOption
	| intervalOption
	| afterOption
	| atOption
	| hoursOption
	| minutesOption
	| secondsOption
	| setOption
	| lengthOption
	| fmhstatusOption
	| rtransidOption
	| rtermidOption
	| queueOption
	| useridOption
	| exceptionOptions
	)
	;

inquireRrmsOptions
	: (
	openstatusOption
	| exceptionOptions
	)
	;

inquireSecrecordingOptions
	: (
	startOption
	| nextOption
	| endOption
	| maximumOption
	| currentOption
	| odadptridOption
	| odadptrdata1Option
	| odadptrdata2Option
	| odadptrdata3Option
	| odapplidOption
	| odclntipaddrOption
	| odclntipaddrOption
	| odclntportOption
	| odfacilnameOption
	| odfaciltypeOption
	| odipfamilyOption
	| odlunameOption
	| odnetidOption
	| odnetworkidOption
	| odserverportOption
	| odtcpipsOption
	| odtransidOption
	| oduseridOption
	| exceptionOptions
	)
	;

inquireStatisticsOptions
	: (
	endofdayOption
	| endofdayhrsOption
	| endofdayminsOption
	| endofdaysecsOption
	| intervalOption
	| intervalhrsOption
	| intervalminsOption
	| intervalsecsOption
	| nexttimeOption
	| nexttimehrsOption
	| nexttimeminsOption
	| nexttimesecsOption
	| recordingOption
	| exceptionOptions
	)
	;

inquireStorageOptions
	: (
	addressOption
	| dsanameOption
	| elementOption
	| numelementsOption
	| flengthOption
	| elementlistOption
	| lengthlistOption
	| taskOption
	| exceptionOptions
	)
	;

inquireStorage64Options
	: (
	address64Option
	| dsanameOption
	| numelementsOption
	| element64Option
	| flengthOption
	| elementlistOption
	| lengthlistOption
	| taskOption
	| exceptionOptions
	)
	;

inquireStreamnameOptions
	: (
	startOption
	| nextOption
	| endOption
	| statusOption
	| systemlogOption
	| usecountOption
	| exceptionOptions
	)
	;

inquireSubpoolOptions
	: (
	startOption
	| nextOption
	| endOption
	| dsanameOption
	| exceptionOptions
	)
	;

inquireSysdumpcodeOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| currentOption
	| daeoptionOption
	| definesourceOption
	| definetimeOption
	| dsplistOption
	| dumpscopeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| joblistOption
	| maximumOption
	| shutoptionOption
	| sysdumpingOption
	| exceptionOptions
	)
	;

inquireSystemOptions
	: (
	actopentcbsOption
	| memlimitOption
	| aidcountOption
	| messagecaseOption
	| akpOption
	| mqconnOption
	| cdsasizeOption
	| mrobatchOption
	| cicsstatusOption
	| mvssmfidOption
	| cicssysOption
	| mvssysnameOption
	| cicstslevelOption
	| oprelOption
	| cmdprotectOption
	| opsysOption
	| coldstatusOption
	| oslevelOption
	| db2connOption
	| pcdsasizeOption
	| debugtoolOption
	| pltpiusrOption
	| dfltuserOption
	| progautoctlgOption
	| dsalimitOption
	| progautoexitOption
	| dsrtprogramOption
	| progautoinstOption
	| dtrprogramOption
	| prtyagingOption
	| dumpingOption
	| pudsasizeOption
	| ecdsasizeOption
	| rdsasizeOption
	| edsalimitOption
	| reentprotectOption
	| epcdsasizeOption
	| regionuseridOption
	| epudsasizeOption
	| releaseOption
	| erdsasizeOption
	| rlsstatusOption
	| esdsasizeOption
	| etdsasizeOption
	| runawayOption
	| eudsasizeOption
	| scandelayOption
	| forceqrOption
	| sdsasizeOption
	| gcdsasizeOption
	| sdtmemlimitOption
	| gmmtextOption
	| sdtranOption
	| gmmlengthOption
	| securitymgrOption
	| gsdsasizeOption
	| shutstatusOption
	| gudsasizeOption
	| sosabovebarOption
	| gmmtranidOption
	| sosabovelineOption
	| healthcheckOption
	| sosbelowlineOption
	| initstatusOption
	| sosstatusOption
	| jobnameOption
	| srrtasksOption
	| lastcoldtimeOption
	| startupOption
	| lastemertimeOption
	| startupdateOption
	| lastinittimeOption
	| storeprotectOption
	| lastwarmtimeOption
	| timeOption
	| logdeferOption
	| tranisolateOption
	| maxopentcbsOption
	| udsasizeOption
	| maxtasksOption
	| xrfstatusOption
	| exceptionOptions
	)
	;

inquireTagOptions
	: (
	startOption
	| nextOption
	| endOption
	| exceptionOptions
	)
	;

inquireTaskOptions
	: (
	activityOption
	| activityidOption
	| attachtimeOption
	| brfacilityOption
	| bridgeOption
	| cmdsecOption
	| currentprogOption
	| db2planOption
	| dtimeoutOption
	| dumpingOption
	| facilityOption
	| facilitytypeOption
	| identifierOption
	| indoubtOption
	| indoubtminsOption
	| indoubtwaitOption
	| ipfacilitiesOption
	| ipflistsizeOption
	| isolatestOption
	| priorityOption
	| processOption
	| processtypeOption
	| profileOption
	| programOption
	| purgeabilityOption
	| remotenameOption
	| remotesystemOption
	| resnameOption
	| ressecOption
	| routingOption
	| rtimeoutOption
	| runawayOption
	| runstatusOption
	| scrnsizeOption
	| srrstatusOption
	| startcodeOption
	| storageclearOption
	| suspendtimeOption
	| suspendtypeOption
	| suspendvalueOption
	| taskdatakeyOption
	| taskdatalocOption
	| tcbOption
	| tranclassOption
	| tclassOption
	| tracingOption
	| tranpriorityOption
	| transactionOption
	| trprofOption
	| twasizeOption
	| uowOption
	| useridOption
	| exceptionOptions
	)
	;

inquireTaskListOptions
	: (
	listsizeOption
	| dispatchableOption
	| runningOption
	| setOption
	| suspendedOption
	| settransidOption
	| exceptionOptions
	)
	;

inquireTclassOptions
	: (
	currentOption
	| maximumOption
	| exceptionOptions
	)
	;

inquireTcpipOptions
	: (
	actsocketsOption
	| crlprofileOption
	| maxsocketsOption
	| openstatusOption
	| sslcacheOption
	| exceptionOptions
	)
	;

inquireTcpipserviceOptions
	: (
	attachsecOption
	| attlsOption
	| authenticateOption
	| backlogOption
	| certificateOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| ciphersOption
	| closetimeoutOption
	| connectionsOption
	| definesourceOption
	| definetimeOption
	| generictcpsOption
	| hostOption
	| hosttypeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| ipaddressOption
	| ipfamilyOption
	| ipresolvedOption
	| maxdatalenOption
	| maxpersistOption
	| numciphersOption
	| openstatusOption
	| optionspgmOption
	| portOption
	| privacyOption
	| protocolOption
	| realmOption
	| socketcloseOption
	| speciftcpsOption
	| ssltypeOption
	| transidOption
	| urmOption
	| exceptionOptions
	)
	;

inquireTdqueueOptions
	: (
	startOption
	| nextOption
	| endOption
	| atifacilityOption
	| atitermidOption
	| atitranidOption
	| atiuseridOption
	| blockformatOption
	| blocksizeOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| databuffersOption
	| ddnameOption
	| definesourceOption
	| definetimeOption
	| dispositionOption
	| dsnameOption
	| emptystatusOption
	| enablestatusOption
	| erroroptionOption
	| indirectnameOption
	| indoubtOption
	| indoubtwaitOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| iotypeOption
	| memberOption
	| numitemsOption
	| openstatusOption
	| printcontrolOption
	| recordformatOption
	| recordlengthOption
	| recovstatusOption
	| remotenameOption
	| remotesystemOption
	| rewindOption
	| sysoutclassOption
	| triggerlevelOption
	| typeOption
	| exceptionOptions
	)
	;

inquireTempstorageOptions
	: (
	tsmaininuseOption
	| tsmainlimitOption
	| exceptionOptions
	)
	;

inquireTerminalOptions
	: (
	startOption
	| nextOption
	| endOption
	| netnameOption
	| accessmethodOption
	| acqstatusOption
	| aidcountOption
	| altpagehtOption
	| altpagewdOption
	| altprinterOption
	| altprtcopystOption
	| altscrnhtOption
	| altscrnwdOption
	| altsuffixOption
	| aplkybdstOption
	| apltextstOption
	| asciiOption
	| atistatusOption
	| audalarmstOption
	| autoconnectOption
	| backtransstOption
	| colorstOption
	| consoleOption
	| copystOption
	| correlidOption
	| createsessOption
	| datastreamOption
	| defpagehtOption
	| defpagewdOption
	| defscrnhtOption
	| defscrnwdOption
	| deviceOption
	| discreqstOption
	| dualcasestOption
	| exittracingOption
	| extendeddsstOption
	| fmhparmstOption
	| formfeedstOption
	| gcharsOption
	| gcodesOption
	| hformstOption
	| hilightstOption
	| katakanastOption
	| lightpenstOption
	| linksystemOption
	| mapnameOption
	| mapsetnameOption
	| modenameOption
	| msrcontrolstOption
	| natlangOption
	| natureOption
	| nexttransidOption
	| nqnameOption
	| obformatstOption
	| oboperidstOption
	| operidOption
	| outlinestOption
	| pagehtOption
	| pagestatusOption
	| pagewdOption
	| partitionsstOption
	| printadaptstOption
	| printerOption
	| progsymbolstOption
	| prtcopystOption
	| querystOption
	| relreqstOption
	| remotenameOption
	| remotesysnetOption
	| remotesystemOption
	| scrnhtOption
	| scrnwdOption
	| securityOption
	| servstatusOption
	| sessiontypeOption
	| signonstatusOption
	| sosistOption
	| taskidOption
	| tcamcontrolOption
	| termmodelOption
	| termpriorityOption
	| termstatusOption
	| textkybdstOption
	| textprintstOption
	| tnaddrOption
	| tnipfamilyOption
	| tnportOption
	| tracingOption
	| transactionOption
	| ttistatusOption
	| uctranstOption
	| userareaOption
	| userarealenOption
	| useridOption
	| usernameOption
	| validationstOption
	| vformstOption
	| zcptracingOption
	| exceptionOptions
	)
	;

inquireTracedestOptions
	: (
	auxstatusOption
	| curauxdsOption
	| gtfstatusOption
	| intstatusOption
	| switchstatusOption
	| tablesizeOption
	| exceptionOptions
	)
	;

inquireTraceflagOptions
	: (
	singlestatusOption
	| systemstatusOption
	| tcexitstatusOption
	| userstatusOption
	| exceptionOptions
	)
	;

inquireTracetypeOptions
	: (
	flagsetOption
	| specialOption
	| compidOption
	| standardOption
	| exceptionOptions
	)
	;

inquireTranclassOptions
	: (
	startOption
	| atOption
	| nextOption
	| endOption
	| activeOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| maxactiveOption
	| purgethreshOption
	| queuedOption
	| exceptionOptions
	)
	;

inquireTrandumpcodeOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| currentOption
	| definesourceOption
	| definetimeOption
	| dumpscopeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| maximumOption
	| shutoptionOption
	| sysdumpingOption
	| trandumpingOption
	| exceptionOptions
	)
	;

inquireTransactionOptions
	: (
	startOption
	| atOption
	| nextOption
	| endOption
	| applicationOption
	| applmajorverOption
	| applmicroverOption
	| availstatusOption
	| applminorverOption
	| brexitOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| cmdsecOption
	| definesourceOption
	| definetimeOption
	| dtimeoutOption
	| dumpingOption
	| facilitylikeOption
	| indoubtOption
	| indoubtminsOption
	| indoubtwaitOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| isolatestOption
	| operationOption
	| otstimeoutOption
	| platformOption
	| priorityOption
	| profileOption
	| programOption
	| purgeabilityOption
	| remotenameOption
	| remotesystemOption
	| ressecOption
	| routingOption
	| routestatusOption
	| rtimeoutOption
	| runawayOption
	| runawaytypeOption
	| scrnsizeOption
	| shutdownOption
	| statusOption
	| storageclearOption
	| taskdatakeyOption
	| taskdatalocOption
	| tclassOption
	| tranclassOption
	| tracingOption
	| trprofOption
	| twasizeOption
	| exceptionOptions
	)
	;

inquireTsmodelOptions
	: (
	startOption
	| nextOption
	| endOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| expiryintOption
	| expiryintminOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| locationOption
	| poolnameOption
	| prefixOption
	| recovstatusOption
	| remoteprefixOption
	| remotesystemOption
	| securitystOption
	| exceptionOptions
	)
	;

inquireTspoolOptions
	: (
	startOption
	| nextOption
	| endOption
	| connstatusOption
	| exceptionOptions
	)
	;

inquireTsqueueOptions
	: (
	startOption
	| atOption
	| nextOption
	| endOption
	| poolnameOption
	| sysidOption
	| expiryintOption
	| expiryintminOption
	| flengthOption
	| lastusedintOption
	| locationOption
	| maxitemlenOption
	| minitemlenOption
	| numitemsOption
	| recovstatusOption
	| transidOption
	| tsmodelOption
	| exceptionOptions
	)
	;

inquireTsqnameOptions
	: (
	startOption
	| atOption
	| nextOption
	| endOption
	| poolnameOption
	| sysidOption
	| expiryintOption
	| expiryintminOption
	| flengthOption
	| lastusedintOption
	| locationOption
	| maxitemlenOption
	| minitemlenOption
	| numitemsOption
	| recovstatusOption
	| transidOption
	| tsmodelOption
	| exceptionOptions
	)
	;

inquireUowOptions
	: (
	startOption
	| nextOption
	| endOption
	| ageOption
	| linkOption
	| netnameOption
	| netuowidOption
	| otstidOption
	| sysidOption
	| taskidOption
	| termidOption
	| transidOption
	| uowstateOption
	| useridOption
	| waitcauseOption
	| waitstateOption
	| exceptionOptions
	)
	;

inquireUowdsnfailOptions
	: (
	startOption
	| nextOption
	| endOption
	| causeOption
	| dsnameOption
	| netnameOption
	| reasonOption
	| uowOption
	| rlsaccessOption
	| sysidOption
	| exceptionOptions
	)
	;

inquireUowenqOptions
	: (
	startOption
	| nextOption
	| endOption
	| enqscopeOption
	| resourceOption
	| uowOption
	| enqfailsOption
	| netuowidOption
	| qualifierOption
	| quallenOption
	| relationOption
	| reslenOption
	| stateOption
	| typeOption
	| transidOption
	| taskidOption
	| durationOption
	| exceptionOptions
	)
	;

inquireUowlinkOptions
	: (
	startOption
	| nextOption
	| endOption
	| hostOption
	| portOption
	| branchqualOption
	| linkOption
	| netuowidOption
	| protocolOption
	| rmiqfyOption
	| roleOption
	| typeOption
	| sysidOption
	| resyncstatusOption
	| uowOption
	| uridOption
	| xidOption
	| exceptionOptions
	)
	;

inquireUrimapOptions
	: (
	startOption
	| nextOption
	| endOption
	| analyzerstatOption
	| applicationOption
	| applmajorverOption
	| applminorverOption
	| applmicroverOption
	| atomserviceOption
	| authenticateOption
	| availstatusOption
	| certificateOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| charactersetOption
	| ciphersOption
	| converterOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| hfsfileOption
	| hostOption
	| hostcodepageOption
	| hosttypeOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| ipfamilyOption
	| ipresolvedOption
	| locationOption
	| mediatypeOption
	| numciphersOption
	| operationOption
	| pathOption
	| pipelineOption
	| platformOption
	| portOption
	| programOption
	| redirecttypeOption
	| schemeOption
	| socketcloseOption
	| sockpoolsizeOption
	| tcpipserviceOption
	| templatenameOption
	| transactionOption
	| usageOption
	| useridOption
	| webserviceOption
	| exceptionOptions
	)
	;

inquireVtamOptions
	: (
	grnameOption
	| grstatusOption
	| openstatusOption
	| pstypeOption
	| psdintervalOption
	| psdinthrsOption
	| psdintminsOption
	| psdintsecsOption
	| exceptionOptions
	)
	;

inquireWebOptions
	: (
	garbageintOption
	| timeoutintOption
	| exceptionOptions
	)
	;

inquireWebserviceOptions
	: (
	startOption
	| nextOption
	| endOption
	| archivefileOption
	| bindingOption
	| ccsidOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| containerOption
	| definesourceOption
	| definetimeOption
	| endpointOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| lastmodtimeOption
	| mappinglevelOption
	| mappingrnumOption
	| mappingvnumOption
	| minrunlevelOption
	| minrunrnumOption
	| minrunvnumOption
	| pgminterfaceOption
	| pipelineOption
	| programOption
	| stateOption
	| urimapOption
	| validationstOption
	| wsbindOption
	| wsdlfileOption
	| xopdirectstOption
	| xopsupportstOption
	| exceptionOptions
	)
	;

inquireWlmhealthOptions
	: (
	adjustmentOption
	| healthOption
	| healthabstimOption
	| intervalOption
	| openstatusOption
	| exceptionOptions
	)
	;

inquireWorkrequestOptions
	: (
	startOption
	| nextOption
	| endOption
	| worktypeOption
	| clientipaddrOption
	| clntip6addrOption
	| clntipfamilyOption
	| corbaserverOption
	| listenerportOption
	| oapplidOption
	| otaskOption
	| otransidOption
	| requestidOption
	| stackOption
	| targetsysOption
	| taskOption
	| transidOption
	| tsystemOption
	| tsystypeOption
	| exceptionOptions
	)
	;

inquireXmltransformOptions
	: (
	startOption
	| nextOption
	| endOption
	| bundleOption
	| ccsidOption
	| changeagentOption
	| changeagrelOption
	| changetimeOption
	| changeusridOption
	| definesourceOption
	| definetimeOption
	| enablestatusOption
	| installagentOption
	| installtimeOption
	| installusridOption
	| mappinglevelOption
	| mappingrnumOption
	| mappingvnumOption
	| minrunlevelOption
	| minrunrnumOption
	| minrunvnumOption
	| validationstOption
	| xmlschemaOption
	| xsdbindOption
	| exceptionOptions
	)
	;

performDeletshippedOptions
	: (
	exceptionOptions
	)
	;

performDumpOptions
	: (
	dumpcodeOption
	| titleOption
	| titlelengthOption
	| callerOption
	| callerlengthOption
	| dumpidOption
	| exceptionOptions
	)
	;

performEndaffinityOptions
	: (
	netnameOption
	| netidOption
	| exceptionOptions
	)
	;

performJvmserverOptions
	: (
	jvmtypeOption
	| jvmactionOption
	| jvmOption
	| dumpOption
	| dumptypeOption
	| allOption
	| javacoreOption
	| heapOption
	| snaptraceOption
	| gatherOption
	| gathertypeOption
	| diagnosticsOption
	| stacktraceOption
	| taskidOption
	| libertyOption
	| librtyactionOption
	| refreshOption
	| resourcetypeOption
	| applicationOption
	| appidOption
	| appidlenOption
	| configOption
	| serverdumpOption
	| osgiOption
	| osgiactionOption
	| refreshpkgsOption
	| exceptionOptions
	)
	;

performPipelineOptions
	: (
	actionOption
	| scanOption
	| exceptionOptions
	)
	;

performResettimeOptions
	: (
	exceptionOptions
	)
	;

performSecurityRebuildOptions
	: (
	esmrespOption
	| exceptionOptions
	)
	;

performShutdownOptions
	: (
	pltOption
	| pltnameOption
	| restartOption
	| sdtranOption
	| nosdtranOption
	| xltOption
	| dumpOption
	| exceptionOptions
	)
	;

performShutdownImmediateOptions
	: (
	norestartOption
	| sdtranOption
	| dumpOption
	| nosdtranOption
	| exceptionOptions
	)
	;

performShutdownTakeoverOptions
	: (
	sdtranOption
	| dumpOption
	| nosdtranOption
	| exceptionOptions
	)
	;

performSslRebuildOptions
	: (
	gskrespOption
	| exceptionOptions
	)
	;

performStatisticsRecordOptions
	: (
	allOption
	| resetnowOption
	| asyncserviceOption
	| atomserviceOption
	| autoinstallOption
	| bundleOption
	| capturespecOption
	| cipherOption
	| connectionOption
	| db2Option
	| dispatcherOption
	| doctemplateOption
	| enqueueOption
	| epadapterOption
	| eventbindingOption
	| eventprocessOption
	| fepiOption
	| fileOption
	| ipconnOption
	| journalnameOption
	| journalnumOption
	| jvmprogramOption
	| jvmserverOption
	| libraryOption
	| lsrpoolOption
	| monitorOption
	| mqconnOption
	| mqmonitorOption
	| nodejsappOption
	| pipelineOption
	| policyOption
	| progautoOption
	| programOption
	| programdefOption
	| recoveryOption
	| securityOption
	| statsOption
	| storageOption
	| streamnameOption
	| sysdumpOption
	| tablemgrOption
	| tcpipOption
	| tcpipserviceOption
	| tdqueueOption
	| terminalOption
	| tranclassOption
	| tclassOption
	| trandumpOption
	| transactionOption
	| tsqueueOption
	| urimapOption
	| userOption
	| vtamOption
	| webserviceOption
	| xmltransformOption
	| exceptionOptions
	)
	;

resyncEntrynameOptions
	: (
	idlistOption
	| qualifierOption
	| idlistlengthOption
	| partialOption
	| exceptionOptions
	)
	;

setAssociationUsercorrdataOptions
	: (
	exceptionOptions
	)
	;

setAtomserviceOptions
	: (
	enablestatusOption
	| disabledOption
	| enabledOption
	| exceptionOptions
	)
	;

setAutoinstallOptions
	: (
	aibridgeOption
	| consolesOption
	| programOption
	| maxreqsOption
	| exceptionOptions
	)
	;

setBrfacilityOptions
	: (
	termstatusOption
	| releasedOption
	| exceptionOptions
	)
	;

setBundleOptions
	: (
	availstatusOption
	| availableOption
	| unavailableOption
	| enablestatusOption
	| enabledOption
	| disabledOption
	| copyOption
	| phaseinOption
	| exceptionOptions
	)
	;

setConnectionOptions
	: (
	acqstatusOption
	| connstatusOption
	| acquiredOption
	| releasedOption
	| affinityOption
	| endaffinityOption
	| exittracingOption
	| exittraceOption
	| noexittraceOption
	| pendstatusOption
	| notpendingOption
	| purgetypeOption
	| cancelOption
	| forcecancelOption
	| forcepurgeOption
	| killOption
	| purgeOption
	| recovstatusOption
	| norecovdataOption
	| servstatusOption
	| inserviceOption
	| outserviceOption
	| uowactionOption
	| backoutOption
	| commitOption
	| forceuowOption
	| resyncOption
	| zcptracingOption
	| nozcptraceOption
	| zcptraceOption
	| exceptionOptions
	)
	;

setDb2connOptions
	: (
	accountrecOption
	| uowOption
	| taskOption
	| txidOption
	| noneOption
	| authidOption
	| authtypeOption
	| groupOption
	| signOption
	| termOption
	| txOption
	| opidOption
	| useridOption
	| busyOption
	| waitOption
	| nowaitOption
	| forceOption
	| comauthidOption
	| comauthtypeOption
	| cgroupOption
	| csignOption
	| ctermOption
	| ctxOption
	| copidOption
	| cuseridOption
	| comthreadlimOption
	| connecterrorOption
	| abendOption
	| sqlcodeOption
	| connectstOption
	| connectedOption
	| notconnectedOption
	| db2groupidOption
	| db2idOption
	| msgqueue1Option
	| msgqueue2Option
	| msgqueue3Option
	| nontermrelOption
	| releaseOption
	| noreleaseOption
	| planOption
	| planexitnameOption
	| priorityOption
	| highOption
	| equalOption
	| lowOption
	| purgecyclemOption
	| purgecyclesOption
	| resyncmemberOption
	| resyncOption
	| noresyncOption
	| reuselimitOption
	| securityOption
	| signidOption
	| standbymodeOption
	| noconnectOption
	| connectOption
	| reconnectOption
	| statsqueueOption
	| tcblimitOption
	| threadlimitOption
	| threadwaitOption
	| twaitOption
	| notwaitOption
	| exceptionOptions
	)
	;

setDb2entryOptions
	: (
	accountrecOption
	| uowOption
	| taskOption
	| txidOption
	| noneOption
	| authidOption
	| authtypeOption
	| groupOption
	| signOption
	| termOption
	| txOption
	| opidOption
	| useridOption
	| busyOption
	| waitOption
	| nowaitOption
	| forceOption
	| disabledactOption
	| abendOption
	| sqlcodeOption
	| poolOption
	| enablestatusOption
	| enabledOption
	| disabledOption
	| planOption
	| planexitnameOption
	| priorityOption
	| highOption
	| equalOption
	| lowOption
	| protectnumOption
	| sharelocksOption
	| yesOption
	| noOption
	| threadlimitOption
	| threadwaitOption
	| twaitOption
	| notwaitOption
	| tpoolOption
	| exceptionOptions
	)
	;

setDb2tranOptions
	: (
	db2entryOption
	| transidOption
	| exceptionOptions
	)
	;

setDeletshippedOptions
	: (
	idleOption
	| idlehrsOption
	| idleminsOption
	| idlesecsOption
	| intervalOption
	| intervalhrsOption
	| intervalminsOption
	| intervalsecsOption
	| exceptionOptions
	)
	;

setDispatcherOptions
	: (
	maxopentcbsOption
	| maxssltcbsOption
	| maxxptcbsOption
	| mrobatchOption
	| prtyagingOption
	| runawayOption
	| scandelayOption
	| timeOption
	| exceptionOptions
	)
	;

setDoctemplateOptions
	: (
	copyOption
	| newcopyOption
	| exceptionOptions
	)
	;

setDsnameOptions
	: (
	actionOption
	| removeOption
	| recoveredOption
	| resetlocksOption
	| retryOption
	| availabilityOption
	| availableOption
	| rreplOption
	| unavailableOption
	| quescestateOption
	| quiescedOption
	| immquiescedOption
	| unquiescedOption
	| busyOption
	| waitOption
	| nowaitOption
	| uowactionOption
	| backoutOption
	| commitOption
	| forceOption
	| exceptionOptions
	)
	;

setDumpdsOptions
	: (
	initialddsOption
	| openstatusOption
	| closedOption
	| openOption
	| switchOption
	| switchstatusOption
	| noswitchOption
	| switchnextOption
	| switchallOption
	| exceptionOptions
	)
	;

setEnqmodelOptions
	: (
	statusOption
	| disabledOption
	| enabledOption
	| exceptionOptions
	)
	;

setEpadapterOptions
	: (
	enablestatusOption
	| disabledOption
	| enabledOption
	| exceptionOptions
	)
	;

setEpadaptersetOptions
	: (
	enablestatusOption
	| disabledOption
	| enabledOption
	| exceptionOptions
	)
	;

setEventbindingOptions
	: (
	enablestatusOption
	| disabledOption
	| enabledOption
	| exceptionOptions
	)
	;

setEventprocessOptions
	: (
	epstatusOption
	| startedOption
	| drainOption
	| stoppedOption
	| exceptionOptions
	)
	;

setFileOptions
	: (
	addOption
	| addableOption
	| notaddableOption
	| browseOption
	| browsableOption
	| notbrowsableOption
	| busyOption
	| waitOption
	| forceOption
	| nowaitOption
	| cfdtpoolOption
	| deleteOption
	| deletableOption
	| notdeletableOption
	| dispositionOption
	| oldOption
	| shareOption
	| emptystatusOption
	| emptyOption
	| emptyreqOption
	| noemptyreqOption
	| dsnameOption
	| objectnameOption
	| enablestatusOption
	| disabledOption
	| enabledOption
	| openstatusOption
	| closedOption
	| openOption
	| exclusiveOption
	| exctlOption
	| noexctlOption
	| keylengthOption
	| lsrpoolnumOption
	| loadtypeOption
	| loadOption
	| noloadOption
	| maxnumrecsOption
	| readOption
	| notreadableOption
	| readableOption
	| recordsizeOption
	| readintegOption
	| uncommittedOption
	| consistentOption
	| repeatableOption
	| rlsaccessOption
	| rlsOption
	| notrlsOption
	| stringsOption
	| tableOption
	| cftableOption
	| cicstableOption
	| nottableOption
	| usertableOption
	| tablenameOption
	| updateOption
	| notupdatableOption
	| updatableOption
	| updatemodelOption
	| contentionOption
	| lockingOption
	| exceptionOptions
	)
	;

setDatasetOptions
	: (
	addOption
	| addableOption
	| notaddableOption
	| browseOption
	| browsableOption
	| notbrowsableOption
	| busyOption
	| waitOption
	| forceOption
	| nowaitOption
	| cfdtpoolOption
	| deleteOption
	| deletableOption
	| notdeletableOption
	| dispositionOption
	| oldOption
	| shareOption
	| emptystatusOption
	| emptyOption
	| emptyreqOption
	| noemptyreqOption
	| dsnameOption
	| objectnameOption
	| enablestatusOption
	| disabledOption
	| enabledOption
	| openstatusOption
	| closedOption
	| openOption
	| exclusiveOption
	| exctlOption
	| noexctlOption
	| keylengthOption
	| lsrpoolnumOption
	| loadtypeOption
	| loadOption
	| noloadOption
	| maxnumrecsOption
	| readOption
	| notreadableOption
	| readableOption
	| recordsizeOption
	| readintegOption
	| uncommittedOption
	| consistentOption
	| repeatableOption
	| rlsaccessOption
	| rlsOption
	| notrlsOption
	| stringsOption
	| tableOption
	| cftableOption
	| cicstableOption
	| nottableOption
	| usertableOption
	| tablenameOption
	| updateOption
	| notupdatableOption
	| updatableOption
	| updatemodelOption
	| contentionOption
	| lockingOption
	| exceptionOptions
	)
	;

setHostOptions
	: (
	enablestatusOption
	| disabledOption
	| enabledOption
	| exceptionOptions
	)
	;

setIpconnOptions
	: (
	connstatusOption
	| acquiredOption
	| releasedOption
	| pendstatusOption
	| notpendingOption
	| purgetypeOption
	| cancelOption
	| forcecancelOption
	| forcepurgeOption
	| killOption
	| purgeOption
	| recovstatusOption
	| norecovdataOption
	| servstatusOption
	| inserviceOption
	| outserviceOption
	| uowactionOption
	| backoutOption
	| commitOption
	| forceuowOption
	| resyncOption
	| exceptionOptions
	)
	;

setIrcOptions
	: (
	openstatusOption
	| closedOption
	| immcloseOption
	| openOption
	| exceptionOptions
	)
	;

setJournalnameOptions
	: (
	actionOption
	| flushOption
	| resetOption
	| statusOption
	| disabledOption
	| enabledOption
	| exceptionOptions
	)
	;

setJournalnumOptions
	: (
	openstatusOption
	| advanceOption
	| closedOption
	| closeleaveOption
	| openoutputOption
	| exceptionOptions
	)
	;

setJvmendpointOptions
	: (
	jvmserverOption
	| enablestatusOption
	| enabledOption
	| disabledOption
	| exceptionOptions
	)
	;

setJvmserverOptions
	: (
	threadlimitOption
	| enablestatusOption
	| enabledOption
	| disabledOption
	| purgetypeOption
	| purgeOption
	| forcepurgeOption
	| killOption
	| exceptionOptions
	)
	;

setLibraryOptions
	: (
	criticalstOption
	| criticalOption
	| noncriticalOption
	| enablestatusOption
	| enabledOption
	| disabledOption
	| rankingOption
	| exceptionOptions
	)
	;

setModenameOptions
	: (
	availableOption
	| connectionOption
	| acqstatusOption
	| acquiredOption
	| closedOption
	| exceptionOptions
	)
	;

setMonitorOptions
	: (
	compressstOption
	| compressOption
	| nocompressOption
	| conversestOption
	| converseOption
	| noconverseOption
	| dpllimitOption
	| filelimitOption
	| exceptclassOption
	| exceptOption
	| noexceptOption
	| frequencyOption
	| frequencyhrsOption
	| frequencyminOption
	| frequencysecOption
	| idntyclassOption
	| idntyOption
	| noidntyOption
	| perfclassOption
	| perfOption
	| noperfOption
	| resrceclassOption
	| resrceOption
	| noresrceOption
	| statusOption
	| onOption
	| offOption
	| syncpointstOption
	| syncpointOption
	| nosyncpointOption
	| tsqueuelimitOption
	| urimaplimitOption
	| webservlimitOption
	| exceptionOptions
	)
	;

setMqconnOptions
	: (
	busyOption
	| waitOption
	| nowaitOption
	| forceOption
	| mqnameOption
	| connectstOption
	| connectedOption
	| notconnectedOption
	| resyncmemberOption
	| resyncOption
	| noresyncOption
	| groupresyncOption
	| exceptionOptions
	)
	;

setMqmonitorOptions
	: (
	autostatusOption
	| autostartOption
	| noautostartOption
	| enablestatusOption
	| enabledOption
	| disabledOption
	| monstatusOption
	| startedOption
	| stoppedOption
	| exceptionOptions
	)
	;

setNetnameOptions
	: (
	exittracingOption
	| exittraceOption
	| noexittraceOption
	| exceptionOptions
	)
	;

setPipelineOptions
	: (
	enablestatusOption
	| enabledOption
	| disabledOption
	| respwaitOption
	| exceptionOptions
	)
	;

setProcesstypeOptions
	: (
	statusOption
	| disabledOption
	| enabledOption
	| auditlevelOption
	| activityOption
	| fullOption
	| offOption
	| processOption
	| exceptionOptions
	)
	;

setProgramOptions
	: (
	cedfstatusOption
	| cedfOption
	| nocedfOption
	| copyOption
	| newcopyOption
	| phaseinOption
	| executionsetOption
	| dplsubsetOption
	| fullapiOption
	| jvmclassOption
	| jvmprofileOption
	| operationOption
	| replicationOption
	| replicatorOption
	| noreplicatorOption
	| runtimeOption
	| jvmOption
	| nojvmOption
	| sharestatusOption
	| sharedOption
	| privateOption
	| statusOption
	| disabledOption
	| enabledOption
	| versionOption
	| exceptionOptions
	)
	;

setSecrecordingOptions
	: (
	actionOption
	| modifyOption
	| removeOption
	| addOption
	| maximumOption
	| odadptridOption
	| odadptrdata1Option
	| odadptrdata2Option
	| odadptrdata3Option
	| odapplidOption
	| odclntipaddrOption
	| odclntportOption
	| odfacilnameOption
	| odfaciltypeOption
	| odipfamilyOption
	| odlunameOption
	| odnetidOption
	| odnetworkidOption
	| odserverportOption
	| odtcpipsOption
	| odtransidOption
	| oduseridOption
	| exceptionOptions
	)
	;

setStatisticsOptions
	: (
	endofdayOption
	| endofdayhrsOption
	| endofdayminsOption
	| endofdaysecsOption
	| intervalOption
	| intervalhrsOption
	| intervalminsOption
	| intervalsecsOption
	| recordingOption
	| onOption
	| offOption
	| recordnowOption
	| resetnowOption
	| exceptionOptions
	)
	;

setSysdumpcodeOptions
	: (
	actionOption
	| addOption
	| removeOption
	| resetOption
	| daeoptionOption
	| daeOption
	| nodaeOption
	| dsplistOption
	| dumpscopeOption
	| localOption
	| relatedOption
	| joblistOption
	| maximumOption
	| shutoptionOption
	| noshutdownOption
	| shutdownOption
	| sysdumpingOption
	| nosysdumpOption
	| sysdumpOption
	| exceptionOptions
	)
	;

setSystemOptions
	: (
	akpOption
	| debugtoolOption
	| debugOption
	| nodebugOption
	| dsalimitOption
	| dsrtprogramOption
	| dtrprogramOption
	| dumpingOption
	| nosysdumpOption
	| tableonlyOption
	| sysdumpOption
	| edsalimitOption
	| forceqrOption
	| forceOption
	| noforceOption
	| gmmtextOption
	| gmmlengthOption
	| logdeferOption
	| maxtasksOption
	| newmaxtasksOption
	| mrobatchOption
	| progautoctlgOption
	| ctlgallOption
	| ctlgmodifyOption
	| ctlgnoneOption
	| progautoexitOption
	| progautoinstOption
	| autoactiveOption
	| autoinactiveOption
	| prtyagingOption
	| runawayOption
	| scandelayOption
	| sdtmemlimitOption
	| timeOption
	| exceptionOptions
	)
	;

setTagsRefreshOptions
	: (
	exceptionOptions
	)
	;

setTaskOptions
	: (
	priorityOption
	| purgetypeOption
	| forcepurgeOption
	| killOption
	| purgeOption
	| srrstatusOption
	| srractiveOption
	| srrinactiveOption
	| exceptionOptions
	)
	;

setTclassOptions
	: (
	maximumOption
	| exceptionOptions
	)
	;

setTcpipOptions
	: (
	maxsocketsOption
	| newmaxsocketOption
	| openstatusOption
	| closedOption
	| immcloseOption
	| openOption
	| exceptionOptions
	)
	;

setTcpipserviceOptions
	: (
	backlogOption
	| maxdatalenOption
	| openstatusOption
	| closedOption
	| immcloseOption
	| openOption
	| urmOption
	| exceptionOptions
	)
	;

setTdqueueOptions
	: (
	atifacilityOption
	| noterminalOption
	| terminalOption
	| atitermidOption
	| atitranidOption
	| atiuseridOption
	| enablestatusOption
	| disabledOption
	| enabledOption
	| openstatusOption
	| closedOption
	| openOption
	| triggerlevelOption
	| exceptionOptions
	)
	;

setTempstorageOptions
	: (
	tsmainlimitOption
	| exceptionOptions
	)
	;

setTerminalOptions
	: (
	acqstatusOption
	| termstatusOption
	| acquiredOption
	| coldacqOption
	| releasedOption
	| altprinterOption
	| altprtcopystOption
	| altprtcopyOption
	| noaltprtcopyOption
	| atistatusOption
	| atiOption
	| noatiOption
	| createsessOption
	| createOption
	| nocreateOption
	| discreqstOption
	| discreqOption
	| nodiscreqOption
	| exittracingOption
	| exittraceOption
	| noexittraceOption
	| mapnameOption
	| nexttransidOption
	| mapsetnameOption
	| obformatstOption
	| obformatOption
	| noobformatOption
	| operidOption
	| pagestatusOption
	| autopageableOption
	| pageableOption
	| printerOption
	| prtcopystOption
	| prtcopyOption
	| noprtcopyOption
	| purgetypeOption
	| cancelOption
	| forcepurgeOption
	| killOption
	| purgeOption
	| forceOption
	| relreqstOption
	| norelreqOption
	| relreqOption
	| servstatusOption
	| inserviceOption
	| outserviceOption
	| tcamcontrolOption
	| termpriorityOption
	| tracingOption
	| spectraceOption
	| stantraceOption
	| ttistatusOption
	| ttiOption
	| nottiOption
	| uctranstOption
	| uctranOption
	| nouctranOption
	| tranidonlyOption
	| zcptracingOption
	| nozcptraceOption
	| zcptraceOption
	| exceptionOptions
	)
	;

setTracedestOptions
	: (
	auxstatusOption
	| auxpauseOption
	| auxstartOption
	| auxstopOption
	| gtfstatusOption
	| gtfstartOption
	| gtfstopOption
	| intstatusOption
	| intstartOption
	| intstopOption
	| switchactionOption
	| switchOption
	| switchstatusOption
	| noswitchOption
	| switchnextOption
	| switchallOption
	| tablesizeOption
	| exceptionOptions
	)
	;

setTraceflagOptions
	: (
	singlestatusOption
	| singleoffOption
	| singleonOption
	| systemstatusOption
	| systemoffOption
	| systemonOption
	| tcexitstatusOption
	| tcexitallOption
	| tcexitalloffOption
	| tcexitnoneOption
	| tcexitsystemOption
	| userstatusOption
	| useroffOption
	| useronOption
	| exceptionOptions
	)
	;

setTracetypeOptions
	: (
	flagsetOption
	| specialOption
	| standardOption
	| compidOption
	| exceptionOptions
	)
	;

setTranclassOptions
	: (
	maxactiveOption
	| purgethreshOption
	| exceptionOptions
	)
	;

setTrandumpcodeOptions
	: (
	actionOption
	| addOption
	| removeOption
	| resetOption
	| dumpscopeOption
	| localOption
	| relatedOption
	| maximumOption
	| shutoptionOption
	| noshutdownOption
	| shutdownOption
	| sysdumpingOption
	| nosysdumpOption
	| sysdumpOption
	| trandumpingOption
	| notrandumpOption
	| trandumpOption
	| exceptionOptions
	)
	;

setTransactionOptions
	: (
	dumpingOption
	| trandumpOption
	| notrandumpOption
	| priorityOption
	| purgeabilityOption
	| notpurgeableOption
	| purgeableOption
	| runawayOption
	| runawaytypeOption
	| systemOption
	| userOption
	| shutdownOption
	| shutdisabledOption
	| shutenabledOption
	| statusOption
	| disabledOption
	| enabledOption
	| tclassOption
	| tranclassOption
	| tracingOption
	| spectraceOption
	| sprstraceOption
	| stantraceOption
	| exceptionOptions
	)
	;

setTsqueueOptions
	: (
	sysidOption
	| poolnameOption
	| actionOption
	| deleteOption
	| lastusedintOption
	| exceptionOptions
	)
	;

setTsqnameOptions
	: (
	sysidOption
	| poolnameOption
	| actionOption
	| deleteOption
	| lastusedintOption
	| exceptionOptions
	)
	;

setUowOptions
	: (
	uowstateOption
	| commitOption
	| backoutOption
	| forceOption
	| exceptionOptions
	)
	;

setUowlinkOptions
	: (
	actionOption
	| deleteOption
	| exceptionOptions
	)
	;

setUrimapOptions
	: (
	enablestatusOption
	| disabledOption
	| enabledOption
	| redirecttypeOption
	| noneOption
	| permanentOption
	| temporaryOption
	| locationOption
	| exceptionOptions
	)
	;

setVtamOptions
	: (
	openstatusOption
	| closedOption
	| forcecloseOption
	| immcloseOption
	| openOption
	| psdintervalOption
	| psdinthrsOption
	| psdintminsOption
	| psdintsecsOption
	| deregisteredOption
	| exceptionOptions
	)
	;

setWebOptions
	: (
	garbageintOption
	| timeoutintOption
	| exceptionOptions
	)
	;

setWebserviceOptions
	: (
	validationstOption
	| validationOption
	| novalidationOption
	| exceptionOptions
	)
	;

setWlmhealthOptions
	: (
	adjustmentOption
	| intervalOption
	| openstatusOption
	| openOption
	| closedOption
	| immcloseOption
	| exceptionOptions
	)
	;

setXmltransformOptions
	: (
	validationstOption
	| validationOption
	| novalidationOption
	| exceptionOptions
	)
	;

// 569 rules generated Tue Apr  9 13:59:39 CDT 2024

abcodeOption
	: (
	ABCODE arg
	)
	;

abdumpOption
	: (
	ABDUMP arg
	)
	;

abendOption
	: (
	ABEND
	)
	;

abendcodeOption
	: (
	ABENDCODE arg
	)
	;

aboffsetOption
	: (
	ABOFFSET arg
	)
	;

abortOption
	: (
	ABORT
	)
	;

abprogramOption
	: (
	ABPROGRAM arg
	)
	;

abstimeOption
	: (
	ABSTIME arg
	)
	;

acapplnameOption
	: (
	ACAPPLNAME arg
	)
	;

accessmethodOption
	: (
	ACCESSMETHOD arg
	)
	;

accountOption
	: (
	ACCOUNT
	)
	;

accountrecOption
	: (
	ACCOUNTREC arg
	)
	;

accumOption
	: (
	ACCUM
	)
	;

aceeOption
	: (
	ACEE arg
	)
	;

acmajorverOption
	: (
	ACMAJORVER arg
	)
	;

acmicroverOption
	: (
	ACMICROVER arg
	)
	;

acminorverOption
	: (
	ACMINORVER arg
	)
	;

acopernameOption
	: (
	ACOPERNAME arg
	)
	;

acplatnameOption
	: (
	ACPLATNAME arg
	)
	;

acqactivityOption
	: (
	ACQACTIVITY
	)
	;

acqprocessOption
	: (
	ACQPROCESS
	)
	;

acqstatusOption
	: (
	ACQSTATUS arg
	)
	;

acquireOption
	: (
	ACQUIRE
	)
	;

acquiredOption
	: (
	ACQUIRED
	)
	;

actionOption
	: (
	ACTION arg
	)
	;

actioncountOption
	: (
	ACTIONCOUNT arg
	)
	;

actiontypeOption
	: (
	ACTIONTYPE arg
	)
	;

activeOption
	: (
	ACTIVE arg
	)
	;

activityOption
	: (
	ACTIVITY arg?
	)
	;

activitybusyOption
	: (
	ACTIVITYBUSY arg?
	)
	;

activityerrOption
	: (
	ACTIVITYERR arg?
	)
	;

activityidOption
	: (
	ACTIVITYID arg
	)
	;

actopentcbsOption
	: (
	ACTOPENTCBS arg
	)
	;

actpartnOption
	: (
	ACTPARTN arg
	)
	;

actsocketsOption
	: (
	ACTSOCKETS arg
	)
	;

actssltcbsOption
	: (
	ACTSSLTCBS arg
	)
	;

actthrdtcbsOption
	: (
	ACTTHRDTCBS arg
	)
	;

actxptcbsOption
	: (
	ACTXPTCBS arg
	)
	;

adaptertypeOption
	: (
	ADAPTERTYPE arg
	)
	;

addOption
	: (
	ADD arg?
	)
	;

addableOption
	: (
	ADDABLE
	)
	;

addressOption
	: (
	ADDRESS arg?
	)
	;

address64Option
	: (
	ADDRESS64 arg
	)
	;

adjustmentOption
	: (
	ADJUSTMENT arg
	)
	;

advanceOption
	: (
	ADVANCE
	)
	;

affinityOption
	: (
	AFFINITY arg
	)
	;

afterOption
	: (
	AFTER arg?
	)
	;

ageOption
	: (
	AGE arg
	)
	;

aibridgeOption
	: (
	AIBRIDGE arg
	)
	;

aidOption
	: (
	AID
	)
	;

aidcountOption
	: (
	AIDCOUNT arg
	)
	;

akpOption
	: (
	AKP arg
	)
	;

alarmOption
	: (
	ALARM
	)
	;

allOption
	: (
	ALL
	)
	;

allocateOption
	: (
	ALLOCATE
	)
	;

allocerrOption
	: (
	ALLOCERR arg?
	)
	;

alterOption
	: (
	ALTER arg?
	)
	;

alternateOption
	: (
	ALTERNATE
	)
	;

altpagehtOption
	: (
	ALTPAGEHT arg
	)
	;

altpagewdOption
	: (
	ALTPAGEWD arg
	)
	;

altprinterOption
	: (
	ALTPRINTER arg
	)
	;

altprtcopyOption
	: (
	ALTPRTCOPY
	)
	;

altprtcopystOption
	: (
	ALTPRTCOPYST arg
	)
	;

altscrnhtOption
	: (
	ALTSCRNHT arg
	)
	;

altscrnwdOption
	: (
	ALTSCRNWD arg
	)
	;

altsuffixOption
	: (
	ALTSUFFIX arg
	)
	;

analyzerstatOption
	: (
	ANALYZERSTAT arg
	)
	;

andOption
	: (
	AND
	)
	;

anyOption
	: (
	ANY arg
	)
	;

anykeyOption
	: (
	ANYKEY arg?
	)
	;

apistOption
	: (
	APIST arg
	)
	;

aplkybdOption
	: (
	APLKYBD arg
	)
	;

aplkybdstOption
	: (
	APLKYBDST arg
	)
	;

apltextOption
	: (
	APLTEXT arg
	)
	;

apltextstOption
	: (
	APLTEXTST arg
	)
	;

appendOption
	: (
	APPEND
	)
	;

appendcrlfOption
	: (
	APPENDCRLF arg
	)
	;

appidOption
	: (
	APPID arg
	)
	;

appidlenOption
	: (
	APPIDLEN arg
	)
	;

appldataOption
	: (
	APPLDATA arg
	)
	;

applicationOption
	: (
	APPLICATION arg?
	)
	;

applidOption
	: (
	APPLID arg
	)
	;

applmajorverOption
	: (
	APPLMAJORVER arg
	)
	;

applmicroverOption
	: (
	APPLMICROVER arg
	)
	;

applminorverOption
	: (
	APPLMINORVER arg
	)
	;

applnamestOption
	: (
	APPLNAMEST arg
	)
	;

appnotfoundOption
	: (
	APPNOTFOUND arg?
	)
	;

archivefileOption
	: (
	ARCHIVEFILE arg
	)
	;

archstatusOption
	: (
	ARCHSTATUS arg
	)
	;

asOption
	: (
	AS arg
	)
	;

asaOption
	: (
	ASA
	)
	;

asciiOption
	: (
	ASCII arg
	)
	;

asisOption
	: (
	ASIS
	)
	;

asktimeOption
	: (
	ASKTIME
	)
	;

asraintrptOption
	: (
	ASRAINTRPT arg
	)
	;

asrakeyOption
	: (
	ASRAKEY arg
	)
	;

asrapswOption
	: (
	ASRAPSW arg
	)
	;

asrapsw16Option
	: (
	ASRAPSW16 arg
	)
	;

asraregsOption
	: (
	ASRAREGS arg
	)
	;

asraregs64Option
	: (
	ASRAREGS64 arg
	)
	;

asraspcOption
	: (
	ASRASPC arg
	)
	;

asrastgOption
	: (
	ASRASTG arg
	)
	;

assignOption
	: (
	ASSIGN
	)
	;

associationOption
	: (
	ASSOCIATION arg?
	)
	;

asynchronousOption
	: (
	ASYNCHRONOUS
	)
	;

asyncserviceOption
	: (
	ASYNCSERVICE
	)
	;

atOption
	: (
	AT arg?
	)
	;

atiOption
	: (
	ATI
	)
	;

atifacilityOption
	: (
	ATIFACILITY arg
	)
	;

atistatusOption
	: (
	ATISTATUS arg
	)
	;

atitermidOption
	: (
	ATITERMID arg
	)
	;

atitranidOption
	: (
	ATITRANID arg
	)
	;

atiuseridOption
	: (
	ATIUSERID arg
	)
	;

atomserviceOption
	: (
	ATOMSERVICE arg?
	)
	;

atomtypeOption
	: (
	ATOMTYPE arg
	)
	;

attachOption
	: (
	ATTACH
	)
	;

attachidOption
	: (
	ATTACHID arg
	)
	;

attachsecOption
	: (
	ATTACHSEC arg
	)
	;

attachtimeOption
	: (
	ATTACHTIME arg
	)
	;

attlsOption
	: (
	ATTLS arg
	)
	;

attributesOption
	: (
	ATTRIBUTES arg?
	)
	;

attrlenOption
	: (
	ATTRLEN arg
	)
	;

audalarmstOption
	: (
	AUDALARMST arg
	)
	;

auditlevelOption
	: (
	AUDITLEVEL arg
	)
	;

auditlogOption
	: (
	AUDITLOG arg
	)
	;

authenticateOption
	: (
	AUTHENTICATE arg
	)
	;

authidOption
	: (
	AUTHID arg
	)
	;

authorityOption
	: (
	AUTHORITY arg
	)
	;

authtypeOption
	: (
	AUTHTYPE arg
	)
	;

authuseridOption
	: (
	AUTHUSERID arg
	)
	;

autinstmodelOption
	: (
	AUTINSTMODEL arg?
	)
	;

autoactiveOption
	: (
	AUTOACTIVE
	)
	;

autoconnectOption
	: (
	AUTOCONNECT arg
	)
	;

autoinactiveOption
	: (
	AUTOINACTIVE
	)
	;

autoinstallOption
	: (
	AUTOINSTALL
	)
	;

autopageOption
	: (
	AUTOPAGE
	)
	;

autopageableOption
	: (
	AUTOPAGEABLE
	)
	;

autostartOption
	: (
	AUTOSTART arg?
	)
	;

autostatusOption
	: (
	AUTOSTATUS arg
	)
	;

auxiliaryOption
	: (
	AUXILIARY
	)
	;

auxpauseOption
	: (
	AUXPAUSE
	)
	;

auxstartOption
	: (
	AUXSTART
	)
	;

auxstatusOption
	: (
	AUXSTATUS arg
	)
	;

auxstopOption
	: (
	AUXSTOP
	)
	;

availabilityOption
	: (
	AVAILABILITY arg
	)
	;

availableOption
	: (
	AVAILABLE arg?
	)
	;

availstatusOption
	: (
	AVAILSTATUS arg
	)
	;

backlogOption
	: (
	BACKLOG arg
	)
	;

backoutOption
	: (
	BACKOUT
	)
	;

backtransstOption
	: (
	BACKTRANSST arg
	)
	;

backuptypeOption
	: (
	BACKUPTYPE arg
	)
	;

base64Option
	: (
	BASE64
	)
	;

basedsnameOption
	: (
	BASEDSNAME arg
	)
	;

basescopeOption
	: (
	BASESCOPE arg
	)
	;

basicauthOption
	: (
	BASICAUTH
	)
	;

beforeOption
	: (
	BEFORE arg
	)
	;

belowOption
	: (
	BELOW
	)
	;

bifOption
	: (
	BIF
	)
	;

binaryOption
	: (
	BINARY arg?
	)
	;

bindfileOption
	: (
	BINDFILE arg
	)
	;

bindingOption
	: (
	BINDING arg
	)
	;

bitOption
	: (
	BIT
	)
	;

blockformatOption
	: (
	BLOCKFORMAT arg
	)
	;

blockkeylenOption
	: (
	BLOCKKEYLEN arg
	)
	;

blocksizeOption
	: (
	BLOCKSIZE arg
	)
	;

bodycharsetOption
	: (
	BODYCHARSET arg
	)
	;

bookmarkOption
	: (
	BOOKMARK arg
	)
	;

bothnumOption
	: (
	BOTHNUM
	)
	;

branchqualOption
	: (
	BRANCHQUAL arg
	)
	;

brdataOption
	: (
	BRDATA arg
	)
	;

brdatalengthOption
	: (
	BRDATALENGTH arg
	)
	;

brexitOption
	: (
	BREXIT arg?
	)
	;

brfacilityOption
	: (
	BRFACILITY arg?
	)
	;

bridgeOption
	: (
	BRIDGE arg
	)
	;

browsableOption
	: (
	BROWSABLE
	)
	;

browseOption
	: (
	BROWSE arg
	)
	;

browsetokenOption
	: (
	BROWSETOKEN arg
	)
	;

btransOption
	: (
	BTRANS arg
	)
	;

bufferOption
	: (
	BUFFER
	)
	;

buildOption
	: (
	BUILD
	)
	;

bundleOption
	: (
	BUNDLE arg?
	)
	;

bundledirOption
	: (
	BUNDLEDIR arg
	)
	;

bundleidOption
	: (
	BUNDLEID arg
	)
	;

bundlepartOption
	: (
	BUNDLEPART arg?
	)
	;

busyOption
	: (
	BUSY arg?
	)
	;

byteoffsetOption
	: (
	BYTEOFFSET arg
	)
	;

cachesizeOption
	: (
	CACHESIZE arg
	)
	;

caddrlengthOption
	: (
	CADDRLENGTH arg
	)
	;

callerOption
	: (
	CALLER arg
	)
	;

callerlengthOption
	: (
	CALLERLENGTH arg
	)
	;

cancelOption
	: (
	CANCEL
	)
	;

capdatapredOption
	: (
	CAPDATAPRED
	)
	;

capinfosrceOption
	: (
	CAPINFOSRCE
	)
	;

capoptpredOption
	: (
	CAPOPTPRED
	)
	;

capturepointOption
	: (
	CAPTUREPOINT arg
	)
	;

captureptypeOption
	: (
	CAPTUREPTYPE arg
	)
	;

capturespecOption
	: (
	CAPTURESPEC arg?
	)
	;

cardOption
	: (
	CARD
	)
	;

causeOption
	: (
	CAUSE arg
	)
	;

cbiderrOption
	: (
	CBIDERR arg?
	)
	;

cbuffOption
	: (
	CBUFF
	)
	;

ccsidOption
	: (
	CCSID arg
	)
	;

ccsiderrOption
	: (
	CCSIDERR arg?
	)
	;

cdsasizeOption
	: (
	CDSASIZE arg
	)
	;

cedfOption
	: (
	CEDF
	)
	;

cedfstatusOption
	: (
	CEDFSTATUS arg
	)
	;

certificateOption
	: (
	CERTIFICATE arg
	)
	;

cfdtpoolOption
	: (
	CFDTPOOL arg?
	)
	;

cftableOption
	: (
	CFTABLE
	)
	;

cgroupOption
	: (
	CGROUP
	)
	;

changeOption
	: (
	CHANGE
	)
	;

changeagentOption
	: (
	CHANGEAGENT arg
	)
	;

changeagrelOption
	: (
	CHANGEAGREL arg
	)
	;

changedOption
	: (
	CHANGED arg?
	)
	;

changetimeOption
	: (
	CHANGETIME arg
	)
	;

changeusridOption
	: (
	CHANGEUSRID arg
	)
	;

channelOption
	: (
	CHANNEL arg
	)
	;

channelerrOption
	: (
	CHANNELERR arg?
	)
	;

charOption
	: (
	CHAR
	)
	;

charactersetOption
	: (
	CHARACTERSET arg
	)
	;

checkOption
	: (
	CHECK
	)
	;

childOption
	: (
	CHILD arg
	)
	;

chunkendOption
	: (
	CHUNKEND
	)
	;

chunkingOption
	: (
	CHUNKING arg
	)
	;

chunknoOption
	: (
	CHUNKNO
	)
	;

chunkyesOption
	: (
	CHUNKYES
	)
	;

cicsdatakeyOption
	: (
	CICSDATAKEY
	)
	;

cicsstatusOption
	: (
	CICSSTATUS arg
	)
	;

cicssysOption
	: (
	CICSSYS arg
	)
	;

cicstableOption
	: (
	CICSTABLE
	)
	;

cicstslevelOption
	: (
	CICSTSLEVEL arg
	)
	;

ciddomainOption
	: (
	CIDDOMAIN arg
	)
	;

cipherOption
	: (
	CIPHER
	)
	;

ciphersOption
	: (
	CIPHERS arg
	)
	;

classOption
	: (
	CLASS arg
	)
	;

clearOption
	: (
	CLEAR arg?
	)
	;

cliconvertOption
	: (
	CLICONVERT
	)
	;

clientOption
	: (
	CLIENT
	)
	;

clientaddrOption
	: (
	CLIENTADDR arg
	)
	;

clientaddrnuOption
	: (
	CLIENTADDRNU arg
	)
	;

clientconvOption
	: (
	CLIENTCONV arg
	)
	;

clientipaddrOption
	: (
	CLIENTIPADDR arg
	)
	;

clientlocOption
	: (
	CLIENTLOC arg
	)
	;

clientnameOption
	: (
	CLIENTNAME arg
	)
	;

clientportOption
	: (
	CLIENTPORT arg
	)
	;

clntaddr6nuOption
	: (
	CLNTADDR6NU arg
	)
	;

clntip6addrOption
	: (
	CLNTIP6ADDR arg
	)
	;

clntipfamilyOption
	: (
	CLNTIPFAMILY arg
	)
	;

closeOption
	: (
	CLOSE
	)
	;

closedOption
	: (
	CLOSED
	)
	;

closeleaveOption
	: (
	CLOSELEAVE
	)
	;

closestatusOption
	: (
	CLOSESTATUS arg
	)
	;

closetimeoutOption
	: (
	CLOSETIMEOUT arg
	)
	;

clrpartnOption
	: (
	CLRPARTN arg?
	)
	;

cmdprotectOption
	: (
	CMDPROTECT arg
	)
	;

cmdsecOption
	: (
	CMDSEC arg
	)
	;

cnamelengthOption
	: (
	CNAMELENGTH arg
	)
	;

cnotcomplOption
	: (
	CNOTCOMPL
	)
	;

coboltypeOption
	: (
	COBOLTYPE arg
	)
	;

codepageOption
	: (
	CODEPAGE arg
	)
	;

codepageerrOption
	: (
	CODEPAGEERR arg?
	)
	;

coldacqOption
	: (
	COLDACQ
	)
	;

coldstatusOption
	: (
	COLDSTATUS arg
	)
	;

collectOption
	: (
	COLLECT
	)
	;

colorOption
	: (
	COLOR arg
	)
	;

colorstOption
	: (
	COLORST arg
	)
	;

comauthidOption
	: (
	COMAUTHID arg
	)
	;

comauthtypeOption
	: (
	COMAUTHTYPE arg
	)
	;

commareaOption
	: (
	COMMAREA arg
	)
	;

commitOption
	: (
	COMMIT
	)
	;

commonnameOption
	: (
	COMMONNAME arg
	)
	;

commonnamlenOption
	: (
	COMMONNAMLEN arg
	)
	;

comparemaxOption
	: (
	COMPAREMAX arg
	)
	;

compareminOption
	: (
	COMPAREMIN arg
	)
	;

compatOption
	: (
	COMPAT
	)
	;

compatmodeOption
	: (
	COMPATMODE arg
	)
	;

compidOption
	: (
	COMPID arg
	)
	;

completeOption
	: (
	COMPLETE
	)
	;

compositeOption
	: (
	COMPOSITE arg?
	)
	;

compressOption
	: (
	COMPRESS
	)
	;

compressstOption
	: (
	COMPRESSST arg
	)
	;

compstatusOption
	: (
	COMPSTATUS arg
	)
	;

comthreadlimOption
	: (
	COMTHREADLIM arg
	)
	;

comthreadsOption
	: (
	COMTHREADS arg
	)
	;

concurrencyOption
	: (
	CONCURRENCY arg
	)
	;

concurrentstOption
	: (
	CONCURRENTST arg
	)
	;

conditionOption
	: (
	CONDITION
	)
	;

configOption
	: (
	CONFIG
	)
	;

configdata1Option
	: (
	CONFIGDATA1 arg
	)
	;

configfileOption
	: (
	CONFIGFILE arg
	)
	;

confirmOption
	: (
	CONFIRM
	)
	;

confirmationOption
	: (
	CONFIRMATION
	)
	;

connectOption
	: (
	CONNECT
	)
	;

connectedOption
	: (
	CONNECTED
	)
	;

connecterrorOption
	: (
	CONNECTERROR arg
	)
	;

connectionOption
	: (
	CONNECTION arg?
	)
	;

connectionsOption
	: (
	CONNECTIONS arg
	)
	;

connectstOption
	: (
	CONNECTST arg
	)
	;

connstatusOption
	: (
	CONNSTATUS arg
	)
	;

conntypeOption
	: (
	CONNTYPE arg
	)
	;

consistentOption
	: (
	CONSISTENT
	)
	;

consnameOption
	: (
	CONSNAME arg
	)
	;

consoleOption
	: (
	CONSOLE arg?
	)
	;

consolesOption
	: (
	CONSOLES arg
	)
	;

containerOption
	: (
	CONTAINER arg?
	)
	;

containercntOption
	: (
	CONTAINERCNT arg
	)
	;

containererrOption
	: (
	CONTAINERERR arg?
	)
	;

contentionOption
	: (
	CONTENTION
	)
	;

contexttypeOption
	: (
	CONTEXTTYPE arg
	)
	;

controlOption
	: (
	CONTROL arg?
	)
	;

convdataOption
	: (
	CONVDATA arg
	)
	;

converseOption
	: (
	CONVERSE
	)
	;

conversestOption
	: (
	CONVERSEST arg
	)
	;

converterOption
	: (
	CONVERTER arg
	)
	;

convertstOption
	: (
	CONVERTST arg
	)
	;

converttimeOption
	: (
	CONVERTTIME
	)
	;

convidOption
	: (
	CONVID arg
	)
	;

copidOption
	: (
	COPID
	)
	;

copiesOption
	: (
	COPIES arg
	)
	;

copyOption
	: (
	COPY arg?
	)
	;

copystOption
	: (
	COPYST arg
	)
	;

corbaserverOption
	: (
	CORBASERVER arg?
	)
	;

correlidOption
	: (
	CORRELID arg
	)
	;

counterOption
	: (
	COUNTER arg
	)
	;

countryOption
	: (
	COUNTRY arg
	)
	;

countrylenOption
	: (
	COUNTRYLEN arg
	)
	;

cqpOption
	: (
	CQP arg
	)
	;

createOption
	: (
	CREATE
	)
	;

createsessOption
	: (
	CREATESESS arg
	)
	;

criticalOption
	: (
	CRITICAL
	)
	;

criticalstOption
	: (
	CRITICALST arg
	)
	;

crlprofileOption
	: (
	CRLPROFILE arg
	)
	;

csaOption
	: (
	CSA arg
	)
	;

csdOption
	: (
	CSD
	)
	;

csderrOption
	: (
	CSDERR arg?
	)
	;

csignOption
	: (
	CSIGN
	)
	;

ctermOption
	: (
	CTERM
	)
	;

ctlcharOption
	: (
	CTLCHAR arg
	)
	;

ctlgallOption
	: (
	CTLGALL
	)
	;

ctlgmodifyOption
	: (
	CTLGMODIFY
	)
	;

ctlgnoneOption
	: (
	CTLGNONE
	)
	;

ctxOption
	: (
	CTX
	)
	;

curauxdsOption
	: (
	CURAUXDS arg
	)
	;

currentOption
	: (
	CURRENT arg?
	)
	;

currentddsOption
	: (
	CURRENTDDS arg
	)
	;

currentheapOption
	: (
	CURRENTHEAP arg
	)
	;

currentprogOption
	: (
	CURRENTPROG arg
	)
	;

curreqsOption
	: (
	CURREQS arg
	)
	;

currpgmOption
	: (
	CURRPGM arg
	)
	;

currpgmopOption
	: (
	CURRPGMOP arg
	)
	;

currtranidOption
	: (
	CURRTRANID arg
	)
	;

currtranidopOption
	: (
	CURRTRANIDOP arg
	)
	;

curruseridOption
	: (
	CURRUSERID arg
	)
	;

curruseridopOption
	: (
	CURRUSERIDOP arg
	)
	;

cursorOption
	: (
	CURSOR arg?
	)
	;

cuseridOption
	: (
	CUSERID
	)
	;

cwaOption
	: (
	CWA arg
	)
	;

cwalengOption
	: (
	CWALENG arg
	)
	;

daeOption
	: (
	DAE
	)
	;

daeoptionOption
	: (
	DAEOPTION arg
	)
	;

dataOption
	: (
	DATA arg
	)
	;

data1Option
	: (
	DATA1 arg
	)
	;

data2Option
	: (
	DATA2 arg
	)
	;

databuffersOption
	: (
	DATABUFFERS arg
	)
	;

dataformatOption
	: (
	DATAFORMAT arg
	)
	;

datalengthOption
	: (
	DATALENGTH arg
	)
	;

datalocationOption
	: (
	DATALOCATION arg
	)
	;

dataonlyOption
	: (
	DATAONLY
	)
	;

datapointerOption
	: (
	DATAPOINTER arg
	)
	;

datasetOption
	: (
	DATASET arg
	)
	;

datastrOption
	: (
	DATASTR arg
	)
	;

datastreamOption
	: (
	DATASTREAM arg
	)
	;

datatojsonOption
	: (
	DATATOJSON
	)
	;

datatoxmlOption
	: (
	DATATOXML
	)
	;

datatypeOption
	: (
	DATATYPE arg
	)
	;

datcontainerOption
	: (
	DATCONTAINER arg
	)
	;

dateOption
	: (
	DATE arg
	)
	;

dateformOption
	: (
	DATEFORM arg
	)
	;

datesepOption
	: (
	DATESEP arg
	)
	;

datestringOption
	: (
	DATESTRING arg
	)
	;

datetimeOption
	: (
	DATETIME
	)
	;

daycountOption
	: (
	DAYCOUNT arg
	)
	;

dayofmonthOption
	: (
	DAYOFMONTH arg
	)
	;

dayofweekOption
	: (
	DAYOFWEEK arg
	)
	;

dayofyearOption
	: (
	DAYOFYEAR arg
	)
	;

daysOption
	: (
	DAYS arg
	)
	;

daysleftOption
	: (
	DAYSLEFT arg
	)
	;

db2Option
	: (
	DB2
	)
	;

db2connOption
	: (
	DB2CONN arg?
	)
	;

db2entryOption
	: (
	DB2ENTRY arg?
	)
	;

db2groupidOption
	: (
	DB2GROUPID arg
	)
	;

db2idOption
	: (
	DB2ID arg
	)
	;

db2planOption
	: (
	DB2PLAN arg
	)
	;

db2releaseOption
	: (
	DB2RELEASE arg
	)
	;

db2tranOption
	: (
	DB2TRAN arg?
	)
	;

dcounterOption
	: (
	DCOUNTER arg
	)
	;

dctOption
	: (
	DCT
	)
	;

ddmmyyOption
	: (
	DDMMYY arg
	)
	;

ddmmyyyyOption
	: (
	DDMMYYYY arg
	)
	;

ddnameOption
	: (
	DDNAME arg
	)
	;

debkeyOption
	: (
	DEBKEY
	)
	;

debrecOption
	: (
	DEBREC
	)
	;

debugOption
	: (
	DEBUG
	)
	;

debugtoolOption
	: (
	DEBUGTOOL arg
	)
	;

deeditOption
	: (
	DEEDIT
	)
	;

defaultOption
	: (
	DEFAULT
	)
	;

defineOption
	: (
	DEFINE
	)
	;

definesourceOption
	: (
	DEFINESOURCE arg
	)
	;

definetimeOption
	: (
	DEFINETIME arg
	)
	;

defpagehtOption
	: (
	DEFPAGEHT arg
	)
	;

defpagewdOption
	: (
	DEFPAGEWD arg
	)
	;

defrespOption
	: (
	DEFRESP
	)
	;

defscrnhtOption
	: (
	DEFSCRNHT arg
	)
	;

defscrnwdOption
	: (
	DEFSCRNWD arg
	)
	;

delayOption
	: (
	DELAY
	)
	;

deletableOption
	: (
	DELETABLE
	)
	;

deleteOption
	: (
	DELETE arg?
	)
	;

deleteqOption
	: (
	DELETEQ
	)
	;

deletshippedOption
	: (
	DELETSHIPPED
	)
	;

delimiterOption
	: (
	DELIMITER arg
	)
	;

deqOption
	: (
	DEQ
	)
	;

deregisteredOption
	: (
	DEREGISTERED
	)
	;

destcountOption
	: (
	DESTCOUNT arg
	)
	;

destidOption
	: (
	DESTID arg
	)
	;

destidlengOption
	: (
	DESTIDLENG arg
	)
	;

destinationOption
	: (
	DESTINATION arg
	)
	;

detailOption
	: (
	DETAIL arg
	)
	;

detaillengthOption
	: (
	DETAILLENGTH arg
	)
	;

deviceOption
	: (
	DEVICE arg
	)
	;

dfltuserOption
	: (
	DFLTUSER arg
	)
	;

diagnosticsOption
	: (
	DIAGNOSTICS
	)
	;

digestOption
	: (
	DIGEST
	)
	;

digesttypeOption
	: (
	DIGESTTYPE arg
	)
	;

disableOption
	: (
	DISABLE
	)
	;

disabledOption
	: (
	DISABLED arg?
	)
	;

disabledactOption
	: (
	DISABLEDACT arg
	)
	;

discardOption
	: (
	DISCARD
	)
	;

disconnectOption
	: (
	DISCONNECT
	)
	;

discreqOption
	: (
	DISCREQ
	)
	;

discreqstOption
	: (
	DISCREQST arg
	)
	;

diskastatusOption
	: (
	DISKASTATUS arg
	)
	;

diskbstatusOption
	: (
	DISKBSTATUS arg
	)
	;

dispatchableOption
	: (
	DISPATCHABLE
	)
	;

dispatcherOption
	: (
	DISPATCHER
	)
	;

dispositionOption
	: (
	DISPOSITION arg
	)
	;

djarOption
	: (
	DJAR
	)
	;

dnameOption
	: (
	DNAME arg
	)
	;

dnamelenOption
	: (
	DNAMELEN arg
	)
	;

docdeleteOption
	: (
	DOCDELETE
	)
	;

docsizeOption
	: (
	DOCSIZE arg
	)
	;

docstatusOption
	: (
	DOCSTATUS arg
	)
	;

doctemplateOption
	: (
	DOCTEMPLATE arg?
	)
	;

doctokenOption
	: (
	DOCTOKEN arg
	)
	;

documentOption
	: (
	DOCUMENT
	)
	;

dpllimitOption
	: (
	DPLLIMIT arg
	)
	;

dplsubsetOption
	: (
	DPLSUBSET
	)
	;

drainOption
	: (
	DRAIN
	)
	;

drollbackOption
	: (
	DROLLBACK arg
	)
	;

ds3270Option
	: (
	DS3270 arg
	)
	;

dsalimitOption
	: (
	DSALIMIT arg
	)
	;

dsanameOption
	: (
	DSANAME arg
	)
	;

dsnameOption
	: (
	DSNAME arg?
	)
	;

dsname01Option
	: (
	DSNAME01 arg
	)
	;

dsname02Option
	: (
	DSNAME02 arg
	)
	;

dsname03Option
	: (
	DSNAME03 arg
	)
	;

dsname04Option
	: (
	DSNAME04 arg
	)
	;

dsname05Option
	: (
	DSNAME05 arg
	)
	;

dsname06Option
	: (
	DSNAME06 arg
	)
	;

dsname07Option
	: (
	DSNAME07 arg
	)
	;

dsname08Option
	: (
	DSNAME08 arg
	)
	;

dsname09Option
	: (
	DSNAME09 arg
	)
	;

dsname10Option
	: (
	DSNAME10 arg
	)
	;

dsname11Option
	: (
	DSNAME11 arg
	)
	;

dsname12Option
	: (
	DSNAME12 arg
	)
	;

dsname13Option
	: (
	DSNAME13 arg
	)
	;

dsname14Option
	: (
	DSNAME14 arg
	)
	;

dsname15Option
	: (
	DSNAME15 arg
	)
	;

dsname16Option
	: (
	DSNAME16 arg
	)
	;

dsnamelistOption
	: (
	DSNAMELIST arg
	)
	;

dsnnotfoundOption
	: (
	DSNNOTFOUND arg?
	)
	;

dsplistOption
	: (
	DSPLIST arg
	)
	;

dsrtprogramOption
	: (
	DSRTPROGRAM arg
	)
	;

dsscsOption
	: (
	DSSCS arg
	)
	;

dsstatOption
	: (
	DSSTAT arg?
	)
	;

dtimeoutOption
	: (
	DTIMEOUT arg
	)
	;

dtrprogramOption
	: (
	DTRPROGRAM arg
	)
	;

dualcasestOption
	: (
	DUALCASEST arg
	)
	;

dumpOption
	: (
	DUMP
	)
	;

dumpcodeOption
	: (
	DUMPCODE arg?
	)
	;

dumpdsOption
	: (
	DUMPDS
	)
	;

dumpidOption
	: (
	DUMPID arg
	)
	;

dumpingOption
	: (
	DUMPING arg
	)
	;

dumpscopeOption
	: (
	DUMPSCOPE arg
	)
	;

dumptypeOption
	: (
	DUMPTYPE arg
	)
	;

dupactionOption
	: (
	DUPACTION arg
	)
	;

duperrorOption
	: (
	DUPERROR
	)
	;

dupkeyOption
	: (
	DUPKEY arg?
	)
	;

dupnoreplaceOption
	: (
	DUPNOREPLACE
	)
	;

duprecOption
	: (
	DUPREC arg?
	)
	;

dupreplaceOption
	: (
	DUPREPLACE
	)
	;

dupresOption
	: (
	DUPRES arg?
	)
	;

durationOption
	: (
	DURATION arg
	)
	;

dynamstatusOption
	: (
	DYNAMSTATUS arg
	)
	;

ecaddrOption
	: (
	ECADDR arg
	)
	;

ecblistOption
	: (
	ECBLIST arg
	)
	;

ecdsasizeOption
	: (
	ECDSASIZE arg
	)
	;

edsalimitOption
	: (
	EDSALIMIT arg
	)
	;

eibOption
	: (
	EIB arg
	)
	;

elementOption
	: (
	ELEMENT arg
	)
	;

element64Option
	: (
	ELEMENT64 arg
	)
	;

elementlistOption
	: (
	ELEMENTLIST arg
	)
	;

elemnameOption
	: (
	ELEMNAME arg
	)
	;

elemnamelenOption
	: (
	ELEMNAMELEN arg
	)
	;

elemnsOption
	: (
	ELEMNS arg
	)
	;

elemnslenOption
	: (
	ELEMNSLEN arg
	)
	;

emitmodeOption
	: (
	EMITMODE arg
	)
	;

emptyOption
	: (
	EMPTY
	)
	;

emptyreqOption
	: (
	EMPTYREQ
	)
	;

emptystatusOption
	: (
	EMPTYSTATUS arg
	)
	;

enableOption
	: (
	ENABLE
	)
	;

enabledOption
	: (
	ENABLED
	)
	;

enabledcountOption
	: (
	ENABLEDCOUNT arg
	)
	;

enablestatusOption
	: (
	ENABLESTATUS arg
	)
	;

encryptkeyOption
	: (
	ENCRYPTKEY arg
	)
	;

encryptptktOption
	: (
	ENCRYPTPTKT arg
	)
	;

endOption
	: (
	END arg?
	)
	;

endactivityOption
	: (
	ENDACTIVITY
	)
	;

endaffinityOption
	: (
	ENDAFFINITY
	)
	;

endbrOption
	: (
	ENDBR
	)
	;

endbrgroupOption
	: (
	ENDBRGROUP
	)
	;

endbrlistOption
	: (
	ENDBRLIST
	)
	;

endbrowseOption
	: (
	ENDBROWSE
	)
	;

endbrrsrceOption
	: (
	ENDBRRSRCE
	)
	;

enddataOption
	: (
	ENDDATA arg?
	)
	;

endfileOption
	: (
	ENDFILE arg?
	)
	;

endinptOption
	: (
	ENDINPT arg?
	)
	;

endofdayOption
	: (
	ENDOFDAY arg
	)
	;

endofdayhrsOption
	: (
	ENDOFDAYHRS arg
	)
	;

endofdayminsOption
	: (
	ENDOFDAYMINS arg
	)
	;

endofdaysecsOption
	: (
	ENDOFDAYSECS arg
	)
	;

endoutputOption
	: (
	ENDOUTPUT
	)
	;

endpointOption
	: (
	ENDPOINT arg
	)
	;

enqOption
	: (
	ENQ
	)
	;

enqbusyOption
	: (
	ENQBUSY arg?
	)
	;

enqfailsOption
	: (
	ENQFAILS arg
	)
	;

enqmodelOption
	: (
	ENQMODEL arg?
	)
	;

enqnameOption
	: (
	ENQNAME arg
	)
	;

enqscopeOption
	: (
	ENQSCOPE arg?
	)
	;

enqueueOption
	: (
	ENQUEUE
	)
	;

enterOption
	: (
	ENTER arg?
	)
	;

entryOption
	: (
	ENTRY arg
	)
	;

entrynameOption
	: (
	ENTRYNAME arg
	)
	;

entrypointOption
	: (
	ENTRYPOINT arg
	)
	;

envdeferrOption
	: (
	ENVDEFERR arg?
	)
	;

eocOption
	: (
	EOC arg?
	)
	;

eodsOption
	: (
	EODS arg?
	)
	;

eofOption
	: (
	EOF_ arg?
	)
	;

epadapterOption
	: (
	EPADAPTER arg?
	)
	;

epadapternumOption
	: (
	EPADAPTERNUM arg
	)
	;

epadapterresOption
	: (
	EPADAPTERRES arg
	)
	;

epadaptersetOption
	: (
	EPADAPTERSET arg?
	)
	;

epadaptinsetOption
	: (
	EPADAPTINSET
	)
	;

epcdsasizeOption
	: (
	EPCDSASIZE arg
	)
	;

eprfieldOption
	: (
	EPRFIELD arg
	)
	;

eprfromOption
	: (
	EPRFROM arg
	)
	;

eprintoOption
	: (
	EPRINTO arg
	)
	;

eprlengthOption
	: (
	EPRLENGTH arg
	)
	;

eprsetOption
	: (
	EPRSET arg
	)
	;

eprtypeOption
	: (
	EPRTYPE arg
	)
	;

epstatusOption
	: (
	EPSTATUS arg
	)
	;

epudsasizeOption
	: (
	EPUDSASIZE arg
	)
	;

equalOption
	: (
	EQUAL
	)
	;

eraseOption
	: (
	ERASE
	)
	;

eraseaupOption
	: (
	ERASEAUP
	)
	;

erdsasizeOption
	: (
	ERDSASIZE arg
	)
	;

errorOption
	: (
	ERROR arg?
	)
	;

errormsgOption
	: (
	ERRORMSG arg
	)
	;

errormsglenOption
	: (
	ERRORMSGLEN arg
	)
	;

erroroptionOption
	: (
	ERROROPTION arg
	)
	;

errtermOption
	: (
	ERRTERM arg
	)
	;

escapeOption
	: (
	ESCAPE arg
	)
	;

esdsasizeOption
	: (
	ESDSASIZE arg
	)
	;

esmappnameOption
	: (
	ESMAPPNAME arg
	)
	;

esmreasonOption
	: (
	ESMREASON arg
	)
	;

esmrespOption
	: (
	ESMRESP arg
	)
	;

etdsasizeOption
	: (
	ETDSASIZE arg
	)
	;

eudsasizeOption
	: (
	EUDSASIZE arg
	)
	;

eventOption
	: (
	EVENT arg?
	)
	;

eventbindingOption
	: (
	EVENTBINDING arg?
	)
	;

eventerrOption
	: (
	EVENTERR arg?
	)
	;

eventnameOption
	: (
	EVENTNAME arg
	)
	;

eventprocessOption
	: (
	EVENTPROCESS
	)
	;

eventtypeOption
	: (
	EVENTTYPE arg
	)
	;

eventualOption
	: (
	EVENTUAL
	)
	;

ewasuppOption
	: (
	EWASUPP arg
	)
	;

exactmatchOption
	: (
	EXACTMATCH
	)
	;

exceptOption
	: (
	EXCEPT
	)
	;

exceptclassOption
	: (
	EXCEPTCLASS arg
	)
	;

exceptionOption
	: (
	EXCEPTION
	)
	;

exciOption
	: (
	EXCI arg
	)
	;

exclusiveOption
	: (
	EXCLUSIVE arg
	)
	;

exctlOption
	: (
	EXCTL
	)
	;

execkeyOption
	: (
	EXECKEY arg
	)
	;

executableOption
	: (
	EXECUTABLE
	)
	;

executionsetOption
	: (
	EXECUTIONSET arg
	)
	;

exitOption
	: (
	EXIT arg?
	)
	;

exitallOption
	: (
	EXITALL
	)
	;

exitpgmOption
	: (
	EXITPGM arg
	)
	;

exitprogramOption
	: (
	EXITPROGRAM arg?
	)
	;

exittraceOption
	: (
	EXITTRACE
	)
	;

exittracingOption
	: (
	EXITTRACING arg
	)
	;

expectOption
	: (
	EXPECT
	)
	;

expiredOption
	: (
	EXPIRED arg?
	)
	;

expiryintOption
	: (
	EXPIRYINT arg
	)
	;

expiryintminOption
	: (
	EXPIRYINTMIN arg
	)
	;

expirytimeOption
	: (
	EXPIRYTIME arg
	)
	;

extdsOption
	: (
	EXTDS arg
	)
	;

extendeddsstOption
	: (
	EXTENDEDDSST arg
	)
	;

externalOption
	: (
	EXTERNAL
	)
	;

extractOption
	: (
	EXTRACT
	)
	;

facilityOption
	: (
	FACILITY arg
	)
	;

facilitylikeOption
	: (
	FACILITYLIKE arg
	)
	;

facilitytoknOption
	: (
	FACILITYTOKN arg
	)
	;

facilitytypeOption
	: (
	FACILITYTYPE arg
	)
	;

facilnameOption
	: (
	FACILNAME arg
	)
	;

faciltypeOption
	: (
	FACILTYPE arg
	)
	;

faultactlenOption
	: (
	FAULTACTLEN arg
	)
	;

faultactorOption
	: (
	FAULTACTOR arg
	)
	;

faultcodeOption
	: (
	FAULTCODE arg
	)
	;

faultcodelenOption
	: (
	FAULTCODELEN arg
	)
	;

faultcodestrOption
	: (
	FAULTCODESTR arg
	)
	;

faultstringOption
	: (
	FAULTSTRING arg
	)
	;

faultstrlenOption
	: (
	FAULTSTRLEN arg
	)
	;

fciOption
	: (
	FCI arg
	)
	;

fctOption
	: (
	FCT
	)
	;

featurekeyOption
	: (
	FEATUREKEY arg?
	)
	;

fepiOption
	: (
	FEPI
	)
	;

fetchOption
	: (
	FETCH
	)
	;

fieldOption
	: (
	FIELD arg
	)
	;

fieldlengthOption
	: (
	FIELDLENGTH arg
	)
	;

fieldoffsetOption
	: (
	FIELDOFFSET arg
	)
	;

fileOption
	: (
	FILE arg?
	)
	;

filecountOption
	: (
	FILECOUNT arg
	)
	;

filelimitOption
	: (
	FILELIMIT arg
	)
	;

filenameOption
	: (
	FILENAME arg
	)
	;

filenotfoundOption
	: (
	FILENOTFOUND arg?
	)
	;

filepathOption
	: (
	FILEPATH arg
	)
	;

filtervalueOption
	: (
	FILTERVALUE arg
	)
	;

firestatusOption
	: (
	FIRESTATUS arg
	)
	;

flagsetOption
	: (
	FLAGSET arg
	)
	;

flengthOption
	: (
	FLENGTH arg
	)
	;

flushOption
	: (
	FLUSH
	)
	;

fmhOption
	: (
	FMH
	)
	;

fmhparmOption
	: (
	FMHPARM arg
	)
	;

fmhparmstOption
	: (
	FMHPARMST arg
	)
	;

fmhstatusOption
	: (
	FMHSTATUS arg
	)
	;

footOption
	: (
	FOOT arg
	)
	;

footnumOption
	: (
	FOOTNUM
	)
	;

forOption
	: (
	FOR
	)
	;

forceOption
	: (
	FORCE
	)
	;

forcecancelOption
	: (
	FORCECANCEL
	)
	;

forcecloseOption
	: (
	FORCECLOSE
	)
	;

forcepurgeOption
	: (
	FORCEPURGE
	)
	;

forceqrOption
	: (
	FORCEQR arg
	)
	;

forceuowOption
	: (
	FORCEUOW
	)
	;

formatedfOption
	: (
	FORMATEDF
	)
	;

formatedfstOption
	: (
	FORMATEDFST arg
	)
	;

formattimeOption
	: (
	FORMATTIME
	)
	;

formfeedOption
	: (
	FORMFEED
	)
	;

formfeedstOption
	: (
	FORMFEEDST arg
	)
	;

formfieldOption
	: (
	FORMFIELD arg?
	)
	;

formsOption
	: (
	FORMS arg
	)
	;

freeOption
	: (
	FREE
	)
	;

freekbOption
	: (
	FREEKB
	)
	;

freemainOption
	: (
	FREEMAIN
	)
	;

freemain64Option
	: (
	FREEMAIN64
	)
	;

frequencyOption
	: (
	FREQUENCY arg
	)
	;

frequencyhrsOption
	: (
	FREQUENCYHRS arg
	)
	;

frequencyminOption
	: (
	FREQUENCYMIN arg
	)
	;

frequencyminsOption
	: (
	FREQUENCYMINS arg
	)
	;

frequencysecOption
	: (
	FREQUENCYSEC arg
	)
	;

frequencysecsOption
	: (
	FREQUENCYSECS arg
	)
	;

fromOption
	: (
	FROM arg
	)
	;

fromactivityOption
	: (
	FROMACTIVITY arg
	)
	;

fromccsidOption
	: (
	FROMCCSID arg
	)
	;

fromchannelOption
	: (
	FROMCHANNEL arg
	)
	;

fromcodepageOption
	: (
	FROMCODEPAGE arg
	)
	;

fromdocOption
	: (
	FROMDOC arg
	)
	;

fromflengthOption
	: (
	FROMFLENGTH arg
	)
	;

fromlengthOption
	: (
	FROMLENGTH arg
	)
	;

fromprocessOption
	: (
	FROMPROCESS
	)
	;

frsetOption
	: (
	FRSET
	)
	;

fullOption
	: (
	FULL
	)
	;

fullapiOption
	: (
	FULLAPI
	)
	;

fulldateOption
	: (
	FULLDATE arg
	)
	;

funcerrOption
	: (
	FUNCERR arg?
	)
	;

fwdrecovlogOption
	: (
	FWDRECOVLOG arg
	)
	;

fwdrecovlsnOption
	: (
	FWDRECOVLSN arg
	)
	;

fwdrecstatusOption
	: (
	FWDRECSTATUS arg
	)
	;

gaentrynameOption
	: (
	GAENTRYNAME arg
	)
	;

gaexecutableOption
	: (
	GAEXECUTABLE
	)
	;

galengthOption
	: (
	GALENGTH arg
	)
	;

galocationOption
	: (
	GALOCATION arg
	)
	;

garbageintOption
	: (
	GARBAGEINT arg
	)
	;

gasetOption
	: (
	GASET arg
	)
	;

gatherOption
	: (
	GATHER
	)
	;

gathertypeOption
	: (
	GATHERTYPE arg
	)
	;

gausecountOption
	: (
	GAUSECOUNT arg
	)
	;

gcdsasizeOption
	: (
	GCDSASIZE arg
	)
	;

gcharsOption
	: (
	GCHARS arg
	)
	;

gcodesOption
	: (
	GCODES arg
	)
	;

gcpolicyOption
	: (
	GCPOLICY arg
	)
	;

gdsOption
	: (
	GDS
	)
	;

genericOption
	: (
	GENERIC
	)
	;

generictcpsOption
	: (
	GENERICTCPS arg
	)
	;

getOption
	: (
	GET
	)
	;

get64Option
	: (
	GET64
	)
	;

getmainOption
	: (
	GETMAIN
	)
	;

getmain64Option
	: (
	GETMAIN64
	)
	;

getnextOption
	: (
	GETNEXT
	)
	;

getnextgroupOption
	: (
	GETNEXTGROUP
	)
	;

getnextlistOption
	: (
	GETNEXTLIST
	)
	;

getnextrsrceOption
	: (
	GETNEXTRSRCE
	)
	;

gmexitoptOption
	: (
	GMEXITOPT arg
	)
	;

gmmiOption
	: (
	GMMI arg
	)
	;

gmmlengthOption
	: (
	GMMLENGTH arg
	)
	;

gmmtextOption
	: (
	GMMTEXT arg
	)
	;

gmmtranidOption
	: (
	GMMTRANID arg
	)
	;

grnameOption
	: (
	GRNAME arg
	)
	;

groupOption
	: (
	GROUP arg?
	)
	;

groupidOption
	: (
	GROUPID arg
	)
	;

groupresyncOption
	: (
	GROUPRESYNC
	)
	;

grstatusOption
	: (
	GRSTATUS arg
	)
	;

gsdsasizeOption
	: (
	GSDSASIZE arg
	)
	;

gskrespOption
	: (
	GSKRESP arg
	)
	;

gteqOption
	: (
	GTEQ
	)
	;

gtfstartOption
	: (
	GTFSTART
	)
	;

gtfstatusOption
	: (
	GTFSTATUS arg
	)
	;

gtfstopOption
	: (
	GTFSTOP
	)
	;

gudsasizeOption
	: (
	GUDSASIZE arg
	)
	;

haOption
	: (
	HA arg
	)
	;

handleOption
	: (
	HANDLE
	)
	;

headOption
	: (
	HEAD arg?
	)
	;

headerOption
	: (
	HEADER arg
	)
	;

headnumOption
	: (
	HEADNUM
	)
	;

healthOption
	: (
	HEALTH arg
	)
	;

healthabstimOption
	: (
	HEALTHABSTIM arg
	)
	;

healthcheckOption
	: (
	HEALTHCHECK arg
	)
	;

heapOption
	: (
	HEAP
	)
	;

hexOption
	: (
	HEX
	)
	;

hformstOption
	: (
	HFORMST arg
	)
	;

hfsfileOption
	: (
	HFSFILE arg
	)
	;

highOption
	: (
	HIGH
	)
	;

hilightOption
	: (
	HILIGHT arg
	)
	;

hilightstOption
	: (
	HILIGHTST arg
	)
	;

holdOption
	: (
	HOLD
	)
	;

holdstatusOption
	: (
	HOLDSTATUS arg
	)
	;

honeomOption
	: (
	HONEOM
	)
	;

hostOption
	: (
	HOST arg
	)
	;

hostcodepageOption
	: (
	HOSTCODEPAGE arg
	)
	;

hostlengthOption
	: (
	HOSTLENGTH arg
	)
	;

hosttypeOption
	: (
	HOSTTYPE arg
	)
	;

hoursOption
	: (
	HOURS arg
	)
	;

httpheaderOption
	: (
	HTTPHEADER arg?
	)
	;

httpmethodOption
	: (
	HTTPMETHOD arg
	)
	;

httprnumOption
	: (
	HTTPRNUM arg
	)
	;

httpversionOption
	: (
	HTTPVERSION arg
	)
	;

httpvnumOption
	: (
	HTTPVNUM arg
	)
	;

identifierOption
	: (
	IDENTIFIER arg
	)
	;

idleOption
	: (
	IDLE arg
	)
	;

idlehrsOption
	: (
	IDLEHRS arg
	)
	;

idleminsOption
	: (
	IDLEMINS arg
	)
	;

idlesecsOption
	: (
	IDLESECS arg
	)
	;

idlistOption
	: (
	IDLIST arg
	)
	;

idlistlengthOption
	: (
	IDLISTLENGTH arg
	)
	;

idntyOption
	: (
	IDNTY
	)
	;

idntyclassOption
	: (
	IDNTYCLASS arg
	)
	;

idpropOption
	: (
	IDPROP arg
	)
	;

ignoreOption
	: (
	IGNORE
	)
	;

igreqcdOption
	: (
	IGREQCD arg?
	)
	;

igreqidOption
	: (
	IGREQID arg?
	)
	;

illogicOption
	: (
	ILLOGIC arg?
	)
	;

immcloseOption
	: (
	IMMCLOSE
	)
	;

immediateOption
	: (
	IMMEDIATE
	)
	;

immquiescedOption
	: (
	IMMQUIESCED
	)
	;

inbfmhOption
	: (
	INBFMH arg?
	)
	;

incompleteOption
	: (
	INCOMPLETE arg?
	)
	;

incontainerOption
	: (
	INCONTAINER arg
	)
	;

incrementOption
	: (
	INCREMENT arg
	)
	;

indirectnameOption
	: (
	INDIRECTNAME arg
	)
	;

indoubtOption
	: (
	INDOUBT arg
	)
	;

indoubtminsOption
	: (
	INDOUBTMINS arg
	)
	;

indoubtstOption
	: (
	INDOUBTST arg
	)
	;

indoubtwaitOption
	: (
	INDOUBTWAIT arg?
	)
	;

initheapOption
	: (
	INITHEAP arg
	)
	;

initialddsOption
	: (
	INITIALDDS arg
	)
	;

initimgOption
	: (
	INITIMG arg
	)
	;

initparmOption
	: (
	INITPARM arg
	)
	;

initparmlenOption
	: (
	INITPARMLEN arg
	)
	;

initqnameOption
	: (
	INITQNAME arg
	)
	;

initstatusOption
	: (
	INITSTATUS arg
	)
	;

inituseridOption
	: (
	INITUSERID arg
	)
	;

inpartnOption
	: (
	INPARTN arg
	)
	;

inputOption
	: (
	INPUT
	)
	;

inputeventOption
	: (
	INPUTEVENT arg
	)
	;

inputmsgOption
	: (
	INPUTMSG arg
	)
	;

inputmsglenOption
	: (
	INPUTMSGLEN arg
	)
	;

inquireOption
	: (
	INQUIRE
	)
	;

inquiregroupOption
	: (
	INQUIREGROUP
	)
	;

inquirelistOption
	: (
	INQUIRELIST
	)
	;

inquirersrceOption
	: (
	INQUIRERSRCE
	)
	;

insertOption
	: (
	INSERT
	)
	;

inserviceOption
	: (
	INSERVICE
	)
	;

installOption
	: (
	INSTALL
	)
	;

installagentOption
	: (
	INSTALLAGENT arg
	)
	;

installtimeOption
	: (
	INSTALLTIME arg
	)
	;

installusridOption
	: (
	INSTALLUSRID arg
	)
	;

intervalOption
	: (
	INTERVAL arg
	)
	;

intervalhrsOption
	: (
	INTERVALHRS arg
	)
	;

intervalminsOption
	: (
	INTERVALMINS arg
	)
	;

intervalsecsOption
	: (
	INTERVALSECS arg
	)
	;

intoOption
	: (
	INTO arg
	)
	;

intoccsidOption
	: (
	INTOCCSID arg
	)
	;

intocodepageOption
	: (
	INTOCODEPAGE arg
	)
	;

intstartOption
	: (
	INTSTART
	)
	;

intstatusOption
	: (
	INTSTATUS arg
	)
	;

intstopOption
	: (
	INTSTOP
	)
	;

invalidcountOption
	: (
	INVALIDCOUNT arg
	)
	;

inverrtermOption
	: (
	INVERRTERM arg?
	)
	;

invexitreqOption
	: (
	INVEXITREQ arg?
	)
	;

inviteOption
	: (
	INVITE
	)
	;

invldcOption
	: (
	INVLDC arg?
	)
	;

invmpszOption
	: (
	INVMPSZ arg?
	)
	;

invokeOption
	: (
	INVOKE
	)
	;

invoketypeOption
	: (
	INVOKETYPE arg
	)
	;

invokingprogOption
	: (
	INVOKINGPROG arg
	)
	;

invpartnOption
	: (
	INVPARTN arg?
	)
	;

invpartnsetOption
	: (
	INVPARTNSET arg?
	)
	;

invreqOption
	: (
	INVREQ arg?
	)
	;

invtsreqOption
	: (
	INVTSREQ arg?
	)
	;

ioerrOption
	: (
	IOERR arg?
	)
	;

iotypeOption
	: (
	IOTYPE arg
	)
	;

ipaddressOption
	: (
	IPADDRESS arg
	)
	;

ipconnOption
	: (
	IPCONN arg?
	)
	;

ipfacilitiesOption
	: (
	IPFACILITIES arg
	)
	;

ipfacilityOption
	: (
	IPFACILITY arg
	)
	;

ipfaciltypeOption
	: (
	IPFACILTYPE arg
	)
	;

ipfamilyOption
	: (
	IPFAMILY arg
	)
	;

ipflistsizeOption
	: (
	IPFLISTSIZE arg
	)
	;

ipresolvedOption
	: (
	IPRESOLVED arg
	)
	;

ircOption
	: (
	IRC
	)
	;

iscinvreqOption
	: (
	ISCINVREQ arg?
	)
	;

isolatestOption
	: (
	ISOLATEST arg
	)
	;

issueOption
	: (
	ISSUE
	)
	;

issuerOption
	: (
	ISSUER
	)
	;

isuseridOption
	: (
	ISUSERID arg
	)
	;

itemOption
	: (
	ITEM arg
	)
	;

itemerrOption
	: (
	ITEMERR arg?
	)
	;

itemnameOption
	: (
	ITEMNAME arg
	)
	;

iutypeOption
	: (
	IUTYPE arg
	)
	;

javacoreOption
	: (
	JAVACORE
	)
	;

javahomeOption
	: (
	JAVAHOME arg
	)
	;

jclOption
	: (
	JCL
	)
	;

jfileidOption
	: (
	JFILEID arg
	)
	;

jiderrOption
	: (
	JIDERR arg?
	)
	;

joblistOption
	: (
	JOBLIST arg
	)
	;

jobnameOption
	: (
	JOBNAME arg
	)
	;

journalOption
	: (
	JOURNAL
	)
	;

journalmodelOption
	: (
	JOURNALMODEL arg?
	)
	;

journalnameOption
	: (
	JOURNALNAME arg?
	)
	;

journalnumOption
	: (
	JOURNALNUM arg?
	)
	;

jsontodataOption
	: (
	JSONTODATA
	)
	;

jtypeOption
	: (
	JTYPE arg
	)
	;

jtypeidOption
	: (
	JTYPEID arg
	)
	;

jusfirstOption
	: (
	JUSFIRST
	)
	;

juslastOption
	: (
	JUSLAST
	)
	;

justifyOption
	: (
	JUSTIFY arg
	)
	;

jvmOption
	: (
	JVM
	)
	;

jvmactionOption
	: (
	JVMACTION arg
	)
	;

jvmclassOption
	: (
	JVMCLASS arg
	)
	;

jvmendpointOption
	: (
	JVMENDPOINT arg?
	)
	;

jvmprofileOption
	: (
	JVMPROFILE arg
	)
	;

jvmprogramOption
	: (
	JVMPROGRAM arg?
	)
	;

jvmserverOption
	: (
	JVMSERVER arg?
	)
	;

jvmtypeOption
	: (
	JVMTYPE arg
	)
	;

jwtOption
	: (
	JWT
	)
	;

katakanaOption
	: (
	KATAKANA arg
	)
	;

katakanastOption
	: (
	KATAKANAST arg
	)
	;

keepOption
	: (
	KEEP
	)
	;

keeptimeOption
	: (
	KEEPTIME arg
	)
	;

kerberosOption
	: (
	KERBEROS
	)
	;

keylengthOption
	: (
	KEYLENGTH arg
	)
	;

keynumberOption
	: (
	KEYNUMBER arg
	)
	;

keypositionOption
	: (
	KEYPOSITION arg
	)
	;

killOption
	: (
	KILL
	)
	;

l40Option
	: (
	L40
	)
	;

l64Option
	: (
	L64
	)
	;

l80Option
	: (
	L80
	)
	;

labelOption
	: (
	LABEL arg
	)
	;

langdeducedOption
	: (
	LANGDEDUCED arg
	)
	;

langinuseOption
	: (
	LANGINUSE arg
	)
	;

languageOption
	: (
	LANGUAGE arg
	)
	;

languagecodeOption
	: (
	LANGUAGECODE arg
	)
	;

lastOption
	: (
	LAST
	)
	;

lastacttimeOption
	: (
	LASTACTTIME arg
	)
	;

lastcoldtimeOption
	: (
	LASTCOLDTIME arg
	)
	;

lastemertimeOption
	: (
	LASTEMERTIME arg
	)
	;

lastinittimeOption
	: (
	LASTINITTIME arg
	)
	;

lastmodtimeOption
	: (
	LASTMODTIME arg
	)
	;

lastresetOption
	: (
	LASTRESET arg
	)
	;

lastresetabsOption
	: (
	LASTRESETABS arg
	)
	;

lastresethrsOption
	: (
	LASTRESETHRS arg
	)
	;

lastresetminOption
	: (
	LASTRESETMIN arg
	)
	;

lastresetsecOption
	: (
	LASTRESETSEC arg
	)
	;

lastusedintOption
	: (
	LASTUSEDINT arg
	)
	;

lastusetimeOption
	: (
	LASTUSETIME arg
	)
	;

lastwarmtimeOption
	: (
	LASTWARMTIME arg
	)
	;

ldcOption
	: (
	LDC arg
	)
	;

ldcmnemOption
	: (
	LDCMNEM arg
	)
	;

ldcnumOption
	: (
	LDCNUM arg
	)
	;

leavekbOption
	: (
	LEAVEKB
	)
	;

lengerrOption
	: (
	LENGERR arg?
	)
	;

lengthOption
	: (
	LENGTH arg
	)
	;

lengthlistOption
	: (
	LENGTHLIST arg
	)
	;

lerunoptsOption
	: (
	LERUNOPTS arg
	)
	;

levelOption
	: (
	LEVEL arg
	)
	;

libertyOption
	: (
	LIBERTY
	)
	;

libraryOption
	: (
	LIBRARY arg?
	)
	;

librarydsnOption
	: (
	LIBRARYDSN arg
	)
	;

librtyactionOption
	: (
	LIBRTYACTION arg
	)
	;

lightpenOption
	: (
	LIGHTPEN arg?
	)
	;

lightpenstOption
	: (
	LIGHTPENST arg
	)
	;

lineOption
	: (
	LINE
	)
	;

lineaddrOption
	: (
	LINEADDR arg
	)
	;

linelengthOption
	: (
	LINELENGTH arg
	)
	;

linesOption
	: (
	LINES arg
	)
	;

linkOption
	: (
	LINK arg?
	)
	;

linkabendOption
	: (
	LINKABEND arg?
	)
	;

linkauthOption
	: (
	LINKAUTH arg
	)
	;

linkeditmodeOption
	: (
	LINKEDITMODE
	)
	;

linklevelOption
	: (
	LINKLEVEL arg
	)
	;

linksysnetOption
	: (
	LINKSYSNET arg
	)
	;

linksystemOption
	: (
	LINKSYSTEM arg
	)
	;

listOption
	: (
	LIST arg?
	)
	;

listactionOption
	: (
	LISTACTION arg
	)
	;

listenerportOption
	: (
	LISTENERPORT arg
	)
	;

listlengthOption
	: (
	LISTLENGTH arg
	)
	;

listsizeOption
	: (
	LISTSIZE arg
	)
	;

llidOption
	: (
	LLID
	)
	;

loadOption
	: (
	LOAD
	)
	;

loadingOption
	: (
	LOADING arg?
	)
	;

loadpointOption
	: (
	LOADPOINT arg
	)
	;

loadtypeOption
	: (
	LOADTYPE arg
	)
	;

localOption
	: (
	LOCAL
	)
	;

localccsidOption
	: (
	LOCALCCSID arg
	)
	;

localityOption
	: (
	LOCALITY arg
	)
	;

localitylenOption
	: (
	LOCALITYLEN arg
	)
	;

locationOption
	: (
	LOCATION arg
	)
	;

lockOption
	: (
	LOCK
	)
	;

lockedOption
	: (
	LOCKED arg?
	)
	;

lockingOption
	: (
	LOCKING
	)
	;

logOption
	: (
	LOG arg?
	)
	;

logdeferOption
	: (
	LOGDEFER arg
	)
	;

logicalOption
	: (
	LOGICAL
	)
	;

logmessageOption
	: (
	LOGMESSAGE arg
	)
	;

logmodeOption
	: (
	LOGMODE arg
	)
	;

logonlogmodeOption
	: (
	LOGONLOGMODE
	)
	;

logonmsgOption
	: (
	LOGONMSG
	)
	;

logrepstatusOption
	: (
	LOGREPSTATUS arg
	)
	;

lostlocksOption
	: (
	LOSTLOCKS arg
	)
	;

lowOption
	: (
	LOW
	)
	;

lpastatusOption
	: (
	LPASTATUS arg
	)
	;

lsrpoolOption
	: (
	LSRPOOL arg?
	)
	;

lsrpoolnumOption
	: (
	LSRPOOLNUM arg
	)
	;

lunameOption
	: (
	LUNAME arg
	)
	;

mainOption
	: (
	MAIN
	)
	;

majorversionOption
	: (
	MAJORVERSION arg
	)
	;

mapOption
	: (
	MAP arg
	)
	;

mapcolumnOption
	: (
	MAPCOLUMN arg
	)
	;

mapfailOption
	: (
	MAPFAIL arg?
	)
	;

mapheightOption
	: (
	MAPHEIGHT arg
	)
	;

maplineOption
	: (
	MAPLINE arg
	)
	;

mapnameOption
	: (
	MAPNAME arg
	)
	;

maponlyOption
	: (
	MAPONLY
	)
	;

mappedOption
	: (
	MAPPED
	)
	;

mappingdevOption
	: (
	MAPPINGDEV arg
	)
	;

mappinglevelOption
	: (
	MAPPINGLEVEL arg
	)
	;

mappingrnumOption
	: (
	MAPPINGRNUM arg
	)
	;

mappingvnumOption
	: (
	MAPPINGVNUM arg
	)
	;

mapsetOption
	: (
	MAPSET arg?
	)
	;

mapsetnameOption
	: (
	MAPSETNAME arg
	)
	;

mapwidthOption
	: (
	MAPWIDTH arg
	)
	;

massinsertOption
	: (
	MASSINSERT
	)
	;

maxactiveOption
	: (
	MAXACTIVE arg
	)
	;

maxdatalenOption
	: (
	MAXDATALEN arg
	)
	;

maxflengthOption
	: (
	MAXFLENGTH arg
	)
	;

maxheapOption
	: (
	MAXHEAP arg
	)
	;

maximumOption
	: (
	MAXIMUM arg
	)
	;

maxitemlenOption
	: (
	MAXITEMLEN arg
	)
	;

maxlengthOption
	: (
	MAXLENGTH arg
	)
	;

maxlifetimeOption
	: (
	MAXLIFETIME arg
	)
	;

maxnumrecsOption
	: (
	MAXNUMRECS arg
	)
	;

maxopentcbsOption
	: (
	MAXOPENTCBS arg
	)
	;

maxpersistOption
	: (
	MAXPERSIST arg
	)
	;

maxproclenOption
	: (
	MAXPROCLEN arg
	)
	;

maxqtimeOption
	: (
	MAXQTIME arg
	)
	;

maxreqsOption
	: (
	MAXREQS arg
	)
	;

maxsocketsOption
	: (
	MAXSOCKETS arg
	)
	;

maxssltcbsOption
	: (
	MAXSSLTCBS arg
	)
	;

maxtasksOption
	: (
	MAXTASKS arg
	)
	;

maxthrdtcbsOption
	: (
	MAXTHRDTCBS arg
	)
	;

maxwinnersOption
	: (
	MAXWINNERS arg
	)
	;

maxxptcbsOption
	: (
	MAXXPTCBS arg
	)
	;

mccOption
	: (
	MCC
	)
	;

mediatypeOption
	: (
	MEDIATYPE arg
	)
	;

memberOption
	: (
	MEMBER arg
	)
	;

membernameOption
	: (
	MEMBERNAME arg
	)
	;

memlimitOption
	: (
	MEMLIMIT arg
	)
	;

messageOption
	: (
	MESSAGE
	)
	;

messagecaseOption
	: (
	MESSAGECASE arg
	)
	;

messageidOption
	: (
	MESSAGEID arg
	)
	;

metadataOption
	: (
	METADATA arg
	)
	;

metadatafileOption
	: (
	METADATAFILE arg
	)
	;

metadatalenOption
	: (
	METADATALEN arg
	)
	;

methodOption
	: (
	METHOD arg
	)
	;

methodlengthOption
	: (
	METHODLENGTH arg
	)
	;

mgmtpartOption
	: (
	MGMTPART arg
	)
	;

microversionOption
	: (
	MICROVERSION arg
	)
	;

millisecondsOption
	: (
	MILLISECONDS arg
	)
	;

millisecsOption
	: (
	MILLISECS arg
	)
	;

minimumOption
	: (
	MINIMUM arg?
	)
	;

minitemlenOption
	: (
	MINITEMLEN arg
	)
	;

minorversionOption
	: (
	MINORVERSION arg
	)
	;

minrunlevelOption
	: (
	MINRUNLEVEL arg
	)
	;

minrunrnumOption
	: (
	MINRUNRNUM arg
	)
	;

minrunvnumOption
	: (
	MINRUNVNUM arg
	)
	;

minutesOption
	: (
	MINUTES arg
	)
	;

mirrorlifeOption
	: (
	MIRRORLIFE arg
	)
	;

mmddyyOption
	: (
	MMDDYY arg
	)
	;

mmddyyyyOption
	: (
	MMDDYYYY arg
	)
	;

modeOption
	: (
	MODE arg
	)
	;

modeliderrOption
	: (
	MODELIDERR arg?
	)
	;

modenameOption
	: (
	MODENAME arg?
	)
	;

modifyOption
	: (
	MODIFY
	)
	;

mondataOption
	: (
	MONDATA arg
	)
	;

monitorOption
	: (
	MONITOR arg?
	)
	;

monstatusOption
	: (
	MONSTATUS arg
	)
	;

monthOption
	: (
	MONTH arg
	)
	;

monthofyearOption
	: (
	MONTHOFYEAR arg
	)
	;

monuseridOption
	: (
	MONUSERID arg
	)
	;

moveOption
	: (
	MOVE
	)
	;

mqconnOption
	: (
	MQCONN arg?
	)
	;

mqiniOption
	: (
	MQINI arg
	)
	;

mqmonitorOption
	: (
	MQMONITOR arg?
	)
	;

mqnameOption
	: (
	MQNAME arg
	)
	;

mqqmgrOption
	: (
	MQQMGR arg
	)
	;

mqreleaseOption
	: (
	MQRELEASE arg
	)
	;

mrobatchOption
	: (
	MROBATCH arg
	)
	;

msgformatOption
	: (
	MSGFORMAT arg
	)
	;

msgqueue1Option
	: (
	MSGQUEUE1 arg
	)
	;

msgqueue2Option
	: (
	MSGQUEUE2 arg
	)
	;

msgqueue3Option
	: (
	MSGQUEUE3 arg
	)
	;

msrOption
	: (
	MSR arg
	)
	;

msrcontrolOption
	: (
	MSRCONTROL arg
	)
	;

msrcontrolstOption
	: (
	MSRCONTROLST arg
	)
	;

mtomnoxopstOption
	: (
	MTOMNOXOPST arg
	)
	;

mtomstOption
	: (
	MTOMST arg
	)
	;

mvsimageOption
	: (
	MVSIMAGE arg
	)
	;

mvssmfidOption
	: (
	MVSSMFID arg
	)
	;

mvssysnameOption
	: (
	MVSSYSNAME arg
	)
	;

mvstcbOption
	: (
	MVSTCB arg?
	)
	;

nameOption
	: (
	NAME arg
	)
	;

namelengthOption
	: (
	NAMELENGTH arg
	)
	;

namespaceOption
	: (
	NAMESPACE arg
	)
	;

natlangOption
	: (
	NATLANG arg
	)
	;

natlanginuseOption
	: (
	NATLANGINUSE arg
	)
	;

natureOption
	: (
	NATURE arg
	)
	;

netidOption
	: (
	NETID arg
	)
	;

netnameOption
	: (
	NETNAME arg?
	)
	;

netnameiderrOption
	: (
	NETNAMEIDERR arg?
	)
	;

netuowidOption
	: (
	NETUOWID arg
	)
	;

networkOption
	: (
	NETWORK arg
	)
	;

networkidOption
	: (
	NETWORKID arg
	)
	;

newcopyOption
	: (
	NEWCOPY
	)
	;

newmaxsocketOption
	: (
	NEWMAXSOCKET arg
	)
	;

newmaxtasksOption
	: (
	NEWMAXTASKS arg
	)
	;

newpasswordOption
	: (
	NEWPASSWORD arg
	)
	;

newphraseOption
	: (
	NEWPHRASE arg
	)
	;

newphraselenOption
	: (
	NEWPHRASELEN arg
	)
	;

nextOption
	: (
	NEXT
	)
	;

nexttimeOption
	: (
	NEXTTIME arg
	)
	;

nexttimehrsOption
	: (
	NEXTTIMEHRS arg
	)
	;

nexttimeminsOption
	: (
	NEXTTIMEMINS arg
	)
	;

nexttimesecsOption
	: (
	NEXTTIMESECS arg
	)
	;

nexttransidOption
	: (
	NEXTTRANSID arg
	)
	;

nleomOption
	: (
	NLEOM
	)
	;

noOption
	: (
	NO
	)
	;

noaltprtcopyOption
	: (
	NOALTPRTCOPY
	)
	;

noatiOption
	: (
	NOATI
	)
	;

noautopageOption
	: (
	NOAUTOPAGE
	)
	;

noautostartOption
	: (
	NOAUTOSTART
	)
	;

noccOption
	: (
	NOCC
	)
	;

nocedfOption
	: (
	NOCEDF
	)
	;

nocheckOption
	: (
	NOCHECK
	)
	;

nocliconvertOption
	: (
	NOCLICONVERT
	)
	;

nocloseOption
	: (
	NOCLOSE
	)
	;

nocompatOption
	: (
	NOCOMPAT
	)
	;

nocompressOption
	: (
	NOCOMPRESS
	)
	;

noconnectOption
	: (
	NOCONNECT
	)
	;

noconvOption
	: (
	NOCONV
	)
	;

noconverseOption
	: (
	NOCONVERSE
	)
	;

nocreateOption
	: (
	NOCREATE
	)
	;

nodaeOption
	: (
	NODAE
	)
	;

nodataOption
	: (
	NODATA
	)
	;

nodeOption
	: (
	NODE arg
	)
	;

nodebugOption
	: (
	NODEBUG
	)
	;

nodehomeOption
	: (
	NODEHOME arg
	)
	;

nodeiderrOption
	: (
	NODEIDERR arg?
	)
	;

nodejsappOption
	: (
	NODEJSAPP arg?
	)
	;

nodiscreqOption
	: (
	NODISCREQ
	)
	;

nodocdeleteOption
	: (
	NODOCDELETE
	)
	;

nodumpOption
	: (
	NODUMP
	)
	;

noeditOption
	: (
	NOEDIT
	)
	;

noemptyreqOption
	: (
	NOEMPTYREQ
	)
	;

noexceptOption
	: (
	NOEXCEPT
	)
	;

noexctlOption
	: (
	NOEXCTL
	)
	;

noexittraceOption
	: (
	NOEXITTRACE
	)
	;

noflushOption
	: (
	NOFLUSH
	)
	;

noforceOption
	: (
	NOFORCE
	)
	;

nohandleOption
	: (
	NOHANDLE
	)
	;

noidntyOption
	: (
	NOIDNTY
	)
	;

noinconvertOption
	: (
	NOINCONVERT
	)
	;

nojbufspOption
	: (
	NOJBUFSP arg?
	)
	;

nojvmOption
	: (
	NOJVM
	)
	;

noloadOption
	: (
	NOLOAD
	)
	;

nologOption
	: (
	NOLOG
	)
	;

noncriticalOption
	: (
	NONCRITICAL
	)
	;

noneOption
	: (
	NONE
	)
	;

nontermrelOption
	: (
	NONTERMREL arg
	)
	;

nonumOption
	: (
	NONUM
	)
	;

nonvalOption
	: (
	NONVAL arg?
	)
	;

noobformatOption
	: (
	NOOBFORMAT
	)
	;

nooutconvertOption
	: (
	NOOUTCONVERT
	)
	;

nopassbkrdOption
	: (
	NOPASSBKRD arg?
	)
	;

nopassbkwrOption
	: (
	NOPASSBKWR arg?
	)
	;

noperfOption
	: (
	NOPERF
	)
	;

noprtcopyOption
	: (
	NOPRTCOPY
	)
	;

noqueueOption
	: (
	NOQUEUE
	)
	;

noquiesceOption
	: (
	NOQUIESCE
	)
	;

norecovdataOption
	: (
	NORECOVDATA
	)
	;

noreleaseOption
	: (
	NORELEASE
	)
	;

norelreqOption
	: (
	NORELREQ
	)
	;

noreplicatorOption
	: (
	NOREPLICATOR
	)
	;

noresrceOption
	: (
	NORESRCE
	)
	;

norestartOption
	: (
	NORESTART
	)
	;

noresyncOption
	: (
	NORESYNC
	)
	;

normalOption
	: (
	NORMAL arg?
	)
	;

nosdtranOption
	: (
	NOSDTRAN
	)
	;

nosepOption
	: (
	NOSEP
	)
	;

noshutdownOption
	: (
	NOSHUTDOWN
	)
	;

nospaceOption
	: (
	NOSPACE arg?
	)
	;

nospoolOption
	: (
	NOSPOOL arg?
	)
	;

nosrvconvertOption
	: (
	NOSRVCONVERT
	)
	;

nostartOption
	: (
	NOSTART arg?
	)
	;

nostgOption
	: (
	NOSTG arg?
	)
	;

nosuspendOption
	: (
	NOSUSPEND
	)
	;

noswitchOption
	: (
	NOSWITCH
	)
	;

nosyncpointOption
	: (
	NOSYNCPOINT
	)
	;

nosysdumpOption
	: (
	NOSYSDUMP
	)
	;

notaddableOption
	: (
	NOTADDABLE
	)
	;

notallocOption
	: (
	NOTALLOC arg?
	)
	;

notauthOption
	: (
	NOTAUTH arg?
	)
	;

notbrowsableOption
	: (
	NOTBROWSABLE
	)
	;

notconnectedOption
	: (
	NOTCONNECTED
	)
	;

notdeletableOption
	: (
	NOTDELETABLE
	)
	;

noteOption
	: (
	NOTE
	)
	;

noterminalOption
	: (
	NOTERMINAL
	)
	;

notfinishedOption
	: (
	NOTFINISHED arg?
	)
	;

notfndOption
	: (
	NOTFND arg?
	)
	;

notopenOption
	: (
	NOTOPEN arg?
	)
	;

notpendingOption
	: (
	NOTPENDING
	)
	;

notpurgeableOption
	: (
	NOTPURGEABLE
	)
	;

notrandumpOption
	: (
	NOTRANDUMP
	)
	;

notreadableOption
	: (
	NOTREADABLE
	)
	;

notrlsOption
	: (
	NOTRLS
	)
	;

notruncateOption
	: (
	NOTRUNCATE
	)
	;

notsuperuserOption
	: (
	NOTSUPERUSER arg?
	)
	;

nottableOption
	: (
	NOTTABLE
	)
	;

nottiOption
	: (
	NOTTI
	)
	;

notupdatableOption
	: (
	NOTUPDATABLE
	)
	;

notwaitOption
	: (
	NOTWAIT
	)
	;

nouctranOption
	: (
	NOUCTRAN
	)
	;

novalidationOption
	: (
	NOVALIDATION
	)
	;

nowaitOption
	: (
	NOWAIT
	)
	;

nozcptraceOption
	: (
	NOZCPTRACE
	)
	;

nqnameOption
	: (
	NQNAME arg
	)
	;

nscontainerOption
	: (
	NSCONTAINER arg
	)
	;

numciphersOption
	: (
	NUMCIPHERS arg
	)
	;

numdatapredOption
	: (
	NUMDATAPRED arg
	)
	;

numdsnamesOption
	: (
	NUMDSNAMES arg
	)
	;

numelementsOption
	: (
	NUMELEMENTS arg
	)
	;

numeventsOption
	: (
	NUMEVENTS arg
	)
	;

numexitsOption
	: (
	NUMEXITS arg
	)
	;

numinfosrceOption
	: (
	NUMINFOSRCE arg
	)
	;

numitemsOption
	: (
	NUMITEMS arg
	)
	;

numoptpredOption
	: (
	NUMOPTPRED arg
	)
	;

numrecOption
	: (
	NUMREC arg
	)
	;

numroutesOption
	: (
	NUMROUTES arg
	)
	;

numsegmentsOption
	: (
	NUMSEGMENTS arg
	)
	;

numtabOption
	: (
	NUMTAB arg
	)
	;

oapplidOption
	: (
	OAPPLID arg
	)
	;

obformatOption
	: (
	OBFORMAT
	)
	;

obformatstOption
	: (
	OBFORMATST arg
	)
	;

objectOption
	: (
	OBJECT arg
	)
	;

objectnameOption
	: (
	OBJECTNAME arg
	)
	;

oboperidstOption
	: (
	OBOPERIDST arg
	)
	;

occupancyOption
	: (
	OCCUPANCY arg
	)
	;

odadptrdata1Option
	: (
	ODADPTRDATA1 arg
	)
	;

odadptrdata2Option
	: (
	ODADPTRDATA2 arg
	)
	;

odadptrdata3Option
	: (
	ODADPTRDATA3 arg
	)
	;

odadptridOption
	: (
	ODADPTRID arg
	)
	;

odapplidOption
	: (
	ODAPPLID arg
	)
	;

odclntipaddrOption
	: (
	ODCLNTIPADDR arg
	)
	;

odclntportOption
	: (
	ODCLNTPORT arg
	)
	;

odfacilnameOption
	: (
	ODFACILNAME arg
	)
	;

odfaciltypeOption
	: (
	ODFACILTYPE arg
	)
	;

odipfamilyOption
	: (
	ODIPFAMILY arg
	)
	;

odlunameOption
	: (
	ODLUNAME arg
	)
	;

odnetidOption
	: (
	ODNETID arg
	)
	;

odnetworkidOption
	: (
	ODNETWORKID arg
	)
	;

odserverportOption
	: (
	ODSERVERPORT arg
	)
	;

odstarttimeOption
	: (
	ODSTARTTIME arg
	)
	;

odtaskidOption
	: (
	ODTASKID arg
	)
	;

odtcpipsOption
	: (
	ODTCPIPS arg
	)
	;

odtransidOption
	: (
	ODTRANSID arg
	)
	;

oduseridOption
	: (
	ODUSERID arg
	)
	;

offOption
	: (
	OFF
	)
	;

oidcardOption
	: (
	OIDCARD arg
	)
	;

oldOption
	: (
	OLD
	)
	;

onOption
	: (
	ON
	)
	;

opclassOption
	: (
	OPCLASS arg
	)
	;

openOption
	: (
	OPEN
	)
	;

openapiOption
	: (
	OPENAPI
	)
	;

openerrOption
	: (
	OPENERR arg?
	)
	;

openoutputOption
	: (
	OPENOUTPUT
	)
	;

openstatusOption
	: (
	OPENSTATUS arg
	)
	;

operationOption
	: (
	OPERATION arg
	)
	;

operatorOption
	: (
	OPERATOR arg?
	)
	;

operidOption
	: (
	OPERID arg?
	)
	;

operkeysOption
	: (
	OPERKEYS arg
	)
	;

operpurgeOption
	: (
	OPERPURGE
	)
	;

opidOption
	: (
	OPID arg?
	)
	;

oprelOption
	: (
	OPREL arg
	)
	;

opsecurityOption
	: (
	OPSECURITY arg
	)
	;

opsysOption
	: (
	OPSYS arg
	)
	;

optionnameOption
	: (
	OPTIONNAME arg
	)
	;

optionsOption
	: (
	OPTIONS
	)
	;

optionspgmOption
	: (
	OPTIONSPGM arg
	)
	;

orOption
	: (
	OR
	)
	;

orgabcodeOption
	: (
	ORGABCODE arg
	)
	;

organizationOption
	: (
	ORGANIZATION arg
	)
	;

organizatlenOption
	: (
	ORGANIZATLEN arg
	)
	;

orgunitOption
	: (
	ORGUNIT arg
	)
	;

orgunitlenOption
	: (
	ORGUNITLEN arg
	)
	;

osgiOption
	: (
	OSGI
	)
	;

osgiactionOption
	: (
	OSGIACTION arg
	)
	;

osgibundleOption
	: (
	OSGIBUNDLE arg?
	)
	;

osgibundleidOption
	: (
	OSGIBUNDLEID arg
	)
	;

osgiserviceOption
	: (
	OSGISERVICE arg?
	)
	;

osgistatusOption
	: (
	OSGISTATUS arg
	)
	;

osgiversionOption
	: (
	OSGIVERSION arg
	)
	;

oslevelOption
	: (
	OSLEVEL arg
	)
	;

otaskOption
	: (
	OTASK arg
	)
	;

otransidOption
	: (
	OTRANSID arg
	)
	;

otstidOption
	: (
	OTSTID arg
	)
	;

otstimeoutOption
	: (
	OTSTIMEOUT arg
	)
	;

outcontainerOption
	: (
	OUTCONTAINER arg
	)
	;

outdescrOption
	: (
	OUTDESCR arg
	)
	;

outdescrerrOption
	: (
	OUTDESCRERR arg?
	)
	;

outlineOption
	: (
	OUTLINE arg
	)
	;

outlinestOption
	: (
	OUTLINEST arg
	)
	;

outpartnOption
	: (
	OUTPARTN arg
	)
	;

outputOption
	: (
	OUTPUT
	)
	;

outserviceOption
	: (
	OUTSERVICE
	)
	;

outtokenOption
	: (
	OUTTOKEN arg
	)
	;

outtokenlenOption
	: (
	OUTTOKENLEN arg
	)
	;

overflowOption
	: (
	OVERFLOW arg?
	)
	;

ownerOption
	: (
	OWNER
	)
	;

pa1Option
	: (
	PA1 arg?
	)
	;

pa2Option
	: (
	PA2 arg?
	)
	;

pa3Option
	: (
	PA3 arg?
	)
	;

pageOption
	: (
	PAGE
	)
	;

pageableOption
	: (
	PAGEABLE
	)
	;

pagehtOption
	: (
	PAGEHT arg
	)
	;

pagenumOption
	: (
	PAGENUM arg
	)
	;

pagestatusOption
	: (
	PAGESTATUS arg
	)
	;

pagewdOption
	: (
	PAGEWD arg
	)
	;

pagingOption
	: (
	PAGING
	)
	;

parseOption
	: (
	PARSE
	)
	;

partclassOption
	: (
	PARTCLASS arg
	)
	;

partcountOption
	: (
	PARTCOUNT arg
	)
	;

partialOption
	: (
	PARTIAL
	)
	;

partitionsetOption
	: (
	PARTITIONSET arg?
	)
	;

partitionsstOption
	: (
	PARTITIONSST arg
	)
	;

partnOption
	: (
	PARTN arg
	)
	;

partnerOption
	: (
	PARTNER arg?
	)
	;

partneriderrOption
	: (
	PARTNERIDERR arg?
	)
	;

partnfailOption
	: (
	PARTNFAIL arg?
	)
	;

partnpageOption
	: (
	PARTNPAGE arg
	)
	;

partnsOption
	: (
	PARTNS arg
	)
	;

partnsetOption
	: (
	PARTNSET arg
	)
	;

parttypeOption
	: (
	PARTTYPE arg
	)
	;

passOption
	: (
	PASS
	)
	;

passbkOption
	: (
	PASSBK
	)
	;

passticketOption
	: (
	PASSTICKET arg
	)
	;

passwordOption
	: (
	PASSWORD arg
	)
	;

passwordlenOption
	: (
	PASSWORDLEN arg
	)
	;

patchOption
	: (
	PATCH
	)
	;

pathOption
	: (
	PATH arg
	)
	;

pathlengthOption
	: (
	PATHLENGTH arg
	)
	;

pcdsasizeOption
	: (
	PCDSASIZE arg
	)
	;

pctOption
	: (
	PCT
	)
	;

pendstatusOption
	: (
	PENDSTATUS arg
	)
	;

perfOption
	: (
	PERF
	)
	;

perfclassOption
	: (
	PERFCLASS arg
	)
	;

performOption
	: (
	PERFORM
	)
	;

permanentOption
	: (
	PERMANENT
	)
	;

pf1Option
	: (
	PF1 arg?
	)
	;

pf10Option
	: (
	PF10 arg?
	)
	;

pf11Option
	: (
	PF11 arg?
	)
	;

pf12Option
	: (
	PF12 arg?
	)
	;

pf13Option
	: (
	PF13 arg?
	)
	;

pf14Option
	: (
	PF14 arg?
	)
	;

pf15Option
	: (
	PF15 arg?
	)
	;

pf16Option
	: (
	PF16 arg?
	)
	;

pf17Option
	: (
	PF17 arg?
	)
	;

pf18Option
	: (
	PF18 arg?
	)
	;

pf19Option
	: (
	PF19 arg?
	)
	;

pf2Option
	: (
	PF2 arg?
	)
	;

pf20Option
	: (
	PF20 arg?
	)
	;

pf21Option
	: (
	PF21 arg?
	)
	;

pf22Option
	: (
	PF22 arg?
	)
	;

pf23Option
	: (
	PF23 arg?
	)
	;

pf24Option
	: (
	PF24 arg?
	)
	;

pf3Option
	: (
	PF3 arg?
	)
	;

pf4Option
	: (
	PF4 arg?
	)
	;

pf5Option
	: (
	PF5 arg?
	)
	;

pf6Option
	: (
	PF6 arg?
	)
	;

pf7Option
	: (
	PF7 arg?
	)
	;

pf8Option
	: (
	PF8 arg?
	)
	;

pf9Option
	: (
	PF9 arg?
	)
	;

pfxlengOption
	: (
	PFXLENG arg
	)
	;

pgmiderrOption
	: (
	PGMIDERR arg?
	)
	;

pgminterfaceOption
	: (
	PGMINTERFACE arg
	)
	;

phapplidOption
	: (
	PHAPPLID arg
	)
	;

phaseinOption
	: (
	PHASEIN
	)
	;

phcountOption
	: (
	PHCOUNT arg
	)
	;

phnetworkidOption
	: (
	PHNETWORKID arg
	)
	;

phraseOption
	: (
	PHRASE arg
	)
	;

phraselenOption
	: (
	PHRASELEN arg
	)
	;

phstarttimeOption
	: (
	PHSTARTTIME arg
	)
	;

phtaskidOption
	: (
	PHTASKID arg
	)
	;

phtransidOption
	: (
	PHTRANSID arg
	)
	;

physicalOption
	: (
	PHYSICAL
	)
	;

pidOption
	: (
	PID arg
	)
	;

pipelineOption
	: (
	PIPELINE arg?
	)
	;

piplengthOption
	: (
	PIPLENGTH arg
	)
	;

piplistOption
	: (
	PIPLIST arg
	)
	;

planOption
	: (
	PLAN arg
	)
	;

planexitnameOption
	: (
	PLANEXITNAME arg
	)
	;

platformOption
	: (
	PLATFORM arg
	)
	;

pltOption
	: (
	PLT arg
	)
	;

pltnameOption
	: (
	PLTNAME arg
	)
	;

pltpiusrOption
	: (
	PLTPIUSR arg
	)
	;

pointOption
	: (
	POINT arg?
	)
	;

policyOption
	: (
	POLICY arg?
	)
	;

policyruleOption
	: (
	POLICYRULE arg?
	)
	;

poolOption
	: (
	POOL arg?
	)
	;

poolerrOption
	: (
	POOLERR arg?
	)
	;

poolnameOption
	: (
	POOLNAME arg
	)
	;

popOption
	: (
	POP
	)
	;

portOption
	: (
	PORT arg
	)
	;

portnumberOption
	: (
	PORTNUMBER arg
	)
	;

portnumnuOption
	: (
	PORTNUMNU arg
	)
	;

postOption
	: (
	POST
	)
	;

pptOption
	: (
	PPT
	)
	;

predicateOption
	: (
	PREDICATE arg
	)
	;

prefixOption
	: (
	PREFIX arg
	)
	;

prepareOption
	: (
	PREPARE
	)
	;

primpredOption
	: (
	PRIMPRED arg
	)
	;

primpredopOption
	: (
	PRIMPREDOP arg
	)
	;

primpredtypeOption
	: (
	PRIMPREDTYPE arg
	)
	;

princonvidOption
	: (
	PRINCONVID arg
	)
	;

prinsysidOption
	: (
	PRINSYSID arg
	)
	;

printOption
	: (
	PRINT
	)
	;

printadaptstOption
	: (
	PRINTADAPTST arg
	)
	;

printcontrolOption
	: (
	PRINTCONTROL arg
	)
	;

printerOption
	: (
	PRINTER arg
	)
	;

printfailOption
	: (
	PRINTFAIL
	)
	;

priorityOption
	: (
	PRIORITY arg
	)
	;

privacyOption
	: (
	PRIVACY arg
	)
	;

privateOption
	: (
	PRIVATE
	)
	;

processOption
	: (
	PROCESS arg?
	)
	;

processbusyOption
	: (
	PROCESSBUSY arg?
	)
	;

processerrOption
	: (
	PROCESSERR arg?
	)
	;

processtypeOption
	: (
	PROCESSTYPE arg?
	)
	;

proclengthOption
	: (
	PROCLENGTH arg
	)
	;

procnameOption
	: (
	PROCNAME arg
	)
	;

profileOption
	: (
	PROFILE arg?
	)
	;

profiledirOption
	: (
	PROFILEDIR arg
	)
	;

profileiderrOption
	: (
	PROFILEIDERR arg?
	)
	;

progautoOption
	: (
	PROGAUTO
	)
	;

progautoctlgOption
	: (
	PROGAUTOCTLG arg
	)
	;

progautoexitOption
	: (
	PROGAUTOEXIT arg
	)
	;

progautoinstOption
	: (
	PROGAUTOINST arg
	)
	;

programOption
	: (
	PROGRAM arg?
	)
	;

programdefOption
	: (
	PROGRAMDEF
	)
	;

progsymbolstOption
	: (
	PROGSYMBOLST arg
	)
	;

progtypeOption
	: (
	PROGTYPE arg
	)
	;

protectOption
	: (
	PROTECT
	)
	;

protectnumOption
	: (
	PROTECTNUM arg
	)
	;

protocolOption
	: (
	PROTOCOL arg
	)
	;

prtcopyOption
	: (
	PRTCOPY
	)
	;

prtcopystOption
	: (
	PRTCOPYST arg
	)
	;

prtyagingOption
	: (
	PRTYAGING arg
	)
	;

psOption
	: (
	PS arg
	)
	;

psdintervalOption
	: (
	PSDINTERVAL arg
	)
	;

psdinthrsOption
	: (
	PSDINTHRS arg
	)
	;

psdintminsOption
	: (
	PSDINTMINS arg
	)
	;

psdintsecsOption
	: (
	PSDINTSECS arg
	)
	;

pseudobinOption
	: (
	PSEUDOBIN
	)
	;

pstypeOption
	: (
	PSTYPE arg
	)
	;

ptcountOption
	: (
	PTCOUNT arg
	)
	;

pthreadsOption
	: (
	PTHREADS arg
	)
	;

ptstarttimeOption
	: (
	PTSTARTTIME arg
	)
	;

pttaskidOption
	: (
	PTTASKID arg
	)
	;

pttransidOption
	: (
	PTTRANSID arg
	)
	;

pudsasizeOption
	: (
	PUDSASIZE arg
	)
	;

punchOption
	: (
	PUNCH
	)
	;

purgeOption
	: (
	PURGE
	)
	;

purgeabilityOption
	: (
	PURGEABILITY arg?
	)
	;

purgeableOption
	: (
	PURGEABLE
	)
	;

purgeablestOption
	: (
	PURGEABLEST arg
	)
	;

purgecyclemOption
	: (
	PURGECYCLEM arg
	)
	;

purgecyclesOption
	: (
	PURGECYCLES arg
	)
	;

purgethreshOption
	: (
	PURGETHRESH arg
	)
	;

purgetypeOption
	: (
	PURGETYPE arg
	)
	;

pushOption
	: (
	PUSH
	)
	;

putOption
	: (
	PUT
	)
	;

put64Option
	: (
	PUT64
	)
	;

qallOption
	: (
	QALL
	)
	;

qbusyOption
	: (
	QBUSY arg?
	)
	;

qiderrOption
	: (
	QIDERR arg?
	)
	;

qnameOption
	: (
	QNAME arg
	)
	;

qnotenabOption
	: (
	QNOTENAB
	)
	;

qsesslimOption
	: (
	QSESSLIM
	)
	;

qualifierOption
	: (
	QUALIFIER arg
	)
	;

quallenOption
	: (
	QUALLEN arg
	)
	;

quasirentOption
	: (
	QUASIRENT
	)
	;

queryOption
	: (
	QUERY
	)
	;

queryparmOption
	: (
	QUERYPARM arg?
	)
	;

querystOption
	: (
	QUERYST arg
	)
	;

querystringOption
	: (
	QUERYSTRING arg
	)
	;

querystrlenOption
	: (
	QUERYSTRLEN arg
	)
	;

quescestateOption
	: (
	QUESCESTATE arg
	)
	;

queueOption
	: (
	QUEUE arg
	)
	;

queuedOption
	: (
	QUEUED arg
	)
	;

queuelimitOption
	: (
	QUEUELIMIT arg
	)
	;

quiescedOption
	: (
	QUIESCED
	)
	;

quiescestateOption
	: (
	QUIESCESTATE arg
	)
	;

qzeroOption
	: (
	QZERO arg?
	)
	;

rankingOption
	: (
	RANKING arg
	)
	;

rbaOption
	: (
	RBA
	)
	;

rbatypeOption
	: (
	RBATYPE arg
	)
	;

rdattOption
	: (
	RDATT arg?
	)
	;

rdsasizeOption
	: (
	RDSASIZE arg
	)
	;

readOption
	: (
	READ arg?
	)
	;

readableOption
	: (
	READABLE
	)
	;

readintegOption
	: (
	READINTEG arg
	)
	;

readnextOption
	: (
	READNEXT
	)
	;

readprevOption
	: (
	READPREV
	)
	;

readqOption
	: (
	READQ
	)
	;

realmOption
	: (
	REALM arg
	)
	;

realmlenOption
	: (
	REALMLEN arg
	)
	;

reasonOption
	: (
	REASON arg
	)
	;

reattachOption
	: (
	REATTACH
	)
	;

rebuildOption
	: (
	REBUILD
	)
	;

receiveOption
	: (
	RECEIVE
	)
	;

receivecountOption
	: (
	RECEIVECOUNT arg
	)
	;

receiverOption
	: (
	RECEIVER
	)
	;

recfmOption
	: (
	RECFM arg
	)
	;

reconnectOption
	: (
	RECONNECT
	)
	;

recordOption
	: (
	RECORD arg?
	)
	;

recordbusyOption
	: (
	RECORDBUSY arg?
	)
	;

recordformatOption
	: (
	RECORDFORMAT arg
	)
	;

recordingOption
	: (
	RECORDING arg
	)
	;

recordlenOption
	: (
	RECORDLEN arg
	)
	;

recordlengthOption
	: (
	RECORDLENGTH arg
	)
	;

recordnowOption
	: (
	RECORDNOW
	)
	;

recordsizeOption
	: (
	RECORDSIZE arg
	)
	;

recoveredOption
	: (
	RECOVERED
	)
	;

recoveryOption
	: (
	RECOVERY
	)
	;

recovstatusOption
	: (
	RECOVSTATUS arg
	)
	;

redirecttypeOption
	: (
	REDIRECTTYPE arg
	)
	;

reduceOption
	: (
	REDUCE
	)
	;

reentprotectOption
	: (
	REENTPROTECT arg
	)
	;

refparmsOption
	: (
	REFPARMS arg
	)
	;

refparmslenOption
	: (
	REFPARMSLEN arg
	)
	;

refreshOption
	: (
	REFRESH
	)
	;

refreshpkgsOption
	: (
	REFRESHPKGS
	)
	;

regionuseridOption
	: (
	REGIONUSERID arg
	)
	;

relatedOption
	: (
	RELATED
	)
	;

relatesindexOption
	: (
	RELATESINDEX arg
	)
	;

relatestypeOption
	: (
	RELATESTYPE arg
	)
	;

relatesuriOption
	: (
	RELATESURI arg
	)
	;

relationOption
	: (
	RELATION arg
	)
	;

releaseOption
	: (
	RELEASE arg?
	)
	;

releasedOption
	: (
	RELEASED
	)
	;

relreqOption
	: (
	RELREQ
	)
	;

relreqstOption
	: (
	RELREQST arg
	)
	;

reltypeOption
	: (
	RELTYPE arg
	)
	;

remotenameOption
	: (
	REMOTENAME arg
	)
	;

remoteprefixOption
	: (
	REMOTEPREFIX arg
	)
	;

remotesysnetOption
	: (
	REMOTESYSNET arg
	)
	;

remotesystemOption
	: (
	REMOTESYSTEM arg
	)
	;

remotetableOption
	: (
	REMOTETABLE arg
	)
	;

removeOption
	: (
	REMOVE
	)
	;

renameOption
	: (
	RENAME
	)
	;

repeatableOption
	: (
	REPEATABLE
	)
	;

replaceOption
	: (
	REPLACE
	)
	;

replicationOption
	: (
	REPLICATION arg
	)
	;

replicatorOption
	: (
	REPLICATOR
	)
	;

replyOption
	: (
	REPLY arg
	)
	;

replylengthOption
	: (
	REPLYLENGTH arg
	)
	;

reportOption
	: (
	REPORT arg
	)
	;

reqidOption
	: (
	REQID arg?
	)
	;

reqtypeOption
	: (
	REQTYPE arg
	)
	;

requestOption
	: (
	REQUEST
	)
	;

requestidOption
	: (
	REQUESTID arg
	)
	;

requestmodelOption
	: (
	REQUESTMODEL
	)
	;

requesttypeOption
	: (
	REQUESTTYPE arg
	)
	;

requiredOption
	: (
	REQUIRED
	)
	;

resclassOption
	: (
	RESCLASS arg
	)
	;

rescountOption
	: (
	RESCOUNT arg
	)
	;

resetOption
	: (
	RESET
	)
	;

resetbrOption
	: (
	RESETBR
	)
	;

resetlocksOption
	: (
	RESETLOCKS
	)
	;

resetnowOption
	: (
	RESETNOW
	)
	;

resettimeOption
	: (
	RESETTIME
	)
	;

residOption
	: (
	RESID arg
	)
	;

residencyOption
	: (
	RESIDENCY arg
	)
	;

residerrOption
	: (
	RESIDERR arg?
	)
	;

residlenOption
	: (
	RESIDLEN arg
	)
	;

residlengthOption
	: (
	RESIDLENGTH arg
	)
	;

reslenOption
	: (
	RESLEN arg
	)
	;

resnameOption
	: (
	RESNAME arg
	)
	;

resourceOption
	: (
	RESOURCE arg?
	)
	;

resourcenameOption
	: (
	RESOURCENAME arg
	)
	;

resourcetypeOption
	: (
	RESOURCETYPE arg
	)
	;

respOption
	: (
	RESP
	)
	;

resp2Option
	: (
	RESP2
	)
	;

respwaitOption
	: (
	RESPWAIT arg
	)
	;

resrceOption
	: (
	RESRCE
	)
	;

resrceclassOption
	: (
	RESRCECLASS arg
	)
	;

ressecOption
	: (
	RESSEC arg
	)
	;

restartOption
	: (
	RESTART arg?
	)
	;

restypeOption
	: (
	RESTYPE arg
	)
	;

resultOption
	: (
	RESULT arg
	)
	;

resumeOption
	: (
	RESUME
	)
	;

resunavailOption
	: (
	RESUNAVAIL arg?
	)
	;

resyncOption
	: (
	RESYNC
	)
	;

resyncmemberOption
	: (
	RESYNCMEMBER arg
	)
	;

resyncstatusOption
	: (
	RESYNCSTATUS arg
	)
	;

retainOption
	: (
	RETAIN
	)
	;

retcodeOption
	: (
	RETCODE arg
	)
	;

retlocksOption
	: (
	RETLOCKS arg
	)
	;

retpageOption
	: (
	RETPAGE arg?
	)
	;

retrieveOption
	: (
	RETRIEVE
	)
	;

retryOption
	: (
	RETRY
	)
	;

returnOption
	: (
	RETURN
	)
	;

returnprogOption
	: (
	RETURNPROG arg
	)
	;

reuselimitOption
	: (
	REUSELIMIT arg
	)
	;

rewindOption
	: (
	REWIND arg?
	)
	;

rewriteOption
	: (
	REWRITE
	)
	;

ridfldOption
	: (
	RIDFLD arg
	)
	;

rlsOption
	: (
	RLS
	)
	;

rlsaccessOption
	: (
	RLSACCESS arg
	)
	;

rlsstatusOption
	: (
	RLSSTATUS arg
	)
	;

rmiqfyOption
	: (
	RMIQFY arg
	)
	;

rmistOption
	: (
	RMIST arg
	)
	;

roleOption
	: (
	ROLE arg
	)
	;

rolelengthOption
	: (
	ROLELENGTH arg
	)
	;

rollbackOption
	: (
	ROLLBACK
	)
	;

rolledbackOption
	: (
	ROLLEDBACK arg?
	)
	;

routeOption
	: (
	ROUTE
	)
	;

routecodesOption
	: (
	ROUTECODES arg
	)
	;

routestatusOption
	: (
	ROUTESTATUS arg
	)
	;

routingOption
	: (
	ROUTING arg
	)
	;

rprocessOption
	: (
	RPROCESS arg
	)
	;

rreplOption
	: (
	RREPL
	)
	;

rresourceOption
	: (
	RRESOURCE arg
	)
	;

rrmsOption
	: (
	RRMS
	)
	;

rrnOption
	: (
	RRN
	)
	;

rslOption
	: (
	RSL arg
	)
	;

rtefailOption
	: (
	RTEFAIL arg?
	)
	;

rtermidOption
	: (
	RTERMID arg
	)
	;

rtesomeOption
	: (
	RTESOME arg?
	)
	;

rtimeoutOption
	: (
	RTIMEOUT arg
	)
	;

rtransidOption
	: (
	RTRANSID arg
	)
	;

rulegroupOption
	: (
	RULEGROUP arg
	)
	;

ruleitemOption
	: (
	RULEITEM arg
	)
	;

ruletypeOption
	: (
	RULETYPE arg
	)
	;

runOption
	: (
	RUN
	)
	;

runawayOption
	: (
	RUNAWAY arg
	)
	;

runawaytypeOption
	: (
	RUNAWAYTYPE arg
	)
	;

runningOption
	: (
	RUNNING
	)
	;

runstatusOption
	: (
	RUNSTATUS arg
	)
	;

runtimeOption
	: (
	RUNTIME arg
	)
	;

saddrlengthOption
	: (
	SADDRLENGTH arg
	)
	;

scanOption
	: (
	SCAN
	)
	;

scandelayOption
	: (
	SCANDELAY arg
	)
	;

schemalevelOption
	: (
	SCHEMALEVEL arg
	)
	;

schemeOption
	: (
	SCHEME arg
	)
	;

schemenameOption
	: (
	SCHEMENAME arg
	)
	;

scopeOption
	: (
	SCOPE arg
	)
	;

scopelenOption
	: (
	SCOPELEN arg
	)
	;

scrnhtOption
	: (
	SCRNHT arg
	)
	;

scrnsizeOption
	: (
	SCRNSIZE arg
	)
	;

scrnwdOption
	: (
	SCRNWD arg
	)
	;

scsOption
	: (
	SCS
	)
	;

sdsasizeOption
	: (
	SDSASIZE arg
	)
	;

sdtmemlimitOption
	: (
	SDTMEMLIMIT arg
	)
	;

sdtranOption
	: (
	SDTRAN arg
	)
	;

searchposOption
	: (
	SEARCHPOS arg
	)
	;

secondsOption
	: (
	SECONDS arg
	)
	;

secportOption
	: (
	SECPORT arg
	)
	;

secrecordingOption
	: (
	SECRECORDING arg?
	)
	;

securityOption
	: (
	SECURITY arg?
	)
	;

securitymgrOption
	: (
	SECURITYMGR arg
	)
	;

securitynameOption
	: (
	SECURITYNAME arg
	)
	;

securitystOption
	: (
	SECURITYST arg
	)
	;

segiderrOption
	: (
	SEGIDERR arg?
	)
	;

segmentlistOption
	: (
	SEGMENTLIST arg
	)
	;

selnerrOption
	: (
	SELNERR arg?
	)
	;

sendOption
	: (
	SEND
	)
	;

sendcountOption
	: (
	SENDCOUNT arg
	)
	;

senderOption
	: (
	SENDER
	)
	;

sendmtomstOption
	: (
	SENDMTOMST arg
	)
	;

sepOption
	: (
	SEP
	)
	;

serialnumOption
	: (
	SERIALNUM arg
	)
	;

serialnumlenOption
	: (
	SERIALNUMLEN arg
	)
	;

serverOption
	: (
	SERVER
	)
	;

serveraddrOption
	: (
	SERVERADDR arg
	)
	;

serveraddrnuOption
	: (
	SERVERADDRNU arg
	)
	;

serverconvOption
	: (
	SERVERCONV arg
	)
	;

serverdumpOption
	: (
	SERVERDUMP
	)
	;

serveripaddrOption
	: (
	SERVERIPADDR arg
	)
	;

servernameOption
	: (
	SERVERNAME arg
	)
	;

serverportOption
	: (
	SERVERPORT arg
	)
	;

serviceOption
	: (
	SERVICE arg
	)
	;

servstatusOption
	: (
	SERVSTATUS arg
	)
	;

sessbusyOption
	: (
	SESSBUSY arg?
	)
	;

sessionOption
	: (
	SESSION arg
	)
	;

sessionerrOption
	: (
	SESSIONERR arg?
	)
	;

sessionsOption
	: (
	SESSIONS arg?
	)
	;

sessiontypeOption
	: (
	SESSIONTYPE arg
	)
	;

sesstokenOption
	: (
	SESSTOKEN arg
	)
	;

setOption
	: (
	SET arg?
	)
	;

settransidOption
	: (
	SETTRANSID arg
	)
	;

shareOption
	: (
	SHARE
	)
	;

sharedOption
	: (
	SHARED
	)
	;

sharelocksOption
	: (
	SHARELOCKS arg
	)
	;

sharestatusOption
	: (
	SHARESTATUS arg
	)
	;

shelfOption
	: (
	SHELF arg
	)
	;

shutdisabledOption
	: (
	SHUTDISABLED
	)
	;

shutdownOption
	: (
	SHUTDOWN arg?
	)
	;

shutdownstOption
	: (
	SHUTDOWNST arg
	)
	;

shutenabledOption
	: (
	SHUTENABLED
	)
	;

shutoptionOption
	: (
	SHUTOPTION arg
	)
	;

shutstatusOption
	: (
	SHUTSTATUS arg
	)
	;

sigdataOption
	: (
	SIGDATA arg
	)
	;

signOption
	: (
	SIGN
	)
	;

signalOption
	: (
	SIGNAL arg?
	)
	;

signidOption
	: (
	SIGNID arg
	)
	;

signoffOption
	: (
	SIGNOFF
	)
	;

signonOption
	: (
	SIGNON
	)
	;

signonstatusOption
	: (
	SIGNONSTATUS arg
	)
	;

singleoffOption
	: (
	SINGLEOFF
	)
	;

singleonOption
	: (
	SINGLEON
	)
	;

singlestatusOption
	: (
	SINGLESTATUS arg
	)
	;

sitOption
	: (
	SIT
	)
	;

snamelengthOption
	: (
	SNAMELENGTH arg
	)
	;

snaptraceOption
	: (
	SNAPTRACE
	)
	;

soapfaultOption
	: (
	SOAPFAULT
	)
	;

soaplevelOption
	: (
	SOAPLEVEL arg
	)
	;

soaprnumOption
	: (
	SOAPRNUM arg
	)
	;

soapvnumOption
	: (
	SOAPVNUM arg
	)
	;

socketcloseOption
	: (
	SOCKETCLOSE arg
	)
	;

sockpoolsizeOption
	: (
	SOCKPOOLSIZE arg
	)
	;

sosabovebarOption
	: (
	SOSABOVEBAR arg
	)
	;

sosabovelineOption
	: (
	SOSABOVELINE arg
	)
	;

sosbelowlineOption
	: (
	SOSBELOWLINE arg
	)
	;

sosiOption
	: (
	SOSI arg
	)
	;

sosistOption
	: (
	SOSIST arg
	)
	;

sosstatusOption
	: (
	SOSSTATUS arg
	)
	;

specialOption
	: (
	SPECIAL
	)
	;

speciftcpsOption
	: (
	SPECIFTCPS arg
	)
	;

spectraceOption
	: (
	SPECTRACE
	)
	;

spiOption
	: (
	SPI
	)
	;

spistOption
	: (
	SPIST arg
	)
	;

spolbusyOption
	: (
	SPOLBUSY arg?
	)
	;

spolerrOption
	: (
	SPOLERR arg?
	)
	;

spoolcloseOption
	: (
	SPOOLCLOSE
	)
	;

spoolopenOption
	: (
	SPOOLOPEN
	)
	;

spoolreadOption
	: (
	SPOOLREAD
	)
	;

spoolwriteOption
	: (
	SPOOLWRITE
	)
	;

sprstraceOption
	: (
	SPRSTRACE
	)
	;

sqlcodeOption
	: (
	SQLCODE
	)
	;

srractiveOption
	: (
	SRRACTIVE
	)
	;

srrinactiveOption
	: (
	SRRINACTIVE
	)
	;

srrstatusOption
	: (
	SRRSTATUS arg
	)
	;

srrtasksOption
	: (
	SRRTASKS arg
	)
	;

srvcnameOption
	: (
	SRVCNAME arg
	)
	;

srvconvertOption
	: (
	SRVCONVERT
	)
	;

srvcstatusOption
	: (
	SRVCSTATUS arg
	)
	;

srvraddr6nuOption
	: (
	SRVRADDR6NU arg
	)
	;

srvripfamilyOption
	: (
	SRVRIPFAMILY arg
	)
	;

sslOption
	: (
	SSL
	)
	;

sslcacheOption
	: (
	SSLCACHE arg
	)
	;

ssltypeOption
	: (
	SSLTYPE arg
	)
	;

stackOption
	: (
	STACK arg
	)
	;

stacktraceOption
	: (
	STACKTRACE
	)
	;

standardOption
	: (
	STANDARD
	)
	;

standbymodeOption
	: (
	STANDBYMODE arg
	)
	;

stantraceOption
	: (
	STANTRACE
	)
	;

startOption
	: (
	START
	)
	;

startbrOption
	: (
	STARTBR
	)
	;

startbrgroupOption
	: (
	STARTBRGROUP
	)
	;

startbrlistOption
	: (
	STARTBRLIST
	)
	;

startbrowseOption
	: (
	STARTBROWSE
	)
	;

startbrrsrceOption
	: (
	STARTBRRSRCE
	)
	;

startcodeOption
	: (
	STARTCODE arg
	)
	;

startedOption
	: (
	STARTED
	)
	;

startioOption
	: (
	STARTIO
	)
	;

startscriptOption
	: (
	STARTSCRIPT arg
	)
	;

startstatusOption
	: (
	STARTSTATUS arg
	)
	;

starttimeOption
	: (
	STARTTIME arg
	)
	;

startupOption
	: (
	STARTUP arg
	)
	;

startupdateOption
	: (
	STARTUPDATE arg
	)
	;

stateOption
	: (
	STATE arg
	)
	;

statelenOption
	: (
	STATELEN arg
	)
	;

stationidOption
	: (
	STATIONID arg
	)
	;

statisticsOption
	: (
	STATISTICS
	)
	;

statsOption
	: (
	STATS
	)
	;

statsqueueOption
	: (
	STATSQUEUE arg
	)
	;

statusOption
	: (
	STATUS arg
	)
	;

statuscodeOption
	: (
	STATUSCODE arg
	)
	;

statuslenOption
	: (
	STATUSLEN arg
	)
	;

statustextOption
	: (
	STATUSTEXT arg
	)
	;

stderrOption
	: (
	STDERR arg
	)
	;

stdoutOption
	: (
	STDOUT arg
	)
	;

stopOption
	: (
	STOP
	)
	;

stoppedOption
	: (
	STOPPED
	)
	;

storageOption
	: (
	STORAGE arg?
	)
	;

storage64Option
	: (
	STORAGE64
	)
	;

storageclearOption
	: (
	STORAGECLEAR arg
	)
	;

storeprotectOption
	: (
	STOREPROTECT arg
	)
	;

streamnameOption
	: (
	STREAMNAME arg?
	)
	;

strelerrOption
	: (
	STRELERR arg?
	)
	;

strfieldOption
	: (
	STRFIELD
	)
	;

stringformatOption
	: (
	STRINGFORMAT arg
	)
	;

stringsOption
	: (
	STRINGS arg
	)
	;

stringzoneOption
	: (
	STRINGZONE arg
	)
	;

structnameOption
	: (
	STRUCTNAME arg
	)
	;

subaddrOption
	: (
	SUBADDR arg
	)
	;

subcodelenOption
	: (
	SUBCODELEN arg
	)
	;

subcodestrOption
	: (
	SUBCODESTR arg
	)
	;

subeventOption
	: (
	SUBEVENT arg
	)
	;

subevent1Option
	: (
	SUBEVENT1 arg
	)
	;

subevent2Option
	: (
	SUBEVENT2 arg
	)
	;

subevent3Option
	: (
	SUBEVENT3 arg
	)
	;

subevent4Option
	: (
	SUBEVENT4 arg
	)
	;

subevent5Option
	: (
	SUBEVENT5 arg
	)
	;

subevent6Option
	: (
	SUBEVENT6 arg
	)
	;

subevent7Option
	: (
	SUBEVENT7 arg
	)
	;

subevent8Option
	: (
	SUBEVENT8 arg
	)
	;

subpoolOption
	: (
	SUBPOOL arg?
	)
	;

subpoollistOption
	: (
	SUBPOOLLIST arg
	)
	;

subresidOption
	: (
	SUBRESID arg
	)
	;

subresidlenOption
	: (
	SUBRESIDLEN arg
	)
	;

subrestypeOption
	: (
	SUBRESTYPE arg
	)
	;

subtasksOption
	: (
	SUBTASKS arg
	)
	;

suppressedOption
	: (
	SUPPRESSED arg?
	)
	;

suspendOption
	: (
	SUSPEND
	)
	;

suspendedOption
	: (
	SUSPENDED
	)
	;

suspendtimeOption
	: (
	SUSPENDTIME arg
	)
	;

suspendtypeOption
	: (
	SUSPENDTYPE arg
	)
	;

suspendvalueOption
	: (
	SUSPENDVALUE arg
	)
	;

suspstatusOption
	: (
	SUSPSTATUS arg
	)
	;

switchOption
	: (
	SWITCH
	)
	;

switchactionOption
	: (
	SWITCHACTION arg
	)
	;

switchallOption
	: (
	SWITCHALL
	)
	;

switchnextOption
	: (
	SWITCHNEXT
	)
	;

switchstatusOption
	: (
	SWITCHSTATUS arg
	)
	;

symbolOption
	: (
	SYMBOL arg
	)
	;

symbolerrOption
	: (
	SYMBOLERR arg?
	)
	;

symbollistOption
	: (
	SYMBOLLIST arg
	)
	;

synchronousOption
	: (
	SYNCHRONOUS
	)
	;

synclevelOption
	: (
	SYNCLEVEL arg
	)
	;

synconreturnOption
	: (
	SYNCONRETURN
	)
	;

syncpointOption
	: (
	SYNCPOINT
	)
	;

syncpointstOption
	: (
	SYNCPOINTST arg
	)
	;

sysbusyOption
	: (
	SYSBUSY arg?
	)
	;

sysdumpOption
	: (
	SYSDUMP
	)
	;

sysdumpcodeOption
	: (
	SYSDUMPCODE arg?
	)
	;

sysdumpingOption
	: (
	SYSDUMPING arg
	)
	;

sysidOption
	: (
	SYSID arg
	)
	;

sysiderrOption
	: (
	SYSIDERR arg?
	)
	;

sysoutclassOption
	: (
	SYSOUTCLASS arg
	)
	;

systemOption
	: (
	SYSTEM
	)
	;

systemlogOption
	: (
	SYSTEMLOG arg
	)
	;

systemoffOption
	: (
	SYSTEMOFF
	)
	;

systemonOption
	: (
	SYSTEMON
	)
	;

systemstatusOption
	: (
	SYSTEMSTATUS arg
	)
	;

t3270Option
	: (
	T3270
	)
	;

tableOption
	: (
	TABLE arg
	)
	;

tablemgrOption
	: (
	TABLEMGR
	)
	;

tablenameOption
	: (
	TABLENAME arg
	)
	;

tableonlyOption
	: (
	TABLEONLY
	)
	;

tablesOption
	: (
	TABLES
	)
	;

tablesizeOption
	: (
	TABLESIZE arg
	)
	;

taexecutableOption
	: (
	TAEXECUTABLE
	)
	;

tagOption
	: (
	TAG arg?
	)
	;

tagsOption
	: (
	TAGS
	)
	;

takeoverOption
	: (
	TAKEOVER
	)
	;

talengthOption
	: (
	TALENGTH arg
	)
	;

targetOption
	: (
	TARGET arg
	)
	;

targetcountOption
	: (
	TARGETCOUNT arg
	)
	;

targetsysOption
	: (
	TARGETSYS arg
	)
	;

taskOption
	: (
	TASK arg?
	)
	;

taskdatakeyOption
	: (
	TASKDATAKEY arg
	)
	;

taskdatalocOption
	: (
	TASKDATALOC arg
	)
	;

taskidOption
	: (
	TASKID arg
	)
	;

taskiderrOption
	: (
	TASKIDERR arg?
	)
	;

taskpriorityOption
	: (
	TASKPRIORITY arg
	)
	;

tasksOption
	: (
	TASKS arg
	)
	;

taskstartOption
	: (
	TASKSTART
	)
	;

taskstartstOption
	: (
	TASKSTARTST arg
	)
	;

tasksubpoolOption
	: (
	TASKSUBPOOL
	)
	;

tcamcontrolOption
	: (
	TCAMCONTROL arg
	)
	;

tcbOption
	: (
	TCB arg
	)
	;

tcblimitOption
	: (
	TCBLIMIT arg
	)
	;

tcbsOption
	: (
	TCBS arg
	)
	;

tcexitallOption
	: (
	TCEXITALL
	)
	;

tcexitalloffOption
	: (
	TCEXITALLOFF
	)
	;

tcexitnoneOption
	: (
	TCEXITNONE
	)
	;

tcexitstatusOption
	: (
	TCEXITSTATUS arg
	)
	;

tcexitsystemOption
	: (
	TCEXITSYSTEM
	)
	;

tciderrOption
	: (
	TCIDERR arg?
	)
	;

tclassOption
	: (
	TCLASS arg?
	)
	;

tcpipOption
	: (
	TCPIP
	)
	;

tcpipjobOption
	: (
	TCPIPJOB arg
	)
	;

tcpipserviceOption
	: (
	TCPIPSERVICE arg?
	)
	;

tcpipzoneOption
	: (
	TCPIPZONE arg
	)
	;

tctOption
	: (
	TCT
	)
	;

tctuaOption
	: (
	TCTUA arg
	)
	;

tctualengOption
	: (
	TCTUALENG arg
	)
	;

tdOption
	: (
	TD
	)
	;

tdqueueOption
	: (
	TDQUEUE arg?
	)
	;

telleridOption
	: (
	TELLERID arg
	)
	;

templateOption
	: (
	TEMPLATE arg
	)
	;

templatenameOption
	: (
	TEMPLATENAME arg
	)
	;

templaterrOption
	: (
	TEMPLATERR arg?
	)
	;

templatetypeOption
	: (
	TEMPLATETYPE arg
	)
	;

temporaryOption
	: (
	TEMPORARY
	)
	;

tempstorageOption
	: (
	TEMPSTORAGE
	)
	;

termOption
	: (
	TERM
	)
	;

termcodeOption
	: (
	TERMCODE arg
	)
	;

termerrOption
	: (
	TERMERR arg?
	)
	;

termidOption
	: (
	TERMID arg
	)
	;

termiderrOption
	: (
	TERMIDERR arg?
	)
	;

terminalOption
	: (
	TERMINAL arg?
	)
	;

termmodelOption
	: (
	TERMMODEL arg
	)
	;

termpriorityOption
	: (
	TERMPRIORITY arg
	)
	;

termstatusOption
	: (
	TERMSTATUS arg
	)
	;

testOption
	: (
	TEST
	)
	;

textOption
	: (
	TEXT arg?
	)
	;

textkybdOption
	: (
	TEXTKYBD arg
	)
	;

textkybdstOption
	: (
	TEXTKYBDST arg
	)
	;

textlengthOption
	: (
	TEXTLENGTH arg
	)
	;

textprintOption
	: (
	TEXTPRINT arg
	)
	;

textprintstOption
	: (
	TEXTPRINTST arg
	)
	;

threadcountOption
	: (
	THREADCOUNT arg
	)
	;

threaderrorOption
	: (
	THREADERROR arg
	)
	;

threadlimitOption
	: (
	THREADLIMIT arg
	)
	;

threadsOption
	: (
	THREADS arg
	)
	;

threadsafeOption
	: (
	THREADSAFE
	)
	;

threadwaitOption
	: (
	THREADWAIT arg
	)
	;

thresholdOption
	: (
	THRESHOLD arg
	)
	;

timeOption
	: (
	TIME arg
	)
	;

timedoutOption
	: (
	TIMEDOUT arg?
	)
	;

timeoutOption
	: (
	TIMEOUT arg
	)
	;

timeoutintOption
	: (
	TIMEOUTINT arg
	)
	;

timerOption
	: (
	TIMER arg?
	)
	;

timererrOption
	: (
	TIMERERR arg?
	)
	;

timesepOption
	: (
	TIMESEP arg
	)
	;

titleOption
	: (
	TITLE arg
	)
	;

titlelengthOption
	: (
	TITLELENGTH arg
	)
	;

tnaddrOption
	: (
	TNADDR arg
	)
	;

tnipfamilyOption
	: (
	TNIPFAMILY arg
	)
	;

tnportOption
	: (
	TNPORT arg
	)
	;

toOption
	: (
	TO arg
	)
	;

toactivityOption
	: (
	TOACTIVITY arg
	)
	;

tochannelOption
	: (
	TOCHANNEL arg
	)
	;

tocontainerOption
	: (
	TOCONTAINER arg
	)
	;

toflengthOption
	: (
	TOFLENGTH arg
	)
	;

tokenOption
	: (
	TOKEN arg?
	)
	;

tokenerrOption
	: (
	TOKENERR arg?
	)
	;

tokenlenOption
	: (
	TOKENLEN arg
	)
	;

tokentypeOption
	: (
	TOKENTYPE arg
	)
	;

tolengthOption
	: (
	TOLENGTH arg
	)
	;

toprocessOption
	: (
	TOPROCESS
	)
	;

tpnameOption
	: (
	TPNAME arg
	)
	;

tpnamelenOption
	: (
	TPNAMELEN arg
	)
	;

tpoolOption
	: (
	TPOOL
	)
	;

traceOption
	: (
	TRACE arg?
	)
	;

tracedestOption
	: (
	TRACEDEST
	)
	;

traceflagOption
	: (
	TRACEFLAG
	)
	;

traceidOption
	: (
	TRACEID arg
	)
	;

tracenumOption
	: (
	TRACENUM arg
	)
	;

tracetypeOption
	: (
	TRACETYPE
	)
	;

tracingOption
	: (
	TRACING arg
	)
	;

trailerOption
	: (
	TRAILER arg
	)
	;

tranclassOption
	: (
	TRANCLASS arg?
	)
	;

trandumpOption
	: (
	TRANDUMP
	)
	;

trandumpcodeOption
	: (
	TRANDUMPCODE arg?
	)
	;

trandumpingOption
	: (
	TRANDUMPING arg
	)
	;

tranidonlyOption
	: (
	TRANIDONLY
	)
	;

tranisolateOption
	: (
	TRANISOLATE arg
	)
	;

tranpriorityOption
	: (
	TRANPRIORITY arg
	)
	;

transactionOption
	: (
	TRANSACTION arg?
	)
	;

transformOption
	: (
	TRANSFORM
	)
	;

transformerOption
	: (
	TRANSFORMER arg
	)
	;

transidOption
	: (
	TRANSID arg
	)
	;

transiderrOption
	: (
	TRANSIDERR arg?
	)
	;

transmodeOption
	: (
	TRANSMODE arg
	)
	;

triggerOption
	: (
	TRIGGER arg?
	)
	;

triggerlevelOption
	: (
	TRIGGERLEVEL arg
	)
	;

trigmontasksOption
	: (
	TRIGMONTASKS arg
	)
	;

trngrpidOption
	: (
	TRNGRPID arg
	)
	;

trprofOption
	: (
	TRPROF arg
	)
	;

trtOption
	: (
	TRT
	)
	;

tsOption
	: (
	TS
	)
	;

tsioerrOption
	: (
	TSIOERR arg?
	)
	;

tsmaininuseOption
	: (
	TSMAININUSE arg
	)
	;

tsmainlimitOption
	: (
	TSMAINLIMIT arg
	)
	;

tsmodelOption
	: (
	TSMODEL arg?
	)
	;

tspoolOption
	: (
	TSPOOL arg?
	)
	;

tsqnameOption
	: (
	TSQNAME arg?
	)
	;

tsqueueOption
	: (
	TSQUEUE arg?
	)
	;

tsqueuelimitOption
	: (
	TSQUEUELIMIT arg
	)
	;

tsystemOption
	: (
	TSYSTEM arg
	)
	;

tsystypeOption
	: (
	TSYSTYPE arg
	)
	;

ttiOption
	: (
	TTI
	)
	;

ttistatusOption
	: (
	TTISTATUS arg
	)
	;

twaOption
	: (
	TWA arg
	)
	;

twaitOption
	: (
	TWAIT
	)
	;

twalengOption
	: (
	TWALENG arg
	)
	;

twasizeOption
	: (
	TWASIZE arg
	)
	;

txOption
	: (
	TX
	)
	;

txidOption
	: (
	TXID
	)
	;

typeOption
	: (
	TYPE arg
	)
	;

typenameOption
	: (
	TYPENAME arg
	)
	;

typenamelenOption
	: (
	TYPENAMELEN arg
	)
	;

typensOption
	: (
	TYPENS arg
	)
	;

typenslenOption
	: (
	TYPENSLEN arg
	)
	;

typetermOption
	: (
	TYPETERM arg?
	)
	;

uctranOption
	: (
	UCTRAN
	)
	;

uctranstOption
	: (
	UCTRANST arg
	)
	;

udsasizeOption
	: (
	UDSASIZE arg
	)
	;

unattendOption
	: (
	UNATTEND arg
	)
	;

unavailableOption
	: (
	UNAVAILABLE
	)
	;

uncommittedOption
	: (
	UNCOMMITTED
	)
	;

unescapedOption
	: (
	UNESCAPED
	)
	;

unexpinOption
	: (
	UNEXPIN arg?
	)
	;

unlockOption
	: (
	UNLOCK
	)
	;

unquiescedOption
	: (
	UNQUIESCED
	)
	;

untilOption
	: (
	UNTIL
	)
	;

uowOption
	: (
	UOW arg?
	)
	;

uowactionOption
	: (
	UOWACTION arg
	)
	;

uowdsnfailOption
	: (
	UOWDSNFAIL
	)
	;

uowenqOption
	: (
	UOWENQ
	)
	;

uowlinkOption
	: (
	UOWLINK arg?
	)
	;

uowlnotfoundOption
	: (
	UOWLNOTFOUND arg?
	)
	;

uownotfoundOption
	: (
	UOWNOTFOUND arg?
	)
	;

uowstateOption
	: (
	UOWSTATE arg
	)
	;

updatableOption
	: (
	UPDATABLE
	)
	;

updateOption
	: (
	UPDATE arg?
	)
	;

updatemodelOption
	: (
	UPDATEMODEL arg
	)
	;

uriOption
	: (
	URI arg
	)
	;

uridOption
	: (
	URID arg
	)
	;

urimapOption
	: (
	URIMAP arg?
	)
	;

urimaplimitOption
	: (
	URIMAPLIMIT arg
	)
	;

urlOption
	: (
	URL arg
	)
	;

urllengthOption
	: (
	URLLENGTH arg
	)
	;

urmOption
	: (
	URM arg
	)
	;

usageOption
	: (
	USAGE arg
	)
	;

usecountOption
	: (
	USECOUNT arg
	)
	;

userOption
	: (
	USER
	)
	;

userareaOption
	: (
	USERAREA arg
	)
	;

userarealenOption
	: (
	USERAREALEN arg
	)
	;

userauthOption
	: (
	USERAUTH arg
	)
	;

usercorrdataOption
	: (
	USERCORRDATA arg
	)
	;

userdataOption
	: (
	USERDATA arg
	)
	;

userdatakeyOption
	: (
	USERDATAKEY
	)
	;

userdatalenOption
	: (
	USERDATALEN arg
	)
	;

userdefineOption
	: (
	USERDEFINE
	)
	;

useridOption
	: (
	USERID arg?
	)
	;

useriderrOption
	: (
	USERIDERR arg?
	)
	;

usernameOption
	: (
	USERNAME arg
	)
	;

usernamelenOption
	: (
	USERNAMELEN arg
	)
	;

useroffOption
	: (
	USEROFF
	)
	;

useronOption
	: (
	USERON
	)
	;

userpriorityOption
	: (
	USERPRIORITY arg
	)
	;

userstatusOption
	: (
	USERSTATUS arg
	)
	;

usertableOption
	: (
	USERTABLE
	)
	;

usertagOption
	: (
	USERTAG arg
	)
	;

usingOption
	: (
	USING arg
	)
	;

validationOption
	: (
	VALIDATION arg?
	)
	;

validationstOption
	: (
	VALIDATIONST arg
	)
	;

validityOption
	: (
	VALIDITY arg
	)
	;

valueOption
	: (
	VALUE arg
	)
	;

valuelengthOption
	: (
	VALUELENGTH arg
	)
	;

variablenameOption
	: (
	VARIABLENAME arg
	)
	;

verifyOption
	: (
	VERIFY
	)
	;

versionOption
	: (
	VERSION arg
	)
	;

versionlenOption
	: (
	VERSIONLEN arg
	)
	;

vformstOption
	: (
	VFORMST arg
	)
	;

voliderrOption
	: (
	VOLIDERR arg?
	)
	;

volumeOption
	: (
	VOLUME arg
	)
	;

volumelengOption
	: (
	VOLUMELENG arg
	)
	;

vtamOption
	: (
	VTAM
	)
	;

waitOption
	: (
	WAIT
	)
	;

waitcauseOption
	: (
	WAITCAUSE arg
	)
	;

waitcicsOption
	: (
	WAITCICS
	)
	;

waitstateOption
	: (
	WAITSTATE arg
	)
	;

webOption
	: (
	WEB
	)
	;

webserviceOption
	: (
	WEBSERVICE arg?
	)
	;

webservlimitOption
	: (
	WEBSERVLIMIT arg
	)
	;

wlmhealthOption
	: (
	WLMHEALTH
	)
	;

wlmopenstOption
	: (
	WLMOPENST arg
	)
	;

workdirOption
	: (
	WORKDIR arg
	)
	;

workrequestOption
	: (
	WORKREQUEST arg?
	)
	;

worktypeOption
	: (
	WORKTYPE arg
	)
	;

wpmedia1Option
	: (
	WPMEDIA1
	)
	;

wpmedia2Option
	: (
	WPMEDIA2
	)
	;

wpmedia3Option
	: (
	WPMEDIA3
	)
	;

wpmedia4Option
	: (
	WPMEDIA4
	)
	;

wrapOption
	: (
	WRAP
	)
	;

wrbrkOption
	: (
	WRBRK arg?
	)
	;

writeOption
	: (
	WRITE
	)
	;

writeqOption
	: (
	WRITEQ
	)
	;

wsacontextOption
	: (
	WSACONTEXT
	)
	;

wsaeprOption
	: (
	WSAEPR
	)
	;

wsbindOption
	: (
	WSBIND arg
	)
	;

wsdirOption
	: (
	WSDIR arg
	)
	;

wsdlfileOption
	: (
	WSDLFILE arg
	)
	;

xcfgroupOption
	: (
	XCFGROUP arg
	)
	;

xctlOption
	: (
	XCTL
	)
	;

xidOption
	: (
	XID arg
	)
	;

xlnstatusOption
	: (
	XLNSTATUS arg
	)
	;

xltOption
	: (
	XLT arg
	)
	;

xmlcontainerOption
	: (
	XMLCONTAINER arg
	)
	;

xmlschemaOption
	: (
	XMLSCHEMA arg
	)
	;

xmltodataOption
	: (
	XMLTODATA
	)
	;

xmltransformOption
	: (
	XMLTRANSFORM arg?
	)
	;

xopdirectstOption
	: (
	XOPDIRECTST arg
	)
	;

xopsupportstOption
	: (
	XOPSUPPORTST arg
	)
	;

xrbaOption
	: (
	XRBA
	)
	;

xrfstatusOption
	: (
	XRFSTATUS arg
	)
	;

xsdbindOption
	: (
	XSDBIND arg
	)
	;

yearOption
	: (
	YEAR arg
	)
	;

yesOption
	: (
	YES
	)
	;

yydddOption
	: (
	YYDDD arg
	)
	;

yyddmmOption
	: (
	YYDDMM arg
	)
	;

yymmddOption
	: (
	YYMMDD arg
	)
	;

yyyydddOption
	: (
	YYYYDDD arg
	)
	;

yyyyddmmOption
	: (
	YYYYDDMM arg
	)
	;

yyyymmddOption
	: (
	YYYYMMDD arg
	)
	;

zcptraceOption
	: (
	ZCPTRACE
	)
	;

zcptracingOption
	: (
	ZCPTRACING arg
	)
	;

// 2376 rules generated Tue Apr  9 13:59:38 CDT 2024

