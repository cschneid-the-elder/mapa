/*
Copyright (C) 2019 - 2023 Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.


I do not like thee, JCL,
The reason why -- I cannot tell;
But this I know, and know full well,
I do not like thee, JCL.

*/

parser grammar JCLPPParser;

options {tokenVocab=JCLPPLexer;}


startRule : jcl | EOF ;

jcl : execJCL+ | procJCL ;

execJCL
	: jesExecutionControlStatements	
		(jobCard 
			(jclCommandStatement 
			| jes2CntlStatement 
			| commandStatement 
			| commentStatement 
			| joblibAmalgamation 
			| syschkAmalgamation 
			| jcllibStatement 
			| cntlStatementAmalgamation 
			| notifyStatement 
			| xmitStatement)* 
			(jclCommandStatement 
			| commandStatement 
			| commentStatement 
			| jclStep 
			| ifStatement 
			| elseStatement 
			| endifStatement 
			| includeStatement 
			| exportStatement 
			| outputStatement 
			| procStatement 
			| pendStatement 
			| scheduleStatement 
			| setStatement)*
			nullStatement* jes2CntlStatement* delimiterStatement*)+ 
	EOF?
	;

procJCL : commandStatement? procStatement? (commandStatement | commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | setStatement)+ pendStatement? commentStatement* EOF? ;

procStatement : SS procName? PROC definedSymbolicParameters* ;

defineSymbolicParameter : (PROC_PARM_NAME EQUAL keywordOrSymbolic?) ;

definedSymbolicParameters : defineSymbolicParameter+ ;

commentStatement : COMMENT_FLAG (COMMENT_TEXT | EOF)? ;

inlineComment : COMMENT_FLAG_INLINE? COMMENT_TEXT ;

stepName : NAME_FIELD ;

procName : NAME_FIELD ;

jclStep : execStatement (cntlStatementAmalgamation | ddStatementAmalgamation | outputStatement | includeStatement | commentStatement)* ddParmASTERISK_DATA* ;

/*
System symbols can be substringed...

&SYSCLONE(2:1)

...and you can detect this is your application code by looking for...

KEYWORD_VALUE LPAREN number : number RPAREN

...which, I'm afraid, is all the help I'm willing to provide.

Also keep in mind that system symbols may be prefixed by _two_
ampersands, indicating the interpretation of the symbol is to be
deferred until after the JCL has begun "executing."

*/

keywordOrSymbolic : (QUOTED_STRING_FRAGMENT+ | QS_AMPERSAND+ | QS_SQUOTE2+ | KEYWORD_VALUE | SYMBOLIC)+ ;

datasetName : keywordOrSymbolic (LPAREN keywordOrSymbolic RPAREN)? ;

execStatement : execPgmStatement | execProcStatement ;

execPgmStatement : SS stepName? EXEC PGM EQUAL keywordOrSymbolic execParameter* ;

execProcStatement : SS stepName? EXEC (PROC_EX EQUAL)? keywordOrSymbolic (execProcParm | execParameterOverrides)* ;

execProcParm : EXEC_PROC_PARM EQUAL keywordOrSymbolic ;

/*
Some of the parameters for the EXEC statement are identical to those
of the JOB statement.  I'm duplicating them on the theory that they
are only identical _now_ and may change. It's pretty easy to see which
they are - the upper case part of the name is the same.  Except for 
the COND parameter, which is in fact different.
*/
execParameter : execParmACCT | execParmADDRSPC | execParmCCSID | execParmCOND | execParmDYNAMNBR | execParmMEMLIMIT | execParmPARM | execParmPARMDD | execParmPERFORM | execParmRD | execParmREGION | execParmREGIONX | execParmRLSTMOUT | execParmROLL | execParmTIME | execParmTVSMSG | execParmTVSAMCOM ;

/*
Some of the parameters for the EXEC statement can have a procstepname 
indicating they are potentially overriding a value coded in the proc.
*/

execParameterOverrides : execParmACCT | execParmADDRSPC | execParmCOND | execParmDYNAMNBR | execParmPARM | execParmPERFORM | execParmRD | execParmREGION | execParmREGIONX | execParmTIME ;

