/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.


I do not like thee, JCL,
The reason why -- I cannot tell;
But this I know, and know full well,
I do not like thee, JCL.

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

//execJCL : (jobCard joblibAmalgamation? syschkAmalgamation? (commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | procStatement | pendStatement | scheduleStatement | setStatement)+)+ ;
execJCL : (jobCard (joblibAmalgamation | syschkAmalgamation | jcllibStatement)* (commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | procStatement | pendStatement | scheduleStatement | setStatement)+)+ ;

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

//execPgmStatement : SS stepName? EXEC PGM EQUAL NAME_EX (((COMMA | inlineComment | EOF) SS?)? execParameter inlineComment?)* ;
//execPgmStatement : SS stepName? EXEC PGM EQUAL NAME_EX (((COMMA | inlineComment | EOF) SS? commentStatement*)? execParameter inlineComment?)* ;
/*
execPgmStatement : SS stepName? EXEC PGM EQUAL NAME_EX (
    (COMMA SS commentStatement? execParameter inlineComment?) |
    (COMMA execParameter inlineComment?) |
    (inlineComment SS commentStatement? execParameter inlineComment?) |
  )* ;
*/
execPgmStatement : SS stepName? EXEC PGM EQUAL NAME_EX (
    execPgmClosure1 |
    execPgmClosure2 |
    execPgmClosure3 |
    execPgmClosure4 |
    execPgmClosure5
  )*? ;
execPgmClosure1 : COMMA commentStatement* SS execParameter inlineComment? ;
execPgmClosure2 : COMMA SS execParameter inlineComment? ;
execPgmClosure3 : COMMA execParameter inlineComment? ;
execPgmClosure4 : inlineComment commentStatement* SS execParameter inlineComment? ;
execPgmClosure5 : inlineComment commentStatement* EOF ;

//execProcStatement : SS stepName? EXEC (PROC_EX EQUAL)? NAME_EX (((COMMA | inlineComment) SS?)? (defineSymbolicParameter | execParameterOverrides) inlineComment?)* ;

execProcStatement : SS stepName? EXEC (PROC_EX EQUAL)? NAME_EX (
    execProcClosure1 |
    execProcClosure2 |
    execProcClosure3 |
    execProcClosure4 |
    execProcClosure5
  )*? ;
