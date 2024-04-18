/*
Copyright (C) 2024 Craig Schneiderwent.

The author(s) accept no liability for damages of any kind resulting 
from the use of this software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.
*/


lexer grammar CICSzLexer;

@lexer::members {
	int parenNesting = 0;
	
	/*
	These Booleans are intended to be set by an invoking application.  It
	is syntactically correct for portions of a CICS command to be commented
	out in a way that is syntactically correct for the host language.
	*/
	public static Boolean pliCode = false;
	public static Boolean classicCOBOLCode = false;
	public static Boolean freeFormCOBOLCode = false;
	public static Boolean cCode = false;
}

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

fragment SPLAT: '*';
fragment SLASH: '/';
fragment GT: '>';

CLASSIC_COBOL_LINE_NUMBER
	: (~[\n\r] ~[\n\r] ~[\n\r] ~[\n\r] ~[\n\r] ~[\n\r])
	{!freeFormCOBOLCode && classicCOBOLCode && getCharPositionInLine() == 6}?
	->channel(HIDDEN)
	;

fragment CLASSIC_COBOL_COMMENT_FLAG
	: (~[\n\r] ~[\n\r] ~[\n\r] ~[\n\r] ~[\n\r] ~[\n\r] SPLAT)
	{!freeFormCOBOLCode && classicCOBOLCode && getCharPositionInLine() == 7}?
	;

CLASSIC_COBOL_COMMENT
	: (CLASSIC_COBOL_COMMENT_FLAG .*? [\n\r])
	->channel(HIDDEN)
	;

FREE_FORM_COBOL_COMMENT
	: (SPLAT GT ~[\n\r]* [\n\r])
	{(classicCOBOLCode | freeFormCOBOLCode)}?
	->channel(HIDDEN)
	;

PLI_COMMENT
	: (SLASH SPLAT .*? SPLAT SLASH)
	{pliCode}?
	->channel(HIDDEN)
	;

C_COMMENT
	: (
	(SLASH SPLAT .*? SPLAT SLASH)
	| (SLASH SLASH ~[\n\r]* [\n\r])
	)
	{cCode}?
	->channel(HIDDEN)
	;

EXEC_CICS
	: E X E C (U T E)? [ ]+ C I C S
	;

END_EXEC
	: E N D HYPHEN E X E C DOT?
	;

HYPHEN
	: '-'
	;

DOT
	: '.'
	;

SEMICOLON
	: ';'
	;

/*
The nongreedy suffix is necessary to make the CLASSIC_COBOL_COMMENT_FLAG 
work correctly.
*/
WS
	: [ \n\r\t]+?
	->skip
	;

/*
This token indicates an argument to a token follows.
*/

LPAREN
	: '('
	->pushMode(ARG_MODE)
	;

/*

NOHANDLE, RESP, and RESP2 are anomalously documented as parameters
for SPOOLCLOSE, SPOOLOPEN, SPOOLREAD, and SPOOLWRITE.  I'm leaving
these here in case that changes.

NOHANDLE
	: N O H A N D L E
	;

RESP
	: R E S P
	;

RESP2
	: R E S P '2'
	;
*/


ABCODE
	: A B C O D E 
	;

ABDUMP
	: A B D U M P 
	;

ABEND
	: A B E N D 
	;

ABENDCODE
	: A B E N D C O D E 
	;

ABOFFSET
	: A B O F F S E T 
	;

ABORT
	: A B O R T 
	;

ABPROGRAM
	: A B P R O G R A M 
	;

ABSTIME
	: A B S T I M E 
	;

ACAPPLNAME
	: A C A P P L N A M E 
	;

ACCESSMETHOD
	: A C C E S S M E T H O D 
	;

ACCOUNT
	: A C C O U N T 
	;

ACCOUNTREC
	: A C C O U N T R E C 
	;

ACCUM
	: A C C U M 
	;

ACEE
	: A C E E 
	;

ACMAJORVER
	: A C M A J O R V E R 
	;

ACMICROVER
	: A C M I C R O V E R 
	;

ACMINORVER
	: A C M I N O R V E R 
	;

ACOPERNAME
	: A C O P E R N A M E 
	;

ACPLATNAME
	: A C P L A T N A M E 
	;

ACQACTIVITY
	: A C Q A C T I V I T Y 
	;

ACQPROCESS
	: A C Q P R O C E S S 
	;

ACQSTATUS
	: A C Q S T A T U S 
	;

ACQUIRE
	: A C Q U I R E 
	;

ACQUIRED
	: A C Q U I R E D 
	;

ACTION
	: A C T I O N 
	;

ACTIONCOUNT
	: A C T I O N C O U N T 
	;

ACTIONTYPE
	: A C T I O N T Y P E 
	;

ACTIVE
	: A C T I V E 
	;

ACTIVITY
	: A C T I V I T Y 
	;

ACTIVITYBUSY
	: A C T I V I T Y B U S Y 
	;

ACTIVITYERR
	: A C T I V I T Y E R R 
	;

ACTIVITYID
	: A C T I V I T Y I D 
	;

ACTOPENTCBS
	: A C T O P E N T C B S 
	;

ACTPARTN
	: A C T P A R T N 
	;

ACTSOCKETS
	: A C T S O C K E T S 
	;

ACTSSLTCBS
	: A C T S S L T C B S 
	;

ACTTHRDTCBS
	: A C T T H R D T C B S 
	;

ACTXPTCBS
	: A C T X P T C B S 
	;

ADAPTERTYPE
	: A D A P T E R T Y P E 
	;

ADD
	: A D D 
	;

ADDABLE
	: A D D A B L E 
	;

ADDRESS
	: A D D R E S S 
	;

ADDRESS64
	: A D D R E S S '6' '4' 
	;

ADJUSTMENT
	: A D J U S T M E N T 
	;

ADVANCE
	: A D V A N C E 
	;

AFFINITY
	: A F F I N I T Y 
	;

AFTER
	: A F T E R 
	;

AGE
	: A G E 
	;

AIBRIDGE
	: A I B R I D G E 
	;

AID
	: A I D 
	;

AIDCOUNT
	: A I D C O U N T 
	;

AKP
	: A K P 
	;

ALARM
	: A L A R M 
	;

ALL
	: A L L 
	;

ALLOCATE
	: A L L O C A T E 
	;

ALLOCERR
	: A L L O C E R R 
	;

ALTER
	: A L T E R 
	;

ALTERNATE
	: A L T E R N A T E 
	;

ALTPAGEHT
	: A L T P A G E H T 
	;

ALTPAGEWD
	: A L T P A G E W D 
	;

ALTPRINTER
	: A L T P R I N T E R 
	;

ALTPRTCOPY
	: A L T P R T C O P Y 
	;

ALTPRTCOPYST
	: A L T P R T C O P Y S T 
	;

ALTSCRNHT
	: A L T S C R N H T 
	;

ALTSCRNWD
	: A L T S C R N W D 
	;

ALTSUFFIX
	: A L T S U F F I X 
	;

ANALYZERSTAT
	: A N A L Y Z E R S T A T 
	;

AND
	: A N D 
	;

ANY
	: A N Y 
	;

ANYKEY
	: A N Y K E Y 
	;

APIST
	: A P I S T 
	;

APLKYBD
	: A P L K Y B D 
	;

APLKYBDST
	: A P L K Y B D S T 
	;

APLTEXT
	: A P L T E X T 
	;

APLTEXTST
	: A P L T E X T S T 
	;

APPEND
	: A P P E N D 
	;

APPENDCRLF
	: A P P E N D C R L F 
	;

APPID
	: A P P I D 
	;

APPIDLEN
	: A P P I D L E N 
	;

APPLDATA
	: A P P L D A T A 
	;

APPLICATION
	: A P P L I C A T I O N 
	;

APPLID
	: A P P L I D 
	;

APPLMAJORVER
	: A P P L M A J O R V E R 
	;

APPLMICROVER
	: A P P L M I C R O V E R 
	;

APPLMINORVER
	: A P P L M I N O R V E R 
	;

APPLNAMEST
	: A P P L N A M E S T 
	;

APPNOTFOUND
	: A P P N O T F O U N D 
	;

ARCHIVEFILE
	: A R C H I V E F I L E 
	;

ARCHSTATUS
	: A R C H S T A T U S 
	;

AS
	: A S 
	;

ASA
	: A S A 
	;

ASCII
	: A S C I I 
	;

ASIS
	: A S I S 
	;

ASKTIME
	: A S K T I M E 
	;

ASRAINTRPT
	: A S R A I N T R P T 
	;

ASRAKEY
	: A S R A K E Y 
	;

ASRAPSW
	: A S R A P S W 
	;

ASRAPSW16
	: A S R A P S W '1' '6' 
	;

ASRAREGS
	: A S R A R E G S 
	;

ASRAREGS64
	: A S R A R E G S '6' '4' 
	;

ASRASPC
	: A S R A S P C 
	;

ASRASTG
	: A S R A S T G 
	;

ASSIGN
	: A S S I G N 
	;

ASSOCIATION
	: A S S O C I A T I O N 
	;

ASYNCHRONOUS
	: A S Y N C H R O N O U S 
	;

ASYNCSERVICE
	: A S Y N C S E R V I C E 
	;

AT
	: A T 
	;

ATI
	: A T I 
	;

ATIFACILITY
	: A T I F A C I L I T Y 
	;

ATISTATUS
	: A T I S T A T U S 
	;

ATITERMID
	: A T I T E R M I D 
	;

ATITRANID
	: A T I T R A N I D 
	;

ATIUSERID
	: A T I U S E R I D 
	;

ATOMSERVICE
	: A T O M S E R V I C E 
	;

ATOMTYPE
	: A T O M T Y P E 
	;

ATTACH
	: A T T A C H 
	;

ATTACHID
	: A T T A C H I D 
	;

ATTACHSEC
	: A T T A C H S E C 
	;

ATTACHTIME
	: A T T A C H T I M E 
	;

ATTLS
	: A T T L S 
	;

ATTRIBUTES
	: A T T R I B U T E S 
	;

ATTRLEN
	: A T T R L E N 
	;

AUDALARMST
	: A U D A L A R M S T 
	;

AUDITLEVEL
	: A U D I T L E V E L 
	;

AUDITLOG
	: A U D I T L O G 
	;

AUTHENTICATE
	: A U T H E N T I C A T E 
	;

AUTHID
	: A U T H I D 
	;

AUTHORITY
	: A U T H O R I T Y 
	;

AUTHTYPE
	: A U T H T Y P E 
	;

AUTHUSERID
	: A U T H U S E R I D 
	;

AUTINSTMODEL
	: A U T I N S T M O D E L 
	;

AUTOACTIVE
	: A U T O A C T I V E 
	;

AUTOCONNECT
	: A U T O C O N N E C T 
	;

AUTOINACTIVE
	: A U T O I N A C T I V E 
	;

AUTOINSTALL
	: A U T O I N S T A L L 
	;

AUTOPAGE
	: A U T O P A G E 
	;

AUTOPAGEABLE
	: A U T O P A G E A B L E 
	;

AUTOSTART
	: A U T O S T A R T 
	;

AUTOSTATUS
	: A U T O S T A T U S 
	;

AUXILIARY
	: A U X I L I A R Y 
	;

AUXPAUSE
	: A U X P A U S E 
	;

AUXSTART
	: A U X S T A R T 
	;

AUXSTATUS
	: A U X S T A T U S 
	;

AUXSTOP
	: A U X S T O P 
	;

AVAILABILITY
	: A V A I L A B I L I T Y 
	;

AVAILABLE
	: A V A I L A B L E 
	;

AVAILSTATUS
	: A V A I L S T A T U S 
	;

BACKLOG
	: B A C K L O G 
	;

BACKOUT
	: B A C K O U T 
	;

BACKTRANSST
	: B A C K T R A N S S T 
	;

BACKUPTYPE
	: B A C K U P T Y P E 
	;

BASE64
	: B A S E '6' '4' 
	;

BASEDSNAME
	: B A S E D S N A M E 
	;

BASESCOPE
	: B A S E S C O P E 
	;

BASICAUTH
	: B A S I C A U T H 
	;

BEFORE
	: B E F O R E 
	;

BELOW
	: B E L O W 
	;

BIF
	: B I F 
	;

BINARY
	: B I N A R Y 
	;

BINDFILE
	: B I N D F I L E 
	;

BINDING
	: B I N D I N G 
	;

BIT
	: B I T 
	;

BLOCKFORMAT
	: B L O C K F O R M A T 
	;

BLOCKKEYLEN
	: B L O C K K E Y L E N 
	;

BLOCKSIZE
	: B L O C K S I Z E 
	;

BODYCHARSET
	: B O D Y C H A R S E T 
	;

BOOKMARK
	: B O O K M A R K 
	;

BOTHNUM
	: B O T H N U M 
	;

BRANCHQUAL
	: B R A N C H Q U A L 
	;

BRDATA
	: B R D A T A 
	;

BRDATALENGTH
	: B R D A T A L E N G T H 
	;

BREXIT
	: B R E X I T 
	;

BRFACILITY
	: B R F A C I L I T Y 
	;

BRIDGE
	: B R I D G E 
	;

BROWSABLE
	: B R O W S A B L E 
	;

BROWSE
	: B R O W S E 
	;

BROWSETOKEN
	: B R O W S E T O K E N 
	;

BTRANS
	: B T R A N S 
	;

BUFFER
	: B U F F E R 
	;

BUILD
	: B U I L D 
	;

BUNDLE
	: B U N D L E 
	;

BUNDLEDIR
	: B U N D L E D I R 
	;

BUNDLEID
	: B U N D L E I D 
	;

BUNDLEPART
	: B U N D L E P A R T 
	;

BUSY
	: B U S Y 
	;

BYTEOFFSET
	: B Y T E O F F S E T 
	;

CACHESIZE
	: C A C H E S I Z E 
	;

CADDRLENGTH
	: C A D D R L E N G T H 
	;

CALLER
	: C A L L E R 
	;

CALLERLENGTH
	: C A L L E R L E N G T H 
	;

CANCEL
	: C A N C E L 
	;

CAPDATAPRED
	: C A P D A T A P R E D 
	;

CAPINFOSRCE
	: C A P I N F O S R C E 
	;

CAPOPTPRED
	: C A P O P T P R E D 
	;

CAPTUREPOINT
	: C A P T U R E P O I N T 
	;

CAPTUREPTYPE
	: C A P T U R E P T Y P E 
	;

CAPTURESPEC
	: C A P T U R E S P E C 
	;

CARD
	: C A R D 
	;

CAUSE
	: C A U S E 
	;

CBIDERR
	: C B I D E R R 
	;

CBUFF
	: C B U F F 
	;

CCSID
	: C C S I D 
	;

CCSIDERR
	: C C S I D E R R 
	;

CDSASIZE
	: C D S A S I Z E 
	;

CEDF
	: C E D F 
	;

CEDFSTATUS
	: C E D F S T A T U S 
	;

CERTIFICATE
	: C E R T I F I C A T E 
	;

CFDTPOOL
	: C F D T P O O L 
	;

CFTABLE
	: C F T A B L E 
	;

CGROUP
	: C G R O U P 
	;

CHANGE
	: C H A N G E 
	;

CHANGEAGENT
	: C H A N G E A G E N T 
	;

CHANGEAGREL
	: C H A N G E A G R E L 
	;

CHANGED
	: C H A N G E D 
	;

