/*
Copyright (C) 2020 Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is intended to be a minimal ANTLR4 grammar for TSO commands.  The primary
purpose is to allow a listener to obtain any DSN commands without too much
tumult being caused by any surrounding TSO commands.

In parsing JCL, one may encounter an execution of IKJEFT01, IKJEFT1A, or
IKJEFT1B, all of which are entry points in TSO.  It is common to execute
applications with embedded SQL accessing DB2 via the TSO Attachment Facility,
with the SYSTSIN DD pointing at statements such as...

DSN SYSTEM(DB2P)
RUN PROGRAM(J8675309) PLAN(J8675309) -
  PARMS('ABLEBAKERCHARLIEDOGEASYFOX')
END

...causing the execution of the application.  DSN, the DB2 command processor
that runs as a TSO command processor, may have its commands embedded along
with other TSO commands.

This grammar is part of a project to parse JCL, which itself is part of
a larger project whose aim is to assist in mainframe application portfolio
analysis by making it possible to construct an inventory of programs,
procedures, et. al.

An application might make use of this grammar by detecting execution of
TSO and parsing its SYSTSIN to obtain any DSN commands, parse those using
the DSNTSO parser which is also part of this project, and thus obtain the
actual program(s) being executed under the TSO monitor program running 
the DSN command processor.

*/

lexer grammar TSOLexer;

channels { COMMENTS }

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
fragment AMPERSAND
	: '&'
	;

fragment OP_EQ
	: ((E Q) | '=')
	;

fragment OP_NE
	: ((N E) | '^=')
	;

fragment OP_GT
	: ((G T) | '>')
	;

fragment OP_LT
	: ((L T) | '<')
	;

fragment OP_GE
	: ((G E) | '>=')
	;

fragment OP_NG
	: ((N G) | '^>')
	;

fragment OP_LE
	: ((L E) | '<=')
	;

fragment OP_NL
	: ((N L) | '^<')
	;

LPAREN
	: '('
	;

RPAREN
	: ')'
	;

NEWLINE
	: [\n\r]
	->channel(HIDDEN)
	;

WS
	: [ ]+
	->channel(HIDDEN)
	;

DASH
	:  '-'
	;

PLUS
	:  '+'
	;

ASTERISK
	:  '*'
	;

SLASH
	: '/'
	;

COMMENT_START
	: SLASH ASTERISK
	->channel(COMMENTS),pushMode(CM_MODE)
	;

SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;

SQUOTE2
	: SQUOTE SQUOTE
	;

COMMA
	: ','
	;

SEMI
	: ';'
	->channel(HIDDEN)
	;

DSN
	: D S N
	->pushMode(DSN_CMD_MODE)
	;

ALLOCATE
	: A L L O C A T E
	->pushMode(CMD_PARM_MODE)
	;

ALLOC
	: A L L O C
	->pushMode(CMD_PARM_MODE)
	;

ALTLIB
	: A L T L I B 
	->pushMode(CMD_PARM_MODE)
	;

ATTRIB
	: A T T R I B 
	->pushMode(CMD_PARM_MODE)
	;

ATTR
	: A T T R 
	->pushMode(CMD_PARM_MODE)
	;

CALL
	: C A L L 
	->mode(CALL_WS_MODE)
	;

CANCEL
	: C A N C E L 
	->pushMode(CMD_PARM_MODE)
	;

DELETE
	: D E L E T E 
	->pushMode(CMD_PARM_MODE)
	;

DEL
	: D E L 
	->pushMode(CMD_PARM_MODE)
	;

EDIT
	: E D I T 
	->pushMode(EDIT_CMD_MODE)
	;

END
	: E N D 
	->pushMode(CMD_PARM_MODE)
	;

EXEC
	: E X E C 
	->pushMode(CMD_PARM_MODE)
	;

EX
	: E X 
	->pushMode(CMD_PARM_MODE)
	;

