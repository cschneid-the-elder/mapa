/*
 Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 All rights reserved.

 Portions copyright (C) 2019 - 2021, Craig Schneiderwent.

 This software may be modified and distributed under the terms
 of the MIT license. See the LICENSE file for details.
*/

/*
 COBOL Preprocessor Grammar for ANTLR4

 This is a preprocessor grammar for COBOL, which is part of the COBOL 
 parser at https://github.com/uwol/proleap-cobol-parser.
*/

parser grammar CobolPreprocessorParser ;

options {tokenVocab=CobolPreprocessorLexer;}


startRule
   : (identificationDivisionTag | compilerOptions | compilerDirectiveStatement | classicCommentEntry | copyStatement | execCicsStatement | execSqlStatement | execSqlImsStatement | replaceOffStatement | replaceArea | ejectStatement | skipStatement | titleStatement | charDataLine | NEWLINE)* EOF
   ;

// --- identification division (sort of, enough to recognize if this is a COBOL program)

identificationDivisionTag
   : (IDENTIFICATION | ID) DIVISION
   ;

// compiler options

compilerOptions
   : (PROCESS | CBL) (COMMACHAR? compilerOption | compilerXOpts)+
   ;

compilerXOpts
   : XOPTS LPARENCHAR compilerOption (COMMACHAR? compilerOption)* RPARENCHAR
   ;