CHANGETIME
	: C H A N G E T I M E 
	;

CHANGEUSRID
	: C H A N G E U S R I D 
	;

CHANNEL
	: C H A N N E L 
	;

CHANNELERR
	: C H A N N E L E R R 
	;

CHAR
	: C H A R 
	;

CHARACTERSET
	: C H A R A C T E R S E T 
	;

CHECK
	: C H E C K 
	;

CHILD
	: C H I L D 
	;

CHUNKEND
	: C H U N K E N D 
	;

CHUNKING
	: C H U N K I N G 
	;

CHUNKNO
	: C H U N K N O 
	;

CHUNKYES
	: C H U N K Y E S 
	;

CICSDATAKEY
	: C I C S D A T A K E Y 
	;

CICSSTATUS
	: C I C S S T A T U S 
	;

CICSSYS
	: C I C S S Y S 
	;

CICSTABLE
	: C I C S T A B L E 
	;

CICSTSLEVEL
	: C I C S T S L E V E L 
	;

CIDDOMAIN
	: C I D D O M A I N 
	;

CIPHER
	: C I P H E R 
	;

CIPHERS
	: C I P H E R S 
	;

CLASS
	: C L A S S 
	;

CLEAR
	: C L E A R 
	;

CLICONVERT
	: C L I C O N V E R T 
	;

CLIENT
	: C L I E N T 
	;

CLIENTADDR
	: C L I E N T A D D R 
	;

CLIENTADDRNU
	: C L I E N T A D D R N U 
	;

CLIENTCONV
	: C L I E N T C O N V 
	;

CLIENTIPADDR
	: C L I E N T I P A D D R 
	;

CLIENTLOC
	: C L I E N T L O C 
	;

CLIENTNAME
	: C L I E N T N A M E 
	;

CLIENTPORT
	: C L I E N T P O R T 
	;

CLNTADDR6NU
	: C L N T A D D R '6' N U 
	;

CLNTIP6ADDR
	: C L N T I P '6' A D D R 
	;

CLNTIPFAMILY
	: C L N T I P F A M I L Y 
	;

CLOSE
	: C L O S E 
	;

CLOSED
	: C L O S E D 
	;

CLOSELEAVE
	: C L O S E L E A V E 
	;

CLOSESTATUS
	: C L O S E S T A T U S 
	;

CLOSETIMEOUT
	: C L O S E T I M E O U T 
	;

CLRPARTN
	: C L R P A R T N 
	;

CMDPROTECT
	: C M D P R O T E C T 
	;

CMDSEC
	: C M D S E C 
	;

CNAMELENGTH
	: C N A M E L E N G T H 
	;

CNOTCOMPL
	: C N O T C O M P L 
	;

COBOLTYPE
	: C O B O L T Y P E 
	;

CODEPAGE
	: C O D E P A G E 
	;

CODEPAGEERR
	: C O D E P A G E E R R 
	;

COLDACQ
	: C O L D A C Q 
	;

COLDSTATUS
	: C O L D S T A T U S 
	;

COLLECT
	: C O L L E C T 
	;

COLOR
	: C O L O R 
	;

COLORST
	: C O L O R S T 
	;

COMAUTHID
	: C O M A U T H I D 
	;

COMAUTHTYPE
	: C O M A U T H T Y P E 
	;

COMMAREA
	: C O M M A R E A 
	;

COMMIT
	: C O M M I T 
	;

COMMONNAME
	: C O M M O N N A M E 
	;

COMMONNAMLEN
	: C O M M O N N A M L E N 
	;

COMPAREMAX
	: C O M P A R E M A X 
	;

COMPAREMIN
	: C O M P A R E M I N 
	;

COMPAT
	: C O M P A T 
	;

COMPATMODE
	: C O M P A T M O D E 
	;

COMPID
	: C O M P I D 
	;

COMPLETE
	: C O M P L E T E 
	;

COMPOSITE
	: C O M P O S I T E 
	;

COMPRESS
	: C O M P R E S S 
	;

COMPRESSST
	: C O M P R E S S S T 
	;

COMPSTATUS
	: C O M P S T A T U S 
	;

COMTHREADLIM
	: C O M T H R E A D L I M 
	;

COMTHREADS
	: C O M T H R E A D S 
	;

CONCURRENCY
	: C O N C U R R E N C Y 
	;

CONCURRENTST
	: C O N C U R R E N T S T 
	;

CONDITION
	: C O N D I T I O N 
	;

CONFIG
	: C O N F I G 
	;

CONFIGDATA1
	: C O N F I G D A T A '1' 
	;

CONFIGFILE
	: C O N F I G F I L E 
	;

CONFIRM
	: C O N F I R M 
	;

CONFIRMATION
	: C O N F I R M A T I O N 
	;

CONNECT
	: C O N N E C T 
	;

CONNECTED
	: C O N N E C T E D 
	;

CONNECTERROR
	: C O N N E C T E R R O R 
	;

CONNECTION
	: C O N N E C T I O N 
	;

CONNECTIONS
	: C O N N E C T I O N S 
	;

CONNECTST
	: C O N N E C T S T 
	;

CONNSTATUS
	: C O N N S T A T U S 
	;

CONNTYPE
	: C O N N T Y P E 
	;

CONSISTENT
	: C O N S I S T E N T 
	;

CONSNAME
	: C O N S N A M E 
	;

CONSOLE
	: C O N S O L E 
	;

CONSOLES
	: C O N S O L E S 
	;

CONTAINER
	: C O N T A I N E R 
	;

CONTAINERCNT
	: C O N T A I N E R C N T 
	;

CONTAINERERR
	: C O N T A I N E R E R R 
	;

CONTENTION
	: C O N T E N T I O N 
	;

CONTEXTTYPE
	: C O N T E X T T Y P E 
	;

CONTROL
	: C O N T R O L 
	;

CONVDATA
	: C O N V D A T A 
	;

CONVERSE
	: C O N V E R S E 
	;

CONVERSEST
	: C O N V E R S E S T 
	;

CONVERTER
	: C O N V E R T E R 
	;

CONVERTST
	: C O N V E R T S T 
	;

CONVERTTIME
	: C O N V E R T T I M E 
	;

CONVID
	: C O N V I D 
	;

COPID
	: C O P I D 
	;

COPIES
	: C O P I E S 
	;

COPY
	: C O P Y 
	;

COPYST
	: C O P Y S T 
	;

CORBASERVER
	: C O R B A S E R V E R 
	;

CORRELID
	: C O R R E L I D 
	;

COUNTER
	: C O U N T E R 
	;

COUNTRY
	: C O U N T R Y 
	;

COUNTRYLEN
	: C O U N T R Y L E N 
	;

CQP
	: C Q P 
	;

CREATE
	: C R E A T E 
	;

CREATESESS
	: C R E A T E S E S S 
	;

CRITICAL
	: C R I T I C A L 
	;

CRITICALST
	: C R I T I C A L S T 
	;

CRLPROFILE
	: C R L P R O F I L E 
	;

CSA
	: C S A 
	;

CSD
	: C S D 
	;

CSDERR
	: C S D E R R 
	;

CSIGN
	: C S I G N 
	;

CTERM
	: C T E R M 
	;

CTLCHAR
	: C T L C H A R 
	;

CTLGALL
	: C T L G A L L 
	;

CTLGMODIFY
	: C T L G M O D I F Y 
	;

CTLGNONE
	: C T L G N O N E 
	;

CTX
	: C T X 
	;

CURAUXDS
	: C U R A U X D S 
	;

CURRENT
	: C U R R E N T 
	;

CURRENTDDS
	: C U R R E N T D D S 
	;

CURRENTHEAP
	: C U R R E N T H E A P 
	;

CURRENTPROG
	: C U R R E N T P R O G 
	;

CURREQS
	: C U R R E Q S 
	;

CURRPGM
	: C U R R P G M 
	;

CURRPGMOP
	: C U R R P G M O P 
	;

CURRTRANID
	: C U R R T R A N I D 
	;

CURRTRANIDOP
	: C U R R T R A N I D O P 
	;

CURRUSERID
	: C U R R U S E R I D 
	;

CURRUSERIDOP
	: C U R R U S E R I D O P 
	;

CURSOR
	: C U R S O R 
	;

CUSERID
	: C U S E R I D 
	;

CWA
	: C W A 
	;

CWALENG
	: C W A L E N G 
	;

DAE
	: D A E 
	;

DAEOPTION
	: D A E O P T I O N 
	;

DATA
	: D A T A 
	;

DATA1
	: D A T A '1' 
	;

DATA2
	: D A T A '2' 
	;

DATABUFFERS
	: D A T A B U F F E R S 
	;

DATAFORMAT
	: D A T A F O R M A T 
	;

DATALENGTH
	: D A T A L E N G T H 
	;

DATALOCATION
	: D A T A L O C A T I O N 
	;

DATAONLY
	: D A T A O N L Y 
	;

DATAPOINTER
	: D A T A P O I N T E R 
	;

DATASET
	: D A T A S E T 
	;

DATASTR
	: D A T A S T R 
	;

DATASTREAM
	: D A T A S T R E A M 
	;

DATATOJSON
	: D A T A T O J S O N 
	;

DATATOXML
	: D A T A T O X M L 
	;

DATATYPE
	: D A T A T Y P E 
	;

DATCONTAINER
	: D A T C O N T A I N E R 
	;

DATE
	: D A T E 
	;

DATEFORM
	: D A T E F O R M 
	;

DATESEP
	: D A T E S E P 
	;

DATESTRING
	: D A T E S T R I N G 
	;

DATETIME
	: D A T E T I M E 
	;

DAYCOUNT
	: D A Y C O U N T 
	;

DAYOFMONTH
	: D A Y O F M O N T H 
	;

DAYOFWEEK
	: D A Y O F W E E K 
	;

DAYOFYEAR
	: D A Y O F Y E A R 
	;

DAYS
	: D A Y S 
	;

DAYSLEFT
	: D A Y S L E F T 
	;

DB2
	: D B '2' 
	;

DB2CONN
	: D B '2' C O N N 
	;

DB2ENTRY
	: D B '2' E N T R Y 
	;

DB2GROUPID
	: D B '2' G R O U P I D 
	;

DB2ID
	: D B '2' I D 
	;

DB2PLAN
	: D B '2' P L A N 
	;

DB2RELEASE
	: D B '2' R E L E A S E 
	;

DB2TRAN
	: D B '2' T R A N 
	;

DCOUNTER
	: D C O U N T E R 
	;

DCT
	: D C T 
	;

DDMMYY
	: D D M M Y Y 
	;

DDMMYYYY
	: D D M M Y Y Y Y 
	;

DDNAME
	: D D N A M E 
	;

DEBKEY
	: D E B K E Y 
	;

DEBREC
	: D E B R E C 
	;

DEBUG
	: D E B U G 
	;

DEBUGTOOL
	: D E B U G T O O L 
	;

DEEDIT
	: D E E D I T 
	;

DEFAULT
	: D E F A U L T 
	;

DEFINE
	: D E F I N E 
	;

DEFINESOURCE
	: D E F I N E S O U R C E 
	;

DEFINETIME
	: D E F I N E T I M E 
	;

DEFPAGEHT
	: D E F P A G E H T 
	;

DEFPAGEWD
	: D E F P A G E W D 
	;

DEFRESP
	: D E F R E S P 
	;

DEFSCRNHT
	: D E F S C R N H T 
	;

DEFSCRNWD
	: D E F S C R N W D 
	;

DELAY
	: D E L A Y 
	;

DELETABLE
	: D E L E T A B L E 
	;

DELETE
	: D E L E T E 
	;

DELETEQ
	: D E L E T E Q 
	;

DELETSHIPPED
	: D E L E T S H I P P E D 
	;

DELIMITER
	: D E L I M I T E R 
	;

DEQ
	: D E Q 
	;

DEREGISTERED
	: D E R E G I S T E R E D 
	;

DESTCOUNT
	: D E S T C O U N T 
	;

DESTID
	: D E S T I D 
	;

DESTIDLENG
	: D E S T I D L E N G 
	;

DESTINATION
	: D E S T I N A T I O N 
	;

DETAIL
	: D E T A I L 
	;

DETAILLENGTH
	: D E T A I L L E N G T H 
	;

DEVICE
	: D E V I C E 
	;

DFLTUSER
	: D F L T U S E R 
	;

DIAGNOSTICS
	: D I A G N O S T I C S 
	;

DIGEST
	: D I G E S T 
	;

DIGESTTYPE
	: D I G E S T T Y P E 
	;

DISABLE
	: D I S A B L E 
	;

DISABLED
	: D I S A B L E D 
	;

DISABLEDACT
	: D I S A B L E D A C T 
	;

DISCARD
	: D I S C A R D 
	;

DISCONNECT
	: D I S C O N N E C T 
	;

DISCREQ
	: D I S C R E Q 
	;

DISCREQST
	: D I S C R E Q S T 
	;

DISKASTATUS
	: D I S K A S T A T U S 
	;

DISKBSTATUS
	: D I S K B S T A T U S 
	;

DISPATCHABLE
	: D I S P A T C H A B L E 
	;

DISPATCHER
	: D I S P A T C H E R 
	;

DISPOSITION
	: D I S P O S I T I O N 
	;

DJAR
	: D J A R 
	;

DNAME
	: D N A M E 
	;

DNAMELEN
	: D N A M E L E N 
	;

DOCDELETE
	: D O C D E L E T E 
	;

DOCSIZE
	: D O C S I Z E 
	;

DOCSTATUS
	: D O C S T A T U S 
	;

DOCTEMPLATE
	: D O C T E M P L A T E 
	;

DOCTOKEN
	: D O C T O K E N 
	;

DOCUMENT
	: D O C U M E N T 
	;

DPLLIMIT
	: D P L L I M I T 
	;

DPLSUBSET
	: D P L S U B S E T 
	;

DRAIN
	: D R A I N 
	;

DROLLBACK
	: D R O L L B A C K 
	;

DS3270
	: D S '3' '2' '7' '0' 
	;

DSALIMIT
	: D S A L I M I T 
	;

DSANAME
	: D S A N A M E 
	;

DSNAME
	: D S N A M E 
	;

DSNAME01
	: D S N A M E '0' '1' 
	;

DSNAME02
	: D S N A M E '0' '2' 
	;

DSNAME03
	: D S N A M E '0' '3' 
	;

DSNAME04
	: D S N A M E '0' '4' 
	;

DSNAME05
	: D S N A M E '0' '5' 
	;

DSNAME06
	: D S N A M E '0' '6' 
	;

DSNAME07
	: D S N A M E '0' '7' 
	;

DSNAME08
	: D S N A M E '0' '8' 
	;

DSNAME09
	: D S N A M E '0' '9' 
	;

DSNAME10
	: D S N A M E '1' '0' 
	;

DSNAME11
	: D S N A M E '1' '1' 
	;

DSNAME12
	: D S N A M E '1' '2' 
	;

DSNAME13
	: D S N A M E '1' '3' 
	;

DSNAME14
	: D S N A M E '1' '4' 
	;

DSNAME15
	: D S N A M E '1' '5' 
	;

DSNAME16
	: D S N A M E '1' '6' 
	;

DSNAMELIST
	: D S N A M E L I S T 
	;

DSNNOTFOUND
	: D S N N O T F O U N D 
	;

DSPLIST
	: D S P L I S T 
	;

DSRTPROGRAM
	: D S R T P R O G R A M 
	;

