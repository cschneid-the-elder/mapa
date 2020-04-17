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

parser grammar JCLPPParser;

options {tokenVocab=JCLPPLexer;}


startRule : jcl | EOF ;

jcl : execJCL+ | procJCL ;

execJCL : jesExecutionControlStatements (jobCard (jclCommandStatement | jes2CntlStatement | commandStatement | commentStatement | joblibAmalgamation | syschkAmalgamation | jcllibStatement | cntlStatementAmalgamation | notifyStatement | xmitStatement)* (jclCommandStatement | commandStatement | commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | procStatement | pendStatement | scheduleStatement | setStatement)*)+ EOF?;

procJCL : commandStatement? procStatement? (commandStatement | commentStatement | jclStep | ifStatement | elseStatement | endifStatement | includeStatement | exportStatement | outputStatement | setStatement)+ pendStatement? commentStatement* EOF? ;

procStatement : SS procName? PROC definedSymbolicParameters* ;

defineSymbolicParameter : PROC_PARM_NAME EQUAL keywordOrSymbolic? ;

definedSymbolicParameters : defineSymbolicParameter+ ;

commentStatement : COMMENT_FLAG (COMMENT_TEXT | EOF)? ;

inlineComment : COMMENT_FLAG_INLINE? COMMENT_TEXT ;

stepName : NAME_FIELD ;

procName : NAME_FIELD ;

jclStep : execStatement (cntlStatementAmalgamation | ddStatementAmalgamation | outputStatement | includeStatement | commentStatement)* ;

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
execParameter : execParmACCT | execParmADDRSPC | execParmCCSID | execParmCOND | execParmDYNAMNBR | execParmMEMLIMIT | execParmPARM | execParmPARMDD | execParmPERFORM | execParmRD | execParmREGION | execParmREGIONX | execParmRLSTMOUT | execParmTIME | execParmTVSMSG | execParmTVSAMCOM ;

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

execParmTIME : EXEC_TIME EQUAL singleOrMultipleValue ;

execParmTVSMSG : EXEC_TVSMSG EQUAL keywordOrSymbolic ;

execParmTVSAMCOM : EXEC_TVSAMCOM EQUAL parenList ;

ddStatement : SS ddName DD ddParameter* ddParmASTERISK_DATA* ;

ddStatementConcatenation : SS DD ddParameter* ddParmASTERISK_DATA* ;

ddStatementAmalgamation : ddStatement ddStatementConcatenation* ;

ddName : (NAME | NAME_FIELD) (DOT (NAME | NAME_FIELD))? ;

ddParameter : ddParmASTERISK | ddParmDATA | ddParmDLM | ddParmSYMBOLS | ddParmSYMLIST | SYMBOLIC+ ;

/*
ddParameter : ddParmACCODE | ddParmAMP | ddParmASTERISK | ddParmAVGREC | ddParmBLKSZLIM | ddParmBURST | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmCOPIES | ddParmDATA | ddParmDATACLAS | ddParmDCB | ddParmDDNAME | ddParmDEST | ddParmDISP | ddParmDLM | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFCB | ddParmFILEDATA | ddParmFLASH | ddParmFREE | ddParmFREEVOL | ddParmGDGORDER | ddParmHOLD | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYOFF | ddParmLABEL | ddParmLGSTREAM | ddParmLIKE | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmOUTLIM | ddParmOUTPUT | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSPIN | ddParmSTORCLAS | ddParmSUBSYS | ddParmSYMBOLS | ddParmSYMLIST | ddParmSYSOUT | ddParmTERM | ddParmUCS | ddParmUNIT | ddParmVOLUME | ddParmDCB_Parameter;
*/

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
ddParmBUFSIZE : BUFSIZE EQUAL keywordOrSymbolic ;
ddParmBURST : BURST EQUAL keywordOrSymbolic ;
ddParmCCSID : CCSID EQUAL keywordOrSymbolic ;
ddParmCHARS : CHARS EQUAL singleOrMultipleValue ;
ddParmCHKPT : CHKPT EQUAL keywordOrSymbolic ;
ddParmCNTL : CNTL EQUAL keywordOrSymbolic ;
ddParmCOPIES : COPIES EQUAL copiesPayload ;
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

