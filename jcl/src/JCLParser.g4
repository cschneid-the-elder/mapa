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

parser grammar JCLParser;

options {tokenVocab=JCLLexer;}


startRule : jcl | EOF ;

jcl : (execJCL+ SS?) | (procJCL SS?) ;

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

defineSymbolicParameter : PROC_PARM_NAME EQUAL keywordOrSymbolic? ;

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

ddParameter : ddParmACCODE | ddParmAMP | ddParmASTERISK | ddParmAVGREC | ddParmBLKSZLIM | ddParmBURST | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmCOPIES | ddParmDATA | ddParmDATACLAS | ddParmDCB | ddParmDDNAME | ddParmDEST | ddParmDISP | ddParmDLM | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFCB | ddParmFILEDATA | ddParmFLASH | ddParmFREE | ddParmFREEVOL | ddParmGDGORDER | ddParmHOLD | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYOFF | ddParmLABEL | ddParmLGSTREAM | ddParmLIKE | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmNULLOVRD | ddParmOUTLIM | ddParmOUTPUT | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSEP | ddParmSPACE | ddParmSPIN | ddParmSTORCLAS | ddParmSUBSYS | ddParmSYMBOLS | ddParmSYMLIST | ddParmSYSOUT | ddParmTERM | ddParmUCS | ddParmUNIT | ddParmVOLUME | ddParmDCB_Parameter;

ddParmACCODE : ACCODE EQUAL keywordOrSymbolic;
ddParmAMP : AMP EQUAL singleOrMultipleValue ;
ddParmASTERISK : ASTERISK ;
ddParmASTERISK_DATA : DD_ASTERISK_DATA+ (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)? ;
ddParmAVGREC : AVGREC EQUAL keywordOrSymbolic ;
ddParmBFALN : BFALN EQUAL keywordOrSymbolic ;
ddParmBFTEK : BFTEK EQUAL keywordOrSymbolic ;
ddParmBLKSIZE : BLKSIZE EQUAL keywordOrSymbolic ;
ddParmBLKSZLIM : BLKSZLIM EQUAL keywordOrSymbolic ;
ddParmBUFIN : BUFIN EQUAL keywordOrSymbolic ;
ddParmBUFL : BUFL EQUAL keywordOrSymbolic ;
ddParmBUFMAX : BUFMAX EQUAL keywordOrSymbolic ;
ddParmBUFNO : BUFNO EQUAL keywordOrSymbolic ;
ddParmBUFOFF : BUFOFF EQUAL keywordOrSymbolic ;
ddParmBUFOUT : BUFOUT EQUAL keywordOrSymbolic ;
ddParmBUFRQ : BUFRQ EQUAL keywordOrSymbolic ;
ddParmBUFSIZE : BUFSIZE EQUAL keywordOrSymbolic ;
ddParmBURST : BURST EQUAL keywordOrSymbolic ;
ddParmCCSID : CCSID EQUAL keywordOrSymbolic ;
ddParmCHARS : CHARS EQUAL singleOrMultipleValue ;
ddParmCHKPT : CHKPT EQUAL keywordOrSymbolic ;
ddParmCNTL : CNTL EQUAL keywordOrSymbolic ;
ddParmCODE : CODE EQUAL keywordOrSymbolic ;
ddParmCOPIES : COPIES EQUAL singleOrMultipleValue ;
ddParmCPRI : CPRI EQUAL keywordOrSymbolic ;
ddParmCYLOFL : CYLOFL EQUAL keywordOrSymbolic ;
ddParmDATA : DATA ;
ddParmDATACLAS : DATACLAS EQUAL keywordOrSymbolic? ;

/*
At some point in the past, the DCB parameter was the only place you
could specify LRECL and BLKSIZE and RECFM and DEN and, well, all the
other Data Control Block parameters attached to the ddParmDCB_Parameter
token below.

Some time after that, LRECL and BLKSIZE and RECFM became independent
of the DCB parameter.  In the 1990s, maybe?

In writing this grammar I stumbled across a note in the syntax for the
DCB parameter...

  Alternate syntax for DCB keyword subparameters: All of the DCB keyword 
  subparameters can be specified without the need to code DCB=.

...which was a surprise to me.

*/
ddParmDCB : DCB EQUAL (
    ddParmDCB_Parameter | 
    (LPAREN 
        ddParmDCB_Parameter+
    RPAREN) 
  ) ;