execParmACCT : EXEC_ACCT EQUAL singleOrMultipleValue ;

execParmADDRSPC : EXEC_ADDRSPC EQUAL keywordOrSymbolic ;

execParmCCSID : EXEC_CCSID EQUAL keywordOrSymbolic ;

execParmCOND : EXEC_COND EQUAL (
    keywordOrSymbolic |
    (
      LPAREN? 
        (
          COMMA?
          LPAREN?
            keywordOrSymbolic (COMMA keywordOrSymbolic)*
          RPAREN?
        )+
      RPAREN?
    )
  ) ;

execParmDYNAMNBR : EXEC_DYNAMNBR EQUAL keywordOrSymbolic ;

execParmMEMLIMIT : EXEC_MEMLIMIT EQUAL keywordOrSymbolic ;

execParmPARM : EXEC_PARM EQUAL singleOrMultipleValue ;

execParmPARMDD : EXEC_PARMDD EQUAL keywordOrSymbolic ;

execParmPERFORM : EXEC_PERFORM EQUAL keywordOrSymbolic ;

execParmRD : EXEC_RD EQUAL keywordOrSymbolic ; 

execParmREGION : EXEC_REGION EQUAL keywordOrSymbolic;

execParmREGIONX : EXEC_REGIONX EQUAL singleOrMultipleValue ;

execParmRLSTMOUT : EXEC_RLSTMOUT EQUAL keywordOrSymbolic ;

/*
Per the 1976 OS JCL manual retrieved from bitsavers.org, the ROLL
parameter must be coded with both parameters enclosed in parenthesis
separated by a comma.
*/
execParmROLL : EXEC_ROLL EQUAL LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN ;
 
execParmTIME : EXEC_TIME EQUAL singleOrMultipleValue ;

execParmTVSMSG : EXEC_TVSMSG EQUAL keywordOrSymbolic ;

execParmTVSAMCOM : EXEC_TVSAMCOM EQUAL parenList ;

ddStatement : SS ddName DD ddParameter* ddParmASTERISK_DATA* ;

ddStatementConcatenation : SS DD ddParameter* ddParmASTERISK_DATA* ;

ddStatementAmalgamation : ddStatement ddStatementConcatenation* ;

ddName : (NAME | NAME_FIELD) (DOT (NAME | NAME_FIELD))? ;

/*
As this is the preprocessor, the only interesting parts of the DD statement 
are symbolics that need to be resolved and parameters that affect parsing.
*/
ddParameter : ddParmASTERISK | ddParmDATA | ddParmDLM | ddParmSYMBOLS | ddParmSYMLIST | SYMBOLIC+ ;

ddParmASTERISK : ASTERISK ;
ddParmDATA : DATA ;
ddParmDLM : DLM EQUAL keywordOrSymbolic ;
ddParmSYMBOLS : SYMBOLS EQUAL singleOrMultipleValue ;
ddParmSYMLIST : SYMLIST EQUAL singleOrMultipleValue ;
ddParmASTERISK_DATA : DD_ASTERISK_DATA+ (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)? ;


joblibStatement : SS JOBLIB DD SYMBOLIC* ;

joblibConcatenation : SS DD SYMBOLIC* ;

joblibAmalgamation : joblibStatement joblibConcatenation* ;


syschkStatement : SS SYSCHK DD SYMBOLIC* ;

syschkConcatenation : SS DD SYMBOLIC* ;

syschkAmalgamation : syschkStatement syschkConcatenation* ;


jobCard : SS jobName JOB SYMBOLIC* ;

jobName : NAME_FIELD ;


commandStatement : SS NAME_FIELD COMMAND SYMBOLIC* ;

jclCommandStatement : SS JCL_COMMAND SYMBOLIC* ;

cntlStatement : SS NAME_FIELD? CNTL ASTERISK? ;

endcntlStatement : (SS NAME_FIELD ENDCNTL) | CNTL_MODE_TERMINATORX ;

cntlStatementAmalgamation : cntlStatement CNTL_DATA* endcntlStatement ;