ddParmDCB_Parameter : ddParmBFALN | ddParmBFTEK | ddParmBLKSIZE | ddParmBUFIN | ddParmBUFL | ddParmBUFMAX | ddParmBUFNO | ddParmBUFOFF | ddParmBUFOUT | ddParmBUFSIZE | ddParmCPRI | ddParmCYLOFL | ddParmDEN | ddParmDIAGNS | ddParmDSORG | ddParmEROPT | ddParmFUNC | ddParmGNCP | ddParmINTVL | ddParmIPLTXID | ddParmKEYLEN | ddParmLIMCT| ddParmLRECL | ddParmMODE |  ddParmNCP | ddParmNTM | ddParmOPTCD | ddParmPCI | ddParmPRTSP | ddParmRECFM | ddParmRESERVE | ddParmRKP | ddParmSTACK | ddParmTHRESH | ddParmTRTCH | datasetName ;


ddParmDDNAME : DDNAME EQUAL keywordOrSymbolic? ;
ddParmDEN : DEN EQUAL keywordOrSymbolic ;
ddParmDEST : DEST EQUAL  (
    keywordOrSymbolic |
    (LPAREN keywordOrSymbolic RPAREN)
  )
  ;
ddParmDIAGNS : DIAGNS EQUAL keywordOrSymbolic ;
ddParmDISP : DISP EQUAL LPAREN? ddParmDISP_STATUS? ddParmDISP_NORMAL_TERM? ddParmDISP_ABNORMAL_TERM? RPAREN? ;
ddParmDISP_STATUS : DISP_MOD | DISP_NEW | DISP_OLD | DISP_SHR | SYMBOLIC ;
ddParmDISP_NORMAL_TERM : DISP_CATLG | DISP_DELETE | DISP_KEEP | DISP_PASS | DISP_UNCATLG | SYMBOLIC ;
ddParmDISP_ABNORMAL_TERM : DISP_CATLG | DISP_DELETE | DISP_KEEP | DISP_PASS | DISP_UNCATLG | SYMBOLIC ;
ddParmDLM : DLM EQUAL keywordOrSymbolic ;
ddParmDSID : DSID EQUAL (
    DSID_VALUE | 
    SYMBOLIC |
    (LPAREN (DSID_VALUE | SYMBOLIC) (DSID_VERIFIED | SYMBOLIC)? RPAREN)
  ) ;
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
    LABEL_SEQUENCE_SYMBOLIC |
    (LPAREN (LABEL_SEQUENCE | LABEL_SEQUENCE_SYMBOLIC) RPAREN) |
    (LPAREN ddParmRETPD RPAREN) |
    (LPAREN ddParmEXPDT RPAREN) |
    (LPAREN
        (LABEL_SEQUENCE | LABEL_SEQUENCE_SYMBOLIC)? 
        (LABEL_TYPE | LABEL_TYPE_SYMBOLIC)? 
        (LABEL_PASSWORD_PROTECT | LABEL_PASSWORD_PROTECT_SYMBOLIC)? 
        (LABEL_I_O | LABEL_I_O_SYMBOLIC)?
        (ddParmRETPD | ddParmEXPDT)?
    RPAREN)
  ) ;

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
ddParmOPTCD : OPTCD EQUAL keywordOrSymbolic ;
ddParmOUTLIM : OUTLIM EQUAL keywordOrSymbolic ;
ddParmOUTPUT : OUTPUT EQUAL singleOrMultipleValue ;
ddParmPATH : PATH EQUAL keywordOrSymbolic ;
ddParmPATHDISP : PATHDISP EQUAL (
    PATHDISP_NORMAL | 
    (LPAREN PATHDISP_NORMAL PATHDISP_ABNORMAL? RPAREN) |
    (LPAREN PATHDISP_NORMAL? PATHDISP_ABNORMAL RPAREN)
  ) ;