EXECUTIL
	: E X E C U T I L 
	->pushMode(CMD_PARM_MODE)
	;

FREE
	: F R E E 
	->pushMode(CMD_PARM_MODE)
	;

HELP
	: H E L P 
	->pushMode(CMD_PARM_MODE)
	;

LINK
	: L I N K 
	->pushMode(CMD_PARM_MODE)
	;

LISTALC
	: L I S T A L C 
	->pushMode(CMD_PARM_MODE)
	;

LISTA
	: L I S T A 
	->pushMode(CMD_PARM_MODE)
	;

LISTBC
	: L I S T B C 
	->pushMode(CMD_PARM_MODE)
	;

LISTB
	: L I S T B 
	->pushMode(CMD_PARM_MODE)
	;

LISTCAT
	: L I S T C A T 
	->pushMode(CMD_PARM_MODE)
	;

LISTC
	: L I S T C 
	->pushMode(CMD_PARM_MODE)
	;

LISTDS
	: L I S T D S 
	->pushMode(CMD_PARM_MODE)
	;

LOADGO
	: L O A D G O 
	->pushMode(CMD_PARM_MODE)
	;

LOAD
	: L O A D 
	->pushMode(CMD_PARM_MODE)
	;

LOGOFF
	: L O G O F F 
	->pushMode(CMD_PARM_MODE)
	;

LOGON
	: L O G O N 
	->pushMode(CMD_PARM_MODE)
	;

OUTDES
	: O U T D E S 
	->pushMode(CMD_PARM_MODE)
	;

OUTPUT
	: O U T P U T 
	->pushMode(CMD_PARM_MODE)
	;

OUT
	: O U T 
	->pushMode(CMD_PARM_MODE)
	;

PRINTDS
	: P R I N T D S 
	->pushMode(CMD_PARM_MODE)
	;

PR
	: P R 
	->pushMode(CMD_PARM_MODE)
	;

PROFILE
	: P R O F I L E 
	->pushMode(CMD_PARM_MODE)
	;

PROF
	: P R O F 
	->pushMode(CMD_PARM_MODE)
	;

PROTECT
	: P R O T E C T 
	->pushMode(CMD_PARM_MODE)
	;

PROT
	: P R O T 
	->pushMode(CMD_PARM_MODE)
	;

RECEIVE
	: R E C E I V E 
	->pushMode(CMD_PARM_MODE)
	;

RENAME
	: R E N A M E 
	->pushMode(CMD_PARM_MODE)
	;

REN
	: R E N 
	->pushMode(CMD_PARM_MODE)
	;

RUN
	: R U N 
	->pushMode(CMD_PARM_MODE)
	;

SEND
	: S E N D 
	->pushMode(CMD_PARM_MODE)
	;

SE
	: S E 
	->pushMode(CMD_PARM_MODE)
	;

SMCOPY
	: S M C O P Y 
	->pushMode(CMD_PARM_MODE)
	;

SMC
	: S M C 
	->pushMode(CMD_PARM_MODE)
	;

SMFIND
	: S M F I N D 
	->pushMode(CMD_PARM_MODE)
	;

SMF
	: S M F 
	->pushMode(CMD_PARM_MODE)
	;

SMPUT
	: S M P U T 
	->pushMode(CMD_PARM_MODE)
	;

SMP
	: S M P 
	->pushMode(CMD_PARM_MODE)
	;

STATUS
	: S T A T U S 
	->pushMode(CMD_PARM_MODE)
	;

ST
	: S T 
	->pushMode(CMD_PARM_MODE)
	;

SUBMIT
	: S U B M I T 
	->pushMode(CMD_PARM_MODE)
	;

SUB
	: S U B 
	->pushMode(CMD_PARM_MODE)
	;

TERMINAL
	: T E R M I N A L 
	->pushMode(CMD_PARM_MODE)
	;

TERM
	: T E R M 
	->pushMode(CMD_PARM_MODE)
	;

