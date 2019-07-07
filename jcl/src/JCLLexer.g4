/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This grammar was built targeting the Java implementation of ANTLR 4, and 
contains embedded code you may have to modify if targeting a different
source code implementation.

JCL may refer to Execution JCL or Cataloged Procedures or fragments
stored in a library referred to by a JCLLIB statement and brought
into the jobstream at execution time via INCLUDE statements. 

A job consists of a JOB statement followed by one or more STEPs.

A STEP consists of an EXEC statement followed by one or more DD
statements and OUTPUT statements.

An EXEC statement may execute a PGM or a PROC.

Why all the modes?

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

//AEIOU JOB
//ELBOW JOB 'HI THERE',TIME=7 HERE IS A COMMENT
//ZEBRA EXEC PGM=J8765309 ,PARM='THIS IS A COMMENT STARTING AT THE COMMA'
//DD001 DD  DISP=SHR,DSN=SYS1.PARMLIB

And that's why all the modes.  So white space in DEFAULT_MODE can ->mode(CM).

Also, it is difficult to overstate the ugliness of the DLM parameter in
conjunction with DD * and DD DATA.  More modes, along with globals.

{System.out.println(getLine() + ":" + getCharPositionInLine() + " / " + getText() + "/");}
*/

lexer grammar JCLLexer;

@lexer::members {

    public java.util.Set<String> defaultDlmVals = new java.util.HashSet<String>(){{
      add("//");
      add("/*");
    }};
    public java.util.ArrayList<String> dlmVals = new java.util.ArrayList(defaultDlmVals);

}

tokens { COMMENT_FLAG , CNTL , COMMAND , DD , ELSE , ENDCNTL , ENDIF , EXEC , IF , INCLUDE , JCLLIB , JOB , NOTIFY , OUTPUT , PEND , PROC , SCHEDULE , SET , XMIT, EQUAL , ACCODE , AMP , ASTERISK , AVGREC , BLKSIZE ,  BLKSZLIM , BUFNO , BURST , CCSID , CHARS , CHKPT , COPIES , DATA , DATACLAS , DCB , DDNAME , DEST , DIAGNS , DISP , DLM , DSID , DSKEYLBL , DSN , DSNAME , DSNTYPE , DUMMY , DYNAM , EATTR , EXPDT , EXPORT , FCB , FILEDATA , FLASH , FREE , FREEVOL , GDGORDER , HOLD , KEYLABL1 , KEYLABL2 , KEYENCD1 , KEYENCD2 , KEYLEN , KEYOFF , LABEL , LGSTREAM , LIKE , LRECL , MAXGENS , MGMTCLAS , MODE, MODIFY , OUTLIM , OUTPUT , PATH , PATHDISP , PATHMODE , PATHOPTS , PROTECT , RECFM , RECORG , REFDD , RETPD , RLS , ROACCESS , SECMODEL , SEGMENT , SER , SPACE , SPIN , STORCLAS , SUBSYS , SYMBOLS , SYMLIST , SYSOUT , TERM , UCS , UNIT , VOL , VOLUME , COMMA , ABEND , ABENDCC , NOT_SYMBOL , TRUE , FALSE , RC , RUN , CNVTSYS , EXECSYS , JCLONLY , LOGGING_DDNAME , NUM_LIT , LPAREN , RPAREN , BFALN , BFTEK , BUFIN , BUFL , BUFMAX , BUFOFF , BUFOUT , BUFSIZE , CPRI , CYLOFL , DEN , DSORG , EROPT , FUNC , GNCP , INTVL , IPLTXID , LIMCT , NCP , NTM , OPTCD , PCI , PRTSP , RESERVE , RKP , STACK , THRESH , TRTCH }

// lexer rules --------------------------------------------------------------------------------