DSSCS
	: D S S C S 
	;

DSSTAT
	: D S S T A T 
	;

DTIMEOUT
	: D T I M E O U T 
	;

DTRPROGRAM
	: D T R P R O G R A M 
	;

DUALCASEST
	: D U A L C A S E S T 
	;

DUMP
	: D U M P 
	;

DUMPCODE
	: D U M P C O D E 
	;

DUMPDS
	: D U M P D S 
	;

DUMPID
	: D U M P I D 
	;

DUMPING
	: D U M P I N G 
	;

DUMPSCOPE
	: D U M P S C O P E 
	;

DUMPTYPE
	: D U M P T Y P E 
	;

DUPACTION
	: D U P A C T I O N 
	;

DUPERROR
	: D U P E R R O R 
	;

DUPKEY
	: D U P K E Y 
	;

DUPNOREPLACE
	: D U P N O R E P L A C E 
	;

DUPREC
	: D U P R E C 
	;

DUPREPLACE
	: D U P R E P L A C E 
	;

DUPRES
	: D U P R E S 
	;

DURATION
	: D U R A T I O N 
	;

DYNAMSTATUS
	: D Y N A M S T A T U S 
	;

ECADDR
	: E C A D D R 
	;

ECBLIST
	: E C B L I S T 
	;

ECDSASIZE
	: E C D S A S I Z E 
	;

EDSALIMIT
	: E D S A L I M I T 
	;

EIB
	: E I B 
	;

ELEMENT
	: E L E M E N T 
	;

ELEMENT64
	: E L E M E N T '6' '4' 
	;

ELEMENTLIST
	: E L E M E N T L I S T 
	;

ELEMNAME
	: E L E M N A M E 
	;

ELEMNAMELEN
	: E L E M N A M E L E N 
	;

ELEMNS
	: E L E M N S 
	;

ELEMNSLEN
	: E L E M N S L E N 
	;

EMITMODE
	: E M I T M O D E 
	;

EMPTY
	: E M P T Y 
	;

EMPTYREQ
	: E M P T Y R E Q 
	;

EMPTYSTATUS
	: E M P T Y S T A T U S 
	;

ENABLE
	: E N A B L E 
	;

ENABLED
	: E N A B L E D 
	;

ENABLEDCOUNT
	: E N A B L E D C O U N T 
	;

ENABLESTATUS
	: E N A B L E S T A T U S 
	;

ENCRYPTKEY
	: E N C R Y P T K E Y 
	;

ENCRYPTPTKT
	: E N C R Y P T P T K T 
	;

END
	: E N D 
	;

ENDACTIVITY
	: E N D A C T I V I T Y 
	;

ENDAFFINITY
	: E N D A F F I N I T Y 
	;

ENDBR
	: E N D B R 
	;

ENDBRGROUP
	: E N D B R G R O U P 
	;

ENDBRLIST
	: E N D B R L I S T 
	;

ENDBROWSE
	: E N D B R O W S E 
	;

ENDBRRSRCE
	: E N D B R R S R C E 
	;

ENDDATA
	: E N D D A T A 
	;

ENDFILE
	: E N D F I L E 
	;

ENDINPT
	: E N D I N P T 
	;

ENDOFDAY
	: E N D O F D A Y 
	;

ENDOFDAYHRS
	: E N D O F D A Y H R S 
	;

ENDOFDAYMINS
	: E N D O F D A Y M I N S 
	;

ENDOFDAYSECS
	: E N D O F D A Y S E C S 
	;

ENDOUTPUT
	: E N D O U T P U T 
	;

ENDPOINT
	: E N D P O I N T 
	;

ENQ
	: E N Q 
	;

ENQBUSY
	: E N Q B U S Y 
	;

ENQFAILS
	: E N Q F A I L S 
	;

ENQMODEL
	: E N Q M O D E L 
	;

ENQNAME
	: E N Q N A M E 
	;

ENQSCOPE
	: E N Q S C O P E 
	;

ENQUEUE
	: E N Q U E U E 
	;

ENTER
	: E N T E R 
	;

ENTRY
	: E N T R Y 
	;

ENTRYNAME
	: E N T R Y N A M E 
	;

ENTRYPOINT
	: E N T R Y P O I N T 
	;

ENVDEFERR
	: E N V D E F E R R 
	;

EOC
	: E O C 
	;

EODS
	: E O D S 
	;

EOF_
	: E O F 
	;

EPADAPTER
	: E P A D A P T E R 
	;

EPADAPTERNUM
	: E P A D A P T E R N U M 
	;

EPADAPTERRES
	: E P A D A P T E R R E S 
	;

EPADAPTERSET
	: E P A D A P T E R S E T 
	;

EPADAPTINSET
	: E P A D A P T I N S E T 
	;

EPCDSASIZE
	: E P C D S A S I Z E 
	;

EPRFIELD
	: E P R F I E L D 
	;

EPRFROM
	: E P R F R O M 
	;

EPRINTO
	: E P R I N T O 
	;

EPRLENGTH
	: E P R L E N G T H 
	;

EPRSET
	: E P R S E T 
	;

EPRTYPE
	: E P R T Y P E 
	;

EPSTATUS
	: E P S T A T U S 
	;

EPUDSASIZE
	: E P U D S A S I Z E 
	;

EQUAL
	: E Q U A L 
	;

ERASE
	: E R A S E 
	;

ERASEAUP
	: E R A S E A U P 
	;

ERDSASIZE
	: E R D S A S I Z E 
	;

ERROR
	: E R R O R 
	;

ERRORMSG
	: E R R O R M S G 
	;

ERRORMSGLEN
	: E R R O R M S G L E N 
	;

ERROROPTION
	: E R R O R O P T I O N 
	;

ERRTERM
	: E R R T E R M 
	;

ESCAPE
	: E S C A P E 
	;

ESDSASIZE
	: E S D S A S I Z E 
	;

ESMAPPNAME
	: E S M A P P N A M E 
	;

ESMREASON
	: E S M R E A S O N 
	;

ESMRESP
	: E S M R E S P 
	;

ETDSASIZE
	: E T D S A S I Z E 
	;

EUDSASIZE
	: E U D S A S I Z E 
	;

EVENT
	: E V E N T 
	;

EVENTBINDING
	: E V E N T B I N D I N G 
	;

EVENTERR
	: E V E N T E R R 
	;

EVENTNAME
	: E V E N T N A M E 
	;

EVENTPROCESS
	: E V E N T P R O C E S S 
	;

EVENTTYPE
	: E V E N T T Y P E 
	;

EVENTUAL
	: E V E N T U A L 
	;

EWASUPP
	: E W A S U P P 
	;

EXACTMATCH
	: E X A C T M A T C H 
	;

EXCEPT
	: E X C E P T 
	;

EXCEPTCLASS
	: E X C E P T C L A S S 
	;

EXCEPTION
	: E X C E P T I O N 
	;

EXCI
	: E X C I 
	;

EXCLUSIVE
	: E X C L U S I V E 
	;

EXCTL
	: E X C T L 
	;

EXECKEY
	: E X E C K E Y 
	;

EXECUTABLE
	: E X E C U T A B L E 
	;

EXECUTIONSET
	: E X E C U T I O N S E T 
	;

EXIT
	: E X I T 
	;

EXITALL
	: E X I T A L L 
	;

EXITPGM
	: E X I T P G M 
	;

EXITPROGRAM
	: E X I T P R O G R A M 
	;

EXITTRACE
	: E X I T T R A C E 
	;

EXITTRACING
	: E X I T T R A C I N G 
	;

EXPECT
	: E X P E C T 
	;

EXPIRED
	: E X P I R E D 
	;

EXPIRYINT
	: E X P I R Y I N T 
	;

EXPIRYINTMIN
	: E X P I R Y I N T M I N 
	;

EXPIRYTIME
	: E X P I R Y T I M E 
	;

EXTDS
	: E X T D S 
	;

EXTENDEDDSST
	: E X T E N D E D D S S T 
	;

EXTERNAL
	: E X T E R N A L 
	;

EXTRACT
	: E X T R A C T 
	;

FACILITY
	: F A C I L I T Y 
	;

FACILITYLIKE
	: F A C I L I T Y L I K E 
	;

FACILITYTOKN
	: F A C I L I T Y T O K N 
	;

FACILITYTYPE
	: F A C I L I T Y T Y P E 
	;

FACILNAME
	: F A C I L N A M E 
	;

FACILTYPE
	: F A C I L T Y P E 
	;

FAULTACTLEN
	: F A U L T A C T L E N 
	;

FAULTACTOR
	: F A U L T A C T O R 
	;

FAULTCODE
	: F A U L T C O D E 
	;

FAULTCODELEN
	: F A U L T C O D E L E N 
	;

FAULTCODESTR
	: F A U L T C O D E S T R 
	;

FAULTSTRING
	: F A U L T S T R I N G 
	;

FAULTSTRLEN
	: F A U L T S T R L E N 
	;

FCI
	: F C I 
	;

FCT
	: F C T 
	;

FEATUREKEY
	: F E A T U R E K E Y 
	;

FEPI
	: F E P I 
	;

FETCH
	: F E T C H 
	;

FIELD
	: F I E L D 
	;

FIELDLENGTH
	: F I E L D L E N G T H 
	;

FIELDOFFSET
	: F I E L D O F F S E T 
	;

FILE
	: F I L E 
	;

FILECOUNT
	: F I L E C O U N T 
	;

FILELIMIT
	: F I L E L I M I T 
	;

FILENAME
	: F I L E N A M E 
	;

FILENOTFOUND
	: F I L E N O T F O U N D 
	;

FILEPATH
	: F I L E P A T H 
	;

FILTERVALUE
	: F I L T E R V A L U E 
	;

FIRESTATUS
	: F I R E S T A T U S 
	;

FLAGSET
	: F L A G S E T 
	;

FLENGTH
	: F L E N G T H 
	;

FLUSH
	: F L U S H 
	;

FMH
	: F M H 
	;

FMHPARM
	: F M H P A R M 
	;

FMHPARMST
	: F M H P A R M S T 
	;

FMHSTATUS
	: F M H S T A T U S 
	;

FOOT
	: F O O T 
	;

FOOTNUM
	: F O O T N U M 
	;

FOR
	: F O R 
	;

FORCE
	: F O R C E 
	;

FORCECANCEL
	: F O R C E C A N C E L 
	;

FORCECLOSE
	: F O R C E C L O S E 
	;

FORCEPURGE
	: F O R C E P U R G E 
	;

FORCEQR
	: F O R C E Q R 
	;

FORCEUOW
	: F O R C E U O W 
	;

FORMATEDF
	: F O R M A T E D F 
	;

FORMATEDFST
	: F O R M A T E D F S T 
	;

FORMATTIME
	: F O R M A T T I M E 
	;

FORMFEED
	: F O R M F E E D 
	;

FORMFEEDST
	: F O R M F E E D S T 
	;

FORMFIELD
	: F O R M F I E L D 
	;

FORMS
	: F O R M S 
	;

FREE
	: F R E E 
	;

FREEKB
	: F R E E K B 
	;

FREEMAIN
	: F R E E M A I N 
	;

FREEMAIN64
	: F R E E M A I N '6' '4' 
	;

FREQUENCY
	: F R E Q U E N C Y 
	;

FREQUENCYHRS
	: F R E Q U E N C Y H R S 
	;

FREQUENCYMIN
	: F R E Q U E N C Y M I N 
	;

FREQUENCYMINS
	: F R E Q U E N C Y M I N S 
	;

FREQUENCYSEC
	: F R E Q U E N C Y S E C 
	;

FREQUENCYSECS
	: F R E Q U E N C Y S E C S 
	;

FROM
	: F R O M 
	;

FROMACTIVITY
	: F R O M A C T I V I T Y 
	;

FROMCCSID
	: F R O M C C S I D 
	;

FROMCHANNEL
	: F R O M C H A N N E L 
	;

FROMCODEPAGE
	: F R O M C O D E P A G E 
	;

FROMDOC
	: F R O M D O C 
	;

FROMFLENGTH
	: F R O M F L E N G T H 
	;

FROMLENGTH
	: F R O M L E N G T H 
	;

FROMPROCESS
	: F R O M P R O C E S S 
	;

FRSET
	: F R S E T 
	;

FULL
	: F U L L 
	;

FULLAPI
	: F U L L A P I 
	;

FULLDATE
	: F U L L D A T E 
	;

FUNCERR
	: F U N C E R R 
	;

FWDRECOVLOG
	: F W D R E C O V L O G 
	;

FWDRECOVLSN
	: F W D R E C O V L S N 
	;

FWDRECSTATUS
	: F W D R E C S T A T U S 
	;

GAENTRYNAME
	: G A E N T R Y N A M E 
	;

GAEXECUTABLE
	: G A E X E C U T A B L E 
	;

GALENGTH
	: G A L E N G T H 
	;

GALOCATION
	: G A L O C A T I O N 
	;

GARBAGEINT
	: G A R B A G E I N T 
	;

GASET
	: G A S E T 
	;

GATHER
	: G A T H E R 
	;

GATHERTYPE
	: G A T H E R T Y P E 
	;

GAUSECOUNT
	: G A U S E C O U N T 
	;

GCDSASIZE
	: G C D S A S I Z E 
	;

GCHARS
	: G C H A R S 
	;

GCODES
	: G C O D E S 
	;

GCPOLICY
	: G C P O L I C Y 
	;

GDS
	: G D S 
	;

GENERIC
	: G E N E R I C 
	;

GENERICTCPS
	: G E N E R I C T C P S 
	;

GET
	: G E T 
	;

GET64
	: G E T '6' '4' 
	;

GETMAIN
	: G E T M A I N 
	;

GETMAIN64
	: G E T M A I N '6' '4' 
	;

GETNEXT
	: G E T N E X T 
	;

GETNEXTGROUP
	: G E T N E X T G R O U P 
	;

GETNEXTLIST
	: G E T N E X T L I S T 
	;

GETNEXTRSRCE
	: G E T N E X T R S R C E 
	;

GMEXITOPT
	: G M E X I T O P T 
	;

GMMI
	: G M M I 
	;

GMMLENGTH
	: G M M L E N G T H 
	;

GMMTEXT
	: G M M T E X T 
	;

GMMTRANID
	: G M M T R A N I D 
	;

GRNAME
	: G R N A M E 
	;

GROUP
	: G R O U P 
	;

GROUPID
	: G R O U P I D 
	;

GROUPRESYNC
	: G R O U P R E S Y N C 
	;

GRSTATUS
	: G R S T A T U S 
	;

GSDSASIZE
	: G S D S A S I Z E 
	;

GSKRESP
	: G S K R E S P 
	;

GTEQ
	: G T E Q 
	;

GTFSTART
	: G T F S T A R T 
	;

GTFSTATUS
	: G T F S T A T U S 
	;

GTFSTOP
	: G T F S T O P 
	;

GUDSASIZE
	: G U D S A S I Z E 
	;

HA
	: H A 
	;

HANDLE
	: H A N D L E 
	;

HEAD
	: H E A D 
	;

HEADER
	: H E A D E R 
	;

HEADNUM
	: H E A D N U M 
	;

HEALTH
	: H E A L T H 
	;

HEALTHABSTIM
	: H E A L T H A B S T I M 
	;

HEALTHCHECK
	: H E A L T H C H E C K 
	;

HEAP
	: H E A P 
	;