ddParmDCB_Parameter : ddParmBFALN | ddParmBFTEK | ddParmBLKSIZE | ddParmBUFIN | ddParmBUFL | ddParmBUFMAX | ddParmBUFNO | ddParmBUFOFF | ddParmBUFOUT | ddParmBUFRQ | ddParmBUFSIZE | ddParmCODE | ddParmCPRI | ddParmCYLOFL | ddParmDEN | ddParmDIAGNS | ddParmDSORG | ddParmEROPT | ddParmFUNC | ddParmGNCP | ddParmHIARCHY | ddParmINTVL | ddParmIPLTXID | ddParmKEYLEN | ddParmLIMCT| ddParmLRECL | ddParmMODE |  ddParmNCP | ddParmNTM | ddParmOPTCD | ddParmPCI | ddParmPRTSP | ddParmRECFM | ddParmRESERVE | ddParmRKP | ddParmSOWA | ddParmSTACK | ddParmTHRESH | ddParmTRTCH | datasetName ;


ddParmDDNAME : DDNAME EQUAL keywordOrSymbolic? ;
ddParmDEN : DEN EQUAL keywordOrSymbolic ;
ddParmDEST : DEST EQUAL  (
    keywordOrSymbolic |
    (LPAREN keywordOrSymbolic RPAREN)
  )
  ;
ddParmDIAGNS : DIAGNS EQUAL keywordOrSymbolic ;
ddParmDISP : DISP EQUAL singleOrMultipleValue ;
ddParmDLM : DLM EQUAL keywordOrSymbolic ;
ddParmDSID : DSID EQUAL singleOrMultipleValue ;
ddParmDSKEYLBL : DSKEYLBL EQUAL keywordOrSymbolic ;
ddParmDSNAME : (DSNAME | DSN) EQUAL datasetName ;
ddParmDSNTYPE : DSNTYPE EQUAL singleOrMultipleValue ;

ddParmDSORG : DSORG EQUAL keywordOrSymbolic ;
ddParmDUMMY : DUMMY ;
ddParmDYNAM : DYNAM ;
ddParmEATTR : EATTR EQUAL keywordOrSymbolic ;
ddParmEROPT : EROPT EQUAL keywordOrSymbolic ;
ddParmEXPDT : EXPDT EQUAL keywordOrSymbolic ;
ddParmFCB : FCB EQUAL singleOrMultipleValue ;
ddParmFILEDATA : FILEDATA EQUAL keywordOrSymbolic ;
ddParmFLASH : FLASH EQUAL singleOrMultipleValue ;
ddParmFREE : FREE EQUAL keywordOrSymbolic ;
ddParmFREEVOL : FREEVOL EQUAL keywordOrSymbolic ;
ddParmFUNC : FUNC EQUAL keywordOrSymbolic ;
ddParmGDGORDER : GDGORDER EQUAL keywordOrSymbolic ;
ddParmGNCP : GNCP EQUAL keywordOrSymbolic ;
/*
HIARCHY is obsolete but probably still tolerated.
syntax: HIARCHY={0|1}
example: DCB=(DSORG=DA,HIARCHY=0)

Whether or not HIARCHY=1 on its own (without an associated DCB=
would be tolerated by JES is currently unknown.
*/
ddParmHIARCHY : HIARCHY EQUAL keywordOrSymbolic ;
ddParmHOLD : HOLD EQUAL keywordOrSymbolic ;
ddParmINTVL : INTVL EQUAL keywordOrSymbolic ;
ddParmIPLTXID : IPLTXID EQUAL keywordOrSymbolic ;
ddParmKEYLABL1 : KEYLABL1 EQUAL keywordOrSymbolic ;
ddParmKEYLABL2 : KEYLABL2 EQUAL keywordOrSymbolic ;
ddParmKEYENCD1 : KEYENCD1 EQUAL keywordOrSymbolic ;
ddParmKEYENCD2 : KEYENCD2 EQUAL keywordOrSymbolic ;
ddParmKEYLEN : KEYLEN EQUAL keywordOrSymbolic ;
ddParmKEYOFF : KEYOFF EQUAL keywordOrSymbolic ;
ddParmLABEL : LABEL EQUAL singleOrMultipleValue ;
/*
It's not really a dataset name in the LGSTREAM parameter, but it
does match the same pattern.
*/
ddParmLGSTREAM : LGSTREAM EQUAL datasetName ;
ddParmLIKE : LIKE EQUAL datasetName ;
ddParmLIMCT: LIMCT EQUAL keywordOrSymbolic ;
ddParmLRECL : LRECL EQUAL keywordOrSymbolic ;
ddParmMAXGENS : MAXGENS EQUAL keywordOrSymbolic ;
ddParmMGMTCLAS : MGMTCLAS EQUAL keywordOrSymbolic? ;
ddParmMODE : MODE EQUAL keywordOrSymbolic ; 
ddParmMODIFY : MODIFY EQUAL singleOrMultipleValue ;
ddParmNCP : NCP EQUAL keywordOrSymbolic ;
ddParmNTM : NTM EQUAL keywordOrSymbolic ;
ddParmNULLOVRD : NULLOVRD ;
ddParmOPTCD : OPTCD EQUAL keywordOrSymbolic ;
ddParmOUTLIM : OUTLIM EQUAL keywordOrSymbolic ;
ddParmOUTPUT : OUTPUT EQUAL singleOrMultipleValue ;
ddParmPATH : PATH EQUAL keywordOrSymbolic ;
ddParmPATHDISP : PATHDISP EQUAL singleOrMultipleValue ;
ddParmPATHMODE : PATHMODE EQUAL singleOrMultipleValue ;
ddParmPATHOPTS : PATHOPTS EQUAL singleOrMultipleValue ;
ddParmPCI : PCI EQUAL singleOrMultipleValue ;
ddParmPROTECT : PROTECT EQUAL keywordOrSymbolic ;
ddParmPRTSP : PRTSP EQUAL keywordOrSymbolic ;
ddParmRECFM : RECFM EQUAL keywordOrSymbolic ;
ddParmRECORG : RECORG EQUAL keywordOrSymbolic ;
ddParmREFDD : REFDD EQUAL keywordOrSymbolic ;
ddParmRESERVE : RESERVE EQUAL parenList ;
ddParmRETPD : RETPD EQUAL keywordOrSymbolic ;
ddParmRKP : RKP EQUAL keywordOrSymbolic ;
ddParmRLS : RLS EQUAL keywordOrSymbolic ;
ddParmROACCESS : ROACCESS EQUAL singleOrMultipleValue ;
ddParmSECMODEL : SECMODEL EQUAL singleOrMultipleValue ;
ddParmSEGMENT : SEGMENT EQUAL keywordOrSymbolic ;
ddParmSEP : SEP EQUAL singleOrMultipleValue ;
ddParmSOWA : SOWA EQUAL keywordOrSymbolic ;
ddParmSPACE : SPACE EQUAL singleOrMultipleValue ; 

