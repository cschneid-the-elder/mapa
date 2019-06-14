/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.
*/

/*
Comments complicate this grammar, comments and my desire to retain
them.  The easiest thing to do with comments is route them to
channel(HIDDEN) but my experience is that comments in JCL can be
very useful so I went through the effort to keep them around.

*/

parser grammar JCLParser;

options {tokenVocab=JCLLexer;}


startRule : jcl | EOF ;

jcl : execJCL+ | proc+ ;

execJCL : (jobCard (commentStatement | execStatement | ddStatement)+)+ ;

commentStatement : COMMENT_FLAG (COMMENT_TEXT | EOF) ;

execStatement : SS stepName? EXEC ((PGM EQUAL) | (PROC_EX EQUAL))? NAME_EX (((COMMA | inlineComment) SS?)? execParameter inlineComment?)* ;

/*
Some of the parameters for the EXEC statement are identical to those
of the JOB statement.  I'm duplicating them on the theory that they
are only identical _now_ and may change. It's pretty easy to see which
they are - the upper case part of the name is the same.  Except for 
the COND parameter, which is in fact different.
*/
execParameter : execParmACCT | execParmADDRSPC | execParmCCSID | execParmCOND | execParmDYNAMNBR | execParmMEMLIMIT | execParmPARM | execParmPARMDD | execParmPERFORM | execParmRD | execParmREGION | execParmREGIONX | execParmRLSTMOUT | execParmTIME | execParmTVSMSG | execParmTVSAMCOM ;

execParmACCT : ACCT (DOT NAME)? EQUAL jobAccountingInformation ;

execParmADDRSPC : ADDRSPC EQUAL (REAL | VIRT) ;

execParmCCSID : CCSID EQUAL NUM_LIT ;

execParmCOND : COND EQUAL 
    (EVEN | 
     ONLY | 
        (LPAREN? 
            LPAREN NUM_LIT COMMA COND_OP (COMMA NAME)? RPAREN 
                ((COMMA? LPAREN NUM_LIT COMMA COND_OP (COMMA NAME)? RPAREN) | 
                 (COMMA? EVEN) | 
                 (COMMA? ONLY) |
                 (inlineComment? SS)
                )* RPAREN?
        )
    )
 ;

execParmDYNAMNBR : DYNAMNBR (DOT NAME)? EQUAL NUM_LIT ;

execParmMEMLIMIT : MEMLIMIT EQUAL ((NUM_LIT MEM_UNIT) | NOLIMIT) ;

execParmPARM : PARM EQUAL (SIMPLE_STRING | QUOTED_STRING | SYMBOLIC) ;

execParmPARMDD : PARMDD EQUAL NAME ;

execParmPERFORM : PERFORM EQUAL NUM_LIT ;

execParmRD : RD EQUAL RD_VALUE ; 

execParmREGION : REGION EQUAL NUM_LIT MEM_UNIT ;

execParmREGIONX : REGIONX EQUAL LPAREN? NUM_LIT MEM_UNIT (COMMA NUM_LIT MEM_UNIT) RPAREN? ;

execParmRLSTMOUT : RLSTMOUT EQUAL NUM_LIT ;

execParmTIME : TIME EQUAL LPAREN? (NOLIMIT | MAXIMUM | FOURTEENFORTY | (NUM_LIT (COMMA NUM_LIT)?)) RPAREN? ;

execParmTVSMSG : TVSMSG EQUAL (COMMIT | BACKOUT | ALL) ;

execParmTVSAMCOM : TVSAMCOM EQUAL LPAREN NUM_LIT COMMA NUM_LIT RPAREN ;

ddStatement : SS ddName? DD ddParameter (((COMMA | inlineComment) SS?)? ddParameter inlineComment?)* ddParmASTERISK_DATA* ;

ddName : NAME_FIELD (DOT NAME_FIELD)? ;
ddParameter : ddParmACCODE | ddParmAMP | ddParmASTERISK | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmBURST | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmCOPIES | ddParmDATA | ddParmDATACLAS | ddParmDCB | ddParmDDNAME | ddParmDEST | ddParmDISP | ddParmDLM | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFCB | ddParmFILEDATA | ddParmFLASH | ddParmFREE | ddParmFREEVOL | ddParmGDGORDER | ddParmHOLD | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLGSTREAM | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmOUTLIM | ddParmOUTPUT | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSPIN | ddParmSTORCLAS | ddParmSUBSYS | ddParmSYMBOLS | ddParmSYMLIST | ddParmSYSOUT | ddParmTERM | ddParmUCS | ddParmUNIT | ddParmVOLUME ;