ddParmPATHMODE : PATHMODE EQUAL (
    PATHMODE_VALUE |
    SYMBOLIC |
    (LPAREN 
        (PATHMODE_VALUE | SYMBOLIC)+
    RPAREN)
  ) ;
ddParmPATHOPTS : PATHOPTS EQUAL  (
    PATHOPTS_VALUE |
    SYMBOLIC |
    (LPAREN 
        (PATHOPTS_VALUE | SYMBOLIC)+
    RPAREN)
  ) ;
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
ddParmSPACE : SPACE EQUAL (
    (LPAREN
        ddParmSPACE_unit? (
            ddParmSPACE_primary |
            (LPAREN
               ddParmSPACE_primary?
               ddParmSPACE_secondary? 
               ddParmSPACE_directory? 
             RPAREN)
            )
        ddParmSPACE_rlse? ddParmSPACE_characteristics? ddParmSPACE_round?
    RPAREN) |
    (LPAREN ABSTR 
      LPAREN
        ddParmSPACE_primary 
        ddParmSPACE_track_address?
        ddParmSPACE_directory?
      RPAREN
    RPAREN) |
    SYMBOLIC
  ) ;
ddParmSPACE_unit : (CYL | TRK | NUM_LIT | SYMBOLIC) ;
ddParmSPACE_primary : (NUM_LIT | SYMBOLIC) ;
ddParmSPACE_secondary : (NUM_LIT | SYMBOLIC) ;
ddParmSPACE_directory : (NUM_LIT | SYMBOLIC) ;
ddParmSPACE_track_address : (NUM_LIT | SYMBOLIC) ;
ddParmSPACE_rlse : (RLSE | SYMBOLIC) ;
ddParmSPACE_characteristics : (CONTIG | MXIG | ALX | SYMBOLIC) ;
ddParmSPACE_round : (ROUND | SYMBOLIC) ;


ddParmSPIN : SPIN EQUAL singleOrMultipleValue ;

ddParmSTACK : STACK EQUAL keywordOrSymbolic ;
ddParmSTORCLAS : STORCLAS EQUAL keywordOrSymbolic? ;
ddParmSUBSYS : SUBSYS EQUAL singleOrMultipleValue ;

ddParmSYMBOLS : SYMBOLS EQUAL singleOrMultipleValue ;

ddParmSYMLIST : SYMLIST EQUAL singleOrMultipleValue ;
ddParmSYSOUT : SYSOUT EQUAL (
    sysoutClass |
    (LPAREN RPAREN ) |
    (LPAREN sysoutClass sysoutWriter? sysoutFormOrCase? RPAREN)
  ) ;

sysoutClass : (SYSOUT_CLASS | QUOTED_STRING_FRAGMENT+ | QS_AMPERSAND+ | QS_SQUOTE2+ | SYMBOLIC+) ;
sysoutWriter : (SYSOUT_WRITER | SYSOUT_INTRDR | SYMBOLIC) ;
sysoutFormOrCase : (SYSOUT_FORM | SYMBOLIC) ;

ddParmTERM : TERM EQUAL keywordOrSymbolic ;
ddParmTHRESH : THRESH EQUAL keywordOrSymbolic ;
ddParmTRTCH : TRTCH EQUAL keywordOrSymbolic ;
ddParmUCS : UCS EQUAL (
    ddParmUCS_code |
    (LPAREN 
        ddParmUCS_code 
        ddParmUCS_fold? 
        ddParmUCS_verify?
    RPAREN)
  ) ;

ddParmUCS_code : (UCS_CODE | SYMBOLIC) ;
ddParmUCS_fold : (UCS_FOLD | SYMBOLIC) ;
ddParmUCS_verify : (UCS_VERIFY | SYMBOLIC) ;

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
    ddParmUNIT_unit |
    (UNIT_AFF EQUAL UNIT_DDNAME) |
    (LPAREN 
        ddParmUNIT_unit? 
            ddParmUNIT_count? 
                ddParmUNIT_defer? 
                    ddParmUNIT_smshonor?
    RPAREN)
  ) ;

