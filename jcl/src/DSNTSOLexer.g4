/*
Copyright (C) 2020 Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is intended to be an ANTLR4 grammar for DSN, the DB2 command processor
that runs as a TSO command processor.

In parsing JCL, one may encounter an execution of IKJEFT01, IKJEFT1A, or
IKJEFT1B, all of which are entry points in TSO.  It is common to execute
applications with embedded SQL accessing DB2 via the TSO Attachment Facility,
with the SYSTSIN DD pointing at statements such as...

DSN SYSTEM(DB2P)
RUN PROGRAM(J8675309) PLAN(J8675309) -
  PARMS('ABLEBAKERCHARLIEDOGEASYFOX')
END

...causing the execution of the application.

While it is possible to issue some DB2 commands whilst DSN is running,
these commands are of no interest in this context and are ignored.  DB2
commands that can be issued via DSN begin with a dash (or hyphen) "-"
character.

This grammar is part of a project to parse JCL, which itself is part of
a larger project whose aim is to assist in mainframe application portfolio
analysis by making it possible to construct an inventory of programs,
procedures, et. al.

An application might make use of this grammar by detecting execution of
TSO and parsing its SYSTSIN to obtain the actual program(s) being
executed under the TSO monitor program running the DSN command processor.

*/

lexer grammar DSNTSOLexer;

channels { COMMENTS }


fragment A:'A';
fragment B:'B';
fragment C:'C';
fragment D:'D';
fragment E:'E';
fragment F:'F';
fragment G:'G';
fragment H:'H';
fragment I:'I';
fragment J:'J';
fragment K:'K';
fragment L:'L';
fragment M:'M';
fragment N:'N';
fragment O:'O';
fragment P:'P';
fragment Q:'Q';
fragment R:'R';
fragment S:'S';
fragment T:'T';
fragment U:'U';
fragment V:'V';
fragment W:'W';
fragment X:'X';
fragment Y:'Y';
fragment Z:'Z';
fragment AMPERSAND
	: '&'
	;

NEWLINE
	: [\n\r]
	->channel(HIDDEN)
	;

WS
	: [ ]+
	->channel(HIDDEN)
	;

LPAREN
	:  '('
	->pushMode(ARG_MODE)
	;

RPAREN
	:  ')'
	;

DASH
	:  '-'
	;

PLUS
	:  '+'
	;

ASTERISK
	:  '*'
	->channel(COMMENTS),pushMode(CM_MODE)
	;

SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;

SQUOTE2
	: SQUOTE SQUOTE
	;

ABEND
	: A B E N D
	;

ACCELERATOR
	: A C C E L E R A T O R 
	;

ACCELERATIONWAITFORDATA
	: A C C E L E R A T I O N W A I T F O R D A T A 
	;

ACQUIRE
	: A C Q U I R E 
	;

ACTION
	: A C T I O N 
	;

APCOMPARE
	: A P C O M P A R E 
	;

APOST
	: A P O S T 
	;

APPLCOMPAT
	: A P P L C O M P A T 
	;

APRETAINDUP
	: A P R E T A I N D U P 
	;

APREUSE
	: A P R E U S E 
	;

APREUSESOURCE
	: A P R E U S E S O U R C E 
	;

ARCHIVESENSITIVE
	: A R C H I V E S E N S I T I V E 
	;

ASUSER
	: A S U S E R
	;

AT
	: A T 
	;

BIND
	: B I N D
	;

BUSTIMESENSITIVE
	: B U S T I M E S E N S I T I V E 
	;

CACHESIZE
	: C A C H E S I Z E 
	;

CICS
	: C I C S
	;

COLLID
	: C O L L I D 
	;

COLSUFFIX
	: C O L S U F F I X 
	;

CONCENTRATESTMT
	: C O N C E N T R A T E S T M T 
	;

CONCURRENTACCESSRESOLUTION
	: C O N C U R R E N T A C C E S S R E S O L U T I O N 
	;

COPY
	: C O P Y 
	;

