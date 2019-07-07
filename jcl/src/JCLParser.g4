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

jcl : execJCL+ | procJCL ;

execJCL : (jobCard joblibAmalgamation? syschkAmalgamation? (commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | procStatement | pendStatement | scheduleStatement | setStatement)+)+ ;

procJCL : procStatement (commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | setStatement)+ ;

procStatement : SS procName? PROC definedSymbolicParameters* ;

defineSymbolicParameter : NAME EQUAL (QUOTED_STRING_FRAGMENT | UNQUOTED_STRING)? ;

definedSymbolicParameters : defineSymbolicParameter ((COMMA | (inlineComment SS CONTINUATION_WS)) defineSymbolicParameter)* ;

commentStatement : COMMENT_FLAG (COMMENT_TEXT? | EOF) ;

inlineComment : COMMENT_FLAG_INLINE? COMMENT_TEXT ;

stepName : NAME_FIELD ;

procName : NAME_FIELD ;

jclStep : execStatement (cntlStatementAmalgamation | ddStatementAmalgamation | outputStatement | includeStatement | commentStatement)* ;

execStatement : execPgmStatement | execProcStatement ;

execPgmStatement : SS stepName? EXEC PGM EQUAL NAME_EX (((COMMA | inlineComment) SS?)? execParameter inlineComment?)* ;

execProcStatement : SS stepName? EXEC (PROC_EX EQUAL)? NAME_EX (((COMMA | inlineComment) SS?)? definedSymbolicParameters inlineComment?)* ;

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

execParmMEMLIMIT : MEMLIMIT EQUAL (NUM_MEM_VAL | NOLIMIT) ;

execParmPARM : PARM EQUAL (SIMPLE_STRING | QUOTED_STRING_FRAGMENT | SYMBOLIC) ;

execParmPARMDD : PARMDD EQUAL NAME ;

execParmPERFORM : PERFORM EQUAL NUM_LIT ;

execParmRD : RD EQUAL RD_VALUE ; 

execParmREGION : REGION EQUAL NUM_MEM_VAL ;

execParmREGIONX : REGIONX EQUAL LPAREN? NUM_MEM_VAL (COMMA NUM_MEM_VAL) RPAREN? ;

execParmRLSTMOUT : RLSTMOUT EQUAL NUM_LIT ;

execParmTIME : TIME EQUAL LPAREN? (NOLIMIT | MAXIMUM | FOURTEENFORTY | (NUM_LIT (COMMA NUM_LIT)?)) RPAREN? ;

execParmTVSMSG : TVSMSG EQUAL (COMMIT | BACKOUT | ALL) ;

execParmTVSAMCOM : TVSAMCOM EQUAL LPAREN NUM_LIT COMMA NUM_LIT RPAREN ;

ddStatement : SS ddName DD ddParameter (((COMMA | inlineComment) SS?)? ddParameter inlineComment?)* ddParmASTERISK_DATA* ;

ddStatementConcatenation : SS DD ddParameter (((COMMA | inlineComment) SS?)? ddParameter inlineComment?)* ddParmASTERISK_DATA* ;

ddStatementAmalgamation : ddStatement ddStatementConcatenation* ;

ddName : NAME_FIELD (DOT NAME_FIELD)? ;
ddParameter : ddParmACCODE | ddParmAMP | ddParmASTERISK | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmBURST | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmCOPIES | ddParmDATA | ddParmDATACLAS | ddParmDCB | ddParmDEST | ddParmDISP | ddParmDLM | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFCB | ddParmFILEDATA | ddParmFLASH | ddParmFREE | ddParmFREEVOL | ddParmGDGORDER | ddParmHOLD | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLGSTREAM | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmOUTLIM | ddParmOUTPUT | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSPIN | ddParmSTORCLAS | ddParmSUBSYS | ddParmSYMBOLS | ddParmSYMLIST | ddParmSYSOUT | ddParmTERM | ddParmUCS | ddParmUNIT | ddParmVOLUME ;

ddParmACCODE : ACCODE EQUAL (SIMPLE_STRING | QUOTED_STRING_FRAGMENT);
ddParmAMP : AMP EQUAL 
    (LPAREN 
        (QUOTED_STRING_FRAGMENT ((COMMA | inlineComment)? SS? QUOTED_STRING_FRAGMENT))*
    RPAREN) ;
ddParmASTERISK : ASTERISK ;
ddParmASTERISK_DATA : DD_ASTERISK_DATA+ (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)? ;
ddParmAVGREC : AVGREC EQUAL MEM_UNIT ;
ddParmBLKSIZE : BLKSIZE EQUAL NUM_LIT | NUM_MEM_VAL ;
ddParmBLKSZLIM : BLKSZLIM EQUAL NUM_LIT | NUM_MEM_VAL ;
ddParmBURST : BURST EQUAL yesOrNo ;
ddParmCCSID : CCSID EQUAL NUM_LIT ;
ddParmCHARS : CHARS EQUAL LPAREN? (ALNUMNAT | DUMP) (COMMA ALNUMNAT)* RPAREN? ;
ddParmCHKPT : CHKPT EQUAL EOV ;
ddParmCNTL : CNTL EQUAL REFERBACK ;
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
    RPAREN) |
    REFERBACK |
    DATASET_NAME
  ;