ddParmUNIT_unit : (UNIT_NUMBER | UNIT_DEVICE_TYPE | UNIT_GROUP_NAME | SYMBOLIC+) ;
ddParmUNIT_count : (UNIT_COUNT | UNIT_ALLOC | SYMBOLIC+) ;
ddParmUNIT_defer : (UNIT_DEFER | SYMBOLIC+) ;
ddParmUNIT_smshonor : (UNIT_SMSHONOR | SYMBOLIC+) ;

ddParmVOLUME : (VOL | VOLUME) EQUAL (
    ddParmVOLUME_private |
    ddParmVOLUME_SER |
    ddParmVOLUME_REF |
    (LPAREN
        ddParmVOLUME_private?
        ddParmVOLUME_retain?
        ddParmVOLUME_seq_nb?
        ddParmVOLUME_count?
        ddParmVOLUME_SER? 
        ddParmVOLUME_REF? 
    RPAREN)
  ) ;

ddParmVolSer : (VOL_SER_NB | QUOTED_STRING_FRAGMENT+ | QS_AMPERSAND+ | QS_SQUOTE2+ | SYMBOLIC+) ;
ddParmVOLUME_SER : (
    (VOL_SER EQUAL ddParmVolSer) |
    (VOL_SER EQUAL LPAREN  ddParmVolSer+ RPAREN)
  ) ;

ddParmVOLUME_REF : VOL_REF EQUAL keywordOrSymbolic ;

ddParmVOLUME_private : (VOL_PRIVATE | SYMBOLIC) ;
ddParmVOLUME_retain : (VOL_RETAIN | SYMBOLIC) ;
ddParmVOLUME_seq_nb : (VOL_SEQ_NB | SYMBOLIC) ;
ddParmVOLUME_count : (VOL_COUNT | SYMBOLIC) ;

joblibStatement : SS JOBLIB DD SYMBOLIC* ;

joblibConcatenation : SS DD SYMBOLIC* ;

joblibAmalgamation : joblibStatement joblibConcatenation* ;

joblibParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


syschkStatement : SS SYSCHK DD syschkParameter+ ;

syschkConcatenation : SS DD syschkParameter+ ;

syschkAmalgamation : syschkStatement syschkConcatenation* ;

syschkParameter : ddParmACCODE | ddParmAVGREC | ddParmBLKSIZE | ddParmBLKSZLIM | ddParmCCSID | ddParmCHARS | ddParmCHKPT | ddParmCNTL | ddParmDATACLAS | ddParmDCB | ddParmDISP | ddParmDSID | ddParmDSKEYLBL | ddParmDSNAME | ddParmDSNTYPE | ddParmDUMMY | ddParmDYNAM | ddParmEATTR | ddParmEXPDT | ddParmFILEDATA | ddParmKEYLABL1 | ddParmKEYLABL2 | ddParmKEYENCD1 | ddParmKEYENCD2 | ddParmKEYLEN | ddParmKEYOFF | ddParmLABEL | ddParmLIKE | ddParmLRECL | ddParmMAXGENS | ddParmMGMTCLAS | ddParmMODIFY | ddParmPATH | ddParmPATHDISP | ddParmPATHMODE | ddParmPATHOPTS | ddParmPROTECT | ddParmRECFM | ddParmRECORG | ddParmREFDD | ddParmRETPD | ddParmRLS | ddParmROACCESS | ddParmSECMODEL | ddParmSEGMENT | ddParmSPACE | ddParmSTORCLAS | ddParmUNIT | ddParmVOLUME ;


jobCard : SS jobName JOB SYMBOLIC* ;

jobName : NAME_FIELD ;

