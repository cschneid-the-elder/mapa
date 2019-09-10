/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
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
//ZEBRA EXEC PGM=J8765309 ,PARM='THIS IS A COMMENT STARTING AT THE COMMA'
//DD001 DD  DISP=SHR,DSN=SYS1.PARMLIB
//DD002 DD  DISP=(NEW,CATLG,DELETE),
//          DSN=THIS.IS.STILL.THE.DD002.STMT,
//          MGMTCLAS=STD, still the same statement
//          AVGREC=K, still the same statement
//          LRECL=80, still the same statement
//          SPACE=(80,(10,10),RLSE,CONTIG,ROUND) end of statement

Also, it is difficult to overstate the ugliness of the DLM parameter in
conjunction with DD * and DD DATA.  More modes, along with globals.

And don't get me started on job accounting information and how it's just
enough different from step accounting information to make for more modes.

Parm strings are no fun either.

Sometimes a parameter and an operation look identical, e.g. NOTIFY.

{System.out.println(getLine() + ":" + getCharPositionInLine() + " / " + getText() + "/");}
*/

lexer grammar JCLLexer;

@lexer::members {

    public java.util.ArrayList<String> dlmVals = new java.util.ArrayList();
    Boolean haveProgrammerName = false;
    int returnToMode = DEFAULT_MODE ;
}

tokens { COMMENT_FLAG , CNTL , COMMAND , DD , ELSE , ENDCNTL , ENDIF , EXEC , IF , INCLUDE , JCLLIB , JOB , NOTIFY , OUTPUT , PEND , PROC , SCHEDULE , SET , XMIT, EQUAL , ACCODE , AMP , ASTERISK , AVGREC , BLKSIZE ,  BLKSZLIM , BUFNO , BURST , CCSID , CHARS , CHKPT , COPIES , DATA , DATACLAS , DCB , DDNAME , DEST , DIAGNS , DISP , DLM , DSID , DSKEYLBL , DSN , DSNAME , DSNTYPE , DUMMY , DYNAM , EATTR , EXPDT , EXPORT , FCB , FILEDATA , FLASH , FREE , FREEVOL , GDGORDER , HOLD , KEYLABL1 , KEYLABL2 , KEYENCD1 , KEYENCD2 , KEYLEN , KEYOFF , LABEL , LGSTREAM , LIKE , LRECL , MAXGENS , MGMTCLAS , MODE, MODIFY , OUTLIM , OUTPUT , PATH , PATHDISP , PATHMODE , PATHOPTS , PROTECT , RECFM , RECORG , REFDD , RETPD , RLS , ROACCESS , SECMODEL , SEGMENT , SPACE , SPIN , STORCLAS , SUBSYS , SYMBOLS , SYMLIST , SYSOUT , TERM , UCS , UNIT , VOL , VOLUME , COMMA , ABEND , ABENDCC , NOT_SYMBOL , TRUE , FALSE , RC , RUN , CNVTSYS , EXECSYS , JCLONLY , LOGGING_DDNAME , NUM_LIT , LPAREN , RPAREN , BFALN , BFTEK , BUFIN , BUFL , BUFMAX , BUFOFF , BUFOUT , BUFSIZE , CPRI , CYLOFL , DEN , DSORG , EROPT , FUNC , GNCP , INTVL , IPLTXID , LIMCT , NCP , NTM , OPTCD , PCI , PRTSP , RESERVE , RKP , STACK , THRESH , TRTCH , ADDRSPC , BYTES , CARDS , CCSID , CLASS , COND , DSENQSHR , EMAIL , GDGBIAS , GROUP , JESLOG , JOBRC , LINES , MEMLIMIT , MSGCLASS , MSGLEVEL , NOTIFY , PAGES , PASSWORD , PERFORM , PRTY , RD , REGION , REGIONX , RESTART , SECLABEL , SYSAFF , SCHENV , SYSTEM , TIME , TYPRUN , UJOBCORR , USER , COMMENT_TEXT , DATASET_NAME , EXEC_PARM_STRING , DOT , CHARS_FONT , PCI_VALUE , REFERBACK , DEST_VALUE}

// lexer rules --------------------------------------------------------------------------------