ddParmDCB_Parameter : ddParmDCB_BFALN | ddParmDCB_BFTEK | ddParmDCB_BLKSIZE | ddParmDCB_BUFIN | ddParmDCB_BUFL | ddParmDCB_BUFMAX | ddParmDCB_BUFNO | ddParmDCB_BUFOFF | ddParmDCB_BUFOUT | ddParmDCB_BUFSIZE | ddParmDCB_CPRI | ddParmDCB_CYLOFL | ddParmDCB_DEN | ddParmDCB_DIAGNS | ddParmDCB_DSORG | ddParmDCB_EROPT | ddParmDCB_FUNC | ddParmDCB_GNCP | ddParmDCB_INTVL | ddParmDCB_IPLTXID | ddParmDCB_KEYLEN | ddParmDCB_LIMCT| ddParmDCB_LRECL | ddParmDCB_MODE |  ddParmDCB_NCP | ddParmDCB_NTM | ddParmDCB_OPTCD | ddParmDCB_PCI | ddParmDCB_PRTSP | ddParmDCB_RECFM | ddParmDCB_RESERVE | ddParmDCB_RKP | ddParmDCB_STACK | ddParmDCB_THRESH | ddParmDCB_TRTCH ;

ddParmDCB_BFALN : BFALN EQUAL ALPHA ;
ddParmDCB_BFTEK : BFTEK EQUAL ALPHA ;
ddParmDCB_BLKSIZE : BLKSIZE EQUAL NUM_LIT | NUM_MEM_VAL? ;
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
ddParmDCB_RECFM : RECFM EQUAL NAME ;
ddParmDCB_RESERVE : RESERVE EQUAL LPAREN NUM_LIT COMMA NUM_LIT RPAREN ;
ddParmDCB_RKP : RKP EQUAL NUM_LIT ;
ddParmDCB_STACK : STACK EQUAL NUM_LIT ;
ddParmDCB_THRESH : THRESH EQUAL NUM_LIT ;
ddParmDCB_TRTCH : TRTCH EQUAL ALPHA+ ;

ddParmDEST : DEST ;
ddParmDISP : DISP EQUAL LPAREN? ddParmDISP_STATUS? COMMA? ddParmDISP_NORMAL_TERM? COMMA? ddParmDISP_ABNORMAL_TERM? RPAREN? ;
ddParmDISP_STATUS : MOD | NEW | OLD | SHR | SYMBOLIC ;
ddParmDISP_NORMAL_TERM : CATLG | DELETE | KEEP | PASS | UNCATLG | SYMBOLIC ;
ddParmDISP_ABNORMAL_TERM : CATLG | DELETE | KEEP | PASS | UNCATLG | SYMBOLIC ;
//ddParmDLM : DLM EQUAL DLM_VAL ;
ddParmDLM : DLM DLM_VAL ;
ddParmDSID : DSID EQUAL (DSID_VAL | (LPAREN DSID_VAL COMMA V RPAREN)) ;
ddParmDSKEYLBL : DSKEYLBL EQUAL QUOTED_STRING_FRAGMENT ;
ddParmDSNAME : (DSNAME | DSN) EQUAL (NAME | DATASET_NAME | REFERBACK | QUOTED_STRING_FRAGMENT) ;
ddParmDSNTYPE : DSNTYPE EQUAL DSNTYPE_VAL ;
ddParmDUMMY : DUMMY ;
ddParmDYNAM : DYNAM ;
ddParmEATTR : EATTR EQUAL (OPT | NO) ;
ddParmEXPDT : EXPDT EQUAL (NUM_LIT | (NUM_LIT SLASH NUM_LIT)) ;
ddParmFCB : FCB EQUAL ALNUMNAT | (LPAREN ALNUMNAT (COMMA (ALIGN | VERIFY))?) ;
ddParmFILEDATA : FILEDATA EQUAL (BINARY | RECORD | TEXT) ;
ddParmFLASH : FLASH EQUAL (ALNUMNAT | NONE | (ALNUMNAT (COMMA NUM_LIT)?)) ;
ddParmFREE : FREE EQUAL (END | CLOSE) ;
ddParmFREEVOL : FREEVOL EQUAL (END | EOV) ;
ddParmGDGORDER : GDGORDER EQUAL (FIFO | LIFO | USECATLG) ;
ddParmHOLD : HOLD EQUAL (YES | NO | Y | N);
ddParmKEYLABL1 : KEYLABL1 EQUAL (QUOTED_STRING_FRAGMENT | SIMPLE_STRING) ;
ddParmKEYLABL2 : KEYLABL2 EQUAL (QUOTED_STRING_FRAGMENT | SIMPLE_STRING) ;
ddParmKEYENCD1 : KEYENCD1 EQUAL (L | H) ;
ddParmKEYENCD2 : KEYENCD2 EQUAL (L | H) ;
ddParmKEYLEN : KEYLEN EQUAL NUM_LIT ;
ddParmKEYOFF : KEYOFF EQUAL NUM_LIT ;
ddParmLABEL : LABEL EQUAL 
    (LPAREN? (NUM_LIT | ddParmRETPD | ddParmEXPDT) RPAREN?) | 
    (LPAREN 
        NUM_LIT? (COMMA ALPHA+? (COMMA (PASSWORD | NOPWREAD)? (COMMA ddParmRETPD? (COMMA ddParmEXPDT)?)?)?)?
    RPAREN) ;