jobAccountingInformation : (
    QUOTED_STRING_FRAGMENT+ |
    QS_AMPERSAND+ |
    QS_SQUOTE2+ |
    JOB_ACCT_MODE1_UNQUOTED_STRING+ |
    JOB_ACCT_MODE2_UNQUOTED_STRING+
  ) ;
jobProgrammerName : (QUOTED_STRING_PROGRAMMER_NAME+ | JOB_PROGRAMMER_NAME_UNQUOTED_STRING+ | QS_AMPERSAND+ | QS_SQUOTE2+) ;

jobKeywordParameter : jobParmADDRSPC | jobParmBYTES | jobParmCARDS | jobParmCCSID | jobParmCLASS | jobParmCOND | jobParmDSENQSHR | jobParmEMAIL | jobParmGDGBIAS | jobParmGROUP | jobParmJESLOG | jobParmJOBRC | jobParmLINES | jobParmMEMLIMIT | jobParmMSGCLASS | jobParmMSGLEVEL | jobParmNOTIFY | jobParmPAGES | jobParmPASSWORD | jobParmPERFORM | jobParmPRTY | jobParmRD | jobParmREGION | jobParmREGIONX | jobParmRESTART | jobParmSECLABEL | jobParmSCHENV | jobParmSYSAFF | jobParmSYSTEM | jobParmTIME | jobParmTYPRUN | jobParmUJOBCORR | jobParmUSER ;

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

jobParmSECLABEL : SECLABEL EQUAL keywordOrSymbolic ;

jobParmSCHENV : SCHENV EQUAL keywordOrSymbolic ;

jobParmSYSAFF : SYSAFF EQUAL singleOrMultipleValue ;

jobParmSYSTEM : SYSTEM EQUAL singleOrMultipleValue ;

jobParmTIME : TIME EQUAL singleOrMultipleValue ;

jobParmTYPRUN : TYPRUN EQUAL keywordOrSymbolic ;

jobParmUJOBCORR : UJOBCORR EQUAL keywordOrSymbolic ;

jobParmUSER : USER EQUAL keywordOrSymbolic ;

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

jcllibStatement : SS NAME_FIELD? JCLLIB JCLLIB_PARM_ORDER EQUAL singleOrMultipleValue ;

notifyStatement : SS NAME_FIELD? NOTIFY_OP SYMBOLIC* ;

notifyParms : notifyEMAIL | notifyUSER | notifyTYPE | notifyWHEN ;
notifyEMAIL : NOTIFY_STMT_PARM_EMAIL EQUAL keywordOrSymbolic ;
notifyUSER : NOTIFY_STMT_PARM_USER EQUAL keywordOrSymbolic ;
notifyTYPE : NOTIFY_STMT_PARM_TYPE EQUAL keywordOrSymbolic ;
notifyWHEN : NOTIFY_STMT_PARM_WHEN EQUAL keywordOrSymbolic ;

outputStatement : SS NAME_FIELD? OUTPUT SYMBOLIC* ;

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
outputStatementCOPIES : OUTPUT_STMT_COPIES EQUAL copiesPayload ;
copiesPayload : (
    copiesValueOrSymbolic |
    (LPAREN copiesValueOrSymbolic RPAREN) |
    (LPAREN
      copiesValueOrSymbolic?
      LPAREN
        (COPIES_GROUP_VALUE | SYMBOLIC)+
      RPAREN
    RPAREN)
  ) ;
copiesValueOrSymbolic : (COPIES_VALUE | SYMBOLIC) ;
outputStatementCOPYCNT : OUTPUT_STMT_COPYCNT EQUAL keywordOrSymbolic ;
outputStatementDATACK : OUTPUT_STMT_DATACK EQUAL keywordOrSymbolic ;
outputStatementDDNAME : OUTPUT_STMT_DDNAME EQUAL keywordOrSymbolic ;
outputStatementDEFAULT : OUTPUT_STMT_DEFAULT EQUAL keywordOrSymbolic ;
outputStatementDEPT : OUTPUT_STMT_DEPT EQUAL keywordOrSymbolic ;
outputStatementDEST : OUTPUT_STMT_DEST EQUAL singleOrMultipleValue ;

