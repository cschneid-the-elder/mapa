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
	->pushMode(KEYWORD_VALUE_MODE)
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
	->pushMode(KEYWORD_VALUE_MODE)
	;

BUFNI
	: B U F N I
	->pushMode(KEYWORD_VALUE_MODE)
	;

BUFSP
	: B U F S P
	->pushMode(KEYWORD_VALUE_MODE)
	;

CB
	: C B
	;

CROPS
	: C R O P S
	->pushMode(KEYWORD_VALUE_MODE)
	;

DO
	: D O
	;

DW
	: D W
	;

FRLOG
	: F R L O G
	->pushMode(KEYWORD_VALUE_MODE)
	;

MSG
	: M S G
	->pushMode(KEYWORD_VALUE_MODE)
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
	->pushMode(KEYWORD_VALUE_MODE)
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

RCK
	: R C K
	;

RECFM
	: R E C F M
	->pushMode(KEYWORD_VALUE_MODE)
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
	->pushMode(KEYWORD_VALUE_MODE)
	;

SMBBIAS
	: S M B B I A S
	->pushMode(KEYWORD_VALUE_MODE)
	;

SMBDFR
	: S M B D F R
	->pushMode(KEYWORD_VALUE_MODE)
	;

SMBDFR_Y
	: Y
	;

SMBDFR_N
	: N
	;

SMBHWT
	: S M B H W T
	->pushMode(KEYWORD_VALUE_MODE)
	;

SMBVSP
	: S M B V S P
	->pushMode(KEYWORD_VALUE_MODE)
	;

SMBVSPI
	: S M B V S P I
	->pushMode(KEYWORD_VALUE_MODE)
	;

SO
	: S O
	;

STRNO
	: S T R N O
	->pushMode(KEYWORD_VALUE_MODE)
	;

SW
	: S W
	;

SYNAD
	: S Y N A D
	->pushMode(KEYWORD_VALUE_MODE)
	;

SYSTEM
	: S Y S T E M
	;

TRACE
	: T R A C E
	;

ECODE
	: E C O D E
	->pushMode(KEYWORD_VALUE_MODE)
	;

HOOK
	: H O O K
	->pushMode(HOOK_MODE)
	;

KEY
	: K E Y
	->pushMode(KEYWORD_VALUE_MODE)
	;

PARM1
	: P A R M '1'
	->pushMode(KEYWORD_VALUE_MODE)
	;

PARM2
	: P A R M '2'
	->pushMode(KEYWORD_VALUE_MODE)
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

mode KEYWORD_VALUE_MODE ;

KEYWORD_VALUE_WS
	: WS
	->skip,popMode
	;

KEYWORD_VALUE_NEWLINE
	: NEWLINE
	->skip,popMode
	;

KEYWORD_VALUE_COMMA
	: COMMA
	->type(COMMA),popMode
	;

KEYWORD_VALUE_EQUAL
	: EQUAL
	->type(EQUAL)
	;

KEYWORD_VALUE_LPAREN
	: LPAREN
	->type(LPAREN),pushMode(KEYWORD_VALUE_MODE)
	;

KEYWORD_VALUE_RPAREN
	: RPAREN
	->type(RPAREN),popMode
	;

KEYWORD_VALUE
	: ([a-zA-Z0-9&@#$_\-.]+?)
	;

mode HOOK_MODE ;

HOOK_LPAREN
	: LPAREN
	->type(LPAREN)
	;

HOOK_RPAREN
	: RPAREN
	->type(RPAREN),popMode
	;

HOOK_WS
	: WS
	->skip
	;

HOOK_NEWLINE
	: NEWLINE
	->skip
	;

HOOK_COMMA
	: COMMA
	->type(COMMA)
	;

HOOK_EQUAL
	: EQUAL
	->type(EQUAL)
	;

HOOK_KEYWORD_VALUE
	: KEYWORD_VALUE
	->type(KEYWORD_VALUE)
	;


