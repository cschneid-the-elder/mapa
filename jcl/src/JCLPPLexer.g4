/*
Copyright (C) 2019 - 2023 Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This grammar was built targeting the Java implementation of ANTLR 4, and 
contains embedded code you may have to modify if targeting a different
source code implementation.  

Preprocessor grammar for JCL, to be used in resolving symbolics prior
to actual parsing.  To my dismay, it turns out the following sort of
grick (and probably worse) is syntactically valid.

// SET A=A,B=B,C=C,D=D,E=E,F=F,G=G,H=H,I=I
// SET K=K,L=L,M=M,N=N,P=P,R=R,S=S,T=T,W=W,Z=Z
// SET D1='DISP=SHR,DSN=CSCHNEID.INPUT01'
// SET D2='DISP=(,CATLG',D3='),DSN=CSCHNEID.OUTPUT01'
//*
//PS01    EXEC PGM=IEFBR14
//DD01    DD  &D&I&S&P=(&N&E&W,&C&A&T&L&G,&D&E&L&E&T&E),
//            &D&S&N=&H&E&R&C.03.&T&E&S&T.0005.&D&D.01,
//            &D&C&B=(&R&E&C&F&M=&F&B,&L&R&E&C&L=80,
//            &B&L&K&S&I&Z&E=27840),
//            &S&P&A&C&E=(80,(100,100),&R&L&S&E)
//DD02    DD  &D1
//DD03    DD  &D2&D3

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



lexer grammar JCLPPLexer;

@lexer::members {
	public java.util.ArrayList<String> dlmVals = new java.util.ArrayList();
	public String dlmString = null;
	public int myMode = DEFAULT_MODE;
	public Boolean hide = true;
	public static Boolean ckCol72 = false; //set to true if using test rig
	public Boolean cmContinued = false;
	public Boolean stmtContinued = false;
	public Boolean cmFlag = false;
	public StringBuilder currCm = new StringBuilder();
}

tokens { NAME , ALNUMNAT , DELIMITER_STATEMENT , COL_72 , COMMENT_FLAG , CNTL , COMMAND , DD , ELSE , ENDCNTL , ENDIF , EXEC , IF , INCLUDE , JCLLIB , JOB , NOTIFY , OUTPUT , PEND , PROC , SCHEDULE , SET , XMIT, EQUAL , ACCODE , AMP , ASTERISK , AVGREC , BLKSIZE ,  BLKSZLIM , BUFNO , BUFRQ , BURST , CCSID , CHARS , CHKPT , CODE , COPIES , DATA , DATACLAS , DCB , DDNAME , DEST , DIAGNS , DISP , DLM , DSID , DSKEYLBL , DSN , DSNAME , DSNTYPE , DUMMY , DYNAM , EATTR , EXPDT , EXPORT , FCB , FILEDATA , FLASH , FREE , FREEVOL , GDGORDER , HOLD , KEYLABL1 , KEYLABL2 , KEYENCD1 , KEYENCD2 , KEYLEN , KEYOFF , LABEL , LGSTREAM , LIKE , LRECL , MAXGENS , MGMTCLAS , MODE, MODIFY , NULLOVRD , OUTLIM , OUTPUT , PATH , PATHDISP , PATHMODE , PATHOPTS , PROTECT , RECFM , RECORG , REFDD , RETPD , RLS , ROACCESS , SECMODEL , SEGMENT , SPACE , SPIN , SOWA , STORCLAS , SUBSYS , SYMBOLS , SYMLIST , SYSOUT , TERM , UCS , UNIT , VOL , VOLUME , COMMA , ABEND , ABENDCC , NOT_SYMBOL , TRUE , FALSE , RC , RUN , CNVTSYS , EXECSYS , JCLONLY , LOGGING_DDNAME , NUM_LIT , LPAREN , RPAREN , BFALN , BFTEK , BUFIN , BUFL , BUFMAX , BUFOFF , BUFOUT , BUFSIZE , CPRI , CYLOFL , DEN , DSORG , EROPT , FUNC , GNCP , HIARCHY , INTVL , IPLTXID , LIMCT , NCP , NTM , OPTCD , PCI , PRTSP , RESERVE , RKP , STACK , THRESH , TRTCH , ADDRSPC , BYTES , CARDS , CCSID , CLASS , COND , DSENQSHR , EMAIL , GDGBIAS , GROUP , JESLOG , JOBRC , LINES , MEMLIMIT , MSGCLASS , MSGLEVEL , NOTIFY , PAGES , PASSWORD , PERFORM , PRTY , RD , REGION , REGIONX , RESTART , ROLL , SECLABEL , SYSAFF , SCHENV , SYSTEM , TIME , TYPRUN , UJOBCORR , USER , COMMENT_TEXT , DATASET_NAME , EXEC_PARM_STRING , DOT , DEST_VALUE , QUOTED_STRING_PROGRAMMER_NAME , SUBCHARS , SEP }

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

IGNORED_CONTINUATION
	: ANYCHAR
	{
		ckCol72 && getCharPositionInLine() == 72
	}?
	->channel(HIDDEN)
	;

COMMENT_FLAG_DFLT
	: SLASH SLASH ASTERISK
	{
		cmFlag = true;
	}
	{
		getCharPositionInLine() == 3
	}?
	->type(COMMENT_FLAG),channel(COMMENTS),mode(CM_MODE)
	;

/*
This is where constructs such as...

// EXEC SAS
DATA _NULL_;
//*

...are caught.  There is instream data that is not preceded
by a //SYSIN DD * statement; it will be attached to the step.
*/
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



mode CM_MODE
	;

CM_COL72
	: ANYCHAR
	{
		if (!cmFlag && currCm.length() > 0 && getText().trim().length() > 0) {
			cmContinued = true;
			//System.out.println("currCm.length() > 0 @ " + getLine());
		}
	}
	{
		ckCol72 && getCharPositionInLine() == 72
	}?
	->type(COL_72),channel(COMMENTS)
	;