SS : SLASH SLASH {getCharPositionInLine() == 2}? ->mode(NM) ;
LINE_NB : ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR {getCharPositionInLine() == 80}? -> skip;
COMMENT_FLAG : SLASH SLASH ASTERISK {getCharPositionInLine() == 3}? ->mode(CM);
COMMENT_FLAG_INLINE : COMMA_DFLT ' ' ->mode(CM) ;
//NAME_FIELD : NAME (DOT NAME)? {System.out.println("NAME_FIELD found " + getVocabulary().getSymbolicName(myTerminalNode.getSymbol().getType()));} ->mode(OP) ;
COND_OP : COND_EQ | COND_GE | COND_GT | COND_LE | COND_LT | COND_NE ;
OUTPUT_LIMIT_OPTION : CANCEL | DUMP | WARNING ;
MEM_UNIT : U | K | M | G | T | P ;
NUM_MEM_VAL : NUM_LIT_DFLT MEM_UNIT ;
SYMBOLIC : AMPERSAND [A-Z0-9@#$]+ {getText().length() <= 9}? ;

ABEND_DFLT : A B E N D ->type(ABEND) ;
ABENDCC_DFLT : A B E N D C C ->type(ABENDCC) ;
ABSTR : A B S T R ;
ACCODE_DFLT : A C C O D E ->type(ACCODE) ;
ACCBIAS : A C C B I A S ;
ACCT : A C C T ;
ADDRESS : A D D R E S S ;
ADDRSPC : A D D R S P C ;
AFF : A F F ;
AFPPARMS : A F P P A R M S ->mode(DSN_MODE);
AFPSTATS : A F P S T A T S ;
AFTER : A F T E R ;
ALIGN : A L I G N ;
ALL : A L L ;
ALLOW : A L L O W ;
ALPHA : [A-Z] ;
ALX : A L X ;
AMORG : A M O R G ;
AMP_DFLT : A M P ->type(AMP) ;
AMPERSAND : '&' ;
ANY : A N Y ;
ANYLOCAL : A N Y L O C A L ;
ASTERISK : '*' ;
AVGREC_DFLT : A V G R E C ->type(AVGREC) ;
BACKOUT : B A C K O U T ;
BASIC : B A S I C ;
BEFORE : B E F O R E ;
BFALN_DFLT : B F A L N ->type(BFALN);
BFALN_D : D ;
BFALN_F : F ;
BFTEK_DFLT : B F T E K ->type(BFTEK) ;
BINARY : B I N A R Y ;
BLKCHAR : B L K C H A R ;
BLKPOS : B L K P O S ;
BLKSIZE_DFLT : B L K S I Z E ->type(BLKSIZE) ;
BLKSZLIM_DFLT : B L K S Z L I M ->type(BLKSZLIM) ;
BLOCK : B L O C K ;
BUFF : B U F F ;
BUFIN_DFLT : B U F I N ->type(BUFIN) ;
BUFL_DFLT : B U F L ->type(BUFL) ;
BUFMAX_DFLT : B U F M A X ->type(BUFMAX) ;
BUFND : B U F N D ;
BUFNI : B U F N I ;
BUFNO_DFLT : B U F N O ->type(BUFNO) ;
BUFOFF_DFLT : B U F O F F ->type(BUFOFF) ;
BUFOUT_DFLT : B U F O U T ->type(BUFOUT) ;
BUFSIZE_DFLT : B U F S I Z E ->type(BUFSIZE) ;
BUFSP : B U F S P ;
BUILDING : B U I L D I N G ;
BURST_DFLT : B U R S T ->type(BURST) ;
BYTES : B Y T E S ; 
CANCEL : C A N C E L ;
CARDS : C A R D S ;
CATLG : C A T L G ;
CB : C B ;
CCSID_DFLT : C C S I D ->type(CCSID) ;
CHARS_DFLT : C H A R S ->type(CHARS) ;
CHKPT_DFLT : C H K P T ->type(CHKPT) ;
CKPTLINE : C K P T L I N E ;
CKPTPAGE : C K P T P A G E ;
CKPTSEC : C K P T S E C ;
CLASS : C L A S S ->mode(CL) ;
CLOSE : C L O S E ;
CM_UNIT : C M ;
CMNDONLY : C M N D O N L Y ;
CNTL_DFLT : C N T L ->mode(CNTL_MODE),type(CNTL) ;
CNVTSYS_DFLT : C N V T S Y S ->type(CNVTSYS) ;
COLORMAP : C O L O R M A P ;
COMMA_DFLT : ',' ->type(COMMA) ;
COMMAND_DFLT : C O M M A N D ->mode(POST_OP),type(COMMAND) ;
COMMIT : C O M M I T ;
COMPACT : C O M P A C T ;
COMSETUP : C O M S E T U P ;
COND : C O N D ;
COND_EQ : E Q ;
COND_GE : G E ;
COND_GT : G T ;
COND_LE : L E ;
COND_LT : L T ;
COND_NE : N E ;
CONTIG : C O N T I G ;
CONTROL : C O N T R O L ;
COPIES_DFLT : C O P I E S ->type(COPIES) ;
COPY : C O P Y ;
COPYCNT : C O P Y C N T ;
CPRI_DFLT : C P R I ->type(CPRI) ;
CR : C R ;
CRE : C R E ;
CROPS : C R O P S ;
CYL : C Y L ;
CYLOFL_DFLT : C Y L O F L ->type(CYLOFL) ;
DATA_DFLT : D A T A ->type(DATA) ;
DATACK : D A T A C K ;
DATACLAS_DFLT : D A T A C L A S ->type(DATACLAS) ;
DCB_DFLT : D C B ->type(DCB),mode(DSN_MODE) ;
DD_DFLT : D D ->mode(DD_OP),type(DD) ;
DDNAME_DFLT : D D N A M E ;
DEFAULT : D E F A U L T ;
DEFER : D E F E R ;
DELAY : D E L A Y ;
DELETE : D E L E T E ;
DEN_DFLT : D E N ->type(DEN) ;
DEPT : D E P T ;
DEST_DFLT : D E S T ->type(DEST) ;
DIAGNS_DFLT : D I A G N S ->type(DIAGNS) ;
DISALLOW : D I S A L L O W ;
DISP_DFLT : D I S P ->type(DISP) ;
DLM_DFLT : D L M ->pushMode(DLM_MODE),type(DLM) ;
DO : D O ;
DOT : '.' ;
DOUBLE : D O U B L E ;
DPAGELBL : D P A G E L B L ;
DQUOTE : '"' ;
DSENQSHR : D S E N Q S H R ;
DSID_DFLT : D S I D ->type(DSID) ;
DSKEYLBL_DFLT : D S K E Y L B L ->type(DSKEYLBL) ;
DSN_DFLT : D S N ->type(DSN),mode(DSN_MODE);
DSNAME_DFLT : D S N A M E ->type(DSNAME),mode(DSN_MODE) ;
DSORG_DFLT : D S O R G ->type(DSORG) ;
DSNTYPE_DFLT : D S N T Y P E ->type(DSNTYPE) ;
DUMMY_DFLT : D U M M Y ->type(DUMMY) ;
DUMP : D U M P ;
DUPLEX : D U P L E X ;
DW : D W ;
DYNAM_DFLT : D Y N A M ->type(DYNAM) ;
DYNAMNBR : D Y N A M N B R ;
EATTR_DFLT : E A T T R ->type(EATTR) ;
ECODE : E C O D E ;
ELSE_DFLT : E L S E ->mode(POST_OP),type(ELSE) ;
EMAIL : E M A I L ;
END : E N D ;
ENDCNTL_DFLT : E N D C N T L ->mode(POST_OP),type(ENDCNTL) ;
ENDIF_DFLT : E N D I F ->mode(POST_OP),type(ENDIF) ;
EOV : E O V ;
EQUAL_DFLT : '=' ->type(EQUAL) ;
EROPT_DFLT : E R O P T ->type(EROPT) ;
EVEN : E V E N ;
EXEC_DFLT : E X E C ->mode(EX),type(EXEC) ;
EXECSYS_DFLT : E X E C S Y S ->type(EXECSYS) ;
EXPDT_DFLT : E X P D T ->type(EXPDT) ;
EXTLOCK : E X T L O C K ;
EXPORT_DFLT : E X P O R T ->mode(POST_OP),type(EXPORT) ;
EXTPREF : E X T P R E F ;
EXTREQ : E X T R E Q ;
FALSE_DFLT : F A L S E ->type(FALSE) ;
FCB_DFLT : F C B ->type(FCB) ;
FIFO : F I F O ;
FILEDATA_DFLT : F I L E D A T A ->type(FILEDATA) ;
FLASH_DFLT : F L A S H ->type(FLASH) ;
FOLD : F O L D ;
FOREVER : F O R E V E R ;
FORMDEF : F O R M D E F ;
FORMLEN : F O R M L E N ;
FORMS : F O R M S ;
FOURTEENFORTY : '1' '4' '4' '0' ;
FREE_DFLT : F R E E ->type(FREE) ;
FREEVOL_DFLT : F R E E V O L ->type(FREEVOL) ;
FRLOG : F R L O G ;
FSSDATA : F S S D A T A ;
FUNC_DFLT : F U N C ->type(FUNC) ;
GDGBIAS : G D G B I A S ->mode(GDGBIAS_MODE);
GDGORDER_DFLT : G D G O R D E R ->type(GDGORDER) ;
GENERIC : G E N E R I C ;
GNCP_DFLT : G N C P ->type(GNCP) ;
GROUP : G R O U P ;
GROUPID : G R O U P I D ;
HFS : H F S ;
HOLD_DFLT : H O L D ->type(HOLD) ;
HOLDUNTIL : H O L D U N T I L ;
HOOK : H O O K ;
HYPHEN : '-' ;
IF_DFLT : I F ->mode(POST_OP),type(IF) ;
IN : I N ;
INCLUDE_DFLT : I N C L U D E ->mode(POST_OP),type(INCLUDE) ;
IND : I N D ;
INDEX : I N D E X ;
INTRAY : I N T R A Y ;
INTVL_DFLT : I N T V L ->type(INTVL) ;
IPLTXID_DFLT : I P L T X I D ->type(IPLTXID) ;
JCL : J C L ;
JCLERR : J C L E R R ;
JCLHOLD : J C L H O L D ;
JCLLIB_DFLT : J C L L I B ->mode(POST_OP),type(JCLLIB) ;
JCLONLY_DFLT : J C L O N L Y ->type(JCLONLY) ;
JESDS : J E S D S ;
JESLOG : J E S L O G ;
JGLOBAL : J G L O B A L ;
JLOCAL : J L O C A L ;
JOB_DFLT : J O B ->mode(POST_OP),type(JOB) ;
JOBGROUP : J O B G R O U P ;
JOBRC : J O B R C ->mode(JOBRC_MODE);
KEEP : K E E P ;
KEY : K E Y ;
KEYENCD1_DFLT : K E Y E N C D '1' ->type(KEYENCD1) ;
KEYENCD2_DFLT : K E Y E N C D '2' ->type(KEYENCD2) ;
KEYLABL1_DFLT : K E Y L A B L '1' ->type(KEYLABL1) ;
KEYLABL2_DFLT : K E Y L A B L '2' ->type(KEYLABL2) ;
KEYLEN_DFLT : K E Y L E N ->type(KEYLEN) ;
KEYOFF_DFLT : K E Y O F F ->type(KEYOFF) ;
LABEL_DFLT : L A B E L ->type(LABEL) ;
LARGE : L A R G E ;
//LASTRC : L A S T R C ;
LEAVE : L E A V E ;
LGSTREAM_DFLT : L G S T R E A M ->type(LGSTREAM),mode(DSN_MODE) ;
LIBRARY : L I B R A R Y ;
LIFO : L I F O ;
LIKE_DFLT : L I K E ->type(LIKE),mode(DSN_MODE) ;
LIMCT_DFLT : L I M C T ->type(LIMCT) ;
LINDEX : L I N D E X ;
LINECT : L I N E C T ;
LINES : L I N E S ;
LOCAL : L O C A L ;
LOG : L O G ;
LPAREN_DFLT : '(' ->type(LPAREN) ;
LRECL_DFLT : L R E C L ->type(LRECL) ;
MAILBCC : M A I L B C C ;
MAILCC : M A I L C C ;
MAILFILE : M A I L F I L E ;
MAILFROM : M A I L F R O M ;
MAILTO : M A I L T O ;
MAXGENS_DFLT : M A X G E N S ->type(MAXGENS) ;
MAXIMUM : M A X I M U M ;
//MAXRC : M A X R C ;
MEMBER : M E M B E R ->mode(MEMBER_MODE) ;
MEMLIMIT : M E M L I M I T ;
MERGE : M E R G E ;
MGMTCLAS_DFLT : M G M T C L A S ->type(MGMTCLAS) ;
MM : M M ;
MOD : M O D ;
MODE_DFLT : M O D E ->type(MODE) ;
MODE_PARMS : [CEOR]+ ;
MODIFY_DFLT : M O D I F Y ->type(MODIFY) ;
MSG : M S G ;
MSGCLASS : M S G C L A S S ;
MSGLEVEL : M S G L E V E L ;
MXIG : M X I G ;
NAME_OUTPUT : N A M E ;
fragment NATL : [@#$] ;
NC : N C ;
NCK : N C K ;
NCP_DFLT : N C P ->type(NCP) ;
NEW : N E W ;
NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;
NOCMND : N O C M N D ;
NOLIMIT : N O L I M I T ;
NONE : N O N E ;
NOPWREAD : N O P W R E A D ;
NORMAL : N O R M A L ;
NOSPIN : N O S P I N ;
NOT_SYMBOL_DFLT : [^!] ->type(NOT_SYMBOL) ;
NOTIFY_DFLT : N O T I F Y ->type(NOTIFY) ;
NR : N R ;
NRC : N R C ;
NRE : N R E ;
NRI : N R I ;
NTM_DFLT : N T M ->type(NTM) ;
NULLFILE : N U L L F I L E ;
fragment NUM : [0-9] ;
OFF : O F F ;
OFFSETXB : O F F S E T X B ;
OFFSETXF : O F F S E T X F ;
OFFSETYB : O F F S E T Y B ;
OFFSETYF : O F F S E T Y F ;
OLD : O L D ;
ON : O N ;
ONLY : O N L Y ;
OPT : O P T ;
OPTCD_DFLT : O P T C D ->type(OPTCD) ;
OPTCD_I : I ;
OPTCD_L : L ;
OPTCD_IL : I L ;
ORDER : O R D E R ->mode(DSN_MODE) ;
OUTBIN : O U T B I N ;
OUTDISP : O U T D I S P ;
OUTLIM_DFLT : O U T L I M ->type(OUTLIM) ;
OUTPUT_DFLT : O U T P U T ->mode(POST_OP),type(OUTPUT) ;
OVERLAYB : O V E R L A Y B ;
OVERLAYF : O V E R L A Y F ;
OVFL : O V F L ;
PAGEDEF : P A G E D E F ;
PAGES : P A G E S ;
PARM : P A R M ;
PARMDD : P A R M D D ;
PARM1 : P A R M '1' ;
PARM2 : P A R M '2' ;
PASS : P A S S ;
PASSWORD : P A S S W O R D ;
PATH_DFLT : P A T H ->type(PATH) ;
PATHDISP_DFLT : P A T H D I S P ->type(PATHDISP) ;
PATHMODE_DFLT : P A T H M O D E ->type(PATHMODE) ;
PATHOPTS_DFLT : P A T H O P T S ->type(PATHOPTS) ;
PCI_DFLT : P C I ->type(PCI) ;
PDS : P D S ;
PELS : P E L S ;
PEND_DFLT : P E N D ->mode(POST_OP),type(PEND) ;
PERFORM : P E R F O R M ;
PIMSG : P I M S G ;
PIPE : P I P E ;
POINTS : P O I N T S ;
PORTNO : P O R T N O ;
PRIVATE : P R I V A T E ;
PRMODE : P R M O D E ;
PROC_DFLT : P R O C ->mode(POST_OP),type(PROC) ;
PROGRAM : P R O G R A M ;
PROTECT_DFLT : P R O T E C T ->type(PROTECT) ;
PRTATTRS : P R T A T T R S ;
PRTERROR : P R T E R R O R ;
PRTOPTNS : P R T O P T N S ;
PRTQUEUE : P R T Q U E U E ;
PRTSP_DFLT : P R T S P ->type(PRTSP) ;
PRTY : P R T Y ;
PURGE : P U R G E ;
QUIT : Q U I T ;
RC_DFLT : R C ->type(RC) ;
RCK : R C K ;
RD : R D ->mode(RD_MODE) ;
REAL : R E A L ;
RECFM_DFLT : R E C F M ->type(RECFM) ;
RECORD : R E C O R D ;
RECORG_DFLT : R E C O R G ->type(RECORG) ;
REDO : R E D O ;
REF : R E F ->mode(DSN_MODE) ;
REFDD_DFLT : R E F D D ->type(REFDD) ;
REGION : R E G I O N ;
REGIONX : R E G I O N X ;
RESERVE_DFLT : R E S E R V E ->type(RESERVE) ;
RESTART : R E S T A R T ;
RETAIN : R E T A I N ;
RETPD_DFLT : R E T P D ->type(RETPD) ;
RKP_DFLT : R K P ->type(RKP) ;
RLS_DFLT : R L S ->type(RLS) ;
RLSE : R L S E ;
RLSTMOUT : R L S T M O U T ;
RMODE31 : R M O D E '3' '1' ;
RNC : R N C ;
ROACCESS_DFLT : R O A C C E S S ->type(ROACCESS) ;
ROUND : R O U N D ;
RPAREN_DFLT : ')' ->type(RPAREN) ;
REPLYTO : R E P L Y T O ;
RESFMT : R E S F M T ;
RETAINF : R E T A I N F ;
RETAINS : R E T A I N S ;
RETRYL : R E T R Y L ;
RETRYT : R E T R Y T ;
ROOM : R O O M ;
RUN_DFLT : R U N ->type(RUN) ;
SCAN : S C A N ;
SCHEDULE_DFLT : S C H E D U L E ->mode(POST_OP),type(SCHEDULE) ;
SCHENV : S C H E N V ;
SECERR : S E C E R R ;
SECLABEL : S E C L A B E L ;
SECMODEL_DFLT : S E C M O D E L ->type(SECMODEL),mode(SECMODEL_MODE) ;
SEGMENT_DFLT : S E G M E N T ->type(SEGMENT) ;
SER_DFLT : S E R ->type(SER);
SET_DFLT : S E T ->mode(POST_OP),type(SET) ;
SHR : S H R ;
SINGLE : S I N G L E ;
SLASH : '/' ;
SMBBIAS : S M B B I A S ;
SMBDFR : S M B D F R ;
SMSHONOR : S M S H O N O R ;
NO : N O ;
YES : Y E S ;
SMBHWT : S M B H W T ;
SMBVSP : S M B V S P ;
SMBVSPI : S M B V S P I ;
SO : S O ;
SPACE_DFLT : S P A C E ->type(SPACE) ;
SPIN_DFLT : S P I N ->type(SPIN) ;
SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
SQUOTE2 : SQUOTE SQUOTE ;
STACK_DFLT : S T A C K ->type(STACK) ;
STARTBY : S T A R T B Y ;
STD : S T D ;
//STEP : S T E P ;
STORCLAS_DFLT : S T O R C L A S ->type(STORCLAS) ;
STRNO : S T R N O ;
SUBSYS_DFLT : S U B S Y S ->type(SUBSYS) ;
SUPPRESS : S U P P R E S S ;
SW : S W ;
SYMBOLS_DFLT : S Y M B O L S ->type(SYMBOLS) ;
SYMLIST_DFLT : S Y M L I S T ->type(SYMLIST) ;
SYNAD : S Y N A D ;
SYSAFF : S Y S A F F ;
SYSAREA : S Y S A R E A ;
SYSOUT_DFLT : S Y S O U T ->type(SYSOUT) ;
SYSTEM : S Y S T E M ;
TERM_DFLT : T E R M ->type(TERM) ;
TEXT : T E X T ;
THRESH_DFLT : T H R E S H ->type(THRESH) ;
THRESHLD : T H R E S H L D ;
TIME : T I M E ;
TITLE : T I T L E ;
TRACE : T R A C E ;
TRC : T R C ;
TRIPLE : T R I P L E ;
TRK : T R K ;
TRKLOCK : T R K L O C K ;
TRTCH_DFLT : T R T C H ->type(TRTCH) ;
TRUE_DFLT : T R U E ->type(TRUE) ;
TUMBLE : T U M B L E ;
TVSMSG : T V S M S G ;
TVSAMCOM : T V S A M C O M ;
TYPE : T Y P E ;
TYPRUN : T Y P R U N ;
UCS_DFLT : U C S ->type(UCS) ;
UJOBCORR : U J O B C O R R ;
UNALLOC : U N A L L O C ;
UNBLOCK : U N B L O C K ;
UNCATLG : U N C A T L G ;
UNIT_DFLT : U N I T ->type(UNIT) ;
USCORE : '_' ;
USECATLG : U S E C A T L G ;
USEJC : U S E J C ;
USER : U S E R ;
USERDATA : U S E R D A T A ;
USERLIB : U S E R L I B ->mode(DSN_MODE);
USERPATH : U S E R P A T H ;
VERIFY : V E R I F Y ;
VIRT : V I R T ;
VOL_DFLT : V O L ->type(VOL) ;
VOLUME_DFLT : V O L U M E ->type(VOLUME) ;
WARNING : W A R N I N G ;
WHEN : W H E N ;
WHEN_GE : '>' '=' ;
WHEN_GT : '>' ;
WHEN_LE : '<' '=' ;
WHEN_LOGICAL : AMPERSAND | '|' ;
WHEN_LT : '<' ;
WHEN_NE : NOT_SYMBOL_DFLT EQUAL_DFLT ;
WHEN_NG : (N G) | (NOT_SYMBOL_DFLT '>') ;
WHEN_NL : (N L) | (NOT_SYMBOL_DFLT '<') ;
WHEN_REL_EXP_KEYWORD : ABEND_DFLT | ABENDCC_DFLT | RC_DFLT | RUN_DFLT | SECERR | JCLERR ;
WHEN_REL_OP : COND_OP | EQUAL_DFLT | WHEN_GE | WHEN_LE | WHEN_NE | WHEN_NG | WHEN_NL ;
WHEN_CHECK : NOT_SYMBOL_DFLT? WHEN_REL_EXP_KEYWORD (WHEN_REL_OP (FALSE_DFLT | TRUE_DFLT | NUM_LIT_DFLT | ALNUMNAT))? ;
WITH : W I T H ;
WRITE : W R I T E ;
WRITER : W R I T E R ;
WS : [ ]+ ->channel(HIDDEN),mode(CM) ;
XMIT_DFLT : X M I T ->mode(POST_OP),type(XMIT) ;

fragment ANYCHAR : ~[\n\r] ;
NAME : (NATL | ALPHA) (ALPHA | NATL | NUM)* {getText().length() < 9}? ;
NUM_LIT_DFLT : NUM+ ->type(NUM_LIT) ;
ALNUMNAT : (ALPHA | NATL | NUM)+ ;
DSNTYPE_VAL : BASIC | EXTPREF | EXTREQ | HFS | LARGE | LIBRARY | PDS | PIPE | (LPAREN_DFLT LIBRARY COMMA_DFLT ('1' | '2') RPAREN_DFLT) ;
SIMPLE_STRING : (ALPHA | NATL | NUM | HYPHEN | USCORE)+ ;
UNQUOTED_STRING : (~['\n\r] | SQUOTE2)+? ;
DSID_VAL : (ALPHA | NATL | NUM | HYPHEN | '[')+ ;


A:'A';
B:'B';
C:'C';
D:'D';
E:'E';
F:'F';
G:'G';
H:'H';
I:'I';
J:'J';
K:'K';
L:'L';
M:'M';
N:'N';
O:'O';
P:'P';
Q:'Q';
R:'R';
S:'S';
T:'T';
U:'U';
V:'V';
W:'W';
X:'X';
Y:'Y';
Z:'Z';



mode CM ;

NEWLINE_CM : NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;
COMMENT_TEXT : (' ' | ANYCHAR)+ ;

mode NM ;

JOBLIB : J O B L I B ;
SYSCHK : S Y S C H K ;
NAME_FIELD : NAME (DOT NAME)? ->mode(OP) ;
CONTINUATION_WS : ' '+ {getText().length() <= 13}? ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode OP ;

/*
Note that these JCL operations are duplicated in the DEFAULT_MODE section.  This
is because of that darn rule that says whitespace is sometimes a delimiter to
indicate comments follow.  Observe...

//STEP01 EXEC PGM=IEFBR14 THIS IS A COMMENT
// EXEC PGM=IEFBR14 THIS IS A COMMENT

...when we see token SS (slash slash) we go looking for either NAME_FIELD or
CONTINUATION_WS.  If we find the former, we end up here in mode(OP) but if we
find the latter we must go back to DEFAULT_MODE because who knows what we will
find next.  In either case, we might find a JCL operation and thus the duplication.

*/

CNTL_OP : C N T L ->mode(POST_OP),type(CNTL) ;
COMMAND_OP : C O M M A N D ->mode(POST_OP),type(COMMAND) ;
DD_OP : D D->mode(DD_OP),type(DD) ;
ELSE_OP : E L S E ->mode(POST_OP),type(ELSE) ;
ENDCNTL_OP : E N D C N T L ->mode(POST_OP),type(ENDCNTL) ;
ENDIF_OP : E N D I F ->mode(POST_OP),type(ENDIF) ;
EXEC_OP : E X E C ->mode(EX),type(EXEC) ;
EXPORT_OP : E X P O R T ->mode(POST_OP),type(EXPORT) ;
IF_OP : I F ->mode(POST_IF),type(IF) ;
INCLUDE_OP : I N C L U D E ->mode(POST_OP),type(INCLUDE) ;
JCLLIB_OP : J C L L I B ->mode(POST_OP),type(JCLLIB) ;
JOB_OP : J O B ->mode(POST_OP),type(JOB) ;
NOTIFY_OP : N O T I F Y ->mode(POST_OP),type(NOTIFY) ;
OUTPUT_OP : O U T P U T ->mode(POST_OP),type(OUTPUT) ;
PEND_OP : P E N D ->mode(POST_OP),type(PEND) ;
PROC_OP : P R O C ->mode(POST_OP),type(PROC) ;
SCHEDULE_OP : S C H E D U L E ->mode(POST_OP),type(SCHEDULE) ;
SET_OP : S E T ->mode(POST_OP),type(SET) ;
XMIT_OP : X M I T ->mode(POST_OP),type(XMIT) ;

WS_OP : [ ]+ ->channel(HIDDEN) ;

mode POST_OP ;

WS_POST_OP : [ ]+ ->channel(HIDDEN),mode(DEFAULT_MODE) ;
NEWLINE_POST_OP : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode RD_MODE ;

RD_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
RD_VALUE : (R | RNC | NR | NC) ->mode(DEFAULT_MODE);

mode EX ;

/*
This is a specialized version of POST_OP, it exists because PROC is
both an operation and a parameter...

//DOTHIS PROC 

...and...

//DOTHIS EXEC PROC=P99

...not to mention...

//DOTHIS EXEC P99

...and we must behave differently.  
*/

WS_POST_EX : [ ]+ ->channel(HIDDEN) ;
NEWLINE_POST_EX : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;
PGM : P G M ;
PROC_EX : P R O C ;
EQUAL_EX : EQUAL_DFLT ->type(EQUAL) ;
NAME_EX : NAME ->mode(DEFAULT_MODE) ;

mode POST_IF ;

ABEND_IF : A B E N D ->type(ABEND) ;
ABENDCC_IF : A B E N D C C ->type(ABENDCC) ;
FALSE_IF : F A L S E ->type(FALSE) ;
NOT_SYMBOL_IF : [^!] ->type(NOT_SYMBOL) ;
RC_IF : R C ->type(RC) ;
RUN_IF : R U N ->type(RUN) ;
THEN : T H E N ->mode(DEFAULT_MODE) ;
TRUE_IF : T R U E ->type(TRUE) ;
WS_POST_IF : [ ]+ ->channel(HIDDEN) ;
NEWLINE_POST_IF : [\n\r] ->channel(HIDDEN) ;
IF_REL_OP : WHEN_REL_OP ;
IF_LOGICAL : AMPERSAND | '|' ;
LPAREN_IF : LPAREN_DFLT ->type(LPAREN) ;
RPAREN_IF : RPAREN_DFLT ->type(RPAREN) ;
IF_REL_EXP_KEYWORD : ABEND_IF | ABENDCC_IF | RC_IF | RUN_IF ;
IF_STEP : NAME (DOT NAME)? ;
IF_CHECK : NOT_SYMBOL_IF? (IF_STEP DOT)? IF_REL_EXP_KEYWORD (IF_REL_OP (FALSE_IF | TRUE_IF | NUM_LIT_DFLT | ALNUMNAT))? ;

mode CL ;

EQUAL_CL : EQUAL_DFLT ->type(EQUAL) ;
CLASS_VAL : (
    (ASTERISK | SYMBOLIC) | 
    ((NUM | ALPHA) (ALPHA | NATL | NUM)*)
  ) {getText().length() < 9}? ->mode(DEFAULT_MODE) ;


mode DD_OP ;

WS_DD_OP : [ ]+ ->channel(HIDDEN) ;
NEWLINE_DD_OP : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;
DD_OP_COMMA : COMMA_DFLT ->type(COMMA) ;

DD_ACCODE : ACCODE_DFLT ->type(ACCODE),mode(DEFAULT_MODE) ;
DD_AMP : AMP_DFLT ->type(AMP),mode(DEFAULT_MODE) ;
DD_AVGREC : AVGREC_DFLT ->type(AVGREC),mode(DEFAULT_MODE) ;
DD_ASTERISK : '*' ->type(ASTERISK),mode(DATA_PARM_MODE) ;
DD_BLKSIZE : BLKSIZE_DFLT ->type(BLKSIZE),mode(DEFAULT_MODE) ;
DD_BLKSZLIM : BLKSZLIM_DFLT ->type(BLKSZLIM),mode(DEFAULT_MODE) ;
DD_BURST : BURST_DFLT ->type(BURST),mode(DEFAULT_MODE) ;
DD_CCSID : CCSID_DFLT ->type(CCSID),mode(DEFAULT_MODE) ;
DD_CHARS : CHARS_DFLT ->type(CHARS),mode(DEFAULT_MODE) ;
DD_CHKPT : CHKPT_DFLT ->type(CHKPT),mode(DEFAULT_MODE) ;
DD_CNTL : CNTL_DFLT ->type(CNTL),mode(DEFAULT_MODE) ;
DD_COPIES : COPIES_DFLT ->type(COPIES),mode(DEFAULT_MODE) ;
DD_DATA : DATA_DFLT ->type(DATA),mode(DATA_PARM_MODE) ;
DD_DATACLAS : DATACLAS_DFLT ->type(DATACLAS),mode(DEFAULT_MODE) ;
DD_DCB : DCB_DFLT ->type(DCB),mode(DSN_MODE) ;
DD_DDNAME : DDNAME_DFLT ->type(DDNAME),mode(DEFAULT_MODE) ;
DD_DEST : DEST_DFLT ->type(DEST),mode(DEFAULT_MODE) ;
DD_DISP : DISP_DFLT ->type(DISP),mode(DEFAULT_MODE) ;
DD_DLM : DLM_DFLT ->type(DLM),mode(DEFAULT_MODE) ;
DD_DSID : DSID_DFLT ->type(DSID),mode(DEFAULT_MODE) ;
DD_DSKEYLBL : DSKEYLBL_DFLT ->type(DSKEYLBL),mode(DEFAULT_MODE) ;
DD_DSN : DSN_DFLT ->type(DSN),mode(DSN_MODE) ;
DD_DSNAME : DSNAME_DFLT ->type(DSNAME),mode(DSN_MODE) ;
DD_DSNTYPE : DSNTYPE_DFLT ->type(DSNTYPE),mode(DEFAULT_MODE) ;
DD_DUMMY : DUMMY_DFLT ->type(DUMMY),mode(DEFAULT_MODE) ;
DD_DYNAM : DYNAM_DFLT ->type(DYNAM),mode(DEFAULT_MODE) ;
DD_EATTR : EATTR_DFLT ->type(EATTR),mode(DEFAULT_MODE) ;
DD_EXPDT : EXPDT_DFLT ->type(EXPDT),mode(DEFAULT_MODE) ;
DD_FCB : FCB_DFLT ->type(FCB),mode(DEFAULT_MODE) ;
DD_FILEDATA : FILEDATA_DFLT ->type(FILEDATA),mode(DEFAULT_MODE) ;
DD_FLASH : FLASH_DFLT ->type(FLASH),mode(DEFAULT_MODE) ;
DD_FREE : FREE_DFLT ->type(FREE),mode(DEFAULT_MODE) ;
DD_FREEVOL : FREEVOL_DFLT ->type(FREEVOL),mode(DEFAULT_MODE) ;
DD_GDGORDER : GDGORDER_DFLT ->type(GDGORDER),mode(DEFAULT_MODE) ;
DD_HOLD : HOLD_DFLT ->type(HOLD),mode(DEFAULT_MODE) ;
DD_KEYLABL1 : KEYLABL1_DFLT ->type(KEYLABL1),mode(DEFAULT_MODE) ;
DD_KEYLABL2 : KEYLABL2_DFLT ->type(KEYLABL2),mode(DEFAULT_MODE) ;
DD_KEYENCD1 : KEYENCD1_DFLT ->type(KEYENCD1),mode(DEFAULT_MODE) ;
DD_KEYENCD2 : KEYENCD2_DFLT ->type(KEYENCD2),mode(DEFAULT_MODE) ;
DD_KEYLEN : KEYLEN_DFLT ->type(KEYLEN),mode(DEFAULT_MODE) ;
DD_KEYOFF : KEYOFF_DFLT ->type(KEYOFF),mode(DEFAULT_MODE) ;
DD_LABEL : LABEL_DFLT ->type(LABEL),mode(DEFAULT_MODE) ;
DD_LGSTREAM : LGSTREAM_DFLT ->type(LGSTREAM),mode(DEFAULT_MODE) ;
DD_LIKE : LIKE_DFLT ->type(LIKE),mode(DEFAULT_MODE) ;
DD_LRECL : LRECL_DFLT ->type(LRECL),mode(DEFAULT_MODE) ;
DD_MAXGENS : MAXGENS_DFLT ->type(MAXGENS),mode(DEFAULT_MODE) ;
DD_MGMTCLAS : MGMTCLAS_DFLT ->type(MGMTCLAS),mode(DEFAULT_MODE) ;
DD_MODIFY : MODIFY_DFLT ->type(MODIFY),mode(DEFAULT_MODE) ;
DD_OUTLIM : OUTLIM_DFLT ->type(OUTLIM),mode(DEFAULT_MODE) ;
DD_OUTPUT : OUTPUT_DFLT ->type(OUTPUT),mode(DEFAULT_MODE) ;
DD_PATH : PATH_DFLT ->type(PATH),mode(DEFAULT_MODE) ;
DD_PATHDISP : PATHDISP_DFLT ->type(PATHDISP),mode(DEFAULT_MODE) ;
DD_PATHMODE : PATHMODE_DFLT ->type(PATHMODE),mode(DEFAULT_MODE) ;
DD_PATHOPTS : PATHOPTS_DFLT ->type(PATHOPTS),mode(DEFAULT_MODE) ;
DD_PROTECT : PROTECT_DFLT ->type(PROTECT),mode(DEFAULT_MODE) ;
DD_RECFM : RECFM_DFLT ->type(RECFM),mode(DEFAULT_MODE) ;
DD_RECORG : RECORG_DFLT ->type(RECORG),mode(DEFAULT_MODE) ;
DD_REFDD : REFDD_DFLT ->type(REFDD),mode(DEFAULT_MODE) ;
DD_RETPD : RETPD_DFLT ->type(RETPD),mode(DEFAULT_MODE) ;
DD_RLS : RLS_DFLT ->type(RLS),mode(DEFAULT_MODE) ;
DD_ROACCESS : ROACCESS_DFLT ->type(ROACCESS),mode(DEFAULT_MODE) ;
DD_SECMODEL : SECMODEL_DFLT ->type(SECMODEL),mode(SECMODEL_MODE) ;
DD_SEGMENT : SEGMENT_DFLT ->type(SEGMENT),mode(DEFAULT_MODE) ;
DD_SPACE : SPACE_DFLT ->type(SPACE),mode(DEFAULT_MODE) ;
DD_SPIN : SPIN_DFLT ->type(SPIN),mode(DEFAULT_MODE) ;
DD_STORCLAS : STORCLAS_DFLT ->type(STORCLAS),mode(DEFAULT_MODE) ;
DD_SUBSYS : SUBSYS_DFLT ->type(SUBSYS),mode(DEFAULT_MODE) ;
DD_SYMBOLS : SYMBOLS_DFLT ->type(SYMBOLS),mode(DEFAULT_MODE) ;
DD_SYMLIST : SYMLIST_DFLT ->type(SYMLIST),mode(DEFAULT_MODE) ;
DD_SYSOUT : SYSOUT_DFLT ->type(SYSOUT),mode(DEFAULT_MODE) ;
DD_TERM : TERM_DFLT ->type(TERM),mode(DEFAULT_MODE) ;
DD_UCS : UCS_DFLT ->type(UCS),mode(DEFAULT_MODE) ;
DD_UNIT : UNIT_DFLT ->type(UNIT),mode(DEFAULT_MODE) ;
DD_VOLUME : VOLUME_DFLT ->type(VOLUME),mode(DEFAULT_MODE) ;

mode DATA_PARM_MODE ;

/*
This adds some flavour.  Note that once in this mode, the only way out
is to hit either a newline or some whitespace and proceed through the
DATA_MODE to get back to DEFAULT_MODE.
*/

NEWLINE_DATA_PARM_MODE : [\n\r] ->channel(HIDDEN),mode(DATA_MODE) ;
WS_DATA_PARM_MODE : [ ]+ ->channel(HIDDEN),mode(DATA_MODE) ;
DATA_PARM_COMMA : COMMA_DFLT ->type(COMMA) ;

DATA_PARM_MODE_BLKSIZE : BLKSIZE_DFLT ->type(BLKSIZE) ;
DATA_PARM_MODE_BUFNO : BUFNO_DFLT ->type(BUFNO) ;
DATA_PARM_MODE_DCB : DCB_DFLT ->type(DCB) ;
DATA_PARM_MODE_DIAGNS : DIAGNS_DFLT ->type(DIAGNS) ;
DATA_PARM_MODE_DLM : DLM_DFLT EQUAL_DFLT ->type(DLM),pushMode(DLM_MODE) ;
DATA_PARM_MODE_DSID : DSID_DFLT ->type(DSID) ;
DATA_PARM_MODE_LIKE : LIKE_DFLT ->type(LIKE) ;
DATA_PARM_MODE_LRECL : LRECL_DFLT ->type(LRECL) ;
DATA_PARM_MODE_REFDD : REFDD_DFLT ->type(REFDD) ;
DATA_PARM_MODE_MODE : MODE_DFLT ->type(MODE) ;
DATA_PARM_MODE_DSNAME : DSNAME_DFLT ->type(DSNAME) ;
DATA_PARM_MODE_VOLUME : VOLUME_DFLT ->type(VOLUME) ;
DATA_PARM_MODE_SER : SER_DFLT ->type(SER) ;
DATA_PARM_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DATA_PARM_MODE_SYMBOLS : SYMBOLS_DFLT ->type(SYMBOLS) ; 
DATA_PARM_MODE_CNVTSYS : CNVTSYS_DFLT ->type(CNVTSYS) ;
DATA_PARM_MODE_EXECSYS : EXECSYS_DFLT ->type(EXECSYS) ;
DATA_PARM_MODE_JCLONLY : JCLONLY_DFLT ->type(JCLONLY) ;
DATA_PARM_MODE_LOGGING_DDNAME : NAME -> type(LOGGING_DDNAME) ;
DATA_PARM_NUM_LIT : NUM_LIT_DFLT ->type(NUM_LIT) ;
DATA_PARM_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
DATA_PARM_RPAREN : RPAREN_DFLT ->type(RPAREN) ;
 
mode DLM_MODE ;

//DLM_EQUAL : EQUAL_DFLT ->type(EQUAL);
DLM_WS : [ ]+ ->channel(HIDDEN) ;
SQUOTE_DLM : '\'' ->channel(HIDDEN),mode(DLM_QS);
DLM_VAL : (SIMPLE_STRING | QUOTED_DLM_VAL) {dlmVals = new java.util.ArrayList(); dlmVals.add(getText());} ->popMode ;

mode DLM_QS ;

SQUOTE2_DLM_QS : SQUOTE SQUOTE ;
SQUOTE_DLM_QS : SQUOTE ->channel(HIDDEN),mode(DLM_MODE) ;
ANYCHAR_NOSQUOTE_DLM_QS : ~['\n\r] ;

QUOTED_DLM_VAL : (ANYCHAR_NOSQUOTE+ | SQUOTE2_DLM_QS+) ;

mode DATA_MODE ;

/*
Note that newlines and whitespace are not routed to channel(HIDDEN).  This is 
because the data may need to be parsed on its own, possibly with another ANTLR
grammar.
*/

DATA_MODE_TERMINATOR1 : SLASH SLASH ASTERISK {dlmVals.contains("//") && getCharPositionInLine() == 3}? ->type(COMMENT_FLAG),mode(CM);
DATA_MODE_TERMINATOR2 : SLASH SLASH {dlmVals.contains("//") && getCharPositionInLine() == 2}? ->type(SS),mode(NM) ;
DATA_MODE_TERMINATOR3 : SLASH ASTERISK {dlmVals.contains("/*") && getCharPositionInLine() == 2}? ->mode(DEFAULT_MODE) ;
DATA_MODE_TERMINATORX : ANYCHAR ANYCHAR {dlmVals.contains(getText())}? {dlmVals = new java.util.ArrayList(defaultDlmVals);} ->mode(DEFAULT_MODE) ;
DD_ASTERISK_DATA : ([ \n\r] | ANYCHAR)+? ;

mode CNTL_MODE ;

ASTERISK_CNTL : ASTERISK ;
NEWLINE_CNTL_MODE : [\n\r] ->channel(HIDDEN) ;
ENDCNTL_CNTL : E N D C N T L ->type(ENDCNTL) ;

CNTL_MODE_TERMINATORX : SLASH SLASH NAME? ENDCNTL_CNTL ->mode(POST_OP) ;
CNTL_DATA : (' ' | ANYCHAR)+? ;

WS_CNTL : [ ]+ ->channel(HIDDEN) ;

mode QS ;

SQUOTE2_QS : SQUOTE SQUOTE ;
SQUOTE_QS : SQUOTE ->channel(HIDDEN),popMode ;
ANYCHAR_NOSQUOTE : ~['\n\r] ;
NEWLINE_QS : [\n\r] ->channel(HIDDEN),pushMode(QS_SS) ;

QUOTED_STRING_FRAGMENT : (ANYCHAR_NOSQUOTE | SQUOTE2_QS)+ ;

mode QS_SS ;

SLASH_QS : '/' ;
SS_QS : SLASH_QS SLASH_QS {getCharPositionInLine() == 2}? ->channel(HIDDEN) ;
CONTINUATION_WS_QS_SS : ' '+ {getText().length() <= 13}? ->channel(HIDDEN),popMode ;

mode JOBRC_MODE ;

LASTRC : L A S T R C ->mode(DEFAULT_MODE) ;
MAXRC : M A X R C ->mode(DEFAULT_MODE) ;
JOBRC_STEP_LIT : S T E P ;
JOBRC_COMMA : COMMA_DFLT ->type(COMMA) ;
JOBRC_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
JOBRC_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
JOBRC_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(DEFAULT_MODE) ;
JOBRC_STEP_NAME : NAME (DOT NAME)? ;
JOBRC_WS : [ ]+ ->channel(HIDDEN),mode(CM) ;

mode GDGBIAS_MODE ;

GDGBIAS_JOB : J O B ->mode(DEFAULT_MODE) ;
GDGBIAS_STEP : S T E P ->mode(DEFAULT_MODE) ;
GDGBIAS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;

mode DSN_MODE ;

DSN_MODE_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
DSN_MODE_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(DEFAULT_MODE) ;
DSN_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;

DSN_MODE_DCB_BFALN : BFALN_DFLT ->type(BFALN),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BFTEK : BFTEK_DFLT ->type(BFTEK),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BLKSIZE : BLKSIZE_DFLT ->type(BLKSIZE),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BUFIN : BUFIN_DFLT ->type(BUFIN),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BUFL : BUFL_DFLT ->type(BUFL),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BUFMAX : BUFMAX_DFLT ->type(BUFL),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BUFNO : BUFNO_DFLT ->type(BUFNO),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BUFOFF : BUFOFF_DFLT ->type(BUFOFF),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BUFOUT : BUFOUT_DFLT ->type(BUFOUT),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_BUFSIZE : BUFSIZE_DFLT ->type(BUFSIZE),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_CPRI : CPRI_DFLT ->type(CPRI),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_CYLOFL : CYLOFL_DFLT ->type(CYLOFL),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_DEN : DEN_DFLT ->type(DEN),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_DIAGNS : DIAGNS_DFLT ->type(DIAGNS),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_DSORG : DSORG_DFLT ->type(DSORG),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_EROPT : EROPT_DFLT ->type(EROPT),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_FUNC : FUNC_DFLT ->type(FUNC),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_GNCP : GNCP_DFLT ->type(GNCP),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_INTVL : INTVL_DFLT ->type(INTVL),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_IPLTXID : IPLTXID_DFLT ->type(IPLTXID),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_KEYLEN : KEYLEN_DFLT ->type(KEYLEN),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_LIMCT : LIMCT_DFLT ->type(LIMCT),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_LRECL : LRECL_DFLT ->type(LRECL),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_MODE : MODE_DFLT ->type(MODE),mode(DEFAULT_MODE) ; 
DSN_MODE_DCB_NCP : NCP_DFLT ->type(NCP),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_NTM : NTM_DFLT ->type(NTM),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_OPTCD : OPTCD_DFLT ->type(OPTCD),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_PCI : PCI_DFLT ->type(PCI),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_PRTSP : PRTSP_DFLT ->type(PRTSP),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_RECFM : RECFM_DFLT ->type(RECFM),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_RESERVE : RESERVE_DFLT ->type(RESERVE),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_RKP : RKP_DFLT ->type(RKP),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_STACK : STACK_DFLT ->type(STACK),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_THRESH : THRESH_DFLT ->type(THRESH),mode(DEFAULT_MODE) ;
DSN_MODE_DCB_TRTCH : TRTCH_DFLT ->type(TRTCH),mode(DEFAULT_MODE) ;

/*
This pattern will not allow third-party parameter substitution such as
Control-M %% variables, but does allow symbolic parameters.
*/
DATASET_NAME : (
    NULLFILE |
    (AMPERSAND AMPERSAND NAME) | 
    (((AMPERSAND | NATL | ALPHA) (AMPERSAND | ALPHA | DOT | NATL | NUM)+) 
        (LPAREN_DFLT (
            (HYPHEN? NUM+) | 
            NAME | 
            SYMBOLIC
          ) 
        RPAREN_DFLT)?)
  )
  ->mode(DEFAULT_MODE) 
  ;

REFERBACK : ASTERISK DOT NAME (DOT NAME)? (DOT NAME)? ->mode(DEFAULT_MODE) ;

mode MEMBER_MODE ;

MEMBER_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
MEMBER_NAME : (AMPERSAND | ALPHA | DOT | NATL | NUM)+ ->mode(DEFAULT_MODE) ;

mode SECMODEL_MODE ;

SECMODEL_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DATASET_PROFILE : (NATL | ALPHA) (ALPHA | NATL | NUM | DOT | ASTERISK)+ ;


