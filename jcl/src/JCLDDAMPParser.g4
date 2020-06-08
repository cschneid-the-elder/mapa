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
	: ((LPAREN ampParameter (COMMA ampParameter)* RPAREN)
	| (ampParameter (COMMA ampParameter)*))
	;

ampParameter
	: (accbias
	| amorg
	| bufnd
	| bufni
	| bufsp
	| crops
	| frlog
	| msg
	| optcd
	| recfm
	| rmode31
	| smbdfr
	| smbhwt
	| smbvsp
	| smbvspi
	| strno
	| synad
	| trace)
	;


accbias
	: ACCBIAS EQUAL accbiasParameter
	;

accbiasParameter
	: (USER
	| SYSTEM
	| DO
	| DW
	| SO
	| SW)
	;

amorg
	: AMORG
	;

bufnd
	: BUFND EQUAL NUM_LIT
	;

bufni
	: BUFNI EQUAL NUM_LIT
	;

bufsp
	: BUFSP EQUAL NUM_LIT
	;

crops
	: CROPS EQUAL cropsParameter
	;

cropsParameter
	: (RCK
	| NCK
	| NRE
	| NRC)
	;

frlog
	: FRLOG EQUAL frlogParameter
	;

frlogParameter
	: (NONE
	| REDO)
	;

msg
	: MSG EQUAL SMBBIAS
	;

optcd
	: OPTCD EQUAL optcdParameter
	;

optcdParameter
	: (OPTCD_I
	| OPTCD_L 
	| OPTCD_IL)
	;

recfm
	: RECFM EQUAL recfmParameter
	;

recfmParameter
	: (RECFM_F
	| RECFM_FB
	| RECFM_V
	| RECFM_VB)
	;

rmode31
	: RMODE31 EQUAL rmode31Parameter
	;

rmode31Parameter
	: (ALL
	| BUFF
	| CB
	| NONE)
	;

smbdfr
	: SMBDFR EQUAL smbdfrParameter
	;

smbdfrParameter
	: (SMBDFR_Y
	| SMBDFR_N)
	;

smbhwt
	: SMBHWT EQUAL NUM_LIT
	;

smbvsp
	: SMBVSP EQUAL NUM_MEM_VAL
	;

smbvspi
	: SMBVSPI EQUAL NUM_MEM_VAL
	;

strno
	: STRNO EQUAL NUM_LIT
	;

synad
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

trace
	: TRACE EQUAL 
    LPAREN
        traceParameter (COMMA traceParameter)*
    RPAREN
	;

traceParameter
	: (traceHook
	| traceEcode
	| traceKey
	| traceParm1
	| traceParm2)
	;


traceHook
	: HOOK EQUAL LPAREN NUM_LIT (COMMA NUM_LIT)* RPAREN
	;

traceEcode
	: ECODE EQUAL traceEcodeParameter
	;

traceEcodeParameter
	: (ANY
	| NUM_LIT)
	;

traceKey
	: KEY EQUAL HEX_STRING (DASH HEX_STRING)?
	;

traceParm1
	: PARM1 EQUAL HEX_STRING
	;

traceParm2
	: PARM2 EQUAL HEX_STRING
	;