CM_NEWLINE
	: NEWLINE
	{
		if (!cmContinued) {
			mode(myMode);
		}
		cmContinued = false;
		cmFlag = false;
		currCm = new StringBuilder();
	}
	->channel(COMMENTS)
	;

CM_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	{
		if (ckCol72) {
			currCm.append(getText().trim());
		}
	}
	{
		((ckCol72 
			&& (getCharPositionInLine() < 72 
				&& getText().length() <= 72 - getCharPositionInLine())) 
		|| !ckCol72)
	}?
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

CM_COMMENT_TEXT_73
	: (' ' | ANYCHAR)+
	{
		(ckCol72 
			&& (getCharPositionInLine() > 72 
				&& getText().length() <= getCharPositionInLine() - 72)) 
	}?
	->type(COMMENT_TEXT),channel(COMMENTS)
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

COMMA_WS_COL72
	: ANYCHAR
	{
		if (!cmFlag && currCm.length() > 0 && getText().trim().length() > 0) {
			cmContinued = true;
		}
	}
	{
		(ckCol72 && getCharPositionInLine() == 72)
	}?
	->type(COL_72),channel(COMMENTS)
	;

COMMA_WS_COMMENT_TEXT
	: (' ' | ANYCHAR)+
	{
		if (ckCol72) {
			currCm.append(getText().trim());
		}
	}
	{
		((ckCol72 
			&& (getCharPositionInLine() < 72 
				&& getText().length() <= 72 - getCharPositionInLine())) 
		|| !ckCol72)
	}?
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

COMMA_WS_COMMENT_TEXT_73
	: (' ' | ANYCHAR)+
	{
		(ckCol72 
			&& (getCharPositionInLine() > 72 
				&& getText().length() <= getCharPositionInLine() - 72)) 

	}?
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

COMMA_WS_NEWLINE
	: NEWLINE
	{
		if (!cmContinued) {
			pushMode(COMMA_WS_NEWLINE_MODE);
		}
		cmContinued = false;
		currCm = new StringBuilder();
	}
	->channel(COMMENTS)
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

mode OP_MODE
	;

OP_COMMENT_TEXT_73
	: (' ' | ANYCHAR)+
	{
		(ckCol72 
			&& (getCharPositionInLine() > 72 
				&& getText().length() <= getCharPositionInLine() - 72)) 
	}?
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

CNTL_OP
	: C N T L
	->mode(CNTL_MODE),type(CNTL)
	;
COMMAND_OP
	: C O M M A N D
	->mode(OP_PARM1_MODE),type(COMMAND)
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
	->mode(OP_PARM1_MODE),type(JOB)
	;
NOTIFY_OP
	: N O T I F Y
	->mode(OP_PARM1_MODE)
	;
OUTPUT_OP
	: O U T P U T
	->mode(OP_PARM1_MODE),type(OUTPUT)
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
	->mode(OP_PARM1_MODE),type(SCHEDULE)
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
	->mode(OP_PARM1_MODE)
	;

WS_OP
	: [ ]+
	->channel(HIDDEN)
	;
NEWLINE_OP
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

mode OP_PARM1_MODE
	;

OP_PARM1_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

OP_PARM1_WS
	: [ ]+
	->channel(HIDDEN),mode(OP_PARM_MODE)
	;

mode OP_PARM_MODE
	;

OP_PARM_COMMENT_TEXT_73
	: (' ' | ANYCHAR)+
	{
		(ckCol72 
			&& (getCharPositionInLine() > 72 
				&& getText().length() <= getCharPositionInLine() - 72)) 
	}?
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

OP_PARM_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;

OP_PARM_CONTINUED
	: COMMA_DFLT NEWLINE
	->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;

OP_PARM_COMMENT_FLAG_INLINE
	: COMMENT_FLAG_INLINE
	->channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;

OP_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(CM_MODE)
	;

OP_PARM_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

OP_PARM_COMMA
	: COMMA_DFLT
	->type(COMMA),channel(HIDDEN)
	;

OP_PARM_COMMENT_FLAG
	: COMMENT_FLAG_DFLT
	->type(COMMENT_FLAG),channel(COMMENTS),pushMode(COMMA_NEWLINE_CM_MODE)
	;

OP_PARM_SS_WS
	: SS ' '+
	{
		getText().length() <= 15
	}?
	->channel(HIDDEN)
	;

OP_PARM_SQUOTE
	: SQUOTE
	->channel(HIDDEN),pushMode(QS_MODE)
	;

OP_PARM_ANYCHAR
	: ANYCHAR
	->channel(HIDDEN)
	;


mode COMMAND_MODE
	;

COMMAND_WS
	: ' '+
	->channel(HIDDEN),mode(COMMAND_PARM_MODE)
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

mode JCL_COMMAND_MODE
	;

JCL_COMMAND_WS
	: ' '+
	->channel(HIDDEN),mode(JCL_COMMAND_PARM_MODE)
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
		hide = false;
	}
	->mode(EXEC2_MODE)
	;

PROC_EX
	: P R O C
	{
		hide = false;
	}
	->mode(EXEC2_MODE)
	;

EXEC_PROC_NAME
	: NM_PART
	->type(KEYWORD_VALUE),mode(EXEC2_MODE)
	;

mode EXEC2_MODE
	;

EXEC_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),pushMode(KYWD_VAL_MODE)
	;