/*
It's not really a dataset name in the LGSTREAM parameter, but it
does match the same pattern.
*/
ddParmLGSTREAM : LGSTREAM EQUAL DATASET_NAME ;
ddParmLIKE : LIKE EQUAL DATASET_NAME ;
ddParmLRECL : LRECL EQUAL (NUM_LIT | (NUM_LIT K) | X) ;
ddParmMAXGENS : MAXGENS EQUAL NUM_LIT ;
ddParmMGMTCLAS : MGMTCLAS EQUAL NAME? ;
ddParmMODIFY : MODIFY EQUAL LPAREN? NAME (COMMA NUM_LIT)? RPAREN? ;
ddParmOUTLIM : OUTLIM EQUAL NUM_LIT ;
ddParmOUTPUT : OUTPUT EQUAL (ddParmReferback | 
    (LPAREN 
        ddParmReferback 
            ((COMMA ddParmReferback) | 
            (inlineComment SS ddParmReferback))* 
    RPAREN)) ;
ddParmPATH : PATH EQUAL (QUOTED_STRING_FRAGMENT | UNQUOTED_STRING) ;
ddParmPATHDISP : PATHDISP EQUAL (
    (KEEP | DELETE) | 
    (LPAREN (KEEP | DELETE) (COMMA (KEEP | DELETE))? RPAREN) | 
    (LPAREN COMMA (KEEP | DELETE) RPAREN)) ;
ddParmPATHMODE : PATHMODE EQUAL (ALPHA+ |
    (LPAREN ALPHA+
        ((COMMA ALPHA+) | 
        (inlineComment SS ALPHA+))*
    RPAREN)) ;
ddParmPATHOPTS : PATHOPTS EQUAL (ALPHA+ |
    (LPAREN ALPHA+
        ((COMMA ALPHA+) | 
        (inlineComment SS ALPHA+))*
    RPAREN)) ;
ddParmPROTECT : PROTECT EQUAL (YES | Y) ;
ddParmRECFM : ddParmDCB_RECFM ;
ddParmRECORG : RECORG EQUAL ALPHA+ ;
ddParmREFDD : REFDD EQUAL ddParmReferback ;
ddParmRETPD : RETPD EQUAL NUM_LIT ;
ddParmRLS : RLS EQUAL (NRI | CR | CRE) ;
ddParmROACCESS : ROACCESS EQUAL 
    (ALLOW | 
    DISALLOW | 
    (LPAREN ALLOW COMMA EXTLOCK RPAREN) | 
    (LPAREN ALLOW COMMA TRKLOCK RPAREN)) ;
ddParmSECMODEL : SECMODEL EQUAL (LPAREN? DATASET_PROFILE RPAREN? | 
    (LPAREN DATASET_PROFILE COMMA GENERIC RPAREN));
ddParmSEGMENT : SEGMENT EQUAL NUM_LIT ;
ddParmSPACE : SPACE EQUAL (
    (LPAREN
        (CYL | TRK | NUM_LIT) COMMA 
            (NUM_LIT |
            (LPAREN NUM_LIT COMMA? NUM_LIT? COMMA? NUM_LIT? COMMA? NUM_LIT RPAREN))
        COMMA? RLSE? COMMA? (CONTIG | MXIG | ALX)? COMMA? ROUND?
    RPAREN) |
    (LPAREN ABSTR COMMA NUM_LIT (COMMA NUM_LIT)?)
  ) ;
ddParmSPIN : SPIN EQUAL (
    NO | 
    UNALLOC |
    (LPAREN UNALLOC COMMA QUOTED_STRING_FRAGMENT RPAREN) |
    (LPAREN UNALLOC COMMA NUM_LIT (K | M)? RPAREN) |
    (LPAREN UNALLOC COMMA NOCMND RPAREN) |
    (LPAREN UNALLOC COMMA CMNDONLY RPAREN)
  ) ;

ddParmSTORCLAS : STORCLAS EQUAL NAME? ;
ddParmSUBSYS : SUBSYS EQUAL (
    (SIMPLE_STRING | QUOTED_STRING_FRAGMENT) |
    (LPAREN (SIMPLE_STRING | QUOTED_STRING_FRAGMENT) (
        (COMMA (SIMPLE_STRING | QUOTED_STRING_FRAGMENT)) |
        (inlineComment SS (SIMPLE_STRING | QUOTED_STRING_FRAGMENT))
      )*
    RPAREN)
  ) ;
ddParmSYMBOLS : SYMBOLS EQUAL LPAREN? (CNVTSYS | EXECSYS | JCLONLY) (COMMA (NAME | LOGGING_DDNAME))? RPAREN? ;
ddParmSYMLIST : SYMLIST EQUAL (
    ALNUMNAT |
    (LPAREN ALNUMNAT (
        (COMMA ALNUMNAT) |
        (inlineComment SS ALNUMNAT)
      )*
    RPAREN)
  ) ;

ddParmSYSOUT : SYSOUT EQUAL (
    ASTERISK |
    (ALPHA | NUM_LIT) |
    (LPAREN COMMA RPAREN ) |
    (LPAREN (ALPHA | NUM_LIT) COMMA? ALNUMNAT? COMMA? ALNUMNAT? RPAREN)
  ) ;

ddParmTERM : TERM EQUAL T S ;
ddParmUCS : UCS EQUAL (
    ALNUMNAT |
    (LPAREN ALNUMNAT COMMA? FOLD? COMMA? VERIFY? RPAREN)
  ) ;

ddParmUNIT : UNIT EQUAL (
    NUM_LIT |
    (SLASH? SIMPLE_STRING) |
    (AFF EQUAL ddName) |
    (LPAREN 
        (SLASH? (SIMPLE_STRING | NUM_LIT))? 
            (COMMA (NUM_LIT | P)? 
                (COMMA DEFER? 
                    (COMMA SMSHONOR)?
                )?
            )?
    RPAREN)
  ) ;