compilerOption
   : ADATA | ADV | (AFP LPARENCHAR (NOVOLATILE | VOLATILE) RPARENCHAR) | APOST
   | (ARCH LPARENCHAR literal RPARENCHAR)
   | (ARITH | AR) LPARENCHAR (EXTEND | E_CHAR | COMPAT | C_CHAR) RPARENCHAR
   | AWO
   | BLOCK0
   | (BUFSIZE | BUF) LPARENCHAR literal RPARENCHAR
   | CBLCARD
   | CICS (LPARENCHAR literal RPARENCHAR)?
   | COBOL2 | COBOL3
   | (CODEPAGE | CP) LPARENCHAR literal RPARENCHAR
   | (COMPILE | C_CHAR) 
   | (CONDCOMP LPARENCHAR (SKIPSRC | SKIPS | NOSKIPS | NOSKIPSRC) RPARENCHAR)
   | ((COPYLOC | CPLC) LPARENCHAR (IDENTIFIER | literal)? (COMMACHAR? DSN LPARENCHAR FILENAME RPARENCHAR)? (COMMACHAR? PATH LPARENCHAR literal RPARENCHAR)? RPARENCHAR)
   | ((COPYRIGHT | CPYR) LPARENCHAR literal RPARENCHAR)
   | CPP | CPSM
   | (CURRENCY | CURR) LPARENCHAR TEXT+ RPARENCHAR
   | DATA LPARENCHAR literal RPARENCHAR
   | (DATEPROC | DP) (LPARENCHAR (FLAG | NOFLAG)? COMMACHAR? (TRIG | NOTRIG)? RPARENCHAR)?
   | DBCS 
   | (DECK | D_CHAR) 
   | DEBUG 
   | define_opt
   | (DIAGTRUNC | DTR)
   | ((DISPSIGN | DS) LPARENCHAR (COMPAT | C_CHAR | SEP | S_CHAR) RPARENCHAR)
   | DLL
   | (DUMP | DU) 
   | (DYNAM | DYN)
   | EDF | EPILOG 
   | EXIT
   | (EXPORTALL | EXP)
   | (FASTSRT | FSRT) 
   | FEPI
   | (FLAG | F_CHAR) LPARENCHAR (E_CHAR | I_CHAR | S_CHAR | U_CHAR | W_CHAR) (COMMACHAR (E_CHAR | I_CHAR | S_CHAR | U_CHAR | W_CHAR))? RPARENCHAR
   | FLAGSTD LPARENCHAR (M_CHAR | I_CHAR | H_CHAR) (COMMACHAR (D_CHAR | DD | N_CHAR | NN | S_CHAR | SS))? (COMMACHAR O_CHAR)? RPARENCHAR
   | GDS | GRAPHIC
   | (HGPR LPARENCHAR (PRESERVE | NOPRESERVE) RPARENCHAR)
   | INTDATE LPARENCHAR (ANSI | LILIAN) RPARENCHAR
   | ((INITCHECK | IC) (LPARENCHAR (LAX | STRICT) RPARENCHAR)?)
   | INITIAL
   | INLINE | INL
   | ((INVDATA | INVD) (LPARENCHAR invdata_opts (COMMACHAR invdata_opts)* RPARENCHAR)?)
   | javaiop
   | (LANGUAGE | LANG) LPARENCHAR (ENGLISH | CS | EN | JA | JP | KA | UE) RPARENCHAR
   | LEASM | LENGTH | LIB | LIN
   | (LINECOUNT | LC) LPARENCHAR literal RPARENCHAR
   | LINKAGE | LIST
   | (LP LPARENCHAR literal RPARENCHAR)
   | (MAP (LPARENCHAR (HEX | DEC) RPARENCHAR)?)
   | MARGINS LPARENCHAR literal COMMACHAR literal (COMMACHAR literal)? RPARENCHAR
   | (MAXPCF LPARENCHAR literal RPARENCHAR)
   | (MDECK | MD) (LPARENCHAR (C_CHAR | COMPILE | NOC | NOCOMPILE) RPARENCHAR)?
   | NAME (LPARENCHAR (ALIAS | NOALIAS) RPARENCHAR)?
   | NATLANG LPARENCHAR (CS | EN | KA) RPARENCHAR
   | NOADATA | NOADV | NOAWO
   | NOBLOCK0
   | NOCBLCARD | NOCICS | NOCMPR2
   | (NOCOMPILE | NOC) (LPARENCHAR (S_CHAR | E_CHAR | W_CHAR) RPARENCHAR)?
   | NOCOPYLOC | NOCPLC
   | NOCOPYRIGHT | NOCPYR
   | NOCPSM 
   | (NOCURRENCY | NOCURR)
   | (NODATEPROC | NODP) 
   | NODBCS | NODEBUG 
   | (NODECK | NOD) 
   | (NODEFINE | NODEF)
   | NODLL | NODE 
   | (NODUMP | NODU)
   | (NODIAGTRUNC | NODTR) 
   | (NODYNAM | NODYN)
   | NOEDF | NOEPILOG | NOEXIT 
   | (NOEXPORTALL | NOEXP)
   | (NOFASTSRT | NOFSRT)
   | NOFEPI 
   | (NOFLAG | NOF) 
   | NOFLAGMIG | NOFLAGSTD
   | NOGRAPHIC
   | (NOINITCHECK | NOIC)
   | NOINITIAL
   | NOINLINE | NOINL
   | (NOINVDATA | NOINVD)
   | NOJAVAIOP
   | NOLENGTH | NOLIB | NOLINKAGE | NOLIST
   | NOMAP 
   | (NOMDECK | NOMD)
   | NONAME 
   | (NONUMBER | NONUM)
   | (NOOBJECT | NOOBJ) 
   | (NOOFFSET | NOOFF) 
   | NOOPSEQUENCE
   | (NOOPTIMIZE | NOOPT) 
   | NOOPTIONS 
   | NOP | NOPARMCHECK | NOPROLOG
   | NORENT | NORULES
   | (NOSEQUENCE | NOSEQ) 
   | (NOSERVICE | NOSERV)
   | NOSMARTBIN
   | (NOSOURCE | NOS) 
   | NOSPIE | NOSQL | NOSQLIMS
   | (NOSQLCCSID | NOSQLC) 
   | (NOSSRANGE | NOSSR) 
   | NOSTDTRUNC
   | (NOSTGOPT | NOSO)
   | (NOSUPP | NOSUPPRESS)
   | (NOTERMINAL | NOTERM) | NOTEST | NOTHREAD
   | NOVBREF
   | (NOWORD | NOWD)
   | NSEQ 
   | (NSYMBOL | NS) LPARENCHAR (NATIONAL | NAT | DBCS) RPARENCHAR
   | NOVBREF
   | (NOXREF | NOX)
   | (NOZC | NOZONECHECK)
   | NOZWB
   | (NUMBER | NUM)
   | ((NUMCHECK | NC) (LPARENCHAR numcheck_opts (COMMACHAR numcheck_opts)* RPARENCHAR)?)
   | NUMPROC LPARENCHAR (MIG | NOPFD | PFD) RPARENCHAR
   | (OBJECT | OBJ) 
   | (OFFSET | OFF)
   | OPMARGINS LPARENCHAR literal COMMACHAR literal (COMMACHAR literal)? RPARENCHAR
   | OPSEQUENCE LPARENCHAR literal COMMACHAR literal RPARENCHAR
   | (OPTIMIZE | OPT) (LPARENCHAR (FULL | STD | NUMERICLITERAL) RPARENCHAR)?
   | OPTFILE | OPTIONS | OP
   | (OUTDD | OUT) LPARENCHAR cobolWord RPARENCHAR
   | ((PARMCHECK | PC) (LPARENCHAR (MSG | ABD)? (COMMACHAR? literal)? RPARENCHAR)?)
   | (PGMNAME | PGMN) LPARENCHAR (CO | COMPAT | LM | LONGMIXED | LONGUPPER | LU | M_CHAR | MIXED | U_CHAR | UPPER) RPARENCHAR
   | PROLOG
   | ((QUALIFY | QUA) LPARENCHAR (COMPAT | C_CHAR | EXTEND | E_CHAR) RPARENCHAR)
   | (QUOTE | Q_CHAR)
   | RENT
   | RMODE LPARENCHAR (ANY | AUTO | literal) RPARENCHAR
   | (RULES (LPARENCHAR rules_opts (COMMACHAR rules_opts)* RPARENCHAR)?)
   | (SEQUENCE | SEQ) (LPARENCHAR literal COMMACHAR literal RPARENCHAR)?
   | ((SERVICE | SERV) LPARENCHAR literal RPARENCHAR)
   | (SIZE | SZ) LPARENCHAR (MAX | literal) RPARENCHAR
   | SMARTBIN
   | ((SOURCE | S_CHAR) (LPARENCHAR (DEC | HEX) RPARENCHAR)?)
   | SP
   | SPACE LPARENCHAR literal RPARENCHAR
   | SPIE
   | SQL (LPARENCHAR literal RPARENCHAR)?
   | (SQLCCSID | SQLC) 
   | SQLIMS (LPARENCHAR literal RPARENCHAR)?
   | ((SSRANGE | SSR) (LPARENCHAR ssrange_opts (COMMACHAR ssrange_opts)* RPARENCHAR)?)
   | (STGOPT | SO)
   | (SUPP | SUPPRESS)
   | SYSEIB
   | (TERMINAL | TERM)
   | (TEST (LPARENCHAR test_opts (COMMACHAR test_opts)* RPARENCHAR)?)
   | THREAD
   | TRUNC LPARENCHAR (BIN | OPT | STD) RPARENCHAR
   | (TUNE LPARENCHAR literal RPARENCHAR) 
   | VBREF
   | (VLR LPARENCHAR (STANDARD | S_CHAR | COMPAT | C_CHAR) RPARENCHAR)
   | ((VSAMOPENFS | VS) LPARENCHAR (COMPAT | C_CHAR | SUCC | S_CHAR) RPARENCHAR)
   | (WORD | WD) LPARENCHAR (cobolWord | TEXT+) RPARENCHAR
   | (XMLPARSE | XP) LPARENCHAR (COMPAT | C_CHAR | XMLSS | X_CHAR) RPARENCHAR
   | (XREF | X_CHAR) (LPARENCHAR (FULL | SHORT)? RPARENCHAR)?
   | (YEARWINDOW | YW) LPARENCHAR literal RPARENCHAR
   | ((ZC | ZONECHECK) LPARENCHAR (MSG | ABD) RPARENCHAR)
   | ((ZD | ZONEDATA) LPARENCHAR (PFD | MIG | NOPFD) RPARENCHAR)
   | ZWB
   | test_opts
   ;