ddParmACCODE : ACCODE EQUAL (SIMPLE_STRING | QUOTED_STRING);
ddParmAMP : AMP EQUAL 
    (LPAREN 
        (QUOTED_STRING ((COMMA | inlineComment) SS QUOTED_STRING))* |
        (SQUOTE 
            ddParmAMP_Parameter 
                ((COMMA ddParmAMP_Parameter) | 
                 (SQUOTE (inlineComment | COMMA) SS SQUOTE ddParmAMP_Parameter))* 
        SQUOTE) 
    RPAREN) ;
ddParmASTERISK : ASTERISK ;
ddParmASTERISK_DATA : DD_ASTERISK_DATA+ (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)? ;
ddParmAVGREC : AVGREC EQUAL AVGREC_UNIT ;
ddParmBLKSIZE : BLKSIZE EQUAL NUM_LIT MEM_UNIT? ;
ddParmBLKSZLIM : BLKSZLIM EQUAL NUM_LIT MEM_UNIT? ;
ddParmBURST : BURST EQUAL (Y_ | YES_ | N_ | NO_) ;
ddParmCCSID : CCSID EQUAL NUM_LIT ;
ddParmCHARS : CHARS EQUAL LPAREN? (ALNUMNAT4 | DUMP) (COMMA ALNUMNAT4)* RPAREN? ;
ddParmCHKPT : CHKPT EQUAL EOV ;
ddParmCNTL : CNTL EQUAL ASTERISK DOT NAME (DOT NAME)? (DOT NAME)?;
ddParmCOPIES : COPIES EQUAL (NUM_LIT | 
                   (LPAREN NUM_LIT 
                       (COMMA LPAREN NUM_LIT (COMMA NUM_LIT)* RPAREN)? 
                   RPAREN)) ;
ddParmDATA : DATA ;
ddParmDATACLAS : DATACLAS EQUAL NAME ;
ddParmDCB : DCB EQUAL ddParmDCB_Parameter | 
    (LPAREN 
        ddParmDCB_Parameter 
            ((COMMA ddParmDCB_Parameter) |
            (inlineComment SS ddParmDCB_Parameter))*
    RPAREN);

ddParmDCB_Parameter : ddParmDCB_BFALN | ddParmDCB_BFTEK | ddParmDCB_BLKSIZE | ddParmDCB_BUFIN | ddParmDCB_BUFL | ddParmDCB_BUFMAX | ddParmDCB_BUFNO | ddParmDCB_BUFOFF | ddParmDCB_BUFOUT | ddParmDCB_BUFSIZE | ddParmDCB_CPRI | ddParmDCB_CYLOFL | ddParmDCB_DEN | ddParmDCB_DIAGNS | ddParmDCB_DSORG | ddParmDCB_EROPT | ddParmDCB_FUNC | ddParmDCB_GNCP | ddParmDCB_INTVL | ddParmDCB_IPLTXID | ddParmDCB_KEYLEN | ddParmDCB_LIMCT| ddParmDCB_LRECL | ddParmDCB_MODE |  ddParmDCB_NCP | ddParmDCB_NTM | ddParmDCB_OPTCD | ddParmDCB_PCI | ddParmDCB_PRTSP | ddParmDCB_RECFM | ddParmDCB_RESERVE | ddParmDCB_RKP | ddParmDCB_STACK | ddParmDCB_THRESH | ddParmDCB_TRTCH ;

