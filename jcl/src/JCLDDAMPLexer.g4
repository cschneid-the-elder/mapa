/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is obviously incomplete as of 14-Sep-2019.  Hoping to revisit when
the main JCL*.g4 source is in better shape.

*/

lexer grammar JCLDDAMPLexer;

ACCBIAS : A C C B I A S ;
ALL : A L L ;
BUFF : B U F F ;
CB : C B ;
CROPS : C R O P S ;
DO : D O ;
DW : D W ;
FRLOG : F R L O G ;
MSG : M S G ;
NC : N C ;
NCK : N C K ;
NONE : N O N E ;
NRC : N R C ;
NRE : N R E ;
PARM1 : P A R M '1' ;
PARM2 : P A R M '2' ;
RCK : R C K ;
REDO : R E D O ;
RMODE31 : R M O D E '3' '1' ;
SMBBIAS : S M B B I A S ;
SMBDFR : S M B D F R ;
SMBHWT : S M B H W T ;
SMBVSP : S M B V S P ;
SMBVSPI : S M B V S P I ;
SO : S O ;
STRNO : S T R N O ;
SW : S W ;
SYNAD : S Y N A D ;
TRACE : T R A C E ;


mode AMP_MODE ;

AMP_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
AMP_EQUAL : EQUAL_DFLT ->type(EQUAL) ;
AMP_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC),popMode ;
AMP_LPAREN : LPAREN_DFLT ->type(LPAREN),pushMode(AMP_PAREN_MODE) ;

mode AMP_PAREN_MODE ;

AMP_PAREN_SQUOTE : '\'' ->channel(HIDDEN),pushMode(QS) ;
AMP_PAREN_COMMA : COMMA_DFLT ->type(COMMA) ;
AMP_PAREN_SYMBOLIC : SYMBOLIC ->type(SYMBOLIC) ;
AMP_PAREN_RPAREN : RPAREN_DFLT ->type(RPAREN),popMode,popMode ;
AMP_PAREN_WS : [ ]+ ->channel(HIDDEN),pushMode(COMMA_WS_MODE) ;
AMP_PAREN_NEWLINE : NEWLINE ->channel(HIDDEN),pushMode(COMMA_NEWLINE_MODE) ;