TEST
	: T E S T 
	->pushMode(CMD_PARM_MODE)
	;

TIME
	: T I M E 
	->pushMode(CMD_PARM_MODE)
	;

TRANSMIT
	: T R A N S M I T 
	->pushMode(CMD_PARM_MODE)
	;

XMIT
	: X M I T 
	->pushMode(CMD_PARM_MODE)
	;

TSOEXEC
	: T S O E X E C 
	->pushMode(CMD_PARM_MODE)
	;

TSOLIB
	: T S O L I B 
	->pushMode(CMD_PARM_MODE)
	;

VLFNOTE
	: V L F N O T E 
	->pushMode(CMD_PARM_MODE)
	;

WHEN
	: W H E N 
	->pushMode(WHEN_WS_MODE)
	;

CLIST
	: '%' [a-zA-Z0-9@#$]+
	->pushMode(CMD_PARM_MODE)
	;

/*
If E_, H_, and R_ are defined prior to IMPLICIT_CLIST then any
otherwise unrecognized command containing any of those characters
is recognized as that character and the rest of the token is
unrecognized.

Unfortunately, that means that E_, H_, and R_ will be recognized
by the lexer as a CLIST token.  I can live with that.  Hopefully
you can too.

Also, using setType() to force the type of token emitted doesn't
seem to work.  getType() shows it's being done, but the parser
still sees CLIST as the token type.
*/

IMPLICIT_CLIST
	: [a-zA-Z0-9@#$]+
	{
		if (getText().equalsIgnoreCase("E")) {
			pushMode(EDIT_CMD_MODE);
		} else {
			pushMode(CMD_PARM_MODE);
		}
	}
	->type(CLIST)
	;

E_
	: E 
	->pushMode(EDIT_CMD_MODE)
	;

H_
	: H 
	->pushMode(CMD_PARM_MODE)
	;

R_
	: R 
	->pushMode(CMD_PARM_MODE)
	;

mode CMD_PARM_MODE ;

/*
The whitespace is not hidden because the parser gets confused
about the end of a CMD_PARM token if it is.
*/
CMD_PARM_WS
	: WS
	;

CMD_PARM_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

CMD_PARM_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),popMode
	;

CMD_PARM_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;

CMD_PARM_COMMENT_START
	: SLASH ASTERISK
	->type(COMMENT_START),channel(COMMENTS),pushMode(CM_MODE)
	;

CMD_PARM
	: ~[ \n\r]
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

ARG_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

ARG
	: ~[\n\r]
	;

mode CM_MODE ;

CM_COMMENT_END
	: ASTERISK SLASH
	->channel(COMMENTS),popMode
	;

CM_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

CM_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->type(NEWLINE),channel(COMMENTS),mode(DEFAULT_MODE)
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

QS_CONTINUATION
	: (DASH | PLUS) QS_WS? NEWLINE
	->channel(HIDDEN)
	;

QUOTED_STRING_FRAGMENT
	: (ANYCHAR_NOSQUOTE)+?
	;

mode DSN_CMD_MODE ;

DSN_END
	: E N D
	->popMode
	;

DSN_CMD_STREAM
	: .+?
	;

mode EDIT_CMD_MODE ;

EDIT_END
	: NEWLINE E N D
	->popMode
	;

EDIT_CMD_STREAM
	: .+?
	;

mode CALL_WS_MODE ;

CALL_WS_WS
	: WS
	->channel(HIDDEN),mode(CALL_DSNAME_MODE)
	;

mode CALL_DSNAME_MODE ;

CALL_DSNAME_LPAREN
	: LPAREN
	->type(LPAREN),pushMode(CALL_MEMBER_MODE)
	;

CALL_DSNAME_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

CALL_DSNAME_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE)
	;

CALL_DSNAME_COMMENT_START
	: SLASH ASTERISK
	->type(COMMENT_START),channel(COMMENTS),pushMode(CM_MODE)
	;