exportStatement : SS NAME_FIELD? EXPORT SYMLIST EQUAL singleOrMultipleValue ;

ifStatement : SS NAME_FIELD? IF
    NOT_SYMBOL* LPAREN*
      ifTest RPAREN* (IF_LOGICAL NOT_SYMBOL* LPAREN* ifTest RPAREN*)*
    RPAREN*
    THEN 
  ;

ifRelOp : (IF_EQ | IF_GE | IF_LE | IF_NE | IF_NG | IF_NL | IF_GT | IF_LT) ;
ifKeyword : (ABEND | ABENDCC | RUN | RC) ;
ifTest : IF_STEP? ifKeyword
    (ifRelOp (FALSE | TRUE | NUM_LIT | ALNUMNAT))? ;

elseStatement : SS NAME_FIELD? ELSE ;

endifStatement : SS NAME_FIELD? ENDIF ;

includeStatement : SS NAME_FIELD? INCLUDE INCLUDE_PARM_MEMBER EQUAL keywordOrSymbolic ;

/*
The documentation is unclear about whether ORDER and PROCLIB are mutually 
exclusive, and whether PROCLIB must be specified only once if it is present.

I'm going with: they _are not_ mutually exclusive and that PROCLIB may be
specified multiple times if it is present.

This breaks my Job and PPJob classes.  Probably yours too.  Sorry.
*/
jcllibStatement : 
	SS NAME_FIELD? JCLLIB 
	(
		(JCLLIB_PARM_ORDER EQUAL singleOrMultipleValue (JCLLIB_PARM_PROCLIB EQUAL keywordOrSymbolic)*)
		| 
		(JCLLIB_PARM_PROCLIB EQUAL keywordOrSymbolic (JCLLIB_PARM_PROCLIB EQUAL keywordOrSymbolic)* (JCLLIB_PARM_ORDER EQUAL singleOrMultipleValue)? (JCLLIB_PARM_PROCLIB EQUAL keywordOrSymbolic)*)
	) 
	;

notifyStatement : SS NAME_FIELD? NOTIFY_OP SYMBOLIC* ;


outputStatement : SS NAME_FIELD? OUTPUT SYMBOLIC* ;


pendStatement : SS NAME_FIELD? PEND inlineComment? ;

scheduleStatement : SS NAME_FIELD? SCHEDULE SYMBOLIC* ;


setStatement : SS NAME_FIELD? SET setOperation+ ;

setOperation : (SET_PARM_NAME EQUAL keywordOrSymbolic?) ;

xmitStatement : SS NAME_FIELD? XMIT SYMBOLIC* ddParmASTERISK_DATA* ;


jesExecutionControlStatements : (jobGroupStatement | gJobStatement | jobSetStatement | sJobStatement | endSetStatement | endGroupStatement | afterStatement | beforeStatement | concurrentStatement)* ;

jobGroupStatement : SS NAME_FIELD? JOBGROUP_OP SYMBOLIC* ;


gJobStatement : SS NAME_FIELD? GJOB_OP SYMBOLIC* ;


jobSetStatement : SS NAME_FIELD? JOBSET_OP SYMBOLIC* ;


sJobStatement : SS NAME_FIELD? SJOB_OP ;

endSetStatement : SS NAME_FIELD? ENDSET_OP ;

endGroupStatement : SS NAME_FIELD? ENDGROUP_OP ;

afterStatement : SS AFTER_OP SYMBOLIC* ;


beforeStatement : SS BEFORE_OP SYMBOLIC* ;


concurrentStatement : SS CONCURRENT_OP SYMBOLIC* ;


