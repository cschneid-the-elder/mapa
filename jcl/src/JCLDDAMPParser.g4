/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is obviously incomplete as of 14-Sep-2019.  Hoping to revisit when
the main JCL*.g4 source is in better shape.

*/

parser grammar JCLDDAMPParser;

options {tokenVocab=JCLDDAMPLexer;}


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

/*

https://www.ibm.com/support/knowledgecenter/SSLTBW_2.3.0/com.ibm.zos.v2r3.idar100/subprmtr.htm

The syntax for the TRACE subparameter of the AMP parameter of the DD statement
took a bit of digging to locate, so I'm recording the url here.  The vernacular 
would be...

Home > z/OS 2.3.0 > z/OS DFSMS > z/OS DFSMSdfp Diagnosis > VSAM diagnostic aids > VSAM record management (R/M) diagnostic aids > VSAM record management trace facility (non-RLS access) > Starting the record management trace function > Subparameters for trace

...for the future, when z/OS 2.3 documentation drops off the back of the stove.

*/
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


