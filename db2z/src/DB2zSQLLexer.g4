/*
Copyright (C) 2021 - 2024 Craig Schneiderwent.  
Portions copyright (C) 2023 - 2024 Martijn Rutte.  
All rights reserved.

The authors accept no liability for damages of any kind resulting from the use
of this software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.
*/


lexer grammar DB2zSQLLexer;

@lexer::members {
	public String statementTerminator = new String("");
	public int bracketNesting = 0;
	public Boolean dsnutil = false;
	public int dsnutilArgc = 0;
	public Boolean dsnutil_dsn_ws_char = false;
	public Boolean dsnutil_db_ts_char = false;
	public Boolean dsnutilLoad = false;
	public Boolean dsnutilEXECSQL = false;
}

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

LPAREN
	: '('
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
	}
	->pushMode(DEFAULT_MODE)
	;

RPAREN
	: ')'
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
		switch (_modeStack.peek()){
			case DEFAULT_MODE :
				popMode();
				break;
			case DSNUTIL_WHEN_MODE :
				popMode();
				popMode();
				break;
			default:
				popMode();
				popMode();
				break;
		}
	}
	;

OPENSQBRACKET
	: '['
	{bracketNesting++;}
	;

CLOSESQBRACKET
	: ']'
	{bracketNesting--;}
	;

QUESTIONMARK
	: '?' {!getText().equals(statementTerminator)}?
	;

fragment BANG
	: '!'
	;

EQ
	: '='
	;

GT
	: '>'
	;

LT
	: '<'
	;

GE
	: ((GT EQ) | (BANG LT))
	;

LE
	: ((LT EQ) | (BANG GT))
	;

NE
	: ((LT GT) | (BANG EQ))
	;

PLUS
	: '+'
	;

MINUS
	: '-'
	;

SPLAT
	: '*'
	;

SLASH
	: '/'
	;

CONCATOP
	: '||'
	| BANG BANG
	;

CONCATOP_BBBB
	: ']]'
	{bracketNesting == 0}?
	->type(CONCATOP)
	;

DOT
	: '.'
	;

COLON
	: ':'
	;

SEMICOLON
	: ';'
	;

COMMA
	: ','
	{
		if (dsnutil) {
			dsnutilArgc++;
			//System.out.println("dsnutilArgc = " + dsnutilArgc);
		}
	}
	;

DSNUTIL_OPEN_APOS
	: '\''
	{dsnutil && dsnutilArgc == 2}?
	{
		//System.out.println("dsnutil && dsnutilArgc == 2 & \'");
		/*
		Setting this variable to false is necessary here because 
		the EXEC SQL online Utility Control Statement may come back
		through this token if a literal is present in any dynamic
		SQL being processed.
		*/
		dsnutil = false;
	}
	->pushMode(DSNUTIL_MODE)
	;

/*
2024-04-05 Added "dsnutil = false;" to fix problem with third
DSNUTILx parameter being delimited with '"' and also containing
EXEC SQL ... ENDEXEC with a literal embedded.
*/

DSNUTIL_OPEN_QUOTE
	: '"'
	{dsnutil && dsnutilArgc == 2}?
	{
		//System.out.println("dsnutil && dsnutilArgc == 2 & \"");
		/*
		Setting this variable to false is necessary here because 
		the EXEC SQL online Utility Control Statement may come back
		through this token if a literal is present in any dynamic
		SQL being processed.
		*/
		dsnutil = false;
	}
	->pushMode(DSNUTIL_MODE)
	;

NONNUMERICLITERAL
	: STRINGLITERAL
	| HEXLITERAL
	| DOUBLE_APOS_STRINGLITERAL
	| BINARYSTRINGLITERAL
	| GRAPHICSTRINGLITERAL
	| GRAPHICUNICODESTRINGLITERAL
	;

fragment HEXLITERAL
	: X '"' [0-9a-fA-F]+ '"'
	| X '\'' [0-9a-fA-F]+ '\''
	;

fragment BINARYSTRINGLITERAL
	: B X '"' [0-9a-fA-F]+ '"'
	| B X '\'' [0-9a-fA-F]+ '\''
	;

fragment GRAPHICSTRINGLITERAL
	: G X '"' [0-9a-fA-F]+ '"'
	| G X '\'' [0-9a-fA-F]+ '\''
	;

fragment GRAPHICUNICODESTRINGLITERAL
	: U X '"' [0-9a-fA-F]+ '"'
	| U X '\'' [0-9a-fA-F]+ '\''
	;

