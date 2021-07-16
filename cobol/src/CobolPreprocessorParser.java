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
		CICS=31, CO=32, COBOL2=33, COBOL3=34, CODEPAGE=35, COMPAT=36, COMPILE=37, 
		COPY=38, COPYLOC=39, COPYRIGHT=40, CP=41, CPLC=42, CPP=43, CPSM=44, CPYR=45, 
		CS=46, CURR=47, CURRENCY=48, DATA=49, DATEPROC=50, DBCS=51, DD=52, DEBUG=53, 
		DEC=54, DECK=55, DEF=56, DEFINE=57, DELETE=58, DFHVALUE=59, DIAGTRUNC=60, 
		DISPSIGN=61, DIVISION=62, DLI=63, DLL=64, DP=65, DS=66, DSN=67, DSNAME=68, 
		DTR=69, DU=70, DUMP=71, DWARF=72, DYN=73, DYNAM=74, EDF=75, EJECT=76, 
		EJPD=77, EN=78, ENDP=79, ENDPERIOD=80, ENGLISH=81, END_EXEC=82, EPILOG=83, 
		EVENP=84, EVENPACK=85, EXCI=86, EXEC=87, EXEC_SQL=88, EXIT=89, EXP=90, 
		EXPORTALL=91, EXTEND=92, FASTSRT=93, FEPI=94, FLAG=95, FLAGSTD=96, FSRT=97, 
		FULL=98, GDS=99, GRAPHIC=100, HEX=101, HGPR=102, HOOK=103, IC=104, ID=105, 
		IDENTIFICATION=106, IN=107, INITCHECK=108, INTDATE=109, INITIAL=110, INL=111, 
		INLINE=112, INSERT=113, JA=114, JP=115, KA=116, LANG=117, LANGUAGE=118, 
		LAX=119, LAXPERF=120, LC=121, LEADING=122, LEASM=123, LENGTH=124, LIB=125, 
		LILIAN=126, LIN=127, LINECOUNT=128, LINKAGE=129, LIST=130, LM=131, LONGMIXED=132, 
		LONGUPPER=133, LP=134, LPARENCHAR=135, LU=136, LXPRF=137, MAP=138, MARGINS=139, 
		MAX=140, MD=141, MDECK=142, MIG=143, MIXED=144, MAXPCF=145, MSG=146, NAME=147, 
		NAT=148, NATIONAL=149, NATLANG=150, NC=151, NN=152, NO=153, NOADATA=154, 
		NOADV=155, NOALIAS=156, NOALPHNUM=157, NOAWO=158, NOBIN=159, NOBLOCK0=160, 
		NOC=161, NOCBLCARD=162, NOCICS=163, NOCMPR2=164, NOCOMPILE=165, NOCOPYLOC=166, 
		NOCOPYRIGHT=167, NOCPLC=168, NOCPSM=169, NOCPYR=170, NOCURR=171, NOCURRENCY=172, 
		NOD=173, NODATEPROC=174, NODBCS=175, NODE=176, NODEBUG=177, NODECK=178, 
		NODEFINE=179, NODEF=180, NODIAGTRUNC=181, NODLL=182, NODSNAME=183, NODU=184, 
		NODUMP=185, NODP=186, NODTR=187, NODWARF=188, NODYN=189, NODYNAM=190, 
		NOEDF=191, NOEJPD=192, NOENDP=193, NOENDPERIOD=194, NOEPILOG=195, NOEVENP=196, 
		NOEVENPACK=197, NOEXIT=198, NOEXP=199, NOEXPORTALL=200, NOF=201, NOFASTSRT=202, 
		NOFEPI=203, NOFLAG=204, NOFLAGMIG=205, NOFLAGSTD=206, NOFSRT=207, NOGRAPHIC=208, 
		NOHOOK=209, NOINITCHECK=210, NOIC=211, NOINITIAL=212, NOINLINE=213, NOINL=214, 
		NOLAXPERF=215, NOLENGTH=216, NOLIB=217, NOLINKAGE=218, NOLIST=219, NOLXPRF=220, 
		NOMAP=221, NOMD=222, NOMDECK=223, NONAME=224, NONUM=225, NONUMBER=226, 
		NOOBJ=227, NOOBJECT=228, NOOMITODOMIN=229, NOOFF=230, NOOFFSET=231, NOOOM=232, 
		NOOPSEQUENCE=233, NOOPT=234, NOOPTIMIZE=235, NOOPTIONS=236, NOP=237, NOPAC=238, 
		NOPARMCHECK=239, NOPFD=240, NOPRESERVE=241, NOPROLOG=242, NORENT=243, 
		NORULES=244, NOS=245, NOSEP=246, NOSEPARATE=247, NOSEQ=248, NOSERV=249, 
		NOSERVICE=250, NOSLACKBYTES=251, NOSLCKB=252, NOSO=253, NOSOURCE=254, 
		NOSPIE=255, NOSQL=256, NOSQLC=257, NOSQLCCSID=258, NOSQLIMS=259, NOSSR=260, 
		NOSSRANGE=261, NOSTDTRUNC=262, NOSEQUENCE=263, NOSTGOPT=264, NOSUPP=265, 
		NOSUPPRESS=266, NOTERM=267, NOTERMINAL=268, NOTEST=269, NOTHREAD=270, 
		NOTRIG=271, NOUNRA=272, NOUNREFALL=273, NOUNREFSOURCE=274, NOUNRS=275, 
		NOVBREF=276, NOVOLATILE=277, NOWD=278, NOWORD=279, NOX=280, NOXREF=281, 
		NOZC=282, NOZLEN=283, NOZON=284, NOZONECHECK=285, NOZWB=286, NS=287, NSEQ=288, 
		NSYMBOL=289, NUM=290, NUMBER=291, NUMCHECK=292, NUMPROC=293, OBJ=294, 
		OBJECT=295, OF=296, OFF=297, OFFSET=298, ON=299, OMITODOMIN=300, OOM=301, 
		OP=302, OPMARGINS=303, OPSEQUENCE=304, OPT=305, OPTFILE=306, OPTIMIZE=307, 
		OPTIONS=308, OUT=309, OUTDD=310, PAC=311, PARMCHECK=312, PATH=313, PC=314, 
		PFD=315, PPTDBG=316, PGMN=317, PGMNAME=318, PRESERVE=319, PROCESS=320, 
		PROLOG=321, QUALIFY=322, QUA=323, QUOTE=324, RENT=325, REPLACE=326, REPLACING=327, 
		RMODE=328, RPARENCHAR=329, RULES=330, SEP=331, SEPARATE=332, SEQ=333, 
		SEQUENCE=334, SERV=335, SERVICE=336, SHORT=337, SIZE=338, SLACKBYTES=339, 
		SLCKB=340, SOURCE=341, SP=342, SPACE=343, SPIE=344, SQL=345, SQLC=346, 
		SQLCCSID=347, SQLIMS=348, SKIP1=349, SKIP2=350, SKIP3=351, SO=352, SS=353, 
		SSR=354, SSRANGE=355, STANDARD=356, STD=357, STGOPT=358, STRICT=359, SUCC=360, 
		SUPP=361, SUPPRESS=362, SYSEIB=363, SZ=364, TERM=365, TERMINAL=366, TEST=367, 
		THREAD=368, TITLE=369, TRAILING=370, TRIG=371, TRUNC=372, UE=373, UNREF=374, 
		UPPER=375, VBREF=376, VLR=377, VOLATILE=378, VS=379, VSAMOPENFS=380, WD=381, 
		WORD=382, XMLPARSE=383, XMLSS=384, XOPTS=385, XP=386, XREF=387, YEARWINDOW=388, 
		YW=389, ZC=390, ZD=391, ZLEN=392, ZON=393, ZONECHECK=394, ZONEDATA=395, 
		ZWB=396, C_CHAR=397, D_CHAR=398, E_CHAR=399, F_CHAR=400, H_CHAR=401, I_CHAR=402, 
		M_CHAR=403, N_CHAR=404, O_CHAR=405, Q_CHAR=406, S_CHAR=407, U_CHAR=408, 
		W_CHAR=409, X_CHAR=410, COMMENTTAG=411, COMMACHAR=412, COMPILER_DIRECTIVE_TAG=413, 
		DOT=414, DOUBLEEQUALCHAR=415, NONNUMERICLITERAL=416, NUMERICLITERAL=417, 
		IDENTIFIER=418, FILENAME=419, PSEUDOTEXTIDENTIFIER=420, NEWLINE=421, COMMENTLINE=422, 
		WS=423, TEXT=424, BOL=425, CLASSIC_COMMENT_TEXT=426, CD_WS=427, CD_CLASSIC_EOL_COMMENT=428, 
		ASTERISKCHAR=429, EQUALCHAR=430, GREATERTHANCHAR=431, LESSTHANCHAR=432, 
		PLUSCHAR=433, MINUSCHAR=434, SLASHCHAR=435, NOTEQUALCHAR=436, GREATEROREQUALCHAR=437, 
		LESSOREQUALCHAR=438, ZERO=439, AS=440, AND=441, CALLINT=442, CALLINTERFACE=443, 
		DEFINED=444, DLL_INTERFACE=445, DYNAMIC=446, ELSE=447, END_EVALUATE=448, 
		END_IF=449, EQUAL=450, EVALUATE=451, GREATER=452, IF=453, INLINE_OFF=454, 
		INLINE_ON=455, IS=456, LESS=457, NOT=458, OR=459, OTHER=460, OVERRIDE=461, 
		PARAMETER=462, STATIC=463, THAN=464, THROUGH=465, THRU=466, TO=467, TRUE=468, 
		WHEN=469, BD_WS=470, BD_CLASSIC_EOL_COMMENT=471, SQL_TEXT=472;
	public static final int
		RULE_startRule = 0, RULE_identificationDivisionTag = 1, RULE_compilerOptions = 2, 
		RULE_compilerXOpts = 3, RULE_compilerOption = 4, RULE_define_opt = 5, 
		RULE_identifier_et_al = 6, RULE_numcheck_opts = 7, RULE_rules_opts = 8, 
		RULE_ssrange_opts = 9, RULE_test_opts = 10, RULE_classicCommentEntry = 11, 
		RULE_execCicsStatement = 12, RULE_execSqlStatement = 13, RULE_execSqlImsStatement = 14, 
		RULE_copyStatement = 15, RULE_copySource = 16, RULE_copyLibrary = 17, 
		RULE_replacingPhrase = 18, RULE_replaceArea = 19, RULE_replaceByStatement = 20, 
		RULE_replaceOffStatement = 21, RULE_replaceClause = 22, RULE_directoryPhrase = 23, 
		RULE_familyPhrase = 24, RULE_replaceable = 25, RULE_replacement = 26, 
		RULE_ejectStatement = 27, RULE_skipStatement = 28, RULE_titleStatement = 29, 
		RULE_pseudoText = 30, RULE_charData = 31, RULE_charDataSql = 32, RULE_charDataLine = 33, 
		RULE_cobolWord = 34, RULE_literal = 35, RULE_filename = 36, RULE_compilerDirectiveStatement = 37, 
		RULE_compilerDirective = 38, RULE_conditionalCompilationStatement = 39, 
		RULE_compilerDirectiveCallInterface = 40, RULE_compilerDirectiveInline = 41, 
		RULE_compilerDirectiveBasis = 42, RULE_basisName = 43, RULE_compilerDirectiveInsert = 44, 
		RULE_compilerDirectiveDelete = 45, RULE_compilerDirectiveNumericRange = 46, 
		RULE_compilerDirectiveNumericAtom = 47, RULE_compilerDirectiveDeleteSequenceNumber = 48, 
		RULE_conditionalCompilationDefine = 49, RULE_conditionalCompilationDefinePredicate = 50, 
		RULE_conditionalCompilationArithmeticExpression = 51, RULE_conditionalCompilationArithmeticAtom = 52, 
		RULE_conditionalCompilationArithmeticOp = 53, RULE_conditionalCompilationIf = 54, 
		RULE_conditionalCompilationElse = 55, RULE_conditionalCompilationEndIf = 56, 
		RULE_conditionalCompilationEvaluateSelection = 57, RULE_conditionalCompilationEvaluate = 58, 
		RULE_conditionalCompilationWhen = 59, RULE_conditionalCompilationEndEvaluate = 60, 
		RULE_conditionalCompilationComparisonOp = 61, RULE_conditionalCompilationRelationalCondition = 62, 
		RULE_conditionalCompilationCondition = 63, RULE_conditionalCompilationSimpleRelationalCondition = 64, 
		RULE_conditionalCompilationBinaryCondition = 65, RULE_conditionalCompilationDefinedCondition = 66, 
		RULE_charDataKeyword = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "identificationDivisionTag", "compilerOptions", "compilerXOpts", 
			"compilerOption", "define_opt", "identifier_et_al", "numcheck_opts", 
			"rules_opts", "ssrange_opts", "test_opts", "classicCommentEntry", "execCicsStatement", 
			"execSqlStatement", "execSqlImsStatement", "copyStatement", "copySource", 
			"copyLibrary", "replacingPhrase", "replaceArea", "replaceByStatement", 
			"replaceOffStatement", "replaceClause", "directoryPhrase", "familyPhrase", 
			"replaceable", "replacement", "ejectStatement", "skipStatement", "titleStatement", 
			"pseudoText", "charData", "charDataSql", "charDataLine", "cobolWord", 
			"literal", "filename", "compilerDirectiveStatement", "compilerDirective", 
			"conditionalCompilationStatement", "compilerDirectiveCallInterface", 
			"compilerDirectiveInline", "compilerDirectiveBasis", "basisName", "compilerDirectiveInsert", 
			"compilerDirectiveDelete", "compilerDirectiveNumericRange", "compilerDirectiveNumericAtom", 
			"compilerDirectiveDeleteSequenceNumber", "conditionalCompilationDefine", 
			"conditionalCompilationDefinePredicate", "conditionalCompilationArithmeticExpression", 
			"conditionalCompilationArithmeticAtom", "conditionalCompilationArithmeticOp", 
			"conditionalCompilationIf", "conditionalCompilationElse", "conditionalCompilationEndIf", 
			"conditionalCompilationEvaluateSelection", "conditionalCompilationEvaluate", 
			"conditionalCompilationWhen", "conditionalCompilationEndEvaluate", "conditionalCompilationComparisonOp", 
			"conditionalCompilationRelationalCondition", "conditionalCompilationCondition", 
			"conditionalCompilationSimpleRelationalCondition", "conditionalCompilationBinaryCondition", 
			"conditionalCompilationDefinedCondition", "charDataKeyword"
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
			null, null, null, "'('", null, null, null, null, null, null, null, null, 
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
			null, null, null, null, null, "')'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'*>'", "','", "'>>'", "'.'", "'=='", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'*'", "'='", 
			"'>'", "'<'", "'+'", null, "'/'", "'<>'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASSIC_COMMENT_TAG", "CLASSIC_CONTINUATION", "CLASSIC_LINE_NUMBER", 
			"CLASSIC_EOL_COMMENT", "ID_DIVISION_TAG", "NIST_FLAG1", "NIST_FLAG2", 
			"NIST_IGNORED_LINE", "ABD", "ADATA", "ADV", "AFP", "ALIAS", "ALPHNUM", 
			"ANSI", "ANY", "APOST", "AR", "ARCH", "ARITH", "AUTO", "AWO", "BASIS", 
			"BIN", "BLOCK0", "BUF", "BUFSIZE", "BY", "CBL", "CBLCARD", "CICS", "CO", 
			"COBOL2", "COBOL3", "CODEPAGE", "COMPAT", "COMPILE", "COPY", "COPYLOC", 
			"COPYRIGHT", "CP", "CPLC", "CPP", "CPSM", "CPYR", "CS", "CURR", "CURRENCY", 
			"DATA", "DATEPROC", "DBCS", "DD", "DEBUG", "DEC", "DECK", "DEF", "DEFINE", 
			"DELETE", "DFHVALUE", "DIAGTRUNC", "DISPSIGN", "DIVISION", "DLI", "DLL", 
			"DP", "DS", "DSN", "DSNAME", "DTR", "DU", "DUMP", "DWARF", "DYN", "DYNAM", 
			"EDF", "EJECT", "EJPD", "EN", "ENDP", "ENDPERIOD", "ENGLISH", "END_EXEC", 
			"EPILOG", "EVENP", "EVENPACK", "EXCI", "EXEC", "EXEC_SQL", "EXIT", "EXP", 
			"EXPORTALL", "EXTEND", "FASTSRT", "FEPI", "FLAG", "FLAGSTD", "FSRT", 
			"FULL", "GDS", "GRAPHIC", "HEX", "HGPR", "HOOK", "IC", "ID", "IDENTIFICATION", 
			"IN", "INITCHECK", "INTDATE", "INITIAL", "INL", "INLINE", "INSERT", "JA", 
			"JP", "KA", "LANG", "LANGUAGE", "LAX", "LAXPERF", "LC", "LEADING", "LEASM", 
			"LENGTH", "LIB", "LILIAN", "LIN", "LINECOUNT", "LINKAGE", "LIST", "LM", 
			"LONGMIXED", "LONGUPPER", "LP", "LPARENCHAR", "LU", "LXPRF", "MAP", "MARGINS", 
			"MAX", "MD", "MDECK", "MIG", "MIXED", "MAXPCF", "MSG", "NAME", "NAT", 
			"NATIONAL", "NATLANG", "NC", "NN", "NO", "NOADATA", "NOADV", "NOALIAS", 
			"NOALPHNUM", "NOAWO", "NOBIN", "NOBLOCK0", "NOC", "NOCBLCARD", "NOCICS", 
			"NOCMPR2", "NOCOMPILE", "NOCOPYLOC", "NOCOPYRIGHT", "NOCPLC", "NOCPSM", 
			"NOCPYR", "NOCURR", "NOCURRENCY", "NOD", "NODATEPROC", "NODBCS", "NODE", 
			"NODEBUG", "NODECK", "NODEFINE", "NODEF", "NODIAGTRUNC", "NODLL", "NODSNAME", 
			"NODU", "NODUMP", "NODP", "NODTR", "NODWARF", "NODYN", "NODYNAM", "NOEDF", 
			"NOEJPD", "NOENDP", "NOENDPERIOD", "NOEPILOG", "NOEVENP", "NOEVENPACK", 
			"NOEXIT", "NOEXP", "NOEXPORTALL", "NOF", "NOFASTSRT", "NOFEPI", "NOFLAG", 
			"NOFLAGMIG", "NOFLAGSTD", "NOFSRT", "NOGRAPHIC", "NOHOOK", "NOINITCHECK", 
			"NOIC", "NOINITIAL", "NOINLINE", "NOINL", "NOLAXPERF", "NOLENGTH", "NOLIB", 
			"NOLINKAGE", "NOLIST", "NOLXPRF", "NOMAP", "NOMD", "NOMDECK", "NONAME", 
			"NONUM", "NONUMBER", "NOOBJ", "NOOBJECT", "NOOMITODOMIN", "NOOFF", "NOOFFSET", 
			"NOOOM", "NOOPSEQUENCE", "NOOPT", "NOOPTIMIZE", "NOOPTIONS", "NOP", "NOPAC", 
			"NOPARMCHECK", "NOPFD", "NOPRESERVE", "NOPROLOG", "NORENT", "NORULES", 
			"NOS", "NOSEP", "NOSEPARATE", "NOSEQ", "NOSERV", "NOSERVICE", "NOSLACKBYTES", 
			"NOSLCKB", "NOSO", "NOSOURCE", "NOSPIE", "NOSQL", "NOSQLC", "NOSQLCCSID", 
			"NOSQLIMS", "NOSSR", "NOSSRANGE", "NOSTDTRUNC", "NOSEQUENCE", "NOSTGOPT", 
			"NOSUPP", "NOSUPPRESS", "NOTERM", "NOTERMINAL", "NOTEST", "NOTHREAD", 
			"NOTRIG", "NOUNRA", "NOUNREFALL", "NOUNREFSOURCE", "NOUNRS", "NOVBREF", 
			"NOVOLATILE", "NOWD", "NOWORD", "NOX", "NOXREF", "NOZC", "NOZLEN", "NOZON", 
			"NOZONECHECK", "NOZWB", "NS", "NSEQ", "NSYMBOL", "NUM", "NUMBER", "NUMCHECK", 
			"NUMPROC", "OBJ", "OBJECT", "OF", "OFF", "OFFSET", "ON", "OMITODOMIN", 
			"OOM", "OP", "OPMARGINS", "OPSEQUENCE", "OPT", "OPTFILE", "OPTIMIZE", 
			"OPTIONS", "OUT", "OUTDD", "PAC", "PARMCHECK", "PATH", "PC", "PFD", "PPTDBG", 
			"PGMN", "PGMNAME", "PRESERVE", "PROCESS", "PROLOG", "QUALIFY", "QUA", 
			"QUOTE", "RENT", "REPLACE", "REPLACING", "RMODE", "RPARENCHAR", "RULES", 
			"SEP", "SEPARATE", "SEQ", "SEQUENCE", "SERV", "SERVICE", "SHORT", "SIZE", 
			"SLACKBYTES", "SLCKB", "SOURCE", "SP", "SPACE", "SPIE", "SQL", "SQLC", 
			"SQLCCSID", "SQLIMS", "SKIP1", "SKIP2", "SKIP3", "SO", "SS", "SSR", "SSRANGE", 
			"STANDARD", "STD", "STGOPT", "STRICT", "SUCC", "SUPP", "SUPPRESS", "SYSEIB", 
			"SZ", "TERM", "TERMINAL", "TEST", "THREAD", "TITLE", "TRAILING", "TRIG", 
			"TRUNC", "UE", "UNREF", "UPPER", "VBREF", "VLR", "VOLATILE", "VS", "VSAMOPENFS", 
			"WD", "WORD", "XMLPARSE", "XMLSS", "XOPTS", "XP", "XREF", "YEARWINDOW", 
			"YW", "ZC", "ZD", "ZLEN", "ZON", "ZONECHECK", "ZONEDATA", "ZWB", "C_CHAR", 
			"D_CHAR", "E_CHAR", "F_CHAR", "H_CHAR", "I_CHAR", "M_CHAR", "N_CHAR", 
			"O_CHAR", "Q_CHAR", "S_CHAR", "U_CHAR", "W_CHAR", "X_CHAR", "COMMENTTAG", 
			"COMMACHAR", "COMPILER_DIRECTIVE_TAG", "DOT", "DOUBLEEQUALCHAR", "NONNUMERICLITERAL", 
			"NUMERICLITERAL", "IDENTIFIER", "FILENAME", "PSEUDOTEXTIDENTIFIER", "NEWLINE", 
			"COMMENTLINE", "WS", "TEXT", "BOL", "CLASSIC_COMMENT_TEXT", "CD_WS", 
			"CD_CLASSIC_EOL_COMMENT", "ASTERISKCHAR", "EQUALCHAR", "GREATERTHANCHAR", 
			"LESSTHANCHAR", "PLUSCHAR", "MINUSCHAR", "SLASHCHAR", "NOTEQUALCHAR", 
			"GREATEROREQUALCHAR", "LESSOREQUALCHAR", "ZERO", "AS", "AND", "CALLINT", 
			"CALLINTERFACE", "DEFINED", "DLL_INTERFACE", "DYNAMIC", "ELSE", "END_EVALUATE", 
			"END_IF", "EQUAL", "EVALUATE", "GREATER", "IF", "INLINE_OFF", "INLINE_ON", 
			"IS", "LESS", "NOT", "OR", "OTHER", "OVERRIDE", "PARAMETER", "STATIC", 
			"THAN", "THROUGH", "THRU", "TO", "TRUE", "WHEN", "BD_WS", "BD_CLASSIC_EOL_COMMENT", 
			"SQL_TEXT"
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
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXEC - 64)) | (1L << (EXEC_SQL - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (ID - 64)) | (1L << (IDENTIFICATION - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SKIP1 - 320)) | (1L << (SKIP2 - 320)) | (1L << (SKIP3 - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRAILING - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (COMPILER_DIRECTIVE_TAG - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(136);
					identificationDivisionTag();
					}
					break;
				case 2:
					{
					setState(137);
					compilerOptions();
					}
					break;
				case 3:
					{
					setState(138);
					compilerDirectiveStatement();
					}
					break;
				case 4:
					{
					setState(139);
					classicCommentEntry();
					}
					break;
				case 5:
					{
					setState(140);
					copyStatement();
					}
					break;
				case 6:
					{
					setState(141);
					execCicsStatement();
					}
					break;
				case 7:
					{
					setState(142);
					execSqlStatement();
					}
					break;
				case 8:
					{
					setState(143);
					execSqlImsStatement();
					}
					break;
				case 9:
					{
					setState(144);
					replaceOffStatement();
					}
					break;
				case 10:
					{
					setState(145);
					replaceArea();
					}
					break;
				case 11:
					{
					setState(146);
					ejectStatement();
					}
					break;
				case 12:
					{
					setState(147);
					skipStatement();
					}
					break;
				case 13:
					{
					setState(148);
					titleStatement();
					}
					break;
				case 14:
					{
					setState(149);
					charDataLine();
					}
					break;
				case 15:
					{
					setState(150);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDENTIFICATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
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
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==CBL || _la==PROCESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(167);
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
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(162);
							match(COMMACHAR);
							}
						}

						setState(165);
						compilerOption();
						}
						break;
					case XOPTS:
						{
						setState(166);
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
				setState(169); 
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
			setState(171);
			match(XOPTS);
			setState(172);
			match(LPARENCHAR);
			setState(173);
			compilerOption();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AWO) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << CBLCARD) | (1L << CICS) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DEBUG) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJPD - 64)) | (1L << (EPILOG - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (FASTSRT - 64)) | (1L << (FEPI - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INLINE - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LC - 64)) | (1L << (LEASM - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LP - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MAXPCF - 128)) | (1L << (NAME - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOWD - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PC - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (RMODE - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SIZE - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STGOPT - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TRUNC - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (WORD - 321)) | (1L << (XMLPARSE - 321)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (XP - 386)) | (1L << (XREF - 386)) | (1L << (YEARWINDOW - 386)) | (1L << (YW - 386)) | (1L << (ZC - 386)) | (1L << (ZD - 386)) | (1L << (ZONECHECK - 386)) | (1L << (ZONEDATA - 386)) | (1L << (ZWB - 386)) | (1L << (C_CHAR - 386)) | (1L << (D_CHAR - 386)) | (1L << (F_CHAR - 386)) | (1L << (Q_CHAR - 386)) | (1L << (S_CHAR - 386)) | (1L << (X_CHAR - 386)) | (1L << (COMMACHAR - 386)))) != 0)) {
				{
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(174);
					match(COMMACHAR);
					}
				}

				setState(177);
				compilerOption();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
		public List<TerminalNode> TEXT() { return getTokens(CobolPreprocessorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CobolPreprocessorParser.TEXT, i);
		}
		public TerminalNode CURRENCY() { return getToken(CobolPreprocessorParser.CURRENCY, 0); }
		public TerminalNode CURR() { return getToken(CobolPreprocessorParser.CURR, 0); }
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
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ADATA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(ADV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(187);
				match(AFP);
				setState(188);
				match(LPARENCHAR);
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==NOVOLATILE || _la==VOLATILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				match(RPARENCHAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(APOST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(192);
				match(ARCH);
				setState(193);
				match(LPARENCHAR);
				setState(194);
				literal();
				setState(195);
				match(RPARENCHAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==AR || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				match(LPARENCHAR);
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				match(RPARENCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				match(AWO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				match(BLOCK0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==BUF || _la==BUFSIZE) ) {
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
				literal();
				setState(206);
				match(RPARENCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(208);
				match(CBLCARD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(209);
				match(CICS);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(210);
					match(LPARENCHAR);
					setState(211);
					literal();
					setState(212);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(216);
				match(COBOL2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(217);
				match(COBOL3);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==CODEPAGE || _la==CP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				match(LPARENCHAR);
				setState(220);
				literal();
				setState(221);
				match(RPARENCHAR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(223);
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
				setState(224);
				_la = _input.LA(1);
				if ( !(_la==COPYLOC || _la==CPLC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				match(LPARENCHAR);
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(226);
					match(IDENTIFIER);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(227);
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
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(230);
						match(COMMACHAR);
						}
					}

					setState(233);
					match(DSN);
					setState(234);
					match(LPARENCHAR);
					setState(235);
					match(FILENAME);
					setState(236);
					match(RPARENCHAR);
					}
					break;
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATH || _la==COMMACHAR) {
					{
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(239);
						match(COMMACHAR);
						}
					}

					setState(242);
					match(PATH);
					setState(243);
					match(LPARENCHAR);
					setState(244);
					literal();
					setState(245);
					match(RPARENCHAR);
					}
				}

				setState(249);
				match(RPARENCHAR);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==COPYRIGHT || _la==CPYR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(251);
				match(LPARENCHAR);
				setState(252);
				literal();
				setState(253);
				match(RPARENCHAR);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(255);
				match(CPP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(256);
				match(CPSM);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==CURR || _la==CURRENCY) ) {
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
				match(TEXT);
				setState(260);
				match(RPARENCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(261);
				match(DATA);
				setState(262);
				match(LPARENCHAR);
				setState(263);
				literal();
				setState(264);
				match(RPARENCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==DATEPROC || _la==DP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(267);
					match(LPARENCHAR);
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FLAG || _la==NOFLAG) {
						{
						setState(268);
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

					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(271);
						match(COMMACHAR);
						}
					}

					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOTRIG || _la==TRIG) {
						{
						setState(274);
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

					setState(277);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(280);
				match(DBCS);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(281);
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
				setState(282);
				match(DEBUG);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(283);
				define_opt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(284);
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
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==DISPSIGN || _la==DS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				match(LPARENCHAR);
				setState(287);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==SEP || _la==C_CHAR || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				match(RPARENCHAR);
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(289);
				match(DLL);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(290);
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
				setState(291);
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
				setState(292);
				match(EDF);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(293);
				match(EPILOG);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(294);
				match(EXIT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(295);
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
				setState(296);
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
				setState(297);
				match(FEPI);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==FLAG || _la==F_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(299);
				match(LPARENCHAR);
				setState(300);
				_la = _input.LA(1);
				if ( !(((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (E_CHAR - 399)) | (1L << (I_CHAR - 399)) | (1L << (S_CHAR - 399)) | (1L << (U_CHAR - 399)) | (1L << (W_CHAR - 399)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(301);
					match(COMMACHAR);
					setState(302);
					_la = _input.LA(1);
					if ( !(((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (E_CHAR - 399)) | (1L << (I_CHAR - 399)) | (1L << (S_CHAR - 399)) | (1L << (U_CHAR - 399)) | (1L << (W_CHAR - 399)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(305);
				match(RPARENCHAR);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(306);
				match(FLAGSTD);
				setState(307);
				match(LPARENCHAR);
				setState(308);
				_la = _input.LA(1);
				if ( !(((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (H_CHAR - 401)) | (1L << (I_CHAR - 401)) | (1L << (M_CHAR - 401)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(309);
					match(COMMACHAR);
					setState(310);
					_la = _input.LA(1);
					if ( !(_la==DD || _la==NN || ((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & ((1L << (SS - 353)) | (1L << (D_CHAR - 353)) | (1L << (N_CHAR - 353)) | (1L << (S_CHAR - 353)))) != 0)) ) {
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
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(313);
					match(COMMACHAR);
					setState(314);
					match(O_CHAR);
					}
				}

				setState(317);
				match(RPARENCHAR);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(318);
				match(GDS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(319);
				match(GRAPHIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(320);
				match(HGPR);
				setState(321);
				match(LPARENCHAR);
				setState(322);
				_la = _input.LA(1);
				if ( !(_la==NOPRESERVE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				match(RPARENCHAR);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(324);
				match(INTDATE);
				setState(325);
				match(LPARENCHAR);
				setState(326);
				_la = _input.LA(1);
				if ( !(_la==ANSI || _la==LILIAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				match(RPARENCHAR);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==IC || _la==INITCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(329);
					match(LPARENCHAR);
					setState(330);
					_la = _input.LA(1);
					if ( !(_la==LAX || _la==STRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(331);
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
				setState(334);
				match(INITIAL);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(335);
				match(INLINE);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(336);
				match(INL);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==LANG || _la==LANGUAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				match(LPARENCHAR);
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==CS || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (EN - 78)) | (1L << (ENGLISH - 78)) | (1L << (JA - 78)) | (1L << (JP - 78)) | (1L << (KA - 78)))) != 0) || _la==UE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(340);
				match(RPARENCHAR);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(341);
				match(LEASM);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(342);
				match(LENGTH);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(343);
				match(LIB);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(344);
				match(LIN);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==LC || _la==LINECOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				match(LPARENCHAR);
				setState(347);
				literal();
				setState(348);
				match(RPARENCHAR);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(350);
				match(LINKAGE);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(351);
				match(LIST);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				{
				setState(352);
				match(LP);
				setState(353);
				match(LPARENCHAR);
				setState(354);
				literal();
				setState(355);
				match(RPARENCHAR);
				}
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				{
				setState(357);
				match(MAP);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(358);
					match(LPARENCHAR);
					setState(359);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(360);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(363);
				match(MARGINS);
				setState(364);
				match(LPARENCHAR);
				setState(365);
				literal();
				setState(366);
				match(COMMACHAR);
				setState(367);
				literal();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(368);
					match(COMMACHAR);
					setState(369);
					literal();
					}
				}

				setState(372);
				match(RPARENCHAR);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				{
				setState(374);
				match(MAXPCF);
				setState(375);
				match(LPARENCHAR);
				setState(376);
				literal();
				setState(377);
				match(RPARENCHAR);
				}
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==MD || _la==MDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(380);
					match(LPARENCHAR);
					setState(381);
					_la = _input.LA(1);
					if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(382);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(385);
				match(NAME);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(386);
					match(LPARENCHAR);
					setState(387);
					_la = _input.LA(1);
					if ( !(_la==ALIAS || _la==NOALIAS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(388);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(391);
				match(NATLANG);
				setState(392);
				match(LPARENCHAR);
				setState(393);
				_la = _input.LA(1);
				if ( !(_la==CS || _la==EN || _la==KA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(394);
				match(RPARENCHAR);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(395);
				match(NOADATA);
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(396);
				match(NOADV);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(397);
				match(NOAWO);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(398);
				match(NOBLOCK0);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(399);
				match(NOCBLCARD);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(400);
				match(NOCICS);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(401);
				match(NOCMPR2);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(402);
				_la = _input.LA(1);
				if ( !(_la==NOC || _la==NOCOMPILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(403);
					match(LPARENCHAR);
					setState(404);
					_la = _input.LA(1);
					if ( !(((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (E_CHAR - 399)) | (1L << (S_CHAR - 399)) | (1L << (W_CHAR - 399)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(405);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(408);
				match(NOCOPYLOC);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(409);
				match(NOCPLC);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(410);
				match(NOCOPYRIGHT);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(411);
				match(NOCPYR);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(412);
				match(NOCPSM);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(413);
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
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(414);
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
			case 78:
				enterOuterAlt(_localctx, 78);
				{
				setState(415);
				match(NODBCS);
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(416);
				match(NODEBUG);
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(417);
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
			case 81:
				enterOuterAlt(_localctx, 81);
				{
				setState(418);
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
			case 82:
				enterOuterAlt(_localctx, 82);
				{
				setState(419);
				match(NODLL);
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(420);
				match(NODE);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(421);
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
			case 85:
				enterOuterAlt(_localctx, 85);
				{
				setState(422);
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
			case 86:
				enterOuterAlt(_localctx, 86);
				{
				setState(423);
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
			case 87:
				enterOuterAlt(_localctx, 87);
				{
				setState(424);
				match(NOEDF);
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(425);
				match(NOEPILOG);
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(426);
				match(NOEXIT);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(427);
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
			case 91:
				enterOuterAlt(_localctx, 91);
				{
				setState(428);
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
			case 92:
				enterOuterAlt(_localctx, 92);
				{
				setState(429);
				match(NOFEPI);
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(430);
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
			case 94:
				enterOuterAlt(_localctx, 94);
				{
				setState(431);
				match(NOFLAGMIG);
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(432);
				match(NOFLAGSTD);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(433);
				match(NOGRAPHIC);
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(434);
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
			case 98:
				enterOuterAlt(_localctx, 98);
				{
				setState(435);
				match(NOINITIAL);
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(436);
				match(NOINLINE);
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(437);
				match(NOINL);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(438);
				match(NOLENGTH);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(439);
				match(NOLIB);
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(440);
				match(NOLINKAGE);
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(441);
				match(NOLIST);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(442);
				match(NOMAP);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(443);
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
			case 107:
				enterOuterAlt(_localctx, 107);
				{
				setState(444);
				match(NONAME);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(445);
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
			case 109:
				enterOuterAlt(_localctx, 109);
				{
				setState(446);
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
			case 110:
				enterOuterAlt(_localctx, 110);
				{
				setState(447);
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
			case 111:
				enterOuterAlt(_localctx, 111);
				{
				setState(448);
				match(NOOPSEQUENCE);
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(449);
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
			case 113:
				enterOuterAlt(_localctx, 113);
				{
				setState(450);
				match(NOOPTIONS);
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(451);
				match(NOP);
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(452);
				match(NOPARMCHECK);
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(453);
				match(NOPROLOG);
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(454);
				match(NORENT);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(455);
				match(NORULES);
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(456);
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
			case 120:
				enterOuterAlt(_localctx, 120);
				{
				setState(457);
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
			case 121:
				enterOuterAlt(_localctx, 121);
				{
				setState(458);
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
			case 122:
				enterOuterAlt(_localctx, 122);
				{
				setState(459);
				match(NOSPIE);
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(460);
				match(NOSQL);
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(461);
				match(NOSQLIMS);
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(462);
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
			case 126:
				enterOuterAlt(_localctx, 126);
				{
				setState(463);
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
			case 127:
				enterOuterAlt(_localctx, 127);
				{
				setState(464);
				match(NOSTDTRUNC);
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(465);
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
			case 129:
				enterOuterAlt(_localctx, 129);
				{
				setState(466);
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
			case 130:
				enterOuterAlt(_localctx, 130);
				{
				setState(467);
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
			case 131:
				enterOuterAlt(_localctx, 131);
				{
				setState(468);
				match(NOTEST);
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(469);
				match(NOTHREAD);
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(470);
				match(NOVBREF);
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(471);
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
			case 135:
				enterOuterAlt(_localctx, 135);
				{
				setState(472);
				match(NSEQ);
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==NS || _la==NSYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(474);
				match(LPARENCHAR);
				setState(475);
				_la = _input.LA(1);
				if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				match(RPARENCHAR);
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(477);
				match(NOVBREF);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(478);
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
			case 139:
				enterOuterAlt(_localctx, 139);
				{
				setState(479);
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
			case 140:
				enterOuterAlt(_localctx, 140);
				{
				setState(480);
				match(NOZWB);
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(481);
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
			case 142:
				enterOuterAlt(_localctx, 142);
				{
				{
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==NC || _la==NUMCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(483);
					match(LPARENCHAR);
					setState(484);
					numcheck_opts();
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(485);
						match(COMMACHAR);
						setState(486);
						numcheck_opts();
						}
						}
						setState(491);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(492);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 143:
				enterOuterAlt(_localctx, 143);
				{
				setState(496);
				match(NUMPROC);
				setState(497);
				match(LPARENCHAR);
				setState(498);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(499);
				match(RPARENCHAR);
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(500);
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
			case 145:
				enterOuterAlt(_localctx, 145);
				{
				setState(501);
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
			case 146:
				enterOuterAlt(_localctx, 146);
				{
				setState(502);
				match(OPMARGINS);
				setState(503);
				match(LPARENCHAR);
				setState(504);
				literal();
				setState(505);
				match(COMMACHAR);
				setState(506);
				literal();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(507);
					match(COMMACHAR);
					setState(508);
					literal();
					}
				}

				setState(511);
				match(RPARENCHAR);
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(513);
				match(OPSEQUENCE);
				setState(514);
				match(LPARENCHAR);
				setState(515);
				literal();
				setState(516);
				match(COMMACHAR);
				setState(517);
				literal();
				setState(518);
				match(RPARENCHAR);
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(520);
				_la = _input.LA(1);
				if ( !(_la==OPT || _la==OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(521);
					match(LPARENCHAR);
					setState(522);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==STD || _la==NUMERICLITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(523);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(526);
				match(OPTFILE);
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(527);
				match(OPTIONS);
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(528);
				match(OP);
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(529);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==OUTDD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				match(LPARENCHAR);
				setState(531);
				cobolWord();
				setState(532);
				match(RPARENCHAR);
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				{
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==PARMCHECK || _la==PC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(535);
					match(LPARENCHAR);
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABD || _la==MSG) {
						{
						setState(536);
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

					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 412)) & ~0x3f) == 0 && ((1L << (_la - 412)) & ((1L << (COMMACHAR - 412)) | (1L << (NONNUMERICLITERAL - 412)) | (1L << (NUMERICLITERAL - 412)))) != 0)) {
						{
						setState(540);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(539);
							match(COMMACHAR);
							}
						}

						setState(542);
						literal();
						}
					}

					setState(545);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 154:
				enterOuterAlt(_localctx, 154);
				{
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==PGMN || _la==PGMNAME) ) {
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
				if ( !(_la==CO || _la==COMPAT || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (LM - 131)) | (1L << (LONGMIXED - 131)) | (1L << (LONGUPPER - 131)) | (1L << (LU - 131)) | (1L << (MIXED - 131)))) != 0) || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (UPPER - 375)) | (1L << (M_CHAR - 375)) | (1L << (U_CHAR - 375)))) != 0)) ) {
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
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(552);
				match(PROLOG);
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				{
				setState(553);
				_la = _input.LA(1);
				if ( !(_la==QUALIFY || _la==QUA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(554);
				match(LPARENCHAR);
				setState(555);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(556);
				match(RPARENCHAR);
				}
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(557);
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
			case 158:
				enterOuterAlt(_localctx, 158);
				{
				setState(558);
				match(RENT);
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(559);
				match(RMODE);
				setState(560);
				match(LPARENCHAR);
				setState(564);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
					{
					setState(561);
					match(ANY);
					}
					break;
				case AUTO:
					{
					setState(562);
					match(AUTO);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(563);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(566);
				match(RPARENCHAR);
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				{
				setState(567);
				match(RULES);
				setState(579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(568);
					match(LPARENCHAR);
					setState(569);
					rules_opts();
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(570);
						match(COMMACHAR);
						setState(571);
						rules_opts();
						}
						}
						setState(576);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(577);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 161:
				enterOuterAlt(_localctx, 161);
				{
				setState(581);
				_la = _input.LA(1);
				if ( !(_la==SEQ || _la==SEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(582);
					match(LPARENCHAR);
					setState(583);
					literal();
					setState(584);
					match(COMMACHAR);
					setState(585);
					literal();
					setState(586);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 162:
				enterOuterAlt(_localctx, 162);
				{
				{
				setState(590);
				_la = _input.LA(1);
				if ( !(_la==SERV || _la==SERVICE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(591);
				match(LPARENCHAR);
				setState(592);
				literal();
				setState(593);
				match(RPARENCHAR);
				}
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(595);
				_la = _input.LA(1);
				if ( !(_la==SIZE || _la==SZ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(596);
				match(LPARENCHAR);
				setState(599);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAX:
					{
					setState(597);
					match(MAX);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(598);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(601);
				match(RPARENCHAR);
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				setState(602);
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
			case 165:
				enterOuterAlt(_localctx, 165);
				{
				setState(603);
				match(SP);
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				setState(604);
				match(SPACE);
				setState(605);
				match(LPARENCHAR);
				setState(606);
				literal();
				setState(607);
				match(RPARENCHAR);
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(609);
				match(SPIE);
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(610);
				match(SQL);
				setState(615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(611);
					match(LPARENCHAR);
					setState(612);
					literal();
					setState(613);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(617);
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
			case 170:
				enterOuterAlt(_localctx, 170);
				{
				setState(618);
				match(SQLIMS);
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(619);
					match(LPARENCHAR);
					setState(620);
					literal();
					setState(621);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 171:
				enterOuterAlt(_localctx, 171);
				{
				{
				setState(625);
				_la = _input.LA(1);
				if ( !(_la==SSR || _la==SSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(626);
					match(LPARENCHAR);
					setState(627);
					ssrange_opts();
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(628);
						match(COMMACHAR);
						setState(629);
						ssrange_opts();
						}
						}
						setState(634);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(635);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 172:
				enterOuterAlt(_localctx, 172);
				{
				setState(639);
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
			case 173:
				enterOuterAlt(_localctx, 173);
				{
				setState(640);
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
			case 174:
				enterOuterAlt(_localctx, 174);
				{
				setState(641);
				match(SYSEIB);
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(642);
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
			case 176:
				enterOuterAlt(_localctx, 176);
				{
				{
				setState(643);
				match(TEST);
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(644);
					match(LPARENCHAR);
					setState(645);
					test_opts();
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(646);
						match(COMMACHAR);
						setState(647);
						test_opts();
						}
						}
						setState(652);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(653);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case 177:
				enterOuterAlt(_localctx, 177);
				{
				setState(657);
				match(THREAD);
				}
				break;
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(658);
				match(TRUNC);
				setState(659);
				match(LPARENCHAR);
				setState(660);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==OPT || _la==STD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(661);
				match(RPARENCHAR);
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(662);
				match(VBREF);
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				{
				setState(663);
				match(VLR);
				setState(664);
				match(LPARENCHAR);
				setState(665);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 356)) & ~0x3f) == 0 && ((1L << (_la - 356)) & ((1L << (STANDARD - 356)) | (1L << (C_CHAR - 356)) | (1L << (S_CHAR - 356)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(666);
				match(RPARENCHAR);
				}
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				{
				setState(667);
				_la = _input.LA(1);
				if ( !(_la==VS || _la==VSAMOPENFS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(668);
				match(LPARENCHAR);
				setState(669);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (SUCC - 360)) | (1L << (C_CHAR - 360)) | (1L << (S_CHAR - 360)))) != 0)) ) {
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
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(671);
				_la = _input.LA(1);
				if ( !(_la==WD || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(672);
				match(LPARENCHAR);
				setState(679);
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
					setState(673);
					cobolWord();
					}
					break;
				case TEXT:
					{
					setState(675); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(674);
						match(TEXT);
						}
						}
						setState(677); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(681);
				match(RPARENCHAR);
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				setState(682);
				_la = _input.LA(1);
				if ( !(_la==XMLPARSE || _la==XP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(683);
				match(LPARENCHAR);
				setState(684);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XMLSS - 384)) | (1L << (C_CHAR - 384)) | (1L << (X_CHAR - 384)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(685);
				match(RPARENCHAR);
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(686);
				_la = _input.LA(1);
				if ( !(_la==XREF || _la==X_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(687);
					match(LPARENCHAR);
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FULL || _la==SHORT) {
						{
						setState(688);
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

					setState(691);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==YEARWINDOW || _la==YW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(695);
				match(LPARENCHAR);
				setState(696);
				literal();
				setState(697);
				match(RPARENCHAR);
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				{
				setState(699);
				_la = _input.LA(1);
				if ( !(_la==ZC || _la==ZONECHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(700);
				match(LPARENCHAR);
				setState(701);
				_la = _input.LA(1);
				if ( !(_la==ABD || _la==MSG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(702);
				match(RPARENCHAR);
				}
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				{
				setState(703);
				_la = _input.LA(1);
				if ( !(_la==ZD || _la==ZONEDATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(704);
				match(LPARENCHAR);
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(706);
				match(RPARENCHAR);
				}
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(707);
				match(ZWB);
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(708);
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
			setState(711);
			_la = _input.LA(1);
			if ( !(_la==DEF || _la==DEFINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(712);
			match(LPARENCHAR);
			setState(713);
			identifier_et_al();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMACHAR || _la==TEXT) {
				{
				setState(720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(715); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(714);
						match(TEXT);
						}
						}
						setState(717); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				case COMMACHAR:
					{
					setState(719);
					match(COMMACHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(722);
				literal();
				}
			}

			setState(725);
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
			setState(727);
			_la = _input.LA(1);
			if ( !(((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (C_CHAR - 397)) | (1L << (D_CHAR - 397)) | (1L << (E_CHAR - 397)) | (1L << (F_CHAR - 397)) | (1L << (H_CHAR - 397)) | (1L << (I_CHAR - 397)) | (1L << (M_CHAR - 397)) | (1L << (N_CHAR - 397)) | (1L << (O_CHAR - 397)) | (1L << (Q_CHAR - 397)) | (1L << (S_CHAR - 397)) | (1L << (U_CHAR - 397)) | (1L << (W_CHAR - 397)) | (1L << (X_CHAR - 397)) | (1L << (IDENTIFIER - 397)))) != 0)) ) {
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
		public TerminalNode BIN() { return getToken(CobolPreprocessorParser.BIN, 0); }
		public TerminalNode NOBIN() { return getToken(CobolPreprocessorParser.NOBIN, 0); }
		public TerminalNode MSG() { return getToken(CobolPreprocessorParser.MSG, 0); }
		public TerminalNode ABD() { return getToken(CobolPreprocessorParser.ABD, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public TerminalNode ALPHNUM() { return getToken(CobolPreprocessorParser.ALPHNUM, 0); }
		public TerminalNode NOALPHNUM() { return getToken(CobolPreprocessorParser.NOALPHNUM, 0); }
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
		enterRule(_localctx, 14, RULE_numcheck_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(729);
				match(ZON);
				}
				break;
			case 2:
				{
				{
				setState(730);
				match(ZON);
				setState(731);
				match(LPARENCHAR);
				setState(732);
				_la = _input.LA(1);
				if ( !(_la==ALPHNUM || _la==NOALPHNUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(733);
				match(RPARENCHAR);
				}
				}
				break;
			case 3:
				{
				setState(734);
				match(NOZON);
				}
				break;
			case 4:
				{
				setState(735);
				match(PAC);
				}
				break;
			case 5:
				{
				setState(736);
				match(NOPAC);
				}
				break;
			case 6:
				{
				setState(737);
				match(BIN);
				}
				break;
			case 7:
				{
				setState(738);
				match(NOBIN);
				}
				break;
			case 8:
				{
				setState(739);
				match(MSG);
				}
				break;
			case 9:
				{
				setState(740);
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
		public TerminalNode NOLAXPERF() { return getToken(CobolPreprocessorParser.NOLAXPERF, 0); }
		public TerminalNode NOLXPRF() { return getToken(CobolPreprocessorParser.NOLXPRF, 0); }
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
		enterRule(_localctx, 16, RULE_rules_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ENDP - 79)) | (1L << (ENDPERIOD - 79)) | (1L << (EVENP - 79)) | (1L << (EVENPACK - 79)) | (1L << (LAXPERF - 79)) | (1L << (LXPRF - 79)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NOENDP - 193)) | (1L << (NOENDPERIOD - 193)) | (1L << (NOEVENP - 193)) | (1L << (NOEVENPACK - 193)) | (1L << (NOLAXPERF - 193)) | (1L << (NOLXPRF - 193)) | (1L << (NOOMITODOMIN - 193)) | (1L << (NOOOM - 193)) | (1L << (NOSLACKBYTES - 193)) | (1L << (NOSLCKB - 193)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (NOUNRA - 272)) | (1L << (NOUNREFALL - 272)) | (1L << (NOUNREFSOURCE - 272)) | (1L << (NOUNRS - 272)) | (1L << (OMITODOMIN - 272)) | (1L << (OOM - 272)))) != 0) || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (SLACKBYTES - 339)) | (1L << (SLCKB - 339)) | (1L << (UNREF - 339)))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_ssrange_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
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
		enterRule(_localctx, 20, RULE_test_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DWARF:
				{
				setState(747);
				match(DWARF);
				}
				break;
			case NODWARF:
				{
				setState(748);
				match(NODWARF);
				}
				break;
			case HOOK:
				{
				setState(749);
				match(HOOK);
				}
				break;
			case NOHOOK:
				{
				setState(750);
				match(NOHOOK);
				}
				break;
			case SEP:
			case SEPARATE:
				{
				{
				setState(751);
				_la = _input.LA(1);
				if ( !(_la==SEP || _la==SEPARATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(752);
					match(LPARENCHAR);
					setState(753);
					_la = _input.LA(1);
					if ( !(_la==DSNAME || _la==NODSNAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(754);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case NOSEP:
				{
				setState(757);
				match(NOSEP);
				}
				break;
			case NOSEPARATE:
				{
				setState(758);
				match(NOSEPARATE);
				}
				break;
			case SO:
				{
				setState(759);
				match(SO);
				}
				break;
			case SOURCE:
				{
				setState(760);
				match(SOURCE);
				}
				break;
			case NOSO:
				{
				setState(761);
				match(NOSO);
				}
				break;
			case NOSOURCE:
				{
				setState(762);
				match(NOSOURCE);
				}
				break;
			case EJPD:
				{
				setState(763);
				match(EJPD);
				}
				break;
			case NOEJPD:
				{
				setState(764);
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
		enterRule(_localctx, 22, RULE_classicCommentEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(CLASSIC_COMMENT_TAG);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASSIC_COMMENT_TEXT) {
				{
				{
				setState(768);
				match(CLASSIC_COMMENT_TEXT);
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774);
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
		public TerminalNode EXEC() { return getToken(CobolPreprocessorParser.EXEC, 0); }
		public TerminalNode CICS() { return getToken(CobolPreprocessorParser.CICS, 0); }
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
		enterRule(_localctx, 24, RULE_execCicsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(EXEC);
			setState(777);
			match(CICS);
			setState(780); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(780);
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
					setState(778);
					charData();
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(779);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(782); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RPARENCHAR - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (XOPTS - 385)) | (1L << (XREF - 385)) | (1L << (YEARWINDOW - 385)) | (1L << (YW - 385)) | (1L << (ZC - 385)) | (1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (DOT - 385)) | (1L << (NONNUMERICLITERAL - 385)) | (1L << (NUMERICLITERAL - 385)) | (1L << (IDENTIFIER - 385)) | (1L << (FILENAME - 385)) | (1L << (PSEUDOTEXTIDENTIFIER - 385)) | (1L << (NEWLINE - 385)) | (1L << (TEXT - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0) );
			setState(784);
			match(END_EXEC);
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(785);
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
		enterRule(_localctx, 26, RULE_execSqlStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(EXEC_SQL);
			setState(795); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(795);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SQL_TEXT:
					{
					setState(790); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(789);
							match(SQL_TEXT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(792); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(794);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(797); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASSIC_COMMENT_TAG || _la==SQL_TEXT );
			setState(799);
			match(END_EXEC);
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(800);
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
		enterRule(_localctx, 28, RULE_execSqlImsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(EXEC);
			setState(804);
			match(SQLIMS);
			setState(807); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(807);
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
					setState(805);
					charData();
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(806);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RPARENCHAR - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (XOPTS - 385)) | (1L << (XREF - 385)) | (1L << (YEARWINDOW - 385)) | (1L << (YW - 385)) | (1L << (ZC - 385)) | (1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (DOT - 385)) | (1L << (NONNUMERICLITERAL - 385)) | (1L << (NUMERICLITERAL - 385)) | (1L << (IDENTIFIER - 385)) | (1L << (FILENAME - 385)) | (1L << (PSEUDOTEXTIDENTIFIER - 385)) | (1L << (NEWLINE - 385)) | (1L << (TEXT - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0) );
			setState(811);
			match(END_EXEC);
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(812);
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
		enterRule(_localctx, 30, RULE_copyStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(COPY);
			setState(816);
			copySource();
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(817);
						match(NEWLINE);
						}
						}
						setState(822);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(825);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REPLACING:
						{
						setState(823);
						replacingPhrase();
						}
						break;
					case SUPPRESS:
						{
						setState(824);
						match(SUPPRESS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(832);
				match(NEWLINE);
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838);
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
		enterRule(_localctx, 32, RULE_copySource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(840);
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
				setState(841);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(842);
				filename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(845);
					match(NEWLINE);
					}
					}
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(851);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(852);
					match(NEWLINE);
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(858);
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
		enterRule(_localctx, 34, RULE_copyLibrary);
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
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
				setState(862);
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
		enterRule(_localctx, 36, RULE_replacingPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(REPLACING);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(866);
				match(NEWLINE);
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			replaceClause();
			setState(881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(874); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(873);
						match(NEWLINE);
						}
						}
						setState(876); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(878);
					replaceClause();
					}
					} 
				}
				setState(883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 38, RULE_replaceArea);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			replaceByStatement();
			setState(889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(887);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COPY:
						{
						setState(885);
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
						setState(886);
						charData();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(892);
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
		enterRule(_localctx, 40, RULE_replaceByStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(REPLACE);
			setState(903); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(896);
						match(NEWLINE);
						}
						}
						setState(901);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(902);
					replaceClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(905); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(907);
				match(NEWLINE);
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913);
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
		enterRule(_localctx, 42, RULE_replaceOffStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(REPLACE);
			setState(916);
			match(OFF);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(917);
				match(NEWLINE);
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(923);
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
		enterRule(_localctx, 44, RULE_replaceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(925);
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
			setState(928);
			replaceable();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(929);
				match(NEWLINE);
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
			match(BY);
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(936);
				match(NEWLINE);
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(942);
			replacement();
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(943);
					match(NEWLINE);
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(949);
				directoryPhrase();
				}
				break;
			}
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(952);
					match(NEWLINE);
					}
					}
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(958);
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
		enterRule(_localctx, 46, RULE_directoryPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(962);
				match(NEWLINE);
				}
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(968);
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
				setState(969);
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
		enterRule(_localctx, 48, RULE_familyPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(ON);
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(973);
				match(NEWLINE);
				}
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(979);
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
				setState(980);
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
		enterRule(_localctx, 50, RULE_replaceable);
		try {
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(985);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(986);
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
		enterRule(_localctx, 52, RULE_replacement);
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(992);
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
		enterRule(_localctx, 54, RULE_ejectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(EJECT);
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(996);
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
		enterRule(_localctx, 56, RULE_skipStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_la = _input.LA(1);
			if ( !(((((_la - 349)) & ~0x3f) == 0 && ((1L << (_la - 349)) & ((1L << (SKIP1 - 349)) | (1L << (SKIP2 - 349)) | (1L << (SKIP3 - 349)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1000);
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
		enterRule(_localctx, 58, RULE_titleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(TITLE);
			setState(1004);
			literal();
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1005);
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
		enterRule(_localctx, 60, RULE_pseudoText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(DOUBLEEQUALCHAR);
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RPARENCHAR - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (XOPTS - 385)) | (1L << (XREF - 385)) | (1L << (YEARWINDOW - 385)) | (1L << (YW - 385)) | (1L << (ZC - 385)) | (1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (DOT - 385)) | (1L << (NONNUMERICLITERAL - 385)) | (1L << (NUMERICLITERAL - 385)) | (1L << (IDENTIFIER - 385)) | (1L << (FILENAME - 385)) | (1L << (PSEUDOTEXTIDENTIFIER - 385)) | (1L << (NEWLINE - 385)) | (1L << (TEXT - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0)) {
				{
				setState(1009);
				charData();
				}
			}

			setState(1012);
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
		enterRule(_localctx, 62, RULE_charData);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1016); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1016);
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
						setState(1014);
						charDataLine();
						}
						break;
					case NEWLINE:
						{
						setState(1015);
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
				setState(1018); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 64, RULE_charDataSql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1024);
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
					setState(1020);
					charDataLine();
					}
					break;
				case COPY:
					{
					setState(1021);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(1022);
					match(REPLACE);
					}
					break;
				case NEWLINE:
					{
					setState(1023);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (REPLACE - 321)) | (1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RPARENCHAR - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (XOPTS - 385)) | (1L << (XREF - 385)) | (1L << (YEARWINDOW - 385)) | (1L << (YW - 385)) | (1L << (ZC - 385)) | (1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (DOT - 385)) | (1L << (NONNUMERICLITERAL - 385)) | (1L << (NUMERICLITERAL - 385)) | (1L << (IDENTIFIER - 385)) | (1L << (FILENAME - 385)) | (1L << (PSEUDOTEXTIDENTIFIER - 385)) | (1L << (NEWLINE - 385)) | (1L << (TEXT - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0) );
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
		enterRule(_localctx, 66, RULE_charDataLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1036); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1036);
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
						setState(1028);
						cobolWord();
						}
						break;
					case NONNUMERICLITERAL:
					case NUMERICLITERAL:
						{
						setState(1029);
						literal();
						}
						break;
					case FILENAME:
						{
						setState(1030);
						filename();
						}
						break;
					case PSEUDOTEXTIDENTIFIER:
						{
						setState(1031);
						match(PSEUDOTEXTIDENTIFIER);
						}
						break;
					case TEXT:
						{
						setState(1032);
						match(TEXT);
						}
						break;
					case DOT:
						{
						setState(1033);
						match(DOT);
						}
						break;
					case LPARENCHAR:
						{
						setState(1034);
						match(LPARENCHAR);
						}
						break;
					case RPARENCHAR:
						{
						setState(1035);
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
				setState(1038); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1040);
					match(NEWLINE);
					setState(1041);
					match(CLASSIC_CONTINUATION);
					setState(1050); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(1050);
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
								setState(1042);
								cobolWord();
								}
								break;
							case NONNUMERICLITERAL:
							case NUMERICLITERAL:
								{
								setState(1043);
								literal();
								}
								break;
							case FILENAME:
								{
								setState(1044);
								filename();
								}
								break;
							case PSEUDOTEXTIDENTIFIER:
								{
								setState(1045);
								match(PSEUDOTEXTIDENTIFIER);
								}
								break;
							case TEXT:
								{
								setState(1046);
								match(TEXT);
								}
								break;
							case DOT:
								{
								setState(1047);
								match(DOT);
								}
								break;
							case LPARENCHAR:
								{
								setState(1048);
								match(LPARENCHAR);
								}
								break;
							case RPARENCHAR:
								{
								setState(1049);
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
						setState(1052); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		enterRule(_localctx, 68, RULE_cobolWord);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
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
				setState(1060);
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
		enterRule(_localctx, 70, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
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
		enterRule(_localctx, 72, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
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
		enterRule(_localctx, 74, RULE_compilerDirectiveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1067);
				compilerDirective();
				}
				break;
			case 2:
				{
				setState(1068);
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
		enterRule(_localctx, 76, RULE_compilerDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1071);
				compilerDirectiveCallInterface();
				}
				break;
			case 2:
				{
				setState(1072);
				compilerDirectiveInline();
				}
				break;
			case 3:
				{
				setState(1073);
				compilerDirectiveBasis();
				}
				break;
			case 4:
				{
				setState(1074);
				compilerDirectiveInsert();
				}
				break;
			case 5:
				{
				setState(1075);
				compilerDirectiveDelete();
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
		enterRule(_localctx, 78, RULE_conditionalCompilationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1078);
				conditionalCompilationDefine();
				}
				break;
			case 2:
				{
				setState(1079);
				conditionalCompilationIf();
				}
				break;
			case 3:
				{
				setState(1080);
				conditionalCompilationElse();
				}
				break;
			case 4:
				{
				setState(1081);
				conditionalCompilationEndIf();
				}
				break;
			case 5:
				{
				setState(1082);
				conditionalCompilationEvaluate();
				}
				break;
			case 6:
				{
				setState(1083);
				conditionalCompilationWhen();
				}
				break;
			case 7:
				{
				setState(1084);
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
		enterRule(_localctx, 80, RULE_compilerDirectiveCallInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1087);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1088);
			_la = _input.LA(1);
			if ( !(_la==CALLINT || _la==CALLINTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1089);
				_la = _input.LA(1);
				if ( !(((((_la - 445)) & ~0x3f) == 0 && ((1L << (_la - 445)) & ((1L << (DLL_INTERFACE - 445)) | (1L << (DYNAMIC - 445)) | (1L << (STATIC - 445)))) != 0)) ) {
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
		public TerminalNode INLINE_ON() { return getToken(CobolPreprocessorParser.INLINE_ON, 0); }
		public TerminalNode INLINE_OFF() { return getToken(CobolPreprocessorParser.INLINE_OFF, 0); }
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
		enterRule(_localctx, 82, RULE_compilerDirectiveInline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1092);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1093);
			match(INLINE);
			setState(1094);
			_la = _input.LA(1);
			if ( !(_la==INLINE_OFF || _la==INLINE_ON) ) {
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
		enterRule(_localctx, 84, RULE_compilerDirectiveBasis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1096);
			match(BASIS);
			setState(1097);
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
		enterRule(_localctx, 86, RULE_basisName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1099);
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
				setState(1100);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(1101);
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
		enterRule(_localctx, 88, RULE_compilerDirectiveInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1104);
			match(INSERT);
			setState(1105);
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
		enterRule(_localctx, 90, RULE_compilerDirectiveDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1107);
			match(DELETE);
			setState(1108);
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
		enterRule(_localctx, 92, RULE_compilerDirectiveNumericRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1110);
			compilerDirectiveNumericAtom();
			setState(1111);
			match(MINUSCHAR);
			setState(1112);
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
		enterRule(_localctx, 94, RULE_compilerDirectiveNumericAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1114);
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
		enterRule(_localctx, 96, RULE_compilerDirectiveDeleteSequenceNumber);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1116);
				compilerDirectiveNumericAtom();
				}
				break;
			case 2:
				{
				setState(1117);
				compilerDirectiveNumericRange();
				}
				break;
			}
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1120);
					match(COMMACHAR);
					setState(1123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(1121);
						compilerDirectiveNumericAtom();
						}
						break;
					case 2:
						{
						setState(1122);
						compilerDirectiveNumericRange();
						}
						break;
					}
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		public TerminalNode INLINE_OFF() { return getToken(CobolPreprocessorParser.INLINE_OFF, 0); }
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
		enterRule(_localctx, 98, RULE_conditionalCompilationDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1130);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1131);
			match(DEFINE);
			setState(1132);
			match(IDENTIFIER);
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1133);
				match(AS);
				}
			}

			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1136);
				conditionalCompilationDefinePredicate();
				}
				break;
			case 2:
				{
				setState(1137);
				match(INLINE_OFF);
				}
				break;
			}
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(1140);
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
		enterRule(_localctx, 100, RULE_conditionalCompilationDefinePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1143);
				literal();
				}
				break;
			case 2:
				{
				setState(1144);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 3:
				{
				setState(1145);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(1146);
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
		enterRule(_localctx, 102, RULE_conditionalCompilationArithmeticExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1158); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1149);
						match(LPARENCHAR);
						}
						}
						setState(1154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1155);
					conditionalCompilationArithmeticAtom();
					setState(1156);
					conditionalCompilationArithmeticOp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1160); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1162);
						match(LPARENCHAR);
						}
						}
						setState(1167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1168);
					conditionalCompilationArithmeticAtom();
					setState(1172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==RPARENCHAR) {
						{
						{
						setState(1169);
						match(RPARENCHAR);
						}
						}
						setState(1174);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1175);
					conditionalCompilationArithmeticOp();
					}
					} 
				}
				setState(1181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(1182);
			conditionalCompilationArithmeticAtom();
			setState(1186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1183);
					match(RPARENCHAR);
					}
					} 
				}
				setState(1188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
		enterRule(_localctx, 104, RULE_conditionalCompilationArithmeticAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			_la = _input.LA(1);
			if ( !(((((_la - 417)) & ~0x3f) == 0 && ((1L << (_la - 417)) & ((1L << (NUMERICLITERAL - 417)) | (1L << (IDENTIFIER - 417)) | (1L << (ZERO - 417)))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_conditionalCompilationArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			_la = _input.LA(1);
			if ( !(((((_la - 429)) & ~0x3f) == 0 && ((1L << (_la - 429)) & ((1L << (ASTERISKCHAR - 429)) | (1L << (PLUSCHAR - 429)) | (1L << (MINUSCHAR - 429)) | (1L << (SLASHCHAR - 429)))) != 0)) ) {
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
		enterRule(_localctx, 108, RULE_conditionalCompilationIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1193);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1194);
			match(IF);
			setState(1195);
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
		enterRule(_localctx, 110, RULE_conditionalCompilationElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1198);
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
		enterRule(_localctx, 112, RULE_conditionalCompilationEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1201);
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
		enterRule(_localctx, 114, RULE_conditionalCompilationEvaluateSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1203);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1204);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1205);
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
		enterRule(_localctx, 116, RULE_conditionalCompilationEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1209);
			match(EVALUATE);
			setState(1212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(1210);
				match(TRUE);
				}
				break;
			case LPARENCHAR:
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
			case IDENTIFIER:
			case ZERO:
				{
				setState(1211);
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
		enterRule(_localctx, 118, RULE_conditionalCompilationWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1215);
			match(WHEN);
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				{
				setState(1216);
				conditionalCompilationEvaluateSelection();
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROUGH || _la==THRU) {
					{
					setState(1217);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1218);
					conditionalCompilationEvaluateSelection();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(1221);
				conditionalCompilationRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1222);
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
		enterRule(_localctx, 120, RULE_conditionalCompilationEndEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1226);
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
		enterRule(_localctx, 122, RULE_conditionalCompilationComparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1228);
				match(IS);
				}
			}

			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1231);
				match(NOT);
				}
			}

			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1234);
				match(EQUAL);
				}
				break;
			case 2:
				{
				setState(1235);
				match(EQUALCHAR);
				}
				break;
			case 3:
				{
				setState(1236);
				match(NOTEQUALCHAR);
				}
				break;
			case 4:
				{
				setState(1237);
				match(LESSTHANCHAR);
				}
				break;
			case 5:
				{
				{
				setState(1238);
				match(GREATER);
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1239);
					match(THAN);
					}
				}

				}
				}
				break;
			case 6:
				{
				setState(1242);
				match(GREATERTHANCHAR);
				}
				break;
			case 7:
				{
				{
				setState(1243);
				match(LESS);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1244);
					match(THAN);
					}
				}

				}
				}
				break;
			case 8:
				{
				setState(1247);
				match(LESSOREQUALCHAR);
				}
				break;
			case 9:
				{
				{
				setState(1248);
				match(LESS);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1249);
					match(THAN);
					}
				}

				setState(1252);
				match(OR);
				setState(1253);
				match(EQUAL);
				}
				}
				break;
			case 10:
				{
				setState(1254);
				match(GREATEROREQUALCHAR);
				}
				break;
			case 11:
				{
				{
				setState(1255);
				match(GREATER);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1256);
					match(THAN);
					}
				}

				setState(1259);
				match(OR);
				setState(1260);
				match(EQUAL);
				}
				}
				break;
			}
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1263);
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
		enterRule(_localctx, 124, RULE_conditionalCompilationRelationalCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1298); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1266);
							match(LPARENCHAR);
							}
							} 
						}
						setState(1271);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					}
					setState(1272);
					conditionalCompilationCondition();
					setState(1289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1273);
							_la = _input.LA(1);
							if ( !(_la==AND || _la==OR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1277);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1274);
									match(LPARENCHAR);
									}
									} 
								}
								setState(1279);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
							}
							setState(1280);
							conditionalCompilationCondition();
							setState(1284);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1281);
									match(RPARENCHAR);
									}
									} 
								}
								setState(1286);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
							}
							}
							} 
						}
						setState(1291);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
					}
					setState(1295);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1292);
							match(RPARENCHAR);
							}
							} 
						}
						setState(1297);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1300); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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
		enterRule(_localctx, 126, RULE_conditionalCompilationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1302);
				conditionalCompilationSimpleRelationalCondition();
				}
				break;
			case 2:
				{
				setState(1303);
				conditionalCompilationDefinedCondition();
				}
				break;
			case 3:
				{
				setState(1304);
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
		enterRule(_localctx, 128, RULE_conditionalCompilationSimpleRelationalCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1307);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1308);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1309);
				literal();
				}
				break;
			}
			setState(1312);
			conditionalCompilationComparisonOp();
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1313);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1314);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1315);
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
		enterRule(_localctx, 130, RULE_conditionalCompilationBinaryCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
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
		enterRule(_localctx, 132, RULE_conditionalCompilationDefinedCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1320);
			match(IDENTIFIER);
			setState(1322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1321);
				match(IS);
				}
			}

			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1324);
				match(NOT);
				}
			}

			setState(1327);
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
		public TerminalNode DFHVALUE() { return getToken(CobolPreprocessorParser.DFHVALUE, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolPreprocessorParser.LPARENCHAR, 0); }
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public TerminalNode COPY() { return getToken(CobolPreprocessorParser.COPY, 0); }
		public TerminalNode PROCESS() { return getToken(CobolPreprocessorParser.PROCESS, 0); }
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
		enterRule(_localctx, 134, RULE_charDataKeyword);
		try {
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				match(ABD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				match(ADATA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1331);
				match(ADV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332);
				match(AFP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1333);
				match(ALIAS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1334);
				match(ALPHNUM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1335);
				match(ANSI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1336);
				match(ANY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1337);
				match(APOST);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1338);
				match(AR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1339);
				match(ARCH);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1340);
				match(ARITH);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1341);
				match(AUTO);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1342);
				match(AWO);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1343);
				match(BIN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1344);
				match(BLOCK0);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1345);
				match(BUF);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1346);
				match(BUFSIZE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1347);
				match(BY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1348);
				match(CBLCARD);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1349);
				match(CICS);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1350);
				match(CO);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1351);
				match(COBOL2);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1352);
				match(COBOL3);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1353);
				match(CODEPAGE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1354);
				match(COMMACHAR);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1355);
				match(COMPAT);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1356);
				match(COMPILE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1357);
				match(COPYLOC);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1358);
				match(COPYRIGHT);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1359);
				match(CP);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1360);
				match(CPLC);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1361);
				match(CPP);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1362);
				match(CPSM);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1363);
				match(CPYR);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1364);
				match(CS);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1365);
				match(CURR);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1366);
				match(CURRENCY);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1367);
				match(DATA);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1368);
				match(DATEPROC);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1369);
				match(DBCS);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1370);
				match(DD);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1371);
				match(DEBUG);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1372);
				match(DEC);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1373);
				match(DECK);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(1374);
				match(DEF);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(1375);
				match(DEFINE);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(1376);
				match(DIAGTRUNC);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(1377);
				match(DISPSIGN);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(1378);
				match(DLI);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(1379);
				match(DLL);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(1380);
				match(DP);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(1381);
				match(DS);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(1382);
				match(DSN);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(1383);
				match(DSNAME);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(1384);
				match(DTR);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(1385);
				match(DU);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(1386);
				match(DUMP);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(1387);
				match(DYN);
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(1388);
				match(DYNAM);
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(1389);
				match(DWARF);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(1390);
				match(EDF);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(1391);
				match(EJECT);
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(1392);
				match(EJPD);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(1393);
				match(EN);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(1394);
				match(ENDP);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(1395);
				match(ENDPERIOD);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(1396);
				match(ENGLISH);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(1397);
				match(EPILOG);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(1398);
				match(EVENPACK);
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(1399);
				match(EVENP);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(1400);
				match(EXCI);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(1401);
				match(EXIT);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(1402);
				match(EXP);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(1403);
				match(EXPORTALL);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(1404);
				match(EXTEND);
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(1405);
				match(FASTSRT);
				}
				break;
			case 78:
				enterOuterAlt(_localctx, 78);
				{
				setState(1406);
				match(FLAG);
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(1407);
				match(FLAGSTD);
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(1408);
				match(FULL);
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 81);
				{
				setState(1409);
				match(FSRT);
				}
				break;
			case 82:
				enterOuterAlt(_localctx, 82);
				{
				setState(1410);
				match(GDS);
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(1411);
				match(GRAPHIC);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(1412);
				match(HEX);
				}
				break;
			case 85:
				enterOuterAlt(_localctx, 85);
				{
				setState(1413);
				match(HGPR);
				}
				break;
			case 86:
				enterOuterAlt(_localctx, 86);
				{
				setState(1414);
				match(HOOK);
				}
				break;
			case 87:
				enterOuterAlt(_localctx, 87);
				{
				setState(1415);
				match(IN);
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(1416);
				match(INITCHECK);
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(1417);
				match(IC);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(1418);
				match(INTDATE);
				}
				break;
			case 91:
				enterOuterAlt(_localctx, 91);
				{
				setState(1419);
				match(INITIAL);
				}
				break;
			case 92:
				enterOuterAlt(_localctx, 92);
				{
				setState(1420);
				match(INL);
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(1421);
				match(JA);
				}
				break;
			case 94:
				enterOuterAlt(_localctx, 94);
				{
				setState(1422);
				match(JP);
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(1423);
				match(KA);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(1424);
				match(LANG);
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(1425);
				match(LANGUAGE);
				}
				break;
			case 98:
				enterOuterAlt(_localctx, 98);
				{
				setState(1426);
				match(LAX);
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(1427);
				match(LAXPERF);
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(1428);
				match(LC);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(1429);
				match(LENGTH);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(1430);
				match(LIB);
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(1431);
				match(LILIAN);
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(1432);
				match(LIN);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(1433);
				match(LINECOUNT);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(1434);
				match(LINKAGE);
				}
				break;
			case 107:
				enterOuterAlt(_localctx, 107);
				{
				setState(1435);
				match(LIST);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(1436);
				match(LM);
				}
				break;
			case 109:
				enterOuterAlt(_localctx, 109);
				{
				setState(1437);
				match(LONGMIXED);
				}
				break;
			case 110:
				enterOuterAlt(_localctx, 110);
				{
				setState(1438);
				match(LONGUPPER);
				}
				break;
			case 111:
				enterOuterAlt(_localctx, 111);
				{
				setState(1439);
				match(LP);
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(1440);
				match(LU);
				}
				break;
			case 113:
				enterOuterAlt(_localctx, 113);
				{
				setState(1441);
				match(LXPRF);
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(1442);
				match(MAP);
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(1443);
				match(MARGINS);
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(1444);
				match(MAX);
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(1445);
				match(MAXPCF);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(1446);
				match(MD);
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(1447);
				match(MDECK);
				}
				break;
			case 120:
				enterOuterAlt(_localctx, 120);
				{
				setState(1448);
				match(MIG);
				}
				break;
			case 121:
				enterOuterAlt(_localctx, 121);
				{
				setState(1449);
				match(MIXED);
				}
				break;
			case 122:
				enterOuterAlt(_localctx, 122);
				{
				setState(1450);
				match(MSG);
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(1451);
				match(NAME);
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(1452);
				match(NAT);
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(1453);
				match(NATIONAL);
				}
				break;
			case 126:
				enterOuterAlt(_localctx, 126);
				{
				setState(1454);
				match(NATLANG);
				}
				break;
			case 127:
				enterOuterAlt(_localctx, 127);
				{
				setState(1455);
				match(NC);
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(1456);
				match(NN);
				}
				break;
			case 129:
				enterOuterAlt(_localctx, 129);
				{
				setState(1457);
				match(NO);
				}
				break;
			case 130:
				enterOuterAlt(_localctx, 130);
				{
				setState(1458);
				match(NOADATA);
				}
				break;
			case 131:
				enterOuterAlt(_localctx, 131);
				{
				setState(1459);
				match(NOADV);
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(1460);
				match(NOALIAS);
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(1461);
				match(NOALPHNUM);
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(1462);
				match(NOAWO);
				}
				break;
			case 135:
				enterOuterAlt(_localctx, 135);
				{
				setState(1463);
				match(NOBIN);
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(1464);
				match(NOBLOCK0);
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(1465);
				match(NC);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(1466);
				match(NOC);
				}
				break;
			case 139:
				enterOuterAlt(_localctx, 139);
				{
				setState(1467);
				match(NOCBLCARD);
				}
				break;
			case 140:
				enterOuterAlt(_localctx, 140);
				{
				setState(1468);
				match(NOCICS);
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(1469);
				match(NOCMPR2);
				}
				break;
			case 142:
				enterOuterAlt(_localctx, 142);
				{
				setState(1470);
				match(NOCOMPILE);
				}
				break;
			case 143:
				enterOuterAlt(_localctx, 143);
				{
				setState(1471);
				match(NOCOPYLOC);
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(1472);
				match(NOCOPYRIGHT);
				}
				break;
			case 145:
				enterOuterAlt(_localctx, 145);
				{
				setState(1473);
				match(NOCPLC);
				}
				break;
			case 146:
				enterOuterAlt(_localctx, 146);
				{
				setState(1474);
				match(NOCPSM);
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(1475);
				match(NOCPYR);
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(1476);
				match(NOCURR);
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(1477);
				match(NOCURRENCY);
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(1478);
				match(NOD);
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(1479);
				match(NODATEPROC);
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(1480);
				match(NODBCS);
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				setState(1481);
				match(NODE);
				}
				break;
			case 154:
				enterOuterAlt(_localctx, 154);
				{
				setState(1482);
				match(NODEBUG);
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(1483);
				match(NODECK);
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				setState(1484);
				match(NODEF);
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(1485);
				match(NODEFINE);
				}
				break;
			case 158:
				enterOuterAlt(_localctx, 158);
				{
				setState(1486);
				match(NODEF);
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(1487);
				match(NODIAGTRUNC);
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				setState(1488);
				match(NODLL);
				}
				break;
			case 161:
				enterOuterAlt(_localctx, 161);
				{
				setState(1489);
				match(NODSNAME);
				}
				break;
			case 162:
				enterOuterAlt(_localctx, 162);
				{
				setState(1490);
				match(NODU);
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(1491);
				match(NODUMP);
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				setState(1492);
				match(NODP);
				}
				break;
			case 165:
				enterOuterAlt(_localctx, 165);
				{
				setState(1493);
				match(NODTR);
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				setState(1494);
				match(NODYN);
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(1495);
				match(NODYNAM);
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(1496);
				match(NODWARF);
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(1497);
				match(NOEDF);
				}
				break;
			case 170:
				enterOuterAlt(_localctx, 170);
				{
				setState(1498);
				match(NOEJPD);
				}
				break;
			case 171:
				enterOuterAlt(_localctx, 171);
				{
				setState(1499);
				match(NOENDP);
				}
				break;
			case 172:
				enterOuterAlt(_localctx, 172);
				{
				setState(1500);
				match(NOENDPERIOD);
				}
				break;
			case 173:
				enterOuterAlt(_localctx, 173);
				{
				setState(1501);
				match(NOEPILOG);
				}
				break;
			case 174:
				enterOuterAlt(_localctx, 174);
				{
				setState(1502);
				match(NOEVENP);
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(1503);
				match(NOEVENPACK);
				}
				break;
			case 176:
				enterOuterAlt(_localctx, 176);
				{
				setState(1504);
				match(NOEXIT);
				}
				break;
			case 177:
				enterOuterAlt(_localctx, 177);
				{
				setState(1505);
				match(NOEXP);
				}
				break;
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(1506);
				match(NOEXPORTALL);
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(1507);
				match(NOF);
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				setState(1508);
				match(NOFASTSRT);
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				setState(1509);
				match(NOFEPI);
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(1510);
				match(NOFLAG);
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				setState(1511);
				match(NOFLAGMIG);
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(1512);
				match(NOFLAGSTD);
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(1513);
				match(NOFSRT);
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				setState(1514);
				match(NOGRAPHIC);
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				setState(1515);
				match(NOHOOK);
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(1516);
				match(NOIC);
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(1517);
				match(NOINITCHECK);
				}
				break;
			case 190:
				enterOuterAlt(_localctx, 190);
				{
				setState(1518);
				match(NOIC);
				}
				break;
			case 191:
				enterOuterAlt(_localctx, 191);
				{
				setState(1519);
				match(NOINITIAL);
				}
				break;
			case 192:
				enterOuterAlt(_localctx, 192);
				{
				setState(1520);
				match(NOINLINE);
				}
				break;
			case 193:
				enterOuterAlt(_localctx, 193);
				{
				setState(1521);
				match(NOINL);
				}
				break;
			case 194:
				enterOuterAlt(_localctx, 194);
				{
				setState(1522);
				match(NOLAXPERF);
				}
				break;
			case 195:
				enterOuterAlt(_localctx, 195);
				{
				setState(1523);
				match(NOLENGTH);
				}
				break;
			case 196:
				enterOuterAlt(_localctx, 196);
				{
				setState(1524);
				match(NOLIB);
				}
				break;
			case 197:
				enterOuterAlt(_localctx, 197);
				{
				setState(1525);
				match(NOLINKAGE);
				}
				break;
			case 198:
				enterOuterAlt(_localctx, 198);
				{
				setState(1526);
				match(NOLIST);
				}
				break;
			case 199:
				enterOuterAlt(_localctx, 199);
				{
				setState(1527);
				match(NOLXPRF);
				}
				break;
			case 200:
				enterOuterAlt(_localctx, 200);
				{
				setState(1528);
				match(NOMAP);
				}
				break;
			case 201:
				enterOuterAlt(_localctx, 201);
				{
				setState(1529);
				match(NOMD);
				}
				break;
			case 202:
				enterOuterAlt(_localctx, 202);
				{
				setState(1530);
				match(NOMDECK);
				}
				break;
			case 203:
				enterOuterAlt(_localctx, 203);
				{
				setState(1531);
				match(NONAME);
				}
				break;
			case 204:
				enterOuterAlt(_localctx, 204);
				{
				setState(1532);
				match(NONUM);
				}
				break;
			case 205:
				enterOuterAlt(_localctx, 205);
				{
				setState(1533);
				match(NONUMBER);
				}
				break;
			case 206:
				enterOuterAlt(_localctx, 206);
				{
				setState(1534);
				match(NOOBJ);
				}
				break;
			case 207:
				enterOuterAlt(_localctx, 207);
				{
				setState(1535);
				match(NOOBJECT);
				}
				break;
			case 208:
				enterOuterAlt(_localctx, 208);
				{
				setState(1536);
				match(NOOOM);
				}
				break;
			case 209:
				enterOuterAlt(_localctx, 209);
				{
				setState(1537);
				match(NOOMITODOMIN);
				}
				break;
			case 210:
				enterOuterAlt(_localctx, 210);
				{
				setState(1538);
				match(NOOFF);
				}
				break;
			case 211:
				enterOuterAlt(_localctx, 211);
				{
				setState(1539);
				match(NOOFFSET);
				}
				break;
			case 212:
				enterOuterAlt(_localctx, 212);
				{
				setState(1540);
				match(NOOPSEQUENCE);
				}
				break;
			case 213:
				enterOuterAlt(_localctx, 213);
				{
				setState(1541);
				match(NOOPT);
				}
				break;
			case 214:
				enterOuterAlt(_localctx, 214);
				{
				setState(1542);
				match(NOOPTIMIZE);
				}
				break;
			case 215:
				enterOuterAlt(_localctx, 215);
				{
				setState(1543);
				match(NOOPTIONS);
				}
				break;
			case 216:
				enterOuterAlt(_localctx, 216);
				{
				setState(1544);
				match(NOP);
				}
				break;
			case 217:
				enterOuterAlt(_localctx, 217);
				{
				setState(1545);
				match(NOPAC);
				}
				break;
			case 218:
				enterOuterAlt(_localctx, 218);
				{
				setState(1546);
				match(NOPARMCHECK);
				}
				break;
			case 219:
				enterOuterAlt(_localctx, 219);
				{
				setState(1547);
				match(NOPFD);
				}
				break;
			case 220:
				enterOuterAlt(_localctx, 220);
				{
				setState(1548);
				match(NOPRESERVE);
				}
				break;
			case 221:
				enterOuterAlt(_localctx, 221);
				{
				setState(1549);
				match(NOPROLOG);
				}
				break;
			case 222:
				enterOuterAlt(_localctx, 222);
				{
				setState(1550);
				match(NORENT);
				}
				break;
			case 223:
				enterOuterAlt(_localctx, 223);
				{
				setState(1551);
				match(NORULES);
				}
				break;
			case 224:
				enterOuterAlt(_localctx, 224);
				{
				setState(1552);
				match(NOS);
				}
				break;
			case 225:
				enterOuterAlt(_localctx, 225);
				{
				setState(1553);
				match(NOSEP);
				}
				break;
			case 226:
				enterOuterAlt(_localctx, 226);
				{
				setState(1554);
				match(NOSEPARATE);
				}
				break;
			case 227:
				enterOuterAlt(_localctx, 227);
				{
				setState(1555);
				match(NOSEQ);
				}
				break;
			case 228:
				enterOuterAlt(_localctx, 228);
				{
				setState(1556);
				match(NOSEQUENCE);
				}
				break;
			case 229:
				enterOuterAlt(_localctx, 229);
				{
				setState(1557);
				match(NOSERV);
				}
				break;
			case 230:
				enterOuterAlt(_localctx, 230);
				{
				setState(1558);
				match(NOSERVICE);
				}
				break;
			case 231:
				enterOuterAlt(_localctx, 231);
				{
				setState(1559);
				match(NOSLACKBYTES);
				}
				break;
			case 232:
				enterOuterAlt(_localctx, 232);
				{
				setState(1560);
				match(NOSLCKB);
				}
				break;
			case 233:
				enterOuterAlt(_localctx, 233);
				{
				setState(1561);
				match(NOSO);
				}
				break;
			case 234:
				enterOuterAlt(_localctx, 234);
				{
				setState(1562);
				match(NOSPIE);
				}
				break;
			case 235:
				enterOuterAlt(_localctx, 235);
				{
				setState(1563);
				match(NOSOURCE);
				}
				break;
			case 236:
				enterOuterAlt(_localctx, 236);
				{
				setState(1564);
				match(NOSQL);
				}
				break;
			case 237:
				enterOuterAlt(_localctx, 237);
				{
				setState(1565);
				match(NOSQLC);
				}
				break;
			case 238:
				enterOuterAlt(_localctx, 238);
				{
				setState(1566);
				match(NOSQLCCSID);
				}
				break;
			case 239:
				enterOuterAlt(_localctx, 239);
				{
				setState(1567);
				match(NOSQLIMS);
				}
				break;
			case 240:
				enterOuterAlt(_localctx, 240);
				{
				setState(1568);
				match(NOSSR);
				}
				break;
			case 241:
				enterOuterAlt(_localctx, 241);
				{
				setState(1569);
				match(NOSSRANGE);
				}
				break;
			case 242:
				enterOuterAlt(_localctx, 242);
				{
				setState(1570);
				match(NOSTDTRUNC);
				}
				break;
			case 243:
				enterOuterAlt(_localctx, 243);
				{
				setState(1571);
				match(NOSTGOPT);
				}
				break;
			case 244:
				enterOuterAlt(_localctx, 244);
				{
				setState(1572);
				match(NOSUPP);
				}
				break;
			case 245:
				enterOuterAlt(_localctx, 245);
				{
				setState(1573);
				match(NOSUPPRESS);
				}
				break;
			case 246:
				enterOuterAlt(_localctx, 246);
				{
				setState(1574);
				match(NOTERM);
				}
				break;
			case 247:
				enterOuterAlt(_localctx, 247);
				{
				setState(1575);
				match(NOTERMINAL);
				}
				break;
			case 248:
				enterOuterAlt(_localctx, 248);
				{
				setState(1576);
				match(NOTEST);
				}
				break;
			case 249:
				enterOuterAlt(_localctx, 249);
				{
				setState(1577);
				match(NOTHREAD);
				}
				break;
			case 250:
				enterOuterAlt(_localctx, 250);
				{
				setState(1578);
				match(NOTRIG);
				}
				break;
			case 251:
				enterOuterAlt(_localctx, 251);
				{
				setState(1579);
				match(NOUNRA);
				}
				break;
			case 252:
				enterOuterAlt(_localctx, 252);
				{
				setState(1580);
				match(NOUNREFALL);
				}
				break;
			case 253:
				enterOuterAlt(_localctx, 253);
				{
				setState(1581);
				match(NOUNREFSOURCE);
				}
				break;
			case 254:
				enterOuterAlt(_localctx, 254);
				{
				setState(1582);
				match(NOUNRS);
				}
				break;
			case 255:
				enterOuterAlt(_localctx, 255);
				{
				setState(1583);
				match(NOVBREF);
				}
				break;
			case 256:
				enterOuterAlt(_localctx, 256);
				{
				setState(1584);
				match(NOVOLATILE);
				}
				break;
			case 257:
				enterOuterAlt(_localctx, 257);
				{
				setState(1585);
				match(NOWORD);
				}
				break;
			case 258:
				enterOuterAlt(_localctx, 258);
				{
				setState(1586);
				match(NOX);
				}
				break;
			case 259:
				enterOuterAlt(_localctx, 259);
				{
				setState(1587);
				match(NOXREF);
				}
				break;
			case 260:
				enterOuterAlt(_localctx, 260);
				{
				setState(1588);
				match(NOZC);
				}
				break;
			case 261:
				enterOuterAlt(_localctx, 261);
				{
				setState(1589);
				match(NOZLEN);
				}
				break;
			case 262:
				enterOuterAlt(_localctx, 262);
				{
				setState(1590);
				match(NOZON);
				}
				break;
			case 263:
				enterOuterAlt(_localctx, 263);
				{
				setState(1591);
				match(NOZONECHECK);
				}
				break;
			case 264:
				enterOuterAlt(_localctx, 264);
				{
				setState(1592);
				match(NOZWB);
				}
				break;
			case 265:
				enterOuterAlt(_localctx, 265);
				{
				setState(1593);
				match(NSEQ);
				}
				break;
			case 266:
				enterOuterAlt(_localctx, 266);
				{
				setState(1594);
				match(NSYMBOL);
				}
				break;
			case 267:
				enterOuterAlt(_localctx, 267);
				{
				setState(1595);
				match(NS);
				}
				break;
			case 268:
				enterOuterAlt(_localctx, 268);
				{
				setState(1596);
				match(NUM);
				}
				break;
			case 269:
				enterOuterAlt(_localctx, 269);
				{
				setState(1597);
				match(NUMBER);
				}
				break;
			case 270:
				enterOuterAlt(_localctx, 270);
				{
				setState(1598);
				match(NUMCHECK);
				}
				break;
			case 271:
				enterOuterAlt(_localctx, 271);
				{
				setState(1599);
				match(NUMPROC);
				}
				break;
			case 272:
				enterOuterAlt(_localctx, 272);
				{
				setState(1600);
				match(OBJ);
				}
				break;
			case 273:
				enterOuterAlt(_localctx, 273);
				{
				setState(1601);
				match(OBJECT);
				}
				break;
			case 274:
				enterOuterAlt(_localctx, 274);
				{
				setState(1602);
				match(ON);
				}
				break;
			case 275:
				enterOuterAlt(_localctx, 275);
				{
				setState(1603);
				match(OF);
				}
				break;
			case 276:
				enterOuterAlt(_localctx, 276);
				{
				setState(1604);
				match(OFF);
				}
				break;
			case 277:
				enterOuterAlt(_localctx, 277);
				{
				setState(1605);
				match(OFFSET);
				}
				break;
			case 278:
				enterOuterAlt(_localctx, 278);
				{
				setState(1606);
				match(OMITODOMIN);
				}
				break;
			case 279:
				enterOuterAlt(_localctx, 279);
				{
				setState(1607);
				match(OOM);
				}
				break;
			case 280:
				enterOuterAlt(_localctx, 280);
				{
				setState(1608);
				match(OPMARGINS);
				}
				break;
			case 281:
				enterOuterAlt(_localctx, 281);
				{
				setState(1609);
				match(OPSEQUENCE);
				}
				break;
			case 282:
				enterOuterAlt(_localctx, 282);
				{
				setState(1610);
				match(OPTIMIZE);
				}
				break;
			case 283:
				enterOuterAlt(_localctx, 283);
				{
				setState(1611);
				match(OP);
				}
				break;
			case 284:
				enterOuterAlt(_localctx, 284);
				{
				setState(1612);
				match(OPT);
				}
				break;
			case 285:
				enterOuterAlt(_localctx, 285);
				{
				setState(1613);
				match(OPTFILE);
				}
				break;
			case 286:
				enterOuterAlt(_localctx, 286);
				{
				setState(1614);
				match(OPTIONS);
				}
				break;
			case 287:
				enterOuterAlt(_localctx, 287);
				{
				setState(1615);
				match(OR);
				}
				break;
			case 288:
				enterOuterAlt(_localctx, 288);
				{
				setState(1616);
				match(OUT);
				}
				break;
			case 289:
				enterOuterAlt(_localctx, 289);
				{
				setState(1617);
				match(OUTDD);
				}
				break;
			case 290:
				enterOuterAlt(_localctx, 290);
				{
				setState(1618);
				match(PAC);
				}
				break;
			case 291:
				enterOuterAlt(_localctx, 291);
				{
				setState(1619);
				match(PARMCHECK);
				}
				break;
			case 292:
				enterOuterAlt(_localctx, 292);
				{
				setState(1620);
				match(PATH);
				}
				break;
			case 293:
				enterOuterAlt(_localctx, 293);
				{
				setState(1621);
				match(PFD);
				}
				break;
			case 294:
				enterOuterAlt(_localctx, 294);
				{
				setState(1622);
				match(PGMN);
				}
				break;
			case 295:
				enterOuterAlt(_localctx, 295);
				{
				setState(1623);
				match(PGMNAME);
				}
				break;
			case 296:
				enterOuterAlt(_localctx, 296);
				{
				setState(1624);
				match(PLUSCHAR);
				}
				break;
			case 297:
				enterOuterAlt(_localctx, 297);
				{
				setState(1625);
				match(PPTDBG);
				}
				break;
			case 298:
				enterOuterAlt(_localctx, 298);
				{
				setState(1626);
				match(PRESERVE);
				}
				break;
			case 299:
				enterOuterAlt(_localctx, 299);
				{
				setState(1627);
				match(PROLOG);
				}
				break;
			case 300:
				enterOuterAlt(_localctx, 300);
				{
				setState(1628);
				match(QUALIFY);
				}
				break;
			case 301:
				enterOuterAlt(_localctx, 301);
				{
				setState(1629);
				match(QUA);
				}
				break;
			case 302:
				enterOuterAlt(_localctx, 302);
				{
				setState(1630);
				match(QUOTE);
				}
				break;
			case 303:
				enterOuterAlt(_localctx, 303);
				{
				setState(1631);
				match(RENT);
				}
				break;
			case 304:
				enterOuterAlt(_localctx, 304);
				{
				setState(1632);
				match(REPLACING);
				}
				break;
			case 305:
				enterOuterAlt(_localctx, 305);
				{
				setState(1633);
				match(RMODE);
				}
				break;
			case 306:
				enterOuterAlt(_localctx, 306);
				{
				setState(1634);
				match(RULES);
				}
				break;
			case 307:
				enterOuterAlt(_localctx, 307);
				{
				setState(1635);
				match(SEQ);
				}
				break;
			case 308:
				enterOuterAlt(_localctx, 308);
				{
				setState(1636);
				match(SEQUENCE);
				}
				break;
			case 309:
				enterOuterAlt(_localctx, 309);
				{
				setState(1637);
				match(SEP);
				}
				break;
			case 310:
				enterOuterAlt(_localctx, 310);
				{
				setState(1638);
				match(SEPARATE);
				}
				break;
			case 311:
				enterOuterAlt(_localctx, 311);
				{
				setState(1639);
				match(SERV);
				}
				break;
			case 312:
				enterOuterAlt(_localctx, 312);
				{
				setState(1640);
				match(SERVICE);
				}
				break;
			case 313:
				enterOuterAlt(_localctx, 313);
				{
				setState(1641);
				match(SHORT);
				}
				break;
			case 314:
				enterOuterAlt(_localctx, 314);
				{
				setState(1642);
				match(SIZE);
				}
				break;
			case 315:
				enterOuterAlt(_localctx, 315);
				{
				setState(1643);
				match(SLACKBYTES);
				}
				break;
			case 316:
				enterOuterAlt(_localctx, 316);
				{
				setState(1644);
				match(SLCKB);
				}
				break;
			case 317:
				enterOuterAlt(_localctx, 317);
				{
				setState(1645);
				match(SO);
				}
				break;
			case 318:
				enterOuterAlt(_localctx, 318);
				{
				setState(1646);
				match(SOURCE);
				}
				break;
			case 319:
				enterOuterAlt(_localctx, 319);
				{
				setState(1647);
				match(SP);
				}
				break;
			case 320:
				enterOuterAlt(_localctx, 320);
				{
				setState(1648);
				match(SPACE);
				}
				break;
			case 321:
				enterOuterAlt(_localctx, 321);
				{
				setState(1649);
				match(SPIE);
				}
				break;
			case 322:
				enterOuterAlt(_localctx, 322);
				{
				setState(1650);
				match(SQL);
				}
				break;
			case 323:
				enterOuterAlt(_localctx, 323);
				{
				setState(1651);
				match(SQLC);
				}
				break;
			case 324:
				enterOuterAlt(_localctx, 324);
				{
				setState(1652);
				match(SQLCCSID);
				}
				break;
			case 325:
				enterOuterAlt(_localctx, 325);
				{
				setState(1653);
				match(SQLIMS);
				}
				break;
			case 326:
				enterOuterAlt(_localctx, 326);
				{
				setState(1654);
				match(SS);
				}
				break;
			case 327:
				enterOuterAlt(_localctx, 327);
				{
				setState(1655);
				match(SSR);
				}
				break;
			case 328:
				enterOuterAlt(_localctx, 328);
				{
				setState(1656);
				match(SSRANGE);
				}
				break;
			case 329:
				enterOuterAlt(_localctx, 329);
				{
				setState(1657);
				match(STD);
				}
				break;
			case 330:
				enterOuterAlt(_localctx, 330);
				{
				setState(1658);
				match(STANDARD);
				}
				break;
			case 331:
				enterOuterAlt(_localctx, 331);
				{
				setState(1659);
				match(STATIC);
				}
				break;
			case 332:
				enterOuterAlt(_localctx, 332);
				{
				setState(1660);
				match(STGOPT);
				}
				break;
			case 333:
				enterOuterAlt(_localctx, 333);
				{
				setState(1661);
				match(STRICT);
				}
				break;
			case 334:
				enterOuterAlt(_localctx, 334);
				{
				setState(1662);
				match(SUCC);
				}
				break;
			case 335:
				enterOuterAlt(_localctx, 335);
				{
				setState(1663);
				match(SUPP);
				}
				break;
			case 336:
				enterOuterAlt(_localctx, 336);
				{
				setState(1664);
				match(SUPPRESS);
				}
				break;
			case 337:
				enterOuterAlt(_localctx, 337);
				{
				setState(1665);
				match(SYSEIB);
				}
				break;
			case 338:
				enterOuterAlt(_localctx, 338);
				{
				setState(1666);
				match(SZ);
				}
				break;
			case 339:
				enterOuterAlt(_localctx, 339);
				{
				setState(1667);
				match(TERM);
				}
				break;
			case 340:
				enterOuterAlt(_localctx, 340);
				{
				setState(1668);
				match(TERMINAL);
				}
				break;
			case 341:
				enterOuterAlt(_localctx, 341);
				{
				setState(1669);
				match(TEST);
				}
				break;
			case 342:
				enterOuterAlt(_localctx, 342);
				{
				setState(1670);
				match(THREAD);
				}
				break;
			case 343:
				enterOuterAlt(_localctx, 343);
				{
				setState(1671);
				match(TITLE);
				}
				break;
			case 344:
				enterOuterAlt(_localctx, 344);
				{
				setState(1672);
				match(TO);
				}
				break;
			case 345:
				enterOuterAlt(_localctx, 345);
				{
				setState(1673);
				match(TRIG);
				}
				break;
			case 346:
				enterOuterAlt(_localctx, 346);
				{
				setState(1674);
				match(TRUE);
				}
				break;
			case 347:
				enterOuterAlt(_localctx, 347);
				{
				setState(1675);
				match(TRUNC);
				}
				break;
			case 348:
				enterOuterAlt(_localctx, 348);
				{
				setState(1676);
				match(UE);
				}
				break;
			case 349:
				enterOuterAlt(_localctx, 349);
				{
				setState(1677);
				match(UNREF);
				}
				break;
			case 350:
				enterOuterAlt(_localctx, 350);
				{
				setState(1678);
				match(UPPER);
				}
				break;
			case 351:
				enterOuterAlt(_localctx, 351);
				{
				setState(1679);
				match(VBREF);
				}
				break;
			case 352:
				enterOuterAlt(_localctx, 352);
				{
				setState(1680);
				match(VLR);
				}
				break;
			case 353:
				enterOuterAlt(_localctx, 353);
				{
				setState(1681);
				match(VOLATILE);
				}
				break;
			case 354:
				enterOuterAlt(_localctx, 354);
				{
				setState(1682);
				match(VS);
				}
				break;
			case 355:
				enterOuterAlt(_localctx, 355);
				{
				setState(1683);
				match(VSAMOPENFS);
				}
				break;
			case 356:
				enterOuterAlt(_localctx, 356);
				{
				setState(1684);
				match(WD);
				}
				break;
			case 357:
				enterOuterAlt(_localctx, 357);
				{
				setState(1685);
				match(WHEN);
				}
				break;
			case 358:
				enterOuterAlt(_localctx, 358);
				{
				setState(1686);
				match(XMLPARSE);
				}
				break;
			case 359:
				enterOuterAlt(_localctx, 359);
				{
				setState(1687);
				match(XMLSS);
				}
				break;
			case 360:
				enterOuterAlt(_localctx, 360);
				{
				setState(1688);
				match(XOPTS);
				}
				break;
			case 361:
				enterOuterAlt(_localctx, 361);
				{
				setState(1689);
				match(XREF);
				}
				break;
			case 362:
				enterOuterAlt(_localctx, 362);
				{
				setState(1690);
				match(YEARWINDOW);
				}
				break;
			case 363:
				enterOuterAlt(_localctx, 363);
				{
				setState(1691);
				match(YW);
				}
				break;
			case 364:
				enterOuterAlt(_localctx, 364);
				{
				setState(1692);
				match(ZC);
				}
				break;
			case 365:
				enterOuterAlt(_localctx, 365);
				{
				setState(1693);
				match(ZD);
				}
				break;
			case 366:
				enterOuterAlt(_localctx, 366);
				{
				setState(1694);
				match(ZLEN);
				}
				break;
			case 367:
				enterOuterAlt(_localctx, 367);
				{
				setState(1695);
				match(ZON);
				}
				break;
			case 368:
				enterOuterAlt(_localctx, 368);
				{
				setState(1696);
				match(ZONECHECK);
				}
				break;
			case 369:
				enterOuterAlt(_localctx, 369);
				{
				setState(1697);
				match(ZONEDATA);
				}
				break;
			case 370:
				enterOuterAlt(_localctx, 370);
				{
				setState(1698);
				match(ZWB);
				}
				break;
			case 371:
				enterOuterAlt(_localctx, 371);
				{
				setState(1699);
				match(C_CHAR);
				}
				break;
			case 372:
				enterOuterAlt(_localctx, 372);
				{
				setState(1700);
				match(D_CHAR);
				}
				break;
			case 373:
				enterOuterAlt(_localctx, 373);
				{
				setState(1701);
				match(E_CHAR);
				}
				break;
			case 374:
				enterOuterAlt(_localctx, 374);
				{
				setState(1702);
				match(F_CHAR);
				}
				break;
			case 375:
				enterOuterAlt(_localctx, 375);
				{
				setState(1703);
				match(H_CHAR);
				}
				break;
			case 376:
				enterOuterAlt(_localctx, 376);
				{
				setState(1704);
				match(I_CHAR);
				}
				break;
			case 377:
				enterOuterAlt(_localctx, 377);
				{
				setState(1705);
				match(M_CHAR);
				}
				break;
			case 378:
				enterOuterAlt(_localctx, 378);
				{
				setState(1706);
				match(N_CHAR);
				}
				break;
			case 379:
				enterOuterAlt(_localctx, 379);
				{
				setState(1707);
				match(O_CHAR);
				}
				break;
			case 380:
				enterOuterAlt(_localctx, 380);
				{
				setState(1708);
				match(Q_CHAR);
				}
				break;
			case 381:
				enterOuterAlt(_localctx, 381);
				{
				setState(1709);
				match(S_CHAR);
				}
				break;
			case 382:
				enterOuterAlt(_localctx, 382);
				{
				setState(1710);
				match(U_CHAR);
				}
				break;
			case 383:
				enterOuterAlt(_localctx, 383);
				{
				setState(1711);
				match(W_CHAR);
				}
				break;
			case 384:
				enterOuterAlt(_localctx, 384);
				{
				setState(1712);
				match(X_CHAR);
				}
				break;
			case 385:
				enterOuterAlt(_localctx, 385);
				{
				setState(1713);
				match(DIVISION);
				}
				break;
			case 386:
				enterOuterAlt(_localctx, 386);
				{
				setState(1714);
				match(LEADING);
				}
				break;
			case 387:
				enterOuterAlt(_localctx, 387);
				{
				setState(1715);
				match(TRAILING);
				}
				break;
			case 388:
				enterOuterAlt(_localctx, 388);
				{
				setState(1716);
				match(BASIS);
				}
				break;
			case 389:
				enterOuterAlt(_localctx, 389);
				{
				setState(1717);
				match(INSERT);
				}
				break;
			case 390:
				enterOuterAlt(_localctx, 390);
				{
				setState(1718);
				match(DELETE);
				}
				break;
			case 391:
				enterOuterAlt(_localctx, 391);
				{
				{
				setState(1719);
				match(DFHVALUE);
				setState(1720);
				match(LPARENCHAR);
				setState(1724);
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
					setState(1721);
					cobolWord();
					}
					break;
				case COPY:
					{
					setState(1722);
					match(COPY);
					}
					break;
				case PROCESS:
					{
					setState(1723);
					match(PROCESS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1726);
				match(RPARENCHAR);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01da\u06c4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u009a\n\2\f\2\16\2\u009d\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u00a6\n\4\3\4\3\4\6\4\u00aa\n\4\r\4"+
		"\16\4\u00ab\3\5\3\5\3\5\3\5\5\5\u00b2\n\5\3\5\7\5\u00b5\n\5\f\5\16\5\u00b8"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d9"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e7\n\6\3\6"+
		"\5\6\u00ea\n\6\3\6\3\6\3\6\3\6\5\6\u00f0\n\6\3\6\5\6\u00f3\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00fa\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0110\n\6\3\6\5\6\u0113\n\6\3"+
		"\6\5\6\u0116\n\6\3\6\5\6\u0119\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0132\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u013a\n\6\3\6\3\6\5\6\u013e\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014f\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u016c\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0175\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0182"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u0188\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0199\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u01ea\n\6\f\6\16\6\u01ed\13\6\3\6\3\6\5\6\u01f1\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0200\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u020f\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u021c\n\6\3\6\5\6\u021f\n\6\3\6\5\6\u0222"+
		"\n\6\3\6\5\6\u0225\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0237\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u023f\n\6\f"+
		"\6\16\6\u0242\13\6\3\6\3\6\5\6\u0246\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u024f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u025a\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u026a\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0272\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u0279\n\6\f\6\16"+
		"\6\u027c\13\6\3\6\3\6\5\6\u0280\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u028b\n\6\f\6\16\6\u028e\13\6\3\6\3\6\5\6\u0292\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u02a6"+
		"\n\6\r\6\16\6\u02a7\5\6\u02aa\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u02b4\n\6\3\6\5\6\u02b7\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u02c8\n\6\3\7\3\7\3\7\3\7\6\7\u02ce\n\7\r\7\16"+
		"\7\u02cf\3\7\5\7\u02d3\n\7\3\7\5\7\u02d6\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02e8\n\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u02f6\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0300\n\f\3\r\3\r\7\r\u0304\n\r\f\r\16\r\u0307\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\6\16\u030f\n\16\r\16\16\16\u0310\3\16\3\16\5\16"+
		"\u0315\n\16\3\17\3\17\6\17\u0319\n\17\r\17\16\17\u031a\3\17\6\17\u031e"+
		"\n\17\r\17\16\17\u031f\3\17\3\17\5\17\u0324\n\17\3\20\3\20\3\20\3\20\6"+
		"\20\u032a\n\20\r\20\16\20\u032b\3\20\3\20\5\20\u0330\n\20\3\21\3\21\3"+
		"\21\7\21\u0335\n\21\f\21\16\21\u0338\13\21\3\21\3\21\5\21\u033c\n\21\7"+
		"\21\u033e\n\21\f\21\16\21\u0341\13\21\3\21\7\21\u0344\n\21\f\21\16\21"+
		"\u0347\13\21\3\21\3\21\3\22\3\22\3\22\5\22\u034e\n\22\3\22\7\22\u0351"+
		"\n\22\f\22\16\22\u0354\13\22\3\22\3\22\7\22\u0358\n\22\f\22\16\22\u035b"+
		"\13\22\3\22\5\22\u035e\n\22\3\23\3\23\5\23\u0362\n\23\3\24\3\24\7\24\u0366"+
		"\n\24\f\24\16\24\u0369\13\24\3\24\3\24\6\24\u036d\n\24\r\24\16\24\u036e"+
		"\3\24\7\24\u0372\n\24\f\24\16\24\u0375\13\24\3\25\3\25\3\25\7\25\u037a"+
		"\n\25\f\25\16\25\u037d\13\25\3\25\5\25\u0380\n\25\3\26\3\26\7\26\u0384"+
		"\n\26\f\26\16\26\u0387\13\26\3\26\6\26\u038a\n\26\r\26\16\26\u038b\3\26"+
		"\7\26\u038f\n\26\f\26\16\26\u0392\13\26\3\26\3\26\3\27\3\27\3\27\7\27"+
		"\u0399\n\27\f\27\16\27\u039c\13\27\3\27\3\27\3\30\5\30\u03a1\n\30\3\30"+
		"\3\30\7\30\u03a5\n\30\f\30\16\30\u03a8\13\30\3\30\3\30\7\30\u03ac\n\30"+
		"\f\30\16\30\u03af\13\30\3\30\3\30\7\30\u03b3\n\30\f\30\16\30\u03b6\13"+
		"\30\3\30\5\30\u03b9\n\30\3\30\7\30\u03bc\n\30\f\30\16\30\u03bf\13\30\3"+
		"\30\5\30\u03c2\n\30\3\31\3\31\7\31\u03c6\n\31\f\31\16\31\u03c9\13\31\3"+
		"\31\3\31\5\31\u03cd\n\31\3\32\3\32\7\32\u03d1\n\32\f\32\16\32\u03d4\13"+
		"\32\3\32\3\32\5\32\u03d8\n\32\3\33\3\33\3\33\3\33\5\33\u03de\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u03e4\n\34\3\35\3\35\5\35\u03e8\n\35\3\36\3\36\5"+
		"\36\u03ec\n\36\3\37\3\37\3\37\5\37\u03f1\n\37\3 \3 \5 \u03f5\n \3 \3 "+
		"\3!\3!\6!\u03fb\n!\r!\16!\u03fc\3\"\3\"\3\"\3\"\6\"\u0403\n\"\r\"\16\""+
		"\u0404\3#\3#\3#\3#\3#\3#\3#\3#\6#\u040f\n#\r#\16#\u0410\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\6#\u041d\n#\r#\16#\u041e\7#\u0421\n#\f#\16#\u0424\13"+
		"#\3$\3$\5$\u0428\n$\3%\3%\3&\3&\3\'\3\'\5\'\u0430\n\'\3(\3(\3(\3(\3(\5"+
		"(\u0437\n(\3)\3)\3)\3)\3)\3)\3)\5)\u0440\n)\3*\3*\3*\5*\u0445\n*\3+\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3-\5-\u0451\n-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\5\62\u0461\n\62\3\62\3\62\3\62\5\62\u0466\n"+
		"\62\7\62\u0468\n\62\f\62\16\62\u046b\13\62\3\63\3\63\3\63\3\63\5\63\u0471"+
		"\n\63\3\63\3\63\5\63\u0475\n\63\3\63\5\63\u0478\n\63\3\64\3\64\3\64\3"+
		"\64\5\64\u047e\n\64\3\65\7\65\u0481\n\65\f\65\16\65\u0484\13\65\3\65\3"+
		"\65\3\65\6\65\u0489\n\65\r\65\16\65\u048a\3\65\7\65\u048e\n\65\f\65\16"+
		"\65\u0491\13\65\3\65\3\65\7\65\u0495\n\65\f\65\16\65\u0498\13\65\3\65"+
		"\3\65\7\65\u049c\n\65\f\65\16\65\u049f\13\65\3\65\3\65\7\65\u04a3\n\65"+
		"\f\65\16\65\u04a6\13\65\3\66\3\66\3\67\3\67\38\38\38\38\39\39\39\3:\3"+
		":\3:\3;\3;\3;\5;\u04b9\n;\3<\3<\3<\3<\5<\u04bf\n<\3=\3=\3=\3=\3=\5=\u04c6"+
		"\n=\3=\3=\5=\u04ca\n=\3>\3>\3>\3?\5?\u04d0\n?\3?\5?\u04d3\n?\3?\3?\3?"+
		"\3?\3?\3?\5?\u04db\n?\3?\3?\3?\5?\u04e0\n?\3?\3?\3?\5?\u04e5\n?\3?\3?"+
		"\3?\3?\3?\5?\u04ec\n?\3?\3?\5?\u04f0\n?\3?\5?\u04f3\n?\3@\7@\u04f6\n@"+
		"\f@\16@\u04f9\13@\3@\3@\3@\7@\u04fe\n@\f@\16@\u0501\13@\3@\3@\7@\u0505"+
		"\n@\f@\16@\u0508\13@\7@\u050a\n@\f@\16@\u050d\13@\3@\7@\u0510\n@\f@\16"+
		"@\u0513\13@\6@\u0515\n@\r@\16@\u0516\3A\3A\3A\5A\u051c\nA\3B\3B\3B\5B"+
		"\u0521\nB\3B\3B\3B\3B\5B\u0527\nB\3C\3C\3D\3D\5D\u052d\nD\3D\5D\u0530"+
		"\nD\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\5E\u06bf\nE\3E\5E\u06c2\nE\3E\2\2F\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2|\3\2kl\4\2\37\37\u0142\u0142"+
		"\4\2\u0117\u0117\u017c\u017c\4\2\24\24\26\26\6\2&&^^\u018f\u018f\u0191"+
		"\u0191\3\2\34\35\4\2%%++\4\2\'\'\u018f\u018f\4\2)),,\4\2**//\3\2\61\62"+
		"\4\2\64\64CC\4\2aa\u00ce\u00ce\4\2\u0111\u0111\u0175\u0175\4\299\u0190"+
		"\u0190\4\2>>GG\4\2??DD\6\2&&\u014d\u014d\u018f\u018f\u0199\u0199\3\2H"+
		"I\3\2KL\3\2\\]\4\2__cc\4\2aa\u0192\u0192\5\2\u0191\u0191\u0194\u0194\u0199"+
		"\u019b\3\2\u0193\u0195\b\2\66\66\u009a\u009a\u0163\u0163\u0190\u0190\u0196"+
		"\u0196\u0199\u0199\4\2\u00f3\u00f3\u0141\u0141\4\2\21\21\u0080\u0080\4"+
		"\2jjnn\4\2yy\u0169\u0169\3\2wx\7\2\60\60PPSStv\u0177\u0177\4\2{{\u0082"+
		"\u0082\4\288gg\3\2\u008f\u0090\6\2\'\'\u00a3\u00a3\u00a7\u00a7\u018f\u018f"+
		"\4\2\17\17\u009e\u009e\5\2\60\60PPvv\4\2\u00a3\u00a3\u00a7\u00a7\5\2\u0191"+
		"\u0191\u0199\u0199\u019b\u019b\3\2\u00ad\u00ae\4\2\u00b0\u00b0\u00bc\u00bc"+
		"\4\2\u00af\u00af\u00b4\u00b4\3\2\u00b5\u00b6\3\2\u00ba\u00bb\4\2\u00b7"+
		"\u00b7\u00bd\u00bd\3\2\u00bf\u00c0\3\2\u00c9\u00ca\4\2\u00cc\u00cc\u00d1"+
		"\u00d1\4\2\u00cb\u00cb\u00ce\u00ce\3\2\u00d4\u00d5\3\2\u00e0\u00e1\3\2"+
		"\u00e3\u00e4\3\2\u00e5\u00e6\3\2\u00e8\u00e9\3\2\u00ec\u00ed\4\2\u00fa"+
		"\u00fa\u0109\u0109\3\2\u00fb\u00fc\4\2\u00f7\u00f7\u0100\u0100\3\2\u0103"+
		"\u0104\3\2\u0106\u0107\4\2\u00ff\u00ff\u010a\u010a\3\2\u010b\u010c\3\2"+
		"\u010d\u010e\3\2\u0118\u0119\4\2\u0121\u0121\u0123\u0123\4\2\65\65\u0096"+
		"\u0097\3\2\u011a\u011b\4\2\u011c\u011c\u011f\u011f\3\2\u0124\u0125\4\2"+
		"\u0099\u0099\u0126\u0126\5\2\u0091\u0091\u00f2\u00f2\u013d\u013d\3\2\u0128"+
		"\u0129\3\2\u012b\u012c\4\2\u0133\u0133\u0135\u0135\5\2dd\u0167\u0167\u01a3"+
		"\u01a3\3\2\u0137\u0138\4\2\u013a\u013a\u013c\u013c\4\2\13\13\u0094\u0094"+
		"\3\2\u013f\u0140\n\2\"\"&&\u0085\u0087\u008a\u008a\u0092\u0092\u0179\u0179"+
		"\u0195\u0195\u019a\u019a\3\2\u0144\u0145\4\2\u0146\u0146\u0198\u0198\3"+
		"\2\u014f\u0150\3\2\u0151\u0152\4\2\u0154\u0154\u016e\u016e\4\2\u0157\u0157"+
		"\u0199\u0199\3\2\u015c\u015d\3\2\u0164\u0165\4\2\u0162\u0162\u0168\u0168"+
		"\3\2\u016b\u016c\3\2\u016f\u0170\5\2\32\32\u0133\u0133\u0167\u0167\6\2"+
		"&&\u0166\u0166\u018f\u018f\u0199\u0199\3\2\u017d\u017e\6\2&&\u016a\u016a"+
		"\u018f\u018f\u0199\u0199\3\2\u017f\u0180\4\2\u0181\u0181\u0184\u0184\6"+
		"\2&&\u0182\u0182\u018f\u018f\u019c\u019c\4\2\u0185\u0185\u019c\u019c\4"+
		"\2dd\u0153\u0153\3\2\u0186\u0187\4\2\u0188\u0188\u018c\u018c\4\2\u0189"+
		"\u0189\u018d\u018d\3\2:;\4\2\u018f\u019c\u01a4\u01a4\4\2\20\20\u009f\u009f"+
		"\21\2QRVWzz\u008b\u008b\u00c3\u00c4\u00c6\u00c7\u00d9\u00d9\u00de\u00de"+
		"\u00e7\u00e7\u00ea\u00ea\u00fd\u00fe\u0112\u0115\u012e\u012f\u0155\u0156"+
		"\u0178\u0178\6\2\13\13\u0094\u0094\u011d\u011d\u018a\u018a\3\2\u014d\u014e"+
		"\4\2FF\u00b9\u00b9\4\2mm\u012a\u012a\4\2||\u0174\u0174\3\2\u015f\u0161"+
		"\3\2\u01a2\u01a3\3\2\u01bc\u01bd\4\2\u01bf\u01c0\u01d1\u01d1\3\2\u01c8"+
		"\u01c9\4\2\u01a3\u01a4\u01b9\u01b9\4\2\u01af\u01af\u01b3\u01b5\3\2\u01d3"+
		"\u01d4\4\2\u01bb\u01bb\u01cd\u01cd\2\u09aa\2\u009b\3\2\2\2\4\u00a0\3\2"+
		"\2\2\6\u00a3\3\2\2\2\b\u00ad\3\2\2\2\n\u02c7\3\2\2\2\f\u02c9\3\2\2\2\16"+
		"\u02d9\3\2\2\2\20\u02e7\3\2\2\2\22\u02e9\3\2\2\2\24\u02eb\3\2\2\2\26\u02ff"+
		"\3\2\2\2\30\u0301\3\2\2\2\32\u030a\3\2\2\2\34\u0316\3\2\2\2\36\u0325\3"+
		"\2\2\2 \u0331\3\2\2\2\"\u034d\3\2\2\2$\u0361\3\2\2\2&\u0363\3\2\2\2(\u0376"+
		"\3\2\2\2*\u0381\3\2\2\2,\u0395\3\2\2\2.\u03a0\3\2\2\2\60\u03c3\3\2\2\2"+
		"\62\u03ce\3\2\2\2\64\u03dd\3\2\2\2\66\u03e3\3\2\2\28\u03e5\3\2\2\2:\u03e9"+
		"\3\2\2\2<\u03ed\3\2\2\2>\u03f2\3\2\2\2@\u03fa\3\2\2\2B\u0402\3\2\2\2D"+
		"\u040e\3\2\2\2F\u0427\3\2\2\2H\u0429\3\2\2\2J\u042b\3\2\2\2L\u042f\3\2"+
		"\2\2N\u0436\3\2\2\2P\u043f\3\2\2\2R\u0441\3\2\2\2T\u0446\3\2\2\2V\u044a"+
		"\3\2\2\2X\u0450\3\2\2\2Z\u0452\3\2\2\2\\\u0455\3\2\2\2^\u0458\3\2\2\2"+
		"`\u045c\3\2\2\2b\u0460\3\2\2\2d\u046c\3\2\2\2f\u047d\3\2\2\2h\u0488\3"+
		"\2\2\2j\u04a7\3\2\2\2l\u04a9\3\2\2\2n\u04ab\3\2\2\2p\u04af\3\2\2\2r\u04b2"+
		"\3\2\2\2t\u04b8\3\2\2\2v\u04ba\3\2\2\2x\u04c0\3\2\2\2z\u04cb\3\2\2\2|"+
		"\u04cf\3\2\2\2~\u0514\3\2\2\2\u0080\u051b\3\2\2\2\u0082\u0520\3\2\2\2"+
		"\u0084\u0528\3\2\2\2\u0086\u052a\3\2\2\2\u0088\u06c1\3\2\2\2\u008a\u009a"+
		"\5\4\3\2\u008b\u009a\5\6\4\2\u008c\u009a\5L\'\2\u008d\u009a\5\30\r\2\u008e"+
		"\u009a\5 \21\2\u008f\u009a\5\32\16\2\u0090\u009a\5\34\17\2\u0091\u009a"+
		"\5\36\20\2\u0092\u009a\5,\27\2\u0093\u009a\5(\25\2\u0094\u009a\58\35\2"+
		"\u0095\u009a\5:\36\2\u0096\u009a\5<\37\2\u0097\u009a\5D#\2\u0098\u009a"+
		"\7\u01a7\2\2\u0099\u008a\3\2\2\2\u0099\u008b\3\2\2\2\u0099\u008c\3\2\2"+
		"\2\u0099\u008d\3\2\2\2\u0099\u008e\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0090"+
		"\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0093\3\2\2\2\u0099"+
		"\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\2"+
		"\2\3\u009f\3\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\u00a2\7@\2\2\u00a2\5\3"+
		"\2\2\2\u00a3\u00a9\t\3\2\2\u00a4\u00a6\7\u019e\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\5\n\6\2\u00a8\u00aa"+
		"\5\b\5\2\u00a9\u00a5\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00ae\7\u0183"+
		"\2\2\u00ae\u00af\7\u0089\2\2\u00af\u00b6\5\n\6\2\u00b0\u00b2\7\u019e\2"+
		"\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\5\n\6\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\u014b"+
		"\2\2\u00ba\t\3\2\2\2\u00bb\u02c8\7\f\2\2\u00bc\u02c8\7\r\2\2\u00bd\u00be"+
		"\7\16\2\2\u00be\u00bf\7\u0089\2\2\u00bf\u00c0\t\4\2\2\u00c0\u02c8\7\u014b"+
		"\2\2\u00c1\u02c8\7\23\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00c4\7\u0089\2\2"+
		"\u00c4\u00c5\5H%\2\u00c5\u00c6\7\u014b\2\2\u00c6\u02c8\3\2\2\2\u00c7\u00c8"+
		"\t\5\2\2\u00c8\u00c9\7\u0089\2\2\u00c9\u00ca\t\6\2\2\u00ca\u02c8\7\u014b"+
		"\2\2\u00cb\u02c8\7\30\2\2\u00cc\u02c8\7\33\2\2\u00cd\u00ce\t\7\2\2\u00ce"+
		"\u00cf\7\u0089\2\2\u00cf\u00d0\5H%\2\u00d0\u00d1\7\u014b\2\2\u00d1\u02c8"+
		"\3\2\2\2\u00d2\u02c8\7 \2\2\u00d3\u00d8\7!\2\2\u00d4\u00d5\7\u0089\2\2"+
		"\u00d5\u00d6\5H%\2\u00d6\u00d7\7\u014b\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u02c8\3\2\2\2\u00da\u02c8\7#\2\2\u00db"+
		"\u02c8\7$\2\2\u00dc\u00dd\t\b\2\2\u00dd\u00de\7\u0089\2\2\u00de\u00df"+
		"\5H%\2\u00df\u00e0\7\u014b\2\2\u00e0\u02c8\3\2\2\2\u00e1\u02c8\t\t\2\2"+
		"\u00e2\u00e3\t\n\2\2\u00e3\u00e6\7\u0089\2\2\u00e4\u00e7\7\u01a4\2\2\u00e5"+
		"\u00e7\5H%\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2"+
		"\2\u00e7\u00ef\3\2\2\2\u00e8\u00ea\7\u019e\2\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed\7\u0089"+
		"\2\2\u00ed\u00ee\7\u01a5\2\2\u00ee\u00f0\7\u014b\2\2\u00ef\u00e9\3\2\2"+
		"\2\u00ef\u00f0\3\2\2\2\u00f0\u00f9\3\2\2\2\u00f1\u00f3\7\u019e\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\u013b"+
		"\2\2\u00f5\u00f6\7\u0089\2\2\u00f6\u00f7\5H%\2\u00f7\u00f8\7\u014b\2\2"+
		"\u00f8\u00fa\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u02c8\7\u014b\2\2\u00fc\u00fd\t\13\2\2\u00fd\u00fe\7\u0089"+
		"\2\2\u00fe\u00ff\5H%\2\u00ff\u0100\7\u014b\2\2\u0100\u02c8\3\2\2\2\u0101"+
		"\u02c8\7-\2\2\u0102\u02c8\7.\2\2\u0103\u0104\t\f\2\2\u0104\u0105\7\u0089"+
		"\2\2\u0105\u0106\7\u01aa\2\2\u0106\u02c8\7\u014b\2\2\u0107\u0108\7\63"+
		"\2\2\u0108\u0109\7\u0089\2\2\u0109\u010a\5H%\2\u010a\u010b\7\u014b\2\2"+
		"\u010b\u02c8\3\2\2\2\u010c\u0118\t\r\2\2\u010d\u010f\7\u0089\2\2\u010e"+
		"\u0110\t\16\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3"+
		"\2\2\2\u0111\u0113\7\u019e\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2"+
		"\u0113\u0115\3\2\2\2\u0114\u0116\t\17\2\2\u0115\u0114\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\7\u014b\2\2\u0118\u010d\3\2\2"+
		"\2\u0118\u0119\3\2\2\2\u0119\u02c8\3\2\2\2\u011a\u02c8\7\65\2\2\u011b"+
		"\u02c8\t\20\2\2\u011c\u02c8\7\67\2\2\u011d\u02c8\5\f\7\2\u011e\u02c8\t"+
		"\21\2\2\u011f\u0120\t\22\2\2\u0120\u0121\7\u0089\2\2\u0121\u0122\t\23"+
		"\2\2\u0122\u02c8\7\u014b\2\2\u0123\u02c8\7B\2\2\u0124\u02c8\t\24\2\2\u0125"+
		"\u02c8\t\25\2\2\u0126\u02c8\7M\2\2\u0127\u02c8\7U\2\2\u0128\u02c8\7[\2"+
		"\2\u0129\u02c8\t\26\2\2\u012a\u02c8\t\27\2\2\u012b\u02c8\7`\2\2\u012c"+
		"\u012d\t\30\2\2\u012d\u012e\7\u0089\2\2\u012e\u0131\t\31\2\2\u012f\u0130"+
		"\7\u019e\2\2\u0130\u0132\t\31\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u02c8\7\u014b\2\2\u0134\u0135\7b\2\2\u0135"+
		"\u0136\7\u0089\2\2\u0136\u0139\t\32\2\2\u0137\u0138\7\u019e\2\2\u0138"+
		"\u013a\t\33\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u013c\7\u019e\2\2\u013c\u013e\7\u0197\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u02c8\7\u014b\2\2\u0140"+
		"\u02c8\7e\2\2\u0141\u02c8\7f\2\2\u0142\u0143\7h\2\2\u0143\u0144\7\u0089"+
		"\2\2\u0144\u0145\t\34\2\2\u0145\u02c8\7\u014b\2\2\u0146\u0147\7o\2\2\u0147"+
		"\u0148\7\u0089\2\2\u0148\u0149\t\35\2\2\u0149\u02c8\7\u014b\2\2\u014a"+
		"\u014e\t\36\2\2\u014b\u014c\7\u0089\2\2\u014c\u014d\t\37\2\2\u014d\u014f"+
		"\7\u014b\2\2\u014e\u014b\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u02c8\3\2\2"+
		"\2\u0150\u02c8\7p\2\2\u0151\u02c8\7r\2\2\u0152\u02c8\7q\2\2\u0153\u0154"+
		"\t \2\2\u0154\u0155\7\u0089\2\2\u0155\u0156\t!\2\2\u0156\u02c8\7\u014b"+
		"\2\2\u0157\u02c8\7}\2\2\u0158\u02c8\7~\2\2\u0159\u02c8\7\177\2\2\u015a"+
		"\u02c8\7\u0081\2\2\u015b\u015c\t\"\2\2\u015c\u015d\7\u0089\2\2\u015d\u015e"+
		"\5H%\2\u015e\u015f\7\u014b\2\2\u015f\u02c8\3\2\2\2\u0160\u02c8\7\u0083"+
		"\2\2\u0161\u02c8\7\u0084\2\2\u0162\u0163\7\u0088\2\2\u0163\u0164\7\u0089"+
		"\2\2\u0164\u0165\5H%\2\u0165\u0166\7\u014b\2\2\u0166\u02c8\3\2\2\2\u0167"+
		"\u016b\7\u008c\2\2\u0168\u0169\7\u0089\2\2\u0169\u016a\t#\2\2\u016a\u016c"+
		"\7\u014b\2\2\u016b\u0168\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u02c8\3\2\2"+
		"\2\u016d\u016e\7\u008d\2\2\u016e\u016f\7\u0089\2\2\u016f\u0170\5H%\2\u0170"+
		"\u0171\7\u019e\2\2\u0171\u0174\5H%\2\u0172\u0173\7\u019e\2\2\u0173\u0175"+
		"\5H%\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\7\u014b\2\2\u0177\u02c8\3\2\2\2\u0178\u0179\7\u0093\2\2\u0179\u017a"+
		"\7\u0089\2\2\u017a\u017b\5H%\2\u017b\u017c\7\u014b\2\2\u017c\u02c8\3\2"+
		"\2\2\u017d\u0181\t$\2\2\u017e\u017f\7\u0089\2\2\u017f\u0180\t%\2\2\u0180"+
		"\u0182\7\u014b\2\2\u0181\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u02c8"+
		"\3\2\2\2\u0183\u0187\7\u0095\2\2\u0184\u0185\7\u0089\2\2\u0185\u0186\t"+
		"&\2\2\u0186\u0188\7\u014b\2\2\u0187\u0184\3\2\2\2\u0187\u0188\3\2\2\2"+
		"\u0188\u02c8\3\2\2\2\u0189\u018a\7\u0098\2\2\u018a\u018b\7\u0089\2\2\u018b"+
		"\u018c\t\'\2\2\u018c\u02c8\7\u014b\2\2\u018d\u02c8\7\u009c\2\2\u018e\u02c8"+
		"\7\u009d\2\2\u018f\u02c8\7\u00a0\2\2\u0190\u02c8\7\u00a2\2\2\u0191\u02c8"+
		"\7\u00a4\2\2\u0192\u02c8\7\u00a5\2\2\u0193\u02c8\7\u00a6\2\2\u0194\u0198"+
		"\t(\2\2\u0195\u0196\7\u0089\2\2\u0196\u0197\t)\2\2\u0197\u0199\7\u014b"+
		"\2\2\u0198\u0195\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u02c8\3\2\2\2\u019a"+
		"\u02c8\7\u00a8\2\2\u019b\u02c8\7\u00aa\2\2\u019c\u02c8\7\u00a9\2\2\u019d"+
		"\u02c8\7\u00ac\2\2\u019e\u02c8\7\u00ab\2\2\u019f\u02c8\t*\2\2\u01a0\u02c8"+
		"\t+\2\2\u01a1\u02c8\7\u00b1\2\2\u01a2\u02c8\7\u00b3\2\2\u01a3\u02c8\t"+
		",\2\2\u01a4\u02c8\t-\2\2\u01a5\u02c8\7\u00b8\2\2\u01a6\u02c8\7\u00b2\2"+
		"\2\u01a7\u02c8\t.\2\2\u01a8\u02c8\t/\2\2\u01a9\u02c8\t\60\2\2\u01aa\u02c8"+
		"\7\u00c1\2\2\u01ab\u02c8\7\u00c5\2\2\u01ac\u02c8\7\u00c8\2\2\u01ad\u02c8"+
		"\t\61\2\2\u01ae\u02c8\t\62\2\2\u01af\u02c8\7\u00cd\2\2\u01b0\u02c8\t\63"+
		"\2\2\u01b1\u02c8\7\u00cf\2\2\u01b2\u02c8\7\u00d0\2\2\u01b3\u02c8\7\u00d2"+
		"\2\2\u01b4\u02c8\t\64\2\2\u01b5\u02c8\7\u00d6\2\2\u01b6\u02c8\7\u00d7"+
		"\2\2\u01b7\u02c8\7\u00d8\2\2\u01b8\u02c8\7\u00da\2\2\u01b9\u02c8\7\u00db"+
		"\2\2\u01ba\u02c8\7\u00dc\2\2\u01bb\u02c8\7\u00dd\2\2\u01bc\u02c8\7\u00df"+
		"\2\2\u01bd\u02c8\t\65\2\2\u01be\u02c8\7\u00e2\2\2\u01bf\u02c8\t\66\2\2"+
		"\u01c0\u02c8\t\67\2\2\u01c1\u02c8\t8\2\2\u01c2\u02c8\7\u00eb\2\2\u01c3"+
		"\u02c8\t9\2\2\u01c4\u02c8\7\u00ee\2\2\u01c5\u02c8\7\u00ef\2\2\u01c6\u02c8"+
		"\7\u00f1\2\2\u01c7\u02c8\7\u00f4\2\2\u01c8\u02c8\7\u00f5\2\2\u01c9\u02c8"+
		"\7\u00f6\2\2\u01ca\u02c8\t:\2\2\u01cb\u02c8\t;\2\2\u01cc\u02c8\t<\2\2"+
		"\u01cd\u02c8\7\u0101\2\2\u01ce\u02c8\7\u0102\2\2\u01cf\u02c8\7\u0105\2"+
		"\2\u01d0\u02c8\t=\2\2\u01d1\u02c8\t>\2\2\u01d2\u02c8\7\u0108\2\2\u01d3"+
		"\u02c8\t?\2\2\u01d4\u02c8\t@\2\2\u01d5\u02c8\tA\2\2\u01d6\u02c8\7\u010f"+
		"\2\2\u01d7\u02c8\7\u0110\2\2\u01d8\u02c8\7\u0116\2\2\u01d9\u02c8\tB\2"+
		"\2\u01da\u02c8\7\u0122\2\2\u01db\u01dc\tC\2\2\u01dc\u01dd\7\u0089\2\2"+
		"\u01dd\u01de\tD\2\2\u01de\u02c8\7\u014b\2\2\u01df\u02c8\7\u0116\2\2\u01e0"+
		"\u02c8\tE\2\2\u01e1\u02c8\tF\2\2\u01e2\u02c8\7\u0120\2\2\u01e3\u02c8\t"+
		"G\2\2\u01e4\u01f0\tH\2\2\u01e5\u01e6\7\u0089\2\2\u01e6\u01eb\5\20\t\2"+
		"\u01e7\u01e8\7\u019e\2\2\u01e8\u01ea\5\20\t\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\u014b\2\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01e5\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u02c8\3\2\2\2\u01f2\u01f3\7\u0127"+
		"\2\2\u01f3\u01f4\7\u0089\2\2\u01f4\u01f5\tI\2\2\u01f5\u02c8\7\u014b\2"+
		"\2\u01f6\u02c8\tJ\2\2\u01f7\u02c8\tK\2\2\u01f8\u01f9\7\u0131\2\2\u01f9"+
		"\u01fa\7\u0089\2\2\u01fa\u01fb\5H%\2\u01fb\u01fc\7\u019e\2\2\u01fc\u01ff"+
		"\5H%\2\u01fd\u01fe\7\u019e\2\2\u01fe\u0200\5H%\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7\u014b\2\2\u0202\u02c8"+
		"\3\2\2\2\u0203\u0204\7\u0132\2\2\u0204\u0205\7\u0089\2\2\u0205\u0206\5"+
		"H%\2\u0206\u0207\7\u019e\2\2\u0207\u0208\5H%\2\u0208\u0209\7\u014b\2\2"+
		"\u0209\u02c8\3\2\2\2\u020a\u020e\tL\2\2\u020b\u020c\7\u0089\2\2\u020c"+
		"\u020d\tM\2\2\u020d\u020f\7\u014b\2\2\u020e\u020b\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u02c8\3\2\2\2\u0210\u02c8\7\u0134\2\2\u0211\u02c8\7\u0136"+
		"\2\2\u0212\u02c8\7\u0130\2\2\u0213\u0214\tN\2\2\u0214\u0215\7\u0089\2"+
		"\2\u0215\u0216\5F$\2\u0216\u0217\7\u014b\2\2\u0217\u02c8\3\2\2\2\u0218"+
		"\u0224\tO\2\2\u0219\u021b\7\u0089\2\2\u021a\u021c\tP\2\2\u021b\u021a\3"+
		"\2\2\2\u021b\u021c\3\2\2\2\u021c\u0221\3\2\2\2\u021d\u021f\7\u019e\2\2"+
		"\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222"+
		"\5H%\2\u0221\u021e\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0225\7\u014b\2\2\u0224\u0219\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u02c8"+
		"\3\2\2\2\u0226\u0227\tQ\2\2\u0227\u0228\7\u0089\2\2\u0228\u0229\tR\2\2"+
		"\u0229\u02c8\7\u014b\2\2\u022a\u02c8\7\u0143\2\2\u022b\u022c\tS\2\2\u022c"+
		"\u022d\7\u0089\2\2\u022d\u022e\t\6\2\2\u022e\u02c8\7\u014b\2\2\u022f\u02c8"+
		"\tT\2\2\u0230\u02c8\7\u0147\2\2\u0231\u0232\7\u014a\2\2\u0232\u0236\7"+
		"\u0089\2\2\u0233\u0237\7\22\2\2\u0234\u0237\7\27\2\2\u0235\u0237\5H%\2"+
		"\u0236\u0233\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u02c8\7\u014b\2\2\u0239\u0245\7\u014c\2\2\u023a\u023b\7"+
		"\u0089\2\2\u023b\u0240\5\22\n\2\u023c\u023d\7\u019e\2\2\u023d\u023f\5"+
		"\22\n\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\7\u014b"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u023a\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u02c8\3\2\2\2\u0247\u024e\tU\2\2\u0248\u0249\7\u0089\2\2\u0249\u024a"+
		"\5H%\2\u024a\u024b\7\u019e\2\2\u024b\u024c\5H%\2\u024c\u024d\7\u014b\2"+
		"\2\u024d\u024f\3\2\2\2\u024e\u0248\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u02c8"+
		"\3\2\2\2\u0250\u0251\tV\2\2\u0251\u0252\7\u0089\2\2\u0252\u0253\5H%\2"+
		"\u0253\u0254\7\u014b\2\2\u0254\u02c8\3\2\2\2\u0255\u0256\tW\2\2\u0256"+
		"\u0259\7\u0089\2\2\u0257\u025a\7\u008e\2\2\u0258\u025a\5H%\2\u0259\u0257"+
		"\3\2\2\2\u0259\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u02c8\7\u014b\2"+
		"\2\u025c\u02c8\tX\2\2\u025d\u02c8\7\u0158\2\2\u025e\u025f\7\u0159\2\2"+
		"\u025f\u0260\7\u0089\2\2\u0260\u0261\5H%\2\u0261\u0262\7\u014b\2\2\u0262"+
		"\u02c8\3\2\2\2\u0263\u02c8\7\u015a\2\2\u0264\u0269\7\u015b\2\2\u0265\u0266"+
		"\7\u0089\2\2\u0266\u0267\5H%\2\u0267\u0268\7\u014b\2\2\u0268\u026a\3\2"+
		"\2\2\u0269\u0265\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u02c8\3\2\2\2\u026b"+
		"\u02c8\tY\2\2\u026c\u0271\7\u015e\2\2\u026d\u026e\7\u0089\2\2\u026e\u026f"+
		"\5H%\2\u026f\u0270\7\u014b\2\2\u0270\u0272\3\2\2\2\u0271\u026d\3\2\2\2"+
		"\u0271\u0272\3\2\2\2\u0272\u02c8\3\2\2\2\u0273\u027f\tZ\2\2\u0274\u0275"+
		"\7\u0089\2\2\u0275\u027a\5\24\13\2\u0276\u0277\7\u019e\2\2\u0277\u0279"+
		"\5\24\13\2\u0278\u0276\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2"+
		"\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e"+
		"\7\u014b\2\2\u027e\u0280\3\2\2\2\u027f\u0274\3\2\2\2\u027f\u0280\3\2\2"+
		"\2\u0280\u02c8\3\2\2\2\u0281\u02c8\t[\2\2\u0282\u02c8\t\\\2\2\u0283\u02c8"+
		"\7\u016d\2\2\u0284\u02c8\t]\2\2\u0285\u0291\7\u0171\2\2\u0286\u0287\7"+
		"\u0089\2\2\u0287\u028c\5\26\f\2\u0288\u0289\7\u019e\2\2\u0289\u028b\5"+
		"\26\f\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7\u014b"+
		"\2\2\u0290\u0292\3\2\2\2\u0291\u0286\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u02c8\3\2\2\2\u0293\u02c8\7\u0172\2\2\u0294\u0295\7\u0176\2\2\u0295\u0296"+
		"\7\u0089\2\2\u0296\u0297\t^\2\2\u0297\u02c8\7\u014b\2\2\u0298\u02c8\7"+
		"\u017a\2\2\u0299\u029a\7\u017b\2\2\u029a\u029b\7\u0089\2\2\u029b\u029c"+
		"\t_\2\2\u029c\u02c8\7\u014b\2\2\u029d\u029e\t`\2\2\u029e\u029f\7\u0089"+
		"\2\2\u029f\u02a0\ta\2\2\u02a0\u02c8\7\u014b\2\2\u02a1\u02a2\tb\2\2\u02a2"+
		"\u02a9\7\u0089\2\2\u02a3\u02aa\5F$\2\u02a4\u02a6\7\u01aa\2\2\u02a5\u02a4"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02aa\3\2\2\2\u02a9\u02a3\3\2\2\2\u02a9\u02a5\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02c8\7\u014b\2\2\u02ac\u02ad\tc\2\2\u02ad\u02ae\7\u0089\2"+
		"\2\u02ae\u02af\td\2\2\u02af\u02c8\7\u014b\2\2\u02b0\u02b6\te\2\2\u02b1"+
		"\u02b3\7\u0089\2\2\u02b2\u02b4\tf\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\7\u014b\2\2\u02b6\u02b1\3\2\2"+
		"\2\u02b6\u02b7\3\2\2\2\u02b7\u02c8\3\2\2\2\u02b8\u02b9\tg\2\2\u02b9\u02ba"+
		"\7\u0089\2\2\u02ba\u02bb\5H%\2\u02bb\u02bc\7\u014b\2\2\u02bc\u02c8\3\2"+
		"\2\2\u02bd\u02be\th\2\2\u02be\u02bf\7\u0089\2\2\u02bf\u02c0\tP\2\2\u02c0"+
		"\u02c8\7\u014b\2\2\u02c1\u02c2\ti\2\2\u02c2\u02c3\7\u0089\2\2\u02c3\u02c4"+
		"\tI\2\2\u02c4\u02c8\7\u014b\2\2\u02c5\u02c8\7\u018e\2\2\u02c6\u02c8\5"+
		"\26\f\2\u02c7\u00bb\3\2\2\2\u02c7\u00bc\3\2\2\2\u02c7\u00bd\3\2\2\2\u02c7"+
		"\u00c1\3\2\2\2\u02c7\u00c2\3\2\2\2\u02c7\u00c7\3\2\2\2\u02c7\u00cb\3\2"+
		"\2\2\u02c7\u00cc\3\2\2\2\u02c7\u00cd\3\2\2\2\u02c7\u00d2\3\2\2\2\u02c7"+
		"\u00d3\3\2\2\2\u02c7\u00da\3\2\2\2\u02c7\u00db\3\2\2\2\u02c7\u00dc\3\2"+
		"\2\2\u02c7\u00e1\3\2\2\2\u02c7\u00e2\3\2\2\2\u02c7\u00fc\3\2\2\2\u02c7"+
		"\u0101\3\2\2\2\u02c7\u0102\3\2\2\2\u02c7\u0103\3\2\2\2\u02c7\u0107\3\2"+
		"\2\2\u02c7\u010c\3\2\2\2\u02c7\u011a\3\2\2\2\u02c7\u011b\3\2\2\2\u02c7"+
		"\u011c\3\2\2\2\u02c7\u011d\3\2\2\2\u02c7\u011e\3\2\2\2\u02c7\u011f\3\2"+
		"\2\2\u02c7\u0123\3\2\2\2\u02c7\u0124\3\2\2\2\u02c7\u0125\3\2\2\2\u02c7"+
		"\u0126\3\2\2\2\u02c7\u0127\3\2\2\2\u02c7\u0128\3\2\2\2\u02c7\u0129\3\2"+
		"\2\2\u02c7\u012a\3\2\2\2\u02c7\u012b\3\2\2\2\u02c7\u012c\3\2\2\2\u02c7"+
		"\u0134\3\2\2\2\u02c7\u0140\3\2\2\2\u02c7\u0141\3\2\2\2\u02c7\u0142\3\2"+
		"\2\2\u02c7\u0146\3\2\2\2\u02c7\u014a\3\2\2\2\u02c7\u0150\3\2\2\2\u02c7"+
		"\u0151\3\2\2\2\u02c7\u0152\3\2\2\2\u02c7\u0153\3\2\2\2\u02c7\u0157\3\2"+
		"\2\2\u02c7\u0158\3\2\2\2\u02c7\u0159\3\2\2\2\u02c7\u015a\3\2\2\2\u02c7"+
		"\u015b\3\2\2\2\u02c7\u0160\3\2\2\2\u02c7\u0161\3\2\2\2\u02c7\u0162\3\2"+
		"\2\2\u02c7\u0167\3\2\2\2\u02c7\u016d\3\2\2\2\u02c7\u0178\3\2\2\2\u02c7"+
		"\u017d\3\2\2\2\u02c7\u0183\3\2\2\2\u02c7\u0189\3\2\2\2\u02c7\u018d\3\2"+
		"\2\2\u02c7\u018e\3\2\2\2\u02c7\u018f\3\2\2\2\u02c7\u0190\3\2\2\2\u02c7"+
		"\u0191\3\2\2\2\u02c7\u0192\3\2\2\2\u02c7\u0193\3\2\2\2\u02c7\u0194\3\2"+
		"\2\2\u02c7\u019a\3\2\2\2\u02c7\u019b\3\2\2\2\u02c7\u019c\3\2\2\2\u02c7"+
		"\u019d\3\2\2\2\u02c7\u019e\3\2\2\2\u02c7\u019f\3\2\2\2\u02c7\u01a0\3\2"+
		"\2\2\u02c7\u01a1\3\2\2\2\u02c7\u01a2\3\2\2\2\u02c7\u01a3\3\2\2\2\u02c7"+
		"\u01a4\3\2\2\2\u02c7\u01a5\3\2\2\2\u02c7\u01a6\3\2\2\2\u02c7\u01a7\3\2"+
		"\2\2\u02c7\u01a8\3\2\2\2\u02c7\u01a9\3\2\2\2\u02c7\u01aa\3\2\2\2\u02c7"+
		"\u01ab\3\2\2\2\u02c7\u01ac\3\2\2\2\u02c7\u01ad\3\2\2\2\u02c7\u01ae\3\2"+
		"\2\2\u02c7\u01af\3\2\2\2\u02c7\u01b0\3\2\2\2\u02c7\u01b1\3\2\2\2\u02c7"+
		"\u01b2\3\2\2\2\u02c7\u01b3\3\2\2\2\u02c7\u01b4\3\2\2\2\u02c7\u01b5\3\2"+
		"\2\2\u02c7\u01b6\3\2\2\2\u02c7\u01b7\3\2\2\2\u02c7\u01b8\3\2\2\2\u02c7"+
		"\u01b9\3\2\2\2\u02c7\u01ba\3\2\2\2\u02c7\u01bb\3\2\2\2\u02c7\u01bc\3\2"+
		"\2\2\u02c7\u01bd\3\2\2\2\u02c7\u01be\3\2\2\2\u02c7\u01bf\3\2\2\2\u02c7"+
		"\u01c0\3\2\2\2\u02c7\u01c1\3\2\2\2\u02c7\u01c2\3\2\2\2\u02c7\u01c3\3\2"+
		"\2\2\u02c7\u01c4\3\2\2\2\u02c7\u01c5\3\2\2\2\u02c7\u01c6\3\2\2\2\u02c7"+
		"\u01c7\3\2\2\2\u02c7\u01c8\3\2\2\2\u02c7\u01c9\3\2\2\2\u02c7\u01ca\3\2"+
		"\2\2\u02c7\u01cb\3\2\2\2\u02c7\u01cc\3\2\2\2\u02c7\u01cd\3\2\2\2\u02c7"+
		"\u01ce\3\2\2\2\u02c7\u01cf\3\2\2\2\u02c7\u01d0\3\2\2\2\u02c7\u01d1\3\2"+
		"\2\2\u02c7\u01d2\3\2\2\2\u02c7\u01d3\3\2\2\2\u02c7\u01d4\3\2\2\2\u02c7"+
		"\u01d5\3\2\2\2\u02c7\u01d6\3\2\2\2\u02c7\u01d7\3\2\2\2\u02c7\u01d8\3\2"+
		"\2\2\u02c7\u01d9\3\2\2\2\u02c7\u01da\3\2\2\2\u02c7\u01db\3\2\2\2\u02c7"+
		"\u01df\3\2\2\2\u02c7\u01e0\3\2\2\2\u02c7\u01e1\3\2\2\2\u02c7\u01e2\3\2"+
		"\2\2\u02c7\u01e3\3\2\2\2\u02c7\u01e4\3\2\2\2\u02c7\u01f2\3\2\2\2\u02c7"+
		"\u01f6\3\2\2\2\u02c7\u01f7\3\2\2\2\u02c7\u01f8\3\2\2\2\u02c7\u0203\3\2"+
		"\2\2\u02c7\u020a\3\2\2\2\u02c7\u0210\3\2\2\2\u02c7\u0211\3\2\2\2\u02c7"+
		"\u0212\3\2\2\2\u02c7\u0213\3\2\2\2\u02c7\u0218\3\2\2\2\u02c7\u0226\3\2"+
		"\2\2\u02c7\u022a\3\2\2\2\u02c7\u022b\3\2\2\2\u02c7\u022f\3\2\2\2\u02c7"+
		"\u0230\3\2\2\2\u02c7\u0231\3\2\2\2\u02c7\u0239\3\2\2\2\u02c7\u0247\3\2"+
		"\2\2\u02c7\u0250\3\2\2\2\u02c7\u0255\3\2\2\2\u02c7\u025c\3\2\2\2\u02c7"+
		"\u025d\3\2\2\2\u02c7\u025e\3\2\2\2\u02c7\u0263\3\2\2\2\u02c7\u0264\3\2"+
		"\2\2\u02c7\u026b\3\2\2\2\u02c7\u026c\3\2\2\2\u02c7\u0273\3\2\2\2\u02c7"+
		"\u0281\3\2\2\2\u02c7\u0282\3\2\2\2\u02c7\u0283\3\2\2\2\u02c7\u0284\3\2"+
		"\2\2\u02c7\u0285\3\2\2\2\u02c7\u0293\3\2\2\2\u02c7\u0294\3\2\2\2\u02c7"+
		"\u0298\3\2\2\2\u02c7\u0299\3\2\2\2\u02c7\u029d\3\2\2\2\u02c7\u02a1\3\2"+
		"\2\2\u02c7\u02ac\3\2\2\2\u02c7\u02b0\3\2\2\2\u02c7\u02b8\3\2\2\2\u02c7"+
		"\u02bd\3\2\2\2\u02c7\u02c1\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2"+
		"\2\2\u02c8\13\3\2\2\2\u02c9\u02ca\tj\2\2\u02ca\u02cb\7\u0089\2\2\u02cb"+
		"\u02d5\5\16\b\2\u02cc\u02ce\7\u01aa\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02d3\7\u019e\2\2\u02d2\u02cd\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d6\5H%\2\u02d5\u02d2\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d8\7\u014b\2\2\u02d8\r\3\2\2\2\u02d9\u02da\tk"+
		"\2\2\u02da\17\3\2\2\2\u02db\u02e8\7\u018b\2\2\u02dc\u02dd\7\u018b\2\2"+
		"\u02dd\u02de\7\u0089\2\2\u02de\u02df\tl\2\2\u02df\u02e8\7\u014b\2\2\u02e0"+
		"\u02e8\7\u011e\2\2\u02e1\u02e8\7\u0139\2\2\u02e2\u02e8\7\u00f0\2\2\u02e3"+
		"\u02e8\7\32\2\2\u02e4\u02e8\7\u00a1\2\2\u02e5\u02e8\7\u0094\2\2\u02e6"+
		"\u02e8\7\13\2\2\u02e7\u02db\3\2\2\2\u02e7\u02dc\3\2\2\2\u02e7\u02e0\3"+
		"\2\2\2\u02e7\u02e1\3\2\2\2\u02e7\u02e2\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e7"+
		"\u02e4\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8\21\3\2\2"+
		"\2\u02e9\u02ea\tm\2\2\u02ea\23\3\2\2\2\u02eb\u02ec\tn\2\2\u02ec\25\3\2"+
		"\2\2\u02ed\u0300\7J\2\2\u02ee\u0300\7\u00be\2\2\u02ef\u0300\7i\2\2\u02f0"+
		"\u0300\7\u00d3\2\2\u02f1\u02f5\to\2\2\u02f2\u02f3\7\u0089\2\2\u02f3\u02f4"+
		"\tp\2\2\u02f4\u02f6\7\u014b\2\2\u02f5\u02f2\3\2\2\2\u02f5\u02f6\3\2\2"+
		"\2\u02f6\u0300\3\2\2\2\u02f7\u0300\7\u00f8\2\2\u02f8\u0300\7\u00f9\2\2"+
		"\u02f9\u0300\7\u0162\2\2\u02fa\u0300\7\u0157\2\2\u02fb\u0300\7\u00ff\2"+
		"\2\u02fc\u0300\7\u0100\2\2\u02fd\u0300\7O\2\2\u02fe\u0300\7\u00c2\2\2"+
		"\u02ff\u02ed\3\2\2\2\u02ff\u02ee\3\2\2\2\u02ff\u02ef\3\2\2\2\u02ff\u02f0"+
		"\3\2\2\2\u02ff\u02f1\3\2\2\2\u02ff\u02f7\3\2\2\2\u02ff\u02f8\3\2\2\2\u02ff"+
		"\u02f9\3\2\2\2\u02ff\u02fa\3\2\2\2\u02ff\u02fb\3\2\2\2\u02ff\u02fc\3\2"+
		"\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\27\3\2\2\2\u0301\u0305"+
		"\7\3\2\2\u0302\u0304\7\u01ac\2\2\u0303\u0302\3\2\2\2\u0304\u0307\3\2\2"+
		"\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0305"+
		"\3\2\2\2\u0308\u0309\7\u01a7\2\2\u0309\31\3\2\2\2\u030a\u030b\7Y\2\2\u030b"+
		"\u030e\7!\2\2\u030c\u030f\5@!\2\u030d\u030f\5\30\r\2\u030e\u030c\3\2\2"+
		"\2\u030e\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\7T\2\2\u0313\u0315\7\u01a0\2"+
		"\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\33\3\2\2\2\u0316\u031d"+
		"\7Z\2\2\u0317\u0319\7\u01da\2\2\u0318\u0317\3\2\2\2\u0319\u031a\3\2\2"+
		"\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031e"+
		"\5\30\r\2\u031d\u0318\3\2\2\2\u031d\u031c\3\2\2\2\u031e\u031f\3\2\2\2"+
		"\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323"+
		"\7T\2\2\u0322\u0324\7\u01a0\2\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2"+
		"\2\u0324\35\3\2\2\2\u0325\u0326\7Y\2\2\u0326\u0329\7\u015e\2\2\u0327\u032a"+
		"\5@!\2\u0328\u032a\5\30\r\2\u0329\u0327\3\2\2\2\u0329\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032d\u032f\7T\2\2\u032e\u0330\7\u01a0\2\2\u032f\u032e\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\37\3\2\2\2\u0331\u0332\7(\2\2\u0332\u033f\5\"\22"+
		"\2\u0333\u0335\7\u01a7\2\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u033b\3\2\2\2\u0338\u0336\3\2"+
		"\2\2\u0339\u033c\5&\24\2\u033a\u033c\7\u016c\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033a\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u0336\3\2\2\2\u033e\u0341\3\2"+
		"\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0345\3\2\2\2\u0341"+
		"\u033f\3\2\2\2\u0342\u0344\7\u01a7\2\2\u0343\u0342\3\2\2\2\u0344\u0347"+
		"\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0348\u0349\7\u01a0\2\2\u0349!\3\2\2\2\u034a\u034e\5H%"+
		"\2\u034b\u034e\5F$\2\u034c\u034e\5J&\2\u034d\u034a\3\2\2\2\u034d\u034b"+
		"\3\2\2\2\u034d\u034c\3\2\2\2\u034e\u035d\3\2\2\2\u034f\u0351\7\u01a7\2"+
		"\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0359\tq\2\2\u0356"+
		"\u0358\7\u01a7\2\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u0359\3\2\2\2\u035c"+
		"\u035e\5$\23\2\u035d\u0352\3\2\2\2\u035d\u035e\3\2\2\2\u035e#\3\2\2\2"+
		"\u035f\u0362\5H%\2\u0360\u0362\5F$\2\u0361\u035f\3\2\2\2\u0361\u0360\3"+
		"\2\2\2\u0362%\3\2\2\2\u0363\u0367\7\u0149\2\2\u0364\u0366\7\u01a7\2\2"+
		"\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u0373\5.\30\2\u036b"+
		"\u036d\7\u01a7\2\2\u036c\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\5.\30\2\u0371"+
		"\u036c\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2"+
		"\2\2\u0374\'\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u037b\5*\26\2\u0377\u037a"+
		"\5 \21\2\u0378\u037a\5@!\2\u0379\u0377\3\2\2\2\u0379\u0378\3\2\2\2\u037a"+
		"\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037f\3\2"+
		"\2\2\u037d\u037b\3\2\2\2\u037e\u0380\5,\27\2\u037f\u037e\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380)\3\2\2\2\u0381\u0389\7\u0148\2\2\u0382\u0384\7\u01a7"+
		"\2\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385"+
		"\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u038a\5."+
		"\30\2\u0389\u0385\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0389\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u0390\3\2\2\2\u038d\u038f\7\u01a7\2\2\u038e\u038d"+
		"\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\7\u01a0\2\2\u0394+\3\2"+
		"\2\2\u0395\u0396\7\u0148\2\2\u0396\u039a\7\u012b\2\2\u0397\u0399\7\u01a7"+
		"\2\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7\u01a0"+
		"\2\2\u039e-\3\2\2\2\u039f\u03a1\tr\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a6\5\64\33\2\u03a3\u03a5\7\u01a7"+
		"\2\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03ad\7\36"+
		"\2\2\u03aa\u03ac\7\u01a7\2\2\u03ab\u03aa\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03ad\3\2"+
		"\2\2\u03b0\u03b8\5\66\34\2\u03b1\u03b3\7\u01a7\2\2\u03b2\u03b1\3\2\2\2"+
		"\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7"+
		"\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03b9\5\60\31\2\u03b8\u03b4\3\2\2\2"+
		"\u03b8\u03b9\3\2\2\2\u03b9\u03c1\3\2\2\2\u03ba\u03bc\7\u01a7\2\2\u03bb"+
		"\u03ba\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2"+
		"\2\2\u03be\u03c0\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c2\5\62\32\2\u03c1"+
		"\u03bd\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2/\3\2\2\2\u03c3\u03c7\tq\2\2\u03c4"+
		"\u03c6\7\u01a7\2\2\u03c5\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cc\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca"+
		"\u03cd\5H%\2\u03cb\u03cd\5F$\2\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2"+
		"\u03cd\61\3\2\2\2\u03ce\u03d2\7\u012d\2\2\u03cf\u03d1\7\u01a7\2\2\u03d0"+
		"\u03cf\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2"+
		"\2\2\u03d3\u03d7\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d8\5H%\2\u03d6\u03d8"+
		"\5F$\2\u03d7\u03d5\3\2\2\2\u03d7\u03d6\3\2\2\2\u03d8\63\3\2\2\2\u03d9"+
		"\u03de\5H%\2\u03da\u03de\5F$\2\u03db\u03de\5> \2\u03dc\u03de\5D#\2\u03dd"+
		"\u03d9\3\2\2\2\u03dd\u03da\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03dc\3\2"+
		"\2\2\u03de\65\3\2\2\2\u03df\u03e4\5H%\2\u03e0\u03e4\5F$\2\u03e1\u03e4"+
		"\5> \2\u03e2\u03e4\5D#\2\u03e3\u03df\3\2\2\2\u03e3\u03e0\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\67\3\2\2\2\u03e5\u03e7\7N\2\2"+
		"\u03e6\u03e8\7\u01a0\2\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"9\3\2\2\2\u03e9\u03eb\ts\2\2\u03ea\u03ec\7\u01a0\2\2\u03eb\u03ea\3\2\2"+
		"\2\u03eb\u03ec\3\2\2\2\u03ec;\3\2\2\2\u03ed\u03ee\7\u0173\2\2\u03ee\u03f0"+
		"\5H%\2\u03ef\u03f1\7\u01a0\2\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2"+
		"\u03f1=\3\2\2\2\u03f2\u03f4\7\u01a1\2\2\u03f3\u03f5\5@!\2\u03f4\u03f3"+
		"\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\7\u01a1\2"+
		"\2\u03f7?\3\2\2\2\u03f8\u03fb\5D#\2\u03f9\u03fb\7\u01a7\2\2\u03fa\u03f8"+
		"\3\2\2\2\u03fa\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fdA\3\2\2\2\u03fe\u0403\5D#\2\u03ff\u0403\7(\2\2\u0400"+
		"\u0403\7\u0148\2\2\u0401\u0403\7\u01a7\2\2\u0402\u03fe\3\2\2\2\u0402\u03ff"+
		"\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405C\3\2\2\2\u0406\u040f\5F$\2\u0407"+
		"\u040f\5H%\2\u0408\u040f\5J&\2\u0409\u040f\7\u01a6\2\2\u040a\u040f\7\u01aa"+
		"\2\2\u040b\u040f\7\u01a0\2\2\u040c\u040f\7\u0089\2\2\u040d\u040f\7\u014b"+
		"\2\2\u040e\u0406\3\2\2\2\u040e\u0407\3\2\2\2\u040e\u0408\3\2\2\2\u040e"+
		"\u0409\3\2\2\2\u040e\u040a\3\2\2\2\u040e\u040b\3\2\2\2\u040e\u040c\3\2"+
		"\2\2\u040e\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u040e\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0422\3\2\2\2\u0412\u0413\7\u01a7\2\2\u0413\u041c"+
		"\7\4\2\2\u0414\u041d\5F$\2\u0415\u041d\5H%\2\u0416\u041d\5J&\2\u0417\u041d"+
		"\7\u01a6\2\2\u0418\u041d\7\u01aa\2\2\u0419\u041d\7\u01a0\2\2\u041a\u041d"+
		"\7\u0089\2\2\u041b\u041d\7\u014b\2\2\u041c\u0414\3\2\2\2\u041c\u0415\3"+
		"\2\2\2\u041c\u0416\3\2\2\2\u041c\u0417\3\2\2\2\u041c\u0418\3\2\2\2\u041c"+
		"\u0419\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041b\3\2\2\2\u041d\u041e\3\2"+
		"\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420"+
		"\u0412\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2"+
		"\2\2\u0423E\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0428\7\u01a4\2\2\u0426"+
		"\u0428\5\u0088E\2\u0427\u0425\3\2\2\2\u0427\u0426\3\2\2\2\u0428G\3\2\2"+
		"\2\u0429\u042a\tt\2\2\u042aI\3\2\2\2\u042b\u042c\7\u01a5\2\2\u042cK\3"+
		"\2\2\2\u042d\u0430\5N(\2\u042e\u0430\5P)\2\u042f\u042d\3\2\2\2\u042f\u042e"+
		"\3\2\2\2\u0430M\3\2\2\2\u0431\u0437\5R*\2\u0432\u0437\5T+\2\u0433\u0437"+
		"\5V,\2\u0434\u0437\5Z.\2\u0435\u0437\5\\/\2\u0436\u0431\3\2\2\2\u0436"+
		"\u0432\3\2\2\2\u0436\u0433\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0435\3\2"+
		"\2\2\u0437O\3\2\2\2\u0438\u0440\5d\63\2\u0439\u0440\5n8\2\u043a\u0440"+
		"\5p9\2\u043b\u0440\5r:\2\u043c\u0440\5v<\2\u043d\u0440\5x=\2\u043e\u0440"+
		"\5z>\2\u043f\u0438\3\2\2\2\u043f\u0439\3\2\2\2\u043f\u043a\3\2\2\2\u043f"+
		"\u043b\3\2\2\2\u043f\u043c\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u043e\3\2"+
		"\2\2\u0440Q\3\2\2\2\u0441\u0442\7\u019f\2\2\u0442\u0444\tu\2\2\u0443\u0445"+
		"\tv\2\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445S\3\2\2\2\u0446\u0447"+
		"\7\u019f\2\2\u0447\u0448\7r\2\2\u0448\u0449\tw\2\2\u0449U\3\2\2\2\u044a"+
		"\u044b\7\31\2\2\u044b\u044c\5X-\2\u044cW\3\2\2\2\u044d\u0451\5H%\2\u044e"+
		"\u0451\5F$\2\u044f\u0451\5J&\2\u0450\u044d\3\2\2\2\u0450\u044e\3\2\2\2"+
		"\u0450\u044f\3\2\2\2\u0451Y\3\2\2\2\u0452\u0453\7s\2\2\u0453\u0454\7\u01a3"+
		"\2\2\u0454[\3\2\2\2\u0455\u0456\7<\2\2\u0456\u0457\5b\62\2\u0457]\3\2"+
		"\2\2\u0458\u0459\5`\61\2\u0459\u045a\7\u01b4\2\2\u045a\u045b\5`\61\2\u045b"+
		"_\3\2\2\2\u045c\u045d\7\u01a3\2\2\u045da\3\2\2\2\u045e\u0461\5`\61\2\u045f"+
		"\u0461\5^\60\2\u0460\u045e\3\2\2\2\u0460\u045f\3\2\2\2\u0461\u0469\3\2"+
		"\2\2\u0462\u0465\7\u019e\2\2\u0463\u0466\5`\61\2\u0464\u0466\5^\60\2\u0465"+
		"\u0463\3\2\2\2\u0465\u0464\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u0462\3\2"+
		"\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"c\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046d\7\u019f\2\2\u046d\u046e\7;\2"+
		"\2\u046e\u0470\7\u01a4\2\2\u046f\u0471\7\u01ba\2\2\u0470\u046f\3\2\2\2"+
		"\u0470\u0471\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0475\5f\64\2\u0473\u0475"+
		"\7\u01c8\2\2\u0474\u0472\3\2\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2"+
		"\2\u0475\u0477\3\2\2\2\u0476\u0478\7\u01cf\2\2\u0477\u0476\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478e\3\2\2\2\u0479\u047e\5H%\2\u047a\u047e\5h\65\2\u047b"+
		"\u047e\7\u01a4\2\2\u047c\u047e\7\u01d0\2\2\u047d\u0479\3\2\2\2\u047d\u047a"+
		"\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047c\3\2\2\2\u047eg\3\2\2\2\u047f"+
		"\u0481\7\u0089\2\2\u0480\u047f\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480"+
		"\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0482\3\2\2\2\u0485"+
		"\u0486\5j\66\2\u0486\u0487\5l\67\2\u0487\u0489\3\2\2\2\u0488\u0482\3\2"+
		"\2\2\u0489\u048a\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u049d\3\2\2\2\u048c\u048e\7\u0089\2\2\u048d\u048c\3\2\2\2\u048e\u0491"+
		"\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0492\3\2\2\2\u0491"+
		"\u048f\3\2\2\2\u0492\u0496\5j\66\2\u0493\u0495\7\u014b\2\2\u0494\u0493"+
		"\3\2\2\2\u0495\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u0499\3\2\2\2\u0498\u0496\3\2\2\2\u0499\u049a\5l\67\2\u049a\u049c\3\2"+
		"\2\2\u049b\u048f\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a4\5j"+
		"\66\2\u04a1\u04a3\7\u014b\2\2\u04a2\u04a1\3\2\2\2\u04a3\u04a6\3\2\2\2"+
		"\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5i\3\2\2\2\u04a6\u04a4\3"+
		"\2\2\2\u04a7\u04a8\tx\2\2\u04a8k\3\2\2\2\u04a9\u04aa\ty\2\2\u04aam\3\2"+
		"\2\2\u04ab\u04ac\7\u019f\2\2\u04ac\u04ad\7\u01c7\2\2\u04ad\u04ae\5~@\2"+
		"\u04aeo\3\2\2\2\u04af\u04b0\7\u019f\2\2\u04b0\u04b1\7\u01c1\2\2\u04b1"+
		"q\3\2\2\2\u04b2\u04b3\7\u019f\2\2\u04b3\u04b4\7\u01c3\2\2\u04b4s\3\2\2"+
		"\2\u04b5\u04b9\5h\65\2\u04b6\u04b9\7\u01a4\2\2\u04b7\u04b9\5H%\2\u04b8"+
		"\u04b5\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9u\3\2\2\2"+
		"\u04ba\u04bb\7\u019f\2\2\u04bb\u04be\7\u01c5\2\2\u04bc\u04bf\7\u01d6\2"+
		"\2\u04bd\u04bf\5t;\2\u04be\u04bc\3\2\2\2\u04be\u04bd\3\2\2\2\u04bfw\3"+
		"\2\2\2\u04c0\u04c1\7\u019f\2\2\u04c1\u04c9\7\u01d7\2\2\u04c2\u04c5\5t"+
		";\2\u04c3\u04c4\tz\2\2\u04c4\u04c6\5t;\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04ca\3\2\2\2\u04c7\u04ca\5~@\2\u04c8\u04ca\7\u01ce\2\2"+
		"\u04c9\u04c2\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04c8\3\2\2\2\u04cay\3"+
		"\2\2\2\u04cb\u04cc\7\u019f\2\2\u04cc\u04cd\7\u01c2\2\2\u04cd{\3\2\2\2"+
		"\u04ce\u04d0\7\u01ca\2\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0"+
		"\u04d2\3\2\2\2\u04d1\u04d3\7\u01cc\2\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3"+
		"\3\2\2\2\u04d3\u04ef\3\2\2\2\u04d4\u04f0\7\u01c4\2\2\u04d5\u04f0\7\u01b0"+
		"\2\2\u04d6\u04f0\7\u01b6\2\2\u04d7\u04f0\7\u01b2\2\2\u04d8\u04da\7\u01c6"+
		"\2\2\u04d9\u04db\7\u01d2\2\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04f0\3\2\2\2\u04dc\u04f0\7\u01b1\2\2\u04dd\u04df\7\u01cb\2\2\u04de\u04e0"+
		"\7\u01d2\2\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04f0\3\2\2"+
		"\2\u04e1\u04f0\7\u01b8\2\2\u04e2\u04e4\7\u01cb\2\2\u04e3\u04e5\7\u01d2"+
		"\2\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u04e7\7\u01cd\2\2\u04e7\u04f0\7\u01c4\2\2\u04e8\u04f0\7\u01b7\2\2\u04e9"+
		"\u04eb\7\u01c6\2\2\u04ea\u04ec\7\u01d2\2\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7\u01cd\2\2\u04ee\u04f0\7\u01c4"+
		"\2\2\u04ef\u04d4\3\2\2\2\u04ef\u04d5\3\2\2\2\u04ef\u04d6\3\2\2\2\u04ef"+
		"\u04d7\3\2\2\2\u04ef\u04d8\3\2\2\2\u04ef\u04dc\3\2\2\2\u04ef\u04dd\3\2"+
		"\2\2\u04ef\u04e1\3\2\2\2\u04ef\u04e2\3\2\2\2\u04ef\u04e8\3\2\2\2\u04ef"+
		"\u04e9\3\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04f3\7\u01d5\2\2\u04f2\u04f1"+
		"\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3}\3\2\2\2\u04f4\u04f6\7\u0089\2\2\u04f5"+
		"\u04f4\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2"+
		"\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u050b\5\u0080A\2\u04fb"+
		"\u04ff\t{\2\2\u04fc\u04fe\7\u0089\2\2\u04fd\u04fc\3\2\2\2\u04fe\u0501"+
		"\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501"+
		"\u04ff\3\2\2\2\u0502\u0506\5\u0080A\2\u0503\u0505\7\u014b\2\2\u0504\u0503"+
		"\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0509\u04fb\3\2\2\2\u050a\u050d\3\2"+
		"\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0511\3\2\2\2\u050d"+
		"\u050b\3\2\2\2\u050e\u0510\7\u014b\2\2\u050f\u050e\3\2\2\2\u0510\u0513"+
		"\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0515\3\2\2\2\u0513"+
		"\u0511\3\2\2\2\u0514\u04f7\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0514\3\2"+
		"\2\2\u0516\u0517\3\2\2\2\u0517\177\3\2\2\2\u0518\u051c\5\u0082B\2\u0519"+
		"\u051c\5\u0086D\2\u051a\u051c\5\u0084C\2\u051b\u0518\3\2\2\2\u051b\u0519"+
		"\3\2\2\2\u051b\u051a\3\2\2\2\u051c\u0081\3\2\2\2\u051d\u0521\5h\65\2\u051e"+
		"\u0521\7\u01a4\2\2\u051f\u0521\5H%\2\u0520\u051d\3\2\2\2\u0520\u051e\3"+
		"\2\2\2\u0520\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0526\5|?\2\u0523"+
		"\u0527\5h\65\2\u0524\u0527\7\u01a4\2\2\u0525\u0527\5H%\2\u0526\u0523\3"+
		"\2\2\2\u0526\u0524\3\2\2\2\u0526\u0525\3\2\2\2\u0527\u0083\3\2\2\2\u0528"+
		"\u0529\7\u01a4\2\2\u0529\u0085\3\2\2\2\u052a\u052c\7\u01a4\2\2\u052b\u052d"+
		"\7\u01ca\2\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2"+
		"\2\u052e\u0530\7\u01cc\2\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u0532\7\u01be\2\2\u0532\u0087\3\2\2\2\u0533\u06c2"+
		"\7\13\2\2\u0534\u06c2\7\f\2\2\u0535\u06c2\7\r\2\2\u0536\u06c2\7\16\2\2"+
		"\u0537\u06c2\7\17\2\2\u0538\u06c2\7\20\2\2\u0539\u06c2\7\21\2\2\u053a"+
		"\u06c2\7\22\2\2\u053b\u06c2\7\23\2\2\u053c\u06c2\7\24\2\2\u053d\u06c2"+
		"\7\25\2\2\u053e\u06c2\7\26\2\2\u053f\u06c2\7\27\2\2\u0540\u06c2\7\30\2"+
		"\2\u0541\u06c2\7\32\2\2\u0542\u06c2\7\33\2\2\u0543\u06c2\7\34\2\2\u0544"+
		"\u06c2\7\35\2\2\u0545\u06c2\7\36\2\2\u0546\u06c2\7 \2\2\u0547\u06c2\7"+
		"!\2\2\u0548\u06c2\7\"\2\2\u0549\u06c2\7#\2\2\u054a\u06c2\7$\2\2\u054b"+
		"\u06c2\7%\2\2\u054c\u06c2\7\u019e\2\2\u054d\u06c2\7&\2\2\u054e\u06c2\7"+
		"\'\2\2\u054f\u06c2\7)\2\2\u0550\u06c2\7*\2\2\u0551\u06c2\7+\2\2\u0552"+
		"\u06c2\7,\2\2\u0553\u06c2\7-\2\2\u0554\u06c2\7.\2\2\u0555\u06c2\7/\2\2"+
		"\u0556\u06c2\7\60\2\2\u0557\u06c2\7\61\2\2\u0558\u06c2\7\62\2\2\u0559"+
		"\u06c2\7\63\2\2\u055a\u06c2\7\64\2\2\u055b\u06c2\7\65\2\2\u055c\u06c2"+
		"\7\66\2\2\u055d\u06c2\7\67\2\2\u055e\u06c2\78\2\2\u055f\u06c2\79\2\2\u0560"+
		"\u06c2\7:\2\2\u0561\u06c2\7;\2\2\u0562\u06c2\7>\2\2\u0563\u06c2\7?\2\2"+
		"\u0564\u06c2\7A\2\2\u0565\u06c2\7B\2\2\u0566\u06c2\7C\2\2\u0567\u06c2"+
		"\7D\2\2\u0568\u06c2\7E\2\2\u0569\u06c2\7F\2\2\u056a\u06c2\7G\2\2\u056b"+
		"\u06c2\7H\2\2\u056c\u06c2\7I\2\2\u056d\u06c2\7K\2\2\u056e\u06c2\7L\2\2"+
		"\u056f\u06c2\7J\2\2\u0570\u06c2\7M\2\2\u0571\u06c2\7N\2\2\u0572\u06c2"+
		"\7O\2\2\u0573\u06c2\7P\2\2\u0574\u06c2\7Q\2\2\u0575\u06c2\7R\2\2\u0576"+
		"\u06c2\7S\2\2\u0577\u06c2\7U\2\2\u0578\u06c2\7W\2\2\u0579\u06c2\7V\2\2"+
		"\u057a\u06c2\7X\2\2\u057b\u06c2\7[\2\2\u057c\u06c2\7\\\2\2\u057d\u06c2"+
		"\7]\2\2\u057e\u06c2\7^\2\2\u057f\u06c2\7_\2\2\u0580\u06c2\7a\2\2\u0581"+
		"\u06c2\7b\2\2\u0582\u06c2\7d\2\2\u0583\u06c2\7c\2\2\u0584\u06c2\7e\2\2"+
		"\u0585\u06c2\7f\2\2\u0586\u06c2\7g\2\2\u0587\u06c2\7h\2\2\u0588\u06c2"+
		"\7i\2\2\u0589\u06c2\7m\2\2\u058a\u06c2\7n\2\2\u058b\u06c2\7j\2\2\u058c"+
		"\u06c2\7o\2\2\u058d\u06c2\7p\2\2\u058e\u06c2\7q\2\2\u058f\u06c2\7t\2\2"+
		"\u0590\u06c2\7u\2\2\u0591\u06c2\7v\2\2\u0592\u06c2\7w\2\2\u0593\u06c2"+
		"\7x\2\2\u0594\u06c2\7y\2\2\u0595\u06c2\7z\2\2\u0596\u06c2\7{\2\2\u0597"+
		"\u06c2\7~\2\2\u0598\u06c2\7\177\2\2\u0599\u06c2\7\u0080\2\2\u059a\u06c2"+
		"\7\u0081\2\2\u059b\u06c2\7\u0082\2\2\u059c\u06c2\7\u0083\2\2\u059d\u06c2"+
		"\7\u0084\2\2\u059e\u06c2\7\u0085\2\2\u059f\u06c2\7\u0086\2\2\u05a0\u06c2"+
		"\7\u0087\2\2\u05a1\u06c2\7\u0088\2\2\u05a2\u06c2\7\u008a\2\2\u05a3\u06c2"+
		"\7\u008b\2\2\u05a4\u06c2\7\u008c\2\2\u05a5\u06c2\7\u008d\2\2\u05a6\u06c2"+
		"\7\u008e\2\2\u05a7\u06c2\7\u0093\2\2\u05a8\u06c2\7\u008f\2\2\u05a9\u06c2"+
		"\7\u0090\2\2\u05aa\u06c2\7\u0091\2\2\u05ab\u06c2\7\u0092\2\2\u05ac\u06c2"+
		"\7\u0094\2\2\u05ad\u06c2\7\u0095\2\2\u05ae\u06c2\7\u0096\2\2\u05af\u06c2"+
		"\7\u0097\2\2\u05b0\u06c2\7\u0098\2\2\u05b1\u06c2\7\u0099\2\2\u05b2\u06c2"+
		"\7\u009a\2\2\u05b3\u06c2\7\u009b\2\2\u05b4\u06c2\7\u009c\2\2\u05b5\u06c2"+
		"\7\u009d\2\2\u05b6\u06c2\7\u009e\2\2\u05b7\u06c2\7\u009f\2\2\u05b8\u06c2"+
		"\7\u00a0\2\2\u05b9\u06c2\7\u00a1\2\2\u05ba\u06c2\7\u00a2\2\2\u05bb\u06c2"+
		"\7\u0099\2\2\u05bc\u06c2\7\u00a3\2\2\u05bd\u06c2\7\u00a4\2\2\u05be\u06c2"+
		"\7\u00a5\2\2\u05bf\u06c2\7\u00a6\2\2\u05c0\u06c2\7\u00a7\2\2\u05c1\u06c2"+
		"\7\u00a8\2\2\u05c2\u06c2\7\u00a9\2\2\u05c3\u06c2\7\u00aa\2\2\u05c4\u06c2"+
		"\7\u00ab\2\2\u05c5\u06c2\7\u00ac\2\2\u05c6\u06c2\7\u00ad\2\2\u05c7\u06c2"+
		"\7\u00ae\2\2\u05c8\u06c2\7\u00af\2\2\u05c9\u06c2\7\u00b0\2\2\u05ca\u06c2"+
		"\7\u00b1\2\2\u05cb\u06c2\7\u00b2\2\2\u05cc\u06c2\7\u00b3\2\2\u05cd\u06c2"+
		"\7\u00b4\2\2\u05ce\u06c2\7\u00b6\2\2\u05cf\u06c2\7\u00b5\2\2\u05d0\u06c2"+
		"\7\u00b6\2\2\u05d1\u06c2\7\u00b7\2\2\u05d2\u06c2\7\u00b8\2\2\u05d3\u06c2"+
		"\7\u00b9\2\2\u05d4\u06c2\7\u00ba\2\2\u05d5\u06c2\7\u00bb\2\2\u05d6\u06c2"+
		"\7\u00bc\2\2\u05d7\u06c2\7\u00bd\2\2\u05d8\u06c2\7\u00bf\2\2\u05d9\u06c2"+
		"\7\u00c0\2\2\u05da\u06c2\7\u00be\2\2\u05db\u06c2\7\u00c1\2\2\u05dc\u06c2"+
		"\7\u00c2\2\2\u05dd\u06c2\7\u00c3\2\2\u05de\u06c2\7\u00c4\2\2\u05df\u06c2"+
		"\7\u00c5\2\2\u05e0\u06c2\7\u00c6\2\2\u05e1\u06c2\7\u00c7\2\2\u05e2\u06c2"+
		"\7\u00c8\2\2\u05e3\u06c2\7\u00c9\2\2\u05e4\u06c2\7\u00ca\2\2\u05e5\u06c2"+
		"\7\u00cb\2\2\u05e6\u06c2\7\u00cc\2\2\u05e7\u06c2\7\u00cd\2\2\u05e8\u06c2"+
		"\7\u00ce\2\2\u05e9\u06c2\7\u00cf\2\2\u05ea\u06c2\7\u00d0\2\2\u05eb\u06c2"+
		"\7\u00d1\2\2\u05ec\u06c2\7\u00d2\2\2\u05ed\u06c2\7\u00d3\2\2\u05ee\u06c2"+
		"\7\u00d5\2\2\u05ef\u06c2\7\u00d4\2\2\u05f0\u06c2\7\u00d5\2\2\u05f1\u06c2"+
		"\7\u00d6\2\2\u05f2\u06c2\7\u00d7\2\2\u05f3\u06c2\7\u00d8\2\2\u05f4\u06c2"+
		"\7\u00d9\2\2\u05f5\u06c2\7\u00da\2\2\u05f6\u06c2\7\u00db\2\2\u05f7\u06c2"+
		"\7\u00dc\2\2\u05f8\u06c2\7\u00dd\2\2\u05f9\u06c2\7\u00de\2\2\u05fa\u06c2"+
		"\7\u00df\2\2\u05fb\u06c2\7\u00e0\2\2\u05fc\u06c2\7\u00e1\2\2\u05fd\u06c2"+
		"\7\u00e2\2\2\u05fe\u06c2\7\u00e3\2\2\u05ff\u06c2\7\u00e4\2\2\u0600\u06c2"+
		"\7\u00e5\2\2\u0601\u06c2\7\u00e6\2\2\u0602\u06c2\7\u00ea\2\2\u0603\u06c2"+
		"\7\u00e7\2\2\u0604\u06c2\7\u00e8\2\2\u0605\u06c2\7\u00e9\2\2\u0606\u06c2"+
		"\7\u00eb\2\2\u0607\u06c2\7\u00ec\2\2\u0608\u06c2\7\u00ed\2\2\u0609\u06c2"+
		"\7\u00ee\2\2\u060a\u06c2\7\u00ef\2\2\u060b\u06c2\7\u00f0\2\2\u060c\u06c2"+
		"\7\u00f1\2\2\u060d\u06c2\7\u00f2\2\2\u060e\u06c2\7\u00f3\2\2\u060f\u06c2"+
		"\7\u00f4\2\2\u0610\u06c2\7\u00f5\2\2\u0611\u06c2\7\u00f6\2\2\u0612\u06c2"+
		"\7\u00f7\2\2\u0613\u06c2\7\u00f8\2\2\u0614\u06c2\7\u00f9\2\2\u0615\u06c2"+
		"\7\u00fa\2\2\u0616\u06c2\7\u0109\2\2\u0617\u06c2\7\u00fb\2\2\u0618\u06c2"+
		"\7\u00fc\2\2\u0619\u06c2\7\u00fd\2\2\u061a\u06c2\7\u00fe\2\2\u061b\u06c2"+
		"\7\u00ff\2\2\u061c\u06c2\7\u0101\2\2\u061d\u06c2\7\u0100\2\2\u061e\u06c2"+
		"\7\u0102\2\2\u061f\u06c2\7\u0103\2\2\u0620\u06c2\7\u0104\2\2\u0621\u06c2"+
		"\7\u0105\2\2\u0622\u06c2\7\u0106\2\2\u0623\u06c2\7\u0107\2\2\u0624\u06c2"+
		"\7\u0108\2\2\u0625\u06c2\7\u010a\2\2\u0626\u06c2\7\u010b\2\2\u0627\u06c2"+
		"\7\u010c\2\2\u0628\u06c2\7\u010d\2\2\u0629\u06c2\7\u010e\2\2\u062a\u06c2"+
		"\7\u010f\2\2\u062b\u06c2\7\u0110\2\2\u062c\u06c2\7\u0111\2\2\u062d\u06c2"+
		"\7\u0112\2\2\u062e\u06c2\7\u0113\2\2\u062f\u06c2\7\u0114\2\2\u0630\u06c2"+
		"\7\u0115\2\2\u0631\u06c2\7\u0116\2\2\u0632\u06c2\7\u0117\2\2\u0633\u06c2"+
		"\7\u0119\2\2\u0634\u06c2\7\u011a\2\2\u0635\u06c2\7\u011b\2\2\u0636\u06c2"+
		"\7\u011c\2\2\u0637\u06c2\7\u011d\2\2\u0638\u06c2\7\u011e\2\2\u0639\u06c2"+
		"\7\u011f\2\2\u063a\u06c2\7\u0120\2\2\u063b\u06c2\7\u0122\2\2\u063c\u06c2"+
		"\7\u0123\2\2\u063d\u06c2\7\u0121\2\2\u063e\u06c2\7\u0124\2\2\u063f\u06c2"+
		"\7\u0125\2\2\u0640\u06c2\7\u0126\2\2\u0641\u06c2\7\u0127\2\2\u0642\u06c2"+
		"\7\u0128\2\2\u0643\u06c2\7\u0129\2\2\u0644\u06c2\7\u012d\2\2\u0645\u06c2"+
		"\7\u012a\2\2\u0646\u06c2\7\u012b\2\2\u0647\u06c2\7\u012c\2\2\u0648\u06c2"+
		"\7\u012e\2\2\u0649\u06c2\7\u012f\2\2\u064a\u06c2\7\u0131\2\2\u064b\u06c2"+
		"\7\u0132\2\2\u064c\u06c2\7\u0135\2\2\u064d\u06c2\7\u0130\2\2\u064e\u06c2"+
		"\7\u0133\2\2\u064f\u06c2\7\u0134\2\2\u0650\u06c2\7\u0136\2\2\u0651\u06c2"+
		"\7\u01cd\2\2\u0652\u06c2\7\u0137\2\2\u0653\u06c2\7\u0138\2\2\u0654\u06c2"+
		"\7\u0139\2\2\u0655\u06c2\7\u013a\2\2\u0656\u06c2\7\u013b\2\2\u0657\u06c2"+
		"\7\u013d\2\2\u0658\u06c2\7\u013f\2\2\u0659\u06c2\7\u0140\2\2\u065a\u06c2"+
		"\7\u01b3\2\2\u065b\u06c2\7\u013e\2\2\u065c\u06c2\7\u0141\2\2\u065d\u06c2"+
		"\7\u0143\2\2\u065e\u06c2\7\u0144\2\2\u065f\u06c2\7\u0145\2\2\u0660\u06c2"+
		"\7\u0146\2\2\u0661\u06c2\7\u0147\2\2\u0662\u06c2\7\u0149\2\2\u0663\u06c2"+
		"\7\u014a\2\2\u0664\u06c2\7\u014c\2\2\u0665\u06c2\7\u014f\2\2\u0666\u06c2"+
		"\7\u0150\2\2\u0667\u06c2\7\u014d\2\2\u0668\u06c2\7\u014e\2\2\u0669\u06c2"+
		"\7\u0151\2\2\u066a\u06c2\7\u0152\2\2\u066b\u06c2\7\u0153\2\2\u066c\u06c2"+
		"\7\u0154\2\2\u066d\u06c2\7\u0155\2\2\u066e\u06c2\7\u0156\2\2\u066f\u06c2"+
		"\7\u0162\2\2\u0670\u06c2\7\u0157\2\2\u0671\u06c2\7\u0158\2\2\u0672\u06c2"+
		"\7\u0159\2\2\u0673\u06c2\7\u015a\2\2\u0674\u06c2\7\u015b\2\2\u0675\u06c2"+
		"\7\u015c\2\2\u0676\u06c2\7\u015d\2\2\u0677\u06c2\7\u015e\2\2\u0678\u06c2"+
		"\7\u0163\2\2\u0679\u06c2\7\u0164\2\2\u067a\u06c2\7\u0165\2\2\u067b\u06c2"+
		"\7\u0167\2\2\u067c\u06c2\7\u0166\2\2\u067d\u06c2\7\u01d1\2\2\u067e\u06c2"+
		"\7\u0168\2\2\u067f\u06c2\7\u0169\2\2\u0680\u06c2\7\u016a\2\2\u0681\u06c2"+
		"\7\u016b\2\2\u0682\u06c2\7\u016c\2\2\u0683\u06c2\7\u016d\2\2\u0684\u06c2"+
		"\7\u016e\2\2\u0685\u06c2\7\u016f\2\2\u0686\u06c2\7\u0170\2\2\u0687\u06c2"+
		"\7\u0171\2\2\u0688\u06c2\7\u0172\2\2\u0689\u06c2\7\u0173\2\2\u068a\u06c2"+
		"\7\u01d5\2\2\u068b\u06c2\7\u0175\2\2\u068c\u06c2\7\u01d6\2\2\u068d\u06c2"+
		"\7\u0176\2\2\u068e\u06c2\7\u0177\2\2\u068f\u06c2\7\u0178\2\2\u0690\u06c2"+
		"\7\u0179\2\2\u0691\u06c2\7\u017a\2\2\u0692\u06c2\7\u017b\2\2\u0693\u06c2"+
		"\7\u017c\2\2\u0694\u06c2\7\u017d\2\2\u0695\u06c2\7\u017e\2\2\u0696\u06c2"+
		"\7\u017f\2\2\u0697\u06c2\7\u01d7\2\2\u0698\u06c2\7\u0181\2\2\u0699\u06c2"+
		"\7\u0182\2\2\u069a\u06c2\7\u0183\2\2\u069b\u06c2\7\u0185\2\2\u069c\u06c2"+
		"\7\u0186\2\2\u069d\u06c2\7\u0187\2\2\u069e\u06c2\7\u0188\2\2\u069f\u06c2"+
		"\7\u0189\2\2\u06a0\u06c2\7\u018a\2\2\u06a1\u06c2\7\u018b\2\2\u06a2\u06c2"+
		"\7\u018c\2\2\u06a3\u06c2\7\u018d\2\2\u06a4\u06c2\7\u018e\2\2\u06a5\u06c2"+
		"\7\u018f\2\2\u06a6\u06c2\7\u0190\2\2\u06a7\u06c2\7\u0191\2\2\u06a8\u06c2"+
		"\7\u0192\2\2\u06a9\u06c2\7\u0193\2\2\u06aa\u06c2\7\u0194\2\2\u06ab\u06c2"+
		"\7\u0195\2\2\u06ac\u06c2\7\u0196\2\2\u06ad\u06c2\7\u0197\2\2\u06ae\u06c2"+
		"\7\u0198\2\2\u06af\u06c2\7\u0199\2\2\u06b0\u06c2\7\u019a\2\2\u06b1\u06c2"+
		"\7\u019b\2\2\u06b2\u06c2\7\u019c\2\2\u06b3\u06c2\7@\2\2\u06b4\u06c2\7"+
		"|\2\2\u06b5\u06c2\7\u0174\2\2\u06b6\u06c2\7\31\2\2\u06b7\u06c2\7s\2\2"+
		"\u06b8\u06c2\7<\2\2\u06b9\u06ba\7=\2\2\u06ba\u06be\7\u0089\2\2\u06bb\u06bf"+
		"\5F$\2\u06bc\u06bf\7(\2\2\u06bd\u06bf\7\u0142\2\2\u06be\u06bb\3\2\2\2"+
		"\u06be\u06bc\3\2\2\2\u06be\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2"+
		"\7\u014b\2\2\u06c1\u0533\3\2\2\2\u06c1\u0534\3\2\2\2\u06c1\u0535\3\2\2"+
		"\2\u06c1\u0536\3\2\2\2\u06c1\u0537\3\2\2\2\u06c1\u0538\3\2\2\2\u06c1\u0539"+
		"\3\2\2\2\u06c1\u053a\3\2\2\2\u06c1\u053b\3\2\2\2\u06c1\u053c\3\2\2\2\u06c1"+
		"\u053d\3\2\2\2\u06c1\u053e\3\2\2\2\u06c1\u053f\3\2\2\2\u06c1\u0540\3\2"+
		"\2\2\u06c1\u0541\3\2\2\2\u06c1\u0542\3\2\2\2\u06c1\u0543\3\2\2\2\u06c1"+
		"\u0544\3\2\2\2\u06c1\u0545\3\2\2\2\u06c1\u0546\3\2\2\2\u06c1\u0547\3\2"+
		"\2\2\u06c1\u0548\3\2\2\2\u06c1\u0549\3\2\2\2\u06c1\u054a\3\2\2\2\u06c1"+
		"\u054b\3\2\2\2\u06c1\u054c\3\2\2\2\u06c1\u054d\3\2\2\2\u06c1\u054e\3\2"+
		"\2\2\u06c1\u054f\3\2\2\2\u06c1\u0550\3\2\2\2\u06c1\u0551\3\2\2\2\u06c1"+
		"\u0552\3\2\2\2\u06c1\u0553\3\2\2\2\u06c1\u0554\3\2\2\2\u06c1\u0555\3\2"+
		"\2\2\u06c1\u0556\3\2\2\2\u06c1\u0557\3\2\2\2\u06c1\u0558\3\2\2\2\u06c1"+
		"\u0559\3\2\2\2\u06c1\u055a\3\2\2\2\u06c1\u055b\3\2\2\2\u06c1\u055c\3\2"+
		"\2\2\u06c1\u055d\3\2\2\2\u06c1\u055e\3\2\2\2\u06c1\u055f\3\2\2\2\u06c1"+
		"\u0560\3\2\2\2\u06c1\u0561\3\2\2\2\u06c1\u0562\3\2\2\2\u06c1\u0563\3\2"+
		"\2\2\u06c1\u0564\3\2\2\2\u06c1\u0565\3\2\2\2\u06c1\u0566\3\2\2\2\u06c1"+
		"\u0567\3\2\2\2\u06c1\u0568\3\2\2\2\u06c1\u0569\3\2\2\2\u06c1\u056a\3\2"+
		"\2\2\u06c1\u056b\3\2\2\2\u06c1\u056c\3\2\2\2\u06c1\u056d\3\2\2\2\u06c1"+
		"\u056e\3\2\2\2\u06c1\u056f\3\2\2\2\u06c1\u0570\3\2\2\2\u06c1\u0571\3\2"+
		"\2\2\u06c1\u0572\3\2\2\2\u06c1\u0573\3\2\2\2\u06c1\u0574\3\2\2\2\u06c1"+
		"\u0575\3\2\2\2\u06c1\u0576\3\2\2\2\u06c1\u0577\3\2\2\2\u06c1\u0578\3\2"+
		"\2\2\u06c1\u0579\3\2\2\2\u06c1\u057a\3\2\2\2\u06c1\u057b\3\2\2\2\u06c1"+
		"\u057c\3\2\2\2\u06c1\u057d\3\2\2\2\u06c1\u057e\3\2\2\2\u06c1\u057f\3\2"+
		"\2\2\u06c1\u0580\3\2\2\2\u06c1\u0581\3\2\2\2\u06c1\u0582\3\2\2\2\u06c1"+
		"\u0583\3\2\2\2\u06c1\u0584\3\2\2\2\u06c1\u0585\3\2\2\2\u06c1\u0586\3\2"+
		"\2\2\u06c1\u0587\3\2\2\2\u06c1\u0588\3\2\2\2\u06c1\u0589\3\2\2\2\u06c1"+
		"\u058a\3\2\2\2\u06c1\u058b\3\2\2\2\u06c1\u058c\3\2\2\2\u06c1\u058d\3\2"+
		"\2\2\u06c1\u058e\3\2\2\2\u06c1\u058f\3\2\2\2\u06c1\u0590\3\2\2\2\u06c1"+
		"\u0591\3\2\2\2\u06c1\u0592\3\2\2\2\u06c1\u0593\3\2\2\2\u06c1\u0594\3\2"+
		"\2\2\u06c1\u0595\3\2\2\2\u06c1\u0596\3\2\2\2\u06c1\u0597\3\2\2\2\u06c1"+
		"\u0598\3\2\2\2\u06c1\u0599\3\2\2\2\u06c1\u059a\3\2\2\2\u06c1\u059b\3\2"+
		"\2\2\u06c1\u059c\3\2\2\2\u06c1\u059d\3\2\2\2\u06c1\u059e\3\2\2\2\u06c1"+
		"\u059f\3\2\2\2\u06c1\u05a0\3\2\2\2\u06c1\u05a1\3\2\2\2\u06c1\u05a2\3\2"+
		"\2\2\u06c1\u05a3\3\2\2\2\u06c1\u05a4\3\2\2\2\u06c1\u05a5\3\2\2\2\u06c1"+
		"\u05a6\3\2\2\2\u06c1\u05a7\3\2\2\2\u06c1\u05a8\3\2\2\2\u06c1\u05a9\3\2"+
		"\2\2\u06c1\u05aa\3\2\2\2\u06c1\u05ab\3\2\2\2\u06c1\u05ac\3\2\2\2\u06c1"+
		"\u05ad\3\2\2\2\u06c1\u05ae\3\2\2\2\u06c1\u05af\3\2\2\2\u06c1\u05b0\3\2"+
		"\2\2\u06c1\u05b1\3\2\2\2\u06c1\u05b2\3\2\2\2\u06c1\u05b3\3\2\2\2\u06c1"+
		"\u05b4\3\2\2\2\u06c1\u05b5\3\2\2\2\u06c1\u05b6\3\2\2\2\u06c1\u05b7\3\2"+
		"\2\2\u06c1\u05b8\3\2\2\2\u06c1\u05b9\3\2\2\2\u06c1\u05ba\3\2\2\2\u06c1"+
		"\u05bb\3\2\2\2\u06c1\u05bc\3\2\2\2\u06c1\u05bd\3\2\2\2\u06c1\u05be\3\2"+
		"\2\2\u06c1\u05bf\3\2\2\2\u06c1\u05c0\3\2\2\2\u06c1\u05c1\3\2\2\2\u06c1"+
		"\u05c2\3\2\2\2\u06c1\u05c3\3\2\2\2\u06c1\u05c4\3\2\2\2\u06c1\u05c5\3\2"+
		"\2\2\u06c1\u05c6\3\2\2\2\u06c1\u05c7\3\2\2\2\u06c1\u05c8\3\2\2\2\u06c1"+
		"\u05c9\3\2\2\2\u06c1\u05ca\3\2\2\2\u06c1\u05cb\3\2\2\2\u06c1\u05cc\3\2"+
		"\2\2\u06c1\u05cd\3\2\2\2\u06c1\u05ce\3\2\2\2\u06c1\u05cf\3\2\2\2\u06c1"+
		"\u05d0\3\2\2\2\u06c1\u05d1\3\2\2\2\u06c1\u05d2\3\2\2\2\u06c1\u05d3\3\2"+
		"\2\2\u06c1\u05d4\3\2\2\2\u06c1\u05d5\3\2\2\2\u06c1\u05d6\3\2\2\2\u06c1"+
		"\u05d7\3\2\2\2\u06c1\u05d8\3\2\2\2\u06c1\u05d9\3\2\2\2\u06c1\u05da\3\2"+
		"\2\2\u06c1\u05db\3\2\2\2\u06c1\u05dc\3\2\2\2\u06c1\u05dd\3\2\2\2\u06c1"+
		"\u05de\3\2\2\2\u06c1\u05df\3\2\2\2\u06c1\u05e0\3\2\2\2\u06c1\u05e1\3\2"+
		"\2\2\u06c1\u05e2\3\2\2\2\u06c1\u05e3\3\2\2\2\u06c1\u05e4\3\2\2\2\u06c1"+
		"\u05e5\3\2\2\2\u06c1\u05e6\3\2\2\2\u06c1\u05e7\3\2\2\2\u06c1\u05e8\3\2"+
		"\2\2\u06c1\u05e9\3\2\2\2\u06c1\u05ea\3\2\2\2\u06c1\u05eb\3\2\2\2\u06c1"+
		"\u05ec\3\2\2\2\u06c1\u05ed\3\2\2\2\u06c1\u05ee\3\2\2\2\u06c1\u05ef\3\2"+
		"\2\2\u06c1\u05f0\3\2\2\2\u06c1\u05f1\3\2\2\2\u06c1\u05f2\3\2\2\2\u06c1"+
		"\u05f3\3\2\2\2\u06c1\u05f4\3\2\2\2\u06c1\u05f5\3\2\2\2\u06c1\u05f6\3\2"+
		"\2\2\u06c1\u05f7\3\2\2\2\u06c1\u05f8\3\2\2\2\u06c1\u05f9\3\2\2\2\u06c1"+
		"\u05fa\3\2\2\2\u06c1\u05fb\3\2\2\2\u06c1\u05fc\3\2\2\2\u06c1\u05fd\3\2"+
		"\2\2\u06c1\u05fe\3\2\2\2\u06c1\u05ff\3\2\2\2\u06c1\u0600\3\2\2\2\u06c1"+
		"\u0601\3\2\2\2\u06c1\u0602\3\2\2\2\u06c1\u0603\3\2\2\2\u06c1\u0604\3\2"+
		"\2\2\u06c1\u0605\3\2\2\2\u06c1\u0606\3\2\2\2\u06c1\u0607\3\2\2\2\u06c1"+
		"\u0608\3\2\2\2\u06c1\u0609\3\2\2\2\u06c1\u060a\3\2\2\2\u06c1\u060b\3\2"+
		"\2\2\u06c1\u060c\3\2\2\2\u06c1\u060d\3\2\2\2\u06c1\u060e\3\2\2\2\u06c1"+
		"\u060f\3\2\2\2\u06c1\u0610\3\2\2\2\u06c1\u0611\3\2\2\2\u06c1\u0612\3\2"+
		"\2\2\u06c1\u0613\3\2\2\2\u06c1\u0614\3\2\2\2\u06c1\u0615\3\2\2\2\u06c1"+
		"\u0616\3\2\2\2\u06c1\u0617\3\2\2\2\u06c1\u0618\3\2\2\2\u06c1\u0619\3\2"+
		"\2\2\u06c1\u061a\3\2\2\2\u06c1\u061b\3\2\2\2\u06c1\u061c\3\2\2\2\u06c1"+
		"\u061d\3\2\2\2\u06c1\u061e\3\2\2\2\u06c1\u061f\3\2\2\2\u06c1\u0620\3\2"+
		"\2\2\u06c1\u0621\3\2\2\2\u06c1\u0622\3\2\2\2\u06c1\u0623\3\2\2\2\u06c1"+
		"\u0624\3\2\2\2\u06c1\u0625\3\2\2\2\u06c1\u0626\3\2\2\2\u06c1\u0627\3\2"+
		"\2\2\u06c1\u0628\3\2\2\2\u06c1\u0629\3\2\2\2\u06c1\u062a\3\2\2\2\u06c1"+
		"\u062b\3\2\2\2\u06c1\u062c\3\2\2\2\u06c1\u062d\3\2\2\2\u06c1\u062e\3\2"+
		"\2\2\u06c1\u062f\3\2\2\2\u06c1\u0630\3\2\2\2\u06c1\u0631\3\2\2\2\u06c1"+
		"\u0632\3\2\2\2\u06c1\u0633\3\2\2\2\u06c1\u0634\3\2\2\2\u06c1\u0635\3\2"+
		"\2\2\u06c1\u0636\3\2\2\2\u06c1\u0637\3\2\2\2\u06c1\u0638\3\2\2\2\u06c1"+
		"\u0639\3\2\2\2\u06c1\u063a\3\2\2\2\u06c1\u063b\3\2\2\2\u06c1\u063c\3\2"+
		"\2\2\u06c1\u063d\3\2\2\2\u06c1\u063e\3\2\2\2\u06c1\u063f\3\2\2\2\u06c1"+
		"\u0640\3\2\2\2\u06c1\u0641\3\2\2\2\u06c1\u0642\3\2\2\2\u06c1\u0643\3\2"+
		"\2\2\u06c1\u0644\3\2\2\2\u06c1\u0645\3\2\2\2\u06c1\u0646\3\2\2\2\u06c1"+
		"\u0647\3\2\2\2\u06c1\u0648\3\2\2\2\u06c1\u0649\3\2\2\2\u06c1\u064a\3\2"+
		"\2\2\u06c1\u064b\3\2\2\2\u06c1\u064c\3\2\2\2\u06c1\u064d\3\2\2\2\u06c1"+
		"\u064e\3\2\2\2\u06c1\u064f\3\2\2\2\u06c1\u0650\3\2\2\2\u06c1\u0651\3\2"+
		"\2\2\u06c1\u0652\3\2\2\2\u06c1\u0653\3\2\2\2\u06c1\u0654\3\2\2\2\u06c1"+
		"\u0655\3\2\2\2\u06c1\u0656\3\2\2\2\u06c1\u0657\3\2\2\2\u06c1\u0658\3\2"+
		"\2\2\u06c1\u0659\3\2\2\2\u06c1\u065a\3\2\2\2\u06c1\u065b\3\2\2\2\u06c1"+
		"\u065c\3\2\2\2\u06c1\u065d\3\2\2\2\u06c1\u065e\3\2\2\2\u06c1\u065f\3\2"+
		"\2\2\u06c1\u0660\3\2\2\2\u06c1\u0661\3\2\2\2\u06c1\u0662\3\2\2\2\u06c1"+
		"\u0663\3\2\2\2\u06c1\u0664\3\2\2\2\u06c1\u0665\3\2\2\2\u06c1\u0666\3\2"+
		"\2\2\u06c1\u0667\3\2\2\2\u06c1\u0668\3\2\2\2\u06c1\u0669\3\2\2\2\u06c1"+
		"\u066a\3\2\2\2\u06c1\u066b\3\2\2\2\u06c1\u066c\3\2\2\2\u06c1\u066d\3\2"+
		"\2\2\u06c1\u066e\3\2\2\2\u06c1\u066f\3\2\2\2\u06c1\u0670\3\2\2\2\u06c1"+
		"\u0671\3\2\2\2\u06c1\u0672\3\2\2\2\u06c1\u0673\3\2\2\2\u06c1\u0674\3\2"+
		"\2\2\u06c1\u0675\3\2\2\2\u06c1\u0676\3\2\2\2\u06c1\u0677\3\2\2\2\u06c1"+
		"\u0678\3\2\2\2\u06c1\u0679\3\2\2\2\u06c1\u067a\3\2\2\2\u06c1\u067b\3\2"+
		"\2\2\u06c1\u067c\3\2\2\2\u06c1\u067d\3\2\2\2\u06c1\u067e\3\2\2\2\u06c1"+
		"\u067f\3\2\2\2\u06c1\u0680\3\2\2\2\u06c1\u0681\3\2\2\2\u06c1\u0682\3\2"+
		"\2\2\u06c1\u0683\3\2\2\2\u06c1\u0684\3\2\2\2\u06c1\u0685\3\2\2\2\u06c1"+
		"\u0686\3\2\2\2\u06c1\u0687\3\2\2\2\u06c1\u0688\3\2\2\2\u06c1\u0689\3\2"+
		"\2\2\u06c1\u068a\3\2\2\2\u06c1\u068b\3\2\2\2\u06c1\u068c\3\2\2\2\u06c1"+
		"\u068d\3\2\2\2\u06c1\u068e\3\2\2\2\u06c1\u068f\3\2\2\2\u06c1\u0690\3\2"+
		"\2\2\u06c1\u0691\3\2\2\2\u06c1\u0692\3\2\2\2\u06c1\u0693\3\2\2\2\u06c1"+
		"\u0694\3\2\2\2\u06c1\u0695\3\2\2\2\u06c1\u0696\3\2\2\2\u06c1\u0697\3\2"+
		"\2\2\u06c1\u0698\3\2\2\2\u06c1\u0699\3\2\2\2\u06c1\u069a\3\2\2\2\u06c1"+
		"\u069b\3\2\2\2\u06c1\u069c\3\2\2\2\u06c1\u069d\3\2\2\2\u06c1\u069e\3\2"+
		"\2\2\u06c1\u069f\3\2\2\2\u06c1\u06a0\3\2\2\2\u06c1\u06a1\3\2\2\2\u06c1"+
		"\u06a2\3\2\2\2\u06c1\u06a3\3\2\2\2\u06c1\u06a4\3\2\2\2\u06c1\u06a5\3\2"+
		"\2\2\u06c1\u06a6\3\2\2\2\u06c1\u06a7\3\2\2\2\u06c1\u06a8\3\2\2\2\u06c1"+
		"\u06a9\3\2\2\2\u06c1\u06aa\3\2\2\2\u06c1\u06ab\3\2\2\2\u06c1\u06ac\3\2"+
		"\2\2\u06c1\u06ad\3\2\2\2\u06c1\u06ae\3\2\2\2\u06c1\u06af\3\2\2\2\u06c1"+
		"\u06b0\3\2\2\2\u06c1\u06b1\3\2\2\2\u06c1\u06b2\3\2\2\2\u06c1\u06b3\3\2"+
		"\2\2\u06c1\u06b4\3\2\2\2\u06c1\u06b5\3\2\2\2\u06c1\u06b6\3\2\2\2\u06c1"+
		"\u06b7\3\2\2\2\u06c1\u06b8\3\2\2\2\u06c1\u06b9\3\2\2\2\u06c2\u0089\3\2"+
		"\2\2\u009e\u0099\u009b\u00a5\u00a9\u00ab\u00b1\u00b6\u00d8\u00e6\u00e9"+
		"\u00ef\u00f2\u00f9\u010f\u0112\u0115\u0118\u0131\u0139\u013d\u014e\u016b"+
		"\u0174\u0181\u0187\u0198\u01eb\u01f0\u01ff\u020e\u021b\u021e\u0221\u0224"+
		"\u0236\u0240\u0245\u024e\u0259\u0269\u0271\u027a\u027f\u028c\u0291\u02a7"+
		"\u02a9\u02b3\u02b6\u02c7\u02cf\u02d2\u02d5\u02e7\u02f5\u02ff\u0305\u030e"+
		"\u0310\u0314\u031a\u031d\u031f\u0323\u0329\u032b\u032f\u0336\u033b\u033f"+
		"\u0345\u034d\u0352\u0359\u035d\u0361\u0367\u036e\u0373\u0379\u037b\u037f"+
		"\u0385\u038b\u0390\u039a\u03a0\u03a6\u03ad\u03b4\u03b8\u03bd\u03c1\u03c7"+
		"\u03cc\u03d2\u03d7\u03dd\u03e3\u03e7\u03eb\u03f0\u03f4\u03fa\u03fc\u0402"+
		"\u0404\u040e\u0410\u041c\u041e\u0422\u0427\u042f\u0436\u043f\u0444\u0450"+
		"\u0460\u0465\u0469\u0470\u0474\u0477\u047d\u0482\u048a\u048f\u0496\u049d"+
		"\u04a4\u04b8\u04be\u04c5\u04c9\u04cf\u04d2\u04da\u04df\u04e4\u04eb\u04ef"+
		"\u04f2\u04f7\u04ff\u0506\u050b\u0511\u0516\u051b\u0520\u0526\u052c\u052f"+
		"\u06be\u06c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}