EXEC_ACCT
	: A C C T (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_ADDRSPC
	: A D D R S P C (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_CCSID
	: C C S I D (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_COND
	: C O N D (DOT_DFLT NM_PART)? 
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_DYNAMNBR
	: D Y N A M N B R (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_MEMLIMIT
	: M E M L I M I T (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_PARM
	: P A R M (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_PARMDD
	: P A R M D D (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_PERFORM
	: P E R F O R M (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_RD
	: R D (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_REGION
	: R E G I O N (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_REGIONX
	: R E G I O N X (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_RLSTMOUT
	: R L S T M O U T (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_ROLL
	: R O L L (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_TIME
	: T I M E (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_TVSMSG
	: T V S M S G (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;
EXEC_TVSAMCOM
	: T V S A M C O M (DOT_DFLT NM_PART)?
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;

EXEC_PROC_PARM
	: NAME
	{
		hide = false;
	}
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

mode DD_MODE
	;

DD_WS
	: [ ]+
	{
		hide = true;
	}
	->channel(HIDDEN),mode(DD_PARM_MODE)
	;
DD_NEWLINE1
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

mode DD_PARM_MODE
	;

DD_COL72
	: ANYCHAR
	{
		stmtContinued = true;
	}
	{
		ckCol72 && getCharPositionInLine() == 72
	}?
	->type(COL_72),channel(COMMENTS)
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
		/*
		Testing for a very specific condition where a DD statement
		extends to column 71 and is continued on the next line.
		*/
		if (stmtContinued) {
		} else {
			_modeStack.clear();
			mode(DEFAULT_MODE);
		}
		stmtContinued = false;
	}
	->channel(HIDDEN)
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
	->type(ACCODE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_AMP
	: A M P
	->type(AMP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_AVGREC
	: A V G R E C
	->type(AVGREC),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
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
	->type(BLKSIZE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BLKSZLIM
	: B L K S Z L I M
	->type(BLKSZLIM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BURST
	: B U R S T
	->type(BURST),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_CCSID
	: C C S I D
	->type(CCSID),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_CHARS
	: C H A R S
	->type(CHARS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_CHKPT
	: C H K P T
	->type(CHKPT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_CNTL
	: C N T L
	->type(CNTL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_COPIES
	: C O P I E S
	->type(COPIES),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DATA
	: D A T A
	{
		dlmVals = new java.util.ArrayList();
		dlmVals.add("/*");
		myMode = DATA_MODE;
	}
	->type(DATA),channel(HIDDEN),pushMode(DATA_PARM_MODE)
	;
DD_DATACLAS
	: D A T A C L A S
	->type(DATACLAS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DCB
	: D C B
	->type(DCB),channel(HIDDEN),pushMode(DCB_MODE)
	;
DD_DDNAME
	: D D N A M E
	->type(DDNAME),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DEST
	: D E S T
	->type(DEST),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DISP
	: D I S P
	->type(DISP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DLM
	: D L M
	->type(DLM),channel(HIDDEN),pushMode(DLM_MODE)
	;
DD_DSID
	: D S I D
	->type(DSID),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DSKEYLBL
	: D S K E Y L B L
	->type(DSKEYLBL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DSN
	: D S N
	->type(DSN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DSNAME
	: D S N A M E
	->type(DSNAME),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DSNTYPE
	: D S N T Y P E
	->type(DSNTYPE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DUMMY
	: D U M M Y
	->type(DUMMY),channel(HIDDEN)
	;
DD_DYNAM
	: D Y N A M
	->type(DYNAM),channel(HIDDEN)
	;
DD_EATTR
	: E A T T R
	->type(EATTR),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_EXPDT
	: E X P D T
	->type(EXPDT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_FCB
	: F C B
	->type(FCB),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_FILEDATA
	: F I L E D A T A
	->type(FILEDATA),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_FLASH
	: F L A S H
	->type(FLASH),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_FREE
	: F R E E
	->type(FREE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_FREEVOL
	: F R E E V O L
	->type(FREEVOL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_GDGORDER
	: G D G O R D E R
	->type(GDGORDER),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_HOLD
	: H O L D
	->type(HOLD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_KEYLABL1
	: K E Y L A B L '1'
	->type(KEYLABL1),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_KEYLABL2
	: K E Y L A B L '2'
	->type(KEYLABL2),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_KEYENCD1
	: K E Y E N C D '1'
	->type(KEYENCD1),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_KEYENCD2
	: K E Y E N C D '2'
	->type(KEYENCD2),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_KEYLEN
	: K E Y L E N
	->type(KEYLEN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_KEYOFF
	: K E Y O F F
	->type(KEYOFF),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_LABEL
	: L A B E L
	->type(LABEL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_LGSTREAM
	: L G S T R E A M
	->type(LGSTREAM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_LIKE
	: L I K E
	->type(LIKE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_LRECL
	: L R E C L
	->type(LRECL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_MAXGENS
	: M A X G E N S
	->type(MAXGENS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_MGMTCLAS
	: M G M T C L A S
	->type(MGMTCLAS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_MODIFY
	: M O D I F Y
	->type(MODIFY),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_NULLOVRD
	: N U L L O V R D
	->type(NULLOVRD),channel(HIDDEN)
	;
DD_OUTLIM
	: O U T L I M
	->type(OUTLIM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_OUTPUT
	: O U T P U T
	->type(OUTPUT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_PATH
	: P A T H
	->type(PATH),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_PATHDISP
	: P A T H D I S P
	->type(PATHDISP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_PATHMODE
	: P A T H M O D E
	->type(PATHMODE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_PATHOPTS
	: P A T H O P T S
	->type(PATHOPTS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_PROTECT
	: P R O T E C T
	->type(PROTECT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_RECFM
	: R E C F M
	->type(RECFM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_RECORG
	: R E C O R G
	->type(RECORG),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_REFDD
	: R E F D D
	->type(REFDD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_RETPD
	: R E T P D
	->type(RETPD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_RLS
	: R L S
	->type(RLS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_ROACCESS
	: R O A C C E S S
	->type(ROACCESS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_SECMODEL
	: S E C M O D E L
	->type(SECMODEL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_SEGMENT
	: S E G M E N T
	->type(SEGMENT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
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
	->type(SEP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_SPACE
	: S P A C E
	->type(SPACE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_SPIN
	: S P I N
	->type(SPIN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_STORCLAS
	: S T O R C L A S
	->type(STORCLAS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_SUBSYS
	: S U B S Y S
	->type(SUBSYS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_SYMBOLS
	: S Y M B O L S
	{
		hide = false;
	}
	->type(SYMBOLS),pushMode(KYWD_VAL_MODE)
	;
DD_SYMLIST
	: S Y M L I S T
	{
		hide = false;
	}
	->type(SYMLIST),pushMode(KYWD_VAL_MODE)
	;
DD_SYSOUT
	: S Y S O U T
	->type(SYSOUT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_TERM
	: T E R M
	->type(TERM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_UCS
	: U C S
	->type(UCS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_UNIT
	: U N I T
	->type(UNIT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_VOL
	: V O L
	->type(VOL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_VOLUME
	: V O L U M E
	->type(VOLUME),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;

DD_BFALN
	: B F A L N
	->type(BFALN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BFTEK
	: B F T E K
	->type(BFTEK),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFIN
	: B U F I N
	->type(BUFIN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFL
	: B U F L
	->type(BUFL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFMAX
	: B U F M A X
	->type(BUFMAX),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFNO
	: B U F N O
	->type(BUFNO),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFOFF
	: B U F O F F
	->type(BUFOFF),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFOUT
	: B U F O U T
	->type(BUFOUT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
/*
Obsolete.  QTAM only.  Possibly still tolerated.
*/
DD_BUFRQ
	: B U F R Q
	->type(BUFRQ),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_BUFSIZE
	: B U F S I Z E
	->type(BUFSIZE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
/*
Obsolete.  Paper tape only.  Possibly still tolerated.
*/
DD_CODE
	: C O D E
	->type(CODE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_CPRI
	: C P R I
	->type(CPRI),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_CYLOFL
	: C Y L O F L
	->type(CYLOFL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DEN
	: D E N
	->type(DEN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DIAGNS
	: D I A G N S
	->type(DIAGNS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_DSORG
	: D S O R G
	->type(DSORG),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_EROPT
	: E R O P T
	->type(EROPT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_FUNC
	: F U N C
	->type(FUNC),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_GNCP
	: G N C P
	->type(GNCP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
/*
HIARCHY is obsolete but probably still tolerated.
HIARCHY={0|1}
example: DCB=(DSORG=DA,HIARCHY=0)
*/
DD_HIARCHY
	: H I A R C H Y
	->type(HIARCHY),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_INTVL
	: I N T V L
	->type(INTVL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_IPLTXID
	: I P L T X I D
	->type(IPLTXID),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_LIMCT
	: L I M C T
	->type(LIMCT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_MODE
	: M O D E
	->type(MODE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_NCP
	: N C P
	->type(NCP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_NTM
	: N T M
	->type(NTM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_OPTCD
	: O P T C D
	->type(OPTCD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_PCI
	: P C I
	->type(PCI),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_PRTSP
	: P R T S P
	->type(PRTSP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_RESERVE
	: R E S E R V E
	->type(RESERVE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_RKP
	: R K P
	->type(RKP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
/*
Obsolete.  QTAM only.  Possibly still tolerated.
*/
DD_SOWA
	: S O W A
	->type(SOWA),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_STACK
	: S T A C K
	->type(STACK),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_THRESH
	: T H R E S H
	->type(THRESH),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_TRTCH
	: T R T C H
	->type(TRTCH),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;

DD_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
DD_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DD_ANYCHAR
	: ANYCHAR
	->channel(HIDDEN)
	;

mode EXPORT_STMT_MODE
	;

EXPORT_STMT_WS
	: [ ]+
	->channel(HIDDEN),mode(EXPORT_STMT_PARM_MODE)
	;

mode EXPORT_STMT_PARM_MODE
	;

EXPORT_STMT_PARM_SYMLIST
	: DD_SYMLIST
	{
		hide = false;
	}
	->type(SYMLIST),pushMode(KYWD_VAL_MODE)
	;
EXPORT_STMT_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(CM_MODE)
	;
EXPORT_STMT_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

mode NOTIFY_STMT_MODE
	;

NOTIFY_STMT_WS
	: [ ]+
	->channel(HIDDEN),mode(NOTIFY_STMT_PARM_MODE)
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

mode PROC_PARM_MODE
	;

PROC_COMMENT_TEXT_73
	: (' ' | ANYCHAR)+
	{
		(ckCol72 
			&& (getCharPositionInLine() > 72 
				&& getText().length() <= getCharPositionInLine() - 72)) 
	}?
	->type(COMMENT_TEXT),channel(COMMENTS)
	;

PROC_PARM_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;

PROC_PARM_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),pushMode(PROC_PARM_VALUE_MODE)
	;

PROC_PARM_NAME
	: NM_PART
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
	{
		hide = false;
	}
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

mode SET_PARM_MODE
	;

SET_PARM_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),pushMode(SET_PARM_VALUE_MODE)
	;
SET_PARM_NAME
	: NM_PART
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
	{
		hide = false;
	}
	->channel(HIDDEN),pushMode(QS_MODE)

	;

/*
These two are mode() on purpose, the popMode in the target modes will correctly
bring us back to SET_PARM_MODE.  The lack of _modeStack.clear() is intentional.
*/
SET_PARM_VALUE_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	{
		hide = true;
	}
	->channel(HIDDEN),mode(COMMA_NEWLINE_MODE)

	;

SET_PARM_VALUE_COMMA_WS
	: COMMA_DFLT [ ]+
	{
		hide = true;
	}
	->channel(HIDDEN),mode(COMMA_WS_MODE)

	;

SET_PARM_VALUE_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)

	;

SET_PARM_VALUE_WS
	: [ ]+
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(CM_MODE)

	;

SET_PARM_VALUE_COMMA
	: COMMA_DFLT
	->channel(HIDDEN),popMode
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

mode XMIT_PARM_MODE
	;

XMIT_PARM_DEST
	: D E S T
	->type(DEST),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
XMIT_PARM_DLM
	: DD_DLM
	->type(DLM),channel(HIDDEN),pushMode(DLM_MODE)
	;
XMIT_PARM_SUBCHAR
	: S U B C H A R S
	->type(SUBCHARS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
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
	->type(LPAREN),channel(HIDDEN),mode(JOBGROUP_ACCT2_MODE)
	;
JOBGROUP_ACCT1_COMMA
	: COMMA_DFLT
	->channel(HIDDEN),mode(JOBGROUP_PROGRAMMER_NAME_MODE)
	;

JOBGROUP_EMAIL
	: E M A I L
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_GROUP
	: G R O U P
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_HOLD
	: H O L D
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_ERROR
	: E R R O R
	->channel(HIDDEN),pushMode(JOBGROUP_ERROR_MODE)
	;
JOBGROUP_ONERROR
	: O N E R R O R
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_OWNER
	: O W N E R
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PASSWORD
	: P A S S W O R D
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SECLABEL
	: S E C L A B E L
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SCHENV
	: S C H E N V
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SYSAFF
	: S Y S A F F
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_SYSTEM
	: S Y S T E M
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_TYPE
	: T Y P E
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;

JOBGROUP_ACCT1_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;

JOBGROUP_ACCT_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	->channel(HIDDEN);

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
	->type(RPAREN),channel(HIDDEN),mode(JOBGROUP_ACCT3_MODE)
	;

JOBGROUP_ACCT2_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
JOBGROUP_ACCT2_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	->type(JOBGROUP_ACCT_UNQUOTED_STRING),channel(HIDDEN)
	;

JOBGROUP_ACCT2_COMMA
	: COMMA_DFLT
	->channel(HIDDEN)
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
	->type(JOBGROUP_EMAIL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_GROUP
	: JOBGROUP_GROUP
	->type(JOBGROUP_GROUP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_HOLD
	: JOBGROUP_HOLD
	->type(JOBGROUP_HOLD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_ERROR
	: JOBGROUP_ERROR
	->type(JOBGROUP_ERROR),channel(HIDDEN),pushMode(JOBGROUP_ERROR_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_ONERROR
	: JOBGROUP_ONERROR
	->type(JOBGROUP_ONERROR),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_OWNER
	: JOBGROUP_OWNER
	->type(JOBGROUP_OWNER),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_PASSWORD
	: JOBGROUP_PASSWORD
	->type(JOBGROUP_PASSWORD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SCHENV
	: JOBGROUP_SCHENV
	->type(JOBGROUP_SCHENV),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SECLABEL
	: JOBGROUP_SECLABEL
	->type(JOBGROUP_SECLABEL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SYSAFF
	: JOBGROUP_SYSAFF
	->type(JOBGROUP_SYSAFF),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_SYSTEM
	: JOBGROUP_SYSTEM
	->type(JOBGROUP_SYSTEM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_TYPE
	: JOBGROUP_TYPE
	->type(JOBGROUP_TYPE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;

JOBGROUP_PROGRAMMER_NAME_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
JOBGROUP_PROGRAMMER_NAME_UNQUOTED_STRING
	: (~[,'\n\r] | SQUOTE2)+?
	->channel(HIDDEN)
	;

mode JOBGROUP_ERROR_MODE
	;

JOBGROUP_ERROR_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),channel(HIDDEN)
	;
JOBGROUP_ERROR_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),channel(HIDDEN),mode(JOBGROUP_ERROR_PAREN_MODE)
	;

mode JOBGROUP_ERROR_PAREN_MODE
	;

JOBGROUP_ERROR_EQ
	: IF_EQ
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_GE
	: IF_GE
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_GT
	: IF_GT
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_LE
	: IF_LE
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_LT
	: IF_LT
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_NE
	: IF_NE
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_NG
	: IF_NG
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_NL
	: IF_NL
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_NOT
	: IF_NOT
	->type(NOT_SYMBOL),channel(HIDDEN)
	;

JOBGROUP_ERROR_ABEND
	: IF_ABEND
	->type(ABEND),channel(HIDDEN)
	;
JOBGROUP_ERROR_ABENDCC
	: IF_ABENDCC
	->type(ABENDCC),channel(HIDDEN)
	;
JOBGROUP_ERROR_FALSE
	: IF_FALSE
	->type(FALSE),channel(HIDDEN)
	;
JOBGROUP_ERROR_RC
	: IF_RC
	->type(RC),channel(HIDDEN)
	;
JOBGROUP_ERROR_RUN
	: IF_RUN
	->type(RUN),channel(HIDDEN)
	;
JOBGROUP_ERROR_TRUE
	: IF_TRUE
	->type(TRUE),channel(HIDDEN)
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
	->channel(HIDDEN)
	;
JOBGROUP_ERROR_PAREN_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),channel(HIDDEN),pushMode(JOBGROUP_ERROR_PAREN_MODE)
	;
JOBGROUP_ERROR_RPAREN
	: RPAREN_DFLT
	->type(RPAREN),channel(HIDDEN),popMode
	;
JOBGROUP_ERROR_NUM_LIT
	: NUM_LIT_DFLT
	->type(NUM_LIT),channel(HIDDEN)
	;
JOBGROUP_ERROR_ALNUMNAT
	: ALNUMNAT
	->type(ALNUMNAT),channel(HIDDEN)
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

mode GJOB_PARM_MODE
	;

GJOB_PARM_FLUSHTYP
	: F L U S H T Y P
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
GJOB_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
GJOB_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
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

mode JOBSET_PARM_MODE
	;

JOBSET_PARM_FLUSHTYP
	: F L U S H T Y P
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
JOBSET_PARM_WS
	: WS
	->channel(HIDDEN),mode(CM_MODE)
	;
JOBSET_PARM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DEFAULT_MODE)
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

mode AFTER_MODE
	;

AFTER_WS
	: WS
	->channel(HIDDEN),mode(AFTER_PARM_MODE)
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
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
AFTER_PARM_WHEN
	: W H E N
	->channel(HIDDEN),pushMode(JOBGROUP_ERROR_MODE)
	;
AFTER_PARM_ACTION
	: A C T I O N
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
AFTER_PARM_OTHERWISE
	: O T H E R W I S E
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;

mode BEFORE_MODE
	;

BEFORE_WS
	: WS
	->channel(HIDDEN),mode(BEFORE_PARM_MODE)
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
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
BEFORE_PARM_WHEN
	: W H E N
	->channel(HIDDEN),pushMode(JOBGROUP_ERROR_MODE)
	;
BEFORE_PARM_ACTION
	: A C T I O N
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
BEFORE_PARM_OTHERWISE
	: O T H E R W I S E
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;

mode CONCURRENT_MODE
	;

CONCURRENT_WS
	: WS
	->channel(HIDDEN),mode(CONCURRENT_PARM_MODE)
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
	->channel(HIDDEN),pushMode(KYWD_VAL_MODE)
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

mode JES2_JOBPARM_MODE
	;

JES2_JOBPARM_WS
	: WS
	->channel(HIDDEN),mode(JES2_JOBPARM_PARM_MODE)
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
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_BYTES
	: (M | (B Y T E S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_CARDS
	: (C | (C A R D S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_COPIES
	: (N | (C O P I E S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_FORMS
	: (F | (F O R M S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_LINECT
	: (K | (L I N E C T))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_LINES
	: (L | (L I N E S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_NOLOG
	: (J | (N O L O G))
	;

JES2_JOBPARM_PAGES
	: (G | (P A G E S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_PROCLIB
	: (P | (P R O C L I B))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_RESTART
	: (E | (R E S T A R T))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_ROOM
	: (R | (R O O M))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_SYSAFF
	: (S | (S Y S A F F))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_JOBPARM_TIME
	: (T| (T I M E))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

mode JES2_MESSAGE_MODE
	;

JES2_MESSAGE_WS
	: WS
	->channel(HIDDEN),mode(JES2_MESSAGE_PARM_MODE)
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

mode JES2_NETACCT_MODE
	;

JES2_NETACCT_WS
	: WS
	->channel(HIDDEN),mode(JES2_NETACCT_PARM_MODE)
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

mode JES2_NOTIFY_MODE
	;

JES2_NOTIFY_WS
	: WS
	->channel(HIDDEN),mode(JES2_NOTIFY_PARM_MODE)
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

mode JES2_OUTPUT_MODE
	;

JES2_OUTPUT_WS
	: WS
	->channel(HIDDEN),mode(JES2_OUTPUT_PARM_MODE)
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
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_CHARS
	: (X | (C H A R S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_CKPTLNS
	: (E | (C K P T L N S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_CKPTPGS
	: (P | (C K P T P G S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_COMPACT
	: (Z | (C O M P A C T))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_COPIES
	: (N | (C O P I E S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_COPYG
	: (G | (C O P Y G))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_DEST
	: (D | (D E S T))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_FCB
	: (C | (F C B))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_FLASH
	: (O | (F L A S H))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_FLASHC
	: (Q | (F L A S H C))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_FORMS
	: (F | (F O R M S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_INDEX
	: (I | (I N D E X))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_LINDEX
	: (L | (L I N D E X))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_LINECT
	: (K | (L I N E C T))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_MODIFY
	: (Y | (M O D I F Y))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_MODTRC
	: (M | (M O D T R C))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

JES2_OUTPUT_UCS
	: (T | (U C S))
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

mode JES2_PRIORITY_MODE
	;

JES2_PRIORITY_WS
	: WS
	->channel(HIDDEN),mode(JES2_PRIORITY_PARM_MODE)
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

mode JES2_ROUTE_MODE
	;

JES2_ROUTE_WS
	: WS
	->channel(HIDDEN),mode(JES2_ROUTE_PARM_MODE)
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

mode JES2_SETUP_MODE
	;

JES2_SETUP_WS
	: WS
	->channel(HIDDEN),mode(JES2_SETUP_PARM_MODE)
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

mode JES2_XMIT_MODE
	;

JES2_XMIT_WS
	: WS
	->channel(HIDDEN),mode(JES2_XMIT_NODE_MODE)
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
	->channel(HIDDEN)
	;

mode JES2_XMIT_DLM_MODE
	;

JES2_XMIT_DLM
	: DD_DLM
	->type(DLM),channel(HIDDEN),pushMode(DLM_MODE)
	;
JES2_XMIT_DLM_WS
	: WS
	->channel(HIDDEN)
	;
JES2_XMIT_DLM_NEWLINE
	: NEWLINE
	->channel(HIDDEN),mode(DATA_MODE)
	;

mode DATA_PARM_MODE
	;

/*
This adds some flavour.  Note that once in this mode, the only way out
is to hit either a newline or some whitespace and proceed through the
DATA_MODE to get back to DEFAULT_MODE.
*/

DATA_PARM_COL72
	: ANYCHAR
	{
		ckCol72 && getCharPositionInLine() == 72
	}?
	->type(COL_72),channel(COMMENTS)
	;

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
	->type(BLKSIZE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_BUFNO
	: DD_BUFNO
	->type(BUFNO),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DCB
	: DD_DCB
	->type(DCB),channel(HIDDEN),pushMode(DCB_MODE)
	;
DATA_PARM_MODE_DIAGNS
	: DD_DIAGNS
	->type(DIAGNS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DLM
	: DD_DLM
	->type(DLM),channel(HIDDEN),pushMode(DLM_MODE)
	;
DATA_PARM_MODE_DSID
	: DD_DSID
	->type(DSID),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DSN
	: DD_DSN
	->type(DSNAME),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_DSNAME
	: DD_DSNAME
	->type(DSNAME),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_LIKE
	: DD_LIKE
	->type(LIKE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_LRECL
	: DD_LRECL
	->type(LRECL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_REFDD
	: DD_REFDD
	->type(REFDD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_MODE
	: DD_MODE
	->type(MODE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_VOL
	: DD_VOL
	->type(VOL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_VOLUME
	: DD_VOLUME
	->type(VOLUME),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),channel(HIDDEN)
	;
DATA_PARM_MODE_SYMBOLS
	: DD_SYMBOLS
	{
		hide = false;
	}
	->type(SYMBOLS),pushMode(KYWD_VAL_MODE)
	;
DATA_PARM_MODE_SYMLIST
	: DD_SYMLIST
	{
		hide = false;
	}
	->type(SYMLIST),pushMode(KYWD_VAL_MODE)
	;

DATA_PARM_MODE_ANYCHAR
	: ANYCHAR
	->channel(HIDDEN)
	;

mode DLM_MODE
	;

DLM_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),channel(HIDDEN)
	;
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
	->type(KEYWORD_VALUE),channel(HIDDEN),popMode
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
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
DATA_MODE_TERMINATORX
	: ANYCHAR+ {dlmVals.contains(getText())}?
	{
		dlmVals = new java.util.ArrayList();
		_modeStack.clear();
		myMode = DEFAULT_MODE;
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
DD_ASTERISK_DATA
	: ([ \n\r] | ANYCHAR)+?
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


mode QS_MODE
	;

QS_SQUOTE2
	: SQUOTE SQUOTE
	{
		if (hide) setChannel(HIDDEN);
	}

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
	{
		if (hide) setChannel(HIDDEN);
	}

	;
QS_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
QUOTED_STRING_FRAGMENT
	: (ANYCHAR_NOSQUOTE)+?
	{
		if (hide) setChannel(HIDDEN);

		switch(_modeStack.peek()) {
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

mode DCB_MODE
	;

DCB_COL72
	: ANYCHAR
	{
		ckCol72 && getCharPositionInLine() == 72
	}?
	->type(COL_72),channel(COMMENTS)
	;

DCB_LPAREN
	: LPAREN_DFLT
	->type(LPAREN),channel(HIDDEN),pushMode(DCB_PAREN_MODE)
	;
DCB_EQUAL
	: EQUAL_DFLT
	->type(EQUAL),channel(HIDDEN)
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
	->type(BFALN),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BFTEK
	: DD_BFTEK
	->type(BFTEK),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BLKSIZE
	: DD_BLKSIZE
	->type(BLKSIZE),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFIN
	: DD_BUFIN
	->type(BUFIN),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFL
	: DD_BUFL
	->type(BUFL),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFMAX
	: DD_BUFMAX
	->type(BUFMAX),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFNO
	: DD_BUFNO
	->type(BUFNO),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFOFF
	: DD_BUFOFF
	->type(BUFOFF),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFOUT
	: DD_BUFOUT
	->type(BUFOUT),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFRQ
	: DD_BUFRQ
	->type(BUFRQ),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_BUFSIZE
	: DD_BUFSIZE
	->type(BUFSIZE),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_CODE
	: DD_CODE
	->type(CODE),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_CPRI
	: DD_CPRI
	->type(CPRI),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_CYLOFL
	: DD_CYLOFL
	->type(CYLOFL),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_DEN
	: DD_DEN
	->type(DEN),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_DIAGNS
	: DD_DIAGNS
	->type(DIAGNS),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_DSORG
	: DD_DSORG
	->type(DSORG),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_EROPT
	: DD_EROPT
	->type(EROPT),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_FUNC
	: DD_FUNC
	->type(FUNC),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_GNCP
	: DD_GNCP
	->type(GNCP),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_HIARCHY
	: DD_HIARCHY
	->type(HIARCHY),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_INTVL
	: DD_INTVL
	->type(INTVL),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_IPLTXID
	: DD_IPLTXID
	->type(IPLTXID),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_KEYLEN
	: DD_KEYLEN
	->type(KEYLEN),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_LIMCT
	: DD_LIMCT
	->type(LIMCT),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_LRECL
	: DD_LRECL
	->type(LRECL),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_MODE
	: DD_MODE
	->type(MODE),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_NCP
	: DD_NCP
	->type(NCP),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_NTM
	: DD_NTM
	->type(NTM),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_OPTCD
	: DD_OPTCD
	->type(OPTCD),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_PCI
	: DD_PCI
	->type(PCI),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_PRTSP
	: DD_PRTSP
	->type(PRTSP),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_RECFM
	: DD_RECFM
	->type(RECFM),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_RESERVE
	: DD_RESERVE
	->type(RESERVE),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_RKP
	: DD_RKP
	->type(RKP),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_SOWA
	: DD_SOWA
	->type(SOWA),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_STACK
	: DD_STACK
	->type(STACK),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_THRESH
	: DD_THRESH
	->type(THRESH),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_TRTCH
	: DD_TRTCH
	->type(TRTCH),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;

DCB_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
DCB_KEYWORD_VALUE
	: KEYWORD_VALUE
	->type(KEYWORD_VALUE),channel(HIDDEN)
	;

mode DCB_PAREN_MODE
	;

DCB_PAREN_COL72
	: ANYCHAR
	{
		ckCol72 && getCharPositionInLine() == 72
	}?
	->type(COL_72),channel(COMMENTS)
	;

DCB_PAREN_RPAREN
	: RPAREN_DFLT
	->type(RPAREN),channel(HIDDEN),popMode,popMode
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
	->type(BFALN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BFTEK
	: DD_BFTEK
	->type(BFTEK),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BLKSIZE
	: DD_BLKSIZE
	->type(BLKSIZE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFIN
	: DD_BUFIN
	->type(BUFIN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFL
	: DD_BUFL
	->type(BUFL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFMAX
	: DD_BUFMAX
	->type(BUFMAX),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFNO
	: DD_BUFNO
	->type(BUFNO),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFOFF
	: DD_BUFOFF
	->type(BUFOFF),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFOUT
	: DD_BUFOUT
	->type(BUFOUT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFRQ
	: DD_BUFRQ
	->type(BUFRQ),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_BUFSIZE
	: DD_BUFSIZE
	->type(BUFSIZE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_CODE
	: DD_CODE
	->type(CODE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_CPRI
	: DD_CPRI
	->type(CPRI),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_CYLOFL
	: DD_CYLOFL
	->type(CYLOFL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_DEN
	: DD_DEN
	->type(DEN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_DIAGNS
	: DD_DIAGNS
	->type(DIAGNS),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_DSORG
	: DD_DSORG
	->type(DSORG),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_EROPT
	: DD_EROPT
	->type(EROPT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_FUNC
	: DD_FUNC
	->type(FUNC),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_GNCP
	: DD_GNCP
	->type(GNCP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_HIARCHY
	: DD_HIARCHY
	->type(HIARCHY),channel(HIDDEN),mode(KYWD_VAL_MODE)
	;
DCB_PAREN_INTVL
	: DD_INTVL
	->type(INTVL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_IPLTXID
	: DD_IPLTXID
	->type(IPLTXID),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_KEYLEN
	: DD_KEYLEN
	->type(KEYLEN),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_LIMCT
	: DD_LIMCT
	->type(LIMCT),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_LRECL
	: DD_LRECL
	->type(LRECL),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_MODE
	: DD_MODE
	->type(MODE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_NCP
	: DD_NCP
	->type(NCP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_NTM
	: DD_NTM
	->type(NTM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_OPTCD
	: DD_OPTCD
	->type(OPTCD),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_PCI
	: DD_PCI
	->type(PCI),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_PRTSP
	: DD_PRTSP
	->type(PRTSP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_RECFM
	: DD_RECFM
	->type(RECFM),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_RESERVE
	: DD_RESERVE
	->type(RESERVE),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_RKP
	: DD_RKP
	->type(RKP),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_SOWA
	: DD_SOWA
	->type(SOWA),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_STACK
	: DD_STACK
	->type(STACK),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_THRESH
	: DD_THRESH
	->type(THRESH),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;
DCB_PAREN_TRTCH
	: DD_TRTCH
	->type(TRTCH),channel(HIDDEN),pushMode(KYWD_VAL_MODE)
	;

DCB_PAREN_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
DCB_PAREN_KEYWORD_VALUE
	: KEYWORD_VALUE
	->type(KEYWORD_VALUE),channel(HIDDEN)
	;

mode INCLUDE_MODE
	;

INCLUDE_WS
	: [ ]+
	->channel(HIDDEN),mode(INCLUDE_PARM_MODE)
	;

mode INCLUDE_PARM_MODE
	;

INCLUDE_PARM_MEMBER
	: M E M B E R
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)

	;

INCLUDE_PARM_VALUE_NEWLINE
	: NEWLINE
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
INCLUDE_PARM_VALUE_WS
	: [ ]+
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(CM_MODE)
	;

mode JCLLIB_MODE
	;

JCLLIB_WS
	: [ ]+
	->channel(HIDDEN),mode(JCLLIB_PARM_MODE)
	;

mode JCLLIB_PARM_MODE
	;

JCLLIB_PARM_ORDER
	: O R D E R
	{
		hide = false;
	}
	->pushMode(KYWD_VAL_MODE)
	;

JCLLIB_PARM_PROCLIB
	: P R O C L I B
	{
		hide = false;
	}
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
		hide = true;
	}
	->channel(HIDDEN),mode(DEFAULT_MODE)
	;
	
JCLLIB_PARM_WS
	: [ ]+
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(CM_MODE)
	;


mode KYWD_VAL_MODE
	;

KYWD_VAL_EQUAL
	: EQUAL_DFLT
	{
		if (hide) setChannel(HIDDEN);
	}
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
	{
		if (hide) setChannel(HIDDEN);
	}

	;
KYWD_VAL_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
KYWD_VAL_LPAREN
	: LPAREN_DFLT
	{
		if (hide) setChannel(HIDDEN);
	}
	->type(LPAREN),mode(KYWD_VAL_PAREN_MODE)
	;
KYWD_VAL_RPAREN
	: RPAREN_DFLT
	{
		if (hide) setChannel(HIDDEN);
		hide = true;

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
		hide = true;
		mode(myMode);
	}
	->channel(HIDDEN)
	;
KYWD_VAL_COMMA
	: COMMA_DFLT
	{
		hide = true;
	}
	->type(COMMA),channel(HIDDEN),popMode
	;
KYWD_VAL_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	{
		hide = true;
	}
	->channel(HIDDEN),mode(COMMA_NEWLINE_MODE)
	;
KYWD_VAL_COMMA_WS
	: COMMA_DFLT [ ]+
	{
		hide = true;
	}
	->channel(HIDDEN),mode(COMMA_WS_MODE)
	;
KYWD_VAL_WS
	: [ ]+
	{
		_modeStack.clear();
		hide = true;
	}
	->channel(HIDDEN),mode(CM_MODE)
	;

mode KYWD_VAL_PAREN_MODE
	;

KYWD_VAL_PAREN_COMMA
	: COMMA_DFLT
	{
		if (hide) setChannel(HIDDEN);
	}
	->type(COMMA)
	;
KYWD_VAL_PAREN_SYMBOLIC
	: SYMBOLIC
	->type(SYMBOLIC)
	;
KYWD_VAL_PAREN_VALUE
	: KEYWORD_VALUE
	{
		if (hide) setChannel(HIDDEN);
	}
	->type(KEYWORD_VALUE)
	;
KYWD_VAL_PAREN_SQUOTE
	: '\''
	->channel(HIDDEN),pushMode(QS_MODE)
	;
KYWD_VAL_PAREN_LPAREN
	: LPAREN_DFLT
	{
		if (hide) setChannel(HIDDEN);
	}
	->type(LPAREN),pushMode(KYWD_VAL_PAREN_MODE)
	;
KYWD_VAL_PAREN_RPAREN
	: RPAREN_DFLT
	{
		if (hide) setChannel(HIDDEN);
		if (_modeStack.peek() != KYWD_VAL_PAREN_MODE) hide = true;
	}
	->type(RPAREN),popMode
	;

KYWD_VAL_PAREN_EQUAL
	: EQUAL_DFLT
	{
		if (hide) setChannel(HIDDEN);
	}
	->type(EQUAL)
	;

KYWD_VAL_PAREN_COMMA_NEWLINE
	: COMMA_DFLT NEWLINE
	->type(COMMA),channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE)
	;
KYWD_VAL_PAREN_COMMA_WS
	: COMMA_DFLT [ ]+
	->type(COMMA),channel(HIDDEN),pushMode(COMMA_WS_MODE)
	;