fragment STRINGLITERAL
	: (
	('"' (~["] | '""' | '\'')* '"')
	| ('\'' (~['] | '\'\'' | '"')* '\'')
	)
	{!(dsnutil && dsnutilArgc == 2)}?
	;

/*
This is interesting.  If we are processing the third parameter
to DSNUTILx, and that parameter contains an EXEC SQL ... ENDEXEC
statement, and that statement contains a literal, it may be
delimited by two apostrophes.  Setting the dsnutilEXECSQL boolean
means this will match instead of the first two apostrophes
matching STRINGLITERAL, the intended contents of the literal
possibly matching SQLIDENTIFIER, and the final two apostrophes
matching STRINGLITERAL.
*/

fragment DOUBLE_APOS_STRINGLITERAL
	: ('\'\'' ~[']* '\'\'')
	{dsnutilEXECSQL}?
	;

INTEGERLITERAL
	: (PLUS | MINUS)? [0-9]+
	;

NUMERICLITERAL
	: (PLUS | MINUS)? [0-9]* DOT [0-9]+ (('e' | 'E') (PLUS | MINUS)? [0-9]+)?
	;

NEWLINE
	: [\n\r]
	->channel(HIDDEN)
	;

WS
	: [ \t]+
	->channel(HIDDEN)
	;

/*
For those who need to process SQL that is not embedded
in application source code, provision is made for the
SPUFI command to set the SQL statement terminator.
*/
SET_STATEMENT_TERMINATOR
	: ('--#SET' WS 'TERMINATOR' WS ~[\n\r] WS? NEWLINE)
	{
		String text = getText();
		String textStripped = text.stripTrailing();
		statementTerminator = new String(textStripped.substring(textStripped.length() - 1));
	}
	->channel(COMMENTS)
	;

/*
Removed NEWLINE from first line of this rule per Maarten van Haasteren as
it caused a lexer error when the last line of the input was a comment.
*/
SQLCOMMENT
	: (('--' ~[\n\r]*)
	| (SLASH SPLAT .*? SPLAT SLASH))
	->channel(COMMENTS)
	;

SQLBLOCKCOMMENTBEGIN
	: SLASH SPLAT
	;

SQLBLOCKCOMMENTEND
	: SPLAT SLASH
	;

DSNUTIL_ENDEXEC
	: E N D E X E C
	{dsnutilEXECSQL = false;}
	->popMode
	;

INSTEAD
	: I N S T E A D 
	;

NEW
	: N E W 
	;

NEW_TABLE
	: N E W '_' T A B L E 
	;

OLD_TABLE
	: O L D '_' T A B L E 
	;

REFERENCING
	: R E F E R E N C I N G 
	;

BASED
	: B A S E D
	;

UPON
	: U P O N
	;

//generated sql lexer keywords

ADD
	: A D D 
	;

AFTER
	: A F T E R 
	;

ALL
	: A L L 
	;

ALLOCATE
	: A L L O C A T E 
	;

ALLOW
	: A L L O W 
	;

ALTER
	: A L T E R
	;

ALTERAND
	: A L T E R A N D 
	;

ANY
	: A N Y 
	;

ARRAY
	: A R R A Y 
	;

ARRAY_EXISTS
	: A R R A Y '_' E X I S T S 
	;

AS
	: A S 
	;

ASENSITIVE
	: A S E N S I T I V E 
	;

ASSOCIATE
	: A S S O C I A T E 
	;

ASUTIME
	: A S U T I M E 
	;

AT
	: A T 
	;

AUDIT
	: A U D I T 
	;

AUX
	: A U X 
	;

AUXILIARY
	: A U X I L I A R Y 
	;

BEFORE
	: B E F O R E 
	;

BEGIN
	: B E G I N 
	;

BETWEEN
	: B E T W E E N 
	;

BUFFERPOOL
	: B U F F E R P O O L 
	;

BUFFERPOOLS
	: B U F F E R P O O L S
	;

BY
	: B Y 
	;

CALL
	: C A L L 
	;

CAPTURE
	: C A P T U R E 
	;

CASCADED
	: C A S C A D E D 
	;

CASE
	: C A S E 
	;

CAST
	: C A S T 
	;

CCSID
	: C C S I D 
	;

CHAR
	: C H A R 
	;

CHARACTER
	: C H A R A C T E R 
	;

CHECK
	: C H E C K 
	;

CLONE
	: C L O N E 
	;

CLOSE
	: C L O S E 
	;

CLUSTER
	: C L U S T E R 
	;

COLLECTION
	: C O L L E C T I O N 
	;

COLLID
	: C O L L I D 
	;

COLUMN
	: C O L U M N 
	;

COMMENT
	: C O M M E N T 
	;

COMMIT
	: C O M M I T 
	;

CONCAT
	: C O N C A T 
	;

CONDITION
	: C O N D I T I O N 
	;

CONNECT
	: C O N N E C T 
	;

CONNECTION
	: C O N N E C T I O N 
	;

CONSTRAINT
	: C O N S T R A I N T 
	;

CONTAINS
	: C O N T A I N S 
	;

CONTENT
	: C O N T E N T 
	;

CONTINUE
	: C O N T I N U E 
	;

CREATE
	: C R E A T E 
	;

CUBE
	: C U B E 
	;

CURRENT
	: C U R R E N T 
	;

//CURRENT_LC_CTYPE
//	: C U R R E N T ([ ]+ L O C A L E)? [ ]+ L C '_' C T Y P E 
//	;

CURRVAL
	: C U R R V A L 
	;

CURSOR
	: C U R S O R 
	;

DATA
	: D A T A 
	;

DATABASE
	: D A T A B A S E 
	;

DAY
	: D A Y 
	;

DAYS
	: D A Y S 
	;

DBINFO
	: D B I N F O 
	;

DECLARE
	: D E C L A R E 
	;

DEFAULT
	: D E F A U L T 
	;

DELETE
	: D E L E T E 
	;

DESCRIPTOR
	: D E S C R I P T O R 
	;

DETERMINISTIC
	: D E T E R M I N I S T I C 
	;

DISABLE
	: D I S A B L E 
	;

DISALLOW
	: D I S A L L O W 
	;

DISTINCT
	: D I S T I N C T 
	;

DO
	: D O 
	;

DOCUMENT
	: D O C U M E N T 
	;

DOUBLE
	: D O U B L E 
	;

DROP
	: D R O P 
	;

DSSIZE
	: D S S I Z E 
	;

DYNAMIC
	: D Y N A M I C 
	;

EDITPROC
	: E D I T P R O C 
	;

ELSE
	: E L S E 
	;

ELSEIF
	: E L S E I F 
	;

ENCODING
	: E N C O D I N G 
	;

ENCRYPTION
	: E N C R Y P T I O N 
	;

END
	: E N D 
	;

END_EXEC
	: E N D '-' E X E C
	;

ENDING
	: E N D I N G 
	;

ERASE
	: E R A S E 
	;

ESCAPE
	: E S C A P E 
	;

EXCEPT
	: E X C E P T 
	;

EXCEPTION
	: E X C E P T I O N 
	;

EXEC_SQL
	: E X E C [ ]+ S Q L
	;

EXECUTE
	: E X E C U T E 
	;

EXISTS
	: E X I S T S 
	;

EXIT
	: E X I T 
	;

EXPLAIN
	: E X P L A I N 
	;

EXTERNAL
	: E X T E R N A L 
	;

FENCED
	: F E N C E D 
	;

FETCH
	: F E T C H 
	;

FIELDPROC
	: F I E L D P R O C 
	;

FINAL
	: F I N A L 
	;

FIRST
	: F I R S T 
	;

FOR
	: F O R 
	;

FREE
	: F R E E 
	;

FROM
	: F R O M 
	;

FULL
	: F U L L 
	;

FUNCTION
	: F U N C T I O N 
	;

GENERATED
	: G E N E R A T E D 
	;

GET
	: G E T 
	;

GLOBAL
	: G L O B A L 
	;

GO
	: G O 
	;

GOTO
	: G O T O 
	;

GRANT
	: G R A N T 
	;

GROUP
	: G R O U P 
	;

HANDLER
	: H A N D L E R 
	;

HAVING
	: H A V I N G 
	;

HOLD
	: H O L D 
	;

HOUR
	: H O U R 
	;

HOURS
	: H O U R S 
	;

IF
	: I F 
	;

IMMEDIATE
	: I M M E D I A T E 
	;

IN
	: I N 
	;

INCLUSIVE
	: I N C L U S I V E 
	;

INDEX
	: I N D E X 
	;

INDEXBP
	: I N D E X B P
	;

INHERIT
	: I N H E R I T 
	;

INNER
	: I N N E R 
	;

INOUT
	: I N O U T 
	;

INSENSITIVE
	: I N S E N S I T I V E 
	;

INSERT
	: I N S E R T 
	;

INTERSECT
	: I N T E R S E C T 
	;

INTO
	: I N T O 
	;

IS
	: I S 
	;

ISOBID
	: I S O B I D 
	;

ITERATE
	: I T E R A T E 
	;

JAR
	: J A R 
	;

JOIN
	: J O I N 
	;

KEEP
	: K E E P 
	;

KEY
	: K E Y 
	;

LABEL
	: L A B E L 
	;

LANGUAGE
	: L A N G U A G E 
	;

LAST
	: L A S T 
	;

LC_CTYPE
	: L C '_' C T Y P E 
	;

LEAVE
	: L E A V E 
	;

LEFT
	: L E F T 
	;

LIKE
	: L I K E 
	;

LIMIT
	: L I M I T 
	;

LOCAL
	: L O C A L 
	;

LOCALE
	: L O C A L E 
	;

LOCATOR
	: L O C A T O R 
	;

LOCATORS
	: L O C A T O R S 
	;

LOCK
	: L O C K 
	;

LOCKMAX
	: L O C K M A X 
	;

LOCKSIZE
	: L O C K S I Z E 
	;

LONG
	: L O N G 
	;

LOOP
	: L O O P 
	;

MAINTAINED
	: M A I N T A I N E D 
	;

MATERIALIZED
	: M A T E R I A L I Z E D 
	;

MICROSECOND
	: M I C R O S E C O N D 
	;

MICROSECONDS
	: M I C R O S E C O N D S 
	;

MINUTEMINUTES
	: M I N U T E M I N U T E S 
	;

MODEL
	: M O D E L
	;

MODIFIES
	: M O D I F I E S 
	;

MONTH
	: M O N T H 
	;

MONTHS
	: M O N T H S 
	;

NEXT
	: N E X T 
	;

NEXTVAL
	: N E X T V A L 
	;

NO
	: N O 
	;

NODEFER
	: N O D E F E R
	;

NONE
	: N O N E 
	;

NOT
	: N O T 
	;

NULL
	: N U L L 
	;

NULLS
	: N U L L S 
	;

NUMPARTS
	: N U M P A R T S 
	;

OBID
	: O B I D 
	;

OF
	: O F 
	;

OFFSET
	: O F F S E T 
	;

OLD
	: O L D 
	;

ON
	: O N 
	;

ONCE
	: O N C E
	;

OPEN
	: O P E N 
	;

OPTIMIZATION
	: O P T I M I Z A T I O N 
	;

OPTIMIZE
	: O P T I M I Z E 
	;

OR
	: O R 
	;

ORDER
	: O R D E R 
	;

NOORDER
	: N O O R D E R
	;

ORGANIZATION
	: O R G A N I Z A T I O N 
	;

OUT
	: O U T 
	;

OUTER
	: O U T E R 
	;

PACKAGE
	: P A C K A G E 
	;

PADDED
	: P A D D E D 
	;

PARAMETER
	: P A R A M E T E R 
	;

PART
	: P A R T 
	;

PARTITION
	: P A R T I T I O N 
	;

PARTITIONED
	: P A R T I T I O N E D 
	;

PARTITIONING
	: P A R T I T I O N I N G 
	;

PATH
	: P A T H 
	;

PERIOD
	: P E R I O D 
	;

PIECESIZE
	: P I E C E S I Z E 
	;

PLAN
	: P L A N 
	;

PRECISION
	: P R E C I S I O N 
	;

PREPARE
	: P R E P A R E 
	;

PREVVAL
	: P R E V V A L 
	;

PRIOR
	: P R I O R 
	;

PRIQTY
	: P R I Q T Y 
	;

PRIVILEGES
	: P R I V I L E G E S 
	;

PROCEDURE
	: P R O C E D U R E 
	;

PROGRAM
	: P R O G R A M 
	;

PSID
	: P S I D 
	;

PUBLIC
	: P U B L I C 
	;

QUERY
	: Q U E R Y 
	;

QUERYNO
	: Q U E R Y N O 
	;

READS
	: R E A D S 
	;

REFERENCES
	: R E F E R E N C E S 
	;

REFRESH
	: R E F R E S H 
	;

RELEASE
	: R E L E A S E 
	;

RENAME
	: R E N A M E 
	;

REPEAT
	: R E P E A T 
	;

RESIGNAL
	: R E S I G N A L 
	;

RESTRICT
	: R E S T R I C T 
	;

RESULT
	: R E S U L T 
	;

RESULT_SET_LOCATOR
	: R E S U L T '_' S E T '_' L O C A T O R 
	;

RETURN
	: R E T U R N 
	;

RETURNS
	: R E T U R N S 
	;

REUSE
	: R E U S E
	;

REVOKE
	: R E V O K E 
	;

RIGHT
	: R I G H T 
	;

ROLE
	: R O L E 
	;

ROLLBACK
	: R O L L B A C K 
	;

ROLLUP
	: R O L L U P 
	;

ROUND_CEILING
	: R O U N D '_' C E I L I N G 
	;

ROUND_DOWN
	: R O U N D '_' D O W N 
	;

ROUND_FLOOR
	: R O U N D '_' F L O O R 
	;

ROUND_HALF_DOWN
	: R O U N D '_' H A L F '_' D O W N 
	;

ROUND_HALF_EVEN
	: R O U N D '_' H A L F '_' E V E N 
	;

ROUND_HALF_UP
	: R O U N D '_' H A L F '_' U P 
	;

ROUND_UP
	: R O U N D '_' U P 
	;

ROW
	: R O W 
	;

ROWSET
	: R O W S E T 
	;

RUN
	: R U N 
	;

SAVEPOINT
	: S A V E P O I N T 
	;

SCHEMA
	: S C H E M A 
	;

SCRATCHPAD
	: S C R A T C H P A D 
	;

SECOND
	: S E C O N D 
	;

SECONDS
	: S E C O N D S 
	;

SECQTY
	: S E C Q T Y 
	;

SECURITY
	: S E C U R I T Y 
	;

SELECT
	: S E L E C T 
	;

SENSITIVE
	: S E N S I T I V E 
	;

SEQUENCE
	: S E Q U E N C E 
	;

SET
	: S E T 
	;

SIGNAL
	: S I G N A L 
	;

SIMPLE
	: S I M P L E 
	;

SOME
	: S O M E 
	;

SOURCE
	: S O U R C E 
	;

SPECIFIC
	: S P E C I F I C 
	;

STANDARD
	: S T A N D A R D 
	;

STATEMENT
	: S T A T E M E N T 
	;

STATIC
	: S T A T I C 
	;

STAY
	: S T A Y 
	;

STOGROUP
	: S T O G R O U P 
	;

STORAGE
	: S T O R A G E
	;

STORES
	: S T O R E S 
	;

STYLE
	: S T Y L E 
	;

SUMMARY
	: S U M M A R Y 
	;

SYNONYM
	: S Y N O N Y M 
	;

SYSDATE
	: S Y S D A T E 
	;

SYSTEM
	: S Y S T E M 
	;

SYSTIMESTAMP
	: S Y S T I M E S T A M P 
	;

TABLE
	: T A B L E 
	;

TABLESPACE
	: T A B L E S P A C E 
	;

THEN
	: T H E N 
	;

TO
	: T O 
	;

TRIGGER
	: T R I G G E R 
	;

TRIGGERS
	: T R I G G E R S
	;

TRUNCATE
	: T R U N C A T E 
	;

TYPE
	: T Y P E 
	;

UNDO
	: U N D O 
	;

UNION
	: U N I O N 
	;

UNIQUE
	: U N I Q U E 
	;

UNTIL
	: U N T I L 
	;

UPDATE
	: U P D A T E 
	;

USING
	: U S I N G 
	;

VALIDPROC
	: V A L I D P R O C 
	;

VALUE
	: V A L U E 
	;

VALUES
	: V A L U E S 
	;

VARIABLE
	: V A R I A B L E 
	;

VARIANT
	: V A R I A N T 
	;

VCAT
	: V C A T 
	;

VERSIONING
	: V E R S I O N I N G 
	;

VIEW
	: V I E W 
	;

VOLATILE
	: V O L A T I L E 
	;

VOLUMES
	: V O L U M E S 
	;

WHEN
	: W H E N 
	;

WHENEVER
	: W H E N E V E R 
	;

WHERE
	: W H E R E 
	;

WHILE
	: W H I L E 
	;

WITH
	: W I T H 
	;

WLM
	: W L M 
	;

XMLCAST
	: X M L C A S T 
	;

XMLEXISTS
	: X M L E X I S T S 
	;

XMLNAMESPACES
	: X M L N A M E S P A C E S 
	;

YEAR
	: Y E A R 
	;

YEARS
	: Y E A R S 
	;

ZONE
	: Z O N E 
	;

TIMEZONE
	: T I M E Z O N E
	;

TIMEZONE_HOUR
	: T I M E Z O N E '_' H O U R
	;

TIMEZONE_MINUTE
	: T I M E Z O N E '_' M I N U T E
	;

AND
	: A N D 
	;

ARRAY_AGG
	: A R R A Y '_' A G G 
	;

ASC
	: A S C 
	;

AVG
	: A V G 
	;

BIT
	: B I T 
	;

CHANGE
	: C H A N G E 
	;

CODEUNITS16
	: C O D E U N I T S '1' '6' 
	;

CODEUNITS32
	: C O D E U N I T S '3' '2' 
	;

CORR
	: C O R R 
	;

CORRELATION
	: C O R R E L A T I O N 
	;

COUNT
	: C O U N T 
	;

COUNT_BIG
	: C O U N T '_' B I G 
	;

COVAR
	: C O V A R 
	;

COVARIANCE
	: C O V A R I A N C E 
	;

COVARIANCE_SAMP
	: C O V A R I A N C E '_' S A M P 
	;

COVAR_POP
	: C O V A R '_' P O P 
	;

COVAR_SAMP
	: C O V A R '_' S A M P 
	;

CS
	: C S 
	;

CUME_DIST
	: C U M E '_' D I S T 
	;

DENSE_RANK
	: D E N S E '_' R A N K 
	;

DESC
	: D E S C 
	;

EBCDIC
	: E B C D I C 
	;

EXCLUSIVE
	: E X C L U S I V E 
	;

FIRST_VALUE
	: F I R S T '_' V A L U E 
	;

FOLLOWING
	: F O L L O W I N G 
	;

GROUPING
	: G R O U P I N G 
	;

IGNORE
	: I G N O R E 
	;

INDICATOR
	: I N D I C A T O R 
	;

INPUT
	: I N P U T 
	;

ISNULL
	: I S N U L L 
	;

LAG
	: L A G 
	;

LARGE
	: L A R G E 
	;

LAST_VALUE
	: L A S T '_' V A L U E 
	;

LEAD
	: L E A D 
	;

LISTAGG
	: L I S T A G G 
	;

LOCKED
	: L O C K E D 
	;

LOCKS
	: L O C K S 
	;

MEDIAN
	: M E D I A N 
	;

MINUTES
	: M I N U T E S 
	;

MIXED
	: M I X E D 
	;

NOTNULL
	: N O T N U L L 
	;

NTH_VALUE
	: N T H '_' V A L U E 
	;

NTILE
	: N T I L E 
	;

NUMERIC
	: N U M E R I C 
	;

OBJECT
	: O B J E C T 
	;

OCTETS
	: O C T E T S 
	;

ONLY
	: O N L Y 
	;

OVER
	: O V E R 
	;

PASSING
	: P A S S I N G 
	;

PERCENTILE_CONT
	: P E R C E N T I L E '_' C O N T 
	;

PERCENTILE_DISC
	: P E R C E N T I L E '_' D I S C 
	;

PERCENT_RANK
	: P E R C E N T '_' R A N K 
	;

PRECEDING
	: P R E C E D I N G 
	;

PREVIOUS
	: P R E V I O U S 
	;

RANGE
	: R A N G E 
	;

RANK
	: R A N K 
	;

RATIO_TO_REPORT
	: R A T I O '_' T O '_' R E P O R T 
	;

READ
	: R E A D 
	;

REF
	: R E F 
	;

REGR_AVGX
	: R E G R '_' A V G X 
	;

REGR_AVGY
	: R E G R '_' A V G Y 
	;

REGR_COUNT
	: R E G R '_' C O U N T 
	;

REGR_ICPT
	: R E G R '_' I C P T 
	;

REGR_INTERCEPT
	: R E G R '_' I N T E R C E P T 
	;

REGR_R2
	: R E G R '_' R '2' 
	;

REGR_SLOPE
	: R E G R '_' S L O P E 
	;

REGR_SXX
	: R E G R '_' S X X 
	;

REGR_SXY
	: R E G R '_' S X Y 
	;

REGR_SYY
	: R E G R '_' S Y Y 
	;

RESPECT
	: R E S P E C T 
	;

ROW_NUMBER
	: R O W '_' N U M B E R 
	;

ROWS
	: R O W S 
	;

RR
	: R R 
	;

RS
	: R S 
	;

SBCS
	: S B C S 
	;

SELECTIVITY
	: S E L E C T I V I T Y 
	;

SETS
	: S E T S 
	;

SHARE
	: S H A R E 
	;

SKIP_
	: S K I P 
	;

STDDEV
	: S T D D E V 
	;

STDDEV_POP
	: S T D D E V '_' P O P 
	;

STDDEV_SAMP
	: S T D D E V '_' S A M P 
	;

SUM
	: S U M 
	;

TOKEN
	: T O K E N 
	;

UNBOUNDED
	: U N B O U N D E D 
	;

UNPACK
	: U N P A C K 
	;

UR
	: U R 
	;

USE
	: U S E 
	;

VAR
	: V A R 
	;

VARIANCE
	: V A R I A N C E 
	;

VARIANCE_SAMP
	: V A R I A N C E '_' S A M P 
	;

VAR_POP
	: V A R '_' P O P 
	;

VAR_SAMP
	: V A R '_' S A M P 
	;

VARYING
	: V A R Y I N G 
	;

WITHOUT
	: W I T H O U T 
	;

XML
	: X M L 
	;

XMLAGG
	: X M L A G G 
	;

COLUMNS
	: C O L U M N S
	;

SQLID
	: S Q L I D
	;

ORDINALITY
	: O R D I N A L I T Y
	;

SYSTEM_TIME
	: S Y S T E M '_' T I M E
	;

BUSINESS_TIME
	: B U S I N E S S '_' T I M E
	;

MULTIPLIER
	: M U L T I P L I E R
	;

UNNEST
	: U N N E S T
	;

CROSS
	: C R O S S
	;

CALLER
	: C A L L E R
	;

CLIENT
	: C L I E N T
	;

POSITIONING
	: P O S I T I O N I N G
	;

SCROLL
	: S C R O L L
	;

ACTION
	: A C T I O N 
	;

ASSEMBLE
	: A S S E M B L E 
	;

C_
	: C 
	;

CALLED
	: C A L L E D 
	;

COBOL
	: C O B O L 
	;

DB2
	: D B '2' 
	;

DEFINER
	: D E F I N E R 
	;

DISPATCH
	: D I S P A T C H 
	;

ENVIRONMENT
	: E N V I R O N M E N T 
	;

FAILURE
	: F A I L U R E 
	;

FAILURES
	: F A I L U R E S 
	;

JAVA
	: J A V A 
	;

MAIN
	: M A I N 
	;

NAME
	: N A M E 
	;

OPTIONS
	: O P T I O N S 
	;

PARALLEL
	: P A R A L L E L 
	;

PLI
	: P L I 
	;

REGISTERS
	: R E G I S T E R S 
	;

RESIDENT
	: R E S I D E N T 
	;

SECURED
	: S E C U R E D 
	;

SPECIAL
	: S P E C I A L 
	;

SQL
	: S Q L 
	;

STOP
	: S T O P 
	;

SUB
	: S U B 
	;

YES
	: Y E S 
	;

APPLICATION
	: A P P L I C A T I O N 
	;

CHANGED
	: C H A N G E D 
	;

COMPATIBILITY
	: C O M P A T I B I L I T Y 
	;

COMPRESS
	: C O M P R E S S 
	;

COPY
	: C O P Y 
	;

FREEPAGE
	: F R E E P A G E 
	;

GBPCACHE
	: G B P C A C H E 
	;

INCLUDE
	: I N C L U D E 
	;

MAXVALUE
	: M A X V A L U E 
	;

NOMAXVALUE
	: N O M A X V A L U E
	;

MINVALUE
	: M I N V A L U E 
	;

NOMINVALUE
	: N O M I N V A L U E
	;

PCTFREE
	: P C T F R E E 
	;

REGENERATE
	: R E G E N E R A T E 
	;

MASK
	: M A S K
	;

ENABLE
	: E N A B L E
	;

PERMISSION
	: P E R M I S S I O N
	;

ATOMIC
	: A T O M I C
	;

SQLEXCEPTION
	: S Q L E X C E P T I O N
	;

MERGE
	: M E R G E
	;

MATCHED
	: M A T C H E D
	;

SQLSTATE
	: S Q L S T A T E
	;

MESSAGE_TEXT
	: M E S S A G E '_' T E X T
	;

OVERRIDING
	: O V E R R I D I N G
	;

PORTION
	: P O R T I O N
	;

DB2SQL
	: D B '2' S Q L
	;

DEBUG
	: D E B U G
	;

GENERAL
	: G E N E R A L
	;

MODE_
	: M O D E
	;

REXX
	: R E X X
	;

CACHE
	: C A C H E
	;

NOCACHE
	: N O C A C H E
	;

CYCLE
	: C Y C L E
	;

NOCYCLE
	: N O C Y C L E
	;

INCREMENT
	: I N C R E M E N T
	;

RESTART
	: R E S T A R T
	;

DATACLAS
	: D A T A C L A S
	;

MGMTCLAS
	: M G M T C L A S
	;

REMOVE
	: R E M O V E
	;

STORCLAS
	: S T O R C L A S
	;

ACCESS
	: A C C E S S 
	;

ACTIVATE
	: A C T I V A T E 
	;

ALWAYS
	: A L W A Y S 
	;

APPEND
	: A P P E N D 
	;

ARCHIVE
	: A R C H I V E 
	;

BUSINESS
	: B U S I N E S S 
	;

CASCADE
	: C A S C A D E 
	;

CHANGES
	: C H A N G E S 
	;

CONTROL
	: C O N T R O L 
	;

DEACTIVATE
	: D E A C T I V A T E 
	;

DEFERRED
	: D E F E R R E D 
	;

EACH
	: E A C H 
	;

ENFORCED
	: E N F O R C E D 
	;

EXTRA
	: E X T R A 
	;

FOREIGN
	: F O R E I G N 
	;

HIDDEN_
	: H I D D E N 
	;

HISTORY
	: H I S T O R Y 
	;

ID
	: I D 
	;

IDENTITY
	: I D E N T I T Y 
	;

IMPLICITLY
	: I M P L I C I T L Y 
	;

INITIALLY
	: I N I T I A L L Y 
	;

INLINE
	: I N L I N E 
	;

OPERATION
	: O P E R A T I O N 
	;

ORGANIZE
	: O R G A N I Z E 
	;

OVERLAPS
	: O V E R L A P S 
	;

PACKAGE_NAME
	: P A C K A G E '_' N A M E 
	;

PACKAGE_SCHEMA
	: P A C K A G E '_' S C H E M A 
	;

PACKAGE_VERSION
	: P A C K A G E '_' V E R S I O N 
	;

PRIMARY
	: P R I M A R Y 
	;

RESET
	: R E S E T 
	;

ROTATE
	: R O T A T E 
	;

START
	: S T A R T 
	;

SYSIBM
	: S Y S I B M 
	;

TRANSACTION
	: T R A N S A C T I O N 
	;

XMLSCHEMA
	: X M L S C H E M A
	;

ELEMENT
	: E L E M E N T
	;

URL
	: U R L
	;

NAMESPACE
	: N A M E S P A C E
	;

LOCATION
	: L O C A T I O N
	;

SYSXSR
	: S Y S X S R
	;

ALGORITHM
	: A L G O R I T H M 
	;

FIXEDLENGTH
	: F I X E D L E N G T H 
	;

HUFFMAN
	: H U F F M A N 
	;

LOB
	: L O B 
	;

LOG
	: L O G 
	;

LOGGED
	: L O G G E D 
	;

MAXPARTITIONS
	: M A X P A R T I T I O N S 
	;

MAXROWS
	: M A X R O W S 
	;

MEMBER
	: M E M B E R 
	;

MOVE
	: M O V E 
	;

PAGE
	: P A G E 
	;

PAGENUM
	: P A G E N U M 
	;

PENDING
	: P E N D I N G 
	;

RELATIVE
	: R E L A T I V E 
	;

SEGSIZE
	: S E G S I Z E 
	;

TRACKMOD
	: T R A C K M O D 
	;

ADDRESS
	: A D D R E S S 
	;

ATTRIBUTES
	: A T T R I B U T E S 
	;

AUTHENTICATION
	: A U T H E N T I C A T I O N 
	;

AUTHID
	: A U T H I D 
	;

CONTEXT
	: C O N T E X T 
	;

JOBNAME
	: J O B N A M E 
	;

OWNER
	: O W N E R 
	;

PROFILE
	: P R O F I L E 
	;

SERVAUTH
	: S E R V A U T H 
	;

TRUSTED
	: T R U S T E D 
	;

SECTION
	: S E C T I O N
	;

ACTIVE
	: A C T I V E
	;

VERSION
	: V E R S I O N
	;

VERSIONS
	: V E R S I O N S
	;

ALIAS
	: A L I A S
	;

WORK
	: W O R K
	;

WORKFILE
	: W O R K F I L E
	;

SYSDEFLT
	: S Y S D E F L T
	;

NULTERM
	: N U L T E R M
	;

STRUCTURE
	: S T R U C T U R E
	;

GENERIC
	: G E N E R I C
	;

TEMPORARY
	: T E M P O R A R Y
	;

DEFER
	: D E F E R 
	;

DEFINE
	: D E F I N E 
	;

EXCLUDE
	: E X C L U D E 
	;

GENERATE
	: G E N E R A T E 
	;

KEYS
	: K E Y S 
	;

XMLPATTERN
	: X M L P A T T E R N 
	;

SIZE
	: S I Z E
	;

EVERY
	: E V E R Y
	;

ABSOLUTE
	: A B S O L U T E
	;

ACCELERATOR
	: A C C E L E R A T O R
	;

EXCLUDING
	: E X C L U D I N G
	;

INCLUDING
	: I N C L U D I N G
	;

DEFAULTS
	: D E F A U L T S
	;

MODIFIERS
	: M O D I F I E R S
	;

OPTION
	: O P T I O N
	;

PRESERVE
	: P R E S E R V E
	;

BOTH
	: B O T H 
	;

DESCRIBE
	: D E S C R I B E 
	;

LABELS
	: L A B E L S 
	;

NAMES
	: N A M E S 
	;

OUTPUT
	: O U T P U T 
	;

EXCHANGE
	: E X C H A N G E
	;

STABILIZED
	: S T A B I L I Z E D 
	;

STMTCACHE
	: S T M T C A C H E 
	;

STMTID
	: S T M T I D 
	;

STMTTOKEN
	: S T M T T O K E N 
	;

STARTING
	: S T A R T I N G
	;

CATALOG_NAME
	: C A T A L O G '_' N A M E 
	;

CONDITION_NUMBER
	: C O N D I T I O N '_' N U M B E R 
	;

CURSOR_NAME
	: C U R S O R '_' N A M E 
	;

DB2_AUTHENTICATION_TYPE
	: D B '2' '_' A U T H E N T I C A T I O N '_' T Y P E 
	;

DB2_AUTHORIZATION_ID
	: D B '2' '_' A U T H O R I Z A T I O N '_' I D 
	;

DB2_CONNECTION_STATE
	: D B '2' '_' C O N N E C T I O N '_' S T A T E 
	;

DB2_CONNECTION_STATUS
	: D B '2' '_' C O N N E C T I O N '_' S T A T U S 
	;

DB2_ENCRYPTION_TYPE
	: D B '2' '_' E N C R Y P T I O N '_' T Y P E 
	;

DB2_ERROR_CODE1
	: D B '2' '_' E R R O R '_' C O D E '1' 
	;

DB2_ERROR_CODE2
	: D B '2' '_' E R R O R '_' C O D E '2' 
	;

DB2_ERROR_CODE3
	: D B '2' '_' E R R O R '_' C O D E '3' 
	;

DB2_ERROR_CODE4
	: D B '2' '_' E R R O R '_' C O D E '4' 
	;

DB2_GET_DIAGNOSTICS_DIAGNOSTICS
	: D B '2' '_' G E T '_' D I A G N O S T I C S '_' D I A G N O S T I C S 
	;

DB2_INTERNAL_ERROR_POINTER
	: D B '2' '_' I N T E R N A L '_' E R R O R '_' P O I N T E R 
	;

DB2_LAST_ROW
	: D B '2' '_' L A S T '_' R O W 
	;

DB2_LINE_NUMBER
	: D B '2' '_' L I N E '_' N U M B E R 
	;

DB2_MESSAGE_ID
	: D B '2' '_' M E S S A G E '_' I D 
	;

DB2_MODULE_DETECTING_ERROR
	: D B '2' '_' M O D U L E '_' D E T E C T I N G '_' E R R O R 
	;

DB2_NUMBER_PARAMETER_MARKERS
	: D B '2' '_' N U M B E R '_' P A R A M E T E R '_' M A R K E R S 
	;

DB2_NUMBER_RESULT_SETS
	: D B '2' '_' N U M B E R '_' R E S U L T '_' S E T S 
	;

DB2_NUMBER_ROWS
	: D B '2' '_' N U M B E R '_' R O W S 
	;

DB2_ORDINAL_TOKEN_
	: D B '2' '_' O R D I N A L '_' T O K E N '_' 
	;

DB2_ORDINAL_TOKEN_n
	: DB2_ORDINAL_TOKEN_ INTEGERLITERAL
	;

DB2_PRODUCT_ID
	: D B '2' '_' P R O D U C T '_' I D 
	;

DB2_REASON_CODE
	: D B '2' '_' R E A S O N '_' C O D E 
	;

DB2_RETURNED_SQLCODE
	: D B '2' '_' R E T U R N E D '_' S Q L C O D E 
	;

DB2_RETURN_STATUS
	: D B '2' '_' R E T U R N '_' S T A T U S 
	;

DB2_ROW_NUMBER
	: D B '2' '_' R O W '_' N U M B E R 
	;

DB2_SERVER_CLASS_NAME
	: D B '2' '_' S E R V E R '_' C L A S S '_' N A M E 
	;

DB2_SQL_ATTR_CURSOR_HOLD
	: D B '2' '_' S Q L '_' A T T R '_' C U R S O R '_' H O L D 
	;

DB2_SQL_ATTR_CURSOR_ROWSET
	: D B '2' '_' S Q L '_' A T T R '_' C U R S O R '_' R O W S E T 
	;

DB2_SQL_ATTR_CURSOR_SCROLLABLE
	: D B '2' '_' S Q L '_' A T T R '_' C U R S O R '_' S C R O L L A B L E 
	;

DB2_SQL_ATTR_CURSOR_SENSITIVITY
	: D B '2' '_' S Q L '_' A T T R '_' C U R S O R '_' S E N S I T I V I T Y 
	;

DB2_SQL_ATTR_CURSOR_TYPE
	: D B '2' '_' S Q L '_' A T T R '_' C U R S O R '_' T Y P E 
	;

DB2_SQLERRD1
	: D B '2' '_' S Q L E R R D '1' 
	;

DB2_SQLERRD2
	: D B '2' '_' S Q L E R R D '2' 
	;

DB2_SQLERRD3
	: D B '2' '_' S Q L E R R D '3' 
	;

DB2_SQLERRD4
	: D B '2' '_' S Q L E R R D '4' 
	;

DB2_SQLERRD5
	: D B '2' '_' S Q L E R R D '5' 
	;

DB2_SQLERRD6
	: D B '2' '_' S Q L E R R D '6' 
	;

DB2_SQLERRD_SET
	: D B '2' '_' S Q L E R R D '_' S E T 
	;

DB2_SQL_NESTING_LEVEL
	: D B '2' '_' S Q L '_' N E S T I N G '_' L E V E L 
	;

DB2_TOKEN_COUNT
	: D B '2' '_' T O K E N '_' C O U N T 
	;

DIAGNOSTICS
	: D I A G N O S T I C S 
	;

MORE_
	: M O R E 
	;

NUMBER
	: N U M B E R 
	;

RETURNED_SQLSTATE
	: R E T U R N E D '_' S Q L S T A T E 
	;

ROW_COUNT
	: R O W '_' C O U N T 
	;

SERVER_NAME
	: S E R V E R '_' N A M E 
	;

STACKED
	: S T A C K E D 
	;

CREATETAB
	: C R E A T E T A B 
	;

CREATETS
	: C R E A T E T S 
	;

DBADM
	: D B A D M 
	;

DBCTRL
	: D B C T R L 
	;

DBMAINT
	: D B M A I N T 
	;

DISPLAYDB
	: D I S P L A Y D B 
	;

IMAGCOPY
	: I M A G C O P Y 
	;

LOAD
	: L O A D 
	;

PACKADM
	: P A C K A D M 
	;

RECOVERDB
	: R E C O V E R D B 
	;

REORG
	: R E O R G 
	;

REPAIR
	: R E P A I R 
	;

STARTDB
	: S T A R T D B 
	;

STATS
	: S T A T S 
	;

STOPDB
	: S T O P D B 
	;

BIND
	: B I N D
	;

ALTERIN
	: A L T E R I N
	;

CREATEIN
	: C R E A T E I N
	;

DROPIN
	: D R O P I N
	;

USAGE
	: U S A G E
	;

ACCESSCTRL
	: A C C E S S C T R L 
	;

BINDADD
	: B I N D A D D 
	;

BINDAGENT
	: B I N D A G E N T 
	;

BSDS
	: B S D S 
	;

CREATEALIAS
	: C R E A T E A L I A S 
	;

CREATEDBA
	: C R E A T E D B A 
	;

CREATEDBC
	: C R E A T E D B C 
	;

CREATE_SECURE_OBJECT
	: C R E A T E '_' S E C U R E '_' O B J E C T 
	;

CREATESG
	: C R E A T E S G 
	;

CREATETMTAB
	: C R E A T E T M T A B 
	;

DATAACCESS
	: D A T A A C C E S S 
	;

DEBUGSESSION
	: D E B U G S E S S I O N 
	;

DISPLAY
	: D I S P L A Y 
	;

MONITOR1
	: M O N I T O R '1' 
	;

MONITOR2
	: M O N I T O R '2' 
	;

RECOVER
	: R E C O V E R 
	;

SQLADM
	: S Q L A D M 
	;

STOPALL
	: S T O P A L L 
	;

STOSPACE
	: S T O S P A C E 
	;

SYSADM
	: S Y S A D M 
	;

SYSCTRL
	: S Y S C T R L 
	;

SYSOPR
	: S Y S O P R 
	;

TRACE
	: T R A C E 
	;

UNLOAD
	: U N L O A D
	;

WRITE
	: W R I T E
	;

DEPENDENT
	: D E P E N D E N T
	;

RETAIN
	: R E T A I N
	;

CURSORS
	: C U R S O R S
	;

PASSWORD
	: P A S S W O R D
	;

HINT
	: H I N T
	;

TRANSFER
	: T R A N S F E R
	;

OWNERSHIP
	: O W N E R S H I P
	;

FOUND
	: F O U N D
	;

SQLERROR
	: S Q L E R R O R
	;

SQLWARNING
	: S Q L W A R N I N G
	;

WITHIN
	: W I T H I N
	;

EMPTY
	: E M P T Y
	;

XMLBINARY
	: X M L B I N A R Y
	;

BASE64
	: B A S E '6' '4'
	;

XMLDECLARATION
	: X M L D E C L A R A T I O N
	;

REFERENCE
	: R E F E R E N C E
	;

RETURNING
	: R E T U R N I N G
	;

//end of generated sql keywords

QUALIFIER
	: Q U A L I F I E R 
	;

DEGREE
	: D E G R E E 
	;

DEFINEBIND
	: D E F I N E B I N D
	;

DEFINERUN
	: D E F I N E R U N
	;

INVOKEBIND
	: I N V O K E B I N D
	;

INVOKERUN
	: I N V O K E R U N
	;

DYNAMICRULES
	: D Y N A M I C R U L E S
	;

ISOLATION
	: I S O L A T I O N
	;

LEVEL
	: L E V E L
	;

OPTHINT
	: O P T H I N T
	;

REOPT
	: R E O P T
	;

DEALLOCATE
	: D E A L L O C A T E
	;

APPLCOMPAT
	: A P P L C O M P A T
	;

DEC_ROUND_CEILING
	: D E C '_' R O U N D '_' C E I L I N G
	;

DEC_ROUND_DOWN
	: D E C '_' R O U N D '_' D O W N
	;

DEC_ROUND_FLOOR
	: D E C '_' R O U N D '_' F L O O R
	;

DEC_ROUND_HALF_DOWN
	: D E C '_' R O U N D '_' H A L F '_' D O W N
	;

DEC_ROUND_HALF_EVEN
	: D E C '_' R O U N D '_' H A L F '_' E V E N
	;

DEC_ROUND_HALF_UP
	: D E C '_' R O U N D '_' H A L F '_' U P
	;

DEC_ROUND_UP
	: D E C '_' R O U N D '_' U P
	;

VALIDATE
	: V A L I D A T E
	;

ROUNDING
	: R O U N D I N G
	;

FORMAT
	: F O R M A T
	;

CLAUSE
	: C L A U S E
	;

REQUIRED
	: R E Q U I R E D
	;

OPTIONAL
	: O P T I O N A L
	;

CONCENTRATE
	: C O N C E N T R A T E
	;

STATEMENTS
	: S T A T E M E N T S
	;

LITERALS
	: L I T E R A L S
	;

OFF
	: O F F
	;

ACCELERATION
	: A C C E L E R A T I O N 
	;

AUTONOMOUS
	: A U T O N O M O U S 
	;

COMMITTED
	: C O M M I T T E D 
	;

CONCURRENT
	: C O N C U R R E N T 
	;

CURRENTLY
	: C U R R E N T L Y 
	;

ELIGIBLE
	: E L I G I B L E 
	;

EUR
	: E U R 
	;

FAILBACK
	: F A I L B A C K 
	;

GET_ACCEL_ARCHIVE
	: G E T '_' A C C E L '_' A R C H I V E 
	;

ISO
	: I S O 
	;

JIS
	: J I S 
	;

OUTCOME
	: O U T C O M E 
	;

RESOLUTION
	: R E S O L U T I O N 
	;

SCHEME
	: S C H E M E 
	;

SESSION
	: S E S S I O N 
	;

USA
	: U S A 
	;

WAIT
	: W A I T 
	;

WAITFORDATA
	: W A I T F O R D A T A 
	;

WRAPPED
	: W R A P P E D
	;

//generated sql scalar functions

ABS
	: A B S 
	;

ABSVAL
	: A B S V A L 
	;

ACOS
	: A C O S 
	;

ADD_DAYS
	: A D D '_' D A Y S 
	;

ADD_MONTHS
	: A D D '_' M O N T H S 
	;

AI_ANALOGY
	: A I '_' A N A L O G Y
	;

AI_SEMANTIC_CLUSTER
	: A I '_' S E M A N T I C '_' C L U S T E R
	;

AI_SIMILARITY
	: A I '_' S I M I L A R I T Y
	;

ARRAY_DELETE
	: A R R A Y '_' D E L E T E 
	;

ARRAY_FIRST
	: A R R A Y '_' F I R S T 
	;

ARRAY_LAST
	: A R R A Y '_' L A S T 
	;

ARRAY_NEXT
	: A R R A Y '_' N E X T 
	;

ARRAY_PRIOR
	: A R R A Y '_' P R I O R 
	;

ARRAY_TRIM
	: A R R A Y '_' T R I M 
	;

ASCII
	: A S C I I 
	;

ASCII_CHR
	: A S C I I '_' C H R 
	;

ASCIISTR
	: A S C I I S T R 
	;

ASCII_STR
	: A S C I I '_' S T R 
	;

ASIN
	: A S I N 
	;

ATAN
	: A T A N 
	;

ATAN2
	: A T A N '2' 
	;

ATANH
	: A T A N H 
	;

BIGINT
	: B I G I N T 
	;

BINARY
	: B I N A R Y 
	;

BITAND
	: B I T A N D 
	;

BITANDNOT
	: B I T A N D N O T 
	;

BITNOT
	: B I T N O T 
	;

BITOR
	: B I T O R 
	;

BITXOR
	: B I T X O R 
	;

BLOB
	: B L O B 
	;

BTRIM
	: B T R I M 
	;

CARDINALITY
	: C A R D I N A L I T Y 
	;

CCSID_ENCODING
	: C C S I D '_' E N C O D I N G 
	;

CEIL
	: C E I L 
	;

CEILING
	: C E I L I N G 
	;

CHAR9
	: C H A R '9' 
	;

CHARACTER_LENGTH
	: C H A R A C T E R '_' L E N G T H 
	;

CHAR_LENGTH
	: C H A R '_' L E N G T H 
	;

CHR
	: C H R 
	;

CLOB
	: C L O B 
	;

COALESCE
	: C O A L E S C E 
	;

COLLATION_KEY
	: C O L L A T I O N '_' K E Y 
	;

COMPARE_DECFLOAT
	: C O M P A R E '_' D E C F L O A T 
	;

COS
	: C O S 
	;

COSH
	: C O S H 
	;

DATE
	: D A T E 
	;

DAYOFMONTH
	: D A Y O F M O N T H 
	;

DAYOFWEEK
	: D A Y O F W E E K 
	;

DAYOFWEEK_ISO
	: D A Y O F W E E K '_' I S O 
	;

DAYOFYEAR
	: D A Y O F Y E A R 
	;

DAYS_BETWEEN
	: D A Y S '_' B E T W E E N 
	;

DBCLOB
	: D B C L O B 
	;

DEC
	: D E C 
	;

DECFLOAT
	: D E C F L O A T 
	;

DECFLOAT_FORMAT
	: D E C F L O A T '_' F O R M A T 
	;

DECFLOAT_SORTKEY
	: D E C F L O A T '_' S O R T K E Y 
	;

DECIMAL
	: D E C I M A L 
	;

DECODE
	: D E C O D E 
	;

DECRYPT_BINARY
	: D E C R Y P T '_' B I N A R Y 
	;

DECRYPT_BIT
	: D E C R Y P T '_' B I T 
	;

DECRYPT_CHAR
	: D E C R Y P T '_' C H A R 
	;

DECRYPT_DATAKEY_BIGINT
	: D E C R Y P T '_' D A T A K E Y '_' B I G I N T 
	;

DECRYPT_DATAKEY_BIT
	: D E C R Y P T '_' D A T A K E Y '_' B I T 
	;

DECRYPT_DATAKEY_CLOB
	: D E C R Y P T '_' D A T A K E Y '_' C L O B 
	;

DECRYPT_DATAKEY_DBCLOB
	: D E C R Y P T '_' D A T A K E Y '_' D B C L O B 
	;

DECRYPT_DATAKEY_DECIMAL
	: D E C R Y P T '_' D A T A K E Y '_' D E C I M A L 
	;

DECRYPT_DATAKEY_INTEGER
	: D E C R Y P T '_' D A T A K E Y '_' I N T E G E R 
	;

DECRYPT_DATAKEY_VARCHAR
	: D E C R Y P T '_' D A T A K E Y '_' V A R C H A R 
	;

DECRYPT_DATAKEY_VARGRAPHIC
	: D E C R Y P T '_' D A T A K E Y '_' V A R G R A P H I C 
	;

DECRYPT_DB
	: D E C R Y P T '_' D B 
	;

DEGREES
	: D E G R E E S 
	;

DIFFERENCE
	: D I F F E R E N C E 
	;

DIGITS
	: D I G I T S 
	;

DOUBLE_PRECISION
	: D O U B L E '_' P R E C I S I O N 
	;

DSN_XMLVALIDATE
	: D S N '_' X M L V A L I D A T E 
	;

EBCDIC_CHR
	: E B C D I C '_' C H R 
	;

EBCDIC_STR
	: E B C D I C '_' S T R 
	;

ENCRYPT_DATAKEY
	: E N C R Y P T '_' D A T A K E Y 
	;

ENCRYPT_TDES
	: E N C R Y P T '_' T D E S 
	;

EXP
	: E X P 
	;

EXTRACT
	: E X T R A C T 
	;

FLOAT
	: F L O A T 
	;

FLOOR
	: F L O O R 
	;

GENERATE_UNIQUE
	: G E N E R A T E '_' U N I Q U E 
	;

GENERATE_UNIQUE_BINARY
	: G E N E R A T E '_' U N I Q U E '_' B I N A R Y 
	;

GETHINT
	: G E T H I N T 
	;

GETVARIABLE
	: G E T V A R I A B L E 
	;

GRAPHIC
	: G R A P H I C 
	;

GREATEST
	: G R E A T E S T 
	;

HASH
	: H A S H 
	;

HASH_CRC32
	: H A S H '_' C R C '3' '2' 
	;

HASH_MD5
	: H A S H '_' M D '5' 
	;

HASH_SHA1
	: H A S H '_' S H A '1' 
	;

HASH_SHA256
	: H A S H '_' S H A '2' '5' '6' 
	;

HEX
	: H E X 
	;

IDENTITY_VAL_LOCAL
	: I D E N T I T Y '_' V A L '_' L O C A L 
	;

IFNULL
	: I F N U L L 
	;

INSTR
	: I N S T R 
	;

INT
	: I N T 
	;

INTEGER
	: I N T E G E R 
	;

INTERPRET
	: I N T E R P R E T
	;

JULIAN_DAY
	: J U L I A N '_' D A Y 
	;

LAST_DAY
	: L A S T '_' D A Y 
	;

LCASE
	: L C A S E 
	;

LEAST
	: L E A S T 
	;

LENGTH
	: L E N G T H 
	;

LN
	: L N 
	;

LOCATE
	: L O C A T E 
	;

LOCATE_IN_STRING
	: L O C A T E '_' I N '_' S T R I N G 
	;

LOG10
	: L O G '1' '0' 
	;

LOWER
	: L O W E R 
	;

LPAD
	: L P A D 
	;

LTRIM
	: L T R I M 
	;

MAX
	: M A X 
	;

MAX_CARDINALITY
	: M A X '_' C A R D I N A L I T Y 
	;

MIDNIGHT_SECONDS
	: M I D N I G H T '_' S E C O N D S 
	;

MIN
	: M I N 
	;

MINUTE
	: M I N U T E 
	;

MOD
	: M O D 
	;

MONTHS_BETWEEN
	: M O N T H S '_' B E T W E E N 
	;

MQREAD
	: M Q R E A D 
	;

MQREADCLOB
	: M Q R E A D C L O B 
	;

MQRECEIVE
	: M Q R E C E I V E 
	;

MQRECEIVECLOB
	: M Q R E C E I V E C L O B 
	;

MQSEND
	: M Q S E N D 
	;

MULTIPLY_ALT
	: M U L T I P L Y '_' A L T 
	;

NEXT_DAY
	: N E X T '_' D A Y 
	;

NEXT_MONTH
	: N E X T '_' M O N T H 
	;

NORMALIZE_DECFLOAT
	: N O R M A L I Z E '_' D E C F L O A T 
	;

NORMALIZE_STRING
	: N O R M A L I Z E '_' S T R I N G 
	;

NULLIF
	: N U L L I F 
	;

NVL
	: N V L 
	;

OVERLAY
	: O V E R L A Y 
	;

PACK
	: P A C K 
	;

POSITION
	: P O S I T I O N 
	;

POSSTR
	: P O S S T R 
	;

POW
	: P O W 
	;

POWER
	: P O W E R 
	;

QUANTIZE
	: Q U A N T I Z E 
	;

QUARTER
	: Q U A R T E R 
	;

RADIANS
	: R A D I A N S 
	;

RAISE_ERROR
	: R A I S E '_' E R R O R 
	;

RAND
	: R A N D 
	;

RANDOM
	: R A N D O M 
	;

REAL
	: R E A L 
	;

REGEXP_COUNT
	: R E G E X P '_' C O U N T 
	;

REGEXP_INSTR
	: R E G E X P '_' I N S T R 
	;

REGEXP_LIKE
	: R E G E X P '_' L I K E 
	;

REGEXP_REPLACE
	: R E G E X P '_' R E P L A C E 
	;

REGEXP_SUBSTR
	: R E G E X P '_' S U B S T R 
	;

REPLACE
	: R E P L A C E 
	;

RID
	: R I D 
	;

ROUND
	: R O U N D 
	;

ROUND_TIMESTAMP
	: R O U N D '_' T I M E S T A M P 
	;

ROWID
	: R O W I D 
	;

RPAD
	: R P A D 
	;

RTRIM
	: R T R I M 
	;

SCORE
	: S C O R E 
	;

SIGN
	: S I G N 
	;

SIN
	: S I N 
	;

SINH
	: S I N H 
	;

SMALLINT
	: S M A L L I N T 
	;

SOAPHTTPC
	: S O A P H T T P C 
	;

SOAPHTTPNC
	: S O A P H T T P N C 
	;

SOAPHTTPNV
	: S O A P H T T P N V 
	;

SOAPHTTPV
	: S O A P H T T P V 
	;

SOUNDEX
	: S O U N D E X 
	;

SPACE
	: S P A C E 
	;

SQRT
	: S Q R T 
	;

STRIP
	: S T R I P 
	;

STRLEFT
	: S T R L E F T 
	;

STRPOS
	: S T R P O S 
	;

STRRIGHT
	: S T R R I G H T 
	;

SUBSTR
	: S U B S T R 
	;

SUBSTRING
	: S U B S T R I N G 
	;

TAN
	: T A N 
	;

TANH
	: T A N H 
	;

TIME
	: T I M E 
	;

TIMESTAMP
	: T I M E S T A M P 
	;

TIMESTAMPADD
	: T I M E S T A M P A D D 
	;

TIMESTAMPDIFF
	: T I M E S T A M P D I F F 
	;

TIMESTAMP_FORMAT
	: T I M E S T A M P '_' F O R M A T 
	;

TIMESTAMP_ISO
	: T I M E S T A M P '_' I S O 
	;

TIMESTAMP_TZ
	: T I M E S T A M P '_' T Z 
	;

TO_CHAR
	: T O '_' C H A R 
	;

TO_CLOB
	: T O '_' C L O B 
	;

TO_DATE
	: T O '_' D A T E 
	;

TO_NUMBER
	: T O '_' N U M B E R 
	;

TOTALORDER
	: T O T A L O R D E R 
	;

TO_TIMESTAMP
	: T O '_' T I M E S T A M P 
	;

TRANSLATE
	: T R A N S L A T E 
	;

TRIM
	: T R I M 
	;

TRIM_ARRAY
	: T R I M '_' A R R A Y 
	;

TRUNC
	: T R U N C 
	;

TRUNC_TIMESTAMP
	: T R U N C '_' T I M E S T A M P 
	;

UCASE
	: U C A S E 
	;

UNICODE
	: U N I C O D E 
	;

UNICODE_STR
	: U N I C O D E '_' S T R 
	;

UNISTR
	: U N I S T R 
	;

UPPER
	: U P P E R 
	;

VARBINARY
	: V A R B I N A R Y 
	;

VARCHAR
	: V A R C H A R 
	;

VARCHAR9
	: V A R C H A R '9' 
	;

VARCHAR_BIT_FORMAT
	: V A R C H A R '_' B I T '_' F O R M A T 
	;

VARCHAR_FORMAT
	: V A R C H A R '_' F O R M A T 
	;

VARGRAPHIC
	: V A R G R A P H I C 
	;

VERIFY_GROUP_FOR_USER
	: V E R I F Y '_' G R O U P '_' F O R '_' U S E R 
	;

VERIFY_ROLE_FOR_USER
	: V E R I F Y '_' R O L E '_' F O R '_' U S E R 
	;

VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER
	: V E R I F Y '_' T R U S T E D '_' C O N T E X T '_' R O L E '_' F O R '_' U S E R 
	;

WEEK
	: W E E K 
	;

WEEK_ISO
	: W E E K '_' I S O 
	;

WRAP
	: W R A P 
	;

XMLATTRIBUTES
	: X M L A T T R I B U T E S 
	;

XMLCOMMENT
	: X M L C O M M E N T 
	;

XMLCONCAT
	: X M L C O N C A T 
	;

XMLDOCUMENT
	: X M L D O C U M E N T 
	;

XMLELEMENT
	: X M L E L E M E N T 
	;

XMLFOREST
	: X M L F O R E S T 
	;

XMLMODIFY
	: X M L M O D I F Y 
	;

XMLPARSE
	: X M L P A R S E 
	;

XMLPI
	: X M L P I 
	;

XMLQUERY
	: X M L Q U E R Y 
	;

XMLSERIALIZE
	: X M L S E R I A L I Z E 
	;

XMLTEXT
	: X M L T E X T 
	;

XMLXSROBJECTID
	: X M L X S R O B J E C T I D 
	;

XSLTRANSFORM
	: X S L T R A N S F O R M 
	;

//end of generated sql scalar functions

//generated sql special registers

/*
2023-12-04 Maarten van Haasteren found that DB2 tolerates both
spaces and newlines between CURRENT and, well, all of the 
following.
*/

CURRENT_ACCELERATOR
	: C U R R E N T (WS | NEWLINE)+ A C C E L E R A T O R 
	;

CURRENT_APPLICATION_COMPATIBILITY
	: C U R R E N T (WS | NEWLINE)+ A P P L I C A T I O N (WS | NEWLINE)+ C O M P A T I B I L I T Y 
	;

CURRENT_APPLICATION_ENCODING_SCHEME
	: C U R R E N T (WS | NEWLINE)+ (A P P L I C A T I O N (WS | NEWLINE)+)? E N C O D I N G (WS | NEWLINE)+ S C H E M E 
	;

CURRENT_CLIENT_ACCTNG
	: C U R R E N T (WS | NEWLINE)+ C L I E N T '_' A C C T N G 
	;

CURRENT_CLIENT_APPLNAME
	: C U R R E N T (WS | NEWLINE)+ C L I E N T '_' A P P L N A M E 
	;

CURRENT_CLIENT_CORR_TOKEN
	: C U R R E N T (WS | NEWLINE)+ C L I E N T '_' C O R R '_' T O K E N 
	;

CURRENT_CLIENT_USERID
	: C U R R E N T (WS | NEWLINE)+ C L I E N T '_' U S E R I D 
	;

CURRENT_CLIENT_WRKSTNNAME
	: C U R R E N T (WS | NEWLINE)+ C L I E N T '_' W R K S T N N A M E 
	;

CURRENT_DATE
	: C U R R E N T ('_' | (WS | NEWLINE)+) D A T E 
	;

CURRENT_DEBUG_MODE
	: C U R R E N T (WS | NEWLINE)+ D E B U G (WS | NEWLINE)+ M O D E 
	;

CURRENT_DECFLOAT_ROUNDING_MODE
	: C U R R E N T (WS | NEWLINE)+ D E C F L O A T (WS | NEWLINE)+ R O U N D I N G (WS | NEWLINE)+ M O D E 
	;

CURRENT_DEGREE
	: C U R R E N T (WS | NEWLINE)+ D E G R E E 
	;

CURRENT_EXPLAIN_MODE
	: C U R R E N T (WS | NEWLINE)+ E X P L A I N (WS | NEWLINE)+ M O D E 
	;

CURRENT_GET_ACCEL_ARCHIVE
	: C U R R E N T (WS | NEWLINE)+ G E T '_' A C C E L '_' A R C H I V E 
	;

CURRENT_LOCALE_LC_CTYPE
	: C U R R E N T ('_' | (WS | NEWLINE)+ | ((WS | NEWLINE)+ L O C A L E (WS | NEWLINE)+)) L C '_' C T Y P E 
	;

CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION
	: C U R R E N T (WS | NEWLINE)+ M A I N T A I N E D (WS | NEWLINE)+ (T A B L E (WS | NEWLINE)+)? T Y P E S (WS | NEWLINE)+ (F O R (WS | NEWLINE)+ O P T I M I Z A T I O N)? 
	;

CURRENT_MEMBER
	: C U R R E N T (WS | NEWLINE)+ M E M B E R 
	;

CURRENT_OPTIMIZATION_HINT
	: C U R R E N T (WS | NEWLINE)+ O P T I M I Z A T I O N (WS | NEWLINE)+ H I N T 
	;

CURRENT_PACKAGE_PATH
	: C U R R E N T (WS | NEWLINE)+ P A C K A G E (WS | NEWLINE)+ P A T H 
	;

CURRENT_PACKAGESET
	: C U R R E N T (WS | NEWLINE)+ P A C K A G E S E T 
	;

CURRENT_PATH
	: C U R R E N T (WS | NEWLINE)+ P A T H 
	;

CURRENT_PRECISION
	: C U R R E N T (WS | NEWLINE)+ P R E C I S I O N 
	;

CURRENT_QUERY_ACCELERATION
	: C U R R E N T (WS | NEWLINE)+ Q U E R Y (WS | NEWLINE)+ A C C E L E R A T I O N 
	;

CURRENT_QUERY_ACCELERATION_WAITFORDATA
	: C U R R E N T (WS | NEWLINE)+ Q U E R Y (WS | NEWLINE)+ A C C E L E R A T I O N (WS | NEWLINE)+ W A I T F O R D A T A 
	;

CURRENT_REFRESH_AGE
	: C U R R E N T (WS | NEWLINE)+ R E F R E S H (WS | NEWLINE)+ A G E 
	;

CURRENT_ROUTINE_VERSION
	: C U R R E N T (WS | NEWLINE)+ R O U T I N E (WS | NEWLINE)+ V E R S I O N 
	;

CURRENT_RULES
	: C U R R E N T (WS | NEWLINE)+ R U L E S 
	;

CURRENT_SCHEMA
	: C U R R E N T ('_' | (WS | NEWLINE)+) S C H E M A 
	;

CURRENT_SERVER
	: C U R R E N T (WS | NEWLINE)+ S E R V E R 
	;

CURRENT_SQLID
	: C U R R E N T (WS | NEWLINE)+ S Q L I D 
	;

CURRENT_TEMPORAL_BUSINESS_TIME
	: C U R R E N T (WS | NEWLINE)+ T E M P O R A L (WS | NEWLINE)+ B U S I N E S S '_' T I M E 
	;

CURRENT_TEMPORAL_SYSTEM_TIME
	: C U R R E N T (WS | NEWLINE)+ T E M P O R A L (WS | NEWLINE)+ S Y S T E M '_' T I M E 
	;

CURRENT_TIME
	: C U R R E N T ('_' | (WS | NEWLINE)+) T I M E 
	;

CURRENT_TIMESTAMP
	: C U R R E N T ('_' | (WS | NEWLINE)+) T I M E S T A M P 
	;

CURRENT_TIME_ZONE
	: C U R R E N T (WS | NEWLINE)+ T I M E (WS | NEWLINE)* Z O N E 
	;

ENCRYPTION_PASSWORD
	: E N C R Y P T I O N (WS | NEWLINE)+ P A S S W O R D 
	;

SESSION_TIME_ZONE
	: S E S S I O N (WS | NEWLINE)* T I M E (WS | NEWLINE)* Z O N E 
	;

SESSION_USER
	: S E S S I O N '_' U S E R 
	;

USER
	: U S E R 
	;

//end of generated sql special registers

//sql table functions

ADMIN_TASK_LIST
	: A D M I N '_' T A S K '_' L I S T
	;

ADMIN_TASK_OUTPUT
	: A D M I N '_' T A S K '_' O U T P U T
	;

ADMIN_TASK_STATUS
	: A D M I N '_' T A S K '_' S T A T U S
	;

BLOCKING_THREADS
	: B L O C K I N G '_' T H R E A D S
	;

MQREADALL
	: M Q R E A D A L L
	;

MQREADALLCLOB
	: M Q R E A D A L L C L O B
	;

MQRECEIVEALL
	: M Q R E C E I V E A L L
	;

MQRECEIVEALLCLOB
	: M Q R E C E I V E A L L C L O B
	;

XMLTABLE
	: X M L T A B L E
	;

//end of sql table functions
/*
G_CHAR
	: G
	;

K_CHAR
	: K
	;

M_CHAR
	: M
	;
*/

WHITESPACE
	: W H I T E S P A C E
	;

TIMEOUT
	: T I M E O U T
	;

/*
Noted by Martijn Rutte 2023-06-05, NEWLINE can be present
between END and CASE.

TODO: might need this for other scope terminators
*/
END_CASE
	: END (WS | NEWLINE)+ CASE
	;

END_FOR
	: END WS+ FOR
	;

END_IF
	: END WS+ IF
	;

END_LOOP
	: END WS+ LOOP
	;

END_REPEAT
	: END WS+ REPEAT
	;

END_WHILE
	: END WS+ WHILE
	;

SQLCODE
	: S Q L C O D E
	;

CONSTANT
	: C O N S T A N T
	;

APPLCOMPAT_LEVEL
	: V INTEGERLITERAL R INTEGERLITERAL (M INTEGERLITERAL)?
	;

SQL_STATEMENT_TERMINATOR
	: . 
	{getText().equals(statementTerminator)}?
	;

/*
Changed lexer rule SQLIDENTIFIER from...

	[a-zA-Z0-9@#$\-_]+

...to...

	[a-zA-Z0-9@#$_]+

...to prevent syntax such as...

	LENGTH('XYZ') -LENGTH('X')

...from causing havoc as -LENGTH was recognized as an SQLIDENTIFIER instead
of a MINUS token and a LENGTH token.

An ordinary SQL Identifier begins with an upper case character and
can contain underscores.  But apparently DB2 tolerates lower case
characters and will "fold" them to upper case.  

The national characters are there because they may be valid as host 
identifiers depending on the host language.  One way around this
would be to have two different lexer rules, one that includes the
national characters and one that does not; the parser rule for host
identifiers could then refer to both.  I'm not sure this is necessary.
*/
SQLIDENTIFIER
	: [a-zA-Z0-9@#$_]+
	{
		if (getText().equalsIgnoreCase("DSNUTILV")
		||  getText().equalsIgnoreCase("DSNUTILU")
		||  getText().equalsIgnoreCase("DSNUTILS")) {
			dsnutil = true;
			dsnutilLoad = false;
			//System.out.println("dsnutil matched");
		}
	}
	;

UNIDENTIFIED
	: .
	;

mode DSNUTIL_MODE;
/*
Why are we here?

The SYSPROC.DSNUTILx stored procedures are very forgiving of the
content of their third parameter.  It may look like this...

	'TEMPLATE REOCP DSN(''X&DB(1,3)..&DB..&SN..XXXX.DB2&IC.IC.&UQ.'')'

...or...

	'TEMPLATE REOCP DSN ''X&DB(1,3)..&DB..&SN..XXXX.DB2&IC.IC.&UQ.'''
	
...or...

	'TEMPLATE REOCP DSN 'X&DB(1,3)..&DB..&SN..XXXX.DB2&IC.IC.&UQ.''
	
...or...

	'TEMPLATE REOCP DSN X&DB(1,3)..&DB..&SN..XXXX.DB2&IC.IC.&UQ.'

...or...

	  'TEMPLATE REOCP DSN(''X&DB(1,3)..&DB..&SN..XXXX.DB2&IC.IC.&UQ.'') UNIT VTSSALL VOLCNT 99 RETPD 17 STACK YES
        TEMPLATE REODC DSN(''X&DB(1,3)..&DB..&SN..P&PA..DB2XX(+1)'') GDGLIMIT 7 DISP (NEW,CATLG,DELETE) DATACLAS DCFILE
        TEMPLATE REOPU DSN(''X&DB(1,3)..&DB..&SN..P&PA..DB2YY(+1)'') GDGLIMIT 7 DISP (NEW,CATLG,DELETE) DATACLAS DCFILE  
 REORG TABLESPACE DB01.TS01 SHRLEVEL CHANGE LOG NO NOSYSREC COPYDDN (REOCP) SORTDEVT SYSDA SORTNUM 40 SORTKEYS  DRAIN_WAIT 30 RETRY 10 RETRY_DELAY 180 MAXRO 50 DRAIN ALL LONGLOG CONTINUE TIMEOUT TERM  FASTSWITCH YES  DISCARD FROM TABLE T1 WHEN (C1 LIKE ') ; "%') STATISTICS TABLE(ALL) INDEX(ALL) KEYCARD FREQVAL NUMCOLS 5 COUNT 10
 REORG TABLESPACE DB01.TS02 SHRLEVEL CHANGE LOG NO NOSYSREC COPYDDN (REOCP) SORTDEVT SYSDA SORTNUM 40 SORTKEYS  DRAIN_WAIT 30 RETRY 10 RETRY_DELAY 180 MAXRO 50 DRAIN ALL LONGLOG CONTINUE TIMEOUT TERM  FASTSWITCH YES  DISCARD FROM TABLE T2 WHEN (C1 LIKE '( , )) , %') STATISTICS TABLE(ALL) INDEX(ALL) KEYCARD FREQVAL NUMCOLS 5 COUNT 10
 REORG TABLESPACE DB01.TS03 SHRLEVEL CHANGE LOG NO NOSYSREC COPYDDN (REOCP) SORTDEVT SYSDA SORTNUM 40 SORTKEYS  DRAIN_WAIT 30 RETRY 10 RETRY_DELAY 180 MAXRO 50 DRAIN ALL LONGLOG CONTINUE TIMEOUT TERM  FASTSWITCH YES  DISCARD FROM TABLE T3 WHEN (C1 LIKE X'416C') STATISTICS TABLE(ALL) INDEX(ALL) KEYCARD FREQVAL NUMCOLS 5 COUNT 10
 '

...and trying to write a single ANTLR rule that matches all of that
third parameter and stops at the terminating apostrophe has proven 
difficult.  Several attempts, including embedding a state machine to
scan for the terminating closing parenthesis, failed.  If this is not
self-evident, pay attention to what appear to be opening and closing
apostrophes in each example.

So here we are, knowing that we are processing the third parameter
to SYSPROC.DSNUTILx, and that the opening apostrophe (or quote) has
been detected.

Things get a little messy from this point on.  Lots of modes, and 
transferring between them is done... creatively.

Remember to add any new keywords to the dsnutilUCSKeyword parser rule,
to catch anyone who wants to name their list "LIST" or their workddn
"WORKDDN" or other such perfectly legitimate.

This is essentially an "embedded" lexer just for the third parameter
to SYSPROC.DSNUTILx.  We also have a corresponding "embedded"
parser just for SYSPROC.DSNUTILx's third parameter.
*/

DSNUTIL_DOUBLE_APOS
	: '\'\''
	;

DSNUTIL_CLOSE_APOS
	: '\''
	{
		dsnutil = false;
		dsnutilArgc = 0;
		dsnutil_dsn_ws_char = false;
	}
	->popMode
	;

DSNUTIL_DOUBLE_QUOTE
	: '""'
	;

DSNUTIL_CLOSE_QUOTE
	: '"'
	{
		dsnutil = false;
		dsnutilArgc = 0;
		dsnutil_dsn_ws_char = false;
	}
	->popMode
	;

DSNUTIL_LPAREN
	: LPAREN
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
	}
	->pushMode(DSNUTIL_PAREN_MODE)
	;

DSNUTIL_RPAREN
	: RPAREN
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
	}
	;

DSNUTIL_EQUAL
	: '='
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_NOT_EQUAL
	: '<>'
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_BACKUP
	: B A C K U P
	;

DSNUTIL_SYSTEM
	: SYSTEM
	;

DSNUTIL_FULL
	: FULL
	;

DSNUTIL_ALTERNATE_CP
	: A L T E R N A T E '_' C P
	;

DSNUTIL_DBBSG
	: D B B S G
	;

DSNUTIL_LGBSG
	: L G B S G
	;

DSNUTIL_ESTABLISH
	: E S T A B L I S H
	;

DSNUTIL_END
	: END
	;

DSNUTIL_FCINCREMENTAL
	: F C I N C R E M E N T A L
	;

DSNUTIL_FORCE
	: F O R C E
	;

DSNUTIL_DUMP
	: D U M P
	;

DSNUTIL_DUMPONLY
	: D U M P O N L Y
	;

DSNUTIL_DUMPCLASS
	: D U M P C L A S S
	;

DSNUTIL_TOKEN
	: T O K E N
	;

DSNUTIL_CATMAINT
	: C A T M A I N T
	;

DSNUTIL_UPDATE
	: UPDATE
	;

DSNUTIL_LEVEL
	: L E V E L
	;

DSNUTIL_UNLDDN
	: U N L D D N
	;

DSNUTIL_SCHEMA
	: SCHEMA
	;

DSNUTIL_SWITCH
	: S W I T C H
	;

DSNUTIL_OWNER_FROM
	: OWNER (WS | NEWLINE)+ FROM
	;

DSNUTIL_TO_ROLE
	: TO (WS | NEWLINE)+ ROLE
	;

DSNUTIL_VCAT
	: V C A T
	;

DSNUTIL_UTILX
	: U T I L X
	;

DSNUTIL_BASIC
	: B A S I C
	;

DSNUTIL_EXTENDED
	: E X T E N D E D
	;

DSNUTIL_LIBRARY
	: L I B R A R Y
	;

DSNUTIL_PDS
	: P D S
	;

DSNUTIL_HFS
	: H F S
	;

DSNUTIL_NULL
	: N U L L
	;

DSNUTIL_LARGE
	: L A R G E
	;

DSNUTIL_EXTREQ
	: E X T R E Q
	;

DSNUTIL_EXTPREF
	: E X T P R E F
	;

DSNUTIL_EATTR
	: E A T T R
	;

DSNUTIL_RESET
	: RESET
	;

DSNUTIL_RESET_ACCESSPATH
	: DSNUTIL_RESET (WS | NEWLINE)+ DSNUTIL_ACCESSPATH
	;

DSNUTIL_WHEN
	: WHEN
	{
		if (dsnutilLoad) {
			break;
		} else {
			pushMode(DSNUTIL_WHEN_MODE);
		}
	}
	;

DSNUTIL_EXPDL
	: E X P D L
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_COLDEL
	: C O L D E L
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_CHARDEL
	: C H A R D E L
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_DECPT
	: D E C P T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_WS
	: (WS | NEWLINE)+
	->channel(HIDDEN)
	;

DSNUTIL_DSNTYPE
	: D S N T Y P E
	;

DSNUTIL_DSNUM
	: D S N U M
	;

DSNUTIL_SHOWDSNS
	: S H O W D S N S
	;

DSNUTIL_DSN
	: D S N
	->pushMode(DSNUTIL_DSN_MODE)
	;

DSNUTIL_MODELDCB
	: M O D E L D C B
	->pushMode(DSNUTIL_DSN_MODE)
	;

DSNUTIL_FROMCOPY
	: F R O M C O P Y
	->pushMode(DSNUTIL_DSN_MODE)
	;

DSNUTIL_TABLESPACESET
	: T A B L E S P A C E S E T
	;

DSNUTIL_TABLESPACES
	: T A B L E S P A C E S
	;

DSNUTIL_TABLESPACE
	: T A B L E S P A C E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

/*
In this case, we have the TABLESPACE token followed
by the LIST token (probably) in a REORG TABLESPACE
command.  We're setting up for the next token, which
is a list name and thus we behave as we do for the
LIST token.
*/
DSNUTIL_TABLESPACE_LIST
	: T A B L E S P A C E (WS | NEWLINE)+ L I S T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_INDEXSPACES
	: I N D E X S P A C E S
	;

DSNUTIL_INDEXSPACE
	: I N D E X S P A C E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

/*
In this case, we have the INDEXSPACE token followed
by the LIST token (probably) in a REBUILD INDEX
command.  We're setting up for the next token, which
is a list name and thus we behave as we do for the
LIST token.
*/
DSNUTIL_INDEXSPACE_LIST
	: I N D E X S P A C E (WS | NEWLINE)+ L I S T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_INDEXES
	: I N D E X E S
	;

DSNUTIL_INDEX
	: I N D E X
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

/*
In this case, we have the INDEX token followed
by the LIST token (probably) in a REBUILD INDEX
command.  We're setting up for the next token, which
is a list name and thus we behave as we do for the
LIST token.
*/
DSNUTIL_INDEX_LIST
	: I N D E X (WS | NEWLINE)+ L I S T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_MAPPINGTABLE
	: M A P P I N G T A B L E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_MAPPINGDATABASE
	: M A P P I N G D A T A B A S E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_STOGROUP
	: S T O G R O U P
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_TABLESAMPLE
	: T A B L E S A M P L E
	;

DSNUTIL_REPEATABLE
	: R E P E A T A B L E
	;

DSNUTIL_TABLES
	: T A B L E S
	;

DSNUTIL_TABLE
	: T A B L E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_DATABASE
	: D A T A B A S E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_OBD
	: O B D
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_FROM_TABLESPACE
	: FROM (WS | NEWLINE)+ TABLESPACE
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_FROM_TABLE
	: FROM (WS | NEWLINE)+ TABLE
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_FROMVOLUME
	: F R O M V O L U M E
	;

DSNUTIL_FROMCOPYDDN
	: F R O M C O P Y D D N
	;

DSNUTIL_FROM
	: FROM
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

/*
Documentation does not mention apostrophes around the
possible timestamp literal following these next 2 tokens.  Examples
do not show apostrophes, but it's possible they are allowed.
*/

DSNUTIL_DEADLINE
	: D E A D L I N E
	;

DSNUTIL_SWITCHTIME
	: S W I T C H T I M E
	;

DSNUTIL_EXEC_SQL
	: E X E C (WS | NEWLINE)+ S Q L
	{dsnutilEXECSQL = true;}
	->pushMode(DEFAULT_MODE)
	;

DSNUTIL_TRACEID
	: T R A C E I D
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_TORBA
	: T O R B A
	;

DSNUTIL_TOLOGPOINT
	: T O L O G P O I N T
	;

DSNUTIL_RESTOREBEFORE
	: R E S T O R E B E F O R E
	;

DSNUTIL_PAGE
	: P A G E
	;

DSNUTIL_ROWID
	: R O W I D
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_RBALRSN_CONVERSION
	: R B A L R S N '_' C O N V E R S I O N
	;

DSNUTIL_SETCURRENTVERSION
	: S E T C U R R E N T V E R S I O N
	;

DSNUTIL_VERSION
	: V E R S I O N
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_DOCID
	: D O C I D
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_CONST
	: C O N S T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_IMPLICIT_TZ
	: I M P L I C I T '_' T Z
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_KEYCARD
	: K E Y C A R D
	;

DSNUTIL_SORTKEYS
	: S O R T K E Y S
	;

DSNUTIL_SHOWKEYLABEL
	: S H O W K E Y L A B E L
	;

DSNUTIL_KEY
	: K E Y
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_DATACLAS
	: D A T A C L A S
	;

DSNUTIL_MGMTCLAS
	: M G M T C L A S
	;

DSNUTIL_STORCLAS
	: S T O R C L A S
	;

DSNUTIL_DATA_ONLY
	: D A T A (WS | NEWLINE)+ O N L Y
	;

DSNUTIL_CHECK_DATA
	: C H E C K (WS | NEWLINE)+ D A T A
	;

DSNUTIL_CHECK_INDEX
	: C H E C K (WS | NEWLINE)+ I N D E X
	;

DSNUTIL_CHECK_INDEX_LIST
	: C H E C K (WS | NEWLINE)+ I N D E X (WS | NEWLINE)+ L I S T
	;

DSNUTIL_CHECK_INDEX_OPEN_PAREN
	: C H E C K (WS | NEWLINE)+ I N D E X (WS | NEWLINE)* '('
	->pushMode(DSNUTIL_PAREN_MODE)
	;

DSNUTIL_CHECK_INDEX_ALL
	: C H E C K (WS | NEWLINE)+ I N D E X (WS | NEWLINE)* '(' + (WS | NEWLINE)* A L L (WS | NEWLINE)* ')'
	;

DSNUTIL_CHECK_LOB
	: C H E C K (WS | NEWLINE)+ L O B
	;

DSNUTIL_CHANGELIMIT
	: C H A N G E L I M I T
	;

DSNUTIL_REPORTONLY
	: R E P O R T O N L Y
	;

DSNUTIL_COPYDDN
	: C O P Y D D N
	;

DSNUTIL_RECOVERYDDN
	: R E C O V E R Y D D N
	;

DSNUTIL_FILTERDDN
	: F I L T E R D D N
	;

DSNUTIL_CONCURRENT
	: C O N C U R R E N T
	;

DSNUTIL_COPY
	: C O P Y
	;

DSNUTIL_TAPEUNITS
	: T A P E U N I T S
	;

DSNUTIL_CHECKPAGE
	: C H E C K P A G E
	;

DSNUTIL_NOCHECKPAGE
	: N O C H E C K P A G E
	;

DSNUTIL_SYSTEMPAGES
	: S Y S T E M P A G E S
	;

DSNUTIL_FLASHCOPY
	: F L A S H C O P Y
	;

DSNUTIL_CONSISTENT
	: C O N S I S T E N T
	;

DSNUTIL_FCCOPYDDN
	: F C C O P Y D D N
	;

DSNUTIL_SKIP_LOCKED_DATA
	: S K I P (WS | NEWLINE)+ LOCKED (WS | NEWLINE)+ DATA
	;

DSNUTIL_UNLOAD_DATA
	: U N L O A D (WS | NEWLINE)+ DATA
	;

DSNUTIL_DATA
	: D A T A
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_OFFSET
	: O F F S E T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_LENGTH
	: L E N G T H
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_INSERTVERSIONPAGES
	: I N S E R T V E R S I O N P A G E S
	;

DSNUTIL_PAGES
	: P A G E S
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_DBID
	: D B I D
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_TEXT
	: T E X T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_PART
	: P A R T
	;

DSNUTIL_INCLUDE
	: I N C L U D E
	;

DSNUTIL_XML
	: X M L
	;

DSNUTIL_CLONE
	: C L O N E
	;

DSNUTIL_SHRLEVEL
	: S H R L E V E L
	;

DSNUTIL_REFERENCE
	: R E F E R E N C E
	;

DSNUTIL_CHANGE
	: C H A N G E
	;

DSNUTIL_DRAIN_WAIT
	: D R A I N '_' W A I T
	;

DSNUTIL_RETRY
	: R E T R Y
	;

DSNUTIL_RETRY_DELAY
	: R E T R Y '_' D E L A Y
	;

DSNUTIL_SCOPE
	: S C O P E
	;

DSNUTIL_PENDING
	: P E N D I N G
	;

DSNUTIL_AUXONLY
	: A U X O N L Y
	;

DSNUTIL_ALL
	: A L L
	;

DSNUTIL_REFONLY
	: R E F O N L Y
	;

DSNUTIL_XMLSCHEMAONLY
	: X M L S C H E M A O N L Y
	;

DSNUTIL_AUXERROR
	: A U X E R R O R
	;

DSNUTIL_REPORT
	: R E P O R T
	;

DSNUTIL_INVALIDATE
	: I N V A L I D A T E
	;

DSNUTIL_LOBERROR
	: L O B E R R O R
	;

DSNUTIL_XMLERROR
	: X M L E R R O R
	;

DSNUTIL_FOR
	: F O R
	;

DSNUTIL_EXCEPTION
	: E X C E P T I O N
	->pushMode(DSNUTIL_EXCEPTION_MODE)
	;

DSNUTIL_DELETE
	: D E L E T E
	;

DSNUTIL_YES
	: Y E S
	;

DSNUTIL_NO
	: N O
	;

DSNUTIL_LOG
	: L O G
	;

DSNUTIL_EXCEPTIONS
	: E X C E P T I O N S
	;

DSNUTIL_ERRDDN
	: E R R D D N
	;

DSNUTIL_WORKDDN
	: W O R K D D N
	;

DSNUTIL_PUNCHDDN
	: P U N C H D D N
	;

DSNUTIL_SORTDEVT
	: S O R T D E V T
	;

DSNUTIL_SORTNUM
	: S O R T N U M
	;

DSNUTIL_XMLSCHEMA
	: X M L S C H E M A
	;

DSNUTIL_LISTDEF
	: L I S T D E F
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_LIST
	: L I S T
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_EXCLUDE
	: E X C L U D E
	;

DSNUTIL_CLONED
	: C L O N E D
	;

DSNUTIL_DEFINED
	: D E F I N E D
	;

DSNUTIL_RI
	: R I 
	;

DSNUTIL_RID
	: R I D
	;

DSNUTIL_BASE
	: B A S E
	;

DSNUTIL_LOB
	: L O B
	;

DSNUTIL_HISTORY
	: H I S T O R Y
	;

DSNUTIL_ARCHIVE
	: A R C H I V E
	;

DSNUTIL_PARTLEVEL
	: P A R T L E V E L
	;

DSNUTIL_PARALLEL
	: PARALLEL
	;

DSNUTIL_COPYTOCOPY
	: C O P Y T O C O P Y
	;

DSNUTIL_FROMLASTCOPY
	: F R O M L A S T C O P Y
	;

DSNUTIL_FROMLASTFULLCOPY
	: F R O M L A S T F U L L C O P Y
	;

DSNUTIL_FROMLASTINCRCOPY
	: F R O M L A S T I N C R C O P Y
	;

DSNUTIL_FROMLASTFLASHCOPY
	: F R O M L A S T F L A S H C O P Y
	;

DSNUTIL_CATALOG
	: C A T A L O G
	;

DSNUTIL_FROMSEQNO
	: F R O M S E Q N O
	;

DSNUTIL_DIAGNOSE
	: D I A G N O S E
	;

DSNUTIL_TYPE
	: T Y P E
	;

DSNUTIL_ALLDUMPS
	: A L L D U M P S
	;

DSNUTIL_NODUMPS
	: N O D U M P S
	;

DSNUTIL_SYSUTIL
	: S Y S U T I L
	;

DSNUTIL_MEPL
	: M E P L
	;

DSNUTIL_AVAILABLE
	: A V A I L A B L E
	;

DSNUTIL_RBLP
	: R B L P
	;

DSNUTIL_WAIT
	: W A I T
	;

DSNUTIL_MESSAGE
	: M E S S A G E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_INSTANCE
	: I N S T A N C E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_ABEND
	: A B E N D
	;

DSNUTIL_NODUMP
	: N O D U M P
	;

DSNUTIL_DISPLAY
	: D I S P L A Y
	;

DSNUTIL_DBET
	: D B E T
	;

DSNUTIL_BUFNO
	: B U F N O
	;

DSNUTIL_RETPD
	: R E T P D
	;

DSNUTIL_VOLUMES
	: V O L U M E S
	;

DSNUTIL_VOLCNT
	: V O L C N T
	;

DSNUTIL_UNCNT
	: U N C N T
	;

DSNUTIL_GDGLIMIT
	: G D G L I M I T
	;

DSNUTIL_DISP
	: D I S P
	;

DSNUTIL_LIMIT
	: L I M I T
	;

DSNUTIL_TIME
	: T I M E
	;

DSNUTIL_BLKSZLIM
	: B L K S Z L I M
	;

DSNUTIL_BLKSZLIM_SUFFIX
	: [KMG]
	;

DSNUTIL_SPACE
	: S P A C E
	;

DSNUTIL_PCTPRIME
	: P C T P R I M E
	;

DSNUTIL_MAXPRIME
	: M A X P R I M E
	;

DSNUTIL_NBRSECND
	: N B R S E C N D
	;

DSNUTIL_DIR
	: D I R
	;

DSNUTIL_STACK
	: S T A C K
	;

DSNUTIL_TRTCH
	: T R T C H
	;

DSNUTIL_NONE
	: N O N E
	;

DSNUTIL_COMP
	: C O M P
	;

DSNUTIL_NOCOMP
	: N O C O M P
	;

DSNUTIL_SUBSYS
	: S U B S Y S
	;

DSNUTIL_LRECL
	: L R E C L
	;

DSNUTIL_RECFM
	: R E C F M
	;

DSNUTIL_FILEDATA
	: F I L E D A T A
	;

DSNUTIL_RECORD
	: R E C O R D
	;

DSNUTIL_BINARY
	: B I N A R Y
	;

DSNUTIL_PATHOPTS
	: P A T H O P T S
	;

DSNUTIL_PATHMODE
	: P A T H M O D E
	;

DSNUTIL_PATHDISP
	: P A T H D I S P
	;

DSNUTIL_TEMPLATE
	: T E M P L A T E
	;

DSNUTIL_PATH
	: P A T H
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_UNIT
	: U N I T
	;

DSNUTIL_CURRENT_DATE
	: CURRENT_DATE
	;

DSNUTIL_CURRENT_TIMESTAMP
	: CURRENT_TIMESTAMP
	;

DSNUTIL_YEAR
	: Y E A R 
	;

DSNUTIL_YEARS
	: Y E A R S 
	;

DSNUTIL_MONTH
	: M O N T H 
	;

DSNUTIL_MONTHS
	: M O N T H S 
	;

DSNUTIL_DAY
	: D A Y 
	;

DSNUTIL_DAYS
	: D A Y S 
	;

DSNUTIL_HOUR
	: H O U R 
	;

DSNUTIL_HOURS
	: H O U R S 
	;

DSNUTIL_MINUTE
	: M I N U T E 
	;

DSNUTIL_MINUTES
	: M I N U T E S 
	;

DSNUTIL_SECOND
	: S E C O N D 
	;

DSNUTIL_SECONDS
	: S E C O N D S 
	;

DSNUTIL_MICROSECOND
	: M I C R O S E C O N D 
	;

DSNUTIL_MICROSECONDS
	: M I C R O S E C O N D S 
	;

DSNUTIL_OVERRIDE
	: O V E R R I D E 
	;

DSNUTIL_DECFLOAT_ROUNDMODE
	: D E C F L O A T '_' R O U N D M O D E 
	;

DSNUTIL_ROUND_CEILING
	: R O U N D '_' C E I L I N G 
	;

DSNUTIL_ROUND_DOWN
	: R O U N D '_' D O W N 
	;

DSNUTIL_ROUND_FLOOR
	: R O U N D '_' F L O O R 
	;

DSNUTIL_ROUND_HALF_DOWN
	: R O U N D '_' H A L F '_' D O W N 
	;

DSNUTIL_ROUND_HALF_EVEN
	: R O U N D '_' H A L F '_' E V E N 
	;

DSNUTIL_ROUND_HALF_UP
	: R O U N D '_' H A L F '_' U P 
	;

DSNUTIL_ROUND_UP
	: R O U N D '_' U P 
	;

DSNUTIL_IGNORE
	: I G N O R E
	;

DSNUTIL_FORMAT
	: F O R M A T
	;

DSNUTIL_SQLDS
	: S Q L '/' D S
	;

DSNUTIL_INTERNAL
	: I N T E R N A L
	;

DSNUTIL_DELIMITED
	: D E L I M I T E D
	;

DSNUTIL_SPANNED
	: S P A N N E D
	;

DSNUTIL_FREQVAL
	: F R E Q V A L
	;

DSNUTIL_NUMCOLS
	: N U M C O L S
	;

DSNUTIL_COUNT
	: C O U N T
	;

DSNUTIL_MOST
	: M O S T
	;

DSNUTIL_BOTH
	: B O T H
	;

DSNUTIL_LEAST
	: L E A S T
	;

DSNUTIL_HISTOGRAM
	: H I S T O G R A M
	;

DSNUTIL_NUMQUANTILES
	: N U M Q U A N T I L E S
	;

DSNUTIL_COLGROUP
	: C O L G R O U P
	;

DSNUTIL_FORCEROLLUP
	: F O R C E R O L L U P
	;

DSNUTIL_STATCLGMEMSRT
	: S T A T C L G M E M S R T
	;

DSNUTIL_INVALIDATECACHE
	: I N V A L I D A T E C A C H E
	;

DSNUTIL_ACCESSPATH
	: A C C E S S P A T H
	;

DSNUTIL_STATISTICS
	: S T A T I S T I C S
	;

DSNUTIL_RESUME
	: R E S U M E
	;

DSNUTIL_CONTINUEIF
	: C O N T I N U E I F
	;

DSNUTIL_INDDN
	: I N D D N
	;

DSNUTIL_DISCARDDN
	: D I S C A R D D N
	;

DSNUTIL_NUMRECS
	: N U M R E C S
	;

DSNUTIL_KEEPDICTIONARY
	: K E E P D I C T I O N A R Y
	;

DSNUTIL_PREFORMAT
	: P R E F O R M A T
	;

DSNUTIL_INCURSOR
	: I N C U R S O R
	;

DSNUTIL_IGNOREFIELDS
	: I G N O R E F I E L D S
	;

DSNUTIL_REPLACE
	: R E P L A C E 
	;

DSNUTIL_COLUMN
	: C O L U M N 
	;

DSNUTIL_PROFILE
	: P R O F I L E 
	;

DSNUTIL_SAMPLE
	: S A M P L E 
	;

DSNUTIL_AUTO
	: A U T O 
	;

DSNUTIL_UNLOAD
	: U N L O A D 
	;

DSNUTIL_PLUS
	: '+' 
	;

DSNUTIL_MINUS
	: '-' 
	;

DSNUTIL_INTO
	: I N T O 
	;

DSNUTIL_REUSE
	: R E U S E 
	;

DSNUTIL_TRUNCATE
	: T R U N C A T E 
	;

DSNUTIL_LOAD
	: L O A D 
	{
		dsnutilLoad = true;
	}
	;

DSNUTIL_LOAD_DATA
	: L O A D (WS | NEWLINE)+ D A T A
	{
		dsnutilLoad = true;
	}
	;

DSNUTIL_IDENTITYOVERRIDE
	: I D E N T I T Y O V E R R I D E
	;

DSNUTIL_PERIODOVERRIDE
	: P E R I O D O V E R R I D E
	;

DSNUTIL_TRANSIDOVERRIDE
	: T R A N S I D O V E R R I D E
	;

DSNUTIL_REORG
	: R E O R G
	{
		dsnutilLoad = false;
	}
	;

DSNUTIL_COPYDICTIONARY
	: C O P Y D I C T I O N A R Y 
	;

DSNUTIL_PRESORTED
	: P R E S O R T E D 
	;

DSNUTIL_PRESORT
	: P R E S O R T 
	;

DSNUTIL_ROWFORMAT
	: R O W F O R M A T 
	;

DSNUTIL_RRF
	: R R F 
	;

DSNUTIL_BRF
	: B R F 
	;

DSNUTIL_NOCOPYPEND
	: N O C O P Y P E N D 
	;

DSNUTIL_EBCDIC
	: E B C D I C 
	;

DSNUTIL_ASCII
	: A S C I I 
	;

DSNUTIL_UNICODE
	: U N I C O D E 
	;

DSNUTIL_NOSUBS
	: N O S U B S 
	;

DSNUTIL_ENFORCE
	: E N F O R C E 
	;

DSNUTIL_CONSTRAINTS
	: C O N S T R A I N T S 
	;

DSNUTIL_NOCHECKPEND
	: N O C H E C K P E N D 
	;

DSNUTIL_MAPDDN
	: M A P D D N 
	;

DSNUTIL_DISCARDS
	: D I S C A R D S 
	;

DSNUTIL_BACKOUT
	: B A C K O U T 
	;

DSNUTIL_INDEXDEFER
	: I N D E X D E F E R 
	;

DSNUTIL_NPI
	: N P I 
	;

DSNUTIL_NONUNIQUE
	: N O N U N I Q U E 
	;

DSNUTIL_UPDMAXASSIGNEDVAL
	: U P D M A X A S S I G N E D V A L 
	;

DSNUTIL_DEFINEAUX
	: D E F I N E A U X 
	;

DSNUTIL_READERS
	: R E A D E R S 
	;

DSNUTIL_KEEP_EMPTY_PAGES
	: K E E P '_' E M P T Y '_' P A G E S 
	;

DSNUTIL_FLOAT
	: F L O A T
	;

DSNUTIL_DOUBLE
	: D O U B L E
	;

DSNUTIL_REAL
	: R E A L
	;

DSNUTIL_CCSID
	: C C S I D
	;

DSNUTIL_WITH_TIME_ZONE
	: W I T H (WS | NEWLINE)+ T I M E (WS | NEWLINE)+ Z O N E
	;

DSNUTIL_USE
	: U S E
	;

DSNUTIL_COMMA
	: COMMA
	;

DSNUTIL_MERGECOPY
	: M E R G E C O P Y
	;

DSNUTIL_NEWCOPY
	: N E W C O P Y
	;

DSNUTIL_MODIFY
	: M O D I F Y
	;

DSNUTIL_RECOVERY
	: R E C O V E R Y
	;

DSNUTIL_AGE
	: A G E
	;

DSNUTIL_DATE
	: D A T E
	;

DSNUTIL_DELETEDS
	: D E L E T E D S
	;

DSNUTIL_RETAIN
	: R E T A I N
	;

DSNUTIL_LAST
	: L A S T
	;

DSNUTIL_LOGLIMIT
	: L O G L I M I T
	;

DSNUTIL_ONLY
	: O N L Y
	;

DSNUTIL_OPTIONS
	: O P T I O N S
	;

DSNUTIL_OFF
	: O F F 
	;

DSNUTIL_PREVIEW
	: P R E V I E W
	;

DSNUTIL_LISTDEFDD
	: L I S T D E F D D
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_TEMPLATEDD
	: T E M P L A T E D D
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_FILSZ
	: F I L S Z
	;

DSNUTIL_EVENT
	: E V E N T
	;

DSNUTIL_ITEMERROR
	: I T E M E R R O R
	;

DSNUTIL_HALT
	: H A L T
	;

DSNUTIL_SKIP
	: S K I P
	;

DSNUTIL_WARNING
	: W A R N I N G
	;

DSNUTIL_RC0
	: R C '0'
	;

DSNUTIL_RC4
	: R C '4'
	;

DSNUTIL_RC8
	: R C '8'
	;

DSNUTIL_QUIESCE
	: Q U I E S C E
	;

DSNUTIL_WRITE
	: W R I T E
	;

DSNUTIL_REBUILD
	: R E B U I L D
	;

DSNUTIL_MAXRO
	: M A X R O
	;

DSNUTIL_LONGLOG
	: L O N G L O G
	;

DSNUTIL_DELAY
	: D E L A Y
	;

DSNUTIL_DEFER
	: D E F E R
	;

DSNUTIL_CONTINUE
	: C O N T I N U E
	;

DSNUTIL_TERM
	: T E R M
	;

DSNUTIL_DRAIN
	: D R A I N
	;

DSNUTIL_RECOVER
	: R E C O V E R
	;

DSNUTIL_LOCALSITE
	: L O C A L S I T E
	;

DSNUTIL_LOGRANGES
	: L O G R A N G E S
	;

DSNUTIL_VERIFYSET
	: V E R I F Y S E T
	;

DSNUTIL_LOGONLY
	: L O G O N L Y
	;

DSNUTIL_CURRENTCOPYONLY
	: C U R R E N T C O P Y O N L Y
	;

DSNUTIL_FROMDUMP
	: F R O M D U M P
	;

DSNUTIL_FLASHCOPY_PPRCP
	: F L A S H C O P Y '_' P P R C P
	;

DSNUTIL_TOCOPY
	: T O C O P Y
	->pushMode(DSNUTIL_DSN_MODE)
	;

DSNUTIL_TOLASTCOPY
	: T O L A S T C O P Y
	;

DSNUTIL_TOLASTFULLCOPY
	: T O L A S T F U L L C O P Y
	;

DSNUTIL_ERROR
	: E R R O R
	;

DSNUTIL_RANGE
	: R A N G E
	;

DSNUTIL_NOSYSCOPY
	: N O S Y S C O P Y
	;

DSNUTIL_INLCOPY
	: I N L C O P Y
	;

DSNUTIL_FCCOPY
	: F C C O P Y
	;

DSNUTIL_TOVOLUME
	: T O V O L U M E
	;

DSNUTIL_TOSEQNO
	: T O S E Q N O
	;

DSNUTIL_PMNO
	: P M N O
	;

DSNUTIL_PMPREF
	: P M P R E F
	;

DSNUTIL_PMREQ
	: P M R E Q
	;

DSNUTIL_RECOVERYSITE
	: R E C O V E R Y S I T E
	;

DSNUTIL_UPDATED
	: U P D A T E D
	;

DSNUTIL_FASTSWITCH
	: F A S T S W I T C H
	;

DSNUTIL_LEAFDISTLIMIT
	: L E A F D I S T L I M I T
	;

DSNUTIL_PAUSE
	: P A U S E
	;

DSNUTIL_NOSYSUT1
	: N O S Y S U T '1'
	;

DSNUTIL_TIMEOUT
	: T I M E O U T
	;

DSNUTIL_NEWMAXRO
	: N E W M A X R O
	;

DSNUTIL_LASTLOG
	: L A S T L O G
	;

DSNUTIL_WRITERS
	: W R I T E R S
	;

DSNUTIL_LISTPARTS
	: L I S T P A R T S
	;

DSNUTIL_REBALANCE
	: R E B A L A N C E
	;

DSNUTIL_SORTCLUSTER
	: S O R T C L U S T E R
	;

DSNUTIL_DROP_PART
	: D R O P '_' P A R T
	;

DSNUTIL_RECLUSTER
	: R E C L U S T E R
	;

DSNUTIL_NOSYSREC
	: N O S Y S R E C
	;

DSNUTIL_AUTOESTSPACE
	: A U T O E S T S P A C E
	;

DSNUTIL_AUX
	: A U X
	;

DSNUTIL_SORTNPSI
	: S O R T N P S I
	;

DSNUTIL_ICLIMIT_DASD
	: I C L I M I T '_' D A S D
	;

DSNUTIL_ICLIMIT_TAPE
	: I C L I M I T '_' T A P E
	;

DSNUTIL_DRAIN_ALLPARTS
	: D R A I N '_' A L L P A R T S
	;

DSNUTIL_OFFPOSLIMIT
	: O F F P O S L I M I T
	;

DSNUTIL_INDREFLIMIT
	: I N D R E F L I M I T
	;

DSNUTIL_NOPAD
	: N O P A D
	;

DSNUTIL_DISCARD
	: D I S C A R D
	;

DSNUTIL_INITCDDS
	: I N I T C C D S
	;

DSNUTIL_SEARCHTIME
	: S E A R C H T I M E
	;

DSNUTIL_SORTDATA
	: S O R T D A T A
	;

DSNUTIL_WRITELOG
	: W R I T E L O G
	;

DSNUTIL_SUBTYPE
	: S U B T Y P E
	;

DSNUTIL_TEST
	: T E S T
	;

DSNUTIL_LEVELID
	: L E V E L I D
	;

DSNUTIL_DBD
	: D B D
	;

DSNUTIL_DROP
	: D R O P
	;

DSNUTIL_OUTDDN
	: O U T D D N
	;

DSNUTIL_SET
	: S E T
	;

DSNUTIL_NORCVRPEND
	: N O R C V R P E N D
	;

DSNUTIL_NOAUXWARN
	: N O A U X W A R N
	;

DSNUTIL_NOAUXCHKP
	: N O A U X C H K P
	;

DSNUTIL_NOAREORPENDSTAR
	: N O A R E O R P E N D S T A R
	;

DSNUTIL_NOAREORPEND
	: N O A R E O R P E N D
	;

DSNUTIL_PRO
	: P R O
	;

DSNUTIL_NOPRO
	: N O P R O
	;

DSNUTIL_NORBDPEND
	: N O R B D P E N D
	;

DSNUTIL_RBDPEND
	: R B D P E N D
	;

DSNUTIL_PSRBDPEND
	: P S R B D P E N D
	;

DSNUTIL_MAP
	: M A P
	;

DSNUTIL_DATAONLY
	: D A T A O N L Y
	;

DSNUTIL_VERIFY
	: V E R I F Y
	;

DSNUTIL_REPAIR
	: R E P A I R
	;

DSNUTIL_OBJECT
	: O B J E C T
	;

DSNUTIL_LOCATE
	: L O C A T E
	;

DSNUTIL_ARCHLOG
	: A R C H L O G
	;

DSNUTIL_CURRENT
	: C U R R E N T
	;

DSNUTIL_SUMMARY
	: S U M M A R Y
	;

DSNUTIL_SWITCH_VCAT
	: DSNUTIL_SWITCH (WS | NEWLINE)+ VCAT
	;

DSNUTIL_RESTORE_SYSTEM
	: R E S T O R E (WS | NEWLINE)+ S Y S T E M
	;

DSNUTIL_SYSVALUEDDN
	: S Y S V A L U E D D N
	;

DSNUTIL_RSA
	: R S A
	;

DSNUTIL_REGISTER
	: R E G I S T E R
	;

DSNUTIL_RUNSTATS
	: R U N S T A T S
	;

DSNUTIL_FROM_EXISTING_STATS
	: DSNUTIL_FROM (WS | NEWLINE)+ E X I S T I N G (WS | NEWLINE)+ S T A T S
	;

DSNUTIL_STOSPACE
	: S T O S P A C E
	;

DSNUTIL_HEADER
	: H E A D E R
	;

DSNUTIL_OBID
	: OBID
	;

DSNUTIL_S390
	: S '3' '9' '0'
	;

DSNUTIL_IEEE
	: I E E E
	;

DSNUTIL_MAXERR
	: M A X E R R 
	;

DSNUTIL_ISOLATION
	: I S O L A T I O N
	;
	
DSNUTIL_CS
	: C S
	;

DSNUTIL_UR
	: U R
	;

DSNUTIL_HEX_LIT
	: X '\'' [0-9A-Za-z]+ '\''
	;

/*
Added \r 2023-10-17 per Martijn Rutte.  Also on...

DSNUTIL_DSN_CHAR
DSNUTIL_DB_TS_IDENTIFIER
DSNUTIL_PAREN_IDENTIFIER

...tokens.

ANTLR is "greedy" in its matching to create tokens and
was including the \r (Carriage Return) character when
present in the input.  No one wants that, so the CR is
now excluded.
*/
DSNUTIL_IDENTIFIER
	: ~[ \n\r,;)('"=><+-]+
	;

mode DSNUTIL_WHEN_MODE;

DSNUTIL_WHEN_WS
	: (WS | NEWLINE)+
	->channel(HIDDEN)
	;

DSNUTIL_WHEN_LPAREN
	: LPAREN
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
		dsnutilArgc = 0;
		dsnutil = false;
	}
	->pushMode(DEFAULT_MODE) //we're not coming back here
	;

mode DSNUTIL_EXCEPTION_MODE;

/*
Why are we here?

The EXCEPTION token has been seen and thus we will see one
or more IN <tablespace> USE <tablespace> phrases.  When 
another token representing an option indicating we will see
no more of these phrases is seen, we popMode back to 
DSNUTIL_MODE.

*/

DSNUTIL_EXCEPTION_WS
	: (WS | NEWLINE)+
	->channel(HIDDEN)
	;

DSNUTIL_IN
	: I N
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_EXCEPTION_USE
	: U S E
	->type(DSNUTIL_USE),pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_EXCEPTION_CLONE
	: C L O N E
	->type(DSNUTIL_CLONE),popMode
	;

DSNUTIL_EXCEPTION_SHRLEVEL
	: S H R L E V E L
	->type(DSNUTIL_SHRLEVEL),popMode
	;

DSNUTIL_EXCEPTION_DRAIN_WAIT
	: D R A I N '_' W A I T
	->type(DSNUTIL_DRAIN_WAIT),popMode
	;

DSNUTIL_EXCEPTION_RETRY
	: R E T R Y
	->type(DSNUTIL_RETRY),popMode
	;

DSNUTIL_EXCEPTION_RETRY_DELAY
	: R E T R Y '_' D E L A Y
	->type(DSNUTIL_RETRY_DELAY),popMode
	;

DSNUTIL_EXCEPTION_SCOPE
	: S C O P E
	->type(DSNUTIL_SCOPE),popMode
	;

DSNUTIL_EXCEPTION_AUXERROR
	: A U X E R R O R
	->type(DSNUTIL_AUXERROR),popMode
	;

DSNUTIL_EXCEPTION_LOBERROR
	: L O B E R R O R
	->type(DSNUTIL_LOBERROR),popMode
	;

DSNUTIL_EXCEPTION_XMLERROR
	: X M L E R R O R
	->type(DSNUTIL_XMLERROR),popMode
	;

DSNUTIL_EXCEPTION_DELETE
	: D E L E T E
	->type(DSNUTIL_DELETE),popMode
	;

DSNUTIL_EXCEPTION_EXCEPTIONS
	: E X C E P T I O N S
	->type(DSNUTIL_EXCEPTIONS),popMode
	;

DSNUTIL_EXCEPTION_ERRDDN
	: E R R D D N
	->type(DSNUTIL_ERRDDN),popMode
	;

DSNUTIL_EXCEPTION_WORKDDN
	: W O R K D D N
	->type(DSNUTIL_WORKDDN),popMode
	;

DSNUTIL_EXCEPTION_PUNCHDDN
	: P U N C H D D N
	->type(DSNUTIL_PUNCHDDN),popMode
	;

DSNUTIL_EXCEPTION_SORTDEVT
	: S O R T D E V T
	->type(DSNUTIL_SORTDEVT),popMode
	;

DSNUTIL_EXCEPTION_SORTNUM
	: S O R T N U M
	->type(DSNUTIL_SORTNUM),popMode
	;

mode DSNUTIL_DSN_MODE;
/*
Why are we here?

The DSN token has been seen.  This means that a dataset name
string follows.  It _may_ be enclosed in parenthesis, apostrophes,
double apostrophes, or quotes.  Some combinations of these are
allowed.

*/

DSNUTIL_DSN_LPAREN
	: LPAREN
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
	}
	->pushMode(DSNUTIL_PAREN_MODE)
	;

DSNUTIL_DSN_DOUBLE_APOS
	: '\'\''
	->pushMode(DSNUTIL_DOUBLE_APOS_MODE)
	;

DSNUTIL_DSN_OPEN_APOS
	: '\''
	->pushMode(DSNUTIL_APOS_MODE)
	;

DSNUTIL_DSN_WS
	: (WS | NEWLINE)+
	->channel(HIDDEN),pushMode(DSNUTIL_DSN_WS_MODE);

DSNUTIL_DSN_CHAR
	: ~[ \n\r,;)('"]+
	//->type(DSNUTIL_IDENTIFIER)
	;

mode DSNUTIL_DSN_WS_MODE;
/*
Why are we here?

In processing a DSN token, whitespace was detected.  This means it
is possible the dataset name is not enclosed in parentheses, 
apostrophes, double apostrophes, or quotes.  So the end of the 
dataset name is delimited by either whitespace or the closing
apostrophe for the entire parameter.
*/

DSNUTIL_DSN_WS_DOUBLE_APOS
	: '\'\''
	{!dsnutil_dsn_ws_char}?
	->pushMode(DSNUTIL_DOUBLE_APOS_MODE)
	;

DSNUTIL_DSN_WS_OPEN_APOS
	: '\''
	{
		if (dsnutil_dsn_ws_char) {
			/*
			We are not within apostrophes, this is the
			closing apostrophe of the whole third
			parameter for SYSPROC.DSNUTILx.
			*/
			dsnutil = false;
			dsnutilArgc = 0;
			dsnutil_dsn_ws_char = false;
			setType(DSNUTIL_CLOSE_APOS);
			popMode(); //back to DSNUTIL_DSN_MODE
			popMode(); //back to DSNUTIL_MODE
			popMode(); //back to DEFAULT_MODE
		} else {
			pushMode(DSNUTIL_APOS_MODE); //we don't come back here
		}
	}
	;

DSNUTIL_DSN_WS_OPEN_QUOTE
	: '"'
	{
		if (dsnutil_dsn_ws_char) {
			/*
			We are not within quotes, this is the
			closing quote of the whole third
			parameter for SYSPROC.DSNUTILx.
			*/
			dsnutil = false;
			dsnutilArgc = 0;
			dsnutil_dsn_ws_char = false;
			setType(DSNUTIL_CLOSE_QUOTE);
			popMode(); //back to DSNUTIL_DSN_MODE
			popMode(); //back to DSNUTIL_MODE
			popMode(); //back to DEFAULT_MODE
		} else {
			pushMode(DSNUTIL_QUOTE_MODE); //we don't come back here
		}
	}
	;

DSNUTIL_DSN_WS_LPAREN
	: LPAREN
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
	}
	->pushMode(DSNUTIL_PAREN_MODE)
	;

DSNUTIL_DSN_WS_WS
	: (WS | NEWLINE)+
	{
		dsnutil_dsn_ws_char = false;
	}
	->channel(HIDDEN),popMode,popMode;

DSNUTIL_DSN_WS_CHAR
	: DSNUTIL_DSN_CHAR
	{
		dsnutil_dsn_ws_char = true;
	}
	//->type(DSNUTIL_IDENTIFIER)
	;

mode DSNUTIL_DB_TS_MODE;
/*
Why are we here?

We have encountered a token such as TABLESPACE in the CHECK DATA
control statement which is followed by whitespace which is followed
by a string constant representing a tablespace name qualified with
a database name (or a similar construct) which is followed by 
whitespace.  This takes the form...

	[database-name.]tablespace-name

...where the database name and the dot are optional.  It is 
possible that the database name and/or the tablespace name are
enclosed by quotes or apostrophes.

It is necessary to return to the "parent" mode when the whitespace
following the string constant is encountered.  We must not mistake
the leading whitespace for the terminating whitespace, hence the
boolean check in the predicate.

From the syntax diagram for CHECK DATA, it appears it is 
syntactically correct for the termination to also be the end of the
parameter string to SYSPROC.DSNUTILx.  So if an apostrophe or a quote
is found which is not enclosing either portion of the string constant
then we popMode twice.

Conveniently, this mode also handles arbitrary strings and so we may
have arrived because we're on the right hand side of an equal sign.
*/

DSNUTIL_DB_TS_WS_LEADING
	: (WS | NEWLINE)+
	{!dsnutil_db_ts_char}? 
	->channel(HIDDEN)
	;

DSNUTIL_DB_TS_WS_TERMINATING
	: (WS | NEWLINE)+
	{dsnutil_db_ts_char}?
	{
		dsnutil_db_ts_char = false;
	}
	->channel(HIDDEN),popMode
	;

DSNUTIL_DB_TS_EQUAL
	: DSNUTIL_EQUAL
	->type(DSNUTIL_EQUAL)
	;

/*
Sometimes a literal is delimited with two apostrophes.
*/
DSNUTIL_DB_TS_DOUBLE_APOS
	: '\'\''
	{
		dsnutil_db_ts_char = true;
	}
	->pushMode(DSNUTIL_DOUBLE_APOS_MODE)
	;

DSNUTIL_DB_TS_APOS
	: '\''
	{
		if (dsnutil_db_ts_char) {
			dsnutil = false;
			dsnutilArgc = 0;
			dsnutil_dsn_ws_char = false;
			dsnutil_db_ts_char = false;
			setType(DSNUTIL_CLOSE_APOS);
			switch(_modeStack.peek()) {
				case DSNUTIL_PAREN_MODE :
					popMode();
					break;
				case DSNUTIL_EXCEPTION_MODE :
					popMode(); //back to DSNUTIL_EXCEPTION_MODE
					popMode(); //back to DSNUTIL_MODE
					popMode(); //back to DEFAULT_MODE
					break;
				default :
					popMode(); //back to DSNUTIL_MODE
					popMode(); //back to DEFAULT_MODE
					break;
			}
		} else {
			pushMode(DSNUTIL_APOS_MODE);
			dsnutil_db_ts_char = true;
		}
	}
	;

DSNUTIL_DB_TS_QUOTE
	: '"'
	{
		if (dsnutil_db_ts_char) {
			dsnutil = false;
			dsnutilArgc = 0;
			dsnutil_dsn_ws_char = false;
			dsnutil_db_ts_char = false;
			setType(DSNUTIL_CLOSE_QUOTE);
			switch(_modeStack.peek()) {
				case DSNUTIL_PAREN_MODE :
					popMode();
					break;
				case DSNUTIL_EXCEPTION_MODE :
					popMode(); //back to DSNUTIL_EXCEPTION_MODE
					popMode(); //back to DSNUTIL_MODE
					popMode(); //back to DEFAULT_MODE
					break;
				default :
					popMode(); //back to DSNUTIL_MODE
					popMode(); //back to DEFAULT_MODE
					break;
			}
		} else {
			pushMode(DSNUTIL_QUOTE_MODE);
			dsnutil_db_ts_char = true;
		}
	}
	;

DSNUTIL_DB_TS_DOT
	: DOT
	{
		dsnutil_db_ts_char = false;
	}
	//->type(DSNUTIL_IDENTIFIER)
	;

DSNUTIL_DB_TS_LPAREN
	: '('
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
		dsnutil_db_ts_char = false;
	}
	->pushMode(DSNUTIL_PAREN_MODE) //we're not coming back here
	;

DSNUTIL_DB_TS_RPAREN
	: ')'
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
		dsnutil_db_ts_char = false;
		switch(_modeStack.peek()) {
			case DSNUTIL_PAREN_MODE :
				popMode(); //back to DSNUTIL_PAREN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			default :
				popMode(); //back to "parent" mode
				break;
		}
	}
	;

DSNUTIL_DB_TS_DELETE
	: DSNUTIL_DELETE
	{
		dsnutil_db_ts_char = true;
	}
	->type(DSNUTIL_DELETE)
	;

DSNUTIL_DB_TS_SAMPLE
	: DSNUTIL_SAMPLE
	{
		dsnutil_db_ts_char = true;
	}
	->type(DSNUTIL_SAMPLE)
	;

DSNUTIL_DB_TS_TABLESAMPLE
	: DSNUTIL_TABLESAMPLE
	{
		dsnutil_db_ts_char = true;
	}
	->type(DSNUTIL_TABLESAMPLE)
	;

DSNUTIL_DB_TS_RECORD
	: DSNUTIL_RECORD
	{
		dsnutil_db_ts_char = true;
	}
	->type(DSNUTIL_RECORD)
	;

DSNUTIL_DB_TS_IDENTIFIER
	: ~[ \n\r.,;)('"]+
	{
		dsnutil_db_ts_char = true;
	}
	//->type(DSNUTIL_IDENTIFIER)
	;

/*
This doesn't work.

The reason it doesn't work is that, following a token that
matches this rule, the closing quote for the third parameter
to SYSPROC.DSNUTILx + any intervening whitespace + the comma
prior to the fourth parameter + the opening quote for the
fourth parameter also match this rule - and we don't want that.

DSNUTIL_DB_TS_STRINGLITERAL
	: STRINGLITERAL
	{
		dsnutil_db_ts_char = true;
	}
	;
*/

DSNUTIL_DB_TS_HEX_LIT
	: [GNX] '\'' [0-9A-Za-z]+ '\''
	->popMode
	;

/*
Added per Martijn Rutte 2024-04-03.  It turns out that hex
literals can be quoted with two apostrophes and not just one.
*/

DSNUTIL_DB_TS_HEX_LIT_DOUBLE_APOS
	: [GNX] '\'\'' [0-9A-Za-z]+ '\'\''
	->popMode
	;

mode DSNUTIL_PAREN_MODE;
/*
Why are we here?

A token has been seen which is followed by a paren.  What is enclosed
in parentheses may include apostrophes or quotes.

*/
DSNUTIL_LPAREN1
	: '('
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
	}
	->pushMode(DSNUTIL_PAREN_MODE)
	;

DSNUTIL_RPAREN1
	: ')'
	{
		//System.out.println(getLine() + ":" + getCharPositionInLine() + "|" + getText() + "|" + " mode " + modeNames[_mode] + " prevMode " + (_modeStack.isEmpty() ? "empty" : modeNames[_modeStack.peek()]));
		switch(_modeStack.peek()) {
			case DSNUTIL_DSN_WS_MODE :
				popMode(); //back to DSNUTIL_DSN_WS_MODE
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			case DSNUTIL_DSN_MODE :
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			case DSNUTIL_DB_TS_MODE :
				popMode(); //back to DSNUTIL_DB_TS_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			default :
				popMode(); //back to "parent" mode (which may be this mode)
				break;
		}
	}
	;

DSNUTIL_PAREN_OPEN_APOS
	: '\''
	->pushMode(DSNUTIL_APOS_MODE)
	;

DSNUTIL_PAREN_DOUBLE_APOS
	: '\'\''
	->pushMode(DSNUTIL_DOUBLE_APOS_MODE)
	;

DSNUTIL_PAREN_OPEN_QUOTE
	: '"'
	->pushMode(DSNUTIL_QUOTE_MODE)
	;

DSNUTIL_PAREN_COMMA
	: COMMA
	->type(DSNUTIL_COMMA)
	;

/*
Equal and not equal pushMode to two different places because
the former must also work with the UNIT token and the latter
need not.
*/
DSNUTIL_PAREN_EQUAL
	: DSNUTIL_EQUAL
	->type(DSNUTIL_EQUAL),pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_PAREN_NOT_EQUAL
	: DSNUTIL_NOT_EQUAL
	->type(DSNUTIL_NOT_EQUAL),pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_PAREN_DOT
	: DOT
	;

DSNUTIL_PAREN_WS
	: (WS | NEWLINE)+
	->channel(HIDDEN)
	;

DSNUTIL_PAREN_TABLESPACE
	: T A B L E S P A C E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_PAREN_TABLE
	: T A B L E
	->pushMode(DSNUTIL_DB_TS_MODE)
	;

DSNUTIL_PAREN_XMLCOLUMN
	: X M L C O L U M N
	;

DSNUTIL_SYSTEMPERIOD
	: S Y S T E M P E R I O D 
	;

DSNUTIL_IDENTITY
	: I D E N T I T Y 
	;

DSNUTIL_TRANSID
	: T R A N S I D 
	;

DSNUTIL_NONDETERMINISTIC
	: N O N D E T E R M I N I S T I C 
	;

DSNUTIL_ROWCHANGE
	: R O W C H A N G E 
	;

DSNUTIL_PAREN_WHEN
	: W H E N
	;

DSNUTIL_PAREN_PART
	: P A R T
	->type(DSNUTIL_PART)
	;

DSNUTIL_CONV
	: C O N V
	;

DSNUTIL_VALPROC
	: V A L P R O C
	;

DSNUTIL_IDERROR
	: I D E R R O R
	;

DSNUTIL_DUPKEY
	: D U P K E Y
	;

DSNUTIL_CONV_ERROR
	: C O N V '_' E R R O R
	;

DSNUTIL_DECIMAL
	: D E C I M A L 
	;

DSNUTIL_PACKED
	: P A C K E D
	;

DSNUTIL_ZONED
	: Z O N E D
	;

DSNUTIL_EXTERNAL
	: E X T E R N A L
	;

DSNUTIL_TRAILING
	: T R A I L I N G
	;

DSNUTIL_LEADING
	: L E A D I N G
	;

DSNUTIL_CHARACTER
	: C H A R A C T E R 
	;

DSNUTIL_CHAR
	: C H A R
	;

DSNUTIL_VARCHAR
	: V A R C H A R
	;

DSNUTIL_BIT
	: B I T
	;

DSNUTIL_PAREN_CCSID
	: C C S I D
	->type(DSNUTIL_CCSID)
	;

DSNUTIL_MIXED
	: M I X E D
	;

DSNUTIL_BLOBF
	: B L O B F
	;

DSNUTIL_PRESERVE
	: P R E S E R V E
	;

DSNUTIL_WHITESPACE
	: W H I T E S P A C E
	;

DSNUTIL_BINARYXML
	: B I N A R Y X M L
	;

DSNUTIL_CLOBF
	: C L O B F
	;

DSNUTIL_DBCLOBF
	: D B C L O B F
	;

DSNUTIL_GRAPHIC
	: G R A P H I C
	;

DSNUTIL_VARGRAPHIC
	: V A R G R A P H I C
	;

DSNUTIL_SMALLINT
	: S M A L L I N T
	;

DSNUTIL_INTEGER
	: I N T E G E R
	;

DSNUTIL_INT
	: I N T
	;

DSNUTIL_BIGINT
	: B I G I N T
	;

DSNUTIL_VARBINARY
	: V A R B I N A R Y
	;

DSNUTIL_PAREN_BINARY
	: B I N A R Y
	->type(DSNUTIL_BINARY)
	;

DSNUTIL_VARYING
	: V A R Y I N G
	;

DSNUTIL_PAREN_FLOAT
	: F L O A T
	->type(DSNUTIL_FLOAT)
	;

DSNUTIL_PAREN_DOUBLE
	: DSNUTIL_DOUBLE
	->type(DSNUTIL_DOUBLE)
	;

DSNUTIL_PAREN_REAL
	: DSNUTIL_REAL
	->type(DSNUTIL_REAL)
	;

DSNUTIL_PAREN_DATE
	: D A T E
	->type(DSNUTIL_DATE)
	;

DSNUTIL_DATE_P
	: D A T E '_' P
	;

DSNUTIL_PAREN_TIME
	: T I M E
	->type(DSNUTIL_TIME)
	;

DSNUTIL_TIMESTAMP
	: T I M E S T A M P
	;

DSNUTIL_TIMESTAMP_WITH_TIME_ZONE
	: T I M E S T A M P (WS | NEWLINE)+ W I T H (WS | NEWLINE)+ T I M E (WS | NEWLINE)+ Z O N E
	;

DSNUTIL_BLOB
	: B L O B
	;

DSNUTIL_CLOB
	: C L O B
	;

DSNUTIL_DBCLOB
	: D B C L O B
	;

DSNUTIL_DECFLOAT
	: D E C F L O A T
	;

DSNUTIL_PAREN_ROWID
	: R O W I D
	->type(DSNUTIL_ROWID)
	;

DSNUTIL_PAREN_XML
	: X M L
	->type(DSNUTIL_XML)
	;

DSNUTIL_NULLIF
	: N U L L I F
	;

DSNUTIL_DEFAULTIF
	: D E F A U L T I F
	;

DSNUTIL_POSITION
	: P O S I T I O N
	;

DSNUTIL_CONSTANTIF
	: C O N S T A N T I F 
	;

DSNUTIL_CONSTANT
	: C O N S T A N T 
	;

DSNUTIL_STRIP
	: S T R I P 
	;

DSNUTIL_PAREN_FREQVAL
	: F R E Q V A L
	->type(DSNUTIL_FREQVAL)
	;

DSNUTIL_PAREN_NUMCOLS
	: N U M C O L S
	->type(DSNUTIL_NUMCOLS)
	;

DSNUTIL_PAREN_COUNT
	: C O U N T
	->type(DSNUTIL_COUNT)
	;

DSNUTIL_PAREN_MOST
	: M O S T
	->type(DSNUTIL_MOST)
	;

DSNUTIL_PAREN_BOTH
	: B O T H
	->type(DSNUTIL_BOTH)
	;

DSNUTIL_PAREN_TRUNCATE
	: DSNUTIL_TRUNCATE
	->type(DSNUTIL_TRUNCATE)
	;

DSNUTIL_PAREN_LEAST
	: L E A S T
	->type(DSNUTIL_LEAST)
	;

DSNUTIL_PAREN_HISTOGRAM
	: H I S T O G R A M
	->type(DSNUTIL_HISTOGRAM)
	;

DSNUTIL_PAREN_NUMQUANTILES
	: N U M Q U A N T I L E S
	->type(DSNUTIL_NUMQUANTILES)
	;

DSNUTIL_PAREN_YES
	: Y E S
	->type(DSNUTIL_YES)
	;

DSNUTIL_PAREN_NO
	: N O
	->type(DSNUTIL_NO)
	;

DSNUTIL_PAREN_ALL
	: DSNUTIL_ALL
	->type(DSNUTIL_ALL)
	;

DSNUTIL_PAREN_ITEMERROR
	: DSNUTIL_ITEMERROR
	->type(DSNUTIL_ITEMERROR)
	;

DSNUTIL_PAREN_HALT
	: DSNUTIL_HALT
	->type(DSNUTIL_HALT)
	;

DSNUTIL_PAREN_SKIP
	: DSNUTIL_SKIP
	->type(DSNUTIL_SKIP)
	;

DSNUTIL_PAREN_WARNING
	: DSNUTIL_WARNING
	->type(DSNUTIL_WARNING)
	;

DSNUTIL_PAREN_RC0
	: DSNUTIL_RC0
	->type(DSNUTIL_RC0)
	;

DSNUTIL_PAREN_RC4
	: DSNUTIL_RC4
	->type(DSNUTIL_RC4)
	;

DSNUTIL_PAREN_RC8
	: DSNUTIL_RC8
	->type(DSNUTIL_RC8)
	;

DSNUTIL_PAREN_CURRENT_DATE
	: DSNUTIL_CURRENT_DATE
	->type(DSNUTIL_CURRENT_DATE)
	;

DSNUTIL_PAREN_CURRENT_TIMESTAMP
	: DSNUTIL_CURRENT_TIMESTAMP
	->type(DSNUTIL_CURRENT_TIMESTAMP)
	;

DSNUTIL_PAREN_YEAR
	: DSNUTIL_YEAR
	->type(DSNUTIL_YEAR)
	;

DSNUTIL_PAREN_YEARS
	: DSNUTIL_YEARS
	->type(DSNUTIL_YEARS)
	;

DSNUTIL_PAREN_MONTH
	: DSNUTIL_MONTH
	->type(DSNUTIL_MONTH)
	;

DSNUTIL_PAREN_MONTHS
	: DSNUTIL_MONTHS
	->type(DSNUTIL_MONTHS)
	;

DSNUTIL_PAREN_DAY
	: DSNUTIL_DAY
	->type(DSNUTIL_DAY)
	;

DSNUTIL_PAREN_DAYS
	: DSNUTIL_DAYS
	->type(DSNUTIL_DAYS)
	;

DSNUTIL_PAREN_HOUR
	: DSNUTIL_HOUR
	->type(DSNUTIL_HOUR)
	;

DSNUTIL_PAREN_HOURS
	: DSNUTIL_HOURS
	->type(DSNUTIL_HOURS)
	;

DSNUTIL_PAREN_MINUTE
	: DSNUTIL_MINUTE
	->type(DSNUTIL_MINUTE)
	;

DSNUTIL_PAREN_MINUTES
	: DSNUTIL_MINUTES
	->type(DSNUTIL_MINUTES)
	;

DSNUTIL_PAREN_SECOND
	: DSNUTIL_SECOND
	->type(DSNUTIL_SECOND)
	;

DSNUTIL_PAREN_SECONDS
	: DSNUTIL_SECONDS
	->type(DSNUTIL_SECONDS)
	;

DSNUTIL_PAREN_MICROSECOND
	: DSNUTIL_MICROSECOND
	->type(DSNUTIL_MICROSECOND)
	;

DSNUTIL_PAREN_MICROSECONDS
	: DSNUTIL_MICROSECONDS
	->type(DSNUTIL_MICROSECONDS)
	;

DSNUTIL_PAREN_KEYCARD
	: DSNUTIL_KEYCARD
	->type(DSNUTIL_KEYCARD)
	;

DSNUTIL_PAREN_RECORD
	: DSNUTIL_RECORD
	->type(DSNUTIL_RECORD)
	;

DSNUTIL_PAREN_TEXT
	: DSNUTIL_TEXT
	->type(DSNUTIL_TEXT)
	;

DSNUTIL_PAREN_BLKSZLIM_SUFFIX
	: DSNUTIL_BLKSZLIM_SUFFIX
	->type(DSNUTIL_BLKSZLIM_SUFFIX)
	;

DSNUTIL_PAREN_NPI
	: DSNUTIL_NPI
	->type(DSNUTIL_NPI)
	;

DSNUTIL_PAREN_PROFILE
	: DSNUTIL_PROFILE
	->type(DSNUTIL_PROFILE)
	;

DSNUTIL_PAREN_CHANGE
	: DSNUTIL_CHANGE
	->type(DSNUTIL_CHANGE)
	;

DSNUTIL_PAREN_DATAONLY
	: DSNUTIL_DATAONLY
	->type(DSNUTIL_DATAONLY)
	;

DSNUTIL_PAREN_HEX_LIT
	: DSNUTIL_HEX_LIT
	->type(DSNUTIL_HEX_LIT)
	;

DSNUTIL_PAREN_EXTERNAL
	: DSNUTIL_EXTERNAL
	->type(DSNUTIL_EXTERNAL)
	;

DSNUTIL_PAREN_UR
	: DSNUTIL_UR
	->type(DSNUTIL_UR)
	;

DSNUTIL_PAREN_CS
	: DSNUTIL_CS
	->type(DSNUTIL_CS)
	;

DSNUTIL_PAREN_REFERENCE
	: DSNUTIL_REFERENCE
	->type(DSNUTIL_REFERENCE)
	;

DSNUTIL_PAREN_NONE
	: DSNUTIL_NONE
	->type(DSNUTIL_NONE)
	;

DSNUTIL_PAREN_AUTO
	: DSNUTIL_AUTO
	->type(DSNUTIL_AUTO)
	;

DSNUTIL_PAREN_CONTINUE
	: DSNUTIL_CONTINUE
	->type(DSNUTIL_CONTINUE)
	;

DSNUTIL_PAREN_PAUSE
	: DSNUTIL_PAUSE
	->type(DSNUTIL_PAUSE)
	;

DSNUTIL_PAREN_ONLY
	: DSNUTIL_ONLY
	->type(DSNUTIL_ONLY)
	;

DSNUTIL_PAREN_TERM
	: DSNUTIL_TERM
	->type(DSNUTIL_TERM)
	;

DSNUTIL_PAREN_DRAIN
	: DSNUTIL_DRAIN
	->type(DSNUTIL_DRAIN)
	;

DSNUTIL_PAREN_ABEND
	: DSNUTIL_ABEND
	->type(DSNUTIL_ABEND)
	;

DSNUTIL_PAREN_WRITERS
	: DSNUTIL_WRITERS
	->type(DSNUTIL_WRITERS)
	;

DSNUTIL_PAREN_WITH_TIME_ZONE
	: DSNUTIL_WITH_TIME_ZONE
	->type(DSNUTIL_WITH_TIME_ZONE)
	;

DSNUTIL_PAREN_PLUS
	: DSNUTIL_PLUS
	->type(DSNUTIL_PLUS)
	;

DSNUTIL_PAREN_MINUS
	: DSNUTIL_MINUS
	->type(DSNUTIL_MINUS)
	;

DSNUTIL_PAREN_BASIC
	: DSNUTIL_BASIC
	->type(DSNUTIL_BASIC)
	;

DSNUTIL_PAREN_EXTENDED
	: DSNUTIL_EXTENDED
	->type(DSNUTIL_EXTENDED)
	;

DSNUTIL_PAREN_RESET
	: DSNUTIL_RESET
	->type(DSNUTIL_RESET)
	;

DSNUTIL_PAREN_REPORT
	: DSNUTIL_REPORT
	->type(DSNUTIL_REPORT)
	;

DSNUTIL_PAREN_INVALIDATE
	: DSNUTIL_INVALIDATE
	->type(DSNUTIL_INVALIDATE)
	;

DSNUTIL_PAREN_CONSISTENT
	: DSNUTIL_CONSISTENT
	->type(DSNUTIL_CONSISTENT)
	;

DSNUTIL_PAREN_CATALOG
	: DSNUTIL_CATALOG
	->type(DSNUTIL_CATALOG)
	;

DSNUTIL_PAREN_RRF
	: DSNUTIL_RRF
	->type(DSNUTIL_RRF)
	;

DSNUTIL_PAREN_BRF
	: DSNUTIL_BRF
	->type(DSNUTIL_BRF)
	;

DSNUTIL_PAREN_CONSTRAINTS
	: DSNUTIL_CONSTRAINTS
	->type(DSNUTIL_CONSTRAINTS)
	;

DSNUTIL_PAREN_READERS
	: DSNUTIL_READERS
	->type(DSNUTIL_READERS)
	;

DSNUTIL_PAREN_ACCESSPATH
	: DSNUTIL_ACCESSPATH
	->type(DSNUTIL_ACCESSPATH)
	;

DSNUTIL_PAREN_SPACE
	: DSNUTIL_SPACE
	->type(DSNUTIL_SPACE)
	;

DSNUTIL_PAREN_ROUND_CEILING
	: DSNUTIL_ROUND_CEILING
	->type(DSNUTIL_ROUND_CEILING)
	;

DSNUTIL_PAREN_ROUND_DOWN
	: DSNUTIL_ROUND_DOWN
	->type(DSNUTIL_ROUND_DOWN)
	;

DSNUTIL_PAREN_ROUND_FLOOR
	: DSNUTIL_ROUND_FLOOR
	->type(DSNUTIL_ROUND_FLOOR)
	;

DSNUTIL_PAREN_ROUND_HALF_DOWN
	: DSNUTIL_ROUND_HALF_DOWN
	->type(DSNUTIL_ROUND_HALF_DOWN)
	;

DSNUTIL_PAREN_ROUND_HALF_EVEN
	: DSNUTIL_ROUND_HALF_EVEN
	->type(DSNUTIL_ROUND_HALF_EVEN)
	;

DSNUTIL_PAREN_ROUND_HALF_UP
	: DSNUTIL_ROUND_HALF_UP
	->type(DSNUTIL_ROUND_HALF_UP)
	;

DSNUTIL_PAREN_ROUND_UP
	: DSNUTIL_ROUND_UP
	->type(DSNUTIL_ROUND_UP)
	;

DSNUTIL_PAREN_UNLOAD
	: DSNUTIL_UNLOAD
	->type(DSNUTIL_UNLOAD)
	;

DSNUTIL_PAREN_SQLDS
	: DSNUTIL_SQLDS
	->type(DSNUTIL_SQLDS)
	;

DSNUTIL_PAREN_INTERNAL
	: DSNUTIL_INTERNAL
	->type(DSNUTIL_INTERNAL)
	;

DSNUTIL_PAREN_LOGLIMIT
	: DSNUTIL_LOGLIMIT
	->type(DSNUTIL_LOGLIMIT)
	;

DSNUTIL_PAREN_UPDATED
	: DSNUTIL_UPDATED
	->type(DSNUTIL_UPDATED)
	;

DSNUTIL_PAREN_PMNO 
	: DSNUTIL_PMNO 
	->type(DSNUTIL_PMNO)
	;

DSNUTIL_PAREN_PMPREF 
	: DSNUTIL_PMPREF 
	->type(DSNUTIL_PMPREF)
	;

DSNUTIL_PAREN_PMREQ
	: DSNUTIL_PMREQ
	->type(DSNUTIL_PMREQ)
	;

DSNUTIL_PAREN_INLCOPY
	: DSNUTIL_INLCOPY
	->type(DSNUTIL_INLCOPY)
	;

DSNUTIL_PAREN_FCCOPY
	: DSNUTIL_FCCOPY
	->type(DSNUTIL_FCCOPY)
	;

DSNUTIL_PAREN_S390
	: DSNUTIL_S390
	->type(DSNUTIL_S390)
	;

DSNUTIL_PAREN_IEEE
	: DSNUTIL_IEEE
	->type(DSNUTIL_IEEE)
	;

DSNUTIL_PAREN_NUMBER
	: [0-9]+ ('.' [0-9]+)?
	;

DSNUTIL_PAREN_COLON
	: COLON
	;

/*
Added the ':' to prevent greedy matching from eating it up in...

PART(3:5)

...and thus it, and...

PART(3 : 5)

...are recognized the same way by the parser.  This should make
listeners and visitors easier.
*/
DSNUTIL_PAREN_IDENTIFIER
	: ~[ \t\n\r,.;:)('"=><+-]+
	//->type(DSNUTIL_IDENTIFIER)
	;

mode DSNUTIL_DOUBLE_APOS_MODE;
/*
Why are we here?

Whilst processing, a double apostrophe token has been encountered.
Until another double apostrophe token is encountered, all characters
are considered to be one token.

This is tricky because we want to exit differently depending on how
we arrived.  Hence, the switch statement.  I did consider having
three different copies of this mode, the only difference being how
they exited.  That seemed less clear than this.
*/

DSNUTIL_DOUBLE_APOS1
	: '\'\''
	{
		switch(_modeStack.peek()) {
			case DSNUTIL_DSN_WS_MODE :
				popMode(); //back to DSNUTIL_DSN_WS_MODE
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			case DSNUTIL_DSN_MODE :
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			default :
				popMode(); //back to "parent" mode
				break;
		}
	}
	;

DSNUTIL_DOUBLE_APOS_CHAR
	: DSNUTIL_APOS_CHAR
	//->type(DSNUTIL_IDENTIFIER)
	;

mode DSNUTIL_APOS_MODE;
/*
Why are we here?

Whilst processing, an apostrophe token has been encountered.
Until another apostrophe token is encountered, all characters
are considered to be one token.

This is tricky because we want to exit differently depending on how
we arrived.  Hence, the switch statement.  I did consider having
several different copies of this mode, the only difference being
how they exited.  That seemed less clear than this.

It's also tricky because there may be an apostrophe or a quote
following the DSNUTIL_APOS token, indicating the end of the
argument.  That's why it's important to get back to DSNUTIL_MODE.
*/

DSNUTIL_APOS
	: '\''
	{
		switch(_modeStack.peek()) {
			case DSNUTIL_DSN_WS_MODE :
				popMode(); //back to DSNUTIL_DSN_WS_MODE
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			case DSNUTIL_DSN_MODE :
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			default :
				popMode(); //back to "parent" mode
				break;
		}
	}
	;

DSNUTIL_APOS_CHAR
	: ~'\''+
	//->type(DSNUTIL_IDENTIFIER)
	;

mode DSNUTIL_QUOTE_MODE;

/*
Why are we here?

Whilst processing, a quote token has been encountered.
Until another quote token is encountered, all characters
are considered to be one token.

This is tricky because we want to exit differently depending on how
we arrived.  Hence, the switch statement.  I did consider having
three different copies of this mode, the only difference being how
they exited.  That seemed less clear than this.
*/

DSNUTIL_QUOTE1
	: '"'
	{
		switch(_modeStack.peek()) {
			case DSNUTIL_DSN_WS_MODE :
				popMode(); //back to DSNUTIL_DSN_WS_MODE
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			case DSNUTIL_DSN_MODE :
				popMode(); //back to DSNUTIL_DSN_MODE
				popMode(); //back to DSNUTIL_MODE
				break;
			default :
				popMode(); //back to DSNUTIL_MODE
				break;
		}
	}
	;

DSNUTIL_QUOTE_CHAR
	: ~'"'+
	//->type(DSNUTIL_IDENTIFIER)
	;