ddParmSPIN : SPIN EQUAL singleOrMultipleValue ;

ddParmSTACK : STACK EQUAL keywordOrSymbolic ;
ddParmSTORCLAS : STORCLAS EQUAL keywordOrSymbolic? ;
ddParmSUBSYS : SUBSYS EQUAL singleOrMultipleValue ;

ddParmSYMBOLS : SYMBOLS EQUAL singleOrMultipleValue ;

ddParmSYMLIST : SYMLIST EQUAL singleOrMultipleValue ;
ddParmSYSOUT : SYSOUT EQUAL singleOrMultipleValue ;

ddParmTERM : TERM EQUAL keywordOrSymbolic ;
ddParmTHRESH : THRESH EQUAL keywordOrSymbolic ;
ddParmTRTCH : TRTCH EQUAL keywordOrSymbolic ;
ddParmUCS : UCS EQUAL singleOrMultipleValue ;

ddParmUNIT : UNIT EQUAL 
    singleOrMultipleValue
  ;

ddParmVOLUME : (VOL | VOLUME) EQUAL
    singleOrMultipleValue
  ;



joblibStatement : SS JOBLIB DD joblibParameter+ ;

joblibConcatenation : SS DD joblibParameter+ ;

joblibAmalgamation : joblibStatement joblibConcatenation* ;

joblibParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


syschkStatement : SS SYSCHK DD syschkParameter+ ;

syschkConcatenation : SS DD syschkParameter+ ;

syschkAmalgamation : syschkStatement syschkConcatenation* ;

syschkParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


jobCard : SS jobName JOB (
    jobAccountingInformation+ |
    (LPAREN jobAccountingInformation+ RPAREN)
  )? jobProgrammerName? jobKeywordParameter* ;

jobName : NAME_FIELD ;

jobAccountingInformation : (
    QUOTED_STRING_FRAGMENT+ |
    QS_AMPERSAND+ |
    QS_SQUOTE2+ |
    JOB_ACCT_MODE_UNQUOTED_STRING+
  ) ;
jobProgrammerName : (QUOTED_STRING_PROGRAMMER_NAME+ | JOB_PROGRAMMER_NAME_UNQUOTED_STRING+ | QS_AMPERSAND+ | QS_SQUOTE2+) ;

jobKeywordParameter : jobParmADDRSPC | jobParmBYTES | jobParmCARDS | jobParmCCSID | jobParmCLASS | jobParmCOND | jobParmDSENQSHR | jobParmEMAIL | jobParmGDGBIAS | jobParmGROUP | jobParmJESLOG | jobParmJOBRC | jobParmLINES | jobParmMEMLIMIT | jobParmMSGCLASS | jobParmMSGLEVEL | jobParmNOTIFY | jobParmPAGES | jobParmPASSWORD | jobParmPERFORM | jobParmPRTY | jobParmRD | jobParmREGION | jobParmREGIONX | jobParmRESTART | jobParmROLL | jobParmSECLABEL | jobParmSCHENV | jobParmSYSAFF | jobParmSYSTEM | jobParmTIME | jobParmTYPRUN | jobParmUJOBCORR | jobParmUSER ;