define_opt
   : ((DEFINE | DEF) LPARENCHAR identifier_et_al ((TEXT+ | COMMACHAR) literal)? RPARENCHAR)
   ;

identifier_et_al
   : (IDENTIFIER
   | C_CHAR
   | D_CHAR
   | E_CHAR
   | F_CHAR
   | H_CHAR
   | I_CHAR
   | M_CHAR
   | N_CHAR
   | O_CHAR
   | Q_CHAR
   | S_CHAR
   | U_CHAR
   | W_CHAR
   | X_CHAR)
   ;

invdata_opts
   : (CLEANSIGN
   | CS
   | NOCLEANSIGN
   | NOCS
   | FORCENUMCMP
   | FNC
   | NOFORCENUMCMP
   | NOFNC)
   ;

numcheck_opts
   : (ZON
   | (ZON LPARENCHAR numcheck_zon_opts (COMMACHAR numcheck_zon_opts)* RPARENCHAR)
   | NOZON
   | PAC
   | NOPAC
   | (BIN (LPARENCHAR (TRUNCBIN | NOTRUNCBIN) RPARENCHAR)?)
   | NOBIN
   | MSG
   | ABD)
   ;

numcheck_zon_opts
   : (ALPHNUM
   | NOALPHNUM
   | LAXREDEF
   | STRICTREDEF
   | LAX
   | STRICT)
   ;