HEX
	: H E X 
	;

HFORMST
	: H F O R M S T 
	;

HFSFILE
	: H F S F I L E 
	;

HIGH
	: H I G H 
	;

HILIGHT
	: H I L I G H T 
	;

HILIGHTST
	: H I L I G H T S T 
	;

HOLD
	: H O L D 
	;

HOLDSTATUS
	: H O L D S T A T U S 
	;

HONEOM
	: H O N E O M 
	;

HOST
	: H O S T 
	;

HOSTCODEPAGE
	: H O S T C O D E P A G E 
	;

HOSTLENGTH
	: H O S T L E N G T H 
	;

HOSTTYPE
	: H O S T T Y P E 
	;

HOURS
	: H O U R S 
	;

HTTPHEADER
	: H T T P H E A D E R 
	;

HTTPMETHOD
	: H T T P M E T H O D 
	;

HTTPRNUM
	: H T T P R N U M 
	;

HTTPVERSION
	: H T T P V E R S I O N 
	;

HTTPVNUM
	: H T T P V N U M 
	;

IDENTIFIER
	: I D E N T I F I E R 
	;

IDLE
	: I D L E 
	;

IDLEHRS
	: I D L E H R S 
	;

IDLEMINS
	: I D L E M I N S 
	;

IDLESECS
	: I D L E S E C S 
	;

IDLIST
	: I D L I S T 
	;

IDLISTLENGTH
	: I D L I S T L E N G T H 
	;

IDNTY
	: I D N T Y 
	;

IDNTYCLASS
	: I D N T Y C L A S S 
	;

IDPROP
	: I D P R O P 
	;

IGNORE
	: I G N O R E 
	;

IGREQCD
	: I G R E Q C D 
	;

IGREQID
	: I G R E Q I D 
	;

ILLOGIC
	: I L L O G I C 
	;

IMMCLOSE
	: I M M C L O S E 
	;

IMMEDIATE
	: I M M E D I A T E 
	;

IMMQUIESCED
	: I M M Q U I E S C E D 
	;

INBFMH
	: I N B F M H 
	;

INCOMPLETE
	: I N C O M P L E T E 
	;

INCONTAINER
	: I N C O N T A I N E R 
	;

INCREMENT
	: I N C R E M E N T 
	;

INDIRECTNAME
	: I N D I R E C T N A M E 
	;

INDOUBT
	: I N D O U B T 
	;

INDOUBTMINS
	: I N D O U B T M I N S 
	;

INDOUBTST
	: I N D O U B T S T 
	;

INDOUBTWAIT
	: I N D O U B T W A I T 
	;

INITHEAP
	: I N I T H E A P 
	;

INITIALDDS
	: I N I T I A L D D S 
	;

INITIMG
	: I N I T I M G 
	;

INITPARM
	: I N I T P A R M 
	;

INITPARMLEN
	: I N I T P A R M L E N 
	;

INITQNAME
	: I N I T Q N A M E 
	;

INITSTATUS
	: I N I T S T A T U S 
	;

INITUSERID
	: I N I T U S E R I D 
	;

INPARTN
	: I N P A R T N 
	;

INPUT
	: I N P U T 
	;

INPUTEVENT
	: I N P U T E V E N T 
	;

INPUTMSG
	: I N P U T M S G 
	;

INPUTMSGLEN
	: I N P U T M S G L E N 
	;

INQUIRE
	: I N Q U I R E 
	;

INQUIREGROUP
	: I N Q U I R E G R O U P 
	;

INQUIRELIST
	: I N Q U I R E L I S T 
	;

INQUIRERSRCE
	: I N Q U I R E R S R C E 
	;

INSERT
	: I N S E R T 
	;

INSERVICE
	: I N S E R V I C E 
	;

INSTALL
	: I N S T A L L 
	;

INSTALLAGENT
	: I N S T A L L A G E N T 
	;

INSTALLTIME
	: I N S T A L L T I M E 
	;

INSTALLUSRID
	: I N S T A L L U S R I D 
	;

INTERVAL
	: I N T E R V A L 
	;

INTERVALHRS
	: I N T E R V A L H R S 
	;

INTERVALMINS
	: I N T E R V A L M I N S 
	;

INTERVALSECS
	: I N T E R V A L S E C S 
	;

INTO
	: I N T O 
	;

INTOCCSID
	: I N T O C C S I D 
	;

INTOCODEPAGE
	: I N T O C O D E P A G E 
	;

INTSTART
	: I N T S T A R T 
	;

INTSTATUS
	: I N T S T A T U S 
	;

INTSTOP
	: I N T S T O P 
	;

INVALIDCOUNT
	: I N V A L I D C O U N T 
	;

INVERRTERM
	: I N V E R R T E R M 
	;

INVEXITREQ
	: I N V E X I T R E Q 
	;

INVITE
	: I N V I T E 
	;

INVLDC
	: I N V L D C 
	;

INVMPSZ
	: I N V M P S Z 
	;

INVOKE
	: I N V O K E 
	;

INVOKETYPE
	: I N V O K E T Y P E 
	;

INVOKINGPROG
	: I N V O K I N G P R O G 
	;

INVPARTN
	: I N V P A R T N 
	;

INVPARTNSET
	: I N V P A R T N S E T 
	;

INVREQ
	: I N V R E Q 
	;

INVTSREQ
	: I N V T S R E Q 
	;

IOERR
	: I O E R R 
	;

IOTYPE
	: I O T Y P E 
	;

IPADDRESS
	: I P A D D R E S S 
	;

IPCONN
	: I P C O N N 
	;

IPFACILITIES
	: I P F A C I L I T I E S 
	;

IPFACILITY
	: I P F A C I L I T Y 
	;

IPFACILTYPE
	: I P F A C I L T Y P E 
	;

IPFAMILY
	: I P F A M I L Y 
	;

IPFLISTSIZE
	: I P F L I S T S I Z E 
	;

IPRESOLVED
	: I P R E S O L V E D 
	;

IRC
	: I R C 
	;

ISCINVREQ
	: I S C I N V R E Q 
	;

ISOLATEST
	: I S O L A T E S T 
	;

ISSUE
	: I S S U E 
	;

ISSUER
	: I S S U E R 
	;

ISUSERID
	: I S U S E R I D 
	;

ITEM
	: I T E M 
	;

ITEMERR
	: I T E M E R R 
	;

ITEMNAME
	: I T E M N A M E 
	;

IUTYPE
	: I U T Y P E 
	;

JAVACORE
	: J A V A C O R E 
	;

JAVAHOME
	: J A V A H O M E 
	;

JCL
	: J C L 
	;

JFILEID
	: J F I L E I D 
	;

JIDERR
	: J I D E R R 
	;

JOBLIST
	: J O B L I S T 
	;

JOBNAME
	: J O B N A M E 
	;

JOURNAL
	: J O U R N A L 
	;

JOURNALMODEL
	: J O U R N A L M O D E L 
	;

JOURNALNAME
	: J O U R N A L N A M E 
	;

JOURNALNUM
	: J O U R N A L N U M 
	;

JSONTODATA
	: J S O N T O D A T A 
	;

JTYPE
	: J T Y P E 
	;

JTYPEID
	: J T Y P E I D 
	;

JUSFIRST
	: J U S F I R S T 
	;

JUSLAST
	: J U S L A S T 
	;

JUSTIFY
	: J U S T I F Y 
	;

JVM
	: J V M 
	;

JVMACTION
	: J V M A C T I O N 
	;

JVMCLASS
	: J V M C L A S S 
	;

JVMENDPOINT
	: J V M E N D P O I N T 
	;

JVMPROFILE
	: J V M P R O F I L E 
	;

JVMPROGRAM
	: J V M P R O G R A M 
	;

JVMSERVER
	: J V M S E R V E R 
	;

JVMTYPE
	: J V M T Y P E 
	;

JWT
	: J W T 
	;

KATAKANA
	: K A T A K A N A 
	;

KATAKANAST
	: K A T A K A N A S T 
	;

KEEP
	: K E E P 
	;

KEEPTIME
	: K E E P T I M E 
	;

KERBEROS
	: K E R B E R O S 
	;

KEYLENGTH
	: K E Y L E N G T H 
	;

KEYNUMBER
	: K E Y N U M B E R 
	;

KEYPOSITION
	: K E Y P O S I T I O N 
	;

KILL
	: K I L L 
	;

L40
	: L '4' '0' 
	;

L64
	: L '6' '4' 
	;

L80
	: L '8' '0' 
	;

LABEL
	: L A B E L 
	;

LANGDEDUCED
	: L A N G D E D U C E D 
	;

LANGINUSE
	: L A N G I N U S E 
	;

LANGUAGE
	: L A N G U A G E 
	;

LANGUAGECODE
	: L A N G U A G E C O D E 
	;

LAST
	: L A S T 
	;

LASTACTTIME
	: L A S T A C T T I M E 
	;

LASTCOLDTIME
	: L A S T C O L D T I M E 
	;

LASTEMERTIME
	: L A S T E M E R T I M E 
	;

LASTINITTIME
	: L A S T I N I T T I M E 
	;

LASTMODTIME
	: L A S T M O D T I M E 
	;

LASTRESET
	: L A S T R E S E T 
	;

LASTRESETABS
	: L A S T R E S E T A B S 
	;

LASTRESETHRS
	: L A S T R E S E T H R S 
	;

LASTRESETMIN
	: L A S T R E S E T M I N 
	;

LASTRESETSEC
	: L A S T R E S E T S E C 
	;

LASTUSEDINT
	: L A S T U S E D I N T 
	;

LASTUSETIME
	: L A S T U S E T I M E 
	;

LASTWARMTIME
	: L A S T W A R M T I M E 
	;

LDC
	: L D C 
	;

LDCMNEM
	: L D C M N E M 
	;

LDCNUM
	: L D C N U M 
	;

LEAVEKB
	: L E A V E K B 
	;

LENGERR
	: L E N G E R R 
	;

LENGTH
	: L E N G T H 
	;

LENGTHLIST
	: L E N G T H L I S T 
	;

LERUNOPTS
	: L E R U N O P T S 
	;

LEVEL
	: L E V E L 
	;

LIBERTY
	: L I B E R T Y 
	;

LIBRARY
	: L I B R A R Y 
	;

LIBRARYDSN
	: L I B R A R Y D S N 
	;

LIBRTYACTION
	: L I B R T Y A C T I O N 
	;

LIGHTPEN
	: L I G H T P E N 
	;

LIGHTPENST
	: L I G H T P E N S T 
	;

LINE
	: L I N E 
	;

LINEADDR
	: L I N E A D D R 
	;

LINELENGTH
	: L I N E L E N G T H 
	;

LINES
	: L I N E S 
	;

LINK
	: L I N K 
	;

LINKABEND
	: L I N K A B E N D 
	;

LINKAUTH
	: L I N K A U T H 
	;

LINKEDITMODE
	: L I N K E D I T M O D E 
	;

LINKLEVEL
	: L I N K L E V E L 
	;

LINKSYSNET
	: L I N K S Y S N E T 
	;

LINKSYSTEM
	: L I N K S Y S T E M 
	;

LIST
	: L I S T 
	;

LISTACTION
	: L I S T A C T I O N 
	;

LISTENERPORT
	: L I S T E N E R P O R T 
	;

LISTLENGTH
	: L I S T L E N G T H 
	;

LISTSIZE
	: L I S T S I Z E 
	;

LLID
	: L L I D 
	;

LOAD
	: L O A D 
	;

LOADING
	: L O A D I N G 
	;

LOADPOINT
	: L O A D P O I N T 
	;

LOADTYPE
	: L O A D T Y P E 
	;

LOCAL
	: L O C A L 
	;

LOCALCCSID
	: L O C A L C C S I D 
	;

LOCALITY
	: L O C A L I T Y 
	;

LOCALITYLEN
	: L O C A L I T Y L E N 
	;

LOCATION
	: L O C A T I O N 
	;

LOCK
	: L O C K 
	;

LOCKED
	: L O C K E D 
	;

LOCKING
	: L O C K I N G 
	;

LOG
	: L O G 
	;

LOGDEFER
	: L O G D E F E R 
	;

LOGICAL
	: L O G I C A L 
	;

LOGMESSAGE
	: L O G M E S S A G E 
	;

LOGMODE
	: L O G M O D E 
	;

LOGONLOGMODE
	: L O G O N L O G M O D E 
	;

LOGONMSG
	: L O G O N M S G 
	;

LOGREPSTATUS
	: L O G R E P S T A T U S 
	;

LOSTLOCKS
	: L O S T L O C K S 
	;

LOW
	: L O W 
	;

LPASTATUS
	: L P A S T A T U S 
	;

LSRPOOL
	: L S R P O O L 
	;

LSRPOOLNUM
	: L S R P O O L N U M 
	;

LUNAME
	: L U N A M E 
	;

MAIN
	: M A I N 
	;

MAJORVERSION
	: M A J O R V E R S I O N 
	;

MAP
	: M A P 
	;

MAPCOLUMN
	: M A P C O L U M N 
	;

MAPFAIL
	: M A P F A I L 
	;

MAPHEIGHT
	: M A P H E I G H T 
	;

MAPLINE
	: M A P L I N E 
	;

MAPNAME
	: M A P N A M E 
	;

MAPONLY
	: M A P O N L Y 
	;

MAPPED
	: M A P P E D 
	;

MAPPINGDEV
	: M A P P I N G D E V 
	;

MAPPINGLEVEL
	: M A P P I N G L E V E L 
	;

MAPPINGRNUM
	: M A P P I N G R N U M 
	;

MAPPINGVNUM
	: M A P P I N G V N U M 
	;

MAPSET
	: M A P S E T 
	;

MAPSETNAME
	: M A P S E T N A M E 
	;

MAPWIDTH
	: M A P W I D T H 
	;

MASSINSERT
	: M A S S I N S E R T 
	;

MAXACTIVE
	: M A X A C T I V E 
	;

MAXDATALEN
	: M A X D A T A L E N 
	;

MAXFLENGTH
	: M A X F L E N G T H 
	;

MAXHEAP
	: M A X H E A P 
	;

MAXIMUM
	: M A X I M U M 
	;

MAXITEMLEN
	: M A X I T E M L E N 
	;

MAXLENGTH
	: M A X L E N G T H 
	;

MAXLIFETIME
	: M A X L I F E T I M E 
	;

MAXNUMRECS
	: M A X N U M R E C S 
	;

MAXOPENTCBS
	: M A X O P E N T C B S 
	;

MAXPERSIST
	: M A X P E R S I S T 
	;

MAXPROCLEN
	: M A X P R O C L E N 
	;

MAXQTIME
	: M A X Q T I M E 
	;

MAXREQS
	: M A X R E Q S 
	;

MAXSOCKETS
	: M A X S O C K E T S 
	;

MAXSSLTCBS
	: M A X S S L T C B S 
	;

MAXTASKS
	: M A X T A S K S 
	;

MAXTHRDTCBS
	: M A X T H R D T C B S 
	;

MAXWINNERS
	: M A X W I N N E R S 
	;

MAXXPTCBS
	: M A X X P T C B S 
	;

MCC
	: M C C 
	;

MEDIATYPE
	: M E D I A T Y P E 
	;

MEMBER
	: M E M B E R 
	;

MEMBERNAME
	: M E M B E R N A M E 
	;

MEMLIMIT
	: M E M L I M I T 
	;