jobParmBYTES : BYTES EQUAL singleOrMultipleValue ;

jobParmCARDS : CARDS EQUAL singleOrMultipleValue ;

jobParmLINES : LINES EQUAL singleOrMultipleValue ;

jobParmPAGES : PAGES EQUAL singleOrMultipleValue ;

jobParmADDRSPC : ADDRSPC EQUAL keywordOrSymbolic ;

jobParmCCSID : CCSID EQUAL keywordOrSymbolic ;

jobParmCLASS : CLASS EQUAL keywordOrSymbolic ;

jobParmCOND : COND EQUAL (
    (LPAREN parenList RPAREN) |
    parenList
  ) ;

jobParmDSENQSHR : DSENQSHR EQUAL keywordOrSymbolic ;

jobParmEMAIL : EMAIL EQUAL keywordOrSymbolic ;

jobParmGDGBIAS : GDGBIAS EQUAL keywordOrSymbolic ;

jobParmGROUP : GROUP EQUAL keywordOrSymbolic ;

jobParmJESLOG : JESLOG EQUAL singleOrMultipleValue ;

jobParmJOBRC : JOBRC EQUAL singleOrMultipleValue ;

jobParmMEMLIMIT : MEMLIMIT EQUAL keywordOrSymbolic ;

jobParmMSGCLASS : MSGCLASS EQUAL keywordOrSymbolic ;

jobParmMSGLEVEL : MSGLEVEL EQUAL singleOrMultipleValue ;

jobParmNOTIFY : NOTIFY EQUAL keywordOrSymbolic ;

nameOrSymbolic : ((NAME (DOT NAME)?) | SYMBOLIC) ;

jobParmPASSWORD : PASSWORD EQUAL singleOrMultipleValue ;

jobParmPERFORM : PERFORM EQUAL keywordOrSymbolic ;

jobParmPRTY : PRTY EQUAL keywordOrSymbolic ;

jobParmRD : RD EQUAL keywordOrSymbolic ;

jobParmREGION : REGION EQUAL keywordOrSymbolic ;

jobParmREGIONX : REGIONX EQUAL singleOrMultipleValue ;

jobParmRESTART : RESTART EQUAL singleOrMultipleValue ;

/*
Per the 1976 OS JCL manual retrieved from bitsavers.org, the ROLL
parameter must be coded with both parameters enclosed in parenthesis
separated by a comma.
*/
jobParmROLL : ROLL EQUAL LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN ;

jobParmSECLABEL : SECLABEL EQUAL keywordOrSymbolic ;

jobParmSCHENV : SCHENV EQUAL keywordOrSymbolic ;

jobParmSYSAFF : SYSAFF EQUAL singleOrMultipleValue ;

jobParmSYSTEM : SYSTEM EQUAL singleOrMultipleValue ;

jobParmTIME : TIME EQUAL singleOrMultipleValue ;

jobParmTYPRUN : TYPRUN EQUAL keywordOrSymbolic ;

jobParmUJOBCORR : UJOBCORR EQUAL keywordOrSymbolic ;

jobParmUSER : USER EQUAL keywordOrSymbolic ;

commandStatement : SS NAME_FIELD COMMAND QUOTED_STRING_FRAGMENT+ ;

jclCommandStatement : SS JCL_COMMAND JCL_COMMAND_PARM ;

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

notifyStatement : SS NAME_FIELD? NOTIFY_OP notifyParms+ ;

notifyParms : notifyEMAIL | notifyUSER | notifyTYPE | notifyWHEN ;
notifyEMAIL : NOTIFY_STMT_PARM_EMAIL EQUAL keywordOrSymbolic ;
notifyUSER : NOTIFY_STMT_PARM_USER EQUAL keywordOrSymbolic ;
notifyTYPE : NOTIFY_STMT_PARM_TYPE EQUAL keywordOrSymbolic ;
notifyWHEN : NOTIFY_STMT_PARM_WHEN EQUAL keywordOrSymbolic ;

outputStatement : SS NAME_FIELD? OUTPUT outputStatementParameter+ ;