/*
Trying to accomodate...

PARM=VAL
PARM=(VAL)
PARM=(VAL,VAL,VAL)
PARM=((VAL,VAL),VAL)
PARM=(VAL,(VAL,VAL))
PARM=(,(,VAL))
PARM=A=B
PARM=(VAL,A=B)
PARM=(VAL,,A=B)
PARM=(,,,A=B)
PARM=(,VAL,,A=B)

*/
singleOrMultipleValue : (
    keywordOrSymbolic |
    parenList |
    (LPAREN
      keywordOrSymbolic?
      COMMA
      (parenList | embeddedEquality)*
      (COMMA+ keywordOrSymbolic)*
    RPAREN) |
    (LPAREN
      keywordOrSymbolic? (COMMA keywordOrSymbolic)+
    RPAREN) |
    (LPAREN+
      keywordOrSymbolic (COMMA keywordOrSymbolic RPAREN?)*
    RPAREN+) |
    (LPAREN
      COMMA*
      (keywordOrSymbolic | embeddedEquality)
      (COMMA+ (keywordOrSymbolic | embeddedEquality))*
    RPAREN) | 
	embeddedEquality
  ) ;

parenList : (LPAREN COMMA* keywordOrSymbolic (COMMA+ keywordOrSymbolic)* RPAREN) ;
embeddedEquality : (keywordOrSymbolic EQUAL singleOrMultipleValue) ;

jes2CntlStatement : (jes2JobParmStatement | jes2MessageStatement | jes2NetAcctStatement | jes2NotifyStatement | jes2OutputStatement | jes2PriorityStatement | jes2RouteStatement | jes2SetupStatement | jes2SignoffStatement |  jes2SignonStatement | jes2XEQStatement | jes2XMITStatement) ;

jes2JobParmStatement : SA JES2_JOBPARM jes2JobParmParameters* ;

jes2JobParmParameters : (jes2JobParmBURST | jes2JobParmBYTES | jes2JobParmCARDS | jes2JobParmCOPIES | jes2JobParmFORMS | jes2JobParmLINECT | jes2JobParmLINES | jes2JobParmNOLOG | jes2JobParmPAGES | jes2JobParmPROCLIB | jes2JobParmRESTART | jes2JobParmROOM | jes2JobParmSYSAFF | jes2JobParmTIME) ;

jes2JobParmBURST : JES2_JOBPARM_BURST EQUAL keywordOrSymbolic ;
jes2JobParmBYTES : JES2_JOBPARM_BYTES EQUAL keywordOrSymbolic ;
jes2JobParmCARDS : JES2_JOBPARM_CARDS EQUAL keywordOrSymbolic ;
jes2JobParmCOPIES : JES2_JOBPARM_COPIES EQUAL keywordOrSymbolic ;
jes2JobParmFORMS : JES2_JOBPARM_FORMS EQUAL keywordOrSymbolic ;
jes2JobParmLINECT : JES2_JOBPARM_LINECT EQUAL keywordOrSymbolic ;
jes2JobParmLINES : JES2_JOBPARM_LINES EQUAL keywordOrSymbolic ;
jes2JobParmNOLOG : JES2_JOBPARM_NOLOG ;
jes2JobParmPAGES : JES2_JOBPARM_PAGES EQUAL keywordOrSymbolic ;
jes2JobParmPROCLIB : JES2_JOBPARM_PROCLIB EQUAL keywordOrSymbolic ;
jes2JobParmRESTART : JES2_JOBPARM_RESTART EQUAL keywordOrSymbolic ;
jes2JobParmROOM : JES2_JOBPARM_ROOM EQUAL keywordOrSymbolic ;
jes2JobParmSYSAFF : JES2_JOBPARM_SYSAFF EQUAL singleOrMultipleValue ;
jes2JobParmTIME : JES2_JOBPARM_TIME EQUAL keywordOrSymbolic ;

jes2MessageStatement : SA JES2_MESSAGE jes2MessageParameter ;

jes2MessageParameter : JES2_MESSAGE_PARM_MSG ;

jes2NetAcctStatement : SA JES2_NETACCT jes2NetAcctParameter ;

jes2NetAcctParameter : JES2_NETACCT_PARM_NUMBER ;

jes2NotifyStatement : SA JES2_NOTIFY jes2NotifyParameter ;

jes2NotifyParameter : JES2_NOTIFY_PARM ;

jes2OutputStatement : SA JES2_OUTPUT jes2OutputParameters* ;