ddParmVOLUME : VOLUME EQUAL (
    PRIVATE |
    ddParmVOLUME_SER |
    ddParmVOLUME_REF |
    (LPAREN
        PRIVATE? 
            (COMMA ddParmVOLUME_SER? 
                (COMMA ddParmVOLUME_REF? 
                    (COMMA NUM_LIT? 
                        (COMMA NUM_LIT)?
                    )?
                )?
            )?
    RPAREN)
  ) ;

ddParmVolSer : (NUM_LIT | SIMPLE_STRING | ALNUMNAT | QUOTED_STRING_FRAGMENT) ;
ddParmVOLUME_SER : 
    (SER EQUAL ddParmVolSer) |
    (SER EQUAL LPAREN  ddParmVolSer (
            (COMMA ddParmVolSer)* |
            (inlineComment SS ddParmVolSer)* 
          ) RPAREN) ;
ddParmVOLUME_REF : REF EQUAL (ddName | DATASET_NAME | QUOTED_STRING_FRAGMENT) ;


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
ddParmAMP_SMBVSP : SMBVSP EQUAL NUM_MEM_VAL ;
ddParmAMP_SMBVSPI : SMBVSPI EQUAL NUM_MEM_VAL ;
ddParmAMP_STRNO : STRNO EQUAL NUM_LIT;
ddParmAMP_SYNAD : SYNAD EQUAL NAME;

ddParmReferback : ASTERISK DOT ddName (DOT ddName (DOT ddName)?)? ;

/*

https://www.ibm.com/support/knowledgecenter/SSLTBW_2.3.0/com.ibm.zos.v2r3.idar100/subprmtr.htm

The syntax for the TRACE subparameter of the AMP parameter of the DD statement
took a bit of digging to locate, so I'm recording the url here.  The vernacular 
would be...

Home > z/OS 2.3.0 > z/OS DFSMS > z/OS DFSMSdfp Diagnosis > VSAM diagnostic aids > VSAM record management (R/M) diagnostic aids > VSAM record management trace facility (non-RLS access) > Starting the record management trace function > Subparameters for trace

...for the future, when z/OS 2.3 documentation drops off the back of the stove.

*/
//ddParmAMP_TRACE : TRACE EQUAL LPAREN SQUOTE ddParmAMP_TRACE_Parameter ((COMMA ddParmAMP_TRACE_Parameter) | (SQUOTE (inlineComment | COMMA) SS SQUOTE ddParmAMP_TRACE_Parameter))* SQUOTE RPAREN ;
ddParmAMP_TRACE : TRACE EQUAL 
    LPAREN
        (QUOTED_STRING_FRAGMENT ((COMMA | inlineComment)? SS? QUOTED_STRING_FRAGMENT))*
    RPAREN ;
ddParmAMP_TRACE_Parameter : ddParmAMP_TRACE_HOOK | ddParmAMP_TRACE_ECODE | ddParmAMP_TRACE_KEY | ddParmAMP_TRACE_PARM1 | ddParmAMP_TRACE_PARM2 ;

ddParmAMP_TRACE_HOOK : HOOK EQUAL LPAREN NUM_LIT (COMMA NUM_LIT)* RPAREN ;
ddParmAMP_TRACE_ECODE : ECODE EQUAL (ANY | NUM_LIT) ;
ddParmAMP_TRACE_KEY : KEY EQUAL SIMPLE_STRING ;
ddParmAMP_TRACE_PARM1 : PARM1 EQUAL SIMPLE_STRING ;
ddParmAMP_TRACE_PARM2 : PARM2 EQUAL SIMPLE_STRING ;

joblibStatement : SS JOBLIB DD joblibParameter (((COMMA | inlineComment) SS?)? joblibParameter inlineComment?)* ;

joblibConcatenation : SS DD joblibParameter (((COMMA | inlineComment) SS?)? joblibParameter inlineComment?)* ;

joblibAmalgamation : joblibStatement joblibConcatenation* ;

joblibParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


syschkStatement : SS SYSCHK DD syschkParameter (((COMMA | inlineComment) SS?)? syschkParameter inlineComment?)* ;

syschkConcatenation : SS DD syschkParameter (((COMMA | inlineComment) SS?)? syschkParameter inlineComment?)* ;

syschkAmalgamation : syschkStatement syschkConcatenation* ;

syschkParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


jobCard : SS jobName JOB LPAREN? jobAccountingInformation? RPAREN? inlineComment? (COMMA jobProgrammerName)? inlineComment? (((COMMA | inlineComment) SS?)? jobKeywordParameter inlineComment?)* ;

jobName : NAME_FIELD ;

jobProgrammerName : QUOTED_STRING_FRAGMENT | SIMPLE_STRING | NUM_LIT | NAME | DATASET_NAME ;

jobAccountingInformation : jobAccountingInformationSimple | jobAccountingInformationMultiLine ;

jobAccountingInformationSimple : (QUOTED_STRING_FRAGMENT | SIMPLE_STRING | NUM_LIT | NAME | ALNUMNAT) 
    (COMMA (QUOTED_STRING_FRAGMENT | SIMPLE_STRING | NUM_LIT | NAME | ALNUMNAT)?)* ;