destValue : (DEST_VALUE | QUOTED_STRING_FRAGMENT+ | QS_AMPERSAND+ | QS_SQUOTE2+ | SYMBOLIC+) ;


/*
The QUOTED_STRING_FRAGMENT in the DEST parameter takes the place of the
IP address below.

    (SQUOTE (NAME DOT)? I P COLON NUM_LIT DOT NUM_LIT DOT NUM_LIT DOT NUM_LIT SQUOTE) |

*/

outputStatementDPAGELBL : OUTPUT_STMT_DPAGELBL EQUAL keywordOrSymbolic ;
outputStatementDUPLEX : OUTPUT_STMT_DUPLEX EQUAL keywordOrSymbolic ;
outputStatementFCB : OUTPUT_STMT_FCB EQUAL keywordOrSymbolic ;
outputStatementFLASH : OUTPUT_STMT_FLASH EQUAL (
    OUTPUT_FLASH_OVERLAY |
    (LPAREN OUTPUT_FLASH_OVERLAY OUTPUT_FLASH_COUNT RPAREN) |
    (LPAREN OUTPUT_FLASH_OVERLAY? OUTPUT_FLASH_COUNT RPAREN) |
    (LPAREN OUTPUT_FLASH_OVERLAY OUTPUT_FLASH_COUNT? RPAREN) |
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
outputStatementMODIFY : OUTPUT_STMT_MODIFY EQUAL (
    OUTPUT_MODIFY_MODULE |
    (LPAREN OUTPUT_MODIFY_MODULE OUTPUT_MODIFY_TRC RPAREN) |
    (LPAREN OUTPUT_MODIFY_MODULE? OUTPUT_MODIFY_TRC RPAREN) |
    (LPAREN OUTPUT_MODIFY_MODULE OUTPUT_MODIFY_TRC? RPAREN)
  ) ;
outputStatementNAME : OUTPUT_STMT_NAME EQUAL keywordOrSymbolic ;
outputStatementNOTIFY : OUTPUT_STMT_NOTIFY EQUAL singleOrMultipleValue ;
outputStatementOFFSETXB : OUTPUT_STMT_OFFSETXB EQUAL keywordOrSymbolic ;
outputStatementOFFSETXF : OUTPUT_STMT_OFFSETXF EQUAL keywordOrSymbolic ;
outputStatementOFFSETYB : OUTPUT_STMT_OFFSETYB EQUAL keywordOrSymbolic ;
outputStatementOFFSETYF : OUTPUT_STMT_OFFSETYF EQUAL keywordOrSymbolic ;
outputStatementOUTBIN : OUTPUT_STMT_OUTBIN EQUAL keywordOrSymbolic ;
outputStatementOUTDISP : OUTPUT_STMT_OUTDISP EQUAL (
    OUTPUT_OUTDISP_NORMAL |
    (LPAREN OUTPUT_OUTDISP_NORMAL OUTPUT_OUTDISP_ABNORMAL RPAREN) |
    (LPAREN OUTPUT_OUTDISP_NORMAL? OUTPUT_OUTDISP_ABNORMAL RPAREN) |
    (LPAREN OUTPUT_OUTDISP_NORMAL OUTPUT_OUTDISP_ABNORMAL? RPAREN)
  ) ;
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

scheduleStatement : SS NAME_FIELD? SCHEDULE SYMBOLIC* ;

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

xmitStatement : SS NAME_FIELD? XMIT SYMBOLIC* ddParmASTERISK_DATA* ;

xmitParameters : (xmitParmDEST | xmitParmDLM | xmitParmSUBCHARS | commentStatement) ;

xmitParmDEST : DEST EQUAL keywordOrSymbolic ;

xmitParmDLM : DLM EQUAL keywordOrSymbolic ;

xmitParmSUBCHARS : SUBCHARS EQUAL keywordOrSymbolic ;

jesExecutionControlStatements : (jobGroupStatement | gJobStatement | jobSetStatement | sJobStatement | endSetStatement | endGroupStatement | afterStatement | beforeStatement | concurrentStatement)* ;

jobGroupStatement : SS NAME_FIELD? JOBGROUP_OP SYMBOLIC* ;

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

gJobStatement : SS NAME_FIELD? GJOB_OP SYMBOLIC* ;

gJobParameters : (gJobFLUSHTYP) ;

gJobFLUSHTYP : GJOB_PARM_FLUSHTYP EQUAL keywordOrSymbolic ;

jobSetStatement : SS NAME_FIELD? JOBSET_OP SYMBOLIC* ;

jobSetParameters : (jobSetFLUSHTYP) ;

jobSetFLUSHTYP : JOBSET_PARM_FLUSHTYP EQUAL keywordOrSymbolic ;

sJobStatement : SS NAME_FIELD? SJOB_OP ;

endSetStatement : SS NAME_FIELD? ENDSET_OP ;

endGroupStatement : SS NAME_FIELD? ENDGROUP_OP ;

afterStatement : SS AFTER_OP SYMBOLIC* ;

afterParameters : (afterNAME | afterACTION | afterOTHERWISE | afterWHEN) ;

afterNAME : AFTER_PARM_NAME EQUAL singleOrMultipleValue ;
afterACTION : AFTER_PARM_ACTION EQUAL keywordOrSymbolic ;
afterOTHERWISE : AFTER_PARM_OTHERWISE EQUAL keywordOrSymbolic ;
afterWHEN : AFTER_PARM_WHEN EQUAL jobGroupCondition ;

beforeStatement : SS BEFORE_OP SYMBOLIC* ;

beforeParameters : (beforeNAME | beforeACTION | beforeOTHERWISE | beforeWHEN) ;

beforeNAME : BEFORE_PARM_NAME EQUAL singleOrMultipleValue ;
beforeACTION : BEFORE_PARM_ACTION EQUAL keywordOrSymbolic ;
beforeOTHERWISE : BEFORE_PARM_OTHERWISE EQUAL keywordOrSymbolic ;
beforeWHEN : BEFORE_PARM_WHEN EQUAL jobGroupCondition ;

concurrentStatement : SS CONCURRENT_OP SYMBOLIC* ;

concurrentParameters : (concurrentNAME) ;

concurrentNAME : CONCURRENT_PARM_NAME EQUAL singleOrMultipleValue ;

/*
Trying to accomodate...

PARM=VAL
PARM=(VAL)
PARM=(VAL,VAL,VAL)
PARM=((VAL,VAL),VAL)
PARM=(VAL,(VAL,VAL))

*/
singleOrMultipleValue : (
    keywordOrSymbolic |
    parenList |
    (LPAREN
      keywordOrSymbolic?
      COMMA
      parenList
    RPAREN) |
    (LPAREN
      keywordOrSymbolic? (COMMA keywordOrSymbolic)+
    RPAREN) |
    (LPAREN+
      keywordOrSymbolic (COMMA keywordOrSymbolic RPAREN?)*
    RPAREN+)

  ) ;

parenList : (LPAREN keywordOrSymbolic (COMMA keywordOrSymbolic)* RPAREN) ;

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

jes2SetupStatement : SA JES2_SETUP VOL_SER_NB+ ;

jes2SignoffStatement : SA JES2_SIGNOFF ;

jes2SignonStatement : SA JES2_SIGNON 
    JES2_SIGNON_NODE JES2_SIGNON_PASSWORD1? JES2_SIGNON_NEW_PASSWORD? JES2_SIGNON_PASSWORD2? ;

jes2XEQStatement : SA JES2_XEQ JES2_XEQ_NODE ;

jes2XMITStatement : SA JES2_XMIT SYMBOLIC*
    DD_ASTERISK_DATA+
    (DATA_MODE_TERMINATOR3 | DATA_MODE_TERMINATORX)?
  ;