ddParmDCB_BFALN : BFALN EQUAL ALPHA ;
ddParmDCB_BFTEK : BFTEK EQUAL ALPHA ;
ddParmDCB_BLKSIZE : BLKSIZE EQUAL NUM_LIT MEM_UNIT? ;
ddParmDCB_BUFIN : BUFIN EQUAL NUM_LIT ;
ddParmDCB_BUFL : BUFL EQUAL NUM_LIT ;
ddParmDCB_BUFMAX : BUFMAX EQUAL NUM_LIT ;
ddParmDCB_BUFNO : BUFNO EQUAL NUM_LIT ;
ddParmDCB_BUFOFF : BUFOFF EQUAL (NUM_LIT | ALPHA) ;
ddParmDCB_BUFOUT : BUFOUT EQUAL NUM_LIT ;
ddParmDCB_BUFSIZE : BUFSIZE EQUAL NUM_LIT ;
ddParmDCB_CPRI : CPRI EQUAL ALPHA ;
ddParmDCB_CYLOFL : CYLOFL EQUAL NUM_LIT ;
ddParmDCB_DEN : DEN EQUAL NUM_LIT ;
ddParmDCB_DIAGNS : DIAGNS EQUAL TRACE ;
ddParmDCB_DSORG : DSORG EQUAL ALPHA+ ;
ddParmDCB_EROPT : EROPT EQUAL ALPHA+ ;
ddParmDCB_FUNC : FUNC EQUAL ALPHA ;
ddParmDCB_GNCP : GNCP EQUAL NUM_LIT ;
ddParmDCB_INTVL : INTVL EQUAL NUM_LIT ;
ddParmDCB_IPLTXID : IPLTXID EQUAL NAME ;
ddParmDCB_KEYLEN : KEYLEN EQUAL NUM_LIT ;
ddParmDCB_LIMCT: LIMCT EQUAL NUM_LIT ;
ddParmDCB_LRECL : LRECL EQUAL NUM_LIT ;
ddParmDCB_MODE : MODE EQUAL MODE_PARMS ; 
ddParmDCB_NCP : NCP EQUAL NUM_LIT ;
ddParmDCB_NTM : NTM EQUAL NUM_LIT ;
ddParmDCB_OPTCD : OPTCD EQUAL ALPHA+ ;
ddParmDCB_PCI : PCI EQUAL LPAREN? ALPHA (COMMA ALPHA)? RPAREN ;
ddParmDCB_PRTSP : PRTSP EQUAL NUM_LIT ;
ddParmDCB_RECFM : RECFM EQUAL ALPHA+ ;
ddParmDCB_RESERVE : RESERVE EQUAL LPAREN NUM_LIT COMMA NUM_LIT RPAREN ;
ddParmDCB_RKP : RKP EQUAL NUM_LIT ;
ddParmDCB_STACK : STACK EQUAL NUM_LIT ;
ddParmDCB_THRESH : THRESH EQUAL NUM_LIT ;
ddParmDCB_TRTCH : TRTCH EQUAL ALPHA+ ;

