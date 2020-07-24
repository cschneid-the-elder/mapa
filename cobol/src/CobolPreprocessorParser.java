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
		CLASSIC_COMMENTLINE=1, CLASSIC_LINE_NUMBER=2, CLASSIC_EOL_COMMENT=3, ID_DIVISION_TAG=4, 
		NIST_SEMI_COMMENT_A=5, NIST_SEMI_COMMENT_B=6, NIST_SEMI_COMMENT_C=7, NIST_SEMI_COMMENT_G=8, 
		NIST_SEMI_COMMENT_J=9, NIST_SEMI_COMMENT_P=10, NIST_SEMI_COMMENT_S=11, 
		NIST_SEMI_COMMENT_T=12, NIST_SEMI_COMMENT_U=13, NIST_SEMI_COMMENT_X=14, 
		NIST_SEMI_COMMENT_Y=15, ABD=16, ADATA=17, ADV=18, AFP=19, ALIAS=20, ALPHNUM=21, 
		ANSI=22, ANY=23, APOST=24, AR=25, ARCH=26, ARITH=27, AUTO=28, AWO=29, 
		BIN=30, BLOCK0=31, BUF=32, BUFSIZE=33, BY=34, CBL=35, CBLCARD=36, CICS=37, 
		CO=38, COBOL2=39, COBOL3=40, CODEPAGE=41, COMPAT=42, COMPILE=43, COPY=44, 
		COPYLOC=45, COPYRIGHT=46, CP=47, CPLC=48, CPP=49, CPSM=50, CPYR=51, CS=52, 
		CURR=53, CURRENCY=54, DATA=55, DATEPROC=56, DBCS=57, DD=58, DEBUG=59, 
		DEC=60, DECK=61, DEF=62, DEFINE=63, DIAGTRUNC=64, DISPSIGN=65, DIVISION=66, 
		DLI=67, DLL=68, DP=69, DS=70, DSN=71, DSNAME=72, DTR=73, DU=74, DUMP=75, 
		DWARF=76, DYN=77, DYNAM=78, EDF=79, EJECT=80, EJPD=81, EN=82, ENDP=83, 
		ENDPERIOD=84, ENGLISH=85, END_EXEC=86, EPILOG=87, EVENP=88, EVENPACK=89, 
		EXCI=90, EXEC=91, EXIT=92, EXP=93, EXPORTALL=94, EXTEND=95, FASTSRT=96, 
		FEPI=97, FLAG=98, FLAGSTD=99, FSRT=100, FULL=101, GDS=102, GRAPHIC=103, 
		HEX=104, HGPR=105, HOOK=106, IC=107, ID=108, IDENTIFICATION=109, IN=110, 
		INITCHECK=111, INTDATE=112, INITIAL=113, INL=114, JA=115, JP=116, KA=117, 
		LANG=118, LANGUAGE=119, LAX=120, LAXPERF=121, LC=122, LEASM=123, LENGTH=124, 
		LIB=125, LILIAN=126, LIN=127, LINECOUNT=128, LINKAGE=129, LIST=130, LM=131, 
		LONGMIXED=132, LONGUPPER=133, LP=134, LPARENCHAR=135, LU=136, LXPRF=137, 
		MAP=138, MARGINS=139, MAX=140, MD=141, MDECK=142, MIG=143, MIXED=144, 
		MAXPCF=145, MSG=146, NAME=147, NAT=148, NATIONAL=149, NATLANG=150, NC=151, 
		NN=152, NO=153, NOADATA=154, NOADV=155, NOALIAS=156, NOALPHNUM=157, NOAWO=158, 
		NOBIN=159, NOBLOCK0=160, NOC=161, NOCBLCARD=162, NOCICS=163, NOCMPR2=164, 
		NOCOMPILE=165, NOCOPYLOC=166, NOCOPYRIGHT=167, NOCPLC=168, NOCPSM=169, 
		NOCPYR=170, NOCURR=171, NOCURRENCY=172, NOD=173, NODATEPROC=174, NODBCS=175, 
		NODE=176, NODEBUG=177, NODECK=178, NODEFINE=179, NODEF=180, NODIAGTRUNC=181, 
		NODLL=182, NODSNAME=183, NODU=184, NODUMP=185, NODP=186, NODTR=187, NODWARF=188, 
		NODYN=189, NODYNAM=190, NOEDF=191, NOEJPD=192, NOENDP=193, NOENDPERIOD=194, 
		NOEPILOG=195, NOEVENP=196, NOEVENPACK=197, NOEXIT=198, NOEXP=199, NOEXPORTALL=200, 
		NOF=201, NOFASTSRT=202, NOFEPI=203, NOFLAG=204, NOFLAGMIG=205, NOFLAGSTD=206, 
		NOFSRT=207, NOGRAPHIC=208, NOHOOK=209, NOINITCHECK=210, NOIC=211, NOINITIAL=212, 
		NOINLINE=213, NOINL=214, NOLAXPERF=215, NOLENGTH=216, NOLIB=217, NOLINKAGE=218, 
		NOLIST=219, NOLXPRF=220, NOMAP=221, NOMD=222, NOMDECK=223, NONAME=224, 
		NONUM=225, NONUMBER=226, NOOBJ=227, NOOBJECT=228, NOOMITODOMIN=229, NOOFF=230, 
		NOOFFSET=231, NOOOM=232, NOOPSEQUENCE=233, NOOPT=234, NOOPTIMIZE=235, 
		NOOPTIONS=236, NOP=237, NOPAC=238, NOPARMCHECK=239, NOPFD=240, NOPRESERVE=241, 
		NOPROLOG=242, NORENT=243, NORULES=244, NOS=245, NOSEP=246, NOSEPARATE=247, 
		NOSEQ=248, NOSERV=249, NOSERVICE=250, NOSLACKBYTES=251, NOSLCKB=252, NOSO=253, 
		NOSOURCE=254, NOSPIE=255, NOSQL=256, NOSQLC=257, NOSQLCCSID=258, NOSQLIMS=259, 
		NOSSR=260, NOSSRANGE=261, NOSTDTRUNC=262, NOSEQUENCE=263, NOSTGOPT=264, 
		NOSUPP=265, NOSUPPRESS=266, NOTERM=267, NOTERMINAL=268, NOTEST=269, NOTHREAD=270, 
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
		THREAD=368, TITLE=369, TRIG=370, TRUNC=371, UE=372, UNREF=373, UPPER=374, 
		VBREF=375, VLR=376, VOLATILE=377, VS=378, VSAMOPENFS=379, WD=380, WORD=381, 
		XMLPARSE=382, XMLSS=383, XOPTS=384, XP=385, XREF=386, YEARWINDOW=387, 
		YW=388, ZC=389, ZD=390, ZLEN=391, ZON=392, ZONECHECK=393, ZONEDATA=394, 
		ZWB=395, C_CHAR=396, D_CHAR=397, E_CHAR=398, F_CHAR=399, H_CHAR=400, I_CHAR=401, 
		M_CHAR=402, N_CHAR=403, O_CHAR=404, Q_CHAR=405, S_CHAR=406, U_CHAR=407, 
		W_CHAR=408, X_CHAR=409, COMMENTTAG=410, COMMACHAR=411, COMPILER_DIRECTIVE_TAG=412, 
		DOT=413, DOUBLEEQUALCHAR=414, NONNUMERICLITERAL=415, NUMERICLITERAL=416, 
		IDENTIFIER=417, FILENAME=418, PSEUDOTEXTIDENTIFIER=419, NEWLINE=420, MULTINEWLINE=421, 
		COMMENTLINE=422, WS=423, TEXT=424, BOL=425, CD_WS=426, ASTERISKCHAR=427, 
		EQUALCHAR=428, GREATERTHANCHAR=429, LESSTHANCHAR=430, PLUSCHAR=431, MINUSCHAR=432, 
		SLASHCHAR=433, NOTEQUALCHAR=434, GREATEROREQUALCHAR=435, LESSOREQUALCHAR=436, 
		AS=437, AND=438, CALLINT=439, CALLINTERFACE=440, DEFINED=441, DLL_INTERFACE=442, 
		DYNAMIC=443, ELSE=444, END_EVALUATE=445, END_IF=446, EQUAL=447, EVALUATE=448, 
		GREATER=449, IF=450, INLINE=451, INLINE_OFF=452, INLINE_ON=453, IS=454, 
		LESS=455, NOT=456, OR=457, OTHER=458, OVERRIDE=459, PARAMETER=460, STATIC=461, 
		THAN=462, THROUGH=463, THRU=464, TO=465, TRUE=466, WHEN=467;
	public static final int
		RULE_startRule = 0, RULE_identificationDivisionTag = 1, RULE_compilerOptions = 2, 
		RULE_compilerXOpts = 3, RULE_compilerOption = 4, RULE_define_opt = 5, 
		RULE_numcheck_opts = 6, RULE_rules_opts = 7, RULE_ssrange_opts = 8, RULE_test_opts = 9, 
		RULE_classicCommentEntry = 10, RULE_execCicsStatement = 11, RULE_execSqlStatement = 12, 
		RULE_execSqlImsStatement = 13, RULE_copyStatement = 14, RULE_copySource = 15, 
		RULE_copyLibrary = 16, RULE_replacingPhrase = 17, RULE_replaceArea = 18, 
		RULE_replaceByStatement = 19, RULE_replaceOffStatement = 20, RULE_replaceClause = 21, 
		RULE_directoryPhrase = 22, RULE_familyPhrase = 23, RULE_replaceable = 24, 
		RULE_replacement = 25, RULE_ejectStatement = 26, RULE_skipStatement = 27, 
		RULE_titleStatement = 28, RULE_pseudoText = 29, RULE_charData = 30, RULE_charDataSql = 31, 
		RULE_charDataLine = 32, RULE_cobolWord = 33, RULE_literal = 34, RULE_filename = 35, 
		RULE_compilerDirectiveStatement = 36, RULE_compilerDirective = 37, RULE_conditionalCompilationStatement = 38, 
		RULE_compilerDirectiveCallInterface = 39, RULE_compilerDirectiveInline = 40, 
		RULE_conditionalCompilationDefine = 41, RULE_conditionalCompilationDefinePredicate = 42, 
		RULE_conditionalCompilationArithmeticExpression = 43, RULE_conditionalCompilationSimpleArithmeticExpression = 44, 
		RULE_conditionalCompilationArithmeticOp = 45, RULE_conditionalCompilationIf = 46, 
		RULE_conditionalCompilationElse = 47, RULE_conditionalCompilationEndIf = 48, 
		RULE_conditionalCompilationEvaluate = 49, RULE_conditionalCompilationWhen = 50, 
		RULE_conditionalCompilationEndEvaluate = 51, RULE_conditionalCompilationComparisonOp = 52, 
		RULE_conditionalCompilationRelationalCondition = 53, RULE_conditionalCompilationCondition = 54, 
		RULE_conditionalCompilationSimpleRelationalCondition = 55, RULE_conditionalCompilationBinaryCondition = 56, 
		RULE_conditionalCompilationDefinedCondition = 57, RULE_charDataKeyword = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "identificationDivisionTag", "compilerOptions", "compilerXOpts", 
			"compilerOption", "define_opt", "numcheck_opts", "rules_opts", "ssrange_opts", 
			"test_opts", "classicCommentEntry", "execCicsStatement", "execSqlStatement", 
			"execSqlImsStatement", "copyStatement", "copySource", "copyLibrary", 
			"replacingPhrase", "replaceArea", "replaceByStatement", "replaceOffStatement", 
			"replaceClause", "directoryPhrase", "familyPhrase", "replaceable", "replacement", 
			"ejectStatement", "skipStatement", "titleStatement", "pseudoText", "charData", 
			"charDataSql", "charDataLine", "cobolWord", "literal", "filename", "compilerDirectiveStatement", 
			"compilerDirective", "conditionalCompilationStatement", "compilerDirectiveCallInterface", 
			"compilerDirectiveInline", "conditionalCompilationDefine", "conditionalCompilationDefinePredicate", 
			"conditionalCompilationArithmeticExpression", "conditionalCompilationSimpleArithmeticExpression", 
			"conditionalCompilationArithmeticOp", "conditionalCompilationIf", "conditionalCompilationElse", 
			"conditionalCompilationEndIf", "conditionalCompilationEvaluate", "conditionalCompilationWhen", 
			"conditionalCompilationEndEvaluate", "conditionalCompilationComparisonOp", 
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
			null, null, "'*>'", "','", "'>>'", "'.'", "'=='", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'*'", "'='", "'>'", 
			"'<'", "'+'", "'-'", "'/'", "'<>'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASSIC_COMMENTLINE", "CLASSIC_LINE_NUMBER", "CLASSIC_EOL_COMMENT", 
			"ID_DIVISION_TAG", "NIST_SEMI_COMMENT_A", "NIST_SEMI_COMMENT_B", "NIST_SEMI_COMMENT_C", 
			"NIST_SEMI_COMMENT_G", "NIST_SEMI_COMMENT_J", "NIST_SEMI_COMMENT_P", 
			"NIST_SEMI_COMMENT_S", "NIST_SEMI_COMMENT_T", "NIST_SEMI_COMMENT_U", 
			"NIST_SEMI_COMMENT_X", "NIST_SEMI_COMMENT_Y", "ABD", "ADATA", "ADV", 
			"AFP", "ALIAS", "ALPHNUM", "ANSI", "ANY", "APOST", "AR", "ARCH", "ARITH", 
			"AUTO", "AWO", "BIN", "BLOCK0", "BUF", "BUFSIZE", "BY", "CBL", "CBLCARD", 
			"CICS", "CO", "COBOL2", "COBOL3", "CODEPAGE", "COMPAT", "COMPILE", "COPY", 
			"COPYLOC", "COPYRIGHT", "CP", "CPLC", "CPP", "CPSM", "CPYR", "CS", "CURR", 
			"CURRENCY", "DATA", "DATEPROC", "DBCS", "DD", "DEBUG", "DEC", "DECK", 
			"DEF", "DEFINE", "DIAGTRUNC", "DISPSIGN", "DIVISION", "DLI", "DLL", "DP", 
			"DS", "DSN", "DSNAME", "DTR", "DU", "DUMP", "DWARF", "DYN", "DYNAM", 
			"EDF", "EJECT", "EJPD", "EN", "ENDP", "ENDPERIOD", "ENGLISH", "END_EXEC", 
			"EPILOG", "EVENP", "EVENPACK", "EXCI", "EXEC", "EXIT", "EXP", "EXPORTALL", 
			"EXTEND", "FASTSRT", "FEPI", "FLAG", "FLAGSTD", "FSRT", "FULL", "GDS", 
			"GRAPHIC", "HEX", "HGPR", "HOOK", "IC", "ID", "IDENTIFICATION", "IN", 
			"INITCHECK", "INTDATE", "INITIAL", "INL", "JA", "JP", "KA", "LANG", "LANGUAGE", 
			"LAX", "LAXPERF", "LC", "LEASM", "LENGTH", "LIB", "LILIAN", "LIN", "LINECOUNT", 
			"LINKAGE", "LIST", "LM", "LONGMIXED", "LONGUPPER", "LP", "LPARENCHAR", 
			"LU", "LXPRF", "MAP", "MARGINS", "MAX", "MD", "MDECK", "MIG", "MIXED", 
			"MAXPCF", "MSG", "NAME", "NAT", "NATIONAL", "NATLANG", "NC", "NN", "NO", 
			"NOADATA", "NOADV", "NOALIAS", "NOALPHNUM", "NOAWO", "NOBIN", "NOBLOCK0", 
			"NOC", "NOCBLCARD", "NOCICS", "NOCMPR2", "NOCOMPILE", "NOCOPYLOC", "NOCOPYRIGHT", 
			"NOCPLC", "NOCPSM", "NOCPYR", "NOCURR", "NOCURRENCY", "NOD", "NODATEPROC", 
			"NODBCS", "NODE", "NODEBUG", "NODECK", "NODEFINE", "NODEF", "NODIAGTRUNC", 
			"NODLL", "NODSNAME", "NODU", "NODUMP", "NODP", "NODTR", "NODWARF", "NODYN", 
			"NODYNAM", "NOEDF", "NOEJPD", "NOENDP", "NOENDPERIOD", "NOEPILOG", "NOEVENP", 
			"NOEVENPACK", "NOEXIT", "NOEXP", "NOEXPORTALL", "NOF", "NOFASTSRT", "NOFEPI", 
			"NOFLAG", "NOFLAGMIG", "NOFLAGSTD", "NOFSRT", "NOGRAPHIC", "NOHOOK", 
			"NOINITCHECK", "NOIC", "NOINITIAL", "NOINLINE", "NOINL", "NOLAXPERF", 
			"NOLENGTH", "NOLIB", "NOLINKAGE", "NOLIST", "NOLXPRF", "NOMAP", "NOMD", 
			"NOMDECK", "NONAME", "NONUM", "NONUMBER", "NOOBJ", "NOOBJECT", "NOOMITODOMIN", 
			"NOOFF", "NOOFFSET", "NOOOM", "NOOPSEQUENCE", "NOOPT", "NOOPTIMIZE", 
			"NOOPTIONS", "NOP", "NOPAC", "NOPARMCHECK", "NOPFD", "NOPRESERVE", "NOPROLOG", 
			"NORENT", "NORULES", "NOS", "NOSEP", "NOSEPARATE", "NOSEQ", "NOSERV", 
			"NOSERVICE", "NOSLACKBYTES", "NOSLCKB", "NOSO", "NOSOURCE", "NOSPIE", 
			"NOSQL", "NOSQLC", "NOSQLCCSID", "NOSQLIMS", "NOSSR", "NOSSRANGE", "NOSTDTRUNC", 
			"NOSEQUENCE", "NOSTGOPT", "NOSUPP", "NOSUPPRESS", "NOTERM", "NOTERMINAL", 
			"NOTEST", "NOTHREAD", "NOTRIG", "NOUNRA", "NOUNREFALL", "NOUNREFSOURCE", 
			"NOUNRS", "NOVBREF", "NOVOLATILE", "NOWD", "NOWORD", "NOX", "NOXREF", 
			"NOZC", "NOZLEN", "NOZON", "NOZONECHECK", "NOZWB", "NS", "NSEQ", "NSYMBOL", 
			"NUM", "NUMBER", "NUMCHECK", "NUMPROC", "OBJ", "OBJECT", "OF", "OFF", 
			"OFFSET", "ON", "OMITODOMIN", "OOM", "OP", "OPMARGINS", "OPSEQUENCE", 
			"OPT", "OPTFILE", "OPTIMIZE", "OPTIONS", "OUT", "OUTDD", "PAC", "PARMCHECK", 
			"PATH", "PC", "PFD", "PPTDBG", "PGMN", "PGMNAME", "PRESERVE", "PROCESS", 
			"PROLOG", "QUALIFY", "QUA", "QUOTE", "RENT", "REPLACE", "REPLACING", 
			"RMODE", "RPARENCHAR", "RULES", "SEP", "SEPARATE", "SEQ", "SEQUENCE", 
			"SERV", "SERVICE", "SHORT", "SIZE", "SLACKBYTES", "SLCKB", "SOURCE", 
			"SP", "SPACE", "SPIE", "SQL", "SQLC", "SQLCCSID", "SQLIMS", "SKIP1", 
			"SKIP2", "SKIP3", "SO", "SS", "SSR", "SSRANGE", "STANDARD", "STD", "STGOPT", 
			"STRICT", "SUCC", "SUPP", "SUPPRESS", "SYSEIB", "SZ", "TERM", "TERMINAL", 
			"TEST", "THREAD", "TITLE", "TRIG", "TRUNC", "UE", "UNREF", "UPPER", "VBREF", 
			"VLR", "VOLATILE", "VS", "VSAMOPENFS", "WD", "WORD", "XMLPARSE", "XMLSS", 
			"XOPTS", "XP", "XREF", "YEARWINDOW", "YW", "ZC", "ZD", "ZLEN", "ZON", 
			"ZONECHECK", "ZONEDATA", "ZWB", "C_CHAR", "D_CHAR", "E_CHAR", "F_CHAR", 
			"H_CHAR", "I_CHAR", "M_CHAR", "N_CHAR", "O_CHAR", "Q_CHAR", "S_CHAR", 
			"U_CHAR", "W_CHAR", "X_CHAR", "COMMENTTAG", "COMMACHAR", "COMPILER_DIRECTIVE_TAG", 
			"DOT", "DOUBLEEQUALCHAR", "NONNUMERICLITERAL", "NUMERICLITERAL", "IDENTIFIER", 
			"FILENAME", "PSEUDOTEXTIDENTIFIER", "NEWLINE", "MULTINEWLINE", "COMMENTLINE", 
			"WS", "TEXT", "BOL", "CD_WS", "ASTERISKCHAR", "EQUALCHAR", "GREATERTHANCHAR", 
			"LESSTHANCHAR", "PLUSCHAR", "MINUSCHAR", "SLASHCHAR", "NOTEQUALCHAR", 
			"GREATEROREQUALCHAR", "LESSOREQUALCHAR", "AS", "AND", "CALLINT", "CALLINTERFACE", 
			"DEFINED", "DLL_INTERFACE", "DYNAMIC", "ELSE", "END_EVALUATE", "END_IF", 
			"EQUAL", "EVALUATE", "GREATER", "IF", "INLINE", "INLINE_OFF", "INLINE_ON", 
			"IS", "LESS", "NOT", "OR", "OTHER", "OVERRIDE", "PARAMETER", "STATIC", 
			"THAN", "THROUGH", "THRU", "TO", "TRUE", "WHEN"
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIC_COMMENTLINE) | (1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DIAGTRUNC - 64)) | (1L << (DISPSIGN - 64)) | (1L << (DIVISION - 64)) | (1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXEC - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (ID - 64)) | (1L << (IDENTIFICATION - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SKIP1 - 320)) | (1L << (SKIP2 - 320)) | (1L << (SKIP3 - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)) | (1L << (XMLSS - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (COMPILER_DIRECTIVE_TAG - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 457)) & ~0x3f) == 0 && ((1L << (_la - 457)) & ((1L << (OR - 457)) | (1L << (STATIC - 457)) | (1L << (TO - 457)) | (1L << (TRUE - 457)) | (1L << (WHEN - 457)))) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(118);
					identificationDivisionTag();
					}
					break;
				case 2:
					{
					setState(119);
					compilerOptions();
					}
					break;
				case 3:
					{
					setState(120);
					compilerDirectiveStatement();
					}
					break;
				case 4:
					{
					setState(121);
					classicCommentEntry();
					}
					break;
				case 5:
					{
					setState(122);
					copyStatement();
					}
					break;
				case 6:
					{
					setState(123);
					execCicsStatement();
					}
					break;
				case 7:
					{
					setState(124);
					execSqlStatement();
					}
					break;
				case 8:
					{
					setState(125);
					execSqlImsStatement();
					}
					break;
				case 9:
					{
					setState(126);
					replaceOffStatement();
					}
					break;
				case 10:
					{
					setState(127);
					replaceArea();
					}
					break;
				case 11:
					{
					setState(128);
					ejectStatement();
					}
					break;
				case 12:
					{
					setState(129);
					skipStatement();
					}
					break;
				case 13:
					{
					setState(130);
					titleStatement();
					}
					break;
				case 14:
					{
					setState(131);
					charDataLine();
					}
					break;
				case 15:
					{
					setState(132);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDENTIFICATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(141);
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
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==CBL || _la==PROCESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(149);
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
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(144);
							match(COMMACHAR);
							}
						}

						setState(147);
						compilerOption();
						}
						break;
					case XOPTS:
						{
						setState(148);
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
				setState(151); 
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
			setState(153);
			match(XOPTS);
			setState(154);
			match(LPARENCHAR);
			setState(155);
			compilerOption();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADATA - 17)) | (1L << (ADV - 17)) | (1L << (AFP - 17)) | (1L << (APOST - 17)) | (1L << (AR - 17)) | (1L << (ARCH - 17)) | (1L << (ARITH - 17)) | (1L << (AWO - 17)) | (1L << (BLOCK0 - 17)) | (1L << (BUF - 17)) | (1L << (BUFSIZE - 17)) | (1L << (CBLCARD - 17)) | (1L << (CICS - 17)) | (1L << (COBOL2 - 17)) | (1L << (COBOL3 - 17)) | (1L << (CODEPAGE - 17)) | (1L << (COMPILE - 17)) | (1L << (COPYLOC - 17)) | (1L << (COPYRIGHT - 17)) | (1L << (CP - 17)) | (1L << (CPLC - 17)) | (1L << (CPP - 17)) | (1L << (CPSM - 17)) | (1L << (CPYR - 17)) | (1L << (CURR - 17)) | (1L << (CURRENCY - 17)) | (1L << (DATA - 17)) | (1L << (DATEPROC - 17)) | (1L << (DBCS - 17)) | (1L << (DEBUG - 17)) | (1L << (DECK - 17)) | (1L << (DEF - 17)) | (1L << (DEFINE - 17)) | (1L << (DIAGTRUNC - 17)) | (1L << (DISPSIGN - 17)) | (1L << (DLL - 17)) | (1L << (DP - 17)) | (1L << (DS - 17)) | (1L << (DTR - 17)) | (1L << (DU - 17)) | (1L << (DUMP - 17)) | (1L << (DWARF - 17)) | (1L << (DYN - 17)) | (1L << (DYNAM - 17)) | (1L << (EDF - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (EJPD - 81)) | (1L << (EPILOG - 81)) | (1L << (EXIT - 81)) | (1L << (EXP - 81)) | (1L << (EXPORTALL - 81)) | (1L << (FASTSRT - 81)) | (1L << (FEPI - 81)) | (1L << (FLAG - 81)) | (1L << (FLAGSTD - 81)) | (1L << (FSRT - 81)) | (1L << (GDS - 81)) | (1L << (GRAPHIC - 81)) | (1L << (HGPR - 81)) | (1L << (HOOK - 81)) | (1L << (IC - 81)) | (1L << (INITCHECK - 81)) | (1L << (INTDATE - 81)) | (1L << (INITIAL - 81)) | (1L << (INL - 81)) | (1L << (LANG - 81)) | (1L << (LANGUAGE - 81)) | (1L << (LC - 81)) | (1L << (LEASM - 81)) | (1L << (LENGTH - 81)) | (1L << (LIB - 81)) | (1L << (LIN - 81)) | (1L << (LINECOUNT - 81)) | (1L << (LINKAGE - 81)) | (1L << (LIST - 81)) | (1L << (LP - 81)) | (1L << (MAP - 81)) | (1L << (MARGINS - 81)) | (1L << (MD - 81)) | (1L << (MDECK - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (MAXPCF - 145)) | (1L << (NAME - 145)) | (1L << (NATLANG - 145)) | (1L << (NC - 145)) | (1L << (NOADATA - 145)) | (1L << (NOADV - 145)) | (1L << (NOAWO - 145)) | (1L << (NOBLOCK0 - 145)) | (1L << (NOC - 145)) | (1L << (NOCBLCARD - 145)) | (1L << (NOCICS - 145)) | (1L << (NOCMPR2 - 145)) | (1L << (NOCOMPILE - 145)) | (1L << (NOCOPYLOC - 145)) | (1L << (NOCOPYRIGHT - 145)) | (1L << (NOCPLC - 145)) | (1L << (NOCPSM - 145)) | (1L << (NOCPYR - 145)) | (1L << (NOCURR - 145)) | (1L << (NOCURRENCY - 145)) | (1L << (NOD - 145)) | (1L << (NODATEPROC - 145)) | (1L << (NODBCS - 145)) | (1L << (NODE - 145)) | (1L << (NODEBUG - 145)) | (1L << (NODECK - 145)) | (1L << (NODEFINE - 145)) | (1L << (NODEF - 145)) | (1L << (NODIAGTRUNC - 145)) | (1L << (NODLL - 145)) | (1L << (NODU - 145)) | (1L << (NODUMP - 145)) | (1L << (NODP - 145)) | (1L << (NODTR - 145)) | (1L << (NODWARF - 145)) | (1L << (NODYN - 145)) | (1L << (NODYNAM - 145)) | (1L << (NOEDF - 145)) | (1L << (NOEJPD - 145)) | (1L << (NOEPILOG - 145)) | (1L << (NOEXIT - 145)) | (1L << (NOEXP - 145)) | (1L << (NOEXPORTALL - 145)) | (1L << (NOF - 145)) | (1L << (NOFASTSRT - 145)) | (1L << (NOFEPI - 145)) | (1L << (NOFLAG - 145)) | (1L << (NOFLAGMIG - 145)) | (1L << (NOFLAGSTD - 145)) | (1L << (NOFSRT - 145)) | (1L << (NOGRAPHIC - 145)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (NOHOOK - 209)) | (1L << (NOINITCHECK - 209)) | (1L << (NOIC - 209)) | (1L << (NOINITIAL - 209)) | (1L << (NOINLINE - 209)) | (1L << (NOINL - 209)) | (1L << (NOLENGTH - 209)) | (1L << (NOLIB - 209)) | (1L << (NOLINKAGE - 209)) | (1L << (NOLIST - 209)) | (1L << (NOMAP - 209)) | (1L << (NOMD - 209)) | (1L << (NOMDECK - 209)) | (1L << (NONAME - 209)) | (1L << (NONUM - 209)) | (1L << (NONUMBER - 209)) | (1L << (NOOBJ - 209)) | (1L << (NOOBJECT - 209)) | (1L << (NOOFF - 209)) | (1L << (NOOFFSET - 209)) | (1L << (NOOPSEQUENCE - 209)) | (1L << (NOOPT - 209)) | (1L << (NOOPTIMIZE - 209)) | (1L << (NOOPTIONS - 209)) | (1L << (NOP - 209)) | (1L << (NOPARMCHECK - 209)) | (1L << (NOPROLOG - 209)) | (1L << (NORENT - 209)) | (1L << (NORULES - 209)) | (1L << (NOS - 209)) | (1L << (NOSEP - 209)) | (1L << (NOSEPARATE - 209)) | (1L << (NOSEQ - 209)) | (1L << (NOSERV - 209)) | (1L << (NOSERVICE - 209)) | (1L << (NOSO - 209)) | (1L << (NOSOURCE - 209)) | (1L << (NOSPIE - 209)) | (1L << (NOSQL - 209)) | (1L << (NOSQLC - 209)) | (1L << (NOSQLCCSID - 209)) | (1L << (NOSQLIMS - 209)) | (1L << (NOSSR - 209)) | (1L << (NOSSRANGE - 209)) | (1L << (NOSTDTRUNC - 209)) | (1L << (NOSEQUENCE - 209)) | (1L << (NOSTGOPT - 209)) | (1L << (NOSUPP - 209)) | (1L << (NOSUPPRESS - 209)) | (1L << (NOTERM - 209)) | (1L << (NOTERMINAL - 209)) | (1L << (NOTEST - 209)) | (1L << (NOTHREAD - 209)))) != 0) || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (NOVBREF - 276)) | (1L << (NOWD - 276)) | (1L << (NOWORD - 276)) | (1L << (NOX - 276)) | (1L << (NOXREF - 276)) | (1L << (NOZC - 276)) | (1L << (NOZONECHECK - 276)) | (1L << (NOZWB - 276)) | (1L << (NS - 276)) | (1L << (NSEQ - 276)) | (1L << (NSYMBOL - 276)) | (1L << (NUM - 276)) | (1L << (NUMBER - 276)) | (1L << (NUMCHECK - 276)) | (1L << (NUMPROC - 276)) | (1L << (OBJ - 276)) | (1L << (OBJECT - 276)) | (1L << (OFF - 276)) | (1L << (OFFSET - 276)) | (1L << (OP - 276)) | (1L << (OPMARGINS - 276)) | (1L << (OPSEQUENCE - 276)) | (1L << (OPT - 276)) | (1L << (OPTFILE - 276)) | (1L << (OPTIMIZE - 276)) | (1L << (OPTIONS - 276)) | (1L << (OUT - 276)) | (1L << (OUTDD - 276)) | (1L << (PARMCHECK - 276)) | (1L << (PC - 276)) | (1L << (PGMN - 276)) | (1L << (PGMNAME - 276)) | (1L << (PROLOG - 276)) | (1L << (QUALIFY - 276)) | (1L << (QUA - 276)) | (1L << (QUOTE - 276)) | (1L << (RENT - 276)) | (1L << (RMODE - 276)) | (1L << (RULES - 276)) | (1L << (SEP - 276)) | (1L << (SEPARATE - 276)) | (1L << (SEQ - 276)) | (1L << (SEQUENCE - 276)) | (1L << (SERV - 276)) | (1L << (SERVICE - 276)) | (1L << (SIZE - 276)))) != 0) || ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (SOURCE - 341)) | (1L << (SP - 341)) | (1L << (SPACE - 341)) | (1L << (SPIE - 341)) | (1L << (SQL - 341)) | (1L << (SQLC - 341)) | (1L << (SQLCCSID - 341)) | (1L << (SQLIMS - 341)) | (1L << (SO - 341)) | (1L << (SSR - 341)) | (1L << (SSRANGE - 341)) | (1L << (STGOPT - 341)) | (1L << (SUPP - 341)) | (1L << (SUPPRESS - 341)) | (1L << (SYSEIB - 341)) | (1L << (SZ - 341)) | (1L << (TERM - 341)) | (1L << (TERMINAL - 341)) | (1L << (TEST - 341)) | (1L << (THREAD - 341)) | (1L << (TRUNC - 341)) | (1L << (VBREF - 341)) | (1L << (VLR - 341)) | (1L << (VS - 341)) | (1L << (VSAMOPENFS - 341)) | (1L << (WD - 341)) | (1L << (WORD - 341)) | (1L << (XMLPARSE - 341)) | (1L << (XP - 341)) | (1L << (XREF - 341)) | (1L << (YEARWINDOW - 341)) | (1L << (YW - 341)) | (1L << (ZC - 341)) | (1L << (ZD - 341)) | (1L << (ZONECHECK - 341)) | (1L << (ZONEDATA - 341)) | (1L << (ZWB - 341)) | (1L << (C_CHAR - 341)) | (1L << (D_CHAR - 341)) | (1L << (F_CHAR - 341)))) != 0) || ((((_la - 405)) & ~0x3f) == 0 && ((1L << (_la - 405)) & ((1L << (Q_CHAR - 405)) | (1L << (S_CHAR - 405)) | (1L << (X_CHAR - 405)) | (1L << (COMMACHAR - 405)) | (1L << (INLINE - 405)))) != 0)) {
				{
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(156);
					match(COMMACHAR);
					}
				}

				setState(159);
				compilerOption();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ADATA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(ADV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(169);
				match(AFP);
				setState(170);
				match(LPARENCHAR);
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==NOVOLATILE || _la==VOLATILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				match(RPARENCHAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(APOST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(174);
				match(ARCH);
				setState(175);
				match(LPARENCHAR);
				setState(176);
				literal();
				setState(177);
				match(RPARENCHAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==AR || _la==ARITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(LPARENCHAR);
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(RPARENCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(AWO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				match(BLOCK0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==BUF || _la==BUFSIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				match(LPARENCHAR);
				setState(187);
				literal();
				setState(188);
				match(RPARENCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				match(CBLCARD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				match(CICS);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(192);
					match(LPARENCHAR);
					setState(193);
					literal();
					setState(194);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(198);
				match(COBOL2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(199);
				match(COBOL3);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==CODEPAGE || _la==CP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				match(LPARENCHAR);
				setState(202);
				literal();
				setState(203);
				match(RPARENCHAR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(205);
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
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==COPYLOC || _la==CPLC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				match(LPARENCHAR);
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(208);
					match(IDENTIFIER);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(209);
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
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(212);
						match(COMMACHAR);
						}
					}

					setState(215);
					match(DSN);
					setState(216);
					match(LPARENCHAR);
					setState(217);
					match(FILENAME);
					setState(218);
					match(RPARENCHAR);
					}
					break;
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATH || _la==COMMACHAR) {
					{
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(221);
						match(COMMACHAR);
						}
					}

					setState(224);
					match(PATH);
					setState(225);
					match(LPARENCHAR);
					setState(226);
					literal();
					setState(227);
					match(RPARENCHAR);
					}
				}

				setState(231);
				match(RPARENCHAR);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==COPYRIGHT || _la==CPYR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(LPARENCHAR);
				setState(234);
				literal();
				setState(235);
				match(RPARENCHAR);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(237);
				match(CPP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(238);
				match(CPSM);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==CURR || _la==CURRENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				match(LPARENCHAR);
				setState(241);
				match(TEXT);
				setState(242);
				match(RPARENCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(243);
				match(DATA);
				setState(244);
				match(LPARENCHAR);
				setState(245);
				literal();
				setState(246);
				match(RPARENCHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==DATEPROC || _la==DP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(249);
					match(LPARENCHAR);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FLAG || _la==NOFLAG) {
						{
						setState(250);
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

					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(253);
						match(COMMACHAR);
						}
					}

					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOTRIG || _la==TRIG) {
						{
						setState(256);
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

					setState(259);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(262);
				match(DBCS);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(263);
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
				setState(264);
				match(DEBUG);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(265);
				define_opt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(266);
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
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==DISPSIGN || _la==DS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				match(LPARENCHAR);
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==SEP || _la==C_CHAR || _la==S_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				match(RPARENCHAR);
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(271);
				match(DLL);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(272);
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
				setState(273);
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
				setState(274);
				match(EDF);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(275);
				match(EPILOG);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(276);
				match(EXIT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(277);
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
				setState(278);
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
				setState(279);
				match(FEPI);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==FLAG || _la==F_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				match(LPARENCHAR);
				setState(282);
				_la = _input.LA(1);
				if ( !(((((_la - 398)) & ~0x3f) == 0 && ((1L << (_la - 398)) & ((1L << (E_CHAR - 398)) | (1L << (I_CHAR - 398)) | (1L << (S_CHAR - 398)) | (1L << (U_CHAR - 398)) | (1L << (W_CHAR - 398)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(283);
					match(COMMACHAR);
					setState(284);
					_la = _input.LA(1);
					if ( !(((((_la - 398)) & ~0x3f) == 0 && ((1L << (_la - 398)) & ((1L << (E_CHAR - 398)) | (1L << (I_CHAR - 398)) | (1L << (S_CHAR - 398)) | (1L << (U_CHAR - 398)) | (1L << (W_CHAR - 398)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(287);
				match(RPARENCHAR);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(288);
				match(FLAGSTD);
				setState(289);
				match(LPARENCHAR);
				setState(290);
				_la = _input.LA(1);
				if ( !(((((_la - 400)) & ~0x3f) == 0 && ((1L << (_la - 400)) & ((1L << (H_CHAR - 400)) | (1L << (I_CHAR - 400)) | (1L << (M_CHAR - 400)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(291);
					match(COMMACHAR);
					setState(292);
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
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(295);
					match(COMMACHAR);
					setState(296);
					match(O_CHAR);
					}
				}

				setState(299);
				match(RPARENCHAR);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(300);
				match(GDS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(301);
				match(GRAPHIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(302);
				match(HGPR);
				setState(303);
				match(LPARENCHAR);
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==NOPRESERVE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				match(RPARENCHAR);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(306);
				match(INTDATE);
				setState(307);
				match(LPARENCHAR);
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==ANSI || _la==LILIAN) ) {
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
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(310);
				_la = _input.LA(1);
				if ( !(_la==IC || _la==INITCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(311);
					match(LPARENCHAR);
					setState(312);
					_la = _input.LA(1);
					if ( !(_la==LAX || _la==STRICT) ) {
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
				}
				}
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(316);
				match(INITIAL);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(317);
				match(INLINE);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(318);
				match(INL);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==LANG || _la==LANGUAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				match(LPARENCHAR);
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==CS || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EN - 82)) | (1L << (ENGLISH - 82)) | (1L << (JA - 82)) | (1L << (JP - 82)) | (1L << (KA - 82)))) != 0) || _la==UE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				match(RPARENCHAR);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(323);
				match(LEASM);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(324);
				match(LENGTH);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(325);
				match(LIB);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(326);
				match(LIN);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==LC || _la==LINECOUNT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				match(LPARENCHAR);
				setState(329);
				literal();
				setState(330);
				match(RPARENCHAR);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(332);
				match(LINKAGE);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(333);
				match(LIST);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				{
				setState(334);
				match(LP);
				setState(335);
				match(LPARENCHAR);
				setState(336);
				literal();
				setState(337);
				match(RPARENCHAR);
				}
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				{
				setState(339);
				match(MAP);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(340);
					match(LPARENCHAR);
					setState(341);
					_la = _input.LA(1);
					if ( !(_la==DEC || _la==HEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(342);
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
				setState(345);
				match(MARGINS);
				setState(346);
				match(LPARENCHAR);
				setState(347);
				literal();
				setState(348);
				match(COMMACHAR);
				setState(349);
				literal();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(350);
					match(COMMACHAR);
					setState(351);
					literal();
					}
				}

				setState(354);
				match(RPARENCHAR);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				{
				setState(356);
				match(MAXPCF);
				setState(357);
				match(LPARENCHAR);
				setState(358);
				literal();
				setState(359);
				match(RPARENCHAR);
				}
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==MD || _la==MDECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(362);
					match(LPARENCHAR);
					setState(363);
					_la = _input.LA(1);
					if ( !(_la==COMPILE || _la==NOC || _la==NOCOMPILE || _la==C_CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(364);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(367);
				match(NAME);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(368);
					match(LPARENCHAR);
					setState(369);
					_la = _input.LA(1);
					if ( !(_la==ALIAS || _la==NOALIAS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(370);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(373);
				match(NATLANG);
				setState(374);
				match(LPARENCHAR);
				setState(375);
				_la = _input.LA(1);
				if ( !(_la==CS || _la==EN || _la==KA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(376);
				match(RPARENCHAR);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(377);
				match(NOADATA);
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(378);
				match(NOADV);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(379);
				match(NOAWO);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(380);
				match(NOBLOCK0);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(381);
				match(NOCBLCARD);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(382);
				match(NOCICS);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(383);
				match(NOCMPR2);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==NOC || _la==NOCOMPILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(385);
					match(LPARENCHAR);
					setState(386);
					_la = _input.LA(1);
					if ( !(((((_la - 398)) & ~0x3f) == 0 && ((1L << (_la - 398)) & ((1L << (E_CHAR - 398)) | (1L << (S_CHAR - 398)) | (1L << (W_CHAR - 398)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(387);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(390);
				match(NOCOPYLOC);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(391);
				match(NOCPLC);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(392);
				match(NOCOPYRIGHT);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(393);
				match(NOCPYR);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(394);
				match(NOCPSM);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(395);
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
				setState(396);
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
				setState(397);
				match(NODBCS);
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(398);
				match(NODEBUG);
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(399);
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
				setState(400);
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
				setState(401);
				match(NODLL);
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(402);
				match(NODE);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(403);
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
				setState(404);
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
				setState(405);
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
				setState(406);
				match(NOEDF);
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(407);
				match(NOEPILOG);
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(408);
				match(NOEXIT);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(409);
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
				setState(410);
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
				setState(411);
				match(NOFEPI);
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(412);
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
				setState(413);
				match(NOFLAGMIG);
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(414);
				match(NOFLAGSTD);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(415);
				match(NOGRAPHIC);
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(416);
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
				setState(417);
				match(NOINITIAL);
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(418);
				match(NOINLINE);
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(419);
				match(NOINL);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(420);
				match(NOLENGTH);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(421);
				match(NOLIB);
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(422);
				match(NOLINKAGE);
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(423);
				match(NOLIST);
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(424);
				match(NOMAP);
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(425);
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
				setState(426);
				match(NONAME);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(427);
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
				setState(428);
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
				setState(429);
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
				setState(430);
				match(NOOPSEQUENCE);
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(431);
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
				setState(432);
				match(NOOPTIONS);
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(433);
				match(NOP);
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(434);
				match(NOPARMCHECK);
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(435);
				match(NOPROLOG);
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(436);
				match(NORENT);
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(437);
				match(NORULES);
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(438);
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
				setState(439);
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
				setState(440);
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
				setState(441);
				match(NOSPIE);
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(442);
				match(NOSQL);
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(443);
				match(NOSQLIMS);
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(444);
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
				setState(445);
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
				setState(446);
				match(NOSTDTRUNC);
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(447);
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
				setState(448);
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
				setState(449);
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
				setState(450);
				match(NOTEST);
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(451);
				match(NOTHREAD);
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(452);
				match(NOVBREF);
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(453);
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
				setState(454);
				match(NSEQ);
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(455);
				_la = _input.LA(1);
				if ( !(_la==NS || _la==NSYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(456);
				match(LPARENCHAR);
				setState(457);
				_la = _input.LA(1);
				if ( !(_la==DBCS || _la==NAT || _la==NATIONAL) ) {
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
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(459);
				match(NOVBREF);
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(460);
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
				setState(461);
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
				setState(462);
				match(NOZWB);
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(463);
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
				setState(464);
				_la = _input.LA(1);
				if ( !(_la==NC || _la==NUMCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(465);
					match(LPARENCHAR);
					setState(466);
					numcheck_opts();
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(467);
						match(COMMACHAR);
						setState(468);
						numcheck_opts();
						}
						}
						setState(473);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(474);
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
				setState(478);
				match(NUMPROC);
				setState(479);
				match(LPARENCHAR);
				setState(480);
				_la = _input.LA(1);
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(481);
				match(RPARENCHAR);
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(482);
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
				setState(483);
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
				setState(484);
				match(OPMARGINS);
				setState(485);
				match(LPARENCHAR);
				setState(486);
				literal();
				setState(487);
				match(COMMACHAR);
				setState(488);
				literal();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(489);
					match(COMMACHAR);
					setState(490);
					literal();
					}
				}

				setState(493);
				match(RPARENCHAR);
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(495);
				match(OPSEQUENCE);
				setState(496);
				match(LPARENCHAR);
				setState(497);
				literal();
				setState(498);
				match(COMMACHAR);
				setState(499);
				literal();
				setState(500);
				match(RPARENCHAR);
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(502);
				_la = _input.LA(1);
				if ( !(_la==OPT || _la==OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(503);
					match(LPARENCHAR);
					setState(504);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==STD || _la==NUMERICLITERAL) ) {
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
				}
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(508);
				match(OPTFILE);
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(509);
				match(OPTIONS);
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(510);
				match(OP);
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(511);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==OUTDD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(512);
				match(LPARENCHAR);
				setState(513);
				cobolWord();
				setState(514);
				match(RPARENCHAR);
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				{
				setState(516);
				_la = _input.LA(1);
				if ( !(_la==PARMCHECK || _la==PC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(517);
					match(LPARENCHAR);
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABD || _la==MSG) {
						{
						setState(518);
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

					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (COMMACHAR - 411)) | (1L << (NONNUMERICLITERAL - 411)) | (1L << (NUMERICLITERAL - 411)))) != 0)) {
						{
						setState(522);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMACHAR) {
							{
							setState(521);
							match(COMMACHAR);
							}
						}

						setState(524);
						literal();
						}
					}

					setState(527);
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
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==PGMN || _la==PGMNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				match(LPARENCHAR);
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==CO || _la==COMPAT || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (LM - 131)) | (1L << (LONGMIXED - 131)) | (1L << (LONGUPPER - 131)) | (1L << (LU - 131)) | (1L << (MIXED - 131)))) != 0) || ((((_la - 374)) & ~0x3f) == 0 && ((1L << (_la - 374)) & ((1L << (UPPER - 374)) | (1L << (M_CHAR - 374)) | (1L << (U_CHAR - 374)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(533);
				match(RPARENCHAR);
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(534);
				match(PROLOG);
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				{
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==QUALIFY || _la==QUA) ) {
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
				_la = _input.LA(1);
				if ( !(_la==COMPAT || _la==EXTEND || _la==C_CHAR || _la==E_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(538);
				match(RPARENCHAR);
				}
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(539);
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
				setState(540);
				match(RENT);
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(541);
				match(RMODE);
				setState(542);
				match(LPARENCHAR);
				setState(546);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
					{
					setState(543);
					match(ANY);
					}
					break;
				case AUTO:
					{
					setState(544);
					match(AUTO);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(545);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(548);
				match(RPARENCHAR);
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				{
				setState(549);
				match(RULES);
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(550);
					match(LPARENCHAR);
					setState(551);
					rules_opts();
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(552);
						match(COMMACHAR);
						setState(553);
						rules_opts();
						}
						}
						setState(558);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(559);
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
				setState(563);
				_la = _input.LA(1);
				if ( !(_la==SEQ || _la==SEQUENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(564);
					match(LPARENCHAR);
					setState(565);
					literal();
					setState(566);
					match(COMMACHAR);
					setState(567);
					literal();
					setState(568);
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
				setState(572);
				_la = _input.LA(1);
				if ( !(_la==SERV || _la==SERVICE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				match(LPARENCHAR);
				setState(574);
				literal();
				setState(575);
				match(RPARENCHAR);
				}
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(577);
				_la = _input.LA(1);
				if ( !(_la==SIZE || _la==SZ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(578);
				match(LPARENCHAR);
				setState(581);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAX:
					{
					setState(579);
					match(MAX);
					}
					break;
				case NONNUMERICLITERAL:
				case NUMERICLITERAL:
					{
					setState(580);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(583);
				match(RPARENCHAR);
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				setState(584);
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
				setState(585);
				match(SP);
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				setState(586);
				match(SPACE);
				setState(587);
				match(LPARENCHAR);
				setState(588);
				literal();
				setState(589);
				match(RPARENCHAR);
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(591);
				match(SPIE);
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(592);
				match(SQL);
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(593);
					match(LPARENCHAR);
					setState(594);
					literal();
					setState(595);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(599);
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
				setState(600);
				match(SQLIMS);
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(601);
					match(LPARENCHAR);
					setState(602);
					literal();
					setState(603);
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
				setState(607);
				_la = _input.LA(1);
				if ( !(_la==SSR || _la==SSRANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(608);
					match(LPARENCHAR);
					setState(609);
					ssrange_opts();
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(610);
						match(COMMACHAR);
						setState(611);
						ssrange_opts();
						}
						}
						setState(616);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(617);
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
				setState(621);
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
				setState(622);
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
				setState(623);
				match(SYSEIB);
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(624);
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
				setState(625);
				match(TEST);
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(626);
					match(LPARENCHAR);
					setState(627);
					test_opts();
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMACHAR) {
						{
						{
						setState(628);
						match(COMMACHAR);
						setState(629);
						test_opts();
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
			case 177:
				enterOuterAlt(_localctx, 177);
				{
				setState(639);
				match(THREAD);
				}
				break;
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(640);
				match(TRUNC);
				setState(641);
				match(LPARENCHAR);
				setState(642);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==OPT || _la==STD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(643);
				match(RPARENCHAR);
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(644);
				match(VBREF);
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				{
				setState(645);
				match(VLR);
				setState(646);
				match(LPARENCHAR);
				setState(647);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 356)) & ~0x3f) == 0 && ((1L << (_la - 356)) & ((1L << (STANDARD - 356)) | (1L << (C_CHAR - 356)) | (1L << (S_CHAR - 356)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(648);
				match(RPARENCHAR);
				}
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				{
				setState(649);
				_la = _input.LA(1);
				if ( !(_la==VS || _la==VSAMOPENFS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(650);
				match(LPARENCHAR);
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (SUCC - 360)) | (1L << (C_CHAR - 360)) | (1L << (S_CHAR - 360)))) != 0)) ) {
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
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(653);
				_la = _input.LA(1);
				if ( !(_la==WD || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(654);
				match(LPARENCHAR);
				setState(661);
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
				case CBL:
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
				case PROCESS:
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
					setState(655);
					cobolWord();
					}
					break;
				case TEXT:
					{
					setState(657); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(656);
						match(TEXT);
						}
						}
						setState(659); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(663);
				match(RPARENCHAR);
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				setState(664);
				_la = _input.LA(1);
				if ( !(_la==XMLPARSE || _la==XP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(665);
				match(LPARENCHAR);
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==COMPAT || ((((_la - 383)) & ~0x3f) == 0 && ((1L << (_la - 383)) & ((1L << (XMLSS - 383)) | (1L << (C_CHAR - 383)) | (1L << (X_CHAR - 383)))) != 0)) ) {
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
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(668);
				_la = _input.LA(1);
				if ( !(_la==XREF || _la==X_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(669);
					match(LPARENCHAR);
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FULL || _la==SHORT) {
						{
						setState(670);
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

					setState(673);
					match(RPARENCHAR);
					}
					break;
				}
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==YEARWINDOW || _la==YW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(677);
				match(LPARENCHAR);
				setState(678);
				literal();
				setState(679);
				match(RPARENCHAR);
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				{
				setState(681);
				_la = _input.LA(1);
				if ( !(_la==ZC || _la==ZONECHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(682);
				match(LPARENCHAR);
				setState(683);
				_la = _input.LA(1);
				if ( !(_la==ABD || _la==MSG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(684);
				match(RPARENCHAR);
				}
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				{
				setState(685);
				_la = _input.LA(1);
				if ( !(_la==ZD || _la==ZONEDATA) ) {
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
				if ( !(_la==MIG || _la==NOPFD || _la==PFD) ) {
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
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(689);
				match(ZWB);
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(690);
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
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode RPARENCHAR() { return getToken(CobolPreprocessorParser.RPARENCHAR, 0); }
		public TerminalNode DEFINE() { return getToken(CobolPreprocessorParser.DEFINE, 0); }
		public TerminalNode DEF() { return getToken(CobolPreprocessorParser.DEF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(CobolPreprocessorParser.TEXT, 0); }
		public TerminalNode COMMACHAR() { return getToken(CobolPreprocessorParser.COMMACHAR, 0); }
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
			setState(693);
			_la = _input.LA(1);
			if ( !(_la==DEF || _la==DEFINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(694);
			match(LPARENCHAR);
			setState(695);
			match(IDENTIFIER);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMACHAR || _la==TEXT) {
				{
				setState(696);
				_la = _input.LA(1);
				if ( !(_la==COMMACHAR || _la==TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(697);
				literal();
				}
			}

			setState(700);
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
		enterRule(_localctx, 12, RULE_numcheck_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(702);
				match(ZON);
				}
				break;
			case 2:
				{
				{
				setState(703);
				match(ZON);
				setState(704);
				match(LPARENCHAR);
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==ALPHNUM || _la==NOALPHNUM) ) {
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
			case 3:
				{
				setState(707);
				match(NOZON);
				}
				break;
			case 4:
				{
				setState(708);
				match(PAC);
				}
				break;
			case 5:
				{
				setState(709);
				match(NOPAC);
				}
				break;
			case 6:
				{
				setState(710);
				match(BIN);
				}
				break;
			case 7:
				{
				setState(711);
				match(NOBIN);
				}
				break;
			case 8:
				{
				setState(712);
				match(MSG);
				}
				break;
			case 9:
				{
				setState(713);
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
		enterRule(_localctx, 14, RULE_rules_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ENDP - 83)) | (1L << (ENDPERIOD - 83)) | (1L << (EVENP - 83)) | (1L << (EVENPACK - 83)) | (1L << (LAXPERF - 83)) | (1L << (LXPRF - 83)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NOENDP - 193)) | (1L << (NOENDPERIOD - 193)) | (1L << (NOEVENP - 193)) | (1L << (NOEVENPACK - 193)) | (1L << (NOLAXPERF - 193)) | (1L << (NOLXPRF - 193)) | (1L << (NOOMITODOMIN - 193)) | (1L << (NOOOM - 193)) | (1L << (NOSLACKBYTES - 193)) | (1L << (NOSLCKB - 193)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (NOUNRA - 272)) | (1L << (NOUNREFALL - 272)) | (1L << (NOUNREFSOURCE - 272)) | (1L << (NOUNRS - 272)) | (1L << (OMITODOMIN - 272)) | (1L << (OOM - 272)))) != 0) || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (SLACKBYTES - 339)) | (1L << (SLCKB - 339)) | (1L << (UNREF - 339)))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_ssrange_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
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
		enterRule(_localctx, 18, RULE_test_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DWARF:
				{
				setState(720);
				match(DWARF);
				}
				break;
			case NODWARF:
				{
				setState(721);
				match(NODWARF);
				}
				break;
			case HOOK:
				{
				setState(722);
				match(HOOK);
				}
				break;
			case NOHOOK:
				{
				setState(723);
				match(NOHOOK);
				}
				break;
			case SEP:
			case SEPARATE:
				{
				{
				setState(724);
				_la = _input.LA(1);
				if ( !(_la==SEP || _la==SEPARATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(725);
					match(LPARENCHAR);
					setState(726);
					_la = _input.LA(1);
					if ( !(_la==DSNAME || _la==NODSNAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(727);
					match(RPARENCHAR);
					}
					break;
				}
				}
				}
				break;
			case NOSEP:
				{
				setState(730);
				match(NOSEP);
				}
				break;
			case NOSEPARATE:
				{
				setState(731);
				match(NOSEPARATE);
				}
				break;
			case SO:
				{
				setState(732);
				match(SO);
				}
				break;
			case SOURCE:
				{
				setState(733);
				match(SOURCE);
				}
				break;
			case NOSO:
				{
				setState(734);
				match(NOSO);
				}
				break;
			case NOSOURCE:
				{
				setState(735);
				match(NOSOURCE);
				}
				break;
			case EJPD:
				{
				setState(736);
				match(EJPD);
				}
				break;
			case NOEJPD:
				{
				setState(737);
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
		public TerminalNode CLASSIC_COMMENTLINE() { return getToken(CobolPreprocessorParser.CLASSIC_COMMENTLINE, 0); }
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
		enterRule(_localctx, 20, RULE_classicCommentEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
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
		enterRule(_localctx, 22, RULE_execCicsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(EXEC);
			setState(743);
			match(CICS);
			setState(744);
			charData();
			setState(745);
			match(END_EXEC);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(746);
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
		enterRule(_localctx, 24, RULE_execSqlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(EXEC);
			setState(750);
			match(SQL);
			setState(751);
			charDataSql();
			setState(752);
			match(END_EXEC);
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(753);
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
		enterRule(_localctx, 26, RULE_execSqlImsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(EXEC);
			setState(757);
			match(SQLIMS);
			setState(758);
			charData();
			setState(759);
			match(END_EXEC);
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(760);
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
		enterRule(_localctx, 28, RULE_copyStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(COPY);
			setState(764);
			copySource();
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(765);
						match(NEWLINE);
						}
						}
						setState(770);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(775);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IN:
					case OF:
						{
						setState(771);
						directoryPhrase();
						}
						break;
					case ON:
						{
						setState(772);
						familyPhrase();
						}
						break;
					case REPLACING:
						{
						setState(773);
						replacingPhrase();
						}
						break;
					case SUPPRESS:
						{
						setState(774);
						match(SUPPRESS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(782);
				match(NEWLINE);
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
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
		enterRule(_localctx, 30, RULE_copySource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(790);
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
			case CBL:
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
			case PROCESS:
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
				setState(791);
				cobolWord();
				}
				break;
			case FILENAME:
				{
				setState(792);
				filename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(795);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(796);
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
		enterRule(_localctx, 32, RULE_copyLibrary);
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
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
			case CBL:
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
			case PROCESS:
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
				setState(800);
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
		enterRule(_localctx, 34, RULE_replacingPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(REPLACING);
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(804);
				match(NEWLINE);
				}
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810);
			replaceClause();
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(812); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(811);
						match(NEWLINE);
						}
						}
						setState(814); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(816);
					replaceClause();
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_replaceArea);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			replaceByStatement();
			setState(827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(825);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COPY:
						{
						setState(823);
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
					case CBL:
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
					case PROCESS:
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
						setState(824);
						charData();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(830);
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
		enterRule(_localctx, 38, RULE_replaceByStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(REPLACE);
			setState(841); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
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
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(843); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 40, RULE_replaceOffStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(REPLACE);
			setState(854);
			match(OFF);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(855);
				match(NEWLINE);
				}
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(861);
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
		enterRule(_localctx, 42, RULE_replaceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			replaceable();
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
			match(BY);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(871);
				match(NEWLINE);
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(877);
			replacement();
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(878);
					match(NEWLINE);
					}
					}
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(884);
				directoryPhrase();
				}
				break;
			}
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(887);
					match(NEWLINE);
					}
					}
					setState(892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(893);
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
		enterRule(_localctx, 44, RULE_directoryPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(903);
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
			case CBL:
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
			case PROCESS:
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
				setState(904);
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
		enterRule(_localctx, 46, RULE_familyPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(ON);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(908);
				match(NEWLINE);
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(914);
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
			case CBL:
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
			case PROCESS:
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
				setState(915);
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
		enterRule(_localctx, 48, RULE_replaceable);
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(921);
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
		enterRule(_localctx, 50, RULE_replacement);
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				pseudoText();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(927);
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
		enterRule(_localctx, 52, RULE_ejectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(EJECT);
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(931);
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
		enterRule(_localctx, 54, RULE_skipStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			_la = _input.LA(1);
			if ( !(((((_la - 349)) & ~0x3f) == 0 && ((1L << (_la - 349)) & ((1L << (SKIP1 - 349)) | (1L << (SKIP2 - 349)) | (1L << (SKIP3 - 349)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(935);
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
		enterRule(_localctx, 56, RULE_titleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(TITLE);
			setState(939);
			literal();
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(940);
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
		enterRule(_localctx, 58, RULE_pseudoText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(DOUBLEEQUALCHAR);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DIAGTRUNC - 64)) | (1L << (DISPSIGN - 64)) | (1L << (DIVISION - 64)) | (1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)) | (1L << (XMLSS - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 457)) & ~0x3f) == 0 && ((1L << (_la - 457)) & ((1L << (OR - 457)) | (1L << (STATIC - 457)) | (1L << (TO - 457)) | (1L << (TRUE - 457)) | (1L << (WHEN - 457)))) != 0)) {
				{
				setState(944);
				charData();
				}
			}

			setState(947);
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
		enterRule(_localctx, 60, RULE_charData);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(951); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(951);
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
					case CBL:
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
					case PROCESS:
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
						setState(949);
						charDataLine();
						}
						break;
					case NEWLINE:
						{
						setState(950);
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
				setState(953); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
		enterRule(_localctx, 62, RULE_charDataSql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(959);
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
				case CBL:
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
				case PROCESS:
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
					setState(955);
					charDataLine();
					}
					break;
				case COPY:
					{
					setState(956);
					match(COPY);
					}
					break;
				case REPLACE:
					{
					setState(957);
					match(REPLACE);
					}
					break;
				case NEWLINE:
					{
					setState(958);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(961); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPY) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DIAGTRUNC - 64)) | (1L << (DISPSIGN - 64)) | (1L << (DIVISION - 64)) | (1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LPARENCHAR - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACE - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RPARENCHAR - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)) | (1L << (XMLSS - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (DOT - 384)) | (1L << (NONNUMERICLITERAL - 384)) | (1L << (NUMERICLITERAL - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (FILENAME - 384)) | (1L << (PSEUDOTEXTIDENTIFIER - 384)) | (1L << (NEWLINE - 384)) | (1L << (TEXT - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 457)) & ~0x3f) == 0 && ((1L << (_la - 457)) & ((1L << (OR - 457)) | (1L << (STATIC - 457)) | (1L << (TO - 457)) | (1L << (TRUE - 457)) | (1L << (WHEN - 457)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_charDataLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(971);
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
					case CBL:
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
					case PROCESS:
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
						setState(963);
						cobolWord();
						}
						break;
					case NONNUMERICLITERAL:
					case NUMERICLITERAL:
						{
						setState(964);
						literal();
						}
						break;
					case FILENAME:
						{
						setState(965);
						filename();
						}
						break;
					case PSEUDOTEXTIDENTIFIER:
						{
						setState(966);
						match(PSEUDOTEXTIDENTIFIER);
						}
						break;
					case TEXT:
						{
						setState(967);
						match(TEXT);
						}
						break;
					case DOT:
						{
						setState(968);
						match(DOT);
						}
						break;
					case LPARENCHAR:
						{
						setState(969);
						match(LPARENCHAR);
						}
						break;
					case RPARENCHAR:
						{
						setState(970);
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
				setState(973); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 66, RULE_cobolWord);
		try {
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
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
			case CBL:
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
			case PROCESS:
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
				setState(976);
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
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
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
		enterRule(_localctx, 70, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
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
		enterRule(_localctx, 72, RULE_compilerDirectiveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(983);
				compilerDirective();
				}
				break;
			case 2:
				{
				setState(984);
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
		enterRule(_localctx, 74, RULE_compilerDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(987);
				compilerDirectiveCallInterface();
				}
				break;
			case 2:
				{
				setState(988);
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
		enterRule(_localctx, 76, RULE_conditionalCompilationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(991);
				conditionalCompilationDefine();
				}
				break;
			case 2:
				{
				setState(992);
				conditionalCompilationIf();
				}
				break;
			case 3:
				{
				setState(993);
				conditionalCompilationElse();
				}
				break;
			case 4:
				{
				setState(994);
				conditionalCompilationEndIf();
				}
				break;
			case 5:
				{
				setState(995);
				conditionalCompilationEvaluate();
				}
				break;
			case 6:
				{
				setState(996);
				conditionalCompilationWhen();
				}
				break;
			case 7:
				{
				setState(997);
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
		enterRule(_localctx, 78, RULE_compilerDirectiveCallInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1000);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1001);
			_la = _input.LA(1);
			if ( !(_la==CALLINT || _la==CALLINTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1002);
				_la = _input.LA(1);
				if ( !(((((_la - 442)) & ~0x3f) == 0 && ((1L << (_la - 442)) & ((1L << (DLL_INTERFACE - 442)) | (1L << (DYNAMIC - 442)) | (1L << (STATIC - 442)))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_compilerDirectiveInline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1005);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1006);
			match(INLINE);
			setState(1007);
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
		enterRule(_localctx, 82, RULE_conditionalCompilationDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1009);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1010);
			match(DEFINE);
			setState(1011);
			match(IDENTIFIER);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1012);
				match(AS);
				}
			}

			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1015);
				conditionalCompilationDefinePredicate();
				}
				break;
			case 2:
				{
				setState(1016);
				match(INLINE_OFF);
				}
				break;
			}
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(1019);
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
		public ConditionalCompilationArithmeticExpressionContext conditionalCompilationArithmeticExpression() {
			return getRuleContext(ConditionalCompilationArithmeticExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 84, RULE_conditionalCompilationDefinePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1022);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 2:
				{
				setState(1023);
				literal();
				}
				break;
			case 3:
				{
				setState(1024);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(1025);
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
		public List<ConditionalCompilationSimpleArithmeticExpressionContext> conditionalCompilationSimpleArithmeticExpression() {
			return getRuleContexts(ConditionalCompilationSimpleArithmeticExpressionContext.class);
		}
		public ConditionalCompilationSimpleArithmeticExpressionContext conditionalCompilationSimpleArithmeticExpression(int i) {
			return getRuleContext(ConditionalCompilationSimpleArithmeticExpressionContext.class,i);
		}
		public List<TerminalNode> LPARENCHAR() { return getTokens(CobolPreprocessorParser.LPARENCHAR); }
		public TerminalNode LPARENCHAR(int i) {
			return getToken(CobolPreprocessorParser.LPARENCHAR, i);
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
		enterRule(_localctx, 86, RULE_conditionalCompilationArithmeticExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARENCHAR) {
				{
				{
				setState(1028);
				match(LPARENCHAR);
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1034);
			conditionalCompilationSimpleArithmeticExpression();
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1038);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1035);
						match(LPARENCHAR);
						}
						}
						setState(1040);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1041);
					conditionalCompilationArithmeticOp();
					setState(1045);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1042);
						match(LPARENCHAR);
						}
						}
						setState(1047);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1048);
					conditionalCompilationSimpleArithmeticExpression();
					setState(1052);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1049);
							match(RPARENCHAR);
							}
							} 
						}
						setState(1054);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
					}
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			setState(1063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1060);
					match(RPARENCHAR);
					}
					} 
				}
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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

	public static class ConditionalCompilationSimpleArithmeticExpressionContext extends ParserRuleContext {
		public ConditionalCompilationArithmeticOpContext conditionalCompilationArithmeticOp() {
			return getRuleContext(ConditionalCompilationArithmeticOpContext.class,0);
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
		public ConditionalCompilationSimpleArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationSimpleArithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).enterConditionalCompilationSimpleArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolPreprocessorParserListener ) ((CobolPreprocessorParserListener)listener).exitConditionalCompilationSimpleArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolPreprocessorParserVisitor ) return ((CobolPreprocessorParserVisitor<? extends T>)visitor).visitConditionalCompilationSimpleArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalCompilationSimpleArithmeticExpressionContext conditionalCompilationSimpleArithmeticExpression() throws RecognitionException {
		ConditionalCompilationSimpleArithmeticExpressionContext _localctx = new ConditionalCompilationSimpleArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditionalCompilationSimpleArithmeticExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1068);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1066);
				match(IDENTIFIER);
				}
				break;
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1067);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1070);
			conditionalCompilationArithmeticOp();
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1071);
				match(IDENTIFIER);
				}
				break;
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1072);
				literal();
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
		enterRule(_localctx, 90, RULE_conditionalCompilationArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_la = _input.LA(1);
			if ( !(((((_la - 427)) & ~0x3f) == 0 && ((1L << (_la - 427)) & ((1L << (ASTERISKCHAR - 427)) | (1L << (PLUSCHAR - 427)) | (1L << (MINUSCHAR - 427)) | (1L << (SLASHCHAR - 427)))) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_conditionalCompilationIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1077);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1078);
			match(IF);
			setState(1079);
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
		enterRule(_localctx, 94, RULE_conditionalCompilationElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1082);
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
		enterRule(_localctx, 96, RULE_conditionalCompilationEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1085);
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

	public static class ConditionalCompilationEvaluateContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode EVALUATE() { return getToken(CobolPreprocessorParser.EVALUATE, 0); }
		public TerminalNode TRUE() { return getToken(CobolPreprocessorParser.TRUE, 0); }
		public ConditionalCompilationArithmeticExpressionContext conditionalCompilationArithmeticExpression() {
			return getRuleContext(ConditionalCompilationArithmeticExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CobolPreprocessorParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 98, RULE_conditionalCompilationEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1088);
			match(EVALUATE);
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1089);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(1090);
				conditionalCompilationArithmeticExpression();
				}
				break;
			case 3:
				{
				setState(1091);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(1092);
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

	public static class ConditionalCompilationWhenContext extends ParserRuleContext {
		public TerminalNode COMPILER_DIRECTIVE_TAG() { return getToken(CobolPreprocessorParser.COMPILER_DIRECTIVE_TAG, 0); }
		public TerminalNode WHEN() { return getToken(CobolPreprocessorParser.WHEN, 0); }
		public ConditionalCompilationRelationalConditionContext conditionalCompilationRelationalCondition() {
			return getRuleContext(ConditionalCompilationRelationalConditionContext.class,0);
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
		public TerminalNode OTHER() { return getToken(CobolPreprocessorParser.OTHER, 0); }
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
		enterRule(_localctx, 100, RULE_conditionalCompilationWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1096);
			match(WHEN);
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				{
				setState(1101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1097);
					conditionalCompilationArithmeticExpression();
					}
					break;
				case 2:
					{
					setState(1098);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1099);
					literal();
					}
					break;
				case 4:
					{
					setState(1100);
					match(OTHER);
					}
					break;
				}
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROUGH || _la==THRU) {
					{
					setState(1103);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(1104);
						conditionalCompilationArithmeticExpression();
						}
						break;
					case 2:
						{
						setState(1105);
						match(IDENTIFIER);
						}
						break;
					case 3:
						{
						setState(1106);
						literal();
						}
						break;
					}
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(1111);
				conditionalCompilationRelationalCondition();
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
		enterRule(_localctx, 102, RULE_conditionalCompilationEndEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(COMPILER_DIRECTIVE_TAG);
			setState(1115);
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
		enterRule(_localctx, 104, RULE_conditionalCompilationComparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1117);
				match(IS);
				}
			}

			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1120);
				match(NOT);
				}
			}

			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1123);
				match(EQUAL);
				}
				break;
			case 2:
				{
				setState(1124);
				match(EQUALCHAR);
				}
				break;
			case 3:
				{
				setState(1125);
				match(NOTEQUALCHAR);
				}
				break;
			case 4:
				{
				setState(1126);
				match(LESSTHANCHAR);
				}
				break;
			case 5:
				{
				{
				setState(1127);
				match(GREATER);
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1128);
					match(THAN);
					}
				}

				}
				}
				break;
			case 6:
				{
				setState(1131);
				match(GREATERTHANCHAR);
				}
				break;
			case 7:
				{
				{
				setState(1132);
				match(LESS);
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1133);
					match(THAN);
					}
				}

				}
				}
				break;
			case 8:
				{
				setState(1136);
				match(LESSOREQUALCHAR);
				}
				break;
			case 9:
				{
				{
				setState(1137);
				match(LESS);
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1138);
					match(THAN);
					}
				}

				setState(1141);
				match(OR);
				setState(1142);
				match(EQUAL);
				}
				}
				break;
			case 10:
				{
				setState(1143);
				match(GREATEROREQUALCHAR);
				}
				break;
			case 11:
				{
				{
				setState(1144);
				match(GREATER);
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAN) {
					{
					setState(1145);
					match(THAN);
					}
				}

				setState(1148);
				match(OR);
				setState(1149);
				match(EQUAL);
				}
				}
				break;
			}
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1152);
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
		enterRule(_localctx, 106, RULE_conditionalCompilationRelationalCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1187); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPARENCHAR) {
						{
						{
						setState(1155);
						match(LPARENCHAR);
						}
						}
						setState(1160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1161);
					conditionalCompilationCondition();
					setState(1178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1162);
							_la = _input.LA(1);
							if ( !(_la==AND || _la==OR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1166);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LPARENCHAR) {
								{
								{
								setState(1163);
								match(LPARENCHAR);
								}
								}
								setState(1168);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1169);
							conditionalCompilationCondition();
							setState(1173);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1170);
									match(RPARENCHAR);
									}
									} 
								}
								setState(1175);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
							}
							}
							} 
						}
						setState(1180);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(1184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1181);
							match(RPARENCHAR);
							}
							} 
						}
						setState(1186);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1189); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		public ConditionalCompilationBinaryConditionContext conditionalCompilationBinaryCondition() {
			return getRuleContext(ConditionalCompilationBinaryConditionContext.class,0);
		}
		public ConditionalCompilationSimpleRelationalConditionContext conditionalCompilationSimpleRelationalCondition() {
			return getRuleContext(ConditionalCompilationSimpleRelationalConditionContext.class,0);
		}
		public ConditionalCompilationDefinedConditionContext conditionalCompilationDefinedCondition() {
			return getRuleContext(ConditionalCompilationDefinedConditionContext.class,0);
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
		enterRule(_localctx, 108, RULE_conditionalCompilationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1191);
				conditionalCompilationBinaryCondition();
				}
				break;
			case 2:
				{
				setState(1192);
				conditionalCompilationSimpleRelationalCondition();
				}
				break;
			case 3:
				{
				setState(1193);
				conditionalCompilationDefinedCondition();
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
		enterRule(_localctx, 110, RULE_conditionalCompilationSimpleRelationalCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1196);
				match(IDENTIFIER);
				}
				break;
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1197);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1200);
			conditionalCompilationComparisonOp();
			setState(1203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1201);
				match(IDENTIFIER);
				}
				break;
			case NONNUMERICLITERAL:
			case NUMERICLITERAL:
				{
				setState(1202);
				literal();
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
		enterRule(_localctx, 112, RULE_conditionalCompilationBinaryCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
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
		enterRule(_localctx, 114, RULE_conditionalCompilationDefinedCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1207);
			match(IDENTIFIER);
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1208);
				match(IS);
				}
			}

			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1211);
				match(NOT);
				}
			}

			setState(1214);
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
		public TerminalNode CBL() { return getToken(CobolPreprocessorParser.CBL, 0); }
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
		public TerminalNode PROCESS() { return getToken(CobolPreprocessorParser.PROCESS, 0); }
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
		enterRule(_localctx, 116, RULE_charDataKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABD) | (1L << ADATA) | (1L << ADV) | (1L << AFP) | (1L << ALIAS) | (1L << ALPHNUM) | (1L << ANSI) | (1L << ANY) | (1L << APOST) | (1L << AR) | (1L << ARCH) | (1L << ARITH) | (1L << AUTO) | (1L << AWO) | (1L << BIN) | (1L << BLOCK0) | (1L << BUF) | (1L << BUFSIZE) | (1L << BY) | (1L << CBL) | (1L << CBLCARD) | (1L << CICS) | (1L << CO) | (1L << COBOL2) | (1L << COBOL3) | (1L << CODEPAGE) | (1L << COMPAT) | (1L << COMPILE) | (1L << COPYLOC) | (1L << COPYRIGHT) | (1L << CP) | (1L << CPLC) | (1L << CPP) | (1L << CPSM) | (1L << CPYR) | (1L << CS) | (1L << CURR) | (1L << CURRENCY) | (1L << DATA) | (1L << DATEPROC) | (1L << DBCS) | (1L << DD) | (1L << DEBUG) | (1L << DEC) | (1L << DECK) | (1L << DEF) | (1L << DEFINE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DIAGTRUNC - 64)) | (1L << (DISPSIGN - 64)) | (1L << (DIVISION - 64)) | (1L << (DLI - 64)) | (1L << (DLL - 64)) | (1L << (DP - 64)) | (1L << (DS - 64)) | (1L << (DSN - 64)) | (1L << (DSNAME - 64)) | (1L << (DTR - 64)) | (1L << (DU - 64)) | (1L << (DUMP - 64)) | (1L << (DWARF - 64)) | (1L << (DYN - 64)) | (1L << (DYNAM - 64)) | (1L << (EDF - 64)) | (1L << (EJECT - 64)) | (1L << (EJPD - 64)) | (1L << (EN - 64)) | (1L << (ENDP - 64)) | (1L << (ENDPERIOD - 64)) | (1L << (ENGLISH - 64)) | (1L << (EPILOG - 64)) | (1L << (EVENP - 64)) | (1L << (EVENPACK - 64)) | (1L << (EXCI - 64)) | (1L << (EXIT - 64)) | (1L << (EXP - 64)) | (1L << (EXPORTALL - 64)) | (1L << (EXTEND - 64)) | (1L << (FASTSRT - 64)) | (1L << (FLAG - 64)) | (1L << (FLAGSTD - 64)) | (1L << (FSRT - 64)) | (1L << (FULL - 64)) | (1L << (GDS - 64)) | (1L << (GRAPHIC - 64)) | (1L << (HEX - 64)) | (1L << (HGPR - 64)) | (1L << (HOOK - 64)) | (1L << (IC - 64)) | (1L << (IN - 64)) | (1L << (INITCHECK - 64)) | (1L << (INTDATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INL - 64)) | (1L << (JA - 64)) | (1L << (JP - 64)) | (1L << (KA - 64)) | (1L << (LANG - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAX - 64)) | (1L << (LAXPERF - 64)) | (1L << (LC - 64)) | (1L << (LENGTH - 64)) | (1L << (LIB - 64)) | (1L << (LILIAN - 64)) | (1L << (LIN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINECOUNT - 128)) | (1L << (LINKAGE - 128)) | (1L << (LIST - 128)) | (1L << (LM - 128)) | (1L << (LONGMIXED - 128)) | (1L << (LONGUPPER - 128)) | (1L << (LP - 128)) | (1L << (LU - 128)) | (1L << (LXPRF - 128)) | (1L << (MAP - 128)) | (1L << (MARGINS - 128)) | (1L << (MAX - 128)) | (1L << (MD - 128)) | (1L << (MDECK - 128)) | (1L << (MIG - 128)) | (1L << (MIXED - 128)) | (1L << (MAXPCF - 128)) | (1L << (MSG - 128)) | (1L << (NAME - 128)) | (1L << (NAT - 128)) | (1L << (NATIONAL - 128)) | (1L << (NATLANG - 128)) | (1L << (NC - 128)) | (1L << (NN - 128)) | (1L << (NO - 128)) | (1L << (NOADATA - 128)) | (1L << (NOADV - 128)) | (1L << (NOALIAS - 128)) | (1L << (NOALPHNUM - 128)) | (1L << (NOAWO - 128)) | (1L << (NOBIN - 128)) | (1L << (NOBLOCK0 - 128)) | (1L << (NOC - 128)) | (1L << (NOCBLCARD - 128)) | (1L << (NOCICS - 128)) | (1L << (NOCMPR2 - 128)) | (1L << (NOCOMPILE - 128)) | (1L << (NOCOPYLOC - 128)) | (1L << (NOCOPYRIGHT - 128)) | (1L << (NOCPLC - 128)) | (1L << (NOCPSM - 128)) | (1L << (NOCPYR - 128)) | (1L << (NOCURR - 128)) | (1L << (NOCURRENCY - 128)) | (1L << (NOD - 128)) | (1L << (NODATEPROC - 128)) | (1L << (NODBCS - 128)) | (1L << (NODE - 128)) | (1L << (NODEBUG - 128)) | (1L << (NODECK - 128)) | (1L << (NODEFINE - 128)) | (1L << (NODEF - 128)) | (1L << (NODIAGTRUNC - 128)) | (1L << (NODLL - 128)) | (1L << (NODSNAME - 128)) | (1L << (NODU - 128)) | (1L << (NODUMP - 128)) | (1L << (NODP - 128)) | (1L << (NODTR - 128)) | (1L << (NODWARF - 128)) | (1L << (NODYN - 128)) | (1L << (NODYNAM - 128)) | (1L << (NOEDF - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NOEJPD - 192)) | (1L << (NOENDP - 192)) | (1L << (NOENDPERIOD - 192)) | (1L << (NOEPILOG - 192)) | (1L << (NOEVENP - 192)) | (1L << (NOEVENPACK - 192)) | (1L << (NOEXIT - 192)) | (1L << (NOEXP - 192)) | (1L << (NOEXPORTALL - 192)) | (1L << (NOF - 192)) | (1L << (NOFASTSRT - 192)) | (1L << (NOFEPI - 192)) | (1L << (NOFLAG - 192)) | (1L << (NOFLAGMIG - 192)) | (1L << (NOFLAGSTD - 192)) | (1L << (NOFSRT - 192)) | (1L << (NOGRAPHIC - 192)) | (1L << (NOHOOK - 192)) | (1L << (NOINITCHECK - 192)) | (1L << (NOIC - 192)) | (1L << (NOINITIAL - 192)) | (1L << (NOINLINE - 192)) | (1L << (NOINL - 192)) | (1L << (NOLAXPERF - 192)) | (1L << (NOLENGTH - 192)) | (1L << (NOLIB - 192)) | (1L << (NOLINKAGE - 192)) | (1L << (NOLIST - 192)) | (1L << (NOLXPRF - 192)) | (1L << (NOMAP - 192)) | (1L << (NOMD - 192)) | (1L << (NOMDECK - 192)) | (1L << (NONAME - 192)) | (1L << (NONUM - 192)) | (1L << (NONUMBER - 192)) | (1L << (NOOBJ - 192)) | (1L << (NOOBJECT - 192)) | (1L << (NOOMITODOMIN - 192)) | (1L << (NOOFF - 192)) | (1L << (NOOFFSET - 192)) | (1L << (NOOOM - 192)) | (1L << (NOOPSEQUENCE - 192)) | (1L << (NOOPT - 192)) | (1L << (NOOPTIMIZE - 192)) | (1L << (NOOPTIONS - 192)) | (1L << (NOP - 192)) | (1L << (NOPAC - 192)) | (1L << (NOPARMCHECK - 192)) | (1L << (NOPFD - 192)) | (1L << (NOPRESERVE - 192)) | (1L << (NOPROLOG - 192)) | (1L << (NORENT - 192)) | (1L << (NORULES - 192)) | (1L << (NOS - 192)) | (1L << (NOSEP - 192)) | (1L << (NOSEPARATE - 192)) | (1L << (NOSEQ - 192)) | (1L << (NOSERV - 192)) | (1L << (NOSERVICE - 192)) | (1L << (NOSLACKBYTES - 192)) | (1L << (NOSLCKB - 192)) | (1L << (NOSO - 192)) | (1L << (NOSOURCE - 192)) | (1L << (NOSPIE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (NOSQL - 256)) | (1L << (NOSQLC - 256)) | (1L << (NOSQLCCSID - 256)) | (1L << (NOSQLIMS - 256)) | (1L << (NOSSR - 256)) | (1L << (NOSSRANGE - 256)) | (1L << (NOSTDTRUNC - 256)) | (1L << (NOSEQUENCE - 256)) | (1L << (NOSTGOPT - 256)) | (1L << (NOSUPP - 256)) | (1L << (NOSUPPRESS - 256)) | (1L << (NOTERM - 256)) | (1L << (NOTERMINAL - 256)) | (1L << (NOTEST - 256)) | (1L << (NOTHREAD - 256)) | (1L << (NOTRIG - 256)) | (1L << (NOUNRA - 256)) | (1L << (NOUNREFALL - 256)) | (1L << (NOUNREFSOURCE - 256)) | (1L << (NOUNRS - 256)) | (1L << (NOVBREF - 256)) | (1L << (NOVOLATILE - 256)) | (1L << (NOWORD - 256)) | (1L << (NOX - 256)) | (1L << (NOXREF - 256)) | (1L << (NOZC - 256)) | (1L << (NOZLEN - 256)) | (1L << (NOZON - 256)) | (1L << (NOZONECHECK - 256)) | (1L << (NOZWB - 256)) | (1L << (NS - 256)) | (1L << (NSEQ - 256)) | (1L << (NSYMBOL - 256)) | (1L << (NUM - 256)) | (1L << (NUMBER - 256)) | (1L << (NUMCHECK - 256)) | (1L << (NUMPROC - 256)) | (1L << (OBJ - 256)) | (1L << (OBJECT - 256)) | (1L << (OF - 256)) | (1L << (OFF - 256)) | (1L << (OFFSET - 256)) | (1L << (ON - 256)) | (1L << (OMITODOMIN - 256)) | (1L << (OOM - 256)) | (1L << (OP - 256)) | (1L << (OPMARGINS - 256)) | (1L << (OPSEQUENCE - 256)) | (1L << (OPT - 256)) | (1L << (OPTFILE - 256)) | (1L << (OPTIMIZE - 256)) | (1L << (OPTIONS - 256)) | (1L << (OUT - 256)) | (1L << (OUTDD - 256)) | (1L << (PAC - 256)) | (1L << (PARMCHECK - 256)) | (1L << (PATH - 256)) | (1L << (PFD - 256)) | (1L << (PPTDBG - 256)) | (1L << (PGMN - 256)) | (1L << (PGMNAME - 256)) | (1L << (PRESERVE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PROCESS - 320)) | (1L << (PROLOG - 320)) | (1L << (QUALIFY - 320)) | (1L << (QUA - 320)) | (1L << (QUOTE - 320)) | (1L << (RENT - 320)) | (1L << (REPLACING - 320)) | (1L << (RMODE - 320)) | (1L << (RULES - 320)) | (1L << (SEP - 320)) | (1L << (SEPARATE - 320)) | (1L << (SEQ - 320)) | (1L << (SEQUENCE - 320)) | (1L << (SERV - 320)) | (1L << (SERVICE - 320)) | (1L << (SHORT - 320)) | (1L << (SIZE - 320)) | (1L << (SLACKBYTES - 320)) | (1L << (SLCKB - 320)) | (1L << (SOURCE - 320)) | (1L << (SP - 320)) | (1L << (SPACE - 320)) | (1L << (SPIE - 320)) | (1L << (SQL - 320)) | (1L << (SQLC - 320)) | (1L << (SQLCCSID - 320)) | (1L << (SQLIMS - 320)) | (1L << (SO - 320)) | (1L << (SS - 320)) | (1L << (SSR - 320)) | (1L << (SSRANGE - 320)) | (1L << (STANDARD - 320)) | (1L << (STD - 320)) | (1L << (STGOPT - 320)) | (1L << (STRICT - 320)) | (1L << (SUCC - 320)) | (1L << (SUPP - 320)) | (1L << (SUPPRESS - 320)) | (1L << (SYSEIB - 320)) | (1L << (SZ - 320)) | (1L << (TERM - 320)) | (1L << (TERMINAL - 320)) | (1L << (TEST - 320)) | (1L << (THREAD - 320)) | (1L << (TITLE - 320)) | (1L << (TRIG - 320)) | (1L << (TRUNC - 320)) | (1L << (UE - 320)) | (1L << (UNREF - 320)) | (1L << (UPPER - 320)) | (1L << (VBREF - 320)) | (1L << (VLR - 320)) | (1L << (VOLATILE - 320)) | (1L << (VS - 320)) | (1L << (VSAMOPENFS - 320)) | (1L << (WD - 320)) | (1L << (XMLPARSE - 320)) | (1L << (XMLSS - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (XOPTS - 384)) | (1L << (XREF - 384)) | (1L << (YEARWINDOW - 384)) | (1L << (YW - 384)) | (1L << (ZC - 384)) | (1L << (ZD - 384)) | (1L << (ZLEN - 384)) | (1L << (ZON - 384)) | (1L << (ZONECHECK - 384)) | (1L << (ZONEDATA - 384)) | (1L << (ZWB - 384)) | (1L << (C_CHAR - 384)) | (1L << (D_CHAR - 384)) | (1L << (E_CHAR - 384)) | (1L << (F_CHAR - 384)) | (1L << (H_CHAR - 384)) | (1L << (I_CHAR - 384)) | (1L << (M_CHAR - 384)) | (1L << (N_CHAR - 384)) | (1L << (O_CHAR - 384)) | (1L << (Q_CHAR - 384)) | (1L << (S_CHAR - 384)) | (1L << (U_CHAR - 384)) | (1L << (W_CHAR - 384)) | (1L << (X_CHAR - 384)) | (1L << (COMMACHAR - 384)) | (1L << (PLUSCHAR - 384)))) != 0) || ((((_la - 457)) & ~0x3f) == 0 && ((1L << (_la - 457)) & ((1L << (OR - 457)) | (1L << (STATIC - 457)) | (1L << (TO - 457)) | (1L << (TRUE - 457)) | (1L << (WHEN - 457)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01d5\u04c5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0088\n\2\f"+
		"\2\16\2\u008b\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u0094\n\4\3\4\3\4\6"+
		"\4\u0098\n\4\r\4\16\4\u0099\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\5\7\5\u00a3"+
		"\n\5\f\5\16\5\u00a6\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00c7\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00d5\n\6\3\6\5\6\u00d8\n\6\3\6\3\6\3\6\3\6\5\6\u00de\n\6\3\6\5\6"+
		"\u00e1\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e8\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00fe\n\6\3"+
		"\6\5\6\u0101\n\6\3\6\5\6\u0104\n\6\3\6\5\6\u0107\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0120\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0128\n\6\3\6\3\6\5\6\u012c"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u013d"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u015a\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0163\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0170\n\6\3\6\3\6\3\6\3\6\5\6\u0176\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0187\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u01d8\n\6\f\6\16\6\u01db\13\6\3\6\3\6\5\6\u01df\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01ee\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01fd\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u020a\n\6\3\6\5\6\u020d\n\6"+
		"\3\6\5\6\u0210\n\6\3\6\5\6\u0213\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0225\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u022d\n\6\f\6\16\6\u0230\13\6\3\6\3\6\5\6\u0234\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u023d\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0248"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0258"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0260\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u0267"+
		"\n\6\f\6\16\6\u026a\13\6\3\6\3\6\5\6\u026e\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u0279\n\6\f\6\16\6\u027c\13\6\3\6\3\6\5\6\u0280\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\6\6\u0294\n\6\r\6\16\6\u0295\5\6\u0298\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u02a2\n\6\3\6\5\6\u02a5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02b6\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u02bd"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02cd"+
		"\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u02db"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u02e5\n\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u02ee\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u02f5"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u02fc\n\17\3\20\3\20\3\20\7\20\u0301"+
		"\n\20\f\20\16\20\u0304\13\20\3\20\3\20\3\20\3\20\5\20\u030a\n\20\7\20"+
		"\u030c\n\20\f\20\16\20\u030f\13\20\3\20\7\20\u0312\n\20\f\20\16\20\u0315"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u031c\n\21\3\21\3\21\5\21\u0320\n"+
		"\21\3\22\3\22\5\22\u0324\n\22\3\23\3\23\7\23\u0328\n\23\f\23\16\23\u032b"+
		"\13\23\3\23\3\23\6\23\u032f\n\23\r\23\16\23\u0330\3\23\7\23\u0334\n\23"+
		"\f\23\16\23\u0337\13\23\3\24\3\24\3\24\7\24\u033c\n\24\f\24\16\24\u033f"+
		"\13\24\3\24\5\24\u0342\n\24\3\25\3\25\7\25\u0346\n\25\f\25\16\25\u0349"+
		"\13\25\3\25\6\25\u034c\n\25\r\25\16\25\u034d\3\25\7\25\u0351\n\25\f\25"+
		"\16\25\u0354\13\25\3\25\3\25\3\26\3\26\3\26\7\26\u035b\n\26\f\26\16\26"+
		"\u035e\13\26\3\26\3\26\3\27\3\27\7\27\u0364\n\27\f\27\16\27\u0367\13\27"+
		"\3\27\3\27\7\27\u036b\n\27\f\27\16\27\u036e\13\27\3\27\3\27\7\27\u0372"+
		"\n\27\f\27\16\27\u0375\13\27\3\27\5\27\u0378\n\27\3\27\7\27\u037b\n\27"+
		"\f\27\16\27\u037e\13\27\3\27\5\27\u0381\n\27\3\30\3\30\7\30\u0385\n\30"+
		"\f\30\16\30\u0388\13\30\3\30\3\30\5\30\u038c\n\30\3\31\3\31\7\31\u0390"+
		"\n\31\f\31\16\31\u0393\13\31\3\31\3\31\5\31\u0397\n\31\3\32\3\32\3\32"+
		"\3\32\5\32\u039d\n\32\3\33\3\33\3\33\3\33\5\33\u03a3\n\33\3\34\3\34\5"+
		"\34\u03a7\n\34\3\35\3\35\5\35\u03ab\n\35\3\36\3\36\3\36\5\36\u03b0\n\36"+
		"\3\37\3\37\5\37\u03b4\n\37\3\37\3\37\3 \3 \6 \u03ba\n \r \16 \u03bb\3"+
		"!\3!\3!\3!\6!\u03c2\n!\r!\16!\u03c3\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6"+
		"\"\u03ce\n\"\r\"\16\"\u03cf\3#\3#\5#\u03d4\n#\3$\3$\3%\3%\3&\3&\5&\u03dc"+
		"\n&\3\'\3\'\5\'\u03e0\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u03e9\n(\3)\3)\3)\5"+
		")\u03ee\n)\3*\3*\3*\3*\3+\3+\3+\3+\5+\u03f8\n+\3+\3+\5+\u03fc\n+\3+\5"+
		"+\u03ff\n+\3,\3,\3,\3,\5,\u0405\n,\3-\7-\u0408\n-\f-\16-\u040b\13-\3-"+
		"\3-\7-\u040f\n-\f-\16-\u0412\13-\3-\3-\7-\u0416\n-\f-\16-\u0419\13-\3"+
		"-\3-\7-\u041d\n-\f-\16-\u0420\13-\7-\u0422\n-\f-\16-\u0425\13-\3-\7-\u0428"+
		"\n-\f-\16-\u042b\13-\3.\3.\5.\u042f\n.\3.\3.\3.\5.\u0434\n.\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u0448\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0450\n\64\3"+
		"\64\3\64\3\64\3\64\5\64\u0456\n\64\5\64\u0458\n\64\3\64\5\64\u045b\n\64"+
		"\3\65\3\65\3\65\3\66\5\66\u0461\n\66\3\66\5\66\u0464\n\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\5\66\u046c\n\66\3\66\3\66\3\66\5\66\u0471\n\66\3\66"+
		"\3\66\3\66\5\66\u0476\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u047d\n\66\3"+
		"\66\3\66\5\66\u0481\n\66\3\66\5\66\u0484\n\66\3\67\7\67\u0487\n\67\f\67"+
		"\16\67\u048a\13\67\3\67\3\67\3\67\7\67\u048f\n\67\f\67\16\67\u0492\13"+
		"\67\3\67\3\67\7\67\u0496\n\67\f\67\16\67\u0499\13\67\7\67\u049b\n\67\f"+
		"\67\16\67\u049e\13\67\3\67\7\67\u04a1\n\67\f\67\16\67\u04a4\13\67\6\67"+
		"\u04a6\n\67\r\67\16\67\u04a7\38\38\38\58\u04ad\n8\39\39\59\u04b1\n9\3"+
		"9\39\39\59\u04b6\n9\3:\3:\3;\3;\5;\u04bc\n;\3;\5;\u04bf\n;\3;\3;\3<\3"+
		"<\3<\2\2=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2{\3\2no\4\2%%\u0142\u0142\4\2\u0117"+
		"\u0117\u017b\u017b\4\2\33\33\35\35\6\2,,aa\u018e\u018e\u0190\u0190\3\2"+
		"\"#\4\2++\61\61\4\2--\u018e\u018e\4\2//\62\62\4\2\60\60\65\65\3\2\678"+
		"\4\2::GG\4\2dd\u00ce\u00ce\4\2\u0111\u0111\u0174\u0174\4\2??\u018f\u018f"+
		"\4\2BBKK\4\2CCHH\6\2,,\u014d\u014d\u018e\u018e\u0198\u0198\3\2LM\3\2O"+
		"P\3\2_`\4\2bbff\4\2dd\u0191\u0191\5\2\u0190\u0190\u0193\u0193\u0198\u019a"+
		"\3\2\u0192\u0194\b\2<<\u009a\u009a\u0163\u0163\u018f\u018f\u0195\u0195"+
		"\u0198\u0198\4\2\u00f3\u00f3\u0141\u0141\4\2\30\30\u0080\u0080\4\2mmq"+
		"q\4\2zz\u0169\u0169\3\2xy\7\2\66\66TTWWuw\u0176\u0176\4\2||\u0082\u0082"+
		"\4\2>>jj\3\2\u008f\u0090\6\2--\u00a3\u00a3\u00a7\u00a7\u018e\u018e\4\2"+
		"\26\26\u009e\u009e\5\2\66\66TTww\4\2\u00a3\u00a3\u00a7\u00a7\5\2\u0190"+
		"\u0190\u0198\u0198\u019a\u019a\3\2\u00ad\u00ae\4\2\u00b0\u00b0\u00bc\u00bc"+
		"\4\2\u00af\u00af\u00b4\u00b4\3\2\u00b5\u00b6\3\2\u00ba\u00bb\4\2\u00b7"+
		"\u00b7\u00bd\u00bd\3\2\u00bf\u00c0\3\2\u00c9\u00ca\4\2\u00cc\u00cc\u00d1"+
		"\u00d1\4\2\u00cb\u00cb\u00ce\u00ce\3\2\u00d4\u00d5\3\2\u00e0\u00e1\3\2"+
		"\u00e3\u00e4\3\2\u00e5\u00e6\3\2\u00e8\u00e9\3\2\u00ec\u00ed\4\2\u00fa"+
		"\u00fa\u0109\u0109\3\2\u00fb\u00fc\4\2\u00f7\u00f7\u0100\u0100\3\2\u0103"+
		"\u0104\3\2\u0106\u0107\4\2\u00ff\u00ff\u010a\u010a\3\2\u010b\u010c\3\2"+
		"\u010d\u010e\3\2\u0118\u0119\4\2\u0121\u0121\u0123\u0123\4\2;;\u0096\u0097"+
		"\3\2\u011a\u011b\4\2\u011c\u011c\u011f\u011f\3\2\u0124\u0125\4\2\u0099"+
		"\u0099\u0126\u0126\5\2\u0091\u0091\u00f2\u00f2\u013d\u013d\3\2\u0128\u0129"+
		"\3\2\u012b\u012c\4\2\u0133\u0133\u0135\u0135\5\2gg\u0167\u0167\u01a2\u01a2"+
		"\3\2\u0137\u0138\4\2\u013a\u013a\u013c\u013c\4\2\22\22\u0094\u0094\3\2"+
		"\u013f\u0140\n\2((,,\u0085\u0087\u008a\u008a\u0092\u0092\u0178\u0178\u0194"+
		"\u0194\u0199\u0199\3\2\u0144\u0145\4\2\u0146\u0146\u0197\u0197\3\2\u014f"+
		"\u0150\3\2\u0151\u0152\4\2\u0154\u0154\u016e\u016e\4\2\u0157\u0157\u0198"+
		"\u0198\3\2\u015c\u015d\3\2\u0164\u0165\4\2\u0162\u0162\u0168\u0168\3\2"+
		"\u016b\u016c\3\2\u016f\u0170\5\2  \u0133\u0133\u0167\u0167\6\2,,\u0166"+
		"\u0166\u018e\u018e\u0198\u0198\3\2\u017c\u017d\6\2,,\u016a\u016a\u018e"+
		"\u018e\u0198\u0198\3\2\u017e\u017f\4\2\u0180\u0180\u0183\u0183\6\2,,\u0181"+
		"\u0181\u018e\u018e\u019b\u019b\4\2\u0184\u0184\u019b\u019b\4\2gg\u0153"+
		"\u0153\3\2\u0185\u0186\4\2\u0187\u0187\u018b\u018b\4\2\u0188\u0188\u018c"+
		"\u018c\3\2@A\4\2\u019d\u019d\u01aa\u01aa\4\2\27\27\u009f\u009f\21\2UV"+
		"Z[{{\u008b\u008b\u00c3\u00c4\u00c6\u00c7\u00d9\u00d9\u00de\u00de\u00e7"+
		"\u00e7\u00ea\u00ea\u00fd\u00fe\u0112\u0115\u012e\u012f\u0155\u0156\u0177"+
		"\u0177\6\2\22\22\u0094\u0094\u011d\u011d\u0189\u0189\3\2\u014d\u014e\4"+
		"\2JJ\u00b9\u00b9\4\2pp\u012a\u012a\3\2\u015f\u0161\3\2\u01a1\u01a2\3\2"+
		"\u01b9\u01ba\4\2\u01bc\u01bd\u01cf\u01cf\3\2\u01c6\u01c7\4\2\u01ad\u01ad"+
		"\u01b1\u01b3\3\2\u01d1\u01d2\4\2\u01b8\u01b8\u01cb\u01cb\26\2\22-/WY\\"+
		"^bdmp|~\u0088\u008a\u0117\u0119\u013b\u013d\u0147\u0149\u014a\u014c\u015e"+
		"\u0162\u017e\u0180\u0182\u0184\u019b\u019d\u019d\u01b1\u01b1\u01cb\u01cb"+
		"\u01cf\u01cf\u01d3\u01d5\2\u0614\2\u0089\3\2\2\2\4\u008e\3\2\2\2\6\u0091"+
		"\3\2\2\2\b\u009b\3\2\2\2\n\u02b5\3\2\2\2\f\u02b7\3\2\2\2\16\u02cc\3\2"+
		"\2\2\20\u02ce\3\2\2\2\22\u02d0\3\2\2\2\24\u02e4\3\2\2\2\26\u02e6\3\2\2"+
		"\2\30\u02e8\3\2\2\2\32\u02ef\3\2\2\2\34\u02f6\3\2\2\2\36\u02fd\3\2\2\2"+
		" \u031b\3\2\2\2\"\u0323\3\2\2\2$\u0325\3\2\2\2&\u0338\3\2\2\2(\u0343\3"+
		"\2\2\2*\u0357\3\2\2\2,\u0361\3\2\2\2.\u0382\3\2\2\2\60\u038d\3\2\2\2\62"+
		"\u039c\3\2\2\2\64\u03a2\3\2\2\2\66\u03a4\3\2\2\28\u03a8\3\2\2\2:\u03ac"+
		"\3\2\2\2<\u03b1\3\2\2\2>\u03b9\3\2\2\2@\u03c1\3\2\2\2B\u03cd\3\2\2\2D"+
		"\u03d3\3\2\2\2F\u03d5\3\2\2\2H\u03d7\3\2\2\2J\u03db\3\2\2\2L\u03df\3\2"+
		"\2\2N\u03e8\3\2\2\2P\u03ea\3\2\2\2R\u03ef\3\2\2\2T\u03f3\3\2\2\2V\u0404"+
		"\3\2\2\2X\u0409\3\2\2\2Z\u042e\3\2\2\2\\\u0435\3\2\2\2^\u0437\3\2\2\2"+
		"`\u043b\3\2\2\2b\u043e\3\2\2\2d\u0441\3\2\2\2f\u0449\3\2\2\2h\u045c\3"+
		"\2\2\2j\u0460\3\2\2\2l\u04a5\3\2\2\2n\u04ac\3\2\2\2p\u04b0\3\2\2\2r\u04b7"+
		"\3\2\2\2t\u04b9\3\2\2\2v\u04c2\3\2\2\2x\u0088\5\4\3\2y\u0088\5\6\4\2z"+
		"\u0088\5J&\2{\u0088\5\26\f\2|\u0088\5\36\20\2}\u0088\5\30\r\2~\u0088\5"+
		"\32\16\2\177\u0088\5\34\17\2\u0080\u0088\5*\26\2\u0081\u0088\5&\24\2\u0082"+
		"\u0088\5\66\34\2\u0083\u0088\58\35\2\u0084\u0088\5:\36\2\u0085\u0088\5"+
		"B\"\2\u0086\u0088\7\u01a6\2\2\u0087x\3\2\2\2\u0087y\3\2\2\2\u0087z\3\2"+
		"\2\2\u0087{\3\2\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087~\3\2\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2"+
		"\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\2\2\3\u008d\3\3\2\2\2"+
		"\u008e\u008f\t\2\2\2\u008f\u0090\7D\2\2\u0090\5\3\2\2\2\u0091\u0097\t"+
		"\3\2\2\u0092\u0094\7\u019d\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0098\5\n\6\2\u0096\u0098\5\b\5\2\u0097\u0093"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\7\3\2\2\2\u009b\u009c\7\u0182\2\2\u009c\u009d\7\u0089"+
		"\2\2\u009d\u00a4\5\n\6\2\u009e\u00a0\7\u019d\2\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\5\n\6\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\u014b\2\2\u00a8\t\3\2"+
		"\2\2\u00a9\u02b6\7\23\2\2\u00aa\u02b6\7\24\2\2\u00ab\u00ac\7\25\2\2\u00ac"+
		"\u00ad\7\u0089\2\2\u00ad\u00ae\t\4\2\2\u00ae\u02b6\7\u014b\2\2\u00af\u02b6"+
		"\7\32\2\2\u00b0\u00b1\7\34\2\2\u00b1\u00b2\7\u0089\2\2\u00b2\u00b3\5F"+
		"$\2\u00b3\u00b4\7\u014b\2\2\u00b4\u02b6\3\2\2\2\u00b5\u00b6\t\5\2\2\u00b6"+
		"\u00b7\7\u0089\2\2\u00b7\u00b8\t\6\2\2\u00b8\u02b6\7\u014b\2\2\u00b9\u02b6"+
		"\7\37\2\2\u00ba\u02b6\7!\2\2\u00bb\u00bc\t\7\2\2\u00bc\u00bd\7\u0089\2"+
		"\2\u00bd\u00be\5F$\2\u00be\u00bf\7\u014b\2\2\u00bf\u02b6\3\2\2\2\u00c0"+
		"\u02b6\7&\2\2\u00c1\u00c6\7\'\2\2\u00c2\u00c3\7\u0089\2\2\u00c3\u00c4"+
		"\5F$\2\u00c4\u00c5\7\u014b\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u02b6\3\2\2\2\u00c8\u02b6\7)\2\2\u00c9\u02b6"+
		"\7*\2\2\u00ca\u00cb\t\b\2\2\u00cb\u00cc\7\u0089\2\2\u00cc\u00cd\5F$\2"+
		"\u00cd\u00ce\7\u014b\2\2\u00ce\u02b6\3\2\2\2\u00cf\u02b6\t\t\2\2\u00d0"+
		"\u00d1\t\n\2\2\u00d1\u00d4\7\u0089\2\2\u00d2\u00d5\7\u01a3\2\2\u00d3\u00d5"+
		"\5F$\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00dd\3\2\2\2\u00d6\u00d8\7\u019d\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7I\2\2\u00da\u00db\7\u0089\2"+
		"\2\u00db\u00dc\7\u01a4\2\2\u00dc\u00de\7\u014b\2\2\u00dd\u00d7\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00e7\3\2\2\2\u00df\u00e1\7\u019d\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\u013b"+
		"\2\2\u00e3\u00e4\7\u0089\2\2\u00e4\u00e5\5F$\2\u00e5\u00e6\7\u014b\2\2"+
		"\u00e6\u00e8\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u02b6\7\u014b\2\2\u00ea\u00eb\t\13\2\2\u00eb\u00ec\7\u0089"+
		"\2\2\u00ec\u00ed\5F$\2\u00ed\u00ee\7\u014b\2\2\u00ee\u02b6\3\2\2\2\u00ef"+
		"\u02b6\7\63\2\2\u00f0\u02b6\7\64\2\2\u00f1\u00f2\t\f\2\2\u00f2\u00f3\7"+
		"\u0089\2\2\u00f3\u00f4\7\u01aa\2\2\u00f4\u02b6\7\u014b\2\2\u00f5\u00f6"+
		"\79\2\2\u00f6\u00f7\7\u0089\2\2\u00f7\u00f8\5F$\2\u00f8\u00f9\7\u014b"+
		"\2\2\u00f9\u02b6\3\2\2\2\u00fa\u0106\t\r\2\2\u00fb\u00fd\7\u0089\2\2\u00fc"+
		"\u00fe\t\16\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3"+
		"\2\2\2\u00ff\u0101\7\u019d\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u0104\t\17\2\2\u0103\u0102\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\7\u014b\2\2\u0106\u00fb\3\2\2"+
		"\2\u0106\u0107\3\2\2\2\u0107\u02b6\3\2\2\2\u0108\u02b6\7;\2\2\u0109\u02b6"+
		"\t\20\2\2\u010a\u02b6\7=\2\2\u010b\u02b6\5\f\7\2\u010c\u02b6\t\21\2\2"+
		"\u010d\u010e\t\22\2\2\u010e\u010f\7\u0089\2\2\u010f\u0110\t\23\2\2\u0110"+
		"\u02b6\7\u014b\2\2\u0111\u02b6\7F\2\2\u0112\u02b6\t\24\2\2\u0113\u02b6"+
		"\t\25\2\2\u0114\u02b6\7Q\2\2\u0115\u02b6\7Y\2\2\u0116\u02b6\7^\2\2\u0117"+
		"\u02b6\t\26\2\2\u0118\u02b6\t\27\2\2\u0119\u02b6\7c\2\2\u011a\u011b\t"+
		"\30\2\2\u011b\u011c\7\u0089\2\2\u011c\u011f\t\31\2\2\u011d\u011e\7\u019d"+
		"\2\2\u011e\u0120\t\31\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u02b6\7\u014b\2\2\u0122\u0123\7e\2\2\u0123\u0124"+
		"\7\u0089\2\2\u0124\u0127\t\32\2\2\u0125\u0126\7\u019d\2\2\u0126\u0128"+
		"\t\33\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2"+
		"\u0129\u012a\7\u019d\2\2\u012a\u012c\7\u0196\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u02b6\7\u014b\2\2\u012e\u02b6"+
		"\7h\2\2\u012f\u02b6\7i\2\2\u0130\u0131\7k\2\2\u0131\u0132\7\u0089\2\2"+
		"\u0132\u0133\t\34\2\2\u0133\u02b6\7\u014b\2\2\u0134\u0135\7r\2\2\u0135"+
		"\u0136\7\u0089\2\2\u0136\u0137\t\35\2\2\u0137\u02b6\7\u014b\2\2\u0138"+
		"\u013c\t\36\2\2\u0139\u013a\7\u0089\2\2\u013a\u013b\t\37\2\2\u013b\u013d"+
		"\7\u014b\2\2\u013c\u0139\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u02b6\3\2\2"+
		"\2\u013e\u02b6\7s\2\2\u013f\u02b6\7\u01c5\2\2\u0140\u02b6\7t\2\2\u0141"+
		"\u0142\t \2\2\u0142\u0143\7\u0089\2\2\u0143\u0144\t!\2\2\u0144\u02b6\7"+
		"\u014b\2\2\u0145\u02b6\7}\2\2\u0146\u02b6\7~\2\2\u0147\u02b6\7\177\2\2"+
		"\u0148\u02b6\7\u0081\2\2\u0149\u014a\t\"\2\2\u014a\u014b\7\u0089\2\2\u014b"+
		"\u014c\5F$\2\u014c\u014d\7\u014b\2\2\u014d\u02b6\3\2\2\2\u014e\u02b6\7"+
		"\u0083\2\2\u014f\u02b6\7\u0084\2\2\u0150\u0151\7\u0088\2\2\u0151\u0152"+
		"\7\u0089\2\2\u0152\u0153\5F$\2\u0153\u0154\7\u014b\2\2\u0154\u02b6\3\2"+
		"\2\2\u0155\u0159\7\u008c\2\2\u0156\u0157\7\u0089\2\2\u0157\u0158\t#\2"+
		"\2\u0158\u015a\7\u014b\2\2\u0159\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u02b6\3\2\2\2\u015b\u015c\7\u008d\2\2\u015c\u015d\7\u0089\2\2\u015d\u015e"+
		"\5F$\2\u015e\u015f\7\u019d\2\2\u015f\u0162\5F$\2\u0160\u0161\7\u019d\2"+
		"\2\u0161\u0163\5F$\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\7\u014b\2\2\u0165\u02b6\3\2\2\2\u0166\u0167\7\u0093"+
		"\2\2\u0167\u0168\7\u0089\2\2\u0168\u0169\5F$\2\u0169\u016a\7\u014b\2\2"+
		"\u016a\u02b6\3\2\2\2\u016b\u016f\t$\2\2\u016c\u016d\7\u0089\2\2\u016d"+
		"\u016e\t%\2\2\u016e\u0170\7\u014b\2\2\u016f\u016c\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u02b6\3\2\2\2\u0171\u0175\7\u0095\2\2\u0172\u0173\7\u0089"+
		"\2\2\u0173\u0174\t&\2\2\u0174\u0176\7\u014b\2\2\u0175\u0172\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u02b6\3\2\2\2\u0177\u0178\7\u0098\2\2\u0178\u0179"+
		"\7\u0089\2\2\u0179\u017a\t\'\2\2\u017a\u02b6\7\u014b\2\2\u017b\u02b6\7"+
		"\u009c\2\2\u017c\u02b6\7\u009d\2\2\u017d\u02b6\7\u00a0\2\2\u017e\u02b6"+
		"\7\u00a2\2\2\u017f\u02b6\7\u00a4\2\2\u0180\u02b6\7\u00a5\2\2\u0181\u02b6"+
		"\7\u00a6\2\2\u0182\u0186\t(\2\2\u0183\u0184\7\u0089\2\2\u0184\u0185\t"+
		")\2\2\u0185\u0187\7\u014b\2\2\u0186\u0183\3\2\2\2\u0186\u0187\3\2\2\2"+
		"\u0187\u02b6\3\2\2\2\u0188\u02b6\7\u00a8\2\2\u0189\u02b6\7\u00aa\2\2\u018a"+
		"\u02b6\7\u00a9\2\2\u018b\u02b6\7\u00ac\2\2\u018c\u02b6\7\u00ab\2\2\u018d"+
		"\u02b6\t*\2\2\u018e\u02b6\t+\2\2\u018f\u02b6\7\u00b1\2\2\u0190\u02b6\7"+
		"\u00b3\2\2\u0191\u02b6\t,\2\2\u0192\u02b6\t-\2\2\u0193\u02b6\7\u00b8\2"+
		"\2\u0194\u02b6\7\u00b2\2\2\u0195\u02b6\t.\2\2\u0196\u02b6\t/\2\2\u0197"+
		"\u02b6\t\60\2\2\u0198\u02b6\7\u00c1\2\2\u0199\u02b6\7\u00c5\2\2\u019a"+
		"\u02b6\7\u00c8\2\2\u019b\u02b6\t\61\2\2\u019c\u02b6\t\62\2\2\u019d\u02b6"+
		"\7\u00cd\2\2\u019e\u02b6\t\63\2\2\u019f\u02b6\7\u00cf\2\2\u01a0\u02b6"+
		"\7\u00d0\2\2\u01a1\u02b6\7\u00d2\2\2\u01a2\u02b6\t\64\2\2\u01a3\u02b6"+
		"\7\u00d6\2\2\u01a4\u02b6\7\u00d7\2\2\u01a5\u02b6\7\u00d8\2\2\u01a6\u02b6"+
		"\7\u00da\2\2\u01a7\u02b6\7\u00db\2\2\u01a8\u02b6\7\u00dc\2\2\u01a9\u02b6"+
		"\7\u00dd\2\2\u01aa\u02b6\7\u00df\2\2\u01ab\u02b6\t\65\2\2\u01ac\u02b6"+
		"\7\u00e2\2\2\u01ad\u02b6\t\66\2\2\u01ae\u02b6\t\67\2\2\u01af\u02b6\t8"+
		"\2\2\u01b0\u02b6\7\u00eb\2\2\u01b1\u02b6\t9\2\2\u01b2\u02b6\7\u00ee\2"+
		"\2\u01b3\u02b6\7\u00ef\2\2\u01b4\u02b6\7\u00f1\2\2\u01b5\u02b6\7\u00f4"+
		"\2\2\u01b6\u02b6\7\u00f5\2\2\u01b7\u02b6\7\u00f6\2\2\u01b8\u02b6\t:\2"+
		"\2\u01b9\u02b6\t;\2\2\u01ba\u02b6\t<\2\2\u01bb\u02b6\7\u0101\2\2\u01bc"+
		"\u02b6\7\u0102\2\2\u01bd\u02b6\7\u0105\2\2\u01be\u02b6\t=\2\2\u01bf\u02b6"+
		"\t>\2\2\u01c0\u02b6\7\u0108\2\2\u01c1\u02b6\t?\2\2\u01c2\u02b6\t@\2\2"+
		"\u01c3\u02b6\tA\2\2\u01c4\u02b6\7\u010f\2\2\u01c5\u02b6\7\u0110\2\2\u01c6"+
		"\u02b6\7\u0116\2\2\u01c7\u02b6\tB\2\2\u01c8\u02b6\7\u0122\2\2\u01c9\u01ca"+
		"\tC\2\2\u01ca\u01cb\7\u0089\2\2\u01cb\u01cc\tD\2\2\u01cc\u02b6\7\u014b"+
		"\2\2\u01cd\u02b6\7\u0116\2\2\u01ce\u02b6\tE\2\2\u01cf\u02b6\tF\2\2\u01d0"+
		"\u02b6\7\u0120\2\2\u01d1\u02b6\tG\2\2\u01d2\u01de\tH\2\2\u01d3\u01d4\7"+
		"\u0089\2\2\u01d4\u01d9\5\16\b\2\u01d5\u01d6\7\u019d\2\2\u01d6\u01d8\5"+
		"\16\b\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\u014b"+
		"\2\2\u01dd\u01df\3\2\2\2\u01de\u01d3\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u02b6\3\2\2\2\u01e0\u01e1\7\u0127\2\2\u01e1\u01e2\7\u0089\2\2\u01e2\u01e3"+
		"\tI\2\2\u01e3\u02b6\7\u014b\2\2\u01e4\u02b6\tJ\2\2\u01e5\u02b6\tK\2\2"+
		"\u01e6\u01e7\7\u0131\2\2\u01e7\u01e8\7\u0089\2\2\u01e8\u01e9\5F$\2\u01e9"+
		"\u01ea\7\u019d\2\2\u01ea\u01ed\5F$\2\u01eb\u01ec\7\u019d\2\2\u01ec\u01ee"+
		"\5F$\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\7\u014b\2\2\u01f0\u02b6\3\2\2\2\u01f1\u01f2\7\u0132\2\2\u01f2\u01f3"+
		"\7\u0089\2\2\u01f3\u01f4\5F$\2\u01f4\u01f5\7\u019d\2\2\u01f5\u01f6\5F"+
		"$\2\u01f6\u01f7\7\u014b\2\2\u01f7\u02b6\3\2\2\2\u01f8\u01fc\tL\2\2\u01f9"+
		"\u01fa\7\u0089\2\2\u01fa\u01fb\tM\2\2\u01fb\u01fd\7\u014b\2\2\u01fc\u01f9"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u02b6\3\2\2\2\u01fe\u02b6\7\u0134\2"+
		"\2\u01ff\u02b6\7\u0136\2\2\u0200\u02b6\7\u0130\2\2\u0201\u0202\tN\2\2"+
		"\u0202\u0203\7\u0089\2\2\u0203\u0204\5D#\2\u0204\u0205\7\u014b\2\2\u0205"+
		"\u02b6\3\2\2\2\u0206\u0212\tO\2\2\u0207\u0209\7\u0089\2\2\u0208\u020a"+
		"\tP\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020f\3\2\2\2\u020b"+
		"\u020d\7\u019d\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u0210\5F$\2\u020f\u020c\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0213\7\u014b\2\2\u0212\u0207\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u02b6\3\2\2\2\u0214\u0215\tQ\2\2\u0215\u0216\7\u0089\2"+
		"\2\u0216\u0217\tR\2\2\u0217\u02b6\7\u014b\2\2\u0218\u02b6\7\u0143\2\2"+
		"\u0219\u021a\tS\2\2\u021a\u021b\7\u0089\2\2\u021b\u021c\t\6\2\2\u021c"+
		"\u02b6\7\u014b\2\2\u021d\u02b6\tT\2\2\u021e\u02b6\7\u0147\2\2\u021f\u0220"+
		"\7\u014a\2\2\u0220\u0224\7\u0089\2\2\u0221\u0225\7\31\2\2\u0222\u0225"+
		"\7\36\2\2\u0223\u0225\5F$\2\u0224\u0221\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u02b6\7\u014b\2\2\u0227\u0233"+
		"\7\u014c\2\2\u0228\u0229\7\u0089\2\2\u0229\u022e\5\20\t\2\u022a\u022b"+
		"\7\u019d\2\2\u022b\u022d\5\20\t\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0232\7\u014b\2\2\u0232\u0234\3\2\2\2\u0233\u0228"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u02b6\3\2\2\2\u0235\u023c\tU\2\2\u0236"+
		"\u0237\7\u0089\2\2\u0237\u0238\5F$\2\u0238\u0239\7\u019d\2\2\u0239\u023a"+
		"\5F$\2\u023a\u023b\7\u014b\2\2\u023b\u023d\3\2\2\2\u023c\u0236\3\2\2\2"+
		"\u023c\u023d\3\2\2\2\u023d\u02b6\3\2\2\2\u023e\u023f\tV\2\2\u023f\u0240"+
		"\7\u0089\2\2\u0240\u0241\5F$\2\u0241\u0242\7\u014b\2\2\u0242\u02b6\3\2"+
		"\2\2\u0243\u0244\tW\2\2\u0244\u0247\7\u0089\2\2\u0245\u0248\7\u008e\2"+
		"\2\u0246\u0248\5F$\2\u0247\u0245\3\2\2\2\u0247\u0246\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u02b6\7\u014b\2\2\u024a\u02b6\tX\2\2\u024b\u02b6\7\u0158"+
		"\2\2\u024c\u024d\7\u0159\2\2\u024d\u024e\7\u0089\2\2\u024e\u024f\5F$\2"+
		"\u024f\u0250\7\u014b\2\2\u0250\u02b6\3\2\2\2\u0251\u02b6\7\u015a\2\2\u0252"+
		"\u0257\7\u015b\2\2\u0253\u0254\7\u0089\2\2\u0254\u0255\5F$\2\u0255\u0256"+
		"\7\u014b\2\2\u0256\u0258\3\2\2\2\u0257\u0253\3\2\2\2\u0257\u0258\3\2\2"+
		"\2\u0258\u02b6\3\2\2\2\u0259\u02b6\tY\2\2\u025a\u025f\7\u015e\2\2\u025b"+
		"\u025c\7\u0089\2\2\u025c\u025d\5F$\2\u025d\u025e\7\u014b\2\2\u025e\u0260"+
		"\3\2\2\2\u025f\u025b\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u02b6\3\2\2\2\u0261"+
		"\u026d\tZ\2\2\u0262\u0263\7\u0089\2\2\u0263\u0268\5\22\n\2\u0264\u0265"+
		"\7\u019d\2\2\u0265\u0267\5\22\n\2\u0266\u0264\3\2\2\2\u0267\u026a\3\2"+
		"\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026c\7\u014b\2\2\u026c\u026e\3\2\2\2\u026d\u0262"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u02b6\3\2\2\2\u026f\u02b6\t[\2\2\u0270"+
		"\u02b6\t\\\2\2\u0271\u02b6\7\u016d\2\2\u0272\u02b6\t]\2\2\u0273\u027f"+
		"\7\u0171\2\2\u0274\u0275\7\u0089\2\2\u0275\u027a\5\24\13\2\u0276\u0277"+
		"\7\u019d\2\2\u0277\u0279\5\24\13\2\u0278\u0276\3\2\2\2\u0279\u027c\3\2"+
		"\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u027e\7\u014b\2\2\u027e\u0280\3\2\2\2\u027f\u0274"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u02b6\3\2\2\2\u0281\u02b6\7\u0172\2"+
		"\2\u0282\u0283\7\u0175\2\2\u0283\u0284\7\u0089\2\2\u0284\u0285\t^\2\2"+
		"\u0285\u02b6\7\u014b\2\2\u0286\u02b6\7\u0179\2\2\u0287\u0288\7\u017a\2"+
		"\2\u0288\u0289\7\u0089\2\2\u0289\u028a\t_\2\2\u028a\u02b6\7\u014b\2\2"+
		"\u028b\u028c\t`\2\2\u028c\u028d\7\u0089\2\2\u028d\u028e\ta\2\2\u028e\u02b6"+
		"\7\u014b\2\2\u028f\u0290\tb\2\2\u0290\u0297\7\u0089\2\2\u0291\u0298\5"+
		"D#\2\u0292\u0294\7\u01aa\2\2\u0293\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0291\3\2"+
		"\2\2\u0297\u0293\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u02b6\7\u014b\2\2\u029a"+
		"\u029b\tc\2\2\u029b\u029c\7\u0089\2\2\u029c\u029d\td\2\2\u029d\u02b6\7"+
		"\u014b\2\2\u029e\u02a4\te\2\2\u029f\u02a1\7\u0089\2\2\u02a0\u02a2\tf\2"+
		"\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5"+
		"\7\u014b\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02b6\3\2\2"+
		"\2\u02a6\u02a7\tg\2\2\u02a7\u02a8\7\u0089\2\2\u02a8\u02a9\5F$\2\u02a9"+
		"\u02aa\7\u014b\2\2\u02aa\u02b6\3\2\2\2\u02ab\u02ac\th\2\2\u02ac\u02ad"+
		"\7\u0089\2\2\u02ad\u02ae\tP\2\2\u02ae\u02b6\7\u014b\2\2\u02af\u02b0\t"+
		"i\2\2\u02b0\u02b1\7\u0089\2\2\u02b1\u02b2\tI\2\2\u02b2\u02b6\7\u014b\2"+
		"\2\u02b3\u02b6\7\u018d\2\2\u02b4\u02b6\5\24\13\2\u02b5\u00a9\3\2\2\2\u02b5"+
		"\u00aa\3\2\2\2\u02b5\u00ab\3\2\2\2\u02b5\u00af\3\2\2\2\u02b5\u00b0\3\2"+
		"\2\2\u02b5\u00b5\3\2\2\2\u02b5\u00b9\3\2\2\2\u02b5\u00ba\3\2\2\2\u02b5"+
		"\u00bb\3\2\2\2\u02b5\u00c0\3\2\2\2\u02b5\u00c1\3\2\2\2\u02b5\u00c8\3\2"+
		"\2\2\u02b5\u00c9\3\2\2\2\u02b5\u00ca\3\2\2\2\u02b5\u00cf\3\2\2\2\u02b5"+
		"\u00d0\3\2\2\2\u02b5\u00ea\3\2\2\2\u02b5\u00ef\3\2\2\2\u02b5\u00f0\3\2"+
		"\2\2\u02b5\u00f1\3\2\2\2\u02b5\u00f5\3\2\2\2\u02b5\u00fa\3\2\2\2\u02b5"+
		"\u0108\3\2\2\2\u02b5\u0109\3\2\2\2\u02b5\u010a\3\2\2\2\u02b5\u010b\3\2"+
		"\2\2\u02b5\u010c\3\2\2\2\u02b5\u010d\3\2\2\2\u02b5\u0111\3\2\2\2\u02b5"+
		"\u0112\3\2\2\2\u02b5\u0113\3\2\2\2\u02b5\u0114\3\2\2\2\u02b5\u0115\3\2"+
		"\2\2\u02b5\u0116\3\2\2\2\u02b5\u0117\3\2\2\2\u02b5\u0118\3\2\2\2\u02b5"+
		"\u0119\3\2\2\2\u02b5\u011a\3\2\2\2\u02b5\u0122\3\2\2\2\u02b5\u012e\3\2"+
		"\2\2\u02b5\u012f\3\2\2\2\u02b5\u0130\3\2\2\2\u02b5\u0134\3\2\2\2\u02b5"+
		"\u0138\3\2\2\2\u02b5\u013e\3\2\2\2\u02b5\u013f\3\2\2\2\u02b5\u0140\3\2"+
		"\2\2\u02b5\u0141\3\2\2\2\u02b5\u0145\3\2\2\2\u02b5\u0146\3\2\2\2\u02b5"+
		"\u0147\3\2\2\2\u02b5\u0148\3\2\2\2\u02b5\u0149\3\2\2\2\u02b5\u014e\3\2"+
		"\2\2\u02b5\u014f\3\2\2\2\u02b5\u0150\3\2\2\2\u02b5\u0155\3\2\2\2\u02b5"+
		"\u015b\3\2\2\2\u02b5\u0166\3\2\2\2\u02b5\u016b\3\2\2\2\u02b5\u0171\3\2"+
		"\2\2\u02b5\u0177\3\2\2\2\u02b5\u017b\3\2\2\2\u02b5\u017c\3\2\2\2\u02b5"+
		"\u017d\3\2\2\2\u02b5\u017e\3\2\2\2\u02b5\u017f\3\2\2\2\u02b5\u0180\3\2"+
		"\2\2\u02b5\u0181\3\2\2\2\u02b5\u0182\3\2\2\2\u02b5\u0188\3\2\2\2\u02b5"+
		"\u0189\3\2\2\2\u02b5\u018a\3\2\2\2\u02b5\u018b\3\2\2\2\u02b5\u018c\3\2"+
		"\2\2\u02b5\u018d\3\2\2\2\u02b5\u018e\3\2\2\2\u02b5\u018f\3\2\2\2\u02b5"+
		"\u0190\3\2\2\2\u02b5\u0191\3\2\2\2\u02b5\u0192\3\2\2\2\u02b5\u0193\3\2"+
		"\2\2\u02b5\u0194\3\2\2\2\u02b5\u0195\3\2\2\2\u02b5\u0196\3\2\2\2\u02b5"+
		"\u0197\3\2\2\2\u02b5\u0198\3\2\2\2\u02b5\u0199\3\2\2\2\u02b5\u019a\3\2"+
		"\2\2\u02b5\u019b\3\2\2\2\u02b5\u019c\3\2\2\2\u02b5\u019d\3\2\2\2\u02b5"+
		"\u019e\3\2\2\2\u02b5\u019f\3\2\2\2\u02b5\u01a0\3\2\2\2\u02b5\u01a1\3\2"+
		"\2\2\u02b5\u01a2\3\2\2\2\u02b5\u01a3\3\2\2\2\u02b5\u01a4\3\2\2\2\u02b5"+
		"\u01a5\3\2\2\2\u02b5\u01a6\3\2\2\2\u02b5\u01a7\3\2\2\2\u02b5\u01a8\3\2"+
		"\2\2\u02b5\u01a9\3\2\2\2\u02b5\u01aa\3\2\2\2\u02b5\u01ab\3\2\2\2\u02b5"+
		"\u01ac\3\2\2\2\u02b5\u01ad\3\2\2\2\u02b5\u01ae\3\2\2\2\u02b5\u01af\3\2"+
		"\2\2\u02b5\u01b0\3\2\2\2\u02b5\u01b1\3\2\2\2\u02b5\u01b2\3\2\2\2\u02b5"+
		"\u01b3\3\2\2\2\u02b5\u01b4\3\2\2\2\u02b5\u01b5\3\2\2\2\u02b5\u01b6\3\2"+
		"\2\2\u02b5\u01b7\3\2\2\2\u02b5\u01b8\3\2\2\2\u02b5\u01b9\3\2\2\2\u02b5"+
		"\u01ba\3\2\2\2\u02b5\u01bb\3\2\2\2\u02b5\u01bc\3\2\2\2\u02b5\u01bd\3\2"+
		"\2\2\u02b5\u01be\3\2\2\2\u02b5\u01bf\3\2\2\2\u02b5\u01c0\3\2\2\2\u02b5"+
		"\u01c1\3\2\2\2\u02b5\u01c2\3\2\2\2\u02b5\u01c3\3\2\2\2\u02b5\u01c4\3\2"+
		"\2\2\u02b5\u01c5\3\2\2\2\u02b5\u01c6\3\2\2\2\u02b5\u01c7\3\2\2\2\u02b5"+
		"\u01c8\3\2\2\2\u02b5\u01c9\3\2\2\2\u02b5\u01cd\3\2\2\2\u02b5\u01ce\3\2"+
		"\2\2\u02b5\u01cf\3\2\2\2\u02b5\u01d0\3\2\2\2\u02b5\u01d1\3\2\2\2\u02b5"+
		"\u01d2\3\2\2\2\u02b5\u01e0\3\2\2\2\u02b5\u01e4\3\2\2\2\u02b5\u01e5\3\2"+
		"\2\2\u02b5\u01e6\3\2\2\2\u02b5\u01f1\3\2\2\2\u02b5\u01f8\3\2\2\2\u02b5"+
		"\u01fe\3\2\2\2\u02b5\u01ff\3\2\2\2\u02b5\u0200\3\2\2\2\u02b5\u0201\3\2"+
		"\2\2\u02b5\u0206\3\2\2\2\u02b5\u0214\3\2\2\2\u02b5\u0218\3\2\2\2\u02b5"+
		"\u0219\3\2\2\2\u02b5\u021d\3\2\2\2\u02b5\u021e\3\2\2\2\u02b5\u021f\3\2"+
		"\2\2\u02b5\u0227\3\2\2\2\u02b5\u0235\3\2\2\2\u02b5\u023e\3\2\2\2\u02b5"+
		"\u0243\3\2\2\2\u02b5\u024a\3\2\2\2\u02b5\u024b\3\2\2\2\u02b5\u024c\3\2"+
		"\2\2\u02b5\u0251\3\2\2\2\u02b5\u0252\3\2\2\2\u02b5\u0259\3\2\2\2\u02b5"+
		"\u025a\3\2\2\2\u02b5\u0261\3\2\2\2\u02b5\u026f\3\2\2\2\u02b5\u0270\3\2"+
		"\2\2\u02b5\u0271\3\2\2\2\u02b5\u0272\3\2\2\2\u02b5\u0273\3\2\2\2\u02b5"+
		"\u0281\3\2\2\2\u02b5\u0282\3\2\2\2\u02b5\u0286\3\2\2\2\u02b5\u0287\3\2"+
		"\2\2\u02b5\u028b\3\2\2\2\u02b5\u028f\3\2\2\2\u02b5\u029a\3\2\2\2\u02b5"+
		"\u029e\3\2\2\2\u02b5\u02a6\3\2\2\2\u02b5\u02ab\3\2\2\2\u02b5\u02af\3\2"+
		"\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\13\3\2\2\2\u02b7\u02b8"+
		"\tj\2\2\u02b8\u02b9\7\u0089\2\2\u02b9\u02bc\7\u01a3\2\2\u02ba\u02bb\t"+
		"k\2\2\u02bb\u02bd\5F$\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bf\7\u014b\2\2\u02bf\r\3\2\2\2\u02c0\u02cd\7\u018a"+
		"\2\2\u02c1\u02c2\7\u018a\2\2\u02c2\u02c3\7\u0089\2\2\u02c3\u02c4\tl\2"+
		"\2\u02c4\u02cd\7\u014b\2\2\u02c5\u02cd\7\u011e\2\2\u02c6\u02cd\7\u0139"+
		"\2\2\u02c7\u02cd\7\u00f0\2\2\u02c8\u02cd\7 \2\2\u02c9\u02cd\7\u00a1\2"+
		"\2\u02ca\u02cd\7\u0094\2\2\u02cb\u02cd\7\22\2\2\u02cc\u02c0\3\2\2\2\u02cc"+
		"\u02c1\3\2\2\2\u02cc\u02c5\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02c7\3\2"+
		"\2\2\u02cc\u02c8\3\2\2\2\u02cc\u02c9\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc"+
		"\u02cb\3\2\2\2\u02cd\17\3\2\2\2\u02ce\u02cf\tm\2\2\u02cf\21\3\2\2\2\u02d0"+
		"\u02d1\tn\2\2\u02d1\23\3\2\2\2\u02d2\u02e5\7N\2\2\u02d3\u02e5\7\u00be"+
		"\2\2\u02d4\u02e5\7l\2\2\u02d5\u02e5\7\u00d3\2\2\u02d6\u02da\to\2\2\u02d7"+
		"\u02d8\7\u0089\2\2\u02d8\u02d9\tp\2\2\u02d9\u02db\7\u014b\2\2\u02da\u02d7"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02e5\3\2\2\2\u02dc\u02e5\7\u00f8\2"+
		"\2\u02dd\u02e5\7\u00f9\2\2\u02de\u02e5\7\u0162\2\2\u02df\u02e5\7\u0157"+
		"\2\2\u02e0\u02e5\7\u00ff\2\2\u02e1\u02e5\7\u0100\2\2\u02e2\u02e5\7S\2"+
		"\2\u02e3\u02e5\7\u00c2\2\2\u02e4\u02d2\3\2\2\2\u02e4\u02d3\3\2\2\2\u02e4"+
		"\u02d4\3\2\2\2\u02e4\u02d5\3\2\2\2\u02e4\u02d6\3\2\2\2\u02e4\u02dc\3\2"+
		"\2\2\u02e4\u02dd\3\2\2\2\u02e4\u02de\3\2\2\2\u02e4\u02df\3\2\2\2\u02e4"+
		"\u02e0\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e3\3\2"+
		"\2\2\u02e5\25\3\2\2\2\u02e6\u02e7\7\3\2\2\u02e7\27\3\2\2\2\u02e8\u02e9"+
		"\7]\2\2\u02e9\u02ea\7\'\2\2\u02ea\u02eb\5> \2\u02eb\u02ed\7X\2\2\u02ec"+
		"\u02ee\7\u019f\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\31\3"+
		"\2\2\2\u02ef\u02f0\7]\2\2\u02f0\u02f1\7\u015b\2\2\u02f1\u02f2\5@!\2\u02f2"+
		"\u02f4\7X\2\2\u02f3\u02f5\7\u019f\2\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\33\3\2\2\2\u02f6\u02f7\7]\2\2\u02f7\u02f8\7\u015e\2\2\u02f8"+
		"\u02f9\5> \2\u02f9\u02fb\7X\2\2\u02fa\u02fc\7\u019f\2\2\u02fb\u02fa\3"+
		"\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\35\3\2\2\2\u02fd\u02fe\7.\2\2\u02fe\u030d"+
		"\5 \21\2\u02ff\u0301\7\u01a6\2\2\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2"+
		"\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0309\3\2\2\2\u0304\u0302"+
		"\3\2\2\2\u0305\u030a\5.\30\2\u0306\u030a\5\60\31\2\u0307\u030a\5$\23\2"+
		"\u0308\u030a\7\u016c\2\2\u0309\u0305\3\2\2\2\u0309\u0306\3\2\2\2\u0309"+
		"\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0302\3\2"+
		"\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0313\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0312\7\u01a6\2\2\u0311\u0310"+
		"\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\7\u019f\2\2\u0317\37\3"+
		"\2\2\2\u0318\u031c\5F$\2\u0319\u031c\5D#\2\u031a\u031c\5H%\2\u031b\u0318"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d"+
		"\u031e\tq\2\2\u031e\u0320\5\"\22\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2"+
		"\2\2\u0320!\3\2\2\2\u0321\u0324\5F$\2\u0322\u0324\5D#\2\u0323\u0321\3"+
		"\2\2\2\u0323\u0322\3\2\2\2\u0324#\3\2\2\2\u0325\u0329\7\u0149\2\2\u0326"+
		"\u0328\7\u01a6\2\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327"+
		"\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c"+
		"\u0335\5,\27\2\u032d\u032f\7\u01a6\2\2\u032e\u032d\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0334\5,\27\2\u0333\u032e\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336%\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033d"+
		"\5(\25\2\u0339\u033c\5\36\20\2\u033a\u033c\5> \2\u033b\u0339\3\2\2\2\u033b"+
		"\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0342\5*\26\2\u0341"+
		"\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\'\3\2\2\2\u0343\u034b\7\u0148"+
		"\2\2\u0344\u0346\7\u01a6\2\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u0347\3\2"+
		"\2\2\u034a\u034c\5,\27\2\u034b\u0347\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0352\3\2\2\2\u034f\u0351\7\u01a6"+
		"\2\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\7\u019f"+
		"\2\2\u0356)\3\2\2\2\u0357\u0358\7\u0148\2\2\u0358\u035c\7\u012b\2\2\u0359"+
		"\u035b\7\u01a6\2\2\u035a\u0359\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f"+
		"\u0360\7\u019f\2\2\u0360+\3\2\2\2\u0361\u0365\5\62\32\2\u0362\u0364\7"+
		"\u01a6\2\2\u0363\u0362\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2"+
		"\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u036c"+
		"\7$\2\2\u0369\u036b\7\u01a6\2\2\u036a\u0369\3\2\2\2\u036b\u036e\3\2\2"+
		"\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u036c"+
		"\3\2\2\2\u036f\u0377\5\64\33\2\u0370\u0372\7\u01a6\2\2\u0371\u0370\3\2"+
		"\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0376\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0378\5.\30\2\u0377\u0373\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u0380\3\2\2\2\u0379\u037b\7\u01a6\2\2\u037a"+
		"\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0381\5\60\31\2\u0380"+
		"\u037c\3\2\2\2\u0380\u0381\3\2\2\2\u0381-\3\2\2\2\u0382\u0386\tq\2\2\u0383"+
		"\u0385\7\u01a6\2\2\u0384\u0383\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038b\3\2\2\2\u0388\u0386\3\2\2\2\u0389"+
		"\u038c\5F$\2\u038a\u038c\5D#\2\u038b\u0389\3\2\2\2\u038b\u038a\3\2\2\2"+
		"\u038c/\3\2\2\2\u038d\u0391\7\u012d\2\2\u038e\u0390\7\u01a6\2\2\u038f"+
		"\u038e\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2"+
		"\2\2\u0392\u0396\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0397\5F$\2\u0395\u0397"+
		"\5D#\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397\61\3\2\2\2\u0398"+
		"\u039d\5F$\2\u0399\u039d\5D#\2\u039a\u039d\5<\37\2\u039b\u039d\5B\"\2"+
		"\u039c\u0398\3\2\2\2\u039c\u0399\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039b"+
		"\3\2\2\2\u039d\63\3\2\2\2\u039e\u03a3\5F$\2\u039f\u03a3\5D#\2\u03a0\u03a3"+
		"\5<\37\2\u03a1\u03a3\5B\"\2\u03a2\u039e\3\2\2\2\u03a2\u039f\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\65\3\2\2\2\u03a4\u03a6\7R\2\2"+
		"\u03a5\u03a7\7\u019f\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\67\3\2\2\2\u03a8\u03aa\tr\2\2\u03a9\u03ab\7\u019f\2\2\u03aa\u03a9\3\2"+
		"\2\2\u03aa\u03ab\3\2\2\2\u03ab9\3\2\2\2\u03ac\u03ad\7\u0173\2\2\u03ad"+
		"\u03af\5F$\2\u03ae\u03b0\7\u019f\2\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3"+
		"\2\2\2\u03b0;\3\2\2\2\u03b1\u03b3\7\u01a0\2\2\u03b2\u03b4\5> \2\u03b3"+
		"\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\7\u01a0"+
		"\2\2\u03b6=\3\2\2\2\u03b7\u03ba\5B\"\2\u03b8\u03ba\7\u01a6\2\2\u03b9\u03b7"+
		"\3\2\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc?\3\2\2\2\u03bd\u03c2\5B\"\2\u03be\u03c2\7.\2\2\u03bf"+
		"\u03c2\7\u0148\2\2\u03c0\u03c2\7\u01a6\2\2\u03c1\u03bd\3\2\2\2\u03c1\u03be"+
		"\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4A\3\2\2\2\u03c5\u03ce\5D#\2\u03c6"+
		"\u03ce\5F$\2\u03c7\u03ce\5H%\2\u03c8\u03ce\7\u01a5\2\2\u03c9\u03ce\7\u01aa"+
		"\2\2\u03ca\u03ce\7\u019f\2\2\u03cb\u03ce\7\u0089\2\2\u03cc\u03ce\7\u014b"+
		"\2\2\u03cd\u03c5\3\2\2\2\u03cd\u03c6\3\2\2\2\u03cd\u03c7\3\2\2\2\u03cd"+
		"\u03c8\3\2\2\2\u03cd\u03c9\3\2\2\2\u03cd\u03ca\3\2\2\2\u03cd\u03cb\3\2"+
		"\2\2\u03cd\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0C\3\2\2\2\u03d1\u03d4\7\u01a3\2\2\u03d2\u03d4\5v<"+
		"\2\u03d3\u03d1\3\2\2\2\u03d3\u03d2\3\2\2\2\u03d4E\3\2\2\2\u03d5\u03d6"+
		"\ts\2\2\u03d6G\3\2\2\2\u03d7\u03d8\7\u01a4\2\2\u03d8I\3\2\2\2\u03d9\u03dc"+
		"\5L\'\2\u03da\u03dc\5N(\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dc"+
		"K\3\2\2\2\u03dd\u03e0\5P)\2\u03de\u03e0\5R*\2\u03df\u03dd\3\2\2\2\u03df"+
		"\u03de\3\2\2\2\u03e0M\3\2\2\2\u03e1\u03e9\5T+\2\u03e2\u03e9\5^\60\2\u03e3"+
		"\u03e9\5`\61\2\u03e4\u03e9\5b\62\2\u03e5\u03e9\5d\63\2\u03e6\u03e9\5f"+
		"\64\2\u03e7\u03e9\5h\65\2\u03e8\u03e1\3\2\2\2\u03e8\u03e2\3\2\2\2\u03e8"+
		"\u03e3\3\2\2\2\u03e8\u03e4\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e8\u03e6\3\2"+
		"\2\2\u03e8\u03e7\3\2\2\2\u03e9O\3\2\2\2\u03ea\u03eb\7\u019e\2\2\u03eb"+
		"\u03ed\tt\2\2\u03ec\u03ee\tu\2\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2"+
		"\2\u03eeQ\3\2\2\2\u03ef\u03f0\7\u019e\2\2\u03f0\u03f1\7\u01c5\2\2\u03f1"+
		"\u03f2\tv\2\2\u03f2S\3\2\2\2\u03f3\u03f4\7\u019e\2\2\u03f4\u03f5\7A\2"+
		"\2\u03f5\u03f7\7\u01a3\2\2\u03f6\u03f8\7\u01b7\2\2\u03f7\u03f6\3\2\2\2"+
		"\u03f7\u03f8\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03fc\5V,\2\u03fa\u03fc"+
		"\7\u01c6\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2"+
		"\2\u03fc\u03fe\3\2\2\2\u03fd\u03ff\7\u01cd\2\2\u03fe\u03fd\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ffU\3\2\2\2\u0400\u0405\5X-\2\u0401\u0405\5F$\2\u0402"+
		"\u0405\7\u01a3\2\2\u0403\u0405\7\u01ce\2\2\u0404\u0400\3\2\2\2\u0404\u0401"+
		"\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0403\3\2\2\2\u0405W\3\2\2\2\u0406"+
		"\u0408\7\u0089\2\2\u0407\u0406\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u0409\3\2\2\2\u040c"+
		"\u0423\5Z.\2\u040d\u040f\7\u0089\2\2\u040e\u040d\3\2\2\2\u040f\u0412\3"+
		"\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2\2\2\u0412"+
		"\u0410\3\2\2\2\u0413\u0417\5\\/\2\u0414\u0416\7\u0089\2\2\u0415\u0414"+
		"\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u041a\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041e\5Z.\2\u041b\u041d\7\u014b"+
		"\2\2\u041c\u041b\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0410\3\2"+
		"\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0429\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0428\7\u014b\2\2\u0427\u0426"+
		"\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"Y\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u042f\7\u01a3\2\2\u042d\u042f\5F$"+
		"\2\u042e\u042c\3\2\2\2\u042e\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0433"+
		"\5\\/\2\u0431\u0434\7\u01a3\2\2\u0432\u0434\5F$\2\u0433\u0431\3\2\2\2"+
		"\u0433\u0432\3\2\2\2\u0434[\3\2\2\2\u0435\u0436\tw\2\2\u0436]\3\2\2\2"+
		"\u0437\u0438\7\u019e\2\2\u0438\u0439\7\u01c4\2\2\u0439\u043a\5l\67\2\u043a"+
		"_\3\2\2\2\u043b\u043c\7\u019e\2\2\u043c\u043d\7\u01be\2\2\u043da\3\2\2"+
		"\2\u043e\u043f\7\u019e\2\2\u043f\u0440\7\u01c0\2\2\u0440c\3\2\2\2\u0441"+
		"\u0442\7\u019e\2\2\u0442\u0447\7\u01c2\2\2\u0443\u0448\7\u01d4\2\2\u0444"+
		"\u0448\5X-\2\u0445\u0448\7\u01a3\2\2\u0446\u0448\5F$\2\u0447\u0443\3\2"+
		"\2\2\u0447\u0444\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0446\3\2\2\2\u0448"+
		"e\3\2\2\2\u0449\u044a\7\u019e\2\2\u044a\u045a\7\u01d5\2\2\u044b\u0450"+
		"\5X-\2\u044c\u0450\7\u01a3\2\2\u044d\u0450\5F$\2\u044e\u0450\7\u01cc\2"+
		"\2\u044f\u044b\3\2\2\2\u044f\u044c\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u044e"+
		"\3\2\2\2\u0450\u0457\3\2\2\2\u0451\u0455\tx\2\2\u0452\u0456\5X-\2\u0453"+
		"\u0456\7\u01a3\2\2\u0454\u0456\5F$\2\u0455\u0452\3\2\2\2\u0455\u0453\3"+
		"\2\2\2\u0455\u0454\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0451\3\2\2\2\u0457"+
		"\u0458\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u045b\5l\67\2\u045a\u044f\3\2"+
		"\2\2\u045a\u0459\3\2\2\2\u045bg\3\2\2\2\u045c\u045d\7\u019e\2\2\u045d"+
		"\u045e\7\u01bf\2\2\u045ei\3\2\2\2\u045f\u0461\7\u01c8\2\2\u0460\u045f"+
		"\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\3\2\2\2\u0462\u0464\7\u01ca\2"+
		"\2\u0463\u0462\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0480\3\2\2\2\u0465\u0481"+
		"\7\u01c1\2\2\u0466\u0481\7\u01ae\2\2\u0467\u0481\7\u01b4\2\2\u0468\u0481"+
		"\7\u01b0\2\2\u0469\u046b\7\u01c3\2\2\u046a\u046c\7\u01d0\2\2\u046b\u046a"+
		"\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u0481\3\2\2\2\u046d\u0481\7\u01af\2"+
		"\2\u046e\u0470\7\u01c9\2\2\u046f\u0471\7\u01d0\2\2\u0470\u046f\3\2\2\2"+
		"\u0470\u0471\3\2\2\2\u0471\u0481\3\2\2\2\u0472\u0481\7\u01b6\2\2\u0473"+
		"\u0475\7\u01c9\2\2\u0474\u0476\7\u01d0\2\2\u0475\u0474\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\7\u01cb\2\2\u0478\u0481\7\u01c1"+
		"\2\2\u0479\u0481\7\u01b5\2\2\u047a\u047c\7\u01c3\2\2\u047b\u047d\7\u01d0"+
		"\2\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u047f\7\u01cb\2\2\u047f\u0481\7\u01c1\2\2\u0480\u0465\3\2\2\2\u0480\u0466"+
		"\3\2\2\2\u0480\u0467\3\2\2\2\u0480\u0468\3\2\2\2\u0480\u0469\3\2\2\2\u0480"+
		"\u046d\3\2\2\2\u0480\u046e\3\2\2\2\u0480\u0472\3\2\2\2\u0480\u0473\3\2"+
		"\2\2\u0480\u0479\3\2\2\2\u0480\u047a\3\2\2\2\u0481\u0483\3\2\2\2\u0482"+
		"\u0484\7\u01d3\2\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484k\3\2"+
		"\2\2\u0485\u0487\7\u0089\2\2\u0486\u0485\3\2\2\2\u0487\u048a\3\2\2\2\u0488"+
		"\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u0488\3\2"+
		"\2\2\u048b\u049c\5n8\2\u048c\u0490\ty\2\2\u048d\u048f\7\u0089\2\2\u048e"+
		"\u048d\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2"+
		"\2\2\u0491\u0493\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0497\5n8\2\u0494\u0496"+
		"\7\u014b\2\2\u0495\u0494\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2"+
		"\2\u0497\u0498\3\2\2\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u048c"+
		"\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u04a2\3\2\2\2\u049e\u049c\3\2\2\2\u049f\u04a1\7\u014b\2\2\u04a0\u049f"+
		"\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u0488\3\2\2\2\u04a6\u04a7\3\2"+
		"\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8m\3\2\2\2\u04a9\u04ad"+
		"\5r:\2\u04aa\u04ad\5p9\2\u04ab\u04ad\5t;\2\u04ac\u04a9\3\2\2\2\u04ac\u04aa"+
		"\3\2\2\2\u04ac\u04ab\3\2\2\2\u04ado\3\2\2\2\u04ae\u04b1\7\u01a3\2\2\u04af"+
		"\u04b1\5F$\2\u04b0\u04ae\3\2\2\2\u04b0\u04af\3\2\2\2\u04b1\u04b2\3\2\2"+
		"\2\u04b2\u04b5\5j\66\2\u04b3\u04b6\7\u01a3\2\2\u04b4\u04b6\5F$\2\u04b5"+
		"\u04b3\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b6q\3\2\2\2\u04b7\u04b8\7\u01a3"+
		"\2\2\u04b8s\3\2\2\2\u04b9\u04bb\7\u01a3\2\2\u04ba\u04bc\7\u01c8\2\2\u04bb"+
		"\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04bf\7\u01ca"+
		"\2\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c1\7\u01bb\2\2\u04c1u\3\2\2\2\u04c2\u04c3\tz\2\2\u04c3w\3\2\2\2\u008b"+
		"\u0087\u0089\u0093\u0097\u0099\u009f\u00a4\u00c6\u00d4\u00d7\u00dd\u00e0"+
		"\u00e7\u00fd\u0100\u0103\u0106\u011f\u0127\u012b\u013c\u0159\u0162\u016f"+
		"\u0175\u0186\u01d9\u01de\u01ed\u01fc\u0209\u020c\u020f\u0212\u0224\u022e"+
		"\u0233\u023c\u0247\u0257\u025f\u0268\u026d\u027a\u027f\u0295\u0297\u02a1"+
		"\u02a4\u02b5\u02bc\u02cc\u02da\u02e4\u02ed\u02f4\u02fb\u0302\u0309\u030d"+
		"\u0313\u031b\u031f\u0323\u0329\u0330\u0335\u033b\u033d\u0341\u0347\u034d"+
		"\u0352\u035c\u0365\u036c\u0373\u0377\u037c\u0380\u0386\u038b\u0391\u0396"+
		"\u039c\u03a2\u03a6\u03aa\u03af\u03b3\u03b9\u03bb\u03c1\u03c3\u03cd\u03cf"+
		"\u03d3\u03db\u03df\u03e8\u03ed\u03f7\u03fb\u03fe\u0404\u0409\u0410\u0417"+
		"\u041e\u0423\u0429\u042e\u0433\u0447\u044f\u0455\u0457\u045a\u0460\u0463"+
		"\u046b\u0470\u0475\u047c\u0480\u0483\u0488\u0490\u0497\u049c\u04a2\u04a7"+
		"\u04ac\u04b0\u04b5\u04bb\u04be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}