COPYVER
	: C O P Y V E R
	;

CP
	: C P 
	;

CURRENTDATA
	: C U R R E N T D A T A 
	;

CURRENTSERVER
	: C U R R E N T S E R V E R 
	;

DATE
	: D A T E 
	;

DBCSSYMBOL
	: D B C S S Y M B O L 
	;

DBCSDELIM
	: D B C S D E L I M 
	;

DBPROTOCOL
	: D B P R O T O C O L 
	;

DCLBIT
	: D C L B I T 
	;

DCLGEN
	: D C L G E N
	;

DEC
	: D E C 
	;

DECDEL
	: D E C D E L 
	;

DEFER
	: D E F E R 
	;

DEGREE
	: D E G R E E 
	;

DEPLOY
	: D E P L O Y 
	;

DESCRIPTION
	: D E S C R I P T I O N 
	;

DESCSTAT
	: D E S C S T A T 
	;

DISABLE
	: D I S A B L E 
	;

DISCONNECT
	: D I S C O N N E C T 
	;

DLIBATCH
	: D L I B A T C H
	;

DSN
	: D S N
	;

DSQSTMTID
	: D S Q S T M T I D 
	;

DYNAMIC
	: D Y N A M I C
	;

DYNAMICRULES
	: D Y N A M I C R U L E S 
	;

ENABLE
	: E N A B L E 
	;

ENCODING
	: E N C O D I N G 
	;

END
	:  E N D
	;

EXPLAININPUTSCHEMA
	: E X P L A I N I N P U T S C H E M A
	;

EXPLAIN
	: E X P L A I N 
	;

EXTENDEDINDICATOR
	: E X T E N D E D I N D I C A T O R 
	;

FILTER
	: F I L T E R 
	;

FLAG
	: F L A G 
	;

FREE
	: F R E E
	;

GENERIC
	: G E N E R I C 
	;

GETACCELARCHIVE
	: G E T A C C E L A R C H I V E 
	;

GROUP
	: G R O U P
	;

IMMEDWRITE
	: I M M E D W R I T E 
	;

IMSBMP
	: I M S B M P
	;

IMSMPP
	: I M S M P P
	;

INDVAR
	: I N D V A R 
	;

INVALIDONLY
	: I N V A L I D O N L Y 
	;

ISOLATION
	: I S O L A T I O N 
	;

KEEPDYNAMIC
	: K E E P D Y N A M I C 
	;

LABEL
	: L A B E L 
	;

LANGUAGE
	: L A N G U A G E 
	;

LIB
	:  L I B
	;

LIBRARY
	:  L I B R A R Y
	;

LOOKUP
	: L O O K U P
	;

MEMBER
	: M E M B E R 
	;

NAME
	: N A M E 
	;

NAMES
	: N A M E S 
	;

NODEFER
	: N O D E F E R 
	;

NOPKLIST
	: N O P K L I S T 
	;

OPTHINT
	: O P T H I N T 
	;

OPTIONS
	: O P T I O N S
	;

OWNER
	: O W N E R 
	;

PACKAGE
	: P A C K A G E
	;

PARMS
	: P A R M S
	;

PATH
	: P A T H 
	;

PATHDEFAULT
	: P A T H D E F A U L T 
	;

PKLIST
	: P K L I S T 
	;

PLAN
	:  P L A N
	;

PLANMGMT
	: P L A N M G M T 
	;

PLANMGMTSCOPE
	: P L A N M G M T S C O P E 
	;

PROGAUTH
	: P R O G A U T H 
	;

PROGRAM
	:  P R O G R A M
	;

QUALIFIER
	: Q U A L I F I E R 
	;

QUERY
	: Q U E R Y
	;

QUERYACCELERATION
	: Q U E R Y A C C E L E R A T I O N 
	;

QUERYID
	: Q U E R Y I D 
	;

QUOTE
	: Q U O T E 
	;

REBIND
	: R E B I N D
	;

RELEASE
	: R E L E A S E 
	;