rules_opts
    : (ENDPERIOD
    | ENDP
    | NOENDPERIOD
    | NOENDP
    | EVENPACK
    | EVENP
    | NOEVENPACK
    | NOEVENP
    | LAXPERF
    | LXPRF
    | LAXREDEF
    | NOLAXPERF
    | NOLXPRF
    | NOLAXREDEF
    | SLACKBYTES
    | SLCKB
    | NOSLACKBYTES
    | NOSLCKB
    | OMITODOMIN
    | OOM
    | NOOMITODOMIN
    | NOOOM
    | UNREF
    | NOUNREFALL
    | NOUNRA
    | NOUNREFSOURCE
    | NOUNRS)
    ;

ssrange_opts
    : (NOZLEN
    | ZLEN
    | ABD
    | MSG)
    ;

test_opts
    : (DWARF
    | NODWARF
    | HOOK
    | NOHOOK
    | ((SEP | SEPARATE) (LPARENCHAR (DSNAME | NODSNAME) RPARENCHAR)?)
    | NOSEP
    | NOSEPARATE
    | SO
    | SOURCE
    | NOSO
    | NOSOURCE
    | EJPD
    | NOEJPD)
    ;

javaiop
    : (JAVAIOP (LPARENCHAR javaiopOption (COMMACHAR javaiopOption)* RPARENCHAR)?)
    ;

javaiopOption
    : ((OUTPATH LPARENCHAR literal RPARENCHAR)
    | (JVMINITOPTIONS LPARENCHAR literal RPARENCHAR)
    | NOJAVA64
    | JAVA64)
    ;

classicCommentEntry
    : CLASSIC_COMMENT_TAG CLASSIC_COMMENT_TEXT* NEWLINE
    ;

// exec cics statement

execCicsStatement
   : EXEC_CICS (CICS_TEXT+ | classicCommentEntry)+ END_EXEC DOT?
   ;

// exec sql statement

execSqlStatement
   : EXEC_SQL (SQL_TEXT+ | classicCommentEntry)+ END_EXEC DOT?
   ;

// exec sql ims statement

execSqlImsStatement
   : EXEC SQLIMS (charData | classicCommentEntry)+ END_EXEC DOT?
   ;

// copy statement

copyStatement
   : COPY copySource (NEWLINE* (replacingPhrase | SUPPRESS))* NEWLINE* DOT
   ;

copySource
   : (literal | cobolWord | filename) (NEWLINE* (OF | IN) NEWLINE* copyLibrary)?
   ;

copyLibrary
   : literal | cobolWord
   ;

replacingPhrase
   : REPLACING NEWLINE* replaceClause (NEWLINE+ replaceClause)*
   ;

// replace statement

replaceArea
   : replaceByStatement (copyStatement | charData)* replaceOffStatement?
   ;

replaceByStatement
   : REPLACE (NEWLINE* replaceClause)+ NEWLINE* DOT
   ;

replaceOffStatement
   : REPLACE OFF NEWLINE* DOT
   ;

replaceClause
   : (LEADING | TRAILING)? replaceable NEWLINE* BY NEWLINE* replacement (NEWLINE* directoryPhrase)? (NEWLINE* familyPhrase)?
   ;


directoryPhrase
   : (OF | IN) NEWLINE* (literal | cobolWord)
   ;

familyPhrase
   : ON NEWLINE* (literal | cobolWord)
   ;


replaceable
   : literal | cobolWord | pseudoText | charDataLine
   ;

replacement
   : literal | cobolWord | pseudoText | charDataLine
   ;

// eject statement

ejectStatement
   : EJECT DOT?
   ;

// skip statement

skipStatement
   : (SKIP1 | SKIP2 | SKIP3) DOT?
   ;

// title statement

titleStatement
   : TITLE literal DOT?
   ;

// literal ----------------------------------