jobAccountingInformationMultiLine : (QUOTED_STRING_FRAGMENT | SIMPLE_STRING | NUM_LIT | NAME | ALNUMNAT) 
    (COMMA? SS? (QUOTED_STRING_FRAGMENT | SIMPLE_STRING | NUM_LIT | NAME| ALNUMNAT))* ;

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

jobParmEMAIL : EMAIL EQUAL (UNQUOTED_STRING | QUOTED_STRING_FRAGMENT) ;

jobParmGDGBIAS : GDGBIAS EQUAL (GDGBIAS_JOB | GDGBIAS_STEP) ;

jobParmGROUP : GROUP EQUAL NAME ;

jobParmJESLOG : JESLOG EQUAL (
    (LPAREN SPIN COMMA (QUOTED_STRING_FRAGMENT | NUM_MEM_VAL | NUM_LIT) RPAREN) | 
    NOSPIN | 
    SUPPRESS
  ) 
  ;

jobParmJOBRC : JOBRC EQUAL (MAXRC | LASTRC | (LPAREN JOBRC_STEP_LIT COMMA JOBRC_STEP_NAME RPAREN)) ;

jobParmMEMLIMIT : MEMLIMIT EQUAL (NUM_MEM_VAL | NOLIMIT | ALNUMNAT) ;

jobParmMSGCLASS : MSGCLASS EQUAL (ALPHA | MEM_UNIT) ;

jobParmMSGLEVEL : MSGLEVEL EQUAL (
    NUM_LIT |
    (LPAREN NUM_LIT? (COMMA NUM_LIT)? RPAREN) 
  ) 
  ;

/*
At least for right now, I'm including DATASET_NAME as a valid token in the NOTIFY
parameter and the NOTIFY statement.  This is because a user name qualified with a
node name (node.user) looks _exactly_ like a two part dataset name.  I'd like to
introduce a mode for either parameters that match dataset names or for those that
match user names, but this is a quick fix.
*/
jobParmNOTIFY : NOTIFY EQUAL ((NAME (DOT NAME)?) | SYMBOLIC | DATASET_NAME) ;

jobParmPASSWORD : PASSWORD EQUAL LPAREN? NAME (COMMA NAME)? RPAREN? ;

jobParmPERFORM : PERFORM EQUAL NUM_LIT ;

jobParmPRTY : PRTY EQUAL NUM_LIT ;

jobParmRD : RD EQUAL RD_VALUE ;

jobParmREGION : REGION EQUAL (NUM_MEM_VAL | ALNUMNAT) ;

jobParmREGIONX : REGIONX EQUAL LPAREN? (NUM_MEM_VAL | ALNUMNAT) (COMMA (NUM_MEM_VAL | ALNUMNAT)) RPAREN? ;

jobParmRESTART : RESTART EQUAL LPAREN? (ASTERISK | (NAME (DOT NAME)?) | DATASET_NAME) (COMMA (NAME | UNQUOTED_STRING | QUOTED_STRING_FRAGMENT))? RPAREN? ;

jobParmSECLABEL : SECLABEL EQUAL NAME ;

jobParmSCHENV : SCHENV EQUAL ALNUMNAT ;

jobParmSYSAFF : SYSAFF EQUAL HYPHEN? LPAREN? HYPHEN? (ALNUMNAT | ANY | IND | ASTERISK) (COMMA HYPHEN? (ALNUMNAT | ANY | IND | ASTERISK))* RPAREN? ;

jobParmSYSTEM : SYSTEM EQUAL HYPHEN? LPAREN? HYPHEN? (ALNUMNAT | ANY | JGLOBAL | JLOCAL | ASTERISK) (COMMA HYPHEN? (ALNUMNAT | ANY | JGLOBAL | JLOCAL | ASTERISK))* RPAREN? ;

jobParmTIME : TIME EQUAL LPAREN? (NOLIMIT | MAXIMUM | FOURTEENFORTY | (NUM_LIT (COMMA NUM_LIT)?)) RPAREN? ;

jobParmTYPRUN : TYPRUN EQUAL (COPY | HOLD | JCLHOLD | SCAN) ;

jobParmUJOBCORR : UJOBCORR EQUAL (SIMPLE_STRING | QUOTED_STRING_FRAGMENT) ;

jobParmUSER : USER EQUAL NAME ;

commandStatement : SS NAME_FIELD COMMAND QUOTED_STRING_FRAGMENT ;
 
cntlStatement : SS NAME_FIELD CNTL ASTERISK inlineComment* ;

endcntlStatement : SS NAME_FIELD ENDCNTL inlineComment* ;

cntlStatementAmalgamation : cntlStatement CNTL_DATA* endcntlStatement ;

exportStatement : SS NAME_FIELD? EXPORT SYMLIST EQUAL (
    ASTERISK |
    (LPAREN NAME (COMMA | (inlineComment SS CONTINUATION_WS) NAME)* RPAREN)
  ) ;

ifStatement : SS NAME_FIELD? IF LPAREN* IF_CHECK ((SS CONTINUATION_WS)? LPAREN* IF_CHECK RPAREN*)* RPAREN* THEN inlineComment? ;

elseStatement : SS NAME_FIELD? ELSE inlineComment? ;

endifStatement : SS NAME_FIELD? ENDIF inlineComment? ;

includeStatement : SS NAME_FIELD? INCLUDE MEMBER EQUAL MEMBER_NAME inlineComment? ;