MESSAGE
	: M E S S A G E 
	;

MESSAGECASE
	: M E S S A G E C A S E 
	;

MESSAGEID
	: M E S S A G E I D 
	;

METADATA
	: M E T A D A T A 
	;

METADATAFILE
	: M E T A D A T A F I L E 
	;

METADATALEN
	: M E T A D A T A L E N 
	;

METHOD
	: M E T H O D 
	;

METHODLENGTH
	: M E T H O D L E N G T H 
	;

MGMTPART
	: M G M T P A R T 
	;

MICROVERSION
	: M I C R O V E R S I O N 
	;

MILLISECONDS
	: M I L L I S E C O N D S 
	;

MILLISECS
	: M I L L I S E C S 
	;

MINIMUM
	: M I N I M U M 
	;

MINITEMLEN
	: M I N I T E M L E N 
	;

MINORVERSION
	: M I N O R V E R S I O N 
	;

MINRUNLEVEL
	: M I N R U N L E V E L 
	;

MINRUNRNUM
	: M I N R U N R N U M 
	;

MINRUNVNUM
	: M I N R U N V N U M 
	;

MINUTES
	: M I N U T E S 
	;

MIRRORLIFE
	: M I R R O R L I F E 
	;

MMDDYY
	: M M D D Y Y 
	;

MMDDYYYY
	: M M D D Y Y Y Y 
	;

MODE
	: M O D E 
	;

MODELIDERR
	: M O D E L I D E R R 
	;

MODENAME
	: M O D E N A M E 
	;

MODIFY
	: M O D I F Y 
	;

MONDATA
	: M O N D A T A 
	;

MONITOR
	: M O N I T O R 
	;

MONSTATUS
	: M O N S T A T U S 
	;

MONTH
	: M O N T H 
	;

MONTHOFYEAR
	: M O N T H O F Y E A R 
	;

MONUSERID
	: M O N U S E R I D 
	;

MOVE
	: M O V E 
	;

MQCONN
	: M Q C O N N 
	;

MQINI
	: M Q I N I 
	;

MQMONITOR
	: M Q M O N I T O R 
	;

MQNAME
	: M Q N A M E 
	;

MQQMGR
	: M Q Q M G R 
	;

MQRELEASE
	: M Q R E L E A S E 
	;

MROBATCH
	: M R O B A T C H 
	;

MSGFORMAT
	: M S G F O R M A T 
	;

MSGQUEUE1
	: M S G Q U E U E '1' 
	;

MSGQUEUE2
	: M S G Q U E U E '2' 
	;

MSGQUEUE3
	: M S G Q U E U E '3' 
	;

MSR
	: M S R 
	;

MSRCONTROL
	: M S R C O N T R O L 
	;

MSRCONTROLST
	: M S R C O N T R O L S T 
	;

MTOMNOXOPST
	: M T O M N O X O P S T 
	;

MTOMST
	: M T O M S T 
	;

MVSIMAGE
	: M V S I M A G E 
	;

MVSSMFID
	: M V S S M F I D 
	;

MVSSYSNAME
	: M V S S Y S N A M E 
	;

MVSTCB
	: M V S T C B 
	;

NAME
	: N A M E 
	;

NAMELENGTH
	: N A M E L E N G T H 
	;

NAMESPACE
	: N A M E S P A C E 
	;

NATLANG
	: N A T L A N G 
	;

NATLANGINUSE
	: N A T L A N G I N U S E 
	;

NATURE
	: N A T U R E 
	;

NETID
	: N E T I D 
	;

NETNAME
	: N E T N A M E 
	;

NETNAMEIDERR
	: N E T N A M E I D E R R 
	;

NETUOWID
	: N E T U O W I D 
	;

NETWORK
	: N E T W O R K 
	;

NETWORKID
	: N E T W O R K I D 
	;

NEWCOPY
	: N E W C O P Y 
	;

NEWMAXSOCKET
	: N E W M A X S O C K E T 
	;

NEWMAXTASKS
	: N E W M A X T A S K S 
	;

NEWPASSWORD
	: N E W P A S S W O R D 
	;

NEWPHRASE
	: N E W P H R A S E 
	;

NEWPHRASELEN
	: N E W P H R A S E L E N 
	;

NEXT
	: N E X T 
	;

NEXTTIME
	: N E X T T I M E 
	;

NEXTTIMEHRS
	: N E X T T I M E H R S 
	;

NEXTTIMEMINS
	: N E X T T I M E M I N S 
	;

NEXTTIMESECS
	: N E X T T I M E S E C S 
	;

NEXTTRANSID
	: N E X T T R A N S I D 
	;

NLEOM
	: N L E O M 
	;

NO
	: N O 
	;

NOALTPRTCOPY
	: N O A L T P R T C O P Y 
	;

NOATI
	: N O A T I 
	;

NOAUTOPAGE
	: N O A U T O P A G E 
	;

NOAUTOSTART
	: N O A U T O S T A R T 
	;

NOCC
	: N O C C 
	;

NOCEDF
	: N O C E D F 
	;

NOCHECK
	: N O C H E C K 
	;

NOCLICONVERT
	: N O C L I C O N V E R T 
	;

NOCLOSE
	: N O C L O S E 
	;

NOCOMPAT
	: N O C O M P A T 
	;

NOCOMPRESS
	: N O C O M P R E S S 
	;

NOCONNECT
	: N O C O N N E C T 
	;

NOCONV
	: N O C O N V 
	;

NOCONVERSE
	: N O C O N V E R S E 
	;

NOCREATE
	: N O C R E A T E 
	;

NODAE
	: N O D A E 
	;

NODATA
	: N O D A T A 
	;

NODE
	: N O D E 
	;

NODEBUG
	: N O D E B U G 
	;

NODEHOME
	: N O D E H O M E 
	;

NODEIDERR
	: N O D E I D E R R 
	;

NODEJSAPP
	: N O D E J S A P P 
	;

NODISCREQ
	: N O D I S C R E Q 
	;

NODOCDELETE
	: N O D O C D E L E T E 
	;

NODUMP
	: N O D U M P 
	;

NOEDIT
	: N O E D I T 
	;

NOEMPTYREQ
	: N O E M P T Y R E Q 
	;

NOEXCEPT
	: N O E X C E P T 
	;

NOEXCTL
	: N O E X C T L 
	;

NOEXITTRACE
	: N O E X I T T R A C E 
	;

NOFLUSH
	: N O F L U S H 
	;

NOFORCE
	: N O F O R C E 
	;

NOHANDLE
	: N O H A N D L E 
	;

NOIDNTY
	: N O I D N T Y 
	;

NOINCONVERT
	: N O I N C O N V E R T 
	;

NOJBUFSP
	: N O J B U F S P 
	;

NOJVM
	: N O J V M 
	;

NOLOAD
	: N O L O A D 
	;

NOLOG
	: N O L O G 
	;

NONCRITICAL
	: N O N C R I T I C A L 
	;

NONE
	: N O N E 
	;

NONTERMREL
	: N O N T E R M R E L 
	;

NONUM
	: N O N U M 
	;

NONVAL
	: N O N V A L 
	;

NOOBFORMAT
	: N O O B F O R M A T 
	;

NOOUTCONVERT
	: N O O U T C O N V E R T 
	;

NOPASSBKRD
	: N O P A S S B K R D 
	;

NOPASSBKWR
	: N O P A S S B K W R 
	;

NOPERF
	: N O P E R F 
	;

NOPRTCOPY
	: N O P R T C O P Y 
	;

NOQUEUE
	: N O Q U E U E 
	;

NOQUIESCE
	: N O Q U I E S C E 
	;

NORECOVDATA
	: N O R E C O V D A T A 
	;

NORELEASE
	: N O R E L E A S E 
	;

NORELREQ
	: N O R E L R E Q 
	;

NOREPLICATOR
	: N O R E P L I C A T O R 
	;

NORESRCE
	: N O R E S R C E 
	;

NORESTART
	: N O R E S T A R T 
	;

NORESYNC
	: N O R E S Y N C 
	;

NORMAL
	: N O R M A L 
	;

NOSDTRAN
	: N O S D T R A N 
	;

NOSEP
	: N O S E P 
	;

NOSHUTDOWN
	: N O S H U T D O W N 
	;

NOSPACE
	: N O S P A C E 
	;

NOSPOOL
	: N O S P O O L 
	;

NOSRVCONVERT
	: N O S R V C O N V E R T 
	;

NOSTART
	: N O S T A R T 
	;

NOSTG
	: N O S T G 
	;

NOSUSPEND
	: N O S U S P E N D 
	;

NOSWITCH
	: N O S W I T C H 
	;

NOSYNCPOINT
	: N O S Y N C P O I N T 
	;

NOSYSDUMP
	: N O S Y S D U M P 
	;

NOTADDABLE
	: N O T A D D A B L E 
	;

NOTALLOC
	: N O T A L L O C 
	;

NOTAUTH
	: N O T A U T H 
	;

NOTBROWSABLE
	: N O T B R O W S A B L E 
	;

NOTCONNECTED
	: N O T C O N N E C T E D 
	;

NOTDELETABLE
	: N O T D E L E T A B L E 
	;

NOTE
	: N O T E 
	;

NOTERMINAL
	: N O T E R M I N A L 
	;

NOTFINISHED
	: N O T F I N I S H E D 
	;

NOTFND
	: N O T F N D 
	;

NOTOPEN
	: N O T O P E N 
	;

NOTPENDING
	: N O T P E N D I N G 
	;

NOTPURGEABLE
	: N O T P U R G E A B L E 
	;

NOTRANDUMP
	: N O T R A N D U M P 
	;

NOTREADABLE
	: N O T R E A D A B L E 
	;

NOTRLS
	: N O T R L S 
	;

NOTRUNCATE
	: N O T R U N C A T E 
	;

NOTSUPERUSER
	: N O T S U P E R U S E R 
	;

NOTTABLE
	: N O T T A B L E 
	;

NOTTI
	: N O T T I 
	;

NOTUPDATABLE
	: N O T U P D A T A B L E 
	;

NOTWAIT
	: N O T W A I T 
	;

NOUCTRAN
	: N O U C T R A N 
	;

NOVALIDATION
	: N O V A L I D A T I O N 
	;

NOWAIT
	: N O W A I T 
	;

NOZCPTRACE
	: N O Z C P T R A C E 
	;

NQNAME
	: N Q N A M E 
	;

NSCONTAINER
	: N S C O N T A I N E R 
	;

NUMCIPHERS
	: N U M C I P H E R S 
	;

NUMDATAPRED
	: N U M D A T A P R E D 
	;

NUMDSNAMES
	: N U M D S N A M E S 
	;

NUMELEMENTS
	: N U M E L E M E N T S 
	;

NUMEVENTS
	: N U M E V E N T S 
	;

NUMEXITS
	: N U M E X I T S 
	;

NUMINFOSRCE
	: N U M I N F O S R C E 
	;

NUMITEMS
	: N U M I T E M S 
	;

NUMOPTPRED
	: N U M O P T P R E D 
	;

NUMREC
	: N U M R E C 
	;

NUMROUTES
	: N U M R O U T E S 
	;

NUMSEGMENTS
	: N U M S E G M E N T S 
	;

NUMTAB
	: N U M T A B 
	;

OAPPLID
	: O A P P L I D 
	;

OBFORMAT
	: O B F O R M A T 
	;

OBFORMATST
	: O B F O R M A T S T 
	;

OBJECT
	: O B J E C T 
	;

OBJECTNAME
	: O B J E C T N A M E 
	;

OBOPERIDST
	: O B O P E R I D S T 
	;

OCCUPANCY
	: O C C U P A N C Y 
	;

ODADPTRDATA1
	: O D A D P T R D A T A '1' 
	;

ODADPTRDATA2
	: O D A D P T R D A T A '2' 
	;

ODADPTRDATA3
	: O D A D P T R D A T A '3' 
	;

ODADPTRID
	: O D A D P T R I D 
	;

ODAPPLID
	: O D A P P L I D 
	;

ODCLNTIPADDR
	: O D C L N T I P A D D R 
	;

ODCLNTPORT
	: O D C L N T P O R T 
	;

ODFACILNAME
	: O D F A C I L N A M E 
	;

ODFACILTYPE
	: O D F A C I L T Y P E 
	;

ODIPFAMILY
	: O D I P F A M I L Y 
	;

ODLUNAME
	: O D L U N A M E 
	;

ODNETID
	: O D N E T I D 
	;

ODNETWORKID
	: O D N E T W O R K I D 
	;

ODSERVERPORT
	: O D S E R V E R P O R T 
	;

ODSTARTTIME
	: O D S T A R T T I M E 
	;

ODTASKID
	: O D T A S K I D 
	;

ODTCPIPS
	: O D T C P I P S 
	;

ODTRANSID
	: O D T R A N S I D 
	;

ODUSERID
	: O D U S E R I D 
	;

OFF
	: O F F 
	;

OIDCARD
	: O I D C A R D 
	;

OLD
	: O L D 
	;

ON
	: O N 
	;

OPCLASS
	: O P C L A S S 
	;

OPEN
	: O P E N 
	;

OPENAPI
	: O P E N A P I 
	;

OPENERR
	: O P E N E R R 
	;

OPENOUTPUT
	: O P E N O U T P U T 
	;

OPENSTATUS
	: O P E N S T A T U S 
	;

OPERATION
	: O P E R A T I O N 
	;

OPERATOR
	: O P E R A T O R 
	;

OPERID
	: O P E R I D 
	;

OPERKEYS
	: O P E R K E Y S 
	;

OPERPURGE
	: O P E R P U R G E 
	;

OPID
	: O P I D 
	;

OPREL
	: O P R E L 
	;

OPSECURITY
	: O P S E C U R I T Y 
	;

OPSYS
	: O P S Y S 
	;

OPTIONNAME
	: O P T I O N N A M E 
	;

OPTIONS
	: O P T I O N S 
	;

OPTIONSPGM
	: O P T I O N S P G M 
	;

OR
	: O R 
	;

ORGABCODE
	: O R G A B C O D E 
	;

ORGANIZATION
	: O R G A N I Z A T I O N 
	;

ORGANIZATLEN
	: O R G A N I Z A T L E N 
	;

ORGUNIT
	: O R G U N I T 
	;

ORGUNITLEN
	: O R G U N I T L E N 
	;

OSGI
	: O S G I 
	;

OSGIACTION
	: O S G I A C T I O N 
	;

OSGIBUNDLE
	: O S G I B U N D L E 
	;

OSGIBUNDLEID
	: O S G I B U N D L E I D 
	;

OSGISERVICE
	: O S G I S E R V I C E 
	;

OSGISTATUS
	: O S G I S T A T U S 
	;

OSGIVERSION
	: O S G I V E R S I O N 
	;

OSLEVEL
	: O S L E V E L 
	;

OTASK
	: O T A S K 
	;

OTRANSID
	: O T R A N S I D 
	;

OTSTID
	: O T S T I D 
	;

OTSTIMEOUT
	: O T S T I M E O U T 
	;

OUTCONTAINER
	: O U T C O N T A I N E R 
	;

OUTDESCR
	: O U T D E S C R 
	;

OUTDESCRERR
	: O U T D E S C R E R R 
	;

OUTLINE
	: O U T L I N E 
	;

OUTLINEST
	: O U T L I N E S T 
	;

OUTPARTN
	: O U T P A R T N 
	;

OUTPUT
	: O U T P U T 
	;

