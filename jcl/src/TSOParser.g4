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

parser grammar TSOParser;

options {tokenVocab=TSOLexer;}

startRule : tsoCmd* | EOF ;

tsoCmd
	: (allocate
	| dsnStream
	| altlib
	| attrib
	| call
	| cancel
	| clist
	| delete
	| edit
	| end
	| exec
	| executil
	| free
	| help
	| link
	| listalc
	| listbc
	| listcat
	| listds
	| loadgo
	| logoff
	| logon
	| outdes
	| output
	| printds
	| profile
	| protect
	| receive
	| rename
	| run
	| send
	| smcopy
	| smfind
	| smput
	| status
	| submit
	| terminal
	| test
	| time
	| transmit
	| tsoexec
	| tsolib
	| vlfnote
	| when)
	;

arg
	: LPAREN (LPAREN | ARG+ | QUOTED_STRING_FRAGMENT+ | SQUOTE2+ | RPAREN)* RPAREN
	;

parenthesizedArg
	: CMD_PARM_WS? (CMD_PARM_WS | LPAREN | ARG+ | QUOTED_STRING_FRAGMENT+ | SQUOTE2+ | RPAREN)+
	;

/*
Interestingly, if there is CMD_PARM_WS on either side of a comment it shows
up in the parser as two separate tokens.
*/
cmdParm
	: CMD_PARM_WS? CMD_PARM_WS? (CMD_PARM+ (COMMA | CMD_PARM+ | CMD_PARM_WS | arg)*)
	;

cmdParm1
	: CMD_PARM_WS? CMD_PARM_WS? (LPAREN | RPAREN | COMMA | CMD_PARM+ | CMD_PARM_WS | QUOTED_STRING_FRAGMENT+ | SQUOTE2+)*
	;

pgm
	: CMD_PARM_WS? ((CMD_PARM+ (LPAREN ARG+ RPAREN)?) | QUOTED_STRING_FRAGMENT+)
	;

pgmParm
	: (CMD_PARM_WS? QUOTED_STRING_FRAGMENT+)
	;

allocate
	: (ALLOCATE | ALLOC) cmdParm1
	;

dsnStream
	: DSN DSN_CMD_STREAM+ DSN_END
	;

altlib
	: ALTLIB cmdParm1
	;

attrib
	: (ATTRIB | ATTR) cmdParm1
	;

call
	: CALL cmdParm1
	;

cancel
	: CANCEL cmdParm1
	;

/*
Try as I might, I am unable to get the lexer to emit the E_ token
without breaking its ability to recognize arbitrary otherwise
unrecognized text as the CLIST token.  So we are left with the
unfortunate situation where the E_ token must be handled here
as if it were a CLIST token.
*/
clist
	: CLIST ((EDIT_CMD_STREAM+ EDIT_END) | cmdParm1)
	;

delete
	: (DELETE | DEL) cmdParm1
	;

edit
	: (EDIT | E_) EDIT_CMD_STREAM+ EDIT_END
	;

end
	: END cmdParm1
	;

exec
	: (EXEC | EX) cmdParm1
	;

executil
	: EXECUTIL cmdParm1
	;

free
	: FREE cmdParm1
	;

help
	: (HELP | H_) cmdParm1
	;

link
	: LINK cmdParm1 //LINK (parenthesizedArg | cmdParm)+
	;

listalc
	: (LISTALC | LISTA) cmdParm1
	;

listbc
	: (LISTBC | LISTB) cmdParm1
	;

listcat
	: (LISTCAT | LISTC) cmdParm1
	;

listds
	: LISTDS cmdParm1
	;

loadgo
	: (LOADGO | LOAD) cmdParm1
	;

logoff
	: LOGOFF cmdParm1
	;

logon
	: LOGON cmdParm1
	;

outdes
	: OUTDES cmdParm1
	;

output
	: (OUTPUT | OUT) cmdParm1
	;

printds
	: (PRINTDS | PR) cmdParm1
	;

profile
	: (PROFILE | PROF) cmdParm1
	;

protect
	: (PROTECT | PROT) cmdParm1
	;

receive
	: RECEIVE cmdParm1
	;

rename
	: (RENAME | REN) cmdParm1
	;

run
	: (RUN | R_) cmdParm1
	;

send
	: (SEND | SE) cmdParm1
	;

smcopy
	: (SMCOPY | SMC) cmdParm1
	;

smfind
	: (SMFIND | SMF) cmdParm1
	;

smput
	: (SMPUT | SMP) cmdParm1
	;

status
	: (STATUS | ST) cmdParm1
	;

submit
	: (SUBMIT | SUB) cmdParm1
	;

terminal
	: (TERMINAL | TERM) cmdParm1
	;

test
	: TEST cmdParm1
	;

time
	: TIME cmdParm1
	;

transmit
	: (TRANSMIT | XMIT) cmdParm1
	;

tsoexec
	: TSOEXEC cmdParm1
	;

tsolib
	: TSOLIB cmdParm1
	;

vlfnote
	: VLFNOTE cmdParm1
	;

when
	: WHEN cmdParm1
	;

