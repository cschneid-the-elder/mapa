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
		RULE_cobolWord = 34, RULE_literal = 35, RULE_filename = 36, RULE_dfhvalue = 37, 
		RULE_compilerDirectiveStatement = 38, RULE_compilerDirective = 39, RULE_conditionalCompilationStatement = 40, 
		RULE_compilerDirectiveCallInterface = 41, RULE_compilerDirectiveInline = 42, 
		RULE_compilerDirectiveBasis = 43, RULE_basisName = 44, RULE_compilerDirectiveInsert = 45, 
		RULE_compilerDirectiveDelete = 46, RULE_compilerDirectiveNumericRange = 47, 
		RULE_compilerDirectiveNumericAtom = 48, RULE_compilerDirectiveDeleteSequenceNumber = 49, 
		RULE_conditionalCompilationDefine = 50, RULE_conditionalCompilationDefinePredicate = 51, 
		RULE_conditionalCompilationArithmeticExpression = 52, RULE_conditionalCompilationArithmeticAtom = 53, 
		RULE_conditionalCompilationArithmeticOp = 54, RULE_conditionalCompilationIf = 55, 
		RULE_conditionalCompilationElse = 56, RULE_conditionalCompilationEndIf = 57, 
		RULE_conditionalCompilationEvaluateSelection = 58, RULE_conditionalCompilationEvaluate = 59, 
		RULE_conditionalCompilationWhen = 60, RULE_conditionalCompilationEndEvaluate = 61, 
		RULE_conditionalCompilationComparisonOp = 62, RULE_conditionalCompilationRelationalCondition = 63, 
		RULE_conditionalCompilationCondition = 64, RULE_conditionalCompilationSimpleRelationalCondition = 65, 
		RULE_conditionalCompilationBinaryCondition = 66, RULE_conditionalCompilationDefinedCondition = 67, 
		RULE_charDataKeyword = 68;
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
			"literal", "filename", "dfhvalue", "compilerDirectiveStatement", "compilerDirective", 
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
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXEC - 64)) | (1L << (EXEC_SQL - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (ID - 64)) | (1L << (IDENTIFICATION - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SKIP1 - 320)) | (1L << (SKIP2 - 320)) | (1L << (SKIP3 - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRAILING - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (COMPILER_DIRECTIVE_TAG - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(138);
					identificationDivisionTag();
					}
					break;
				case 2:
					{
					setState(139);
					compilerOptions();
					}
					break;
				case 3:
					{
					setState(140);
					compilerDirectiveStatement();
					}
					break;
				case 4:
					{
					setState(141);
					classicCommentEntry();
					}
					break;
				case 5:
					{
					setState(142);
					copyStatement();
					}
					break;
				case 6:
					{
					setState(143);
					execCicsStatement();
					}
					break;
				case 7:
					{
					setState(144);
					execSqlStatement();
					}
					break;
				case 8:
					{
					setState(145);
					execSqlImsStatement();
					}
					break;
				case 9:
					{
					setState(146);
					replaceOffStatement();
					}
					break;
				case 10:
					{
					setState(147);
					replaceArea();
					}
					break;
				case 11:
					{
					setState(148);
					ejectStatement();
					}
					break;
				case 12:
					{
					setState(149);
					skipStatement();
					}
					break;
				case 13:
					{
					setState(150);
					titleStatement();
					}
					break;
				case 14:
					{
					setState(151);
					charDataLine();
					}
					break;
				case 15:
					{
					setState(152);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDENTIFICATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
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
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==CBL || _la==PROCESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(169);
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
						setState(165);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(164);
							match(COMMACHAR);
							}
						}

						setState(167);
						compilerOption();
						}
						break;
					case XOPTS:
						{
						setState(168);
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
				setState(171); 
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
			setState(173);
			match(XOPTS);
			setState(174);
			match(LPARENCHAR);
			setState(175);
			compilerOption();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AWO) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << CBLCARD) | (1L << CICS) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DEBUG) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJPD - 64)) | (1L << (EPILOG - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (FASTSRT - 64)) | (1L << (FEPI - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INLINE - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LC - 64)) | (1L << (LEASM - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LP - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MAXPCF - 128)) | (1L << (NAME - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOWD - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PC - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (RMODE - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SIZE - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STGOPT - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TRUNC - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (WORD - 321)) | (1L << (XMLPARSE - 321)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (XP - 386)) | (1L << (XREF - 386)) | (1L << (YEARWINDOW - 386)) | (1L << (YW - 386)) | (1L << (ZC - 386)) | (1L << (ZD - 386)) | (1L << (ZONECHECK - 386)) | (1L << (ZONEDATA - 386)) | (1L << (ZWB - 386)) | (1L << (C_CHAR - 386)) | (1L << (D_CHAR - 386)) | (1L << (F_CHAR - 386)) | (1L << (Q_CHAR - 386)) | (1L << (S_CHAR - 386)) | (1L << (X_CHAR - 386)) | (1L << (COMMACHAR - 386)))) != 0)) {
				{
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(176);
					match(COMMACHAR);
					}
				}

				setState(179);
				compilerOption();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(ADATA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ADV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(189);
				match(AFP);
				setState(190);
				match(LPARENCHAR);
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==NOVOLATILE || _la==VOLATILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				match(RPARENCHAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(APOST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(194);
				match(ARCH);
				setState(195);
				match(LPARENCHAR);
				setState(196);
				literal();
				setState(197);
				match(RPARENCHAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==AR || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				match(LPARENCHAR);
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				match(AWO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(BLOCK0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(205);
				_la = _input.LA(1);
				if ( !(_la==BUF || _la==BUFSIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				match(LPARENCHAR);
				setState(207);
				literal();
				setState(208);
				match(RPARENCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(210);
				match(CBLCARD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(211);
				match(CICS);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(212);
					match(LPARENCHAR);
					setState(213);
					literal();
					setState(214);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(218);
				match(COBOL2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(219);
				match(COBOL3);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==CODEPAGE || _la==CP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				match(LPARENCHAR);
				setState(222);
				literal();
				setState(223);
				match(RPARENCHAR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(225);
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
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==COPYLOC || _la==CPLC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				match(LPARENCHAR);
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(228);
					match(IDENTIFIER);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(229);
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
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(232);
						match(COMMACHAR);
						}
					}

					setState(235);
					match(DSN);
					setState(236);
					match(LPARENCHAR);
					setState(237);
					match(FILENAME);
					setState(238);
					match(RPARENCHAR);
					}
					break;
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATH || _la==COMMACHAR) {
					{
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(241);
						match(COMMACHAR);
						}
					}

					setState(244);
					match(PATH);
					setState(245);
					match(LPARENCHAR);
					setState(246);
					literal();
					setState(247);
					match(RPARENCHAR);
					}
				}

				setState(251);
				match(RPARENCHAR);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==COPYRIGHT || _la==CPYR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				match(LPARENCHAR);
				setState(254);
				literal();
				setState(255);
				match(RPARENCHAR);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(257);
				match(CPP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(258);
				match(CPSM);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==CURR || _la==CURRENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				match(LPARENCHAR);
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(261);
					match(TEXT);
					}
					}
					setState(264); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(266);
				match(RPARENCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(267);
				match(DATA);
				setState(268);
				match(LPARENCHAR);
				setState(269);
				literal();
				setState(270);
				match(RPARENCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==DATEPROC || _la==DP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(273);
					match(LPARENCHAR);
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FLAG || _la==NOFLAG) {
						{
						setState(274);
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

					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(277);
						match(COMMACHAR);
						}
					}

					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOTRIG || _la==TRIG) {
						{
						setState(280);
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

					setState(283);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(286);
				match(DBCS);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(287);
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
				setState(288);
				match(DEBUG);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(289);
				define_opt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(290);
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
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==DISPSIGN || _la==DS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				match(LPARENCHAR);
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==SEP || _la==C_CHAR || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				match(RPARENCHAR);
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(295);
				match(DLL);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(296);
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
				setState(297);
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
				setState(298);
				match(EDF);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(299);
				match(EPILOG);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(300);
				match(EXIT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(301);
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
				setState(302);
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
				setState(303);
				match(FEPI);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==FLAG || _la==F_CHAR) ) {
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
				_la = _input.LA(1);
				if ( !(((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (E_CHAR - 399)) | (1L << (I_CHAR - 399)) | (1L << (S_CHAR - 399)) | (1L << (U_CHAR - 399)) | (1L << (W_CHAR - 399)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(307);
					match(COMMACHAR);
					setState(308);
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

				setState(311);
				match(RPARENCHAR);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(312);
				match(FLAGSTD);
				setState(313);
				match(LPARENCHAR);
				setState(314);
				_la = _input.LA(1);
				if ( !(((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (H_CHAR - 401)) | (1L << (I_CHAR - 401)) | (1L << (M_CHAR - 401)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(315);
					match(COMMACHAR);
					setState(316);
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
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(319);
					match(COMMACHAR);
					setState(320);
					match(O_CHAR);
					}
				}

				setState(323);
				match(RPARENCHAR);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(324);
				match(GDS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(325);
				match(GRAPHIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(326);
				match(HGPR);
				setState(327);
				match(LPARENCHAR);
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==NOPRESERVE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				match(RPARENCHAR);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(330);
				match(INTDATE);
				setState(331);
				match(LPARENCHAR);
				setState(332);
				_la = _input.LA(1);
				if ( !(_la==ANSI || _la==LILIAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(333);
				match(RPARENCHAR);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==IC || _la==INITCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(335);
					match(LPARENCHAR);
					setState(336);
					_la = _input.LA(1);
					if ( !(_la==LAX || _la==STRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(337);
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
				setState(340);
				match(INITIAL);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(341);
				match(INLINE);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(342);
				match(INL);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==LANG || _la==LANGUAGE) ) {
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
				if ( !(_la==CS || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (EN - 78)) | (1L << (ENGLISH - 78)) | (1L << (JA - 78)) | (1L << (JP - 78)) | (1L << (KA - 78)))) != 0) || _la==UE) ) {
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
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(347);
				match(LEASM);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(348);
				match(LENGTH);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(349);
				match(LIB);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(350);
				match(LIN);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==LC || _la==LINECOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(352);
				match(LPARENCHAR);
				setState(353);
				literal();
				setState(354);
				match(RPARENCHAR);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(356);
				match(LINKAGE);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(357);
				match(LIST);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				{
				setState(358);
				match(LP);
				setState(359);
				match(LPARENCHAR);
				setState(360);
				literal();
				setState(361);
				match(RPARENCHAR);
				}
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				{
				setState(363);
				match(MAP);
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(364);
					match(LPARENCHAR);
					setState(365);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(366);
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
				setState(369);
				match(MARGINS);
				setState(370);
				match(LPARENCHAR);
				setState(371);
				literal();
				setState(372);
				match(COMMACHAR);
				setState(373);
				literal();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(374);
					match(COMMACHAR);
					setState(375);
					literal();
					}
				}

				setState(378);
				match(RPARENCHAR);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				{
				setState(380);
				match(MAXPCF);
				setState(381);
				match(LPARENCHAR);
				setState(382);
				literal();
				setState(383);
				match(RPARENCHAR);
				}
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==MD || _la==MDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(386);
					match(LPARENCHAR);
					setState(387);
					_la = _input.LA(1);
					if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
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
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(391);
				match(NAME);
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(392);
					match(LPARENCHAR);
					setState(393);
					_la = _input.LA(1);
					if ( !(_la==ALIAS || _la==NOALIAS) ) {
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
				}
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(397);
				match(NATLANG);
				setState(398);
				match(LPARENCHAR);
				setState(399);
				_la = _input.LA(1);
				if ( !(_la==CS || _la==EN || _la==KA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(400);
				match(RPARENCHAR);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(401);
				match(NOADATA);
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(402);
				match(NOADV);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(403);
				match(NOAWO);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(404);
				match(NOBLOCK0);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(405);
				match(NOCBLCARD);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(406);
				match(NOCICS);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(407);
				match(NOCMPR2);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==NOC || _la==NOCOMPILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(409);
					match(LPARENCHAR);
					setState(410);
					_la = _input.LA(1);
					if ( !(((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (E_CHAR - 399)) | (1L << (S_CHAR - 399)) | (1L << (W_CHAR - 399)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(411);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(414);
				match(NOCOPYLOC);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(415);
				match(NOCPLC);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(416);
				match(NOCOPYRIGHT);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(417);
				match(NOCPYR);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(418);
				match(NOCPSM);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(419);
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
				setState(420);
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
				setState(421);
				match(NODBCS);
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(422);
				match(NODEBUG);
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(423);
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
				setState(424);
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
				setState(425);
				match(NODLL);
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(426);
				match(NODE);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(427);
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
				setState(428);
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
				setState(429);
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
				setState(430);
				match(NOEDF);
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(431);
				match(NOEPILOG);
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(432);
				match(NOEXIT);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(433);
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
				setState(434);
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
				setState(435);
				match(NOFEPI);
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(436);
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
				setState(437);
				match(NOFLAGMIG);
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(438);
				match(NOFLAGSTD);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(439);
				match(NOGRAPHIC);
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(440);
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
				setState(441);
				match(NOINITIAL);
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(442);
				match(NOINLINE);
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(443);
				match(NOINL);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(444);
				match(NOLENGTH);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(445);
				match(NOLIB);
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(446);
				match(NOLINKAGE);
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(447);
				match(NOLIST);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(448);
				match(NOMAP);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(449);
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
				setState(450);
				match(NONAME);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(451);
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
				setState(452);
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
				setState(453);
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
				setState(454);
				match(NOOPSEQUENCE);
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(455);
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
				setState(456);
				match(NOOPTIONS);
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(457);
				match(NOP);
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(458);
				match(NOPARMCHECK);
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(459);
				match(NOPROLOG);
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(460);
				match(NORENT);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(461);
				match(NORULES);
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(462);
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
				setState(463);
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
				setState(464);
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
				setState(465);
				match(NOSPIE);
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(466);
				match(NOSQL);
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(467);
				match(NOSQLIMS);
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(468);
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
				setState(469);
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
				setState(470);
				match(NOSTDTRUNC);
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(471);
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
				setState(472);
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
				setState(473);
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
				setState(474);
				match(NOTEST);
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(475);
				match(NOTHREAD);
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(476);
				match(NOVBREF);
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(477);
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
				setState(478);
				match(NSEQ);
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(479);
				_la = _input.LA(1);
				if ( !(_la==NS || _la==NSYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(480);
				match(LPARENCHAR);
				setState(481);
				_la = _input.LA(1);
				if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(482);
				match(RPARENCHAR);
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(483);
				match(NOVBREF);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(484);
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
				setState(485);
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
				setState(486);
				match(NOZWB);
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(487);
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
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==NC || _la==NUMCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(489);
					match(LPARENCHAR);
					setState(490);
					numcheck_opts();
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(491);
						match(COMMACHAR);
						setState(492);
						numcheck_opts();
						}
						}
						setState(497);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(498);
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
				setState(502);
				match(NUMPROC);
				setState(503);
				match(LPARENCHAR);
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(505);
				match(RPARENCHAR);
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(506);
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
				setState(507);
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
				setState(508);
				match(OPMARGINS);
				setState(509);
				match(LPARENCHAR);
				setState(510);
				literal();
				setState(511);
				match(COMMACHAR);
				setState(512);
				literal();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(513);
					match(COMMACHAR);
					setState(514);
					literal();
					}
				}

				setState(517);
				match(RPARENCHAR);
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(519);
				match(OPSEQUENCE);
				setState(520);
				match(LPARENCHAR);
				setState(521);
				literal();
				setState(522);
				match(COMMACHAR);
				setState(523);
				literal();
				setState(524);
				match(RPARENCHAR);
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(526);
				_la = _input.LA(1);
				if ( !(_la==OPT || _la==OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(527);
					match(LPARENCHAR);
					setState(528);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==STD || _la==NUMERICLITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(529);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(532);
				match(OPTFILE);
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(533);
				match(OPTIONS);
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(534);
				match(OP);
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==OUTDD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(536);
				match(LPARENCHAR);
				setState(537);
				cobolWord();
				setState(538);
				match(RPARENCHAR);
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				{
				setState(540);
				_la = _input.LA(1);
				if ( !(_la==PARMCHECK || _la==PC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(541);
					match(LPARENCHAR);
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABD || _la==MSG) {
						{
						setState(542);
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

					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 412)) & ~0x3f) == 0 && ((1L << (_la - 412)) & ((1L << (COMMACHAR - 412)) | (1L << (NONNUMERICLITERAL - 412)) | (1L << (NUMERICLITERAL - 412)))) != 0)) {
						{
						setState(546);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(545);
							match(COMMACHAR);
							}
						}

						setState(548);
						literal();
						}
					}

					setState(551);
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
				setState(554);
				_la = _input.LA(1);
				if ( !(_la==PGMN || _la==PGMNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(555);
				match(LPARENCHAR);
				setState(556);
				_la = _input.LA(1);
				if ( !(_la==CO || _la==COMPAT || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (LM - 131)) | (1L << (LONGMIXED - 131)) | (1L << (LONGUPPER - 131)) | (1L << (LU - 131)) | (1L << (MIXED - 131)))) != 0) || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (UPPER - 375)) | (1L << (M_CHAR - 375)) | (1L << (U_CHAR - 375)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
				match(RPARENCHAR);
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(558);
				match(PROLOG);
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				{
				setState(559);
				_la = _input.LA(1);
				if ( !(_la==QUALIFY || _la==QUA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(560);
				match(LPARENCHAR);
				setState(561);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(562);
				match(RPARENCHAR);
				}
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(563);
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
				setState(564);
				match(RENT);
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(565);
				match(RMODE);
				setState(566);
				match(LPARENCHAR);
				setState(570);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
					{
					setState(567);
					match(ANY);
					}
					break;
				case AUTO:
					{
					setState(568);
					match(AUTO);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(569);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(572);
				match(RPARENCHAR);
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				{
				setState(573);
				match(RULES);
				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(574);
					match(LPARENCHAR);
					setState(575);
					rules_opts();
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(576);
						match(COMMACHAR);
						setState(577);
						rules_opts();
						}
						}
						setState(582);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(583);
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
				setState(587);
				_la = _input.LA(1);
				if ( !(_la==SEQ || _la==SEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(588);
					match(LPARENCHAR);
					setState(589);
					literal();
					setState(590);
					match(COMMACHAR);
					setState(591);
					literal();
					setState(592);
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
				setState(596);
				_la = _input.LA(1);
				if ( !(_la==SERV || _la==SERVICE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(597);
				match(LPARENCHAR);
				setState(598);
				literal();
				setState(599);
				match(RPARENCHAR);
				}
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(601);
				_la = _input.LA(1);
				if ( !(_la==SIZE || _la==SZ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(602);
				match(LPARENCHAR);
				setState(605);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAX:
					{
					setState(603);
					match(MAX);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(604);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(607);
				match(RPARENCHAR);
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				setState(608);
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
				setState(609);
				match(SP);
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				setState(610);
				match(SPACE);
				setState(611);
				match(LPARENCHAR);
				setState(612);
				literal();
				setState(613);
				match(RPARENCHAR);
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(615);
				match(SPIE);
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(616);
				match(SQL);
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(617);
					match(LPARENCHAR);
					setState(618);
					literal();
					setState(619);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(623);
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
				setState(624);
				match(SQLIMS);
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(625);
					match(LPARENCHAR);
					setState(626);
					literal();
					setState(627);
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
				setState(631);
				_la = _input.LA(1);
				if ( !(_la==SSR || _la==SSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(632);
					match(LPARENCHAR);
					setState(633);
					ssrange_opts();
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(634);
						match(COMMACHAR);
						setState(635);
						ssrange_opts();
						}
						}
						setState(640);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(641);
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
				setState(645);
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
				setState(646);
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
				setState(647);
				match(SYSEIB);
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(648);
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
				setState(649);
				match(TEST);
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(650);
					match(LPARENCHAR);
					setState(651);
					test_opts();
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(652);
						match(COMMACHAR);
						setState(653);
						test_opts();
						}
						}
						setState(658);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(659);
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
				setState(663);
				match(THREAD);
				}
				break;
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(664);
				match(TRUNC);
				setState(665);
				match(LPARENCHAR);
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==OPT || _la==STD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(667);
				match(RPARENCHAR);
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(668);
				match(VBREF);
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				{
				setState(669);
				match(VLR);
				setState(670);
				match(LPARENCHAR);
				setState(671);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 356)) & ~0x3f) == 0 && ((1L << (_la - 356)) & ((1L << (STANDARD - 356)) | (1L << (C_CHAR - 356)) | (1L << (S_CHAR - 356)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(672);
				match(RPARENCHAR);
				}
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==VS || _la==VSAMOPENFS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				match(LPARENCHAR);
				setState(675);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (SUCC - 360)) | (1L << (C_CHAR - 360)) | (1L << (S_CHAR - 360)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(676);
				match(RPARENCHAR);
				}
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(677);
				_la = _input.LA(1);
				if ( !(_la==WD || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(678);
				match(LPARENCHAR);
				setState(685);
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
					setState(679);
					cobolWord();
					}
					break;
				case TEXT:
					{
					setState(681); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(680);
						match(TEXT);
						}
						}
						setState(683); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(687);
				match(RPARENCHAR);
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				setState(688);
				_la = _input.LA(1);
				if ( !(_la==XMLPARSE || _la==XP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(689);
				match(LPARENCHAR);
				setState(690);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XMLSS - 384)) | (1L << (C_CHAR - 384)) | (1L << (X_CHAR - 384)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(691);
				match(RPARENCHAR);
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(692);
				_la = _input.LA(1);
				if ( !(_la==XREF || _la==X_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(693);
					match(LPARENCHAR);
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FULL || _la==SHORT) {
						{
						setState(694);
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

					setState(697);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(700);
				_la = _input.LA(1);
				if ( !(_la==YEARWINDOW || _la==YW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(701);
				match(LPARENCHAR);
				setState(702);
				literal();
				setState(703);
				match(RPARENCHAR);
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				{
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==ZC || _la==ZONECHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(706);
				match(LPARENCHAR);
				setState(707);
				_la = _input.LA(1);
				if ( !(_la==ABD || _la==MSG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(708);
				match(RPARENCHAR);
				}
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				{
				setState(709);
				_la = _input.LA(1);
				if ( !(_la==ZD || _la==ZONEDATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(710);
				match(LPARENCHAR);
				setState(711);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(712);
				match(RPARENCHAR);
				}
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(713);
				match(ZWB);
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(714);
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
			setState(717);
			_la = _input.LA(1);
			if ( !(_la==DEF || _la==DEFINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(718);
			match(LPARENCHAR);
			setState(719);
			identifier_et_al();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMACHAR || _la==TEXT) {
				{
				setState(726);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(721); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(720);
						match(TEXT);
						}
						}
						setState(723); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				case COMMACHAR:
					{
					setState(725);
					match(COMMACHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(728);
				literal();
				}
			}

			setState(731);
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
			setState(733);
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
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(735);
				match(ZON);
				}
				break;
			case 2:
				{
				{
				setState(736);
				match(ZON);
				setState(737);
				match(LPARENCHAR);
				setState(738);
				_la = _input.LA(1);
				if ( !(_la==ALPHNUM || _la==NOALPHNUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(739);
				match(RPARENCHAR);
				}
				}
				break;
			case 3:
				{
				setState(740);
				match(NOZON);
				}
				break;
			case 4:
				{
				setState(741);
				match(PAC);
				}
				break;
			case 5:
				{
				setState(742);
				match(NOPAC);
				}
				break;
			case 6:
				{
				setState(743);
				match(BIN);
				}
				break;
			case 7:
				{
				setState(744);
				match(NOBIN);
				}
				break;
			case 8:
				{
				setState(745);
				match(MSG);
				}
				break;
			case 9:
				{
				setState(746);
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
			setState(749);
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
			setState(751);
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
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DWARF:
				{
				setState(753);
				match(DWARF);
				}
				break;
			case NODWARF:
				{
				setState(754);
				match(NODWARF);
				}
				break;
			case HOOK:
				{
				setState(755);
				match(HOOK);
				}
				break;
			case NOHOOK:
				{
				setState(756);
				match(NOHOOK);
				}
				break;
			case SEP:
			case SEPARATE:
				{
				{
				setState(757);
				_la = _input.LA(1);
				if ( !(_la==SEP || _la==SEPARATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(758);
					match(LPARENCHAR);
					setState(759);
					_la = _input.LA(1);
					if ( !(_la==DSNAME || _la==NODSNAME) ) {
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
				}
				}
				}
				break;
			case NOSEP:
				{
				setState(763);
				match(NOSEP);
				}
				break;
			case NOSEPARATE:
				{
				setState(764);
				match(NOSEPARATE);
				}
				break;
			case SO:
				{
				setState(765);
				match(SO);
				}
				break;
			case SOURCE:
				{
				setState(766);
				match(SOURCE);
				}
				break;
			case NOSO:
				{
				setState(767);
				match(NOSO);
				}
				break;
			case NOSOURCE:
				{
				setState(768);
				match(NOSOURCE);
				}
				break;
			case EJPD:
				{
				setState(769);
				match(EJPD);
				}
				break;
			case NOEJPD:
				{
				setState(770);
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
			setState(773);
			match(CLASSIC_COMMENT_TAG);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASSIC_COMMENT_TEXT) {
				{
				{
				setState(774);
				match(CLASSIC_COMMENT_TEXT);
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
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
		public List<TerminalNode> PROCESS() { return getTokens(CobolPreprocessorParser.PROCESS); }
		public TerminalNode PROCESS(int i) {
			return getToken(CobolPreprocessorParser.PROCESS, i);
		}
		public List<TerminalNode> COPY() { return getTokens(CobolPreprocessorParser.COPY); }
		public TerminalNode COPY(int i) {
			return getToken(CobolPreprocessorParser.COPY, i);
		}
		public List<TerminalNode> REPLACE() { return getTokens(CobolPreprocessorParser.REPLACE); }
		public TerminalNode REPLACE(int i) {
			return getToken(CobolPreprocessorParser.REPLACE, i);
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
			setState(782);
			match(EXEC);
			setState(783);
			match(CICS);
			setState(789); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(789);
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
					setState(784);
					charData();
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(785);
					classicCommentEntry();
					}
					break;
				case PROCESS:
					{
					setState(786);
					match(PROCESS);
					}
					break;
				case COPY:
					{
					setState(787);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(788);
					match(REPLACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(791); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRAILING - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XMLSS - 384)) | (1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0) );
			setState(793);
			match(END_EXEC);
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(794);
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
			setState(797);
			match(EXEC_SQL);
			setState(804); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(804);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SQL_TEXT:
					{
					setState(799); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(798);
							match(SQL_TEXT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(801); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(803);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASSIC_COMMENT_TAG || _la==SQL_TEXT );
			setState(808);
			match(END_EXEC);
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(809);
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
			setState(812);
			match(EXEC);
			setState(813);
			match(SQLIMS);
			setState(816); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(816);
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
					setState(814);
					charData();
					}
					break;
				case CLASSIC_COMMENT_TAG:
					{
					setState(815);
					classicCommentEntry();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(818); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RPARENCHAR - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (XOPTS - 385)) | (1L << (XREF - 385)) | (1L << (YEARWINDOW - 385)) | (1L << (YW - 385)) | (1L << (ZC - 385)) | (1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (DOT - 385)) | (1L << (NONNUMERICLITERAL - 385)) | (1L << (NUMERICLITERAL - 385)) | (1L << (IDENTIFIER - 385)) | (1L << (FILENAME - 385)) | (1L << (PSEUDOTEXTIDENTIFIER - 385)) | (1L << (NEWLINE - 385)) | (1L << (TEXT - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0) );
			setState(820);
			match(END_EXEC);
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(821);
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
			setState(824);
			match(COPY);
			setState(825);
			copySource();
			setState(838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(826);
						match(NEWLINE);
						}
						}
						setState(831);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(834);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REPLACING:
						{
						setState(832);
						replacingPhrase();
						}
						break;
					case SUPPRESS:
						{
						setState(833);
						match(SUPPRESS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(841);
				match(NEWLINE);
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(847);
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
			setState(852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(849);
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
				setState(850);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(851);
				filename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(854);
					match(NEWLINE);
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(860);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(861);
					match(NEWLINE);
					}
					}
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(867);
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
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
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
				setState(871);
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
			setState(874);
			match(REPLACING);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(875);
				match(NEWLINE);
				}
				}
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(881);
			replaceClause();
			setState(890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(883); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(882);
						match(NEWLINE);
						}
						}
						setState(885); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(887);
					replaceClause();
					}
					} 
				}
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
			setState(893);
			replaceByStatement();
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(896);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COPY:
						{
						setState(894);
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
						setState(895);
						charData();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(901);
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
			setState(904);
			match(REPLACE);
			setState(912); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(905);
						match(NEWLINE);
						}
						}
						setState(910);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(911);
					replaceClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(914); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(916);
				match(NEWLINE);
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(922);
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
			setState(924);
			match(REPLACE);
			setState(925);
			match(OFF);
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(926);
				match(NEWLINE);
				}
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(932);
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
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(934);
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
			setState(937);
			replaceable();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(938);
				match(NEWLINE);
				}
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(944);
			match(BY);
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(945);
				match(NEWLINE);
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(951);
			replacement();
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
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
				directoryPhrase();
				}
				break;
			}
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
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
			setState(970);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(971);
				match(NEWLINE);
				}
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(977);
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
				setState(978);
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
			setState(981);
			match(ON);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(982);
				match(NEWLINE);
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(988);
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
				setState(989);
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
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(995);
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
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
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
			setState(1004);
			match(EJECT);
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
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
			setState(1008);
			_la = _input.LA(1);
			if ( !(((((_la - 349)) & ~0x3f) == 0 && ((1L << (_la - 349)) & ((1L << (SKIP1 - 349)) | (1L << (SKIP2 - 349)) | (1L << (SKIP3 - 349)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1009);
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
			setState(1012);
			match(TITLE);
			setState(1013);
			literal();
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1014);
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
			setState(1017);
			match(DOUBLEEQUALCHAR);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DFHVALUE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RPARENCHAR - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (XOPTS - 385)) | (1L << (XREF - 385)) | (1L << (YEARWINDOW - 385)) | (1L << (YW - 385)) | (1L << (ZC - 385)) | (1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (DOT - 385)) | (1L << (NONNUMERICLITERAL - 385)) | (1L << (NUMERICLITERAL - 385)) | (1L << (IDENTIFIER - 385)) | (1L << (FILENAME - 385)) | (1L << (PSEUDOTEXTIDENTIFIER - 385)) | (1L << (NEWLINE - 385)) | (1L << (TEXT - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0)) {
				{
				setState(1018);
				charData();
				}
			}

			setState(1021);
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
			setState(1025); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1025);
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
						setState(1023);
						charDataLine();
						}
						break;
					case NEWLINE:
						{
						setState(1024);
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
				setState(1027); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
			setState(1033); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1033);
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
					setState(1029);
					charDataLine();
					}
					break;
				case COPY:
					{
					setState(1030);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(1031);
					match(REPLACE);
					}
					break;
				case NEWLINE:
					{
					setState(1032);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1035); 
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
		enterRule(_localctx, 66, RULE_charDataLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1046);
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
						setState(1037);
						cobolWord();
						}
						break;
					case NONNUMERICLITERAL:
					case NUMERICLITERAL:
						{
						setState(1038);
						literal();
						}
						break;
					case FILENAME:
						{
						setState(1039);
						filename();
						}
						break;
					case PSEUDOTEXTIDENTIFIER:
						{
						setState(1040);
						match(PSEUDOTEXTIDENTIFIER);
						}
						break;
					case TEXT:
						{
						setState(1041);
						match(TEXT);
						}
						break;
					case DOT:
						{
						setState(1042);
						match(DOT);
						}
						break;
					case LPARENCHAR:
						{
						setState(1043);
						match(LPARENCHAR);
						}
						break;
					case RPARENCHAR:
						{
						setState(1044);
						match(RPARENCHAR);
						}
						break;
					case DFHVALUE:
						{
						setState(1045);
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
				setState(1048); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1050);
					match(NEWLINE);
					setState(1051);
					match(CLASSIC_CONTINUATION);
					setState(1060); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(1060);
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
								setState(1052);
								cobolWord();
								}
								break;
							case NONNUMERICLITERAL:
							case NUMERICLITERAL:
								{
								setState(1053);
								literal();
								}
								break;
							case FILENAME:
								{
								setState(1054);
								filename();
								}
								break;
							case PSEUDOTEXTIDENTIFIER:
								{
								setState(1055);
								match(PSEUDOTEXTIDENTIFIER);
								}
								break;
							case TEXT:
								{
								setState(1056);
								match(TEXT);
								}
								break;
							case DOT:
								{
								setState(1057);
								match(DOT);
								}
								break;
							case LPARENCHAR:
								{
								setState(1058);
								match(LPARENCHAR);
								}
								break;
							case RPARENCHAR:
								{
								setState(1059);
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
						setState(1062); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
			setState(1071);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
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
				setState(1070);
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
			setState(1073);
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
			setState(1075);
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
		enterRule(_localctx, 74, RULE_dfhvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1077);
			match(DFHVALUE);
			setState(1078);
			match(LPARENCHAR);
			setState(1082);
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
				setState(1079);
				cobolWord();
				}
				break;
			case COPY:
				{
				setState(1080);
				match(COPY);
				}
				break;
			case PROCESS:
				{
				setState(1081);
				match(PROCESS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1084);
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
		enterRule(_localctx, 76, RULE_compilerDirectiveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1086);
				compilerDirective();
				}
				break;
			case 2:
				{
				setState(1087);
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
		enterRule(_localctx, 78, RULE_compilerDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1090);
				compilerDirectiveCallInterface();
				}
				break;
			case 2:
				{
				setState(1091);
				compilerDirectiveInline();
				}
				break;
			case 3:
				{
				setState(1092);
				compilerDirectiveBasis();
				}
				break;
			case 4:
				{
				setState(1093);
				compilerDirectiveInsert();
				}
				break;
			case 5:
				{
				setState(1094);
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
		enterRule(_localctx, 80, RULE_conditionalCompilationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1097);
				conditionalCompilationDefine();
				}
				break;
			case 2:
				{
				setState(1098);
				conditionalCompilationIf();
				}
				break;
			case 3:
				{
				setState(1099);
				conditionalCompilationElse();
				}
				break;
			case 4:
				{
				setState(1100);
				conditionalCompilationEndIf();
				}
				break;
			case 5:
				{
				setState(1101);
				conditionalCompilationEvaluate();
				}
				break;
			case 6:
				{
				setState(1102);
				conditionalCompilationWhen();
				}
				break;
			case 7:
				{
				setState(1103);
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
		enterRule(_localctx, 82, RULE_compilerDirectiveCallInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1106);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1107);
			_la = _input.LA(1);
			if ( !(_la==CALLINT || _la==CALLINTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1108);
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
		enterRule(_localctx, 84, RULE_compilerDirectiveInline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1111);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1112);
			match(INLINE);
			setState(1113);
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
		enterRule(_localctx, 86, RULE_compilerDirectiveBasis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1115);
			match(BASIS);
			setState(1116);
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
		enterRule(_localctx, 88, RULE_basisName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1118);
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
				setState(1119);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(1120);
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
		enterRule(_localctx, 90, RULE_compilerDirectiveInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1123);
			match(INSERT);
			setState(1124);
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
		enterRule(_localctx, 92, RULE_compilerDirectiveDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1126);
			match(DELETE);
			setState(1127);
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
		enterRule(_localctx, 94, RULE_compilerDirectiveNumericRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1129);
			compilerDirectiveNumericAtom();
			setState(1130);
			match(MINUSCHAR);
			setState(1131);
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
		enterRule(_localctx, 96, RULE_compilerDirectiveNumericAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1133);
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
		enterRule(_localctx, 98, RULE_compilerDirectiveDeleteSequenceNumber);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1135);
				compilerDirectiveNumericAtom();
				}
				break;
			case 2:
				{
				setState(1136);
				compilerDirectiveNumericRange();
				}
				break;
			}
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1139);
					match(COMMACHAR);
					setState(1142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(1140);
						compilerDirectiveNumericAtom();
						}
						break;
					case 2:
						{
						setState(1141);
						compilerDirectiveNumericRange();
						}
						break;
					}
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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
		enterRule(_localctx, 100, RULE_conditionalCompilationDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1149);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1150);
			match(DEFINE);
			setState(1151);
			match(IDENTIFIER);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1152);
				match(AS);
				}
			}

			setState(1157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1155);
				conditionalCompilationDefinePredicate();
				}
				break;
			case 2:
				{
				setState(1156);
				match(INLINE_OFF);
				}
				break;
			}
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(1159);
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
		enterRule(_localctx, 102, RULE_conditionalCompilationDefinePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1162);
				literal();
				}
				break;
			case 2:
				{
				setState(1163);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 3:
				{
				setState(1164);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(1165);
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
		enterRule(_localctx, 104, RULE_conditionalCompilationArithmeticExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1177); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1168);
						match(LPARENCHAR);
						}
						}
						setState(1173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1174);
					conditionalCompilationArithmeticAtom();
					setState(1175);
					conditionalCompilationArithmeticOp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1181);
						match(LPARENCHAR);
						}
						}
						setState(1186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1187);
					conditionalCompilationArithmeticAtom();
					setState(1191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==RPARENCHAR) {
						{
						{
						setState(1188);
						match(RPARENCHAR);
						}
						}
						setState(1193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1194);
					conditionalCompilationArithmeticOp();
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			setState(1201);
			conditionalCompilationArithmeticAtom();
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1202);
					match(RPARENCHAR);
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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
		enterRule(_localctx, 106, RULE_conditionalCompilationArithmeticAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
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
		enterRule(_localctx, 108, RULE_conditionalCompilationArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
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
		enterRule(_localctx, 110, RULE_conditionalCompilationIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1212);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1213);
			match(IF);
			setState(1214);
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
		enterRule(_localctx, 112, RULE_conditionalCompilationElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1217);
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
		enterRule(_localctx, 114, RULE_conditionalCompilationEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1220);
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
		enterRule(_localctx, 116, RULE_conditionalCompilationEvaluateSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1222);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1223);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1224);
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
		enterRule(_localctx, 118, RULE_conditionalCompilationEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1228);
			match(EVALUATE);
			setState(1231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(1229);
				match(TRUE);
				}
				break;
			case LPARENCHAR:
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
			case IDENTIFIER:
			case ZERO:
				{
				setState(1230);
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
		enterRule(_localctx, 120, RULE_conditionalCompilationWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1234);
			match(WHEN);
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				{
				setState(1235);
				conditionalCompilationEvaluateSelection();
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROUGH || _la==THRU) {
					{
					setState(1236);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1237);
					conditionalCompilationEvaluateSelection();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(1240);
				conditionalCompilationRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1241);
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
		enterRule(_localctx, 122, RULE_conditionalCompilationEndEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1245);
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
		enterRule(_localctx, 124, RULE_conditionalCompilationComparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1247);
				match(IS);
				}
			}

			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1250);
				match(NOT);
				}
			}

			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1253);
				match(EQUAL);
				}
				break;
			case 2:
				{
				setState(1254);
				match(EQUALCHAR);
				}
				break;
			case 3:
				{
				setState(1255);
				match(NOTEQUALCHAR);
				}
				break;
			case 4:
				{
				setState(1256);
				match(LESSTHANCHAR);
				}
				break;
			case 5:
				{
				{
				setState(1257);
				match(GREATER);
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1258);
					match(THAN);
					}
				}

				}
				}
				break;
			case 6:
				{
				setState(1261);
				match(GREATERTHANCHAR);
				}
				break;
			case 7:
				{
				{
				setState(1262);
				match(LESS);
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1263);
					match(THAN);
					}
				}

				}
				}
				break;
			case 8:
				{
				setState(1266);
				match(LESSOREQUALCHAR);
				}
				break;
			case 9:
				{
				{
				setState(1267);
				match(LESS);
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1268);
					match(THAN);
					}
				}

				setState(1271);
				match(OR);
				setState(1272);
				match(EQUAL);
				}
				}
				break;
			case 10:
				{
				setState(1273);
				match(GREATEROREQUALCHAR);
				}
				break;
			case 11:
				{
				{
				setState(1274);
				match(GREATER);
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1275);
					match(THAN);
					}
				}

				setState(1278);
				match(OR);
				setState(1279);
				match(EQUAL);
				}
				}
				break;
			}
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1282);
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
		enterRule(_localctx, 126, RULE_conditionalCompilationRelationalCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1317); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1285);
							match(LPARENCHAR);
							}
							} 
						}
						setState(1290);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					}
					setState(1291);
					conditionalCompilationCondition();
					setState(1308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1292);
							_la = _input.LA(1);
							if ( !(_la==AND || _la==OR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1296);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1293);
									match(LPARENCHAR);
									}
									} 
								}
								setState(1298);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
							}
							setState(1299);
							conditionalCompilationCondition();
							setState(1303);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1300);
									match(RPARENCHAR);
									}
									} 
								}
								setState(1305);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
							}
							}
							} 
						}
						setState(1310);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
					}
					setState(1314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1311);
							match(RPARENCHAR);
							}
							} 
						}
						setState(1316);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1319); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
		enterRule(_localctx, 128, RULE_conditionalCompilationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1321);
				conditionalCompilationSimpleRelationalCondition();
				}
				break;
			case 2:
				{
				setState(1322);
				conditionalCompilationDefinedCondition();
				}
				break;
			case 3:
				{
				setState(1323);
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
		enterRule(_localctx, 130, RULE_conditionalCompilationSimpleRelationalCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1326);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1327);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1328);
				literal();
				}
				break;
			}
			setState(1331);
			conditionalCompilationComparisonOp();
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1332);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1333);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1334);
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
		enterRule(_localctx, 132, RULE_conditionalCompilationBinaryCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
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
		enterRule(_localctx, 134, RULE_conditionalCompilationDefinedCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1339);
			match(IDENTIFIER);
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1340);
				match(IS);
				}
			}

			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1343);
				match(NOT);
				}
			}

			setState(1346);
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
		enterRule(_localctx, 136, RULE_charDataKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BASIS) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DELETE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (INSERT - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (PROLOG - 321)) | (1L << (QUALIFY - 321)) | (1L << (QUA - 321)) | (1L << (QUOTE - 321)) | (1L << (RENT - 321)) | (1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (XOPTS - 385)) | (1L << (XREF - 385)) | (1L << (YEARWINDOW - 385)) | (1L << (YW - 385)) | (1L << (ZC - 385)) | (1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 459)) & ~0x3f) == 0 && ((1L << (_la - 459)) & ((1L << (OR - 459)) | (1L << (STATIC - 459)) | (1L << (TO - 459)) | (1L << (TRUE - 459)) | (1L << (WHEN - 459)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01da\u0549\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u009c\n\2\f\2\16\2\u009f"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u00a8\n\4\3\4\3\4\6\4\u00ac\n\4"+
		"\r\4\16\4\u00ad\3\5\3\5\3\5\3\5\5\5\u00b4\n\5\3\5\7\5\u00b7\n\5\f\5\16"+
		"\5\u00ba\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00db\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e9"+
		"\n\6\3\6\5\6\u00ec\n\6\3\6\3\6\3\6\3\6\5\6\u00f2\n\6\3\6\5\6\u00f5\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00fc\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\6\6\u0109\n\6\r\6\16\6\u010a\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0116\n\6\3\6\5\6\u0119\n\6\3\6\5\6\u011c\n\6\3\6\5\6\u011f\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0138\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0140"+
		"\n\6\3\6\3\6\5\6\u0144\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0155\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0172\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u017b\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0188\n\6\3\6\3\6\3\6\3\6\5\6\u018e\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u019f"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u01f0\n\6\f\6\16\6\u01f3"+
		"\13\6\3\6\3\6\5\6\u01f7\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0206\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0215\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0222"+
		"\n\6\3\6\5\6\u0225\n\6\3\6\5\6\u0228\n\6\3\6\5\6\u022b\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u023d\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u0245\n\6\f\6\16\6\u0248\13\6\3\6\3\6\5\6\u024c"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0255\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0260\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0270\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0278\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u027f\n\6\f\6\16\6\u0282\13\6\3\6\3\6\5\6\u0286\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0291\n\6\f\6\16\6\u0294\13\6"+
		"\3\6\3\6\5\6\u0298\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u02ac\n\6\r\6\16\6\u02ad\5\6\u02b0\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02ba\n\6\3\6\5\6\u02bd\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02ce\n\6\3\7"+
		"\3\7\3\7\3\7\6\7\u02d4\n\7\r\7\16\7\u02d5\3\7\5\7\u02d9\n\7\3\7\5\7\u02dc"+
		"\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u02ee\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u02fc"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0306\n\f\3\r\3\r\7\r\u030a\n"+
		"\r\f\r\16\r\u030d\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16"+
		"\u0318\n\16\r\16\16\16\u0319\3\16\3\16\5\16\u031e\n\16\3\17\3\17\6\17"+
		"\u0322\n\17\r\17\16\17\u0323\3\17\6\17\u0327\n\17\r\17\16\17\u0328\3\17"+
		"\3\17\5\17\u032d\n\17\3\20\3\20\3\20\3\20\6\20\u0333\n\20\r\20\16\20\u0334"+
		"\3\20\3\20\5\20\u0339\n\20\3\21\3\21\3\21\7\21\u033e\n\21\f\21\16\21\u0341"+
		"\13\21\3\21\3\21\5\21\u0345\n\21\7\21\u0347\n\21\f\21\16\21\u034a\13\21"+
		"\3\21\7\21\u034d\n\21\f\21\16\21\u0350\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u0357\n\22\3\22\7\22\u035a\n\22\f\22\16\22\u035d\13\22\3\22\3\22"+
		"\7\22\u0361\n\22\f\22\16\22\u0364\13\22\3\22\5\22\u0367\n\22\3\23\3\23"+
		"\5\23\u036b\n\23\3\24\3\24\7\24\u036f\n\24\f\24\16\24\u0372\13\24\3\24"+
		"\3\24\6\24\u0376\n\24\r\24\16\24\u0377\3\24\7\24\u037b\n\24\f\24\16\24"+
		"\u037e\13\24\3\25\3\25\3\25\7\25\u0383\n\25\f\25\16\25\u0386\13\25\3\25"+
		"\5\25\u0389\n\25\3\26\3\26\7\26\u038d\n\26\f\26\16\26\u0390\13\26\3\26"+
		"\6\26\u0393\n\26\r\26\16\26\u0394\3\26\7\26\u0398\n\26\f\26\16\26\u039b"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\7\27\u03a2\n\27\f\27\16\27\u03a5\13\27"+
		"\3\27\3\27\3\30\5\30\u03aa\n\30\3\30\3\30\7\30\u03ae\n\30\f\30\16\30\u03b1"+
		"\13\30\3\30\3\30\7\30\u03b5\n\30\f\30\16\30\u03b8\13\30\3\30\3\30\7\30"+
		"\u03bc\n\30\f\30\16\30\u03bf\13\30\3\30\5\30\u03c2\n\30\3\30\7\30\u03c5"+
		"\n\30\f\30\16\30\u03c8\13\30\3\30\5\30\u03cb\n\30\3\31\3\31\7\31\u03cf"+
		"\n\31\f\31\16\31\u03d2\13\31\3\31\3\31\5\31\u03d6\n\31\3\32\3\32\7\32"+
		"\u03da\n\32\f\32\16\32\u03dd\13\32\3\32\3\32\5\32\u03e1\n\32\3\33\3\33"+
		"\3\33\3\33\5\33\u03e7\n\33\3\34\3\34\3\34\3\34\5\34\u03ed\n\34\3\35\3"+
		"\35\5\35\u03f1\n\35\3\36\3\36\5\36\u03f5\n\36\3\37\3\37\3\37\5\37\u03fa"+
		"\n\37\3 \3 \5 \u03fe\n \3 \3 \3!\3!\6!\u0404\n!\r!\16!\u0405\3\"\3\"\3"+
		"\"\3\"\6\"\u040c\n\"\r\"\16\"\u040d\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u0419"+
		"\n#\r#\16#\u041a\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u0427\n#\r#\16#\u0428"+
		"\7#\u042b\n#\f#\16#\u042e\13#\3$\3$\5$\u0432\n$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u043d\n\'\3\'\3\'\3(\3(\5(\u0443\n(\3)\3)\3)\3)\3)\5)\u044a"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\5*\u0453\n*\3+\3+\3+\5+\u0458\n+\3,\3,\3,\3,"+
		"\3-\3-\3-\3.\3.\3.\5.\u0464\n.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\5\63\u0474\n\63\3\63\3\63\3\63\5\63\u0479\n"+
		"\63\7\63\u047b\n\63\f\63\16\63\u047e\13\63\3\64\3\64\3\64\3\64\5\64\u0484"+
		"\n\64\3\64\3\64\5\64\u0488\n\64\3\64\5\64\u048b\n\64\3\65\3\65\3\65\3"+
		"\65\5\65\u0491\n\65\3\66\7\66\u0494\n\66\f\66\16\66\u0497\13\66\3\66\3"+
		"\66\3\66\6\66\u049c\n\66\r\66\16\66\u049d\3\66\7\66\u04a1\n\66\f\66\16"+
		"\66\u04a4\13\66\3\66\3\66\7\66\u04a8\n\66\f\66\16\66\u04ab\13\66\3\66"+
		"\3\66\7\66\u04af\n\66\f\66\16\66\u04b2\13\66\3\66\3\66\7\66\u04b6\n\66"+
		"\f\66\16\66\u04b9\13\66\3\67\3\67\38\38\39\39\39\39\3:\3:\3:\3;\3;\3;"+
		"\3<\3<\3<\5<\u04cc\n<\3=\3=\3=\3=\5=\u04d2\n=\3>\3>\3>\3>\3>\5>\u04d9"+
		"\n>\3>\3>\5>\u04dd\n>\3?\3?\3?\3@\5@\u04e3\n@\3@\5@\u04e6\n@\3@\3@\3@"+
		"\3@\3@\3@\5@\u04ee\n@\3@\3@\3@\5@\u04f3\n@\3@\3@\3@\5@\u04f8\n@\3@\3@"+
		"\3@\3@\3@\5@\u04ff\n@\3@\3@\5@\u0503\n@\3@\5@\u0506\n@\3A\7A\u0509\nA"+
		"\fA\16A\u050c\13A\3A\3A\3A\7A\u0511\nA\fA\16A\u0514\13A\3A\3A\7A\u0518"+
		"\nA\fA\16A\u051b\13A\7A\u051d\nA\fA\16A\u0520\13A\3A\7A\u0523\nA\fA\16"+
		"A\u0526\13A\6A\u0528\nA\rA\16A\u0529\3B\3B\3B\5B\u052f\nB\3C\3C\3C\5C"+
		"\u0534\nC\3C\3C\3C\3C\5C\u053a\nC\3D\3D\3E\3E\5E\u0540\nE\3E\5E\u0543"+
		"\nE\3E\3E\3F\3F\3F\2\2G\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\2}\3\2kl\4\2\37\37\u0142\u0142\4\2\u0117\u0117\u017c"+
		"\u017c\4\2\24\24\26\26\6\2&&^^\u018f\u018f\u0191\u0191\3\2\34\35\4\2%"+
		"%++\4\2\'\'\u018f\u018f\4\2)),,\4\2**//\3\2\61\62\4\2\64\64CC\4\2aa\u00ce"+
		"\u00ce\4\2\u0111\u0111\u0175\u0175\4\299\u0190\u0190\4\2>>GG\4\2??DD\6"+
		"\2&&\u014d\u014d\u018f\u018f\u0199\u0199\3\2HI\3\2KL\3\2\\]\4\2__cc\4"+
		"\2aa\u0192\u0192\5\2\u0191\u0191\u0194\u0194\u0199\u019b\3\2\u0193\u0195"+
		"\b\2\66\66\u009a\u009a\u0163\u0163\u0190\u0190\u0196\u0196\u0199\u0199"+
		"\4\2\u00f3\u00f3\u0141\u0141\4\2\21\21\u0080\u0080\4\2jjnn\4\2yy\u0169"+
		"\u0169\3\2wx\7\2\60\60PPSStv\u0177\u0177\4\2{{\u0082\u0082\4\288gg\3\2"+
		"\u008f\u0090\6\2\'\'\u00a3\u00a3\u00a7\u00a7\u018f\u018f\4\2\17\17\u009e"+
		"\u009e\5\2\60\60PPvv\4\2\u00a3\u00a3\u00a7\u00a7\5\2\u0191\u0191\u0199"+
		"\u0199\u019b\u019b\3\2\u00ad\u00ae\4\2\u00b0\u00b0\u00bc\u00bc\4\2\u00af"+
		"\u00af\u00b4\u00b4\3\2\u00b5\u00b6\3\2\u00ba\u00bb\4\2\u00b7\u00b7\u00bd"+
		"\u00bd\3\2\u00bf\u00c0\3\2\u00c9\u00ca\4\2\u00cc\u00cc\u00d1\u00d1\4\2"+
		"\u00cb\u00cb\u00ce\u00ce\3\2\u00d4\u00d5\3\2\u00e0\u00e1\3\2\u00e3\u00e4"+
		"\3\2\u00e5\u00e6\3\2\u00e8\u00e9\3\2\u00ec\u00ed\4\2\u00fa\u00fa\u0109"+
		"\u0109\3\2\u00fb\u00fc\4\2\u00f7\u00f7\u0100\u0100\3\2\u0103\u0104\3\2"+
		"\u0106\u0107\4\2\u00ff\u00ff\u010a\u010a\3\2\u010b\u010c\3\2\u010d\u010e"+
		"\3\2\u0118\u0119\4\2\u0121\u0121\u0123\u0123\4\2\65\65\u0096\u0097\3\2"+
		"\u011a\u011b\4\2\u011c\u011c\u011f\u011f\3\2\u0124\u0125\4\2\u0099\u0099"+
		"\u0126\u0126\5\2\u0091\u0091\u00f2\u00f2\u013d\u013d\3\2\u0128\u0129\3"+
		"\2\u012b\u012c\4\2\u0133\u0133\u0135\u0135\5\2dd\u0167\u0167\u01a3\u01a3"+
		"\3\2\u0137\u0138\4\2\u013a\u013a\u013c\u013c\4\2\13\13\u0094\u0094\3\2"+
		"\u013f\u0140\n\2\"\"&&\u0085\u0087\u008a\u008a\u0092\u0092\u0179\u0179"+
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
		"\u01d4\4\2\u01bb\u01bb\u01cd\u01cd\32\2\13\36 \')<>SUX[_ajmqs|~\u0088"+
		"\u008a\u0117\u0119\u013b\u013d\u0141\u0143\u0147\u0149\u014a\u014c\u015e"+
		"\u0162\u017f\u0181\u0183\u0185\u019c\u019e\u019e\u01b3\u01b3\u01cd\u01cd"+
		"\u01d1\u01d1\u01d5\u01d7\2\u06ad\2\u009d\3\2\2\2\4\u00a2\3\2\2\2\6\u00a5"+
		"\3\2\2\2\b\u00af\3\2\2\2\n\u02cd\3\2\2\2\f\u02cf\3\2\2\2\16\u02df\3\2"+
		"\2\2\20\u02ed\3\2\2\2\22\u02ef\3\2\2\2\24\u02f1\3\2\2\2\26\u0305\3\2\2"+
		"\2\30\u0307\3\2\2\2\32\u0310\3\2\2\2\34\u031f\3\2\2\2\36\u032e\3\2\2\2"+
		" \u033a\3\2\2\2\"\u0356\3\2\2\2$\u036a\3\2\2\2&\u036c\3\2\2\2(\u037f\3"+
		"\2\2\2*\u038a\3\2\2\2,\u039e\3\2\2\2.\u03a9\3\2\2\2\60\u03cc\3\2\2\2\62"+
		"\u03d7\3\2\2\2\64\u03e6\3\2\2\2\66\u03ec\3\2\2\28\u03ee\3\2\2\2:\u03f2"+
		"\3\2\2\2<\u03f6\3\2\2\2>\u03fb\3\2\2\2@\u0403\3\2\2\2B\u040b\3\2\2\2D"+
		"\u0418\3\2\2\2F\u0431\3\2\2\2H\u0433\3\2\2\2J\u0435\3\2\2\2L\u0437\3\2"+
		"\2\2N\u0442\3\2\2\2P\u0449\3\2\2\2R\u0452\3\2\2\2T\u0454\3\2\2\2V\u0459"+
		"\3\2\2\2X\u045d\3\2\2\2Z\u0463\3\2\2\2\\\u0465\3\2\2\2^\u0468\3\2\2\2"+
		"`\u046b\3\2\2\2b\u046f\3\2\2\2d\u0473\3\2\2\2f\u047f\3\2\2\2h\u0490\3"+
		"\2\2\2j\u049b\3\2\2\2l\u04ba\3\2\2\2n\u04bc\3\2\2\2p\u04be\3\2\2\2r\u04c2"+
		"\3\2\2\2t\u04c5\3\2\2\2v\u04cb\3\2\2\2x\u04cd\3\2\2\2z\u04d3\3\2\2\2|"+
		"\u04de\3\2\2\2~\u04e2\3\2\2\2\u0080\u0527\3\2\2\2\u0082\u052e\3\2\2\2"+
		"\u0084\u0533\3\2\2\2\u0086\u053b\3\2\2\2\u0088\u053d\3\2\2\2\u008a\u0546"+
		"\3\2\2\2\u008c\u009c\5\4\3\2\u008d\u009c\5\6\4\2\u008e\u009c\5N(\2\u008f"+
		"\u009c\5\30\r\2\u0090\u009c\5 \21\2\u0091\u009c\5\32\16\2\u0092\u009c"+
		"\5\34\17\2\u0093\u009c\5\36\20\2\u0094\u009c\5,\27\2\u0095\u009c\5(\25"+
		"\2\u0096\u009c\58\35\2\u0097\u009c\5:\36\2\u0098\u009c\5<\37\2\u0099\u009c"+
		"\5D#\2\u009a\u009c\7\u01a7\2\2\u009b\u008c\3\2\2\2\u009b\u008d\3\2\2\2"+
		"\u009b\u008e\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0090\3\2\2\2\u009b\u0091"+
		"\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0094\3\2\2\2\u009b"+
		"\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a1\7\2\2\3\u00a1\3\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3\u00a4"+
		"\7@\2\2\u00a4\5\3\2\2\2\u00a5\u00ab\t\3\2\2\u00a6\u00a8\7\u019e\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\5\n"+
		"\6\2\u00aa\u00ac\5\b\5\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\7\3\2\2\2"+
		"\u00af\u00b0\7\u0183\2\2\u00b0\u00b1\7\u0089\2\2\u00b1\u00b8\5\n\6\2\u00b2"+
		"\u00b4\7\u019e\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b7\5\n\6\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\7\u014b\2\2\u00bc\t\3\2\2\2\u00bd\u02ce\7\f\2\2\u00be"+
		"\u02ce\7\r\2\2\u00bf\u00c0\7\16\2\2\u00c0\u00c1\7\u0089\2\2\u00c1\u00c2"+
		"\t\4\2\2\u00c2\u02ce\7\u014b\2\2\u00c3\u02ce\7\23\2\2\u00c4\u00c5\7\25"+
		"\2\2\u00c5\u00c6\7\u0089\2\2\u00c6\u00c7\5H%\2\u00c7\u00c8\7\u014b\2\2"+
		"\u00c8\u02ce\3\2\2\2\u00c9\u00ca\t\5\2\2\u00ca\u00cb\7\u0089\2\2\u00cb"+
		"\u00cc\t\6\2\2\u00cc\u02ce\7\u014b\2\2\u00cd\u02ce\7\30\2\2\u00ce\u02ce"+
		"\7\33\2\2\u00cf\u00d0\t\7\2\2\u00d0\u00d1\7\u0089\2\2\u00d1\u00d2\5H%"+
		"\2\u00d2\u00d3\7\u014b\2\2\u00d3\u02ce\3\2\2\2\u00d4\u02ce\7 \2\2\u00d5"+
		"\u00da\7!\2\2\u00d6\u00d7\7\u0089\2\2\u00d7\u00d8\5H%\2\u00d8\u00d9\7"+
		"\u014b\2\2\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u02ce\3\2\2\2\u00dc\u02ce\7#\2\2\u00dd\u02ce\7$\2\2\u00de\u00df"+
		"\t\b\2\2\u00df\u00e0\7\u0089\2\2\u00e0\u00e1\5H%\2\u00e1\u00e2\7\u014b"+
		"\2\2\u00e2\u02ce\3\2\2\2\u00e3\u02ce\t\t\2\2\u00e4\u00e5\t\n\2\2\u00e5"+
		"\u00e8\7\u0089\2\2\u00e6\u00e9\7\u01a4\2\2\u00e7\u00e9\5H%\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f1\3\2\2\2\u00ea"+
		"\u00ec\7\u019e\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\7E\2\2\u00ee\u00ef\7\u0089\2\2\u00ef\u00f0\7\u01a5"+
		"\2\2\u00f0\u00f2\7\u014b\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00fb\3\2\2\2\u00f3\u00f5\7\u019e\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\u013b\2\2\u00f7\u00f8\7\u0089"+
		"\2\2\u00f8\u00f9\5H%\2\u00f9\u00fa\7\u014b\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f4\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u02ce\7\u014b"+
		"\2\2\u00fe\u00ff\t\13\2\2\u00ff\u0100\7\u0089\2\2\u0100\u0101\5H%\2\u0101"+
		"\u0102\7\u014b\2\2\u0102\u02ce\3\2\2\2\u0103\u02ce\7-\2\2\u0104\u02ce"+
		"\7.\2\2\u0105\u0106\t\f\2\2\u0106\u0108\7\u0089\2\2\u0107\u0109\7\u01aa"+
		"\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u02ce\7\u014b\2\2\u010d\u010e"+
		"\7\63\2\2\u010e\u010f\7\u0089\2\2\u010f\u0110\5H%\2\u0110\u0111\7\u014b"+
		"\2\2\u0111\u02ce\3\2\2\2\u0112\u011e\t\r\2\2\u0113\u0115\7\u0089\2\2\u0114"+
		"\u0116\t\16\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3"+
		"\2\2\2\u0117\u0119\7\u019e\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011b\3\2\2\2\u011a\u011c\t\17\2\2\u011b\u011a\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\7\u014b\2\2\u011e\u0113\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u02ce\3\2\2\2\u0120\u02ce\7\65\2\2\u0121"+
		"\u02ce\t\20\2\2\u0122\u02ce\7\67\2\2\u0123\u02ce\5\f\7\2\u0124\u02ce\t"+
		"\21\2\2\u0125\u0126\t\22\2\2\u0126\u0127\7\u0089\2\2\u0127\u0128\t\23"+
		"\2\2\u0128\u02ce\7\u014b\2\2\u0129\u02ce\7B\2\2\u012a\u02ce\t\24\2\2\u012b"+
		"\u02ce\t\25\2\2\u012c\u02ce\7M\2\2\u012d\u02ce\7U\2\2\u012e\u02ce\7[\2"+
		"\2\u012f\u02ce\t\26\2\2\u0130\u02ce\t\27\2\2\u0131\u02ce\7`\2\2\u0132"+
		"\u0133\t\30\2\2\u0133\u0134\7\u0089\2\2\u0134\u0137\t\31\2\2\u0135\u0136"+
		"\7\u019e\2\2\u0136\u0138\t\31\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u02ce\7\u014b\2\2\u013a\u013b\7b\2\2\u013b"+
		"\u013c\7\u0089\2\2\u013c\u013f\t\32\2\2\u013d\u013e\7\u019e\2\2\u013e"+
		"\u0140\t\33\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u0142\7\u019e\2\2\u0142\u0144\7\u0197\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u02ce\7\u014b\2\2\u0146"+
		"\u02ce\7e\2\2\u0147\u02ce\7f\2\2\u0148\u0149\7h\2\2\u0149\u014a\7\u0089"+
		"\2\2\u014a\u014b\t\34\2\2\u014b\u02ce\7\u014b\2\2\u014c\u014d\7o\2\2\u014d"+
		"\u014e\7\u0089\2\2\u014e\u014f\t\35\2\2\u014f\u02ce\7\u014b\2\2\u0150"+
		"\u0154\t\36\2\2\u0151\u0152\7\u0089\2\2\u0152\u0153\t\37\2\2\u0153\u0155"+
		"\7\u014b\2\2\u0154\u0151\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u02ce\3\2\2"+
		"\2\u0156\u02ce\7p\2\2\u0157\u02ce\7r\2\2\u0158\u02ce\7q\2\2\u0159\u015a"+
		"\t \2\2\u015a\u015b\7\u0089\2\2\u015b\u015c\t!\2\2\u015c\u02ce\7\u014b"+
		"\2\2\u015d\u02ce\7}\2\2\u015e\u02ce\7~\2\2\u015f\u02ce\7\177\2\2\u0160"+
		"\u02ce\7\u0081\2\2\u0161\u0162\t\"\2\2\u0162\u0163\7\u0089\2\2\u0163\u0164"+
		"\5H%\2\u0164\u0165\7\u014b\2\2\u0165\u02ce\3\2\2\2\u0166\u02ce\7\u0083"+
		"\2\2\u0167\u02ce\7\u0084\2\2\u0168\u0169\7\u0088\2\2\u0169\u016a\7\u0089"+
		"\2\2\u016a\u016b\5H%\2\u016b\u016c\7\u014b\2\2\u016c\u02ce\3\2\2\2\u016d"+
		"\u0171\7\u008c\2\2\u016e\u016f\7\u0089\2\2\u016f\u0170\t#\2\2\u0170\u0172"+
		"\7\u014b\2\2\u0171\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u02ce\3\2\2"+
		"\2\u0173\u0174\7\u008d\2\2\u0174\u0175\7\u0089\2\2\u0175\u0176\5H%\2\u0176"+
		"\u0177\7\u019e\2\2\u0177\u017a\5H%\2\u0178\u0179\7\u019e\2\2\u0179\u017b"+
		"\5H%\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\7\u014b\2\2\u017d\u02ce\3\2\2\2\u017e\u017f\7\u0093\2\2\u017f\u0180"+
		"\7\u0089\2\2\u0180\u0181\5H%\2\u0181\u0182\7\u014b\2\2\u0182\u02ce\3\2"+
		"\2\2\u0183\u0187\t$\2\2\u0184\u0185\7\u0089\2\2\u0185\u0186\t%\2\2\u0186"+
		"\u0188\7\u014b\2\2\u0187\u0184\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u02ce"+
		"\3\2\2\2\u0189\u018d\7\u0095\2\2\u018a\u018b\7\u0089\2\2\u018b\u018c\t"+
		"&\2\2\u018c\u018e\7\u014b\2\2\u018d\u018a\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u02ce\3\2\2\2\u018f\u0190\7\u0098\2\2\u0190\u0191\7\u0089\2\2\u0191"+
		"\u0192\t\'\2\2\u0192\u02ce\7\u014b\2\2\u0193\u02ce\7\u009c\2\2\u0194\u02ce"+
		"\7\u009d\2\2\u0195\u02ce\7\u00a0\2\2\u0196\u02ce\7\u00a2\2\2\u0197\u02ce"+
		"\7\u00a4\2\2\u0198\u02ce\7\u00a5\2\2\u0199\u02ce\7\u00a6\2\2\u019a\u019e"+
		"\t(\2\2\u019b\u019c\7\u0089\2\2\u019c\u019d\t)\2\2\u019d\u019f\7\u014b"+
		"\2\2\u019e\u019b\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u02ce\3\2\2\2\u01a0"+
		"\u02ce\7\u00a8\2\2\u01a1\u02ce\7\u00aa\2\2\u01a2\u02ce\7\u00a9\2\2\u01a3"+
		"\u02ce\7\u00ac\2\2\u01a4\u02ce\7\u00ab\2\2\u01a5\u02ce\t*\2\2\u01a6\u02ce"+
		"\t+\2\2\u01a7\u02ce\7\u00b1\2\2\u01a8\u02ce\7\u00b3\2\2\u01a9\u02ce\t"+
		",\2\2\u01aa\u02ce\t-\2\2\u01ab\u02ce\7\u00b8\2\2\u01ac\u02ce\7\u00b2\2"+
		"\2\u01ad\u02ce\t.\2\2\u01ae\u02ce\t/\2\2\u01af\u02ce\t\60\2\2\u01b0\u02ce"+
		"\7\u00c1\2\2\u01b1\u02ce\7\u00c5\2\2\u01b2\u02ce\7\u00c8\2\2\u01b3\u02ce"+
		"\t\61\2\2\u01b4\u02ce\t\62\2\2\u01b5\u02ce\7\u00cd\2\2\u01b6\u02ce\t\63"+
		"\2\2\u01b7\u02ce\7\u00cf\2\2\u01b8\u02ce\7\u00d0\2\2\u01b9\u02ce\7\u00d2"+
		"\2\2\u01ba\u02ce\t\64\2\2\u01bb\u02ce\7\u00d6\2\2\u01bc\u02ce\7\u00d7"+
		"\2\2\u01bd\u02ce\7\u00d8\2\2\u01be\u02ce\7\u00da\2\2\u01bf\u02ce\7\u00db"+
		"\2\2\u01c0\u02ce\7\u00dc\2\2\u01c1\u02ce\7\u00dd\2\2\u01c2\u02ce\7\u00df"+
		"\2\2\u01c3\u02ce\t\65\2\2\u01c4\u02ce\7\u00e2\2\2\u01c5\u02ce\t\66\2\2"+
		"\u01c6\u02ce\t\67\2\2\u01c7\u02ce\t8\2\2\u01c8\u02ce\7\u00eb\2\2\u01c9"+
		"\u02ce\t9\2\2\u01ca\u02ce\7\u00ee\2\2\u01cb\u02ce\7\u00ef\2\2\u01cc\u02ce"+
		"\7\u00f1\2\2\u01cd\u02ce\7\u00f4\2\2\u01ce\u02ce\7\u00f5\2\2\u01cf\u02ce"+
		"\7\u00f6\2\2\u01d0\u02ce\t:\2\2\u01d1\u02ce\t;\2\2\u01d2\u02ce\t<\2\2"+
		"\u01d3\u02ce\7\u0101\2\2\u01d4\u02ce\7\u0102\2\2\u01d5\u02ce\7\u0105\2"+
		"\2\u01d6\u02ce\t=\2\2\u01d7\u02ce\t>\2\2\u01d8\u02ce\7\u0108\2\2\u01d9"+
		"\u02ce\t?\2\2\u01da\u02ce\t@\2\2\u01db\u02ce\tA\2\2\u01dc\u02ce\7\u010f"+
		"\2\2\u01dd\u02ce\7\u0110\2\2\u01de\u02ce\7\u0116\2\2\u01df\u02ce\tB\2"+
		"\2\u01e0\u02ce\7\u0122\2\2\u01e1\u01e2\tC\2\2\u01e2\u01e3\7\u0089\2\2"+
		"\u01e3\u01e4\tD\2\2\u01e4\u02ce\7\u014b\2\2\u01e5\u02ce\7\u0116\2\2\u01e6"+
		"\u02ce\tE\2\2\u01e7\u02ce\tF\2\2\u01e8\u02ce\7\u0120\2\2\u01e9\u02ce\t"+
		"G\2\2\u01ea\u01f6\tH\2\2\u01eb\u01ec\7\u0089\2\2\u01ec\u01f1\5\20\t\2"+
		"\u01ed\u01ee\7\u019e\2\2\u01ee\u01f0\5\20\t\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2"+
		"\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\7\u014b\2\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01eb\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u02ce\3\2\2\2\u01f8\u01f9\7\u0127"+
		"\2\2\u01f9\u01fa\7\u0089\2\2\u01fa\u01fb\tI\2\2\u01fb\u02ce\7\u014b\2"+
		"\2\u01fc\u02ce\tJ\2\2\u01fd\u02ce\tK\2\2\u01fe\u01ff\7\u0131\2\2\u01ff"+
		"\u0200\7\u0089\2\2\u0200\u0201\5H%\2\u0201\u0202\7\u019e\2\2\u0202\u0205"+
		"\5H%\2\u0203\u0204\7\u019e\2\2\u0204\u0206\5H%\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7\u014b\2\2\u0208\u02ce"+
		"\3\2\2\2\u0209\u020a\7\u0132\2\2\u020a\u020b\7\u0089\2\2\u020b\u020c\5"+
		"H%\2\u020c\u020d\7\u019e\2\2\u020d\u020e\5H%\2\u020e\u020f\7\u014b\2\2"+
		"\u020f\u02ce\3\2\2\2\u0210\u0214\tL\2\2\u0211\u0212\7\u0089\2\2\u0212"+
		"\u0213\tM\2\2\u0213\u0215\7\u014b\2\2\u0214\u0211\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u02ce\3\2\2\2\u0216\u02ce\7\u0134\2\2\u0217\u02ce\7\u0136"+
		"\2\2\u0218\u02ce\7\u0130\2\2\u0219\u021a\tN\2\2\u021a\u021b\7\u0089\2"+
		"\2\u021b\u021c\5F$\2\u021c\u021d\7\u014b\2\2\u021d\u02ce\3\2\2\2\u021e"+
		"\u022a\tO\2\2\u021f\u0221\7\u0089\2\2\u0220\u0222\tP\2\2\u0221\u0220\3"+
		"\2\2\2\u0221\u0222\3\2\2\2\u0222\u0227\3\2\2\2\u0223\u0225\7\u019e\2\2"+
		"\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228"+
		"\5H%\2\u0227\u0224\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022b\7\u014b\2\2\u022a\u021f\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u02ce"+
		"\3\2\2\2\u022c\u022d\tQ\2\2\u022d\u022e\7\u0089\2\2\u022e\u022f\tR\2\2"+
		"\u022f\u02ce\7\u014b\2\2\u0230\u02ce\7\u0143\2\2\u0231\u0232\tS\2\2\u0232"+
		"\u0233\7\u0089\2\2\u0233\u0234\t\6\2\2\u0234\u02ce\7\u014b\2\2\u0235\u02ce"+
		"\tT\2\2\u0236\u02ce\7\u0147\2\2\u0237\u0238\7\u014a\2\2\u0238\u023c\7"+
		"\u0089\2\2\u0239\u023d\7\22\2\2\u023a\u023d\7\27\2\2\u023b\u023d\5H%\2"+
		"\u023c\u0239\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u02ce\7\u014b\2\2\u023f\u024b\7\u014c\2\2\u0240\u0241\7"+
		"\u0089\2\2\u0241\u0246\5\22\n\2\u0242\u0243\7\u019e\2\2\u0243\u0245\5"+
		"\22\n\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\7\u014b"+
		"\2\2\u024a\u024c\3\2\2\2\u024b\u0240\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u02ce\3\2\2\2\u024d\u0254\tU\2\2\u024e\u024f\7\u0089\2\2\u024f\u0250"+
		"\5H%\2\u0250\u0251\7\u019e\2\2\u0251\u0252\5H%\2\u0252\u0253\7\u014b\2"+
		"\2\u0253\u0255\3\2\2\2\u0254\u024e\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u02ce"+
		"\3\2\2\2\u0256\u0257\tV\2\2\u0257\u0258\7\u0089\2\2\u0258\u0259\5H%\2"+
		"\u0259\u025a\7\u014b\2\2\u025a\u02ce\3\2\2\2\u025b\u025c\tW\2\2\u025c"+
		"\u025f\7\u0089\2\2\u025d\u0260\7\u008e\2\2\u025e\u0260\5H%\2\u025f\u025d"+
		"\3\2\2\2\u025f\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u02ce\7\u014b\2"+
		"\2\u0262\u02ce\tX\2\2\u0263\u02ce\7\u0158\2\2\u0264\u0265\7\u0159\2\2"+
		"\u0265\u0266\7\u0089\2\2\u0266\u0267\5H%\2\u0267\u0268\7\u014b\2\2\u0268"+
		"\u02ce\3\2\2\2\u0269\u02ce\7\u015a\2\2\u026a\u026f\7\u015b\2\2\u026b\u026c"+
		"\7\u0089\2\2\u026c\u026d\5H%\2\u026d\u026e\7\u014b\2\2\u026e\u0270\3\2"+
		"\2\2\u026f\u026b\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u02ce\3\2\2\2\u0271"+
		"\u02ce\tY\2\2\u0272\u0277\7\u015e\2\2\u0273\u0274\7\u0089\2\2\u0274\u0275"+
		"\5H%\2\u0275\u0276\7\u014b\2\2\u0276\u0278\3\2\2\2\u0277\u0273\3\2\2\2"+
		"\u0277\u0278\3\2\2\2\u0278\u02ce\3\2\2\2\u0279\u0285\tZ\2\2\u027a\u027b"+
		"\7\u0089\2\2\u027b\u0280\5\24\13\2\u027c\u027d\7\u019e\2\2\u027d\u027f"+
		"\5\24\13\2\u027e\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2"+
		"\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284"+
		"\7\u014b\2\2\u0284\u0286\3\2\2\2\u0285\u027a\3\2\2\2\u0285\u0286\3\2\2"+
		"\2\u0286\u02ce\3\2\2\2\u0287\u02ce\t[\2\2\u0288\u02ce\t\\\2\2\u0289\u02ce"+
		"\7\u016d\2\2\u028a\u02ce\t]\2\2\u028b\u0297\7\u0171\2\2\u028c\u028d\7"+
		"\u0089\2\2\u028d\u0292\5\26\f\2\u028e\u028f\7\u019e\2\2\u028f\u0291\5"+
		"\26\f\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\7\u014b"+
		"\2\2\u0296\u0298\3\2\2\2\u0297\u028c\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u02ce\3\2\2\2\u0299\u02ce\7\u0172\2\2\u029a\u029b\7\u0176\2\2\u029b\u029c"+
		"\7\u0089\2\2\u029c\u029d\t^\2\2\u029d\u02ce\7\u014b\2\2\u029e\u02ce\7"+
		"\u017a\2\2\u029f\u02a0\7\u017b\2\2\u02a0\u02a1\7\u0089\2\2\u02a1\u02a2"+
		"\t_\2\2\u02a2\u02ce\7\u014b\2\2\u02a3\u02a4\t`\2\2\u02a4\u02a5\7\u0089"+
		"\2\2\u02a5\u02a6\ta\2\2\u02a6\u02ce\7\u014b\2\2\u02a7\u02a8\tb\2\2\u02a8"+
		"\u02af\7\u0089\2\2\u02a9\u02b0\5F$\2\u02aa\u02ac\7\u01aa\2\2\u02ab\u02aa"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u02a9\3\2\2\2\u02af\u02ab\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02ce\7\u014b\2\2\u02b2\u02b3\tc\2\2\u02b3\u02b4\7\u0089\2"+
		"\2\u02b4\u02b5\td\2\2\u02b5\u02ce\7\u014b\2\2\u02b6\u02bc\te\2\2\u02b7"+
		"\u02b9\7\u0089\2\2\u02b8\u02ba\tf\2\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\7\u014b\2\2\u02bc\u02b7\3\2\2"+
		"\2\u02bc\u02bd\3\2\2\2\u02bd\u02ce\3\2\2\2\u02be\u02bf\tg\2\2\u02bf\u02c0"+
		"\7\u0089\2\2\u02c0\u02c1\5H%\2\u02c1\u02c2\7\u014b\2\2\u02c2\u02ce\3\2"+
		"\2\2\u02c3\u02c4\th\2\2\u02c4\u02c5\7\u0089\2\2\u02c5\u02c6\tP\2\2\u02c6"+
		"\u02ce\7\u014b\2\2\u02c7\u02c8\ti\2\2\u02c8\u02c9\7\u0089\2\2\u02c9\u02ca"+
		"\tI\2\2\u02ca\u02ce\7\u014b\2\2\u02cb\u02ce\7\u018e\2\2\u02cc\u02ce\5"+
		"\26\f\2\u02cd\u00bd\3\2\2\2\u02cd\u00be\3\2\2\2\u02cd\u00bf\3\2\2\2\u02cd"+
		"\u00c3\3\2\2\2\u02cd\u00c4\3\2\2\2\u02cd\u00c9\3\2\2\2\u02cd\u00cd\3\2"+
		"\2\2\u02cd\u00ce\3\2\2\2\u02cd\u00cf\3\2\2\2\u02cd\u00d4\3\2\2\2\u02cd"+
		"\u00d5\3\2\2\2\u02cd\u00dc\3\2\2\2\u02cd\u00dd\3\2\2\2\u02cd\u00de\3\2"+
		"\2\2\u02cd\u00e3\3\2\2\2\u02cd\u00e4\3\2\2\2\u02cd\u00fe\3\2\2\2\u02cd"+
		"\u0103\3\2\2\2\u02cd\u0104\3\2\2\2\u02cd\u0105\3\2\2\2\u02cd\u010d\3\2"+
		"\2\2\u02cd\u0112\3\2\2\2\u02cd\u0120\3\2\2\2\u02cd\u0121\3\2\2\2\u02cd"+
		"\u0122\3\2\2\2\u02cd\u0123\3\2\2\2\u02cd\u0124\3\2\2\2\u02cd\u0125\3\2"+
		"\2\2\u02cd\u0129\3\2\2\2\u02cd\u012a\3\2\2\2\u02cd\u012b\3\2\2\2\u02cd"+
		"\u012c\3\2\2\2\u02cd\u012d\3\2\2\2\u02cd\u012e\3\2\2\2\u02cd\u012f\3\2"+
		"\2\2\u02cd\u0130\3\2\2\2\u02cd\u0131\3\2\2\2\u02cd\u0132\3\2\2\2\u02cd"+
		"\u013a\3\2\2\2\u02cd\u0146\3\2\2\2\u02cd\u0147\3\2\2\2\u02cd\u0148\3\2"+
		"\2\2\u02cd\u014c\3\2\2\2\u02cd\u0150\3\2\2\2\u02cd\u0156\3\2\2\2\u02cd"+
		"\u0157\3\2\2\2\u02cd\u0158\3\2\2\2\u02cd\u0159\3\2\2\2\u02cd\u015d\3\2"+
		"\2\2\u02cd\u015e\3\2\2\2\u02cd\u015f\3\2\2\2\u02cd\u0160\3\2\2\2\u02cd"+
		"\u0161\3\2\2\2\u02cd\u0166\3\2\2\2\u02cd\u0167\3\2\2\2\u02cd\u0168\3\2"+
		"\2\2\u02cd\u016d\3\2\2\2\u02cd\u0173\3\2\2\2\u02cd\u017e\3\2\2\2\u02cd"+
		"\u0183\3\2\2\2\u02cd\u0189\3\2\2\2\u02cd\u018f\3\2\2\2\u02cd\u0193\3\2"+
		"\2\2\u02cd\u0194\3\2\2\2\u02cd\u0195\3\2\2\2\u02cd\u0196\3\2\2\2\u02cd"+
		"\u0197\3\2\2\2\u02cd\u0198\3\2\2\2\u02cd\u0199\3\2\2\2\u02cd\u019a\3\2"+
		"\2\2\u02cd\u01a0\3\2\2\2\u02cd\u01a1\3\2\2\2\u02cd\u01a2\3\2\2\2\u02cd"+
		"\u01a3\3\2\2\2\u02cd\u01a4\3\2\2\2\u02cd\u01a5\3\2\2\2\u02cd\u01a6\3\2"+
		"\2\2\u02cd\u01a7\3\2\2\2\u02cd\u01a8\3\2\2\2\u02cd\u01a9\3\2\2\2\u02cd"+
		"\u01aa\3\2\2\2\u02cd\u01ab\3\2\2\2\u02cd\u01ac\3\2\2\2\u02cd\u01ad\3\2"+
		"\2\2\u02cd\u01ae\3\2\2\2\u02cd\u01af\3\2\2\2\u02cd\u01b0\3\2\2\2\u02cd"+
		"\u01b1\3\2\2\2\u02cd\u01b2\3\2\2\2\u02cd\u01b3\3\2\2\2\u02cd\u01b4\3\2"+
		"\2\2\u02cd\u01b5\3\2\2\2\u02cd\u01b6\3\2\2\2\u02cd\u01b7\3\2\2\2\u02cd"+
		"\u01b8\3\2\2\2\u02cd\u01b9\3\2\2\2\u02cd\u01ba\3\2\2\2\u02cd\u01bb\3\2"+
		"\2\2\u02cd\u01bc\3\2\2\2\u02cd\u01bd\3\2\2\2\u02cd\u01be\3\2\2\2\u02cd"+
		"\u01bf\3\2\2\2\u02cd\u01c0\3\2\2\2\u02cd\u01c1\3\2\2\2\u02cd\u01c2\3\2"+
		"\2\2\u02cd\u01c3\3\2\2\2\u02cd\u01c4\3\2\2\2\u02cd\u01c5\3\2\2\2\u02cd"+
		"\u01c6\3\2\2\2\u02cd\u01c7\3\2\2\2\u02cd\u01c8\3\2\2\2\u02cd\u01c9\3\2"+
		"\2\2\u02cd\u01ca\3\2\2\2\u02cd\u01cb\3\2\2\2\u02cd\u01cc\3\2\2\2\u02cd"+
		"\u01cd\3\2\2\2\u02cd\u01ce\3\2\2\2\u02cd\u01cf\3\2\2\2\u02cd\u01d0\3\2"+
		"\2\2\u02cd\u01d1\3\2\2\2\u02cd\u01d2\3\2\2\2\u02cd\u01d3\3\2\2\2\u02cd"+
		"\u01d4\3\2\2\2\u02cd\u01d5\3\2\2\2\u02cd\u01d6\3\2\2\2\u02cd\u01d7\3\2"+
		"\2\2\u02cd\u01d8\3\2\2\2\u02cd\u01d9\3\2\2\2\u02cd\u01da\3\2\2\2\u02cd"+
		"\u01db\3\2\2\2\u02cd\u01dc\3\2\2\2\u02cd\u01dd\3\2\2\2\u02cd\u01de\3\2"+
		"\2\2\u02cd\u01df\3\2\2\2\u02cd\u01e0\3\2\2\2\u02cd\u01e1\3\2\2\2\u02cd"+
		"\u01e5\3\2\2\2\u02cd\u01e6\3\2\2\2\u02cd\u01e7\3\2\2\2\u02cd\u01e8\3\2"+
		"\2\2\u02cd\u01e9\3\2\2\2\u02cd\u01ea\3\2\2\2\u02cd\u01f8\3\2\2\2\u02cd"+
		"\u01fc\3\2\2\2\u02cd\u01fd\3\2\2\2\u02cd\u01fe\3\2\2\2\u02cd\u0209\3\2"+
		"\2\2\u02cd\u0210\3\2\2\2\u02cd\u0216\3\2\2\2\u02cd\u0217\3\2\2\2\u02cd"+
		"\u0218\3\2\2\2\u02cd\u0219\3\2\2\2\u02cd\u021e\3\2\2\2\u02cd\u022c\3\2"+
		"\2\2\u02cd\u0230\3\2\2\2\u02cd\u0231\3\2\2\2\u02cd\u0235\3\2\2\2\u02cd"+
		"\u0236\3\2\2\2\u02cd\u0237\3\2\2\2\u02cd\u023f\3\2\2\2\u02cd\u024d\3\2"+
		"\2\2\u02cd\u0256\3\2\2\2\u02cd\u025b\3\2\2\2\u02cd\u0262\3\2\2\2\u02cd"+
		"\u0263\3\2\2\2\u02cd\u0264\3\2\2\2\u02cd\u0269\3\2\2\2\u02cd\u026a\3\2"+
		"\2\2\u02cd\u0271\3\2\2\2\u02cd\u0272\3\2\2\2\u02cd\u0279\3\2\2\2\u02cd"+
		"\u0287\3\2\2\2\u02cd\u0288\3\2\2\2\u02cd\u0289\3\2\2\2\u02cd\u028a\3\2"+
		"\2\2\u02cd\u028b\3\2\2\2\u02cd\u0299\3\2\2\2\u02cd\u029a\3\2\2\2\u02cd"+
		"\u029e\3\2\2\2\u02cd\u029f\3\2\2\2\u02cd\u02a3\3\2\2\2\u02cd\u02a7\3\2"+
		"\2\2\u02cd\u02b2\3\2\2\2\u02cd\u02b6\3\2\2\2\u02cd\u02be\3\2\2\2\u02cd"+
		"\u02c3\3\2\2\2\u02cd\u02c7\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2"+
		"\2\2\u02ce\13\3\2\2\2\u02cf\u02d0\tj\2\2\u02d0\u02d1\7\u0089\2\2\u02d1"+
		"\u02db\5\16\b\2\u02d2\u02d4\7\u01aa\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d9\7\u019e\2\2\u02d8\u02d3\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02da"+
		"\3\2\2\2\u02da\u02dc\5H%\2\u02db\u02d8\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02de\7\u014b\2\2\u02de\r\3\2\2\2\u02df\u02e0\tk"+
		"\2\2\u02e0\17\3\2\2\2\u02e1\u02ee\7\u018b\2\2\u02e2\u02e3\7\u018b\2\2"+
		"\u02e3\u02e4\7\u0089\2\2\u02e4\u02e5\tl\2\2\u02e5\u02ee\7\u014b\2\2\u02e6"+
		"\u02ee\7\u011e\2\2\u02e7\u02ee\7\u0139\2\2\u02e8\u02ee\7\u00f0\2\2\u02e9"+
		"\u02ee\7\32\2\2\u02ea\u02ee\7\u00a1\2\2\u02eb\u02ee\7\u0094\2\2\u02ec"+
		"\u02ee\7\13\2\2\u02ed\u02e1\3\2\2\2\u02ed\u02e2\3\2\2\2\u02ed\u02e6\3"+
		"\2\2\2\u02ed\u02e7\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ed"+
		"\u02ea\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee\21\3\2\2"+
		"\2\u02ef\u02f0\tm\2\2\u02f0\23\3\2\2\2\u02f1\u02f2\tn\2\2\u02f2\25\3\2"+
		"\2\2\u02f3\u0306\7J\2\2\u02f4\u0306\7\u00be\2\2\u02f5\u0306\7i\2\2\u02f6"+
		"\u0306\7\u00d3\2\2\u02f7\u02fb\to\2\2\u02f8\u02f9\7\u0089\2\2\u02f9\u02fa"+
		"\tp\2\2\u02fa\u02fc\7\u014b\2\2\u02fb\u02f8\3\2\2\2\u02fb\u02fc\3\2\2"+
		"\2\u02fc\u0306\3\2\2\2\u02fd\u0306\7\u00f8\2\2\u02fe\u0306\7\u00f9\2\2"+
		"\u02ff\u0306\7\u0162\2\2\u0300\u0306\7\u0157\2\2\u0301\u0306\7\u00ff\2"+
		"\2\u0302\u0306\7\u0100\2\2\u0303\u0306\7O\2\2\u0304\u0306\7\u00c2\2\2"+
		"\u0305\u02f3\3\2\2\2\u0305\u02f4\3\2\2\2\u0305\u02f5\3\2\2\2\u0305\u02f6"+
		"\3\2\2\2\u0305\u02f7\3\2\2\2\u0305\u02fd\3\2\2\2\u0305\u02fe\3\2\2\2\u0305"+
		"\u02ff\3\2\2\2\u0305\u0300\3\2\2\2\u0305\u0301\3\2\2\2\u0305\u0302\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306\27\3\2\2\2\u0307\u030b"+
		"\7\3\2\2\u0308\u030a\7\u01ac\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2"+
		"\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030e\u030f\7\u01a7\2\2\u030f\31\3\2\2\2\u0310\u0311\7Y\2\2\u0311"+
		"\u0317\7!\2\2\u0312\u0318\5@!\2\u0313\u0318\5\30\r\2\u0314\u0318\7\u0142"+
		"\2\2\u0315\u0318\7(\2\2\u0316\u0318\7\u0148\2\2\u0317\u0312\3\2\2\2\u0317"+
		"\u0313\3\2\2\2\u0317\u0314\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2"+
		"\2\2\u0318\u0319\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031d\7T\2\2\u031c\u031e\7\u01a0\2\2\u031d\u031c"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\33\3\2\2\2\u031f\u0326\7Z\2\2\u0320"+
		"\u0322\7\u01da\2\2\u0321\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0321"+
		"\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0327\5\30\r\2"+
		"\u0326\u0321\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0326"+
		"\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\7T\2\2\u032b"+
		"\u032d\7\u01a0\2\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\35\3"+
		"\2\2\2\u032e\u032f\7Y\2\2\u032f\u0332\7\u015e\2\2\u0330\u0333\5@!\2\u0331"+
		"\u0333\5\30\r\2\u0332\u0330\3\2\2\2\u0332\u0331\3\2\2\2\u0333\u0334\3"+
		"\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0338\7T\2\2\u0337\u0339\7\u01a0\2\2\u0338\u0337\3\2\2\2\u0338\u0339"+
		"\3\2\2\2\u0339\37\3\2\2\2\u033a\u033b\7(\2\2\u033b\u0348\5\"\22\2\u033c"+
		"\u033e\7\u01a7\2\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d"+
		"\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0344\3\2\2\2\u0341\u033f\3\2\2\2\u0342"+
		"\u0345\5&\24\2\u0343\u0345\7\u016c\2\2\u0344\u0342\3\2\2\2\u0344\u0343"+
		"\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u033f\3\2\2\2\u0347\u034a\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034e\3\2\2\2\u034a\u0348\3\2"+
		"\2\2\u034b\u034d\7\u01a7\2\2\u034c\u034b\3\2\2\2\u034d\u0350\3\2\2\2\u034e"+
		"\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u034e\3\2"+
		"\2\2\u0351\u0352\7\u01a0\2\2\u0352!\3\2\2\2\u0353\u0357\5H%\2\u0354\u0357"+
		"\5F$\2\u0355\u0357\5J&\2\u0356\u0353\3\2\2\2\u0356\u0354\3\2\2\2\u0356"+
		"\u0355\3\2\2\2\u0357\u0366\3\2\2\2\u0358\u035a\7\u01a7\2\2\u0359\u0358"+
		"\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u0362\tq\2\2\u035f\u0361\7\u01a7"+
		"\2\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0367\5$"+
		"\23\2\u0366\u035b\3\2\2\2\u0366\u0367\3\2\2\2\u0367#\3\2\2\2\u0368\u036b"+
		"\5H%\2\u0369\u036b\5F$\2\u036a\u0368\3\2\2\2\u036a\u0369\3\2\2\2\u036b"+
		"%\3\2\2\2\u036c\u0370\7\u0149\2\2\u036d\u036f\7\u01a7\2\2\u036e\u036d"+
		"\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u037c\5.\30\2\u0374\u0376\7\u01a7"+
		"\2\2\u0375\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0375\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\5.\30\2\u037a\u0375\3\2"+
		"\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\'\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0384\5*\26\2\u0380\u0383\5 \21\2"+
		"\u0381\u0383\5@!\2\u0382\u0380\3\2\2\2\u0382\u0381\3\2\2\2\u0383\u0386"+
		"\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0388\3\2\2\2\u0386"+
		"\u0384\3\2\2\2\u0387\u0389\5,\27\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2"+
		"\2\2\u0389)\3\2\2\2\u038a\u0392\7\u0148\2\2\u038b\u038d\7\u01a7\2\2\u038c"+
		"\u038b\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2"+
		"\2\2\u038f\u0391\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u0393\5.\30\2\u0392"+
		"\u038e\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2"+
		"\2\2\u0395\u0399\3\2\2\2\u0396\u0398\7\u01a7\2\2\u0397\u0396\3\2\2\2\u0398"+
		"\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2"+
		"\2\2\u039b\u0399\3\2\2\2\u039c\u039d\7\u01a0\2\2\u039d+\3\2\2\2\u039e"+
		"\u039f\7\u0148\2\2\u039f\u03a3\7\u012b\2\2\u03a0\u03a2\7\u01a7\2\2\u03a1"+
		"\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a7\7\u01a0\2\2\u03a7"+
		"-\3\2\2\2\u03a8\u03aa\tr\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03af\5\64\33\2\u03ac\u03ae\7\u01a7\2\2\u03ad\u03ac"+
		"\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0"+
		"\u03b2\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b6\7\36\2\2\u03b3\u03b5\7"+
		"\u01a7\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2"+
		"\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03c1"+
		"\5\66\34\2\u03ba\u03bc\7\u01a7\2\2\u03bb\u03ba\3\2\2\2\u03bc\u03bf\3\2"+
		"\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf"+
		"\u03bd\3\2\2\2\u03c0\u03c2\5\60\31\2\u03c1\u03bd\3\2\2\2\u03c1\u03c2\3"+
		"\2\2\2\u03c2\u03ca\3\2\2\2\u03c3\u03c5\7\u01a7\2\2\u03c4\u03c3\3\2\2\2"+
		"\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9"+
		"\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03cb\5\62\32\2\u03ca\u03c6\3\2\2\2"+
		"\u03ca\u03cb\3\2\2\2\u03cb/\3\2\2\2\u03cc\u03d0\tq\2\2\u03cd\u03cf\7\u01a7"+
		"\2\2\u03ce\u03cd\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0"+
		"\u03d1\3\2\2\2\u03d1\u03d5\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d6\5H"+
		"%\2\u03d4\u03d6\5F$\2\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6\61"+
		"\3\2\2\2\u03d7\u03db\7\u012d\2\2\u03d8\u03da\7\u01a7\2\2\u03d9\u03d8\3"+
		"\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc"+
		"\u03e0\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e1\5H%\2\u03df\u03e1\5F$\2"+
		"\u03e0\u03de\3\2\2\2\u03e0\u03df\3\2\2\2\u03e1\63\3\2\2\2\u03e2\u03e7"+
		"\5H%\2\u03e3\u03e7\5F$\2\u03e4\u03e7\5> \2\u03e5\u03e7\5D#\2\u03e6\u03e2"+
		"\3\2\2\2\u03e6\u03e3\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7"+
		"\65\3\2\2\2\u03e8\u03ed\5H%\2\u03e9\u03ed\5F$\2\u03ea\u03ed\5> \2\u03eb"+
		"\u03ed\5D#\2\u03ec\u03e8\3\2\2\2\u03ec\u03e9\3\2\2\2\u03ec\u03ea\3\2\2"+
		"\2\u03ec\u03eb\3\2\2\2\u03ed\67\3\2\2\2\u03ee\u03f0\7N\2\2\u03ef\u03f1"+
		"\7\u01a0\2\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f19\3\2\2\2\u03f2"+
		"\u03f4\ts\2\2\u03f3\u03f5\7\u01a0\2\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5"+
		"\3\2\2\2\u03f5;\3\2\2\2\u03f6\u03f7\7\u0173\2\2\u03f7\u03f9\5H%\2\u03f8"+
		"\u03fa\7\u01a0\2\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa=\3\2"+
		"\2\2\u03fb\u03fd\7\u01a1\2\2\u03fc\u03fe\5@!\2\u03fd\u03fc\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7\u01a1\2\2\u0400?\3\2"+
		"\2\2\u0401\u0404\5D#\2\u0402\u0404\7\u01a7\2\2\u0403\u0401\3\2\2\2\u0403"+
		"\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2"+
		"\2\2\u0406A\3\2\2\2\u0407\u040c\5D#\2\u0408\u040c\7(\2\2\u0409\u040c\7"+
		"\u0148\2\2\u040a\u040c\7\u01a7\2\2\u040b\u0407\3\2\2\2\u040b\u0408\3\2"+
		"\2\2\u040b\u0409\3\2\2\2\u040b\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040eC\3\2\2\2\u040f\u0419\5F$\2\u0410"+
		"\u0419\5H%\2\u0411\u0419\5J&\2\u0412\u0419\7\u01a6\2\2\u0413\u0419\7\u01aa"+
		"\2\2\u0414\u0419\7\u01a0\2\2\u0415\u0419\7\u0089\2\2\u0416\u0419\7\u014b"+
		"\2\2\u0417\u0419\5L\'\2\u0418\u040f\3\2\2\2\u0418\u0410\3\2\2\2\u0418"+
		"\u0411\3\2\2\2\u0418\u0412\3\2\2\2\u0418\u0413\3\2\2\2\u0418\u0414\3\2"+
		"\2\2\u0418\u0415\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0417\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u042c\3\2"+
		"\2\2\u041c\u041d\7\u01a7\2\2\u041d\u0426\7\4\2\2\u041e\u0427\5F$\2\u041f"+
		"\u0427\5H%\2\u0420\u0427\5J&\2\u0421\u0427\7\u01a6\2\2\u0422\u0427\7\u01aa"+
		"\2\2\u0423\u0427\7\u01a0\2\2\u0424\u0427\7\u0089\2\2\u0425\u0427\7\u014b"+
		"\2\2\u0426\u041e\3\2\2\2\u0426\u041f\3\2\2\2\u0426\u0420\3\2\2\2\u0426"+
		"\u0421\3\2\2\2\u0426\u0422\3\2\2\2\u0426\u0423\3\2\2\2\u0426\u0424\3\2"+
		"\2\2\u0426\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0426\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u041c\3\2\2\2\u042b\u042e\3\2"+
		"\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042dE\3\2\2\2\u042e\u042c"+
		"\3\2\2\2\u042f\u0432\7\u01a4\2\2\u0430\u0432\5\u008aF\2\u0431\u042f\3"+
		"\2\2\2\u0431\u0430\3\2\2\2\u0432G\3\2\2\2\u0433\u0434\tt\2\2\u0434I\3"+
		"\2\2\2\u0435\u0436\7\u01a5\2\2\u0436K\3\2\2\2\u0437\u0438\7=\2\2\u0438"+
		"\u043c\7\u0089\2\2\u0439\u043d\5F$\2\u043a\u043d\7(\2\2\u043b\u043d\7"+
		"\u0142\2\2\u043c\u0439\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043b\3\2\2\2"+
		"\u043d\u043e\3\2\2\2\u043e\u043f\7\u014b\2\2\u043fM\3\2\2\2\u0440\u0443"+
		"\5P)\2\u0441\u0443\5R*\2\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2\2\u0443"+
		"O\3\2\2\2\u0444\u044a\5T+\2\u0445\u044a\5V,\2\u0446\u044a\5X-\2\u0447"+
		"\u044a\5\\/\2\u0448\u044a\5^\60\2\u0449\u0444\3\2\2\2\u0449\u0445\3\2"+
		"\2\2\u0449\u0446\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u0448\3\2\2\2\u044a"+
		"Q\3\2\2\2\u044b\u0453\5f\64\2\u044c\u0453\5p9\2\u044d\u0453\5r:\2\u044e"+
		"\u0453\5t;\2\u044f\u0453\5x=\2\u0450\u0453\5z>\2\u0451\u0453\5|?\2\u0452"+
		"\u044b\3\2\2\2\u0452\u044c\3\2\2\2\u0452\u044d\3\2\2\2\u0452\u044e\3\2"+
		"\2\2\u0452\u044f\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0451\3\2\2\2\u0453"+
		"S\3\2\2\2\u0454\u0455\7\u019f\2\2\u0455\u0457\tu\2\2\u0456\u0458\tv\2"+
		"\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458U\3\2\2\2\u0459\u045a"+
		"\7\u019f\2\2\u045a\u045b\7r\2\2\u045b\u045c\tw\2\2\u045cW\3\2\2\2\u045d"+
		"\u045e\7\31\2\2\u045e\u045f\5Z.\2\u045fY\3\2\2\2\u0460\u0464\5H%\2\u0461"+
		"\u0464\5F$\2\u0462\u0464\5J&\2\u0463\u0460\3\2\2\2\u0463\u0461\3\2\2\2"+
		"\u0463\u0462\3\2\2\2\u0464[\3\2\2\2\u0465\u0466\7s\2\2\u0466\u0467\7\u01a3"+
		"\2\2\u0467]\3\2\2\2\u0468\u0469\7<\2\2\u0469\u046a\5d\63\2\u046a_\3\2"+
		"\2\2\u046b\u046c\5b\62\2\u046c\u046d\7\u01b4\2\2\u046d\u046e\5b\62\2\u046e"+
		"a\3\2\2\2\u046f\u0470\7\u01a3\2\2\u0470c\3\2\2\2\u0471\u0474\5b\62\2\u0472"+
		"\u0474\5`\61\2\u0473\u0471\3\2\2\2\u0473\u0472\3\2\2\2\u0474\u047c\3\2"+
		"\2\2\u0475\u0478\7\u019e\2\2\u0476\u0479\5b\62\2\u0477\u0479\5`\61\2\u0478"+
		"\u0476\3\2\2\2\u0478\u0477\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u0475\3\2"+
		"\2\2\u047b\u047e\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d"+
		"e\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0480\7\u019f\2\2\u0480\u0481\7;\2"+
		"\2\u0481\u0483\7\u01a4\2\2\u0482\u0484\7\u01ba\2\2\u0483\u0482\3\2\2\2"+
		"\u0483\u0484\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0488\5h\65\2\u0486\u0488"+
		"\7\u01c8\2\2\u0487\u0485\3\2\2\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2"+
		"\2\u0488\u048a\3\2\2\2\u0489\u048b\7\u01cf\2\2\u048a\u0489\3\2\2\2\u048a"+
		"\u048b\3\2\2\2\u048bg\3\2\2\2\u048c\u0491\5H%\2\u048d\u0491\5j\66\2\u048e"+
		"\u0491\7\u01a4\2\2\u048f\u0491\7\u01d0\2\2\u0490\u048c\3\2\2\2\u0490\u048d"+
		"\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u048f\3\2\2\2\u0491i\3\2\2\2\u0492"+
		"\u0494\7\u0089\2\2\u0493\u0492\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493"+
		"\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0495\3\2\2\2\u0498"+
		"\u0499\5l\67\2\u0499\u049a\5n8\2\u049a\u049c\3\2\2\2\u049b\u0495\3\2\2"+
		"\2\u049c\u049d\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04b0"+
		"\3\2\2\2\u049f\u04a1\7\u0089\2\2\u04a0\u049f\3\2\2\2\u04a1\u04a4\3\2\2"+
		"\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a2"+
		"\3\2\2\2\u04a5\u04a9\5l\67\2\u04a6\u04a8\7\u014b\2\2\u04a7\u04a6\3\2\2"+
		"\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac"+
		"\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04ad\5n8\2\u04ad\u04af\3\2\2\2\u04ae"+
		"\u04a2\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2"+
		"\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b7\5l\67\2\u04b4"+
		"\u04b6\7\u014b\2\2\u04b5\u04b4\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5"+
		"\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8k\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba"+
		"\u04bb\tx\2\2\u04bbm\3\2\2\2\u04bc\u04bd\ty\2\2\u04bdo\3\2\2\2\u04be\u04bf"+
		"\7\u019f\2\2\u04bf\u04c0\7\u01c7\2\2\u04c0\u04c1\5\u0080A\2\u04c1q\3\2"+
		"\2\2\u04c2\u04c3\7\u019f\2\2\u04c3\u04c4\7\u01c1\2\2\u04c4s\3\2\2\2\u04c5"+
		"\u04c6\7\u019f\2\2\u04c6\u04c7\7\u01c3\2\2\u04c7u\3\2\2\2\u04c8\u04cc"+
		"\5j\66\2\u04c9\u04cc\7\u01a4\2\2\u04ca\u04cc\5H%\2\u04cb\u04c8\3\2\2\2"+
		"\u04cb\u04c9\3\2\2\2\u04cb\u04ca\3\2\2\2\u04ccw\3\2\2\2\u04cd\u04ce\7"+
		"\u019f\2\2\u04ce\u04d1\7\u01c5\2\2\u04cf\u04d2\7\u01d6\2\2\u04d0\u04d2"+
		"\5v<\2\u04d1\u04cf\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2y\3\2\2\2\u04d3\u04d4"+
		"\7\u019f\2\2\u04d4\u04dc\7\u01d7\2\2\u04d5\u04d8\5v<\2\u04d6\u04d7\tz"+
		"\2\2\u04d7\u04d9\5v<\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04dd"+
		"\3\2\2\2\u04da\u04dd\5\u0080A\2\u04db\u04dd\7\u01ce\2\2\u04dc\u04d5\3"+
		"\2\2\2\u04dc\u04da\3\2\2\2\u04dc\u04db\3\2\2\2\u04dd{\3\2\2\2\u04de\u04df"+
		"\7\u019f\2\2\u04df\u04e0\7\u01c2\2\2\u04e0}\3\2\2\2\u04e1\u04e3\7\u01ca"+
		"\2\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4"+
		"\u04e6\7\u01cc\2\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u0502"+
		"\3\2\2\2\u04e7\u0503\7\u01c4\2\2\u04e8\u0503\7\u01b0\2\2\u04e9\u0503\7"+
		"\u01b6\2\2\u04ea\u0503\7\u01b2\2\2\u04eb\u04ed\7\u01c6\2\2\u04ec\u04ee"+
		"\7\u01d2\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u0503\3\2\2"+
		"\2\u04ef\u0503\7\u01b1\2\2\u04f0\u04f2\7\u01cb\2\2\u04f1\u04f3\7\u01d2"+
		"\2\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u0503\3\2\2\2\u04f4"+
		"\u0503\7\u01b8\2\2\u04f5\u04f7\7\u01cb\2\2\u04f6\u04f8\7\u01d2\2\2\u04f7"+
		"\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\7\u01cd"+
		"\2\2\u04fa\u0503\7\u01c4\2\2\u04fb\u0503\7\u01b7\2\2\u04fc\u04fe\7\u01c6"+
		"\2\2\u04fd\u04ff\7\u01d2\2\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0501\7\u01cd\2\2\u0501\u0503\7\u01c4\2\2\u0502\u04e7"+
		"\3\2\2\2\u0502\u04e8\3\2\2\2\u0502\u04e9\3\2\2\2\u0502\u04ea\3\2\2\2\u0502"+
		"\u04eb\3\2\2\2\u0502\u04ef\3\2\2\2\u0502\u04f0\3\2\2\2\u0502\u04f4\3\2"+
		"\2\2\u0502\u04f5\3\2\2\2\u0502\u04fb\3\2\2\2\u0502\u04fc\3\2\2\2\u0503"+
		"\u0505\3\2\2\2\u0504\u0506\7\u01d5\2\2\u0505\u0504\3\2\2\2\u0505\u0506"+
		"\3\2\2\2\u0506\177\3\2\2\2\u0507\u0509\7\u0089\2\2\u0508\u0507\3\2\2\2"+
		"\u0509\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d"+
		"\3\2\2\2\u050c\u050a\3\2\2\2\u050d\u051e\5\u0082B\2\u050e\u0512\t{\2\2"+
		"\u050f\u0511\7\u0089\2\2\u0510\u050f\3\2\2\2\u0511\u0514\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u0512\3\2"+
		"\2\2\u0515\u0519\5\u0082B\2\u0516\u0518\7\u014b\2\2\u0517\u0516\3\2\2"+
		"\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051d"+
		"\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u050e\3\2\2\2\u051d\u0520\3\2\2\2\u051e"+
		"\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0524\3\2\2\2\u0520\u051e\3\2"+
		"\2\2\u0521\u0523\7\u014b\2\2\u0522\u0521\3\2\2\2\u0523\u0526\3\2\2\2\u0524"+
		"\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0524\3\2"+
		"\2\2\u0527\u050a\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u0527\3\2\2\2\u0529"+
		"\u052a\3\2\2\2\u052a\u0081\3\2\2\2\u052b\u052f\5\u0084C\2\u052c\u052f"+
		"\5\u0088E\2\u052d\u052f\5\u0086D\2\u052e\u052b\3\2\2\2\u052e\u052c\3\2"+
		"\2\2\u052e\u052d\3\2\2\2\u052f\u0083\3\2\2\2\u0530\u0534\5j\66\2\u0531"+
		"\u0534\7\u01a4\2\2\u0532\u0534\5H%\2\u0533\u0530\3\2\2\2\u0533\u0531\3"+
		"\2\2\2\u0533\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0539\5~@\2\u0536"+
		"\u053a\5j\66\2\u0537\u053a\7\u01a4\2\2\u0538\u053a\5H%\2\u0539\u0536\3"+
		"\2\2\2\u0539\u0537\3\2\2\2\u0539\u0538\3\2\2\2\u053a\u0085\3\2\2\2\u053b"+
		"\u053c\7\u01a4\2\2\u053c\u0087\3\2\2\2\u053d\u053f\7\u01a4\2\2\u053e\u0540"+
		"\7\u01ca\2\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\3\2\2"+
		"\2\u0541\u0543\7\u01cc\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u0545\7\u01be\2\2\u0545\u0089\3\2\2\2\u0546\u0547"+
		"\t|\2\2\u0547\u008b\3\2\2\2\u009e\u009b\u009d\u00a7\u00ab\u00ad\u00b3"+
		"\u00b8\u00da\u00e8\u00eb\u00f1\u00f4\u00fb\u010a\u0115\u0118\u011b\u011e"+
		"\u0137\u013f\u0143\u0154\u0171\u017a\u0187\u018d\u019e\u01f1\u01f6\u0205"+
		"\u0214\u0221\u0224\u0227\u022a\u023c\u0246\u024b\u0254\u025f\u026f\u0277"+
		"\u0280\u0285\u0292\u0297\u02ad\u02af\u02b9\u02bc\u02cd\u02d5\u02d8\u02db"+
		"\u02ed\u02fb\u0305\u030b\u0317\u0319\u031d\u0323\u0326\u0328\u032c\u0332"+
		"\u0334\u0338\u033f\u0344\u0348\u034e\u0356\u035b\u0362\u0366\u036a\u0370"+
		"\u0377\u037c\u0382\u0384\u0388\u038e\u0394\u0399\u03a3\u03a9\u03af\u03b6"+
		"\u03bd\u03c1\u03c6\u03ca\u03d0\u03d5\u03db\u03e0\u03e6\u03ec\u03f0\u03f4"+
		"\u03f9\u03fd\u0403\u0405\u040b\u040d\u0418\u041a\u0426\u0428\u042c\u0431"+
		"\u043c\u0442\u0449\u0452\u0457\u0463\u0473\u0478\u047c\u0483\u0487\u048a"+
		"\u0490\u0495\u049d\u04a2\u04a9\u04b0\u04b7\u04cb\u04d1\u04d8\u04dc\u04e2"+
		"\u04e5\u04ed\u04f2\u04f7\u04fe\u0502\u0505\u050a\u0512\u0519\u051e\u0524"+
		"\u0529\u052e\u0533\u0539\u053f\u0542";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}