pseudoText
   : DOUBLEEQUALCHAR charData? DOUBLEEQUALCHAR
   ;

charData
   : (charDataLine | NEWLINE)+
   ;

charDataSql
   : (charDataLine | COPY | REPLACE | NEWLINE)+
   ;

charDataLine
   : (cobolWord | literal | filename | PSEUDOTEXTIDENTIFIER | TEXT | DOT | LPARENCHAR | RPARENCHAR | dfhvalue)+ (NEWLINE CLASSIC_CONTINUATION (cobolWord | literal | filename | PSEUDOTEXTIDENTIFIER | TEXT | DOT | LPARENCHAR | RPARENCHAR)+)*
   ;

cobolWord
   : IDENTIFIER | charDataKeyword
   ;

literal
   : NONNUMERICLITERAL | NUMERICLITERAL | CONTINUED_NONNUMERICLITERAL
   ;

filename
   : FILENAME
   ;

/*
This rule was originally part of the charDataKeyword rule and
quadrupled the clock time of parsing.  Breaking it out here
restored balance to the universe.
*/
dfhvalue
   : (DFHVALUE LPARENCHAR (cobolWord | COPY | PROCESS) RPARENCHAR)
   ;

compilerDirectiveStatement
   : (compilerDirective | conditionalCompilationStatement)
   ;

compilerDirective
   : (
   compilerDirectiveCallInterface 
   | compilerDirectiveInline
   | compilerDirectiveBasis
   | compilerDirectiveInsert
   | compilerDirectiveDelete
   | compilerDirectiveData
   | compilerDirectiveCallConvention
   | compilerDirectiveCobolWords
   | compilerDirectiveDisplay
   | compilerDirectiveFlag02
   | compilerDirectiveFlag14
   | compilerDirectiveJavaCallable
   | compilerDirectiveJavaShareable
   | compilerDirectiveLeapSecond
   | compilerDirectiveListing
   | compilerDirectivePage
   | compilerDirectivePop
   | compilerDirectivePropogate
   | compilerDirectivePush
   | compilerDirectiveRefModZeroLength
   | compilerDirectiveSource
   | compilerDirectiveTurn
   )
   ;

conditionalCompilationStatement
   : (conditionalCompilationDefine 
   | conditionalCompilationIf 
   | conditionalCompilationElse 
   | conditionalCompilationEndIf
   | conditionalCompilationEvaluate
   | conditionalCompilationWhen
   | conditionalCompilationEndEvaluate)
   ;

compilerDirectiveCallInterface
   : (COMPILER_DIRECTIVE_TAG (CALLINTERFACE | CALLINT) (STATIC | DYNAMIC | DLL_INTERFACE)?)
   ;

compilerDirectiveInline
   : (COMPILER_DIRECTIVE_TAG INLINE (COMP_DIR_ON | COMP_DIR_OFF))
   ;

compilerDirectiveBasis
   : (BASIS basisName)
   ;

basisName
   : (literal | cobolWord | filename)
   ;

compilerDirectiveInsert
   : (INSERT NUMERICLITERAL)
   ;

compilerDirectiveDelete
   : (
   DELETE compilerDirectiveDeleteSequenceNumber
   )
   ;

compilerDirectiveData
   : (COMPILER_DIRECTIVE_TAG COMP_DIR_DATA NUMERICLITERAL)
   ;

compilerDirectiveCallConvention
   : (COMPILER_DIRECTIVE_TAG CALL_CONVENTION (COBOL | IDENTIFIER))
   ;
   
compilerDirectiveCobolWords
   : (COMPILER_DIRECTIVE_TAG COBOL_WORDS
      ( compilerDirectiveCobolWordsEquate
      | compilerDirectiveCobolWordsUndefine
      | compilerDirectiveCobolWordsSubstitute
      | compilerDirectiveCobolWordsReserve
      )
   )
   ;
   
compilerDirectiveDisplay
   : (COMPILER_DIRECTIVE_TAG DISPLAY
      (conditionalCompilationArithmeticExpression
      | conditionalCompilationRelationalCondition
      | literal
      | (PARAMETER IDENTIFIER)
      )
   )
   ;
      
compilerDirectiveFlag02
   : (COMPILER_DIRECTIVE_TAG FLAG_02 (ALL | IDENTIFIER) (COMP_DIR_ON | COMP_DIR_OFF))
   ;

