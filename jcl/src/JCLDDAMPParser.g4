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
	: ACCBIAS EQUAL KEYWORD_VALUE+
	;

amorg
	: AMORG
	;

bufnd
	: BUFND EQUAL KEYWORD_VALUE+
	;

bufni
	: BUFNI EQUAL KEYWORD_VALUE+
	;

bufsp
	: BUFSP EQUAL KEYWORD_VALUE+
	;

crops
	: CROPS EQUAL KEYWORD_VALUE+
	;

frlog
	: FRLOG EQUAL KEYWORD_VALUE+
	;

msg
	: MSG EQUAL KEYWORD_VALUE+
	;

optcd
	: OPTCD EQUAL KEYWORD_VALUE+
	;

recfm
	: RECFM EQUAL KEYWORD_VALUE+
	;

rmode31
	: RMODE31 EQUAL KEYWORD_VALUE+
	;

smbdfr
	: SMBDFR EQUAL KEYWORD_VALUE+
	;

smbhwt
	: SMBHWT EQUAL KEYWORD_VALUE+
	;

smbvsp
	: SMBVSP EQUAL KEYWORD_VALUE+
	;

smbvspi
	: SMBVSPI EQUAL KEYWORD_VALUE+
	;

strno
	: STRNO EQUAL KEYWORD_VALUE+
	;

synad
	: SYNAD EQUAL KEYWORD_VALUE+
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
	: HOOK EQUAL LPAREN KEYWORD_VALUE+ (COMMA KEYWORD_VALUE+)* RPAREN
	;

traceEcode
	: ECODE EQUAL KEYWORD_VALUE+
	;

traceKey
	: KEY EQUAL KEYWORD_VALUE+ (DASH KEYWORD_VALUE+)?
	;

traceParm1
	: PARM1 EQUAL KEYWORD_VALUE+
	;

traceParm2
	: PARM2 EQUAL KEYWORD_VALUE+
	;