execProcClosure1 : COMMA commentStatement* SS (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
execProcClosure2 : COMMA SS (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
execProcClosure3 : COMMA (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
execProcClosure4 : inlineComment commentStatement* SS (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
execProcClosure5 : inlineComment commentStatement* EOF ;

/*
Some of the parameters for the EXEC statement are identical to those
of the JOB statement.  I'm duplicating them on the theory that they
are only identical _now_ and may change. It's pretty easy to see which
they are - the upper case part of the name is the same.  Except for 
the COND parameter, which is in fact different.
*/
execParameter : execParmACCT | execParmADDRSPC | execParmCCSID | execParmCOND | execParmDYNAMNBR | execParmMEMLIMIT | execParmPARM | execParmPARMDD | execParmPERFORM | execParmRD | execParmREGION | execParmREGIONX | execParmRLSTMOUT | execParmTIME | execParmTVSMSG | execParmTVSAMCOM ;

/*
Some of the parameters for the EXEC statement can have a procstepname 
indicating they are potentially overriding a value coded in the proc.
*/

execParameterOverrides : execParmACCT | execParmADDRSPC | execParmCOND | execParmDYNAMNBR | execParmPARM | execParmPERFORM | execParmRD | execParmREGION | execParmREGIONX | execParmTIME ;

stepAccountingInformation : stepAccountingInformationSimple | stepAccountingInformationMultiLine ;
stepAccountingInformationSimple : stepAccountingString (COMMA stepAccountingString?)* ;
stepAccountingInformationMultiLine : stepAccountingString (COMMA? SS? stepAccountingString)* ;
stepAccountingString : (QUOTED_STRING_FRAGMENT | STEP_ACCT_MODE1_UNQUOTED_STRING+ | STEP_ACCT_MODE2_UNQUOTED_STRING+) ;

execParmACCT : ACCT (DOT NAME)? EQUAL LPAREN? stepAccountingInformation RPAREN? ;

execParmADDRSPC : ADDRSPC (DOT NAME)? EQUAL (REAL | VIRT | SYMBOLIC+) ;

execParmCCSID : CCSID EQUAL (NUM_LIT | SYMBOLIC+) ;

execParmCOND : COND (DOT NAME)? EQUAL 
    (EVEN | 
     ONLY | 
     SYMBOLIC+ |
        (LPAREN? 
            LPAREN (NUM_LIT | SYMBOLIC+) COMMA COND_OP (COMMA NAME (DOT NAME)?)? RPAREN 
                ((COMMA? LPAREN (NUM_LIT | SYMBOLIC+) COMMA COND_OP (COMMA NAME (DOT NAME)?)? RPAREN) | 
                 (COMMA? EVEN) | 
                 (COMMA? ONLY) |
                 (COMMA? SYMBOLIC+) |
                 (inlineComment? SS) |
                 (COMMA SS)
                )* RPAREN?
        )
    )
 ;

execParmDYNAMNBR : DYNAMNBR (DOT NAME)? EQUAL (NUM_LIT | SYMBOLIC+) ;

execParmMEMLIMIT : MEMLIMIT EQUAL (NUM_MEM_VAL | NOLIMIT | SYMBOLIC+) ;

execParmPARM : PARM (DOT NAME)? EQUAL (
    (LPAREN 
        (EXEC_PARM_STRING | QUOTED_STRING_FRAGMENT+) 
            (COMMA? inlineComment? (EXEC_PARM_STRING | QUOTED_STRING_FRAGMENT+))* 
    RPAREN) |
    EXEC_PARM_STRING |
    QUOTED_STRING_FRAGMENT+
  ) ;

execParmPARMDD : PARMDD EQUAL PARMDD_NAME ;

execParmPERFORM : PERFORM (DOT NAME)? EQUAL (NUM_LIT | SYMBOLIC+) ;

execParmRD : RD (DOT NAME)? EQUAL (RD_VALUE | RD_SYMBOLIC+) ; 

execParmREGION : REGION (DOT NAME)? EQUAL (NUM_MEM_VAL | SYMBOLIC+) ;

execParmREGIONX : REGIONX (DOT NAME)? EQUAL 
    LPAREN?
        (NUM_MEM_VAL | SYMBOLIC+)
            (COMMA (NUM_MEM_VAL | SYMBOLIC+))? 
    RPAREN?
  ;

execParmRLSTMOUT : RLSTMOUT EQUAL (NUM_LIT | SYMBOLIC+) ;

execParmTIME : TIME (DOT NAME)? EQUAL 
    LPAREN? (
        NOLIMIT |
        MAXIMUM |
        FOURTEENFORTY |
        SYMBOLIC+ |
        ((NUM_LIT | SYMBOLIC+) (COMMA (NUM_LIT | SYMBOLIC+))?) |
        ((NUM_LIT | SYMBOLIC+)? COMMA (NUM_LIT | SYMBOLIC+))
    ) RPAREN? ;

execParmTVSMSG : TVSMSG EQUAL (COMMIT | BACKOUT | ALL | SYMBOLIC+) ;

execParmTVSAMCOM : TVSAMCOM EQUAL LPAREN (NUM_LIT | SYMBOLIC+) COMMA (NUM_LIT | SYMBOLIC+) RPAREN ;

//referback : ASTERISK DOT NAME (DOT NAME)? (DOT NAME)? ;

//ddStatement : SS ddName DD ddParameter (((COMMA | inlineComment) SS?)? ddParameter inlineComment?)* ddParmASTERISK_DATA* ;
ddStatement : SS ddName DD ddParameter? (
    ddStatementClosure1 |
    ddStatementClosure2 |
    ddStatementClosure3 |
    ddStatementClosure4 |
    inlineComment)* 
      ddParmASTERISK_DATA* ;

ddStatementClosure1 : COMMA commentStatement* ddParameter inlineComment? ;
ddStatementClosure2 : COMMA COMMENT_TEXT? SS ddParameter inlineComment? ;
ddStatementClosure3 : COMMA ddParameter inlineComment? ;
ddStatementClosure4 : inlineComment commentStatement* SS ddParameter inlineComment? ;

//ddStatementConcatenation : SS DD ddParameter (((COMMA | inlineComment) SS?)? ddParameter inlineComment?)* ddParmASTERISK_DATA* ;
ddStatementConcatenation : SS DD ddParameter? (
    ddStatementClosure1 |
    ddStatementClosure2 |
    ddStatementClosure3 |
    ddStatementClosure4 |
    inlineComment)* 
      ddParmASTERISK_DATA* ;

ddStatementAmalgamation : ddStatement ddStatementConcatenation* ;

ddName : (NAME | NAME_FIELD) (DOT (NAME | NAME_FIELD))? ;
ddParameter : ddParmACCODE | ddParmAMP | ddParmASTERISK | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmBURST | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmCOPIES | ddParmDATA | ddParmDATACLAS | ddParmDCB | ddParmDDNAME | ddParmDEST | ddParmDISP | ddParmDLM | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFCB | ddParmFILEDATA | ddParmFLASH | ddParmFREE | ddParmFREEVOL | ddParmGDGORDER | ddParmHOLD | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLGSTREAM | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmOUTLIM | ddParmOUTPUT | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSPIN | ddParmSTORCLAS | ddParmSUBSYS | ddParmSYMBOLS | ddParmSYMLIST | ddParmSYSOUT | ddParmTERM | ddParmUCS | ddParmUNIT | ddParmVOLUME | ddParmDCB_Parameter;

ddParmACCODE : ACCODE EQUAL (ACCODE_VALUE | QUOTED_STRING_FRAGMENT | SYMBOLIC);
ddParmAMP : AMP EQUAL (
    (LPAREN 
        QUOTED_STRING_FRAGMENT ((COMMA | inlineComment)? SS? QUOTED_STRING_FRAGMENT)*
    RPAREN) |
    (QUOTED_STRING_FRAGMENT inlineComment?)
  ) ;
ddParmASTERISK : ASTERISK ;
ddParmASTERISK_DATA : DD_ASTERISK_DATA+ (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)? ;
ddParmAVGREC : AVGREC EQUAL (MEM_UNIT | SYMBOLIC) ;
ddParmBFALN : BFALN EQUAL (ALPHA | SYMBOLIC) ;
ddParmBFTEK : BFTEK EQUAL (ALPHA | SYMBOLIC) ;
ddParmBLKSIZE : BLKSIZE EQUAL (NUM_LIT | NUM_MEM_VAL | SYMBOLIC) ;
ddParmBLKSZLIM : BLKSZLIM EQUAL (NUM_LIT | NUM_MEM_VAL | SYMBOLIC) ;
ddParmBUFIN : BUFIN EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmBUFL : BUFL EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmBUFMAX : BUFMAX EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmBUFNO : BUFNO EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmBUFOFF : BUFOFF EQUAL (NUM_LIT | ALPHA | SYMBOLIC) ;
ddParmBUFOUT : BUFOUT EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmBUFSIZE : BUFSIZE EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmBURST : BURST EQUAL (yesOrNo | SYMBOLIC) ;
ddParmCCSID : CCSID EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmCHARS : CHARS EQUAL LPAREN? (CHARS_FONT | SYMBOLIC) (COMMA (CHARS_FONT | SYMBOLIC))* RPAREN? ;
ddParmCHKPT : CHKPT EQUAL EOV ;
ddParmCNTL : CNTL EQUAL ddParmReferback ;
ddParmCOPIES : COPIES EQUAL ((NUM_LIT | SYMBOLIC) | 
                   (LPAREN (NUM_LIT | SYMBOLIC) 
                       (COMMA LPAREN (NUM_LIT | SYMBOLIC) (COMMA (NUM_LIT | SYMBOLIC))* RPAREN)? 
                   RPAREN)) ;
ddParmCPRI : CPRI EQUAL (ALPHA | SYMBOLIC) ;
ddParmCYLOFL : CYLOFL EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmDATA : DATA ;
ddParmDATACLAS : DATACLAS EQUAL (DATACLAS_VALUE | SYMBOLIC)? ;

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
        ddParmDCB_Parameter (
            (COMMA COMMENT_TEXT? SS? ddParmDCB_Parameter) |
            (inlineComment SS ddParmDCB_Parameter)
          )*
    RPAREN) 
  ) ;

ddParmDCB_Parameter : ddParmBFALN | ddParmBFTEK | ddParmBLKSIZE | ddParmBUFIN | ddParmBUFL | ddParmBUFMAX | ddParmBUFNO | ddParmBUFOFF | ddParmBUFOUT | ddParmBUFSIZE | ddParmCPRI | ddParmCYLOFL | ddParmDEN | ddParmDIAGNS | ddParmDSORG | ddParmEROPT | ddParmFUNC | ddParmGNCP | ddParmINTVL | ddParmIPLTXID | ddParmKEYLEN | ddParmLIMCT| ddParmLRECL | ddParmMODE |  ddParmNCP | ddParmNTM | ddParmOPTCD | ddParmPCI | ddParmPRTSP | ddParmRECFM | ddParmRESERVE | ddParmRKP | ddParmSTACK | ddParmTHRESH | ddParmTRTCH | DATASET_NAME | ddParmReferback ;


ddParmDDNAME : DDNAME EQUAL NAME? ;
ddParmDEN : DEN EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmDEST : DEST EQUAL (
    DEST_VALUE |
    SYMBOLIC |
    QUOTED_STRING_FRAGMENT |
    (LPAREN (DEST_VALUE | SYMBOLIC | QUOTED_STRING_FRAGMENT)
        (COMMA (DEST_VALUE | SYMBOLIC | QUOTED_STRING_FRAGMENT))?
    RPAREN)
  ) ;
ddParmDIAGNS : DIAGNS EQUAL TRACE ;
ddParmDISP : DISP EQUAL LPAREN? ddParmDISP_STATUS? COMMA? ddParmDISP_NORMAL_TERM? COMMA? ddParmDISP_ABNORMAL_TERM? RPAREN? ;
ddParmDISP_STATUS : MOD | NEW | OLD | SHR | SYMBOLIC ;
ddParmDISP_NORMAL_TERM : CATLG | DELETE | KEEP | PASS | UNCATLG | SYMBOLIC ;
ddParmDISP_ABNORMAL_TERM : CATLG | DELETE | KEEP | PASS | UNCATLG | SYMBOLIC ;
ddParmDLM : DLM EQUAL (DLM_VAL | QUOTED_DLM_VAL) ;
//ddParmDLM : DLM (DLM_VAL | QUOTED_DLM_VAL) ;
ddParmDSID : DSID EQUAL (
    DSID_VALUE | 
    SYMBOLIC |
    (LPAREN (DSID_VALUE | SYMBOLIC) (COMMA (DSID_VERIFIED | SYMBOLIC))? RPAREN)
  ) ;
ddParmDSKEYLBL : DSKEYLBL EQUAL (QUOTED_STRING_FRAGMENT+ | SYMBOLIC) ;
ddParmDSNAME : (DSNAME | DSN) EQUAL (NAME | DATASET_NAME | ddParmReferback | QUOTED_STRING_FRAGMENT) ;
ddParmDSNTYPE : DSNTYPE EQUAL (
    DSNTYPE_VALUE |
    SYMBOLIC |
    (LPAREN (DSNTYPE_VALUE | SYMBOLIC) COMMA (NUM_LIT | SYMBOLIC) RPAREN)
  ) ;
ddParmDSORG : DSORG EQUAL (DSORG_VALUE | SYMBOLIC) ;
ddParmDUMMY : DUMMY ;
ddParmDYNAM : DYNAM ;
ddParmEATTR : EATTR EQUAL (EATTR_VALUE | SYMBOLIC) ;
ddParmEROPT : EROPT EQUAL (EROPT_VALUE | SYMBOLIC) ;
ddParmEXPDT : EXPDT EQUAL (EXPDT_VALUE | SYMBOLIC) ;
ddParmFCB : FCB EQUAL (
    (FCB_VALUE | SYMBOLIC) |
    (LPAREN
        (FCB_VALUE | SYMBOLIC)
            (COMMA (FCB_ALIGN | FCB_VERIFY | SYMBOLIC))?
    RPAREN)
  ) ;
ddParmFILEDATA : FILEDATA EQUAL (FILEDATA_VALUE | SYMBOLIC) ;
ddParmFLASH : FLASH EQUAL (
    FLASH_OVERLAY |
    NONE |
    SYMBOLIC |
    (LPAREN
        (FLASH_OVERLAY | SYMBOLIC) (COMMA (FLASH_COUNT | SYMBOLIC))?
    RPAREN)
  ) ;
ddParmFREE : FREE EQUAL (END | CLOSE | SYMBOLIC) ;
ddParmFREEVOL : FREEVOL EQUAL (END | EOV | SYMBOLIC) ;
ddParmFUNC : FUNC EQUAL (FUNC_VALUE | SYMBOLIC) ;
ddParmGDGORDER : GDGORDER EQUAL (FIFO | LIFO | USECATLG | SYMBOLIC) ;
ddParmGNCP : GNCP EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmHOLD : HOLD EQUAL (HOLD_VALUE | SYMBOLIC) ;
ddParmINTVL : INTVL EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmIPLTXID : IPLTXID EQUAL (NAME | SYMBOLIC) ;
ddParmKEYLABL1 : KEYLABL1 EQUAL (QUOTED_STRING_FRAGMENT+ | KEYLABL_VALUE | SYMBOLIC+) ;
ddParmKEYLABL2 : KEYLABL2 EQUAL (QUOTED_STRING_FRAGMENT+ | KEYLABL_VALUE | SYMBOLIC+) ;
ddParmKEYENCD1 : KEYENCD1 EQUAL (KEYENCD_VALUE | SYMBOLIC) ;
ddParmKEYENCD2 : KEYENCD2 EQUAL (KEYENCD_VALUE | SYMBOLIC) ;
ddParmKEYLEN : KEYLEN EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmKEYOFF : KEYOFF EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmLABEL : LABEL EQUAL (
    LABEL_SEQUENCE |
    ddParmRETPD |
    ddParmEXPDT |
    SYMBOLIC |
    (LPAREN (LABEL_SEQUENCE | SYMBOLIC) RPAREN) |
    (LPAREN ddParmRETPD RPAREN) |
    (LPAREN ddParmEXPDT RPAREN) |
    (LPAREN
        (LABEL_SEQUENCE | SYMBOLIC)? 
        COMMA? 
        (LABEL_TYPE | SYMBOLIC)? 
        COMMA? 
        (LABEL_PASSWORD_PROTECT | SYMBOLIC)? 
        COMMA? 
        (LABEL_I_O | SYMBOLIC)?
        COMMA?
        (ddParmRETPD | ddParmEXPDT)?
    RPAREN)
  ) ;

/*
ddParmLABEL : LABEL EQUAL 
    (LPAREN? (NUM_LIT | ddParmRETPD | ddParmEXPDT) RPAREN?) | 
    (LPAREN 
        (NUM_LIT | SYMBOLIC)? (COMMA ALPHA+? (COMMA (PASSWORD | NOPWREAD)? (COMMA ddParmRETPD? (COMMA ddParmEXPDT)?)?)?)?
    RPAREN) ;
*/
/*
It's not really a dataset name in the LGSTREAM parameter, but it
does match the same pattern.
*/
ddParmLGSTREAM : LGSTREAM EQUAL DATASET_NAME ;
ddParmLIKE : LIKE EQUAL DATASET_NAME ;
ddParmLIMCT: LIMCT EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmLRECL : LRECL EQUAL (LRECL_VALUE | SYMBOLIC) ;
ddParmMAXGENS : MAXGENS EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmMGMTCLAS : MGMTCLAS EQUAL (MGMTCLAS_VALUE | SYMBOLIC)? ;
ddParmMODE : MODE EQUAL (MODE_VALUE | SYMBOLIC) ; 
ddParmMODIFY : MODIFY EQUAL (
    MODIFY_MODULE |
    SYMBOLIC |
    (LPAREN 
        (MODIFY_MODULE | SYMBOLIC)
            (COMMA (MODIFY_TRC | SYMBOLIC))?
    RPAREN)
  ) ;

ddParmNCP : NCP EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmNTM : NTM EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmOPTCD : OPTCD EQUAL (OPTCD_VALUE | SYMBOLIC) ;
ddParmOUTLIM : OUTLIM EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmOUTPUT : OUTPUT EQUAL (ddParmReferback | 
    (LPAREN 
        ddParmReferback 
            ((COMMA COMMENT_TEXT? ddParmReferback) | 
            (inlineComment ddParmReferback))* 
    RPAREN)) ;
ddParmPATH : PATH EQUAL (QUOTED_STRING_FRAGMENT+ | PATH_VALUE) ;
ddParmPATHDISP : PATHDISP EQUAL (
    (KEEP | DELETE | SYMBOLIC) | 
    (LPAREN (KEEP | DELETE | SYMBOLIC) (COMMA (KEEP | DELETE | SYMBOLIC))? RPAREN) | 
    (LPAREN COMMA (KEEP | DELETE | SYMBOLIC) RPAREN)) ;
ddParmPATHMODE : PATHMODE EQUAL (
    PATHMODE_VALUE |
    SYMBOLIC |
    (LPAREN 
        (PATHMODE_VALUE | SYMBOLIC)
            (
              (COMMA COMMENT_TEXT? (PATHMODE_VALUE | SYMBOLIC)) | 
              (inlineComment SS (PATHMODE_VALUE | SYMBOLIC))
            )*
    RPAREN)
  ) ;
ddParmPATHOPTS : PATHOPTS EQUAL  (
    PATHOPTS_VALUE |
    SYMBOLIC |
    (LPAREN 
        (PATHOPTS_VALUE | SYMBOLIC)
            (
              (COMMA COMMENT_TEXT? (PATHOPTS_VALUE | SYMBOLIC)) | 
              (inlineComment SS (PATHOPTS_VALUE | SYMBOLIC))
            )*
    RPAREN)
  ) ;
ddParmPCI : PCI EQUAL LPAREN? (PCI_VALUE | SYMBOLIC) (COMMA (PCI_VALUE | SYMBOLIC))? RPAREN? ;
ddParmPROTECT : PROTECT EQUAL( PROTECT_VALUE | SYMBOLIC) ;
ddParmPRTSP : PRTSP EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmRECFM : RECFM EQUAL (RECFM_VALUE | SYMBOLIC) ;
ddParmRECORG : RECORG EQUAL (RECORG_VALUE | SYMBOLIC) ;
ddParmREFDD : REFDD EQUAL ddParmReferback ;
ddParmRESERVE : RESERVE EQUAL LPAREN (NUM_LIT | SYMBOLIC) COMMA (NUM_LIT | SYMBOLIC) RPAREN ;
ddParmRETPD : RETPD EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmRKP : RKP EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmRLS : RLS EQUAL (RLS_VALUE | SYMBOLIC) ;
ddParmROACCESS : ROACCESS EQUAL (
    ROACCESS_REQUEST | 
    SYMBOLIC |
    (LPAREN (ROACCESS_REQUEST | SYMBOLIC) RPAREN) | 
    (LPAREN (ROACCESS_REQUEST | SYMBOLIC) COMMA (ROACCESS_LOCK | SYMBOLIC) RPAREN)
  ) ;
ddParmSECMODEL : SECMODEL EQUAL (
    DATASET_PROFILE |
    (LPAREN DATASET_PROFILE RPAREN) | 
    (LPAREN DATASET_PROFILE COMMA SECMODEL_GENERIC RPAREN)
  ) ;
ddParmSEGMENT : SEGMENT EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmSPACE : SPACE EQUAL (
    (LPAREN
        ddParmSPACE_unit? COMMA (
            ddParmSPACE_primary |
            (LPAREN ddParmSPACE_primary?
              COMMA? ddParmSPACE_secondary? 
                COMMA? ddParmSPACE_directory? 
             RPAREN)
            )
        COMMA? (RLSE | SYMBOLIC)? COMMA? (CONTIG | MXIG | ALX | SYMBOLIC)? COMMA? (ROUND | SYMBOLIC)?
    RPAREN) |
    (LPAREN ABSTR COMMA 
      LPAREN ddParmSPACE_primary 
        (COMMA ddParmSPACE_track_address)?
          (COMMA ddParmSPACE_directory)?
      RPAREN
    RPAREN) |
    SYMBOLIC
  ) ;
ddParmSPACE_unit : (CYL | TRK | NUM_LIT | SYMBOLIC) ;
ddParmSPACE_primary : (NUM_LIT | SYMBOLIC) ;
ddParmSPACE_secondary : (NUM_LIT | SYMBOLIC) ;
ddParmSPACE_directory : (NUM_LIT | SYMBOLIC) ;
ddParmSPACE_track_address : (NUM_LIT | SYMBOLIC) ;


ddParmSPIN : SPIN EQUAL (
    NO | 
    UNALLOC |
    SYMBOLIC |
    (LPAREN UNALLOC COMMA QUOTED_STRING_FRAGMENT RPAREN) |
    (LPAREN UNALLOC COMMA (NUM_LIT | NUM_MEM_VAL | SYMBOLIC) RPAREN) |
    (LPAREN UNALLOC COMMA NOCMND RPAREN) |
    (LPAREN UNALLOC COMMA CMNDONLY RPAREN) |
    (LPAREN UNALLOC COMMA SYMBOLIC RPAREN) |
    (LPAREN SYMBOLIC RPAREN)
  ) ;

ddParmSTACK : STACK EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmSTORCLAS : STORCLAS EQUAL (STORCLAS_VALUE | SYMBOLIC)? ;
ddParmSUBSYS : SUBSYS EQUAL (
    SUBSYS_NAME |
    SYMBOLIC |
    (LPAREN
        (SUBSYS_NAME | SYMBOLIC)
            (
              (COMMA COMMENT_TEXT? (SUBSYS_PARM | QUOTED_STRING_FRAGMENT | SYMBOLIC)) | 
              (inlineComment SS (SUBSYS_PARM | QUOTED_STRING_FRAGMENT | SYMBOLIC))
            )*
    RPAREN)
  ) ;
/*
ddParmSUBSYS : SUBSYS EQUAL (
    (SIMPLE_STRING | QUOTED_STRING_FRAGMENT) |
    (LPAREN (SIMPLE_STRING | QUOTED_STRING_FRAGMENT) (
        (COMMA (SIMPLE_STRING | QUOTED_STRING_FRAGMENT)) |
        (inlineComment SS (SIMPLE_STRING | QUOTED_STRING_FRAGMENT))
      )*
    RPAREN)
  ) ;
*/
ddParmSYMBOLS : SYMBOLS EQUAL (
    SYMBOLIC |
    SYMBOLS_VALUE |
    (LPAREN
        (SYMBOLS_VALUE | SYMBOLIC)
            (COMMA (LOGGING_DDNAME | SYMBOLIC))?
    RPAREN)
  ) ;
ddParmSYMLIST : SYMLIST EQUAL (
    SYMLIST_VALUE |
    (LPAREN SYMLIST_VALUE (
        (COMMA COMMENT_TEXT? SYMLIST_VALUE) |
        (inlineComment SS SYMLIST_VALUE)
      )*
    RPAREN)
  ) ;

ddParmSYSOUT : SYSOUT EQUAL (
    sysoutClass |
    (LPAREN COMMA RPAREN ) |
    (LPAREN sysoutClass COMMA? sysoutWriter? COMMA? sysoutFormOrCase? RPAREN)
  ) ;

sysoutClass : (SYSOUT_CLASS | QUOTED_STRING_FRAGMENT | SYMBOLIC) ;
sysoutWriter : (SYSOUT_WRITER | SYSOUT_INTRDR | SYMBOLIC) ;
sysoutFormOrCase : (SYSOUT_FORM | SYMBOLIC) ;

ddParmTERM : TERM EQUAL (TERM_VALUE | SYMBOLIC) ;
ddParmTHRESH : THRESH EQUAL (NUM_LIT | SYMBOLIC) ;
ddParmTRTCH : TRTCH EQUAL (TRTCH_VALUE | SYMBOLIC) ;
ddParmUCS : UCS EQUAL (
    UCS_CODE |
    SYMBOLIC |
    (LPAREN 
        (UCS_CODE | SYMBOLIC) 
          COMMA? (UCS_FOLD | SYMBOLIC)? 
            COMMA? (UCS_VERIFY | SYMBOLIC)?
    RPAREN)
  ) ;

/*
Here's the thing with symbolic parameters: they can be abused because
their values are substituted early in the interpretation process.

Thus...

UNIT=(&UNIT&COUNT&DEFER)

...where, earlier in the job...

SET UNIT=CART
SET COUNT=
SET DEFER=',3,DEFER'

...resulting in, after conversion...

UNIT=(CART,3,DEFER)

...which is syntactically correct.  And so this sort of behavior
must be allowed for herein, however much we may wish otherwise.

*/

ddParmUNIT : UNIT EQUAL (
    ddParmUNIT_UNIT |
    (UNIT_AFF EQUAL UNIT_DDNAME) |
    (LPAREN 
        ddParmUNIT_UNIT? 
            COMMA? (UNIT_COUNT | UNIT_ALLOC | SYMBOLIC+)? 
                COMMA? (UNIT_DEFER | SYMBOLIC+)? 
                    COMMA? (UNIT_SMSHONOR | SYMBOLIC+)?
    RPAREN)
  ) ;

ddParmUNIT_UNIT : (UNIT_NUMBER | UNIT_DEVICE_TYPE | UNIT_GROUP_NAME | SYMBOLIC+) ;

ddParmVOLUME : (VOL | VOLUME) EQUAL (
    VOL_PRIVATE |
    ddParmVOLUME_SER |
    ddParmVOLUME_REF |
    (LPAREN
        VOL_PRIVATE? 
        COMMA? VOL_RETAIN?
        COMMA? VOL_SEQ_NB?
        COMMA? VOL_COUNT?
        COMMA? ddParmVOLUME_SER? 
        COMMA? ddParmVOLUME_REF? 
    RPAREN)
  ) ;

ddParmVolSer : (VOL_SER_NB | QUOTED_STRING_FRAGMENT) ;
ddParmVOLUME_SER : 
    (VOL_SER EQUAL ddParmVolSer) |
    (VOL_SER EQUAL
        LPAREN  ddParmVolSer (
            (COMMA COMMENT_TEXT? ddParmVolSer)* |
            (inlineComment SS ddParmVolSer)* 
        ) RPAREN
    ) ;

ddParmVOLUME_REF : VOL_REF EQUAL (ddParmReferback | DATASET_NAME | QUOTED_STRING_FRAGMENT) ;

/*
The ddParmAMP_ stuff isn't used in this parser, it turns out the 
AMP DD parameter is just quoted strings.  But... I bet this would
be useful as a separate parser (and lexer) just for this one odd
parameter.  Maybe to people tuning VSAM.

TODO separate the AMP stuff.
*/
ddParmAMP_Parameter : ddParmAMP_ACCBIAS | ddParmAMP_AMORG | ddParmAMP_BUFND | ddParmAMP_BUFNI | ddParmAMP_BUFSP | ddParmAMP_CROPS | ddParmAMP_FRLOG | ddParmAMP_MSG | ddParmAMP_OPTCD | ddParmAMP_RECFM | ddParmAMP_RMODE31 | ddParmAMP_SMBDFR | ddParmAMP_SMBHWT | ddParmAMP_SMBVSP | ddParmAMP_SMBVSPI | ddParmAMP_STRNO | ddParmAMP_SYNAD | ddParmAMP_TRACE ;

ddParmAMP_ACCBIAS : ACCBIAS EQUAL (USER | SYSTEM | DO | DW | SO | SW) ;
ddParmAMP_AMORG : AMORG ;
ddParmAMP_BUFND : BUFND EQUAL NUM_LIT ;
ddParmAMP_BUFNI : BUFNI EQUAL NUM_LIT ;
ddParmAMP_BUFSP : BUFSP EQUAL NUM_LIT ;
ddParmAMP_CROPS : CROPS EQUAL (RCK | NCK | NRE | NRC) ;
ddParmAMP_FRLOG : FRLOG EQUAL (NONE | REDO) ;
ddParmAMP_MSG : MSG EQUAL SMBBIAS ;
ddParmAMP_OPTCD : ddParmOPTCD ;
ddParmAMP_RECFM : ddParmRECFM ;
ddParmAMP_RMODE31 : RMODE31 EQUAL (ALL | BUFF | CB | NONE) ;
ddParmAMP_SMBDFR : SMBDFR EQUAL ALPHA ;
ddParmAMP_SMBHWT : SMBHWT EQUAL NUM_LIT ;
ddParmAMP_SMBVSP : SMBVSP EQUAL NUM_MEM_VAL ;
ddParmAMP_SMBVSPI : SMBVSPI EQUAL NUM_MEM_VAL ;
ddParmAMP_STRNO : STRNO EQUAL NUM_LIT;
ddParmAMP_SYNAD : SYNAD EQUAL NAME;

//ddParmReferback : ASTERISK DOT ddName (DOT ddName (DOT ddName)?)? ;
ddParmReferback : ASTERISK DOT NAME (DOT NAME (DOT NAME)?)? ;

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


//jobCard : SS jobName JOB LPAREN? jobAccountingInformation? RPAREN? inlineComment? (COMMA jobProgrammerName)? inlineComment? (((COMMA | inlineComment) SS?)? jobKeywordParameter inlineComment?)* ;

jobCard : SS jobName JOB LPAREN? jobAccountingInformation? RPAREN? inlineComment? (COMMA jobProgrammerName)?  (((COMMA | inlineComment) SS?)? jobKeywordParameter inlineComment?)* ;

jobName : NAME_FIELD ;

jobAccountingInformation : jobAccountingInformationSimple | jobAccountingInformationMultiLine ;

jobAccountingInformationSimple : jobAccountingString (COMMA jobAccountingString?)* ;
jobAccountingInformationMultiLine : jobAccountingString (COMMA? SS? jobAccountingString)* ;
jobAccountingString : (QUOTED_STRING_FRAGMENT | JOB_ACCT_MODE1_UNQUOTED_STRING+ | JOB_ACCT_MODE2_UNQUOTED_STRING+) ;
jobProgrammerName : (QUOTED_STRING_PROGRAMMER_NAME | JOB_PROGRAMMER_NAME_MODE_UNQUOTED_STRING+) ;

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


jobParmNOTIFY : NOTIFY EQUAL ((NAME (DOT NAME)?) | SYMBOLIC) ;

jobParmPASSWORD : PASSWORD EQUAL LPAREN? NAME (COMMA NAME)? RPAREN? ;

jobParmPERFORM : PERFORM EQUAL NUM_LIT ;

jobParmPRTY : PRTY EQUAL NUM_LIT ;

jobParmRD : RD EQUAL RD_VALUE ;

jobParmREGION : REGION EQUAL (NUM_MEM_VAL | ALNUMNAT) ;

jobParmREGIONX : REGIONX EQUAL LPAREN? (NUM_MEM_VAL | ALNUMNAT) (COMMA (NUM_MEM_VAL | ALNUMNAT)) RPAREN? ;

jobParmRESTART : RESTART EQUAL LPAREN? (ASTERISK | (NAME (DOT NAME)?) | DATASET_NAME) (COMMA (NAME | UNQUOTED_STRING | QUOTED_STRING_FRAGMENT))? RPAREN? ;

jobParmSECLABEL : SECLABEL EQUAL NAME ;

jobParmSCHENV : SCHENV EQUAL NAME ;

jobParmSYSAFF : SYSAFF EQUAL HYPHEN? LPAREN? HYPHEN? (NAME | ANY | IND | ASTERISK) (COMMA HYPHEN? (NAME | ANY | IND | ASTERISK))* RPAREN? ;

jobParmSYSTEM : SYSTEM EQUAL HYPHEN? LPAREN? HYPHEN? (ALNUMNAT | ANY | JGLOBAL | JLOCAL | ASTERISK) (COMMA HYPHEN? (ALNUMNAT | ANY | JGLOBAL | JLOCAL | ASTERISK))* RPAREN? ;

jobParmTIME : TIME EQUAL LPAREN? (NOLIMIT | MAXIMUM | FOURTEENFORTY | (NUM_LIT (COMMA NUM_LIT)?)) RPAREN? ;

jobParmTYPRUN : TYPRUN EQUAL (COPY | HOLD | JCLHOLD | SCAN) ;

jobParmUJOBCORR : UJOBCORR EQUAL (NAME | UNQUOTED_STRING | QUOTED_STRING_FRAGMENT) ;

jobParmUSER : USER EQUAL NAME ;

commandStatement : SS NAME_FIELD COMMAND QUOTED_STRING_FRAGMENT ;
 
cntlStatement : SS NAME_FIELD CNTL ASTERISK inlineComment* ;

endcntlStatement : SS NAME_FIELD ENDCNTL inlineComment* ;

cntlStatementAmalgamation : cntlStatement CNTL_DATA* endcntlStatement ;

exportStatement : SS NAME_FIELD? EXPORT ddParmSYMLIST ;
/*
exportStatement : SS NAME_FIELD? EXPORT SYMLIST EQUAL (
    ASTERISK |
    (LPAREN NAME (COMMA | (inlineComment SS) NAME)* RPAREN)
  ) ;
*/

ifStatement : SS NAME_FIELD? IF LPAREN* IF_CHECK ((SS CONTINUATION_WS)? LPAREN* IF_CHECK RPAREN*)* RPAREN* THEN inlineComment? ;

elseStatement : SS NAME_FIELD? ELSE inlineComment? ;

endifStatement : SS NAME_FIELD? ENDIF inlineComment? ;

includeStatement : SS NAME_FIELD? INCLUDE MEMBER EQUAL MEMBER_NAME inlineComment? ;

//jcllibStatement : SS NAME_FIELD? JCLLIB ORDER EQUAL LPAREN? (DATASET_NAME | QUOTED_STRING_FRAGMENT) ((COMMA | (inlineComment SS)) (DATASET_NAME | QUOTED_STRING_FRAGMENT))* RPAREN? ;
jcllibStatement : SS NAME_FIELD? JCLLIB ORDER EQUAL (
    ((DATASET_NAME | QUOTED_STRING_FRAGMENT) inlineComment?) |
    (LPAREN 
        (DATASET_NAME | QUOTED_STRING_FRAGMENT) 
    RPAREN inlineComment?) |
    (LPAREN 
        (DATASET_NAME | QUOTED_STRING_FRAGMENT) 
            (((COMMA COMMENT_TEXT?) | inlineComment) (DATASET_NAME | QUOTED_STRING_FRAGMENT))* 
    RPAREN inlineComment?)
  ) ;

notifyStatement : SS NAME_FIELD? NOTIFY 
    (EMAIL EQUAL QUOTED_STRING_FRAGMENT) | (USER EQUAL (SYMBOLIC | ((NAME DOT)? NAME))) 
        ((COMMA |
         (inlineComment SS)) 
         TYPE EQUAL (EMAIL | MSG))? 
        ((COMMA |
         (inlineComment SS)) 
         WHEN EQUAL LPAREN* WHEN_CHECK 
            (SS? LPAREN* WHEN_CHECK RPAREN*)* RPAREN* inlineComment?)?
    ;

yesOrNo : YES | NO | ALPHA ;

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


