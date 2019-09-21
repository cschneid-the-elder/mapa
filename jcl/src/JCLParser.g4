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

execJCL : jesExecutionControlStatements (jobCard (jclCommandStatement | jes2CntlStatement | commandStatement | commentStatement | joblibAmalgamation | syschkAmalgamation | jcllibStatement | cntlStatementAmalgamation | notifyStatement | xmitStatement)* (jclCommandStatement | commandStatement | commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | procStatement | pendStatement | scheduleStatement | setStatement)*)+ EOF?;

procJCL : commandStatement? procStatement (commandStatement | commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | setStatement)+ ;

procStatement : SS procName? PROC definedSymbolicParameters* ;

defineSymbolicParameter : PROC_PARM_NAME EQUAL (QUOTED_STRING_FRAGMENT | PROC_PARM_VALUE)? ;

definedSymbolicParameters : defineSymbolicParameter (
    ((COMMA | (inlineComment SS CONTINUATION_WS)) defineSymbolicParameter)* |
    (COMMENT_TEXT?)
  ) ;

commentStatement : COMMENT_FLAG (COMMENT_TEXT | EOF)? ;

inlineComment : COMMENT_FLAG_INLINE? COMMENT_TEXT ;

stepName : NAME_FIELD ;

procName : NAME_FIELD ;

jclStep : execStatement (cntlStatementAmalgamation | ddStatementAmalgamation | outputStatement | includeStatement | commentStatement)* ;

/*
TODO
If I can figure out a way to only match SYMBOLIC_SUBSTRING after I've
matched SYMBOLIC then I can reinstate this.  Until then, substringing
system symbols will have to wait.
keywordOrSymbolic : (QUOTED_STRING_FRAGMENT+ | KEYWORD_VALUE | (SYMBOLIC SYMBOLIC_SUBSTRING?)) ;
*/

keywordOrSymbolic : (QUOTED_STRING_FRAGMENT+ | KEYWORD_VALUE | SYMBOLIC) ;

execStatement : execPgmStatement | execProcStatement ;

execPgmStatement : SS stepName? EXEC PGM EQUAL keywordOrSymbolic (
    execPgmClosure1 |
    execPgmClosure2 |
    execPgmClosure3 |
    execPgmClosure4 |
    execPgmClosure5
  )*? ;
execPgmClosure1 : COMMA commentStatement* SS execParameter inlineComment? ;
execPgmClosure2 : COMMA SS execParameter inlineComment? ;
execPgmClosure3 : COMMA? execParameter inlineComment? ;
execPgmClosure4 : inlineComment commentStatement* SS? execParameter inlineComment? ;
execPgmClosure5 : inlineComment commentStatement* EOF ;

execProcStatement : SS stepName? EXEC (PROC_EX EQUAL)? keywordOrSymbolic (
    execProcClosure1 |
    execProcClosure2 |
    execProcClosure3 |
    execProcClosure4 |
    execProcClosure5
  )*? ;