ddParmDDNAME : DDNAME ;
ddParmDEST : DEST ;
ddParmDISP : DISP EQUAL LPAREN? ddParmDISP_STATUS? COMMA? ddParmDISP_NORMAL_TERM? COMMA? ddParmDISP_ABNORMAL_TERM? RPAREN? ;
ddParmDISP_STATUS : MOD | NEW | OLD | SHR | SYMBOLIC ;
ddParmDISP_NORMAL_TERM : CATLG | DELETE | KEEP | PASS | UNCATLG | SYMBOLIC ;
ddParmDISP_ABNORMAL_TERM : CATLG | DELETE | KEEP | PASS | UNCATLG | SYMBOLIC ;
ddParmDLM : DLM EQUAL DLM_VAL ;
ddParmDSID : DSID ;
ddParmDSKEYLBL : DSKEYLBL ;
ddParmDSNAME : (DSNAME | DSN) EQUAL DATASET_NAME ;
ddParmDSNTYPE : DSNTYPE ;
ddParmDUMMY : DUMMY ;
ddParmDYNAM : DYNAM ;
ddParmEATTR : EATTR ;
ddParmEXPDT : EXPDT ;
ddParmFCB : FCB ;
ddParmFILEDATA : FILEDATA ;
ddParmFLASH : FLASH ;
ddParmFREE : FREE ;
ddParmFREEVOL : FREEVOL ;
ddParmGDGORDER : GDGORDER ;
ddParmHOLD : HOLD ;
ddParmKEYLABL1 : KEYLABL1 ;
ddParmKEYLABL2 : KEYLABL2 ;
ddParmKEYENCD1 : KEYENCD1 ;
ddParmKEYENCD2 : KEYENCD2 ;
ddParmKEYLEN : KEYLEN ;
ddParmKEYOFF : KEYOFF ;
ddParmLABEL : LABEL ;
ddParmLGSTREAM : LGSTREAM ;
ddParmLIKE : LIKE ;
ddParmLRECL : LRECL ;
ddParmMAXGENS : MAXGENS ;
ddParmMGMTCLAS : MGMTCLAS ;
ddParmMODIFY : MODIFY ;
ddParmOUTLIM : OUTLIM ;
ddParmOUTPUT : OUTPUT ;
ddParmPATH : PATH ;
ddParmPATHDISP : PATHDISP ;
ddParmPATHMODE : PATHMODE ;
ddParmPATHOPTS : PATHOPTS ;
ddParmPROTECT : PROTECT ;
ddParmRECFM : RECFM ;
ddParmRECORG : RECORG ;
ddParmREFDD : REFDD ;
ddParmRETPD : RETPD ;
ddParmRLS : RLS ;
ddParmROACCESS : ROACCESS ;
ddParmSECMODEL : SECMODEL ;
ddParmSEGMENT : SEGMENT ;
ddParmSPACE : SPACE ;
ddParmSPIN : SPIN ;
ddParmSTORCLAS : STORCLAS ;
ddParmSUBSYS : SUBSYS ;
ddParmSYMBOLS : SYMBOLS ;
ddParmSYMLIST : SYMLIST ;
ddParmSYSOUT : SYSOUT ;
ddParmTERM : TERM ;
ddParmUCS : UCS ;
ddParmUNIT : UNIT ;
ddParmVOLUME : VOLUME ;

ddParmAMP_Parameter : ddParmAMP_ACCBIAS | ddParmAMP_AMORG | ddParmAMP_BUFND | ddParmAMP_BUFNI | ddParmAMP_BUFSP | ddParmAMP_CROPS | ddParmAMP_FRLOG | ddParmAMP_MSG | ddParmAMP_OPTCD | ddParmAMP_RECFM | ddParmAMP_RMODE31 | ddParmAMP_SMBDFR | ddParmAMP_SMBHWT | ddParmAMP_SMBVSP | ddParmAMP_SMBVSPI | ddParmAMP_STRNO | ddParmAMP_SYNAD | ddParmAMP_TRACE ;

ddParmAMP_ACCBIAS : ACCBIAS EQUAL (USER | SYSTEM | DO | DW | SO | SW) ;
ddParmAMP_AMORG : AMORG ;
ddParmAMP_BUFND : BUFND EQUAL NUM_LIT ;
ddParmAMP_BUFNI : BUFNI EQUAL NUM_LIT ;
ddParmAMP_BUFSP : BUFSP EQUAL NUM_LIT ;
ddParmAMP_CROPS : CROPS EQUAL (RCK | NCK | NRE | NRC) ;
ddParmAMP_FRLOG : FRLOG EQUAL (NONE | REDO) ;
ddParmAMP_MSG : MSG EQUAL SMBBIAS ;
ddParmAMP_OPTCD : ddParmDCB_OPTCD ;
ddParmAMP_RECFM : ddParmDCB_RECFM ;
ddParmAMP_RMODE31 : RMODE31 EQUAL (ALL | BUFF | CB | NONE) ;
ddParmAMP_SMBDFR : SMBDFR EQUAL ALPHA ;
ddParmAMP_SMBHWT : SMBHWT EQUAL NUM_LIT ;
ddParmAMP_SMBVSP : SMBVSP EQUAL NUM_LIT MEM_UNIT ;
ddParmAMP_SMBVSPI : SMBVSPI EQUAL NUM_LIT MEM_UNIT ;
ddParmAMP_STRNO : STRNO EQUAL NUM_LIT;
ddParmAMP_SYNAD : SYNAD EQUAL NAME;