jcllibStatement : SS NAME_FIELD? JCLLIB ORDER EQUAL LPAREN? (DATASET_NAME | QUOTED_STRING_FRAGMENT) ((COMMA | (inlineComment SS CONTINUATION_WS)) (DATASET_NAME | QUOTED_STRING_FRAGMENT))* RPAREN? ;

/*
At least for right now, I'm including DATASET_NAME as a valid token in the NOTIFY
parameter and the NOTIFY statement.  This is because a user name qualified with a
node name (node.user) looks _exactly_ like a two part dataset name.  I'd like to
introduce a mode for either parameters that match dataset names or for those that
match user names, but this is a quick fix.
*/

notifyStatement : SS NAME_FIELD? NOTIFY 
    (EMAIL EQUAL QUOTED_STRING_FRAGMENT) | (USER EQUAL (DATASET_NAME | ((NAME DOT)? NAME))) 
        ((COMMA |
         (inlineComment SS CONTINUATION_WS)) 
         TYPE EQUAL (EMAIL | MSG))? 
        ((COMMA |
         (inlineComment SS CONTINUATION_WS)) 
         WHEN EQUAL LPAREN* WHEN_CHECK 
            ((SS CONTINUATION_WS)? LPAREN* WHEN_CHECK RPAREN*)* RPAREN* inlineComment?)?
    ;

yesOrNo : YES | NO | Y | N ;

outputStatement : SS NAME_FIELD? OUTPUT outputStatementParameter 
    ((COMMA | (inlineComment SS)) outputStatementParameter)* ;

outputStatementParameter : outputStatementADDRESS | outputStatementAFPPARMS | outputStatementAFPSTATS | outputStatementBUILDING | outputStatementBURST | outputStatementCHARS | outputStatementCKPTLINE | outputStatementCKPTPAGE | outputStatementCKPTSEC | outputStatementCLASS | outputStatementCOLORMAP | outputStatementCOMPACT | outputStatementCOMSETUP | outputStatementCONTROL | outputStatementCOPIES | outputStatementCOPYCNT | outputStatementDATACK | outputStatementDDNAME | outputStatementDEFAULT | outputStatementDEPT | outputStatementDEST | outputStatementDPAGELBL | outputStatementDUPLEX | outputStatementFCB | outputStatementFLASH | outputStatementFORMDEF | outputStatementFORMLEN | outputStatementFORMS | outputStatementFSSDATA | outputStatementGROUPID | outputStatementINDEX | outputStatementINTRAY | outputStatementJESDS | outputStatementLINDEX | outputStatementLINECT | outputStatementMAILBCC | outputStatementMAILCC | outputStatementMAILFILE | outputStatementMAILFROM | outputStatementMAILTO | outputStatementMERGE | outputStatementMODIFY | outputStatementNAME | outputStatementNOTIFY | outputStatementOFFSETXB | outputStatementOFFSETXF | outputStatementOFFSETYB | outputStatementOFFSETYF | outputStatementOUTBIN | outputStatementOUTDISP | outputStatementOVERLAYB | outputStatementOVERLAYF | outputStatementOVFL | outputStatementPAGEDEF | outputStatementPIMSG | outputStatementPORTNO | outputStatementPRMODE | outputStatementPRTATTRS | outputStatementPRTERROR | outputStatementPRTOPTNS | outputStatementPRTQUEUE | outputStatementPRTY | outputStatementREPLYTO | outputStatementRESFMT | outputStatementRETAINS | outputStatementRETAINF | outputStatementRETRYL | outputStatementRETRYT | outputStatementROOM | outputStatementSYSAREA | outputStatementTHRESHLD | outputStatementTITLE | outputStatementTRC | outputStatementUCS | outputStatementUSERDATA | outputStatementUSERLIB | outputStatementUSERPATH | outputStatementWRITER ;

outputStatementADDRESS : ADDRESS EQUAL (
    LPAREN QUOTED_STRING_FRAGMENT 
        (COMMA | (inlineComment SS CONTINUATION_WS) QUOTED_STRING_FRAGMENT)*
    RPAREN
  ) |
    QUOTED_STRING_FRAGMENT
  ;
outputStatementAFPPARMS : AFPPARMS EQUAL (DATASET_NAME | QUOTED_STRING_FRAGMENT) ;
outputStatementAFPSTATS : AFPSTATS EQUAL yesOrNo ;
outputStatementBUILDING : BUILDING EQUAL QUOTED_STRING_FRAGMENT ;
outputStatementBURST : BURST EQUAL yesOrNo ;
outputStatementCHARS : CHARS EQUAL (
    LPAREN (NAME | DUMP )
        (COMMA | (inlineComment SS CONTINUATION_WS) NAME)*
    RPAREN
  ) |
    STD |
    DUMP
  ;
outputStatementCKPTLINE : CKPTLINE EQUAL NUM_LIT ;
outputStatementCKPTPAGE : CKPTPAGE EQUAL NUM_LIT ;
outputStatementCKPTSEC : CKPTSEC EQUAL NUM_LIT ;
outputStatementCLASS : CLASS EQUAL CLASS_VAL ;
outputStatementCOLORMAP : COLORMAP EQUAL ALNUMNAT ;
outputStatementCOMPACT : COMPACT EQUAL ALNUMNAT ;
outputStatementCOMSETUP : COMSETUP EQUAL ALNUMNAT ;
outputStatementCONTROL : CONTROL EQUAL (PROGRAM | SINGLE | DOUBLE | TRIPLE) ;
outputStatementCOPIES : COPIES EQUAL (
    LPAREN NUM_LIT? (
        COMMA LPAREN (NUM_LIT (COMMA NUM_LIT)*)? RPAREN
      )?
    RPAREN
  ) |
    NUM_LIT
  ;