OUTSERVICE
	: O U T S E R V I C E 
	;

OUTTOKEN
	: O U T T O K E N 
	;

OUTTOKENLEN
	: O U T T O K E N L E N 
	;

OVERFLOW
	: O V E R F L O W 
	;

OWNER
	: O W N E R 
	;

PA1
	: P A '1' 
	;

PA2
	: P A '2' 
	;

PA3
	: P A '3' 
	;

PAGE
	: P A G E 
	;

PAGEABLE
	: P A G E A B L E 
	;

PAGEHT
	: P A G E H T 
	;

PAGENUM
	: P A G E N U M 
	;

PAGESTATUS
	: P A G E S T A T U S 
	;

PAGEWD
	: P A G E W D 
	;

PAGING
	: P A G I N G 
	;

PARSE
	: P A R S E 
	;

PARTCLASS
	: P A R T C L A S S 
	;

PARTCOUNT
	: P A R T C O U N T 
	;

PARTIAL
	: P A R T I A L 
	;

PARTITIONSET
	: P A R T I T I O N S E T 
	;

PARTITIONSST
	: P A R T I T I O N S S T 
	;

PARTN
	: P A R T N 
	;

PARTNER
	: P A R T N E R 
	;

PARTNERIDERR
	: P A R T N E R I D E R R 
	;

PARTNFAIL
	: P A R T N F A I L 
	;

PARTNPAGE
	: P A R T N P A G E 
	;

PARTNS
	: P A R T N S 
	;

PARTNSET
	: P A R T N S E T 
	;

PARTTYPE
	: P A R T T Y P E 
	;

PASS
	: P A S S 
	;

PASSBK
	: P A S S B K 
	;

PASSTICKET
	: P A S S T I C K E T 
	;

PASSWORD
	: P A S S W O R D 
	;

PASSWORDLEN
	: P A S S W O R D L E N 
	;

PATCH
	: P A T C H 
	;

PATH
	: P A T H 
	;

PATHLENGTH
	: P A T H L E N G T H 
	;

PCDSASIZE
	: P C D S A S I Z E 
	;

PCT
	: P C T 
	;

PENDSTATUS
	: P E N D S T A T U S 
	;

PERF
	: P E R F 
	;

PERFCLASS
	: P E R F C L A S S 
	;

PERFORM
	: P E R F O R M 
	;

PERMANENT
	: P E R M A N E N T 
	;

PF1
	: P F '1' 
	;

PF10
	: P F '1' '0' 
	;

PF11
	: P F '1' '1' 
	;

PF12
	: P F '1' '2' 
	;

PF13
	: P F '1' '3' 
	;

PF14
	: P F '1' '4' 
	;

PF15
	: P F '1' '5' 
	;

PF16
	: P F '1' '6' 
	;

PF17
	: P F '1' '7' 
	;

PF18
	: P F '1' '8' 
	;

PF19
	: P F '1' '9' 
	;

PF2
	: P F '2' 
	;

PF20
	: P F '2' '0' 
	;

PF21
	: P F '2' '1' 
	;

PF22
	: P F '2' '2' 
	;

PF23
	: P F '2' '3' 
	;

PF24
	: P F '2' '4' 
	;

PF3
	: P F '3' 
	;

PF4
	: P F '4' 
	;

PF5
	: P F '5' 
	;

PF6
	: P F '6' 
	;

PF7
	: P F '7' 
	;

PF8
	: P F '8' 
	;

PF9
	: P F '9' 
	;

PFXLENG
	: P F X L E N G 
	;

PGMIDERR
	: P G M I D E R R 
	;

PGMINTERFACE
	: P G M I N T E R F A C E 
	;

PHAPPLID
	: P H A P P L I D 
	;

PHASEIN
	: P H A S E I N 
	;

PHCOUNT
	: P H C O U N T 
	;

PHNETWORKID
	: P H N E T W O R K I D 
	;

PHRASE
	: P H R A S E 
	;

PHRASELEN
	: P H R A S E L E N 
	;

PHSTARTTIME
	: P H S T A R T T I M E 
	;

PHTASKID
	: P H T A S K I D 
	;

PHTRANSID
	: P H T R A N S I D 
	;

PHYSICAL
	: P H Y S I C A L 
	;

PID
	: P I D 
	;

PIPELINE
	: P I P E L I N E 
	;

PIPLENGTH
	: P I P L E N G T H 
	;

PIPLIST
	: P I P L I S T 
	;

PLAN
	: P L A N 
	;

PLANEXITNAME
	: P L A N E X I T N A M E 
	;

PLATFORM
	: P L A T F O R M 
	;

PLT
	: P L T 
	;

PLTNAME
	: P L T N A M E 
	;

PLTPIUSR
	: P L T P I U S R 
	;

POINT
	: P O I N T 
	;

POLICY
	: P O L I C Y 
	;

POLICYRULE
	: P O L I C Y R U L E 
	;

POOL
	: P O O L 
	;

POOLERR
	: P O O L E R R 
	;

POOLNAME
	: P O O L N A M E 
	;

POP
	: P O P 
	;

PORT
	: P O R T 
	;

PORTNUMBER
	: P O R T N U M B E R 
	;

PORTNUMNU
	: P O R T N U M N U 
	;

POST
	: P O S T 
	;

PPT
	: P P T 
	;

PREDICATE
	: P R E D I C A T E 
	;

PREFIX
	: P R E F I X 
	;

PREPARE
	: P R E P A R E 
	;

PRIMPRED
	: P R I M P R E D 
	;

PRIMPREDOP
	: P R I M P R E D O P 
	;

PRIMPREDTYPE
	: P R I M P R E D T Y P E 
	;

PRINCONVID
	: P R I N C O N V I D 
	;

PRINSYSID
	: P R I N S Y S I D 
	;

PRINT
	: P R I N T 
	;

PRINTADAPTST
	: P R I N T A D A P T S T 
	;

PRINTCONTROL
	: P R I N T C O N T R O L 
	;

PRINTER
	: P R I N T E R 
	;

PRINTFAIL
	: P R I N T F A I L 
	;

PRIORITY
	: P R I O R I T Y 
	;

PRIVACY
	: P R I V A C Y 
	;

PRIVATE
	: P R I V A T E 
	;

PROCESS
	: P R O C E S S 
	;

PROCESSBUSY
	: P R O C E S S B U S Y 
	;

PROCESSERR
	: P R O C E S S E R R 
	;

PROCESSTYPE
	: P R O C E S S T Y P E 
	;

PROCLENGTH
	: P R O C L E N G T H 
	;

PROCNAME
	: P R O C N A M E 
	;

PROFILE
	: P R O F I L E 
	;

PROFILEDIR
	: P R O F I L E D I R 
	;

PROFILEIDERR
	: P R O F I L E I D E R R 
	;

PROGAUTO
	: P R O G A U T O 
	;

PROGAUTOCTLG
	: P R O G A U T O C T L G 
	;

PROGAUTOEXIT
	: P R O G A U T O E X I T 
	;

PROGAUTOINST
	: P R O G A U T O I N S T 
	;

PROGRAM
	: P R O G R A M 
	;

PROGRAMDEF
	: P R O G R A M D E F 
	;

PROGSYMBOLST
	: P R O G S Y M B O L S T 
	;

PROGTYPE
	: P R O G T Y P E 
	;

PROTECT
	: P R O T E C T 
	;

PROTECTNUM
	: P R O T E C T N U M 
	;

PROTOCOL
	: P R O T O C O L 
	;

PRTCOPY
	: P R T C O P Y 
	;

PRTCOPYST
	: P R T C O P Y S T 
	;

PRTYAGING
	: P R T Y A G I N G 
	;

PS
	: P S 
	;

PSDINTERVAL
	: P S D I N T E R V A L 
	;

PSDINTHRS
	: P S D I N T H R S 
	;

PSDINTMINS
	: P S D I N T M I N S 
	;

PSDINTSECS
	: P S D I N T S E C S 
	;

PSEUDOBIN
	: P S E U D O B I N 
	;

PSTYPE
	: P S T Y P E 
	;

PTCOUNT
	: P T C O U N T 
	;

PTHREADS
	: P T H R E A D S 
	;

PTSTARTTIME
	: P T S T A R T T I M E 
	;

PTTASKID
	: P T T A S K I D 
	;

PTTRANSID
	: P T T R A N S I D 
	;

PUDSASIZE
	: P U D S A S I Z E 
	;

PUNCH
	: P U N C H 
	;

PURGE
	: P U R G E 
	;

PURGEABILITY
	: P U R G E A B I L I T Y 
	;

PURGEABLE
	: P U R G E A B L E 
	;

PURGEABLEST
	: P U R G E A B L E S T 
	;

PURGECYCLEM
	: P U R G E C Y C L E M 
	;

PURGECYCLES
	: P U R G E C Y C L E S 
	;

PURGETHRESH
	: P U R G E T H R E S H 
	;

PURGETYPE
	: P U R G E T Y P E 
	;

PUSH
	: P U S H 
	;

PUT
	: P U T 
	;

PUT64
	: P U T '6' '4' 
	;

QALL
	: Q A L L 
	;

QBUSY
	: Q B U S Y 
	;

QIDERR
	: Q I D E R R 
	;

QNAME
	: Q N A M E 
	;

QNOTENAB
	: Q N O T E N A B 
	;

QSESSLIM
	: Q S E S S L I M 
	;

QUALIFIER
	: Q U A L I F I E R 
	;

QUALLEN
	: Q U A L L E N 
	;

QUASIRENT
	: Q U A S I R E N T 
	;

QUERY
	: Q U E R Y 
	;

QUERYPARM
	: Q U E R Y P A R M 
	;

QUERYST
	: Q U E R Y S T 
	;

QUERYSTRING
	: Q U E R Y S T R I N G 
	;

QUERYSTRLEN
	: Q U E R Y S T R L E N 
	;

QUESCESTATE
	: Q U E S C E S T A T E 
	;

QUEUE
	: Q U E U E 
	;

QUEUED
	: Q U E U E D 
	;

QUEUELIMIT
	: Q U E U E L I M I T 
	;

QUIESCED
	: Q U I E S C E D 
	;

QUIESCESTATE
	: Q U I E S C E S T A T E 
	;

QZERO
	: Q Z E R O 
	;

RANKING
	: R A N K I N G 
	;

RBA
	: R B A 
	;

RBATYPE
	: R B A T Y P E 
	;

RDATT
	: R D A T T 
	;

RDSASIZE
	: R D S A S I Z E 
	;

READ
	: R E A D 
	;

READABLE
	: R E A D A B L E 
	;

READINTEG
	: R E A D I N T E G 
	;

READNEXT
	: R E A D N E X T 
	;

READPREV
	: R E A D P R E V 
	;

READQ
	: R E A D Q 
	;

REALM
	: R E A L M 
	;

REALMLEN
	: R E A L M L E N 
	;

REASON
	: R E A S O N 
	;

REATTACH
	: R E A T T A C H 
	;

REBUILD
	: R E B U I L D 
	;

RECEIVE
	: R E C E I V E 
	;

RECEIVECOUNT
	: R E C E I V E C O U N T 
	;

RECEIVER
	: R E C E I V E R 
	;

RECFM
	: R E C F M 
	;

RECONNECT
	: R E C O N N E C T 
	;

RECORD
	: R E C O R D 
	;

RECORDBUSY
	: R E C O R D B U S Y 
	;

RECORDFORMAT
	: R E C O R D F O R M A T 
	;

RECORDING
	: R E C O R D I N G 
	;

RECORDLEN
	: R E C O R D L E N 
	;

RECORDLENGTH
	: R E C O R D L E N G T H 
	;

RECORDNOW
	: R E C O R D N O W 
	;

RECORDSIZE
	: R E C O R D S I Z E 
	;

RECOVERED
	: R E C O V E R E D 
	;

RECOVERY
	: R E C O V E R Y 
	;

RECOVSTATUS
	: R E C O V S T A T U S 
	;

REDIRECTTYPE
	: R E D I R E C T T Y P E 
	;

REDUCE
	: R E D U C E 
	;

REENTPROTECT
	: R E E N T P R O T E C T 
	;

REFPARMS
	: R E F P A R M S 
	;

REFPARMSLEN
	: R E F P A R M S L E N 
	;

REFRESH
	: R E F R E S H 
	;

REFRESHPKGS
	: R E F R E S H P K G S 
	;

REGIONUSERID
	: R E G I O N U S E R I D 
	;

RELATED
	: R E L A T E D 
	;

RELATESINDEX
	: R E L A T E S I N D E X 
	;

RELATESTYPE
	: R E L A T E S T Y P E 
	;

RELATESURI
	: R E L A T E S U R I 
	;

RELATION
	: R E L A T I O N 
	;

RELEASE
	: R E L E A S E 
	;

RELEASED
	: R E L E A S E D 
	;

RELREQ
	: R E L R E Q 
	;

RELREQST
	: R E L R E Q S T 
	;

RELTYPE
	: R E L T Y P E 
	;

REMOTENAME
	: R E M O T E N A M E 
	;

REMOTEPREFIX
	: R E M O T E P R E F I X 
	;

REMOTESYSNET
	: R E M O T E S Y S N E T 
	;

REMOTESYSTEM
	: R E M O T E S Y S T E M 
	;

REMOTETABLE
	: R E M O T E T A B L E 
	;

REMOVE
	: R E M O V E 
	;

RENAME
	: R E N A M E 
	;

REPEATABLE
	: R E P E A T A B L E 
	;

REPLACE
	: R E P L A C E 
	;

REPLICATION
	: R E P L I C A T I O N 
	;

REPLICATOR
	: R E P L I C A T O R 
	;

REPLY
	: R E P L Y 
	;

REPLYLENGTH
	: R E P L Y L E N G T H 
	;

REPORT
	: R E P O R T 
	;

REQID
	: R E Q I D 
	;

REQTYPE
	: R E Q T Y P E 
	;

REQUEST
	: R E Q U E S T 
	;

REQUESTID
	: R E Q U E S T I D 
	;

REQUESTMODEL
	: R E Q U E S T M O D E L 
	;

REQUESTTYPE
	: R E Q U E S T T Y P E 
	;

REQUIRED
	: R E Q U I R E D 
	;

RESCLASS
	: R E S C L A S S 
	;

RESCOUNT
	: R E S C O U N T 
	;

RESET
	: R E S E T 
	;

RESETBR
	: R E S E T B R 
	;

RESETLOCKS
	: R E S E T L O C K S 
	;

RESETNOW
	: R E S E T N O W 
	;

RESETTIME
	: R E S E T T I M E 
	;

RESID
	: R E S I D 
	;

RESIDENCY
	: R E S I D E N C Y 
	;

RESIDERR
	: R E S I D E R R 
	;

RESIDLEN
	: R E S I D L E N 
	;

RESIDLENGTH
	: R E S I D L E N G T H 
	;

RESLEN
	: R E S L E N 
	;

RESNAME
	: R E S N A M E 
	;

RESOURCE
	: R E S O U R C E 
	;

RESOURCENAME
	: R E S O U R C E N A M E 
	;

RESOURCETYPE
	: R E S O U R C E T Y P E 
	;

RESP
	: R E S P 
	;

RESP2
	: R E S P '2' 
	;

RESPWAIT
	: R E S P W A I T 
	;

RESRCE
	: R E S R C E 
	;

RESRCECLASS
	: R E S R C E C L A S S 
	;