CALL_DSNAME_WS
	: WS
	->channel(HIDDEN),mode(CALL_PGM_PARM_MODE)
	;

CALL_DSNAME
	: .+?
	;

mode CALL_PGM_PARM_MODE ;

CALL_PGM_PARM_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;

CALL_PGM_PARM_LPAREN
	: LPAREN
	->type(LPAREN),pushMode(CALL_MEMBER_MODE)
	;

CALL_PGM_PARM_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

CALL_PGM_PARM_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE)
	;

CALL_PGM_PARM_COMMENT_START
	: SLASH ASTERISK
	->type(COMMENT_START),channel(COMMENTS),pushMode(CM_MODE)
	;

CALL_PGM_PARM_WS
	: WS
	->channel(HIDDEN),mode(CALL_PARM_MODE)
	;

mode CALL_MEMBER_MODE ;

CALL_MEMBER
	: [a-zA-Z0-9@#$]+
	;

CALL_MEMBER_RPAREN
	: RPAREN
	->type(RPAREN),popMode
	;

CALL_MEMBER_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

CALL_MEMBER_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE)
	;

CALL_MEMBER_COMMENT_START
	: SLASH ASTERISK
	->type(COMMENT_START),channel(COMMENTS),pushMode(CM_MODE)
	;

mode CALL_PARM_MODE ;

/*
Check for single quote in case we find ourselves here due to
whitespace in CALL_PGM_PARM_MODE prior to the program parms.
*/
CALL_PARM_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;

CALL_PARM_CAPS
	: C A P S
	;

CALL_PARM_ASIS
	: A S I S
	;

CALL_PARM_NOENVB
	: N O E N V B
	;

CALL_PARM_PASSENVB
	: P A S S E N V B
	;

CALL_PARM_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

CALL_PARM_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE)
	;

CALL_PARM_COMMENT_START
	: SLASH ASTERISK
	->type(COMMENT_START),channel(COMMENTS),pushMode(CM_MODE)
	;

CALL_PARM_WS
	: WS
	->channel(HIDDEN)
	;

mode WHEN_WS_MODE ;

WHEN_WS_WS
	: WS
	->channel(HIDDEN),mode(WHEN_SYSRC_MODE)
	;

WHEN_WS_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN),mode(WHEN_SYSRC_MODE)
	;

WHEN_WS_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE)
	;

WHEN_WS_COMMENT_START
	: SLASH ASTERISK
	->type(COMMENT_START),channel(COMMENTS),pushMode(CM_MODE)
	;

mode WHEN_SYSRC_MODE ;

WHEN_SYSRC
	: S Y S R C
	;

WHEN_SYSRC_LPAREN
	: LPAREN
	->type(LPAREN)
	;

WHEN_SYSRC_OP
	: (OP_EQ
	| OP_NE
	| OP_GT
	| OP_LT
	| OP_GE
	| OP_NG
	| OP_LE
	| OP_NL)
	;

WHEN_SYSRC_WS
	: WS
	->channel(HIDDEN)
	;

WHEN_SYSRC_INT
	: [0-9]+
	;

WHEN_SYSRC_RPAREN
	: RPAREN
	->type(RPAREN),mode(WHEN_WS_CMD_MODE)
	;

WHEN_SYSRC_CONTINUATION
	: (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN)
	;

WHEN_SYSRC_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE)
	;

WHEN_SYSRC_COMMENT_START
	: SLASH ASTERISK
	->type(COMMENT_START),channel(COMMENTS),pushMode(CM_MODE)
	;

mode WHEN_WS_CMD_MODE ;

WHEN_WS_CMD_CONTINUATION
	: WS? (DASH | PLUS) WS? NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

WHEN_WS_CMD_WS
	: WS
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

WHEN_WS_CMD_NEWLINE
	: NEWLINE
	->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE)
	;