outputStatementCOPYCNT : COPYCNT EQUAL NUM_LIT ;
outputStatementDATACK : DATACK EQUAL (BLOCK | UNBLOCK | BLKCHAR | BLKPOS) ;
outputStatementDDNAME : DDNAME EQUAL NAME (DOT NAME)? (DOT NAME)? ;
outputStatementDEFAULT : DEFAULT EQUAL yesOrNo ;
outputStatementDEPT : DEPT EQUAL (QUOTED_STRING_FRAGMENT | ALNUMNAT | ALPHA | NUM_LIT) ;
outputStatementDEST : DEST EQUAL (
    LOCAL |
    ANYLOCAL |
    NAME |
    ALNUMNAT |
    QUOTED_STRING_FRAGMENT |
    (NAME DOT NAME)
  )
  ;

/*
The QUOTED_STRING_FRAGMENT in the DEST parameter takes the place of the
IP address below.

    (SQUOTE (NAME DOT)? I P COLON NUM_LIT DOT NUM_LIT DOT NUM_LIT DOT NUM_LIT SQUOTE) |

*/

outputStatementDPAGELBL : DPAGELBL EQUAL yesOrNo ;
outputStatementDUPLEX : DUPLEX EQUAL (NO | N | NORMAL | TUMBLE) ;
outputStatementFCB : FCB EQUAL ALNUMNAT ;
outputStatementFLASH : FLASH EQUAL (
    (LPAREN ALNUMNAT? (COMMA NUM_LIT)? RPAREN) |
    ALNUMNAT
  )
  ;

outputStatementFORMDEF : FORMDEF EQUAL ALNUMNAT ;
outputStatementFORMLEN : FORMLEN EQUAL NUM_LIT (DOT NUM_LIT)? (IN | CM_UNIT) ;
outputStatementFORMS : FORMS EQUAL ALNUMNAT ;
outputStatementFSSDATA : FSSDATA EQUAL (QUOTED_STRING_FRAGMENT | ALNUMNAT | SYMBOLIC) ;
outputStatementGROUPID : GROUPID EQUAL ALNUMNAT ;
outputStatementINDEX : INDEX EQUAL NUM_LIT ;
outputStatementINTRAY : INTRAY EQUAL NUM_LIT ;
outputStatementJESDS : JESDS EQUAL (ALL | LOG | JCL | MSG) ;
outputStatementLINDEX : LINDEX EQUAL NUM_LIT ;
outputStatementLINECT : LINECT EQUAL NUM_LIT ;
outputStatementMAILBCC : MAILBCC EQUAL ALNUMNAT | QUOTED_STRING_FRAGMENT |
    (LPAREN 
        (ALNUMNAT | QUOTED_STRING_FRAGMENT) 
            ((COMMA | inlineComment)? SS? (ALNUMNAT | QUOTED_STRING_FRAGMENT))*
    RPAREN)
  ;
outputStatementMAILCC : MAILCC EQUAL ALNUMNAT | QUOTED_STRING_FRAGMENT |
    (LPAREN 
        (ALNUMNAT | QUOTED_STRING_FRAGMENT) 
            ((COMMA | inlineComment)? SS? (ALNUMNAT | QUOTED_STRING_FRAGMENT))*
    RPAREN)
  ;
outputStatementMAILFILE : MAILFILE EQUAL QUOTED_STRING_FRAGMENT ;
outputStatementMAILFROM : MAILFROM EQUAL QUOTED_STRING_FRAGMENT | ALNUMNAT ;
outputStatementMAILTO : MAILTO EQUAL EQUAL ALNUMNAT | QUOTED_STRING_FRAGMENT |
    (LPAREN 
        (ALNUMNAT | QUOTED_STRING_FRAGMENT) 
            ((COMMA | inlineComment)? SS? (ALNUMNAT | QUOTED_STRING_FRAGMENT))*
    RPAREN)
  ;
outputStatementMERGE : MERGE EQUAL yesOrNo ;
outputStatementMODIFY : MODIFY EQUAL ALNUMNAT | (LPAREN ALNUMNAT (COMMA NUM_LIT)?) ;
outputStatementNAME : NAME_OUTPUT EQUAL ALNUMNAT | QUOTED_STRING_FRAGMENT ;
outputStatementNOTIFY : NOTIFY EQUAL (NAME (DOT NAME)?) | 
    (LPAREN (NAME (DOT NAME)?) (COMMA (NAME (DOT NAME)?)+ RPAREN))
  ;
outputStatementOFFSETXB : OFFSETXB EQUAL NUM_LIT (DOT NUM_LIT)? outputStatementOFFSET_unit ;
outputStatementOFFSETXF : OFFSETXF EQUAL NUM_LIT (DOT NUM_LIT)? outputStatementOFFSET_unit ;
outputStatementOFFSETYB : OFFSETYB EQUAL NUM_LIT (DOT NUM_LIT)? outputStatementOFFSET_unit ;
outputStatementOFFSETYF : OFFSETYF EQUAL NUM_LIT (DOT NUM_LIT)? outputStatementOFFSET_unit ;
outputStatementOFFSET_unit : IN | CM_UNIT | MM | PELS | POINTS ;
outputStatementOUTBIN : OUTBIN EQUAL NUM_LIT ;
outputStatementOUTDISP : OUTDISP EQUAL outputStatementOUTDISP_val | 
    (LPAREN outputStatementOUTDISP_val (COMMA outputStatementOUTDISP_val)? RPAREN)
  ;
