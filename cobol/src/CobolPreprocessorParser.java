// Generated from src/CobolPreprocessor.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CobolPreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASSIC_COMMENTLINE=1, CLASSIC_LINE_NUMBER=2, CLASSIC_EOL_COMMENT=3, ID_DIVISION_TAG=4, 
		NIST_SEMI_COMMENT_A=5, NIST_SEMI_COMMENT_B=6, NIST_SEMI_COMMENT_C=7, NIST_SEMI_COMMENT_G=8, 
		NIST_SEMI_COMMENT_J=9, NIST_SEMI_COMMENT_P=10, NIST_SEMI_COMMENT_S=11, 
		NIST_SEMI_COMMENT_T=12, NIST_SEMI_COMMENT_U=13, NIST_SEMI_COMMENT_X=14, 
		NIST_SEMI_COMMENT_Y=15, ADATA=16, ADV=17, ALIAS=18, ANSI=19, ANY=20, APOST=21, 
		AR=22, ARITH=23, AUTO=24, AWO=25, BIN=26, BLOCK0=27, BUF=28, BUFSIZE=29, 
		BY=30, CBL=31, CBLCARD=32, CICS=33, CO=34, COBOL2=35, COBOL3=36, CODEPAGE=37, 
		COMPAT=38, COMPILE=39, COPY=40, CP=41, CPP=42, CPSM=43, CS=44, CURR=45, 
		CURRENCY=46, DATA=47, DATEPROC=48, DBCS=49, DD=50, DEBUG=51, DECK=52, 
		DIAGTRUNC=53, DIVISION=54, DLI=55, DLL=56, DP=57, DTR=58, DU=59, DUMP=60, 
		DYN=61, DYNAM=62, EDF=63, EJECT=64, EJPD=65, EN=66, ENGLISH=67, END_EXEC=68, 
		EPILOG=69, EXCI=70, EXEC=71, EXIT=72, EXP=73, EXPORTALL=74, EXTEND=75, 
		FASTSRT=76, FEPI=77, FLAG=78, FLAGSTD=79, FSRT=80, FULL=81, GDS=82, GRAPHIC=83, 
		HOOK=84, ID=85, IDENTIFICATION=86, IN=87, INTDATE=88, JA=89, JP=90, KA=91, 
		LANG=92, LANGUAGE=93, LC=94, LEASM=95, LENGTH=96, LIB=97, LILIAN=98, LIN=99, 
		LINECOUNT=100, LINKAGE=101, LIST=102, LM=103, LONGMIXED=104, LONGUPPER=105, 
		LPARENCHAR=106, LU=107, MAP=108, MARGINS=109, MAX=110, MD=111, MDECK=112, 
		MIG=113, MIXED=114, NAME=115, NAT=116, NATIONAL=117, NATLANG=118, NN=119, 
		NO=120, NOADATA=121, NOADV=122, NOALIAS=123, NOAWO=124, NOBLOCK0=125, 
		NOC=126, NOCBLCARD=127, NOCICS=128, NOCMPR2=129, NOCOMPILE=130, NOCPSM=131, 
		NOCURR=132, NOCURRENCY=133, NOD=134, NODATEPROC=135, NODBCS=136, NODE=137, 
		NODEBUG=138, NODECK=139, NODIAGTRUNC=140, NODLL=141, NODU=142, NODUMP=143, 
		NODP=144, NODTR=145, NODYN=146, NODYNAM=147, NOEDF=148, NOEJPD=149, NOEPILOG=150, 
		NOEXIT=151, NOEXP=152, NOEXPORTALL=153, NOF=154, NOFASTSRT=155, NOFEPI=156, 
		NOFLAG=157, NOFLAGMIG=158, NOFLAGSTD=159, NOFSRT=160, NOGRAPHIC=161, NOHOOK=162, 
		NOLENGTH=163, NOLIB=164, NOLINKAGE=165, NOLIST=166, NOMAP=167, NOMD=168, 
		NOMDECK=169, NONAME=170, NONUM=171, NONUMBER=172, NOOBJ=173, NOOBJECT=174, 
		NOOFF=175, NOOFFSET=176, NOOPSEQUENCE=177, NOOPT=178, NOOPTIMIZE=179, 
		NOOPTIONS=180, NOP=181, NOPFD=182, NOPROLOG=183, NORENT=184, NOS=185, 
		NOSEP=186, NOSEPARATE=187, NOSEQ=188, NOSOURCE=189, NOSPIE=190, NOSQL=191, 
		NOSQLC=192, NOSQLCCSID=193, NOSSR=194, NOSSRANGE=195, NOSTDTRUNC=196, 
		NOSEQUENCE=197, NOTERM=198, NOTERMINAL=199, NOTEST=200, NOTHREAD=201, 
		NOTRIG=202, NOVBREF=203, NOWD=204, NOWORD=205, NOX=206, NOXREF=207, NOZWB=208, 
		NS=209, NSEQ=210, NSYMBOL=211, NUM=212, NUMBER=213, NUMPROC=214, OBJ=215, 
		OBJECT=216, OF=217, OFF=218, OFFSET=219, ON=220, OP=221, OPMARGINS=222, 
		OPSEQUENCE=223, OPT=224, OPTFILE=225, OPTIMIZE=226, OPTIONS=227, OUT=228, 
		OUTDD=229, PFD=230, PPTDBG=231, PGMN=232, PGMNAME=233, PROCESS=234, PROLOG=235, 
		QUOTE=236, RENT=237, REPLACE=238, REPLACING=239, RMODE=240, RPARENCHAR=241, 
		SEP=242, SEPARATE=243, SEQ=244, SEQUENCE=245, SHORT=246, SIZE=247, SOURCE=248, 
		SP=249, SPACE=250, SPIE=251, SQL=252, SQLC=253, SQLCCSID=254, SQLIMS=255, 
		SKIP1=256, SKIP2=257, SKIP3=258, SS=259, SSR=260, SSRANGE=261, STD=262, 
		SUPPRESS=263, SYSEIB=264, SZ=265, TERM=266, TERMINAL=267, TEST=268, THREAD=269, 
		TITLE=270, TRIG=271, TRUNC=272, UE=273, UPPER=274, VBREF=275, WD=276, 
		WORD=277, XMLPARSE=278, XMLSS=279, XOPTS=280, XP=281, XREF=282, YEARWINDOW=283, 
		YW=284, ZWB=285, C_CHAR=286, D_CHAR=287, E_CHAR=288, F_CHAR=289, H_CHAR=290, 
		I_CHAR=291, M_CHAR=292, N_CHAR=293, Q_CHAR=294, S_CHAR=295, U_CHAR=296, 
		W_CHAR=297, X_CHAR=298, COMMENTTAG=299, COMMACHAR=300, DOT=301, DOUBLEEQUALCHAR=302, 
		NONNUMERICLITERAL=303, NUMERICLITERAL=304, IDENTIFIER=305, FILENAME=306, 
		PSEUDOTEXTIDENTIFIER=307, NEWLINE=308, MULTINEWLINE=309, COMMENTLINE=310, 
		WS=311, TEXT=312, BOL=313;
	public static final int
		RULE_startRule = 0, RULE_identificationDivisionTag = 1, RULE_compilerOptions = 2, 
		RULE_compilerXOpts = 3, RULE_compilerOption = 4, RULE_classicCommentEntry = 5, 
		RULE_execCicsStatement = 6, RULE_execSqlStatement = 7, RULE_execSqlImsStatement = 8, 
		RULE_copyStatement = 9, RULE_copySource = 10, RULE_copyLibrary = 11, RULE_replacingPhrase = 12, 
		RULE_replaceArea = 13, RULE_replaceByStatement = 14, RULE_replaceOffStatement = 15, 
		RULE_replaceClause = 16, RULE_directoryPhrase = 17, RULE_familyPhrase = 18, 
		RULE_replaceable = 19, RULE_replacement = 20, RULE_ejectStatement = 21, 
		RULE_skipStatement = 22, RULE_titleStatement = 23, RULE_pseudoText = 24, 
		RULE_charData = 25, RULE_charDataSql = 26, RULE_charDataLine = 27, RULE_cobolWord = 28, 
		RULE_literal = 29, RULE_filename = 30, RULE_charDataKeyword = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "identificationDivisionTag", "compilerOptions", "compilerXOpts", 
			"compilerOption", "classicCommentEntry", "execCicsStatement", "execSqlStatement", 
			"execSqlImsStatement", "copyStatement", "copySource", "copyLibrary", 
			"replacingPhrase", "replaceArea", "replaceByStatement", "replaceOffStatement", 
			"replaceClause", "directoryPhrase", "familyPhrase", "replaceable", "replacement", 
			"ejectStatement", "skipStatement", "titleStatement", "pseudoText", "charData", 
			"charDataSql", "charDataLine", "cobolWord", "literal", "filename", "charDataKeyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'('", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "')'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'*>'", 
			"','", "'.'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASSIC_COMMENTLINE", "CLASSIC_LINE_NUMBER", "CLASSIC_EOL_COMMENT", 
			"ID_DIVISION_TAG", "NIST_SEMI_COMMENT_A", "NIST_SEMI_COMMENT_B", "NIST_SEMI_COMMENT_C", 
			"NIST_SEMI_COMMENT_G", "NIST_SEMI_COMMENT_J", "NIST_SEMI_COMMENT_P", 
			"NIST_SEMI_COMMENT_S", "NIST_SEMI_COMMENT_T", "NIST_SEMI_COMMENT_U", 
			"NIST_SEMI_COMMENT_X", "NIST_SEMI_COMMENT_Y", "ADATA", "ADV", "ALIAS", 
			"ANSI", "ANY", "APOST", "AR", "ARITH", "AUTO", "AWO", "BIN", "BLOCK0", 
			"BUF", "BUFSIZE", "BY", "CBL", "CBLCARD", "CICS", "CO", "COBOL2", "COBOL3", 
			"CODEPAGE", "COMPAT", "COMPILE", "COPY", "CP", "CPP", "CPSM", "CS", "CURR", 
			"CURRENCY", "DATA", "DATEPROC", "DBCS", "DD", "DEBUG", "DECK", "DIAGTRUNC", 
			"DIVISION", "DLI", "DLL", "DP", "DTR", "DU", "DUMP", "DYN", "DYNAM", 
			"EDF", "EJECT", "EJPD", "EN", "ENGLISH", "END_EXEC", "EPILOG", "EXCI", 
			"EXEC", "EXIT", "EXP", "EXPORTALL", "EXTEND", "FASTSRT", "FEPI", "FLAG", 
			"FLAGSTD", "FSRT", "FULL", "GDS", "GRAPHIC", "HOOK", "ID", "IDENTIFICATION", 
			"IN", "INTDATE", "JA", "JP", "KA", "LANG", "LANGUAGE", "LC", "LEASM", 
			"LENGTH", "LIB", "LILIAN", "LIN", "LINECOUNT", "LINKAGE", "LIST", "LM", 
			"LONGMIXED", "LONGUPPER", "LPARENCHAR", "LU", "MAP", "MARGINS", "MAX", 
			"MD", "MDECK", "MIG", "MIXED", "NAME", "NAT", "NATIONAL", "NATLANG", 
			"NN", "NO", "NOADATA", "NOADV", "NOALIAS", "NOAWO", "NOBLOCK0", "NOC", 
			"NOCBLCARD", "NOCICS", "NOCMPR2", "NOCOMPILE", "NOCPSM", "NOCURR", "NOCURRENCY", 
			"NOD", "NODATEPROC", "NODBCS", "NODE", "NODEBUG", "NODECK", "NODIAGTRUNC", 
			"NODLL", "NODU", "NODUMP", "NODP", "NODTR", "NODYN", "NODYNAM", "NOEDF", 
			"NOEJPD", "NOEPILOG", "NOEXIT", "NOEXP", "NOEXPORTALL", "NOF", "NOFASTSRT", 
			"NOFEPI", "NOFLAG", "NOFLAGMIG", "NOFLAGSTD", "NOFSRT", "NOGRAPHIC", 
			"NOHOOK", "NOLENGTH", "NOLIB", "NOLINKAGE", "NOLIST", "NOMAP", "NOMD", 
			"NOMDECK", "NONAME", "NONUM", "NONUMBER", "NOOBJ", "NOOBJECT", "NOOFF", 
			"NOOFFSET", "NOOPSEQUENCE", "NOOPT", "NOOPTIMIZE", "NOOPTIONS", "NOP", 
			"NOPFD", "NOPROLOG", "NORENT", "NOS", "NOSEP", "NOSEPARATE", "NOSEQ", 
			"NOSOURCE", "NOSPIE", "NOSQL", "NOSQLC", "NOSQLCCSID", "NOSSR", "NOSSRANGE", 
			"NOSTDTRUNC", "NOSEQUENCE", "NOTERM", "NOTERMINAL", "NOTEST", "NOTHREAD", 
			"NOTRIG", "NOVBREF", "NOWD", "NOWORD", "NOX", "NOXREF", "NOZWB", "NS", 
			"NSEQ", "NSYMBOL", "NUM", "NUMBER", "NUMPROC", "OBJ", "OBJECT", "OF", 
			"OFF", "OFFSET", "ON", "OP", "OPMARGINS", "OPSEQUENCE", "OPT", "OPTFILE", 
			"OPTIMIZE", "OPTIONS", "OUT", "OUTDD", "PFD", "PPTDBG", "PGMN", "PGMNAME", 
			"PROCESS", "PROLOG", "QUOTE", "RENT", "REPLACE", "REPLACING", "RMODE", 
			"RPARENCHAR", "SEP", "SEPARATE", "SEQ", "SEQUENCE", "SHORT", "SIZE", 
			"SOURCE", "SP", "SPACE", "SPIE", "SQL", "SQLC", "SQLCCSID", "SQLIMS", 
			"SKIP1", "SKIP2", "SKIP3", "SS", "SSR", "SSRANGE", "STD", "SUPPRESS", 
			"SYSEIB", "SZ", "TERM", "TERMINAL", "TEST", "THREAD", "TITLE", "TRIG", 
			"TRUNC", "UE", "UPPER", "VBREF", "WD", "WORD", "XMLPARSE", "XMLSS", "XOPTS", 
			"XP", "XREF", "YEARWINDOW", "YW", "ZWB", "C_CHAR", "D_CHAR", "E_CHAR", 
			"F_CHAR", "H_CHAR", "I_CHAR", "M_CHAR", "N_CHAR", "Q_CHAR", "S_CHAR", 
			"U_CHAR", "W_CHAR", "X_CHAR", "COMMENTTAG", "COMMACHAR", "DOT", "DOUBLEEQUALCHAR", 
			"NONNUMERICLITERAL", "NUMERICLITERAL", "IDENTIFIER", "FILENAME", "PSEUDOTEXTIDENTIFIER", 
			"NEWLINE", "MULTINEWLINE", "COMMENTLINE", "WS", "TEXT", "BOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CobolPreprocessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CobolPreprocessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CobolPreprocessorParser.EOF, 0); }
		public List<IdentificationDivisionTagContext> identificationDivisionTag() {
			return getRuleContexts(IdentificationDivisionTagContext.class);
		}
		public IdentificationDivisionTagContext identificationDivisionTag(int i) {
			return getRuleContext(IdentificationDivisionTagContext.class,i);
		}
		public List<CompilerOptionsContext> compilerOptions() {
			return getRuleContexts(CompilerOptionsContext.class);
		}
		public CompilerOptionsContext compilerOptions(int i) {
			return getRuleContext(CompilerOptionsContext.class,i);
		}
		public List<ClassicCommentEntryContext> classicCommentEntry() {
			return getRuleContexts(ClassicCommentEntryContext.class);
		}
		public ClassicCommentEntryContext classicCommentEntry(int i) {
			return getRuleContext(ClassicCommentEntryContext.class,i);
		}
		public List<CopyStatementContext> copyStatement() {
			return getRuleContexts(CopyStatementContext.class);
		}
		public CopyStatementContext copyStatement(int i) {
			return getRuleContext(CopyStatementContext.class,i);
		}
		public List<ExecCicsStatementContext> execCicsStatement() {
			return getRuleContexts(ExecCicsStatementContext.class);
		}
		public ExecCicsStatementContext execCicsStatement(int i) {
			return getRuleContext(ExecCicsStatementContext.class,i);
		}
		public List<ExecSqlStatementContext> execSqlStatement() {
			return getRuleContexts(ExecSqlStatementContext.class);
		}
		public ExecSqlStatementContext execSqlStatement(int i) {
			return getRuleContext(ExecSqlStatementContext.class,i);
		}
		public List<ExecSqlImsStatementContext> execSqlImsStatement() {
			return getRuleContexts(ExecSqlImsStatementContext.class);
		}
		public ExecSqlImsStatementContext execSqlImsStatement(int i) {
			return getRuleContext(ExecSqlImsStatementContext.class,i);
		}
		public List<ReplaceOffStatementContext> replaceOffStatement() {
			return getRuleContexts(ReplaceOffStatementContext.class);
		}
		public ReplaceOffStatementContext replaceOffStatement(int i) {
			return getRuleContext(ReplaceOffStatementContext.class,i);
		}
		public List<ReplaceAreaContext> replaceArea() {
			return getRuleContexts(ReplaceAreaContext.class);
		}
		public ReplaceAreaContext replaceArea(int i) {
			return getRuleContext(ReplaceAreaContext.class,i);
		}
		public List<EjectStatementContext> ejectStatement() {
			return getRuleContexts(EjectStatementContext.class);
		}
		public EjectStatementContext ejectStatement(int i) {
			return getRuleContext(EjectStatementContext.class,i);
		}
		public List<SkipStatementContext> skipStatement() {
			return getRuleContexts(SkipStatementContext.class);
		}
		public SkipStatementContext skipStatement(int i) {
			return getRuleContext(SkipStatementContext.class,i);
		}
		public List<TitleStatementContext> titleStatement() {
			return getRuleContexts(TitleStatementContext.class);
		}
		public TitleStatementContext titleStatement(int i) {
			return getRuleContext(TitleStatementContext.class,i);
		}
		public List<CharDataLineContext> charDataLine() {
			return getRuleContexts(CharDataLineContext.class);
		}
		public CharDataLineContext charDataLine(int i) {
			return getRuleContext(CharDataLineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENTLINE) | (1L << ADATA) | (1L << ADV) | (1L << ALIAS) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << CP) | (1L << CPP) | (1L << CPSM) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DECK) | (1L << DIAGTRUNC) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DTR) | (1L << DU) | (1L << DUMP) | (1L << DYN) | (1L << DYNAM) | (1L << EDF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EXCI - 64)) | (1L << (EXEC - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HOOK - 64)) | (1L << (ID - 64)) | (1L << (IDENTIFICATION - 64)) | (1L << (IN - 64)) | (1L << (INTDATE - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)) | (1L << (LPARENCHAR - 64)) | (1L << (LU - 64)) | (1L << (MAP - 64)) | (1L << (MARGINS - 64)) | (1L << (MAX - 64)) | (1L << (MD - 64)) | (1L << (MDECK - 64)) | (1L << (MIG - 64)) | (1L << (MIXED - 64)) | (1L << (NAME - 64)) | (1L << (NAT - 64)) | (1L << (NATIONAL - 64)) | (1L << (NATLANG - 64)) | (1L << (NN - 64)) | (1L << (NO - 64)) | (1L << (NOADATA - 64)) | (1L << (NOADV - 64)) | (1L << (NOALIAS - 64)) | (1L << (NOAWO - 64)) | (1L << (NOBLOCK0 - 64)) | (1L << (NOC - 64)) | (1L << (NOCBLCARD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEXIT - 128)) | (1L << (NOEXP - 128)) | (1L << (NOEXPORTALL - 128)) | (1L << (NOF - 128)) | (1L << (NOFASTSRT - 128)) | (1L << (NOFEPI - 128)) | (1L << (NOFLAG - 128)) | (1L << (NOFLAGMIG - 128)) | (1L << (NOFLAGSTD - 128)) | (1L << (NOFSRT - 128)) | (1L << (NOGRAPHIC - 128)) | (1L << (NOHOOK - 128)) | (1L << (NOLENGTH - 128)) | (1L << (NOLIB - 128)) | (1L << (NOLINKAGE - 128)) | (1L << (NOLIST - 128)) | (1L << (NOMAP - 128)) | (1L << (NOMD - 128)) | (1L << (NOMDECK - 128)) | (1L << (NONAME - 128)) | (1L << (NONUM - 128)) | (1L << (NONUMBER - 128)) | (1L << (NOOBJ - 128)) | (1L << (NOOBJECT - 128)) | (1L << (NOOFF - 128)) | (1L << (NOOFFSET - 128)) | (1L << (NOOPSEQUENCE - 128)) | (1L << (NOOPT - 128)) | (1L << (NOOPTIMIZE - 128)) | (1L << (NOOPTIONS - 128)) | (1L << (NOP - 128)) | (1L << (NOPFD - 128)) | (1L << (NOPROLOG - 128)) | (1L << (NORENT - 128)) | (1L << (NOS - 128)) | (1L << (NOSEP - 128)) | (1L << (NOSEPARATE - 128)) | (1L << (NOSEQ - 128)) | (1L << (NOSOURCE - 128)) | (1L << (NOSPIE - 128)) | (1L << (NOSQL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)) | (1L << (NOSTDTRUNC - 192)) | (1L << (NOSEQUENCE - 192)) | (1L << (NOTERM - 192)) | (1L << (NOTERMINAL - 192)) | (1L << (NOTEST - 192)) | (1L << (NOTHREAD - 192)) | (1L << (NOTRIG - 192)) | (1L << (NOVBREF - 192)) | (1L << (NOWORD - 192)) | (1L << (NOX - 192)) | (1L << (NOXREF - 192)) | (1L << (NOZWB - 192)) | (1L << (NS - 192)) | (1L << (NSEQ - 192)) | (1L << (NSYMBOL - 192)) | (1L << (NUM - 192)) | (1L << (NUMBER - 192)) | (1L << (NUMPROC - 192)) | (1L << (OBJ - 192)) | (1L << (OBJECT - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OFFSET - 192)) | (1L << (ON - 192)) | (1L << (OP - 192)) | (1L << (OPMARGINS - 192)) | (1L << (OPSEQUENCE - 192)) | (1L << (OPT - 192)) | (1L << (OPTFILE - 192)) | (1L << (OPTIMIZE - 192)) | (1L << (OPTIONS - 192)) | (1L << (OUT - 192)) | (1L << (OUTDD - 192)) | (1L << (PFD - 192)) | (1L << (PPTDBG - 192)) | (1L << (PGMN - 192)) | (1L << (PGMNAME - 192)) | (1L << (PROCESS - 192)) | (1L << (PROLOG - 192)) | (1L << (QUOTE - 192)) | (1L << (RENT - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (RMODE - 192)) | (1L << (RPARENCHAR - 192)) | (1L << (SEP - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQ - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SHORT - 192)) | (1L << (SIZE - 192)) | (1L << (SOURCE - 192)) | (1L << (SP - 192)) | (1L << (SPACE - 192)) | (1L << (SPIE - 192)) | (1L << (SQL - 192)) | (1L << (SQLC - 192)) | (1L << (SQLCCSID - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SKIP1 - 256)) | (1L << (SKIP2 - 256)) | (1L << (SKIP3 - 256)) | (1L << (SS - 256)) | (1L << (SSR - 256)) | (1L << (SSRANGE - 256)) | (1L << (STD - 256)) | (1L << (SYSEIB - 256)) | (1L << (SZ - 256)) | (1L << (TERM - 256)) | (1L << (TERMINAL - 256)) | (1L << (TEST - 256)) | (1L << (THREAD - 256)) | (1L << (TITLE - 256)) | (1L << (TRIG - 256)) | (1L << (TRUNC - 256)) | (1L << (UE - 256)) | (1L << (UPPER - 256)) | (1L << (VBREF - 256)) | (1L << (WD - 256)) | (1L << (XMLPARSE - 256)) | (1L << (XMLSS - 256)) | (1L << (XOPTS - 256)) | (1L << (XREF - 256)) | (1L << (YEARWINDOW - 256)) | (1L << (YW - 256)) | (1L << (ZWB - 256)) | (1L << (C_CHAR - 256)) | (1L << (D_CHAR - 256)) | (1L << (E_CHAR - 256)) | (1L << (F_CHAR - 256)) | (1L << (H_CHAR - 256)) | (1L << (I_CHAR - 256)) | (1L << (M_CHAR - 256)) | (1L << (N_CHAR - 256)) | (1L << (Q_CHAR - 256)) | (1L << (S_CHAR - 256)) | (1L << (U_CHAR - 256)) | (1L << (W_CHAR - 256)) | (1L << (X_CHAR - 256)) | (1L << (COMMACHAR - 256)) | (1L << (DOT - 256)) | (1L << (NONNUMERICLITERAL - 256)) | (1L << (NUMERICLITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (FILENAME - 256)) | (1L << (PSEUDOTEXTIDENTIFIER - 256)) | (1L << (NEWLINE - 256)) | (1L << (TEXT - 256)))) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					identificationDivisionTag();
					}
					break;
				case 2:
					{
					setState(65);
					compilerOptions();
					}
					break;
				case 3:
					{
					setState(66);
					classicCommentEntry();
					}
					break;
				case 4:
					{
					setState(67);
					copyStatement();
					}
					break;
				case 5:
					{
					setState(68);
					execCicsStatement();
					}
					break;
				case 6:
					{
					setState(69);
					execSqlStatement();
					}
					break;
				case 7:
					{
					setState(70);
					execSqlImsStatement();
					}
					break;
				case 8:
					{
					setState(71);
					replaceOffStatement();
					}
					break;
				case 9:
					{
					setState(72);
					replaceArea();
					}
					break;
				case 10:
					{
					setState(73);
					ejectStatement();
					}
					break;
				case 11:
					{
					setState(74);
					skipStatement();
					}
					break;
				case 12:
					{
					setState(75);
					titleStatement();
					}
					break;
				case 13:
					{
					setState(76);
					charDataLine();
					}
					break;
				case 14:
					{
					setState(77);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificationDivisionTagContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(CobolPreprocessorParser.DIVISION, 0); }
		public TerminalNode IDENTIFICATION() { return getToken(CobolPreprocessorParser.IDENTIFICATION, 0); }
		public TerminalNode ID() { return getToken(CobolPreprocessorParser.ID, 0); }
		public IdentificationDivisionTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificationDivisionTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterIdentificationDivisionTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitIdentificationDivisionTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitIdentificationDivisionTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificationDivisionTagContext identificationDivisionTag() throws RecognitionException {
		IdentificationDivisionTagContext _localctx = new IdentificationDivisionTagContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identificationDivisionTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDENTIFICATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			match(DIVISION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilerOptionsContext extends ParserRuleContext {
		public TerminalNode PROCESS() { return getToken(CobolPreprocessorParser.PROCESS, 0); }
		public TerminalNode CBL() { return getToken(CobolPreprocessorParser.CBL, 0); }
		public List<CompilerOptionContext> compilerOption() {
			return getRuleContexts(CompilerOptionContext.class);
		}
		public CompilerOptionContext compilerOption(int i) {
			return getRuleContext(CompilerOptionContext.class,i);
		}
		public List<CompilerXOptsContext> compilerXOpts() {
			return getRuleContexts(CompilerXOptsContext.class);
		}
		public CompilerXOptsContext compilerXOpts(int i) {
			return getRuleContext(CompilerXOptsContext.class,i);
		}
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolPreprocessorParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolPreprocessorParser.COMMACHAR, i);
		}
		public CompilerOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCompilerOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCompilerOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCompilerOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerOptionsContext compilerOptions() throws RecognitionException {
		CompilerOptionsContext _localctx = new CompilerOptionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compilerOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==CBL || _la==PROCESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(94);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADATA:
					case ADV:
					case APOST:
					case AR:
					case ARITH:
					case AWO:
					case BLOCK0:
					case BUF:
					case BUFSIZE:
					case CBLCARD:
					case CICS:
					case COBOL2:
					case COBOL3:
					case CODEPAGE:
					case COMPILE:
					case CP:
					case CPP:
					case CPSM:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DEBUG:
					case DECK:
					case DIAGTRUNC:
					case DLL:
					case DP:
					case DTR:
					case DU:
					case DUMP:
					case DYN:
					case DYNAM:
					case EDF:
					case EPILOG:
					case EXIT:
					case EXP:
					case EXPORTALL:
					case FASTSRT:
					case FEPI:
					case FLAG:
					case FLAGSTD:
					case FSRT:
					case GDS:
					case GRAPHIC:
					case INTDATE:
					case LANG:
					case LANGUAGE:
					case LC:
					case LEASM:
					case LENGTH:
					case LIB:
					case LIN:
					case LINECOUNT:
					case LINKAGE:
					case LIST:
					case MAP:
					case MARGINS:
					case MD:
					case MDECK:
					case NAME:
					case NATLANG:
					case NOADATA:
					case NOADV:
					case NOAWO:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCPSM:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODIAGTRUNC:
					case NODLL:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODYN:
					case NODYNAM:
					case NOEDF:
					case NOEPILOG:
					case NOEXIT:
					case NOEXP:
					case NOEXPORTALL:
					case NOF:
					case NOFASTSRT:
					case NOFEPI:
					case NOFLAG:
					case NOFLAGMIG:
					case NOFLAGSTD:
					case NOFSRT:
					case NOGRAPHIC:
					case NOLENGTH:
					case NOLIB:
					case NOLINKAGE:
					case NOLIST:
					case NOMAP:
					case NOMD:
					case NOMDECK:
					case NONAME:
					case NONUM:
					case NONUMBER:
					case NOOBJ:
					case NOOBJECT:
					case NOOFF:
					case NOOFFSET:
					case NOOPSEQUENCE:
					case NOOPT:
					case NOOPTIMIZE:
					case NOOPTIONS:
					case NOP:
					case NOPROLOG:
					case NORENT:
					case NOS:
					case NOSEQ:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOVBREF:
					case NOWD:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMPROC:
					case OBJ:
					case OBJECT:
					case OFF:
					case OFFSET:
					case OP:
					case OPMARGINS:
					case OPSEQUENCE:
					case OPT:
					case OPTFILE:
					case OPTIMIZE:
					case OPTIONS:
					case OUT:
					case OUTDD:
					case PGMN:
					case PGMNAME:
					case PROLOG:
					case QUOTE:
					case RENT:
					case RMODE:
					case SEQ:
					case SEQUENCE:
					case SIZE:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SSR:
					case SSRANGE:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TRUNC:
					case VBREF:
					case WD:
					case WORD:
					case XMLPARSE:
					case XP:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case F_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case X_CHAR:
					case COMMACHAR:
						{
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(89);
							match(COMMACHAR);
							}
						}

						setState(92);
						compilerOption();
						}
						break;
					case XOPTS:
						{
						setState(93);
						compilerXOpts();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilerXOptsContext extends ParserRuleContext {
		public TerminalNode XOPTS() { return getToken(CobolPreprocessorParser.XOPTS, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public List<CompilerOptionContext> compilerOption() {
			return getRuleContexts(CompilerOptionContext.class);
		}
		public CompilerOptionContext compilerOption(int i) {
			return getRuleContext(CompilerOptionContext.class,i);
		}
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolPreprocessorParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolPreprocessorParser.COMMACHAR, i);
		}
		public CompilerXOptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerXOpts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCompilerXOpts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCompilerXOpts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCompilerXOpts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerXOptsContext compilerXOpts() throws RecognitionException {
		CompilerXOptsContext _localctx = new CompilerXOptsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compilerXOpts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(XOPTS);
			setState(99);
			match(LPARENCHAR);
			setState(100);
			compilerOption();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << APOST) | (1L << AR) | (1L << ARITH) | (1L << AWO) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << CBLCARD) | (1L << CICS) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPILE) | (1L << CP) | (1L << CPP) | (1L << CPSM) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DEBUG) | (1L << DECK) | (1L << DIAGTRUNC) | (1L << DLL) | (1L << DP) | (1L << DTR) | (1L << DU) | (1L << DUMP) | (1L << DYN) | (1L << DYNAM) | (1L << EDF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (EPILOG - 69)) | (1L << (EXIT - 69)) | (1L << (EXP - 69)) | (1L << (EXPORTALL - 69)) | (1L << (FASTSRT - 69)) | (1L << (FEPI - 69)) | (1L << (FLAG - 69)) | (1L << (FLAGSTD - 69)) | (1L << (FSRT - 69)) | (1L << (GDS - 69)) | (1L << (GRAPHIC - 69)) | (1L << (INTDATE - 69)) | (1L << (LANG - 69)) | (1L << (LANGUAGE - 69)) | (1L << (LC - 69)) | (1L << (LEASM - 69)) | (1L << (LENGTH - 69)) | (1L << (LIB - 69)) | (1L << (LIN - 69)) | (1L << (LINECOUNT - 69)) | (1L << (LINKAGE - 69)) | (1L << (LIST - 69)) | (1L << (MAP - 69)) | (1L << (MARGINS - 69)) | (1L << (MD - 69)) | (1L << (MDECK - 69)) | (1L << (NAME - 69)) | (1L << (NATLANG - 69)) | (1L << (NOADATA - 69)) | (1L << (NOADV - 69)) | (1L << (NOAWO - 69)) | (1L << (NOBLOCK0 - 69)) | (1L << (NOC - 69)) | (1L << (NOCBLCARD - 69)) | (1L << (NOCICS - 69)) | (1L << (NOCMPR2 - 69)) | (1L << (NOCOMPILE - 69)) | (1L << (NOCPSM - 69)) | (1L << (NOCURR - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (NOCURRENCY - 133)) | (1L << (NOD - 133)) | (1L << (NODATEPROC - 133)) | (1L << (NODBCS - 133)) | (1L << (NODE - 133)) | (1L << (NODEBUG - 133)) | (1L << (NODECK - 133)) | (1L << (NODIAGTRUNC - 133)) | (1L << (NODLL - 133)) | (1L << (NODU - 133)) | (1L << (NODUMP - 133)) | (1L << (NODP - 133)) | (1L << (NODTR - 133)) | (1L << (NODYN - 133)) | (1L << (NODYNAM - 133)) | (1L << (NOEDF - 133)) | (1L << (NOEPILOG - 133)) | (1L << (NOEXIT - 133)) | (1L << (NOEXP - 133)) | (1L << (NOEXPORTALL - 133)) | (1L << (NOF - 133)) | (1L << (NOFASTSRT - 133)) | (1L << (NOFEPI - 133)) | (1L << (NOFLAG - 133)) | (1L << (NOFLAGMIG - 133)) | (1L << (NOFLAGSTD - 133)) | (1L << (NOFSRT - 133)) | (1L << (NOGRAPHIC - 133)) | (1L << (NOLENGTH - 133)) | (1L << (NOLIB - 133)) | (1L << (NOLINKAGE - 133)) | (1L << (NOLIST - 133)) | (1L << (NOMAP - 133)) | (1L << (NOMD - 133)) | (1L << (NOMDECK - 133)) | (1L << (NONAME - 133)) | (1L << (NONUM - 133)) | (1L << (NONUMBER - 133)) | (1L << (NOOBJ - 133)) | (1L << (NOOBJECT - 133)) | (1L << (NOOFF - 133)) | (1L << (NOOFFSET - 133)) | (1L << (NOOPSEQUENCE - 133)) | (1L << (NOOPT - 133)) | (1L << (NOOPTIMIZE - 133)) | (1L << (NOOPTIONS - 133)) | (1L << (NOP - 133)) | (1L << (NOPROLOG - 133)) | (1L << (NORENT - 133)) | (1L << (NOS - 133)) | (1L << (NOSEQ - 133)) | (1L << (NOSOURCE - 133)) | (1L << (NOSPIE - 133)) | (1L << (NOSQL - 133)) | (1L << (NOSQLC - 133)) | (1L << (NOSQLCCSID - 133)) | (1L << (NOSSR - 133)) | (1L << (NOSSRANGE - 133)) | (1L << (NOSTDTRUNC - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (NOSEQUENCE - 197)) | (1L << (NOTERM - 197)) | (1L << (NOTERMINAL - 197)) | (1L << (NOTEST - 197)) | (1L << (NOTHREAD - 197)) | (1L << (NOVBREF - 197)) | (1L << (NOWD - 197)) | (1L << (NOWORD - 197)) | (1L << (NOX - 197)) | (1L << (NOXREF - 197)) | (1L << (NOZWB - 197)) | (1L << (NS - 197)) | (1L << (NSEQ - 197)) | (1L << (NSYMBOL - 197)) | (1L << (NUM - 197)) | (1L << (NUMBER - 197)) | (1L << (NUMPROC - 197)) | (1L << (OBJ - 197)) | (1L << (OBJECT - 197)) | (1L << (OFF - 197)) | (1L << (OFFSET - 197)) | (1L << (OP - 197)) | (1L << (OPMARGINS - 197)) | (1L << (OPSEQUENCE - 197)) | (1L << (OPT - 197)) | (1L << (OPTFILE - 197)) | (1L << (OPTIMIZE - 197)) | (1L << (OPTIONS - 197)) | (1L << (OUT - 197)) | (1L << (OUTDD - 197)) | (1L << (PGMN - 197)) | (1L << (PGMNAME - 197)) | (1L << (PROLOG - 197)) | (1L << (QUOTE - 197)) | (1L << (RENT - 197)) | (1L << (RMODE - 197)) | (1L << (SEQ - 197)) | (1L << (SEQUENCE - 197)) | (1L << (SIZE - 197)) | (1L << (SOURCE - 197)) | (1L << (SP - 197)) | (1L << (SPACE - 197)) | (1L << (SPIE - 197)) | (1L << (SQL - 197)) | (1L << (SQLC - 197)) | (1L << (SQLCCSID - 197)) | (1L << (SSR - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (SSRANGE - 261)) | (1L << (SYSEIB - 261)) | (1L << (SZ - 261)) | (1L << (TERM - 261)) | (1L << (TERMINAL - 261)) | (1L << (TEST - 261)) | (1L << (THREAD - 261)) | (1L << (TRUNC - 261)) | (1L << (VBREF - 261)) | (1L << (WD - 261)) | (1L << (WORD - 261)) | (1L << (XMLPARSE - 261)) | (1L << (XP - 261)) | (1L << (XREF - 261)) | (1L << (YEARWINDOW - 261)) | (1L << (YW - 261)) | (1L << (ZWB - 261)) | (1L << (C_CHAR - 261)) | (1L << (D_CHAR - 261)) | (1L << (F_CHAR - 261)) | (1L << (Q_CHAR - 261)) | (1L << (S_CHAR - 261)) | (1L << (X_CHAR - 261)) | (1L << (COMMACHAR - 261)))) != 0)) {
				{
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(101);
					match(COMMACHAR);
					}
				}

				setState(104);
				compilerOption();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(RPARENCHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilerOptionContext extends ParserRuleContext {
		public TerminalNode ADATA() { return getToken(CobolPreprocessorParser.ADATA, 0); }
		public TerminalNode ADV() { return getToken(CobolPreprocessorParser.ADV, 0); }
		public TerminalNode APOST() { return getToken(CobolPreprocessorParser.APOST, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public TerminalNode ARITH() { return getToken(CobolPreprocessorParser.ARITH, 0); }
		public TerminalNode AR() { return getToken(CobolPreprocessorParser.AR, 0); }
		public TerminalNode EXTEND() { return getToken(CobolPreprocessorParser.EXTEND, 0); }
		public List<TerminalNode> E_CHAR() { return getTokens(CobolPreprocessorParser.E_CHAR); }
		public TerminalNode E_CHAR(int i) {
			return getToken(CobolPreprocessorParser.E_CHAR, i);
		}
		public TerminalNode COMPAT() { return getToken(CobolPreprocessorParser.COMPAT, 0); }
		public TerminalNode C_CHAR() { return getToken(CobolPreprocessorParser.C_CHAR, 0); }
		public TerminalNode AWO() { return getToken(CobolPreprocessorParser.AWO, 0); }
		public TerminalNode BLOCK0() { return getToken(CobolPreprocessorParser.BLOCK0, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode BUFSIZE() { return getToken(CobolPreprocessorParser.BUFSIZE, 0); }
		public TerminalNode BUF() { return getToken(CobolPreprocessorParser.BUF, 0); }
		public TerminalNode CBLCARD() { return getToken(CobolPreprocessorParser.CBLCARD, 0); }
		public TerminalNode CICS() { return getToken(CobolPreprocessorParser.CICS, 0); }
		public TerminalNode COBOL2() { return getToken(CobolPreprocessorParser.COBOL2, 0); }
		public TerminalNode COBOL3() { return getToken(CobolPreprocessorParser.COBOL3, 0); }
		public TerminalNode CODEPAGE() { return getToken(CobolPreprocessorParser.CODEPAGE, 0); }
		public TerminalNode CP() { return getToken(CobolPreprocessorParser.CP, 0); }
		public TerminalNode COMPILE() { return getToken(CobolPreprocessorParser.COMPILE, 0); }
		public TerminalNode CPP() { return getToken(CobolPreprocessorParser.CPP, 0); }
		public TerminalNode CPSM() { return getToken(CobolPreprocessorParser.CPSM, 0); }
		public TerminalNode CURRENCY() { return getToken(CobolPreprocessorParser.CURRENCY, 0); }
		public TerminalNode CURR() { return getToken(CobolPreprocessorParser.CURR, 0); }
		public TerminalNode DATA() { return getToken(CobolPreprocessorParser.DATA, 0); }
		public TerminalNode DATEPROC() { return getToken(CobolPreprocessorParser.DATEPROC, 0); }
		public TerminalNode DP() { return getToken(CobolPreprocessorParser.DP, 0); }
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolPreprocessorParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolPreprocessorParser.COMMACHAR, i);
		}
		public TerminalNode FLAG() { return getToken(CobolPreprocessorParser.FLAG, 0); }
		public TerminalNode NOFLAG() { return getToken(CobolPreprocessorParser.NOFLAG, 0); }
		public TerminalNode TRIG() { return getToken(CobolPreprocessorParser.TRIG, 0); }
		public TerminalNode NOTRIG() { return getToken(CobolPreprocessorParser.NOTRIG, 0); }
		public TerminalNode DBCS() { return getToken(CobolPreprocessorParser.DBCS, 0); }
		public TerminalNode DECK() { return getToken(CobolPreprocessorParser.DECK, 0); }
		public TerminalNode D_CHAR() { return getToken(CobolPreprocessorParser.D_CHAR, 0); }
		public TerminalNode DEBUG() { return getToken(CobolPreprocessorParser.DEBUG, 0); }
		public TerminalNode DIAGTRUNC() { return getToken(CobolPreprocessorParser.DIAGTRUNC, 0); }
		public TerminalNode DTR() { return getToken(CobolPreprocessorParser.DTR, 0); }
		public TerminalNode DLL() { return getToken(CobolPreprocessorParser.DLL, 0); }
		public TerminalNode DUMP() { return getToken(CobolPreprocessorParser.DUMP, 0); }
		public TerminalNode DU() { return getToken(CobolPreprocessorParser.DU, 0); }
		public TerminalNode DYNAM() { return getToken(CobolPreprocessorParser.DYNAM, 0); }
		public TerminalNode DYN() { return getToken(CobolPreprocessorParser.DYN, 0); }
		public TerminalNode EDF() { return getToken(CobolPreprocessorParser.EDF, 0); }
		public TerminalNode EPILOG() { return getToken(CobolPreprocessorParser.EPILOG, 0); }
		public TerminalNode EXIT() { return getToken(CobolPreprocessorParser.EXIT, 0); }
		public TerminalNode EXPORTALL() { return getToken(CobolPreprocessorParser.EXPORTALL, 0); }
		public TerminalNode EXP() { return getToken(CobolPreprocessorParser.EXP, 0); }
		public TerminalNode FASTSRT() { return getToken(CobolPreprocessorParser.FASTSRT, 0); }
		public TerminalNode FSRT() { return getToken(CobolPreprocessorParser.FSRT, 0); }
		public TerminalNode FEPI() { return getToken(CobolPreprocessorParser.FEPI, 0); }
		public TerminalNode F_CHAR() { return getToken(CobolPreprocessorParser.F_CHAR, 0); }
		public List<TerminalNode> I_CHAR() { return getTokens(CobolPreprocessorParser.I_CHAR); }
		public TerminalNode I_CHAR(int i) {
			return getToken(CobolPreprocessorParser.I_CHAR, i);
		}
		public List<TerminalNode> S_CHAR() { return getTokens(CobolPreprocessorParser.S_CHAR); }
		public TerminalNode S_CHAR(int i) {
			return getToken(CobolPreprocessorParser.S_CHAR, i);
		}
		public List<TerminalNode> U_CHAR() { return getTokens(CobolPreprocessorParser.U_CHAR); }
		public TerminalNode U_CHAR(int i) {
			return getToken(CobolPreprocessorParser.U_CHAR, i);
		}
		public List<TerminalNode> W_CHAR() { return getTokens(CobolPreprocessorParser.W_CHAR); }
		public TerminalNode W_CHAR(int i) {
			return getToken(CobolPreprocessorParser.W_CHAR, i);
		}
		public TerminalNode FLAGSTD() { return getToken(CobolPreprocessorParser.FLAGSTD, 0); }
		public TerminalNode M_CHAR() { return getToken(CobolPreprocessorParser.M_CHAR, 0); }
		public TerminalNode H_CHAR() { return getToken(CobolPreprocessorParser.H_CHAR, 0); }
		public TerminalNode DD() { return getToken(CobolPreprocessorParser.DD, 0); }
		public TerminalNode N_CHAR() { return getToken(CobolPreprocessorParser.N_CHAR, 0); }
		public TerminalNode NN() { return getToken(CobolPreprocessorParser.NN, 0); }
		public TerminalNode SS() { return getToken(CobolPreprocessorParser.SS, 0); }
		public TerminalNode GDS() { return getToken(CobolPreprocessorParser.GDS, 0); }
		public TerminalNode GRAPHIC() { return getToken(CobolPreprocessorParser.GRAPHIC, 0); }
		public TerminalNode INTDATE() { return getToken(CobolPreprocessorParser.INTDATE, 0); }
		public TerminalNode ANSI() { return getToken(CobolPreprocessorParser.ANSI, 0); }
		public TerminalNode LILIAN() { return getToken(CobolPreprocessorParser.LILIAN, 0); }
		public TerminalNode LANGUAGE() { return getToken(CobolPreprocessorParser.LANGUAGE, 0); }
		public TerminalNode LANG() { return getToken(CobolPreprocessorParser.LANG, 0); }
		public TerminalNode ENGLISH() { return getToken(CobolPreprocessorParser.ENGLISH, 0); }
		public TerminalNode CS() { return getToken(CobolPreprocessorParser.CS, 0); }
		public TerminalNode EN() { return getToken(CobolPreprocessorParser.EN, 0); }
		public TerminalNode JA() { return getToken(CobolPreprocessorParser.JA, 0); }
		public TerminalNode JP() { return getToken(CobolPreprocessorParser.JP, 0); }
		public TerminalNode KA() { return getToken(CobolPreprocessorParser.KA, 0); }
		public TerminalNode UE() { return getToken(CobolPreprocessorParser.UE, 0); }
		public TerminalNode LEASM() { return getToken(CobolPreprocessorParser.LEASM, 0); }
		public TerminalNode LENGTH() { return getToken(CobolPreprocessorParser.LENGTH, 0); }
		public TerminalNode LIB() { return getToken(CobolPreprocessorParser.LIB, 0); }
		public TerminalNode LIN() { return getToken(CobolPreprocessorParser.LIN, 0); }
		public TerminalNode LINECOUNT() { return getToken(CobolPreprocessorParser.LINECOUNT, 0); }
		public TerminalNode LC() { return getToken(CobolPreprocessorParser.LC, 0); }
		public TerminalNode LINKAGE() { return getToken(CobolPreprocessorParser.LINKAGE, 0); }
		public TerminalNode LIST() { return getToken(CobolPreprocessorParser.LIST, 0); }
		public TerminalNode MAP() { return getToken(CobolPreprocessorParser.MAP, 0); }
		public TerminalNode MARGINS() { return getToken(CobolPreprocessorParser.MARGINS, 0); }
		public TerminalNode MDECK() { return getToken(CobolPreprocessorParser.MDECK, 0); }
		public TerminalNode MD() { return getToken(CobolPreprocessorParser.MD, 0); }
		public TerminalNode NOC() { return getToken(CobolPreprocessorParser.NOC, 0); }
		public TerminalNode NOCOMPILE() { return getToken(CobolPreprocessorParser.NOCOMPILE, 0); }
		public TerminalNode NAME() { return getToken(CobolPreprocessorParser.NAME, 0); }
		public TerminalNode ALIAS() { return getToken(CobolPreprocessorParser.ALIAS, 0); }
		public TerminalNode NOALIAS() { return getToken(CobolPreprocessorParser.NOALIAS, 0); }
		public TerminalNode NATLANG() { return getToken(CobolPreprocessorParser.NATLANG, 0); }
		public TerminalNode NOADATA() { return getToken(CobolPreprocessorParser.NOADATA, 0); }
		public TerminalNode NOADV() { return getToken(CobolPreprocessorParser.NOADV, 0); }
		public TerminalNode NOAWO() { return getToken(CobolPreprocessorParser.NOAWO, 0); }
		public TerminalNode NOBLOCK0() { return getToken(CobolPreprocessorParser.NOBLOCK0, 0); }
		public TerminalNode NOCBLCARD() { return getToken(CobolPreprocessorParser.NOCBLCARD, 0); }
		public TerminalNode NOCICS() { return getToken(CobolPreprocessorParser.NOCICS, 0); }
		public TerminalNode NOCMPR2() { return getToken(CobolPreprocessorParser.NOCMPR2, 0); }
		public TerminalNode NOCPSM() { return getToken(CobolPreprocessorParser.NOCPSM, 0); }
		public TerminalNode NOCURRENCY() { return getToken(CobolPreprocessorParser.NOCURRENCY, 0); }
		public TerminalNode NOCURR() { return getToken(CobolPreprocessorParser.NOCURR, 0); }
		public TerminalNode NODATEPROC() { return getToken(CobolPreprocessorParser.NODATEPROC, 0); }
		public TerminalNode NODP() { return getToken(CobolPreprocessorParser.NODP, 0); }
		public TerminalNode NODBCS() { return getToken(CobolPreprocessorParser.NODBCS, 0); }
		public TerminalNode NODEBUG() { return getToken(CobolPreprocessorParser.NODEBUG, 0); }
		public TerminalNode NODECK() { return getToken(CobolPreprocessorParser.NODECK, 0); }
		public TerminalNode NOD() { return getToken(CobolPreprocessorParser.NOD, 0); }
		public TerminalNode NODLL() { return getToken(CobolPreprocessorParser.NODLL, 0); }
		public TerminalNode NODE() { return getToken(CobolPreprocessorParser.NODE, 0); }
		public TerminalNode NODUMP() { return getToken(CobolPreprocessorParser.NODUMP, 0); }
		public TerminalNode NODU() { return getToken(CobolPreprocessorParser.NODU, 0); }
		public TerminalNode NODIAGTRUNC() { return getToken(CobolPreprocessorParser.NODIAGTRUNC, 0); }
		public TerminalNode NODTR() { return getToken(CobolPreprocessorParser.NODTR, 0); }
		public TerminalNode NODYNAM() { return getToken(CobolPreprocessorParser.NODYNAM, 0); }
		public TerminalNode NODYN() { return getToken(CobolPreprocessorParser.NODYN, 0); }
		public TerminalNode NOEDF() { return getToken(CobolPreprocessorParser.NOEDF, 0); }
		public TerminalNode NOEPILOG() { return getToken(CobolPreprocessorParser.NOEPILOG, 0); }
		public TerminalNode NOEXIT() { return getToken(CobolPreprocessorParser.NOEXIT, 0); }
		public TerminalNode NOEXPORTALL() { return getToken(CobolPreprocessorParser.NOEXPORTALL, 0); }
		public TerminalNode NOEXP() { return getToken(CobolPreprocessorParser.NOEXP, 0); }
		public TerminalNode NOFASTSRT() { return getToken(CobolPreprocessorParser.NOFASTSRT, 0); }
		public TerminalNode NOFSRT() { return getToken(CobolPreprocessorParser.NOFSRT, 0); }
		public TerminalNode NOFEPI() { return getToken(CobolPreprocessorParser.NOFEPI, 0); }
		public TerminalNode NOF() { return getToken(CobolPreprocessorParser.NOF, 0); }
		public TerminalNode NOFLAGMIG() { return getToken(CobolPreprocessorParser.NOFLAGMIG, 0); }
		public TerminalNode NOFLAGSTD() { return getToken(CobolPreprocessorParser.NOFLAGSTD, 0); }
		public TerminalNode NOGRAPHIC() { return getToken(CobolPreprocessorParser.NOGRAPHIC, 0); }
		public TerminalNode NOLENGTH() { return getToken(CobolPreprocessorParser.NOLENGTH, 0); }
		public TerminalNode NOLIB() { return getToken(CobolPreprocessorParser.NOLIB, 0); }
		public TerminalNode NOLINKAGE() { return getToken(CobolPreprocessorParser.NOLINKAGE, 0); }
		public TerminalNode NOLIST() { return getToken(CobolPreprocessorParser.NOLIST, 0); }
		public TerminalNode NOMAP() { return getToken(CobolPreprocessorParser.NOMAP, 0); }
		public TerminalNode NOMDECK() { return getToken(CobolPreprocessorParser.NOMDECK, 0); }
		public TerminalNode NOMD() { return getToken(CobolPreprocessorParser.NOMD, 0); }
		public TerminalNode NONAME() { return getToken(CobolPreprocessorParser.NONAME, 0); }
		public TerminalNode NONUMBER() { return getToken(CobolPreprocessorParser.NONUMBER, 0); }
		public TerminalNode NONUM() { return getToken(CobolPreprocessorParser.NONUM, 0); }
		public TerminalNode NOOBJECT() { return getToken(CobolPreprocessorParser.NOOBJECT, 0); }
		public TerminalNode NOOBJ() { return getToken(CobolPreprocessorParser.NOOBJ, 0); }
		public TerminalNode NOOFFSET() { return getToken(CobolPreprocessorParser.NOOFFSET, 0); }
		public TerminalNode NOOFF() { return getToken(CobolPreprocessorParser.NOOFF, 0); }
		public TerminalNode NOOPSEQUENCE() { return getToken(CobolPreprocessorParser.NOOPSEQUENCE, 0); }
		public TerminalNode NOOPTIMIZE() { return getToken(CobolPreprocessorParser.NOOPTIMIZE, 0); }
		public TerminalNode NOOPT() { return getToken(CobolPreprocessorParser.NOOPT, 0); }
		public TerminalNode NOOPTIONS() { return getToken(CobolPreprocessorParser.NOOPTIONS, 0); }
		public TerminalNode NOP() { return getToken(CobolPreprocessorParser.NOP, 0); }
		public TerminalNode NOPROLOG() { return getToken(CobolPreprocessorParser.NOPROLOG, 0); }
		public TerminalNode NORENT() { return getToken(CobolPreprocessorParser.NORENT, 0); }
		public TerminalNode NOSEQUENCE() { return getToken(CobolPreprocessorParser.NOSEQUENCE, 0); }
		public TerminalNode NOSEQ() { return getToken(CobolPreprocessorParser.NOSEQ, 0); }
		public TerminalNode NOSOURCE() { return getToken(CobolPreprocessorParser.NOSOURCE, 0); }
		public TerminalNode NOS() { return getToken(CobolPreprocessorParser.NOS, 0); }
		public TerminalNode NOSPIE() { return getToken(CobolPreprocessorParser.NOSPIE, 0); }
		public TerminalNode NOSQL() { return getToken(CobolPreprocessorParser.NOSQL, 0); }
		public TerminalNode NOSQLCCSID() { return getToken(CobolPreprocessorParser.NOSQLCCSID, 0); }
		public TerminalNode NOSQLC() { return getToken(CobolPreprocessorParser.NOSQLC, 0); }
		public TerminalNode NOSSRANGE() { return getToken(CobolPreprocessorParser.NOSSRANGE, 0); }
		public TerminalNode NOSSR() { return getToken(CobolPreprocessorParser.NOSSR, 0); }
		public TerminalNode NOSTDTRUNC() { return getToken(CobolPreprocessorParser.NOSTDTRUNC, 0); }
		public TerminalNode NOTERMINAL() { return getToken(CobolPreprocessorParser.NOTERMINAL, 0); }
		public TerminalNode NOTERM() { return getToken(CobolPreprocessorParser.NOTERM, 0); }
		public TerminalNode NOTEST() { return getToken(CobolPreprocessorParser.NOTEST, 0); }
		public TerminalNode NOTHREAD() { return getToken(CobolPreprocessorParser.NOTHREAD, 0); }
		public TerminalNode NOVBREF() { return getToken(CobolPreprocessorParser.NOVBREF, 0); }
		public TerminalNode NOWORD() { return getToken(CobolPreprocessorParser.NOWORD, 0); }
		public TerminalNode NOWD() { return getToken(CobolPreprocessorParser.NOWD, 0); }
		public TerminalNode NSEQ() { return getToken(CobolPreprocessorParser.NSEQ, 0); }
		public TerminalNode NSYMBOL() { return getToken(CobolPreprocessorParser.NSYMBOL, 0); }
		public TerminalNode NS() { return getToken(CobolPreprocessorParser.NS, 0); }
		public TerminalNode NATIONAL() { return getToken(CobolPreprocessorParser.NATIONAL, 0); }
		public TerminalNode NAT() { return getToken(CobolPreprocessorParser.NAT, 0); }
		public TerminalNode NOXREF() { return getToken(CobolPreprocessorParser.NOXREF, 0); }
		public TerminalNode NOX() { return getToken(CobolPreprocessorParser.NOX, 0); }
		public TerminalNode NOZWB() { return getToken(CobolPreprocessorParser.NOZWB, 0); }
		public TerminalNode NUMBER() { return getToken(CobolPreprocessorParser.NUMBER, 0); }
		public TerminalNode NUM() { return getToken(CobolPreprocessorParser.NUM, 0); }
		public TerminalNode NUMPROC() { return getToken(CobolPreprocessorParser.NUMPROC, 0); }
		public TerminalNode MIG() { return getToken(CobolPreprocessorParser.MIG, 0); }
		public TerminalNode NOPFD() { return getToken(CobolPreprocessorParser.NOPFD, 0); }
		public TerminalNode PFD() { return getToken(CobolPreprocessorParser.PFD, 0); }
		public TerminalNode OBJECT() { return getToken(CobolPreprocessorParser.OBJECT, 0); }
		public TerminalNode OBJ() { return getToken(CobolPreprocessorParser.OBJ, 0); }
		public TerminalNode OFFSET() { return getToken(CobolPreprocessorParser.OFFSET, 0); }
		public TerminalNode OFF() { return getToken(CobolPreprocessorParser.OFF, 0); }
		public TerminalNode OPMARGINS() { return getToken(CobolPreprocessorParser.OPMARGINS, 0); }
		public TerminalNode OPSEQUENCE() { return getToken(CobolPreprocessorParser.OPSEQUENCE, 0); }
		public TerminalNode OPTIMIZE() { return getToken(CobolPreprocessorParser.OPTIMIZE, 0); }
		public TerminalNode OPT() { return getToken(CobolPreprocessorParser.OPT, 0); }
		public TerminalNode FULL() { return getToken(CobolPreprocessorParser.FULL, 0); }
		public TerminalNode STD() { return getToken(CobolPreprocessorParser.STD, 0); }
		public TerminalNode OPTFILE() { return getToken(CobolPreprocessorParser.OPTFILE, 0); }
		public TerminalNode OPTIONS() { return getToken(CobolPreprocessorParser.OPTIONS, 0); }
		public TerminalNode OP() { return getToken(CobolPreprocessorParser.OP, 0); }
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public TerminalNode OUTDD() { return getToken(CobolPreprocessorParser.OUTDD, 0); }
		public TerminalNode OUT() { return getToken(CobolPreprocessorParser.OUT, 0); }
		public TerminalNode PGMNAME() { return getToken(CobolPreprocessorParser.PGMNAME, 0); }
		public TerminalNode PGMN() { return getToken(CobolPreprocessorParser.PGMN, 0); }
		public TerminalNode CO() { return getToken(CobolPreprocessorParser.CO, 0); }
		public TerminalNode LM() { return getToken(CobolPreprocessorParser.LM, 0); }
		public TerminalNode LONGMIXED() { return getToken(CobolPreprocessorParser.LONGMIXED, 0); }
		public TerminalNode LONGUPPER() { return getToken(CobolPreprocessorParser.LONGUPPER, 0); }
		public TerminalNode LU() { return getToken(CobolPreprocessorParser.LU, 0); }
		public TerminalNode MIXED() { return getToken(CobolPreprocessorParser.MIXED, 0); }
		public TerminalNode UPPER() { return getToken(CobolPreprocessorParser.UPPER, 0); }
		public TerminalNode PROLOG() { return getToken(CobolPreprocessorParser.PROLOG, 0); }
		public TerminalNode QUOTE() { return getToken(CobolPreprocessorParser.QUOTE, 0); }
		public TerminalNode Q_CHAR() { return getToken(CobolPreprocessorParser.Q_CHAR, 0); }
		public TerminalNode RENT() { return getToken(CobolPreprocessorParser.RENT, 0); }
		public TerminalNode RMODE() { return getToken(CobolPreprocessorParser.RMODE, 0); }
		public TerminalNode ANY() { return getToken(CobolPreprocessorParser.ANY, 0); }
		public TerminalNode AUTO() { return getToken(CobolPreprocessorParser.AUTO, 0); }
		public TerminalNode SEQUENCE() { return getToken(CobolPreprocessorParser.SEQUENCE, 0); }
		public TerminalNode SEQ() { return getToken(CobolPreprocessorParser.SEQ, 0); }
		public TerminalNode SIZE() { return getToken(CobolPreprocessorParser.SIZE, 0); }
		public TerminalNode SZ() { return getToken(CobolPreprocessorParser.SZ, 0); }
		public TerminalNode MAX() { return getToken(CobolPreprocessorParser.MAX, 0); }
		public TerminalNode SOURCE() { return getToken(CobolPreprocessorParser.SOURCE, 0); }
		public TerminalNode SP() { return getToken(CobolPreprocessorParser.SP, 0); }
		public TerminalNode SPACE() { return getToken(CobolPreprocessorParser.SPACE, 0); }
		public TerminalNode SPIE() { return getToken(CobolPreprocessorParser.SPIE, 0); }
		public TerminalNode SQL() { return getToken(CobolPreprocessorParser.SQL, 0); }
		public TerminalNode SQLCCSID() { return getToken(CobolPreprocessorParser.SQLCCSID, 0); }
		public TerminalNode SQLC() { return getToken(CobolPreprocessorParser.SQLC, 0); }
		public TerminalNode SSRANGE() { return getToken(CobolPreprocessorParser.SSRANGE, 0); }
		public TerminalNode SSR() { return getToken(CobolPreprocessorParser.SSR, 0); }
		public TerminalNode SYSEIB() { return getToken(CobolPreprocessorParser.SYSEIB, 0); }
		public TerminalNode TERMINAL() { return getToken(CobolPreprocessorParser.TERMINAL, 0); }
		public TerminalNode TERM() { return getToken(CobolPreprocessorParser.TERM, 0); }
		public TerminalNode TEST() { return getToken(CobolPreprocessorParser.TEST, 0); }
		public TerminalNode HOOK() { return getToken(CobolPreprocessorParser.HOOK, 0); }
		public TerminalNode NOHOOK() { return getToken(CobolPreprocessorParser.NOHOOK, 0); }
		public TerminalNode SEP() { return getToken(CobolPreprocessorParser.SEP, 0); }
		public TerminalNode SEPARATE() { return getToken(CobolPreprocessorParser.SEPARATE, 0); }
		public TerminalNode NOSEP() { return getToken(CobolPreprocessorParser.NOSEP, 0); }
		public TerminalNode NOSEPARATE() { return getToken(CobolPreprocessorParser.NOSEPARATE, 0); }
		public TerminalNode EJPD() { return getToken(CobolPreprocessorParser.EJPD, 0); }
		public TerminalNode NOEJPD() { return getToken(CobolPreprocessorParser.NOEJPD, 0); }
		public TerminalNode THREAD() { return getToken(CobolPreprocessorParser.THREAD, 0); }
		public TerminalNode TRUNC() { return getToken(CobolPreprocessorParser.TRUNC, 0); }
		public TerminalNode BIN() { return getToken(CobolPreprocessorParser.BIN, 0); }
		public TerminalNode VBREF() { return getToken(CobolPreprocessorParser.VBREF, 0); }
		public TerminalNode WORD() { return getToken(CobolPreprocessorParser.WORD, 0); }
		public TerminalNode WD() { return getToken(CobolPreprocessorParser.WD, 0); }
		public TerminalNode XMLPARSE() { return getToken(CobolPreprocessorParser.XMLPARSE, 0); }
		public TerminalNode XP() { return getToken(CobolPreprocessorParser.XP, 0); }
		public TerminalNode XMLSS() { return getToken(CobolPreprocessorParser.XMLSS, 0); }
		public TerminalNode X_CHAR() { return getToken(CobolPreprocessorParser.X_CHAR, 0); }
		public TerminalNode XREF() { return getToken(CobolPreprocessorParser.XREF, 0); }
		public TerminalNode SHORT() { return getToken(CobolPreprocessorParser.SHORT, 0); }
		public TerminalNode YEARWINDOW() { return getToken(CobolPreprocessorParser.YEARWINDOW, 0); }
		public TerminalNode YW() { return getToken(CobolPreprocessorParser.YW, 0); }
		public TerminalNode ZWB() { return getToken(CobolPreprocessorParser.ZWB, 0); }
		public CompilerOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCompilerOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCompilerOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCompilerOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerOptionContext compilerOption() throws RecognitionException {
		CompilerOptionContext _localctx = new CompilerOptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compilerOption);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(ADATA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(ADV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(APOST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==AR || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(LPARENCHAR);
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(RPARENCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(AWO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(BLOCK0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==BUF || _la==BUFSIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				match(LPARENCHAR);
				setState(123);
				literal();
				setState(124);
				match(RPARENCHAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				match(CBLCARD);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(CICS);
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(128);
					match(LPARENCHAR);
					setState(129);
					literal();
					setState(130);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(COBOL2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(135);
				match(COBOL3);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==CODEPAGE || _la==CP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				match(LPARENCHAR);
				setState(138);
				literal();
				setState(139);
				match(RPARENCHAR);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==COMPILE || _la==C_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(142);
				match(CPP);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(143);
				match(CPSM);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==CURR || _la==CURRENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				match(LPARENCHAR);
				setState(146);
				literal();
				setState(147);
				match(RPARENCHAR);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(149);
				match(DATA);
				setState(150);
				match(LPARENCHAR);
				setState(151);
				literal();
				setState(152);
				match(RPARENCHAR);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==DATEPROC || _la==DP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(155);
					match(LPARENCHAR);
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FLAG || _la==NOFLAG) {
						{
						setState(156);
						_la = _input.LA(1);
						if ( !(_la==FLAG || _la==NOFLAG) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(159);
						match(COMMACHAR);
						}
					}

					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOTRIG || _la==TRIG) {
						{
						setState(162);
						_la = _input.LA(1);
						if ( !(_la==NOTRIG || _la==TRIG) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(165);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(168);
				match(DBCS);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==DECK || _la==D_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(170);
				match(DEBUG);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==DIAGTRUNC || _la==DTR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(172);
				match(DLL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==DU || _la==DUMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==DYN || _la==DYNAM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(175);
				match(EDF);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(176);
				match(EPILOG);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(177);
				match(EXIT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==EXP || _la==EXPORTALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==FASTSRT || _la==FSRT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(180);
				match(FEPI);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==FLAG || _la==F_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(LPARENCHAR);
				setState(183);
				_la = _input.LA(1);
				if ( !(((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (E_CHAR - 288)) | (1L << (I_CHAR - 288)) | (1L << (S_CHAR - 288)) | (1L << (U_CHAR - 288)) | (1L << (W_CHAR - 288)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(184);
					match(COMMACHAR);
					setState(185);
					_la = _input.LA(1);
					if ( !(((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (E_CHAR - 288)) | (1L << (I_CHAR - 288)) | (1L << (S_CHAR - 288)) | (1L << (U_CHAR - 288)) | (1L << (W_CHAR - 288)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(188);
				match(RPARENCHAR);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(189);
				match(FLAGSTD);
				setState(190);
				match(LPARENCHAR);
				setState(191);
				_la = _input.LA(1);
				if ( !(((((_la - 290)) & ~0x3f) == 0 && ((1L << (_la - 290)) & ((1L << (H_CHAR - 290)) | (1L << (I_CHAR - 290)) | (1L << (M_CHAR - 290)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(192);
					match(COMMACHAR);
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==DD || _la==NN || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (SS - 259)) | (1L << (D_CHAR - 259)) | (1L << (N_CHAR - 259)) | (1L << (S_CHAR - 259)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(196);
				match(RPARENCHAR);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(197);
				match(GDS);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(198);
				match(GRAPHIC);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(199);
				match(INTDATE);
				setState(200);
				match(LPARENCHAR);
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==ANSI || _la==LILIAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				match(RPARENCHAR);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==LANG || _la==LANGUAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				match(LPARENCHAR);
				setState(205);
				_la = _input.LA(1);
				if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (CS - 44)) | (1L << (EN - 44)) | (1L << (ENGLISH - 44)) | (1L << (JA - 44)) | (1L << (JP - 44)) | (1L << (KA - 44)))) != 0) || _la==UE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				match(RPARENCHAR);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(207);
				match(LEASM);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(208);
				match(LENGTH);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(209);
				match(LIB);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(210);
				match(LIN);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(211);
				_la = _input.LA(1);
				if ( !(_la==LC || _la==LINECOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(212);
				match(LPARENCHAR);
				setState(213);
				literal();
				setState(214);
				match(RPARENCHAR);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(216);
				match(LINKAGE);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(217);
				match(LIST);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(218);
				match(MAP);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(219);
				match(MARGINS);
				setState(220);
				match(LPARENCHAR);
				setState(221);
				literal();
				setState(222);
				match(COMMACHAR);
				setState(223);
				literal();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(224);
					match(COMMACHAR);
					setState(225);
					literal();
					}
				}

				setState(228);
				match(RPARENCHAR);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==MD || _la==MDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(231);
					match(LPARENCHAR);
					setState(232);
					_la = _input.LA(1);
					if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(233);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(236);
				match(NAME);
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(237);
					match(LPARENCHAR);
					setState(238);
					_la = _input.LA(1);
					if ( !(_la==ALIAS || _la==NOALIAS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(239);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(242);
				match(NATLANG);
				setState(243);
				match(LPARENCHAR);
				setState(244);
				_la = _input.LA(1);
				if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (CS - 44)) | (1L << (EN - 44)) | (1L << (KA - 44)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				match(RPARENCHAR);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(246);
				match(NOADATA);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(247);
				match(NOADV);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(248);
				match(NOAWO);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(249);
				match(NOBLOCK0);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(250);
				match(NOCBLCARD);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(251);
				match(NOCICS);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(252);
				match(NOCMPR2);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==NOC || _la==NOCOMPILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(254);
					match(LPARENCHAR);
					setState(255);
					_la = _input.LA(1);
					if ( !(((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (E_CHAR - 288)) | (1L << (S_CHAR - 288)) | (1L << (W_CHAR - 288)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(256);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(259);
				match(NOCPSM);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==NOCURR || _la==NOCURRENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==NODATEPROC || _la==NODP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(262);
				match(NODBCS);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(263);
				match(NODEBUG);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==NOD || _la==NODECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(265);
				match(NODLL);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(266);
				match(NODE);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==NODU || _la==NODUMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(268);
				_la = _input.LA(1);
				if ( !(_la==NODIAGTRUNC || _la==NODTR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==NODYN || _la==NODYNAM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(270);
				match(NOEDF);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(271);
				match(NOEPILOG);
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(272);
				match(NOEXIT);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==NOEXP || _la==NOEXPORTALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==NOFASTSRT || _la==NOFSRT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(275);
				match(NOFEPI);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==NOF || _la==NOFLAG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(277);
				match(NOFLAGMIG);
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(278);
				match(NOFLAGSTD);
				}
				break;
			case 78:
				enterOuterAlt(_localctx, 78);
				{
				setState(279);
				match(NOGRAPHIC);
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(280);
				match(NOLENGTH);
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(281);
				match(NOLIB);
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 81);
				{
				setState(282);
				match(NOLINKAGE);
				}
				break;
			case 82:
				enterOuterAlt(_localctx, 82);
				{
				setState(283);
				match(NOLIST);
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(284);
				match(NOMAP);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==NOMD || _la==NOMDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 85:
				enterOuterAlt(_localctx, 85);
				{
				setState(286);
				match(NONAME);
				}
				break;
			case 86:
				enterOuterAlt(_localctx, 86);
				{
				setState(287);
				_la = _input.LA(1);
				if ( !(_la==NONUM || _la==NONUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 87:
				enterOuterAlt(_localctx, 87);
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(_la==NOOBJ || _la==NOOBJECT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==NOOFF || _la==NOOFFSET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(290);
				match(NOOPSEQUENCE);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==NOOPT || _la==NOOPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 91:
				enterOuterAlt(_localctx, 91);
				{
				setState(292);
				match(NOOPTIONS);
				}
				break;
			case 92:
				enterOuterAlt(_localctx, 92);
				{
				setState(293);
				match(NOP);
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(294);
				match(NOPROLOG);
				}
				break;
			case 94:
				enterOuterAlt(_localctx, 94);
				{
				setState(295);
				match(NORENT);
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==NOSEQ || _la==NOSEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==NOS || _la==NOSOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(298);
				match(NOSPIE);
				}
				break;
			case 98:
				enterOuterAlt(_localctx, 98);
				{
				setState(299);
				match(NOSQL);
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==NOSQLC || _la==NOSQLCCSID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(301);
				_la = _input.LA(1);
				if ( !(_la==NOSSR || _la==NOSSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(302);
				match(NOSTDTRUNC);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==NOTERM || _la==NOTERMINAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(304);
				match(NOTEST);
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(305);
				match(NOTHREAD);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(306);
				match(NOVBREF);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==NOWD || _la==NOWORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 107:
				enterOuterAlt(_localctx, 107);
				{
				setState(308);
				match(NSEQ);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==NS || _la==NSYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(310);
				match(LPARENCHAR);
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				match(RPARENCHAR);
				}
				break;
			case 109:
				enterOuterAlt(_localctx, 109);
				{
				setState(313);
				match(NOVBREF);
				}
				break;
			case 110:
				enterOuterAlt(_localctx, 110);
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==NOX || _la==NOXREF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 111:
				enterOuterAlt(_localctx, 111);
				{
				setState(315);
				match(NOZWB);
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 113:
				enterOuterAlt(_localctx, 113);
				{
				setState(317);
				match(NUMPROC);
				setState(318);
				match(LPARENCHAR);
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				match(RPARENCHAR);
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==OBJ || _la==OBJECT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(322);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==OFFSET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(323);
				match(OPMARGINS);
				setState(324);
				match(LPARENCHAR);
				setState(325);
				literal();
				setState(326);
				match(COMMACHAR);
				setState(327);
				literal();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(328);
					match(COMMACHAR);
					setState(329);
					literal();
					}
				}

				setState(332);
				match(RPARENCHAR);
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(334);
				match(OPSEQUENCE);
				setState(335);
				match(LPARENCHAR);
				setState(336);
				literal();
				setState(337);
				match(COMMACHAR);
				setState(338);
				literal();
				setState(339);
				match(RPARENCHAR);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==OPT || _la==OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(342);
					match(LPARENCHAR);
					setState(343);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==STD) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(344);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(347);
				match(OPTFILE);
				}
				break;
			case 120:
				enterOuterAlt(_localctx, 120);
				{
				setState(348);
				match(OPTIONS);
				}
				break;
			case 121:
				enterOuterAlt(_localctx, 121);
				{
				setState(349);
				match(OP);
				}
				break;
			case 122:
				enterOuterAlt(_localctx, 122);
				{
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==OUTDD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(351);
				match(LPARENCHAR);
				setState(352);
				cobolWord();
				setState(353);
				match(RPARENCHAR);
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==PGMN || _la==PGMNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				match(LPARENCHAR);
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==CO || _la==COMPAT || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (LM - 103)) | (1L << (LONGMIXED - 103)) | (1L << (LONGUPPER - 103)) | (1L << (LU - 103)) | (1L << (MIXED - 103)))) != 0) || ((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (UPPER - 274)) | (1L << (M_CHAR - 274)) | (1L << (U_CHAR - 274)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				match(RPARENCHAR);
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(359);
				match(PROLOG);
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(360);
				_la = _input.LA(1);
				if ( !(_la==QUOTE || _la==Q_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 126:
				enterOuterAlt(_localctx, 126);
				{
				setState(361);
				match(RENT);
				}
				break;
			case 127:
				enterOuterAlt(_localctx, 127);
				{
				setState(362);
				match(RMODE);
				setState(363);
				match(LPARENCHAR);
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
					{
					setState(364);
					match(ANY);
					}
					break;
				case AUTO:
					{
					setState(365);
					match(AUTO);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(366);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(369);
				match(RPARENCHAR);
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==SEQ || _la==SEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(371);
					match(LPARENCHAR);
					setState(372);
					literal();
					setState(373);
					match(COMMACHAR);
					setState(374);
					literal();
					setState(375);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 129:
				enterOuterAlt(_localctx, 129);
				{
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==SIZE || _la==SZ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				match(LPARENCHAR);
				setState(383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAX:
					{
					setState(381);
					match(MAX);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(382);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(385);
				match(RPARENCHAR);
				}
				break;
			case 130:
				enterOuterAlt(_localctx, 130);
				{
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==SOURCE || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 131:
				enterOuterAlt(_localctx, 131);
				{
				setState(387);
				match(SP);
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(388);
				match(SPACE);
				setState(389);
				match(LPARENCHAR);
				setState(390);
				literal();
				setState(391);
				match(RPARENCHAR);
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(393);
				match(SPIE);
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(394);
				match(SQL);
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(395);
					match(LPARENCHAR);
					setState(396);
					literal();
					setState(397);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 135:
				enterOuterAlt(_localctx, 135);
				{
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==SQLC || _la==SQLCCSID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(402);
				_la = _input.LA(1);
				if ( !(_la==SSR || _la==SSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(403);
				match(SYSEIB);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==TERM || _la==TERMINAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 139:
				enterOuterAlt(_localctx, 139);
				{
				setState(405);
				match(TEST);
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(406);
					match(LPARENCHAR);
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HOOK || _la==NOHOOK) {
						{
						setState(407);
						_la = _input.LA(1);
						if ( !(_la==HOOK || _la==NOHOOK) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(410);
						match(COMMACHAR);
						}
						break;
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (NOSEP - 186)) | (1L << (NOSEPARATE - 186)) | (1L << (SEP - 186)) | (1L << (SEPARATE - 186)))) != 0)) {
						{
						setState(413);
						_la = _input.LA(1);
						if ( !(((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (NOSEP - 186)) | (1L << (NOSEPARATE - 186)) | (1L << (SEP - 186)) | (1L << (SEPARATE - 186)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(416);
						match(COMMACHAR);
						}
					}

					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EJPD || _la==NOEJPD) {
						{
						setState(419);
						_la = _input.LA(1);
						if ( !(_la==EJPD || _la==NOEJPD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(422);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 140:
				enterOuterAlt(_localctx, 140);
				{
				setState(425);
				match(THREAD);
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(426);
				match(TRUNC);
				setState(427);
				match(LPARENCHAR);
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==OPT || _la==STD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				match(RPARENCHAR);
				}
				break;
			case 142:
				enterOuterAlt(_localctx, 142);
				{
				setState(430);
				match(VBREF);
				}
				break;
			case 143:
				enterOuterAlt(_localctx, 143);
				{
				setState(431);
				_la = _input.LA(1);
				if ( !(_la==WD || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(432);
				match(LPARENCHAR);
				setState(433);
				cobolWord();
				setState(434);
				match(RPARENCHAR);
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==XMLPARSE || _la==XP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(437);
				match(LPARENCHAR);
				setState(438);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 279)) & ~0x3f) == 0 && ((1L << (_la - 279)) & ((1L << (XMLSS - 279)) | (1L << (C_CHAR - 279)) | (1L << (X_CHAR - 279)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				match(RPARENCHAR);
				}
				break;
			case 145:
				enterOuterAlt(_localctx, 145);
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==XREF || _la==X_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(441);
					match(LPARENCHAR);
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FULL || _la==SHORT) {
						{
						setState(442);
						_la = _input.LA(1);
						if ( !(_la==FULL || _la==SHORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(445);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 146:
				enterOuterAlt(_localctx, 146);
				{
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==YEARWINDOW || _la==YW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(449);
				match(LPARENCHAR);
				setState(450);
				literal();
				setState(451);
				match(RPARENCHAR);
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(453);
				match(ZWB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicCommentEntryContext extends ParserRuleContext {
		public TerminalNode CLASSIC_COMMENTLINE() { return getToken(CobolPreprocessorParser.CLASSIC_COMMENTLINE, 0); }
		public ClassicCommentEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicCommentEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterClassicCommentEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitClassicCommentEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitClassicCommentEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassicCommentEntryContext classicCommentEntry() throws RecognitionException {
		ClassicCommentEntryContext _localctx = new ClassicCommentEntryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classicCommentEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(CLASSIC_COMMENTLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecCicsStatementContext extends ParserRuleContext {
		public TerminalNode EXEC() { return getToken(CobolPreprocessorParser.EXEC, 0); }
		public TerminalNode CICS() { return getToken(CobolPreprocessorParser.CICS, 0); }
		public CharDataContext charData() {
			return getRuleContext(CharDataContext.class,0);
		}
		public TerminalNode END_EXEC() { return getToken(CobolPreprocessorParser.END_EXEC, 0); }
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public ExecCicsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execCicsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterExecCicsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitExecCicsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitExecCicsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecCicsStatementContext execCicsStatement() throws RecognitionException {
		ExecCicsStatementContext _localctx = new ExecCicsStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_execCicsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(EXEC);
			setState(459);
			match(CICS);
			setState(460);
			charData();
			setState(461);
			match(END_EXEC);
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(462);
				match(DOT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecSqlStatementContext extends ParserRuleContext {
		public TerminalNode EXEC() { return getToken(CobolPreprocessorParser.EXEC, 0); }
		public TerminalNode SQL() { return getToken(CobolPreprocessorParser.SQL, 0); }
		public CharDataSqlContext charDataSql() {
			return getRuleContext(CharDataSqlContext.class,0);
		}
		public TerminalNode END_EXEC() { return getToken(CobolPreprocessorParser.END_EXEC, 0); }
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public ExecSqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execSqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterExecSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitExecSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitExecSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecSqlStatementContext execSqlStatement() throws RecognitionException {
		ExecSqlStatementContext _localctx = new ExecSqlStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_execSqlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(EXEC);
			setState(466);
			match(SQL);
			setState(467);
			charDataSql();
			setState(468);
			match(END_EXEC);
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(469);
				match(DOT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecSqlImsStatementContext extends ParserRuleContext {
		public TerminalNode EXEC() { return getToken(CobolPreprocessorParser.EXEC, 0); }
		public TerminalNode SQLIMS() { return getToken(CobolPreprocessorParser.SQLIMS, 0); }
		public CharDataContext charData() {
			return getRuleContext(CharDataContext.class,0);
		}
		public TerminalNode END_EXEC() { return getToken(CobolPreprocessorParser.END_EXEC, 0); }
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public ExecSqlImsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execSqlImsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterExecSqlImsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitExecSqlImsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitExecSqlImsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecSqlImsStatementContext execSqlImsStatement() throws RecognitionException {
		ExecSqlImsStatementContext _localctx = new ExecSqlImsStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_execSqlImsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(EXEC);
			setState(473);
			match(SQLIMS);
			setState(474);
			charData();
			setState(475);
			match(END_EXEC);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(476);
				match(DOT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CopyStatementContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(CobolPreprocessorParser.COPY, 0); }
		public CopySourceContext copySource() {
			return getRuleContext(CopySourceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public List<DirectoryPhraseContext> directoryPhrase() {
			return getRuleContexts(DirectoryPhraseContext.class);
		}
		public DirectoryPhraseContext directoryPhrase(int i) {
			return getRuleContext(DirectoryPhraseContext.class,i);
		}
		public List<FamilyPhraseContext> familyPhrase() {
			return getRuleContexts(FamilyPhraseContext.class);
		}
		public FamilyPhraseContext familyPhrase(int i) {
			return getRuleContext(FamilyPhraseContext.class,i);
		}
		public List<ReplacingPhraseContext> replacingPhrase() {
			return getRuleContexts(ReplacingPhraseContext.class);
		}
		public ReplacingPhraseContext replacingPhrase(int i) {
			return getRuleContext(ReplacingPhraseContext.class,i);
		}
		public List<TerminalNode> SUPPRESS() { return getTokens(CobolPreprocessorParser.SUPPRESS); }
		public TerminalNode SUPPRESS(int i) {
			return getToken(CobolPreprocessorParser.SUPPRESS, i);
		}
		public CopyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCopyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCopyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCopyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyStatementContext copyStatement() throws RecognitionException {
		CopyStatementContext _localctx = new CopyStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_copyStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(COPY);
			setState(480);
			copySource();
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(481);
						match(NEWLINE);
						}
						}
						setState(486);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(491);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IN:
					case OF:
						{
						setState(487);
						directoryPhrase();
						}
						break;
					case ON:
						{
						setState(488);
						familyPhrase();
						}
						break;
					case REPLACING:
						{
						setState(489);
						replacingPhrase();
						}
						break;
					case SUPPRESS:
						{
						setState(490);
						match(SUPPRESS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(498);
				match(NEWLINE);
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CopySourceContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public CopyLibraryContext copyLibrary() {
			return getRuleContext(CopyLibraryContext.class,0);
		}
		public TerminalNode OF() { return getToken(CobolPreprocessorParser.OF, 0); }
		public TerminalNode IN() { return getToken(CobolPreprocessorParser.IN, 0); }
		public CopySourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copySource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCopySource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCopySource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCopySource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopySourceContext copySource() throws RecognitionException {
		CopySourceContext _localctx = new CopySourceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_copySource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(506);
				literal();
				}
				break;
			case ADATA:
			case ADV:
			case ALIAS:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARITH:
			case AUTO:
			case AWO:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBL:
			case CBLCARD:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case CP:
			case CPP:
			case CPSM:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DECK:
			case DIAGTRUNC:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DTR:
			case DU:
			case DUMP:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENGLISH:
			case EPILOG:
			case EXCI:
			case EXIT:
			case EXP:
			case EXPORTALL:
			case EXTEND:
			case FASTSRT:
			case FLAG:
			case FLAGSTD:
			case FSRT:
			case FULL:
			case GDS:
			case GRAPHIC:
			case HOOK:
			case IN:
			case INTDATE:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LC:
			case LENGTH:
			case LIB:
			case LILIAN:
			case LIN:
			case LINECOUNT:
			case LINKAGE:
			case LIST:
			case LM:
			case LONGMIXED:
			case LONGUPPER:
			case LU:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOAWO:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCPSM:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODIAGTRUNC:
			case NODLL:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOEPILOG:
			case NOEXIT:
			case NOEXP:
			case NOEXPORTALL:
			case NOF:
			case NOFASTSRT:
			case NOFEPI:
			case NOFLAG:
			case NOFLAGMIG:
			case NOFLAGSTD:
			case NOFSRT:
			case NOGRAPHIC:
			case NOHOOK:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOFF:
			case NOOFFSET:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPFD:
			case NOPROLOG:
			case NORENT:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOVBREF:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PROCESS:
			case PROLOG:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SHORT:
			case SIZE:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SS:
			case SSR:
			case SSRANGE:
			case STD:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRIG:
			case TRUNC:
			case UE:
			case UPPER:
			case VBREF:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
				{
				setState(507);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(508);
				filename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(511);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(512);
				copyLibrary();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CopyLibraryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public CopyLibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyLibrary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCopyLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCopyLibrary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCopyLibrary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyLibraryContext copyLibrary() throws RecognitionException {
		CopyLibraryContext _localctx = new CopyLibraryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_copyLibrary);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				literal();
				}
				break;
			case ADATA:
			case ADV:
			case ALIAS:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARITH:
			case AUTO:
			case AWO:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBL:
			case CBLCARD:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case CP:
			case CPP:
			case CPSM:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DECK:
			case DIAGTRUNC:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DTR:
			case DU:
			case DUMP:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENGLISH:
			case EPILOG:
			case EXCI:
			case EXIT:
			case EXP:
			case EXPORTALL:
			case EXTEND:
			case FASTSRT:
			case FLAG:
			case FLAGSTD:
			case FSRT:
			case FULL:
			case GDS:
			case GRAPHIC:
			case HOOK:
			case IN:
			case INTDATE:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LC:
			case LENGTH:
			case LIB:
			case LILIAN:
			case LIN:
			case LINECOUNT:
			case LINKAGE:
			case LIST:
			case LM:
			case LONGMIXED:
			case LONGUPPER:
			case LU:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOAWO:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCPSM:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODIAGTRUNC:
			case NODLL:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOEPILOG:
			case NOEXIT:
			case NOEXP:
			case NOEXPORTALL:
			case NOF:
			case NOFASTSRT:
			case NOFEPI:
			case NOFLAG:
			case NOFLAGMIG:
			case NOFLAGSTD:
			case NOFSRT:
			case NOGRAPHIC:
			case NOHOOK:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOFF:
			case NOOFFSET:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPFD:
			case NOPROLOG:
			case NORENT:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOVBREF:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PROCESS:
			case PROLOG:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SHORT:
			case SIZE:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SS:
			case SSR:
			case SSRANGE:
			case STD:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRIG:
			case TRUNC:
			case UE:
			case UPPER:
			case VBREF:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				cobolWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplacingPhraseContext extends ParserRuleContext {
		public TerminalNode REPLACING() { return getToken(CobolPreprocessorParser.REPLACING, 0); }
		public List<ReplaceClauseContext> replaceClause() {
			return getRuleContexts(ReplaceClauseContext.class);
		}
		public ReplaceClauseContext replaceClause(int i) {
			return getRuleContext(ReplaceClauseContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public ReplacingPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacingPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterReplacingPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitReplacingPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitReplacingPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplacingPhraseContext replacingPhrase() throws RecognitionException {
		ReplacingPhraseContext _localctx = new ReplacingPhraseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replacingPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(REPLACING);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(520);
				match(NEWLINE);
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			replaceClause();
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(528); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(527);
						match(NEWLINE);
						}
						}
						setState(530); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(532);
					replaceClause();
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceAreaContext extends ParserRuleContext {
		public ReplaceByStatementContext replaceByStatement() {
			return getRuleContext(ReplaceByStatementContext.class,0);
		}
		public List<CopyStatementContext> copyStatement() {
			return getRuleContexts(CopyStatementContext.class);
		}
		public CopyStatementContext copyStatement(int i) {
			return getRuleContext(CopyStatementContext.class,i);
		}
		public List<CharDataContext> charData() {
			return getRuleContexts(CharDataContext.class);
		}
		public CharDataContext charData(int i) {
			return getRuleContext(CharDataContext.class,i);
		}
		public ReplaceOffStatementContext replaceOffStatement() {
			return getRuleContext(ReplaceOffStatementContext.class,0);
		}
		public ReplaceAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceArea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterReplaceArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitReplaceArea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitReplaceArea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceAreaContext replaceArea() throws RecognitionException {
		ReplaceAreaContext _localctx = new ReplaceAreaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_replaceArea);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			replaceByStatement();
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(541);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COPY:
						{
						setState(539);
						copyStatement();
						}
						break;
					case ADATA:
					case ADV:
					case ALIAS:
					case ANSI:
					case ANY:
					case APOST:
					case AR:
					case ARITH:
					case AUTO:
					case AWO:
					case BIN:
					case BLOCK0:
					case BUF:
					case BUFSIZE:
					case BY:
					case CBL:
					case CBLCARD:
					case CO:
					case COBOL2:
					case COBOL3:
					case CODEPAGE:
					case COMPAT:
					case COMPILE:
					case CP:
					case CPP:
					case CPSM:
					case CS:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DD:
					case DEBUG:
					case DECK:
					case DIAGTRUNC:
					case DIVISION:
					case DLI:
					case DLL:
					case DP:
					case DTR:
					case DU:
					case DUMP:
					case DYN:
					case DYNAM:
					case EDF:
					case EJECT:
					case EJPD:
					case EN:
					case ENGLISH:
					case EPILOG:
					case EXCI:
					case EXIT:
					case EXP:
					case EXPORTALL:
					case EXTEND:
					case FASTSRT:
					case FLAG:
					case FLAGSTD:
					case FSRT:
					case FULL:
					case GDS:
					case GRAPHIC:
					case HOOK:
					case IN:
					case INTDATE:
					case JA:
					case JP:
					case KA:
					case LANG:
					case LANGUAGE:
					case LC:
					case LENGTH:
					case LIB:
					case LILIAN:
					case LIN:
					case LINECOUNT:
					case LINKAGE:
					case LIST:
					case LM:
					case LONGMIXED:
					case LONGUPPER:
					case LPARENCHAR:
					case LU:
					case MAP:
					case MARGINS:
					case MAX:
					case MD:
					case MDECK:
					case MIG:
					case MIXED:
					case NAME:
					case NAT:
					case NATIONAL:
					case NATLANG:
					case NN:
					case NO:
					case NOADATA:
					case NOADV:
					case NOALIAS:
					case NOAWO:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCPSM:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODIAGTRUNC:
					case NODLL:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODYN:
					case NODYNAM:
					case NOEDF:
					case NOEJPD:
					case NOEPILOG:
					case NOEXIT:
					case NOEXP:
					case NOEXPORTALL:
					case NOF:
					case NOFASTSRT:
					case NOFEPI:
					case NOFLAG:
					case NOFLAGMIG:
					case NOFLAGSTD:
					case NOFSRT:
					case NOGRAPHIC:
					case NOHOOK:
					case NOLENGTH:
					case NOLIB:
					case NOLINKAGE:
					case NOLIST:
					case NOMAP:
					case NOMD:
					case NOMDECK:
					case NONAME:
					case NONUM:
					case NONUMBER:
					case NOOBJ:
					case NOOBJECT:
					case NOOFF:
					case NOOFFSET:
					case NOOPSEQUENCE:
					case NOOPT:
					case NOOPTIMIZE:
					case NOOPTIONS:
					case NOP:
					case NOPFD:
					case NOPROLOG:
					case NORENT:
					case NOS:
					case NOSEP:
					case NOSEPARATE:
					case NOSEQ:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOTRIG:
					case NOVBREF:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMPROC:
					case OBJ:
					case OBJECT:
					case OF:
					case OFF:
					case OFFSET:
					case ON:
					case OP:
					case OPMARGINS:
					case OPSEQUENCE:
					case OPT:
					case OPTFILE:
					case OPTIMIZE:
					case OPTIONS:
					case OUT:
					case OUTDD:
					case PFD:
					case PPTDBG:
					case PGMN:
					case PGMNAME:
					case PROCESS:
					case PROLOG:
					case QUOTE:
					case RENT:
					case REPLACING:
					case RMODE:
					case RPARENCHAR:
					case SEP:
					case SEPARATE:
					case SEQ:
					case SEQUENCE:
					case SHORT:
					case SIZE:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SS:
					case SSR:
					case SSRANGE:
					case STD:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TITLE:
					case TRIG:
					case TRUNC:
					case UE:
					case UPPER:
					case VBREF:
					case WD:
					case XMLPARSE:
					case XMLSS:
					case XOPTS:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case E_CHAR:
					case F_CHAR:
					case H_CHAR:
					case I_CHAR:
					case M_CHAR:
					case N_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case U_CHAR:
					case W_CHAR:
					case X_CHAR:
					case COMMACHAR:
					case DOT:
					case NONNUMERICLITERAL:
					case NUMERICLITERAL:
					case IDENTIFIER:
					case FILENAME:
					case PSEUDOTEXTIDENTIFIER:
					case NEWLINE:
					case TEXT:
						{
						setState(540);
						charData();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(546);
				replaceOffStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceByStatementContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(CobolPreprocessorParser.REPLACE, 0); }
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public List<ReplaceClauseContext> replaceClause() {
			return getRuleContexts(ReplaceClauseContext.class);
		}
		public ReplaceClauseContext replaceClause(int i) {
			return getRuleContext(ReplaceClauseContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public ReplaceByStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceByStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterReplaceByStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitReplaceByStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitReplaceByStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceByStatementContext replaceByStatement() throws RecognitionException {
		ReplaceByStatementContext _localctx = new ReplaceByStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_replaceByStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(REPLACE);
			setState(557); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(550);
						match(NEWLINE);
						}
						}
						setState(555);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(556);
					replaceClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(559); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(561);
				match(NEWLINE);
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceOffStatementContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(CobolPreprocessorParser.REPLACE, 0); }
		public TerminalNode OFF() { return getToken(CobolPreprocessorParser.OFF, 0); }
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public ReplaceOffStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceOffStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterReplaceOffStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitReplaceOffStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitReplaceOffStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceOffStatementContext replaceOffStatement() throws RecognitionException {
		ReplaceOffStatementContext _localctx = new ReplaceOffStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_replaceOffStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(REPLACE);
			setState(570);
			match(OFF);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(571);
				match(NEWLINE);
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceClauseContext extends ParserRuleContext {
		public ReplaceableContext replaceable() {
			return getRuleContext(ReplaceableContext.class,0);
		}
		public TerminalNode BY() { return getToken(CobolPreprocessorParser.BY, 0); }
		public ReplacementContext replacement() {
			return getRuleContext(ReplacementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public DirectoryPhraseContext directoryPhrase() {
			return getRuleContext(DirectoryPhraseContext.class,0);
		}
		public FamilyPhraseContext familyPhrase() {
			return getRuleContext(FamilyPhraseContext.class,0);
		}
		public ReplaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterReplaceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitReplaceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitReplaceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceClauseContext replaceClause() throws RecognitionException {
		ReplaceClauseContext _localctx = new ReplaceClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_replaceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			replaceable();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(580);
				match(NEWLINE);
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			match(BY);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(587);
				match(NEWLINE);
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			replacement();
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(594);
					match(NEWLINE);
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(600);
				directoryPhrase();
				}
				break;
			}
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(603);
					match(NEWLINE);
					}
					}
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(609);
				familyPhrase();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectoryPhraseContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(CobolPreprocessorParser.OF, 0); }
		public TerminalNode IN() { return getToken(CobolPreprocessorParser.IN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public DirectoryPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterDirectoryPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitDirectoryPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitDirectoryPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectoryPhraseContext directoryPhrase() throws RecognitionException {
		DirectoryPhraseContext _localctx = new DirectoryPhraseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_directoryPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(613);
				match(NEWLINE);
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(619);
				literal();
				}
				break;
			case ADATA:
			case ADV:
			case ALIAS:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARITH:
			case AUTO:
			case AWO:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBL:
			case CBLCARD:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case CP:
			case CPP:
			case CPSM:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DECK:
			case DIAGTRUNC:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DTR:
			case DU:
			case DUMP:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENGLISH:
			case EPILOG:
			case EXCI:
			case EXIT:
			case EXP:
			case EXPORTALL:
			case EXTEND:
			case FASTSRT:
			case FLAG:
			case FLAGSTD:
			case FSRT:
			case FULL:
			case GDS:
			case GRAPHIC:
			case HOOK:
			case IN:
			case INTDATE:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LC:
			case LENGTH:
			case LIB:
			case LILIAN:
			case LIN:
			case LINECOUNT:
			case LINKAGE:
			case LIST:
			case LM:
			case LONGMIXED:
			case LONGUPPER:
			case LU:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOAWO:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCPSM:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODIAGTRUNC:
			case NODLL:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOEPILOG:
			case NOEXIT:
			case NOEXP:
			case NOEXPORTALL:
			case NOF:
			case NOFASTSRT:
			case NOFEPI:
			case NOFLAG:
			case NOFLAGMIG:
			case NOFLAGSTD:
			case NOFSRT:
			case NOGRAPHIC:
			case NOHOOK:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOFF:
			case NOOFFSET:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPFD:
			case NOPROLOG:
			case NORENT:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOVBREF:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PROCESS:
			case PROLOG:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SHORT:
			case SIZE:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SS:
			case SSR:
			case SSRANGE:
			case STD:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRIG:
			case TRUNC:
			case UE:
			case UPPER:
			case VBREF:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
				{
				setState(620);
				cobolWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FamilyPhraseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CobolPreprocessorParser.ON, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public FamilyPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_familyPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterFamilyPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitFamilyPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitFamilyPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FamilyPhraseContext familyPhrase() throws RecognitionException {
		FamilyPhraseContext _localctx = new FamilyPhraseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_familyPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(ON);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(624);
				match(NEWLINE);
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(630);
				literal();
				}
				break;
			case ADATA:
			case ADV:
			case ALIAS:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARITH:
			case AUTO:
			case AWO:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBL:
			case CBLCARD:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case CP:
			case CPP:
			case CPSM:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DECK:
			case DIAGTRUNC:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DTR:
			case DU:
			case DUMP:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENGLISH:
			case EPILOG:
			case EXCI:
			case EXIT:
			case EXP:
			case EXPORTALL:
			case EXTEND:
			case FASTSRT:
			case FLAG:
			case FLAGSTD:
			case FSRT:
			case FULL:
			case GDS:
			case GRAPHIC:
			case HOOK:
			case IN:
			case INTDATE:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LC:
			case LENGTH:
			case LIB:
			case LILIAN:
			case LIN:
			case LINECOUNT:
			case LINKAGE:
			case LIST:
			case LM:
			case LONGMIXED:
			case LONGUPPER:
			case LU:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOAWO:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCPSM:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODIAGTRUNC:
			case NODLL:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOEPILOG:
			case NOEXIT:
			case NOEXP:
			case NOEXPORTALL:
			case NOF:
			case NOFASTSRT:
			case NOFEPI:
			case NOFLAG:
			case NOFLAGMIG:
			case NOFLAGSTD:
			case NOFSRT:
			case NOGRAPHIC:
			case NOHOOK:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOFF:
			case NOOFFSET:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPFD:
			case NOPROLOG:
			case NORENT:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOVBREF:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PROCESS:
			case PROLOG:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SHORT:
			case SIZE:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SS:
			case SSR:
			case SSRANGE:
			case STD:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRIG:
			case TRUNC:
			case UE:
			case UPPER:
			case VBREF:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
				{
				setState(631);
				cobolWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceableContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public PseudoTextContext pseudoText() {
			return getRuleContext(PseudoTextContext.class,0);
		}
		public CharDataLineContext charDataLine() {
			return getRuleContext(CharDataLineContext.class,0);
		}
		public ReplaceableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterReplaceable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitReplaceable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitReplaceable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceableContext replaceable() throws RecognitionException {
		ReplaceableContext _localctx = new ReplaceableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_replaceable);
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				charDataLine();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplacementContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public PseudoTextContext pseudoText() {
			return getRuleContext(PseudoTextContext.class,0);
		}
		public CharDataLineContext charDataLine() {
			return getRuleContext(CharDataLineContext.class,0);
		}
		public ReplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterReplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitReplacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitReplacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplacementContext replacement() throws RecognitionException {
		ReplacementContext _localctx = new ReplacementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_replacement);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				charDataLine();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EjectStatementContext extends ParserRuleContext {
		public TerminalNode EJECT() { return getToken(CobolPreprocessorParser.EJECT, 0); }
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public EjectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ejectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterEjectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitEjectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitEjectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EjectStatementContext ejectStatement() throws RecognitionException {
		EjectStatementContext _localctx = new EjectStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ejectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(EJECT);
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(647);
				match(DOT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipStatementContext extends ParserRuleContext {
		public TerminalNode SKIP1() { return getToken(CobolPreprocessorParser.SKIP1, 0); }
		public TerminalNode SKIP2() { return getToken(CobolPreprocessorParser.SKIP2, 0); }
		public TerminalNode SKIP3() { return getToken(CobolPreprocessorParser.SKIP3, 0); }
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public SkipStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterSkipStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitSkipStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitSkipStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipStatementContext skipStatement() throws RecognitionException {
		SkipStatementContext _localctx = new SkipStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_skipStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_la = _input.LA(1);
			if ( !(((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SKIP1 - 256)) | (1L << (SKIP2 - 256)) | (1L << (SKIP3 - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(651);
				match(DOT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleStatementContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(CobolPreprocessorParser.TITLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public TitleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterTitleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitTitleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitTitleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleStatementContext titleStatement() throws RecognitionException {
		TitleStatementContext _localctx = new TitleStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_titleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(TITLE);
			setState(655);
			literal();
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(656);
				match(DOT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoTextContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLEEQUALCHAR() { return getTokens(CobolPreprocessorParser.DOUBLEEQUALCHAR); }
		public TerminalNode DOUBLEEQUALCHAR(int i) {
			return getToken(CobolPreprocessorParser.DOUBLEEQUALCHAR, i);
		}
		public CharDataContext charData() {
			return getRuleContext(CharDataContext.class,0);
		}
		public PseudoTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterPseudoText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitPseudoText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitPseudoText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoTextContext pseudoText() throws RecognitionException {
		PseudoTextContext _localctx = new PseudoTextContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pseudoText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(DOUBLEEQUALCHAR);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << ALIAS) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << CP) | (1L << CPP) | (1L << CPSM) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DECK) | (1L << DIAGTRUNC) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DTR) | (1L << DU) | (1L << DUMP) | (1L << DYN) | (1L << DYNAM) | (1L << EDF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HOOK - 64)) | (1L << (IN - 64)) | (1L << (INTDATE - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)) | (1L << (LPARENCHAR - 64)) | (1L << (LU - 64)) | (1L << (MAP - 64)) | (1L << (MARGINS - 64)) | (1L << (MAX - 64)) | (1L << (MD - 64)) | (1L << (MDECK - 64)) | (1L << (MIG - 64)) | (1L << (MIXED - 64)) | (1L << (NAME - 64)) | (1L << (NAT - 64)) | (1L << (NATIONAL - 64)) | (1L << (NATLANG - 64)) | (1L << (NN - 64)) | (1L << (NO - 64)) | (1L << (NOADATA - 64)) | (1L << (NOADV - 64)) | (1L << (NOALIAS - 64)) | (1L << (NOAWO - 64)) | (1L << (NOBLOCK0 - 64)) | (1L << (NOC - 64)) | (1L << (NOCBLCARD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEXIT - 128)) | (1L << (NOEXP - 128)) | (1L << (NOEXPORTALL - 128)) | (1L << (NOF - 128)) | (1L << (NOFASTSRT - 128)) | (1L << (NOFEPI - 128)) | (1L << (NOFLAG - 128)) | (1L << (NOFLAGMIG - 128)) | (1L << (NOFLAGSTD - 128)) | (1L << (NOFSRT - 128)) | (1L << (NOGRAPHIC - 128)) | (1L << (NOHOOK - 128)) | (1L << (NOLENGTH - 128)) | (1L << (NOLIB - 128)) | (1L << (NOLINKAGE - 128)) | (1L << (NOLIST - 128)) | (1L << (NOMAP - 128)) | (1L << (NOMD - 128)) | (1L << (NOMDECK - 128)) | (1L << (NONAME - 128)) | (1L << (NONUM - 128)) | (1L << (NONUMBER - 128)) | (1L << (NOOBJ - 128)) | (1L << (NOOBJECT - 128)) | (1L << (NOOFF - 128)) | (1L << (NOOFFSET - 128)) | (1L << (NOOPSEQUENCE - 128)) | (1L << (NOOPT - 128)) | (1L << (NOOPTIMIZE - 128)) | (1L << (NOOPTIONS - 128)) | (1L << (NOP - 128)) | (1L << (NOPFD - 128)) | (1L << (NOPROLOG - 128)) | (1L << (NORENT - 128)) | (1L << (NOS - 128)) | (1L << (NOSEP - 128)) | (1L << (NOSEPARATE - 128)) | (1L << (NOSEQ - 128)) | (1L << (NOSOURCE - 128)) | (1L << (NOSPIE - 128)) | (1L << (NOSQL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)) | (1L << (NOSTDTRUNC - 192)) | (1L << (NOSEQUENCE - 192)) | (1L << (NOTERM - 192)) | (1L << (NOTERMINAL - 192)) | (1L << (NOTEST - 192)) | (1L << (NOTHREAD - 192)) | (1L << (NOTRIG - 192)) | (1L << (NOVBREF - 192)) | (1L << (NOWORD - 192)) | (1L << (NOX - 192)) | (1L << (NOXREF - 192)) | (1L << (NOZWB - 192)) | (1L << (NS - 192)) | (1L << (NSEQ - 192)) | (1L << (NSYMBOL - 192)) | (1L << (NUM - 192)) | (1L << (NUMBER - 192)) | (1L << (NUMPROC - 192)) | (1L << (OBJ - 192)) | (1L << (OBJECT - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OFFSET - 192)) | (1L << (ON - 192)) | (1L << (OP - 192)) | (1L << (OPMARGINS - 192)) | (1L << (OPSEQUENCE - 192)) | (1L << (OPT - 192)) | (1L << (OPTFILE - 192)) | (1L << (OPTIMIZE - 192)) | (1L << (OPTIONS - 192)) | (1L << (OUT - 192)) | (1L << (OUTDD - 192)) | (1L << (PFD - 192)) | (1L << (PPTDBG - 192)) | (1L << (PGMN - 192)) | (1L << (PGMNAME - 192)) | (1L << (PROCESS - 192)) | (1L << (PROLOG - 192)) | (1L << (QUOTE - 192)) | (1L << (RENT - 192)) | (1L << (REPLACING - 192)) | (1L << (RMODE - 192)) | (1L << (RPARENCHAR - 192)) | (1L << (SEP - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQ - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SHORT - 192)) | (1L << (SIZE - 192)) | (1L << (SOURCE - 192)) | (1L << (SP - 192)) | (1L << (SPACE - 192)) | (1L << (SPIE - 192)) | (1L << (SQL - 192)) | (1L << (SQLC - 192)) | (1L << (SQLCCSID - 192)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (SS - 259)) | (1L << (SSR - 259)) | (1L << (SSRANGE - 259)) | (1L << (STD - 259)) | (1L << (SYSEIB - 259)) | (1L << (SZ - 259)) | (1L << (TERM - 259)) | (1L << (TERMINAL - 259)) | (1L << (TEST - 259)) | (1L << (THREAD - 259)) | (1L << (TITLE - 259)) | (1L << (TRIG - 259)) | (1L << (TRUNC - 259)) | (1L << (UE - 259)) | (1L << (UPPER - 259)) | (1L << (VBREF - 259)) | (1L << (WD - 259)) | (1L << (XMLPARSE - 259)) | (1L << (XMLSS - 259)) | (1L << (XOPTS - 259)) | (1L << (XREF - 259)) | (1L << (YEARWINDOW - 259)) | (1L << (YW - 259)) | (1L << (ZWB - 259)) | (1L << (C_CHAR - 259)) | (1L << (D_CHAR - 259)) | (1L << (E_CHAR - 259)) | (1L << (F_CHAR - 259)) | (1L << (H_CHAR - 259)) | (1L << (I_CHAR - 259)) | (1L << (M_CHAR - 259)) | (1L << (N_CHAR - 259)) | (1L << (Q_CHAR - 259)) | (1L << (S_CHAR - 259)) | (1L << (U_CHAR - 259)) | (1L << (W_CHAR - 259)) | (1L << (X_CHAR - 259)) | (1L << (COMMACHAR - 259)) | (1L << (DOT - 259)) | (1L << (NONNUMERICLITERAL - 259)) | (1L << (NUMERICLITERAL - 259)) | (1L << (IDENTIFIER - 259)) | (1L << (FILENAME - 259)) | (1L << (PSEUDOTEXTIDENTIFIER - 259)) | (1L << (NEWLINE - 259)) | (1L << (TEXT - 259)))) != 0)) {
				{
				setState(660);
				charData();
				}
			}

			setState(663);
			match(DOUBLEEQUALCHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharDataContext extends ParserRuleContext {
		public List<CharDataLineContext> charDataLine() {
			return getRuleContexts(CharDataLineContext.class);
		}
		public CharDataLineContext charDataLine(int i) {
			return getRuleContext(CharDataLineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public CharDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCharData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCharData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCharData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataContext charData() throws RecognitionException {
		CharDataContext _localctx = new CharDataContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_charData);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(667); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(667);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADATA:
					case ADV:
					case ALIAS:
					case ANSI:
					case ANY:
					case APOST:
					case AR:
					case ARITH:
					case AUTO:
					case AWO:
					case BIN:
					case BLOCK0:
					case BUF:
					case BUFSIZE:
					case BY:
					case CBL:
					case CBLCARD:
					case CO:
					case COBOL2:
					case COBOL3:
					case CODEPAGE:
					case COMPAT:
					case COMPILE:
					case CP:
					case CPP:
					case CPSM:
					case CS:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DD:
					case DEBUG:
					case DECK:
					case DIAGTRUNC:
					case DIVISION:
					case DLI:
					case DLL:
					case DP:
					case DTR:
					case DU:
					case DUMP:
					case DYN:
					case DYNAM:
					case EDF:
					case EJECT:
					case EJPD:
					case EN:
					case ENGLISH:
					case EPILOG:
					case EXCI:
					case EXIT:
					case EXP:
					case EXPORTALL:
					case EXTEND:
					case FASTSRT:
					case FLAG:
					case FLAGSTD:
					case FSRT:
					case FULL:
					case GDS:
					case GRAPHIC:
					case HOOK:
					case IN:
					case INTDATE:
					case JA:
					case JP:
					case KA:
					case LANG:
					case LANGUAGE:
					case LC:
					case LENGTH:
					case LIB:
					case LILIAN:
					case LIN:
					case LINECOUNT:
					case LINKAGE:
					case LIST:
					case LM:
					case LONGMIXED:
					case LONGUPPER:
					case LPARENCHAR:
					case LU:
					case MAP:
					case MARGINS:
					case MAX:
					case MD:
					case MDECK:
					case MIG:
					case MIXED:
					case NAME:
					case NAT:
					case NATIONAL:
					case NATLANG:
					case NN:
					case NO:
					case NOADATA:
					case NOADV:
					case NOALIAS:
					case NOAWO:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCPSM:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODIAGTRUNC:
					case NODLL:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODYN:
					case NODYNAM:
					case NOEDF:
					case NOEJPD:
					case NOEPILOG:
					case NOEXIT:
					case NOEXP:
					case NOEXPORTALL:
					case NOF:
					case NOFASTSRT:
					case NOFEPI:
					case NOFLAG:
					case NOFLAGMIG:
					case NOFLAGSTD:
					case NOFSRT:
					case NOGRAPHIC:
					case NOHOOK:
					case NOLENGTH:
					case NOLIB:
					case NOLINKAGE:
					case NOLIST:
					case NOMAP:
					case NOMD:
					case NOMDECK:
					case NONAME:
					case NONUM:
					case NONUMBER:
					case NOOBJ:
					case NOOBJECT:
					case NOOFF:
					case NOOFFSET:
					case NOOPSEQUENCE:
					case NOOPT:
					case NOOPTIMIZE:
					case NOOPTIONS:
					case NOP:
					case NOPFD:
					case NOPROLOG:
					case NORENT:
					case NOS:
					case NOSEP:
					case NOSEPARATE:
					case NOSEQ:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOTRIG:
					case NOVBREF:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMPROC:
					case OBJ:
					case OBJECT:
					case OF:
					case OFF:
					case OFFSET:
					case ON:
					case OP:
					case OPMARGINS:
					case OPSEQUENCE:
					case OPT:
					case OPTFILE:
					case OPTIMIZE:
					case OPTIONS:
					case OUT:
					case OUTDD:
					case PFD:
					case PPTDBG:
					case PGMN:
					case PGMNAME:
					case PROCESS:
					case PROLOG:
					case QUOTE:
					case RENT:
					case REPLACING:
					case RMODE:
					case RPARENCHAR:
					case SEP:
					case SEPARATE:
					case SEQ:
					case SEQUENCE:
					case SHORT:
					case SIZE:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SS:
					case SSR:
					case SSRANGE:
					case STD:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TITLE:
					case TRIG:
					case TRUNC:
					case UE:
					case UPPER:
					case VBREF:
					case WD:
					case XMLPARSE:
					case XMLSS:
					case XOPTS:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case E_CHAR:
					case F_CHAR:
					case H_CHAR:
					case I_CHAR:
					case M_CHAR:
					case N_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case U_CHAR:
					case W_CHAR:
					case X_CHAR:
					case COMMACHAR:
					case DOT:
					case NONNUMERICLITERAL:
					case NUMERICLITERAL:
					case IDENTIFIER:
					case FILENAME:
					case PSEUDOTEXTIDENTIFIER:
					case TEXT:
						{
						setState(665);
						charDataLine();
						}
						break;
					case NEWLINE:
						{
						setState(666);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(669); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharDataSqlContext extends ParserRuleContext {
		public List<CharDataLineContext> charDataLine() {
			return getRuleContexts(CharDataLineContext.class);
		}
		public CharDataLineContext charDataLine(int i) {
			return getRuleContext(CharDataLineContext.class,i);
		}
		public List<TerminalNode> COPY() { return getTokens(CobolPreprocessorParser.COPY); }
		public TerminalNode COPY(int i) {
			return getToken(CobolPreprocessorParser.COPY, i);
		}
		public List<TerminalNode> REPLACE() { return getTokens(CobolPreprocessorParser.REPLACE); }
		public TerminalNode REPLACE(int i) {
			return getToken(CobolPreprocessorParser.REPLACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public CharDataSqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDataSql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCharDataSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCharDataSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCharDataSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataSqlContext charDataSql() throws RecognitionException {
		CharDataSqlContext _localctx = new CharDataSqlContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_charDataSql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(675);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADATA:
				case ADV:
				case ALIAS:
				case ANSI:
				case ANY:
				case APOST:
				case AR:
				case ARITH:
				case AUTO:
				case AWO:
				case BIN:
				case BLOCK0:
				case BUF:
				case BUFSIZE:
				case BY:
				case CBL:
				case CBLCARD:
				case CO:
				case COBOL2:
				case COBOL3:
				case CODEPAGE:
				case COMPAT:
				case COMPILE:
				case CP:
				case CPP:
				case CPSM:
				case CS:
				case CURR:
				case CURRENCY:
				case DATA:
				case DATEPROC:
				case DBCS:
				case DD:
				case DEBUG:
				case DECK:
				case DIAGTRUNC:
				case DIVISION:
				case DLI:
				case DLL:
				case DP:
				case DTR:
				case DU:
				case DUMP:
				case DYN:
				case DYNAM:
				case EDF:
				case EJECT:
				case EJPD:
				case EN:
				case ENGLISH:
				case EPILOG:
				case EXCI:
				case EXIT:
				case EXP:
				case EXPORTALL:
				case EXTEND:
				case FASTSRT:
				case FLAG:
				case FLAGSTD:
				case FSRT:
				case FULL:
				case GDS:
				case GRAPHIC:
				case HOOK:
				case IN:
				case INTDATE:
				case JA:
				case JP:
				case KA:
				case LANG:
				case LANGUAGE:
				case LC:
				case LENGTH:
				case LIB:
				case LILIAN:
				case LIN:
				case LINECOUNT:
				case LINKAGE:
				case LIST:
				case LM:
				case LONGMIXED:
				case LONGUPPER:
				case LPARENCHAR:
				case LU:
				case MAP:
				case MARGINS:
				case MAX:
				case MD:
				case MDECK:
				case MIG:
				case MIXED:
				case NAME:
				case NAT:
				case NATIONAL:
				case NATLANG:
				case NN:
				case NO:
				case NOADATA:
				case NOADV:
				case NOALIAS:
				case NOAWO:
				case NOBLOCK0:
				case NOC:
				case NOCBLCARD:
				case NOCICS:
				case NOCMPR2:
				case NOCOMPILE:
				case NOCPSM:
				case NOCURR:
				case NOCURRENCY:
				case NOD:
				case NODATEPROC:
				case NODBCS:
				case NODE:
				case NODEBUG:
				case NODECK:
				case NODIAGTRUNC:
				case NODLL:
				case NODU:
				case NODUMP:
				case NODP:
				case NODTR:
				case NODYN:
				case NODYNAM:
				case NOEDF:
				case NOEJPD:
				case NOEPILOG:
				case NOEXIT:
				case NOEXP:
				case NOEXPORTALL:
				case NOF:
				case NOFASTSRT:
				case NOFEPI:
				case NOFLAG:
				case NOFLAGMIG:
				case NOFLAGSTD:
				case NOFSRT:
				case NOGRAPHIC:
				case NOHOOK:
				case NOLENGTH:
				case NOLIB:
				case NOLINKAGE:
				case NOLIST:
				case NOMAP:
				case NOMD:
				case NOMDECK:
				case NONAME:
				case NONUM:
				case NONUMBER:
				case NOOBJ:
				case NOOBJECT:
				case NOOFF:
				case NOOFFSET:
				case NOOPSEQUENCE:
				case NOOPT:
				case NOOPTIMIZE:
				case NOOPTIONS:
				case NOP:
				case NOPFD:
				case NOPROLOG:
				case NORENT:
				case NOS:
				case NOSEP:
				case NOSEPARATE:
				case NOSEQ:
				case NOSOURCE:
				case NOSPIE:
				case NOSQL:
				case NOSQLC:
				case NOSQLCCSID:
				case NOSSR:
				case NOSSRANGE:
				case NOSTDTRUNC:
				case NOSEQUENCE:
				case NOTERM:
				case NOTERMINAL:
				case NOTEST:
				case NOTHREAD:
				case NOTRIG:
				case NOVBREF:
				case NOWORD:
				case NOX:
				case NOXREF:
				case NOZWB:
				case NS:
				case NSEQ:
				case NSYMBOL:
				case NUM:
				case NUMBER:
				case NUMPROC:
				case OBJ:
				case OBJECT:
				case OF:
				case OFF:
				case OFFSET:
				case ON:
				case OP:
				case OPMARGINS:
				case OPSEQUENCE:
				case OPT:
				case OPTFILE:
				case OPTIMIZE:
				case OPTIONS:
				case OUT:
				case OUTDD:
				case PFD:
				case PPTDBG:
				case PGMN:
				case PGMNAME:
				case PROCESS:
				case PROLOG:
				case QUOTE:
				case RENT:
				case REPLACING:
				case RMODE:
				case RPARENCHAR:
				case SEP:
				case SEPARATE:
				case SEQ:
				case SEQUENCE:
				case SHORT:
				case SIZE:
				case SOURCE:
				case SP:
				case SPACE:
				case SPIE:
				case SQL:
				case SQLC:
				case SQLCCSID:
				case SS:
				case SSR:
				case SSRANGE:
				case STD:
				case SYSEIB:
				case SZ:
				case TERM:
				case TERMINAL:
				case TEST:
				case THREAD:
				case TITLE:
				case TRIG:
				case TRUNC:
				case UE:
				case UPPER:
				case VBREF:
				case WD:
				case XMLPARSE:
				case XMLSS:
				case XOPTS:
				case XREF:
				case YEARWINDOW:
				case YW:
				case ZWB:
				case C_CHAR:
				case D_CHAR:
				case E_CHAR:
				case F_CHAR:
				case H_CHAR:
				case I_CHAR:
				case M_CHAR:
				case N_CHAR:
				case Q_CHAR:
				case S_CHAR:
				case U_CHAR:
				case W_CHAR:
				case X_CHAR:
				case COMMACHAR:
				case DOT:
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
				case IDENTIFIER:
				case FILENAME:
				case PSEUDOTEXTIDENTIFIER:
				case TEXT:
					{
					setState(671);
					charDataLine();
					}
					break;
				case COPY:
					{
					setState(672);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(673);
					match(REPLACE);
					}
					break;
				case NEWLINE:
					{
					setState(674);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(677); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << ALIAS) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << CP) | (1L << CPP) | (1L << CPSM) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DECK) | (1L << DIAGTRUNC) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DTR) | (1L << DU) | (1L << DUMP) | (1L << DYN) | (1L << DYNAM) | (1L << EDF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HOOK - 64)) | (1L << (IN - 64)) | (1L << (INTDATE - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)) | (1L << (LPARENCHAR - 64)) | (1L << (LU - 64)) | (1L << (MAP - 64)) | (1L << (MARGINS - 64)) | (1L << (MAX - 64)) | (1L << (MD - 64)) | (1L << (MDECK - 64)) | (1L << (MIG - 64)) | (1L << (MIXED - 64)) | (1L << (NAME - 64)) | (1L << (NAT - 64)) | (1L << (NATIONAL - 64)) | (1L << (NATLANG - 64)) | (1L << (NN - 64)) | (1L << (NO - 64)) | (1L << (NOADATA - 64)) | (1L << (NOADV - 64)) | (1L << (NOALIAS - 64)) | (1L << (NOAWO - 64)) | (1L << (NOBLOCK0 - 64)) | (1L << (NOC - 64)) | (1L << (NOCBLCARD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEXIT - 128)) | (1L << (NOEXP - 128)) | (1L << (NOEXPORTALL - 128)) | (1L << (NOF - 128)) | (1L << (NOFASTSRT - 128)) | (1L << (NOFEPI - 128)) | (1L << (NOFLAG - 128)) | (1L << (NOFLAGMIG - 128)) | (1L << (NOFLAGSTD - 128)) | (1L << (NOFSRT - 128)) | (1L << (NOGRAPHIC - 128)) | (1L << (NOHOOK - 128)) | (1L << (NOLENGTH - 128)) | (1L << (NOLIB - 128)) | (1L << (NOLINKAGE - 128)) | (1L << (NOLIST - 128)) | (1L << (NOMAP - 128)) | (1L << (NOMD - 128)) | (1L << (NOMDECK - 128)) | (1L << (NONAME - 128)) | (1L << (NONUM - 128)) | (1L << (NONUMBER - 128)) | (1L << (NOOBJ - 128)) | (1L << (NOOBJECT - 128)) | (1L << (NOOFF - 128)) | (1L << (NOOFFSET - 128)) | (1L << (NOOPSEQUENCE - 128)) | (1L << (NOOPT - 128)) | (1L << (NOOPTIMIZE - 128)) | (1L << (NOOPTIONS - 128)) | (1L << (NOP - 128)) | (1L << (NOPFD - 128)) | (1L << (NOPROLOG - 128)) | (1L << (NORENT - 128)) | (1L << (NOS - 128)) | (1L << (NOSEP - 128)) | (1L << (NOSEPARATE - 128)) | (1L << (NOSEQ - 128)) | (1L << (NOSOURCE - 128)) | (1L << (NOSPIE - 128)) | (1L << (NOSQL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)) | (1L << (NOSTDTRUNC - 192)) | (1L << (NOSEQUENCE - 192)) | (1L << (NOTERM - 192)) | (1L << (NOTERMINAL - 192)) | (1L << (NOTEST - 192)) | (1L << (NOTHREAD - 192)) | (1L << (NOTRIG - 192)) | (1L << (NOVBREF - 192)) | (1L << (NOWORD - 192)) | (1L << (NOX - 192)) | (1L << (NOXREF - 192)) | (1L << (NOZWB - 192)) | (1L << (NS - 192)) | (1L << (NSEQ - 192)) | (1L << (NSYMBOL - 192)) | (1L << (NUM - 192)) | (1L << (NUMBER - 192)) | (1L << (NUMPROC - 192)) | (1L << (OBJ - 192)) | (1L << (OBJECT - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OFFSET - 192)) | (1L << (ON - 192)) | (1L << (OP - 192)) | (1L << (OPMARGINS - 192)) | (1L << (OPSEQUENCE - 192)) | (1L << (OPT - 192)) | (1L << (OPTFILE - 192)) | (1L << (OPTIMIZE - 192)) | (1L << (OPTIONS - 192)) | (1L << (OUT - 192)) | (1L << (OUTDD - 192)) | (1L << (PFD - 192)) | (1L << (PPTDBG - 192)) | (1L << (PGMN - 192)) | (1L << (PGMNAME - 192)) | (1L << (PROCESS - 192)) | (1L << (PROLOG - 192)) | (1L << (QUOTE - 192)) | (1L << (RENT - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (RMODE - 192)) | (1L << (RPARENCHAR - 192)) | (1L << (SEP - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQ - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SHORT - 192)) | (1L << (SIZE - 192)) | (1L << (SOURCE - 192)) | (1L << (SP - 192)) | (1L << (SPACE - 192)) | (1L << (SPIE - 192)) | (1L << (SQL - 192)) | (1L << (SQLC - 192)) | (1L << (SQLCCSID - 192)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (SS - 259)) | (1L << (SSR - 259)) | (1L << (SSRANGE - 259)) | (1L << (STD - 259)) | (1L << (SYSEIB - 259)) | (1L << (SZ - 259)) | (1L << (TERM - 259)) | (1L << (TERMINAL - 259)) | (1L << (TEST - 259)) | (1L << (THREAD - 259)) | (1L << (TITLE - 259)) | (1L << (TRIG - 259)) | (1L << (TRUNC - 259)) | (1L << (UE - 259)) | (1L << (UPPER - 259)) | (1L << (VBREF - 259)) | (1L << (WD - 259)) | (1L << (XMLPARSE - 259)) | (1L << (XMLSS - 259)) | (1L << (XOPTS - 259)) | (1L << (XREF - 259)) | (1L << (YEARWINDOW - 259)) | (1L << (YW - 259)) | (1L << (ZWB - 259)) | (1L << (C_CHAR - 259)) | (1L << (D_CHAR - 259)) | (1L << (E_CHAR - 259)) | (1L << (F_CHAR - 259)) | (1L << (H_CHAR - 259)) | (1L << (I_CHAR - 259)) | (1L << (M_CHAR - 259)) | (1L << (N_CHAR - 259)) | (1L << (Q_CHAR - 259)) | (1L << (S_CHAR - 259)) | (1L << (U_CHAR - 259)) | (1L << (W_CHAR - 259)) | (1L << (X_CHAR - 259)) | (1L << (COMMACHAR - 259)) | (1L << (DOT - 259)) | (1L << (NONNUMERICLITERAL - 259)) | (1L << (NUMERICLITERAL - 259)) | (1L << (IDENTIFIER - 259)) | (1L << (FILENAME - 259)) | (1L << (PSEUDOTEXTIDENTIFIER - 259)) | (1L << (NEWLINE - 259)) | (1L << (TEXT - 259)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharDataLineContext extends ParserRuleContext {
		public List<CobolWordContext> cobolWord() {
			return getRuleContexts(CobolWordContext.class);
		}
		public CobolWordContext cobolWord(int i) {
			return getRuleContext(CobolWordContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<FilenameContext> filename() {
			return getRuleContexts(FilenameContext.class);
		}
		public FilenameContext filename(int i) {
			return getRuleContext(FilenameContext.class,i);
		}
		public List<TerminalNode> PSEUDOTEXTIDENTIFIER() { return getTokens(CobolPreprocessorParser.PSEUDOTEXTIDENTIFIER); }
		public TerminalNode PSEUDOTEXTIDENTIFIER(int i) {
			return getToken(CobolPreprocessorParser.PSEUDOTEXTIDENTIFIER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(CobolPreprocessorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CobolPreprocessorParser.TEXT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CobolPreprocessorParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CobolPreprocessorParser.DOT, i);
		}
		public List<TerminalNode> LPARENCHAR() { return getTokens(CobolPreprocessorParser.LPARENCHAR); }
		public TerminalNode LPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.LPARENCHAR, i);
		}
		public List<TerminalNode> RPARENCHAR() { return getTokens(CobolPreprocessorParser.RPARENCHAR); }
		public TerminalNode RPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.RPARENCHAR, i);
		}
		public CharDataLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDataLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCharDataLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCharDataLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCharDataLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataLineContext charDataLine() throws RecognitionException {
		CharDataLineContext _localctx = new CharDataLineContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_charDataLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(687); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(687);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADATA:
					case ADV:
					case ALIAS:
					case ANSI:
					case ANY:
					case APOST:
					case AR:
					case ARITH:
					case AUTO:
					case AWO:
					case BIN:
					case BLOCK0:
					case BUF:
					case BUFSIZE:
					case BY:
					case CBL:
					case CBLCARD:
					case CO:
					case COBOL2:
					case COBOL3:
					case CODEPAGE:
					case COMPAT:
					case COMPILE:
					case CP:
					case CPP:
					case CPSM:
					case CS:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DD:
					case DEBUG:
					case DECK:
					case DIAGTRUNC:
					case DIVISION:
					case DLI:
					case DLL:
					case DP:
					case DTR:
					case DU:
					case DUMP:
					case DYN:
					case DYNAM:
					case EDF:
					case EJECT:
					case EJPD:
					case EN:
					case ENGLISH:
					case EPILOG:
					case EXCI:
					case EXIT:
					case EXP:
					case EXPORTALL:
					case EXTEND:
					case FASTSRT:
					case FLAG:
					case FLAGSTD:
					case FSRT:
					case FULL:
					case GDS:
					case GRAPHIC:
					case HOOK:
					case IN:
					case INTDATE:
					case JA:
					case JP:
					case KA:
					case LANG:
					case LANGUAGE:
					case LC:
					case LENGTH:
					case LIB:
					case LILIAN:
					case LIN:
					case LINECOUNT:
					case LINKAGE:
					case LIST:
					case LM:
					case LONGMIXED:
					case LONGUPPER:
					case LU:
					case MAP:
					case MARGINS:
					case MAX:
					case MD:
					case MDECK:
					case MIG:
					case MIXED:
					case NAME:
					case NAT:
					case NATIONAL:
					case NATLANG:
					case NN:
					case NO:
					case NOADATA:
					case NOADV:
					case NOALIAS:
					case NOAWO:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCPSM:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODIAGTRUNC:
					case NODLL:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODYN:
					case NODYNAM:
					case NOEDF:
					case NOEJPD:
					case NOEPILOG:
					case NOEXIT:
					case NOEXP:
					case NOEXPORTALL:
					case NOF:
					case NOFASTSRT:
					case NOFEPI:
					case NOFLAG:
					case NOFLAGMIG:
					case NOFLAGSTD:
					case NOFSRT:
					case NOGRAPHIC:
					case NOHOOK:
					case NOLENGTH:
					case NOLIB:
					case NOLINKAGE:
					case NOLIST:
					case NOMAP:
					case NOMD:
					case NOMDECK:
					case NONAME:
					case NONUM:
					case NONUMBER:
					case NOOBJ:
					case NOOBJECT:
					case NOOFF:
					case NOOFFSET:
					case NOOPSEQUENCE:
					case NOOPT:
					case NOOPTIMIZE:
					case NOOPTIONS:
					case NOP:
					case NOPFD:
					case NOPROLOG:
					case NORENT:
					case NOS:
					case NOSEP:
					case NOSEPARATE:
					case NOSEQ:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOTRIG:
					case NOVBREF:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMPROC:
					case OBJ:
					case OBJECT:
					case OF:
					case OFF:
					case OFFSET:
					case ON:
					case OP:
					case OPMARGINS:
					case OPSEQUENCE:
					case OPT:
					case OPTFILE:
					case OPTIMIZE:
					case OPTIONS:
					case OUT:
					case OUTDD:
					case PFD:
					case PPTDBG:
					case PGMN:
					case PGMNAME:
					case PROCESS:
					case PROLOG:
					case QUOTE:
					case RENT:
					case REPLACING:
					case RMODE:
					case SEP:
					case SEPARATE:
					case SEQ:
					case SEQUENCE:
					case SHORT:
					case SIZE:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SS:
					case SSR:
					case SSRANGE:
					case STD:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TITLE:
					case TRIG:
					case TRUNC:
					case UE:
					case UPPER:
					case VBREF:
					case WD:
					case XMLPARSE:
					case XMLSS:
					case XOPTS:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case E_CHAR:
					case F_CHAR:
					case H_CHAR:
					case I_CHAR:
					case M_CHAR:
					case N_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case U_CHAR:
					case W_CHAR:
					case X_CHAR:
					case COMMACHAR:
					case IDENTIFIER:
						{
						setState(679);
						cobolWord();
						}
						break;
					case NONNUMERICLITERAL:
					case NUMERICLITERAL:
						{
						setState(680);
						literal();
						}
						break;
					case FILENAME:
						{
						setState(681);
						filename();
						}
						break;
					case PSEUDOTEXTIDENTIFIER:
						{
						setState(682);
						match(PSEUDOTEXTIDENTIFIER);
						}
						break;
					case TEXT:
						{
						setState(683);
						match(TEXT);
						}
						break;
					case DOT:
						{
						setState(684);
						match(DOT);
						}
						break;
					case LPARENCHAR:
						{
						setState(685);
						match(LPARENCHAR);
						}
						break;
					case RPARENCHAR:
						{
						setState(686);
						match(RPARENCHAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(689); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CobolWordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public CharDataKeywordContext charDataKeyword() {
			return getRuleContext(CharDataKeywordContext.class,0);
		}
		public CobolWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobolWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCobolWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCobolWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCobolWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CobolWordContext cobolWord() throws RecognitionException {
		CobolWordContext _localctx = new CobolWordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cobolWord);
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(IDENTIFIER);
				}
				break;
			case ADATA:
			case ADV:
			case ALIAS:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARITH:
			case AUTO:
			case AWO:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBL:
			case CBLCARD:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case CP:
			case CPP:
			case CPSM:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DECK:
			case DIAGTRUNC:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DTR:
			case DU:
			case DUMP:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENGLISH:
			case EPILOG:
			case EXCI:
			case EXIT:
			case EXP:
			case EXPORTALL:
			case EXTEND:
			case FASTSRT:
			case FLAG:
			case FLAGSTD:
			case FSRT:
			case FULL:
			case GDS:
			case GRAPHIC:
			case HOOK:
			case IN:
			case INTDATE:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LC:
			case LENGTH:
			case LIB:
			case LILIAN:
			case LIN:
			case LINECOUNT:
			case LINKAGE:
			case LIST:
			case LM:
			case LONGMIXED:
			case LONGUPPER:
			case LU:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOAWO:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCPSM:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODIAGTRUNC:
			case NODLL:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOEPILOG:
			case NOEXIT:
			case NOEXP:
			case NOEXPORTALL:
			case NOF:
			case NOFASTSRT:
			case NOFEPI:
			case NOFLAG:
			case NOFLAGMIG:
			case NOFLAGSTD:
			case NOFSRT:
			case NOGRAPHIC:
			case NOHOOK:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOFF:
			case NOOFFSET:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPFD:
			case NOPROLOG:
			case NORENT:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOVBREF:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PROCESS:
			case PROLOG:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SHORT:
			case SIZE:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SS:
			case SSR:
			case SSRANGE:
			case STD:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRIG:
			case TRUNC:
			case UE:
			case UPPER:
			case VBREF:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				charDataKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(CobolPreprocessorParser.NONNUMERICLITERAL, 0); }
		public TerminalNode NUMERICLITERAL() { return getToken(CobolPreprocessorParser.NUMERICLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_la = _input.LA(1);
			if ( !(_la==NONNUMERICLITERAL || _la==NUMERICLITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(CobolPreprocessorParser.FILENAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(FILENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharDataKeywordContext extends ParserRuleContext {
		public TerminalNode ADATA() { return getToken(CobolPreprocessorParser.ADATA, 0); }
		public TerminalNode ADV() { return getToken(CobolPreprocessorParser.ADV, 0); }
		public TerminalNode ALIAS() { return getToken(CobolPreprocessorParser.ALIAS, 0); }
		public TerminalNode ANSI() { return getToken(CobolPreprocessorParser.ANSI, 0); }
		public TerminalNode ANY() { return getToken(CobolPreprocessorParser.ANY, 0); }
		public TerminalNode APOST() { return getToken(CobolPreprocessorParser.APOST, 0); }
		public TerminalNode AR() { return getToken(CobolPreprocessorParser.AR, 0); }
		public TerminalNode ARITH() { return getToken(CobolPreprocessorParser.ARITH, 0); }
		public TerminalNode AUTO() { return getToken(CobolPreprocessorParser.AUTO, 0); }
		public TerminalNode AWO() { return getToken(CobolPreprocessorParser.AWO, 0); }
		public TerminalNode BIN() { return getToken(CobolPreprocessorParser.BIN, 0); }
		public TerminalNode BLOCK0() { return getToken(CobolPreprocessorParser.BLOCK0, 0); }
		public TerminalNode BUF() { return getToken(CobolPreprocessorParser.BUF, 0); }
		public TerminalNode BUFSIZE() { return getToken(CobolPreprocessorParser.BUFSIZE, 0); }
		public TerminalNode BY() { return getToken(CobolPreprocessorParser.BY, 0); }
		public TerminalNode CBL() { return getToken(CobolPreprocessorParser.CBL, 0); }
		public TerminalNode CBLCARD() { return getToken(CobolPreprocessorParser.CBLCARD, 0); }
		public TerminalNode CO() { return getToken(CobolPreprocessorParser.CO, 0); }
		public TerminalNode COBOL2() { return getToken(CobolPreprocessorParser.COBOL2, 0); }
		public TerminalNode COBOL3() { return getToken(CobolPreprocessorParser.COBOL3, 0); }
		public TerminalNode CODEPAGE() { return getToken(CobolPreprocessorParser.CODEPAGE, 0); }
		public TerminalNode COMMACHAR() { return getToken(CobolPreprocessorParser.COMMACHAR, 0); }
		public TerminalNode COMPAT() { return getToken(CobolPreprocessorParser.COMPAT, 0); }
		public TerminalNode COMPILE() { return getToken(CobolPreprocessorParser.COMPILE, 0); }
		public TerminalNode CP() { return getToken(CobolPreprocessorParser.CP, 0); }
		public TerminalNode CPP() { return getToken(CobolPreprocessorParser.CPP, 0); }
		public TerminalNode CPSM() { return getToken(CobolPreprocessorParser.CPSM, 0); }
		public TerminalNode CS() { return getToken(CobolPreprocessorParser.CS, 0); }
		public TerminalNode CURR() { return getToken(CobolPreprocessorParser.CURR, 0); }
		public TerminalNode CURRENCY() { return getToken(CobolPreprocessorParser.CURRENCY, 0); }
		public TerminalNode DATA() { return getToken(CobolPreprocessorParser.DATA, 0); }
		public TerminalNode DATEPROC() { return getToken(CobolPreprocessorParser.DATEPROC, 0); }
		public TerminalNode DBCS() { return getToken(CobolPreprocessorParser.DBCS, 0); }
		public TerminalNode DD() { return getToken(CobolPreprocessorParser.DD, 0); }
		public TerminalNode DEBUG() { return getToken(CobolPreprocessorParser.DEBUG, 0); }
		public TerminalNode DECK() { return getToken(CobolPreprocessorParser.DECK, 0); }
		public TerminalNode DIAGTRUNC() { return getToken(CobolPreprocessorParser.DIAGTRUNC, 0); }
		public TerminalNode DLI() { return getToken(CobolPreprocessorParser.DLI, 0); }
		public TerminalNode DLL() { return getToken(CobolPreprocessorParser.DLL, 0); }
		public TerminalNode DP() { return getToken(CobolPreprocessorParser.DP, 0); }
		public TerminalNode DTR() { return getToken(CobolPreprocessorParser.DTR, 0); }
		public TerminalNode DU() { return getToken(CobolPreprocessorParser.DU, 0); }
		public TerminalNode DUMP() { return getToken(CobolPreprocessorParser.DUMP, 0); }
		public TerminalNode DYN() { return getToken(CobolPreprocessorParser.DYN, 0); }
		public TerminalNode DYNAM() { return getToken(CobolPreprocessorParser.DYNAM, 0); }
		public TerminalNode EDF() { return getToken(CobolPreprocessorParser.EDF, 0); }
		public TerminalNode EJECT() { return getToken(CobolPreprocessorParser.EJECT, 0); }
		public TerminalNode EJPD() { return getToken(CobolPreprocessorParser.EJPD, 0); }
		public TerminalNode EN() { return getToken(CobolPreprocessorParser.EN, 0); }
		public TerminalNode ENGLISH() { return getToken(CobolPreprocessorParser.ENGLISH, 0); }
		public TerminalNode EPILOG() { return getToken(CobolPreprocessorParser.EPILOG, 0); }
		public TerminalNode EXCI() { return getToken(CobolPreprocessorParser.EXCI, 0); }
		public TerminalNode EXIT() { return getToken(CobolPreprocessorParser.EXIT, 0); }
		public TerminalNode EXP() { return getToken(CobolPreprocessorParser.EXP, 0); }
		public TerminalNode EXPORTALL() { return getToken(CobolPreprocessorParser.EXPORTALL, 0); }
		public TerminalNode EXTEND() { return getToken(CobolPreprocessorParser.EXTEND, 0); }
		public TerminalNode FASTSRT() { return getToken(CobolPreprocessorParser.FASTSRT, 0); }
		public TerminalNode FLAG() { return getToken(CobolPreprocessorParser.FLAG, 0); }
		public TerminalNode FLAGSTD() { return getToken(CobolPreprocessorParser.FLAGSTD, 0); }
		public TerminalNode FULL() { return getToken(CobolPreprocessorParser.FULL, 0); }
		public TerminalNode FSRT() { return getToken(CobolPreprocessorParser.FSRT, 0); }
		public TerminalNode GDS() { return getToken(CobolPreprocessorParser.GDS, 0); }
		public TerminalNode GRAPHIC() { return getToken(CobolPreprocessorParser.GRAPHIC, 0); }
		public TerminalNode HOOK() { return getToken(CobolPreprocessorParser.HOOK, 0); }
		public TerminalNode IN() { return getToken(CobolPreprocessorParser.IN, 0); }
		public TerminalNode INTDATE() { return getToken(CobolPreprocessorParser.INTDATE, 0); }
		public TerminalNode JA() { return getToken(CobolPreprocessorParser.JA, 0); }
		public TerminalNode JP() { return getToken(CobolPreprocessorParser.JP, 0); }
		public TerminalNode KA() { return getToken(CobolPreprocessorParser.KA, 0); }
		public TerminalNode LANG() { return getToken(CobolPreprocessorParser.LANG, 0); }
		public TerminalNode LANGUAGE() { return getToken(CobolPreprocessorParser.LANGUAGE, 0); }
		public TerminalNode LC() { return getToken(CobolPreprocessorParser.LC, 0); }
		public TerminalNode LENGTH() { return getToken(CobolPreprocessorParser.LENGTH, 0); }
		public TerminalNode LIB() { return getToken(CobolPreprocessorParser.LIB, 0); }
		public TerminalNode LILIAN() { return getToken(CobolPreprocessorParser.LILIAN, 0); }
		public TerminalNode LIN() { return getToken(CobolPreprocessorParser.LIN, 0); }
		public TerminalNode LINECOUNT() { return getToken(CobolPreprocessorParser.LINECOUNT, 0); }
		public TerminalNode LINKAGE() { return getToken(CobolPreprocessorParser.LINKAGE, 0); }
		public TerminalNode LIST() { return getToken(CobolPreprocessorParser.LIST, 0); }
		public TerminalNode LM() { return getToken(CobolPreprocessorParser.LM, 0); }
		public TerminalNode LONGMIXED() { return getToken(CobolPreprocessorParser.LONGMIXED, 0); }
		public TerminalNode LONGUPPER() { return getToken(CobolPreprocessorParser.LONGUPPER, 0); }
		public TerminalNode LU() { return getToken(CobolPreprocessorParser.LU, 0); }
		public TerminalNode MAP() { return getToken(CobolPreprocessorParser.MAP, 0); }
		public TerminalNode MARGINS() { return getToken(CobolPreprocessorParser.MARGINS, 0); }
		public TerminalNode MAX() { return getToken(CobolPreprocessorParser.MAX, 0); }
		public TerminalNode MD() { return getToken(CobolPreprocessorParser.MD, 0); }
		public TerminalNode MDECK() { return getToken(CobolPreprocessorParser.MDECK, 0); }
		public TerminalNode MIG() { return getToken(CobolPreprocessorParser.MIG, 0); }
		public TerminalNode MIXED() { return getToken(CobolPreprocessorParser.MIXED, 0); }
		public TerminalNode NAME() { return getToken(CobolPreprocessorParser.NAME, 0); }
		public TerminalNode NAT() { return getToken(CobolPreprocessorParser.NAT, 0); }
		public TerminalNode NATIONAL() { return getToken(CobolPreprocessorParser.NATIONAL, 0); }
		public TerminalNode NATLANG() { return getToken(CobolPreprocessorParser.NATLANG, 0); }
		public TerminalNode NN() { return getToken(CobolPreprocessorParser.NN, 0); }
		public TerminalNode NO() { return getToken(CobolPreprocessorParser.NO, 0); }
		public TerminalNode NOADATA() { return getToken(CobolPreprocessorParser.NOADATA, 0); }
		public TerminalNode NOADV() { return getToken(CobolPreprocessorParser.NOADV, 0); }
		public TerminalNode NOALIAS() { return getToken(CobolPreprocessorParser.NOALIAS, 0); }
		public TerminalNode NOAWO() { return getToken(CobolPreprocessorParser.NOAWO, 0); }
		public TerminalNode NOBLOCK0() { return getToken(CobolPreprocessorParser.NOBLOCK0, 0); }
		public TerminalNode NOC() { return getToken(CobolPreprocessorParser.NOC, 0); }
		public TerminalNode NOCBLCARD() { return getToken(CobolPreprocessorParser.NOCBLCARD, 0); }
		public TerminalNode NOCICS() { return getToken(CobolPreprocessorParser.NOCICS, 0); }
		public TerminalNode NOCMPR2() { return getToken(CobolPreprocessorParser.NOCMPR2, 0); }
		public TerminalNode NOCOMPILE() { return getToken(CobolPreprocessorParser.NOCOMPILE, 0); }
		public TerminalNode NOCPSM() { return getToken(CobolPreprocessorParser.NOCPSM, 0); }
		public TerminalNode NOCURR() { return getToken(CobolPreprocessorParser.NOCURR, 0); }
		public TerminalNode NOCURRENCY() { return getToken(CobolPreprocessorParser.NOCURRENCY, 0); }
		public TerminalNode NOD() { return getToken(CobolPreprocessorParser.NOD, 0); }
		public TerminalNode NODATEPROC() { return getToken(CobolPreprocessorParser.NODATEPROC, 0); }
		public TerminalNode NODBCS() { return getToken(CobolPreprocessorParser.NODBCS, 0); }
		public TerminalNode NODE() { return getToken(CobolPreprocessorParser.NODE, 0); }
		public TerminalNode NODEBUG() { return getToken(CobolPreprocessorParser.NODEBUG, 0); }
		public TerminalNode NODECK() { return getToken(CobolPreprocessorParser.NODECK, 0); }
		public TerminalNode NODIAGTRUNC() { return getToken(CobolPreprocessorParser.NODIAGTRUNC, 0); }
		public TerminalNode NODLL() { return getToken(CobolPreprocessorParser.NODLL, 0); }
		public TerminalNode NODU() { return getToken(CobolPreprocessorParser.NODU, 0); }
		public TerminalNode NODUMP() { return getToken(CobolPreprocessorParser.NODUMP, 0); }
		public TerminalNode NODP() { return getToken(CobolPreprocessorParser.NODP, 0); }
		public TerminalNode NODTR() { return getToken(CobolPreprocessorParser.NODTR, 0); }
		public TerminalNode NODYN() { return getToken(CobolPreprocessorParser.NODYN, 0); }
		public TerminalNode NODYNAM() { return getToken(CobolPreprocessorParser.NODYNAM, 0); }
		public TerminalNode NOEDF() { return getToken(CobolPreprocessorParser.NOEDF, 0); }
		public TerminalNode NOEJPD() { return getToken(CobolPreprocessorParser.NOEJPD, 0); }
		public TerminalNode NOEPILOG() { return getToken(CobolPreprocessorParser.NOEPILOG, 0); }
		public TerminalNode NOEXIT() { return getToken(CobolPreprocessorParser.NOEXIT, 0); }
		public TerminalNode NOEXP() { return getToken(CobolPreprocessorParser.NOEXP, 0); }
		public TerminalNode NOEXPORTALL() { return getToken(CobolPreprocessorParser.NOEXPORTALL, 0); }
		public TerminalNode NOF() { return getToken(CobolPreprocessorParser.NOF, 0); }
		public TerminalNode NOFASTSRT() { return getToken(CobolPreprocessorParser.NOFASTSRT, 0); }
		public TerminalNode NOFEPI() { return getToken(CobolPreprocessorParser.NOFEPI, 0); }
		public TerminalNode NOFLAG() { return getToken(CobolPreprocessorParser.NOFLAG, 0); }
		public TerminalNode NOFLAGMIG() { return getToken(CobolPreprocessorParser.NOFLAGMIG, 0); }
		public TerminalNode NOFLAGSTD() { return getToken(CobolPreprocessorParser.NOFLAGSTD, 0); }
		public TerminalNode NOFSRT() { return getToken(CobolPreprocessorParser.NOFSRT, 0); }
		public TerminalNode NOGRAPHIC() { return getToken(CobolPreprocessorParser.NOGRAPHIC, 0); }
		public TerminalNode NOHOOK() { return getToken(CobolPreprocessorParser.NOHOOK, 0); }
		public TerminalNode NOLENGTH() { return getToken(CobolPreprocessorParser.NOLENGTH, 0); }
		public TerminalNode NOLIB() { return getToken(CobolPreprocessorParser.NOLIB, 0); }
		public TerminalNode NOLINKAGE() { return getToken(CobolPreprocessorParser.NOLINKAGE, 0); }
		public TerminalNode NOLIST() { return getToken(CobolPreprocessorParser.NOLIST, 0); }
		public TerminalNode NOMAP() { return getToken(CobolPreprocessorParser.NOMAP, 0); }
		public TerminalNode NOMD() { return getToken(CobolPreprocessorParser.NOMD, 0); }
		public TerminalNode NOMDECK() { return getToken(CobolPreprocessorParser.NOMDECK, 0); }
		public TerminalNode NONAME() { return getToken(CobolPreprocessorParser.NONAME, 0); }
		public TerminalNode NONUM() { return getToken(CobolPreprocessorParser.NONUM, 0); }
		public TerminalNode NONUMBER() { return getToken(CobolPreprocessorParser.NONUMBER, 0); }
		public TerminalNode NOOBJ() { return getToken(CobolPreprocessorParser.NOOBJ, 0); }
		public TerminalNode NOOBJECT() { return getToken(CobolPreprocessorParser.NOOBJECT, 0); }
		public TerminalNode NOOFF() { return getToken(CobolPreprocessorParser.NOOFF, 0); }
		public TerminalNode NOOFFSET() { return getToken(CobolPreprocessorParser.NOOFFSET, 0); }
		public TerminalNode NOOPSEQUENCE() { return getToken(CobolPreprocessorParser.NOOPSEQUENCE, 0); }
		public TerminalNode NOOPT() { return getToken(CobolPreprocessorParser.NOOPT, 0); }
		public TerminalNode NOOPTIMIZE() { return getToken(CobolPreprocessorParser.NOOPTIMIZE, 0); }
		public TerminalNode NOOPTIONS() { return getToken(CobolPreprocessorParser.NOOPTIONS, 0); }
		public TerminalNode NOP() { return getToken(CobolPreprocessorParser.NOP, 0); }
		public TerminalNode NOPFD() { return getToken(CobolPreprocessorParser.NOPFD, 0); }
		public TerminalNode NOPROLOG() { return getToken(CobolPreprocessorParser.NOPROLOG, 0); }
		public TerminalNode NORENT() { return getToken(CobolPreprocessorParser.NORENT, 0); }
		public TerminalNode NOS() { return getToken(CobolPreprocessorParser.NOS, 0); }
		public TerminalNode NOSEP() { return getToken(CobolPreprocessorParser.NOSEP, 0); }
		public TerminalNode NOSEPARATE() { return getToken(CobolPreprocessorParser.NOSEPARATE, 0); }
		public TerminalNode NOSEQ() { return getToken(CobolPreprocessorParser.NOSEQ, 0); }
		public TerminalNode NOSEQUENCE() { return getToken(CobolPreprocessorParser.NOSEQUENCE, 0); }
		public TerminalNode NOSOURCE() { return getToken(CobolPreprocessorParser.NOSOURCE, 0); }
		public TerminalNode NOSPIE() { return getToken(CobolPreprocessorParser.NOSPIE, 0); }
		public TerminalNode NOSQL() { return getToken(CobolPreprocessorParser.NOSQL, 0); }
		public TerminalNode NOSQLC() { return getToken(CobolPreprocessorParser.NOSQLC, 0); }
		public TerminalNode NOSQLCCSID() { return getToken(CobolPreprocessorParser.NOSQLCCSID, 0); }
		public TerminalNode NOSSR() { return getToken(CobolPreprocessorParser.NOSSR, 0); }
		public TerminalNode NOSSRANGE() { return getToken(CobolPreprocessorParser.NOSSRANGE, 0); }
		public TerminalNode NOSTDTRUNC() { return getToken(CobolPreprocessorParser.NOSTDTRUNC, 0); }
		public TerminalNode NOTERM() { return getToken(CobolPreprocessorParser.NOTERM, 0); }
		public TerminalNode NOTERMINAL() { return getToken(CobolPreprocessorParser.NOTERMINAL, 0); }
		public TerminalNode NOTEST() { return getToken(CobolPreprocessorParser.NOTEST, 0); }
		public TerminalNode NOTHREAD() { return getToken(CobolPreprocessorParser.NOTHREAD, 0); }
		public TerminalNode NOTRIG() { return getToken(CobolPreprocessorParser.NOTRIG, 0); }
		public TerminalNode NOVBREF() { return getToken(CobolPreprocessorParser.NOVBREF, 0); }
		public TerminalNode NOWORD() { return getToken(CobolPreprocessorParser.NOWORD, 0); }
		public TerminalNode NOX() { return getToken(CobolPreprocessorParser.NOX, 0); }
		public TerminalNode NOXREF() { return getToken(CobolPreprocessorParser.NOXREF, 0); }
		public TerminalNode NOZWB() { return getToken(CobolPreprocessorParser.NOZWB, 0); }
		public TerminalNode NSEQ() { return getToken(CobolPreprocessorParser.NSEQ, 0); }
		public TerminalNode NSYMBOL() { return getToken(CobolPreprocessorParser.NSYMBOL, 0); }
		public TerminalNode NS() { return getToken(CobolPreprocessorParser.NS, 0); }
		public TerminalNode NUM() { return getToken(CobolPreprocessorParser.NUM, 0); }
		public TerminalNode NUMBER() { return getToken(CobolPreprocessorParser.NUMBER, 0); }
		public TerminalNode NUMPROC() { return getToken(CobolPreprocessorParser.NUMPROC, 0); }
		public TerminalNode OBJ() { return getToken(CobolPreprocessorParser.OBJ, 0); }
		public TerminalNode OBJECT() { return getToken(CobolPreprocessorParser.OBJECT, 0); }
		public TerminalNode ON() { return getToken(CobolPreprocessorParser.ON, 0); }
		public TerminalNode OF() { return getToken(CobolPreprocessorParser.OF, 0); }
		public TerminalNode OFF() { return getToken(CobolPreprocessorParser.OFF, 0); }
		public TerminalNode OFFSET() { return getToken(CobolPreprocessorParser.OFFSET, 0); }
		public TerminalNode OPMARGINS() { return getToken(CobolPreprocessorParser.OPMARGINS, 0); }
		public TerminalNode OPSEQUENCE() { return getToken(CobolPreprocessorParser.OPSEQUENCE, 0); }
		public TerminalNode OPTIMIZE() { return getToken(CobolPreprocessorParser.OPTIMIZE, 0); }
		public TerminalNode OP() { return getToken(CobolPreprocessorParser.OP, 0); }
		public TerminalNode OPT() { return getToken(CobolPreprocessorParser.OPT, 0); }
		public TerminalNode OPTFILE() { return getToken(CobolPreprocessorParser.OPTFILE, 0); }
		public TerminalNode OPTIONS() { return getToken(CobolPreprocessorParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(CobolPreprocessorParser.OUT, 0); }
		public TerminalNode OUTDD() { return getToken(CobolPreprocessorParser.OUTDD, 0); }
		public TerminalNode PFD() { return getToken(CobolPreprocessorParser.PFD, 0); }
		public TerminalNode PGMN() { return getToken(CobolPreprocessorParser.PGMN, 0); }
		public TerminalNode PGMNAME() { return getToken(CobolPreprocessorParser.PGMNAME, 0); }
		public TerminalNode PPTDBG() { return getToken(CobolPreprocessorParser.PPTDBG, 0); }
		public TerminalNode PROCESS() { return getToken(CobolPreprocessorParser.PROCESS, 0); }
		public TerminalNode PROLOG() { return getToken(CobolPreprocessorParser.PROLOG, 0); }
		public TerminalNode QUOTE() { return getToken(CobolPreprocessorParser.QUOTE, 0); }
		public TerminalNode RENT() { return getToken(CobolPreprocessorParser.RENT, 0); }
		public TerminalNode REPLACING() { return getToken(CobolPreprocessorParser.REPLACING, 0); }
		public TerminalNode RMODE() { return getToken(CobolPreprocessorParser.RMODE, 0); }
		public TerminalNode SEQ() { return getToken(CobolPreprocessorParser.SEQ, 0); }
		public TerminalNode SEQUENCE() { return getToken(CobolPreprocessorParser.SEQUENCE, 0); }
		public TerminalNode SEP() { return getToken(CobolPreprocessorParser.SEP, 0); }
		public TerminalNode SEPARATE() { return getToken(CobolPreprocessorParser.SEPARATE, 0); }
		public TerminalNode SHORT() { return getToken(CobolPreprocessorParser.SHORT, 0); }
		public TerminalNode SIZE() { return getToken(CobolPreprocessorParser.SIZE, 0); }
		public TerminalNode SOURCE() { return getToken(CobolPreprocessorParser.SOURCE, 0); }
		public TerminalNode SP() { return getToken(CobolPreprocessorParser.SP, 0); }
		public TerminalNode SPACE() { return getToken(CobolPreprocessorParser.SPACE, 0); }
		public TerminalNode SPIE() { return getToken(CobolPreprocessorParser.SPIE, 0); }
		public TerminalNode SQL() { return getToken(CobolPreprocessorParser.SQL, 0); }
		public TerminalNode SQLC() { return getToken(CobolPreprocessorParser.SQLC, 0); }
		public TerminalNode SQLCCSID() { return getToken(CobolPreprocessorParser.SQLCCSID, 0); }
		public TerminalNode SS() { return getToken(CobolPreprocessorParser.SS, 0); }
		public TerminalNode SSR() { return getToken(CobolPreprocessorParser.SSR, 0); }
		public TerminalNode SSRANGE() { return getToken(CobolPreprocessorParser.SSRANGE, 0); }
		public TerminalNode STD() { return getToken(CobolPreprocessorParser.STD, 0); }
		public TerminalNode SYSEIB() { return getToken(CobolPreprocessorParser.SYSEIB, 0); }
		public TerminalNode SZ() { return getToken(CobolPreprocessorParser.SZ, 0); }
		public TerminalNode TERM() { return getToken(CobolPreprocessorParser.TERM, 0); }
		public TerminalNode TERMINAL() { return getToken(CobolPreprocessorParser.TERMINAL, 0); }
		public TerminalNode TEST() { return getToken(CobolPreprocessorParser.TEST, 0); }
		public TerminalNode THREAD() { return getToken(CobolPreprocessorParser.THREAD, 0); }
		public TerminalNode TITLE() { return getToken(CobolPreprocessorParser.TITLE, 0); }
		public TerminalNode TRIG() { return getToken(CobolPreprocessorParser.TRIG, 0); }
		public TerminalNode TRUNC() { return getToken(CobolPreprocessorParser.TRUNC, 0); }
		public TerminalNode UE() { return getToken(CobolPreprocessorParser.UE, 0); }
		public TerminalNode UPPER() { return getToken(CobolPreprocessorParser.UPPER, 0); }
		public TerminalNode VBREF() { return getToken(CobolPreprocessorParser.VBREF, 0); }
		public TerminalNode WD() { return getToken(CobolPreprocessorParser.WD, 0); }
		public TerminalNode XMLPARSE() { return getToken(CobolPreprocessorParser.XMLPARSE, 0); }
		public TerminalNode XMLSS() { return getToken(CobolPreprocessorParser.XMLSS, 0); }
		public TerminalNode XOPTS() { return getToken(CobolPreprocessorParser.XOPTS, 0); }
		public TerminalNode XREF() { return getToken(CobolPreprocessorParser.XREF, 0); }
		public TerminalNode YEARWINDOW() { return getToken(CobolPreprocessorParser.YEARWINDOW, 0); }
		public TerminalNode YW() { return getToken(CobolPreprocessorParser.YW, 0); }
		public TerminalNode ZWB() { return getToken(CobolPreprocessorParser.ZWB, 0); }
		public TerminalNode C_CHAR() { return getToken(CobolPreprocessorParser.C_CHAR, 0); }
		public TerminalNode D_CHAR() { return getToken(CobolPreprocessorParser.D_CHAR, 0); }
		public TerminalNode E_CHAR() { return getToken(CobolPreprocessorParser.E_CHAR, 0); }
		public TerminalNode F_CHAR() { return getToken(CobolPreprocessorParser.F_CHAR, 0); }
		public TerminalNode H_CHAR() { return getToken(CobolPreprocessorParser.H_CHAR, 0); }
		public TerminalNode I_CHAR() { return getToken(CobolPreprocessorParser.I_CHAR, 0); }
		public TerminalNode M_CHAR() { return getToken(CobolPreprocessorParser.M_CHAR, 0); }
		public TerminalNode N_CHAR() { return getToken(CobolPreprocessorParser.N_CHAR, 0); }
		public TerminalNode Q_CHAR() { return getToken(CobolPreprocessorParser.Q_CHAR, 0); }
		public TerminalNode S_CHAR() { return getToken(CobolPreprocessorParser.S_CHAR, 0); }
		public TerminalNode U_CHAR() { return getToken(CobolPreprocessorParser.U_CHAR, 0); }
		public TerminalNode W_CHAR() { return getToken(CobolPreprocessorParser.W_CHAR, 0); }
		public TerminalNode X_CHAR() { return getToken(CobolPreprocessorParser.X_CHAR, 0); }
		public TerminalNode DIVISION() { return getToken(CobolPreprocessorParser.DIVISION, 0); }
		public CharDataKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDataKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).enterCharDataKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorListener ) ((CobolPreprocessorListener)listener).exitCharDataKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorVisitor ) return ((CobolPreprocessorVisitor<? extends T>)visitor).visitCharDataKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataKeywordContext charDataKeyword() throws RecognitionException {
		CharDataKeywordContext _localctx = new CharDataKeywordContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_charDataKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << ALIAS) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << CP) | (1L << CPP) | (1L << CPSM) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DECK) | (1L << DIAGTRUNC) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DTR) | (1L << DU) | (1L << DUMP) | (1L << DYN) | (1L << DYNAM) | (1L << EDF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HOOK - 64)) | (1L << (IN - 64)) | (1L << (INTDATE - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)) | (1L << (LU - 64)) | (1L << (MAP - 64)) | (1L << (MARGINS - 64)) | (1L << (MAX - 64)) | (1L << (MD - 64)) | (1L << (MDECK - 64)) | (1L << (MIG - 64)) | (1L << (MIXED - 64)) | (1L << (NAME - 64)) | (1L << (NAT - 64)) | (1L << (NATIONAL - 64)) | (1L << (NATLANG - 64)) | (1L << (NN - 64)) | (1L << (NO - 64)) | (1L << (NOADATA - 64)) | (1L << (NOADV - 64)) | (1L << (NOALIAS - 64)) | (1L << (NOAWO - 64)) | (1L << (NOBLOCK0 - 64)) | (1L << (NOC - 64)) | (1L << (NOCBLCARD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEXIT - 128)) | (1L << (NOEXP - 128)) | (1L << (NOEXPORTALL - 128)) | (1L << (NOF - 128)) | (1L << (NOFASTSRT - 128)) | (1L << (NOFEPI - 128)) | (1L << (NOFLAG - 128)) | (1L << (NOFLAGMIG - 128)) | (1L << (NOFLAGSTD - 128)) | (1L << (NOFSRT - 128)) | (1L << (NOGRAPHIC - 128)) | (1L << (NOHOOK - 128)) | (1L << (NOLENGTH - 128)) | (1L << (NOLIB - 128)) | (1L << (NOLINKAGE - 128)) | (1L << (NOLIST - 128)) | (1L << (NOMAP - 128)) | (1L << (NOMD - 128)) | (1L << (NOMDECK - 128)) | (1L << (NONAME - 128)) | (1L << (NONUM - 128)) | (1L << (NONUMBER - 128)) | (1L << (NOOBJ - 128)) | (1L << (NOOBJECT - 128)) | (1L << (NOOFF - 128)) | (1L << (NOOFFSET - 128)) | (1L << (NOOPSEQUENCE - 128)) | (1L << (NOOPT - 128)) | (1L << (NOOPTIMIZE - 128)) | (1L << (NOOPTIONS - 128)) | (1L << (NOP - 128)) | (1L << (NOPFD - 128)) | (1L << (NOPROLOG - 128)) | (1L << (NORENT - 128)) | (1L << (NOS - 128)) | (1L << (NOSEP - 128)) | (1L << (NOSEPARATE - 128)) | (1L << (NOSEQ - 128)) | (1L << (NOSOURCE - 128)) | (1L << (NOSPIE - 128)) | (1L << (NOSQL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)) | (1L << (NOSTDTRUNC - 192)) | (1L << (NOSEQUENCE - 192)) | (1L << (NOTERM - 192)) | (1L << (NOTERMINAL - 192)) | (1L << (NOTEST - 192)) | (1L << (NOTHREAD - 192)) | (1L << (NOTRIG - 192)) | (1L << (NOVBREF - 192)) | (1L << (NOWORD - 192)) | (1L << (NOX - 192)) | (1L << (NOXREF - 192)) | (1L << (NOZWB - 192)) | (1L << (NS - 192)) | (1L << (NSEQ - 192)) | (1L << (NSYMBOL - 192)) | (1L << (NUM - 192)) | (1L << (NUMBER - 192)) | (1L << (NUMPROC - 192)) | (1L << (OBJ - 192)) | (1L << (OBJECT - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OFFSET - 192)) | (1L << (ON - 192)) | (1L << (OP - 192)) | (1L << (OPMARGINS - 192)) | (1L << (OPSEQUENCE - 192)) | (1L << (OPT - 192)) | (1L << (OPTFILE - 192)) | (1L << (OPTIMIZE - 192)) | (1L << (OPTIONS - 192)) | (1L << (OUT - 192)) | (1L << (OUTDD - 192)) | (1L << (PFD - 192)) | (1L << (PPTDBG - 192)) | (1L << (PGMN - 192)) | (1L << (PGMNAME - 192)) | (1L << (PROCESS - 192)) | (1L << (PROLOG - 192)) | (1L << (QUOTE - 192)) | (1L << (RENT - 192)) | (1L << (REPLACING - 192)) | (1L << (RMODE - 192)) | (1L << (SEP - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQ - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SHORT - 192)) | (1L << (SIZE - 192)) | (1L << (SOURCE - 192)) | (1L << (SP - 192)) | (1L << (SPACE - 192)) | (1L << (SPIE - 192)) | (1L << (SQL - 192)) | (1L << (SQLC - 192)) | (1L << (SQLCCSID - 192)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (SS - 259)) | (1L << (SSR - 259)) | (1L << (SSRANGE - 259)) | (1L << (STD - 259)) | (1L << (SYSEIB - 259)) | (1L << (SZ - 259)) | (1L << (TERM - 259)) | (1L << (TERMINAL - 259)) | (1L << (TEST - 259)) | (1L << (THREAD - 259)) | (1L << (TITLE - 259)) | (1L << (TRIG - 259)) | (1L << (TRUNC - 259)) | (1L << (UE - 259)) | (1L << (UPPER - 259)) | (1L << (VBREF - 259)) | (1L << (WD - 259)) | (1L << (XMLPARSE - 259)) | (1L << (XMLSS - 259)) | (1L << (XOPTS - 259)) | (1L << (XREF - 259)) | (1L << (YEARWINDOW - 259)) | (1L << (YW - 259)) | (1L << (ZWB - 259)) | (1L << (C_CHAR - 259)) | (1L << (D_CHAR - 259)) | (1L << (E_CHAR - 259)) | (1L << (F_CHAR - 259)) | (1L << (H_CHAR - 259)) | (1L << (I_CHAR - 259)) | (1L << (M_CHAR - 259)) | (1L << (N_CHAR - 259)) | (1L << (Q_CHAR - 259)) | (1L << (S_CHAR - 259)) | (1L << (U_CHAR - 259)) | (1L << (W_CHAR - 259)) | (1L << (X_CHAR - 259)) | (1L << (COMMACHAR - 259)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u013b\u02c0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2Q\n\2\f"+
		"\2\16\2T\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4]\n\4\3\4\3\4\6\4a\n\4\r"+
		"\4\16\4b\3\5\3\5\3\5\3\5\5\5i\n\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0087\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\6\5\6\u00a3"+
		"\n\6\3\6\5\6\u00a6\n\6\3\6\5\6\u00a9\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00c5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00e5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ed\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00f3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0104\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014d\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u015c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0172\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u017c\n\6\3\6\3\6\3\6\3\6\5\6\u0182\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0192\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u019b\n\6\3\6\5\6\u019e\n\6\3\6\5\6\u01a1\n"+
		"\6\3\6\5\6\u01a4\n\6\3\6\5\6\u01a7\n\6\3\6\5\6\u01aa\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01be\n"+
		"\6\3\6\5\6\u01c1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01c9\n\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u01d2\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u01d9\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u01e0\n\n\3\13\3\13\3\13\7\13\u01e5\n\13\f\13\16\13"+
		"\u01e8\13\13\3\13\3\13\3\13\3\13\5\13\u01ee\n\13\7\13\u01f0\n\13\f\13"+
		"\16\13\u01f3\13\13\3\13\7\13\u01f6\n\13\f\13\16\13\u01f9\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u0200\n\f\3\f\3\f\5\f\u0204\n\f\3\r\3\r\5\r\u0208"+
		"\n\r\3\16\3\16\7\16\u020c\n\16\f\16\16\16\u020f\13\16\3\16\3\16\6\16\u0213"+
		"\n\16\r\16\16\16\u0214\3\16\7\16\u0218\n\16\f\16\16\16\u021b\13\16\3\17"+
		"\3\17\3\17\7\17\u0220\n\17\f\17\16\17\u0223\13\17\3\17\5\17\u0226\n\17"+
		"\3\20\3\20\7\20\u022a\n\20\f\20\16\20\u022d\13\20\3\20\6\20\u0230\n\20"+
		"\r\20\16\20\u0231\3\20\7\20\u0235\n\20\f\20\16\20\u0238\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\7\21\u023f\n\21\f\21\16\21\u0242\13\21\3\21\3\21\3\22"+
		"\3\22\7\22\u0248\n\22\f\22\16\22\u024b\13\22\3\22\3\22\7\22\u024f\n\22"+
		"\f\22\16\22\u0252\13\22\3\22\3\22\7\22\u0256\n\22\f\22\16\22\u0259\13"+
		"\22\3\22\5\22\u025c\n\22\3\22\7\22\u025f\n\22\f\22\16\22\u0262\13\22\3"+
		"\22\5\22\u0265\n\22\3\23\3\23\7\23\u0269\n\23\f\23\16\23\u026c\13\23\3"+
		"\23\3\23\5\23\u0270\n\23\3\24\3\24\7\24\u0274\n\24\f\24\16\24\u0277\13"+
		"\24\3\24\3\24\5\24\u027b\n\24\3\25\3\25\3\25\3\25\5\25\u0281\n\25\3\26"+
		"\3\26\3\26\3\26\5\26\u0287\n\26\3\27\3\27\5\27\u028b\n\27\3\30\3\30\5"+
		"\30\u028f\n\30\3\31\3\31\3\31\5\31\u0294\n\31\3\32\3\32\5\32\u0298\n\32"+
		"\3\32\3\32\3\33\3\33\6\33\u029e\n\33\r\33\16\33\u029f\3\34\3\34\3\34\3"+
		"\34\6\34\u02a6\n\34\r\34\16\34\u02a7\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\6\35\u02b2\n\35\r\35\16\35\u02b3\3\36\3\36\5\36\u02b8\n\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@\2V\3\2WX\4\2!!\u00ec\u00ec\3\2\30\31\6\2((MM\u0120"+
		"\u0120\u0122\u0122\3\2\36\37\4\2\'\'++\4\2))\u0120\u0120\3\2/\60\4\2\62"+
		"\62;;\4\2PP\u009f\u009f\4\2\u00cc\u00cc\u0111\u0111\4\2\66\66\u0121\u0121"+
		"\4\2\67\67<<\3\2=>\3\2?@\3\2KL\4\2NNRR\4\2PP\u0123\u0123\5\2\u0122\u0122"+
		"\u0125\u0125\u0129\u012b\3\2\u0124\u0126\b\2\64\64yy\u0105\u0105\u0121"+
		"\u0121\u0127\u0127\u0129\u0129\4\2\25\25dd\3\2^_\6\2..DE[]\u0113\u0113"+
		"\4\2``ff\3\2qr\6\2))\u0080\u0080\u0084\u0084\u0120\u0120\4\2\24\24}}\5"+
		"\2..DD]]\4\2\u0080\u0080\u0084\u0084\5\2\u0122\u0122\u0129\u0129\u012b"+
		"\u012b\3\2\u0086\u0087\4\2\u0089\u0089\u0092\u0092\4\2\u0088\u0088\u008d"+
		"\u008d\3\2\u0090\u0091\4\2\u008e\u008e\u0093\u0093\3\2\u0094\u0095\3\2"+
		"\u009a\u009b\4\2\u009d\u009d\u00a2\u00a2\4\2\u009c\u009c\u009f\u009f\3"+
		"\2\u00aa\u00ab\3\2\u00ad\u00ae\3\2\u00af\u00b0\3\2\u00b1\u00b2\3\2\u00b4"+
		"\u00b5\4\2\u00be\u00be\u00c7\u00c7\4\2\u00bb\u00bb\u00bf\u00bf\3\2\u00c2"+
		"\u00c3\3\2\u00c4\u00c5\3\2\u00c8\u00c9\3\2\u00ce\u00cf\4\2\u00d3\u00d3"+
		"\u00d5\u00d5\4\2\63\63vw\3\2\u00d0\u00d1\3\2\u00d6\u00d7\5\2ss\u00b8\u00b8"+
		"\u00e8\u00e8\3\2\u00d9\u00da\3\2\u00dc\u00dd\4\2\u00e2\u00e2\u00e4\u00e4"+
		"\4\2SS\u0108\u0108\3\2\u00e6\u00e7\3\2\u00ea\u00eb\n\2$$((ikmmtt\u0114"+
		"\u0114\u0126\u0126\u012a\u012a\4\2\u00ee\u00ee\u0128\u0128\3\2\u00f6\u00f7"+
		"\4\2\u00f9\u00f9\u010b\u010b\4\2\u00fa\u00fa\u0129\u0129\3\2\u00ff\u0100"+
		"\3\2\u0106\u0107\3\2\u010c\u010d\4\2VV\u00a4\u00a4\4\2\u00bc\u00bd\u00f4"+
		"\u00f5\4\2CC\u0097\u0097\5\2\34\34\u00e2\u00e2\u0108\u0108\3\2\u0116\u0117"+
		"\4\2\u0118\u0118\u011b\u011b\6\2((\u0119\u0119\u0120\u0120\u012c\u012c"+
		"\4\2\u011c\u011c\u012c\u012c\4\2SS\u00f8\u00f8\3\2\u011d\u011e\4\2YY\u00db"+
		"\u00db\3\2\u0102\u0104\3\2\u0131\u0132\23\2\22\"$)+EGHJNPVY`bkm\u00cd"+
		"\u00cf\u00ef\u00f1\u00f2\u00f4\u0100\u0105\u0108\u010a\u0116\u0118\u011a"+
		"\u011c\u012c\u012e\u012e\2\u0398\2R\3\2\2\2\4W\3\2\2\2\6Z\3\2\2\2\bd\3"+
		"\2\2\2\n\u01c8\3\2\2\2\f\u01ca\3\2\2\2\16\u01cc\3\2\2\2\20\u01d3\3\2\2"+
		"\2\22\u01da\3\2\2\2\24\u01e1\3\2\2\2\26\u01ff\3\2\2\2\30\u0207\3\2\2\2"+
		"\32\u0209\3\2\2\2\34\u021c\3\2\2\2\36\u0227\3\2\2\2 \u023b\3\2\2\2\"\u0245"+
		"\3\2\2\2$\u0266\3\2\2\2&\u0271\3\2\2\2(\u0280\3\2\2\2*\u0286\3\2\2\2,"+
		"\u0288\3\2\2\2.\u028c\3\2\2\2\60\u0290\3\2\2\2\62\u0295\3\2\2\2\64\u029d"+
		"\3\2\2\2\66\u02a5\3\2\2\28\u02b1\3\2\2\2:\u02b7\3\2\2\2<\u02b9\3\2\2\2"+
		">\u02bb\3\2\2\2@\u02bd\3\2\2\2BQ\5\4\3\2CQ\5\6\4\2DQ\5\f\7\2EQ\5\24\13"+
		"\2FQ\5\16\b\2GQ\5\20\t\2HQ\5\22\n\2IQ\5 \21\2JQ\5\34\17\2KQ\5,\27\2LQ"+
		"\5.\30\2MQ\5\60\31\2NQ\58\35\2OQ\7\u0136\2\2PB\3\2\2\2PC\3\2\2\2PD\3\2"+
		"\2\2PE\3\2\2\2PF\3\2\2\2PG\3\2\2\2PH\3\2\2\2PI\3\2\2\2PJ\3\2\2\2PK\3\2"+
		"\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SU\3\2\2\2TR\3\2\2\2UV\7\2\2\3V\3\3\2\2\2WX\t\2\2\2XY\78\2\2Y\5\3"+
		"\2\2\2Z`\t\3\2\2[]\7\u012e\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^a\5\n\6"+
		"\2_a\5\b\5\2`\\\3\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\7\3\2"+
		"\2\2de\7\u011a\2\2ef\7l\2\2fm\5\n\6\2gi\7\u012e\2\2hg\3\2\2\2hi\3\2\2"+
		"\2ij\3\2\2\2jl\5\n\6\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2"+
		"\2om\3\2\2\2pq\7\u00f3\2\2q\t\3\2\2\2r\u01c9\7\22\2\2s\u01c9\7\23\2\2"+
		"t\u01c9\7\27\2\2uv\t\4\2\2vw\7l\2\2wx\t\5\2\2x\u01c9\7\u00f3\2\2y\u01c9"+
		"\7\33\2\2z\u01c9\7\35\2\2{|\t\6\2\2|}\7l\2\2}~\5<\37\2~\177\7\u00f3\2"+
		"\2\177\u01c9\3\2\2\2\u0080\u01c9\7\"\2\2\u0081\u0086\7#\2\2\u0082\u0083"+
		"\7l\2\2\u0083\u0084\5<\37\2\u0084\u0085\7\u00f3\2\2\u0085\u0087\3\2\2"+
		"\2\u0086\u0082\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u01c9\3\2\2\2\u0088\u01c9"+
		"\7%\2\2\u0089\u01c9\7&\2\2\u008a\u008b\t\7\2\2\u008b\u008c\7l\2\2\u008c"+
		"\u008d\5<\37\2\u008d\u008e\7\u00f3\2\2\u008e\u01c9\3\2\2\2\u008f\u01c9"+
		"\t\b\2\2\u0090\u01c9\7,\2\2\u0091\u01c9\7-\2\2\u0092\u0093\t\t\2\2\u0093"+
		"\u0094\7l\2\2\u0094\u0095\5<\37\2\u0095\u0096\7\u00f3\2\2\u0096\u01c9"+
		"\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7l\2\2\u0099\u009a\5<\37\2\u009a"+
		"\u009b\7\u00f3\2\2\u009b\u01c9\3\2\2\2\u009c\u00a8\t\n\2\2\u009d\u009f"+
		"\7l\2\2\u009e\u00a0\t\13\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u00a3\7\u012e\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\t\f\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\u00f3\2\2\u00a8\u009d"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u01c9\3\2\2\2\u00aa\u01c9\7\63\2\2"+
		"\u00ab\u01c9\t\r\2\2\u00ac\u01c9\7\65\2\2\u00ad\u01c9\t\16\2\2\u00ae\u01c9"+
		"\7:\2\2\u00af\u01c9\t\17\2\2\u00b0\u01c9\t\20\2\2\u00b1\u01c9\7A\2\2\u00b2"+
		"\u01c9\7G\2\2\u00b3\u01c9\7J\2\2\u00b4\u01c9\t\21\2\2\u00b5\u01c9\t\22"+
		"\2\2\u00b6\u01c9\7O\2\2\u00b7\u00b8\t\23\2\2\u00b8\u00b9\7l\2\2\u00b9"+
		"\u00bc\t\24\2\2\u00ba\u00bb\7\u012e\2\2\u00bb\u00bd\t\24\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u01c9\7\u00f3\2"+
		"\2\u00bf\u00c0\7Q\2\2\u00c0\u00c1\7l\2\2\u00c1\u00c4\t\25\2\2\u00c2\u00c3"+
		"\7\u012e\2\2\u00c3\u00c5\t\26\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u01c9\7\u00f3\2\2\u00c7\u01c9\7T\2\2\u00c8"+
		"\u01c9\7U\2\2\u00c9\u00ca\7Z\2\2\u00ca\u00cb\7l\2\2\u00cb\u00cc\t\27\2"+
		"\2\u00cc\u01c9\7\u00f3\2\2\u00cd\u00ce\t\30\2\2\u00ce\u00cf\7l\2\2\u00cf"+
		"\u00d0\t\31\2\2\u00d0\u01c9\7\u00f3\2\2\u00d1\u01c9\7a\2\2\u00d2\u01c9"+
		"\7b\2\2\u00d3\u01c9\7c\2\2\u00d4\u01c9\7e\2\2\u00d5\u00d6\t\32\2\2\u00d6"+
		"\u00d7\7l\2\2\u00d7\u00d8\5<\37\2\u00d8\u00d9\7\u00f3\2\2\u00d9\u01c9"+
		"\3\2\2\2\u00da\u01c9\7g\2\2\u00db\u01c9\7h\2\2\u00dc\u01c9\7n\2\2\u00dd"+
		"\u00de\7o\2\2\u00de\u00df\7l\2\2\u00df\u00e0\5<\37\2\u00e0\u00e1\7\u012e"+
		"\2\2\u00e1\u00e4\5<\37\2\u00e2\u00e3\7\u012e\2\2\u00e3\u00e5\5<\37\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\u00f3"+
		"\2\2\u00e7\u01c9\3\2\2\2\u00e8\u00ec\t\33\2\2\u00e9\u00ea\7l\2\2\u00ea"+
		"\u00eb\t\34\2\2\u00eb\u00ed\7\u00f3\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u01c9\3\2\2\2\u00ee\u00f2\7u\2\2\u00ef\u00f0\7l\2\2\u00f0"+
		"\u00f1\t\35\2\2\u00f1\u00f3\7\u00f3\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u01c9\3\2\2\2\u00f4\u00f5\7x\2\2\u00f5\u00f6\7l\2\2\u00f6"+
		"\u00f7\t\36\2\2\u00f7\u01c9\7\u00f3\2\2\u00f8\u01c9\7{\2\2\u00f9\u01c9"+
		"\7|\2\2\u00fa\u01c9\7~\2\2\u00fb\u01c9\7\177\2\2\u00fc\u01c9\7\u0081\2"+
		"\2\u00fd\u01c9\7\u0082\2\2\u00fe\u01c9\7\u0083\2\2\u00ff\u0103\t\37\2"+
		"\2\u0100\u0101\7l\2\2\u0101\u0102\t \2\2\u0102\u0104\7\u00f3\2\2\u0103"+
		"\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u01c9\3\2\2\2\u0105\u01c9\7\u0085"+
		"\2\2\u0106\u01c9\t!\2\2\u0107\u01c9\t\"\2\2\u0108\u01c9\7\u008a\2\2\u0109"+
		"\u01c9\7\u008c\2\2\u010a\u01c9\t#\2\2\u010b\u01c9\7\u008f\2\2\u010c\u01c9"+
		"\7\u008b\2\2\u010d\u01c9\t$\2\2\u010e\u01c9\t%\2\2\u010f\u01c9\t&\2\2"+
		"\u0110\u01c9\7\u0096\2\2\u0111\u01c9\7\u0098\2\2\u0112\u01c9\7\u0099\2"+
		"\2\u0113\u01c9\t\'\2\2\u0114\u01c9\t(\2\2\u0115\u01c9\7\u009e\2\2\u0116"+
		"\u01c9\t)\2\2\u0117\u01c9\7\u00a0\2\2\u0118\u01c9\7\u00a1\2\2\u0119\u01c9"+
		"\7\u00a3\2\2\u011a\u01c9\7\u00a5\2\2\u011b\u01c9\7\u00a6\2\2\u011c\u01c9"+
		"\7\u00a7\2\2\u011d\u01c9\7\u00a8\2\2\u011e\u01c9\7\u00a9\2\2\u011f\u01c9"+
		"\t*\2\2\u0120\u01c9\7\u00ac\2\2\u0121\u01c9\t+\2\2\u0122\u01c9\t,\2\2"+
		"\u0123\u01c9\t-\2\2\u0124\u01c9\7\u00b3\2\2\u0125\u01c9\t.\2\2\u0126\u01c9"+
		"\7\u00b6\2\2\u0127\u01c9\7\u00b7\2\2\u0128\u01c9\7\u00b9\2\2\u0129\u01c9"+
		"\7\u00ba\2\2\u012a\u01c9\t/\2\2\u012b\u01c9\t\60\2\2\u012c\u01c9\7\u00c0"+
		"\2\2\u012d\u01c9\7\u00c1\2\2\u012e\u01c9\t\61\2\2\u012f\u01c9\t\62\2\2"+
		"\u0130\u01c9\7\u00c6\2\2\u0131\u01c9\t\63\2\2\u0132\u01c9\7\u00ca\2\2"+
		"\u0133\u01c9\7\u00cb\2\2\u0134\u01c9\7\u00cd\2\2\u0135\u01c9\t\64\2\2"+
		"\u0136\u01c9\7\u00d4\2\2\u0137\u0138\t\65\2\2\u0138\u0139\7l\2\2\u0139"+
		"\u013a\t\66\2\2\u013a\u01c9\7\u00f3\2\2\u013b\u01c9\7\u00cd\2\2\u013c"+
		"\u01c9\t\67\2\2\u013d\u01c9\7\u00d2\2\2\u013e\u01c9\t8\2\2\u013f\u0140"+
		"\7\u00d8\2\2\u0140\u0141\7l\2\2\u0141\u0142\t9\2\2\u0142\u01c9\7\u00f3"+
		"\2\2\u0143\u01c9\t:\2\2\u0144\u01c9\t;\2\2\u0145\u0146\7\u00e0\2\2\u0146"+
		"\u0147\7l\2\2\u0147\u0148\5<\37\2\u0148\u0149\7\u012e\2\2\u0149\u014c"+
		"\5<\37\2\u014a\u014b\7\u012e\2\2\u014b\u014d\5<\37\2\u014c\u014a\3\2\2"+
		"\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\u00f3\2\2\u014f"+
		"\u01c9\3\2\2\2\u0150\u0151\7\u00e1\2\2\u0151\u0152\7l\2\2\u0152\u0153"+
		"\5<\37\2\u0153\u0154\7\u012e\2\2\u0154\u0155\5<\37\2\u0155\u0156\7\u00f3"+
		"\2\2\u0156\u01c9\3\2\2\2\u0157\u015b\t<\2\2\u0158\u0159\7l\2\2\u0159\u015a"+
		"\t=\2\2\u015a\u015c\7\u00f3\2\2\u015b\u0158\3\2\2\2\u015b\u015c\3\2\2"+
		"\2\u015c\u01c9\3\2\2\2\u015d\u01c9\7\u00e3\2\2\u015e\u01c9\7\u00e5\2\2"+
		"\u015f\u01c9\7\u00df\2\2\u0160\u0161\t>\2\2\u0161\u0162\7l\2\2\u0162\u0163"+
		"\5:\36\2\u0163\u0164\7\u00f3\2\2\u0164\u01c9\3\2\2\2\u0165\u0166\t?\2"+
		"\2\u0166\u0167\7l\2\2\u0167\u0168\t@\2\2\u0168\u01c9\7\u00f3\2\2\u0169"+
		"\u01c9\7\u00ed\2\2\u016a\u01c9\tA\2\2\u016b\u01c9\7\u00ef\2\2\u016c\u016d"+
		"\7\u00f2\2\2\u016d\u0171\7l\2\2\u016e\u0172\7\26\2\2\u016f\u0172\7\32"+
		"\2\2\u0170\u0172\5<\37\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u01c9\7\u00f3\2\2\u0174\u017b"+
		"\tB\2\2\u0175\u0176\7l\2\2\u0176\u0177\5<\37\2\u0177\u0178\7\u012e\2\2"+
		"\u0178\u0179\5<\37\2\u0179\u017a\7\u00f3\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0175\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u01c9\3\2\2\2\u017d\u017e\tC"+
		"\2\2\u017e\u0181\7l\2\2\u017f\u0182\7p\2\2\u0180\u0182\5<\37\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u01c9\7\u00f3\2"+
		"\2\u0184\u01c9\tD\2\2\u0185\u01c9\7\u00fb\2\2\u0186\u0187\7\u00fc\2\2"+
		"\u0187\u0188\7l\2\2\u0188\u0189\5<\37\2\u0189\u018a\7\u00f3\2\2\u018a"+
		"\u01c9\3\2\2\2\u018b\u01c9\7\u00fd\2\2\u018c\u0191\7\u00fe\2\2\u018d\u018e"+
		"\7l\2\2\u018e\u018f\5<\37\2\u018f\u0190\7\u00f3\2\2\u0190\u0192\3\2\2"+
		"\2\u0191\u018d\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u01c9\3\2\2\2\u0193\u01c9"+
		"\tE\2\2\u0194\u01c9\tF\2\2\u0195\u01c9\7\u010a\2\2\u0196\u01c9\tG\2\2"+
		"\u0197\u01a9\7\u010e\2\2\u0198\u019a\7l\2\2\u0199\u019b\tH\2\2\u019a\u0199"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019e\7\u012e\2"+
		"\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1"+
		"\tI\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a4\7\u012e\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u01a7\tJ\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01aa\7\u00f3\2\2\u01a9\u0198\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01c9\3\2\2\2\u01ab\u01c9\7\u010f\2\2\u01ac\u01ad\7\u0112"+
		"\2\2\u01ad\u01ae\7l\2\2\u01ae\u01af\tK\2\2\u01af\u01c9\7\u00f3\2\2\u01b0"+
		"\u01c9\7\u0115\2\2\u01b1\u01b2\tL\2\2\u01b2\u01b3\7l\2\2\u01b3\u01b4\5"+
		":\36\2\u01b4\u01b5\7\u00f3\2\2\u01b5\u01c9\3\2\2\2\u01b6\u01b7\tM\2\2"+
		"\u01b7\u01b8\7l\2\2\u01b8\u01b9\tN\2\2\u01b9\u01c9\7\u00f3\2\2\u01ba\u01c0"+
		"\tO\2\2\u01bb\u01bd\7l\2\2\u01bc\u01be\tP\2\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7\u00f3\2\2\u01c0\u01bb"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c9\3\2\2\2\u01c2\u01c3\tQ\2\2\u01c3"+
		"\u01c4\7l\2\2\u01c4\u01c5\5<\37\2\u01c5\u01c6\7\u00f3\2\2\u01c6\u01c9"+
		"\3\2\2\2\u01c7\u01c9\7\u011f\2\2\u01c8r\3\2\2\2\u01c8s\3\2\2\2\u01c8t"+
		"\3\2\2\2\u01c8u\3\2\2\2\u01c8y\3\2\2\2\u01c8z\3\2\2\2\u01c8{\3\2\2\2\u01c8"+
		"\u0080\3\2\2\2\u01c8\u0081\3\2\2\2\u01c8\u0088\3\2\2\2\u01c8\u0089\3\2"+
		"\2\2\u01c8\u008a\3\2\2\2\u01c8\u008f\3\2\2\2\u01c8\u0090\3\2\2\2\u01c8"+
		"\u0091\3\2\2\2\u01c8\u0092\3\2\2\2\u01c8\u0097\3\2\2\2\u01c8\u009c\3\2"+
		"\2\2\u01c8\u00aa\3\2\2\2\u01c8\u00ab\3\2\2\2\u01c8\u00ac\3\2\2\2\u01c8"+
		"\u00ad\3\2\2\2\u01c8\u00ae\3\2\2\2\u01c8\u00af\3\2\2\2\u01c8\u00b0\3\2"+
		"\2\2\u01c8\u00b1\3\2\2\2\u01c8\u00b2\3\2\2\2\u01c8\u00b3\3\2\2\2\u01c8"+
		"\u00b4\3\2\2\2\u01c8\u00b5\3\2\2\2\u01c8\u00b6\3\2\2\2\u01c8\u00b7\3\2"+
		"\2\2\u01c8\u00bf\3\2\2\2\u01c8\u00c7\3\2\2\2\u01c8\u00c8\3\2\2\2\u01c8"+
		"\u00c9\3\2\2\2\u01c8\u00cd\3\2\2\2\u01c8\u00d1\3\2\2\2\u01c8\u00d2\3\2"+
		"\2\2\u01c8\u00d3\3\2\2\2\u01c8\u00d4\3\2\2\2\u01c8\u00d5\3\2\2\2\u01c8"+
		"\u00da\3\2\2\2\u01c8\u00db\3\2\2\2\u01c8\u00dc\3\2\2\2\u01c8\u00dd\3\2"+
		"\2\2\u01c8\u00e8\3\2\2\2\u01c8\u00ee\3\2\2\2\u01c8\u00f4\3\2\2\2\u01c8"+
		"\u00f8\3\2\2\2\u01c8\u00f9\3\2\2\2\u01c8\u00fa\3\2\2\2\u01c8\u00fb\3\2"+
		"\2\2\u01c8\u00fc\3\2\2\2\u01c8\u00fd\3\2\2\2\u01c8\u00fe\3\2\2\2\u01c8"+
		"\u00ff\3\2\2\2\u01c8\u0105\3\2\2\2\u01c8\u0106\3\2\2\2\u01c8\u0107\3\2"+
		"\2\2\u01c8\u0108\3\2\2\2\u01c8\u0109\3\2\2\2\u01c8\u010a\3\2\2\2\u01c8"+
		"\u010b\3\2\2\2\u01c8\u010c\3\2\2\2\u01c8\u010d\3\2\2\2\u01c8\u010e\3\2"+
		"\2\2\u01c8\u010f\3\2\2\2\u01c8\u0110\3\2\2\2\u01c8\u0111\3\2\2\2\u01c8"+
		"\u0112\3\2\2\2\u01c8\u0113\3\2\2\2\u01c8\u0114\3\2\2\2\u01c8\u0115\3\2"+
		"\2\2\u01c8\u0116\3\2\2\2\u01c8\u0117\3\2\2\2\u01c8\u0118\3\2\2\2\u01c8"+
		"\u0119\3\2\2\2\u01c8\u011a\3\2\2\2\u01c8\u011b\3\2\2\2\u01c8\u011c\3\2"+
		"\2\2\u01c8\u011d\3\2\2\2\u01c8\u011e\3\2\2\2\u01c8\u011f\3\2\2\2\u01c8"+
		"\u0120\3\2\2\2\u01c8\u0121\3\2\2\2\u01c8\u0122\3\2\2\2\u01c8\u0123\3\2"+
		"\2\2\u01c8\u0124\3\2\2\2\u01c8\u0125\3\2\2\2\u01c8\u0126\3\2\2\2\u01c8"+
		"\u0127\3\2\2\2\u01c8\u0128\3\2\2\2\u01c8\u0129\3\2\2\2\u01c8\u012a\3\2"+
		"\2\2\u01c8\u012b\3\2\2\2\u01c8\u012c\3\2\2\2\u01c8\u012d\3\2\2\2\u01c8"+
		"\u012e\3\2\2\2\u01c8\u012f\3\2\2\2\u01c8\u0130\3\2\2\2\u01c8\u0131\3\2"+
		"\2\2\u01c8\u0132\3\2\2\2\u01c8\u0133\3\2\2\2\u01c8\u0134\3\2\2\2\u01c8"+
		"\u0135\3\2\2\2\u01c8\u0136\3\2\2\2\u01c8\u0137\3\2\2\2\u01c8\u013b\3\2"+
		"\2\2\u01c8\u013c\3\2\2\2\u01c8\u013d\3\2\2\2\u01c8\u013e\3\2\2\2\u01c8"+
		"\u013f\3\2\2\2\u01c8\u0143\3\2\2\2\u01c8\u0144\3\2\2\2\u01c8\u0145\3\2"+
		"\2\2\u01c8\u0150\3\2\2\2\u01c8\u0157\3\2\2\2\u01c8\u015d\3\2\2\2\u01c8"+
		"\u015e\3\2\2\2\u01c8\u015f\3\2\2\2\u01c8\u0160\3\2\2\2\u01c8\u0165\3\2"+
		"\2\2\u01c8\u0169\3\2\2\2\u01c8\u016a\3\2\2\2\u01c8\u016b\3\2\2\2\u01c8"+
		"\u016c\3\2\2\2\u01c8\u0174\3\2\2\2\u01c8\u017d\3\2\2\2\u01c8\u0184\3\2"+
		"\2\2\u01c8\u0185\3\2\2\2\u01c8\u0186\3\2\2\2\u01c8\u018b\3\2\2\2\u01c8"+
		"\u018c\3\2\2\2\u01c8\u0193\3\2\2\2\u01c8\u0194\3\2\2\2\u01c8\u0195\3\2"+
		"\2\2\u01c8\u0196\3\2\2\2\u01c8\u0197\3\2\2\2\u01c8\u01ab\3\2\2\2\u01c8"+
		"\u01ac\3\2\2\2\u01c8\u01b0\3\2\2\2\u01c8\u01b1\3\2\2\2\u01c8\u01b6\3\2"+
		"\2\2\u01c8\u01ba\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\13\3\2\2\2\u01ca\u01cb\7\3\2\2\u01cb\r\3\2\2\2\u01cc\u01cd\7I\2\2\u01cd"+
		"\u01ce\7#\2\2\u01ce\u01cf\5\64\33\2\u01cf\u01d1\7F\2\2\u01d0\u01d2\7\u012f"+
		"\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\17\3\2\2\2\u01d3\u01d4"+
		"\7I\2\2\u01d4\u01d5\7\u00fe\2\2\u01d5\u01d6\5\66\34\2\u01d6\u01d8\7F\2"+
		"\2\u01d7\u01d9\7\u012f\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\21\3\2\2\2\u01da\u01db\7I\2\2\u01db\u01dc\7\u0101\2\2\u01dc\u01dd\5\64"+
		"\33\2\u01dd\u01df\7F\2\2\u01de\u01e0\7\u012f\2\2\u01df\u01de\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\23\3\2\2\2\u01e1\u01e2\7*\2\2\u01e2\u01f1\5\26\f"+
		"\2\u01e3\u01e5\7\u0136\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ed\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ee\5$\23\2\u01ea\u01ee\5&\24\2\u01eb\u01ee\5\32\16\2\u01ec"+
		"\u01ee\7\u0109\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01e6\3\2\2\2\u01f0"+
		"\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f7\3\2"+
		"\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\7\u0136\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7\u012f\2\2\u01fb\25\3\2\2\2\u01fc"+
		"\u0200\5<\37\2\u01fd\u0200\5:\36\2\u01fe\u0200\5> \2\u01ff\u01fc\3\2\2"+
		"\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u0202"+
		"\tR\2\2\u0202\u0204\5\30\r\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\27\3\2\2\2\u0205\u0208\5<\37\2\u0206\u0208\5:\36\2\u0207\u0205\3\2\2"+
		"\2\u0207\u0206\3\2\2\2\u0208\31\3\2\2\2\u0209\u020d\7\u00f1\2\2\u020a"+
		"\u020c\7\u0136\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0219\5\"\22\2\u0211\u0213\7\u0136\2\2\u0212\u0211\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\5\"\22\2\u0217\u0212\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3"+
		"\2\2\2\u0219\u021a\3\2\2\2\u021a\33\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u0221\5\36\20\2\u021d\u0220\5\24\13\2\u021e\u0220\5\64\33\2\u021f\u021d"+
		"\3\2\2\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0226\5 "+
		"\21\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\35\3\2\2\2\u0227\u022f"+
		"\7\u00f0\2\2\u0228\u022a\7\u0136\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3"+
		"\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u0230\5\"\22\2\u022f\u022b\3\2\2\2\u0230\u0231\3"+
		"\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0236\3\2\2\2\u0233"+
		"\u0235\7\u0136\2\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023a\7\u012f\2\2\u023a\37\3\2\2\2\u023b\u023c\7\u00f0\2\2\u023c\u0240"+
		"\7\u00dc\2\2\u023d\u023f\7\u0136\2\2\u023e\u023d\3\2\2\2\u023f\u0242\3"+
		"\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0244\7\u012f\2\2\u0244!\3\2\2\2\u0245\u0249\5(\25"+
		"\2\u0246\u0248\7\u0136\2\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024c\u0250\7 \2\2\u024d\u024f\7\u0136\2\2\u024e\u024d\3\2\2\2\u024f"+
		"\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0253\u025b\5*\26\2\u0254\u0256\7\u0136\2\2\u0255"+
		"\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025c\5$\23\2\u025b"+
		"\u0257\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0264\3\2\2\2\u025d\u025f\7\u0136"+
		"\2\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0265\5&"+
		"\24\2\u0264\u0260\3\2\2\2\u0264\u0265\3\2\2\2\u0265#\3\2\2\2\u0266\u026a"+
		"\tR\2\2\u0267\u0269\7\u0136\2\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2"+
		"\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026f\3\2\2\2\u026c\u026a"+
		"\3\2\2\2\u026d\u0270\5<\37\2\u026e\u0270\5:\36\2\u026f\u026d\3\2\2\2\u026f"+
		"\u026e\3\2\2\2\u0270%\3\2\2\2\u0271\u0275\7\u00de\2\2\u0272\u0274\7\u0136"+
		"\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u027a\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027b\5<"+
		"\37\2\u0279\u027b\5:\36\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027b"+
		"\'\3\2\2\2\u027c\u0281\5<\37\2\u027d\u0281\5:\36\2\u027e\u0281\5\62\32"+
		"\2\u027f\u0281\58\35\2\u0280\u027c\3\2\2\2\u0280\u027d\3\2\2\2\u0280\u027e"+
		"\3\2\2\2\u0280\u027f\3\2\2\2\u0281)\3\2\2\2\u0282\u0287\5<\37\2\u0283"+
		"\u0287\5:\36\2\u0284\u0287\5\62\32\2\u0285\u0287\58\35\2\u0286\u0282\3"+
		"\2\2\2\u0286\u0283\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287"+
		"+\3\2\2\2\u0288\u028a\7B\2\2\u0289\u028b\7\u012f\2\2\u028a\u0289\3\2\2"+
		"\2\u028a\u028b\3\2\2\2\u028b-\3\2\2\2\u028c\u028e\tS\2\2\u028d\u028f\7"+
		"\u012f\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f/\3\2\2\2\u0290"+
		"\u0291\7\u0110\2\2\u0291\u0293\5<\37\2\u0292\u0294\7\u012f\2\2\u0293\u0292"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\61\3\2\2\2\u0295\u0297\7\u0130\2\2"+
		"\u0296\u0298\5\64\33\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u029a\7\u0130\2\2\u029a\63\3\2\2\2\u029b\u029e\58\35\2"+
		"\u029c\u029e\7\u0136\2\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\65\3\2\2"+
		"\2\u02a1\u02a6\58\35\2\u02a2\u02a6\7*\2\2\u02a3\u02a6\7\u00f0\2\2\u02a4"+
		"\u02a6\7\u0136\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a3"+
		"\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\67\3\2\2\2\u02a9\u02b2\5:\36\2\u02aa\u02b2\5<\37"+
		"\2\u02ab\u02b2\5> \2\u02ac\u02b2\7\u0135\2\2\u02ad\u02b2\7\u013a\2\2\u02ae"+
		"\u02b2\7\u012f\2\2\u02af\u02b2\7l\2\2\u02b0\u02b2\7\u00f3\2\2\u02b1\u02a9"+
		"\3\2\2\2\u02b1\u02aa\3\2\2\2\u02b1\u02ab\3\2\2\2\u02b1\u02ac\3\2\2\2\u02b1"+
		"\u02ad\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2"+
		"\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"9\3\2\2\2\u02b5\u02b8\7\u0133\2\2\u02b6\u02b8\5@!\2\u02b7\u02b5\3\2\2"+
		"\2\u02b7\u02b6\3\2\2\2\u02b8;\3\2\2\2\u02b9\u02ba\tT\2\2\u02ba=\3\2\2"+
		"\2\u02bb\u02bc\7\u0134\2\2\u02bc?\3\2\2\2\u02bd\u02be\tU\2\2\u02beA\3"+
		"\2\2\2NPR\\`bhm\u0086\u009f\u00a2\u00a5\u00a8\u00bc\u00c4\u00e4\u00ec"+
		"\u00f2\u0103\u014c\u015b\u0171\u017b\u0181\u0191\u019a\u019d\u01a0\u01a3"+
		"\u01a6\u01a9\u01bd\u01c0\u01c8\u01d1\u01d8\u01df\u01e6\u01ed\u01f1\u01f7"+
		"\u01ff\u0203\u0207\u020d\u0214\u0219\u021f\u0221\u0225\u022b\u0231\u0236"+
		"\u0240\u0249\u0250\u0257\u025b\u0260\u0264\u026a\u026f\u0275\u027a\u0280"+
		"\u0286\u028a\u028e\u0293\u0297\u029d\u029f\u02a5\u02a7\u02b1\u02b3\u02b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}