SS : SLASH SLASH {/*System.out.println(getLine() + ":" + getCharPositionInLine() + " / " + getText());*/}{getCharPositionInLine() == 2}? ->mode(NM) ;
LINE_NB : ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR ANYCHAR {getCharPositionInLine() == 80}? -> skip;
COMMENT_FLAG_DFLT : SLASH SLASH ASTERISK {getCharPositionInLine() == 3}? ->type(COMMENT_FLAG),mode(CM);
COMMENT_FLAG_INLINE : COMMA_DFLT ' ' ->mode(CM) ;
//NAME_FIELD : NAME (DOT NAME)? {System.out.println("NAME_FIELD found " + getVocabulary().getSymbolicName(myTerminalNode.getSymbol().getType()));} ->mode(OP) ;
COND_OP : COND_EQ | COND_GE | COND_GT | COND_LE | COND_LT | COND_NE ;
OUTPUT_LIMIT_OPTION : CANCEL | DUMP | WARNING ;
MEM_UNIT : U | K | M | G | T | P ;
NUM_MEM_VAL : NUM_LIT_DFLT MEM_UNIT ;
SYMBOLIC : AMPERSAND [A-Z0-9@#$]+ {getText().length() <= 9}? ;

/*
TODO The only time we should match this is after matching a SYMBOLIC.

Maybe in KYWD mode?

SYMBOLIC_SUBSTRING : (
    LPAREN_DFLT
      (
        (NUM ':' NUM) |
        (NUM)
      )?  
    RPAREN_DFLT
  ) ;

*/

ABEND_DFLT : A B E N D ->type(ABEND) ;
ABENDCC_DFLT : A B E N D C C ->type(ABENDCC) ;
ABSTR : A B S T R ;
ACCODE_DFLT : A C C O D E ->type(ACCODE);
ACCBIAS : A C C B I A S ;
ACCT : A C C T ->mode(STEP_ACCT_MODE) ;
//ADDRESS : A D D R E S S ;
ADDRSPC_DFLT : A D D R S P C ->type(ADDRSPC) ;
//AFF : A F F ;
AFPPARMS : A F P P A R M S ;
AFPSTATS : A F P S T A T S ;
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
BFALN_DFLT : B F A L N ->type(BFALN);
BFALN_D : D ;
BFALN_F : F ;
BFTEK_DFLT : B F T E K ->type(BFTEK) ;
//BLKCHAR : B L K C H A R ;
//BLKPOS : B L K P O S ;
BLKSIZE_DFLT : B L K S I Z E ->type(BLKSIZE) ;
BLKSZLIM_DFLT : B L K S Z L I M ->type(BLKSZLIM) ;
//BLOCK : B L O C K ;
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
BYTES_DFLT : B Y T E S ->type(BYTES) ; 
CANCEL : C A N C E L ;
CARDS_DFLT : C A R D S ->type(CARDS) ;

CB : C B ;
CCSID_DFLT : C C S I D ->type(CCSID) ;
CHARS_DFLT : C H A R S ->type(CHARS) ;
CHKPT_DFLT : C H K P T ->type(CHKPT) ;
CKPTLINE : C K P T L I N E ;
CKPTPAGE : C K P T P A G E ;
CKPTSEC : C K P T S E C ;
CLASS_DFLT : C L A S S ->type(CLASS),mode(CL) ;
CLOSE : C L O S E ;
CM_UNIT : C M ;
CMNDONLY : C M N D O N L Y ;
CNTL_DFLT : C N T L ->mode(CNTL_MODE),type(CNTL) ;
//CNVTSYS_DFLT : C N V T S Y S ->type(CNVTSYS) ;
COLORMAP : C O L O R M A P ;
COMMA_DFLT : ',' ->type(COMMA) ;
COMMAND_DFLT : C O M M A N D ->mode(POST_OP),type(COMMAND) ;
COMMIT : C O M M I T ;
COMPACT : C O M P A C T ;
COMSETUP : C O M S E T U P ;
COND_DFLT : C O N D ->type(COND) ;
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
//CR : C R ;
//CRE : C R E ;
CROPS : C R O P S ;
CYL : C Y L ;
CYLOFL_DFLT : C Y L O F L ->type(CYLOFL) ;
DATA_DFLT : D A T A ->type(DATA) ;
DATACK : D A T A C K ;
DATACLAS_DFLT : D A T A C L A S ->type(DATACLAS) ;
DCB_DFLT : D C B ->type(DCB) ;
DD_DFLT : D D ->type(DD),mode(DD_OP) ;
DDNAME_DFLT : D D N A M E ->type(DDNAME) ;
DEFAULT : D E F A U L T ;
//DEFER : D E F E R ;

DEN_DFLT : D E N ->type(DEN) ;
DEPT : D E P T ;
DEST_DFLT : D E S T ->type(DEST) ;
DIAGNS_DFLT : D I A G N S ->type(DIAGNS) ;
DISALLOW : D I S A L L O W ;
DISP_DFLT : D I S P ->type(DISP) ;
DLM_DFLT : D L M ->type(DLM) ;
DO : D O ;
DOT_DFLT : '.' ->type(DOT) ;
//DOUBLE : D O U B L E ;
DPAGELBL : D P A G E L B L ;
DQUOTE : '"' ;
DSENQSHR_DFLT : D S E N Q S H R ->type(DSENQSHR) ;
DSID_DFLT : D S I D ->type(DSID) ;
DSKEYLBL_DFLT : D S K E Y L B L ->type(DSKEYLBL) ;
DSN_DFLT : D S N ->type(DSN) ;
DSNAME_DFLT : D S N A M E ->type(DSNAME) ;
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
ELSE_DFLT : E L S E ->mode(CM),type(ELSE) ;
EMAIL_DFLT : E M A I L ->type(EMAIL) ;
END : E N D ;
ENDCNTL_DFLT : E N D C N T L ->mode(POST_OP),type(ENDCNTL) ;
ENDIF_DFLT : E N D I F ->mode(CM),type(ENDIF) ;
EOV : E O V ;
EQUAL_DFLT : '=' ->type(EQUAL) ;
EROPT_DFLT : E R O P T ->type(EROPT) ;
EVEN : E V E N ;
EXEC_DFLT : E X E C ->mode(EX),type(EXEC) ;
//EXECSYS_DFLT : E X E C S Y S ->type(EXECSYS) ;
EXPDT_DFLT : E X P D T ->type(EXPDT) ;
EXTLOCK : E X T L O C K ;
EXPORT_DFLT : E X P O R T ->mode(EXPORT_STMT_MODE),type(EXPORT) ;
FALSE_DFLT : F A L S E ->type(FALSE) ;
FCB_DFLT : F C B ->type(FCB) ;
FIFO : F I F O ;
FILEDATA_DFLT : F I L E D A T A ->type(FILEDATA) ;
FLASH_DFLT : F L A S H ->type(FLASH) ;
//FOLD : F O L D ;
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
GDGBIAS_DFLT : G D G B I A S ->mode(GDGBIAS_MODE),type(GDGBIAS) ;
GDGORDER_DFLT : G D G O R D E R ->type(GDGORDER) ;
//GENERIC : G E N E R I C ;
GNCP_DFLT : G N C P ->type(GNCP) ;
GROUP_DFLT : G R O U P ->type(GROUP) ;
GROUPID : G R O U P I D ;
HOLD_DFLT : H O L D ->type(HOLD) ;
HOOK : H O O K ;
HYPHEN : '-' ;
IF_DFLT : I F ->mode(POST_IF),type(IF) ;
IN : I N ;
INCLUDE_DFLT : I N C L U D E ->mode(POST_OP),type(INCLUDE) ;
IND : I N D ;
INDEX : I N D E X ;
INTRAY : I N T R A Y ;
INTVL_DFLT : I N T V L ->type(INTVL) ;
IPLTXID_DFLT : I P L T X I D ->type(IPLTXID) ;
//JCL : J C L ;
JCLERR : J C L E R R ;
JCLHOLD : J C L H O L D ;
JCLLIB_DFLT : J C L L I B ->mode(POST_OP),type(JCLLIB) ;
//JCLONLY_DFLT : J C L O N L Y ->type(JCLONLY) ;
//JESDS : J E S D S ;
JESLOG_DFLT : J E S L O G ->type(JESLOG) ;
JGLOBAL : J G L O B A L ;
JLOCAL : J L O C A L ;
JOB_DFLT : J O B ->mode(POST_OP),type(JOB) ;
JOBRC_DFLT : J O B R C ->mode(JOBRC_MODE),type(JOBRC) ;

KEY : K E Y ;
KEYENCD1_DFLT : K E Y E N C D '1' ->type(KEYENCD1) ;
KEYENCD2_DFLT : K E Y E N C D '2' ->type(KEYENCD2) ;
KEYLABL1_DFLT : K E Y L A B L '1' ->type(KEYLABL1) ;
KEYLABL2_DFLT : K E Y L A B L '2' ->type(KEYLABL2) ;
KEYLEN_DFLT : K E Y L E N ->type(KEYLEN) ;
KEYOFF_DFLT : K E Y O F F ->type(KEYOFF) ;
LABEL_DFLT : L A B E L ->type(LABEL),mode(LABEL_MODE) ;
LARGE : L A R G E ;
//LASTRC : L A S T R C ;
LEAVE : L E A V E ;
LGSTREAM_DFLT : L G S T R E A M ->type(LGSTREAM),pushMode(DSN_MODE) ;
LIFO : L I F O ;
LIKE_DFLT : L I K E  ->type(LIKE) ;
LIMCT_DFLT : L I M C T ->type(LIMCT) ;
LINDEX : L I N D E X ;
LINECT : L I N E C T ;
LINES_DFLT : L I N E S ->type(LINES) ;
LOCAL : L O C A L ;
//LOG : L O G ;
LPAREN_DFLT : '(' ->type(LPAREN) ;
LRECL_DFLT : L R E C L  ->type(LRECL) ;
MAILBCC : M A I L B C C ;
MAILCC : M A I L C C ;
MAILFILE : M A I L F I L E ;
MAILFROM : M A I L F R O M ;
MAILTO : M A I L T O ;
MAXGENS_DFLT : M A X G E N S ->type(MAXGENS) ;
MAXIMUM : M A X I M U M ;
//MAXRC : M A X R C ;
MEMBER : M E M B E R ->mode(MEMBER_MODE) ;
MEMLIMIT_DFLT : M E M L I M I T ->type(MEMLIMIT) ;
MERGE : M E R G E ;
MGMTCLAS_DFLT : M G M T C L A S ->type(MGMTCLAS) ;
MM : M M ;

MODE_DFLT : M O D E  ->type(MODE) ;
MODIFY_DFLT : M O D I F Y ->type(MODIFY) ;
MSG : M S G ;
MSGCLASS_DFLT : M S G C L A S S ->type(MSGCLASS) ;
MSGLEVEL_DFLT : M S G L E V E L ->type(MSGLEVEL) ;
MXIG : M X I G ;
//NAME_OUTPUT : N A M E ;
fragment NATL : [@#$] ;
NC : N C ;
NCK : N C K ;
NCP_DFLT : N C P ->type(NCP) ;

NEWLINE : [\n\r] ->channel(HIDDEN) ;
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
//NRI : N R I ;
NTM_DFLT : N T M ->type(NTM) ;
NULLFILE : N U L L F I L E ;
fragment NUM : [0-9] ;
OFF : O F F ;
OFFSETXB : O F F S E T X B ;
OFFSETXF : O F F S E T X F ;
OFFSETYB : O F F S E T Y B ;
OFFSETYF : O F F S E T Y F ;

ON : O N ;
ONLY : O N L Y ;
OPTCD_DFLT : O P T C D ->type(OPTCD) ;
ORDER : O R D E R ->mode(ORDER_MODE) ;
OUTBIN : O U T B I N ;
OUTDISP : O U T D I S P ;
OUTLIM_DFLT : O U T L I M ->type(OUTLIM) ;
OUTPUT_DFLT : O U T P U T ->mode(POST_OP),type(OUTPUT) ;
OVERLAYB : O V E R L A Y B ;
OVERLAYF : O V E R L A Y F ;
OVFL : O V F L ;
PAGEDEF : P A G E D E F ;
PAGES_DFLT : P A G E S ->type(PAGES) ;
PARM : P A R M ->mode(EXEC_PARM_MODE) ;
PARMDD : P A R M D D ->mode(PARMDD_MODE) ;
PARM1 : P A R M '1' ;
PARM2 : P A R M '2' ;

PASSWORD_DFLT : P A S S W O R D ->type(PASSWORD) ;
PATH_DFLT : P A T H ->type(PATH) ;
PATHDISP_DFLT : P A T H D I S P ->type(PATHDISP) ;
PATHMODE_DFLT : P A T H M O D E ->type(PATHMODE) ;
PATHOPTS_DFLT : P A T H O P T S ->type(PATHOPTS) ;
PCI_DFLT : P C I ->type(PCI),mode(KYWD_VAL_MODE) ;
PELS : P E L S ;
PEND_DFLT : P E N D ->mode(POST_OP),type(PEND) ;
PERFORM_DFLT : P E R F O R M ->type(PERFORM) ;
PIMSG : P I M S G ;
POINTS : P O I N T S ;
PORTNO : P O R T N O ;
PRMODE : P R M O D E ;
PROC_DFLT : P R O C ->mode(POST_OP),type(PROC) ;
//PROGRAM : P R O G R A M ;
PROTECT_DFLT : P R O T E C T ->type(PROTECT),mode(PROTECT_MODE) ;
PRTATTRS : P R T A T T R S ;
PRTERROR : P R T E R R O R ;
PRTOPTNS : P R T O P T N S ;
PRTQUEUE : P R T Q U E U E ;
PRTSP_DFLT : P R T S P ->type(PRTSP) ;
PRTY_DFLT : P R T Y ->type(PRTY) ;
PURGE : P U R G E ;
QUIT : Q U I T ;
RC_DFLT : R C ->type(RC) ;
RCK : R C K ;
RD_DFLT : R D ->mode(RD_MODE),type(RD) ;
REAL : R E A L ;
RECFM_DFLT : R E C F M ->type(RECFM) ;
RECORG_DFLT : R E C O R G ->type(RECORG) ;
REDO : R E D O ;
REFDD_DFLT : R E F D D ->type(REFDD) ;
REGION_DFLT : R E G I O N ->type(REGION) ;
REGIONX_DFLT : R E G I O N X ->type(REGIONX) ;
RESERVE_DFLT : R E S E R V E ->type(RESERVE) ;
RESTART_DFLT : R E S T A R T ->type(RESTART) ;
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
SCHEDULE_DFLT : S C H E D U L E ->mode(SCHEDULE_MODE),type(SCHEDULE) ;
SCHENV_DFLT : S C H E N V ->type(SCHENV) ;
SECERR : S E C E R R ;
SECLABEL_DFLT : S E C L A B E L ->type(SECLABEL) ;
SECMODEL_DFLT : S E C M O D E L ->type(SECMODEL) ;
SEGMENT_DFLT : S E G M E N T ->type(SEGMENT) ;
SET_DFLT : S E T ->mode(SET_MODE),type(SET) ;

//SINGLE : S I N G L E ;
SLASH : '/' ;
SMBBIAS : S M B B I A S ;
SMBDFR : S M B D F R ;
//SMSHONOR : S M S H O N O R ;
NO : N O ;
YES : Y E S ;
SMBHWT : S M B H W T ;
SMBVSP : S M B V S P ;
SMBVSPI : S M B V S P I ;
SO : S O ;
SPACE_DFLT : S P A C E ->type(SPACE) ;
SPIN_DFLT : S P I N ->type(SPIN) ;
SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
fragment SQUOTE2 : SQUOTE SQUOTE ;
STACK_DFLT : S T A C K ->type(STACK) ;
STD : S T D ;
//STEP : S T E P ;
STORCLAS_DFLT : S T O R C L A S ->type(STORCLAS) ;
STRNO : S T R N O ;
SUBSYS_DFLT : S U B S Y S ->type(SUBSYS) ;
SUPPRESS : S U P P R E S S ;
SW : S W ;
SYMBOLS_DFLT : S Y M B O L S  ->type(SYMBOLS) ;
SYMLIST_DFLT : S Y M L I S T  ->type(SYMLIST) ;
SYNAD : S Y N A D ;
SYSAFF_DFLT : S Y S A F F ->type(SYSAFF) ;
SYSAREA : S Y S A R E A ;
SYSOUT_DFLT : S Y S O U T ->type(SYSOUT) ;
SYSTEM_DFLT : S Y S T E M ->type(SYSTEM) ;
TERM_DFLT : T E R M ->type(TERM) ;
THRESH_DFLT : T H R E S H ->type(THRESH) ;
THRESHLD : T H R E S H L D ;
TIME_DFLT : T I M E ->type(TIME) ;
TITLE : T I T L E ;
TRACE : T R A C E ;
TRC : T R C ;
//TRIPLE : T R I P L E ;
TRK : T R K ;
TRKLOCK : T R K L O C K ;
TRTCH_DFLT : T R T C H ->type(TRTCH) ;
TRUE_DFLT : T R U E ->type(TRUE) ;
TUMBLE : T U M B L E ;
TVSMSG : T V S M S G ;
TVSAMCOM : T V S A M C O M ;
TYPE : T Y P E ;
TYPRUN_DFLT : T Y P R U N ->type(TYPRUN) ;
UCS_DFLT : U C S ->type(UCS) ;
UJOBCORR_DFLT : U J O B C O R R ->type(UJOBCORR) ;
UNALLOC : U N A L L O C ;
//UNBLOCK : U N B L O C K ;

UNIT_DFLT : U N I T ->type(UNIT) ;
USCORE : '_' ;
USECATLG : U S E C A T L G ;
USEJC : U S E J C ;
USER_DFLT : U S E R ->type(USER) ;
USERDATA : U S E R D A T A ;
USERLIB : U S E R L I B ;
USERPATH : U S E R P A T H ;
//VERIFY : V E R I F Y ;
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
//WHEN_REL_EXP_KEYWORD : ABEND_DFLT | ABENDCC_DFLT | RC_DFLT | RUN_DFLT | SECERR | JCLERR ;
WHEN_REL_OP : COND_OP | EQUAL_DFLT | WHEN_GE | WHEN_LE | WHEN_NE | WHEN_NG | WHEN_NL | WHEN_GT | WHEN_LT;
//WHEN_CHECK : NOT_SYMBOL_DFLT? WHEN_REL_EXP_KEYWORD (WHEN_REL_OP (FALSE_DFLT | TRUE_DFLT | NUM_LIT_DFLT | ALNUMNAT))? ;
WRITE : W R I T E ;
WRITER : W R I T E R ;
WS : [ ]+ ->channel(HIDDEN),mode(CM) ;
XMIT_DFLT : X M I T ->mode(POST_OP),type(XMIT) ;

fragment ANYCHAR : ~[\n\r] ;
NAME : (NATL | ALPHA) (ALPHA | NATL | NUM)* {getText().length() < 9}? ;
NUM_LIT_DFLT : NUM+ ->type(NUM_LIT) ;
ALNUMNAT : (ALPHA | NATL | NUM)+ ;
SIMPLE_STRING : (ALPHA | NATL | NUM | HYPHEN | USCORE)+ ;
UNQUOTED_STRING : (~['\n\r] | SQUOTE2)+? ;


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
COMMENT_TEXT_CM : (' ' | ANYCHAR)+ ->type(COMMENT_TEXT) ;

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
mode COMMA_WS_MODE ;

COMMA_WS_COMMENT_TEXT : (' ' | ANYCHAR)+ ->type(COMMENT_TEXT) ;
COMMA_WS_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_WS_NEWLINE_MODE) ;

mode COMMA_WS_NEWLINE_MODE ;

COMMA_WS_NEWLINE_COMMENT_FLAG : COMMENT_FLAG_DFLT ->type(COMMENT_FLAG),popMode ;
COMMA_WS_NEWLINE_SS_WS : SS ' '+ {getText().length() <= 15}? ->channel(HIDDEN),popMode,popMode ;

mode COMMA_NEWLINE_MODE ;

COMMA_NEWLINE_COMMENT_FLAG : COMMENT_FLAG_DFLT ->type(COMMENT_FLAG),pushMode(COMMA_NEWLINE_CM_MODE) ;
COMMA_NEWLINE_SS_WS : SS ' '+ {getText().length() <= 15}? ->channel(HIDDEN),popMode ;

mode COMMA_NEWLINE_CM_MODE ;

COMMA_NEWLINE_CM_COMMENT_TEXT : (' ' | ANYCHAR)+ ->type(COMMENT_TEXT) ;
COMMA_NEWLINE_CM_NEWLINE : NEWLINE ->channel(HIDDEN),popMode ;



mode NM ;

JOBLIB : J O B L I B ->mode(OP) ;
SYSCHK : S Y S C H K ->mode(OP) ;
//NAME_FIELD : NAME (DOT_DFLT NAME)? ->mode(OP) ;
fragment NM_PART : [A-Z@#$] [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? [A-Z0-9@#$]? ;
NAME_FIELD : NM_PART (DOT_DFLT NM_PART)? {_modeStack.clear();} ->mode(OP) ;
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

CNTL_OP : C N T L ->mode(CNTL_MODE),type(CNTL) ;
COMMAND_OP : C O M M A N D ->mode(POST_OP),type(COMMAND) ;
DD_OP : D D->mode(DD_OP),type(DD) ;
ELSE_OP : E L S E ->mode(CM),type(ELSE) ;
ENDCNTL_OP : E N D C N T L ->mode(POST_OP),type(ENDCNTL) ;
ENDIF_OP : E N D I F ->mode(CM),type(ENDIF) ;
EXEC_OP : E X E C ->mode(EX),type(EXEC) ;
EXPORT_OP : E X P O R T ->mode(EXPORT_STMT_MODE),type(EXPORT) ;
IF_OP : I F ->mode(POST_IF),type(IF) ;
INCLUDE_OP : I N C L U D E ->mode(POST_OP),type(INCLUDE) ;
JCLLIB_OP : J C L L I B ->mode(POST_OP),type(JCLLIB) ;
JOB_OP : J O B ->mode(JOB_MODE),type(JOB) ;
NOTIFY_OP : N O T I F Y ->mode(POST_OP) ;
OUTPUT_OP : O U T P U T ->mode(OUTPUT_STMT_MODE),type(OUTPUT) ;
PEND_OP : P E N D ->mode(POST_OP),type(PEND) ;
PROC_OP : P R O C ->mode(PROC_MODE),type(PROC) ;
SCHEDULE_OP : S C H E D U L E ->mode(SCHEDULE_MODE),type(SCHEDULE) ;
SET_OP : S E T ->mode(SET_MODE),type(SET) ;
XMIT_OP : X M I T ->mode(POST_OP),type(XMIT) ;

WS_OP : [ ]+ ->channel(HIDDEN) ;

mode POST_OP ;

WS_POST_OP : [ ]+ ->channel(HIDDEN),mode(DEFAULT_MODE) ;
NEWLINE_POST_OP : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode RD_MODE ;

RD_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
RD_VALUE : (R | RNC | NR | NC) ->mode(DEFAULT_MODE);
RD_SYMBOLIC : SYMBOLIC ;
RD_DOT : DOT_DFLT ->type(DOT) ;
RD_NAME : NAME ->type(NAME) ;
RD_COMMENT_FLAG_INLINE : COMMENT_FLAG_INLINE ->type(COMMENT_FLAG_INLINE),mode(CM) ;
RD_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;

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

/*

This deserves some explanation.  Consider...

//STEP002U EXEC PGM=IEFBR14,PARM=XX11@@
//STEP002V EXEC PGM=IEFBR14,PARM=1X@
//STEP003  EXEC PGM=IEFBR14,PARM='X'
//STEP004  EXEC PGM=IEFBR14,PARM='A1@/STGRPT(ON)'
//STEP005  EXEC PGM=IEFBR14,PARM=&A
//STEP006  EXEC PGM=IEFBR14,PARM=&AB
//STEP007  EXEC PGM=IEFBR14,PARM=&A.1
//STEP008  EXEC PGM=IEFBR14,PARM=ZZ&A
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR'
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G)
//STEP012  EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G)                                      PARM 7
//STEP013  EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G)
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH')

...all of which are valid PARM parameters on an EXEC statement.

In DEFAULT_MODE, PARM is used to get us into EXEC_PARM_MODE.  From
there, if we encounter a left paren then we must parse allow for a
comma-separated list which may span physical lines, each of which
may have a comment delimited by whitespace and must begin with '//'
followed by at least one space before the list continues.

If we don't encounter a left paren, then we have the "simple" case of
a PARM comprised of either a contiguous series of bytes or a quoted
string.  A quoted string may span physical lines, each of which must
begin with '//' followed by at least one space.

In the "simple" case the PARM may be followed by a comment delimited
by whitespace.

*/

mode EXEC_PARM_MODE ;

DOT_EXEC_PARM : DOT_DFLT ->type(DOT) ;
NAME_EXEC_PARM : NAME ->type(NAME) ;
EQUAL_EXEC_PARM : EQUAL_DFLT ->type(EQUAL),mode(EXEC_PARM_MODE2) ;

mode EXEC_PARM_MODE2 ;

NEWLINE_EXEC_PARM : NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;
COMMENT_FLAG_INLINE_EXEC_PARM : COMMENT_FLAG_INLINE ->type(COMMENT_FLAG_INLINE),mode(CM) ;
COMMA_EXEC_PARM : COMMA_DFLT ->type(COMMA),mode(DEFAULT_MODE) ;
WS_EXEC_PARM : [ ]+ ->channel(HIDDEN),mode(CM) ;
LPAREN_EXEC_PARM : LPAREN_DFLT ->type(LPAREN),mode(EXEC_PARM_PAREN_MODE) ;
SQUOTE_EXEC_PARM : SQUOTE ->channel(HIDDEN),pushMode(QS) ;
EXEC_PARM_STRING_DFLT : (
    SIMPLE_STRING | 
    SYMBOLIC | 
    ALPHA | 
    ALNUMNAT | 
    NUM_LIT_DFLT | 
    DOT_DFLT | 
    NAME
  )+ ->type(EXEC_PARM_STRING) ;

mode EXEC_PARM_PAREN_MODE ;

NEWLINE_EXEC_PARM_PAREN : NEWLINE ->channel(HIDDEN),pushMode(EXEC_PARM_PAREN_SS) ;
WS_EXEC_PARM_PAREN : [ ]+ ->channel(HIDDEN),pushMode(EXEC_PARM_CM) ;
COMMA_EXEC_PARM_PAREN : COMMA_DFLT ->type(COMMA) ;
RPAREN_EXEC_PARM_PAREN : RPAREN_DFLT ->type(RPAREN),mode(DEFAULT_MODE) ;
SQUOTE_EXEC_PARM_PAREN : SQUOTE ->channel(HIDDEN),pushMode(QS) ;
EXEC_PARM_STRING_PAREN : (
    SIMPLE_STRING | 
    SYMBOLIC | 
    ALPHA | 
    ALNUMNAT | 
    NUM_LIT_DFLT | 
    DOT_DFLT | 
    NAME 
  )+ ->type(EXEC_PARM_STRING) ;

mode EXEC_PARM_CM ;

NEWLINE_EXEC_PARM_CM : NEWLINE ->channel(HIDDEN),popMode ;
COMMENT_TEXT_EXEC_PARM_CM : (' ' | ANYCHAR)+ ->type(COMMENT_TEXT) ;
NEWLINE_SS_WS_EXEC_PARM_CM : NEWLINE SLASH SLASH ' '+ ->channel(HIDDEN),popMode ;

mode EXEC_PARM_PAREN_SS ;

COMMENT_FLAG_EXEC_PARM_PAREN_SS : SLASH SLASH ASTERISK {getCharPositionInLine() == 3}? ->type(COMMENT_FLAG),pushMode(EXEC_PARM_CM);
SS_EXEC_PARM_PAREN_SS : SLASH SLASH {getCharPositionInLine() == 2}? ->channel(HIDDEN) ;
CONTINUATION_WS_EXEC_PARM_PAREN_SS : ' '+ {getText().length() <= 13}? ->channel(HIDDEN),popMode ;

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
IF_SS : SS ->type(SS) ;
IF_REL_OP : WHEN_REL_OP ;
IF_LOGICAL : AMPERSAND | '|' ;
LPAREN_IF : LPAREN_DFLT ->type(LPAREN) ;
RPAREN_IF : RPAREN_DFLT ->type(RPAREN) ;
IF_REL_EXP_KEYWORD : ABEND_IF | ABENDCC_IF | RC_IF | RUN_IF ;
IF_STEP : NM_PART DOT_DFLT (NM_PART DOT_DFLT)? ;
//IF_CHECK : NOT_SYMBOL_IF? (IF_STEP DOT_DFLT)? IF_REL_EXP_KEYWORD (IF_REL_OP (FALSE_IF | TRUE_IF | IF_NUM_LIT | ALNUMNAT))? ;
IF_NUM_LIT : NUM_LIT_DFLT ->type(NUM_LIT) ;
IF_ALNUMNAT : ALNUMNAT ->type(ALNUMNAT) ;

mode CL ;

EQUAL_CL : EQUAL_DFLT ->type(EQUAL) ;
CLASS_VAL : (
    (ASTERISK | SYMBOLIC) | 
    ((NUM | ALPHA) (ALPHA | NATL | NUM)*)
  ) {getText().length() < 9}? ->mode(DEFAULT_MODE) ;


mode DD_OP ;
//TODO make DD_OP work like OUTPUT_STMT
WS_DD_OP : [ ]+ ->channel(HIDDEN),mode(DD_PARM_MODE) ;
DD_NEWLINE1 : NEWLINE {_modeStack.clear();} ->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE) ;

mode DD_PARM_MODE ;

DD_CONTINUED : COMMA_DFLT NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
DD_COMMENT_FLAG_INLINE : COMMENT_FLAG_INLINE ->type(COMMENT_FLAG_INLINE),pushMode(COMMA_WS_MODE) ;
DD_PARM_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
DD_NEWLINE : NEWLINE {_modeStack.clear();} ->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE) ;
DD_COMMA : COMMA_DFLT ->type(COMMA) ;
DD_COMMENT_FLAG : COMMENT_FLAG_DFLT ->type(COMMENT_FLAG),pushMode(COMMA_NEWLINE_CM_MODE) ;
DD_SS_WS : SS ' '+ {getText().length() <= 15}? ->channel(HIDDEN) ;

DD_ACCODE : ACCODE_DFLT ->type(ACCODE),pushMode(KYWD_VAL_MODE) ;
DD_AMP : AMP_DFLT ->type(AMP),pushMode(AMP_MODE) ;
DD_AVGREC : AVGREC_DFLT ->type(AVGREC),pushMode(KYWD_VAL_MODE) ;
DD_ASTERISK : '*' {dlmVals.add("/*"); dlmVals.add("//");} ->type(ASTERISK),pushMode(DATA_PARM_MODE) ;
DD_BLKSIZE : BLKSIZE_DFLT ->type(BLKSIZE),pushMode(KYWD_VAL_MODE) ;
DD_BLKSZLIM : BLKSZLIM_DFLT ->type(BLKSZLIM),pushMode(KYWD_VAL_MODE) ;
DD_BURST : BURST_DFLT ->type(BURST),pushMode(KYWD_VAL_MODE) ;
DD_CCSID : CCSID_DFLT ->type(CCSID),pushMode(KYWD_VAL_MODE) ;
DD_CHARS : CHARS_DFLT ->type(CHARS),pushMode(KYWD_VAL_MODE) ;
DD_CHKPT : CHKPT_DFLT ->type(CHKPT),pushMode(KYWD_VAL_MODE) ;
DD_CNTL : CNTL_DFLT ->type(CNTL),pushMode(DSN_MODE) ;
DD_COPIES : COPIES_DFLT ->type(COPIES),pushMode(COPIES_MODE) ;
DD_DATA : DATA_DFLT {dlmVals.add("/*");} ->type(DATA),pushMode(DATA_PARM_MODE) ;
DD_DATACLAS : DATACLAS_DFLT ->type(DATACLAS),pushMode(KYWD_VAL_MODE) ;
DD_DCB : DCB_DFLT ->type(DCB),pushMode(DCB_MODE) ;
DD_DDNAME : DDNAME_DFLT ->type(DDNAME),pushMode(KYWD_VAL_MODE) ;
DD_DEST : DEST_DFLT ->type(DEST),pushMode(KYWD_VAL_MODE) ;
DD_DISP : DISP_DFLT ->type(DISP),pushMode(DISP_MODE) ;
DD_DLM : DLM_DFLT ->type(DLM),pushMode(DLM_MODE) ;
DD_DSID : DSID_DFLT ->type(DSID),pushMode(DSID_MODE) ;
DD_DSKEYLBL : DSKEYLBL_DFLT ->type(DSKEYLBL),pushMode(KYWD_VAL_MODE) ;
DD_DSN : DSN_DFLT  ->type(DSN),pushMode(DSN_MODE) ;
DD_DSNAME : DSNAME_DFLT  ->type(DSNAME),pushMode(DSN_MODE) ;
DD_DSNTYPE : DSNTYPE_DFLT ->type(DSNTYPE),pushMode(KYWD_VAL_MODE) ;
DD_DUMMY : DUMMY_DFLT ->type(DUMMY) ;
DD_DYNAM : DYNAM_DFLT ->type(DYNAM) ;
DD_EATTR : EATTR_DFLT ->type(EATTR),pushMode(KYWD_VAL_MODE) ;
DD_EXPDT : EXPDT_DFLT ->type(EXPDT),pushMode(KYWD_VAL_MODE) ;
DD_FCB : FCB_DFLT ->type(FCB),pushMode(KYWD_VAL_MODE) ;
DD_FILEDATA : FILEDATA_DFLT ->type(FILEDATA),pushMode(KYWD_VAL_MODE) ;
DD_FLASH : FLASH_DFLT ->type(FLASH),pushMode(KYWD_VAL_MODE) ;
DD_FREE : FREE_DFLT ->type(FREE),pushMode(KYWD_VAL_MODE) ;
DD_FREEVOL : FREEVOL_DFLT ->type(FREEVOL),pushMode(KYWD_VAL_MODE) ;
DD_GDGORDER : GDGORDER_DFLT ->type(GDGORDER),pushMode(KYWD_VAL_MODE) ;
DD_HOLD : HOLD_DFLT ->type(HOLD),pushMode(KYWD_VAL_MODE) ;
DD_KEYLABL1 : KEYLABL1_DFLT ->type(KEYLABL1),pushMode(KYWD_VAL_MODE) ;
DD_KEYLABL2 : KEYLABL2_DFLT ->type(KEYLABL2),pushMode(KYWD_VAL_MODE) ;
DD_KEYENCD1 : KEYENCD1_DFLT ->type(KEYENCD1),pushMode(KYWD_VAL_MODE) ;
DD_KEYENCD2 : KEYENCD2_DFLT ->type(KEYENCD2),pushMode(KYWD_VAL_MODE) ;
DD_KEYLEN : KEYLEN_DFLT ->type(KEYLEN),pushMode(KYWD_VAL_MODE) ;
DD_KEYOFF : KEYOFF_DFLT ->type(KEYOFF),pushMode(KYWD_VAL_MODE) ;
DD_LABEL : LABEL_DFLT ->type(LABEL),pushMode(LABEL_MODE) ;
DD_LGSTREAM : LGSTREAM_DFLT  ->type(LGSTREAM),pushMode(DSN_MODE) ;
DD_LIKE : LIKE_DFLT  ->type(LIKE),pushMode(DSN_MODE) ;
DD_LRECL : LRECL_DFLT  ->type(LRECL),pushMode(KYWD_VAL_MODE) ;
DD_MAXGENS : MAXGENS_DFLT ->type(MAXGENS),pushMode(KYWD_VAL_MODE) ;
DD_MGMTCLAS : MGMTCLAS_DFLT ->type(MGMTCLAS),pushMode(KYWD_VAL_MODE) ;
DD_MODIFY : MODIFY_DFLT ->type(MODIFY),pushMode(KYWD_VAL_MODE) ;
DD_OUTLIM : OUTLIM_DFLT ->type(OUTLIM),pushMode(KYWD_VAL_MODE) ;
DD_OUTPUT : OUTPUT_DFLT ->type(OUTPUT),pushMode(OUTPUT_PARM_MODE) ;
DD_PATH : PATH_DFLT ->type(PATH),pushMode(PATH_MODE) ;
DD_PATHDISP : PATHDISP_DFLT ->type(PATHDISP),pushMode(PATHDISP_MODE) ;
DD_PATHMODE : PATHMODE_DFLT ->type(PATHMODE),pushMode(PATHMODE_MODE) ;
DD_PATHOPTS : PATHOPTS_DFLT ->type(PATHOPTS),pushMode(PATHOPTS_MODE) ;
DD_PROTECT : PROTECT_DFLT ->type(PROTECT),pushMode(PROTECT_MODE) ;
DD_RECFM : RECFM_DFLT ->type(RECFM),pushMode(KYWD_VAL_MODE) ;
DD_RECORG : RECORG_DFLT ->type(RECORG),pushMode(KYWD_VAL_MODE) ;
DD_REFDD : REFDD_DFLT  ->type(REFDD),pushMode(DSN_MODE) ;
DD_RETPD : RETPD_DFLT ->type(RETPD),pushMode(KYWD_VAL_MODE) ;
DD_RLS : RLS_DFLT ->type(RLS),pushMode(RLS_MODE) ;
DD_ROACCESS : ROACCESS_DFLT ->type(ROACCESS),pushMode(ROACCESS_MODE) ;
DD_SECMODEL : SECMODEL_DFLT ->type(SECMODEL),pushMode(SECMODEL_MODE) ;
DD_SEGMENT : SEGMENT_DFLT ->type(SEGMENT),pushMode(KYWD_VAL_MODE) ;
DD_SPACE : SPACE_DFLT ->type(SPACE),pushMode(DEFAULT_MODE) ;
DD_SPIN : SPIN_DFLT ->type(SPIN),pushMode(KYWD_VAL_MODE) ;
DD_STORCLAS : STORCLAS_DFLT ->type(STORCLAS),pushMode(KYWD_VAL_MODE) ;
DD_SUBSYS : SUBSYS_DFLT ->type(SUBSYS),pushMode(SUBSYS_MODE) ;
DD_SYMBOLS : SYMBOLS_DFLT  ->type(SYMBOLS),pushMode(SYMBOLS_MODE) ;
DD_SYMLIST : SYMLIST_DFLT  ->type(SYMLIST),pushMode(KYWD_VAL_MODE) ;
DD_SYSOUT : SYSOUT_DFLT ->type(SYSOUT),pushMode(SYSOUT_MODE) ;
DD_TERM : TERM_DFLT ->type(TERM),pushMode(KYWD_VAL_MODE) ;
DD_UCS : UCS_DFLT ->type(UCS),pushMode(UCS_MODE) ;
DD_UNIT : UNIT_DFLT ->type(UNIT),pushMode(UNIT_MODE) ;
DD_VOL : VOL_DFLT ->type(VOL),pushMode(VOL_MODE) ;
DD_VOLUME : VOLUME_DFLT ->type(VOLUME),pushMode(VOL_MODE) ;

DD_BFALN : BFALN_DFLT ->type(BFALN),pushMode(KYWD_VAL_MODE) ;
DD_BFTEK : BFTEK_DFLT ->type(BFTEK),pushMode(KYWD_VAL_MODE) ;
DD_BUFIN : BUFIN_DFLT ->type(BUFIN),pushMode(KYWD_VAL_MODE) ;
DD_BUFL : BUFL_DFLT ->type(BUFL),pushMode(KYWD_VAL_MODE) ;
DD_BUFMAX : BUFMAX_DFLT ->type(BUFMAX),pushMode(KYWD_VAL_MODE) ;
DD_BUFNO : BUFNO_DFLT ->type(BUFNO),pushMode(KYWD_VAL_MODE) ;
DD_BUFOFF : BUFOFF_DFLT ->type(BUFOFF),pushMode(KYWD_VAL_MODE) ;
DD_BUFOUT : BUFOUT_DFLT ->type(BUFOUT),pushMode(KYWD_VAL_MODE) ;
DD_BUFSIZE : BUFSIZE_DFLT ->type(BUFSIZE),pushMode(KYWD_VAL_MODE) ;
DD_CPRI : CPRI_DFLT ->type(CPRI),pushMode(KYWD_VAL_MODE) ;
DD_CYLOFL : CYLOFL_DFLT ->type(CYLOFL),pushMode(KYWD_VAL_MODE) ;
DD_DEN : DEN_DFLT ->type(DEN),pushMode(KYWD_VAL_MODE) ;
DD_DIAGNS : DIAGNS_DFLT ->type(DIAGNS),pushMode(KYWD_VAL_MODE) ;
DD_DSORG : DSORG_DFLT ->type(DSORG),pushMode(KYWD_VAL_MODE) ;
DD_EROPT : EROPT_DFLT ->type(EROPT),pushMode(KYWD_VAL_MODE) ;
DD_FUNC : FUNC_DFLT ->type(FUNC),pushMode(KYWD_VAL_MODE) ;
DD_GNCP : GNCP_DFLT ->type(GNCP),pushMode(KYWD_VAL_MODE) ;
DD_INTVL : INTVL_DFLT ->type(INTVL),pushMode(KYWD_VAL_MODE) ;
DD_IPLTXID : IPLTXID_DFLT ->type(IPLTXID),pushMode(KYWD_VAL_MODE) ;
DD_LIMCT : LIMCT_DFLT ->type(LIMCT),pushMode(KYWD_VAL_MODE) ;
DD_MODE : MODE_DFLT ->type(MODE),pushMode(KYWD_VAL_MODE) ; 
DD_NCP : NCP_DFLT ->type(NCP),pushMode(KYWD_VAL_MODE) ;
DD_NTM : NTM_DFLT ->type(NTM),pushMode(KYWD_VAL_MODE) ;
DD_OPTCD : OPTCD_DFLT ->type(OPTCD),pushMode(KYWD_VAL_MODE) ;
DD_PCI : PCI_DFLT ->type(PCI),pushMode(KYWD_VAL_MODE) ;
DD_PRTSP : PRTSP_DFLT ->type(PRTSP),pushMode(KYWD_VAL_MODE) ;
DD_RESERVE : RESERVE_DFLT ->type(RESERVE),pushMode(KYWD_VAL_MODE) ;
DD_RKP : RKP_DFLT ->type(RKP),pushMode(KYWD_VAL_MODE) ;
DD_STACK : STACK_DFLT ->type(STACK),pushMode(KYWD_VAL_MODE) ;
DD_THRESH : THRESH_DFLT ->type(THRESH),pushMode(KYWD_VAL_MODE) ;
DD_TRTCH : TRTCH_DFLT ->type(TRTCH),pushMode(KYWD_VAL_MODE) ;

mode EXPORT_STMT_MODE ;

EXPORT_STMT_WS : [ ]+ ->channel(HIDDEN),mode(EXPORT_STMT_PARM_MODE) ;

mode EXPORT_STMT_PARM_MODE ;

EXPORT_STMT_PARM_SYMLIST : SYMLIST_DFLT ->type(SYMLIST),pushMode(KYWD_VAL_MODE) ;
EXPORT_STMT_PARM_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
EXPORT_STMT_NEWLINE : NEWLINE {_modeStack.clear();} ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode OUTPUT_STMT_MODE ;

OUTPUT_STMT_WS : [ ]+ ->channel(HIDDEN),mode(OUTPUT_STMT_PARM_MODE) ;

mode OUTPUT_STMT_PARM_MODE ;

OUTPUT_STMT_CONTINUED : COMMA_DFLT NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
OUTPUT_STMT_COMMENT_FLAG_INLINE : COMMENT_FLAG_INLINE ->type(COMMENT_FLAG_INLINE),pushMode(COMMA_WS_MODE) ;
OUTPUT_STMT_PARM_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
OUTPUT_STMT_NEWLINE : NEWLINE {_modeStack.clear();} ->channel(HIDDEN),mode(DEFAULT_MODE) ;
OUTPUT_STMT_COMMA : COMMA_DFLT ->type(COMMA) ;
OUTPUT_STMT_COMMENT_FLAG : COMMENT_FLAG_DFLT ->type(COMMENT_FLAG),pushMode(COMMA_NEWLINE_CM_MODE) ;
OUTPUT_STMT_SS_WS : SS ' '+ {getText().length() <= 15}? ->channel(HIDDEN) ;

OUTPUT_STMT_ADDRESS : A D D R E S S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_AFPPARMS : A F P P A R M S ->pushMode(DSN_MODE) ;
OUTPUT_STMT_AFPSTATS : A F P S T A T S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_BUILDING : B U I L D I N G ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_BURST : B U R S T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_CHARS : C H A R S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_CKPTLINE : C K P T L I N E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_CKPTPAGE : C K P T P A G E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_CKPTSEC : C K P T S E C ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_CLASS : C L A S S ->pushMode(OUTPUT_CLASS_MODE) ;
OUTPUT_STMT_COLORMAP : C O L O R M A P ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_COMPACT : C O M P A C T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_COMSETUP : C O M S E T U P ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_CONTROL : C O N T R O L ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_COPIES : C O P I E S ->pushMode(COPIES_MODE) ;
OUTPUT_STMT_COPYCNT : C O P Y C N T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_DATACK : D A T A C K ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_DDNAME : D D N A M E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_DEFAULT : D E F A U L T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_DEPT : D E P T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_DEST : D E S T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_DPAGELBL : D P A G E L B L ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_DUPLEX : D U P L E X ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_FCB : F C B ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_FLASH : F L A S H ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_FORMDEF : F O R M D E F ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_FORMLEN : F O R M L E N ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_FORMS : F O R M S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_FSSDATA : F S S D A T A ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_GROUPID : G R O U P I D ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_INDEX : I N D E X ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_INTRAY : I N T R A Y ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_JESDS : J E S D S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_LINDEX : L I N D E X ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_LINECT : L I N E C T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_MAILBCC : M A I L B C C ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_MAILCC : M A I L C C ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_MAILFILE : M A I L F I L E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_MAILFROM : M A I L F R O M ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_MAILTO : M A I L T O ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_MERGE : M E R G E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_MODIFY : M O D I F Y ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_NAME : N A M E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_NOTIFY : N O T I F Y ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OFFSETXB : O F F S E T X B ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OFFSETXF : O F F S E T X F ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OFFSETYB : O F F S E T Y B ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OFFSETYF : O F F S E T Y F ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OUTBIN : O U T B I N ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OUTDISP : O U T D I S P ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OVERLAYB : O V E R L A Y B ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OVERLAYF : O V E R L A Y F ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_OVFL : O V F L ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PAGEDEF : P A G E D E F ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PIMSG : P I M S G ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PORTNO : P O R T N O ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PRMODE : P R M O D E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PRTATTRS : P R T A T T R S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PRTERROR : P R T E R R O R ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PRTOPTNS : P R T O P T N S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PRTQUEUE : P R T Q U E U E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_PRTY : P R T Y ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_REPLYTO : R E P L Y T O ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_RESFMT : R E S F M T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_RETAINS : R E T A I N S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_RETAINF : R E T A I N F ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_RETRYL : R E T R Y L ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_RETRYT : R E T R Y T ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_ROOM : R O O M ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_SYSAREA : S Y S A R E A ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_THRESHLD : T H R E S H L D ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_TITLE : T I T L E ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_TRC : T R C ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_UCS : U C S ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_USERDATA : U S E R D A T A ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_USERLIB : U S E R L I B ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_USERPATH : U S E R P A T H ->pushMode(KYWD_VAL_MODE) ;
OUTPUT_STMT_WRITER : W R I T E R ->pushMode(KYWD_VAL_MODE) ;


mode OUTPUT_CLASS_MODE ;
//TODO CLASS= is syntactically valid
OUTPUT_CLASS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
OUTPUT_CLASS_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
OUTPUT_CLASS_VALUE : [A-Z0-9*] ->popMode ;
OUTPUT_CLASS_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
OUTPUT_CLASS_NEWLINE : NEWLINE {_modeStack.clear();} ->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE) ;
OUTPUT_CLASS_COMMA_NEWLINE : COMMA_DFLT NEWLINE ->channel(HIDDEN),mode(COMMA_NEWLINE_MODE) ;
OUTPUT_CLASS_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
OUTPUT_CLASS_COMMA_WS : COMMA_DFLT [ ]+ ->channel(HIDDEN),mode(COMMA_WS_MODE) ;

mode PROC_MODE ;

PROC_WS : [ ]+ ->channel(HIDDEN),mode(PROC_PARM_MODE) ;
PROC_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;
PROC_WS_NEWLINE : PROC_WS PROC_NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode PROC_PARM_MODE ;

PROC_PARM_EQUAL : EQUAL_DFLT ->type(EQUAL),pushMode(PROC_PARM_VALUE_MODE) ;
PROC_PARM_NAME : NM_PART ;

mode PROC_PARM_VALUE_MODE ;

PROC_PARM_VALUE_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
PROC_PARM_VALUE : [)(A-Z0-9@#$*\-+&./%[]+ ;
PROC_PARM_VALUE_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

PROC_PARM_VALUE_COMMA_NEWLINE : COMMA_DFLT NEWLINE ->channel(HIDDEN),mode(COMMA_NEWLINE_MODE) ;
PROC_PARM_VALUE_COMMA_WS : COMMA_DFLT [ ]+ ->channel(HIDDEN),mode(COMMA_WS_MODE) ;
PROC_PARM_VALUE_NEWLINE : NEWLINE {_modeStack.clear();} ->channel(HIDDEN),mode(DEFAULT_MODE) ;
PROC_PARM_VALUE_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
PROC_PARM_VALUE_COMMA : COMMA_DFLT ->channel(HIDDEN),popMode ;

mode SCHEDULE_MODE ;

SCHEDULE_WS : [ ]+ ->channel(HIDDEN),mode(SCHEDULE_PARM_MODE) ;
SCHEDULE_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;
SCHEDULE_WS_NEWLINE : PROC_WS PROC_NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode SCHEDULE_PARM_MODE ;

SCHEDULE_PARM_AFTER : A F T E R ->pushMode(KYWD_VAL_MODE) ;
SCHEDULE_PARM_BEFORE : B E F O R E ->pushMode(KYWD_VAL_MODE) ;
SCHEDULE_PARM_DELAY : D E L A Y ->pushMode(KYWD_VAL_MODE) ;
SCHEDULE_PARM_HOLDUNTIL : H O L D U N T I L ->pushMode(KYWD_VAL_MODE) ;
SCHEDULE_PARM_JOBGROUP : J O B G R O U P ->pushMode(KYWD_VAL_MODE) ;
SCHEDULE_PARM_STARTBY : S T A R T B Y ->pushMode(KYWD_VAL_MODE) ;
SCHEDULE_PARM_WITH : W I T H ->pushMode(KYWD_VAL_MODE) ;

SCHEDULE_PARM_COMMA_NEWLINE : COMMA_DFLT NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
SCHEDULE_PARM_COMMA_WS : COMMA_DFLT [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
SCHEDULE_PARM_NEWLINE : NEWLINE {_modeStack.clear();} ->channel(HIDDEN),mode(DEFAULT_MODE) ;
SCHEDULE_PARM_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
SCHEDULE_PARM_COMMA : COMMA_DFLT ->type(COMMA),channel(HIDDEN) ;

mode SET_MODE ;

SET_WS : [ ]+ ->channel(HIDDEN),mode(SET_PARM_MODE) ;
SET_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;
SET_WS_NEWLINE : SET_WS SET_NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode SET_PARM_MODE ;

SET_PARM_EQUAL : EQUAL_DFLT ->type(EQUAL),pushMode(SET_PARM_VALUE_MODE) ;
SET_PARM_NAME : NM_PART ;

mode SET_PARM_VALUE_MODE ;

SET_PARM_VALUE_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
SET_PARM_VALUE : [)(A-Z0-9@#$*\-+&./%[]+ ;
SET_PARM_VALUE_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

SET_PARM_VALUE_COMMA_NEWLINE : COMMA_DFLT NEWLINE ->channel(HIDDEN),mode(COMMA_NEWLINE_MODE) ;
SET_PARM_VALUE_COMMA_WS : COMMA_DFLT [ ]+ ->channel(HIDDEN),mode(COMMA_WS_MODE) ;
SET_PARM_VALUE_NEWLINE : NEWLINE {_modeStack.clear();} ->channel(HIDDEN),mode(DEFAULT_MODE) ;
SET_PARM_VALUE_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
SET_PARM_VALUE_COMMA : COMMA_DFLT ->channel(HIDDEN),popMode ;

mode DATA_PARM_MODE ;

/*
This adds some flavour.  Note that once in this mode, the only way out
is to hit either a newline or some whitespace and proceed through the
DATA_MODE to get back to DEFAULT_MODE.
*/

NEWLINE_DATA_PARM_MODE : [\n\r] ->channel(HIDDEN),mode(DATA_MODE) ;
WS_DATA_PARM_MODE : [ ]+ ->channel(HIDDEN),mode(DATA_PARM_CM_MODE) ;
DATA_PARM_COMMA : COMMA_DFLT ->type(COMMA) ;

DATA_PARM_MODE_BLKSIZE : BLKSIZE_DFLT ->type(BLKSIZE),mode(KYWD_VAL_MODE) ;
DATA_PARM_MODE_BUFNO : BUFNO_DFLT ->type(BUFNO),pushMode(KYWD_VAL_MODE) ;
DATA_PARM_MODE_DCB : DCB_DFLT ->type(DCB),pushMode(DCB_MODE) ;
DATA_PARM_MODE_DIAGNS : DIAGNS_DFLT ->type(DIAGNS),pushMode(KYWD_VAL_MODE) ;
DATA_PARM_MODE_DLM : DLM_DFLT ->type(DLM),pushMode(DLM_MODE) ;
DATA_PARM_MODE_DSID : DSID_DFLT ->type(DSID),pushMode(DSID_MODE) ;
DATA_PARM_MODE_DSN : DSN_DFLT  ->type(DSNAME),pushMode(DSN_MODE) ;
DATA_PARM_MODE_DSNAME : DSNAME_DFLT  ->type(DSNAME),pushMode(DSN_MODE) ;
DATA_PARM_MODE_LIKE : LIKE_DFLT  ->type(LIKE),pushMode(DSN_MODE) ;
DATA_PARM_MODE_LRECL : LRECL_DFLT  ->type(LRECL),pushMode(KYWD_VAL_MODE) ;
DATA_PARM_MODE_REFDD : REFDD_DFLT  ->type(REFDD),pushMode(DSN_MODE) ;
DATA_PARM_MODE_MODE : MODE_DFLT  ->type(MODE),pushMode(KYWD_VAL_MODE) ;
DATA_PARM_MODE_VOL : VOL_DFLT  ->type(VOL),pushMode(VOL_MODE) ;
DATA_PARM_MODE_VOLUME : VOLUME_DFLT  ->type(VOLUME),pushMode(VOL_MODE) ;
DATA_PARM_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DATA_PARM_MODE_SYMBOLS : SYMBOLS_DFLT  ->type(SYMBOLS),pushMode(SYMBOLS_MODE) ; 
//DATA_PARM_MODE_CNVTSYS : CNVTSYS_DFLT ->type(CNVTSYS) ;
//DATA_PARM_MODE_EXECSYS : EXECSYS_DFLT ->type(EXECSYS) ;
//DATA_PARM_MODE_JCLONLY : JCLONLY_DFLT ->type(JCLONLY) ;
//DATA_PARM_MODE_LOGGING_DDNAME : NAME -> type(LOGGING_DDNAME) ;
DATA_PARM_MODE_SYMLIST : SYMLIST_DFLT  ->type(SYMLIST),pushMode(KYWD_VAL_MODE) ; 
//DATA_PARM_NUM_LIT : NUM_LIT_DFLT ->type(NUM_LIT) ;
//DATA_PARM_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
//DATA_PARM_RPAREN : RPAREN_DFLT ->type(RPAREN) ;

/*
mode DATA_PARM_SYMBOLS_MODE ;

DATA_PARM_SYMBOLS_EQUAL : EQUAL_DFLT ->type(EQUAL),mode(SYMBOLS_MODE) ;
DATA_PARM_SYMBOLS_COMMA : COMMA_DFLT ->type(COMMA),mode(DATA_PARM_MODE) ;
DATA_PARM_SYMBOLS_WS : [ ]+ ->channel(HIDDEN),mode(DATA_PARM_CM_MODE) ;
DATA_PARM_SYMBOLS_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DATA_MODE) ;

mode DATA_PARM_LRECL_MODE ;

DATA_PARM_LRECL_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DATA_PARM_LRECL_COMMA : COMMA_DFLT ->type(COMMA),mode(DATA_PARM_MODE) ;
DATA_PARM_LRECL_WS : [ ]+ ->channel(HIDDEN),mode(DATA_PARM_CM_MODE) ;
DATA_PARM_LRECL_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DATA_MODE) ;
DATA_PARM_LRECL_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(DATA_PARM_MODE) ;
*/
 
mode DLM_MODE ;

DLM_EQUAL : EQUAL_DFLT ->type(EQUAL);
//DLM_WS : [ ]+ ->channel(HIDDEN) ;
SQUOTE_DLM : '\'' ->channel(HIDDEN),pushMode(DLM_QS);
DLM_VAL : SIMPLE_STRING 
    {
        dlmVals = new java.util.ArrayList();
        dlmVals.add(getText());
    } ->popMode ;

mode DLM_QS ;

SQUOTE2_DLM_QS : SQUOTE SQUOTE ;
SQUOTE_DLM_QS : SQUOTE ->channel(HIDDEN),popMode,popMode ;
fragment ANYCHAR_NOSQUOTE_DLM_QS : ~['\n\r] ;

QUOTED_DLM_VAL : (ANYCHAR_NOSQUOTE+ | SQUOTE2_DLM_QS+) 
    {
        dlmVals = new java.util.ArrayList();
        dlmVals.add(getText());
    } ;

mode DATA_PARM_CM_MODE ;

DATA_PARM_CM_MODE_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DATA_MODE) ;
DATA_PARM_CM_MODE_COMMENT_TEXT : (' ' | ANYCHAR)+ ->type(COMMENT_TEXT) ;
/*
mode DATA_PARM_REFDD_MODE ;

DATA_PARM_REFDD_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DATA_PARM_REFDD_ASTERISK : ASTERISK ->type(ASTERISK) ;
DATA_PARM_REFDD_NAME : NAME ->type(NAME) ;
DATA_PARM_REFDD_DOT : DOT_DFLT ->type(DOT) ;
DATA_PARM_REFDD_COMMA : COMMA_DFLT ->type(COMMA),mode(DATA_PARM_MODE) ;
DATA_PARM_REFDD_WS : [ ]+ ->channel(HIDDEN),mode(DATA_PARM_CM_MODE) ;
DATA_PARM_REFDD_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DATA_MODE) ;
*/

mode DATA_MODE ;

/*
Note that newlines and whitespace are not routed to channel(HIDDEN).  This is 
because the data may need to be parsed on its own, possibly with another ANTLR
grammar.
*/

DATA_MODE_TERMINATOR1 : SLASH SLASH ASTERISK {dlmVals.contains("//") && getCharPositionInLine() == 3}? ->type(COMMENT_FLAG),mode(CM);
DATA_MODE_TERMINATOR2 : SLASH SLASH {dlmVals.contains("//") && getCharPositionInLine() == 2}? ->type(SS),mode(NM) ;
DATA_MODE_TERMINATOR3 : SLASH ASTERISK {dlmVals.contains("/*") && getCharPositionInLine() == 2}? ->mode(DEFAULT_MODE) ;
DATA_MODE_TERMINATORX : ANYCHAR ANYCHAR {dlmVals.contains(getText())}? {dlmVals = new java.util.ArrayList();} ->mode(DEFAULT_MODE) ;
DD_ASTERISK_DATA : ([ \n\r] | ANYCHAR)+? ;

mode CNTL_MODE ;

ASTERISK_CNTL : ASTERISK {returnToMode = _mode;} ->type(ASTERISK),mode(CNTL_MODE_CM) ;
NEWLINE_CNTL_MODE : NEWLINE ->channel(HIDDEN),mode(CNTL_DATA_MODE) ;

WS_CNTL : [ ]+ ->channel(HIDDEN) ;

mode CNTL_MODE_CM ;

CNTL_CM_NEWLINE : NEWLINE ->channel(HIDDEN),mode(CNTL_DATA_MODE) ;
CNTL_CM_COMMENT_TEXT : COMMENT_TEXT_CM ->type(COMMENT_TEXT) ;

mode CNTL_DATA_MODE ;

//ENDCNTL_CNTL : E N D C N T L ->type(ENDCNTL) ;

/*
I don't like this, it really feels like a parser thing and not a lexer
thing, but the entire ENDCNTL statement functions as a terminator for
the CNTL_DATA capture.
*/
CNTL_MODE_TERMINATORX : SLASH SLASH ([A-Z0-9@#$]+)? [ ]+ (E N D C N T L) ->mode(CM) ;
CNTL_DATA : DD_ASTERISK_DATA+? ;


mode QS ;

fragment SQUOTE2_QS : SQUOTE SQUOTE ;
SQUOTE_QS : SQUOTE
    {
      switch(_modeStack.peek()) {
        case OUTPUT_CLASS_MODE :
        case AMP_MODE :
        case PATH_MODE :
        case SYSOUT_MODE :
        case KYWD_VAL_MODE :
        case SYMLIST_MODE :
        case DCB_MODE :
        case DSN_MODE :
            popMode();
            popMode();
            break;
        case VOL_SER1_MODE :
        case VOL_REF1_MODE :
            popMode();
            popMode();
            popMode();
            break;
        case VOL_REF2_MODE :
            popMode();
            popMode();
            popMode();
            popMode();
            popMode();
            popMode();
            break;
        default :
            popMode();
            break;
      }
    } ->channel(HIDDEN) ;
fragment ANYCHAR_NOSQUOTE : ~['\n\r] ;
NEWLINE_QS : [\n\r] ->channel(HIDDEN),pushMode(QS_SS) ;

QUOTED_STRING_FRAGMENT : (ANYCHAR_NOSQUOTE | SQUOTE2_QS)+ ;

mode QS_SS ;
//TODO handle //* comments here and in clones thereof
SLASH_QS : '/' ;
SS_QS : SLASH_QS SLASH_QS {getCharPositionInLine() == 2}? ->channel(HIDDEN) ;
CONTINUATION_WS_QS_SS : ' '+ {getText().length() <= 13}? ->channel(HIDDEN),popMode ;

mode QS_JOB_PROGRAMMER_NAME_MODE ;

SQUOTE2_QS_JOB_PROGRAMMER_NAME_MODE : SQUOTE SQUOTE ;
SQUOTE_QS_JOB_PROGRAMMER_NAME_MODE : SQUOTE {haveProgrammerName = true;} ->channel(HIDDEN),popMode ;
ANYCHAR_NOSQUOTE_JOB_PROGRAMMER_NAME_MODE : ~['\n\r] ;
NEWLINE_QS_JOB_PROGRAMMER_NAME_MODE : [\n\r] ->channel(HIDDEN),pushMode(QS_SS_JOB_PROGRAMMER_NAME_MODE) ;

QUOTED_STRING_PROGRAMMER_NAME : (ANYCHAR_NOSQUOTE_JOB_PROGRAMMER_NAME_MODE | SQUOTE2_QS_JOB_PROGRAMMER_NAME_MODE)+ ;

mode QS_SS_JOB_PROGRAMMER_NAME_MODE ;

SLASH_QS_JOB_PROGRAMMER_NAME_MODE : '/' ;
SS_QS_JOB_PROGRAMMER_NAME_MODE : SLASH_QS SLASH_QS {getCharPositionInLine() == 2}? ->channel(HIDDEN) ;
CONTINUATION_WS_QS_SS_JOB_PROGRAMMER_NAME_MODE : ' '+ {getText().length() <= 13}? ->channel(HIDDEN),popMode ;

mode JOBRC_MODE ;

LASTRC : L A S T R C ->mode(DEFAULT_MODE) ;
MAXRC : M A X R C ->mode(DEFAULT_MODE) ;
JOBRC_STEP_LIT : S T E P ;
JOBRC_COMMA : COMMA_DFLT ->type(COMMA) ;
JOBRC_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
JOBRC_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
JOBRC_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(DEFAULT_MODE) ;
JOBRC_STEP_NAME : NAME (DOT_DFLT NAME)? ;
JOBRC_WS : [ ]+ ->channel(HIDDEN),mode(CM) ;

mode GDGBIAS_MODE ;

GDGBIAS_JOB : J O B ->mode(DEFAULT_MODE) ;
GDGBIAS_STEP : S T E P ->mode(DEFAULT_MODE) ;
GDGBIAS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;

mode DSN_MODE ;

DSN_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DSN_MODE_SQUOTE : SQUOTE ->channel(HIDDEN),pushMode(QS) ;
/*
This pattern is _very_ inclusive.  Consider...

&SYSUID..JCL.CNTL
LIB.&SYSUID
&SYSUID.P.&LIB
&SYSUID.T(MEMBER)
&DSNQ1..&DSNQ2..&DSNQ3(#&MEMBER)
AEIOU(+1)
ABCDEF(-1)
XYZ(0)
LIB.PROD(&PGM.#)
MASTER.FILE.%%ODATE


*/
DSN_MODE_DATASET_NAME : (
    NULLFILE |
    (AMPERSAND AMPERSAND NAME) | 
    (
        (AMPERSAND | NATL | ALPHA) 
          (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM | HYPHEN | '+' | '%' | LPAREN_DFLT | RPAREN_DFLT)*
    )
  )
  ->type(DATASET_NAME),popMode 
  ; //removed mode(DEFAULT_MODE) under assumption NEWLINE and COMMA would prevail

//DSN_MODE_ASTERISK : ASTERISK ->type(ASTERISK),mode(DSN_ASTERISK_MODE) ;
DSN_MODE_REFERENCE : ASTERISK DOT_DFLT NM_PART (DOT_DFLT NM_PART)? (DOT_DFLT NM_PART)? ->popMode ;


mode DCB_MODE ;

//DCB_CONTINUED : COMMA_DFLT NEWLINE ->channel(HIDDEN) ;
//DCB_COMMENT_FLAG_INLINE : COMMENT_FLAG_INLINE ->type(COMMENT_FLAG_INLINE),pushMode(COMMA_WS_MODE) ;
//DD_PARM_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;
//DD_NEWLINE : NEWLINE {_modeStack.clear();} ->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE) ;

DCB_MODE_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(DCB_PAREN_MODE) ;
DCB_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DCB_MODE_SQUOTE : SQUOTE ->channel(HIDDEN),pushMode(QS) ;
//DCB_MODE_COMMA : COMMA_DFLT ->type(COMMA),popMode ;
//DCB_MODE_WS : [ ]+ ->channel(HIDDEN),mode(CM) ;
//DCB_MODE_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;

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

DCB_BFALN : BFALN_DFLT ->type(BFALN),mode(KYWD_VAL_MODE) ;
DCB_BFTEK : BFTEK_DFLT ->type(BFTEK),mode(KYWD_VAL_MODE) ;
DCB_BLKSIZE : BLKSIZE_DFLT ->type(BLKSIZE),mode(KYWD_VAL_MODE) ;
DCB_BUFIN : BUFIN_DFLT ->type(BUFIN),mode(KYWD_VAL_MODE) ;
DCB_BUFL : BUFL_DFLT ->type(BUFL),mode(KYWD_VAL_MODE) ;
DCB_BUFMAX : BUFMAX_DFLT ->type(BUFMAX),mode(KYWD_VAL_MODE) ;
DCB_BUFNO : BUFNO_DFLT ->type(BUFNO),mode(KYWD_VAL_MODE) ;
DCB_BUFOFF : BUFOFF_DFLT ->type(BUFOFF),mode(KYWD_VAL_MODE) ;
DCB_BUFOUT : BUFOUT_DFLT ->type(BUFOUT),mode(KYWD_VAL_MODE) ;
DCB_BUFSIZE : BUFSIZE_DFLT ->type(BUFSIZE),mode(KYWD_VAL_MODE) ;
DCB_CPRI : CPRI_DFLT ->type(CPRI),mode(KYWD_VAL_MODE) ;
DCB_CYLOFL : CYLOFL_DFLT ->type(CYLOFL),mode(KYWD_VAL_MODE) ;
DCB_DEN : DEN_DFLT ->type(DEN),mode(KYWD_VAL_MODE) ;
DCB_DIAGNS : DIAGNS_DFLT ->type(DIAGNS),mode(KYWD_VAL_MODE) ;
DCB_DSORG : DSORG_DFLT ->type(DSORG),mode(KYWD_VAL_MODE) ;
DCB_EROPT : EROPT_DFLT ->type(EROPT),mode(KYWD_VAL_MODE) ;
DCB_FUNC : FUNC_DFLT ->type(FUNC),mode(KYWD_VAL_MODE) ;
DCB_GNCP : GNCP_DFLT ->type(GNCP),mode(KYWD_VAL_MODE) ;
DCB_INTVL : INTVL_DFLT ->type(INTVL),mode(KYWD_VAL_MODE) ;
DCB_IPLTXID : IPLTXID_DFLT ->type(IPLTXID),mode(KYWD_VAL_MODE) ;
DCB_KEYLEN : KEYLEN_DFLT ->type(KEYLEN),mode(KYWD_VAL_MODE) ;
DCB_LIMCT : LIMCT_DFLT ->type(LIMCT),mode(KYWD_VAL_MODE) ;
DCB_LRECL : LRECL_DFLT ->type(LRECL),mode(KYWD_VAL_MODE) ;
DCB_MODE : MODE_DFLT ->type(MODE),mode(KYWD_VAL_MODE) ; 
DCB_NCP : NCP_DFLT ->type(NCP),mode(KYWD_VAL_MODE) ;
DCB_NTM : NTM_DFLT ->type(NTM),mode(KYWD_VAL_MODE) ;
DCB_OPTCD : OPTCD_DFLT ->type(OPTCD),mode(KYWD_VAL_MODE) ;
DCB_PCI : PCI_DFLT ->type(PCI),mode(KYWD_VAL_MODE) ;
DCB_PRTSP : PRTSP_DFLT ->type(PRTSP),mode(KYWD_VAL_MODE) ;
DCB_RECFM : RECFM_DFLT ->type(RECFM),mode(KYWD_VAL_MODE) ;
DCB_RESERVE : RESERVE_DFLT ->type(RESERVE),mode(KYWD_VAL_MODE) ;
DCB_RKP : RKP_DFLT ->type(RKP),mode(KYWD_VAL_MODE) ;
DCB_STACK : STACK_DFLT ->type(STACK),mode(KYWD_VAL_MODE) ;
DCB_THRESH : THRESH_DFLT ->type(THRESH),mode(KYWD_VAL_MODE) ;
DCB_TRTCH : TRTCH_DFLT ->type(TRTCH),mode(KYWD_VAL_MODE) ;

/*
This pattern is _very_ inclusive.  Consider...

&SYSUID..JCL.CNTL
LIB.&SYSUID
&SYSUID.P.&LIB
MASTER.FILE.%%ODATE

*/
DCB_DATASET_NAME : (
    NULLFILE |
    (AMPERSAND AMPERSAND NAME) | 
    (
        (AMPERSAND | NATL | ALPHA) 
          (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM | '%')+
    )
  )
  ->type(DATASET_NAME),popMode
  ; 

//DCB_ASTERISK : ASTERISK ->type(ASTERISK),mode(DCB_ASTERISK_MODE) ;

DCB_REFERBACK : ASTERISK DOT_DFLT NM_PART (DOT_DFLT NM_PART)? (DOT_DFLT NM_PART)? ->type(REFERBACK),popMode ;

mode DCB_ASTERISK_MODE ;

DCB_ASTERISK_NAME : NAME ->type(NAME) ;
DCB_ASTERISK_DOT : DOT_DFLT ->type(DOT) ;
DCB_ASTERISK_COMMA : COMMA_DFLT ->type(COMMA),mode(DEFAULT_MODE) ;
DCB_ASTERISK_WS : [ ]+ ->channel(HIDDEN),mode(CM) ;
DCB_ASTERISK_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ;

mode DCB_PAREN_MODE ;

DCB_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;
DCB_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
DCB_PAREN_SQUOTE : SQUOTE ->channel(HIDDEN),pushMode(QS) ;

DCB_PAREN_COMMENT_FLAG_INLINE : COMMENT_FLAG_INLINE ->type(COMMENT_FLAG_INLINE),pushMode(COMMA_WS_MODE) ;
DCB_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

DCB_PAREN_BFALN : BFALN_DFLT ->type(BFALN),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BFTEK : BFTEK_DFLT ->type(BFTEK),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BLKSIZE : BLKSIZE_DFLT ->type(BLKSIZE),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BUFIN : BUFIN_DFLT ->type(BUFIN),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BUFL : BUFL_DFLT ->type(BUFL),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BUFMAX : BUFMAX_DFLT ->type(BUFMAX),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BUFNO : BUFNO_DFLT ->type(BUFNO),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BUFOFF : BUFOFF_DFLT ->type(BUFOFF),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BUFOUT : BUFOUT_DFLT ->type(BUFOUT),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_BUFSIZE : BUFSIZE_DFLT ->type(BUFSIZE),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_CPRI : CPRI_DFLT ->type(CPRI),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_CYLOFL : CYLOFL_DFLT ->type(CYLOFL),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_DEN : DEN_DFLT ->type(DEN),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_DIAGNS : DIAGNS_DFLT ->type(DIAGNS),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_DSORG : DSORG_DFLT ->type(DSORG),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_EROPT : EROPT_DFLT ->type(EROPT),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_FUNC : FUNC_DFLT ->type(FUNC),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_GNCP : GNCP_DFLT ->type(GNCP),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_INTVL : INTVL_DFLT ->type(INTVL),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_IPLTXID : IPLTXID_DFLT ->type(IPLTXID),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_KEYLEN : KEYLEN_DFLT ->type(KEYLEN),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_LIMCT : LIMCT_DFLT ->type(LIMCT),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_LRECL : LRECL_DFLT ->type(LRECL),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_MODE : MODE_DFLT ->type(MODE),pushMode(KYWD_VAL_MODE) ; 
DCB_PAREN_NCP : NCP_DFLT ->type(NCP),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_NTM : NTM_DFLT ->type(NTM),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_OPTCD : OPTCD_DFLT ->type(OPTCD),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_PCI : PCI_DFLT ->type(PCI),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_PRTSP : PRTSP_DFLT ->type(PRTSP),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_RECFM : RECFM_DFLT ->type(RECFM),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_RESERVE : RESERVE_DFLT ->type(RESERVE),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_RKP : RKP_DFLT ->type(RKP),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_STACK : STACK_DFLT ->type(STACK),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_THRESH : THRESH_DFLT ->type(THRESH),pushMode(KYWD_VAL_MODE) ;
DCB_PAREN_TRTCH : TRTCH_DFLT ->type(TRTCH),pushMode(KYWD_VAL_MODE) ;

/*
This pattern is _very_ inclusive.  Consider...

&SYSUID..JCL.CNTL
LIB.&SYSUID
&SYSUID.P.&LIB
MASTER.FILE.%%ODATE

*/
DCB_PAREN_DATASET_NAME : (
    NULLFILE |
    (AMPERSAND AMPERSAND NAME) | 
    (
        (AMPERSAND | NATL | ALPHA) 
          (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM | '%')+
    )
  )
  ->type(DATASET_NAME)
  ; 

DCB_PAREN_REFERBACK : ASTERISK DOT_DFLT NM_PART (DOT_DFLT NM_PART)? (DOT_DFLT NM_PART)? ->type(REFERBACK) ;


mode MEMBER_MODE ;

MEMBER_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
MEMBER_NAME : (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM)+ ->mode(DEFAULT_MODE) ;

mode ORDER_MODE ;

/*

Note the difference between ORDER_MODE and ORDER_PAREN_MODE.  

The possibilities...

// JCLLIB ORDER=SYS1.PROCLIB                 COMMENT
// JCLLIB ORDER='SYS1.PROCLIB'               COMMENT
// JCLLIB ORDER=(SYS1.PROCLIB)               COMMENT
// JCLLIB ORDER=('SYS1.PROCLIB')             COMMENT
// JCLLIB ORDER=(SYS1.PROCLIB,USER.PROCLIB)  COMMENT
// JCLLIB ORDER=(SYS1.PROCLIB,               COMMENT
//        USER.PROCLIB)                      COMMENT

...are handled differently due to different mode exit requirements.  The
first two can exit on encountering whitespace and switch to mode(CM), or
on encountering a DATASET_NAME.

The remaining cases must mode(ORDER_MODE_CM) which will mode(ORDER_PAREN_MODE)
on encountering a NEWLINE.  The only exit is via RPAREN, which closes the
group of libraries.

The DATASET_NAME definition is copied from DSN_MODE, save for the parens and % and +.

*/

ORDER_MODE_LPAREN : LPAREN_DFLT ->type(LPAREN),mode(ORDER_PAREN_MODE) ;
ORDER_MODE_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(DEFAULT_MODE) ;
ORDER_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
ORDER_MODE_SQUOTE : SQUOTE ->channel(HIDDEN),pushMode(QS) ;
ORDER_MODE_COMMA : COMMA_DFLT ->type(COMMA) ;
ORDER_MODE_WS : [ ]+ ->channel(HIDDEN),mode(CM) ;
ORDER_MODE_NEWLINE : [\n\r] ->channel(HIDDEN),mode(DEFAULT_MODE) ; 
ORDER_MODE_SS : SS ->channel(HIDDEN) ;
ORDER_MODE_CONTINUATION_WS : CONTINUATION_WS ->channel(HIDDEN) ;

ORDER_MODE_DATASET_NAME : (
    NULLFILE |
    (AMPERSAND AMPERSAND NAME) | 
    (
        (AMPERSAND | NATL | ALPHA) 
          (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM)+
    )
  )
  ->mode(DEFAULT_MODE),type(DATASET_NAME) 
  ; //TODO remove mode(DEFAULT_MODE) ?

mode ORDER_PAREN_MODE ;

/*

Note the difference between ORDER_MODE and ORDER_PAREN_MODE.  

The possibilities...

// JCLLIB ORDER=SYS1.PROCLIB                 COMMENT
// JCLLIB ORDER='SYS1.PROCLIB'               COMMENT
// JCLLIB ORDER=(SYS1.PROCLIB)               COMMENT
// JCLLIB ORDER=('SYS1.PROCLIB')             COMMENT
// JCLLIB ORDER=(SYS1.PROCLIB,USER.PROCLIB)  COMMENT
// JCLLIB ORDER=(SYS1.PROCLIB,               COMMENT
//        USER.PROCLIB)                      COMMENT

...are handled differently due to different mode exit requirements.  The
first two can exit on encountering whitespace and switch to mode(CM).

The DATASET_NAME definition is copied from DSN_MODE, save for the parens and % and +.

*/


ORDER_PAREN_MODE_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
ORDER_PAREN_MODE_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(DEFAULT_MODE) ;
ORDER_PAREN_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
ORDER_PAREN_MODE_SQUOTE : SQUOTE ->channel(HIDDEN),pushMode(QS) ;
ORDER_PAREN_MODE_COMMA : COMMA_DFLT ->type(COMMA) ;
ORDER_PAREN_MODE_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
ORDER_PAREN_MODE_NEWLINE : [\n\r] ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ; 

ORDER_PAREN_MODE_DATASET_NAME : (
    NULLFILE |
    (AMPERSAND AMPERSAND NAME) | 
    (
        (AMPERSAND | NATL | ALPHA) 
          (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM)+
    )
  )
  ->type(DATASET_NAME) 
  ;

mode JOB_MODE ;

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
//ABC JOB ,TIME=10
//ABC JOB ACCT-DATA,CSCHNEID,TIME=10
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


JOB_MODE_WS : [ ]+ ->channel(HIDDEN),mode(JOB_ACCT_MODE1) ;
JOB_MODE_COMMENT_FLAG : COMMENT_FLAG_DFLT ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
JOB_MODE_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;
JOB_MODE_LINE_NB : LINE_NB ->skip ;
JOB_MODE_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
JOB_MODE_RPAREN : RPAREN_DFLT ->type(RPAREN) ;

JOB_MODE_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
JOB_MODE_UNQUOTED_STRING : (~[,'\n\r] | SQUOTE2)+? ;


JOB_MODE_ADDRSPC : ADDRSPC_DFLT ->type(ADDRSPC),mode(DEFAULT_MODE) ;
JOB_MODE_BYTES : BYTES_DFLT ->type(BYTES),mode(DEFAULT_MODE) ;
JOB_MODE_CARDS : CARDS_DFLT ->type(CARDS),mode(DEFAULT_MODE) ;
JOB_MODE_CCSID : CCSID_DFLT ->type(CCSID),mode(DEFAULT_MODE) ;
JOB_MODE_CLASS : CLASS_DFLT ->type(CLASS),mode(CL) ;
JOB_MODE_COND : COND_DFLT ->type(COND),mode(DEFAULT_MODE) ;
JOB_MODE_DSENQSHR : DSENQSHR_DFLT ->type(DSENQSHR),mode(DEFAULT_MODE) ;
JOB_MODE_EMAIL : EMAIL_DFLT ->type(EMAIL),mode(DEFAULT_MODE) ;
JOB_MODE_GDGBIAS : GDGBIAS_DFLT ->type(GDGBIAS),mode(GDGBIAS_MODE) ;
JOB_MODE_GROUP : GROUP_DFLT ->type(GROUP),mode(DEFAULT_MODE) ;
JOB_MODE_JESLOG : JESLOG_DFLT ->type(JESLOG),mode(DEFAULT_MODE) ;
JOB_MODE_JOBRC : JOBRC_DFLT ->type(JOBRC),mode(JOBRC_MODE) ;
JOB_MODE_LINES : LINES_DFLT ->type(LINES),mode(DEFAULT_MODE) ;
JOB_MODE_MEMLIMIT : MEMLIMIT_DFLT ->type(MEMLIMIT),mode(DEFAULT_MODE) ;
JOB_MODE_MSGCLASS : MSGCLASS_DFLT ->type(MSGCLASS),mode(DEFAULT_MODE) ;
JOB_MODE_MSGLEVEL : MSGLEVEL_DFLT ->type(MSGLEVEL),mode(DEFAULT_MODE) ;
JOB_MODE_NOTIFY : NOTIFY_DFLT ->type(NOTIFY),mode(DEFAULT_MODE) ;
JOB_MODE_PAGES : PAGES_DFLT ->type(PAGES),mode(DEFAULT_MODE) ;
JOB_MODE_PASSWORD : PASSWORD_DFLT ->type(PASSWORD),mode(DEFAULT_MODE) ;
JOB_MODE_PERFORM : PERFORM_DFLT ->type(PERFORM),mode(DEFAULT_MODE) ;
JOB_MODE_PRTY : PRTY_DFLT ->type(PRTY),mode(DEFAULT_MODE) ;
JOB_MODE_RD : RD_DFLT ->type(RD),mode(RD_MODE) ;
JOB_MODE_REGION : REGION_DFLT ->type(REGION),mode(DEFAULT_MODE) ;
JOB_MODE_REGIONX : REGIONX_DFLT ->type(REGIONX),mode(DEFAULT_MODE) ;
JOB_MODE_RESTART : RESTART_DFLT ->type(RESTART),mode(DEFAULT_MODE) ;
JOB_MODE_SECLABEL : SECLABEL_DFLT ->type(SECLABEL),mode(DEFAULT_MODE) ;
JOB_MODE_SCHENV : SCHENV_DFLT ->type(SCHENV),mode(DEFAULT_MODE) ;
JOB_MODE_SYSAFF : SYSAFF_DFLT ->type(SYSAFF),mode(DEFAULT_MODE) ;
JOB_MODE_SYSTEM : SYSTEM_DFLT ->type(SYSTEM),mode(DEFAULT_MODE) ;
JOB_MODE_TIME : TIME_DFLT ->type(TIME),mode(DEFAULT_MODE) ;
JOB_MODE_TYPRUN : TYPRUN_DFLT ->type(TYPRUN),mode(DEFAULT_MODE) ;
JOB_MODE_UJOBCORR : UJOBCORR_DFLT ->type(UJOBCORR),mode(DEFAULT_MODE) ;
JOB_MODE_USER : USER_DFLT ->type(USER),mode(DEFAULT_MODE) ;

mode JOB_ACCT_MODE1 ;

JOB_ACCT_MODE1_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_COMMENT_FLAG : COMMENT_FLAG_DFLT ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
JOB_ACCT_MODE1_LINE_NB : LINE_NB ->skip ;
JOB_ACCT_MODE1_LPAREN : LPAREN_DFLT ->type(LPAREN),mode(JOB_ACCT_MODE2) ;
JOB_ACCT_MODE1_RPAREN : RPAREN_DFLT ->type(RPAREN) ;

JOB_ACCT_MODE1_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

JOB_ACCT_MODE1_COMMA : COMMA_DFLT ->type(COMMA),mode(JOB_PROGRAMMER_NAME_MODE) ;

JOB_ACCT_MODE1_ADDRSPC : ADDRSPC_DFLT ->type(ADDRSPC),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_BYTES : BYTES_DFLT ->type(BYTES),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_CARDS : CARDS_DFLT ->type(CARDS),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_CCSID : CCSID_DFLT ->type(CCSID),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_CLASS : CLASS_DFLT ->type(CLASS),mode(CL) ;
JOB_ACCT_MODE1_COND : COND_DFLT ->type(COND),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_DSENQSHR : DSENQSHR_DFLT ->type(DSENQSHR),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_EMAIL : EMAIL_DFLT ->type(EMAIL),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_GDGBIAS : GDGBIAS_DFLT ->type(GDGBIAS),mode(GDGBIAS_MODE) ;
JOB_ACCT_MODE1_GROUP : GROUP_DFLT ->type(GROUP),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_JESLOG : JESLOG_DFLT ->type(JESLOG),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_JOBRC : JOBRC_DFLT ->type(JOBRC),mode(JOBRC_MODE) ;
JOB_ACCT_MODE1_LINES : LINES_DFLT ->type(LINES),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_MEMLIMIT : MEMLIMIT_DFLT ->type(MEMLIMIT),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_MSGCLASS : MSGCLASS_DFLT ->type(MSGCLASS),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_MSGLEVEL : MSGLEVEL_DFLT ->type(MSGLEVEL),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_NOTIFY : NOTIFY_DFLT ->type(NOTIFY),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_PAGES : PAGES_DFLT ->type(PAGES),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_PASSWORD : PASSWORD_DFLT ->type(PASSWORD),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_PERFORM : PERFORM_DFLT ->type(PERFORM),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_PRTY : PRTY_DFLT ->type(PRTY),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_RD : RD_DFLT ->type(RD),mode(RD_MODE) ;
JOB_ACCT_MODE1_REGION : REGION_DFLT ->type(REGION),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_REGIONX : REGIONX_DFLT ->type(REGIONX),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_RESTART : RESTART_DFLT ->type(RESTART),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_SECLABEL : SECLABEL_DFLT ->type(SECLABEL),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_SCHENV : SCHENV_DFLT ->type(SCHENV),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_SYSAFF : SYSAFF_DFLT ->type(SYSAFF),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_SYSTEM : SYSTEM_DFLT ->type(SYSTEM),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_TIME : TIME_DFLT ->type(TIME),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_TYPRUN : TYPRUN_DFLT ->type(TYPRUN),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_UJOBCORR : UJOBCORR_DFLT ->type(UJOBCORR),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE1_USER : USER_DFLT ->type(USER),mode(DEFAULT_MODE) ;

JOB_ACCT_MODE1_UNQUOTED_STRING : (~[,'\n\r] | SQUOTE2)+? ;

mode JOB_ACCT_MODE2 ;

JOB_ACCT_MODE2_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE2_COMMENT_FLAG : COMMENT_FLAG_DFLT ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
JOB_ACCT_MODE2_LINE_NB : LINE_NB ->skip ;
JOB_ACCT_MODE2_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
JOB_ACCT_MODE2_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(JOB_ACCT_MODE3) ;

JOB_ACCT_MODE2_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
JOB_ACCT_MODE2_UNQUOTED_STRING : (~[,'\n\r] | SQUOTE2)+? ;

JOB_ACCT_MODE2_COMMA : COMMA_DFLT ->type(COMMA) ;

mode JOB_ACCT_MODE3 ;

JOB_ACCT_MODE3_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;
JOB_ACCT_MODE3_LINE_NB : LINE_NB ->skip ;
JOB_ACCT_MODE3_COMMA : COMMA_DFLT {haveProgrammerName = false;} ->type(COMMA),mode(JOB_PROGRAMMER_NAME_MODE) ;


mode JOB_PROGRAMMER_NAME_MODE ;

/*
The only way into this mode is via JOB_ACCT_MODE3 encountering a comma following the
accounting information.

The only ways out of this mode are via NEWLINE or COMMA provided we have encountered
the programmer name -or- via one of the other valid keywords on the JOB statement.
*/

JOB_PROGRAMMER_NAME_MODE_SS : SS ->channel(HIDDEN) ;
JOB_PROGRAMMER_NAME_MODE_CONTINUATION_WS : ' '+ {getText().length() <= 13}? ->channel(HIDDEN) ;
JOB_PROGRAMMER_NAME_MODE_NEWLINE : NEWLINE {if (haveProgrammerName) mode(DEFAULT_MODE);} ->channel(HIDDEN) ;
JOB_PROGRAMMER_NAME_MODE_COMMENT_FLAG : COMMENT_FLAG_DFLT ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
JOB_PROGRAMMER_NAME_MODE_LINE_NB : LINE_NB ->skip ;
JOB_PROGRAMMER_NAME_MODE_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS_JOB_PROGRAMMER_NAME_MODE) ;
JOB_PROGRAMMER_NAME_MODE_COMMA : COMMA_DFLT {if (haveProgrammerName) mode(DEFAULT_MODE);} ->type(COMMA) ;

JOB_PROGRAMMER_NAME_MODE_ADDRSPC : ADDRSPC_DFLT ->type(ADDRSPC),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_BYTES : BYTES_DFLT ->type(BYTES),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_CARDS : CARDS_DFLT ->type(CARDS),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_CCSID : CCSID_DFLT ->type(CCSID),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_CLASS : CLASS_DFLT ->type(CLASS),mode(CL) ;
JOB_PROGRAMMER_NAME_MODE_COND : COND_DFLT ->type(COND),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_DSENQSHR : DSENQSHR_DFLT ->type(DSENQSHR),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_EMAIL : EMAIL_DFLT ->type(EMAIL),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_GDGBIAS : GDGBIAS_DFLT ->type(GDGBIAS),mode(GDGBIAS_MODE) ;
JOB_PROGRAMMER_NAME_MODE_GROUP : GROUP_DFLT ->type(GROUP),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_JESLOG : JESLOG_DFLT ->type(JESLOG),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_JOBRC : JOBRC_DFLT ->type(JOBRC),mode(JOBRC_MODE) ;
JOB_PROGRAMMER_NAME_MODE_LINES : LINES_DFLT ->type(LINES),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_MEMLIMIT : MEMLIMIT_DFLT ->type(MEMLIMIT),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_MSGCLASS : MSGCLASS_DFLT ->type(MSGCLASS),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_MSGLEVEL : MSGLEVEL_DFLT ->type(MSGLEVEL),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_NOTIFY : NOTIFY_DFLT ->type(NOTIFY),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_PAGES : PAGES_DFLT ->type(PAGES),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_PASSWORD : PASSWORD_DFLT ->type(PASSWORD),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_PERFORM : PERFORM_DFLT ->type(PERFORM),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_PRTY : PRTY_DFLT ->type(PRTY),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_RD : RD_DFLT ->type(RD),mode(RD_MODE) ;
JOB_PROGRAMMER_NAME_MODE_REGION : REGION_DFLT ->type(REGION),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_REGIONX : REGIONX_DFLT ->type(REGIONX),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_RESTART : RESTART_DFLT ->type(RESTART),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_SECLABEL : SECLABEL_DFLT ->type(SECLABEL),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_SCHENV : SCHENV_DFLT ->type(SCHENV),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_SYSAFF : SYSAFF_DFLT ->type(SYSAFF),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_SYSTEM : SYSTEM_DFLT ->type(SYSTEM),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_TIME : TIME_DFLT ->type(TIME),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_TYPRUN : TYPRUN_DFLT ->type(TYPRUN),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_UJOBCORR : UJOBCORR_DFLT ->type(UJOBCORR),mode(DEFAULT_MODE) ;
JOB_PROGRAMMER_NAME_MODE_USER : USER_DFLT ->type(USER),mode(DEFAULT_MODE) ;

JOB_PROGRAMMER_NAME_MODE_UNQUOTED_STRING : (~[,'\n\r] | SQUOTE2)+? {haveProgrammerName = true;} ;

mode STEP_ACCT_MODE ;

STEP_ACCT_MODE_DOT : DOT_DFLT ->type(DOT) ;
STEP_ACCT_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL),mode(STEP_ACCT_MODE1) ;
STEP_ACCT_MODE_NAME : NAME ->type(NAME) ;

mode STEP_ACCT_MODE1 ;

STEP_ACCT_MODE1_NEWLINE : NEWLINE ->channel(HIDDEN),mode(DEFAULT_MODE) ;
STEP_ACCT_MODE1_LINE_NB : LINE_NB ->skip ;
STEP_ACCT_MODE1_LPAREN : LPAREN_DFLT ->type(LPAREN),mode(STEP_ACCT_MODE2) ;
STEP_ACCT_MODE1_RPAREN : RPAREN_DFLT ->type(RPAREN) ;

STEP_ACCT_MODE1_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

STEP_ACCT_MODE1_COMMA : COMMA_DFLT ->type(COMMA),mode(DEFAULT_MODE) ;

STEP_ACCT_MODE1_UNQUOTED_STRING : (~[,'\n\r] | SQUOTE2)+? ;

mode STEP_ACCT_MODE2 ;

STEP_ACCT_MODE2_NEWLINE : NEWLINE ->channel(HIDDEN) ;
STEP_ACCT_MODE2_LINE_NB : LINE_NB ->skip ;
STEP_ACCT_MODE2_LPAREN : LPAREN_DFLT ->type(LPAREN) ;
STEP_ACCT_MODE2_RPAREN : RPAREN_DFLT ->type(RPAREN),mode(DEFAULT_MODE) ;

STEP_ACCT_MODE2_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
STEP_ACCT_MODE2_UNQUOTED_STRING : (~[,'\n\r] | SQUOTE2)+? ;

STEP_ACCT_MODE2_COMMA : COMMA_DFLT ->type(COMMA) ;

mode PARMDD_MODE ;

PARMDD_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
PARMDD_NAME : NAME ->mode(DEFAULT_MODE) ;


mode KYWD_VAL_MODE ;

KYWD_VAL_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
KYWD_VAL_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
KEYWORD_VALUE : [A-Z0-9@#$*\-+&./%[]+ ->popMode ;
KYWD_VAL_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
KYWD_VAL_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(KYWD_VAL_PAREN_MODE) ;
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
take us back into the "parent" mode.

*/
KYWD_VAL_NEWLINE : NEWLINE {_modeStack.clear();} ->type(NEWLINE),channel(HIDDEN),mode(DEFAULT_MODE) ;
KYWD_VAL_COMMA_NEWLINE : COMMA_DFLT NEWLINE ->channel(HIDDEN),mode(COMMA_NEWLINE_MODE) ;
KYWD_VAL_WS : [ ]+ {_modeStack.clear();} ->channel(HIDDEN),mode(CM) ;

mode KYWD_VAL_PAREN_MODE ;

KYWD_VAL_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
KYWD_VAL_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
KYWD_VAL_PAREN_VALUE : KEYWORD_VALUE ->type(KEYWORD_VALUE) ;
KYWD_VAL_PAREN_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
KYWD_VAL_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

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

*/
KYWD_VAL_PAREN_COMMA_NEWLINE : COMMA_DFLT NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
//KYWD_VAL_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_NEWLINE_CM_MODE) ;
KYWD_VAL_PAREN_COMMA_WS : COMMA_DFLT [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;


mode AMP_MODE ;

AMP_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
AMP_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
AMP_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
AMP_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(AMP_PAREN_MODE) ;

mode AMP_PAREN_MODE ;

AMP_PAREN_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
AMP_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
AMP_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
AMP_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;
AMP_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
AMP_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

mode COPIES_MODE ;

COPIES_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
COPIES_VALUE : [0-9]+ ->popMode ;
COPIES_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
COPIES_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(COPIES_PAREN_MODE) ;

mode COPIES_PAREN_MODE ;

COPIES_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
COPIES_PAREN_VALUE : COPIES_VALUE ->type(COPIES_VALUE) ;
COPIES_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
COPIES_PAREN_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(COPIES_GROUP_MODE) ;
COPIES_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ; 

mode COPIES_GROUP_MODE ;

COPIES_GROUP_COMMA : COMMA_DFLT ->type(COMMA) ;
COPIES_GROUP_VALUE : COPIES_VALUE ;
COPIES_GROUP_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
COPIES_GROUP_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ; 

mode DISP_MODE ;

DISP_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DISP_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
DISP_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(DISP_PAREN_MODE) ;

DISP_MOD : M O D ->popMode ;
DISP_NEW : N E W ->popMode ;
DISP_OLD : O L D ->popMode ;
DISP_SHR : S H R ->popMode ;

mode DISP_PAREN_MODE ;

DISP_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
DISP_PAREN_MOD : DISP_MOD ->type(DISP_MOD) ;
DISP_PAREN_NEW : DISP_NEW ->type(DISP_NEW) ;
DISP_PAREN_OLD : DISP_OLD ->type(DISP_OLD) ;
DISP_PAREN_SHR : DISP_SHR ->type(DISP_SHR) ;
DISP_CATLG : C A T L G ;
DISP_DELETE : D E L E T E ;
DISP_KEEP : K E E P ;
DISP_PASS : P A S S ;
DISP_UNCATLG : U N C A T L G ;
DISP_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
DISP_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode DSID_MODE ;

DSID_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DSID_VALUE : [A-Z0-9@#$[\-]+ ->popMode ;
DSID_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
DSID_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(DSID_PAREN_MODE) ;

mode DSID_PAREN_MODE ;

DSID_PAREN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(DSID_V_MODE) ;
DSID_PAREN_VALUE : DSID_VALUE ->type(DSID_VALUE) ;
DSID_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
DSID_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode DSID_V_MODE ;

DSID_VERIFIED : 'V' ->popMode ;
DSID_V_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;

mode LABEL_MODE ;

LABEL_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
LABEL_SEQUENCE : NUM_LIT_DFLT ->popMode ;
LABEL_LPAREN : LPAREN_DFLT ->type(LPAREN),mode(LABEL_MODE2) ;
LABEL_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
LABEL_RETPD : RETPD_DFLT ->type(RETPD),mode(KYWD_VAL_MODE) ;
LABEL_EXPDT : EXPDT_DFLT ->type(EXPDT),mode(KYWD_VAL_MODE) ;

mode LABEL_MODE2 ;

LABEL2_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
LABEL2_COMMA : COMMA_DFLT ->type(COMMA),mode(LABEL_MODE3) ;
LABEL2_SEQUENCE : NUM_LIT_DFLT ->type(LABEL_SEQUENCE);
LABEL2_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ;
LABEL2_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
LABEL2_RETPD : RETPD_DFLT ->type(RETPD),pushMode(KYWD_VAL_MODE) ;
LABEL2_EXPDT : EXPDT_DFLT ->type(EXPDT),pushMode(KYWD_VAL_MODE) ;

mode LABEL_MODE3 ;

LABEL3_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
LABEL3_COMMA : COMMA_DFLT ->type(COMMA),mode(LABEL_MODE4) ;
LABEL_TYPE : [ABLMNPSTU]+ ;
LABEL3_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ;
LABEL3_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
LABEL3_RETPD : RETPD_DFLT ->type(RETPD),pushMode(KYWD_VAL_MODE) ;
LABEL3_EXPDT : EXPDT_DFLT ->type(EXPDT),pushMode(KYWD_VAL_MODE) ;

mode LABEL_MODE4 ;

LABEL4_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
LABEL4_COMMA : COMMA_DFLT ->type(COMMA),mode(LABEL_MODE5) ;
LABEL_PASSWORD_PROTECT : (LABEL_PASSWORD | LABEL_NOPWREAD) ;
LABEL4_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ;
LABEL4_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
LABEL4_RETPD : RETPD_DFLT ->type(RETPD),pushMode(KYWD_VAL_MODE) ;
LABEL4_EXPDT : EXPDT_DFLT ->type(EXPDT),pushMode(KYWD_VAL_MODE) ;

fragment LABEL_PASSWORD : P A S S W O R D ;
fragment LABEL_NOPWREAD : N O P W R E A D ;

mode LABEL_MODE5 ;

LABEL5_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
LABEL5_COMMA : COMMA_DFLT ->type(COMMA) ;
LABEL_I_O : (LABEL_INPUT | LABEL_OUTPUT) ;
LABEL5_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ;
LABEL5_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
LABEL5_RETPD : RETPD_DFLT ->type(RETPD),pushMode(KYWD_VAL_MODE) ;
LABEL5_EXPDT : EXPDT_DFLT ->type(EXPDT),pushMode(KYWD_VAL_MODE) ;

fragment LABEL_INPUT : I N ;
fragment LABEL_OUTPUT : O U T ;

mode OUTPUT_PARM_MODE ;

OUTPUT_PARM_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
//OUTPUT_PARM_ASTERISK : ASTERISK ->type(ASTERISK) ;
//OUTPUT_PARM_NAME : NAME ->type(NAME) ;
//OUTPUT_PARM_DOT : DOT_DFLT ->type(DOT) ;
OUTPUT_PARM_REFERENCE : ASTERISK DOT_DFLT NM_PART (DOT_DFLT NM_PART)? (DOT_DFLT NM_PART)? ->popMode ;
OUTPUT_PARM_LPAREN : LPAREN_DFLT ->type(LPAREN),mode(OUTPUT_PARM_PAREN_MODE) ;

mode OUTPUT_PARM_PAREN_MODE ;

OUTPUT_PARM_PAREN_REFERENCE : ASTERISK DOT_DFLT NM_PART (DOT_DFLT NM_PART)? (DOT_DFLT NM_PART)?
     ->type(OUTPUT_PARM_REFERENCE) ;
OUTPUT_PARM_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
OUTPUT_PARM_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
OUTPUT_PARM_PAREN_NEWLINE : [\n\r] ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
OUTPUT_PARM_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ;

mode PATH_MODE ;

PATH_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
PATH_VALUE : [A-Z0-9@#$/+-.&*]+ ->popMode ;
PATH_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

mode PATHDISP_MODE ;

PATHDISP_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
PATHDISP_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
PATHDISP_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(PATHDISP_PAREN_MODE) ;

PATHDISP_DELETE : D E L E T E ->popMode ;
PATHDISP_KEEP : K E E P ->popMode ;

mode PATHDISP_PAREN_MODE ;

PATHDISP_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
PATHDISP_PAREN_DELETE : PATHDISP_DELETE ->type(PATHDISP_DELETE) ;
PATHDISP_PAREN_KEEP : PATHDISP_KEEP ->type(PATHDISP_KEEP) ;
PATHDISP_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
PATHDISP_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode PATHMODE_MODE ;

PATHMODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
PATHMODE_VALUE : (PATHMODE_OWNER | PATHMODE_GROUP | PATHMODE_OTHER | PATHMODE_SET) ->popMode ;
PATHMODE_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
PATHMODE_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(PATHMODE_PAREN_MODE) ;

fragment PATHMODE_OWNER : (
    (S I R U S R) |
    (S I W U S R) |
    (S I X U S R) |
    (S I R W X U)
  ) ;
fragment PATHMODE_GROUP : (
    (S I R G R P) |
    (S I W G R P) |
    (S I X G R P) |
    (S I R W X G)
  ) ;
fragment PATHMODE_OTHER : (
    (S I R O T H) |
    (S I W O T H) |
    (S I X O T H) |
    (S I R W X O)
  ) ;
fragment PATHMODE_SET : (
    (S I S U I D) |
    (S I S G I D)
  ) ;

mode PATHMODE_PAREN_MODE ;

PATHMODE_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
PATHMODE_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
PATHMODE_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
PATHMODE_PAREN_VALUE : PATHMODE_VALUE ->type(PATHMODE_VALUE) ;
PATHMODE_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
PATHMODE_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode PATHOPTS_MODE ;

PATHOPTS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
PATHOPTS_VALUE : (PATHOPTS_ACCESS | PATHOPTS_STATUS) ->popMode;
PATHOPTS_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
PATHOPTS_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(PATHOPTS_PAREN_MODE) ;

fragment PATHOPTS_ACCESS : (
    (O R D O N L Y) |
    (O W R O N L Y) |
    (O R D W R)
  ) ;
fragment PATHOPTS_STATUS : (
    (O A P P E N D) |
    (O C R E A T) |
    (O E X C L) |
    (O N O C T T Y) |
    (O N O N B L O C K) |
    (O S Y N C) |
    (O T R U N C)
  ) ;

mode PATHOPTS_PAREN_MODE ;

PATHOPTS_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
PATHOPTS_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
PATHOPTS_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
PATHOPTS_PAREN_VALUE : PATHOPTS_VALUE ->type(PATHOPTS_VALUE) ;
PATHOPTS_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
PATHOPTS_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode PROTECT_MODE ;

PROTECT_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
PROTECT_VALUE : (PROTECT_YES | PROTECT_Y) ->popMode ;
PROTECT_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;

fragment PROTECT_YES : Y E S ;
fragment PROTECT_Y : Y ;

mode RLS_MODE ;

RLS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
RLS_VALUE : (RLS_NRI | RLS_CR | RLS_CRE) ->popMode ;
RLS_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;

fragment RLS_NRI : N R I ;
fragment RLS_CR : C R ;
fragment RLS_CRE : C R E ;

mode ROACCESS_MODE ;

ROACCESS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
ROACCESS_REQUEST : (ROACCESS_ALLOW | ROACCESS_DISALLOW) ->popMode ;
ROACCESS_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
ROACCESS_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(ROACCESS_PAREN_MODE) ;

fragment ROACCESS_ALLOW : A L L O W ;
fragment ROACCESS_DISALLOW : D I S A L L O W ;

mode ROACCESS_PAREN_MODE ;

ROACCESS_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
ROACCESS_PAREN_REQUEST : ROACCESS_REQUEST ->type(ROACCESS_REQUEST) ;
ROACCESS_LOCK : (ROACCESS_EXTLOCK | ROACCESS_TRKLOCK) ;
ROACCESS_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
ROACCESS_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

fragment ROACCESS_EXTLOCK : E X T L O C K ;
fragment ROACCESS_TRKLOCK : T R K L O C K ;

mode SECMODEL_MODE ;

SECMODEL_MODE_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
DATASET_PROFILE : (NATL | ALPHA) (ALPHA | NATL | NUM | DOT_DFLT | ASTERISK | '%')* ->popMode ;
SECMODEL_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(SECMODEL_PAREN_MODE) ;

mode SECMODEL_PAREN_MODE ;

SECMODEL_PAREN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(SECMODEL_COMMA_MODE) ;
DATASET_PAREN_PROFILE : DATASET_PROFILE ->type(DATASET_PROFILE) ;
SECMODEL_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode SECMODEL_COMMA_MODE ;

SECMODEL_GENERIC : G E N E R I C ->popMode ;

mode SUBSYS_MODE ;

SUBSYS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
SUBSYS_NAME : [A-Z0-9@#$]+ {getText().length() <= 4}? ->popMode ;
SUBSYS_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
SUBSYS_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(SUBSYS_PAREN_MODE) ;

mode SUBSYS_PAREN_MODE ;

//SUBSYS_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN) ;
SUBSYS_PAREN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(SUBSYS_COMMA_MODE) ;
SUBSYS_PAREN_NAME : SUBSYS_NAME ->type(SUBSYS_NAME) ;
SUBSYS_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
SUBSYS_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;
SUBSYS_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

mode SUBSYS_COMMA_MODE ;

SUBSYS_COMMA_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
SUBSYS_COMMA_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
SUBSYS_COMMA_COMMA : COMMA_DFLT ->type(COMMA) ;
SUBSYS_PARM : [A-Z0-9@#$]+ ;
SUBSYS_COMMA_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
SUBSYS_COMMA_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode ;
SUBSYS_COMMA_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

mode SYMBOLS_MODE ;

SYMBOLS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
SYMBOLS_VALUE : (SYMBOLS_CNVTSYS | SYMBOLS_EXECSYS | SYMBOLS_JCLONLY) ->popMode;
SYMBOLS_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
SYMBOLS_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(SYMBOLS_PAREN_MODE) ;

fragment SYMBOLS_CNVTSYS : C N V T S Y S ;
fragment SYMBOLS_EXECSYS : E X E C S Y S ;
fragment SYMBOLS_JCLONLY : J C L O N L Y ;

mode SYMBOLS_PAREN_MODE ;

SYMBOLS_PAREN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(SYMBOLS_COMMA_MODE) ;
SYMBOLS_PAREN_VALUE : SYMBOLS_VALUE ->type(SYMBOLS_VALUE) ;
SYMBOLS_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
SYMBOLS_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode SYMBOLS_COMMA_MODE ;

SYMBOLS_LOGGING_DDNAME : NAME ->type(LOGGING_DDNAME),popMode ;
SYMBOLS_COMMA_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;

mode SYMLIST_MODE ;

SYMLIST_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
SYMLIST_VALUE : [A-Z0-9@#$*]+ {getText().length() <= 8}? ->popMode ;
SYMLIST_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
SYMLIST_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(SYMLIST_PAREN_MODE) ;

mode SYMLIST_PAREN_MODE ;

SYMLIST_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
SYMLIST_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
SYMLIST_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;
SYMLIST_PAREN_VALUE : SYMLIST_VALUE ->type(SYMLIST_VALUE) ;
SYMLIST_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode SYSOUT_MODE ;

SYSOUT_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
SYSOUT_CLASS : [A-Z0-9*$] ->popMode ;
SYSOUT_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
SYSOUT_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
SYSOUT_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(SYSOUT_PAREN_MODE) ;

mode SYSOUT_PAREN_MODE ;

SYSOUT_PAREN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(SYSOUT_WRITER_MODE) ;
SYSOUT_PAREN_CLASS : [A-Z0-9*$] ->type(SYSOUT_CLASS) ;
SYSOUT_PAREN_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
SYSOUT_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
SYSOUT_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode SYSOUT_WRITER_MODE ;

SYSOUT_WRITER_COMMA : COMMA_DFLT ->type(COMMA),pushMode(SYSOUT_FORM_MODE) ;
SYSOUT_INTRDR : I N T R D R ;
SYSOUT_WRITER : [A-Z0-9]+ {getText().length() <= 8}? ;
SYSOUT_WRITER_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
SYSOUT_WRITER_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode ;

mode SYSOUT_FORM_MODE ;

SYSOUT_FORM : [A-Z0-9@#$]+ {getText().length() <= 4}? ->popMode ;
SYSOUT_FORM_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;

mode UCS_MODE ;

UCS_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
UCS_CODE : [A-Z0-9@#$]+ {getText().length() <= 4}? ->popMode ;
UCS_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
UCS_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(UCS_PAREN_MODE) ;

mode UCS_PAREN_MODE ;

UCS_PAREN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(UCS_FOLD_MODE) ;
UCS_PAREN_CODE : [A-Z0-9@#$]+ {getText().length() <= 4}? ->type(UCS_CODE) ;
UCS_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
UCS_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode UCS_FOLD_MODE ;

UCS_FOLD_COMMA : COMMA_DFLT ->type(COMMA),pushMode(UCS_VERIFY_MODE) ;
UCS_FOLD : F O L D ;
UCS_FOLD_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
UCS_FOLD_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode ;

mode UCS_VERIFY_MODE ;

UCS_VERIFY : V E R I F Y ->popMode ;
UCS_VERIFY_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;

mode UNIT_MODE ;

UNIT_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
UNIT_AFF : A F F ->pushMode(UNIT_AFF_MODE) ;
UNIT_NUMBER : (UNIT_3DIGIT | UNIT_4DIGIT) ->popMode ;
UNIT_GROUP_NAME : [A-Z0-9]+ {getText().length() <= 8}? ->popMode ;
UNIT_DEVICE_TYPE : [A-Z0-9-]+ ->popMode ;
UNIT_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
UNIT_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(UNIT_PAREN_MODE) ;

fragment HEX_DIGIT : [A-F0-9] ;
fragment UNIT_3DIGIT : SLASH? HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
fragment UNIT_4DIGIT : SLASH HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;

mode UNIT_AFF_MODE ;

UNIT_AFF_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
UNIT_DDNAME : NAME ->popMode,popMode ;

mode UNIT_PAREN_MODE ;

UNIT_PAREN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(UNIT_COUNT_MODE) ;
UNIT_PAREN_NUMBER : UNIT_NUMBER ->type(UNIT_NUMBER) ;
UNIT_PAREN_GROUP_NAME : UNIT_GROUP_NAME {getText().length() <= 8}? ->type(UNIT_GROUP_NAME) ;
UNIT_PAREN_DEVICE_TYPE : UNIT_DEVICE_TYPE ->type(UNIT_DEVICE_TYPE) ;
UNIT_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
UNIT_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode UNIT_COUNT_MODE ;

UNIT_COUNT_COMMA : COMMA_DFLT ->type(COMMA),pushMode(UNIT_DEFER_MODE) ;
UNIT_COUNT : NUM_LIT_DFLT ;
UNIT_ALLOC : P ;
UNIT_COUNT_DEFER : D E F E R ->type(UNIT_DEFER) ;
UNIT_COUNT_SMSHONOR : S M S H O N O R ->type(UNIT_SMSHONOR) ;
UNIT_COUNT_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
UNIT_COUNT_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode ;

mode UNIT_DEFER_MODE ;

UNIT_DEFER_COMMA : COMMA_DFLT ->type(COMMA),pushMode(UNIT_SMSHONOR_MODE) ;
UNIT_DEFER : D E F E R ;
UNIT_DEFER_SMSHONOR : S M S H O N O R ->type(UNIT_SMSHONOR) ;
UNIT_DEFER_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
UNIT_DEFER_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode,popMode ;

mode UNIT_SMSHONOR_MODE ;

UNIT_SMSHONOR : S M S H O N O R ->popMode ;
UNIT_SMSHONOR_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;

mode VOL_MODE ;

VOL_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
VOL_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
VOL_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(VOL_PRIVATE_MODE) ;
VOL_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ;

VOL_PRIVATE : P R I V A T E ->popMode ;
VOL_RETAIN : R E T A I N ;
VOL_SER : S E R ->pushMode(VOL_SER1_MODE) ;
VOL_REF : R E F ->pushMode(VOL_REF1_MODE) ;

/*
Note that there is a VOL_SER1_MODE and a VOL_SER3_MODE.  The former
is for VOL=SER=ABC and VOL=SER=(ABC,123) and the latter is for
VOL=(,,,,SER=ABC) and VOL=(,,,,SER=(ABC,123)).
*/

mode VOL_SER1_MODE ;

VOL_SER1_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
VOL_SER_NB : [A-Z0-9@#$-]+ ->popMode,popMode ;
VOL_SER1_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode,popMode ;
VOL_SER1_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
VOL_SER1_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(VOL_SER1_PAREN_MODE) ;

mode VOL_SER1_PAREN_MODE ;

VOL_SER1_PAREN : [A-Z0-9@#$-]+ ->type(VOL_SER_NB) ;
VOL_SER1_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
VOL_SER1_PAREN_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
VOL_SER1_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode ;
VOL_SER1_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
VOL_SER1_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
VOL_SER1_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

mode VOL_PRIVATE_MODE ;

VOL_PRIVATE_COMMA : COMMA_DFLT ->type(COMMA),pushMode(VOL_RETAIN_MODE) ;
VOL_PRIVATE1 : VOL_PRIVATE ->type(VOL_PRIVATE) ;
VOL_PRIVATE_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
VOL_PRIVATE_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;

mode VOL_RETAIN_MODE ;

VOL_RETAIN_COMMA : COMMA_DFLT ->type(COMMA),pushMode(VOL_SEQ_NB_MODE) ;
VOL_RETAIN1 : VOL_RETAIN ->type(VOL_RETAIN) ;
VOL_RETAIN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
VOL_RETAIN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode ;
VOL_RETAIN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
VOL_RETAIN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

mode VOL_SEQ_NB_MODE ;

VOL_SEQ_NB_COMMA : COMMA_DFLT ->type(COMMA),pushMode(VOL_COUNT_MODE) ;
VOL_SEQ_NB : NUM_LIT_DFLT ;
VOL_SEQ_NB_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
VOL_SEQ_NB_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode,popMode ;
VOL_SEQ_NB_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
VOL_SEQ_NB_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

mode VOL_COUNT_MODE ;

VOL_COUNT_COMMA : COMMA_DFLT ->type(COMMA),pushMode(VOL_SER2_MODE) ;
VOL_COUNT : NUM_LIT_DFLT ;
VOL_COUNT_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
VOL_COUNT_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode,popMode,popMode ;
VOL_COUNT_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
VOL_COUNT_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

mode VOL_SER2_MODE ;

VOL_SER2_REF : VOL_REF ->type(VOL_REF),pushMode(VOL_REF2_MODE) ;
VOL_SER2 : VOL_SER ->type(VOL_SER) ;
VOL_SER2_EQUAL : EQUAL_DFLT ->type(EQUAL),pushMode(VOL_SER3_MODE) ;
VOL_SER2_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
VOL_SER2_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

mode VOL_SER3_MODE ;

VOL_SER3 : [A-Z0-9@#$-]+ ->type(VOL_SER_NB) ;
VOL_SER3_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
VOL_SER3_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
VOL_SER3_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(VOL_SER3_PAREN_MODE) ;
VOL_SER3_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode,popMode,popMode,popMode,popMode ;

mode VOL_SER3_PAREN_MODE ;

VOL_SER3_PAREN : [A-Z0-9@#$-]+ ->type(VOL_SER_NB) ;
VOL_SER3_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
VOL_SER3_PAREN_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
VOL_SER3_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode ;
VOL_SER3_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
VOL_SER3_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
VOL_SER3_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;

mode VOL_REF1_MODE ;

VOL_REF1_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
VOL_REF_REFERBACK : ASTERISK DOT_DFLT NM_PART (DOT_DFLT NM_PART)? (DOT_DFLT NM_PART)? ->popMode,popMode ;
VOL_REF1_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

/*
Note that VOL_REF1_DSN doesn't quite match DSN_MODE_DATASET_NAME.  The parens
are missing.  From the z/OS 2.3 documentation...

 The dsname cannot be a generation data group (GDG) base name or a member name of a non-GDG data set.

...which makes life easier because we also have to match the RPAREN ending the VOL=() group.
*/
VOL_REF1_DSN : 
    (AMPERSAND | NATL | ALPHA) 
        (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM | '%')*
 ->type(DATASET_NAME),popMode,popMode ;
VOL_REF1_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode,popMode ;
VOL_REF1_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;


/*

Breaking out of VOL_REF2_MODE involves six popMode operations.  If you're
keeping track, that one short of getting us out of VOL_MODE.  That's 
because VOL_MODE has the responsibility of eating the right paren (RPAREN)
token and bringing us back to whence we came.

*/
mode VOL_REF2_MODE ;

VOL_REF2_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
VOL_REF2_REFERBACK : ASTERISK DOT_DFLT NM_PART (DOT_DFLT NM_PART)? (DOT_DFLT NM_PART)? ->type(VOL_REF_REFERBACK),popMode,popMode,popMode,popMode,popMode,popMode ;
VOL_REF2_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;

/*
Note that VOL_REF2_DSN doesn't quite match DSN_MODE_DATASET_NAME.  The parens
are missing.  From the z/OS 2.3 documentation...

 The dsname cannot be a generation data group (GDG) base name or a member name of a non-GDG data set.

...which makes life easier because we also have to match the RPAREN ending the VOL=() group.
*/
VOL_REF2_DSN : 
    (AMPERSAND | NATL | ALPHA) 
        (AMPERSAND | ALPHA | DOT_DFLT | NATL | NUM | '%')*
 ->type(DATASET_NAME),popMode,popMode,popMode,popMode,popMode,popMode ;
VOL_REF2_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode,popMode,popMode,popMode,popMode,popMode ;
VOL_REF2_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode,popMode,popMode,popMode,popMode ;



