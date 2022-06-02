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
		INVD=118, INVDATA=119, JA=120, JAVAIOP=121, JAVA64=122, JP=123, JVMINITOPTIONS=124, 
		KA=125, LANG=126, LANGUAGE=127, LAX=128, LAXPERF=129, LAXREDEF=130, LC=131, 
		LEADING=132, LEASM=133, LENGTH=134, LIB=135, LILIAN=136, LIN=137, LINECOUNT=138, 
		LINKAGE=139, LIST=140, LM=141, LONGMIXED=142, LONGUPPER=143, LP=144, LPARENCHAR=145, 
		LU=146, LXPRF=147, MAP=148, MARGINS=149, MAX=150, MD=151, MDECK=152, MIG=153, 
		MIXED=154, MAXPCF=155, MSG=156, NAME=157, NAT=158, NATIONAL=159, NATLANG=160, 
		NC=161, NN=162, NO=163, NOADATA=164, NOADV=165, NOALIAS=166, NOALPHNUM=167, 
		NOAWO=168, NOBIN=169, NOBLOCK0=170, NOC=171, NOCBLCARD=172, NOCICS=173, 
		NOCLEANSIGN=174, NOCMPR2=175, NOCOMPILE=176, NOCOPYLOC=177, NOCOPYRIGHT=178, 
		NOCPLC=179, NOCPSM=180, NOCPYR=181, NOCS=182, NOCURR=183, NOCURRENCY=184, 
		NOD=185, NODATEPROC=186, NODBCS=187, NODE=188, NODEBUG=189, NODECK=190, 
		NODEFINE=191, NODEF=192, NODIAGTRUNC=193, NODLL=194, NODSNAME=195, NODU=196, 
		NODUMP=197, NODP=198, NODTR=199, NODWARF=200, NODYN=201, NODYNAM=202, 
		NOEDF=203, NOEJPD=204, NOENDP=205, NOENDPERIOD=206, NOEPILOG=207, NOEVENP=208, 
		NOEVENPACK=209, NOEXIT=210, NOEXP=211, NOEXPORTALL=212, NOF=213, NOFASTSRT=214, 
		NOFEPI=215, NOFLAG=216, NOFLAGMIG=217, NOFLAGSTD=218, NOFNC=219, NOFORCENUMCMP=220, 
		NOFSRT=221, NOGRAPHIC=222, NOHOOK=223, NOINITCHECK=224, NOIC=225, NOINITIAL=226, 
		NOINLINE=227, NOINL=228, NOINVD=229, NOINVDATA=230, NOJAVAIOP=231, NOJAVA64=232, 
		NOLAXPERF=233, NOLAXREDEF=234, NOLENGTH=235, NOLIB=236, NOLINKAGE=237, 
		NOLIST=238, NOLXPRF=239, NOMAP=240, NOMD=241, NOMDECK=242, NONAME=243, 
		NONUM=244, NONUMBER=245, NOOBJ=246, NOOBJECT=247, NOOMITODOMIN=248, NOOFF=249, 
		NOOFFSET=250, NOOOM=251, NOOPSEQUENCE=252, NOOPT=253, NOOPTIMIZE=254, 
		NOOPTIONS=255, NOP=256, NOPAC=257, NOPARMCHECK=258, NOPFD=259, NOPRESERVE=260, 
		NOPROLOG=261, NORENT=262, NORULES=263, NOS=264, NOSEP=265, NOSEPARATE=266, 
		NOSEQ=267, NOSERV=268, NOSERVICE=269, NOSLACKBYTES=270, NOSLCKB=271, NOSO=272, 
		NOSOURCE=273, NOSPIE=274, NOSQL=275, NOSQLC=276, NOSQLCCSID=277, NOSQLIMS=278, 
		NOSSR=279, NOSSRANGE=280, NOSTDTRUNC=281, NOSEQUENCE=282, NOSTGOPT=283, 
		NOSUPP=284, NOSUPPRESS=285, NOTERM=286, NOTERMINAL=287, NOTEST=288, NOTHREAD=289, 
		NOTRIG=290, NOTRUNCBIN=291, NOUNRA=292, NOUNREFALL=293, NOUNREFSOURCE=294, 
		NOUNRS=295, NOVBREF=296, NOVOLATILE=297, NOWD=298, NOWORD=299, NOX=300, 
		NOXREF=301, NOZC=302, NOZLEN=303, NOZON=304, NOZONECHECK=305, NOZWB=306, 
		NS=307, NSEQ=308, NSYMBOL=309, NUM=310, NUMBER=311, NUMCHECK=312, NUMPROC=313, 
		OBJ=314, OBJECT=315, OF=316, OFF=317, OFFSET=318, ON=319, OMITODOMIN=320, 
		OOM=321, OP=322, OPMARGINS=323, OPSEQUENCE=324, OPT=325, OPTFILE=326, 
		OPTIMIZE=327, OPTIONS=328, OUT=329, OUTDD=330, OUTPATH=331, PAC=332, PARMCHECK=333, 
		PATH=334, PC=335, PFD=336, PPTDBG=337, PGMN=338, PGMNAME=339, PRESERVE=340, 
		PROCESS=341, PROLOG=342, QUALIFY=343, QUA=344, QUOTE=345, RENT=346, REPLACE=347, 
		REPLACING=348, RMODE=349, RPARENCHAR=350, RULES=351, SEP=352, SEPARATE=353, 
		SEQ=354, SEQUENCE=355, SERV=356, SERVICE=357, SHORT=358, SIZE=359, SLACKBYTES=360, 
		SLCKB=361, SOURCE=362, SP=363, SPACE=364, SPIE=365, SQL=366, SQLC=367, 
		SQLCCSID=368, SQLIMS=369, SKIP1=370, SKIP2=371, SKIP3=372, SO=373, SS=374, 
		SSR=375, SSRANGE=376, STANDARD=377, STD=378, STGOPT=379, STRICT=380, STRICTREDEF=381, 
		SUCC=382, SUPP=383, SUPPRESS=384, SYSEIB=385, SZ=386, TERM=387, TERMINAL=388, 
		TEST=389, THREAD=390, TITLE=391, TRAILING=392, TRIG=393, TRUNC=394, TRUNCBIN=395, 
		TUNE=396, UE=397, UNREF=398, UPPER=399, VBREF=400, VLR=401, VOLATILE=402, 
		VS=403, VSAMOPENFS=404, WD=405, WORD=406, XMLPARSE=407, XMLSS=408, XOPTS=409, 
		XP=410, XREF=411, YEARWINDOW=412, YW=413, ZC=414, ZD=415, ZLEN=416, ZON=417, 
		ZONECHECK=418, ZONEDATA=419, ZWB=420, C_CHAR=421, D_CHAR=422, E_CHAR=423, 
		F_CHAR=424, H_CHAR=425, I_CHAR=426, M_CHAR=427, N_CHAR=428, O_CHAR=429, 
		Q_CHAR=430, S_CHAR=431, U_CHAR=432, W_CHAR=433, X_CHAR=434, COMMENTTAG=435, 
		COMMACHAR=436, COMPILER_DIRECTIVE_TAG=437, DOT=438, DOUBLEEQUALCHAR=439, 
		NONNUMERICLITERAL=440, CONTINUED_NONNUMERICLITERAL=441, NUMERICLITERAL=442, 
		IDENTIFIER=443, FILENAME=444, PSEUDOTEXTIDENTIFIER=445, NEWLINE=446, COMMENTLINE=447, 
		WS=448, TEXT=449, BOL=450, CLASSIC_COMMENT_TEXT=451, PAGE_COMMENT_TEXT=452, 
		CD_WS=453, CD_CLASSIC_EOL_COMMENT=454, ASTERISKCHAR=455, EQUALCHAR=456, 
		GREATERTHANCHAR=457, LESSTHANCHAR=458, PLUSCHAR=459, MINUSCHAR=460, SLASHCHAR=461, 
		NOTEQUALCHAR=462, GREATEROREQUALCHAR=463, LESSOREQUALCHAR=464, ZERO=465, 
		ALL=466, AS=467, AND=468, CALL_CONVENTION=469, CALLINT=470, CALLINTERFACE=471, 
		CHECKING=472, COBOL=473, COBOL_WORDS=474, COMP_DIR_DATA=475, DISPLAY=476, 
		DEFINED=477, DLL_INTERFACE=478, DYNAMIC=479, ELSE=480, END_EVALUATE=481, 
		END_IF=482, EQUAL=483, EQUATE=484, EVALUATE=485, FIXED=486, FLAG_02=487, 
		FLAG_14=488, FORMAT=489, COMP_DIR_FREE=490, GREATER=491, IF=492, IS=493, 
		JAVA_CALLABLE=494, JAVA_SHAREABLE=495, LEAP_SECOND=496, LESS=497, LISTING=498, 
		LOCATION=499, NOT=500, COMP_DIR_OFF=501, COMP_DIR_ON=502, OR=503, OTHER=504, 
		OVERRIDE=505, PAGE=506, PARAMETER=507, POP=508, PROPOGATE=509, PUSH=510, 
		REF_MOD_ZERO_LENGTH=511, RESERVE=512, STATIC=513, SUBSTITUTE=514, THAN=515, 
		THROUGH=516, THRU=517, TO=518, TRUE=519, TURN=520, UNDEFINE=521, UPON=522, 
		WHEN=523, WITH=524, BD_WS=525, BD_CLASSIC_EOL_COMMENT=526, SQL_TEXT=527, 
		ES_CLASSIC_LINE_NUMBER=528, CICS_TEXT=529, EC_CLASSIC_LINE_NUMBER=530;
	public static final int
		RULE_startRule = 0, RULE_identificationDivisionTag = 1, RULE_compilerOptions = 2, 
		RULE_compilerXOpts = 3, RULE_compilerOption = 4, RULE_define_opt = 5, 
		RULE_identifier_et_al = 6, RULE_invdata_opts = 7, RULE_numcheck_opts = 8, 
		RULE_numcheck_zon_opts = 9, RULE_rules_opts = 10, RULE_ssrange_opts = 11, 
		RULE_test_opts = 12, RULE_javaiop = 13, RULE_javaiopOption = 14, RULE_classicCommentEntry = 15, 
		RULE_execCicsStatement = 16, RULE_execSqlStatement = 17, RULE_execSqlImsStatement = 18, 
		RULE_copyStatement = 19, RULE_copySource = 20, RULE_copyLibrary = 21, 
		RULE_replacingPhrase = 22, RULE_replaceArea = 23, RULE_replaceByStatement = 24, 
		RULE_replaceOffStatement = 25, RULE_replaceClause = 26, RULE_directoryPhrase = 27, 
		RULE_familyPhrase = 28, RULE_replaceable = 29, RULE_replacement = 30, 
		RULE_ejectStatement = 31, RULE_skipStatement = 32, RULE_titleStatement = 33, 
		RULE_pseudoText = 34, RULE_charData = 35, RULE_charDataSql = 36, RULE_charDataLine = 37, 
		RULE_cobolWord = 38, RULE_literal = 39, RULE_filename = 40, RULE_dfhvalue = 41, 
		RULE_compilerDirectiveStatement = 42, RULE_compilerDirective = 43, RULE_conditionalCompilationStatement = 44, 
		RULE_compilerDirectiveCallInterface = 45, RULE_compilerDirectiveInline = 46, 
		RULE_compilerDirectiveBasis = 47, RULE_basisName = 48, RULE_compilerDirectiveInsert = 49, 
		RULE_compilerDirectiveDelete = 50, RULE_compilerDirectiveData = 51, RULE_compilerDirectiveCallConvention = 52, 
		RULE_compilerDirectiveCobolWords = 53, RULE_compilerDirectiveDisplay = 54, 
		RULE_compilerDirectiveFlag02 = 55, RULE_compilerDirectiveFlag14 = 56, 
		RULE_compilerDirectiveJavaCallable = 57, RULE_compilerDirectiveJavaShareable = 58, 
		RULE_compilerDirectiveLeapSecond = 59, RULE_compilerDirectiveListing = 60, 
		RULE_compilerDirectivePage = 61, RULE_compilerDirectivePop = 62, RULE_compilerDirectivePropogate = 63, 
		RULE_compilerDirectivePush = 64, RULE_compilerDirectiveRefModZeroLength = 65, 
		RULE_compilerDirectiveSource = 66, RULE_compilerDirectiveTurn = 67, RULE_compilerDirectivePopList = 68, 
		RULE_compilerDirectiveCobolWordsEquate = 69, RULE_compilerDirectiveCobolWordsUndefine = 70, 
		RULE_compilerDirectiveCobolWordsSubstitute = 71, RULE_compilerDirectiveCobolWordsReserve = 72, 
		RULE_compilerDirectiveNumericRange = 73, RULE_compilerDirectiveNumericAtom = 74, 
		RULE_compilerDirectiveDeleteSequenceNumber = 75, RULE_conditionalCompilationDefine = 76, 
		RULE_conditionalCompilationDefinePredicate = 77, RULE_conditionalCompilationArithmeticExpression = 78, 
		RULE_conditionalCompilationArithmeticAtom = 79, RULE_conditionalCompilationArithmeticOp = 80, 
		RULE_conditionalCompilationIf = 81, RULE_conditionalCompilationElse = 82, 
		RULE_conditionalCompilationEndIf = 83, RULE_conditionalCompilationEvaluateSelection = 84, 
		RULE_conditionalCompilationEvaluate = 85, RULE_conditionalCompilationWhen = 86, 
		RULE_conditionalCompilationEndEvaluate = 87, RULE_conditionalCompilationComparisonOp = 88, 
		RULE_conditionalCompilationRelationalCondition = 89, RULE_conditionalCompilationCondition = 90, 
		RULE_conditionalCompilationSimpleRelationalCondition = 91, RULE_conditionalCompilationBinaryCondition = 92, 
		RULE_conditionalCompilationDefinedCondition = 93, RULE_charDataKeyword = 94;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "identificationDivisionTag", "compilerOptions", "compilerXOpts", 
			"compilerOption", "define_opt", "identifier_et_al", "invdata_opts", "numcheck_opts", 
			"numcheck_zon_opts", "rules_opts", "ssrange_opts", "test_opts", "javaiop", 
			"javaiopOption", "classicCommentEntry", "execCicsStatement", "execSqlStatement", 
			"execSqlImsStatement", "copyStatement", "copySource", "copyLibrary", 
			"replacingPhrase", "replaceArea", "replaceByStatement", "replaceOffStatement", 
			"replaceClause", "directoryPhrase", "familyPhrase", "replaceable", "replacement", 
			"ejectStatement", "skipStatement", "titleStatement", "pseudoText", "charData", 
			"charDataSql", "charDataLine", "cobolWord", "literal", "filename", "dfhvalue", 
			"compilerDirectiveStatement", "compilerDirective", "conditionalCompilationStatement", 
			"compilerDirectiveCallInterface", "compilerDirectiveInline", "compilerDirectiveBasis", 
			"basisName", "compilerDirectiveInsert", "compilerDirectiveDelete", "compilerDirectiveData", 
			"compilerDirectiveCallConvention", "compilerDirectiveCobolWords", "compilerDirectiveDisplay", 
			"compilerDirectiveFlag02", "compilerDirectiveFlag14", "compilerDirectiveJavaCallable", 
			"compilerDirectiveJavaShareable", "compilerDirectiveLeapSecond", "compilerDirectiveListing", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'('", null, null, null, null, null, null, null, null, null, null, 
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
			null, null, "')'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'*>'", "','", "'>>'", "'.'", "'=='", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'*'", "'='", "'>'", "'<'", "'+'", null, "'/'", "'<>'", "'>='", "'<='"
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
			"INL", "INLINE", "INSERT", "INVD", "INVDATA", "JA", "JAVAIOP", "JAVA64", 
			"JP", "JVMINITOPTIONS", "KA", "LANG", "LANGUAGE", "LAX", "LAXPERF", "LAXREDEF", 
			"LC", "LEADING", "LEASM", "LENGTH", "LIB", "LILIAN", "LIN", "LINECOUNT", 
			"LINKAGE", "LIST", "LM", "LONGMIXED", "LONGUPPER", "LP", "LPARENCHAR", 
			"LU", "LXPRF", "MAP", "MARGINS", "MAX", "MD", "MDECK", "MIG", "MIXED", 
			"MAXPCF", "MSG", "NAME", "NAT", "NATIONAL", "NATLANG", "NC", "NN", "NO", 
			"NOADATA", "NOADV", "NOALIAS", "NOALPHNUM", "NOAWO", "NOBIN", "NOBLOCK0", 
			"NOC", "NOCBLCARD", "NOCICS", "NOCLEANSIGN", "NOCMPR2", "NOCOMPILE", 
			"NOCOPYLOC", "NOCOPYRIGHT", "NOCPLC", "NOCPSM", "NOCPYR", "NOCS", "NOCURR", 
			"NOCURRENCY", "NOD", "NODATEPROC", "NODBCS", "NODE", "NODEBUG", "NODECK", 
			"NODEFINE", "NODEF", "NODIAGTRUNC", "NODLL", "NODSNAME", "NODU", "NODUMP", 
			"NODP", "NODTR", "NODWARF", "NODYN", "NODYNAM", "NOEDF", "NOEJPD", "NOENDP", 
			"NOENDPERIOD", "NOEPILOG", "NOEVENP", "NOEVENPACK", "NOEXIT", "NOEXP", 
			"NOEXPORTALL", "NOF", "NOFASTSRT", "NOFEPI", "NOFLAG", "NOFLAGMIG", "NOFLAGSTD", 
			"NOFNC", "NOFORCENUMCMP", "NOFSRT", "NOGRAPHIC", "NOHOOK", "NOINITCHECK", 
			"NOIC", "NOINITIAL", "NOINLINE", "NOINL", "NOINVD", "NOINVDATA", "NOJAVAIOP", 
			"NOJAVA64", "NOLAXPERF", "NOLAXREDEF", "NOLENGTH", "NOLIB", "NOLINKAGE", 
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
			"OUTDD", "OUTPATH", "PAC", "PARMCHECK", "PATH", "PC", "PFD", "PPTDBG", 
			"PGMN", "PGMNAME", "PRESERVE", "PROCESS", "PROLOG", "QUALIFY", "QUA", 
			"QUOTE", "RENT", "REPLACE", "REPLACING", "RMODE", "RPARENCHAR", "RULES", 
			"SEP", "SEPARATE", "SEQ", "SEQUENCE", "SERV", "SERVICE", "SHORT", "SIZE", 
			"SLACKBYTES", "SLCKB", "SOURCE", "SP", "SPACE", "SPIE", "SQL", "SQLC", 
			"SQLCCSID", "SQLIMS", "SKIP1", "SKIP2", "SKIP3", "SO", "SS", "SSR", "SSRANGE", 
			"STANDARD", "STD", "STGOPT", "STRICT", "STRICTREDEF", "SUCC", "SUPP", 
			"SUPPRESS", "SYSEIB", "SZ", "TERM", "TERMINAL", "TEST", "THREAD", "TITLE", 
			"TRAILING", "TRIG", "TRUNC", "TRUNCBIN", "TUNE", "UE", "UNREF", "UPPER", 
			"VBREF", "VLR", "VOLATILE", "VS", "VSAMOPENFS", "WD", "WORD", "XMLPARSE", 
			"XMLSS", "XOPTS", "XP", "XREF", "YEARWINDOW", "YW", "ZC", "ZD", "ZLEN", 
			"ZON", "ZONECHECK", "ZONEDATA", "ZWB", "C_CHAR", "D_CHAR", "E_CHAR", 
			"F_CHAR", "H_CHAR", "I_CHAR", "M_CHAR", "N_CHAR", "O_CHAR", "Q_CHAR", 
			"S_CHAR", "U_CHAR", "W_CHAR", "X_CHAR", "COMMENTTAG", "COMMACHAR", "COMPILER_DIRECTIVE_TAG", 
			"DOT", "DOUBLEEQUALCHAR", "NONNUMERICLITERAL", "CONTINUED_NONNUMERICLITERAL", 
			"NUMERICLITERAL", "IDENTIFIER", "FILENAME", "PSEUDOTEXTIDENTIFIER", "NEWLINE", 
			"COMMENTLINE", "WS", "TEXT", "BOL", "CLASSIC_COMMENT_TEXT", "PAGE_COMMENT_TEXT", 
			"CD_WS", "CD_CLASSIC_EOL_COMMENT", "ASTERISKCHAR", "EQUALCHAR", "GREATERTHANCHAR", 
			"LESSTHANCHAR", "PLUSCHAR", "MINUSCHAR", "SLASHCHAR", "NOTEQUALCHAR", 
			"GREATEROREQUALCHAR", "LESSOREQUALCHAR", "ZERO", "ALL", "AS", "AND", 
			"CALL_CONVENTION", "CALLINT", "CALLINTERFACE", "CHECKING", "COBOL", "COBOL_WORDS", 
			"COMP_DIR_DATA", "DISPLAY", "DEFINED", "DLL_INTERFACE", "DYNAMIC", "ELSE", 
			"END_EVALUATE", "END_IF", "EQUAL", "EQUATE", "EVALUATE", "FIXED", "FLAG_02", 
			"FLAG_14", "FORMAT", "COMP_DIR_FREE", "GREATER", "IF", "IS", "JAVA_CALLABLE", 
			"JAVA_SHAREABLE", "LEAP_SECOND", "LESS", "LISTING", "LOCATION", "NOT", 
			"COMP_DIR_OFF", "COMP_DIR_ON", "OR", "OTHER", "OVERRIDE", "PAGE", "PARAMETER", 
			"POP", "PROPOGATE", "PUSH", "REF_MOD_ZERO_LENGTH", "RESERVE", "STATIC", 
			"SUBSTITUTE", "THAN", "THROUGH", "THRU", "TO", "TRUE", "TURN", "UNDEFINE", 
			"UPON", "WHEN", "WITH", "BD_WS", "BD_CLASSIC_EOL_COMMENT", "SQL_TEXT", 
			"ES_CLASSIC_LINE_NUMBER", "CICS_TEXT", "EC_CLASSIC_LINE_NUMBER"
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
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXEC - 64)) | (1L << (EXEC_CICS - 64)) | (1L << (EXEC_SQL - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (ID - 64)) | (1L << (IDENTIFICATION - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAX - 128)) | (1L << (LAXPERF - 128)) | (1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODEF - 192)) | (1L << (NODIAGTRUNC - 192)) | (1L << (NODLL - 192)) | (1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOP - 256)) | (1L << (NOPAC - 256)) | (1L << (NOPARMCHECK - 256)) | (1L << (NOPFD - 256)) | (1L << (NOPRESERVE - 256)) | (1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OMITODOMIN - 320)) | (1L << (OOM - 320)) | (1L << (OP - 320)) | (1L << (OPMARGINS - 320)) | (1L << (OPSEQUENCE - 320)) | (1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SKIP1 - 320)) | (1L << (SKIP2 - 320)) | (1L << (SKIP3 - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (SUPPRESS - 384)) | (1L << (SYSEIB - 384)) | (1L << (SZ - 384)) | (1L << (TERM - 384)) | (1L << (TERMINAL - 384)) | (1L << (TEST - 384)) | (1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (COMPILER_DIRECTIVE_TAG - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)))) != 0) || ((((_la - 449)) & ~0x3f) == 0 && ((1L << (_la - 449)) & ((1L << (TEXT - 449)) | (1L << (PLUSCHAR - 449)) | (1L << (OR - 449)))) != 0) || ((((_la - 513)) & ~0x3f) == 0 && ((1L << (_la - 513)) & ((1L << (STATIC - 513)) | (1L << (TO - 513)) | (1L << (TRUE - 513)) | (1L << (WHEN - 513)))) != 0)) {
				{
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(190);
					identificationDivisionTag();
					}
					break;
				case 2:
					{
					setState(191);
					compilerOptions();
					}
					break;
				case 3:
					{
					setState(192);
					compilerDirectiveStatement();
					}
					break;
				case 4:
					{
					setState(193);
					classicCommentEntry();
					}
					break;
				case 5:
					{
					setState(194);
					copyStatement();
					}
					break;
				case 6:
					{
					setState(195);
					execCicsStatement();
					}
					break;
				case 7:
					{
					setState(196);
					execSqlStatement();
					}
					break;
				case 8:
					{
					setState(197);
					execSqlImsStatement();
					}
					break;
				case 9:
					{
					setState(198);
					replaceOffStatement();
					}
					break;
				case 10:
					{
					setState(199);
					replaceArea();
					}
					break;
				case 11:
					{
					setState(200);
					ejectStatement();
					}
					break;
				case 12:
					{
					setState(201);
					skipStatement();
					}
					break;
				case 13:
					{
					setState(202);
					titleStatement();
					}
					break;
				case 14:
					{
					setState(203);
					charDataLine();
					}
					break;
				case 15:
					{
					setState(204);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDENTIFICATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
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
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==CBL || _la==PROCESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(221); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(221);
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
					case JAVAIOP:
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
					case NOJAVAIOP:
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
						setState(217);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(216);
							match(COMMACHAR);
							}
						}

						setState(219);
						compilerOption();
						}
						break;
					case XOPTS:
						{
						setState(220);
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
				setState(223); 
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
			setState(225);
			match(XOPTS);
			setState(226);
			match(LPARENCHAR);
			setState(227);
			compilerOption();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AWO) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << CBLCARD) | (1L << CICS) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DEBUG) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DLL - 65)) | (1L << (DP - 65)) | (1L << (DS - 65)) | (1L << (DTR - 65)) | (1L << (DU - 65)) | (1L << (DUMP - 65)) | (1L << (DWARF - 65)) | (1L << (DYN - 65)) | (1L << (DYNAM - 65)) | (1L << (EDF - 65)) | (1L << (EJPD - 65)) | (1L << (EPILOG - 65)) | (1L << (EXIT - 65)) | (1L << (EXP - 65)) | (1L << (EXPORTALL - 65)) | (1L << (FASTSRT - 65)) | (1L << (FEPI - 65)) | (1L << (FLAG - 65)) | (1L << (FLAGSTD - 65)) | (1L << (FSRT - 65)) | (1L << (GDS - 65)) | (1L << (GRAPHIC - 65)) | (1L << (HGPR - 65)) | (1L << (HOOK - 65)) | (1L << (IC - 65)) | (1L << (INITCHECK - 65)) | (1L << (INTDATE - 65)) | (1L << (INITIAL - 65)) | (1L << (INL - 65)) | (1L << (INLINE - 65)) | (1L << (INVD - 65)) | (1L << (INVDATA - 65)) | (1L << (JAVAIOP - 65)) | (1L << (LANG - 65)) | (1L << (LANGUAGE - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (LC - 131)) | (1L << (LEASM - 131)) | (1L << (LENGTH - 131)) | (1L << (LIB - 131)) | (1L << (LIN - 131)) | (1L << (LINECOUNT - 131)) | (1L << (LINKAGE - 131)) | (1L << (LIST - 131)) | (1L << (LP - 131)) | (1L << (MAP - 131)) | (1L << (MARGINS - 131)) | (1L << (MD - 131)) | (1L << (MDECK - 131)) | (1L << (MAXPCF - 131)) | (1L << (NAME - 131)) | (1L << (NATLANG - 131)) | (1L << (NC - 131)) | (1L << (NOADATA - 131)) | (1L << (NOADV - 131)) | (1L << (NOAWO - 131)) | (1L << (NOBLOCK0 - 131)) | (1L << (NOC - 131)) | (1L << (NOCBLCARD - 131)) | (1L << (NOCICS - 131)) | (1L << (NOCMPR2 - 131)) | (1L << (NOCOMPILE - 131)) | (1L << (NOCOPYLOC - 131)) | (1L << (NOCOPYRIGHT - 131)) | (1L << (NOCPLC - 131)) | (1L << (NOCPSM - 131)) | (1L << (NOCPYR - 131)) | (1L << (NOCURR - 131)) | (1L << (NOCURRENCY - 131)) | (1L << (NOD - 131)) | (1L << (NODATEPROC - 131)) | (1L << (NODBCS - 131)) | (1L << (NODE - 131)) | (1L << (NODEBUG - 131)) | (1L << (NODECK - 131)) | (1L << (NODEFINE - 131)) | (1L << (NODEF - 131)) | (1L << (NODIAGTRUNC - 131)) | (1L << (NODLL - 131)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (NODU - 196)) | (1L << (NODUMP - 196)) | (1L << (NODP - 196)) | (1L << (NODTR - 196)) | (1L << (NODWARF - 196)) | (1L << (NODYN - 196)) | (1L << (NODYNAM - 196)) | (1L << (NOEDF - 196)) | (1L << (NOEJPD - 196)) | (1L << (NOEPILOG - 196)) | (1L << (NOEXIT - 196)) | (1L << (NOEXP - 196)) | (1L << (NOEXPORTALL - 196)) | (1L << (NOF - 196)) | (1L << (NOFASTSRT - 196)) | (1L << (NOFEPI - 196)) | (1L << (NOFLAG - 196)) | (1L << (NOFLAGMIG - 196)) | (1L << (NOFLAGSTD - 196)) | (1L << (NOFSRT - 196)) | (1L << (NOGRAPHIC - 196)) | (1L << (NOHOOK - 196)) | (1L << (NOINITCHECK - 196)) | (1L << (NOIC - 196)) | (1L << (NOINITIAL - 196)) | (1L << (NOINLINE - 196)) | (1L << (NOINL - 196)) | (1L << (NOINVD - 196)) | (1L << (NOINVDATA - 196)) | (1L << (NOJAVAIOP - 196)) | (1L << (NOLENGTH - 196)) | (1L << (NOLIB - 196)) | (1L << (NOLINKAGE - 196)) | (1L << (NOLIST - 196)) | (1L << (NOMAP - 196)) | (1L << (NOMD - 196)) | (1L << (NOMDECK - 196)) | (1L << (NONAME - 196)) | (1L << (NONUM - 196)) | (1L << (NONUMBER - 196)) | (1L << (NOOBJ - 196)) | (1L << (NOOBJECT - 196)) | (1L << (NOOFF - 196)) | (1L << (NOOFFSET - 196)) | (1L << (NOOPSEQUENCE - 196)) | (1L << (NOOPT - 196)) | (1L << (NOOPTIMIZE - 196)) | (1L << (NOOPTIONS - 196)) | (1L << (NOP - 196)) | (1L << (NOPARMCHECK - 196)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (NOPROLOG - 261)) | (1L << (NORENT - 261)) | (1L << (NORULES - 261)) | (1L << (NOS - 261)) | (1L << (NOSEP - 261)) | (1L << (NOSEPARATE - 261)) | (1L << (NOSEQ - 261)) | (1L << (NOSERV - 261)) | (1L << (NOSERVICE - 261)) | (1L << (NOSO - 261)) | (1L << (NOSOURCE - 261)) | (1L << (NOSPIE - 261)) | (1L << (NOSQL - 261)) | (1L << (NOSQLC - 261)) | (1L << (NOSQLCCSID - 261)) | (1L << (NOSQLIMS - 261)) | (1L << (NOSSR - 261)) | (1L << (NOSSRANGE - 261)) | (1L << (NOSTDTRUNC - 261)) | (1L << (NOSEQUENCE - 261)) | (1L << (NOSTGOPT - 261)) | (1L << (NOSUPP - 261)) | (1L << (NOSUPPRESS - 261)) | (1L << (NOTERM - 261)) | (1L << (NOTERMINAL - 261)) | (1L << (NOTEST - 261)) | (1L << (NOTHREAD - 261)) | (1L << (NOVBREF - 261)) | (1L << (NOWD - 261)) | (1L << (NOWORD - 261)) | (1L << (NOX - 261)) | (1L << (NOXREF - 261)) | (1L << (NOZC - 261)) | (1L << (NOZONECHECK - 261)) | (1L << (NOZWB - 261)) | (1L << (NS - 261)) | (1L << (NSEQ - 261)) | (1L << (NSYMBOL - 261)) | (1L << (NUM - 261)) | (1L << (NUMBER - 261)) | (1L << (NUMCHECK - 261)) | (1L << (NUMPROC - 261)) | (1L << (OBJ - 261)) | (1L << (OBJECT - 261)) | (1L << (OFF - 261)) | (1L << (OFFSET - 261)) | (1L << (OP - 261)) | (1L << (OPMARGINS - 261)) | (1L << (OPSEQUENCE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (OPT - 325)) | (1L << (OPTFILE - 325)) | (1L << (OPTIMIZE - 325)) | (1L << (OPTIONS - 325)) | (1L << (OUT - 325)) | (1L << (OUTDD - 325)) | (1L << (PARMCHECK - 325)) | (1L << (PC - 325)) | (1L << (PGMN - 325)) | (1L << (PGMNAME - 325)) | (1L << (PROLOG - 325)) | (1L << (QUALIFY - 325)) | (1L << (QUA - 325)) | (1L << (QUOTE - 325)) | (1L << (RENT - 325)) | (1L << (RMODE - 325)) | (1L << (RULES - 325)) | (1L << (SEP - 325)) | (1L << (SEPARATE - 325)) | (1L << (SEQ - 325)) | (1L << (SEQUENCE - 325)) | (1L << (SERV - 325)) | (1L << (SERVICE - 325)) | (1L << (SIZE - 325)) | (1L << (SOURCE - 325)) | (1L << (SP - 325)) | (1L << (SPACE - 325)) | (1L << (SPIE - 325)) | (1L << (SQL - 325)) | (1L << (SQLC - 325)) | (1L << (SQLCCSID - 325)) | (1L << (SQLIMS - 325)) | (1L << (SO - 325)) | (1L << (SSR - 325)) | (1L << (SSRANGE - 325)) | (1L << (STGOPT - 325)) | (1L << (SUPP - 325)) | (1L << (SUPPRESS - 325)) | (1L << (SYSEIB - 325)) | (1L << (SZ - 325)) | (1L << (TERM - 325)) | (1L << (TERMINAL - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (TEST - 389)) | (1L << (THREAD - 389)) | (1L << (TRUNC - 389)) | (1L << (TUNE - 389)) | (1L << (VBREF - 389)) | (1L << (VLR - 389)) | (1L << (VS - 389)) | (1L << (VSAMOPENFS - 389)) | (1L << (WD - 389)) | (1L << (WORD - 389)) | (1L << (XMLPARSE - 389)) | (1L << (XP - 389)) | (1L << (XREF - 389)) | (1L << (YEARWINDOW - 389)) | (1L << (YW - 389)) | (1L << (ZC - 389)) | (1L << (ZD - 389)) | (1L << (ZONECHECK - 389)) | (1L << (ZONEDATA - 389)) | (1L << (ZWB - 389)) | (1L << (C_CHAR - 389)) | (1L << (D_CHAR - 389)) | (1L << (F_CHAR - 389)) | (1L << (Q_CHAR - 389)) | (1L << (S_CHAR - 389)) | (1L << (X_CHAR - 389)) | (1L << (COMMACHAR - 389)))) != 0)) {
				{
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(228);
					match(COMMACHAR);
					}
				}

				setState(231);
				compilerOption();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		public JavaiopContext javaiop() {
			return getRuleContext(JavaiopContext.class,0);
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
		public TerminalNode NOJAVAIOP() { return getToken(CobolPreprocessorParser.NOJAVAIOP, 0); }
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
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(ADATA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(ADV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(241);
				match(AFP);
				setState(242);
				match(LPARENCHAR);
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==NOVOLATILE || _la==VOLATILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				match(RPARENCHAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(APOST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(246);
				match(ARCH);
				setState(247);
				match(LPARENCHAR);
				setState(248);
				literal();
				setState(249);
				match(RPARENCHAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==AR || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				match(LPARENCHAR);
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				match(RPARENCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				match(AWO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(BLOCK0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==BUF || _la==BUFSIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				match(LPARENCHAR);
				setState(259);
				literal();
				setState(260);
				match(RPARENCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				match(CBLCARD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(263);
				match(CICS);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(264);
					match(LPARENCHAR);
					setState(265);
					literal();
					setState(266);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(270);
				match(COBOL2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(271);
				match(COBOL3);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==CODEPAGE || _la==CP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				match(LPARENCHAR);
				setState(274);
				literal();
				setState(275);
				match(RPARENCHAR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(277);
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
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==COPYLOC || _la==CPLC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(279);
				match(LPARENCHAR);
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(280);
					match(IDENTIFIER);
					}
					break;
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(281);
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
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(284);
						match(COMMACHAR);
						}
					}

					setState(287);
					match(DSN);
					setState(288);
					match(LPARENCHAR);
					setState(289);
					match(FILENAME);
					setState(290);
					match(RPARENCHAR);
					}
					break;
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATH || _la==COMMACHAR) {
					{
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(293);
						match(COMMACHAR);
						}
					}

					setState(296);
					match(PATH);
					setState(297);
					match(LPARENCHAR);
					setState(298);
					literal();
					setState(299);
					match(RPARENCHAR);
					}
				}

				setState(303);
				match(RPARENCHAR);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==COPYRIGHT || _la==CPYR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				match(LPARENCHAR);
				setState(306);
				literal();
				setState(307);
				match(RPARENCHAR);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(309);
				match(CPP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(310);
				match(CPSM);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==CURR || _la==CURRENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				match(LPARENCHAR);
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(313);
					match(TEXT);
					}
					}
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(318);
				match(RPARENCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(319);
				match(DATA);
				setState(320);
				match(LPARENCHAR);
				setState(321);
				literal();
				setState(322);
				match(RPARENCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(324);
				_la = _input.LA(1);
				if ( !(_la==DATEPROC || _la==DP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(325);
					match(LPARENCHAR);
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FLAG || _la==NOFLAG) {
						{
						setState(326);
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

					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(329);
						match(COMMACHAR);
						}
					}

					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOTRIG || _la==TRIG) {
						{
						setState(332);
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

					setState(335);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(338);
				match(DBCS);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(339);
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
				setState(340);
				match(DEBUG);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(341);
				define_opt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(342);
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
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==DISPSIGN || _la==DS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(344);
				match(LPARENCHAR);
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==SEP || _la==C_CHAR || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				match(RPARENCHAR);
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(347);
				match(DLL);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(348);
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
				setState(349);
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
				setState(350);
				match(EDF);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(351);
				match(EPILOG);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(352);
				match(EXIT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(353);
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
				setState(354);
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
				setState(355);
				match(FEPI);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(356);
				_la = _input.LA(1);
				if ( !(_la==FLAG || _la==F_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(357);
				match(LPARENCHAR);
				setState(358);
				_la = _input.LA(1);
				if ( !(((((_la - 423)) & ~0x3f) == 0 && ((1L << (_la - 423)) & ((1L << (E_CHAR - 423)) | (1L << (I_CHAR - 423)) | (1L << (S_CHAR - 423)) | (1L << (U_CHAR - 423)) | (1L << (W_CHAR - 423)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(359);
					match(COMMACHAR);
					setState(360);
					_la = _input.LA(1);
					if ( !(((((_la - 423)) & ~0x3f) == 0 && ((1L << (_la - 423)) & ((1L << (E_CHAR - 423)) | (1L << (I_CHAR - 423)) | (1L << (S_CHAR - 423)) | (1L << (U_CHAR - 423)) | (1L << (W_CHAR - 423)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(363);
				match(RPARENCHAR);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(364);
				match(FLAGSTD);
				setState(365);
				match(LPARENCHAR);
				setState(366);
				_la = _input.LA(1);
				if ( !(((((_la - 425)) & ~0x3f) == 0 && ((1L << (_la - 425)) & ((1L << (H_CHAR - 425)) | (1L << (I_CHAR - 425)) | (1L << (M_CHAR - 425)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(367);
					match(COMMACHAR);
					setState(368);
					_la = _input.LA(1);
					if ( !(_la==DD || _la==NN || ((((_la - 374)) & ~0x3f) == 0 && ((1L << (_la - 374)) & ((1L << (SS - 374)) | (1L << (D_CHAR - 374)) | (1L << (N_CHAR - 374)) | (1L << (S_CHAR - 374)))) != 0)) ) {
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
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(371);
					match(COMMACHAR);
					setState(372);
					match(O_CHAR);
					}
				}

				setState(375);
				match(RPARENCHAR);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(376);
				match(GDS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(377);
				match(GRAPHIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(378);
				match(HGPR);
				setState(379);
				match(LPARENCHAR);
				setState(380);
				_la = _input.LA(1);
				if ( !(_la==NOPRESERVE || _la==PRESERVE) ) {
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
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(382);
				match(INTDATE);
				setState(383);
				match(LPARENCHAR);
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==ANSI || _la==LILIAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				match(RPARENCHAR);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==IC || _la==INITCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(387);
					match(LPARENCHAR);
					setState(388);
					_la = _input.LA(1);
					if ( !(_la==LAX || _la==STRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(389);
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
				setState(392);
				match(INITIAL);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(393);
				match(INLINE);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(394);
				match(INL);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				{
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==INVD || _la==INVDATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(396);
					match(LPARENCHAR);
					setState(397);
					invdata_opts();
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(398);
						match(COMMACHAR);
						setState(399);
						invdata_opts();
						}
						}
						setState(404);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(405);
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
				setState(409);
				javaiop();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==LANG || _la==LANGUAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				match(LPARENCHAR);
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==CS || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (EN - 79)) | (1L << (ENGLISH - 79)) | (1L << (JA - 79)) | (1L << (JP - 79)) | (1L << (KA - 79)))) != 0) || _la==UE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(413);
				match(RPARENCHAR);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(414);
				match(LEASM);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(415);
				match(LENGTH);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(416);
				match(LIB);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(417);
				match(LIN);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(418);
				_la = _input.LA(1);
				if ( !(_la==LC || _la==LINECOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(419);
				match(LPARENCHAR);
				setState(420);
				literal();
				setState(421);
				match(RPARENCHAR);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(423);
				match(LINKAGE);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(424);
				match(LIST);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				{
				setState(425);
				match(LP);
				setState(426);
				match(LPARENCHAR);
				setState(427);
				literal();
				setState(428);
				match(RPARENCHAR);
				}
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				{
				setState(430);
				match(MAP);
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(431);
					match(LPARENCHAR);
					setState(432);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(433);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(436);
				match(MARGINS);
				setState(437);
				match(LPARENCHAR);
				setState(438);
				literal();
				setState(439);
				match(COMMACHAR);
				setState(440);
				literal();
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(441);
					match(COMMACHAR);
					setState(442);
					literal();
					}
				}

				setState(445);
				match(RPARENCHAR);
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				{
				setState(447);
				match(MAXPCF);
				setState(448);
				match(LPARENCHAR);
				setState(449);
				literal();
				setState(450);
				match(RPARENCHAR);
				}
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(452);
				_la = _input.LA(1);
				if ( !(_la==MD || _la==MDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(453);
					match(LPARENCHAR);
					setState(454);
					_la = _input.LA(1);
					if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(455);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(458);
				match(NAME);
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(459);
					match(LPARENCHAR);
					setState(460);
					_la = _input.LA(1);
					if ( !(_la==ALIAS || _la==NOALIAS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(461);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(464);
				match(NATLANG);
				setState(465);
				match(LPARENCHAR);
				setState(466);
				_la = _input.LA(1);
				if ( !(_la==CS || _la==EN || _la==KA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(467);
				match(RPARENCHAR);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(468);
				match(NOADATA);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(469);
				match(NOADV);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(470);
				match(NOAWO);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(471);
				match(NOBLOCK0);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(472);
				match(NOCBLCARD);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(473);
				match(NOCICS);
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(474);
				match(NOCMPR2);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(475);
				_la = _input.LA(1);
				if ( !(_la==NOC || _la==NOCOMPILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(476);
					match(LPARENCHAR);
					setState(477);
					_la = _input.LA(1);
					if ( !(((((_la - 423)) & ~0x3f) == 0 && ((1L << (_la - 423)) & ((1L << (E_CHAR - 423)) | (1L << (S_CHAR - 423)) | (1L << (W_CHAR - 423)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(478);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(481);
				match(NOCOPYLOC);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(482);
				match(NOCPLC);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(483);
				match(NOCOPYRIGHT);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(484);
				match(NOCPYR);
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(485);
				match(NOCPSM);
				}
				break;
			case 78:
				enterOuterAlt(_localctx, 78);
				{
				setState(486);
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
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(487);
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
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(488);
				match(NODBCS);
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 81);
				{
				setState(489);
				match(NODEBUG);
				}
				break;
			case 82:
				enterOuterAlt(_localctx, 82);
				{
				setState(490);
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
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(491);
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
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(492);
				match(NODLL);
				}
				break;
			case 85:
				enterOuterAlt(_localctx, 85);
				{
				setState(493);
				match(NODE);
				}
				break;
			case 86:
				enterOuterAlt(_localctx, 86);
				{
				setState(494);
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
			case 87:
				enterOuterAlt(_localctx, 87);
				{
				setState(495);
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
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(496);
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
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(497);
				match(NOEDF);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(498);
				match(NOEPILOG);
				}
				break;
			case 91:
				enterOuterAlt(_localctx, 91);
				{
				setState(499);
				match(NOEXIT);
				}
				break;
			case 92:
				enterOuterAlt(_localctx, 92);
				{
				setState(500);
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
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(501);
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
			case 94:
				enterOuterAlt(_localctx, 94);
				{
				setState(502);
				match(NOFEPI);
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(503);
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
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(504);
				match(NOFLAGMIG);
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(505);
				match(NOFLAGSTD);
				}
				break;
			case 98:
				enterOuterAlt(_localctx, 98);
				{
				setState(506);
				match(NOGRAPHIC);
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(507);
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
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(508);
				match(NOINITIAL);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(509);
				match(NOINLINE);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(510);
				match(NOINL);
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(511);
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
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(512);
				match(NOJAVAIOP);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(513);
				match(NOLENGTH);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(514);
				match(NOLIB);
				}
				break;
			case 107:
				enterOuterAlt(_localctx, 107);
				{
				setState(515);
				match(NOLINKAGE);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(516);
				match(NOLIST);
				}
				break;
			case 109:
				enterOuterAlt(_localctx, 109);
				{
				setState(517);
				match(NOMAP);
				}
				break;
			case 110:
				enterOuterAlt(_localctx, 110);
				{
				setState(518);
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
			case 111:
				enterOuterAlt(_localctx, 111);
				{
				setState(519);
				match(NONAME);
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(520);
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
			case 113:
				enterOuterAlt(_localctx, 113);
				{
				setState(521);
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
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(522);
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
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(523);
				match(NOOPSEQUENCE);
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(524);
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
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(525);
				match(NOOPTIONS);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(526);
				match(NOP);
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(527);
				match(NOPARMCHECK);
				}
				break;
			case 120:
				enterOuterAlt(_localctx, 120);
				{
				setState(528);
				match(NOPROLOG);
				}
				break;
			case 121:
				enterOuterAlt(_localctx, 121);
				{
				setState(529);
				match(NORENT);
				}
				break;
			case 122:
				enterOuterAlt(_localctx, 122);
				{
				setState(530);
				match(NORULES);
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(531);
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
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(532);
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
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(533);
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
			case 126:
				enterOuterAlt(_localctx, 126);
				{
				setState(534);
				match(NOSPIE);
				}
				break;
			case 127:
				enterOuterAlt(_localctx, 127);
				{
				setState(535);
				match(NOSQL);
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(536);
				match(NOSQLIMS);
				}
				break;
			case 129:
				enterOuterAlt(_localctx, 129);
				{
				setState(537);
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
			case 130:
				enterOuterAlt(_localctx, 130);
				{
				setState(538);
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
			case 131:
				enterOuterAlt(_localctx, 131);
				{
				setState(539);
				match(NOSTDTRUNC);
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(540);
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
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(541);
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
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(542);
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
			case 135:
				enterOuterAlt(_localctx, 135);
				{
				setState(543);
				match(NOTEST);
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(544);
				match(NOTHREAD);
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(545);
				match(NOVBREF);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(546);
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
			case 139:
				enterOuterAlt(_localctx, 139);
				{
				setState(547);
				match(NSEQ);
				}
				break;
			case 140:
				enterOuterAlt(_localctx, 140);
				{
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==NS || _la==NSYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(549);
				match(LPARENCHAR);
				setState(550);
				_la = _input.LA(1);
				if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(551);
				match(RPARENCHAR);
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(552);
				match(NOVBREF);
				}
				break;
			case 142:
				enterOuterAlt(_localctx, 142);
				{
				setState(553);
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
			case 143:
				enterOuterAlt(_localctx, 143);
				{
				setState(554);
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
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(555);
				match(NOZWB);
				}
				break;
			case 145:
				enterOuterAlt(_localctx, 145);
				{
				setState(556);
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
			case 146:
				enterOuterAlt(_localctx, 146);
				{
				{
				setState(557);
				_la = _input.LA(1);
				if ( !(_la==NC || _la==NUMCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(558);
					match(LPARENCHAR);
					setState(559);
					numcheck_opts();
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(560);
						match(COMMACHAR);
						setState(561);
						numcheck_opts();
						}
						}
						setState(566);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(567);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(571);
				match(NUMPROC);
				setState(572);
				match(LPARENCHAR);
				setState(573);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(574);
				match(RPARENCHAR);
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(575);
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
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(576);
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
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(577);
				match(OPMARGINS);
				setState(578);
				match(LPARENCHAR);
				setState(579);
				literal();
				setState(580);
				match(COMMACHAR);
				setState(581);
				literal();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(582);
					match(COMMACHAR);
					setState(583);
					literal();
					}
				}

				setState(586);
				match(RPARENCHAR);
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(588);
				match(OPSEQUENCE);
				setState(589);
				match(LPARENCHAR);
				setState(590);
				literal();
				setState(591);
				match(COMMACHAR);
				setState(592);
				literal();
				setState(593);
				match(RPARENCHAR);
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(595);
				_la = _input.LA(1);
				if ( !(_la==OPT || _la==OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(596);
					match(LPARENCHAR);
					setState(597);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==STD || _la==NUMERICLITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(598);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				setState(601);
				match(OPTFILE);
				}
				break;
			case 154:
				enterOuterAlt(_localctx, 154);
				{
				setState(602);
				match(OPTIONS);
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(603);
				match(OP);
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				setState(604);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==OUTDD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(605);
				match(LPARENCHAR);
				setState(606);
				cobolWord();
				setState(607);
				match(RPARENCHAR);
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				{
				setState(609);
				_la = _input.LA(1);
				if ( !(_la==PARMCHECK || _la==PC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(610);
					match(LPARENCHAR);
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABD || _la==MSG) {
						{
						setState(611);
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

					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 436)) & ~0x3f) == 0 && ((1L << (_la - 436)) & ((1L << (COMMACHAR - 436)) | (1L << (NONNUMERICLITERAL - 436)) | (1L << (CONTINUED_NONNUMERICLITERAL - 436)) | (1L << (NUMERICLITERAL - 436)))) != 0)) {
						{
						setState(615);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(614);
							match(COMMACHAR);
							}
						}

						setState(617);
						literal();
						}
					}

					setState(620);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 158:
				enterOuterAlt(_localctx, 158);
				{
				setState(623);
				_la = _input.LA(1);
				if ( !(_la==PGMN || _la==PGMNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(624);
				match(LPARENCHAR);
				setState(625);
				_la = _input.LA(1);
				if ( !(_la==CO || _la==COMPAT || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (LM - 141)) | (1L << (LONGMIXED - 141)) | (1L << (LONGUPPER - 141)) | (1L << (LU - 141)) | (1L << (MIXED - 141)))) != 0) || ((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (UPPER - 399)) | (1L << (M_CHAR - 399)) | (1L << (U_CHAR - 399)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(626);
				match(RPARENCHAR);
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(627);
				match(PROLOG);
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				{
				setState(628);
				_la = _input.LA(1);
				if ( !(_la==QUALIFY || _la==QUA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(629);
				match(LPARENCHAR);
				setState(630);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(631);
				match(RPARENCHAR);
				}
				}
				break;
			case 161:
				enterOuterAlt(_localctx, 161);
				{
				setState(632);
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
			case 162:
				enterOuterAlt(_localctx, 162);
				{
				setState(633);
				match(RENT);
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(634);
				match(RMODE);
				setState(635);
				match(LPARENCHAR);
				setState(639);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
					{
					setState(636);
					match(ANY);
					}
					break;
				case AUTO:
					{
					setState(637);
					match(AUTO);
					}
					break;
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(638);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(641);
				match(RPARENCHAR);
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				{
				setState(642);
				match(RULES);
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(643);
					match(LPARENCHAR);
					setState(644);
					rules_opts();
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(645);
						match(COMMACHAR);
						setState(646);
						rules_opts();
						}
						}
						setState(651);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(652);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 165:
				enterOuterAlt(_localctx, 165);
				{
				setState(656);
				_la = _input.LA(1);
				if ( !(_la==SEQ || _la==SEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(657);
					match(LPARENCHAR);
					setState(658);
					literal();
					setState(659);
					match(COMMACHAR);
					setState(660);
					literal();
					setState(661);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				{
				setState(665);
				_la = _input.LA(1);
				if ( !(_la==SERV || _la==SERVICE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(666);
				match(LPARENCHAR);
				setState(667);
				literal();
				setState(668);
				match(RPARENCHAR);
				}
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(670);
				_la = _input.LA(1);
				if ( !(_la==SIZE || _la==SZ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(671);
				match(LPARENCHAR);
				setState(674);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAX:
					{
					setState(672);
					match(MAX);
					}
					break;
				case NONNUMERICLITERAL:
				case CONTINUED_NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(673);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(676);
				match(RPARENCHAR);
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				{
				setState(677);
				_la = _input.LA(1);
				if ( !(_la==SOURCE || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(678);
					match(LPARENCHAR);
					setState(679);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(680);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(683);
				match(SP);
				}
				break;
			case 170:
				enterOuterAlt(_localctx, 170);
				{
				setState(684);
				match(SPACE);
				setState(685);
				match(LPARENCHAR);
				setState(686);
				literal();
				setState(687);
				match(RPARENCHAR);
				}
				break;
			case 171:
				enterOuterAlt(_localctx, 171);
				{
				setState(689);
				match(SPIE);
				}
				break;
			case 172:
				enterOuterAlt(_localctx, 172);
				{
				setState(690);
				match(SQL);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(691);
					match(LPARENCHAR);
					setState(692);
					literal();
					setState(693);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 173:
				enterOuterAlt(_localctx, 173);
				{
				setState(697);
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
			case 174:
				enterOuterAlt(_localctx, 174);
				{
				setState(698);
				match(SQLIMS);
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(699);
					match(LPARENCHAR);
					setState(700);
					literal();
					setState(701);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				{
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==SSR || _la==SSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(706);
					match(LPARENCHAR);
					setState(707);
					ssrange_opts();
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(708);
						match(COMMACHAR);
						setState(709);
						ssrange_opts();
						}
						}
						setState(714);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(715);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 176:
				enterOuterAlt(_localctx, 176);
				{
				setState(719);
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
			case 177:
				enterOuterAlt(_localctx, 177);
				{
				setState(720);
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
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(721);
				match(SYSEIB);
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(722);
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
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				{
				setState(723);
				match(TEST);
				setState(735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(724);
					match(LPARENCHAR);
					setState(725);
					test_opts();
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(726);
						match(COMMACHAR);
						setState(727);
						test_opts();
						}
						}
						setState(732);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(733);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				setState(737);
				match(THREAD);
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(738);
				match(TRUNC);
				setState(739);
				match(LPARENCHAR);
				setState(740);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==OPT || _la==STD) ) {
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
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				{
				setState(742);
				match(TUNE);
				setState(743);
				match(LPARENCHAR);
				setState(744);
				literal();
				setState(745);
				match(RPARENCHAR);
				}
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(747);
				match(VBREF);
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				{
				setState(748);
				match(VLR);
				setState(749);
				match(LPARENCHAR);
				setState(750);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 377)) & ~0x3f) == 0 && ((1L << (_la - 377)) & ((1L << (STANDARD - 377)) | (1L << (C_CHAR - 377)) | (1L << (S_CHAR - 377)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(751);
				match(RPARENCHAR);
				}
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				{
				setState(752);
				_la = _input.LA(1);
				if ( !(_la==VS || _la==VSAMOPENFS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(753);
				match(LPARENCHAR);
				setState(754);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 382)) & ~0x3f) == 0 && ((1L << (_la - 382)) & ((1L << (SUCC - 382)) | (1L << (C_CHAR - 382)) | (1L << (S_CHAR - 382)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(755);
				match(RPARENCHAR);
				}
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				setState(756);
				_la = _input.LA(1);
				if ( !(_la==WD || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(757);
				match(LPARENCHAR);
				setState(764);
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
					setState(758);
					cobolWord();
					}
					break;
				case TEXT:
					{
					setState(760); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(759);
						match(TEXT);
						}
						}
						setState(762); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(766);
				match(RPARENCHAR);
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(767);
				_la = _input.LA(1);
				if ( !(_la==XMLPARSE || _la==XP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(768);
				match(LPARENCHAR);
				setState(769);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 408)) & ~0x3f) == 0 && ((1L << (_la - 408)) & ((1L << (XMLSS - 408)) | (1L << (C_CHAR - 408)) | (1L << (X_CHAR - 408)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(770);
				match(RPARENCHAR);
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(771);
				_la = _input.LA(1);
				if ( !(_la==XREF || _la==X_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(772);
					match(LPARENCHAR);
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FULL || _la==SHORT) {
						{
						setState(773);
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

					setState(776);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 190:
				enterOuterAlt(_localctx, 190);
				{
				setState(779);
				_la = _input.LA(1);
				if ( !(_la==YEARWINDOW || _la==YW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(780);
				match(LPARENCHAR);
				setState(781);
				literal();
				setState(782);
				match(RPARENCHAR);
				}
				break;
			case 191:
				enterOuterAlt(_localctx, 191);
				{
				{
				setState(784);
				_la = _input.LA(1);
				if ( !(_la==ZC || _la==ZONECHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(785);
				match(LPARENCHAR);
				setState(786);
				_la = _input.LA(1);
				if ( !(_la==ABD || _la==MSG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(787);
				match(RPARENCHAR);
				}
				}
				break;
			case 192:
				enterOuterAlt(_localctx, 192);
				{
				{
				setState(788);
				_la = _input.LA(1);
				if ( !(_la==ZD || _la==ZONEDATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(789);
				match(LPARENCHAR);
				setState(790);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(791);
				match(RPARENCHAR);
				}
				}
				break;
			case 193:
				enterOuterAlt(_localctx, 193);
				{
				setState(792);
				match(ZWB);
				}
				break;
			case 194:
				enterOuterAlt(_localctx, 194);
				{
				setState(793);
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
			setState(796);
			_la = _input.LA(1);
			if ( !(_la==DEF || _la==DEFINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(797);
			match(LPARENCHAR);
			setState(798);
			identifier_et_al();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMACHAR || _la==TEXT) {
				{
				setState(805);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(800); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(799);
						match(TEXT);
						}
						}
						setState(802); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				case COMMACHAR:
					{
					setState(804);
					match(COMMACHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(807);
				literal();
				}
			}

			setState(810);
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
			setState(812);
			_la = _input.LA(1);
			if ( !(((((_la - 421)) & ~0x3f) == 0 && ((1L << (_la - 421)) & ((1L << (C_CHAR - 421)) | (1L << (D_CHAR - 421)) | (1L << (E_CHAR - 421)) | (1L << (F_CHAR - 421)) | (1L << (H_CHAR - 421)) | (1L << (I_CHAR - 421)) | (1L << (M_CHAR - 421)) | (1L << (N_CHAR - 421)) | (1L << (O_CHAR - 421)) | (1L << (Q_CHAR - 421)) | (1L << (S_CHAR - 421)) | (1L << (U_CHAR - 421)) | (1L << (W_CHAR - 421)) | (1L << (X_CHAR - 421)) | (1L << (IDENTIFIER - 421)))) != 0)) ) {
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
			setState(814);
			_la = _input.LA(1);
			if ( !(_la==CLEANSIGN || _la==CS || _la==FNC || _la==FORCENUMCMP || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (NOCLEANSIGN - 174)) | (1L << (NOCS - 174)) | (1L << (NOFNC - 174)) | (1L << (NOFORCENUMCMP - 174)))) != 0)) ) {
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
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(816);
				match(ZON);
				}
				break;
			case 2:
				{
				{
				setState(817);
				match(ZON);
				setState(818);
				match(LPARENCHAR);
				setState(819);
				numcheck_zon_opts();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMACHAR) {
					{
					{
					setState(820);
					match(COMMACHAR);
					setState(821);
					numcheck_zon_opts();
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(827);
				match(RPARENCHAR);
				}
				}
				break;
			case 3:
				{
				setState(829);
				match(NOZON);
				}
				break;
			case 4:
				{
				setState(830);
				match(PAC);
				}
				break;
			case 5:
				{
				setState(831);
				match(NOPAC);
				}
				break;
			case 6:
				{
				{
				setState(832);
				match(BIN);
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENCHAR) {
					{
					setState(833);
					match(LPARENCHAR);
					setState(834);
					_la = _input.LA(1);
					if ( !(_la==NOTRUNCBIN || _la==TRUNCBIN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(835);
					match(RPARENCHAR);
					}
				}

				}
				}
				break;
			case 7:
				{
				setState(838);
				match(NOBIN);
				}
				break;
			case 8:
				{
				setState(839);
				match(MSG);
				}
				break;
			case 9:
				{
				setState(840);
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
			setState(843);
			_la = _input.LA(1);
			if ( !(_la==ALPHNUM || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAX - 128)) | (1L << (LAXREDEF - 128)) | (1L << (NOALPHNUM - 128)))) != 0) || _la==STRICT || _la==STRICTREDEF) ) {
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
			setState(845);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ENDP - 80)) | (1L << (ENDPERIOD - 80)) | (1L << (EVENP - 80)) | (1L << (EVENPACK - 80)) | (1L << (LAXPERF - 80)) | (1L << (LAXREDEF - 80)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (LXPRF - 147)) | (1L << (NOENDP - 147)) | (1L << (NOENDPERIOD - 147)) | (1L << (NOEVENP - 147)) | (1L << (NOEVENPACK - 147)))) != 0) || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & ((1L << (NOLAXPERF - 233)) | (1L << (NOLAXREDEF - 233)) | (1L << (NOLXPRF - 233)) | (1L << (NOOMITODOMIN - 233)) | (1L << (NOOOM - 233)) | (1L << (NOSLACKBYTES - 233)) | (1L << (NOSLCKB - 233)) | (1L << (NOUNRA - 233)) | (1L << (NOUNREFALL - 233)) | (1L << (NOUNREFSOURCE - 233)) | (1L << (NOUNRS - 233)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OMITODOMIN - 320)) | (1L << (OOM - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)))) != 0) || _la==UNREF) ) {
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
			setState(847);
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
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DWARF:
				{
				setState(849);
				match(DWARF);
				}
				break;
			case NODWARF:
				{
				setState(850);
				match(NODWARF);
				}
				break;
			case HOOK:
				{
				setState(851);
				match(HOOK);
				}
				break;
			case NOHOOK:
				{
				setState(852);
				match(NOHOOK);
				}
				break;
			case SEP:
			case SEPARATE:
				{
				{
				setState(853);
				_la = _input.LA(1);
				if ( !(_la==SEP || _la==SEPARATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(854);
					match(LPARENCHAR);
					setState(855);
					_la = _input.LA(1);
					if ( !(_la==DSNAME || _la==NODSNAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(856);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case NOSEP:
				{
				setState(859);
				match(NOSEP);
				}
				break;
			case NOSEPARATE:
				{
				setState(860);
				match(NOSEPARATE);
				}
				break;
			case SO:
				{
				setState(861);
				match(SO);
				}
				break;
			case SOURCE:
				{
				setState(862);
				match(SOURCE);
				}
				break;
			case NOSO:
				{
				setState(863);
				match(NOSO);
				}
				break;
			case NOSOURCE:
				{
				setState(864);
				match(NOSOURCE);
				}
				break;
			case EJPD:
				{
				setState(865);
				match(EJPD);
				}
				break;
			case NOEJPD:
				{
				setState(866);
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

	public static class JavaiopContext extends ParserRuleContext {
		public TerminalNode JAVAIOP() { return getToken(CobolPreprocessorParser.JAVAIOP, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public List<JavaiopOptionContext> javaiopOption() {
			return getRuleContexts(JavaiopOptionContext.class);
		}
		public JavaiopOptionContext javaiopOption(int i) {
			return getRuleContext(JavaiopOptionContext.class,i);
		}
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolPreprocessorParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolPreprocessorParser.COMMACHAR, i);
		}
		public JavaiopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaiop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterJavaiop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitJavaiop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitJavaiop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaiopContext javaiop() throws RecognitionException {
		JavaiopContext _localctx = new JavaiopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_javaiop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(869);
			match(JAVAIOP);
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(870);
				match(LPARENCHAR);
				setState(871);
				javaiopOption();
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMACHAR) {
					{
					{
					setState(872);
					match(COMMACHAR);
					setState(873);
					javaiopOption();
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(879);
				match(RPARENCHAR);
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

	public static class JavaiopOptionContext extends ParserRuleContext {
		public TerminalNode NOJAVA64() { return getToken(CobolPreprocessorParser.NOJAVA64, 0); }
		public TerminalNode JAVA64() { return getToken(CobolPreprocessorParser.JAVA64, 0); }
		public TerminalNode OUTPATH() { return getToken(CobolPreprocessorParser.OUTPATH, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public TerminalNode JVMINITOPTIONS() { return getToken(CobolPreprocessorParser.JVMINITOPTIONS, 0); }
		public JavaiopOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaiopOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterJavaiopOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitJavaiopOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitJavaiopOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaiopOptionContext javaiopOption() throws RecognitionException {
		JavaiopOptionContext _localctx = new JavaiopOptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_javaiopOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPATH:
				{
				{
				setState(883);
				match(OUTPATH);
				setState(884);
				match(LPARENCHAR);
				setState(885);
				literal();
				setState(886);
				match(RPARENCHAR);
				}
				}
				break;
			case JVMINITOPTIONS:
				{
				{
				setState(888);
				match(JVMINITOPTIONS);
				setState(889);
				match(LPARENCHAR);
				setState(890);
				literal();
				setState(891);
				match(RPARENCHAR);
				}
				}
				break;
			case NOJAVA64:
				{
				setState(893);
				match(NOJAVA64);
				}
				break;
			case JAVA64:
				{
				setState(894);
				match(JAVA64);
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
		enterRule(_localctx, 30, RULE_classicCommentEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(CLASSIC_COMMENT_TAG);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASSIC_COMMENT_TEXT) {
				{
				{
				setState(898);
				match(CLASSIC_COMMENT_TEXT);
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
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
		enterRule(_localctx, 32, RULE_execCicsStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(EXEC_CICS);
			setState(913); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(913);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CICS_TEXT:
					{
					setState(908); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(907);
							match(CICS_TEXT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(910); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(912);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(915); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASSIC_COMMENT_TAG || _la==CICS_TEXT );
			setState(917);
			match(END_EXEC);
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(918);
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
		enterRule(_localctx, 34, RULE_execSqlStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(EXEC_SQL);
			setState(928); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(928);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SQL_TEXT:
					{
					setState(923); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(922);
							match(SQL_TEXT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(925); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(927);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(930); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASSIC_COMMENT_TAG || _la==SQL_TEXT );
			setState(932);
			match(END_EXEC);
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(933);
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
		enterRule(_localctx, 36, RULE_execSqlImsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(EXEC);
			setState(937);
			match(SQLIMS);
			setState(940); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(940);
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
					setState(938);
					charData();
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(939);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(942); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAX - 128)) | (1L << (LAXPERF - 128)) | (1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODEF - 192)) | (1L << (NODIAGTRUNC - 192)) | (1L << (NODLL - 192)) | (1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOP - 256)) | (1L << (NOPAC - 256)) | (1L << (NOPARMCHECK - 256)) | (1L << (NOPFD - 256)) | (1L << (NOPRESERVE - 256)) | (1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OMITODOMIN - 320)) | (1L << (OOM - 320)) | (1L << (OP - 320)) | (1L << (OPMARGINS - 320)) | (1L << (OPSEQUENCE - 320)) | (1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (SUPPRESS - 384)) | (1L << (SYSEIB - 384)) | (1L << (SZ - 384)) | (1L << (TERM - 384)) | (1L << (TERMINAL - 384)) | (1L << (TEST - 384)) | (1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)))) != 0) || ((((_la - 449)) & ~0x3f) == 0 && ((1L << (_la - 449)) & ((1L << (TEXT - 449)) | (1L << (PLUSCHAR - 449)) | (1L << (OR - 449)))) != 0) || ((((_la - 513)) & ~0x3f) == 0 && ((1L << (_la - 513)) & ((1L << (STATIC - 513)) | (1L << (TO - 513)) | (1L << (TRUE - 513)) | (1L << (WHEN - 513)))) != 0) );
			setState(944);
			match(END_EXEC);
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(945);
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
		enterRule(_localctx, 38, RULE_copyStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(COPY);
			setState(949);
			copySource();
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(950);
						match(NEWLINE);
						}
						}
						setState(955);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(958);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REPLACING:
						{
						setState(956);
						replacingPhrase();
						}
						break;
					case SUPPRESS:
						{
						setState(957);
						match(SUPPRESS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(965);
				match(NEWLINE);
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
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
		enterRule(_localctx, 40, RULE_copySource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(973);
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
				setState(974);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(975);
				filename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(978);
					match(NEWLINE);
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(984);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(985);
					match(NEWLINE);
					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(991);
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
		enterRule(_localctx, 42, RULE_copyLibrary);
		try {
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
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
				setState(995);
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
		enterRule(_localctx, 44, RULE_replacingPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(REPLACING);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(999);
				match(NEWLINE);
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1005);
			replaceClause();
			setState(1014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1007); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1006);
						match(NEWLINE);
						}
						}
						setState(1009); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(1011);
					replaceClause();
					}
					} 
				}
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 46, RULE_replaceArea);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			replaceByStatement();
			setState(1022);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1020);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COPY:
						{
						setState(1018);
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
						setState(1019);
						charData();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1025);
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
		enterRule(_localctx, 48, RULE_replaceByStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(REPLACE);
			setState(1036); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1029);
						match(NEWLINE);
						}
						}
						setState(1034);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1035);
					replaceClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1038); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1040);
				match(NEWLINE);
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1046);
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
		enterRule(_localctx, 50, RULE_replaceOffStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(REPLACE);
			setState(1049);
			match(OFF);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1050);
				match(NEWLINE);
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1056);
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
		enterRule(_localctx, 52, RULE_replaceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(1058);
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
			setState(1061);
			replaceable();
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1062);
				match(NEWLINE);
				}
				}
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1068);
			match(BY);
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1069);
				match(NEWLINE);
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1075);
			replacement();
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1076);
					match(NEWLINE);
					}
					}
					setState(1081);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1082);
				directoryPhrase();
				}
				break;
			}
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1085);
					match(NEWLINE);
					}
					}
					setState(1090);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1091);
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
		enterRule(_localctx, 54, RULE_directoryPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1095);
				match(NEWLINE);
				}
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1101);
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
				setState(1102);
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
		enterRule(_localctx, 56, RULE_familyPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(ON);
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1106);
				match(NEWLINE);
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1112);
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
				setState(1113);
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
		enterRule(_localctx, 58, RULE_replaceable);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1118);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1119);
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
		enterRule(_localctx, 60, RULE_replacement);
		try {
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1125);
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
		enterRule(_localctx, 62, RULE_ejectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(EJECT);
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1129);
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
		enterRule(_localctx, 64, RULE_skipStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			_la = _input.LA(1);
			if ( !(((((_la - 370)) & ~0x3f) == 0 && ((1L << (_la - 370)) & ((1L << (SKIP1 - 370)) | (1L << (SKIP2 - 370)) | (1L << (SKIP3 - 370)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1133);
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
		enterRule(_localctx, 66, RULE_titleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(TITLE);
			setState(1137);
			literal();
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1138);
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
		enterRule(_localctx, 68, RULE_pseudoText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(DOUBLEEQUALCHAR);
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAX - 128)) | (1L << (LAXPERF - 128)) | (1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODEF - 192)) | (1L << (NODIAGTRUNC - 192)) | (1L << (NODLL - 192)) | (1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOP - 256)) | (1L << (NOPAC - 256)) | (1L << (NOPARMCHECK - 256)) | (1L << (NOPFD - 256)) | (1L << (NOPRESERVE - 256)) | (1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OMITODOMIN - 320)) | (1L << (OOM - 320)) | (1L << (OP - 320)) | (1L << (OPMARGINS - 320)) | (1L << (OPSEQUENCE - 320)) | (1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (SUPPRESS - 384)) | (1L << (SYSEIB - 384)) | (1L << (SZ - 384)) | (1L << (TERM - 384)) | (1L << (TERMINAL - 384)) | (1L << (TEST - 384)) | (1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)))) != 0) || ((((_la - 449)) & ~0x3f) == 0 && ((1L << (_la - 449)) & ((1L << (TEXT - 449)) | (1L << (PLUSCHAR - 449)) | (1L << (OR - 449)))) != 0) || ((((_la - 513)) & ~0x3f) == 0 && ((1L << (_la - 513)) & ((1L << (STATIC - 513)) | (1L << (TO - 513)) | (1L << (TRUE - 513)) | (1L << (WHEN - 513)))) != 0)) {
				{
				setState(1142);
				charData();
				}
			}

			setState(1145);
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
		enterRule(_localctx, 70, RULE_charData);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1149);
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
						setState(1147);
						charDataLine();
						}
						break;
					case NEWLINE:
						{
						setState(1148);
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
				setState(1151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		enterRule(_localctx, 72, RULE_charDataSql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1157);
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
					setState(1153);
					charDataLine();
					}
					break;
				case COPY:
					{
					setState(1154);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(1155);
					match(REPLACE);
					}
					break;
				case NEWLINE:
					{
					setState(1156);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAX - 128)) | (1L << (LAXPERF - 128)) | (1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODEF - 192)) | (1L << (NODIAGTRUNC - 192)) | (1L << (NODLL - 192)) | (1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOP - 256)) | (1L << (NOPAC - 256)) | (1L << (NOPARMCHECK - 256)) | (1L << (NOPFD - 256)) | (1L << (NOPRESERVE - 256)) | (1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OMITODOMIN - 320)) | (1L << (OOM - 320)) | (1L << (OP - 320)) | (1L << (OPMARGINS - 320)) | (1L << (OPSEQUENCE - 320)) | (1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (SUPPRESS - 384)) | (1L << (SYSEIB - 384)) | (1L << (SZ - 384)) | (1L << (TERM - 384)) | (1L << (TERMINAL - 384)) | (1L << (TEST - 384)) | (1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (CONTINUED_NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)))) != 0) || ((((_la - 449)) & ~0x3f) == 0 && ((1L << (_la - 449)) & ((1L << (TEXT - 449)) | (1L << (PLUSCHAR - 449)) | (1L << (OR - 449)))) != 0) || ((((_la - 513)) & ~0x3f) == 0 && ((1L << (_la - 513)) & ((1L << (STATIC - 513)) | (1L << (TO - 513)) | (1L << (TRUE - 513)) | (1L << (WHEN - 513)))) != 0) );
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
		enterRule(_localctx, 74, RULE_charDataLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1170);
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
						setState(1161);
						cobolWord();
						}
						break;
					case NONNUMERICLITERAL:
					case CONTINUED_NONNUMERICLITERAL:
					case NUMERICLITERAL:
						{
						setState(1162);
						literal();
						}
						break;
					case FILENAME:
						{
						setState(1163);
						filename();
						}
						break;
					case PSEUDOTEXTIDENTIFIER:
						{
						setState(1164);
						match(PSEUDOTEXTIDENTIFIER);
						}
						break;
					case TEXT:
						{
						setState(1165);
						match(TEXT);
						}
						break;
					case DOT:
						{
						setState(1166);
						match(DOT);
						}
						break;
					case LPARENCHAR:
						{
						setState(1167);
						match(LPARENCHAR);
						}
						break;
					case RPARENCHAR:
						{
						setState(1168);
						match(RPARENCHAR);
						}
						break;
					case DFHVALUE:
						{
						setState(1169);
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
				setState(1172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1174);
					match(NEWLINE);
					setState(1175);
					match(CLASSIC_CONTINUATION);
					setState(1184); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(1184);
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
								setState(1176);
								cobolWord();
								}
								break;
							case NONNUMERICLITERAL:
							case CONTINUED_NONNUMERICLITERAL:
							case NUMERICLITERAL:
								{
								setState(1177);
								literal();
								}
								break;
							case FILENAME:
								{
								setState(1178);
								filename();
								}
								break;
							case PSEUDOTEXTIDENTIFIER:
								{
								setState(1179);
								match(PSEUDOTEXTIDENTIFIER);
								}
								break;
							case TEXT:
								{
								setState(1180);
								match(TEXT);
								}
								break;
							case DOT:
								{
								setState(1181);
								match(DOT);
								}
								break;
							case LPARENCHAR:
								{
								setState(1182);
								match(LPARENCHAR);
								}
								break;
							case RPARENCHAR:
								{
								setState(1183);
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
						setState(1186); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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
		enterRule(_localctx, 76, RULE_cobolWord);
		try {
			setState(1195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
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
				setState(1194);
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
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			_la = _input.LA(1);
			if ( !(((((_la - 440)) & ~0x3f) == 0 && ((1L << (_la - 440)) & ((1L << (NONNUMERICLITERAL - 440)) | (1L << (CONTINUED_NONNUMERICLITERAL - 440)) | (1L << (NUMERICLITERAL - 440)))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
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
		enterRule(_localctx, 82, RULE_dfhvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1201);
			match(DFHVALUE);
			setState(1202);
			match(LPARENCHAR);
			setState(1206);
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
				setState(1203);
				cobolWord();
				}
				break;
			case COPY:
				{
				setState(1204);
				match(COPY);
				}
				break;
			case PROCESS:
				{
				setState(1205);
				match(PROCESS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1208);
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
		enterRule(_localctx, 84, RULE_compilerDirectiveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1210);
				compilerDirective();
				}
				break;
			case 2:
				{
				setState(1211);
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
		public CompilerDirectiveJavaCallableContext compilerDirectiveJavaCallable() {
			return getRuleContext(CompilerDirectiveJavaCallableContext.class,0);
		}
		public CompilerDirectiveJavaShareableContext compilerDirectiveJavaShareable() {
			return getRuleContext(CompilerDirectiveJavaShareableContext.class,0);
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
		enterRule(_localctx, 86, RULE_compilerDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1214);
				compilerDirectiveCallInterface();
				}
				break;
			case 2:
				{
				setState(1215);
				compilerDirectiveInline();
				}
				break;
			case 3:
				{
				setState(1216);
				compilerDirectiveBasis();
				}
				break;
			case 4:
				{
				setState(1217);
				compilerDirectiveInsert();
				}
				break;
			case 5:
				{
				setState(1218);
				compilerDirectiveDelete();
				}
				break;
			case 6:
				{
				setState(1219);
				compilerDirectiveData();
				}
				break;
			case 7:
				{
				setState(1220);
				compilerDirectiveCallConvention();
				}
				break;
			case 8:
				{
				setState(1221);
				compilerDirectiveCobolWords();
				}
				break;
			case 9:
				{
				setState(1222);
				compilerDirectiveDisplay();
				}
				break;
			case 10:
				{
				setState(1223);
				compilerDirectiveFlag02();
				}
				break;
			case 11:
				{
				setState(1224);
				compilerDirectiveFlag14();
				}
				break;
			case 12:
				{
				setState(1225);
				compilerDirectiveJavaCallable();
				}
				break;
			case 13:
				{
				setState(1226);
				compilerDirectiveJavaShareable();
				}
				break;
			case 14:
				{
				setState(1227);
				compilerDirectiveLeapSecond();
				}
				break;
			case 15:
				{
				setState(1228);
				compilerDirectiveListing();
				}
				break;
			case 16:
				{
				setState(1229);
				compilerDirectivePage();
				}
				break;
			case 17:
				{
				setState(1230);
				compilerDirectivePop();
				}
				break;
			case 18:
				{
				setState(1231);
				compilerDirectivePropogate();
				}
				break;
			case 19:
				{
				setState(1232);
				compilerDirectivePush();
				}
				break;
			case 20:
				{
				setState(1233);
				compilerDirectiveRefModZeroLength();
				}
				break;
			case 21:
				{
				setState(1234);
				compilerDirectiveSource();
				}
				break;
			case 22:
				{
				setState(1235);
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
		enterRule(_localctx, 88, RULE_conditionalCompilationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1238);
				conditionalCompilationDefine();
				}
				break;
			case 2:
				{
				setState(1239);
				conditionalCompilationIf();
				}
				break;
			case 3:
				{
				setState(1240);
				conditionalCompilationElse();
				}
				break;
			case 4:
				{
				setState(1241);
				conditionalCompilationEndIf();
				}
				break;
			case 5:
				{
				setState(1242);
				conditionalCompilationEvaluate();
				}
				break;
			case 6:
				{
				setState(1243);
				conditionalCompilationWhen();
				}
				break;
			case 7:
				{
				setState(1244);
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
		enterRule(_localctx, 90, RULE_compilerDirectiveCallInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1247);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1248);
			_la = _input.LA(1);
			if ( !(_la==CALLINT || _la==CALLINTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1249);
				_la = _input.LA(1);
				if ( !(((((_la - 478)) & ~0x3f) == 0 && ((1L << (_la - 478)) & ((1L << (DLL_INTERFACE - 478)) | (1L << (DYNAMIC - 478)) | (1L << (STATIC - 478)))) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_compilerDirectiveInline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1252);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1253);
			match(INLINE);
			setState(1254);
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
		enterRule(_localctx, 94, RULE_compilerDirectiveBasis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1256);
			match(BASIS);
			setState(1257);
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
		enterRule(_localctx, 96, RULE_basisName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case CONTINUED_NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1259);
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
				setState(1260);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(1261);
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
		enterRule(_localctx, 98, RULE_compilerDirectiveInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1264);
			match(INSERT);
			setState(1265);
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
		enterRule(_localctx, 100, RULE_compilerDirectiveDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1267);
			match(DELETE);
			setState(1268);
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
		enterRule(_localctx, 102, RULE_compilerDirectiveData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1270);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1271);
			match(COMP_DIR_DATA);
			setState(1272);
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
		enterRule(_localctx, 104, RULE_compilerDirectiveCallConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1274);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1275);
			match(CALL_CONVENTION);
			setState(1276);
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
		enterRule(_localctx, 106, RULE_compilerDirectiveCobolWords);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1278);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1279);
			match(COBOL_WORDS);
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUATE:
				{
				setState(1280);
				compilerDirectiveCobolWordsEquate();
				}
				break;
			case UNDEFINE:
				{
				setState(1281);
				compilerDirectiveCobolWordsUndefine();
				}
				break;
			case SUBSTITUTE:
				{
				setState(1282);
				compilerDirectiveCobolWordsSubstitute();
				}
				break;
			case RESERVE:
				{
				setState(1283);
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
		enterRule(_localctx, 108, RULE_compilerDirectiveDisplay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1286);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1287);
			match(DISPLAY);
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1288);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1289);
				conditionalCompilationRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1290);
				literal();
				}
				break;
			case 4:
				{
				{
				setState(1291);
				match(PARAMETER);
				setState(1292);
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
		enterRule(_localctx, 110, RULE_compilerDirectiveFlag02);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1295);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1296);
			match(FLAG_02);
			setState(1297);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1298);
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
		enterRule(_localctx, 112, RULE_compilerDirectiveFlag14);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1300);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1301);
			match(FLAG_14);
			setState(1302);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==ALL || _la==REF_MOD_ZERO_LENGTH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1303);
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

	public static class CompilerDirectiveJavaCallableContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode JAVA_CALLABLE() { return getToken(CobolPreprocessorParser.JAVA_CALLABLE, 0); }
		public CompilerDirectiveJavaCallableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveJavaCallable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveJavaCallable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveJavaCallable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveJavaCallable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveJavaCallableContext compilerDirectiveJavaCallable() throws RecognitionException {
		CompilerDirectiveJavaCallableContext _localctx = new CompilerDirectiveJavaCallableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_compilerDirectiveJavaCallable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1305);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1306);
			match(JAVA_CALLABLE);
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

	public static class CompilerDirectiveJavaShareableContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode JAVA_SHAREABLE() { return getToken(CobolPreprocessorParser.JAVA_SHAREABLE, 0); }
		public TerminalNode COMP_DIR_ON() { return getToken(CobolPreprocessorParser.COMP_DIR_ON, 0); }
		public TerminalNode COMP_DIR_OFF() { return getToken(CobolPreprocessorParser.COMP_DIR_OFF, 0); }
		public CompilerDirectiveJavaShareableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerDirectiveJavaShareable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterCompilerDirectiveJavaShareable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitCompilerDirectiveJavaShareable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitCompilerDirectiveJavaShareable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerDirectiveJavaShareableContext compilerDirectiveJavaShareable() throws RecognitionException {
		CompilerDirectiveJavaShareableContext _localctx = new CompilerDirectiveJavaShareableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_compilerDirectiveJavaShareable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1308);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1309);
			match(JAVA_SHAREABLE);
			setState(1310);
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
		enterRule(_localctx, 118, RULE_compilerDirectiveLeapSecond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1312);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1313);
			match(LEAP_SECOND);
			setState(1314);
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
		enterRule(_localctx, 120, RULE_compilerDirectiveListing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1316);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1317);
			match(LISTING);
			setState(1318);
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
		enterRule(_localctx, 122, RULE_compilerDirectivePage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1320);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1321);
			match(PAGE);
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAGE_COMMENT_TEXT) {
				{
				{
				setState(1322);
				match(PAGE_COMMENT_TEXT);
				}
				}
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1328);
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
		enterRule(_localctx, 124, RULE_compilerDirectivePop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1330);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1331);
			match(POP);
			setState(1334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1332);
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
				setState(1333);
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
		enterRule(_localctx, 126, RULE_compilerDirectivePropogate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1336);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1337);
			match(PROPOGATE);
			setState(1338);
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
		enterRule(_localctx, 128, RULE_compilerDirectivePush);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1340);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1341);
			match(PUSH);
			setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1342);
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
				setState(1343);
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
		enterRule(_localctx, 130, RULE_compilerDirectiveRefModZeroLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1346);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1347);
			match(REF_MOD_ZERO_LENGTH);
			setState(1348);
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
		enterRule(_localctx, 132, RULE_compilerDirectiveSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1350);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1351);
			match(SOURCE);
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(1352);
				match(FORMAT);
				setState(1353);
				match(IS);
				}
			}

			setState(1356);
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
		enterRule(_localctx, 134, RULE_compilerDirectiveTurn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1358);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1359);
			match(TURN);
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1360);
				match(IDENTIFIER);
				}
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1366);
			match(CHECKING);
			setState(1375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP_DIR_OFF:
				{
				setState(1367);
				match(COMP_DIR_OFF);
				}
				break;
			case LOCATION:
			case COMP_DIR_ON:
			case WITH:
				{
				{
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMP_DIR_ON) {
					{
					setState(1368);
					match(COMP_DIR_ON);
					}
				}

				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1371);
					match(WITH);
					}
				}

				setState(1374);
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
		enterRule(_localctx, 136, RULE_compilerDirectivePopList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			_la = _input.LA(1);
			if ( !(_la==DEFINE || _la==SOURCE || ((((_la - 469)) & ~0x3f) == 0 && ((1L << (_la - 469)) & ((1L << (CALL_CONVENTION - 469)) | (1L << (COBOL_WORDS - 469)) | (1L << (DISPLAY - 469)) | (1L << (FLAG_02 - 469)) | (1L << (FLAG_14 - 469)) | (1L << (LEAP_SECOND - 469)) | (1L << (LISTING - 469)) | (1L << (PROPOGATE - 469)) | (1L << (REF_MOD_ZERO_LENGTH - 469)) | (1L << (TURN - 469)))) != 0)) ) {
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
		enterRule(_localctx, 138, RULE_compilerDirectiveCobolWordsEquate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1379);
			match(EQUATE);
			setState(1380);
			literal();
			setState(1381);
			match(WITH);
			setState(1382);
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
		enterRule(_localctx, 140, RULE_compilerDirectiveCobolWordsUndefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1384);
			match(UNDEFINE);
			setState(1385);
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
		enterRule(_localctx, 142, RULE_compilerDirectiveCobolWordsSubstitute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1387);
			match(SUBSTITUTE);
			setState(1388);
			literal();
			setState(1389);
			match(BY);
			setState(1390);
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
		enterRule(_localctx, 144, RULE_compilerDirectiveCobolWordsReserve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1392);
			match(RESERVE);
			setState(1393);
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
		enterRule(_localctx, 146, RULE_compilerDirectiveNumericRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1395);
			compilerDirectiveNumericAtom();
			setState(1396);
			match(MINUSCHAR);
			setState(1397);
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
		enterRule(_localctx, 148, RULE_compilerDirectiveNumericAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1399);
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
		enterRule(_localctx, 150, RULE_compilerDirectiveDeleteSequenceNumber);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1401);
				compilerDirectiveNumericAtom();
				}
				break;
			case 2:
				{
				setState(1402);
				compilerDirectiveNumericRange();
				}
				break;
			}
			setState(1412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1405);
					match(COMMACHAR);
					setState(1408);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						setState(1406);
						compilerDirectiveNumericAtom();
						}
						break;
					case 2:
						{
						setState(1407);
						compilerDirectiveNumericRange();
						}
						break;
					}
					}
					} 
				}
				setState(1414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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
		enterRule(_localctx, 152, RULE_conditionalCompilationDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1415);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1416);
			match(DEFINE);
			setState(1417);
			match(IDENTIFIER);
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1418);
				match(AS);
				}
			}

			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1421);
				conditionalCompilationDefinePredicate();
				}
				break;
			case 2:
				{
				setState(1422);
				match(COMP_DIR_OFF);
				}
				break;
			}
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(1425);
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
		enterRule(_localctx, 154, RULE_conditionalCompilationDefinePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1428);
				literal();
				}
				break;
			case 2:
				{
				setState(1429);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 3:
				{
				setState(1430);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(1431);
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
		enterRule(_localctx, 156, RULE_conditionalCompilationArithmeticExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1443); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1434);
						match(LPARENCHAR);
						}
						}
						setState(1439);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1440);
					conditionalCompilationArithmeticAtom();
					setState(1441);
					conditionalCompilationArithmeticOp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1445); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1450);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1447);
						match(LPARENCHAR);
						}
						}
						setState(1452);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1453);
					conditionalCompilationArithmeticAtom();
					setState(1457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==RPARENCHAR) {
						{
						{
						setState(1454);
						match(RPARENCHAR);
						}
						}
						setState(1459);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1460);
					conditionalCompilationArithmeticOp();
					}
					} 
				}
				setState(1466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			setState(1467);
			conditionalCompilationArithmeticAtom();
			setState(1471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1468);
					match(RPARENCHAR);
					}
					} 
				}
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
		enterRule(_localctx, 158, RULE_conditionalCompilationArithmeticAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_la = _input.LA(1);
			if ( !(((((_la - 442)) & ~0x3f) == 0 && ((1L << (_la - 442)) & ((1L << (NUMERICLITERAL - 442)) | (1L << (IDENTIFIER - 442)) | (1L << (ZERO - 442)))) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_conditionalCompilationArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_la = _input.LA(1);
			if ( !(((((_la - 455)) & ~0x3f) == 0 && ((1L << (_la - 455)) & ((1L << (ASTERISKCHAR - 455)) | (1L << (PLUSCHAR - 455)) | (1L << (MINUSCHAR - 455)) | (1L << (SLASHCHAR - 455)))) != 0)) ) {
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
		enterRule(_localctx, 162, RULE_conditionalCompilationIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1478);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1479);
			match(IF);
			setState(1480);
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
		enterRule(_localctx, 164, RULE_conditionalCompilationElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1483);
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
		enterRule(_localctx, 166, RULE_conditionalCompilationEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1486);
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
		enterRule(_localctx, 168, RULE_conditionalCompilationEvaluateSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1488);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1489);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1490);
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
		enterRule(_localctx, 170, RULE_conditionalCompilationEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1494);
			match(EVALUATE);
			setState(1497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(1495);
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
				setState(1496);
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
		enterRule(_localctx, 172, RULE_conditionalCompilationWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1500);
			match(WHEN);
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				{
				setState(1501);
				conditionalCompilationEvaluateSelection();
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROUGH || _la==THRU) {
					{
					setState(1502);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1503);
					conditionalCompilationEvaluateSelection();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(1506);
				conditionalCompilationRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1507);
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
		enterRule(_localctx, 174, RULE_conditionalCompilationEndEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1511);
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
		enterRule(_localctx, 176, RULE_conditionalCompilationComparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1513);
				match(IS);
				}
			}

			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1516);
				match(NOT);
				}
			}

			setState(1546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1519);
				match(EQUAL);
				}
				break;
			case 2:
				{
				setState(1520);
				match(EQUALCHAR);
				}
				break;
			case 3:
				{
				setState(1521);
				match(NOTEQUALCHAR);
				}
				break;
			case 4:
				{
				setState(1522);
				match(LESSTHANCHAR);
				}
				break;
			case 5:
				{
				{
				setState(1523);
				match(GREATER);
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1524);
					match(THAN);
					}
				}

				}
				}
				break;
			case 6:
				{
				setState(1527);
				match(GREATERTHANCHAR);
				}
				break;
			case 7:
				{
				{
				setState(1528);
				match(LESS);
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1529);
					match(THAN);
					}
				}

				}
				}
				break;
			case 8:
				{
				setState(1532);
				match(LESSOREQUALCHAR);
				}
				break;
			case 9:
				{
				{
				setState(1533);
				match(LESS);
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1534);
					match(THAN);
					}
				}

				setState(1537);
				match(OR);
				setState(1538);
				match(EQUAL);
				}
				}
				break;
			case 10:
				{
				setState(1539);
				match(GREATEROREQUALCHAR);
				}
				break;
			case 11:
				{
				{
				setState(1540);
				match(GREATER);
				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1541);
					match(THAN);
					}
				}

				setState(1544);
				match(OR);
				setState(1545);
				match(EQUAL);
				}
				}
				break;
			}
			setState(1549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1548);
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
		enterRule(_localctx, 178, RULE_conditionalCompilationRelationalCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1583); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1551);
							match(LPARENCHAR);
							}
							} 
						}
						setState(1556);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
					}
					setState(1557);
					conditionalCompilationCondition();
					setState(1574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1558);
							_la = _input.LA(1);
							if ( !(_la==AND || _la==OR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1562);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1559);
									match(LPARENCHAR);
									}
									} 
								}
								setState(1564);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
							}
							setState(1565);
							conditionalCompilationCondition();
							setState(1569);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1566);
									match(RPARENCHAR);
									}
									} 
								}
								setState(1571);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
							}
							}
							} 
						}
						setState(1576);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
					}
					setState(1580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1577);
							match(RPARENCHAR);
							}
							} 
						}
						setState(1582);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1585); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
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
		enterRule(_localctx, 180, RULE_conditionalCompilationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1587);
				conditionalCompilationSimpleRelationalCondition();
				}
				break;
			case 2:
				{
				setState(1588);
				conditionalCompilationDefinedCondition();
				}
				break;
			case 3:
				{
				setState(1589);
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
		enterRule(_localctx, 182, RULE_conditionalCompilationSimpleRelationalCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1592);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1593);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1594);
				literal();
				}
				break;
			}
			setState(1597);
			conditionalCompilationComparisonOp();
			setState(1601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1598);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1599);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1600);
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
		enterRule(_localctx, 184, RULE_conditionalCompilationBinaryCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
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
		enterRule(_localctx, 186, RULE_conditionalCompilationDefinedCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1605);
			match(IDENTIFIER);
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1606);
				match(IS);
				}
			}

			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1609);
				match(NOT);
				}
			}

			setState(1612);
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
		enterRule(_localctx, 188, RULE_charDataKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAX - 128)) | (1L << (LAXPERF - 128)) | (1L << (LC - 128)) | (1L << (LEADING - 128)) | (1L << (LENGTH - 128)) | (1L << (LIB - 128)) | (1L << (LILIAN - 128)) | (1L << (LIN - 128)) | (1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NODEF - 192)) | (1L << (NODIAGTRUNC - 192)) | (1L << (NODLL - 192)) | (1L << (NODSNAME - 192)) | (1L << (NODU - 192)) | (1L << (NODUMP - 192)) | (1L << (NODP - 192)) | (1L << (NODTR - 192)) | (1L << (NODWARF - 192)) | (1L << (NODYN - 192)) | (1L << (NODYNAM - 192)) | (1L << (NOEDF - 192)) | (1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOP - 256)) | (1L << (NOPAC - 256)) | (1L << (NOPARMCHECK - 256)) | (1L << (NOPFD - 256)) | (1L << (NOPRESERVE - 256)) | (1L << (NOPROLOG - 256)) | (1L << (NORENT - 256)) | (1L << (NORULES - 256)) | (1L << (NOS - 256)) | (1L << (NOSEP - 256)) | (1L << (NOSEPARATE - 256)) | (1L << (NOSEQ - 256)) | (1L << (NOSERV - 256)) | (1L << (NOSERVICE - 256)) | (1L << (NOSLACKBYTES - 256)) | (1L << (NOSLCKB - 256)) | (1L << (NOSO - 256)) | (1L << (NOSOURCE - 256)) | (1L << (NOSPIE - 256)) | (1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OMITODOMIN - 320)) | (1L << (OOM - 320)) | (1L << (OP - 320)) | (1L << (OPMARGINS - 320)) | (1L << (OPSEQUENCE - 320)) | (1L << (OPT - 320)) | (1L << (OPTFILE - 320)) | (1L << (OPTIMIZE - 320)) | (1L << (OPTIONS - 320)) | (1L << (OUT - 320)) | (1L << (OUTDD - 320)) | (1L << (PAC - 320)) | (1L << (PARMCHECK - 320)) | (1L << (PATH - 320)) | (1L << (PFD - 320)) | (1L << (PPTDBG - 320)) | (1L << (PGMN - 320)) | (1L << (PGMNAME - 320)) | (1L << (PRESERVE - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (SUPPRESS - 384)) | (1L << (SYSEIB - 384)) | (1L << (SZ - 384)) | (1L << (TERM - 384)) | (1L << (TERMINAL - 384)) | (1L << (TEST - 384)) | (1L << (THREAD - 384)) | (1L << (TITLE - 384)) | (1L << (TRAILING - 384)) | (1L << (TRIG - 384)) | (1L << (TRUNC - 384)) | (1L << (UE - 384)) | (1L << (UNREF - 384)) | (1L << (UPPER - 384)) | (1L << (VBREF - 384)) | (1L << (VLR - 384)) | (1L << (VOLATILE - 384)) | (1L << (VS - 384)) | (1L << (VSAMOPENFS - 384)) | (1L << (WD - 384)) | (1L << (XMLPARSE - 384)) | (1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (PLUSCHAR - 459)) | (1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)))) != 0) || _la==WHEN) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0214\u0653\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00d0"+
		"\n\2\f\2\16\2\u00d3\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u00dc\n\4\3\4"+
		"\3\4\6\4\u00e0\n\4\r\4\16\4\u00e1\3\5\3\5\3\5\3\5\5\5\u00e8\n\5\3\5\7"+
		"\5\u00eb\n\5\f\5\16\5\u00ee\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u010f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u011d\n\6\3\6\5\6\u0120\n\6\3\6\3\6\3\6\3\6\5\6\u0126\n\6"+
		"\3\6\5\6\u0129\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0130\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u013d\n\6\r\6\16\6\u013e\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u014a\n\6\3\6\5\6\u014d\n\6\3\6\5\6\u0150\n"+
		"\6\3\6\5\6\u0153\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u016c\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0174\n\6\3\6\3\6\5\6\u0178\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0189\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u0193\n\6\f\6\16\6\u0196\13\6\3\6\3\6\5\6\u019a\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01b5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u01be\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01cb\n"+
		"\6\3\6\3\6\3\6\3\6\5\6\u01d1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u01e2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u0235\n\6\f\6\16\6\u0238\13\6\3\6\3\6\5\6\u023c\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u024b\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u025a\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0267\n\6\3\6\5\6\u026a\n\6\3\6\5"+
		"\6\u026d\n\6\3\6\5\6\u0270\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0282\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u028a"+
		"\n\6\f\6\16\6\u028d\13\6\3\6\3\6\5\6\u0291\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u029a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02a5\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u02ac\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u02ba\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02c2\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u02c9\n\6\f\6\16\6\u02cc\13\6\3\6\3\6\5\6\u02d0\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u02db\n\6\f\6\16\6\u02de\13\6\3"+
		"\6\3\6\5\6\u02e2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u02fb\n\6\r\6\16\6\u02fc"+
		"\5\6\u02ff\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0309\n\6\3\6\5\6\u030c"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u031d"+
		"\n\6\3\7\3\7\3\7\3\7\6\7\u0323\n\7\r\7\16\7\u0324\3\7\5\7\u0328\n\7\3"+
		"\7\5\7\u032b\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0339"+
		"\n\n\f\n\16\n\u033c\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0347"+
		"\n\n\3\n\3\n\3\n\5\n\u034c\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u035c\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0366\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u036d\n\17\f"+
		"\17\16\17\u0370\13\17\3\17\3\17\5\17\u0374\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0382\n\20\3\21\3\21\7\21"+
		"\u0386\n\21\f\21\16\21\u0389\13\21\3\21\3\21\3\22\3\22\6\22\u038f\n\22"+
		"\r\22\16\22\u0390\3\22\6\22\u0394\n\22\r\22\16\22\u0395\3\22\3\22\5\22"+
		"\u039a\n\22\3\23\3\23\6\23\u039e\n\23\r\23\16\23\u039f\3\23\6\23\u03a3"+
		"\n\23\r\23\16\23\u03a4\3\23\3\23\5\23\u03a9\n\23\3\24\3\24\3\24\3\24\6"+
		"\24\u03af\n\24\r\24\16\24\u03b0\3\24\3\24\5\24\u03b5\n\24\3\25\3\25\3"+
		"\25\7\25\u03ba\n\25\f\25\16\25\u03bd\13\25\3\25\3\25\5\25\u03c1\n\25\7"+
		"\25\u03c3\n\25\f\25\16\25\u03c6\13\25\3\25\7\25\u03c9\n\25\f\25\16\25"+
		"\u03cc\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u03d3\n\26\3\26\7\26\u03d6"+
		"\n\26\f\26\16\26\u03d9\13\26\3\26\3\26\7\26\u03dd\n\26\f\26\16\26\u03e0"+
		"\13\26\3\26\5\26\u03e3\n\26\3\27\3\27\5\27\u03e7\n\27\3\30\3\30\7\30\u03eb"+
		"\n\30\f\30\16\30\u03ee\13\30\3\30\3\30\6\30\u03f2\n\30\r\30\16\30\u03f3"+
		"\3\30\7\30\u03f7\n\30\f\30\16\30\u03fa\13\30\3\31\3\31\3\31\7\31\u03ff"+
		"\n\31\f\31\16\31\u0402\13\31\3\31\5\31\u0405\n\31\3\32\3\32\7\32\u0409"+
		"\n\32\f\32\16\32\u040c\13\32\3\32\6\32\u040f\n\32\r\32\16\32\u0410\3\32"+
		"\7\32\u0414\n\32\f\32\16\32\u0417\13\32\3\32\3\32\3\33\3\33\3\33\7\33"+
		"\u041e\n\33\f\33\16\33\u0421\13\33\3\33\3\33\3\34\5\34\u0426\n\34\3\34"+
		"\3\34\7\34\u042a\n\34\f\34\16\34\u042d\13\34\3\34\3\34\7\34\u0431\n\34"+
		"\f\34\16\34\u0434\13\34\3\34\3\34\7\34\u0438\n\34\f\34\16\34\u043b\13"+
		"\34\3\34\5\34\u043e\n\34\3\34\7\34\u0441\n\34\f\34\16\34\u0444\13\34\3"+
		"\34\5\34\u0447\n\34\3\35\3\35\7\35\u044b\n\35\f\35\16\35\u044e\13\35\3"+
		"\35\3\35\5\35\u0452\n\35\3\36\3\36\7\36\u0456\n\36\f\36\16\36\u0459\13"+
		"\36\3\36\3\36\5\36\u045d\n\36\3\37\3\37\3\37\3\37\5\37\u0463\n\37\3 \3"+
		" \3 \3 \5 \u0469\n \3!\3!\5!\u046d\n!\3\"\3\"\5\"\u0471\n\"\3#\3#\3#\5"+
		"#\u0476\n#\3$\3$\5$\u047a\n$\3$\3$\3%\3%\6%\u0480\n%\r%\16%\u0481\3&\3"+
		"&\3&\3&\6&\u0488\n&\r&\16&\u0489\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\6"+
		"\'\u0495\n\'\r\'\16\'\u0496\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\6"+
		"\'\u04a3\n\'\r\'\16\'\u04a4\7\'\u04a7\n\'\f\'\16\'\u04aa\13\'\3(\3(\5"+
		"(\u04ae\n(\3)\3)\3*\3*\3+\3+\3+\3+\3+\5+\u04b9\n+\3+\3+\3,\3,\5,\u04bf"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u04d7\n-\3.\3.\3.\3.\3.\3.\3.\5.\u04e0\n.\3/\3/\3/\5/\u04e5\n/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u04f1\n\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0507\n\67\38\38\38\38\38\38\38\58\u0510\n8"+
		"\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>"+
		"\3>\3>\3?\3?\3?\7?\u052e\n?\f?\16?\u0531\13?\3?\3?\3@\3@\3@\3@\5@\u0539"+
		"\n@\3A\3A\3A\3A\3B\3B\3B\3B\5B\u0543\nB\3C\3C\3C\3C\3D\3D\3D\3D\5D\u054d"+
		"\nD\3D\3D\3E\3E\3E\7E\u0554\nE\fE\16E\u0557\13E\3E\3E\3E\5E\u055c\nE\3"+
		"E\5E\u055f\nE\3E\5E\u0562\nE\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3I\3I\3I\3"+
		"I\3I\3J\3J\3J\3K\3K\3K\3K\3L\3L\3M\3M\5M\u057e\nM\3M\3M\3M\5M\u0583\n"+
		"M\7M\u0585\nM\fM\16M\u0588\13M\3N\3N\3N\3N\5N\u058e\nN\3N\3N\5N\u0592"+
		"\nN\3N\5N\u0595\nN\3O\3O\3O\3O\5O\u059b\nO\3P\7P\u059e\nP\fP\16P\u05a1"+
		"\13P\3P\3P\3P\6P\u05a6\nP\rP\16P\u05a7\3P\7P\u05ab\nP\fP\16P\u05ae\13"+
		"P\3P\3P\7P\u05b2\nP\fP\16P\u05b5\13P\3P\3P\7P\u05b9\nP\fP\16P\u05bc\13"+
		"P\3P\3P\7P\u05c0\nP\fP\16P\u05c3\13P\3Q\3Q\3R\3R\3S\3S\3S\3S\3T\3T\3T"+
		"\3U\3U\3U\3V\3V\3V\5V\u05d6\nV\3W\3W\3W\3W\5W\u05dc\nW\3X\3X\3X\3X\3X"+
		"\5X\u05e3\nX\3X\3X\5X\u05e7\nX\3Y\3Y\3Y\3Z\5Z\u05ed\nZ\3Z\5Z\u05f0\nZ"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u05f8\nZ\3Z\3Z\3Z\5Z\u05fd\nZ\3Z\3Z\3Z\5Z\u0602"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u0609\nZ\3Z\3Z\5Z\u060d\nZ\3Z\5Z\u0610\nZ\3[\7["+
		"\u0613\n[\f[\16[\u0616\13[\3[\3[\3[\7[\u061b\n[\f[\16[\u061e\13[\3[\3"+
		"[\7[\u0622\n[\f[\16[\u0625\13[\7[\u0627\n[\f[\16[\u062a\13[\3[\7[\u062d"+
		"\n[\f[\16[\u0630\13[\6[\u0632\n[\r[\16[\u0633\3\\\3\\\3\\\5\\\u0639\n"+
		"\\\3]\3]\3]\5]\u063e\n]\3]\3]\3]\3]\5]\u0644\n]\3^\3^\3_\3_\5_\u064a\n"+
		"_\3_\5_\u064d\n_\3_\3_\3`\3`\3`\2\2a\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\u0086\3\2op\4\2\37\37\u0157"+
		"\u0157\4\2\u012b\u012b\u0194\u0194\4\2\24\24\26\26\6\2\'\'``\u01a7\u01a7"+
		"\u01a9\u01a9\3\2\34\35\4\2&&,,\4\2((\u01a7\u01a7\4\2**--\4\2++\60\60\3"+
		"\2\62\63\4\2\65\65DD\4\2cc\u00da\u00da\4\2\u0124\u0124\u018b\u018b\4\2"+
		"::\u01a8\u01a8\4\2??HH\4\2@@EE\6\2\'\'\u0162\u0162\u01a7\u01a7\u01b1\u01b1"+
		"\3\2IJ\3\2LM\3\2^_\4\2aagg\4\2cc\u01aa\u01aa\5\2\u01a9\u01a9\u01ac\u01ac"+
		"\u01b1\u01b3\3\2\u01ab\u01ad\b\2\67\67\u00a4\u00a4\u0178\u0178\u01a8\u01a8"+
		"\u01ae\u01ae\u01b1\u01b1\4\2\u0106\u0106\u0156\u0156\4\2\21\21\u008a\u008a"+
		"\4\2nnrr\4\2\u0082\u0082\u017e\u017e\3\2xy\3\2\u0080\u0081\t\2\61\61Q"+
		"QTTzz}}\177\177\u018f\u018f\4\2\u0085\u0085\u008c\u008c\4\299kk\3\2\u0099"+
		"\u009a\6\2((\u00ad\u00ad\u00b2\u00b2\u01a7\u01a7\4\2\17\17\u00a8\u00a8"+
		"\5\2\61\61QQ\177\177\4\2\u00ad\u00ad\u00b2\u00b2\5\2\u01a9\u01a9\u01b1"+
		"\u01b1\u01b3\u01b3\3\2\u00b9\u00ba\4\2\u00bc\u00bc\u00c8\u00c8\4\2\u00bb"+
		"\u00bb\u00c0\u00c0\3\2\u00c1\u00c2\3\2\u00c6\u00c7\4\2\u00c3\u00c3\u00c9"+
		"\u00c9\3\2\u00cb\u00cc\3\2\u00d5\u00d6\4\2\u00d8\u00d8\u00df\u00df\4\2"+
		"\u00d7\u00d7\u00da\u00da\3\2\u00e2\u00e3\3\2\u00e7\u00e8\3\2\u00f3\u00f4"+
		"\3\2\u00f6\u00f7\3\2\u00f8\u00f9\3\2\u00fb\u00fc\3\2\u00ff\u0100\4\2\u010d"+
		"\u010d\u011c\u011c\3\2\u010e\u010f\4\2\u010a\u010a\u0113\u0113\3\2\u0116"+
		"\u0117\3\2\u0119\u011a\4\2\u0112\u0112\u011d\u011d\3\2\u011e\u011f\3\2"+
		"\u0120\u0121\3\2\u012c\u012d\4\2\u0135\u0135\u0137\u0137\4\2\66\66\u00a0"+
		"\u00a1\3\2\u012e\u012f\4\2\u0130\u0130\u0133\u0133\3\2\u0138\u0139\4\2"+
		"\u00a3\u00a3\u013a\u013a\5\2\u009b\u009b\u0105\u0105\u0152\u0152\3\2\u013c"+
		"\u013d\3\2\u013f\u0140\4\2\u0147\u0147\u0149\u0149\5\2hh\u017c\u017c\u01bc"+
		"\u01bc\3\2\u014b\u014c\4\2\u014f\u014f\u0151\u0151\4\2\13\13\u009e\u009e"+
		"\3\2\u0154\u0155\n\2##\'\'\u008f\u0091\u0094\u0094\u009c\u009c\u0191\u0191"+
		"\u01ad\u01ad\u01b2\u01b2\3\2\u0159\u015a\4\2\u015b\u015b\u01b0\u01b0\3"+
		"\2\u0164\u0165\3\2\u0166\u0167\4\2\u0169\u0169\u0184\u0184\4\2\u016c\u016c"+
		"\u01b1\u01b1\3\2\u0171\u0172\3\2\u0179\u017a\4\2\u0177\u0177\u017d\u017d"+
		"\3\2\u0181\u0182\3\2\u0185\u0186\5\2\32\32\u0147\u0147\u017c\u017c\6\2"+
		"\'\'\u017b\u017b\u01a7\u01a7\u01b1\u01b1\3\2\u0195\u0196\6\2\'\'\u0180"+
		"\u0180\u01a7\u01a7\u01b1\u01b1\3\2\u0197\u0198\4\2\u0199\u0199\u019c\u019c"+
		"\6\2\'\'\u019a\u019a\u01a7\u01a7\u01b4\u01b4\4\2\u019d\u019d\u01b4\u01b4"+
		"\4\2hh\u0168\u0168\3\2\u019e\u019f\4\2\u01a0\u01a0\u01a4\u01a4\4\2\u01a1"+
		"\u01a1\u01a5\u01a5\3\2;<\4\2\u01a7\u01b4\u01bd\u01bd\b\2\"\"\61\61ef\u00b0"+
		"\u00b0\u00b8\u00b8\u00dd\u00de\4\2\u0125\u0125\u018d\u018d\7\2\20\20\u0082"+
		"\u0082\u0084\u0084\u00a9\u00a9\u017e\u017f\21\2RSWX\u0083\u0084\u0095"+
		"\u0095\u00cf\u00d0\u00d2\u00d3\u00eb\u00ec\u00f1\u00f1\u00fa\u00fa\u00fd"+
		"\u00fd\u0110\u0111\u0126\u0129\u0142\u0143\u016a\u016b\u0190\u0190\6\2"+
		"\13\13\u009e\u009e\u0131\u0131\u01a2\u01a2\3\2\u0162\u0163\4\2GG\u00c5"+
		"\u00c5\4\2qq\u013e\u013e\4\2\u0086\u0086\u018a\u018a\3\2\u0174\u0176\3"+
		"\2\u01ba\u01bc\3\2\u01d8\u01d9\4\2\u01e0\u01e1\u0203\u0203\3\2\u01f7\u01f8"+
		"\4\2\u01bd\u01bd\u01db\u01db\4\2\u01bd\u01bd\u01d4\u01d4\5\2\u01bd\u01bd"+
		"\u01d4\u01d4\u0201\u0201\4\2\u01e8\u01e8\u01ec\u01ec\r\2<<\u016c\u016c"+
		"\u01d7\u01d7\u01dc\u01dc\u01de\u01de\u01e9\u01ea\u01f2\u01f2\u01f4\u01f4"+
		"\u01ff\u01ff\u0201\u0201\u020a\u020a\4\2\u01bc\u01bd\u01d3\u01d3\4\2\u01c9"+
		"\u01c9\u01cd\u01cf\3\2\u0206\u0207\4\2\u01d6\u01d6\u01f9\u01f9*\2\13\36"+
		" !#(*=?TVY]acdgnquwwzz}}\177\u0083\u0085\u0086\u0088\u0092\u0094\u00af"+
		"\u00b1\u00b7\u00b9\u00dc\u00df\u00e6\u00eb\u00eb\u00ed\u0124\u0126\u012b"+
		"\u012d\u014c\u014e\u0150\u0152\u0156\u0158\u015c\u015e\u015f\u0161\u0173"+
		"\u0177\u017e\u0180\u018c\u018f\u0197\u0199\u019b\u019d\u01b4\u01b6\u01b6"+
		"\u01cd\u01cd\u01f9\u01f9\u0203\u0203\u0208\u0209\u020d\u020d\2\u07c9\2"+
		"\u00d1\3\2\2\2\4\u00d6\3\2\2\2\6\u00d9\3\2\2\2\b\u00e3\3\2\2\2\n\u031c"+
		"\3\2\2\2\f\u031e\3\2\2\2\16\u032e\3\2\2\2\20\u0330\3\2\2\2\22\u034b\3"+
		"\2\2\2\24\u034d\3\2\2\2\26\u034f\3\2\2\2\30\u0351\3\2\2\2\32\u0365\3\2"+
		"\2\2\34\u0367\3\2\2\2\36\u0381\3\2\2\2 \u0383\3\2\2\2\"\u038c\3\2\2\2"+
		"$\u039b\3\2\2\2&\u03aa\3\2\2\2(\u03b6\3\2\2\2*\u03d2\3\2\2\2,\u03e6\3"+
		"\2\2\2.\u03e8\3\2\2\2\60\u03fb\3\2\2\2\62\u0406\3\2\2\2\64\u041a\3\2\2"+
		"\2\66\u0425\3\2\2\28\u0448\3\2\2\2:\u0453\3\2\2\2<\u0462\3\2\2\2>\u0468"+
		"\3\2\2\2@\u046a\3\2\2\2B\u046e\3\2\2\2D\u0472\3\2\2\2F\u0477\3\2\2\2H"+
		"\u047f\3\2\2\2J\u0487\3\2\2\2L\u0494\3\2\2\2N\u04ad\3\2\2\2P\u04af\3\2"+
		"\2\2R\u04b1\3\2\2\2T\u04b3\3\2\2\2V\u04be\3\2\2\2X\u04d6\3\2\2\2Z\u04df"+
		"\3\2\2\2\\\u04e1\3\2\2\2^\u04e6\3\2\2\2`\u04ea\3\2\2\2b\u04f0\3\2\2\2"+
		"d\u04f2\3\2\2\2f\u04f5\3\2\2\2h\u04f8\3\2\2\2j\u04fc\3\2\2\2l\u0500\3"+
		"\2\2\2n\u0508\3\2\2\2p\u0511\3\2\2\2r\u0516\3\2\2\2t\u051b\3\2\2\2v\u051e"+
		"\3\2\2\2x\u0522\3\2\2\2z\u0526\3\2\2\2|\u052a\3\2\2\2~\u0534\3\2\2\2\u0080"+
		"\u053a\3\2\2\2\u0082\u053e\3\2\2\2\u0084\u0544\3\2\2\2\u0086\u0548\3\2"+
		"\2\2\u0088\u0550\3\2\2\2\u008a\u0563\3\2\2\2\u008c\u0565\3\2\2\2\u008e"+
		"\u056a\3\2\2\2\u0090\u056d\3\2\2\2\u0092\u0572\3\2\2\2\u0094\u0575\3\2"+
		"\2\2\u0096\u0579\3\2\2\2\u0098\u057d\3\2\2\2\u009a\u0589\3\2\2\2\u009c"+
		"\u059a\3\2\2\2\u009e\u05a5\3\2\2\2\u00a0\u05c4\3\2\2\2\u00a2\u05c6\3\2"+
		"\2\2\u00a4\u05c8\3\2\2\2\u00a6\u05cc\3\2\2\2\u00a8\u05cf\3\2\2\2\u00aa"+
		"\u05d5\3\2\2\2\u00ac\u05d7\3\2\2\2\u00ae\u05dd\3\2\2\2\u00b0\u05e8\3\2"+
		"\2\2\u00b2\u05ec\3\2\2\2\u00b4\u0631\3\2\2\2\u00b6\u0638\3\2\2\2\u00b8"+
		"\u063d\3\2\2\2\u00ba\u0645\3\2\2\2\u00bc\u0647\3\2\2\2\u00be\u0650\3\2"+
		"\2\2\u00c0\u00d0\5\4\3\2\u00c1\u00d0\5\6\4\2\u00c2\u00d0\5V,\2\u00c3\u00d0"+
		"\5 \21\2\u00c4\u00d0\5(\25\2\u00c5\u00d0\5\"\22\2\u00c6\u00d0\5$\23\2"+
		"\u00c7\u00d0\5&\24\2\u00c8\u00d0\5\64\33\2\u00c9\u00d0\5\60\31\2\u00ca"+
		"\u00d0\5@!\2\u00cb\u00d0\5B\"\2\u00cc\u00d0\5D#\2\u00cd\u00d0\5L\'\2\u00ce"+
		"\u00d0\7\u01c0\2\2\u00cf\u00c0\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00c2"+
		"\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf"+
		"\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7\2\2\3\u00d5\3\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\u00d8\7A\2\2"+
		"\u00d8\5\3\2\2\2\u00d9\u00df\t\3\2\2\u00da\u00dc\7\u01b6\2\2\u00db\u00da"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\5\n\6\2\u00de"+
		"\u00e0\5\b\5\2\u00df\u00db\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\7\3\2\2\2\u00e3\u00e4"+
		"\7\u019b\2\2\u00e4\u00e5\7\u0093\2\2\u00e5\u00ec\5\n\6\2\u00e6\u00e8\7"+
		"\u01b6\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00eb\5\n\6\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\u0160\2\2\u00f0\t\3\2\2\2\u00f1\u031d\7\f\2\2\u00f2\u031d\7\r"+
		"\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5\7\u0093\2\2\u00f5\u00f6\t\4\2\2"+
		"\u00f6\u031d\7\u0160\2\2\u00f7\u031d\7\23\2\2\u00f8\u00f9\7\25\2\2\u00f9"+
		"\u00fa\7\u0093\2\2\u00fa\u00fb\5P)\2\u00fb\u00fc\7\u0160\2\2\u00fc\u031d"+
		"\3\2\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff\7\u0093\2\2\u00ff\u0100\t\6\2"+
		"\2\u0100\u031d\7\u0160\2\2\u0101\u031d\7\30\2\2\u0102\u031d\7\33\2\2\u0103"+
		"\u0104\t\7\2\2\u0104\u0105\7\u0093\2\2\u0105\u0106\5P)\2\u0106\u0107\7"+
		"\u0160\2\2\u0107\u031d\3\2\2\2\u0108\u031d\7 \2\2\u0109\u010e\7!\2\2\u010a"+
		"\u010b\7\u0093\2\2\u010b\u010c\5P)\2\u010c\u010d\7\u0160\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u031d\3\2\2\2\u0110"+
		"\u031d\7$\2\2\u0111\u031d\7%\2\2\u0112\u0113\t\b\2\2\u0113\u0114\7\u0093"+
		"\2\2\u0114\u0115\5P)\2\u0115\u0116\7\u0160\2\2\u0116\u031d\3\2\2\2\u0117"+
		"\u031d\t\t\2\2\u0118\u0119\t\n\2\2\u0119\u011c\7\u0093\2\2\u011a\u011d"+
		"\7\u01bd\2\2\u011b\u011d\5P)\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u0125\3\2\2\2\u011e\u0120\7\u01b6\2\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7F"+
		"\2\2\u0122\u0123\7\u0093\2\2\u0123\u0124\7\u01be\2\2\u0124\u0126\7\u0160"+
		"\2\2\u0125\u011f\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012f\3\2\2\2\u0127"+
		"\u0129\7\u01b6\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\7\u0150\2\2\u012b\u012c\7\u0093\2\2\u012c\u012d\5"+
		"P)\2\u012d\u012e\7\u0160\2\2\u012e\u0130\3\2\2\2\u012f\u0128\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u031d\7\u0160\2\2\u0132\u0133"+
		"\t\13\2\2\u0133\u0134\7\u0093\2\2\u0134\u0135\5P)\2\u0135\u0136\7\u0160"+
		"\2\2\u0136\u031d\3\2\2\2\u0137\u031d\7.\2\2\u0138\u031d\7/\2\2\u0139\u013a"+
		"\t\f\2\2\u013a\u013c\7\u0093\2\2\u013b\u013d\7\u01c3\2\2\u013c\u013b\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u031d\7\u0160\2\2\u0141\u0142\7\64\2\2\u0142\u0143"+
		"\7\u0093\2\2\u0143\u0144\5P)\2\u0144\u0145\7\u0160\2\2\u0145\u031d\3\2"+
		"\2\2\u0146\u0152\t\r\2\2\u0147\u0149\7\u0093\2\2\u0148\u014a\t\16\2\2"+
		"\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d"+
		"\7\u01b6\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2"+
		"\2\u014e\u0150\t\17\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\7\u0160\2\2\u0152\u0147\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u031d\3\2\2\2\u0154\u031d\7\66\2\2\u0155\u031d\t\20\2\2"+
		"\u0156\u031d\78\2\2\u0157\u031d\5\f\7\2\u0158\u031d\t\21\2\2\u0159\u015a"+
		"\t\22\2\2\u015a\u015b\7\u0093\2\2\u015b\u015c\t\23\2\2\u015c\u031d\7\u0160"+
		"\2\2\u015d\u031d\7C\2\2\u015e\u031d\t\24\2\2\u015f\u031d\t\25\2\2\u0160"+
		"\u031d\7N\2\2\u0161\u031d\7V\2\2\u0162\u031d\7]\2\2\u0163\u031d\t\26\2"+
		"\2\u0164\u031d\t\27\2\2\u0165\u031d\7b\2\2\u0166\u0167\t\30\2\2\u0167"+
		"\u0168\7\u0093\2\2\u0168\u016b\t\31\2\2\u0169\u016a\7\u01b6\2\2\u016a"+
		"\u016c\t\31\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u031d\7\u0160\2\2\u016e\u016f\7d\2\2\u016f\u0170\7\u0093"+
		"\2\2\u0170\u0173\t\32\2\2\u0171\u0172\7\u01b6\2\2\u0172\u0174\t\33\2\2"+
		"\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0176"+
		"\7\u01b6\2\2\u0176\u0178\7\u01af\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u031d\7\u0160\2\2\u017a\u031d\7i\2\2"+
		"\u017b\u031d\7j\2\2\u017c\u017d\7l\2\2\u017d\u017e\7\u0093\2\2\u017e\u017f"+
		"\t\34\2\2\u017f\u031d\7\u0160\2\2\u0180\u0181\7s\2\2\u0181\u0182\7\u0093"+
		"\2\2\u0182\u0183\t\35\2\2\u0183\u031d\7\u0160\2\2\u0184\u0188\t\36\2\2"+
		"\u0185\u0186\7\u0093\2\2\u0186\u0187\t\37\2\2\u0187\u0189\7\u0160\2\2"+
		"\u0188\u0185\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u031d\3\2\2\2\u018a\u031d"+
		"\7t\2\2\u018b\u031d\7v\2\2\u018c\u031d\7u\2\2\u018d\u0199\t \2\2\u018e"+
		"\u018f\7\u0093\2\2\u018f\u0194\5\20\t\2\u0190\u0191\7\u01b6\2\2\u0191"+
		"\u0193\5\20\t\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0198\7\u0160\2\2\u0198\u019a\3\2\2\2\u0199\u018e\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u031d\3\2\2\2\u019b\u031d\5\34\17\2\u019c\u019d\t!\2\2"+
		"\u019d\u019e\7\u0093\2\2\u019e\u019f\t\"\2\2\u019f\u031d\7\u0160\2\2\u01a0"+
		"\u031d\7\u0087\2\2\u01a1\u031d\7\u0088\2\2\u01a2\u031d\7\u0089\2\2\u01a3"+
		"\u031d\7\u008b\2\2\u01a4\u01a5\t#\2\2\u01a5\u01a6\7\u0093\2\2\u01a6\u01a7"+
		"\5P)\2\u01a7\u01a8\7\u0160\2\2\u01a8\u031d\3\2\2\2\u01a9\u031d\7\u008d"+
		"\2\2\u01aa\u031d\7\u008e\2\2\u01ab\u01ac\7\u0092\2\2\u01ac\u01ad\7\u0093"+
		"\2\2\u01ad\u01ae\5P)\2\u01ae\u01af\7\u0160\2\2\u01af\u031d\3\2\2\2\u01b0"+
		"\u01b4\7\u0096\2\2\u01b1\u01b2\7\u0093\2\2\u01b2\u01b3\t$\2\2\u01b3\u01b5"+
		"\7\u0160\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u031d\3\2\2"+
		"\2\u01b6\u01b7\7\u0097\2\2\u01b7\u01b8\7\u0093\2\2\u01b8\u01b9\5P)\2\u01b9"+
		"\u01ba\7\u01b6\2\2\u01ba\u01bd\5P)\2\u01bb\u01bc\7\u01b6\2\2\u01bc\u01be"+
		"\5P)\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\7\u0160\2\2\u01c0\u031d\3\2\2\2\u01c1\u01c2\7\u009d\2\2\u01c2\u01c3"+
		"\7\u0093\2\2\u01c3\u01c4\5P)\2\u01c4\u01c5\7\u0160\2\2\u01c5\u031d\3\2"+
		"\2\2\u01c6\u01ca\t%\2\2\u01c7\u01c8\7\u0093\2\2\u01c8\u01c9\t&\2\2\u01c9"+
		"\u01cb\7\u0160\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u031d"+
		"\3\2\2\2\u01cc\u01d0\7\u009f\2\2\u01cd\u01ce\7\u0093\2\2\u01ce\u01cf\t"+
		"\'\2\2\u01cf\u01d1\7\u0160\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01d1\3\2\2\2"+
		"\u01d1\u031d\3\2\2\2\u01d2\u01d3\7\u00a2\2\2\u01d3\u01d4\7\u0093\2\2\u01d4"+
		"\u01d5\t(\2\2\u01d5\u031d\7\u0160\2\2\u01d6\u031d\7\u00a6\2\2\u01d7\u031d"+
		"\7\u00a7\2\2\u01d8\u031d\7\u00aa\2\2\u01d9\u031d\7\u00ac\2\2\u01da\u031d"+
		"\7\u00ae\2\2\u01db\u031d\7\u00af\2\2\u01dc\u031d\7\u00b1\2\2\u01dd\u01e1"+
		"\t)\2\2\u01de\u01df\7\u0093\2\2\u01df\u01e0\t*\2\2\u01e0\u01e2\7\u0160"+
		"\2\2\u01e1\u01de\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u031d\3\2\2\2\u01e3"+
		"\u031d\7\u00b3\2\2\u01e4\u031d\7\u00b5\2\2\u01e5\u031d\7\u00b4\2\2\u01e6"+
		"\u031d\7\u00b7\2\2\u01e7\u031d\7\u00b6\2\2\u01e8\u031d\t+\2\2\u01e9\u031d"+
		"\t,\2\2\u01ea\u031d\7\u00bd\2\2\u01eb\u031d\7\u00bf\2\2\u01ec\u031d\t"+
		"-\2\2\u01ed\u031d\t.\2\2\u01ee\u031d\7\u00c4\2\2\u01ef\u031d\7\u00be\2"+
		"\2\u01f0\u031d\t/\2\2\u01f1\u031d\t\60\2\2\u01f2\u031d\t\61\2\2\u01f3"+
		"\u031d\7\u00cd\2\2\u01f4\u031d\7\u00d1\2\2\u01f5\u031d\7\u00d4\2\2\u01f6"+
		"\u031d\t\62\2\2\u01f7\u031d\t\63\2\2\u01f8\u031d\7\u00d9\2\2\u01f9\u031d"+
		"\t\64\2\2\u01fa\u031d\7\u00db\2\2\u01fb\u031d\7\u00dc\2\2\u01fc\u031d"+
		"\7\u00e0\2\2\u01fd\u031d\t\65\2\2\u01fe\u031d\7\u00e4\2\2\u01ff\u031d"+
		"\7\u00e5\2\2\u0200\u031d\7\u00e6\2\2\u0201\u031d\t\66\2\2\u0202\u031d"+
		"\7\u00e9\2\2\u0203\u031d\7\u00ed\2\2\u0204\u031d\7\u00ee\2\2\u0205\u031d"+
		"\7\u00ef\2\2\u0206\u031d\7\u00f0\2\2\u0207\u031d\7\u00f2\2\2\u0208\u031d"+
		"\t\67\2\2\u0209\u031d\7\u00f5\2\2\u020a\u031d\t8\2\2\u020b\u031d\t9\2"+
		"\2\u020c\u031d\t:\2\2\u020d\u031d\7\u00fe\2\2\u020e\u031d\t;\2\2\u020f"+
		"\u031d\7\u0101\2\2\u0210\u031d\7\u0102\2\2\u0211\u031d\7\u0104\2\2\u0212"+
		"\u031d\7\u0107\2\2\u0213\u031d\7\u0108\2\2\u0214\u031d\7\u0109\2\2\u0215"+
		"\u031d\t<\2\2\u0216\u031d\t=\2\2\u0217\u031d\t>\2\2\u0218\u031d\7\u0114"+
		"\2\2\u0219\u031d\7\u0115\2\2\u021a\u031d\7\u0118\2\2\u021b\u031d\t?\2"+
		"\2\u021c\u031d\t@\2\2\u021d\u031d\7\u011b\2\2\u021e\u031d\tA\2\2\u021f"+
		"\u031d\tB\2\2\u0220\u031d\tC\2\2\u0221\u031d\7\u0122\2\2\u0222\u031d\7"+
		"\u0123\2\2\u0223\u031d\7\u012a\2\2\u0224\u031d\tD\2\2\u0225\u031d\7\u0136"+
		"\2\2\u0226\u0227\tE\2\2\u0227\u0228\7\u0093\2\2\u0228\u0229\tF\2\2\u0229"+
		"\u031d\7\u0160\2\2\u022a\u031d\7\u012a\2\2\u022b\u031d\tG\2\2\u022c\u031d"+
		"\tH\2\2\u022d\u031d\7\u0134\2\2\u022e\u031d\tI\2\2\u022f\u023b\tJ\2\2"+
		"\u0230\u0231\7\u0093\2\2\u0231\u0236\5\22\n\2\u0232\u0233\7\u01b6\2\2"+
		"\u0233\u0235\5\22\n\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023a\7\u0160\2\2\u023a\u023c\3\2\2\2\u023b\u0230\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u031d\3\2\2\2\u023d\u023e\7\u013b\2\2\u023e\u023f\7\u0093"+
		"\2\2\u023f\u0240\tK\2\2\u0240\u031d\7\u0160\2\2\u0241\u031d\tL\2\2\u0242"+
		"\u031d\tM\2\2\u0243\u0244\7\u0145\2\2\u0244\u0245\7\u0093\2\2\u0245\u0246"+
		"\5P)\2\u0246\u0247\7\u01b6\2\2\u0247\u024a\5P)\2\u0248\u0249\7\u01b6\2"+
		"\2\u0249\u024b\5P)\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u024d\7\u0160\2\2\u024d\u031d\3\2\2\2\u024e\u024f\7\u0146"+
		"\2\2\u024f\u0250\7\u0093\2\2\u0250\u0251\5P)\2\u0251\u0252\7\u01b6\2\2"+
		"\u0252\u0253\5P)\2\u0253\u0254\7\u0160\2\2\u0254\u031d\3\2\2\2\u0255\u0259"+
		"\tN\2\2\u0256\u0257\7\u0093\2\2\u0257\u0258\tO\2\2\u0258\u025a\7\u0160"+
		"\2\2\u0259\u0256\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u031d\3\2\2\2\u025b"+
		"\u031d\7\u0148\2\2\u025c\u031d\7\u014a\2\2\u025d\u031d\7\u0144\2\2\u025e"+
		"\u025f\tP\2\2\u025f\u0260\7\u0093\2\2\u0260\u0261\5N(\2\u0261\u0262\7"+
		"\u0160\2\2\u0262\u031d\3\2\2\2\u0263\u026f\tQ\2\2\u0264\u0266\7\u0093"+
		"\2\2\u0265\u0267\tR\2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u026c\3\2\2\2\u0268\u026a\7\u01b6\2\2\u0269\u0268\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\5P)\2\u026c\u0269\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\7\u0160\2\2\u026f\u0264"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u031d\3\2\2\2\u0271\u0272\tS\2\2\u0272"+
		"\u0273\7\u0093\2\2\u0273\u0274\tT\2\2\u0274\u031d\7\u0160\2\2\u0275\u031d"+
		"\7\u0158\2\2\u0276\u0277\tU\2\2\u0277\u0278\7\u0093\2\2\u0278\u0279\t"+
		"\6\2\2\u0279\u031d\7\u0160\2\2\u027a\u031d\tV\2\2\u027b\u031d\7\u015c"+
		"\2\2\u027c\u027d\7\u015f\2\2\u027d\u0281\7\u0093\2\2\u027e\u0282\7\22"+
		"\2\2\u027f\u0282\7\27\2\2\u0280\u0282\5P)\2\u0281\u027e\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u031d\7\u0160"+
		"\2\2\u0284\u0290\7\u0161\2\2\u0285\u0286\7\u0093\2\2\u0286\u028b\5\26"+
		"\f\2\u0287\u0288\7\u01b6\2\2\u0288\u028a\5\26\f\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e"+
		"\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\7\u0160\2\2\u028f\u0291\3\2\2"+
		"\2\u0290\u0285\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u031d\3\2\2\2\u0292\u0299"+
		"\tW\2\2\u0293\u0294\7\u0093\2\2\u0294\u0295\5P)\2\u0295\u0296\7\u01b6"+
		"\2\2\u0296\u0297\5P)\2\u0297\u0298\7\u0160\2\2\u0298\u029a\3\2\2\2\u0299"+
		"\u0293\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u031d\3\2\2\2\u029b\u029c\tX"+
		"\2\2\u029c\u029d\7\u0093\2\2\u029d\u029e\5P)\2\u029e\u029f\7\u0160\2\2"+
		"\u029f\u031d\3\2\2\2\u02a0\u02a1\tY\2\2\u02a1\u02a4\7\u0093\2\2\u02a2"+
		"\u02a5\7\u0098\2\2\u02a3\u02a5\5P)\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3"+
		"\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u031d\7\u0160\2\2\u02a7\u02ab\tZ\2\2"+
		"\u02a8\u02a9\7\u0093\2\2\u02a9\u02aa\t$\2\2\u02aa\u02ac\7\u0160\2\2\u02ab"+
		"\u02a8\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u031d\3\2\2\2\u02ad\u031d\7\u016d"+
		"\2\2\u02ae\u02af\7\u016e\2\2\u02af\u02b0\7\u0093\2\2\u02b0\u02b1\5P)\2"+
		"\u02b1\u02b2\7\u0160\2\2\u02b2\u031d\3\2\2\2\u02b3\u031d\7\u016f\2\2\u02b4"+
		"\u02b9\7\u0170\2\2\u02b5\u02b6\7\u0093\2\2\u02b6\u02b7\5P)\2\u02b7\u02b8"+
		"\7\u0160\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b5\3\2\2\2\u02b9\u02ba\3\2\2"+
		"\2\u02ba\u031d\3\2\2\2\u02bb\u031d\t[\2\2\u02bc\u02c1\7\u0173\2\2\u02bd"+
		"\u02be\7\u0093\2\2\u02be\u02bf\5P)\2\u02bf\u02c0\7\u0160\2\2\u02c0\u02c2"+
		"\3\2\2\2\u02c1\u02bd\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u031d\3\2\2\2\u02c3"+
		"\u02cf\t\\\2\2\u02c4\u02c5\7\u0093\2\2\u02c5\u02ca\5\30\r\2\u02c6\u02c7"+
		"\7\u01b6\2\2\u02c7\u02c9\5\30\r\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\3\2"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cd\u02ce\7\u0160\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02c4"+
		"\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u031d\3\2\2\2\u02d1\u031d\t]\2\2\u02d2"+
		"\u031d\t^\2\2\u02d3\u031d\7\u0183\2\2\u02d4\u031d\t_\2\2\u02d5\u02e1\7"+
		"\u0187\2\2\u02d6\u02d7\7\u0093\2\2\u02d7\u02dc\5\32\16\2\u02d8\u02d9\7"+
		"\u01b6\2\2\u02d9\u02db\5\32\16\2\u02da\u02d8\3\2\2\2\u02db\u02de\3\2\2"+
		"\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02dc"+
		"\3\2\2\2\u02df\u02e0\7\u0160\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02d6\3\2\2"+
		"\2\u02e1\u02e2\3\2\2\2\u02e2\u031d\3\2\2\2\u02e3\u031d\7\u0188\2\2\u02e4"+
		"\u02e5\7\u018c\2\2\u02e5\u02e6\7\u0093\2\2\u02e6\u02e7\t`\2\2\u02e7\u031d"+
		"\7\u0160\2\2\u02e8\u02e9\7\u018e\2\2\u02e9\u02ea\7\u0093\2\2\u02ea\u02eb"+
		"\5P)\2\u02eb\u02ec\7\u0160\2\2\u02ec\u031d\3\2\2\2\u02ed\u031d\7\u0192"+
		"\2\2\u02ee\u02ef\7\u0193\2\2\u02ef\u02f0\7\u0093\2\2\u02f0\u02f1\ta\2"+
		"\2\u02f1\u031d\7\u0160\2\2\u02f2\u02f3\tb\2\2\u02f3\u02f4\7\u0093\2\2"+
		"\u02f4\u02f5\tc\2\2\u02f5\u031d\7\u0160\2\2\u02f6\u02f7\td\2\2\u02f7\u02fe"+
		"\7\u0093\2\2\u02f8\u02ff\5N(\2\u02f9\u02fb\7\u01c3\2\2\u02fa\u02f9\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u02ff\3\2\2\2\u02fe\u02f8\3\2\2\2\u02fe\u02fa\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u031d\7\u0160\2\2\u0301\u0302\te\2\2\u0302\u0303\7\u0093\2"+
		"\2\u0303\u0304\tf\2\2\u0304\u031d\7\u0160\2\2\u0305\u030b\tg\2\2\u0306"+
		"\u0308\7\u0093\2\2\u0307\u0309\th\2\2\u0308\u0307\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\7\u0160\2\2\u030b\u0306\3\2\2"+
		"\2\u030b\u030c\3\2\2\2\u030c\u031d\3\2\2\2\u030d\u030e\ti\2\2\u030e\u030f"+
		"\7\u0093\2\2\u030f\u0310\5P)\2\u0310\u0311\7\u0160\2\2\u0311\u031d\3\2"+
		"\2\2\u0312\u0313\tj\2\2\u0313\u0314\7\u0093\2\2\u0314\u0315\tR\2\2\u0315"+
		"\u031d\7\u0160\2\2\u0316\u0317\tk\2\2\u0317\u0318\7\u0093\2\2\u0318\u0319"+
		"\tK\2\2\u0319\u031d\7\u0160\2\2\u031a\u031d\7\u01a6\2\2\u031b\u031d\5"+
		"\32\16\2\u031c\u00f1\3\2\2\2\u031c\u00f2\3\2\2\2\u031c\u00f3\3\2\2\2\u031c"+
		"\u00f7\3\2\2\2\u031c\u00f8\3\2\2\2\u031c\u00fd\3\2\2\2\u031c\u0101\3\2"+
		"\2\2\u031c\u0102\3\2\2\2\u031c\u0103\3\2\2\2\u031c\u0108\3\2\2\2\u031c"+
		"\u0109\3\2\2\2\u031c\u0110\3\2\2\2\u031c\u0111\3\2\2\2\u031c\u0112\3\2"+
		"\2\2\u031c\u0117\3\2\2\2\u031c\u0118\3\2\2\2\u031c\u0132\3\2\2\2\u031c"+
		"\u0137\3\2\2\2\u031c\u0138\3\2\2\2\u031c\u0139\3\2\2\2\u031c\u0141\3\2"+
		"\2\2\u031c\u0146\3\2\2\2\u031c\u0154\3\2\2\2\u031c\u0155\3\2\2\2\u031c"+
		"\u0156\3\2\2\2\u031c\u0157\3\2\2\2\u031c\u0158\3\2\2\2\u031c\u0159\3\2"+
		"\2\2\u031c\u015d\3\2\2\2\u031c\u015e\3\2\2\2\u031c\u015f\3\2\2\2\u031c"+
		"\u0160\3\2\2\2\u031c\u0161\3\2\2\2\u031c\u0162\3\2\2\2\u031c\u0163\3\2"+
		"\2\2\u031c\u0164\3\2\2\2\u031c\u0165\3\2\2\2\u031c\u0166\3\2\2\2\u031c"+
		"\u016e\3\2\2\2\u031c\u017a\3\2\2\2\u031c\u017b\3\2\2\2\u031c\u017c\3\2"+
		"\2\2\u031c\u0180\3\2\2\2\u031c\u0184\3\2\2\2\u031c\u018a\3\2\2\2\u031c"+
		"\u018b\3\2\2\2\u031c\u018c\3\2\2\2\u031c\u018d\3\2\2\2\u031c\u019b\3\2"+
		"\2\2\u031c\u019c\3\2\2\2\u031c\u01a0\3\2\2\2\u031c\u01a1\3\2\2\2\u031c"+
		"\u01a2\3\2\2\2\u031c\u01a3\3\2\2\2\u031c\u01a4\3\2\2\2\u031c\u01a9\3\2"+
		"\2\2\u031c\u01aa\3\2\2\2\u031c\u01ab\3\2\2\2\u031c\u01b0\3\2\2\2\u031c"+
		"\u01b6\3\2\2\2\u031c\u01c1\3\2\2\2\u031c\u01c6\3\2\2\2\u031c\u01cc\3\2"+
		"\2\2\u031c\u01d2\3\2\2\2\u031c\u01d6\3\2\2\2\u031c\u01d7\3\2\2\2\u031c"+
		"\u01d8\3\2\2\2\u031c\u01d9\3\2\2\2\u031c\u01da\3\2\2\2\u031c\u01db\3\2"+
		"\2\2\u031c\u01dc\3\2\2\2\u031c\u01dd\3\2\2\2\u031c\u01e3\3\2\2\2\u031c"+
		"\u01e4\3\2\2\2\u031c\u01e5\3\2\2\2\u031c\u01e6\3\2\2\2\u031c\u01e7\3\2"+
		"\2\2\u031c\u01e8\3\2\2\2\u031c\u01e9\3\2\2\2\u031c\u01ea\3\2\2\2\u031c"+
		"\u01eb\3\2\2\2\u031c\u01ec\3\2\2\2\u031c\u01ed\3\2\2\2\u031c\u01ee\3\2"+
		"\2\2\u031c\u01ef\3\2\2\2\u031c\u01f0\3\2\2\2\u031c\u01f1\3\2\2\2\u031c"+
		"\u01f2\3\2\2\2\u031c\u01f3\3\2\2\2\u031c\u01f4\3\2\2\2\u031c\u01f5\3\2"+
		"\2\2\u031c\u01f6\3\2\2\2\u031c\u01f7\3\2\2\2\u031c\u01f8\3\2\2\2\u031c"+
		"\u01f9\3\2\2\2\u031c\u01fa\3\2\2\2\u031c\u01fb\3\2\2\2\u031c\u01fc\3\2"+
		"\2\2\u031c\u01fd\3\2\2\2\u031c\u01fe\3\2\2\2\u031c\u01ff\3\2\2\2\u031c"+
		"\u0200\3\2\2\2\u031c\u0201\3\2\2\2\u031c\u0202\3\2\2\2\u031c\u0203\3\2"+
		"\2\2\u031c\u0204\3\2\2\2\u031c\u0205\3\2\2\2\u031c\u0206\3\2\2\2\u031c"+
		"\u0207\3\2\2\2\u031c\u0208\3\2\2\2\u031c\u0209\3\2\2\2\u031c\u020a\3\2"+
		"\2\2\u031c\u020b\3\2\2\2\u031c\u020c\3\2\2\2\u031c\u020d\3\2\2\2\u031c"+
		"\u020e\3\2\2\2\u031c\u020f\3\2\2\2\u031c\u0210\3\2\2\2\u031c\u0211\3\2"+
		"\2\2\u031c\u0212\3\2\2\2\u031c\u0213\3\2\2\2\u031c\u0214\3\2\2\2\u031c"+
		"\u0215\3\2\2\2\u031c\u0216\3\2\2\2\u031c\u0217\3\2\2\2\u031c\u0218\3\2"+
		"\2\2\u031c\u0219\3\2\2\2\u031c\u021a\3\2\2\2\u031c\u021b\3\2\2\2\u031c"+
		"\u021c\3\2\2\2\u031c\u021d\3\2\2\2\u031c\u021e\3\2\2\2\u031c\u021f\3\2"+
		"\2\2\u031c\u0220\3\2\2\2\u031c\u0221\3\2\2\2\u031c\u0222\3\2\2\2\u031c"+
		"\u0223\3\2\2\2\u031c\u0224\3\2\2\2\u031c\u0225\3\2\2\2\u031c\u0226\3\2"+
		"\2\2\u031c\u022a\3\2\2\2\u031c\u022b\3\2\2\2\u031c\u022c\3\2\2\2\u031c"+
		"\u022d\3\2\2\2\u031c\u022e\3\2\2\2\u031c\u022f\3\2\2\2\u031c\u023d\3\2"+
		"\2\2\u031c\u0241\3\2\2\2\u031c\u0242\3\2\2\2\u031c\u0243\3\2\2\2\u031c"+
		"\u024e\3\2\2\2\u031c\u0255\3\2\2\2\u031c\u025b\3\2\2\2\u031c\u025c\3\2"+
		"\2\2\u031c\u025d\3\2\2\2\u031c\u025e\3\2\2\2\u031c\u0263\3\2\2\2\u031c"+
		"\u0271\3\2\2\2\u031c\u0275\3\2\2\2\u031c\u0276\3\2\2\2\u031c\u027a\3\2"+
		"\2\2\u031c\u027b\3\2\2\2\u031c\u027c\3\2\2\2\u031c\u0284\3\2\2\2\u031c"+
		"\u0292\3\2\2\2\u031c\u029b\3\2\2\2\u031c\u02a0\3\2\2\2\u031c\u02a7\3\2"+
		"\2\2\u031c\u02ad\3\2\2\2\u031c\u02ae\3\2\2\2\u031c\u02b3\3\2\2\2\u031c"+
		"\u02b4\3\2\2\2\u031c\u02bb\3\2\2\2\u031c\u02bc\3\2\2\2\u031c\u02c3\3\2"+
		"\2\2\u031c\u02d1\3\2\2\2\u031c\u02d2\3\2\2\2\u031c\u02d3\3\2\2\2\u031c"+
		"\u02d4\3\2\2\2\u031c\u02d5\3\2\2\2\u031c\u02e3\3\2\2\2\u031c\u02e4\3\2"+
		"\2\2\u031c\u02e8\3\2\2\2\u031c\u02ed\3\2\2\2\u031c\u02ee\3\2\2\2\u031c"+
		"\u02f2\3\2\2\2\u031c\u02f6\3\2\2\2\u031c\u0301\3\2\2\2\u031c\u0305\3\2"+
		"\2\2\u031c\u030d\3\2\2\2\u031c\u0312\3\2\2\2\u031c\u0316\3\2\2\2\u031c"+
		"\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\13\3\2\2\2\u031e\u031f\tl\2\2"+
		"\u031f\u0320\7\u0093\2\2\u0320\u032a\5\16\b\2\u0321\u0323\7\u01c3\2\2"+
		"\u0322\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0328\7\u01b6\2\2\u0327\u0322\3\2\2"+
		"\2\u0327\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\5P)\2\u032a\u0327"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\7\u0160\2"+
		"\2\u032d\r\3\2\2\2\u032e\u032f\tm\2\2\u032f\17\3\2\2\2\u0330\u0331\tn"+
		"\2\2\u0331\21\3\2\2\2\u0332\u034c\7\u01a3\2\2\u0333\u0334\7\u01a3\2\2"+
		"\u0334\u0335\7\u0093\2\2\u0335\u033a\5\24\13\2\u0336\u0337\7\u01b6\2\2"+
		"\u0337\u0339\5\24\13\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033a\3\2\2\2\u033d"+
		"\u033e\7\u0160\2\2\u033e\u034c\3\2\2\2\u033f\u034c\7\u0132\2\2\u0340\u034c"+
		"\7\u014e\2\2\u0341\u034c\7\u0103\2\2\u0342\u0346\7\32\2\2\u0343\u0344"+
		"\7\u0093\2\2\u0344\u0345\to\2\2\u0345\u0347\7\u0160\2\2\u0346\u0343\3"+
		"\2\2\2\u0346\u0347\3\2\2\2\u0347\u034c\3\2\2\2\u0348\u034c\7\u00ab\2\2"+
		"\u0349\u034c\7\u009e\2\2\u034a\u034c\7\13\2\2\u034b\u0332\3\2\2\2\u034b"+
		"\u0333\3\2\2\2\u034b\u033f\3\2\2\2\u034b\u0340\3\2\2\2\u034b\u0341\3\2"+
		"\2\2\u034b\u0342\3\2\2\2\u034b\u0348\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034a\3\2\2\2\u034c\23\3\2\2\2\u034d\u034e\tp\2\2\u034e\25\3\2\2\2\u034f"+
		"\u0350\tq\2\2\u0350\27\3\2\2\2\u0351\u0352\tr\2\2\u0352\31\3\2\2\2\u0353"+
		"\u0366\7K\2\2\u0354\u0366\7\u00ca\2\2\u0355\u0366\7m\2\2\u0356\u0366\7"+
		"\u00e1\2\2\u0357\u035b\ts\2\2\u0358\u0359\7\u0093\2\2\u0359\u035a\tt\2"+
		"\2\u035a\u035c\7\u0160\2\2\u035b\u0358\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u0366\3\2\2\2\u035d\u0366\7\u010b\2\2\u035e\u0366\7\u010c\2\2\u035f\u0366"+
		"\7\u0177\2\2\u0360\u0366\7\u016c\2\2\u0361\u0366\7\u0112\2\2\u0362\u0366"+
		"\7\u0113\2\2\u0363\u0366\7P\2\2\u0364\u0366\7\u00ce\2\2\u0365\u0353\3"+
		"\2\2\2\u0365\u0354\3\2\2\2\u0365\u0355\3\2\2\2\u0365\u0356\3\2\2\2\u0365"+
		"\u0357\3\2\2\2\u0365\u035d\3\2\2\2\u0365\u035e\3\2\2\2\u0365\u035f\3\2"+
		"\2\2\u0365\u0360\3\2\2\2\u0365\u0361\3\2\2\2\u0365\u0362\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366\33\3\2\2\2\u0367\u0373\7{\2\2"+
		"\u0368\u0369\7\u0093\2\2\u0369\u036e\5\36\20\2\u036a\u036b\7\u01b6\2\2"+
		"\u036b\u036d\5\36\20\2\u036c\u036a\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u036e\3\2\2\2\u0371"+
		"\u0372\7\u0160\2\2\u0372\u0374\3\2\2\2\u0373\u0368\3\2\2\2\u0373\u0374"+
		"\3\2\2\2\u0374\35\3\2\2\2\u0375\u0376\7\u014d\2\2\u0376\u0377\7\u0093"+
		"\2\2\u0377\u0378\5P)\2\u0378\u0379\7\u0160\2\2\u0379\u0382\3\2\2\2\u037a"+
		"\u037b\7~\2\2\u037b\u037c\7\u0093\2\2\u037c\u037d\5P)\2\u037d\u037e\7"+
		"\u0160\2\2\u037e\u0382\3\2\2\2\u037f\u0382\7\u00ea\2\2\u0380\u0382\7|"+
		"\2\2\u0381\u0375\3\2\2\2\u0381\u037a\3\2\2\2\u0381\u037f\3\2\2\2\u0381"+
		"\u0380\3\2\2\2\u0382\37\3\2\2\2\u0383\u0387\7\3\2\2\u0384\u0386\7\u01c5"+
		"\2\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b\7\u01c0"+
		"\2\2\u038b!\3\2\2\2\u038c\u0393\7[\2\2\u038d\u038f\7\u0213\2\2\u038e\u038d"+
		"\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0394\3\2\2\2\u0392\u0394\5 \21\2\u0393\u038e\3\2\2\2\u0393\u0392\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0399\7U\2\2\u0398\u039a\7\u01b8\2\2\u0399\u0398"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a#\3\2\2\2\u039b\u03a2\7\\\2\2\u039c"+
		"\u039e\7\u0211\2\2\u039d\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u039d"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u03a3\5 \21\2\u03a2"+
		"\u039d\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8\7U\2\2\u03a7"+
		"\u03a9\7\u01b8\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9%\3\2"+
		"\2\2\u03aa\u03ab\7Z\2\2\u03ab\u03ae\7\u0173\2\2\u03ac\u03af\5H%\2\u03ad"+
		"\u03af\5 \21\2\u03ae\u03ac\3\2\2\2\u03ae\u03ad\3\2\2\2\u03af\u03b0\3\2"+
		"\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b4\7U\2\2\u03b3\u03b5\7\u01b8\2\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5"+
		"\3\2\2\2\u03b5\'\3\2\2\2\u03b6\u03b7\7)\2\2\u03b7\u03c4\5*\26\2\u03b8"+
		"\u03ba\7\u01c0\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03c0\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be"+
		"\u03c1\5.\30\2\u03bf\u03c1\7\u0182\2\2\u03c0\u03be\3\2\2\2\u03c0\u03bf"+
		"\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03bb\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4"+
		"\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03ca\3\2\2\2\u03c6\u03c4\3\2"+
		"\2\2\u03c7\u03c9\7\u01c0\2\2\u03c8\u03c7\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca"+
		"\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ca\3\2"+
		"\2\2\u03cd\u03ce\7\u01b8\2\2\u03ce)\3\2\2\2\u03cf\u03d3\5P)\2\u03d0\u03d3"+
		"\5N(\2\u03d1\u03d3\5R*\2\u03d2\u03cf\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2"+
		"\u03d1\3\2\2\2\u03d3\u03e2\3\2\2\2\u03d4\u03d6\7\u01c0\2\2\u03d5\u03d4"+
		"\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03de\tu\2\2\u03db\u03dd\7\u01c0"+
		"\2\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e3\5,"+
		"\27\2\u03e2\u03d7\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3+\3\2\2\2\u03e4\u03e7"+
		"\5P)\2\u03e5\u03e7\5N(\2\u03e6\u03e4\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7"+
		"-\3\2\2\2\u03e8\u03ec\7\u015e\2\2\u03e9\u03eb\7\u01c0\2\2\u03ea\u03e9"+
		"\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ef\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f8\5\66\34\2\u03f0\u03f2\7"+
		"\u01c0\2\2\u03f1\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f1\3\2\2\2"+
		"\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\5\66\34\2\u03f6\u03f1"+
		"\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"/\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u0400\5\62\32\2\u03fc\u03ff\5(\25"+
		"\2\u03fd\u03ff\5H%\2\u03fe\u03fc\3\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0402"+
		"\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0404\3\2\2\2\u0402"+
		"\u0400\3\2\2\2\u0403\u0405\5\64\33\2\u0404\u0403\3\2\2\2\u0404\u0405\3"+
		"\2\2\2\u0405\61\3\2\2\2\u0406\u040e\7\u015d\2\2\u0407\u0409\7\u01c0\2"+
		"\2\u0408\u0407\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b"+
		"\3\2\2\2\u040b\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u040f\5\66\34\2"+
		"\u040e\u040a\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411"+
		"\3\2\2\2\u0411\u0415\3\2\2\2\u0412\u0414\7\u01c0\2\2\u0413\u0412\3\2\2"+
		"\2\u0414\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418"+
		"\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u0419\7\u01b8\2\2\u0419\63\3\2\2\2"+
		"\u041a\u041b\7\u015d\2\2\u041b\u041f\7\u013f\2\2\u041c\u041e\7\u01c0\2"+
		"\2\u041d\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420"+
		"\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0423\7\u01b8\2"+
		"\2\u0423\65\3\2\2\2\u0424\u0426\tv\2\2\u0425\u0424\3\2\2\2\u0425\u0426"+
		"\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u042b\5<\37\2\u0428\u042a\7\u01c0\2"+
		"\2\u0429\u0428\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c"+
		"\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u0432\7\36\2\2"+
		"\u042f\u0431\7\u01c0\2\2\u0430\u042f\3\2\2\2\u0431\u0434\3\2\2\2\u0432"+
		"\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0435\3\2\2\2\u0434\u0432\3\2"+
		"\2\2\u0435\u043d\5> \2\u0436\u0438\7\u01c0\2\2\u0437\u0436\3\2\2\2\u0438"+
		"\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043c\3\2"+
		"\2\2\u043b\u0439\3\2\2\2\u043c\u043e\58\35\2\u043d\u0439\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e\u0446\3\2\2\2\u043f\u0441\7\u01c0\2\2\u0440\u043f"+
		"\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443"+
		"\u0445\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u0447\5:\36\2\u0446\u0442\3\2"+
		"\2\2\u0446\u0447\3\2\2\2\u0447\67\3\2\2\2\u0448\u044c\tu\2\2\u0449\u044b"+
		"\7\u01c0\2\2\u044a\u0449\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2"+
		"\2\u044c\u044d\3\2\2\2\u044d\u0451\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0452"+
		"\5P)\2\u0450\u0452\5N(\2\u0451\u044f\3\2\2\2\u0451\u0450\3\2\2\2\u0452"+
		"9\3\2\2\2\u0453\u0457\7\u0141\2\2\u0454\u0456\7\u01c0\2\2\u0455\u0454"+
		"\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u045c\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045d\5P)\2\u045b\u045d\5N(\2"+
		"\u045c\u045a\3\2\2\2\u045c\u045b\3\2\2\2\u045d;\3\2\2\2\u045e\u0463\5"+
		"P)\2\u045f\u0463\5N(\2\u0460\u0463\5F$\2\u0461\u0463\5L\'\2\u0462\u045e"+
		"\3\2\2\2\u0462\u045f\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0461\3\2\2\2\u0463"+
		"=\3\2\2\2\u0464\u0469\5P)\2\u0465\u0469\5N(\2\u0466\u0469\5F$\2\u0467"+
		"\u0469\5L\'\2\u0468\u0464\3\2\2\2\u0468\u0465\3\2\2\2\u0468\u0466\3\2"+
		"\2\2\u0468\u0467\3\2\2\2\u0469?\3\2\2\2\u046a\u046c\7O\2\2\u046b\u046d"+
		"\7\u01b8\2\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046dA\3\2\2\2\u046e"+
		"\u0470\tw\2\2\u046f\u0471\7\u01b8\2\2\u0470\u046f\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471C\3\2\2\2\u0472\u0473\7\u0189\2\2\u0473\u0475\5P)\2\u0474"+
		"\u0476\7\u01b8\2\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476E\3\2"+
		"\2\2\u0477\u0479\7\u01b9\2\2\u0478\u047a\5H%\2\u0479\u0478\3\2\2\2\u0479"+
		"\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\7\u01b9\2\2\u047cG\3\2"+
		"\2\2\u047d\u0480\5L\'\2\u047e\u0480\7\u01c0\2\2\u047f\u047d\3\2\2\2\u047f"+
		"\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2"+
		"\2\2\u0482I\3\2\2\2\u0483\u0488\5L\'\2\u0484\u0488\7)\2\2\u0485\u0488"+
		"\7\u015d\2\2\u0486\u0488\7\u01c0\2\2\u0487\u0483\3\2\2\2\u0487\u0484\3"+
		"\2\2\2\u0487\u0485\3\2\2\2\u0487\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048aK\3\2\2\2\u048b\u0495\5N(\2\u048c"+
		"\u0495\5P)\2\u048d\u0495\5R*\2\u048e\u0495\7\u01bf\2\2\u048f\u0495\7\u01c3"+
		"\2\2\u0490\u0495\7\u01b8\2\2\u0491\u0495\7\u0093\2\2\u0492\u0495\7\u0160"+
		"\2\2\u0493\u0495\5T+\2\u0494\u048b\3\2\2\2\u0494\u048c\3\2\2\2\u0494\u048d"+
		"\3\2\2\2\u0494\u048e\3\2\2\2\u0494\u048f\3\2\2\2\u0494\u0490\3\2\2\2\u0494"+
		"\u0491\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0493\3\2\2\2\u0495\u0496\3\2"+
		"\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u04a8\3\2\2\2\u0498"+
		"\u0499\7\u01c0\2\2\u0499\u04a2\7\4\2\2\u049a\u04a3\5N(\2\u049b\u04a3\5"+
		"P)\2\u049c\u04a3\5R*\2\u049d\u04a3\7\u01bf\2\2\u049e\u04a3\7\u01c3\2\2"+
		"\u049f\u04a3\7\u01b8\2\2\u04a0\u04a3\7\u0093\2\2\u04a1\u04a3\7\u0160\2"+
		"\2\u04a2\u049a\3\2\2\2\u04a2\u049b\3\2\2\2\u04a2\u049c\3\2\2\2\u04a2\u049d"+
		"\3\2\2\2\u04a2\u049e\3\2\2\2\u04a2\u049f\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2"+
		"\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2"+
		"\2\2\u04a5\u04a7\3\2\2\2\u04a6\u0498\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8"+
		"\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9M\3\2\2\2\u04aa\u04a8\3\2\2\2"+
		"\u04ab\u04ae\7\u01bd\2\2\u04ac\u04ae\5\u00be`\2\u04ad\u04ab\3\2\2\2\u04ad"+
		"\u04ac\3\2\2\2\u04aeO\3\2\2\2\u04af\u04b0\tx\2\2\u04b0Q\3\2\2\2\u04b1"+
		"\u04b2\7\u01be\2\2\u04b2S\3\2\2\2\u04b3\u04b4\7>\2\2\u04b4\u04b8\7\u0093"+
		"\2\2\u04b5\u04b9\5N(\2\u04b6\u04b9\7)\2\2\u04b7\u04b9\7\u0157\2\2\u04b8"+
		"\u04b5\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u04ba\3\2"+
		"\2\2\u04ba\u04bb\7\u0160\2\2\u04bbU\3\2\2\2\u04bc\u04bf\5X-\2\u04bd\u04bf"+
		"\5Z.\2\u04be\u04bc\3\2\2\2\u04be\u04bd\3\2\2\2\u04bfW\3\2\2\2\u04c0\u04d7"+
		"\5\\/\2\u04c1\u04d7\5^\60\2\u04c2\u04d7\5`\61\2\u04c3\u04d7\5d\63\2\u04c4"+
		"\u04d7\5f\64\2\u04c5\u04d7\5h\65\2\u04c6\u04d7\5j\66\2\u04c7\u04d7\5l"+
		"\67\2\u04c8\u04d7\5n8\2\u04c9\u04d7\5p9\2\u04ca\u04d7\5r:\2\u04cb\u04d7"+
		"\5t;\2\u04cc\u04d7\5v<\2\u04cd\u04d7\5x=\2\u04ce\u04d7\5z>\2\u04cf\u04d7"+
		"\5|?\2\u04d0\u04d7\5~@\2\u04d1\u04d7\5\u0080A\2\u04d2\u04d7\5\u0082B\2"+
		"\u04d3\u04d7\5\u0084C\2\u04d4\u04d7\5\u0086D\2\u04d5\u04d7\5\u0088E\2"+
		"\u04d6\u04c0\3\2\2\2\u04d6\u04c1\3\2\2\2\u04d6\u04c2\3\2\2\2\u04d6\u04c3"+
		"\3\2\2\2\u04d6\u04c4\3\2\2\2\u04d6\u04c5\3\2\2\2\u04d6\u04c6\3\2\2\2\u04d6"+
		"\u04c7\3\2\2\2\u04d6\u04c8\3\2\2\2\u04d6\u04c9\3\2\2\2\u04d6\u04ca\3\2"+
		"\2\2\u04d6\u04cb\3\2\2\2\u04d6\u04cc\3\2\2\2\u04d6\u04cd\3\2\2\2\u04d6"+
		"\u04ce\3\2\2\2\u04d6\u04cf\3\2\2\2\u04d6\u04d0\3\2\2\2\u04d6\u04d1\3\2"+
		"\2\2\u04d6\u04d2\3\2\2\2\u04d6\u04d3\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6"+
		"\u04d5\3\2\2\2\u04d7Y\3\2\2\2\u04d8\u04e0\5\u009aN\2\u04d9\u04e0\5\u00a4"+
		"S\2\u04da\u04e0\5\u00a6T\2\u04db\u04e0\5\u00a8U\2\u04dc\u04e0\5\u00ac"+
		"W\2\u04dd\u04e0\5\u00aeX\2\u04de\u04e0\5\u00b0Y\2\u04df\u04d8\3\2\2\2"+
		"\u04df\u04d9\3\2\2\2\u04df\u04da\3\2\2\2\u04df\u04db\3\2\2\2\u04df\u04dc"+
		"\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04de\3\2\2\2\u04e0[\3\2\2\2\u04e1"+
		"\u04e2\7\u01b7\2\2\u04e2\u04e4\ty\2\2\u04e3\u04e5\tz\2\2\u04e4\u04e3\3"+
		"\2\2\2\u04e4\u04e5\3\2\2\2\u04e5]\3\2\2\2\u04e6\u04e7\7\u01b7\2\2\u04e7"+
		"\u04e8\7v\2\2\u04e8\u04e9\t{\2\2\u04e9_\3\2\2\2\u04ea\u04eb\7\31\2\2\u04eb"+
		"\u04ec\5b\62\2\u04eca\3\2\2\2\u04ed\u04f1\5P)\2\u04ee\u04f1\5N(\2\u04ef"+
		"\u04f1\5R*\2\u04f0\u04ed\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04ef\3\2\2"+
		"\2\u04f1c\3\2\2\2\u04f2\u04f3\7w\2\2\u04f3\u04f4\7\u01bc\2\2\u04f4e\3"+
		"\2\2\2\u04f5\u04f6\7=\2\2\u04f6\u04f7\5\u0098M\2\u04f7g\3\2\2\2\u04f8"+
		"\u04f9\7\u01b7\2\2\u04f9\u04fa\7\u01dd\2\2\u04fa\u04fb\7\u01bc\2\2\u04fb"+
		"i\3\2\2\2\u04fc\u04fd\7\u01b7\2\2\u04fd\u04fe\7\u01d7\2\2\u04fe\u04ff"+
		"\t|\2\2\u04ffk\3\2\2\2\u0500\u0501\7\u01b7\2\2\u0501\u0506\7\u01dc\2\2"+
		"\u0502\u0507\5\u008cG\2\u0503\u0507\5\u008eH\2\u0504\u0507\5\u0090I\2"+
		"\u0505\u0507\5\u0092J\2\u0506\u0502\3\2\2\2\u0506\u0503\3\2\2\2\u0506"+
		"\u0504\3\2\2\2\u0506\u0505\3\2\2\2\u0507m\3\2\2\2\u0508\u0509\7\u01b7"+
		"\2\2\u0509\u050f\7\u01de\2\2\u050a\u0510\5\u009eP\2\u050b\u0510\5\u00b4"+
		"[\2\u050c\u0510\5P)\2\u050d\u050e\7\u01fd\2\2\u050e\u0510\7\u01bd\2\2"+
		"\u050f\u050a\3\2\2\2\u050f\u050b\3\2\2\2\u050f\u050c\3\2\2\2\u050f\u050d"+
		"\3\2\2\2\u0510o\3\2\2\2\u0511\u0512\7\u01b7\2\2\u0512\u0513\7\u01e9\2"+
		"\2\u0513\u0514\t}\2\2\u0514\u0515\t{\2\2\u0515q\3\2\2\2\u0516\u0517\7"+
		"\u01b7\2\2\u0517\u0518\7\u01ea\2\2\u0518\u0519\t~\2\2\u0519\u051a\t{\2"+
		"\2\u051as\3\2\2\2\u051b\u051c\7\u01b7\2\2\u051c\u051d\7\u01f0\2\2\u051d"+
		"u\3\2\2\2\u051e\u051f\7\u01b7\2\2\u051f\u0520\7\u01f1\2\2\u0520\u0521"+
		"\t{\2\2\u0521w\3\2\2\2\u0522\u0523\7\u01b7\2\2\u0523\u0524\7\u01f2\2\2"+
		"\u0524\u0525\t{\2\2\u0525y\3\2\2\2\u0526\u0527\7\u01b7\2\2\u0527\u0528"+
		"\7\u01f4\2\2\u0528\u0529\t{\2\2\u0529{\3\2\2\2\u052a\u052b\7\u01b7\2\2"+
		"\u052b\u052f\7\u01fc\2\2\u052c\u052e\7\u01c6\2\2\u052d\u052c\3\2\2\2\u052e"+
		"\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\3\2"+
		"\2\2\u0531\u052f\3\2\2\2\u0532\u0533\7\u01c0\2\2\u0533}\3\2\2\2\u0534"+
		"\u0535\7\u01b7\2\2\u0535\u0538\7\u01fe\2\2\u0536\u0539\7\u01d4\2\2\u0537"+
		"\u0539\5\u008aF\2\u0538\u0536\3\2\2\2\u0538\u0537\3\2\2\2\u0539\177\3"+
		"\2\2\2\u053a\u053b\7\u01b7\2\2\u053b\u053c\7\u01ff\2\2\u053c\u053d\t{"+
		"\2\2\u053d\u0081\3\2\2\2\u053e\u053f\7\u01b7\2\2\u053f\u0542\7\u0200\2"+
		"\2\u0540\u0543\7\u01d4\2\2\u0541\u0543\5\u008aF\2\u0542\u0540\3\2\2\2"+
		"\u0542\u0541\3\2\2\2\u0543\u0083\3\2\2\2\u0544\u0545\7\u01b7\2\2\u0545"+
		"\u0546\7\u0201\2\2\u0546\u0547\t{\2\2\u0547\u0085\3\2\2\2\u0548\u0549"+
		"\7\u01b7\2\2\u0549\u054c\7\u016c\2\2\u054a\u054b\7\u01eb\2\2\u054b\u054d"+
		"\7\u01ef\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\3\2\2"+
		"\2\u054e\u054f\t\177\2\2\u054f\u0087\3\2\2\2\u0550\u0551\7\u01b7\2\2\u0551"+
		"\u0555\7\u020a\2\2\u0552\u0554\7\u01bd\2\2\u0553\u0552\3\2\2\2\u0554\u0557"+
		"\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0558\3\2\2\2\u0557"+
		"\u0555\3\2\2\2\u0558\u0561\7\u01da\2\2\u0559\u0562\7\u01f7\2\2\u055a\u055c"+
		"\7\u01f8\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055e\3\2\2"+
		"\2\u055d\u055f\7\u020e\2\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0560\3\2\2\2\u0560\u0562\7\u01f5\2\2\u0561\u0559\3\2\2\2\u0561\u055b"+
		"\3\2\2\2\u0562\u0089\3\2\2\2\u0563\u0564\t\u0080\2\2\u0564\u008b\3\2\2"+
		"\2\u0565\u0566\7\u01e6\2\2\u0566\u0567\5P)\2\u0567\u0568\7\u020e\2\2\u0568"+
		"\u0569\5P)\2\u0569\u008d\3\2\2\2\u056a\u056b\7\u020b\2\2\u056b\u056c\5"+
		"P)\2\u056c\u008f\3\2\2\2\u056d\u056e\7\u0204\2\2\u056e\u056f\5P)\2\u056f"+
		"\u0570\7\36\2\2\u0570\u0571\5P)\2\u0571\u0091\3\2\2\2\u0572\u0573\7\u0202"+
		"\2\2\u0573\u0574\5P)\2\u0574\u0093\3\2\2\2\u0575\u0576\5\u0096L\2\u0576"+
		"\u0577\7\u01ce\2\2\u0577\u0578\5\u0096L\2\u0578\u0095\3\2\2\2\u0579\u057a"+
		"\7\u01bc\2\2\u057a\u0097\3\2\2\2\u057b\u057e\5\u0096L\2\u057c\u057e\5"+
		"\u0094K\2\u057d\u057b\3\2\2\2\u057d\u057c\3\2\2\2\u057e\u0586\3\2\2\2"+
		"\u057f\u0582\7\u01b6\2\2\u0580\u0583\5\u0096L\2\u0581\u0583\5\u0094K\2"+
		"\u0582\u0580\3\2\2\2\u0582\u0581\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u057f"+
		"\3\2\2\2\u0585\u0588\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587"+
		"\u0099\3\2\2\2\u0588\u0586\3\2\2\2\u0589\u058a\7\u01b7\2\2\u058a\u058b"+
		"\7<\2\2\u058b\u058d\7\u01bd\2\2\u058c\u058e\7\u01d5\2\2\u058d\u058c\3"+
		"\2\2\2\u058d\u058e\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u0592\5\u009cO\2"+
		"\u0590\u0592\7\u01f7\2\2\u0591\u058f\3\2\2\2\u0591\u0590\3\2\2\2\u0591"+
		"\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0595\7\u01fb\2\2\u0594\u0593"+
		"\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u009b\3\2\2\2\u0596\u059b\5P)\2\u0597"+
		"\u059b\5\u009eP\2\u0598\u059b\7\u01bd\2\2\u0599\u059b\7\u01fd\2\2\u059a"+
		"\u0596\3\2\2\2\u059a\u0597\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u0599\3\2"+
		"\2\2\u059b\u009d\3\2\2\2\u059c\u059e\7\u0093\2\2\u059d\u059c\3\2\2\2\u059e"+
		"\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2"+
		"\2\2\u05a1\u059f\3\2\2\2\u05a2\u05a3\5\u00a0Q\2\u05a3\u05a4\5\u00a2R\2"+
		"\u05a4\u05a6\3\2\2\2\u05a5\u059f\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a5"+
		"\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05ba\3\2\2\2\u05a9\u05ab\7\u0093\2"+
		"\2\u05aa\u05a9\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad"+
		"\3\2\2\2\u05ad\u05af\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b3\5\u00a0Q"+
		"\2\u05b0\u05b2\7\u0160\2\2\u05b1\u05b0\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3"+
		"\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b3\3\2"+
		"\2\2\u05b6\u05b7\5\u00a2R\2\u05b7\u05b9\3\2\2\2\u05b8\u05ac\3\2\2\2\u05b9"+
		"\u05bc\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bd\3\2"+
		"\2\2\u05bc\u05ba\3\2\2\2\u05bd\u05c1\5\u00a0Q\2\u05be\u05c0\7\u0160\2"+
		"\2\u05bf\u05be\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2"+
		"\3\2\2\2\u05c2\u009f\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c5\t\u0081\2"+
		"\2\u05c5\u00a1\3\2\2\2\u05c6\u05c7\t\u0082\2\2\u05c7\u00a3\3\2\2\2\u05c8"+
		"\u05c9\7\u01b7\2\2\u05c9\u05ca\7\u01ee\2\2\u05ca\u05cb\5\u00b4[\2\u05cb"+
		"\u00a5\3\2\2\2\u05cc\u05cd\7\u01b7\2\2\u05cd\u05ce\7\u01e2\2\2\u05ce\u00a7"+
		"\3\2\2\2\u05cf\u05d0\7\u01b7\2\2\u05d0\u05d1\7\u01e4\2\2\u05d1\u00a9\3"+
		"\2\2\2\u05d2\u05d6\5\u009eP\2\u05d3\u05d6\7\u01bd\2\2\u05d4\u05d6\5P)"+
		"\2\u05d5\u05d2\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d4\3\2\2\2\u05d6\u00ab"+
		"\3\2\2\2\u05d7\u05d8\7\u01b7\2\2\u05d8\u05db\7\u01e7\2\2\u05d9\u05dc\7"+
		"\u0209\2\2\u05da\u05dc\5\u00aaV\2\u05db\u05d9\3\2\2\2\u05db\u05da\3\2"+
		"\2\2\u05dc\u00ad\3\2\2\2\u05dd\u05de\7\u01b7\2\2\u05de\u05e6\7\u020d\2"+
		"\2\u05df\u05e2\5\u00aaV\2\u05e0\u05e1\t\u0083\2\2\u05e1\u05e3\5\u00aa"+
		"V\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e7\3\2\2\2\u05e4"+
		"\u05e7\5\u00b4[\2\u05e5\u05e7\7\u01fa\2\2\u05e6\u05df\3\2\2\2\u05e6\u05e4"+
		"\3\2\2\2\u05e6\u05e5\3\2\2\2\u05e7\u00af\3\2\2\2\u05e8\u05e9\7\u01b7\2"+
		"\2\u05e9\u05ea\7\u01e3\2\2\u05ea\u00b1\3\2\2\2\u05eb\u05ed\7\u01ef\2\2"+
		"\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef\3\2\2\2\u05ee\u05f0"+
		"\7\u01f6\2\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u060c\3\2\2"+
		"\2\u05f1\u060d\7\u01e5\2\2\u05f2\u060d\7\u01ca\2\2\u05f3\u060d\7\u01d0"+
		"\2\2\u05f4\u060d\7\u01cc\2\2\u05f5\u05f7\7\u01ed\2\2\u05f6\u05f8\7\u0205"+
		"\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u060d\3\2\2\2\u05f9"+
		"\u060d\7\u01cb\2\2\u05fa\u05fc\7\u01f3\2\2\u05fb\u05fd\7\u0205\2\2\u05fc"+
		"\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u060d\3\2\2\2\u05fe\u060d\7\u01d2"+
		"\2\2\u05ff\u0601\7\u01f3\2\2\u0600\u0602\7\u0205\2\2\u0601\u0600\3\2\2"+
		"\2\u0601\u0602\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0604\7\u01f9\2\2\u0604"+
		"\u060d\7\u01e5\2\2\u0605\u060d\7\u01d1\2\2\u0606\u0608\7\u01ed\2\2\u0607"+
		"\u0609\7\u0205\2\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a"+
		"\3\2\2\2\u060a\u060b\7\u01f9\2\2\u060b\u060d\7\u01e5\2\2\u060c\u05f1\3"+
		"\2\2\2\u060c\u05f2\3\2\2\2\u060c\u05f3\3\2\2\2\u060c\u05f4\3\2\2\2\u060c"+
		"\u05f5\3\2\2\2\u060c\u05f9\3\2\2\2\u060c\u05fa\3\2\2\2\u060c\u05fe\3\2"+
		"\2\2\u060c\u05ff\3\2\2\2\u060c\u0605\3\2\2\2\u060c\u0606\3\2\2\2\u060d"+
		"\u060f\3\2\2\2\u060e\u0610\7\u0208\2\2\u060f\u060e\3\2\2\2\u060f\u0610"+
		"\3\2\2\2\u0610\u00b3\3\2\2\2\u0611\u0613\7\u0093\2\2\u0612\u0611\3\2\2"+
		"\2\u0613\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617"+
		"\3\2\2\2\u0616\u0614\3\2\2\2\u0617\u0628\5\u00b6\\\2\u0618\u061c\t\u0084"+
		"\2\2\u0619\u061b\7\u0093\2\2\u061a\u0619\3\2\2\2\u061b\u061e\3\2\2\2\u061c"+
		"\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061f\3\2\2\2\u061e\u061c\3\2"+
		"\2\2\u061f\u0623\5\u00b6\\\2\u0620\u0622\7\u0160\2\2\u0621\u0620\3\2\2"+
		"\2\u0622\u0625\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0627"+
		"\3\2\2\2\u0625\u0623\3\2\2\2\u0626\u0618\3\2\2\2\u0627\u062a\3\2\2\2\u0628"+
		"\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062e\3\2\2\2\u062a\u0628\3\2"+
		"\2\2\u062b\u062d\7\u0160\2\2\u062c\u062b\3\2\2\2\u062d\u0630\3\2\2\2\u062e"+
		"\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0632\3\2\2\2\u0630\u062e\3\2"+
		"\2\2\u0631\u0614\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0631\3\2\2\2\u0633"+
		"\u0634\3\2\2\2\u0634\u00b5\3\2\2\2\u0635\u0639\5\u00b8]\2\u0636\u0639"+
		"\5\u00bc_\2\u0637\u0639\5\u00ba^\2\u0638\u0635\3\2\2\2\u0638\u0636\3\2"+
		"\2\2\u0638\u0637\3\2\2\2\u0639\u00b7\3\2\2\2\u063a\u063e\5\u009eP\2\u063b"+
		"\u063e\7\u01bd\2\2\u063c\u063e\5P)\2\u063d\u063a\3\2\2\2\u063d\u063b\3"+
		"\2\2\2\u063d\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0643\5\u00b2Z\2"+
		"\u0640\u0644\5\u009eP\2\u0641\u0644\7\u01bd\2\2\u0642\u0644\5P)\2\u0643"+
		"\u0640\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0642\3\2\2\2\u0644\u00b9\3\2"+
		"\2\2\u0645\u0646\7\u01bd\2\2\u0646\u00bb\3\2\2\2\u0647\u0649\7\u01bd\2"+
		"\2\u0648\u064a\7\u01ef\2\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a"+
		"\u064c\3\2\2\2\u064b\u064d\7\u01f6\2\2\u064c\u064b\3\2\2\2\u064c\u064d"+
		"\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\7\u01df\2\2\u064f\u00bd\3\2\2"+
		"\2\u0650\u0651\t\u0085\2\2\u0651\u00bf\3\2\2\2\u00b1\u00cf\u00d1\u00db"+
		"\u00df\u00e1\u00e7\u00ec\u010e\u011c\u011f\u0125\u0128\u012f\u013e\u0149"+
		"\u014c\u014f\u0152\u016b\u0173\u0177\u0188\u0194\u0199\u01b4\u01bd\u01ca"+
		"\u01d0\u01e1\u0236\u023b\u024a\u0259\u0266\u0269\u026c\u026f\u0281\u028b"+
		"\u0290\u0299\u02a4\u02ab\u02b9\u02c1\u02ca\u02cf\u02dc\u02e1\u02fc\u02fe"+
		"\u0308\u030b\u031c\u0324\u0327\u032a\u033a\u0346\u034b\u035b\u0365\u036e"+
		"\u0373\u0381\u0387\u0390\u0393\u0395\u0399\u039f\u03a2\u03a4\u03a8\u03ae"+
		"\u03b0\u03b4\u03bb\u03c0\u03c4\u03ca\u03d2\u03d7\u03de\u03e2\u03e6\u03ec"+
		"\u03f3\u03f8\u03fe\u0400\u0404\u040a\u0410\u0415\u041f\u0425\u042b\u0432"+
		"\u0439\u043d\u0442\u0446\u044c\u0451\u0457\u045c\u0462\u0468\u046c\u0470"+
		"\u0475\u0479\u047f\u0481\u0487\u0489\u0494\u0496\u04a2\u04a4\u04a8\u04ad"+
		"\u04b8\u04be\u04d6\u04df\u04e4\u04f0\u0506\u050f\u052f\u0538\u0542\u054c"+
		"\u0555\u055b\u055e\u0561\u057d\u0582\u0586\u058d\u0591\u0594\u059a\u059f"+
		"\u05a7\u05ac\u05b3\u05ba\u05c1\u05d5\u05db\u05e2\u05e6\u05ec\u05ef\u05f7"+
		"\u05fc\u0601\u0608\u060c\u060f\u0614\u061c\u0623\u0628\u062e\u0633\u0638"+
		"\u063d\u0643\u0649\u064c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}