outputStatementParameter : outputStatementADDRESS | outputStatementAFPPARMS | outputStatementAFPSTATS | outputStatementBUILDING | outputStatementBURST | outputStatementCHARS | outputStatementCKPTLINE | outputStatementCKPTPAGE | outputStatementCKPTSEC | outputStatementCLASS | outputStatementCOLORMAP | outputStatementCOMPACT | outputStatementCOMSETUP | outputStatementCONTROL | outputStatementCOPIES | outputStatementCOPYCNT | outputStatementDATACK | outputStatementDDNAME | outputStatementDEFAULT | outputStatementDEPT | outputStatementDEST | outputStatementDPAGELBL | outputStatementDUPLEX | outputStatementFCB | outputStatementFLASH | outputStatementFORMDEF | outputStatementFORMLEN | outputStatementFORMS | outputStatementFSSDATA | outputStatementGROUPID | outputStatementINDEX | outputStatementINTRAY | outputStatementJESDS | outputStatementLINDEX | outputStatementLINECT | outputStatementMAILBCC | outputStatementMAILCC | outputStatementMAILFILE | outputStatementMAILFROM | outputStatementMAILTO | outputStatementMERGE | outputStatementMODIFY | outputStatementNAME | outputStatementNOTIFY | outputStatementOFFSETXB | outputStatementOFFSETXF | outputStatementOFFSETYB | outputStatementOFFSETYF | outputStatementOUTBIN | outputStatementOUTDISP | outputStatementOVERLAYB | outputStatementOVERLAYF | outputStatementOVFL | outputStatementPAGEDEF | outputStatementPIMSG | outputStatementPORTNO | outputStatementPRMODE | outputStatementPRTATTRS | outputStatementPRTERROR | outputStatementPRTOPTNS | outputStatementPRTQUEUE | outputStatementPRTY | outputStatementREPLYTO | outputStatementRESFMT | outputStatementRETAINS | outputStatementRETAINF | outputStatementRETRYL | outputStatementRETRYT | outputStatementROOM | outputStatementSYSAREA | outputStatementTHRESHLD | outputStatementTITLE | outputStatementTRC | outputStatementUCS | outputStatementUSERDATA | outputStatementUSERLIB | outputStatementUSERPATH | outputStatementWRITER ;

outputStatementADDRESS : OUTPUT_STMT_ADDRESS EQUAL singleOrMultipleValue ;

outputStatementAFPPARMS : OUTPUT_STMT_AFPPARMS EQUAL datasetName ;
outputStatementAFPSTATS : OUTPUT_STMT_AFPSTATS EQUAL keywordOrSymbolic ;
outputStatementBUILDING : OUTPUT_STMT_BUILDING EQUAL keywordOrSymbolic ;
outputStatementBURST : OUTPUT_STMT_BURST EQUAL keywordOrSymbolic ;
outputStatementCHARS : OUTPUT_STMT_CHARS EQUAL singleOrMultipleValue ;
outputStatementCKPTLINE : OUTPUT_STMT_CKPTLINE EQUAL keywordOrSymbolic ;
outputStatementCKPTPAGE : OUTPUT_STMT_CKPTPAGE EQUAL keywordOrSymbolic ;
outputStatementCKPTSEC : OUTPUT_STMT_CKPTSEC EQUAL keywordOrSymbolic ;
outputStatementCLASS : OUTPUT_STMT_CLASS EQUAL keywordOrSymbolic? ;
outputStatementCOLORMAP : OUTPUT_STMT_COLORMAP EQUAL keywordOrSymbolic ;
outputStatementCOMPACT : OUTPUT_STMT_COMPACT EQUAL keywordOrSymbolic ;
outputStatementCOMSETUP : OUTPUT_STMT_COMSETUP EQUAL keywordOrSymbolic ;
outputStatementCONTROL : OUTPUT_STMT_CONTROL EQUAL keywordOrSymbolic ;
outputStatementCOPIES : OUTPUT_STMT_COPIES EQUAL singleOrMultipleValue ;
outputStatementCOPYCNT : OUTPUT_STMT_COPYCNT EQUAL keywordOrSymbolic ;
outputStatementDATACK : OUTPUT_STMT_DATACK EQUAL keywordOrSymbolic ;
outputStatementDDNAME : OUTPUT_STMT_DDNAME EQUAL keywordOrSymbolic ;
outputStatementDEFAULT : OUTPUT_STMT_DEFAULT EQUAL keywordOrSymbolic ;
outputStatementDEPT : OUTPUT_STMT_DEPT EQUAL keywordOrSymbolic ;
outputStatementDEST : OUTPUT_STMT_DEST EQUAL singleOrMultipleValue ;

outputStatementDPAGELBL : OUTPUT_STMT_DPAGELBL EQUAL keywordOrSymbolic ;
outputStatementDUPLEX : OUTPUT_STMT_DUPLEX EQUAL keywordOrSymbolic ;
outputStatementFCB : OUTPUT_STMT_FCB EQUAL keywordOrSymbolic ;
outputStatementFLASH : OUTPUT_STMT_FLASH EQUAL singleOrMultipleValue ;