jes2OutputParameters : (jes2OutputCONTINUATION | jes2OutputBURST | jes2OutputCHARS | jes2OutputCKPTLNS | jes2OutputCKPTPGS | jes2OutputCOMPACT | jes2OutputCOPIES | jes2OutputCOPYG | jes2OutputDEST | jes2OutputFCB | jes2OutputFLASH | jes2OutputFLASHC | jes2OutputFORMS | jes2OutputINDEX | jes2OutputLINDEX | jes2OutputLINECT | jes2OutputMODIFY | jes2OutputMODTRC | jes2OutputUCS) ;

jes2OutputCONTINUATION : JES2_OUTPUT_CONTINUATION ;
jes2OutputBURST : JES2_OUTPUT_BURST EQUAL keywordOrSymbolic ;
jes2OutputCHARS : JES2_OUTPUT_CHARS EQUAL singleOrMultipleValue ;
jes2OutputCKPTLNS : JES2_OUTPUT_CKPTLNS EQUAL keywordOrSymbolic ;
jes2OutputCKPTPGS : JES2_OUTPUT_CKPTPGS EQUAL keywordOrSymbolic ;
jes2OutputCOMPACT : JES2_OUTPUT_COMPACT EQUAL keywordOrSymbolic ;
jes2OutputCOPIES : JES2_OUTPUT_COPIES EQUAL singleOrMultipleValue ;
jes2OutputCOPYG : JES2_OUTPUT_COPYG EQUAL singleOrMultipleValue ;
jes2OutputDEST : JES2_OUTPUT_DEST EQUAL singleOrMultipleValue ;
jes2OutputFCB : JES2_OUTPUT_FCB EQUAL keywordOrSymbolic ;
jes2OutputFLASH : JES2_OUTPUT_FLASH EQUAL singleOrMultipleValue ;
jes2OutputFLASHC : JES2_OUTPUT_FLASHC EQUAL keywordOrSymbolic ;
jes2OutputFORMS : JES2_OUTPUT_FORMS EQUAL keywordOrSymbolic ;
jes2OutputINDEX : JES2_OUTPUT_INDEX EQUAL keywordOrSymbolic ;
jes2OutputLINDEX : JES2_OUTPUT_LINDEX EQUAL keywordOrSymbolic ;
jes2OutputLINECT : JES2_OUTPUT_LINECT EQUAL keywordOrSymbolic ;
jes2OutputMODIFY : JES2_OUTPUT_MODIFY EQUAL singleOrMultipleValue ;
jes2OutputMODTRC : JES2_OUTPUT_MODTRC EQUAL keywordOrSymbolic ;
jes2OutputUCS : JES2_OUTPUT_UCS EQUAL keywordOrSymbolic ;

jes2PriorityStatement : SA JES2_PRIORITY jes2PriorityParameter ;

jes2PriorityParameter : JES2_PRIORITY_PARM ;

jes2RouteStatement : SA JES2_ROUTE jes2RouteParameter ;

jes2RouteParameter : (jes2RoutePRINT | jes2RoutePUNCH | jes2RouteXEQ) ;

jes2RoutePRINT : JES2_ROUTE_PRINT JES2_ROUTE_VALUE ;
jes2RoutePUNCH : JES2_ROUTE_PUNCH JES2_ROUTE_VALUE ;
jes2RouteXEQ : JES2_ROUTE_XEQ JES2_ROUTE_VALUE ;

jes2SetupStatement : SA JES2_SETUP keywordOrSymbolic (COMMA keywordOrSymbolic)* ;

jes2SignoffStatement : SA JES2_SIGNOFF ;

jes2SignonStatement : SA JES2_SIGNON 
    JES2_SIGNON_NODE JES2_SIGNON_PASSWORD1? JES2_SIGNON_NEW_PASSWORD? JES2_SIGNON_PASSWORD2? ;

jes2XEQStatement : SA JES2_XEQ JES2_XEQ_NODE ;

jes2XMITStatement : SA JES2_XMIT SYMBOLIC*
    DD_ASTERISK_DATA+
    (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)?
  ;

nullStatement
	: SS
	;

delimiterStatement
	: DELIMITER_STATEMENT
	;

