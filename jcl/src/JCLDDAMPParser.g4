/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This lexer and its corresponding parser grammar are intended to be used by 
applications parsing JCL with the JCLLexer.g4 and JCLParser.g4 grammars
to be found at https://github.com/cschneid-the-elder/mapa/tree/master/jcl .

The AMP DD statement parameter has a somewhat complex syntax relative to
other DD statement parameters, thus the existence of this grammar.  To use,
invoke the code generated for this grammar with the concatenated results of 
parsing the AMP parameter.

*/

parser grammar JCLDDAMPParser;

options {tokenVocab=JCLDDAMPLexer;}

startRule 
	: amp+
	| EOF
	;

amp
	: ((LPAREN ddParmAMP_Parameter (COMMA ddParmAMP_Parameter)* RPAREN)
	| (ddParmAMP_Parameter (COMMA ddParmAMP_Parameter)*))
	;

ddParmAMP_Parameter
	: (ddParmAMP_ACCBIAS
	| ddParmAMP_AMORG
	| ddParmAMP_BUFND
	| ddParmAMP_BUFNI
	| ddParmAMP_BUFSP
	| ddParmAMP_CROPS
	| ddParmAMP_FRLOG
	| ddParmAMP_MSG
	| ddParmAMP_OPTCD
	| ddParmAMP_RECFM
	| ddParmAMP_RMODE31
	| ddParmAMP_SMBDFR
	| ddParmAMP_SMBHWT
	| ddParmAMP_SMBVSP
	| ddParmAMP_SMBVSPI
	| ddParmAMP_STRNO
	| ddParmAMP_SYNAD
	| ddParmAMP_TRACE)+
	;


ddParmAMP_ACCBIAS
	: ACCBIAS EQUAL ddParmAMP_ACCBIAS_Parameter
	;

ddParmAMP_ACCBIAS_Parameter
	: (USER
	| SYSTEM
	| DO
	| DW
	| SO
	| SW)
	;

ddParmAMP_AMORG
	: AMORG
	;

ddParmAMP_BUFND
	: BUFND EQUAL NUM_LIT
	;

ddParmAMP_BUFNI
	: BUFNI EQUAL NUM_LIT
	;

ddParmAMP_BUFSP
	: BUFSP EQUAL NUM_LIT
	;

ddParmAMP_CROPS
	: CROPS EQUAL ddParmAMP_CROPS_Parameter
	;

ddParmAMP_CROPS_Parameter
	: (RCK
	| NCK
	| NRE
	| NRC)
	;

ddParmAMP_FRLOG
	: FRLOG EQUAL ddParmAMP_FRLOG_Parameter
	;

ddParmAMP_FRLOG_Parameter
	: (NONE
	| REDO)
	;

ddParmAMP_MSG
	: MSG EQUAL SMBBIAS
	;

ddParmAMP_OPTCD
	: OPTCD EQUAL ddParmAMP_OPTCD_Parameter
	;

ddParmAMP_OPTCD_Parameter
	: (OPTCD_I
	| OPTCD_L 
	| OPTCD_IL)
	;

ddParmAMP_RECFM
	: RECFM EQUAL ddParmAMP_RECFM_Parameter
	;

ddParmAMP_RECFM_Parameter
	: (RECFM_F
	| RECFM_FB
	| RECFM_V
	| RECFM_VB)
	;

ddParmAMP_RMODE31
	: RMODE31 EQUAL ddParmAMP_RMODE31_Parameter
	;

ddParmAMP_RMODE31_Parameter
	: (ALL
	| BUFF
	| CB
	| NONE)
	;

ddParmAMP_SMBDFR
	: SMBDFR EQUAL ddParmAMP_SMBDFR_Parameter
	;

ddParmAMP_SMBDFR_Parameter
	: (SMBDFR_Y
	| SMBDFR_N)
	;

ddParmAMP_SMBHWT
	: SMBHWT EQUAL NUM_LIT
	;

ddParmAMP_SMBVSP
	: SMBVSP EQUAL NUM_MEM_VAL
	;

ddParmAMP_SMBVSPI
	: SMBVSPI EQUAL NUM_MEM_VAL
	;

ddParmAMP_STRNO
	: STRNO EQUAL NUM_LIT
	;

ddParmAMP_SYNAD
	: SYNAD EQUAL MODULE_NAME
	;

/*

https://www.ibm.com/support/knowledgecenter/SSLTBW_2.4.0/com.ibm.zos.v2r4.idar100/subprmtr.htm

The syntax for the TRACE subparameter of the AMP parameter of the DD statement
took a bit of digging to locate, so I'm recording the url here.  The vernacular 
would be...

Home > z/OS 2.4.0 > z/OS DFSMS > z/OS DFSMSdfp Diagnosis > VSAM diagnostic aids > VSAM record management (R/M) diagnostic aids > VSAM record management trace facility (non-RLS access) > Starting the record management trace function > Subparameters for trace

...for the future, when z/OS 2.4 documentation drops off the back of the stove.

*/

ddParmAMP_TRACE
	: TRACE EQUAL 
    LPAREN
        ddParmAMP_TRACE_Parameter (COMMA ddParmAMP_TRACE_Parameter)*
    RPAREN
	;

ddParmAMP_TRACE_Parameter
	: (ddParmAMP_TRACE_HOOK
	| ddParmAMP_TRACE_ECODE
	| ddParmAMP_TRACE_KEY
	| ddParmAMP_TRACE_PARM1
	| ddParmAMP_TRACE_PARM2)
	;


ddParmAMP_TRACE_HOOK
	: HOOK EQUAL LPAREN NUM_LIT (COMMA NUM_LIT)* RPAREN
	;

ddParmAMP_TRACE_ECODE
	: ECODE EQUAL ddParmAMP_TRACE_ECODE_Parameter
	;

ddParmAMP_TRACE_ECODE_Parameter
	: (ANY
	| NUM_LIT)
	;

ddParmAMP_TRACE_KEY
	: KEY EQUAL HEX_STRING (DASH HEX_STRING)?
	;

ddParmAMP_TRACE_PARM1
	: PARM1 EQUAL HEX_STRING
	;

ddParmAMP_TRACE_PARM2
	: PARM2 EQUAL HEX_STRING
	;



