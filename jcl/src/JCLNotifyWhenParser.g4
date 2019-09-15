/*
Copyright (C) 2019, Craig Schneiderwent.  All rights reserved.  I accept
no liability for damages of any kind resulting from the use of this 
software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

This is obviously incomplete as of 15-Sep-2019.  Hoping to revisit when
the main JCL*.g4 source is in better shape.

*/

parser grammar JCLNotifyWhenParser;

options {tokenVocab=JCLNotifyWhenLexer;}


whenRelOp : (WHEN_EQ | WHEN_GE | WHEN_LE | WHEN_NE | WHEN_NG | WHEN_NL | WHEN_GT | WHEN_LT) ;
whenKeyword : (WHEN_ABEND | WHEN_ABENDCC | WHEN_RUN | WHEN_RC | WHEN_JCLERR | WHEN_SECERR) ;
whenTest : whenKeyword
    (whenRelOp (WHEN_FALSE | WHEN_TRUE | NUM_LIT | ALNUMNAT))? ;

whenStatement : WHEN
    NOT_SYMBOL* LPAREN*
      whenTest RPAREN* (IF_LOGICAL NOT_SYMBOL* LPAREN* whenTest RPAREN*)*
    RPAREN*
    THEN COMMENT_TEXT?
  ;