compilerDirectiveFlag14
   : (COMPILER_DIRECTIVE_TAG FLAG_14 (ALL | IDENTIFIER | REF_MOD_ZERO_LENGTH) (COMP_DIR_ON | COMP_DIR_OFF))
   ;

compilerDirectiveJavaCallable
   : (COMPILER_DIRECTIVE_TAG JAVA_CALLABLE)
   ;
   
compilerDirectiveJavaShareable
   : (COMPILER_DIRECTIVE_TAG JAVA_SHAREABLE (COMP_DIR_ON | COMP_DIR_OFF))
   ;

compilerDirectiveLeapSecond
   : (COMPILER_DIRECTIVE_TAG LEAP_SECOND (COMP_DIR_ON | COMP_DIR_OFF))
   ;

compilerDirectiveListing
   : (COMPILER_DIRECTIVE_TAG LISTING (COMP_DIR_ON | COMP_DIR_OFF))
   ;
   
compilerDirectivePage
   : (COMPILER_DIRECTIVE_TAG PAGE PAGE_COMMENT_TEXT* NEWLINE)
   ;
   
compilerDirectivePop
   : (COMPILER_DIRECTIVE_TAG POP (ALL | compilerDirectivePopList))
   ;
   
compilerDirectivePropogate
   : (COMPILER_DIRECTIVE_TAG PROPOGATE (COMP_DIR_ON | COMP_DIR_OFF))
   ;
   
compilerDirectivePush
   : (COMPILER_DIRECTIVE_TAG PUSH (ALL | compilerDirectivePopList))
   ;
   
compilerDirectiveRefModZeroLength
   : (COMPILER_DIRECTIVE_TAG REF_MOD_ZERO_LENGTH (COMP_DIR_ON | COMP_DIR_OFF))
   ;

compilerDirectiveSource
   : (COMPILER_DIRECTIVE_TAG SOURCE (FORMAT IS)? (FIXED | COMP_DIR_FREE))
   ;

compilerDirectiveTurn
   : (COMPILER_DIRECTIVE_TAG TURN IDENTIFIER* CHECKING (COMP_DIR_OFF | (COMP_DIR_ON? WITH? LOCATION)))
   ;

compilerDirectivePopList
   : (CALL_CONVENTION
   | COBOL_WORDS
   | DEFINE
   | DISPLAY
   | FLAG_02
   | FLAG_14
   | LEAP_SECOND
   | LISTING
   | PROPOGATE
   | REF_MOD_ZERO_LENGTH
   | SOURCE
   | TURN
   )
   ;
   
compilerDirectiveCobolWordsEquate
   : (EQUATE literal WITH literal)
   ;

compilerDirectiveCobolWordsUndefine
   : (UNDEFINE literal)
   ;
   
compilerDirectiveCobolWordsSubstitute
   : (SUBSTITUTE literal BY literal)
   ;
   
compilerDirectiveCobolWordsReserve
   : (RESERVE literal)
   ;
   
compilerDirectiveNumericRange
   : (compilerDirectiveNumericAtom MINUSCHAR compilerDirectiveNumericAtom)
   ;

compilerDirectiveNumericAtom
   : (NUMERICLITERAL)
   ;

compilerDirectiveDeleteSequenceNumber
   : (
   (compilerDirectiveNumericAtom | compilerDirectiveNumericRange)
   (COMMACHAR (compilerDirectiveNumericAtom | compilerDirectiveNumericRange))*
   )
   ;

conditionalCompilationDefine
   : (COMPILER_DIRECTIVE_TAG DEFINE IDENTIFIER AS? (conditionalCompilationDefinePredicate | COMP_DIR_OFF)?  OVERRIDE?)
   ;

conditionalCompilationDefinePredicate
   : (literal
   | conditionalCompilationArithmeticExpression
   | IDENTIFIER
   | PARAMETER)
   ;

conditionalCompilationArithmeticExpression
   : ((LPARENCHAR* conditionalCompilationArithmeticAtom conditionalCompilationArithmeticOp)+ (LPARENCHAR* conditionalCompilationArithmeticAtom RPARENCHAR* conditionalCompilationArithmeticOp)* conditionalCompilationArithmeticAtom RPARENCHAR*)
   ;

conditionalCompilationArithmeticAtom
   : (IDENTIFIER
   | ZERO
   | NUMERICLITERAL)
   ;