execProcClosure1 : COMMA commentStatement* SS (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
execProcClosure2 : COMMA SS (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
execProcClosure3 : COMMA (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
execProcClosure4 : inlineComment commentStatement* SS? (defineSymbolicParameter | execParameterOverrides) inlineComment? ;
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

execParmACCT : EXEC_ACCT EQUAL singleOrMultipleValue ;

execParmADDRSPC : EXEC_ADDRSPC EQUAL keywordOrSymbolic ;

execParmCCSID : CCSID EQUAL keywordOrSymbolic ;

execParmCOND : EXEC_COND EQUAL (
    keywordOrSymbolic |
    (
      LPAREN? 
        (
          COMMA?
          COMMENT_TEXT?
          commentStatement*
          LPAREN?
            keywordOrSymbolic (COMMA keywordOrSymbolic)*
          RPAREN?
          COMMENT_TEXT?
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

execParmREGIONX : EXEC_REGIONX EQUAL 
    LPAREN?
        keywordOrSymbolic
            (COMMA keywordOrSymbolic)? 
    RPAREN?
  ;

execParmRLSTMOUT : EXEC_RLSTMOUT EQUAL keywordOrSymbolic ;

execParmTIME : EXEC_TIME EQUAL 
    LPAREN? (
        keywordOrSymbolic |
        (keywordOrSymbolic (COMMA keywordOrSymbolic)?) |
        (keywordOrSymbolic? COMMA keywordOrSymbolic)
    ) RPAREN? ;

execParmTVSMSG : EXEC_TVSMSG EQUAL keywordOrSymbolic ;

execParmTVSAMCOM : EXEC_TVSAMCOM EQUAL LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN ;

ddStatement : SS ddName DD ddParameter? (
    ddStatementClosure1 |
    ddStatementClosure2 |
    ddStatementClosure3 |
    ddStatementClosure4 |
    inlineComment)* 
      ddParmASTERISK_DATA* ;

ddStatementClosure1 : COMMA? commentStatement* SS? ddParameter inlineComment? ;
ddStatementClosure2 : COMMA? COMMENT_FLAG? COMMENT_TEXT? SS? ddParameter inlineComment? ;
ddStatementClosure3 : COMMA? ddParameter inlineComment? ;
ddStatementClosure4 : inlineComment commentStatement* SS? ddParameter inlineComment? ;

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

ddParmACCODE : ACCODE EQUAL keywordOrSymbolic;
ddParmAMP : AMP EQUAL (
    (LPAREN 
        QUOTED_STRING_FRAGMENT ((COMMA | inlineComment)? SS? COMMENT_TEXT? QUOTED_STRING_FRAGMENT)*
    RPAREN) |
    (QUOTED_STRING_FRAGMENT inlineComment?) |
    (LPAREN? AMORG RPAREN?)
  ) ;
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
ddParmBUFSIZE : BUFSIZE EQUAL keywordOrSymbolic ;
ddParmBURST : BURST EQUAL keywordOrSymbolic ;
ddParmCCSID : CCSID EQUAL keywordOrSymbolic ;
ddParmCHARS : CHARS EQUAL LPAREN? keywordOrSymbolic (COMMA keywordOrSymbolic)* RPAREN? ;
ddParmCHKPT : CHKPT EQUAL keywordOrSymbolic ;
ddParmCNTL : CNTL EQUAL ddParmReferback ;
ddParmCOPIES : COPIES EQUAL (
    keywordOrSymbolic |
    (
      LPAREN 
        keywordOrSymbolic?
          (
            COMMA LPAREN (keywordOrSymbolic (COMMA keywordOrSymbolic)*)
                  RPAREN
          )?
      RPAREN
    )
  ) ;
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
        ddParmDCB_Parameter (
            (COMMA COMMENT_TEXT? SS? ddParmDCB_Parameter) |
            (COMMA commentStatement* SS? ddParmDCB_Parameter) |
            (inlineComment SS? ddParmDCB_Parameter)
          )*
    RPAREN) 
  ) ;

ddParmDCB_Parameter : ddParmBFALN | ddParmBFTEK | ddParmBLKSIZE | ddParmBUFIN | ddParmBUFL | ddParmBUFMAX | ddParmBUFNO | ddParmBUFOFF | ddParmBUFOUT | ddParmBUFSIZE | ddParmCPRI | ddParmCYLOFL | ddParmDEN | ddParmDIAGNS | ddParmDSORG | ddParmEROPT | ddParmFUNC | ddParmGNCP | ddParmINTVL | ddParmIPLTXID | ddParmKEYLEN | ddParmLIMCT| ddParmLRECL | ddParmMODE |  ddParmNCP | ddParmNTM | ddParmOPTCD | ddParmPCI | ddParmPRTSP | ddParmRECFM | ddParmRESERVE | ddParmRKP | ddParmSTACK | ddParmTHRESH | ddParmTRTCH | DATASET_NAME | ddParmReferback ;


ddParmDDNAME : DDNAME EQUAL keywordOrSymbolic? ;
ddParmDEN : DEN EQUAL keywordOrSymbolic ;
ddParmDEST : DEST EQUAL  (
    keywordOrSymbolic |
    (LPAREN keywordOrSymbolic RPAREN)
  )
  ;
ddParmDIAGNS : DIAGNS EQUAL KEYWORD_VALUE ;
ddParmDISP : DISP EQUAL LPAREN? ddParmDISP_STATUS? COMMA? ddParmDISP_NORMAL_TERM? COMMA? ddParmDISP_ABNORMAL_TERM? RPAREN? ;
ddParmDISP_STATUS : DISP_MOD | DISP_NEW | DISP_OLD | DISP_SHR | SYMBOLIC ;
ddParmDISP_NORMAL_TERM : DISP_CATLG | DISP_DELETE | DISP_KEEP | DISP_PASS | DISP_UNCATLG | SYMBOLIC ;
ddParmDISP_ABNORMAL_TERM : DISP_CATLG | DISP_DELETE | DISP_KEEP | DISP_PASS | DISP_UNCATLG | SYMBOLIC ;
ddParmDLM : DLM EQUAL (DLM_VAL | QUOTED_DLM_VAL) ;
ddParmDSID : DSID EQUAL (
    DSID_VALUE | 
    SYMBOLIC |
    (LPAREN (DSID_VALUE | SYMBOLIC) (COMMA (DSID_VERIFIED | SYMBOLIC))? RPAREN)
  ) ;
ddParmDSKEYLBL : DSKEYLBL EQUAL keywordOrSymbolic ;
ddParmDSNAME : (DSNAME | DSN) EQUAL (NAME | DATASET_NAME | ddParmReferback | QUOTED_STRING_FRAGMENT) ;
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
ddParmHOLD : HOLD EQUAL keywordOrSymbolic ;
ddParmINTVL : INTVL EQUAL keywordOrSymbolic ;
ddParmIPLTXID : IPLTXID EQUAL keywordOrSymbolic ;
ddParmKEYLABL1 : KEYLABL1 EQUAL keywordOrSymbolic ;
ddParmKEYLABL2 : KEYLABL2 EQUAL keywordOrSymbolic ;
ddParmKEYENCD1 : KEYENCD1 EQUAL keywordOrSymbolic ;
ddParmKEYENCD2 : KEYENCD2 EQUAL keywordOrSymbolic ;
ddParmKEYLEN : KEYLEN EQUAL keywordOrSymbolic ;
ddParmKEYOFF : KEYOFF EQUAL keywordOrSymbolic ;
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
It's not really a dataset name in the LGSTREAM parameter, but it
does match the same pattern.
*/
ddParmLGSTREAM : LGSTREAM EQUAL DATASET_NAME ;
ddParmLIKE : LIKE EQUAL DATASET_NAME ;
ddParmLIMCT: LIMCT EQUAL keywordOrSymbolic ;
ddParmLRECL : LRECL EQUAL keywordOrSymbolic ;
ddParmMAXGENS : MAXGENS EQUAL keywordOrSymbolic ;
ddParmMGMTCLAS : MGMTCLAS EQUAL keywordOrSymbolic? ;
ddParmMODE : MODE EQUAL keywordOrSymbolic ; 
ddParmMODIFY : MODIFY EQUAL singleOrMultipleValue ;
ddParmNCP : NCP EQUAL keywordOrSymbolic ;
ddParmNTM : NTM EQUAL keywordOrSymbolic ;
ddParmOPTCD : OPTCD EQUAL keywordOrSymbolic ;
ddParmOUTLIM : OUTLIM EQUAL keywordOrSymbolic ;
ddParmOUTPUT : OUTPUT EQUAL (OUTPUT_PARM_REFERENCE | 
    (LPAREN 
        OUTPUT_PARM_REFERENCE 
            (
              (COMMA COMMENT_TEXT? OUTPUT_PARM_REFERENCE) | 
              (COMMA commentStatement* OUTPUT_PARM_REFERENCE) | 
              (inlineComment OUTPUT_PARM_REFERENCE)
            )* 
    RPAREN)) ;
ddParmPATH : PATH EQUAL keywordOrSymbolic ;
ddParmPATHDISP : PATHDISP EQUAL (
    (PATHDISP_KEEP | PATHDISP_DELETE | SYMBOLIC) | 
    (LPAREN (PATHDISP_KEEP | PATHDISP_DELETE | SYMBOLIC) (COMMA (PATHDISP_KEEP | PATHDISP_DELETE | SYMBOLIC))? RPAREN) | 
    (LPAREN COMMA (PATHDISP_KEEP | PATHDISP_DELETE | SYMBOLIC) RPAREN)) ;
ddParmPATHMODE : PATHMODE EQUAL (
    PATHMODE_VALUE |
    SYMBOLIC |
    (LPAREN 
        (PATHMODE_VALUE | SYMBOLIC)
            (
              (COMMA COMMENT_TEXT? (PATHMODE_VALUE | SYMBOLIC)) | 
              (COMMA commentStatement* (PATHMODE_VALUE | SYMBOLIC)) | 
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
              (COMMA commentStatement* (PATHOPTS_VALUE | SYMBOLIC)) | 
              (inlineComment SS (PATHOPTS_VALUE | SYMBOLIC))
            )*
    RPAREN)
  ) ;
ddParmPCI : PCI EQUAL singleOrMultipleValue ;
ddParmPROTECT : PROTECT EQUAL keywordOrSymbolic ;
ddParmPRTSP : PRTSP EQUAL keywordOrSymbolic ;
ddParmRECFM : RECFM EQUAL keywordOrSymbolic ;
ddParmRECORG : RECORG EQUAL keywordOrSymbolic ;
ddParmREFDD : REFDD EQUAL ddParmReferback ;
ddParmRESERVE : RESERVE EQUAL LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN ;
ddParmRETPD : RETPD EQUAL keywordOrSymbolic ;
ddParmRKP : RKP EQUAL keywordOrSymbolic ;
ddParmRLS : RLS EQUAL keywordOrSymbolic ;
ddParmROACCESS : ROACCESS EQUAL singleOrMultipleValue ;
ddParmSECMODEL : SECMODEL EQUAL singleOrMultipleValue ;
ddParmSEGMENT : SEGMENT EQUAL keywordOrSymbolic ;
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
    KEYWORD_VALUE | 
    SYMBOLIC |
    (LPAREN KEYWORD_VALUE COMMA QUOTED_STRING_FRAGMENT RPAREN) |
    (LPAREN KEYWORD_VALUE COMMA keywordOrSymbolic RPAREN) |
    (LPAREN KEYWORD_VALUE RPAREN) |
    (LPAREN KEYWORD_VALUE COMMA KEYWORD_VALUE RPAREN) |
    (LPAREN KEYWORD_VALUE COMMA SYMBOLIC RPAREN) |
    (LPAREN SYMBOLIC RPAREN)
  ) ;

ddParmSTACK : STACK EQUAL keywordOrSymbolic ;
ddParmSTORCLAS : STORCLAS EQUAL keywordOrSymbolic? ;
ddParmSUBSYS : SUBSYS EQUAL singleOrMultipleValue ;

ddParmSYMBOLS : SYMBOLS EQUAL singleOrMultipleValue ;

ddParmSYMLIST : SYMLIST EQUAL singleOrMultipleValue ;
ddParmSYSOUT : SYSOUT EQUAL (
    sysoutClass |
    (LPAREN COMMA RPAREN ) |
    (LPAREN sysoutClass COMMA? sysoutWriter? COMMA? sysoutFormOrCase? RPAREN)
  ) ;

sysoutClass : (SYSOUT_CLASS | QUOTED_STRING_FRAGMENT | SYMBOLIC) ;
sysoutWriter : (SYSOUT_WRITER | SYSOUT_INTRDR | SYMBOLIC) ;
sysoutFormOrCase : (SYSOUT_FORM | SYMBOLIC) ;

ddParmTERM : TERM EQUAL keywordOrSymbolic ;
ddParmTHRESH : THRESH EQUAL keywordOrSymbolic ;
ddParmTRTCH : TRTCH EQUAL keywordOrSymbolic ;
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
    SYMBOLIC |
    ddParmVOLUME_SER |
    ddParmVOLUME_REF |
    (LPAREN
        (VOL_PRIVATE | SYMBOLIC)?
        COMMA? COMMENT_TEXT? (VOL_RETAIN | SYMBOLIC)?
        COMMA? COMMENT_TEXT? (VOL_SEQ_NB | SYMBOLIC)?
        COMMA? COMMENT_TEXT? (VOL_COUNT | SYMBOLIC)?
        COMMA? COMMENT_TEXT? ddParmVOLUME_SER? 
        COMMA? COMMENT_TEXT? ddParmVOLUME_REF? 
    RPAREN)
  ) ;

ddParmVolSer : (VOL_SER_NB | QUOTED_STRING_FRAGMENT | SYMBOLIC) ;
ddParmVOLUME_SER : 
    (VOL_SER EQUAL ddParmVolSer) |
    (VOL_SER EQUAL
        LPAREN  ddParmVolSer (
            (COMMA COMMENT_TEXT? ddParmVolSer)* |
            (COMMA commentStatement* ddParmVolSer)* |
            (inlineComment SS ddParmVolSer)* 
        ) RPAREN
    ) ;

ddParmVOLUME_REF : VOL_REF EQUAL (VOL_REF_REFERBACK | DATASET_NAME | QUOTED_STRING_FRAGMENT | SYMBOLIC) ;

ddParmReferback : DSN_MODE_REFERENCE |
    REFERBACK |
    (ASTERISK DOT NAME (DOT NAME (DOT NAME)?)?)
   ;


joblibStatement : SS JOBLIB DD joblibParameter (((COMMA | inlineComment) SS?)? joblibParameter inlineComment?)* ;

joblibConcatenation : SS DD joblibParameter (((COMMA | inlineComment) SS?)? joblibParameter inlineComment?)* ;

joblibAmalgamation : joblibStatement joblibConcatenation* ;

joblibParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


syschkStatement : SS SYSCHK DD syschkParameter (((COMMA | inlineComment) SS?)? syschkParameter inlineComment?)* ;

syschkConcatenation : SS DD syschkParameter (((COMMA | inlineComment) SS?)? syschkParameter inlineComment?)* ;

syschkAmalgamation : syschkStatement syschkConcatenation* ;

syschkParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


jobCard : SS jobName JOB LPAREN? jobAccountingInformation? RPAREN? inlineComment? commentStatement* (COMMA? jobProgrammerName)?  (((COMMA | inlineComment) commentStatement* SS?)? jobKeywordParameter inlineComment?)* ;

jobName : NAME_FIELD ;

jobAccountingInformation : jobAccountingInformationSimple | jobAccountingInformationMultiLine ;

jobAccountingInformationSimple : jobAccountingString (COMMA jobAccountingString?)* ;
jobAccountingInformationMultiLine : jobAccountingString (COMMA? SS? jobAccountingString)* ;
jobAccountingString : (QUOTED_STRING_FRAGMENT | JOB_ACCT_MODE1_UNQUOTED_STRING+ | JOB_ACCT_MODE2_UNQUOTED_STRING+) ;
jobProgrammerName : (QUOTED_STRING_PROGRAMMER_NAME | JOB_PROGRAMMER_NAME_UNQUOTED_STRING+) ;

jobKeywordParameter : jobParmADDRSPC | jobParmBYTES | jobParmCARDS | jobParmCCSID | jobParmCLASS | jobParmCOND | jobParmDSENQSHR | jobParmEMAIL | jobParmGDGBIAS | jobParmGROUP | jobParmJESLOG | jobParmJOBRC | jobParmLINES | jobParmMEMLIMIT | jobParmMSGCLASS | jobParmMSGLEVEL | jobParmNOTIFY | jobParmPAGES | jobParmPASSWORD | jobParmPERFORM | jobParmPRTY | jobParmRD | jobParmREGION | jobParmREGIONX | jobParmRESTART | jobParmSECLABEL | jobParmSCHENV | jobParmSYSAFF | jobParmSYSTEM | jobParmTIME | jobParmTYPRUN | jobParmUJOBCORR | jobParmUSER ;

jobParmBYTES : BYTES EQUAL (keywordOrSymbolic | (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN)) ;

jobParmCARDS : CARDS EQUAL (keywordOrSymbolic | (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN)) ;

jobParmLINES : LINES EQUAL (keywordOrSymbolic | (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN)) ;

jobParmPAGES : PAGES EQUAL (keywordOrSymbolic | (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN)) ;

jobParmADDRSPC : ADDRSPC EQUAL keywordOrSymbolic ;

jobParmCCSID : CCSID EQUAL keywordOrSymbolic ;

jobParmCLASS : CLASS EQUAL keywordOrSymbolic ;

jobParmCOND : COND EQUAL LPAREN? LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN (COMMA LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN)* RPAREN? ;

jobParmDSENQSHR : DSENQSHR EQUAL keywordOrSymbolic ;

jobParmEMAIL : EMAIL EQUAL keywordOrSymbolic ;

jobParmGDGBIAS : GDGBIAS EQUAL keywordOrSymbolic ;

jobParmGROUP : GROUP EQUAL keywordOrSymbolic ;

jobParmJESLOG : JESLOG EQUAL (
    (LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN) | 
    keywordOrSymbolic
  ) 
  ;

jobParmJOBRC : JOBRC EQUAL (keywordOrSymbolic | (LPAREN keywordOrSymbolic COMMA keywordOrSymbolic RPAREN)) ;

jobParmMEMLIMIT : MEMLIMIT EQUAL keywordOrSymbolic ;

jobParmMSGCLASS : MSGCLASS EQUAL keywordOrSymbolic ;

jobParmMSGLEVEL : MSGLEVEL EQUAL (
    keywordOrSymbolic |
    (LPAREN keywordOrSymbolic? (COMMA keywordOrSymbolic)? RPAREN) 
  ) 
  ;


jobParmNOTIFY : NOTIFY EQUAL keywordOrSymbolic ;

nameOrSymbolic : ((NAME (DOT NAME)?) | SYMBOLIC) ;

jobParmPASSWORD : PASSWORD EQUAL LPAREN? keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN? ;

jobParmPERFORM : PERFORM EQUAL keywordOrSymbolic ;

jobParmPRTY : PRTY EQUAL keywordOrSymbolic ;

jobParmRD : RD EQUAL keywordOrSymbolic ;

jobParmREGION : REGION EQUAL keywordOrSymbolic ;

jobParmREGIONX : REGIONX EQUAL LPAREN? keywordOrSymbolic (COMMA keywordOrSymbolic) RPAREN? ;

jobParmRESTART : RESTART EQUAL LPAREN? keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN? ;

jobParmSECLABEL : SECLABEL EQUAL keywordOrSymbolic ;

jobParmSCHENV : SCHENV EQUAL keywordOrSymbolic ;

jobParmSYSAFF : SYSAFF EQUAL keywordOrSymbolic? LPAREN? keywordOrSymbolic? (COMMA keywordOrSymbolic)* RPAREN? ;

jobParmSYSTEM : SYSTEM EQUAL keywordOrSymbolic? LPAREN? keywordOrSymbolic (COMMA keywordOrSymbolic)* RPAREN? ;

jobParmTIME : TIME EQUAL LPAREN? (keywordOrSymbolic | (keywordOrSymbolic (COMMA keywordOrSymbolic)?)) RPAREN? ;

jobParmTYPRUN : TYPRUN EQUAL keywordOrSymbolic ;

jobParmUJOBCORR : UJOBCORR EQUAL keywordOrSymbolic ;

jobParmUSER : USER EQUAL keywordOrSymbolic ;

commandStatement : SS NAME_FIELD COMMAND QUOTED_STRING_FRAGMENT+ ;

jclCommandStatement : SS JCL_COMMAND JCL_COMMAND_PARM COMMENT_TEXT? ;

cntlStatement : SS NAME_FIELD? CNTL ASTERISK? (inlineComment | COMMENT_TEXT)? ;

endcntlStatement : (SS NAME_FIELD ENDCNTL inlineComment*) | CNTL_MODE_TERMINATORX COMMENT_TEXT?;

cntlStatementAmalgamation : cntlStatement CNTL_DATA* endcntlStatement ;

exportStatement : SS NAME_FIELD? EXPORT SYMLIST EQUAL singleOrMultipleValue ;

/*
ifStatement : SS NAME_FIELD? IF
    NOT_SYMBOL* LPAREN*
      ifTest RPAREN* (IF_LOGICAL NOT_SYMBOL* LPAREN* ifTest RPAREN*)*
    RPAREN*
    THEN COMMENT_TEXT?
  ;
*/

ifStatement : SS NAME_FIELD? IF
    NOT_SYMBOL* LPAREN*
      ifTest RPAREN* (IF_LOGICAL NOT_SYMBOL* LPAREN* ifTest RPAREN*)*
    RPAREN*
    THEN COMMENT_TEXT?
  ;

ifRelOp : (IF_EQ | IF_GE | IF_LE | IF_NE | IF_NG | IF_NL | IF_GT | IF_LT) ;
ifKeyword : (ABEND | ABENDCC | RUN | RC) ;
ifTest : IF_STEP? ifKeyword
    (ifRelOp (FALSE | TRUE | NUM_LIT | ALNUMNAT))? ;


 
elseStatement : SS NAME_FIELD? ELSE inlineComment? ;

endifStatement : SS NAME_FIELD? ENDIF inlineComment? ;

includeStatement : SS NAME_FIELD? INCLUDE INCLUDE_PARM_MEMBER EQUAL keywordOrSymbolic inlineComment? ;

jcllibStatement : SS NAME_FIELD? JCLLIB JCLLIB_PARM_ORDER EQUAL singleOrMultipleValue ;

notifyStatement : SS NAME_FIELD? NOTIFY_OP
    notifyParms COMMENT_TEXT? (notifyParms COMMENT_TEXT?)* ;

notifyParms : notifyEMAIL | notifyUSER | notifyTYPE | notifyWHEN ;
interveningCruft : (COMMA | inlineComment) SS? commentStatement* ;
notifyEMAIL : NOTIFY_STMT_PARM_EMAIL EQUAL keywordOrSymbolic ;
notifyUSER : NOTIFY_STMT_PARM_USER EQUAL keywordOrSymbolic ;
notifyTYPE : NOTIFY_STMT_PARM_TYPE EQUAL keywordOrSymbolic ;
notifyWHEN : NOTIFY_STMT_PARM_WHEN EQUAL keywordOrSymbolic ;

/*
This syntax would be correct if the WHEN parameter of the NOTIFY statement
followed that of the IF statement.  It is documented as doing so, but the
examples all show WHEN=quoted-string.

          WHEN EQUAL
            NOT_SYMBOL* LPAREN*
              whenTest RPAREN* SS? (WHEN_LOGICAL SS? NOT_SYMBOL* LPAREN* SS? whenTest SS? RPAREN*)*
            RPAREN*



whenKeyword : ABEND | ABENDCC | RUN | RC | SECERR | JCLERR ;
whenTest : whenKeyword
    (WHEN_REL_OP (FALSE | TRUE | NUM_LIT | ALNUMNAT))? ;
*/


outputStatement : SS NAME_FIELD? OUTPUT outputStatementParameter 
    (interveningCruft? outputStatementParameter)* COMMENT_TEXT? ;

outputStatementParameter : outputStatementADDRESS | outputStatementAFPPARMS | outputStatementAFPSTATS | outputStatementBUILDING | outputStatementBURST | outputStatementCHARS | outputStatementCKPTLINE | outputStatementCKPTPAGE | outputStatementCKPTSEC | outputStatementCLASS | outputStatementCOLORMAP | outputStatementCOMPACT | outputStatementCOMSETUP | outputStatementCONTROL | outputStatementCOPIES | outputStatementCOPYCNT | outputStatementDATACK | outputStatementDDNAME | outputStatementDEFAULT | outputStatementDEPT | outputStatementDEST | outputStatementDPAGELBL | outputStatementDUPLEX | outputStatementFCB | outputStatementFLASH | outputStatementFORMDEF | outputStatementFORMLEN | outputStatementFORMS | outputStatementFSSDATA | outputStatementGROUPID | outputStatementINDEX | outputStatementINTRAY | outputStatementJESDS | outputStatementLINDEX | outputStatementLINECT | outputStatementMAILBCC | outputStatementMAILCC | outputStatementMAILFILE | outputStatementMAILFROM | outputStatementMAILTO | outputStatementMERGE | outputStatementMODIFY | outputStatementNAME | outputStatementNOTIFY | outputStatementOFFSETXB | outputStatementOFFSETXF | outputStatementOFFSETYB | outputStatementOFFSETYF | outputStatementOUTBIN | outputStatementOUTDISP | outputStatementOVERLAYB | outputStatementOVERLAYF | outputStatementOVFL | outputStatementPAGEDEF | outputStatementPIMSG | outputStatementPORTNO | outputStatementPRMODE | outputStatementPRTATTRS | outputStatementPRTERROR | outputStatementPRTOPTNS | outputStatementPRTQUEUE | outputStatementPRTY | outputStatementREPLYTO | outputStatementRESFMT | outputStatementRETAINS | outputStatementRETAINF | outputStatementRETRYL | outputStatementRETRYT | outputStatementROOM | outputStatementSYSAREA | outputStatementTHRESHLD | outputStatementTITLE | outputStatementTRC | outputStatementUCS | outputStatementUSERDATA | outputStatementUSERLIB | outputStatementUSERPATH | outputStatementWRITER ;

outputStatementADDRESS : OUTPUT_STMT_ADDRESS EQUAL singleOrMultipleValue ;

outputStatementAFPPARMS : OUTPUT_STMT_AFPPARMS EQUAL (DATASET_NAME | QUOTED_STRING_FRAGMENT | SYMBOLIC) ;
outputStatementAFPSTATS : OUTPUT_STMT_AFPSTATS EQUAL keywordOrSymbolic ;
outputStatementBUILDING : OUTPUT_STMT_BUILDING EQUAL keywordOrSymbolic ;
outputStatementBURST : OUTPUT_STMT_BURST EQUAL keywordOrSymbolic ;
outputStatementCHARS : OUTPUT_STMT_CHARS EQUAL (
    (LPAREN outputStatementCHARS_value
        ((COMMA | (inlineComment SS CONTINUATION_WS)) outputStatementCHARS_value)*
    RPAREN) |
    outputStatementCHARS_value
  ) ;
outputStatementCHARS_value : keywordOrSymbolic ;
outputStatementCKPTLINE : OUTPUT_STMT_CKPTLINE EQUAL keywordOrSymbolic ;
outputStatementCKPTPAGE : OUTPUT_STMT_CKPTPAGE EQUAL keywordOrSymbolic ;
outputStatementCKPTSEC : OUTPUT_STMT_CKPTSEC EQUAL keywordOrSymbolic ;
outputStatementCLASS : OUTPUT_STMT_CLASS EQUAL (OUTPUT_CLASS_VALUE | SYMBOLIC | QUOTED_STRING_FRAGMENT)? ;
outputStatementCOLORMAP : OUTPUT_STMT_COLORMAP EQUAL keywordOrSymbolic ;
outputStatementCOMPACT : OUTPUT_STMT_COMPACT EQUAL keywordOrSymbolic ;
outputStatementCOMSETUP : OUTPUT_STMT_COMSETUP EQUAL keywordOrSymbolic ;
outputStatementCONTROL : OUTPUT_STMT_CONTROL EQUAL keywordOrSymbolic ;
outputStatementCOPIES : OUTPUT_STMT_COPIES EQUAL (
    keywordOrSymbolic |
    (
      LPAREN 
        keywordOrSymbolic?
          (
            COMMA LPAREN (keywordOrSymbolic (COMMA keywordOrSymbolic)*)
                  RPAREN
          )?
      RPAREN
    )
  ) ;
outputStatementCOPYCNT : OUTPUT_STMT_COPYCNT EQUAL keywordOrSymbolic ;
outputStatementDATACK : OUTPUT_STMT_DATACK EQUAL keywordOrSymbolic ;
outputStatementDDNAME : OUTPUT_STMT_DDNAME EQUAL keywordOrSymbolic ;
outputStatementDEFAULT : OUTPUT_STMT_DEFAULT EQUAL keywordOrSymbolic ;
outputStatementDEPT : OUTPUT_STMT_DEPT EQUAL keywordOrSymbolic ;
outputStatementDEST : OUTPUT_STMT_DEST EQUAL (
    keywordOrSymbolic |
    (LPAREN keywordOrSymbolic RPAREN)
  )
  ;

destValue : (DEST_VALUE | QUOTED_STRING_FRAGMENT | SYMBOLIC) ;


/*
The QUOTED_STRING_FRAGMENT in the DEST parameter takes the place of the
IP address below.

    (SQUOTE (NAME DOT)? I P COLON NUM_LIT DOT NUM_LIT DOT NUM_LIT DOT NUM_LIT SQUOTE) |

*/

outputStatementDPAGELBL : OUTPUT_STMT_DPAGELBL EQUAL keywordOrSymbolic ;
outputStatementDUPLEX : OUTPUT_STMT_DUPLEX EQUAL keywordOrSymbolic ;
outputStatementFCB : OUTPUT_STMT_FCB EQUAL keywordOrSymbolic ;
outputStatementFLASH : OUTPUT_STMT_FLASH EQUAL (
    (LPAREN keywordOrSymbolic? (COMMA keywordOrSymbolic)? RPAREN) |
    keywordOrSymbolic
  )
  ;

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
outputStatementMODIFY : OUTPUT_STMT_MODIFY EQUAL (keywordOrSymbolic |
    (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN) |
    (LPAREN keywordOrSymbolic? COMMA keywordOrSymbolic RPAREN)
  ) ;
outputStatementNAME : OUTPUT_STMT_NAME EQUAL keywordOrSymbolic ;
outputStatementNOTIFY : OUTPUT_STMT_NOTIFY EQUAL singleOrMultipleValue ;
outputStatementOFFSETXB : OUTPUT_STMT_OFFSETXB EQUAL keywordOrSymbolic ;
outputStatementOFFSETXF : OUTPUT_STMT_OFFSETXF EQUAL keywordOrSymbolic ;
outputStatementOFFSETYB : OUTPUT_STMT_OFFSETYB EQUAL keywordOrSymbolic ;
outputStatementOFFSETYF : OUTPUT_STMT_OFFSETYF EQUAL keywordOrSymbolic ;
outputStatementOUTBIN : OUTPUT_STMT_OUTBIN EQUAL keywordOrSymbolic ;
outputStatementOUTDISP : OUTPUT_STMT_OUTDISP EQUAL (keywordOrSymbolic |
    (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN) |
    (LPAREN keywordOrSymbolic? COMMA keywordOrSymbolic RPAREN)
  ) ;
outputStatementOVERLAYB : OUTPUT_STMT_OVERLAYB EQUAL keywordOrSymbolic ;
outputStatementOVERLAYF : OUTPUT_STMT_OVERLAYF EQUAL keywordOrSymbolic ;
outputStatementOVFL : OUTPUT_STMT_OVFL EQUAL keywordOrSymbolic ;
outputStatementPAGEDEF : OUTPUT_STMT_PAGEDEF EQUAL keywordOrSymbolic ;
outputStatementPIMSG : OUTPUT_STMT_PIMSG EQUAL (keywordOrSymbolic |
    (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)? RPAREN) |
    (LPAREN keywordOrSymbolic? COMMA keywordOrSymbolic RPAREN)
  ) ;
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

scheduleParmAFTER : SCHEDULE_PARM_AFTER EQUAL keywordOrSymbolic COMMENT_TEXT? ;
scheduleParmBEFORE : SCHEDULE_PARM_BEFORE EQUAL keywordOrSymbolic COMMENT_TEXT? ;
scheduleParmDELAY : SCHEDULE_PARM_DELAY EQUAL keywordOrSymbolic COMMENT_TEXT? ;
scheduleParmHOLDUNTIL : SCHEDULE_PARM_HOLDUNTIL EQUAL singleOrMultipleValue ;
scheduleParmJOBGROUP : SCHEDULE_PARM_JOBGROUP EQUAL keywordOrSymbolic COMMENT_TEXT? ;
scheduleParmSTARTBY : SCHEDULE_PARM_STARTBY EQUAL singleOrMultipleValue ;
scheduleParmWITH : SCHEDULE_PARM_WITH EQUAL keywordOrSymbolic COMMENT_TEXT? ;

setStatement : SS NAME_FIELD? SET setOperation+
  ;

setOperation : (SET_PARM_NAME EQUAL (SET_PARM_VALUE | QUOTED_STRING_FRAGMENT)? COMMENT_TEXT?) ;

xmitStatement : SS NAME_FIELD? XMIT xmitParameters* COMMENT_TEXT? ddParmASTERISK_DATA* ;

xmitParameters : (xmitParmDEST | xmitParmDLM | xmitParmSUBCHARS | commentStatement) ;

xmitParmDEST : DEST EQUAL keywordOrSymbolic COMMENT_TEXT? ;

xmitParmDLM : DLM EQUAL (DLM_VAL | QUOTED_DLM_VAL) COMMENT_TEXT? ;

xmitParmSUBCHARS : SUBCHARS EQUAL keywordOrSymbolic COMMENT_TEXT? ;

jesExecutionControlStatements : (jobGroupStatement | gJobStatement | jobSetStatement | sJobStatement | endSetStatement | endGroupStatement | afterStatement | beforeStatement | concurrentStatement)* ;

jobGroupStatement : SS NAME_FIELD? JOBGROUP_OP LPAREN? jobGroupAccountingInformation? RPAREN? COMMENT_TEXT? jobGroupProgrammerName? COMMENT_TEXT? jobGroupParameters* ;

jobGroupAccountingString : (QUOTED_STRING_FRAGMENT+ | JOBGROUP_ACCT_UNQUOTED_STRING+) ;

jobGroupAccountingInformation : jobGroupAccountingInformationSimple | jobGroupAccountingInformationMultiLine ;

jobGroupAccountingInformationSimple : jobGroupAccountingString (COMMA jobGroupAccountingString?)* ;
jobGroupAccountingInformationMultiLine : jobGroupAccountingString (COMMA? SS? jobGroupAccountingString)* ;
jobGroupProgrammerName : (QUOTED_STRING_PROGRAMMER_NAME | JOBGROUP_PROGRAMMER_NAME_UNQUOTED_STRING+) ;

jobGroupParameters : (jobGroupEMAIL | jobGroupOWNER | jobGroupGROUP | jobGroupPASSWORD | jobGroupSECLABEL | jobGroupTYPE | jobGroupHOLD | jobGroupERROR | jobGroupONERROR | jobGroupSYSAFF | jobGroupSYSTEM | jobGroupSCHENV) ;

jobGroupEMAIL : JOBGROUP_EMAIL EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupOWNER : JOBGROUP_OWNER EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupGROUP : JOBGROUP_GROUP EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupPASSWORD : JOBGROUP_PASSWORD EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupSECLABEL : JOBGROUP_SECLABEL EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupTYPE : JOBGROUP_TYPE EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupHOLD : JOBGROUP_HOLD EQUAL keywordOrSymbolic COMMENT_TEXT? ;

jobGroupERROR : JOBGROUP_ERROR EQUAL jobGroupCondition ;

jobGroupCondition :
    LPAREN*
      NOT_SYMBOL* jobGroupERROR_Test 
        (JOBGROUP_ERROR_LOGICAL NOT_SYMBOL* LPAREN* jobGroupERROR_Test RPAREN*)*
    RPAREN*
    COMMENT_TEXT?
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

jobGroupONERROR : JOBGROUP_ONERROR EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupSYSAFF : JOBGROUP_SYSAFF EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupSYSTEM : JOBGROUP_SYSTEM EQUAL keywordOrSymbolic COMMENT_TEXT? ;
jobGroupSCHENV : JOBGROUP_SCHENV EQUAL keywordOrSymbolic COMMENT_TEXT? ;

gJobStatement : SS NAME_FIELD? GJOB_OP gJobParameters ;

gJobParameters : (gJobFLUSHTYP) ;

gJobFLUSHTYP : GJOB_PARM_FLUSHTYP EQUAL keywordOrSymbolic COMMENT_TEXT? ;

jobSetStatement : SS NAME_FIELD? JOBSET_OP jobSetParameters ;

jobSetParameters : (jobSetFLUSHTYP) ;

jobSetFLUSHTYP : JOBSET_PARM_FLUSHTYP EQUAL keywordOrSymbolic COMMENT_TEXT? ;

sJobStatement : SS NAME_FIELD? SJOB_OP COMMENT_TEXT? ;

endSetStatement : SS NAME_FIELD? ENDSET_OP COMMENT_TEXT? ;

endGroupStatement : SS NAME_FIELD? ENDGROUP_OP COMMENT_TEXT? ;

afterStatement : SS AFTER_OP afterParameters+ ;

afterParameters : (afterNAME | afterACTION | afterOTHERWISE | afterWHEN) ;

afterNAME : AFTER_PARM_NAME EQUAL singleOrMultipleValue ;
afterACTION : AFTER_PARM_ACTION EQUAL keywordOrSymbolic COMMENT_TEXT? ;
afterOTHERWISE : AFTER_PARM_OTHERWISE EQUAL keywordOrSymbolic COMMENT_TEXT? ;
afterWHEN : AFTER_PARM_WHEN EQUAL jobGroupCondition ;

beforeStatement : SS BEFORE_OP beforeParameters+ ;

beforeParameters : (beforeNAME | beforeACTION | beforeOTHERWISE | beforeWHEN) ;

beforeNAME : BEFORE_PARM_NAME EQUAL singleOrMultipleValue ;
beforeACTION : BEFORE_PARM_ACTION EQUAL keywordOrSymbolic COMMENT_TEXT? ;
beforeOTHERWISE : BEFORE_PARM_OTHERWISE EQUAL keywordOrSymbolic COMMENT_TEXT? ;
beforeWHEN : BEFORE_PARM_WHEN EQUAL jobGroupCondition ;

concurrentStatement : SS CONCURRENT_OP concurrentParameters+ ;

concurrentParameters : (concurrentNAME) ;

concurrentNAME : CONCURRENT_PARM_NAME EQUAL singleOrMultipleValue ;

singleOrMultipleValue : (
    keywordOrSymbolic |
    (LPAREN
      keywordOrSymbolic (COMMA? COMMENT_TEXT? keywordOrSymbolic)*
    RPAREN) |
    (LPAREN+
      keywordOrSymbolic RPAREN? (COMMA? COMMENT_TEXT? keywordOrSymbolic RPAREN?)*
    RPAREN+)
  ) COMMENT_TEXT? ;

jes2CntlStatement : (jes2JobParmStatement) ;

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

