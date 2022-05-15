// Generated from src/CobolPreprocessorParser.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASSIC_COMMENT_TAG=1, CLASSIC_CONTINUATION=2, CLASSIC_LINE_NUMBER=3, 
		CLASSIC_EOL_COMMENT=4, ID_DIVISION_TAG=5, NIST_FLAG1=6, NIST_FLAG2=7, 
		NIST_IGNORED_LINE=8, ABD=9, ADATA=10, ADV=11, AFP=12, ALIAS=13, ALPHNUM=14, 
		ANSI=15, ANY=16, APOST=17, AR=18, ARCH=19, ARITH=20, AUTO=21, AWO=22, 
		BASIS=23, BIN=24, BLOCK0=25, BUF=26, BUFSIZE=27, BY=28, CBL=29, CBLCARD=30, 
		CICS=31, CLEANSIGN=32, CO=33, COBOL2=34, COBOL3=35, CODEPAGE=36, COMPAT=37, 
		COMPILE=38, COPY=39, COPYLOC=40, COPYRIGHT=41, CP=42, CPLC=43, CPP=44, 
		CPSM=45, CPYR=46, CS=47, CURR=48, CURRENCY=49, DATA=50, DATEPROC=51, DBCS=52, 
		DD=53, DEBUG=54, DEC=55, DECK=56, DEF=57, DEFINE=58, DELETE=59, DFHVALUE=60, 
		DIAGTRUNC=61, DISPSIGN=62, DIVISION=63, DLI=64, DLL=65, DP=66, DS=67, 
		DSN=68, DSNAME=69, DTR=70, DU=71, DUMP=72, DWARF=73, DYN=74, DYNAM=75, 
		EDF=76, EJECT=77, EJPD=78, EN=79, ENDP=80, ENDPERIOD=81, ENGLISH=82, END_EXEC=83, 
		EPILOG=84, EVENP=85, EVENPACK=86, EXCI=87, EXEC=88, EXEC_CICS=89, EXEC_SQL=90, 
		EXIT=91, EXP=92, EXPORTALL=93, EXTEND=94, FASTSRT=95, FEPI=96, FLAG=97, 
		FLAGSTD=98, FNC=99, FORCENUMCMP=100, FSRT=101, FULL=102, GDS=103, GRAPHIC=104, 
		HEX=105, HGPR=106, HOOK=107, IC=108, ID=109, IDENTIFICATION=110, IN=111, 
		INITCHECK=112, INTDATE=113, INITIAL=114, INL=115, INLINE=116, INSERT=117, 
		INVD=118, INVDATA=119, JA=120, JP=121, KA=122, LANG=123, LANGUAGE=124, 
		LAX=125, LAXPERF=126, LAXREDEF=127, LC=128, LEADING=129, LEASM=130, LENGTH=131, 
		LIB=132, LILIAN=133, LIN=134, LINECOUNT=135, LINKAGE=136, LIST=137, LM=138, 
		LONGMIXED=139, LONGUPPER=140, LP=141, LPARENCHAR=142, LU=143, LXPRF=144, 
		MAP=145, MARGINS=146, MAX=147, MD=148, MDECK=149, MIG=150, MIXED=151, 
		MAXPCF=152, MSG=153, NAME=154, NAT=155, NATIONAL=156, NATLANG=157, NC=158, 
		NN=159, NO=160, NOADATA=161, NOADV=162, NOALIAS=163, NOALPHNUM=164, NOAWO=165, 
		NOBIN=166, NOBLOCK0=167, NOC=168, NOCBLCARD=169, NOCICS=170, NOCLEANSIGN=171, 
		NOCMPR2=172, NOCOMPILE=173, NOCOPYLOC=174, NOCOPYRIGHT=175, NOCPLC=176, 
		NOCPSM=177, NOCPYR=178, NOCS=179, NOCURR=180, NOCURRENCY=181, NOD=182, 
		NODATEPROC=183, NODBCS=184, NODE=185, NODEBUG=186, NODECK=187, NODEFINE=188, 
		NODEF=189, NODIAGTRUNC=190, NODLL=191, NODSNAME=192, NODU=193, NODUMP=194, 
		NODP=195, NODTR=196, NODWARF=197, NODYN=198, NODYNAM=199, NOEDF=200, NOEJPD=201, 
		NOENDP=202, NOENDPERIOD=203, NOEPILOG=204, NOEVENP=205, NOEVENPACK=206, 
		NOEXIT=207, NOEXP=208, NOEXPORTALL=209, NOF=210, NOFASTSRT=211, NOFEPI=212, 
		NOFLAG=213, NOFLAGMIG=214, NOFLAGSTD=215, NOFNC=216, NOFORCENUMCMP=217, 
		NOFSRT=218, NOGRAPHIC=219, NOHOOK=220, NOINITCHECK=221, NOIC=222, NOINITIAL=223, 
		NOINLINE=224, NOINL=225, NOINVD=226, NOINVDATA=227, NOLAXPERF=228, NOLAXREDEF=229, 
		NOLENGTH=230, NOLIB=231, NOLINKAGE=232, NOLIST=233, NOLXPRF=234, NOMAP=235, 
		NOMD=236, NOMDECK=237, NONAME=238, NONUM=239, NONUMBER=240, NOOBJ=241, 
		NOOBJECT=242, NOOMITODOMIN=243, NOOFF=244, NOOFFSET=245, NOOOM=246, NOOPSEQUENCE=247, 
		NOOPT=248, NOOPTIMIZE=249, NOOPTIONS=250, NOP=251, NOPAC=252, NOPARMCHECK=253, 
		NOPFD=254, NOPRESERVE=255, NOPROLOG=256, NORENT=257, NORULES=258, NOS=259, 
		NOSEP=260, NOSEPARATE=261, NOSEQ=262, NOSERV=263, NOSERVICE=264, NOSLACKBYTES=265, 
		NOSLCKB=266, NOSO=267, NOSOURCE=268, NOSPIE=269, NOSQL=270, NOSQLC=271, 
		NOSQLCCSID=272, NOSQLIMS=273, NOSSR=274, NOSSRANGE=275, NOSTDTRUNC=276, 
		NOSEQUENCE=277, NOSTGOPT=278, NOSUPP=279, NOSUPPRESS=280, NOTERM=281, 
		NOTERMINAL=282, NOTEST=283, NOTHREAD=284, NOTRIG=285, NOTRUNCBIN=286, 
		NOUNRA=287, NOUNREFALL=288, NOUNREFSOURCE=289, NOUNRS=290, NOVBREF=291, 
		NOVOLATILE=292, NOWD=293, NOWORD=294, NOX=295, NOXREF=296, NOZC=297, NOZLEN=298, 
		NOZON=299, NOZONECHECK=300, NOZWB=301, NS=302, NSEQ=303, NSYMBOL=304, 
		NUM=305, NUMBER=306, NUMCHECK=307, NUMPROC=308, OBJ=309, OBJECT=310, OF=311, 
		OFF=312, OFFSET=313, ON=314, OMITODOMIN=315, OOM=316, OP=317, OPMARGINS=318, 
		OPSEQUENCE=319, OPT=320, OPTFILE=321, OPTIMIZE=322, OPTIONS=323, OUT=324, 
		OUTDD=325, PAC=326, PARMCHECK=327, PATH=328, PC=329, PFD=330, PPTDBG=331, 
		PGMN=332, PGMNAME=333, PRESERVE=334, PROCESS=335, PROLOG=336, QUALIFY=337, 
		QUA=338, QUOTE=339, RENT=340, REPLACE=341, REPLACING=342, RMODE=343, RPARENCHAR=344, 
		RULES=345, SEP=346, SEPARATE=347, SEQ=348, SEQUENCE=349, SERV=350, SERVICE=351, 
		SHORT=352, SIZE=353, SLACKBYTES=354, SLCKB=355, SOURCE=356, SP=357, SPACE=358, 
		SPIE=359, SQL=360, SQLC=361, SQLCCSID=362, SQLIMS=363, SKIP1=364, SKIP2=365, 
		SKIP3=366, SO=367, SS=368, SSR=369, SSRANGE=370, STANDARD=371, STD=372, 
		STGOPT=373, STRICT=374, STRICTREDEF=375, SUCC=376, SUPP=377, SUPPRESS=378, 
		SYSEIB=379, SZ=380, TERM=381, TERMINAL=382, TEST=383, THREAD=384, TITLE=385, 
		TRAILING=386, TRIG=387, TRUNC=388, TRUNCBIN=389, TUNE=390, UE=391, UNREF=392, 
		UPPER=393, VBREF=394, VLR=395, VOLATILE=396, VS=397, VSAMOPENFS=398, WD=399, 
		WORD=400, XMLPARSE=401, XMLSS=402, XOPTS=403, XP=404, XREF=405, YEARWINDOW=406, 
		YW=407, ZC=408, ZD=409, ZLEN=410, ZON=411, ZONECHECK=412, ZONEDATA=413, 
		ZWB=414, C_CHAR=415, D_CHAR=416, E_CHAR=417, F_CHAR=418, H_CHAR=419, I_CHAR=420, 
		M_CHAR=421, N_CHAR=422, O_CHAR=423, Q_CHAR=424, S_CHAR=425, U_CHAR=426, 
		W_CHAR=427, X_CHAR=428, COMMENTTAG=429, COMMACHAR=430, COMPILER_DIRECTIVE_TAG=431, 
		DOT=432, DOUBLEEQUALCHAR=433, NONNUMERICLITERAL=434, CONTINUED_NONNUMERICLITERAL=435, 
		NUMERICLITERAL=436, CONTINUED_STRINGLITERAL=437, IDENTIFIER=438, FILENAME=439, 
		PSEUDOTEXTIDENTIFIER=440, NEWLINE=441, COMMENTLINE=442, WS=443, TEXT=444, 
		BOL=445, CLASSIC_COMMENT_TEXT=446, PAGE_COMMENT_TEXT=447, CD_WS=448, CD_CLASSIC_EOL_COMMENT=449, 
		ASTERISKCHAR=450, EQUALCHAR=451, GREATERTHANCHAR=452, LESSTHANCHAR=453, 
		PLUSCHAR=454, MINUSCHAR=455, SLASHCHAR=456, NOTEQUALCHAR=457, GREATEROREQUALCHAR=458, 
		LESSOREQUALCHAR=459, ZERO=460, ALL=461, AS=462, AND=463, CALL_CONVENTION=464, 
		CALLINT=465, CALLINTERFACE=466, CHECKING=467, COBOL=468, COBOL_WORDS=469, 
		COMP_DIR_DATA=470, DISPLAY=471, DEFINED=472, DLL_INTERFACE=473, DYNAMIC=474, 
		ELSE=475, END_EVALUATE=476, END_IF=477, EQUAL=478, EQUATE=479, EVALUATE=480, 
		FIXED=481, FLAG_02=482, FLAG_14=483, FORMAT=484, COMP_DIR_FREE=485, GREATER=486, 
		IF=487, IS=488, LEAP_SECOND=489, LESS=490, LISTING=491, LOCATION=492, 
		NOT=493, COMP_DIR_OFF=494, COMP_DIR_ON=495, OR=496, OTHER=497, OVERRIDE=498, 
		PAGE=499, PARAMETER=500, POP=501, PROPOGATE=502, PUSH=503, REF_MOD_ZERO_LENGTH=504, 
		RESERVE=505, STATIC=506, SUBSTITUTE=507, THAN=508, THROUGH=509, THRU=510, 
		TO=511, TRUE=512, TURN=513, UNDEFINE=514, UPON=515, WHEN=516, WITH=517, 
		BD_WS=518, BD_CLASSIC_EOL_COMMENT=519, SQL_TEXT=520, ES_CLASSIC_LINE_NUMBER=521, 
		CICS_TEXT=522, EC_CLASSIC_LINE_NUMBER=523;
	public static final int
		RULE_startRule = 0, RULE_identificationDivisionTag = 1, RULE_compilerOptions = 2, 
		RULE_compilerXOpts = 3, RULE_compilerOption = 4, RULE_define_opt = 5, 
		RULE_identifier_et_al = 6, RULE_invdata_opts = 7, RULE_numcheck_opts = 8, 
		RULE_numcheck_zon_opts = 9, RULE_rules_opts = 10, RULE_ssrange_opts = 11, 
		RULE_test_opts = 12, RULE_classicCommentEntry = 13, RULE_execCicsStatement = 14, 
		RULE_execSqlStatement = 15, RULE_execSqlImsStatement = 16, RULE_copyStatement = 17, 
		RULE_copySource = 18, RULE_copyLibrary = 19, RULE_replacingPhrase = 20, 
		RULE_replaceArea = 21, RULE_replaceByStatement = 22, RULE_replaceOffStatement = 23, 
		RULE_replaceClause = 24, RULE_directoryPhrase = 25, RULE_familyPhrase = 26, 
		RULE_replaceable = 27, RULE_replacement = 28, RULE_ejectStatement = 29, 
		RULE_skipStatement = 30, RULE_titleStatement = 31, RULE_pseudoText = 32, 
		RULE_charData = 33, RULE_charDataSql = 34, RULE_charDataLine = 35, RULE_cobolWord = 36, 
		RULE_literal = 37, RULE_filename = 38, RULE_dfhvalue = 39, RULE_compilerDirectiveStatement = 40, 
		RULE_compilerDirective = 41, RULE_conditionalCompilationStatement = 42, 
		RULE_compilerDirectiveCallInterface = 43, RULE_compilerDirectiveInline = 44, 
		RULE_compilerDirectiveBasis = 45, RULE_basisName = 46, RULE_compilerDirectiveInsert = 47, 
		RULE_compilerDirectiveDelete = 48, RULE_compilerDirectiveData = 49, RULE_compilerDirectiveCallConvention = 50, 
		RULE_compilerDirectiveCobolWords = 51, RULE_compilerDirectiveDisplay = 52, 
		RULE_compilerDirectiveFlag02 = 53, RULE_compilerDirectiveFlag14 = 54, 
		RULE_compilerDirectiveLeapSecond = 55, RULE_compilerDirectiveListing = 56, 
		RULE_compilerDirectivePage = 57, RULE_compilerDirectivePop = 58, RULE_compilerDirectivePropogate = 59, 
		RULE_compilerDirectivePush = 60, RULE_compilerDirectiveRefModZeroLength = 61, 
		RULE_compilerDirectiveSource = 62, RULE_compilerDirectiveTurn = 63, RULE_compilerDirectivePopList = 64, 
		RULE_compilerDirectiveCobolWordsEquate = 65, RULE_compilerDirectiveCobolWordsUndefine = 66, 
		RULE_compilerDirectiveCobolWordsSubstitute = 67, RULE_compilerDirectiveCobolWordsReserve = 68, 
		RULE_compilerDirectiveNumericRange = 69, RULE_compilerDirectiveNumericAtom = 70, 
		RULE_compilerDirectiveDeleteSequenceNumber = 71, RULE_conditionalCompilationDefine = 72, 
		RULE_conditionalCompilationDefinePredicate = 73, RULE_conditionalCompilationArithmeticExpression = 74, 
		RULE_conditionalCompilationArithmeticAtom = 75, RULE_conditionalCompilationArithmeticOp = 76, 
		RULE_conditionalCompilationIf = 77, RULE_conditionalCompilationElse = 78, 
		RULE_conditionalCompilationEndIf = 79, RULE_conditionalCompilationEvaluateSelection = 80, 
		RULE_conditionalCompilationEvaluate = 81, RULE_conditionalCompilationWhen = 82, 
		RULE_conditionalCompilationEndEvaluate = 83, RULE_conditionalCompilationComparisonOp = 84, 
		RULE_conditionalCompilationRelationalCondition = 85, RULE_conditionalCompilationCondition = 86, 
		RULE_conditionalCompilationSimpleRelationalCondition = 87, RULE_conditionalCompilationBinaryCondition = 88, 
		RULE_conditionalCompilationDefinedCondition = 89, RULE_charDataKeyword = 90;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "identificationDivisionTag", "compilerOptions", "compilerXOpts", 
			"compilerOption", "define_opt", "identifier_et_al", "invdata_opts", "numcheck_opts", 
			"numcheck_zon_opts", "rules_opts", "ssrange_opts", "test_opts", "classicCommentEntry", 
			"execCicsStatement", "execSqlStatement", "execSqlImsStatement", "copyStatement", 
			"copySource", "copyLibrary", "replacingPhrase", "replaceArea", "replaceByStatement", 
			"replaceOffStatement", "replaceClause", "directoryPhrase", "familyPhrase", 
			"replaceable", "replacement", "ejectStatement", "skipStatement", "titleStatement", 
			"pseudoText", "charData", "charDataSql", "charDataLine", "cobolWord", 
			"literal", "filename", "dfhvalue", "compilerDirectiveStatement", "compilerDirective", 
			"conditionalCompilationStatement", "compilerDirectiveCallInterface", 
			"compilerDirectiveInline", "compilerDirectiveBasis", "basisName", "compilerDirectiveInsert", 
			"compilerDirectiveDelete", "compilerDirectiveData", "compilerDirectiveCallConvention", 
			"compilerDirectiveCobolWords", "compilerDirectiveDisplay", "compilerDirectiveFlag02", 
			"compilerDirectiveFlag14", "compilerDirectiveLeapSecond", "compilerDirectiveListing", 
			"compilerDirectivePage", "compilerDirectivePop", "compilerDirectivePropogate", 
			"compilerDirectivePush", "compilerDirectiveRefModZeroLength", "compilerDirectiveSource", 
			"compilerDirectiveTurn", "compilerDirectivePopList", "compilerDirectiveCobolWordsEquate", 
			"compilerDirectiveCobolWordsUndefine", "compilerDirectiveCobolWordsSubstitute", 
			"compilerDirectiveCobolWordsReserve", "compilerDirectiveNumericRange", 
			"compilerDirectiveNumericAtom", "compilerDirectiveDeleteSequenceNumber", 
			"conditionalCompilationDefine", "conditionalCompilationDefinePredicate", 
			"conditionalCompilationArithmeticExpression", "conditionalCompilationArithmeticAtom", 
			"conditionalCompilationArithmeticOp", "conditionalCompilationIf", "conditionalCompilationElse", 
			"conditionalCompilationEndIf", "conditionalCompilationEvaluateSelection", 
			"conditionalCompilationEvaluate", "conditionalCompilationWhen", "conditionalCompilationEndEvaluate", 
			"conditionalCompilationComparisonOp", "conditionalCompilationRelationalCondition", 
			"conditionalCompilationCondition", "conditionalCompilationSimpleRelationalCondition", 
			"conditionalCompilationBinaryCondition", "conditionalCompilationDefinedCondition", 
			"charDataKeyword"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "')'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'*>'", "','", 
			"'>>'", "'.'", "'=='", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'*'", "'='", "'>'", 
			"'<'", "'+'", null, "'/'", "'<>'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASSIC_COMMENT_TAG", "CLASSIC_CONTINUATION", "CLASSIC_LINE_NUMBER", 
			"CLASSIC_EOL_COMMENT", "ID_DIVISION_TAG", "NIST_FLAG1", "NIST_FLAG2", 
			"NIST_IGNORED_LINE", "ABD", "ADATA", "ADV", "AFP", "ALIAS", "ALPHNUM", 
			"ANSI", "ANY", "APOST", "AR", "ARCH", "ARITH", "AUTO", "AWO", "BASIS", 
			"BIN", "BLOCK0", "BUF", "BUFSIZE", "BY", "CBL", "CBLCARD", "CICS", "CLEANSIGN", 
			"CO", "COBOL2", "COBOL3", "CODEPAGE", "COMPAT", "COMPILE", "COPY", "COPYLOC", 
			"COPYRIGHT", "CP", "CPLC", "CPP", "CPSM", "CPYR", "CS", "CURR", "CURRENCY", 
			"DATA", "DATEPROC", "DBCS", "DD", "DEBUG", "DEC", "DECK", "DEF", "DEFINE", 
			"DELETE", "DFHVALUE", "DIAGTRUNC", "DISPSIGN", "DIVISION", "DLI", "DLL", 
			"DP", "DS", "DSN", "DSNAME", "DTR", "DU", "DUMP", "DWARF", "DYN", "DYNAM", 
			"EDF", "EJECT", "EJPD", "EN", "ENDP", "ENDPERIOD", "ENGLISH", "END_EXEC", 
			"EPILOG", "EVENP", "EVENPACK", "EXCI", "EXEC", "EXEC_CICS", "EXEC_SQL", 
			"EXIT", "EXP", "EXPORTALL", "EXTEND", "FASTSRT", "FEPI", "FLAG", "FLAGSTD", 
			"FNC", "FORCENUMCMP", "FSRT", "FULL", "GDS", "GRAPHIC", "HEX", "HGPR", 
			"HOOK", "IC", "ID", "IDENTIFICATION", "IN", "INITCHECK", "INTDATE", "INITIAL", 
			"INL", "INLINE", "INSERT", "INVD", "INVDATA", "JA", "JP", "KA", "LANG", 
			"LANGUAGE", "LAX", "LAXPERF", "LAXREDEF", "LC", "LEADING", "LEASM", "LENGTH", 
			"LIB", "LILIAN", "LIN", "LINECOUNT", "LINKAGE", "LIST", "LM", "LONGMIXED", 
			"LONGUPPER", "LP", "LPARENCHAR", "LU", "LXPRF", "MAP", "MARGINS", "MAX", 
			"MD", "MDECK", "MIG", "MIXED", "MAXPCF", "MSG", "NAME", "NAT", "NATIONAL", 
			"NATLANG", "NC", "NN", "NO", "NOADATA", "NOADV", "NOALIAS", "NOALPHNUM", 
			"NOAWO", "NOBIN", "NOBLOCK0", "NOC", "NOCBLCARD", "NOCICS", "NOCLEANSIGN", 
			"NOCMPR2", "NOCOMPILE", "NOCOPYLOC", "NOCOPYRIGHT", "NOCPLC", "NOCPSM", 
			"NOCPYR", "NOCS", "NOCURR", "NOCURRENCY", "NOD", "NODATEPROC", "NODBCS", 
			"NODE", "NODEBUG", "NODECK", "NODEFINE", "NODEF", "NODIAGTRUNC", "NODLL", 
			"NODSNAME", "NODU", "NODUMP", "NODP", "NODTR", "NODWARF", "NODYN", "NODYNAM", 
			"NOEDF", "NOEJPD", "NOENDP", "NOENDPERIOD", "NOEPILOG", "NOEVENP", "NOEVENPACK", 
			"NOEXIT", "NOEXP", "NOEXPORTALL", "NOF", "NOFASTSRT", "NOFEPI", "NOFLAG", 
			"NOFLAGMIG", "NOFLAGSTD", "NOFNC", "NOFORCENUMCMP", "NOFSRT", "NOGRAPHIC", 
			"NOHOOK", "NOINITCHECK", "NOIC", "NOINITIAL", "NOINLINE", "NOINL", "NOINVD", 
			"NOINVDATA", "NOLAXPERF", "NOLAXREDEF", "NOLENGTH", "NOLIB", "NOLINKAGE", 
			"NOLIST", "NOLXPRF", "NOMAP", "NOMD", "NOMDECK", "NONAME", "NONUM", "NONUMBER", 
			"NOOBJ", "NOOBJECT", "NOOMITODOMIN", "NOOFF", "NOOFFSET", "NOOOM", "NOOPSEQUENCE", 
			"NOOPT", "NOOPTIMIZE", "NOOPTIONS", "NOP", "NOPAC", "NOPARMCHECK", "NOPFD", 
			"NOPRESERVE", "NOPROLOG", "NORENT", "NORULES", "NOS", "NOSEP", "NOSEPARATE", 
			"NOSEQ", "NOSERV", "NOSERVICE", "NOSLACKBYTES", "NOSLCKB", "NOSO", "NOSOURCE", 
			"NOSPIE", "NOSQL", "NOSQLC", "NOSQLCCSID", "NOSQLIMS", "NOSSR", "NOSSRANGE", 
			"NOSTDTRUNC", "NOSEQUENCE", "NOSTGOPT", "NOSUPP", "NOSUPPRESS", "NOTERM", 
			"NOTERMINAL", "NOTEST", "NOTHREAD", "NOTRIG", "NOTRUNCBIN", "NOUNRA", 
			"NOUNREFALL", "NOUNREFSOURCE", "NOUNRS", "NOVBREF", "NOVOLATILE", "NOWD", 
			"NOWORD", "NOX", "NOXREF", "NOZC", "NOZLEN", "NOZON", "NOZONECHECK", 
			"NOZWB", "NS", "NSEQ", "NSYMBOL", "NUM", "NUMBER", "NUMCHECK", "NUMPROC", 
			"OBJ", "OBJECT", "OF", "OFF", "OFFSET", "ON", "OMITODOMIN", "OOM", "OP", 
			"OPMARGINS", "OPSEQUENCE", "OPT", "OPTFILE", "OPTIMIZE", "OPTIONS", "OUT", 
			"OUTDD", "PAC", "PARMCHECK", "PATH", "PC", "PFD", "PPTDBG", "PGMN", "PGMNAME", 
			"PRESERVE", "PROCESS", "PROLOG", "QUALIFY", "QUA", "QUOTE", "RENT", "REPLACE", 
			"REPLACING", "RMODE", "RPARENCHAR", "RULES", "SEP", "SEPARATE", "SEQ", 
			"SEQUENCE", "SERV", "SERVICE", "SHORT", "SIZE", "SLACKBYTES", "SLCKB", 
			"SOURCE", "SP", "SPACE", "SPIE", "SQL", "SQLC", "SQLCCSID", "SQLIMS", 
			"SKIP1", "SKIP2", "SKIP3", "SO", "SS", "SSR", "SSRANGE", "STANDARD", 
			"STD", "STGOPT", "STRICT", "STRICTREDEF", "SUCC", "SUPP", "SUPPRESS", 
			"SYSEIB", "SZ", "TERM", "TERMINAL", "TEST", "THREAD", "TITLE", "TRAILING", 
			"TRIG", "TRUNC", "TRUNCBIN", "TUNE", "UE", "UNREF", "UPPER", "VBREF", 
			"VLR", "VOLATILE", "VS", "VSAMOPENFS", "WD", "WORD", "XMLPARSE", "XMLSS", 
			"XOPTS", "XP", "XREF", "YEARWINDOW", "YW", "ZC", "ZD", "ZLEN", "ZON", 
			"ZONECHECK", "ZONEDATA", "ZWB", "C_CHAR", "D_CHAR", "E_CHAR", "F_CHAR", 
			"H_CHAR", "I_CHAR", "M_CHAR", "N_CHAR", "O_CHAR", "Q_CHAR", "S_CHAR", 
			"U_CHAR", "W_CHAR", "X_CHAR", "COMMENTTAG", "COMMACHAR", "COMPILER_DIRECTIVE_TAG", 
			"DOT", "DOUBLEEQUALCHAR", "NONNUMERICLITERAL", "CONTINUED_NONNUMERICLITERAL", 
			"NUMERICLITERAL", "CONTINUED_STRINGLITERAL", "IDENTIFIER", "FILENAME", 
			"PSEUDOTEXTIDENTIFIER", "NEWLINE", "COMMENTLINE", "WS", "TEXT", "BOL", 
			"CLASSIC_COMMENT_TEXT", "PAGE_COMMENT_TEXT", "CD_WS", "CD_CLASSIC_EOL_COMMENT", 
			"ASTERISKCHAR", "EQUALCHAR", "GREATERTHANCHAR", "LESSTHANCHAR", "PLUSCHAR", 
			"MINUSCHAR", "SLASHCHAR", "NOTEQUALCHAR", "GREATEROREQUALCHAR", "LESSOREQUALCHAR", 
			"ZERO", "ALL", "AS", "AND", "CALL_CONVENTION", "CALLINT", "CALLINTERFACE", 
			"CHECKING", "COBOL", "COBOL_WORDS", "COMP_DIR_DATA", "DISPLAY", "DEFINED", 
			"DLL_INTERFACE", "DYNAMIC", "ELSE", "END_EVALUATE", "END_IF", "EQUAL", 
			"EQUATE", "EVALUATE", "FIXED", "FLAG_02", "FLAG_14", "FORMAT", "COMP_DIR_FREE", 
			"GREATER", "IF", "IS", "LEAP_SECOND", "LESS", "LISTING", "LOCATION", 
			"NOT", "COMP_DIR_OFF", "COMP_DIR_ON", "OR", "OTHER", "OVERRIDE", "PAGE", 
			"PARAMETER", "POP", "PROPOGATE", "PUSH", "REF_MOD_ZERO_LENGTH", "RESERVE", 
			"STATIC", "SUBSTITUTE", "THAN", "THROUGH", "THRU", "TO", "TRUE", "TURN", 
			"UNDEFINE", "UPON", "WHEN", "WITH", "BD_WS", "BD_CLASSIC_EOL_COMMENT", 
			"SQL_TEXT", "ES_CLASSIC_LINE_NUMBER", "CICS_TEXT", "EC_CLASSIC_LINE_NUMBER"
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
	public String getGrammarFileName() { return "CobolPreprocessorParser.g4"; }

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
		public List<CompilerDirectiveStatementContext> compilerDirectiveStatement() {
			return getRuleContexts(CompilerDirectiveStatementContext.class);
		}
		public CompilerDirectiveStatementContext compilerDirectiveStatement(int i) {
			return getRuleContext(CompilerDirectiveStatementContext.class,i);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitStartRule(this);
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
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXEC - 64)) | (1L << (EXEC_CICS - 64)) | (1L << (EXEC_SQL - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (ID - 64)) | (1L << (IDENTIFICATION - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SKIP1 - 320)) | (1L << (SKIP2 - 320)) | (1L << (SKIP3 - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (COMPILER_DIRECTIVE_TAG - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (PLUSCHAR - 454)) | (1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0)) {
				{
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(182);
					identificationDivisionTag();
					}
					break;
				case 2:
					{
					setState(183);
					compilerOptions();
					}
					break;
				case 3:
					{
					setState(184);
					compilerDirectiveStatement();
					}
					break;
				case 4:
					{
					setState(185);
					classicCommentEntry();
					}
					break;
				case 5:
					{
					setState(186);
					copyStatement();
					}
					break;
				case 6:
					{
					setState(187);
					execCicsStatement();
					}
					break;
				case 7:
					{
					setState(188);
					execSqlStatement();
					}
					break;
				case 8:
					{
					setState(189);
					execSqlImsStatement();
					}
					break;
				case 9:
					{
					setState(190);
					replaceOffStatement();
					}
					break;
				case 10:
					{
					setState(191);
					replaceArea();
					}
					break;
				case 11:
					{
					setState(192);
					ejectStatement();
					}
					break;
				case 12:
					{
					setState(193);
					skipStatement();
					}
					break;
				case 13:
					{
					setState(194);
					titleStatement();
					}
					break;
				case 14:
					{
					setState(195);
					charDataLine();
					}
					break;
				case 15:
					{
					setState(196);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterIdentificationDivisionTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitIdentificationDivisionTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitIdentificationDivisionTag(this);
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
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDENTIFICATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(205);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerOptions(this);
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
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==CBL || _la==PROCESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(213);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADATA:
					case ADV:
					case AFP:
					case APOST:
					case AR:
					case ARCH:
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
					case COPYLOC:
					case COPYRIGHT:
					case CP:
					case CPLC:
					case CPP:
					case CPSM:
					case CPYR:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DEBUG:
					case DECK:
					case DEF:
					case DEFINE:
					case DIAGTRUNC:
					case DISPSIGN:
					case DLL:
					case DP:
					case DS:
					case DTR:
					case DU:
					case DUMP:
					case DWARF:
					case DYN:
					case DYNAM:
					case EDF:
					case EJPD:
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
					case HGPR:
					case HOOK:
					case IC:
					case INITCHECK:
					case INTDATE:
					case INITIAL:
					case INL:
					case INLINE:
					case INVD:
					case INVDATA:
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
					case LP:
					case MAP:
					case MARGINS:
					case MD:
					case MDECK:
					case MAXPCF:
					case NAME:
					case NATLANG:
					case NC:
					case NOADATA:
					case NOADV:
					case NOAWO:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCOPYLOC:
					case NOCOPYRIGHT:
					case NOCPLC:
					case NOCPSM:
					case NOCPYR:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODEFINE:
					case NODEF:
					case NODIAGTRUNC:
					case NODLL:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODWARF:
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
					case NOINITCHECK:
					case NOIC:
					case NOINITIAL:
					case NOINLINE:
					case NOINL:
					case NOINVD:
					case NOINVDATA:
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
					case NOPARMCHECK:
					case NOPROLOG:
					case NORENT:
					case NORULES:
					case NOS:
					case NOSEP:
					case NOSEPARATE:
					case NOSEQ:
					case NOSERV:
					case NOSERVICE:
					case NOSO:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSQLIMS:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOSTGOPT:
					case NOSUPP:
					case NOSUPPRESS:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOVBREF:
					case NOWD:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZC:
					case NOZONECHECK:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMCHECK:
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
					case PARMCHECK:
					case PC:
					case PGMN:
					case PGMNAME:
					case PROLOG:
					case QUALIFY:
					case QUA:
					case QUOTE:
					case RENT:
					case RMODE:
					case RULES:
					case SEP:
					case SEPARATE:
					case SEQ:
					case SEQUENCE:
					case SERV:
					case SERVICE:
					case SIZE:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SQLIMS:
					case SO:
					case SSR:
					case SSRANGE:
					case STGOPT:
					case SUPP:
					case SUPPRESS:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TRUNC:
					case TUNE:
					case VBREF:
					case VLR:
					case VS:
					case VSAMOPENFS:
					case WD:
					case WORD:
					case XMLPARSE:
					case XP:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZC:
					case ZD:
					case ZONECHECK:
					case ZONEDATA:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case F_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case X_CHAR:
					case COMMACHAR:
						{
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(208);
							match(COMMACHAR);
							}
						}

						setState(211);
						compilerOption();
						}
						break;
					case XOPTS:
						{
						setState(212);
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
				setState(215); 
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerXOpts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerXOpts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerXOpts(this);
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
			setState(217);
			match(XOPTS);
			setState(218);
			match(LPARENCHAR);
			setState(219);
			compilerOption();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AWO) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << CBLCARD) | (1L << CICS) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DEBUG) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DLL - 65)) | (1L << (DP - 65)) | (1L << (DS - 65)) | (1L << (DTR - 65)) | (1L << (DU - 65)) | (1L << (DUMP - 65)) | (1L << (DWARF - 65)) | (1L << (DYN - 65)) | (1L << (DYNAM - 65)) | (1L << (EDF - 65)) | (1L << (EJPD - 65)) | (1L << (EPILOG - 65)) | (1L << (EXIT - 65)) | (1L << (EXP - 65)) | (1L << (EXPORTALL - 65)) | (1L << (FASTSRT - 65)) | (1L << (FEPI - 65)) | (1L << (FLAG - 65)) | (1L << (FLAGSTD - 65)) | (1L << (FSRT - 65)) | (1L << (GDS - 65)) | (1L << (GRAPHIC - 65)) | (1L << (HGPR - 65)) | (1L << (HOOK - 65)) | (1L << (IC - 65)) | (1L << (INITCHECK - 65)) | (1L << (INTDATE - 65)) | (1L << (INITIAL - 65)) | (1L << (INL - 65)) | (1L << (INLINE - 65)) | (1L << (INVD - 65)) | (1L << (INVDATA - 65)) | (1L << (LANG - 65)) | (1L << (LANGUAGE - 65)) | (1L << (LC - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (LEASM - 130)) | (1L << (LENGTH - 130)) | (1L << (LIB - 130)) | (1L << (LIN - 130)) | (1L << (LINECOUNT - 130)) | (1L << (LINKAGE - 130)) | (1L << (LIST - 130)) | (1L << (LP - 130)) | (1L << (MAP - 130)) | (1L << (MARGINS - 130)) | (1L << (MD - 130)) | (1L << (MDECK - 130)) | (1L << (MAXPCF - 130)) | (1L << (NAME - 130)) | (1L << (NATLANG - 130)) | (1L << (NC - 130)) | (1L << (NOADATA - 130)) | (1L << (NOADV - 130)) | (1L << (NOAWO - 130)) | (1L << (NOBLOCK0 - 130)) | (1L << (NOC - 130)) | (1L << (NOCBLCARD - 130)) | (1L << (NOCICS - 130)) | (1L << (NOCMPR2 - 130)) | (1L << (NOCOMPILE - 130)) | (1L << (NOCOPYLOC - 130)) | (1L << (NOCOPYRIGHT - 130)) | (1L << (NOCPLC - 130)) | (1L << (NOCPSM - 130)) | (1L << (NOCPYR - 130)) | (1L << (NOCURR - 130)) | (1L << (NOCURRENCY - 130)) | (1L << (NOD - 130)) | (1L << (NODATEPROC - 130)) | (1L << (NODBCS - 130)) | (1L << (NODE - 130)) | (1L << (NODEBUG - 130)) | (1L << (NODECK - 130)) | (1L << (NODEFINE - 130)) | (1L << (NODEF - 130)) | (1L << (NODIAGTRUNC - 130)) | (1L << (NODLL - 130)) | (1L << (NODU - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (NODUMP - 194)) | (1L << (NODP - 194)) | (1L << (NODTR - 194)) | (1L << (NODWARF - 194)) | (1L << (NODYN - 194)) | (1L << (NODYNAM - 194)) | (1L << (NOEDF - 194)) | (1L << (NOEJPD - 194)) | (1L << (NOEPILOG - 194)) | (1L << (NOEXIT - 194)) | (1L << (NOEXP - 194)) | (1L << (NOEXPORTALL - 194)) | (1L << (NOF - 194)) | (1L << (NOFASTSRT - 194)) | (1L << (NOFEPI - 194)) | (1L << (NOFLAG - 194)) | (1L << (NOFLAGMIG - 194)) | (1L << (NOFLAGSTD - 194)) | (1L << (NOFSRT - 194)) | (1L << (NOGRAPHIC - 194)) | (1L << (NOHOOK - 194)) | (1L << (NOINITCHECK - 194)) | (1L << (NOIC - 194)) | (1L << (NOINITIAL - 194)) | (1L << (NOINLINE - 194)) | (1L << (NOINL - 194)) | (1L << (NOINVD - 194)) | (1L << (NOINVDATA - 194)) | (1L << (NOLENGTH - 194)) | (1L << (NOLIB - 194)) | (1L << (NOLINKAGE - 194)) | (1L << (NOLIST - 194)) | (1L << (NOMAP - 194)) | (1L << (NOMD - 194)) | (1L << (NOMDECK - 194)) | (1L << (NONAME - 194)) | (1L << (NONUM - 194)) | (1L << (NONUMBER - 194)) | (1L << (NOOBJ - 194)) | (1L << (NOOBJECT - 194)) | (1L << (NOOFF - 194)) | (1L << (NOOFFSET - 194)) | (1L << (NOOPSEQUENCE - 194)) | (1L << (NOOPT - 194)) | (1L << (NOOPTIMIZE - 194)) | (1L << (NOOPTIONS - 194)) | (1L << (NOP - 194)) | (1L << (NOPARMCHECK - 194)) | (1L << (NOPROLOG - 194)) | (1L << (NORENT - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (NORULES - 258)) | (1L << (NOS - 258)) | (1L << (NOSEP - 258)) | (1L << (NOSEPARATE - 258)) | (1L << (NOSEQ - 258)) | (1L << (NOSERV - 258)) | (1L << (NOSERVICE - 258)) | (1L << (NOSO - 258)) | (1L << (NOSOURCE - 258)) | (1L << (NOSPIE - 258)) | (1L << (NOSQL - 258)) | (1L << (NOSQLC - 258)) | (1L << (NOSQLCCSID - 258)) | (1L << (NOSQLIMS - 258)) | (1L << (NOSSR - 258)) | (1L << (NOSSRANGE - 258)) | (1L << (NOSTDTRUNC - 258)) | (1L << (NOSEQUENCE - 258)) | (1L << (NOSTGOPT - 258)) | (1L << (NOSUPP - 258)) | (1L << (NOSUPPRESS - 258)) | (1L << (NOTERM - 258)) | (1L << (NOTERMINAL - 258)) | (1L << (NOTEST - 258)) | (1L << (NOTHREAD - 258)) | (1L << (NOVBREF - 258)) | (1L << (NOWD - 258)) | (1L << (NOWORD - 258)) | (1L << (NOX - 258)) | (1L << (NOXREF - 258)) | (1L << (NOZC - 258)) | (1L << (NOZONECHECK - 258)) | (1L << (NOZWB - 258)) | (1L << (NS - 258)) | (1L << (NSEQ - 258)) | (1L << (NSYMBOL - 258)) | (1L << (NUM - 258)) | (1L << (NUMBER - 258)) | (1L << (NUMCHECK - 258)) | (1L << (NUMPROC - 258)) | (1L << (OBJ - 258)) | (1L << (OBJECT - 258)) | (1L << (OFF - 258)) | (1L << (OFFSET - 258)) | (1L << (OP - 258)) | (1L << (OPMARGINS - 258)) | (1L << (OPSEQUENCE - 258)) | (1L << (OPT - 258)) | (1L << (OPTFILE - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (OPTIMIZE - 322)) | (1L << (OPTIONS - 322)) | (1L << (OUT - 322)) | (1L << (OUTDD - 322)) | (1L << (PARMCHECK - 322)) | (1L << (PC - 322)) | (1L << (PGMN - 322)) | (1L << (PGMNAME - 322)) | (1L << (PROLOG - 322)) | (1L << (QUALIFY - 322)) | (1L << (QUA - 322)) | (1L << (QUOTE - 322)) | (1L << (RENT - 322)) | (1L << (RMODE - 322)) | (1L << (RULES - 322)) | (1L << (SEP - 322)) | (1L << (SEPARATE - 322)) | (1L << (SEQ - 322)) | (1L << (SEQUENCE - 322)) | (1L << (SERV - 322)) | (1L << (SERVICE - 322)) | (1L << (SIZE - 322)) | (1L << (SOURCE - 322)) | (1L << (SP - 322)) | (1L << (SPACE - 322)) | (1L << (SPIE - 322)) | (1L << (SQL - 322)) | (1L << (SQLC - 322)) | (1L << (SQLCCSID - 322)) | (1L << (SQLIMS - 322)) | (1L << (SO - 322)) | (1L << (SSR - 322)) | (1L << (SSRANGE - 322)) | (1L << (STGOPT - 322)) | (1L << (SUPP - 322)) | (1L << (SUPPRESS - 322)) | (1L << (SYSEIB - 322)) | (1L << (SZ - 322)) | (1L << (TERM - 322)) | (1L << (TERMINAL - 322)) | (1L << (TEST - 322)) | (1L << (THREAD - 322)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TRUNC - 388)) | (1L << (TUNE - 388)) | (1L << (VBREF - 388)) | (1L << (VLR - 388)) | (1L << (VS - 388)) | (1L << (VSAMOPENFS - 388)) | (1L << (WD - 388)) | (1L << (WORD - 388)) | (1L << (XMLPARSE - 388)) | (1L << (XP - 388)) | (1L << (XREF - 388)) | (1L << (YEARWINDOW - 388)) | (1L << (YW - 388)) | (1L << (ZC - 388)) | (1L << (ZD - 388)) | (1L << (ZONECHECK - 388)) | (1L << (ZONEDATA - 388)) | (1L << (ZWB - 388)) | (1L << (C_CHAR - 388)) | (1L << (D_CHAR - 388)) | (1L << (F_CHAR - 388)) | (1L << (Q_CHAR - 388)) | (1L << (S_CHAR - 388)) | (1L << (X_CHAR - 388)) | (1L << (COMMACHAR - 388)))) != 0)) {
				{
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(220);
					match(COMMACHAR);
					}
				}

				setState(223);
				compilerOption();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
		public TerminalNode AFP() { return getToken(CobolPreprocessorParser.AFP, 0); }
		public List<TerminalNode> LPARENCHAR() { return getTokens(CobolPreprocessorParser.LPARENCHAR); }
		public TerminalNode LPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.LPARENCHAR, i);
		}
		public List<TerminalNode> RPARENCHAR() { return getTokens(CobolPreprocessorParser.RPARENCHAR); }
		public TerminalNode RPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.RPARENCHAR, i);
		}
		public TerminalNode NOVOLATILE() { return getToken(CobolPreprocessorParser.NOVOLATILE, 0); }
		public TerminalNode VOLATILE() { return getToken(CobolPreprocessorParser.VOLATILE, 0); }
		public TerminalNode APOST() { return getToken(CobolPreprocessorParser.APOST, 0); }
		public TerminalNode ARCH() { return getToken(CobolPreprocessorParser.ARCH, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
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
		public TerminalNode BUFSIZE() { return getToken(CobolPreprocessorParser.BUFSIZE, 0); }
		public TerminalNode BUF() { return getToken(CobolPreprocessorParser.BUF, 0); }
		public TerminalNode CBLCARD() { return getToken(CobolPreprocessorParser.CBLCARD, 0); }
		public TerminalNode CICS() { return getToken(CobolPreprocessorParser.CICS, 0); }
		public TerminalNode COBOL2() { return getToken(CobolPreprocessorParser.COBOL2, 0); }
		public TerminalNode COBOL3() { return getToken(CobolPreprocessorParser.COBOL3, 0); }
		public TerminalNode CODEPAGE() { return getToken(CobolPreprocessorParser.CODEPAGE, 0); }
		public TerminalNode CP() { return getToken(CobolPreprocessorParser.CP, 0); }
		public TerminalNode COMPILE() { return getToken(CobolPreprocessorParser.COMPILE, 0); }
		public TerminalNode COPYLOC() { return getToken(CobolPreprocessorParser.COPYLOC, 0); }
		public TerminalNode CPLC() { return getToken(CobolPreprocessorParser.CPLC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode DSN() { return getToken(CobolPreprocessorParser.DSN, 0); }
		public TerminalNode FILENAME() { return getToken(CobolPreprocessorParser.FILENAME, 0); }
		public TerminalNode PATH() { return getToken(CobolPreprocessorParser.PATH, 0); }
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolPreprocessorParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolPreprocessorParser.COMMACHAR, i);
		}
		public TerminalNode COPYRIGHT() { return getToken(CobolPreprocessorParser.COPYRIGHT, 0); }
		public TerminalNode CPYR() { return getToken(CobolPreprocessorParser.CPYR, 0); }
		public TerminalNode CPP() { return getToken(CobolPreprocessorParser.CPP, 0); }
		public TerminalNode CPSM() { return getToken(CobolPreprocessorParser.CPSM, 0); }
		public TerminalNode CURRENCY() { return getToken(CobolPreprocessorParser.CURRENCY, 0); }
		public TerminalNode CURR() { return getToken(CobolPreprocessorParser.CURR, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CobolPreprocessorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CobolPreprocessorParser.TEXT, i);
		}
		public TerminalNode DATA() { return getToken(CobolPreprocessorParser.DATA, 0); }
		public TerminalNode DATEPROC() { return getToken(CobolPreprocessorParser.DATEPROC, 0); }
		public TerminalNode DP() { return getToken(CobolPreprocessorParser.DP, 0); }
		public TerminalNode FLAG() { return getToken(CobolPreprocessorParser.FLAG, 0); }
		public TerminalNode NOFLAG() { return getToken(CobolPreprocessorParser.NOFLAG, 0); }
		public TerminalNode TRIG() { return getToken(CobolPreprocessorParser.TRIG, 0); }
		public TerminalNode NOTRIG() { return getToken(CobolPreprocessorParser.NOTRIG, 0); }
		public TerminalNode DBCS() { return getToken(CobolPreprocessorParser.DBCS, 0); }
		public TerminalNode DECK() { return getToken(CobolPreprocessorParser.DECK, 0); }
		public TerminalNode D_CHAR() { return getToken(CobolPreprocessorParser.D_CHAR, 0); }
		public TerminalNode DEBUG() { return getToken(CobolPreprocessorParser.DEBUG, 0); }
		public Define_optContext define_opt() {
			return getRuleContext(Define_optContext.class,0);
		}
		public TerminalNode DIAGTRUNC() { return getToken(CobolPreprocessorParser.DIAGTRUNC, 0); }
		public TerminalNode DTR() { return getToken(CobolPreprocessorParser.DTR, 0); }
		public TerminalNode DISPSIGN() { return getToken(CobolPreprocessorParser.DISPSIGN, 0); }
		public TerminalNode DS() { return getToken(CobolPreprocessorParser.DS, 0); }
		public TerminalNode SEP() { return getToken(CobolPreprocessorParser.SEP, 0); }
		public List<TerminalNode> S_CHAR() { return getTokens(CobolPreprocessorParser.S_CHAR); }
		public TerminalNode S_CHAR(int i) {
			return getToken(CobolPreprocessorParser.S_CHAR, i);
		}
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
		public TerminalNode O_CHAR() { return getToken(CobolPreprocessorParser.O_CHAR, 0); }
		public TerminalNode DD() { return getToken(CobolPreprocessorParser.DD, 0); }
		public TerminalNode N_CHAR() { return getToken(CobolPreprocessorParser.N_CHAR, 0); }
		public TerminalNode NN() { return getToken(CobolPreprocessorParser.NN, 0); }
		public TerminalNode SS() { return getToken(CobolPreprocessorParser.SS, 0); }
		public TerminalNode GDS() { return getToken(CobolPreprocessorParser.GDS, 0); }
		public TerminalNode GRAPHIC() { return getToken(CobolPreprocessorParser.GRAPHIC, 0); }
		public TerminalNode HGPR() { return getToken(CobolPreprocessorParser.HGPR, 0); }
		public TerminalNode PRESERVE() { return getToken(CobolPreprocessorParser.PRESERVE, 0); }
		public TerminalNode NOPRESERVE() { return getToken(CobolPreprocessorParser.NOPRESERVE, 0); }
		public TerminalNode INTDATE() { return getToken(CobolPreprocessorParser.INTDATE, 0); }
		public TerminalNode ANSI() { return getToken(CobolPreprocessorParser.ANSI, 0); }
		public TerminalNode LILIAN() { return getToken(CobolPreprocessorParser.LILIAN, 0); }
		public TerminalNode INITCHECK() { return getToken(CobolPreprocessorParser.INITCHECK, 0); }
		public TerminalNode IC() { return getToken(CobolPreprocessorParser.IC, 0); }
		public TerminalNode LAX() { return getToken(CobolPreprocessorParser.LAX, 0); }
		public TerminalNode STRICT() { return getToken(CobolPreprocessorParser.STRICT, 0); }
		public TerminalNode INITIAL() { return getToken(CobolPreprocessorParser.INITIAL, 0); }
		public TerminalNode INLINE() { return getToken(CobolPreprocessorParser.INLINE, 0); }
		public TerminalNode INL() { return getToken(CobolPreprocessorParser.INL, 0); }
		public TerminalNode INVDATA() { return getToken(CobolPreprocessorParser.INVDATA, 0); }
		public TerminalNode INVD() { return getToken(CobolPreprocessorParser.INVD, 0); }
		public List<Invdata_optsContext> invdata_opts() {
			return getRuleContexts(Invdata_optsContext.class);
		}
		public Invdata_optsContext invdata_opts(int i) {
			return getRuleContext(Invdata_optsContext.class,i);
		}
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
		public TerminalNode LP() { return getToken(CobolPreprocessorParser.LP, 0); }
		public TerminalNode MAP() { return getToken(CobolPreprocessorParser.MAP, 0); }
		public TerminalNode HEX() { return getToken(CobolPreprocessorParser.HEX, 0); }
		public TerminalNode DEC() { return getToken(CobolPreprocessorParser.DEC, 0); }
		public TerminalNode MARGINS() { return getToken(CobolPreprocessorParser.MARGINS, 0); }
		public TerminalNode MAXPCF() { return getToken(CobolPreprocessorParser.MAXPCF, 0); }
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
		public TerminalNode NOCOPYLOC() { return getToken(CobolPreprocessorParser.NOCOPYLOC, 0); }
		public TerminalNode NOCPLC() { return getToken(CobolPreprocessorParser.NOCPLC, 0); }
		public TerminalNode NOCOPYRIGHT() { return getToken(CobolPreprocessorParser.NOCOPYRIGHT, 0); }
		public TerminalNode NOCPYR() { return getToken(CobolPreprocessorParser.NOCPYR, 0); }
		public TerminalNode NOCPSM() { return getToken(CobolPreprocessorParser.NOCPSM, 0); }
		public TerminalNode NOCURRENCY() { return getToken(CobolPreprocessorParser.NOCURRENCY, 0); }
		public TerminalNode NOCURR() { return getToken(CobolPreprocessorParser.NOCURR, 0); }
		public TerminalNode NODATEPROC() { return getToken(CobolPreprocessorParser.NODATEPROC, 0); }
		public TerminalNode NODP() { return getToken(CobolPreprocessorParser.NODP, 0); }
		public TerminalNode NODBCS() { return getToken(CobolPreprocessorParser.NODBCS, 0); }
		public TerminalNode NODEBUG() { return getToken(CobolPreprocessorParser.NODEBUG, 0); }
		public TerminalNode NODECK() { return getToken(CobolPreprocessorParser.NODECK, 0); }
		public TerminalNode NOD() { return getToken(CobolPreprocessorParser.NOD, 0); }
		public TerminalNode NODEFINE() { return getToken(CobolPreprocessorParser.NODEFINE, 0); }
		public TerminalNode NODEF() { return getToken(CobolPreprocessorParser.NODEF, 0); }
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
		public TerminalNode NOINITCHECK() { return getToken(CobolPreprocessorParser.NOINITCHECK, 0); }
		public TerminalNode NOIC() { return getToken(CobolPreprocessorParser.NOIC, 0); }
		public TerminalNode NOINITIAL() { return getToken(CobolPreprocessorParser.NOINITIAL, 0); }
		public TerminalNode NOINLINE() { return getToken(CobolPreprocessorParser.NOINLINE, 0); }
		public TerminalNode NOINL() { return getToken(CobolPreprocessorParser.NOINL, 0); }
		public TerminalNode NOINVDATA() { return getToken(CobolPreprocessorParser.NOINVDATA, 0); }
		public TerminalNode NOINVD() { return getToken(CobolPreprocessorParser.NOINVD, 0); }
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
		public TerminalNode NOPARMCHECK() { return getToken(CobolPreprocessorParser.NOPARMCHECK, 0); }
		public TerminalNode NOPROLOG() { return getToken(CobolPreprocessorParser.NOPROLOG, 0); }
		public TerminalNode NORENT() { return getToken(CobolPreprocessorParser.NORENT, 0); }
		public TerminalNode NORULES() { return getToken(CobolPreprocessorParser.NORULES, 0); }
		public TerminalNode NOSEQUENCE() { return getToken(CobolPreprocessorParser.NOSEQUENCE, 0); }
		public TerminalNode NOSEQ() { return getToken(CobolPreprocessorParser.NOSEQ, 0); }
		public TerminalNode NOSERVICE() { return getToken(CobolPreprocessorParser.NOSERVICE, 0); }
		public TerminalNode NOSERV() { return getToken(CobolPreprocessorParser.NOSERV, 0); }
		public TerminalNode NOSOURCE() { return getToken(CobolPreprocessorParser.NOSOURCE, 0); }
		public TerminalNode NOS() { return getToken(CobolPreprocessorParser.NOS, 0); }
		public TerminalNode NOSPIE() { return getToken(CobolPreprocessorParser.NOSPIE, 0); }
		public TerminalNode NOSQL() { return getToken(CobolPreprocessorParser.NOSQL, 0); }
		public TerminalNode NOSQLIMS() { return getToken(CobolPreprocessorParser.NOSQLIMS, 0); }
		public TerminalNode NOSQLCCSID() { return getToken(CobolPreprocessorParser.NOSQLCCSID, 0); }
		public TerminalNode NOSQLC() { return getToken(CobolPreprocessorParser.NOSQLC, 0); }
		public TerminalNode NOSSRANGE() { return getToken(CobolPreprocessorParser.NOSSRANGE, 0); }
		public TerminalNode NOSSR() { return getToken(CobolPreprocessorParser.NOSSR, 0); }
		public TerminalNode NOSTDTRUNC() { return getToken(CobolPreprocessorParser.NOSTDTRUNC, 0); }
		public TerminalNode NOSTGOPT() { return getToken(CobolPreprocessorParser.NOSTGOPT, 0); }
		public TerminalNode NOSO() { return getToken(CobolPreprocessorParser.NOSO, 0); }
		public TerminalNode NOSUPP() { return getToken(CobolPreprocessorParser.NOSUPP, 0); }
		public TerminalNode NOSUPPRESS() { return getToken(CobolPreprocessorParser.NOSUPPRESS, 0); }
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
		public TerminalNode NOZC() { return getToken(CobolPreprocessorParser.NOZC, 0); }
		public TerminalNode NOZONECHECK() { return getToken(CobolPreprocessorParser.NOZONECHECK, 0); }
		public TerminalNode NOZWB() { return getToken(CobolPreprocessorParser.NOZWB, 0); }
		public TerminalNode NUMBER() { return getToken(CobolPreprocessorParser.NUMBER, 0); }
		public TerminalNode NUM() { return getToken(CobolPreprocessorParser.NUM, 0); }
		public TerminalNode NUMCHECK() { return getToken(CobolPreprocessorParser.NUMCHECK, 0); }
		public TerminalNode NC() { return getToken(CobolPreprocessorParser.NC, 0); }
		public List<Numcheck_optsContext> numcheck_opts() {
			return getRuleContexts(Numcheck_optsContext.class);
		}
		public Numcheck_optsContext numcheck_opts(int i) {
			return getRuleContext(Numcheck_optsContext.class,i);
		}
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
		public TerminalNode NUMERICLITERAL() { return getToken(CobolPreprocessorParser.NUMERICLITERAL, 0); }
		public TerminalNode OPTFILE() { return getToken(CobolPreprocessorParser.OPTFILE, 0); }
		public TerminalNode OPTIONS() { return getToken(CobolPreprocessorParser.OPTIONS, 0); }
		public TerminalNode OP() { return getToken(CobolPreprocessorParser.OP, 0); }
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public TerminalNode OUTDD() { return getToken(CobolPreprocessorParser.OUTDD, 0); }
		public TerminalNode OUT() { return getToken(CobolPreprocessorParser.OUT, 0); }
		public TerminalNode PARMCHECK() { return getToken(CobolPreprocessorParser.PARMCHECK, 0); }
		public TerminalNode PC() { return getToken(CobolPreprocessorParser.PC, 0); }
		public TerminalNode MSG() { return getToken(CobolPreprocessorParser.MSG, 0); }
		public TerminalNode ABD() { return getToken(CobolPreprocessorParser.ABD, 0); }
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
		public TerminalNode QUALIFY() { return getToken(CobolPreprocessorParser.QUALIFY, 0); }
		public TerminalNode QUA() { return getToken(CobolPreprocessorParser.QUA, 0); }
		public TerminalNode QUOTE() { return getToken(CobolPreprocessorParser.QUOTE, 0); }
		public TerminalNode Q_CHAR() { return getToken(CobolPreprocessorParser.Q_CHAR, 0); }
		public TerminalNode RENT() { return getToken(CobolPreprocessorParser.RENT, 0); }
		public TerminalNode RMODE() { return getToken(CobolPreprocessorParser.RMODE, 0); }
		public TerminalNode ANY() { return getToken(CobolPreprocessorParser.ANY, 0); }
		public TerminalNode AUTO() { return getToken(CobolPreprocessorParser.AUTO, 0); }
		public TerminalNode RULES() { return getToken(CobolPreprocessorParser.RULES, 0); }
		public List<Rules_optsContext> rules_opts() {
			return getRuleContexts(Rules_optsContext.class);
		}
		public Rules_optsContext rules_opts(int i) {
			return getRuleContext(Rules_optsContext.class,i);
		}
		public TerminalNode SEQUENCE() { return getToken(CobolPreprocessorParser.SEQUENCE, 0); }
		public TerminalNode SEQ() { return getToken(CobolPreprocessorParser.SEQ, 0); }
		public TerminalNode SERVICE() { return getToken(CobolPreprocessorParser.SERVICE, 0); }
		public TerminalNode SERV() { return getToken(CobolPreprocessorParser.SERV, 0); }
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
		public TerminalNode SQLIMS() { return getToken(CobolPreprocessorParser.SQLIMS, 0); }
		public TerminalNode SSRANGE() { return getToken(CobolPreprocessorParser.SSRANGE, 0); }
		public TerminalNode SSR() { return getToken(CobolPreprocessorParser.SSR, 0); }
		public List<Ssrange_optsContext> ssrange_opts() {
			return getRuleContexts(Ssrange_optsContext.class);
		}
		public Ssrange_optsContext ssrange_opts(int i) {
			return getRuleContext(Ssrange_optsContext.class,i);
		}
		public TerminalNode STGOPT() { return getToken(CobolPreprocessorParser.STGOPT, 0); }
		public TerminalNode SO() { return getToken(CobolPreprocessorParser.SO, 0); }
		public TerminalNode SUPP() { return getToken(CobolPreprocessorParser.SUPP, 0); }
		public TerminalNode SUPPRESS() { return getToken(CobolPreprocessorParser.SUPPRESS, 0); }
		public TerminalNode SYSEIB() { return getToken(CobolPreprocessorParser.SYSEIB, 0); }
		public TerminalNode TERMINAL() { return getToken(CobolPreprocessorParser.TERMINAL, 0); }
		public TerminalNode TERM() { return getToken(CobolPreprocessorParser.TERM, 0); }
		public TerminalNode TEST() { return getToken(CobolPreprocessorParser.TEST, 0); }
		public List<Test_optsContext> test_opts() {
			return getRuleContexts(Test_optsContext.class);
		}
		public Test_optsContext test_opts(int i) {
			return getRuleContext(Test_optsContext.class,i);
		}
		public TerminalNode THREAD() { return getToken(CobolPreprocessorParser.THREAD, 0); }
		public TerminalNode TRUNC() { return getToken(CobolPreprocessorParser.TRUNC, 0); }
		public TerminalNode BIN() { return getToken(CobolPreprocessorParser.BIN, 0); }
		public TerminalNode TUNE() { return getToken(CobolPreprocessorParser.TUNE, 0); }
		public TerminalNode VBREF() { return getToken(CobolPreprocessorParser.VBREF, 0); }
		public TerminalNode VLR() { return getToken(CobolPreprocessorParser.VLR, 0); }
		public TerminalNode STANDARD() { return getToken(CobolPreprocessorParser.STANDARD, 0); }
		public TerminalNode VSAMOPENFS() { return getToken(CobolPreprocessorParser.VSAMOPENFS, 0); }
		public TerminalNode VS() { return getToken(CobolPreprocessorParser.VS, 0); }
		public TerminalNode SUCC() { return getToken(CobolPreprocessorParser.SUCC, 0); }
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
		public TerminalNode ZC() { return getToken(CobolPreprocessorParser.ZC, 0); }
		public TerminalNode ZONECHECK() { return getToken(CobolPreprocessorParser.ZONECHECK, 0); }
		public TerminalNode ZD() { return getToken(CobolPreprocessorParser.ZD, 0); }
		public TerminalNode ZONEDATA() { return getToken(CobolPreprocessorParser.ZONEDATA, 0); }
		public TerminalNode ZWB() { return getToken(CobolPreprocessorParser.ZWB, 0); }
		public CompilerOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerOptionContext compilerOption() throws RecognitionException {
		CompilerOptionContext _localctx = new CompilerOptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compilerOption);
		int _la;
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ADATA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(ADV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(233);
				match(AFP);
				setState(234);
				match(LPARENCHAR);
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==NOVOLATILE || _la==VOLATILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(236);
				match(RPARENCHAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(APOST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(238);
				match(ARCH);
				setState(239);
				match(LPARENCHAR);
				setState(240);
				literal();
				setState(241);
				match(RPARENCHAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==AR || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				match(LPARENCHAR);
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				match(RPARENCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				match(AWO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				match(BLOCK0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==BUF || _la==BUFSIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				match(LPARENCHAR);
				setState(251);
				literal();
				setState(252);
				match(RPARENCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(CBLCARD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(255);
				match(CICS);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(256);
					match(LPARENCHAR);
					setState(257);
					literal();
					setState(258);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(262);
				match(COBOL2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(263);
				match(COBOL3);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==CODEPAGE || _la==CP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				match(LPARENCHAR);
				setState(266);
				literal();
				setState(267);
				match(RPARENCHAR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(269);
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
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==COPYLOC || _la==CPLC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				match(LPARENCHAR);
				setState(274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(272);
					match(IDENTIFIER);
					}
					break;
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(273);
					literal();
					}
					break;
				case DSN:
				case PATH:
				case RPARENCHAR:
				case COMMACHAR:
					break;
				default:
					break;
				}
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(276);
						match(COMMACHAR);
						}
					}

					setState(279);
					match(DSN);
					setState(280);
					match(LPARENCHAR);
					setState(281);
					match(FILENAME);
					setState(282);
					match(RPARENCHAR);
					}
					break;
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATH || _la==COMMACHAR) {
					{
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(285);
						match(COMMACHAR);
						}
					}

					setState(288);
					match(PATH);
					setState(289);
					match(LPARENCHAR);
					setState(290);
					literal();
					setState(291);
					match(RPARENCHAR);
					}
				}

				setState(295);
				match(RPARENCHAR);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==COPYRIGHT || _la==CPYR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(297);
				match(LPARENCHAR);
				setState(298);
				literal();
				setState(299);
				match(RPARENCHAR);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(301);
				match(CPP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(302);
				match(CPSM);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==CURR || _la==CURRENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				match(LPARENCHAR);
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(305);
					match(TEXT);
					}
					}
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(310);
				match(RPARENCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(311);
				match(DATA);
				setState(312);
				match(LPARENCHAR);
				setState(313);
				literal();
				setState(314);
				match(RPARENCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==DATEPROC || _la==DP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(317);
					match(LPARENCHAR);
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FLAG || _la==NOFLAG) {
						{
						setState(318);
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

					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(321);
						match(COMMACHAR);
						}
					}

					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOTRIG || _la==TRIG) {
						{
						setState(324);
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

					setState(327);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(330);
				match(DBCS);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(331);
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
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(332);
				match(DEBUG);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(333);
				define_opt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(334);
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
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				{
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==DISPSIGN || _la==DS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				match(LPARENCHAR);
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==SEP || _la==C_CHAR || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				match(RPARENCHAR);
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(339);
				match(DLL);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(340);
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
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(341);
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
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(342);
				match(EDF);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(343);
				match(EPILOG);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(344);
				match(EXIT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(345);
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
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(346);
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
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(347);
				match(FEPI);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==FLAG || _la==F_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				match(LPARENCHAR);
				setState(350);
				_la = _input.LA(1);
				if ( !(((((_la - 417)) & ~0x3f) == 0 && ((1L << (_la - 417)) & ((1L << (E_CHAR - 417)) | (1L << (I_CHAR - 417)) | (1L << (S_CHAR - 417)) | (1L << (U_CHAR - 417)) | (1L << (W_CHAR - 417)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(351);
					match(COMMACHAR);
					setState(352);
					_la = _input.LA(1);
					if ( !(((((_la - 417)) & ~0x3f) == 0 && ((1L << (_la - 417)) & ((1L << (E_CHAR - 417)) | (1L << (I_CHAR - 417)) | (1L << (S_CHAR - 417)) | (1L << (U_CHAR - 417)) | (1L << (W_CHAR - 417)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(355);
				match(RPARENCHAR);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(356);
				match(FLAGSTD);
				setState(357);
				match(LPARENCHAR);
				setState(358);
				_la = _input.LA(1);
				if ( !(((((_la - 419)) & ~0x3f) == 0 && ((1L << (_la - 419)) & ((1L << (H_CHAR - 419)) | (1L << (I_CHAR - 419)) | (1L << (M_CHAR - 419)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(359);
					match(COMMACHAR);
					setState(360);
					_la = _input.LA(1);
					if ( !(_la==DD || _la==NN || ((((_la - 368)) & ~0x3f) == 0 && ((1L << (_la - 368)) & ((1L << (SS - 368)) | (1L << (D_CHAR - 368)) | (1L << (N_CHAR - 368)) | (1L << (S_CHAR - 368)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(363);
					match(COMMACHAR);
					setState(364);
					match(O_CHAR);
					}
				}

				setState(367);
				match(RPARENCHAR);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(368);
				match(GDS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(369);
				match(GRAPHIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(370);
				match(HGPR);
				setState(371);
				match(LPARENCHAR);
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==NOPRESERVE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				match(RPARENCHAR);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(374);
				match(INTDATE);
				setState(375);
				match(LPARENCHAR);
				setState(376);
				_la = _input.LA(1);
				if ( !(_la==ANSI || _la==LILIAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				match(RPARENCHAR);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==IC || _la==INITCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(379);
					match(LPARENCHAR);
					setState(380);
					_la = _input.LA(1);
					if ( !(_la==LAX || _la==STRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(381);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(384);
				match(INITIAL);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(385);
				match(INLINE);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(386);
				match(INL);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				{
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==INVD || _la==INVDATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(388);
					match(LPARENCHAR);
					setState(389);
					invdata_opts();
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(390);
						match(COMMACHAR);
						setState(391);
						invdata_opts();
						}
						}
						setState(396);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(397);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==LANG || _la==LANGUAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(402);
				match(LPARENCHAR);
				setState(403);
				_la = _input.LA(1);
				if ( !(_la==CS || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (EN - 79)) | (1L << (ENGLISH - 79)) | (1L << (JA - 79)) | (1L << (JP - 79)) | (1L << (KA - 79)))) != 0) || _la==UE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(404);
				match(RPARENCHAR);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(405);
				match(LEASM);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(406);
				match(LENGTH);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(407);
				match(LIB);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(408);
				match(LIN);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(409);
				_la = _input.LA(1);
				if ( !(_la==LC || _la==LINECOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				match(LPARENCHAR);
				setState(411);
				literal();
				setState(412);
				match(RPARENCHAR);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(414);
				match(LINKAGE);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(415);
				match(LIST);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				{
				setState(416);
				match(LP);
				setState(417);
				match(LPARENCHAR);
				setState(418);
				literal();
				setState(419);
				match(RPARENCHAR);
				}
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				{
				setState(421);
				match(MAP);
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(422);
					match(LPARENCHAR);
					setState(423);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(424);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(427);
				match(MARGINS);
				setState(428);
				match(LPARENCHAR);
				setState(429);
				literal();
				setState(430);
				match(COMMACHAR);
				setState(431);
				literal();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(432);
					match(COMMACHAR);
					setState(433);
					literal();
					}
				}

				setState(436);
				match(RPARENCHAR);
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				{
				setState(438);
				match(MAXPCF);
				setState(439);
				match(LPARENCHAR);
				setState(440);
				literal();
				setState(441);
				match(RPARENCHAR);
				}
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(443);
				_la = _input.LA(1);
				if ( !(_la==MD || _la==MDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(444);
					match(LPARENCHAR);
					setState(445);
					_la = _input.LA(1);
					if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(446);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(449);
				match(NAME);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(450);
					match(LPARENCHAR);
					setState(451);
					_la = _input.LA(1);
					if ( !(_la==ALIAS || _la==NOALIAS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(452);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(455);
				match(NATLANG);
				setState(456);
				match(LPARENCHAR);
				setState(457);
				_la = _input.LA(1);
				if ( !(_la==CS || _la==EN || _la==KA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(458);
				match(RPARENCHAR);
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(459);
				match(NOADATA);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(460);
				match(NOADV);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(461);
				match(NOAWO);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(462);
				match(NOBLOCK0);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(463);
				match(NOCBLCARD);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(464);
				match(NOCICS);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(465);
				match(NOCMPR2);
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(466);
				_la = _input.LA(1);
				if ( !(_la==NOC || _la==NOCOMPILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(467);
					match(LPARENCHAR);
					setState(468);
					_la = _input.LA(1);
					if ( !(((((_la - 417)) & ~0x3f) == 0 && ((1L << (_la - 417)) & ((1L << (E_CHAR - 417)) | (1L << (S_CHAR - 417)) | (1L << (W_CHAR - 417)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(469);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(472);
				match(NOCOPYLOC);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(473);
				match(NOCPLC);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(474);
				match(NOCOPYRIGHT);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(475);
				match(NOCPYR);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(476);
				match(NOCPSM);
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(477);
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
			case 78:
				enterOuterAlt(_localctx, 78);
				{
				setState(478);
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
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(479);
				match(NODBCS);
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(480);
				match(NODEBUG);
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 81);
				{
				setState(481);
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
			case 82:
				enterOuterAlt(_localctx, 82);
				{
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==NODEFINE || _la==NODEF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(483);
				match(NODLL);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(484);
				match(NODE);
				}
				break;
			case 85:
				enterOuterAlt(_localctx, 85);
				{
				setState(485);
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
			case 86:
				enterOuterAlt(_localctx, 86);
				{
				setState(486);
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
			case 87:
				enterOuterAlt(_localctx, 87);
				{
				setState(487);
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
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(488);
				match(NOEDF);
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(489);
				match(NOEPILOG);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(490);
				match(NOEXIT);
				}
				break;
			case 91:
				enterOuterAlt(_localctx, 91);
				{
				setState(491);
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
			case 92:
				enterOuterAlt(_localctx, 92);
				{
				setState(492);
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
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(493);
				match(NOFEPI);
				}
				break;
			case 94:
				enterOuterAlt(_localctx, 94);
				{
				setState(494);
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
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(495);
				match(NOFLAGMIG);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(496);
				match(NOFLAGSTD);
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(497);
				match(NOGRAPHIC);
				}
				break;
			case 98:
				enterOuterAlt(_localctx, 98);
				{
				setState(498);
				_la = _input.LA(1);
				if ( !(_la==NOINITCHECK || _la==NOIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(499);
				match(NOINITIAL);
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(500);
				match(NOINLINE);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(501);
				match(NOINL);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(502);
				_la = _input.LA(1);
				if ( !(_la==NOINVD || _la==NOINVDATA) ) {
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
				setState(503);
				match(NOLENGTH);
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(504);
				match(NOLIB);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(505);
				match(NOLINKAGE);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(506);
				match(NOLIST);
				}
				break;
			case 107:
				enterOuterAlt(_localctx, 107);
				{
				setState(507);
				match(NOMAP);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(508);
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
			case 109:
				enterOuterAlt(_localctx, 109);
				{
				setState(509);
				match(NONAME);
				}
				break;
			case 110:
				enterOuterAlt(_localctx, 110);
				{
				setState(510);
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
			case 111:
				enterOuterAlt(_localctx, 111);
				{
				setState(511);
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
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(512);
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
			case 113:
				enterOuterAlt(_localctx, 113);
				{
				setState(513);
				match(NOOPSEQUENCE);
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(514);
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
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(515);
				match(NOOPTIONS);
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(516);
				match(NOP);
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(517);
				match(NOPARMCHECK);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(518);
				match(NOPROLOG);
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(519);
				match(NORENT);
				}
				break;
			case 120:
				enterOuterAlt(_localctx, 120);
				{
				setState(520);
				match(NORULES);
				}
				break;
			case 121:
				enterOuterAlt(_localctx, 121);
				{
				setState(521);
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
			case 122:
				enterOuterAlt(_localctx, 122);
				{
				setState(522);
				_la = _input.LA(1);
				if ( !(_la==NOSERV || _la==NOSERVICE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(523);
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
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(524);
				match(NOSPIE);
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(525);
				match(NOSQL);
				}
				break;
			case 126:
				enterOuterAlt(_localctx, 126);
				{
				setState(526);
				match(NOSQLIMS);
				}
				break;
			case 127:
				enterOuterAlt(_localctx, 127);
				{
				setState(527);
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
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(528);
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
			case 129:
				enterOuterAlt(_localctx, 129);
				{
				setState(529);
				match(NOSTDTRUNC);
				}
				break;
			case 130:
				enterOuterAlt(_localctx, 130);
				{
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==NOSO || _la==NOSTGOPT) ) {
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
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==NOSUPP || _la==NOSUPPRESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(532);
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
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(533);
				match(NOTEST);
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(534);
				match(NOTHREAD);
				}
				break;
			case 135:
				enterOuterAlt(_localctx, 135);
				{
				setState(535);
				match(NOVBREF);
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(536);
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
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(537);
				match(NSEQ);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(538);
				_la = _input.LA(1);
				if ( !(_la==NS || _la==NSYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
				match(LPARENCHAR);
				setState(540);
				_la = _input.LA(1);
				if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(541);
				match(RPARENCHAR);
				}
				break;
			case 139:
				enterOuterAlt(_localctx, 139);
				{
				setState(542);
				match(NOVBREF);
				}
				break;
			case 140:
				enterOuterAlt(_localctx, 140);
				{
				setState(543);
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
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(544);
				_la = _input.LA(1);
				if ( !(_la==NOZC || _la==NOZONECHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 142:
				enterOuterAlt(_localctx, 142);
				{
				setState(545);
				match(NOZWB);
				}
				break;
			case 143:
				enterOuterAlt(_localctx, 143);
				{
				setState(546);
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
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				{
				setState(547);
				_la = _input.LA(1);
				if ( !(_la==NC || _la==NUMCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(548);
					match(LPARENCHAR);
					setState(549);
					numcheck_opts();
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(550);
						match(COMMACHAR);
						setState(551);
						numcheck_opts();
						}
						}
						setState(556);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(557);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 145:
				enterOuterAlt(_localctx, 145);
				{
				setState(561);
				match(NUMPROC);
				setState(562);
				match(LPARENCHAR);
				setState(563);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(564);
				match(RPARENCHAR);
				}
				break;
			case 146:
				enterOuterAlt(_localctx, 146);
				{
				setState(565);
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
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(566);
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
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(567);
				match(OPMARGINS);
				setState(568);
				match(LPARENCHAR);
				setState(569);
				literal();
				setState(570);
				match(COMMACHAR);
				setState(571);
				literal();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(572);
					match(COMMACHAR);
					setState(573);
					literal();
					}
				}

				setState(576);
				match(RPARENCHAR);
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(578);
				match(OPSEQUENCE);
				setState(579);
				match(LPARENCHAR);
				setState(580);
				literal();
				setState(581);
				match(COMMACHAR);
				setState(582);
				literal();
				setState(583);
				match(RPARENCHAR);
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(585);
				_la = _input.LA(1);
				if ( !(_la==OPT || _la==OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(586);
					match(LPARENCHAR);
					setState(587);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==STD || _la==NUMERICLITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(588);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(591);
				match(OPTFILE);
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(592);
				match(OPTIONS);
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				setState(593);
				match(OP);
				}
				break;
			case 154:
				enterOuterAlt(_localctx, 154);
				{
				setState(594);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==OUTDD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(595);
				match(LPARENCHAR);
				setState(596);
				cobolWord();
				setState(597);
				match(RPARENCHAR);
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				{
				setState(599);
				_la = _input.LA(1);
				if ( !(_la==PARMCHECK || _la==PC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(600);
					match(LPARENCHAR);
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABD || _la==MSG) {
						{
						setState(601);
						_la = _input.LA(1);
						if ( !(_la==ABD || _la==MSG) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 430)) & ~0x3f) == 0 && ((1L << (_la - 430)) & ((1L << (COMMACHAR - 430)) | (1L << (NONNUMERICLITERAL - 430)) | (1L << (CONTINUED_NONNUMERICLITERAL - 430)) | (1L << (NUMERICLITERAL - 430)))) != 0)) {
						{
						setState(605);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(604);
							match(COMMACHAR);
							}
						}

						setState(607);
						literal();
						}
					}

					setState(610);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==PGMN || _la==PGMNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(614);
				match(LPARENCHAR);
				setState(615);
				_la = _input.LA(1);
				if ( !(_la==CO || _la==COMPAT || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (LM - 138)) | (1L << (LONGMIXED - 138)) | (1L << (LONGUPPER - 138)) | (1L << (LU - 138)) | (1L << (MIXED - 138)))) != 0) || ((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (UPPER - 393)) | (1L << (M_CHAR - 393)) | (1L << (U_CHAR - 393)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(616);
				match(RPARENCHAR);
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(617);
				match(PROLOG);
				}
				break;
			case 158:
				enterOuterAlt(_localctx, 158);
				{
				{
				setState(618);
				_la = _input.LA(1);
				if ( !(_la==QUALIFY || _la==QUA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(619);
				match(LPARENCHAR);
				setState(620);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(621);
				match(RPARENCHAR);
				}
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(622);
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
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				setState(623);
				match(RENT);
				}
				break;
			case 161:
				enterOuterAlt(_localctx, 161);
				{
				setState(624);
				match(RMODE);
				setState(625);
				match(LPARENCHAR);
				setState(629);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
					{
					setState(626);
					match(ANY);
					}
					break;
				case AUTO:
					{
					setState(627);
					match(AUTO);
					}
					break;
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(628);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(631);
				match(RPARENCHAR);
				}
				break;
			case 162:
				enterOuterAlt(_localctx, 162);
				{
				{
				setState(632);
				match(RULES);
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(633);
					match(LPARENCHAR);
					setState(634);
					rules_opts();
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(635);
						match(COMMACHAR);
						setState(636);
						rules_opts();
						}
						}
						setState(641);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(642);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(646);
				_la = _input.LA(1);
				if ( !(_la==SEQ || _la==SEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(647);
					match(LPARENCHAR);
					setState(648);
					literal();
					setState(649);
					match(COMMACHAR);
					setState(650);
					literal();
					setState(651);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				{
				setState(655);
				_la = _input.LA(1);
				if ( !(_la==SERV || _la==SERVICE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(656);
				match(LPARENCHAR);
				setState(657);
				literal();
				setState(658);
				match(RPARENCHAR);
				}
				}
				break;
			case 165:
				enterOuterAlt(_localctx, 165);
				{
				setState(660);
				_la = _input.LA(1);
				if ( !(_la==SIZE || _la==SZ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(661);
				match(LPARENCHAR);
				setState(664);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAX:
					{
					setState(662);
					match(MAX);
					}
					break;
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(663);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(666);
				match(RPARENCHAR);
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				{
				setState(667);
				_la = _input.LA(1);
				if ( !(_la==SOURCE || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(668);
					match(LPARENCHAR);
					setState(669);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(670);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(673);
				match(SP);
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(674);
				match(SPACE);
				setState(675);
				match(LPARENCHAR);
				setState(676);
				literal();
				setState(677);
				match(RPARENCHAR);
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(679);
				match(SPIE);
				}
				break;
			case 170:
				enterOuterAlt(_localctx, 170);
				{
				setState(680);
				match(SQL);
				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(681);
					match(LPARENCHAR);
					setState(682);
					literal();
					setState(683);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 171:
				enterOuterAlt(_localctx, 171);
				{
				setState(687);
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
			case 172:
				enterOuterAlt(_localctx, 172);
				{
				setState(688);
				match(SQLIMS);
				setState(693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(689);
					match(LPARENCHAR);
					setState(690);
					literal();
					setState(691);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 173:
				enterOuterAlt(_localctx, 173);
				{
				{
				setState(695);
				_la = _input.LA(1);
				if ( !(_la==SSR || _la==SSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(696);
					match(LPARENCHAR);
					setState(697);
					ssrange_opts();
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(698);
						match(COMMACHAR);
						setState(699);
						ssrange_opts();
						}
						}
						setState(704);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(705);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 174:
				enterOuterAlt(_localctx, 174);
				{
				setState(709);
				_la = _input.LA(1);
				if ( !(_la==SO || _la==STGOPT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(710);
				_la = _input.LA(1);
				if ( !(_la==SUPP || _la==SUPPRESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 176:
				enterOuterAlt(_localctx, 176);
				{
				setState(711);
				match(SYSEIB);
				}
				break;
			case 177:
				enterOuterAlt(_localctx, 177);
				{
				setState(712);
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
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				{
				setState(713);
				match(TEST);
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(714);
					match(LPARENCHAR);
					setState(715);
					test_opts();
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(716);
						match(COMMACHAR);
						setState(717);
						test_opts();
						}
						}
						setState(722);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(723);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(727);
				match(THREAD);
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				setState(728);
				match(TRUNC);
				setState(729);
				match(LPARENCHAR);
				setState(730);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==OPT || _la==STD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(731);
				match(RPARENCHAR);
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				{
				setState(732);
				match(TUNE);
				setState(733);
				match(LPARENCHAR);
				setState(734);
				literal();
				setState(735);
				match(RPARENCHAR);
				}
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(737);
				match(VBREF);
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				{
				setState(738);
				match(VLR);
				setState(739);
				match(LPARENCHAR);
				setState(740);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (STANDARD - 371)) | (1L << (C_CHAR - 371)) | (1L << (S_CHAR - 371)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(741);
				match(RPARENCHAR);
				}
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				{
				setState(742);
				_la = _input.LA(1);
				if ( !(_la==VS || _la==VSAMOPENFS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(743);
				match(LPARENCHAR);
				setState(744);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 376)) & ~0x3f) == 0 && ((1L << (_la - 376)) & ((1L << (SUCC - 376)) | (1L << (C_CHAR - 376)) | (1L << (S_CHAR - 376)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(745);
				match(RPARENCHAR);
				}
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(746);
				_la = _input.LA(1);
				if ( !(_la==WD || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(747);
				match(LPARENCHAR);
				setState(754);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABD:
				case ADATA:
				case ADV:
				case AFP:
				case ALIAS:
				case ALPHNUM:
				case ANSI:
				case ANY:
				case APOST:
				case AR:
				case ARCH:
				case ARITH:
				case AUTO:
				case AWO:
				case BASIS:
				case BIN:
				case BLOCK0:
				case BUF:
				case BUFSIZE:
				case BY:
				case CBLCARD:
				case CICS:
				case CO:
				case COBOL2:
				case COBOL3:
				case CODEPAGE:
				case COMPAT:
				case COMPILE:
				case COPYLOC:
				case COPYRIGHT:
				case CP:
				case CPLC:
				case CPP:
				case CPSM:
				case CPYR:
				case CS:
				case CURR:
				case CURRENCY:
				case DATA:
				case DATEPROC:
				case DBCS:
				case DD:
				case DEBUG:
				case DEC:
				case DECK:
				case DEF:
				case DEFINE:
				case DELETE:
				case DIAGTRUNC:
				case DISPSIGN:
				case DIVISION:
				case DLI:
				case DLL:
				case DP:
				case DS:
				case DSN:
				case DSNAME:
				case DTR:
				case DU:
				case DUMP:
				case DWARF:
				case DYN:
				case DYNAM:
				case EDF:
				case EJECT:
				case EJPD:
				case EN:
				case ENDP:
				case ENDPERIOD:
				case ENGLISH:
				case EPILOG:
				case EVENP:
				case EVENPACK:
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
				case HEX:
				case HGPR:
				case HOOK:
				case IC:
				case IN:
				case INITCHECK:
				case INTDATE:
				case INITIAL:
				case INL:
				case INSERT:
				case JA:
				case JP:
				case KA:
				case LANG:
				case LANGUAGE:
				case LAX:
				case LAXPERF:
				case LC:
				case LEADING:
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
				case LP:
				case LU:
				case LXPRF:
				case MAP:
				case MARGINS:
				case MAX:
				case MD:
				case MDECK:
				case MIG:
				case MIXED:
				case MAXPCF:
				case MSG:
				case NAME:
				case NAT:
				case NATIONAL:
				case NATLANG:
				case NC:
				case NN:
				case NO:
				case NOADATA:
				case NOADV:
				case NOALIAS:
				case NOALPHNUM:
				case NOAWO:
				case NOBIN:
				case NOBLOCK0:
				case NOC:
				case NOCBLCARD:
				case NOCICS:
				case NOCMPR2:
				case NOCOMPILE:
				case NOCOPYLOC:
				case NOCOPYRIGHT:
				case NOCPLC:
				case NOCPSM:
				case NOCPYR:
				case NOCURR:
				case NOCURRENCY:
				case NOD:
				case NODATEPROC:
				case NODBCS:
				case NODE:
				case NODEBUG:
				case NODECK:
				case NODEFINE:
				case NODEF:
				case NODIAGTRUNC:
				case NODLL:
				case NODSNAME:
				case NODU:
				case NODUMP:
				case NODP:
				case NODTR:
				case NODWARF:
				case NODYN:
				case NODYNAM:
				case NOEDF:
				case NOEJPD:
				case NOENDP:
				case NOENDPERIOD:
				case NOEPILOG:
				case NOEVENP:
				case NOEVENPACK:
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
				case NOINITCHECK:
				case NOIC:
				case NOINITIAL:
				case NOINLINE:
				case NOINL:
				case NOLAXPERF:
				case NOLENGTH:
				case NOLIB:
				case NOLINKAGE:
				case NOLIST:
				case NOLXPRF:
				case NOMAP:
				case NOMD:
				case NOMDECK:
				case NONAME:
				case NONUM:
				case NONUMBER:
				case NOOBJ:
				case NOOBJECT:
				case NOOMITODOMIN:
				case NOOFF:
				case NOOFFSET:
				case NOOOM:
				case NOOPSEQUENCE:
				case NOOPT:
				case NOOPTIMIZE:
				case NOOPTIONS:
				case NOP:
				case NOPAC:
				case NOPARMCHECK:
				case NOPFD:
				case NOPRESERVE:
				case NOPROLOG:
				case NORENT:
				case NORULES:
				case NOS:
				case NOSEP:
				case NOSEPARATE:
				case NOSEQ:
				case NOSERV:
				case NOSERVICE:
				case NOSLACKBYTES:
				case NOSLCKB:
				case NOSO:
				case NOSOURCE:
				case NOSPIE:
				case NOSQL:
				case NOSQLC:
				case NOSQLCCSID:
				case NOSQLIMS:
				case NOSSR:
				case NOSSRANGE:
				case NOSTDTRUNC:
				case NOSEQUENCE:
				case NOSTGOPT:
				case NOSUPP:
				case NOSUPPRESS:
				case NOTERM:
				case NOTERMINAL:
				case NOTEST:
				case NOTHREAD:
				case NOTRIG:
				case NOUNRA:
				case NOUNREFALL:
				case NOUNREFSOURCE:
				case NOUNRS:
				case NOVBREF:
				case NOVOLATILE:
				case NOWORD:
				case NOX:
				case NOXREF:
				case NOZC:
				case NOZLEN:
				case NOZON:
				case NOZONECHECK:
				case NOZWB:
				case NS:
				case NSEQ:
				case NSYMBOL:
				case NUM:
				case NUMBER:
				case NUMCHECK:
				case NUMPROC:
				case OBJ:
				case OBJECT:
				case OF:
				case OFF:
				case OFFSET:
				case ON:
				case OMITODOMIN:
				case OOM:
				case OP:
				case OPMARGINS:
				case OPSEQUENCE:
				case OPT:
				case OPTFILE:
				case OPTIMIZE:
				case OPTIONS:
				case OUT:
				case OUTDD:
				case PAC:
				case PARMCHECK:
				case PATH:
				case PFD:
				case PPTDBG:
				case PGMN:
				case PGMNAME:
				case PRESERVE:
				case PROLOG:
				case QUALIFY:
				case QUA:
				case QUOTE:
				case RENT:
				case REPLACING:
				case RMODE:
				case RULES:
				case SEP:
				case SEPARATE:
				case SEQ:
				case SEQUENCE:
				case SERV:
				case SERVICE:
				case SHORT:
				case SIZE:
				case SLACKBYTES:
				case SLCKB:
				case SOURCE:
				case SP:
				case SPACE:
				case SPIE:
				case SQL:
				case SQLC:
				case SQLCCSID:
				case SQLIMS:
				case SO:
				case SS:
				case SSR:
				case SSRANGE:
				case STANDARD:
				case STD:
				case STGOPT:
				case STRICT:
				case SUCC:
				case SUPP:
				case SUPPRESS:
				case SYSEIB:
				case SZ:
				case TERM:
				case TERMINAL:
				case TEST:
				case THREAD:
				case TITLE:
				case TRAILING:
				case TRIG:
				case TRUNC:
				case UE:
				case UNREF:
				case UPPER:
				case VBREF:
				case VLR:
				case VOLATILE:
				case VS:
				case VSAMOPENFS:
				case WD:
				case XMLPARSE:
				case XMLSS:
				case XOPTS:
				case XREF:
				case YEARWINDOW:
				case YW:
				case ZC:
				case ZD:
				case ZLEN:
				case ZON:
				case ZONECHECK:
				case ZONEDATA:
				case ZWB:
				case C_CHAR:
				case D_CHAR:
				case E_CHAR:
				case F_CHAR:
				case H_CHAR:
				case I_CHAR:
				case M_CHAR:
				case N_CHAR:
				case O_CHAR:
				case Q_CHAR:
				case S_CHAR:
				case U_CHAR:
				case W_CHAR:
				case X_CHAR:
				case COMMACHAR:
				case IDENTIFIER:
				case PLUSCHAR:
				case OR:
				case STATIC:
				case TO:
				case TRUE:
				case WHEN:
					{
					setState(748);
					cobolWord();
					}
					break;
				case TEXT:
					{
					setState(750); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(749);
						match(TEXT);
						}
						}
						setState(752); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(756);
				match(RPARENCHAR);
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				setState(757);
				_la = _input.LA(1);
				if ( !(_la==XMLPARSE || _la==XP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(758);
				match(LPARENCHAR);
				setState(759);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 402)) & ~0x3f) == 0 && ((1L << (_la - 402)) & ((1L << (XMLSS - 402)) | (1L << (C_CHAR - 402)) | (1L << (X_CHAR - 402)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(760);
				match(RPARENCHAR);
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				setState(761);
				_la = _input.LA(1);
				if ( !(_la==XREF || _la==X_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(762);
					match(LPARENCHAR);
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FULL || _la==SHORT) {
						{
						setState(763);
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

					setState(766);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(769);
				_la = _input.LA(1);
				if ( !(_la==YEARWINDOW || _la==YW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(770);
				match(LPARENCHAR);
				setState(771);
				literal();
				setState(772);
				match(RPARENCHAR);
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				{
				setState(774);
				_la = _input.LA(1);
				if ( !(_la==ZC || _la==ZONECHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(775);
				match(LPARENCHAR);
				setState(776);
				_la = _input.LA(1);
				if ( !(_la==ABD || _la==MSG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(777);
				match(RPARENCHAR);
				}
				}
				break;
			case 190:
				enterOuterAlt(_localctx, 190);
				{
				{
				setState(778);
				_la = _input.LA(1);
				if ( !(_la==ZD || _la==ZONEDATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(779);
				match(LPARENCHAR);
				setState(780);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(781);
				match(RPARENCHAR);
				}
				}
				break;
			case 191:
				enterOuterAlt(_localctx, 191);
				{
				setState(782);
				match(ZWB);
				}
				break;
			case 192:
				enterOuterAlt(_localctx, 192);
				{
				setState(783);
				test_opts();
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

	public static class Define_optContext extends ParserRuleContext {
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public Identifier_et_alContext identifier_et_al() {
			return getRuleContext(Identifier_et_alContext.class,0);
		}
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public TerminalNode DEFINE() { return getToken(CobolPreprocessorParser.DEFINE, 0); }
		public TerminalNode DEF() { return getToken(CobolPreprocessorParser.DEF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode COMMACHAR() { return getToken(CobolPreprocessorParser.COMMACHAR, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CobolPreprocessorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CobolPreprocessorParser.TEXT, i);
		}
		public Define_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterDefine_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitDefine_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitDefine_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_optContext define_opt() throws RecognitionException {
		Define_optContext _localctx = new Define_optContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(786);
			_la = _input.LA(1);
			if ( !(_la==DEF || _la==DEFINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(787);
			match(LPARENCHAR);
			setState(788);
			identifier_et_al();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMACHAR || _la==TEXT) {
				{
				setState(795);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(790); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(789);
						match(TEXT);
						}
						}
						setState(792); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				case COMMACHAR:
					{
					setState(794);
					match(COMMACHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(797);
				literal();
				}
			}

			setState(800);
			match(RPARENCHAR);
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

	public static class Identifier_et_alContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode C_CHAR() { return getToken(CobolPreprocessorParser.C_CHAR, 0); }
		public TerminalNode D_CHAR() { return getToken(CobolPreprocessorParser.D_CHAR, 0); }
		public TerminalNode E_CHAR() { return getToken(CobolPreprocessorParser.E_CHAR, 0); }
		public TerminalNode F_CHAR() { return getToken(CobolPreprocessorParser.F_CHAR, 0); }
		public TerminalNode H_CHAR() { return getToken(CobolPreprocessorParser.H_CHAR, 0); }
		public TerminalNode I_CHAR() { return getToken(CobolPreprocessorParser.I_CHAR, 0); }
		public TerminalNode M_CHAR() { return getToken(CobolPreprocessorParser.M_CHAR, 0); }
		public TerminalNode N_CHAR() { return getToken(CobolPreprocessorParser.N_CHAR, 0); }
		public TerminalNode O_CHAR() { return getToken(CobolPreprocessorParser.O_CHAR, 0); }
		public TerminalNode Q_CHAR() { return getToken(CobolPreprocessorParser.Q_CHAR, 0); }
		public TerminalNode S_CHAR() { return getToken(CobolPreprocessorParser.S_CHAR, 0); }
		public TerminalNode U_CHAR() { return getToken(CobolPreprocessorParser.U_CHAR, 0); }
		public TerminalNode W_CHAR() { return getToken(CobolPreprocessorParser.W_CHAR, 0); }
		public TerminalNode X_CHAR() { return getToken(CobolPreprocessorParser.X_CHAR, 0); }
		public Identifier_et_alContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_et_al; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterIdentifier_et_al(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitIdentifier_et_al(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitIdentifier_et_al(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_et_alContext identifier_et_al() throws RecognitionException {
		Identifier_et_alContext _localctx = new Identifier_et_alContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier_et_al);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_la = _input.LA(1);
			if ( !(((((_la - 415)) & ~0x3f) == 0 && ((1L << (_la - 415)) & ((1L << (C_CHAR - 415)) | (1L << (D_CHAR - 415)) | (1L << (E_CHAR - 415)) | (1L << (F_CHAR - 415)) | (1L << (H_CHAR - 415)) | (1L << (I_CHAR - 415)) | (1L << (M_CHAR - 415)) | (1L << (N_CHAR - 415)) | (1L << (O_CHAR - 415)) | (1L << (Q_CHAR - 415)) | (1L << (S_CHAR - 415)) | (1L << (U_CHAR - 415)) | (1L << (W_CHAR - 415)) | (1L << (X_CHAR - 415)) | (1L << (IDENTIFIER - 415)))) != 0)) ) {
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

	public static class Invdata_optsContext extends ParserRuleContext {
		public TerminalNode CLEANSIGN() { return getToken(CobolPreprocessorParser.CLEANSIGN, 0); }
		public TerminalNode CS() { return getToken(CobolPreprocessorParser.CS, 0); }
		public TerminalNode NOCLEANSIGN() { return getToken(CobolPreprocessorParser.NOCLEANSIGN, 0); }
		public TerminalNode NOCS() { return getToken(CobolPreprocessorParser.NOCS, 0); }
		public TerminalNode FORCENUMCMP() { return getToken(CobolPreprocessorParser.FORCENUMCMP, 0); }
		public TerminalNode FNC() { return getToken(CobolPreprocessorParser.FNC, 0); }
		public TerminalNode NOFORCENUMCMP() { return getToken(CobolPreprocessorParser.NOFORCENUMCMP, 0); }
		public TerminalNode NOFNC() { return getToken(CobolPreprocessorParser.NOFNC, 0); }
		public Invdata_optsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invdata_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterInvdata_opts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitInvdata_opts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitInvdata_opts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invdata_optsContext invdata_opts() throws RecognitionException {
		Invdata_optsContext _localctx = new Invdata_optsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_invdata_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_la = _input.LA(1);
			if ( !(_la==CLEANSIGN || _la==CS || _la==FNC || _la==FORCENUMCMP || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (NOCLEANSIGN - 171)) | (1L << (NOCS - 171)) | (1L << (NOFNC - 171)) | (1L << (NOFORCENUMCMP - 171)))) != 0)) ) {
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

	public static class Numcheck_optsContext extends ParserRuleContext {
		public TerminalNode ZON() { return getToken(CobolPreprocessorParser.ZON, 0); }
		public TerminalNode NOZON() { return getToken(CobolPreprocessorParser.NOZON, 0); }
		public TerminalNode PAC() { return getToken(CobolPreprocessorParser.PAC, 0); }
		public TerminalNode NOPAC() { return getToken(CobolPreprocessorParser.NOPAC, 0); }
		public TerminalNode NOBIN() { return getToken(CobolPreprocessorParser.NOBIN, 0); }
		public TerminalNode MSG() { return getToken(CobolPreprocessorParser.MSG, 0); }
		public TerminalNode ABD() { return getToken(CobolPreprocessorParser.ABD, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public List<Numcheck_zon_optsContext> numcheck_zon_opts() {
			return getRuleContexts(Numcheck_zon_optsContext.class);
		}
		public Numcheck_zon_optsContext numcheck_zon_opts(int i) {
			return getRuleContext(Numcheck_zon_optsContext.class,i);
		}
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public TerminalNode BIN() { return getToken(CobolPreprocessorParser.BIN, 0); }
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolPreprocessorParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolPreprocessorParser.COMMACHAR, i);
		}
		public TerminalNode TRUNCBIN() { return getToken(CobolPreprocessorParser.TRUNCBIN, 0); }
		public TerminalNode NOTRUNCBIN() { return getToken(CobolPreprocessorParser.NOTRUNCBIN, 0); }
		public Numcheck_optsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numcheck_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterNumcheck_opts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitNumcheck_opts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitNumcheck_opts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numcheck_optsContext numcheck_opts() throws RecognitionException {
		Numcheck_optsContext _localctx = new Numcheck_optsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numcheck_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(806);
				match(ZON);
				}
				break;
			case 2:
				{
				{
				setState(807);
				match(ZON);
				setState(808);
				match(LPARENCHAR);
				setState(809);
				numcheck_zon_opts();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMACHAR) {
					{
					{
					setState(810);
					match(COMMACHAR);
					setState(811);
					numcheck_zon_opts();
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(817);
				match(RPARENCHAR);
				}
				}
				break;
			case 3:
				{
				setState(819);
				match(NOZON);
				}
				break;
			case 4:
				{
				setState(820);
				match(PAC);
				}
				break;
			case 5:
				{
				setState(821);
				match(NOPAC);
				}
				break;
			case 6:
				{
				{
				setState(822);
				match(BIN);
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENCHAR) {
					{
					setState(823);
					match(LPARENCHAR);
					setState(824);
					_la = _input.LA(1);
					if ( !(_la==NOTRUNCBIN || _la==TRUNCBIN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(825);
					match(RPARENCHAR);
					}
				}

				}
				}
				break;
			case 7:
				{
				setState(828);
				match(NOBIN);
				}
				break;
			case 8:
				{
				setState(829);
				match(MSG);
				}
				break;
			case 9:
				{
				setState(830);
				match(ABD);
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

	public static class Numcheck_zon_optsContext extends ParserRuleContext {
		public TerminalNode ALPHNUM() { return getToken(CobolPreprocessorParser.ALPHNUM, 0); }
		public TerminalNode NOALPHNUM() { return getToken(CobolPreprocessorParser.NOALPHNUM, 0); }
		public TerminalNode LAXREDEF() { return getToken(CobolPreprocessorParser.LAXREDEF, 0); }
		public TerminalNode STRICTREDEF() { return getToken(CobolPreprocessorParser.STRICTREDEF, 0); }
		public TerminalNode LAX() { return getToken(CobolPreprocessorParser.LAX, 0); }
		public TerminalNode STRICT() { return getToken(CobolPreprocessorParser.STRICT, 0); }
		public Numcheck_zon_optsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numcheck_zon_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterNumcheck_zon_opts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitNumcheck_zon_opts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitNumcheck_zon_opts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numcheck_zon_optsContext numcheck_zon_opts() throws RecognitionException {
		Numcheck_zon_optsContext _localctx = new Numcheck_zon_optsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numcheck_zon_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if ( !(_la==ALPHNUM || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (LAX - 125)) | (1L << (LAXREDEF - 125)) | (1L << (NOALPHNUM - 125)))) != 0) || _la==STRICT || _la==STRICTREDEF) ) {
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

	public static class Rules_optsContext extends ParserRuleContext {
		public TerminalNode ENDPERIOD() { return getToken(CobolPreprocessorParser.ENDPERIOD, 0); }
		public TerminalNode ENDP() { return getToken(CobolPreprocessorParser.ENDP, 0); }
		public TerminalNode NOENDPERIOD() { return getToken(CobolPreprocessorParser.NOENDPERIOD, 0); }
		public TerminalNode NOENDP() { return getToken(CobolPreprocessorParser.NOENDP, 0); }
		public TerminalNode EVENPACK() { return getToken(CobolPreprocessorParser.EVENPACK, 0); }
		public TerminalNode EVENP() { return getToken(CobolPreprocessorParser.EVENP, 0); }
		public TerminalNode NOEVENPACK() { return getToken(CobolPreprocessorParser.NOEVENPACK, 0); }
		public TerminalNode NOEVENP() { return getToken(CobolPreprocessorParser.NOEVENP, 0); }
		public TerminalNode LAXPERF() { return getToken(CobolPreprocessorParser.LAXPERF, 0); }
		public TerminalNode LXPRF() { return getToken(CobolPreprocessorParser.LXPRF, 0); }
		public TerminalNode LAXREDEF() { return getToken(CobolPreprocessorParser.LAXREDEF, 0); }
		public TerminalNode NOLAXPERF() { return getToken(CobolPreprocessorParser.NOLAXPERF, 0); }
		public TerminalNode NOLXPRF() { return getToken(CobolPreprocessorParser.NOLXPRF, 0); }
		public TerminalNode NOLAXREDEF() { return getToken(CobolPreprocessorParser.NOLAXREDEF, 0); }
		public TerminalNode SLACKBYTES() { return getToken(CobolPreprocessorParser.SLACKBYTES, 0); }
		public TerminalNode SLCKB() { return getToken(CobolPreprocessorParser.SLCKB, 0); }
		public TerminalNode NOSLACKBYTES() { return getToken(CobolPreprocessorParser.NOSLACKBYTES, 0); }
		public TerminalNode NOSLCKB() { return getToken(CobolPreprocessorParser.NOSLCKB, 0); }
		public TerminalNode OMITODOMIN() { return getToken(CobolPreprocessorParser.OMITODOMIN, 0); }
		public TerminalNode OOM() { return getToken(CobolPreprocessorParser.OOM, 0); }
		public TerminalNode NOOMITODOMIN() { return getToken(CobolPreprocessorParser.NOOMITODOMIN, 0); }
		public TerminalNode NOOOM() { return getToken(CobolPreprocessorParser.NOOOM, 0); }
		public TerminalNode UNREF() { return getToken(CobolPreprocessorParser.UNREF, 0); }
		public TerminalNode NOUNREFALL() { return getToken(CobolPreprocessorParser.NOUNREFALL, 0); }
		public TerminalNode NOUNRA() { return getToken(CobolPreprocessorParser.NOUNRA, 0); }
		public TerminalNode NOUNREFSOURCE() { return getToken(CobolPreprocessorParser.NOUNREFSOURCE, 0); }
		public TerminalNode NOUNRS() { return getToken(CobolPreprocessorParser.NOUNRS, 0); }
		public Rules_optsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterRules_opts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitRules_opts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitRules_opts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rules_optsContext rules_opts() throws RecognitionException {
		Rules_optsContext _localctx = new Rules_optsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rules_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ENDP - 80)) | (1L << (ENDPERIOD - 80)) | (1L << (EVENP - 80)) | (1L << (EVENPACK - 80)) | (1L << (LAXPERF - 80)) | (1L << (LAXREDEF - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (LXPRF - 144)) | (1L << (NOENDP - 144)) | (1L << (NOENDPERIOD - 144)) | (1L << (NOEVENP - 144)) | (1L << (NOEVENPACK - 144)))) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & ((1L << (NOLAXPERF - 228)) | (1L << (NOLAXREDEF - 228)) | (1L << (NOLXPRF - 228)) | (1L << (NOOMITODOMIN - 228)) | (1L << (NOOOM - 228)) | (1L << (NOSLACKBYTES - 228)) | (1L << (NOSLCKB - 228)) | (1L << (NOUNRA - 228)) | (1L << (NOUNREFALL - 228)) | (1L << (NOUNREFSOURCE - 228)) | (1L << (NOUNRS - 228)))) != 0) || ((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (OMITODOMIN - 315)) | (1L << (OOM - 315)) | (1L << (SLACKBYTES - 315)) | (1L << (SLCKB - 315)))) != 0) || _la==UNREF) ) {
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

	public static class Ssrange_optsContext extends ParserRuleContext {
		public TerminalNode NOZLEN() { return getToken(CobolPreprocessorParser.NOZLEN, 0); }
		public TerminalNode ZLEN() { return getToken(CobolPreprocessorParser.ZLEN, 0); }
		public TerminalNode ABD() { return getToken(CobolPreprocessorParser.ABD, 0); }
		public TerminalNode MSG() { return getToken(CobolPreprocessorParser.MSG, 0); }
		public Ssrange_optsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ssrange_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterSsrange_opts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitSsrange_opts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitSsrange_opts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ssrange_optsContext ssrange_opts() throws RecognitionException {
		Ssrange_optsContext _localctx = new Ssrange_optsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ssrange_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_la = _input.LA(1);
			if ( !(_la==ABD || _la==MSG || _la==NOZLEN || _la==ZLEN) ) {
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

	public static class Test_optsContext extends ParserRuleContext {
		public TerminalNode DWARF() { return getToken(CobolPreprocessorParser.DWARF, 0); }
		public TerminalNode NODWARF() { return getToken(CobolPreprocessorParser.NODWARF, 0); }
		public TerminalNode HOOK() { return getToken(CobolPreprocessorParser.HOOK, 0); }
		public TerminalNode NOHOOK() { return getToken(CobolPreprocessorParser.NOHOOK, 0); }
		public TerminalNode NOSEP() { return getToken(CobolPreprocessorParser.NOSEP, 0); }
		public TerminalNode NOSEPARATE() { return getToken(CobolPreprocessorParser.NOSEPARATE, 0); }
		public TerminalNode SO() { return getToken(CobolPreprocessorParser.SO, 0); }
		public TerminalNode SOURCE() { return getToken(CobolPreprocessorParser.SOURCE, 0); }
		public TerminalNode NOSO() { return getToken(CobolPreprocessorParser.NOSO, 0); }
		public TerminalNode NOSOURCE() { return getToken(CobolPreprocessorParser.NOSOURCE, 0); }
		public TerminalNode EJPD() { return getToken(CobolPreprocessorParser.EJPD, 0); }
		public TerminalNode NOEJPD() { return getToken(CobolPreprocessorParser.NOEJPD, 0); }
		public TerminalNode SEP() { return getToken(CobolPreprocessorParser.SEP, 0); }
		public TerminalNode SEPARATE() { return getToken(CobolPreprocessorParser.SEPARATE, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public TerminalNode DSNAME() { return getToken(CobolPreprocessorParser.DSNAME, 0); }
		public TerminalNode NODSNAME() { return getToken(CobolPreprocessorParser.NODSNAME, 0); }
		public Test_optsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterTest_opts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitTest_opts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitTest_opts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_optsContext test_opts() throws RecognitionException {
		Test_optsContext _localctx = new Test_optsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_test_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DWARF:
				{
				setState(839);
				match(DWARF);
				}
				break;
			case NODWARF:
				{
				setState(840);
				match(NODWARF);
				}
				break;
			case HOOK:
				{
				setState(841);
				match(HOOK);
				}
				break;
			case NOHOOK:
				{
				setState(842);
				match(NOHOOK);
				}
				break;
			case SEP:
			case SEPARATE:
				{
				{
				setState(843);
				_la = _input.LA(1);
				if ( !(_la==SEP || _la==SEPARATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(844);
					match(LPARENCHAR);
					setState(845);
					_la = _input.LA(1);
					if ( !(_la==DSNAME || _la==NODSNAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(846);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case NOSEP:
				{
				setState(849);
				match(NOSEP);
				}
				break;
			case NOSEPARATE:
				{
				setState(850);
				match(NOSEPARATE);
				}
				break;
			case SO:
				{
				setState(851);
				match(SO);
				}
				break;
			case SOURCE:
				{
				setState(852);
				match(SOURCE);
				}
				break;
			case NOSO:
				{
				setState(853);
				match(NOSO);
				}
				break;
			case NOSOURCE:
				{
				setState(854);
				match(NOSOURCE);
				}
				break;
			case EJPD:
				{
				setState(855);
				match(EJPD);
				}
				break;
			case NOEJPD:
				{
				setState(856);
				match(NOEJPD);
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

	public static class ClassicCommentEntryContext extends ParserRuleContext {
		public TerminalNode CLASSIC_COMMENT_TAG() { return getToken(CobolPreprocessorParser.CLASSIC_COMMENT_TAG, 0); }
		public TerminalNode NEWLINE() { return getToken(CobolPreprocessorParser.NEWLINE, 0); }
		public List<TerminalNode> CLASSIC_COMMENT_TEXT() { return getTokens(CobolPreprocessorParser.CLASSIC_COMMENT_TEXT); }
		public TerminalNode CLASSIC_COMMENT_TEXT(int i) {
			return getToken(CobolPreprocessorParser.CLASSIC_COMMENT_TEXT, i);
		}
		public ClassicCommentEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicCommentEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterClassicCommentEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitClassicCommentEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitClassicCommentEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassicCommentEntryContext classicCommentEntry() throws RecognitionException {
		ClassicCommentEntryContext _localctx = new ClassicCommentEntryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classicCommentEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(CLASSIC_COMMENT_TAG);
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASSIC_COMMENT_TEXT) {
				{
				{
				setState(860);
				match(CLASSIC_COMMENT_TEXT);
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(866);
			match(NEWLINE);
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
		public TerminalNode EXEC_CICS() { return getToken(CobolPreprocessorParser.EXEC_CICS, 0); }
		public TerminalNode END_EXEC() { return getToken(CobolPreprocessorParser.END_EXEC, 0); }
		public List<ClassicCommentEntryContext> classicCommentEntry() {
			return getRuleContexts(ClassicCommentEntryContext.class);
		}
		public ClassicCommentEntryContext classicCommentEntry(int i) {
			return getRuleContext(ClassicCommentEntryContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public List<TerminalNode> CICS_TEXT() { return getTokens(CobolPreprocessorParser.CICS_TEXT); }
		public TerminalNode CICS_TEXT(int i) {
			return getToken(CobolPreprocessorParser.CICS_TEXT, i);
		}
		public ExecCicsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execCicsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterExecCicsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitExecCicsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitExecCicsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecCicsStatementContext execCicsStatement() throws RecognitionException {
		ExecCicsStatementContext _localctx = new ExecCicsStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_execCicsStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(EXEC_CICS);
			setState(875); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(875);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CICS_TEXT:
					{
					setState(870); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(869);
							match(CICS_TEXT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(872); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(874);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(877); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASSIC_COMMENT_TAG || _la==CICS_TEXT );
			setState(879);
			match(END_EXEC);
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(880);
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
		public TerminalNode EXEC_SQL() { return getToken(CobolPreprocessorParser.EXEC_SQL, 0); }
		public TerminalNode END_EXEC() { return getToken(CobolPreprocessorParser.END_EXEC, 0); }
		public List<ClassicCommentEntryContext> classicCommentEntry() {
			return getRuleContexts(ClassicCommentEntryContext.class);
		}
		public ClassicCommentEntryContext classicCommentEntry(int i) {
			return getRuleContext(ClassicCommentEntryContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public List<TerminalNode> SQL_TEXT() { return getTokens(CobolPreprocessorParser.SQL_TEXT); }
		public TerminalNode SQL_TEXT(int i) {
			return getToken(CobolPreprocessorParser.SQL_TEXT, i);
		}
		public ExecSqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execSqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterExecSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitExecSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitExecSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecSqlStatementContext execSqlStatement() throws RecognitionException {
		ExecSqlStatementContext _localctx = new ExecSqlStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_execSqlStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(EXEC_SQL);
			setState(890); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(890);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SQL_TEXT:
					{
					setState(885); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(884);
							match(SQL_TEXT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(887); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(889);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(892); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASSIC_COMMENT_TAG || _la==SQL_TEXT );
			setState(894);
			match(END_EXEC);
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(895);
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
		public TerminalNode END_EXEC() { return getToken(CobolPreprocessorParser.END_EXEC, 0); }
		public List<CharDataContext> charData() {
			return getRuleContexts(CharDataContext.class);
		}
		public CharDataContext charData(int i) {
			return getRuleContext(CharDataContext.class,i);
		}
		public List<ClassicCommentEntryContext> classicCommentEntry() {
			return getRuleContexts(ClassicCommentEntryContext.class);
		}
		public ClassicCommentEntryContext classicCommentEntry(int i) {
			return getRuleContext(ClassicCommentEntryContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CobolPreprocessorParser.DOT, 0); }
		public ExecSqlImsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execSqlImsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterExecSqlImsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitExecSqlImsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitExecSqlImsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecSqlImsStatementContext execSqlImsStatement() throws RecognitionException {
		ExecSqlImsStatementContext _localctx = new ExecSqlImsStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_execSqlImsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(EXEC);
			setState(899);
			match(SQLIMS);
			setState(902); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(902);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABD:
				case ADATA:
				case ADV:
				case AFP:
				case ALIAS:
				case ALPHNUM:
				case ANSI:
				case ANY:
				case APOST:
				case AR:
				case ARCH:
				case ARITH:
				case AUTO:
				case AWO:
				case BASIS:
				case BIN:
				case BLOCK0:
				case BUF:
				case BUFSIZE:
				case BY:
				case CBLCARD:
				case CICS:
				case CO:
				case COBOL2:
				case COBOL3:
				case CODEPAGE:
				case COMPAT:
				case COMPILE:
				case COPYLOC:
				case COPYRIGHT:
				case CP:
				case CPLC:
				case CPP:
				case CPSM:
				case CPYR:
				case CS:
				case CURR:
				case CURRENCY:
				case DATA:
				case DATEPROC:
				case DBCS:
				case DD:
				case DEBUG:
				case DEC:
				case DECK:
				case DEF:
				case DEFINE:
				case DELETE:
				case DFHVALUE:
				case DIAGTRUNC:
				case DISPSIGN:
				case DIVISION:
				case DLI:
				case DLL:
				case DP:
				case DS:
				case DSN:
				case DSNAME:
				case DTR:
				case DU:
				case DUMP:
				case DWARF:
				case DYN:
				case DYNAM:
				case EDF:
				case EJECT:
				case EJPD:
				case EN:
				case ENDP:
				case ENDPERIOD:
				case ENGLISH:
				case EPILOG:
				case EVENP:
				case EVENPACK:
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
				case HEX:
				case HGPR:
				case HOOK:
				case IC:
				case IN:
				case INITCHECK:
				case INTDATE:
				case INITIAL:
				case INL:
				case INSERT:
				case JA:
				case JP:
				case KA:
				case LANG:
				case LANGUAGE:
				case LAX:
				case LAXPERF:
				case LC:
				case LEADING:
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
				case LP:
				case LPARENCHAR:
				case LU:
				case LXPRF:
				case MAP:
				case MARGINS:
				case MAX:
				case MD:
				case MDECK:
				case MIG:
				case MIXED:
				case MAXPCF:
				case MSG:
				case NAME:
				case NAT:
				case NATIONAL:
				case NATLANG:
				case NC:
				case NN:
				case NO:
				case NOADATA:
				case NOADV:
				case NOALIAS:
				case NOALPHNUM:
				case NOAWO:
				case NOBIN:
				case NOBLOCK0:
				case NOC:
				case NOCBLCARD:
				case NOCICS:
				case NOCMPR2:
				case NOCOMPILE:
				case NOCOPYLOC:
				case NOCOPYRIGHT:
				case NOCPLC:
				case NOCPSM:
				case NOCPYR:
				case NOCURR:
				case NOCURRENCY:
				case NOD:
				case NODATEPROC:
				case NODBCS:
				case NODE:
				case NODEBUG:
				case NODECK:
				case NODEFINE:
				case NODEF:
				case NODIAGTRUNC:
				case NODLL:
				case NODSNAME:
				case NODU:
				case NODUMP:
				case NODP:
				case NODTR:
				case NODWARF:
				case NODYN:
				case NODYNAM:
				case NOEDF:
				case NOEJPD:
				case NOENDP:
				case NOENDPERIOD:
				case NOEPILOG:
				case NOEVENP:
				case NOEVENPACK:
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
				case NOINITCHECK:
				case NOIC:
				case NOINITIAL:
				case NOINLINE:
				case NOINL:
				case NOLAXPERF:
				case NOLENGTH:
				case NOLIB:
				case NOLINKAGE:
				case NOLIST:
				case NOLXPRF:
				case NOMAP:
				case NOMD:
				case NOMDECK:
				case NONAME:
				case NONUM:
				case NONUMBER:
				case NOOBJ:
				case NOOBJECT:
				case NOOMITODOMIN:
				case NOOFF:
				case NOOFFSET:
				case NOOOM:
				case NOOPSEQUENCE:
				case NOOPT:
				case NOOPTIMIZE:
				case NOOPTIONS:
				case NOP:
				case NOPAC:
				case NOPARMCHECK:
				case NOPFD:
				case NOPRESERVE:
				case NOPROLOG:
				case NORENT:
				case NORULES:
				case NOS:
				case NOSEP:
				case NOSEPARATE:
				case NOSEQ:
				case NOSERV:
				case NOSERVICE:
				case NOSLACKBYTES:
				case NOSLCKB:
				case NOSO:
				case NOSOURCE:
				case NOSPIE:
				case NOSQL:
				case NOSQLC:
				case NOSQLCCSID:
				case NOSQLIMS:
				case NOSSR:
				case NOSSRANGE:
				case NOSTDTRUNC:
				case NOSEQUENCE:
				case NOSTGOPT:
				case NOSUPP:
				case NOSUPPRESS:
				case NOTERM:
				case NOTERMINAL:
				case NOTEST:
				case NOTHREAD:
				case NOTRIG:
				case NOUNRA:
				case NOUNREFALL:
				case NOUNREFSOURCE:
				case NOUNRS:
				case NOVBREF:
				case NOVOLATILE:
				case NOWORD:
				case NOX:
				case NOXREF:
				case NOZC:
				case NOZLEN:
				case NOZON:
				case NOZONECHECK:
				case NOZWB:
				case NS:
				case NSEQ:
				case NSYMBOL:
				case NUM:
				case NUMBER:
				case NUMCHECK:
				case NUMPROC:
				case OBJ:
				case OBJECT:
				case OF:
				case OFF:
				case OFFSET:
				case ON:
				case OMITODOMIN:
				case OOM:
				case OP:
				case OPMARGINS:
				case OPSEQUENCE:
				case OPT:
				case OPTFILE:
				case OPTIMIZE:
				case OPTIONS:
				case OUT:
				case OUTDD:
				case PAC:
				case PARMCHECK:
				case PATH:
				case PFD:
				case PPTDBG:
				case PGMN:
				case PGMNAME:
				case PRESERVE:
				case PROLOG:
				case QUALIFY:
				case QUA:
				case QUOTE:
				case RENT:
				case REPLACING:
				case RMODE:
				case RPARENCHAR:
				case RULES:
				case SEP:
				case SEPARATE:
				case SEQ:
				case SEQUENCE:
				case SERV:
				case SERVICE:
				case SHORT:
				case SIZE:
				case SLACKBYTES:
				case SLCKB:
				case SOURCE:
				case SP:
				case SPACE:
				case SPIE:
				case SQL:
				case SQLC:
				case SQLCCSID:
				case SQLIMS:
				case SO:
				case SS:
				case SSR:
				case SSRANGE:
				case STANDARD:
				case STD:
				case STGOPT:
				case STRICT:
				case SUCC:
				case SUPP:
				case SUPPRESS:
				case SYSEIB:
				case SZ:
				case TERM:
				case TERMINAL:
				case TEST:
				case THREAD:
				case TITLE:
				case TRAILING:
				case TRIG:
				case TRUNC:
				case UE:
				case UNREF:
				case UPPER:
				case VBREF:
				case VLR:
				case VOLATILE:
				case VS:
				case VSAMOPENFS:
				case WD:
				case XMLPARSE:
				case XMLSS:
				case XOPTS:
				case XREF:
				case YEARWINDOW:
				case YW:
				case ZC:
				case ZD:
				case ZLEN:
				case ZON:
				case ZONECHECK:
				case ZONEDATA:
				case ZWB:
				case C_CHAR:
				case D_CHAR:
				case E_CHAR:
				case F_CHAR:
				case H_CHAR:
				case I_CHAR:
				case M_CHAR:
				case N_CHAR:
				case O_CHAR:
				case Q_CHAR:
				case S_CHAR:
				case U_CHAR:
				case W_CHAR:
				case X_CHAR:
				case COMMACHAR:
				case DOT:
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
				case IDENTIFIER:
				case FILENAME:
				case PSEUDOTEXTIDENTIFIER:
				case NEWLINE:
				case TEXT:
				case PLUSCHAR:
				case OR:
				case STATIC:
				case TO:
				case TRUE:
				case WHEN:
					{
					setState(900);
					charData();
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(901);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(904); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (PLUSCHAR - 454)) | (1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0) );
			setState(906);
			match(END_EXEC);
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(907);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCopyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCopyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCopyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyStatementContext copyStatement() throws RecognitionException {
		CopyStatementContext _localctx = new CopyStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_copyStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(COPY);
			setState(911);
			copySource();
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(912);
						match(NEWLINE);
						}
						}
						setState(917);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(920);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REPLACING:
						{
						setState(918);
						replacingPhrase();
						}
						break;
					case SUPPRESS:
						{
						setState(919);
						match(SUPPRESS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(927);
				match(NEWLINE);
				}
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(933);
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
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public CopySourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copySource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCopySource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCopySource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCopySource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopySourceContext copySource() throws RecognitionException {
		CopySourceContext _localctx = new CopySourceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_copySource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(935);
				literal();
				}
				break;
			case ABD:
			case ADATA:
			case ADV:
			case AFP:
			case ALIAS:
			case ALPHNUM:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARCH:
			case ARITH:
			case AUTO:
			case AWO:
			case BASIS:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBLCARD:
			case CICS:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case COPYLOC:
			case COPYRIGHT:
			case CP:
			case CPLC:
			case CPP:
			case CPSM:
			case CPYR:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DEC:
			case DECK:
			case DEF:
			case DEFINE:
			case DELETE:
			case DIAGTRUNC:
			case DISPSIGN:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DS:
			case DSN:
			case DSNAME:
			case DTR:
			case DU:
			case DUMP:
			case DWARF:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENDP:
			case ENDPERIOD:
			case ENGLISH:
			case EPILOG:
			case EVENP:
			case EVENPACK:
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
			case HEX:
			case HGPR:
			case HOOK:
			case IC:
			case IN:
			case INITCHECK:
			case INTDATE:
			case INITIAL:
			case INL:
			case INSERT:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LAX:
			case LAXPERF:
			case LC:
			case LEADING:
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
			case LP:
			case LU:
			case LXPRF:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case MAXPCF:
			case MSG:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NC:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOALPHNUM:
			case NOAWO:
			case NOBIN:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCOPYLOC:
			case NOCOPYRIGHT:
			case NOCPLC:
			case NOCPSM:
			case NOCPYR:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODEFINE:
			case NODEF:
			case NODIAGTRUNC:
			case NODLL:
			case NODSNAME:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODWARF:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOENDP:
			case NOENDPERIOD:
			case NOEPILOG:
			case NOEVENP:
			case NOEVENPACK:
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
			case NOINITCHECK:
			case NOIC:
			case NOINITIAL:
			case NOINLINE:
			case NOINL:
			case NOLAXPERF:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOLXPRF:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOMITODOMIN:
			case NOOFF:
			case NOOFFSET:
			case NOOOM:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPAC:
			case NOPARMCHECK:
			case NOPFD:
			case NOPRESERVE:
			case NOPROLOG:
			case NORENT:
			case NORULES:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSERV:
			case NOSERVICE:
			case NOSLACKBYTES:
			case NOSLCKB:
			case NOSO:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSQLIMS:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOSTGOPT:
			case NOSUPP:
			case NOSUPPRESS:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOUNRA:
			case NOUNREFALL:
			case NOUNREFSOURCE:
			case NOUNRS:
			case NOVBREF:
			case NOVOLATILE:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZC:
			case NOZLEN:
			case NOZON:
			case NOZONECHECK:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMCHECK:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OMITODOMIN:
			case OOM:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PAC:
			case PARMCHECK:
			case PATH:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PRESERVE:
			case PROLOG:
			case QUALIFY:
			case QUA:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case RULES:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SERV:
			case SERVICE:
			case SHORT:
			case SIZE:
			case SLACKBYTES:
			case SLCKB:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SQLIMS:
			case SO:
			case SS:
			case SSR:
			case SSRANGE:
			case STANDARD:
			case STD:
			case STGOPT:
			case STRICT:
			case SUCC:
			case SUPP:
			case SUPPRESS:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRAILING:
			case TRIG:
			case TRUNC:
			case UE:
			case UNREF:
			case UPPER:
			case VBREF:
			case VLR:
			case VOLATILE:
			case VS:
			case VSAMOPENFS:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZC:
			case ZD:
			case ZLEN:
			case ZON:
			case ZONECHECK:
			case ZONEDATA:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case O_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
			case PLUSCHAR:
			case OR:
			case STATIC:
			case TO:
			case TRUE:
			case WHEN:
				{
				setState(936);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(937);
				filename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(940);
					match(NEWLINE);
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(946);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(947);
					match(NEWLINE);
					}
					}
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(953);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCopyLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCopyLibrary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCopyLibrary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyLibraryContext copyLibrary() throws RecognitionException {
		CopyLibraryContext _localctx = new CopyLibraryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_copyLibrary);
		try {
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				literal();
				}
				break;
			case ABD:
			case ADATA:
			case ADV:
			case AFP:
			case ALIAS:
			case ALPHNUM:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARCH:
			case ARITH:
			case AUTO:
			case AWO:
			case BASIS:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBLCARD:
			case CICS:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case COPYLOC:
			case COPYRIGHT:
			case CP:
			case CPLC:
			case CPP:
			case CPSM:
			case CPYR:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DEC:
			case DECK:
			case DEF:
			case DEFINE:
			case DELETE:
			case DIAGTRUNC:
			case DISPSIGN:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DS:
			case DSN:
			case DSNAME:
			case DTR:
			case DU:
			case DUMP:
			case DWARF:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENDP:
			case ENDPERIOD:
			case ENGLISH:
			case EPILOG:
			case EVENP:
			case EVENPACK:
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
			case HEX:
			case HGPR:
			case HOOK:
			case IC:
			case IN:
			case INITCHECK:
			case INTDATE:
			case INITIAL:
			case INL:
			case INSERT:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LAX:
			case LAXPERF:
			case LC:
			case LEADING:
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
			case LP:
			case LU:
			case LXPRF:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case MAXPCF:
			case MSG:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NC:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOALPHNUM:
			case NOAWO:
			case NOBIN:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCOPYLOC:
			case NOCOPYRIGHT:
			case NOCPLC:
			case NOCPSM:
			case NOCPYR:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODEFINE:
			case NODEF:
			case NODIAGTRUNC:
			case NODLL:
			case NODSNAME:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODWARF:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOENDP:
			case NOENDPERIOD:
			case NOEPILOG:
			case NOEVENP:
			case NOEVENPACK:
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
			case NOINITCHECK:
			case NOIC:
			case NOINITIAL:
			case NOINLINE:
			case NOINL:
			case NOLAXPERF:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOLXPRF:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOMITODOMIN:
			case NOOFF:
			case NOOFFSET:
			case NOOOM:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPAC:
			case NOPARMCHECK:
			case NOPFD:
			case NOPRESERVE:
			case NOPROLOG:
			case NORENT:
			case NORULES:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSERV:
			case NOSERVICE:
			case NOSLACKBYTES:
			case NOSLCKB:
			case NOSO:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSQLIMS:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOSTGOPT:
			case NOSUPP:
			case NOSUPPRESS:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOUNRA:
			case NOUNREFALL:
			case NOUNREFSOURCE:
			case NOUNRS:
			case NOVBREF:
			case NOVOLATILE:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZC:
			case NOZLEN:
			case NOZON:
			case NOZONECHECK:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMCHECK:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OMITODOMIN:
			case OOM:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PAC:
			case PARMCHECK:
			case PATH:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PRESERVE:
			case PROLOG:
			case QUALIFY:
			case QUA:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case RULES:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SERV:
			case SERVICE:
			case SHORT:
			case SIZE:
			case SLACKBYTES:
			case SLCKB:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SQLIMS:
			case SO:
			case SS:
			case SSR:
			case SSRANGE:
			case STANDARD:
			case STD:
			case STGOPT:
			case STRICT:
			case SUCC:
			case SUPP:
			case SUPPRESS:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRAILING:
			case TRIG:
			case TRUNC:
			case UE:
			case UNREF:
			case UPPER:
			case VBREF:
			case VLR:
			case VOLATILE:
			case VS:
			case VSAMOPENFS:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZC:
			case ZD:
			case ZLEN:
			case ZON:
			case ZONECHECK:
			case ZONEDATA:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case O_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
			case PLUSCHAR:
			case OR:
			case STATIC:
			case TO:
			case TRUE:
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterReplacingPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitReplacingPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitReplacingPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplacingPhraseContext replacingPhrase() throws RecognitionException {
		ReplacingPhraseContext _localctx = new ReplacingPhraseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_replacingPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(REPLACING);
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(961);
				match(NEWLINE);
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(967);
			replaceClause();
			setState(976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(969); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(968);
						match(NEWLINE);
						}
						}
						setState(971); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(973);
					replaceClause();
					}
					} 
				}
				setState(978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterReplaceArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitReplaceArea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitReplaceArea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceAreaContext replaceArea() throws RecognitionException {
		ReplaceAreaContext _localctx = new ReplaceAreaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_replaceArea);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			replaceByStatement();
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(982);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COPY:
						{
						setState(980);
						copyStatement();
						}
						break;
					case ABD:
					case ADATA:
					case ADV:
					case AFP:
					case ALIAS:
					case ALPHNUM:
					case ANSI:
					case ANY:
					case APOST:
					case AR:
					case ARCH:
					case ARITH:
					case AUTO:
					case AWO:
					case BASIS:
					case BIN:
					case BLOCK0:
					case BUF:
					case BUFSIZE:
					case BY:
					case CBLCARD:
					case CICS:
					case CO:
					case COBOL2:
					case COBOL3:
					case CODEPAGE:
					case COMPAT:
					case COMPILE:
					case COPYLOC:
					case COPYRIGHT:
					case CP:
					case CPLC:
					case CPP:
					case CPSM:
					case CPYR:
					case CS:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DD:
					case DEBUG:
					case DEC:
					case DECK:
					case DEF:
					case DEFINE:
					case DELETE:
					case DFHVALUE:
					case DIAGTRUNC:
					case DISPSIGN:
					case DIVISION:
					case DLI:
					case DLL:
					case DP:
					case DS:
					case DSN:
					case DSNAME:
					case DTR:
					case DU:
					case DUMP:
					case DWARF:
					case DYN:
					case DYNAM:
					case EDF:
					case EJECT:
					case EJPD:
					case EN:
					case ENDP:
					case ENDPERIOD:
					case ENGLISH:
					case EPILOG:
					case EVENP:
					case EVENPACK:
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
					case HEX:
					case HGPR:
					case HOOK:
					case IC:
					case IN:
					case INITCHECK:
					case INTDATE:
					case INITIAL:
					case INL:
					case INSERT:
					case JA:
					case JP:
					case KA:
					case LANG:
					case LANGUAGE:
					case LAX:
					case LAXPERF:
					case LC:
					case LEADING:
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
					case LP:
					case LPARENCHAR:
					case LU:
					case LXPRF:
					case MAP:
					case MARGINS:
					case MAX:
					case MD:
					case MDECK:
					case MIG:
					case MIXED:
					case MAXPCF:
					case MSG:
					case NAME:
					case NAT:
					case NATIONAL:
					case NATLANG:
					case NC:
					case NN:
					case NO:
					case NOADATA:
					case NOADV:
					case NOALIAS:
					case NOALPHNUM:
					case NOAWO:
					case NOBIN:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCOPYLOC:
					case NOCOPYRIGHT:
					case NOCPLC:
					case NOCPSM:
					case NOCPYR:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODEFINE:
					case NODEF:
					case NODIAGTRUNC:
					case NODLL:
					case NODSNAME:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODWARF:
					case NODYN:
					case NODYNAM:
					case NOEDF:
					case NOEJPD:
					case NOENDP:
					case NOENDPERIOD:
					case NOEPILOG:
					case NOEVENP:
					case NOEVENPACK:
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
					case NOINITCHECK:
					case NOIC:
					case NOINITIAL:
					case NOINLINE:
					case NOINL:
					case NOLAXPERF:
					case NOLENGTH:
					case NOLIB:
					case NOLINKAGE:
					case NOLIST:
					case NOLXPRF:
					case NOMAP:
					case NOMD:
					case NOMDECK:
					case NONAME:
					case NONUM:
					case NONUMBER:
					case NOOBJ:
					case NOOBJECT:
					case NOOMITODOMIN:
					case NOOFF:
					case NOOFFSET:
					case NOOOM:
					case NOOPSEQUENCE:
					case NOOPT:
					case NOOPTIMIZE:
					case NOOPTIONS:
					case NOP:
					case NOPAC:
					case NOPARMCHECK:
					case NOPFD:
					case NOPRESERVE:
					case NOPROLOG:
					case NORENT:
					case NORULES:
					case NOS:
					case NOSEP:
					case NOSEPARATE:
					case NOSEQ:
					case NOSERV:
					case NOSERVICE:
					case NOSLACKBYTES:
					case NOSLCKB:
					case NOSO:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSQLIMS:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOSTGOPT:
					case NOSUPP:
					case NOSUPPRESS:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOTRIG:
					case NOUNRA:
					case NOUNREFALL:
					case NOUNREFSOURCE:
					case NOUNRS:
					case NOVBREF:
					case NOVOLATILE:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZC:
					case NOZLEN:
					case NOZON:
					case NOZONECHECK:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMCHECK:
					case NUMPROC:
					case OBJ:
					case OBJECT:
					case OF:
					case OFF:
					case OFFSET:
					case ON:
					case OMITODOMIN:
					case OOM:
					case OP:
					case OPMARGINS:
					case OPSEQUENCE:
					case OPT:
					case OPTFILE:
					case OPTIMIZE:
					case OPTIONS:
					case OUT:
					case OUTDD:
					case PAC:
					case PARMCHECK:
					case PATH:
					case PFD:
					case PPTDBG:
					case PGMN:
					case PGMNAME:
					case PRESERVE:
					case PROLOG:
					case QUALIFY:
					case QUA:
					case QUOTE:
					case RENT:
					case REPLACING:
					case RMODE:
					case RPARENCHAR:
					case RULES:
					case SEP:
					case SEPARATE:
					case SEQ:
					case SEQUENCE:
					case SERV:
					case SERVICE:
					case SHORT:
					case SIZE:
					case SLACKBYTES:
					case SLCKB:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SQLIMS:
					case SO:
					case SS:
					case SSR:
					case SSRANGE:
					case STANDARD:
					case STD:
					case STGOPT:
					case STRICT:
					case SUCC:
					case SUPP:
					case SUPPRESS:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TITLE:
					case TRAILING:
					case TRIG:
					case TRUNC:
					case UE:
					case UNREF:
					case UPPER:
					case VBREF:
					case VLR:
					case VOLATILE:
					case VS:
					case VSAMOPENFS:
					case WD:
					case XMLPARSE:
					case XMLSS:
					case XOPTS:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZC:
					case ZD:
					case ZLEN:
					case ZON:
					case ZONECHECK:
					case ZONEDATA:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case E_CHAR:
					case F_CHAR:
					case H_CHAR:
					case I_CHAR:
					case M_CHAR:
					case N_CHAR:
					case O_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case U_CHAR:
					case W_CHAR:
					case X_CHAR:
					case COMMACHAR:
					case DOT:
					case NONNUMERICLITERAL:
					case CONTINUED_NONNUMERICLITERAL:
					case NUMERICLITERAL:
					case IDENTIFIER:
					case FILENAME:
					case PSEUDOTEXTIDENTIFIER:
					case NEWLINE:
					case TEXT:
					case PLUSCHAR:
					case OR:
					case STATIC:
					case TO:
					case TRUE:
					case WHEN:
						{
						setState(981);
						charData();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(987);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterReplaceByStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitReplaceByStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitReplaceByStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceByStatementContext replaceByStatement() throws RecognitionException {
		ReplaceByStatementContext _localctx = new ReplaceByStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_replaceByStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(REPLACE);
			setState(998); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(991);
						match(NEWLINE);
						}
						}
						setState(996);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(997);
					replaceClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1000); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1002);
				match(NEWLINE);
				}
				}
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1008);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterReplaceOffStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitReplaceOffStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitReplaceOffStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceOffStatementContext replaceOffStatement() throws RecognitionException {
		ReplaceOffStatementContext _localctx = new ReplaceOffStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_replaceOffStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(REPLACE);
			setState(1011);
			match(OFF);
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1012);
				match(NEWLINE);
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018);
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
		public TerminalNode LEADING() { return getToken(CobolPreprocessorParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(CobolPreprocessorParser.TRAILING, 0); }
		public ReplaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterReplaceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitReplaceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitReplaceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceClauseContext replaceClause() throws RecognitionException {
		ReplaceClauseContext _localctx = new ReplaceClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_replaceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1020);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1023);
			replaceable();
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1024);
				match(NEWLINE);
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1030);
			match(BY);
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1031);
				match(NEWLINE);
				}
				}
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1037);
			replacement();
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1038);
					match(NEWLINE);
					}
					}
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1044);
				directoryPhrase();
				}
				break;
			}
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1047);
					match(NEWLINE);
					}
					}
					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterDirectoryPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitDirectoryPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitDirectoryPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectoryPhraseContext directoryPhrase() throws RecognitionException {
		DirectoryPhraseContext _localctx = new DirectoryPhraseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_directoryPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1057);
				match(NEWLINE);
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1063);
				literal();
				}
				break;
			case ABD:
			case ADATA:
			case ADV:
			case AFP:
			case ALIAS:
			case ALPHNUM:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARCH:
			case ARITH:
			case AUTO:
			case AWO:
			case BASIS:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBLCARD:
			case CICS:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case COPYLOC:
			case COPYRIGHT:
			case CP:
			case CPLC:
			case CPP:
			case CPSM:
			case CPYR:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DEC:
			case DECK:
			case DEF:
			case DEFINE:
			case DELETE:
			case DIAGTRUNC:
			case DISPSIGN:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DS:
			case DSN:
			case DSNAME:
			case DTR:
			case DU:
			case DUMP:
			case DWARF:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENDP:
			case ENDPERIOD:
			case ENGLISH:
			case EPILOG:
			case EVENP:
			case EVENPACK:
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
			case HEX:
			case HGPR:
			case HOOK:
			case IC:
			case IN:
			case INITCHECK:
			case INTDATE:
			case INITIAL:
			case INL:
			case INSERT:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LAX:
			case LAXPERF:
			case LC:
			case LEADING:
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
			case LP:
			case LU:
			case LXPRF:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case MAXPCF:
			case MSG:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NC:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOALPHNUM:
			case NOAWO:
			case NOBIN:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCOPYLOC:
			case NOCOPYRIGHT:
			case NOCPLC:
			case NOCPSM:
			case NOCPYR:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODEFINE:
			case NODEF:
			case NODIAGTRUNC:
			case NODLL:
			case NODSNAME:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODWARF:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOENDP:
			case NOENDPERIOD:
			case NOEPILOG:
			case NOEVENP:
			case NOEVENPACK:
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
			case NOINITCHECK:
			case NOIC:
			case NOINITIAL:
			case NOINLINE:
			case NOINL:
			case NOLAXPERF:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOLXPRF:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOMITODOMIN:
			case NOOFF:
			case NOOFFSET:
			case NOOOM:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPAC:
			case NOPARMCHECK:
			case NOPFD:
			case NOPRESERVE:
			case NOPROLOG:
			case NORENT:
			case NORULES:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSERV:
			case NOSERVICE:
			case NOSLACKBYTES:
			case NOSLCKB:
			case NOSO:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSQLIMS:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOSTGOPT:
			case NOSUPP:
			case NOSUPPRESS:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOUNRA:
			case NOUNREFALL:
			case NOUNREFSOURCE:
			case NOUNRS:
			case NOVBREF:
			case NOVOLATILE:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZC:
			case NOZLEN:
			case NOZON:
			case NOZONECHECK:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMCHECK:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OMITODOMIN:
			case OOM:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PAC:
			case PARMCHECK:
			case PATH:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PRESERVE:
			case PROLOG:
			case QUALIFY:
			case QUA:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case RULES:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SERV:
			case SERVICE:
			case SHORT:
			case SIZE:
			case SLACKBYTES:
			case SLCKB:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SQLIMS:
			case SO:
			case SS:
			case SSR:
			case SSRANGE:
			case STANDARD:
			case STD:
			case STGOPT:
			case STRICT:
			case SUCC:
			case SUPP:
			case SUPPRESS:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRAILING:
			case TRIG:
			case TRUNC:
			case UE:
			case UNREF:
			case UPPER:
			case VBREF:
			case VLR:
			case VOLATILE:
			case VS:
			case VSAMOPENFS:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZC:
			case ZD:
			case ZLEN:
			case ZON:
			case ZONECHECK:
			case ZONEDATA:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case O_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
			case PLUSCHAR:
			case OR:
			case STATIC:
			case TO:
			case TRUE:
			case WHEN:
				{
				setState(1064);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterFamilyPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitFamilyPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitFamilyPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FamilyPhraseContext familyPhrase() throws RecognitionException {
		FamilyPhraseContext _localctx = new FamilyPhraseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_familyPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(ON);
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1068);
				match(NEWLINE);
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1076);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1074);
				literal();
				}
				break;
			case ABD:
			case ADATA:
			case ADV:
			case AFP:
			case ALIAS:
			case ALPHNUM:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARCH:
			case ARITH:
			case AUTO:
			case AWO:
			case BASIS:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBLCARD:
			case CICS:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case COPYLOC:
			case COPYRIGHT:
			case CP:
			case CPLC:
			case CPP:
			case CPSM:
			case CPYR:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DEC:
			case DECK:
			case DEF:
			case DEFINE:
			case DELETE:
			case DIAGTRUNC:
			case DISPSIGN:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DS:
			case DSN:
			case DSNAME:
			case DTR:
			case DU:
			case DUMP:
			case DWARF:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENDP:
			case ENDPERIOD:
			case ENGLISH:
			case EPILOG:
			case EVENP:
			case EVENPACK:
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
			case HEX:
			case HGPR:
			case HOOK:
			case IC:
			case IN:
			case INITCHECK:
			case INTDATE:
			case INITIAL:
			case INL:
			case INSERT:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LAX:
			case LAXPERF:
			case LC:
			case LEADING:
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
			case LP:
			case LU:
			case LXPRF:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case MAXPCF:
			case MSG:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NC:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOALPHNUM:
			case NOAWO:
			case NOBIN:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCOPYLOC:
			case NOCOPYRIGHT:
			case NOCPLC:
			case NOCPSM:
			case NOCPYR:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODEFINE:
			case NODEF:
			case NODIAGTRUNC:
			case NODLL:
			case NODSNAME:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODWARF:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOENDP:
			case NOENDPERIOD:
			case NOEPILOG:
			case NOEVENP:
			case NOEVENPACK:
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
			case NOINITCHECK:
			case NOIC:
			case NOINITIAL:
			case NOINLINE:
			case NOINL:
			case NOLAXPERF:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOLXPRF:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOMITODOMIN:
			case NOOFF:
			case NOOFFSET:
			case NOOOM:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPAC:
			case NOPARMCHECK:
			case NOPFD:
			case NOPRESERVE:
			case NOPROLOG:
			case NORENT:
			case NORULES:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSERV:
			case NOSERVICE:
			case NOSLACKBYTES:
			case NOSLCKB:
			case NOSO:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSQLIMS:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOSTGOPT:
			case NOSUPP:
			case NOSUPPRESS:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOUNRA:
			case NOUNREFALL:
			case NOUNREFSOURCE:
			case NOUNRS:
			case NOVBREF:
			case NOVOLATILE:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZC:
			case NOZLEN:
			case NOZON:
			case NOZONECHECK:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMCHECK:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OMITODOMIN:
			case OOM:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PAC:
			case PARMCHECK:
			case PATH:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PRESERVE:
			case PROLOG:
			case QUALIFY:
			case QUA:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case RULES:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SERV:
			case SERVICE:
			case SHORT:
			case SIZE:
			case SLACKBYTES:
			case SLCKB:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SQLIMS:
			case SO:
			case SS:
			case SSR:
			case SSRANGE:
			case STANDARD:
			case STD:
			case STGOPT:
			case STRICT:
			case SUCC:
			case SUPP:
			case SUPPRESS:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRAILING:
			case TRIG:
			case TRUNC:
			case UE:
			case UNREF:
			case UPPER:
			case VBREF:
			case VLR:
			case VOLATILE:
			case VS:
			case VSAMOPENFS:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZC:
			case ZD:
			case ZLEN:
			case ZON:
			case ZONECHECK:
			case ZONEDATA:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case O_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
			case PLUSCHAR:
			case OR:
			case STATIC:
			case TO:
			case TRUE:
			case WHEN:
				{
				setState(1075);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterReplaceable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitReplaceable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitReplaceable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceableContext replaceable() throws RecognitionException {
		ReplaceableContext _localctx = new ReplaceableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_replaceable);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterReplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitReplacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitReplacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplacementContext replacement() throws RecognitionException {
		ReplacementContext _localctx = new ReplacementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_replacement);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1087);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterEjectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitEjectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitEjectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EjectStatementContext ejectStatement() throws RecognitionException {
		EjectStatementContext _localctx = new EjectStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ejectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(EJECT);
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1091);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterSkipStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitSkipStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitSkipStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipStatementContext skipStatement() throws RecognitionException {
		SkipStatementContext _localctx = new SkipStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_skipStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			_la = _input.LA(1);
			if ( !(((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (SKIP1 - 364)) | (1L << (SKIP2 - 364)) | (1L << (SKIP3 - 364)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1095);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterTitleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitTitleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitTitleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleStatementContext titleStatement() throws RecognitionException {
		TitleStatementContext _localctx = new TitleStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_titleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(TITLE);
			setState(1099);
			literal();
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1100);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterPseudoText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitPseudoText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitPseudoText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoTextContext pseudoText() throws RecognitionException {
		PseudoTextContext _localctx = new PseudoTextContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pseudoText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(DOUBLEEQUALCHAR);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (PLUSCHAR - 454)) | (1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0)) {
				{
				setState(1104);
				charData();
				}
			}

			setState(1107);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCharData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCharData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCharData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataContext charData() throws RecognitionException {
		CharDataContext _localctx = new CharDataContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_charData);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1111);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ABD:
					case ADATA:
					case ADV:
					case AFP:
					case ALIAS:
					case ALPHNUM:
					case ANSI:
					case ANY:
					case APOST:
					case AR:
					case ARCH:
					case ARITH:
					case AUTO:
					case AWO:
					case BASIS:
					case BIN:
					case BLOCK0:
					case BUF:
					case BUFSIZE:
					case BY:
					case CBLCARD:
					case CICS:
					case CO:
					case COBOL2:
					case COBOL3:
					case CODEPAGE:
					case COMPAT:
					case COMPILE:
					case COPYLOC:
					case COPYRIGHT:
					case CP:
					case CPLC:
					case CPP:
					case CPSM:
					case CPYR:
					case CS:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DD:
					case DEBUG:
					case DEC:
					case DECK:
					case DEF:
					case DEFINE:
					case DELETE:
					case DFHVALUE:
					case DIAGTRUNC:
					case DISPSIGN:
					case DIVISION:
					case DLI:
					case DLL:
					case DP:
					case DS:
					case DSN:
					case DSNAME:
					case DTR:
					case DU:
					case DUMP:
					case DWARF:
					case DYN:
					case DYNAM:
					case EDF:
					case EJECT:
					case EJPD:
					case EN:
					case ENDP:
					case ENDPERIOD:
					case ENGLISH:
					case EPILOG:
					case EVENP:
					case EVENPACK:
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
					case HEX:
					case HGPR:
					case HOOK:
					case IC:
					case IN:
					case INITCHECK:
					case INTDATE:
					case INITIAL:
					case INL:
					case INSERT:
					case JA:
					case JP:
					case KA:
					case LANG:
					case LANGUAGE:
					case LAX:
					case LAXPERF:
					case LC:
					case LEADING:
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
					case LP:
					case LPARENCHAR:
					case LU:
					case LXPRF:
					case MAP:
					case MARGINS:
					case MAX:
					case MD:
					case MDECK:
					case MIG:
					case MIXED:
					case MAXPCF:
					case MSG:
					case NAME:
					case NAT:
					case NATIONAL:
					case NATLANG:
					case NC:
					case NN:
					case NO:
					case NOADATA:
					case NOADV:
					case NOALIAS:
					case NOALPHNUM:
					case NOAWO:
					case NOBIN:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCOPYLOC:
					case NOCOPYRIGHT:
					case NOCPLC:
					case NOCPSM:
					case NOCPYR:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODEFINE:
					case NODEF:
					case NODIAGTRUNC:
					case NODLL:
					case NODSNAME:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODWARF:
					case NODYN:
					case NODYNAM:
					case NOEDF:
					case NOEJPD:
					case NOENDP:
					case NOENDPERIOD:
					case NOEPILOG:
					case NOEVENP:
					case NOEVENPACK:
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
					case NOINITCHECK:
					case NOIC:
					case NOINITIAL:
					case NOINLINE:
					case NOINL:
					case NOLAXPERF:
					case NOLENGTH:
					case NOLIB:
					case NOLINKAGE:
					case NOLIST:
					case NOLXPRF:
					case NOMAP:
					case NOMD:
					case NOMDECK:
					case NONAME:
					case NONUM:
					case NONUMBER:
					case NOOBJ:
					case NOOBJECT:
					case NOOMITODOMIN:
					case NOOFF:
					case NOOFFSET:
					case NOOOM:
					case NOOPSEQUENCE:
					case NOOPT:
					case NOOPTIMIZE:
					case NOOPTIONS:
					case NOP:
					case NOPAC:
					case NOPARMCHECK:
					case NOPFD:
					case NOPRESERVE:
					case NOPROLOG:
					case NORENT:
					case NORULES:
					case NOS:
					case NOSEP:
					case NOSEPARATE:
					case NOSEQ:
					case NOSERV:
					case NOSERVICE:
					case NOSLACKBYTES:
					case NOSLCKB:
					case NOSO:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSQLIMS:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOSTGOPT:
					case NOSUPP:
					case NOSUPPRESS:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOTRIG:
					case NOUNRA:
					case NOUNREFALL:
					case NOUNREFSOURCE:
					case NOUNRS:
					case NOVBREF:
					case NOVOLATILE:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZC:
					case NOZLEN:
					case NOZON:
					case NOZONECHECK:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMCHECK:
					case NUMPROC:
					case OBJ:
					case OBJECT:
					case OF:
					case OFF:
					case OFFSET:
					case ON:
					case OMITODOMIN:
					case OOM:
					case OP:
					case OPMARGINS:
					case OPSEQUENCE:
					case OPT:
					case OPTFILE:
					case OPTIMIZE:
					case OPTIONS:
					case OUT:
					case OUTDD:
					case PAC:
					case PARMCHECK:
					case PATH:
					case PFD:
					case PPTDBG:
					case PGMN:
					case PGMNAME:
					case PRESERVE:
					case PROLOG:
					case QUALIFY:
					case QUA:
					case QUOTE:
					case RENT:
					case REPLACING:
					case RMODE:
					case RPARENCHAR:
					case RULES:
					case SEP:
					case SEPARATE:
					case SEQ:
					case SEQUENCE:
					case SERV:
					case SERVICE:
					case SHORT:
					case SIZE:
					case SLACKBYTES:
					case SLCKB:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SQLIMS:
					case SO:
					case SS:
					case SSR:
					case SSRANGE:
					case STANDARD:
					case STD:
					case STGOPT:
					case STRICT:
					case SUCC:
					case SUPP:
					case SUPPRESS:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TITLE:
					case TRAILING:
					case TRIG:
					case TRUNC:
					case UE:
					case UNREF:
					case UPPER:
					case VBREF:
					case VLR:
					case VOLATILE:
					case VS:
					case VSAMOPENFS:
					case WD:
					case XMLPARSE:
					case XMLSS:
					case XOPTS:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZC:
					case ZD:
					case ZLEN:
					case ZON:
					case ZONECHECK:
					case ZONEDATA:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case E_CHAR:
					case F_CHAR:
					case H_CHAR:
					case I_CHAR:
					case M_CHAR:
					case N_CHAR:
					case O_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case U_CHAR:
					case W_CHAR:
					case X_CHAR:
					case COMMACHAR:
					case DOT:
					case NONNUMERICLITERAL:
					case CONTINUED_NONNUMERICLITERAL:
					case NUMERICLITERAL:
					case IDENTIFIER:
					case FILENAME:
					case PSEUDOTEXTIDENTIFIER:
					case TEXT:
					case PLUSCHAR:
					case OR:
					case STATIC:
					case TO:
					case TRUE:
					case WHEN:
						{
						setState(1109);
						charDataLine();
						}
						break;
					case NEWLINE:
						{
						setState(1110);
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
				setState(1113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCharDataSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCharDataSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCharDataSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataSqlContext charDataSql() throws RecognitionException {
		CharDataSqlContext _localctx = new CharDataSqlContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_charDataSql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABD:
				case ADATA:
				case ADV:
				case AFP:
				case ALIAS:
				case ALPHNUM:
				case ANSI:
				case ANY:
				case APOST:
				case AR:
				case ARCH:
				case ARITH:
				case AUTO:
				case AWO:
				case BASIS:
				case BIN:
				case BLOCK0:
				case BUF:
				case BUFSIZE:
				case BY:
				case CBLCARD:
				case CICS:
				case CO:
				case COBOL2:
				case COBOL3:
				case CODEPAGE:
				case COMPAT:
				case COMPILE:
				case COPYLOC:
				case COPYRIGHT:
				case CP:
				case CPLC:
				case CPP:
				case CPSM:
				case CPYR:
				case CS:
				case CURR:
				case CURRENCY:
				case DATA:
				case DATEPROC:
				case DBCS:
				case DD:
				case DEBUG:
				case DEC:
				case DECK:
				case DEF:
				case DEFINE:
				case DELETE:
				case DFHVALUE:
				case DIAGTRUNC:
				case DISPSIGN:
				case DIVISION:
				case DLI:
				case DLL:
				case DP:
				case DS:
				case DSN:
				case DSNAME:
				case DTR:
				case DU:
				case DUMP:
				case DWARF:
				case DYN:
				case DYNAM:
				case EDF:
				case EJECT:
				case EJPD:
				case EN:
				case ENDP:
				case ENDPERIOD:
				case ENGLISH:
				case EPILOG:
				case EVENP:
				case EVENPACK:
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
				case HEX:
				case HGPR:
				case HOOK:
				case IC:
				case IN:
				case INITCHECK:
				case INTDATE:
				case INITIAL:
				case INL:
				case INSERT:
				case JA:
				case JP:
				case KA:
				case LANG:
				case LANGUAGE:
				case LAX:
				case LAXPERF:
				case LC:
				case LEADING:
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
				case LP:
				case LPARENCHAR:
				case LU:
				case LXPRF:
				case MAP:
				case MARGINS:
				case MAX:
				case MD:
				case MDECK:
				case MIG:
				case MIXED:
				case MAXPCF:
				case MSG:
				case NAME:
				case NAT:
				case NATIONAL:
				case NATLANG:
				case NC:
				case NN:
				case NO:
				case NOADATA:
				case NOADV:
				case NOALIAS:
				case NOALPHNUM:
				case NOAWO:
				case NOBIN:
				case NOBLOCK0:
				case NOC:
				case NOCBLCARD:
				case NOCICS:
				case NOCMPR2:
				case NOCOMPILE:
				case NOCOPYLOC:
				case NOCOPYRIGHT:
				case NOCPLC:
				case NOCPSM:
				case NOCPYR:
				case NOCURR:
				case NOCURRENCY:
				case NOD:
				case NODATEPROC:
				case NODBCS:
				case NODE:
				case NODEBUG:
				case NODECK:
				case NODEFINE:
				case NODEF:
				case NODIAGTRUNC:
				case NODLL:
				case NODSNAME:
				case NODU:
				case NODUMP:
				case NODP:
				case NODTR:
				case NODWARF:
				case NODYN:
				case NODYNAM:
				case NOEDF:
				case NOEJPD:
				case NOENDP:
				case NOENDPERIOD:
				case NOEPILOG:
				case NOEVENP:
				case NOEVENPACK:
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
				case NOINITCHECK:
				case NOIC:
				case NOINITIAL:
				case NOINLINE:
				case NOINL:
				case NOLAXPERF:
				case NOLENGTH:
				case NOLIB:
				case NOLINKAGE:
				case NOLIST:
				case NOLXPRF:
				case NOMAP:
				case NOMD:
				case NOMDECK:
				case NONAME:
				case NONUM:
				case NONUMBER:
				case NOOBJ:
				case NOOBJECT:
				case NOOMITODOMIN:
				case NOOFF:
				case NOOFFSET:
				case NOOOM:
				case NOOPSEQUENCE:
				case NOOPT:
				case NOOPTIMIZE:
				case NOOPTIONS:
				case NOP:
				case NOPAC:
				case NOPARMCHECK:
				case NOPFD:
				case NOPRESERVE:
				case NOPROLOG:
				case NORENT:
				case NORULES:
				case NOS:
				case NOSEP:
				case NOSEPARATE:
				case NOSEQ:
				case NOSERV:
				case NOSERVICE:
				case NOSLACKBYTES:
				case NOSLCKB:
				case NOSO:
				case NOSOURCE:
				case NOSPIE:
				case NOSQL:
				case NOSQLC:
				case NOSQLCCSID:
				case NOSQLIMS:
				case NOSSR:
				case NOSSRANGE:
				case NOSTDTRUNC:
				case NOSEQUENCE:
				case NOSTGOPT:
				case NOSUPP:
				case NOSUPPRESS:
				case NOTERM:
				case NOTERMINAL:
				case NOTEST:
				case NOTHREAD:
				case NOTRIG:
				case NOUNRA:
				case NOUNREFALL:
				case NOUNREFSOURCE:
				case NOUNRS:
				case NOVBREF:
				case NOVOLATILE:
				case NOWORD:
				case NOX:
				case NOXREF:
				case NOZC:
				case NOZLEN:
				case NOZON:
				case NOZONECHECK:
				case NOZWB:
				case NS:
				case NSEQ:
				case NSYMBOL:
				case NUM:
				case NUMBER:
				case NUMCHECK:
				case NUMPROC:
				case OBJ:
				case OBJECT:
				case OF:
				case OFF:
				case OFFSET:
				case ON:
				case OMITODOMIN:
				case OOM:
				case OP:
				case OPMARGINS:
				case OPSEQUENCE:
				case OPT:
				case OPTFILE:
				case OPTIMIZE:
				case OPTIONS:
				case OUT:
				case OUTDD:
				case PAC:
				case PARMCHECK:
				case PATH:
				case PFD:
				case PPTDBG:
				case PGMN:
				case PGMNAME:
				case PRESERVE:
				case PROLOG:
				case QUALIFY:
				case QUA:
				case QUOTE:
				case RENT:
				case REPLACING:
				case RMODE:
				case RPARENCHAR:
				case RULES:
				case SEP:
				case SEPARATE:
				case SEQ:
				case SEQUENCE:
				case SERV:
				case SERVICE:
				case SHORT:
				case SIZE:
				case SLACKBYTES:
				case SLCKB:
				case SOURCE:
				case SP:
				case SPACE:
				case SPIE:
				case SQL:
				case SQLC:
				case SQLCCSID:
				case SQLIMS:
				case SO:
				case SS:
				case SSR:
				case SSRANGE:
				case STANDARD:
				case STD:
				case STGOPT:
				case STRICT:
				case SUCC:
				case SUPP:
				case SUPPRESS:
				case SYSEIB:
				case SZ:
				case TERM:
				case TERMINAL:
				case TEST:
				case THREAD:
				case TITLE:
				case TRAILING:
				case TRIG:
				case TRUNC:
				case UE:
				case UNREF:
				case UPPER:
				case VBREF:
				case VLR:
				case VOLATILE:
				case VS:
				case VSAMOPENFS:
				case WD:
				case XMLPARSE:
				case XMLSS:
				case XOPTS:
				case XREF:
				case YEARWINDOW:
				case YW:
				case ZC:
				case ZD:
				case ZLEN:
				case ZON:
				case ZONECHECK:
				case ZONEDATA:
				case ZWB:
				case C_CHAR:
				case D_CHAR:
				case E_CHAR:
				case F_CHAR:
				case H_CHAR:
				case I_CHAR:
				case M_CHAR:
				case N_CHAR:
				case O_CHAR:
				case Q_CHAR:
				case S_CHAR:
				case U_CHAR:
				case W_CHAR:
				case X_CHAR:
				case COMMACHAR:
				case DOT:
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
				case IDENTIFIER:
				case FILENAME:
				case PSEUDOTEXTIDENTIFIER:
				case TEXT:
				case PLUSCHAR:
				case OR:
				case STATIC:
				case TO:
				case TRUE:
				case WHEN:
					{
					setState(1115);
					charDataLine();
					}
					break;
				case COPY:
					{
					setState(1116);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(1117);
					match(REPLACE);
					}
					break;
				case NEWLINE:
					{
					setState(1118);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (PLUSCHAR - 454)) | (1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0) );
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
		public List<DfhvalueContext> dfhvalue() {
			return getRuleContexts(DfhvalueContext.class);
		}
		public DfhvalueContext dfhvalue(int i) {
			return getRuleContext(DfhvalueContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobolPreprocessorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobolPreprocessorParser.NEWLINE, i);
		}
		public List<TerminalNode> CLASSIC_CONTINUATION() { return getTokens(CobolPreprocessorParser.CLASSIC_CONTINUATION); }
		public TerminalNode CLASSIC_CONTINUATION(int i) {
			return getToken(CobolPreprocessorParser.CLASSIC_CONTINUATION, i);
		}
		public CharDataLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDataLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCharDataLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCharDataLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCharDataLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataLineContext charDataLine() throws RecognitionException {
		CharDataLineContext _localctx = new CharDataLineContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_charDataLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1132);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ABD:
					case ADATA:
					case ADV:
					case AFP:
					case ALIAS:
					case ALPHNUM:
					case ANSI:
					case ANY:
					case APOST:
					case AR:
					case ARCH:
					case ARITH:
					case AUTO:
					case AWO:
					case BASIS:
					case BIN:
					case BLOCK0:
					case BUF:
					case BUFSIZE:
					case BY:
					case CBLCARD:
					case CICS:
					case CO:
					case COBOL2:
					case COBOL3:
					case CODEPAGE:
					case COMPAT:
					case COMPILE:
					case COPYLOC:
					case COPYRIGHT:
					case CP:
					case CPLC:
					case CPP:
					case CPSM:
					case CPYR:
					case CS:
					case CURR:
					case CURRENCY:
					case DATA:
					case DATEPROC:
					case DBCS:
					case DD:
					case DEBUG:
					case DEC:
					case DECK:
					case DEF:
					case DEFINE:
					case DELETE:
					case DIAGTRUNC:
					case DISPSIGN:
					case DIVISION:
					case DLI:
					case DLL:
					case DP:
					case DS:
					case DSN:
					case DSNAME:
					case DTR:
					case DU:
					case DUMP:
					case DWARF:
					case DYN:
					case DYNAM:
					case EDF:
					case EJECT:
					case EJPD:
					case EN:
					case ENDP:
					case ENDPERIOD:
					case ENGLISH:
					case EPILOG:
					case EVENP:
					case EVENPACK:
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
					case HEX:
					case HGPR:
					case HOOK:
					case IC:
					case IN:
					case INITCHECK:
					case INTDATE:
					case INITIAL:
					case INL:
					case INSERT:
					case JA:
					case JP:
					case KA:
					case LANG:
					case LANGUAGE:
					case LAX:
					case LAXPERF:
					case LC:
					case LEADING:
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
					case LP:
					case LU:
					case LXPRF:
					case MAP:
					case MARGINS:
					case MAX:
					case MD:
					case MDECK:
					case MIG:
					case MIXED:
					case MAXPCF:
					case MSG:
					case NAME:
					case NAT:
					case NATIONAL:
					case NATLANG:
					case NC:
					case NN:
					case NO:
					case NOADATA:
					case NOADV:
					case NOALIAS:
					case NOALPHNUM:
					case NOAWO:
					case NOBIN:
					case NOBLOCK0:
					case NOC:
					case NOCBLCARD:
					case NOCICS:
					case NOCMPR2:
					case NOCOMPILE:
					case NOCOPYLOC:
					case NOCOPYRIGHT:
					case NOCPLC:
					case NOCPSM:
					case NOCPYR:
					case NOCURR:
					case NOCURRENCY:
					case NOD:
					case NODATEPROC:
					case NODBCS:
					case NODE:
					case NODEBUG:
					case NODECK:
					case NODEFINE:
					case NODEF:
					case NODIAGTRUNC:
					case NODLL:
					case NODSNAME:
					case NODU:
					case NODUMP:
					case NODP:
					case NODTR:
					case NODWARF:
					case NODYN:
					case NODYNAM:
					case NOEDF:
					case NOEJPD:
					case NOENDP:
					case NOENDPERIOD:
					case NOEPILOG:
					case NOEVENP:
					case NOEVENPACK:
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
					case NOINITCHECK:
					case NOIC:
					case NOINITIAL:
					case NOINLINE:
					case NOINL:
					case NOLAXPERF:
					case NOLENGTH:
					case NOLIB:
					case NOLINKAGE:
					case NOLIST:
					case NOLXPRF:
					case NOMAP:
					case NOMD:
					case NOMDECK:
					case NONAME:
					case NONUM:
					case NONUMBER:
					case NOOBJ:
					case NOOBJECT:
					case NOOMITODOMIN:
					case NOOFF:
					case NOOFFSET:
					case NOOOM:
					case NOOPSEQUENCE:
					case NOOPT:
					case NOOPTIMIZE:
					case NOOPTIONS:
					case NOP:
					case NOPAC:
					case NOPARMCHECK:
					case NOPFD:
					case NOPRESERVE:
					case NOPROLOG:
					case NORENT:
					case NORULES:
					case NOS:
					case NOSEP:
					case NOSEPARATE:
					case NOSEQ:
					case NOSERV:
					case NOSERVICE:
					case NOSLACKBYTES:
					case NOSLCKB:
					case NOSO:
					case NOSOURCE:
					case NOSPIE:
					case NOSQL:
					case NOSQLC:
					case NOSQLCCSID:
					case NOSQLIMS:
					case NOSSR:
					case NOSSRANGE:
					case NOSTDTRUNC:
					case NOSEQUENCE:
					case NOSTGOPT:
					case NOSUPP:
					case NOSUPPRESS:
					case NOTERM:
					case NOTERMINAL:
					case NOTEST:
					case NOTHREAD:
					case NOTRIG:
					case NOUNRA:
					case NOUNREFALL:
					case NOUNREFSOURCE:
					case NOUNRS:
					case NOVBREF:
					case NOVOLATILE:
					case NOWORD:
					case NOX:
					case NOXREF:
					case NOZC:
					case NOZLEN:
					case NOZON:
					case NOZONECHECK:
					case NOZWB:
					case NS:
					case NSEQ:
					case NSYMBOL:
					case NUM:
					case NUMBER:
					case NUMCHECK:
					case NUMPROC:
					case OBJ:
					case OBJECT:
					case OF:
					case OFF:
					case OFFSET:
					case ON:
					case OMITODOMIN:
					case OOM:
					case OP:
					case OPMARGINS:
					case OPSEQUENCE:
					case OPT:
					case OPTFILE:
					case OPTIMIZE:
					case OPTIONS:
					case OUT:
					case OUTDD:
					case PAC:
					case PARMCHECK:
					case PATH:
					case PFD:
					case PPTDBG:
					case PGMN:
					case PGMNAME:
					case PRESERVE:
					case PROLOG:
					case QUALIFY:
					case QUA:
					case QUOTE:
					case RENT:
					case REPLACING:
					case RMODE:
					case RULES:
					case SEP:
					case SEPARATE:
					case SEQ:
					case SEQUENCE:
					case SERV:
					case SERVICE:
					case SHORT:
					case SIZE:
					case SLACKBYTES:
					case SLCKB:
					case SOURCE:
					case SP:
					case SPACE:
					case SPIE:
					case SQL:
					case SQLC:
					case SQLCCSID:
					case SQLIMS:
					case SO:
					case SS:
					case SSR:
					case SSRANGE:
					case STANDARD:
					case STD:
					case STGOPT:
					case STRICT:
					case SUCC:
					case SUPP:
					case SUPPRESS:
					case SYSEIB:
					case SZ:
					case TERM:
					case TERMINAL:
					case TEST:
					case THREAD:
					case TITLE:
					case TRAILING:
					case TRIG:
					case TRUNC:
					case UE:
					case UNREF:
					case UPPER:
					case VBREF:
					case VLR:
					case VOLATILE:
					case VS:
					case VSAMOPENFS:
					case WD:
					case XMLPARSE:
					case XMLSS:
					case XOPTS:
					case XREF:
					case YEARWINDOW:
					case YW:
					case ZC:
					case ZD:
					case ZLEN:
					case ZON:
					case ZONECHECK:
					case ZONEDATA:
					case ZWB:
					case C_CHAR:
					case D_CHAR:
					case E_CHAR:
					case F_CHAR:
					case H_CHAR:
					case I_CHAR:
					case M_CHAR:
					case N_CHAR:
					case O_CHAR:
					case Q_CHAR:
					case S_CHAR:
					case U_CHAR:
					case W_CHAR:
					case X_CHAR:
					case COMMACHAR:
					case IDENTIFIER:
					case PLUSCHAR:
					case OR:
					case STATIC:
					case TO:
					case TRUE:
					case WHEN:
						{
						setState(1123);
						cobolWord();
						}
						break;
					case NONNUMERICLITERAL:
					case CONTINUED_NONNUMERICLITERAL:
					case NUMERICLITERAL:
						{
						setState(1124);
						literal();
						}
						break;
					case FILENAME:
						{
						setState(1125);
						filename();
						}
						break;
					case PSEUDOTEXTIDENTIFIER:
						{
						setState(1126);
						match(PSEUDOTEXTIDENTIFIER);
						}
						break;
					case TEXT:
						{
						setState(1127);
						match(TEXT);
						}
						break;
					case DOT:
						{
						setState(1128);
						match(DOT);
						}
						break;
					case LPARENCHAR:
						{
						setState(1129);
						match(LPARENCHAR);
						}
						break;
					case RPARENCHAR:
						{
						setState(1130);
						match(RPARENCHAR);
						}
						break;
					case DFHVALUE:
						{
						setState(1131);
						dfhvalue();
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
				setState(1134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1136);
					match(NEWLINE);
					setState(1137);
					match(CLASSIC_CONTINUATION);
					setState(1146); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(1146);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case ABD:
							case ADATA:
							case ADV:
							case AFP:
							case ALIAS:
							case ALPHNUM:
							case ANSI:
							case ANY:
							case APOST:
							case AR:
							case ARCH:
							case ARITH:
							case AUTO:
							case AWO:
							case BASIS:
							case BIN:
							case BLOCK0:
							case BUF:
							case BUFSIZE:
							case BY:
							case CBLCARD:
							case CICS:
							case CO:
							case COBOL2:
							case COBOL3:
							case CODEPAGE:
							case COMPAT:
							case COMPILE:
							case COPYLOC:
							case COPYRIGHT:
							case CP:
							case CPLC:
							case CPP:
							case CPSM:
							case CPYR:
							case CS:
							case CURR:
							case CURRENCY:
							case DATA:
							case DATEPROC:
							case DBCS:
							case DD:
							case DEBUG:
							case DEC:
							case DECK:
							case DEF:
							case DEFINE:
							case DELETE:
							case DIAGTRUNC:
							case DISPSIGN:
							case DIVISION:
							case DLI:
							case DLL:
							case DP:
							case DS:
							case DSN:
							case DSNAME:
							case DTR:
							case DU:
							case DUMP:
							case DWARF:
							case DYN:
							case DYNAM:
							case EDF:
							case EJECT:
							case EJPD:
							case EN:
							case ENDP:
							case ENDPERIOD:
							case ENGLISH:
							case EPILOG:
							case EVENP:
							case EVENPACK:
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
							case HEX:
							case HGPR:
							case HOOK:
							case IC:
							case IN:
							case INITCHECK:
							case INTDATE:
							case INITIAL:
							case INL:
							case INSERT:
							case JA:
							case JP:
							case KA:
							case LANG:
							case LANGUAGE:
							case LAX:
							case LAXPERF:
							case LC:
							case LEADING:
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
							case LP:
							case LU:
							case LXPRF:
							case MAP:
							case MARGINS:
							case MAX:
							case MD:
							case MDECK:
							case MIG:
							case MIXED:
							case MAXPCF:
							case MSG:
							case NAME:
							case NAT:
							case NATIONAL:
							case NATLANG:
							case NC:
							case NN:
							case NO:
							case NOADATA:
							case NOADV:
							case NOALIAS:
							case NOALPHNUM:
							case NOAWO:
							case NOBIN:
							case NOBLOCK0:
							case NOC:
							case NOCBLCARD:
							case NOCICS:
							case NOCMPR2:
							case NOCOMPILE:
							case NOCOPYLOC:
							case NOCOPYRIGHT:
							case NOCPLC:
							case NOCPSM:
							case NOCPYR:
							case NOCURR:
							case NOCURRENCY:
							case NOD:
							case NODATEPROC:
							case NODBCS:
							case NODE:
							case NODEBUG:
							case NODECK:
							case NODEFINE:
							case NODEF:
							case NODIAGTRUNC:
							case NODLL:
							case NODSNAME:
							case NODU:
							case NODUMP:
							case NODP:
							case NODTR:
							case NODWARF:
							case NODYN:
							case NODYNAM:
							case NOEDF:
							case NOEJPD:
							case NOENDP:
							case NOENDPERIOD:
							case NOEPILOG:
							case NOEVENP:
							case NOEVENPACK:
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
							case NOINITCHECK:
							case NOIC:
							case NOINITIAL:
							case NOINLINE:
							case NOINL:
							case NOLAXPERF:
							case NOLENGTH:
							case NOLIB:
							case NOLINKAGE:
							case NOLIST:
							case NOLXPRF:
							case NOMAP:
							case NOMD:
							case NOMDECK:
							case NONAME:
							case NONUM:
							case NONUMBER:
							case NOOBJ:
							case NOOBJECT:
							case NOOMITODOMIN:
							case NOOFF:
							case NOOFFSET:
							case NOOOM:
							case NOOPSEQUENCE:
							case NOOPT:
							case NOOPTIMIZE:
							case NOOPTIONS:
							case NOP:
							case NOPAC:
							case NOPARMCHECK:
							case NOPFD:
							case NOPRESERVE:
							case NOPROLOG:
							case NORENT:
							case NORULES:
							case NOS:
							case NOSEP:
							case NOSEPARATE:
							case NOSEQ:
							case NOSERV:
							case NOSERVICE:
							case NOSLACKBYTES:
							case NOSLCKB:
							case NOSO:
							case NOSOURCE:
							case NOSPIE:
							case NOSQL:
							case NOSQLC:
							case NOSQLCCSID:
							case NOSQLIMS:
							case NOSSR:
							case NOSSRANGE:
							case NOSTDTRUNC:
							case NOSEQUENCE:
							case NOSTGOPT:
							case NOSUPP:
							case NOSUPPRESS:
							case NOTERM:
							case NOTERMINAL:
							case NOTEST:
							case NOTHREAD:
							case NOTRIG:
							case NOUNRA:
							case NOUNREFALL:
							case NOUNREFSOURCE:
							case NOUNRS:
							case NOVBREF:
							case NOVOLATILE:
							case NOWORD:
							case NOX:
							case NOXREF:
							case NOZC:
							case NOZLEN:
							case NOZON:
							case NOZONECHECK:
							case NOZWB:
							case NS:
							case NSEQ:
							case NSYMBOL:
							case NUM:
							case NUMBER:
							case NUMCHECK:
							case NUMPROC:
							case OBJ:
							case OBJECT:
							case OF:
							case OFF:
							case OFFSET:
							case ON:
							case OMITODOMIN:
							case OOM:
							case OP:
							case OPMARGINS:
							case OPSEQUENCE:
							case OPT:
							case OPTFILE:
							case OPTIMIZE:
							case OPTIONS:
							case OUT:
							case OUTDD:
							case PAC:
							case PARMCHECK:
							case PATH:
							case PFD:
							case PPTDBG:
							case PGMN:
							case PGMNAME:
							case PRESERVE:
							case PROLOG:
							case QUALIFY:
							case QUA:
							case QUOTE:
							case RENT:
							case REPLACING:
							case RMODE:
							case RULES:
							case SEP:
							case SEPARATE:
							case SEQ:
							case SEQUENCE:
							case SERV:
							case SERVICE:
							case SHORT:
							case SIZE:
							case SLACKBYTES:
							case SLCKB:
							case SOURCE:
							case SP:
							case SPACE:
							case SPIE:
							case SQL:
							case SQLC:
							case SQLCCSID:
							case SQLIMS:
							case SO:
							case SS:
							case SSR:
							case SSRANGE:
							case STANDARD:
							case STD:
							case STGOPT:
							case STRICT:
							case SUCC:
							case SUPP:
							case SUPPRESS:
							case SYSEIB:
							case SZ:
							case TERM:
							case TERMINAL:
							case TEST:
							case THREAD:
							case TITLE:
							case TRAILING:
							case TRIG:
							case TRUNC:
							case UE:
							case UNREF:
							case UPPER:
							case VBREF:
							case VLR:
							case VOLATILE:
							case VS:
							case VSAMOPENFS:
							case WD:
							case XMLPARSE:
							case XMLSS:
							case XOPTS:
							case XREF:
							case YEARWINDOW:
							case YW:
							case ZC:
							case ZD:
							case ZLEN:
							case ZON:
							case ZONECHECK:
							case ZONEDATA:
							case ZWB:
							case C_CHAR:
							case D_CHAR:
							case E_CHAR:
							case F_CHAR:
							case H_CHAR:
							case I_CHAR:
							case M_CHAR:
							case N_CHAR:
							case O_CHAR:
							case Q_CHAR:
							case S_CHAR:
							case U_CHAR:
							case W_CHAR:
							case X_CHAR:
							case COMMACHAR:
							case IDENTIFIER:
							case PLUSCHAR:
							case OR:
							case STATIC:
							case TO:
							case TRUE:
							case WHEN:
								{
								setState(1138);
								cobolWord();
								}
								break;
							case NONNUMERICLITERAL:
							case CONTINUED_NONNUMERICLITERAL:
							case NUMERICLITERAL:
								{
								setState(1139);
								literal();
								}
								break;
							case FILENAME:
								{
								setState(1140);
								filename();
								}
								break;
							case PSEUDOTEXTIDENTIFIER:
								{
								setState(1141);
								match(PSEUDOTEXTIDENTIFIER);
								}
								break;
							case TEXT:
								{
								setState(1142);
								match(TEXT);
								}
								break;
							case DOT:
								{
								setState(1143);
								match(DOT);
								}
								break;
							case LPARENCHAR:
								{
								setState(1144);
								match(LPARENCHAR);
								}
								break;
							case RPARENCHAR:
								{
								setState(1145);
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
						setState(1148); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCobolWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCobolWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCobolWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CobolWordContext cobolWord() throws RecognitionException {
		CobolWordContext _localctx = new CobolWordContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cobolWord);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				match(IDENTIFIER);
				}
				break;
			case ABD:
			case ADATA:
			case ADV:
			case AFP:
			case ALIAS:
			case ALPHNUM:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARCH:
			case ARITH:
			case AUTO:
			case AWO:
			case BASIS:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBLCARD:
			case CICS:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case COPYLOC:
			case COPYRIGHT:
			case CP:
			case CPLC:
			case CPP:
			case CPSM:
			case CPYR:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DEC:
			case DECK:
			case DEF:
			case DEFINE:
			case DELETE:
			case DIAGTRUNC:
			case DISPSIGN:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DS:
			case DSN:
			case DSNAME:
			case DTR:
			case DU:
			case DUMP:
			case DWARF:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENDP:
			case ENDPERIOD:
			case ENGLISH:
			case EPILOG:
			case EVENP:
			case EVENPACK:
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
			case HEX:
			case HGPR:
			case HOOK:
			case IC:
			case IN:
			case INITCHECK:
			case INTDATE:
			case INITIAL:
			case INL:
			case INSERT:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LAX:
			case LAXPERF:
			case LC:
			case LEADING:
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
			case LP:
			case LU:
			case LXPRF:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case MAXPCF:
			case MSG:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NC:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOALPHNUM:
			case NOAWO:
			case NOBIN:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCOPYLOC:
			case NOCOPYRIGHT:
			case NOCPLC:
			case NOCPSM:
			case NOCPYR:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODEFINE:
			case NODEF:
			case NODIAGTRUNC:
			case NODLL:
			case NODSNAME:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODWARF:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOENDP:
			case NOENDPERIOD:
			case NOEPILOG:
			case NOEVENP:
			case NOEVENPACK:
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
			case NOINITCHECK:
			case NOIC:
			case NOINITIAL:
			case NOINLINE:
			case NOINL:
			case NOLAXPERF:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOLXPRF:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOMITODOMIN:
			case NOOFF:
			case NOOFFSET:
			case NOOOM:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPAC:
			case NOPARMCHECK:
			case NOPFD:
			case NOPRESERVE:
			case NOPROLOG:
			case NORENT:
			case NORULES:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSERV:
			case NOSERVICE:
			case NOSLACKBYTES:
			case NOSLCKB:
			case NOSO:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSQLIMS:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOSTGOPT:
			case NOSUPP:
			case NOSUPPRESS:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOUNRA:
			case NOUNREFALL:
			case NOUNREFSOURCE:
			case NOUNRS:
			case NOVBREF:
			case NOVOLATILE:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZC:
			case NOZLEN:
			case NOZON:
			case NOZONECHECK:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMCHECK:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OMITODOMIN:
			case OOM:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PAC:
			case PARMCHECK:
			case PATH:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PRESERVE:
			case PROLOG:
			case QUALIFY:
			case QUA:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case RULES:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SERV:
			case SERVICE:
			case SHORT:
			case SIZE:
			case SLACKBYTES:
			case SLCKB:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SQLIMS:
			case SO:
			case SS:
			case SSR:
			case SSRANGE:
			case STANDARD:
			case STD:
			case STGOPT:
			case STRICT:
			case SUCC:
			case SUPP:
			case SUPPRESS:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRAILING:
			case TRIG:
			case TRUNC:
			case UE:
			case UNREF:
			case UPPER:
			case VBREF:
			case VLR:
			case VOLATILE:
			case VS:
			case VSAMOPENFS:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZC:
			case ZD:
			case ZLEN:
			case ZON:
			case ZONECHECK:
			case ZONEDATA:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case O_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case PLUSCHAR:
			case OR:
			case STATIC:
			case TO:
			case TRUE:
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
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
		public TerminalNode CONTINUED_NONNUMERICLITERAL() { return getToken(CobolPreprocessorParser.CONTINUED_NONNUMERICLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_la = _input.LA(1);
			if ( !(((((_la - 434)) & ~0x3f) == 0 && ((1L << (_la - 434)) & ((1L << (NONNUMERICLITERAL - 434)) | (1L << (CONTINUED_NONNUMERICLITERAL - 434)) | (1L << (NUMERICLITERAL - 434)))) != 0)) ) {
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
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
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

	public static class DfhvalueContext extends ParserRuleContext {
		public TerminalNode DFHVALUE() { return getToken(CobolPreprocessorParser.DFHVALUE, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public TerminalNode COPY() { return getToken(CobolPreprocessorParser.COPY, 0); }
		public TerminalNode PROCESS() { return getToken(CobolPreprocessorParser.PROCESS, 0); }
		public DfhvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfhvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterDfhvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitDfhvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitDfhvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfhvalueContext dfhvalue() throws RecognitionException {
		DfhvalueContext _localctx = new DfhvalueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dfhvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1163);
			match(DFHVALUE);
			setState(1164);
			match(LPARENCHAR);
			setState(1168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABD:
			case ADATA:
			case ADV:
			case AFP:
			case ALIAS:
			case ALPHNUM:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARCH:
			case ARITH:
			case AUTO:
			case AWO:
			case BASIS:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBLCARD:
			case CICS:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case COPYLOC:
			case COPYRIGHT:
			case CP:
			case CPLC:
			case CPP:
			case CPSM:
			case CPYR:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DEC:
			case DECK:
			case DEF:
			case DEFINE:
			case DELETE:
			case DIAGTRUNC:
			case DISPSIGN:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DS:
			case DSN:
			case DSNAME:
			case DTR:
			case DU:
			case DUMP:
			case DWARF:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENDP:
			case ENDPERIOD:
			case ENGLISH:
			case EPILOG:
			case EVENP:
			case EVENPACK:
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
			case HEX:
			case HGPR:
			case HOOK:
			case IC:
			case IN:
			case INITCHECK:
			case INTDATE:
			case INITIAL:
			case INL:
			case INSERT:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LAX:
			case LAXPERF:
			case LC:
			case LEADING:
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
			case LP:
			case LU:
			case LXPRF:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case MAXPCF:
			case MSG:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NC:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOALPHNUM:
			case NOAWO:
			case NOBIN:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCOPYLOC:
			case NOCOPYRIGHT:
			case NOCPLC:
			case NOCPSM:
			case NOCPYR:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODEFINE:
			case NODEF:
			case NODIAGTRUNC:
			case NODLL:
			case NODSNAME:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODWARF:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOENDP:
			case NOENDPERIOD:
			case NOEPILOG:
			case NOEVENP:
			case NOEVENPACK:
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
			case NOINITCHECK:
			case NOIC:
			case NOINITIAL:
			case NOINLINE:
			case NOINL:
			case NOLAXPERF:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOLXPRF:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOMITODOMIN:
			case NOOFF:
			case NOOFFSET:
			case NOOOM:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPAC:
			case NOPARMCHECK:
			case NOPFD:
			case NOPRESERVE:
			case NOPROLOG:
			case NORENT:
			case NORULES:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSERV:
			case NOSERVICE:
			case NOSLACKBYTES:
			case NOSLCKB:
			case NOSO:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSQLIMS:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOSTGOPT:
			case NOSUPP:
			case NOSUPPRESS:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOUNRA:
			case NOUNREFALL:
			case NOUNREFSOURCE:
			case NOUNRS:
			case NOVBREF:
			case NOVOLATILE:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZC:
			case NOZLEN:
			case NOZON:
			case NOZONECHECK:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMCHECK:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OMITODOMIN:
			case OOM:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PAC:
			case PARMCHECK:
			case PATH:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PRESERVE:
			case PROLOG:
			case QUALIFY:
			case QUA:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case RULES:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SERV:
			case SERVICE:
			case SHORT:
			case SIZE:
			case SLACKBYTES:
			case SLCKB:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SQLIMS:
			case SO:
			case SS:
			case SSR:
			case SSRANGE:
			case STANDARD:
			case STD:
			case STGOPT:
			case STRICT:
			case SUCC:
			case SUPP:
			case SUPPRESS:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRAILING:
			case TRIG:
			case TRUNC:
			case UE:
			case UNREF:
			case UPPER:
			case VBREF:
			case VLR:
			case VOLATILE:
			case VS:
			case VSAMOPENFS:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZC:
			case ZD:
			case ZLEN:
			case ZON:
			case ZONECHECK:
			case ZONEDATA:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case O_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
			case PLUSCHAR:
			case OR:
			case STATIC:
			case TO:
			case TRUE:
			case WHEN:
				{
				setState(1165);
				cobolWord();
				}
				break;
			case COPY:
				{
				setState(1166);
				match(COPY);
				}
				break;
			case PROCESS:
				{
				setState(1167);
				match(PROCESS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1170);
			match(RPARENCHAR);
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

	public static class CompilerDirectiveStatementContext extends ParserRuleContext {
		public CompilerDirectiveContext compilerDirective() {
			return getRuleContext(CompilerDirectiveContext.class,0);
		}
		public ConditionalCompilationStatementContext conditionalCompilationStatement() {
			return getRuleContext(ConditionalCompilationStatementContext.class,0);
		}
		public CompilerDirectiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveStatementContext compilerDirectiveStatement() throws RecognitionException {
		CompilerDirectiveStatementContext _localctx = new CompilerDirectiveStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_compilerDirectiveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1172);
				compilerDirective();
				}
				break;
			case 2:
				{
				setState(1173);
				conditionalCompilationStatement();
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

	public static class CompilerDirectiveContext extends ParserRuleContext {
		public CompilerDirectiveCallInterfaceContext compilerDirectiveCallInterface() {
			return getRuleContext(CompilerDirectiveCallInterfaceContext.class,0);
		}
		public CompilerDirectiveInlineContext compilerDirectiveInline() {
			return getRuleContext(CompilerDirectiveInlineContext.class,0);
		}
		public CompilerDirectiveBasisContext compilerDirectiveBasis() {
			return getRuleContext(CompilerDirectiveBasisContext.class,0);
		}
		public CompilerDirectiveInsertContext compilerDirectiveInsert() {
			return getRuleContext(CompilerDirectiveInsertContext.class,0);
		}
		public CompilerDirectiveDeleteContext compilerDirectiveDelete() {
			return getRuleContext(CompilerDirectiveDeleteContext.class,0);
		}
		public CompilerDirectiveDataContext compilerDirectiveData() {
			return getRuleContext(CompilerDirectiveDataContext.class,0);
		}
		public CompilerDirectiveCallConventionContext compilerDirectiveCallConvention() {
			return getRuleContext(CompilerDirectiveCallConventionContext.class,0);
		}
		public CompilerDirectiveCobolWordsContext compilerDirectiveCobolWords() {
			return getRuleContext(CompilerDirectiveCobolWordsContext.class,0);
		}
		public CompilerDirectiveDisplayContext compilerDirectiveDisplay() {
			return getRuleContext(CompilerDirectiveDisplayContext.class,0);
		}
		public CompilerDirectiveFlag02Context compilerDirectiveFlag02() {
			return getRuleContext(CompilerDirectiveFlag02Context.class,0);
		}
		public CompilerDirectiveFlag14Context compilerDirectiveFlag14() {
			return getRuleContext(CompilerDirectiveFlag14Context.class,0);
		}
		public CompilerDirectiveLeapSecondContext compilerDirectiveLeapSecond() {
			return getRuleContext(CompilerDirectiveLeapSecondContext.class,0);
		}
		public CompilerDirectiveListingContext compilerDirectiveListing() {
			return getRuleContext(CompilerDirectiveListingContext.class,0);
		}
		public CompilerDirectivePageContext compilerDirectivePage() {
			return getRuleContext(CompilerDirectivePageContext.class,0);
		}
		public CompilerDirectivePopContext compilerDirectivePop() {
			return getRuleContext(CompilerDirectivePopContext.class,0);
		}
		public CompilerDirectivePropogateContext compilerDirectivePropogate() {
			return getRuleContext(CompilerDirectivePropogateContext.class,0);
		}
		public CompilerDirectivePushContext compilerDirectivePush() {
			return getRuleContext(CompilerDirectivePushContext.class,0);
		}
		public CompilerDirectiveRefModZeroLengthContext compilerDirectiveRefModZeroLength() {
			return getRuleContext(CompilerDirectiveRefModZeroLengthContext.class,0);
		}
		public CompilerDirectiveSourceContext compilerDirectiveSource() {
			return getRuleContext(CompilerDirectiveSourceContext.class,0);
		}
		public CompilerDirectiveTurnContext compilerDirectiveTurn() {
			return getRuleContext(CompilerDirectiveTurnContext.class,0);
		}
		public CompilerDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveContext compilerDirective() throws RecognitionException {
		CompilerDirectiveContext _localctx = new CompilerDirectiveContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_compilerDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1176);
				compilerDirectiveCallInterface();
				}
				break;
			case 2:
				{
				setState(1177);
				compilerDirectiveInline();
				}
				break;
			case 3:
				{
				setState(1178);
				compilerDirectiveBasis();
				}
				break;
			case 4:
				{
				setState(1179);
				compilerDirectiveInsert();
				}
				break;
			case 5:
				{
				setState(1180);
				compilerDirectiveDelete();
				}
				break;
			case 6:
				{
				setState(1181);
				compilerDirectiveData();
				}
				break;
			case 7:
				{
				setState(1182);
				compilerDirectiveCallConvention();
				}
				break;
			case 8:
				{
				setState(1183);
				compilerDirectiveCobolWords();
				}
				break;
			case 9:
				{
				setState(1184);
				compilerDirectiveDisplay();
				}
				break;
			case 10:
				{
				setState(1185);
				compilerDirectiveFlag02();
				}
				break;
			case 11:
				{
				setState(1186);
				compilerDirectiveFlag14();
				}
				break;
			case 12:
				{
				setState(1187);
				compilerDirectiveLeapSecond();
				}
				break;
			case 13:
				{
				setState(1188);
				compilerDirectiveListing();
				}
				break;
			case 14:
				{
				setState(1189);
				compilerDirectivePage();
				}
				break;
			case 15:
				{
				setState(1190);
				compilerDirectivePop();
				}
				break;
			case 16:
				{
				setState(1191);
				compilerDirectivePropogate();
				}
				break;
			case 17:
				{
				setState(1192);
				compilerDirectivePush();
				}
				break;
			case 18:
				{
				setState(1193);
				compilerDirectiveRefModZeroLength();
				}
				break;
			case 19:
				{
				setState(1194);
				compilerDirectiveSource();
				}
				break;
			case 20:
				{
				setState(1195);
				compilerDirectiveTurn();
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

	public static class ConditionalCompilationStatementContext extends ParserRuleContext {
		public ConditionalCompilationDefineContext conditionalCompilationDefine() {
			return getRuleContext(ConditionalCompilationDefineContext.class,0);
		}
		public ConditionalCompilationIfContext conditionalCompilationIf() {
			return getRuleContext(ConditionalCompilationIfContext.class,0);
		}
		public ConditionalCompilationElseContext conditionalCompilationElse() {
			return getRuleContext(ConditionalCompilationElseContext.class,0);
		}
		public ConditionalCompilationEndIfContext conditionalCompilationEndIf() {
			return getRuleContext(ConditionalCompilationEndIfContext.class,0);
		}
		public ConditionalCompilationEvaluateContext conditionalCompilationEvaluate() {
			return getRuleContext(ConditionalCompilationEvaluateContext.class,0);
		}
		public ConditionalCompilationWhenContext conditionalCompilationWhen() {
			return getRuleContext(ConditionalCompilationWhenContext.class,0);
		}
		public ConditionalCompilationEndEvaluateContext conditionalCompilationEndEvaluate() {
			return getRuleContext(ConditionalCompilationEndEvaluateContext.class,0);
		}
		public ConditionalCompilationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationStatementContext conditionalCompilationStatement() throws RecognitionException {
		ConditionalCompilationStatementContext _localctx = new ConditionalCompilationStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditionalCompilationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1198);
				conditionalCompilationDefine();
				}
				break;
			case 2:
				{
				setState(1199);
				conditionalCompilationIf();
				}
				break;
			case 3:
				{
				setState(1200);
				conditionalCompilationElse();
				}
				break;
			case 4:
				{
				setState(1201);
				conditionalCompilationEndIf();
				}
				break;
			case 5:
				{
				setState(1202);
				conditionalCompilationEvaluate();
				}
				break;
			case 6:
				{
				setState(1203);
				conditionalCompilationWhen();
				}
				break;
			case 7:
				{
				setState(1204);
				conditionalCompilationEndEvaluate();
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

	public static class CompilerDirectiveCallInterfaceContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode CALLINTERFACE() { return getToken(CobolPreprocessorParser.CALLINTERFACE, 0); }
		public TerminalNode CALLINT() { return getToken(CobolPreprocessorParser.CALLINT, 0); }
		public TerminalNode STATIC() { return getToken(CobolPreprocessorParser.STATIC, 0); }
		public TerminalNode DYNAMIC() { return getToken(CobolPreprocessorParser.DYNAMIC, 0); }
		public TerminalNode DLL_INTERFACE() { return getToken(CobolPreprocessorParser.DLL_INTERFACE, 0); }
		public CompilerDirectiveCallInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveCallInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveCallInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveCallInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveCallInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveCallInterfaceContext compilerDirectiveCallInterface() throws RecognitionException {
		CompilerDirectiveCallInterfaceContext _localctx = new CompilerDirectiveCallInterfaceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_compilerDirectiveCallInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1207);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1208);
			_la = _input.LA(1);
			if ( !(_la==CALLINT || _la==CALLINTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1209);
				_la = _input.LA(1);
				if ( !(((((_la - 473)) & ~0x3f) == 0 && ((1L << (_la - 473)) & ((1L << (DLL_INTERFACE - 473)) | (1L << (DYNAMIC - 473)) | (1L << (STATIC - 473)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
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

	public static class CompilerDirectiveInlineContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode INLINE() { return getToken(CobolPreprocessorParser.INLINE, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectiveInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveInline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveInline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveInline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveInlineContext compilerDirectiveInline() throws RecognitionException {
		CompilerDirectiveInlineContext _localctx = new CompilerDirectiveInlineContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_compilerDirectiveInline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1212);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1213);
			match(INLINE);
			setState(1214);
			_la = _input.LA(1);
			if ( !(_la==COMP_DIR_OFF || _la==COMP_DIR_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectiveBasisContext extends ParserRuleContext {
		public TerminalNode BASIS() { return getToken(CobolPreprocessorParser.BASIS, 0); }
		public BasisNameContext basisName() {
			return getRuleContext(BasisNameContext.class,0);
		}
		public CompilerDirectiveBasisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveBasis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveBasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveBasis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveBasis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveBasisContext compilerDirectiveBasis() throws RecognitionException {
		CompilerDirectiveBasisContext _localctx = new CompilerDirectiveBasisContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compilerDirectiveBasis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1216);
			match(BASIS);
			setState(1217);
			basisName();
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

	public static class BasisNameContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public BasisNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basisName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterBasisName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitBasisName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitBasisName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasisNameContext basisName() throws RecognitionException {
		BasisNameContext _localctx = new BasisNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_basisName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1219);
				literal();
				}
				break;
			case ABD:
			case ADATA:
			case ADV:
			case AFP:
			case ALIAS:
			case ALPHNUM:
			case ANSI:
			case ANY:
			case APOST:
			case AR:
			case ARCH:
			case ARITH:
			case AUTO:
			case AWO:
			case BASIS:
			case BIN:
			case BLOCK0:
			case BUF:
			case BUFSIZE:
			case BY:
			case CBLCARD:
			case CICS:
			case CO:
			case COBOL2:
			case COBOL3:
			case CODEPAGE:
			case COMPAT:
			case COMPILE:
			case COPYLOC:
			case COPYRIGHT:
			case CP:
			case CPLC:
			case CPP:
			case CPSM:
			case CPYR:
			case CS:
			case CURR:
			case CURRENCY:
			case DATA:
			case DATEPROC:
			case DBCS:
			case DD:
			case DEBUG:
			case DEC:
			case DECK:
			case DEF:
			case DEFINE:
			case DELETE:
			case DIAGTRUNC:
			case DISPSIGN:
			case DIVISION:
			case DLI:
			case DLL:
			case DP:
			case DS:
			case DSN:
			case DSNAME:
			case DTR:
			case DU:
			case DUMP:
			case DWARF:
			case DYN:
			case DYNAM:
			case EDF:
			case EJECT:
			case EJPD:
			case EN:
			case ENDP:
			case ENDPERIOD:
			case ENGLISH:
			case EPILOG:
			case EVENP:
			case EVENPACK:
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
			case HEX:
			case HGPR:
			case HOOK:
			case IC:
			case IN:
			case INITCHECK:
			case INTDATE:
			case INITIAL:
			case INL:
			case INSERT:
			case JA:
			case JP:
			case KA:
			case LANG:
			case LANGUAGE:
			case LAX:
			case LAXPERF:
			case LC:
			case LEADING:
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
			case LP:
			case LU:
			case LXPRF:
			case MAP:
			case MARGINS:
			case MAX:
			case MD:
			case MDECK:
			case MIG:
			case MIXED:
			case MAXPCF:
			case MSG:
			case NAME:
			case NAT:
			case NATIONAL:
			case NATLANG:
			case NC:
			case NN:
			case NO:
			case NOADATA:
			case NOADV:
			case NOALIAS:
			case NOALPHNUM:
			case NOAWO:
			case NOBIN:
			case NOBLOCK0:
			case NOC:
			case NOCBLCARD:
			case NOCICS:
			case NOCMPR2:
			case NOCOMPILE:
			case NOCOPYLOC:
			case NOCOPYRIGHT:
			case NOCPLC:
			case NOCPSM:
			case NOCPYR:
			case NOCURR:
			case NOCURRENCY:
			case NOD:
			case NODATEPROC:
			case NODBCS:
			case NODE:
			case NODEBUG:
			case NODECK:
			case NODEFINE:
			case NODEF:
			case NODIAGTRUNC:
			case NODLL:
			case NODSNAME:
			case NODU:
			case NODUMP:
			case NODP:
			case NODTR:
			case NODWARF:
			case NODYN:
			case NODYNAM:
			case NOEDF:
			case NOEJPD:
			case NOENDP:
			case NOENDPERIOD:
			case NOEPILOG:
			case NOEVENP:
			case NOEVENPACK:
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
			case NOINITCHECK:
			case NOIC:
			case NOINITIAL:
			case NOINLINE:
			case NOINL:
			case NOLAXPERF:
			case NOLENGTH:
			case NOLIB:
			case NOLINKAGE:
			case NOLIST:
			case NOLXPRF:
			case NOMAP:
			case NOMD:
			case NOMDECK:
			case NONAME:
			case NONUM:
			case NONUMBER:
			case NOOBJ:
			case NOOBJECT:
			case NOOMITODOMIN:
			case NOOFF:
			case NOOFFSET:
			case NOOOM:
			case NOOPSEQUENCE:
			case NOOPT:
			case NOOPTIMIZE:
			case NOOPTIONS:
			case NOP:
			case NOPAC:
			case NOPARMCHECK:
			case NOPFD:
			case NOPRESERVE:
			case NOPROLOG:
			case NORENT:
			case NORULES:
			case NOS:
			case NOSEP:
			case NOSEPARATE:
			case NOSEQ:
			case NOSERV:
			case NOSERVICE:
			case NOSLACKBYTES:
			case NOSLCKB:
			case NOSO:
			case NOSOURCE:
			case NOSPIE:
			case NOSQL:
			case NOSQLC:
			case NOSQLCCSID:
			case NOSQLIMS:
			case NOSSR:
			case NOSSRANGE:
			case NOSTDTRUNC:
			case NOSEQUENCE:
			case NOSTGOPT:
			case NOSUPP:
			case NOSUPPRESS:
			case NOTERM:
			case NOTERMINAL:
			case NOTEST:
			case NOTHREAD:
			case NOTRIG:
			case NOUNRA:
			case NOUNREFALL:
			case NOUNREFSOURCE:
			case NOUNRS:
			case NOVBREF:
			case NOVOLATILE:
			case NOWORD:
			case NOX:
			case NOXREF:
			case NOZC:
			case NOZLEN:
			case NOZON:
			case NOZONECHECK:
			case NOZWB:
			case NS:
			case NSEQ:
			case NSYMBOL:
			case NUM:
			case NUMBER:
			case NUMCHECK:
			case NUMPROC:
			case OBJ:
			case OBJECT:
			case OF:
			case OFF:
			case OFFSET:
			case ON:
			case OMITODOMIN:
			case OOM:
			case OP:
			case OPMARGINS:
			case OPSEQUENCE:
			case OPT:
			case OPTFILE:
			case OPTIMIZE:
			case OPTIONS:
			case OUT:
			case OUTDD:
			case PAC:
			case PARMCHECK:
			case PATH:
			case PFD:
			case PPTDBG:
			case PGMN:
			case PGMNAME:
			case PRESERVE:
			case PROLOG:
			case QUALIFY:
			case QUA:
			case QUOTE:
			case RENT:
			case REPLACING:
			case RMODE:
			case RULES:
			case SEP:
			case SEPARATE:
			case SEQ:
			case SEQUENCE:
			case SERV:
			case SERVICE:
			case SHORT:
			case SIZE:
			case SLACKBYTES:
			case SLCKB:
			case SOURCE:
			case SP:
			case SPACE:
			case SPIE:
			case SQL:
			case SQLC:
			case SQLCCSID:
			case SQLIMS:
			case SO:
			case SS:
			case SSR:
			case SSRANGE:
			case STANDARD:
			case STD:
			case STGOPT:
			case STRICT:
			case SUCC:
			case SUPP:
			case SUPPRESS:
			case SYSEIB:
			case SZ:
			case TERM:
			case TERMINAL:
			case TEST:
			case THREAD:
			case TITLE:
			case TRAILING:
			case TRIG:
			case TRUNC:
			case UE:
			case UNREF:
			case UPPER:
			case VBREF:
			case VLR:
			case VOLATILE:
			case VS:
			case VSAMOPENFS:
			case WD:
			case XMLPARSE:
			case XMLSS:
			case XOPTS:
			case XREF:
			case YEARWINDOW:
			case YW:
			case ZC:
			case ZD:
			case ZLEN:
			case ZON:
			case ZONECHECK:
			case ZONEDATA:
			case ZWB:
			case C_CHAR:
			case D_CHAR:
			case E_CHAR:
			case F_CHAR:
			case H_CHAR:
			case I_CHAR:
			case M_CHAR:
			case N_CHAR:
			case O_CHAR:
			case Q_CHAR:
			case S_CHAR:
			case U_CHAR:
			case W_CHAR:
			case X_CHAR:
			case COMMACHAR:
			case IDENTIFIER:
			case PLUSCHAR:
			case OR:
			case STATIC:
			case TO:
			case TRUE:
			case WHEN:
				{
				setState(1220);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(1221);
				filename();
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

	public static class CompilerDirectiveInsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(CobolPreprocessorParser.INSERT, 0); }
		public TerminalNode NUMERICLITERAL() { return getToken(CobolPreprocessorParser.NUMERICLITERAL, 0); }
		public CompilerDirectiveInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveInsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveInsertContext compilerDirectiveInsert() throws RecognitionException {
		CompilerDirectiveInsertContext _localctx = new CompilerDirectiveInsertContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_compilerDirectiveInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1224);
			match(INSERT);
			setState(1225);
			match(NUMERICLITERAL);
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

	public static class CompilerDirectiveDeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CobolPreprocessorParser.DELETE, 0); }
		public CompilerDirectiveDeleteSequenceNumberContext compilerDirectiveDeleteSequenceNumber() {
			return getRuleContext(CompilerDirectiveDeleteSequenceNumberContext.class,0);
		}
		public CompilerDirectiveDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveDelete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveDeleteContext compilerDirectiveDelete() throws RecognitionException {
		CompilerDirectiveDeleteContext _localctx = new CompilerDirectiveDeleteContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compilerDirectiveDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1227);
			match(DELETE);
			setState(1228);
			compilerDirectiveDeleteSequenceNumber();
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

	public static class CompilerDirectiveDataContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode COMP_DIR_DATA() { return getToken(CobolPreprocessorParser.COMP_DIR_DATA, 0); }
		public TerminalNode NUMERICLITERAL() { return getToken(CobolPreprocessorParser.NUMERICLITERAL, 0); }
		public CompilerDirectiveDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveDataContext compilerDirectiveData() throws RecognitionException {
		CompilerDirectiveDataContext _localctx = new CompilerDirectiveDataContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_compilerDirectiveData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1230);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1231);
			match(COMP_DIR_DATA);
			setState(1232);
			match(NUMERICLITERAL);
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

	public static class CompilerDirectiveCallConventionContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode CALL_CONVENTION() { return getToken(CobolPreprocessorParser.CALL_CONVENTION, 0); }
		public TerminalNode COBOL() { return getToken(CobolPreprocessorParser.COBOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public CompilerDirectiveCallConventionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveCallConvention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveCallConvention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveCallConvention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveCallConvention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveCallConventionContext compilerDirectiveCallConvention() throws RecognitionException {
		CompilerDirectiveCallConventionContext _localctx = new CompilerDirectiveCallConventionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compilerDirectiveCallConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1234);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1235);
			match(CALL_CONVENTION);
			setState(1236);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==COBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectiveCobolWordsContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode COBOL_WORDS() { return getToken(CobolPreprocessorParser.COBOL_WORDS, 0); }
		public CompilerDirectiveCobolWordsEquateContext compilerDirectiveCobolWordsEquate() {
			return getRuleContext(CompilerDirectiveCobolWordsEquateContext.class,0);
		}
		public CompilerDirectiveCobolWordsUndefineContext compilerDirectiveCobolWordsUndefine() {
			return getRuleContext(CompilerDirectiveCobolWordsUndefineContext.class,0);
		}
		public CompilerDirectiveCobolWordsSubstituteContext compilerDirectiveCobolWordsSubstitute() {
			return getRuleContext(CompilerDirectiveCobolWordsSubstituteContext.class,0);
		}
		public CompilerDirectiveCobolWordsReserveContext compilerDirectiveCobolWordsReserve() {
			return getRuleContext(CompilerDirectiveCobolWordsReserveContext.class,0);
		}
		public CompilerDirectiveCobolWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveCobolWords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveCobolWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveCobolWords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveCobolWords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveCobolWordsContext compilerDirectiveCobolWords() throws RecognitionException {
		CompilerDirectiveCobolWordsContext _localctx = new CompilerDirectiveCobolWordsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_compilerDirectiveCobolWords);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1238);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1239);
			match(COBOL_WORDS);
			setState(1244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUATE:
				{
				setState(1240);
				compilerDirectiveCobolWordsEquate();
				}
				break;
			case UNDEFINE:
				{
				setState(1241);
				compilerDirectiveCobolWordsUndefine();
				}
				break;
			case SUBSTITUTE:
				{
				setState(1242);
				compilerDirectiveCobolWordsSubstitute();
				}
				break;
			case RESERVE:
				{
				setState(1243);
				compilerDirectiveCobolWordsReserve();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class CompilerDirectiveDisplayContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode DISPLAY() { return getToken(CobolPreprocessorParser.DISPLAY, 0); }
		public ConditionalCompilationArithmeticExpressionContext conditionalCompilationArithmeticExpression() {
			return getRuleContext(ConditionalCompilationArithmeticExpressionContext.class,0);
		}
		public ConditionalCompilationRelationalConditionContext conditionalCompilationRelationalCondition() {
			return getRuleContext(ConditionalCompilationRelationalConditionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode PARAMETER() { return getToken(CobolPreprocessorParser.PARAMETER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public CompilerDirectiveDisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveDisplay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveDisplayContext compilerDirectiveDisplay() throws RecognitionException {
		CompilerDirectiveDisplayContext _localctx = new CompilerDirectiveDisplayContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_compilerDirectiveDisplay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1246);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1247);
			match(DISPLAY);
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1248);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1249);
				conditionalCompilationRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1250);
				literal();
				}
				break;
			case 4:
				{
				{
				setState(1251);
				match(PARAMETER);
				setState(1252);
				match(IDENTIFIER);
				}
				}
				break;
			}
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

	public static class CompilerDirectiveFlag02Context extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode FLAG_02() { return getToken(CobolPreprocessorParser.FLAG_02, 0); }
		public TerminalNode ALL() { return getToken(CobolPreprocessorParser.ALL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectiveFlag02Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveFlag02; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveFlag02(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveFlag02(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveFlag02(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveFlag02Context compilerDirectiveFlag02() throws RecognitionException {
		CompilerDirectiveFlag02Context _localctx = new CompilerDirectiveFlag02Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_compilerDirectiveFlag02);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1255);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1256);
			match(FLAG_02);
			setState(1257);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1258);
			_la = _input.LA(1);
			if ( !(_la==COMP_DIR_OFF || _la==COMP_DIR_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectiveFlag14Context extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode FLAG_14() { return getToken(CobolPreprocessorParser.FLAG_14, 0); }
		public TerminalNode ALL() { return getToken(CobolPreprocessorParser.ALL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode REF_MOD_ZERO_LENGTH() { return getToken(CobolPreprocessorParser.REF_MOD_ZERO_LENGTH, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectiveFlag14Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveFlag14; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveFlag14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveFlag14(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveFlag14(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveFlag14Context compilerDirectiveFlag14() throws RecognitionException {
		CompilerDirectiveFlag14Context _localctx = new CompilerDirectiveFlag14Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_compilerDirectiveFlag14);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1260);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1261);
			match(FLAG_14);
			setState(1262);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==ALL || _la==REF_MOD_ZERO_LENGTH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1263);
			_la = _input.LA(1);
			if ( !(_la==COMP_DIR_OFF || _la==COMP_DIR_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectiveLeapSecondContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode LEAP_SECOND() { return getToken(CobolPreprocessorParser.LEAP_SECOND, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectiveLeapSecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveLeapSecond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveLeapSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveLeapSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveLeapSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveLeapSecondContext compilerDirectiveLeapSecond() throws RecognitionException {
		CompilerDirectiveLeapSecondContext _localctx = new CompilerDirectiveLeapSecondContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_compilerDirectiveLeapSecond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1265);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1266);
			match(LEAP_SECOND);
			setState(1267);
			_la = _input.LA(1);
			if ( !(_la==COMP_DIR_OFF || _la==COMP_DIR_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectiveListingContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode LISTING() { return getToken(CobolPreprocessorParser.LISTING, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectiveListingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveListing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveListing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveListing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveListing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveListingContext compilerDirectiveListing() throws RecognitionException {
		CompilerDirectiveListingContext _localctx = new CompilerDirectiveListingContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_compilerDirectiveListing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1269);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1270);
			match(LISTING);
			setState(1271);
			_la = _input.LA(1);
			if ( !(_la==COMP_DIR_OFF || _la==COMP_DIR_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectivePageContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode PAGE() { return getToken(CobolPreprocessorParser.PAGE, 0); }
		public TerminalNode NEWLINE() { return getToken(CobolPreprocessorParser.NEWLINE, 0); }
		public List<TerminalNode> PAGE_COMMENT_TEXT() { return getTokens(CobolPreprocessorParser.PAGE_COMMENT_TEXT); }
		public TerminalNode PAGE_COMMENT_TEXT(int i) {
			return getToken(CobolPreprocessorParser.PAGE_COMMENT_TEXT, i);
		}
		public CompilerDirectivePageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectivePage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectivePage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectivePage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectivePage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectivePageContext compilerDirectivePage() throws RecognitionException {
		CompilerDirectivePageContext _localctx = new CompilerDirectivePageContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_compilerDirectivePage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1273);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1274);
			match(PAGE);
			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAGE_COMMENT_TEXT) {
				{
				{
				setState(1275);
				match(PAGE_COMMENT_TEXT);
				}
				}
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1281);
			match(NEWLINE);
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

	public static class CompilerDirectivePopContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode POP() { return getToken(CobolPreprocessorParser.POP, 0); }
		public TerminalNode ALL() { return getToken(CobolPreprocessorParser.ALL, 0); }
		public CompilerDirectivePopListContext compilerDirectivePopList() {
			return getRuleContext(CompilerDirectivePopListContext.class,0);
		}
		public CompilerDirectivePopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectivePop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectivePop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectivePop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectivePop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectivePopContext compilerDirectivePop() throws RecognitionException {
		CompilerDirectivePopContext _localctx = new CompilerDirectivePopContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_compilerDirectivePop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1283);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1284);
			match(POP);
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1285);
				match(ALL);
				}
				break;
			case DEFINE:
			case SOURCE:
			case CALL_CONVENTION:
			case COBOL_WORDS:
			case DISPLAY:
			case FLAG_02:
			case FLAG_14:
			case LEAP_SECOND:
			case LISTING:
			case PROPOGATE:
			case REF_MOD_ZERO_LENGTH:
			case TURN:
				{
				setState(1286);
				compilerDirectivePopList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class CompilerDirectivePropogateContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode PROPOGATE() { return getToken(CobolPreprocessorParser.PROPOGATE, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectivePropogateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectivePropogate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectivePropogate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectivePropogate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectivePropogate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectivePropogateContext compilerDirectivePropogate() throws RecognitionException {
		CompilerDirectivePropogateContext _localctx = new CompilerDirectivePropogateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_compilerDirectivePropogate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1289);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1290);
			match(PROPOGATE);
			setState(1291);
			_la = _input.LA(1);
			if ( !(_la==COMP_DIR_OFF || _la==COMP_DIR_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectivePushContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode PUSH() { return getToken(CobolPreprocessorParser.PUSH, 0); }
		public TerminalNode ALL() { return getToken(CobolPreprocessorParser.ALL, 0); }
		public CompilerDirectivePopListContext compilerDirectivePopList() {
			return getRuleContext(CompilerDirectivePopListContext.class,0);
		}
		public CompilerDirectivePushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectivePush; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectivePush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectivePush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectivePush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectivePushContext compilerDirectivePush() throws RecognitionException {
		CompilerDirectivePushContext _localctx = new CompilerDirectivePushContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_compilerDirectivePush);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1293);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1294);
			match(PUSH);
			setState(1297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1295);
				match(ALL);
				}
				break;
			case DEFINE:
			case SOURCE:
			case CALL_CONVENTION:
			case COBOL_WORDS:
			case DISPLAY:
			case FLAG_02:
			case FLAG_14:
			case LEAP_SECOND:
			case LISTING:
			case PROPOGATE:
			case REF_MOD_ZERO_LENGTH:
			case TURN:
				{
				setState(1296);
				compilerDirectivePopList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class CompilerDirectiveRefModZeroLengthContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode REF_MOD_ZERO_LENGTH() { return getToken(CobolPreprocessorParser.REF_MOD_ZERO_LENGTH, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectiveRefModZeroLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveRefModZeroLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveRefModZeroLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveRefModZeroLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveRefModZeroLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveRefModZeroLengthContext compilerDirectiveRefModZeroLength() throws RecognitionException {
		CompilerDirectiveRefModZeroLengthContext _localctx = new CompilerDirectiveRefModZeroLengthContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_compilerDirectiveRefModZeroLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1299);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1300);
			match(REF_MOD_ZERO_LENGTH);
			setState(1301);
			_la = _input.LA(1);
			if ( !(_la==COMP_DIR_OFF || _la==COMP_DIR_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectiveSourceContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode SOURCE() { return getToken(CobolPreprocessorParser.SOURCE, 0); }
		public TerminalNode FIXED() { return getToken(CobolPreprocessorParser.FIXED, 0); }
		public TerminalNode COMP_DIR_FREE() { return getToken(CobolPreprocessorParser.COMP_DIR_FREE, 0); }
		public TerminalNode FORMAT() { return getToken(CobolPreprocessorParser.FORMAT, 0); }
		public TerminalNode IS() { return getToken(CobolPreprocessorParser.IS, 0); }
		public CompilerDirectiveSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveSourceContext compilerDirectiveSource() throws RecognitionException {
		CompilerDirectiveSourceContext _localctx = new CompilerDirectiveSourceContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_compilerDirectiveSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1303);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1304);
			match(SOURCE);
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(1305);
				match(FORMAT);
				setState(1306);
				match(IS);
				}
			}

			setState(1309);
			_la = _input.LA(1);
			if ( !(_la==FIXED || _la==COMP_DIR_FREE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompilerDirectiveTurnContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode TURN() { return getToken(CobolPreprocessorParser.TURN, 0); }
		public TerminalNode CHECKING() { return getToken(CobolPreprocessorParser.CHECKING, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CobolPreprocessorParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CobolPreprocessorParser.IDENTIFIER, i);
		}
		public TerminalNode LOCATION() { return getToken(CobolPreprocessorParser.LOCATION, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode WITH() { return getToken(CobolPreprocessorParser.WITH, 0); }
		public CompilerDirectiveTurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveTurn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveTurn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveTurnContext compilerDirectiveTurn() throws RecognitionException {
		CompilerDirectiveTurnContext _localctx = new CompilerDirectiveTurnContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_compilerDirectiveTurn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1311);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1312);
			match(TURN);
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1313);
				match(IDENTIFIER);
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1319);
			match(CHECKING);
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP_DIR_OFF:
				{
				setState(1320);
				match(COMP_DIR_OFF);
				}
				break;
			case LOCATION:
			case COMP_DIR_ON:
			case WITH:
				{
				{
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMP_DIR_ON) {
					{
					setState(1321);
					match(COMP_DIR_ON);
					}
				}

				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1324);
					match(WITH);
					}
				}

				setState(1327);
				match(LOCATION);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class CompilerDirectivePopListContext extends ParserRuleContext {
		public TerminalNode CALL_CONVENTION() { return getToken(CobolPreprocessorParser.CALL_CONVENTION, 0); }
		public TerminalNode COBOL_WORDS() { return getToken(CobolPreprocessorParser.COBOL_WORDS, 0); }
		public TerminalNode DEFINE() { return getToken(CobolPreprocessorParser.DEFINE, 0); }
		public TerminalNode DISPLAY() { return getToken(CobolPreprocessorParser.DISPLAY, 0); }
		public TerminalNode FLAG_02() { return getToken(CobolPreprocessorParser.FLAG_02, 0); }
		public TerminalNode FLAG_14() { return getToken(CobolPreprocessorParser.FLAG_14, 0); }
		public TerminalNode LEAP_SECOND() { return getToken(CobolPreprocessorParser.LEAP_SECOND, 0); }
		public TerminalNode LISTING() { return getToken(CobolPreprocessorParser.LISTING, 0); }
		public TerminalNode PROPOGATE() { return getToken(CobolPreprocessorParser.PROPOGATE, 0); }
		public TerminalNode REF_MOD_ZERO_LENGTH() { return getToken(CobolPreprocessorParser.REF_MOD_ZERO_LENGTH, 0); }
		public TerminalNode SOURCE() { return getToken(CobolPreprocessorParser.SOURCE, 0); }
		public TerminalNode TURN() { return getToken(CobolPreprocessorParser.TURN, 0); }
		public CompilerDirectivePopListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectivePopList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectivePopList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectivePopList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectivePopList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectivePopListContext compilerDirectivePopList() throws RecognitionException {
		CompilerDirectivePopListContext _localctx = new CompilerDirectivePopListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_compilerDirectivePopList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			_la = _input.LA(1);
			if ( !(_la==DEFINE || _la==SOURCE || ((((_la - 464)) & ~0x3f) == 0 && ((1L << (_la - 464)) & ((1L << (CALL_CONVENTION - 464)) | (1L << (COBOL_WORDS - 464)) | (1L << (DISPLAY - 464)) | (1L << (FLAG_02 - 464)) | (1L << (FLAG_14 - 464)) | (1L << (LEAP_SECOND - 464)) | (1L << (LISTING - 464)) | (1L << (PROPOGATE - 464)) | (1L << (REF_MOD_ZERO_LENGTH - 464)) | (1L << (TURN - 464)))) != 0)) ) {
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

	public static class CompilerDirectiveCobolWordsEquateContext extends ParserRuleContext {
		public TerminalNode EQUATE() { return getToken(CobolPreprocessorParser.EQUATE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode WITH() { return getToken(CobolPreprocessorParser.WITH, 0); }
		public CompilerDirectiveCobolWordsEquateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveCobolWordsEquate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveCobolWordsEquate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveCobolWordsEquate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveCobolWordsEquate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveCobolWordsEquateContext compilerDirectiveCobolWordsEquate() throws RecognitionException {
		CompilerDirectiveCobolWordsEquateContext _localctx = new CompilerDirectiveCobolWordsEquateContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_compilerDirectiveCobolWordsEquate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1332);
			match(EQUATE);
			setState(1333);
			literal();
			setState(1334);
			match(WITH);
			setState(1335);
			literal();
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

	public static class CompilerDirectiveCobolWordsUndefineContext extends ParserRuleContext {
		public TerminalNode UNDEFINE() { return getToken(CobolPreprocessorParser.UNDEFINE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CompilerDirectiveCobolWordsUndefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveCobolWordsUndefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveCobolWordsUndefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveCobolWordsUndefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveCobolWordsUndefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveCobolWordsUndefineContext compilerDirectiveCobolWordsUndefine() throws RecognitionException {
		CompilerDirectiveCobolWordsUndefineContext _localctx = new CompilerDirectiveCobolWordsUndefineContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_compilerDirectiveCobolWordsUndefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1337);
			match(UNDEFINE);
			setState(1338);
			literal();
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

	public static class CompilerDirectiveCobolWordsSubstituteContext extends ParserRuleContext {
		public TerminalNode SUBSTITUTE() { return getToken(CobolPreprocessorParser.SUBSTITUTE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode BY() { return getToken(CobolPreprocessorParser.BY, 0); }
		public CompilerDirectiveCobolWordsSubstituteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveCobolWordsSubstitute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveCobolWordsSubstitute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveCobolWordsSubstitute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveCobolWordsSubstitute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveCobolWordsSubstituteContext compilerDirectiveCobolWordsSubstitute() throws RecognitionException {
		CompilerDirectiveCobolWordsSubstituteContext _localctx = new CompilerDirectiveCobolWordsSubstituteContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_compilerDirectiveCobolWordsSubstitute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1340);
			match(SUBSTITUTE);
			setState(1341);
			literal();
			setState(1342);
			match(BY);
			setState(1343);
			literal();
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

	public static class CompilerDirectiveCobolWordsReserveContext extends ParserRuleContext {
		public TerminalNode RESERVE() { return getToken(CobolPreprocessorParser.RESERVE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CompilerDirectiveCobolWordsReserveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveCobolWordsReserve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveCobolWordsReserve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveCobolWordsReserve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveCobolWordsReserve(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveCobolWordsReserveContext compilerDirectiveCobolWordsReserve() throws RecognitionException {
		CompilerDirectiveCobolWordsReserveContext _localctx = new CompilerDirectiveCobolWordsReserveContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_compilerDirectiveCobolWordsReserve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1345);
			match(RESERVE);
			setState(1346);
			literal();
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

	public static class CompilerDirectiveNumericRangeContext extends ParserRuleContext {
		public List<CompilerDirectiveNumericAtomContext> compilerDirectiveNumericAtom() {
			return getRuleContexts(CompilerDirectiveNumericAtomContext.class);
		}
		public CompilerDirectiveNumericAtomContext compilerDirectiveNumericAtom(int i) {
			return getRuleContext(CompilerDirectiveNumericAtomContext.class,i);
		}
		public TerminalNode MINUSCHAR() { return getToken(CobolPreprocessorParser.MINUSCHAR, 0); }
		public CompilerDirectiveNumericRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveNumericRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveNumericRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveNumericRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveNumericRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveNumericRangeContext compilerDirectiveNumericRange() throws RecognitionException {
		CompilerDirectiveNumericRangeContext _localctx = new CompilerDirectiveNumericRangeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_compilerDirectiveNumericRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1348);
			compilerDirectiveNumericAtom();
			setState(1349);
			match(MINUSCHAR);
			setState(1350);
			compilerDirectiveNumericAtom();
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

	public static class CompilerDirectiveNumericAtomContext extends ParserRuleContext {
		public TerminalNode NUMERICLITERAL() { return getToken(CobolPreprocessorParser.NUMERICLITERAL, 0); }
		public CompilerDirectiveNumericAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveNumericAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveNumericAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveNumericAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveNumericAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveNumericAtomContext compilerDirectiveNumericAtom() throws RecognitionException {
		CompilerDirectiveNumericAtomContext _localctx = new CompilerDirectiveNumericAtomContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_compilerDirectiveNumericAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1352);
			match(NUMERICLITERAL);
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

	public static class CompilerDirectiveDeleteSequenceNumberContext extends ParserRuleContext {
		public List<CompilerDirectiveNumericAtomContext> compilerDirectiveNumericAtom() {
			return getRuleContexts(CompilerDirectiveNumericAtomContext.class);
		}
		public CompilerDirectiveNumericAtomContext compilerDirectiveNumericAtom(int i) {
			return getRuleContext(CompilerDirectiveNumericAtomContext.class,i);
		}
		public List<CompilerDirectiveNumericRangeContext> compilerDirectiveNumericRange() {
			return getRuleContexts(CompilerDirectiveNumericRangeContext.class);
		}
		public CompilerDirectiveNumericRangeContext compilerDirectiveNumericRange(int i) {
			return getRuleContext(CompilerDirectiveNumericRangeContext.class,i);
		}
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolPreprocessorParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolPreprocessorParser.COMMACHAR, i);
		}
		public CompilerDirectiveDeleteSequenceNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveDeleteSequenceNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveDeleteSequenceNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveDeleteSequenceNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveDeleteSequenceNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveDeleteSequenceNumberContext compilerDirectiveDeleteSequenceNumber() throws RecognitionException {
		CompilerDirectiveDeleteSequenceNumberContext _localctx = new CompilerDirectiveDeleteSequenceNumberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_compilerDirectiveDeleteSequenceNumber);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1354);
				compilerDirectiveNumericAtom();
				}
				break;
			case 2:
				{
				setState(1355);
				compilerDirectiveNumericRange();
				}
				break;
			}
			setState(1365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1358);
					match(COMMACHAR);
					setState(1361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						setState(1359);
						compilerDirectiveNumericAtom();
						}
						break;
					case 2:
						{
						setState(1360);
						compilerDirectiveNumericRange();
						}
						break;
					}
					}
					} 
				}
				setState(1367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
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

	public static class ConditionalCompilationDefineContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode DEFINE() { return getToken(CobolPreprocessorParser.DEFINE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(CobolPreprocessorParser.AS, 0); }
		public ConditionalCompilationDefinePredicateContext conditionalCompilationDefinePredicate() {
			return getRuleContext(ConditionalCompilationDefinePredicateContext.class,0);
		}
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public TerminalNode OVERRIDE() { return getToken(CobolPreprocessorParser.OVERRIDE, 0); }
		public ConditionalCompilationDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationDefineContext conditionalCompilationDefine() throws RecognitionException {
		ConditionalCompilationDefineContext _localctx = new ConditionalCompilationDefineContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_conditionalCompilationDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1368);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1369);
			match(DEFINE);
			setState(1370);
			match(IDENTIFIER);
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1371);
				match(AS);
				}
			}

			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1374);
				conditionalCompilationDefinePredicate();
				}
				break;
			case 2:
				{
				setState(1375);
				match(COMP_DIR_OFF);
				}
				break;
			}
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(1378);
				match(OVERRIDE);
				}
			}

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

	public static class ConditionalCompilationDefinePredicateContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConditionalCompilationArithmeticExpressionContext conditionalCompilationArithmeticExpression() {
			return getRuleContext(ConditionalCompilationArithmeticExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode PARAMETER() { return getToken(CobolPreprocessorParser.PARAMETER, 0); }
		public ConditionalCompilationDefinePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationDefinePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationDefinePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationDefinePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationDefinePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationDefinePredicateContext conditionalCompilationDefinePredicate() throws RecognitionException {
		ConditionalCompilationDefinePredicateContext _localctx = new ConditionalCompilationDefinePredicateContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_conditionalCompilationDefinePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1381);
				literal();
				}
				break;
			case 2:
				{
				setState(1382);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 3:
				{
				setState(1383);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(1384);
				match(PARAMETER);
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

	public static class ConditionalCompilationArithmeticExpressionContext extends ParserRuleContext {
		public List<ConditionalCompilationArithmeticAtomContext> conditionalCompilationArithmeticAtom() {
			return getRuleContexts(ConditionalCompilationArithmeticAtomContext.class);
		}
		public ConditionalCompilationArithmeticAtomContext conditionalCompilationArithmeticAtom(int i) {
			return getRuleContext(ConditionalCompilationArithmeticAtomContext.class,i);
		}
		public List<ConditionalCompilationArithmeticOpContext> conditionalCompilationArithmeticOp() {
			return getRuleContexts(ConditionalCompilationArithmeticOpContext.class);
		}
		public ConditionalCompilationArithmeticOpContext conditionalCompilationArithmeticOp(int i) {
			return getRuleContext(ConditionalCompilationArithmeticOpContext.class,i);
		}
		public List<TerminalNode> RPARENCHAR() { return getTokens(CobolPreprocessorParser.RPARENCHAR); }
		public TerminalNode RPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.RPARENCHAR, i);
		}
		public List<TerminalNode> LPARENCHAR() { return getTokens(CobolPreprocessorParser.LPARENCHAR); }
		public TerminalNode LPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.LPARENCHAR, i);
		}
		public ConditionalCompilationArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationArithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationArithmeticExpressionContext conditionalCompilationArithmeticExpression() throws RecognitionException {
		ConditionalCompilationArithmeticExpressionContext _localctx = new ConditionalCompilationArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_conditionalCompilationArithmeticExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1396); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1390);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1387);
						match(LPARENCHAR);
						}
						}
						setState(1392);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1393);
					conditionalCompilationArithmeticAtom();
					setState(1394);
					conditionalCompilationArithmeticOp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1398); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1403);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1400);
						match(LPARENCHAR);
						}
						}
						setState(1405);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1406);
					conditionalCompilationArithmeticAtom();
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==RPARENCHAR) {
						{
						{
						setState(1407);
						match(RPARENCHAR);
						}
						}
						setState(1412);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1413);
					conditionalCompilationArithmeticOp();
					}
					} 
				}
				setState(1419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			setState(1420);
			conditionalCompilationArithmeticAtom();
			setState(1424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1421);
					match(RPARENCHAR);
					}
					} 
				}
				setState(1426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
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

	public static class ConditionalCompilationArithmeticAtomContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode ZERO() { return getToken(CobolPreprocessorParser.ZERO, 0); }
		public TerminalNode NUMERICLITERAL() { return getToken(CobolPreprocessorParser.NUMERICLITERAL, 0); }
		public ConditionalCompilationArithmeticAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationArithmeticAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationArithmeticAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationArithmeticAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationArithmeticAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationArithmeticAtomContext conditionalCompilationArithmeticAtom() throws RecognitionException {
		ConditionalCompilationArithmeticAtomContext _localctx = new ConditionalCompilationArithmeticAtomContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_conditionalCompilationArithmeticAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			_la = _input.LA(1);
			if ( !(((((_la - 436)) & ~0x3f) == 0 && ((1L << (_la - 436)) & ((1L << (NUMERICLITERAL - 436)) | (1L << (IDENTIFIER - 436)) | (1L << (ZERO - 436)))) != 0)) ) {
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

	public static class ConditionalCompilationArithmeticOpContext extends ParserRuleContext {
		public TerminalNode ASTERISKCHAR() { return getToken(CobolPreprocessorParser.ASTERISKCHAR, 0); }
		public TerminalNode MINUSCHAR() { return getToken(CobolPreprocessorParser.MINUSCHAR, 0); }
		public TerminalNode PLUSCHAR() { return getToken(CobolPreprocessorParser.PLUSCHAR, 0); }
		public TerminalNode SLASHCHAR() { return getToken(CobolPreprocessorParser.SLASHCHAR, 0); }
		public ConditionalCompilationArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationArithmeticOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationArithmeticOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationArithmeticOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationArithmeticOpContext conditionalCompilationArithmeticOp() throws RecognitionException {
		ConditionalCompilationArithmeticOpContext _localctx = new ConditionalCompilationArithmeticOpContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_conditionalCompilationArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			_la = _input.LA(1);
			if ( !(((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (ASTERISKCHAR - 450)) | (1L << (PLUSCHAR - 450)) | (1L << (MINUSCHAR - 450)) | (1L << (SLASHCHAR - 450)))) != 0)) ) {
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

	public static class ConditionalCompilationIfContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode IF() { return getToken(CobolPreprocessorParser.IF, 0); }
		public ConditionalCompilationRelationalConditionContext conditionalCompilationRelationalCondition() {
			return getRuleContext(ConditionalCompilationRelationalConditionContext.class,0);
		}
		public ConditionalCompilationIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationIfContext conditionalCompilationIf() throws RecognitionException {
		ConditionalCompilationIfContext _localctx = new ConditionalCompilationIfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_conditionalCompilationIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1431);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1432);
			match(IF);
			setState(1433);
			conditionalCompilationRelationalCondition();
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

	public static class ConditionalCompilationElseContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode ELSE() { return getToken(CobolPreprocessorParser.ELSE, 0); }
		public ConditionalCompilationElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationElseContext conditionalCompilationElse() throws RecognitionException {
		ConditionalCompilationElseContext _localctx = new ConditionalCompilationElseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_conditionalCompilationElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1436);
			match(ELSE);
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

	public static class ConditionalCompilationEndIfContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode END_IF() { return getToken(CobolPreprocessorParser.END_IF, 0); }
		public ConditionalCompilationEndIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationEndIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationEndIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationEndIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationEndIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationEndIfContext conditionalCompilationEndIf() throws RecognitionException {
		ConditionalCompilationEndIfContext _localctx = new ConditionalCompilationEndIfContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_conditionalCompilationEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1439);
			match(END_IF);
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

	public static class ConditionalCompilationEvaluateSelectionContext extends ParserRuleContext {
		public ConditionalCompilationArithmeticExpressionContext conditionalCompilationArithmeticExpression() {
			return getRuleContext(ConditionalCompilationArithmeticExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConditionalCompilationEvaluateSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationEvaluateSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationEvaluateSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationEvaluateSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationEvaluateSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationEvaluateSelectionContext conditionalCompilationEvaluateSelection() throws RecognitionException {
		ConditionalCompilationEvaluateSelectionContext _localctx = new ConditionalCompilationEvaluateSelectionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_conditionalCompilationEvaluateSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1441);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1442);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1443);
				literal();
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

	public static class ConditionalCompilationEvaluateContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode EVALUATE() { return getToken(CobolPreprocessorParser.EVALUATE, 0); }
		public TerminalNode TRUE() { return getToken(CobolPreprocessorParser.TRUE, 0); }
		public ConditionalCompilationEvaluateSelectionContext conditionalCompilationEvaluateSelection() {
			return getRuleContext(ConditionalCompilationEvaluateSelectionContext.class,0);
		}
		public ConditionalCompilationEvaluateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationEvaluate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationEvaluate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationEvaluate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationEvaluate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationEvaluateContext conditionalCompilationEvaluate() throws RecognitionException {
		ConditionalCompilationEvaluateContext _localctx = new ConditionalCompilationEvaluateContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_conditionalCompilationEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1447);
			match(EVALUATE);
			setState(1450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(1448);
				match(TRUE);
				}
				break;
			case LPARENCHAR:
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
			case IDENTIFIER:
			case ZERO:
				{
				setState(1449);
				conditionalCompilationEvaluateSelection();
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

	public static class ConditionalCompilationWhenContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode WHEN() { return getToken(CobolPreprocessorParser.WHEN, 0); }
		public ConditionalCompilationRelationalConditionContext conditionalCompilationRelationalCondition() {
			return getRuleContext(ConditionalCompilationRelationalConditionContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(CobolPreprocessorParser.OTHER, 0); }
		public List<ConditionalCompilationEvaluateSelectionContext> conditionalCompilationEvaluateSelection() {
			return getRuleContexts(ConditionalCompilationEvaluateSelectionContext.class);
		}
		public ConditionalCompilationEvaluateSelectionContext conditionalCompilationEvaluateSelection(int i) {
			return getRuleContext(ConditionalCompilationEvaluateSelectionContext.class,i);
		}
		public TerminalNode THROUGH() { return getToken(CobolPreprocessorParser.THROUGH, 0); }
		public TerminalNode THRU() { return getToken(CobolPreprocessorParser.THRU, 0); }
		public ConditionalCompilationWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationWhenContext conditionalCompilationWhen() throws RecognitionException {
		ConditionalCompilationWhenContext _localctx = new ConditionalCompilationWhenContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_conditionalCompilationWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1453);
			match(WHEN);
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				{
				setState(1454);
				conditionalCompilationEvaluateSelection();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROUGH || _la==THRU) {
					{
					setState(1455);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1456);
					conditionalCompilationEvaluateSelection();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(1459);
				conditionalCompilationRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1460);
				match(OTHER);
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

	public static class ConditionalCompilationEndEvaluateContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode END_EVALUATE() { return getToken(CobolPreprocessorParser.END_EVALUATE, 0); }
		public ConditionalCompilationEndEvaluateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationEndEvaluate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationEndEvaluate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationEndEvaluate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationEndEvaluate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationEndEvaluateContext conditionalCompilationEndEvaluate() throws RecognitionException {
		ConditionalCompilationEndEvaluateContext _localctx = new ConditionalCompilationEndEvaluateContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_conditionalCompilationEndEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1464);
			match(END_EVALUATE);
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

	public static class ConditionalCompilationComparisonOpContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(CobolPreprocessorParser.EQUAL, 0); }
		public TerminalNode EQUALCHAR() { return getToken(CobolPreprocessorParser.EQUALCHAR, 0); }
		public TerminalNode NOTEQUALCHAR() { return getToken(CobolPreprocessorParser.NOTEQUALCHAR, 0); }
		public TerminalNode LESSTHANCHAR() { return getToken(CobolPreprocessorParser.LESSTHANCHAR, 0); }
		public TerminalNode GREATERTHANCHAR() { return getToken(CobolPreprocessorParser.GREATERTHANCHAR, 0); }
		public TerminalNode LESSOREQUALCHAR() { return getToken(CobolPreprocessorParser.LESSOREQUALCHAR, 0); }
		public TerminalNode GREATEROREQUALCHAR() { return getToken(CobolPreprocessorParser.GREATEROREQUALCHAR, 0); }
		public TerminalNode IS() { return getToken(CobolPreprocessorParser.IS, 0); }
		public TerminalNode NOT() { return getToken(CobolPreprocessorParser.NOT, 0); }
		public TerminalNode TO() { return getToken(CobolPreprocessorParser.TO, 0); }
		public TerminalNode GREATER() { return getToken(CobolPreprocessorParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CobolPreprocessorParser.LESS, 0); }
		public TerminalNode OR() { return getToken(CobolPreprocessorParser.OR, 0); }
		public TerminalNode THAN() { return getToken(CobolPreprocessorParser.THAN, 0); }
		public ConditionalCompilationComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationComparisonOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationComparisonOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationComparisonOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationComparisonOpContext conditionalCompilationComparisonOp() throws RecognitionException {
		ConditionalCompilationComparisonOpContext _localctx = new ConditionalCompilationComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_conditionalCompilationComparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1466);
				match(IS);
				}
			}

			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1469);
				match(NOT);
				}
			}

			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1472);
				match(EQUAL);
				}
				break;
			case 2:
				{
				setState(1473);
				match(EQUALCHAR);
				}
				break;
			case 3:
				{
				setState(1474);
				match(NOTEQUALCHAR);
				}
				break;
			case 4:
				{
				setState(1475);
				match(LESSTHANCHAR);
				}
				break;
			case 5:
				{
				{
				setState(1476);
				match(GREATER);
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1477);
					match(THAN);
					}
				}

				}
				}
				break;
			case 6:
				{
				setState(1480);
				match(GREATERTHANCHAR);
				}
				break;
			case 7:
				{
				{
				setState(1481);
				match(LESS);
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1482);
					match(THAN);
					}
				}

				}
				}
				break;
			case 8:
				{
				setState(1485);
				match(LESSOREQUALCHAR);
				}
				break;
			case 9:
				{
				{
				setState(1486);
				match(LESS);
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1487);
					match(THAN);
					}
				}

				setState(1490);
				match(OR);
				setState(1491);
				match(EQUAL);
				}
				}
				break;
			case 10:
				{
				setState(1492);
				match(GREATEROREQUALCHAR);
				}
				break;
			case 11:
				{
				{
				setState(1493);
				match(GREATER);
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1494);
					match(THAN);
					}
				}

				setState(1497);
				match(OR);
				setState(1498);
				match(EQUAL);
				}
				}
				break;
			}
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1501);
				match(TO);
				}
			}

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

	public static class ConditionalCompilationRelationalConditionContext extends ParserRuleContext {
		public List<ConditionalCompilationConditionContext> conditionalCompilationCondition() {
			return getRuleContexts(ConditionalCompilationConditionContext.class);
		}
		public ConditionalCompilationConditionContext conditionalCompilationCondition(int i) {
			return getRuleContext(ConditionalCompilationConditionContext.class,i);
		}
		public List<TerminalNode> LPARENCHAR() { return getTokens(CobolPreprocessorParser.LPARENCHAR); }
		public TerminalNode LPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.LPARENCHAR, i);
		}
		public List<TerminalNode> RPARENCHAR() { return getTokens(CobolPreprocessorParser.RPARENCHAR); }
		public TerminalNode RPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.RPARENCHAR, i);
		}
		public List<TerminalNode> AND() { return getTokens(CobolPreprocessorParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CobolPreprocessorParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CobolPreprocessorParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CobolPreprocessorParser.OR, i);
		}
		public ConditionalCompilationRelationalConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationRelationalCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationRelationalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationRelationalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationRelationalCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationRelationalConditionContext conditionalCompilationRelationalCondition() throws RecognitionException {
		ConditionalCompilationRelationalConditionContext _localctx = new ConditionalCompilationRelationalConditionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_conditionalCompilationRelationalCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1536); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1504);
							match(LPARENCHAR);
							}
							} 
						}
						setState(1509);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
					}
					setState(1510);
					conditionalCompilationCondition();
					setState(1527);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1511);
							_la = _input.LA(1);
							if ( !(_la==AND || _la==OR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1515);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1512);
									match(LPARENCHAR);
									}
									} 
								}
								setState(1517);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
							}
							setState(1518);
							conditionalCompilationCondition();
							setState(1522);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1519);
									match(RPARENCHAR);
									}
									} 
								}
								setState(1524);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
							}
							}
							} 
						}
						setState(1529);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
					}
					setState(1533);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1530);
							match(RPARENCHAR);
							}
							} 
						}
						setState(1535);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1538); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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

	public static class ConditionalCompilationConditionContext extends ParserRuleContext {
		public ConditionalCompilationSimpleRelationalConditionContext conditionalCompilationSimpleRelationalCondition() {
			return getRuleContext(ConditionalCompilationSimpleRelationalConditionContext.class,0);
		}
		public ConditionalCompilationDefinedConditionContext conditionalCompilationDefinedCondition() {
			return getRuleContext(ConditionalCompilationDefinedConditionContext.class,0);
		}
		public ConditionalCompilationBinaryConditionContext conditionalCompilationBinaryCondition() {
			return getRuleContext(ConditionalCompilationBinaryConditionContext.class,0);
		}
		public ConditionalCompilationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationConditionContext conditionalCompilationCondition() throws RecognitionException {
		ConditionalCompilationConditionContext _localctx = new ConditionalCompilationConditionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_conditionalCompilationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1540);
				conditionalCompilationSimpleRelationalCondition();
				}
				break;
			case 2:
				{
				setState(1541);
				conditionalCompilationDefinedCondition();
				}
				break;
			case 3:
				{
				setState(1542);
				conditionalCompilationBinaryCondition();
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

	public static class ConditionalCompilationSimpleRelationalConditionContext extends ParserRuleContext {
		public ConditionalCompilationComparisonOpContext conditionalCompilationComparisonOp() {
			return getRuleContext(ConditionalCompilationComparisonOpContext.class,0);
		}
		public List<ConditionalCompilationArithmeticExpressionContext> conditionalCompilationArithmeticExpression() {
			return getRuleContexts(ConditionalCompilationArithmeticExpressionContext.class);
		}
		public ConditionalCompilationArithmeticExpressionContext conditionalCompilationArithmeticExpression(int i) {
			return getRuleContext(ConditionalCompilationArithmeticExpressionContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CobolPreprocessorParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CobolPreprocessorParser.IDENTIFIER, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ConditionalCompilationSimpleRelationalConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationSimpleRelationalCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationSimpleRelationalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationSimpleRelationalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationSimpleRelationalCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationSimpleRelationalConditionContext conditionalCompilationSimpleRelationalCondition() throws RecognitionException {
		ConditionalCompilationSimpleRelationalConditionContext _localctx = new ConditionalCompilationSimpleRelationalConditionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_conditionalCompilationSimpleRelationalCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1545);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1546);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1547);
				literal();
				}
				break;
			}
			setState(1550);
			conditionalCompilationComparisonOp();
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1551);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1552);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1553);
				literal();
				}
				break;
			}
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

	public static class ConditionalCompilationBinaryConditionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public ConditionalCompilationBinaryConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationBinaryCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationBinaryCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationBinaryCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationBinaryCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationBinaryConditionContext conditionalCompilationBinaryCondition() throws RecognitionException {
		ConditionalCompilationBinaryConditionContext _localctx = new ConditionalCompilationBinaryConditionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_conditionalCompilationBinaryCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(IDENTIFIER);
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

	public static class ConditionalCompilationDefinedConditionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode DEFINED() { return getToken(CobolPreprocessorParser.DEFINED, 0); }
		public TerminalNode IS() { return getToken(CobolPreprocessorParser.IS, 0); }
		public TerminalNode NOT() { return getToken(CobolPreprocessorParser.NOT, 0); }
		public ConditionalCompilationDefinedConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationDefinedCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationDefinedCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationDefinedCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationDefinedCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationDefinedConditionContext conditionalCompilationDefinedCondition() throws RecognitionException {
		ConditionalCompilationDefinedConditionContext _localctx = new ConditionalCompilationDefinedConditionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_conditionalCompilationDefinedCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1558);
			match(IDENTIFIER);
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1559);
				match(IS);
				}
			}

			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1562);
				match(NOT);
				}
			}

			setState(1565);
			match(DEFINED);
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

	public static class CharDataKeywordContext extends ParserRuleContext {
		public TerminalNode ABD() { return getToken(CobolPreprocessorParser.ABD, 0); }
		public TerminalNode ADATA() { return getToken(CobolPreprocessorParser.ADATA, 0); }
		public TerminalNode ADV() { return getToken(CobolPreprocessorParser.ADV, 0); }
		public TerminalNode AFP() { return getToken(CobolPreprocessorParser.AFP, 0); }
		public TerminalNode ALIAS() { return getToken(CobolPreprocessorParser.ALIAS, 0); }
		public TerminalNode ALPHNUM() { return getToken(CobolPreprocessorParser.ALPHNUM, 0); }
		public TerminalNode ANSI() { return getToken(CobolPreprocessorParser.ANSI, 0); }
		public TerminalNode ANY() { return getToken(CobolPreprocessorParser.ANY, 0); }
		public TerminalNode APOST() { return getToken(CobolPreprocessorParser.APOST, 0); }
		public TerminalNode AR() { return getToken(CobolPreprocessorParser.AR, 0); }
		public TerminalNode ARCH() { return getToken(CobolPreprocessorParser.ARCH, 0); }
		public TerminalNode ARITH() { return getToken(CobolPreprocessorParser.ARITH, 0); }
		public TerminalNode AUTO() { return getToken(CobolPreprocessorParser.AUTO, 0); }
		public TerminalNode AWO() { return getToken(CobolPreprocessorParser.AWO, 0); }
		public TerminalNode BIN() { return getToken(CobolPreprocessorParser.BIN, 0); }
		public TerminalNode BLOCK0() { return getToken(CobolPreprocessorParser.BLOCK0, 0); }
		public TerminalNode BUF() { return getToken(CobolPreprocessorParser.BUF, 0); }
		public TerminalNode BUFSIZE() { return getToken(CobolPreprocessorParser.BUFSIZE, 0); }
		public TerminalNode BY() { return getToken(CobolPreprocessorParser.BY, 0); }
		public TerminalNode CBLCARD() { return getToken(CobolPreprocessorParser.CBLCARD, 0); }
		public TerminalNode CICS() { return getToken(CobolPreprocessorParser.CICS, 0); }
		public TerminalNode CO() { return getToken(CobolPreprocessorParser.CO, 0); }
		public TerminalNode COBOL2() { return getToken(CobolPreprocessorParser.COBOL2, 0); }
		public TerminalNode COBOL3() { return getToken(CobolPreprocessorParser.COBOL3, 0); }
		public TerminalNode CODEPAGE() { return getToken(CobolPreprocessorParser.CODEPAGE, 0); }
		public TerminalNode COMMACHAR() { return getToken(CobolPreprocessorParser.COMMACHAR, 0); }
		public TerminalNode COMPAT() { return getToken(CobolPreprocessorParser.COMPAT, 0); }
		public TerminalNode COMPILE() { return getToken(CobolPreprocessorParser.COMPILE, 0); }
		public TerminalNode COPYLOC() { return getToken(CobolPreprocessorParser.COPYLOC, 0); }
		public TerminalNode COPYRIGHT() { return getToken(CobolPreprocessorParser.COPYRIGHT, 0); }
		public TerminalNode CP() { return getToken(CobolPreprocessorParser.CP, 0); }
		public TerminalNode CPLC() { return getToken(CobolPreprocessorParser.CPLC, 0); }
		public TerminalNode CPP() { return getToken(CobolPreprocessorParser.CPP, 0); }
		public TerminalNode CPSM() { return getToken(CobolPreprocessorParser.CPSM, 0); }
		public TerminalNode CPYR() { return getToken(CobolPreprocessorParser.CPYR, 0); }
		public TerminalNode CS() { return getToken(CobolPreprocessorParser.CS, 0); }
		public TerminalNode CURR() { return getToken(CobolPreprocessorParser.CURR, 0); }
		public TerminalNode CURRENCY() { return getToken(CobolPreprocessorParser.CURRENCY, 0); }
		public TerminalNode DATA() { return getToken(CobolPreprocessorParser.DATA, 0); }
		public TerminalNode DATEPROC() { return getToken(CobolPreprocessorParser.DATEPROC, 0); }
		public TerminalNode DBCS() { return getToken(CobolPreprocessorParser.DBCS, 0); }
		public TerminalNode DD() { return getToken(CobolPreprocessorParser.DD, 0); }
		public TerminalNode DEBUG() { return getToken(CobolPreprocessorParser.DEBUG, 0); }
		public TerminalNode DEC() { return getToken(CobolPreprocessorParser.DEC, 0); }
		public TerminalNode DECK() { return getToken(CobolPreprocessorParser.DECK, 0); }
		public TerminalNode DEF() { return getToken(CobolPreprocessorParser.DEF, 0); }
		public TerminalNode DEFINE() { return getToken(CobolPreprocessorParser.DEFINE, 0); }
		public TerminalNode DIAGTRUNC() { return getToken(CobolPreprocessorParser.DIAGTRUNC, 0); }
		public TerminalNode DISPSIGN() { return getToken(CobolPreprocessorParser.DISPSIGN, 0); }
		public TerminalNode DLI() { return getToken(CobolPreprocessorParser.DLI, 0); }
		public TerminalNode DLL() { return getToken(CobolPreprocessorParser.DLL, 0); }
		public TerminalNode DP() { return getToken(CobolPreprocessorParser.DP, 0); }
		public TerminalNode DS() { return getToken(CobolPreprocessorParser.DS, 0); }
		public TerminalNode DSN() { return getToken(CobolPreprocessorParser.DSN, 0); }
		public TerminalNode DSNAME() { return getToken(CobolPreprocessorParser.DSNAME, 0); }
		public TerminalNode DTR() { return getToken(CobolPreprocessorParser.DTR, 0); }
		public TerminalNode DU() { return getToken(CobolPreprocessorParser.DU, 0); }
		public TerminalNode DUMP() { return getToken(CobolPreprocessorParser.DUMP, 0); }
		public TerminalNode DYN() { return getToken(CobolPreprocessorParser.DYN, 0); }
		public TerminalNode DYNAM() { return getToken(CobolPreprocessorParser.DYNAM, 0); }
		public TerminalNode DWARF() { return getToken(CobolPreprocessorParser.DWARF, 0); }
		public TerminalNode EDF() { return getToken(CobolPreprocessorParser.EDF, 0); }
		public TerminalNode EJECT() { return getToken(CobolPreprocessorParser.EJECT, 0); }
		public TerminalNode EJPD() { return getToken(CobolPreprocessorParser.EJPD, 0); }
		public TerminalNode EN() { return getToken(CobolPreprocessorParser.EN, 0); }
		public TerminalNode ENDP() { return getToken(CobolPreprocessorParser.ENDP, 0); }
		public TerminalNode ENDPERIOD() { return getToken(CobolPreprocessorParser.ENDPERIOD, 0); }
		public TerminalNode ENGLISH() { return getToken(CobolPreprocessorParser.ENGLISH, 0); }
		public TerminalNode EPILOG() { return getToken(CobolPreprocessorParser.EPILOG, 0); }
		public TerminalNode EVENPACK() { return getToken(CobolPreprocessorParser.EVENPACK, 0); }
		public TerminalNode EVENP() { return getToken(CobolPreprocessorParser.EVENP, 0); }
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
		public TerminalNode HEX() { return getToken(CobolPreprocessorParser.HEX, 0); }
		public TerminalNode HGPR() { return getToken(CobolPreprocessorParser.HGPR, 0); }
		public TerminalNode HOOK() { return getToken(CobolPreprocessorParser.HOOK, 0); }
		public TerminalNode IN() { return getToken(CobolPreprocessorParser.IN, 0); }
		public TerminalNode INITCHECK() { return getToken(CobolPreprocessorParser.INITCHECK, 0); }
		public TerminalNode IC() { return getToken(CobolPreprocessorParser.IC, 0); }
		public TerminalNode INTDATE() { return getToken(CobolPreprocessorParser.INTDATE, 0); }
		public TerminalNode INITIAL() { return getToken(CobolPreprocessorParser.INITIAL, 0); }
		public TerminalNode INL() { return getToken(CobolPreprocessorParser.INL, 0); }
		public TerminalNode JA() { return getToken(CobolPreprocessorParser.JA, 0); }
		public TerminalNode JP() { return getToken(CobolPreprocessorParser.JP, 0); }
		public TerminalNode KA() { return getToken(CobolPreprocessorParser.KA, 0); }
		public TerminalNode LANG() { return getToken(CobolPreprocessorParser.LANG, 0); }
		public TerminalNode LANGUAGE() { return getToken(CobolPreprocessorParser.LANGUAGE, 0); }
		public TerminalNode LAX() { return getToken(CobolPreprocessorParser.LAX, 0); }
		public TerminalNode LAXPERF() { return getToken(CobolPreprocessorParser.LAXPERF, 0); }
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
		public TerminalNode LP() { return getToken(CobolPreprocessorParser.LP, 0); }
		public TerminalNode LU() { return getToken(CobolPreprocessorParser.LU, 0); }
		public TerminalNode LXPRF() { return getToken(CobolPreprocessorParser.LXPRF, 0); }
		public TerminalNode MAP() { return getToken(CobolPreprocessorParser.MAP, 0); }
		public TerminalNode MARGINS() { return getToken(CobolPreprocessorParser.MARGINS, 0); }
		public TerminalNode MAX() { return getToken(CobolPreprocessorParser.MAX, 0); }
		public TerminalNode MAXPCF() { return getToken(CobolPreprocessorParser.MAXPCF, 0); }
		public TerminalNode MD() { return getToken(CobolPreprocessorParser.MD, 0); }
		public TerminalNode MDECK() { return getToken(CobolPreprocessorParser.MDECK, 0); }
		public TerminalNode MIG() { return getToken(CobolPreprocessorParser.MIG, 0); }
		public TerminalNode MIXED() { return getToken(CobolPreprocessorParser.MIXED, 0); }
		public TerminalNode MSG() { return getToken(CobolPreprocessorParser.MSG, 0); }
		public TerminalNode NAME() { return getToken(CobolPreprocessorParser.NAME, 0); }
		public TerminalNode NAT() { return getToken(CobolPreprocessorParser.NAT, 0); }
		public TerminalNode NATIONAL() { return getToken(CobolPreprocessorParser.NATIONAL, 0); }
		public TerminalNode NATLANG() { return getToken(CobolPreprocessorParser.NATLANG, 0); }
		public TerminalNode NC() { return getToken(CobolPreprocessorParser.NC, 0); }
		public TerminalNode NN() { return getToken(CobolPreprocessorParser.NN, 0); }
		public TerminalNode NO() { return getToken(CobolPreprocessorParser.NO, 0); }
		public TerminalNode NOADATA() { return getToken(CobolPreprocessorParser.NOADATA, 0); }
		public TerminalNode NOADV() { return getToken(CobolPreprocessorParser.NOADV, 0); }
		public TerminalNode NOALIAS() { return getToken(CobolPreprocessorParser.NOALIAS, 0); }
		public TerminalNode NOALPHNUM() { return getToken(CobolPreprocessorParser.NOALPHNUM, 0); }
		public TerminalNode NOAWO() { return getToken(CobolPreprocessorParser.NOAWO, 0); }
		public TerminalNode NOBIN() { return getToken(CobolPreprocessorParser.NOBIN, 0); }
		public TerminalNode NOBLOCK0() { return getToken(CobolPreprocessorParser.NOBLOCK0, 0); }
		public TerminalNode NOC() { return getToken(CobolPreprocessorParser.NOC, 0); }
		public TerminalNode NOCBLCARD() { return getToken(CobolPreprocessorParser.NOCBLCARD, 0); }
		public TerminalNode NOCICS() { return getToken(CobolPreprocessorParser.NOCICS, 0); }
		public TerminalNode NOCMPR2() { return getToken(CobolPreprocessorParser.NOCMPR2, 0); }
		public TerminalNode NOCOMPILE() { return getToken(CobolPreprocessorParser.NOCOMPILE, 0); }
		public TerminalNode NOCOPYLOC() { return getToken(CobolPreprocessorParser.NOCOPYLOC, 0); }
		public TerminalNode NOCOPYRIGHT() { return getToken(CobolPreprocessorParser.NOCOPYRIGHT, 0); }
		public TerminalNode NOCPLC() { return getToken(CobolPreprocessorParser.NOCPLC, 0); }
		public TerminalNode NOCPSM() { return getToken(CobolPreprocessorParser.NOCPSM, 0); }
		public TerminalNode NOCPYR() { return getToken(CobolPreprocessorParser.NOCPYR, 0); }
		public TerminalNode NOCURR() { return getToken(CobolPreprocessorParser.NOCURR, 0); }
		public TerminalNode NOCURRENCY() { return getToken(CobolPreprocessorParser.NOCURRENCY, 0); }
		public TerminalNode NOD() { return getToken(CobolPreprocessorParser.NOD, 0); }
		public TerminalNode NODATEPROC() { return getToken(CobolPreprocessorParser.NODATEPROC, 0); }
		public TerminalNode NODBCS() { return getToken(CobolPreprocessorParser.NODBCS, 0); }
		public TerminalNode NODE() { return getToken(CobolPreprocessorParser.NODE, 0); }
		public TerminalNode NODEBUG() { return getToken(CobolPreprocessorParser.NODEBUG, 0); }
		public TerminalNode NODECK() { return getToken(CobolPreprocessorParser.NODECK, 0); }
		public TerminalNode NODEF() { return getToken(CobolPreprocessorParser.NODEF, 0); }
		public TerminalNode NODEFINE() { return getToken(CobolPreprocessorParser.NODEFINE, 0); }
		public TerminalNode NODIAGTRUNC() { return getToken(CobolPreprocessorParser.NODIAGTRUNC, 0); }
		public TerminalNode NODLL() { return getToken(CobolPreprocessorParser.NODLL, 0); }
		public TerminalNode NODSNAME() { return getToken(CobolPreprocessorParser.NODSNAME, 0); }
		public TerminalNode NODU() { return getToken(CobolPreprocessorParser.NODU, 0); }
		public TerminalNode NODUMP() { return getToken(CobolPreprocessorParser.NODUMP, 0); }
		public TerminalNode NODP() { return getToken(CobolPreprocessorParser.NODP, 0); }
		public TerminalNode NODTR() { return getToken(CobolPreprocessorParser.NODTR, 0); }
		public TerminalNode NODYN() { return getToken(CobolPreprocessorParser.NODYN, 0); }
		public TerminalNode NODYNAM() { return getToken(CobolPreprocessorParser.NODYNAM, 0); }
		public TerminalNode NODWARF() { return getToken(CobolPreprocessorParser.NODWARF, 0); }
		public TerminalNode NOEDF() { return getToken(CobolPreprocessorParser.NOEDF, 0); }
		public TerminalNode NOEJPD() { return getToken(CobolPreprocessorParser.NOEJPD, 0); }
		public TerminalNode NOENDP() { return getToken(CobolPreprocessorParser.NOENDP, 0); }
		public TerminalNode NOENDPERIOD() { return getToken(CobolPreprocessorParser.NOENDPERIOD, 0); }
		public TerminalNode NOEPILOG() { return getToken(CobolPreprocessorParser.NOEPILOG, 0); }
		public TerminalNode NOEVENP() { return getToken(CobolPreprocessorParser.NOEVENP, 0); }
		public TerminalNode NOEVENPACK() { return getToken(CobolPreprocessorParser.NOEVENPACK, 0); }
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
		public TerminalNode NOIC() { return getToken(CobolPreprocessorParser.NOIC, 0); }
		public TerminalNode NOINITCHECK() { return getToken(CobolPreprocessorParser.NOINITCHECK, 0); }
		public TerminalNode NOINITIAL() { return getToken(CobolPreprocessorParser.NOINITIAL, 0); }
		public TerminalNode NOINLINE() { return getToken(CobolPreprocessorParser.NOINLINE, 0); }
		public TerminalNode NOINL() { return getToken(CobolPreprocessorParser.NOINL, 0); }
		public TerminalNode NOLAXPERF() { return getToken(CobolPreprocessorParser.NOLAXPERF, 0); }
		public TerminalNode NOLENGTH() { return getToken(CobolPreprocessorParser.NOLENGTH, 0); }
		public TerminalNode NOLIB() { return getToken(CobolPreprocessorParser.NOLIB, 0); }
		public TerminalNode NOLINKAGE() { return getToken(CobolPreprocessorParser.NOLINKAGE, 0); }
		public TerminalNode NOLIST() { return getToken(CobolPreprocessorParser.NOLIST, 0); }
		public TerminalNode NOLXPRF() { return getToken(CobolPreprocessorParser.NOLXPRF, 0); }
		public TerminalNode NOMAP() { return getToken(CobolPreprocessorParser.NOMAP, 0); }
		public TerminalNode NOMD() { return getToken(CobolPreprocessorParser.NOMD, 0); }
		public TerminalNode NOMDECK() { return getToken(CobolPreprocessorParser.NOMDECK, 0); }
		public TerminalNode NONAME() { return getToken(CobolPreprocessorParser.NONAME, 0); }
		public TerminalNode NONUM() { return getToken(CobolPreprocessorParser.NONUM, 0); }
		public TerminalNode NONUMBER() { return getToken(CobolPreprocessorParser.NONUMBER, 0); }
		public TerminalNode NOOBJ() { return getToken(CobolPreprocessorParser.NOOBJ, 0); }
		public TerminalNode NOOBJECT() { return getToken(CobolPreprocessorParser.NOOBJECT, 0); }
		public TerminalNode NOOOM() { return getToken(CobolPreprocessorParser.NOOOM, 0); }
		public TerminalNode NOOMITODOMIN() { return getToken(CobolPreprocessorParser.NOOMITODOMIN, 0); }
		public TerminalNode NOOFF() { return getToken(CobolPreprocessorParser.NOOFF, 0); }
		public TerminalNode NOOFFSET() { return getToken(CobolPreprocessorParser.NOOFFSET, 0); }
		public TerminalNode NOOPSEQUENCE() { return getToken(CobolPreprocessorParser.NOOPSEQUENCE, 0); }
		public TerminalNode NOOPT() { return getToken(CobolPreprocessorParser.NOOPT, 0); }
		public TerminalNode NOOPTIMIZE() { return getToken(CobolPreprocessorParser.NOOPTIMIZE, 0); }
		public TerminalNode NOOPTIONS() { return getToken(CobolPreprocessorParser.NOOPTIONS, 0); }
		public TerminalNode NOP() { return getToken(CobolPreprocessorParser.NOP, 0); }
		public TerminalNode NOPAC() { return getToken(CobolPreprocessorParser.NOPAC, 0); }
		public TerminalNode NOPARMCHECK() { return getToken(CobolPreprocessorParser.NOPARMCHECK, 0); }
		public TerminalNode NOPFD() { return getToken(CobolPreprocessorParser.NOPFD, 0); }
		public TerminalNode NOPRESERVE() { return getToken(CobolPreprocessorParser.NOPRESERVE, 0); }
		public TerminalNode NOPROLOG() { return getToken(CobolPreprocessorParser.NOPROLOG, 0); }
		public TerminalNode NORENT() { return getToken(CobolPreprocessorParser.NORENT, 0); }
		public TerminalNode NORULES() { return getToken(CobolPreprocessorParser.NORULES, 0); }
		public TerminalNode NOS() { return getToken(CobolPreprocessorParser.NOS, 0); }
		public TerminalNode NOSEP() { return getToken(CobolPreprocessorParser.NOSEP, 0); }
		public TerminalNode NOSEPARATE() { return getToken(CobolPreprocessorParser.NOSEPARATE, 0); }
		public TerminalNode NOSEQ() { return getToken(CobolPreprocessorParser.NOSEQ, 0); }
		public TerminalNode NOSEQUENCE() { return getToken(CobolPreprocessorParser.NOSEQUENCE, 0); }
		public TerminalNode NOSERV() { return getToken(CobolPreprocessorParser.NOSERV, 0); }
		public TerminalNode NOSERVICE() { return getToken(CobolPreprocessorParser.NOSERVICE, 0); }
		public TerminalNode NOSLACKBYTES() { return getToken(CobolPreprocessorParser.NOSLACKBYTES, 0); }
		public TerminalNode NOSLCKB() { return getToken(CobolPreprocessorParser.NOSLCKB, 0); }
		public TerminalNode NOSO() { return getToken(CobolPreprocessorParser.NOSO, 0); }
		public TerminalNode NOSPIE() { return getToken(CobolPreprocessorParser.NOSPIE, 0); }
		public TerminalNode NOSOURCE() { return getToken(CobolPreprocessorParser.NOSOURCE, 0); }
		public TerminalNode NOSQL() { return getToken(CobolPreprocessorParser.NOSQL, 0); }
		public TerminalNode NOSQLC() { return getToken(CobolPreprocessorParser.NOSQLC, 0); }
		public TerminalNode NOSQLCCSID() { return getToken(CobolPreprocessorParser.NOSQLCCSID, 0); }
		public TerminalNode NOSQLIMS() { return getToken(CobolPreprocessorParser.NOSQLIMS, 0); }
		public TerminalNode NOSSR() { return getToken(CobolPreprocessorParser.NOSSR, 0); }
		public TerminalNode NOSSRANGE() { return getToken(CobolPreprocessorParser.NOSSRANGE, 0); }
		public TerminalNode NOSTDTRUNC() { return getToken(CobolPreprocessorParser.NOSTDTRUNC, 0); }
		public TerminalNode NOSTGOPT() { return getToken(CobolPreprocessorParser.NOSTGOPT, 0); }
		public TerminalNode NOSUPP() { return getToken(CobolPreprocessorParser.NOSUPP, 0); }
		public TerminalNode NOSUPPRESS() { return getToken(CobolPreprocessorParser.NOSUPPRESS, 0); }
		public TerminalNode NOTERM() { return getToken(CobolPreprocessorParser.NOTERM, 0); }
		public TerminalNode NOTERMINAL() { return getToken(CobolPreprocessorParser.NOTERMINAL, 0); }
		public TerminalNode NOTEST() { return getToken(CobolPreprocessorParser.NOTEST, 0); }
		public TerminalNode NOTHREAD() { return getToken(CobolPreprocessorParser.NOTHREAD, 0); }
		public TerminalNode NOTRIG() { return getToken(CobolPreprocessorParser.NOTRIG, 0); }
		public TerminalNode NOUNRA() { return getToken(CobolPreprocessorParser.NOUNRA, 0); }
		public TerminalNode NOUNREFALL() { return getToken(CobolPreprocessorParser.NOUNREFALL, 0); }
		public TerminalNode NOUNREFSOURCE() { return getToken(CobolPreprocessorParser.NOUNREFSOURCE, 0); }
		public TerminalNode NOUNRS() { return getToken(CobolPreprocessorParser.NOUNRS, 0); }
		public TerminalNode NOVBREF() { return getToken(CobolPreprocessorParser.NOVBREF, 0); }
		public TerminalNode NOVOLATILE() { return getToken(CobolPreprocessorParser.NOVOLATILE, 0); }
		public TerminalNode NOWORD() { return getToken(CobolPreprocessorParser.NOWORD, 0); }
		public TerminalNode NOX() { return getToken(CobolPreprocessorParser.NOX, 0); }
		public TerminalNode NOXREF() { return getToken(CobolPreprocessorParser.NOXREF, 0); }
		public TerminalNode NOZC() { return getToken(CobolPreprocessorParser.NOZC, 0); }
		public TerminalNode NOZLEN() { return getToken(CobolPreprocessorParser.NOZLEN, 0); }
		public TerminalNode NOZON() { return getToken(CobolPreprocessorParser.NOZON, 0); }
		public TerminalNode NOZONECHECK() { return getToken(CobolPreprocessorParser.NOZONECHECK, 0); }
		public TerminalNode NOZWB() { return getToken(CobolPreprocessorParser.NOZWB, 0); }
		public TerminalNode NSEQ() { return getToken(CobolPreprocessorParser.NSEQ, 0); }
		public TerminalNode NSYMBOL() { return getToken(CobolPreprocessorParser.NSYMBOL, 0); }
		public TerminalNode NS() { return getToken(CobolPreprocessorParser.NS, 0); }
		public TerminalNode NUM() { return getToken(CobolPreprocessorParser.NUM, 0); }
		public TerminalNode NUMBER() { return getToken(CobolPreprocessorParser.NUMBER, 0); }
		public TerminalNode NUMCHECK() { return getToken(CobolPreprocessorParser.NUMCHECK, 0); }
		public TerminalNode NUMPROC() { return getToken(CobolPreprocessorParser.NUMPROC, 0); }
		public TerminalNode OBJ() { return getToken(CobolPreprocessorParser.OBJ, 0); }
		public TerminalNode OBJECT() { return getToken(CobolPreprocessorParser.OBJECT, 0); }
		public TerminalNode ON() { return getToken(CobolPreprocessorParser.ON, 0); }
		public TerminalNode OF() { return getToken(CobolPreprocessorParser.OF, 0); }
		public TerminalNode OFF() { return getToken(CobolPreprocessorParser.OFF, 0); }
		public TerminalNode OFFSET() { return getToken(CobolPreprocessorParser.OFFSET, 0); }
		public TerminalNode OMITODOMIN() { return getToken(CobolPreprocessorParser.OMITODOMIN, 0); }
		public TerminalNode OOM() { return getToken(CobolPreprocessorParser.OOM, 0); }
		public TerminalNode OPMARGINS() { return getToken(CobolPreprocessorParser.OPMARGINS, 0); }
		public TerminalNode OPSEQUENCE() { return getToken(CobolPreprocessorParser.OPSEQUENCE, 0); }
		public TerminalNode OPTIMIZE() { return getToken(CobolPreprocessorParser.OPTIMIZE, 0); }
		public TerminalNode OP() { return getToken(CobolPreprocessorParser.OP, 0); }
		public TerminalNode OPT() { return getToken(CobolPreprocessorParser.OPT, 0); }
		public TerminalNode OPTFILE() { return getToken(CobolPreprocessorParser.OPTFILE, 0); }
		public TerminalNode OPTIONS() { return getToken(CobolPreprocessorParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(CobolPreprocessorParser.OR, 0); }
		public TerminalNode OUT() { return getToken(CobolPreprocessorParser.OUT, 0); }
		public TerminalNode OUTDD() { return getToken(CobolPreprocessorParser.OUTDD, 0); }
		public TerminalNode PAC() { return getToken(CobolPreprocessorParser.PAC, 0); }
		public TerminalNode PARMCHECK() { return getToken(CobolPreprocessorParser.PARMCHECK, 0); }
		public TerminalNode PATH() { return getToken(CobolPreprocessorParser.PATH, 0); }
		public TerminalNode PFD() { return getToken(CobolPreprocessorParser.PFD, 0); }
		public TerminalNode PGMN() { return getToken(CobolPreprocessorParser.PGMN, 0); }
		public TerminalNode PGMNAME() { return getToken(CobolPreprocessorParser.PGMNAME, 0); }
		public TerminalNode PLUSCHAR() { return getToken(CobolPreprocessorParser.PLUSCHAR, 0); }
		public TerminalNode PPTDBG() { return getToken(CobolPreprocessorParser.PPTDBG, 0); }
		public TerminalNode PRESERVE() { return getToken(CobolPreprocessorParser.PRESERVE, 0); }
		public TerminalNode PROLOG() { return getToken(CobolPreprocessorParser.PROLOG, 0); }
		public TerminalNode QUALIFY() { return getToken(CobolPreprocessorParser.QUALIFY, 0); }
		public TerminalNode QUA() { return getToken(CobolPreprocessorParser.QUA, 0); }
		public TerminalNode QUOTE() { return getToken(CobolPreprocessorParser.QUOTE, 0); }
		public TerminalNode RENT() { return getToken(CobolPreprocessorParser.RENT, 0); }
		public TerminalNode REPLACING() { return getToken(CobolPreprocessorParser.REPLACING, 0); }
		public TerminalNode RMODE() { return getToken(CobolPreprocessorParser.RMODE, 0); }
		public TerminalNode RULES() { return getToken(CobolPreprocessorParser.RULES, 0); }
		public TerminalNode SEQ() { return getToken(CobolPreprocessorParser.SEQ, 0); }
		public TerminalNode SEQUENCE() { return getToken(CobolPreprocessorParser.SEQUENCE, 0); }
		public TerminalNode SEP() { return getToken(CobolPreprocessorParser.SEP, 0); }
		public TerminalNode SEPARATE() { return getToken(CobolPreprocessorParser.SEPARATE, 0); }
		public TerminalNode SERV() { return getToken(CobolPreprocessorParser.SERV, 0); }
		public TerminalNode SERVICE() { return getToken(CobolPreprocessorParser.SERVICE, 0); }
		public TerminalNode SHORT() { return getToken(CobolPreprocessorParser.SHORT, 0); }
		public TerminalNode SIZE() { return getToken(CobolPreprocessorParser.SIZE, 0); }
		public TerminalNode SLACKBYTES() { return getToken(CobolPreprocessorParser.SLACKBYTES, 0); }
		public TerminalNode SLCKB() { return getToken(CobolPreprocessorParser.SLCKB, 0); }
		public TerminalNode SO() { return getToken(CobolPreprocessorParser.SO, 0); }
		public TerminalNode SOURCE() { return getToken(CobolPreprocessorParser.SOURCE, 0); }
		public TerminalNode SP() { return getToken(CobolPreprocessorParser.SP, 0); }
		public TerminalNode SPACE() { return getToken(CobolPreprocessorParser.SPACE, 0); }
		public TerminalNode SPIE() { return getToken(CobolPreprocessorParser.SPIE, 0); }
		public TerminalNode SQL() { return getToken(CobolPreprocessorParser.SQL, 0); }
		public TerminalNode SQLC() { return getToken(CobolPreprocessorParser.SQLC, 0); }
		public TerminalNode SQLCCSID() { return getToken(CobolPreprocessorParser.SQLCCSID, 0); }
		public TerminalNode SQLIMS() { return getToken(CobolPreprocessorParser.SQLIMS, 0); }
		public TerminalNode SS() { return getToken(CobolPreprocessorParser.SS, 0); }
		public TerminalNode SSR() { return getToken(CobolPreprocessorParser.SSR, 0); }
		public TerminalNode SSRANGE() { return getToken(CobolPreprocessorParser.SSRANGE, 0); }
		public TerminalNode STD() { return getToken(CobolPreprocessorParser.STD, 0); }
		public TerminalNode STANDARD() { return getToken(CobolPreprocessorParser.STANDARD, 0); }
		public TerminalNode STATIC() { return getToken(CobolPreprocessorParser.STATIC, 0); }
		public TerminalNode STGOPT() { return getToken(CobolPreprocessorParser.STGOPT, 0); }
		public TerminalNode STRICT() { return getToken(CobolPreprocessorParser.STRICT, 0); }
		public TerminalNode SUCC() { return getToken(CobolPreprocessorParser.SUCC, 0); }
		public TerminalNode SUPP() { return getToken(CobolPreprocessorParser.SUPP, 0); }
		public TerminalNode SUPPRESS() { return getToken(CobolPreprocessorParser.SUPPRESS, 0); }
		public TerminalNode SYSEIB() { return getToken(CobolPreprocessorParser.SYSEIB, 0); }
		public TerminalNode SZ() { return getToken(CobolPreprocessorParser.SZ, 0); }
		public TerminalNode TERM() { return getToken(CobolPreprocessorParser.TERM, 0); }
		public TerminalNode TERMINAL() { return getToken(CobolPreprocessorParser.TERMINAL, 0); }
		public TerminalNode TEST() { return getToken(CobolPreprocessorParser.TEST, 0); }
		public TerminalNode THREAD() { return getToken(CobolPreprocessorParser.THREAD, 0); }
		public TerminalNode TITLE() { return getToken(CobolPreprocessorParser.TITLE, 0); }
		public TerminalNode TO() { return getToken(CobolPreprocessorParser.TO, 0); }
		public TerminalNode TRIG() { return getToken(CobolPreprocessorParser.TRIG, 0); }
		public TerminalNode TRUE() { return getToken(CobolPreprocessorParser.TRUE, 0); }
		public TerminalNode TRUNC() { return getToken(CobolPreprocessorParser.TRUNC, 0); }
		public TerminalNode UE() { return getToken(CobolPreprocessorParser.UE, 0); }
		public TerminalNode UNREF() { return getToken(CobolPreprocessorParser.UNREF, 0); }
		public TerminalNode UPPER() { return getToken(CobolPreprocessorParser.UPPER, 0); }
		public TerminalNode VBREF() { return getToken(CobolPreprocessorParser.VBREF, 0); }
		public TerminalNode VLR() { return getToken(CobolPreprocessorParser.VLR, 0); }
		public TerminalNode VOLATILE() { return getToken(CobolPreprocessorParser.VOLATILE, 0); }
		public TerminalNode VS() { return getToken(CobolPreprocessorParser.VS, 0); }
		public TerminalNode VSAMOPENFS() { return getToken(CobolPreprocessorParser.VSAMOPENFS, 0); }
		public TerminalNode WD() { return getToken(CobolPreprocessorParser.WD, 0); }
		public TerminalNode WHEN() { return getToken(CobolPreprocessorParser.WHEN, 0); }
		public TerminalNode XMLPARSE() { return getToken(CobolPreprocessorParser.XMLPARSE, 0); }
		public TerminalNode XMLSS() { return getToken(CobolPreprocessorParser.XMLSS, 0); }
		public TerminalNode XOPTS() { return getToken(CobolPreprocessorParser.XOPTS, 0); }
		public TerminalNode XREF() { return getToken(CobolPreprocessorParser.XREF, 0); }
		public TerminalNode YEARWINDOW() { return getToken(CobolPreprocessorParser.YEARWINDOW, 0); }
		public TerminalNode YW() { return getToken(CobolPreprocessorParser.YW, 0); }
		public TerminalNode ZC() { return getToken(CobolPreprocessorParser.ZC, 0); }
		public TerminalNode ZD() { return getToken(CobolPreprocessorParser.ZD, 0); }
		public TerminalNode ZLEN() { return getToken(CobolPreprocessorParser.ZLEN, 0); }
		public TerminalNode ZON() { return getToken(CobolPreprocessorParser.ZON, 0); }
		public TerminalNode ZONECHECK() { return getToken(CobolPreprocessorParser.ZONECHECK, 0); }
		public TerminalNode ZONEDATA() { return getToken(CobolPreprocessorParser.ZONEDATA, 0); }
		public TerminalNode ZWB() { return getToken(CobolPreprocessorParser.ZWB, 0); }
		public TerminalNode C_CHAR() { return getToken(CobolPreprocessorParser.C_CHAR, 0); }
		public TerminalNode D_CHAR() { return getToken(CobolPreprocessorParser.D_CHAR, 0); }
		public TerminalNode E_CHAR() { return getToken(CobolPreprocessorParser.E_CHAR, 0); }
		public TerminalNode F_CHAR() { return getToken(CobolPreprocessorParser.F_CHAR, 0); }
		public TerminalNode H_CHAR() { return getToken(CobolPreprocessorParser.H_CHAR, 0); }
		public TerminalNode I_CHAR() { return getToken(CobolPreprocessorParser.I_CHAR, 0); }
		public TerminalNode M_CHAR() { return getToken(CobolPreprocessorParser.M_CHAR, 0); }
		public TerminalNode N_CHAR() { return getToken(CobolPreprocessorParser.N_CHAR, 0); }
		public TerminalNode O_CHAR() { return getToken(CobolPreprocessorParser.O_CHAR, 0); }
		public TerminalNode Q_CHAR() { return getToken(CobolPreprocessorParser.Q_CHAR, 0); }
		public TerminalNode S_CHAR() { return getToken(CobolPreprocessorParser.S_CHAR, 0); }
		public TerminalNode U_CHAR() { return getToken(CobolPreprocessorParser.U_CHAR, 0); }
		public TerminalNode W_CHAR() { return getToken(CobolPreprocessorParser.W_CHAR, 0); }
		public TerminalNode X_CHAR() { return getToken(CobolPreprocessorParser.X_CHAR, 0); }
		public TerminalNode DIVISION() { return getToken(CobolPreprocessorParser.DIVISION, 0); }
		public TerminalNode LEADING() { return getToken(CobolPreprocessorParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(CobolPreprocessorParser.TRAILING, 0); }
		public TerminalNode BASIS() { return getToken(CobolPreprocessorParser.BASIS, 0); }
		public TerminalNode INSERT() { return getToken(CobolPreprocessorParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(CobolPreprocessorParser.DELETE, 0); }
		public CharDataKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDataKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCharDataKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCharDataKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCharDataKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDataKeywordContext charDataKeyword() throws RecognitionException {
		CharDataKeywordContext _localctx = new CharDataKeywordContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_charDataKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (PLUSCHAR - 454)) | (1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u020d\u0624\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00c8\n\2\f\2\16\2\u00cb"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u00d4\n\4\3\4\3\4\6\4\u00d8\n\4"+
		"\r\4\16\4\u00d9\3\5\3\5\3\5\3\5\5\5\u00e0\n\5\3\5\7\5\u00e3\n\5\f\5\16"+
		"\5\u00e6\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0107\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0115"+
		"\n\6\3\6\5\6\u0118\n\6\3\6\3\6\3\6\3\6\5\6\u011e\n\6\3\6\5\6\u0121\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0128\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\6\6\u0135\n\6\r\6\16\6\u0136\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0142\n\6\3\6\5\6\u0145\n\6\3\6\5\6\u0148\n\6\3\6\5\6\u014b\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0164\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u016c"+
		"\n\6\3\6\3\6\5\6\u0170\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0181\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u018b"+
		"\n\6\f\6\16\6\u018e\13\6\3\6\3\6\5\6\u0192\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u01ac\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01b5\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01c2\n\6\3\6\3\6\3\6\3\6\5\6\u01c8"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01d9"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u022b\n\6\f\6\16\6\u022e"+
		"\13\6\3\6\3\6\5\6\u0232\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0241\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0250\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u025d"+
		"\n\6\3\6\5\6\u0260\n\6\3\6\5\6\u0263\n\6\3\6\5\6\u0266\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0278\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u0280\n\6\f\6\16\6\u0283\13\6\3\6\3\6\5\6\u0287"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0290\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u029b\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u02a2\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02b0\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u02b8\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u02bf\n\6\f\6\16\6\u02c2"+
		"\13\6\3\6\3\6\5\6\u02c6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u02d1"+
		"\n\6\f\6\16\6\u02d4\13\6\3\6\3\6\5\6\u02d8\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6"+
		"\6\u02f1\n\6\r\6\16\6\u02f2\5\6\u02f5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u02ff\n\6\3\6\5\6\u0302\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0313\n\6\3\7\3\7\3\7\3\7\6\7\u0319\n\7"+
		"\r\7\16\7\u031a\3\7\5\7\u031e\n\7\3\7\5\7\u0321\n\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u032f\n\n\f\n\16\n\u0332\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u033d\n\n\3\n\3\n\3\n\5\n\u0342\n\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0352\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u035c\n\16\3"+
		"\17\3\17\7\17\u0360\n\17\f\17\16\17\u0363\13\17\3\17\3\17\3\20\3\20\6"+
		"\20\u0369\n\20\r\20\16\20\u036a\3\20\6\20\u036e\n\20\r\20\16\20\u036f"+
		"\3\20\3\20\5\20\u0374\n\20\3\21\3\21\6\21\u0378\n\21\r\21\16\21\u0379"+
		"\3\21\6\21\u037d\n\21\r\21\16\21\u037e\3\21\3\21\5\21\u0383\n\21\3\22"+
		"\3\22\3\22\3\22\6\22\u0389\n\22\r\22\16\22\u038a\3\22\3\22\5\22\u038f"+
		"\n\22\3\23\3\23\3\23\7\23\u0394\n\23\f\23\16\23\u0397\13\23\3\23\3\23"+
		"\5\23\u039b\n\23\7\23\u039d\n\23\f\23\16\23\u03a0\13\23\3\23\7\23\u03a3"+
		"\n\23\f\23\16\23\u03a6\13\23\3\23\3\23\3\24\3\24\3\24\5\24\u03ad\n\24"+
		"\3\24\7\24\u03b0\n\24\f\24\16\24\u03b3\13\24\3\24\3\24\7\24\u03b7\n\24"+
		"\f\24\16\24\u03ba\13\24\3\24\5\24\u03bd\n\24\3\25\3\25\5\25\u03c1\n\25"+
		"\3\26\3\26\7\26\u03c5\n\26\f\26\16\26\u03c8\13\26\3\26\3\26\6\26\u03cc"+
		"\n\26\r\26\16\26\u03cd\3\26\7\26\u03d1\n\26\f\26\16\26\u03d4\13\26\3\27"+
		"\3\27\3\27\7\27\u03d9\n\27\f\27\16\27\u03dc\13\27\3\27\5\27\u03df\n\27"+
		"\3\30\3\30\7\30\u03e3\n\30\f\30\16\30\u03e6\13\30\3\30\6\30\u03e9\n\30"+
		"\r\30\16\30\u03ea\3\30\7\30\u03ee\n\30\f\30\16\30\u03f1\13\30\3\30\3\30"+
		"\3\31\3\31\3\31\7\31\u03f8\n\31\f\31\16\31\u03fb\13\31\3\31\3\31\3\32"+
		"\5\32\u0400\n\32\3\32\3\32\7\32\u0404\n\32\f\32\16\32\u0407\13\32\3\32"+
		"\3\32\7\32\u040b\n\32\f\32\16\32\u040e\13\32\3\32\3\32\7\32\u0412\n\32"+
		"\f\32\16\32\u0415\13\32\3\32\5\32\u0418\n\32\3\32\7\32\u041b\n\32\f\32"+
		"\16\32\u041e\13\32\3\32\5\32\u0421\n\32\3\33\3\33\7\33\u0425\n\33\f\33"+
		"\16\33\u0428\13\33\3\33\3\33\5\33\u042c\n\33\3\34\3\34\7\34\u0430\n\34"+
		"\f\34\16\34\u0433\13\34\3\34\3\34\5\34\u0437\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u043d\n\35\3\36\3\36\3\36\3\36\5\36\u0443\n\36\3\37\3\37\5\37\u0447"+
		"\n\37\3 \3 \5 \u044b\n \3!\3!\3!\5!\u0450\n!\3\"\3\"\5\"\u0454\n\"\3\""+
		"\3\"\3#\3#\6#\u045a\n#\r#\16#\u045b\3$\3$\3$\3$\6$\u0462\n$\r$\16$\u0463"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u046f\n%\r%\16%\u0470\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\6%\u047d\n%\r%\16%\u047e\7%\u0481\n%\f%\16%\u0484\13%\3"+
		"&\3&\5&\u0488\n&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\5)\u0493\n)\3)\3)\3*\3*"+
		"\5*\u0499\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u04af\n+\3,\3,\3,\3,\3,\3,\3,\5,\u04b8\n,\3-\3-\3-\5-\u04bd\n-"+
		"\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\5\60\u04c9\n\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u04df\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u04e8\n\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\3:\3:"+
		"\3:\3:\3;\3;\3;\7;\u04ff\n;\f;\16;\u0502\13;\3;\3;\3<\3<\3<\3<\5<\u050a"+
		"\n<\3=\3=\3=\3=\3>\3>\3>\3>\5>\u0514\n>\3?\3?\3?\3?\3@\3@\3@\3@\5@\u051e"+
		"\n@\3@\3@\3A\3A\3A\7A\u0525\nA\fA\16A\u0528\13A\3A\3A\3A\5A\u052d\nA\3"+
		"A\5A\u0530\nA\3A\5A\u0533\nA\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3"+
		"E\3E\3F\3F\3F\3G\3G\3G\3G\3H\3H\3I\3I\5I\u054f\nI\3I\3I\3I\5I\u0554\n"+
		"I\7I\u0556\nI\fI\16I\u0559\13I\3J\3J\3J\3J\5J\u055f\nJ\3J\3J\5J\u0563"+
		"\nJ\3J\5J\u0566\nJ\3K\3K\3K\3K\5K\u056c\nK\3L\7L\u056f\nL\fL\16L\u0572"+
		"\13L\3L\3L\3L\6L\u0577\nL\rL\16L\u0578\3L\7L\u057c\nL\fL\16L\u057f\13"+
		"L\3L\3L\7L\u0583\nL\fL\16L\u0586\13L\3L\3L\7L\u058a\nL\fL\16L\u058d\13"+
		"L\3L\3L\7L\u0591\nL\fL\16L\u0594\13L\3M\3M\3N\3N\3O\3O\3O\3O\3P\3P\3P"+
		"\3Q\3Q\3Q\3R\3R\3R\5R\u05a7\nR\3S\3S\3S\3S\5S\u05ad\nS\3T\3T\3T\3T\3T"+
		"\5T\u05b4\nT\3T\3T\5T\u05b8\nT\3U\3U\3U\3V\5V\u05be\nV\3V\5V\u05c1\nV"+
		"\3V\3V\3V\3V\3V\3V\5V\u05c9\nV\3V\3V\3V\5V\u05ce\nV\3V\3V\3V\5V\u05d3"+
		"\nV\3V\3V\3V\3V\3V\5V\u05da\nV\3V\3V\5V\u05de\nV\3V\5V\u05e1\nV\3W\7W"+
		"\u05e4\nW\fW\16W\u05e7\13W\3W\3W\3W\7W\u05ec\nW\fW\16W\u05ef\13W\3W\3"+
		"W\7W\u05f3\nW\fW\16W\u05f6\13W\7W\u05f8\nW\fW\16W\u05fb\13W\3W\7W\u05fe"+
		"\nW\fW\16W\u0601\13W\6W\u0603\nW\rW\16W\u0604\3X\3X\3X\5X\u060a\nX\3Y"+
		"\3Y\3Y\5Y\u060f\nY\3Y\3Y\3Y\3Y\5Y\u0615\nY\3Z\3Z\3[\3[\5[\u061b\n[\3["+
		"\5[\u061e\n[\3[\3[\3\\\3\\\3\\\2\2]\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\2\u0086\3\2op\4\2\37\37\u0151\u0151\4\2\u0126\u0126\u018e"+
		"\u018e\4\2\24\24\26\26\6\2\'\'``\u01a1\u01a1\u01a3\u01a3\3\2\34\35\4\2"+
		"&&,,\4\2((\u01a1\u01a1\4\2**--\4\2++\60\60\3\2\62\63\4\2\65\65DD\4\2c"+
		"c\u00d7\u00d7\4\2\u011f\u011f\u0185\u0185\4\2::\u01a2\u01a2\4\2??HH\4"+
		"\2@@EE\6\2\'\'\u015c\u015c\u01a1\u01a1\u01ab\u01ab\3\2IJ\3\2LM\3\2^_\4"+
		"\2aagg\4\2cc\u01a4\u01a4\5\2\u01a3\u01a3\u01a6\u01a6\u01ab\u01ad\3\2\u01a5"+
		"\u01a7\b\2\67\67\u00a1\u00a1\u0172\u0172\u01a2\u01a2\u01a8\u01a8\u01ab"+
		"\u01ab\4\2\u0101\u0101\u0150\u0150\4\2\21\21\u0087\u0087\4\2nnrr\4\2\177"+
		"\177\u0178\u0178\3\2xy\3\2}~\7\2\61\61QQTTz|\u0189\u0189\4\2\u0082\u0082"+
		"\u0089\u0089\4\299kk\3\2\u0096\u0097\6\2((\u00aa\u00aa\u00af\u00af\u01a1"+
		"\u01a1\4\2\17\17\u00a5\u00a5\5\2\61\61QQ||\4\2\u00aa\u00aa\u00af\u00af"+
		"\5\2\u01a3\u01a3\u01ab\u01ab\u01ad\u01ad\3\2\u00b6\u00b7\4\2\u00b9\u00b9"+
		"\u00c5\u00c5\4\2\u00b8\u00b8\u00bd\u00bd\3\2\u00be\u00bf\3\2\u00c3\u00c4"+
		"\4\2\u00c0\u00c0\u00c6\u00c6\3\2\u00c8\u00c9\3\2\u00d2\u00d3\4\2\u00d5"+
		"\u00d5\u00dc\u00dc\4\2\u00d4\u00d4\u00d7\u00d7\3\2\u00df\u00e0\3\2\u00e4"+
		"\u00e5\3\2\u00ee\u00ef\3\2\u00f1\u00f2\3\2\u00f3\u00f4\3\2\u00f6\u00f7"+
		"\3\2\u00fa\u00fb\4\2\u0108\u0108\u0117\u0117\3\2\u0109\u010a\4\2\u0105"+
		"\u0105\u010e\u010e\3\2\u0111\u0112\3\2\u0114\u0115\4\2\u010d\u010d\u0118"+
		"\u0118\3\2\u0119\u011a\3\2\u011b\u011c\3\2\u0127\u0128\4\2\u0130\u0130"+
		"\u0132\u0132\4\2\66\66\u009d\u009e\3\2\u0129\u012a\4\2\u012b\u012b\u012e"+
		"\u012e\3\2\u0133\u0134\4\2\u00a0\u00a0\u0135\u0135\5\2\u0098\u0098\u0100"+
		"\u0100\u014c\u014c\3\2\u0137\u0138\3\2\u013a\u013b\4\2\u0142\u0142\u0144"+
		"\u0144\5\2hh\u0176\u0176\u01b6\u01b6\3\2\u0146\u0147\4\2\u0149\u0149\u014b"+
		"\u014b\4\2\13\13\u009b\u009b\3\2\u014e\u014f\n\2##\'\'\u008c\u008e\u0091"+
		"\u0091\u0099\u0099\u018b\u018b\u01a7\u01a7\u01ac\u01ac\3\2\u0153\u0154"+
		"\4\2\u0155\u0155\u01aa\u01aa\3\2\u015e\u015f\3\2\u0160\u0161\4\2\u0163"+
		"\u0163\u017e\u017e\4\2\u0166\u0166\u01ab\u01ab\3\2\u016b\u016c\3\2\u0173"+
		"\u0174\4\2\u0171\u0171\u0177\u0177\3\2\u017b\u017c\3\2\u017f\u0180\5\2"+
		"\32\32\u0142\u0142\u0176\u0176\6\2\'\'\u0175\u0175\u01a1\u01a1\u01ab\u01ab"+
		"\3\2\u018f\u0190\6\2\'\'\u017a\u017a\u01a1\u01a1\u01ab\u01ab\3\2\u0191"+
		"\u0192\4\2\u0193\u0193\u0196\u0196\6\2\'\'\u0194\u0194\u01a1\u01a1\u01ae"+
		"\u01ae\4\2\u0197\u0197\u01ae\u01ae\4\2hh\u0162\u0162\3\2\u0198\u0199\4"+
		"\2\u019a\u019a\u019e\u019e\4\2\u019b\u019b\u019f\u019f\3\2;<\4\2\u01a1"+
		"\u01ae\u01b8\u01b8\b\2\"\"\61\61ef\u00ad\u00ad\u00b5\u00b5\u00da\u00db"+
		"\4\2\u0120\u0120\u0187\u0187\7\2\20\20\177\177\u0081\u0081\u00a6\u00a6"+
		"\u0178\u0179\21\2RSWX\u0080\u0081\u0092\u0092\u00cc\u00cd\u00cf\u00d0"+
		"\u00e6\u00e7\u00ec\u00ec\u00f5\u00f5\u00f8\u00f8\u010b\u010c\u0121\u0124"+
		"\u013d\u013e\u0164\u0165\u018a\u018a\6\2\13\13\u009b\u009b\u012c\u012c"+
		"\u019c\u019c\3\2\u015c\u015d\4\2GG\u00c2\u00c2\4\2qq\u0139\u0139\4\2\u0083"+
		"\u0083\u0184\u0184\3\2\u016e\u0170\3\2\u01b4\u01b6\3\2\u01d3\u01d4\4\2"+
		"\u01db\u01dc\u01fc\u01fc\3\2\u01f0\u01f1\4\2\u01b8\u01b8\u01d6\u01d6\4"+
		"\2\u01b8\u01b8\u01cf\u01cf\5\2\u01b8\u01b8\u01cf\u01cf\u01fa\u01fa\4\2"+
		"\u01e3\u01e3\u01e7\u01e7\r\2<<\u0166\u0166\u01d2\u01d2\u01d7\u01d7\u01d9"+
		"\u01d9\u01e4\u01e5\u01eb\u01eb\u01ed\u01ed\u01f8\u01f8\u01fa\u01fa\u0203"+
		"\u0203\5\2\u01b6\u01b6\u01b8\u01b8\u01ce\u01ce\4\2\u01c4\u01c4\u01c8\u01ca"+
		"\3\2\u01ff\u0200\4\2\u01d1\u01d1\u01f2\u01f2\'\2\13\36 !#(*=?TVY]acdg"+
		"nquwwz\u0080\u0082\u0083\u0085\u008f\u0091\u00ac\u00ae\u00b4\u00b6\u00d9"+
		"\u00dc\u00e3\u00e6\u00e6\u00e8\u011f\u0121\u0126\u0128\u014a\u014c\u0150"+
		"\u0152\u0156\u0158\u0159\u015b\u016d\u0171\u0178\u017a\u0186\u0189\u0191"+
		"\u0193\u0195\u0197\u01ae\u01b0\u01b0\u01c8\u01c8\u01f2\u01f2\u01fc\u01fc"+
		"\u0201\u0202\u0206\u0206\2\u0795\2\u00c9\3\2\2\2\4\u00ce\3\2\2\2\6\u00d1"+
		"\3\2\2\2\b\u00db\3\2\2\2\n\u0312\3\2\2\2\f\u0314\3\2\2\2\16\u0324\3\2"+
		"\2\2\20\u0326\3\2\2\2\22\u0341\3\2\2\2\24\u0343\3\2\2\2\26\u0345\3\2\2"+
		"\2\30\u0347\3\2\2\2\32\u035b\3\2\2\2\34\u035d\3\2\2\2\36\u0366\3\2\2\2"+
		" \u0375\3\2\2\2\"\u0384\3\2\2\2$\u0390\3\2\2\2&\u03ac\3\2\2\2(\u03c0\3"+
		"\2\2\2*\u03c2\3\2\2\2,\u03d5\3\2\2\2.\u03e0\3\2\2\2\60\u03f4\3\2\2\2\62"+
		"\u03ff\3\2\2\2\64\u0422\3\2\2\2\66\u042d\3\2\2\28\u043c\3\2\2\2:\u0442"+
		"\3\2\2\2<\u0444\3\2\2\2>\u0448\3\2\2\2@\u044c\3\2\2\2B\u0451\3\2\2\2D"+
		"\u0459\3\2\2\2F\u0461\3\2\2\2H\u046e\3\2\2\2J\u0487\3\2\2\2L\u0489\3\2"+
		"\2\2N\u048b\3\2\2\2P\u048d\3\2\2\2R\u0498\3\2\2\2T\u04ae\3\2\2\2V\u04b7"+
		"\3\2\2\2X\u04b9\3\2\2\2Z\u04be\3\2\2\2\\\u04c2\3\2\2\2^\u04c8\3\2\2\2"+
		"`\u04ca\3\2\2\2b\u04cd\3\2\2\2d\u04d0\3\2\2\2f\u04d4\3\2\2\2h\u04d8\3"+
		"\2\2\2j\u04e0\3\2\2\2l\u04e9\3\2\2\2n\u04ee\3\2\2\2p\u04f3\3\2\2\2r\u04f7"+
		"\3\2\2\2t\u04fb\3\2\2\2v\u0505\3\2\2\2x\u050b\3\2\2\2z\u050f\3\2\2\2|"+
		"\u0515\3\2\2\2~\u0519\3\2\2\2\u0080\u0521\3\2\2\2\u0082\u0534\3\2\2\2"+
		"\u0084\u0536\3\2\2\2\u0086\u053b\3\2\2\2\u0088\u053e\3\2\2\2\u008a\u0543"+
		"\3\2\2\2\u008c\u0546\3\2\2\2\u008e\u054a\3\2\2\2\u0090\u054e\3\2\2\2\u0092"+
		"\u055a\3\2\2\2\u0094\u056b\3\2\2\2\u0096\u0576\3\2\2\2\u0098\u0595\3\2"+
		"\2\2\u009a\u0597\3\2\2\2\u009c\u0599\3\2\2\2\u009e\u059d\3\2\2\2\u00a0"+
		"\u05a0\3\2\2\2\u00a2\u05a6\3\2\2\2\u00a4\u05a8\3\2\2\2\u00a6\u05ae\3\2"+
		"\2\2\u00a8\u05b9\3\2\2\2\u00aa\u05bd\3\2\2\2\u00ac\u0602\3\2\2\2\u00ae"+
		"\u0609\3\2\2\2\u00b0\u060e\3\2\2\2\u00b2\u0616\3\2\2\2\u00b4\u0618\3\2"+
		"\2\2\u00b6\u0621\3\2\2\2\u00b8\u00c8\5\4\3\2\u00b9\u00c8\5\6\4\2\u00ba"+
		"\u00c8\5R*\2\u00bb\u00c8\5\34\17\2\u00bc\u00c8\5$\23\2\u00bd\u00c8\5\36"+
		"\20\2\u00be\u00c8\5 \21\2\u00bf\u00c8\5\"\22\2\u00c0\u00c8\5\60\31\2\u00c1"+
		"\u00c8\5,\27\2\u00c2\u00c8\5<\37\2\u00c3\u00c8\5> \2\u00c4\u00c8\5@!\2"+
		"\u00c5\u00c8\5H%\2\u00c6\u00c8\7\u01bb\2\2\u00c7\u00b8\3\2\2\2\u00c7\u00b9"+
		"\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7"+
		"\u00bd\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2"+
		"\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7\2\2\3\u00cd\3\3\2\2\2\u00ce\u00cf\t\2\2\2"+
		"\u00cf\u00d0\7A\2\2\u00d0\5\3\2\2\2\u00d1\u00d7\t\3\2\2\u00d2\u00d4\7"+
		"\u01b0\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d8\5\n\6\2\u00d6\u00d8\5\b\5\2\u00d7\u00d3\3\2\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\7\3\2\2\2\u00db\u00dc\7\u0195\2\2\u00dc\u00dd\7\u0090\2\2\u00dd\u00e4"+
		"\5\n\6\2\u00de\u00e0\7\u01b0\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2"+
		"\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\5\n\6\2\u00e2\u00df\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\u015a\2\2\u00e8\t\3\2\2\2\u00e9\u0313\7\f"+
		"\2\2\u00ea\u0313\7\r\2\2\u00eb\u00ec\7\16\2\2\u00ec\u00ed\7\u0090\2\2"+
		"\u00ed\u00ee\t\4\2\2\u00ee\u0313\7\u015a\2\2\u00ef\u0313\7\23\2\2\u00f0"+
		"\u00f1\7\25\2\2\u00f1\u00f2\7\u0090\2\2\u00f2\u00f3\5L\'\2\u00f3\u00f4"+
		"\7\u015a\2\2\u00f4\u0313\3\2\2\2\u00f5\u00f6\t\5\2\2\u00f6\u00f7\7\u0090"+
		"\2\2\u00f7\u00f8\t\6\2\2\u00f8\u0313\7\u015a\2\2\u00f9\u0313\7\30\2\2"+
		"\u00fa\u0313\7\33\2\2\u00fb\u00fc\t\7\2\2\u00fc\u00fd\7\u0090\2\2\u00fd"+
		"\u00fe\5L\'\2\u00fe\u00ff\7\u015a\2\2\u00ff\u0313\3\2\2\2\u0100\u0313"+
		"\7 \2\2\u0101\u0106\7!\2\2\u0102\u0103\7\u0090\2\2\u0103\u0104\5L\'\2"+
		"\u0104\u0105\7\u015a\2\2\u0105\u0107\3\2\2\2\u0106\u0102\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0313\3\2\2\2\u0108\u0313\7$\2\2\u0109\u0313\7%\2"+
		"\2\u010a\u010b\t\b\2\2\u010b\u010c\7\u0090\2\2\u010c\u010d\5L\'\2\u010d"+
		"\u010e\7\u015a\2\2\u010e\u0313\3\2\2\2\u010f\u0313\t\t\2\2\u0110\u0111"+
		"\t\n\2\2\u0111\u0114\7\u0090\2\2\u0112\u0115\7\u01b8\2\2\u0113\u0115\5"+
		"L\'\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u011d\3\2\2\2\u0116\u0118\7\u01b0\2\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7F\2\2\u011a\u011b\7\u0090\2"+
		"\2\u011b\u011c\7\u01b9\2\2\u011c\u011e\7\u015a\2\2\u011d\u0117\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0127\3\2\2\2\u011f\u0121\7\u01b0\2\2\u0120"+
		"\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\u014a"+
		"\2\2\u0123\u0124\7\u0090\2\2\u0124\u0125\5L\'\2\u0125\u0126\7\u015a\2"+
		"\2\u0126\u0128\3\2\2\2\u0127\u0120\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0313\7\u015a\2\2\u012a\u012b\t\13\2\2\u012b\u012c\7\u0090"+
		"\2\2\u012c\u012d\5L\'\2\u012d\u012e\7\u015a\2\2\u012e\u0313\3\2\2\2\u012f"+
		"\u0313\7.\2\2\u0130\u0313\7/\2\2\u0131\u0132\t\f\2\2\u0132\u0134\7\u0090"+
		"\2\2\u0133\u0135\7\u01be\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0313\7\u015a"+
		"\2\2\u0139\u013a\7\64\2\2\u013a\u013b\7\u0090\2\2\u013b\u013c\5L\'\2\u013c"+
		"\u013d\7\u015a\2\2\u013d\u0313\3\2\2\2\u013e\u014a\t\r\2\2\u013f\u0141"+
		"\7\u0090\2\2\u0140\u0142\t\16\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0144\3\2\2\2\u0143\u0145\7\u01b0\2\2\u0144\u0143\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\t\17\2\2\u0147\u0146\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\7\u015a\2\2"+
		"\u014a\u013f\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0313\3\2\2\2\u014c\u0313"+
		"\7\66\2\2\u014d\u0313\t\20\2\2\u014e\u0313\78\2\2\u014f\u0313\5\f\7\2"+
		"\u0150\u0313\t\21\2\2\u0151\u0152\t\22\2\2\u0152\u0153\7\u0090\2\2\u0153"+
		"\u0154\t\23\2\2\u0154\u0313\7\u015a\2\2\u0155\u0313\7C\2\2\u0156\u0313"+
		"\t\24\2\2\u0157\u0313\t\25\2\2\u0158\u0313\7N\2\2\u0159\u0313\7V\2\2\u015a"+
		"\u0313\7]\2\2\u015b\u0313\t\26\2\2\u015c\u0313\t\27\2\2\u015d\u0313\7"+
		"b\2\2\u015e\u015f\t\30\2\2\u015f\u0160\7\u0090\2\2\u0160\u0163\t\31\2"+
		"\2\u0161\u0162\7\u01b0\2\2\u0162\u0164\t\31\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0313\7\u015a\2\2\u0166\u0167"+
		"\7d\2\2\u0167\u0168\7\u0090\2\2\u0168\u016b\t\32\2\2\u0169\u016a\7\u01b0"+
		"\2\2\u016a\u016c\t\33\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016e\7\u01b0\2\2\u016e\u0170\7\u01a9\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0313\7\u015a\2"+
		"\2\u0172\u0313\7i\2\2\u0173\u0313\7j\2\2\u0174\u0175\7l\2\2\u0175\u0176"+
		"\7\u0090\2\2\u0176\u0177\t\34\2\2\u0177\u0313\7\u015a\2\2\u0178\u0179"+
		"\7s\2\2\u0179\u017a\7\u0090\2\2\u017a\u017b\t\35\2\2\u017b\u0313\7\u015a"+
		"\2\2\u017c\u0180\t\36\2\2\u017d\u017e\7\u0090\2\2\u017e\u017f\t\37\2\2"+
		"\u017f\u0181\7\u015a\2\2\u0180\u017d\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0313\3\2\2\2\u0182\u0313\7t\2\2\u0183\u0313\7v\2\2\u0184\u0313\7u\2"+
		"\2\u0185\u0191\t \2\2\u0186\u0187\7\u0090\2\2\u0187\u018c\5\20\t\2\u0188"+
		"\u0189\7\u01b0\2\2\u0189\u018b\5\20\t\2\u018a\u0188\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0190\7\u015a\2\2\u0190\u0192\3\2\2\2\u0191\u0186"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0313\3\2\2\2\u0193\u0194\t!\2\2\u0194"+
		"\u0195\7\u0090\2\2\u0195\u0196\t\"\2\2\u0196\u0313\7\u015a\2\2\u0197\u0313"+
		"\7\u0084\2\2\u0198\u0313\7\u0085\2\2\u0199\u0313\7\u0086\2\2\u019a\u0313"+
		"\7\u0088\2\2\u019b\u019c\t#\2\2\u019c\u019d\7\u0090\2\2\u019d\u019e\5"+
		"L\'\2\u019e\u019f\7\u015a\2\2\u019f\u0313\3\2\2\2\u01a0\u0313\7\u008a"+
		"\2\2\u01a1\u0313\7\u008b\2\2\u01a2\u01a3\7\u008f\2\2\u01a3\u01a4\7\u0090"+
		"\2\2\u01a4\u01a5\5L\'\2\u01a5\u01a6\7\u015a\2\2\u01a6\u0313\3\2\2\2\u01a7"+
		"\u01ab\7\u0093\2\2\u01a8\u01a9\7\u0090\2\2\u01a9\u01aa\t$\2\2\u01aa\u01ac"+
		"\7\u015a\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u0313\3\2\2"+
		"\2\u01ad\u01ae\7\u0094\2\2\u01ae\u01af\7\u0090\2\2\u01af\u01b0\5L\'\2"+
		"\u01b0\u01b1\7\u01b0\2\2\u01b1\u01b4\5L\'\2\u01b2\u01b3\7\u01b0\2\2\u01b3"+
		"\u01b5\5L\'\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b7\7\u015a\2\2\u01b7\u0313\3\2\2\2\u01b8\u01b9\7\u009a\2"+
		"\2\u01b9\u01ba\7\u0090\2\2\u01ba\u01bb\5L\'\2\u01bb\u01bc\7\u015a\2\2"+
		"\u01bc\u0313\3\2\2\2\u01bd\u01c1\t%\2\2\u01be\u01bf\7\u0090\2\2\u01bf"+
		"\u01c0\t&\2\2\u01c0\u01c2\7\u015a\2\2\u01c1\u01be\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u0313\3\2\2\2\u01c3\u01c7\7\u009c\2\2\u01c4\u01c5\7\u0090"+
		"\2\2\u01c5\u01c6\t\'\2\2\u01c6\u01c8\7\u015a\2\2\u01c7\u01c4\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u0313\3\2\2\2\u01c9\u01ca\7\u009f\2\2\u01ca\u01cb"+
		"\7\u0090\2\2\u01cb\u01cc\t(\2\2\u01cc\u0313\7\u015a\2\2\u01cd\u0313\7"+
		"\u00a3\2\2\u01ce\u0313\7\u00a4\2\2\u01cf\u0313\7\u00a7\2\2\u01d0\u0313"+
		"\7\u00a9\2\2\u01d1\u0313\7\u00ab\2\2\u01d2\u0313\7\u00ac\2\2\u01d3\u0313"+
		"\7\u00ae\2\2\u01d4\u01d8\t)\2\2\u01d5\u01d6\7\u0090\2\2\u01d6\u01d7\t"+
		"*\2\2\u01d7\u01d9\7\u015a\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u0313\3\2\2\2\u01da\u0313\7\u00b0\2\2\u01db\u0313\7\u00b2\2\2\u01dc"+
		"\u0313\7\u00b1\2\2\u01dd\u0313\7\u00b4\2\2\u01de\u0313\7\u00b3\2\2\u01df"+
		"\u0313\t+\2\2\u01e0\u0313\t,\2\2\u01e1\u0313\7\u00ba\2\2\u01e2\u0313\7"+
		"\u00bc\2\2\u01e3\u0313\t-\2\2\u01e4\u0313\t.\2\2\u01e5\u0313\7\u00c1\2"+
		"\2\u01e6\u0313\7\u00bb\2\2\u01e7\u0313\t/\2\2\u01e8\u0313\t\60\2\2\u01e9"+
		"\u0313\t\61\2\2\u01ea\u0313\7\u00ca\2\2\u01eb\u0313\7\u00ce\2\2\u01ec"+
		"\u0313\7\u00d1\2\2\u01ed\u0313\t\62\2\2\u01ee\u0313\t\63\2\2\u01ef\u0313"+
		"\7\u00d6\2\2\u01f0\u0313\t\64\2\2\u01f1\u0313\7\u00d8\2\2\u01f2\u0313"+
		"\7\u00d9\2\2\u01f3\u0313\7\u00dd\2\2\u01f4\u0313\t\65\2\2\u01f5\u0313"+
		"\7\u00e1\2\2\u01f6\u0313\7\u00e2\2\2\u01f7\u0313\7\u00e3\2\2\u01f8\u0313"+
		"\t\66\2\2\u01f9\u0313\7\u00e8\2\2\u01fa\u0313\7\u00e9\2\2\u01fb\u0313"+
		"\7\u00ea\2\2\u01fc\u0313\7\u00eb\2\2\u01fd\u0313\7\u00ed\2\2\u01fe\u0313"+
		"\t\67\2\2\u01ff\u0313\7\u00f0\2\2\u0200\u0313\t8\2\2\u0201\u0313\t9\2"+
		"\2\u0202\u0313\t:\2\2\u0203\u0313\7\u00f9\2\2\u0204\u0313\t;\2\2\u0205"+
		"\u0313\7\u00fc\2\2\u0206\u0313\7\u00fd\2\2\u0207\u0313\7\u00ff\2\2\u0208"+
		"\u0313\7\u0102\2\2\u0209\u0313\7\u0103\2\2\u020a\u0313\7\u0104\2\2\u020b"+
		"\u0313\t<\2\2\u020c\u0313\t=\2\2\u020d\u0313\t>\2\2\u020e\u0313\7\u010f"+
		"\2\2\u020f\u0313\7\u0110\2\2\u0210\u0313\7\u0113\2\2\u0211\u0313\t?\2"+
		"\2\u0212\u0313\t@\2\2\u0213\u0313\7\u0116\2\2\u0214\u0313\tA\2\2\u0215"+
		"\u0313\tB\2\2\u0216\u0313\tC\2\2\u0217\u0313\7\u011d\2\2\u0218\u0313\7"+
		"\u011e\2\2\u0219\u0313\7\u0125\2\2\u021a\u0313\tD\2\2\u021b\u0313\7\u0131"+
		"\2\2\u021c\u021d\tE\2\2\u021d\u021e\7\u0090\2\2\u021e\u021f\tF\2\2\u021f"+
		"\u0313\7\u015a\2\2\u0220\u0313\7\u0125\2\2\u0221\u0313\tG\2\2\u0222\u0313"+
		"\tH\2\2\u0223\u0313\7\u012f\2\2\u0224\u0313\tI\2\2\u0225\u0231\tJ\2\2"+
		"\u0226\u0227\7\u0090\2\2\u0227\u022c\5\22\n\2\u0228\u0229\7\u01b0\2\2"+
		"\u0229\u022b\5\22\n\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0230\7\u015a\2\2\u0230\u0232\3\2\2\2\u0231\u0226\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0313\3\2\2\2\u0233\u0234\7\u0136\2\2\u0234\u0235\7\u0090"+
		"\2\2\u0235\u0236\tK\2\2\u0236\u0313\7\u015a\2\2\u0237\u0313\tL\2\2\u0238"+
		"\u0313\tM\2\2\u0239\u023a\7\u0140\2\2\u023a\u023b\7\u0090\2\2\u023b\u023c"+
		"\5L\'\2\u023c\u023d\7\u01b0\2\2\u023d\u0240\5L\'\2\u023e\u023f\7\u01b0"+
		"\2\2\u023f\u0241\5L\'\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\7\u015a\2\2\u0243\u0313\3\2\2\2\u0244\u0245"+
		"\7\u0141\2\2\u0245\u0246\7\u0090\2\2\u0246\u0247\5L\'\2\u0247\u0248\7"+
		"\u01b0\2\2\u0248\u0249\5L\'\2\u0249\u024a\7\u015a\2\2\u024a\u0313\3\2"+
		"\2\2\u024b\u024f\tN\2\2\u024c\u024d\7\u0090\2\2\u024d\u024e\tO\2\2\u024e"+
		"\u0250\7\u015a\2\2\u024f\u024c\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0313"+
		"\3\2\2\2\u0251\u0313\7\u0143\2\2\u0252\u0313\7\u0145\2\2\u0253\u0313\7"+
		"\u013f\2\2\u0254\u0255\tP\2\2\u0255\u0256\7\u0090\2\2\u0256\u0257\5J&"+
		"\2\u0257\u0258\7\u015a\2\2\u0258\u0313\3\2\2\2\u0259\u0265\tQ\2\2\u025a"+
		"\u025c\7\u0090\2\2\u025b\u025d\tR\2\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u0262\3\2\2\2\u025e\u0260\7\u01b0\2\2\u025f\u025e\3\2\2"+
		"\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\5L\'\2\u0262\u025f"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\7\u015a\2"+
		"\2\u0265\u025a\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0313\3\2\2\2\u0267\u0268"+
		"\tS\2\2\u0268\u0269\7\u0090\2\2\u0269\u026a\tT\2\2\u026a\u0313\7\u015a"+
		"\2\2\u026b\u0313\7\u0152\2\2\u026c\u026d\tU\2\2\u026d\u026e\7\u0090\2"+
		"\2\u026e\u026f\t\6\2\2\u026f\u0313\7\u015a\2\2\u0270\u0313\tV\2\2\u0271"+
		"\u0313\7\u0156\2\2\u0272\u0273\7\u0159\2\2\u0273\u0277\7\u0090\2\2\u0274"+
		"\u0278\7\22\2\2\u0275\u0278\7\27\2\2\u0276\u0278\5L\'\2\u0277\u0274\3"+
		"\2\2\2\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u0313\7\u015a\2\2\u027a\u0286\7\u015b\2\2\u027b\u027c\7\u0090\2\2\u027c"+
		"\u0281\5\26\f\2\u027d\u027e\7\u01b0\2\2\u027e\u0280\5\26\f\2\u027f\u027d"+
		"\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\7\u015a\2\2\u0285\u0287"+
		"\3\2\2\2\u0286\u027b\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0313\3\2\2\2\u0288"+
		"\u028f\tW\2\2\u0289\u028a\7\u0090\2\2\u028a\u028b\5L\'\2\u028b\u028c\7"+
		"\u01b0\2\2\u028c\u028d\5L\'\2\u028d\u028e\7\u015a\2\2\u028e\u0290\3\2"+
		"\2\2\u028f\u0289\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0313\3\2\2\2\u0291"+
		"\u0292\tX\2\2\u0292\u0293\7\u0090\2\2\u0293\u0294\5L\'\2\u0294\u0295\7"+
		"\u015a\2\2\u0295\u0313\3\2\2\2\u0296\u0297\tY\2\2\u0297\u029a\7\u0090"+
		"\2\2\u0298\u029b\7\u0095\2\2\u0299\u029b\5L\'\2\u029a\u0298\3\2\2\2\u029a"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u0313\7\u015a\2\2\u029d\u02a1"+
		"\tZ\2\2\u029e\u029f\7\u0090\2\2\u029f\u02a0\t$\2\2\u02a0\u02a2\7\u015a"+
		"\2\2\u02a1\u029e\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u0313\3\2\2\2\u02a3"+
		"\u0313\7\u0167\2\2\u02a4\u02a5\7\u0168\2\2\u02a5\u02a6\7\u0090\2\2\u02a6"+
		"\u02a7\5L\'\2\u02a7\u02a8\7\u015a\2\2\u02a8\u0313\3\2\2\2\u02a9\u0313"+
		"\7\u0169\2\2\u02aa\u02af\7\u016a\2\2\u02ab\u02ac\7\u0090\2\2\u02ac\u02ad"+
		"\5L\'\2\u02ad\u02ae\7\u015a\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ab\3\2\2"+
		"\2\u02af\u02b0\3\2\2\2\u02b0\u0313\3\2\2\2\u02b1\u0313\t[\2\2\u02b2\u02b7"+
		"\7\u016d\2\2\u02b3\u02b4\7\u0090\2\2\u02b4\u02b5\5L\'\2\u02b5\u02b6\7"+
		"\u015a\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b7\u02b8\3\2\2\2"+
		"\u02b8\u0313\3\2\2\2\u02b9\u02c5\t\\\2\2\u02ba\u02bb\7\u0090\2\2\u02bb"+
		"\u02c0\5\30\r\2\u02bc\u02bd\7\u01b0\2\2\u02bd\u02bf\5\30\r\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7\u015a\2\2\u02c4\u02c6"+
		"\3\2\2\2\u02c5\u02ba\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u0313\3\2\2\2\u02c7"+
		"\u0313\t]\2\2\u02c8\u0313\t^\2\2\u02c9\u0313\7\u017d\2\2\u02ca\u0313\t"+
		"_\2\2\u02cb\u02d7\7\u0181\2\2\u02cc\u02cd\7\u0090\2\2\u02cd\u02d2\5\32"+
		"\16\2\u02ce\u02cf\7\u01b0\2\2\u02cf\u02d1\5\32\16\2\u02d0\u02ce\3\2\2"+
		"\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5"+
		"\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\7\u015a\2\2\u02d6\u02d8\3\2\2"+
		"\2\u02d7\u02cc\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u0313\3\2\2\2\u02d9\u0313"+
		"\7\u0182\2\2\u02da\u02db\7\u0186\2\2\u02db\u02dc\7\u0090\2\2\u02dc\u02dd"+
		"\t`\2\2\u02dd\u0313\7\u015a\2\2\u02de\u02df\7\u0188\2\2\u02df\u02e0\7"+
		"\u0090\2\2\u02e0\u02e1\5L\'\2\u02e1\u02e2\7\u015a\2\2\u02e2\u0313\3\2"+
		"\2\2\u02e3\u0313\7\u018c\2\2\u02e4\u02e5\7\u018d\2\2\u02e5\u02e6\7\u0090"+
		"\2\2\u02e6\u02e7\ta\2\2\u02e7\u0313\7\u015a\2\2\u02e8\u02e9\tb\2\2\u02e9"+
		"\u02ea\7\u0090\2\2\u02ea\u02eb\tc\2\2\u02eb\u0313\7\u015a\2\2\u02ec\u02ed"+
		"\td\2\2\u02ed\u02f4\7\u0090\2\2\u02ee\u02f5\5J&\2\u02ef\u02f1\7\u01be"+
		"\2\2\u02f0\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02ee\3\2\2\2\u02f4\u02f0\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u0313\7\u015a\2\2\u02f7\u02f8\te\2\2\u02f8"+
		"\u02f9\7\u0090\2\2\u02f9\u02fa\tf\2\2\u02fa\u0313\7\u015a\2\2\u02fb\u0301"+
		"\tg\2\2\u02fc\u02fe\7\u0090\2\2\u02fd\u02ff\th\2\2\u02fe\u02fd\3\2\2\2"+
		"\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\7\u015a\2\2\u0301"+
		"\u02fc\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0313\3\2\2\2\u0303\u0304\ti"+
		"\2\2\u0304\u0305\7\u0090\2\2\u0305\u0306\5L\'\2\u0306\u0307\7\u015a\2"+
		"\2\u0307\u0313\3\2\2\2\u0308\u0309\tj\2\2\u0309\u030a\7\u0090\2\2\u030a"+
		"\u030b\tR\2\2\u030b\u0313\7\u015a\2\2\u030c\u030d\tk\2\2\u030d\u030e\7"+
		"\u0090\2\2\u030e\u030f\tK\2\2\u030f\u0313\7\u015a\2\2\u0310\u0313\7\u01a0"+
		"\2\2\u0311\u0313\5\32\16\2\u0312\u00e9\3\2\2\2\u0312\u00ea\3\2\2\2\u0312"+
		"\u00eb\3\2\2\2\u0312\u00ef\3\2\2\2\u0312\u00f0\3\2\2\2\u0312\u00f5\3\2"+
		"\2\2\u0312\u00f9\3\2\2\2\u0312\u00fa\3\2\2\2\u0312\u00fb\3\2\2\2\u0312"+
		"\u0100\3\2\2\2\u0312\u0101\3\2\2\2\u0312\u0108\3\2\2\2\u0312\u0109\3\2"+
		"\2\2\u0312\u010a\3\2\2\2\u0312\u010f\3\2\2\2\u0312\u0110\3\2\2\2\u0312"+
		"\u012a\3\2\2\2\u0312\u012f\3\2\2\2\u0312\u0130\3\2\2\2\u0312\u0131\3\2"+
		"\2\2\u0312\u0139\3\2\2\2\u0312\u013e\3\2\2\2\u0312\u014c\3\2\2\2\u0312"+
		"\u014d\3\2\2\2\u0312\u014e\3\2\2\2\u0312\u014f\3\2\2\2\u0312\u0150\3\2"+
		"\2\2\u0312\u0151\3\2\2\2\u0312\u0155\3\2\2\2\u0312\u0156\3\2\2\2\u0312"+
		"\u0157\3\2\2\2\u0312\u0158\3\2\2\2\u0312\u0159\3\2\2\2\u0312\u015a\3\2"+
		"\2\2\u0312\u015b\3\2\2\2\u0312\u015c\3\2\2\2\u0312\u015d\3\2\2\2\u0312"+
		"\u015e\3\2\2\2\u0312\u0166\3\2\2\2\u0312\u0172\3\2\2\2\u0312\u0173\3\2"+
		"\2\2\u0312\u0174\3\2\2\2\u0312\u0178\3\2\2\2\u0312\u017c\3\2\2\2\u0312"+
		"\u0182\3\2\2\2\u0312\u0183\3\2\2\2\u0312\u0184\3\2\2\2\u0312\u0185\3\2"+
		"\2\2\u0312\u0193\3\2\2\2\u0312\u0197\3\2\2\2\u0312\u0198\3\2\2\2\u0312"+
		"\u0199\3\2\2\2\u0312\u019a\3\2\2\2\u0312\u019b\3\2\2\2\u0312\u01a0\3\2"+
		"\2\2\u0312\u01a1\3\2\2\2\u0312\u01a2\3\2\2\2\u0312\u01a7\3\2\2\2\u0312"+
		"\u01ad\3\2\2\2\u0312\u01b8\3\2\2\2\u0312\u01bd\3\2\2\2\u0312\u01c3\3\2"+
		"\2\2\u0312\u01c9\3\2\2\2\u0312\u01cd\3\2\2\2\u0312\u01ce\3\2\2\2\u0312"+
		"\u01cf\3\2\2\2\u0312\u01d0\3\2\2\2\u0312\u01d1\3\2\2\2\u0312\u01d2\3\2"+
		"\2\2\u0312\u01d3\3\2\2\2\u0312\u01d4\3\2\2\2\u0312\u01da\3\2\2\2\u0312"+
		"\u01db\3\2\2\2\u0312\u01dc\3\2\2\2\u0312\u01dd\3\2\2\2\u0312\u01de\3\2"+
		"\2\2\u0312\u01df\3\2\2\2\u0312\u01e0\3\2\2\2\u0312\u01e1\3\2\2\2\u0312"+
		"\u01e2\3\2\2\2\u0312\u01e3\3\2\2\2\u0312\u01e4\3\2\2\2\u0312\u01e5\3\2"+
		"\2\2\u0312\u01e6\3\2\2\2\u0312\u01e7\3\2\2\2\u0312\u01e8\3\2\2\2\u0312"+
		"\u01e9\3\2\2\2\u0312\u01ea\3\2\2\2\u0312\u01eb\3\2\2\2\u0312\u01ec\3\2"+
		"\2\2\u0312\u01ed\3\2\2\2\u0312\u01ee\3\2\2\2\u0312\u01ef\3\2\2\2\u0312"+
		"\u01f0\3\2\2\2\u0312\u01f1\3\2\2\2\u0312\u01f2\3\2\2\2\u0312\u01f3\3\2"+
		"\2\2\u0312\u01f4\3\2\2\2\u0312\u01f5\3\2\2\2\u0312\u01f6\3\2\2\2\u0312"+
		"\u01f7\3\2\2\2\u0312\u01f8\3\2\2\2\u0312\u01f9\3\2\2\2\u0312\u01fa\3\2"+
		"\2\2\u0312\u01fb\3\2\2\2\u0312\u01fc\3\2\2\2\u0312\u01fd\3\2\2\2\u0312"+
		"\u01fe\3\2\2\2\u0312\u01ff\3\2\2\2\u0312\u0200\3\2\2\2\u0312\u0201\3\2"+
		"\2\2\u0312\u0202\3\2\2\2\u0312\u0203\3\2\2\2\u0312\u0204\3\2\2\2\u0312"+
		"\u0205\3\2\2\2\u0312\u0206\3\2\2\2\u0312\u0207\3\2\2\2\u0312\u0208\3\2"+
		"\2\2\u0312\u0209\3\2\2\2\u0312\u020a\3\2\2\2\u0312\u020b\3\2\2\2\u0312"+
		"\u020c\3\2\2\2\u0312\u020d\3\2\2\2\u0312\u020e\3\2\2\2\u0312\u020f\3\2"+
		"\2\2\u0312\u0210\3\2\2\2\u0312\u0211\3\2\2\2\u0312\u0212\3\2\2\2\u0312"+
		"\u0213\3\2\2\2\u0312\u0214\3\2\2\2\u0312\u0215\3\2\2\2\u0312\u0216\3\2"+
		"\2\2\u0312\u0217\3\2\2\2\u0312\u0218\3\2\2\2\u0312\u0219\3\2\2\2\u0312"+
		"\u021a\3\2\2\2\u0312\u021b\3\2\2\2\u0312\u021c\3\2\2\2\u0312\u0220\3\2"+
		"\2\2\u0312\u0221\3\2\2\2\u0312\u0222\3\2\2\2\u0312\u0223\3\2\2\2\u0312"+
		"\u0224\3\2\2\2\u0312\u0225\3\2\2\2\u0312\u0233\3\2\2\2\u0312\u0237\3\2"+
		"\2\2\u0312\u0238\3\2\2\2\u0312\u0239\3\2\2\2\u0312\u0244\3\2\2\2\u0312"+
		"\u024b\3\2\2\2\u0312\u0251\3\2\2\2\u0312\u0252\3\2\2\2\u0312\u0253\3\2"+
		"\2\2\u0312\u0254\3\2\2\2\u0312\u0259\3\2\2\2\u0312\u0267\3\2\2\2\u0312"+
		"\u026b\3\2\2\2\u0312\u026c\3\2\2\2\u0312\u0270\3\2\2\2\u0312\u0271\3\2"+
		"\2\2\u0312\u0272\3\2\2\2\u0312\u027a\3\2\2\2\u0312\u0288\3\2\2\2\u0312"+
		"\u0291\3\2\2\2\u0312\u0296\3\2\2\2\u0312\u029d\3\2\2\2\u0312\u02a3\3\2"+
		"\2\2\u0312\u02a4\3\2\2\2\u0312\u02a9\3\2\2\2\u0312\u02aa\3\2\2\2\u0312"+
		"\u02b1\3\2\2\2\u0312\u02b2\3\2\2\2\u0312\u02b9\3\2\2\2\u0312\u02c7\3\2"+
		"\2\2\u0312\u02c8\3\2\2\2\u0312\u02c9\3\2\2\2\u0312\u02ca\3\2\2\2\u0312"+
		"\u02cb\3\2\2\2\u0312\u02d9\3\2\2\2\u0312\u02da\3\2\2\2\u0312\u02de\3\2"+
		"\2\2\u0312\u02e3\3\2\2\2\u0312\u02e4\3\2\2\2\u0312\u02e8\3\2\2\2\u0312"+
		"\u02ec\3\2\2\2\u0312\u02f7\3\2\2\2\u0312\u02fb\3\2\2\2\u0312\u0303\3\2"+
		"\2\2\u0312\u0308\3\2\2\2\u0312\u030c\3\2\2\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0311\3\2\2\2\u0313\13\3\2\2\2\u0314\u0315\tl\2\2\u0315\u0316\7\u0090"+
		"\2\2\u0316\u0320\5\16\b\2\u0317\u0319\7\u01be\2\2\u0318\u0317\3\2\2\2"+
		"\u0319\u031a\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031e"+
		"\3\2\2\2\u031c\u031e\7\u01b0\2\2\u031d\u0318\3\2\2\2\u031d\u031c\3\2\2"+
		"\2\u031e\u031f\3\2\2\2\u031f\u0321\5L\'\2\u0320\u031d\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\7\u015a\2\2\u0323\r\3\2\2\2\u0324"+
		"\u0325\tm\2\2\u0325\17\3\2\2\2\u0326\u0327\tn\2\2\u0327\21\3\2\2\2\u0328"+
		"\u0342\7\u019d\2\2\u0329\u032a\7\u019d\2\2\u032a\u032b\7\u0090\2\2\u032b"+
		"\u0330\5\24\13\2\u032c\u032d\7\u01b0\2\2\u032d\u032f\5\24\13\2\u032e\u032c"+
		"\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7\u015a\2\2\u0334\u0342"+
		"\3\2\2\2\u0335\u0342\7\u012d\2\2\u0336\u0342\7\u0148\2\2\u0337\u0342\7"+
		"\u00fe\2\2\u0338\u033c\7\32\2\2\u0339\u033a\7\u0090\2\2\u033a\u033b\t"+
		"o\2\2\u033b\u033d\7\u015a\2\2\u033c\u0339\3\2\2\2\u033c\u033d\3\2\2\2"+
		"\u033d\u0342\3\2\2\2\u033e\u0342\7\u00a8\2\2\u033f\u0342\7\u009b\2\2\u0340"+
		"\u0342\7\13\2\2\u0341\u0328\3\2\2\2\u0341\u0329\3\2\2\2\u0341\u0335\3"+
		"\2\2\2\u0341\u0336\3\2\2\2\u0341\u0337\3\2\2\2\u0341\u0338\3\2\2\2\u0341"+
		"\u033e\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0340\3\2\2\2\u0342\23\3\2\2"+
		"\2\u0343\u0344\tp\2\2\u0344\25\3\2\2\2\u0345\u0346\tq\2\2\u0346\27\3\2"+
		"\2\2\u0347\u0348\tr\2\2\u0348\31\3\2\2\2\u0349\u035c\7K\2\2\u034a\u035c"+
		"\7\u00c7\2\2\u034b\u035c\7m\2\2\u034c\u035c\7\u00de\2\2\u034d\u0351\t"+
		"s\2\2\u034e\u034f\7\u0090\2\2\u034f\u0350\tt\2\2\u0350\u0352\7\u015a\2"+
		"\2\u0351\u034e\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u035c\3\2\2\2\u0353\u035c"+
		"\7\u0106\2\2\u0354\u035c\7\u0107\2\2\u0355\u035c\7\u0171\2\2\u0356\u035c"+
		"\7\u0166\2\2\u0357\u035c\7\u010d\2\2\u0358\u035c\7\u010e\2\2\u0359\u035c"+
		"\7P\2\2\u035a\u035c\7\u00cb\2\2\u035b\u0349\3\2\2\2\u035b\u034a\3\2\2"+
		"\2\u035b\u034b\3\2\2\2\u035b\u034c\3\2\2\2\u035b\u034d\3\2\2\2\u035b\u0353"+
		"\3\2\2\2\u035b\u0354\3\2\2\2\u035b\u0355\3\2\2\2\u035b\u0356\3\2\2\2\u035b"+
		"\u0357\3\2\2\2\u035b\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2"+
		"\2\2\u035c\33\3\2\2\2\u035d\u0361\7\3\2\2\u035e\u0360\7\u01c0\2\2\u035f"+
		"\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2"+
		"\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\7\u01bb\2\2\u0365"+
		"\35\3\2\2\2\u0366\u036d\7[\2\2\u0367\u0369\7\u020c\2\2\u0368\u0367\3\2"+
		"\2\2\u0369\u036a\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036e\3\2\2\2\u036c\u036e\5\34\17\2\u036d\u0368\3\2\2\2\u036d\u036c\3"+
		"\2\2\2\u036e\u036f\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0373\7U\2\2\u0372\u0374\7\u01b2\2\2\u0373\u0372"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\37\3\2\2\2\u0375\u037c\7\\\2\2\u0376"+
		"\u0378\7\u020a\2\2\u0377\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u0377"+
		"\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u037d\5\34\17\2"+
		"\u037c\u0377\3\2\2\2\u037c\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037c"+
		"\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\7U\2\2\u0381"+
		"\u0383\7\u01b2\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383!\3\2"+
		"\2\2\u0384\u0385\7Z\2\2\u0385\u0388\7\u016d\2\2\u0386\u0389\5D#\2\u0387"+
		"\u0389\5\34\17\2\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2\2\u0389\u038a\3"+
		"\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038e\7U\2\2\u038d\u038f\7\u01b2\2\2\u038e\u038d\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f#\3\2\2\2\u0390\u0391\7)\2\2\u0391\u039e\5&\24\2\u0392\u0394"+
		"\7\u01bb\2\2\u0393\u0392\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2"+
		"\2\u0395\u0396\3\2\2\2\u0396\u039a\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u039b"+
		"\5*\26\2\u0399\u039b\7\u017c\2\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2"+
		"\2\u039b\u039d\3\2\2\2\u039c\u0395\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c"+
		"\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a4\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1"+
		"\u03a3\7\u01bb\2\2\u03a2\u03a1\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2"+
		"\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7"+
		"\u03a8\7\u01b2\2\2\u03a8%\3\2\2\2\u03a9\u03ad\5L\'\2\u03aa\u03ad\5J&\2"+
		"\u03ab\u03ad\5N(\2\u03ac\u03a9\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab"+
		"\3\2\2\2\u03ad\u03bc\3\2\2\2\u03ae\u03b0\7\u01bb\2\2\u03af\u03ae\3\2\2"+
		"\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4"+
		"\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b8\tu\2\2\u03b5\u03b7\7\u01bb\2"+
		"\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9"+
		"\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bd\5(\25\2\u03bc"+
		"\u03b1\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\'\3\2\2\2\u03be\u03c1\5L\'\2"+
		"\u03bf\u03c1\5J&\2\u03c0\u03be\3\2\2\2\u03c0\u03bf\3\2\2\2\u03c1)\3\2"+
		"\2\2\u03c2\u03c6\7\u0158\2\2\u03c3\u03c5\7\u01bb\2\2\u03c4\u03c3\3\2\2"+
		"\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9"+
		"\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03d2\5\62\32\2\u03ca\u03cc\7\u01bb"+
		"\2\2\u03cb\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\5\62\32\2\u03d0\u03cb\3"+
		"\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"+\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03da\5.\30\2\u03d6\u03d9\5$\23\2"+
		"\u03d7\u03d9\5D#\2\u03d8\u03d6\3\2\2\2\u03d8\u03d7\3\2\2\2\u03d9\u03dc"+
		"\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03de\3\2\2\2\u03dc"+
		"\u03da\3\2\2\2\u03dd\u03df\5\60\31\2\u03de\u03dd\3\2\2\2\u03de\u03df\3"+
		"\2\2\2\u03df-\3\2\2\2\u03e0\u03e8\7\u0157\2\2\u03e1\u03e3\7\u01bb\2\2"+
		"\u03e2\u03e1\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5"+
		"\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\5\62\32\2"+
		"\u03e8\u03e4\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb"+
		"\3\2\2\2\u03eb\u03ef\3\2\2\2\u03ec\u03ee\7\u01bb\2\2\u03ed\u03ec\3\2\2"+
		"\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2"+
		"\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3\7\u01b2\2\2\u03f3/\3\2\2\2\u03f4"+
		"\u03f5\7\u0157\2\2\u03f5\u03f9\7\u013a\2\2\u03f6\u03f8\7\u01bb\2\2\u03f7"+
		"\u03f6\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2"+
		"\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc\u03fd\7\u01b2\2\2\u03fd"+
		"\61\3\2\2\2\u03fe\u0400\tv\2\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2"+
		"\u0400\u0401\3\2\2\2\u0401\u0405\58\35\2\u0402\u0404\7\u01bb\2\2\u0403"+
		"\u0402\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2"+
		"\2\2\u0406\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u040c\7\36\2\2\u0409"+
		"\u040b\7\u01bb\2\2\u040a\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a"+
		"\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f"+
		"\u0417\5:\36\2\u0410\u0412\7\u01bb\2\2\u0411\u0410\3\2\2\2\u0412\u0415"+
		"\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415"+
		"\u0413\3\2\2\2\u0416\u0418\5\64\33\2\u0417\u0413\3\2\2\2\u0417\u0418\3"+
		"\2\2\2\u0418\u0420\3\2\2\2\u0419\u041b\7\u01bb\2\2\u041a\u0419\3\2\2\2"+
		"\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f"+
		"\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0421\5\66\34\2\u0420\u041c\3\2\2\2"+
		"\u0420\u0421\3\2\2\2\u0421\63\3\2\2\2\u0422\u0426\tu\2\2\u0423\u0425\7"+
		"\u01bb\2\2\u0424\u0423\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2"+
		"\u0426\u0427\3\2\2\2\u0427\u042b\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042c"+
		"\5L\'\2\u042a\u042c\5J&\2\u042b\u0429\3\2\2\2\u042b\u042a\3\2\2\2\u042c"+
		"\65\3\2\2\2\u042d\u0431\7\u013c\2\2\u042e\u0430\7\u01bb\2\2\u042f\u042e"+
		"\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0436\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0437\5L\'\2\u0435\u0437\5J&"+
		"\2\u0436\u0434\3\2\2\2\u0436\u0435\3\2\2\2\u0437\67\3\2\2\2\u0438\u043d"+
		"\5L\'\2\u0439\u043d\5J&\2\u043a\u043d\5B\"\2\u043b\u043d\5H%\2\u043c\u0438"+
		"\3\2\2\2\u043c\u0439\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043b\3\2\2\2\u043d"+
		"9\3\2\2\2\u043e\u0443\5L\'\2\u043f\u0443\5J&\2\u0440\u0443\5B\"\2\u0441"+
		"\u0443\5H%\2\u0442\u043e\3\2\2\2\u0442\u043f\3\2\2\2\u0442\u0440\3\2\2"+
		"\2\u0442\u0441\3\2\2\2\u0443;\3\2\2\2\u0444\u0446\7O\2\2\u0445\u0447\7"+
		"\u01b2\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447=\3\2\2\2\u0448"+
		"\u044a\tw\2\2\u0449\u044b\7\u01b2\2\2\u044a\u0449\3\2\2\2\u044a\u044b"+
		"\3\2\2\2\u044b?\3\2\2\2\u044c\u044d\7\u0183\2\2\u044d\u044f\5L\'\2\u044e"+
		"\u0450\7\u01b2\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450A\3\2"+
		"\2\2\u0451\u0453\7\u01b3\2\2\u0452\u0454\5D#\2\u0453\u0452\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\7\u01b3\2\2\u0456C\3\2"+
		"\2\2\u0457\u045a\5H%\2\u0458\u045a\7\u01bb\2\2\u0459\u0457\3\2\2\2\u0459"+
		"\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2"+
		"\2\2\u045cE\3\2\2\2\u045d\u0462\5H%\2\u045e\u0462\7)\2\2\u045f\u0462\7"+
		"\u0157\2\2\u0460\u0462\7\u01bb\2\2\u0461\u045d\3\2\2\2\u0461\u045e\3\2"+
		"\2\2\u0461\u045f\3\2\2\2\u0461\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464G\3\2\2\2\u0465\u046f\5J&\2\u0466"+
		"\u046f\5L\'\2\u0467\u046f\5N(\2\u0468\u046f\7\u01ba\2\2\u0469\u046f\7"+
		"\u01be\2\2\u046a\u046f\7\u01b2\2\2\u046b\u046f\7\u0090\2\2\u046c\u046f"+
		"\7\u015a\2\2\u046d\u046f\5P)\2\u046e\u0465\3\2\2\2\u046e\u0466\3\2\2\2"+
		"\u046e\u0467\3\2\2\2\u046e\u0468\3\2\2\2\u046e\u0469\3\2\2\2\u046e\u046a"+
		"\3\2\2\2\u046e\u046b\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046d\3\2\2\2\u046f"+
		"\u0470\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0482\3\2"+
		"\2\2\u0472\u0473\7\u01bb\2\2\u0473\u047c\7\4\2\2\u0474\u047d\5J&\2\u0475"+
		"\u047d\5L\'\2\u0476\u047d\5N(\2\u0477\u047d\7\u01ba\2\2\u0478\u047d\7"+
		"\u01be\2\2\u0479\u047d\7\u01b2\2\2\u047a\u047d\7\u0090\2\2\u047b\u047d"+
		"\7\u015a\2\2\u047c\u0474\3\2\2\2\u047c\u0475\3\2\2\2\u047c\u0476\3\2\2"+
		"\2\u047c\u0477\3\2\2\2\u047c\u0478\3\2\2\2\u047c\u0479\3\2\2\2\u047c\u047a"+
		"\3\2\2\2\u047c\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047c\3\2\2\2\u047e"+
		"\u047f\3\2\2\2\u047f\u0481\3\2\2\2\u0480\u0472\3\2\2\2\u0481\u0484\3\2"+
		"\2\2\u0482\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483I\3\2\2\2\u0484\u0482"+
		"\3\2\2\2\u0485\u0488\7\u01b8\2\2\u0486\u0488\5\u00b6\\\2\u0487\u0485\3"+
		"\2\2\2\u0487\u0486\3\2\2\2\u0488K\3\2\2\2\u0489\u048a\tx\2\2\u048aM\3"+
		"\2\2\2\u048b\u048c\7\u01b9\2\2\u048cO\3\2\2\2\u048d\u048e\7>\2\2\u048e"+
		"\u0492\7\u0090\2\2\u048f\u0493\5J&\2\u0490\u0493\7)\2\2\u0491\u0493\7"+
		"\u0151\2\2\u0492\u048f\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0491\3\2\2\2"+
		"\u0493\u0494\3\2\2\2\u0494\u0495\7\u015a\2\2\u0495Q\3\2\2\2\u0496\u0499"+
		"\5T+\2\u0497\u0499\5V,\2\u0498\u0496\3\2\2\2\u0498\u0497\3\2\2\2\u0499"+
		"S\3\2\2\2\u049a\u04af\5X-\2\u049b\u04af\5Z.\2\u049c\u04af\5\\/\2\u049d"+
		"\u04af\5`\61\2\u049e\u04af\5b\62\2\u049f\u04af\5d\63\2\u04a0\u04af\5f"+
		"\64\2\u04a1\u04af\5h\65\2\u04a2\u04af\5j\66\2\u04a3\u04af\5l\67\2\u04a4"+
		"\u04af\5n8\2\u04a5\u04af\5p9\2\u04a6\u04af\5r:\2\u04a7\u04af\5t;\2\u04a8"+
		"\u04af\5v<\2\u04a9\u04af\5x=\2\u04aa\u04af\5z>\2\u04ab\u04af\5|?\2\u04ac"+
		"\u04af\5~@\2\u04ad\u04af\5\u0080A\2\u04ae\u049a\3\2\2\2\u04ae\u049b\3"+
		"\2\2\2\u04ae\u049c\3\2\2\2\u04ae\u049d\3\2\2\2\u04ae\u049e\3\2\2\2\u04ae"+
		"\u049f\3\2\2\2\u04ae\u04a0\3\2\2\2\u04ae\u04a1\3\2\2\2\u04ae\u04a2\3\2"+
		"\2\2\u04ae\u04a3\3\2\2\2\u04ae\u04a4\3\2\2\2\u04ae\u04a5\3\2\2\2\u04ae"+
		"\u04a6\3\2\2\2\u04ae\u04a7\3\2\2\2\u04ae\u04a8\3\2\2\2\u04ae\u04a9\3\2"+
		"\2\2\u04ae\u04aa\3\2\2\2\u04ae\u04ab\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04afU\3\2\2\2\u04b0\u04b8\5\u0092J\2\u04b1\u04b8\5\u009c"+
		"O\2\u04b2\u04b8\5\u009eP\2\u04b3\u04b8\5\u00a0Q\2\u04b4\u04b8\5\u00a4"+
		"S\2\u04b5\u04b8\5\u00a6T\2\u04b6\u04b8\5\u00a8U\2\u04b7\u04b0\3\2\2\2"+
		"\u04b7\u04b1\3\2\2\2\u04b7\u04b2\3\2\2\2\u04b7\u04b3\3\2\2\2\u04b7\u04b4"+
		"\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b6\3\2\2\2\u04b8W\3\2\2\2\u04b9"+
		"\u04ba\7\u01b1\2\2\u04ba\u04bc\ty\2\2\u04bb\u04bd\tz\2\2\u04bc\u04bb\3"+
		"\2\2\2\u04bc\u04bd\3\2\2\2\u04bdY\3\2\2\2\u04be\u04bf\7\u01b1\2\2\u04bf"+
		"\u04c0\7v\2\2\u04c0\u04c1\t{\2\2\u04c1[\3\2\2\2\u04c2\u04c3\7\31\2\2\u04c3"+
		"\u04c4\5^\60\2\u04c4]\3\2\2\2\u04c5\u04c9\5L\'\2\u04c6\u04c9\5J&\2\u04c7"+
		"\u04c9\5N(\2\u04c8\u04c5\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8\u04c7\3\2\2"+
		"\2\u04c9_\3\2\2\2\u04ca\u04cb\7w\2\2\u04cb\u04cc\7\u01b6\2\2\u04cca\3"+
		"\2\2\2\u04cd\u04ce\7=\2\2\u04ce\u04cf\5\u0090I\2\u04cfc\3\2\2\2\u04d0"+
		"\u04d1\7\u01b1\2\2\u04d1\u04d2\7\u01d8\2\2\u04d2\u04d3\7\u01b6\2\2\u04d3"+
		"e\3\2\2\2\u04d4\u04d5\7\u01b1\2\2\u04d5\u04d6\7\u01d2\2\2\u04d6\u04d7"+
		"\t|\2\2\u04d7g\3\2\2\2\u04d8\u04d9\7\u01b1\2\2\u04d9\u04de\7\u01d7\2\2"+
		"\u04da\u04df\5\u0084C\2\u04db\u04df\5\u0086D\2\u04dc\u04df\5\u0088E\2"+
		"\u04dd\u04df\5\u008aF\2\u04de\u04da\3\2\2\2\u04de\u04db\3\2\2\2\u04de"+
		"\u04dc\3\2\2\2\u04de\u04dd\3\2\2\2\u04dfi\3\2\2\2\u04e0\u04e1\7\u01b1"+
		"\2\2\u04e1\u04e7\7\u01d9\2\2\u04e2\u04e8\5\u0096L\2\u04e3\u04e8\5\u00ac"+
		"W\2\u04e4\u04e8\5L\'\2\u04e5\u04e6\7\u01f6\2\2\u04e6\u04e8\7\u01b8\2\2"+
		"\u04e7\u04e2\3\2\2\2\u04e7\u04e3\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e7\u04e5"+
		"\3\2\2\2\u04e8k\3\2\2\2\u04e9\u04ea\7\u01b1\2\2\u04ea\u04eb\7\u01e4\2"+
		"\2\u04eb\u04ec\t}\2\2\u04ec\u04ed\t{\2\2\u04edm\3\2\2\2\u04ee\u04ef\7"+
		"\u01b1\2\2\u04ef\u04f0\7\u01e5\2\2\u04f0\u04f1\t~\2\2\u04f1\u04f2\t{\2"+
		"\2\u04f2o\3\2\2\2\u04f3\u04f4\7\u01b1\2\2\u04f4\u04f5\7\u01eb\2\2\u04f5"+
		"\u04f6\t{\2\2\u04f6q\3\2\2\2\u04f7\u04f8\7\u01b1\2\2\u04f8\u04f9\7\u01ed"+
		"\2\2\u04f9\u04fa\t{\2\2\u04fas\3\2\2\2\u04fb\u04fc\7\u01b1\2\2\u04fc\u0500"+
		"\7\u01f5\2\2\u04fd\u04ff\7\u01c1\2\2\u04fe\u04fd\3\2\2\2\u04ff\u0502\3"+
		"\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502"+
		"\u0500\3\2\2\2\u0503\u0504\7\u01bb\2\2\u0504u\3\2\2\2\u0505\u0506\7\u01b1"+
		"\2\2\u0506\u0509\7\u01f7\2\2\u0507\u050a\7\u01cf\2\2\u0508\u050a\5\u0082"+
		"B\2\u0509\u0507\3\2\2\2\u0509\u0508\3\2\2\2\u050aw\3\2\2\2\u050b\u050c"+
		"\7\u01b1\2\2\u050c\u050d\7\u01f8\2\2\u050d\u050e\t{\2\2\u050ey\3\2\2\2"+
		"\u050f\u0510\7\u01b1\2\2\u0510\u0513\7\u01f9\2\2\u0511\u0514\7\u01cf\2"+
		"\2\u0512\u0514\5\u0082B\2\u0513\u0511\3\2\2\2\u0513\u0512\3\2\2\2\u0514"+
		"{\3\2\2\2\u0515\u0516\7\u01b1\2\2\u0516\u0517\7\u01fa\2\2\u0517\u0518"+
		"\t{\2\2\u0518}\3\2\2\2\u0519\u051a\7\u01b1\2\2\u051a\u051d\7\u0166\2\2"+
		"\u051b\u051c\7\u01e6\2\2\u051c\u051e\7\u01ea\2\2\u051d\u051b\3\2\2\2\u051d"+
		"\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\t\177\2\2\u0520\177\3\2"+
		"\2\2\u0521\u0522\7\u01b1\2\2\u0522\u0526\7\u0203\2\2\u0523\u0525\7\u01b8"+
		"\2\2\u0524\u0523\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0524\3\2\2\2\u0526"+
		"\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u0526\3\2\2\2\u0529\u0532\7\u01d5"+
		"\2\2\u052a\u0533\7\u01f0\2\2\u052b\u052d\7\u01f1\2\2\u052c\u052b\3\2\2"+
		"\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e\u0530\7\u0207\2\2\u052f"+
		"\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\7\u01ee"+
		"\2\2\u0532\u052a\3\2\2\2\u0532\u052c\3\2\2\2\u0533\u0081\3\2\2\2\u0534"+
		"\u0535\t\u0080\2\2\u0535\u0083\3\2\2\2\u0536\u0537\7\u01e1\2\2\u0537\u0538"+
		"\5L\'\2\u0538\u0539\7\u0207\2\2\u0539\u053a\5L\'\2\u053a\u0085\3\2\2\2"+
		"\u053b\u053c\7\u0204\2\2\u053c\u053d\5L\'\2\u053d\u0087\3\2\2\2\u053e"+
		"\u053f\7\u01fd\2\2\u053f\u0540\5L\'\2\u0540\u0541\7\36\2\2\u0541\u0542"+
		"\5L\'\2\u0542\u0089\3\2\2\2\u0543\u0544\7\u01fb\2\2\u0544\u0545\5L\'\2"+
		"\u0545\u008b\3\2\2\2\u0546\u0547\5\u008eH\2\u0547\u0548\7\u01c9\2\2\u0548"+
		"\u0549\5\u008eH\2\u0549\u008d\3\2\2\2\u054a\u054b\7\u01b6\2\2\u054b\u008f"+
		"\3\2\2\2\u054c\u054f\5\u008eH\2\u054d\u054f\5\u008cG\2\u054e\u054c\3\2"+
		"\2\2\u054e\u054d\3\2\2\2\u054f\u0557\3\2\2\2\u0550\u0553\7\u01b0\2\2\u0551"+
		"\u0554\5\u008eH\2\u0552\u0554\5\u008cG\2\u0553\u0551\3\2\2\2\u0553\u0552"+
		"\3\2\2\2\u0554\u0556\3\2\2\2\u0555\u0550\3\2\2\2\u0556\u0559\3\2\2\2\u0557"+
		"\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0091\3\2\2\2\u0559\u0557\3\2"+
		"\2\2\u055a\u055b\7\u01b1\2\2\u055b\u055c\7<\2\2\u055c\u055e\7\u01b8\2"+
		"\2\u055d\u055f\7\u01d0\2\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0562\3\2\2\2\u0560\u0563\5\u0094K\2\u0561\u0563\7\u01f0\2\2\u0562\u0560"+
		"\3\2\2\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564"+
		"\u0566\7\u01f4\2\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0093"+
		"\3\2\2\2\u0567\u056c\5L\'\2\u0568\u056c\5\u0096L\2\u0569\u056c\7\u01b8"+
		"\2\2\u056a\u056c\7\u01f6\2\2\u056b\u0567\3\2\2\2\u056b\u0568\3\2\2\2\u056b"+
		"\u0569\3\2\2\2\u056b\u056a\3\2\2\2\u056c\u0095\3\2\2\2\u056d\u056f\7\u0090"+
		"\2\2\u056e\u056d\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2\2\2\u0570"+
		"\u0571\3\2\2\2\u0571\u0573\3\2\2\2\u0572\u0570\3\2\2\2\u0573\u0574\5\u0098"+
		"M\2\u0574\u0575\5\u009aN\2\u0575\u0577\3\2\2\2\u0576\u0570\3\2\2\2\u0577"+
		"\u0578\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u058b\3\2"+
		"\2\2\u057a\u057c\7\u0090\2\2\u057b\u057a\3\2\2\2\u057c\u057f\3\2\2\2\u057d"+
		"\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u057d\3\2"+
		"\2\2\u0580\u0584\5\u0098M\2\u0581\u0583\7\u015a\2\2\u0582\u0581\3\2\2"+
		"\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587"+
		"\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u0588\5\u009aN\2\u0588\u058a\3\2\2"+
		"\2\u0589\u057d\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058c"+
		"\3\2\2\2\u058c\u058e\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u0592\5\u0098M"+
		"\2\u058f\u0591\7\u015a\2\2\u0590\u058f\3\2\2\2\u0591\u0594\3\2\2\2\u0592"+
		"\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0097\3\2\2\2\u0594\u0592\3\2"+
		"\2\2\u0595\u0596\t\u0081\2\2\u0596\u0099\3\2\2\2\u0597\u0598\t\u0082\2"+
		"\2\u0598\u009b\3\2\2\2\u0599\u059a\7\u01b1\2\2\u059a\u059b\7\u01e9\2\2"+
		"\u059b\u059c\5\u00acW\2\u059c\u009d\3\2\2\2\u059d\u059e\7\u01b1\2\2\u059e"+
		"\u059f\7\u01dd\2\2\u059f\u009f\3\2\2\2\u05a0\u05a1\7\u01b1\2\2\u05a1\u05a2"+
		"\7\u01df\2\2\u05a2\u00a1\3\2\2\2\u05a3\u05a7\5\u0096L\2\u05a4\u05a7\7"+
		"\u01b8\2\2\u05a5\u05a7\5L\'\2\u05a6\u05a3\3\2\2\2\u05a6\u05a4\3\2\2\2"+
		"\u05a6\u05a5\3\2\2\2\u05a7\u00a3\3\2\2\2\u05a8\u05a9\7\u01b1\2\2\u05a9"+
		"\u05ac\7\u01e2\2\2\u05aa\u05ad\7\u0202\2\2\u05ab\u05ad\5\u00a2R\2\u05ac"+
		"\u05aa\3\2\2\2\u05ac\u05ab\3\2\2\2\u05ad\u00a5\3\2\2\2\u05ae\u05af\7\u01b1"+
		"\2\2\u05af\u05b7\7\u0206\2\2\u05b0\u05b3\5\u00a2R\2\u05b1\u05b2\t\u0083"+
		"\2\2\u05b2\u05b4\5\u00a2R\2\u05b3\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05b8\3\2\2\2\u05b5\u05b8\5\u00acW\2\u05b6\u05b8\7\u01f3\2\2\u05b7\u05b0"+
		"\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8\u00a7\3\2\2\2\u05b9"+
		"\u05ba\7\u01b1\2\2\u05ba\u05bb\7\u01de\2\2\u05bb\u00a9\3\2\2\2\u05bc\u05be"+
		"\7\u01ea\2\2\u05bd\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05c0\3\2\2"+
		"\2\u05bf\u05c1\7\u01ef\2\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05dd\3\2\2\2\u05c2\u05de\7\u01e0\2\2\u05c3\u05de\7\u01c5\2\2\u05c4\u05de"+
		"\7\u01cb\2\2\u05c5\u05de\7\u01c7\2\2\u05c6\u05c8\7\u01e8\2\2\u05c7\u05c9"+
		"\7\u01fe\2\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05de\3\2\2"+
		"\2\u05ca\u05de\7\u01c6\2\2\u05cb\u05cd\7\u01ec\2\2\u05cc\u05ce\7\u01fe"+
		"\2\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05de\3\2\2\2\u05cf"+
		"\u05de\7\u01cd\2\2\u05d0\u05d2\7\u01ec\2\2\u05d1\u05d3\7\u01fe\2\2\u05d2"+
		"\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\7\u01f2"+
		"\2\2\u05d5\u05de\7\u01e0\2\2\u05d6\u05de\7\u01cc\2\2\u05d7\u05d9\7\u01e8"+
		"\2\2\u05d8\u05da\7\u01fe\2\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da"+
		"\u05db\3\2\2\2\u05db\u05dc\7\u01f2\2\2\u05dc\u05de\7\u01e0\2\2\u05dd\u05c2"+
		"\3\2\2\2\u05dd\u05c3\3\2\2\2\u05dd\u05c4\3\2\2\2\u05dd\u05c5\3\2\2\2\u05dd"+
		"\u05c6\3\2\2\2\u05dd\u05ca\3\2\2\2\u05dd\u05cb\3\2\2\2\u05dd\u05cf\3\2"+
		"\2\2\u05dd\u05d0\3\2\2\2\u05dd\u05d6\3\2\2\2\u05dd\u05d7\3\2\2\2\u05de"+
		"\u05e0\3\2\2\2\u05df\u05e1\7\u0201\2\2\u05e0\u05df\3\2\2\2\u05e0\u05e1"+
		"\3\2\2\2\u05e1\u00ab\3\2\2\2\u05e2\u05e4\7\u0090\2\2\u05e3\u05e2\3\2\2"+
		"\2\u05e4\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8"+
		"\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e8\u05f9\5\u00aeX\2\u05e9\u05ed\t\u0084"+
		"\2\2\u05ea\u05ec\7\u0090\2\2\u05eb\u05ea\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed"+
		"\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f0\3\2\2\2\u05ef\u05ed\3\2"+
		"\2\2\u05f0\u05f4\5\u00aeX\2\u05f1\u05f3\7\u015a\2\2\u05f2\u05f1\3\2\2"+
		"\2\u05f3\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f8"+
		"\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f7\u05e9\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9"+
		"\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05ff\3\2\2\2\u05fb\u05f9\3\2"+
		"\2\2\u05fc\u05fe\7\u015a\2\2\u05fd\u05fc\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff"+
		"\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0603\3\2\2\2\u0601\u05ff\3\2"+
		"\2\2\u0602\u05e5\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0602\3\2\2\2\u0604"+
		"\u0605\3\2\2\2\u0605\u00ad\3\2\2\2\u0606\u060a\5\u00b0Y\2\u0607\u060a"+
		"\5\u00b4[\2\u0608\u060a\5\u00b2Z\2\u0609\u0606\3\2\2\2\u0609\u0607\3\2"+
		"\2\2\u0609\u0608\3\2\2\2\u060a\u00af\3\2\2\2\u060b\u060f\5\u0096L\2\u060c"+
		"\u060f\7\u01b8\2\2\u060d\u060f\5L\'\2\u060e\u060b\3\2\2\2\u060e\u060c"+
		"\3\2\2\2\u060e\u060d\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0614\5\u00aaV"+
		"\2\u0611\u0615\5\u0096L\2\u0612\u0615\7\u01b8\2\2\u0613\u0615\5L\'\2\u0614"+
		"\u0611\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0613\3\2\2\2\u0615\u00b1\3\2"+
		"\2\2\u0616\u0617\7\u01b8\2\2\u0617\u00b3\3\2\2\2\u0618\u061a\7\u01b8\2"+
		"\2\u0619\u061b\7\u01ea\2\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u061d\3\2\2\2\u061c\u061e\7\u01ef\2\2\u061d\u061c\3\2\2\2\u061d\u061e"+
		"\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\7\u01da\2\2\u0620\u00b5\3\2\2"+
		"\2\u0621\u0622\t\u0085\2\2\u0622\u00b7\3\2\2\2\u00ae\u00c7\u00c9\u00d3"+
		"\u00d7\u00d9\u00df\u00e4\u0106\u0114\u0117\u011d\u0120\u0127\u0136\u0141"+
		"\u0144\u0147\u014a\u0163\u016b\u016f\u0180\u018c\u0191\u01ab\u01b4\u01c1"+
		"\u01c7\u01d8\u022c\u0231\u0240\u024f\u025c\u025f\u0262\u0265\u0277\u0281"+
		"\u0286\u028f\u029a\u02a1\u02af\u02b7\u02c0\u02c5\u02d2\u02d7\u02f2\u02f4"+
		"\u02fe\u0301\u0312\u031a\u031d\u0320\u0330\u033c\u0341\u0351\u035b\u0361"+
		"\u036a\u036d\u036f\u0373\u0379\u037c\u037e\u0382\u0388\u038a\u038e\u0395"+
		"\u039a\u039e\u03a4\u03ac\u03b1\u03b8\u03bc\u03c0\u03c6\u03cd\u03d2\u03d8"+
		"\u03da\u03de\u03e4\u03ea\u03ef\u03f9\u03ff\u0405\u040c\u0413\u0417\u041c"+
		"\u0420\u0426\u042b\u0431\u0436\u043c\u0442\u0446\u044a\u044f\u0453\u0459"+
		"\u045b\u0461\u0463\u046e\u0470\u047c\u047e\u0482\u0487\u0492\u0498\u04ae"+
		"\u04b7\u04bc\u04c8\u04de\u04e7\u0500\u0509\u0513\u051d\u0526\u052c\u052f"+
		"\u0532\u054e\u0553\u0557\u055e\u0562\u0565\u056b\u0570\u0578\u057d\u0584"+
		"\u058b\u0592\u05a6\u05ac\u05b3\u05b7\u05bd\u05c0\u05c8\u05cd\u05d2\u05d9"+
		"\u05dd\u05e0\u05e5\u05ed\u05f4\u05f9\u05ff\u0604\u0609\u060e\u0614\u061a"+
		"\u061d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}