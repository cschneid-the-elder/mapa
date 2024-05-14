/*
Copyright (C) 2020 Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is intended to be an ANTLR4 grammar for the EXEC DLI interface.

*/

lexer grammar DLILexer;

@lexer::members {
	int parenNesting = 0;
	
	/*
	These Booleans are intended to be set by an invoking application.  It
	is syntactically correct for portions of a CICS command to be commented
	out in a way that is syntactically correct for the host language, so I
	am presuming it is also correct for the EXEC DLI interface.
	*/
	public static Boolean pliCode = false;
	public static Boolean classicCOBOLCode = false;
	public static Boolean freeFormCOBOLCode = false;
	public static Boolean cCode = false;
}

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

EXEC_DLI
	: E X E C (U T E)? [ ]+ D L I
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


ACCEPT
	: A C C E P T 
	;

AREA
	: A R E A 
	;

AREA1
	: A R E A '1' 
	;

AREA2
	: A R E A '2' 
	;

AREA3
	: A R E A '3' 
	;

AREA4
	: A R E A '4' 
	;

AREA5
	: A R E A '5' 
	;

AREA6
	: A R E A '6' 
	;

AREA7
	: A R E A '7' 
	;

CHECKPOINT
	: C H E C K P O I N T 
	;

CHKP
	: C H K P 
	;

CURRENT
	: C U R R E N T 
	;

DBQUERY
	: D B Q U E R Y 
	;

DEQ
	: D E Q 
	;

DLET
	: D L E T 
	;

FEEDBACKLEN
	: F E E D B A C K L E N 
	;

FIELDLENGTH
	: F I E L D L E N G T H 
	;

FIRST
	: F I R S T 
	;

FORMATTED
	: F O R M A T T E D 
	;

FROM
	: F R O M 
	;

GET
	: G E T 
	;

GETFIRST
	: G E T F I R S T 
	;

GN
	: G N 
	;

GNP
	: G N P 
	;

GU
	: G U 
	;

ID
	: I D 
	;

IN
	: I N 
	;

INSERT
	: I N S E R T 
	;

INTO
	: I N T O 
	;

ISRT
	: I S R T 
	;

KEYFEEDBACK
	: K E Y F E E D B A C K 
	;

KEYLENGTH
	: K E Y L E N G T H 
	;

KEYS
	: K E Y S 
	;

LAST
	: L A S T 
	;

LENGTH
	: L E N G T H 
	;

LENGTH1
	: L E N G T H '1' 
	;

LENGTH2
	: L E N G T H '2' 
	;

LENGTH3
	: L E N G T H '3' 
	;

LENGTH4
	: L E N G T H '4' 
	;

LENGTH5
	: L E N G T H '5' 
	;

LENGTH6
	: L E N G T H '6' 
	;

LENGTH7
	: L E N G T H '7' 
	;

LOAD
	: L O A D 
	;

LOCKCLASS
	: L O C K C L A S S 
	;

LOCKED
	: L O C K E D 
	;

LOG
	: L O G 
	;

MAXLENGTH
	: M A X L E N G T H 
	;

MOVENEXT
	: M O V E N E X T 
	;

NEXT
	: N E X T 
	;

NODHABEND
	: N O D H A B E N D 
	;

NONVSAM
	: N O N V S A M 
	;

OFFSET
	: O F F S E T 
	;

PARENT
	: P A R E N T 
	;

PCB
	: P C B 
	;

PID
	: P I D 
	;

POS
	: P O S 
	;

POSITION
	: P O S I T I O N 
	;

PSB
	: P S B 
	;

QUERY
	: Q U E R Y 
	;

REFRESH
	: R E F R E S H 
	;

REPL
	: R E P L 
	;

REPLACE
	: R E P L A C E 
	;

RETRIEVE
	: R E T R I E V E 
	;

ROLB
	: R O L B 
	;

ROLL
	: R O L L 
	;

ROLS
	: R O L S 
	;

SCHD
	: S C H D 
	;

SCHEDULE
	: S C H E D U L E 
	;

SEGLENGTH
	: S E G L E N G T H 
	;

SEGMENT
	: S E G M E N T 
	;

SET
	: S E T 
	;

SETCOND
	: S E T C O N D 
	;

SETPARENT
	: S E T P A R E N T 
	;

SETS
	: S E T S 
	;

SETU
	: S E T U 
	;

SETZERO
	: S E T Z E R O 
	;

STAT
	: S T A T 
	;

STATISTICS
	: S T A T I S T I C S 
	;

STATUSGROUP
	: S T A T U S G R O U P 
	;

SUMMARY
	: S U M M A R Y 
	;

SYMCHK
	: S Y M C H K 
	;

SYSSERVE
	: S Y S S E R V E 
	;

TERM
	: T E R M 
	;

TERMINATE
	: T E R M I N A T E 
	;

TOKEN
	: T O K E N 
	;

UNFORMATTED
	: U N F O R M A T T E D 
	;

UNIQUE
	: U N I Q U E 
	;

USING
	: U S I N G 
	;

VARIABLE
	: V A R I A B L E 
	;

VSAM
	: V S A M 
	;

WHERE
	: W H E R E 
	;

XRST
	: X R S T 
	;

// 92 rules generated Tue May 14 17:33:27 CDT 2024

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