/*

https://www.ibm.com/support/knowledgecenter/SSLTBW_2.3.0/com.ibm.zos.v2r3.idar100/subprmtr.htm

The syntax for the TRACE subparameter of the AMP parameter of the DD statement
took a bit of digging to locate, so I'm recording the url here.  The vernacular 
would be...

Home > z/OS 2.3.0 > z/OS DFSMS > z/OS DFSMSdfp Diagnosis > VSAM diagnostic aids > VSAM record management (R/M) diagnostic aids > VSAM record management trace facility (non-RLS access) > Starting the record management trace function > Subparameters for trace

...for the future, when z/OS 2.3 documentation drops off the back of the stove.

*/
ddParmAMP_TRACE : TRACE EQUAL LPAREN SQUOTE ddParmAMP_TRACE_Parameter ((COMMA ddParmAMP_TRACE_Parameter) | (SQUOTE (inlineComment | COMMA) SS SQUOTE ddParmAMP_TRACE_Parameter))* SQUOTE RPAREN ;

ddParmAMP_TRACE_Parameter : ddParmAMP_TRACE_HOOK | ddParmAMP_TRACE_ECODE | ddParmAMP_TRACE_KEY | ddParmAMP_TRACE_PARM1 | ddParmAMP_TRACE_PARM2 ;

ddParmAMP_TRACE_HOOK : HOOK EQUAL LPAREN NUM_LIT (COMMA NUM_LIT)* RPAREN ;
ddParmAMP_TRACE_ECODE : ECODE EQUAL (ANY | NUM_LIT) ;
ddParmAMP_TRACE_KEY : KEY EQUAL SIMPLE_STRING ;
ddParmAMP_TRACE_PARM1 : PARM1 EQUAL SIMPLE_STRING ;
ddParmAMP_TRACE_PARM2 : PARM2 EQUAL SIMPLE_STRING ;

//jobCard : SS jobName JOB LPAREN? jobAccountingInformation* RPAREN? (COMMA (NEWLINE SS CONTINUATION_WS)? jobKeywordParameter)* ;
jobCard : SS jobName JOB LPAREN? jobAccountingInformation? RPAREN? inlineComment? (COMMA jobProgrammerName)? inlineComment? (((COMMA | inlineComment) SS?)? jobKeywordParameter inlineComment?)* ;

jobName : NAME_FIELD ;

jobProgrammerName : QUOTED_STRING | SIMPLE_STRING | NUM_LIT | NAME ;

jobAccountingInformation : jobAccountingInformationSimple | jobAccountingInformationMultiLine ;

jobAccountingInformationSimple : (QUOTED_STRING | SIMPLE_STRING | NUM_LIT | NAME) (COMMA (QUOTED_STRING | SIMPLE_STRING | NUM_LIT | NAME))* ;

jobAccountingInformationMultiLine : (QUOTED_STRING | SIMPLE_STRING | NUM_LIT | NAME) ((COMMA SS?)? (QUOTED_STRING | SIMPLE_STRING | NUM_LIT | NAME))* ;

jobKeywordParameter : jobParmADDRSPC | jobParmBYTES | jobParmCARDS | jobParmCCSID | jobParmCLASS | jobParmCOND | jobParmDSENQSHR | jobParmEMAIL | jobParmGDGBIAS | jobParmGROUP | jobParmJESLOG | jobParmJOBRC | jobParmLINES | jobParmMEMLIMIT | jobParmMSGCLASS | jobParmMSGLEVEL | jobParmNOTIFY | jobParmPAGES | jobParmPASSWORD | jobParmPERFORM | jobParmPRTY | jobParmRD | jobParmREGION | jobParmREGIONX | jobParmRESTART | jobParmSECLABEL | jobParmSCHENV | jobParmSYSAFF | jobParmSYSTEM | jobParmTIME | jobParmTYPRUN | jobParmUJOBCORR | jobParmUSER ;

jobParmBYTES : BYTES EQUAL (NUM_LIT | (LPAREN NUM_LIT (COMMA OUTPUT_LIMIT_OPTION)? RPAREN)) ;

jobParmCARDS : CARDS EQUAL (NUM_LIT | (LPAREN NUM_LIT (COMMA OUTPUT_LIMIT_OPTION)? RPAREN)) ;

jobParmLINES : LINES EQUAL (NUM_LIT | (LPAREN NUM_LIT (COMMA OUTPUT_LIMIT_OPTION)? RPAREN)) ;

