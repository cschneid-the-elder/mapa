/*
Copyright (C) 2019 - 2023 Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This grammar was built targeting the Java implementation of ANTLR 4, and 
contains embedded code you may have to modify if targeting a different
source code implementation.  

A job consists of a JOB statement followed by one or more STEPs.

A STEP consists of an EXEC statement followed by one or more DD
statements and OUTPUT statements.

An EXEC statement may execute a PGM or a PROC.

A statement generally looks like this...

//[NAME] OP [PARAMETER[,PARAMETER[...]]] COMMENTS COMMENTS COMMENTS
00000000011111111112222222222333333333344444444445555555555666666666677777777778
12345678901234567890123456789012345678901234567890123456789012345678901234567890

So, NAME is optional but the variable # spaces following are not, followed
by OP (operation) followed by some white space, followed by parameters,
followed by white space, optionally followed by comments.

Or...

//            [mandatory]
NAME          [optional]
whitespace    [mandatory]
OPERATION     [mandatory]
whitespace    [mandatory]
PARAMETERs    [optional, depends on OPERATION]
whitespace    [indicates what follows are comments]
COMMENTS

...so whitespace is a delimiter and sometimes indicates what follows
is comments and not to be recognized as parameters.

//ELBOW JOB 'HI THERE',TIME=7 HERE IS A COMMENT
//ZEBRA    EXEC PGM=J8765309 ,PARM='THIS IS A COMMENT STARTING AT THE COMMA'
//STEPLIB  DD  DISP=SHR,DSN=PATCH.LIB
//         DD  DISP=SHR,DSN=PROD.LIB
//DD001    DD  DISP=SHR,DSN=SYS1.PARMLIB
//DD002    DD  DISP=(NEW,CATLG,DELETE),
//             DSN=THIS.IS.STILL.THE.DD002.STMT,
//             MGMTCLAS=STD, still the same statement
//             AVGREC=K, still the same statement
//             LRECL=80, still the same statement
//             SPACE=(80,(10,10),RLSE,CONTIG,ROUND) end of statement

Also, it is difficult to overstate the ugliness of the DLM parameter in
conjunction with DD * and DD DATA.  DLM=&PARM is not supported, you'll
have to write an application to make that work.

Sometimes a parameter and an operation look identical, e.g. NOTIFY.

JES3 control statements are not currently supported.


{System.out.println(getLine() + ":" + getCharPositionInLine() + " / " + getText() + "/");}
{System.out.println("NAME_FIELD found " + getVocabulary().getSymbolicName(myTerminalNode.getSymbol().getType()));}
*/



lexer grammar JCLLexer;

@lexer::members {
	public java.util.ArrayList<String> dlmVals = new java.util.ArrayList();
	public String dlmString = null;
	public int myMode = DEFAULT_MODE;
	public Boolean inExecPgmMode = false;
}

tokens { NAME , ALNUMNAT , DELIMITER_STATEMENT , COMMENT_FLAG , CNTL , COMMAND , DD , ELSE , ENDCNTL , ENDIF , EXEC , IF , INCLUDE , JCLLIB , JOB , NOTIFY , OUTPUT , PEND , PROC , SCHEDULE , SET , XMIT, EQUAL , ACCODE , AMP , ASTERISK , AVGREC , BLKSIZE ,  BLKSZLIM , BUFNO , BURST , CCSID , CHARS , CHKPT , COPIES , DATA , DATACLAS , DCB , DDNAME , DEST , DIAGNS , DISP , DLM , DSID , DSKEYLBL , DSN , DSNAME , DSNTYPE , DUMMY , DYNAM , EATTR , EXPDT , EXPORT , FCB , FILEDATA , FLASH , FREE , FREEVOL , GDGORDER , HOLD , KEYLABL1 , KEYLABL2 , KEYENCD1 , KEYENCD2 , KEYLEN , KEYOFF , LABEL , LGSTREAM , LIKE , LRECL , MAXGENS , MGMTCLAS , MODE, MODIFY , NULLOVRD , OUTLIM , OUTPUT , PATH , PATHDISP , PATHMODE , PATHOPTS , PROTECT , RECFM , RECORG , REFDD , RETPD , RLS , ROACCESS , SECMODEL , SEGMENT , SPACE , SPIN , STORCLAS , SUBSYS , SYMBOLS , SYMLIST , SYSOUT , TERM , UCS , UNIT , VOL , VOLUME , COMMA , ABEND , ABENDCC , NOT_SYMBOL , TRUE , FALSE , RC , RUN , CNVTSYS , EXECSYS , JCLONLY , LOGGING_DDNAME , NUM_LIT , LPAREN , RPAREN , BFALN , BFTEK , BUFIN , BUFL , BUFMAX , BUFOFF , BUFOUT , BUFRQ , BUFSIZE , CODE , CPRI , CYLOFL , DEN , DSORG , EROPT , FUNC , GNCP , HIARCHY , INTVL , IPLTXID , LIMCT , NCP , NTM , OPTCD , PCI , PRTSP , RESERVE , RKP , SOWA , STACK , THRESH , TRTCH , ADDRSPC , BYTES , CARDS , CCSID , CLASS , COND , DSENQSHR , EMAIL , GDGBIAS , GROUP , JESLOG , JOBRC , LINES , MEMLIMIT , MSGCLASS , MSGLEVEL , NOTIFY , PAGES , PASSWORD , PERFORM , PRTY , RD , REGION , REGIONX , RESTART , ROLL , SECLABEL , SYSAFF , SCHENV , SYSTEM , TIME , TYPRUN , UJOBCORR , USER , COMMENT_TEXT , DATASET_NAME , EXEC_PARM_STRING , DOT , DEST_VALUE , QUOTED_STRING_PROGRAMMER_NAME , SUBCHARS , SEP , JOB_ACCT_MODE_UNQUOTED_STRING }

channels { COMMENTS }

// lexer rules --------------------------------------------------------------------------------

SS
	: SLASH SLASH
	{
		/*
		System.out.println(getLine() + ":" + getCharPositionInLine() + " / " + getText());
		*/
	}
	{
		getCharPositionInLine() == 2
	}?
	->mode(NM_MODE)
	;

SA
	: SLASH ASTERISK
	{
		getCharPositionInLine() == 2
	}?
	->mode(JES2_CNTL_MODE)
	;

DELIMITER_STATEMENT_1
	: SA [ ]+
	{
		myMode = DEFAULT_MODE;
	}
	->type(DELIMITER_STATEMENT),mode(CM_MODE)
	;

DELIMITER_STATEMENT_2
	: SA NEWLINE
	->type(DELIMITER_STATEMENT)
	;

COMMENT_FLAG_DFLT
	: SLASH SLASH ASTERISK
	{
		getCharPositionInLine() == 3
	}?
	->type(COMMENT_FLAG),channel(COMMENTS),mode(CM_MODE);

DD_ASTERISK_DATA_FLAG1
	: (ANYCHAR)+?
	{
		dlmVals = new java.util.ArrayList();
		dlmVals.add("/*");
		dlmVals.add("//");
		myMode = DEFAULT_MODE;
	}
	{
		getCharPositionInLine() == getText().length()
	}?
	->type(DD_ASTERISK_DATA),mode(DATA_MODE)
	;

COMMENT_FLAG_INLINE
	: COMMA_DFLT ' '
	->channel(COMMENTS),mode(CM_MODE)
	;
SYMBOLIC
	: AMPERSAND [A-Z0-9@#$]+
	{
		getText().length() <= 9
	}?
	;

ALPHA
	: [A-Z]
	;
AMPERSAND
	: '&'
	;
ASTERISK
	: '*'
	;

COMMA_DFLT
	: ','
	->type(COMMA),channel(HIDDEN)
	;
DOT_DFLT
	: '.'
	->type(DOT)
	;
EQUAL_DFLT
	: '='
	->type(EQUAL)
	;
LPAREN_DFLT
	: '('
	->type(LPAREN)
	;
fragment NATL
	: [@#$]
	;

NEWLINE
	: [\n\r]
	->channel(HIDDEN)
	;
NOT_SYMBOL_DFLT
	: [^!]
	->type(NOT_SYMBOL)
	;
NULLFILE
	: N U L L F I L E
	;
fragment NUM
	: [0-9]
	;
RPAREN_DFLT
	: ')'
	->type(RPAREN)
	;

SLASH
	: '/'
	;
SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
fragment SQUOTE2
	: SQUOTE SQUOTE
	;

WS
	: [ ]+
	->channel(HIDDEN),mode(CM_MODE)
	;

fragment ANYCHAR
	: ~[\n\r]
	;
fragment NAME
	: (NATL | ALPHA) (ALPHA | NATL | NUM)* {getText().length() < 9}?
	;
NUM_LIT_DFLT
	: NUM+
	->type(NUM_LIT)
	;
fragment ALNUMNAT
	: (ALPHA | NATL | NUM)+
	;
UNQUOTED_STRING
	: (~['\n\r] | SQUOTE2)+?
	;


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

ERROR_CHAR
	: .
	;

mode CM_MODE
	;

CM_NEWLINE
	: NEWLINE
	{
		mode(myMode);
	}
	->channel(HIDDEN)
	;
CM_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

ERROR_CHAR_CM
	: .
	;

/*

COMMA_WS_MODE is used when encountering a comma followed by 
whitespace which indicates the statement is continued but there
may be an inline or embedded comment.  This inline or embedded
comment may be followed by one or more comment statements.

Syntactically, there can be no NAME_FIELD on a following physical
line.  Only COMMENT_FLAG or SS follwed by CONTINUATION_WS are
allowed.  The former is the pattern that, when matched, does the
double popMode to return to the "invoking" mode.

*/
mode COMMA_WS_MODE
	;

COMMA_WS_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	->type(COMMENT_TEXT),channel(COMMENTS)
	;
COMMA_WS_NEWLINE
	: NEWLINE
	->channel(HIDDEN),pushMode(COMMA_WS_NEWLINE_MODE)
	;

ERROR_CHAR_COMMA_WS
	: .
	;

mode COMMA_WS_NEWLINE_MODE
	;

COMMA_WS_NEWLINE_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),popMode
	;
COMMA_WS_NEWLINE_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN),popMode,popMode
	;

ERROR_CHAR_COMMA_WS_NEWLINE
	: .
	;

mode COMMA_NEWLINE_MODE
	;

COMMA_NEWLINE_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),pushMode(COMMA_NEWLINE_CM_MODE)
	;
COMMA_NEWLINE_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN),popMode
	;

ERROR_CHAR_COMMA_NEWLINE
	: .
	;

mode COMMA_NEWLINE_CM_MODE
	;

COMMA_NEWLINE_CM_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	->type(COMMENT_TEXT),channel(COMMENTS)
	;
COMMA_NEWLINE_CM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),popMode
	;

ERROR_CHAR_COMMA_NEWLINE_CM
	: .
	;

mode JES2_CNTL_MODE
	;

JES2_JOBPARM
	: J O B P A R M
	->mode(JES2_JOBPARM_MODE)
	;
JES2_MESSAGE
	: M E S S A G E
	->mode(JES2_MESSAGE_MODE)
	;
JES2_NETACCT
	: N E T A C C T
	->mode(JES2_NETACCT_MODE)
	;
JES2_NOTIFY
	: N O T I F Y
	->mode(JES2_NOTIFY_MODE)
	;
JES2_OUTPUT
	: O U T P U T
	->mode(JES2_OUTPUT_MODE)
	;
JES2_PRIORITY
	: P R I O R I T Y
	->mode(JES2_PRIORITY_MODE)
	;
JES2_ROUTE
	: R O U T E
	->mode(JES2_ROUTE_MODE)
	;
JES2_SETUP
	: S E T U P
	->mode(JES2_SETUP_MODE)
	;
JES2_SIGNOFF
	: S I G N O F F
	->mode(CM_MODE)
	;
JES2_SIGNON
	: S I G N O N
	->mode(JES2_SIGNON_MODE)
	;
JES2_XEQ
	: X E Q
	->mode(JES2_XEQ_MODE)
	;
JES2_XMIT
	: X M I T
	->mode(JES2_XMIT_MODE)
	;

ERROR_CHAR_JES2_CNTL
	: .
	;

mode NM_MODE
	;

JOBLIB
	: J O B L I B
	->mode(OP_MODE)
	;

SYSCHK
	: S Y S C H K
	->mode(OP_MODE)
	;

