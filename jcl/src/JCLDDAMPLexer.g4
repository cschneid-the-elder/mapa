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

lexer grammar JCLDDAMPLexer;

fragment A:'A';
fragment B:'B';
fragment C:'C';
fragment D:'D';
fragment E:'E';
fragment F:'F';
fragment G:'G';
fragment H:'H';
fragment I:'I';
fragment J:'J';
fragment K:'K';
fragment L:'L';
fragment M:'M';
fragment N:'N';
fragment O:'O';
fragment P:'P';
fragment Q:'Q';
fragment R:'R';
fragment S:'S';
fragment T:'T';
fragment U:'U';
fragment V:'V';
fragment W:'W';
fragment X:'X';
fragment Y:'Y';
fragment Z:'Z';

WS
	: [ ]+
	->skip
	;

COMMA
	: ','
	;

NEWLINE
	: [\r\n]
	->skip
	;

LPAREN
	: '('
	;

RPAREN
	: ')'
	;

EQUAL
	: '='
	;

DASH
	: '-'
	;

ACCBIAS
	: A C C B I A S
	;

ALL
	: A L L
	;

AMORG
	: A M O R G
	;

ANY
	: A N Y
	;

BUFF
	: B U F F
	;

BUFND
	: B U F N D
	;

BUFNI
	: B U F N I
	;

BUFSP
	: B U F S P
	;

CB
	: C B
	;

CROPS
	: C R O P S
	;

DO
	: D O
	;

DW
	: D W
	;

ECODE
	: E C O D E
	;

FRLOG
	: F R L O G
	;

HOOK
	: H O O K
	;

KEY
	: K E Y
	;

MSG
	: M S G
	;

NC
	: N C
	;

NCK
	: N C K
	;

NONE
	: N O N E
	;

NRC
	: N R C
	;

NRE
	: N R E
	;

OPTCD
	: O P T C D
	;

OPTCD_I
	: I
	;

OPTCD_L
	: L
	;

OPTCD_IL
	: I L
	;

PARM1
	: P A R M '1'
	;

PARM2
	: P A R M '2'
	;

RCK
	: R C K
	;

RECFM
	: R E C F M
	;

RECFM_F
	: F
	;

RECFM_FB
	: F B
	;

RECFM_V
	: V
	;

RECFM_VB
	: V B
	;

REDO
	: R E D O
	;

RMODE31
	: R M O D E '3' '1'
	;

SMBBIAS
	: S M B B I A S
	;

SMBDFR
	: S M B D F R
	;

SMBDFR_Y
	: Y
	;

SMBDFR_N
	: N
	;

SMBHWT
	: S M B H W T
	;

SMBVSP
	: S M B V S P
	;

SMBVSPI
	: S M B V S P I
	;

SO
	: S O
	;

STRNO
	: S T R N O
	;

SW
	: S W
	;

SYNAD
	: S Y N A D
	->pushMode(SYNAD_MODE)
	;

SYSTEM
	: S Y S T E M
	;

TRACE
	: T R A C E
	;

USER
	: U S E R
	;

NUM_LIT
	: [0-9]+
	;

fragment MEM_UNIT
	: (U | K | M | G | T | P)
	;

NUM_MEM_VAL
	: NUM_LIT MEM_UNIT
	;

HEX_STRING
	: [a-zA-Z0-9]+
	;

mode SYNAD_MODE ;

SYNAD_WS
	: WS
	->skip
	;

SYNAD_NEWLINE
	: NEWLINE
	->skip
	;

SYNAD_COMMA
	: COMMA
	->type(COMMA)
	;

SYNAD_EQUAL
	: EQUAL
	->type(EQUAL)
	;

MODULE_NAME
	: [A-Z0-9@#$]+
	->popMode
	;