jobParmPAGES : PAGES EQUAL (NUM_LIT | (LPAREN NUM_LIT (COMMA OUTPUT_LIMIT_OPTION)? RPAREN)) ;

jobParmADDRSPC : ADDRSPC EQUAL (REAL | VIRT) ;

jobParmCCSID : CCSID EQUAL NUM_LIT ;

jobParmCLASS : CLASS EQUAL CLASS_VAL ;

jobParmCOND : COND EQUAL LPAREN? LPAREN NUM_LIT COMMA COND_OP RPAREN (COMMA LPAREN NUM_LIT COMMA COND_OP RPAREN)* RPAREN? ;

jobParmDSENQSHR : DSENQSHR EQUAL (DISALLOW | USEJC | ALLOW) ;

jobParmEMAIL : EMAIL EQUAL SIMPLE_STRING ;

jobParmGDGBIAS : GDGBIAS EQUAL (JOB | STEP) ;

jobParmGROUP : GROUP EQUAL NAME ;

jobParmJESLOG : JESLOG EQUAL (SPIN | NOSPIN | SUPPRESS) ;

jobParmJOBRC : JOBRC EQUAL (MAXRC | LASTRC | (LPAREN STEP COMMA NAME (DOT NAME)? RPAREN)) ;

jobParmMEMLIMIT : MEMLIMIT EQUAL ((NUM_LIT MEM_UNIT) | NOLIMIT) ;

jobParmMSGCLASS : MSGCLASS EQUAL ALPHA ;

jobParmMSGLEVEL : MSGLEVEL EQUAL LPAREN? NUM_LIT (COMMA NUM_LIT)? RPAREN? ;

jobParmNOTIFY : NOTIFY EQUAL NAME (DOT NAME)? ;

jobParmPASSWORD : PASSWORD EQUAL LPAREN? NAME (COMMA NAME)? RPAREN? ;

jobParmPERFORM : PERFORM EQUAL NUM_LIT ;

jobParmPRTY : PRTY EQUAL NUM_LIT ;

jobParmRD : RD EQUAL RD_VALUE ;

jobParmREGION : REGION EQUAL NUM_LIT MEM_UNIT ;

jobParmREGIONX : REGIONX EQUAL LPAREN? NUM_LIT MEM_UNIT (COMMA NUM_LIT MEM_UNIT) RPAREN? ;

jobParmRESTART : RESTART EQUAL (ASTERISK | NAME (DOT NAME)?) (COMMA UNQUOTED_STRING)? ;

jobParmSECLABEL : SECLABEL EQUAL NAME ;

jobParmSCHENV : SCHENV EQUAL ALNUMNAT16 ;

jobParmSYSAFF : SYSAFF EQUAL HYPHEN? LPAREN? HYPHEN? (ALNUMNAT4 | ANY | IND | ASTERISK) (COMMA HYPHEN? (ALNUMNAT4 | ANY | IND | ASTERISK))* RPAREN? ;

jobParmSYSTEM : SYSTEM EQUAL HYPHEN? LPAREN? HYPHEN? (ALNUMNAT8 | ANY | JGLOBAL | JLOCAL | ASTERISK) (COMMA HYPHEN? (ALNUMNAT8 | ANY | JGLOBAL | JLOCAL | ASTERISK))* RPAREN? ;

jobParmTIME : TIME EQUAL LPAREN? (NOLIMIT | MAXIMUM | FOURTEENFORTY | (NUM_LIT (COMMA NUM_LIT)?)) RPAREN? ;

jobParmTYPRUN : TYPRUN EQUAL (COPY | HOLD | JCLHOLD | SCAN) ;

jobParmUJOBCORR : UJOBCORR EQUAL (SIMPLE_STRING | QUOTED_STRING) ;

jobParmUSER : USER EQUAL NAME ;

inlineComment : COMMENT_FLAG_INLINE? COMMENT_TEXT ;