outputStatementFORMDEF : OUTPUT_STMT_FORMDEF EQUAL keywordOrSymbolic ;
outputStatementFORMLEN : OUTPUT_STMT_FORMLEN EQUAL keywordOrSymbolic ;
outputStatementFORMS : OUTPUT_STMT_FORMS EQUAL keywordOrSymbolic ;
outputStatementFSSDATA : OUTPUT_STMT_FSSDATA EQUAL keywordOrSymbolic ;
outputStatementGROUPID : OUTPUT_STMT_GROUPID EQUAL keywordOrSymbolic ;
outputStatementINDEX : OUTPUT_STMT_INDEX EQUAL keywordOrSymbolic ;
outputStatementINTRAY : OUTPUT_STMT_INTRAY EQUAL keywordOrSymbolic ;
outputStatementJESDS : OUTPUT_STMT_JESDS EQUAL keywordOrSymbolic ;
outputStatementLINDEX : OUTPUT_STMT_LINDEX EQUAL keywordOrSymbolic ;
outputStatementLINECT : OUTPUT_STMT_LINECT EQUAL keywordOrSymbolic ;
outputStatementMAILBCC : OUTPUT_STMT_MAILBCC EQUAL singleOrMultipleValue ;
outputStatementMAILCC : OUTPUT_STMT_MAILCC EQUAL singleOrMultipleValue ;
outputStatementMAILFILE : OUTPUT_STMT_MAILFILE EQUAL keywordOrSymbolic ;
outputStatementMAILFROM : OUTPUT_STMT_MAILFROM EQUAL keywordOrSymbolic ;
outputStatementMAILTO : OUTPUT_STMT_MAILTO EQUAL singleOrMultipleValue ;
outputStatementMERGE : OUTPUT_STMT_MERGE EQUAL keywordOrSymbolic ;
outputStatementMODIFY : OUTPUT_STMT_MODIFY EQUAL singleOrMultipleValue ;
outputStatementNAME : OUTPUT_STMT_NAME EQUAL keywordOrSymbolic ;
outputStatementNOTIFY : OUTPUT_STMT_NOTIFY EQUAL singleOrMultipleValue ;
outputStatementOFFSETXB : OUTPUT_STMT_OFFSETXB EQUAL keywordOrSymbolic ;
outputStatementOFFSETXF : OUTPUT_STMT_OFFSETXF EQUAL keywordOrSymbolic ;
outputStatementOFFSETYB : OUTPUT_STMT_OFFSETYB EQUAL keywordOrSymbolic ;
outputStatementOFFSETYF : OUTPUT_STMT_OFFSETYF EQUAL keywordOrSymbolic ;
outputStatementOUTBIN : OUTPUT_STMT_OUTBIN EQUAL keywordOrSymbolic ;
outputStatementOUTDISP : OUTPUT_STMT_OUTDISP EQUAL singleOrMultipleValue ;
outputStatementOVERLAYB : OUTPUT_STMT_OVERLAYB EQUAL keywordOrSymbolic ;
outputStatementOVERLAYF : OUTPUT_STMT_OVERLAYF EQUAL keywordOrSymbolic ;
outputStatementOVFL : OUTPUT_STMT_OVFL EQUAL keywordOrSymbolic ;
outputStatementPAGEDEF : OUTPUT_STMT_PAGEDEF EQUAL keywordOrSymbolic ;
outputStatementPIMSG : OUTPUT_STMT_PIMSG EQUAL singleOrMultipleValue ;
outputStatementPORTNO : OUTPUT_STMT_PORTNO EQUAL keywordOrSymbolic ;
outputStatementPRMODE : OUTPUT_STMT_PRMODE EQUAL keywordOrSymbolic ;
outputStatementPRTATTRS : OUTPUT_STMT_PRTATTRS EQUAL keywordOrSymbolic ;
outputStatementPRTERROR : OUTPUT_STMT_PRTERROR EQUAL keywordOrSymbolic ;
outputStatementPRTOPTNS : OUTPUT_STMT_PRTOPTNS EQUAL keywordOrSymbolic ;
outputStatementPRTQUEUE : OUTPUT_STMT_PRTQUEUE EQUAL keywordOrSymbolic ;
outputStatementPRTY : OUTPUT_STMT_PRTY EQUAL keywordOrSymbolic ;
outputStatementREPLYTO : OUTPUT_STMT_REPLYTO EQUAL keywordOrSymbolic ;
outputStatementRESFMT : OUTPUT_STMT_RESFMT EQUAL keywordOrSymbolic ;
outputStatementRETAINS : OUTPUT_STMT_RETAINS EQUAL keywordOrSymbolic ;
outputStatementRETAINF : OUTPUT_STMT_RETAINF EQUAL keywordOrSymbolic ;
outputStatementRETRYL : OUTPUT_STMT_RETRYL EQUAL keywordOrSymbolic ;
outputStatementRETRYT : OUTPUT_STMT_RETRYT EQUAL keywordOrSymbolic ;
outputStatementROOM : OUTPUT_STMT_ROOM EQUAL keywordOrSymbolic ;
outputStatementSYSAREA : OUTPUT_STMT_SYSAREA EQUAL keywordOrSymbolic ;
outputStatementTHRESHLD : OUTPUT_STMT_THRESHLD EQUAL keywordOrSymbolic ;
outputStatementTITLE : OUTPUT_STMT_TITLE EQUAL keywordOrSymbolic ;
outputStatementTRC : OUTPUT_STMT_TRC EQUAL keywordOrSymbolic ;
outputStatementUCS : OUTPUT_STMT_UCS EQUAL keywordOrSymbolic ;
outputStatementUSERDATA : OUTPUT_STMT_USERDATA EQUAL singleOrMultipleValue ;