conditionalCompilationArithmeticOp
   : (ASTERISKCHAR
   | MINUSCHAR
   | PLUSCHAR
   | SLASHCHAR)
   ;

conditionalCompilationIf
   : (COMPILER_DIRECTIVE_TAG IF conditionalCompilationRelationalCondition)
   ;

conditionalCompilationElse
   : COMPILER_DIRECTIVE_TAG ELSE
   ;

conditionalCompilationEndIf
   : COMPILER_DIRECTIVE_TAG END_IF
   ;

conditionalCompilationEvaluateSelection
   : (conditionalCompilationArithmeticExpression
   | IDENTIFIER
   | literal)
   ;

conditionalCompilationEvaluate
   : COMPILER_DIRECTIVE_TAG EVALUATE (TRUE | conditionalCompilationEvaluateSelection)
   ;

conditionalCompilationWhen
   : COMPILER_DIRECTIVE_TAG WHEN ((conditionalCompilationEvaluateSelection ((THROUGH | THRU) conditionalCompilationEvaluateSelection)?) | conditionalCompilationRelationalCondition | OTHER)
   ;

conditionalCompilationEndEvaluate
   : COMPILER_DIRECTIVE_TAG END_EVALUATE
   ;

conditionalCompilationComparisonOp
   : (IS? NOT? (EQUAL | EQUALCHAR | NOTEQUALCHAR | LESSTHANCHAR | (GREATER THAN?) | GREATERTHANCHAR | (LESS THAN?) | LESSOREQUALCHAR | (LESS THAN? OR EQUAL) | GREATEROREQUALCHAR | (GREATER THAN? OR EQUAL)) TO?)
   ;

conditionalCompilationRelationalCondition
   : (LPARENCHAR* conditionalCompilationCondition ((AND | OR) LPARENCHAR* conditionalCompilationCondition RPARENCHAR*)* RPARENCHAR*)+
   ;

conditionalCompilationCondition
   : (conditionalCompilationSimpleRelationalCondition | conditionalCompilationDefinedCondition | conditionalCompilationBinaryCondition)
   ;

conditionalCompilationSimpleRelationalCondition
   : ((conditionalCompilationArithmeticExpression | IDENTIFIER | literal) conditionalCompilationComparisonOp (conditionalCompilationArithmeticExpression | IDENTIFIER | literal))
   ;

conditionalCompilationBinaryCondition
   : IDENTIFIER
   ;

conditionalCompilationDefinedCondition
   : (IDENTIFIER IS? NOT? DEFINED)
   ;

// keywords ----------------------------------