REOPT
	: R E O P T 
	;

REPLVER
	: R E P L V E R
	;

RETRY
	: R E T R Y
	;

RMARGIN
	: R M A R G I N 
	;

ROUNDING
	: R O U N D I N G 
	;

RUN
	:  R U N
	;

SDQSTMTID
	: S D Q S T M T I D
	;

SERVICE
	: S E R V I C E
	;

SPUFI
	: S P U F I
	;

SQLDDNAME
	: S Q L D D N A M E 
	;

SQLENCODING
	: S Q L E N C O D I N G 
	;

SQLERROR
	: S Q L E R R O R 
	;

SQLRULES
	: S Q L R U L E S 
	;

STABILIZED
	: S T A B I L I Z E D
	;

STBLGRP
	: S T B L G R P 
	;

STRDEL
	: S T R D E L 
	;

STRUCTURE
	: S T R U C T U R E 
	;

SWITCH
	: S W I T C H 
	;

SYSTEM
	: S Y S T E M
	;

SYSTIMESENSITIVE
	: S Y S T I M E S E N S I T I V E 
	;

TABLE
	: T A B L E 
	;

TEST
	: T E S T
	;

TIME
	: T I M E 
	;

TRIGGER
	: T R I G G E R
	;

VALIDATE
	: V A L I D A T E 
	;

VERSION
	: V E R S I O N 
	;

INTENTIONALLY_IGNORED_DB2
	: DASH [A-Z]+
	->skip,pushMode(IGNORED_MODE)
	;

INTENTIONALLY_IGNORED_DSNH
	: D S N H
	->skip,pushMode(IGNORED_MODE)
	;

INTENTIONALLY_IGNORED
	: ~[ \n\r]
	->skip
	;

mode ARG_MODE ;

ARG_LPAREN
	: LPAREN
	->type(LPAREN),pushMode(ARG_MODE)
	;

ARG_RPAREN
	: RPAREN
	->type(RPAREN),popMode
	;

ARG_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN)
	;

ARG_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;

ARG
	: ~[\n\r]
	;

mode CM_MODE ;

CM_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(COMMENTS),popMode
	;

COMMENT
	: ~[\n\r]
	->channel(COMMENTS)
	;

mode QS_MODE
	;

QS_SQUOTE2
	: SQUOTE SQUOTE
	->type(SQUOTE2)
	;

QS_SQUOTE
	: SQUOTE
	->channel(HIDDEN),popMode
	;

fragment ANYCHAR_NOSQUOTE
	: ~['\n\r]
	;

QS_NEWLINE
	: [\n\r]
	->channel(HIDDEN)
	;

QS_WS
	: WS
	->channel(HIDDEN)
	;

QUOTED_STRING_FRAGMENT
	: (ANYCHAR_NOSQUOTE)+?
	;

mode IGNORED_MODE ;

IGNORED_NEWLINE
	: NEWLINE
	->skip,popMode
	;

IGNORED_LPAREN
	: LPAREN
	->skip,pushMode(IGNORED_ARG_MODE)
	;

IGNORED_CONTINUATION
	: (DASH | PLUS)
	->skip,pushMode(IGNORED_CONTINUATION_MODE)
	;

IGNORED_CHAR
	: ~[\n\r]
	->skip
	;

mode IGNORED_ARG_MODE ;

IGNORED_ARG_LPAREN
	: LPAREN
	->skip,pushMode(IGNORED_ARG_MODE)
	;

IGNORED_ARG_RPAREN
	: RPAREN
	->skip,popMode
	;

IGNORED_ARG_NEWLINE
	: NEWLINE
	->skip
	;

IGNORED_ARG
	: ~[\n\r]
	->skip
	;

mode IGNORED_CONTINUATION_MODE ;

IGNORED_CONTINUATION_CHAR
	: ~[\n\r]
	->skip
	;

IGNORED_CONTINUATION_NEWLINE
	: NEWLINE
	->skip,popMode
	;