RESSEC
	: R E S S E C 
	;

RESTART
	: R E S T A R T 
	;

RESTYPE
	: R E S T Y P E 
	;

RESULT
	: R E S U L T 
	;

RESUME
	: R E S U M E 
	;

RESUNAVAIL
	: R E S U N A V A I L 
	;

RESYNC
	: R E S Y N C 
	;

RESYNCMEMBER
	: R E S Y N C M E M B E R 
	;

RESYNCSTATUS
	: R E S Y N C S T A T U S 
	;

RETAIN
	: R E T A I N 
	;

RETCODE
	: R E T C O D E 
	;

RETLOCKS
	: R E T L O C K S 
	;

RETPAGE
	: R E T P A G E 
	;

RETRIEVE
	: R E T R I E V E 
	;

RETRY
	: R E T R Y 
	;

RETURN
	: R E T U R N 
	;

RETURNPROG
	: R E T U R N P R O G 
	;

REUSELIMIT
	: R E U S E L I M I T 
	;

REWIND
	: R E W I N D 
	;

REWRITE
	: R E W R I T E 
	;

RIDFLD
	: R I D F L D 
	;

RLS
	: R L S 
	;

RLSACCESS
	: R L S A C C E S S 
	;

RLSSTATUS
	: R L S S T A T U S 
	;

RMIQFY
	: R M I Q F Y 
	;

RMIST
	: R M I S T 
	;

ROLE
	: R O L E 
	;

ROLELENGTH
	: R O L E L E N G T H 
	;

ROLLBACK
	: R O L L B A C K 
	;

ROLLEDBACK
	: R O L L E D B A C K 
	;

ROUTE
	: R O U T E 
	;

ROUTECODES
	: R O U T E C O D E S 
	;

ROUTESTATUS
	: R O U T E S T A T U S 
	;

ROUTING
	: R O U T I N G 
	;

RPROCESS
	: R P R O C E S S 
	;

RREPL
	: R R E P L 
	;

RRESOURCE
	: R R E S O U R C E 
	;

RRMS
	: R R M S 
	;

RRN
	: R R N 
	;

RSL
	: R S L 
	;

RTEFAIL
	: R T E F A I L 
	;

RTERMID
	: R T E R M I D 
	;

RTESOME
	: R T E S O M E 
	;

RTIMEOUT
	: R T I M E O U T 
	;

RTRANSID
	: R T R A N S I D 
	;

RULEGROUP
	: R U L E G R O U P 
	;

RULEITEM
	: R U L E I T E M 
	;

RULETYPE
	: R U L E T Y P E 
	;

RUN
	: R U N 
	;

RUNAWAY
	: R U N A W A Y 
	;

RUNAWAYTYPE
	: R U N A W A Y T Y P E 
	;

RUNNING
	: R U N N I N G 
	;

RUNSTATUS
	: R U N S T A T U S 
	;

RUNTIME
	: R U N T I M E 
	;

SADDRLENGTH
	: S A D D R L E N G T H 
	;

SCAN
	: S C A N 
	;

SCANDELAY
	: S C A N D E L A Y 
	;

SCHEMALEVEL
	: S C H E M A L E V E L 
	;

SCHEME
	: S C H E M E 
	;

SCHEMENAME
	: S C H E M E N A M E 
	;

SCOPE
	: S C O P E 
	;

SCOPELEN
	: S C O P E L E N 
	;

SCRNHT
	: S C R N H T 
	;

SCRNSIZE
	: S C R N S I Z E 
	;

SCRNWD
	: S C R N W D 
	;

SCS
	: S C S 
	;

SDSASIZE
	: S D S A S I Z E 
	;

SDTMEMLIMIT
	: S D T M E M L I M I T 
	;

SDTRAN
	: S D T R A N 
	;

SEARCHPOS
	: S E A R C H P O S 
	;

SECONDS
	: S E C O N D S 
	;

SECPORT
	: S E C P O R T 
	;

SECRECORDING
	: S E C R E C O R D I N G 
	;

SECURITY
	: S E C U R I T Y 
	;

SECURITYMGR
	: S E C U R I T Y M G R 
	;

SECURITYNAME
	: S E C U R I T Y N A M E 
	;

SECURITYST
	: S E C U R I T Y S T 
	;

SEGIDERR
	: S E G I D E R R 
	;

SEGMENTLIST
	: S E G M E N T L I S T 
	;

SELNERR
	: S E L N E R R 
	;

SEND
	: S E N D 
	;

SENDCOUNT
	: S E N D C O U N T 
	;

SENDER
	: S E N D E R 
	;

SENDMTOMST
	: S E N D M T O M S T 
	;

SEP
	: S E P 
	;

SERIALNUM
	: S E R I A L N U M 
	;

SERIALNUMLEN
	: S E R I A L N U M L E N 
	;

SERVER
	: S E R V E R 
	;

SERVERADDR
	: S E R V E R A D D R 
	;

SERVERADDRNU
	: S E R V E R A D D R N U 
	;

SERVERCONV
	: S E R V E R C O N V 
	;

SERVERDUMP
	: S E R V E R D U M P 
	;

SERVERIPADDR
	: S E R V E R I P A D D R 
	;

SERVERNAME
	: S E R V E R N A M E 
	;

SERVERPORT
	: S E R V E R P O R T 
	;

SERVICE
	: S E R V I C E 
	;

SERVSTATUS
	: S E R V S T A T U S 
	;

SESSBUSY
	: S E S S B U S Y 
	;

SESSION
	: S E S S I O N 
	;

SESSIONERR
	: S E S S I O N E R R 
	;

SESSIONS
	: S E S S I O N S 
	;

SESSIONTYPE
	: S E S S I O N T Y P E 
	;

SESSTOKEN
	: S E S S T O K E N 
	;

SET
	: S E T 
	;

SETTRANSID
	: S E T T R A N S I D 
	;

SHARE
	: S H A R E 
	;

SHARED
	: S H A R E D 
	;

SHARELOCKS
	: S H A R E L O C K S 
	;

SHARESTATUS
	: S H A R E S T A T U S 
	;

SHELF
	: S H E L F 
	;

SHUTDISABLED
	: S H U T D I S A B L E D 
	;

SHUTDOWN
	: S H U T D O W N 
	;

SHUTDOWNST
	: S H U T D O W N S T 
	;

SHUTENABLED
	: S H U T E N A B L E D 
	;

SHUTOPTION
	: S H U T O P T I O N 
	;

SHUTSTATUS
	: S H U T S T A T U S 
	;

SIGDATA
	: S I G D A T A 
	;

SIGN
	: S I G N 
	;

SIGNAL
	: S I G N A L 
	;

SIGNID
	: S I G N I D 
	;

SIGNOFF
	: S I G N O F F 
	;

SIGNON
	: S I G N O N 
	;

SIGNONSTATUS
	: S I G N O N S T A T U S 
	;

SINGLEOFF
	: S I N G L E O F F 
	;

SINGLEON
	: S I N G L E O N 
	;

SINGLESTATUS
	: S I N G L E S T A T U S 
	;

SIT
	: S I T 
	;

SNAMELENGTH
	: S N A M E L E N G T H 
	;

SNAPTRACE
	: S N A P T R A C E 
	;

SOAPFAULT
	: S O A P F A U L T 
	;

SOAPFAULT_	
	: S O A P F A U L T [ ]+ 	 
	;

SOAPLEVEL
	: S O A P L E V E L 
	;

SOAPRNUM
	: S O A P R N U M 
	;

SOAPVNUM
	: S O A P V N U M 
	;

SOCKETCLOSE
	: S O C K E T C L O S E 
	;

SOCKPOOLSIZE
	: S O C K P O O L S I Z E 
	;

SOSABOVEBAR
	: S O S A B O V E B A R 
	;

SOSABOVELINE
	: S O S A B O V E L I N E 
	;

SOSBELOWLINE
	: S O S B E L O W L I N E 
	;

SOSI
	: S O S I 
	;

SOSIST
	: S O S I S T 
	;

SOSSTATUS
	: S O S S T A T U S 
	;

SPECIAL
	: S P E C I A L 
	;

SPECIFTCPS
	: S P E C I F T C P S 
	;

SPECTRACE
	: S P E C T R A C E 
	;

SPI
	: S P I 
	;

SPIST
	: S P I S T 
	;

SPOLBUSY
	: S P O L B U S Y 
	;

SPOLERR
	: S P O L E R R 
	;

SPOOLCLOSE
	: S P O O L C L O S E 
	;

SPOOLOPEN
	: S P O O L O P E N 
	;

SPOOLREAD
	: S P O O L R E A D 
	;

SPOOLWRITE
	: S P O O L W R I T E 
	;

SPRSTRACE
	: S P R S T R A C E 
	;

SQLCODE
	: S Q L C O D E 
	;

SRRACTIVE
	: S R R A C T I V E 
	;

SRRINACTIVE
	: S R R I N A C T I V E 
	;

SRRSTATUS
	: S R R S T A T U S 
	;

SRRTASKS
	: S R R T A S K S 
	;

SRVCNAME
	: S R V C N A M E 
	;

SRVCONVERT
	: S R V C O N V E R T 
	;

SRVCSTATUS
	: S R V C S T A T U S 
	;

SRVRADDR6NU
	: S R V R A D D R '6' N U 
	;

SRVRIPFAMILY
	: S R V R I P F A M I L Y 
	;

SSL
	: S S L 
	;

SSLCACHE
	: S S L C A C H E 
	;

SSLTYPE
	: S S L T Y P E 
	;

STACK
	: S T A C K 
	;

STACKTRACE
	: S T A C K T R A C E 
	;

STANDARD
	: S T A N D A R D 
	;

STANDBYMODE
	: S T A N D B Y M O D E 
	;

STANTRACE
	: S T A N T R A C E 
	;

START
	: S T A R T 
	;

STARTBR
	: S T A R T B R 
	;

STARTBRGROUP
	: S T A R T B R G R O U P 
	;

STARTBRLIST
	: S T A R T B R L I S T 
	;

STARTBROWSE
	: S T A R T B R O W S E 
	;

STARTBRRSRCE
	: S T A R T B R R S R C E 
	;

STARTCODE
	: S T A R T C O D E 
	;

STARTED
	: S T A R T E D 
	;

STARTIO
	: S T A R T I O 
	;

STARTSCRIPT
	: S T A R T S C R I P T 
	;

STARTSTATUS
	: S T A R T S T A T U S 
	;

STARTTIME
	: S T A R T T I M E 
	;

STARTUP
	: S T A R T U P 
	;

STARTUPDATE
	: S T A R T U P D A T E 
	;

STATE
	: S T A T E 
	;

STATELEN
	: S T A T E L E N 
	;

STATIONID
	: S T A T I O N I D 
	;

STATISTICS
	: S T A T I S T I C S 
	;

STATS
	: S T A T S 
	;

STATSQUEUE
	: S T A T S Q U E U E 
	;

STATUS
	: S T A T U S 
	;

STATUSCODE
	: S T A T U S C O D E 
	;

STATUSLEN
	: S T A T U S L E N 
	;

STATUSTEXT
	: S T A T U S T E X T 
	;

STDERR
	: S T D E R R 
	;

STDOUT
	: S T D O U T 
	;

STOP
	: S T O P 
	;

STOPPED
	: S T O P P E D 
	;

STORAGE
	: S T O R A G E 
	;

STORAGE64
	: S T O R A G E '6' '4' 
	;

STORAGECLEAR
	: S T O R A G E C L E A R 
	;

STOREPROTECT
	: S T O R E P R O T E C T 
	;

STREAMNAME
	: S T R E A M N A M E 
	;

STRELERR
	: S T R E L E R R 
	;

STRFIELD
	: S T R F I E L D 
	;

STRINGFORMAT
	: S T R I N G F O R M A T 
	;

STRINGS
	: S T R I N G S 
	;

STRINGZONE
	: S T R I N G Z O N E 
	;

STRUCTNAME
	: S T R U C T N A M E 
	;

SUBADDR
	: S U B A D D R 
	;

SUBCODELEN
	: S U B C O D E L E N 
	;

SUBCODESTR
	: S U B C O D E S T R 
	;

SUBEVENT
	: S U B E V E N T 
	;

SUBEVENT1
	: S U B E V E N T '1' 
	;

SUBEVENT2
	: S U B E V E N T '2' 
	;

SUBEVENT3
	: S U B E V E N T '3' 
	;

SUBEVENT4
	: S U B E V E N T '4' 
	;

SUBEVENT5
	: S U B E V E N T '5' 
	;

SUBEVENT6
	: S U B E V E N T '6' 
	;

SUBEVENT7
	: S U B E V E N T '7' 
	;

SUBEVENT8
	: S U B E V E N T '8' 
	;

SUBPOOL
	: S U B P O O L 
	;

SUBPOOLLIST
	: S U B P O O L L I S T 
	;

SUBRESID
	: S U B R E S I D 
	;

SUBRESIDLEN
	: S U B R E S I D L E N 
	;

SUBRESTYPE
	: S U B R E S T Y P E 
	;

SUBTASKS
	: S U B T A S K S 
	;

SUPPRESSED
	: S U P P R E S S E D 
	;

SUSPEND
	: S U S P E N D 
	;

SUSPENDED
	: S U S P E N D E D 
	;

SUSPENDTIME
	: S U S P E N D T I M E 
	;

SUSPENDTYPE
	: S U S P E N D T Y P E 
	;

SUSPENDVALUE
	: S U S P E N D V A L U E 
	;

SUSPSTATUS
	: S U S P S T A T U S 
	;

SWITCH
	: S W I T C H 
	;

SWITCHACTION
	: S W I T C H A C T I O N 
	;

SWITCHALL
	: S W I T C H A L L 
	;

SWITCHNEXT
	: S W I T C H N E X T 
	;

SWITCHSTATUS
	: S W I T C H S T A T U S 
	;

SYMBOL
	: S Y M B O L 
	;

SYMBOLERR
	: S Y M B O L E R R 
	;

SYMBOLLIST
	: S Y M B O L L I S T 
	;

SYNCHRONOUS
	: S Y N C H R O N O U S 
	;

SYNCLEVEL
	: S Y N C L E V E L 
	;

SYNCONRETURN
	: S Y N C O N R E T U R N 
	;

SYNCPOINT
	: S Y N C P O I N T 
	;

SYNCPOINTST
	: S Y N C P O I N T S T 
	;

SYSBUSY
	: S Y S B U S Y 
	;

SYSDUMP
	: S Y S D U M P 
	;

SYSDUMPCODE
	: S Y S D U M P C O D E 
	;

SYSDUMPING
	: S Y S D U M P I N G 
	;

SYSID
	: S Y S I D 
	;

SYSIDERR
	: S Y S I D E R R 
	;

SYSOUTCLASS
	: S Y S O U T C L A S S 
	;

SYSTEM
	: S Y S T E M 
	;

SYSTEMLOG
	: S Y S T E M L O G 
	;

SYSTEMOFF
	: S Y S T E M O F F 
	;

SYSTEMON
	: S Y S T E M O N 
	;

SYSTEMSTATUS
	: S Y S T E M S T A T U S 
	;

T3270
	: T '3' '2' '7' '0' 
	;

TABLE
	: T A B L E 
	;

TABLEMGR
	: T A B L E M G R 
	;

TABLENAME
	: T A B L E N A M E 
	;

TABLEONLY
	: T A B L E O N L Y 
	;