charDataKeyword
   : ABD | ADATA | ADV | AFP | ALIAS | ALPHNUM | ANSI | ANY | APOST | AR | ARCH | ARITH | AUTO | AWO
   | BIN | BLOCK0 | BUF | BUFSIZE | BY
   | CBLCARD | CICS | CO | COBOL2 | COBOL3 | CODEPAGE | COMMACHAR | COMPAT | COMPILE | COPYLOC | COPYRIGHT | CP | CPLC | CPP | CPSM | CPYR | CS | CURR | CURRENCY
   | DATA | DATEPROC | DBCS | DD | DEBUG | DEC | DECK | DEF | DEFINE | DIAGTRUNC | DISPSIGN | DLI | DLL | DP | DS | DSN | DSNAME | DTR | DU | DUMP | DYN | DYNAM | DWARF
   | EDF | EJECT | EJPD | EN | ENDP | ENDPERIOD | ENGLISH | EPILOG | EVENPACK | EVENP | EXCI | EXIT | EXP | EXPORTALL | EXTEND
   | FASTSRT | FLAG | FLAGSTD | FULL | FSRT
   | GDS | GRAPHIC
   | HEX | HGPR | HOOK
   | IN | INITCHECK | IC | INTDATE | INITIAL | INL
   | JA | JP
   | KA
   | LANG | LANGUAGE | LAX | LAXPERF | LC | LENGTH | LIB | LILIAN | LIN | LINECOUNT | LINKAGE | LIST | LM | LONGMIXED | LONGUPPER | LP | LU | LXPRF
   | MAP | MARGINS | MAX | MAXPCF | MD | MDECK | MIG | MIXED | MSG
   | NAME | NAT | NATIONAL | NATLANG
   | NC
   | NN
   | NO
   | NOADATA | NOADV | NOALIAS | NOALPHNUM | NOAWO
   | NOBIN | NOBLOCK0
   | NC
   | NOC | NOCBLCARD | NOCICS | NOCMPR2 | NOCOMPILE | NOCOPYLOC | NOCOPYRIGHT | NOCPLC | NOCPSM | NOCPYR | NOCURR | NOCURRENCY
   | NOD | NODATEPROC | NODBCS | NODE | NODEBUG | NODECK | NODEF | NODEFINE | NODEF | NODIAGTRUNC | NODLL | NODSNAME | NODU | NODUMP | NODP | NODTR | NODYN | NODYNAM | NODWARF
   | NOEDF | NOEJPD | NOENDP | NOENDPERIOD | NOEPILOG | NOEVENP | NOEVENPACK | NOEXIT | NOEXP | NOEXPORTALL
   | NOF | NOFASTSRT | NOFEPI | NOFLAG | NOFLAGMIG | NOFLAGSTD | NOFSRT
   | NOGRAPHIC
   | NOHOOK
   | NOIC | NOINITCHECK | NOIC | NOINITIAL | NOINLINE | NOINL
   | NOLAXPERF | NOLENGTH | NOLIB | NOLINKAGE | NOLIST | NOLXPRF
   | NOMAP | NOMD | NOMDECK
   | NONAME | NONUM | NONUMBER
   | NOOBJ | NOOBJECT | NOOOM | NOOMITODOMIN | NOOFF | NOOFFSET | NOOPSEQUENCE | NOOPT | NOOPTIMIZE | NOOPTIONS
   | NOP | NOPAC | NOPARMCHECK | NOPFD | NOPRESERVE | NOPROLOG
   | NORENT | NORULES
   | NOS | NOSEP | NOSEPARATE | NOSEQ | NOSEQUENCE | NOSERV | NOSERVICE | NOSLACKBYTES | NOSLCKB | NOSO | NOSPIE | NOSOURCE | NOSQL | NOSQLC | NOSQLCCSID | NOSQLIMS | NOSSR | NOSSRANGE | NOSTDTRUNC | NOSTGOPT | NOSUPP | NOSUPPRESS
   | NOTERM | NOTERMINAL | NOTEST | NOTHREAD | NOTRIG
   | NOUNRA | NOUNREFALL | NOUNREFSOURCE | NOUNRS
   | NOVBREF | NOVOLATILE
   | NOWORD
   | NOX | NOXREF
   | NOZC | NOZLEN | NOZON | NOZONECHECK | NOZWB
   | NSEQ | NSYMBOL | NS
   | NUM | NUMBER | NUMCHECK | NUMPROC
   | OBJ | OBJECT | ON | OF | OFF | OFFSET | OMITODOMIN | OOM | OPMARGINS | OPSEQUENCE | OPTIMIZE | OP | OPT | OPTFILE | OPTIONS | OR | OUT | OUTDD
   | PAC | PARMCHECK | PATH | PFD | PGMN | PGMNAME | PLUSCHAR | PPTDBG | PRESERVE | PROLOG
   | QUALIFY | QUA | QUOTE
   | RENT | REPLACING | RMODE | RULES
   | SEQ | SEQUENCE | SEP | SEPARATE | SERV | SERVICE | SHORT | SIZE | SLACKBYTES | SLCKB | SO | SOURCE | SP | SPACE | SPIE | SQL | SQLC | SQLCCSID | SQLIMS | SS | SSR | SSRANGE | STD | STANDARD | STATIC | STGOPT | STRICT | SUCC | SUPP | SUPPRESS | SYSEIB | SZ
   | TERM | TERMINAL | TEST | THREAD | TITLE | TO | TRIG | TRUE | TRUNC
   | UE | UNREF | UPPER
   | VBREF | VLR | VOLATILE
   | VS | VSAMOPENFS
   | WD | WHEN
   | XMLPARSE | XMLSS | XOPTS | XREF
   | YEARWINDOW | YW
   | ZC
   | ZD
   | ZLEN
   | ZON
   | ZONECHECK
   | ZONEDATA
   | ZWB
   | C_CHAR | D_CHAR | E_CHAR | F_CHAR | H_CHAR | I_CHAR | M_CHAR | N_CHAR | O_CHAR | Q_CHAR | S_CHAR | U_CHAR | W_CHAR | X_CHAR
   | DIVISION
   | LEADING | TRAILING
   | BASIS | INSERT | DELETE
  ;