fragment NM_PART
	: [A-Z@#$] [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]?
	;

NAME_FIELD
	: NM_PART (DOT_DFLT NM_PART)?
	{
		_modeStack.clear();
	}
	->mode(OP_MODE)
	;

CONTINUATION_WS
	: ' '+
	{
		getText().length() <= 13
	}?
	->channel(HIDDEN),mode(OP_MODE)
	;

NM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_NM
	: .
	;

mode OP_MODE
	;

CNTL_OP
	: C N T L
	->mode(CNTL_MODE),type(CNTL)
	;
COMMAND_OP
	: C O M M A N D
	->mode(COMMAND_MODE),type(COMMAND)
	;
DD_OP
	: D D
	->mode(DD_MODE),type(DD)
	;
ELSE_OP
	: E L S E
	->mode(CM_MODE),type(ELSE)
	;
ENDCNTL_OP
	: E N D C N T L
	->mode(CM_MODE),type(ENDCNTL)
	;
ENDIF_OP
	: E N D I F
	->mode(CM_MODE),type(ENDIF)
	;
EXEC_OP
	: E X E C
	{
		inExecPgmMode = false;
	}
	->mode(EXEC1_MODE),type(EXEC)
	;
EXPORT_OP
	: E X P O R T
	->mode(EXPORT_STMT_MODE),type(EXPORT)
	;
IF_OP
	: I F
	->mode(IF_MODE),type(IF)
	;
INCLUDE_OP
	: I N C L U D E
	->mode(INCLUDE_MODE),type(INCLUDE)
	;
JCLLIB_OP
	: J C L L I B
	->mode(JCLLIB_MODE),type(JCLLIB)
	;
JOB_OP
	: J O B
	->mode(JOB1_MODE),type(JOB)
	;
NOTIFY_OP
	: N O T I F Y
	->mode(NOTIFY_STMT_MODE)
	;
OUTPUT_OP
	: O U T P U T
	->mode(OUTPUT_STMT_MODE),type(OUTPUT)
	;
PEND_OP
	: P E N D
	->mode(CM_MODE),type(PEND)
	;
PROC_OP
	: P R O C
	->mode(PROC_MODE),type(PROC)
	;
SCHEDULE_OP
	: S C H E D U L E
	->mode(SCHEDULE_MODE),type(SCHEDULE)
	;
SET_OP
	: S E T
	->mode(SET_MODE),type(SET)
	;
XMIT_OP
	: X M I T 
	{
		dlmVals.add("/*");
		dlmVals.add("//");
		myMode = DATA_MODE;
	}
	->mode(XMIT_MODE),type(XMIT)
	;

JOBGROUP_OP
	: J O B G R O U P
	->mode(JOBGROUP_MODE)
	;
GJOB_OP
	: G J O B
	->mode(GJOB_MODE)
	;
JOBSET_OP
	: J O B S E T
	->mode(JOBSET_MODE)
	;
SJOB_OP
	: S J O B
	->mode(SJOB_MODE)
	;
ENDSET_OP
	: E N D S E T
	->mode(ENDSET_MODE)
	;
AFTER_OP
	: A F T E R
	->mode(AFTER_MODE)
	;
BEFORE_OP
	: B E F O R E
	->mode(BEFORE_MODE)
	;
CONCURRENT_OP
	: C O N C U R R E N T
	->mode(CONCURRENT_MODE)
	;
ENDGROUP_OP
	: E N D G R O U P
	->mode(ENDGROUP_MODE)
	;

JCL_COMMAND
	: [A-Z0-9@#$]+
	->mode(JCL_COMMAND_MODE)
	;

WS_OP
	: [ ]+
	->channel(HIDDEN)
	;
NEWLINE_OP
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_OP
	: .
	;

mode COMMAND_MODE
	;

COMMAND_WS
	: ' '+
	->channel(HIDDEN),mode(COMMAND_PARM_MODE)
	;

ERROR_CHAR_COMMAND
	: .
	;

mode COMMAND_PARM_MODE
	;

COMMAND_PARM_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;
COMMAND_PARM_WS
	: ' '+
	->channel(HIDDEN),mode(CM_MODE)
	;
COMMAND_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_COMMAND_PARM
	: .
	;

mode JCL_COMMAND_MODE
	;

JCL_COMMAND_WS
	: ' '+
	->channel(HIDDEN),mode(JCL_COMMAND_PARM_MODE)
	;

ERROR_CHAR_JCL_COMMAND
	: .
	;

mode JCL_COMMAND_PARM_MODE
	;

JCL_COMMAND_PARM
	: [)(A-Z0-9@#$*\-+&./%,:]+
	;
JCL_COMMAND_PARM_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;
JCL_COMMAND_PARM_WS
	: ' '+
	->channel(HIDDEN),mode(CM_MODE)
	;
JCL_COMMAND_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_JCL_COMMAND_PARM
	: .
	;

mode EXEC1_MODE
	;

/*
Because we can have...

//DOTHIS EXEC PGM=J8675309

...and...

//DOTHIS EXEC PROC=P99

...not to mention...

//DOTHIS EXEC P99

...and we must treat all similarly but not identically.  Note
that any unrecognized characters after intervening whitespace
is the name of a procedure in EXEC1_MODE, whilst a similar pattern
results in the name of a parameter for such a procedure in
EXEC3_MODE.
*/

WS_POST_EX
	: [ ]+
	->channel(HIDDEN)
	;
PGM
	: P G M
	{
		inExecPgmMode = true;
	}
	->mode(EXEC2_MODE)
	;
PROC_EX
	: P R O C
	->mode(EXEC2_MODE)
	;
EXEC_PROC_NAME
	: NM_PART
	->type(KEYWORD_VALUE),mode(EXEC2_MODE)
	;

ERROR_CHAR_EXEC1
	: .
	;

mode EXEC2_MODE
	;

EXEC_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),pushMode(KYWD_VAL_MODE)
	;

EXEC_ABDISPCC
	: A B D I S P C C
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_ACCT
	: A C C T (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_ADDRSPC
	: A D D R S P C (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_CCSID
	: C C S I D (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_COND
	: C O N D (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_DYNAMNBR
	: D Y N A M N B R (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_MEMLIMIT
	: M E M L I M I T (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_PARM
	: P A R M (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_PARMDD
	: P A R M D D (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_PERFORM
	: P E R F O R M (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_RD
	: R D (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_REGION
	: R E G I O N (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_REGIONX
	: R E G I O N X (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_RLSTMOUT
	: R L S T M O U T (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_ROLL
	: R O L L (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_TIME
	: T I M E (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_TVSMSG
	: T V S M S G (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_TVSAMCOM
	: T V S A M C O M (DOT_DFLT NM_PART)?
	->pushMode(KYWD_VAL_MODE)
	;

EXEC_PROC_PARM
	: NAME
	{
		!inExecPgmMode
	}?
	->pushMode(KYWD_VAL_MODE)
	;

EXEC_CONTINUED
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
EXEC_COMMENT_FLAG_INLINE
	: COMMENT_FLAG_INLINE
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
EXEC_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
EXEC_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
EXEC_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;
EXEC_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),pushMode(COMMA_NEWLINE_CM_MODE)
	;
EXEC_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN)
	;

ERROR_CHAR_EXEC2
	: .
	;

mode IF_MODE
	;

IF_EQ
	: ('=' | (E Q));
IF_GE
	: (('>' '=') | (G E))
	;
IF_GT
	: ('>' | (G T))
	;
IF_LE
	: (('<' '=') | (L E))
	;
IF_LT
	: ('<' | (L T))
	;
IF_NE
	: ((NOT_SYMBOL_DFLT '=') | (N E))
	;
IF_NG
	: ((N G) | (NOT_SYMBOL_DFLT '>'))
	;
IF_NL
	: ((N L) | (NOT_SYMBOL_DFLT '<'))
	;
IF_NOT
	: NOT_SYMBOL_DFLT
	->type(NOT_SYMBOL)
	;

IF_ABEND
	: A B E N D
	->type(ABEND)
	;
IF_ABENDCC
	: A B E N D C C
	->type(ABENDCC)
	;
IF_FALSE
	: F A L S E
	->type(FALSE)
	;
IF_RC
	: R C
	->type(RC)
	;
IF_RUN
	: R U N
	->type(RUN)
	;
THEN
	: T H E N
	->mode(DEFAULT_MODE)
	;
IF_TRUE
	: T R U E
	->type(TRUE)
	;
IF_WS
	: [ ]+
	->channel(HIDDEN)
	;
IF_NEWLINE
	: [\n\r]
	->channel(HIDDEN)
	;
IF_SS
	: SS
	->channel(HIDDEN)
	;
IF_LOGICAL
	: AMPERSAND | (A N D) | '|' | (O R)
	;
IF_LPAREN
	: LPAREN_DFLT
	->type(LPAREN)
	;
IF_RPAREN
	: RPAREN_DFLT
	->type(RPAREN)
	;
IF_REL_EXP_KEYWORD
	: IF_ABEND | IF_ABENDCC | IF_RC | IF_RUN
	;
IF_STEP
	: NM_PART DOT_DFLT (NM_PART DOT_DFLT)?
	;
IF_NUM_LIT
	: NUM_LIT_DFLT
	->type(NUM_LIT)
	;
IF_ALNUMNAT
	: ALNUMNAT
	->type(ALNUMNAT)
	;

ERROR_CHAR_IF
	: .
	;

mode DD_MODE
	;

DD_WS
	: [ ]+
	->channel(HIDDEN),mode(DD_PARM_MODE)
	;
DD_NEWLINE1
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_DD
	: .
	;

mode DD_PARM_MODE
	;

DD_CONTINUED
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
DD_COMMENT_FLAG_INLINE
	: COMMENT_FLAG_INLINE
	->type(COMMENT_FLAG_INLINE),channel(COMMENTS),pushMode(COMMA_WS_MODE)
	;
DD_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
DD_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
DD_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;
DD_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),pushMode(COMMA_NEWLINE_CM_MODE)
	;
DD_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN)
	;

DD_ACCODE
	: A C C O D E
	->type(ACCODE),pushMode(KYWD_VAL_MODE)
	;
DD_AMP
	: A M P
	->type(AMP),pushMode(KYWD_VAL_MODE)
	;
DD_AVGREC
	: A V G R E C
	->type(AVGREC),pushMode(KYWD_VAL_MODE)
	;
DD_ASTERISK
	: '*'
	{
		dlmVals = new java.util.ArrayList();
		dlmVals.add("/*");
		dlmVals.add("//");
		myMode = DATA_MODE;
	}
	->type(ASTERISK),pushMode(DATA_PARM_MODE)
	;
DD_BLKSIZE
	: B L K S I Z E
	->type(BLKSIZE),pushMode(KYWD_VAL_MODE)
	;
DD_BLKSZLIM
	: B L K S Z L I M
	->type(BLKSZLIM),pushMode(KYWD_VAL_MODE)
	;
DD_BURST
	: B U R S T
	->type(BURST),pushMode(KYWD_VAL_MODE)
	;
DD_CCSID
	: C C S I D
	->type(CCSID),pushMode(KYWD_VAL_MODE)
	;
DD_CHARS
	: C H A R S
	->type(CHARS),pushMode(KYWD_VAL_MODE)
	;
DD_CHKPT
	: C H K P T
	->type(CHKPT),pushMode(KYWD_VAL_MODE)
	;
DD_CNTL
	: C N T L
	->type(CNTL),pushMode(KYWD_VAL_MODE)
	;
DD_COPIES
	: C O P I E S
	->type(COPIES),pushMode(KYWD_VAL_MODE)
	;
DD_DATA
	: D A T A
	{
		dlmVals = new java.util.ArrayList();
		dlmVals.add("/*");
		myMode = DATA_MODE;
	}
	->type(DATA),pushMode(DATA_PARM_MODE)
	;
DD_DATACLAS
	: D A T A C L A S
	->type(DATACLAS),pushMode(KYWD_VAL_MODE)
	;
DD_DCB
	: D C B
	->type(DCB),pushMode(DCB_MODE)
	;
DD_DDNAME
	: D D N A M E
	->type(DDNAME),pushMode(KYWD_VAL_MODE)
	;
DD_DEST
	: D E S T
	->type(DEST),pushMode(KYWD_VAL_MODE)
	;
DD_DISP
	: D I S P
	->type(DISP),pushMode(KYWD_VAL_MODE)
	;
DD_DLM
	: D L M
	->type(DLM),pushMode(DLM_MODE)
	;
DD_DSID
	: D S I D
	->type(DSID),pushMode(KYWD_VAL_MODE)
	;
DD_DSKEYLBL
	: D S K E Y L B L
	->type(DSKEYLBL),pushMode(KYWD_VAL_MODE)
	;
DD_DSN
	: D S N
	->type(DSN),pushMode(KYWD_VAL_MODE)
	;
DD_DSNAME
	: D S N A M E
	->type(DSNAME),pushMode(KYWD_VAL_MODE)
	;
DD_DSNTYPE
	: D S N T Y P E
	->type(DSNTYPE),pushMode(KYWD_VAL_MODE)
	;
DD_DUMMY
	: D U M M Y
	->type(DUMMY)
	;
DD_DYNAM
	: D Y N A M
	->type(DYNAM)
	;
DD_EATTR
	: E A T T R
	->type(EATTR),pushMode(KYWD_VAL_MODE)
	;
DD_EXPDT
	: E X P D T
	->type(EXPDT),pushMode(KYWD_VAL_MODE)
	;
DD_FCB
	: F C B
	->type(FCB),pushMode(KYWD_VAL_MODE)
	;
DD_FILEDATA
	: F I L E D A T A
	->type(FILEDATA),pushMode(KYWD_VAL_MODE)
	;
DD_FLASH
	: F L A S H
	->type(FLASH),pushMode(KYWD_VAL_MODE)
	;
DD_FREE
	: F R E E
	->type(FREE),pushMode(KYWD_VAL_MODE)
	;
DD_FREEVOL
	: F R E E V O L
	->type(FREEVOL),pushMode(KYWD_VAL_MODE)
	;
DD_GDGORDER
	: G D G O R D E R
	->type(GDGORDER),pushMode(KYWD_VAL_MODE)
	;
DD_HOLD
	: H O L D
	->type(HOLD),pushMode(KYWD_VAL_MODE)
	;
DD_KEYLABL1
	: K E Y L A B L '1'
	->type(KEYLABL1),pushMode(KYWD_VAL_MODE)
	;
DD_KEYLABL2
	: K E Y L A B L '2'
	->type(KEYLABL2),pushMode(KYWD_VAL_MODE)
	;
DD_KEYENCD1
	: K E Y E N C D '1'
	->type(KEYENCD1),pushMode(KYWD_VAL_MODE)
	;
DD_KEYENCD2
	: K E Y E N C D '2'
	->type(KEYENCD2),pushMode(KYWD_VAL_MODE)
	;
DD_KEYLEN
	: K E Y L E N
	->type(KEYLEN),pushMode(KYWD_VAL_MODE)
	;
DD_KEYOFF
	: K E Y O F F
	->type(KEYOFF),pushMode(KYWD_VAL_MODE)
	;
DD_LABEL
	: L A B E L
	->type(LABEL),pushMode(KYWD_VAL_MODE)
	;
DD_LGSTREAM
	: L G S T R E A M
	->type(LGSTREAM),pushMode(KYWD_VAL_MODE)
	;
DD_LIKE
	: L I K E
	->type(LIKE),pushMode(KYWD_VAL_MODE)
	;
DD_LRECL
	: L R E C L
	->type(LRECL),pushMode(KYWD_VAL_MODE)
	;
DD_MAXGENS
	: M A X G E N S
	->type(MAXGENS),pushMode(KYWD_VAL_MODE)
	;
DD_MGMTCLAS
	: M G M T C L A S
	->type(MGMTCLAS),pushMode(KYWD_VAL_MODE)
	;
DD_MODIFY
	: M O D I F Y
	->type(MODIFY),pushMode(KYWD_VAL_MODE)
	;
DD_NULLOVRD
	: N U L L O V R D
	->type(NULLOVRD)
	;
DD_OUTLIM
	: O U T L I M
	->type(OUTLIM),pushMode(KYWD_VAL_MODE)
	;
DD_OUTPUT
	: O U T P U T
	->type(OUTPUT),pushMode(KYWD_VAL_MODE)
	;
DD_PATH
	: P A T H
	->type(PATH),pushMode(KYWD_VAL_MODE)
	;
DD_PATHDISP
	: P A T H D I S P
	->type(PATHDISP),pushMode(KYWD_VAL_MODE)
	;
DD_PATHMODE
	: P A T H M O D E
	->type(PATHMODE),pushMode(KYWD_VAL_MODE)
	;
DD_PATHOPTS
	: P A T H O P T S
	->type(PATHOPTS),pushMode(KYWD_VAL_MODE)
	;
DD_PROTECT
	: P R O T E C T
	->type(PROTECT),pushMode(KYWD_VAL_MODE)
	;
DD_RECFM
	: R E C F M
	->type(RECFM),pushMode(KYWD_VAL_MODE)
	;
DD_RECORG
	: R E C O R G
	->type(RECORG),pushMode(KYWD_VAL_MODE)
	;
DD_REFDD
	: R E F D D
	->type(REFDD),pushMode(KYWD_VAL_MODE)
	;
DD_RETPD
	: R E T P D
	->type(RETPD),pushMode(KYWD_VAL_MODE)
	;
DD_RLS
	: R L S
	->type(RLS),pushMode(KYWD_VAL_MODE)
	;
DD_ROACCESS
	: R O A C C E S S
	->type(ROACCESS),pushMode(KYWD_VAL_MODE)
	;
DD_SECMODEL
	: S E C M O D E L
	->type(SECMODEL),pushMode(KYWD_VAL_MODE)
	;
DD_SEGMENT
	: S E G M E N T
	->type(SEGMENT),pushMode(KYWD_VAL_MODE)
	;
/*
While obsolete and undocumented, SEP is still allowed.  Its purpose was to
specify (a) unit(s) or channel(s) to be separate.  For example...

//SYSUT1   DD  UNIT=SYSDA
//SYSUT2   DD  UNIT=SYSDA,SEP=(SYSUT1) NOT ON THE SAME DEVICE AS SYSUT1
//SYSUT3   DD  DISP=(,CATLG),
//             DSN=OUTPUT.LARGE,
//             UNIT=(SYSDA,SEP=(SYSUT1,SYSUT2)),
//             SPACE=(CYL,(1000,1000))

...thus SYSUT1, SYSUT2, and SYSUT3 are all on generic devices SYSDA but
not on the same physical device.  Important in the old days, not so
much now.  But still tolerated by the JCL interpreter.

*/
DD_SEP
	: S E P
	->type(SEP),pushMode(KYWD_VAL_MODE)
	;
DD_SPACE
	: S P A C E
	->type(SPACE),pushMode(KYWD_VAL_MODE)
	;
DD_SPIN
	: S P I N
	->type(SPIN),pushMode(KYWD_VAL_MODE)
	;
DD_STORCLAS
	: S T O R C L A S
	->type(STORCLAS),pushMode(KYWD_VAL_MODE)
	;
DD_SUBSYS
	: S U B S Y S
	->type(SUBSYS),pushMode(KYWD_VAL_MODE)
	;
DD_SYMBOLS
	: S Y M B O L S
	->type(SYMBOLS),pushMode(KYWD_VAL_MODE)
	;
DD_SYMLIST
	: S Y M L I S T
	->type(SYMLIST),pushMode(KYWD_VAL_MODE)
	;
DD_SYSOUT
	: S Y S O U T
	->type(SYSOUT),pushMode(KYWD_VAL_MODE)
	;
DD_TERM
	: T E R M
	->type(TERM),pushMode(KYWD_VAL_MODE)
	;
DD_UCS
	: U C S
	->type(UCS),pushMode(KYWD_VAL_MODE)
	;
DD_UNIT
	: U N I T
	->type(UNIT),pushMode(KYWD_VAL_MODE)
	;
DD_VOL
	: V O L
	->type(VOL),pushMode(KYWD_VAL_MODE)
	;
DD_VOLUME
	: V O L U M E
	->type(VOLUME),pushMode(KYWD_VAL_MODE)
	;

DD_BFALN
	: B F A L N
	->type(BFALN),pushMode(KYWD_VAL_MODE)
	;
DD_BFTEK
	: B F T E K
	->type(BFTEK),pushMode(KYWD_VAL_MODE)
	;
DD_BUFIN
	: B U F I N
	->type(BUFIN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFL
	: B U F L
	->type(BUFL),pushMode(KYWD_VAL_MODE)
	;
DD_BUFMAX
	: B U F M A X
	->type(BUFMAX),pushMode(KYWD_VAL_MODE)
	;
DD_BUFNO
	: B U F N O
	->type(BUFNO),pushMode(KYWD_VAL_MODE)
	;
DD_BUFOFF
	: B U F O F F
	->type(BUFOFF),pushMode(KYWD_VAL_MODE)
	;
DD_BUFOUT
	: B U F O U T
	->type(BUFOUT),pushMode(KYWD_VAL_MODE)
	;
/*
Obsolete.  QTAM only.  Possibly still tolerated.
*/
DD_BUFRQ
	: B U F R Q
	->type(BUFRQ),pushMode(KYWD_VAL_MODE)
	;
DD_BUFSIZE
	: B U F S I Z E
	->type(BUFSIZE),pushMode(KYWD_VAL_MODE)
	;
/*
Obsolete.  Paper tape only.  Possibly still tolerated.
*/
DD_CODE
	: C O D E
	->type(CODE),pushMode(KYWD_VAL_MODE)
	;
DD_CPRI
	: C P R I
	->type(CPRI),pushMode(KYWD_VAL_MODE)
	;
DD_CYLOFL
	: C Y L O F L
	->type(CYLOFL),pushMode(KYWD_VAL_MODE)
	;
DD_DEN
	: D E N
	->type(DEN),pushMode(KYWD_VAL_MODE)
	;
DD_DIAGNS
	: D I A G N S
	->type(DIAGNS),pushMode(KYWD_VAL_MODE)
	;
DD_DSORG
	: D S O R G
	->type(DSORG),pushMode(KYWD_VAL_MODE)
	;
DD_EROPT
	: E R O P T
	->type(EROPT),pushMode(KYWD_VAL_MODE)
	;
DD_FUNC
	: F U N C
	->type(FUNC),pushMode(KYWD_VAL_MODE)
	;
DD_GNCP
	: G N C P
	->type(GNCP),pushMode(KYWD_VAL_MODE)
	;
/*
HIARCHY is obsolete but probably still tolerated.
syntax: HIARCHY={0|1}
example: DCB=(DSORG=DA,HIARCHY=0)
*/
DD_HIARCHY
	: H I A R C H Y
	->type(HIARCHY),pushMode(KYWD_VAL_MODE)
	;
DD_INTVL
	: I N T V L
	->type(INTVL),pushMode(KYWD_VAL_MODE)
	;
DD_IPLTXID
	: I P L T X I D
	->type(IPLTXID),pushMode(KYWD_VAL_MODE)
	;
DD_LIMCT
	: L I M C T
	->type(LIMCT),pushMode(KYWD_VAL_MODE)
	;
DD_MODE
	: M O D E
	->type(MODE),pushMode(KYWD_VAL_MODE)
	;
DD_NCP
	: N C P
	->type(NCP),pushMode(KYWD_VAL_MODE)
	;
DD_NTM
	: N T M
	->type(NTM),pushMode(KYWD_VAL_MODE)
	;
DD_OPTCD
	: O P T C D
	->type(OPTCD),pushMode(KYWD_VAL_MODE)
	;
DD_PCI
	: P C I
	->type(PCI),pushMode(KYWD_VAL_MODE)
	;
DD_PRTSP
	: P R T S P
	->type(PRTSP),pushMode(KYWD_VAL_MODE)
	;
DD_RESERVE
	: R E S E R V E
	->type(RESERVE),pushMode(KYWD_VAL_MODE)
	;
DD_RKP
	: R K P
	->type(RKP),pushMode(KYWD_VAL_MODE)
	;
/*
Obsolete.  QTAM only.  Possibly still tolerated.
*/
DD_SOWA
	: S O W A
	->type(SOWA),pushMode(KYWD_VAL_MODE)
	;
DD_STACK
	: S T A C K
	->type(STACK),pushMode(KYWD_VAL_MODE)
	;
DD_THRESH
	: T H R E S H
	->type(THRESH),pushMode(KYWD_VAL_MODE)
	;
DD_TRTCH
	: T R T C H
	->type(TRTCH),pushMode(KYWD_VAL_MODE)
	;

ERROR_CHAR_DD_PARM
	: .
	;

mode EXPORT_STMT_MODE
	;

EXPORT_STMT_WS
	: [ ]+
	->channel(HIDDEN),mode(EXPORT_STMT_PARM_MODE)
	;

ERROR_CHAR_EXPORT_STMT
	: .
	;

mode EXPORT_STMT_PARM_MODE
	;

EXPORT_STMT_PARM_SYMLIST
	: DD_SYMLIST
	->type(SYMLIST),pushMode(KYWD_VAL_MODE)
	;
EXPORT_STMT_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
EXPORT_STMT_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_EXPORT_STMT_PARM
	: .
	;

mode NOTIFY_STMT_MODE
	;

NOTIFY_STMT_WS
	: [ ]+
	->channel(HIDDEN),mode(NOTIFY_STMT_PARM_MODE)
	;

ERROR_CHAR_NOTIFY_STMT
	: .
	;

mode NOTIFY_STMT_PARM_MODE
	;

NOTIFY_STMT_PARM_EMAIL
	: E M A I L
	->pushMode(KYWD_VAL_MODE)
	;
NOTIFY_STMT_PARM_USER
	: U S E R
	->pushMode(KYWD_VAL_MODE)
	;
NOTIFY_STMT_PARM_TYPE
	: T Y P E
	->pushMode(KYWD_VAL_MODE)
	;
NOTIFY_STMT_PARM_WHEN
	: W H E N
	->pushMode(KYWD_VAL_MODE)
	;
NOTIFY_STMT_PARM_WS
	: [ ]+
	->channel(HIDDEN),mode(CM_MODE)
	;
NOTIFY_STMT_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
NOTIFY_STMT_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
NOTIFY_STMT_COMMA_WS
	: COMMA_DFLT ' '+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
NOTIFY_STMT_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

ERROR_CHAR_NOTIFY_STMT_PARM
	: .
	;

mode OUTPUT_STMT_MODE
	;

OUTPUT_STMT_WS
	: [ ]+
	->channel(HIDDEN),mode(OUTPUT_STMT_PARM_MODE)
	;

ERROR_CHAR_OUTPUT_STMT
	: .
	;

mode OUTPUT_STMT_PARM_MODE
	;

OUTPUT_STMT_CONTINUED
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
OUTPUT_STMT_COMMENT_FLAG_INLINE
	: COMMENT_FLAG_INLINE
	->type(COMMENT_FLAG_INLINE),channel(COMMENTS),pushMode(COMMA_WS_MODE)
	;
OUTPUT_STMT_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
OUTPUT_STMT_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
OUTPUT_STMT_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;
OUTPUT_STMT_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),pushMode(COMMA_NEWLINE_CM_MODE)
	;
OUTPUT_STMT_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN)
	;

OUTPUT_STMT_ADDRESS
	: A D D R E S S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_AFPPARMS
	: A F P P A R M S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_AFPSTATS
	: A F P S T A T S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_BUILDING
	: B U I L D I N G
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_BURST
	: B U R S T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_CHARS
	: C H A R S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_CKPTLINE
	: C K P T L I N E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_CKPTPAGE
	: C K P T P A G E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_CKPTSEC
	: C K P T S E C
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_CLASS
	: C L A S S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_COLORMAP
	: C O L O R M A P
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_COMPACT
	: C O M P A C T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_COMSETUP
	: C O M S E T U P
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_CONTROL
	: C O N T R O L
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_COPIES
	: C O P I E S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_COPYCNT
	: C O P Y C N T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_DATACK
	: D A T A C K
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_DDNAME
	: D D N A M E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_DEFAULT
	: D E F A U L T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_DEPT
	: D E P T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_DEST
	: D E S T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_DPAGELBL
	: D P A G E L B L
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_DUPLEX
	: D U P L E X
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_FCB
	: F C B
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_FLASH
	: F L A S H
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_FORMDEF
	: F O R M D E F
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_FORMLEN
	: F O R M L E N
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_FORMS
	: F O R M S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_FSSDATA
	: F S S D A T A
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_GROUPID
	: G R O U P I D
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_INDEX
	: I N D E X
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_INTRAY
	: I N T R A Y
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_JESDS
	: J E S D S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_LINDEX
	: L I N D E X
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_LINECT
	: L I N E C T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_MAILBCC
	: M A I L B C C
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_MAILCC
	: M A I L C C
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_MAILFILE
	: M A I L F I L E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_MAILFROM
	: M A I L F R O M
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_MAILTO
	: M A I L T O
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_MERGE
	: M E R G E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_MODIFY
	: M O D I F Y
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_NAME
	: N A M E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_NOTIFY
	: N O T I F Y
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OFFSETXB
	: O F F S E T X B
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OFFSETXF
	: O F F S E T X F
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OFFSETYB
	: O F F S E T Y B
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OFFSETYF
	: O F F S E T Y F
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OUTBIN
	: O U T B I N
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OUTDISP
	: O U T D I S P
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OVERLAYB
	: O V E R L A Y B
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OVERLAYF
	: O V E R L A Y F
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_OVFL
	: O V F L
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PAGEDEF
	: P A G E D E F
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PIMSG
	: P I M S G
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PORTNO
	: P O R T N O
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PRMODE
	: P R M O D E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PRTATTRS
	: P R T A T T R S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PRTERROR
	: P R T E R R O R
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PRTOPTNS
	: P R T O P T N S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PRTQUEUE
	: P R T Q U E U E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_PRTY
	: P R T Y
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_REPLYTO
	: R E P L Y T O
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_RESFMT
	: R E S F M T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_RETAINS
	: R E T A I N S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_RETAINF
	: R E T A I N F
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_RETRYL
	: R E T R Y L
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_RETRYT
	: R E T R Y T
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_ROOM
	: R O O M
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_SYSAREA
	: S Y S A R E A
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_THRESHLD
	: T H R E S H L D
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_TITLE
	: T I T L E
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_TRC
	: T R C
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_UCS
	: U C S
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_USERDATA
	: U S E R D A T A
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_USERLIB
	: U S E R L I B
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_USERPATH
	: U S E R P A T H
	->pushMode(KYWD_VAL_MODE)
	;
OUTPUT_STMT_WRITER
	: W R I T E R
	->pushMode(KYWD_VAL_MODE)
	;

ERROR_CHAR_OUTPUT_STMT_PARM
	: .
	;

mode PROC_MODE
	;

PROC_WS
	: [ ]+
	->channel(HIDDEN),mode(PROC_PARM_MODE)
	;
PROC_NEWLINE
	: [\n\r]
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
PROC_WS_NEWLINE
	: PROC_WS PROC_NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_PROC
	: .
	;

mode PROC_PARM_MODE
	;

PROC_PARM_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),pushMode(PROC_PARM_VALUE_MODE)
	;
PROC_PARM_NAME
	: NM_PART
	;

/*
There is no check for whitespace here because whitespace
in this mode is invalid.
*/
ERROR_CHAR_PROC_PARM
	: .
	;

mode PROC_PARM_VALUE_MODE
	;

PROC_PARM_VALUE_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
PROC_PARM_VALUE
	: SET_PARM_VALUE
	->type(KEYWORD_VALUE)
	;
PROC_PARM_VALUE_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;

PROC_PARM_VALUE_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),mode(COMMA_NEWLINE_MODE)
	;
PROC_PARM_VALUE_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),mode(COMMA_WS_MODE)
	;
PROC_PARM_VALUE_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
PROC_PARM_VALUE_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
PROC_PARM_VALUE_COMMA
	: COMMA_DFLT
	->channel(HIDDEN),popMode
	;

ERROR_CHAR_PROC_PARM_VALUE
	: .
	;

mode SCHEDULE_MODE
	;

SCHEDULE_WS
	: [ ]+
	->channel(HIDDEN),mode(SCHEDULE_PARM_MODE)
	;
SCHEDULE_NEWLINE
	: [\n\r]
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
SCHEDULE_WS_NEWLINE
	: PROC_WS PROC_NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_SCHEDULE
	: .
	;

mode SCHEDULE_PARM_MODE
	;

SCHEDULE_PARM_AFTER
	: A F T E R
	->pushMode(KYWD_VAL_MODE)
	;
SCHEDULE_PARM_BEFORE
	: B E F O R E
	->pushMode(KYWD_VAL_MODE)
	;
SCHEDULE_PARM_DELAY
	: D E L A Y
	->pushMode(KYWD_VAL_MODE)
	;
SCHEDULE_PARM_HOLDUNTIL
	: H O L D U N T I L
	->pushMode(KYWD_VAL_MODE)
	;
SCHEDULE_PARM_JOBGROUP
	: J O B G R O U P
	->pushMode(KYWD_VAL_MODE)
	;
SCHEDULE_PARM_STARTBY
	: S T A R T B Y
	->pushMode(KYWD_VAL_MODE)
	;
SCHEDULE_PARM_WITH
	: W I T H
	->pushMode(KYWD_VAL_MODE)
	;

SCHEDULE_PARM_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
SCHEDULE_PARM_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
SCHEDULE_PARM_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
SCHEDULE_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
SCHEDULE_PARM_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;

ERROR_CHAR_SCHEDULE_PARM
	: .
	;

mode SET_MODE
	;

SET_WS
	: [ ]+
	->channel(HIDDEN),mode(SET_PARM_MODE)
	;
SET_NEWLINE
	: [\n\r]
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
SET_WS_NEWLINE
	: SET_WS SET_NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_SET
	: .
	;

mode SET_PARM_MODE
	;

SET_PARM_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),pushMode(SET_PARM_VALUE_MODE)
	;
SET_PARM_NAME
	: NM_PART
	;

/*
There is no check for whitespace here because whitespace
in this mode is invalid.
*/
ERROR_CHAR_SET_PARM
	: .
	;

mode SET_PARM_VALUE_MODE
	;

SET_PARM_VALUE_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
SET_PARM_VALUE
	: (KEYWORD_VALUE | [)(A-Z0-9@#$*\-+&./%[_]+)
	->type(KEYWORD_VALUE)
	;
SET_PARM_VALUE_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;

/*
These two are mode() on purpose, the popMode in the target modes will correctly
bring us back to SET_PARM_MODE.  The lack of _modeStack.clear() is intentional.
*/
SET_PARM_VALUE_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),mode(COMMA_NEWLINE_MODE)
	;
SET_PARM_VALUE_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),mode(COMMA_WS_MODE)
	;

SET_PARM_VALUE_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
SET_PARM_VALUE_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
SET_PARM_VALUE_COMMA
	: COMMA_DFLT
	->channel(HIDDEN),popMode
	;

ERROR_CHAR_SET_PARM_VALUE
	: .
	;

mode XMIT_MODE
	;

XMIT_WS
	: WS
	->channel(HIDDEN),mode(XMIT_PARM_MODE)
	;
XMIT_NEWLINE
	: [\n\r]
	->channel(HIDDEN),mode(DATA_MODE)
	;

ERROR_CHAR_XMIT
	: .
	;

mode XMIT_PARM_MODE
	;

XMIT_PARM_DEST
	: D E S T
	->type(DEST),pushMode(KYWD_VAL_MODE)
	;
XMIT_PARM_DLM
	: DD_DLM
	->type(DLM),pushMode(DLM_MODE)
	;
XMIT_PARM_SUBCHAR
	: S U B C H A R S
	->type(SUBCHARS),pushMode(KYWD_VAL_MODE)
	;
XMIT_PARM_NEWLINE
	: [\n\r]
	->channel(HIDDEN),mode(DATA_MODE)
	;
XMIT_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
XMIT_PARM_WS_NEWLINE
	: WS NEWLINE
	->channel(HIDDEN),mode(CM_MODE)
	;
XMIT_PARM_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
XMIT_PARM_COMMA_WS
	: COMMA_DFLT WS
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
XMIT_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

ERROR_CHAR_XMIT_PARM
	: .
	;

mode JOBGROUP_MODE
	;

JOBGROUP_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOBGROUP_WS
	: WS
	->channel(HIDDEN),mode(JOBGROUP_ACCT1_MODE)
	;

ERROR_CHAR_JOBGROUP
	: .
	;

mode JOBGROUP_ACCT1_MODE
	;

JOBGROUP_ACCT1_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOBGROUP_ACCT1_WS
	: [ ]+
	->channel(HIDDEN),mode(CM_MODE)
	;
JOBGROUP_ACCT1_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),mode(JOBGROUP_ACCT_COMMA_WS_MODE)
	;
JOBGROUP_ACCT1_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),mode(JOBGROUP_ACCT_COMMA_NEWLINE_MODE)
	;
JOBGROUP_ACCT1_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),mode(JOBGROUP_ACCT2_MODE)
	;
JOBGROUP_ACCT1_COMMA
	: COMMA_DFLT
	->channel(HIDDEN),mode(JOBGROUP_PROGRAMMER_NAME_MODE)
	;

JOBGROUP_EMAIL
	: E M A I L
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_GROUP
	: G R O U P
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_HOLD
	: H O L D
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_ERROR
	: E R R O R
	->pushMode(JOBGROUP_ERROR_MODE)
	;
JOBGROUP_ONERROR
	: O N E R R O R
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_OWNER
	: O W N E R
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PASSWORD
	: P A S S W O R D
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SECLABEL
	: S E C L A B E L
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SCHENV
	: S C H E N V
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SYSAFF
	: S Y S A F F
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SYSTEM
	: S Y S T E M
	->pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_TYPE
	: T Y P E
	->pushMode(KYWD_VAL_MODE)
	;

JOBGROUP_ACCT1_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;

JOBGROUP_ACCT_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	;

ERROR_CHAR_JOBGROUP_ACCT1
	: .
	;

mode JOBGROUP_ACCT_COMMA_WS_MODE
	;

JOBGROUP_ACCT_COMMA_WS_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	->type(COMMENT_TEXT),channel(COMMENTS)
	;
JOBGROUP_ACCT_COMMA_WS_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(JOBGROUP_ACCT_COMMA_WS_NEWLINE_MODE)
	;

ERROR_CHAR_JOBGROUP_ACCT_COMMA_WS
	: .
	;

mode JOBGROUP_ACCT_COMMA_WS_NEWLINE_MODE
	;

JOBGROUP_ACCT_COMMA_WS_NEWLINE_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),mode(JOBGROUP_ACCT_COMMA_WS_MODE)
	;
JOBGROUP_ACCT_COMMA_WS_NEWLINE_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN),mode(JOBGROUP_PROGRAMMER_NAME_MODE)
	;

/*
There is no check for whitespace here because whitespace
in this mode is invalid.
*/
ERROR_CHAR_JOBGROUP_ACCT_COMMA_WS_NEWLINE
	: .
	;

mode JOBGROUP_ACCT_COMMA_NEWLINE_MODE
	;

JOBGROUP_ACCT_COMMA_NEWLINE_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),mode(JOBGROUP_ACCT_COMMA_NEWLINE_CM_MODE)
	;
JOBGROUP_ACCT_COMMA_NEWLINE_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN),mode(JOBGROUP_PROGRAMMER_NAME_MODE)
	;

/*
There is no check for whitespace here because whitespace
in this mode is invalid.
*/
ERROR_CHAR_JOBGROUP_ACCT_COMMA_NEWLINE
	: .
	;

mode JOBGROUP_ACCT_COMMA_NEWLINE_CM_MODE
	;

JOBGROUP_ACCT_COMMA_NEWLINE_CM_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	->type(COMMENT_TEXT),channel(COMMENTS)
	;
JOBGROUP_ACCT_COMMA_NEWLINE_CM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(JOBGROUP_ACCT_COMMA_NEWLINE_MODE)
	;

ERROR_CHAR_JOBGROUP_ACCT_COMMA_NEWLINE_CM
	: .
	;

mode JOBGROUP_ACCT2_MODE
	;

JOBGROUP_ACCT2_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOBGROUP_ACCT2_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
JOBGROUP_ACCT2_RPAREN
	: RPAREN_DFLT
	->type(RPAREN),mode(JOBGROUP_ACCT3_MODE)
	;

JOBGROUP_ACCT2_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
JOBGROUP_ACCT2_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	->type(JOBGROUP_ACCT_UNQUOTED_STRING)
	;

JOBGROUP_ACCT2_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_JOBGROUP_ACCT2
	: .
	;

mode JOBGROUP_ACCT3_MODE
	;

JOBGROUP_ACCT3_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOBGROUP_ACCT3_COMMA
	: COMMA_DFLT
	->channel(HIDDEN),mode(JOBGROUP_PROGRAMMER_NAME_MODE)
	;
JOBGROUP_ACCT3_COMMA_WS
	: COMMA_DFLT ' '+
	->channel(HIDDEN),mode(JOBGROUP_ACCT_COMMA_WS_MODE)
	;
JOBGROUP_ACCT3_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),mode(JOBGROUP_ACCT_COMMA_WS_NEWLINE_MODE)
	;

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_JOBGROUP_ACCT3
	: .
	;

mode JOBGROUP_PROGRAMMER_NAME_MODE
	;

JOBGROUP_PROGRAMMER_NAME_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_WS
	: [ ]+
	->channel(HIDDEN),mode(CM_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;

JOBGROUP_PROGRAMMER_NAME_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

JOBGROUP_PROGRAMMER_NAME_EMAIL
	: JOBGROUP_EMAIL
	->type(JOBGROUP_EMAIL),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_GROUP
	: JOBGROUP_GROUP
	->type(JOBGROUP_GROUP),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_HOLD
	: JOBGROUP_HOLD
	->type(JOBGROUP_HOLD),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_ERROR
	: JOBGROUP_ERROR
	->type(JOBGROUP_ERROR),pushMode(JOBGROUP_ERROR_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_ONERROR
	: JOBGROUP_ONERROR
	->type(JOBGROUP_ONERROR),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_OWNER
	: JOBGROUP_OWNER
	->type(JOBGROUP_OWNER),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_PASSWORD
	: JOBGROUP_PASSWORD
	->type(JOBGROUP_PASSWORD),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SCHENV
	: JOBGROUP_SCHENV
	->type(JOBGROUP_SCHENV),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SECLABEL
	: JOBGROUP_SECLABEL
	->type(JOBGROUP_SECLABEL),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SYSAFF
	: JOBGROUP_SYSAFF
	->type(JOBGROUP_SYSAFF),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SYSTEM
	: JOBGROUP_SYSTEM
	->type(JOBGROUP_SYSTEM),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_TYPE
	: JOBGROUP_TYPE
	->type(JOBGROUP_TYPE),pushMode(KYWD_VAL_MODE)
	;

JOBGROUP_PROGRAMMER_NAME_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	;

ERROR_CHAR_JOBGROUP_PROGRAMMER_NAME
	: .
	;

mode JOBGROUP_ERROR_MODE
	;

JOBGROUP_ERROR_EQUAL
	: EQUAL_DFLT
	->type(EQUAL)
	;
JOBGROUP_ERROR_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),mode(JOBGROUP_ERROR_PAREN_MODE)
	;

/*
There is no check for whitespace here because whitespace
in this mode is invalid.
*/
ERROR_CHAR_JOBGROUP_ERROR
	: .
	;

mode JOBGROUP_ERROR_PAREN_MODE
	;

JOBGROUP_ERROR_EQ
	: IF_EQ
	;
JOBGROUP_ERROR_GE
	: IF_GE
	;
JOBGROUP_ERROR_GT
	: IF_GT
	;
JOBGROUP_ERROR_LE
	: IF_LE
	;
JOBGROUP_ERROR_LT
	: IF_LT
	;
JOBGROUP_ERROR_NE
	: IF_NE
	;
JOBGROUP_ERROR_NG
	: IF_NG
	;
JOBGROUP_ERROR_NL
	: IF_NL
	;
JOBGROUP_ERROR_NOT
	: IF_NOT
	->type(NOT_SYMBOL)
	;

JOBGROUP_ERROR_ABEND
	: IF_ABEND
	->type(ABEND)
	;
JOBGROUP_ERROR_ABENDCC
	: IF_ABENDCC
	->type(ABENDCC)
	;
JOBGROUP_ERROR_FALSE
	: IF_FALSE
	->type(FALSE)
	;
JOBGROUP_ERROR_RC
	: IF_RC
	->type(RC)
	;
JOBGROUP_ERROR_RUN
	: IF_RUN
	->type(RUN)
	;
JOBGROUP_ERROR_TRUE
	: IF_TRUE
	->type(TRUE)
	;
JOBGROUP_ERROR_WS
	: WS
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_NEWLINE
	: NEWLINE
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_SS
	: SS
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_LOGICAL
	: IF_LOGICAL
	;
JOBGROUP_ERROR_PAREN_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),pushMode(JOBGROUP_ERROR_PAREN_MODE)
	;
JOBGROUP_ERROR_RPAREN
	: RPAREN_DFLT
	->type(RPAREN),popMode
	;
JOBGROUP_ERROR_NUM_LIT
	: NUM_LIT_DFLT
	->type(NUM_LIT)
	;
JOBGROUP_ERROR_ALNUMNAT
	: ALNUMNAT
	->type(ALNUMNAT)
	;

ERROR_CHAR_JOBGROUP_ERROR_PAREN
	: .
	;

mode GJOB_MODE
	;

GJOB_WS
	: WS
	->channel(HIDDEN),mode(GJOB_PARM_MODE)
	;
GJOB_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_GJOB
	: .
	;

mode GJOB_PARM_MODE
	;

GJOB_PARM_FLUSHTYP
	: F L U S H T Y P
	->pushMode(KYWD_VAL_MODE)
	;
GJOB_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
GJOB_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_GJOB_PARM
	: .
	;

mode JOBSET_MODE
	;

JOBSET_WS
	: WS
	->channel(HIDDEN),mode(JOBSET_PARM_MODE)
	;
JOBSET_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_JOBSET
	: .
	;

mode JOBSET_PARM_MODE
	;

JOBSET_PARM_FLUSHTYP
	: F L U S H T Y P
	->pushMode(KYWD_VAL_MODE)
	;
JOBSET_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
JOBSET_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_JOBSET_PARM
	: .
	;

mode SJOB_MODE
	;

SJOB_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
SJOB_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_SJOB
	: .
	;

mode ENDSET_MODE
	;

ENDSET_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
ENDSET_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_ENDSET
	: .
	;

mode AFTER_MODE
	;

AFTER_WS
	: WS
	->channel(HIDDEN),mode(AFTER_PARM_MODE)
	;

ERROR_CHAR_AFTER
	: .
	;

mode AFTER_PARM_MODE
	;

AFTER_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
AFTER_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
AFTER_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;
AFTER_PARM_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
AFTER_PARM_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;

AFTER_PARM_NAME
	: N A M E
	->pushMode(KYWD_VAL_MODE)
	;
AFTER_PARM_WHEN
	: W H E N
	->pushMode(JOBGROUP_ERROR_MODE)
	;
AFTER_PARM_ACTION
	: A C T I O N
	->pushMode(KYWD_VAL_MODE)
	;
AFTER_PARM_OTHERWISE
	: O T H E R W I S E
	->pushMode(KYWD_VAL_MODE)
	;

ERROR_CHAR_AFTER_PARM
	: .
	;

mode BEFORE_MODE
	;

BEFORE_WS
	: WS
	->channel(HIDDEN),mode(BEFORE_PARM_MODE)
	;

ERROR_CHAR_BEFORE
	: .
	;

mode BEFORE_PARM_MODE
	;

BEFORE_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
BEFORE_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
BEFORE_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;
BEFORE_PARM_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
BEFORE_PARM_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;

BEFORE_PARM_NAME
	: N A M E
	->pushMode(KYWD_VAL_MODE)
	;
BEFORE_PARM_WHEN
	: W H E N
	->pushMode(JOBGROUP_ERROR_MODE)
	;
BEFORE_PARM_ACTION
	: A C T I O N
	->pushMode(KYWD_VAL_MODE)
	;
BEFORE_PARM_OTHERWISE
	: O T H E R W I S E
	->pushMode(KYWD_VAL_MODE)
	;

ERROR_CHAR_BEFORE_PARM
	: .
	;

mode CONCURRENT_MODE
	;

CONCURRENT_WS
	: WS
	->channel(HIDDEN),mode(CONCURRENT_PARM_MODE)
	;

ERROR_CHAR_CONCURRENT
	: .
	;

mode CONCURRENT_PARM_MODE
	;

CONCURRENT_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
CONCURRENT_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
CONCURRENT_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;
CONCURRENT_PARM_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
CONCURRENT_PARM_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;

CONCURRENT_PARM_NAME
	: N A M E
	->pushMode(KYWD_VAL_MODE)
	;

ERROR_CHAR_CONCURRENT_PARM
	: .
	;

mode ENDGROUP_MODE
	;

ENDGROUP_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
ENDGROUP_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_ENDGROUP
	: .
	;

mode JES2_JOBPARM_MODE
	;

JES2_JOBPARM_WS
	: WS
	->channel(HIDDEN),mode(JES2_JOBPARM_PARM_MODE)
	;

ERROR_CHAR_JES2_JOBPARM
	: .
	;

mode JES2_JOBPARM_PARM_MODE
	;

JES2_JOBPARM_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
JES2_JOBPARM_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JES2_JOBPARM_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

JES2_JOBPARM_BURST
	: (B | (B U R S T))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_BYTES
	: (M | (B Y T E S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_CARDS
	: (C | (C A R D S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_COPIES
	: (N | (C O P I E S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_FORMS
	: (F | (F O R M S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_LINECT
	: (K | (L I N E C T))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_LINES
	: (L | (L I N E S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_NOLOG
	: (J | (N O L O G))
	;
JES2_JOBPARM_PAGES
	: (G | (P A G E S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_PROCLIB
	: (P | (P R O C L I B))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_RESTART
	: (E | (R E S T A R T))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_ROOM
	: (R | (R O O M))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_SYSAFF
	: (S | (S Y S A F F))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_JOBPARM_TIME
	: (T| (T I M E))
	->pushMode(KYWD_VAL_MODE)
	;

ERROR_CHAR_JES2_JOBPARM_PARM
	: .
	;

mode JES2_MESSAGE_MODE
	;

JES2_MESSAGE_WS
	: WS
	->channel(HIDDEN),mode(JES2_MESSAGE_PARM_MODE)
	;

ERROR_CHAR_JES2_MESSAGE
	: .
	;

mode JES2_MESSAGE_PARM_MODE
	;

JES2_MESSAGE_PARM_MSG
	: ANYCHAR+
	;
JES2_MESSAGE_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_JES2_MESSAGE_PARM
	: .
	;

mode JES2_NETACCT_MODE
	;

JES2_NETACCT_WS
	: WS
	->channel(HIDDEN),mode(JES2_NETACCT_PARM_MODE)
	;

ERROR_CHAR_JES2_NETACCT
	: .
	;

mode JES2_NETACCT_PARM_MODE
	;

JES2_NETACCT_PARM_NUMBER
	: ANYCHAR+
	;
JES2_NETACCT_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_JES2_NETACCT_PARM
	: .
	;

mode JES2_NOTIFY_MODE
	;

JES2_NOTIFY_WS
	: WS
	->channel(HIDDEN),mode(JES2_NOTIFY_PARM_MODE)
	;

ERROR_CHAR_JES2_NOTIFY
	: .
	;

mode JES2_NOTIFY_PARM_MODE
	;

JES2_NOTIFY_PARM
	: ANYCHAR+
	;
JES2_NOTIFY_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_JES2_NOTIFY_PARM
	: .
	;

mode JES2_OUTPUT_MODE
	;

JES2_OUTPUT_WS
	: WS
	->channel(HIDDEN),mode(JES2_OUTPUT_PARM_MODE)
	;

ERROR_CHAR_JES2_OUTPUT
	: .
	;

mode JES2_OUTPUT_PARM_MODE
	;

JES2_OUTPUT_PARM_WS
	: WS
	->channel(HIDDEN)
	;
JES2_OUTPUT_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JES2_OUTPUT_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

JES2_OUTPUT_CONTINUATION
	: ASTERISK {getCharPositionInLine() == 10}?
	;
JES2_OUTPUT_BURST
	: (B | (B U R S T))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_CHARS
	: (X | (C H A R S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_CKPTLNS
	: (E | (C K P T L N S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_CKPTPGS
	: (P | (C K P T P G S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_COMPACT
	: (Z | (C O M P A C T))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_COPIES
	: (N | (C O P I E S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_COPYG
	: (G | (C O P Y G))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_DEST
	: (D | (D E S T))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_FCB
	: (C | (F C B))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_FLASH
	: (O | (F L A S H))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_FLASHC
	: (Q | (F L A S H C))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_FORMS
	: (F | (F O R M S))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_INDEX
	: (I | (I N D E X))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_LINDEX
	: (L | (L I N D E X))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_LINECT
	: (K | (L I N E C T))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_MODIFY
	: (Y | (M O D I F Y))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_MODTRC
	: (M | (M O D T R C))
	->pushMode(KYWD_VAL_MODE)
	;
JES2_OUTPUT_UCS
	: (T | (U C S))
	->pushMode(KYWD_VAL_MODE)
	;

ERROR_CHAR_JES2_OUTPUT_PARM
	: .
	;

mode JES2_PRIORITY_MODE
	;

JES2_PRIORITY_WS
	: WS
	->channel(HIDDEN),mode(JES2_PRIORITY_PARM_MODE)
	;

ERROR_CHAR_JES2_PRIORITY
	: .
	;

mode JES2_PRIORITY_PARM_MODE
	;

JES2_PRIORITY_PARM
	: ANYCHAR+
	;
JES2_PRIORITY_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

ERROR_CHAR_JES2_PRIORITY_PARM
	: .
	;

mode JES2_ROUTE_MODE
	;

JES2_ROUTE_WS
	: WS
	->channel(HIDDEN),mode(JES2_ROUTE_PARM_MODE)
	;

ERROR_CHAR_JES2_ROUTE
	: .
	;

mode JES2_ROUTE_PARM_MODE
	;

JES2_ROUTE_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
JES2_ROUTE_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JES2_ROUTE_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

JES2_ROUTE_PRINT
	: (P R I N T)
	->pushMode(JES2_ROUTE_PARM1_MODE)
	;
JES2_ROUTE_PUNCH
	: (P U N C H)
	->pushMode(JES2_ROUTE_PARM1_MODE)
	;
JES2_ROUTE_XEQ
	: (X E Q)
	->pushMode(JES2_ROUTE_PARM1_MODE)
	;

ERROR_CHAR_JES2_ROUTE_PARM
	: .
	;

mode JES2_ROUTE_PARM1_MODE
	;

JES2_ROUTE_PARM1_WS
	: WS
	->channel(HIDDEN)
	;
JES2_ROUTE_VALUE
	: [A-Z0-9@#$*\-+&./%[:()]+
	->popMode
	;

ERROR_CHAR_JES2_ROUTE_PARM1
	: .
	;

mode JES2_SETUP_MODE
	;

JES2_SETUP_WS
	: WS
	->channel(HIDDEN),mode(JES2_SETUP_PARM_MODE)
	;

ERROR_CHAR_JES2_SETUP
	: .
	;

mode JES2_SETUP_PARM_MODE
	;

JES2_SETUP_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
JES2_SETUP_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JES2_SETUP_PARM_COMMA
	: COMMA_DFLT
	->type(COMMA)
	;

JES2_SETUP_VALUE
	: KEYWORD_VALUE
	->type(KEYWORD_VALUE)
	;

ERROR_CHAR_JES2_SETUP_PARM
	: .
	;

mode JES2_SIGNON_MODE
	;

JES2_SIGNON_WS
	: WS
	->channel(HIDDEN)
	;
JES2_SIGNON_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
fragment JES2_PASSWORD
	: [A-Z0-9@#$]
	 [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$]
	;

JES2_SIGNON_NODE
	: [A-Z@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$] [ A-Z0-9@#$]
	{
		getCharPositionInLine() == 24
	}?
	;
JES2_SIGNON_PASSWORD1
	: JES2_PASSWORD
	{
		getCharPositionInLine() == 32
	}?
	;
JES2_SIGNON_NEW_PASSWORD
	: JES2_PASSWORD
	{
		getCharPositionInLine() == 42
	}?
	;
JES2_SIGNON_PASSWORD2 :JES2_PASSWORD
	{
		getCharPositionInLine() == 80
	}?
	;

ERROR_CHAR_JES2_SIGNON
	: .
	;

mode JES2_XEQ_MODE
	;

JES2_XEQ_WS
	: WS
	->channel(HIDDEN)
	;
JES2_XEQ_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JES2_XEQ_NODE
	: [A-Z0-9@#$*\-+&./%[:()]+
	;

ERROR_CHAR_JES2_XEQ
	: .
	;

mode JES2_XMIT_MODE
	;

JES2_XMIT_WS
	: WS
	->channel(HIDDEN),mode(JES2_XMIT_NODE_MODE)
	;

ERROR_CHAR_JES2_XMIT
	: .
	;

mode JES2_XMIT_NODE_MODE
	;

JES2_XMIT_NODE_WS
	: WS
	{
		dlmVals = new java.util.ArrayList();
		dlmVals.add("/*");
	}
	->channel(HIDDEN),mode(JES2_XMIT_DLM_MODE)
	;
JES2_XMIT_NODE_NEWLINE
	: NEWLINE 
	{
		dlmVals = new java.util.ArrayList();
		dlmVals.add("/*");
	}
	->channel(HIDDEN),mode(DATA_MODE)
	;

JES2_XMIT_NODE
	: [A-Z0-9@#$*\-+&./%[:()]+
	;

ERROR_CHAR_JES2_XMIT_NODE
	: .
	;

mode JES2_XMIT_DLM_MODE
	;

JES2_XMIT_DLM
	: DD_DLM
	->type(DLM),pushMode(DLM_MODE)
	;
JES2_XMIT_DLM_WS
	: WS
	->channel(HIDDEN)
	;
JES2_XMIT_DLM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DATA_MODE)
	;

ERROR_CHAR_JES2_XMIT_DLM
	: .
	;

mode DATA_PARM_MODE
	;

/*
This adds some flavour.  Note that once in this mode, the only way out
is to hit either a newline or some whitespace and proceed through the
DATA_MODE to get back to DEFAULT_MODE.
*/

NEWLINE_DATA_PARM_MODE
	: [\n\r]
	->channel(HIDDEN),mode(DATA_MODE)
	;
WS_DATA_PARM_MODE
	: [ ]+
	->channel(HIDDEN),mode(CM_MODE)
	;
DATA_PARM_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;

DATA_PARM_MODE_BLKSIZE
	: DD_BLKSIZE
	->type(BLKSIZE),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_BUFNO
	: DD_BUFNO
	->type(BUFNO),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DCB
	: DD_DCB
	->type(DCB),pushMode(DCB_MODE)
	;
DATA_PARM_MODE_DIAGNS
	: DD_DIAGNS
	->type(DIAGNS),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DLM
	: DD_DLM
	->type(DLM),pushMode(DLM_MODE)
	;
DATA_PARM_MODE_DSID
	: DD_DSID
	->type(DSID),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DSN
	: DD_DSN
	->type(DSNAME),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DSNAME
	: DD_DSNAME
	->type(DSNAME),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_LIKE
	: DD_LIKE
	->type(LIKE),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_LRECL
	: DD_LRECL
	->type(LRECL),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_REFDD
	: DD_REFDD
	->type(REFDD),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_MODE
	: DD_MODE
	->type(MODE),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_VOL
	: DD_VOL
	->type(VOL),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_VOLUME
	: DD_VOLUME
	->type(VOLUME),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_EQUAL
	: EQUAL_DFLT
	->type(EQUAL)
	;
DATA_PARM_MODE_SYMBOLS
	: DD_SYMBOLS
	->type(SYMBOLS),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_SYMLIST
	: DD_SYMLIST
	->type(SYMLIST),pushMode(KYWD_VAL_MODE)
	;
 
ERROR_CHAR_DATA_PARM
	: .
	;

mode DLM_MODE
	;

DLM_EQUAL
	: EQUAL_DFLT
	->type(EQUAL);
DLM_SQUOTE
	: '\''
	{
		dlmString = new String();
	}
	->channel(HIDDEN),pushMode(QS_MODE);
DLM_VAL
	: [A-Z0-9@#$_\-]+ 
	{
			dlmVals = new java.util.ArrayList();
			dlmVals.add(getText());
	}
	->type(KEYWORD_VALUE),popMode
	;

/*
There is no check for whitespace here because whitespace
in this mode is invalid.
*/
ERROR_CHAR_DLM
	: .
	;

mode DATA_MODE
	;

/*
Note that newlines and whitespace are not routed to channel(HIDDEN).  This is 
because the data may need to be parsed on its own, possibly with another ANTLR
grammar.
*/

DATA_MODE_TERMINATOR1
	: SLASH SLASH ASTERISK {dlmVals.contains("//") && getCharPositionInLine() == 3}? 
	{
		dlmVals = new java.util.ArrayList();
		_modeStack.clear();
		myMode = DEFAULT_MODE;
	}
	->type(COMMENT_FLAG),channel(COMMENTS),mode(CM_MODE);
DATA_MODE_TERMINATOR2
	: SLASH SLASH {dlmVals.contains("//") && getCharPositionInLine() == 2}? 
	{
		dlmVals = new java.util.ArrayList();
		_modeStack.clear();
		myMode = DEFAULT_MODE;
	}
	->type(SS),mode(NM_MODE)
	;
DATA_MODE_TERMINATOR3
	: SLASH ASTERISK {dlmVals.contains("/*") && getCharPositionInLine() == 2}? 
	{
		dlmVals = new java.util.ArrayList();
		_modeStack.clear();
		myMode = DEFAULT_MODE;
	}
	->mode(DEFAULT_MODE)
	;
DATA_MODE_TERMINATORX
	: ANYCHAR+ {dlmVals.contains(getText())}?
	{
		dlmVals = new java.util.ArrayList();
		_modeStack.clear();
		myMode = DEFAULT_MODE;
	}
	->mode(DEFAULT_MODE)
	;
DD_ASTERISK_DATA
	: ([ \n\r] | ANYCHAR)+?
	;

ERROR_CHAR_DATA
	: .
	;

mode CNTL_MODE
	;

ASTERISK_CNTL
	: ASTERISK
	->type(ASTERISK),mode(CNTL_MODE_CM)
	;
NEWLINE_CNTL_MODE
	: NEWLINE
	->channel(HIDDEN),mode(CNTL_DATA_MODE)
	;

WS_CNTL
	: [ ]+
	->channel(HIDDEN)
	;

ERROR_CHAR_CNTL
	: .
	;

mode CNTL_MODE_CM
	;

CNTL_CM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(CNTL_DATA_MODE)
	;
CNTL_CM_COMMENT_TEXT
	: CM_COMMENT_TEXT
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

ERROR_CHAR_CNTL_CM
	: .
	;

mode CNTL_DATA_MODE
	;


/*
I don't like this, it really feels like a parser thing and not a lexer
thing, but the entire ENDCNTL statement functions as a terminator for
the CNTL_DATA capture.
*/
CNTL_MODE_TERMINATORX
	: SLASH SLASH ([A-Z0-9@#$]+)? [ ]+ (E N D C N T L)
	->mode(CM_MODE)
	;
CNTL_DATA
	: DD_ASTERISK_DATA+?
	;

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_CNTL_DATA
	: .
	;

mode QS_MODE
	;

QS_SQUOTE2
	: SQUOTE SQUOTE
	;
QS_SQUOTE
	: SQUOTE
	{
		switch(_modeStack.peek()) {
			case KYWD_VAL_MODE :
			case DCB_MODE :
				popMode();
				popMode();
				break;
			case DLM_MODE :
				dlmVals = new java.util.ArrayList();
				dlmVals.add(dlmString);
				popMode();
				popMode();
				break;
			default :
				popMode();
				break;
		}
	}
	->channel(HIDDEN)
	;
fragment ANYCHAR_NOSQUOTE
	: ~['\n\r]
	;
QS_NEWLINE
	: [\n\r]
	->channel(HIDDEN),pushMode(QS_SS_MODE)
	;
QS_AMPERSAND
	: AMPERSAND AMPERSAND
	;
QS_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
QUOTED_STRING_FRAGMENT
	: (ANYCHAR_NOSQUOTE)+?
	{
		switch(_modeStack.peek()) {
			case JOB_PROGRAMMER_NAME_MODE :
				setType(QUOTED_STRING_PROGRAMMER_NAME);
				break;
			case JOBGROUP_PROGRAMMER_NAME_MODE :
				setType(QUOTED_STRING_PROGRAMMER_NAME);
				break;
			case DLM_MODE :
				dlmString = dlmString.concat(getText());
				break;
			default :
				break;
		}
	}
 
	;

ERROR_CHAR_QS
	: .
	;

mode QS_SS_MODE
	;
QS_SS
	: SS
	{
		getCharPositionInLine() == 2
	}?
	->channel(HIDDEN)
	;
QS_SS_CONTINUATION_WS
	: ' '+
	{
		getText().length() <= 13
	}?
	->channel(HIDDEN),popMode
	;

QS_SS_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),mode(COMMA_WS_MODE)
	;

ERROR_CHAR_QS_SS
	: .
	;

mode DCB_MODE
	;

DCB_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),pushMode(DCB_PAREN_MODE)
	;
DCB_EQUAL
	: EQUAL_DFLT
	->type(EQUAL)
	;
DCB_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;
DCB_COMMA
	: COMMA_DFLT
	->more,popMode
	;
DCB_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

/*

Note how the mode switching works.  In DCB_MODE modes are switched via
the mode command.  In DCB_PAREN_MODE modes are switched via the pushMode
command.

In the former case, the popMode doesn't send us back here, it
sends us back to where we came from to get here because we will only ever
have one of the following parameters specified.

In the latter case, we've encountered a left paren indicating we should 
stay in DCB_PAREN_MODE until a right paren is encountered.

*/

DCB_BFALN
	: DD_BFALN
	->type(BFALN),mode(KYWD_VAL_MODE)
	;
DCB_BFTEK
	: DD_BFTEK
	->type(BFTEK),mode(KYWD_VAL_MODE)
	;
DCB_BLKSIZE
	: DD_BLKSIZE
	->type(BLKSIZE),mode(KYWD_VAL_MODE)
	;
DCB_BUFIN
	: DD_BUFIN
	->type(BUFIN),mode(KYWD_VAL_MODE)
	;
DCB_BUFL
	: DD_BUFL
	->type(BUFL),mode(KYWD_VAL_MODE)
	;
DCB_BUFMAX
	: DD_BUFMAX
	->type(BUFMAX),mode(KYWD_VAL_MODE)
	;
DCB_BUFNO
	: DD_BUFNO
	->type(BUFNO),mode(KYWD_VAL_MODE)
	;
DCB_BUFOFF
	: DD_BUFOFF
	->type(BUFOFF),mode(KYWD_VAL_MODE)
	;
DCB_BUFOUT
	: DD_BUFOUT
	->type(BUFOUT),mode(KYWD_VAL_MODE)
	;
DCB_BUFRQ
	: DD_BUFRQ
	->type(BUFRQ),mode(KYWD_VAL_MODE)
	;
DCB_BUFSIZE
	: DD_BUFSIZE
	->type(BUFSIZE),mode(KYWD_VAL_MODE)
	;
DCB_CODE
	: DD_CODE
	->type(CODE),mode(KYWD_VAL_MODE)
	;
DCB_CPRI
	: DD_CPRI
	->type(CPRI),mode(KYWD_VAL_MODE)
	;
DCB_CYLOFL
	: DD_CYLOFL
	->type(CYLOFL),mode(KYWD_VAL_MODE)
	;
DCB_DEN
	: DD_DEN
	->type(DEN),mode(KYWD_VAL_MODE)
	;
DCB_DIAGNS
	: DD_DIAGNS
	->type(DIAGNS),mode(KYWD_VAL_MODE)
	;
DCB_DSORG
	: DD_DSORG
	->type(DSORG),mode(KYWD_VAL_MODE)
	;
DCB_EROPT
	: DD_EROPT
	->type(EROPT),mode(KYWD_VAL_MODE)
	;
DCB_FUNC
	: DD_FUNC
	->type(FUNC),mode(KYWD_VAL_MODE)
	;
DCB_GNCP
	: DD_GNCP
	->type(GNCP),mode(KYWD_VAL_MODE)
	;
DCB_HIARCHY
	: DD_HIARCHY
	->type(HIARCHY),mode(KYWD_VAL_MODE)
	;
DCB_INTVL
	: DD_INTVL
	->type(INTVL),mode(KYWD_VAL_MODE)
	;
DCB_IPLTXID
	: DD_IPLTXID
	->type(IPLTXID),mode(KYWD_VAL_MODE)
	;
DCB_KEYLEN
	: DD_KEYLEN
	->type(KEYLEN),mode(KYWD_VAL_MODE)
	;
DCB_LIMCT
	: DD_LIMCT
	->type(LIMCT),mode(KYWD_VAL_MODE)
	;
DCB_LRECL
	: DD_LRECL
	->type(LRECL),mode(KYWD_VAL_MODE)
	;
DCB_MODE
	: DD_MODE
	->type(MODE),mode(KYWD_VAL_MODE)
	;
DCB_NCP
	: DD_NCP
	->type(NCP),mode(KYWD_VAL_MODE)
	;
DCB_NTM
	: DD_NTM
	->type(NTM),mode(KYWD_VAL_MODE)
	;
DCB_OPTCD
	: DD_OPTCD
	->type(OPTCD),mode(KYWD_VAL_MODE)
	;
DCB_PCI
	: DD_PCI
	->type(PCI),mode(KYWD_VAL_MODE)
	;
DCB_PRTSP
	: DD_PRTSP
	->type(PRTSP),mode(KYWD_VAL_MODE)
	;
DCB_RECFM
	: DD_RECFM
	->type(RECFM),mode(KYWD_VAL_MODE)
	;
DCB_RESERVE
	: DD_RESERVE
	->type(RESERVE),mode(KYWD_VAL_MODE)
	;
DCB_RKP
	: DD_RKP
	->type(RKP),mode(KYWD_VAL_MODE)
	;
DCB_SOWA
	: DD_SOWA
	->type(SOWA),mode(KYWD_VAL_MODE)
	;
DCB_STACK
	: DD_STACK
	->type(STACK),mode(KYWD_VAL_MODE)
	;
DCB_THRESH
	: DD_THRESH
	->type(THRESH),mode(KYWD_VAL_MODE)
	;
DCB_TRTCH
	: DD_TRTCH
	->type(TRTCH),mode(KYWD_VAL_MODE)
	;

DCB_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
DCB_KEYWORD_VALUE
	: KEYWORD_VALUE
	->type(KEYWORD_VALUE);

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_DCB
	: .
	;

mode DCB_PAREN_MODE
	;

DCB_PAREN_RPAREN
	: RPAREN_DFLT
	->type(RPAREN),popMode,popMode
	;
DCB_PAREN_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;
DCB_PAREN_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;

DCB_PAREN_COMMENT_FLAG_INLINE
	: COMMENT_FLAG_INLINE
	->type(COMMENT_FLAG_INLINE),channel(COMMENTS),pushMode(COMMA_WS_MODE)
	;
DCB_PAREN_NEWLINE
	: NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;

DCB_PAREN_BFALN
	: DD_BFALN
	->type(BFALN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BFTEK
	: DD_BFTEK
	->type(BFTEK),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BLKSIZE
	: DD_BLKSIZE
	->type(BLKSIZE),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFIN
	: DD_BUFIN
	->type(BUFIN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFL
	: DD_BUFL
	->type(BUFL),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFMAX
	: DD_BUFMAX
	->type(BUFMAX),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFNO
	: DD_BUFNO
	->type(BUFNO),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFOFF
	: DD_BUFOFF
	->type(BUFOFF),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFOUT
	: DD_BUFOUT
	->type(BUFOUT),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFRQ
	: DD_BUFRQ
	->type(BUFRQ),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFSIZE
	: DD_BUFSIZE
	->type(BUFSIZE),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_CODE
	: DD_CODE
	->type(CODE),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_CPRI
	: DD_CPRI
	->type(CPRI),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_CYLOFL
	: DD_CYLOFL
	->type(CYLOFL),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_DEN
	: DD_DEN
	->type(DEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_DIAGNS
	: DD_DIAGNS
	->type(DIAGNS),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_DSORG
	: DD_DSORG
	->type(DSORG),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_EROPT
	: DD_EROPT
	->type(EROPT),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_FUNC
	: DD_FUNC
	->type(FUNC),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_GNCP
	: DD_GNCP
	->type(GNCP),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_HIARCHY
	: DD_HIARCHY
	->type(HIARCHY),mode(KYWD_VAL_MODE)
	;
DCB_PAREN_INTVL
	: DD_INTVL
	->type(INTVL),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_IPLTXID
	: DD_IPLTXID
	->type(IPLTXID),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_KEYLEN
	: DD_KEYLEN
	->type(KEYLEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_LIMCT
	: DD_LIMCT
	->type(LIMCT),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_LRECL
	: DD_LRECL
	->type(LRECL),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_MODE
	: DD_MODE
	->type(MODE),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_NCP
	: DD_NCP
	->type(NCP),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_NTM
	: DD_NTM
	->type(NTM),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_OPTCD
	: DD_OPTCD
	->type(OPTCD),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_PCI
	: DD_PCI
	->type(PCI),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_PRTSP
	: DD_PRTSP
	->type(PRTSP),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_RECFM
	: DD_RECFM
	->type(RECFM),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_RESERVE
	: DD_RESERVE
	->type(RESERVE),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_RKP
	: DD_RKP
	->type(RKP),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_SOWA
	: DD_SOWA
	->type(SOWA),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_STACK
	: DD_STACK
	->type(STACK),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_THRESH
	: DD_THRESH
	->type(THRESH),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_TRTCH
	: DD_TRTCH
	->type(TRTCH),pushMode(KYWD_VAL_MODE)
	;

DCB_PAREN_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
DCB_PAREN_KEYWORD_VALUE
	: KEYWORD_VALUE
	->type(KEYWORD_VALUE);

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_DCB_PAREN
	: .
	;

mode INCLUDE_MODE
	;

INCLUDE_WS
	: [ ]+
	->channel(HIDDEN),mode(INCLUDE_PARM_MODE)
	;

ERROR_CHAR_INCLUDE
	: .
	;

mode INCLUDE_PARM_MODE
	;

INCLUDE_PARM_MEMBER
	: M E M B E R
	->pushMode(KYWD_VAL_MODE)
	;

INCLUDE_PARM_VALUE_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
INCLUDE_PARM_VALUE_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;

ERROR_CHAR_INCLUDE_PARM
	: .
	;

mode JCLLIB_MODE
	;

JCLLIB_WS
	: [ ]+
	->channel(HIDDEN),mode(JCLLIB_PARM_MODE)
	;

ERROR_CHAR_JCLLIB
	: .
	;

mode JCLLIB_PARM_MODE
	;

JCLLIB_PARM_ORDER
	: O R D E R
	->pushMode(KYWD_VAL_MODE)
	;

JCLLIB_PARM_PROCLIB
	: P R O C L I B
	->pushMode(KYWD_VAL_MODE)
	;

JCLLIB_PARM_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
	;

JCLLIB_PARM_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;

JCLLIB_PARM_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN)
	;

JCLLIB_PARM_SS_WS
	: SS [ ]+
	->channel(HIDDEN)
	;

JCLLIB_PARM_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

JCLLIB_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;


ERROR_CHAR_JCLLIB_PARM
	: .
	;

mode JOB1_MODE
	;

/*
This horrible hack requires some explanation.  The JOB statement has both
positional and keyword parameters.  The syntax is...

//[name] JOB [accounting-data | (accounting-data)],[programmer-name][,keyword-parameter]*

...meaning that the accounting-data is optional as is the programmer-name as are all 
keyword-parameters.

If the accounting-data is omitted, there must be a comma to indicate it is absent if any other
parameters are supplied.  If the programmer-name is omitted, there must _not_ be a comma to 
indicate it is absent.  The accounting-data can be just about any format as dictated by the 
installation.

//ABC JOB
//ABC JOB ACCT-DATA
//ABC JOB 'ACCT-DATA'
//ABC JOB ,CSCHNEID
//ABC JOB ,'CSCHNEID'
//ABC JOB TIME=10
//ABC JOB ACCT-DATA,CSCHNEID,TIME=10
//ABC JOB ACCT-DATA,  this is accounting data
//* the accounting data is on the previous line
//* the programmer name is on the following line
//        CSCHNEID
//ABC JOB ('123456789A123456789B123456789C123456789D123456789E1234567
//          89F123456789G123456789H123456789I123456789J123456789K1234
//          56789L123456789M123456789L'),'123456789A123456789B',
//          TIME=NOLIMIT
//ABC JOB (1234,201B,1,100,,,,N,60),'JES2 ACCTDATA FORMAT'
//ABC JOB ('@395ZZZ135,T2468123',101),
//        'CSCHNEID',
//        TIME=(00,04),
//        MSGLEVEL=(1,1),
//        MSGCLASS=Y,
//        BYTES=(400000,WARNING),
//        LINES=(3000,WARNING),
//        NOTIFY=&SYSUID

All of the above are syntactically valid, though they may or may not result in an error
at runtime in any given installation.

*/


JOB_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOB_WS
	: [ ]+
	->channel(HIDDEN),mode(JOB_ACCT1_MODE)
	;

ERROR_CHAR_JOB1
	: .
	;

mode JOB_ACCT1_MODE
	;

JOB_ACCT1_MODE_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOB_ACCT1_MODE_WS
	: [ ]+
	->channel(HIDDEN),mode(CM_MODE)
	;
JOB_ACCT1_MODE_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),mode(JOB_ACCT_COMMA_WS_MODE)
	;
JOB_ACCT1_MODE_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->mode(JOB_ACCT_COMMA_NEWLINE_MODE)
	;
JOB_ACCT1_MODE_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),mode(JOB_ACCT2_MODE)
	;
JOB_ACCT1_MODE_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN),mode(JOB_PROGRAMMER_NAME_MODE)
	;

JOB_ADDRSPC
	: A D D R S P C
	->type(ADDRSPC),pushMode(KYWD_VAL_MODE)
	;
JOB_BYTES
	: B Y T E S
	->type(BYTES),pushMode(KYWD_VAL_MODE)
	;
JOB_CARDS
	: C A R D S
	->type(CARDS),pushMode(KYWD_VAL_MODE)
	;
JOB_CCSID
	: C C S I D
	->type(CCSID),pushMode(KYWD_VAL_MODE)
	;
JOB_CLASS
	: C L A S S
	->type(CLASS),pushMode(KYWD_VAL_MODE)
	;
JOB_COND
	: C O N D
	->type(COND),pushMode(KYWD_VAL_MODE)
	;
JOB_DSENQSHR
	: D S E N Q S H R
	->type(DSENQSHR),pushMode(KYWD_VAL_MODE)
	;
JOB_EMAIL
	: E M A I L
	->type(EMAIL),pushMode(KYWD_VAL_MODE)
	;
JOB_GDGBIAS
	: G D G B I A S
	->type(GDGBIAS),pushMode(KYWD_VAL_MODE)
	;
JOB_GROUP
	: G R O U P
	->type(GROUP),pushMode(KYWD_VAL_MODE)
	;
JOB_JESLOG
	: J E S L O G
	->type(JESLOG),pushMode(KYWD_VAL_MODE)
	;
JOB_JOBRC
	: J O B R C
	->type(JOBRC),pushMode(KYWD_VAL_MODE)
	;
JOB_LINES
	: L I N E S
	->type(LINES),pushMode(KYWD_VAL_MODE)
	;
JOB_MEMLIMIT
	: M E M L I M I T
	->type(MEMLIMIT),pushMode(KYWD_VAL_MODE)
	;
JOB_MSGCLASS
	: M S G C L A S S
	->type(MSGCLASS),pushMode(KYWD_VAL_MODE)
	;
JOB_MSGLEVEL
	: M S G L E V E L
	->type(MSGLEVEL),pushMode(KYWD_VAL_MODE)
	;
JOB_NOTIFY
	: N O T I F Y
	->type(NOTIFY),pushMode(KYWD_VAL_MODE)
	;
JOB_PAGES
	: P A G E S
	->type(PAGES),pushMode(KYWD_VAL_MODE)
	;
JOB_PASSWORD
	: P A S S W O R D
	->type(PASSWORD),pushMode(KYWD_VAL_MODE)
	;
JOB_PERFORM
	: P E R F O R M
	->type(PERFORM),pushMode(KYWD_VAL_MODE)
	;
JOB_PRTY
	: P R T Y
	->type(PRTY),pushMode(KYWD_VAL_MODE)
	;
JOB_RD
	: R D
	->type(RD),pushMode(KYWD_VAL_MODE)
	;
JOB_REGION
	: R E G I O N
	->type(REGION),pushMode(KYWD_VAL_MODE)
	;
JOB_REGIONX
	: R E G I O N X
	->type(REGIONX),pushMode(KYWD_VAL_MODE)
	;
JOB_RESTART
	: R E S T A R T
	->type(RESTART),pushMode(KYWD_VAL_MODE)
	;
JOB_ROLL
	: R O L L
	->type(ROLL),pushMode(KYWD_VAL_MODE)
	;
JOB_SECLABEL
	: S E C L A B E L
	->type(SECLABEL),pushMode(KYWD_VAL_MODE)
	;
JOB_SCHENV
	: S C H E N V
	->type(SCHENV),pushMode(KYWD_VAL_MODE)
	;
JOB_SYSAFF
	: S Y S A F F
	->type(SYSAFF),pushMode(KYWD_VAL_MODE)
	;
JOB_SYSTEM
	: S Y S T E M
	->type(SYSTEM),pushMode(KYWD_VAL_MODE)
	;
JOB_TIME
	: T I M E
	->type(TIME),pushMode(KYWD_VAL_MODE)
	;
JOB_TYPRUN
	: T Y P R U N
	->type(TYPRUN),pushMode(KYWD_VAL_MODE)
	;
JOB_UJOBCORR
	: U J O B C O R R
	->type(UJOBCORR),pushMode(KYWD_VAL_MODE)
	;
JOB_USER
	: U S E R
	->type(USER),pushMode(KYWD_VAL_MODE)
	;

JOB_ACCT1_MODE_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;

JOB_ACCT1_MODE_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	->type(JOB_ACCT_MODE_UNQUOTED_STRING)
	;

ERROR_CHAR_JOB_ACCT1
	: .
	;

mode JOB_ACCT_COMMA_WS_MODE
	;

JOB_ACCT_COMMA_WS_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	->type(COMMENT_TEXT),channel(COMMENTS)
	;
JOB_ACCT_COMMA_WS_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(JOB_ACCT_COMMA_WS_NEWLINE_MODE)
	;

ERROR_CHAR_JOB_ACCT_COMMA_WS
	: .
	;

mode JOB_ACCT_COMMA_WS_NEWLINE_MODE
	;

JOB_ACCT_COMMA_WS_NEWLINE_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),mode(JOB_ACCT_COMMA_WS_MODE)
	;
JOB_ACCT_COMMA_WS_NEWLINE_SS_WS
	: SS ' '+ 
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN),mode(JOB_PROGRAMMER_NAME_MODE)
	;

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_JOB_ACCT_COMMA_WS_NEWLINE
	: .
	;

mode JOB_ACCT_COMMA_NEWLINE_MODE
	;

JOB_ACCT_COMMA_NEWLINE_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),mode(JOB_ACCT_COMMA_NEWLINE_CM_MODE)
	;
JOB_ACCT_COMMA_NEWLINE_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN),mode(JOB_PROGRAMMER_NAME_MODE)
	;

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_JOB_ACCT_COMMA_NEWLINE
	: .
	;

mode JOB_ACCT_COMMA_NEWLINE_CM_MODE
	;

JOB_ACCT_COMMA_NEWLINE_CM_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	->type(COMMENT_TEXT),channel(COMMENTS)
	;
JOB_ACCT_COMMA_NEWLINE_CM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(JOB_ACCT_COMMA_NEWLINE_MODE)
	;

ERROR_CHAR_JOB_ACCT_COMMA_NEWLINE_CM
	: .
	;

mode JOB_ACCT2_MODE
	;

JOB_ACCT2_MODE_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOB_ACCT2_MODE_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;
JOB_ACCT2_MODE_RPAREN
	: RPAREN_DFLT
	->type(RPAREN),mode(JOB_ACCT3_MODE)
	;

JOB_ACCT2_MODE_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
JOB_ACCT2_MODE_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	->type(JOB_ACCT_MODE_UNQUOTED_STRING)
	;

/*
Commas are no longer hidden in this mode, allowing for
separation of the potential various accounting parameters.
*/
JOB_ACCT2_MODE_COMMA
	: COMMA_DFLT
	->type(COMMA)
	;

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_JOB_ACCT2
	: .
	;

mode JOB_ACCT3_MODE
	;

JOB_ACCT3_MODE_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOB_ACCT3_MODE_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN),mode(JOB_PROGRAMMER_NAME_MODE)
	;
JOB_ACCT3_MODE_COMMA_WS
	: COMMA_DFLT ' '+
	->channel(HIDDEN),mode(JOB_ACCT_COMMA_WS_MODE)
	;
JOB_ACCT3_MODE_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),mode(JOB_ACCT_COMMA_WS_NEWLINE_MODE)
	;

JOB_ACCT3_WS
	: [ ]+
	->channel(HIDDEN)
	;

ERROR_CHAR_JOB_ACCT3
	: .
	;

mode JOB_PROGRAMMER_NAME_MODE
	;

JOB_PROGRAMMER_NAME_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
JOB_PROGRAMMER_NAME_WS
	: [ ]+
	->channel(HIDDEN),mode(CM_MODE)
	;
JOB_PROGRAMMER_NAME_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;

JOB_PROGRAMMER_NAME_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
JOB_PROGRAMMER_NAME_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;

JOB_PROGRAMMER_NAME_ADDRSPC
	: JOB_ADDRSPC
	->type(ADDRSPC),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_BYTES
	: JOB_BYTES
	->type(BYTES),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_CARDS
	: JOB_CARDS
	->type(CARDS),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_CCSID
	: JOB_CCSID
	->type(CCSID),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_CLASS
	: JOB_CLASS
	->type(CLASS),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_COND
	: JOB_COND
	->type(COND),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_DSENQSHR
	: JOB_DSENQSHR
	->type(DSENQSHR),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_EMAIL
	: JOB_EMAIL
	->type(EMAIL),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_GDGBIAS
	: JOB_GDGBIAS
	->type(GDGBIAS),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_GROUP
	: JOB_GROUP
	->type(GROUP),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_JESLOG
	: JOB_JESLOG
	->type(JESLOG),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_JOBRC
	: JOB_JOBRC
	->type(JOBRC),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_LINES
	: JOB_LINES
	->type(LINES),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_MEMLIMIT
	: JOB_MEMLIMIT
	->type(MEMLIMIT),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_MSGCLASS
	: JOB_MSGCLASS
	->type(MSGCLASS),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_MSGLEVEL
	: JOB_MSGLEVEL
	->type(MSGLEVEL),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_NOTIFY
	: JOB_NOTIFY
	->type(NOTIFY),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_PAGES
	: JOB_PAGES
	->type(PAGES),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_PASSWORD
	: JOB_PASSWORD
	->type(PASSWORD),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_PERFORM
	: JOB_PERFORM
	->type(PERFORM),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_PRTY
	: JOB_PRTY
	->type(PRTY),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_RD
	: JOB_RD
	->type(RD),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_REGION
	: JOB_REGION
	->type(REGION),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_REGIONX
	: JOB_REGIONX
	->type(REGIONX),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_RESTART
	: JOB_RESTART
	->type(RESTART),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_SECLABEL
	: JOB_SECLABEL
	->type(SECLABEL),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_SCHENV
	: JOB_SCHENV
	->type(SCHENV),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_SYSAFF
	: JOB_SYSAFF
	->type(SYSAFF),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_SYSTEM
	: JOB_SYSTEM
	->type(SYSTEM),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_TIME
	: JOB_TIME
	->type(TIME),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_TYPRUN
	: JOB_TYPRUN
	->type(TYPRUN),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_UJOBCORR
	: JOB_UJOBCORR
	->type(UJOBCORR),pushMode(KYWD_VAL_MODE)
	;
JOB_PROGRAMMER_NAME_USER
	: JOB_USER
	->type(USER),pushMode(KYWD_VAL_MODE)
	;

JOB_PROGRAMMER_NAME_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
JOB_PROGRAMMER_NAME_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	;

ERROR_CHAR_JOB_PROGRAMMER_NAME
	: .
	;

mode KYWD_VAL_MODE
	;

KYWD_VAL_EQUAL
	: EQUAL_DFLT
	->type(EQUAL)
	;

KYWD_VAL_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
/*

The second part of the KEYWORD_VALUE token is an attempt to detect substringed system symbolics.
The third part of the KEYWORD_VALUE token is an attempt to detect temporary file names.
*/
KEYWORD_VALUE
	: (
	([A-Z0-9@#$&*\-+./%[:_]+?) | 
	(AMPERSAND AMPERSAND? ALNUMNAT LPAREN_DFLT NUM_LIT_DFLT? ':' NUM_LIT_DFLT? RPAREN_DFLT)+ |
	(AMPERSAND AMPERSAND ALNUMNAT)
  )
	;
KYWD_VAL_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
KYWD_VAL_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),mode(KYWD_VAL_PAREN_MODE)
	;
KYWD_VAL_RPAREN
	: RPAREN_DFLT
	{
		if (_modeStack.peek() == DCB_PAREN_MODE) {
			popMode();
			popMode();
			popMode();
		} else {
			popMode();
			popMode();
		}
	}
	->type(RPAREN)
	;
/*

The newline, comma newline, and ws tokens are here because some keywords
can have a null value...

//PROCSTEP.DD001 DD DATACLAS=
//PROCSTEP.DD002 DD DATACLAS= NULL IT OUT
//PROCSTEP.DD003 DD COPIES=,  NULL IT OUT
//  DATACLAS=  NULL THIS OUT TOO

...and thus we must check to see if the statement ends right there, or
if it's being continued, or if it's got a comment in either of those
two situations.

Also note that we mode(COMMA_NEWLINE_MODE) and allow the popMode there to
take us back into the "parent" mode.  Same for COMMA_WS_MODE.

*/
KYWD_VAL_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
		mode(myMode);
	}
	->channel(HIDDEN)
	;
KYWD_VAL_COMMA
	: COMMA_DFLT
	->channel(HIDDEN),popMode
	;
KYWD_VAL_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),mode(COMMA_NEWLINE_MODE)
	;
KYWD_VAL_COMMA_WS
	: COMMA_DFLT [ ]+
	->channel(HIDDEN),mode(COMMA_WS_MODE)
	;
KYWD_VAL_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;

ERROR_CHAR_KYWD_VAL
	: .
	;

mode KYWD_VAL_PAREN_MODE
	;

KYWD_VAL_PAREN_COMMA
	: COMMA_DFLT
	->type(COMMA)
	;
KYWD_VAL_PAREN_EQUAL
	: EQUAL_DFLT
	->type(EQUAL)
	;
KYWD_VAL_PAREN_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
KYWD_VAL_PAREN_VALUE
	: KEYWORD_VALUE
	->type(KEYWORD_VALUE)
	;
KYWD_VAL_PAREN_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
KYWD_VAL_PAREN_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),pushMode(KYWD_VAL_PAREN_MODE)
	;
KYWD_VAL_PAREN_RPAREN
	: RPAREN_DFLT
	->type(RPAREN),popMode
	;

KYWD_VAL_PAREN_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->type(COMMA),pushMode(COMMA_NEWLINE_MODE)
	;
KYWD_VAL_PAREN_COMMA_WS
	: COMMA_DFLT [ ]+
	->type(COMMA),pushMode(COMMA_WS_MODE)
	;

/*
There is no check for whitespace here because whitespace
on its own in this mode is invalid.
*/
ERROR_CHAR_KYWD_VAL_PAREN
	: .
	;


