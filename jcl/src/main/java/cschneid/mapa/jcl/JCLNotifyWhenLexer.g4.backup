/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is obviously incomplete as of 15-Sep-2019.  Hoping to revisit when
the main JCL*.g4 source is in better shape.

*/

lexer grammar JCLNotifyWhenLexer;

WHEN_JCLERR : J C L E R R ;
NOT_SYMBOL_DFLT : [^!] ->type(NOT_SYMBOL) ;
WHEN_SECERR : S E C E R R ;
WHEN_EQ : ('=' | (E Q));
WHEN_GE : (('>' '=') | (G E)) ;
WHEN_GT : ('>' | (G T)) ;
WHEN_LE : (('<' '=') | (L E)) ;
WHEN_LT : ('<' | (L T)) ;
WHEN_NE : ((NOT_SYMBOL_DFLT '=') | (N E)) ;
WHEN_NG : ((N G) | (NOT_SYMBOL_DFLT '>')) ;
WHEN_NL : ((N L) | (NOT_SYMBOL_DFLT '<')) ;
WHEN_NOT : NOT_SYMBOL_DFLT ->type(NOT_SYMBOL) ;
WHEN_LOGICAL : ('&' | '|') ;

WHEN_ABEND : A B E N D ->type(ABEND) ;
WHEN_ABENDCC : A B E N D C C ->type(ABENDCC) ;
WHEN_FALSE : F A L S E ->type(FALSE) ;
WHEN_RC : R C ->type(RC) ;
WHEN_RUN : R U N ->type(RUN) ;
WHEN_TRUE : T R U E ->type(TRUE) ;
WHEN_WS : [ ]+ ->channel(HIDDEN) ;
WHEN_NEWLINE : [\n\r] ->channel(HIDDEN) ;
WHEN_SS : SS ->channel(HIDDEN) ;

WHEN_REL_EXP_KEYWORD : ABEND_DFLT | ABENDCC_DFLT | RC_DFLT | RUN_DFLT | SECERR | JCLERR ;
WHEN_REL_OP : COND_OP | EQUAL_DFLT | WHEN_GE | WHEN_LE | WHEN_NE | WHEN_NG | WHEN_NL | WHEN_GT | WHEN_LT;