TABLES
	: T A B L E S 
	;

TABLESIZE
	: T A B L E S I Z E 
	;

TAEXECUTABLE
	: T A E X E C U T A B L E 
	;

TAG
	: T A G 
	;

TAGS
	: T A G S 
	;

TAKEOVER
	: T A K E O V E R 
	;

TALENGTH
	: T A L E N G T H 
	;

TARGET
	: T A R G E T 
	;

TARGETCOUNT
	: T A R G E T C O U N T 
	;

TARGETSYS
	: T A R G E T S Y S 
	;

TASK
	: T A S K 
	;

TASKDATAKEY
	: T A S K D A T A K E Y 
	;

TASKDATALOC
	: T A S K D A T A L O C 
	;

TASKID
	: T A S K I D 
	;

TASKIDERR
	: T A S K I D E R R 
	;

TASKPRIORITY
	: T A S K P R I O R I T Y 
	;

TASKS
	: T A S K S 
	;

TASKSTART
	: T A S K S T A R T 
	;

TASKSTARTST
	: T A S K S T A R T S T 
	;

TASKSUBPOOL
	: T A S K S U B P O O L 
	;

TCAMCONTROL
	: T C A M C O N T R O L 
	;

TCB
	: T C B 
	;

TCBLIMIT
	: T C B L I M I T 
	;

TCBS
	: T C B S 
	;

TCEXITALL
	: T C E X I T A L L 
	;

TCEXITALLOFF
	: T C E X I T A L L O F F 
	;

TCEXITNONE
	: T C E X I T N O N E 
	;

TCEXITSTATUS
	: T C E X I T S T A T U S 
	;

TCEXITSYSTEM
	: T C E X I T S Y S T E M 
	;

TCIDERR
	: T C I D E R R 
	;

TCLASS
	: T C L A S S 
	;

TCPIP
	: T C P I P 
	;

TCPIPJOB
	: T C P I P J O B 
	;

TCPIPSERVICE
	: T C P I P S E R V I C E 
	;

TCPIPZONE
	: T C P I P Z O N E 
	;

TCT
	: T C T 
	;

TCTUA
	: T C T U A 
	;

TCTUALENG
	: T C T U A L E N G 
	;

TD
	: T D 
	;

TDQUEUE
	: T D Q U E U E 
	;

TELLERID
	: T E L L E R I D 
	;

TEMPLATE
	: T E M P L A T E 
	;

TEMPLATENAME
	: T E M P L A T E N A M E 
	;

TEMPLATERR
	: T E M P L A T E R R 
	;

TEMPLATETYPE
	: T E M P L A T E T Y P E 
	;

TEMPORARY
	: T E M P O R A R Y 
	;

TEMPSTORAGE
	: T E M P S T O R A G E 
	;

TERM
	: T E R M 
	;

TERMCODE
	: T E R M C O D E 
	;

TERMERR
	: T E R M E R R 
	;

TERMID
	: T E R M I D 
	;

TERMIDERR
	: T E R M I D E R R 
	;

TERMINAL
	: T E R M I N A L 
	;

TERMMODEL
	: T E R M M O D E L 
	;

TERMPRIORITY
	: T E R M P R I O R I T Y 
	;

TERMSTATUS
	: T E R M S T A T U S 
	;

TEST
	: T E S T 
	;

TEXT
	: T E X T 
	;

TEXTKYBD
	: T E X T K Y B D 
	;

TEXTKYBDST
	: T E X T K Y B D S T 
	;

TEXTLENGTH
	: T E X T L E N G T H 
	;

TEXTPRINT
	: T E X T P R I N T 
	;

TEXTPRINTST
	: T E X T P R I N T S T 
	;

THREADCOUNT
	: T H R E A D C O U N T 
	;

THREADERROR
	: T H R E A D E R R O R 
	;

THREADLIMIT
	: T H R E A D L I M I T 
	;

THREADS
	: T H R E A D S 
	;

THREADSAFE
	: T H R E A D S A F E 
	;

THREADWAIT
	: T H R E A D W A I T 
	;

THRESHOLD
	: T H R E S H O L D 
	;

TIME
	: T I M E 
	;

TIMEDOUT
	: T I M E D O U T 
	;

TIMEOUT
	: T I M E O U T 
	;

TIMEOUTINT
	: T I M E O U T I N T 
	;

TIMER
	: T I M E R 
	;

TIMERERR
	: T I M E R E R R 
	;

TIMESEP
	: T I M E S E P 
	;

TITLE
	: T I T L E 
	;

TITLELENGTH
	: T I T L E L E N G T H 
	;

TNADDR
	: T N A D D R 
	;

TNIPFAMILY
	: T N I P F A M I L Y 
	;

TNPORT
	: T N P O R T 
	;

TO
	: T O 
	;

TOACTIVITY
	: T O A C T I V I T Y 
	;

TOCHANNEL
	: T O C H A N N E L 
	;

TOCONTAINER
	: T O C O N T A I N E R 
	;

TOFLENGTH
	: T O F L E N G T H 
	;

TOKEN
	: T O K E N 
	;

TOKENERR
	: T O K E N E R R 
	;

TOKENLEN
	: T O K E N L E N 
	;

TOKENTYPE
	: T O K E N T Y P E 
	;

TOLENGTH
	: T O L E N G T H 
	;

TOPROCESS
	: T O P R O C E S S 
	;

TPNAME
	: T P N A M E 
	;

TPNAMELEN
	: T P N A M E L E N 
	;

TPOOL
	: T P O O L 
	;

TRACE
	: T R A C E 
	;

TRACEDEST
	: T R A C E D E S T 
	;

TRACEFLAG
	: T R A C E F L A G 
	;

TRACEID
	: T R A C E I D 
	;

TRACENUM
	: T R A C E N U M 
	;

TRACETYPE
	: T R A C E T Y P E 
	;

TRACING
	: T R A C I N G 
	;

TRAILER
	: T R A I L E R 
	;

TRANCLASS
	: T R A N C L A S S 
	;

TRANDUMP
	: T R A N D U M P 
	;

TRANDUMPCODE
	: T R A N D U M P C O D E 
	;

TRANDUMPING
	: T R A N D U M P I N G 
	;

TRANIDONLY
	: T R A N I D O N L Y 
	;

TRANISOLATE
	: T R A N I S O L A T E 
	;

TRANPRIORITY
	: T R A N P R I O R I T Y 
	;

TRANSACTION
	: T R A N S A C T I O N 
	;

TRANSFORM
	: T R A N S F O R M 
	;

TRANSFORMER
	: T R A N S F O R M E R 
	;

TRANSID
	: T R A N S I D 
	;

TRANSIDERR
	: T R A N S I D E R R 
	;

TRANSMODE
	: T R A N S M O D E 
	;

TRIGGER
	: T R I G G E R 
	;

TRIGGERLEVEL
	: T R I G G E R L E V E L 
	;

TRIGMONTASKS
	: T R I G M O N T A S K S 
	;

TRNGRPID
	: T R N G R P I D 
	;

TRPROF
	: T R P R O F 
	;

TRT
	: T R T 
	;

TS
	: T S 
	;

TSIOERR
	: T S I O E R R 
	;

TSMAININUSE
	: T S M A I N I N U S E 
	;

TSMAINLIMIT
	: T S M A I N L I M I T 
	;

TSMODEL
	: T S M O D E L 
	;

TSPOOL
	: T S P O O L 
	;

TSQNAME
	: T S Q N A M E 
	;

TSQUEUE
	: T S Q U E U E 
	;

TSQUEUELIMIT
	: T S Q U E U E L I M I T 
	;

TSYSTEM
	: T S Y S T E M 
	;

TSYSTYPE
	: T S Y S T Y P E 
	;

TTI
	: T T I 
	;

TTISTATUS
	: T T I S T A T U S 
	;

TWA
	: T W A 
	;

TWAIT
	: T W A I T 
	;

TWALENG
	: T W A L E N G 
	;

TWASIZE
	: T W A S I Z E 
	;

TX
	: T X 
	;

TXID
	: T X I D 
	;

TYPE
	: T Y P E 
	;

TYPENAME
	: T Y P E N A M E 
	;

TYPENAMELEN
	: T Y P E N A M E L E N 
	;

TYPENS
	: T Y P E N S 
	;

TYPENSLEN
	: T Y P E N S L E N 
	;

TYPETERM
	: T Y P E T E R M 
	;

UCTRAN
	: U C T R A N 
	;

UCTRANST
	: U C T R A N S T 
	;

UDSASIZE
	: U D S A S I Z E 
	;

UNATTEND
	: U N A T T E N D 
	;

UNAVAILABLE
	: U N A V A I L A B L E 
	;

UNCOMMITTED
	: U N C O M M I T T E D 
	;

UNESCAPED
	: U N E S C A P E D 
	;

UNEXPIN
	: U N E X P I N 
	;

UNLOCK
	: U N L O C K 
	;

UNQUIESCED
	: U N Q U I E S C E D 
	;

UNTIL
	: U N T I L 
	;

UOW
	: U O W 
	;

UOWACTION
	: U O W A C T I O N 
	;

UOWDSNFAIL
	: U O W D S N F A I L 
	;

UOWENQ
	: U O W E N Q 
	;

UOWLINK
	: U O W L I N K 
	;

UOWLNOTFOUND
	: U O W L N O T F O U N D 
	;

UOWNOTFOUND
	: U O W N O T F O U N D 
	;

UOWSTATE
	: U O W S T A T E 
	;

UPDATABLE
	: U P D A T A B L E 
	;

UPDATE
	: U P D A T E 
	;

UPDATEMODEL
	: U P D A T E M O D E L 
	;

URI
	: U R I 
	;

URID
	: U R I D 
	;

URIMAP
	: U R I M A P 
	;

URIMAPLIMIT
	: U R I M A P L I M I T 
	;

URL
	: U R L 
	;

URLLENGTH
	: U R L L E N G T H 
	;

URM
	: U R M 
	;

USAGE
	: U S A G E 
	;

USECOUNT
	: U S E C O U N T 
	;

USER
	: U S E R 
	;

USERAREA
	: U S E R A R E A 
	;

USERAREALEN
	: U S E R A R E A L E N 
	;

USERAUTH
	: U S E R A U T H 
	;

USERCORRDATA
	: U S E R C O R R D A T A 
	;

USERDATA
	: U S E R D A T A 
	;

USERDATAKEY
	: U S E R D A T A K E Y 
	;

USERDATALEN
	: U S E R D A T A L E N 
	;

USERDEFINE
	: U S E R D E F I N E 
	;

USERID
	: U S E R I D 
	;

USERIDERR
	: U S E R I D E R R 
	;

USERNAME
	: U S E R N A M E 
	;

USERNAMELEN
	: U S E R N A M E L E N 
	;

USEROFF
	: U S E R O F F 
	;

USERON
	: U S E R O N 
	;

USERPRIORITY
	: U S E R P R I O R I T Y 
	;

USERSTATUS
	: U S E R S T A T U S 
	;

USERTABLE
	: U S E R T A B L E 
	;

USERTAG
	: U S E R T A G 
	;

USING
	: U S I N G 
	;

VALIDATION
	: V A L I D A T I O N 
	;

VALIDATIONST
	: V A L I D A T I O N S T 
	;

VALIDITY
	: V A L I D I T Y 
	;

VALUE
	: V A L U E 
	;

VALUELENGTH
	: V A L U E L E N G T H 
	;

VARIABLENAME
	: V A R I A B L E N A M E 
	;

VERIFY
	: V E R I F Y 
	;

VERSION
	: V E R S I O N 
	;

VERSIONLEN
	: V E R S I O N L E N 
	;

VFORMST
	: V F O R M S T 
	;

VOLIDERR
	: V O L I D E R R 
	;

VOLUME
	: V O L U M E 
	;

VOLUMELENG
	: V O L U M E L E N G 
	;

VTAM
	: V T A M 
	;

WAIT
	: W A I T 
	;

WAITCAUSE
	: W A I T C A U S E 
	;

WAITCICS
	: W A I T C I C S 
	;

WAITSTATE
	: W A I T S T A T E 
	;

WEB
	: W E B 
	;

WEBSERVICE
	: W E B S E R V I C E 
	;

WEBSERVLIMIT
	: W E B S E R V L I M I T 
	;

WLMHEALTH
	: W L M H E A L T H 
	;

WLMOPENST
	: W L M O P E N S T 
	;

WORKDIR
	: W O R K D I R 
	;

WORKREQUEST
	: W O R K R E Q U E S T 
	;

WORKTYPE
	: W O R K T Y P E 
	;

WPMEDIA1
	: W P M E D I A '1' 
	;

WPMEDIA2
	: W P M E D I A '2' 
	;

WPMEDIA3
	: W P M E D I A '3' 
	;

WPMEDIA4
	: W P M E D I A '4' 
	;

WRAP
	: W R A P 
	;

WRBRK
	: W R B R K 
	;

WRITE
	: W R I T E 
	;

WRITEQ
	: W R I T E Q 
	;

WSACONTEXT
	: W S A C O N T E X T 
	;

WSAEPR
	: W S A E P R 
	;

WSBIND
	: W S B I N D 
	;

WSDIR
	: W S D I R 
	;

WSDLFILE
	: W S D L F I L E 
	;

XCFGROUP
	: X C F G R O U P 
	;

XCTL
	: X C T L 
	;

XID
	: X I D 
	;

XLNSTATUS
	: X L N S T A T U S 
	;

XLT
	: X L T 
	;

XMLCONTAINER
	: X M L C O N T A I N E R 
	;

XMLSCHEMA
	: X M L S C H E M A 
	;

XMLTODATA
	: X M L T O D A T A 
	;

XMLTRANSFORM
	: X M L T R A N S F O R M 
	;

XOPDIRECTST
	: X O P D I R E C T S T 
	;

XOPSUPPORTST
	: X O P S U P P O R T S T 
	;

XRBA
	: X R B A 
	;

XRFSTATUS
	: X R F S T A T U S 
	;

XSDBIND
	: X S D B I N D 
	;

YEAR
	: Y E A R 
	;

YES
	: Y E S 
	;

YYDDD
	: Y Y D D D 
	;

YYDDMM
	: Y Y D D M M 
	;

YYMMDD
	: Y Y M M D D 
	;

YYYYDDD
	: Y Y Y Y D D D 
	;

YYYYDDMM
	: Y Y Y Y D D M M 
	;

YYYYMMDD
	: Y Y Y Y M M D D 
	;

ZCPTRACE
	: Z C P T R A C E 
	;

ZCPTRACING
	: Z C P T R A C I N G 
	;

// 2092 rules generated Wed Apr 17 17:28:37 CDT 2024

mode ARG_MODE;

/*
This token indicates the end of the argument has been found.
*/

RPAREN
	: ')'
	{
		parenNesting == 0
	}?
	->popMode
	;

/*
This token is part of the argument itself.  For example,

    PROGRAM(PROGRAM-LIST(INDEX))

*/

ARG_RPAREN
	: ')'
	{
		parenNesting != 0
	}?
	{
		parenNesting--;
	}
	->popMode,type(ARG)
	;

/*
This token is part of the argument itself.  For example,

    PROGRAM(PROGRAM-LIST(INDEX))

*/

ARG_LPAREN
	: '('
	{
		parenNesting++;
	}
	->pushMode(ARG_MODE),type(ARG)
	;

ARG
	: .+?
	;

