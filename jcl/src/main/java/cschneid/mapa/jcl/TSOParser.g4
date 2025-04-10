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

Additionally, and this only became apparent as this grammar was being coded,
an application might make use of this grammar to detect execution of 
arbitrary z/OS applications via the CALL command, and arbitrary allocation
of datasets via the ALLOCATE command.  Yes, it is possible to code...

//STEP0001 EXEC PGM=IKJEFT01
//SYSTSPRT DD  SYSOUT=*
//SYSTSIN  DD  *
ALLOCATE DDNAME(MASTER) DA('PAYROLL.MASTER') SHR
ALLOCATE DDNAME(NEWMAST) DA('NEW.PAYROLL.MASTER') -
         LIKE('PAYROLL.MASTER')
ALLOCATE DDNAME(TRANFILE) DA('CURRENT.PAYROLL.TRANSACT') SHR
ALLOCATE DDNAME(REPORT01) SYSOUT
CALL *PAYUPDAT
WHEN SYSRC(= 0) SE 'NEW PAYROLL MASTER CREATED SUCCESSFULLY' -
     USER(HR001) LOGON
WHEN SYSRC(> 0) SE 'ERROR IN CREATING NEW PAYROLL MASTER' -
     USER(HR001) LOGON
FREE DDNAME(MASTER NEWMAST TRANSFILE REPORT01)
//* This could continue, executing other programs

...and you can hide all those TSO commands inside a file with other
control statements, thus ensuring JCL analysis to be incomplete.

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

/*
Interestingly, if there is CMD_PARM_WS on either side of a comment it shows
up in the parser as two separate tokens.
*/

cmdParm
	: CMD_PARM_WS? CMD_PARM_WS? (LPAREN | RPAREN | COMMA | CMD_PARM+ | CMD_PARM_WS | QUOTED_STRING_FRAGMENT+ | SQUOTE2+)*
	;

pgm
	: CMD_PARM_WS? ((CMD_PARM+ (LPAREN ARG+ RPAREN)?) | QUOTED_STRING_FRAGMENT+)
	;

pgmParm
	: (CMD_PARM_WS? QUOTED_STRING_FRAGMENT+)
	;

allocate
	: (ALLOCATE | ALLOC) cmdParm
	;

dsnStream
	: DSN DSN_CMD_STREAM+ (DSN_END | EOF)
	;

altlib
	: ALTLIB cmdParm
	;

attrib
	: (ATTRIB | ATTR) cmdParm
	;

call
	: CALL callDsname? callMember? callDsname? callPgmParm? callParms*
	;

callParms
	: (CALL_PARM_ASIS
	| CALL_PARM_CAPS
	| CALL_PARM_NOENVB
	| CALL_PARM_PASSENVB)
	;

callDsname
	: (CALL_DSNAME+)
	;

callMember
	: (LPAREN CALL_MEMBER RPAREN)
	;

callPgmParm
	: (QUOTED_STRING_FRAGMENT+)
	;

cancel
	: CANCEL cmdParm
	;

/*
Try as I might, I am unable to get the lexer to emit the E_ token
without breaking its ability to recognize arbitrary otherwise
unrecognized text as the CLIST token.  So we are left with the
unfortunate situation where the E_ token must be handled here
as if it were a CLIST token.
*/
clist
	: CLIST ((EDIT_CMD_STREAM+ EDIT_END) | cmdParm)
	;

delete
	: (DELETE | DEL) cmdParm
	;

edit
	: (EDIT | E_) EDIT_CMD_STREAM+ EDIT_END
	;

end
	: END cmdParm
	;

exec
	: (EXEC | EX) cmdParm
	;

executil
	: EXECUTIL cmdParm
	;

free
	: FREE cmdParm
	;

help
	: (HELP | H_) cmdParm
	;

link
	: LINK cmdParm
	;

listalc
	: (LISTALC | LISTA) cmdParm
	;

listbc
	: (LISTBC | LISTB) cmdParm
	;

listcat
	: (LISTCAT | LISTC) cmdParm
	;

listds
	: LISTDS cmdParm
	;

loadgo
	: (LOADGO | LOAD) cmdParm
	;

logoff
	: LOGOFF cmdParm
	;

logon
	: LOGON cmdParm
	;

outdes
	: OUTDES cmdParm
	;

output
	: (OUTPUT | OUT) cmdParm
	;

printds
	: (PRINTDS | PR) cmdParm
	;

profile
	: (PROFILE | PROF) cmdParm
	;

protect
	: (PROTECT | PROT) cmdParm
	;

receive
	: RECEIVE cmdParm
	;

rename
	: (RENAME | REN) cmdParm
	;

run
	: (RUN | R_) cmdParm
	;

send
	: (SEND | SE) cmdParm
	;

smcopy
	: (SMCOPY | SMC) cmdParm
	;

smfind
	: (SMFIND | SMF) cmdParm
	;

smput
	: (SMPUT | SMP) cmdParm
	;

status
	: (STATUS | ST) cmdParm
	;

submit
	: (SUBMIT | SUB) cmdParm
	;

terminal
	: (TERMINAL | TERM) cmdParm
	;

test
	: TEST cmdParm
	;

time
	: TIME cmdParm
	;

transmit
	: (TRANSMIT | XMIT) cmdParm
	;

tsoexec
	: TSOEXEC cmdParm
	;

tsolib
	: TSOLIB cmdParm
	;

vlfnote
	: VLFNOTE cmdParm
	;

when
	: WHEN sysrc whenTsoCmd?
	;

sysrc
	: WHEN_SYSRC LPAREN WHEN_SYSRC_OP WHEN_SYSRC_INT RPAREN
	;

whenTsoCmd
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
	| vlfnote)
	;