outputStatementUSERLIB : OUTPUT_STMT_USERLIB EQUAL singleOrMultipleValue ;

outputStatementUSERPATH : OUTPUT_STMT_USERPATH EQUAL singleOrMultipleValue ;

outputStatementWRITER : OUTPUT_STMT_WRITER EQUAL keywordOrSymbolic ;

pendStatement : SS NAME_FIELD? PEND inlineComment? ;

scheduleStatement : SS NAME_FIELD? SCHEDULE scheduleParameters* ;

scheduleParameters : (scheduleParmAFTER | scheduleParmBEFORE | scheduleParmDELAY | scheduleParmHOLDUNTIL | scheduleParmJOBGROUP | scheduleParmSTARTBY | scheduleParmWITH) ;

scheduleParmAFTER : SCHEDULE_PARM_AFTER EQUAL keywordOrSymbolic ;
scheduleParmBEFORE : SCHEDULE_PARM_BEFORE EQUAL keywordOrSymbolic  ;
scheduleParmDELAY : SCHEDULE_PARM_DELAY EQUAL keywordOrSymbolic  ;
scheduleParmHOLDUNTIL : SCHEDULE_PARM_HOLDUNTIL EQUAL singleOrMultipleValue ;
scheduleParmJOBGROUP : SCHEDULE_PARM_JOBGROUP EQUAL keywordOrSymbolic  ;
scheduleParmSTARTBY : SCHEDULE_PARM_STARTBY EQUAL singleOrMultipleValue ;
scheduleParmWITH : SCHEDULE_PARM_WITH EQUAL keywordOrSymbolic  ;

setStatement : SS NAME_FIELD? SET setOperation+ ;

setOperation : (SET_PARM_NAME EQUAL keywordOrSymbolic?) ;

xmitStatement : SS NAME_FIELD? XMIT xmitParameters* ddParmASTERISK_DATA* ;

xmitParameters : (xmitParmDEST | xmitParmDLM | xmitParmSUBCHARS | commentStatement) ;

xmitParmDEST : DEST EQUAL keywordOrSymbolic ;

xmitParmDLM : DLM EQUAL keywordOrSymbolic ;

xmitParmSUBCHARS : SUBCHARS EQUAL keywordOrSymbolic ;

jesExecutionControlStatements : (jobGroupStatement | gJobStatement | jobSetStatement | sJobStatement | endSetStatement | endGroupStatement | afterStatement | beforeStatement | concurrentStatement)* ;

jobGroupStatement : SS NAME_FIELD? JOBGROUP_OP LPAREN? jobGroupAccountingInformation? RPAREN? jobGroupProgrammerName? jobGroupParameters* ;

jobGroupAccountingString : (QUOTED_STRING_FRAGMENT+ | QS_AMPERSAND+ | QS_SQUOTE2+ | JOBGROUP_ACCT_UNQUOTED_STRING+) ;

jobGroupAccountingInformation : jobGroupAccountingInformationSimple | jobGroupAccountingInformationMultiLine ;

jobGroupAccountingInformationSimple : jobGroupAccountingString+ ;
jobGroupAccountingInformationMultiLine : jobGroupAccountingString (COMMA jobGroupAccountingString)* ;
jobGroupProgrammerName : (QUOTED_STRING_PROGRAMMER_NAME+ | QS_AMPERSAND+ | QS_SQUOTE2+ | JOBGROUP_PROGRAMMER_NAME_UNQUOTED_STRING+) ;

jobGroupParameters : (jobGroupEMAIL | jobGroupOWNER | jobGroupGROUP | jobGroupPASSWORD | jobGroupSECLABEL | jobGroupTYPE | jobGroupHOLD | jobGroupERROR | jobGroupONERROR | jobGroupSYSAFF | jobGroupSYSTEM | jobGroupSCHENV) ;

