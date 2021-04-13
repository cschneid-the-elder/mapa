// Generated from src/CobolPreprocessorParser.g4 by ANTLR 4.7.2
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
		CLASSIC_COMMENT_TAG=1, CLASSIC_CONTINUATION=2, CLASSIC_LINE_NUMBER=3, 
		CLASSIC_EOL_COMMENT=4, ID_DIVISION_TAG=5, NIST_FLAG1=6, NIST_FLAG2=7, 
		NIST_IGNORED_LINE=8, ABD=9, ADATA=10, ADV=11, AFP=12, ALIAS=13, ALPHNUM=14, 
		ANSI=15, ANY=16, APOST=17, AR=18, ARCH=19, ARITH=20, AUTO=21, AWO=22, 
		BIN=23, BLOCK0=24, BUF=25, BUFSIZE=26, BY=27, CBL=28, CBLCARD=29, CICS=30, 
		CO=31, COBOL2=32, COBOL3=33, CODEPAGE=34, COMPAT=35, COMPILE=36, COPY=37, 
		COPYLOC=38, COPYRIGHT=39, CP=40, CPLC=41, CPP=42, CPSM=43, CPYR=44, CS=45, 
		CURR=46, CURRENCY=47, DATA=48, DATEPROC=49, DBCS=50, DD=51, DEBUG=52, 
		DEC=53, DECK=54, DEF=55, DEFINE=56, DIAGTRUNC=57, DISPSIGN=58, DIVISION=59, 
		DLI=60, DLL=61, DP=62, DS=63, DSN=64, DSNAME=65, DTR=66, DU=67, DUMP=68, 
		DWARF=69, DYN=70, DYNAM=71, EDF=72, EJECT=73, EJPD=74, EN=75, ENDP=76, 
		ENDPERIOD=77, ENGLISH=78, END_EXEC=79, EPILOG=80, EVENP=81, EVENPACK=82, 
		EXCI=83, EXEC=84, EXIT=85, EXP=86, EXPORTALL=87, EXTEND=88, FASTSRT=89, 
		FEPI=90, FLAG=91, FLAGSTD=92, FSRT=93, FULL=94, GDS=95, GRAPHIC=96, HEX=97, 
		HGPR=98, HOOK=99, IC=100, ID=101, IDENTIFICATION=102, IN=103, INITCHECK=104, 
		INTDATE=105, INITIAL=106, INL=107, JA=108, JP=109, KA=110, LANG=111, LANGUAGE=112, 
		LAX=113, LAXPERF=114, LC=115, LEADING=116, LEASM=117, LENGTH=118, LIB=119, 
		LILIAN=120, LIN=121, LINECOUNT=122, LINKAGE=123, LIST=124, LM=125, LONGMIXED=126, 
		LONGUPPER=127, LP=128, LPARENCHAR=129, LU=130, LXPRF=131, MAP=132, MARGINS=133, 
		MAX=134, MD=135, MDECK=136, MIG=137, MIXED=138, MAXPCF=139, MSG=140, NAME=141, 
		NAT=142, NATIONAL=143, NATLANG=144, NC=145, NN=146, NO=147, NOADATA=148, 
		NOADV=149, NOALIAS=150, NOALPHNUM=151, NOAWO=152, NOBIN=153, NOBLOCK0=154, 
		NOC=155, NOCBLCARD=156, NOCICS=157, NOCMPR2=158, NOCOMPILE=159, NOCOPYLOC=160, 
		NOCOPYRIGHT=161, NOCPLC=162, NOCPSM=163, NOCPYR=164, NOCURR=165, NOCURRENCY=166, 
		NOD=167, NODATEPROC=168, NODBCS=169, NODE=170, NODEBUG=171, NODECK=172, 
		NODEFINE=173, NODEF=174, NODIAGTRUNC=175, NODLL=176, NODSNAME=177, NODU=178, 
		NODUMP=179, NODP=180, NODTR=181, NODWARF=182, NODYN=183, NODYNAM=184, 
		NOEDF=185, NOEJPD=186, NOENDP=187, NOENDPERIOD=188, NOEPILOG=189, NOEVENP=190, 
		NOEVENPACK=191, NOEXIT=192, NOEXP=193, NOEXPORTALL=194, NOF=195, NOFASTSRT=196, 
		NOFEPI=197, NOFLAG=198, NOFLAGMIG=199, NOFLAGSTD=200, NOFSRT=201, NOGRAPHIC=202, 
		NOHOOK=203, NOINITCHECK=204, NOIC=205, NOINITIAL=206, NOINLINE=207, NOINL=208, 
		NOLAXPERF=209, NOLENGTH=210, NOLIB=211, NOLINKAGE=212, NOLIST=213, NOLXPRF=214, 
		NOMAP=215, NOMD=216, NOMDECK=217, NONAME=218, NONUM=219, NONUMBER=220, 
		NOOBJ=221, NOOBJECT=222, NOOMITODOMIN=223, NOOFF=224, NOOFFSET=225, NOOOM=226, 
		NOOPSEQUENCE=227, NOOPT=228, NOOPTIMIZE=229, NOOPTIONS=230, NOP=231, NOPAC=232, 
		NOPARMCHECK=233, NOPFD=234, NOPRESERVE=235, NOPROLOG=236, NORENT=237, 
		NORULES=238, NOS=239, NOSEP=240, NOSEPARATE=241, NOSEQ=242, NOSERV=243, 
		NOSERVICE=244, NOSLACKBYTES=245, NOSLCKB=246, NOSO=247, NOSOURCE=248, 
		NOSPIE=249, NOSQL=250, NOSQLC=251, NOSQLCCSID=252, NOSQLIMS=253, NOSSR=254, 
		NOSSRANGE=255, NOSTDTRUNC=256, NOSEQUENCE=257, NOSTGOPT=258, NOSUPP=259, 
		NOSUPPRESS=260, NOTERM=261, NOTERMINAL=262, NOTEST=263, NOTHREAD=264, 
		NOTRIG=265, NOUNRA=266, NOUNREFALL=267, NOUNREFSOURCE=268, NOUNRS=269, 
		NOVBREF=270, NOVOLATILE=271, NOWD=272, NOWORD=273, NOX=274, NOXREF=275, 
		NOZC=276, NOZLEN=277, NOZON=278, NOZONECHECK=279, NOZWB=280, NS=281, NSEQ=282, 
		NSYMBOL=283, NUM=284, NUMBER=285, NUMCHECK=286, NUMPROC=287, OBJ=288, 
		OBJECT=289, OF=290, OFF=291, OFFSET=292, ON=293, OMITODOMIN=294, OOM=295, 
		OP=296, OPMARGINS=297, OPSEQUENCE=298, OPT=299, OPTFILE=300, OPTIMIZE=301, 
		OPTIONS=302, OUT=303, OUTDD=304, PAC=305, PARMCHECK=306, PATH=307, PC=308, 
		PFD=309, PPTDBG=310, PGMN=311, PGMNAME=312, PRESERVE=313, PROCESS=314, 
		PROLOG=315, QUALIFY=316, QUA=317, QUOTE=318, RENT=319, REPLACE=320, REPLACING=321, 
		RMODE=322, RPARENCHAR=323, RULES=324, SEP=325, SEPARATE=326, SEQ=327, 
		SEQUENCE=328, SERV=329, SERVICE=330, SHORT=331, SIZE=332, SLACKBYTES=333, 
		SLCKB=334, SOURCE=335, SP=336, SPACE=337, SPIE=338, SQL=339, SQLC=340, 
		SQLCCSID=341, SQLIMS=342, SKIP1=343, SKIP2=344, SKIP3=345, SO=346, SS=347, 
		SSR=348, SSRANGE=349, STANDARD=350, STD=351, STGOPT=352, STRICT=353, SUCC=354, 
		SUPP=355, SUPPRESS=356, SYSEIB=357, SZ=358, TERM=359, TERMINAL=360, TEST=361, 
		THREAD=362, TITLE=363, TRAILING=364, TRIG=365, TRUNC=366, UE=367, UNREF=368, 
		UPPER=369, VBREF=370, VLR=371, VOLATILE=372, VS=373, VSAMOPENFS=374, WD=375, 
		WORD=376, XMLPARSE=377, XMLSS=378, XOPTS=379, XP=380, XREF=381, YEARWINDOW=382, 
		YW=383, ZC=384, ZD=385, ZLEN=386, ZON=387, ZONECHECK=388, ZONEDATA=389, 
		ZWB=390, C_CHAR=391, D_CHAR=392, E_CHAR=393, F_CHAR=394, H_CHAR=395, I_CHAR=396, 
		M_CHAR=397, N_CHAR=398, O_CHAR=399, Q_CHAR=400, S_CHAR=401, U_CHAR=402, 
		W_CHAR=403, X_CHAR=404, COMMENTTAG=405, COMMACHAR=406, COMPILER_DIRECTIVE_TAG=407, 
		DOT=408, DOUBLEEQUALCHAR=409, NONNUMERICLITERAL=410, NUMERICLITERAL=411, 
		IDENTIFIER=412, FILENAME=413, PSEUDOTEXTIDENTIFIER=414, NEWLINE=415, COMMENTLINE=416, 
		WS=417, TEXT=418, BOL=419, CLASSIC_COMMENT_TEXT=420, CD_WS=421, CD_CLASSIC_EOL_COMMENT=422, 
		ASTERISKCHAR=423, EQUALCHAR=424, GREATERTHANCHAR=425, LESSTHANCHAR=426, 
		PLUSCHAR=427, MINUSCHAR=428, SLASHCHAR=429, NOTEQUALCHAR=430, GREATEROREQUALCHAR=431, 
		LESSOREQUALCHAR=432, ZERO=433, AS=434, AND=435, CALLINT=436, CALLINTERFACE=437, 
		DEFINED=438, DLL_INTERFACE=439, DYNAMIC=440, ELSE=441, END_EVALUATE=442, 
		END_IF=443, EQUAL=444, EVALUATE=445, GREATER=446, IF=447, INLINE=448, 
		INLINE_OFF=449, INLINE_ON=450, IS=451, LESS=452, NOT=453, OR=454, OTHER=455, 
		OVERRIDE=456, PARAMETER=457, STATIC=458, THAN=459, THROUGH=460, THRU=461, 
		TO=462, TRUE=463, WHEN=464;
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
		RULE_conditionalCompilationDefine = 42, RULE_conditionalCompilationDefinePredicate = 43, 
		RULE_conditionalCompilationArithmeticExpression = 44, RULE_conditionalCompilationArithmeticAtom = 45, 
		RULE_conditionalCompilationArithmeticOp = 46, RULE_conditionalCompilationIf = 47, 
		RULE_conditionalCompilationElse = 48, RULE_conditionalCompilationEndIf = 49, 
		RULE_conditionalCompilationEvaluateSelection = 50, RULE_conditionalCompilationEvaluate = 51, 
		RULE_conditionalCompilationWhen = 52, RULE_conditionalCompilationEndEvaluate = 53, 
		RULE_conditionalCompilationComparisonOp = 54, RULE_conditionalCompilationRelationalCondition = 55, 
		RULE_conditionalCompilationCondition = 56, RULE_conditionalCompilationSimpleRelationalCondition = 57, 
		RULE_conditionalCompilationBinaryCondition = 58, RULE_conditionalCompilationDefinedCondition = 59, 
		RULE_charDataKeyword = 60;
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
			"compilerDirectiveInline", "conditionalCompilationDefine", "conditionalCompilationDefinePredicate", 
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
			null, null, null, null, null, null, null, null, null, "'('", null, null, 
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
			null, null, null, null, null, null, null, null, null, null, null, "')'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'*>'", "','", 
			"'>>'", "'.'", "'=='", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'*'", "'='", "'>'", "'<'", "'+'", null, 
			"'/'", "'<>'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASSIC_COMMENT_TAG", "CLASSIC_CONTINUATION", "CLASSIC_LINE_NUMBER", 
			"CLASSIC_EOL_COMMENT", "ID_DIVISION_TAG", "NIST_FLAG1", "NIST_FLAG2", 
			"NIST_IGNORED_LINE", "ABD", "ADATA", "ADV", "AFP", "ALIAS", "ALPHNUM", 
			"ANSI", "ANY", "APOST", "AR", "ARCH", "ARITH", "AUTO", "AWO", "BIN", 
			"BLOCK0", "BUF", "BUFSIZE", "BY", "CBL", "CBLCARD", "CICS", "CO", "COBOL2", 
			"COBOL3", "CODEPAGE", "COMPAT", "COMPILE", "COPY", "COPYLOC", "COPYRIGHT", 
			"CP", "CPLC", "CPP", "CPSM", "CPYR", "CS", "CURR", "CURRENCY", "DATA", 
			"DATEPROC", "DBCS", "DD", "DEBUG", "DEC", "DECK", "DEF", "DEFINE", "DIAGTRUNC", 
			"DISPSIGN", "DIVISION", "DLI", "DLL", "DP", "DS", "DSN", "DSNAME", "DTR", 
			"DU", "DUMP", "DWARF", "DYN", "DYNAM", "EDF", "EJECT", "EJPD", "EN", 
			"ENDP", "ENDPERIOD", "ENGLISH", "END_EXEC", "EPILOG", "EVENP", "EVENPACK", 
			"EXCI", "EXEC", "EXIT", "EXP", "EXPORTALL", "EXTEND", "FASTSRT", "FEPI", 
			"FLAG", "FLAGSTD", "FSRT", "FULL", "GDS", "GRAPHIC", "HEX", "HGPR", "HOOK", 
			"IC", "ID", "IDENTIFICATION", "IN", "INITCHECK", "INTDATE", "INITIAL", 
			"INL", "JA", "JP", "KA", "LANG", "LANGUAGE", "LAX", "LAXPERF", "LC", 
			"LEADING", "LEASM", "LENGTH", "LIB", "LILIAN", "LIN", "LINECOUNT", "LINKAGE", 
			"LIST", "LM", "LONGMIXED", "LONGUPPER", "LP", "LPARENCHAR", "LU", "LXPRF", 
			"MAP", "MARGINS", "MAX", "MD", "MDECK", "MIG", "MIXED", "MAXPCF", "MSG", 
			"NAME", "NAT", "NATIONAL", "NATLANG", "NC", "NN", "NO", "NOADATA", "NOADV", 
			"NOALIAS", "NOALPHNUM", "NOAWO", "NOBIN", "NOBLOCK0", "NOC", "NOCBLCARD", 
			"NOCICS", "NOCMPR2", "NOCOMPILE", "NOCOPYLOC", "NOCOPYRIGHT", "NOCPLC", 
			"NOCPSM", "NOCPYR", "NOCURR", "NOCURRENCY", "NOD", "NODATEPROC", "NODBCS", 
			"NODE", "NODEBUG", "NODECK", "NODEFINE", "NODEF", "NODIAGTRUNC", "NODLL", 
			"NODSNAME", "NODU", "NODUMP", "NODP", "NODTR", "NODWARF", "NODYN", "NODYNAM", 
			"NOEDF", "NOEJPD", "NOENDP", "NOENDPERIOD", "NOEPILOG", "NOEVENP", "NOEVENPACK", 
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
			"END_IF", "EQUAL", "EVALUATE", "GREATER", "IF", "INLINE", "INLINE_OFF", 
			"INLINE_ON", "IS", "LESS", "NOT", "OR", "OTHER", "OVERRIDE", "PARAMETER", 
			"STATIC", "THAN", "THROUGH", "THRU", "TO", "TRUE", "WHEN"
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
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENT_TAG) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXEC - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (ID - 64)) | (1L << (IDENTIFICATION - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOENDP - 128)) | (1L << (NOENDPERIOD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEVENP - 128)) | (1L << (NOEVENPACK - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)) | (1L << (NOSQL - 192)) | (1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSQLIMS - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)) | (1L << (PROCESS - 256)) | (1L << (PROLOG - 256)) | (1L << (QUALIFY - 256)) | (1L << (QUA - 256)) | (1L << (QUOTE - 256)) | (1L << (RENT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SKIP1 - 320)) | (1L << (SKIP2 - 320)) | (1L << (SKIP3 - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRAILING - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)) | (1L << (XMLSS - 320)) | (1L << (XOPTS - 320)) | (1L << (XREF - 320)) | (1L << (YEARWINDOW - 320)) | (1L << (YW - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (COMPILER_DIRECTIVE_TAG - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0)) {
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(122);
					identificationDivisionTag();
					}
					break;
				case 2:
					{
					setState(123);
					compilerOptions();
					}
					break;
				case 3:
					{
					setState(124);
					compilerDirectiveStatement();
					}
					break;
				case 4:
					{
					setState(125);
					classicCommentEntry();
					}
					break;
				case 5:
					{
					setState(126);
					copyStatement();
					}
					break;
				case 6:
					{
					setState(127);
					execCicsStatement();
					}
					break;
				case 7:
					{
					setState(128);
					execSqlStatement();
					}
					break;
				case 8:
					{
					setState(129);
					execSqlImsStatement();
					}
					break;
				case 9:
					{
					setState(130);
					replaceOffStatement();
					}
					break;
				case 10:
					{
					setState(131);
					replaceArea();
					}
					break;
				case 11:
					{
					setState(132);
					ejectStatement();
					}
					break;
				case 12:
					{
					setState(133);
					skipStatement();
					}
					break;
				case 13:
					{
					setState(134);
					titleStatement();
					}
					break;
				case 14:
					{
					setState(135);
					charDataLine();
					}
					break;
				case 15:
					{
					setState(136);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDENTIFICATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
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
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==CBL || _la==PROCESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(153);
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
					case INLINE:
						{
						setState(149);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(148);
							match(COMMACHAR);
							}
						}

						setState(151);
						compilerOption();
						}
						break;
					case XOPTS:
						{
						setState(152);
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
				setState(155); 
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
			setState(157);
			match(XOPTS);
			setState(158);
			match(LPARENCHAR);
			setState(159);
			compilerOption();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AWO) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << CBLCARD) | (1L << CICS) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DEBUG) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DLL) | (1L << DP) | (1L << DS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DTR - 66)) | (1L << (DU - 66)) | (1L << (DUMP - 66)) | (1L << (DWARF - 66)) | (1L << (DYN - 66)) | (1L << (DYNAM - 66)) | (1L << (EDF - 66)) | (1L << (EJPD - 66)) | (1L << (EPILOG - 66)) | (1L << (EXIT - 66)) | (1L << (EXP - 66)) | (1L << (EXPORTALL - 66)) | (1L << (FASTSRT - 66)) | (1L << (FEPI - 66)) | (1L << (FLAG - 66)) | (1L << (FLAGSTD - 66)) | (1L << (FSRT - 66)) | (1L << (GDS - 66)) | (1L << (GRAPHIC - 66)) | (1L << (HGPR - 66)) | (1L << (HOOK - 66)) | (1L << (IC - 66)) | (1L << (INITCHECK - 66)) | (1L << (INTDATE - 66)) | (1L << (INITIAL - 66)) | (1L << (INL - 66)) | (1L << (LANG - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LC - 66)) | (1L << (LEASM - 66)) | (1L << (LENGTH - 66)) | (1L << (LIB - 66)) | (1L << (LIN - 66)) | (1L << (LINECOUNT - 66)) | (1L << (LINKAGE - 66)) | (1L << (LIST - 66)) | (1L << (LP - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (MAP - 132)) | (1L << (MARGINS - 132)) | (1L << (MD - 132)) | (1L << (MDECK - 132)) | (1L << (MAXPCF - 132)) | (1L << (NAME - 132)) | (1L << (NATLANG - 132)) | (1L << (NC - 132)) | (1L << (NOADATA - 132)) | (1L << (NOADV - 132)) | (1L << (NOAWO - 132)) | (1L << (NOBLOCK0 - 132)) | (1L << (NOC - 132)) | (1L << (NOCBLCARD - 132)) | (1L << (NOCICS - 132)) | (1L << (NOCMPR2 - 132)) | (1L << (NOCOMPILE - 132)) | (1L << (NOCOPYLOC - 132)) | (1L << (NOCOPYRIGHT - 132)) | (1L << (NOCPLC - 132)) | (1L << (NOCPSM - 132)) | (1L << (NOCPYR - 132)) | (1L << (NOCURR - 132)) | (1L << (NOCURRENCY - 132)) | (1L << (NOD - 132)) | (1L << (NODATEPROC - 132)) | (1L << (NODBCS - 132)) | (1L << (NODE - 132)) | (1L << (NODEBUG - 132)) | (1L << (NODECK - 132)) | (1L << (NODEFINE - 132)) | (1L << (NODEF - 132)) | (1L << (NODIAGTRUNC - 132)) | (1L << (NODLL - 132)) | (1L << (NODU - 132)) | (1L << (NODUMP - 132)) | (1L << (NODP - 132)) | (1L << (NODTR - 132)) | (1L << (NODWARF - 132)) | (1L << (NODYN - 132)) | (1L << (NODYNAM - 132)) | (1L << (NOEDF - 132)) | (1L << (NOEJPD - 132)) | (1L << (NOEPILOG - 132)) | (1L << (NOEXIT - 132)) | (1L << (NOEXP - 132)) | (1L << (NOEXPORTALL - 132)) | (1L << (NOF - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (NOFASTSRT - 196)) | (1L << (NOFEPI - 196)) | (1L << (NOFLAG - 196)) | (1L << (NOFLAGMIG - 196)) | (1L << (NOFLAGSTD - 196)) | (1L << (NOFSRT - 196)) | (1L << (NOGRAPHIC - 196)) | (1L << (NOHOOK - 196)) | (1L << (NOINITCHECK - 196)) | (1L << (NOIC - 196)) | (1L << (NOINITIAL - 196)) | (1L << (NOINLINE - 196)) | (1L << (NOINL - 196)) | (1L << (NOLENGTH - 196)) | (1L << (NOLIB - 196)) | (1L << (NOLINKAGE - 196)) | (1L << (NOLIST - 196)) | (1L << (NOMAP - 196)) | (1L << (NOMD - 196)) | (1L << (NOMDECK - 196)) | (1L << (NONAME - 196)) | (1L << (NONUM - 196)) | (1L << (NONUMBER - 196)) | (1L << (NOOBJ - 196)) | (1L << (NOOBJECT - 196)) | (1L << (NOOFF - 196)) | (1L << (NOOFFSET - 196)) | (1L << (NOOPSEQUENCE - 196)) | (1L << (NOOPT - 196)) | (1L << (NOOPTIMIZE - 196)) | (1L << (NOOPTIONS - 196)) | (1L << (NOP - 196)) | (1L << (NOPARMCHECK - 196)) | (1L << (NOPROLOG - 196)) | (1L << (NORENT - 196)) | (1L << (NORULES - 196)) | (1L << (NOS - 196)) | (1L << (NOSEP - 196)) | (1L << (NOSEPARATE - 196)) | (1L << (NOSEQ - 196)) | (1L << (NOSERV - 196)) | (1L << (NOSERVICE - 196)) | (1L << (NOSO - 196)) | (1L << (NOSOURCE - 196)) | (1L << (NOSPIE - 196)) | (1L << (NOSQL - 196)) | (1L << (NOSQLC - 196)) | (1L << (NOSQLCCSID - 196)) | (1L << (NOSQLIMS - 196)) | (1L << (NOSSR - 196)) | (1L << (NOSSRANGE - 196)) | (1L << (NOSTDTRUNC - 196)) | (1L << (NOSEQUENCE - 196)) | (1L << (NOSTGOPT - 196)) | (1L << (NOSUPP - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (NOSUPPRESS - 260)) | (1L << (NOTERM - 260)) | (1L << (NOTERMINAL - 260)) | (1L << (NOTEST - 260)) | (1L << (NOTHREAD - 260)) | (1L << (NOVBREF - 260)) | (1L << (NOWD - 260)) | (1L << (NOWORD - 260)) | (1L << (NOX - 260)) | (1L << (NOXREF - 260)) | (1L << (NOZC - 260)) | (1L << (NOZONECHECK - 260)) | (1L << (NOZWB - 260)) | (1L << (NS - 260)) | (1L << (NSEQ - 260)) | (1L << (NSYMBOL - 260)) | (1L << (NUM - 260)) | (1L << (NUMBER - 260)) | (1L << (NUMCHECK - 260)) | (1L << (NUMPROC - 260)) | (1L << (OBJ - 260)) | (1L << (OBJECT - 260)) | (1L << (OFF - 260)) | (1L << (OFFSET - 260)) | (1L << (OP - 260)) | (1L << (OPMARGINS - 260)) | (1L << (OPSEQUENCE - 260)) | (1L << (OPT - 260)) | (1L << (OPTFILE - 260)) | (1L << (OPTIMIZE - 260)) | (1L << (OPTIONS - 260)) | (1L << (OUT - 260)) | (1L << (OUTDD - 260)) | (1L << (PARMCHECK - 260)) | (1L << (PC - 260)) | (1L << (PGMN - 260)) | (1L << (PGMNAME - 260)) | (1L << (PROLOG - 260)) | (1L << (QUALIFY - 260)) | (1L << (QUA - 260)) | (1L << (QUOTE - 260)) | (1L << (RENT - 260)) | (1L << (RMODE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (RULES - 324)) | (1L << (SEP - 324)) | (1L << (SEPARATE - 324)) | (1L << (SEQ - 324)) | (1L << (SEQUENCE - 324)) | (1L << (SERV - 324)) | (1L << (SERVICE - 324)) | (1L << (SIZE - 324)) | (1L << (SOURCE - 324)) | (1L << (SP - 324)) | (1L << (SPACE - 324)) | (1L << (SPIE - 324)) | (1L << (SQL - 324)) | (1L << (SQLC - 324)) | (1L << (SQLCCSID - 324)) | (1L << (SQLIMS - 324)) | (1L << (SO - 324)) | (1L << (SSR - 324)) | (1L << (SSRANGE - 324)) | (1L << (STGOPT - 324)) | (1L << (SUPP - 324)) | (1L << (SUPPRESS - 324)) | (1L << (SYSEIB - 324)) | (1L << (SZ - 324)) | (1L << (TERM - 324)) | (1L << (TERMINAL - 324)) | (1L << (TEST - 324)) | (1L << (THREAD - 324)) | (1L << (TRUNC - 324)) | (1L << (VBREF - 324)) | (1L << (VLR - 324)) | (1L << (VS - 324)) | (1L << (VSAMOPENFS - 324)) | (1L << (WD - 324)) | (1L << (WORD - 324)) | (1L << (XMLPARSE - 324)) | (1L << (XP - 324)) | (1L << (XREF - 324)) | (1L << (YEARWINDOW - 324)) | (1L << (YW - 324)) | (1L << (ZC - 324)) | (1L << (ZD - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (ZONECHECK - 388)) | (1L << (ZONEDATA - 388)) | (1L << (ZWB - 388)) | (1L << (C_CHAR - 388)) | (1L << (D_CHAR - 388)) | (1L << (F_CHAR - 388)) | (1L << (Q_CHAR - 388)) | (1L << (S_CHAR - 388)) | (1L << (X_CHAR - 388)) | (1L << (COMMACHAR - 388)) | (1L << (INLINE - 388)))) != 0)) {
				{
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(160);
					match(COMMACHAR);
					}
				}

				setState(163);
				compilerOption();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ADATA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(ADV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(173);
				match(AFP);
				setState(174);
				match(LPARENCHAR);
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==NOVOLATILE || _la==VOLATILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				match(RPARENCHAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(APOST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(178);
				match(ARCH);
				setState(179);
				match(LPARENCHAR);
				setState(180);
				literal();
				setState(181);
				match(RPARENCHAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==AR || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				match(LPARENCHAR);
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				match(RPARENCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(AWO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(BLOCK0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==BUF || _la==BUFSIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				match(LPARENCHAR);
				setState(191);
				literal();
				setState(192);
				match(RPARENCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(194);
				match(CBLCARD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(195);
				match(CICS);
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(196);
					match(LPARENCHAR);
					setState(197);
					literal();
					setState(198);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(202);
				match(COBOL2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(203);
				match(COBOL3);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==CODEPAGE || _la==CP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				match(LPARENCHAR);
				setState(206);
				literal();
				setState(207);
				match(RPARENCHAR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(209);
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
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==COPYLOC || _la==CPLC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				match(LPARENCHAR);
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(212);
					match(IDENTIFIER);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(213);
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
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
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
					match(DSN);
					setState(220);
					match(LPARENCHAR);
					setState(221);
					match(FILENAME);
					setState(222);
					match(RPARENCHAR);
					}
					break;
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATH || _la==COMMACHAR) {
					{
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(225);
						match(COMMACHAR);
						}
					}

					setState(228);
					match(PATH);
					setState(229);
					match(LPARENCHAR);
					setState(230);
					literal();
					setState(231);
					match(RPARENCHAR);
					}
				}

				setState(235);
				match(RPARENCHAR);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==COPYRIGHT || _la==CPYR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				match(LPARENCHAR);
				setState(238);
				literal();
				setState(239);
				match(RPARENCHAR);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(241);
				match(CPP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(242);
				match(CPSM);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==CURR || _la==CURRENCY) ) {
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
				match(TEXT);
				setState(246);
				match(RPARENCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(247);
				match(DATA);
				setState(248);
				match(LPARENCHAR);
				setState(249);
				literal();
				setState(250);
				match(RPARENCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==DATEPROC || _la==DP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(253);
					match(LPARENCHAR);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FLAG || _la==NOFLAG) {
						{
						setState(254);
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

					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(257);
						match(COMMACHAR);
						}
					}

					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOTRIG || _la==TRIG) {
						{
						setState(260);
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

					setState(263);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(266);
				match(DBCS);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(267);
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
				setState(268);
				match(DEBUG);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(269);
				define_opt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(270);
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
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==DISPSIGN || _la==DS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				match(LPARENCHAR);
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==SEP || _la==C_CHAR || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				match(RPARENCHAR);
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(275);
				match(DLL);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(276);
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
				setState(277);
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
				setState(278);
				match(EDF);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(279);
				match(EPILOG);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(280);
				match(EXIT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(281);
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
				setState(282);
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
				setState(283);
				match(FEPI);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(284);
				_la = _input.LA(1);
				if ( !(_la==FLAG || _la==F_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				match(LPARENCHAR);
				setState(286);
				_la = _input.LA(1);
				if ( !(((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (E_CHAR - 393)) | (1L << (I_CHAR - 393)) | (1L << (S_CHAR - 393)) | (1L << (U_CHAR - 393)) | (1L << (W_CHAR - 393)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(287);
					match(COMMACHAR);
					setState(288);
					_la = _input.LA(1);
					if ( !(((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (E_CHAR - 393)) | (1L << (I_CHAR - 393)) | (1L << (S_CHAR - 393)) | (1L << (U_CHAR - 393)) | (1L << (W_CHAR - 393)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(291);
				match(RPARENCHAR);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(292);
				match(FLAGSTD);
				setState(293);
				match(LPARENCHAR);
				setState(294);
				_la = _input.LA(1);
				if ( !(((((_la - 395)) & ~0x3f) == 0 && ((1L << (_la - 395)) & ((1L << (H_CHAR - 395)) | (1L << (I_CHAR - 395)) | (1L << (M_CHAR - 395)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(295);
					match(COMMACHAR);
					setState(296);
					_la = _input.LA(1);
					if ( !(_la==DD || _la==NN || ((((_la - 347)) & ~0x3f) == 0 && ((1L << (_la - 347)) & ((1L << (SS - 347)) | (1L << (D_CHAR - 347)) | (1L << (N_CHAR - 347)) | (1L << (S_CHAR - 347)))) != 0)) ) {
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
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(299);
					match(COMMACHAR);
					setState(300);
					match(O_CHAR);
					}
				}

				setState(303);
				match(RPARENCHAR);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(304);
				match(GDS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(305);
				match(GRAPHIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(306);
				match(HGPR);
				setState(307);
				match(LPARENCHAR);
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==NOPRESERVE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				match(RPARENCHAR);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(310);
				match(INTDATE);
				setState(311);
				match(LPARENCHAR);
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==ANSI || _la==LILIAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				match(RPARENCHAR);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==IC || _la==INITCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(315);
					match(LPARENCHAR);
					setState(316);
					_la = _input.LA(1);
					if ( !(_la==LAX || _la==STRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(317);
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
				setState(320);
				match(INITIAL);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(321);
				match(INLINE);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(322);
				match(INL);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(323);
				_la = _input.LA(1);
				if ( !(_la==LANG || _la==LANGUAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(324);
				match(LPARENCHAR);
				setState(325);
				_la = _input.LA(1);
				if ( !(_la==CS || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (EN - 75)) | (1L << (ENGLISH - 75)) | (1L << (JA - 75)) | (1L << (JP - 75)) | (1L << (KA - 75)))) != 0) || _la==UE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(326);
				match(RPARENCHAR);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(327);
				match(LEASM);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(328);
				match(LENGTH);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(329);
				match(LIB);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(330);
				match(LIN);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==LC || _la==LINECOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				match(LPARENCHAR);
				setState(333);
				literal();
				setState(334);
				match(RPARENCHAR);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(336);
				match(LINKAGE);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(337);
				match(LIST);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				{
				setState(338);
				match(LP);
				setState(339);
				match(LPARENCHAR);
				setState(340);
				literal();
				setState(341);
				match(RPARENCHAR);
				}
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				{
				setState(343);
				match(MAP);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(344);
					match(LPARENCHAR);
					setState(345);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
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
				}
				}
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(349);
				match(MARGINS);
				setState(350);
				match(LPARENCHAR);
				setState(351);
				literal();
				setState(352);
				match(COMMACHAR);
				setState(353);
				literal();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(354);
					match(COMMACHAR);
					setState(355);
					literal();
					}
				}

				setState(358);
				match(RPARENCHAR);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				{
				setState(360);
				match(MAXPCF);
				setState(361);
				match(LPARENCHAR);
				setState(362);
				literal();
				setState(363);
				match(RPARENCHAR);
				}
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(365);
				_la = _input.LA(1);
				if ( !(_la==MD || _la==MDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(366);
					match(LPARENCHAR);
					setState(367);
					_la = _input.LA(1);
					if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(368);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(371);
				match(NAME);
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(372);
					match(LPARENCHAR);
					setState(373);
					_la = _input.LA(1);
					if ( !(_la==ALIAS || _la==NOALIAS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(374);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(377);
				match(NATLANG);
				setState(378);
				match(LPARENCHAR);
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==CS || _la==EN || _la==KA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				match(RPARENCHAR);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(381);
				match(NOADATA);
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(382);
				match(NOADV);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(383);
				match(NOAWO);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(384);
				match(NOBLOCK0);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(385);
				match(NOCBLCARD);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(386);
				match(NOCICS);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(387);
				match(NOCMPR2);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==NOC || _la==NOCOMPILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(389);
					match(LPARENCHAR);
					setState(390);
					_la = _input.LA(1);
					if ( !(((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (E_CHAR - 393)) | (1L << (S_CHAR - 393)) | (1L << (W_CHAR - 393)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(391);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(394);
				match(NOCOPYLOC);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(395);
				match(NOCPLC);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(396);
				match(NOCOPYRIGHT);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(397);
				match(NOCPYR);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(398);
				match(NOCPSM);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(399);
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
				setState(400);
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
				setState(401);
				match(NODBCS);
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(402);
				match(NODEBUG);
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(403);
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
				setState(404);
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
				setState(405);
				match(NODLL);
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(406);
				match(NODE);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(407);
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
				setState(408);
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
				setState(409);
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
				setState(410);
				match(NOEDF);
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(411);
				match(NOEPILOG);
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(412);
				match(NOEXIT);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(413);
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
				setState(414);
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
				setState(415);
				match(NOFEPI);
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(416);
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
				setState(417);
				match(NOFLAGMIG);
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(418);
				match(NOFLAGSTD);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(419);
				match(NOGRAPHIC);
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(420);
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
				setState(421);
				match(NOINITIAL);
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(422);
				match(NOINLINE);
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(423);
				match(NOINL);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(424);
				match(NOLENGTH);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(425);
				match(NOLIB);
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(426);
				match(NOLINKAGE);
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(427);
				match(NOLIST);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(428);
				match(NOMAP);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(429);
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
				setState(430);
				match(NONAME);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(431);
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
				setState(432);
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
				setState(433);
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
				setState(434);
				match(NOOPSEQUENCE);
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(435);
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
				setState(436);
				match(NOOPTIONS);
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(437);
				match(NOP);
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(438);
				match(NOPARMCHECK);
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(439);
				match(NOPROLOG);
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(440);
				match(NORENT);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(441);
				match(NORULES);
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(442);
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
				setState(443);
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
				setState(444);
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
				setState(445);
				match(NOSPIE);
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(446);
				match(NOSQL);
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(447);
				match(NOSQLIMS);
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(448);
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
				setState(449);
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
				setState(450);
				match(NOSTDTRUNC);
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(451);
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
				setState(452);
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
				setState(453);
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
				setState(454);
				match(NOTEST);
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(455);
				match(NOTHREAD);
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(456);
				match(NOVBREF);
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(457);
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
				setState(458);
				match(NSEQ);
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(459);
				_la = _input.LA(1);
				if ( !(_la==NS || _la==NSYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(460);
				match(LPARENCHAR);
				setState(461);
				_la = _input.LA(1);
				if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(462);
				match(RPARENCHAR);
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(463);
				match(NOVBREF);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(464);
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
				setState(465);
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
				setState(466);
				match(NOZWB);
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(467);
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
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==NC || _la==NUMCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(469);
					match(LPARENCHAR);
					setState(470);
					numcheck_opts();
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(471);
						match(COMMACHAR);
						setState(472);
						numcheck_opts();
						}
						}
						setState(477);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(478);
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
				setState(482);
				match(NUMPROC);
				setState(483);
				match(LPARENCHAR);
				setState(484);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(485);
				match(RPARENCHAR);
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(486);
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
				setState(487);
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
				setState(488);
				match(OPMARGINS);
				setState(489);
				match(LPARENCHAR);
				setState(490);
				literal();
				setState(491);
				match(COMMACHAR);
				setState(492);
				literal();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(493);
					match(COMMACHAR);
					setState(494);
					literal();
					}
				}

				setState(497);
				match(RPARENCHAR);
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(499);
				match(OPSEQUENCE);
				setState(500);
				match(LPARENCHAR);
				setState(501);
				literal();
				setState(502);
				match(COMMACHAR);
				setState(503);
				literal();
				setState(504);
				match(RPARENCHAR);
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(506);
				_la = _input.LA(1);
				if ( !(_la==OPT || _la==OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(507);
					match(LPARENCHAR);
					setState(508);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==STD || _la==NUMERICLITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(509);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(512);
				match(OPTFILE);
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(513);
				match(OPTIONS);
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(514);
				match(OP);
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==OUTDD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				match(LPARENCHAR);
				setState(517);
				cobolWord();
				setState(518);
				match(RPARENCHAR);
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				{
				setState(520);
				_la = _input.LA(1);
				if ( !(_la==PARMCHECK || _la==PC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(521);
					match(LPARENCHAR);
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABD || _la==MSG) {
						{
						setState(522);
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

					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 406)) & ~0x3f) == 0 && ((1L << (_la - 406)) & ((1L << (COMMACHAR - 406)) | (1L << (NONNUMERICLITERAL - 406)) | (1L << (NUMERICLITERAL - 406)))) != 0)) {
						{
						setState(526);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(525);
							match(COMMACHAR);
							}
						}

						setState(528);
						literal();
						}
					}

					setState(531);
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
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==PGMN || _la==PGMNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(535);
				match(LPARENCHAR);
				setState(536);
				_la = _input.LA(1);
				if ( !(_la==CO || _la==COMPAT || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (LM - 125)) | (1L << (LONGMIXED - 125)) | (1L << (LONGUPPER - 125)) | (1L << (LU - 125)) | (1L << (MIXED - 125)))) != 0) || ((((_la - 369)) & ~0x3f) == 0 && ((1L << (_la - 369)) & ((1L << (UPPER - 369)) | (1L << (M_CHAR - 369)) | (1L << (U_CHAR - 369)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				match(RPARENCHAR);
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(538);
				match(PROLOG);
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				{
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==QUALIFY || _la==QUA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				match(LPARENCHAR);
				setState(541);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(542);
				match(RPARENCHAR);
				}
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(543);
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
				setState(544);
				match(RENT);
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(545);
				match(RMODE);
				setState(546);
				match(LPARENCHAR);
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
					{
					setState(547);
					match(ANY);
					}
					break;
				case AUTO:
					{
					setState(548);
					match(AUTO);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(549);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552);
				match(RPARENCHAR);
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				{
				setState(553);
				match(RULES);
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(554);
					match(LPARENCHAR);
					setState(555);
					rules_opts();
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(556);
						match(COMMACHAR);
						setState(557);
						rules_opts();
						}
						}
						setState(562);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(563);
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
				setState(567);
				_la = _input.LA(1);
				if ( !(_la==SEQ || _la==SEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(568);
					match(LPARENCHAR);
					setState(569);
					literal();
					setState(570);
					match(COMMACHAR);
					setState(571);
					literal();
					setState(572);
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
				setState(576);
				_la = _input.LA(1);
				if ( !(_la==SERV || _la==SERVICE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(577);
				match(LPARENCHAR);
				setState(578);
				literal();
				setState(579);
				match(RPARENCHAR);
				}
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(581);
				_la = _input.LA(1);
				if ( !(_la==SIZE || _la==SZ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(582);
				match(LPARENCHAR);
				setState(585);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAX:
					{
					setState(583);
					match(MAX);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(584);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(587);
				match(RPARENCHAR);
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				setState(588);
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
				setState(589);
				match(SP);
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				setState(590);
				match(SPACE);
				setState(591);
				match(LPARENCHAR);
				setState(592);
				literal();
				setState(593);
				match(RPARENCHAR);
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(595);
				match(SPIE);
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(596);
				match(SQL);
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(597);
					match(LPARENCHAR);
					setState(598);
					literal();
					setState(599);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(603);
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
				setState(604);
				match(SQLIMS);
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(605);
					match(LPARENCHAR);
					setState(606);
					literal();
					setState(607);
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
				setState(611);
				_la = _input.LA(1);
				if ( !(_la==SSR || _la==SSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(612);
					match(LPARENCHAR);
					setState(613);
					ssrange_opts();
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(614);
						match(COMMACHAR);
						setState(615);
						ssrange_opts();
						}
						}
						setState(620);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(621);
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
				setState(625);
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
				setState(626);
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
				setState(627);
				match(SYSEIB);
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(628);
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
				setState(629);
				match(TEST);
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(630);
					match(LPARENCHAR);
					setState(631);
					test_opts();
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(632);
						match(COMMACHAR);
						setState(633);
						test_opts();
						}
						}
						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(639);
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
				setState(643);
				match(THREAD);
				}
				break;
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(644);
				match(TRUNC);
				setState(645);
				match(LPARENCHAR);
				setState(646);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==OPT || _la==STD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(647);
				match(RPARENCHAR);
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(648);
				match(VBREF);
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				{
				setState(649);
				match(VLR);
				setState(650);
				match(LPARENCHAR);
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 350)) & ~0x3f) == 0 && ((1L << (_la - 350)) & ((1L << (STANDARD - 350)) | (1L << (C_CHAR - 350)) | (1L << (S_CHAR - 350)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(652);
				match(RPARENCHAR);
				}
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				{
				setState(653);
				_la = _input.LA(1);
				if ( !(_la==VS || _la==VSAMOPENFS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(654);
				match(LPARENCHAR);
				setState(655);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 354)) & ~0x3f) == 0 && ((1L << (_la - 354)) & ((1L << (SUCC - 354)) | (1L << (C_CHAR - 354)) | (1L << (S_CHAR - 354)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(656);
				match(RPARENCHAR);
				}
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(657);
				_la = _input.LA(1);
				if ( !(_la==WD || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(658);
				match(LPARENCHAR);
				setState(665);
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
					setState(659);
					cobolWord();
					}
					break;
				case TEXT:
					{
					setState(661); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(660);
						match(TEXT);
						}
						}
						setState(663); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(667);
				match(RPARENCHAR);
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				setState(668);
				_la = _input.LA(1);
				if ( !(_la==XMLPARSE || _la==XP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(669);
				match(LPARENCHAR);
				setState(670);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 378)) & ~0x3f) == 0 && ((1L << (_la - 378)) & ((1L << (XMLSS - 378)) | (1L << (C_CHAR - 378)) | (1L << (X_CHAR - 378)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(671);
				match(RPARENCHAR);
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(672);
				_la = _input.LA(1);
				if ( !(_la==XREF || _la==X_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(673);
					match(LPARENCHAR);
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FULL || _la==SHORT) {
						{
						setState(674);
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

					setState(677);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(680);
				_la = _input.LA(1);
				if ( !(_la==YEARWINDOW || _la==YW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				match(LPARENCHAR);
				setState(682);
				literal();
				setState(683);
				match(RPARENCHAR);
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				{
				setState(685);
				_la = _input.LA(1);
				if ( !(_la==ZC || _la==ZONECHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(686);
				match(LPARENCHAR);
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==ABD || _la==MSG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(688);
				match(RPARENCHAR);
				}
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				{
				setState(689);
				_la = _input.LA(1);
				if ( !(_la==ZD || _la==ZONEDATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(690);
				match(LPARENCHAR);
				setState(691);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(692);
				match(RPARENCHAR);
				}
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(693);
				match(ZWB);
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(694);
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
			setState(697);
			_la = _input.LA(1);
			if ( !(_la==DEF || _la==DEFINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(698);
			match(LPARENCHAR);
			setState(699);
			identifier_et_al();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMACHAR || _la==TEXT) {
				{
				setState(706);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(701); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(700);
						match(TEXT);
						}
						}
						setState(703); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				case COMMACHAR:
					{
					setState(705);
					match(COMMACHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(708);
				literal();
				}
			}

			setState(711);
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
			setState(713);
			_la = _input.LA(1);
			if ( !(((((_la - 391)) & ~0x3f) == 0 && ((1L << (_la - 391)) & ((1L << (C_CHAR - 391)) | (1L << (D_CHAR - 391)) | (1L << (E_CHAR - 391)) | (1L << (F_CHAR - 391)) | (1L << (H_CHAR - 391)) | (1L << (I_CHAR - 391)) | (1L << (M_CHAR - 391)) | (1L << (N_CHAR - 391)) | (1L << (O_CHAR - 391)) | (1L << (Q_CHAR - 391)) | (1L << (S_CHAR - 391)) | (1L << (U_CHAR - 391)) | (1L << (W_CHAR - 391)) | (1L << (X_CHAR - 391)) | (1L << (IDENTIFIER - 391)))) != 0)) ) {
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
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(715);
				match(ZON);
				}
				break;
			case 2:
				{
				{
				setState(716);
				match(ZON);
				setState(717);
				match(LPARENCHAR);
				setState(718);
				_la = _input.LA(1);
				if ( !(_la==ALPHNUM || _la==NOALPHNUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(719);
				match(RPARENCHAR);
				}
				}
				break;
			case 3:
				{
				setState(720);
				match(NOZON);
				}
				break;
			case 4:
				{
				setState(721);
				match(PAC);
				}
				break;
			case 5:
				{
				setState(722);
				match(NOPAC);
				}
				break;
			case 6:
				{
				setState(723);
				match(BIN);
				}
				break;
			case 7:
				{
				setState(724);
				match(NOBIN);
				}
				break;
			case 8:
				{
				setState(725);
				match(MSG);
				}
				break;
			case 9:
				{
				setState(726);
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
			setState(729);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ENDP - 76)) | (1L << (ENDPERIOD - 76)) | (1L << (EVENP - 76)) | (1L << (EVENPACK - 76)) | (1L << (LAXPERF - 76)) | (1L << (LXPRF - 76)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (NOENDP - 187)) | (1L << (NOENDPERIOD - 187)) | (1L << (NOEVENP - 187)) | (1L << (NOEVENPACK - 187)) | (1L << (NOLAXPERF - 187)) | (1L << (NOLXPRF - 187)) | (1L << (NOOMITODOMIN - 187)) | (1L << (NOOOM - 187)) | (1L << (NOSLACKBYTES - 187)) | (1L << (NOSLCKB - 187)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (NOUNRA - 266)) | (1L << (NOUNREFALL - 266)) | (1L << (NOUNREFSOURCE - 266)) | (1L << (NOUNRS - 266)) | (1L << (OMITODOMIN - 266)) | (1L << (OOM - 266)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (SLACKBYTES - 333)) | (1L << (SLCKB - 333)) | (1L << (UNREF - 333)))) != 0)) ) {
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
			setState(731);
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
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DWARF:
				{
				setState(733);
				match(DWARF);
				}
				break;
			case NODWARF:
				{
				setState(734);
				match(NODWARF);
				}
				break;
			case HOOK:
				{
				setState(735);
				match(HOOK);
				}
				break;
			case NOHOOK:
				{
				setState(736);
				match(NOHOOK);
				}
				break;
			case SEP:
			case SEPARATE:
				{
				{
				setState(737);
				_la = _input.LA(1);
				if ( !(_la==SEP || _la==SEPARATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(738);
					match(LPARENCHAR);
					setState(739);
					_la = _input.LA(1);
					if ( !(_la==DSNAME || _la==NODSNAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(740);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case NOSEP:
				{
				setState(743);
				match(NOSEP);
				}
				break;
			case NOSEPARATE:
				{
				setState(744);
				match(NOSEPARATE);
				}
				break;
			case SO:
				{
				setState(745);
				match(SO);
				}
				break;
			case SOURCE:
				{
				setState(746);
				match(SOURCE);
				}
				break;
			case NOSO:
				{
				setState(747);
				match(NOSO);
				}
				break;
			case NOSOURCE:
				{
				setState(748);
				match(NOSOURCE);
				}
				break;
			case EJPD:
				{
				setState(749);
				match(EJPD);
				}
				break;
			case NOEJPD:
				{
				setState(750);
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
			setState(753);
			match(CLASSIC_COMMENT_TAG);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASSIC_COMMENT_TEXT) {
				{
				{
				setState(754);
				match(CLASSIC_COMMENT_TEXT);
				}
				}
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(760);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(EXEC);
			setState(763);
			match(CICS);
			setState(764);
			charData();
			setState(765);
			match(END_EXEC);
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(766);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(EXEC);
			setState(770);
			match(SQL);
			setState(771);
			charDataSql();
			setState(772);
			match(END_EXEC);
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(773);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(EXEC);
			setState(777);
			match(SQLIMS);
			setState(778);
			charData();
			setState(779);
			match(END_EXEC);
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(780);
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
			setState(783);
			match(COPY);
			setState(784);
			copySource();
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(785);
						match(NEWLINE);
						}
						}
						setState(790);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(793);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REPLACING:
						{
						setState(791);
						replacingPhrase();
						}
						break;
					case SUPPRESS:
						{
						setState(792);
						match(SUPPRESS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(800);
				match(NEWLINE);
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
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
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(808);
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
				setState(809);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(810);
				filename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(813);
					match(NEWLINE);
					}
					}
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(819);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(820);
					match(NEWLINE);
					}
					}
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(826);
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
			setState(831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
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
				setState(830);
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
			setState(833);
			match(REPLACING);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(834);
				match(NEWLINE);
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
			replaceClause();
			setState(849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(842); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(841);
						match(NEWLINE);
						}
						}
						setState(844); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(846);
					replaceClause();
					}
					} 
				}
				setState(851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
			setState(852);
			replaceByStatement();
			setState(857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(855);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COPY:
						{
						setState(853);
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
						setState(854);
						charData();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(860);
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
			setState(863);
			match(REPLACE);
			setState(871); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(864);
						match(NEWLINE);
						}
						}
						setState(869);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(870);
					replaceClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(873); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(883);
			match(REPLACE);
			setState(884);
			match(OFF);
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(885);
				match(NEWLINE);
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(891);
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
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(893);
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
			setState(896);
			replaceable();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(897);
				match(NEWLINE);
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(903);
			match(BY);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(904);
				match(NEWLINE);
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910);
			replacement();
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(911);
					match(NEWLINE);
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				directoryPhrase();
				}
				break;
			}
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(920);
					match(NEWLINE);
					}
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(926);
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
			setState(929);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(930);
				match(NEWLINE);
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(936);
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
				setState(937);
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
			setState(940);
			match(ON);
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(941);
				match(NEWLINE);
				}
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(947);
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
				setState(948);
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
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(954);
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
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(960);
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
			setState(963);
			match(EJECT);
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(964);
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
			setState(967);
			_la = _input.LA(1);
			if ( !(((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & ((1L << (SKIP1 - 343)) | (1L << (SKIP2 - 343)) | (1L << (SKIP3 - 343)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(968);
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
			setState(971);
			match(TITLE);
			setState(972);
			literal();
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(973);
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
			setState(976);
			match(DOUBLEEQUALCHAR);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOENDP - 128)) | (1L << (NOENDPERIOD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEVENP - 128)) | (1L << (NOEVENPACK - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)) | (1L << (NOSQL - 192)) | (1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSQLIMS - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)) | (1L << (PROLOG - 256)) | (1L << (QUALIFY - 256)) | (1L << (QUA - 256)) | (1L << (QUOTE - 256)) | (1L << (RENT - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RPARENCHAR - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)) | (1L << (XOPTS - 321)) | (1L << (XREF - 321)) | (1L << (YEARWINDOW - 321)) | (1L << (YW - 321)) | (1L << (ZC - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (DOT - 385)) | (1L << (NONNUMERICLITERAL - 385)) | (1L << (NUMERICLITERAL - 385)) | (1L << (IDENTIFIER - 385)) | (1L << (FILENAME - 385)) | (1L << (PSEUDOTEXTIDENTIFIER - 385)) | (1L << (NEWLINE - 385)) | (1L << (TEXT - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0)) {
				{
				setState(977);
				charData();
				}
			}

			setState(980);
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
			setState(984); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(984);
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
						setState(982);
						charDataLine();
						}
						break;
					case NEWLINE:
						{
						setState(983);
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
				setState(986); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
			setState(992); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(992);
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
					setState(988);
					charDataLine();
					}
					break;
				case COPY:
					{
					setState(989);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(990);
					match(REPLACE);
					}
					break;
				case NEWLINE:
					{
					setState(991);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(994); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOENDP - 128)) | (1L << (NOENDPERIOD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEVENP - 128)) | (1L << (NOEVENPACK - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)) | (1L << (NOSQL - 192)) | (1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSQLIMS - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)) | (1L << (PROLOG - 256)) | (1L << (QUALIFY - 256)) | (1L << (QUA - 256)) | (1L << (QUOTE - 256)) | (1L << (RENT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRAILING - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)) | (1L << (XMLSS - 320)) | (1L << (XOPTS - 320)) | (1L << (XREF - 320)) | (1L << (YEARWINDOW - 320)) | (1L << (YW - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(1004); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1004);
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
						setState(996);
						cobolWord();
						}
						break;
					case NONNUMERICLITERAL:
					case NUMERICLITERAL:
						{
						setState(997);
						literal();
						}
						break;
					case FILENAME:
						{
						setState(998);
						filename();
						}
						break;
					case PSEUDOTEXTIDENTIFIER:
						{
						setState(999);
						match(PSEUDOTEXTIDENTIFIER);
						}
						break;
					case TEXT:
						{
						setState(1000);
						match(TEXT);
						}
						break;
					case DOT:
						{
						setState(1001);
						match(DOT);
						}
						break;
					case LPARENCHAR:
						{
						setState(1002);
						match(LPARENCHAR);
						}
						break;
					case RPARENCHAR:
						{
						setState(1003);
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
				setState(1006); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1008);
					match(NEWLINE);
					setState(1009);
					match(CLASSIC_CONTINUATION);
					setState(1018); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(1018);
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
								setState(1010);
								cobolWord();
								}
								break;
							case NONNUMERICLITERAL:
							case NUMERICLITERAL:
								{
								setState(1011);
								literal();
								}
								break;
							case FILENAME:
								{
								setState(1012);
								filename();
								}
								break;
							case PSEUDOTEXTIDENTIFIER:
								{
								setState(1013);
								match(PSEUDOTEXTIDENTIFIER);
								}
								break;
							case TEXT:
								{
								setState(1014);
								match(TEXT);
								}
								break;
							case DOT:
								{
								setState(1015);
								match(DOT);
								}
								break;
							case LPARENCHAR:
								{
								setState(1016);
								match(LPARENCHAR);
								}
								break;
							case RPARENCHAR:
								{
								setState(1017);
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
						setState(1020); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
			setState(1029);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
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
				setState(1028);
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
			setState(1031);
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
			setState(1033);
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
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1035);
				compilerDirective();
				}
				break;
			case 2:
				{
				setState(1036);
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
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1039);
				compilerDirectiveCallInterface();
				}
				break;
			case 2:
				{
				setState(1040);
				compilerDirectiveInline();
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
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1043);
				conditionalCompilationDefine();
				}
				break;
			case 2:
				{
				setState(1044);
				conditionalCompilationIf();
				}
				break;
			case 3:
				{
				setState(1045);
				conditionalCompilationElse();
				}
				break;
			case 4:
				{
				setState(1046);
				conditionalCompilationEndIf();
				}
				break;
			case 5:
				{
				setState(1047);
				conditionalCompilationEvaluate();
				}
				break;
			case 6:
				{
				setState(1048);
				conditionalCompilationWhen();
				}
				break;
			case 7:
				{
				setState(1049);
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
			setState(1052);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1053);
			_la = _input.LA(1);
			if ( !(_la==CALLINT || _la==CALLINTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1054);
				_la = _input.LA(1);
				if ( !(((((_la - 439)) & ~0x3f) == 0 && ((1L << (_la - 439)) & ((1L << (DLL_INTERFACE - 439)) | (1L << (DYNAMIC - 439)) | (1L << (STATIC - 439)))) != 0)) ) {
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
			setState(1057);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1058);
			match(INLINE);
			setState(1059);
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
		enterRule(_localctx, 84, RULE_conditionalCompilationDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1061);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1062);
			match(DEFINE);
			setState(1063);
			match(IDENTIFIER);
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1064);
				match(AS);
				}
			}

			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1067);
				conditionalCompilationDefinePredicate();
				}
				break;
			case 2:
				{
				setState(1068);
				match(INLINE_OFF);
				}
				break;
			}
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(1071);
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
		enterRule(_localctx, 86, RULE_conditionalCompilationDefinePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1074);
				literal();
				}
				break;
			case 2:
				{
				setState(1075);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 3:
				{
				setState(1076);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(1077);
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
		enterRule(_localctx, 88, RULE_conditionalCompilationArithmeticExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1089); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1080);
						match(LPARENCHAR);
						}
						}
						setState(1085);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1086);
					conditionalCompilationArithmeticAtom();
					setState(1087);
					conditionalCompilationArithmeticOp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1091); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1093);
						match(LPARENCHAR);
						}
						}
						setState(1098);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1099);
					conditionalCompilationArithmeticAtom();
					setState(1103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==RPARENCHAR) {
						{
						{
						setState(1100);
						match(RPARENCHAR);
						}
						}
						setState(1105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1106);
					conditionalCompilationArithmeticOp();
					}
					} 
				}
				setState(1112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1113);
			conditionalCompilationArithmeticAtom();
			setState(1117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1114);
					match(RPARENCHAR);
					}
					} 
				}
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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
		enterRule(_localctx, 90, RULE_conditionalCompilationArithmeticAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			_la = _input.LA(1);
			if ( !(((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (NUMERICLITERAL - 411)) | (1L << (IDENTIFIER - 411)) | (1L << (ZERO - 411)))) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_conditionalCompilationArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			_la = _input.LA(1);
			if ( !(((((_la - 423)) & ~0x3f) == 0 && ((1L << (_la - 423)) & ((1L << (ASTERISKCHAR - 423)) | (1L << (PLUSCHAR - 423)) | (1L << (MINUSCHAR - 423)) | (1L << (SLASHCHAR - 423)))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_conditionalCompilationIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1124);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1125);
			match(IF);
			setState(1126);
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
		enterRule(_localctx, 96, RULE_conditionalCompilationElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1129);
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
		enterRule(_localctx, 98, RULE_conditionalCompilationEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1132);
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
		enterRule(_localctx, 100, RULE_conditionalCompilationEvaluateSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1134);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1135);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1136);
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
		enterRule(_localctx, 102, RULE_conditionalCompilationEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1140);
			match(EVALUATE);
			setState(1143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(1141);
				match(TRUE);
				}
				break;
			case LPARENCHAR:
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
			case IDENTIFIER:
			case ZERO:
				{
				setState(1142);
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
		enterRule(_localctx, 104, RULE_conditionalCompilationWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1146);
			match(WHEN);
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				{
				setState(1147);
				conditionalCompilationEvaluateSelection();
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROUGH || _la==THRU) {
					{
					setState(1148);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1149);
					conditionalCompilationEvaluateSelection();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(1152);
				conditionalCompilationRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1153);
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
		enterRule(_localctx, 106, RULE_conditionalCompilationEndEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1157);
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
		enterRule(_localctx, 108, RULE_conditionalCompilationComparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1159);
				match(IS);
				}
			}

			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1162);
				match(NOT);
				}
			}

			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1165);
				match(EQUAL);
				}
				break;
			case 2:
				{
				setState(1166);
				match(EQUALCHAR);
				}
				break;
			case 3:
				{
				setState(1167);
				match(NOTEQUALCHAR);
				}
				break;
			case 4:
				{
				setState(1168);
				match(LESSTHANCHAR);
				}
				break;
			case 5:
				{
				{
				setState(1169);
				match(GREATER);
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1170);
					match(THAN);
					}
				}

				}
				}
				break;
			case 6:
				{
				setState(1173);
				match(GREATERTHANCHAR);
				}
				break;
			case 7:
				{
				{
				setState(1174);
				match(LESS);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1175);
					match(THAN);
					}
				}

				}
				}
				break;
			case 8:
				{
				setState(1178);
				match(LESSOREQUALCHAR);
				}
				break;
			case 9:
				{
				{
				setState(1179);
				match(LESS);
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1180);
					match(THAN);
					}
				}

				setState(1183);
				match(OR);
				setState(1184);
				match(EQUAL);
				}
				}
				break;
			case 10:
				{
				setState(1185);
				match(GREATEROREQUALCHAR);
				}
				break;
			case 11:
				{
				{
				setState(1186);
				match(GREATER);
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1187);
					match(THAN);
					}
				}

				setState(1190);
				match(OR);
				setState(1191);
				match(EQUAL);
				}
				}
				break;
			}
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1194);
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
		enterRule(_localctx, 110, RULE_conditionalCompilationRelationalCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1197);
							match(LPARENCHAR);
							}
							} 
						}
						setState(1202);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					}
					setState(1203);
					conditionalCompilationCondition();
					setState(1220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1204);
							_la = _input.LA(1);
							if ( !(_la==AND || _la==OR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1208);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1205);
									match(LPARENCHAR);
									}
									} 
								}
								setState(1210);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
							}
							setState(1211);
							conditionalCompilationCondition();
							setState(1215);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1212);
									match(RPARENCHAR);
									}
									} 
								}
								setState(1217);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
							}
							}
							} 
						}
						setState(1222);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
					}
					setState(1226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1223);
							match(RPARENCHAR);
							}
							} 
						}
						setState(1228);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		enterRule(_localctx, 112, RULE_conditionalCompilationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1233);
				conditionalCompilationSimpleRelationalCondition();
				}
				break;
			case 2:
				{
				setState(1234);
				conditionalCompilationDefinedCondition();
				}
				break;
			case 3:
				{
				setState(1235);
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
		enterRule(_localctx, 114, RULE_conditionalCompilationSimpleRelationalCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1238);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1239);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1240);
				literal();
				}
				break;
			}
			setState(1243);
			conditionalCompilationComparisonOp();
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1244);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1245);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1246);
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
		enterRule(_localctx, 116, RULE_conditionalCompilationBinaryCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
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
		enterRule(_localctx, 118, RULE_conditionalCompilationDefinedCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1251);
			match(IDENTIFIER);
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1252);
				match(IS);
				}
			}

			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1255);
				match(NOT);
				}
			}

			setState(1258);
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
		enterRule(_localctx, 120, RULE_charDataKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE) | (1L << DIAGTRUNC) | (1L << DISPSIGN) | (1L << DIVISION) | (1L << DLI) | (1L << DLL) | (1L << DP) | (1L << DS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LEADING - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)) | (1L << (LINECOUNT - 64)) | (1L << (LINKAGE - 64)) | (1L << (LIST - 64)) | (1L << (LM - 64)) | (1L << (LONGMIXED - 64)) | (1L << (LONGUPPER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LP - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)) | (1L << (NOEJPD - 128)) | (1L << (NOENDP - 128)) | (1L << (NOENDPERIOD - 128)) | (1L << (NOEPILOG - 128)) | (1L << (NOEVENP - 128)) | (1L << (NOEVENPACK - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)) | (1L << (NOSQL - 192)) | (1L << (NOSQLC - 192)) | (1L << (NOSQLCCSID - 192)) | (1L << (NOSQLIMS - 192)) | (1L << (NOSSR - 192)) | (1L << (NOSSRANGE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)) | (1L << (PROLOG - 256)) | (1L << (QUALIFY - 256)) | (1L << (QUA - 256)) | (1L << (QUOTE - 256)) | (1L << (RENT - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (REPLACING - 321)) | (1L << (RMODE - 321)) | (1L << (RULES - 321)) | (1L << (SEP - 321)) | (1L << (SEPARATE - 321)) | (1L << (SEQ - 321)) | (1L << (SEQUENCE - 321)) | (1L << (SERV - 321)) | (1L << (SERVICE - 321)) | (1L << (SHORT - 321)) | (1L << (SIZE - 321)) | (1L << (SLACKBYTES - 321)) | (1L << (SLCKB - 321)) | (1L << (SOURCE - 321)) | (1L << (SP - 321)) | (1L << (SPACE - 321)) | (1L << (SPIE - 321)) | (1L << (SQL - 321)) | (1L << (SQLC - 321)) | (1L << (SQLCCSID - 321)) | (1L << (SQLIMS - 321)) | (1L << (SO - 321)) | (1L << (SS - 321)) | (1L << (SSR - 321)) | (1L << (SSRANGE - 321)) | (1L << (STANDARD - 321)) | (1L << (STD - 321)) | (1L << (STGOPT - 321)) | (1L << (STRICT - 321)) | (1L << (SUCC - 321)) | (1L << (SUPP - 321)) | (1L << (SUPPRESS - 321)) | (1L << (SYSEIB - 321)) | (1L << (SZ - 321)) | (1L << (TERM - 321)) | (1L << (TERMINAL - 321)) | (1L << (TEST - 321)) | (1L << (THREAD - 321)) | (1L << (TITLE - 321)) | (1L << (TRAILING - 321)) | (1L << (TRIG - 321)) | (1L << (TRUNC - 321)) | (1L << (UE - 321)) | (1L << (UNREF - 321)) | (1L << (UPPER - 321)) | (1L << (VBREF - 321)) | (1L << (VLR - 321)) | (1L << (VOLATILE - 321)) | (1L << (VS - 321)) | (1L << (VSAMOPENFS - 321)) | (1L << (WD - 321)) | (1L << (XMLPARSE - 321)) | (1L << (XMLSS - 321)) | (1L << (XOPTS - 321)) | (1L << (XREF - 321)) | (1L << (YEARWINDOW - 321)) | (1L << (YW - 321)) | (1L << (ZC - 321)))) != 0) || ((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (ZD - 385)) | (1L << (ZLEN - 385)) | (1L << (ZON - 385)) | (1L << (ZONECHECK - 385)) | (1L << (ZONEDATA - 385)) | (1L << (ZWB - 385)) | (1L << (C_CHAR - 385)) | (1L << (D_CHAR - 385)) | (1L << (E_CHAR - 385)) | (1L << (F_CHAR - 385)) | (1L << (H_CHAR - 385)) | (1L << (I_CHAR - 385)) | (1L << (M_CHAR - 385)) | (1L << (N_CHAR - 385)) | (1L << (O_CHAR - 385)) | (1L << (Q_CHAR - 385)) | (1L << (S_CHAR - 385)) | (1L << (U_CHAR - 385)) | (1L << (W_CHAR - 385)) | (1L << (X_CHAR - 385)) | (1L << (COMMACHAR - 385)) | (1L << (PLUSCHAR - 385)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (OR - 454)) | (1L << (STATIC - 454)) | (1L << (TO - 454)) | (1L << (TRUE - 454)) | (1L << (WHEN - 454)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01d2\u04f1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\u008c\n\2\f\2\16\2\u008f\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u0098\n"+
		"\4\3\4\3\4\6\4\u009c\n\4\r\4\16\4\u009d\3\5\3\5\3\5\3\5\5\5\u00a4\n\5"+
		"\3\5\7\5\u00a7\n\5\f\5\16\5\u00aa\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cb\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00d9\n\6\3\6\5\6\u00dc\n\6\3\6\3\6\3\6\3\6\5\6\u00e2"+
		"\n\6\3\6\5\6\u00e5\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ec\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0102\n\6\3\6\5\6\u0105\n\6\3\6\5\6\u0108\n\6\3\6\5\6\u010b\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0124\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u012c\n\6\3"+
		"\6\3\6\5\6\u0130\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0141\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u015e"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0167\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0174\n\6\3\6\3\6\3\6\3\6\5\6\u017a\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u018b\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u01dc\n\6\f\6\16\6\u01df\13\6\3"+
		"\6\3\6\5\6\u01e3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u01f2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0201\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u020e\n\6"+
		"\3\6\5\6\u0211\n\6\3\6\5\6\u0214\n\6\3\6\5\6\u0217\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0229\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u0231\n\6\f\6\16\6\u0234\13\6\3\6\3\6\5\6\u0238\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0241\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u024c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u025c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0264\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u026b\n\6\f\6\16\6\u026e\13\6\3\6\3\6\5\6\u0272\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u027d\n\6\f\6\16\6\u0280\13\6\3"+
		"\6\3\6\5\6\u0284\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\6\6\u0298\n\6\r\6\16\6\u0299\5\6\u029c\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02a6\n\6\3\6\5\6\u02a9\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02ba\n\6\3\7\3"+
		"\7\3\7\3\7\6\7\u02c0\n\7\r\7\16\7\u02c1\3\7\5\7\u02c5\n\7\3\7\5\7\u02c8"+
		"\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u02da\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u02e8"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u02f2\n\f\3\r\3\r\7\r\u02f6\n"+
		"\r\f\r\16\r\u02f9\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0302\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0309\n\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0310\n\20\3\21\3\21\3\21\7\21\u0315\n\21\f\21\16\21\u0318\13\21\3\21"+
		"\3\21\5\21\u031c\n\21\7\21\u031e\n\21\f\21\16\21\u0321\13\21\3\21\7\21"+
		"\u0324\n\21\f\21\16\21\u0327\13\21\3\21\3\21\3\22\3\22\3\22\5\22\u032e"+
		"\n\22\3\22\7\22\u0331\n\22\f\22\16\22\u0334\13\22\3\22\3\22\7\22\u0338"+
		"\n\22\f\22\16\22\u033b\13\22\3\22\5\22\u033e\n\22\3\23\3\23\5\23\u0342"+
		"\n\23\3\24\3\24\7\24\u0346\n\24\f\24\16\24\u0349\13\24\3\24\3\24\6\24"+
		"\u034d\n\24\r\24\16\24\u034e\3\24\7\24\u0352\n\24\f\24\16\24\u0355\13"+
		"\24\3\25\3\25\3\25\7\25\u035a\n\25\f\25\16\25\u035d\13\25\3\25\5\25\u0360"+
		"\n\25\3\26\3\26\7\26\u0364\n\26\f\26\16\26\u0367\13\26\3\26\6\26\u036a"+
		"\n\26\r\26\16\26\u036b\3\26\7\26\u036f\n\26\f\26\16\26\u0372\13\26\3\26"+
		"\3\26\3\27\3\27\3\27\7\27\u0379\n\27\f\27\16\27\u037c\13\27\3\27\3\27"+
		"\3\30\5\30\u0381\n\30\3\30\3\30\7\30\u0385\n\30\f\30\16\30\u0388\13\30"+
		"\3\30\3\30\7\30\u038c\n\30\f\30\16\30\u038f\13\30\3\30\3\30\7\30\u0393"+
		"\n\30\f\30\16\30\u0396\13\30\3\30\5\30\u0399\n\30\3\30\7\30\u039c\n\30"+
		"\f\30\16\30\u039f\13\30\3\30\5\30\u03a2\n\30\3\31\3\31\7\31\u03a6\n\31"+
		"\f\31\16\31\u03a9\13\31\3\31\3\31\5\31\u03ad\n\31\3\32\3\32\7\32\u03b1"+
		"\n\32\f\32\16\32\u03b4\13\32\3\32\3\32\5\32\u03b8\n\32\3\33\3\33\3\33"+
		"\3\33\5\33\u03be\n\33\3\34\3\34\3\34\3\34\5\34\u03c4\n\34\3\35\3\35\5"+
		"\35\u03c8\n\35\3\36\3\36\5\36\u03cc\n\36\3\37\3\37\3\37\5\37\u03d1\n\37"+
		"\3 \3 \5 \u03d5\n \3 \3 \3!\3!\6!\u03db\n!\r!\16!\u03dc\3\"\3\"\3\"\3"+
		"\"\6\"\u03e3\n\"\r\"\16\"\u03e4\3#\3#\3#\3#\3#\3#\3#\3#\6#\u03ef\n#\r"+
		"#\16#\u03f0\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u03fd\n#\r#\16#\u03fe\7#"+
		"\u0401\n#\f#\16#\u0404\13#\3$\3$\5$\u0408\n$\3%\3%\3&\3&\3\'\3\'\5\'\u0410"+
		"\n\'\3(\3(\5(\u0414\n(\3)\3)\3)\3)\3)\3)\3)\5)\u041d\n)\3*\3*\3*\5*\u0422"+
		"\n*\3+\3+\3+\3+\3,\3,\3,\3,\5,\u042c\n,\3,\3,\5,\u0430\n,\3,\5,\u0433"+
		"\n,\3-\3-\3-\3-\5-\u0439\n-\3.\7.\u043c\n.\f.\16.\u043f\13.\3.\3.\3.\6"+
		".\u0444\n.\r.\16.\u0445\3.\7.\u0449\n.\f.\16.\u044c\13.\3.\3.\7.\u0450"+
		"\n.\f.\16.\u0453\13.\3.\3.\7.\u0457\n.\f.\16.\u045a\13.\3.\3.\7.\u045e"+
		"\n.\f.\16.\u0461\13.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u0474\n\64\3\65\3\65\3\65\3\65\5\65"+
		"\u047a\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u0481\n\66\3\66\3\66\5\66\u0485"+
		"\n\66\3\67\3\67\3\67\38\58\u048b\n8\38\58\u048e\n8\38\38\38\38\38\38\5"+
		"8\u0496\n8\38\38\38\58\u049b\n8\38\38\38\58\u04a0\n8\38\38\38\38\38\5"+
		"8\u04a7\n8\38\38\58\u04ab\n8\38\58\u04ae\n8\39\79\u04b1\n9\f9\169\u04b4"+
		"\139\39\39\39\79\u04b9\n9\f9\169\u04bc\139\39\39\79\u04c0\n9\f9\169\u04c3"+
		"\139\79\u04c5\n9\f9\169\u04c8\139\39\79\u04cb\n9\f9\169\u04ce\139\69\u04d0"+
		"\n9\r9\169\u04d1\3:\3:\3:\5:\u04d7\n:\3;\3;\3;\5;\u04dc\n;\3;\3;\3;\3"+
		";\5;\u04e2\n;\3<\3<\3=\3=\5=\u04e8\n=\3=\5=\u04eb\n=\3=\3=\3>\3>\3>\2"+
		"\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2}\3\2gh\4\2\36\36\u013c\u013c\4\2\u0111"+
		"\u0111\u0176\u0176\4\2\24\24\26\26\6\2%%ZZ\u0189\u0189\u018b\u018b\3\2"+
		"\33\34\4\2$$**\4\2&&\u0189\u0189\4\2((++\4\2))..\3\2\60\61\4\2\63\63@"+
		"@\4\2]]\u00c8\u00c8\4\2\u010b\u010b\u016f\u016f\4\288\u018a\u018a\4\2"+
		";;DD\4\2<<AA\6\2%%\u0147\u0147\u0189\u0189\u0193\u0193\3\2EF\3\2HI\3\2"+
		"XY\4\2[[__\4\2]]\u018c\u018c\5\2\u018b\u018b\u018e\u018e\u0193\u0195\3"+
		"\2\u018d\u018f\b\2\65\65\u0094\u0094\u015d\u015d\u018a\u018a\u0190\u0190"+
		"\u0193\u0193\4\2\u00ed\u00ed\u013b\u013b\4\2\21\21zz\4\2ffjj\4\2ss\u0163"+
		"\u0163\3\2qr\7\2//MMPPnp\u0171\u0171\4\2uu||\4\2\67\67cc\3\2\u0089\u008a"+
		"\6\2&&\u009d\u009d\u00a1\u00a1\u0189\u0189\4\2\17\17\u0098\u0098\5\2/"+
		"/MMpp\4\2\u009d\u009d\u00a1\u00a1\5\2\u018b\u018b\u0193\u0193\u0195\u0195"+
		"\3\2\u00a7\u00a8\4\2\u00aa\u00aa\u00b6\u00b6\4\2\u00a9\u00a9\u00ae\u00ae"+
		"\3\2\u00af\u00b0\3\2\u00b4\u00b5\4\2\u00b1\u00b1\u00b7\u00b7\3\2\u00b9"+
		"\u00ba\3\2\u00c3\u00c4\4\2\u00c6\u00c6\u00cb\u00cb\4\2\u00c5\u00c5\u00c8"+
		"\u00c8\3\2\u00ce\u00cf\3\2\u00da\u00db\3\2\u00dd\u00de\3\2\u00df\u00e0"+
		"\3\2\u00e2\u00e3\3\2\u00e6\u00e7\4\2\u00f4\u00f4\u0103\u0103\3\2\u00f5"+
		"\u00f6\4\2\u00f1\u00f1\u00fa\u00fa\3\2\u00fd\u00fe\3\2\u0100\u0101\4\2"+
		"\u00f9\u00f9\u0104\u0104\3\2\u0105\u0106\3\2\u0107\u0108\3\2\u0112\u0113"+
		"\4\2\u011b\u011b\u011d\u011d\4\2\64\64\u0090\u0091\3\2\u0114\u0115\4\2"+
		"\u0116\u0116\u0119\u0119\3\2\u011e\u011f\4\2\u0093\u0093\u0120\u0120\5"+
		"\2\u008b\u008b\u00ec\u00ec\u0137\u0137\3\2\u0122\u0123\3\2\u0125\u0126"+
		"\4\2\u012d\u012d\u012f\u012f\5\2``\u0161\u0161\u019d\u019d\3\2\u0131\u0132"+
		"\4\2\u0134\u0134\u0136\u0136\4\2\13\13\u008e\u008e\3\2\u0139\u013a\n\2"+
		"!!%%\177\u0081\u0084\u0084\u008c\u008c\u0173\u0173\u018f\u018f\u0194\u0194"+
		"\3\2\u013e\u013f\4\2\u0140\u0140\u0192\u0192\3\2\u0149\u014a\3\2\u014b"+
		"\u014c\4\2\u014e\u014e\u0168\u0168\4\2\u0151\u0151\u0193\u0193\3\2\u0156"+
		"\u0157\3\2\u015e\u015f\4\2\u015c\u015c\u0162\u0162\3\2\u0165\u0166\3\2"+
		"\u0169\u016a\5\2\31\31\u012d\u012d\u0161\u0161\6\2%%\u0160\u0160\u0189"+
		"\u0189\u0193\u0193\3\2\u0177\u0178\6\2%%\u0164\u0164\u0189\u0189\u0193"+
		"\u0193\3\2\u0179\u017a\4\2\u017b\u017b\u017e\u017e\6\2%%\u017c\u017c\u0189"+
		"\u0189\u0196\u0196\4\2\u017f\u017f\u0196\u0196\4\2``\u014d\u014d\3\2\u0180"+
		"\u0181\4\2\u0182\u0182\u0186\u0186\4\2\u0183\u0183\u0187\u0187\3\29:\4"+
		"\2\u0189\u0196\u019e\u019e\4\2\20\20\u0099\u0099\21\2NOSTtt\u0085\u0085"+
		"\u00bd\u00be\u00c0\u00c1\u00d3\u00d3\u00d8\u00d8\u00e1\u00e1\u00e4\u00e4"+
		"\u00f7\u00f8\u010c\u010f\u0128\u0129\u014f\u0150\u0172\u0172\6\2\13\13"+
		"\u008e\u008e\u0117\u0117\u0184\u0184\3\2\u0147\u0148\4\2CC\u00b3\u00b3"+
		"\4\2ii\u0124\u0124\4\2vv\u016e\u016e\3\2\u0159\u015b\3\2\u019c\u019d\3"+
		"\2\u01b6\u01b7\4\2\u01b9\u01ba\u01cc\u01cc\3\2\u01c3\u01c4\4\2\u019d\u019e"+
		"\u01b3\u01b3\4\2\u01a9\u01a9\u01ad\u01af\3\2\u01ce\u01cf\4\2\u01b5\u01b5"+
		"\u01c8\u01c8\30\2\13\35\37&(PRUW[]fivx\u0082\u0084\u0111\u0113\u0135\u0137"+
		"\u013b\u013d\u0141\u0143\u0144\u0146\u0158\u015c\u0179\u017b\u017d\u017f"+
		"\u0196\u0198\u0198\u01ad\u01ad\u01c8\u01c8\u01cc\u01cc\u01d0\u01d2\2\u0647"+
		"\2\u008d\3\2\2\2\4\u0092\3\2\2\2\6\u0095\3\2\2\2\b\u009f\3\2\2\2\n\u02b9"+
		"\3\2\2\2\f\u02bb\3\2\2\2\16\u02cb\3\2\2\2\20\u02d9\3\2\2\2\22\u02db\3"+
		"\2\2\2\24\u02dd\3\2\2\2\26\u02f1\3\2\2\2\30\u02f3\3\2\2\2\32\u02fc\3\2"+
		"\2\2\34\u0303\3\2\2\2\36\u030a\3\2\2\2 \u0311\3\2\2\2\"\u032d\3\2\2\2"+
		"$\u0341\3\2\2\2&\u0343\3\2\2\2(\u0356\3\2\2\2*\u0361\3\2\2\2,\u0375\3"+
		"\2\2\2.\u0380\3\2\2\2\60\u03a3\3\2\2\2\62\u03ae\3\2\2\2\64\u03bd\3\2\2"+
		"\2\66\u03c3\3\2\2\28\u03c5\3\2\2\2:\u03c9\3\2\2\2<\u03cd\3\2\2\2>\u03d2"+
		"\3\2\2\2@\u03da\3\2\2\2B\u03e2\3\2\2\2D\u03ee\3\2\2\2F\u0407\3\2\2\2H"+
		"\u0409\3\2\2\2J\u040b\3\2\2\2L\u040f\3\2\2\2N\u0413\3\2\2\2P\u041c\3\2"+
		"\2\2R\u041e\3\2\2\2T\u0423\3\2\2\2V\u0427\3\2\2\2X\u0438\3\2\2\2Z\u0443"+
		"\3\2\2\2\\\u0462\3\2\2\2^\u0464\3\2\2\2`\u0466\3\2\2\2b\u046a\3\2\2\2"+
		"d\u046d\3\2\2\2f\u0473\3\2\2\2h\u0475\3\2\2\2j\u047b\3\2\2\2l\u0486\3"+
		"\2\2\2n\u048a\3\2\2\2p\u04cf\3\2\2\2r\u04d6\3\2\2\2t\u04db\3\2\2\2v\u04e3"+
		"\3\2\2\2x\u04e5\3\2\2\2z\u04ee\3\2\2\2|\u008c\5\4\3\2}\u008c\5\6\4\2~"+
		"\u008c\5L\'\2\177\u008c\5\30\r\2\u0080\u008c\5 \21\2\u0081\u008c\5\32"+
		"\16\2\u0082\u008c\5\34\17\2\u0083\u008c\5\36\20\2\u0084\u008c\5,\27\2"+
		"\u0085\u008c\5(\25\2\u0086\u008c\58\35\2\u0087\u008c\5:\36\2\u0088\u008c"+
		"\5<\37\2\u0089\u008c\5D#\2\u008a\u008c\7\u01a1\2\2\u008b|\3\2\2\2\u008b"+
		"}\3\2\2\2\u008b~\3\2\2\2\u008b\177\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0081"+
		"\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2\u008b"+
		"\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\7\2\2\3\u0091\3\3\2\2\2\u0092\u0093\t\2\2\2\u0093\u0094"+
		"\7=\2\2\u0094\5\3\2\2\2\u0095\u009b\t\3\2\2\u0096\u0098\7\u0198\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\5\n"+
		"\6\2\u009a\u009c\5\b\5\2\u009b\u0097\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\7\3\2\2\2"+
		"\u009f\u00a0\7\u017d\2\2\u00a0\u00a1\7\u0083\2\2\u00a1\u00a8\5\n\6\2\u00a2"+
		"\u00a4\7\u0198\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\5\n\6\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7\u0145\2\2\u00ac\t\3\2\2\2\u00ad\u02ba\7\f\2\2\u00ae"+
		"\u02ba\7\r\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7\u0083\2\2\u00b1\u00b2"+
		"\t\4\2\2\u00b2\u02ba\7\u0145\2\2\u00b3\u02ba\7\23\2\2\u00b4\u00b5\7\25"+
		"\2\2\u00b5\u00b6\7\u0083\2\2\u00b6\u00b7\5H%\2\u00b7\u00b8\7\u0145\2\2"+
		"\u00b8\u02ba\3\2\2\2\u00b9\u00ba\t\5\2\2\u00ba\u00bb\7\u0083\2\2\u00bb"+
		"\u00bc\t\6\2\2\u00bc\u02ba\7\u0145\2\2\u00bd\u02ba\7\30\2\2\u00be\u02ba"+
		"\7\32\2\2\u00bf\u00c0\t\7\2\2\u00c0\u00c1\7\u0083\2\2\u00c1\u00c2\5H%"+
		"\2\u00c2\u00c3\7\u0145\2\2\u00c3\u02ba\3\2\2\2\u00c4\u02ba\7\37\2\2\u00c5"+
		"\u00ca\7 \2\2\u00c6\u00c7\7\u0083\2\2\u00c7\u00c8\5H%\2\u00c8\u00c9\7"+
		"\u0145\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00cb\3\2\2\2"+
		"\u00cb\u02ba\3\2\2\2\u00cc\u02ba\7\"\2\2\u00cd\u02ba\7#\2\2\u00ce\u00cf"+
		"\t\b\2\2\u00cf\u00d0\7\u0083\2\2\u00d0\u00d1\5H%\2\u00d1\u00d2\7\u0145"+
		"\2\2\u00d2\u02ba\3\2\2\2\u00d3\u02ba\t\t\2\2\u00d4\u00d5\t\n\2\2\u00d5"+
		"\u00d8\7\u0083\2\2\u00d6\u00d9\7\u019e\2\2\u00d7\u00d9\5H%\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e1\3\2\2\2\u00da"+
		"\u00dc\7\u0198\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\7B\2\2\u00de\u00df\7\u0083\2\2\u00df\u00e0\7\u019f"+
		"\2\2\u00e0\u00e2\7\u0145\2\2\u00e1\u00db\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00eb\3\2\2\2\u00e3\u00e5\7\u0198\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\u0135\2\2\u00e7\u00e8\7\u0083"+
		"\2\2\u00e8\u00e9\5H%\2\u00e9\u00ea\7\u0145\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e4\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u02ba\7\u0145"+
		"\2\2\u00ee\u00ef\t\13\2\2\u00ef\u00f0\7\u0083\2\2\u00f0\u00f1\5H%\2\u00f1"+
		"\u00f2\7\u0145\2\2\u00f2\u02ba\3\2\2\2\u00f3\u02ba\7,\2\2\u00f4\u02ba"+
		"\7-\2\2\u00f5\u00f6\t\f\2\2\u00f6\u00f7\7\u0083\2\2\u00f7\u00f8\7\u01a4"+
		"\2\2\u00f8\u02ba\7\u0145\2\2\u00f9\u00fa\7\62\2\2\u00fa\u00fb\7\u0083"+
		"\2\2\u00fb\u00fc\5H%\2\u00fc\u00fd\7\u0145\2\2\u00fd\u02ba\3\2\2\2\u00fe"+
		"\u010a\t\r\2\2\u00ff\u0101\7\u0083\2\2\u0100\u0102\t\16\2\2\u0101\u0100"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105\7\u0198\2"+
		"\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108"+
		"\t\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u010b\7\u0145\2\2\u010a\u00ff\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u02ba\3\2\2\2\u010c\u02ba\7\64\2\2\u010d\u02ba\t\20\2\2\u010e\u02ba\7"+
		"\66\2\2\u010f\u02ba\5\f\7\2\u0110\u02ba\t\21\2\2\u0111\u0112\t\22\2\2"+
		"\u0112\u0113\7\u0083\2\2\u0113\u0114\t\23\2\2\u0114\u02ba\7\u0145\2\2"+
		"\u0115\u02ba\7?\2\2\u0116\u02ba\t\24\2\2\u0117\u02ba\t\25\2\2\u0118\u02ba"+
		"\7J\2\2\u0119\u02ba\7R\2\2\u011a\u02ba\7W\2\2\u011b\u02ba\t\26\2\2\u011c"+
		"\u02ba\t\27\2\2\u011d\u02ba\7\\\2\2\u011e\u011f\t\30\2\2\u011f\u0120\7"+
		"\u0083\2\2\u0120\u0123\t\31\2\2\u0121\u0122\7\u0198\2\2\u0122\u0124\t"+
		"\31\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u02ba\7\u0145\2\2\u0126\u0127\7^\2\2\u0127\u0128\7\u0083\2\2\u0128\u012b"+
		"\t\32\2\2\u0129\u012a\7\u0198\2\2\u012a\u012c\t\33\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012e\7\u0198\2\2\u012e"+
		"\u0130\7\u0191\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u02ba\7\u0145\2\2\u0132\u02ba\7a\2\2\u0133\u02ba\7b\2\2"+
		"\u0134\u0135\7d\2\2\u0135\u0136\7\u0083\2\2\u0136\u0137\t\34\2\2\u0137"+
		"\u02ba\7\u0145\2\2\u0138\u0139\7k\2\2\u0139\u013a\7\u0083\2\2\u013a\u013b"+
		"\t\35\2\2\u013b\u02ba\7\u0145\2\2\u013c\u0140\t\36\2\2\u013d\u013e\7\u0083"+
		"\2\2\u013e\u013f\t\37\2\2\u013f\u0141\7\u0145\2\2\u0140\u013d\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141\u02ba\3\2\2\2\u0142\u02ba\7l\2\2\u0143\u02ba"+
		"\7\u01c2\2\2\u0144\u02ba\7m\2\2\u0145\u0146\t \2\2\u0146\u0147\7\u0083"+
		"\2\2\u0147\u0148\t!\2\2\u0148\u02ba\7\u0145\2\2\u0149\u02ba\7w\2\2\u014a"+
		"\u02ba\7x\2\2\u014b\u02ba\7y\2\2\u014c\u02ba\7{\2\2\u014d\u014e\t\"\2"+
		"\2\u014e\u014f\7\u0083\2\2\u014f\u0150\5H%\2\u0150\u0151\7\u0145\2\2\u0151"+
		"\u02ba\3\2\2\2\u0152\u02ba\7}\2\2\u0153\u02ba\7~\2\2\u0154\u0155\7\u0082"+
		"\2\2\u0155\u0156\7\u0083\2\2\u0156\u0157\5H%\2\u0157\u0158\7\u0145\2\2"+
		"\u0158\u02ba\3\2\2\2\u0159\u015d\7\u0086\2\2\u015a\u015b\7\u0083\2\2\u015b"+
		"\u015c\t#\2\2\u015c\u015e\7\u0145\2\2\u015d\u015a\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u02ba\3\2\2\2\u015f\u0160\7\u0087\2\2\u0160\u0161\7\u0083"+
		"\2\2\u0161\u0162\5H%\2\u0162\u0163\7\u0198\2\2\u0163\u0166\5H%\2\u0164"+
		"\u0165\7\u0198\2\2\u0165\u0167\5H%\2\u0166\u0164\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7\u0145\2\2\u0169\u02ba\3\2\2\2"+
		"\u016a\u016b\7\u008d\2\2\u016b\u016c\7\u0083\2\2\u016c\u016d\5H%\2\u016d"+
		"\u016e\7\u0145\2\2\u016e\u02ba\3\2\2\2\u016f\u0173\t$\2\2\u0170\u0171"+
		"\7\u0083\2\2\u0171\u0172\t%\2\2\u0172\u0174\7\u0145\2\2\u0173\u0170\3"+
		"\2\2\2\u0173\u0174\3\2\2\2\u0174\u02ba\3\2\2\2\u0175\u0179\7\u008f\2\2"+
		"\u0176\u0177\7\u0083\2\2\u0177\u0178\t&\2\2\u0178\u017a\7\u0145\2\2\u0179"+
		"\u0176\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u02ba\3\2\2\2\u017b\u017c\7\u0092"+
		"\2\2\u017c\u017d\7\u0083\2\2\u017d\u017e\t\'\2\2\u017e\u02ba\7\u0145\2"+
		"\2\u017f\u02ba\7\u0096\2\2\u0180\u02ba\7\u0097\2\2\u0181\u02ba\7\u009a"+
		"\2\2\u0182\u02ba\7\u009c\2\2\u0183\u02ba\7\u009e\2\2\u0184\u02ba\7\u009f"+
		"\2\2\u0185\u02ba\7\u00a0\2\2\u0186\u018a\t(\2\2\u0187\u0188\7\u0083\2"+
		"\2\u0188\u0189\t)\2\2\u0189\u018b\7\u0145\2\2\u018a\u0187\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u02ba\3\2\2\2\u018c\u02ba\7\u00a2\2\2\u018d\u02ba"+
		"\7\u00a4\2\2\u018e\u02ba\7\u00a3\2\2\u018f\u02ba\7\u00a6\2\2\u0190\u02ba"+
		"\7\u00a5\2\2\u0191\u02ba\t*\2\2\u0192\u02ba\t+\2\2\u0193\u02ba\7\u00ab"+
		"\2\2\u0194\u02ba\7\u00ad\2\2\u0195\u02ba\t,\2\2\u0196\u02ba\t-\2\2\u0197"+
		"\u02ba\7\u00b2\2\2\u0198\u02ba\7\u00ac\2\2\u0199\u02ba\t.\2\2\u019a\u02ba"+
		"\t/\2\2\u019b\u02ba\t\60\2\2\u019c\u02ba\7\u00bb\2\2\u019d\u02ba\7\u00bf"+
		"\2\2\u019e\u02ba\7\u00c2\2\2\u019f\u02ba\t\61\2\2\u01a0\u02ba\t\62\2\2"+
		"\u01a1\u02ba\7\u00c7\2\2\u01a2\u02ba\t\63\2\2\u01a3\u02ba\7\u00c9\2\2"+
		"\u01a4\u02ba\7\u00ca\2\2\u01a5\u02ba\7\u00cc\2\2\u01a6\u02ba\t\64\2\2"+
		"\u01a7\u02ba\7\u00d0\2\2\u01a8\u02ba\7\u00d1\2\2\u01a9\u02ba\7\u00d2\2"+
		"\2\u01aa\u02ba\7\u00d4\2\2\u01ab\u02ba\7\u00d5\2\2\u01ac\u02ba\7\u00d6"+
		"\2\2\u01ad\u02ba\7\u00d7\2\2\u01ae\u02ba\7\u00d9\2\2\u01af\u02ba\t\65"+
		"\2\2\u01b0\u02ba\7\u00dc\2\2\u01b1\u02ba\t\66\2\2\u01b2\u02ba\t\67\2\2"+
		"\u01b3\u02ba\t8\2\2\u01b4\u02ba\7\u00e5\2\2\u01b5\u02ba\t9\2\2\u01b6\u02ba"+
		"\7\u00e8\2\2\u01b7\u02ba\7\u00e9\2\2\u01b8\u02ba\7\u00eb\2\2\u01b9\u02ba"+
		"\7\u00ee\2\2\u01ba\u02ba\7\u00ef\2\2\u01bb\u02ba\7\u00f0\2\2\u01bc\u02ba"+
		"\t:\2\2\u01bd\u02ba\t;\2\2\u01be\u02ba\t<\2\2\u01bf\u02ba\7\u00fb\2\2"+
		"\u01c0\u02ba\7\u00fc\2\2\u01c1\u02ba\7\u00ff\2\2\u01c2\u02ba\t=\2\2\u01c3"+
		"\u02ba\t>\2\2\u01c4\u02ba\7\u0102\2\2\u01c5\u02ba\t?\2\2\u01c6\u02ba\t"+
		"@\2\2\u01c7\u02ba\tA\2\2\u01c8\u02ba\7\u0109\2\2\u01c9\u02ba\7\u010a\2"+
		"\2\u01ca\u02ba\7\u0110\2\2\u01cb\u02ba\tB\2\2\u01cc\u02ba\7\u011c\2\2"+
		"\u01cd\u01ce\tC\2\2\u01ce\u01cf\7\u0083\2\2\u01cf\u01d0\tD\2\2\u01d0\u02ba"+
		"\7\u0145\2\2\u01d1\u02ba\7\u0110\2\2\u01d2\u02ba\tE\2\2\u01d3\u02ba\t"+
		"F\2\2\u01d4\u02ba\7\u011a\2\2\u01d5\u02ba\tG\2\2\u01d6\u01e2\tH\2\2\u01d7"+
		"\u01d8\7\u0083\2\2\u01d8\u01dd\5\20\t\2\u01d9\u01da\7\u0198\2\2\u01da"+
		"\u01dc\5\20\t\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3"+
		"\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e1\7\u0145\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01d7\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u02ba\3\2\2\2\u01e4\u01e5\7\u0121\2\2\u01e5\u01e6\7\u0083"+
		"\2\2\u01e6\u01e7\tI\2\2\u01e7\u02ba\7\u0145\2\2\u01e8\u02ba\tJ\2\2\u01e9"+
		"\u02ba\tK\2\2\u01ea\u01eb\7\u012b\2\2\u01eb\u01ec\7\u0083\2\2\u01ec\u01ed"+
		"\5H%\2\u01ed\u01ee\7\u0198\2\2\u01ee\u01f1\5H%\2\u01ef\u01f0\7\u0198\2"+
		"\2\u01f0\u01f2\5H%\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f4\7\u0145\2\2\u01f4\u02ba\3\2\2\2\u01f5\u01f6\7\u012c"+
		"\2\2\u01f6\u01f7\7\u0083\2\2\u01f7\u01f8\5H%\2\u01f8\u01f9\7\u0198\2\2"+
		"\u01f9\u01fa\5H%\2\u01fa\u01fb\7\u0145\2\2\u01fb\u02ba\3\2\2\2\u01fc\u0200"+
		"\tL\2\2\u01fd\u01fe\7\u0083\2\2\u01fe\u01ff\tM\2\2\u01ff\u0201\7\u0145"+
		"\2\2\u0200\u01fd\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u02ba\3\2\2\2\u0202"+
		"\u02ba\7\u012e\2\2\u0203\u02ba\7\u0130\2\2\u0204\u02ba\7\u012a\2\2\u0205"+
		"\u0206\tN\2\2\u0206\u0207\7\u0083\2\2\u0207\u0208\5F$\2\u0208\u0209\7"+
		"\u0145\2\2\u0209\u02ba\3\2\2\2\u020a\u0216\tO\2\2\u020b\u020d\7\u0083"+
		"\2\2\u020c\u020e\tP\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0213\3\2\2\2\u020f\u0211\7\u0198\2\2\u0210\u020f\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\5H%\2\u0213\u0210\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\7\u0145\2\2\u0216\u020b"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u02ba\3\2\2\2\u0218\u0219\tQ\2\2\u0219"+
		"\u021a\7\u0083\2\2\u021a\u021b\tR\2\2\u021b\u02ba\7\u0145\2\2\u021c\u02ba"+
		"\7\u013d\2\2\u021d\u021e\tS\2\2\u021e\u021f\7\u0083\2\2\u021f\u0220\t"+
		"\6\2\2\u0220\u02ba\7\u0145\2\2\u0221\u02ba\tT\2\2\u0222\u02ba\7\u0141"+
		"\2\2\u0223\u0224\7\u0144\2\2\u0224\u0228\7\u0083\2\2\u0225\u0229\7\22"+
		"\2\2\u0226\u0229\7\27\2\2\u0227\u0229\5H%\2\u0228\u0225\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u02ba\7\u0145"+
		"\2\2\u022b\u0237\7\u0146\2\2\u022c\u022d\7\u0083\2\2\u022d\u0232\5\22"+
		"\n\2\u022e\u022f\7\u0198\2\2\u022f\u0231\5\22\n\2\u0230\u022e\3\2\2\2"+
		"\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7\u0145\2\2\u0236\u0238\3\2\2"+
		"\2\u0237\u022c\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u02ba\3\2\2\2\u0239\u0240"+
		"\tU\2\2\u023a\u023b\7\u0083\2\2\u023b\u023c\5H%\2\u023c\u023d\7\u0198"+
		"\2\2\u023d\u023e\5H%\2\u023e\u023f\7\u0145\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023a\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u02ba\3\2\2\2\u0242\u0243\tV"+
		"\2\2\u0243\u0244\7\u0083\2\2\u0244\u0245\5H%\2\u0245\u0246\7\u0145\2\2"+
		"\u0246\u02ba\3\2\2\2\u0247\u0248\tW\2\2\u0248\u024b\7\u0083\2\2\u0249"+
		"\u024c\7\u0088\2\2\u024a\u024c\5H%\2\u024b\u0249\3\2\2\2\u024b\u024a\3"+
		"\2\2\2\u024c\u024d\3\2\2\2\u024d\u02ba\7\u0145\2\2\u024e\u02ba\tX\2\2"+
		"\u024f\u02ba\7\u0152\2\2\u0250\u0251\7\u0153\2\2\u0251\u0252\7\u0083\2"+
		"\2\u0252\u0253\5H%\2\u0253\u0254\7\u0145\2\2\u0254\u02ba\3\2\2\2\u0255"+
		"\u02ba\7\u0154\2\2\u0256\u025b\7\u0155\2\2\u0257\u0258\7\u0083\2\2\u0258"+
		"\u0259\5H%\2\u0259\u025a\7\u0145\2\2\u025a\u025c\3\2\2\2\u025b\u0257\3"+
		"\2\2\2\u025b\u025c\3\2\2\2\u025c\u02ba\3\2\2\2\u025d\u02ba\tY\2\2\u025e"+
		"\u0263\7\u0158\2\2\u025f\u0260\7\u0083\2\2\u0260\u0261\5H%\2\u0261\u0262"+
		"\7\u0145\2\2\u0262\u0264\3\2\2\2\u0263\u025f\3\2\2\2\u0263\u0264\3\2\2"+
		"\2\u0264\u02ba\3\2\2\2\u0265\u0271\tZ\2\2\u0266\u0267\7\u0083\2\2\u0267"+
		"\u026c\5\24\13\2\u0268\u0269\7\u0198\2\2\u0269\u026b\5\24\13\2\u026a\u0268"+
		"\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7\u0145\2\2\u0270\u0272"+
		"\3\2\2\2\u0271\u0266\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u02ba\3\2\2\2\u0273"+
		"\u02ba\t[\2\2\u0274\u02ba\t\\\2\2\u0275\u02ba\7\u0167\2\2\u0276\u02ba"+
		"\t]\2\2\u0277\u0283\7\u016b\2\2\u0278\u0279\7\u0083\2\2\u0279\u027e\5"+
		"\26\f\2\u027a\u027b\7\u0198\2\2\u027b\u027d\5\26\f\2\u027c\u027a\3\2\2"+
		"\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281"+
		"\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\7\u0145\2\2\u0282\u0284\3\2\2"+
		"\2\u0283\u0278\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u02ba\3\2\2\2\u0285\u02ba"+
		"\7\u016c\2\2\u0286\u0287\7\u0170\2\2\u0287\u0288\7\u0083\2\2\u0288\u0289"+
		"\t^\2\2\u0289\u02ba\7\u0145\2\2\u028a\u02ba\7\u0174\2\2\u028b\u028c\7"+
		"\u0175\2\2\u028c\u028d\7\u0083\2\2\u028d\u028e\t_\2\2\u028e\u02ba\7\u0145"+
		"\2\2\u028f\u0290\t`\2\2\u0290\u0291\7\u0083\2\2\u0291\u0292\ta\2\2\u0292"+
		"\u02ba\7\u0145\2\2\u0293\u0294\tb\2\2\u0294\u029b\7\u0083\2\2\u0295\u029c"+
		"\5F$\2\u0296\u0298\7\u01a4\2\2\u0297\u0296\3\2\2\2\u0298\u0299\3\2\2\2"+
		"\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0295"+
		"\3\2\2\2\u029b\u0297\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02ba\7\u0145\2"+
		"\2\u029e\u029f\tc\2\2\u029f\u02a0\7\u0083\2\2\u02a0\u02a1\td\2\2\u02a1"+
		"\u02ba\7\u0145\2\2\u02a2\u02a8\te\2\2\u02a3\u02a5\7\u0083\2\2\u02a4\u02a6"+
		"\tf\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a9\7\u0145\2\2\u02a8\u02a3\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ba"+
		"\3\2\2\2\u02aa\u02ab\tg\2\2\u02ab\u02ac\7\u0083\2\2\u02ac\u02ad\5H%\2"+
		"\u02ad\u02ae\7\u0145\2\2\u02ae\u02ba\3\2\2\2\u02af\u02b0\th\2\2\u02b0"+
		"\u02b1\7\u0083\2\2\u02b1\u02b2\tP\2\2\u02b2\u02ba\7\u0145\2\2\u02b3\u02b4"+
		"\ti\2\2\u02b4\u02b5\7\u0083\2\2\u02b5\u02b6\tI\2\2\u02b6\u02ba\7\u0145"+
		"\2\2\u02b7\u02ba\7\u0188\2\2\u02b8\u02ba\5\26\f\2\u02b9\u00ad\3\2\2\2"+
		"\u02b9\u00ae\3\2\2\2\u02b9\u00af\3\2\2\2\u02b9\u00b3\3\2\2\2\u02b9\u00b4"+
		"\3\2\2\2\u02b9\u00b9\3\2\2\2\u02b9\u00bd\3\2\2\2\u02b9\u00be\3\2\2\2\u02b9"+
		"\u00bf\3\2\2\2\u02b9\u00c4\3\2\2\2\u02b9\u00c5\3\2\2\2\u02b9\u00cc\3\2"+
		"\2\2\u02b9\u00cd\3\2\2\2\u02b9\u00ce\3\2\2\2\u02b9\u00d3\3\2\2\2\u02b9"+
		"\u00d4\3\2\2\2\u02b9\u00ee\3\2\2\2\u02b9\u00f3\3\2\2\2\u02b9\u00f4\3\2"+
		"\2\2\u02b9\u00f5\3\2\2\2\u02b9\u00f9\3\2\2\2\u02b9\u00fe\3\2\2\2\u02b9"+
		"\u010c\3\2\2\2\u02b9\u010d\3\2\2\2\u02b9\u010e\3\2\2\2\u02b9\u010f\3\2"+
		"\2\2\u02b9\u0110\3\2\2\2\u02b9\u0111\3\2\2\2\u02b9\u0115\3\2\2\2\u02b9"+
		"\u0116\3\2\2\2\u02b9\u0117\3\2\2\2\u02b9\u0118\3\2\2\2\u02b9\u0119\3\2"+
		"\2\2\u02b9\u011a\3\2\2\2\u02b9\u011b\3\2\2\2\u02b9\u011c\3\2\2\2\u02b9"+
		"\u011d\3\2\2\2\u02b9\u011e\3\2\2\2\u02b9\u0126\3\2\2\2\u02b9\u0132\3\2"+
		"\2\2\u02b9\u0133\3\2\2\2\u02b9\u0134\3\2\2\2\u02b9\u0138\3\2\2\2\u02b9"+
		"\u013c\3\2\2\2\u02b9\u0142\3\2\2\2\u02b9\u0143\3\2\2\2\u02b9\u0144\3\2"+
		"\2\2\u02b9\u0145\3\2\2\2\u02b9\u0149\3\2\2\2\u02b9\u014a\3\2\2\2\u02b9"+
		"\u014b\3\2\2\2\u02b9\u014c\3\2\2\2\u02b9\u014d\3\2\2\2\u02b9\u0152\3\2"+
		"\2\2\u02b9\u0153\3\2\2\2\u02b9\u0154\3\2\2\2\u02b9\u0159\3\2\2\2\u02b9"+
		"\u015f\3\2\2\2\u02b9\u016a\3\2\2\2\u02b9\u016f\3\2\2\2\u02b9\u0175\3\2"+
		"\2\2\u02b9\u017b\3\2\2\2\u02b9\u017f\3\2\2\2\u02b9\u0180\3\2\2\2\u02b9"+
		"\u0181\3\2\2\2\u02b9\u0182\3\2\2\2\u02b9\u0183\3\2\2\2\u02b9\u0184\3\2"+
		"\2\2\u02b9\u0185\3\2\2\2\u02b9\u0186\3\2\2\2\u02b9\u018c\3\2\2\2\u02b9"+
		"\u018d\3\2\2\2\u02b9\u018e\3\2\2\2\u02b9\u018f\3\2\2\2\u02b9\u0190\3\2"+
		"\2\2\u02b9\u0191\3\2\2\2\u02b9\u0192\3\2\2\2\u02b9\u0193\3\2\2\2\u02b9"+
		"\u0194\3\2\2\2\u02b9\u0195\3\2\2\2\u02b9\u0196\3\2\2\2\u02b9\u0197\3\2"+
		"\2\2\u02b9\u0198\3\2\2\2\u02b9\u0199\3\2\2\2\u02b9\u019a\3\2\2\2\u02b9"+
		"\u019b\3\2\2\2\u02b9\u019c\3\2\2\2\u02b9\u019d\3\2\2\2\u02b9\u019e\3\2"+
		"\2\2\u02b9\u019f\3\2\2\2\u02b9\u01a0\3\2\2\2\u02b9\u01a1\3\2\2\2\u02b9"+
		"\u01a2\3\2\2\2\u02b9\u01a3\3\2\2\2\u02b9\u01a4\3\2\2\2\u02b9\u01a5\3\2"+
		"\2\2\u02b9\u01a6\3\2\2\2\u02b9\u01a7\3\2\2\2\u02b9\u01a8\3\2\2\2\u02b9"+
		"\u01a9\3\2\2\2\u02b9\u01aa\3\2\2\2\u02b9\u01ab\3\2\2\2\u02b9\u01ac\3\2"+
		"\2\2\u02b9\u01ad\3\2\2\2\u02b9\u01ae\3\2\2\2\u02b9\u01af\3\2\2\2\u02b9"+
		"\u01b0\3\2\2\2\u02b9\u01b1\3\2\2\2\u02b9\u01b2\3\2\2\2\u02b9\u01b3\3\2"+
		"\2\2\u02b9\u01b4\3\2\2\2\u02b9\u01b5\3\2\2\2\u02b9\u01b6\3\2\2\2\u02b9"+
		"\u01b7\3\2\2\2\u02b9\u01b8\3\2\2\2\u02b9\u01b9\3\2\2\2\u02b9\u01ba\3\2"+
		"\2\2\u02b9\u01bb\3\2\2\2\u02b9\u01bc\3\2\2\2\u02b9\u01bd\3\2\2\2\u02b9"+
		"\u01be\3\2\2\2\u02b9\u01bf\3\2\2\2\u02b9\u01c0\3\2\2\2\u02b9\u01c1\3\2"+
		"\2\2\u02b9\u01c2\3\2\2\2\u02b9\u01c3\3\2\2\2\u02b9\u01c4\3\2\2\2\u02b9"+
		"\u01c5\3\2\2\2\u02b9\u01c6\3\2\2\2\u02b9\u01c7\3\2\2\2\u02b9\u01c8\3\2"+
		"\2\2\u02b9\u01c9\3\2\2\2\u02b9\u01ca\3\2\2\2\u02b9\u01cb\3\2\2\2\u02b9"+
		"\u01cc\3\2\2\2\u02b9\u01cd\3\2\2\2\u02b9\u01d1\3\2\2\2\u02b9\u01d2\3\2"+
		"\2\2\u02b9\u01d3\3\2\2\2\u02b9\u01d4\3\2\2\2\u02b9\u01d5\3\2\2\2\u02b9"+
		"\u01d6\3\2\2\2\u02b9\u01e4\3\2\2\2\u02b9\u01e8\3\2\2\2\u02b9\u01e9\3\2"+
		"\2\2\u02b9\u01ea\3\2\2\2\u02b9\u01f5\3\2\2\2\u02b9\u01fc\3\2\2\2\u02b9"+
		"\u0202\3\2\2\2\u02b9\u0203\3\2\2\2\u02b9\u0204\3\2\2\2\u02b9\u0205\3\2"+
		"\2\2\u02b9\u020a\3\2\2\2\u02b9\u0218\3\2\2\2\u02b9\u021c\3\2\2\2\u02b9"+
		"\u021d\3\2\2\2\u02b9\u0221\3\2\2\2\u02b9\u0222\3\2\2\2\u02b9\u0223\3\2"+
		"\2\2\u02b9\u022b\3\2\2\2\u02b9\u0239\3\2\2\2\u02b9\u0242\3\2\2\2\u02b9"+
		"\u0247\3\2\2\2\u02b9\u024e\3\2\2\2\u02b9\u024f\3\2\2\2\u02b9\u0250\3\2"+
		"\2\2\u02b9\u0255\3\2\2\2\u02b9\u0256\3\2\2\2\u02b9\u025d\3\2\2\2\u02b9"+
		"\u025e\3\2\2\2\u02b9\u0265\3\2\2\2\u02b9\u0273\3\2\2\2\u02b9\u0274\3\2"+
		"\2\2\u02b9\u0275\3\2\2\2\u02b9\u0276\3\2\2\2\u02b9\u0277\3\2\2\2\u02b9"+
		"\u0285\3\2\2\2\u02b9\u0286\3\2\2\2\u02b9\u028a\3\2\2\2\u02b9\u028b\3\2"+
		"\2\2\u02b9\u028f\3\2\2\2\u02b9\u0293\3\2\2\2\u02b9\u029e\3\2\2\2\u02b9"+
		"\u02a2\3\2\2\2\u02b9\u02aa\3\2\2\2\u02b9\u02af\3\2\2\2\u02b9\u02b3\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\13\3\2\2\2\u02bb\u02bc"+
		"\tj\2\2\u02bc\u02bd\7\u0083\2\2\u02bd\u02c7\5\16\b\2\u02be\u02c0\7\u01a4"+
		"\2\2\u02bf\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c5\7\u0198\2\2\u02c4\u02bf"+
		"\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\5H%\2\u02c7"+
		"\u02c4\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\7\u0145"+
		"\2\2\u02ca\r\3\2\2\2\u02cb\u02cc\tk\2\2\u02cc\17\3\2\2\2\u02cd\u02da\7"+
		"\u0185\2\2\u02ce\u02cf\7\u0185\2\2\u02cf\u02d0\7\u0083\2\2\u02d0\u02d1"+
		"\tl\2\2\u02d1\u02da\7\u0145\2\2\u02d2\u02da\7\u0118\2\2\u02d3\u02da\7"+
		"\u0133\2\2\u02d4\u02da\7\u00ea\2\2\u02d5\u02da\7\31\2\2\u02d6\u02da\7"+
		"\u009b\2\2\u02d7\u02da\7\u008e\2\2\u02d8\u02da\7\13\2\2\u02d9\u02cd\3"+
		"\2\2\2\u02d9\u02ce\3\2\2\2\u02d9\u02d2\3\2\2\2\u02d9\u02d3\3\2\2\2\u02d9"+
		"\u02d4\3\2\2\2\u02d9\u02d5\3\2\2\2\u02d9\u02d6\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02d9\u02d8\3\2\2\2\u02da\21\3\2\2\2\u02db\u02dc\tm\2\2\u02dc\23"+
		"\3\2\2\2\u02dd\u02de\tn\2\2\u02de\25\3\2\2\2\u02df\u02f2\7G\2\2\u02e0"+
		"\u02f2\7\u00b8\2\2\u02e1\u02f2\7e\2\2\u02e2\u02f2\7\u00cd\2\2\u02e3\u02e7"+
		"\to\2\2\u02e4\u02e5\7\u0083\2\2\u02e5\u02e6\tp\2\2\u02e6\u02e8\7\u0145"+
		"\2\2\u02e7\u02e4\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02f2\3\2\2\2\u02e9"+
		"\u02f2\7\u00f2\2\2\u02ea\u02f2\7\u00f3\2\2\u02eb\u02f2\7\u015c\2\2\u02ec"+
		"\u02f2\7\u0151\2\2\u02ed\u02f2\7\u00f9\2\2\u02ee\u02f2\7\u00fa\2\2\u02ef"+
		"\u02f2\7L\2\2\u02f0\u02f2\7\u00bc\2\2\u02f1\u02df\3\2\2\2\u02f1\u02e0"+
		"\3\2\2\2\u02f1\u02e1\3\2\2\2\u02f1\u02e2\3\2\2\2\u02f1\u02e3\3\2\2\2\u02f1"+
		"\u02e9\3\2\2\2\u02f1\u02ea\3\2\2\2\u02f1\u02eb\3\2\2\2\u02f1\u02ec\3\2"+
		"\2\2\u02f1\u02ed\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f0\3\2\2\2\u02f2\27\3\2\2\2\u02f3\u02f7\7\3\2\2\u02f4\u02f6\7\u01a6"+
		"\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\7\u01a1"+
		"\2\2\u02fb\31\3\2\2\2\u02fc\u02fd\7V\2\2\u02fd\u02fe\7 \2\2\u02fe\u02ff"+
		"\5@!\2\u02ff\u0301\7Q\2\2\u0300\u0302\7\u019a\2\2\u0301\u0300\3\2\2\2"+
		"\u0301\u0302\3\2\2\2\u0302\33\3\2\2\2\u0303\u0304\7V\2\2\u0304\u0305\7"+
		"\u0155\2\2\u0305\u0306\5B\"\2\u0306\u0308\7Q\2\2\u0307\u0309\7\u019a\2"+
		"\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\35\3\2\2\2\u030a\u030b"+
		"\7V\2\2\u030b\u030c\7\u0158\2\2\u030c\u030d\5@!\2\u030d\u030f\7Q\2\2\u030e"+
		"\u0310\7\u019a\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\37\3"+
		"\2\2\2\u0311\u0312\7\'\2\2\u0312\u031f\5\"\22\2\u0313\u0315\7\u01a1\2"+
		"\2\u0314\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317"+
		"\3\2\2\2\u0317\u031b\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031c\5&\24\2\u031a"+
		"\u031c\7\u0166\2\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c\u031e"+
		"\3\2\2\2\u031d\u0316\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0325\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0324\7\u01a1"+
		"\2\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0329\7\u019a"+
		"\2\2\u0329!\3\2\2\2\u032a\u032e\5H%\2\u032b\u032e\5F$\2\u032c\u032e\5"+
		"J&\2\u032d\u032a\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032c\3\2\2\2\u032e"+
		"\u033d\3\2\2\2\u032f\u0331\7\u01a1\2\2\u0330\u032f\3\2\2\2\u0331\u0334"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0335\u0339\tq\2\2\u0336\u0338\7\u01a1\2\2\u0337\u0336"+
		"\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u033c\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033e\5$\23\2\u033d\u0332\3\2"+
		"\2\2\u033d\u033e\3\2\2\2\u033e#\3\2\2\2\u033f\u0342\5H%\2\u0340\u0342"+
		"\5F$\2\u0341\u033f\3\2\2\2\u0341\u0340\3\2\2\2\u0342%\3\2\2\2\u0343\u0347"+
		"\7\u0143\2\2\u0344\u0346\7\u01a1\2\2\u0345\u0344\3\2\2\2\u0346\u0349\3"+
		"\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u034a\u0353\5.\30\2\u034b\u034d\7\u01a1\2\2\u034c\u034b"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0352\5.\30\2\u0351\u034c\3\2\2\2\u0352\u0355\3\2"+
		"\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\'\3\2\2\2\u0355\u0353"+
		"\3\2\2\2\u0356\u035b\5*\26\2\u0357\u035a\5 \21\2\u0358\u035a\5@!\2\u0359"+
		"\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2"+
		"\2\2\u035b\u035c\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0360\5,\27\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360)\3\2\2\2"+
		"\u0361\u0369\7\u0142\2\2\u0362\u0364\7\u01a1\2\2\u0363\u0362\3\2\2\2\u0364"+
		"\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2"+
		"\2\2\u0367\u0365\3\2\2\2\u0368\u036a\5.\30\2\u0369\u0365\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0370\3\2"+
		"\2\2\u036d\u036f\7\u01a1\2\2\u036e\u036d\3\2\2\2\u036f\u0372\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0370\3\2"+
		"\2\2\u0373\u0374\7\u019a\2\2\u0374+\3\2\2\2\u0375\u0376\7\u0142\2\2\u0376"+
		"\u037a\7\u0125\2\2\u0377\u0379\7\u01a1\2\2\u0378\u0377\3\2\2\2\u0379\u037c"+
		"\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037d\3\2\2\2\u037c"+
		"\u037a\3\2\2\2\u037d\u037e\7\u019a\2\2\u037e-\3\2\2\2\u037f\u0381\tr\2"+
		"\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0386"+
		"\5\64\33\2\u0383\u0385\7\u01a1\2\2\u0384\u0383\3\2\2\2\u0385\u0388\3\2"+
		"\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\3\2\2\2\u0388"+
		"\u0386\3\2\2\2\u0389\u038d\7\35\2\2\u038a\u038c\7\u01a1\2\2\u038b\u038a"+
		"\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0398\5\66\34\2\u0391\u0393\7"+
		"\u01a1\2\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2"+
		"\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u0399"+
		"\5\60\31\2\u0398\u0394\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u03a1\3\2\2\2"+
		"\u039a\u039c\7\u01a1\2\2\u039b\u039a\3\2\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u039d\3\2"+
		"\2\2\u03a0\u03a2\5\62\32\2\u03a1\u039d\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"/\3\2\2\2\u03a3\u03a7\tq\2\2\u03a4\u03a6\7\u01a1\2\2\u03a5\u03a4\3\2\2"+
		"\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03ac"+
		"\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad\5H%\2\u03ab\u03ad\5F$\2\u03ac"+
		"\u03aa\3\2\2\2\u03ac\u03ab\3\2\2\2\u03ad\61\3\2\2\2\u03ae\u03b2\7\u0127"+
		"\2\2\u03af\u03b1\7\u01a1\2\2\u03b0\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b7\3\2\2\2\u03b4\u03b2\3\2"+
		"\2\2\u03b5\u03b8\5H%\2\u03b6\u03b8\5F$\2\u03b7\u03b5\3\2\2\2\u03b7\u03b6"+
		"\3\2\2\2\u03b8\63\3\2\2\2\u03b9\u03be\5H%\2\u03ba\u03be\5F$\2\u03bb\u03be"+
		"\5> \2\u03bc\u03be\5D#\2\u03bd\u03b9\3\2\2\2\u03bd\u03ba\3\2\2\2\u03bd"+
		"\u03bb\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\65\3\2\2\2\u03bf\u03c4\5H%\2"+
		"\u03c0\u03c4\5F$\2\u03c1\u03c4\5> \2\u03c2\u03c4\5D#\2\u03c3\u03bf\3\2"+
		"\2\2\u03c3\u03c0\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c2\3\2\2\2\u03c4"+
		"\67\3\2\2\2\u03c5\u03c7\7K\2\2\u03c6\u03c8\7\u019a\2\2\u03c7\u03c6\3\2"+
		"\2\2\u03c7\u03c8\3\2\2\2\u03c89\3\2\2\2\u03c9\u03cb\ts\2\2\u03ca\u03cc"+
		"\7\u019a\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc;\3\2\2\2\u03cd"+
		"\u03ce\7\u016d\2\2\u03ce\u03d0\5H%\2\u03cf\u03d1\7\u019a\2\2\u03d0\u03cf"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1=\3\2\2\2\u03d2\u03d4\7\u019b\2\2\u03d3"+
		"\u03d5\5@!\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2"+
		"\2\u03d6\u03d7\7\u019b\2\2\u03d7?\3\2\2\2\u03d8\u03db\5D#\2\u03d9\u03db"+
		"\7\u01a1\2\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2\2\u03db\u03dc\3\2\2"+
		"\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03ddA\3\2\2\2\u03de\u03e3"+
		"\5D#\2\u03df\u03e3\7\'\2\2\u03e0\u03e3\7\u0142\2\2\u03e1\u03e3\7\u01a1"+
		"\2\2\u03e2\u03de\3\2\2\2\u03e2\u03df\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2"+
		"\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2"+
		"\2\2\u03e5C\3\2\2\2\u03e6\u03ef\5F$\2\u03e7\u03ef\5H%\2\u03e8\u03ef\5"+
		"J&\2\u03e9\u03ef\7\u01a0\2\2\u03ea\u03ef\7\u01a4\2\2\u03eb\u03ef\7\u019a"+
		"\2\2\u03ec\u03ef\7\u0083\2\2\u03ed\u03ef\7\u0145\2\2\u03ee\u03e6\3\2\2"+
		"\2\u03ee\u03e7\3\2\2\2\u03ee\u03e8\3\2\2\2\u03ee\u03e9\3\2\2\2\u03ee\u03ea"+
		"\3\2\2\2\u03ee\u03eb\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u0402\3\2"+
		"\2\2\u03f2\u03f3\7\u01a1\2\2\u03f3\u03fc\7\4\2\2\u03f4\u03fd\5F$\2\u03f5"+
		"\u03fd\5H%\2\u03f6\u03fd\5J&\2\u03f7\u03fd\7\u01a0\2\2\u03f8\u03fd\7\u01a4"+
		"\2\2\u03f9\u03fd\7\u019a\2\2\u03fa\u03fd\7\u0083\2\2\u03fb\u03fd\7\u0145"+
		"\2\2\u03fc\u03f4\3\2\2\2\u03fc\u03f5\3\2\2\2\u03fc\u03f6\3\2\2\2\u03fc"+
		"\u03f7\3\2\2\2\u03fc\u03f8\3\2\2\2\u03fc\u03f9\3\2\2\2\u03fc\u03fa\3\2"+
		"\2\2\u03fc\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u03f2\3\2\2\2\u0401\u0404\3\2"+
		"\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403E\3\2\2\2\u0404\u0402"+
		"\3\2\2\2\u0405\u0408\7\u019e\2\2\u0406\u0408\5z>\2\u0407\u0405\3\2\2\2"+
		"\u0407\u0406\3\2\2\2\u0408G\3\2\2\2\u0409\u040a\tt\2\2\u040aI\3\2\2\2"+
		"\u040b\u040c\7\u019f\2\2\u040cK\3\2\2\2\u040d\u0410\5N(\2\u040e\u0410"+
		"\5P)\2\u040f\u040d\3\2\2\2\u040f\u040e\3\2\2\2\u0410M\3\2\2\2\u0411\u0414"+
		"\5R*\2\u0412\u0414\5T+\2\u0413\u0411\3\2\2\2\u0413\u0412\3\2\2\2\u0414"+
		"O\3\2\2\2\u0415\u041d\5V,\2\u0416\u041d\5`\61\2\u0417\u041d\5b\62\2\u0418"+
		"\u041d\5d\63\2\u0419\u041d\5h\65\2\u041a\u041d\5j\66\2\u041b\u041d\5l"+
		"\67\2\u041c\u0415\3\2\2\2\u041c\u0416\3\2\2\2\u041c\u0417\3\2\2\2\u041c"+
		"\u0418\3\2\2\2\u041c\u0419\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041b\3\2"+
		"\2\2\u041dQ\3\2\2\2\u041e\u041f\7\u0199\2\2\u041f\u0421\tu\2\2\u0420\u0422"+
		"\tv\2\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422S\3\2\2\2\u0423\u0424"+
		"\7\u0199\2\2\u0424\u0425\7\u01c2\2\2\u0425\u0426\tw\2\2\u0426U\3\2\2\2"+
		"\u0427\u0428\7\u0199\2\2\u0428\u0429\7:\2\2\u0429\u042b\7\u019e\2\2\u042a"+
		"\u042c\7\u01b4\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042f"+
		"\3\2\2\2\u042d\u0430\5X-\2\u042e\u0430\7\u01c3\2\2\u042f\u042d\3\2\2\2"+
		"\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2\2\2\u0431\u0433"+
		"\7\u01ca\2\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433W\3\2\2\2\u0434"+
		"\u0439\5H%\2\u0435\u0439\5Z.\2\u0436\u0439\7\u019e\2\2\u0437\u0439\7\u01cb"+
		"\2\2\u0438\u0434\3\2\2\2\u0438\u0435\3\2\2\2\u0438\u0436\3\2\2\2\u0438"+
		"\u0437\3\2\2\2\u0439Y\3\2\2\2\u043a\u043c\7\u0083\2\2\u043b\u043a\3\2"+
		"\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u0440\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\5\\/\2\u0441\u0442\5^\60"+
		"\2\u0442\u0444\3\2\2\2\u0443\u043d\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0443"+
		"\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0458\3\2\2\2\u0447\u0449\7\u0083\2"+
		"\2\u0448\u0447\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b"+
		"\3\2\2\2\u044b\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u0451\5\\/\2\u044e"+
		"\u0450\7\u0145\2\2\u044f\u044e\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f"+
		"\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454"+
		"\u0455\5^\60\2\u0455\u0457\3\2\2\2\u0456\u044a\3\2\2\2\u0457\u045a\3\2"+
		"\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\3\2\2\2\u045a"+
		"\u0458\3\2\2\2\u045b\u045f\5\\/\2\u045c\u045e\7\u0145\2\2\u045d\u045c"+
		"\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"[\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0463\tx\2\2\u0463]\3\2\2\2\u0464"+
		"\u0465\ty\2\2\u0465_\3\2\2\2\u0466\u0467\7\u0199\2\2\u0467\u0468\7\u01c1"+
		"\2\2\u0468\u0469\5p9\2\u0469a\3\2\2\2\u046a\u046b\7\u0199\2\2\u046b\u046c"+
		"\7\u01bb\2\2\u046cc\3\2\2\2\u046d\u046e\7\u0199\2\2\u046e\u046f\7\u01bd"+
		"\2\2\u046fe\3\2\2\2\u0470\u0474\5Z.\2\u0471\u0474\7\u019e\2\2\u0472\u0474"+
		"\5H%\2\u0473\u0470\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0472\3\2\2\2\u0474"+
		"g\3\2\2\2\u0475\u0476\7\u0199\2\2\u0476\u0479\7\u01bf\2\2\u0477\u047a"+
		"\7\u01d1\2\2\u0478\u047a\5f\64\2\u0479\u0477\3\2\2\2\u0479\u0478\3\2\2"+
		"\2\u047ai\3\2\2\2\u047b\u047c\7\u0199\2\2\u047c\u0484\7\u01d2\2\2\u047d"+
		"\u0480\5f\64\2\u047e\u047f\tz\2\2\u047f\u0481\5f\64\2\u0480\u047e\3\2"+
		"\2\2\u0480\u0481\3\2\2\2\u0481\u0485\3\2\2\2\u0482\u0485\5p9\2\u0483\u0485"+
		"\7\u01c9\2\2\u0484\u047d\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0483\3\2\2"+
		"\2\u0485k\3\2\2\2\u0486\u0487\7\u0199\2\2\u0487\u0488\7\u01bc\2\2\u0488"+
		"m\3\2\2\2\u0489\u048b\7\u01c5\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048d\3\2\2\2\u048c\u048e\7\u01c7\2\2\u048d\u048c\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048e\u04aa\3\2\2\2\u048f\u04ab\7\u01be\2\2\u0490\u04ab"+
		"\7\u01aa\2\2\u0491\u04ab\7\u01b0\2\2\u0492\u04ab\7\u01ac\2\2\u0493\u0495"+
		"\7\u01c0\2\2\u0494\u0496\7\u01cd\2\2\u0495\u0494\3\2\2\2\u0495\u0496\3"+
		"\2\2\2\u0496\u04ab\3\2\2\2\u0497\u04ab\7\u01ab\2\2\u0498\u049a\7\u01c6"+
		"\2\2\u0499\u049b\7\u01cd\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u04ab\3\2\2\2\u049c\u04ab\7\u01b2\2\2\u049d\u049f\7\u01c6\2\2\u049e\u04a0"+
		"\7\u01cd\2\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2"+
		"\2\u04a1\u04a2\7\u01c8\2\2\u04a2\u04ab\7\u01be\2\2\u04a3\u04ab\7\u01b1"+
		"\2\2\u04a4\u04a6\7\u01c0\2\2\u04a5\u04a7\7\u01cd\2\2\u04a6\u04a5\3\2\2"+
		"\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\7\u01c8\2\2\u04a9"+
		"\u04ab\7\u01be\2\2\u04aa\u048f\3\2\2\2\u04aa\u0490\3\2\2\2\u04aa\u0491"+
		"\3\2\2\2\u04aa\u0492\3\2\2\2\u04aa\u0493\3\2\2\2\u04aa\u0497\3\2\2\2\u04aa"+
		"\u0498\3\2\2\2\u04aa\u049c\3\2\2\2\u04aa\u049d\3\2\2\2\u04aa\u04a3\3\2"+
		"\2\2\u04aa\u04a4\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04ae\7\u01d0\2\2\u04ad"+
		"\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04aeo\3\2\2\2\u04af\u04b1\7\u0083"+
		"\2\2\u04b0\u04af\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2"+
		"\u04b3\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04c6\5r"+
		":\2\u04b6\u04ba\t{\2\2\u04b7\u04b9\7\u0083\2\2\u04b8\u04b7\3\2\2\2\u04b9"+
		"\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2"+
		"\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04c1\5r:\2\u04be\u04c0\7\u0145\2\2\u04bf"+
		"\u04be\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2"+
		"\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04b6\3\2\2\2\u04c5"+
		"\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04cc\3\2"+
		"\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cb\7\u0145\2\2\u04ca\u04c9\3\2\2\2\u04cb"+
		"\u04ce\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04d0\3\2"+
		"\2\2\u04ce\u04cc\3\2\2\2\u04cf\u04b2\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1"+
		"\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2q\3\2\2\2\u04d3\u04d7\5t;\2\u04d4"+
		"\u04d7\5x=\2\u04d5\u04d7\5v<\2\u04d6\u04d3\3\2\2\2\u04d6\u04d4\3\2\2\2"+
		"\u04d6\u04d5\3\2\2\2\u04d7s\3\2\2\2\u04d8\u04dc\5Z.\2\u04d9\u04dc\7\u019e"+
		"\2\2\u04da\u04dc\5H%\2\u04db\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04da"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e1\5n8\2\u04de\u04e2\5Z.\2\u04df"+
		"\u04e2\7\u019e\2\2\u04e0\u04e2\5H%\2\u04e1\u04de\3\2\2\2\u04e1\u04df\3"+
		"\2\2\2\u04e1\u04e0\3\2\2\2\u04e2u\3\2\2\2\u04e3\u04e4\7\u019e\2\2\u04e4"+
		"w\3\2\2\2\u04e5\u04e7\7\u019e\2\2\u04e6\u04e8\7\u01c5\2\2\u04e7\u04e6"+
		"\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04eb\7\u01c7\2"+
		"\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed"+
		"\7\u01b8\2\2\u04edy\3\2\2\2\u04ee\u04ef\t|\2\2\u04ef{\3\2\2\2\u0091\u008b"+
		"\u008d\u0097\u009b\u009d\u00a3\u00a8\u00ca\u00d8\u00db\u00e1\u00e4\u00eb"+
		"\u0101\u0104\u0107\u010a\u0123\u012b\u012f\u0140\u015d\u0166\u0173\u0179"+
		"\u018a\u01dd\u01e2\u01f1\u0200\u020d\u0210\u0213\u0216\u0228\u0232\u0237"+
		"\u0240\u024b\u025b\u0263\u026c\u0271\u027e\u0283\u0299\u029b\u02a5\u02a8"+
		"\u02b9\u02c1\u02c4\u02c7\u02d9\u02e7\u02f1\u02f7\u0301\u0308\u030f\u0316"+
		"\u031b\u031f\u0325\u032d\u0332\u0339\u033d\u0341\u0347\u034e\u0353\u0359"+
		"\u035b\u035f\u0365\u036b\u0370\u037a\u0380\u0386\u038d\u0394\u0398\u039d"+
		"\u03a1\u03a7\u03ac\u03b2\u03b7\u03bd\u03c3\u03c7\u03cb\u03d0\u03d4\u03da"+
		"\u03dc\u03e2\u03e4\u03ee\u03f0\u03fc\u03fe\u0402\u0407\u040f\u0413\u041c"+
		"\u0421\u042b\u042f\u0432\u0438\u043d\u0445\u044a\u0451\u0458\u045f\u0473"+
		"\u0479\u0480\u0484\u048a\u048d\u0495\u049a\u049f\u04a6\u04aa\u04ad\u04b2"+
		"\u04ba\u04c1\u04c6\u04cc\u04d1\u04d6\u04db\u04e1\u04e7\u04ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}