/*
jobKeywordParameter : addrspc_PARM | bytes_PARM | cards_PARM | ccsid_PARM | class_PARM | cond_PARM | email_PARM | group_PARM | jeslog_PARM | jobrc_PARM | lines_PARM | memlimit_PARM | msgclass_PARM | msglevel_PARM | notify_PARM | pages_PARM | password_PARM | perform_PARM | prty_PARM | rd_PARM | region_PARM | restart_PARM | seclabel_PARM | schenv_PARM | sysaff_PARM | system_PARM | time_PARM | typrun_PARM | user_PARM ;

addrspc_PARM : ADDRSPC EQUAL (REAL | VIRT) ;
bytes_PARM : BYTES EQUAL NUM_LIT (COMMA (CANCEL | DUMP | WARNING))? ;
cards_PARM : CARDS EQUAL NUM_LIT (COMMA (CANCEL | DUMP | WARNING))? ;
ccsid_PARM : CCSID EQUAL NUM_LIT ;
class_PARM : CLASS EQUAL SIMPLE_STRING ;
cond_PARM : COND EQUAL LPAREN? LPAREN NUM_LIT COMMA COND_OP RPAREN (COMMA LPAREN NUM_LIT COMMA COND_OP RPAREN)* RPAREN? ;
email_PARM : EMAIL EQUAL SIMPLE_STRING ;
group_PARM : GROUP EQUAL NAME ;
jeslog_PARM : JESLOG EQUAL (SPIN | NOSPIN | SUPPRESS) ;
jobrc_PARM : JOBRC EQUAL (MAXRC | LASTRC | (LPAREN STEP COMMA NAME (DOT NAME)? RPAREN)) ;
lines_PARM : LINES EQUAL NUM_LIT (COMMA (CANCEL | DUMP | WARNING))? ;
memlimit_PARM : MEMLIMIT EQUAL ((NUM_LIT ('M' | 'G' | 'T' | 'P')) | NOLIMIT) ;
msgclass_PARM : MSGCLASS EQUAL (ALPHA | NUM) ;
msglevel_PARM : MSGLEVEL EQUAL LPAREN? (ALPHA | NUM) (COMMA (ALPHA | NUM))? RPAREN? ;
notify_PARM : NOTIFY EQUAL NAME (DOT NAME)? ;
pages_PARM : PAGES EQUAL NUM_LIT (COMMA (CANCEL | DUMP | WARNING))? ;
password_PARM : PASSWORD EQUAL LPAREN? ALNUMNAT8 (COMMA ALNUMNAT8)? RPAREN? ;
perform_PARM : PERFORM EQUAL NUM_LIT ;
prty_PARM : PRTY EQUAL NUM_LIT ;
rd_PARM : RD EQUAL (R | RNC | NR | NC) ;
region_PARM : REGION EQUAL NUM_LIT (K | M) ;
restart_PARM : RESTART EQUAL (ASTERISK | NAME (DOT NAME)?) (COMMA UNQUOTED_STRING)? ;
seclabel_PARM : SECLABEL EQUAL ALNUMNAT8 ;
schenv_PARM : SCHENV EQUAL ALNUMNAT16 ;
sysaff_PARM : SYSAFF EQUAL HYPHEN? LPAREN? HYPHEN? (ALNUMNAT4 | ANY | IND | ASTERISK) (COMMA HYPHEN? (ALNUMNAT4 | ANY | IND | ASTERISK))* RPAREN? ;
system_PARM : SYSTEM EQUAL HYPHEN? LPAREN? HYPHEN? (ALNUMNAT8 | ANY | JGLOBAL | JLOCAL | ASTERISK) (COMMA HYPHEN? (ALNUMNAT8 | ANY | JGLOBAL | JLOCAL | ASTERISK))* RPAREN? ;
time_PARM : TIME EQUAL LPAREN? (NOLIMIT | MAXIMUM | FOURTEENFORTY | (NUM_LIT (COMMA NUM_LIT)?)) RPAREN? ;
typrun_PARM : TYPRUN EQUAL (COPY | HOLD | JCLHOLD | SCAN) ;
user_PARM : USER EQUAL NAME ;
*/


proc : SS procName PROC definedSymbolicParameters* ;

defineSymbolicParameter : NAME EQUAL (QUOTED_STRING | SIMPLE_STRING)? ;

definedSymbolicParameters : defineSymbolicParameter (COMMA (NEWLINE SS CONTINUATION_WS)? defineSymbolicParameter)* ;

stepName : NAME_FIELD ;

procName : NAME_FIELD ;