jobGroupEMAIL : JOBGROUP_EMAIL EQUAL keywordOrSymbolic ;
jobGroupOWNER : JOBGROUP_OWNER EQUAL keywordOrSymbolic ;
jobGroupGROUP : JOBGROUP_GROUP EQUAL keywordOrSymbolic ;
jobGroupPASSWORD : JOBGROUP_PASSWORD EQUAL keywordOrSymbolic ;
jobGroupSECLABEL : JOBGROUP_SECLABEL EQUAL keywordOrSymbolic ;
jobGroupTYPE : JOBGROUP_TYPE EQUAL keywordOrSymbolic ;
jobGroupHOLD : JOBGROUP_HOLD EQUAL keywordOrSymbolic ;

jobGroupERROR : JOBGROUP_ERROR EQUAL jobGroupCondition ;

jobGroupCondition :
    LPAREN*
      NOT_SYMBOL* jobGroupERROR_Test 
        (JOBGROUP_ERROR_LOGICAL NOT_SYMBOL* LPAREN* jobGroupERROR_Test RPAREN*)*
    RPAREN*
  ;
jobGroupERROR_RelOp : (
    JOBGROUP_ERROR_EQ | 
    JOBGROUP_ERROR_GE | 
    JOBGROUP_ERROR_LE | 
    JOBGROUP_ERROR_NE | 
    JOBGROUP_ERROR_NG | 
    JOBGROUP_ERROR_NL | 
    JOBGROUP_ERROR_GT | 
    JOBGROUP_ERROR_LT
  ) ;
jobGroupERROR_Keyword : (ABEND | ABENDCC | RUN | RC) ;
jobGroupERROR_Test : NOT_SYMBOL* jobGroupERROR_Keyword
    (NOT_SYMBOL* jobGroupERROR_RelOp (FALSE | TRUE | NUM_LIT | ALNUMNAT))? ;

jobGroupONERROR : JOBGROUP_ONERROR EQUAL keywordOrSymbolic ;
jobGroupSYSAFF : JOBGROUP_SYSAFF EQUAL keywordOrSymbolic ;
jobGroupSYSTEM : JOBGROUP_SYSTEM EQUAL keywordOrSymbolic ;
jobGroupSCHENV : JOBGROUP_SCHENV EQUAL keywordOrSymbolic ;

gJobStatement : SS NAME_FIELD? GJOB_OP gJobParameters ;

gJobParameters : (gJobFLUSHTYP) ;

gJobFLUSHTYP : GJOB_PARM_FLUSHTYP EQUAL keywordOrSymbolic ;

jobSetStatement : SS NAME_FIELD? JOBSET_OP jobSetParameters ;

jobSetParameters : (jobSetFLUSHTYP) ;

jobSetFLUSHTYP : JOBSET_PARM_FLUSHTYP EQUAL keywordOrSymbolic ;

sJobStatement : SS NAME_FIELD? SJOB_OP ;

endSetStatement : SS NAME_FIELD? ENDSET_OP ;

endGroupStatement : SS NAME_FIELD? ENDGROUP_OP ;

afterStatement : SS AFTER_OP afterParameters+ ;

afterParameters : (afterNAME | afterACTION | afterOTHERWISE | afterWHEN) ;

afterNAME : AFTER_PARM_NAME EQUAL singleOrMultipleValue ;
afterACTION : AFTER_PARM_ACTION EQUAL keywordOrSymbolic ;
afterOTHERWISE : AFTER_PARM_OTHERWISE EQUAL keywordOrSymbolic ;
afterWHEN : AFTER_PARM_WHEN EQUAL jobGroupCondition ;

beforeStatement : SS BEFORE_OP beforeParameters+ ;

beforeParameters : (beforeNAME | beforeACTION | beforeOTHERWISE | beforeWHEN) ;

beforeNAME : BEFORE_PARM_NAME EQUAL singleOrMultipleValue ;
beforeACTION : BEFORE_PARM_ACTION EQUAL keywordOrSymbolic ;
beforeOTHERWISE : BEFORE_PARM_OTHERWISE EQUAL keywordOrSymbolic ;
beforeWHEN : BEFORE_PARM_WHEN EQUAL jobGroupCondition ;

concurrentStatement : SS CONCURRENT_OP concurrentParameters+ ;

concurrentParameters : (concurrentNAME) ;

concurrentNAME : CONCURRENT_PARM_NAME EQUAL singleOrMultipleValue ;

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
/*parenList : (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)* RPAREN) ;*/
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

jes2XMITStatement : SA JES2_XMIT JES2_XMIT_NODE
    (DLM EQUAL keywordOrSymbolic)?
    DD_ASTERISK_DATA+
    (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)?
  ;

nullStatement
	: SS
	;

delimiterStatement
	: DELIMITER_STATEMENT
	;