outputStatementOUTDISP_val : WRITE | HOLD | KEEP | LEAVE | PURGE ;
outputStatementOVERLAYB : OVERLAYB EQUAL NAME ;
outputStatementOVERLAYF : OVERLAYF EQUAL NAME ;
outputStatementOVFL : OVFL EQUAL (ON | OFF) ;
outputStatementPAGEDEF : PAGEDEF EQUAL NAME ;
outputStatementPIMSG : PIMSG EQUAL yesOrNo | 
    (LPAREN yesOrNo (COMMA NUM_LIT)? RPAREN)
  ;
outputStatementPORTNO : PORTNO EQUAL NUM_LIT ;
outputStatementPRMODE : PRMODE EQUAL NAME ;
outputStatementPRTATTRS : PRTATTRS EQUAL QUOTED_STRING_FRAGMENT ;
outputStatementPRTERROR : PRTERROR EQUAL DEFAULT | QUIT | HOLD ;
outputStatementPRTOPTNS : PRTOPTNS EQUAL QUOTED_STRING_FRAGMENT | ALNUMNAT ;
outputStatementPRTQUEUE : PRTQUEUE EQUAL QUOTED_STRING_FRAGMENT | ALNUMNAT ;
outputStatementPRTY : PRTY EQUAL NUM_LIT ;
outputStatementREPLYTO : REPLYTO EQUAL QUOTED_STRING_FRAGMENT | ALNUMNAT ;
outputStatementRESFMT : RESFMT EQUAL NAME ;
outputStatementRETAINS : RETAINS EQUAL QUOTED_STRING_FRAGMENT | FOREVER ;
outputStatementRETAINF : RETAINF EQUAL QUOTED_STRING_FRAGMENT | FOREVER ;
outputStatementRETRYL : RETRYL EQUAL NUM_LIT ;
outputStatementRETRYT : RETRYT EQUAL QUOTED_STRING_FRAGMENT ;
outputStatementROOM : ROOM EQUAL QUOTED_STRING_FRAGMENT | ALNUMNAT ;
outputStatementSYSAREA : SYSAREA EQUAL yesOrNo ;
outputStatementTHRESHLD : THRESHLD EQUAL NUM_LIT ;
outputStatementTITLE : TITLE EQUAL QUOTED_STRING_FRAGMENT | ALNUMNAT ;
outputStatementTRC : TRC EQUAL yesOrNo ;
outputStatementUCS : UCS EQUAL NAME ;
outputStatementUSERDATA : USERDATA EQUAL QUOTED_STRING_FRAGMENT | ALNUMNAT |
    (LPAREN 
        (ALNUMNAT | QUOTED_STRING_FRAGMENT) 
            ((COMMA | inlineComment)? SS? (ALNUMNAT | QUOTED_STRING_FRAGMENT))*
    RPAREN)
  ;

outputStatementUSERLIB : USERLIB EQUAL DATASET_NAME | QUOTED_STRING_FRAGMENT |
    (LPAREN 
        (DATASET_NAME | QUOTED_STRING_FRAGMENT) 
            ((COMMA | inlineComment)? SS? (DATASET_NAME | QUOTED_STRING_FRAGMENT))*
    RPAREN)
  ;

outputStatementUSERPATH : USERPATH EQUAL UNQUOTED_STRING | QUOTED_STRING_FRAGMENT |
    (LPAREN 
        (UNQUOTED_STRING | QUOTED_STRING_FRAGMENT) 
            ((COMMA | inlineComment)? SS? (UNQUOTED_STRING | QUOTED_STRING_FRAGMENT))*
    RPAREN)
  ;

outputStatementWRITER : WRITER EQUAL NAME ;

pendStatement : SS NAME_FIELD? PEND inlineComment? ;

scheduleStatement : SS NAME_FIELD? SCHEDULE scheduleParameters* ;

scheduleParameters : scheduleParmAFTER | scheduleParmBEFORE | scheduleParmDELAY | scheduleParmHOLDUNTIL | scheduleParmJOBGROUP | scheduleParmSTARTBY | scheduleParmWITH ;

scheduleParmAFTER : AFTER EQUAL NAME ;
scheduleParmBEFORE : BEFORE EQUAL NAME ;
scheduleParmDELAY : DELAY EQUAL (YES | Y) ;
scheduleParmHOLDUNTIL : HOLDUNTIL EQUAL 
    QUOTED_STRING_FRAGMENT |
    (LPAREN QUOTED_STRING_FRAGMENT (COMMA QUOTED_STRING_FRAGMENT)? RPAREN)
  ;
scheduleParmJOBGROUP : JOBGROUP EQUAL NAME (DOT NAME)? ;
scheduleParmSTARTBY : STARTBY EQUAL 
    QUOTED_STRING_FRAGMENT |
    (LPAREN QUOTED_STRING_FRAGMENT (COMMA QUOTED_STRING_FRAGMENT)? RPAREN)
  ;
scheduleParmWITH : WITH EQUAL NAME ;

setStatement : SS NAME_FIELD? SET (NAME | ALPHA+) EQUAL (UNQUOTED_STRING | QUOTED_STRING_FRAGMENT)?
    ((COMMA | inlineComment)? SS? (NAME | ALPHA+) EQUAL (UNQUOTED_STRING | QUOTED_STRING_FRAGMENT))*
  ;


