// Generated from src/DB2zSQLParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DB2zSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, OPENSQBRACKET=3, CLOSESQBRACKET=4, QUESTIONMARK=5, 
		EQ=6, GT=7, LT=8, GE=9, LE=10, NE=11, PLUS=12, MINUS=13, SPLAT=14, SLASH=15, 
		CONCATOP=16, DOT=17, COLON=18, SEMICOLON=19, COMMA=20, NONNUMERICLITERAL=21, 
		INTEGERLITERAL=22, NUMERICLITERAL=23, NEWLINE=24, WS=25, SQLCOMMENT=26, 
		SQLBLOCKCOMMENTBEGIN=27, SQLBLOCKCOMMENTEND=28, ADD=29, AFTER=30, ALL=31, 
		ALLOCATE=32, ALLOW=33, ALTER=34, ALTERAND=35, ANY=36, ARRAY=37, ARRAY_EXISTS=38, 
		AS=39, ASENSITIVE=40, ASSOCIATE=41, ASUTIME=42, AT=43, AUDIT=44, AUX=45, 
		AUXILIARY=46, BEFORE=47, BEGIN=48, BETWEEN=49, BUFFERPOOL=50, BY=51, CALL=52, 
		CAPTURE=53, CASCADED=54, CASE=55, CAST=56, CCSID=57, CHAR=58, CHARACTER=59, 
		CHECK=60, CLONE=61, CLOSE=62, CLUSTER=63, COLLECTION=64, COLLID=65, COLUMN=66, 
		COMMENT=67, COMMIT=68, CONCAT=69, CONDITION=70, CONNECT=71, CONNECTION=72, 
		CONSTRAINT=73, CONTAINS=74, CONTENT=75, CONTINUE=76, CREATE=77, CUBE=78, 
		CURRENT=79, CURRENT_LC_CTYPE=80, CURRVAL=81, CURSOR=82, DATA=83, DATABASE=84, 
		DAY=85, DAYS=86, DBINFO=87, DECLARE=88, DEFAULT=89, DELETE=90, DESCRIPTOR=91, 
		DETERMINISTIC=92, DISABLE=93, DISALLOW=94, DISTINCT=95, DO=96, DOCUMENT=97, 
		DOUBLE=98, DROP=99, DSSIZE=100, DYNAMIC=101, EDITPROC=102, ELSE=103, ELSEIF=104, 
		ENCODING=105, ENCRYPTION=106, END=107, END_EXEC=108, ENDING=109, ERASE=110, 
		ESCAPE=111, EXCEPT=112, EXCEPTION=113, EXEC_SQL=114, EXECUTE=115, EXISTS=116, 
		EXIT=117, EXPLAIN=118, EXTERNAL=119, FENCED=120, FETCH=121, FIELDPROC=122, 
		FINAL=123, FIRST=124, FOR=125, FREE=126, FROM=127, FULL=128, FUNCTION=129, 
		GENERATED=130, GET=131, GLOBAL=132, GO=133, GOTO=134, GRANT=135, GROUP=136, 
		HANDLER=137, HAVING=138, HOLD=139, HOUR=140, HOURS=141, IF=142, IMMEDIATE=143, 
		IN=144, INCLUSIVE=145, INDEX=146, INDEXBP=147, INHERIT=148, INNER=149, 
		INOUT=150, INSENSITIVE=151, INSERT=152, INTERSECT=153, INTO=154, IS=155, 
		ISOBID=156, ITERATE=157, JAR=158, JOIN=159, KEEP=160, KEY=161, LABEL=162, 
		LANGUAGE=163, LAST=164, LC_CTYPE=165, LEAVE=166, LEFT=167, LIKE=168, LIMIT=169, 
		LOCAL=170, LOCALE=171, LOCATOR=172, LOCATORS=173, LOCK=174, LOCKMAX=175, 
		LOCKSIZE=176, LONG=177, LOOP=178, MAINTAINED=179, MATERIALIZED=180, MICROSECOND=181, 
		MICROSECONDS=182, MINUTEMINUTES=183, MODIFIES=184, MONTH=185, MONTHS=186, 
		NEXT=187, NEXTVAL=188, NO=189, NONE=190, NOT=191, NULL=192, NULLS=193, 
		NUMPARTS=194, OBID=195, OF=196, OFFSET=197, OLD=198, ON=199, OPEN=200, 
		OPTIMIZATION=201, OPTIMIZE=202, OR=203, ORDER=204, ORGANIZATION=205, OUT=206, 
		OUTER=207, PACKAGE=208, PADDED=209, PARAMETER=210, PART=211, PARTITION=212, 
		PARTITIONED=213, PARTITIONING=214, PATH=215, PERIOD=216, PIECESIZE=217, 
		PLAN=218, PRECISION=219, PREPARE=220, PREVVAL=221, PRIOR=222, PRIQTY=223, 
		PRIVILEGES=224, PROCEDURE=225, PROGRAM=226, PSID=227, PUBLIC=228, QUERY=229, 
		QUERYNO=230, READS=231, REFERENCES=232, REFRESH=233, RELEASE=234, RENAME=235, 
		REPEAT=236, RESIGNAL=237, RESTRICT=238, RESULT=239, RESULT_SET_LOCATOR=240, 
		RETURN=241, RETURNS=242, REVOKE=243, RIGHT=244, ROLE=245, ROLLBACK=246, 
		ROLLUP=247, ROUND_CEILING=248, ROUND_DOWN=249, ROUND_FLOOR=250, ROUND_HALF_DOWN=251, 
		ROUND_HALF_EVEN=252, ROUND_HALF_UP=253, ROUND_UP=254, ROW=255, ROWSET=256, 
		RUN=257, SAVEPOINT=258, SCHEMA=259, SCRATCHPAD=260, SECOND=261, SECONDS=262, 
		SECQTY=263, SECURITY=264, SELECT=265, SENSITIVE=266, SEQUENCE=267, SET=268, 
		SIGNAL=269, SIMPLE=270, SOME=271, SOURCE=272, SPECIFIC=273, STANDARD=274, 
		STATEMENT=275, STATIC=276, STAY=277, STOGROUP=278, STORES=279, STYLE=280, 
		SUMMARY=281, SYNONYM=282, SYSDATE=283, SYSTEM=284, SYSTIMESTAMP=285, TABLE=286, 
		TABLESPACE=287, THEN=288, TO=289, TRIGGER=290, TRUNCATE=291, TYPE=292, 
		UNDO=293, UNION=294, UNIQUE=295, UNTIL=296, UPDATE=297, USING=298, VALIDPROC=299, 
		VALUE=300, VALUES=301, VARIABLE=302, VARIANT=303, VCAT=304, VERSIONING=305, 
		VIEW=306, VOLATILE=307, VOLUMES=308, WHEN=309, WHENEVER=310, WHERE=311, 
		WHILE=312, WITH=313, WLM=314, XMLCAST=315, XMLEXISTS=316, XMLNAMESPACES=317, 
		YEAR=318, YEARS=319, ZONE=320, AND=321, ARRAY_AGG=322, ASC=323, AVG=324, 
		BIT=325, CHANGE=326, CODEUNITS16=327, CODEUNITS32=328, CORR=329, CORRELATION=330, 
		COUNT=331, COUNT_BIG=332, COVAR=333, COVARIANCE=334, COVARIANCE_SAMP=335, 
		COVAR_POP=336, COVAR_SAMP=337, CS=338, CUME_DIST=339, DENSE_RANK=340, 
		DESC=341, EBCDIC=342, EXCLUSIVE=343, FIRST_VALUE=344, FOLLOWING=345, GROUPING=346, 
		IGNORE=347, INDICATOR=348, INPUT=349, ISNULL=350, LAG=351, LARGE=352, 
		LAST_VALUE=353, LEAD=354, LISTAGG=355, LOCKED=356, LOCKS=357, MEDIAN=358, 
		MINUTES=359, MIXED=360, NOTNULL=361, NTH_VALUE=362, NTILE=363, NUMERIC=364, 
		OBJECT=365, OCTETS=366, ONLY=367, OVER=368, PASSING=369, PERCENTILE_CONT=370, 
		PERCENTILE_DISC=371, PERCENT_RANK=372, PRECEDING=373, PREVIOUS=374, RANGE=375, 
		RANK=376, RATIO_TO_REPORT=377, READ=378, REF=379, REGR_AVGX=380, REGR_AVGY=381, 
		REGR_COUNT=382, REGR_ICPT=383, REGR_INTERCEPT=384, REGR_R2=385, REGR_SLOPE=386, 
		REGR_SXX=387, REGR_SXY=388, REGR_SYY=389, RESPECT=390, ROW_NUMBER=391, 
		ROWS=392, RR=393, RS=394, SBCS=395, SELECTIVITY=396, SETS=397, SHARE=398, 
		SKIP_=399, STDDEV=400, STDDEV_POP=401, STDDEV_SAMP=402, SUM=403, TOKEN=404, 
		UNBOUNDED=405, UNPACK=406, UR=407, USE=408, VAR=409, VARIANCE=410, VARIANCE_SAMP=411, 
		VAR_POP=412, VAR_SAMP=413, VARYING=414, WITHOUT=415, XML=416, XMLAGG=417, 
		COLUMNS=418, SQLID=419, ORDINALITY=420, SYSTEM_TIME=421, BUSINESS_TIME=422, 
		MULTIPLIER=423, UNNEST=424, CROSS=425, CALLER=426, CLIENT=427, POSITIONING=428, 
		SCROLL=429, ACTION=430, ASSEMBLE=431, C_=432, CALLED=433, COBOL=434, DB2=435, 
		DEFINER=436, DISPATCH=437, ENVIRONMENT=438, FAILURE=439, FAILURES=440, 
		JAVA=441, MAIN=442, NAME=443, OPTIONS=444, PARALLEL=445, PLI=446, REGISTERS=447, 
		RESIDENT=448, SECURED=449, SPECIAL=450, SQL=451, STOP=452, SUB=453, YES=454, 
		APPLICATION=455, CHANGED=456, COMPATIBILITY=457, COMPRESS=458, COPY=459, 
		FREEPAGE=460, GBPCACHE=461, INCLUDE=462, MAXVALUE=463, MINVALUE=464, PCTFREE=465, 
		REGENERATE=466, SEQTY=467, MASK=468, ENABLE=469, PERMISSION=470, ATOMIC=471, 
		SQLEXCEPTION=472, MERGE=473, MATCHED=474, SQLSTATE=475, MESSAGE_TEXT=476, 
		OVERRIDING=477, PORTION=478, DB2SQL=479, DEBUG=480, GENERAL=481, MODE_=482, 
		REXX=483, ABS=484, ABSVAL=485, ACOS=486, ADD_DAYS=487, ADD_MONTHS=488, 
		ARRAY_DELETE=489, ARRAY_FIRST=490, ARRAY_LAST=491, ARRAY_NEXT=492, ARRAY_PRIOR=493, 
		ARRAY_TRIM=494, ASCII=495, ASCII_CHR=496, ASCIISTR=497, ASCII_STR=498, 
		ASIN=499, ATAN=500, ATAN2=501, ATANH=502, BIGINT=503, BINARY=504, BITAND=505, 
		BITANDNOT=506, BITNOT=507, BITOR=508, BITXOR=509, BLOB=510, BTRIM=511, 
		CARDINALITY=512, CCSID_ENCODING=513, CEIL=514, CEILING=515, CHAR9=516, 
		CHARACTER_LENGTH=517, CHAR_LENGTH=518, CHR=519, CLOB=520, COALESCE=521, 
		COLLATION_KEY=522, COMPARE_DECFLOAT=523, COS=524, COSH=525, DATE=526, 
		DAYOFMONTH=527, DAYOFWEEK=528, DAYOFWEEK_ISO=529, DAYOFYEAR=530, DAYS_BETWEEN=531, 
		DBCLOB=532, DEC=533, DECFLOAT=534, DECFLOAT_FORMAT=535, DECFLOAT_SORTKEY=536, 
		DECIMAL=537, DECODE=538, DECRYPT_BINARY=539, DECRYPT_BIT=540, DECRYPT_CHAR=541, 
		DECRYPT_DATAKEY_BIGINT=542, DECRYPT_DATAKEY_BIT=543, DECRYPT_DATAKEY_CLOB=544, 
		DECRYPT_DATAKEY_DBCLOB=545, DECRYPT_DATAKEY_DECIMAL=546, DECRYPT_DATAKEY_INTEGER=547, 
		DECRYPT_DATAKEY_VARCHAR=548, DECRYPT_DATAKEY_VARGRAPHIC=549, DECRYPT_DB=550, 
		DEGREES=551, DIFFERENCE=552, DIGITS=553, DOUBLE_PRECISION=554, DSN_XMLVALIDATE=555, 
		EBCDIC_CHR=556, EBCDIC_STR=557, ENCRYPT_DATAKEY=558, ENCRYPT_TDES=559, 
		EXP=560, EXTRACT=561, FLOAT=562, FLOOR=563, GENERATE_UNIQUE=564, GENERATE_UNIQUE_BINARY=565, 
		GETHINT=566, GETVARIABLE=567, GRAPHIC=568, GREATEST=569, HASH=570, HASH_CRC32=571, 
		HASH_MD5=572, HASH_SHA1=573, HASH_SHA256=574, HEX=575, IDENTITY_VAL_LOCAL=576, 
		IFNULL=577, INSTR=578, INT=579, INTEGER=580, JULIAN_DAY=581, LAST_DAY=582, 
		LCASE=583, LEAST=584, LENGTH=585, LN=586, LOCATE=587, LOCATE_IN_STRING=588, 
		LOG10=589, LOWER=590, LPAD=591, LTRIM=592, MAX=593, MAX_CARDINALITY=594, 
		MIDNIGHT_SECONDS=595, MIN=596, MINUTE=597, MOD=598, MONTHS_BETWEEN=599, 
		MQREAD=600, MQREADCLOB=601, MQRECEIVE=602, MQRECEIVECLOB=603, MQSEND=604, 
		MULTIPLY_ALT=605, NEXT_DAY=606, NEXT_MONTH=607, NORMALIZE_DECFLOAT=608, 
		NORMALIZE_STRING=609, NULLIF=610, NVL=611, OVERLAY=612, PACK=613, POSITION=614, 
		POSSTR=615, POW=616, POWER=617, QUANTIZE=618, QUARTER=619, RADIANS=620, 
		RAISE_ERROR=621, RAND=622, RANDOM=623, REAL=624, REGEXP_COUNT=625, REGEXP_INSTR=626, 
		REGEXP_LIKE=627, REGEXP_REPLACE=628, REGEXP_SUBSTR=629, REPLACE=630, RID=631, 
		ROUND=632, ROUND_TIMESTAMP=633, ROWID=634, RPAD=635, RTRIM=636, SCORE=637, 
		SIGN=638, SIN=639, SINH=640, SMALLINT=641, SOAPHTTPC=642, SOAPHTTPNC=643, 
		SOAPHTTPNV=644, SOAPHTTPV=645, SOUNDEX=646, SPACE=647, SQRT=648, STRIP=649, 
		STRLEFT=650, STRPOS=651, STRRIGHT=652, SUBSTR=653, SUBSTRING=654, TAN=655, 
		TANH=656, TIME=657, TIMESTAMP=658, TIMESTAMPADD=659, TIMESTAMPDIFF=660, 
		TIMESTAMP_FORMAT=661, TIMESTAMP_ISO=662, TIMESTAMP_TZ=663, TO_CHAR=664, 
		TO_CLOB=665, TO_DATE=666, TO_NUMBER=667, TOTALORDER=668, TO_TIMESTAMP=669, 
		TRANSLATE=670, TRIM=671, TRIM_ARRAY=672, TRUNC=673, TRUNC_TIMESTAMP=674, 
		UCASE=675, UNICODE=676, UNICODE_STR=677, UNISTR=678, UPPER=679, VARBINARY=680, 
		VARCHAR=681, VARCHAR9=682, VARCHAR_BIT_FORMAT=683, VARCHAR_FORMAT=684, 
		VARGRAPHIC=685, VERIFY_GROUP_FOR_USER=686, VERIFY_ROLE_FOR_USER=687, VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER=688, 
		WEEK=689, WEEK_ISO=690, WRAP=691, XMLATTRIBUTES=692, XMLCOMMENT=693, XMLCONCAT=694, 
		XMLDOCUMENT=695, XMLELEMENT=696, XMLFOREST=697, XMLMODIFY=698, XMLPARSE=699, 
		XMLPI=700, XMLQUERY=701, XMLSERIALIZE=702, XMLTEXT=703, XMLXSROBJECTID=704, 
		XSLTRANSFORM=705, CURRENT_ACCELERATOR=706, CURRENT_APPLICATION_COMPATIBILITY=707, 
		CURRENT_APPLICATION_ENCODING_SCHEME=708, CURRENT_CLIENT_ACCTNG=709, CURRENT_CLIENT_APPLNAME=710, 
		CURRENT_CLIENT_CORR_TOKEN=711, CURRENT_CLIENT_USERID=712, CURRENT_CLIENT_WRKSTNNAME=713, 
		CURRENT_DATE=714, CURRENT_DEBUG_MODE=715, CURRENT_DECFLOAT_ROUNDING_MODE=716, 
		CURRENT_DEGREE=717, CURRENT_EXPLAIN_MODE=718, CURRENT_GET_ACCEL_ARCHIVE=719, 
		CURRENT_LOCALE_LC_CTYPE=720, CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION=721, 
		CURRENT_MEMBER=722, CURRENT_OPTIMIZATION_HINT=723, CURRENT_PACKAGE_PATH=724, 
		CURRENT_PACKAGESET=725, CURRENT_PATH=726, CURRENT_PRECISION=727, CURRENT_QUERY_ACCELERATION=728, 
		CURRENT_QUERY_ACCELERATION_WAITFORDATA=729, CURRENT_REFRESH_AGE=730, CURRENT_ROUTINE_VERSION=731, 
		CURRENT_RULES=732, CURRENT_SCHEMA=733, CURRENT_SERVER=734, CURRENT_SQLID=735, 
		CURRENT_TEMPORAL_BUSINESS_TIME=736, CURRENT_TEMPORAL_SYSTEM_TIME=737, 
		CURRENT_TIME=738, CURRENT_TIMESTAMP=739, CURRENT_TIME_ZONE=740, ENCRYPTION_PASSWORD=741, 
		SESSION_TIME_ZONE=742, SESSION_USER=743, USER=744, ADMIN_TASK_LIST=745, 
		ADMIN_TASK_OUTPUT=746, ADMIN_TASK_STATUS=747, BLOCKING_THREADS=748, MQREADALL=749, 
		MQREADALLCLOB=750, MQRECEIVEALL=751, MQRECEIVEALLCLOB=752, XMLTABLE=753, 
		SQLIDENTIFIER=754;
	public static final int
		RULE_startRule = 0, RULE_sqlStatement = 1, RULE_query = 2, RULE_declareCursorStatement = 3, 
		RULE_cursorName = 4, RULE_statementName = 5, RULE_holdability = 6, RULE_returnability = 7, 
		RULE_rowsetPositioning = 8, RULE_declareTableStatement = 9, RULE_notNullPhrase = 10, 
		RULE_declareStatementStatement = 11, RULE_allocateCursorStatement = 12, 
		RULE_rsLocatorVariable = 13, RULE_alterDatabaseStatement = 14, RULE_alterFunctionStatement = 15, 
		RULE_alterIndexStatement = 16, RULE_alterMaskStatement = 17, RULE_alterPermissionStatement = 18, 
		RULE_alterProcedureStatement = 19, RULE_searchedDelete = 20, RULE_positionedDelete = 21, 
		RULE_deleteStatement = 22, RULE_insertStatement = 23, RULE_mergeStatement = 24, 
		RULE_searchedUpdate = 25, RULE_positionedUpdate = 26, RULE_updateStatement = 27, 
		RULE_sourceValues = 28, RULE_valuesSingleRow = 29, RULE_valuesMultipleRow = 30, 
		RULE_matchingCondition = 31, RULE_modificationOperation = 32, RULE_assignmentClause = 33, 
		RULE_updateOperation = 34, RULE_deleteOperation = 35, RULE_insertOperation = 36, 
		RULE_signalStatement = 37, RULE_signalInformation = 38, RULE_valuesList1 = 39, 
		RULE_valuesList2 = 40, RULE_valuesList3 = 41, RULE_valuesList4 = 42, RULE_includeColumns = 43, 
		RULE_multipleRowInsert = 44, RULE_regenerateClause = 45, RULE_alterIndexOptions = 46, 
		RULE_alterIndexPartitionOptions = 47, RULE_usingSpecification = 48, RULE_freeSpecification = 49, 
		RULE_gbpcacheSpecification = 50, RULE_partitionElement = 51, RULE_applCompatValue = 52, 
		RULE_functionLevel = 53, RULE_parameterType = 54, RULE_functionOptionList = 55, 
		RULE_procedureOptionList = 56, RULE_externalProgramName = 57, RULE_packagePath = 58, 
		RULE_collectionID = 59, RULE_runTimeOptions = 60, RULE_comparisonOperator = 61, 
		RULE_operator = 62, RULE_expression = 63, RULE_rowChangeExpression = 64, 
		RULE_sequenceReference = 65, RULE_functionInvocation = 66, RULE_scalarFunctionInvocation = 67, 
		RULE_aggregateFunctionInvocation = 68, RULE_regressionFunctionInvocation = 69, 
		RULE_externalFunctionInvocation = 70, RULE_labeledDuration = 71, RULE_xmlCastSpecification = 72, 
		RULE_arrayElementSpecification = 73, RULE_arrayIndex = 74, RULE_arrayConstructor = 75, 
		RULE_olapSpecification = 76, RULE_orderedOlapSpecification = 77, RULE_olapSpecificationFunction = 78, 
		RULE_lagFunction = 79, RULE_leadFunction = 80, RULE_respectNullsClause = 81, 
		RULE_windowPartitionClause = 82, RULE_windowOrderClause = 83, RULE_windowOrderClauseQualifier = 84, 
		RULE_numberingSpecification = 85, RULE_aggregationSpecification = 86, 
		RULE_aggregateFunction = 87, RULE_regressionFunction = 88, RULE_olapColumnFunction = 89, 
		RULE_firstValueFunction = 90, RULE_lastValueFunction = 91, RULE_nthValueFunction = 92, 
		RULE_ratioToReportFunction = 93, RULE_windowAggregationGroupClause = 94, 
		RULE_groupStart = 95, RULE_groupBetween = 96, RULE_groupEnd = 97, RULE_groupBound1 = 98, 
		RULE_groupBound2 = 99, RULE_unboundedPreceding = 100, RULE_unboundedFollowing = 101, 
		RULE_boundedPreceding = 102, RULE_boundedFollowing = 103, RULE_currentRow = 104, 
		RULE_scalarFunction = 105, RULE_tableFunction = 106, RULE_specialRegister = 107, 
		RULE_xmltableFunctionSpecification = 108, RULE_rowXqueryExpressionConstant = 109, 
		RULE_rowXqueryArgument = 110, RULE_xqueryContextItemExpression = 111, 
		RULE_xqueryVariableExpression = 112, RULE_xmlTableRegularColumnDefinition = 113, 
		RULE_defaultClause = 114, RULE_defaultClauseAllowables = 115, RULE_distinctTypeCastFunctionName = 116, 
		RULE_columnXqueryExpressionConstant = 117, RULE_xmlTableOrdinalityColumnDefinition = 118, 
		RULE_xmlnamespacesDeclaration = 119, RULE_xmlnamespacesFunctionSpecification = 120, 
		RULE_xmlnamespacesFunctionArguments = 121, RULE_namespaceUri = 122, RULE_namespacePrefix = 123, 
		RULE_timeZoneSpecificExpression = 124, RULE_timeZoneExpressionSubset = 125, 
		RULE_caseExpression = 126, RULE_resultExpression = 127, RULE_searchedWhenClause = 128, 
		RULE_simpleWhenClause = 129, RULE_searchCondition = 130, RULE_predicate = 131, 
		RULE_basicPredicate = 132, RULE_rowValueExpression = 133, RULE_quantifiedPredicate = 134, 
		RULE_arrayExistsPredicate = 135, RULE_betweenPredicate = 136, RULE_distinctPredicate = 137, 
		RULE_existsPredicate = 138, RULE_inPredicate = 139, RULE_likePredicate = 140, 
		RULE_nullPredicate = 141, RULE_xmlExistsPredicate = 142, RULE_arrayExpression = 143, 
		RULE_castSpecification = 144, RULE_parameterMarker = 145, RULE_dataType = 146, 
		RULE_builtInType = 147, RULE_integerInParens = 148, RULE_length = 149, 
		RULE_ccsidQualifier = 150, RULE_forDataQualfier = 151, RULE_distinctTypeName = 152, 
		RULE_arrayType = 153, RULE_literal = 154, RULE_ccsidValue = 155, RULE_columnName = 156, 
		RULE_newColumnName = 157, RULE_correlationName = 158, RULE_locationName = 159, 
		RULE_schemaName = 160, RULE_tableName = 161, RULE_indexName = 162, RULE_maskName = 163, 
		RULE_permissionName = 164, RULE_procedureName = 165, RULE_databaseName = 166, 
		RULE_catalogName = 167, RULE_bpName = 168, RULE_stogroupName = 169, RULE_functionName = 170, 
		RULE_specificName = 171, RULE_hostVariable = 172, RULE_hostIdentifier = 173, 
		RULE_hostStructure = 174, RULE_variable = 175, RULE_intoClause = 176, 
		RULE_correlationClause = 177, RULE_fromClause = 178, RULE_tableReference = 179, 
		RULE_singleTableReference = 180, RULE_periodSpecification = 181, RULE_periodClause = 182, 
		RULE_nestedTableExpression = 183, RULE_dataChangeTableReference = 184, 
		RULE_tableFunctionReference = 185, RULE_tableUdfCardinalityClause = 186, 
		RULE_typedCorrelationClause = 187, RULE_tableLocatorReference = 188, RULE_xmltableExpression = 189, 
		RULE_collectionDerivedTable = 190, RULE_joinCondition = 191, RULE_fullJoinExpression = 192, 
		RULE_castFunction = 193, RULE_ordinaryArrayExpression = 194, RULE_associativeArrayExpression = 195, 
		RULE_comparison = 196, RULE_whereClause = 197, RULE_groupByClause = 198, 
		RULE_havingClause = 199, RULE_groupingExpression = 200, RULE_groupingSets = 201, 
		RULE_groupingSetsGroup = 202, RULE_superGroups = 203, RULE_selectColumns = 204, 
		RULE_unpackedRow = 205, RULE_selectClause = 206, RULE_subSelect = 207, 
		RULE_selectIntoStatement = 208, RULE_selectStatement = 209, RULE_commonTableExpression = 210, 
		RULE_updateClause = 211, RULE_readOnlyClause = 212, RULE_optimizeClause = 213, 
		RULE_isolationClause = 214, RULE_lockClause = 215, RULE_skipLockedDataClause = 216, 
		RULE_querynoClause = 217, RULE_scalarFullSelect = 218, RULE_fullSelect = 219, 
		RULE_valuesClause = 220, RULE_orderByClause = 221, RULE_sortKey = 222, 
		RULE_offsetClause = 223, RULE_fetchClause = 224, RULE_identifier = 225, 
		RULE_sqlKeyword = 226;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "sqlStatement", "query", "declareCursorStatement", "cursorName", 
			"statementName", "holdability", "returnability", "rowsetPositioning", 
			"declareTableStatement", "notNullPhrase", "declareStatementStatement", 
			"allocateCursorStatement", "rsLocatorVariable", "alterDatabaseStatement", 
			"alterFunctionStatement", "alterIndexStatement", "alterMaskStatement", 
			"alterPermissionStatement", "alterProcedureStatement", "searchedDelete", 
			"positionedDelete", "deleteStatement", "insertStatement", "mergeStatement", 
			"searchedUpdate", "positionedUpdate", "updateStatement", "sourceValues", 
			"valuesSingleRow", "valuesMultipleRow", "matchingCondition", "modificationOperation", 
			"assignmentClause", "updateOperation", "deleteOperation", "insertOperation", 
			"signalStatement", "signalInformation", "valuesList1", "valuesList2", 
			"valuesList3", "valuesList4", "includeColumns", "multipleRowInsert", 
			"regenerateClause", "alterIndexOptions", "alterIndexPartitionOptions", 
			"usingSpecification", "freeSpecification", "gbpcacheSpecification", "partitionElement", 
			"applCompatValue", "functionLevel", "parameterType", "functionOptionList", 
			"procedureOptionList", "externalProgramName", "packagePath", "collectionID", 
			"runTimeOptions", "comparisonOperator", "operator", "expression", "rowChangeExpression", 
			"sequenceReference", "functionInvocation", "scalarFunctionInvocation", 
			"aggregateFunctionInvocation", "regressionFunctionInvocation", "externalFunctionInvocation", 
			"labeledDuration", "xmlCastSpecification", "arrayElementSpecification", 
			"arrayIndex", "arrayConstructor", "olapSpecification", "orderedOlapSpecification", 
			"olapSpecificationFunction", "lagFunction", "leadFunction", "respectNullsClause", 
			"windowPartitionClause", "windowOrderClause", "windowOrderClauseQualifier", 
			"numberingSpecification", "aggregationSpecification", "aggregateFunction", 
			"regressionFunction", "olapColumnFunction", "firstValueFunction", "lastValueFunction", 
			"nthValueFunction", "ratioToReportFunction", "windowAggregationGroupClause", 
			"groupStart", "groupBetween", "groupEnd", "groupBound1", "groupBound2", 
			"unboundedPreceding", "unboundedFollowing", "boundedPreceding", "boundedFollowing", 
			"currentRow", "scalarFunction", "tableFunction", "specialRegister", "xmltableFunctionSpecification", 
			"rowXqueryExpressionConstant", "rowXqueryArgument", "xqueryContextItemExpression", 
			"xqueryVariableExpression", "xmlTableRegularColumnDefinition", "defaultClause", 
			"defaultClauseAllowables", "distinctTypeCastFunctionName", "columnXqueryExpressionConstant", 
			"xmlTableOrdinalityColumnDefinition", "xmlnamespacesDeclaration", "xmlnamespacesFunctionSpecification", 
			"xmlnamespacesFunctionArguments", "namespaceUri", "namespacePrefix", 
			"timeZoneSpecificExpression", "timeZoneExpressionSubset", "caseExpression", 
			"resultExpression", "searchedWhenClause", "simpleWhenClause", "searchCondition", 
			"predicate", "basicPredicate", "rowValueExpression", "quantifiedPredicate", 
			"arrayExistsPredicate", "betweenPredicate", "distinctPredicate", "existsPredicate", 
			"inPredicate", "likePredicate", "nullPredicate", "xmlExistsPredicate", 
			"arrayExpression", "castSpecification", "parameterMarker", "dataType", 
			"builtInType", "integerInParens", "length", "ccsidQualifier", "forDataQualfier", 
			"distinctTypeName", "arrayType", "literal", "ccsidValue", "columnName", 
			"newColumnName", "correlationName", "locationName", "schemaName", "tableName", 
			"indexName", "maskName", "permissionName", "procedureName", "databaseName", 
			"catalogName", "bpName", "stogroupName", "functionName", "specificName", 
			"hostVariable", "hostIdentifier", "hostStructure", "variable", "intoClause", 
			"correlationClause", "fromClause", "tableReference", "singleTableReference", 
			"periodSpecification", "periodClause", "nestedTableExpression", "dataChangeTableReference", 
			"tableFunctionReference", "tableUdfCardinalityClause", "typedCorrelationClause", 
			"tableLocatorReference", "xmltableExpression", "collectionDerivedTable", 
			"joinCondition", "fullJoinExpression", "castFunction", "ordinaryArrayExpression", 
			"associativeArrayExpression", "comparison", "whereClause", "groupByClause", 
			"havingClause", "groupingExpression", "groupingSets", "groupingSetsGroup", 
			"superGroups", "selectColumns", "unpackedRow", "selectClause", "subSelect", 
			"selectIntoStatement", "selectStatement", "commonTableExpression", "updateClause", 
			"readOnlyClause", "optimizeClause", "isolationClause", "lockClause", 
			"skipLockedDataClause", "querynoClause", "scalarFullSelect", "fullSelect", 
			"valuesClause", "orderByClause", "sortKey", "offsetClause", "fetchClause", 
			"identifier", "sqlKeyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'?'", "'='", "'>'", "'<'", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'||'", "'.'", "':'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "OPENSQBRACKET", "CLOSESQBRACKET", "QUESTIONMARK", 
			"EQ", "GT", "LT", "GE", "LE", "NE", "PLUS", "MINUS", "SPLAT", "SLASH", 
			"CONCATOP", "DOT", "COLON", "SEMICOLON", "COMMA", "NONNUMERICLITERAL", 
			"INTEGERLITERAL", "NUMERICLITERAL", "NEWLINE", "WS", "SQLCOMMENT", "SQLBLOCKCOMMENTBEGIN", 
			"SQLBLOCKCOMMENTEND", "ADD", "AFTER", "ALL", "ALLOCATE", "ALLOW", "ALTER", 
			"ALTERAND", "ANY", "ARRAY", "ARRAY_EXISTS", "AS", "ASENSITIVE", "ASSOCIATE", 
			"ASUTIME", "AT", "AUDIT", "AUX", "AUXILIARY", "BEFORE", "BEGIN", "BETWEEN", 
			"BUFFERPOOL", "BY", "CALL", "CAPTURE", "CASCADED", "CASE", "CAST", "CCSID", 
			"CHAR", "CHARACTER", "CHECK", "CLONE", "CLOSE", "CLUSTER", "COLLECTION", 
			"COLLID", "COLUMN", "COMMENT", "COMMIT", "CONCAT", "CONDITION", "CONNECT", 
			"CONNECTION", "CONSTRAINT", "CONTAINS", "CONTENT", "CONTINUE", "CREATE", 
			"CUBE", "CURRENT", "CURRENT_LC_CTYPE", "CURRVAL", "CURSOR", "DATA", "DATABASE", 
			"DAY", "DAYS", "DBINFO", "DECLARE", "DEFAULT", "DELETE", "DESCRIPTOR", 
			"DETERMINISTIC", "DISABLE", "DISALLOW", "DISTINCT", "DO", "DOCUMENT", 
			"DOUBLE", "DROP", "DSSIZE", "DYNAMIC", "EDITPROC", "ELSE", "ELSEIF", 
			"ENCODING", "ENCRYPTION", "END", "END_EXEC", "ENDING", "ERASE", "ESCAPE", 
			"EXCEPT", "EXCEPTION", "EXEC_SQL", "EXECUTE", "EXISTS", "EXIT", "EXPLAIN", 
			"EXTERNAL", "FENCED", "FETCH", "FIELDPROC", "FINAL", "FIRST", "FOR", 
			"FREE", "FROM", "FULL", "FUNCTION", "GENERATED", "GET", "GLOBAL", "GO", 
			"GOTO", "GRANT", "GROUP", "HANDLER", "HAVING", "HOLD", "HOUR", "HOURS", 
			"IF", "IMMEDIATE", "IN", "INCLUSIVE", "INDEX", "INDEXBP", "INHERIT", 
			"INNER", "INOUT", "INSENSITIVE", "INSERT", "INTERSECT", "INTO", "IS", 
			"ISOBID", "ITERATE", "JAR", "JOIN", "KEEP", "KEY", "LABEL", "LANGUAGE", 
			"LAST", "LC_CTYPE", "LEAVE", "LEFT", "LIKE", "LIMIT", "LOCAL", "LOCALE", 
			"LOCATOR", "LOCATORS", "LOCK", "LOCKMAX", "LOCKSIZE", "LONG", "LOOP", 
			"MAINTAINED", "MATERIALIZED", "MICROSECOND", "MICROSECONDS", "MINUTEMINUTES", 
			"MODIFIES", "MONTH", "MONTHS", "NEXT", "NEXTVAL", "NO", "NONE", "NOT", 
			"NULL", "NULLS", "NUMPARTS", "OBID", "OF", "OFFSET", "OLD", "ON", "OPEN", 
			"OPTIMIZATION", "OPTIMIZE", "OR", "ORDER", "ORGANIZATION", "OUT", "OUTER", 
			"PACKAGE", "PADDED", "PARAMETER", "PART", "PARTITION", "PARTITIONED", 
			"PARTITIONING", "PATH", "PERIOD", "PIECESIZE", "PLAN", "PRECISION", "PREPARE", 
			"PREVVAL", "PRIOR", "PRIQTY", "PRIVILEGES", "PROCEDURE", "PROGRAM", "PSID", 
			"PUBLIC", "QUERY", "QUERYNO", "READS", "REFERENCES", "REFRESH", "RELEASE", 
			"RENAME", "REPEAT", "RESIGNAL", "RESTRICT", "RESULT", "RESULT_SET_LOCATOR", 
			"RETURN", "RETURNS", "REVOKE", "RIGHT", "ROLE", "ROLLBACK", "ROLLUP", 
			"ROUND_CEILING", "ROUND_DOWN", "ROUND_FLOOR", "ROUND_HALF_DOWN", "ROUND_HALF_EVEN", 
			"ROUND_HALF_UP", "ROUND_UP", "ROW", "ROWSET", "RUN", "SAVEPOINT", "SCHEMA", 
			"SCRATCHPAD", "SECOND", "SECONDS", "SECQTY", "SECURITY", "SELECT", "SENSITIVE", 
			"SEQUENCE", "SET", "SIGNAL", "SIMPLE", "SOME", "SOURCE", "SPECIFIC", 
			"STANDARD", "STATEMENT", "STATIC", "STAY", "STOGROUP", "STORES", "STYLE", 
			"SUMMARY", "SYNONYM", "SYSDATE", "SYSTEM", "SYSTIMESTAMP", "TABLE", "TABLESPACE", 
			"THEN", "TO", "TRIGGER", "TRUNCATE", "TYPE", "UNDO", "UNION", "UNIQUE", 
			"UNTIL", "UPDATE", "USING", "VALIDPROC", "VALUE", "VALUES", "VARIABLE", 
			"VARIANT", "VCAT", "VERSIONING", "VIEW", "VOLATILE", "VOLUMES", "WHEN", 
			"WHENEVER", "WHERE", "WHILE", "WITH", "WLM", "XMLCAST", "XMLEXISTS", 
			"XMLNAMESPACES", "YEAR", "YEARS", "ZONE", "AND", "ARRAY_AGG", "ASC", 
			"AVG", "BIT", "CHANGE", "CODEUNITS16", "CODEUNITS32", "CORR", "CORRELATION", 
			"COUNT", "COUNT_BIG", "COVAR", "COVARIANCE", "COVARIANCE_SAMP", "COVAR_POP", 
			"COVAR_SAMP", "CS", "CUME_DIST", "DENSE_RANK", "DESC", "EBCDIC", "EXCLUSIVE", 
			"FIRST_VALUE", "FOLLOWING", "GROUPING", "IGNORE", "INDICATOR", "INPUT", 
			"ISNULL", "LAG", "LARGE", "LAST_VALUE", "LEAD", "LISTAGG", "LOCKED", 
			"LOCKS", "MEDIAN", "MINUTES", "MIXED", "NOTNULL", "NTH_VALUE", "NTILE", 
			"NUMERIC", "OBJECT", "OCTETS", "ONLY", "OVER", "PASSING", "PERCENTILE_CONT", 
			"PERCENTILE_DISC", "PERCENT_RANK", "PRECEDING", "PREVIOUS", "RANGE", 
			"RANK", "RATIO_TO_REPORT", "READ", "REF", "REGR_AVGX", "REGR_AVGY", "REGR_COUNT", 
			"REGR_ICPT", "REGR_INTERCEPT", "REGR_R2", "REGR_SLOPE", "REGR_SXX", "REGR_SXY", 
			"REGR_SYY", "RESPECT", "ROW_NUMBER", "ROWS", "RR", "RS", "SBCS", "SELECTIVITY", 
			"SETS", "SHARE", "SKIP_", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "SUM", 
			"TOKEN", "UNBOUNDED", "UNPACK", "UR", "USE", "VAR", "VARIANCE", "VARIANCE_SAMP", 
			"VAR_POP", "VAR_SAMP", "VARYING", "WITHOUT", "XML", "XMLAGG", "COLUMNS", 
			"SQLID", "ORDINALITY", "SYSTEM_TIME", "BUSINESS_TIME", "MULTIPLIER", 
			"UNNEST", "CROSS", "CALLER", "CLIENT", "POSITIONING", "SCROLL", "ACTION", 
			"ASSEMBLE", "C_", "CALLED", "COBOL", "DB2", "DEFINER", "DISPATCH", "ENVIRONMENT", 
			"FAILURE", "FAILURES", "JAVA", "MAIN", "NAME", "OPTIONS", "PARALLEL", 
			"PLI", "REGISTERS", "RESIDENT", "SECURED", "SPECIAL", "SQL", "STOP", 
			"SUB", "YES", "APPLICATION", "CHANGED", "COMPATIBILITY", "COMPRESS", 
			"COPY", "FREEPAGE", "GBPCACHE", "INCLUDE", "MAXVALUE", "MINVALUE", "PCTFREE", 
			"REGENERATE", "SEQTY", "MASK", "ENABLE", "PERMISSION", "ATOMIC", "SQLEXCEPTION", 
			"MERGE", "MATCHED", "SQLSTATE", "MESSAGE_TEXT", "OVERRIDING", "PORTION", 
			"DB2SQL", "DEBUG", "GENERAL", "MODE_", "REXX", "ABS", "ABSVAL", "ACOS", 
			"ADD_DAYS", "ADD_MONTHS", "ARRAY_DELETE", "ARRAY_FIRST", "ARRAY_LAST", 
			"ARRAY_NEXT", "ARRAY_PRIOR", "ARRAY_TRIM", "ASCII", "ASCII_CHR", "ASCIISTR", 
			"ASCII_STR", "ASIN", "ATAN", "ATAN2", "ATANH", "BIGINT", "BINARY", "BITAND", 
			"BITANDNOT", "BITNOT", "BITOR", "BITXOR", "BLOB", "BTRIM", "CARDINALITY", 
			"CCSID_ENCODING", "CEIL", "CEILING", "CHAR9", "CHARACTER_LENGTH", "CHAR_LENGTH", 
			"CHR", "CLOB", "COALESCE", "COLLATION_KEY", "COMPARE_DECFLOAT", "COS", 
			"COSH", "DATE", "DAYOFMONTH", "DAYOFWEEK", "DAYOFWEEK_ISO", "DAYOFYEAR", 
			"DAYS_BETWEEN", "DBCLOB", "DEC", "DECFLOAT", "DECFLOAT_FORMAT", "DECFLOAT_SORTKEY", 
			"DECIMAL", "DECODE", "DECRYPT_BINARY", "DECRYPT_BIT", "DECRYPT_CHAR", 
			"DECRYPT_DATAKEY_BIGINT", "DECRYPT_DATAKEY_BIT", "DECRYPT_DATAKEY_CLOB", 
			"DECRYPT_DATAKEY_DBCLOB", "DECRYPT_DATAKEY_DECIMAL", "DECRYPT_DATAKEY_INTEGER", 
			"DECRYPT_DATAKEY_VARCHAR", "DECRYPT_DATAKEY_VARGRAPHIC", "DECRYPT_DB", 
			"DEGREES", "DIFFERENCE", "DIGITS", "DOUBLE_PRECISION", "DSN_XMLVALIDATE", 
			"EBCDIC_CHR", "EBCDIC_STR", "ENCRYPT_DATAKEY", "ENCRYPT_TDES", "EXP", 
			"EXTRACT", "FLOAT", "FLOOR", "GENERATE_UNIQUE", "GENERATE_UNIQUE_BINARY", 
			"GETHINT", "GETVARIABLE", "GRAPHIC", "GREATEST", "HASH", "HASH_CRC32", 
			"HASH_MD5", "HASH_SHA1", "HASH_SHA256", "HEX", "IDENTITY_VAL_LOCAL", 
			"IFNULL", "INSTR", "INT", "INTEGER", "JULIAN_DAY", "LAST_DAY", "LCASE", 
			"LEAST", "LENGTH", "LN", "LOCATE", "LOCATE_IN_STRING", "LOG10", "LOWER", 
			"LPAD", "LTRIM", "MAX", "MAX_CARDINALITY", "MIDNIGHT_SECONDS", "MIN", 
			"MINUTE", "MOD", "MONTHS_BETWEEN", "MQREAD", "MQREADCLOB", "MQRECEIVE", 
			"MQRECEIVECLOB", "MQSEND", "MULTIPLY_ALT", "NEXT_DAY", "NEXT_MONTH", 
			"NORMALIZE_DECFLOAT", "NORMALIZE_STRING", "NULLIF", "NVL", "OVERLAY", 
			"PACK", "POSITION", "POSSTR", "POW", "POWER", "QUANTIZE", "QUARTER", 
			"RADIANS", "RAISE_ERROR", "RAND", "RANDOM", "REAL", "REGEXP_COUNT", "REGEXP_INSTR", 
			"REGEXP_LIKE", "REGEXP_REPLACE", "REGEXP_SUBSTR", "REPLACE", "RID", "ROUND", 
			"ROUND_TIMESTAMP", "ROWID", "RPAD", "RTRIM", "SCORE", "SIGN", "SIN", 
			"SINH", "SMALLINT", "SOAPHTTPC", "SOAPHTTPNC", "SOAPHTTPNV", "SOAPHTTPV", 
			"SOUNDEX", "SPACE", "SQRT", "STRIP", "STRLEFT", "STRPOS", "STRRIGHT", 
			"SUBSTR", "SUBSTRING", "TAN", "TANH", "TIME", "TIMESTAMP", "TIMESTAMPADD", 
			"TIMESTAMPDIFF", "TIMESTAMP_FORMAT", "TIMESTAMP_ISO", "TIMESTAMP_TZ", 
			"TO_CHAR", "TO_CLOB", "TO_DATE", "TO_NUMBER", "TOTALORDER", "TO_TIMESTAMP", 
			"TRANSLATE", "TRIM", "TRIM_ARRAY", "TRUNC", "TRUNC_TIMESTAMP", "UCASE", 
			"UNICODE", "UNICODE_STR", "UNISTR", "UPPER", "VARBINARY", "VARCHAR", 
			"VARCHAR9", "VARCHAR_BIT_FORMAT", "VARCHAR_FORMAT", "VARGRAPHIC", "VERIFY_GROUP_FOR_USER", 
			"VERIFY_ROLE_FOR_USER", "VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER", "WEEK", 
			"WEEK_ISO", "WRAP", "XMLATTRIBUTES", "XMLCOMMENT", "XMLCONCAT", "XMLDOCUMENT", 
			"XMLELEMENT", "XMLFOREST", "XMLMODIFY", "XMLPARSE", "XMLPI", "XMLQUERY", 
			"XMLSERIALIZE", "XMLTEXT", "XMLXSROBJECTID", "XSLTRANSFORM", "CURRENT_ACCELERATOR", 
			"CURRENT_APPLICATION_COMPATIBILITY", "CURRENT_APPLICATION_ENCODING_SCHEME", 
			"CURRENT_CLIENT_ACCTNG", "CURRENT_CLIENT_APPLNAME", "CURRENT_CLIENT_CORR_TOKEN", 
			"CURRENT_CLIENT_USERID", "CURRENT_CLIENT_WRKSTNNAME", "CURRENT_DATE", 
			"CURRENT_DEBUG_MODE", "CURRENT_DECFLOAT_ROUNDING_MODE", "CURRENT_DEGREE", 
			"CURRENT_EXPLAIN_MODE", "CURRENT_GET_ACCEL_ARCHIVE", "CURRENT_LOCALE_LC_CTYPE", 
			"CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION", "CURRENT_MEMBER", 
			"CURRENT_OPTIMIZATION_HINT", "CURRENT_PACKAGE_PATH", "CURRENT_PACKAGESET", 
			"CURRENT_PATH", "CURRENT_PRECISION", "CURRENT_QUERY_ACCELERATION", "CURRENT_QUERY_ACCELERATION_WAITFORDATA", 
			"CURRENT_REFRESH_AGE", "CURRENT_ROUTINE_VERSION", "CURRENT_RULES", "CURRENT_SCHEMA", 
			"CURRENT_SERVER", "CURRENT_SQLID", "CURRENT_TEMPORAL_BUSINESS_TIME", 
			"CURRENT_TEMPORAL_SYSTEM_TIME", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURRENT_TIME_ZONE", "ENCRYPTION_PASSWORD", "SESSION_TIME_ZONE", "SESSION_USER", 
			"USER", "ADMIN_TASK_LIST", "ADMIN_TASK_OUTPUT", "ADMIN_TASK_STATUS", 
			"BLOCKING_THREADS", "MQREADALL", "MQREADALLCLOB", "MQRECEIVEALL", "MQRECEIVEALLCLOB", 
			"XMLTABLE", "SQLIDENTIFIER"
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
	public String getGrammarFileName() { return "DB2zSQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DB2zSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(DB2zSQLParser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << ALLOCATE) | (1L << ALTER))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (DECLARE - 88)) | (1L << (DELETE - 88)) | (1L << (EXEC_SQL - 88)))) != 0) || _la==INSERT || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (SELECT - 265)) | (1L << (UPDATE - 265)) | (1L << (VALUES - 265)) | (1L << (WITH - 265)))) != 0) || _la==MERGE) {
					{
					{
					setState(454);
					sqlStatement();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(EOF);
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

	public static class SqlStatementContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public AllocateCursorStatementContext allocateCursorStatement() {
			return getRuleContext(AllocateCursorStatementContext.class,0);
		}
		public AlterDatabaseStatementContext alterDatabaseStatement() {
			return getRuleContext(AlterDatabaseStatementContext.class,0);
		}
		public AlterFunctionStatementContext alterFunctionStatement() {
			return getRuleContext(AlterFunctionStatementContext.class,0);
		}
		public AlterIndexStatementContext alterIndexStatement() {
			return getRuleContext(AlterIndexStatementContext.class,0);
		}
		public AlterMaskStatementContext alterMaskStatement() {
			return getRuleContext(AlterMaskStatementContext.class,0);
		}
		public AlterPermissionStatementContext alterPermissionStatement() {
			return getRuleContext(AlterPermissionStatementContext.class,0);
		}
		public AlterProcedureStatementContext alterProcedureStatement() {
			return getRuleContext(AlterProcedureStatementContext.class,0);
		}
		public DeclareCursorStatementContext declareCursorStatement() {
			return getRuleContext(DeclareCursorStatementContext.class,0);
		}
		public DeclareTableStatementContext declareTableStatement() {
			return getRuleContext(DeclareTableStatementContext.class,0);
		}
		public DeclareStatementStatementContext declareStatementStatement() {
			return getRuleContext(DeclareStatementStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DB2zSQLParser.SEMICOLON, 0); }
		public TerminalNode EOF() { return getToken(DB2zSQLParser.EOF, 0); }
		public TerminalNode EXEC_SQL() { return getToken(DB2zSQLParser.EXEC_SQL, 0); }
		public TerminalNode END_EXEC() { return getToken(DB2zSQLParser.END_EXEC, 0); }
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXEC_SQL) {
				{
				setState(463);
				match(EXEC_SQL);
				}
			}

			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(466);
				query();
				}
				break;
			case 2:
				{
				setState(467);
				allocateCursorStatement();
				}
				break;
			case 3:
				{
				setState(468);
				alterDatabaseStatement();
				}
				break;
			case 4:
				{
				setState(469);
				alterFunctionStatement();
				}
				break;
			case 5:
				{
				setState(470);
				alterIndexStatement();
				}
				break;
			case 6:
				{
				setState(471);
				alterMaskStatement();
				}
				break;
			case 7:
				{
				setState(472);
				alterPermissionStatement();
				}
				break;
			case 8:
				{
				setState(473);
				alterProcedureStatement();
				}
				break;
			case 9:
				{
				setState(474);
				declareCursorStatement();
				}
				break;
			case 10:
				{
				setState(475);
				declareTableStatement();
				}
				break;
			case 11:
				{
				setState(476);
				declareStatementStatement();
				}
				break;
			case 12:
				{
				setState(477);
				deleteStatement();
				}
				break;
			case 13:
				{
				setState(478);
				insertStatement();
				}
				break;
			case 14:
				{
				setState(479);
				mergeStatement();
				}
				break;
			case 15:
				{
				setState(480);
				updateStatement();
				}
				break;
			}
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(483);
				match(SEMICOLON);
				}
				break;
			case END_EXEC:
				{
				{
				setState(484);
				match(END_EXEC);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(485);
					match(DOT);
					}
				}

				}
				}
				break;
			case EOF:
				{
				setState(488);
				match(EOF);
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

	public static class QueryContext extends ParserRuleContext {
		public SubSelectContext subSelect() {
			return getRuleContext(SubSelectContext.class,0);
		}
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public SelectIntoStatementContext selectIntoStatement() {
			return getRuleContext(SelectIntoStatementContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(491);
				subSelect();
				}
				break;
			case 2:
				{
				setState(492);
				fullSelect();
				}
				break;
			case 3:
				{
				setState(493);
				selectStatement();
				}
				break;
			case 4:
				{
				setState(494);
				selectIntoStatement();
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

	public static class DeclareCursorStatementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(DB2zSQLParser.DECLARE, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(DB2zSQLParser.CURSOR, 0); }
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public StatementNameContext statementName() {
			return getRuleContext(StatementNameContext.class,0);
		}
		public List<HoldabilityContext> holdability() {
			return getRuleContexts(HoldabilityContext.class);
		}
		public HoldabilityContext holdability(int i) {
			return getRuleContext(HoldabilityContext.class,i);
		}
		public List<ReturnabilityContext> returnability() {
			return getRuleContexts(ReturnabilityContext.class);
		}
		public ReturnabilityContext returnability(int i) {
			return getRuleContext(ReturnabilityContext.class,i);
		}
		public List<RowsetPositioningContext> rowsetPositioning() {
			return getRuleContexts(RowsetPositioningContext.class);
		}
		public RowsetPositioningContext rowsetPositioning(int i) {
			return getRuleContext(RowsetPositioningContext.class,i);
		}
		public TerminalNode NO() { return getToken(DB2zSQLParser.NO, 0); }
		public TerminalNode SCROLL() { return getToken(DB2zSQLParser.SCROLL, 0); }
		public TerminalNode ASENSITIVE() { return getToken(DB2zSQLParser.ASENSITIVE, 0); }
		public TerminalNode INSENSITIVE() { return getToken(DB2zSQLParser.INSENSITIVE, 0); }
		public TerminalNode SENSITIVE() { return getToken(DB2zSQLParser.SENSITIVE, 0); }
		public TerminalNode DYNAMIC() { return getToken(DB2zSQLParser.DYNAMIC, 0); }
		public TerminalNode STATIC() { return getToken(DB2zSQLParser.STATIC, 0); }
		public DeclareCursorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareCursorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDeclareCursorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDeclareCursorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDeclareCursorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareCursorStatementContext declareCursorStatement() throws RecognitionException {
		DeclareCursorStatementContext _localctx = new DeclareCursorStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declareCursorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(497);
			match(DECLARE);
			setState(498);
			cursorName();
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				{
				{
				setState(499);
				match(NO);
				setState(500);
				match(SCROLL);
				}
				}
				break;
			case ASENSITIVE:
			case INSENSITIVE:
			case SENSITIVE:
				{
				{
				setState(505);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASENSITIVE:
					{
					setState(501);
					match(ASENSITIVE);
					}
					break;
				case INSENSITIVE:
					{
					setState(502);
					match(INSENSITIVE);
					}
					break;
				case SENSITIVE:
					{
					{
					setState(503);
					match(SENSITIVE);
					setState(504);
					_la = _input.LA(1);
					if ( !(_la==DYNAMIC || _la==STATIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(507);
				match(SCROLL);
				}
				}
				break;
			case CURSOR:
				break;
			default:
				break;
			}
			setState(510);
			match(CURSOR);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==WITHOUT) {
				{
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(511);
					holdability();
					}
					break;
				case 2:
					{
					setState(512);
					returnability();
					}
					break;
				case 3:
					{
					setState(513);
					rowsetPositioning();
					}
					break;
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(FOR);
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(520);
				selectStatement();
				}
				break;
			case 2:
				{
				setState(521);
				statementName();
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

	public static class CursorNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CursorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCursorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCursorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCursorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorNameContext cursorName() throws RecognitionException {
		CursorNameContext _localctx = new CursorNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cursorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterStatementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitStatementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitStatementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNameContext statementName() throws RecognitionException {
		StatementNameContext _localctx = new StatementNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HoldabilityContext extends ParserRuleContext {
		public TerminalNode WITHOUT() { return getToken(DB2zSQLParser.WITHOUT, 0); }
		public TerminalNode HOLD() { return getToken(DB2zSQLParser.HOLD, 0); }
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public HoldabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holdability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterHoldability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitHoldability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitHoldability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoldabilityContext holdability() throws RecognitionException {
		HoldabilityContext _localctx = new HoldabilityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_holdability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITHOUT:
				{
				{
				setState(528);
				match(WITHOUT);
				setState(529);
				match(HOLD);
				}
				}
				break;
			case WITH:
				{
				{
				setState(530);
				match(WITH);
				setState(531);
				match(HOLD);
				}
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

	public static class ReturnabilityContext extends ParserRuleContext {
		public TerminalNode WITHOUT() { return getToken(DB2zSQLParser.WITHOUT, 0); }
		public TerminalNode RETURN() { return getToken(DB2zSQLParser.RETURN, 0); }
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public TerminalNode TO() { return getToken(DB2zSQLParser.TO, 0); }
		public TerminalNode CALLER() { return getToken(DB2zSQLParser.CALLER, 0); }
		public TerminalNode CLIENT() { return getToken(DB2zSQLParser.CLIENT, 0); }
		public ReturnabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterReturnability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitReturnability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitReturnability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnabilityContext returnability() throws RecognitionException {
		ReturnabilityContext _localctx = new ReturnabilityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITHOUT:
				{
				{
				setState(534);
				match(WITHOUT);
				setState(535);
				match(RETURN);
				}
				}
				break;
			case WITH:
				{
				{
				setState(536);
				match(WITH);
				setState(537);
				match(RETURN);
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					{
					setState(538);
					match(TO);
					setState(539);
					match(CALLER);
					}
					}
					break;
				case 2:
					{
					{
					setState(540);
					match(TO);
					setState(541);
					match(CLIENT);
					}
					}
					break;
				}
				}
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

	public static class RowsetPositioningContext extends ParserRuleContext {
		public TerminalNode WITHOUT() { return getToken(DB2zSQLParser.WITHOUT, 0); }
		public TerminalNode ROWSET() { return getToken(DB2zSQLParser.ROWSET, 0); }
		public TerminalNode POSITIONING() { return getToken(DB2zSQLParser.POSITIONING, 0); }
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public RowsetPositioningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowsetPositioning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRowsetPositioning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRowsetPositioning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRowsetPositioning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsetPositioningContext rowsetPositioning() throws RecognitionException {
		RowsetPositioningContext _localctx = new RowsetPositioningContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rowsetPositioning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITHOUT:
				{
				{
				setState(546);
				match(WITHOUT);
				setState(547);
				match(ROWSET);
				setState(548);
				match(POSITIONING);
				}
				}
				break;
			case WITH:
				{
				{
				setState(549);
				match(WITH);
				setState(550);
				match(ROWSET);
				setState(551);
				match(POSITIONING);
				}
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

	public static class DeclareTableStatementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(DB2zSQLParser.DECLARE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(DB2zSQLParser.TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public List<NotNullPhraseContext> notNullPhrase() {
			return getRuleContexts(NotNullPhraseContext.class);
		}
		public NotNullPhraseContext notNullPhrase(int i) {
			return getRuleContext(NotNullPhraseContext.class,i);
		}
		public DeclareTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDeclareTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDeclareTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDeclareTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareTableStatementContext declareTableStatement() throws RecognitionException {
		DeclareTableStatementContext _localctx = new DeclareTableStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declareTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(554);
			match(DECLARE);
			setState(555);
			tableName();
			setState(556);
			match(TABLE);
			setState(557);
			match(LPAREN);
			{
			setState(558);
			columnName();
			setState(559);
			dataType();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(560);
				notNullPhrase();
				}
			}

			}
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(563);
				match(COMMA);
				setState(564);
				columnName();
				setState(565);
				dataType();
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(566);
					notNullPhrase();
					}
				}

				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotNullPhraseContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public NotNullPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNullPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNotNullPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNotNullPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNotNullPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullPhraseContext notNullPhrase() throws RecognitionException {
		NotNullPhraseContext _localctx = new NotNullPhraseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_notNullPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				{
				setState(576);
				match(NOT);
				setState(577);
				match(NULL);
				}
				}
				break;
			case 2:
				{
				{
				setState(578);
				match(NOT);
				setState(579);
				match(NULL);
				setState(580);
				match(WITH);
				setState(581);
				match(DEFAULT);
				}
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

	public static class DeclareStatementStatementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(DB2zSQLParser.DECLARE, 0); }
		public List<StatementNameContext> statementName() {
			return getRuleContexts(StatementNameContext.class);
		}
		public StatementNameContext statementName(int i) {
			return getRuleContext(StatementNameContext.class,i);
		}
		public TerminalNode STATEMENT() { return getToken(DB2zSQLParser.STATEMENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public DeclareStatementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDeclareStatementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDeclareStatementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDeclareStatementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStatementStatementContext declareStatementStatement() throws RecognitionException {
		DeclareStatementStatementContext _localctx = new DeclareStatementStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declareStatementStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(584);
			match(DECLARE);
			setState(585);
			statementName();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(586);
				match(COMMA);
				setState(587);
				statementName();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(STATEMENT);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllocateCursorStatementContext extends ParserRuleContext {
		public TerminalNode ALLOCATE() { return getToken(DB2zSQLParser.ALLOCATE, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(DB2zSQLParser.CURSOR, 0); }
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode RESULT() { return getToken(DB2zSQLParser.RESULT, 0); }
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public RsLocatorVariableContext rsLocatorVariable() {
			return getRuleContext(RsLocatorVariableContext.class,0);
		}
		public AllocateCursorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocateCursorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAllocateCursorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAllocateCursorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAllocateCursorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocateCursorStatementContext allocateCursorStatement() throws RecognitionException {
		AllocateCursorStatementContext _localctx = new AllocateCursorStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_allocateCursorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(595);
			match(ALLOCATE);
			setState(596);
			cursorName();
			setState(597);
			match(CURSOR);
			setState(598);
			match(FOR);
			setState(599);
			match(RESULT);
			setState(600);
			match(SET);
			setState(601);
			rsLocatorVariable();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RsLocatorVariableContext extends ParserRuleContext {
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public RsLocatorVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsLocatorVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRsLocatorVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRsLocatorVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRsLocatorVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RsLocatorVariableContext rsLocatorVariable() throws RecognitionException {
		RsLocatorVariableContext _localctx = new RsLocatorVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rsLocatorVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			hostVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(DB2zSQLParser.DATABASE, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public List<TerminalNode> BUFFERPOOL() { return getTokens(DB2zSQLParser.BUFFERPOOL); }
		public TerminalNode BUFFERPOOL(int i) {
			return getToken(DB2zSQLParser.BUFFERPOOL, i);
		}
		public List<BpNameContext> bpName() {
			return getRuleContexts(BpNameContext.class);
		}
		public BpNameContext bpName(int i) {
			return getRuleContext(BpNameContext.class,i);
		}
		public List<TerminalNode> INDEXBP() { return getTokens(DB2zSQLParser.INDEXBP); }
		public TerminalNode INDEXBP(int i) {
			return getToken(DB2zSQLParser.INDEXBP, i);
		}
		public List<TerminalNode> STOGROUP() { return getTokens(DB2zSQLParser.STOGROUP); }
		public TerminalNode STOGROUP(int i) {
			return getToken(DB2zSQLParser.STOGROUP, i);
		}
		public List<StogroupNameContext> stogroupName() {
			return getRuleContexts(StogroupNameContext.class);
		}
		public StogroupNameContext stogroupName(int i) {
			return getRuleContext(StogroupNameContext.class,i);
		}
		public List<TerminalNode> CCSID() { return getTokens(DB2zSQLParser.CCSID); }
		public TerminalNode CCSID(int i) {
			return getToken(DB2zSQLParser.CCSID, i);
		}
		public List<CcsidValueContext> ccsidValue() {
			return getRuleContexts(CcsidValueContext.class);
		}
		public CcsidValueContext ccsidValue(int i) {
			return getRuleContext(CcsidValueContext.class,i);
		}
		public AlterDatabaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterDatabaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterDatabaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterDatabaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDatabaseStatementContext alterDatabaseStatement() throws RecognitionException {
		AlterDatabaseStatementContext _localctx = new AlterDatabaseStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterDatabaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(605);
			match(ALTER);
			setState(606);
			match(DATABASE);
			setState(607);
			databaseName();
			setState(616); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BUFFERPOOL:
					{
					{
					setState(608);
					match(BUFFERPOOL);
					setState(609);
					bpName();
					}
					}
					break;
				case INDEXBP:
					{
					{
					setState(610);
					match(INDEXBP);
					setState(611);
					bpName();
					}
					}
					break;
				case STOGROUP:
					{
					{
					setState(612);
					match(STOGROUP);
					setState(613);
					stogroupName();
					}
					}
					break;
				case CCSID:
					{
					{
					setState(614);
					match(CCSID);
					setState(615);
					ccsidValue();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BUFFERPOOL || _la==CCSID || _la==INDEXBP || _la==STOGROUP );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterFunctionStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public TerminalNode RESTRICT() { return getToken(DB2zSQLParser.RESTRICT, 0); }
		public List<FunctionOptionListContext> functionOptionList() {
			return getRuleContexts(FunctionOptionListContext.class);
		}
		public FunctionOptionListContext functionOptionList(int i) {
			return getRuleContext(FunctionOptionListContext.class,i);
		}
		public TerminalNode FUNCTION() { return getToken(DB2zSQLParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode SPECIFIC() { return getToken(DB2zSQLParser.SPECIFIC, 0); }
		public SpecificNameContext specificName() {
			return getRuleContext(SpecificNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ParameterTypeContext> parameterType() {
			return getRuleContexts(ParameterTypeContext.class);
		}
		public ParameterTypeContext parameterType(int i) {
			return getRuleContext(ParameterTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public AlterFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterFunctionStatementContext alterFunctionStatement() throws RecognitionException {
		AlterFunctionStatementContext _localctx = new AlterFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(620);
			match(ALTER);
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				{
				setState(621);
				match(FUNCTION);
				setState(622);
				functionName();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(623);
					match(LPAREN);
					setState(624);
					parameterType();
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(625);
						match(COMMA);
						setState(626);
						parameterType();
						}
						}
						setState(631);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(632);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case SPECIFIC:
				{
				{
				setState(636);
				match(SPECIFIC);
				setState(637);
				match(FUNCTION);
				setState(638);
				specificName();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTRICT) {
				{
				setState(641);
				match(RESTRICT);
				}
			}

			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(644);
				functionOptionList();
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (ALLOW - 33)) | (1L << (ASUTIME - 33)) | (1L << (COLLID - 33)) | (1L << (CONTAINS - 33)) | (1L << (CONTINUE - 33)) | (1L << (DBINFO - 33)) | (1L << (DEFAULT - 33)) | (1L << (DETERMINISTIC - 33)) | (1L << (DISALLOW - 33)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (EXTERNAL - 119)) | (1L << (FINAL - 119)) | (1L << (INHERIT - 119)) | (1L << (LANGUAGE - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (MODIFIES - 184)) | (1L << (NO - 184)) | (1L << (NOT - 184)) | (1L << (NULL - 184)) | (1L << (PACKAGE - 184)) | (1L << (PARAMETER - 184)) | (1L << (PROGRAM - 184)) | (1L << (READS - 184)) | (1L << (RETURNS - 184)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (RUN - 257)) | (1L << (SCRATCHPAD - 257)) | (1L << (SECURITY - 257)) | (1L << (SPECIFIC - 257)) | (1L << (STATIC - 257)) | (1L << (STAY - 257)) | (1L << (VARIANT - 257)) | (1L << (WLM - 257)))) != 0) || ((((_la - 433)) & ~0x3f) == 0 && ((1L << (_la - 433)) & ((1L << (CALLED - 433)) | (1L << (SECURED - 433)) | (1L << (STOP - 433)))) != 0) || _la==CARDINALITY );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterIndexStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(DB2zSQLParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RegenerateClauseContext regenerateClause() {
			return getRuleContext(RegenerateClauseContext.class,0);
		}
		public List<AlterIndexOptionsContext> alterIndexOptions() {
			return getRuleContexts(AlterIndexOptionsContext.class);
		}
		public AlterIndexOptionsContext alterIndexOptions(int i) {
			return getRuleContext(AlterIndexOptionsContext.class,i);
		}
		public List<AlterIndexPartitionOptionsContext> alterIndexPartitionOptions() {
			return getRuleContexts(AlterIndexPartitionOptionsContext.class);
		}
		public AlterIndexPartitionOptionsContext alterIndexPartitionOptions(int i) {
			return getRuleContext(AlterIndexPartitionOptionsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public AlterIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterIndexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterIndexStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterIndexStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexStatementContext alterIndexStatement() throws RecognitionException {
		AlterIndexStatementContext _localctx = new AlterIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alterIndexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(649);
			match(ALTER);
			setState(650);
			match(INDEX);
			setState(651);
			indexName();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGENERATE) {
				{
				setState(652);
				regenerateClause();
				}
			}

			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << BUFFERPOOL) | (1L << CLOSE) | (1L << CLUSTER))) != 0) || _la==DSSIZE || _la==ERASE || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (NOT - 191)) | (1L << (PADDED - 191)) | (1L << (PIECESIZE - 191)) | (1L << (PRIQTY - 191)))) != 0) || _la==USING || ((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (COMPRESS - 458)) | (1L << (COPY - 458)) | (1L << (FREEPAGE - 458)) | (1L << (GBPCACHE - 458)) | (1L << (PCTFREE - 458)) | (1L << (SEQTY - 458)))) != 0)) {
				{
				{
				setState(655);
				alterIndexOptions();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALTER) {
				{
				setState(661);
				alterIndexPartitionOptions();
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(662);
					match(COMMA);
					setState(663);
					alterIndexPartitionOptions();
					}
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AlterMaskStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public TerminalNode MASK() { return getToken(DB2zSQLParser.MASK, 0); }
		public MaskNameContext maskName() {
			return getRuleContext(MaskNameContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(DB2zSQLParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(DB2zSQLParser.DISABLE, 0); }
		public RegenerateClauseContext regenerateClause() {
			return getRuleContext(RegenerateClauseContext.class,0);
		}
		public AlterMaskStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterMaskStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterMaskStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterMaskStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterMaskStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterMaskStatementContext alterMaskStatement() throws RecognitionException {
		AlterMaskStatementContext _localctx = new AlterMaskStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alterMaskStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			match(ALTER);
			setState(672);
			match(MASK);
			setState(673);
			maskName();
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENABLE:
				{
				setState(674);
				match(ENABLE);
				}
				break;
			case DISABLE:
				{
				setState(675);
				match(DISABLE);
				}
				break;
			case REGENERATE:
				{
				setState(676);
				regenerateClause();
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

	public static class AlterPermissionStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public TerminalNode PERMISSION() { return getToken(DB2zSQLParser.PERMISSION, 0); }
		public PermissionNameContext permissionName() {
			return getRuleContext(PermissionNameContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(DB2zSQLParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(DB2zSQLParser.DISABLE, 0); }
		public RegenerateClauseContext regenerateClause() {
			return getRuleContext(RegenerateClauseContext.class,0);
		}
		public AlterPermissionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterPermissionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterPermissionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterPermissionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterPermissionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterPermissionStatementContext alterPermissionStatement() throws RecognitionException {
		AlterPermissionStatementContext _localctx = new AlterPermissionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alterPermissionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(679);
			match(ALTER);
			setState(680);
			match(PERMISSION);
			setState(681);
			permissionName();
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENABLE:
				{
				setState(682);
				match(ENABLE);
				}
				break;
			case DISABLE:
				{
				setState(683);
				match(DISABLE);
				}
				break;
			case REGENERATE:
				{
				setState(684);
				regenerateClause();
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

	public static class AlterProcedureStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public TerminalNode PROCEDURE() { return getToken(DB2zSQLParser.PROCEDURE, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public List<ProcedureOptionListContext> procedureOptionList() {
			return getRuleContexts(ProcedureOptionListContext.class);
		}
		public ProcedureOptionListContext procedureOptionList(int i) {
			return getRuleContext(ProcedureOptionListContext.class,i);
		}
		public AlterProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterProcedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterProcedureStatementContext alterProcedureStatement() throws RecognitionException {
		AlterProcedureStatementContext _localctx = new AlterProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alterProcedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687);
			match(ALTER);
			setState(688);
			match(PROCEDURE);
			setState(689);
			procedureName();
			setState(691); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(690);
				procedureOptionList();
				}
				}
				setState(693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (ALLOW - 33)) | (1L << (ASUTIME - 33)) | (1L << (COLLID - 33)) | (1L << (COMMIT - 33)) | (1L << (CONTAINS - 33)) | (1L << (CONTINUE - 33)) | (1L << (DBINFO - 33)) | (1L << (DEFAULT - 33)) | (1L << (DETERMINISTIC - 33)) | (1L << (DISABLE - 33)) | (1L << (DISALLOW - 33)))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (DYNAMIC - 101)) | (1L << (EXTERNAL - 101)) | (1L << (INHERIT - 101)) | (1L << (LANGUAGE - 101)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (MODIFIES - 184)) | (1L << (NO - 184)) | (1L << (NOT - 184)) | (1L << (NULL - 184)) | (1L << (PACKAGE - 184)) | (1L << (PARAMETER - 184)) | (1L << (PROGRAM - 184)) | (1L << (READS - 184)) | (1L << (RESULT - 184)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (RUN - 257)) | (1L << (SECURITY - 257)) | (1L << (STAY - 257)) | (1L << (VARIANT - 257)) | (1L << (WLM - 257)))) != 0) || _la==CALLED || _la==STOP );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedDeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DB2zSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(DB2zSQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DB2zSQLParser.WHERE, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public IncludeColumnsContext includeColumns() {
			return getRuleContext(IncludeColumnsContext.class,0);
		}
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public AssignmentClauseContext assignmentClause() {
			return getRuleContext(AssignmentClauseContext.class,0);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public List<IsolationClauseContext> isolationClause() {
			return getRuleContexts(IsolationClauseContext.class);
		}
		public IsolationClauseContext isolationClause(int i) {
			return getRuleContext(IsolationClauseContext.class,i);
		}
		public List<SkipLockedDataClauseContext> skipLockedDataClause() {
			return getRuleContexts(SkipLockedDataClauseContext.class);
		}
		public SkipLockedDataClauseContext skipLockedDataClause(int i) {
			return getRuleContext(SkipLockedDataClauseContext.class,i);
		}
		public TerminalNode QUERYNO() { return getToken(DB2zSQLParser.QUERYNO, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public SearchedDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedDelete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSearchedDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSearchedDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSearchedDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchedDeleteContext searchedDelete() throws RecognitionException {
		SearchedDeleteContext _localctx = new SearchedDeleteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_searchedDelete);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(695);
			match(DELETE);
			setState(696);
			match(FROM);
			setState(697);
			tableName();
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(698);
				periodClause();
				}
				break;
			}
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(701);
				correlationName();
				}
				break;
			}
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(704);
				includeColumns();
				}
			}

			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(707);
				match(SET);
				setState(708);
				assignmentClause();
				}
			}

			{
			setState(711);
			match(WHERE);
			setState(712);
			searchCondition();
			}
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(714);
				fetchClause();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(719);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WITH:
						{
						setState(717);
						isolationClause();
						}
						break;
					case SKIP_:
						{
						setState(718);
						skipLockedDataClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(724);
				match(QUERYNO);
				setState(725);
				match(INTEGERLITERAL);
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

	public static class PositionedDeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DB2zSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(DB2zSQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DB2zSQLParser.WHERE, 0); }
		public TerminalNode CURRENT() { return getToken(DB2zSQLParser.CURRENT, 0); }
		public List<TerminalNode> OF() { return getTokens(DB2zSQLParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(DB2zSQLParser.OF, i);
		}
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public TerminalNode ROWSET() { return getToken(DB2zSQLParser.ROWSET, 0); }
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public PositionedDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionedDelete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPositionedDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPositionedDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPositionedDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionedDeleteContext positionedDelete() throws RecognitionException {
		PositionedDeleteContext _localctx = new PositionedDeleteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_positionedDelete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(728);
			match(DELETE);
			setState(729);
			match(FROM);
			setState(730);
			tableName();
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(731);
				correlationName();
				}
				break;
			}
			setState(734);
			match(WHERE);
			setState(735);
			match(CURRENT);
			setState(736);
			match(OF);
			setState(737);
			cursorName();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(738);
				match(FOR);
				setState(739);
				match(ROW);
				setState(742);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(740);
					hostVariable();
					}
					break;
				case INTEGERLITERAL:
					{
					setState(741);
					match(INTEGERLITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(744);
				match(OF);
				setState(745);
				match(ROWSET);
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public SearchedDeleteContext searchedDelete() {
			return getRuleContext(SearchedDeleteContext.class,0);
		}
		public PositionedDeleteContext positionedDelete() {
			return getRuleContext(PositionedDeleteContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(748);
				searchedDelete();
				}
				break;
			case 2:
				{
				setState(749);
				positionedDelete();
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

	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(DB2zSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(DB2zSQLParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public MultipleRowInsertContext multipleRowInsert() {
			return getRuleContext(MultipleRowInsertContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public IncludeColumnsContext includeColumns() {
			return getRuleContext(IncludeColumnsContext.class,0);
		}
		public TerminalNode OVERRIDING() { return getToken(DB2zSQLParser.OVERRIDING, 0); }
		public TerminalNode USER() { return getToken(DB2zSQLParser.USER, 0); }
		public TerminalNode VALUE() { return getToken(DB2zSQLParser.VALUE, 0); }
		public TerminalNode VALUES() { return getToken(DB2zSQLParser.VALUES, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public List<ValuesList1Context> valuesList1() {
			return getRuleContexts(ValuesList1Context.class);
		}
		public ValuesList1Context valuesList1(int i) {
			return getRuleContext(ValuesList1Context.class,i);
		}
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public List<CommonTableExpressionContext> commonTableExpression() {
			return getRuleContexts(CommonTableExpressionContext.class);
		}
		public CommonTableExpressionContext commonTableExpression(int i) {
			return getRuleContext(CommonTableExpressionContext.class,i);
		}
		public IsolationClauseContext isolationClause() {
			return getRuleContext(IsolationClauseContext.class,0);
		}
		public TerminalNode QUERYNO() { return getToken(DB2zSQLParser.QUERYNO, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(752);
			match(INSERT);
			setState(753);
			match(INTO);
			setState(754);
			tableName();
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(755);
				match(LPAREN);
				setState(756);
				columnName();
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(757);
					match(COMMA);
					setState(758);
					columnName();
					}
					}
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(764);
				match(RPAREN);
				}
				break;
			}
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(768);
				includeColumns();
				}
			}

			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDING) {
				{
				setState(771);
				match(OVERRIDING);
				setState(772);
				match(USER);
				setState(773);
				match(VALUE);
				}
			}

			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				{
				setState(776);
				match(VALUES);
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(777);
					valuesList1();
					}
					break;
				case 2:
					{
					{
					setState(778);
					match(LPAREN);
					setState(779);
					valuesList1();
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(780);
						match(COMMA);
						setState(781);
						valuesList1();
						}
						}
						setState(786);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(787);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(791);
					match(WITH);
					setState(792);
					commonTableExpression();
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(793);
						match(COMMA);
						setState(794);
						commonTableExpression();
						}
						}
						setState(799);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(802);
				fullSelect();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(803);
					isolationClause();
					}
				}

				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERYNO) {
					{
					setState(806);
					match(QUERYNO);
					setState(807);
					match(INTEGERLITERAL);
					}
				}

				}
				}
				break;
			case 3:
				{
				setState(810);
				multipleRowInsert();
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

	public static class MergeStatementContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(DB2zSQLParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(DB2zSQLParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(DB2zSQLParser.USING, 0); }
		public List<TerminalNode> ON() { return getTokens(DB2zSQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(DB2zSQLParser.ON, i);
		}
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public SourceValuesContext sourceValues() {
			return getRuleContext(SourceValuesContext.class,0);
		}
		public CorrelationClauseContext correlationClause() {
			return getRuleContext(CorrelationClauseContext.class,0);
		}
		public IncludeColumnsContext includeColumns() {
			return getRuleContext(IncludeColumnsContext.class,0);
		}
		public List<TerminalNode> WHEN() { return getTokens(DB2zSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(DB2zSQLParser.WHEN, i);
		}
		public List<MatchingConditionContext> matchingCondition() {
			return getRuleContexts(MatchingConditionContext.class);
		}
		public MatchingConditionContext matchingCondition(int i) {
			return getRuleContext(MatchingConditionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(DB2zSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(DB2zSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(DB2zSQLParser.ELSE, 0); }
		public TerminalNode IGNORE() { return getToken(DB2zSQLParser.IGNORE, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode ATOMIC() { return getToken(DB2zSQLParser.ATOMIC, 0); }
		public TerminalNode CONTINUE() { return getToken(DB2zSQLParser.CONTINUE, 0); }
		public TerminalNode SQLEXCEPTION() { return getToken(DB2zSQLParser.SQLEXCEPTION, 0); }
		public TerminalNode QUERYNO() { return getToken(DB2zSQLParser.QUERYNO, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public List<ModificationOperationContext> modificationOperation() {
			return getRuleContexts(ModificationOperationContext.class);
		}
		public ModificationOperationContext modificationOperation(int i) {
			return getRuleContext(ModificationOperationContext.class,i);
		}
		public List<SignalStatementContext> signalStatement() {
			return getRuleContexts(SignalStatementContext.class);
		}
		public SignalStatementContext signalStatement(int i) {
			return getRuleContext(SignalStatementContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterMergeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitMergeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitMergeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mergeStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(813);
			match(MERGE);
			setState(814);
			match(INTO);
			setState(815);
			tableName();
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(816);
				correlationClause();
				}
				break;
			}
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(819);
				includeColumns();
				}
			}

			setState(822);
			match(USING);
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				{
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(823);
						match(LPAREN);
						}
						} 
					}
					setState(828);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(829);
				tableReference();
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(830);
					match(RPAREN);
					}
					}
					setState(835);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(836);
				sourceValues();
				}
				break;
			}
			setState(839);
			match(ON);
			setState(840);
			searchCondition();
			setState(848); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(841);
				match(WHEN);
				setState(842);
				matchingCondition();
				setState(843);
				match(THEN);
				setState(846);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case UPDATE:
					{
					setState(844);
					modificationOperation();
					}
					break;
				case SIGNAL:
					{
					setState(845);
					signalStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(850); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(852);
				match(ELSE);
				setState(853);
				match(IGNORE);
				}
			}

			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(856);
				match(NOT);
				setState(857);
				match(ATOMIC);
				setState(858);
				match(CONTINUE);
				setState(859);
				match(ON);
				setState(860);
				match(SQLEXCEPTION);
				}
			}

			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(863);
				match(QUERYNO);
				setState(864);
				match(INTEGERLITERAL);
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

	public static class SearchedUpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(DB2zSQLParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public AssignmentClauseContext assignmentClause() {
			return getRuleContext(AssignmentClauseContext.class,0);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public IncludeColumnsContext includeColumns() {
			return getRuleContext(IncludeColumnsContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DB2zSQLParser.WHERE, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public List<IsolationClauseContext> isolationClause() {
			return getRuleContexts(IsolationClauseContext.class);
		}
		public IsolationClauseContext isolationClause(int i) {
			return getRuleContext(IsolationClauseContext.class,i);
		}
		public List<SkipLockedDataClauseContext> skipLockedDataClause() {
			return getRuleContexts(SkipLockedDataClauseContext.class);
		}
		public SkipLockedDataClauseContext skipLockedDataClause(int i) {
			return getRuleContext(SkipLockedDataClauseContext.class,i);
		}
		public TerminalNode QUERYNO() { return getToken(DB2zSQLParser.QUERYNO, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public SearchedUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSearchedUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSearchedUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSearchedUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchedUpdateContext searchedUpdate() throws RecognitionException {
		SearchedUpdateContext _localctx = new SearchedUpdateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_searchedUpdate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(867);
			match(UPDATE);
			setState(868);
			tableName();
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(869);
				periodClause();
				}
				break;
			}
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(872);
				correlationName();
				}
				break;
			}
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(875);
				includeColumns();
				}
			}

			setState(878);
			match(SET);
			setState(879);
			assignmentClause();
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(880);
				match(WHERE);
				setState(881);
				searchCondition();
				}
				break;
			}
			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(886);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WITH:
						{
						setState(884);
						isolationClause();
						}
						break;
					case SKIP_:
						{
						setState(885);
						skipLockedDataClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(891);
				match(QUERYNO);
				setState(892);
				match(INTEGERLITERAL);
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

	public static class PositionedUpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(DB2zSQLParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public AssignmentClauseContext assignmentClause() {
			return getRuleContext(AssignmentClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DB2zSQLParser.WHERE, 0); }
		public TerminalNode CURRENT() { return getToken(DB2zSQLParser.CURRENT, 0); }
		public List<TerminalNode> OF() { return getTokens(DB2zSQLParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(DB2zSQLParser.OF, i);
		}
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public TerminalNode ROWSET() { return getToken(DB2zSQLParser.ROWSET, 0); }
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public PositionedUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionedUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPositionedUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPositionedUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPositionedUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionedUpdateContext positionedUpdate() throws RecognitionException {
		PositionedUpdateContext _localctx = new PositionedUpdateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_positionedUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(895);
			match(UPDATE);
			setState(896);
			tableName();
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(897);
				correlationName();
				}
				break;
			}
			setState(900);
			match(SET);
			setState(901);
			assignmentClause();
			setState(902);
			match(WHERE);
			setState(903);
			match(CURRENT);
			setState(904);
			match(OF);
			setState(905);
			cursorName();
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(906);
				match(FOR);
				setState(907);
				match(ROW);
				setState(910);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(908);
					hostVariable();
					}
					break;
				case INTEGERLITERAL:
					{
					setState(909);
					match(INTEGERLITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(912);
				match(OF);
				setState(913);
				match(ROWSET);
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

	public static class UpdateStatementContext extends ParserRuleContext {
		public SearchedUpdateContext searchedUpdate() {
			return getRuleContext(SearchedUpdateContext.class,0);
		}
		public PositionedUpdateContext positionedUpdate() {
			return getRuleContext(PositionedUpdateContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_updateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(916);
				searchedUpdate();
				}
				break;
			case 2:
				{
				setState(917);
				positionedUpdate();
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

	public static class SourceValuesContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(DB2zSQLParser.VALUES, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public ValuesSingleRowContext valuesSingleRow() {
			return getRuleContext(ValuesSingleRowContext.class,0);
		}
		public ValuesMultipleRowContext valuesMultipleRow() {
			return getRuleContext(ValuesMultipleRowContext.class,0);
		}
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public SourceValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSourceValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSourceValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSourceValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceValuesContext sourceValues() throws RecognitionException {
		SourceValuesContext _localctx = new SourceValuesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sourceValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(920);
			match(LPAREN);
			setState(921);
			match(VALUES);
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(922);
				valuesSingleRow();
				}
				break;
			case 2:
				{
				setState(923);
				valuesMultipleRow();
				}
				break;
			}
			setState(926);
			match(RPAREN);
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(927);
				match(AS);
				}
				break;
			}
			setState(930);
			correlationName();
			setState(931);
			match(LPAREN);
			setState(932);
			columnName();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(933);
				match(COMMA);
				setState(934);
				columnName();
				}
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesSingleRowContext extends ParserRuleContext {
		public List<ValuesList3Context> valuesList3() {
			return getRuleContexts(ValuesList3Context.class);
		}
		public ValuesList3Context valuesList3(int i) {
			return getRuleContext(ValuesList3Context.class,i);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public ValuesSingleRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesSingleRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterValuesSingleRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitValuesSingleRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitValuesSingleRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesSingleRowContext valuesSingleRow() throws RecognitionException {
		ValuesSingleRowContext _localctx = new ValuesSingleRowContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valuesSingleRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(942);
				valuesList3();
				}
				break;
			case 2:
				{
				{
				setState(943);
				match(LPAREN);
				setState(944);
				valuesList3();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(945);
					match(COMMA);
					setState(946);
					valuesList3();
					}
					}
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(952);
				match(RPAREN);
				}
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

	public static class ValuesMultipleRowContext extends ParserRuleContext {
		public List<ValuesList4Context> valuesList4() {
			return getRuleContexts(ValuesList4Context.class);
		}
		public ValuesList4Context valuesList4(int i) {
			return getRuleContext(ValuesList4Context.class,i);
		}
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode ROWS() { return getToken(DB2zSQLParser.ROWS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public ValuesMultipleRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesMultipleRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterValuesMultipleRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitValuesMultipleRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitValuesMultipleRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesMultipleRowContext valuesMultipleRow() throws RecognitionException {
		ValuesMultipleRowContext _localctx = new ValuesMultipleRowContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_valuesMultipleRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(956);
				valuesList4();
				}
				break;
			case 2:
				{
				{
				setState(957);
				match(LPAREN);
				setState(958);
				valuesList4();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(959);
					match(COMMA);
					setState(960);
					valuesList4();
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(RPAREN);
				}
				setState(968);
				match(FOR);
				setState(971);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(969);
					hostVariable();
					}
					break;
				case INTEGERLITERAL:
					{
					setState(970);
					match(INTEGERLITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(973);
				match(ROWS);
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

	public static class MatchingConditionContext extends ParserRuleContext {
		public TerminalNode MATCHED() { return getToken(DB2zSQLParser.MATCHED, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public MatchingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterMatchingCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitMatchingCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitMatchingCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingConditionContext matchingCondition() throws RecognitionException {
		MatchingConditionContext _localctx = new MatchingConditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_matchingCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(977);
				match(NOT);
				}
			}

			setState(980);
			match(MATCHED);
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(981);
				match(AND);
				setState(982);
				searchCondition();
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

	public static class ModificationOperationContext extends ParserRuleContext {
		public UpdateOperationContext updateOperation() {
			return getRuleContext(UpdateOperationContext.class,0);
		}
		public DeleteOperationContext deleteOperation() {
			return getRuleContext(DeleteOperationContext.class,0);
		}
		public InsertOperationContext insertOperation() {
			return getRuleContext(InsertOperationContext.class,0);
		}
		public ModificationOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificationOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterModificationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitModificationOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitModificationOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificationOperationContext modificationOperation() throws RecognitionException {
		ModificationOperationContext _localctx = new ModificationOperationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_modificationOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(985);
				updateOperation();
				}
				break;
			case DELETE:
				{
				setState(986);
				deleteOperation();
				}
				break;
			case INSERT:
				{
				setState(987);
				insertOperation();
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

	public static class AssignmentClauseContext extends ParserRuleContext {
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(DB2zSQLParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(DB2zSQLParser.EQ, i);
		}
		public List<ValuesList1Context> valuesList1() {
			return getRuleContexts(ValuesList1Context.class);
		}
		public ValuesList1Context valuesList1(int i) {
			return getRuleContext(ValuesList1Context.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public AssignmentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAssignmentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAssignmentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAssignmentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentClauseContext assignmentClause() throws RecognitionException {
		AssignmentClauseContext _localctx = new AssignmentClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignmentClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				{
				setState(990);
				columnName();
				setState(991);
				match(EQ);
				setState(992);
				valuesList1();
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(993);
						match(COMMA);
						setState(994);
						columnName();
						setState(995);
						match(EQ);
						setState(996);
						valuesList1();
						}
						} 
					}
					setState(1002);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				}
				break;
			case 2:
				{
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(1003);
					match(LPAREN);
					setState(1004);
					columnName();
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1005);
						match(COMMA);
						setState(1006);
						columnName();
						}
						}
						setState(1011);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1012);
					match(RPAREN);
					setState(1013);
					match(EQ);
					setState(1014);
					match(LPAREN);
					{
					setState(1015);
					valuesList1();
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1016);
						match(COMMA);
						setState(1017);
						valuesList1();
						}
						}
						setState(1022);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 2:
					{
					setState(1023);
					fullSelect();
					}
					break;
				}
				setState(1026);
				match(RPAREN);
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

	public static class UpdateOperationContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(DB2zSQLParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public List<AssignmentClauseContext> assignmentClause() {
			return getRuleContexts(AssignmentClauseContext.class);
		}
		public AssignmentClauseContext assignmentClause(int i) {
			return getRuleContext(AssignmentClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public UpdateOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterUpdateOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitUpdateOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitUpdateOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateOperationContext updateOperation() throws RecognitionException {
		UpdateOperationContext _localctx = new UpdateOperationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_updateOperation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1030);
			match(UPDATE);
			setState(1031);
			match(SET);
			setState(1032);
			assignmentClause();
			setState(1037);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1033);
					match(COMMA);
					setState(1034);
					assignmentClause();
					}
					} 
				}
				setState(1039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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

	public static class DeleteOperationContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DB2zSQLParser.DELETE, 0); }
		public DeleteOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDeleteOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDeleteOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDeleteOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteOperationContext deleteOperation() throws RecognitionException {
		DeleteOperationContext _localctx = new DeleteOperationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_deleteOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1040);
			match(DELETE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertOperationContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(DB2zSQLParser.INSERT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(DB2zSQLParser.VALUES, 0); }
		public List<ValuesList1Context> valuesList1() {
			return getRuleContexts(ValuesList1Context.class);
		}
		public ValuesList1Context valuesList1(int i) {
			return getRuleContext(ValuesList1Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public InsertOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterInsertOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitInsertOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitInsertOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertOperationContext insertOperation() throws RecognitionException {
		InsertOperationContext _localctx = new InsertOperationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_insertOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1042);
			match(INSERT);
			setState(1043);
			match(LPAREN);
			setState(1044);
			columnName();
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1045);
				match(COMMA);
				setState(1046);
				columnName();
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1052);
			match(RPAREN);
			setState(1053);
			match(VALUES);
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1054);
				valuesList1();
				}
				break;
			case 2:
				{
				{
				setState(1055);
				match(LPAREN);
				setState(1056);
				valuesList1();
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1057);
					match(COMMA);
					setState(1058);
					valuesList1();
					}
					}
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1064);
				match(RPAREN);
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

	public static class SignalStatementContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(DB2zSQLParser.SIGNAL, 0); }
		public TerminalNode SQLSTATE() { return getToken(DB2zSQLParser.SQLSTATE, 0); }
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public TerminalNode VALUE() { return getToken(DB2zSQLParser.VALUE, 0); }
		public SignalInformationContext signalInformation() {
			return getRuleContext(SignalInformationContext.class,0);
		}
		public SignalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSignalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSignalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSignalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalStatementContext signalStatement() throws RecognitionException {
		SignalStatementContext _localctx = new SignalStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_signalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1068);
			match(SIGNAL);
			setState(1069);
			match(SQLSTATE);
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(1070);
				match(VALUE);
				}
			}

			setState(1073);
			match(NONNUMERICLITERAL);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(1074);
				signalInformation();
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

	public static class SignalInformationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(DB2zSQLParser.MESSAGE_TEXT, 0); }
		public TerminalNode EQ() { return getToken(DB2zSQLParser.EQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public SignalInformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalInformation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSignalInformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSignalInformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSignalInformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalInformationContext signalInformation() throws RecognitionException {
		SignalInformationContext _localctx = new SignalInformationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_signalInformation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1077);
			match(SET);
			setState(1078);
			match(MESSAGE_TEXT);
			setState(1079);
			match(EQ);
			setState(1080);
			expression();
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (PLUS - 12)) | (1L << (MINUS - 12)) | (1L << (SPLAT - 12)) | (1L << (SLASH - 12)) | (1L << (CONCATOP - 12)) | (1L << (CONCAT - 12)))) != 0)) {
				{
				{
				setState(1081);
				operator();
				setState(1082);
				expression();
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ValuesList1Context extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ValuesList1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesList1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterValuesList1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitValuesList1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitValuesList1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesList1Context valuesList1() throws RecognitionException {
		ValuesList1Context _localctx = new ValuesList1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_valuesList1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				{
				setState(1089);
				expression();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (PLUS - 12)) | (1L << (MINUS - 12)) | (1L << (SPLAT - 12)) | (1L << (SLASH - 12)) | (1L << (CONCATOP - 12)) | (1L << (CONCAT - 12)))) != 0)) {
					{
					{
					setState(1090);
					operator();
					setState(1091);
					expression();
					}
					}
					setState(1097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1098);
				match(DEFAULT);
				}
				break;
			case 3:
				{
				setState(1099);
				match(NULL);
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

	public static class ValuesList2Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public ValuesList2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesList2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterValuesList2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitValuesList2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitValuesList2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesList2Context valuesList2() throws RecognitionException {
		ValuesList2Context _localctx = new ValuesList2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_valuesList2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1102);
				expression();
				}
				break;
			case 2:
				{
				setState(1103);
				hostVariable();
				}
				break;
			case 3:
				{
				setState(1104);
				match(DEFAULT);
				}
				break;
			case 4:
				{
				setState(1105);
				match(NULL);
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

	public static class ValuesList3Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public ValuesList3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesList3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterValuesList3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitValuesList3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitValuesList3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesList3Context valuesList3() throws RecognitionException {
		ValuesList3Context _localctx = new ValuesList3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_valuesList3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1108);
				expression();
				}
				break;
			case 2:
				{
				setState(1109);
				match(NULL);
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

	public static class ValuesList4Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public ValuesList4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesList4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterValuesList4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitValuesList4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitValuesList4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesList4Context valuesList4() throws RecognitionException {
		ValuesList4Context _localctx = new ValuesList4Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_valuesList4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1112);
				expression();
				}
				break;
			case 2:
				{
				setState(1113);
				hostVariable();
				}
				break;
			case 3:
				{
				setState(1114);
				match(NULL);
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

	public static class IncludeColumnsContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(DB2zSQLParser.INCLUDE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public IncludeColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterIncludeColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitIncludeColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitIncludeColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeColumnsContext includeColumns() throws RecognitionException {
		IncludeColumnsContext _localctx = new IncludeColumnsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_includeColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1117);
			match(INCLUDE);
			setState(1118);
			match(LPAREN);
			setState(1119);
			columnName();
			setState(1120);
			dataType();
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1121);
				match(COMMA);
				setState(1122);
				columnName();
				setState(1123);
				dataType();
				}
				}
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1130);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleRowInsertContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(DB2zSQLParser.VALUES, 0); }
		public List<ValuesList2Context> valuesList2() {
			return getRuleContexts(ValuesList2Context.class);
		}
		public ValuesList2Context valuesList2(int i) {
			return getRuleContext(ValuesList2Context.class,i);
		}
		public TerminalNode ATOMIC() { return getToken(DB2zSQLParser.ATOMIC, 0); }
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode ROWS() { return getToken(DB2zSQLParser.ROWS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode CONTINUE() { return getToken(DB2zSQLParser.CONTINUE, 0); }
		public TerminalNode ON() { return getToken(DB2zSQLParser.ON, 0); }
		public TerminalNode SQLEXCEPTION() { return getToken(DB2zSQLParser.SQLEXCEPTION, 0); }
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public MultipleRowInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleRowInsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterMultipleRowInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitMultipleRowInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitMultipleRowInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleRowInsertContext multipleRowInsert() throws RecognitionException {
		MultipleRowInsertContext _localctx = new MultipleRowInsertContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multipleRowInsert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1132);
			match(VALUES);
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1133);
				valuesList2();
				}
				break;
			case 2:
				{
				{
				setState(1134);
				match(LPAREN);
				setState(1135);
				valuesList2();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1136);
					match(COMMA);
					setState(1137);
					valuesList2();
					}
					}
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1143);
				match(RPAREN);
				}
				}
				break;
			}
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1147);
				match(FOR);
				setState(1150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(1148);
					hostVariable();
					}
					break;
				case INTEGERLITERAL:
					{
					setState(1149);
					match(INTEGERLITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1152);
				match(ROWS);
				}
			}

			setState(1161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC:
				{
				setState(1155);
				match(ATOMIC);
				}
				break;
			case NOT:
				{
				{
				setState(1156);
				match(NOT);
				setState(1157);
				match(ATOMIC);
				setState(1158);
				match(CONTINUE);
				setState(1159);
				match(ON);
				setState(1160);
				match(SQLEXCEPTION);
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

	public static class RegenerateClauseContext extends ParserRuleContext {
		public TerminalNode REGENERATE() { return getToken(DB2zSQLParser.REGENERATE, 0); }
		public TerminalNode USING() { return getToken(DB2zSQLParser.USING, 0); }
		public TerminalNode APPLICATION() { return getToken(DB2zSQLParser.APPLICATION, 0); }
		public TerminalNode COMPATIBILITY() { return getToken(DB2zSQLParser.COMPATIBILITY, 0); }
		public ApplCompatValueContext applCompatValue() {
			return getRuleContext(ApplCompatValueContext.class,0);
		}
		public RegenerateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regenerateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRegenerateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRegenerateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRegenerateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegenerateClauseContext regenerateClause() throws RecognitionException {
		RegenerateClauseContext _localctx = new RegenerateClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_regenerateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1163);
			match(REGENERATE);
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1164);
				match(USING);
				setState(1165);
				match(APPLICATION);
				setState(1166);
				match(COMPATIBILITY);
				setState(1167);
				applCompatValue();
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

	public static class AlterIndexOptionsContext extends ParserRuleContext {
		public UsingSpecificationContext usingSpecification() {
			return getRuleContext(UsingSpecificationContext.class,0);
		}
		public FreeSpecificationContext freeSpecification() {
			return getRuleContext(FreeSpecificationContext.class,0);
		}
		public GbpcacheSpecificationContext gbpcacheSpecification() {
			return getRuleContext(GbpcacheSpecificationContext.class,0);
		}
		public TerminalNode BUFFERPOOL() { return getToken(DB2zSQLParser.BUFFERPOOL, 0); }
		public BpNameContext bpName() {
			return getRuleContext(BpNameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(DB2zSQLParser.CLOSE, 0); }
		public TerminalNode COPY() { return getToken(DB2zSQLParser.COPY, 0); }
		public TerminalNode DSSIZE() { return getToken(DB2zSQLParser.DSSIZE, 0); }
		public TerminalNode SQLIDENTIFIER() { return getToken(DB2zSQLParser.SQLIDENTIFIER, 0); }
		public TerminalNode PIECESIZE() { return getToken(DB2zSQLParser.PIECESIZE, 0); }
		public TerminalNode CLUSTER() { return getToken(DB2zSQLParser.CLUSTER, 0); }
		public TerminalNode PADDED() { return getToken(DB2zSQLParser.PADDED, 0); }
		public TerminalNode COMPRESS() { return getToken(DB2zSQLParser.COMPRESS, 0); }
		public TerminalNode ADD() { return getToken(DB2zSQLParser.ADD, 0); }
		public TerminalNode YES() { return getToken(DB2zSQLParser.YES, 0); }
		public TerminalNode NO() { return getToken(DB2zSQLParser.NO, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode COLUMN() { return getToken(DB2zSQLParser.COLUMN, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode INCLUDE() { return getToken(DB2zSQLParser.INCLUDE, 0); }
		public TerminalNode ASC() { return getToken(DB2zSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DB2zSQLParser.DESC, 0); }
		public TerminalNode RANDOM() { return getToken(DB2zSQLParser.RANDOM, 0); }
		public AlterIndexOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterIndexOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterIndexOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterIndexOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexOptionsContext alterIndexOptions() throws RecognitionException {
		AlterIndexOptionsContext _localctx = new AlterIndexOptionsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alterIndexOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				{
				setState(1170);
				match(BUFFERPOOL);
				setState(1171);
				bpName();
				}
				}
				break;
			case 2:
				{
				{
				setState(1172);
				match(CLOSE);
				setState(1173);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(1174);
				match(COPY);
				setState(1175);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 4:
				{
				{
				setState(1176);
				match(DSSIZE);
				setState(1177);
				match(SQLIDENTIFIER);
				}
				}
				break;
			case 5:
				{
				{
				setState(1178);
				match(PIECESIZE);
				setState(1179);
				match(SQLIDENTIFIER);
				}
				}
				break;
			case 6:
				{
				setState(1180);
				usingSpecification();
				}
				break;
			case 7:
				{
				setState(1181);
				freeSpecification();
				}
				break;
			case 8:
				{
				setState(1182);
				gbpcacheSpecification();
				}
				break;
			case 9:
				{
				{
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1183);
					match(NOT);
					}
				}

				setState(1186);
				match(CLUSTER);
				}
				}
				break;
			case 10:
				{
				{
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1187);
					match(NOT);
					}
				}

				setState(1190);
				match(PADDED);
				}
				}
				break;
			case 11:
				{
				{
				setState(1191);
				match(COMPRESS);
				setState(1192);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 12:
				{
				{
				setState(1193);
				match(ADD);
				setState(1208);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLUMN:
					{
					{
					setState(1194);
					match(COLUMN);
					setState(1195);
					match(LPAREN);
					setState(1196);
					columnName();
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASC || _la==DESC || _la==RANDOM) {
						{
						setState(1197);
						_la = _input.LA(1);
						if ( !(_la==ASC || _la==DESC || _la==RANDOM) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1200);
					match(RPAREN);
					}
					}
					break;
				case INCLUDE:
					{
					{
					setState(1202);
					match(INCLUDE);
					setState(1203);
					match(COLUMN);
					setState(1204);
					match(LPAREN);
					setState(1205);
					columnName();
					setState(1206);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class AlterIndexPartitionOptionsContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public PartitionElementContext partitionElement() {
			return getRuleContext(PartitionElementContext.class,0);
		}
		public List<GbpcacheSpecificationContext> gbpcacheSpecification() {
			return getRuleContexts(GbpcacheSpecificationContext.class);
		}
		public GbpcacheSpecificationContext gbpcacheSpecification(int i) {
			return getRuleContext(GbpcacheSpecificationContext.class,i);
		}
		public List<TerminalNode> DSSIZE() { return getTokens(DB2zSQLParser.DSSIZE); }
		public TerminalNode DSSIZE(int i) {
			return getToken(DB2zSQLParser.DSSIZE, i);
		}
		public List<TerminalNode> SQLIDENTIFIER() { return getTokens(DB2zSQLParser.SQLIDENTIFIER); }
		public TerminalNode SQLIDENTIFIER(int i) {
			return getToken(DB2zSQLParser.SQLIDENTIFIER, i);
		}
		public List<UsingSpecificationContext> usingSpecification() {
			return getRuleContexts(UsingSpecificationContext.class);
		}
		public UsingSpecificationContext usingSpecification(int i) {
			return getRuleContext(UsingSpecificationContext.class,i);
		}
		public List<FreeSpecificationContext> freeSpecification() {
			return getRuleContexts(FreeSpecificationContext.class);
		}
		public FreeSpecificationContext freeSpecification(int i) {
			return getRuleContext(FreeSpecificationContext.class,i);
		}
		public AlterIndexPartitionOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexPartitionOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAlterIndexPartitionOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAlterIndexPartitionOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAlterIndexPartitionOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexPartitionOptionsContext alterIndexPartitionOptions() throws RecognitionException {
		AlterIndexPartitionOptionsContext _localctx = new AlterIndexPartitionOptionsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alterIndexPartitionOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1212);
			match(ALTER);
			setState(1213);
			partitionElement();
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DSSIZE || _la==ERASE || _la==PRIQTY || _la==USING || ((((_la - 460)) & ~0x3f) == 0 && ((1L << (_la - 460)) & ((1L << (FREEPAGE - 460)) | (1L << (GBPCACHE - 460)) | (1L << (PCTFREE - 460)) | (1L << (SEQTY - 460)))) != 0)) {
				{
				setState(1227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ERASE:
				case PRIQTY:
				case USING:
				case SEQTY:
					{
					setState(1215); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1214);
							usingSpecification();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1217); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case FREEPAGE:
				case PCTFREE:
					{
					setState(1220); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1219);
							freeSpecification();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1222); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case GBPCACHE:
					{
					setState(1224);
					gbpcacheSpecification();
					}
					break;
				case DSSIZE:
					{
					{
					setState(1225);
					match(DSSIZE);
					setState(1226);
					match(SQLIDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class UsingSpecificationContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(DB2zSQLParser.USING, 0); }
		public TerminalNode PRIQTY() { return getToken(DB2zSQLParser.PRIQTY, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode SEQTY() { return getToken(DB2zSQLParser.SEQTY, 0); }
		public TerminalNode ERASE() { return getToken(DB2zSQLParser.ERASE, 0); }
		public TerminalNode YES() { return getToken(DB2zSQLParser.YES, 0); }
		public TerminalNode NO() { return getToken(DB2zSQLParser.NO, 0); }
		public TerminalNode VCAT() { return getToken(DB2zSQLParser.VCAT, 0); }
		public CatalogNameContext catalogName() {
			return getRuleContext(CatalogNameContext.class,0);
		}
		public TerminalNode STOGROUP() { return getToken(DB2zSQLParser.STOGROUP, 0); }
		public StogroupNameContext stogroupName() {
			return getRuleContext(StogroupNameContext.class,0);
		}
		public UsingSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterUsingSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitUsingSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitUsingSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingSpecificationContext usingSpecification() throws RecognitionException {
		UsingSpecificationContext _localctx = new UsingSpecificationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_usingSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USING:
				{
				{
				setState(1232);
				match(USING);
				setState(1237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VCAT:
					{
					{
					setState(1233);
					match(VCAT);
					setState(1234);
					catalogName();
					}
					}
					break;
				case STOGROUP:
					{
					{
					setState(1235);
					match(STOGROUP);
					setState(1236);
					stogroupName();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case PRIQTY:
				{
				{
				setState(1239);
				match(PRIQTY);
				setState(1240);
				match(INTEGERLITERAL);
				}
				}
				break;
			case SEQTY:
				{
				{
				setState(1241);
				match(SEQTY);
				setState(1242);
				match(INTEGERLITERAL);
				}
				}
				break;
			case ERASE:
				{
				{
				setState(1243);
				match(ERASE);
				setState(1244);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class FreeSpecificationContext extends ParserRuleContext {
		public TerminalNode FREEPAGE() { return getToken(DB2zSQLParser.FREEPAGE, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode PCTFREE() { return getToken(DB2zSQLParser.PCTFREE, 0); }
		public FreeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFreeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFreeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFreeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreeSpecificationContext freeSpecification() throws RecognitionException {
		FreeSpecificationContext _localctx = new FreeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_freeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FREEPAGE:
				{
				{
				setState(1247);
				match(FREEPAGE);
				setState(1248);
				match(INTEGERLITERAL);
				}
				}
				break;
			case PCTFREE:
				{
				{
				setState(1249);
				match(PCTFREE);
				setState(1250);
				match(INTEGERLITERAL);
				}
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

	public static class GbpcacheSpecificationContext extends ParserRuleContext {
		public TerminalNode GBPCACHE() { return getToken(DB2zSQLParser.GBPCACHE, 0); }
		public TerminalNode CHANGED() { return getToken(DB2zSQLParser.CHANGED, 0); }
		public TerminalNode ALL() { return getToken(DB2zSQLParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(DB2zSQLParser.NONE, 0); }
		public GbpcacheSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gbpcacheSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGbpcacheSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGbpcacheSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGbpcacheSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GbpcacheSpecificationContext gbpcacheSpecification() throws RecognitionException {
		GbpcacheSpecificationContext _localctx = new GbpcacheSpecificationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gbpcacheSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1253);
			match(GBPCACHE);
			setState(1254);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==NONE || _la==CHANGED) ) {
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

	public static class PartitionElementContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DB2zSQLParser.PARTITION, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode ENDING() { return getToken(DB2zSQLParser.ENDING, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> MAXVALUE() { return getTokens(DB2zSQLParser.MAXVALUE); }
		public TerminalNode MAXVALUE(int i) {
			return getToken(DB2zSQLParser.MAXVALUE, i);
		}
		public List<TerminalNode> MINVALUE() { return getTokens(DB2zSQLParser.MINVALUE); }
		public TerminalNode MINVALUE(int i) {
			return getToken(DB2zSQLParser.MINVALUE, i);
		}
		public TerminalNode AT() { return getToken(DB2zSQLParser.AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public TerminalNode INCLUSIVE() { return getToken(DB2zSQLParser.INCLUSIVE, 0); }
		public PartitionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPartitionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPartitionElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPartitionElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionElementContext partitionElement() throws RecognitionException {
		PartitionElementContext _localctx = new PartitionElementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_partitionElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1256);
			match(PARTITION);
			setState(1257);
			match(INTEGERLITERAL);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDING) {
				{
				setState(1258);
				match(ENDING);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1259);
					match(AT);
					}
				}

				setState(1262);
				match(LPAREN);
				setState(1266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONNUMERICLITERAL:
				case INTEGERLITERAL:
				case NUMERICLITERAL:
					{
					setState(1263);
					literal();
					}
					break;
				case MAXVALUE:
					{
					setState(1264);
					match(MAXVALUE);
					}
					break;
				case MINVALUE:
					{
					setState(1265);
					match(MINVALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1268);
					match(COMMA);
					setState(1272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NONNUMERICLITERAL:
					case INTEGERLITERAL:
					case NUMERICLITERAL:
						{
						setState(1269);
						literal();
						}
						break;
					case MAXVALUE:
						{
						setState(1270);
						match(MAXVALUE);
						}
						break;
					case MINVALUE:
						{
						setState(1271);
						match(MINVALUE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1279);
				match(RPAREN);
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUSIVE) {
					{
					setState(1280);
					match(INCLUSIVE);
					}
				}

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

	public static class ApplCompatValueContext extends ParserRuleContext {
		public FunctionLevelContext functionLevel() {
			return getRuleContext(FunctionLevelContext.class,0);
		}
		public ApplCompatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applCompatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterApplCompatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitApplCompatValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitApplCompatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplCompatValueContext applCompatValue() throws RecognitionException {
		ApplCompatValueContext _localctx = new ApplCompatValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_applCompatValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1285);
			functionLevel();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLevelContext extends ParserRuleContext {
		public TerminalNode SQLIDENTIFIER() { return getToken(DB2zSQLParser.SQLIDENTIFIER, 0); }
		public FunctionLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFunctionLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFunctionLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFunctionLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLevelContext functionLevel() throws RecognitionException {
		FunctionLevelContext _localctx = new FunctionLevelContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(SQLIDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public TerminalNode LOCATOR() { return getToken(DB2zSQLParser.LOCATOR, 0); }
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitParameterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parameterType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1289);
			dataType();
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1290);
				match(AS);
				setState(1291);
				match(LOCATOR);
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

	public static class FunctionOptionListContext extends ParserRuleContext {
		public TerminalNode SPECIFIC() { return getToken(DB2zSQLParser.SPECIFIC, 0); }
		public TerminalNode EXTERNAL() { return getToken(DB2zSQLParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(DB2zSQLParser.NAME, 0); }
		public TerminalNode LANGUAGE() { return getToken(DB2zSQLParser.LANGUAGE, 0); }
		public TerminalNode PARAMETER() { return getToken(DB2zSQLParser.PARAMETER, 0); }
		public TerminalNode STYLE() { return getToken(DB2zSQLParser.STYLE, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(DB2zSQLParser.DETERMINISTIC, 0); }
		public TerminalNode VARIANT() { return getToken(DB2zSQLParser.VARIANT, 0); }
		public TerminalNode ON() { return getToken(DB2zSQLParser.ON, 0); }
		public List<TerminalNode> NULL() { return getTokens(DB2zSQLParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(DB2zSQLParser.NULL, i);
		}
		public TerminalNode INPUT() { return getToken(DB2zSQLParser.INPUT, 0); }
		public TerminalNode CALL() { return getToken(DB2zSQLParser.CALL, 0); }
		public TerminalNode ACTION() { return getToken(DB2zSQLParser.ACTION, 0); }
		public TerminalNode FINAL() { return getToken(DB2zSQLParser.FINAL, 0); }
		public TerminalNode PARALLEL() { return getToken(DB2zSQLParser.PARALLEL, 0); }
		public TerminalNode DBINFO() { return getToken(DB2zSQLParser.DBINFO, 0); }
		public TerminalNode CARDINALITY() { return getToken(DB2zSQLParser.CARDINALITY, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode WLM() { return getToken(DB2zSQLParser.WLM, 0); }
		public TerminalNode ENVIRONMENT() { return getToken(DB2zSQLParser.ENVIRONMENT, 0); }
		public TerminalNode ASUTIME() { return getToken(DB2zSQLParser.ASUTIME, 0); }
		public TerminalNode STAY() { return getToken(DB2zSQLParser.STAY, 0); }
		public TerminalNode RESIDENT() { return getToken(DB2zSQLParser.RESIDENT, 0); }
		public TerminalNode PROGRAM() { return getToken(DB2zSQLParser.PROGRAM, 0); }
		public TerminalNode TYPE() { return getToken(DB2zSQLParser.TYPE, 0); }
		public TerminalNode SECURITY() { return getToken(DB2zSQLParser.SECURITY, 0); }
		public TerminalNode RUN() { return getToken(DB2zSQLParser.RUN, 0); }
		public TerminalNode OPTIONS() { return getToken(DB2zSQLParser.OPTIONS, 0); }
		public RunTimeOptionsContext runTimeOptions() {
			return getRuleContext(RunTimeOptionsContext.class,0);
		}
		public TerminalNode SPECIAL() { return getToken(DB2zSQLParser.SPECIAL, 0); }
		public TerminalNode REGISTERS() { return getToken(DB2zSQLParser.REGISTERS, 0); }
		public TerminalNode STATIC() { return getToken(DB2zSQLParser.STATIC, 0); }
		public TerminalNode DISPATCH() { return getToken(DB2zSQLParser.DISPATCH, 0); }
		public TerminalNode SECURED() { return getToken(DB2zSQLParser.SECURED, 0); }
		public TerminalNode CCSID() { return getToken(DB2zSQLParser.CCSID, 0); }
		public TerminalNode ASSEMBLE() { return getToken(DB2zSQLParser.ASSEMBLE, 0); }
		public TerminalNode C_() { return getToken(DB2zSQLParser.C_, 0); }
		public TerminalNode COBOL() { return getToken(DB2zSQLParser.COBOL, 0); }
		public TerminalNode JAVA() { return getToken(DB2zSQLParser.JAVA, 0); }
		public TerminalNode PLI() { return getToken(DB2zSQLParser.PLI, 0); }
		public TerminalNode SQL() { return getToken(DB2zSQLParser.SQL, 0); }
		public TerminalNode ALLOW() { return getToken(DB2zSQLParser.ALLOW, 0); }
		public TerminalNode DISALLOW() { return getToken(DB2zSQLParser.DISALLOW, 0); }
		public TerminalNode NO() { return getToken(DB2zSQLParser.NO, 0); }
		public TerminalNode YES() { return getToken(DB2zSQLParser.YES, 0); }
		public TerminalNode SUB() { return getToken(DB2zSQLParser.SUB, 0); }
		public TerminalNode MAIN() { return getToken(DB2zSQLParser.MAIN, 0); }
		public TerminalNode DB2() { return getToken(DB2zSQLParser.DB2, 0); }
		public TerminalNode USER() { return getToken(DB2zSQLParser.USER, 0); }
		public TerminalNode DEFINER() { return getToken(DB2zSQLParser.DEFINER, 0); }
		public TerminalNode INHERIT() { return getToken(DB2zSQLParser.INHERIT, 0); }
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public ExternalProgramNameContext externalProgramName() {
			return getRuleContext(ExternalProgramNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CALLED() { return getToken(DB2zSQLParser.CALLED, 0); }
		public TerminalNode MODIFIES() { return getToken(DB2zSQLParser.MODIFIES, 0); }
		public TerminalNode DATA() { return getToken(DB2zSQLParser.DATA, 0); }
		public TerminalNode READS() { return getToken(DB2zSQLParser.READS, 0); }
		public TerminalNode CONTAINS() { return getToken(DB2zSQLParser.CONTAINS, 0); }
		public TerminalNode PACKAGE() { return getToken(DB2zSQLParser.PACKAGE, 0); }
		public TerminalNode PATH() { return getToken(DB2zSQLParser.PATH, 0); }
		public PackagePathContext packagePath() {
			return getRuleContext(PackagePathContext.class,0);
		}
		public TerminalNode SCRATCHPAD() { return getToken(DB2zSQLParser.SCRATCHPAD, 0); }
		public TerminalNode COLLID() { return getToken(DB2zSQLParser.COLLID, 0); }
		public CollectionIDContext collectionID() {
			return getRuleContext(CollectionIDContext.class,0);
		}
		public TerminalNode STOP() { return getToken(DB2zSQLParser.STOP, 0); }
		public TerminalNode AFTER() { return getToken(DB2zSQLParser.AFTER, 0); }
		public TerminalNode SYSTEM() { return getToken(DB2zSQLParser.SYSTEM, 0); }
		public TerminalNode FAILURES() { return getToken(DB2zSQLParser.FAILURES, 0); }
		public TerminalNode CONTINUE() { return getToken(DB2zSQLParser.CONTINUE, 0); }
		public TerminalNode FAILURE() { return getToken(DB2zSQLParser.FAILURE, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode RETURNS() { return getToken(DB2zSQLParser.RETURNS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DB2zSQLParser.COMMA, 0); }
		public TerminalNode SPLAT() { return getToken(DB2zSQLParser.SPLAT, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode LIMIT() { return getToken(DB2zSQLParser.LIMIT, 0); }
		public FunctionOptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOptionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFunctionOptionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFunctionOptionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFunctionOptionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionOptionListContext functionOptionList() throws RecognitionException {
		FunctionOptionListContext _localctx = new FunctionOptionListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_functionOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				{
				setState(1294);
				match(EXTERNAL);
				setState(1295);
				match(NAME);
				setState(1298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1296);
					externalProgramName();
					}
					break;
				case 2:
					{
					setState(1297);
					identifier();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(1300);
				match(LANGUAGE);
				setState(1301);
				_la = _input.LA(1);
				if ( !(((((_la - 431)) & ~0x3f) == 0 && ((1L << (_la - 431)) & ((1L << (ASSEMBLE - 431)) | (1L << (C_ - 431)) | (1L << (COBOL - 431)) | (1L << (JAVA - 431)) | (1L << (PLI - 431)) | (1L << (SQL - 431)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(1302);
				match(PARAMETER);
				setState(1303);
				match(STYLE);
				setState(1304);
				_la = _input.LA(1);
				if ( !(_la==JAVA || _la==SQL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 4:
				{
				{
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1305);
					match(NOT);
					}
				}

				setState(1308);
				match(DETERMINISTIC);
				}
				}
				break;
			case 5:
				{
				{
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1309);
					match(NOT);
					}
				}

				setState(1312);
				match(VARIANT);
				}
				}
				break;
			case 6:
				{
				{
				setState(1316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURNS:
					{
					{
					setState(1313);
					match(RETURNS);
					setState(1314);
					match(NULL);
					}
					}
					break;
				case CALLED:
					{
					setState(1315);
					match(CALLED);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1318);
				match(ON);
				setState(1319);
				match(NULL);
				setState(1320);
				match(INPUT);
				}
				}
				break;
			case 7:
				{
				{
				setState(1321);
				match(NULL);
				setState(1322);
				match(CALL);
				}
				}
				break;
			case 8:
				{
				setState(1333);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIES:
					{
					{
					setState(1323);
					match(MODIFIES);
					setState(1324);
					match(SQL);
					setState(1325);
					match(DATA);
					}
					}
					break;
				case READS:
					{
					{
					setState(1326);
					match(READS);
					setState(1327);
					match(SQL);
					setState(1328);
					match(DATA);
					}
					}
					break;
				case CONTAINS:
					{
					{
					setState(1329);
					match(CONTAINS);
					setState(1330);
					match(SQL);
					}
					}
					break;
				case NO:
					{
					{
					setState(1331);
					match(NO);
					setState(1332);
					match(SQL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				{
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1335);
					match(NO);
					}
				}

				setState(1338);
				match(EXTERNAL);
				setState(1339);
				match(ACTION);
				}
				}
				break;
			case 10:
				{
				setState(1346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PACKAGE:
					{
					{
					setState(1340);
					match(PACKAGE);
					setState(1341);
					match(PATH);
					setState(1342);
					packagePath();
					}
					}
					break;
				case NO:
					{
					{
					setState(1343);
					match(NO);
					setState(1344);
					match(PACKAGE);
					setState(1345);
					match(PATH);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 11:
				{
				setState(1352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO:
					{
					{
					setState(1348);
					match(NO);
					setState(1349);
					match(SCRATCHPAD);
					}
					}
					break;
				case SCRATCHPAD:
					{
					{
					setState(1350);
					match(SCRATCHPAD);
					setState(1351);
					match(INTEGERLITERAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 12:
				{
				{
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1354);
					match(NO);
					}
				}

				setState(1357);
				match(FINAL);
				setState(1358);
				match(CALL);
				}
				}
				break;
			case 13:
				{
				{
				setState(1359);
				_la = _input.LA(1);
				if ( !(_la==ALLOW || _la==DISALLOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1360);
				match(PARALLEL);
				}
				}
				break;
			case 14:
				{
				{
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1361);
					match(NO);
					}
				}

				setState(1364);
				match(DBINFO);
				}
				}
				break;
			case 15:
				{
				{
				setState(1365);
				match(CARDINALITY);
				setState(1366);
				match(INTEGERLITERAL);
				}
				}
				break;
			case 16:
				{
				setState(1371);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO:
					{
					{
					setState(1367);
					match(NO);
					setState(1368);
					match(COLLID);
					}
					}
					break;
				case COLLID:
					{
					{
					setState(1369);
					match(COLLID);
					setState(1370);
					collectionID();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 17:
				{
				{
				setState(1373);
				match(WLM);
				setState(1374);
				match(ENVIRONMENT);
				setState(1382);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case AFTER:
				case ALL:
				case ALLOCATE:
				case ALLOW:
				case ALTER:
				case ALTERAND:
				case ANY:
				case ARRAY:
				case ARRAY_EXISTS:
				case AS:
				case ASENSITIVE:
				case ASSOCIATE:
				case ASUTIME:
				case AT:
				case AUDIT:
				case AUX:
				case AUXILIARY:
				case BEFORE:
				case BEGIN:
				case BETWEEN:
				case BUFFERPOOL:
				case BY:
				case CALL:
				case CAPTURE:
				case CASCADED:
				case CASE:
				case CAST:
				case CCSID:
				case CHAR:
				case CHARACTER:
				case CHECK:
				case CLONE:
				case CLOSE:
				case CLUSTER:
				case COLLECTION:
				case COLLID:
				case COLUMN:
				case COMMENT:
				case COMMIT:
				case CONCAT:
				case CONDITION:
				case CONNECT:
				case CONNECTION:
				case CONSTRAINT:
				case CONTAINS:
				case CONTENT:
				case CONTINUE:
				case CREATE:
				case CUBE:
				case CURRENT:
				case CURRENT_LC_CTYPE:
				case CURRVAL:
				case CURSOR:
				case DATA:
				case DATABASE:
				case DAY:
				case DAYS:
				case DBINFO:
				case DECLARE:
				case DEFAULT:
				case DELETE:
				case DESCRIPTOR:
				case DETERMINISTIC:
				case DISABLE:
				case DISALLOW:
				case DISTINCT:
				case DO:
				case DOCUMENT:
				case DOUBLE:
				case DROP:
				case DSSIZE:
				case DYNAMIC:
				case EDITPROC:
				case ELSE:
				case ELSEIF:
				case ENCODING:
				case ENCRYPTION:
				case END:
				case END_EXEC:
				case ENDING:
				case ERASE:
				case ESCAPE:
				case EXCEPT:
				case EXCEPTION:
				case EXEC_SQL:
				case EXECUTE:
				case EXISTS:
				case EXIT:
				case EXPLAIN:
				case EXTERNAL:
				case FENCED:
				case FETCH:
				case FIELDPROC:
				case FINAL:
				case FIRST:
				case FOR:
				case FREE:
				case FROM:
				case FULL:
				case FUNCTION:
				case GENERATED:
				case GET:
				case GLOBAL:
				case GO:
				case GOTO:
				case GRANT:
				case GROUP:
				case HANDLER:
				case HAVING:
				case HOLD:
				case HOUR:
				case HOURS:
				case IF:
				case IMMEDIATE:
				case IN:
				case INCLUSIVE:
				case INDEX:
				case INDEXBP:
				case INHERIT:
				case INNER:
				case INOUT:
				case INSENSITIVE:
				case INSERT:
				case INTERSECT:
				case INTO:
				case IS:
				case ISOBID:
				case ITERATE:
				case JAR:
				case JOIN:
				case KEEP:
				case KEY:
				case LABEL:
				case LANGUAGE:
				case LAST:
				case LC_CTYPE:
				case LEAVE:
				case LEFT:
				case LIKE:
				case LIMIT:
				case LOCAL:
				case LOCALE:
				case LOCATOR:
				case LOCATORS:
				case LOCK:
				case LOCKMAX:
				case LOCKSIZE:
				case LONG:
				case LOOP:
				case MAINTAINED:
				case MATERIALIZED:
				case MICROSECOND:
				case MICROSECONDS:
				case MODIFIES:
				case MONTH:
				case MONTHS:
				case NEXT:
				case NEXTVAL:
				case NO:
				case NONE:
				case NOT:
				case NULL:
				case NULLS:
				case NUMPARTS:
				case OBID:
				case OF:
				case OFFSET:
				case OLD:
				case ON:
				case OPEN:
				case OPTIMIZATION:
				case OPTIMIZE:
				case OR:
				case ORDER:
				case ORGANIZATION:
				case OUT:
				case OUTER:
				case PACKAGE:
				case PADDED:
				case PARAMETER:
				case PART:
				case PARTITION:
				case PARTITIONED:
				case PARTITIONING:
				case PATH:
				case PERIOD:
				case PIECESIZE:
				case PLAN:
				case PRECISION:
				case PREPARE:
				case PREVVAL:
				case PRIOR:
				case PRIQTY:
				case PRIVILEGES:
				case PROCEDURE:
				case PROGRAM:
				case PSID:
				case PUBLIC:
				case QUERY:
				case QUERYNO:
				case READS:
				case REFERENCES:
				case REFRESH:
				case RELEASE:
				case RENAME:
				case REPEAT:
				case RESIGNAL:
				case RESTRICT:
				case RESULT:
				case RESULT_SET_LOCATOR:
				case RETURN:
				case RETURNS:
				case REVOKE:
				case RIGHT:
				case ROLE:
				case ROLLBACK:
				case ROLLUP:
				case ROUND_CEILING:
				case ROUND_DOWN:
				case ROUND_FLOOR:
				case ROUND_HALF_DOWN:
				case ROUND_HALF_EVEN:
				case ROUND_HALF_UP:
				case ROUND_UP:
				case ROW:
				case ROWSET:
				case RUN:
				case SAVEPOINT:
				case SCHEMA:
				case SCRATCHPAD:
				case SECOND:
				case SECONDS:
				case SECQTY:
				case SECURITY:
				case SELECT:
				case SENSITIVE:
				case SEQUENCE:
				case SET:
				case SIGNAL:
				case SIMPLE:
				case SOME:
				case SOURCE:
				case SPECIFIC:
				case STANDARD:
				case STATEMENT:
				case STATIC:
				case STAY:
				case STOGROUP:
				case STORES:
				case STYLE:
				case SUMMARY:
				case SYNONYM:
				case SYSDATE:
				case SYSTEM:
				case SYSTIMESTAMP:
				case TABLE:
				case TABLESPACE:
				case THEN:
				case TO:
				case TRIGGER:
				case TRUNCATE:
				case TYPE:
				case UNDO:
				case UNION:
				case UNIQUE:
				case UNTIL:
				case UPDATE:
				case USING:
				case VALIDPROC:
				case VALUE:
				case VALUES:
				case VARIABLE:
				case VARIANT:
				case VCAT:
				case VERSIONING:
				case VIEW:
				case VOLATILE:
				case VOLUMES:
				case WHEN:
				case WHENEVER:
				case WHERE:
				case WHILE:
				case WITH:
				case WLM:
				case XMLCAST:
				case XMLEXISTS:
				case XMLNAMESPACES:
				case YEAR:
				case YEARS:
				case ZONE:
				case AND:
				case ARRAY_AGG:
				case ASC:
				case AVG:
				case BIT:
				case CHANGE:
				case CODEUNITS16:
				case CODEUNITS32:
				case CORR:
				case CORRELATION:
				case COUNT:
				case COUNT_BIG:
				case COVAR:
				case COVARIANCE:
				case COVARIANCE_SAMP:
				case COVAR_POP:
				case COVAR_SAMP:
				case CS:
				case CUME_DIST:
				case DENSE_RANK:
				case DESC:
				case EBCDIC:
				case EXCLUSIVE:
				case FIRST_VALUE:
				case FOLLOWING:
				case GROUPING:
				case IGNORE:
				case INDICATOR:
				case INPUT:
				case ISNULL:
				case LAG:
				case LARGE:
				case LAST_VALUE:
				case LEAD:
				case LISTAGG:
				case LOCKED:
				case LOCKS:
				case MEDIAN:
				case MINUTES:
				case MIXED:
				case NOTNULL:
				case NTH_VALUE:
				case NTILE:
				case NUMERIC:
				case OBJECT:
				case OCTETS:
				case ONLY:
				case OVER:
				case PASSING:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case PERCENT_RANK:
				case PRECEDING:
				case PREVIOUS:
				case RANGE:
				case RANK:
				case RATIO_TO_REPORT:
				case READ:
				case REF:
				case REGR_AVGX:
				case REGR_AVGY:
				case REGR_COUNT:
				case REGR_ICPT:
				case REGR_INTERCEPT:
				case REGR_R2:
				case REGR_SLOPE:
				case REGR_SXX:
				case REGR_SXY:
				case REGR_SYY:
				case RESPECT:
				case ROW_NUMBER:
				case ROWS:
				case RR:
				case RS:
				case SBCS:
				case SELECTIVITY:
				case SETS:
				case SHARE:
				case SKIP_:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUM:
				case TOKEN:
				case UNBOUNDED:
				case UNPACK:
				case UR:
				case USE:
				case VAR:
				case VARIANCE:
				case VARIANCE_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARYING:
				case WITHOUT:
				case XML:
				case XMLAGG:
				case COLUMNS:
				case SQLID:
				case ORDINALITY:
				case SYSTEM_TIME:
				case BUSINESS_TIME:
				case MULTIPLIER:
				case UNNEST:
				case CROSS:
				case CALLER:
				case CLIENT:
				case POSITIONING:
				case SCROLL:
				case ACTION:
				case ASSEMBLE:
				case C_:
				case CALLED:
				case COBOL:
				case DB2:
				case DEFINER:
				case DISPATCH:
				case ENVIRONMENT:
				case FAILURE:
				case FAILURES:
				case JAVA:
				case MAIN:
				case NAME:
				case OPTIONS:
				case PARALLEL:
				case PLI:
				case REGISTERS:
				case RESIDENT:
				case SECURED:
				case SPECIAL:
				case SQL:
				case STOP:
				case SUB:
				case YES:
				case APPLICATION:
				case CHANGED:
				case COMPATIBILITY:
				case COMPRESS:
				case COPY:
				case FREEPAGE:
				case GBPCACHE:
				case INCLUDE:
				case MAXVALUE:
				case MINVALUE:
				case PCTFREE:
				case REGENERATE:
				case SEQTY:
				case MASK:
				case ENABLE:
				case PERMISSION:
				case ATOMIC:
				case SQLEXCEPTION:
				case MERGE:
				case MATCHED:
				case SQLSTATE:
				case MESSAGE_TEXT:
				case OVERRIDING:
				case PORTION:
				case DB2SQL:
				case DEBUG:
				case GENERAL:
				case MODE_:
				case REXX:
				case ABS:
				case ABSVAL:
				case ACOS:
				case ADD_DAYS:
				case ADD_MONTHS:
				case ARRAY_DELETE:
				case ARRAY_FIRST:
				case ARRAY_LAST:
				case ARRAY_NEXT:
				case ARRAY_PRIOR:
				case ARRAY_TRIM:
				case ASCII:
				case ASCII_CHR:
				case ASCIISTR:
				case ASCII_STR:
				case ASIN:
				case ATAN:
				case ATAN2:
				case ATANH:
				case BIGINT:
				case BINARY:
				case BITAND:
				case BITANDNOT:
				case BITNOT:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BTRIM:
				case CARDINALITY:
				case CCSID_ENCODING:
				case CEIL:
				case CEILING:
				case CHAR9:
				case CHARACTER_LENGTH:
				case CHAR_LENGTH:
				case CHR:
				case CLOB:
				case COALESCE:
				case COLLATION_KEY:
				case COMPARE_DECFLOAT:
				case COS:
				case COSH:
				case DATE:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFWEEK_ISO:
				case DAYOFYEAR:
				case DAYS_BETWEEN:
				case DBCLOB:
				case DEC:
				case DECFLOAT:
				case DECFLOAT_FORMAT:
				case DECFLOAT_SORTKEY:
				case DECIMAL:
				case DECODE:
				case DECRYPT_BINARY:
				case DECRYPT_BIT:
				case DECRYPT_CHAR:
				case DECRYPT_DATAKEY_BIGINT:
				case DECRYPT_DATAKEY_BIT:
				case DECRYPT_DATAKEY_CLOB:
				case DECRYPT_DATAKEY_DBCLOB:
				case DECRYPT_DATAKEY_DECIMAL:
				case DECRYPT_DATAKEY_INTEGER:
				case DECRYPT_DATAKEY_VARCHAR:
				case DECRYPT_DATAKEY_VARGRAPHIC:
				case DECRYPT_DB:
				case DEGREES:
				case DIFFERENCE:
				case DIGITS:
				case DOUBLE_PRECISION:
				case DSN_XMLVALIDATE:
				case EBCDIC_CHR:
				case EBCDIC_STR:
				case ENCRYPT_DATAKEY:
				case ENCRYPT_TDES:
				case EXP:
				case EXTRACT:
				case FLOAT:
				case FLOOR:
				case GENERATE_UNIQUE:
				case GENERATE_UNIQUE_BINARY:
				case GETHINT:
				case GETVARIABLE:
				case GRAPHIC:
				case GREATEST:
				case HASH:
				case HASH_CRC32:
				case HASH_MD5:
				case HASH_SHA1:
				case HASH_SHA256:
				case HEX:
				case IDENTITY_VAL_LOCAL:
				case IFNULL:
				case INSTR:
				case INT:
				case INTEGER:
				case JULIAN_DAY:
				case LAST_DAY:
				case LCASE:
				case LEAST:
				case LENGTH:
				case LN:
				case LOCATE:
				case LOCATE_IN_STRING:
				case LOG10:
				case LOWER:
				case LPAD:
				case LTRIM:
				case MAX:
				case MAX_CARDINALITY:
				case MIDNIGHT_SECONDS:
				case MIN:
				case MINUTE:
				case MOD:
				case MONTHS_BETWEEN:
				case MQREAD:
				case MQREADCLOB:
				case MQRECEIVE:
				case MQRECEIVECLOB:
				case MQSEND:
				case MULTIPLY_ALT:
				case NEXT_DAY:
				case NEXT_MONTH:
				case NORMALIZE_DECFLOAT:
				case NORMALIZE_STRING:
				case NULLIF:
				case NVL:
				case OVERLAY:
				case PACK:
				case POSITION:
				case POSSTR:
				case POW:
				case POWER:
				case QUANTIZE:
				case QUARTER:
				case RADIANS:
				case RAISE_ERROR:
				case RAND:
				case RANDOM:
				case REAL:
				case REGEXP_COUNT:
				case REGEXP_INSTR:
				case REGEXP_LIKE:
				case REGEXP_REPLACE:
				case REGEXP_SUBSTR:
				case REPLACE:
				case RID:
				case ROUND:
				case ROUND_TIMESTAMP:
				case ROWID:
				case RPAD:
				case RTRIM:
				case SCORE:
				case SIGN:
				case SIN:
				case SINH:
				case SMALLINT:
				case SOAPHTTPC:
				case SOAPHTTPNC:
				case SOAPHTTPNV:
				case SOAPHTTPV:
				case SOUNDEX:
				case SPACE:
				case SQRT:
				case STRIP:
				case STRLEFT:
				case STRPOS:
				case STRRIGHT:
				case SUBSTR:
				case SUBSTRING:
				case TAN:
				case TANH:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TIMESTAMP_FORMAT:
				case TIMESTAMP_ISO:
				case TIMESTAMP_TZ:
				case TO_CHAR:
				case TO_CLOB:
				case TO_DATE:
				case TO_NUMBER:
				case TOTALORDER:
				case TO_TIMESTAMP:
				case TRANSLATE:
				case TRIM:
				case TRIM_ARRAY:
				case TRUNC:
				case TRUNC_TIMESTAMP:
				case UCASE:
				case UNICODE:
				case UNICODE_STR:
				case UNISTR:
				case UPPER:
				case VARBINARY:
				case VARCHAR:
				case VARCHAR9:
				case VARCHAR_BIT_FORMAT:
				case VARCHAR_FORMAT:
				case VARGRAPHIC:
				case VERIFY_GROUP_FOR_USER:
				case VERIFY_ROLE_FOR_USER:
				case VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER:
				case WEEK:
				case WEEK_ISO:
				case WRAP:
				case XMLATTRIBUTES:
				case XMLCOMMENT:
				case XMLCONCAT:
				case XMLDOCUMENT:
				case XMLELEMENT:
				case XMLFOREST:
				case XMLMODIFY:
				case XMLPARSE:
				case XMLPI:
				case XMLQUERY:
				case XMLSERIALIZE:
				case XMLTEXT:
				case XMLXSROBJECTID:
				case XSLTRANSFORM:
				case CURRENT_ACCELERATOR:
				case CURRENT_APPLICATION_COMPATIBILITY:
				case CURRENT_APPLICATION_ENCODING_SCHEME:
				case CURRENT_CLIENT_ACCTNG:
				case CURRENT_CLIENT_APPLNAME:
				case CURRENT_CLIENT_CORR_TOKEN:
				case CURRENT_CLIENT_USERID:
				case CURRENT_CLIENT_WRKSTNNAME:
				case CURRENT_DATE:
				case CURRENT_DEBUG_MODE:
				case CURRENT_DECFLOAT_ROUNDING_MODE:
				case CURRENT_DEGREE:
				case CURRENT_EXPLAIN_MODE:
				case CURRENT_GET_ACCEL_ARCHIVE:
				case CURRENT_LOCALE_LC_CTYPE:
				case CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION:
				case CURRENT_MEMBER:
				case CURRENT_OPTIMIZATION_HINT:
				case CURRENT_PACKAGE_PATH:
				case CURRENT_PACKAGESET:
				case CURRENT_PATH:
				case CURRENT_PRECISION:
				case CURRENT_QUERY_ACCELERATION:
				case CURRENT_QUERY_ACCELERATION_WAITFORDATA:
				case CURRENT_REFRESH_AGE:
				case CURRENT_ROUTINE_VERSION:
				case CURRENT_RULES:
				case CURRENT_SCHEMA:
				case CURRENT_SERVER:
				case CURRENT_SQLID:
				case CURRENT_TEMPORAL_BUSINESS_TIME:
				case CURRENT_TEMPORAL_SYSTEM_TIME:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_TIME_ZONE:
				case ENCRYPTION_PASSWORD:
				case SESSION_TIME_ZONE:
				case SESSION_USER:
				case USER:
				case ADMIN_TASK_LIST:
				case ADMIN_TASK_OUTPUT:
				case ADMIN_TASK_STATUS:
				case BLOCKING_THREADS:
				case MQREADALL:
				case MQREADALLCLOB:
				case MQRECEIVEALL:
				case MQRECEIVEALLCLOB:
				case XMLTABLE:
				case SQLIDENTIFIER:
					{
					setState(1375);
					identifier();
					}
					break;
				case LPAREN:
					{
					{
					setState(1376);
					match(LPAREN);
					setState(1377);
					identifier();
					setState(1378);
					match(COMMA);
					setState(1379);
					match(SPLAT);
					setState(1380);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 18:
				{
				{
				setState(1384);
				match(ASUTIME);
				setState(1389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO:
					{
					{
					setState(1385);
					match(NO);
					setState(1386);
					match(LIMIT);
					}
					}
					break;
				case LIMIT:
					{
					{
					setState(1387);
					match(LIMIT);
					setState(1388);
					match(INTEGERLITERAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 19:
				{
				{
				setState(1391);
				match(STAY);
				setState(1392);
				match(RESIDENT);
				setState(1393);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 20:
				{
				{
				setState(1394);
				match(PROGRAM);
				setState(1395);
				match(TYPE);
				setState(1396);
				_la = _input.LA(1);
				if ( !(_la==MAIN || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 21:
				{
				{
				setState(1397);
				match(SECURITY);
				setState(1398);
				_la = _input.LA(1);
				if ( !(_la==DB2 || _la==DEFINER || _la==USER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 22:
				{
				setState(1411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					{
					setState(1399);
					match(STOP);
					setState(1400);
					match(AFTER);
					setState(1401);
					match(SYSTEM);
					setState(1402);
					match(DEFAULT);
					setState(1403);
					match(FAILURES);
					}
					}
					break;
				case 2:
					{
					{
					setState(1404);
					match(STOP);
					setState(1405);
					match(AFTER);
					setState(1406);
					match(INTEGERLITERAL);
					setState(1407);
					match(FAILURES);
					}
					}
					break;
				case 3:
					{
					{
					setState(1408);
					match(CONTINUE);
					setState(1409);
					match(AFTER);
					setState(1410);
					match(FAILURE);
					}
					}
					break;
				}
				}
				break;
			case 23:
				{
				{
				setState(1413);
				match(RUN);
				setState(1414);
				match(OPTIONS);
				setState(1415);
				runTimeOptions();
				}
				}
				break;
			case 24:
				{
				{
				setState(1416);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==INHERIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1417);
				match(SPECIAL);
				setState(1418);
				match(REGISTERS);
				}
				}
				break;
			case 25:
				{
				{
				setState(1419);
				match(STATIC);
				setState(1420);
				match(DISPATCH);
				}
				}
				break;
			case 26:
				{
				{
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1421);
					match(NOT);
					}
				}

				setState(1424);
				match(SECURED);
				}
				}
				break;
			case 27:
				{
				setState(1425);
				match(SPECIFIC);
				}
				break;
			case 28:
				{
				{
				setState(1426);
				match(PARAMETER);
				setState(1427);
				match(CCSID);
				}
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

	public static class ProcedureOptionListContext extends ParserRuleContext {
		public TerminalNode RESULT() { return getToken(DB2zSQLParser.RESULT, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode EXTERNAL() { return getToken(DB2zSQLParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(DB2zSQLParser.NAME, 0); }
		public TerminalNode LANGUAGE() { return getToken(DB2zSQLParser.LANGUAGE, 0); }
		public TerminalNode PARAMETER() { return getToken(DB2zSQLParser.PARAMETER, 0); }
		public TerminalNode STYLE() { return getToken(DB2zSQLParser.STYLE, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(DB2zSQLParser.DETERMINISTIC, 0); }
		public TerminalNode VARIANT() { return getToken(DB2zSQLParser.VARIANT, 0); }
		public TerminalNode DBINFO() { return getToken(DB2zSQLParser.DBINFO, 0); }
		public TerminalNode WLM() { return getToken(DB2zSQLParser.WLM, 0); }
		public TerminalNode ENVIRONMENT() { return getToken(DB2zSQLParser.ENVIRONMENT, 0); }
		public TerminalNode ASUTIME() { return getToken(DB2zSQLParser.ASUTIME, 0); }
		public TerminalNode STAY() { return getToken(DB2zSQLParser.STAY, 0); }
		public TerminalNode RESIDENT() { return getToken(DB2zSQLParser.RESIDENT, 0); }
		public TerminalNode PROGRAM() { return getToken(DB2zSQLParser.PROGRAM, 0); }
		public TerminalNode TYPE() { return getToken(DB2zSQLParser.TYPE, 0); }
		public TerminalNode SECURITY() { return getToken(DB2zSQLParser.SECURITY, 0); }
		public TerminalNode RUN() { return getToken(DB2zSQLParser.RUN, 0); }
		public TerminalNode OPTIONS() { return getToken(DB2zSQLParser.OPTIONS, 0); }
		public RunTimeOptionsContext runTimeOptions() {
			return getRuleContext(RunTimeOptionsContext.class,0);
		}
		public TerminalNode COMMIT() { return getToken(DB2zSQLParser.COMMIT, 0); }
		public TerminalNode ON() { return getToken(DB2zSQLParser.ON, 0); }
		public TerminalNode RETURN() { return getToken(DB2zSQLParser.RETURN, 0); }
		public TerminalNode SPECIAL() { return getToken(DB2zSQLParser.SPECIAL, 0); }
		public TerminalNode REGISTERS() { return getToken(DB2zSQLParser.REGISTERS, 0); }
		public TerminalNode CALLED() { return getToken(DB2zSQLParser.CALLED, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public TerminalNode INPUT() { return getToken(DB2zSQLParser.INPUT, 0); }
		public TerminalNode CALL() { return getToken(DB2zSQLParser.CALL, 0); }
		public TerminalNode DEBUG() { return getToken(DB2zSQLParser.DEBUG, 0); }
		public TerminalNode MODE_() { return getToken(DB2zSQLParser.MODE_, 0); }
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public TerminalNode SETS() { return getToken(DB2zSQLParser.SETS, 0); }
		public TerminalNode ASSEMBLE() { return getToken(DB2zSQLParser.ASSEMBLE, 0); }
		public TerminalNode C_() { return getToken(DB2zSQLParser.C_, 0); }
		public TerminalNode COBOL() { return getToken(DB2zSQLParser.COBOL, 0); }
		public TerminalNode JAVA() { return getToken(DB2zSQLParser.JAVA, 0); }
		public TerminalNode PLI() { return getToken(DB2zSQLParser.PLI, 0); }
		public TerminalNode REXX() { return getToken(DB2zSQLParser.REXX, 0); }
		public TerminalNode NO() { return getToken(DB2zSQLParser.NO, 0); }
		public TerminalNode YES() { return getToken(DB2zSQLParser.YES, 0); }
		public TerminalNode SUB() { return getToken(DB2zSQLParser.SUB, 0); }
		public TerminalNode MAIN() { return getToken(DB2zSQLParser.MAIN, 0); }
		public TerminalNode DB2() { return getToken(DB2zSQLParser.DB2, 0); }
		public TerminalNode USER() { return getToken(DB2zSQLParser.USER, 0); }
		public TerminalNode DEFINER() { return getToken(DB2zSQLParser.DEFINER, 0); }
		public TerminalNode INHERIT() { return getToken(DB2zSQLParser.INHERIT, 0); }
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public TerminalNode DISALLOW() { return getToken(DB2zSQLParser.DISALLOW, 0); }
		public TerminalNode ALLOW() { return getToken(DB2zSQLParser.ALLOW, 0); }
		public TerminalNode DISABLE() { return getToken(DB2zSQLParser.DISABLE, 0); }
		public ExternalProgramNameContext externalProgramName() {
			return getRuleContext(ExternalProgramNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SQL() { return getToken(DB2zSQLParser.SQL, 0); }
		public TerminalNode DB2SQL() { return getToken(DB2zSQLParser.DB2SQL, 0); }
		public TerminalNode GENERAL() { return getToken(DB2zSQLParser.GENERAL, 0); }
		public TerminalNode PACKAGE() { return getToken(DB2zSQLParser.PACKAGE, 0); }
		public TerminalNode PATH() { return getToken(DB2zSQLParser.PATH, 0); }
		public PackagePathContext packagePath() {
			return getRuleContext(PackagePathContext.class,0);
		}
		public TerminalNode MODIFIES() { return getToken(DB2zSQLParser.MODIFIES, 0); }
		public TerminalNode DATA() { return getToken(DB2zSQLParser.DATA, 0); }
		public TerminalNode READS() { return getToken(DB2zSQLParser.READS, 0); }
		public TerminalNode CONTAINS() { return getToken(DB2zSQLParser.CONTAINS, 0); }
		public TerminalNode COLLID() { return getToken(DB2zSQLParser.COLLID, 0); }
		public CollectionIDContext collectionID() {
			return getRuleContext(CollectionIDContext.class,0);
		}
		public TerminalNode STOP() { return getToken(DB2zSQLParser.STOP, 0); }
		public TerminalNode AFTER() { return getToken(DB2zSQLParser.AFTER, 0); }
		public TerminalNode SYSTEM() { return getToken(DB2zSQLParser.SYSTEM, 0); }
		public TerminalNode FAILURES() { return getToken(DB2zSQLParser.FAILURES, 0); }
		public TerminalNode CONTINUE() { return getToken(DB2zSQLParser.CONTINUE, 0); }
		public TerminalNode FAILURE() { return getToken(DB2zSQLParser.FAILURE, 0); }
		public TerminalNode DYNAMIC() { return getToken(DB2zSQLParser.DYNAMIC, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode STANDARD() { return getToken(DB2zSQLParser.STANDARD, 0); }
		public TerminalNode SIMPLE() { return getToken(DB2zSQLParser.SIMPLE, 0); }
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public TerminalNode NULLS() { return getToken(DB2zSQLParser.NULLS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DB2zSQLParser.COMMA, 0); }
		public TerminalNode SPLAT() { return getToken(DB2zSQLParser.SPLAT, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode LIMIT() { return getToken(DB2zSQLParser.LIMIT, 0); }
		public ProcedureOptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOptionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterProcedureOptionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitProcedureOptionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitProcedureOptionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOptionListContext procedureOptionList() throws RecognitionException {
		ProcedureOptionListContext _localctx = new ProcedureOptionListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_procedureOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				{
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DYNAMIC) {
					{
					setState(1430);
					match(DYNAMIC);
					}
				}

				setState(1433);
				match(RESULT);
				setState(1434);
				_la = _input.LA(1);
				if ( !(_la==SET || _la==SETS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1435);
				match(INTEGERLITERAL);
				}
				}
				break;
			case 2:
				{
				{
				setState(1436);
				match(EXTERNAL);
				setState(1437);
				match(NAME);
				setState(1440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1438);
					externalProgramName();
					}
					break;
				case 2:
					{
					setState(1439);
					identifier();
					}
					break;
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(1442);
				match(LANGUAGE);
				setState(1443);
				_la = _input.LA(1);
				if ( !(((((_la - 431)) & ~0x3f) == 0 && ((1L << (_la - 431)) & ((1L << (ASSEMBLE - 431)) | (1L << (C_ - 431)) | (1L << (COBOL - 431)) | (1L << (JAVA - 431)) | (1L << (PLI - 431)) | (1L << (REXX - 431)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 4:
				{
				{
				setState(1444);
				match(PARAMETER);
				setState(1445);
				match(STYLE);
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1446);
					match(SQL);
					}
					break;
				case 2:
					{
					setState(1447);
					match(DB2SQL);
					}
					break;
				case 3:
					{
					{
					setState(1448);
					match(STANDARD);
					setState(1449);
					match(CALL);
					}
					}
					break;
				case 4:
					{
					setState(1450);
					match(GENERAL);
					}
					break;
				case 5:
					{
					{
					setState(1451);
					match(SIMPLE);
					setState(1452);
					match(CALL);
					}
					}
					break;
				case 6:
					{
					{
					setState(1456);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GENERAL:
						{
						setState(1453);
						match(GENERAL);
						}
						break;
					case SIMPLE:
						{
						{
						setState(1454);
						match(SIMPLE);
						setState(1455);
						match(CALL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1458);
					match(WITH);
					setState(1459);
					match(NULLS);
					}
					}
					break;
				case 7:
					{
					setState(1460);
					match(JAVA);
					}
					break;
				}
				}
				}
				break;
			case 5:
				{
				{
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1463);
					match(NOT);
					}
				}

				setState(1466);
				match(DETERMINISTIC);
				}
				}
				break;
			case 6:
				{
				{
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1467);
					match(NOT);
					}
				}

				setState(1470);
				match(VARIANT);
				}
				}
				break;
			case 7:
				{
				setState(1477);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PACKAGE:
					{
					{
					setState(1471);
					match(PACKAGE);
					setState(1472);
					match(PATH);
					setState(1473);
					packagePath();
					}
					}
					break;
				case NO:
					{
					{
					setState(1474);
					match(NO);
					setState(1475);
					match(PACKAGE);
					setState(1476);
					match(PATH);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				{
				setState(1489);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIES:
					{
					{
					setState(1479);
					match(MODIFIES);
					setState(1480);
					match(SQL);
					setState(1481);
					match(DATA);
					}
					}
					break;
				case READS:
					{
					{
					setState(1482);
					match(READS);
					setState(1483);
					match(SQL);
					setState(1484);
					match(DATA);
					}
					}
					break;
				case CONTAINS:
					{
					{
					setState(1485);
					match(CONTAINS);
					setState(1486);
					match(SQL);
					}
					}
					break;
				case NO:
					{
					{
					setState(1487);
					match(NO);
					setState(1488);
					match(SQL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				{
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1491);
					match(NO);
					}
				}

				setState(1494);
				match(DBINFO);
				}
				}
				break;
			case 10:
				{
				setState(1499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO:
					{
					{
					setState(1495);
					match(NO);
					setState(1496);
					match(COLLID);
					}
					}
					break;
				case COLLID:
					{
					{
					setState(1497);
					match(COLLID);
					setState(1498);
					collectionID();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 11:
				{
				{
				setState(1501);
				match(WLM);
				setState(1502);
				match(ENVIRONMENT);
				setState(1510);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case AFTER:
				case ALL:
				case ALLOCATE:
				case ALLOW:
				case ALTER:
				case ALTERAND:
				case ANY:
				case ARRAY:
				case ARRAY_EXISTS:
				case AS:
				case ASENSITIVE:
				case ASSOCIATE:
				case ASUTIME:
				case AT:
				case AUDIT:
				case AUX:
				case AUXILIARY:
				case BEFORE:
				case BEGIN:
				case BETWEEN:
				case BUFFERPOOL:
				case BY:
				case CALL:
				case CAPTURE:
				case CASCADED:
				case CASE:
				case CAST:
				case CCSID:
				case CHAR:
				case CHARACTER:
				case CHECK:
				case CLONE:
				case CLOSE:
				case CLUSTER:
				case COLLECTION:
				case COLLID:
				case COLUMN:
				case COMMENT:
				case COMMIT:
				case CONCAT:
				case CONDITION:
				case CONNECT:
				case CONNECTION:
				case CONSTRAINT:
				case CONTAINS:
				case CONTENT:
				case CONTINUE:
				case CREATE:
				case CUBE:
				case CURRENT:
				case CURRENT_LC_CTYPE:
				case CURRVAL:
				case CURSOR:
				case DATA:
				case DATABASE:
				case DAY:
				case DAYS:
				case DBINFO:
				case DECLARE:
				case DEFAULT:
				case DELETE:
				case DESCRIPTOR:
				case DETERMINISTIC:
				case DISABLE:
				case DISALLOW:
				case DISTINCT:
				case DO:
				case DOCUMENT:
				case DOUBLE:
				case DROP:
				case DSSIZE:
				case DYNAMIC:
				case EDITPROC:
				case ELSE:
				case ELSEIF:
				case ENCODING:
				case ENCRYPTION:
				case END:
				case END_EXEC:
				case ENDING:
				case ERASE:
				case ESCAPE:
				case EXCEPT:
				case EXCEPTION:
				case EXEC_SQL:
				case EXECUTE:
				case EXISTS:
				case EXIT:
				case EXPLAIN:
				case EXTERNAL:
				case FENCED:
				case FETCH:
				case FIELDPROC:
				case FINAL:
				case FIRST:
				case FOR:
				case FREE:
				case FROM:
				case FULL:
				case FUNCTION:
				case GENERATED:
				case GET:
				case GLOBAL:
				case GO:
				case GOTO:
				case GRANT:
				case GROUP:
				case HANDLER:
				case HAVING:
				case HOLD:
				case HOUR:
				case HOURS:
				case IF:
				case IMMEDIATE:
				case IN:
				case INCLUSIVE:
				case INDEX:
				case INDEXBP:
				case INHERIT:
				case INNER:
				case INOUT:
				case INSENSITIVE:
				case INSERT:
				case INTERSECT:
				case INTO:
				case IS:
				case ISOBID:
				case ITERATE:
				case JAR:
				case JOIN:
				case KEEP:
				case KEY:
				case LABEL:
				case LANGUAGE:
				case LAST:
				case LC_CTYPE:
				case LEAVE:
				case LEFT:
				case LIKE:
				case LIMIT:
				case LOCAL:
				case LOCALE:
				case LOCATOR:
				case LOCATORS:
				case LOCK:
				case LOCKMAX:
				case LOCKSIZE:
				case LONG:
				case LOOP:
				case MAINTAINED:
				case MATERIALIZED:
				case MICROSECOND:
				case MICROSECONDS:
				case MODIFIES:
				case MONTH:
				case MONTHS:
				case NEXT:
				case NEXTVAL:
				case NO:
				case NONE:
				case NOT:
				case NULL:
				case NULLS:
				case NUMPARTS:
				case OBID:
				case OF:
				case OFFSET:
				case OLD:
				case ON:
				case OPEN:
				case OPTIMIZATION:
				case OPTIMIZE:
				case OR:
				case ORDER:
				case ORGANIZATION:
				case OUT:
				case OUTER:
				case PACKAGE:
				case PADDED:
				case PARAMETER:
				case PART:
				case PARTITION:
				case PARTITIONED:
				case PARTITIONING:
				case PATH:
				case PERIOD:
				case PIECESIZE:
				case PLAN:
				case PRECISION:
				case PREPARE:
				case PREVVAL:
				case PRIOR:
				case PRIQTY:
				case PRIVILEGES:
				case PROCEDURE:
				case PROGRAM:
				case PSID:
				case PUBLIC:
				case QUERY:
				case QUERYNO:
				case READS:
				case REFERENCES:
				case REFRESH:
				case RELEASE:
				case RENAME:
				case REPEAT:
				case RESIGNAL:
				case RESTRICT:
				case RESULT:
				case RESULT_SET_LOCATOR:
				case RETURN:
				case RETURNS:
				case REVOKE:
				case RIGHT:
				case ROLE:
				case ROLLBACK:
				case ROLLUP:
				case ROUND_CEILING:
				case ROUND_DOWN:
				case ROUND_FLOOR:
				case ROUND_HALF_DOWN:
				case ROUND_HALF_EVEN:
				case ROUND_HALF_UP:
				case ROUND_UP:
				case ROW:
				case ROWSET:
				case RUN:
				case SAVEPOINT:
				case SCHEMA:
				case SCRATCHPAD:
				case SECOND:
				case SECONDS:
				case SECQTY:
				case SECURITY:
				case SELECT:
				case SENSITIVE:
				case SEQUENCE:
				case SET:
				case SIGNAL:
				case SIMPLE:
				case SOME:
				case SOURCE:
				case SPECIFIC:
				case STANDARD:
				case STATEMENT:
				case STATIC:
				case STAY:
				case STOGROUP:
				case STORES:
				case STYLE:
				case SUMMARY:
				case SYNONYM:
				case SYSDATE:
				case SYSTEM:
				case SYSTIMESTAMP:
				case TABLE:
				case TABLESPACE:
				case THEN:
				case TO:
				case TRIGGER:
				case TRUNCATE:
				case TYPE:
				case UNDO:
				case UNION:
				case UNIQUE:
				case UNTIL:
				case UPDATE:
				case USING:
				case VALIDPROC:
				case VALUE:
				case VALUES:
				case VARIABLE:
				case VARIANT:
				case VCAT:
				case VERSIONING:
				case VIEW:
				case VOLATILE:
				case VOLUMES:
				case WHEN:
				case WHENEVER:
				case WHERE:
				case WHILE:
				case WITH:
				case WLM:
				case XMLCAST:
				case XMLEXISTS:
				case XMLNAMESPACES:
				case YEAR:
				case YEARS:
				case ZONE:
				case AND:
				case ARRAY_AGG:
				case ASC:
				case AVG:
				case BIT:
				case CHANGE:
				case CODEUNITS16:
				case CODEUNITS32:
				case CORR:
				case CORRELATION:
				case COUNT:
				case COUNT_BIG:
				case COVAR:
				case COVARIANCE:
				case COVARIANCE_SAMP:
				case COVAR_POP:
				case COVAR_SAMP:
				case CS:
				case CUME_DIST:
				case DENSE_RANK:
				case DESC:
				case EBCDIC:
				case EXCLUSIVE:
				case FIRST_VALUE:
				case FOLLOWING:
				case GROUPING:
				case IGNORE:
				case INDICATOR:
				case INPUT:
				case ISNULL:
				case LAG:
				case LARGE:
				case LAST_VALUE:
				case LEAD:
				case LISTAGG:
				case LOCKED:
				case LOCKS:
				case MEDIAN:
				case MINUTES:
				case MIXED:
				case NOTNULL:
				case NTH_VALUE:
				case NTILE:
				case NUMERIC:
				case OBJECT:
				case OCTETS:
				case ONLY:
				case OVER:
				case PASSING:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case PERCENT_RANK:
				case PRECEDING:
				case PREVIOUS:
				case RANGE:
				case RANK:
				case RATIO_TO_REPORT:
				case READ:
				case REF:
				case REGR_AVGX:
				case REGR_AVGY:
				case REGR_COUNT:
				case REGR_ICPT:
				case REGR_INTERCEPT:
				case REGR_R2:
				case REGR_SLOPE:
				case REGR_SXX:
				case REGR_SXY:
				case REGR_SYY:
				case RESPECT:
				case ROW_NUMBER:
				case ROWS:
				case RR:
				case RS:
				case SBCS:
				case SELECTIVITY:
				case SETS:
				case SHARE:
				case SKIP_:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUM:
				case TOKEN:
				case UNBOUNDED:
				case UNPACK:
				case UR:
				case USE:
				case VAR:
				case VARIANCE:
				case VARIANCE_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARYING:
				case WITHOUT:
				case XML:
				case XMLAGG:
				case COLUMNS:
				case SQLID:
				case ORDINALITY:
				case SYSTEM_TIME:
				case BUSINESS_TIME:
				case MULTIPLIER:
				case UNNEST:
				case CROSS:
				case CALLER:
				case CLIENT:
				case POSITIONING:
				case SCROLL:
				case ACTION:
				case ASSEMBLE:
				case C_:
				case CALLED:
				case COBOL:
				case DB2:
				case DEFINER:
				case DISPATCH:
				case ENVIRONMENT:
				case FAILURE:
				case FAILURES:
				case JAVA:
				case MAIN:
				case NAME:
				case OPTIONS:
				case PARALLEL:
				case PLI:
				case REGISTERS:
				case RESIDENT:
				case SECURED:
				case SPECIAL:
				case SQL:
				case STOP:
				case SUB:
				case YES:
				case APPLICATION:
				case CHANGED:
				case COMPATIBILITY:
				case COMPRESS:
				case COPY:
				case FREEPAGE:
				case GBPCACHE:
				case INCLUDE:
				case MAXVALUE:
				case MINVALUE:
				case PCTFREE:
				case REGENERATE:
				case SEQTY:
				case MASK:
				case ENABLE:
				case PERMISSION:
				case ATOMIC:
				case SQLEXCEPTION:
				case MERGE:
				case MATCHED:
				case SQLSTATE:
				case MESSAGE_TEXT:
				case OVERRIDING:
				case PORTION:
				case DB2SQL:
				case DEBUG:
				case GENERAL:
				case MODE_:
				case REXX:
				case ABS:
				case ABSVAL:
				case ACOS:
				case ADD_DAYS:
				case ADD_MONTHS:
				case ARRAY_DELETE:
				case ARRAY_FIRST:
				case ARRAY_LAST:
				case ARRAY_NEXT:
				case ARRAY_PRIOR:
				case ARRAY_TRIM:
				case ASCII:
				case ASCII_CHR:
				case ASCIISTR:
				case ASCII_STR:
				case ASIN:
				case ATAN:
				case ATAN2:
				case ATANH:
				case BIGINT:
				case BINARY:
				case BITAND:
				case BITANDNOT:
				case BITNOT:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BTRIM:
				case CARDINALITY:
				case CCSID_ENCODING:
				case CEIL:
				case CEILING:
				case CHAR9:
				case CHARACTER_LENGTH:
				case CHAR_LENGTH:
				case CHR:
				case CLOB:
				case COALESCE:
				case COLLATION_KEY:
				case COMPARE_DECFLOAT:
				case COS:
				case COSH:
				case DATE:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFWEEK_ISO:
				case DAYOFYEAR:
				case DAYS_BETWEEN:
				case DBCLOB:
				case DEC:
				case DECFLOAT:
				case DECFLOAT_FORMAT:
				case DECFLOAT_SORTKEY:
				case DECIMAL:
				case DECODE:
				case DECRYPT_BINARY:
				case DECRYPT_BIT:
				case DECRYPT_CHAR:
				case DECRYPT_DATAKEY_BIGINT:
				case DECRYPT_DATAKEY_BIT:
				case DECRYPT_DATAKEY_CLOB:
				case DECRYPT_DATAKEY_DBCLOB:
				case DECRYPT_DATAKEY_DECIMAL:
				case DECRYPT_DATAKEY_INTEGER:
				case DECRYPT_DATAKEY_VARCHAR:
				case DECRYPT_DATAKEY_VARGRAPHIC:
				case DECRYPT_DB:
				case DEGREES:
				case DIFFERENCE:
				case DIGITS:
				case DOUBLE_PRECISION:
				case DSN_XMLVALIDATE:
				case EBCDIC_CHR:
				case EBCDIC_STR:
				case ENCRYPT_DATAKEY:
				case ENCRYPT_TDES:
				case EXP:
				case EXTRACT:
				case FLOAT:
				case FLOOR:
				case GENERATE_UNIQUE:
				case GENERATE_UNIQUE_BINARY:
				case GETHINT:
				case GETVARIABLE:
				case GRAPHIC:
				case GREATEST:
				case HASH:
				case HASH_CRC32:
				case HASH_MD5:
				case HASH_SHA1:
				case HASH_SHA256:
				case HEX:
				case IDENTITY_VAL_LOCAL:
				case IFNULL:
				case INSTR:
				case INT:
				case INTEGER:
				case JULIAN_DAY:
				case LAST_DAY:
				case LCASE:
				case LEAST:
				case LENGTH:
				case LN:
				case LOCATE:
				case LOCATE_IN_STRING:
				case LOG10:
				case LOWER:
				case LPAD:
				case LTRIM:
				case MAX:
				case MAX_CARDINALITY:
				case MIDNIGHT_SECONDS:
				case MIN:
				case MINUTE:
				case MOD:
				case MONTHS_BETWEEN:
				case MQREAD:
				case MQREADCLOB:
				case MQRECEIVE:
				case MQRECEIVECLOB:
				case MQSEND:
				case MULTIPLY_ALT:
				case NEXT_DAY:
				case NEXT_MONTH:
				case NORMALIZE_DECFLOAT:
				case NORMALIZE_STRING:
				case NULLIF:
				case NVL:
				case OVERLAY:
				case PACK:
				case POSITION:
				case POSSTR:
				case POW:
				case POWER:
				case QUANTIZE:
				case QUARTER:
				case RADIANS:
				case RAISE_ERROR:
				case RAND:
				case RANDOM:
				case REAL:
				case REGEXP_COUNT:
				case REGEXP_INSTR:
				case REGEXP_LIKE:
				case REGEXP_REPLACE:
				case REGEXP_SUBSTR:
				case REPLACE:
				case RID:
				case ROUND:
				case ROUND_TIMESTAMP:
				case ROWID:
				case RPAD:
				case RTRIM:
				case SCORE:
				case SIGN:
				case SIN:
				case SINH:
				case SMALLINT:
				case SOAPHTTPC:
				case SOAPHTTPNC:
				case SOAPHTTPNV:
				case SOAPHTTPV:
				case SOUNDEX:
				case SPACE:
				case SQRT:
				case STRIP:
				case STRLEFT:
				case STRPOS:
				case STRRIGHT:
				case SUBSTR:
				case SUBSTRING:
				case TAN:
				case TANH:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TIMESTAMP_FORMAT:
				case TIMESTAMP_ISO:
				case TIMESTAMP_TZ:
				case TO_CHAR:
				case TO_CLOB:
				case TO_DATE:
				case TO_NUMBER:
				case TOTALORDER:
				case TO_TIMESTAMP:
				case TRANSLATE:
				case TRIM:
				case TRIM_ARRAY:
				case TRUNC:
				case TRUNC_TIMESTAMP:
				case UCASE:
				case UNICODE:
				case UNICODE_STR:
				case UNISTR:
				case UPPER:
				case VARBINARY:
				case VARCHAR:
				case VARCHAR9:
				case VARCHAR_BIT_FORMAT:
				case VARCHAR_FORMAT:
				case VARGRAPHIC:
				case VERIFY_GROUP_FOR_USER:
				case VERIFY_ROLE_FOR_USER:
				case VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER:
				case WEEK:
				case WEEK_ISO:
				case WRAP:
				case XMLATTRIBUTES:
				case XMLCOMMENT:
				case XMLCONCAT:
				case XMLDOCUMENT:
				case XMLELEMENT:
				case XMLFOREST:
				case XMLMODIFY:
				case XMLPARSE:
				case XMLPI:
				case XMLQUERY:
				case XMLSERIALIZE:
				case XMLTEXT:
				case XMLXSROBJECTID:
				case XSLTRANSFORM:
				case CURRENT_ACCELERATOR:
				case CURRENT_APPLICATION_COMPATIBILITY:
				case CURRENT_APPLICATION_ENCODING_SCHEME:
				case CURRENT_CLIENT_ACCTNG:
				case CURRENT_CLIENT_APPLNAME:
				case CURRENT_CLIENT_CORR_TOKEN:
				case CURRENT_CLIENT_USERID:
				case CURRENT_CLIENT_WRKSTNNAME:
				case CURRENT_DATE:
				case CURRENT_DEBUG_MODE:
				case CURRENT_DECFLOAT_ROUNDING_MODE:
				case CURRENT_DEGREE:
				case CURRENT_EXPLAIN_MODE:
				case CURRENT_GET_ACCEL_ARCHIVE:
				case CURRENT_LOCALE_LC_CTYPE:
				case CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION:
				case CURRENT_MEMBER:
				case CURRENT_OPTIMIZATION_HINT:
				case CURRENT_PACKAGE_PATH:
				case CURRENT_PACKAGESET:
				case CURRENT_PATH:
				case CURRENT_PRECISION:
				case CURRENT_QUERY_ACCELERATION:
				case CURRENT_QUERY_ACCELERATION_WAITFORDATA:
				case CURRENT_REFRESH_AGE:
				case CURRENT_ROUTINE_VERSION:
				case CURRENT_RULES:
				case CURRENT_SCHEMA:
				case CURRENT_SERVER:
				case CURRENT_SQLID:
				case CURRENT_TEMPORAL_BUSINESS_TIME:
				case CURRENT_TEMPORAL_SYSTEM_TIME:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_TIME_ZONE:
				case ENCRYPTION_PASSWORD:
				case SESSION_TIME_ZONE:
				case SESSION_USER:
				case USER:
				case ADMIN_TASK_LIST:
				case ADMIN_TASK_OUTPUT:
				case ADMIN_TASK_STATUS:
				case BLOCKING_THREADS:
				case MQREADALL:
				case MQREADALLCLOB:
				case MQRECEIVEALL:
				case MQRECEIVEALLCLOB:
				case XMLTABLE:
				case SQLIDENTIFIER:
					{
					setState(1503);
					identifier();
					}
					break;
				case LPAREN:
					{
					{
					setState(1504);
					match(LPAREN);
					setState(1505);
					identifier();
					setState(1506);
					match(COMMA);
					setState(1507);
					match(SPLAT);
					setState(1508);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 12:
				{
				{
				setState(1512);
				match(ASUTIME);
				setState(1517);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO:
					{
					{
					setState(1513);
					match(NO);
					setState(1514);
					match(LIMIT);
					}
					}
					break;
				case LIMIT:
					{
					{
					setState(1515);
					match(LIMIT);
					setState(1516);
					match(INTEGERLITERAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 13:
				{
				{
				setState(1519);
				match(STAY);
				setState(1520);
				match(RESIDENT);
				setState(1521);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 14:
				{
				{
				setState(1522);
				match(PROGRAM);
				setState(1523);
				match(TYPE);
				setState(1524);
				_la = _input.LA(1);
				if ( !(_la==MAIN || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 15:
				{
				{
				setState(1525);
				match(SECURITY);
				setState(1526);
				_la = _input.LA(1);
				if ( !(_la==DB2 || _la==DEFINER || _la==USER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 16:
				{
				{
				setState(1527);
				match(RUN);
				setState(1528);
				match(OPTIONS);
				setState(1529);
				runTimeOptions();
				}
				}
				break;
			case 17:
				{
				{
				setState(1530);
				match(COMMIT);
				setState(1531);
				match(ON);
				setState(1532);
				match(RETURN);
				setState(1533);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 18:
				{
				{
				setState(1534);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==INHERIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1535);
				match(SPECIAL);
				setState(1536);
				match(REGISTERS);
				}
				}
				break;
			case 19:
				{
				{
				setState(1537);
				match(CALLED);
				setState(1538);
				match(ON);
				setState(1539);
				match(NULL);
				setState(1540);
				match(INPUT);
				}
				}
				break;
			case 20:
				{
				{
				setState(1541);
				match(NULL);
				setState(1542);
				match(CALL);
				}
				}
				break;
			case 21:
				{
				setState(1555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					{
					setState(1543);
					match(STOP);
					setState(1544);
					match(AFTER);
					setState(1545);
					match(SYSTEM);
					setState(1546);
					match(DEFAULT);
					setState(1547);
					match(FAILURES);
					}
					}
					break;
				case 2:
					{
					{
					setState(1548);
					match(STOP);
					setState(1549);
					match(AFTER);
					setState(1550);
					match(INTEGERLITERAL);
					setState(1551);
					match(FAILURES);
					}
					}
					break;
				case 3:
					{
					{
					setState(1552);
					match(CONTINUE);
					setState(1553);
					match(AFTER);
					setState(1554);
					match(FAILURE);
					}
					}
					break;
				}
				}
				break;
			case 22:
				{
				{
				setState(1557);
				_la = _input.LA(1);
				if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (ALLOW - 33)) | (1L << (DISABLE - 33)) | (1L << (DISALLOW - 33)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1558);
				match(DEBUG);
				setState(1559);
				match(MODE_);
				}
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

	public static class ExternalProgramNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public ExternalProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalProgramName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterExternalProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitExternalProgramName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitExternalProgramName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalProgramNameContext externalProgramName() throws RecognitionException {
		ExternalProgramNameContext _localctx = new ExternalProgramNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_externalProgramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case AFTER:
			case ALL:
			case ALLOCATE:
			case ALLOW:
			case ALTER:
			case ALTERAND:
			case ANY:
			case ARRAY:
			case ARRAY_EXISTS:
			case AS:
			case ASENSITIVE:
			case ASSOCIATE:
			case ASUTIME:
			case AT:
			case AUDIT:
			case AUX:
			case AUXILIARY:
			case BEFORE:
			case BEGIN:
			case BETWEEN:
			case BUFFERPOOL:
			case BY:
			case CALL:
			case CAPTURE:
			case CASCADED:
			case CASE:
			case CAST:
			case CCSID:
			case CHAR:
			case CHARACTER:
			case CHECK:
			case CLONE:
			case CLOSE:
			case CLUSTER:
			case COLLECTION:
			case COLLID:
			case COLUMN:
			case COMMENT:
			case COMMIT:
			case CONCAT:
			case CONDITION:
			case CONNECT:
			case CONNECTION:
			case CONSTRAINT:
			case CONTAINS:
			case CONTENT:
			case CONTINUE:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_LC_CTYPE:
			case CURRVAL:
			case CURSOR:
			case DATA:
			case DATABASE:
			case DAY:
			case DAYS:
			case DBINFO:
			case DECLARE:
			case DEFAULT:
			case DELETE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DISABLE:
			case DISALLOW:
			case DISTINCT:
			case DO:
			case DOCUMENT:
			case DOUBLE:
			case DROP:
			case DSSIZE:
			case DYNAMIC:
			case EDITPROC:
			case ELSE:
			case ELSEIF:
			case ENCODING:
			case ENCRYPTION:
			case END:
			case END_EXEC:
			case ENDING:
			case ERASE:
			case ESCAPE:
			case EXCEPT:
			case EXCEPTION:
			case EXEC_SQL:
			case EXECUTE:
			case EXISTS:
			case EXIT:
			case EXPLAIN:
			case EXTERNAL:
			case FENCED:
			case FETCH:
			case FIELDPROC:
			case FINAL:
			case FIRST:
			case FOR:
			case FREE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANT:
			case GROUP:
			case HANDLER:
			case HAVING:
			case HOLD:
			case HOUR:
			case HOURS:
			case IF:
			case IMMEDIATE:
			case IN:
			case INCLUSIVE:
			case INDEX:
			case INDEXBP:
			case INHERIT:
			case INNER:
			case INOUT:
			case INSENSITIVE:
			case INSERT:
			case INTERSECT:
			case INTO:
			case IS:
			case ISOBID:
			case ITERATE:
			case JAR:
			case JOIN:
			case KEEP:
			case KEY:
			case LABEL:
			case LANGUAGE:
			case LAST:
			case LC_CTYPE:
			case LEAVE:
			case LEFT:
			case LIKE:
			case LIMIT:
			case LOCAL:
			case LOCALE:
			case LOCATOR:
			case LOCATORS:
			case LOCK:
			case LOCKMAX:
			case LOCKSIZE:
			case LONG:
			case LOOP:
			case MAINTAINED:
			case MATERIALIZED:
			case MICROSECOND:
			case MICROSECONDS:
			case MODIFIES:
			case MONTH:
			case MONTHS:
			case NEXT:
			case NEXTVAL:
			case NO:
			case NONE:
			case NOT:
			case NULL:
			case NULLS:
			case NUMPARTS:
			case OBID:
			case OF:
			case OFFSET:
			case OLD:
			case ON:
			case OPEN:
			case OPTIMIZATION:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case ORGANIZATION:
			case OUT:
			case OUTER:
			case PACKAGE:
			case PADDED:
			case PARAMETER:
			case PART:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONING:
			case PATH:
			case PERIOD:
			case PIECESIZE:
			case PLAN:
			case PRECISION:
			case PREPARE:
			case PREVVAL:
			case PRIOR:
			case PRIQTY:
			case PRIVILEGES:
			case PROCEDURE:
			case PROGRAM:
			case PSID:
			case PUBLIC:
			case QUERY:
			case QUERYNO:
			case READS:
			case REFERENCES:
			case REFRESH:
			case RELEASE:
			case RENAME:
			case REPEAT:
			case RESIGNAL:
			case RESTRICT:
			case RESULT:
			case RESULT_SET_LOCATOR:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUND_CEILING:
			case ROUND_DOWN:
			case ROUND_FLOOR:
			case ROUND_HALF_DOWN:
			case ROUND_HALF_EVEN:
			case ROUND_HALF_UP:
			case ROUND_UP:
			case ROW:
			case ROWSET:
			case RUN:
			case SAVEPOINT:
			case SCHEMA:
			case SCRATCHPAD:
			case SECOND:
			case SECONDS:
			case SECQTY:
			case SECURITY:
			case SELECT:
			case SENSITIVE:
			case SEQUENCE:
			case SET:
			case SIGNAL:
			case SIMPLE:
			case SOME:
			case SOURCE:
			case SPECIFIC:
			case STANDARD:
			case STATEMENT:
			case STATIC:
			case STAY:
			case STOGROUP:
			case STORES:
			case STYLE:
			case SUMMARY:
			case SYNONYM:
			case SYSDATE:
			case SYSTEM:
			case SYSTIMESTAMP:
			case TABLE:
			case TABLESPACE:
			case THEN:
			case TO:
			case TRIGGER:
			case TRUNCATE:
			case TYPE:
			case UNDO:
			case UNION:
			case UNIQUE:
			case UNTIL:
			case UPDATE:
			case USING:
			case VALIDPROC:
			case VALUE:
			case VALUES:
			case VARIABLE:
			case VARIANT:
			case VCAT:
			case VERSIONING:
			case VIEW:
			case VOLATILE:
			case VOLUMES:
			case WHEN:
			case WHENEVER:
			case WHERE:
			case WHILE:
			case WITH:
			case WLM:
			case XMLCAST:
			case XMLEXISTS:
			case XMLNAMESPACES:
			case YEAR:
			case YEARS:
			case ZONE:
			case AND:
			case ARRAY_AGG:
			case ASC:
			case AVG:
			case BIT:
			case CHANGE:
			case CODEUNITS16:
			case CODEUNITS32:
			case CORR:
			case CORRELATION:
			case COUNT:
			case COUNT_BIG:
			case COVAR:
			case COVARIANCE:
			case COVARIANCE_SAMP:
			case COVAR_POP:
			case COVAR_SAMP:
			case CS:
			case CUME_DIST:
			case DENSE_RANK:
			case DESC:
			case EBCDIC:
			case EXCLUSIVE:
			case FIRST_VALUE:
			case FOLLOWING:
			case GROUPING:
			case IGNORE:
			case INDICATOR:
			case INPUT:
			case ISNULL:
			case LAG:
			case LARGE:
			case LAST_VALUE:
			case LEAD:
			case LISTAGG:
			case LOCKED:
			case LOCKS:
			case MEDIAN:
			case MINUTES:
			case MIXED:
			case NOTNULL:
			case NTH_VALUE:
			case NTILE:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case ONLY:
			case OVER:
			case PASSING:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PRECEDING:
			case PREVIOUS:
			case RANGE:
			case RANK:
			case RATIO_TO_REPORT:
			case READ:
			case REF:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_ICPT:
			case REGR_INTERCEPT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case RESPECT:
			case ROW_NUMBER:
			case ROWS:
			case RR:
			case RS:
			case SBCS:
			case SELECTIVITY:
			case SETS:
			case SHARE:
			case SKIP_:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUM:
			case TOKEN:
			case UNBOUNDED:
			case UNPACK:
			case UR:
			case USE:
			case VAR:
			case VARIANCE:
			case VARIANCE_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARYING:
			case WITHOUT:
			case XML:
			case XMLAGG:
			case COLUMNS:
			case SQLID:
			case ORDINALITY:
			case SYSTEM_TIME:
			case BUSINESS_TIME:
			case MULTIPLIER:
			case UNNEST:
			case CROSS:
			case CALLER:
			case CLIENT:
			case POSITIONING:
			case SCROLL:
			case ACTION:
			case ASSEMBLE:
			case C_:
			case CALLED:
			case COBOL:
			case DB2:
			case DEFINER:
			case DISPATCH:
			case ENVIRONMENT:
			case FAILURE:
			case FAILURES:
			case JAVA:
			case MAIN:
			case NAME:
			case OPTIONS:
			case PARALLEL:
			case PLI:
			case REGISTERS:
			case RESIDENT:
			case SECURED:
			case SPECIAL:
			case SQL:
			case STOP:
			case SUB:
			case YES:
			case APPLICATION:
			case CHANGED:
			case COMPATIBILITY:
			case COMPRESS:
			case COPY:
			case FREEPAGE:
			case GBPCACHE:
			case INCLUDE:
			case MAXVALUE:
			case MINVALUE:
			case PCTFREE:
			case REGENERATE:
			case SEQTY:
			case MASK:
			case ENABLE:
			case PERMISSION:
			case ATOMIC:
			case SQLEXCEPTION:
			case MERGE:
			case MATCHED:
			case SQLSTATE:
			case MESSAGE_TEXT:
			case OVERRIDING:
			case PORTION:
			case DB2SQL:
			case DEBUG:
			case GENERAL:
			case MODE_:
			case REXX:
			case ABS:
			case ABSVAL:
			case ACOS:
			case ADD_DAYS:
			case ADD_MONTHS:
			case ARRAY_DELETE:
			case ARRAY_FIRST:
			case ARRAY_LAST:
			case ARRAY_NEXT:
			case ARRAY_PRIOR:
			case ARRAY_TRIM:
			case ASCII:
			case ASCII_CHR:
			case ASCIISTR:
			case ASCII_STR:
			case ASIN:
			case ATAN:
			case ATAN2:
			case ATANH:
			case BIGINT:
			case BINARY:
			case BITAND:
			case BITANDNOT:
			case BITNOT:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BTRIM:
			case CARDINALITY:
			case CCSID_ENCODING:
			case CEIL:
			case CEILING:
			case CHAR9:
			case CHARACTER_LENGTH:
			case CHAR_LENGTH:
			case CHR:
			case CLOB:
			case COALESCE:
			case COLLATION_KEY:
			case COMPARE_DECFLOAT:
			case COS:
			case COSH:
			case DATE:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFWEEK_ISO:
			case DAYOFYEAR:
			case DAYS_BETWEEN:
			case DBCLOB:
			case DEC:
			case DECFLOAT:
			case DECFLOAT_FORMAT:
			case DECFLOAT_SORTKEY:
			case DECIMAL:
			case DECODE:
			case DECRYPT_BINARY:
			case DECRYPT_BIT:
			case DECRYPT_CHAR:
			case DECRYPT_DATAKEY_BIGINT:
			case DECRYPT_DATAKEY_BIT:
			case DECRYPT_DATAKEY_CLOB:
			case DECRYPT_DATAKEY_DBCLOB:
			case DECRYPT_DATAKEY_DECIMAL:
			case DECRYPT_DATAKEY_INTEGER:
			case DECRYPT_DATAKEY_VARCHAR:
			case DECRYPT_DATAKEY_VARGRAPHIC:
			case DECRYPT_DB:
			case DEGREES:
			case DIFFERENCE:
			case DIGITS:
			case DOUBLE_PRECISION:
			case DSN_XMLVALIDATE:
			case EBCDIC_CHR:
			case EBCDIC_STR:
			case ENCRYPT_DATAKEY:
			case ENCRYPT_TDES:
			case EXP:
			case EXTRACT:
			case FLOAT:
			case FLOOR:
			case GENERATE_UNIQUE:
			case GENERATE_UNIQUE_BINARY:
			case GETHINT:
			case GETVARIABLE:
			case GRAPHIC:
			case GREATEST:
			case HASH:
			case HASH_CRC32:
			case HASH_MD5:
			case HASH_SHA1:
			case HASH_SHA256:
			case HEX:
			case IDENTITY_VAL_LOCAL:
			case IFNULL:
			case INSTR:
			case INT:
			case INTEGER:
			case JULIAN_DAY:
			case LAST_DAY:
			case LCASE:
			case LEAST:
			case LENGTH:
			case LN:
			case LOCATE:
			case LOCATE_IN_STRING:
			case LOG10:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAX:
			case MAX_CARDINALITY:
			case MIDNIGHT_SECONDS:
			case MIN:
			case MINUTE:
			case MOD:
			case MONTHS_BETWEEN:
			case MQREAD:
			case MQREADCLOB:
			case MQRECEIVE:
			case MQRECEIVECLOB:
			case MQSEND:
			case MULTIPLY_ALT:
			case NEXT_DAY:
			case NEXT_MONTH:
			case NORMALIZE_DECFLOAT:
			case NORMALIZE_STRING:
			case NULLIF:
			case NVL:
			case OVERLAY:
			case PACK:
			case POSITION:
			case POSSTR:
			case POW:
			case POWER:
			case QUANTIZE:
			case QUARTER:
			case RADIANS:
			case RAISE_ERROR:
			case RAND:
			case RANDOM:
			case REAL:
			case REGEXP_COUNT:
			case REGEXP_INSTR:
			case REGEXP_LIKE:
			case REGEXP_REPLACE:
			case REGEXP_SUBSTR:
			case REPLACE:
			case RID:
			case ROUND:
			case ROUND_TIMESTAMP:
			case ROWID:
			case RPAD:
			case RTRIM:
			case SCORE:
			case SIGN:
			case SIN:
			case SINH:
			case SMALLINT:
			case SOAPHTTPC:
			case SOAPHTTPNC:
			case SOAPHTTPNV:
			case SOAPHTTPV:
			case SOUNDEX:
			case SPACE:
			case SQRT:
			case STRIP:
			case STRLEFT:
			case STRPOS:
			case STRRIGHT:
			case SUBSTR:
			case SUBSTRING:
			case TAN:
			case TANH:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TIMESTAMP_FORMAT:
			case TIMESTAMP_ISO:
			case TIMESTAMP_TZ:
			case TO_CHAR:
			case TO_CLOB:
			case TO_DATE:
			case TO_NUMBER:
			case TOTALORDER:
			case TO_TIMESTAMP:
			case TRANSLATE:
			case TRIM:
			case TRIM_ARRAY:
			case TRUNC:
			case TRUNC_TIMESTAMP:
			case UCASE:
			case UNICODE:
			case UNICODE_STR:
			case UNISTR:
			case UPPER:
			case VARBINARY:
			case VARCHAR:
			case VARCHAR9:
			case VARCHAR_BIT_FORMAT:
			case VARCHAR_FORMAT:
			case VARGRAPHIC:
			case VERIFY_GROUP_FOR_USER:
			case VERIFY_ROLE_FOR_USER:
			case VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER:
			case WEEK:
			case WEEK_ISO:
			case WRAP:
			case XMLATTRIBUTES:
			case XMLCOMMENT:
			case XMLCONCAT:
			case XMLDOCUMENT:
			case XMLELEMENT:
			case XMLFOREST:
			case XMLMODIFY:
			case XMLPARSE:
			case XMLPI:
			case XMLQUERY:
			case XMLSERIALIZE:
			case XMLTEXT:
			case XMLXSROBJECTID:
			case XSLTRANSFORM:
			case CURRENT_ACCELERATOR:
			case CURRENT_APPLICATION_COMPATIBILITY:
			case CURRENT_APPLICATION_ENCODING_SCHEME:
			case CURRENT_CLIENT_ACCTNG:
			case CURRENT_CLIENT_APPLNAME:
			case CURRENT_CLIENT_CORR_TOKEN:
			case CURRENT_CLIENT_USERID:
			case CURRENT_CLIENT_WRKSTNNAME:
			case CURRENT_DATE:
			case CURRENT_DEBUG_MODE:
			case CURRENT_DECFLOAT_ROUNDING_MODE:
			case CURRENT_DEGREE:
			case CURRENT_EXPLAIN_MODE:
			case CURRENT_GET_ACCEL_ARCHIVE:
			case CURRENT_LOCALE_LC_CTYPE:
			case CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION:
			case CURRENT_MEMBER:
			case CURRENT_OPTIMIZATION_HINT:
			case CURRENT_PACKAGE_PATH:
			case CURRENT_PACKAGESET:
			case CURRENT_PATH:
			case CURRENT_PRECISION:
			case CURRENT_QUERY_ACCELERATION:
			case CURRENT_QUERY_ACCELERATION_WAITFORDATA:
			case CURRENT_REFRESH_AGE:
			case CURRENT_ROUTINE_VERSION:
			case CURRENT_RULES:
			case CURRENT_SCHEMA:
			case CURRENT_SERVER:
			case CURRENT_SQLID:
			case CURRENT_TEMPORAL_BUSINESS_TIME:
			case CURRENT_TEMPORAL_SYSTEM_TIME:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_TIME_ZONE:
			case ENCRYPTION_PASSWORD:
			case SESSION_TIME_ZONE:
			case SESSION_USER:
			case USER:
			case ADMIN_TASK_LIST:
			case ADMIN_TASK_OUTPUT:
			case ADMIN_TASK_STATUS:
			case BLOCKING_THREADS:
			case MQREADALL:
			case MQREADALLCLOB:
			case MQRECEIVEALL:
			case MQRECEIVEALLCLOB:
			case XMLTABLE:
			case SQLIDENTIFIER:
				{
				setState(1562);
				identifier();
				}
				break;
			case NONNUMERICLITERAL:
				{
				setState(1563);
				match(NONNUMERICLITERAL);
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

	public static class PackagePathContext extends ParserRuleContext {
		public CollectionIDContext collectionID() {
			return getRuleContext(CollectionIDContext.class,0);
		}
		public TerminalNode SESSION_USER() { return getToken(DB2zSQLParser.SESSION_USER, 0); }
		public TerminalNode USER() { return getToken(DB2zSQLParser.USER, 0); }
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public TerminalNode CURRENT() { return getToken(DB2zSQLParser.CURRENT, 0); }
		public TerminalNode PACKAGE() { return getToken(DB2zSQLParser.PACKAGE, 0); }
		public TerminalNode PATH() { return getToken(DB2zSQLParser.PATH, 0); }
		public PackagePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPackagePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPackagePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPackagePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagePathContext packagePath() throws RecognitionException {
		PackagePathContext _localctx = new PackagePathContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_packagePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1566);
				collectionID();
				}
				break;
			case 2:
				{
				setState(1567);
				match(SESSION_USER);
				}
				break;
			case 3:
				{
				setState(1568);
				match(USER);
				}
				break;
			case 4:
				{
				{
				setState(1569);
				match(CURRENT);
				setState(1570);
				match(PACKAGE);
				setState(1571);
				match(PATH);
				}
				}
				break;
			case 5:
				{
				{
				setState(1572);
				match(CURRENT);
				setState(1573);
				match(PATH);
				}
				}
				break;
			case 6:
				{
				setState(1574);
				hostVariable();
				}
				break;
			case 7:
				{
				setState(1575);
				match(NONNUMERICLITERAL);
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

	public static class CollectionIDContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CollectionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCollectionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCollectionID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCollectionID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionIDContext collectionID() throws RecognitionException {
		CollectionIDContext _localctx = new CollectionIDContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_collectionID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunTimeOptionsContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public RunTimeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runTimeOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRunTimeOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRunTimeOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRunTimeOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunTimeOptionsContext runTimeOptions() throws RecognitionException {
		RunTimeOptionsContext _localctx = new RunTimeOptionsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_runTimeOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(NONNUMERICLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(DB2zSQLParser.EQ, 0); }
		public TerminalNode GT() { return getToken(DB2zSQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(DB2zSQLParser.LT, 0); }
		public TerminalNode GE() { return getToken(DB2zSQLParser.GE, 0); }
		public TerminalNode LE() { return getToken(DB2zSQLParser.LE, 0); }
		public TerminalNode NE() { return getToken(DB2zSQLParser.NE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE) | (1L << NE))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SPLAT() { return getToken(DB2zSQLParser.SPLAT, 0); }
		public TerminalNode PLUS() { return getToken(DB2zSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DB2zSQLParser.MINUS, 0); }
		public TerminalNode SLASH() { return getToken(DB2zSQLParser.SLASH, 0); }
		public TerminalNode CONCAT() { return getToken(DB2zSQLParser.CONCAT, 0); }
		public TerminalNode CONCATOP() { return getToken(DB2zSQLParser.CONCATOP, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (PLUS - 12)) | (1L << (MINUS - 12)) | (1L << (SPLAT - 12)) | (1L << (SLASH - 12)) | (1L << (CONCATOP - 12)) | (1L << (CONCAT - 12)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public SpecialRegisterContext specialRegister() {
			return getRuleContext(SpecialRegisterContext.class,0);
		}
		public ScalarFullSelectContext scalarFullSelect() {
			return getRuleContext(ScalarFullSelectContext.class,0);
		}
		public TimeZoneSpecificExpressionContext timeZoneSpecificExpression() {
			return getRuleContext(TimeZoneSpecificExpressionContext.class,0);
		}
		public LabeledDurationContext labeledDuration() {
			return getRuleContext(LabeledDurationContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public CastSpecificationContext castSpecification() {
			return getRuleContext(CastSpecificationContext.class,0);
		}
		public XmlCastSpecificationContext xmlCastSpecification() {
			return getRuleContext(XmlCastSpecificationContext.class,0);
		}
		public ArrayElementSpecificationContext arrayElementSpecification() {
			return getRuleContext(ArrayElementSpecificationContext.class,0);
		}
		public ArrayConstructorContext arrayConstructor() {
			return getRuleContext(ArrayConstructorContext.class,0);
		}
		public OlapSpecificationContext olapSpecification() {
			return getRuleContext(OlapSpecificationContext.class,0);
		}
		public RowChangeExpressionContext rowChangeExpression() {
			return getRuleContext(RowChangeExpressionContext.class,0);
		}
		public SequenceReferenceContext sequenceReference() {
			return getRuleContext(SequenceReferenceContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1586);
				functionInvocation();
				}
				break;
			case 2:
				{
				setState(1587);
				literal();
				}
				break;
			case 3:
				{
				setState(1588);
				columnName();
				}
				break;
			case 4:
				{
				setState(1589);
				hostVariable();
				}
				break;
			case 5:
				{
				setState(1590);
				specialRegister();
				}
				break;
			case 6:
				{
				setState(1591);
				scalarFullSelect();
				}
				break;
			case 7:
				{
				setState(1592);
				timeZoneSpecificExpression();
				}
				break;
			case 8:
				{
				setState(1593);
				labeledDuration();
				}
				break;
			case 9:
				{
				setState(1594);
				caseExpression();
				}
				break;
			case 10:
				{
				setState(1595);
				castSpecification();
				}
				break;
			case 11:
				{
				setState(1596);
				xmlCastSpecification();
				}
				break;
			case 12:
				{
				setState(1597);
				arrayElementSpecification();
				}
				break;
			case 13:
				{
				setState(1598);
				arrayConstructor();
				}
				break;
			case 14:
				{
				setState(1599);
				olapSpecification();
				}
				break;
			case 15:
				{
				setState(1600);
				rowChangeExpression();
				}
				break;
			case 16:
				{
				setState(1601);
				sequenceReference();
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

	public static class RowChangeExpressionContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public TerminalNode CHANGE() { return getToken(DB2zSQLParser.CHANGE, 0); }
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TIMESTAMP() { return getToken(DB2zSQLParser.TIMESTAMP, 0); }
		public TerminalNode TOKEN() { return getToken(DB2zSQLParser.TOKEN, 0); }
		public RowChangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowChangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRowChangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRowChangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRowChangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowChangeExpressionContext rowChangeExpression() throws RecognitionException {
		RowChangeExpressionContext _localctx = new RowChangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_rowChangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			match(ROW);
			setState(1605);
			match(CHANGE);
			setState(1606);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==TIMESTAMP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1607);
			match(FOR);
			setState(1608);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceReferenceContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(DB2zSQLParser.VALUE, 0); }
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(DB2zSQLParser.NEXT, 0); }
		public TerminalNode PREVIOUS() { return getToken(DB2zSQLParser.PREVIOUS, 0); }
		public SequenceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSequenceReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSequenceReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSequenceReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceReferenceContext sequenceReference() throws RecognitionException {
		SequenceReferenceContext _localctx = new SequenceReferenceContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sequenceReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			_la = _input.LA(1);
			if ( !(_la==NEXT || _la==PREVIOUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1611);
			match(VALUE);
			setState(1612);
			match(FOR);
			setState(1613);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInvocationContext extends ParserRuleContext {
		public ScalarFunctionInvocationContext scalarFunctionInvocation() {
			return getRuleContext(ScalarFunctionInvocationContext.class,0);
		}
		public AggregateFunctionInvocationContext aggregateFunctionInvocation() {
			return getRuleContext(AggregateFunctionInvocationContext.class,0);
		}
		public RegressionFunctionInvocationContext regressionFunctionInvocation() {
			return getRuleContext(RegressionFunctionInvocationContext.class,0);
		}
		public ExternalFunctionInvocationContext externalFunctionInvocation() {
			return getRuleContext(ExternalFunctionInvocationContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1615);
				scalarFunctionInvocation();
				}
				break;
			case 2:
				{
				setState(1616);
				aggregateFunctionInvocation();
				}
				break;
			case 3:
				{
				setState(1617);
				regressionFunctionInvocation();
				}
				break;
			case 4:
				{
				setState(1618);
				externalFunctionInvocation();
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

	public static class ScalarFunctionInvocationContext extends ParserRuleContext {
		public ScalarFunctionContext scalarFunction() {
			return getRuleContext(ScalarFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public ScalarFunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarFunctionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterScalarFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitScalarFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitScalarFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarFunctionInvocationContext scalarFunctionInvocation() throws RecognitionException {
		ScalarFunctionInvocationContext _localctx = new ScalarFunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_scalarFunctionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1621);
				schemaName();
				setState(1622);
				match(DOT);
				}
				break;
			}
			setState(1626);
			scalarFunction();
			setState(1627);
			match(LPAREN);
			setState(1628);
			expression();
			setState(1633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1629);
				match(COMMA);
				setState(1630);
				expression();
				}
				}
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1636);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateFunctionInvocationContext extends ParserRuleContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SPLAT() { return getToken(DB2zSQLParser.SPLAT, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public TerminalNode DISTINCT() { return getToken(DB2zSQLParser.DISTINCT, 0); }
		public AggregateFunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunctionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAggregateFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAggregateFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAggregateFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionInvocationContext aggregateFunctionInvocation() throws RecognitionException {
		AggregateFunctionInvocationContext _localctx = new AggregateFunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_aggregateFunctionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1638);
				schemaName();
				setState(1639);
				match(DOT);
				}
				break;
			}
			setState(1643);
			aggregateFunction();
			setState(1644);
			match(LPAREN);
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1645);
				match(DISTINCT);
				}
				break;
			}
			setState(1650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case COLON:
			case NONNUMERICLITERAL:
			case INTEGERLITERAL:
			case NUMERICLITERAL:
			case ADD:
			case AFTER:
			case ALL:
			case ALLOCATE:
			case ALLOW:
			case ALTER:
			case ALTERAND:
			case ANY:
			case ARRAY:
			case ARRAY_EXISTS:
			case AS:
			case ASENSITIVE:
			case ASSOCIATE:
			case ASUTIME:
			case AT:
			case AUDIT:
			case AUX:
			case AUXILIARY:
			case BEFORE:
			case BEGIN:
			case BETWEEN:
			case BUFFERPOOL:
			case BY:
			case CALL:
			case CAPTURE:
			case CASCADED:
			case CASE:
			case CAST:
			case CCSID:
			case CHAR:
			case CHARACTER:
			case CHECK:
			case CLONE:
			case CLOSE:
			case CLUSTER:
			case COLLECTION:
			case COLLID:
			case COLUMN:
			case COMMENT:
			case COMMIT:
			case CONCAT:
			case CONDITION:
			case CONNECT:
			case CONNECTION:
			case CONSTRAINT:
			case CONTAINS:
			case CONTENT:
			case CONTINUE:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_LC_CTYPE:
			case CURRVAL:
			case CURSOR:
			case DATA:
			case DATABASE:
			case DAY:
			case DAYS:
			case DBINFO:
			case DECLARE:
			case DEFAULT:
			case DELETE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DISABLE:
			case DISALLOW:
			case DISTINCT:
			case DO:
			case DOCUMENT:
			case DOUBLE:
			case DROP:
			case DSSIZE:
			case DYNAMIC:
			case EDITPROC:
			case ELSE:
			case ELSEIF:
			case ENCODING:
			case ENCRYPTION:
			case END:
			case END_EXEC:
			case ENDING:
			case ERASE:
			case ESCAPE:
			case EXCEPT:
			case EXCEPTION:
			case EXEC_SQL:
			case EXECUTE:
			case EXISTS:
			case EXIT:
			case EXPLAIN:
			case EXTERNAL:
			case FENCED:
			case FETCH:
			case FIELDPROC:
			case FINAL:
			case FIRST:
			case FOR:
			case FREE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANT:
			case GROUP:
			case HANDLER:
			case HAVING:
			case HOLD:
			case HOUR:
			case HOURS:
			case IF:
			case IMMEDIATE:
			case IN:
			case INCLUSIVE:
			case INDEX:
			case INDEXBP:
			case INHERIT:
			case INNER:
			case INOUT:
			case INSENSITIVE:
			case INSERT:
			case INTERSECT:
			case INTO:
			case IS:
			case ISOBID:
			case ITERATE:
			case JAR:
			case JOIN:
			case KEEP:
			case KEY:
			case LABEL:
			case LANGUAGE:
			case LAST:
			case LC_CTYPE:
			case LEAVE:
			case LEFT:
			case LIKE:
			case LIMIT:
			case LOCAL:
			case LOCALE:
			case LOCATOR:
			case LOCATORS:
			case LOCK:
			case LOCKMAX:
			case LOCKSIZE:
			case LONG:
			case LOOP:
			case MAINTAINED:
			case MATERIALIZED:
			case MICROSECOND:
			case MICROSECONDS:
			case MODIFIES:
			case MONTH:
			case MONTHS:
			case NEXT:
			case NEXTVAL:
			case NO:
			case NONE:
			case NOT:
			case NULL:
			case NULLS:
			case NUMPARTS:
			case OBID:
			case OF:
			case OFFSET:
			case OLD:
			case ON:
			case OPEN:
			case OPTIMIZATION:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case ORGANIZATION:
			case OUT:
			case OUTER:
			case PACKAGE:
			case PADDED:
			case PARAMETER:
			case PART:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONING:
			case PATH:
			case PERIOD:
			case PIECESIZE:
			case PLAN:
			case PRECISION:
			case PREPARE:
			case PREVVAL:
			case PRIOR:
			case PRIQTY:
			case PRIVILEGES:
			case PROCEDURE:
			case PROGRAM:
			case PSID:
			case PUBLIC:
			case QUERY:
			case QUERYNO:
			case READS:
			case REFERENCES:
			case REFRESH:
			case RELEASE:
			case RENAME:
			case REPEAT:
			case RESIGNAL:
			case RESTRICT:
			case RESULT:
			case RESULT_SET_LOCATOR:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUND_CEILING:
			case ROUND_DOWN:
			case ROUND_FLOOR:
			case ROUND_HALF_DOWN:
			case ROUND_HALF_EVEN:
			case ROUND_HALF_UP:
			case ROUND_UP:
			case ROW:
			case ROWSET:
			case RUN:
			case SAVEPOINT:
			case SCHEMA:
			case SCRATCHPAD:
			case SECOND:
			case SECONDS:
			case SECQTY:
			case SECURITY:
			case SELECT:
			case SENSITIVE:
			case SEQUENCE:
			case SET:
			case SIGNAL:
			case SIMPLE:
			case SOME:
			case SOURCE:
			case SPECIFIC:
			case STANDARD:
			case STATEMENT:
			case STATIC:
			case STAY:
			case STOGROUP:
			case STORES:
			case STYLE:
			case SUMMARY:
			case SYNONYM:
			case SYSDATE:
			case SYSTEM:
			case SYSTIMESTAMP:
			case TABLE:
			case TABLESPACE:
			case THEN:
			case TO:
			case TRIGGER:
			case TRUNCATE:
			case TYPE:
			case UNDO:
			case UNION:
			case UNIQUE:
			case UNTIL:
			case UPDATE:
			case USING:
			case VALIDPROC:
			case VALUE:
			case VALUES:
			case VARIABLE:
			case VARIANT:
			case VCAT:
			case VERSIONING:
			case VIEW:
			case VOLATILE:
			case VOLUMES:
			case WHEN:
			case WHENEVER:
			case WHERE:
			case WHILE:
			case WITH:
			case WLM:
			case XMLCAST:
			case XMLEXISTS:
			case XMLNAMESPACES:
			case YEAR:
			case YEARS:
			case ZONE:
			case AND:
			case ARRAY_AGG:
			case ASC:
			case AVG:
			case BIT:
			case CHANGE:
			case CODEUNITS16:
			case CODEUNITS32:
			case CORR:
			case CORRELATION:
			case COUNT:
			case COUNT_BIG:
			case COVAR:
			case COVARIANCE:
			case COVARIANCE_SAMP:
			case COVAR_POP:
			case COVAR_SAMP:
			case CS:
			case CUME_DIST:
			case DENSE_RANK:
			case DESC:
			case EBCDIC:
			case EXCLUSIVE:
			case FIRST_VALUE:
			case FOLLOWING:
			case GROUPING:
			case IGNORE:
			case INDICATOR:
			case INPUT:
			case ISNULL:
			case LAG:
			case LARGE:
			case LAST_VALUE:
			case LEAD:
			case LISTAGG:
			case LOCKED:
			case LOCKS:
			case MEDIAN:
			case MINUTES:
			case MIXED:
			case NOTNULL:
			case NTH_VALUE:
			case NTILE:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case ONLY:
			case OVER:
			case PASSING:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PRECEDING:
			case PREVIOUS:
			case RANGE:
			case RANK:
			case RATIO_TO_REPORT:
			case READ:
			case REF:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_ICPT:
			case REGR_INTERCEPT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case RESPECT:
			case ROW_NUMBER:
			case ROWS:
			case RR:
			case RS:
			case SBCS:
			case SELECTIVITY:
			case SETS:
			case SHARE:
			case SKIP_:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUM:
			case TOKEN:
			case UNBOUNDED:
			case UNPACK:
			case UR:
			case USE:
			case VAR:
			case VARIANCE:
			case VARIANCE_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARYING:
			case WITHOUT:
			case XML:
			case XMLAGG:
			case COLUMNS:
			case SQLID:
			case ORDINALITY:
			case SYSTEM_TIME:
			case BUSINESS_TIME:
			case MULTIPLIER:
			case UNNEST:
			case CROSS:
			case CALLER:
			case CLIENT:
			case POSITIONING:
			case SCROLL:
			case ACTION:
			case ASSEMBLE:
			case C_:
			case CALLED:
			case COBOL:
			case DB2:
			case DEFINER:
			case DISPATCH:
			case ENVIRONMENT:
			case FAILURE:
			case FAILURES:
			case JAVA:
			case MAIN:
			case NAME:
			case OPTIONS:
			case PARALLEL:
			case PLI:
			case REGISTERS:
			case RESIDENT:
			case SECURED:
			case SPECIAL:
			case SQL:
			case STOP:
			case SUB:
			case YES:
			case APPLICATION:
			case CHANGED:
			case COMPATIBILITY:
			case COMPRESS:
			case COPY:
			case FREEPAGE:
			case GBPCACHE:
			case INCLUDE:
			case MAXVALUE:
			case MINVALUE:
			case PCTFREE:
			case REGENERATE:
			case SEQTY:
			case MASK:
			case ENABLE:
			case PERMISSION:
			case ATOMIC:
			case SQLEXCEPTION:
			case MERGE:
			case MATCHED:
			case SQLSTATE:
			case MESSAGE_TEXT:
			case OVERRIDING:
			case PORTION:
			case DB2SQL:
			case DEBUG:
			case GENERAL:
			case MODE_:
			case REXX:
			case ABS:
			case ABSVAL:
			case ACOS:
			case ADD_DAYS:
			case ADD_MONTHS:
			case ARRAY_DELETE:
			case ARRAY_FIRST:
			case ARRAY_LAST:
			case ARRAY_NEXT:
			case ARRAY_PRIOR:
			case ARRAY_TRIM:
			case ASCII:
			case ASCII_CHR:
			case ASCIISTR:
			case ASCII_STR:
			case ASIN:
			case ATAN:
			case ATAN2:
			case ATANH:
			case BIGINT:
			case BINARY:
			case BITAND:
			case BITANDNOT:
			case BITNOT:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BTRIM:
			case CARDINALITY:
			case CCSID_ENCODING:
			case CEIL:
			case CEILING:
			case CHAR9:
			case CHARACTER_LENGTH:
			case CHAR_LENGTH:
			case CHR:
			case CLOB:
			case COALESCE:
			case COLLATION_KEY:
			case COMPARE_DECFLOAT:
			case COS:
			case COSH:
			case DATE:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFWEEK_ISO:
			case DAYOFYEAR:
			case DAYS_BETWEEN:
			case DBCLOB:
			case DEC:
			case DECFLOAT:
			case DECFLOAT_FORMAT:
			case DECFLOAT_SORTKEY:
			case DECIMAL:
			case DECODE:
			case DECRYPT_BINARY:
			case DECRYPT_BIT:
			case DECRYPT_CHAR:
			case DECRYPT_DATAKEY_BIGINT:
			case DECRYPT_DATAKEY_BIT:
			case DECRYPT_DATAKEY_CLOB:
			case DECRYPT_DATAKEY_DBCLOB:
			case DECRYPT_DATAKEY_DECIMAL:
			case DECRYPT_DATAKEY_INTEGER:
			case DECRYPT_DATAKEY_VARCHAR:
			case DECRYPT_DATAKEY_VARGRAPHIC:
			case DECRYPT_DB:
			case DEGREES:
			case DIFFERENCE:
			case DIGITS:
			case DOUBLE_PRECISION:
			case DSN_XMLVALIDATE:
			case EBCDIC_CHR:
			case EBCDIC_STR:
			case ENCRYPT_DATAKEY:
			case ENCRYPT_TDES:
			case EXP:
			case EXTRACT:
			case FLOAT:
			case FLOOR:
			case GENERATE_UNIQUE:
			case GENERATE_UNIQUE_BINARY:
			case GETHINT:
			case GETVARIABLE:
			case GRAPHIC:
			case GREATEST:
			case HASH:
			case HASH_CRC32:
			case HASH_MD5:
			case HASH_SHA1:
			case HASH_SHA256:
			case HEX:
			case IDENTITY_VAL_LOCAL:
			case IFNULL:
			case INSTR:
			case INT:
			case INTEGER:
			case JULIAN_DAY:
			case LAST_DAY:
			case LCASE:
			case LEAST:
			case LENGTH:
			case LN:
			case LOCATE:
			case LOCATE_IN_STRING:
			case LOG10:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAX:
			case MAX_CARDINALITY:
			case MIDNIGHT_SECONDS:
			case MIN:
			case MINUTE:
			case MOD:
			case MONTHS_BETWEEN:
			case MQREAD:
			case MQREADCLOB:
			case MQRECEIVE:
			case MQRECEIVECLOB:
			case MQSEND:
			case MULTIPLY_ALT:
			case NEXT_DAY:
			case NEXT_MONTH:
			case NORMALIZE_DECFLOAT:
			case NORMALIZE_STRING:
			case NULLIF:
			case NVL:
			case OVERLAY:
			case PACK:
			case POSITION:
			case POSSTR:
			case POW:
			case POWER:
			case QUANTIZE:
			case QUARTER:
			case RADIANS:
			case RAISE_ERROR:
			case RAND:
			case RANDOM:
			case REAL:
			case REGEXP_COUNT:
			case REGEXP_INSTR:
			case REGEXP_LIKE:
			case REGEXP_REPLACE:
			case REGEXP_SUBSTR:
			case REPLACE:
			case RID:
			case ROUND:
			case ROUND_TIMESTAMP:
			case ROWID:
			case RPAD:
			case RTRIM:
			case SCORE:
			case SIGN:
			case SIN:
			case SINH:
			case SMALLINT:
			case SOAPHTTPC:
			case SOAPHTTPNC:
			case SOAPHTTPNV:
			case SOAPHTTPV:
			case SOUNDEX:
			case SPACE:
			case SQRT:
			case STRIP:
			case STRLEFT:
			case STRPOS:
			case STRRIGHT:
			case SUBSTR:
			case SUBSTRING:
			case TAN:
			case TANH:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TIMESTAMP_FORMAT:
			case TIMESTAMP_ISO:
			case TIMESTAMP_TZ:
			case TO_CHAR:
			case TO_CLOB:
			case TO_DATE:
			case TO_NUMBER:
			case TOTALORDER:
			case TO_TIMESTAMP:
			case TRANSLATE:
			case TRIM:
			case TRIM_ARRAY:
			case TRUNC:
			case TRUNC_TIMESTAMP:
			case UCASE:
			case UNICODE:
			case UNICODE_STR:
			case UNISTR:
			case UPPER:
			case VARBINARY:
			case VARCHAR:
			case VARCHAR9:
			case VARCHAR_BIT_FORMAT:
			case VARCHAR_FORMAT:
			case VARGRAPHIC:
			case VERIFY_GROUP_FOR_USER:
			case VERIFY_ROLE_FOR_USER:
			case VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER:
			case WEEK:
			case WEEK_ISO:
			case WRAP:
			case XMLATTRIBUTES:
			case XMLCOMMENT:
			case XMLCONCAT:
			case XMLDOCUMENT:
			case XMLELEMENT:
			case XMLFOREST:
			case XMLMODIFY:
			case XMLPARSE:
			case XMLPI:
			case XMLQUERY:
			case XMLSERIALIZE:
			case XMLTEXT:
			case XMLXSROBJECTID:
			case XSLTRANSFORM:
			case CURRENT_ACCELERATOR:
			case CURRENT_APPLICATION_COMPATIBILITY:
			case CURRENT_APPLICATION_ENCODING_SCHEME:
			case CURRENT_CLIENT_ACCTNG:
			case CURRENT_CLIENT_APPLNAME:
			case CURRENT_CLIENT_CORR_TOKEN:
			case CURRENT_CLIENT_USERID:
			case CURRENT_CLIENT_WRKSTNNAME:
			case CURRENT_DATE:
			case CURRENT_DEBUG_MODE:
			case CURRENT_DECFLOAT_ROUNDING_MODE:
			case CURRENT_DEGREE:
			case CURRENT_EXPLAIN_MODE:
			case CURRENT_GET_ACCEL_ARCHIVE:
			case CURRENT_LOCALE_LC_CTYPE:
			case CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION:
			case CURRENT_MEMBER:
			case CURRENT_OPTIMIZATION_HINT:
			case CURRENT_PACKAGE_PATH:
			case CURRENT_PACKAGESET:
			case CURRENT_PATH:
			case CURRENT_PRECISION:
			case CURRENT_QUERY_ACCELERATION:
			case CURRENT_QUERY_ACCELERATION_WAITFORDATA:
			case CURRENT_REFRESH_AGE:
			case CURRENT_ROUTINE_VERSION:
			case CURRENT_RULES:
			case CURRENT_SCHEMA:
			case CURRENT_SERVER:
			case CURRENT_SQLID:
			case CURRENT_TEMPORAL_BUSINESS_TIME:
			case CURRENT_TEMPORAL_SYSTEM_TIME:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_TIME_ZONE:
			case ENCRYPTION_PASSWORD:
			case SESSION_TIME_ZONE:
			case SESSION_USER:
			case USER:
			case ADMIN_TASK_LIST:
			case ADMIN_TASK_OUTPUT:
			case ADMIN_TASK_STATUS:
			case BLOCKING_THREADS:
			case MQREADALL:
			case MQREADALLCLOB:
			case MQRECEIVEALL:
			case MQRECEIVEALLCLOB:
			case XMLTABLE:
			case SQLIDENTIFIER:
				{
				setState(1648);
				expression();
				}
				break;
			case SPLAT:
				{
				setState(1649);
				match(SPLAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1652);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegressionFunctionInvocationContext extends ParserRuleContext {
		public RegressionFunctionContext regressionFunction() {
			return getRuleContext(RegressionFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DB2zSQLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public RegressionFunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regressionFunctionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRegressionFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRegressionFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRegressionFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegressionFunctionInvocationContext regressionFunctionInvocation() throws RecognitionException {
		RegressionFunctionInvocationContext _localctx = new RegressionFunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_regressionFunctionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1654);
				schemaName();
				setState(1655);
				match(DOT);
				}
				break;
			}
			setState(1659);
			regressionFunction();
			setState(1660);
			match(LPAREN);
			setState(1661);
			expression();
			setState(1662);
			match(COMMA);
			setState(1663);
			expression();
			setState(1664);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalFunctionInvocationContext extends ParserRuleContext {
		public TerminalNode SQLIDENTIFIER() { return getToken(DB2zSQLParser.SQLIDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public ExternalFunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalFunctionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterExternalFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitExternalFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitExternalFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalFunctionInvocationContext externalFunctionInvocation() throws RecognitionException {
		ExternalFunctionInvocationContext _localctx = new ExternalFunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_externalFunctionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1666);
				schemaName();
				setState(1667);
				match(DOT);
				}
				break;
			}
			setState(1671);
			match(SQLIDENTIFIER);
			setState(1672);
			match(LPAREN);
			setState(1673);
			expression();
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1674);
				match(COMMA);
				setState(1675);
				expression();
				}
				}
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1681);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledDurationContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DB2zSQLParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(DB2zSQLParser.YEARS, 0); }
		public TerminalNode MONTH() { return getToken(DB2zSQLParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(DB2zSQLParser.MONTHS, 0); }
		public TerminalNode DAY() { return getToken(DB2zSQLParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(DB2zSQLParser.DAYS, 0); }
		public TerminalNode HOUR() { return getToken(DB2zSQLParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(DB2zSQLParser.HOURS, 0); }
		public TerminalNode MINUTE() { return getToken(DB2zSQLParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(DB2zSQLParser.MINUTES, 0); }
		public TerminalNode SECOND() { return getToken(DB2zSQLParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(DB2zSQLParser.SECONDS, 0); }
		public TerminalNode MICROSECOND() { return getToken(DB2zSQLParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(DB2zSQLParser.MICROSECONDS, 0); }
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public LabeledDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLabeledDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLabeledDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLabeledDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledDurationContext labeledDuration() throws RecognitionException {
		LabeledDurationContext _localctx = new LabeledDurationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labeledDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1683);
				functionInvocation();
				}
				break;
			case 2:
				{
				{
				setState(1684);
				match(LPAREN);
				setState(1685);
				expression();
				setState(1686);
				match(RPAREN);
				}
				}
				break;
			case 3:
				{
				setState(1688);
				match(INTEGERLITERAL);
				}
				break;
			case 4:
				{
				setState(1689);
				columnName();
				}
				break;
			case 5:
				{
				setState(1690);
				variable();
				}
				break;
			}
			setState(1693);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (DAY - 85)) | (1L << (DAYS - 85)) | (1L << (HOUR - 85)) | (1L << (HOURS - 85)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (MICROSECOND - 181)) | (1L << (MICROSECONDS - 181)) | (1L << (MONTH - 181)) | (1L << (MONTHS - 181)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (SECOND - 261)) | (1L << (SECONDS - 261)) | (1L << (YEAR - 261)) | (1L << (YEARS - 261)))) != 0) || _la==MINUTES || _la==MINUTE) ) {
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

	public static class XmlCastSpecificationContext extends ParserRuleContext {
		public TerminalNode XMLCAST() { return getToken(DB2zSQLParser.XMLCAST, 0); }
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public XmlCastSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlCastSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmlCastSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmlCastSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmlCastSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlCastSpecificationContext xmlCastSpecification() throws RecognitionException {
		XmlCastSpecificationContext _localctx = new XmlCastSpecificationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_xmlCastSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(XMLCAST);
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1696);
				expression();
				}
				break;
			case 2:
				{
				setState(1697);
				match(NULL);
				}
				break;
			case 3:
				{
				setState(1698);
				parameterMarker();
				}
				break;
			}
			setState(1701);
			match(AS);
			setState(1702);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementSpecificationContext extends ParserRuleContext {
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public TerminalNode OPENSQBRACKET() { return getToken(DB2zSQLParser.OPENSQBRACKET, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public TerminalNode CLOSESQBRACKET() { return getToken(DB2zSQLParser.CLOSESQBRACKET, 0); }
		public ArrayElementSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterArrayElementSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitArrayElementSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitArrayElementSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementSpecificationContext arrayElementSpecification() throws RecognitionException {
		ArrayElementSpecificationContext _localctx = new ArrayElementSpecificationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_arrayElementSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			arrayExpression();
			setState(1705);
			match(OPENSQBRACKET);
			setState(1706);
			arrayIndex();
			setState(1707);
			match(CLOSESQBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIndexContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			expression();
			setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SPLAT) | (1L << SLASH) | (1L << CONCATOP) | (1L << COLON) | (1L << NONNUMERICLITERAL) | (1L << INTEGERLITERAL) | (1L << NUMERICLITERAL) | (1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALLOW) | (1L << ALTER) | (1L << ALTERAND) | (1L << ANY) | (1L << ARRAY) | (1L << ARRAY_EXISTS) | (1L << AS) | (1L << ASENSITIVE) | (1L << ASSOCIATE) | (1L << ASUTIME) | (1L << AT) | (1L << AUDIT) | (1L << AUX) | (1L << AUXILIARY) | (1L << BEFORE) | (1L << BEGIN) | (1L << BETWEEN) | (1L << BUFFERPOOL) | (1L << BY) | (1L << CALL) | (1L << CAPTURE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CCSID) | (1L << CHAR) | (1L << CHARACTER) | (1L << CHECK) | (1L << CLONE) | (1L << CLOSE) | (1L << CLUSTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLLECTION - 64)) | (1L << (COLLID - 64)) | (1L << (COLUMN - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (CONCAT - 64)) | (1L << (CONDITION - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONSTRAINT - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTENT - 64)) | (1L << (CONTINUE - 64)) | (1L << (CREATE - 64)) | (1L << (CUBE - 64)) | (1L << (CURRENT - 64)) | (1L << (CURRENT_LC_CTYPE - 64)) | (1L << (CURRVAL - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DAY - 64)) | (1L << (DAYS - 64)) | (1L << (DBINFO - 64)) | (1L << (DECLARE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DELETE - 64)) | (1L << (DESCRIPTOR - 64)) | (1L << (DETERMINISTIC - 64)) | (1L << (DISABLE - 64)) | (1L << (DISALLOW - 64)) | (1L << (DISTINCT - 64)) | (1L << (DO - 64)) | (1L << (DOCUMENT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DROP - 64)) | (1L << (DSSIZE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EDITPROC - 64)) | (1L << (ELSE - 64)) | (1L << (ELSEIF - 64)) | (1L << (ENCODING - 64)) | (1L << (ENCRYPTION - 64)) | (1L << (END - 64)) | (1L << (END_EXEC - 64)) | (1L << (ENDING - 64)) | (1L << (ERASE - 64)) | (1L << (ESCAPE - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC_SQL - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXIT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FENCED - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDPROC - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOR - 64)) | (1L << (FREE - 64)) | (1L << (FROM - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATED - 128)) | (1L << (GET - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GOTO - 128)) | (1L << (GRANT - 128)) | (1L << (GROUP - 128)) | (1L << (HANDLER - 128)) | (1L << (HAVING - 128)) | (1L << (HOLD - 128)) | (1L << (HOUR - 128)) | (1L << (HOURS - 128)) | (1L << (IF - 128)) | (1L << (IMMEDIATE - 128)) | (1L << (IN - 128)) | (1L << (INCLUSIVE - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXBP - 128)) | (1L << (INHERIT - 128)) | (1L << (INNER - 128)) | (1L << (INOUT - 128)) | (1L << (INSENSITIVE - 128)) | (1L << (INSERT - 128)) | (1L << (INTERSECT - 128)) | (1L << (INTO - 128)) | (1L << (IS - 128)) | (1L << (ISOBID - 128)) | (1L << (ITERATE - 128)) | (1L << (JAR - 128)) | (1L << (JOIN - 128)) | (1L << (KEEP - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LANGUAGE - 128)) | (1L << (LAST - 128)) | (1L << (LC_CTYPE - 128)) | (1L << (LEAVE - 128)) | (1L << (LEFT - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCALE - 128)) | (1L << (LOCATOR - 128)) | (1L << (LOCATORS - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKMAX - 128)) | (1L << (LOCKSIZE - 128)) | (1L << (LONG - 128)) | (1L << (LOOP - 128)) | (1L << (MAINTAINED - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MICROSECONDS - 128)) | (1L << (MODIFIES - 128)) | (1L << (MONTH - 128)) | (1L << (MONTHS - 128)) | (1L << (NEXT - 128)) | (1L << (NEXTVAL - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NULL - 192)) | (1L << (NULLS - 192)) | (1L << (NUMPARTS - 192)) | (1L << (OBID - 192)) | (1L << (OF - 192)) | (1L << (OFFSET - 192)) | (1L << (OLD - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIMIZATION - 192)) | (1L << (OPTIMIZE - 192)) | (1L << (OR - 192)) | (1L << (ORDER - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OUT - 192)) | (1L << (OUTER - 192)) | (1L << (PACKAGE - 192)) | (1L << (PADDED - 192)) | (1L << (PARAMETER - 192)) | (1L << (PART - 192)) | (1L << (PARTITION - 192)) | (1L << (PARTITIONED - 192)) | (1L << (PARTITIONING - 192)) | (1L << (PATH - 192)) | (1L << (PERIOD - 192)) | (1L << (PIECESIZE - 192)) | (1L << (PLAN - 192)) | (1L << (PRECISION - 192)) | (1L << (PREPARE - 192)) | (1L << (PREVVAL - 192)) | (1L << (PRIOR - 192)) | (1L << (PRIQTY - 192)) | (1L << (PRIVILEGES - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PSID - 192)) | (1L << (PUBLIC - 192)) | (1L << (QUERY - 192)) | (1L << (QUERYNO - 192)) | (1L << (READS - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAME - 192)) | (1L << (REPEAT - 192)) | (1L << (RESIGNAL - 192)) | (1L << (RESTRICT - 192)) | (1L << (RESULT - 192)) | (1L << (RESULT_SET_LOCATOR - 192)) | (1L << (RETURN - 192)) | (1L << (RETURNS - 192)) | (1L << (REVOKE - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLE - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROUND_CEILING - 192)) | (1L << (ROUND_DOWN - 192)) | (1L << (ROUND_FLOOR - 192)) | (1L << (ROUND_HALF_DOWN - 192)) | (1L << (ROUND_HALF_EVEN - 192)) | (1L << (ROUND_HALF_UP - 192)) | (1L << (ROUND_UP - 192)) | (1L << (ROW - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (ROWSET - 256)) | (1L << (RUN - 256)) | (1L << (SAVEPOINT - 256)) | (1L << (SCHEMA - 256)) | (1L << (SCRATCHPAD - 256)) | (1L << (SECOND - 256)) | (1L << (SECONDS - 256)) | (1L << (SECQTY - 256)) | (1L << (SECURITY - 256)) | (1L << (SELECT - 256)) | (1L << (SENSITIVE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SET - 256)) | (1L << (SIGNAL - 256)) | (1L << (SIMPLE - 256)) | (1L << (SOME - 256)) | (1L << (SOURCE - 256)) | (1L << (SPECIFIC - 256)) | (1L << (STANDARD - 256)) | (1L << (STATEMENT - 256)) | (1L << (STATIC - 256)) | (1L << (STAY - 256)) | (1L << (STOGROUP - 256)) | (1L << (STORES - 256)) | (1L << (STYLE - 256)) | (1L << (SUMMARY - 256)) | (1L << (SYNONYM - 256)) | (1L << (SYSDATE - 256)) | (1L << (SYSTEM - 256)) | (1L << (SYSTIMESTAMP - 256)) | (1L << (TABLE - 256)) | (1L << (TABLESPACE - 256)) | (1L << (THEN - 256)) | (1L << (TO - 256)) | (1L << (TRIGGER - 256)) | (1L << (TRUNCATE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDO - 256)) | (1L << (UNION - 256)) | (1L << (UNIQUE - 256)) | (1L << (UNTIL - 256)) | (1L << (UPDATE - 256)) | (1L << (USING - 256)) | (1L << (VALIDPROC - 256)) | (1L << (VALUE - 256)) | (1L << (VALUES - 256)) | (1L << (VARIABLE - 256)) | (1L << (VARIANT - 256)) | (1L << (VCAT - 256)) | (1L << (VERSIONING - 256)) | (1L << (VIEW - 256)) | (1L << (VOLATILE - 256)) | (1L << (VOLUMES - 256)) | (1L << (WHEN - 256)) | (1L << (WHENEVER - 256)) | (1L << (WHERE - 256)) | (1L << (WHILE - 256)) | (1L << (WITH - 256)) | (1L << (WLM - 256)) | (1L << (XMLCAST - 256)) | (1L << (XMLEXISTS - 256)) | (1L << (XMLNAMESPACES - 256)) | (1L << (YEAR - 256)) | (1L << (YEARS - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (ZONE - 320)) | (1L << (AND - 320)) | (1L << (ARRAY_AGG - 320)) | (1L << (ASC - 320)) | (1L << (AVG - 320)) | (1L << (BIT - 320)) | (1L << (CHANGE - 320)) | (1L << (CODEUNITS16 - 320)) | (1L << (CODEUNITS32 - 320)) | (1L << (CORR - 320)) | (1L << (CORRELATION - 320)) | (1L << (COUNT - 320)) | (1L << (COUNT_BIG - 320)) | (1L << (COVAR - 320)) | (1L << (COVARIANCE - 320)) | (1L << (COVARIANCE_SAMP - 320)) | (1L << (COVAR_POP - 320)) | (1L << (COVAR_SAMP - 320)) | (1L << (CS - 320)) | (1L << (CUME_DIST - 320)) | (1L << (DENSE_RANK - 320)) | (1L << (DESC - 320)) | (1L << (EBCDIC - 320)) | (1L << (EXCLUSIVE - 320)) | (1L << (FIRST_VALUE - 320)) | (1L << (FOLLOWING - 320)) | (1L << (GROUPING - 320)) | (1L << (IGNORE - 320)) | (1L << (INDICATOR - 320)) | (1L << (INPUT - 320)) | (1L << (ISNULL - 320)) | (1L << (LAG - 320)) | (1L << (LARGE - 320)) | (1L << (LAST_VALUE - 320)) | (1L << (LEAD - 320)) | (1L << (LISTAGG - 320)) | (1L << (LOCKED - 320)) | (1L << (LOCKS - 320)) | (1L << (MEDIAN - 320)) | (1L << (MINUTES - 320)) | (1L << (MIXED - 320)) | (1L << (NOTNULL - 320)) | (1L << (NTH_VALUE - 320)) | (1L << (NTILE - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (ONLY - 320)) | (1L << (OVER - 320)) | (1L << (PASSING - 320)) | (1L << (PERCENTILE_CONT - 320)) | (1L << (PERCENTILE_DISC - 320)) | (1L << (PERCENT_RANK - 320)) | (1L << (PRECEDING - 320)) | (1L << (PREVIOUS - 320)) | (1L << (RANGE - 320)) | (1L << (RANK - 320)) | (1L << (RATIO_TO_REPORT - 320)) | (1L << (READ - 320)) | (1L << (REF - 320)) | (1L << (REGR_AVGX - 320)) | (1L << (REGR_AVGY - 320)) | (1L << (REGR_COUNT - 320)) | (1L << (REGR_ICPT - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_R2 - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (RESPECT - 384)) | (1L << (ROW_NUMBER - 384)) | (1L << (ROWS - 384)) | (1L << (RR - 384)) | (1L << (RS - 384)) | (1L << (SBCS - 384)) | (1L << (SELECTIVITY - 384)) | (1L << (SETS - 384)) | (1L << (SHARE - 384)) | (1L << (SKIP_ - 384)) | (1L << (STDDEV - 384)) | (1L << (STDDEV_POP - 384)) | (1L << (STDDEV_SAMP - 384)) | (1L << (SUM - 384)) | (1L << (TOKEN - 384)) | (1L << (UNBOUNDED - 384)) | (1L << (UNPACK - 384)) | (1L << (UR - 384)) | (1L << (USE - 384)) | (1L << (VAR - 384)) | (1L << (VARIANCE - 384)) | (1L << (VARIANCE_SAMP - 384)) | (1L << (VAR_POP - 384)) | (1L << (VAR_SAMP - 384)) | (1L << (VARYING - 384)) | (1L << (WITHOUT - 384)) | (1L << (XML - 384)) | (1L << (XMLAGG - 384)) | (1L << (COLUMNS - 384)) | (1L << (SQLID - 384)) | (1L << (ORDINALITY - 384)) | (1L << (SYSTEM_TIME - 384)) | (1L << (BUSINESS_TIME - 384)) | (1L << (MULTIPLIER - 384)) | (1L << (UNNEST - 384)) | (1L << (CROSS - 384)) | (1L << (CALLER - 384)) | (1L << (CLIENT - 384)) | (1L << (POSITIONING - 384)) | (1L << (SCROLL - 384)) | (1L << (ACTION - 384)) | (1L << (ASSEMBLE - 384)) | (1L << (C_ - 384)) | (1L << (CALLED - 384)) | (1L << (COBOL - 384)) | (1L << (DB2 - 384)) | (1L << (DEFINER - 384)) | (1L << (DISPATCH - 384)) | (1L << (ENVIRONMENT - 384)) | (1L << (FAILURE - 384)) | (1L << (FAILURES - 384)) | (1L << (JAVA - 384)) | (1L << (MAIN - 384)) | (1L << (NAME - 384)) | (1L << (OPTIONS - 384)) | (1L << (PARALLEL - 384)) | (1L << (PLI - 384)) | (1L << (REGISTERS - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESIDENT - 448)) | (1L << (SECURED - 448)) | (1L << (SPECIAL - 448)) | (1L << (SQL - 448)) | (1L << (STOP - 448)) | (1L << (SUB - 448)) | (1L << (YES - 448)) | (1L << (APPLICATION - 448)) | (1L << (CHANGED - 448)) | (1L << (COMPATIBILITY - 448)) | (1L << (COMPRESS - 448)) | (1L << (COPY - 448)) | (1L << (FREEPAGE - 448)) | (1L << (GBPCACHE - 448)) | (1L << (INCLUDE - 448)) | (1L << (MAXVALUE - 448)) | (1L << (MINVALUE - 448)) | (1L << (PCTFREE - 448)) | (1L << (REGENERATE - 448)) | (1L << (SEQTY - 448)) | (1L << (MASK - 448)) | (1L << (ENABLE - 448)) | (1L << (PERMISSION - 448)) | (1L << (ATOMIC - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (MERGE - 448)) | (1L << (MATCHED - 448)) | (1L << (SQLSTATE - 448)) | (1L << (MESSAGE_TEXT - 448)) | (1L << (OVERRIDING - 448)) | (1L << (PORTION - 448)) | (1L << (DB2SQL - 448)) | (1L << (DEBUG - 448)) | (1L << (GENERAL - 448)) | (1L << (MODE_ - 448)) | (1L << (REXX - 448)) | (1L << (ABS - 448)) | (1L << (ABSVAL - 448)) | (1L << (ACOS - 448)) | (1L << (ADD_DAYS - 448)) | (1L << (ADD_MONTHS - 448)) | (1L << (ARRAY_DELETE - 448)) | (1L << (ARRAY_FIRST - 448)) | (1L << (ARRAY_LAST - 448)) | (1L << (ARRAY_NEXT - 448)) | (1L << (ARRAY_PRIOR - 448)) | (1L << (ARRAY_TRIM - 448)) | (1L << (ASCII - 448)) | (1L << (ASCII_CHR - 448)) | (1L << (ASCIISTR - 448)) | (1L << (ASCII_STR - 448)) | (1L << (ASIN - 448)) | (1L << (ATAN - 448)) | (1L << (ATAN2 - 448)) | (1L << (ATANH - 448)) | (1L << (BIGINT - 448)) | (1L << (BINARY - 448)) | (1L << (BITAND - 448)) | (1L << (BITANDNOT - 448)) | (1L << (BITNOT - 448)) | (1L << (BITOR - 448)) | (1L << (BITXOR - 448)) | (1L << (BLOB - 448)) | (1L << (BTRIM - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (CARDINALITY - 512)) | (1L << (CCSID_ENCODING - 512)) | (1L << (CEIL - 512)) | (1L << (CEILING - 512)) | (1L << (CHAR9 - 512)) | (1L << (CHARACTER_LENGTH - 512)) | (1L << (CHAR_LENGTH - 512)) | (1L << (CHR - 512)) | (1L << (CLOB - 512)) | (1L << (COALESCE - 512)) | (1L << (COLLATION_KEY - 512)) | (1L << (COMPARE_DECFLOAT - 512)) | (1L << (COS - 512)) | (1L << (COSH - 512)) | (1L << (DATE - 512)) | (1L << (DAYOFMONTH - 512)) | (1L << (DAYOFWEEK - 512)) | (1L << (DAYOFWEEK_ISO - 512)) | (1L << (DAYOFYEAR - 512)) | (1L << (DAYS_BETWEEN - 512)) | (1L << (DBCLOB - 512)) | (1L << (DEC - 512)) | (1L << (DECFLOAT - 512)) | (1L << (DECFLOAT_FORMAT - 512)) | (1L << (DECFLOAT_SORTKEY - 512)) | (1L << (DECIMAL - 512)) | (1L << (DECODE - 512)) | (1L << (DECRYPT_BINARY - 512)) | (1L << (DECRYPT_BIT - 512)) | (1L << (DECRYPT_CHAR - 512)) | (1L << (DECRYPT_DATAKEY_BIGINT - 512)) | (1L << (DECRYPT_DATAKEY_BIT - 512)) | (1L << (DECRYPT_DATAKEY_CLOB - 512)) | (1L << (DECRYPT_DATAKEY_DBCLOB - 512)) | (1L << (DECRYPT_DATAKEY_DECIMAL - 512)) | (1L << (DECRYPT_DATAKEY_INTEGER - 512)) | (1L << (DECRYPT_DATAKEY_VARCHAR - 512)) | (1L << (DECRYPT_DATAKEY_VARGRAPHIC - 512)) | (1L << (DECRYPT_DB - 512)) | (1L << (DEGREES - 512)) | (1L << (DIFFERENCE - 512)) | (1L << (DIGITS - 512)) | (1L << (DOUBLE_PRECISION - 512)) | (1L << (DSN_XMLVALIDATE - 512)) | (1L << (EBCDIC_CHR - 512)) | (1L << (EBCDIC_STR - 512)) | (1L << (ENCRYPT_DATAKEY - 512)) | (1L << (ENCRYPT_TDES - 512)) | (1L << (EXP - 512)) | (1L << (EXTRACT - 512)) | (1L << (FLOAT - 512)) | (1L << (FLOOR - 512)) | (1L << (GENERATE_UNIQUE - 512)) | (1L << (GENERATE_UNIQUE_BINARY - 512)) | (1L << (GETHINT - 512)) | (1L << (GETVARIABLE - 512)) | (1L << (GRAPHIC - 512)) | (1L << (GREATEST - 512)) | (1L << (HASH - 512)) | (1L << (HASH_CRC32 - 512)) | (1L << (HASH_MD5 - 512)) | (1L << (HASH_SHA1 - 512)) | (1L << (HASH_SHA256 - 512)) | (1L << (HEX - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (IDENTITY_VAL_LOCAL - 576)) | (1L << (IFNULL - 576)) | (1L << (INSTR - 576)) | (1L << (INT - 576)) | (1L << (INTEGER - 576)) | (1L << (JULIAN_DAY - 576)) | (1L << (LAST_DAY - 576)) | (1L << (LCASE - 576)) | (1L << (LEAST - 576)) | (1L << (LENGTH - 576)) | (1L << (LN - 576)) | (1L << (LOCATE - 576)) | (1L << (LOCATE_IN_STRING - 576)) | (1L << (LOG10 - 576)) | (1L << (LOWER - 576)) | (1L << (LPAD - 576)) | (1L << (LTRIM - 576)) | (1L << (MAX - 576)) | (1L << (MAX_CARDINALITY - 576)) | (1L << (MIDNIGHT_SECONDS - 576)) | (1L << (MIN - 576)) | (1L << (MINUTE - 576)) | (1L << (MOD - 576)) | (1L << (MONTHS_BETWEEN - 576)) | (1L << (MQREAD - 576)) | (1L << (MQREADCLOB - 576)) | (1L << (MQRECEIVE - 576)) | (1L << (MQRECEIVECLOB - 576)) | (1L << (MQSEND - 576)) | (1L << (MULTIPLY_ALT - 576)) | (1L << (NEXT_DAY - 576)) | (1L << (NEXT_MONTH - 576)) | (1L << (NORMALIZE_DECFLOAT - 576)) | (1L << (NORMALIZE_STRING - 576)) | (1L << (NULLIF - 576)) | (1L << (NVL - 576)) | (1L << (OVERLAY - 576)) | (1L << (PACK - 576)) | (1L << (POSITION - 576)) | (1L << (POSSTR - 576)) | (1L << (POW - 576)) | (1L << (POWER - 576)) | (1L << (QUANTIZE - 576)) | (1L << (QUARTER - 576)) | (1L << (RADIANS - 576)) | (1L << (RAISE_ERROR - 576)) | (1L << (RAND - 576)) | (1L << (RANDOM - 576)) | (1L << (REAL - 576)) | (1L << (REGEXP_COUNT - 576)) | (1L << (REGEXP_INSTR - 576)) | (1L << (REGEXP_LIKE - 576)) | (1L << (REGEXP_REPLACE - 576)) | (1L << (REGEXP_SUBSTR - 576)) | (1L << (REPLACE - 576)) | (1L << (RID - 576)) | (1L << (ROUND - 576)) | (1L << (ROUND_TIMESTAMP - 576)) | (1L << (ROWID - 576)) | (1L << (RPAD - 576)) | (1L << (RTRIM - 576)) | (1L << (SCORE - 576)) | (1L << (SIGN - 576)) | (1L << (SIN - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (SINH - 640)) | (1L << (SMALLINT - 640)) | (1L << (SOAPHTTPC - 640)) | (1L << (SOAPHTTPNC - 640)) | (1L << (SOAPHTTPNV - 640)) | (1L << (SOAPHTTPV - 640)) | (1L << (SOUNDEX - 640)) | (1L << (SPACE - 640)) | (1L << (SQRT - 640)) | (1L << (STRIP - 640)) | (1L << (STRLEFT - 640)) | (1L << (STRPOS - 640)) | (1L << (STRRIGHT - 640)) | (1L << (SUBSTR - 640)) | (1L << (SUBSTRING - 640)) | (1L << (TAN - 640)) | (1L << (TANH - 640)) | (1L << (TIME - 640)) | (1L << (TIMESTAMP - 640)) | (1L << (TIMESTAMPADD - 640)) | (1L << (TIMESTAMPDIFF - 640)) | (1L << (TIMESTAMP_FORMAT - 640)) | (1L << (TIMESTAMP_ISO - 640)) | (1L << (TIMESTAMP_TZ - 640)) | (1L << (TO_CHAR - 640)) | (1L << (TO_CLOB - 640)) | (1L << (TO_DATE - 640)) | (1L << (TO_NUMBER - 640)) | (1L << (TOTALORDER - 640)) | (1L << (TO_TIMESTAMP - 640)) | (1L << (TRANSLATE - 640)) | (1L << (TRIM - 640)) | (1L << (TRIM_ARRAY - 640)) | (1L << (TRUNC - 640)) | (1L << (TRUNC_TIMESTAMP - 640)) | (1L << (UCASE - 640)) | (1L << (UNICODE - 640)) | (1L << (UNICODE_STR - 640)) | (1L << (UNISTR - 640)) | (1L << (UPPER - 640)) | (1L << (VARBINARY - 640)) | (1L << (VARCHAR - 640)) | (1L << (VARCHAR9 - 640)) | (1L << (VARCHAR_BIT_FORMAT - 640)) | (1L << (VARCHAR_FORMAT - 640)) | (1L << (VARGRAPHIC - 640)) | (1L << (VERIFY_GROUP_FOR_USER - 640)) | (1L << (VERIFY_ROLE_FOR_USER - 640)) | (1L << (VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER - 640)) | (1L << (WEEK - 640)) | (1L << (WEEK_ISO - 640)) | (1L << (WRAP - 640)) | (1L << (XMLATTRIBUTES - 640)) | (1L << (XMLCOMMENT - 640)) | (1L << (XMLCONCAT - 640)) | (1L << (XMLDOCUMENT - 640)) | (1L << (XMLELEMENT - 640)) | (1L << (XMLFOREST - 640)) | (1L << (XMLMODIFY - 640)) | (1L << (XMLPARSE - 640)) | (1L << (XMLPI - 640)) | (1L << (XMLQUERY - 640)) | (1L << (XMLSERIALIZE - 640)) | (1L << (XMLTEXT - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (XMLXSROBJECTID - 704)) | (1L << (XSLTRANSFORM - 704)) | (1L << (CURRENT_ACCELERATOR - 704)) | (1L << (CURRENT_APPLICATION_COMPATIBILITY - 704)) | (1L << (CURRENT_APPLICATION_ENCODING_SCHEME - 704)) | (1L << (CURRENT_CLIENT_ACCTNG - 704)) | (1L << (CURRENT_CLIENT_APPLNAME - 704)) | (1L << (CURRENT_CLIENT_CORR_TOKEN - 704)) | (1L << (CURRENT_CLIENT_USERID - 704)) | (1L << (CURRENT_CLIENT_WRKSTNNAME - 704)) | (1L << (CURRENT_DATE - 704)) | (1L << (CURRENT_DEBUG_MODE - 704)) | (1L << (CURRENT_DECFLOAT_ROUNDING_MODE - 704)) | (1L << (CURRENT_DEGREE - 704)) | (1L << (CURRENT_EXPLAIN_MODE - 704)) | (1L << (CURRENT_GET_ACCEL_ARCHIVE - 704)) | (1L << (CURRENT_LOCALE_LC_CTYPE - 704)) | (1L << (CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION - 704)) | (1L << (CURRENT_MEMBER - 704)) | (1L << (CURRENT_OPTIMIZATION_HINT - 704)) | (1L << (CURRENT_PACKAGE_PATH - 704)) | (1L << (CURRENT_PACKAGESET - 704)) | (1L << (CURRENT_PATH - 704)) | (1L << (CURRENT_PRECISION - 704)) | (1L << (CURRENT_QUERY_ACCELERATION - 704)) | (1L << (CURRENT_QUERY_ACCELERATION_WAITFORDATA - 704)) | (1L << (CURRENT_REFRESH_AGE - 704)) | (1L << (CURRENT_ROUTINE_VERSION - 704)) | (1L << (CURRENT_RULES - 704)) | (1L << (CURRENT_SCHEMA - 704)) | (1L << (CURRENT_SERVER - 704)) | (1L << (CURRENT_SQLID - 704)) | (1L << (CURRENT_TEMPORAL_BUSINESS_TIME - 704)) | (1L << (CURRENT_TEMPORAL_SYSTEM_TIME - 704)) | (1L << (CURRENT_TIME - 704)) | (1L << (CURRENT_TIMESTAMP - 704)) | (1L << (CURRENT_TIME_ZONE - 704)) | (1L << (ENCRYPTION_PASSWORD - 704)) | (1L << (SESSION_TIME_ZONE - 704)) | (1L << (SESSION_USER - 704)) | (1L << (USER - 704)) | (1L << (ADMIN_TASK_LIST - 704)) | (1L << (ADMIN_TASK_OUTPUT - 704)) | (1L << (ADMIN_TASK_STATUS - 704)) | (1L << (BLOCKING_THREADS - 704)) | (1L << (MQREADALL - 704)) | (1L << (MQREADALLCLOB - 704)) | (1L << (MQRECEIVEALL - 704)) | (1L << (MQRECEIVEALLCLOB - 704)) | (1L << (XMLTABLE - 704)) | (1L << (SQLIDENTIFIER - 704)))) != 0)) {
				{
				{
				setState(1711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1710);
					operator();
					}
					break;
				}
				setState(1713);
				expression();
				}
				}
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayConstructorContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(DB2zSQLParser.ARRAY, 0); }
		public TerminalNode OPENSQBRACKET() { return getToken(DB2zSQLParser.OPENSQBRACKET, 0); }
		public TerminalNode CLOSESQBRACKET() { return getToken(DB2zSQLParser.CLOSESQBRACKET, 0); }
		public TerminalNode QUESTIONMARK() { return getToken(DB2zSQLParser.QUESTIONMARK, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NULL() { return getTokens(DB2zSQLParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(DB2zSQLParser.NULL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_arrayConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(ARRAY);
			setState(1720);
			match(OPENSQBRACKET);
			setState(1737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1721);
				match(QUESTIONMARK);
				}
				break;
			case 2:
				{
				setState(1722);
				fullSelect();
				}
				break;
			case 3:
				{
				{
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1723);
					expression();
					}
					break;
				case 2:
					{
					setState(1724);
					match(NULL);
					}
					break;
				}
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1727);
					match(COMMA);
					setState(1730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1728);
						expression();
						}
						break;
					case 2:
						{
						setState(1729);
						match(NULL);
						}
						break;
					}
					}
					}
					setState(1736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(1739);
			match(CLOSESQBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapSpecificationContext extends ParserRuleContext {
		public OrderedOlapSpecificationContext orderedOlapSpecification() {
			return getRuleContext(OrderedOlapSpecificationContext.class,0);
		}
		public NumberingSpecificationContext numberingSpecification() {
			return getRuleContext(NumberingSpecificationContext.class,0);
		}
		public AggregationSpecificationContext aggregationSpecification() {
			return getRuleContext(AggregationSpecificationContext.class,0);
		}
		public OlapSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOlapSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOlapSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOlapSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapSpecificationContext olapSpecification() throws RecognitionException {
		OlapSpecificationContext _localctx = new OlapSpecificationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_olapSpecification);
		try {
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1741);
				orderedOlapSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1742);
				numberingSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1743);
				aggregationSpecification();
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

	public static class OrderedOlapSpecificationContext extends ParserRuleContext {
		public OlapSpecificationFunctionContext olapSpecificationFunction() {
			return getRuleContext(OlapSpecificationFunctionContext.class,0);
		}
		public TerminalNode OVER() { return getToken(DB2zSQLParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public WindowOrderClauseContext windowOrderClause() {
			return getRuleContext(WindowOrderClauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public WindowPartitionClauseContext windowPartitionClause() {
			return getRuleContext(WindowPartitionClauseContext.class,0);
		}
		public OrderedOlapSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedOlapSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOrderedOlapSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOrderedOlapSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOrderedOlapSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedOlapSpecificationContext orderedOlapSpecification() throws RecognitionException {
		OrderedOlapSpecificationContext _localctx = new OrderedOlapSpecificationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderedOlapSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			olapSpecificationFunction();
			setState(1747);
			match(OVER);
			setState(1748);
			match(LPAREN);
			setState(1750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1749);
				windowPartitionClause();
				}
			}

			setState(1752);
			windowOrderClause();
			setState(1753);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapSpecificationFunctionContext extends ParserRuleContext {
		public LagFunctionContext lagFunction() {
			return getRuleContext(LagFunctionContext.class,0);
		}
		public LeadFunctionContext leadFunction() {
			return getRuleContext(LeadFunctionContext.class,0);
		}
		public TerminalNode CUME_DIST() { return getToken(DB2zSQLParser.CUME_DIST, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(DB2zSQLParser.PERCENT_RANK, 0); }
		public TerminalNode RANK() { return getToken(DB2zSQLParser.RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(DB2zSQLParser.DENSE_RANK, 0); }
		public TerminalNode NTILE() { return getToken(DB2zSQLParser.NTILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OlapSpecificationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapSpecificationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOlapSpecificationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOlapSpecificationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOlapSpecificationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapSpecificationFunctionContext olapSpecificationFunction() throws RecognitionException {
		OlapSpecificationFunctionContext _localctx = new OlapSpecificationFunctionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_olapSpecificationFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUME_DIST:
				{
				{
				setState(1755);
				match(CUME_DIST);
				setState(1756);
				match(LPAREN);
				setState(1757);
				match(RPAREN);
				}
				}
				break;
			case PERCENT_RANK:
				{
				{
				setState(1758);
				match(PERCENT_RANK);
				setState(1759);
				match(LPAREN);
				setState(1760);
				match(RPAREN);
				}
				}
				break;
			case RANK:
				{
				{
				setState(1761);
				match(RANK);
				setState(1762);
				match(LPAREN);
				setState(1763);
				match(RPAREN);
				}
				}
				break;
			case DENSE_RANK:
				{
				{
				setState(1764);
				match(DENSE_RANK);
				setState(1765);
				match(LPAREN);
				setState(1766);
				match(RPAREN);
				}
				}
				break;
			case NTILE:
				{
				{
				setState(1767);
				match(NTILE);
				setState(1768);
				match(LPAREN);
				setState(1769);
				expression();
				setState(1770);
				match(RPAREN);
				}
				}
				break;
			case LAG:
				{
				setState(1772);
				lagFunction();
				}
				break;
			case LEAD:
				{
				setState(1773);
				leadFunction();
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

	public static class LagFunctionContext extends ParserRuleContext {
		public TerminalNode LAG() { return getToken(DB2zSQLParser.LAG, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode RESPECT() { return getToken(DB2zSQLParser.RESPECT, 0); }
		public TerminalNode NULLS() { return getToken(DB2zSQLParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(DB2zSQLParser.IGNORE, 0); }
		public LagFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lagFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLagFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLagFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLagFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LagFunctionContext lagFunction() throws RecognitionException {
		LagFunctionContext _localctx = new LagFunctionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lagFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(LAG);
			setState(1777);
			match(LPAREN);
			setState(1778);
			expression();
			{
			setState(1779);
			match(COMMA);
			setState(1780);
			match(INTEGERLITERAL);
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1781);
				match(COMMA);
				setState(1782);
				expression();
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1783);
					match(COMMA);
					setState(1788);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case RESPECT:
						{
						{
						setState(1784);
						match(RESPECT);
						setState(1785);
						match(NULLS);
						}
						}
						break;
					case IGNORE:
						{
						{
						setState(1786);
						match(IGNORE);
						setState(1787);
						match(NULLS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
			}

			setState(1794);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeadFunctionContext extends ParserRuleContext {
		public TerminalNode LEAD() { return getToken(DB2zSQLParser.LEAD, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public RespectNullsClauseContext respectNullsClause() {
			return getRuleContext(RespectNullsClauseContext.class,0);
		}
		public LeadFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leadFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLeadFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLeadFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLeadFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeadFunctionContext leadFunction() throws RecognitionException {
		LeadFunctionContext _localctx = new LeadFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_leadFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(LEAD);
			setState(1797);
			match(LPAREN);
			setState(1798);
			expression();
			{
			setState(1799);
			match(COMMA);
			setState(1800);
			match(INTEGERLITERAL);
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1801);
				match(COMMA);
				setState(1802);
				expression();
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1803);
					match(COMMA);
					setState(1804);
					respectNullsClause();
					}
				}

				}
			}

			setState(1809);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RespectNullsClauseContext extends ParserRuleContext {
		public TerminalNode RESPECT() { return getToken(DB2zSQLParser.RESPECT, 0); }
		public TerminalNode NULLS() { return getToken(DB2zSQLParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(DB2zSQLParser.IGNORE, 0); }
		public RespectNullsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_respectNullsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRespectNullsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRespectNullsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRespectNullsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RespectNullsClauseContext respectNullsClause() throws RecognitionException {
		RespectNullsClauseContext _localctx = new RespectNullsClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_respectNullsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESPECT:
				{
				{
				setState(1811);
				match(RESPECT);
				setState(1812);
				match(NULLS);
				}
				}
				break;
			case IGNORE:
				{
				{
				setState(1813);
				match(IGNORE);
				setState(1814);
				match(NULLS);
				}
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

	public static class WindowPartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DB2zSQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(DB2zSQLParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public WindowPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowPartitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterWindowPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitWindowPartitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitWindowPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowPartitionClauseContext windowPartitionClause() throws RecognitionException {
		WindowPartitionClauseContext _localctx = new WindowPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_windowPartitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1817);
			match(PARTITION);
			setState(1818);
			match(BY);
			setState(1819);
			expression();
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1820);
				match(COMMA);
				setState(1821);
				expression();
				}
				}
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class WindowOrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DB2zSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DB2zSQLParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WindowOrderClauseQualifierContext> windowOrderClauseQualifier() {
			return getRuleContexts(WindowOrderClauseQualifierContext.class);
		}
		public WindowOrderClauseQualifierContext windowOrderClauseQualifier(int i) {
			return getRuleContext(WindowOrderClauseQualifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public WindowOrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowOrderClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterWindowOrderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitWindowOrderClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitWindowOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowOrderClauseContext windowOrderClause() throws RecognitionException {
		WindowOrderClauseContext _localctx = new WindowOrderClauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_windowOrderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			match(ORDER);
			setState(1828);
			match(BY);
			setState(1829);
			expression();
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1830);
				windowOrderClauseQualifier();
				}
			}

			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1833);
				match(COMMA);
				setState(1834);
				expression();
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(1835);
					windowOrderClauseQualifier();
					}
				}

				}
				}
				setState(1842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowOrderClauseQualifierContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(DB2zSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DB2zSQLParser.DESC, 0); }
		public TerminalNode NULLS() { return getToken(DB2zSQLParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(DB2zSQLParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(DB2zSQLParser.LAST, 0); }
		public WindowOrderClauseQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowOrderClauseQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterWindowOrderClauseQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitWindowOrderClauseQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitWindowOrderClauseQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowOrderClauseQualifierContext windowOrderClauseQualifier() throws RecognitionException {
		WindowOrderClauseQualifierContext _localctx = new WindowOrderClauseQualifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_windowOrderClauseQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1844);
				match(NULLS);
				setState(1845);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberingSpecificationContext extends ParserRuleContext {
		public TerminalNode ROW_NUMBER() { return getToken(DB2zSQLParser.ROW_NUMBER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public TerminalNode OVER() { return getToken(DB2zSQLParser.OVER, 0); }
		public WindowPartitionClauseContext windowPartitionClause() {
			return getRuleContext(WindowPartitionClauseContext.class,0);
		}
		public WindowOrderClauseContext windowOrderClause() {
			return getRuleContext(WindowOrderClauseContext.class,0);
		}
		public NumberingSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberingSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNumberingSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNumberingSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNumberingSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberingSpecificationContext numberingSpecification() throws RecognitionException {
		NumberingSpecificationContext _localctx = new NumberingSpecificationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_numberingSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(ROW_NUMBER);
			setState(1849);
			match(LPAREN);
			setState(1850);
			match(RPAREN);
			setState(1851);
			match(OVER);
			setState(1852);
			match(LPAREN);
			setState(1854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1853);
				windowPartitionClause();
				}
			}

			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1856);
				windowOrderClause();
				}
			}

			setState(1859);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationSpecificationContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(DB2zSQLParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public AggregateFunctionInvocationContext aggregateFunctionInvocation() {
			return getRuleContext(AggregateFunctionInvocationContext.class,0);
		}
		public OlapColumnFunctionContext olapColumnFunction() {
			return getRuleContext(OlapColumnFunctionContext.class,0);
		}
		public WindowPartitionClauseContext windowPartitionClause() {
			return getRuleContext(WindowPartitionClauseContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(DB2zSQLParser.RANGE, 0); }
		public TerminalNode BETWEEN() { return getToken(DB2zSQLParser.BETWEEN, 0); }
		public List<TerminalNode> UNBOUNDED() { return getTokens(DB2zSQLParser.UNBOUNDED); }
		public TerminalNode UNBOUNDED(int i) {
			return getToken(DB2zSQLParser.UNBOUNDED, i);
		}
		public TerminalNode PRECEDING() { return getToken(DB2zSQLParser.PRECEDING, 0); }
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public TerminalNode FOLLOWING() { return getToken(DB2zSQLParser.FOLLOWING, 0); }
		public WindowOrderClauseContext windowOrderClause() {
			return getRuleContext(WindowOrderClauseContext.class,0);
		}
		public WindowAggregationGroupClauseContext windowAggregationGroupClause() {
			return getRuleContext(WindowAggregationGroupClauseContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(DB2zSQLParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public AggregationSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAggregationSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAggregationSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAggregationSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationSpecificationContext aggregationSpecification() throws RecognitionException {
		AggregationSpecificationContext _localctx = new AggregationSpecificationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_aggregationSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1861);
				aggregateFunctionInvocation();
				}
				break;
			case 2:
				{
				setState(1862);
				olapColumnFunction();
				}
				break;
			}
			setState(1865);
			match(OVER);
			setState(1866);
			match(LPAREN);
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1867);
				windowPartitionClause();
				}
			}

			setState(1888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE:
				{
				{
				setState(1870);
				match(RANGE);
				setState(1871);
				match(BETWEEN);
				setState(1872);
				match(UNBOUNDED);
				setState(1873);
				match(PRECEDING);
				setState(1874);
				match(AND);
				setState(1875);
				match(UNBOUNDED);
				setState(1876);
				match(FOLLOWING);
				}
				}
				break;
			case ORDER:
				{
				{
				setState(1877);
				windowOrderClause();
				setState(1886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					{
					setState(1878);
					match(RANGE);
					setState(1879);
					match(BETWEEN);
					setState(1880);
					match(UNBOUNDED);
					setState(1881);
					match(PRECEDING);
					setState(1882);
					match(AND);
					setState(1883);
					match(CURRENT);
					setState(1884);
					match(ROW);
					}
					}
					break;
				case 2:
					{
					setState(1885);
					windowAggregationGroupClause();
					}
					break;
				}
				}
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1890);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode ARRAY_AGG() { return getToken(DB2zSQLParser.ARRAY_AGG, 0); }
		public TerminalNode AVG() { return getToken(DB2zSQLParser.AVG, 0); }
		public TerminalNode CORR() { return getToken(DB2zSQLParser.CORR, 0); }
		public TerminalNode CORRELATION() { return getToken(DB2zSQLParser.CORRELATION, 0); }
		public TerminalNode COUNT() { return getToken(DB2zSQLParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(DB2zSQLParser.COUNT_BIG, 0); }
		public TerminalNode COVAR_POP() { return getToken(DB2zSQLParser.COVAR_POP, 0); }
		public TerminalNode COVARIANCE() { return getToken(DB2zSQLParser.COVARIANCE, 0); }
		public TerminalNode COVAR() { return getToken(DB2zSQLParser.COVAR, 0); }
		public TerminalNode COVAR_SAMP() { return getToken(DB2zSQLParser.COVAR_SAMP, 0); }
		public TerminalNode COVARIANCE_SAMP() { return getToken(DB2zSQLParser.COVARIANCE_SAMP, 0); }
		public TerminalNode CUME_DIST() { return getToken(DB2zSQLParser.CUME_DIST, 0); }
		public TerminalNode GROUPING() { return getToken(DB2zSQLParser.GROUPING, 0); }
		public TerminalNode LISTAGG() { return getToken(DB2zSQLParser.LISTAGG, 0); }
		public TerminalNode MAX() { return getToken(DB2zSQLParser.MAX, 0); }
		public TerminalNode MEDIAN() { return getToken(DB2zSQLParser.MEDIAN, 0); }
		public TerminalNode MIN() { return getToken(DB2zSQLParser.MIN, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(DB2zSQLParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(DB2zSQLParser.PERCENTILE_DISC, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(DB2zSQLParser.PERCENT_RANK, 0); }
		public TerminalNode STDDEV_POP() { return getToken(DB2zSQLParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV() { return getToken(DB2zSQLParser.STDDEV, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(DB2zSQLParser.STDDEV_SAMP, 0); }
		public TerminalNode SUM() { return getToken(DB2zSQLParser.SUM, 0); }
		public TerminalNode VAR_POP() { return getToken(DB2zSQLParser.VAR_POP, 0); }
		public TerminalNode VARIANCE() { return getToken(DB2zSQLParser.VARIANCE, 0); }
		public TerminalNode VAR() { return getToken(DB2zSQLParser.VAR, 0); }
		public TerminalNode VAR_SAMP() { return getToken(DB2zSQLParser.VAR_SAMP, 0); }
		public TerminalNode VARIANCE_SAMP() { return getToken(DB2zSQLParser.VARIANCE_SAMP, 0); }
		public TerminalNode XMLAGG() { return getToken(DB2zSQLParser.XMLAGG, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAggregateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			_la = _input.LA(1);
			if ( !(((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (ARRAY_AGG - 322)) | (1L << (AVG - 322)) | (1L << (CORR - 322)) | (1L << (CORRELATION - 322)) | (1L << (COUNT - 322)) | (1L << (COUNT_BIG - 322)) | (1L << (COVAR - 322)) | (1L << (COVARIANCE - 322)) | (1L << (COVARIANCE_SAMP - 322)) | (1L << (COVAR_POP - 322)) | (1L << (COVAR_SAMP - 322)) | (1L << (CUME_DIST - 322)) | (1L << (GROUPING - 322)) | (1L << (LISTAGG - 322)) | (1L << (MEDIAN - 322)) | (1L << (PERCENTILE_CONT - 322)) | (1L << (PERCENTILE_DISC - 322)) | (1L << (PERCENT_RANK - 322)))) != 0) || ((((_la - 400)) & ~0x3f) == 0 && ((1L << (_la - 400)) & ((1L << (STDDEV - 400)) | (1L << (STDDEV_POP - 400)) | (1L << (STDDEV_SAMP - 400)) | (1L << (SUM - 400)) | (1L << (VAR - 400)) | (1L << (VARIANCE - 400)) | (1L << (VARIANCE_SAMP - 400)) | (1L << (VAR_POP - 400)) | (1L << (VAR_SAMP - 400)) | (1L << (XMLAGG - 400)))) != 0) || _la==MAX || _la==MIN) ) {
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

	public static class RegressionFunctionContext extends ParserRuleContext {
		public TerminalNode REGR_AVGX() { return getToken(DB2zSQLParser.REGR_AVGX, 0); }
		public TerminalNode REGR_AVGY() { return getToken(DB2zSQLParser.REGR_AVGY, 0); }
		public TerminalNode REGR_COUNT() { return getToken(DB2zSQLParser.REGR_COUNT, 0); }
		public TerminalNode REGR_INTERCEPT() { return getToken(DB2zSQLParser.REGR_INTERCEPT, 0); }
		public TerminalNode REGR_ICPT() { return getToken(DB2zSQLParser.REGR_ICPT, 0); }
		public TerminalNode REGR_R2() { return getToken(DB2zSQLParser.REGR_R2, 0); }
		public TerminalNode REGR_SLOPE() { return getToken(DB2zSQLParser.REGR_SLOPE, 0); }
		public TerminalNode REGR_SXX() { return getToken(DB2zSQLParser.REGR_SXX, 0); }
		public TerminalNode REGR_SXY() { return getToken(DB2zSQLParser.REGR_SXY, 0); }
		public TerminalNode REGR_SYY() { return getToken(DB2zSQLParser.REGR_SYY, 0); }
		public RegressionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regressionFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRegressionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRegressionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRegressionFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegressionFunctionContext regressionFunction() throws RecognitionException {
		RegressionFunctionContext _localctx = new RegressionFunctionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_regressionFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			_la = _input.LA(1);
			if ( !(((((_la - 380)) & ~0x3f) == 0 && ((1L << (_la - 380)) & ((1L << (REGR_AVGX - 380)) | (1L << (REGR_AVGY - 380)) | (1L << (REGR_COUNT - 380)) | (1L << (REGR_ICPT - 380)) | (1L << (REGR_INTERCEPT - 380)) | (1L << (REGR_R2 - 380)) | (1L << (REGR_SLOPE - 380)) | (1L << (REGR_SXX - 380)) | (1L << (REGR_SXY - 380)) | (1L << (REGR_SYY - 380)))) != 0)) ) {
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

	public static class OlapColumnFunctionContext extends ParserRuleContext {
		public FirstValueFunctionContext firstValueFunction() {
			return getRuleContext(FirstValueFunctionContext.class,0);
		}
		public LastValueFunctionContext lastValueFunction() {
			return getRuleContext(LastValueFunctionContext.class,0);
		}
		public NthValueFunctionContext nthValueFunction() {
			return getRuleContext(NthValueFunctionContext.class,0);
		}
		public RatioToReportFunctionContext ratioToReportFunction() {
			return getRuleContext(RatioToReportFunctionContext.class,0);
		}
		public OlapColumnFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapColumnFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOlapColumnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOlapColumnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOlapColumnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapColumnFunctionContext olapColumnFunction() throws RecognitionException {
		OlapColumnFunctionContext _localctx = new OlapColumnFunctionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_olapColumnFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST_VALUE:
				{
				setState(1896);
				firstValueFunction();
				}
				break;
			case LAST_VALUE:
				{
				setState(1897);
				lastValueFunction();
				}
				break;
			case NTH_VALUE:
				{
				setState(1898);
				nthValueFunction();
				}
				break;
			case RATIO_TO_REPORT:
				{
				setState(1899);
				ratioToReportFunction();
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

	public static class FirstValueFunctionContext extends ParserRuleContext {
		public TerminalNode FIRST_VALUE() { return getToken(DB2zSQLParser.FIRST_VALUE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DB2zSQLParser.COMMA, 0); }
		public RespectNullsClauseContext respectNullsClause() {
			return getRuleContext(RespectNullsClauseContext.class,0);
		}
		public FirstValueFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstValueFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFirstValueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFirstValueFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFirstValueFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstValueFunctionContext firstValueFunction() throws RecognitionException {
		FirstValueFunctionContext _localctx = new FirstValueFunctionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_firstValueFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			match(FIRST_VALUE);
			setState(1903);
			match(LPAREN);
			setState(1904);
			expression();
			setState(1907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1905);
				match(COMMA);
				setState(1906);
				respectNullsClause();
				}
			}

			setState(1909);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastValueFunctionContext extends ParserRuleContext {
		public TerminalNode LAST_VALUE() { return getToken(DB2zSQLParser.LAST_VALUE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DB2zSQLParser.COMMA, 0); }
		public RespectNullsClauseContext respectNullsClause() {
			return getRuleContext(RespectNullsClauseContext.class,0);
		}
		public LastValueFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastValueFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLastValueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLastValueFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLastValueFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastValueFunctionContext lastValueFunction() throws RecognitionException {
		LastValueFunctionContext _localctx = new LastValueFunctionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lastValueFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			match(LAST_VALUE);
			setState(1912);
			match(LPAREN);
			setState(1913);
			expression();
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1914);
				match(COMMA);
				setState(1915);
				respectNullsClause();
				}
			}

			setState(1918);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NthValueFunctionContext extends ParserRuleContext {
		public TerminalNode NTH_VALUE() { return getToken(DB2zSQLParser.NTH_VALUE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DB2zSQLParser.COMMA, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public NthValueFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nthValueFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNthValueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNthValueFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNthValueFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NthValueFunctionContext nthValueFunction() throws RecognitionException {
		NthValueFunctionContext _localctx = new NthValueFunctionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_nthValueFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			match(NTH_VALUE);
			setState(1921);
			match(LPAREN);
			setState(1922);
			expression();
			setState(1923);
			match(COMMA);
			setState(1924);
			match(INTEGERLITERAL);
			setState(1925);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatioToReportFunctionContext extends ParserRuleContext {
		public TerminalNode RATIO_TO_REPORT() { return getToken(DB2zSQLParser.RATIO_TO_REPORT, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public RatioToReportFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioToReportFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRatioToReportFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRatioToReportFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRatioToReportFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioToReportFunctionContext ratioToReportFunction() throws RecognitionException {
		RatioToReportFunctionContext _localctx = new RatioToReportFunctionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_ratioToReportFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			match(RATIO_TO_REPORT);
			setState(1928);
			match(LPAREN);
			setState(1929);
			expression();
			setState(1930);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowAggregationGroupClauseContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(DB2zSQLParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(DB2zSQLParser.RANGE, 0); }
		public GroupStartContext groupStart() {
			return getRuleContext(GroupStartContext.class,0);
		}
		public GroupBetweenContext groupBetween() {
			return getRuleContext(GroupBetweenContext.class,0);
		}
		public GroupEndContext groupEnd() {
			return getRuleContext(GroupEndContext.class,0);
		}
		public WindowAggregationGroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowAggregationGroupClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterWindowAggregationGroupClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitWindowAggregationGroupClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitWindowAggregationGroupClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowAggregationGroupClauseContext windowAggregationGroupClause() throws RecognitionException {
		WindowAggregationGroupClauseContext _localctx = new WindowAggregationGroupClauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_windowAggregationGroupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1933);
				groupStart();
				}
				break;
			case 2:
				{
				setState(1934);
				groupBetween();
				}
				break;
			case 3:
				{
				setState(1935);
				groupEnd();
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

	public static class GroupStartContext extends ParserRuleContext {
		public UnboundedPrecedingContext unboundedPreceding() {
			return getRuleContext(UnboundedPrecedingContext.class,0);
		}
		public BoundedPrecedingContext boundedPreceding() {
			return getRuleContext(BoundedPrecedingContext.class,0);
		}
		public CurrentRowContext currentRow() {
			return getRuleContext(CurrentRowContext.class,0);
		}
		public GroupStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupStartContext groupStart() throws RecognitionException {
		GroupStartContext _localctx = new GroupStartContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_groupStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				{
				setState(1938);
				unboundedPreceding();
				}
				break;
			case INTEGERLITERAL:
				{
				setState(1939);
				boundedPreceding();
				}
				break;
			case CURRENT:
				{
				setState(1940);
				currentRow();
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

	public static class GroupBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(DB2zSQLParser.BETWEEN, 0); }
		public GroupBound1Context groupBound1() {
			return getRuleContext(GroupBound1Context.class,0);
		}
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public GroupBound2Context groupBound2() {
			return getRuleContext(GroupBound2Context.class,0);
		}
		public GroupBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBetween; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupBetweenContext groupBetween() throws RecognitionException {
		GroupBetweenContext _localctx = new GroupBetweenContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_groupBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(BETWEEN);
			setState(1944);
			groupBound1();
			setState(1945);
			match(AND);
			setState(1946);
			groupBound2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupEndContext extends ParserRuleContext {
		public UnboundedFollowingContext unboundedFollowing() {
			return getRuleContext(UnboundedFollowingContext.class,0);
		}
		public BoundedFollowingContext boundedFollowing() {
			return getRuleContext(BoundedFollowingContext.class,0);
		}
		public GroupEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupEndContext groupEnd() throws RecognitionException {
		GroupEndContext _localctx = new GroupEndContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_groupEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				{
				setState(1948);
				unboundedFollowing();
				}
				break;
			case INTEGERLITERAL:
				{
				setState(1949);
				boundedFollowing();
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

	public static class GroupBound1Context extends ParserRuleContext {
		public UnboundedPrecedingContext unboundedPreceding() {
			return getRuleContext(UnboundedPrecedingContext.class,0);
		}
		public BoundedPrecedingContext boundedPreceding() {
			return getRuleContext(BoundedPrecedingContext.class,0);
		}
		public BoundedFollowingContext boundedFollowing() {
			return getRuleContext(BoundedFollowingContext.class,0);
		}
		public CurrentRowContext currentRow() {
			return getRuleContext(CurrentRowContext.class,0);
		}
		public GroupBound1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBound1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupBound1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupBound1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupBound1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupBound1Context groupBound1() throws RecognitionException {
		GroupBound1Context _localctx = new GroupBound1Context(_ctx, getState());
		enterRule(_localctx, 196, RULE_groupBound1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1952);
				unboundedPreceding();
				}
				break;
			case 2:
				{
				setState(1953);
				boundedPreceding();
				}
				break;
			case 3:
				{
				setState(1954);
				boundedFollowing();
				}
				break;
			case 4:
				{
				setState(1955);
				currentRow();
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

	public static class GroupBound2Context extends ParserRuleContext {
		public UnboundedFollowingContext unboundedFollowing() {
			return getRuleContext(UnboundedFollowingContext.class,0);
		}
		public BoundedPrecedingContext boundedPreceding() {
			return getRuleContext(BoundedPrecedingContext.class,0);
		}
		public BoundedFollowingContext boundedFollowing() {
			return getRuleContext(BoundedFollowingContext.class,0);
		}
		public CurrentRowContext currentRow() {
			return getRuleContext(CurrentRowContext.class,0);
		}
		public GroupBound2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBound2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupBound2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupBound2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupBound2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupBound2Context groupBound2() throws RecognitionException {
		GroupBound2Context _localctx = new GroupBound2Context(_ctx, getState());
		enterRule(_localctx, 198, RULE_groupBound2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1958);
				unboundedFollowing();
				}
				break;
			case 2:
				{
				setState(1959);
				boundedPreceding();
				}
				break;
			case 3:
				{
				setState(1960);
				boundedFollowing();
				}
				break;
			case 4:
				{
				setState(1961);
				currentRow();
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

	public static class UnboundedPrecedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(DB2zSQLParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(DB2zSQLParser.PRECEDING, 0); }
		public UnboundedPrecedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unboundedPreceding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterUnboundedPreceding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitUnboundedPreceding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitUnboundedPreceding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnboundedPrecedingContext unboundedPreceding() throws RecognitionException {
		UnboundedPrecedingContext _localctx = new UnboundedPrecedingContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_unboundedPreceding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			match(UNBOUNDED);
			setState(1965);
			match(PRECEDING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnboundedFollowingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(DB2zSQLParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(DB2zSQLParser.FOLLOWING, 0); }
		public UnboundedFollowingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unboundedFollowing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterUnboundedFollowing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitUnboundedFollowing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitUnboundedFollowing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnboundedFollowingContext unboundedFollowing() throws RecognitionException {
		UnboundedFollowingContext _localctx = new UnboundedFollowingContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_unboundedFollowing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(UNBOUNDED);
			setState(1968);
			match(FOLLOWING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundedPrecedingContext extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode PRECEDING() { return getToken(DB2zSQLParser.PRECEDING, 0); }
		public BoundedPrecedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundedPreceding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterBoundedPreceding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitBoundedPreceding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitBoundedPreceding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundedPrecedingContext boundedPreceding() throws RecognitionException {
		BoundedPrecedingContext _localctx = new BoundedPrecedingContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_boundedPreceding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			match(INTEGERLITERAL);
			setState(1971);
			match(PRECEDING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundedFollowingContext extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode FOLLOWING() { return getToken(DB2zSQLParser.FOLLOWING, 0); }
		public BoundedFollowingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundedFollowing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterBoundedFollowing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitBoundedFollowing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitBoundedFollowing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundedFollowingContext boundedFollowing() throws RecognitionException {
		BoundedFollowingContext _localctx = new BoundedFollowingContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_boundedFollowing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			match(INTEGERLITERAL);
			setState(1974);
			match(FOLLOWING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrentRowContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(DB2zSQLParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public CurrentRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCurrentRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCurrentRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCurrentRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurrentRowContext currentRow() throws RecognitionException {
		CurrentRowContext _localctx = new CurrentRowContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_currentRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			match(CURRENT);
			setState(1977);
			match(ROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarFunctionContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(DB2zSQLParser.ABS, 0); }
		public TerminalNode ABSVAL() { return getToken(DB2zSQLParser.ABSVAL, 0); }
		public TerminalNode ACOS() { return getToken(DB2zSQLParser.ACOS, 0); }
		public TerminalNode ADD_DAYS() { return getToken(DB2zSQLParser.ADD_DAYS, 0); }
		public TerminalNode ADD_MONTHS() { return getToken(DB2zSQLParser.ADD_MONTHS, 0); }
		public TerminalNode ARRAY_DELETE() { return getToken(DB2zSQLParser.ARRAY_DELETE, 0); }
		public TerminalNode ARRAY_FIRST() { return getToken(DB2zSQLParser.ARRAY_FIRST, 0); }
		public TerminalNode ARRAY_LAST() { return getToken(DB2zSQLParser.ARRAY_LAST, 0); }
		public TerminalNode ARRAY_NEXT() { return getToken(DB2zSQLParser.ARRAY_NEXT, 0); }
		public TerminalNode ARRAY_PRIOR() { return getToken(DB2zSQLParser.ARRAY_PRIOR, 0); }
		public TerminalNode ARRAY_TRIM() { return getToken(DB2zSQLParser.ARRAY_TRIM, 0); }
		public TerminalNode ASCII() { return getToken(DB2zSQLParser.ASCII, 0); }
		public TerminalNode ASCII_CHR() { return getToken(DB2zSQLParser.ASCII_CHR, 0); }
		public TerminalNode ASCIISTR() { return getToken(DB2zSQLParser.ASCIISTR, 0); }
		public TerminalNode ASCII_STR() { return getToken(DB2zSQLParser.ASCII_STR, 0); }
		public TerminalNode ASIN() { return getToken(DB2zSQLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(DB2zSQLParser.ATAN, 0); }
		public TerminalNode ATAN2() { return getToken(DB2zSQLParser.ATAN2, 0); }
		public TerminalNode ATANH() { return getToken(DB2zSQLParser.ATANH, 0); }
		public TerminalNode BIGINT() { return getToken(DB2zSQLParser.BIGINT, 0); }
		public TerminalNode BINARY() { return getToken(DB2zSQLParser.BINARY, 0); }
		public TerminalNode BITAND() { return getToken(DB2zSQLParser.BITAND, 0); }
		public TerminalNode BITANDNOT() { return getToken(DB2zSQLParser.BITANDNOT, 0); }
		public TerminalNode BITNOT() { return getToken(DB2zSQLParser.BITNOT, 0); }
		public TerminalNode BITOR() { return getToken(DB2zSQLParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(DB2zSQLParser.BITXOR, 0); }
		public TerminalNode BLOB() { return getToken(DB2zSQLParser.BLOB, 0); }
		public TerminalNode BTRIM() { return getToken(DB2zSQLParser.BTRIM, 0); }
		public TerminalNode CARDINALITY() { return getToken(DB2zSQLParser.CARDINALITY, 0); }
		public TerminalNode CCSID_ENCODING() { return getToken(DB2zSQLParser.CCSID_ENCODING, 0); }
		public TerminalNode CEIL() { return getToken(DB2zSQLParser.CEIL, 0); }
		public TerminalNode CEILING() { return getToken(DB2zSQLParser.CEILING, 0); }
		public TerminalNode CHAR() { return getToken(DB2zSQLParser.CHAR, 0); }
		public TerminalNode CHAR9() { return getToken(DB2zSQLParser.CHAR9, 0); }
		public TerminalNode CHARACTER_LENGTH() { return getToken(DB2zSQLParser.CHARACTER_LENGTH, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(DB2zSQLParser.CHAR_LENGTH, 0); }
		public TerminalNode CHR() { return getToken(DB2zSQLParser.CHR, 0); }
		public TerminalNode CLOB() { return getToken(DB2zSQLParser.CLOB, 0); }
		public TerminalNode COALESCE() { return getToken(DB2zSQLParser.COALESCE, 0); }
		public TerminalNode COLLATION_KEY() { return getToken(DB2zSQLParser.COLLATION_KEY, 0); }
		public TerminalNode COMPARE_DECFLOAT() { return getToken(DB2zSQLParser.COMPARE_DECFLOAT, 0); }
		public TerminalNode CONCAT() { return getToken(DB2zSQLParser.CONCAT, 0); }
		public TerminalNode CONTAINS() { return getToken(DB2zSQLParser.CONTAINS, 0); }
		public TerminalNode COS() { return getToken(DB2zSQLParser.COS, 0); }
		public TerminalNode COSH() { return getToken(DB2zSQLParser.COSH, 0); }
		public TerminalNode DATE() { return getToken(DB2zSQLParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(DB2zSQLParser.DAY, 0); }
		public TerminalNode DAYOFMONTH() { return getToken(DB2zSQLParser.DAYOFMONTH, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(DB2zSQLParser.DAYOFWEEK, 0); }
		public TerminalNode DAYOFWEEK_ISO() { return getToken(DB2zSQLParser.DAYOFWEEK_ISO, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(DB2zSQLParser.DAYOFYEAR, 0); }
		public TerminalNode DAYS() { return getToken(DB2zSQLParser.DAYS, 0); }
		public TerminalNode DAYS_BETWEEN() { return getToken(DB2zSQLParser.DAYS_BETWEEN, 0); }
		public TerminalNode DBCLOB() { return getToken(DB2zSQLParser.DBCLOB, 0); }
		public TerminalNode DEC() { return getToken(DB2zSQLParser.DEC, 0); }
		public TerminalNode DECFLOAT() { return getToken(DB2zSQLParser.DECFLOAT, 0); }
		public TerminalNode DECFLOAT_FORMAT() { return getToken(DB2zSQLParser.DECFLOAT_FORMAT, 0); }
		public TerminalNode DECFLOAT_SORTKEY() { return getToken(DB2zSQLParser.DECFLOAT_SORTKEY, 0); }
		public TerminalNode DECIMAL() { return getToken(DB2zSQLParser.DECIMAL, 0); }
		public TerminalNode DECODE() { return getToken(DB2zSQLParser.DECODE, 0); }
		public TerminalNode DECRYPT_BINARY() { return getToken(DB2zSQLParser.DECRYPT_BINARY, 0); }
		public TerminalNode DECRYPT_BIT() { return getToken(DB2zSQLParser.DECRYPT_BIT, 0); }
		public TerminalNode DECRYPT_CHAR() { return getToken(DB2zSQLParser.DECRYPT_CHAR, 0); }
		public TerminalNode DECRYPT_DATAKEY_BIGINT() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_BIGINT, 0); }
		public TerminalNode DECRYPT_DATAKEY_BIT() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_BIT, 0); }
		public TerminalNode DECRYPT_DATAKEY_CLOB() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_CLOB, 0); }
		public TerminalNode DECRYPT_DATAKEY_DBCLOB() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_DBCLOB, 0); }
		public TerminalNode DECRYPT_DATAKEY_DECIMAL() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_DECIMAL, 0); }
		public TerminalNode DECRYPT_DATAKEY_INTEGER() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_INTEGER, 0); }
		public TerminalNode DECRYPT_DATAKEY_VARCHAR() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_VARCHAR, 0); }
		public TerminalNode DECRYPT_DATAKEY_VARGRAPHIC() { return getToken(DB2zSQLParser.DECRYPT_DATAKEY_VARGRAPHIC, 0); }
		public TerminalNode DECRYPT_DB() { return getToken(DB2zSQLParser.DECRYPT_DB, 0); }
		public TerminalNode DEGREES() { return getToken(DB2zSQLParser.DEGREES, 0); }
		public TerminalNode DIFFERENCE() { return getToken(DB2zSQLParser.DIFFERENCE, 0); }
		public TerminalNode DIGITS() { return getToken(DB2zSQLParser.DIGITS, 0); }
		public TerminalNode DOUBLE() { return getToken(DB2zSQLParser.DOUBLE, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(DB2zSQLParser.DOUBLE_PRECISION, 0); }
		public TerminalNode DSN_XMLVALIDATE() { return getToken(DB2zSQLParser.DSN_XMLVALIDATE, 0); }
		public TerminalNode EBCDIC_CHR() { return getToken(DB2zSQLParser.EBCDIC_CHR, 0); }
		public TerminalNode EBCDIC_STR() { return getToken(DB2zSQLParser.EBCDIC_STR, 0); }
		public TerminalNode ENCRYPT_DATAKEY() { return getToken(DB2zSQLParser.ENCRYPT_DATAKEY, 0); }
		public TerminalNode ENCRYPT_TDES() { return getToken(DB2zSQLParser.ENCRYPT_TDES, 0); }
		public TerminalNode EXP() { return getToken(DB2zSQLParser.EXP, 0); }
		public TerminalNode EXTRACT() { return getToken(DB2zSQLParser.EXTRACT, 0); }
		public TerminalNode FLOAT() { return getToken(DB2zSQLParser.FLOAT, 0); }
		public TerminalNode FLOOR() { return getToken(DB2zSQLParser.FLOOR, 0); }
		public TerminalNode GENERATE_UNIQUE() { return getToken(DB2zSQLParser.GENERATE_UNIQUE, 0); }
		public TerminalNode GENERATE_UNIQUE_BINARY() { return getToken(DB2zSQLParser.GENERATE_UNIQUE_BINARY, 0); }
		public TerminalNode GETHINT() { return getToken(DB2zSQLParser.GETHINT, 0); }
		public TerminalNode GETVARIABLE() { return getToken(DB2zSQLParser.GETVARIABLE, 0); }
		public TerminalNode GRAPHIC() { return getToken(DB2zSQLParser.GRAPHIC, 0); }
		public TerminalNode GREATEST() { return getToken(DB2zSQLParser.GREATEST, 0); }
		public TerminalNode HASH() { return getToken(DB2zSQLParser.HASH, 0); }
		public TerminalNode HASH_CRC32() { return getToken(DB2zSQLParser.HASH_CRC32, 0); }
		public TerminalNode HASH_MD5() { return getToken(DB2zSQLParser.HASH_MD5, 0); }
		public TerminalNode HASH_SHA1() { return getToken(DB2zSQLParser.HASH_SHA1, 0); }
		public TerminalNode HASH_SHA256() { return getToken(DB2zSQLParser.HASH_SHA256, 0); }
		public TerminalNode HEX() { return getToken(DB2zSQLParser.HEX, 0); }
		public TerminalNode HOUR() { return getToken(DB2zSQLParser.HOUR, 0); }
		public TerminalNode IDENTITY_VAL_LOCAL() { return getToken(DB2zSQLParser.IDENTITY_VAL_LOCAL, 0); }
		public TerminalNode IFNULL() { return getToken(DB2zSQLParser.IFNULL, 0); }
		public TerminalNode INSERT() { return getToken(DB2zSQLParser.INSERT, 0); }
		public TerminalNode INSTR() { return getToken(DB2zSQLParser.INSTR, 0); }
		public TerminalNode INT() { return getToken(DB2zSQLParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(DB2zSQLParser.INTEGER, 0); }
		public TerminalNode JULIAN_DAY() { return getToken(DB2zSQLParser.JULIAN_DAY, 0); }
		public TerminalNode LAST_DAY() { return getToken(DB2zSQLParser.LAST_DAY, 0); }
		public TerminalNode LCASE() { return getToken(DB2zSQLParser.LCASE, 0); }
		public TerminalNode LEAST() { return getToken(DB2zSQLParser.LEAST, 0); }
		public TerminalNode LEFT() { return getToken(DB2zSQLParser.LEFT, 0); }
		public TerminalNode LENGTH() { return getToken(DB2zSQLParser.LENGTH, 0); }
		public TerminalNode LN() { return getToken(DB2zSQLParser.LN, 0); }
		public TerminalNode LOCATE() { return getToken(DB2zSQLParser.LOCATE, 0); }
		public TerminalNode LOCATE_IN_STRING() { return getToken(DB2zSQLParser.LOCATE_IN_STRING, 0); }
		public TerminalNode LOG10() { return getToken(DB2zSQLParser.LOG10, 0); }
		public TerminalNode LOWER() { return getToken(DB2zSQLParser.LOWER, 0); }
		public TerminalNode LPAD() { return getToken(DB2zSQLParser.LPAD, 0); }
		public TerminalNode LTRIM() { return getToken(DB2zSQLParser.LTRIM, 0); }
		public TerminalNode MAX_CARDINALITY() { return getToken(DB2zSQLParser.MAX_CARDINALITY, 0); }
		public TerminalNode MICROSECOND() { return getToken(DB2zSQLParser.MICROSECOND, 0); }
		public TerminalNode MIDNIGHT_SECONDS() { return getToken(DB2zSQLParser.MIDNIGHT_SECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(DB2zSQLParser.MINUTE, 0); }
		public TerminalNode MOD() { return getToken(DB2zSQLParser.MOD, 0); }
		public TerminalNode MONTH() { return getToken(DB2zSQLParser.MONTH, 0); }
		public TerminalNode MONTHS_BETWEEN() { return getToken(DB2zSQLParser.MONTHS_BETWEEN, 0); }
		public TerminalNode MQREAD() { return getToken(DB2zSQLParser.MQREAD, 0); }
		public TerminalNode MQREADCLOB() { return getToken(DB2zSQLParser.MQREADCLOB, 0); }
		public TerminalNode MQRECEIVE() { return getToken(DB2zSQLParser.MQRECEIVE, 0); }
		public TerminalNode MQRECEIVECLOB() { return getToken(DB2zSQLParser.MQRECEIVECLOB, 0); }
		public TerminalNode MQSEND() { return getToken(DB2zSQLParser.MQSEND, 0); }
		public TerminalNode MULTIPLY_ALT() { return getToken(DB2zSQLParser.MULTIPLY_ALT, 0); }
		public TerminalNode NEXT_DAY() { return getToken(DB2zSQLParser.NEXT_DAY, 0); }
		public TerminalNode NEXT_MONTH() { return getToken(DB2zSQLParser.NEXT_MONTH, 0); }
		public TerminalNode NORMALIZE_DECFLOAT() { return getToken(DB2zSQLParser.NORMALIZE_DECFLOAT, 0); }
		public TerminalNode NORMALIZE_STRING() { return getToken(DB2zSQLParser.NORMALIZE_STRING, 0); }
		public TerminalNode NULLIF() { return getToken(DB2zSQLParser.NULLIF, 0); }
		public TerminalNode NVL() { return getToken(DB2zSQLParser.NVL, 0); }
		public TerminalNode OVERLAY() { return getToken(DB2zSQLParser.OVERLAY, 0); }
		public TerminalNode PACK() { return getToken(DB2zSQLParser.PACK, 0); }
		public TerminalNode POSITION() { return getToken(DB2zSQLParser.POSITION, 0); }
		public TerminalNode POSSTR() { return getToken(DB2zSQLParser.POSSTR, 0); }
		public TerminalNode POW() { return getToken(DB2zSQLParser.POW, 0); }
		public TerminalNode POWER() { return getToken(DB2zSQLParser.POWER, 0); }
		public TerminalNode QUANTIZE() { return getToken(DB2zSQLParser.QUANTIZE, 0); }
		public TerminalNode QUARTER() { return getToken(DB2zSQLParser.QUARTER, 0); }
		public TerminalNode RADIANS() { return getToken(DB2zSQLParser.RADIANS, 0); }
		public TerminalNode RAISE_ERROR() { return getToken(DB2zSQLParser.RAISE_ERROR, 0); }
		public TerminalNode RAND() { return getToken(DB2zSQLParser.RAND, 0); }
		public TerminalNode RANDOM() { return getToken(DB2zSQLParser.RANDOM, 0); }
		public TerminalNode REAL() { return getToken(DB2zSQLParser.REAL, 0); }
		public TerminalNode REGEXP_COUNT() { return getToken(DB2zSQLParser.REGEXP_COUNT, 0); }
		public TerminalNode REGEXP_INSTR() { return getToken(DB2zSQLParser.REGEXP_INSTR, 0); }
		public TerminalNode REGEXP_LIKE() { return getToken(DB2zSQLParser.REGEXP_LIKE, 0); }
		public TerminalNode REGEXP_REPLACE() { return getToken(DB2zSQLParser.REGEXP_REPLACE, 0); }
		public TerminalNode REGEXP_SUBSTR() { return getToken(DB2zSQLParser.REGEXP_SUBSTR, 0); }
		public TerminalNode REPEAT() { return getToken(DB2zSQLParser.REPEAT, 0); }
		public TerminalNode REPLACE() { return getToken(DB2zSQLParser.REPLACE, 0); }
		public TerminalNode RID() { return getToken(DB2zSQLParser.RID, 0); }
		public TerminalNode RIGHT() { return getToken(DB2zSQLParser.RIGHT, 0); }
		public TerminalNode ROUND() { return getToken(DB2zSQLParser.ROUND, 0); }
		public TerminalNode ROUND_TIMESTAMP() { return getToken(DB2zSQLParser.ROUND_TIMESTAMP, 0); }
		public TerminalNode ROWID() { return getToken(DB2zSQLParser.ROWID, 0); }
		public TerminalNode RPAD() { return getToken(DB2zSQLParser.RPAD, 0); }
		public TerminalNode RTRIM() { return getToken(DB2zSQLParser.RTRIM, 0); }
		public TerminalNode SCORE() { return getToken(DB2zSQLParser.SCORE, 0); }
		public TerminalNode SECOND() { return getToken(DB2zSQLParser.SECOND, 0); }
		public TerminalNode SIGN() { return getToken(DB2zSQLParser.SIGN, 0); }
		public TerminalNode SIN() { return getToken(DB2zSQLParser.SIN, 0); }
		public TerminalNode SINH() { return getToken(DB2zSQLParser.SINH, 0); }
		public TerminalNode SMALLINT() { return getToken(DB2zSQLParser.SMALLINT, 0); }
		public TerminalNode SOAPHTTPC() { return getToken(DB2zSQLParser.SOAPHTTPC, 0); }
		public TerminalNode SOAPHTTPNC() { return getToken(DB2zSQLParser.SOAPHTTPNC, 0); }
		public TerminalNode SOAPHTTPNV() { return getToken(DB2zSQLParser.SOAPHTTPNV, 0); }
		public TerminalNode SOAPHTTPV() { return getToken(DB2zSQLParser.SOAPHTTPV, 0); }
		public TerminalNode SOUNDEX() { return getToken(DB2zSQLParser.SOUNDEX, 0); }
		public TerminalNode SPACE() { return getToken(DB2zSQLParser.SPACE, 0); }
		public TerminalNode SQRT() { return getToken(DB2zSQLParser.SQRT, 0); }
		public TerminalNode STRIP() { return getToken(DB2zSQLParser.STRIP, 0); }
		public TerminalNode STRLEFT() { return getToken(DB2zSQLParser.STRLEFT, 0); }
		public TerminalNode STRPOS() { return getToken(DB2zSQLParser.STRPOS, 0); }
		public TerminalNode STRRIGHT() { return getToken(DB2zSQLParser.STRRIGHT, 0); }
		public TerminalNode SUBSTR() { return getToken(DB2zSQLParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(DB2zSQLParser.SUBSTRING, 0); }
		public TerminalNode TAN() { return getToken(DB2zSQLParser.TAN, 0); }
		public TerminalNode TANH() { return getToken(DB2zSQLParser.TANH, 0); }
		public TerminalNode TIME() { return getToken(DB2zSQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DB2zSQLParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(DB2zSQLParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(DB2zSQLParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TIMESTAMP_FORMAT() { return getToken(DB2zSQLParser.TIMESTAMP_FORMAT, 0); }
		public TerminalNode TIMESTAMP_ISO() { return getToken(DB2zSQLParser.TIMESTAMP_ISO, 0); }
		public TerminalNode TIMESTAMP_TZ() { return getToken(DB2zSQLParser.TIMESTAMP_TZ, 0); }
		public TerminalNode TO_CHAR() { return getToken(DB2zSQLParser.TO_CHAR, 0); }
		public TerminalNode TO_CLOB() { return getToken(DB2zSQLParser.TO_CLOB, 0); }
		public TerminalNode TO_DATE() { return getToken(DB2zSQLParser.TO_DATE, 0); }
		public TerminalNode TO_NUMBER() { return getToken(DB2zSQLParser.TO_NUMBER, 0); }
		public TerminalNode TOTALORDER() { return getToken(DB2zSQLParser.TOTALORDER, 0); }
		public TerminalNode TO_TIMESTAMP() { return getToken(DB2zSQLParser.TO_TIMESTAMP, 0); }
		public TerminalNode TRANSLATE() { return getToken(DB2zSQLParser.TRANSLATE, 0); }
		public TerminalNode TRIM() { return getToken(DB2zSQLParser.TRIM, 0); }
		public TerminalNode TRIM_ARRAY() { return getToken(DB2zSQLParser.TRIM_ARRAY, 0); }
		public TerminalNode TRUNC() { return getToken(DB2zSQLParser.TRUNC, 0); }
		public TerminalNode TRUNCATE() { return getToken(DB2zSQLParser.TRUNCATE, 0); }
		public TerminalNode TRUNC_TIMESTAMP() { return getToken(DB2zSQLParser.TRUNC_TIMESTAMP, 0); }
		public TerminalNode UCASE() { return getToken(DB2zSQLParser.UCASE, 0); }
		public TerminalNode UNICODE() { return getToken(DB2zSQLParser.UNICODE, 0); }
		public TerminalNode UNICODE_STR() { return getToken(DB2zSQLParser.UNICODE_STR, 0); }
		public TerminalNode UNISTR() { return getToken(DB2zSQLParser.UNISTR, 0); }
		public TerminalNode UPPER() { return getToken(DB2zSQLParser.UPPER, 0); }
		public TerminalNode VALUE() { return getToken(DB2zSQLParser.VALUE, 0); }
		public TerminalNode VARBINARY() { return getToken(DB2zSQLParser.VARBINARY, 0); }
		public TerminalNode VARCHAR() { return getToken(DB2zSQLParser.VARCHAR, 0); }
		public TerminalNode VARCHAR9() { return getToken(DB2zSQLParser.VARCHAR9, 0); }
		public TerminalNode VARCHAR_BIT_FORMAT() { return getToken(DB2zSQLParser.VARCHAR_BIT_FORMAT, 0); }
		public TerminalNode VARCHAR_FORMAT() { return getToken(DB2zSQLParser.VARCHAR_FORMAT, 0); }
		public TerminalNode VARGRAPHIC() { return getToken(DB2zSQLParser.VARGRAPHIC, 0); }
		public TerminalNode VERIFY_GROUP_FOR_USER() { return getToken(DB2zSQLParser.VERIFY_GROUP_FOR_USER, 0); }
		public TerminalNode VERIFY_ROLE_FOR_USER() { return getToken(DB2zSQLParser.VERIFY_ROLE_FOR_USER, 0); }
		public TerminalNode VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER() { return getToken(DB2zSQLParser.VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER, 0); }
		public TerminalNode WEEK() { return getToken(DB2zSQLParser.WEEK, 0); }
		public TerminalNode WEEK_ISO() { return getToken(DB2zSQLParser.WEEK_ISO, 0); }
		public TerminalNode WRAP() { return getToken(DB2zSQLParser.WRAP, 0); }
		public TerminalNode XMLATTRIBUTES() { return getToken(DB2zSQLParser.XMLATTRIBUTES, 0); }
		public TerminalNode XMLCOMMENT() { return getToken(DB2zSQLParser.XMLCOMMENT, 0); }
		public TerminalNode XMLCONCAT() { return getToken(DB2zSQLParser.XMLCONCAT, 0); }
		public TerminalNode XMLDOCUMENT() { return getToken(DB2zSQLParser.XMLDOCUMENT, 0); }
		public TerminalNode XMLELEMENT() { return getToken(DB2zSQLParser.XMLELEMENT, 0); }
		public TerminalNode XMLFOREST() { return getToken(DB2zSQLParser.XMLFOREST, 0); }
		public TerminalNode XMLMODIFY() { return getToken(DB2zSQLParser.XMLMODIFY, 0); }
		public TerminalNode XMLNAMESPACES() { return getToken(DB2zSQLParser.XMLNAMESPACES, 0); }
		public TerminalNode XMLPARSE() { return getToken(DB2zSQLParser.XMLPARSE, 0); }
		public TerminalNode XMLPI() { return getToken(DB2zSQLParser.XMLPI, 0); }
		public TerminalNode XMLQUERY() { return getToken(DB2zSQLParser.XMLQUERY, 0); }
		public TerminalNode XMLSERIALIZE() { return getToken(DB2zSQLParser.XMLSERIALIZE, 0); }
		public TerminalNode XMLTEXT() { return getToken(DB2zSQLParser.XMLTEXT, 0); }
		public TerminalNode XMLXSROBJECTID() { return getToken(DB2zSQLParser.XMLXSROBJECTID, 0); }
		public TerminalNode XSLTRANSFORM() { return getToken(DB2zSQLParser.XSLTRANSFORM, 0); }
		public TerminalNode YEAR() { return getToken(DB2zSQLParser.YEAR, 0); }
		public ScalarFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterScalarFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitScalarFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitScalarFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarFunctionContext scalarFunction() throws RecognitionException {
		ScalarFunctionContext _localctx = new ScalarFunctionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_scalarFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (CHAR - 58)) | (1L << (CONCAT - 58)) | (1L << (CONTAINS - 58)) | (1L << (DAY - 58)) | (1L << (DAYS - 58)) | (1L << (DOUBLE - 58)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (HOUR - 140)) | (1L << (INSERT - 140)) | (1L << (LEFT - 140)) | (1L << (MICROSECOND - 140)) | (1L << (MONTH - 140)))) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (REPEAT - 236)) | (1L << (RIGHT - 236)) | (1L << (SECOND - 236)) | (1L << (TRUNCATE - 236)))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (VALUE - 300)) | (1L << (XMLNAMESPACES - 300)) | (1L << (YEAR - 300)))) != 0) || ((((_la - 484)) & ~0x3f) == 0 && ((1L << (_la - 484)) & ((1L << (ABS - 484)) | (1L << (ABSVAL - 484)) | (1L << (ACOS - 484)) | (1L << (ADD_DAYS - 484)) | (1L << (ADD_MONTHS - 484)) | (1L << (ARRAY_DELETE - 484)) | (1L << (ARRAY_FIRST - 484)) | (1L << (ARRAY_LAST - 484)) | (1L << (ARRAY_NEXT - 484)) | (1L << (ARRAY_PRIOR - 484)) | (1L << (ARRAY_TRIM - 484)) | (1L << (ASCII - 484)) | (1L << (ASCII_CHR - 484)) | (1L << (ASCIISTR - 484)) | (1L << (ASCII_STR - 484)) | (1L << (ASIN - 484)) | (1L << (ATAN - 484)) | (1L << (ATAN2 - 484)) | (1L << (ATANH - 484)) | (1L << (BIGINT - 484)) | (1L << (BINARY - 484)) | (1L << (BITAND - 484)) | (1L << (BITANDNOT - 484)) | (1L << (BITNOT - 484)) | (1L << (BITOR - 484)) | (1L << (BITXOR - 484)) | (1L << (BLOB - 484)) | (1L << (BTRIM - 484)) | (1L << (CARDINALITY - 484)) | (1L << (CCSID_ENCODING - 484)) | (1L << (CEIL - 484)) | (1L << (CEILING - 484)) | (1L << (CHAR9 - 484)) | (1L << (CHARACTER_LENGTH - 484)) | (1L << (CHAR_LENGTH - 484)) | (1L << (CHR - 484)) | (1L << (CLOB - 484)) | (1L << (COALESCE - 484)) | (1L << (COLLATION_KEY - 484)) | (1L << (COMPARE_DECFLOAT - 484)) | (1L << (COS - 484)) | (1L << (COSH - 484)) | (1L << (DATE - 484)) | (1L << (DAYOFMONTH - 484)) | (1L << (DAYOFWEEK - 484)) | (1L << (DAYOFWEEK_ISO - 484)) | (1L << (DAYOFYEAR - 484)) | (1L << (DAYS_BETWEEN - 484)) | (1L << (DBCLOB - 484)) | (1L << (DEC - 484)) | (1L << (DECFLOAT - 484)) | (1L << (DECFLOAT_FORMAT - 484)) | (1L << (DECFLOAT_SORTKEY - 484)) | (1L << (DECIMAL - 484)) | (1L << (DECODE - 484)) | (1L << (DECRYPT_BINARY - 484)) | (1L << (DECRYPT_BIT - 484)) | (1L << (DECRYPT_CHAR - 484)) | (1L << (DECRYPT_DATAKEY_BIGINT - 484)) | (1L << (DECRYPT_DATAKEY_BIT - 484)) | (1L << (DECRYPT_DATAKEY_CLOB - 484)) | (1L << (DECRYPT_DATAKEY_DBCLOB - 484)) | (1L << (DECRYPT_DATAKEY_DECIMAL - 484)) | (1L << (DECRYPT_DATAKEY_INTEGER - 484)))) != 0) || ((((_la - 548)) & ~0x3f) == 0 && ((1L << (_la - 548)) & ((1L << (DECRYPT_DATAKEY_VARCHAR - 548)) | (1L << (DECRYPT_DATAKEY_VARGRAPHIC - 548)) | (1L << (DECRYPT_DB - 548)) | (1L << (DEGREES - 548)) | (1L << (DIFFERENCE - 548)) | (1L << (DIGITS - 548)) | (1L << (DOUBLE_PRECISION - 548)) | (1L << (DSN_XMLVALIDATE - 548)) | (1L << (EBCDIC_CHR - 548)) | (1L << (EBCDIC_STR - 548)) | (1L << (ENCRYPT_DATAKEY - 548)) | (1L << (ENCRYPT_TDES - 548)) | (1L << (EXP - 548)) | (1L << (EXTRACT - 548)) | (1L << (FLOAT - 548)) | (1L << (FLOOR - 548)) | (1L << (GENERATE_UNIQUE - 548)) | (1L << (GENERATE_UNIQUE_BINARY - 548)) | (1L << (GETHINT - 548)) | (1L << (GETVARIABLE - 548)) | (1L << (GRAPHIC - 548)) | (1L << (GREATEST - 548)) | (1L << (HASH - 548)) | (1L << (HASH_CRC32 - 548)) | (1L << (HASH_MD5 - 548)) | (1L << (HASH_SHA1 - 548)) | (1L << (HASH_SHA256 - 548)) | (1L << (HEX - 548)) | (1L << (IDENTITY_VAL_LOCAL - 548)) | (1L << (IFNULL - 548)) | (1L << (INSTR - 548)) | (1L << (INT - 548)) | (1L << (INTEGER - 548)) | (1L << (JULIAN_DAY - 548)) | (1L << (LAST_DAY - 548)) | (1L << (LCASE - 548)) | (1L << (LEAST - 548)) | (1L << (LENGTH - 548)) | (1L << (LN - 548)) | (1L << (LOCATE - 548)) | (1L << (LOCATE_IN_STRING - 548)) | (1L << (LOG10 - 548)) | (1L << (LOWER - 548)) | (1L << (LPAD - 548)) | (1L << (LTRIM - 548)) | (1L << (MAX_CARDINALITY - 548)) | (1L << (MIDNIGHT_SECONDS - 548)) | (1L << (MINUTE - 548)) | (1L << (MOD - 548)) | (1L << (MONTHS_BETWEEN - 548)) | (1L << (MQREAD - 548)) | (1L << (MQREADCLOB - 548)) | (1L << (MQRECEIVE - 548)) | (1L << (MQRECEIVECLOB - 548)) | (1L << (MQSEND - 548)) | (1L << (MULTIPLY_ALT - 548)) | (1L << (NEXT_DAY - 548)) | (1L << (NEXT_MONTH - 548)) | (1L << (NORMALIZE_DECFLOAT - 548)) | (1L << (NORMALIZE_STRING - 548)) | (1L << (NULLIF - 548)) | (1L << (NVL - 548)))) != 0) || ((((_la - 612)) & ~0x3f) == 0 && ((1L << (_la - 612)) & ((1L << (OVERLAY - 612)) | (1L << (PACK - 612)) | (1L << (POSITION - 612)) | (1L << (POSSTR - 612)) | (1L << (POW - 612)) | (1L << (POWER - 612)) | (1L << (QUANTIZE - 612)) | (1L << (QUARTER - 612)) | (1L << (RADIANS - 612)) | (1L << (RAISE_ERROR - 612)) | (1L << (RAND - 612)) | (1L << (RANDOM - 612)) | (1L << (REAL - 612)) | (1L << (REGEXP_COUNT - 612)) | (1L << (REGEXP_INSTR - 612)) | (1L << (REGEXP_LIKE - 612)) | (1L << (REGEXP_REPLACE - 612)) | (1L << (REGEXP_SUBSTR - 612)) | (1L << (REPLACE - 612)) | (1L << (RID - 612)) | (1L << (ROUND - 612)) | (1L << (ROUND_TIMESTAMP - 612)) | (1L << (ROWID - 612)) | (1L << (RPAD - 612)) | (1L << (RTRIM - 612)) | (1L << (SCORE - 612)) | (1L << (SIGN - 612)) | (1L << (SIN - 612)) | (1L << (SINH - 612)) | (1L << (SMALLINT - 612)) | (1L << (SOAPHTTPC - 612)) | (1L << (SOAPHTTPNC - 612)) | (1L << (SOAPHTTPNV - 612)) | (1L << (SOAPHTTPV - 612)) | (1L << (SOUNDEX - 612)) | (1L << (SPACE - 612)) | (1L << (SQRT - 612)) | (1L << (STRIP - 612)) | (1L << (STRLEFT - 612)) | (1L << (STRPOS - 612)) | (1L << (STRRIGHT - 612)) | (1L << (SUBSTR - 612)) | (1L << (SUBSTRING - 612)) | (1L << (TAN - 612)) | (1L << (TANH - 612)) | (1L << (TIME - 612)) | (1L << (TIMESTAMP - 612)) | (1L << (TIMESTAMPADD - 612)) | (1L << (TIMESTAMPDIFF - 612)) | (1L << (TIMESTAMP_FORMAT - 612)) | (1L << (TIMESTAMP_ISO - 612)) | (1L << (TIMESTAMP_TZ - 612)) | (1L << (TO_CHAR - 612)) | (1L << (TO_CLOB - 612)) | (1L << (TO_DATE - 612)) | (1L << (TO_NUMBER - 612)) | (1L << (TOTALORDER - 612)) | (1L << (TO_TIMESTAMP - 612)) | (1L << (TRANSLATE - 612)) | (1L << (TRIM - 612)) | (1L << (TRIM_ARRAY - 612)) | (1L << (TRUNC - 612)) | (1L << (TRUNC_TIMESTAMP - 612)) | (1L << (UCASE - 612)))) != 0) || ((((_la - 676)) & ~0x3f) == 0 && ((1L << (_la - 676)) & ((1L << (UNICODE - 676)) | (1L << (UNICODE_STR - 676)) | (1L << (UNISTR - 676)) | (1L << (UPPER - 676)) | (1L << (VARBINARY - 676)) | (1L << (VARCHAR - 676)) | (1L << (VARCHAR9 - 676)) | (1L << (VARCHAR_BIT_FORMAT - 676)) | (1L << (VARCHAR_FORMAT - 676)) | (1L << (VARGRAPHIC - 676)) | (1L << (VERIFY_GROUP_FOR_USER - 676)) | (1L << (VERIFY_ROLE_FOR_USER - 676)) | (1L << (VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER - 676)) | (1L << (WEEK - 676)) | (1L << (WEEK_ISO - 676)) | (1L << (WRAP - 676)) | (1L << (XMLATTRIBUTES - 676)) | (1L << (XMLCOMMENT - 676)) | (1L << (XMLCONCAT - 676)) | (1L << (XMLDOCUMENT - 676)) | (1L << (XMLELEMENT - 676)) | (1L << (XMLFOREST - 676)) | (1L << (XMLMODIFY - 676)) | (1L << (XMLPARSE - 676)) | (1L << (XMLPI - 676)) | (1L << (XMLQUERY - 676)) | (1L << (XMLSERIALIZE - 676)) | (1L << (XMLTEXT - 676)) | (1L << (XMLXSROBJECTID - 676)) | (1L << (XSLTRANSFORM - 676)))) != 0)) ) {
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

	public static class TableFunctionContext extends ParserRuleContext {
		public TerminalNode ADMIN_TASK_LIST() { return getToken(DB2zSQLParser.ADMIN_TASK_LIST, 0); }
		public TerminalNode ADMIN_TASK_OUTPUT() { return getToken(DB2zSQLParser.ADMIN_TASK_OUTPUT, 0); }
		public TerminalNode ADMIN_TASK_STATUS() { return getToken(DB2zSQLParser.ADMIN_TASK_STATUS, 0); }
		public TerminalNode BLOCKING_THREADS() { return getToken(DB2zSQLParser.BLOCKING_THREADS, 0); }
		public TerminalNode MQREADALL() { return getToken(DB2zSQLParser.MQREADALL, 0); }
		public TerminalNode MQREADALLCLOB() { return getToken(DB2zSQLParser.MQREADALLCLOB, 0); }
		public TerminalNode MQRECEIVEALL() { return getToken(DB2zSQLParser.MQRECEIVEALL, 0); }
		public TerminalNode MQRECEIVEALLCLOB() { return getToken(DB2zSQLParser.MQRECEIVEALLCLOB, 0); }
		public TerminalNode XMLTABLE() { return getToken(DB2zSQLParser.XMLTABLE, 0); }
		public TableFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTableFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTableFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTableFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFunctionContext tableFunction() throws RecognitionException {
		TableFunctionContext _localctx = new TableFunctionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_tableFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if ( !(((((_la - 745)) & ~0x3f) == 0 && ((1L << (_la - 745)) & ((1L << (ADMIN_TASK_LIST - 745)) | (1L << (ADMIN_TASK_OUTPUT - 745)) | (1L << (ADMIN_TASK_STATUS - 745)) | (1L << (BLOCKING_THREADS - 745)) | (1L << (MQREADALL - 745)) | (1L << (MQREADALLCLOB - 745)) | (1L << (MQRECEIVEALL - 745)) | (1L << (MQRECEIVEALLCLOB - 745)) | (1L << (XMLTABLE - 745)))) != 0)) ) {
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

	public static class SpecialRegisterContext extends ParserRuleContext {
		public TerminalNode CURRENT_ACCELERATOR() { return getToken(DB2zSQLParser.CURRENT_ACCELERATOR, 0); }
		public TerminalNode CURRENT_APPLICATION_COMPATIBILITY() { return getToken(DB2zSQLParser.CURRENT_APPLICATION_COMPATIBILITY, 0); }
		public TerminalNode CURRENT_APPLICATION_ENCODING_SCHEME() { return getToken(DB2zSQLParser.CURRENT_APPLICATION_ENCODING_SCHEME, 0); }
		public TerminalNode CURRENT_CLIENT_ACCTNG() { return getToken(DB2zSQLParser.CURRENT_CLIENT_ACCTNG, 0); }
		public TerminalNode CURRENT_CLIENT_APPLNAME() { return getToken(DB2zSQLParser.CURRENT_CLIENT_APPLNAME, 0); }
		public TerminalNode CURRENT_CLIENT_CORR_TOKEN() { return getToken(DB2zSQLParser.CURRENT_CLIENT_CORR_TOKEN, 0); }
		public TerminalNode CURRENT_CLIENT_USERID() { return getToken(DB2zSQLParser.CURRENT_CLIENT_USERID, 0); }
		public TerminalNode CURRENT_CLIENT_WRKSTNNAME() { return getToken(DB2zSQLParser.CURRENT_CLIENT_WRKSTNNAME, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(DB2zSQLParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_DEBUG_MODE() { return getToken(DB2zSQLParser.CURRENT_DEBUG_MODE, 0); }
		public TerminalNode CURRENT_DECFLOAT_ROUNDING_MODE() { return getToken(DB2zSQLParser.CURRENT_DECFLOAT_ROUNDING_MODE, 0); }
		public TerminalNode CURRENT_DEGREE() { return getToken(DB2zSQLParser.CURRENT_DEGREE, 0); }
		public TerminalNode CURRENT_EXPLAIN_MODE() { return getToken(DB2zSQLParser.CURRENT_EXPLAIN_MODE, 0); }
		public TerminalNode CURRENT_GET_ACCEL_ARCHIVE() { return getToken(DB2zSQLParser.CURRENT_GET_ACCEL_ARCHIVE, 0); }
		public TerminalNode CURRENT_LOCALE_LC_CTYPE() { return getToken(DB2zSQLParser.CURRENT_LOCALE_LC_CTYPE, 0); }
		public TerminalNode CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION() { return getToken(DB2zSQLParser.CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION, 0); }
		public TerminalNode CURRENT_MEMBER() { return getToken(DB2zSQLParser.CURRENT_MEMBER, 0); }
		public TerminalNode CURRENT_OPTIMIZATION_HINT() { return getToken(DB2zSQLParser.CURRENT_OPTIMIZATION_HINT, 0); }
		public TerminalNode CURRENT_PACKAGE_PATH() { return getToken(DB2zSQLParser.CURRENT_PACKAGE_PATH, 0); }
		public TerminalNode CURRENT_PACKAGESET() { return getToken(DB2zSQLParser.CURRENT_PACKAGESET, 0); }
		public TerminalNode CURRENT_PATH() { return getToken(DB2zSQLParser.CURRENT_PATH, 0); }
		public TerminalNode CURRENT_PRECISION() { return getToken(DB2zSQLParser.CURRENT_PRECISION, 0); }
		public TerminalNode CURRENT_QUERY_ACCELERATION() { return getToken(DB2zSQLParser.CURRENT_QUERY_ACCELERATION, 0); }
		public TerminalNode CURRENT_QUERY_ACCELERATION_WAITFORDATA() { return getToken(DB2zSQLParser.CURRENT_QUERY_ACCELERATION_WAITFORDATA, 0); }
		public TerminalNode CURRENT_REFRESH_AGE() { return getToken(DB2zSQLParser.CURRENT_REFRESH_AGE, 0); }
		public TerminalNode CURRENT_ROUTINE_VERSION() { return getToken(DB2zSQLParser.CURRENT_ROUTINE_VERSION, 0); }
		public TerminalNode CURRENT_RULES() { return getToken(DB2zSQLParser.CURRENT_RULES, 0); }
		public TerminalNode CURRENT_SCHEMA() { return getToken(DB2zSQLParser.CURRENT_SCHEMA, 0); }
		public TerminalNode CURRENT_SERVER() { return getToken(DB2zSQLParser.CURRENT_SERVER, 0); }
		public TerminalNode CURRENT_SQLID() { return getToken(DB2zSQLParser.CURRENT_SQLID, 0); }
		public TerminalNode CURRENT_TEMPORAL_BUSINESS_TIME() { return getToken(DB2zSQLParser.CURRENT_TEMPORAL_BUSINESS_TIME, 0); }
		public TerminalNode CURRENT_TEMPORAL_SYSTEM_TIME() { return getToken(DB2zSQLParser.CURRENT_TEMPORAL_SYSTEM_TIME, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(DB2zSQLParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DB2zSQLParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_TIME_ZONE() { return getToken(DB2zSQLParser.CURRENT_TIME_ZONE, 0); }
		public TerminalNode ENCRYPTION_PASSWORD() { return getToken(DB2zSQLParser.ENCRYPTION_PASSWORD, 0); }
		public TerminalNode SESSION_TIME_ZONE() { return getToken(DB2zSQLParser.SESSION_TIME_ZONE, 0); }
		public TerminalNode SESSION_USER() { return getToken(DB2zSQLParser.SESSION_USER, 0); }
		public TerminalNode USER() { return getToken(DB2zSQLParser.USER, 0); }
		public SpecialRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSpecialRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSpecialRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSpecialRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialRegisterContext specialRegister() throws RecognitionException {
		SpecialRegisterContext _localctx = new SpecialRegisterContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_specialRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_la = _input.LA(1);
			if ( !(((((_la - 706)) & ~0x3f) == 0 && ((1L << (_la - 706)) & ((1L << (CURRENT_ACCELERATOR - 706)) | (1L << (CURRENT_APPLICATION_COMPATIBILITY - 706)) | (1L << (CURRENT_APPLICATION_ENCODING_SCHEME - 706)) | (1L << (CURRENT_CLIENT_ACCTNG - 706)) | (1L << (CURRENT_CLIENT_APPLNAME - 706)) | (1L << (CURRENT_CLIENT_CORR_TOKEN - 706)) | (1L << (CURRENT_CLIENT_USERID - 706)) | (1L << (CURRENT_CLIENT_WRKSTNNAME - 706)) | (1L << (CURRENT_DATE - 706)) | (1L << (CURRENT_DEBUG_MODE - 706)) | (1L << (CURRENT_DECFLOAT_ROUNDING_MODE - 706)) | (1L << (CURRENT_DEGREE - 706)) | (1L << (CURRENT_EXPLAIN_MODE - 706)) | (1L << (CURRENT_GET_ACCEL_ARCHIVE - 706)) | (1L << (CURRENT_LOCALE_LC_CTYPE - 706)) | (1L << (CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION - 706)) | (1L << (CURRENT_MEMBER - 706)) | (1L << (CURRENT_OPTIMIZATION_HINT - 706)) | (1L << (CURRENT_PACKAGE_PATH - 706)) | (1L << (CURRENT_PACKAGESET - 706)) | (1L << (CURRENT_PATH - 706)) | (1L << (CURRENT_PRECISION - 706)) | (1L << (CURRENT_QUERY_ACCELERATION - 706)) | (1L << (CURRENT_QUERY_ACCELERATION_WAITFORDATA - 706)) | (1L << (CURRENT_REFRESH_AGE - 706)) | (1L << (CURRENT_ROUTINE_VERSION - 706)) | (1L << (CURRENT_RULES - 706)) | (1L << (CURRENT_SCHEMA - 706)) | (1L << (CURRENT_SERVER - 706)) | (1L << (CURRENT_SQLID - 706)) | (1L << (CURRENT_TEMPORAL_BUSINESS_TIME - 706)) | (1L << (CURRENT_TEMPORAL_SYSTEM_TIME - 706)) | (1L << (CURRENT_TIME - 706)) | (1L << (CURRENT_TIMESTAMP - 706)) | (1L << (CURRENT_TIME_ZONE - 706)) | (1L << (ENCRYPTION_PASSWORD - 706)) | (1L << (SESSION_TIME_ZONE - 706)) | (1L << (SESSION_USER - 706)) | (1L << (USER - 706)))) != 0)) ) {
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

	public static class XmltableFunctionSpecificationContext extends ParserRuleContext {
		public TerminalNode XMLTABLE() { return getToken(DB2zSQLParser.XMLTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public RowXqueryExpressionConstantContext rowXqueryExpressionConstant() {
			return getRuleContext(RowXqueryExpressionConstantContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public XmlnamespacesDeclarationContext xmlnamespacesDeclaration() {
			return getRuleContext(XmlnamespacesDeclarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public TerminalNode PASSING() { return getToken(DB2zSQLParser.PASSING, 0); }
		public List<RowXqueryArgumentContext> rowXqueryArgument() {
			return getRuleContexts(RowXqueryArgumentContext.class);
		}
		public RowXqueryArgumentContext rowXqueryArgument(int i) {
			return getRuleContext(RowXqueryArgumentContext.class,i);
		}
		public TerminalNode COLUMNS() { return getToken(DB2zSQLParser.COLUMNS, 0); }
		public List<XmlTableRegularColumnDefinitionContext> xmlTableRegularColumnDefinition() {
			return getRuleContexts(XmlTableRegularColumnDefinitionContext.class);
		}
		public XmlTableRegularColumnDefinitionContext xmlTableRegularColumnDefinition(int i) {
			return getRuleContext(XmlTableRegularColumnDefinitionContext.class,i);
		}
		public List<XmlTableOrdinalityColumnDefinitionContext> xmlTableOrdinalityColumnDefinition() {
			return getRuleContexts(XmlTableOrdinalityColumnDefinitionContext.class);
		}
		public XmlTableOrdinalityColumnDefinitionContext xmlTableOrdinalityColumnDefinition(int i) {
			return getRuleContext(XmlTableOrdinalityColumnDefinitionContext.class,i);
		}
		public TerminalNode BY() { return getToken(DB2zSQLParser.BY, 0); }
		public TerminalNode REF() { return getToken(DB2zSQLParser.REF, 0); }
		public XmltableFunctionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmltableFunctionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmltableFunctionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmltableFunctionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmltableFunctionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmltableFunctionSpecificationContext xmltableFunctionSpecification() throws RecognitionException {
		XmltableFunctionSpecificationContext _localctx = new XmltableFunctionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_xmltableFunctionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1985);
			match(XMLTABLE);
			setState(1986);
			match(LPAREN);
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLNAMESPACES) {
				{
				setState(1987);
				xmlnamespacesDeclaration();
				setState(1988);
				match(COMMA);
				}
			}

			setState(1992);
			rowXqueryExpressionConstant();
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSING) {
				{
				setState(1993);
				match(PASSING);
				setState(1996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1994);
					match(BY);
					setState(1995);
					match(REF);
					}
					break;
				}
				setState(1998);
				rowXqueryArgument();
				{
				setState(1999);
				match(COMMA);
				setState(2000);
				rowXqueryArgument();
				}
				}
			}

			setState(2019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMNS) {
				{
				setState(2004);
				match(COLUMNS);
				setState(2007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(2005);
					xmlTableRegularColumnDefinition();
					}
					break;
				case 2:
					{
					setState(2006);
					xmlTableOrdinalityColumnDefinition();
					}
					break;
				}
				setState(2016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2009);
					match(COMMA);
					setState(2012);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(2010);
						xmlTableRegularColumnDefinition();
						}
						break;
					case 2:
						{
						setState(2011);
						xmlTableOrdinalityColumnDefinition();
						}
						break;
					}
					}
					}
					setState(2018);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2021);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowXqueryExpressionConstantContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public RowXqueryExpressionConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowXqueryExpressionConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRowXqueryExpressionConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRowXqueryExpressionConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRowXqueryExpressionConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowXqueryExpressionConstantContext rowXqueryExpressionConstant() throws RecognitionException {
		RowXqueryExpressionConstantContext _localctx = new RowXqueryExpressionConstantContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_rowXqueryExpressionConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2023);
			match(NONNUMERICLITERAL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowXqueryArgumentContext extends ParserRuleContext {
		public XqueryContextItemExpressionContext xqueryContextItemExpression() {
			return getRuleContext(XqueryContextItemExpressionContext.class,0);
		}
		public XqueryVariableExpressionContext xqueryVariableExpression() {
			return getRuleContext(XqueryVariableExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RowXqueryArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowXqueryArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRowXqueryArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRowXqueryArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRowXqueryArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowXqueryArgumentContext rowXqueryArgument() throws RecognitionException {
		RowXqueryArgumentContext _localctx = new RowXqueryArgumentContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_rowXqueryArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(2025);
				xqueryContextItemExpression();
				}
				break;
			case 2:
				{
				{
				setState(2026);
				xqueryVariableExpression();
				setState(2027);
				match(AS);
				setState(2028);
				identifier();
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

	public static class XqueryContextItemExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public XqueryContextItemExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xqueryContextItemExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXqueryContextItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXqueryContextItemExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXqueryContextItemExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqueryContextItemExpressionContext xqueryContextItemExpression() throws RecognitionException {
		XqueryContextItemExpressionContext _localctx = new XqueryContextItemExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_xqueryContextItemExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2032);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XqueryVariableExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public XqueryVariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xqueryVariableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXqueryVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXqueryVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXqueryVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqueryVariableExpressionContext xqueryVariableExpression() throws RecognitionException {
		XqueryVariableExpressionContext _localctx = new XqueryVariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_xqueryVariableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2034);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlTableRegularColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public TerminalNode PATH() { return getToken(DB2zSQLParser.PATH, 0); }
		public ColumnXqueryExpressionConstantContext columnXqueryExpressionConstant() {
			return getRuleContext(ColumnXqueryExpressionConstantContext.class,0);
		}
		public XmlTableRegularColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlTableRegularColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmlTableRegularColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmlTableRegularColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmlTableRegularColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlTableRegularColumnDefinitionContext xmlTableRegularColumnDefinition() throws RecognitionException {
		XmlTableRegularColumnDefinitionContext _localctx = new XmlTableRegularColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_xmlTableRegularColumnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2036);
			columnName();
			setState(2037);
			dataType();
			setState(2041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
			case WITH:
				{
				setState(2038);
				defaultClause();
				}
				break;
			case PATH:
				{
				{
				setState(2039);
				match(PATH);
				setState(2040);
				columnXqueryExpressionConstant();
				}
				}
				break;
			case RPAREN:
			case COMMA:
				break;
			default:
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

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public DefaultClauseAllowablesContext defaultClauseAllowables() {
			return getRuleContext(DefaultClauseAllowablesContext.class,0);
		}
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public DistinctTypeCastFunctionNameContext distinctTypeCastFunctionName() {
			return getRuleContext(DistinctTypeCastFunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2043);
				match(WITH);
				}
			}

			setState(2046);
			match(DEFAULT);
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(2047);
				defaultClauseAllowables();
				}
				break;
			case 2:
				{
				{
				setState(2048);
				distinctTypeCastFunctionName();
				setState(2049);
				match(LPAREN);
				setState(2050);
				defaultClauseAllowables();
				setState(2051);
				match(RPAREN);
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

	public static class DefaultClauseAllowablesContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode SESSION_USER() { return getToken(DB2zSQLParser.SESSION_USER, 0); }
		public TerminalNode USER() { return getToken(DB2zSQLParser.USER, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public TerminalNode CURRENT() { return getToken(DB2zSQLParser.CURRENT, 0); }
		public TerminalNode SQLID() { return getToken(DB2zSQLParser.SQLID, 0); }
		public DefaultClauseAllowablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClauseAllowables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDefaultClauseAllowables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDefaultClauseAllowables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDefaultClauseAllowables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseAllowablesContext defaultClauseAllowables() throws RecognitionException {
		DefaultClauseAllowablesContext _localctx = new DefaultClauseAllowablesContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defaultClauseAllowables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
			case INTEGERLITERAL:
			case NUMERICLITERAL:
				{
				setState(2055);
				literal();
				}
				break;
			case SESSION_USER:
				{
				setState(2056);
				match(SESSION_USER);
				}
				break;
			case USER:
				{
				setState(2057);
				match(USER);
				}
				break;
			case CURRENT:
				{
				{
				setState(2058);
				match(CURRENT);
				setState(2059);
				match(SQLID);
				}
				}
				break;
			case NULL:
				{
				setState(2060);
				match(NULL);
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

	public static class DistinctTypeCastFunctionNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public DistinctTypeCastFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctTypeCastFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDistinctTypeCastFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDistinctTypeCastFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDistinctTypeCastFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctTypeCastFunctionNameContext distinctTypeCastFunctionName() throws RecognitionException {
		DistinctTypeCastFunctionNameContext _localctx = new DistinctTypeCastFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_distinctTypeCastFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2063);
			identifier();
			setState(2064);
			match(DOT);
			setState(2065);
			identifier();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnXqueryExpressionConstantContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public ColumnXqueryExpressionConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnXqueryExpressionConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterColumnXqueryExpressionConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitColumnXqueryExpressionConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitColumnXqueryExpressionConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnXqueryExpressionConstantContext columnXqueryExpressionConstant() throws RecognitionException {
		ColumnXqueryExpressionConstantContext _localctx = new ColumnXqueryExpressionConstantContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_columnXqueryExpressionConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2067);
			match(NONNUMERICLITERAL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlTableOrdinalityColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode ORDINALITY() { return getToken(DB2zSQLParser.ORDINALITY, 0); }
		public XmlTableOrdinalityColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlTableOrdinalityColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmlTableOrdinalityColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmlTableOrdinalityColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmlTableOrdinalityColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlTableOrdinalityColumnDefinitionContext xmlTableOrdinalityColumnDefinition() throws RecognitionException {
		XmlTableOrdinalityColumnDefinitionContext _localctx = new XmlTableOrdinalityColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_xmlTableOrdinalityColumnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2069);
			columnName();
			setState(2070);
			match(FOR);
			setState(2071);
			match(ORDINALITY);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlnamespacesDeclarationContext extends ParserRuleContext {
		public List<XmlnamespacesFunctionSpecificationContext> xmlnamespacesFunctionSpecification() {
			return getRuleContexts(XmlnamespacesFunctionSpecificationContext.class);
		}
		public XmlnamespacesFunctionSpecificationContext xmlnamespacesFunctionSpecification(int i) {
			return getRuleContext(XmlnamespacesFunctionSpecificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public XmlnamespacesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlnamespacesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmlnamespacesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmlnamespacesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmlnamespacesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlnamespacesDeclarationContext xmlnamespacesDeclaration() throws RecognitionException {
		XmlnamespacesDeclarationContext _localctx = new XmlnamespacesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_xmlnamespacesDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2073);
			xmlnamespacesFunctionSpecification();
			setState(2078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2074);
					match(COMMA);
					setState(2075);
					xmlnamespacesFunctionSpecification();
					}
					} 
				}
				setState(2080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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

	public static class XmlnamespacesFunctionSpecificationContext extends ParserRuleContext {
		public TerminalNode XMLNAMESPACES() { return getToken(DB2zSQLParser.XMLNAMESPACES, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<XmlnamespacesFunctionArgumentsContext> xmlnamespacesFunctionArguments() {
			return getRuleContexts(XmlnamespacesFunctionArgumentsContext.class);
		}
		public XmlnamespacesFunctionArgumentsContext xmlnamespacesFunctionArguments(int i) {
			return getRuleContext(XmlnamespacesFunctionArgumentsContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public XmlnamespacesFunctionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlnamespacesFunctionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmlnamespacesFunctionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmlnamespacesFunctionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmlnamespacesFunctionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlnamespacesFunctionSpecificationContext xmlnamespacesFunctionSpecification() throws RecognitionException {
		XmlnamespacesFunctionSpecificationContext _localctx = new XmlnamespacesFunctionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_xmlnamespacesFunctionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2081);
			match(XMLNAMESPACES);
			setState(2082);
			match(LPAREN);
			setState(2083);
			xmlnamespacesFunctionArguments();
			setState(2088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2084);
				match(COMMA);
				setState(2085);
				xmlnamespacesFunctionArguments();
				}
				}
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2091);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlnamespacesFunctionArgumentsContext extends ParserRuleContext {
		public NamespaceUriContext namespaceUri() {
			return getRuleContext(NamespaceUriContext.class,0);
		}
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public TerminalNode NO() { return getToken(DB2zSQLParser.NO, 0); }
		public XmlnamespacesFunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlnamespacesFunctionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmlnamespacesFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmlnamespacesFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmlnamespacesFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlnamespacesFunctionArgumentsContext xmlnamespacesFunctionArguments() throws RecognitionException {
		XmlnamespacesFunctionArgumentsContext _localctx = new XmlnamespacesFunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_xmlnamespacesFunctionArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
				{
				{
				setState(2093);
				namespaceUri();
				setState(2094);
				match(AS);
				setState(2095);
				namespacePrefix();
				}
				}
				break;
			case DEFAULT:
				{
				{
				setState(2097);
				match(DEFAULT);
				setState(2098);
				namespaceUri();
				}
				}
				break;
			case NO:
				{
				{
				setState(2099);
				match(NO);
				setState(2100);
				match(DEFAULT);
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

	public static class NamespaceUriContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public NamespaceUriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceUri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNamespaceUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNamespaceUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNamespaceUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceUriContext namespaceUri() throws RecognitionException {
		NamespaceUriContext _localctx = new NamespaceUriContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_namespaceUri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			match(NONNUMERICLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacePrefixContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public NamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacePrefixContext namespacePrefix() throws RecognitionException {
		NamespacePrefixContext _localctx = new NamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			match(NONNUMERICLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeZoneSpecificExpressionContext extends ParserRuleContext {
		public List<TimeZoneExpressionSubsetContext> timeZoneExpressionSubset() {
			return getRuleContexts(TimeZoneExpressionSubsetContext.class);
		}
		public TimeZoneExpressionSubsetContext timeZoneExpressionSubset(int i) {
			return getRuleContext(TimeZoneExpressionSubsetContext.class,i);
		}
		public TerminalNode AT() { return getToken(DB2zSQLParser.AT, 0); }
		public TerminalNode LOCAL() { return getToken(DB2zSQLParser.LOCAL, 0); }
		public TerminalNode TIME() { return getToken(DB2zSQLParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(DB2zSQLParser.ZONE, 0); }
		public TimeZoneSpecificExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecificExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTimeZoneSpecificExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTimeZoneSpecificExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTimeZoneSpecificExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecificExpressionContext timeZoneSpecificExpression() throws RecognitionException {
		TimeZoneSpecificExpressionContext _localctx = new TimeZoneSpecificExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_timeZoneSpecificExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			timeZoneExpressionSubset();
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				{
				setState(2108);
				match(AT);
				setState(2109);
				match(LOCAL);
				}
				}
				break;
			case 2:
				{
				{
				setState(2110);
				match(AT);
				setState(2111);
				match(TIME);
				setState(2112);
				match(ZONE);
				setState(2113);
				timeZoneExpressionSubset();
				}
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

	public static class TimeZoneExpressionSubsetContext extends ParserRuleContext {
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public SpecialRegisterContext specialRegister() {
			return getRuleContext(SpecialRegisterContext.class,0);
		}
		public ScalarFullSelectContext scalarFullSelect() {
			return getRuleContext(ScalarFullSelectContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public CastSpecificationContext castSpecification() {
			return getRuleContext(CastSpecificationContext.class,0);
		}
		public TimeZoneExpressionSubsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneExpressionSubset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTimeZoneExpressionSubset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTimeZoneExpressionSubset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTimeZoneExpressionSubset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneExpressionSubsetContext timeZoneExpressionSubset() throws RecognitionException {
		TimeZoneExpressionSubsetContext _localctx = new TimeZoneExpressionSubsetContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_timeZoneExpressionSubset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(2116);
				functionInvocation();
				}
				break;
			case 2:
				{
				setState(2117);
				literal();
				}
				break;
			case 3:
				{
				setState(2118);
				columnName();
				}
				break;
			case 4:
				{
				setState(2119);
				hostVariable();
				}
				break;
			case 5:
				{
				setState(2120);
				specialRegister();
				}
				break;
			case 6:
				{
				setState(2121);
				scalarFullSelect();
				}
				break;
			case 7:
				{
				setState(2122);
				caseExpression();
				}
				break;
			case 8:
				{
				setState(2123);
				castSpecification();
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

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(DB2zSQLParser.CASE, 0); }
		public TerminalNode END() { return getToken(DB2zSQLParser.END, 0); }
		public SearchedWhenClauseContext searchedWhenClause() {
			return getRuleContext(SearchedWhenClauseContext.class,0);
		}
		public SimpleWhenClauseContext simpleWhenClause() {
			return getRuleContext(SimpleWhenClauseContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(DB2zSQLParser.ELSE, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public ResultExpressionContext resultExpression() {
			return getRuleContext(ResultExpressionContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_caseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			match(CASE);
			setState(2129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2127);
				searchedWhenClause();
				}
				break;
			case 2:
				{
				setState(2128);
				simpleWhenClause();
				}
				break;
			}
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				{
				setState(2131);
				match(ELSE);
				setState(2132);
				match(NULL);
				}
				}
				break;
			case 2:
				{
				{
				setState(2133);
				match(ELSE);
				setState(2134);
				resultExpression();
				}
				}
				break;
			}
			setState(2137);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterResultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitResultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitResultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultExpressionContext resultExpression() throws RecognitionException {
		ResultExpressionContext _localctx = new ResultExpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_resultExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedWhenClauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(DB2zSQLParser.WHEN, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(DB2zSQLParser.THEN, 0); }
		public ResultExpressionContext resultExpression() {
			return getRuleContext(ResultExpressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public SearchedWhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedWhenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSearchedWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSearchedWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSearchedWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchedWhenClauseContext searchedWhenClause() throws RecognitionException {
		SearchedWhenClauseContext _localctx = new SearchedWhenClauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_searchedWhenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			match(WHEN);
			setState(2142);
			searchCondition();
			setState(2143);
			match(THEN);
			setState(2146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(2144);
				resultExpression();
				}
				break;
			case 2:
				{
				setState(2145);
				match(NULL);
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

	public static class SimpleWhenClauseContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WHEN() { return getToken(DB2zSQLParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(DB2zSQLParser.THEN, 0); }
		public ResultExpressionContext resultExpression() {
			return getRuleContext(ResultExpressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public SimpleWhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleWhenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSimpleWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSimpleWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSimpleWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleWhenClauseContext simpleWhenClause() throws RecognitionException {
		SimpleWhenClauseContext _localctx = new SimpleWhenClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_simpleWhenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			expression();
			setState(2149);
			match(WHEN);
			setState(2150);
			expression();
			setState(2151);
			match(THEN);
			setState(2154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(2152);
				resultExpression();
				}
				break;
			case 2:
				{
				setState(2153);
				match(NULL);
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

	public static class SearchConditionContext extends ParserRuleContext {
		public List<TerminalNode> NOT() { return getTokens(DB2zSQLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(DB2zSQLParser.NOT, i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<SearchConditionContext> searchCondition() {
			return getRuleContexts(SearchConditionContext.class);
		}
		public SearchConditionContext searchCondition(int i) {
			return getRuleContext(SearchConditionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public List<TerminalNode> AND() { return getTokens(DB2zSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DB2zSQLParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(DB2zSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(DB2zSQLParser.OR, i);
		}
		public TerminalNode SELECTIVITY() { return getToken(DB2zSQLParser.SELECTIVITY, 0); }
		public TerminalNode NUMERICLITERAL() { return getToken(DB2zSQLParser.NUMERICLITERAL, 0); }
		public SearchConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSearchCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSearchCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSearchCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchConditionContext searchCondition() throws RecognitionException {
		SearchConditionContext _localctx = new SearchConditionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_searchCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(2156);
				match(NOT);
				}
				break;
			}
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				{
				setState(2159);
				predicate();
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECTIVITY) {
					{
					setState(2160);
					match(SELECTIVITY);
					setState(2161);
					match(NUMERICLITERAL);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(2164);
				match(LPAREN);
				setState(2165);
				searchCondition();
				setState(2166);
				match(RPAREN);
				}
				}
				break;
			}
			setState(2183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(2170);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2171);
					match(NOT);
					}
					break;
				}
				setState(2179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(2174);
					predicate();
					}
					break;
				case 2:
					{
					{
					setState(2175);
					match(LPAREN);
					setState(2176);
					searchCondition();
					setState(2177);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				setState(2185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public BasicPredicateContext basicPredicate() {
			return getRuleContext(BasicPredicateContext.class,0);
		}
		public QuantifiedPredicateContext quantifiedPredicate() {
			return getRuleContext(QuantifiedPredicateContext.class,0);
		}
		public ArrayExistsPredicateContext arrayExistsPredicate() {
			return getRuleContext(ArrayExistsPredicateContext.class,0);
		}
		public BetweenPredicateContext betweenPredicate() {
			return getRuleContext(BetweenPredicateContext.class,0);
		}
		public DistinctPredicateContext distinctPredicate() {
			return getRuleContext(DistinctPredicateContext.class,0);
		}
		public ExistsPredicateContext existsPredicate() {
			return getRuleContext(ExistsPredicateContext.class,0);
		}
		public InPredicateContext inPredicate() {
			return getRuleContext(InPredicateContext.class,0);
		}
		public LikePredicateContext likePredicate() {
			return getRuleContext(LikePredicateContext.class,0);
		}
		public NullPredicateContext nullPredicate() {
			return getRuleContext(NullPredicateContext.class,0);
		}
		public XmlExistsPredicateContext xmlExistsPredicate() {
			return getRuleContext(XmlExistsPredicateContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_predicate);
		try {
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				basicPredicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				quantifiedPredicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2188);
				arrayExistsPredicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2189);
				betweenPredicate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2190);
				distinctPredicate();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2191);
				existsPredicate();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2192);
				inPredicate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2193);
				likePredicate();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2194);
				nullPredicate();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2195);
				xmlExistsPredicate();
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

	public static class BasicPredicateContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<RowValueExpressionContext> rowValueExpression() {
			return getRuleContexts(RowValueExpressionContext.class);
		}
		public RowValueExpressionContext rowValueExpression(int i) {
			return getRuleContext(RowValueExpressionContext.class,i);
		}
		public BasicPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterBasicPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitBasicPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitBasicPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicPredicateContext basicPredicate() throws RecognitionException {
		BasicPredicateContext _localctx = new BasicPredicateContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_basicPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				{
				setState(2198);
				expression();
				setState(2199);
				comparisonOperator();
				setState(2200);
				expression();
				}
				}
				break;
			case 2:
				{
				{
				setState(2202);
				rowValueExpression();
				setState(2203);
				comparisonOperator();
				setState(2204);
				rowValueExpression();
				}
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

	public static class RowValueExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public RowValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowValueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterRowValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitRowValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitRowValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowValueExpressionContext rowValueExpression() throws RecognitionException {
		RowValueExpressionContext _localctx = new RowValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_rowValueExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(LPAREN);
			setState(2209);
			expression();
			setState(2214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2210);
				match(COMMA);
				setState(2211);
				expression();
				}
				}
				setState(2216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2217);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifiedPredicateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public RowValueExpressionContext rowValueExpression() {
			return getRuleContext(RowValueExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DB2zSQLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(DB2zSQLParser.NE, 0); }
		public TerminalNode ALL() { return getToken(DB2zSQLParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(DB2zSQLParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(DB2zSQLParser.ANY, 0); }
		public QuantifiedPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterQuantifiedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitQuantifiedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitQuantifiedPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedPredicateContext quantifiedPredicate() throws RecognitionException {
		QuantifiedPredicateContext _localctx = new QuantifiedPredicateContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_quantifiedPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				{
				setState(2219);
				expression();
				setState(2220);
				comparisonOperator();
				setState(2221);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2222);
				match(LPAREN);
				setState(2223);
				fullSelect();
				setState(2224);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(2226);
				rowValueExpression();
				setState(2227);
				match(EQ);
				setState(2228);
				_la = _input.LA(1);
				if ( !(_la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2229);
				match(LPAREN);
				setState(2230);
				fullSelect();
				setState(2231);
				match(RPAREN);
				}
				}
				break;
			case 3:
				{
				{
				setState(2233);
				rowValueExpression();
				setState(2234);
				match(NE);
				setState(2235);
				match(ALL);
				setState(2236);
				match(LPAREN);
				setState(2237);
				fullSelect();
				setState(2238);
				match(RPAREN);
				}
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

	public static class ArrayExistsPredicateContext extends ParserRuleContext {
		public TerminalNode ARRAY_EXISTS() { return getToken(DB2zSQLParser.ARRAY_EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public ArrayExistsPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExistsPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterArrayExistsPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitArrayExistsPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitArrayExistsPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExistsPredicateContext arrayExistsPredicate() throws RecognitionException {
		ArrayExistsPredicateContext _localctx = new ArrayExistsPredicateContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_arrayExistsPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			match(ARRAY_EXISTS);
			setState(2243);
			match(LPAREN);
			setState(2244);
			arrayExpression();
			setState(2245);
			match(INTEGERLITERAL);
			setState(2246);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BetweenPredicateContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(DB2zSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public BetweenPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betweenPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterBetweenPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitBetweenPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitBetweenPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenPredicateContext betweenPredicate() throws RecognitionException {
		BetweenPredicateContext _localctx = new BetweenPredicateContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_betweenPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			expression();
			setState(2250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2249);
				match(NOT);
				}
			}

			setState(2252);
			match(BETWEEN);
			setState(2253);
			expression();
			setState(2254);
			match(AND);
			setState(2255);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctPredicateContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(DB2zSQLParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(DB2zSQLParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(DB2zSQLParser.FROM, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public DistinctPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDistinctPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDistinctPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDistinctPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctPredicateContext distinctPredicate() throws RecognitionException {
		DistinctPredicateContext _localctx = new DistinctPredicateContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_distinctPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			expression();
			setState(2258);
			match(IS);
			setState(2260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2259);
				match(NOT);
				}
			}

			setState(2262);
			match(DISTINCT);
			setState(2263);
			match(FROM);
			setState(2264);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsPredicateContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(DB2zSQLParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public ExistsPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterExistsPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitExistsPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitExistsPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsPredicateContext existsPredicate() throws RecognitionException {
		ExistsPredicateContext _localctx = new ExistsPredicateContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_existsPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			match(EXISTS);
			setState(2267);
			match(LPAREN);
			setState(2268);
			fullSelect();
			setState(2269);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InPredicateContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(DB2zSQLParser.IN, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public InPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_inPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			expression();
			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2272);
				match(NOT);
				}
			}

			setState(2275);
			match(IN);
			setState(2291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				{
				setState(2276);
				match(LPAREN);
				setState(2277);
				fullSelect();
				setState(2278);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(2280);
				match(LPAREN);
				setState(2281);
				expression();
				setState(2286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2282);
					match(COMMA);
					setState(2283);
					expression();
					}
					}
					setState(2288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2289);
				match(RPAREN);
				}
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

	public static class LikePredicateContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(DB2zSQLParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(DB2zSQLParser.ESCAPE, 0); }
		public LikePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLikePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLikePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikePredicateContext likePredicate() throws RecognitionException {
		LikePredicateContext _localctx = new LikePredicateContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_likePredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			expression();
			setState(2295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2294);
				match(NOT);
				}
			}

			setState(2297);
			match(LIKE);
			setState(2298);
			expression();
			setState(2301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESCAPE) {
				{
				setState(2299);
				match(ESCAPE);
				setState(2300);
				expression();
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

	public static class NullPredicateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ISNULL() { return getToken(DB2zSQLParser.ISNULL, 0); }
		public TerminalNode NOTNULL() { return getToken(DB2zSQLParser.NOTNULL, 0); }
		public TerminalNode IS() { return getToken(DB2zSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public NullPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullPredicateContext nullPredicate() throws RecognitionException {
		NullPredicateContext _localctx = new NullPredicateContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_nullPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			expression();
			setState(2311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
				{
				{
				setState(2304);
				match(IS);
				setState(2306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2305);
					match(NOT);
					}
				}

				setState(2308);
				match(NULL);
				}
				}
				break;
			case ISNULL:
				{
				setState(2309);
				match(ISNULL);
				}
				break;
			case NOTNULL:
				{
				setState(2310);
				match(NOTNULL);
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

	public static class XmlExistsPredicateContext extends ParserRuleContext {
		public TerminalNode XMLEXISTS() { return getToken(DB2zSQLParser.XMLEXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode PASSING() { return getToken(DB2zSQLParser.PASSING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BY() { return getToken(DB2zSQLParser.BY, 0); }
		public TerminalNode REF() { return getToken(DB2zSQLParser.REF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public XmlExistsPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlExistsPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmlExistsPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmlExistsPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmlExistsPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlExistsPredicateContext xmlExistsPredicate() throws RecognitionException {
		XmlExistsPredicateContext _localctx = new XmlExistsPredicateContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_xmlExistsPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(XMLEXISTS);
			setState(2314);
			match(LPAREN);
			setState(2315);
			match(NONNUMERICLITERAL);
			setState(2329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSING) {
				{
				setState(2316);
				match(PASSING);
				setState(2319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2317);
					match(BY);
					setState(2318);
					match(REF);
					}
					break;
				}
				setState(2321);
				expression();
				setState(2326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2322);
					match(COMMA);
					setState(2323);
					expression();
					}
					}
					setState(2328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2331);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayExpressionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CastSpecificationContext castSpecification() {
			return getRuleContext(CastSpecificationContext.class,0);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_arrayExpression);
		try {
			setState(2335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2333);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2334);
				castSpecification();
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

	public static class CastSpecificationContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(DB2zSQLParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public CastSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCastSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCastSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCastSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastSpecificationContext castSpecification() throws RecognitionException {
		CastSpecificationContext _localctx = new CastSpecificationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_castSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			match(CAST);
			setState(2338);
			match(LPAREN);
			setState(2342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2339);
				expression();
				}
				break;
			case 2:
				{
				setState(2340);
				match(NULL);
				}
				break;
			case 3:
				{
				setState(2341);
				parameterMarker();
				}
				break;
			}
			setState(2344);
			match(AS);
			setState(2345);
			dataType();
			setState(2346);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTIONMARK() { return getToken(DB2zSQLParser.QUESTIONMARK, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterParameterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitParameterMarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			match(QUESTIONMARK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public DistinctTypeNameContext distinctTypeName() {
			return getRuleContext(DistinctTypeNameContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2350);
				builtInType();
				}
				break;
			case 2:
				{
				setState(2351);
				distinctTypeName();
				}
				break;
			case 3:
				{
				setState(2352);
				arrayType();
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

	public static class BuiltInTypeContext extends ParserRuleContext {
		public TerminalNode SMALLINT() { return getToken(DB2zSQLParser.SMALLINT, 0); }
		public TerminalNode INTEGER() { return getToken(DB2zSQLParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(DB2zSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(DB2zSQLParser.BIGINT, 0); }
		public TerminalNode REAL() { return getToken(DB2zSQLParser.REAL, 0); }
		public TerminalNode DATE() { return getToken(DB2zSQLParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(DB2zSQLParser.TIME, 0); }
		public TerminalNode ROWID() { return getToken(DB2zSQLParser.ROWID, 0); }
		public TerminalNode XML() { return getToken(DB2zSQLParser.XML, 0); }
		public TerminalNode DECFLOAT() { return getToken(DB2zSQLParser.DECFLOAT, 0); }
		public TerminalNode FLOAT() { return getToken(DB2zSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(DB2zSQLParser.DOUBLE, 0); }
		public TerminalNode BINARY() { return getToken(DB2zSQLParser.BINARY, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DB2zSQLParser.TIMESTAMP, 0); }
		public TerminalNode DECIMAL() { return getToken(DB2zSQLParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(DB2zSQLParser.DEC, 0); }
		public TerminalNode NUMERIC() { return getToken(DB2zSQLParser.NUMERIC, 0); }
		public TerminalNode GRAPHIC() { return getToken(DB2zSQLParser.GRAPHIC, 0); }
		public TerminalNode VARGRAPHIC() { return getToken(DB2zSQLParser.VARGRAPHIC, 0); }
		public TerminalNode DBCLOB() { return getToken(DB2zSQLParser.DBCLOB, 0); }
		public IntegerInParensContext integerInParens() {
			return getRuleContext(IntegerInParensContext.class,0);
		}
		public TerminalNode VARCHAR() { return getToken(DB2zSQLParser.VARCHAR, 0); }
		public TerminalNode CLOB() { return getToken(DB2zSQLParser.CLOB, 0); }
		public TerminalNode VARBINARY() { return getToken(DB2zSQLParser.VARBINARY, 0); }
		public TerminalNode BLOB() { return getToken(DB2zSQLParser.BLOB, 0); }
		public TerminalNode ZONE() { return getToken(DB2zSQLParser.ZONE, 0); }
		public TerminalNode PRECISION() { return getToken(DB2zSQLParser.PRECISION, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public CcsidQualifierContext ccsidQualifier() {
			return getRuleContext(CcsidQualifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(DB2zSQLParser.WITHOUT, 0); }
		public TerminalNode LARGE() { return getToken(DB2zSQLParser.LARGE, 0); }
		public TerminalNode OBJECT() { return getToken(DB2zSQLParser.OBJECT, 0); }
		public TerminalNode CHARACTER() { return getToken(DB2zSQLParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(DB2zSQLParser.CHAR, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode SQLIDENTIFIER() { return getToken(DB2zSQLParser.SQLIDENTIFIER, 0); }
		public TerminalNode VARYING() { return getToken(DB2zSQLParser.VARYING, 0); }
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterBuiltInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitBuiltInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitBuiltInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_builtInType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2355);
				match(SMALLINT);
				}
				break;
			case 2:
				{
				setState(2356);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(2357);
				match(INT);
				}
				break;
			case 4:
				{
				setState(2358);
				match(BIGINT);
				}
				break;
			case 5:
				{
				{
				setState(2359);
				_la = _input.LA(1);
				if ( !(_la==NUMERIC || _la==DEC || _la==DECIMAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2360);
					integerInParens();
					}
					break;
				case 2:
					{
					{
					setState(2361);
					match(LPAREN);
					setState(2362);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				break;
			case 6:
				{
				{
				setState(2365);
				match(DECFLOAT);
				setState(2369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2366);
					integerInParens();
					}
					break;
				case 2:
					{
					{
					setState(2367);
					match(LPAREN);
					setState(2368);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				break;
			case 7:
				{
				{
				setState(2371);
				match(FLOAT);
				setState(2375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2372);
					integerInParens();
					}
					break;
				case 2:
					{
					{
					setState(2373);
					match(LPAREN);
					setState(2374);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				break;
			case 8:
				{
				setState(2377);
				match(REAL);
				}
				break;
			case 9:
				{
				{
				setState(2378);
				match(DOUBLE);
				setState(2380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2379);
					match(PRECISION);
					}
					break;
				}
				}
				}
				break;
			case 10:
				{
				{
				setState(2387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case CHARACTER:
					{
					{
					setState(2382);
					_la = _input.LA(1);
					if ( !(_la==CHAR || _la==CHARACTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
					case 1:
						{
						setState(2383);
						match(VARYING);
						}
						break;
					}
					}
					}
					break;
				case VARCHAR:
					{
					setState(2386);
					match(VARCHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2389);
					length();
					}
					break;
				case 2:
					{
					{
					setState(2390);
					match(LPAREN);
					setState(2391);
					match(RPAREN);
					}
					}
					break;
				}
				setState(2395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2394);
					ccsidQualifier();
					}
					break;
				}
				}
				}
				break;
			case 11:
				{
				{
				setState(2401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case CHARACTER:
					{
					{
					setState(2397);
					_la = _input.LA(1);
					if ( !(_la==CHAR || _la==CHARACTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2398);
					match(LARGE);
					setState(2399);
					match(OBJECT);
					}
					}
					break;
				case CLOB:
					{
					setState(2400);
					match(CLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2403);
					length();
					}
					break;
				case 2:
					{
					{
					setState(2404);
					match(LPAREN);
					setState(2405);
					match(RPAREN);
					}
					}
					break;
				}
				setState(2409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2408);
					ccsidQualifier();
					}
					break;
				}
				}
				}
				break;
			case 12:
				{
				{
				setState(2411);
				_la = _input.LA(1);
				if ( !(_la==DBCLOB || _la==GRAPHIC || _la==VARGRAPHIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2412);
					length();
					}
					break;
				case 2:
					{
					{
					setState(2413);
					match(LPAREN);
					setState(2414);
					match(RPAREN);
					}
					}
					break;
				}
				setState(2418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2417);
					ccsidQualifier();
					}
					break;
				}
				}
				}
				break;
			case 13:
				{
				{
				setState(2420);
				match(BINARY);
				setState(2424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2421);
					integerInParens();
					}
					break;
				case 2:
					{
					{
					setState(2422);
					match(LPAREN);
					setState(2423);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				break;
			case 14:
				{
				{
				setState(2431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BINARY:
					{
					{
					setState(2426);
					match(BINARY);
					setState(2428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						setState(2427);
						match(VARYING);
						}
						break;
					}
					}
					}
					break;
				case VARBINARY:
					{
					setState(2430);
					match(VARBINARY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2433);
					integerInParens();
					}
					break;
				case 2:
					{
					{
					setState(2434);
					match(LPAREN);
					setState(2435);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				break;
			case 15:
				{
				{
				setState(2442);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BINARY:
					{
					{
					setState(2438);
					match(BINARY);
					setState(2439);
					match(LARGE);
					setState(2440);
					match(OBJECT);
					}
					}
					break;
				case BLOB:
					{
					setState(2441);
					match(BLOB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2444);
					match(LPAREN);
					{
					setState(2445);
					match(INTEGERLITERAL);
					setState(2446);
					match(SQLIDENTIFIER);
					}
					setState(2448);
					match(RPAREN);
					}
					break;
				}
				}
				}
				break;
			case 16:
				{
				setState(2451);
				match(DATE);
				}
				break;
			case 17:
				{
				setState(2452);
				match(TIME);
				}
				break;
			case 18:
				{
				{
				setState(2453);
				match(TIMESTAMP);
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2454);
					integerInParens();
					}
				}

				{
				setState(2457);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2458);
				match(TIME);
				setState(2459);
				match(ZONE);
				}
				}
				}
				break;
			case 19:
				{
				setState(2460);
				match(ROWID);
				}
				break;
			case 20:
				{
				setState(2461);
				match(XML);
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

	public static class IntegerInParensContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<TerminalNode> INTEGERLITERAL() { return getTokens(DB2zSQLParser.INTEGERLITERAL); }
		public TerminalNode INTEGERLITERAL(int i) {
			return getToken(DB2zSQLParser.INTEGERLITERAL, i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DB2zSQLParser.COMMA, 0); }
		public IntegerInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterIntegerInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitIntegerInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitIntegerInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerInParensContext integerInParens() throws RecognitionException {
		IntegerInParensContext _localctx = new IntegerInParensContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_integerInParens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2464);
			match(LPAREN);
			setState(2465);
			match(INTEGERLITERAL);
			setState(2468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2466);
				match(COMMA);
				setState(2467);
				match(INTEGERLITERAL);
				}
			}

			setState(2470);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode SQLIDENTIFIER() { return getToken(DB2zSQLParser.SQLIDENTIFIER, 0); }
		public TerminalNode CODEUNITS16() { return getToken(DB2zSQLParser.CODEUNITS16, 0); }
		public TerminalNode CODEUNITS32() { return getToken(DB2zSQLParser.CODEUNITS32, 0); }
		public TerminalNode OCTETS() { return getToken(DB2zSQLParser.OCTETS, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2472);
			match(LPAREN);
			setState(2473);
			_la = _input.LA(1);
			if ( !(_la==INTEGERLITERAL || _la==SQLIDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (CODEUNITS16 - 327)) | (1L << (CODEUNITS32 - 327)) | (1L << (OCTETS - 327)))) != 0)) {
				{
				setState(2474);
				_la = _input.LA(1);
				if ( !(((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (CODEUNITS16 - 327)) | (1L << (CODEUNITS32 - 327)) | (1L << (OCTETS - 327)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2477);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CcsidQualifierContext extends ParserRuleContext {
		public TerminalNode CCSID() { return getToken(DB2zSQLParser.CCSID, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode ASCII() { return getToken(DB2zSQLParser.ASCII, 0); }
		public TerminalNode EBCDIC() { return getToken(DB2zSQLParser.EBCDIC, 0); }
		public TerminalNode UNICODE() { return getToken(DB2zSQLParser.UNICODE, 0); }
		public ForDataQualfierContext forDataQualfier() {
			return getRuleContext(ForDataQualfierContext.class,0);
		}
		public CcsidQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ccsidQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCcsidQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCcsidQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCcsidQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CcsidQualifierContext ccsidQualifier() throws RecognitionException {
		CcsidQualifierContext _localctx = new CcsidQualifierContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_ccsidQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2479);
			match(CCSID);
			setState(2485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EBCDIC:
			case ASCII:
			case UNICODE:
				{
				{
				setState(2480);
				_la = _input.LA(1);
				if ( !(_la==EBCDIC || _la==ASCII || _la==UNICODE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2481);
					forDataQualfier();
					}
					break;
				}
				}
				}
				break;
			case INTEGERLITERAL:
				{
				setState(2484);
				match(INTEGERLITERAL);
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

	public static class ForDataQualfierContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode DATA() { return getToken(DB2zSQLParser.DATA, 0); }
		public TerminalNode SBCS() { return getToken(DB2zSQLParser.SBCS, 0); }
		public TerminalNode MIXED() { return getToken(DB2zSQLParser.MIXED, 0); }
		public TerminalNode BIT() { return getToken(DB2zSQLParser.BIT, 0); }
		public ForDataQualfierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDataQualfier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterForDataQualfier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitForDataQualfier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitForDataQualfier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDataQualfierContext forDataQualfier() throws RecognitionException {
		ForDataQualfierContext _localctx = new ForDataQualfierContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_forDataQualfier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2487);
			match(FOR);
			setState(2488);
			_la = _input.LA(1);
			if ( !(_la==BIT || _la==MIXED || _la==SBCS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2489);
			match(DATA);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctTypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DistinctTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDistinctTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDistinctTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDistinctTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctTypeNameContext distinctTypeName() throws RecognitionException {
		DistinctTypeNameContext _localctx = new DistinctTypeNameContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_distinctTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			identifier();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NUMERICLITERAL() { return getToken(DB2zSQLParser.NUMERICLITERAL, 0); }
		public TerminalNode NONNUMERICLITERAL() { return getToken(DB2zSQLParser.NONNUMERICLITERAL, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONNUMERICLITERAL) | (1L << INTEGERLITERAL) | (1L << NUMERICLITERAL))) != 0)) ) {
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

	public static class CcsidValueContext extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public CcsidValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ccsidValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCcsidValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCcsidValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCcsidValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CcsidValueContext ccsidValue() throws RecognitionException {
		CcsidValueContext _localctx = new CcsidValueContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_ccsidValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			match(INTEGERLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2499);
				correlationName();
				setState(2500);
				match(DOT);
				}
				break;
			}
			setState(2504);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NewColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNewColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNewColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNewColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewColumnNameContext newColumnName() throws RecognitionException {
		NewColumnNameContext _localctx = new NewColumnNameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_newColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorrelationNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CorrelationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCorrelationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCorrelationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCorrelationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorrelationNameContext correlationName() throws RecognitionException {
		CorrelationNameContext _localctx = new CorrelationNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_correlationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLocationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLocationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLocationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationNameContext locationName() throws RecognitionException {
		LocationNameContext _localctx = new LocationNameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_locationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public LocationNameContext locationName() {
			return getRuleContext(LocationNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(DB2zSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DB2zSQLParser.DOT, i);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				{
				setState(2514);
				locationName();
				setState(2515);
				match(DOT);
				setState(2516);
				schemaName();
				setState(2517);
				match(DOT);
				}
				}
				break;
			case 2:
				{
				{
				setState(2519);
				schemaName();
				setState(2520);
				match(DOT);
				}
				}
				break;
			}
			setState(2524);
			identifier();
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2525);
				correlationName();
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

	public static class IndexNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitIndexName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2528);
				schemaName();
				setState(2529);
				match(DOT);
				}
				break;
			}
			setState(2533);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaskNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public MaskNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maskName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterMaskName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitMaskName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitMaskName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaskNameContext maskName() throws RecognitionException {
		MaskNameContext _localctx = new MaskNameContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_maskName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2535);
				schemaName();
				setState(2536);
				match(DOT);
				}
				break;
			}
			setState(2540);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PermissionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public PermissionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permissionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPermissionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPermissionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPermissionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermissionNameContext permissionName() throws RecognitionException {
		PermissionNameContext _localctx = new PermissionNameContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_permissionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2542);
				schemaName();
				setState(2543);
				match(DOT);
				}
				break;
			}
			setState(2547);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocationNameContext locationName() {
			return getRuleContext(LocationNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(DB2zSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DB2zSQLParser.DOT, i);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterProcedureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitProcedureName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitProcedureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				{
				setState(2549);
				locationName();
				setState(2550);
				match(DOT);
				setState(2551);
				schemaName();
				setState(2552);
				match(DOT);
				}
				}
				break;
			case 2:
				{
				{
				setState(2554);
				schemaName();
				setState(2555);
				match(DOT);
				}
				}
				break;
			}
			setState(2559);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2561);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatalogNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CatalogNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCatalogName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCatalogName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCatalogName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogNameContext catalogName() throws RecognitionException {
		CatalogNameContext _localctx = new CatalogNameContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catalogName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2563);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BpNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BpNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterBpName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitBpName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitBpName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpNameContext bpName() throws RecognitionException {
		BpNameContext _localctx = new BpNameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_bpName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StogroupNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StogroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stogroupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterStogroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitStogroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitStogroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StogroupNameContext stogroupName() throws RecognitionException {
		StogroupNameContext _localctx = new StogroupNameContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_stogroupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2569);
				schemaName();
				setState(2570);
				match(DOT);
				}
				break;
			}
			setState(2574);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecificNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public SpecificNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSpecificName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSpecificName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSpecificName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificNameContext specificName() throws RecognitionException {
		SpecificNameContext _localctx = new SpecificNameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_specificName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2576);
				schemaName();
				setState(2577);
				match(DOT);
				}
				break;
			}
			setState(2581);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostVariableContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(DB2zSQLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DB2zSQLParser.COLON, i);
		}
		public List<HostIdentifierContext> hostIdentifier() {
			return getRuleContexts(HostIdentifierContext.class);
		}
		public HostIdentifierContext hostIdentifier(int i) {
			return getRuleContext(HostIdentifierContext.class,i);
		}
		public List<HostStructureContext> hostStructure() {
			return getRuleContexts(HostStructureContext.class);
		}
		public HostStructureContext hostStructure(int i) {
			return getRuleContext(HostStructureContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DB2zSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DB2zSQLParser.DOT, i);
		}
		public TerminalNode INDICATOR() { return getToken(DB2zSQLParser.INDICATOR, 0); }
		public HostVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterHostVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitHostVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitHostVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostVariableContext hostVariable() throws RecognitionException {
		HostVariableContext _localctx = new HostVariableContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_hostVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2583);
			match(COLON);
			setState(2587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2584);
				hostStructure();
				setState(2585);
				match(DOT);
				}
				break;
			}
			setState(2589);
			hostIdentifier();
			setState(2600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDICATOR) {
					{
					setState(2590);
					match(INDICATOR);
					}
				}

				setState(2593);
				match(COLON);
				setState(2597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2594);
					hostStructure();
					setState(2595);
					match(DOT);
					}
					break;
				}
				setState(2599);
				hostIdentifier();
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

	public static class HostIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HostIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterHostIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitHostIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitHostIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostIdentifierContext hostIdentifier() throws RecognitionException {
		HostIdentifierContext _localctx = new HostIdentifierContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_hostIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostStructureContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HostStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterHostStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitHostStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitHostStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostStructureContext hostStructure() throws RecognitionException {
		HostStructureContext _localctx = new HostStructureContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_hostStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2604);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public HostVariableContext hostVariable() {
			return getRuleContext(HostVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_variable);
		try {
			setState(2613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case AFTER:
			case ALL:
			case ALLOCATE:
			case ALLOW:
			case ALTER:
			case ALTERAND:
			case ANY:
			case ARRAY:
			case ARRAY_EXISTS:
			case AS:
			case ASENSITIVE:
			case ASSOCIATE:
			case ASUTIME:
			case AT:
			case AUDIT:
			case AUX:
			case AUXILIARY:
			case BEFORE:
			case BEGIN:
			case BETWEEN:
			case BUFFERPOOL:
			case BY:
			case CALL:
			case CAPTURE:
			case CASCADED:
			case CASE:
			case CAST:
			case CCSID:
			case CHAR:
			case CHARACTER:
			case CHECK:
			case CLONE:
			case CLOSE:
			case CLUSTER:
			case COLLECTION:
			case COLLID:
			case COLUMN:
			case COMMENT:
			case COMMIT:
			case CONCAT:
			case CONDITION:
			case CONNECT:
			case CONNECTION:
			case CONSTRAINT:
			case CONTAINS:
			case CONTENT:
			case CONTINUE:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_LC_CTYPE:
			case CURRVAL:
			case CURSOR:
			case DATA:
			case DATABASE:
			case DAY:
			case DAYS:
			case DBINFO:
			case DECLARE:
			case DEFAULT:
			case DELETE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DISABLE:
			case DISALLOW:
			case DISTINCT:
			case DO:
			case DOCUMENT:
			case DOUBLE:
			case DROP:
			case DSSIZE:
			case DYNAMIC:
			case EDITPROC:
			case ELSE:
			case ELSEIF:
			case ENCODING:
			case ENCRYPTION:
			case END:
			case END_EXEC:
			case ENDING:
			case ERASE:
			case ESCAPE:
			case EXCEPT:
			case EXCEPTION:
			case EXEC_SQL:
			case EXECUTE:
			case EXISTS:
			case EXIT:
			case EXPLAIN:
			case EXTERNAL:
			case FENCED:
			case FETCH:
			case FIELDPROC:
			case FINAL:
			case FIRST:
			case FOR:
			case FREE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANT:
			case GROUP:
			case HANDLER:
			case HAVING:
			case HOLD:
			case HOUR:
			case HOURS:
			case IF:
			case IMMEDIATE:
			case IN:
			case INCLUSIVE:
			case INDEX:
			case INDEXBP:
			case INHERIT:
			case INNER:
			case INOUT:
			case INSENSITIVE:
			case INSERT:
			case INTERSECT:
			case INTO:
			case IS:
			case ISOBID:
			case ITERATE:
			case JAR:
			case JOIN:
			case KEEP:
			case KEY:
			case LABEL:
			case LANGUAGE:
			case LAST:
			case LC_CTYPE:
			case LEAVE:
			case LEFT:
			case LIKE:
			case LIMIT:
			case LOCAL:
			case LOCALE:
			case LOCATOR:
			case LOCATORS:
			case LOCK:
			case LOCKMAX:
			case LOCKSIZE:
			case LONG:
			case LOOP:
			case MAINTAINED:
			case MATERIALIZED:
			case MICROSECOND:
			case MICROSECONDS:
			case MODIFIES:
			case MONTH:
			case MONTHS:
			case NEXT:
			case NEXTVAL:
			case NO:
			case NONE:
			case NOT:
			case NULL:
			case NULLS:
			case NUMPARTS:
			case OBID:
			case OF:
			case OFFSET:
			case OLD:
			case ON:
			case OPEN:
			case OPTIMIZATION:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case ORGANIZATION:
			case OUT:
			case OUTER:
			case PACKAGE:
			case PADDED:
			case PARAMETER:
			case PART:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONING:
			case PATH:
			case PERIOD:
			case PIECESIZE:
			case PLAN:
			case PRECISION:
			case PREPARE:
			case PREVVAL:
			case PRIOR:
			case PRIQTY:
			case PRIVILEGES:
			case PROCEDURE:
			case PROGRAM:
			case PSID:
			case PUBLIC:
			case QUERY:
			case QUERYNO:
			case READS:
			case REFERENCES:
			case REFRESH:
			case RELEASE:
			case RENAME:
			case REPEAT:
			case RESIGNAL:
			case RESTRICT:
			case RESULT:
			case RESULT_SET_LOCATOR:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUND_CEILING:
			case ROUND_DOWN:
			case ROUND_FLOOR:
			case ROUND_HALF_DOWN:
			case ROUND_HALF_EVEN:
			case ROUND_HALF_UP:
			case ROUND_UP:
			case ROW:
			case ROWSET:
			case RUN:
			case SAVEPOINT:
			case SCHEMA:
			case SCRATCHPAD:
			case SECOND:
			case SECONDS:
			case SECQTY:
			case SECURITY:
			case SELECT:
			case SENSITIVE:
			case SEQUENCE:
			case SET:
			case SIGNAL:
			case SIMPLE:
			case SOME:
			case SOURCE:
			case SPECIFIC:
			case STANDARD:
			case STATEMENT:
			case STATIC:
			case STAY:
			case STOGROUP:
			case STORES:
			case STYLE:
			case SUMMARY:
			case SYNONYM:
			case SYSDATE:
			case SYSTEM:
			case SYSTIMESTAMP:
			case TABLE:
			case TABLESPACE:
			case THEN:
			case TO:
			case TRIGGER:
			case TRUNCATE:
			case TYPE:
			case UNDO:
			case UNION:
			case UNIQUE:
			case UNTIL:
			case UPDATE:
			case USING:
			case VALIDPROC:
			case VALUE:
			case VALUES:
			case VARIABLE:
			case VARIANT:
			case VCAT:
			case VERSIONING:
			case VIEW:
			case VOLATILE:
			case VOLUMES:
			case WHEN:
			case WHENEVER:
			case WHERE:
			case WHILE:
			case WITH:
			case WLM:
			case XMLCAST:
			case XMLEXISTS:
			case XMLNAMESPACES:
			case YEAR:
			case YEARS:
			case ZONE:
			case AND:
			case ARRAY_AGG:
			case ASC:
			case AVG:
			case BIT:
			case CHANGE:
			case CODEUNITS16:
			case CODEUNITS32:
			case CORR:
			case CORRELATION:
			case COUNT:
			case COUNT_BIG:
			case COVAR:
			case COVARIANCE:
			case COVARIANCE_SAMP:
			case COVAR_POP:
			case COVAR_SAMP:
			case CS:
			case CUME_DIST:
			case DENSE_RANK:
			case DESC:
			case EBCDIC:
			case EXCLUSIVE:
			case FIRST_VALUE:
			case FOLLOWING:
			case GROUPING:
			case IGNORE:
			case INDICATOR:
			case INPUT:
			case ISNULL:
			case LAG:
			case LARGE:
			case LAST_VALUE:
			case LEAD:
			case LISTAGG:
			case LOCKED:
			case LOCKS:
			case MEDIAN:
			case MINUTES:
			case MIXED:
			case NOTNULL:
			case NTH_VALUE:
			case NTILE:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case ONLY:
			case OVER:
			case PASSING:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PRECEDING:
			case PREVIOUS:
			case RANGE:
			case RANK:
			case RATIO_TO_REPORT:
			case READ:
			case REF:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_ICPT:
			case REGR_INTERCEPT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case RESPECT:
			case ROW_NUMBER:
			case ROWS:
			case RR:
			case RS:
			case SBCS:
			case SELECTIVITY:
			case SETS:
			case SHARE:
			case SKIP_:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUM:
			case TOKEN:
			case UNBOUNDED:
			case UNPACK:
			case UR:
			case USE:
			case VAR:
			case VARIANCE:
			case VARIANCE_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARYING:
			case WITHOUT:
			case XML:
			case XMLAGG:
			case COLUMNS:
			case SQLID:
			case ORDINALITY:
			case SYSTEM_TIME:
			case BUSINESS_TIME:
			case MULTIPLIER:
			case UNNEST:
			case CROSS:
			case CALLER:
			case CLIENT:
			case POSITIONING:
			case SCROLL:
			case ACTION:
			case ASSEMBLE:
			case C_:
			case CALLED:
			case COBOL:
			case DB2:
			case DEFINER:
			case DISPATCH:
			case ENVIRONMENT:
			case FAILURE:
			case FAILURES:
			case JAVA:
			case MAIN:
			case NAME:
			case OPTIONS:
			case PARALLEL:
			case PLI:
			case REGISTERS:
			case RESIDENT:
			case SECURED:
			case SPECIAL:
			case SQL:
			case STOP:
			case SUB:
			case YES:
			case APPLICATION:
			case CHANGED:
			case COMPATIBILITY:
			case COMPRESS:
			case COPY:
			case FREEPAGE:
			case GBPCACHE:
			case INCLUDE:
			case MAXVALUE:
			case MINVALUE:
			case PCTFREE:
			case REGENERATE:
			case SEQTY:
			case MASK:
			case ENABLE:
			case PERMISSION:
			case ATOMIC:
			case SQLEXCEPTION:
			case MERGE:
			case MATCHED:
			case SQLSTATE:
			case MESSAGE_TEXT:
			case OVERRIDING:
			case PORTION:
			case DB2SQL:
			case DEBUG:
			case GENERAL:
			case MODE_:
			case REXX:
			case ABS:
			case ABSVAL:
			case ACOS:
			case ADD_DAYS:
			case ADD_MONTHS:
			case ARRAY_DELETE:
			case ARRAY_FIRST:
			case ARRAY_LAST:
			case ARRAY_NEXT:
			case ARRAY_PRIOR:
			case ARRAY_TRIM:
			case ASCII:
			case ASCII_CHR:
			case ASCIISTR:
			case ASCII_STR:
			case ASIN:
			case ATAN:
			case ATAN2:
			case ATANH:
			case BIGINT:
			case BINARY:
			case BITAND:
			case BITANDNOT:
			case BITNOT:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BTRIM:
			case CARDINALITY:
			case CCSID_ENCODING:
			case CEIL:
			case CEILING:
			case CHAR9:
			case CHARACTER_LENGTH:
			case CHAR_LENGTH:
			case CHR:
			case CLOB:
			case COALESCE:
			case COLLATION_KEY:
			case COMPARE_DECFLOAT:
			case COS:
			case COSH:
			case DATE:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFWEEK_ISO:
			case DAYOFYEAR:
			case DAYS_BETWEEN:
			case DBCLOB:
			case DEC:
			case DECFLOAT:
			case DECFLOAT_FORMAT:
			case DECFLOAT_SORTKEY:
			case DECIMAL:
			case DECODE:
			case DECRYPT_BINARY:
			case DECRYPT_BIT:
			case DECRYPT_CHAR:
			case DECRYPT_DATAKEY_BIGINT:
			case DECRYPT_DATAKEY_BIT:
			case DECRYPT_DATAKEY_CLOB:
			case DECRYPT_DATAKEY_DBCLOB:
			case DECRYPT_DATAKEY_DECIMAL:
			case DECRYPT_DATAKEY_INTEGER:
			case DECRYPT_DATAKEY_VARCHAR:
			case DECRYPT_DATAKEY_VARGRAPHIC:
			case DECRYPT_DB:
			case DEGREES:
			case DIFFERENCE:
			case DIGITS:
			case DOUBLE_PRECISION:
			case DSN_XMLVALIDATE:
			case EBCDIC_CHR:
			case EBCDIC_STR:
			case ENCRYPT_DATAKEY:
			case ENCRYPT_TDES:
			case EXP:
			case EXTRACT:
			case FLOAT:
			case FLOOR:
			case GENERATE_UNIQUE:
			case GENERATE_UNIQUE_BINARY:
			case GETHINT:
			case GETVARIABLE:
			case GRAPHIC:
			case GREATEST:
			case HASH:
			case HASH_CRC32:
			case HASH_MD5:
			case HASH_SHA1:
			case HASH_SHA256:
			case HEX:
			case IDENTITY_VAL_LOCAL:
			case IFNULL:
			case INSTR:
			case INT:
			case INTEGER:
			case JULIAN_DAY:
			case LAST_DAY:
			case LCASE:
			case LEAST:
			case LENGTH:
			case LN:
			case LOCATE:
			case LOCATE_IN_STRING:
			case LOG10:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAX:
			case MAX_CARDINALITY:
			case MIDNIGHT_SECONDS:
			case MIN:
			case MINUTE:
			case MOD:
			case MONTHS_BETWEEN:
			case MQREAD:
			case MQREADCLOB:
			case MQRECEIVE:
			case MQRECEIVECLOB:
			case MQSEND:
			case MULTIPLY_ALT:
			case NEXT_DAY:
			case NEXT_MONTH:
			case NORMALIZE_DECFLOAT:
			case NORMALIZE_STRING:
			case NULLIF:
			case NVL:
			case OVERLAY:
			case PACK:
			case POSITION:
			case POSSTR:
			case POW:
			case POWER:
			case QUANTIZE:
			case QUARTER:
			case RADIANS:
			case RAISE_ERROR:
			case RAND:
			case RANDOM:
			case REAL:
			case REGEXP_COUNT:
			case REGEXP_INSTR:
			case REGEXP_LIKE:
			case REGEXP_REPLACE:
			case REGEXP_SUBSTR:
			case REPLACE:
			case RID:
			case ROUND:
			case ROUND_TIMESTAMP:
			case ROWID:
			case RPAD:
			case RTRIM:
			case SCORE:
			case SIGN:
			case SIN:
			case SINH:
			case SMALLINT:
			case SOAPHTTPC:
			case SOAPHTTPNC:
			case SOAPHTTPNV:
			case SOAPHTTPV:
			case SOUNDEX:
			case SPACE:
			case SQRT:
			case STRIP:
			case STRLEFT:
			case STRPOS:
			case STRRIGHT:
			case SUBSTR:
			case SUBSTRING:
			case TAN:
			case TANH:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TIMESTAMP_FORMAT:
			case TIMESTAMP_ISO:
			case TIMESTAMP_TZ:
			case TO_CHAR:
			case TO_CLOB:
			case TO_DATE:
			case TO_NUMBER:
			case TOTALORDER:
			case TO_TIMESTAMP:
			case TRANSLATE:
			case TRIM:
			case TRIM_ARRAY:
			case TRUNC:
			case TRUNC_TIMESTAMP:
			case UCASE:
			case UNICODE:
			case UNICODE_STR:
			case UNISTR:
			case UPPER:
			case VARBINARY:
			case VARCHAR:
			case VARCHAR9:
			case VARCHAR_BIT_FORMAT:
			case VARCHAR_FORMAT:
			case VARGRAPHIC:
			case VERIFY_GROUP_FOR_USER:
			case VERIFY_ROLE_FOR_USER:
			case VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER:
			case WEEK:
			case WEEK_ISO:
			case WRAP:
			case XMLATTRIBUTES:
			case XMLCOMMENT:
			case XMLCONCAT:
			case XMLDOCUMENT:
			case XMLELEMENT:
			case XMLFOREST:
			case XMLMODIFY:
			case XMLPARSE:
			case XMLPI:
			case XMLQUERY:
			case XMLSERIALIZE:
			case XMLTEXT:
			case XMLXSROBJECTID:
			case XSLTRANSFORM:
			case CURRENT_ACCELERATOR:
			case CURRENT_APPLICATION_COMPATIBILITY:
			case CURRENT_APPLICATION_ENCODING_SCHEME:
			case CURRENT_CLIENT_ACCTNG:
			case CURRENT_CLIENT_APPLNAME:
			case CURRENT_CLIENT_CORR_TOKEN:
			case CURRENT_CLIENT_USERID:
			case CURRENT_CLIENT_WRKSTNNAME:
			case CURRENT_DATE:
			case CURRENT_DEBUG_MODE:
			case CURRENT_DECFLOAT_ROUNDING_MODE:
			case CURRENT_DEGREE:
			case CURRENT_EXPLAIN_MODE:
			case CURRENT_GET_ACCEL_ARCHIVE:
			case CURRENT_LOCALE_LC_CTYPE:
			case CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION:
			case CURRENT_MEMBER:
			case CURRENT_OPTIMIZATION_HINT:
			case CURRENT_PACKAGE_PATH:
			case CURRENT_PACKAGESET:
			case CURRENT_PATH:
			case CURRENT_PRECISION:
			case CURRENT_QUERY_ACCELERATION:
			case CURRENT_QUERY_ACCELERATION_WAITFORDATA:
			case CURRENT_REFRESH_AGE:
			case CURRENT_ROUTINE_VERSION:
			case CURRENT_RULES:
			case CURRENT_SCHEMA:
			case CURRENT_SERVER:
			case CURRENT_SQLID:
			case CURRENT_TEMPORAL_BUSINESS_TIME:
			case CURRENT_TEMPORAL_SYSTEM_TIME:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_TIME_ZONE:
			case ENCRYPTION_PASSWORD:
			case SESSION_TIME_ZONE:
			case SESSION_USER:
			case USER:
			case ADMIN_TASK_LIST:
			case ADMIN_TASK_OUTPUT:
			case ADMIN_TASK_STATUS:
			case BLOCKING_THREADS:
			case MQREADALL:
			case MQREADALLCLOB:
			case MQRECEIVEALL:
			case MQRECEIVEALLCLOB:
			case XMLTABLE:
			case SQLIDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2606);
					schemaName();
					setState(2607);
					match(DOT);
					}
					break;
				}
				setState(2611);
				identifier();
				}
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2612);
				hostVariable();
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

	public static class IntoClauseContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(DB2zSQLParser.INTO, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ArrayElementSpecificationContext arrayElementSpecification() {
			return getRuleContext(ArrayElementSpecificationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
			match(INTO);
			setState(2618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2616);
				variable();
				}
				break;
			case 2:
				{
				setState(2617);
				arrayElementSpecification();
				}
				break;
			}
			setState(2624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2620);
				match(COMMA);
				setState(2621);
				variable();
				}
				}
				setState(2626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorrelationClauseContext extends ParserRuleContext {
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<NewColumnNameContext> newColumnName() {
			return getRuleContexts(NewColumnNameContext.class);
		}
		public NewColumnNameContext newColumnName(int i) {
			return getRuleContext(NewColumnNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public CorrelationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCorrelationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCorrelationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCorrelationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorrelationClauseContext correlationClause() throws RecognitionException {
		CorrelationClauseContext _localctx = new CorrelationClauseContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_correlationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2627);
				match(AS);
				}
				break;
			}
			setState(2630);
			correlationName();
			setState(2642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2631);
				match(LPAREN);
				setState(2632);
				newColumnName();
				setState(2637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2633);
					match(COMMA);
					setState(2634);
					newColumnName();
					}
					}
					setState(2639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2640);
				match(RPAREN);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(DB2zSQLParser.FROM, 0); }
		public List<CollectionDerivedTableContext> collectionDerivedTable() {
			return getRuleContexts(CollectionDerivedTableContext.class);
		}
		public CollectionDerivedTableContext collectionDerivedTable(int i) {
			return getRuleContext(CollectionDerivedTableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_fromClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2644);
			match(FROM);
			setState(2659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				{
				setState(2648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2645);
						match(LPAREN);
						}
						} 
					}
					setState(2650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
				}
				setState(2651);
				tableReference();
				setState(2655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2652);
						match(RPAREN);
						}
						} 
					}
					setState(2657);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
				}
				}
				}
				break;
			case 2:
				{
				setState(2658);
				collectionDerivedTable();
				}
				break;
			}
			setState(2680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2661);
				match(COMMA);
				setState(2676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					{
					setState(2665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2662);
							match(LPAREN);
							}
							} 
						}
						setState(2667);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
					}
					setState(2668);
					tableReference();
					setState(2672);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2669);
							match(RPAREN);
							}
							} 
						}
						setState(2674);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
					}
					}
					}
					break;
				case 2:
					{
					setState(2675);
					collectionDerivedTable();
					}
					break;
				}
				}
				}
				setState(2682);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TableReferenceContext extends ParserRuleContext {
		public SingleTableReferenceContext singleTableReference() {
			return getRuleContext(SingleTableReferenceContext.class,0);
		}
		public NestedTableExpressionContext nestedTableExpression() {
			return getRuleContext(NestedTableExpressionContext.class,0);
		}
		public DataChangeTableReferenceContext dataChangeTableReference() {
			return getRuleContext(DataChangeTableReferenceContext.class,0);
		}
		public TableFunctionReferenceContext tableFunctionReference() {
			return getRuleContext(TableFunctionReferenceContext.class,0);
		}
		public TableLocatorReferenceContext tableLocatorReference() {
			return getRuleContext(TableLocatorReferenceContext.class,0);
		}
		public XmltableExpressionContext xmltableExpression() {
			return getRuleContext(XmltableExpressionContext.class,0);
		}
		public CollectionDerivedTableContext collectionDerivedTable() {
			return getRuleContext(CollectionDerivedTableContext.class,0);
		}
		public List<TerminalNode> JOIN() { return getTokens(DB2zSQLParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(DB2zSQLParser.JOIN, i);
		}
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> ON() { return getTokens(DB2zSQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(DB2zSQLParser.ON, i);
		}
		public List<JoinConditionContext> joinCondition() {
			return getRuleContexts(JoinConditionContext.class);
		}
		public JoinConditionContext joinCondition(int i) {
			return getRuleContext(JoinConditionContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(DB2zSQLParser.CROSS, 0); }
		public List<TerminalNode> INNER() { return getTokens(DB2zSQLParser.INNER); }
		public TerminalNode INNER(int i) {
			return getToken(DB2zSQLParser.INNER, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public List<TerminalNode> LEFT() { return getTokens(DB2zSQLParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(DB2zSQLParser.LEFT, i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(DB2zSQLParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(DB2zSQLParser.RIGHT, i);
		}
		public List<TerminalNode> FULL() { return getTokens(DB2zSQLParser.FULL); }
		public TerminalNode FULL(int i) {
			return getToken(DB2zSQLParser.FULL, i);
		}
		public List<TerminalNode> OUTER() { return getTokens(DB2zSQLParser.OUTER); }
		public TerminalNode OUTER(int i) {
			return getToken(DB2zSQLParser.OUTER, i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_tableReference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2683);
				singleTableReference();
				}
				break;
			case 2:
				{
				setState(2684);
				nestedTableExpression();
				}
				break;
			case 3:
				{
				setState(2685);
				dataChangeTableReference();
				}
				break;
			case 4:
				{
				setState(2686);
				tableFunctionReference();
				}
				break;
			case 5:
				{
				setState(2687);
				tableLocatorReference();
				}
				break;
			case 6:
				{
				setState(2688);
				xmltableExpression();
				}
				break;
			case 7:
				{
				setState(2689);
				collectionDerivedTable();
				}
				break;
			case 8:
				{
				{
				setState(2738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2690);
					singleTableReference();
					}
					break;
				case 2:
					{
					setState(2691);
					nestedTableExpression();
					}
					break;
				case 3:
					{
					setState(2692);
					tableFunctionReference();
					}
					break;
				case 4:
					{
					setState(2693);
					tableLocatorReference();
					}
					break;
				case 5:
					{
					setState(2694);
					xmltableExpression();
					}
					break;
				case 6:
					{
					setState(2695);
					collectionDerivedTable();
					}
					break;
				case 7:
					{
					{
					setState(2697); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2696);
							match(LPAREN);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2699); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(2701);
					tableReference();
					setState(2703); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2702);
						match(RPAREN);
						}
						}
						setState(2705); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==RPAREN );
					}
					}
					break;
				case 8:
					{
					{
					setState(2724);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
					case 1:
						{
						setState(2707);
						singleTableReference();
						}
						break;
					case 2:
						{
						setState(2708);
						nestedTableExpression();
						}
						break;
					case 3:
						{
						setState(2709);
						tableFunctionReference();
						}
						break;
					case 4:
						{
						setState(2710);
						tableLocatorReference();
						}
						break;
					case 5:
						{
						setState(2711);
						xmltableExpression();
						}
						break;
					case 6:
						{
						{
						setState(2713); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(2712);
								match(LPAREN);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(2715); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(2717);
						tableReference();
						setState(2719); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2718);
							match(RPAREN);
							}
							}
							setState(2721); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==RPAREN );
						}
						}
						break;
					case 7:
						{
						setState(2723);
						collectionDerivedTable();
						}
						break;
					}
					setState(2731);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INNER:
						{
						setState(2726);
						match(INNER);
						}
						break;
					case FULL:
					case LEFT:
					case RIGHT:
						{
						{
						setState(2727);
						_la = _input.LA(1);
						if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2729);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OUTER) {
							{
							setState(2728);
							match(OUTER);
							}
						}

						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2733);
					match(JOIN);
					setState(2734);
					tableReference();
					setState(2735);
					match(ON);
					setState(2736);
					joinCondition();
					}
					}
					break;
				}
				setState(2745);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(2740);
					match(INNER);
					}
					break;
				case FULL:
				case LEFT:
				case RIGHT:
					{
					{
					setState(2741);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2743);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(2742);
						match(OUTER);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2747);
				match(JOIN);
				setState(2748);
				tableReference();
				setState(2749);
				match(ON);
				setState(2750);
				joinCondition();
				}
				}
				break;
			case 9:
				{
				{
				setState(2800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2752);
					singleTableReference();
					}
					break;
				case 2:
					{
					setState(2753);
					nestedTableExpression();
					}
					break;
				case 3:
					{
					setState(2754);
					tableFunctionReference();
					}
					break;
				case 4:
					{
					setState(2755);
					tableLocatorReference();
					}
					break;
				case 5:
					{
					setState(2756);
					xmltableExpression();
					}
					break;
				case 6:
					{
					setState(2757);
					collectionDerivedTable();
					}
					break;
				case 7:
					{
					{
					setState(2759); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2758);
							match(LPAREN);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2761); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(2763);
					tableReference();
					setState(2765); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2764);
						match(RPAREN);
						}
						}
						setState(2767); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==RPAREN );
					}
					}
					break;
				case 8:
					{
					{
					setState(2786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
					case 1:
						{
						setState(2769);
						singleTableReference();
						}
						break;
					case 2:
						{
						setState(2770);
						nestedTableExpression();
						}
						break;
					case 3:
						{
						setState(2771);
						tableFunctionReference();
						}
						break;
					case 4:
						{
						setState(2772);
						tableLocatorReference();
						}
						break;
					case 5:
						{
						setState(2773);
						xmltableExpression();
						}
						break;
					case 6:
						{
						{
						setState(2775); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(2774);
								match(LPAREN);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(2777); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(2779);
						tableReference();
						setState(2781); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2780);
							match(RPAREN);
							}
							}
							setState(2783); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==RPAREN );
						}
						}
						break;
					case 7:
						{
						setState(2785);
						collectionDerivedTable();
						}
						break;
					}
					setState(2793);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INNER:
						{
						setState(2788);
						match(INNER);
						}
						break;
					case FULL:
					case LEFT:
					case RIGHT:
						{
						{
						setState(2789);
						_la = _input.LA(1);
						if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2791);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OUTER) {
							{
							setState(2790);
							match(OUTER);
							}
						}

						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2795);
					match(JOIN);
					setState(2796);
					tableReference();
					setState(2797);
					match(ON);
					setState(2798);
					joinCondition();
					}
					}
					break;
				}
				setState(2802);
				match(CROSS);
				setState(2803);
				match(JOIN);
				setState(2804);
				tableReference();
				}
				}
				break;
			case 10:
				{
				{
				setState(2807); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2806);
						match(LPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2809); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2811);
				tableReference();
				setState(2813); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2812);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2815); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
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

	public static class SingleTableReferenceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<PeriodSpecificationContext> periodSpecification() {
			return getRuleContexts(PeriodSpecificationContext.class);
		}
		public PeriodSpecificationContext periodSpecification(int i) {
			return getRuleContext(PeriodSpecificationContext.class,i);
		}
		public CorrelationClauseContext correlationClause() {
			return getRuleContext(CorrelationClauseContext.class,0);
		}
		public SingleTableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSingleTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSingleTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSingleTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableReferenceContext singleTableReference() throws RecognitionException {
		SingleTableReferenceContext _localctx = new SingleTableReferenceContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_singleTableReference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2819);
			tableName();
			setState(2823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2820);
					periodSpecification();
					}
					} 
				}
				setState(2825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			}
			setState(2827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2826);
				correlationClause();
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

	public static class PeriodSpecificationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(DB2zSQLParser.SYSTEM_TIME, 0); }
		public TerminalNode BUSINESS_TIME() { return getToken(DB2zSQLParser.BUSINESS_TIME, 0); }
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public TerminalNode OF() { return getToken(DB2zSQLParser.OF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(DB2zSQLParser.FROM, 0); }
		public TerminalNode TO() { return getToken(DB2zSQLParser.TO, 0); }
		public TerminalNode BETWEEN() { return getToken(DB2zSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public PeriodSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPeriodSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPeriodSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPeriodSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodSpecificationContext periodSpecification() throws RecognitionException {
		PeriodSpecificationContext _localctx = new PeriodSpecificationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_periodSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2829);
			match(FOR);
			setState(2830);
			_la = _input.LA(1);
			if ( !(_la==SYSTEM_TIME || _la==BUSINESS_TIME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
				{
				{
				setState(2831);
				match(AS);
				setState(2832);
				match(OF);
				setState(2833);
				expression();
				}
				}
				break;
			case FROM:
				{
				{
				setState(2834);
				match(FROM);
				setState(2835);
				expression();
				setState(2836);
				match(TO);
				setState(2837);
				expression();
				}
				}
				break;
			case BETWEEN:
				{
				{
				setState(2839);
				match(BETWEEN);
				setState(2840);
				expression();
				setState(2841);
				match(AND);
				setState(2842);
				expression();
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

	public static class PeriodClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode PORTION() { return getToken(DB2zSQLParser.PORTION, 0); }
		public TerminalNode OF() { return getToken(DB2zSQLParser.OF, 0); }
		public TerminalNode BUSINESS_TIME() { return getToken(DB2zSQLParser.BUSINESS_TIME, 0); }
		public TerminalNode FROM() { return getToken(DB2zSQLParser.FROM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(DB2zSQLParser.TO, 0); }
		public TerminalNode BETWEEN() { return getToken(DB2zSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public PeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterPeriodClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitPeriodClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitPeriodClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodClauseContext periodClause() throws RecognitionException {
		PeriodClauseContext _localctx = new PeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_periodClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2846);
			match(FOR);
			setState(2847);
			match(PORTION);
			setState(2848);
			match(OF);
			setState(2849);
			match(BUSINESS_TIME);
			setState(2860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				{
				{
				setState(2850);
				match(FROM);
				setState(2851);
				expression();
				setState(2852);
				match(TO);
				setState(2853);
				expression();
				}
				}
				break;
			case BETWEEN:
				{
				{
				setState(2855);
				match(BETWEEN);
				setState(2856);
				expression();
				setState(2857);
				match(AND);
				setState(2858);
				expression();
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

	public static class NestedTableExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode TABLE() { return getToken(DB2zSQLParser.TABLE, 0); }
		public CorrelationClauseContext correlationClause() {
			return getRuleContext(CorrelationClauseContext.class,0);
		}
		public NestedTableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedTableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterNestedTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitNestedTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitNestedTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedTableExpressionContext nestedTableExpression() throws RecognitionException {
		NestedTableExpressionContext _localctx = new NestedTableExpressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_nestedTableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(2862);
				match(TABLE);
				}
			}

			setState(2865);
			match(LPAREN);
			setState(2866);
			fullSelect();
			setState(2867);
			match(RPAREN);
			setState(2869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2868);
				correlationClause();
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

	public static class DataChangeTableReferenceContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(DB2zSQLParser.FINAL, 0); }
		public TerminalNode TABLE() { return getToken(DB2zSQLParser.TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public SearchedUpdateContext searchedUpdate() {
			return getRuleContext(SearchedUpdateContext.class,0);
		}
		public TerminalNode OLD() { return getToken(DB2zSQLParser.OLD, 0); }
		public SearchedDeleteContext searchedDelete() {
			return getRuleContext(SearchedDeleteContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public CorrelationClauseContext correlationClause() {
			return getRuleContext(CorrelationClauseContext.class,0);
		}
		public DataChangeTableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataChangeTableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterDataChangeTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitDataChangeTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitDataChangeTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataChangeTableReferenceContext dataChangeTableReference() throws RecognitionException {
		DataChangeTableReferenceContext _localctx = new DataChangeTableReferenceContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_dataChangeTableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				{
				setState(2871);
				match(FINAL);
				setState(2872);
				match(TABLE);
				setState(2873);
				match(LPAREN);
				setState(2874);
				insertStatement();
				setState(2875);
				match(RPAREN);
				setState(2877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2876);
					correlationClause();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(2879);
				_la = _input.LA(1);
				if ( !(_la==FINAL || _la==OLD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2880);
				match(TABLE);
				setState(2881);
				searchedUpdate();
				}
				}
				break;
			case 3:
				{
				{
				setState(2882);
				match(OLD);
				setState(2883);
				match(TABLE);
				setState(2884);
				searchedDelete();
				}
				}
				break;
			case 4:
				{
				{
				setState(2885);
				match(FINAL);
				setState(2886);
				match(TABLE);
				setState(2887);
				mergeStatement();
				}
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

	public static class TableFunctionReferenceContext extends ParserRuleContext {
		public List<TerminalNode> TABLE() { return getTokens(DB2zSQLParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(DB2zSQLParser.TABLE, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public ScalarFunctionContext scalarFunction() {
			return getRuleContext(ScalarFunctionContext.class,0);
		}
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public RegressionFunctionContext regressionFunction() {
			return getRuleContext(RegressionFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public TableUdfCardinalityClauseContext tableUdfCardinalityClause() {
			return getRuleContext(TableUdfCardinalityClauseContext.class,0);
		}
		public CorrelationClauseContext correlationClause() {
			return getRuleContext(CorrelationClauseContext.class,0);
		}
		public TypedCorrelationClauseContext typedCorrelationClause() {
			return getRuleContext(TypedCorrelationClauseContext.class,0);
		}
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TableFunctionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunctionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTableFunctionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTableFunctionReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTableFunctionReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFunctionReferenceContext tableFunctionReference() throws RecognitionException {
		TableFunctionReferenceContext _localctx = new TableFunctionReferenceContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_tableFunctionReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2890);
			match(TABLE);
			setState(2891);
			match(LPAREN);
			setState(2896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2892);
				scalarFunction();
				}
				break;
			case 2:
				{
				setState(2893);
				aggregateFunction();
				}
				break;
			case 3:
				{
				setState(2894);
				regressionFunction();
				}
				break;
			case 4:
				{
				setState(2895);
				identifier();
				}
				break;
			}
			setState(2898);
			match(LPAREN);
			setState(2902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2899);
				expression();
				}
				break;
			case 2:
				{
				{
				setState(2900);
				match(TABLE);
				setState(2901);
				tableName();
				}
				}
				break;
			}
			setState(2912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2904);
				match(COMMA);
				setState(2908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2905);
					expression();
					}
					break;
				case 2:
					{
					{
					setState(2906);
					match(TABLE);
					setState(2907);
					tableName();
					}
					}
					break;
				}
				}
				}
				setState(2914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2915);
			match(RPAREN);
			setState(2917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARDINALITY) {
				{
				setState(2916);
				tableUdfCardinalityClause();
				}
			}

			setState(2919);
			match(RPAREN);
			setState(2922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2920);
				correlationClause();
				}
				break;
			case 2:
				{
				setState(2921);
				typedCorrelationClause();
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

	public static class TableUdfCardinalityClauseContext extends ParserRuleContext {
		public TerminalNode CARDINALITY() { return getToken(DB2zSQLParser.CARDINALITY, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode NUMERICLITERAL() { return getToken(DB2zSQLParser.NUMERICLITERAL, 0); }
		public TerminalNode MULTIPLIER() { return getToken(DB2zSQLParser.MULTIPLIER, 0); }
		public TableUdfCardinalityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableUdfCardinalityClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTableUdfCardinalityClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTableUdfCardinalityClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTableUdfCardinalityClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableUdfCardinalityClauseContext tableUdfCardinalityClause() throws RecognitionException {
		TableUdfCardinalityClauseContext _localctx = new TableUdfCardinalityClauseContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_tableUdfCardinalityClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2924);
			match(CARDINALITY);
			setState(2926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLIER) {
				{
				setState(2925);
				match(MULTIPLIER);
				}
			}

			setState(2928);
			_la = _input.LA(1);
			if ( !(_la==INTEGERLITERAL || _la==NUMERICLITERAL) ) {
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

	public static class TypedCorrelationClauseContext extends ParserRuleContext {
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public TypedCorrelationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedCorrelationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTypedCorrelationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTypedCorrelationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTypedCorrelationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedCorrelationClauseContext typedCorrelationClause() throws RecognitionException {
		TypedCorrelationClauseContext _localctx = new TypedCorrelationClauseContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_typedCorrelationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2930);
				match(AS);
				}
				break;
			}
			setState(2933);
			correlationName();
			setState(2934);
			match(LPAREN);
			setState(2935);
			columnName();
			setState(2936);
			dataType();
			setState(2943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2937);
				match(COMMA);
				setState(2938);
				columnName();
				setState(2939);
				dataType();
				}
				}
				setState(2945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2946);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableLocatorReferenceContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(DB2zSQLParser.TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(DB2zSQLParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public TableLocatorReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableLocatorReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterTableLocatorReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitTableLocatorReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitTableLocatorReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableLocatorReferenceContext tableLocatorReference() throws RecognitionException {
		TableLocatorReferenceContext _localctx = new TableLocatorReferenceContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_tableLocatorReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2948);
			match(TABLE);
			setState(2949);
			match(LPAREN);
			setState(2950);
			identifier();
			setState(2951);
			match(LIKE);
			setState(2952);
			tableName();
			setState(2953);
			match(RPAREN);
			setState(2955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2954);
				correlationName();
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

	public static class XmltableExpressionContext extends ParserRuleContext {
		public XmltableFunctionSpecificationContext xmltableFunctionSpecification() {
			return getRuleContext(XmltableFunctionSpecificationContext.class,0);
		}
		public CorrelationClauseContext correlationClause() {
			return getRuleContext(CorrelationClauseContext.class,0);
		}
		public XmltableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmltableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterXmltableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitXmltableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitXmltableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmltableExpressionContext xmltableExpression() throws RecognitionException {
		XmltableExpressionContext _localctx = new XmltableExpressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_xmltableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2957);
			xmltableFunctionSpecification();
			setState(2959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2958);
				correlationClause();
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

	public static class CollectionDerivedTableContext extends ParserRuleContext {
		public TerminalNode UNNEST() { return getToken(DB2zSQLParser.UNNEST, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<OrdinaryArrayExpressionContext> ordinaryArrayExpression() {
			return getRuleContexts(OrdinaryArrayExpressionContext.class);
		}
		public OrdinaryArrayExpressionContext ordinaryArrayExpression(int i) {
			return getRuleContext(OrdinaryArrayExpressionContext.class,i);
		}
		public List<AssociativeArrayExpressionContext> associativeArrayExpression() {
			return getRuleContexts(AssociativeArrayExpressionContext.class);
		}
		public AssociativeArrayExpressionContext associativeArrayExpression(int i) {
			return getRuleContext(AssociativeArrayExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(DB2zSQLParser.ORDINALITY, 0); }
		public CorrelationClauseContext correlationClause() {
			return getRuleContext(CorrelationClauseContext.class,0);
		}
		public CollectionDerivedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionDerivedTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCollectionDerivedTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCollectionDerivedTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCollectionDerivedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionDerivedTableContext collectionDerivedTable() throws RecognitionException {
		CollectionDerivedTableContext _localctx = new CollectionDerivedTableContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_collectionDerivedTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2961);
			match(UNNEST);
			setState(2962);
			match(LPAREN);
			setState(2965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				setState(2963);
				ordinaryArrayExpression();
				}
				break;
			case 2:
				{
				setState(2964);
				associativeArrayExpression();
				}
				break;
			}
			setState(2974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2967);
				match(COMMA);
				setState(2970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2968);
					ordinaryArrayExpression();
					}
					break;
				case 2:
					{
					setState(2969);
					associativeArrayExpression();
					}
					break;
				}
				}
				}
				setState(2976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2977);
			match(RPAREN);
			setState(2980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2978);
				match(WITH);
				setState(2979);
				match(ORDINALITY);
				}
				break;
			}
			setState(2983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(2982);
				correlationClause();
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

	public static class JoinConditionContext extends ParserRuleContext {
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public List<FullJoinExpressionContext> fullJoinExpression() {
			return getRuleContexts(FullJoinExpressionContext.class);
		}
		public FullJoinExpressionContext fullJoinExpression(int i) {
			return getRuleContext(FullJoinExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(DB2zSQLParser.EQ, 0); }
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				{
				setState(2985);
				searchCondition();
				}
				break;
			case 2:
				{
				{
				setState(2986);
				fullJoinExpression();
				setState(2987);
				match(EQ);
				setState(2988);
				fullJoinExpression();
				}
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

	public static class FullJoinExpressionContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<CastFunctionContext> castFunction() {
			return getRuleContexts(CastFunctionContext.class);
		}
		public CastFunctionContext castFunction(int i) {
			return getRuleContext(CastFunctionContext.class,i);
		}
		public TerminalNode COALESCE() { return getToken(DB2zSQLParser.COALESCE, 0); }
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public FullJoinExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullJoinExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFullJoinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFullJoinExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFullJoinExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullJoinExpressionContext fullJoinExpression() throws RecognitionException {
		FullJoinExpressionContext _localctx = new FullJoinExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fullJoinExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2992);
				columnName();
				}
				break;
			case 2:
				{
				setState(2993);
				castFunction();
				}
				break;
			case 3:
				{
				{
				setState(2994);
				match(COALESCE);
				setState(2995);
				match(LPAREN);
				setState(2998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
				case 1:
					{
					setState(2996);
					columnName();
					}
					break;
				case 2:
					{
					setState(2997);
					castFunction();
					}
					break;
				}
				setState(3007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3000);
					match(COMMA);
					setState(3003);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
					case 1:
						{
						setState(3001);
						columnName();
						}
						break;
					case 2:
						{
						setState(3002);
						castFunction();
						}
						break;
					}
					}
					}
					setState(3009);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3010);
				match(RPAREN);
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

	public static class CastFunctionContext extends ParserRuleContext {
		public CastSpecificationContext castSpecification() {
			return getRuleContext(CastSpecificationContext.class,0);
		}
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3014);
			castSpecification();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryArrayExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrdinaryArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOrdinaryArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOrdinaryArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOrdinaryArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryArrayExpressionContext ordinaryArrayExpression() throws RecognitionException {
		OrdinaryArrayExpressionContext _localctx = new OrdinaryArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_ordinaryArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3016);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeArrayExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssociativeArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterAssociativeArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitAssociativeArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitAssociativeArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativeArrayExpressionContext associativeArrayExpression() throws RecognitionException {
		AssociativeArrayExpressionContext _localctx = new AssociativeArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_associativeArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3018);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3020);
			columnName();
			setState(3021);
			comparisonOperator();
			setState(3024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case AFTER:
			case ALL:
			case ALLOCATE:
			case ALLOW:
			case ALTER:
			case ALTERAND:
			case ANY:
			case ARRAY:
			case ARRAY_EXISTS:
			case AS:
			case ASENSITIVE:
			case ASSOCIATE:
			case ASUTIME:
			case AT:
			case AUDIT:
			case AUX:
			case AUXILIARY:
			case BEFORE:
			case BEGIN:
			case BETWEEN:
			case BUFFERPOOL:
			case BY:
			case CALL:
			case CAPTURE:
			case CASCADED:
			case CASE:
			case CAST:
			case CCSID:
			case CHAR:
			case CHARACTER:
			case CHECK:
			case CLONE:
			case CLOSE:
			case CLUSTER:
			case COLLECTION:
			case COLLID:
			case COLUMN:
			case COMMENT:
			case COMMIT:
			case CONCAT:
			case CONDITION:
			case CONNECT:
			case CONNECTION:
			case CONSTRAINT:
			case CONTAINS:
			case CONTENT:
			case CONTINUE:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_LC_CTYPE:
			case CURRVAL:
			case CURSOR:
			case DATA:
			case DATABASE:
			case DAY:
			case DAYS:
			case DBINFO:
			case DECLARE:
			case DEFAULT:
			case DELETE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DISABLE:
			case DISALLOW:
			case DISTINCT:
			case DO:
			case DOCUMENT:
			case DOUBLE:
			case DROP:
			case DSSIZE:
			case DYNAMIC:
			case EDITPROC:
			case ELSE:
			case ELSEIF:
			case ENCODING:
			case ENCRYPTION:
			case END:
			case END_EXEC:
			case ENDING:
			case ERASE:
			case ESCAPE:
			case EXCEPT:
			case EXCEPTION:
			case EXEC_SQL:
			case EXECUTE:
			case EXISTS:
			case EXIT:
			case EXPLAIN:
			case EXTERNAL:
			case FENCED:
			case FETCH:
			case FIELDPROC:
			case FINAL:
			case FIRST:
			case FOR:
			case FREE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANT:
			case GROUP:
			case HANDLER:
			case HAVING:
			case HOLD:
			case HOUR:
			case HOURS:
			case IF:
			case IMMEDIATE:
			case IN:
			case INCLUSIVE:
			case INDEX:
			case INDEXBP:
			case INHERIT:
			case INNER:
			case INOUT:
			case INSENSITIVE:
			case INSERT:
			case INTERSECT:
			case INTO:
			case IS:
			case ISOBID:
			case ITERATE:
			case JAR:
			case JOIN:
			case KEEP:
			case KEY:
			case LABEL:
			case LANGUAGE:
			case LAST:
			case LC_CTYPE:
			case LEAVE:
			case LEFT:
			case LIKE:
			case LIMIT:
			case LOCAL:
			case LOCALE:
			case LOCATOR:
			case LOCATORS:
			case LOCK:
			case LOCKMAX:
			case LOCKSIZE:
			case LONG:
			case LOOP:
			case MAINTAINED:
			case MATERIALIZED:
			case MICROSECOND:
			case MICROSECONDS:
			case MODIFIES:
			case MONTH:
			case MONTHS:
			case NEXT:
			case NEXTVAL:
			case NO:
			case NONE:
			case NOT:
			case NULL:
			case NULLS:
			case NUMPARTS:
			case OBID:
			case OF:
			case OFFSET:
			case OLD:
			case ON:
			case OPEN:
			case OPTIMIZATION:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case ORGANIZATION:
			case OUT:
			case OUTER:
			case PACKAGE:
			case PADDED:
			case PARAMETER:
			case PART:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONING:
			case PATH:
			case PERIOD:
			case PIECESIZE:
			case PLAN:
			case PRECISION:
			case PREPARE:
			case PREVVAL:
			case PRIOR:
			case PRIQTY:
			case PRIVILEGES:
			case PROCEDURE:
			case PROGRAM:
			case PSID:
			case PUBLIC:
			case QUERY:
			case QUERYNO:
			case READS:
			case REFERENCES:
			case REFRESH:
			case RELEASE:
			case RENAME:
			case REPEAT:
			case RESIGNAL:
			case RESTRICT:
			case RESULT:
			case RESULT_SET_LOCATOR:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUND_CEILING:
			case ROUND_DOWN:
			case ROUND_FLOOR:
			case ROUND_HALF_DOWN:
			case ROUND_HALF_EVEN:
			case ROUND_HALF_UP:
			case ROUND_UP:
			case ROW:
			case ROWSET:
			case RUN:
			case SAVEPOINT:
			case SCHEMA:
			case SCRATCHPAD:
			case SECOND:
			case SECONDS:
			case SECQTY:
			case SECURITY:
			case SELECT:
			case SENSITIVE:
			case SEQUENCE:
			case SET:
			case SIGNAL:
			case SIMPLE:
			case SOME:
			case SOURCE:
			case SPECIFIC:
			case STANDARD:
			case STATEMENT:
			case STATIC:
			case STAY:
			case STOGROUP:
			case STORES:
			case STYLE:
			case SUMMARY:
			case SYNONYM:
			case SYSDATE:
			case SYSTEM:
			case SYSTIMESTAMP:
			case TABLE:
			case TABLESPACE:
			case THEN:
			case TO:
			case TRIGGER:
			case TRUNCATE:
			case TYPE:
			case UNDO:
			case UNION:
			case UNIQUE:
			case UNTIL:
			case UPDATE:
			case USING:
			case VALIDPROC:
			case VALUE:
			case VALUES:
			case VARIABLE:
			case VARIANT:
			case VCAT:
			case VERSIONING:
			case VIEW:
			case VOLATILE:
			case VOLUMES:
			case WHEN:
			case WHENEVER:
			case WHERE:
			case WHILE:
			case WITH:
			case WLM:
			case XMLCAST:
			case XMLEXISTS:
			case XMLNAMESPACES:
			case YEAR:
			case YEARS:
			case ZONE:
			case AND:
			case ARRAY_AGG:
			case ASC:
			case AVG:
			case BIT:
			case CHANGE:
			case CODEUNITS16:
			case CODEUNITS32:
			case CORR:
			case CORRELATION:
			case COUNT:
			case COUNT_BIG:
			case COVAR:
			case COVARIANCE:
			case COVARIANCE_SAMP:
			case COVAR_POP:
			case COVAR_SAMP:
			case CS:
			case CUME_DIST:
			case DENSE_RANK:
			case DESC:
			case EBCDIC:
			case EXCLUSIVE:
			case FIRST_VALUE:
			case FOLLOWING:
			case GROUPING:
			case IGNORE:
			case INDICATOR:
			case INPUT:
			case ISNULL:
			case LAG:
			case LARGE:
			case LAST_VALUE:
			case LEAD:
			case LISTAGG:
			case LOCKED:
			case LOCKS:
			case MEDIAN:
			case MINUTES:
			case MIXED:
			case NOTNULL:
			case NTH_VALUE:
			case NTILE:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case ONLY:
			case OVER:
			case PASSING:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PRECEDING:
			case PREVIOUS:
			case RANGE:
			case RANK:
			case RATIO_TO_REPORT:
			case READ:
			case REF:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_ICPT:
			case REGR_INTERCEPT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case RESPECT:
			case ROW_NUMBER:
			case ROWS:
			case RR:
			case RS:
			case SBCS:
			case SELECTIVITY:
			case SETS:
			case SHARE:
			case SKIP_:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUM:
			case TOKEN:
			case UNBOUNDED:
			case UNPACK:
			case UR:
			case USE:
			case VAR:
			case VARIANCE:
			case VARIANCE_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARYING:
			case WITHOUT:
			case XML:
			case XMLAGG:
			case COLUMNS:
			case SQLID:
			case ORDINALITY:
			case SYSTEM_TIME:
			case BUSINESS_TIME:
			case MULTIPLIER:
			case UNNEST:
			case CROSS:
			case CALLER:
			case CLIENT:
			case POSITIONING:
			case SCROLL:
			case ACTION:
			case ASSEMBLE:
			case C_:
			case CALLED:
			case COBOL:
			case DB2:
			case DEFINER:
			case DISPATCH:
			case ENVIRONMENT:
			case FAILURE:
			case FAILURES:
			case JAVA:
			case MAIN:
			case NAME:
			case OPTIONS:
			case PARALLEL:
			case PLI:
			case REGISTERS:
			case RESIDENT:
			case SECURED:
			case SPECIAL:
			case SQL:
			case STOP:
			case SUB:
			case YES:
			case APPLICATION:
			case CHANGED:
			case COMPATIBILITY:
			case COMPRESS:
			case COPY:
			case FREEPAGE:
			case GBPCACHE:
			case INCLUDE:
			case MAXVALUE:
			case MINVALUE:
			case PCTFREE:
			case REGENERATE:
			case SEQTY:
			case MASK:
			case ENABLE:
			case PERMISSION:
			case ATOMIC:
			case SQLEXCEPTION:
			case MERGE:
			case MATCHED:
			case SQLSTATE:
			case MESSAGE_TEXT:
			case OVERRIDING:
			case PORTION:
			case DB2SQL:
			case DEBUG:
			case GENERAL:
			case MODE_:
			case REXX:
			case ABS:
			case ABSVAL:
			case ACOS:
			case ADD_DAYS:
			case ADD_MONTHS:
			case ARRAY_DELETE:
			case ARRAY_FIRST:
			case ARRAY_LAST:
			case ARRAY_NEXT:
			case ARRAY_PRIOR:
			case ARRAY_TRIM:
			case ASCII:
			case ASCII_CHR:
			case ASCIISTR:
			case ASCII_STR:
			case ASIN:
			case ATAN:
			case ATAN2:
			case ATANH:
			case BIGINT:
			case BINARY:
			case BITAND:
			case BITANDNOT:
			case BITNOT:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BTRIM:
			case CARDINALITY:
			case CCSID_ENCODING:
			case CEIL:
			case CEILING:
			case CHAR9:
			case CHARACTER_LENGTH:
			case CHAR_LENGTH:
			case CHR:
			case CLOB:
			case COALESCE:
			case COLLATION_KEY:
			case COMPARE_DECFLOAT:
			case COS:
			case COSH:
			case DATE:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFWEEK_ISO:
			case DAYOFYEAR:
			case DAYS_BETWEEN:
			case DBCLOB:
			case DEC:
			case DECFLOAT:
			case DECFLOAT_FORMAT:
			case DECFLOAT_SORTKEY:
			case DECIMAL:
			case DECODE:
			case DECRYPT_BINARY:
			case DECRYPT_BIT:
			case DECRYPT_CHAR:
			case DECRYPT_DATAKEY_BIGINT:
			case DECRYPT_DATAKEY_BIT:
			case DECRYPT_DATAKEY_CLOB:
			case DECRYPT_DATAKEY_DBCLOB:
			case DECRYPT_DATAKEY_DECIMAL:
			case DECRYPT_DATAKEY_INTEGER:
			case DECRYPT_DATAKEY_VARCHAR:
			case DECRYPT_DATAKEY_VARGRAPHIC:
			case DECRYPT_DB:
			case DEGREES:
			case DIFFERENCE:
			case DIGITS:
			case DOUBLE_PRECISION:
			case DSN_XMLVALIDATE:
			case EBCDIC_CHR:
			case EBCDIC_STR:
			case ENCRYPT_DATAKEY:
			case ENCRYPT_TDES:
			case EXP:
			case EXTRACT:
			case FLOAT:
			case FLOOR:
			case GENERATE_UNIQUE:
			case GENERATE_UNIQUE_BINARY:
			case GETHINT:
			case GETVARIABLE:
			case GRAPHIC:
			case GREATEST:
			case HASH:
			case HASH_CRC32:
			case HASH_MD5:
			case HASH_SHA1:
			case HASH_SHA256:
			case HEX:
			case IDENTITY_VAL_LOCAL:
			case IFNULL:
			case INSTR:
			case INT:
			case INTEGER:
			case JULIAN_DAY:
			case LAST_DAY:
			case LCASE:
			case LEAST:
			case LENGTH:
			case LN:
			case LOCATE:
			case LOCATE_IN_STRING:
			case LOG10:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAX:
			case MAX_CARDINALITY:
			case MIDNIGHT_SECONDS:
			case MIN:
			case MINUTE:
			case MOD:
			case MONTHS_BETWEEN:
			case MQREAD:
			case MQREADCLOB:
			case MQRECEIVE:
			case MQRECEIVECLOB:
			case MQSEND:
			case MULTIPLY_ALT:
			case NEXT_DAY:
			case NEXT_MONTH:
			case NORMALIZE_DECFLOAT:
			case NORMALIZE_STRING:
			case NULLIF:
			case NVL:
			case OVERLAY:
			case PACK:
			case POSITION:
			case POSSTR:
			case POW:
			case POWER:
			case QUANTIZE:
			case QUARTER:
			case RADIANS:
			case RAISE_ERROR:
			case RAND:
			case RANDOM:
			case REAL:
			case REGEXP_COUNT:
			case REGEXP_INSTR:
			case REGEXP_LIKE:
			case REGEXP_REPLACE:
			case REGEXP_SUBSTR:
			case REPLACE:
			case RID:
			case ROUND:
			case ROUND_TIMESTAMP:
			case ROWID:
			case RPAD:
			case RTRIM:
			case SCORE:
			case SIGN:
			case SIN:
			case SINH:
			case SMALLINT:
			case SOAPHTTPC:
			case SOAPHTTPNC:
			case SOAPHTTPNV:
			case SOAPHTTPV:
			case SOUNDEX:
			case SPACE:
			case SQRT:
			case STRIP:
			case STRLEFT:
			case STRPOS:
			case STRRIGHT:
			case SUBSTR:
			case SUBSTRING:
			case TAN:
			case TANH:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TIMESTAMP_FORMAT:
			case TIMESTAMP_ISO:
			case TIMESTAMP_TZ:
			case TO_CHAR:
			case TO_CLOB:
			case TO_DATE:
			case TO_NUMBER:
			case TOTALORDER:
			case TO_TIMESTAMP:
			case TRANSLATE:
			case TRIM:
			case TRIM_ARRAY:
			case TRUNC:
			case TRUNC_TIMESTAMP:
			case UCASE:
			case UNICODE:
			case UNICODE_STR:
			case UNISTR:
			case UPPER:
			case VARBINARY:
			case VARCHAR:
			case VARCHAR9:
			case VARCHAR_BIT_FORMAT:
			case VARCHAR_FORMAT:
			case VARGRAPHIC:
			case VERIFY_GROUP_FOR_USER:
			case VERIFY_ROLE_FOR_USER:
			case VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER:
			case WEEK:
			case WEEK_ISO:
			case WRAP:
			case XMLATTRIBUTES:
			case XMLCOMMENT:
			case XMLCONCAT:
			case XMLDOCUMENT:
			case XMLELEMENT:
			case XMLFOREST:
			case XMLMODIFY:
			case XMLPARSE:
			case XMLPI:
			case XMLQUERY:
			case XMLSERIALIZE:
			case XMLTEXT:
			case XMLXSROBJECTID:
			case XSLTRANSFORM:
			case CURRENT_ACCELERATOR:
			case CURRENT_APPLICATION_COMPATIBILITY:
			case CURRENT_APPLICATION_ENCODING_SCHEME:
			case CURRENT_CLIENT_ACCTNG:
			case CURRENT_CLIENT_APPLNAME:
			case CURRENT_CLIENT_CORR_TOKEN:
			case CURRENT_CLIENT_USERID:
			case CURRENT_CLIENT_WRKSTNNAME:
			case CURRENT_DATE:
			case CURRENT_DEBUG_MODE:
			case CURRENT_DECFLOAT_ROUNDING_MODE:
			case CURRENT_DEGREE:
			case CURRENT_EXPLAIN_MODE:
			case CURRENT_GET_ACCEL_ARCHIVE:
			case CURRENT_LOCALE_LC_CTYPE:
			case CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION:
			case CURRENT_MEMBER:
			case CURRENT_OPTIMIZATION_HINT:
			case CURRENT_PACKAGE_PATH:
			case CURRENT_PACKAGESET:
			case CURRENT_PATH:
			case CURRENT_PRECISION:
			case CURRENT_QUERY_ACCELERATION:
			case CURRENT_QUERY_ACCELERATION_WAITFORDATA:
			case CURRENT_REFRESH_AGE:
			case CURRENT_ROUTINE_VERSION:
			case CURRENT_RULES:
			case CURRENT_SCHEMA:
			case CURRENT_SERVER:
			case CURRENT_SQLID:
			case CURRENT_TEMPORAL_BUSINESS_TIME:
			case CURRENT_TEMPORAL_SYSTEM_TIME:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_TIME_ZONE:
			case ENCRYPTION_PASSWORD:
			case SESSION_TIME_ZONE:
			case SESSION_USER:
			case USER:
			case ADMIN_TASK_LIST:
			case ADMIN_TASK_OUTPUT:
			case ADMIN_TASK_STATUS:
			case BLOCKING_THREADS:
			case MQREADALL:
			case MQREADALLCLOB:
			case MQRECEIVEALL:
			case MQRECEIVEALLCLOB:
			case XMLTABLE:
			case SQLIDENTIFIER:
				{
				setState(3022);
				columnName();
				}
				break;
			case NONNUMERICLITERAL:
			case INTEGERLITERAL:
			case NUMERICLITERAL:
				{
				setState(3023);
				literal();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(DB2zSQLParser.WHERE, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3026);
			match(WHERE);
			setState(3027);
			searchCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(DB2zSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(DB2zSQLParser.BY, 0); }
		public GroupingExpressionContext groupingExpression() {
			return getRuleContext(GroupingExpressionContext.class,0);
		}
		public GroupingSetsContext groupingSets() {
			return getRuleContext(GroupingSetsContext.class,0);
		}
		public SuperGroupsContext superGroups() {
			return getRuleContext(SuperGroupsContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3029);
			match(GROUP);
			setState(3030);
			match(BY);
			setState(3034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				{
				setState(3031);
				groupingExpression();
				}
				break;
			case 2:
				{
				setState(3032);
				groupingSets();
				}
				break;
			case 3:
				{
				setState(3033);
				superGroups();
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(DB2zSQLParser.HAVING, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3036);
			match(HAVING);
			setState(3037);
			searchCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public GroupingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingExpressionContext groupingExpression() throws RecognitionException {
		GroupingExpressionContext _localctx = new GroupingExpressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_groupingExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3039);
			expression();
			setState(3044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3040);
					match(COMMA);
					setState(3041);
					expression();
					}
					} 
				}
				setState(3046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
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

	public static class GroupingSetsContext extends ParserRuleContext {
		public TerminalNode GROUPING() { return getToken(DB2zSQLParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(DB2zSQLParser.SETS, 0); }
		public GroupingSetsGroupContext groupingSetsGroup() {
			return getRuleContext(GroupingSetsGroupContext.class,0);
		}
		public GroupingSetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetsContext groupingSets() throws RecognitionException {
		GroupingSetsContext _localctx = new GroupingSetsContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_groupingSets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3047);
			match(GROUPING);
			setState(3048);
			match(SETS);
			setState(3049);
			groupingSetsGroup();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetsGroupContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<GroupingSetsGroupContext> groupingSetsGroup() {
			return getRuleContexts(GroupingSetsGroupContext.class);
		}
		public GroupingSetsGroupContext groupingSetsGroup(int i) {
			return getRuleContext(GroupingSetsGroupContext.class,i);
		}
		public List<GroupingExpressionContext> groupingExpression() {
			return getRuleContexts(GroupingExpressionContext.class);
		}
		public GroupingExpressionContext groupingExpression(int i) {
			return getRuleContext(GroupingExpressionContext.class,i);
		}
		public List<SuperGroupsContext> superGroups() {
			return getRuleContexts(SuperGroupsContext.class);
		}
		public SuperGroupsContext superGroups(int i) {
			return getRuleContext(SuperGroupsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public GroupingSetsGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSetsGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterGroupingSetsGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitGroupingSetsGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitGroupingSetsGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetsGroupContext groupingSetsGroup() throws RecognitionException {
		GroupingSetsGroupContext _localctx = new GroupingSetsGroupContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_groupingSetsGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3051);
			match(LPAREN);
			setState(3055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(3052);
				groupingSetsGroup();
				}
				break;
			case 2:
				{
				setState(3053);
				groupingExpression();
				}
				break;
			case 3:
				{
				setState(3054);
				superGroups();
				}
				break;
			}
			setState(3065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3057);
				match(COMMA);
				setState(3061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(3058);
					groupingSetsGroup();
					}
					break;
				case 2:
					{
					setState(3059);
					groupingExpression();
					}
					break;
				case 3:
					{
					setState(3060);
					superGroups();
					}
					break;
				}
				}
				}
				setState(3067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3068);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperGroupsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public GroupingExpressionContext groupingExpression() {
			return getRuleContext(GroupingExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(DB2zSQLParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(DB2zSQLParser.CUBE, 0); }
		public SuperGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSuperGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSuperGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSuperGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperGroupsContext superGroups() throws RecognitionException {
		SuperGroupsContext _localctx = new SuperGroupsContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_superGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				{
				{
				setState(3070);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3071);
				match(LPAREN);
				setState(3072);
				groupingExpression();
				setState(3073);
				match(RPAREN);
				}
				}
				break;
			case LPAREN:
				{
				{
				setState(3075);
				match(LPAREN);
				setState(3076);
				match(RPAREN);
				}
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

	public static class SelectColumnsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public TerminalNode SPLAT() { return getToken(DB2zSQLParser.SPLAT, 0); }
		public UnpackedRowContext unpackedRow() {
			return getRuleContext(UnpackedRowContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public NewColumnNameContext newColumnName() {
			return getRuleContext(NewColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public SelectColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSelectColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSelectColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSelectColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnsContext selectColumns() throws RecognitionException {
		SelectColumnsContext _localctx = new SelectColumnsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_selectColumns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				{
				{
				setState(3079);
				expression();
				setState(3085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3080);
						operator();
						setState(3081);
						expression();
						}
						} 
					}
					setState(3087);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				}
				setState(3092);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
				case 1:
					{
					setState(3089);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
					case 1:
						{
						setState(3088);
						match(AS);
						}
						break;
					}
					setState(3091);
					newColumnName();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(3094);
				tableName();
				setState(3095);
				match(DOT);
				setState(3096);
				match(SPLAT);
				}
				}
				break;
			case 3:
				{
				{
				setState(3098);
				unpackedRow();
				}
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

	public static class UnpackedRowContext extends ParserRuleContext {
		public TerminalNode UNPACK() { return getToken(DB2zSQLParser.UNPACK, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public TerminalNode DOT() { return getToken(DB2zSQLParser.DOT, 0); }
		public TerminalNode SPLAT() { return getToken(DB2zSQLParser.SPLAT, 0); }
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public UnpackedRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterUnpackedRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitUnpackedRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitUnpackedRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpackedRowContext unpackedRow() throws RecognitionException {
		UnpackedRowContext _localctx = new UnpackedRowContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_unpackedRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3101);
			match(UNPACK);
			setState(3102);
			match(LPAREN);
			setState(3103);
			expression();
			setState(3104);
			match(RPAREN);
			setState(3105);
			match(DOT);
			setState(3106);
			match(SPLAT);
			setState(3107);
			match(AS);
			setState(3108);
			match(LPAREN);
			setState(3109);
			columnName();
			setState(3110);
			dataType();
			setState(3117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3111);
				match(COMMA);
				setState(3112);
				columnName();
				setState(3113);
				dataType();
				}
				}
				setState(3119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3120);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(DB2zSQLParser.SELECT, 0); }
		public TerminalNode SPLAT() { return getToken(DB2zSQLParser.SPLAT, 0); }
		public TerminalNode ALL() { return getToken(DB2zSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(DB2zSQLParser.DISTINCT, 0); }
		public List<SelectColumnsContext> selectColumns() {
			return getRuleContexts(SelectColumnsContext.class);
		}
		public SelectColumnsContext selectColumns(int i) {
			return getRuleContext(SelectColumnsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3122);
			match(SELECT);
			setState(3124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				setState(3123);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
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
			setState(3135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPLAT:
				{
				setState(3126);
				match(SPLAT);
				}
				break;
			case LPAREN:
			case COLON:
			case NONNUMERICLITERAL:
			case INTEGERLITERAL:
			case NUMERICLITERAL:
			case ADD:
			case AFTER:
			case ALL:
			case ALLOCATE:
			case ALLOW:
			case ALTER:
			case ALTERAND:
			case ANY:
			case ARRAY:
			case ARRAY_EXISTS:
			case AS:
			case ASENSITIVE:
			case ASSOCIATE:
			case ASUTIME:
			case AT:
			case AUDIT:
			case AUX:
			case AUXILIARY:
			case BEFORE:
			case BEGIN:
			case BETWEEN:
			case BUFFERPOOL:
			case BY:
			case CALL:
			case CAPTURE:
			case CASCADED:
			case CASE:
			case CAST:
			case CCSID:
			case CHAR:
			case CHARACTER:
			case CHECK:
			case CLONE:
			case CLOSE:
			case CLUSTER:
			case COLLECTION:
			case COLLID:
			case COLUMN:
			case COMMENT:
			case COMMIT:
			case CONCAT:
			case CONDITION:
			case CONNECT:
			case CONNECTION:
			case CONSTRAINT:
			case CONTAINS:
			case CONTENT:
			case CONTINUE:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_LC_CTYPE:
			case CURRVAL:
			case CURSOR:
			case DATA:
			case DATABASE:
			case DAY:
			case DAYS:
			case DBINFO:
			case DECLARE:
			case DEFAULT:
			case DELETE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DISABLE:
			case DISALLOW:
			case DISTINCT:
			case DO:
			case DOCUMENT:
			case DOUBLE:
			case DROP:
			case DSSIZE:
			case DYNAMIC:
			case EDITPROC:
			case ELSE:
			case ELSEIF:
			case ENCODING:
			case ENCRYPTION:
			case END:
			case END_EXEC:
			case ENDING:
			case ERASE:
			case ESCAPE:
			case EXCEPT:
			case EXCEPTION:
			case EXEC_SQL:
			case EXECUTE:
			case EXISTS:
			case EXIT:
			case EXPLAIN:
			case EXTERNAL:
			case FENCED:
			case FETCH:
			case FIELDPROC:
			case FINAL:
			case FIRST:
			case FOR:
			case FREE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANT:
			case GROUP:
			case HANDLER:
			case HAVING:
			case HOLD:
			case HOUR:
			case HOURS:
			case IF:
			case IMMEDIATE:
			case IN:
			case INCLUSIVE:
			case INDEX:
			case INDEXBP:
			case INHERIT:
			case INNER:
			case INOUT:
			case INSENSITIVE:
			case INSERT:
			case INTERSECT:
			case INTO:
			case IS:
			case ISOBID:
			case ITERATE:
			case JAR:
			case JOIN:
			case KEEP:
			case KEY:
			case LABEL:
			case LANGUAGE:
			case LAST:
			case LC_CTYPE:
			case LEAVE:
			case LEFT:
			case LIKE:
			case LIMIT:
			case LOCAL:
			case LOCALE:
			case LOCATOR:
			case LOCATORS:
			case LOCK:
			case LOCKMAX:
			case LOCKSIZE:
			case LONG:
			case LOOP:
			case MAINTAINED:
			case MATERIALIZED:
			case MICROSECOND:
			case MICROSECONDS:
			case MODIFIES:
			case MONTH:
			case MONTHS:
			case NEXT:
			case NEXTVAL:
			case NO:
			case NONE:
			case NOT:
			case NULL:
			case NULLS:
			case NUMPARTS:
			case OBID:
			case OF:
			case OFFSET:
			case OLD:
			case ON:
			case OPEN:
			case OPTIMIZATION:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case ORGANIZATION:
			case OUT:
			case OUTER:
			case PACKAGE:
			case PADDED:
			case PARAMETER:
			case PART:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONING:
			case PATH:
			case PERIOD:
			case PIECESIZE:
			case PLAN:
			case PRECISION:
			case PREPARE:
			case PREVVAL:
			case PRIOR:
			case PRIQTY:
			case PRIVILEGES:
			case PROCEDURE:
			case PROGRAM:
			case PSID:
			case PUBLIC:
			case QUERY:
			case QUERYNO:
			case READS:
			case REFERENCES:
			case REFRESH:
			case RELEASE:
			case RENAME:
			case REPEAT:
			case RESIGNAL:
			case RESTRICT:
			case RESULT:
			case RESULT_SET_LOCATOR:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUND_CEILING:
			case ROUND_DOWN:
			case ROUND_FLOOR:
			case ROUND_HALF_DOWN:
			case ROUND_HALF_EVEN:
			case ROUND_HALF_UP:
			case ROUND_UP:
			case ROW:
			case ROWSET:
			case RUN:
			case SAVEPOINT:
			case SCHEMA:
			case SCRATCHPAD:
			case SECOND:
			case SECONDS:
			case SECQTY:
			case SECURITY:
			case SELECT:
			case SENSITIVE:
			case SEQUENCE:
			case SET:
			case SIGNAL:
			case SIMPLE:
			case SOME:
			case SOURCE:
			case SPECIFIC:
			case STANDARD:
			case STATEMENT:
			case STATIC:
			case STAY:
			case STOGROUP:
			case STORES:
			case STYLE:
			case SUMMARY:
			case SYNONYM:
			case SYSDATE:
			case SYSTEM:
			case SYSTIMESTAMP:
			case TABLE:
			case TABLESPACE:
			case THEN:
			case TO:
			case TRIGGER:
			case TRUNCATE:
			case TYPE:
			case UNDO:
			case UNION:
			case UNIQUE:
			case UNTIL:
			case UPDATE:
			case USING:
			case VALIDPROC:
			case VALUE:
			case VALUES:
			case VARIABLE:
			case VARIANT:
			case VCAT:
			case VERSIONING:
			case VIEW:
			case VOLATILE:
			case VOLUMES:
			case WHEN:
			case WHENEVER:
			case WHERE:
			case WHILE:
			case WITH:
			case WLM:
			case XMLCAST:
			case XMLEXISTS:
			case XMLNAMESPACES:
			case YEAR:
			case YEARS:
			case ZONE:
			case AND:
			case ARRAY_AGG:
			case ASC:
			case AVG:
			case BIT:
			case CHANGE:
			case CODEUNITS16:
			case CODEUNITS32:
			case CORR:
			case CORRELATION:
			case COUNT:
			case COUNT_BIG:
			case COVAR:
			case COVARIANCE:
			case COVARIANCE_SAMP:
			case COVAR_POP:
			case COVAR_SAMP:
			case CS:
			case CUME_DIST:
			case DENSE_RANK:
			case DESC:
			case EBCDIC:
			case EXCLUSIVE:
			case FIRST_VALUE:
			case FOLLOWING:
			case GROUPING:
			case IGNORE:
			case INDICATOR:
			case INPUT:
			case ISNULL:
			case LAG:
			case LARGE:
			case LAST_VALUE:
			case LEAD:
			case LISTAGG:
			case LOCKED:
			case LOCKS:
			case MEDIAN:
			case MINUTES:
			case MIXED:
			case NOTNULL:
			case NTH_VALUE:
			case NTILE:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case ONLY:
			case OVER:
			case PASSING:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PRECEDING:
			case PREVIOUS:
			case RANGE:
			case RANK:
			case RATIO_TO_REPORT:
			case READ:
			case REF:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_ICPT:
			case REGR_INTERCEPT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case RESPECT:
			case ROW_NUMBER:
			case ROWS:
			case RR:
			case RS:
			case SBCS:
			case SELECTIVITY:
			case SETS:
			case SHARE:
			case SKIP_:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUM:
			case TOKEN:
			case UNBOUNDED:
			case UNPACK:
			case UR:
			case USE:
			case VAR:
			case VARIANCE:
			case VARIANCE_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARYING:
			case WITHOUT:
			case XML:
			case XMLAGG:
			case COLUMNS:
			case SQLID:
			case ORDINALITY:
			case SYSTEM_TIME:
			case BUSINESS_TIME:
			case MULTIPLIER:
			case UNNEST:
			case CROSS:
			case CALLER:
			case CLIENT:
			case POSITIONING:
			case SCROLL:
			case ACTION:
			case ASSEMBLE:
			case C_:
			case CALLED:
			case COBOL:
			case DB2:
			case DEFINER:
			case DISPATCH:
			case ENVIRONMENT:
			case FAILURE:
			case FAILURES:
			case JAVA:
			case MAIN:
			case NAME:
			case OPTIONS:
			case PARALLEL:
			case PLI:
			case REGISTERS:
			case RESIDENT:
			case SECURED:
			case SPECIAL:
			case SQL:
			case STOP:
			case SUB:
			case YES:
			case APPLICATION:
			case CHANGED:
			case COMPATIBILITY:
			case COMPRESS:
			case COPY:
			case FREEPAGE:
			case GBPCACHE:
			case INCLUDE:
			case MAXVALUE:
			case MINVALUE:
			case PCTFREE:
			case REGENERATE:
			case SEQTY:
			case MASK:
			case ENABLE:
			case PERMISSION:
			case ATOMIC:
			case SQLEXCEPTION:
			case MERGE:
			case MATCHED:
			case SQLSTATE:
			case MESSAGE_TEXT:
			case OVERRIDING:
			case PORTION:
			case DB2SQL:
			case DEBUG:
			case GENERAL:
			case MODE_:
			case REXX:
			case ABS:
			case ABSVAL:
			case ACOS:
			case ADD_DAYS:
			case ADD_MONTHS:
			case ARRAY_DELETE:
			case ARRAY_FIRST:
			case ARRAY_LAST:
			case ARRAY_NEXT:
			case ARRAY_PRIOR:
			case ARRAY_TRIM:
			case ASCII:
			case ASCII_CHR:
			case ASCIISTR:
			case ASCII_STR:
			case ASIN:
			case ATAN:
			case ATAN2:
			case ATANH:
			case BIGINT:
			case BINARY:
			case BITAND:
			case BITANDNOT:
			case BITNOT:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BTRIM:
			case CARDINALITY:
			case CCSID_ENCODING:
			case CEIL:
			case CEILING:
			case CHAR9:
			case CHARACTER_LENGTH:
			case CHAR_LENGTH:
			case CHR:
			case CLOB:
			case COALESCE:
			case COLLATION_KEY:
			case COMPARE_DECFLOAT:
			case COS:
			case COSH:
			case DATE:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFWEEK_ISO:
			case DAYOFYEAR:
			case DAYS_BETWEEN:
			case DBCLOB:
			case DEC:
			case DECFLOAT:
			case DECFLOAT_FORMAT:
			case DECFLOAT_SORTKEY:
			case DECIMAL:
			case DECODE:
			case DECRYPT_BINARY:
			case DECRYPT_BIT:
			case DECRYPT_CHAR:
			case DECRYPT_DATAKEY_BIGINT:
			case DECRYPT_DATAKEY_BIT:
			case DECRYPT_DATAKEY_CLOB:
			case DECRYPT_DATAKEY_DBCLOB:
			case DECRYPT_DATAKEY_DECIMAL:
			case DECRYPT_DATAKEY_INTEGER:
			case DECRYPT_DATAKEY_VARCHAR:
			case DECRYPT_DATAKEY_VARGRAPHIC:
			case DECRYPT_DB:
			case DEGREES:
			case DIFFERENCE:
			case DIGITS:
			case DOUBLE_PRECISION:
			case DSN_XMLVALIDATE:
			case EBCDIC_CHR:
			case EBCDIC_STR:
			case ENCRYPT_DATAKEY:
			case ENCRYPT_TDES:
			case EXP:
			case EXTRACT:
			case FLOAT:
			case FLOOR:
			case GENERATE_UNIQUE:
			case GENERATE_UNIQUE_BINARY:
			case GETHINT:
			case GETVARIABLE:
			case GRAPHIC:
			case GREATEST:
			case HASH:
			case HASH_CRC32:
			case HASH_MD5:
			case HASH_SHA1:
			case HASH_SHA256:
			case HEX:
			case IDENTITY_VAL_LOCAL:
			case IFNULL:
			case INSTR:
			case INT:
			case INTEGER:
			case JULIAN_DAY:
			case LAST_DAY:
			case LCASE:
			case LEAST:
			case LENGTH:
			case LN:
			case LOCATE:
			case LOCATE_IN_STRING:
			case LOG10:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAX:
			case MAX_CARDINALITY:
			case MIDNIGHT_SECONDS:
			case MIN:
			case MINUTE:
			case MOD:
			case MONTHS_BETWEEN:
			case MQREAD:
			case MQREADCLOB:
			case MQRECEIVE:
			case MQRECEIVECLOB:
			case MQSEND:
			case MULTIPLY_ALT:
			case NEXT_DAY:
			case NEXT_MONTH:
			case NORMALIZE_DECFLOAT:
			case NORMALIZE_STRING:
			case NULLIF:
			case NVL:
			case OVERLAY:
			case PACK:
			case POSITION:
			case POSSTR:
			case POW:
			case POWER:
			case QUANTIZE:
			case QUARTER:
			case RADIANS:
			case RAISE_ERROR:
			case RAND:
			case RANDOM:
			case REAL:
			case REGEXP_COUNT:
			case REGEXP_INSTR:
			case REGEXP_LIKE:
			case REGEXP_REPLACE:
			case REGEXP_SUBSTR:
			case REPLACE:
			case RID:
			case ROUND:
			case ROUND_TIMESTAMP:
			case ROWID:
			case RPAD:
			case RTRIM:
			case SCORE:
			case SIGN:
			case SIN:
			case SINH:
			case SMALLINT:
			case SOAPHTTPC:
			case SOAPHTTPNC:
			case SOAPHTTPNV:
			case SOAPHTTPV:
			case SOUNDEX:
			case SPACE:
			case SQRT:
			case STRIP:
			case STRLEFT:
			case STRPOS:
			case STRRIGHT:
			case SUBSTR:
			case SUBSTRING:
			case TAN:
			case TANH:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TIMESTAMP_FORMAT:
			case TIMESTAMP_ISO:
			case TIMESTAMP_TZ:
			case TO_CHAR:
			case TO_CLOB:
			case TO_DATE:
			case TO_NUMBER:
			case TOTALORDER:
			case TO_TIMESTAMP:
			case TRANSLATE:
			case TRIM:
			case TRIM_ARRAY:
			case TRUNC:
			case TRUNC_TIMESTAMP:
			case UCASE:
			case UNICODE:
			case UNICODE_STR:
			case UNISTR:
			case UPPER:
			case VARBINARY:
			case VARCHAR:
			case VARCHAR9:
			case VARCHAR_BIT_FORMAT:
			case VARCHAR_FORMAT:
			case VARGRAPHIC:
			case VERIFY_GROUP_FOR_USER:
			case VERIFY_ROLE_FOR_USER:
			case VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER:
			case WEEK:
			case WEEK_ISO:
			case WRAP:
			case XMLATTRIBUTES:
			case XMLCOMMENT:
			case XMLCONCAT:
			case XMLDOCUMENT:
			case XMLELEMENT:
			case XMLFOREST:
			case XMLMODIFY:
			case XMLPARSE:
			case XMLPI:
			case XMLQUERY:
			case XMLSERIALIZE:
			case XMLTEXT:
			case XMLXSROBJECTID:
			case XSLTRANSFORM:
			case CURRENT_ACCELERATOR:
			case CURRENT_APPLICATION_COMPATIBILITY:
			case CURRENT_APPLICATION_ENCODING_SCHEME:
			case CURRENT_CLIENT_ACCTNG:
			case CURRENT_CLIENT_APPLNAME:
			case CURRENT_CLIENT_CORR_TOKEN:
			case CURRENT_CLIENT_USERID:
			case CURRENT_CLIENT_WRKSTNNAME:
			case CURRENT_DATE:
			case CURRENT_DEBUG_MODE:
			case CURRENT_DECFLOAT_ROUNDING_MODE:
			case CURRENT_DEGREE:
			case CURRENT_EXPLAIN_MODE:
			case CURRENT_GET_ACCEL_ARCHIVE:
			case CURRENT_LOCALE_LC_CTYPE:
			case CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION:
			case CURRENT_MEMBER:
			case CURRENT_OPTIMIZATION_HINT:
			case CURRENT_PACKAGE_PATH:
			case CURRENT_PACKAGESET:
			case CURRENT_PATH:
			case CURRENT_PRECISION:
			case CURRENT_QUERY_ACCELERATION:
			case CURRENT_QUERY_ACCELERATION_WAITFORDATA:
			case CURRENT_REFRESH_AGE:
			case CURRENT_ROUTINE_VERSION:
			case CURRENT_RULES:
			case CURRENT_SCHEMA:
			case CURRENT_SERVER:
			case CURRENT_SQLID:
			case CURRENT_TEMPORAL_BUSINESS_TIME:
			case CURRENT_TEMPORAL_SYSTEM_TIME:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_TIME_ZONE:
			case ENCRYPTION_PASSWORD:
			case SESSION_TIME_ZONE:
			case SESSION_USER:
			case USER:
			case ADMIN_TASK_LIST:
			case ADMIN_TASK_OUTPUT:
			case ADMIN_TASK_STATUS:
			case BLOCKING_THREADS:
			case MQREADALL:
			case MQREADALLCLOB:
			case MQRECEIVEALL:
			case MQRECEIVEALLCLOB:
			case XMLTABLE:
			case SQLIDENTIFIER:
				{
				{
				setState(3127);
				selectColumns();
				setState(3132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3128);
					match(COMMA);
					setState(3129);
					selectColumns();
					}
					}
					setState(3134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class SubSelectContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public SubSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSubSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSubSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSubSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubSelectContext subSelect() throws RecognitionException {
		SubSelectContext _localctx = new SubSelectContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_subSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3137);
			selectClause();
			setState(3138);
			fromClause();
			setState(3140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(3139);
				whereClause();
				}
			}

			setState(3143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(3142);
				groupByClause();
				}
			}

			setState(3146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(3145);
				havingClause();
				}
			}

			setState(3149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
			case 1:
				{
				setState(3148);
				orderByClause();
				}
				break;
			}
			setState(3152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				{
				setState(3151);
				offsetClause();
				}
				break;
			}
			setState(3155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(3154);
				fetchClause();
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

	public static class SelectIntoStatementContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public List<CommonTableExpressionContext> commonTableExpression() {
			return getRuleContexts(CommonTableExpressionContext.class);
		}
		public CommonTableExpressionContext commonTableExpression(int i) {
			return getRuleContext(CommonTableExpressionContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public IsolationClauseContext isolationClause() {
			return getRuleContext(IsolationClauseContext.class,0);
		}
		public SkipLockedDataClauseContext skipLockedDataClause() {
			return getRuleContext(SkipLockedDataClauseContext.class,0);
		}
		public QuerynoClauseContext querynoClause() {
			return getRuleContext(QuerynoClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public SelectIntoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectIntoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSelectIntoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSelectIntoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSelectIntoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectIntoStatementContext selectIntoStatement() throws RecognitionException {
		SelectIntoStatementContext _localctx = new SelectIntoStatementContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_selectIntoStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3157);
				match(WITH);
				setState(3158);
				commonTableExpression();
				setState(3163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3159);
					match(COMMA);
					setState(3160);
					commonTableExpression();
					}
					}
					setState(3165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3168);
			selectClause();
			setState(3169);
			intoClause();
			setState(3170);
			fromClause();
			setState(3172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(3171);
				whereClause();
				}
			}

			setState(3175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(3174);
				groupByClause();
				}
			}

			setState(3178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(3177);
				havingClause();
				}
			}

			setState(3181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(3180);
				orderByClause();
				}
			}

			setState(3184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(3183);
				offsetClause();
				}
			}

			setState(3187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(3186);
				fetchClause();
				}
			}

			setState(3191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				{
				setState(3189);
				isolationClause();
				}
				break;
			case SKIP_:
				{
				setState(3190);
				skipLockedDataClause();
				}
				break;
			case EOF:
			case SEMICOLON:
			case END_EXEC:
			case QUERYNO:
				break;
			default:
				break;
			}
			setState(3194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUERYNO) {
				{
				setState(3193);
				querynoClause();
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

	public static class SelectStatementContext extends ParserRuleContext {
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public List<CommonTableExpressionContext> commonTableExpression() {
			return getRuleContexts(CommonTableExpressionContext.class);
		}
		public CommonTableExpressionContext commonTableExpression(int i) {
			return getRuleContext(CommonTableExpressionContext.class,i);
		}
		public List<UpdateClauseContext> updateClause() {
			return getRuleContexts(UpdateClauseContext.class);
		}
		public UpdateClauseContext updateClause(int i) {
			return getRuleContext(UpdateClauseContext.class,i);
		}
		public List<ReadOnlyClauseContext> readOnlyClause() {
			return getRuleContexts(ReadOnlyClauseContext.class);
		}
		public ReadOnlyClauseContext readOnlyClause(int i) {
			return getRuleContext(ReadOnlyClauseContext.class,i);
		}
		public List<OptimizeClauseContext> optimizeClause() {
			return getRuleContexts(OptimizeClauseContext.class);
		}
		public OptimizeClauseContext optimizeClause(int i) {
			return getRuleContext(OptimizeClauseContext.class,i);
		}
		public List<IsolationClauseContext> isolationClause() {
			return getRuleContexts(IsolationClauseContext.class);
		}
		public IsolationClauseContext isolationClause(int i) {
			return getRuleContext(IsolationClauseContext.class,i);
		}
		public List<SkipLockedDataClauseContext> skipLockedDataClause() {
			return getRuleContexts(SkipLockedDataClauseContext.class);
		}
		public SkipLockedDataClauseContext skipLockedDataClause(int i) {
			return getRuleContext(SkipLockedDataClauseContext.class,i);
		}
		public List<QuerynoClauseContext> querynoClause() {
			return getRuleContexts(QuerynoClauseContext.class);
		}
		public QuerynoClauseContext querynoClause(int i) {
			return getRuleContext(QuerynoClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3196);
				match(WITH);
				setState(3197);
				commonTableExpression();
				setState(3202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3198);
					match(COMMA);
					setState(3199);
					commonTableExpression();
					}
					}
					setState(3204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3207);
			fullSelect();
			setState(3216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR || _la==OPTIMIZE || _la==QUERYNO || _la==WITH || _la==SKIP_) {
				{
				setState(3214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
				case 1:
					{
					setState(3208);
					updateClause();
					}
					break;
				case 2:
					{
					setState(3209);
					readOnlyClause();
					}
					break;
				case 3:
					{
					setState(3210);
					optimizeClause();
					}
					break;
				case 4:
					{
					setState(3211);
					isolationClause();
					}
					break;
				case 5:
					{
					setState(3212);
					skipLockedDataClause();
					}
					break;
				case 6:
					{
					setState(3213);
					querynoClause();
					}
					break;
				}
				}
				setState(3218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonTableExpressionContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public CommonTableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonTableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterCommonTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitCommonTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitCommonTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonTableExpressionContext commonTableExpression() throws RecognitionException {
		CommonTableExpressionContext _localctx = new CommonTableExpressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_commonTableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3219);
			tableName();
			setState(3220);
			match(LPAREN);
			setState(3221);
			columnName();
			setState(3226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3222);
				match(COMMA);
				setState(3223);
				columnName();
				}
				}
				setState(3228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3229);
			match(RPAREN);
			setState(3230);
			match(AS);
			setState(3231);
			match(LPAREN);
			setState(3232);
			fullSelect();
			setState(3233);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(DB2zSQLParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(DB2zSQLParser.OF, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public UpdateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterUpdateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitUpdateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitUpdateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateClauseContext updateClause() throws RecognitionException {
		UpdateClauseContext _localctx = new UpdateClauseContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_updateClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3235);
			match(FOR);
			setState(3236);
			match(UPDATE);
			setState(3246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(3237);
				match(OF);
				setState(3238);
				columnName();
				setState(3243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3239);
					match(COMMA);
					setState(3240);
					columnName();
					}
					}
					setState(3245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ReadOnlyClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode READ() { return getToken(DB2zSQLParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(DB2zSQLParser.ONLY, 0); }
		public ReadOnlyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readOnlyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterReadOnlyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitReadOnlyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitReadOnlyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadOnlyClauseContext readOnlyClause() throws RecognitionException {
		ReadOnlyClauseContext _localctx = new ReadOnlyClauseContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_readOnlyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3248);
			match(FOR);
			setState(3249);
			match(READ);
			setState(3250);
			match(ONLY);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptimizeClauseContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(DB2zSQLParser.OPTIMIZE, 0); }
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(DB2zSQLParser.ROWS, 0); }
		public OptimizeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimizeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOptimizeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOptimizeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOptimizeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptimizeClauseContext optimizeClause() throws RecognitionException {
		OptimizeClauseContext _localctx = new OptimizeClauseContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_optimizeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3252);
			match(OPTIMIZE);
			setState(3253);
			match(FOR);
			setState(3254);
			match(INTEGERLITERAL);
			setState(3255);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
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

	public static class IsolationClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public TerminalNode CS() { return getToken(DB2zSQLParser.CS, 0); }
		public TerminalNode UR() { return getToken(DB2zSQLParser.UR, 0); }
		public TerminalNode RR() { return getToken(DB2zSQLParser.RR, 0); }
		public TerminalNode RS() { return getToken(DB2zSQLParser.RS, 0); }
		public LockClauseContext lockClause() {
			return getRuleContext(LockClauseContext.class,0);
		}
		public IsolationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isolationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterIsolationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitIsolationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitIsolationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsolationClauseContext isolationClause() throws RecognitionException {
		IsolationClauseContext _localctx = new IsolationClauseContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_isolationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3257);
			match(WITH);
			setState(3268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RR:
				{
				{
				setState(3258);
				match(RR);
				setState(3260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USE) {
					{
					setState(3259);
					lockClause();
					}
				}

				}
				}
				break;
			case RS:
				{
				{
				setState(3262);
				match(RS);
				setState(3264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USE) {
					{
					setState(3263);
					lockClause();
					}
				}

				}
				}
				break;
			case CS:
				{
				setState(3266);
				match(CS);
				}
				break;
			case UR:
				{
				setState(3267);
				match(UR);
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

	public static class LockClauseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(DB2zSQLParser.USE, 0); }
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public TerminalNode KEEP() { return getToken(DB2zSQLParser.KEEP, 0); }
		public TerminalNode LOCKS() { return getToken(DB2zSQLParser.LOCKS, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(DB2zSQLParser.EXCLUSIVE, 0); }
		public TerminalNode UPDATE() { return getToken(DB2zSQLParser.UPDATE, 0); }
		public TerminalNode SHARE() { return getToken(DB2zSQLParser.SHARE, 0); }
		public LockClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterLockClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitLockClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitLockClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockClauseContext lockClause() throws RecognitionException {
		LockClauseContext _localctx = new LockClauseContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_lockClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3270);
			match(USE);
			setState(3271);
			match(AND);
			setState(3272);
			match(KEEP);
			setState(3273);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==EXCLUSIVE || _la==SHARE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3274);
			match(LOCKS);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipLockedDataClauseContext extends ParserRuleContext {
		public TerminalNode SKIP_() { return getToken(DB2zSQLParser.SKIP_, 0); }
		public TerminalNode LOCKED() { return getToken(DB2zSQLParser.LOCKED, 0); }
		public TerminalNode DATA() { return getToken(DB2zSQLParser.DATA, 0); }
		public SkipLockedDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipLockedDataClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSkipLockedDataClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSkipLockedDataClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSkipLockedDataClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipLockedDataClauseContext skipLockedDataClause() throws RecognitionException {
		SkipLockedDataClauseContext _localctx = new SkipLockedDataClauseContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_skipLockedDataClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3276);
			match(SKIP_);
			setState(3277);
			match(LOCKED);
			setState(3278);
			match(DATA);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerynoClauseContext extends ParserRuleContext {
		public TerminalNode QUERYNO() { return getToken(DB2zSQLParser.QUERYNO, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public QuerynoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querynoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterQuerynoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitQuerynoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitQuerynoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerynoClauseContext querynoClause() throws RecognitionException {
		QuerynoClauseContext _localctx = new QuerynoClauseContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_querynoClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3280);
			match(QUERYNO);
			setState(3281);
			match(INTEGERLITERAL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarFullSelectContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public FullSelectContext fullSelect() {
			return getRuleContext(FullSelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public ScalarFullSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarFullSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterScalarFullSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitScalarFullSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitScalarFullSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarFullSelectContext scalarFullSelect() throws RecognitionException {
		ScalarFullSelectContext _localctx = new ScalarFullSelectContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_scalarFullSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3283);
			match(LPAREN);
			setState(3284);
			fullSelect();
			setState(3285);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullSelectContext extends ParserRuleContext {
		public List<SubSelectContext> subSelect() {
			return getRuleContexts(SubSelectContext.class);
		}
		public SubSelectContext subSelect(int i) {
			return getRuleContext(SubSelectContext.class,i);
		}
		public ValuesClauseContext valuesClause() {
			return getRuleContext(ValuesClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DB2zSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DB2zSQLParser.LPAREN, i);
		}
		public List<FullSelectContext> fullSelect() {
			return getRuleContexts(FullSelectContext.class);
		}
		public FullSelectContext fullSelect(int i) {
			return getRuleContext(FullSelectContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DB2zSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DB2zSQLParser.RPAREN, i);
		}
		public List<TerminalNode> UNION() { return getTokens(DB2zSQLParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(DB2zSQLParser.UNION, i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(DB2zSQLParser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(DB2zSQLParser.EXCEPT, i);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(DB2zSQLParser.INTERSECT); }
		public TerminalNode INTERSECT(int i) {
			return getToken(DB2zSQLParser.INTERSECT, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(DB2zSQLParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(DB2zSQLParser.DISTINCT, i);
		}
		public List<TerminalNode> ALL() { return getTokens(DB2zSQLParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(DB2zSQLParser.ALL, i);
		}
		public FullSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFullSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFullSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFullSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullSelectContext fullSelect() throws RecognitionException {
		FullSelectContext _localctx = new FullSelectContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_fullSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(3287);
				match(LPAREN);
				setState(3288);
				fullSelect();
				setState(3289);
				match(RPAREN);
				}
				}
				break;
			case SELECT:
				{
				setState(3291);
				subSelect();
				}
				break;
			case VALUES:
				{
				setState(3292);
				valuesClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCEPT || _la==INTERSECT || _la==UNION) {
				{
				{
				setState(3295);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(3296);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(3304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(3299);
					subSelect();
					}
					break;
				case LPAREN:
					{
					{
					setState(3300);
					match(LPAREN);
					setState(3301);
					fullSelect();
					setState(3302);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(3310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(3311);
				orderByClause();
				}
			}

			setState(3315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(3314);
				offsetClause();
				}
			}

			setState(3318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(3317);
				fetchClause();
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

	public static class ValuesClauseContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(DB2zSQLParser.VALUES, 0); }
		public List<SequenceReferenceContext> sequenceReference() {
			return getRuleContexts(SequenceReferenceContext.class);
		}
		public SequenceReferenceContext sequenceReference(int i) {
			return getRuleContext(SequenceReferenceContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(DB2zSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DB2zSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public ValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterValuesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitValuesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesClauseContext valuesClause() throws RecognitionException {
		ValuesClauseContext _localctx = new ValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_valuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3320);
			match(VALUES);
			setState(3333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
			case PREVIOUS:
				{
				setState(3321);
				sequenceReference();
				}
				break;
			case LPAREN:
				{
				{
				setState(3322);
				match(LPAREN);
				setState(3323);
				sequenceReference();
				setState(3328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3324);
					match(COMMA);
					setState(3325);
					sequenceReference();
					}
					}
					setState(3330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3331);
				match(RPAREN);
				}
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public List<TerminalNode> ORDER() { return getTokens(DB2zSQLParser.ORDER); }
		public TerminalNode ORDER(int i) {
			return getToken(DB2zSQLParser.ORDER, i);
		}
		public TerminalNode BY() { return getToken(DB2zSQLParser.BY, 0); }
		public List<SortKeyContext> sortKey() {
			return getRuleContexts(SortKeyContext.class);
		}
		public SortKeyContext sortKey(int i) {
			return getRuleContext(SortKeyContext.class,i);
		}
		public TerminalNode INPUT() { return getToken(DB2zSQLParser.INPUT, 0); }
		public TerminalNode SEQUENCE() { return getToken(DB2zSQLParser.SEQUENCE, 0); }
		public TerminalNode OF() { return getToken(DB2zSQLParser.OF, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DB2zSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DB2zSQLParser.COMMA, i);
		}
		public List<TerminalNode> ASC() { return getTokens(DB2zSQLParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(DB2zSQLParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(DB2zSQLParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(DB2zSQLParser.DESC, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3335);
			match(ORDER);
			setState(3336);
			match(BY);
			setState(3356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
			case 1:
				{
				{
				setState(3337);
				sortKey();
				setState(3339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(3338);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(3348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3341);
					match(COMMA);
					setState(3342);
					sortKey();
					setState(3344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASC || _la==DESC) {
						{
						setState(3343);
						_la = _input.LA(1);
						if ( !(_la==ASC || _la==DESC) ) {
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
					}
					setState(3350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(3351);
				match(INPUT);
				setState(3352);
				match(SEQUENCE);
				}
				}
				break;
			case 3:
				{
				{
				setState(3353);
				match(ORDER);
				setState(3354);
				match(OF);
				setState(3355);
				tableName();
				}
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

	public static class SortKeyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SortKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSortKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSortKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSortKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortKeyContext sortKey() throws RecognitionException {
		SortKeyContext _localctx = new SortKeyContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_sortKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				{
				setState(3358);
				columnName();
				}
				break;
			case 2:
				{
				setState(3359);
				match(INTEGERLITERAL);
				}
				break;
			case 3:
				{
				setState(3360);
				expression();
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

	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(DB2zSQLParser.OFFSET, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(DB2zSQLParser.ROWS, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3363);
			match(OFFSET);
			setState(3364);
			match(INTEGERLITERAL);
			setState(3365);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
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

	public static class FetchClauseContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(DB2zSQLParser.FETCH, 0); }
		public TerminalNode ONLY() { return getToken(DB2zSQLParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(DB2zSQLParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(DB2zSQLParser.NEXT, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(DB2zSQLParser.ROWS, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(DB2zSQLParser.INTEGERLITERAL, 0); }
		public FetchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterFetchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitFetchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitFetchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchClauseContext fetchClause() throws RecognitionException {
		FetchClauseContext _localctx = new FetchClauseContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3367);
			match(FETCH);
			setState(3368);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGERLITERAL) {
				{
				setState(3369);
				match(INTEGERLITERAL);
				}
			}

			setState(3372);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3373);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode SQLIDENTIFIER() { return getToken(DB2zSQLParser.SQLIDENTIFIER, 0); }
		public SqlKeywordContext sqlKeyword() {
			return getRuleContext(SqlKeywordContext.class,0);
		}
		public SpecialRegisterContext specialRegister() {
			return getRuleContext(SpecialRegisterContext.class,0);
		}
		public ScalarFunctionContext scalarFunction() {
			return getRuleContext(ScalarFunctionContext.class,0);
		}
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public RegressionFunctionContext regressionFunction() {
			return getRuleContext(RegressionFunctionContext.class,0);
		}
		public TableFunctionContext tableFunction() {
			return getRuleContext(TableFunctionContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_identifier);
		try {
			setState(3382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3375);
				match(SQLIDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3376);
				sqlKeyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3377);
				specialRegister();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3378);
				scalarFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3379);
				aggregateFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3380);
				regressionFunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3381);
				tableFunction();
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

	public static class SqlKeywordContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(DB2zSQLParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(DB2zSQLParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(DB2zSQLParser.ALL, 0); }
		public TerminalNode ALLOCATE() { return getToken(DB2zSQLParser.ALLOCATE, 0); }
		public TerminalNode ALLOW() { return getToken(DB2zSQLParser.ALLOW, 0); }
		public TerminalNode ALTERAND() { return getToken(DB2zSQLParser.ALTERAND, 0); }
		public TerminalNode ANY() { return getToken(DB2zSQLParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(DB2zSQLParser.ARRAY, 0); }
		public TerminalNode ARRAY_EXISTS() { return getToken(DB2zSQLParser.ARRAY_EXISTS, 0); }
		public TerminalNode AS() { return getToken(DB2zSQLParser.AS, 0); }
		public TerminalNode ASENSITIVE() { return getToken(DB2zSQLParser.ASENSITIVE, 0); }
		public TerminalNode ASSOCIATE() { return getToken(DB2zSQLParser.ASSOCIATE, 0); }
		public TerminalNode ASUTIME() { return getToken(DB2zSQLParser.ASUTIME, 0); }
		public TerminalNode AT() { return getToken(DB2zSQLParser.AT, 0); }
		public TerminalNode AUDIT() { return getToken(DB2zSQLParser.AUDIT, 0); }
		public TerminalNode AUX() { return getToken(DB2zSQLParser.AUX, 0); }
		public TerminalNode AUXILIARY() { return getToken(DB2zSQLParser.AUXILIARY, 0); }
		public TerminalNode BEFORE() { return getToken(DB2zSQLParser.BEFORE, 0); }
		public TerminalNode BEGIN() { return getToken(DB2zSQLParser.BEGIN, 0); }
		public TerminalNode BETWEEN() { return getToken(DB2zSQLParser.BETWEEN, 0); }
		public TerminalNode BUFFERPOOL() { return getToken(DB2zSQLParser.BUFFERPOOL, 0); }
		public TerminalNode BY() { return getToken(DB2zSQLParser.BY, 0); }
		public TerminalNode CALL() { return getToken(DB2zSQLParser.CALL, 0); }
		public TerminalNode CAPTURE() { return getToken(DB2zSQLParser.CAPTURE, 0); }
		public TerminalNode CASCADED() { return getToken(DB2zSQLParser.CASCADED, 0); }
		public TerminalNode CASE() { return getToken(DB2zSQLParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(DB2zSQLParser.CAST, 0); }
		public TerminalNode CCSID() { return getToken(DB2zSQLParser.CCSID, 0); }
		public TerminalNode CHAR() { return getToken(DB2zSQLParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(DB2zSQLParser.CHARACTER, 0); }
		public TerminalNode CHECK() { return getToken(DB2zSQLParser.CHECK, 0); }
		public TerminalNode CLONE() { return getToken(DB2zSQLParser.CLONE, 0); }
		public TerminalNode CLOSE() { return getToken(DB2zSQLParser.CLOSE, 0); }
		public TerminalNode CLUSTER() { return getToken(DB2zSQLParser.CLUSTER, 0); }
		public TerminalNode COLLECTION() { return getToken(DB2zSQLParser.COLLECTION, 0); }
		public TerminalNode COLLID() { return getToken(DB2zSQLParser.COLLID, 0); }
		public TerminalNode COLUMN() { return getToken(DB2zSQLParser.COLUMN, 0); }
		public TerminalNode COMMENT() { return getToken(DB2zSQLParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(DB2zSQLParser.COMMIT, 0); }
		public TerminalNode CONCAT() { return getToken(DB2zSQLParser.CONCAT, 0); }
		public TerminalNode CONDITION() { return getToken(DB2zSQLParser.CONDITION, 0); }
		public TerminalNode CONNECT() { return getToken(DB2zSQLParser.CONNECT, 0); }
		public TerminalNode CONNECTION() { return getToken(DB2zSQLParser.CONNECTION, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DB2zSQLParser.CONSTRAINT, 0); }
		public TerminalNode CONTAINS() { return getToken(DB2zSQLParser.CONTAINS, 0); }
		public TerminalNode CONTENT() { return getToken(DB2zSQLParser.CONTENT, 0); }
		public TerminalNode CONTINUE() { return getToken(DB2zSQLParser.CONTINUE, 0); }
		public TerminalNode CREATE() { return getToken(DB2zSQLParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(DB2zSQLParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(DB2zSQLParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(DB2zSQLParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_LC_CTYPE() { return getToken(DB2zSQLParser.CURRENT_LC_CTYPE, 0); }
		public TerminalNode CURRENT_PATH() { return getToken(DB2zSQLParser.CURRENT_PATH, 0); }
		public TerminalNode CURRENT_SCHEMA() { return getToken(DB2zSQLParser.CURRENT_SCHEMA, 0); }
		public TerminalNode CURRENT_SERVER() { return getToken(DB2zSQLParser.CURRENT_SERVER, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(DB2zSQLParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DB2zSQLParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_TIME_ZONE() { return getToken(DB2zSQLParser.CURRENT_TIME_ZONE, 0); }
		public TerminalNode CURRVAL() { return getToken(DB2zSQLParser.CURRVAL, 0); }
		public TerminalNode CURSOR() { return getToken(DB2zSQLParser.CURSOR, 0); }
		public TerminalNode DATA() { return getToken(DB2zSQLParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(DB2zSQLParser.DATABASE, 0); }
		public TerminalNode DAY() { return getToken(DB2zSQLParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(DB2zSQLParser.DAYS, 0); }
		public TerminalNode DBINFO() { return getToken(DB2zSQLParser.DBINFO, 0); }
		public TerminalNode DECLARE() { return getToken(DB2zSQLParser.DECLARE, 0); }
		public TerminalNode DEFAULT() { return getToken(DB2zSQLParser.DEFAULT, 0); }
		public TerminalNode DELETE() { return getToken(DB2zSQLParser.DELETE, 0); }
		public TerminalNode DESCRIPTOR() { return getToken(DB2zSQLParser.DESCRIPTOR, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(DB2zSQLParser.DETERMINISTIC, 0); }
		public TerminalNode DISABLE() { return getToken(DB2zSQLParser.DISABLE, 0); }
		public TerminalNode DISALLOW() { return getToken(DB2zSQLParser.DISALLOW, 0); }
		public TerminalNode DISTINCT() { return getToken(DB2zSQLParser.DISTINCT, 0); }
		public TerminalNode DO() { return getToken(DB2zSQLParser.DO, 0); }
		public TerminalNode DOCUMENT() { return getToken(DB2zSQLParser.DOCUMENT, 0); }
		public TerminalNode DOUBLE() { return getToken(DB2zSQLParser.DOUBLE, 0); }
		public TerminalNode DROP() { return getToken(DB2zSQLParser.DROP, 0); }
		public TerminalNode DSSIZE() { return getToken(DB2zSQLParser.DSSIZE, 0); }
		public TerminalNode DYNAMIC() { return getToken(DB2zSQLParser.DYNAMIC, 0); }
		public TerminalNode EDITPROC() { return getToken(DB2zSQLParser.EDITPROC, 0); }
		public TerminalNode ELSE() { return getToken(DB2zSQLParser.ELSE, 0); }
		public TerminalNode ELSEIF() { return getToken(DB2zSQLParser.ELSEIF, 0); }
		public TerminalNode ENCODING() { return getToken(DB2zSQLParser.ENCODING, 0); }
		public TerminalNode ENCRYPTION() { return getToken(DB2zSQLParser.ENCRYPTION, 0); }
		public TerminalNode END() { return getToken(DB2zSQLParser.END, 0); }
		public TerminalNode END_EXEC() { return getToken(DB2zSQLParser.END_EXEC, 0); }
		public TerminalNode ENDING() { return getToken(DB2zSQLParser.ENDING, 0); }
		public TerminalNode ERASE() { return getToken(DB2zSQLParser.ERASE, 0); }
		public TerminalNode ESCAPE() { return getToken(DB2zSQLParser.ESCAPE, 0); }
		public TerminalNode EXCEPT() { return getToken(DB2zSQLParser.EXCEPT, 0); }
		public TerminalNode EXCEPTION() { return getToken(DB2zSQLParser.EXCEPTION, 0); }
		public TerminalNode EXEC_SQL() { return getToken(DB2zSQLParser.EXEC_SQL, 0); }
		public TerminalNode EXECUTE() { return getToken(DB2zSQLParser.EXECUTE, 0); }
		public TerminalNode EXISTS() { return getToken(DB2zSQLParser.EXISTS, 0); }
		public TerminalNode EXIT() { return getToken(DB2zSQLParser.EXIT, 0); }
		public TerminalNode EXPLAIN() { return getToken(DB2zSQLParser.EXPLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(DB2zSQLParser.EXTERNAL, 0); }
		public TerminalNode FENCED() { return getToken(DB2zSQLParser.FENCED, 0); }
		public TerminalNode FETCH() { return getToken(DB2zSQLParser.FETCH, 0); }
		public TerminalNode FIELDPROC() { return getToken(DB2zSQLParser.FIELDPROC, 0); }
		public TerminalNode FINAL() { return getToken(DB2zSQLParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(DB2zSQLParser.FIRST, 0); }
		public TerminalNode FOR() { return getToken(DB2zSQLParser.FOR, 0); }
		public TerminalNode FREE() { return getToken(DB2zSQLParser.FREE, 0); }
		public TerminalNode FROM() { return getToken(DB2zSQLParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(DB2zSQLParser.FULL, 0); }
		public TerminalNode FUNCTION() { return getToken(DB2zSQLParser.FUNCTION, 0); }
		public TerminalNode GENERATED() { return getToken(DB2zSQLParser.GENERATED, 0); }
		public TerminalNode GET() { return getToken(DB2zSQLParser.GET, 0); }
		public TerminalNode GLOBAL() { return getToken(DB2zSQLParser.GLOBAL, 0); }
		public TerminalNode GO() { return getToken(DB2zSQLParser.GO, 0); }
		public TerminalNode GOTO() { return getToken(DB2zSQLParser.GOTO, 0); }
		public TerminalNode GRANT() { return getToken(DB2zSQLParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(DB2zSQLParser.GROUP, 0); }
		public TerminalNode HANDLER() { return getToken(DB2zSQLParser.HANDLER, 0); }
		public TerminalNode HAVING() { return getToken(DB2zSQLParser.HAVING, 0); }
		public TerminalNode HOLD() { return getToken(DB2zSQLParser.HOLD, 0); }
		public TerminalNode HOUR() { return getToken(DB2zSQLParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(DB2zSQLParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(DB2zSQLParser.IF, 0); }
		public TerminalNode IMMEDIATE() { return getToken(DB2zSQLParser.IMMEDIATE, 0); }
		public TerminalNode IN() { return getToken(DB2zSQLParser.IN, 0); }
		public TerminalNode INCLUSIVE() { return getToken(DB2zSQLParser.INCLUSIVE, 0); }
		public TerminalNode INDEX() { return getToken(DB2zSQLParser.INDEX, 0); }
		public TerminalNode INHERIT() { return getToken(DB2zSQLParser.INHERIT, 0); }
		public TerminalNode INNER() { return getToken(DB2zSQLParser.INNER, 0); }
		public TerminalNode INOUT() { return getToken(DB2zSQLParser.INOUT, 0); }
		public TerminalNode INSENSITIVE() { return getToken(DB2zSQLParser.INSENSITIVE, 0); }
		public TerminalNode INSERT() { return getToken(DB2zSQLParser.INSERT, 0); }
		public TerminalNode INTERSECT() { return getToken(DB2zSQLParser.INTERSECT, 0); }
		public TerminalNode INTO() { return getToken(DB2zSQLParser.INTO, 0); }
		public TerminalNode IS() { return getToken(DB2zSQLParser.IS, 0); }
		public TerminalNode ISOBID() { return getToken(DB2zSQLParser.ISOBID, 0); }
		public TerminalNode ITERATE() { return getToken(DB2zSQLParser.ITERATE, 0); }
		public TerminalNode JAR() { return getToken(DB2zSQLParser.JAR, 0); }
		public TerminalNode JOIN() { return getToken(DB2zSQLParser.JOIN, 0); }
		public TerminalNode KEEP() { return getToken(DB2zSQLParser.KEEP, 0); }
		public TerminalNode KEY() { return getToken(DB2zSQLParser.KEY, 0); }
		public TerminalNode LABEL() { return getToken(DB2zSQLParser.LABEL, 0); }
		public TerminalNode LANGUAGE() { return getToken(DB2zSQLParser.LANGUAGE, 0); }
		public TerminalNode LAST() { return getToken(DB2zSQLParser.LAST, 0); }
		public TerminalNode LC_CTYPE() { return getToken(DB2zSQLParser.LC_CTYPE, 0); }
		public TerminalNode LEAVE() { return getToken(DB2zSQLParser.LEAVE, 0); }
		public TerminalNode LEFT() { return getToken(DB2zSQLParser.LEFT, 0); }
		public TerminalNode LIKE() { return getToken(DB2zSQLParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(DB2zSQLParser.LIMIT, 0); }
		public TerminalNode LOCAL() { return getToken(DB2zSQLParser.LOCAL, 0); }
		public TerminalNode LOCALE() { return getToken(DB2zSQLParser.LOCALE, 0); }
		public TerminalNode LOCATOR() { return getToken(DB2zSQLParser.LOCATOR, 0); }
		public TerminalNode LOCATORS() { return getToken(DB2zSQLParser.LOCATORS, 0); }
		public TerminalNode LOCK() { return getToken(DB2zSQLParser.LOCK, 0); }
		public TerminalNode LOCKMAX() { return getToken(DB2zSQLParser.LOCKMAX, 0); }
		public TerminalNode LOCKSIZE() { return getToken(DB2zSQLParser.LOCKSIZE, 0); }
		public TerminalNode LONG() { return getToken(DB2zSQLParser.LONG, 0); }
		public TerminalNode LOOP() { return getToken(DB2zSQLParser.LOOP, 0); }
		public TerminalNode MAINTAINED() { return getToken(DB2zSQLParser.MAINTAINED, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DB2zSQLParser.MATERIALIZED, 0); }
		public TerminalNode MICROSECOND() { return getToken(DB2zSQLParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(DB2zSQLParser.MICROSECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(DB2zSQLParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(DB2zSQLParser.MINUTES, 0); }
		public TerminalNode MODIFIES() { return getToken(DB2zSQLParser.MODIFIES, 0); }
		public TerminalNode MONTH() { return getToken(DB2zSQLParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(DB2zSQLParser.MONTHS, 0); }
		public TerminalNode NEXT() { return getToken(DB2zSQLParser.NEXT, 0); }
		public TerminalNode NEXTVAL() { return getToken(DB2zSQLParser.NEXTVAL, 0); }
		public TerminalNode NO() { return getToken(DB2zSQLParser.NO, 0); }
		public TerminalNode NONE() { return getToken(DB2zSQLParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(DB2zSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(DB2zSQLParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(DB2zSQLParser.NULLS, 0); }
		public TerminalNode NUMPARTS() { return getToken(DB2zSQLParser.NUMPARTS, 0); }
		public TerminalNode OBID() { return getToken(DB2zSQLParser.OBID, 0); }
		public TerminalNode OF() { return getToken(DB2zSQLParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(DB2zSQLParser.OFFSET, 0); }
		public TerminalNode OLD() { return getToken(DB2zSQLParser.OLD, 0); }
		public TerminalNode ON() { return getToken(DB2zSQLParser.ON, 0); }
		public TerminalNode OPEN() { return getToken(DB2zSQLParser.OPEN, 0); }
		public TerminalNode OPTIMIZATION() { return getToken(DB2zSQLParser.OPTIMIZATION, 0); }
		public TerminalNode OPTIMIZE() { return getToken(DB2zSQLParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(DB2zSQLParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(DB2zSQLParser.ORDER, 0); }
		public TerminalNode ORGANIZATION() { return getToken(DB2zSQLParser.ORGANIZATION, 0); }
		public TerminalNode OUT() { return getToken(DB2zSQLParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(DB2zSQLParser.OUTER, 0); }
		public TerminalNode PACKAGE() { return getToken(DB2zSQLParser.PACKAGE, 0); }
		public TerminalNode PADDED() { return getToken(DB2zSQLParser.PADDED, 0); }
		public TerminalNode PARAMETER() { return getToken(DB2zSQLParser.PARAMETER, 0); }
		public TerminalNode PART() { return getToken(DB2zSQLParser.PART, 0); }
		public TerminalNode PARTITION() { return getToken(DB2zSQLParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(DB2zSQLParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONING() { return getToken(DB2zSQLParser.PARTITIONING, 0); }
		public TerminalNode PATH() { return getToken(DB2zSQLParser.PATH, 0); }
		public TerminalNode PERIOD() { return getToken(DB2zSQLParser.PERIOD, 0); }
		public TerminalNode PIECESIZE() { return getToken(DB2zSQLParser.PIECESIZE, 0); }
		public TerminalNode PLAN() { return getToken(DB2zSQLParser.PLAN, 0); }
		public TerminalNode PRECISION() { return getToken(DB2zSQLParser.PRECISION, 0); }
		public TerminalNode PREPARE() { return getToken(DB2zSQLParser.PREPARE, 0); }
		public TerminalNode PREVVAL() { return getToken(DB2zSQLParser.PREVVAL, 0); }
		public TerminalNode PRIOR() { return getToken(DB2zSQLParser.PRIOR, 0); }
		public TerminalNode PRIQTY() { return getToken(DB2zSQLParser.PRIQTY, 0); }
		public TerminalNode PRIVILEGES() { return getToken(DB2zSQLParser.PRIVILEGES, 0); }
		public TerminalNode PROCEDURE() { return getToken(DB2zSQLParser.PROCEDURE, 0); }
		public TerminalNode PROGRAM() { return getToken(DB2zSQLParser.PROGRAM, 0); }
		public TerminalNode PSID() { return getToken(DB2zSQLParser.PSID, 0); }
		public TerminalNode PUBLIC() { return getToken(DB2zSQLParser.PUBLIC, 0); }
		public TerminalNode QUERY() { return getToken(DB2zSQLParser.QUERY, 0); }
		public TerminalNode QUERYNO() { return getToken(DB2zSQLParser.QUERYNO, 0); }
		public TerminalNode READS() { return getToken(DB2zSQLParser.READS, 0); }
		public TerminalNode REFERENCES() { return getToken(DB2zSQLParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(DB2zSQLParser.REFRESH, 0); }
		public TerminalNode RELEASE() { return getToken(DB2zSQLParser.RELEASE, 0); }
		public TerminalNode RENAME() { return getToken(DB2zSQLParser.RENAME, 0); }
		public TerminalNode REPEAT() { return getToken(DB2zSQLParser.REPEAT, 0); }
		public TerminalNode RESIGNAL() { return getToken(DB2zSQLParser.RESIGNAL, 0); }
		public TerminalNode RESTRICT() { return getToken(DB2zSQLParser.RESTRICT, 0); }
		public TerminalNode RESULT() { return getToken(DB2zSQLParser.RESULT, 0); }
		public TerminalNode RESULT_SET_LOCATOR() { return getToken(DB2zSQLParser.RESULT_SET_LOCATOR, 0); }
		public TerminalNode RETURN() { return getToken(DB2zSQLParser.RETURN, 0); }
		public TerminalNode RETURNS() { return getToken(DB2zSQLParser.RETURNS, 0); }
		public TerminalNode REVOKE() { return getToken(DB2zSQLParser.REVOKE, 0); }
		public TerminalNode RIGHT() { return getToken(DB2zSQLParser.RIGHT, 0); }
		public TerminalNode ROLE() { return getToken(DB2zSQLParser.ROLE, 0); }
		public TerminalNode ROLLBACK() { return getToken(DB2zSQLParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(DB2zSQLParser.ROLLUP, 0); }
		public TerminalNode ROUND_CEILING() { return getToken(DB2zSQLParser.ROUND_CEILING, 0); }
		public TerminalNode ROUND_DOWN() { return getToken(DB2zSQLParser.ROUND_DOWN, 0); }
		public TerminalNode ROUND_FLOOR() { return getToken(DB2zSQLParser.ROUND_FLOOR, 0); }
		public TerminalNode ROUND_HALF_DOWN() { return getToken(DB2zSQLParser.ROUND_HALF_DOWN, 0); }
		public TerminalNode ROUND_HALF_EVEN() { return getToken(DB2zSQLParser.ROUND_HALF_EVEN, 0); }
		public TerminalNode ROUND_HALF_UP() { return getToken(DB2zSQLParser.ROUND_HALF_UP, 0); }
		public TerminalNode ROUND_UP() { return getToken(DB2zSQLParser.ROUND_UP, 0); }
		public TerminalNode ROW() { return getToken(DB2zSQLParser.ROW, 0); }
		public TerminalNode ROWSET() { return getToken(DB2zSQLParser.ROWSET, 0); }
		public TerminalNode RUN() { return getToken(DB2zSQLParser.RUN, 0); }
		public TerminalNode SAVEPOINT() { return getToken(DB2zSQLParser.SAVEPOINT, 0); }
		public TerminalNode SCHEMA() { return getToken(DB2zSQLParser.SCHEMA, 0); }
		public TerminalNode SCRATCHPAD() { return getToken(DB2zSQLParser.SCRATCHPAD, 0); }
		public TerminalNode SECOND() { return getToken(DB2zSQLParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(DB2zSQLParser.SECONDS, 0); }
		public TerminalNode SECQTY() { return getToken(DB2zSQLParser.SECQTY, 0); }
		public TerminalNode SECURITY() { return getToken(DB2zSQLParser.SECURITY, 0); }
		public TerminalNode SELECT() { return getToken(DB2zSQLParser.SELECT, 0); }
		public TerminalNode SENSITIVE() { return getToken(DB2zSQLParser.SENSITIVE, 0); }
		public TerminalNode SEQUENCE() { return getToken(DB2zSQLParser.SEQUENCE, 0); }
		public TerminalNode SESSION_USER() { return getToken(DB2zSQLParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(DB2zSQLParser.SET, 0); }
		public TerminalNode SIGNAL() { return getToken(DB2zSQLParser.SIGNAL, 0); }
		public TerminalNode SIMPLE() { return getToken(DB2zSQLParser.SIMPLE, 0); }
		public TerminalNode SOME() { return getToken(DB2zSQLParser.SOME, 0); }
		public TerminalNode SOURCE() { return getToken(DB2zSQLParser.SOURCE, 0); }
		public TerminalNode SPECIFIC() { return getToken(DB2zSQLParser.SPECIFIC, 0); }
		public TerminalNode STANDARD() { return getToken(DB2zSQLParser.STANDARD, 0); }
		public TerminalNode STATEMENT() { return getToken(DB2zSQLParser.STATEMENT, 0); }
		public TerminalNode STATIC() { return getToken(DB2zSQLParser.STATIC, 0); }
		public TerminalNode STAY() { return getToken(DB2zSQLParser.STAY, 0); }
		public TerminalNode STOGROUP() { return getToken(DB2zSQLParser.STOGROUP, 0); }
		public TerminalNode STORES() { return getToken(DB2zSQLParser.STORES, 0); }
		public TerminalNode STYLE() { return getToken(DB2zSQLParser.STYLE, 0); }
		public TerminalNode SUMMARY() { return getToken(DB2zSQLParser.SUMMARY, 0); }
		public TerminalNode SYNONYM() { return getToken(DB2zSQLParser.SYNONYM, 0); }
		public TerminalNode SYSDATE() { return getToken(DB2zSQLParser.SYSDATE, 0); }
		public TerminalNode SYSTEM() { return getToken(DB2zSQLParser.SYSTEM, 0); }
		public TerminalNode SYSTIMESTAMP() { return getToken(DB2zSQLParser.SYSTIMESTAMP, 0); }
		public TerminalNode TABLE() { return getToken(DB2zSQLParser.TABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(DB2zSQLParser.TABLESPACE, 0); }
		public TerminalNode THEN() { return getToken(DB2zSQLParser.THEN, 0); }
		public TerminalNode TO() { return getToken(DB2zSQLParser.TO, 0); }
		public TerminalNode TRIGGER() { return getToken(DB2zSQLParser.TRIGGER, 0); }
		public TerminalNode TRUNCATE() { return getToken(DB2zSQLParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(DB2zSQLParser.TYPE, 0); }
		public TerminalNode UNDO() { return getToken(DB2zSQLParser.UNDO, 0); }
		public TerminalNode UNION() { return getToken(DB2zSQLParser.UNION, 0); }
		public TerminalNode UNIQUE() { return getToken(DB2zSQLParser.UNIQUE, 0); }
		public TerminalNode UNTIL() { return getToken(DB2zSQLParser.UNTIL, 0); }
		public TerminalNode UPDATE() { return getToken(DB2zSQLParser.UPDATE, 0); }
		public TerminalNode USER() { return getToken(DB2zSQLParser.USER, 0); }
		public TerminalNode USING() { return getToken(DB2zSQLParser.USING, 0); }
		public TerminalNode VALIDPROC() { return getToken(DB2zSQLParser.VALIDPROC, 0); }
		public TerminalNode VALUE() { return getToken(DB2zSQLParser.VALUE, 0); }
		public TerminalNode VALUES() { return getToken(DB2zSQLParser.VALUES, 0); }
		public TerminalNode VARIABLE() { return getToken(DB2zSQLParser.VARIABLE, 0); }
		public TerminalNode VARIANT() { return getToken(DB2zSQLParser.VARIANT, 0); }
		public TerminalNode VCAT() { return getToken(DB2zSQLParser.VCAT, 0); }
		public TerminalNode VERSIONING() { return getToken(DB2zSQLParser.VERSIONING, 0); }
		public TerminalNode VIEW() { return getToken(DB2zSQLParser.VIEW, 0); }
		public TerminalNode VOLATILE() { return getToken(DB2zSQLParser.VOLATILE, 0); }
		public TerminalNode VOLUMES() { return getToken(DB2zSQLParser.VOLUMES, 0); }
		public TerminalNode WHEN() { return getToken(DB2zSQLParser.WHEN, 0); }
		public TerminalNode WHENEVER() { return getToken(DB2zSQLParser.WHENEVER, 0); }
		public TerminalNode WHERE() { return getToken(DB2zSQLParser.WHERE, 0); }
		public TerminalNode WHILE() { return getToken(DB2zSQLParser.WHILE, 0); }
		public TerminalNode WITH() { return getToken(DB2zSQLParser.WITH, 0); }
		public TerminalNode WLM() { return getToken(DB2zSQLParser.WLM, 0); }
		public TerminalNode XMLCAST() { return getToken(DB2zSQLParser.XMLCAST, 0); }
		public TerminalNode XMLEXISTS() { return getToken(DB2zSQLParser.XMLEXISTS, 0); }
		public TerminalNode XMLNAMESPACES() { return getToken(DB2zSQLParser.XMLNAMESPACES, 0); }
		public TerminalNode YEAR() { return getToken(DB2zSQLParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(DB2zSQLParser.YEARS, 0); }
		public TerminalNode ZONE() { return getToken(DB2zSQLParser.ZONE, 0); }
		public TerminalNode AND() { return getToken(DB2zSQLParser.AND, 0); }
		public TerminalNode ARRAY_AGG() { return getToken(DB2zSQLParser.ARRAY_AGG, 0); }
		public TerminalNode ASC() { return getToken(DB2zSQLParser.ASC, 0); }
		public TerminalNode AVG() { return getToken(DB2zSQLParser.AVG, 0); }
		public TerminalNode BIT() { return getToken(DB2zSQLParser.BIT, 0); }
		public TerminalNode CHANGE() { return getToken(DB2zSQLParser.CHANGE, 0); }
		public TerminalNode CODEUNITS16() { return getToken(DB2zSQLParser.CODEUNITS16, 0); }
		public TerminalNode CODEUNITS32() { return getToken(DB2zSQLParser.CODEUNITS32, 0); }
		public TerminalNode CORR() { return getToken(DB2zSQLParser.CORR, 0); }
		public TerminalNode CORRELATION() { return getToken(DB2zSQLParser.CORRELATION, 0); }
		public TerminalNode COVAR() { return getToken(DB2zSQLParser.COVAR, 0); }
		public TerminalNode COVARIANCE() { return getToken(DB2zSQLParser.COVARIANCE, 0); }
		public TerminalNode COVARIANCE_SAMP() { return getToken(DB2zSQLParser.COVARIANCE_SAMP, 0); }
		public TerminalNode COVAR_POP() { return getToken(DB2zSQLParser.COVAR_POP, 0); }
		public TerminalNode COVAR_SAMP() { return getToken(DB2zSQLParser.COVAR_SAMP, 0); }
		public TerminalNode CS() { return getToken(DB2zSQLParser.CS, 0); }
		public TerminalNode CUME_DIST() { return getToken(DB2zSQLParser.CUME_DIST, 0); }
		public TerminalNode DENSE_RANK() { return getToken(DB2zSQLParser.DENSE_RANK, 0); }
		public TerminalNode DESC() { return getToken(DB2zSQLParser.DESC, 0); }
		public TerminalNode EBCDIC() { return getToken(DB2zSQLParser.EBCDIC, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(DB2zSQLParser.EXCLUSIVE, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(DB2zSQLParser.FIRST_VALUE, 0); }
		public TerminalNode FOLLOWING() { return getToken(DB2zSQLParser.FOLLOWING, 0); }
		public TerminalNode GROUPING() { return getToken(DB2zSQLParser.GROUPING, 0); }
		public TerminalNode IGNORE() { return getToken(DB2zSQLParser.IGNORE, 0); }
		public TerminalNode INDICATOR() { return getToken(DB2zSQLParser.INDICATOR, 0); }
		public TerminalNode INPUT() { return getToken(DB2zSQLParser.INPUT, 0); }
		public TerminalNode ISNULL() { return getToken(DB2zSQLParser.ISNULL, 0); }
		public TerminalNode LAG() { return getToken(DB2zSQLParser.LAG, 0); }
		public TerminalNode LARGE() { return getToken(DB2zSQLParser.LARGE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(DB2zSQLParser.LAST_VALUE, 0); }
		public TerminalNode LEAD() { return getToken(DB2zSQLParser.LEAD, 0); }
		public TerminalNode LISTAGG() { return getToken(DB2zSQLParser.LISTAGG, 0); }
		public TerminalNode LOCKED() { return getToken(DB2zSQLParser.LOCKED, 0); }
		public TerminalNode LOCKS() { return getToken(DB2zSQLParser.LOCKS, 0); }
		public TerminalNode MEDIAN() { return getToken(DB2zSQLParser.MEDIAN, 0); }
		public TerminalNode MIXED() { return getToken(DB2zSQLParser.MIXED, 0); }
		public TerminalNode NOTNULL() { return getToken(DB2zSQLParser.NOTNULL, 0); }
		public TerminalNode NTH_VALUE() { return getToken(DB2zSQLParser.NTH_VALUE, 0); }
		public TerminalNode NTILE() { return getToken(DB2zSQLParser.NTILE, 0); }
		public TerminalNode NUMERIC() { return getToken(DB2zSQLParser.NUMERIC, 0); }
		public TerminalNode OBJECT() { return getToken(DB2zSQLParser.OBJECT, 0); }
		public TerminalNode OCTETS() { return getToken(DB2zSQLParser.OCTETS, 0); }
		public TerminalNode ONLY() { return getToken(DB2zSQLParser.ONLY, 0); }
		public TerminalNode OVER() { return getToken(DB2zSQLParser.OVER, 0); }
		public TerminalNode PASSING() { return getToken(DB2zSQLParser.PASSING, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(DB2zSQLParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(DB2zSQLParser.PERCENTILE_DISC, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(DB2zSQLParser.PERCENT_RANK, 0); }
		public TerminalNode PRECEDING() { return getToken(DB2zSQLParser.PRECEDING, 0); }
		public TerminalNode PREVIOUS() { return getToken(DB2zSQLParser.PREVIOUS, 0); }
		public TerminalNode RANGE() { return getToken(DB2zSQLParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(DB2zSQLParser.RANK, 0); }
		public TerminalNode RATIO_TO_REPORT() { return getToken(DB2zSQLParser.RATIO_TO_REPORT, 0); }
		public TerminalNode READ() { return getToken(DB2zSQLParser.READ, 0); }
		public TerminalNode REF() { return getToken(DB2zSQLParser.REF, 0); }
		public TerminalNode REGR_AVGX() { return getToken(DB2zSQLParser.REGR_AVGX, 0); }
		public TerminalNode REGR_AVGY() { return getToken(DB2zSQLParser.REGR_AVGY, 0); }
		public TerminalNode REGR_COUNT() { return getToken(DB2zSQLParser.REGR_COUNT, 0); }
		public TerminalNode REGR_ICPT() { return getToken(DB2zSQLParser.REGR_ICPT, 0); }
		public TerminalNode REGR_INTERCEPT() { return getToken(DB2zSQLParser.REGR_INTERCEPT, 0); }
		public TerminalNode REGR_R2() { return getToken(DB2zSQLParser.REGR_R2, 0); }
		public TerminalNode REGR_SLOPE() { return getToken(DB2zSQLParser.REGR_SLOPE, 0); }
		public TerminalNode REGR_SXX() { return getToken(DB2zSQLParser.REGR_SXX, 0); }
		public TerminalNode REGR_SXY() { return getToken(DB2zSQLParser.REGR_SXY, 0); }
		public TerminalNode REGR_SYY() { return getToken(DB2zSQLParser.REGR_SYY, 0); }
		public TerminalNode RESPECT() { return getToken(DB2zSQLParser.RESPECT, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(DB2zSQLParser.ROW_NUMBER, 0); }
		public TerminalNode ROWS() { return getToken(DB2zSQLParser.ROWS, 0); }
		public TerminalNode RR() { return getToken(DB2zSQLParser.RR, 0); }
		public TerminalNode RS() { return getToken(DB2zSQLParser.RS, 0); }
		public TerminalNode SBCS() { return getToken(DB2zSQLParser.SBCS, 0); }
		public TerminalNode SELECTIVITY() { return getToken(DB2zSQLParser.SELECTIVITY, 0); }
		public TerminalNode SETS() { return getToken(DB2zSQLParser.SETS, 0); }
		public TerminalNode SHARE() { return getToken(DB2zSQLParser.SHARE, 0); }
		public TerminalNode SKIP_() { return getToken(DB2zSQLParser.SKIP_, 0); }
		public TerminalNode STDDEV() { return getToken(DB2zSQLParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(DB2zSQLParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(DB2zSQLParser.STDDEV_SAMP, 0); }
		public TerminalNode SUM() { return getToken(DB2zSQLParser.SUM, 0); }
		public TerminalNode TOKEN() { return getToken(DB2zSQLParser.TOKEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(DB2zSQLParser.UNBOUNDED, 0); }
		public TerminalNode UNPACK() { return getToken(DB2zSQLParser.UNPACK, 0); }
		public TerminalNode UR() { return getToken(DB2zSQLParser.UR, 0); }
		public TerminalNode USE() { return getToken(DB2zSQLParser.USE, 0); }
		public TerminalNode VAR() { return getToken(DB2zSQLParser.VAR, 0); }
		public TerminalNode VARIANCE() { return getToken(DB2zSQLParser.VARIANCE, 0); }
		public TerminalNode VARIANCE_SAMP() { return getToken(DB2zSQLParser.VARIANCE_SAMP, 0); }
		public TerminalNode VAR_POP() { return getToken(DB2zSQLParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(DB2zSQLParser.VAR_SAMP, 0); }
		public TerminalNode VARYING() { return getToken(DB2zSQLParser.VARYING, 0); }
		public TerminalNode WITHOUT() { return getToken(DB2zSQLParser.WITHOUT, 0); }
		public TerminalNode XML() { return getToken(DB2zSQLParser.XML, 0); }
		public TerminalNode XMLAGG() { return getToken(DB2zSQLParser.XMLAGG, 0); }
		public TerminalNode COLUMNS() { return getToken(DB2zSQLParser.COLUMNS, 0); }
		public TerminalNode SQLID() { return getToken(DB2zSQLParser.SQLID, 0); }
		public TerminalNode ORDINALITY() { return getToken(DB2zSQLParser.ORDINALITY, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(DB2zSQLParser.SYSTEM_TIME, 0); }
		public TerminalNode BUSINESS_TIME() { return getToken(DB2zSQLParser.BUSINESS_TIME, 0); }
		public TerminalNode MULTIPLIER() { return getToken(DB2zSQLParser.MULTIPLIER, 0); }
		public TerminalNode UNNEST() { return getToken(DB2zSQLParser.UNNEST, 0); }
		public TerminalNode CROSS() { return getToken(DB2zSQLParser.CROSS, 0); }
		public TerminalNode CALLER() { return getToken(DB2zSQLParser.CALLER, 0); }
		public TerminalNode CLIENT() { return getToken(DB2zSQLParser.CLIENT, 0); }
		public TerminalNode POSITIONING() { return getToken(DB2zSQLParser.POSITIONING, 0); }
		public TerminalNode SCROLL() { return getToken(DB2zSQLParser.SCROLL, 0); }
		public TerminalNode ALTER() { return getToken(DB2zSQLParser.ALTER, 0); }
		public TerminalNode INDEXBP() { return getToken(DB2zSQLParser.INDEXBP, 0); }
		public TerminalNode ACTION() { return getToken(DB2zSQLParser.ACTION, 0); }
		public TerminalNode ASSEMBLE() { return getToken(DB2zSQLParser.ASSEMBLE, 0); }
		public TerminalNode C_() { return getToken(DB2zSQLParser.C_, 0); }
		public TerminalNode CALLED() { return getToken(DB2zSQLParser.CALLED, 0); }
		public TerminalNode COBOL() { return getToken(DB2zSQLParser.COBOL, 0); }
		public TerminalNode DB2() { return getToken(DB2zSQLParser.DB2, 0); }
		public TerminalNode DEFINER() { return getToken(DB2zSQLParser.DEFINER, 0); }
		public TerminalNode DISPATCH() { return getToken(DB2zSQLParser.DISPATCH, 0); }
		public TerminalNode ENVIRONMENT() { return getToken(DB2zSQLParser.ENVIRONMENT, 0); }
		public TerminalNode FAILURE() { return getToken(DB2zSQLParser.FAILURE, 0); }
		public TerminalNode FAILURES() { return getToken(DB2zSQLParser.FAILURES, 0); }
		public TerminalNode JAVA() { return getToken(DB2zSQLParser.JAVA, 0); }
		public TerminalNode MAIN() { return getToken(DB2zSQLParser.MAIN, 0); }
		public TerminalNode NAME() { return getToken(DB2zSQLParser.NAME, 0); }
		public TerminalNode OPTIONS() { return getToken(DB2zSQLParser.OPTIONS, 0); }
		public TerminalNode PARALLEL() { return getToken(DB2zSQLParser.PARALLEL, 0); }
		public TerminalNode PLI() { return getToken(DB2zSQLParser.PLI, 0); }
		public TerminalNode REGISTERS() { return getToken(DB2zSQLParser.REGISTERS, 0); }
		public TerminalNode RESIDENT() { return getToken(DB2zSQLParser.RESIDENT, 0); }
		public TerminalNode SECURED() { return getToken(DB2zSQLParser.SECURED, 0); }
		public TerminalNode SPECIAL() { return getToken(DB2zSQLParser.SPECIAL, 0); }
		public TerminalNode SQL() { return getToken(DB2zSQLParser.SQL, 0); }
		public TerminalNode STOP() { return getToken(DB2zSQLParser.STOP, 0); }
		public TerminalNode SUB() { return getToken(DB2zSQLParser.SUB, 0); }
		public TerminalNode YES() { return getToken(DB2zSQLParser.YES, 0); }
		public TerminalNode APPLICATION() { return getToken(DB2zSQLParser.APPLICATION, 0); }
		public TerminalNode CHANGED() { return getToken(DB2zSQLParser.CHANGED, 0); }
		public TerminalNode COMPATIBILITY() { return getToken(DB2zSQLParser.COMPATIBILITY, 0); }
		public TerminalNode COMPRESS() { return getToken(DB2zSQLParser.COMPRESS, 0); }
		public TerminalNode COPY() { return getToken(DB2zSQLParser.COPY, 0); }
		public TerminalNode FREEPAGE() { return getToken(DB2zSQLParser.FREEPAGE, 0); }
		public TerminalNode GBPCACHE() { return getToken(DB2zSQLParser.GBPCACHE, 0); }
		public TerminalNode INCLUDE() { return getToken(DB2zSQLParser.INCLUDE, 0); }
		public TerminalNode MAXVALUE() { return getToken(DB2zSQLParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(DB2zSQLParser.MINVALUE, 0); }
		public TerminalNode PCTFREE() { return getToken(DB2zSQLParser.PCTFREE, 0); }
		public TerminalNode REGENERATE() { return getToken(DB2zSQLParser.REGENERATE, 0); }
		public TerminalNode SEQTY() { return getToken(DB2zSQLParser.SEQTY, 0); }
		public TerminalNode MASK() { return getToken(DB2zSQLParser.MASK, 0); }
		public TerminalNode ENABLE() { return getToken(DB2zSQLParser.ENABLE, 0); }
		public TerminalNode PERMISSION() { return getToken(DB2zSQLParser.PERMISSION, 0); }
		public TerminalNode ATOMIC() { return getToken(DB2zSQLParser.ATOMIC, 0); }
		public TerminalNode SQLEXCEPTION() { return getToken(DB2zSQLParser.SQLEXCEPTION, 0); }
		public TerminalNode MERGE() { return getToken(DB2zSQLParser.MERGE, 0); }
		public TerminalNode MATCHED() { return getToken(DB2zSQLParser.MATCHED, 0); }
		public TerminalNode SQLSTATE() { return getToken(DB2zSQLParser.SQLSTATE, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(DB2zSQLParser.MESSAGE_TEXT, 0); }
		public TerminalNode OVERRIDING() { return getToken(DB2zSQLParser.OVERRIDING, 0); }
		public TerminalNode PORTION() { return getToken(DB2zSQLParser.PORTION, 0); }
		public TerminalNode DB2SQL() { return getToken(DB2zSQLParser.DB2SQL, 0); }
		public TerminalNode DEBUG() { return getToken(DB2zSQLParser.DEBUG, 0); }
		public TerminalNode GENERAL() { return getToken(DB2zSQLParser.GENERAL, 0); }
		public TerminalNode MODE_() { return getToken(DB2zSQLParser.MODE_, 0); }
		public TerminalNode REXX() { return getToken(DB2zSQLParser.REXX, 0); }
		public SqlKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).enterSqlKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DB2zSQLParserListener ) ((DB2zSQLParserListener)listener).exitSqlKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DB2zSQLParserVisitor ) return ((DB2zSQLParserVisitor<? extends T>)visitor).visitSqlKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlKeywordContext sqlKeyword() throws RecognitionException {
		SqlKeywordContext _localctx = new SqlKeywordContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_sqlKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALLOW) | (1L << ALTER) | (1L << ALTERAND) | (1L << ANY) | (1L << ARRAY) | (1L << ARRAY_EXISTS) | (1L << AS) | (1L << ASENSITIVE) | (1L << ASSOCIATE) | (1L << ASUTIME) | (1L << AT) | (1L << AUDIT) | (1L << AUX) | (1L << AUXILIARY) | (1L << BEFORE) | (1L << BEGIN) | (1L << BETWEEN) | (1L << BUFFERPOOL) | (1L << BY) | (1L << CALL) | (1L << CAPTURE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CCSID) | (1L << CHAR) | (1L << CHARACTER) | (1L << CHECK) | (1L << CLONE) | (1L << CLOSE) | (1L << CLUSTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLLECTION - 64)) | (1L << (COLLID - 64)) | (1L << (COLUMN - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (CONCAT - 64)) | (1L << (CONDITION - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONSTRAINT - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTENT - 64)) | (1L << (CONTINUE - 64)) | (1L << (CREATE - 64)) | (1L << (CUBE - 64)) | (1L << (CURRENT - 64)) | (1L << (CURRENT_LC_CTYPE - 64)) | (1L << (CURRVAL - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DAY - 64)) | (1L << (DAYS - 64)) | (1L << (DBINFO - 64)) | (1L << (DECLARE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DELETE - 64)) | (1L << (DESCRIPTOR - 64)) | (1L << (DETERMINISTIC - 64)) | (1L << (DISABLE - 64)) | (1L << (DISALLOW - 64)) | (1L << (DISTINCT - 64)) | (1L << (DO - 64)) | (1L << (DOCUMENT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DROP - 64)) | (1L << (DSSIZE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EDITPROC - 64)) | (1L << (ELSE - 64)) | (1L << (ELSEIF - 64)) | (1L << (ENCODING - 64)) | (1L << (ENCRYPTION - 64)) | (1L << (END - 64)) | (1L << (END_EXEC - 64)) | (1L << (ENDING - 64)) | (1L << (ERASE - 64)) | (1L << (ESCAPE - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC_SQL - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXIT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FENCED - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDPROC - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOR - 64)) | (1L << (FREE - 64)) | (1L << (FROM - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATED - 128)) | (1L << (GET - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GOTO - 128)) | (1L << (GRANT - 128)) | (1L << (GROUP - 128)) | (1L << (HANDLER - 128)) | (1L << (HAVING - 128)) | (1L << (HOLD - 128)) | (1L << (HOUR - 128)) | (1L << (HOURS - 128)) | (1L << (IF - 128)) | (1L << (IMMEDIATE - 128)) | (1L << (IN - 128)) | (1L << (INCLUSIVE - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXBP - 128)) | (1L << (INHERIT - 128)) | (1L << (INNER - 128)) | (1L << (INOUT - 128)) | (1L << (INSENSITIVE - 128)) | (1L << (INSERT - 128)) | (1L << (INTERSECT - 128)) | (1L << (INTO - 128)) | (1L << (IS - 128)) | (1L << (ISOBID - 128)) | (1L << (ITERATE - 128)) | (1L << (JAR - 128)) | (1L << (JOIN - 128)) | (1L << (KEEP - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LANGUAGE - 128)) | (1L << (LAST - 128)) | (1L << (LC_CTYPE - 128)) | (1L << (LEAVE - 128)) | (1L << (LEFT - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCALE - 128)) | (1L << (LOCATOR - 128)) | (1L << (LOCATORS - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKMAX - 128)) | (1L << (LOCKSIZE - 128)) | (1L << (LONG - 128)) | (1L << (LOOP - 128)) | (1L << (MAINTAINED - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MICROSECONDS - 128)) | (1L << (MODIFIES - 128)) | (1L << (MONTH - 128)) | (1L << (MONTHS - 128)) | (1L << (NEXT - 128)) | (1L << (NEXTVAL - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (NULL - 192)) | (1L << (NULLS - 192)) | (1L << (NUMPARTS - 192)) | (1L << (OBID - 192)) | (1L << (OF - 192)) | (1L << (OFFSET - 192)) | (1L << (OLD - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIMIZATION - 192)) | (1L << (OPTIMIZE - 192)) | (1L << (OR - 192)) | (1L << (ORDER - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OUT - 192)) | (1L << (OUTER - 192)) | (1L << (PACKAGE - 192)) | (1L << (PADDED - 192)) | (1L << (PARAMETER - 192)) | (1L << (PART - 192)) | (1L << (PARTITION - 192)) | (1L << (PARTITIONED - 192)) | (1L << (PARTITIONING - 192)) | (1L << (PATH - 192)) | (1L << (PERIOD - 192)) | (1L << (PIECESIZE - 192)) | (1L << (PLAN - 192)) | (1L << (PRECISION - 192)) | (1L << (PREPARE - 192)) | (1L << (PREVVAL - 192)) | (1L << (PRIOR - 192)) | (1L << (PRIQTY - 192)) | (1L << (PRIVILEGES - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PSID - 192)) | (1L << (PUBLIC - 192)) | (1L << (QUERY - 192)) | (1L << (QUERYNO - 192)) | (1L << (READS - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAME - 192)) | (1L << (REPEAT - 192)) | (1L << (RESIGNAL - 192)) | (1L << (RESTRICT - 192)) | (1L << (RESULT - 192)) | (1L << (RESULT_SET_LOCATOR - 192)) | (1L << (RETURN - 192)) | (1L << (RETURNS - 192)) | (1L << (REVOKE - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLE - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROUND_CEILING - 192)) | (1L << (ROUND_DOWN - 192)) | (1L << (ROUND_FLOOR - 192)) | (1L << (ROUND_HALF_DOWN - 192)) | (1L << (ROUND_HALF_EVEN - 192)) | (1L << (ROUND_HALF_UP - 192)) | (1L << (ROUND_UP - 192)) | (1L << (ROW - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (ROWSET - 256)) | (1L << (RUN - 256)) | (1L << (SAVEPOINT - 256)) | (1L << (SCHEMA - 256)) | (1L << (SCRATCHPAD - 256)) | (1L << (SECOND - 256)) | (1L << (SECONDS - 256)) | (1L << (SECQTY - 256)) | (1L << (SECURITY - 256)) | (1L << (SELECT - 256)) | (1L << (SENSITIVE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SET - 256)) | (1L << (SIGNAL - 256)) | (1L << (SIMPLE - 256)) | (1L << (SOME - 256)) | (1L << (SOURCE - 256)) | (1L << (SPECIFIC - 256)) | (1L << (STANDARD - 256)) | (1L << (STATEMENT - 256)) | (1L << (STATIC - 256)) | (1L << (STAY - 256)) | (1L << (STOGROUP - 256)) | (1L << (STORES - 256)) | (1L << (STYLE - 256)) | (1L << (SUMMARY - 256)) | (1L << (SYNONYM - 256)) | (1L << (SYSDATE - 256)) | (1L << (SYSTEM - 256)) | (1L << (SYSTIMESTAMP - 256)) | (1L << (TABLE - 256)) | (1L << (TABLESPACE - 256)) | (1L << (THEN - 256)) | (1L << (TO - 256)) | (1L << (TRIGGER - 256)) | (1L << (TRUNCATE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDO - 256)) | (1L << (UNION - 256)) | (1L << (UNIQUE - 256)) | (1L << (UNTIL - 256)) | (1L << (UPDATE - 256)) | (1L << (USING - 256)) | (1L << (VALIDPROC - 256)) | (1L << (VALUE - 256)) | (1L << (VALUES - 256)) | (1L << (VARIABLE - 256)) | (1L << (VARIANT - 256)) | (1L << (VCAT - 256)) | (1L << (VERSIONING - 256)) | (1L << (VIEW - 256)) | (1L << (VOLATILE - 256)) | (1L << (VOLUMES - 256)) | (1L << (WHEN - 256)) | (1L << (WHENEVER - 256)) | (1L << (WHERE - 256)) | (1L << (WHILE - 256)) | (1L << (WITH - 256)) | (1L << (WLM - 256)) | (1L << (XMLCAST - 256)) | (1L << (XMLEXISTS - 256)) | (1L << (XMLNAMESPACES - 256)) | (1L << (YEAR - 256)) | (1L << (YEARS - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (ZONE - 320)) | (1L << (AND - 320)) | (1L << (ARRAY_AGG - 320)) | (1L << (ASC - 320)) | (1L << (AVG - 320)) | (1L << (BIT - 320)) | (1L << (CHANGE - 320)) | (1L << (CODEUNITS16 - 320)) | (1L << (CODEUNITS32 - 320)) | (1L << (CORR - 320)) | (1L << (CORRELATION - 320)) | (1L << (COVAR - 320)) | (1L << (COVARIANCE - 320)) | (1L << (COVARIANCE_SAMP - 320)) | (1L << (COVAR_POP - 320)) | (1L << (COVAR_SAMP - 320)) | (1L << (CS - 320)) | (1L << (CUME_DIST - 320)) | (1L << (DENSE_RANK - 320)) | (1L << (DESC - 320)) | (1L << (EBCDIC - 320)) | (1L << (EXCLUSIVE - 320)) | (1L << (FIRST_VALUE - 320)) | (1L << (FOLLOWING - 320)) | (1L << (GROUPING - 320)) | (1L << (IGNORE - 320)) | (1L << (INDICATOR - 320)) | (1L << (INPUT - 320)) | (1L << (ISNULL - 320)) | (1L << (LAG - 320)) | (1L << (LARGE - 320)) | (1L << (LAST_VALUE - 320)) | (1L << (LEAD - 320)) | (1L << (LISTAGG - 320)) | (1L << (LOCKED - 320)) | (1L << (LOCKS - 320)) | (1L << (MEDIAN - 320)) | (1L << (MINUTES - 320)) | (1L << (MIXED - 320)) | (1L << (NOTNULL - 320)) | (1L << (NTH_VALUE - 320)) | (1L << (NTILE - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (ONLY - 320)) | (1L << (OVER - 320)) | (1L << (PASSING - 320)) | (1L << (PERCENTILE_CONT - 320)) | (1L << (PERCENTILE_DISC - 320)) | (1L << (PERCENT_RANK - 320)) | (1L << (PRECEDING - 320)) | (1L << (PREVIOUS - 320)) | (1L << (RANGE - 320)) | (1L << (RANK - 320)) | (1L << (RATIO_TO_REPORT - 320)) | (1L << (READ - 320)) | (1L << (REF - 320)) | (1L << (REGR_AVGX - 320)) | (1L << (REGR_AVGY - 320)) | (1L << (REGR_COUNT - 320)) | (1L << (REGR_ICPT - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_R2 - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (RESPECT - 384)) | (1L << (ROW_NUMBER - 384)) | (1L << (ROWS - 384)) | (1L << (RR - 384)) | (1L << (RS - 384)) | (1L << (SBCS - 384)) | (1L << (SELECTIVITY - 384)) | (1L << (SETS - 384)) | (1L << (SHARE - 384)) | (1L << (SKIP_ - 384)) | (1L << (STDDEV - 384)) | (1L << (STDDEV_POP - 384)) | (1L << (STDDEV_SAMP - 384)) | (1L << (SUM - 384)) | (1L << (TOKEN - 384)) | (1L << (UNBOUNDED - 384)) | (1L << (UNPACK - 384)) | (1L << (UR - 384)) | (1L << (USE - 384)) | (1L << (VAR - 384)) | (1L << (VARIANCE - 384)) | (1L << (VARIANCE_SAMP - 384)) | (1L << (VAR_POP - 384)) | (1L << (VAR_SAMP - 384)) | (1L << (VARYING - 384)) | (1L << (WITHOUT - 384)) | (1L << (XML - 384)) | (1L << (XMLAGG - 384)) | (1L << (COLUMNS - 384)) | (1L << (SQLID - 384)) | (1L << (ORDINALITY - 384)) | (1L << (SYSTEM_TIME - 384)) | (1L << (BUSINESS_TIME - 384)) | (1L << (MULTIPLIER - 384)) | (1L << (UNNEST - 384)) | (1L << (CROSS - 384)) | (1L << (CALLER - 384)) | (1L << (CLIENT - 384)) | (1L << (POSITIONING - 384)) | (1L << (SCROLL - 384)) | (1L << (ACTION - 384)) | (1L << (ASSEMBLE - 384)) | (1L << (C_ - 384)) | (1L << (CALLED - 384)) | (1L << (COBOL - 384)) | (1L << (DB2 - 384)) | (1L << (DEFINER - 384)) | (1L << (DISPATCH - 384)) | (1L << (ENVIRONMENT - 384)) | (1L << (FAILURE - 384)) | (1L << (FAILURES - 384)) | (1L << (JAVA - 384)) | (1L << (MAIN - 384)) | (1L << (NAME - 384)) | (1L << (OPTIONS - 384)) | (1L << (PARALLEL - 384)) | (1L << (PLI - 384)) | (1L << (REGISTERS - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESIDENT - 448)) | (1L << (SECURED - 448)) | (1L << (SPECIAL - 448)) | (1L << (SQL - 448)) | (1L << (STOP - 448)) | (1L << (SUB - 448)) | (1L << (YES - 448)) | (1L << (APPLICATION - 448)) | (1L << (CHANGED - 448)) | (1L << (COMPATIBILITY - 448)) | (1L << (COMPRESS - 448)) | (1L << (COPY - 448)) | (1L << (FREEPAGE - 448)) | (1L << (GBPCACHE - 448)) | (1L << (INCLUDE - 448)) | (1L << (MAXVALUE - 448)) | (1L << (MINVALUE - 448)) | (1L << (PCTFREE - 448)) | (1L << (REGENERATE - 448)) | (1L << (SEQTY - 448)) | (1L << (MASK - 448)) | (1L << (ENABLE - 448)) | (1L << (PERMISSION - 448)) | (1L << (ATOMIC - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (MERGE - 448)) | (1L << (MATCHED - 448)) | (1L << (SQLSTATE - 448)) | (1L << (MESSAGE_TEXT - 448)) | (1L << (OVERRIDING - 448)) | (1L << (PORTION - 448)) | (1L << (DB2SQL - 448)) | (1L << (DEBUG - 448)) | (1L << (GENERAL - 448)) | (1L << (MODE_ - 448)) | (1L << (REXX - 448)))) != 0) || _la==MINUTE || ((((_la - 714)) & ~0x3f) == 0 && ((1L << (_la - 714)) & ((1L << (CURRENT_DATE - 714)) | (1L << (CURRENT_PATH - 714)) | (1L << (CURRENT_SCHEMA - 714)) | (1L << (CURRENT_SERVER - 714)) | (1L << (CURRENT_TIME - 714)) | (1L << (CURRENT_TIMESTAMP - 714)) | (1L << (CURRENT_TIME_ZONE - 714)) | (1L << (SESSION_USER - 714)) | (1L << (USER - 714)))) != 0)) ) {
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u02f4\u0d3d\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\3\2\7\2\u01ca\n\2\f\2\16\2\u01cd\13\2\3\2\5\2\u01d0\n"+
		"\2\3\3\5\3\u01d3\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u01e4\n\3\3\3\3\3\3\3\5\3\u01e9\n\3\3\3\5\3\u01ec\n\3\3"+
		"\4\3\4\3\4\3\4\5\4\u01f2\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01fc"+
		"\n\5\3\5\5\5\u01ff\n\5\3\5\3\5\3\5\3\5\7\5\u0205\n\5\f\5\16\5\u0208\13"+
		"\5\3\5\3\5\3\5\5\5\u020d\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0217"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0221\n\t\5\t\u0223\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u022b\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0234\n\13\3\13\3\13\3\13\3\13\5\13\u023a\n\13\7\13\u023c\n\13\f\13"+
		"\16\13\u023f\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0249\n\f\3\r"+
		"\3\r\3\r\3\r\7\r\u024f\n\r\f\r\16\r\u0252\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\6\20\u026b\n\20\r\20\16\20\u026c\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0276\n\21\f\21\16\21\u0279\13\21\3\21\3\21\5"+
		"\21\u027d\n\21\3\21\3\21\3\21\5\21\u0282\n\21\3\21\5\21\u0285\n\21\3\21"+
		"\6\21\u0288\n\21\r\21\16\21\u0289\3\22\3\22\3\22\3\22\5\22\u0290\n\22"+
		"\3\22\7\22\u0293\n\22\f\22\16\22\u0296\13\22\3\22\3\22\3\22\7\22\u029b"+
		"\n\22\f\22\16\22\u029e\13\22\5\22\u02a0\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u02a8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u02b0\n\24\3"+
		"\25\3\25\3\25\3\25\6\25\u02b6\n\25\r\25\16\25\u02b7\3\26\3\26\3\26\3\26"+
		"\5\26\u02be\n\26\3\26\5\26\u02c1\n\26\3\26\5\26\u02c4\n\26\3\26\3\26\5"+
		"\26\u02c8\n\26\3\26\3\26\3\26\3\26\5\26\u02ce\n\26\3\26\3\26\7\26\u02d2"+
		"\n\26\f\26\16\26\u02d5\13\26\3\26\3\26\5\26\u02d9\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u02df\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02e9"+
		"\n\27\3\27\3\27\5\27\u02ed\n\27\3\30\3\30\5\30\u02f1\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\7\31\u02fa\n\31\f\31\16\31\u02fd\13\31\3\31\3"+
		"\31\5\31\u0301\n\31\3\31\5\31\u0304\n\31\3\31\3\31\3\31\5\31\u0309\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0311\n\31\f\31\16\31\u0314\13\31"+
		"\3\31\3\31\5\31\u0318\n\31\3\31\3\31\3\31\3\31\7\31\u031e\n\31\f\31\16"+
		"\31\u0321\13\31\5\31\u0323\n\31\3\31\3\31\5\31\u0327\n\31\3\31\3\31\5"+
		"\31\u032b\n\31\3\31\5\31\u032e\n\31\3\32\3\32\3\32\3\32\5\32\u0334\n\32"+
		"\3\32\5\32\u0337\n\32\3\32\3\32\7\32\u033b\n\32\f\32\16\32\u033e\13\32"+
		"\3\32\3\32\7\32\u0342\n\32\f\32\16\32\u0345\13\32\3\32\5\32\u0348\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0351\n\32\6\32\u0353\n\32\r"+
		"\32\16\32\u0354\3\32\3\32\5\32\u0359\n\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0360\n\32\3\32\3\32\5\32\u0364\n\32\3\33\3\33\3\33\5\33\u0369\n\33\3"+
		"\33\5\33\u036c\n\33\3\33\5\33\u036f\n\33\3\33\3\33\3\33\3\33\5\33\u0375"+
		"\n\33\3\33\3\33\7\33\u0379\n\33\f\33\16\33\u037c\13\33\3\33\3\33\5\33"+
		"\u0380\n\33\3\34\3\34\3\34\5\34\u0385\n\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u0391\n\34\3\34\3\34\5\34\u0395\n\34\3\35"+
		"\3\35\5\35\u0399\n\35\3\36\3\36\3\36\3\36\5\36\u039f\n\36\3\36\3\36\5"+
		"\36\u03a3\n\36\3\36\3\36\3\36\3\36\3\36\7\36\u03aa\n\36\f\36\16\36\u03ad"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u03b6\n\37\f\37\16\37\u03b9"+
		"\13\37\3\37\3\37\5\37\u03bd\n\37\3 \3 \3 \3 \3 \7 \u03c4\n \f \16 \u03c7"+
		"\13 \3 \3 \3 \3 \3 \5 \u03ce\n \3 \3 \5 \u03d2\n \3!\5!\u03d5\n!\3!\3"+
		"!\3!\5!\u03da\n!\3\"\3\"\3\"\5\"\u03df\n\"\3#\3#\3#\3#\3#\3#\3#\3#\7#"+
		"\u03e9\n#\f#\16#\u03ec\13#\3#\3#\3#\3#\7#\u03f2\n#\f#\16#\u03f5\13#\3"+
		"#\3#\3#\3#\3#\3#\7#\u03fd\n#\f#\16#\u0400\13#\3#\5#\u0403\n#\3#\3#\5#"+
		"\u0407\n#\3$\3$\3$\3$\3$\7$\u040e\n$\f$\16$\u0411\13$\3%\3%\3&\3&\3&\3"+
		"&\3&\7&\u041a\n&\f&\16&\u041d\13&\3&\3&\3&\3&\3&\3&\3&\7&\u0426\n&\f&"+
		"\16&\u0429\13&\3&\3&\5&\u042d\n&\3\'\3\'\3\'\5\'\u0432\n\'\3\'\3\'\5\'"+
		"\u0436\n\'\3(\3(\3(\3(\3(\3(\3(\7(\u043f\n(\f(\16(\u0442\13(\3)\3)\3)"+
		"\3)\7)\u0448\n)\f)\16)\u044b\13)\3)\3)\5)\u044f\n)\3*\3*\3*\3*\5*\u0455"+
		"\n*\3+\3+\5+\u0459\n+\3,\3,\3,\5,\u045e\n,\3-\3-\3-\3-\3-\3-\3-\3-\7-"+
		"\u0468\n-\f-\16-\u046b\13-\3-\3-\3.\3.\3.\3.\3.\3.\7.\u0475\n.\f.\16."+
		"\u0478\13.\3.\3.\5.\u047c\n.\3.\3.\3.\5.\u0481\n.\3.\5.\u0484\n.\3.\3"+
		".\3.\3.\3.\3.\5.\u048c\n.\3/\3/\3/\3/\3/\5/\u0493\n/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u04a3\n\60"+
		"\3\60\3\60\5\60\u04a7\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u04b1\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u04bb\n\60\5"+
		"\60\u04bd\n\60\3\61\3\61\3\61\6\61\u04c2\n\61\r\61\16\61\u04c3\3\61\6"+
		"\61\u04c7\n\61\r\61\16\61\u04c8\3\61\3\61\3\61\7\61\u04ce\n\61\f\61\16"+
		"\61\u04d1\13\61\3\62\3\62\3\62\3\62\3\62\5\62\u04d8\n\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u04e0\n\62\3\63\3\63\3\63\3\63\5\63\u04e6\n\63\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u04ef\n\65\3\65\3\65\3\65\3\65"+
		"\5\65\u04f5\n\65\3\65\3\65\3\65\3\65\5\65\u04fb\n\65\7\65\u04fd\n\65\f"+
		"\65\16\65\u0500\13\65\3\65\3\65\5\65\u0504\n\65\5\65\u0506\n\65\3\66\3"+
		"\66\3\67\3\67\38\38\38\58\u050f\n8\39\39\39\39\59\u0515\n9\39\39\39\3"+
		"9\39\39\59\u051d\n9\39\39\59\u0521\n9\39\39\39\39\59\u0527\n9\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\59\u0538\n9\39\59\u053b\n9\39\3"+
		"9\39\39\39\39\39\39\59\u0545\n9\39\39\39\39\59\u054b\n9\39\59\u054e\n"+
		"9\39\39\39\39\39\59\u0555\n9\39\39\39\39\39\39\39\59\u055e\n9\39\39\3"+
		"9\39\39\39\39\39\39\59\u0569\n9\39\39\39\39\39\59\u0570\n9\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0586\n9\39\39\3"+
		"9\39\39\39\39\39\39\59\u0591\n9\39\39\39\39\59\u0597\n9\3:\5:\u059a\n"+
		":\3:\3:\3:\3:\3:\3:\3:\5:\u05a3\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\5:\u05b3\n:\3:\3:\3:\5:\u05b8\n:\3:\5:\u05bb\n:\3:\3:\5:\u05bf"+
		"\n:\3:\3:\3:\3:\3:\3:\3:\5:\u05c8\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:"+
		"\u05d4\n:\3:\5:\u05d7\n:\3:\3:\3:\3:\3:\5:\u05de\n:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\5:\u05e9\n:\3:\3:\3:\3:\3:\5:\u05f0\n:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u0616\n:\3:\3:\3:\5:\u061b\n:\3;\3;\5;\u061f\n;"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u062b\n<\3=\3=\3>\3>\3?\3?\3@\3@\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0645\nA\3B\3B\3B\3B"+
		"\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\5D\u0656\nD\3E\3E\3E\5E\u065b\nE\3E"+
		"\3E\3E\3E\3E\7E\u0662\nE\fE\16E\u0665\13E\3E\3E\3F\3F\3F\5F\u066c\nF\3"+
		"F\3F\3F\5F\u0671\nF\3F\3F\5F\u0675\nF\3F\3F\3G\3G\3G\5G\u067c\nG\3G\3"+
		"G\3G\3G\3G\3G\3G\3H\3H\3H\5H\u0688\nH\3H\3H\3H\3H\3H\7H\u068f\nH\fH\16"+
		"H\u0692\13H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\5I\u069e\nI\3I\3I\3J\3J\3J\3"+
		"J\5J\u06a6\nJ\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\5L\u06b2\nL\3L\7L\u06b5\n"+
		"L\fL\16L\u06b8\13L\3M\3M\3M\3M\3M\3M\5M\u06c0\nM\3M\3M\3M\5M\u06c5\nM"+
		"\7M\u06c7\nM\fM\16M\u06ca\13M\5M\u06cc\nM\3M\3M\3N\3N\3N\5N\u06d3\nN\3"+
		"O\3O\3O\3O\5O\u06d9\nO\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\5P\u06f1\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5"+
		"Q\u06ff\nQ\5Q\u0701\nQ\5Q\u0703\nQ\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\5"+
		"R\u0710\nR\5R\u0712\nR\3R\3R\3S\3S\3S\3S\5S\u071a\nS\3T\3T\3T\3T\3T\7"+
		"T\u0721\nT\fT\16T\u0724\13T\3U\3U\3U\3U\5U\u072a\nU\3U\3U\3U\5U\u072f"+
		"\nU\7U\u0731\nU\fU\16U\u0734\13U\3V\3V\3V\5V\u0739\nV\3W\3W\3W\3W\3W\3"+
		"W\5W\u0741\nW\3W\5W\u0744\nW\3W\3W\3X\3X\5X\u074a\nX\3X\3X\3X\5X\u074f"+
		"\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0761\nX\5X\u0763"+
		"\nX\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\5[\u076f\n[\3\\\3\\\3\\\3\\\3\\\5\\"+
		"\u0776\n\\\3\\\3\\\3]\3]\3]\3]\3]\5]\u077f\n]\3]\3]\3^\3^\3^\3^\3^\3^"+
		"\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\5`\u0793\n`\3a\3a\3a\5a\u0798\na\3b\3b"+
		"\3b\3b\3b\3c\3c\5c\u07a1\nc\3d\3d\3d\3d\5d\u07a7\nd\3e\3e\3e\3e\5e\u07ad"+
		"\ne\3f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\3l\3l\3m\3m\3n"+
		"\3n\3n\3n\3n\5n\u07c9\nn\3n\3n\3n\3n\5n\u07cf\nn\3n\3n\3n\3n\5n\u07d5"+
		"\nn\3n\3n\3n\5n\u07da\nn\3n\3n\3n\5n\u07df\nn\7n\u07e1\nn\fn\16n\u07e4"+
		"\13n\5n\u07e6\nn\3n\3n\3o\3o\3p\3p\3p\3p\3p\5p\u07f1\np\3q\3q\3r\3r\3"+
		"s\3s\3s\3s\3s\5s\u07fc\ns\3t\5t\u07ff\nt\3t\3t\3t\3t\3t\3t\3t\5t\u0808"+
		"\nt\3u\3u\3u\3u\3u\3u\5u\u0810\nu\3v\3v\3v\3v\3w\3w\3x\3x\3x\3x\3y\3y"+
		"\3y\7y\u081f\ny\fy\16y\u0822\13y\3z\3z\3z\3z\3z\7z\u0829\nz\fz\16z\u082c"+
		"\13z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{\5{\u0838\n{\3|\3|\3}\3}\3~\3~\3~\3"+
		"~\3~\3~\3~\5~\u0845\n~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\5\177\u084f\n\177\3\u0080\3\u0080\3\u0080\5\u0080\u0854\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\5\u0080\u085a\n\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0865\n\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u086d\n\u0083"+
		"\3\u0084\5\u0084\u0870\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0875\n"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u087b\n\u0084\3\u0084\3"+
		"\u0084\5\u0084\u087f\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5"+
		"\u0084\u0886\n\u0084\7\u0084\u0888\n\u0084\f\u0084\16\u0084\u088b\13\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u0897\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\5\u0086\u08a1\n\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\7\u0087\u08a7\n\u0087\f\u0087\16\u0087\u08aa\13\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u08c3\n\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\5\u008a\u08cd\n\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u08d7\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\5\u008d\u08e4\n\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u08ef"+
		"\n\u008d\f\u008d\16\u008d\u08f2\13\u008d\3\u008d\3\u008d\5\u008d\u08f6"+
		"\n\u008d\3\u008e\3\u008e\5\u008e\u08fa\n\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0900\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u0905\n"+
		"\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u090a\n\u008f\3\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0912\n\u0090\3\u0090\3\u0090\3"+
		"\u0090\7\u0090\u0917\n\u0090\f\u0090\16\u0090\u091a\13\u0090\5\u0090\u091c"+
		"\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091\u0922\n\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0929\n\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u0934"+
		"\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u093e\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0944\n"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u094a\n\u0095\3\u0095\3"+
		"\u0095\3\u0095\5\u0095\u094f\n\u0095\3\u0095\3\u0095\5\u0095\u0953\n\u0095"+
		"\3\u0095\5\u0095\u0956\n\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u095b\n"+
		"\u0095\3\u0095\5\u0095\u095e\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5"+
		"\u0095\u0964\n\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0969\n\u0095\3\u0095"+
		"\5\u0095\u096c\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0972\n"+
		"\u0095\3\u0095\5\u0095\u0975\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5"+
		"\u0095\u097b\n\u0095\3\u0095\3\u0095\5\u0095\u097f\n\u0095\3\u0095\5\u0095"+
		"\u0982\n\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0987\n\u0095\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\5\u0095\u098d\n\u0095\3\u0095\3\u0095\3\u0095\3"+
		"\u0095\3\u0095\5\u0095\u0994\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5"+
		"\u0095\u099a\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u09a1"+
		"\n\u0095\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u09a7\n\u0096\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u09ae\n\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\5\u0098\u09b5\n\u0098\3\u0098\5\u0098\u09b8\n"+
		"\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u09c9"+
		"\n\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u09dd\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u09e1\n\u00a3\3"+
		"\u00a4\3\u00a4\3\u00a4\5\u00a4\u09e6\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u09ed\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\5\u00a6\u09f4\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a00\n\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0a0f\n\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\5\u00ad\u0a16\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\5\u00ae\u0a1e\n\u00ae\3\u00ae\3\u00ae\5\u00ae\u0a22\n"+
		"\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0a28\n\u00ae\3\u00ae\5"+
		"\u00ae\u0a2b\n\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3"+
		"\u00b1\5\u00b1\u0a34\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u0a38\n\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0a3d\n\u00b2\3\u00b2\3\u00b2\7\u00b2\u0a41\n"+
		"\u00b2\f\u00b2\16\u00b2\u0a44\13\u00b2\3\u00b3\5\u00b3\u0a47\n\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0a4e\n\u00b3\f\u00b3\16"+
		"\u00b3\u0a51\13\u00b3\3\u00b3\3\u00b3\5\u00b3\u0a55\n\u00b3\3\u00b4\3"+
		"\u00b4\7\u00b4\u0a59\n\u00b4\f\u00b4\16\u00b4\u0a5c\13\u00b4\3\u00b4\3"+
		"\u00b4\7\u00b4\u0a60\n\u00b4\f\u00b4\16\u00b4\u0a63\13\u00b4\3\u00b4\5"+
		"\u00b4\u0a66\n\u00b4\3\u00b4\3\u00b4\7\u00b4\u0a6a\n\u00b4\f\u00b4\16"+
		"\u00b4\u0a6d\13\u00b4\3\u00b4\3\u00b4\7\u00b4\u0a71\n\u00b4\f\u00b4\16"+
		"\u00b4\u0a74\13\u00b4\3\u00b4\5\u00b4\u0a77\n\u00b4\7\u00b4\u0a79\n\u00b4"+
		"\f\u00b4\16\u00b4\u0a7c\13\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\6\u00b5\u0a8c\n\u00b5\r\u00b5\16\u00b5\u0a8d\3\u00b5\3\u00b5\6\u00b5"+
		"\u0a92\n\u00b5\r\u00b5\16\u00b5\u0a93\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\6\u00b5\u0a9c\n\u00b5\r\u00b5\16\u00b5\u0a9d\3\u00b5"+
		"\3\u00b5\6\u00b5\u0aa2\n\u00b5\r\u00b5\16\u00b5\u0aa3\3\u00b5\5\u00b5"+
		"\u0aa7\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0aac\n\u00b5\5\u00b5\u0aae"+
		"\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0ab5\n\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0aba\n\u00b5\5\u00b5\u0abc\n\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\6\u00b5\u0aca\n\u00b5\r\u00b5\16\u00b5\u0acb"+
		"\3\u00b5\3\u00b5\6\u00b5\u0ad0\n\u00b5\r\u00b5\16\u00b5\u0ad1\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\6\u00b5\u0ada\n\u00b5\r\u00b5"+
		"\16\u00b5\u0adb\3\u00b5\3\u00b5\6\u00b5\u0ae0\n\u00b5\r\u00b5\16\u00b5"+
		"\u0ae1\3\u00b5\5\u00b5\u0ae5\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0aea"+
		"\n\u00b5\5\u00b5\u0aec\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\5\u00b5\u0af3\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\6\u00b5"+
		"\u0afa\n\u00b5\r\u00b5\16\u00b5\u0afb\3\u00b5\3\u00b5\6\u00b5\u0b00\n"+
		"\u00b5\r\u00b5\16\u00b5\u0b01\5\u00b5\u0b04\n\u00b5\3\u00b6\3\u00b6\7"+
		"\u00b6\u0b08\n\u00b6\f\u00b6\16\u00b6\u0b0b\13\u00b6\3\u00b6\5\u00b6\u0b0e"+
		"\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0b1f"+
		"\n\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0b2f\n\u00b8"+
		"\3\u00b9\5\u00b9\u0b32\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u0b38\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0b40\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u0b4b\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u0b53\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u0b59\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0b5f\n"+
		"\u00bb\7\u00bb\u0b61\n\u00bb\f\u00bb\16\u00bb\u0b64\13\u00bb\3\u00bb\3"+
		"\u00bb\5\u00bb\u0b68\n\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0b6d\n\u00bb"+
		"\3\u00bc\3\u00bc\5\u00bc\u0b71\n\u00bc\3\u00bc\3\u00bc\3\u00bd\5\u00bd"+
		"\u0b76\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\7\u00bd\u0b80\n\u00bd\f\u00bd\16\u00bd\u0b83\13\u00bd\3\u00bd"+
		"\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0b8e\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0b92\n\u00bf\3\u00c0\3\u00c0\3"+
		"\u00c0\3\u00c0\5\u00c0\u0b98\n\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0b9d"+
		"\n\u00c0\7\u00c0\u0b9f\n\u00c0\f\u00c0\16\u00c0\u0ba2\13\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\5\u00c0\u0ba7\n\u00c0\3\u00c0\5\u00c0\u0baa\n\u00c0\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0bb1\n\u00c1\3\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0bb9\n\u00c2\3\u00c2\3"+
		"\u00c2\3\u00c2\5\u00c2\u0bbe\n\u00c2\7\u00c2\u0bc0\n\u00c2\f\u00c2\16"+
		"\u00c2\u0bc3\13\u00c2\3\u00c2\3\u00c2\5\u00c2\u0bc7\n\u00c2\3\u00c3\3"+
		"\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0bd3\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u0bdd\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\7\u00ca\u0be5\n\u00ca\f\u00ca\16\u00ca\u0be8\13\u00ca"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc"+
		"\u0bf2\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0bf8\n\u00cc\7"+
		"\u00cc\u0bfa\n\u00cc\f\u00cc\16\u00cc\u0bfd\13\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0c08\n"+
		"\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\7\u00ce\u0c0e\n\u00ce\f\u00ce\16"+
		"\u00ce\u0c11\13\u00ce\3\u00ce\5\u00ce\u0c14\n\u00ce\3\u00ce\5\u00ce\u0c17"+
		"\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0c1e\n\u00ce"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u0c2e\n\u00cf\f\u00cf"+
		"\16\u00cf\u0c31\13\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\5\u00d0\u0c37"+
		"\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0c3d\n\u00d0\f\u00d0"+
		"\16\u00d0\u0c40\13\u00d0\5\u00d0\u0c42\n\u00d0\3\u00d1\3\u00d1\3\u00d1"+
		"\5\u00d1\u0c47\n\u00d1\3\u00d1\5\u00d1\u0c4a\n\u00d1\3\u00d1\5\u00d1\u0c4d"+
		"\n\u00d1\3\u00d1\5\u00d1\u0c50\n\u00d1\3\u00d1\5\u00d1\u0c53\n\u00d1\3"+
		"\u00d1\5\u00d1\u0c56\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u0c5c"+
		"\n\u00d2\f\u00d2\16\u00d2\u0c5f\13\u00d2\5\u00d2\u0c61\n\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0c67\n\u00d2\3\u00d2\5\u00d2\u0c6a\n"+
		"\u00d2\3\u00d2\5\u00d2\u0c6d\n\u00d2\3\u00d2\5\u00d2\u0c70\n\u00d2\3\u00d2"+
		"\5\u00d2\u0c73\n\u00d2\3\u00d2\5\u00d2\u0c76\n\u00d2\3\u00d2\3\u00d2\5"+
		"\u00d2\u0c7a\n\u00d2\3\u00d2\5\u00d2\u0c7d\n\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\7\u00d3\u0c83\n\u00d3\f\u00d3\16\u00d3\u0c86\13\u00d3\5\u00d3"+
		"\u0c88\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\7\u00d3\u0c91\n\u00d3\f\u00d3\16\u00d3\u0c94\13\u00d3\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0c9b\n\u00d4\f\u00d4\16\u00d4\u0c9e"+
		"\13\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0cac\n\u00d5\f\u00d5\16\u00d5"+
		"\u0caf\13\u00d5\5\u00d5\u0cb1\n\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8"+
		"\u0cbf\n\u00d8\3\u00d8\3\u00d8\5\u00d8\u0cc3\n\u00d8\3\u00d8\3\u00d8\5"+
		"\u00d8\u0cc7\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3"+
		"\u00da\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd"+
		"\u0ce0\n\u00dd\3\u00dd\3\u00dd\5\u00dd\u0ce4\n\u00dd\3\u00dd\3\u00dd\3"+
		"\u00dd\3\u00dd\3\u00dd\5\u00dd\u0ceb\n\u00dd\7\u00dd\u0ced\n\u00dd\f\u00dd"+
		"\16\u00dd\u0cf0\13\u00dd\3\u00dd\5\u00dd\u0cf3\n\u00dd\3\u00dd\5\u00dd"+
		"\u0cf6\n\u00dd\3\u00dd\5\u00dd\u0cf9\n\u00dd\3\u00de\3\u00de\3\u00de\3"+
		"\u00de\3\u00de\3\u00de\7\u00de\u0d01\n\u00de\f\u00de\16\u00de\u0d04\13"+
		"\u00de\3\u00de\3\u00de\5\u00de\u0d08\n\u00de\3\u00df\3\u00df\3\u00df\3"+
		"\u00df\5\u00df\u0d0e\n\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0d13\n\u00df"+
		"\7\u00df\u0d15\n\u00df\f\u00df\16\u00df\u0d18\13\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\5\u00df\u0d1f\n\u00df\3\u00e0\3\u00e0\3\u00e0"+
		"\5\u00e0\u0d24\n\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2"+
		"\3\u00e2\5\u00e2\u0d2d\n\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0d39\n\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e4\2\2\u00e5\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\2\63\4\2gg\u0116\u0116\4\2\u00bf\u00bf"+
		"\u01c8\u01c8\5\2\u0145\u0145\u0157\u0157\u0271\u0271\5\2!!\u00c0\u00c0"+
		"\u01ca\u01ca\7\2\u01b1\u01b2\u01b4\u01b4\u01bb\u01bb\u01c0\u01c0\u01c5"+
		"\u01c5\4\2\u01bb\u01bb\u01c5\u01c5\4\2##``\4\2\u01bc\u01bc\u01c7\u01c7"+
		"\4\2\u01b5\u01b6\u02ea\u02ea\4\2[[\u0096\u0096\4\2\u010e\u010e\u018f\u018f"+
		"\7\2\u01b1\u01b2\u01b4\u01b4\u01bb\u01bb\u01c0\u01c0\u01e5\u01e5\4\2#"+
		"#_`\3\2\b\r\4\2\16\22GG\4\2\u0196\u0196\u0294\u0294\4\2\u00bd\u00bd\u0178"+
		"\u0178\n\2WX\u008e\u008f\u00b7\u00b8\u00bb\u00bc\u0107\u0108\u0140\u0141"+
		"\u0169\u0169\u0257\u0257\4\2\u0145\u0145\u0157\u0157\4\2~~\u00a6\u00a6"+
		"\17\2\u0144\u0144\u0146\u0146\u014b\u0153\u0155\u0155\u015c\u015c\u0165"+
		"\u0165\u0168\u0168\u0174\u0176\u0192\u0195\u019b\u019f\u01a3\u01a3\u0253"+
		"\u0253\u0256\u0256\3\2\u017e\u0187\4\2\u0179\u0179\u018a\u018a\25\2<<"+
		"GGLLWXdd\u008e\u008e\u009a\u009a\u00a9\u00a9\u00b7\u00b7\u00bb\u00bb\u00ee"+
		"\u00ee\u00f6\u00f6\u0107\u0107\u0125\u0125\u012e\u012e\u013f\u0140\u01e6"+
		"\u0252\u0254\u0255\u0257\u02c3\3\2\u02eb\u02f3\3\2\u02c4\u02ea\4\2\u00cd"+
		"\u00cd\u0143\u0143\5\2!!&&\u0111\u0111\4\2&&\u0111\u0111\5\2\u016e\u016e"+
		"\u0217\u0217\u021b\u021b\3\2<=\5\2\u0216\u0216\u023a\u023a\u02af\u02af"+
		"\4\2\u013b\u013b\u01a1\u01a1\4\2\30\30\u02f4\u02f4\4\2\u0149\u014a\u0170"+
		"\u0170\5\2\u0158\u0158\u01f1\u01f1\u02a6\u02a6\5\2\u0147\u0147\u016a\u016a"+
		"\u018d\u018d\3\2\27\31\5\2\u0082\u0082\u00a9\u00a9\u00f6\u00f6\3\2\u01a7"+
		"\u01a8\4\2}}\u00c8\u00c8\3\2\30\31\4\2PP\u00f9\u00f9\4\2!!aa\4\2\u0101"+
		"\u0101\u018a\u018a\5\2\u012b\u012b\u0159\u0159\u0190\u0190\5\2rr\u009b"+
		"\u009b\u0128\u0128\4\2~~\u00bd\u00bd\13\2\37\u00b8\u00ba\u014c\u014f\u01e5"+
		"\u0257\u0257\u02cc\u02cc\u02d8\u02d8\u02df\u02e0\u02e4\u02e6\u02e9\u02ea"+
		"\2\u0ef2\2\u01cf\3\2\2\2\4\u01d2\3\2\2\2\6\u01f1\3\2\2\2\b\u01f3\3\2\2"+
		"\2\n\u020e\3\2\2\2\f\u0210\3\2\2\2\16\u0216\3\2\2\2\20\u0222\3\2\2\2\22"+
		"\u022a\3\2\2\2\24\u022c\3\2\2\2\26\u0248\3\2\2\2\30\u024a\3\2\2\2\32\u0255"+
		"\3\2\2\2\34\u025d\3\2\2\2\36\u025f\3\2\2\2 \u026e\3\2\2\2\"\u028b\3\2"+
		"\2\2$\u02a1\3\2\2\2&\u02a9\3\2\2\2(\u02b1\3\2\2\2*\u02b9\3\2\2\2,\u02da"+
		"\3\2\2\2.\u02f0\3\2\2\2\60\u02f2\3\2\2\2\62\u032f\3\2\2\2\64\u0365\3\2"+
		"\2\2\66\u0381\3\2\2\28\u0398\3\2\2\2:\u039a\3\2\2\2<\u03bc\3\2\2\2>\u03d1"+
		"\3\2\2\2@\u03d4\3\2\2\2B\u03de\3\2\2\2D\u0406\3\2\2\2F\u0408\3\2\2\2H"+
		"\u0412\3\2\2\2J\u0414\3\2\2\2L\u042e\3\2\2\2N\u0437\3\2\2\2P\u044e\3\2"+
		"\2\2R\u0454\3\2\2\2T\u0458\3\2\2\2V\u045d\3\2\2\2X\u045f\3\2\2\2Z\u046e"+
		"\3\2\2\2\\\u048d\3\2\2\2^\u04bc\3\2\2\2`\u04be\3\2\2\2b\u04df\3\2\2\2"+
		"d\u04e5\3\2\2\2f\u04e7\3\2\2\2h\u04ea\3\2\2\2j\u0507\3\2\2\2l\u0509\3"+
		"\2\2\2n\u050b\3\2\2\2p\u0596\3\2\2\2r\u061a\3\2\2\2t\u061e\3\2\2\2v\u062a"+
		"\3\2\2\2x\u062c\3\2\2\2z\u062e\3\2\2\2|\u0630\3\2\2\2~\u0632\3\2\2\2\u0080"+
		"\u0644\3\2\2\2\u0082\u0646\3\2\2\2\u0084\u064c\3\2\2\2\u0086\u0655\3\2"+
		"\2\2\u0088\u065a\3\2\2\2\u008a\u066b\3\2\2\2\u008c\u067b\3\2\2\2\u008e"+
		"\u0687\3\2\2\2\u0090\u069d\3\2\2\2\u0092\u06a1\3\2\2\2\u0094\u06aa\3\2"+
		"\2\2\u0096\u06af\3\2\2\2\u0098\u06b9\3\2\2\2\u009a\u06d2\3\2\2\2\u009c"+
		"\u06d4\3\2\2\2\u009e\u06f0\3\2\2\2\u00a0\u06f2\3\2\2\2\u00a2\u0706\3\2"+
		"\2\2\u00a4\u0719\3\2\2\2\u00a6\u071b\3\2\2\2\u00a8\u0725\3\2\2\2\u00aa"+
		"\u0735\3\2\2\2\u00ac\u073a\3\2\2\2\u00ae\u0749\3\2\2\2\u00b0\u0766\3\2"+
		"\2\2\u00b2\u0768\3\2\2\2\u00b4\u076e\3\2\2\2\u00b6\u0770\3\2\2\2\u00b8"+
		"\u0779\3\2\2\2\u00ba\u0782\3\2\2\2\u00bc\u0789\3\2\2\2\u00be\u078e\3\2"+
		"\2\2\u00c0\u0797\3\2\2\2\u00c2\u0799\3\2\2\2\u00c4\u07a0\3\2\2\2\u00c6"+
		"\u07a6\3\2\2\2\u00c8\u07ac\3\2\2\2\u00ca\u07ae\3\2\2\2\u00cc\u07b1\3\2"+
		"\2\2\u00ce\u07b4\3\2\2\2\u00d0\u07b7\3\2\2\2\u00d2\u07ba\3\2\2\2\u00d4"+
		"\u07bd\3\2\2\2\u00d6\u07bf\3\2\2\2\u00d8\u07c1\3\2\2\2\u00da\u07c3\3\2"+
		"\2\2\u00dc\u07e9\3\2\2\2\u00de\u07f0\3\2\2\2\u00e0\u07f2\3\2\2\2\u00e2"+
		"\u07f4\3\2\2\2\u00e4\u07f6\3\2\2\2\u00e6\u07fe\3\2\2\2\u00e8\u080f\3\2"+
		"\2\2\u00ea\u0811\3\2\2\2\u00ec\u0815\3\2\2\2\u00ee\u0817\3\2\2\2\u00f0"+
		"\u081b\3\2\2\2\u00f2\u0823\3\2\2\2\u00f4\u0837\3\2\2\2\u00f6\u0839\3\2"+
		"\2\2\u00f8\u083b\3\2\2\2\u00fa\u083d\3\2\2\2\u00fc\u084e\3\2\2\2\u00fe"+
		"\u0850\3\2\2\2\u0100\u085d\3\2\2\2\u0102\u085f\3\2\2\2\u0104\u0866\3\2"+
		"\2\2\u0106\u086f\3\2\2\2\u0108\u0896\3\2\2\2\u010a\u08a0\3\2\2\2\u010c"+
		"\u08a2\3\2\2\2\u010e\u08c2\3\2\2\2\u0110\u08c4\3\2\2\2\u0112\u08ca\3\2"+
		"\2\2\u0114\u08d3\3\2\2\2\u0116\u08dc\3\2\2\2\u0118\u08e1\3\2\2\2\u011a"+
		"\u08f7\3\2\2\2\u011c\u0901\3\2\2\2\u011e\u090b\3\2\2\2\u0120\u0921\3\2"+
		"\2\2\u0122\u0923\3\2\2\2\u0124\u092e\3\2\2\2\u0126\u0933\3\2\2\2\u0128"+
		"\u09a0\3\2\2\2\u012a\u09a2\3\2\2\2\u012c\u09aa\3\2\2\2\u012e\u09b1\3\2"+
		"\2\2\u0130\u09b9\3\2\2\2\u0132\u09bd\3\2\2\2\u0134\u09bf\3\2\2\2\u0136"+
		"\u09c1\3\2\2\2\u0138\u09c3\3\2\2\2\u013a\u09c8\3\2\2\2\u013c\u09cc\3\2"+
		"\2\2\u013e\u09ce\3\2\2\2\u0140\u09d0\3\2\2\2\u0142\u09d2\3\2\2\2\u0144"+
		"\u09dc\3\2\2\2\u0146\u09e5\3\2\2\2\u0148\u09ec\3\2\2\2\u014a\u09f3\3\2"+
		"\2\2\u014c\u09ff\3\2\2\2\u014e\u0a03\3\2\2\2\u0150\u0a05\3\2\2\2\u0152"+
		"\u0a07\3\2\2\2\u0154\u0a09\3\2\2\2\u0156\u0a0e\3\2\2\2\u0158\u0a15\3\2"+
		"\2\2\u015a\u0a19\3\2\2\2\u015c\u0a2c\3\2\2\2\u015e\u0a2e\3\2\2\2\u0160"+
		"\u0a37\3\2\2\2\u0162\u0a39\3\2\2\2\u0164\u0a46\3\2\2\2\u0166\u0a56\3\2"+
		"\2\2\u0168\u0b03\3\2\2\2\u016a\u0b05\3\2\2\2\u016c\u0b0f\3\2\2\2\u016e"+
		"\u0b20\3\2\2\2\u0170\u0b31\3\2\2\2\u0172\u0b4a\3\2\2\2\u0174\u0b4c\3\2"+
		"\2\2\u0176\u0b6e\3\2\2\2\u0178\u0b75\3\2\2\2\u017a\u0b86\3\2\2\2\u017c"+
		"\u0b8f\3\2\2\2\u017e\u0b93\3\2\2\2\u0180\u0bb0\3\2\2\2\u0182\u0bc6\3\2"+
		"\2\2\u0184\u0bc8\3\2\2\2\u0186\u0bca\3\2\2\2\u0188\u0bcc\3\2\2\2\u018a"+
		"\u0bce\3\2\2\2\u018c\u0bd4\3\2\2\2\u018e\u0bd7\3\2\2\2\u0190\u0bde\3\2"+
		"\2\2\u0192\u0be1\3\2\2\2\u0194\u0be9\3\2\2\2\u0196\u0bed\3\2\2\2\u0198"+
		"\u0c07\3\2\2\2\u019a\u0c1d\3\2\2\2\u019c\u0c1f\3\2\2\2\u019e\u0c34\3\2"+
		"\2\2\u01a0\u0c43\3\2\2\2\u01a2\u0c60\3\2\2\2\u01a4\u0c87\3\2\2\2\u01a6"+
		"\u0c95\3\2\2\2\u01a8\u0ca5\3\2\2\2\u01aa\u0cb2\3\2\2\2\u01ac\u0cb6\3\2"+
		"\2\2\u01ae\u0cbb\3\2\2\2\u01b0\u0cc8\3\2\2\2\u01b2\u0cce\3\2\2\2\u01b4"+
		"\u0cd2\3\2\2\2\u01b6\u0cd5\3\2\2\2\u01b8\u0cdf\3\2\2\2\u01ba\u0cfa\3\2"+
		"\2\2\u01bc\u0d09\3\2\2\2\u01be\u0d23\3\2\2\2\u01c0\u0d25\3\2\2\2\u01c2"+
		"\u0d29\3\2\2\2\u01c4\u0d38\3\2\2\2\u01c6\u0d3a\3\2\2\2\u01c8\u01ca\5\4"+
		"\3\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d0\7\2"+
		"\2\3\u01cf\u01cb\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\3\3\2\2\2\u01d1\u01d3"+
		"\7t\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01e3\3\2\2\2\u01d4"+
		"\u01e4\5\6\4\2\u01d5\u01e4\5\32\16\2\u01d6\u01e4\5\36\20\2\u01d7\u01e4"+
		"\5 \21\2\u01d8\u01e4\5\"\22\2\u01d9\u01e4\5$\23\2\u01da\u01e4\5&\24\2"+
		"\u01db\u01e4\5(\25\2\u01dc\u01e4\5\b\5\2\u01dd\u01e4\5\24\13\2\u01de\u01e4"+
		"\5\30\r\2\u01df\u01e4\5.\30\2\u01e0\u01e4\5\60\31\2\u01e1\u01e4\5\62\32"+
		"\2\u01e2\u01e4\58\35\2\u01e3\u01d4\3\2\2\2\u01e3\u01d5\3\2\2\2\u01e3\u01d6"+
		"\3\2\2\2\u01e3\u01d7\3\2\2\2\u01e3\u01d8\3\2\2\2\u01e3\u01d9\3\2\2\2\u01e3"+
		"\u01da\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01dc\3\2\2\2\u01e3\u01dd\3\2"+
		"\2\2\u01e3\u01de\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01eb\3\2\2\2\u01e5\u01ec\7\25"+
		"\2\2\u01e6\u01e8\7n\2\2\u01e7\u01e9\7\23\2\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01ec\7\2\2\3\u01eb\u01e5\3\2"+
		"\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\5\3\2\2\2\u01ed\u01f2"+
		"\5\u01a0\u00d1\2\u01ee\u01f2\5\u01b8\u00dd\2\u01ef\u01f2\5\u01a4\u00d3"+
		"\2\u01f0\u01f2\5\u01a2\u00d2\2\u01f1\u01ed\3\2\2\2\u01f1\u01ee\3\2\2\2"+
		"\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\7\3\2\2\2\u01f3\u01f4\7"+
		"Z\2\2\u01f4\u01fe\5\n\6\2\u01f5\u01f6\7\u00bf\2\2\u01f6\u01ff\7\u01af"+
		"\2\2\u01f7\u01fc\7*\2\2\u01f8\u01fc\7\u0099\2\2\u01f9\u01fa\7\u010c\2"+
		"\2\u01fa\u01fc\t\2\2\2\u01fb\u01f7\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7\u01af\2\2\u01fe\u01f5\3\2\2"+
		"\2\u01fe\u01fb\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0206"+
		"\7T\2\2\u0201\u0205\5\16\b\2\u0202\u0205\5\20\t\2\u0203\u0205\5\22\n\2"+
		"\u0204\u0201\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020c\7\177\2\2\u020a\u020d\5\u01a4\u00d3\2\u020b"+
		"\u020d\5\f\7\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\t\3\2\2\2"+
		"\u020e\u020f\5\u01c4\u00e3\2\u020f\13\3\2\2\2\u0210\u0211\5\u01c4\u00e3"+
		"\2\u0211\r\3\2\2\2\u0212\u0213\7\u01a1\2\2\u0213\u0217\7\u008d\2\2\u0214"+
		"\u0215\7\u013b\2\2\u0215\u0217\7\u008d\2\2\u0216\u0212\3\2\2\2\u0216\u0214"+
		"\3\2\2\2\u0217\17\3\2\2\2\u0218\u0219\7\u01a1\2\2\u0219\u0223\7\u00f3"+
		"\2\2\u021a\u021b\7\u013b\2\2\u021b\u0220\7\u00f3\2\2\u021c\u021d\7\u0123"+
		"\2\2\u021d\u0221\7\u01ac\2\2\u021e\u021f\7\u0123\2\2\u021f\u0221\7\u01ad"+
		"\2\2\u0220\u021c\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0223\3\2\2\2\u0222\u0218\3\2\2\2\u0222\u021a\3\2\2\2\u0223\21\3\2\2"+
		"\2\u0224\u0225\7\u01a1\2\2\u0225\u0226\7\u0102\2\2\u0226\u022b\7\u01ae"+
		"\2\2\u0227\u0228\7\u013b\2\2\u0228\u0229\7\u0102\2\2\u0229\u022b\7\u01ae"+
		"\2\2\u022a\u0224\3\2\2\2\u022a\u0227\3\2\2\2\u022b\23\3\2\2\2\u022c\u022d"+
		"\7Z\2\2\u022d\u022e\5\u0144\u00a3\2\u022e\u022f\7\u0120\2\2\u022f\u0230"+
		"\7\3\2\2\u0230\u0231\5\u013a\u009e\2\u0231\u0233\5\u0126\u0094\2\u0232"+
		"\u0234\5\26\f\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u023d\3"+
		"\2\2\2\u0235\u0236\7\26\2\2\u0236\u0237\5\u013a\u009e\2\u0237\u0239\5"+
		"\u0126\u0094\2\u0238\u023a\5\26\f\2\u0239\u0238\3\2\2\2\u0239\u023a\3"+
		"\2\2\2\u023a\u023c\3\2\2\2\u023b\u0235\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u0240\u0241\7\4\2\2\u0241\25\3\2\2\2\u0242\u0243\7\u00c1\2\2\u0243"+
		"\u0249\7\u00c2\2\2\u0244\u0245\7\u00c1\2\2\u0245\u0246\7\u00c2\2\2\u0246"+
		"\u0247\7\u013b\2\2\u0247\u0249\7[\2\2\u0248\u0242\3\2\2\2\u0248\u0244"+
		"\3\2\2\2\u0249\27\3\2\2\2\u024a\u024b\7Z\2\2\u024b\u0250\5\f\7\2\u024c"+
		"\u024d\7\26\2\2\u024d\u024f\5\f\7\2\u024e\u024c\3\2\2\2\u024f\u0252\3"+
		"\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0254\7\u0115\2\2\u0254\31\3\2\2\2\u0255\u0256\7"+
		"\"\2\2\u0256\u0257\5\n\6\2\u0257\u0258\7T\2\2\u0258\u0259\7\177\2\2\u0259"+
		"\u025a\7\u00f1\2\2\u025a\u025b\7\u010e\2\2\u025b\u025c\5\34\17\2\u025c"+
		"\33\3\2\2\2\u025d\u025e\5\u015a\u00ae\2\u025e\35\3\2\2\2\u025f\u0260\7"+
		"$\2\2\u0260\u0261\7V\2\2\u0261\u026a\5\u014e\u00a8\2\u0262\u0263\7\64"+
		"\2\2\u0263\u026b\5\u0152\u00aa\2\u0264\u0265\7\u0095\2\2\u0265\u026b\5"+
		"\u0152\u00aa\2\u0266\u0267\7\u0118\2\2\u0267\u026b\5\u0154\u00ab\2\u0268"+
		"\u0269\7;\2\2\u0269\u026b\5\u0138\u009d\2\u026a\u0262\3\2\2\2\u026a\u0264"+
		"\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\37\3\2\2\2\u026e\u0281\7$\2\2"+
		"\u026f\u0270\7\u0083\2\2\u0270\u027c\5\u0156\u00ac\2\u0271\u0272\7\3\2"+
		"\2\u0272\u0277\5n8\2\u0273\u0274\7\26\2\2\u0274\u0276\5n8\2\u0275\u0273"+
		"\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7\4\2\2\u027b\u027d\3\2"+
		"\2\2\u027c\u0271\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0282\3\2\2\2\u027e"+
		"\u027f\7\u0113\2\2\u027f\u0280\7\u0083\2\2\u0280\u0282\5\u0158\u00ad\2"+
		"\u0281\u026f\3\2\2\2\u0281\u027e\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0285"+
		"\7\u00f0\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2"+
		"\2\u0286\u0288\5p9\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0287"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a!\3\2\2\2\u028b\u028c\7$\2\2\u028c\u028d"+
		"\7\u0094\2\2\u028d\u028f\5\u0146\u00a4\2\u028e\u0290\5\\/\2\u028f\u028e"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0294\3\2\2\2\u0291\u0293\5^\60\2\u0292"+
		"\u0291\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u029f\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u029c\5`\61\2\u0298"+
		"\u0299\7\26\2\2\u0299\u029b\5`\61\2\u029a\u0298\3\2\2\2\u029b\u029e\3"+
		"\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u0297\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0#\3\2\2\2"+
		"\u02a1\u02a2\7$\2\2\u02a2\u02a3\7\u01d6\2\2\u02a3\u02a7\5\u0148\u00a5"+
		"\2\u02a4\u02a8\7\u01d7\2\2\u02a5\u02a8\7_\2\2\u02a6\u02a8\5\\/\2\u02a7"+
		"\u02a4\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8%\3\2\2\2"+
		"\u02a9\u02aa\7$\2\2\u02aa\u02ab\7\u01d8\2\2\u02ab\u02af\5\u014a\u00a6"+
		"\2\u02ac\u02b0\7\u01d7\2\2\u02ad\u02b0\7_\2\2\u02ae\u02b0\5\\/\2\u02af"+
		"\u02ac\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0\'\3\2\2\2"+
		"\u02b1\u02b2\7$\2\2\u02b2\u02b3\7\u00e3\2\2\u02b3\u02b5\5\u014c\u00a7"+
		"\2\u02b4\u02b6\5r:\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8)\3\2\2\2\u02b9\u02ba\7\\\2\2\u02ba"+
		"\u02bb\7\u0081\2\2\u02bb\u02bd\5\u0144\u00a3\2\u02bc\u02be\5\u016e\u00b8"+
		"\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf\u02c1"+
		"\5\u013e\u00a0\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3"+
		"\2\2\2\u02c2\u02c4\5X-\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c7\3\2\2\2\u02c5\u02c6\7\u010e\2\2\u02c6\u02c8\5D#\2\u02c7\u02c5\3"+
		"\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\7\u0139\2\2"+
		"\u02ca\u02cb\5\u0106\u0084\2\u02cb\u02cd\3\2\2\2\u02cc\u02ce\5\u01c2\u00e2"+
		"\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d3\3\2\2\2\u02cf\u02d2"+
		"\5\u01ae\u00d8\2\u02d0\u02d2\5\u01b2\u00da\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d8\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7\7\u00e8\2\2\u02d7"+
		"\u02d9\7\30\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9+\3\2\2\2"+
		"\u02da\u02db\7\\\2\2\u02db\u02dc\7\u0081\2\2\u02dc\u02de\5\u0144\u00a3"+
		"\2\u02dd\u02df\5\u013e\u00a0\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2"+
		"\u02df\u02e0\3\2\2\2\u02e0\u02e1\7\u0139\2\2\u02e1\u02e2\7Q\2\2\u02e2"+
		"\u02e3\7\u00c6\2\2\u02e3\u02ec\5\n\6\2\u02e4\u02e5\7\177\2\2\u02e5\u02e8"+
		"\7\u0101\2\2\u02e6\u02e9\5\u015a\u00ae\2\u02e7\u02e9\7\30\2\2\u02e8\u02e6"+
		"\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\7\u00c6\2"+
		"\2\u02eb\u02ed\7\u0102\2\2\u02ec\u02e4\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"-\3\2\2\2\u02ee\u02f1\5*\26\2\u02ef\u02f1\5,\27\2\u02f0\u02ee\3\2\2\2"+
		"\u02f0\u02ef\3\2\2\2\u02f1/\3\2\2\2\u02f2\u02f3\7\u009a\2\2\u02f3\u02f4"+
		"\7\u009c\2\2\u02f4\u0300\5\u0144\u00a3\2\u02f5\u02f6\7\3\2\2\u02f6\u02fb"+
		"\5\u013a\u009e\2\u02f7\u02f8\7\26\2\2\u02f8\u02fa\5\u013a\u009e\2\u02f9"+
		"\u02f7\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\7\4\2\2\u02ff"+
		"\u0301\3\2\2\2\u0300\u02f5\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2"+
		"\2\2\u0302\u0304\5X-\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0308"+
		"\3\2\2\2\u0305\u0306\7\u01df\2\2\u0306\u0307\7\u02ea\2\2\u0307\u0309\7"+
		"\u012e\2\2\u0308\u0305\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u032d\3\2\2\2"+
		"\u030a\u0317\7\u012f\2\2\u030b\u0318\5P)\2\u030c\u030d\7\3\2\2\u030d\u0312"+
		"\5P)\2\u030e\u030f\7\26\2\2\u030f\u0311\5P)\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2"+
		"\2\2\u0314\u0312\3\2\2\2\u0315\u0316\7\4\2\2\u0316\u0318\3\2\2\2\u0317"+
		"\u030b\3\2\2\2\u0317\u030c\3\2\2\2\u0318\u032e\3\2\2\2\u0319\u031a\7\u013b"+
		"\2\2\u031a\u031f\5\u01a6\u00d4\2\u031b\u031c\7\26\2\2\u031c\u031e\5\u01a6"+
		"\u00d4\2\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0319\3\2"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\5\u01b8\u00dd"+
		"\2\u0325\u0327\5\u01ae\u00d8\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2"+
		"\u0327\u032a\3\2\2\2\u0328\u0329\7\u00e8\2\2\u0329\u032b\7\30\2\2\u032a"+
		"\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032e\5Z"+
		".\2\u032d\u030a\3\2\2\2\u032d\u0322\3\2\2\2\u032d\u032c\3\2\2\2\u032e"+
		"\61\3\2\2\2\u032f\u0330\7\u01db\2\2\u0330\u0331\7\u009c\2\2\u0331\u0333"+
		"\5\u0144\u00a3\2\u0332\u0334\5\u0164\u00b3\2\u0333\u0332\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0337\5X-\2\u0336\u0335\3\2\2"+
		"\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0347\7\u012c\2\2\u0339"+
		"\u033b\7\3\2\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f"+
		"\u0343\5\u0168\u00b5\2\u0340\u0342\7\4\2\2\u0341\u0340\3\2\2\2\u0342\u0345"+
		"\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0348\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0346\u0348\5:\36\2\u0347\u033c\3\2\2\2\u0347\u0346\3\2"+
		"\2\2\u0348\u0349\3\2\2\2\u0349\u034a\7\u00c9\2\2\u034a\u0352\5\u0106\u0084"+
		"\2\u034b\u034c\7\u0137\2\2\u034c\u034d\5@!\2\u034d\u0350\7\u0122\2\2\u034e"+
		"\u0351\5B\"\2\u034f\u0351\5L\'\2\u0350\u034e\3\2\2\2\u0350\u034f\3\2\2"+
		"\2\u0351\u0353\3\2\2\2\u0352\u034b\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0352"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0357\7i\2\2\u0357"+
		"\u0359\7\u015d\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035f"+
		"\3\2\2\2\u035a\u035b\7\u00c1\2\2\u035b\u035c\7\u01d9\2\2\u035c\u035d\7"+
		"N\2\2\u035d\u035e\7\u00c9\2\2\u035e\u0360\7\u01da\2\2\u035f\u035a\3\2"+
		"\2\2\u035f\u0360\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u0362\7\u00e8\2\2\u0362"+
		"\u0364\7\30\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\63\3\2\2"+
		"\2\u0365\u0366\7\u012b\2\2\u0366\u0368\5\u0144\u00a3\2\u0367\u0369\5\u016e"+
		"\u00b8\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a"+
		"\u036c\5\u013e\u00a0\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e"+
		"\3\2\2\2\u036d\u036f\5X-\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0371\7\u010e\2\2\u0371\u0374\5D#\2\u0372\u0373\7"+
		"\u0139\2\2\u0373\u0375\5\u0106\u0084\2\u0374\u0372\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u037a\3\2\2\2\u0376\u0379\5\u01ae\u00d8\2\u0377\u0379\5"+
		"\u01b2\u00da\2\u0378\u0376\3\2\2\2\u0378\u0377\3\2\2\2\u0379\u037c\3\2"+
		"\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037f\3\2\2\2\u037c"+
		"\u037a\3\2\2\2\u037d\u037e\7\u00e8\2\2\u037e\u0380\7\30\2\2\u037f\u037d"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\65\3\2\2\2\u0381\u0382\7\u012b\2\2"+
		"\u0382\u0384\5\u0144\u00a3\2\u0383\u0385\5\u013e\u00a0\2\u0384\u0383\3"+
		"\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\7\u010e\2\2"+
		"\u0387\u0388\5D#\2\u0388\u0389\7\u0139\2\2\u0389\u038a\7Q\2\2\u038a\u038b"+
		"\7\u00c6\2\2\u038b\u0394\5\n\6\2\u038c\u038d\7\177\2\2\u038d\u0390\7\u0101"+
		"\2\2\u038e\u0391\5\u015a\u00ae\2\u038f\u0391\7\30\2\2\u0390\u038e\3\2"+
		"\2\2\u0390\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\7\u00c6\2\2\u0393"+
		"\u0395\7\u0102\2\2\u0394\u038c\3\2\2\2\u0394\u0395\3\2\2\2\u0395\67\3"+
		"\2\2\2\u0396\u0399\5\64\33\2\u0397\u0399\5\66\34\2\u0398\u0396\3\2\2\2"+
		"\u0398\u0397\3\2\2\2\u03999\3\2\2\2\u039a\u039b\7\3\2\2\u039b\u039e\7"+
		"\u012f\2\2\u039c\u039f\5<\37\2\u039d\u039f\5> \2\u039e\u039c\3\2\2\2\u039e"+
		"\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\7\4\2\2\u03a1\u03a3\7)"+
		"\2\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u03a5\5\u013e\u00a0\2\u03a5\u03a6\7\3\2\2\u03a6\u03ab\5\u013a\u009e\2"+
		"\u03a7\u03a8\7\26\2\2\u03a8\u03aa\5\u013a\u009e\2\u03a9\u03a7\3\2\2\2"+
		"\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae"+
		"\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03af\7\4\2\2\u03af;\3\2\2\2\u03b0"+
		"\u03bd\5T+\2\u03b1\u03b2\7\3\2\2\u03b2\u03b7\5T+\2\u03b3\u03b4\7\26\2"+
		"\2\u03b4\u03b6\5T+\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03bb\7\4\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03b0\3\2\2\2\u03bc\u03b1\3\2"+
		"\2\2\u03bd=\3\2\2\2\u03be\u03d2\5V,\2\u03bf\u03c0\7\3\2\2\u03c0\u03c5"+
		"\5V,\2\u03c1\u03c2\7\26\2\2\u03c2\u03c4\5V,\2\u03c3\u03c1\3\2\2\2\u03c4"+
		"\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2"+
		"\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\7\4\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cd\7\177\2\2\u03cb\u03ce\5\u015a\u00ae\2\u03cc\u03ce\7\30\2\2\u03cd"+
		"\u03cb\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7\u018a"+
		"\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03be\3\2\2\2\u03d1\u03bf\3\2\2\2\u03d2"+
		"?\3\2\2\2\u03d3\u03d5\7\u00c1\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2"+
		"\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9\7\u01dc\2\2\u03d7\u03d8\7\u0143\2"+
		"\2\u03d8\u03da\5\u0106\u0084\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2"+
		"\u03daA\3\2\2\2\u03db\u03df\5F$\2\u03dc\u03df\5H%\2\u03dd\u03df\5J&\2"+
		"\u03de\u03db\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03dd\3\2\2\2\u03dfC\3"+
		"\2\2\2\u03e0\u03e1\5\u013a\u009e\2\u03e1\u03e2\7\b\2\2\u03e2\u03ea\5P"+
		")\2\u03e3\u03e4\7\26\2\2\u03e4\u03e5\5\u013a\u009e\2\u03e5\u03e6\7\b\2"+
		"\2\u03e6\u03e7\5P)\2\u03e7\u03e9\3\2\2\2\u03e8\u03e3\3\2\2\2\u03e9\u03ec"+
		"\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u0407\3\2\2\2\u03ec"+
		"\u03ea\3\2\2\2\u03ed\u03ee\7\3\2\2\u03ee\u03f3\5\u013a\u009e\2\u03ef\u03f0"+
		"\7\26\2\2\u03f0\u03f2\5\u013a\u009e\2\u03f1\u03ef\3\2\2\2\u03f2\u03f5"+
		"\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5"+
		"\u03f3\3\2\2\2\u03f6\u03f7\7\4\2\2\u03f7\u03f8\7\b\2\2\u03f8\u03f9\7\3"+
		"\2\2\u03f9\u03fe\5P)\2\u03fa\u03fb\7\26\2\2\u03fb\u03fd\5P)\2\u03fc\u03fa"+
		"\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0403\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\5\u01b8\u00dd\2\u0402\u03ed"+
		"\3\2\2\2\u0402\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\7\4\2\2\u0405"+
		"\u0407\3\2\2\2\u0406\u03e0\3\2\2\2\u0406\u0402\3\2\2\2\u0407E\3\2\2\2"+
		"\u0408\u0409\7\u012b\2\2\u0409\u040a\7\u010e\2\2\u040a\u040f\5D#\2\u040b"+
		"\u040c\7\26\2\2\u040c\u040e\5D#\2\u040d\u040b\3\2\2\2\u040e\u0411\3\2"+
		"\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410G\3\2\2\2\u0411\u040f"+
		"\3\2\2\2\u0412\u0413\7\\\2\2\u0413I\3\2\2\2\u0414\u0415\7\u009a\2\2\u0415"+
		"\u0416\7\3\2\2\u0416\u041b\5\u013a\u009e\2\u0417\u0418\7\26\2\2\u0418"+
		"\u041a\5\u013a\u009e\2\u0419\u0417\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419"+
		"\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u041b\3\2\2\2\u041e"+
		"\u041f\7\4\2\2\u041f\u042c\7\u012f\2\2\u0420\u042d\5P)\2\u0421\u0422\7"+
		"\3\2\2\u0422\u0427\5P)\2\u0423\u0424\7\26\2\2\u0424\u0426\5P)\2\u0425"+
		"\u0423\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2"+
		"\2\2\u0428\u042a\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042b\7\4\2\2\u042b"+
		"\u042d\3\2\2\2\u042c\u0420\3\2\2\2\u042c\u0421\3\2\2\2\u042dK\3\2\2\2"+
		"\u042e\u042f\7\u010f\2\2\u042f\u0431\7\u01dd\2\2\u0430\u0432\7\u012e\2"+
		"\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0435"+
		"\7\27\2\2\u0434\u0436\5N(\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"M\3\2\2\2\u0437\u0438\7\u010e\2\2\u0438\u0439\7\u01de\2\2\u0439\u043a"+
		"\7\b\2\2\u043a\u0440\5\u0080A\2\u043b\u043c\5~@\2\u043c\u043d\5\u0080"+
		"A\2\u043d\u043f\3\2\2\2\u043e\u043b\3\2\2\2\u043f\u0442\3\2\2\2\u0440"+
		"\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441O\3\2\2\2\u0442\u0440\3\2\2\2"+
		"\u0443\u0449\5\u0080A\2\u0444\u0445\5~@\2\u0445\u0446\5\u0080A\2\u0446"+
		"\u0448\3\2\2\2\u0447\u0444\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2"+
		"\2\2\u0449\u044a\3\2\2\2\u044a\u044f\3\2\2\2\u044b\u0449\3\2\2\2\u044c"+
		"\u044f\7[\2\2\u044d\u044f\7\u00c2\2\2\u044e\u0443\3\2\2\2\u044e\u044c"+
		"\3\2\2\2\u044e\u044d\3\2\2\2\u044fQ\3\2\2\2\u0450\u0455\5\u0080A\2\u0451"+
		"\u0455\5\u015a\u00ae\2\u0452\u0455\7[\2\2\u0453\u0455\7\u00c2\2\2\u0454"+
		"\u0450\3\2\2\2\u0454\u0451\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0453\3\2"+
		"\2\2\u0455S\3\2\2\2\u0456\u0459\5\u0080A\2\u0457\u0459\7\u00c2\2\2\u0458"+
		"\u0456\3\2\2\2\u0458\u0457\3\2\2\2\u0459U\3\2\2\2\u045a\u045e\5\u0080"+
		"A\2\u045b\u045e\5\u015a\u00ae\2\u045c\u045e\7\u00c2\2\2\u045d\u045a\3"+
		"\2\2\2\u045d\u045b\3\2\2\2\u045d\u045c\3\2\2\2\u045eW\3\2\2\2\u045f\u0460"+
		"\7\u01d0\2\2\u0460\u0461\7\3\2\2\u0461\u0462\5\u013a\u009e\2\u0462\u0469"+
		"\5\u0126\u0094\2\u0463\u0464\7\26\2\2\u0464\u0465\5\u013a\u009e\2\u0465"+
		"\u0466\5\u0126\u0094\2\u0466\u0468\3\2\2\2\u0467\u0463\3\2\2\2\u0468\u046b"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046c\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046c\u046d\7\4\2\2\u046dY\3\2\2\2\u046e\u047b\7\u012f"+
		"\2\2\u046f\u047c\5R*\2\u0470\u0471\7\3\2\2\u0471\u0476\5R*\2\u0472\u0473"+
		"\7\26\2\2\u0473\u0475\5R*\2\u0474\u0472\3\2\2\2\u0475\u0478\3\2\2\2\u0476"+
		"\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478\u0476\3\2"+
		"\2\2\u0479\u047a\7\4\2\2\u047a\u047c\3\2\2\2\u047b\u046f\3\2\2\2\u047b"+
		"\u0470\3\2\2\2\u047c\u0483\3\2\2\2\u047d\u0480\7\177\2\2\u047e\u0481\5"+
		"\u015a\u00ae\2\u047f\u0481\7\30\2\2\u0480\u047e\3\2\2\2\u0480\u047f\3"+
		"\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\7\u018a\2\2\u0483\u047d\3\2\2\2"+
		"\u0483\u0484\3\2\2\2\u0484\u048b\3\2\2\2\u0485\u048c\7\u01d9\2\2\u0486"+
		"\u0487\7\u00c1\2\2\u0487\u0488\7\u01d9\2\2\u0488\u0489\7N\2\2\u0489\u048a"+
		"\7\u00c9\2\2\u048a\u048c\7\u01da\2\2\u048b\u0485\3\2\2\2\u048b\u0486\3"+
		"\2\2\2\u048c[\3\2\2\2\u048d\u0492\7\u01d4\2\2\u048e\u048f\7\u012c\2\2"+
		"\u048f\u0490\7\u01c9\2\2\u0490\u0491\7\u01cb\2\2\u0491\u0493\5j\66\2\u0492"+
		"\u048e\3\2\2\2\u0492\u0493\3\2\2\2\u0493]\3\2\2\2\u0494\u0495\7\64\2\2"+
		"\u0495\u04bd\5\u0152\u00aa\2\u0496\u0497\7@\2\2\u0497\u04bd\t\3\2\2\u0498"+
		"\u0499\7\u01cd\2\2\u0499\u04bd\t\3\2\2\u049a\u049b\7f\2\2\u049b\u04bd"+
		"\7\u02f4\2\2\u049c\u049d\7\u00db\2\2\u049d\u04bd\7\u02f4\2\2\u049e\u04bd"+
		"\5b\62\2\u049f\u04bd\5d\63\2\u04a0\u04bd\5f\64\2\u04a1\u04a3\7\u00c1\2"+
		"\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04bd"+
		"\7A\2\2\u04a5\u04a7\7\u00c1\2\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2"+
		"\2\u04a7\u04a8\3\2\2\2\u04a8\u04bd\7\u00d3\2\2\u04a9\u04aa\7\u01cc\2\2"+
		"\u04aa\u04bd\t\3\2\2\u04ab\u04ba\7\37\2\2\u04ac\u04ad\7D\2\2\u04ad\u04ae"+
		"\7\3\2\2\u04ae\u04b0\5\u013a\u009e\2\u04af\u04b1\t\4\2\2\u04b0\u04af\3"+
		"\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\7\4\2\2\u04b3"+
		"\u04bb\3\2\2\2\u04b4\u04b5\7\u01d0\2\2\u04b5\u04b6\7D\2\2\u04b6\u04b7"+
		"\7\3\2\2\u04b7\u04b8\5\u013a\u009e\2\u04b8\u04b9\7\4\2\2\u04b9\u04bb\3"+
		"\2\2\2\u04ba\u04ac\3\2\2\2\u04ba\u04b4\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc"+
		"\u0494\3\2\2\2\u04bc\u0496\3\2\2\2\u04bc\u0498\3\2\2\2\u04bc\u049a\3\2"+
		"\2\2\u04bc\u049c\3\2\2\2\u04bc\u049e\3\2\2\2\u04bc\u049f\3\2\2\2\u04bc"+
		"\u04a0\3\2\2\2\u04bc\u04a2\3\2\2\2\u04bc\u04a6\3\2\2\2\u04bc\u04a9\3\2"+
		"\2\2\u04bc\u04ab\3\2\2\2\u04bd_\3\2\2\2\u04be\u04bf\7$\2\2\u04bf\u04cf"+
		"\5h\65\2\u04c0\u04c2\5b\62\2\u04c1\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04ce\3\2\2\2\u04c5\u04c7\5d"+
		"\63\2\u04c6\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8"+
		"\u04c9\3\2\2\2\u04c9\u04ce\3\2\2\2\u04ca\u04ce\5f\64\2\u04cb\u04cc\7f"+
		"\2\2\u04cc\u04ce\7\u02f4\2\2\u04cd\u04c1\3\2\2\2\u04cd\u04c6\3\2\2\2\u04cd"+
		"\u04ca\3\2\2\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2"+
		"\2\2\u04cf\u04d0\3\2\2\2\u04d0a\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d7"+
		"\7\u012c\2\2\u04d3\u04d4\7\u0132\2\2\u04d4\u04d8\5\u0150\u00a9\2\u04d5"+
		"\u04d6\7\u0118\2\2\u04d6\u04d8\5\u0154\u00ab\2\u04d7\u04d3\3\2\2\2\u04d7"+
		"\u04d5\3\2\2\2\u04d8\u04e0\3\2\2\2\u04d9\u04da\7\u00e1\2\2\u04da\u04e0"+
		"\7\30\2\2\u04db\u04dc\7\u01d5\2\2\u04dc\u04e0\7\30\2\2\u04dd\u04de\7p"+
		"\2\2\u04de\u04e0\t\3\2\2\u04df\u04d2\3\2\2\2\u04df\u04d9\3\2\2\2\u04df"+
		"\u04db\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0c\3\2\2\2\u04e1\u04e2\7\u01ce"+
		"\2\2\u04e2\u04e6\7\30\2\2\u04e3\u04e4\7\u01d3\2\2\u04e4\u04e6\7\30\2\2"+
		"\u04e5\u04e1\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6e\3\2\2\2\u04e7\u04e8\7"+
		"\u01cf\2\2\u04e8\u04e9\t\5\2\2\u04e9g\3\2\2\2\u04ea\u04eb\7\u00d6\2\2"+
		"\u04eb\u0505\7\30\2\2\u04ec\u04ee\7o\2\2\u04ed\u04ef\7-\2\2\u04ee\u04ed"+
		"\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f4\7\3\2\2\u04f1"+
		"\u04f5\5\u0136\u009c\2\u04f2\u04f5\7\u01d1\2\2\u04f3\u04f5\7\u01d2\2\2"+
		"\u04f4\u04f1\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f3\3\2\2\2\u04f5\u04fe"+
		"\3\2\2\2\u04f6\u04fa\7\26\2\2\u04f7\u04fb\5\u0136\u009c\2\u04f8\u04fb"+
		"\7\u01d1\2\2\u04f9\u04fb\7\u01d2\2\2\u04fa\u04f7\3\2\2\2\u04fa\u04f8\3"+
		"\2\2\2\u04fa\u04f9\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04f6\3\2\2\2\u04fd"+
		"\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\3\2"+
		"\2\2\u0500\u04fe\3\2\2\2\u0501\u0503\7\4\2\2\u0502\u0504\7\u0093\2\2\u0503"+
		"\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506\3\2\2\2\u0505\u04ec\3\2"+
		"\2\2\u0505\u0506\3\2\2\2\u0506i\3\2\2\2\u0507\u0508\5l\67\2\u0508k\3\2"+
		"\2\2\u0509\u050a\7\u02f4\2\2\u050am\3\2\2\2\u050b\u050e\5\u0126\u0094"+
		"\2\u050c\u050d\7)\2\2\u050d\u050f\7\u00ae\2\2\u050e\u050c\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050fo\3\2\2\2\u0510\u0511\7y\2\2\u0511\u0514\7\u01bd\2"+
		"\2\u0512\u0515\5t;\2\u0513\u0515\5\u01c4\u00e3\2\u0514\u0512\3\2\2\2\u0514"+
		"\u0513\3\2\2\2\u0515\u0597\3\2\2\2\u0516\u0517\7\u00a5\2\2\u0517\u0597"+
		"\t\6\2\2\u0518\u0519\7\u00d4\2\2\u0519\u051a\7\u011a\2\2\u051a\u0597\t"+
		"\7\2\2\u051b\u051d\7\u00c1\2\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2"+
		"\u051d\u051e\3\2\2\2\u051e\u0597\7^\2\2\u051f\u0521\7\u00c1\2\2\u0520"+
		"\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0597\7\u0131"+
		"\2\2\u0523\u0524\7\u00f4\2\2\u0524\u0527\7\u00c2\2\2\u0525\u0527\7\u01b3"+
		"\2\2\u0526\u0523\3\2\2\2\u0526\u0525\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u0529\7\u00c9\2\2\u0529\u052a\7\u00c2\2\2\u052a\u0597\7\u015f\2\2\u052b"+
		"\u052c\7\u00c2\2\2\u052c\u0597\7\66\2\2\u052d\u052e\7\u00ba\2\2\u052e"+
		"\u052f\7\u01c5\2\2\u052f\u0538\7U\2\2\u0530\u0531\7\u00e9\2\2\u0531\u0532"+
		"\7\u01c5\2\2\u0532\u0538\7U\2\2\u0533\u0534\7L\2\2\u0534\u0538\7\u01c5"+
		"\2\2\u0535\u0536\7\u00bf\2\2\u0536\u0538\7\u01c5\2\2\u0537\u052d\3\2\2"+
		"\2\u0537\u0530\3\2\2\2\u0537\u0533\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u0597"+
		"\3\2\2\2\u0539\u053b\7\u00bf\2\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2"+
		"\2\u053b\u053c\3\2\2\2\u053c\u053d\7y\2\2\u053d\u0597\7\u01b0\2\2\u053e"+
		"\u053f\7\u00d2\2\2\u053f\u0540\7\u00d9\2\2\u0540\u0545\5v<\2\u0541\u0542"+
		"\7\u00bf\2\2\u0542\u0543\7\u00d2\2\2\u0543\u0545\7\u00d9\2\2\u0544\u053e"+
		"\3\2\2\2\u0544\u0541\3\2\2\2\u0545\u0597\3\2\2\2\u0546\u0547\7\u00bf\2"+
		"\2\u0547\u054b\7\u0106\2\2\u0548\u0549\7\u0106\2\2\u0549\u054b\7\30\2"+
		"\2\u054a\u0546\3\2\2\2\u054a\u0548\3\2\2\2\u054b\u0597\3\2\2\2\u054c\u054e"+
		"\7\u00bf\2\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2"+
		"\2\u054f\u0550\7}\2\2\u0550\u0597\7\66\2\2\u0551\u0552\t\b\2\2\u0552\u0597"+
		"\7\u01bf\2\2\u0553\u0555\7\u00bf\2\2\u0554\u0553\3\2\2\2\u0554\u0555\3"+
		"\2\2\2\u0555\u0556\3\2\2\2\u0556\u0597\7Y\2\2\u0557\u0558\7\u0202\2\2"+
		"\u0558\u0597\7\30\2\2\u0559\u055a\7\u00bf\2\2\u055a\u055e\7C\2\2\u055b"+
		"\u055c\7C\2\2\u055c\u055e\5x=\2\u055d\u0559\3\2\2\2\u055d\u055b\3\2\2"+
		"\2\u055e\u0597\3\2\2\2\u055f\u0560\7\u013c\2\2\u0560\u0568\7\u01b8\2\2"+
		"\u0561\u0569\5\u01c4\u00e3\2\u0562\u0563\7\3\2\2\u0563\u0564\5\u01c4\u00e3"+
		"\2\u0564\u0565\7\26\2\2\u0565\u0566\7\20\2\2\u0566\u0567\7\4\2\2\u0567"+
		"\u0569\3\2\2\2\u0568\u0561\3\2\2\2\u0568\u0562\3\2\2\2\u0569\u0597\3\2"+
		"\2\2\u056a\u056f\7,\2\2\u056b\u056c\7\u00bf\2\2\u056c\u0570\7\u00ab\2"+
		"\2\u056d\u056e\7\u00ab\2\2\u056e\u0570\7\30\2\2\u056f\u056b\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u0570\u0597\3\2\2\2\u0571\u0572\7\u0117\2\2\u0572\u0573"+
		"\7\u01c2\2\2\u0573\u0597\t\3\2\2\u0574\u0575\7\u00e4\2\2\u0575\u0576\7"+
		"\u0126\2\2\u0576\u0597\t\t\2\2\u0577\u0578\7\u010a\2\2\u0578\u0597\t\n"+
		"\2\2\u0579\u057a\7\u01c6\2\2\u057a\u057b\7 \2\2\u057b\u057c\7\u011e\2"+
		"\2\u057c\u057d\7[\2\2\u057d\u0586\7\u01ba\2\2\u057e\u057f\7\u01c6\2\2"+
		"\u057f\u0580\7 \2\2\u0580\u0581\7\30\2\2\u0581\u0586\7\u01ba\2\2\u0582"+
		"\u0583\7N\2\2\u0583\u0584\7 \2\2\u0584\u0586\7\u01b9\2\2\u0585\u0579\3"+
		"\2\2\2\u0585\u057e\3\2\2\2\u0585\u0582\3\2\2\2\u0586\u0597\3\2\2\2\u0587"+
		"\u0588\7\u0103\2\2\u0588\u0589\7\u01be\2\2\u0589\u0597\5z>\2\u058a\u058b"+
		"\t\13\2\2\u058b\u058c\7\u01c4\2\2\u058c\u0597\7\u01c1\2\2\u058d\u058e"+
		"\7\u0116\2\2\u058e\u0597\7\u01b7\2\2\u058f\u0591\7\u00c1\2\2\u0590\u058f"+
		"\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0597\7\u01c3\2"+
		"\2\u0593\u0597\7\u0113\2\2\u0594\u0595\7\u00d4\2\2\u0595\u0597\7;\2\2"+
		"\u0596\u0510\3\2\2\2\u0596\u0516\3\2\2\2\u0596\u0518\3\2\2\2\u0596\u051c"+
		"\3\2\2\2\u0596\u0520\3\2\2\2\u0596\u0526\3\2\2\2\u0596\u052b\3\2\2\2\u0596"+
		"\u0537\3\2\2\2\u0596\u053a\3\2\2\2\u0596\u0544\3\2\2\2\u0596\u054a\3\2"+
		"\2\2\u0596\u054d\3\2\2\2\u0596\u0551\3\2\2\2\u0596\u0554\3\2\2\2\u0596"+
		"\u0557\3\2\2\2\u0596\u055d\3\2\2\2\u0596\u055f\3\2\2\2\u0596\u056a\3\2"+
		"\2\2\u0596\u0571\3\2\2\2\u0596\u0574\3\2\2\2\u0596\u0577\3\2\2\2\u0596"+
		"\u0585\3\2\2\2\u0596\u0587\3\2\2\2\u0596\u058a\3\2\2\2\u0596\u058d\3\2"+
		"\2\2\u0596\u0590\3\2\2\2\u0596\u0593\3\2\2\2\u0596\u0594\3\2\2\2\u0597"+
		"q\3\2\2\2\u0598\u059a\7g\2\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059c\7\u00f1\2\2\u059c\u059d\t\f\2\2\u059d\u061b"+
		"\7\30\2\2\u059e\u059f\7y\2\2\u059f\u05a2\7\u01bd\2\2\u05a0\u05a3\5t;\2"+
		"\u05a1\u05a3\5\u01c4\u00e3\2\u05a2\u05a0\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3"+
		"\u061b\3\2\2\2\u05a4\u05a5\7\u00a5\2\2\u05a5\u061b\t\r\2\2\u05a6\u05a7"+
		"\7\u00d4\2\2\u05a7\u05b7\7\u011a\2\2\u05a8\u05b8\7\u01c5\2\2\u05a9\u05b8"+
		"\7\u01e1\2\2\u05aa\u05ab\7\u0114\2\2\u05ab\u05b8\7\66\2\2\u05ac\u05b8"+
		"\7\u01e3\2\2\u05ad\u05ae\7\u0110\2\2\u05ae\u05b8\7\66\2\2\u05af\u05b3"+
		"\7\u01e3\2\2\u05b0\u05b1\7\u0110\2\2\u05b1\u05b3\7\66\2\2\u05b2\u05af"+
		"\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\7\u013b\2"+
		"\2\u05b5\u05b8\7\u00c3\2\2\u05b6\u05b8\7\u01bb\2\2\u05b7\u05a8\3\2\2\2"+
		"\u05b7\u05a9\3\2\2\2\u05b7\u05aa\3\2\2\2\u05b7\u05ac\3\2\2\2\u05b7\u05ad"+
		"\3\2\2\2\u05b7\u05b2\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8\u061b\3\2\2\2\u05b9"+
		"\u05bb\7\u00c1\2\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc"+
		"\3\2\2\2\u05bc\u061b\7^\2\2\u05bd\u05bf\7\u00c1\2\2\u05be\u05bd\3\2\2"+
		"\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u061b\7\u0131\2\2\u05c1"+
		"\u05c2\7\u00d2\2\2\u05c2\u05c3\7\u00d9\2\2\u05c3\u05c8\5v<\2\u05c4\u05c5"+
		"\7\u00bf\2\2\u05c5\u05c6\7\u00d2\2\2\u05c6\u05c8\7\u00d9\2\2\u05c7\u05c1"+
		"\3\2\2\2\u05c7\u05c4\3\2\2\2\u05c8\u061b\3\2\2\2\u05c9\u05ca\7\u00ba\2"+
		"\2\u05ca\u05cb\7\u01c5\2\2\u05cb\u05d4\7U\2\2\u05cc\u05cd\7\u00e9\2\2"+
		"\u05cd\u05ce\7\u01c5\2\2\u05ce\u05d4\7U\2\2\u05cf\u05d0\7L\2\2\u05d0\u05d4"+
		"\7\u01c5\2\2\u05d1\u05d2\7\u00bf\2\2\u05d2\u05d4\7\u01c5\2\2\u05d3\u05c9"+
		"\3\2\2\2\u05d3\u05cc\3\2\2\2\u05d3\u05cf\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4"+
		"\u061b\3\2\2\2\u05d5\u05d7\7\u00bf\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u061b\7Y\2\2\u05d9\u05da\7\u00bf\2"+
		"\2\u05da\u05de\7C\2\2\u05db\u05dc\7C\2\2\u05dc\u05de\5x=\2\u05dd\u05d9"+
		"\3\2\2\2\u05dd\u05db\3\2\2\2\u05de\u061b\3\2\2\2\u05df\u05e0\7\u013c\2"+
		"\2\u05e0\u05e8\7\u01b8\2\2\u05e1\u05e9\5\u01c4\u00e3\2\u05e2\u05e3\7\3"+
		"\2\2\u05e3\u05e4\5\u01c4\u00e3\2\u05e4\u05e5\7\26\2\2\u05e5\u05e6\7\20"+
		"\2\2\u05e6\u05e7\7\4\2\2\u05e7\u05e9\3\2\2\2\u05e8\u05e1\3\2\2\2\u05e8"+
		"\u05e2\3\2\2\2\u05e9\u061b\3\2\2\2\u05ea\u05ef\7,\2\2\u05eb\u05ec\7\u00bf"+
		"\2\2\u05ec\u05f0\7\u00ab\2\2\u05ed\u05ee\7\u00ab\2\2\u05ee\u05f0\7\30"+
		"\2\2\u05ef\u05eb\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u061b\3\2\2\2\u05f1"+
		"\u05f2\7\u0117\2\2\u05f2\u05f3\7\u01c2\2\2\u05f3\u061b\t\3\2\2\u05f4\u05f5"+
		"\7\u00e4\2\2\u05f5\u05f6\7\u0126\2\2\u05f6\u061b\t\t\2\2\u05f7\u05f8\7"+
		"\u010a\2\2\u05f8\u061b\t\n\2\2\u05f9\u05fa\7\u0103\2\2\u05fa\u05fb\7\u01be"+
		"\2\2\u05fb\u061b\5z>\2\u05fc\u05fd\7F\2\2\u05fd\u05fe\7\u00c9\2\2\u05fe"+
		"\u05ff\7\u00f3\2\2\u05ff\u061b\t\3\2\2\u0600\u0601\t\13\2\2\u0601\u0602"+
		"\7\u01c4\2\2\u0602\u061b\7\u01c1\2\2\u0603\u0604\7\u01b3\2\2\u0604\u0605"+
		"\7\u00c9\2\2\u0605\u0606\7\u00c2\2\2\u0606\u061b\7\u015f\2\2\u0607\u0608"+
		"\7\u00c2\2\2\u0608\u061b\7\66\2\2\u0609\u060a\7\u01c6\2\2\u060a\u060b"+
		"\7 \2\2\u060b\u060c\7\u011e\2\2\u060c\u060d\7[\2\2\u060d\u0616\7\u01ba"+
		"\2\2\u060e\u060f\7\u01c6\2\2\u060f\u0610\7 \2\2\u0610\u0611\7\30\2\2\u0611"+
		"\u0616\7\u01ba\2\2\u0612\u0613\7N\2\2\u0613\u0614\7 \2\2\u0614\u0616\7"+
		"\u01b9\2\2\u0615\u0609\3\2\2\2\u0615\u060e\3\2\2\2\u0615\u0612\3\2\2\2"+
		"\u0616\u061b\3\2\2\2\u0617\u0618\t\16\2\2\u0618\u0619\7\u01e2\2\2\u0619"+
		"\u061b\7\u01e4\2\2\u061a\u0599\3\2\2\2\u061a\u059e\3\2\2\2\u061a\u05a4"+
		"\3\2\2\2\u061a\u05a6\3\2\2\2\u061a\u05ba\3\2\2\2\u061a\u05be\3\2\2\2\u061a"+
		"\u05c7\3\2\2\2\u061a\u05d3\3\2\2\2\u061a\u05d6\3\2\2\2\u061a\u05dd\3\2"+
		"\2\2\u061a\u05df\3\2\2\2\u061a\u05ea\3\2\2\2\u061a\u05f1\3\2\2\2\u061a"+
		"\u05f4\3\2\2\2\u061a\u05f7\3\2\2\2\u061a\u05f9\3\2\2\2\u061a\u05fc\3\2"+
		"\2\2\u061a\u0600\3\2\2\2\u061a\u0603\3\2\2\2\u061a\u0607\3\2\2\2\u061a"+
		"\u0615\3\2\2\2\u061a\u0617\3\2\2\2\u061bs\3\2\2\2\u061c\u061f\5\u01c4"+
		"\u00e3\2\u061d\u061f\7\27\2\2\u061e\u061c\3\2\2\2\u061e\u061d\3\2\2\2"+
		"\u061fu\3\2\2\2\u0620\u062b\5x=\2\u0621\u062b\7\u02e9\2\2\u0622\u062b"+
		"\7\u02ea\2\2\u0623\u0624\7Q\2\2\u0624\u0625\7\u00d2\2\2\u0625\u062b\7"+
		"\u00d9\2\2\u0626\u0627\7Q\2\2\u0627\u062b\7\u00d9\2\2\u0628\u062b\5\u015a"+
		"\u00ae\2\u0629\u062b\7\27\2\2\u062a\u0620\3\2\2\2\u062a\u0621\3\2\2\2"+
		"\u062a\u0622\3\2\2\2\u062a\u0623\3\2\2\2\u062a\u0626\3\2\2\2\u062a\u0628"+
		"\3\2\2\2\u062a\u0629\3\2\2\2\u062bw\3\2\2\2\u062c\u062d\5\u01c4\u00e3"+
		"\2\u062dy\3\2\2\2\u062e\u062f\7\27\2\2\u062f{\3\2\2\2\u0630\u0631\t\17"+
		"\2\2\u0631}\3\2\2\2\u0632\u0633\t\20\2\2\u0633\177\3\2\2\2\u0634\u0645"+
		"\5\u0086D\2\u0635\u0645\5\u0136\u009c\2\u0636\u0645\5\u013a\u009e\2\u0637"+
		"\u0645\5\u015a\u00ae\2\u0638\u0645\5\u00d8m\2\u0639\u0645\5\u01b6\u00dc"+
		"\2\u063a\u0645\5\u00fa~\2\u063b\u0645\5\u0090I\2\u063c\u0645\5\u00fe\u0080"+
		"\2\u063d\u0645\5\u0122\u0092\2\u063e\u0645\5\u0092J\2\u063f\u0645\5\u0094"+
		"K\2\u0640\u0645\5\u0098M\2\u0641\u0645\5\u009aN\2\u0642\u0645\5\u0082"+
		"B\2\u0643\u0645\5\u0084C\2\u0644\u0634\3\2\2\2\u0644\u0635\3\2\2\2\u0644"+
		"\u0636\3\2\2\2\u0644\u0637\3\2\2\2\u0644\u0638\3\2\2\2\u0644\u0639\3\2"+
		"\2\2\u0644\u063a\3\2\2\2\u0644\u063b\3\2\2\2\u0644\u063c\3\2\2\2\u0644"+
		"\u063d\3\2\2\2\u0644\u063e\3\2\2\2\u0644\u063f\3\2\2\2\u0644\u0640\3\2"+
		"\2\2\u0644\u0641\3\2\2\2\u0644\u0642\3\2\2\2\u0644\u0643\3\2\2\2\u0645"+
		"\u0081\3\2\2\2\u0646\u0647\7\u0101\2\2\u0647\u0648\7\u0148\2\2\u0648\u0649"+
		"\t\21\2\2\u0649\u064a\7\177\2\2\u064a\u064b\5\u0144\u00a3\2\u064b\u0083"+
		"\3\2\2\2\u064c\u064d\t\22\2\2\u064d\u064e\7\u012e\2\2\u064e\u064f\7\177"+
		"\2\2\u064f\u0650\5\u0144\u00a3\2\u0650\u0085\3\2\2\2\u0651\u0656\5\u0088"+
		"E\2\u0652\u0656\5\u008aF\2\u0653\u0656\5\u008cG\2\u0654\u0656\5\u008e"+
		"H\2\u0655\u0651\3\2\2\2\u0655\u0652\3\2\2\2\u0655\u0653\3\2\2\2\u0655"+
		"\u0654\3\2\2\2\u0656\u0087\3\2\2\2\u0657\u0658\5\u0142\u00a2\2\u0658\u0659"+
		"\7\23\2\2\u0659\u065b\3\2\2\2\u065a\u0657\3\2\2\2\u065a\u065b\3\2\2\2"+
		"\u065b\u065c\3\2\2\2\u065c\u065d\5\u00d4k\2\u065d\u065e\7\3\2\2\u065e"+
		"\u0663\5\u0080A\2\u065f\u0660\7\26\2\2\u0660\u0662\5\u0080A\2\u0661\u065f"+
		"\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664"+
		"\u0666\3\2\2\2\u0665\u0663\3\2\2\2\u0666\u0667\7\4\2\2\u0667\u0089\3\2"+
		"\2\2\u0668\u0669\5\u0142\u00a2\2\u0669\u066a\7\23\2\2\u066a\u066c\3\2"+
		"\2\2\u066b\u0668\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d"+
		"\u066e\5\u00b0Y\2\u066e\u0670\7\3\2\2\u066f\u0671\7a\2\2\u0670\u066f\3"+
		"\2\2\2\u0670\u0671\3\2\2\2\u0671\u0674\3\2\2\2\u0672\u0675\5\u0080A\2"+
		"\u0673\u0675\7\20\2\2\u0674\u0672\3\2\2\2\u0674\u0673\3\2\2\2\u0675\u0676"+
		"\3\2\2\2\u0676\u0677\7\4\2\2\u0677\u008b\3\2\2\2\u0678\u0679\5\u0142\u00a2"+
		"\2\u0679\u067a\7\23\2\2\u067a\u067c\3\2\2\2\u067b\u0678\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\5\u00b2Z\2\u067e\u067f"+
		"\7\3\2\2\u067f\u0680\5\u0080A\2\u0680\u0681\7\26\2\2\u0681\u0682\5\u0080"+
		"A\2\u0682\u0683\7\4\2\2\u0683\u008d\3\2\2\2\u0684\u0685\5\u0142\u00a2"+
		"\2\u0685\u0686\7\23\2\2\u0686\u0688\3\2\2\2\u0687\u0684\3\2\2\2\u0687"+
		"\u0688\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\7\u02f4\2\2\u068a\u068b"+
		"\7\3\2\2\u068b\u0690\5\u0080A\2\u068c\u068d\7\26\2\2\u068d\u068f\5\u0080"+
		"A\2\u068e\u068c\3\2\2\2\u068f\u0692\3\2\2\2\u0690\u068e\3\2\2\2\u0690"+
		"\u0691\3\2\2\2\u0691\u0693\3\2\2\2\u0692\u0690\3\2\2\2\u0693\u0694\7\4"+
		"\2\2\u0694\u008f\3\2\2\2\u0695\u069e\5\u0086D\2\u0696\u0697\7\3\2\2\u0697"+
		"\u0698\5\u0080A\2\u0698\u0699\7\4\2\2\u0699\u069e\3\2\2\2\u069a\u069e"+
		"\7\30\2\2\u069b\u069e\5\u013a\u009e\2\u069c\u069e\5\u0160\u00b1\2\u069d"+
		"\u0695\3\2\2\2\u069d\u0696\3\2\2\2\u069d\u069a\3\2\2\2\u069d\u069b\3\2"+
		"\2\2\u069d\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\t\23\2\2\u06a0"+
		"\u0091\3\2\2\2\u06a1\u06a5\7\u013d\2\2\u06a2\u06a6\5\u0080A\2\u06a3\u06a6"+
		"\7\u00c2\2\2\u06a4\u06a6\5\u0124\u0093\2\u06a5\u06a2\3\2\2\2\u06a5\u06a3"+
		"\3\2\2\2\u06a5\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\7)\2\2\u06a8"+
		"\u06a9\5\u0126\u0094\2\u06a9\u0093\3\2\2\2\u06aa\u06ab\5\u0120\u0091\2"+
		"\u06ab\u06ac\7\5\2\2\u06ac\u06ad\5\u0096L\2\u06ad\u06ae\7\6\2\2\u06ae"+
		"\u0095\3\2\2\2\u06af\u06b6\5\u0080A\2\u06b0\u06b2\5~@\2\u06b1\u06b0\3"+
		"\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\5\u0080A\2"+
		"\u06b4\u06b1\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b7"+
		"\3\2\2\2\u06b7\u0097\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9\u06ba\7\'\2\2\u06ba"+
		"\u06cb\7\5\2\2\u06bb\u06cc\7\7\2\2\u06bc\u06cc\5\u01b8\u00dd\2\u06bd\u06c0"+
		"\5\u0080A\2\u06be\u06c0\7\u00c2\2\2\u06bf\u06bd\3\2\2\2\u06bf\u06be\3"+
		"\2\2\2\u06c0\u06c8\3\2\2\2\u06c1\u06c4\7\26\2\2\u06c2\u06c5\5\u0080A\2"+
		"\u06c3\u06c5\7\u00c2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c3\3\2\2\2\u06c5"+
		"\u06c7\3\2\2\2\u06c6\u06c1\3\2\2\2\u06c7\u06ca\3\2\2\2\u06c8\u06c6\3\2"+
		"\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06c8\3\2\2\2\u06cb"+
		"\u06bb\3\2\2\2\u06cb\u06bc\3\2\2\2\u06cb\u06bf\3\2\2\2\u06cc\u06cd\3\2"+
		"\2\2\u06cd\u06ce\7\6\2\2\u06ce\u0099\3\2\2\2\u06cf\u06d3\5\u009cO\2\u06d0"+
		"\u06d3\5\u00acW\2\u06d1\u06d3\5\u00aeX\2\u06d2\u06cf\3\2\2\2\u06d2\u06d0"+
		"\3\2\2\2\u06d2\u06d1\3\2\2\2\u06d3\u009b\3\2\2\2\u06d4\u06d5\5\u009eP"+
		"\2\u06d5\u06d6\7\u0172\2\2\u06d6\u06d8\7\3\2\2\u06d7\u06d9\5\u00a6T\2"+
		"\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06db"+
		"\5\u00a8U\2\u06db\u06dc\7\4\2\2\u06dc\u009d\3\2\2\2\u06dd\u06de\7\u0155"+
		"\2\2\u06de\u06df\7\3\2\2\u06df\u06f1\7\4\2\2\u06e0\u06e1\7\u0176\2\2\u06e1"+
		"\u06e2\7\3\2\2\u06e2\u06f1\7\4\2\2\u06e3\u06e4\7\u017a\2\2\u06e4\u06e5"+
		"\7\3\2\2\u06e5\u06f1\7\4\2\2\u06e6\u06e7\7\u0156\2\2\u06e7\u06e8\7\3\2"+
		"\2\u06e8\u06f1\7\4\2\2\u06e9\u06ea\7\u016d\2\2\u06ea\u06eb\7\3\2\2\u06eb"+
		"\u06ec\5\u0080A\2\u06ec\u06ed\7\4\2\2\u06ed\u06f1\3\2\2\2\u06ee\u06f1"+
		"\5\u00a0Q\2\u06ef\u06f1\5\u00a2R\2\u06f0\u06dd\3\2\2\2\u06f0\u06e0\3\2"+
		"\2\2\u06f0\u06e3\3\2\2\2\u06f0\u06e6\3\2\2\2\u06f0\u06e9\3\2\2\2\u06f0"+
		"\u06ee\3\2\2\2\u06f0\u06ef\3\2\2\2\u06f1\u009f\3\2\2\2\u06f2\u06f3\7\u0161"+
		"\2\2\u06f3\u06f4\7\3\2\2\u06f4\u06f5\5\u0080A\2\u06f5\u06f6\7\26\2\2\u06f6"+
		"\u0702\7\30\2\2\u06f7\u06f8\7\26\2\2\u06f8\u0700\5\u0080A\2\u06f9\u06fe"+
		"\7\26\2\2\u06fa\u06fb\7\u0188\2\2\u06fb\u06ff\7\u00c3\2\2\u06fc\u06fd"+
		"\7\u015d\2\2\u06fd\u06ff\7\u00c3\2\2\u06fe\u06fa\3\2\2\2\u06fe\u06fc\3"+
		"\2\2\2\u06ff\u0701\3\2\2\2\u0700\u06f9\3\2\2\2\u0700\u0701\3\2\2\2\u0701"+
		"\u0703\3\2\2\2\u0702\u06f7\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\3\2"+
		"\2\2\u0704\u0705\7\4\2\2\u0705\u00a1\3\2\2\2\u0706\u0707\7\u0164\2\2\u0707"+
		"\u0708\7\3\2\2\u0708\u0709\5\u0080A\2\u0709\u070a\7\26\2\2\u070a\u0711"+
		"\7\30\2\2\u070b\u070c\7\26\2\2\u070c\u070f\5\u0080A\2\u070d\u070e\7\26"+
		"\2\2\u070e\u0710\5\u00a4S\2\u070f\u070d\3\2\2\2\u070f\u0710\3\2\2\2\u0710"+
		"\u0712\3\2\2\2\u0711\u070b\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\3\2"+
		"\2\2\u0713\u0714\7\4\2\2\u0714\u00a3\3\2\2\2\u0715\u0716\7\u0188\2\2\u0716"+
		"\u071a\7\u00c3\2\2\u0717\u0718\7\u015d\2\2\u0718\u071a\7\u00c3\2\2\u0719"+
		"\u0715\3\2\2\2\u0719\u0717\3\2\2\2\u071a\u00a5\3\2\2\2\u071b\u071c\7\u00d6"+
		"\2\2\u071c\u071d\7\65\2\2\u071d\u0722\5\u0080A\2\u071e\u071f\7\26\2\2"+
		"\u071f\u0721\5\u0080A\2\u0720\u071e\3\2\2\2\u0721\u0724\3\2\2\2\u0722"+
		"\u0720\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u00a7\3\2\2\2\u0724\u0722\3\2"+
		"\2\2\u0725\u0726\7\u00ce\2\2\u0726\u0727\7\65\2\2\u0727\u0729\5\u0080"+
		"A\2\u0728\u072a\5\u00aaV\2\u0729\u0728\3\2\2\2\u0729\u072a\3\2\2\2\u072a"+
		"\u0732\3\2\2\2\u072b\u072c\7\26\2\2\u072c\u072e\5\u0080A\2\u072d\u072f"+
		"\5\u00aaV\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731\3\2\2"+
		"\2\u0730\u072b\3\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733"+
		"\3\2\2\2\u0733\u00a9\3\2\2\2\u0734\u0732\3\2\2\2\u0735\u0738\t\24\2\2"+
		"\u0736\u0737\7\u00c3\2\2\u0737\u0739\t\25\2\2\u0738\u0736\3\2\2\2\u0738"+
		"\u0739\3\2\2\2\u0739\u00ab\3\2\2\2\u073a\u073b\7\u0189\2\2\u073b\u073c"+
		"\7\3\2\2\u073c\u073d\7\4\2\2\u073d\u073e\7\u0172\2\2\u073e\u0740\7\3\2"+
		"\2\u073f\u0741\5\u00a6T\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741"+
		"\u0743\3\2\2\2\u0742\u0744\5\u00a8U\2\u0743\u0742\3\2\2\2\u0743\u0744"+
		"\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0746\7\4\2\2\u0746\u00ad\3\2\2\2\u0747"+
		"\u074a\5\u008aF\2\u0748\u074a\5\u00b4[\2\u0749\u0747\3\2\2\2\u0749\u0748"+
		"\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\7\u0172\2\2\u074c\u074e\7\3\2"+
		"\2\u074d\u074f\5\u00a6T\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f"+
		"\u0762\3\2\2\2\u0750\u0751\7\u0179\2\2\u0751\u0752\7\63\2\2\u0752\u0753"+
		"\7\u0197\2\2\u0753\u0754\7\u0177\2\2\u0754\u0755\7\u0143\2\2\u0755\u0756"+
		"\7\u0197\2\2\u0756\u0763\7\u015b\2\2\u0757\u0760\5\u00a8U\2\u0758\u0759"+
		"\7\u0179\2\2\u0759\u075a\7\63\2\2\u075a\u075b\7\u0197\2\2\u075b\u075c"+
		"\7\u0177\2\2\u075c\u075d\7\u0143\2\2\u075d\u075e\7Q\2\2\u075e\u0761\7"+
		"\u0101\2\2\u075f\u0761\5\u00be`\2\u0760\u0758\3\2\2\2\u0760\u075f\3\2"+
		"\2\2\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762\u0750\3\2\2\2\u0762"+
		"\u0757\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\7\4"+
		"\2\2\u0765\u00af\3\2\2\2\u0766\u0767\t\26\2\2\u0767\u00b1\3\2\2\2\u0768"+
		"\u0769\t\27\2\2\u0769\u00b3\3\2\2\2\u076a\u076f\5\u00b6\\\2\u076b\u076f"+
		"\5\u00b8]\2\u076c\u076f\5\u00ba^\2\u076d\u076f\5\u00bc_\2\u076e\u076a"+
		"\3\2\2\2\u076e\u076b\3\2\2\2\u076e\u076c\3\2\2\2\u076e\u076d\3\2\2\2\u076f"+
		"\u00b5\3\2\2\2\u0770\u0771\7\u015a\2\2\u0771\u0772\7\3\2\2\u0772\u0775"+
		"\5\u0080A\2\u0773\u0774\7\26\2\2\u0774\u0776\5\u00a4S\2\u0775\u0773\3"+
		"\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\7\4\2\2\u0778"+
		"\u00b7\3\2\2\2\u0779\u077a\7\u0163\2\2\u077a\u077b\7\3\2\2\u077b\u077e"+
		"\5\u0080A\2\u077c\u077d\7\26\2\2\u077d\u077f\5\u00a4S\2\u077e\u077c\3"+
		"\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\7\4\2\2\u0781"+
		"\u00b9\3\2\2\2\u0782\u0783\7\u016c\2\2\u0783\u0784\7\3\2\2\u0784\u0785"+
		"\5\u0080A\2\u0785\u0786\7\26\2\2\u0786\u0787\7\30\2\2\u0787\u0788\7\4"+
		"\2\2\u0788\u00bb\3\2\2\2\u0789\u078a\7\u017b\2\2\u078a\u078b\7\3\2\2\u078b"+
		"\u078c\5\u0080A\2\u078c\u078d\7\4\2\2\u078d\u00bd\3\2\2\2\u078e\u0792"+
		"\t\30\2\2\u078f\u0793\5\u00c0a\2\u0790\u0793\5\u00c2b\2\u0791\u0793\5"+
		"\u00c4c\2\u0792\u078f\3\2\2\2\u0792\u0790\3\2\2\2\u0792\u0791\3\2\2\2"+
		"\u0793\u00bf\3\2\2\2\u0794\u0798\5\u00caf\2\u0795\u0798\5\u00ceh\2\u0796"+
		"\u0798\5\u00d2j\2\u0797\u0794\3\2\2\2\u0797\u0795\3\2\2\2\u0797\u0796"+
		"\3\2\2\2\u0798\u00c1\3\2\2\2\u0799\u079a\7\63\2\2\u079a\u079b\5\u00c6"+
		"d\2\u079b\u079c\7\u0143\2\2\u079c\u079d\5\u00c8e\2\u079d\u00c3\3\2\2\2"+
		"\u079e\u07a1\5\u00ccg\2\u079f\u07a1\5\u00d0i\2\u07a0\u079e\3\2\2\2\u07a0"+
		"\u079f\3\2\2\2\u07a1\u00c5\3\2\2\2\u07a2\u07a7\5\u00caf\2\u07a3\u07a7"+
		"\5\u00ceh\2\u07a4\u07a7\5\u00d0i\2\u07a5\u07a7\5\u00d2j\2\u07a6\u07a2"+
		"\3\2\2\2\u07a6\u07a3\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a5\3\2\2\2\u07a7"+
		"\u00c7\3\2\2\2\u07a8\u07ad\5\u00ccg\2\u07a9\u07ad\5\u00ceh\2\u07aa\u07ad"+
		"\5\u00d0i\2\u07ab\u07ad\5\u00d2j\2\u07ac\u07a8\3\2\2\2\u07ac\u07a9\3\2"+
		"\2\2\u07ac\u07aa\3\2\2\2\u07ac\u07ab\3\2\2\2\u07ad\u00c9\3\2\2\2\u07ae"+
		"\u07af\7\u0197\2\2\u07af\u07b0\7\u0177\2\2\u07b0\u00cb\3\2\2\2\u07b1\u07b2"+
		"\7\u0197\2\2\u07b2\u07b3\7\u015b\2\2\u07b3\u00cd\3\2\2\2\u07b4\u07b5\7"+
		"\30\2\2\u07b5\u07b6\7\u0177\2\2\u07b6\u00cf\3\2\2\2\u07b7\u07b8\7\30\2"+
		"\2\u07b8\u07b9\7\u015b\2\2\u07b9\u00d1\3\2\2\2\u07ba\u07bb\7Q\2\2\u07bb"+
		"\u07bc\7\u0101\2\2\u07bc\u00d3\3\2\2\2\u07bd\u07be\t\31\2\2\u07be\u00d5"+
		"\3\2\2\2\u07bf\u07c0\t\32\2\2\u07c0\u00d7\3\2\2\2\u07c1\u07c2\t\33\2\2"+
		"\u07c2\u00d9\3\2\2\2\u07c3\u07c4\7\u02f3\2\2\u07c4\u07c8\7\3\2\2\u07c5"+
		"\u07c6\5\u00f0y\2\u07c6\u07c7\7\26\2\2\u07c7\u07c9\3\2\2\2\u07c8\u07c5"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07d4\5\u00dco"+
		"\2\u07cb\u07ce\7\u0173\2\2\u07cc\u07cd\7\65\2\2\u07cd\u07cf\7\u017d\2"+
		"\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d1"+
		"\5\u00dep\2\u07d1\u07d2\7\26\2\2\u07d2\u07d3\5\u00dep\2\u07d3\u07d5\3"+
		"\2\2\2\u07d4\u07cb\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07e5\3\2\2\2\u07d6"+
		"\u07d9\7\u01a4\2\2\u07d7\u07da\5\u00e4s\2\u07d8\u07da\5\u00eex\2\u07d9"+
		"\u07d7\3\2\2\2\u07d9\u07d8\3\2\2\2\u07da\u07e2\3\2\2\2\u07db\u07de\7\26"+
		"\2\2\u07dc\u07df\5\u00e4s\2\u07dd\u07df\5\u00eex\2\u07de\u07dc\3\2\2\2"+
		"\u07de\u07dd\3\2\2\2\u07df\u07e1\3\2\2\2\u07e0\u07db\3\2\2\2\u07e1\u07e4"+
		"\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e6\3\2\2\2\u07e4"+
		"\u07e2\3\2\2\2\u07e5\u07d6\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3\2"+
		"\2\2\u07e7\u07e8\7\4\2\2\u07e8\u00db\3\2\2\2\u07e9\u07ea\7\27\2\2\u07ea"+
		"\u00dd\3\2\2\2\u07eb\u07f1\5\u00e0q\2\u07ec\u07ed\5\u00e2r\2\u07ed\u07ee"+
		"\7)\2\2\u07ee\u07ef\5\u01c4\u00e3\2\u07ef\u07f1\3\2\2\2\u07f0\u07eb\3"+
		"\2\2\2\u07f0\u07ec\3\2\2\2\u07f1\u00df\3\2\2\2\u07f2\u07f3\5\u0080A\2"+
		"\u07f3\u00e1\3\2\2\2\u07f4\u07f5\5\u0080A\2\u07f5\u00e3\3\2\2\2\u07f6"+
		"\u07f7\5\u013a\u009e\2\u07f7\u07fb\5\u0126\u0094\2\u07f8\u07fc\5\u00e6"+
		"t\2\u07f9\u07fa\7\u00d9\2\2\u07fa\u07fc\5\u00ecw\2\u07fb\u07f8\3\2\2\2"+
		"\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u00e5\3\2\2\2\u07fd\u07ff"+
		"\7\u013b\2\2\u07fe\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2"+
		"\2\u0800\u0807\7[\2\2\u0801\u0808\5\u00e8u\2\u0802\u0803\5\u00eav\2\u0803"+
		"\u0804\7\3\2\2\u0804\u0805\5\u00e8u\2\u0805\u0806\7\4\2\2\u0806\u0808"+
		"\3\2\2\2\u0807\u0801\3\2\2\2\u0807\u0802\3\2\2\2\u0808\u00e7\3\2\2\2\u0809"+
		"\u0810\5\u0136\u009c\2\u080a\u0810\7\u02e9\2\2\u080b\u0810\7\u02ea\2\2"+
		"\u080c\u080d\7Q\2\2\u080d\u0810\7\u01a5\2\2\u080e\u0810\7\u00c2\2\2\u080f"+
		"\u0809\3\2\2\2\u080f\u080a\3\2\2\2\u080f\u080b\3\2\2\2\u080f\u080c\3\2"+
		"\2\2\u080f\u080e\3\2\2\2\u0810\u00e9\3\2\2\2\u0811\u0812\5\u01c4\u00e3"+
		"\2\u0812\u0813\7\23\2\2\u0813\u0814\5\u01c4\u00e3\2\u0814\u00eb\3\2\2"+
		"\2\u0815\u0816\7\27\2\2\u0816\u00ed\3\2\2\2\u0817\u0818\5\u013a\u009e"+
		"\2\u0818\u0819\7\177\2\2\u0819\u081a\7\u01a6\2\2\u081a\u00ef\3\2\2\2\u081b"+
		"\u0820\5\u00f2z\2\u081c\u081d\7\26\2\2\u081d\u081f\5\u00f2z\2\u081e\u081c"+
		"\3\2\2\2\u081f\u0822\3\2\2\2\u0820\u081e\3\2\2\2\u0820\u0821\3\2\2\2\u0821"+
		"\u00f1\3\2\2\2\u0822\u0820\3\2\2\2\u0823\u0824\7\u013f\2\2\u0824\u0825"+
		"\7\3\2\2\u0825\u082a\5\u00f4{\2\u0826\u0827\7\26\2\2\u0827\u0829\5\u00f4"+
		"{\2\u0828\u0826\3\2\2\2\u0829\u082c\3\2\2\2\u082a\u0828\3\2\2\2\u082a"+
		"\u082b\3\2\2\2\u082b\u082d\3\2\2\2\u082c\u082a\3\2\2\2\u082d\u082e\7\4"+
		"\2\2\u082e\u00f3\3\2\2\2\u082f\u0830\5\u00f6|\2\u0830\u0831\7)\2\2\u0831"+
		"\u0832\5\u00f8}\2\u0832\u0838\3\2\2\2\u0833\u0834\7[\2\2\u0834\u0838\5"+
		"\u00f6|\2\u0835\u0836\7\u00bf\2\2\u0836\u0838\7[\2\2\u0837\u082f\3\2\2"+
		"\2\u0837\u0833\3\2\2\2\u0837\u0835\3\2\2\2\u0838\u00f5\3\2\2\2\u0839\u083a"+
		"\7\27\2\2\u083a\u00f7\3\2\2\2\u083b\u083c\7\27\2\2\u083c\u00f9\3\2\2\2"+
		"\u083d\u0844\5\u00fc\177\2\u083e\u083f\7-\2\2\u083f\u0845\7\u00ac\2\2"+
		"\u0840\u0841\7-\2\2\u0841\u0842\7\u0293\2\2\u0842\u0843\7\u0142\2\2\u0843"+
		"\u0845\5\u00fc\177\2\u0844\u083e\3\2\2\2\u0844\u0840\3\2\2\2\u0845\u00fb"+
		"\3\2\2\2\u0846\u084f\5\u0086D\2\u0847\u084f\5\u0136\u009c\2\u0848\u084f"+
		"\5\u013a\u009e\2\u0849\u084f\5\u015a\u00ae\2\u084a\u084f\5\u00d8m\2\u084b"+
		"\u084f\5\u01b6\u00dc\2\u084c\u084f\5\u00fe\u0080\2\u084d\u084f\5\u0122"+
		"\u0092\2\u084e\u0846\3\2\2\2\u084e\u0847\3\2\2\2\u084e\u0848\3\2\2\2\u084e"+
		"\u0849\3\2\2\2\u084e\u084a\3\2\2\2\u084e\u084b\3\2\2\2\u084e\u084c\3\2"+
		"\2\2\u084e\u084d\3\2\2\2\u084f\u00fd\3\2\2\2\u0850\u0853\79\2\2\u0851"+
		"\u0854\5\u0102\u0082\2\u0852\u0854\5\u0104\u0083\2\u0853\u0851\3\2\2\2"+
		"\u0853\u0852\3\2\2\2\u0854\u0859\3\2\2\2\u0855\u0856\7i\2\2\u0856\u085a"+
		"\7\u00c2\2\2\u0857\u0858\7i\2\2\u0858\u085a\5\u0100\u0081\2\u0859\u0855"+
		"\3\2\2\2\u0859\u0857\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\7m\2\2\u085c"+
		"\u00ff\3\2\2\2\u085d\u085e\5\u0080A\2\u085e\u0101\3\2\2\2\u085f\u0860"+
		"\7\u0137\2\2\u0860\u0861\5\u0106\u0084\2\u0861\u0864\7\u0122\2\2\u0862"+
		"\u0865\5\u0100\u0081\2\u0863\u0865\7\u00c2\2\2\u0864\u0862\3\2\2\2\u0864"+
		"\u0863\3\2\2\2\u0865\u0103\3\2\2\2\u0866\u0867\5\u0080A\2\u0867\u0868"+
		"\7\u0137\2\2\u0868\u0869\5\u0080A\2\u0869\u086c\7\u0122\2\2\u086a\u086d"+
		"\5\u0100\u0081\2\u086b\u086d\7\u00c2\2\2\u086c\u086a\3\2\2\2\u086c\u086b"+
		"\3\2\2\2\u086d\u0105\3\2\2\2\u086e\u0870\7\u00c1\2\2\u086f\u086e\3\2\2"+
		"\2\u086f\u0870\3\2\2\2\u0870\u087a\3\2\2\2\u0871\u0874\5\u0108\u0085\2"+
		"\u0872\u0873\7\u018e\2\2\u0873\u0875";
	private static final String _serializedATNSegment1 =
		"\7\31\2\2\u0874\u0872\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u087b\3\2\2\2"+
		"\u0876\u0877\7\3\2\2\u0877\u0878\5\u0106\u0084\2\u0878\u0879\7\4\2\2\u0879"+
		"\u087b\3\2\2\2\u087a\u0871\3\2\2\2\u087a\u0876\3\2\2\2\u087b\u0889\3\2"+
		"\2\2\u087c\u087e\t\34\2\2\u087d\u087f\7\u00c1\2\2\u087e\u087d\3\2\2\2"+
		"\u087e\u087f\3\2\2\2\u087f\u0885\3\2\2\2\u0880\u0886\5\u0108\u0085\2\u0881"+
		"\u0882\7\3\2\2\u0882\u0883\5\u0106\u0084\2\u0883\u0884\7\4\2\2\u0884\u0886"+
		"\3\2\2\2\u0885\u0880\3\2\2\2\u0885\u0881\3\2\2\2\u0886\u0888\3\2\2\2\u0887"+
		"\u087c\3\2\2\2\u0888\u088b\3\2\2\2\u0889\u0887\3\2\2\2\u0889\u088a\3\2"+
		"\2\2\u088a\u0107\3\2\2\2\u088b\u0889\3\2\2\2\u088c\u0897\5\u010a\u0086"+
		"\2\u088d\u0897\5\u010e\u0088\2\u088e\u0897\5\u0110\u0089\2\u088f\u0897"+
		"\5\u0112\u008a\2\u0890\u0897\5\u0114\u008b\2\u0891\u0897\5\u0116\u008c"+
		"\2\u0892\u0897\5\u0118\u008d\2\u0893\u0897\5\u011a\u008e\2\u0894\u0897"+
		"\5\u011c\u008f\2\u0895\u0897\5\u011e\u0090\2\u0896\u088c\3\2\2\2\u0896"+
		"\u088d\3\2\2\2\u0896\u088e\3\2\2\2\u0896\u088f\3\2\2\2\u0896\u0890\3\2"+
		"\2\2\u0896\u0891\3\2\2\2\u0896\u0892\3\2\2\2\u0896\u0893\3\2\2\2\u0896"+
		"\u0894\3\2\2\2\u0896\u0895\3\2\2\2\u0897\u0109\3\2\2\2\u0898\u0899\5\u0080"+
		"A\2\u0899\u089a\5|?\2\u089a\u089b\5\u0080A\2\u089b\u08a1\3\2\2\2\u089c"+
		"\u089d\5\u010c\u0087\2\u089d\u089e\5|?\2\u089e\u089f\5\u010c\u0087\2\u089f"+
		"\u08a1\3\2\2\2\u08a0\u0898\3\2\2\2\u08a0\u089c\3\2\2\2\u08a1\u010b\3\2"+
		"\2\2\u08a2\u08a3\7\3\2\2\u08a3\u08a8\5\u0080A\2\u08a4\u08a5\7\26\2\2\u08a5"+
		"\u08a7\5\u0080A\2\u08a6\u08a4\3\2\2\2\u08a7\u08aa\3\2\2\2\u08a8\u08a6"+
		"\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08ab\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab"+
		"\u08ac\7\4\2\2\u08ac\u010d\3\2\2\2\u08ad\u08ae\5\u0080A\2\u08ae\u08af"+
		"\5|?\2\u08af\u08b0\t\35\2\2\u08b0\u08b1\7\3\2\2\u08b1\u08b2\5\u01b8\u00dd"+
		"\2\u08b2\u08b3\7\4\2\2\u08b3\u08c3\3\2\2\2\u08b4\u08b5\5\u010c\u0087\2"+
		"\u08b5\u08b6\7\b\2\2\u08b6\u08b7\t\36\2\2\u08b7\u08b8\7\3\2\2\u08b8\u08b9"+
		"\5\u01b8\u00dd\2\u08b9\u08ba\7\4\2\2\u08ba\u08c3\3\2\2\2\u08bb\u08bc\5"+
		"\u010c\u0087\2\u08bc\u08bd\7\r\2\2\u08bd\u08be\7!\2\2\u08be\u08bf\7\3"+
		"\2\2\u08bf\u08c0\5\u01b8\u00dd\2\u08c0\u08c1\7\4\2\2\u08c1\u08c3\3\2\2"+
		"\2\u08c2\u08ad\3\2\2\2\u08c2\u08b4\3\2\2\2\u08c2\u08bb\3\2\2\2\u08c3\u010f"+
		"\3\2\2\2\u08c4\u08c5\7(\2\2\u08c5\u08c6\7\3\2\2\u08c6\u08c7\5\u0120\u0091"+
		"\2\u08c7\u08c8\7\30\2\2\u08c8\u08c9\7\4\2\2\u08c9\u0111\3\2\2\2\u08ca"+
		"\u08cc\5\u0080A\2\u08cb\u08cd\7\u00c1\2\2\u08cc\u08cb\3\2\2\2\u08cc\u08cd"+
		"\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08cf\7\63\2\2\u08cf\u08d0\5\u0080"+
		"A\2\u08d0\u08d1\7\u0143\2\2\u08d1\u08d2\5\u0080A\2\u08d2\u0113\3\2\2\2"+
		"\u08d3\u08d4\5\u0080A\2\u08d4\u08d6\7\u009d\2\2\u08d5\u08d7\7\u00c1\2"+
		"\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9"+
		"\7a\2\2\u08d9\u08da\7\u0081\2\2\u08da\u08db\5\u0080A\2\u08db\u0115\3\2"+
		"\2\2\u08dc\u08dd\7v\2\2\u08dd\u08de\7\3\2\2\u08de\u08df\5\u01b8\u00dd"+
		"\2\u08df\u08e0\7\4\2\2\u08e0\u0117\3\2\2\2\u08e1\u08e3\5\u0080A\2\u08e2"+
		"\u08e4\7\u00c1\2\2\u08e3\u08e2\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5"+
		"\3\2\2\2\u08e5\u08f5\7\u0092\2\2\u08e6\u08e7\7\3\2\2\u08e7\u08e8\5\u01b8"+
		"\u00dd\2\u08e8\u08e9\7\4\2\2\u08e9\u08f6\3\2\2\2\u08ea\u08eb\7\3\2\2\u08eb"+
		"\u08f0\5\u0080A\2\u08ec\u08ed\7\26\2\2\u08ed\u08ef\5\u0080A\2\u08ee\u08ec"+
		"\3\2\2\2\u08ef\u08f2\3\2\2\2\u08f0\u08ee\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1"+
		"\u08f3\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f3\u08f4\7\4\2\2\u08f4\u08f6\3\2"+
		"\2\2\u08f5\u08e6\3\2\2\2\u08f5\u08ea\3\2\2\2\u08f6\u0119\3\2\2\2\u08f7"+
		"\u08f9\5\u0080A\2\u08f8\u08fa\7\u00c1\2\2\u08f9\u08f8\3\2\2\2\u08f9\u08fa"+
		"\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\7\u00aa\2\2\u08fc\u08ff\5\u0080"+
		"A\2\u08fd\u08fe\7q\2\2\u08fe\u0900\5\u0080A\2\u08ff\u08fd\3\2\2\2\u08ff"+
		"\u0900\3\2\2\2\u0900\u011b\3\2\2\2\u0901\u0909\5\u0080A\2\u0902\u0904"+
		"\7\u009d\2\2\u0903\u0905\7\u00c1\2\2\u0904\u0903\3\2\2\2\u0904\u0905\3"+
		"\2\2\2\u0905\u0906\3\2\2\2\u0906\u090a\7\u00c2\2\2\u0907\u090a\7\u0160"+
		"\2\2\u0908\u090a\7\u016b\2\2\u0909\u0902\3\2\2\2\u0909\u0907\3\2\2\2\u0909"+
		"\u0908\3\2\2\2\u090a\u011d\3\2\2\2\u090b\u090c\7\u013e\2\2\u090c\u090d"+
		"\7\3\2\2\u090d\u091b\7\27\2\2\u090e\u0911\7\u0173\2\2\u090f\u0910\7\65"+
		"\2\2\u0910\u0912\7\u017d\2\2\u0911\u090f\3\2\2\2\u0911\u0912\3\2\2\2\u0912"+
		"\u0913\3\2\2\2\u0913\u0918\5\u0080A\2\u0914\u0915\7\26\2\2\u0915\u0917"+
		"\5\u0080A\2\u0916\u0914\3\2\2\2\u0917\u091a\3\2\2\2\u0918\u0916\3\2\2"+
		"\2\u0918\u0919\3\2\2\2\u0919\u091c\3\2\2\2\u091a\u0918\3\2\2\2\u091b\u090e"+
		"\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u091e\7\4\2\2\u091e"+
		"\u011f\3\2\2\2\u091f\u0922\5\u0160\u00b1\2\u0920\u0922\5\u0122\u0092\2"+
		"\u0921\u091f\3\2\2\2\u0921\u0920\3\2\2\2\u0922\u0121\3\2\2\2\u0923\u0924"+
		"\7:\2\2\u0924\u0928\7\3\2\2\u0925\u0929\5\u0080A\2\u0926\u0929\7\u00c2"+
		"\2\2\u0927\u0929\5\u0124\u0093\2\u0928\u0925\3\2\2\2\u0928\u0926\3\2\2"+
		"\2\u0928\u0927\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\7)\2\2\u092b\u092c"+
		"\5\u0126\u0094\2\u092c\u092d\7\4\2\2\u092d\u0123\3\2\2\2\u092e\u092f\7"+
		"\7\2\2\u092f\u0125\3\2\2\2\u0930\u0934\5\u0128\u0095\2\u0931\u0934\5\u0132"+
		"\u009a\2\u0932\u0934\5\u0134\u009b\2\u0933\u0930\3\2\2\2\u0933\u0931\3"+
		"\2\2\2\u0933\u0932\3\2\2\2\u0934\u0127\3\2\2\2\u0935\u09a1\7\u0283\2\2"+
		"\u0936\u09a1\7\u0246\2\2\u0937\u09a1\7\u0245\2\2\u0938\u09a1\7\u01f9\2"+
		"\2\u0939\u093d\t\37\2\2\u093a\u093e\5\u012a\u0096\2\u093b\u093c\7\3\2"+
		"\2\u093c\u093e\7\4\2\2\u093d\u093a\3\2\2\2\u093d\u093b\3\2\2\2\u093e\u09a1"+
		"\3\2\2\2\u093f\u0943\7\u0218\2\2\u0940\u0944\5\u012a\u0096\2\u0941\u0942"+
		"\7\3\2\2\u0942\u0944\7\4\2\2\u0943\u0940\3\2\2\2\u0943\u0941\3\2\2\2\u0944"+
		"\u09a1\3\2\2\2\u0945\u0949\7\u0234\2\2\u0946\u094a\5\u012a\u0096\2\u0947"+
		"\u0948\7\3\2\2\u0948\u094a\7\4\2\2\u0949\u0946\3\2\2\2\u0949\u0947\3\2"+
		"\2\2\u094a\u09a1\3\2\2\2\u094b\u09a1\7\u0272\2\2\u094c\u094e\7d\2\2\u094d"+
		"\u094f\7\u00dd\2\2\u094e\u094d\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u09a1"+
		"\3\2\2\2\u0950\u0952\t \2\2\u0951\u0953\7\u01a0\2\2\u0952\u0951\3\2\2"+
		"\2\u0952\u0953\3\2\2\2\u0953\u0956\3\2\2\2\u0954\u0956\7\u02ab\2\2\u0955"+
		"\u0950\3\2\2\2\u0955\u0954\3\2\2\2\u0956\u095a\3\2\2\2\u0957\u095b\5\u012c"+
		"\u0097\2\u0958\u0959\7\3\2\2\u0959\u095b\7\4\2\2\u095a\u0957\3\2\2\2\u095a"+
		"\u0958\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095d\3\2\2\2\u095c\u095e\5\u012e"+
		"\u0098\2\u095d\u095c\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u09a1\3\2\2\2\u095f"+
		"\u0960\t \2\2\u0960\u0961\7\u0162\2\2\u0961\u0964\7\u016f\2\2\u0962\u0964"+
		"\7\u020a\2\2\u0963\u095f\3\2\2\2\u0963\u0962\3\2\2\2\u0964\u0968\3\2\2"+
		"\2\u0965\u0969\5\u012c\u0097\2\u0966\u0967\7\3\2\2\u0967\u0969\7\4\2\2"+
		"\u0968\u0965\3\2\2\2\u0968\u0966\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096b"+
		"\3\2\2\2\u096a\u096c\5\u012e\u0098\2\u096b\u096a\3\2\2\2\u096b\u096c\3"+
		"\2\2\2\u096c\u09a1\3\2\2\2\u096d\u0971\t!\2\2\u096e\u0972\5\u012c\u0097"+
		"\2\u096f\u0970\7\3\2\2\u0970\u0972\7\4\2\2\u0971\u096e\3\2\2\2\u0971\u096f"+
		"\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0974\3\2\2\2\u0973\u0975\5\u012e\u0098"+
		"\2\u0974\u0973\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u09a1\3\2\2\2\u0976\u097a"+
		"\7\u01fa\2\2\u0977\u097b\5\u012a\u0096\2\u0978\u0979\7\3\2\2\u0979\u097b"+
		"\7\4\2\2\u097a\u0977\3\2\2\2\u097a\u0978\3\2\2\2\u097a\u097b\3\2\2\2\u097b"+
		"\u09a1\3\2\2\2\u097c\u097e\7\u01fa\2\2\u097d\u097f\7\u01a0\2\2\u097e\u097d"+
		"\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u0982\3\2\2\2\u0980\u0982\7\u02aa\2"+
		"\2\u0981\u097c\3\2\2\2\u0981\u0980\3\2\2\2\u0982\u0986\3\2\2\2\u0983\u0987"+
		"\5\u012a\u0096\2\u0984\u0985\7\3\2\2\u0985\u0987\7\4\2\2\u0986\u0983\3"+
		"\2\2\2\u0986\u0984\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u09a1\3\2\2\2\u0988"+
		"\u0989\7\u01fa\2\2\u0989\u098a\7\u0162\2\2\u098a\u098d\7\u016f\2\2\u098b"+
		"\u098d\7\u0200\2\2\u098c\u0988\3\2\2\2\u098c\u098b\3\2\2\2\u098d\u0993"+
		"\3\2\2\2\u098e\u098f\7\3\2\2\u098f\u0990\7\30\2\2\u0990\u0991\7\u02f4"+
		"\2\2\u0991\u0992\3\2\2\2\u0992\u0994\7\4\2\2\u0993\u098e\3\2\2\2\u0993"+
		"\u0994\3\2\2\2\u0994\u09a1\3\2\2\2\u0995\u09a1\7\u0210\2\2\u0996\u09a1"+
		"\7\u0293\2\2\u0997\u0999\7\u0294\2\2\u0998\u099a\5\u012a\u0096\2\u0999"+
		"\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c\t\""+
		"\2\2\u099c\u099d\7\u0293\2\2\u099d\u09a1\7\u0142\2\2\u099e\u09a1\7\u027c"+
		"\2\2\u099f\u09a1\7\u01a2\2\2\u09a0\u0935\3\2\2\2\u09a0\u0936\3\2\2\2\u09a0"+
		"\u0937\3\2\2\2\u09a0\u0938\3\2\2\2\u09a0\u0939\3\2\2\2\u09a0\u093f\3\2"+
		"\2\2\u09a0\u0945\3\2\2\2\u09a0\u094b\3\2\2\2\u09a0\u094c\3\2\2\2\u09a0"+
		"\u0955\3\2\2\2\u09a0\u0963\3\2\2\2\u09a0\u096d\3\2\2\2\u09a0\u0976\3\2"+
		"\2\2\u09a0\u0981\3\2\2\2\u09a0\u098c\3\2\2\2\u09a0\u0995\3\2\2\2\u09a0"+
		"\u0996\3\2\2\2\u09a0\u0997\3\2\2\2\u09a0\u099e\3\2\2\2\u09a0\u099f\3\2"+
		"\2\2\u09a1\u0129\3\2\2\2\u09a2\u09a3\7\3\2\2\u09a3\u09a6\7\30\2\2\u09a4"+
		"\u09a5\7\26\2\2\u09a5\u09a7\7\30\2\2\u09a6\u09a4\3\2\2\2\u09a6\u09a7\3"+
		"\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\7\4\2\2\u09a9\u012b\3\2\2\2\u09aa"+
		"\u09ab\7\3\2\2\u09ab\u09ad\t#\2\2\u09ac\u09ae\t$\2\2\u09ad\u09ac\3\2\2"+
		"\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09b0\7\4\2\2\u09b0\u012d"+
		"\3\2\2\2\u09b1\u09b7\7;\2\2\u09b2\u09b4\t%\2\2\u09b3\u09b5\5\u0130\u0099"+
		"\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b8\3\2\2\2\u09b6\u09b8"+
		"\7\30\2\2\u09b7\u09b2\3\2\2\2\u09b7\u09b6\3\2\2\2\u09b8\u012f\3\2\2\2"+
		"\u09b9\u09ba\7\177\2\2\u09ba\u09bb\t&\2\2\u09bb\u09bc\7U\2\2\u09bc\u0131"+
		"\3\2\2\2\u09bd\u09be\5\u01c4\u00e3\2\u09be\u0133\3\2\2\2\u09bf\u09c0\5"+
		"\u01c4\u00e3\2\u09c0\u0135\3\2\2\2\u09c1\u09c2\t\'\2\2\u09c2\u0137\3\2"+
		"\2\2\u09c3\u09c4\7\30\2\2\u09c4\u0139\3\2\2\2\u09c5\u09c6\5\u013e\u00a0"+
		"\2\u09c6\u09c7\7\23\2\2\u09c7\u09c9\3\2\2\2\u09c8\u09c5\3\2\2\2\u09c8"+
		"\u09c9\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\5\u01c4\u00e3\2\u09cb\u013b"+
		"\3\2\2\2\u09cc\u09cd\5\u01c4\u00e3\2\u09cd\u013d\3\2\2\2\u09ce\u09cf\5"+
		"\u01c4\u00e3\2\u09cf\u013f\3\2\2\2\u09d0\u09d1\5\u01c4\u00e3\2\u09d1\u0141"+
		"\3\2\2\2\u09d2\u09d3\5\u01c4\u00e3\2\u09d3\u0143\3\2\2\2\u09d4\u09d5\5"+
		"\u0140\u00a1\2\u09d5\u09d6\7\23\2\2\u09d6\u09d7\5\u0142\u00a2\2\u09d7"+
		"\u09d8\7\23\2\2\u09d8\u09dd\3\2\2\2\u09d9\u09da\5\u0142\u00a2\2\u09da"+
		"\u09db\7\23\2\2\u09db\u09dd\3\2\2\2\u09dc\u09d4\3\2\2\2\u09dc\u09d9\3"+
		"\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09e0\5\u01c4\u00e3"+
		"\2\u09df\u09e1\5\u013e\u00a0\2\u09e0\u09df\3\2\2\2\u09e0\u09e1\3\2\2\2"+
		"\u09e1\u0145\3\2\2\2\u09e2\u09e3\5\u0142\u00a2\2\u09e3\u09e4\7\23\2\2"+
		"\u09e4\u09e6\3\2\2\2\u09e5\u09e2\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7"+
		"\3\2\2\2\u09e7\u09e8\5\u01c4\u00e3\2\u09e8\u0147\3\2\2\2\u09e9\u09ea\5"+
		"\u0142\u00a2\2\u09ea\u09eb\7\23\2\2\u09eb\u09ed\3\2\2\2\u09ec\u09e9\3"+
		"\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\5\u01c4\u00e3"+
		"\2\u09ef\u0149\3\2\2\2\u09f0\u09f1\5\u0142\u00a2\2\u09f1\u09f2\7\23\2"+
		"\2\u09f2\u09f4\3\2\2\2\u09f3\u09f0\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f5"+
		"\3\2\2\2\u09f5\u09f6\5\u01c4\u00e3\2\u09f6\u014b\3\2\2\2\u09f7\u09f8\5"+
		"\u0140\u00a1\2\u09f8\u09f9\7\23\2\2\u09f9\u09fa\5\u0142\u00a2\2\u09fa"+
		"\u09fb\7\23\2\2\u09fb\u0a00\3\2\2\2\u09fc\u09fd\5\u0142\u00a2\2\u09fd"+
		"\u09fe\7\23\2\2\u09fe\u0a00\3\2\2\2\u09ff\u09f7\3\2\2\2\u09ff\u09fc\3"+
		"\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01\u0a02\5\u01c4\u00e3"+
		"\2\u0a02\u014d\3\2\2\2\u0a03\u0a04\5\u01c4\u00e3\2\u0a04\u014f\3\2\2\2"+
		"\u0a05\u0a06\5\u01c4\u00e3\2\u0a06\u0151\3\2\2\2\u0a07\u0a08\5\u01c4\u00e3"+
		"\2\u0a08\u0153\3\2\2\2\u0a09\u0a0a\5\u01c4\u00e3\2\u0a0a\u0155\3\2\2\2"+
		"\u0a0b\u0a0c\5\u0142\u00a2\2\u0a0c\u0a0d\7\23\2\2\u0a0d\u0a0f\3\2\2\2"+
		"\u0a0e\u0a0b\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a11"+
		"\5\u01c4\u00e3\2\u0a11\u0157\3\2\2\2\u0a12\u0a13\5\u0142\u00a2\2\u0a13"+
		"\u0a14\7\23\2\2\u0a14\u0a16\3\2\2\2\u0a15\u0a12\3\2\2\2\u0a15\u0a16\3"+
		"\2\2\2\u0a16\u0a17\3\2\2\2\u0a17\u0a18\5\u01c4\u00e3\2\u0a18\u0159\3\2"+
		"\2\2\u0a19\u0a1d\7\24\2\2\u0a1a\u0a1b\5\u015e\u00b0\2\u0a1b\u0a1c\7\23"+
		"\2\2\u0a1c\u0a1e\3\2\2\2\u0a1d\u0a1a\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e"+
		"\u0a1f\3\2\2\2\u0a1f\u0a2a\5\u015c\u00af\2\u0a20\u0a22\7\u015e\2\2\u0a21"+
		"\u0a20\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a27\7\24"+
		"\2\2\u0a24\u0a25\5\u015e\u00b0\2\u0a25\u0a26\7\23\2\2\u0a26\u0a28\3\2"+
		"\2\2\u0a27\u0a24\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29"+
		"\u0a2b\5\u015c\u00af\2\u0a2a\u0a21\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u015b"+
		"\3\2\2\2\u0a2c\u0a2d\5\u01c4\u00e3\2\u0a2d\u015d\3\2\2\2\u0a2e\u0a2f\5"+
		"\u01c4\u00e3\2\u0a2f\u015f\3\2\2\2\u0a30\u0a31\5\u0142\u00a2\2\u0a31\u0a32"+
		"\7\23\2\2\u0a32\u0a34\3\2\2\2\u0a33\u0a30\3\2\2\2\u0a33\u0a34\3\2\2\2"+
		"\u0a34\u0a35\3\2\2\2\u0a35\u0a38\5\u01c4\u00e3\2\u0a36\u0a38\5\u015a\u00ae"+
		"\2\u0a37\u0a33\3\2\2\2\u0a37\u0a36\3\2\2\2\u0a38\u0161\3\2\2\2\u0a39\u0a3c"+
		"\7\u009c\2\2\u0a3a\u0a3d\5\u0160\u00b1\2\u0a3b\u0a3d\5\u0094K\2\u0a3c"+
		"\u0a3a\3\2\2\2\u0a3c\u0a3b\3\2\2\2\u0a3d\u0a42\3\2\2\2\u0a3e\u0a3f\7\26"+
		"\2\2\u0a3f\u0a41\5\u0160\u00b1\2\u0a40\u0a3e\3\2\2\2\u0a41\u0a44\3\2\2"+
		"\2\u0a42\u0a40\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0163\3\2\2\2\u0a44\u0a42"+
		"\3\2\2\2\u0a45\u0a47\7)\2\2\u0a46\u0a45\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47"+
		"\u0a48\3\2\2\2\u0a48\u0a54\5\u013e\u00a0\2\u0a49\u0a4a\7\3\2\2\u0a4a\u0a4f"+
		"\5\u013c\u009f\2\u0a4b\u0a4c\7\26\2\2\u0a4c\u0a4e\5\u013c\u009f\2\u0a4d"+
		"\u0a4b\3\2\2\2\u0a4e\u0a51\3\2\2\2\u0a4f\u0a4d\3\2\2\2\u0a4f\u0a50\3\2"+
		"\2\2\u0a50\u0a52\3\2\2\2\u0a51\u0a4f\3\2\2\2\u0a52\u0a53\7\4\2\2\u0a53"+
		"\u0a55\3\2\2\2\u0a54\u0a49\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0165\3\2"+
		"\2\2\u0a56\u0a65\7\u0081\2\2\u0a57\u0a59\7\3\2\2\u0a58\u0a57\3\2\2\2\u0a59"+
		"\u0a5c\3\2\2\2\u0a5a\u0a58\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a5d\3\2"+
		"\2\2\u0a5c\u0a5a\3\2\2\2\u0a5d\u0a61\5\u0168\u00b5\2\u0a5e\u0a60\7\4\2"+
		"\2\u0a5f\u0a5e\3\2\2\2\u0a60\u0a63\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a61\u0a62"+
		"\3\2\2\2\u0a62\u0a66\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a64\u0a66\5\u017e\u00c0"+
		"\2\u0a65\u0a5a\3\2\2\2\u0a65\u0a64\3\2\2\2\u0a66\u0a7a\3\2\2\2\u0a67\u0a76"+
		"\7\26\2\2\u0a68\u0a6a\7\3\2\2\u0a69\u0a68\3\2\2\2\u0a6a\u0a6d\3\2\2\2"+
		"\u0a6b\u0a69\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6e\3\2\2\2\u0a6d\u0a6b"+
		"\3\2\2\2\u0a6e\u0a72\5\u0168\u00b5\2\u0a6f\u0a71\7\4\2\2\u0a70\u0a6f\3"+
		"\2\2\2\u0a71\u0a74\3\2\2\2\u0a72\u0a70\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73"+
		"\u0a77\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a75\u0a77\5\u017e\u00c0\2\u0a76\u0a6b"+
		"\3\2\2\2\u0a76\u0a75\3\2\2\2\u0a77\u0a79\3\2\2\2\u0a78\u0a67\3\2\2\2\u0a79"+
		"\u0a7c\3\2\2\2\u0a7a\u0a78\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0167\3\2"+
		"\2\2\u0a7c\u0a7a\3\2\2\2\u0a7d\u0b04\5\u016a\u00b6\2\u0a7e\u0b04\5\u0170"+
		"\u00b9\2\u0a7f\u0b04\5\u0172\u00ba\2\u0a80\u0b04\5\u0174\u00bb\2\u0a81"+
		"\u0b04\5\u017a\u00be\2\u0a82\u0b04\5\u017c\u00bf\2\u0a83\u0b04\5\u017e"+
		"\u00c0\2\u0a84\u0ab5\5\u016a\u00b6\2\u0a85\u0ab5\5\u0170\u00b9\2\u0a86"+
		"\u0ab5\5\u0174\u00bb\2\u0a87\u0ab5\5\u017a\u00be\2\u0a88\u0ab5\5\u017c"+
		"\u00bf\2\u0a89\u0ab5\5\u017e\u00c0\2\u0a8a\u0a8c\7\3\2\2\u0a8b\u0a8a\3"+
		"\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e"+
		"\u0a8f\3\2\2\2\u0a8f\u0a91\5\u0168\u00b5\2\u0a90\u0a92\7\4\2\2\u0a91\u0a90"+
		"\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u0a91\3\2\2\2\u0a93\u0a94\3\2\2\2\u0a94"+
		"\u0ab5\3\2\2\2\u0a95\u0aa7\5\u016a\u00b6\2\u0a96\u0aa7\5\u0170\u00b9\2"+
		"\u0a97\u0aa7\5\u0174\u00bb\2\u0a98\u0aa7\5\u017a\u00be\2\u0a99\u0aa7\5"+
		"\u017c\u00bf\2\u0a9a\u0a9c\7\3\2\2\u0a9b\u0a9a\3\2\2\2\u0a9c\u0a9d\3\2"+
		"\2\2\u0a9d\u0a9b\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f"+
		"\u0aa1\5\u0168\u00b5\2\u0aa0\u0aa2\7\4\2\2\u0aa1\u0aa0\3\2\2\2\u0aa2\u0aa3"+
		"\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa7\3\2\2\2\u0aa5"+
		"\u0aa7\5\u017e\u00c0\2\u0aa6\u0a95\3\2\2\2\u0aa6\u0a96\3\2\2\2\u0aa6\u0a97"+
		"\3\2\2\2\u0aa6\u0a98\3\2\2\2\u0aa6\u0a99\3\2\2\2\u0aa6\u0a9b\3\2\2\2\u0aa6"+
		"\u0aa5\3\2\2\2\u0aa7\u0aad\3\2\2\2\u0aa8\u0aae\7\u0097\2\2\u0aa9\u0aab"+
		"\t(\2\2\u0aaa\u0aac\7\u00d1\2\2\u0aab\u0aaa\3\2\2\2\u0aab\u0aac\3\2\2"+
		"\2\u0aac\u0aae\3\2\2\2\u0aad\u0aa8\3\2\2\2\u0aad\u0aa9\3\2\2\2\u0aae\u0aaf"+
		"\3\2\2\2\u0aaf\u0ab0\7\u00a1\2\2\u0ab0\u0ab1\5\u0168\u00b5\2\u0ab1\u0ab2"+
		"\7\u00c9\2\2\u0ab2\u0ab3\5\u0180\u00c1\2\u0ab3\u0ab5\3\2\2\2\u0ab4\u0a84"+
		"\3\2\2\2\u0ab4\u0a85\3\2\2\2\u0ab4\u0a86\3\2\2\2\u0ab4\u0a87\3\2\2\2\u0ab4"+
		"\u0a88\3\2\2\2\u0ab4\u0a89\3\2\2\2\u0ab4\u0a8b\3\2\2\2\u0ab4\u0aa6\3\2"+
		"\2\2\u0ab5\u0abb\3\2\2\2\u0ab6\u0abc\7\u0097\2\2\u0ab7\u0ab9\t(\2\2\u0ab8"+
		"\u0aba\7\u00d1\2\2\u0ab9\u0ab8\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u0abc"+
		"\3\2\2\2\u0abb\u0ab6\3\2\2\2\u0abb\u0ab7\3\2\2\2\u0abc\u0abd\3\2\2\2\u0abd"+
		"\u0abe\7\u00a1\2\2\u0abe\u0abf\5\u0168\u00b5\2\u0abf\u0ac0\7\u00c9\2\2"+
		"\u0ac0\u0ac1\5\u0180\u00c1\2\u0ac1\u0b04\3\2\2\2\u0ac2\u0af3\5\u016a\u00b6"+
		"\2\u0ac3\u0af3\5\u0170\u00b9\2\u0ac4\u0af3\5\u0174\u00bb\2\u0ac5\u0af3"+
		"\5\u017a\u00be\2\u0ac6\u0af3\5\u017c\u00bf\2\u0ac7\u0af3\5\u017e\u00c0"+
		"\2\u0ac8\u0aca\7\3\2\2\u0ac9\u0ac8\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u0ac9"+
		"\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0acf\5\u0168\u00b5"+
		"\2\u0ace\u0ad0\7\4\2\2\u0acf\u0ace\3\2\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0acf"+
		"\3\2\2\2\u0ad1\u0ad2\3\2\2\2\u0ad2\u0af3\3\2\2\2\u0ad3\u0ae5\5\u016a\u00b6"+
		"\2\u0ad4\u0ae5\5\u0170\u00b9\2\u0ad5\u0ae5\5\u0174\u00bb\2\u0ad6\u0ae5"+
		"\5\u017a\u00be\2\u0ad7\u0ae5\5\u017c\u00bf\2\u0ad8\u0ada\7\3\2\2\u0ad9"+
		"\u0ad8\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0ad9\3\2\2\2\u0adb\u0adc\3\2"+
		"\2\2\u0adc\u0add\3\2\2\2\u0add\u0adf\5\u0168\u00b5\2\u0ade\u0ae0\7\4\2"+
		"\2\u0adf\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae2"+
		"\3\2\2\2\u0ae2\u0ae5\3\2\2\2\u0ae3\u0ae5\5\u017e\u00c0\2\u0ae4\u0ad3\3"+
		"\2\2\2\u0ae4\u0ad4\3\2\2\2\u0ae4\u0ad5\3\2\2\2\u0ae4\u0ad6\3\2\2\2\u0ae4"+
		"\u0ad7\3\2\2\2\u0ae4\u0ad9\3\2\2\2\u0ae4\u0ae3\3\2\2\2\u0ae5\u0aeb\3\2"+
		"\2\2\u0ae6\u0aec\7\u0097\2\2\u0ae7\u0ae9\t(\2\2\u0ae8\u0aea\7\u00d1\2"+
		"\2\u0ae9\u0ae8\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aec\3\2\2\2\u0aeb\u0ae6"+
		"\3\2\2\2\u0aeb\u0ae7\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u0aee\7\u00a1\2"+
		"\2\u0aee\u0aef\5\u0168\u00b5\2\u0aef\u0af0\7\u00c9\2\2\u0af0\u0af1\5\u0180"+
		"\u00c1\2\u0af1\u0af3\3\2\2\2\u0af2\u0ac2\3\2\2\2\u0af2\u0ac3\3\2\2\2\u0af2"+
		"\u0ac4\3\2\2\2\u0af2\u0ac5\3\2\2\2\u0af2\u0ac6\3\2\2\2\u0af2\u0ac7\3\2"+
		"\2\2\u0af2\u0ac9\3\2\2\2\u0af2\u0ae4\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4"+
		"\u0af5\7\u01ab\2\2\u0af5\u0af6\7\u00a1\2\2\u0af6\u0af7\5\u0168\u00b5\2"+
		"\u0af7\u0b04\3\2\2\2\u0af8\u0afa\7\3\2\2\u0af9\u0af8\3\2\2\2\u0afa\u0afb"+
		"\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afb\u0afc\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd"+
		"\u0aff\5\u0168\u00b5\2\u0afe\u0b00\7\4\2\2\u0aff\u0afe\3\2\2\2\u0b00\u0b01"+
		"\3\2\2\2\u0b01\u0aff\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b04\3\2\2\2\u0b03"+
		"\u0a7d\3\2\2\2\u0b03\u0a7e\3\2\2\2\u0b03\u0a7f\3\2\2\2\u0b03\u0a80\3\2"+
		"\2\2\u0b03\u0a81\3\2\2\2\u0b03\u0a82\3\2\2\2\u0b03\u0a83\3\2\2\2\u0b03"+
		"\u0ab4\3\2\2\2\u0b03\u0af2\3\2\2\2\u0b03\u0af9\3\2\2\2\u0b04\u0169\3\2"+
		"\2\2\u0b05\u0b09\5\u0144\u00a3\2\u0b06\u0b08\5\u016c\u00b7\2\u0b07\u0b06"+
		"\3\2\2\2\u0b08\u0b0b\3\2\2\2\u0b09\u0b07\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a"+
		"\u0b0d\3\2\2\2\u0b0b\u0b09\3\2\2\2\u0b0c\u0b0e\5\u0164\u00b3\2\u0b0d\u0b0c"+
		"\3\2\2\2\u0b0d\u0b0e\3\2\2\2\u0b0e\u016b\3\2\2\2\u0b0f\u0b10\7\177\2\2"+
		"\u0b10\u0b1e\t)\2\2\u0b11\u0b12\7)\2\2\u0b12\u0b13\7\u00c6\2\2\u0b13\u0b1f"+
		"\5\u0080A\2\u0b14\u0b15\7\u0081\2\2\u0b15\u0b16\5\u0080A\2\u0b16\u0b17"+
		"\7\u0123\2\2\u0b17\u0b18\5\u0080A\2\u0b18\u0b1f\3\2\2\2\u0b19\u0b1a\7"+
		"\63\2\2\u0b1a\u0b1b\5\u0080A\2\u0b1b\u0b1c\7\u0143\2\2\u0b1c\u0b1d\5\u0080"+
		"A\2\u0b1d\u0b1f\3\2\2\2\u0b1e\u0b11\3\2\2\2\u0b1e\u0b14\3\2\2\2\u0b1e"+
		"\u0b19\3\2\2\2\u0b1f\u016d\3\2\2\2\u0b20\u0b21\7\177\2\2\u0b21\u0b22\7"+
		"\u01e0\2\2\u0b22\u0b23\7\u00c6\2\2\u0b23\u0b2e\7\u01a8\2\2\u0b24\u0b25"+
		"\7\u0081\2\2\u0b25\u0b26\5\u0080A\2\u0b26\u0b27\7\u0123\2\2\u0b27\u0b28"+
		"\5\u0080A\2\u0b28\u0b2f\3\2\2\2\u0b29\u0b2a\7\63\2\2\u0b2a\u0b2b\5\u0080"+
		"A\2\u0b2b\u0b2c\7\u0143\2\2\u0b2c\u0b2d\5\u0080A\2\u0b2d\u0b2f\3\2\2\2"+
		"\u0b2e\u0b24\3\2\2\2\u0b2e\u0b29\3\2\2\2\u0b2f\u016f\3\2\2\2\u0b30\u0b32"+
		"\7\u0120\2\2\u0b31\u0b30\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b33\3\2\2"+
		"\2\u0b33\u0b34\7\3\2\2\u0b34\u0b35\5\u01b8\u00dd\2\u0b35\u0b37\7\4\2\2"+
		"\u0b36\u0b38\5\u0164\u00b3\2\u0b37\u0b36\3\2\2\2\u0b37\u0b38\3\2\2\2\u0b38"+
		"\u0171\3\2\2\2\u0b39\u0b3a\7}\2\2\u0b3a\u0b3b\7\u0120\2\2\u0b3b\u0b3c"+
		"\7\3\2\2\u0b3c\u0b3d\5\60\31\2\u0b3d\u0b3f\7\4\2\2\u0b3e\u0b40\5\u0164"+
		"\u00b3\2\u0b3f\u0b3e\3\2\2\2\u0b3f\u0b40\3\2\2\2\u0b40\u0b4b\3\2\2\2\u0b41"+
		"\u0b42\t*\2\2\u0b42\u0b43\7\u0120\2\2\u0b43\u0b4b\5\64\33\2\u0b44\u0b45"+
		"\7\u00c8\2\2\u0b45\u0b46\7\u0120\2\2\u0b46\u0b4b\5*\26\2\u0b47\u0b48\7"+
		"}\2\2\u0b48\u0b49\7\u0120\2\2\u0b49\u0b4b\5\62\32\2\u0b4a\u0b39\3\2\2"+
		"\2\u0b4a\u0b41\3\2\2\2\u0b4a\u0b44\3\2\2\2\u0b4a\u0b47\3\2\2\2\u0b4b\u0173"+
		"\3\2\2\2\u0b4c\u0b4d\7\u0120\2\2\u0b4d\u0b52\7\3\2\2\u0b4e\u0b53\5\u00d4"+
		"k\2\u0b4f\u0b53\5\u00b0Y\2\u0b50\u0b53\5\u00b2Z\2\u0b51\u0b53\5\u01c4"+
		"\u00e3\2\u0b52\u0b4e\3\2\2\2\u0b52\u0b4f\3\2\2\2\u0b52\u0b50\3\2\2\2\u0b52"+
		"\u0b51\3\2\2\2\u0b53\u0b54\3\2\2\2\u0b54\u0b58\7\3\2\2\u0b55\u0b59\5\u0080"+
		"A\2\u0b56\u0b57\7\u0120\2\2\u0b57\u0b59\5\u0144\u00a3\2\u0b58\u0b55\3"+
		"\2\2\2\u0b58\u0b56\3\2\2\2\u0b59\u0b62\3\2\2\2\u0b5a\u0b5e\7\26\2\2\u0b5b"+
		"\u0b5f\5\u0080A\2\u0b5c\u0b5d\7\u0120\2\2\u0b5d\u0b5f\5\u0144\u00a3\2"+
		"\u0b5e\u0b5b\3\2\2\2\u0b5e\u0b5c\3\2\2\2\u0b5f\u0b61\3\2\2\2\u0b60\u0b5a"+
		"\3\2\2\2\u0b61\u0b64\3\2\2\2\u0b62\u0b60\3\2\2\2\u0b62\u0b63\3\2\2\2\u0b63"+
		"\u0b65\3\2\2\2\u0b64\u0b62\3\2\2\2\u0b65\u0b67\7\4\2\2\u0b66\u0b68\5\u0176"+
		"\u00bc\2\u0b67\u0b66\3\2\2\2\u0b67\u0b68\3\2\2\2\u0b68\u0b69\3\2\2\2\u0b69"+
		"\u0b6c\7\4\2\2\u0b6a\u0b6d\5\u0164\u00b3\2\u0b6b\u0b6d\5\u0178\u00bd\2"+
		"\u0b6c\u0b6a\3\2\2\2\u0b6c\u0b6b\3\2\2\2\u0b6c\u0b6d\3\2\2\2\u0b6d\u0175"+
		"\3\2\2\2\u0b6e\u0b70\7\u0202\2\2\u0b6f\u0b71\7\u01a9\2\2\u0b70\u0b6f\3"+
		"\2\2\2\u0b70\u0b71\3\2\2\2\u0b71\u0b72\3\2\2\2\u0b72\u0b73\t+\2\2\u0b73"+
		"\u0177\3\2\2\2\u0b74\u0b76\7)\2\2\u0b75\u0b74\3\2\2\2\u0b75\u0b76\3\2"+
		"\2\2\u0b76\u0b77\3\2\2\2\u0b77\u0b78\5\u013e\u00a0\2\u0b78\u0b79\7\3\2"+
		"\2\u0b79\u0b7a\5\u013a\u009e\2\u0b7a\u0b81\5\u0126\u0094\2\u0b7b\u0b7c"+
		"\7\26\2\2\u0b7c\u0b7d\5\u013a\u009e\2\u0b7d\u0b7e\5\u0126\u0094\2\u0b7e"+
		"\u0b80\3\2\2\2\u0b7f\u0b7b\3\2\2\2\u0b80\u0b83\3\2\2\2\u0b81\u0b7f\3\2"+
		"\2\2\u0b81\u0b82\3\2\2\2\u0b82\u0b84\3\2\2\2\u0b83\u0b81\3\2\2\2\u0b84"+
		"\u0b85\7\4\2\2\u0b85\u0179\3\2\2\2\u0b86\u0b87\7\u0120\2\2\u0b87\u0b88"+
		"\7\3\2\2\u0b88\u0b89\5\u01c4\u00e3\2\u0b89\u0b8a\7\u00aa\2\2\u0b8a\u0b8b"+
		"\5\u0144\u00a3\2\u0b8b\u0b8d\7\4\2\2\u0b8c\u0b8e\5\u013e\u00a0\2\u0b8d"+
		"\u0b8c\3\2\2\2\u0b8d\u0b8e\3\2\2\2\u0b8e\u017b\3\2\2\2\u0b8f\u0b91\5\u00da"+
		"n\2\u0b90\u0b92\5\u0164\u00b3\2\u0b91\u0b90\3\2\2\2\u0b91\u0b92\3\2\2"+
		"\2\u0b92\u017d\3\2\2\2\u0b93\u0b94\7\u01aa\2\2\u0b94\u0b97\7\3\2\2\u0b95"+
		"\u0b98\5\u0186\u00c4\2\u0b96\u0b98\5\u0188\u00c5\2\u0b97\u0b95\3\2\2\2"+
		"\u0b97\u0b96\3\2\2\2\u0b98\u0ba0\3\2\2\2\u0b99\u0b9c\7\26\2\2\u0b9a\u0b9d"+
		"\5\u0186\u00c4\2\u0b9b\u0b9d\5\u0188\u00c5\2\u0b9c\u0b9a\3\2\2\2\u0b9c"+
		"\u0b9b\3\2\2\2\u0b9d\u0b9f\3\2\2\2\u0b9e\u0b99\3\2\2\2\u0b9f\u0ba2\3\2"+
		"\2\2\u0ba0\u0b9e\3\2\2\2\u0ba0\u0ba1\3\2\2\2\u0ba1\u0ba3\3\2\2\2\u0ba2"+
		"\u0ba0\3\2\2\2\u0ba3\u0ba6\7\4\2\2\u0ba4\u0ba5\7\u013b\2\2\u0ba5\u0ba7"+
		"\7\u01a6\2\2\u0ba6\u0ba4\3\2\2\2\u0ba6\u0ba7\3\2\2\2\u0ba7\u0ba9\3\2\2"+
		"\2\u0ba8\u0baa\5\u0164\u00b3\2\u0ba9\u0ba8\3\2\2\2\u0ba9\u0baa\3\2\2\2"+
		"\u0baa\u017f\3\2\2\2\u0bab\u0bb1\5\u0106\u0084\2\u0bac\u0bad\5\u0182\u00c2"+
		"\2\u0bad\u0bae\7\b\2\2\u0bae\u0baf\5\u0182\u00c2\2\u0baf\u0bb1\3\2\2\2"+
		"\u0bb0\u0bab\3\2\2\2\u0bb0\u0bac\3\2\2\2\u0bb1\u0181\3\2\2\2\u0bb2\u0bc7"+
		"\5\u013a\u009e\2\u0bb3\u0bc7\5\u0184\u00c3\2\u0bb4\u0bb5\7\u020b\2\2\u0bb5"+
		"\u0bb8\7\3\2\2\u0bb6\u0bb9\5\u013a\u009e\2\u0bb7\u0bb9\5\u0184\u00c3\2"+
		"\u0bb8\u0bb6\3\2\2\2\u0bb8\u0bb7\3\2\2\2\u0bb9\u0bc1\3\2\2\2\u0bba\u0bbd"+
		"\7\26\2\2\u0bbb\u0bbe\5\u013a\u009e\2\u0bbc\u0bbe\5\u0184\u00c3\2\u0bbd"+
		"\u0bbb\3\2\2\2\u0bbd\u0bbc\3\2\2\2\u0bbe\u0bc0\3\2\2\2\u0bbf\u0bba\3\2"+
		"\2\2\u0bc0\u0bc3\3\2\2\2\u0bc1\u0bbf\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2"+
		"\u0bc4\3\2\2\2\u0bc3\u0bc1\3\2\2\2\u0bc4\u0bc5\7\4\2\2\u0bc5\u0bc7\3\2"+
		"\2\2\u0bc6\u0bb2\3\2\2\2\u0bc6\u0bb3\3\2\2\2\u0bc6\u0bb4\3\2\2\2\u0bc7"+
		"\u0183\3\2\2\2\u0bc8\u0bc9\5\u0122\u0092\2\u0bc9\u0185\3\2\2\2\u0bca\u0bcb"+
		"\5\u0080A\2\u0bcb\u0187\3\2\2\2\u0bcc\u0bcd\5\u0080A\2\u0bcd\u0189\3\2"+
		"\2\2\u0bce\u0bcf\5\u013a\u009e\2\u0bcf\u0bd2\5|?\2\u0bd0\u0bd3\5\u013a"+
		"\u009e\2\u0bd1\u0bd3\5\u0136\u009c\2\u0bd2\u0bd0\3\2\2\2\u0bd2\u0bd1\3"+
		"\2\2\2\u0bd3\u018b\3\2\2\2\u0bd4\u0bd5\7\u0139\2\2\u0bd5\u0bd6\5\u0106"+
		"\u0084\2\u0bd6\u018d\3\2\2\2\u0bd7\u0bd8\7\u008a\2\2\u0bd8\u0bdc\7\65"+
		"\2\2\u0bd9\u0bdd\5\u0192\u00ca\2\u0bda\u0bdd\5\u0194\u00cb\2\u0bdb\u0bdd"+
		"\5\u0198\u00cd\2\u0bdc\u0bd9\3\2\2\2\u0bdc\u0bda\3\2\2\2\u0bdc\u0bdb\3"+
		"\2\2\2\u0bdd\u018f\3\2\2\2\u0bde\u0bdf\7\u008c\2\2\u0bdf\u0be0\5\u0106"+
		"\u0084\2\u0be0\u0191\3\2\2\2\u0be1\u0be6\5\u0080A\2\u0be2\u0be3\7\26\2"+
		"\2\u0be3\u0be5\5\u0080A\2\u0be4\u0be2\3\2\2\2\u0be5\u0be8\3\2\2\2\u0be6"+
		"\u0be4\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0193\3\2\2\2\u0be8\u0be6\3\2"+
		"\2\2\u0be9\u0bea\7\u015c\2\2\u0bea\u0beb\7\u018f\2\2\u0beb\u0bec\5\u0196"+
		"\u00cc\2\u0bec\u0195\3\2\2\2\u0bed\u0bf1\7\3\2\2\u0bee\u0bf2\5\u0196\u00cc"+
		"\2\u0bef\u0bf2\5\u0192\u00ca\2\u0bf0\u0bf2\5\u0198\u00cd\2\u0bf1\u0bee"+
		"\3\2\2\2\u0bf1\u0bef\3\2\2\2\u0bf1\u0bf0\3\2\2\2\u0bf2\u0bfb\3\2\2\2\u0bf3"+
		"\u0bf7\7\26\2\2\u0bf4\u0bf8\5\u0196\u00cc\2\u0bf5\u0bf8\5\u0192\u00ca"+
		"\2\u0bf6\u0bf8\5\u0198\u00cd\2\u0bf7\u0bf4\3\2\2\2\u0bf7\u0bf5\3\2\2\2"+
		"\u0bf7\u0bf6\3\2\2\2\u0bf8\u0bfa\3\2\2\2\u0bf9\u0bf3\3\2\2\2\u0bfa\u0bfd"+
		"\3\2\2\2\u0bfb\u0bf9\3\2\2\2\u0bfb\u0bfc\3\2\2\2\u0bfc\u0bfe\3\2\2\2\u0bfd"+
		"\u0bfb\3\2\2\2\u0bfe\u0bff\7\4\2\2\u0bff\u0197\3\2\2\2\u0c00\u0c01\t,"+
		"\2\2\u0c01\u0c02\7\3\2\2\u0c02\u0c03\5\u0192\u00ca\2\u0c03\u0c04\7\4\2"+
		"\2\u0c04\u0c08\3\2\2\2\u0c05\u0c06\7\3\2\2\u0c06\u0c08\7\4\2\2\u0c07\u0c00"+
		"\3\2\2\2\u0c07\u0c05\3\2\2\2\u0c08\u0199\3\2\2\2\u0c09\u0c0f\5\u0080A"+
		"\2\u0c0a\u0c0b\5~@\2\u0c0b\u0c0c\5\u0080A\2\u0c0c\u0c0e\3\2\2\2\u0c0d"+
		"\u0c0a\3\2\2\2\u0c0e\u0c11\3\2\2\2\u0c0f\u0c0d\3\2\2\2\u0c0f\u0c10\3\2"+
		"\2\2\u0c10\u0c16\3\2\2\2\u0c11\u0c0f\3\2\2\2\u0c12\u0c14\7)\2\2\u0c13"+
		"\u0c12\3\2\2\2\u0c13\u0c14\3\2\2\2\u0c14\u0c15\3\2\2\2\u0c15\u0c17\5\u013c"+
		"\u009f\2\u0c16\u0c13\3\2\2\2\u0c16\u0c17\3\2\2\2\u0c17\u0c1e\3\2\2\2\u0c18"+
		"\u0c19\5\u0144\u00a3\2\u0c19\u0c1a\7\23\2\2\u0c1a\u0c1b\7\20\2\2\u0c1b"+
		"\u0c1e\3\2\2\2\u0c1c\u0c1e\5\u019c\u00cf\2\u0c1d\u0c09\3\2\2\2\u0c1d\u0c18"+
		"\3\2\2\2\u0c1d\u0c1c\3\2\2\2\u0c1e\u019b\3\2\2\2\u0c1f\u0c20\7\u0198\2"+
		"\2\u0c20\u0c21\7\3\2\2\u0c21\u0c22\5\u0080A\2\u0c22\u0c23\7\4\2\2\u0c23"+
		"\u0c24\7\23\2\2\u0c24\u0c25\7\20\2\2\u0c25\u0c26\7)\2\2\u0c26\u0c27\7"+
		"\3\2\2\u0c27\u0c28\5\u013a\u009e\2\u0c28\u0c2f\5\u0126\u0094\2\u0c29\u0c2a"+
		"\7\26\2\2\u0c2a\u0c2b\5\u013a\u009e\2\u0c2b\u0c2c\5\u0126\u0094\2\u0c2c"+
		"\u0c2e\3\2\2\2\u0c2d\u0c29\3\2\2\2\u0c2e\u0c31\3\2\2\2\u0c2f\u0c2d\3\2"+
		"\2\2\u0c2f\u0c30\3\2\2\2\u0c30\u0c32\3\2\2\2\u0c31\u0c2f\3\2\2\2\u0c32"+
		"\u0c33\7\4\2\2\u0c33\u019d\3\2\2\2\u0c34\u0c36\7\u010b\2\2\u0c35\u0c37"+
		"\t-\2\2\u0c36\u0c35\3\2\2\2\u0c36\u0c37\3\2\2\2\u0c37\u0c41\3\2\2\2\u0c38"+
		"\u0c42\7\20\2\2\u0c39\u0c3e\5\u019a\u00ce\2\u0c3a\u0c3b\7\26\2\2\u0c3b"+
		"\u0c3d\5\u019a\u00ce\2\u0c3c\u0c3a\3\2\2\2\u0c3d\u0c40\3\2\2\2\u0c3e\u0c3c"+
		"\3\2\2\2\u0c3e\u0c3f\3\2\2\2\u0c3f\u0c42\3\2\2\2\u0c40\u0c3e\3\2\2\2\u0c41"+
		"\u0c38\3\2\2\2\u0c41\u0c39\3\2\2\2\u0c42\u019f\3\2\2\2\u0c43\u0c44\5\u019e"+
		"\u00d0\2\u0c44\u0c46\5\u0166\u00b4\2\u0c45\u0c47\5\u018c\u00c7\2\u0c46"+
		"\u0c45\3\2\2\2\u0c46\u0c47\3\2\2\2\u0c47\u0c49\3\2\2\2\u0c48\u0c4a\5\u018e"+
		"\u00c8\2\u0c49\u0c48\3\2\2\2\u0c49\u0c4a\3\2\2\2\u0c4a\u0c4c\3\2\2\2\u0c4b"+
		"\u0c4d\5\u0190\u00c9\2\u0c4c\u0c4b\3\2\2\2\u0c4c\u0c4d\3\2\2\2\u0c4d\u0c4f"+
		"\3\2\2\2\u0c4e\u0c50\5\u01bc\u00df\2\u0c4f\u0c4e\3\2\2\2\u0c4f\u0c50\3"+
		"\2\2\2\u0c50\u0c52\3\2\2\2\u0c51\u0c53\5\u01c0\u00e1\2\u0c52\u0c51\3\2"+
		"\2\2\u0c52\u0c53\3\2\2\2\u0c53\u0c55\3\2\2\2\u0c54\u0c56\5\u01c2\u00e2"+
		"\2\u0c55\u0c54\3\2\2\2\u0c55\u0c56\3\2\2\2\u0c56\u01a1\3\2\2\2\u0c57\u0c58"+
		"\7\u013b\2\2\u0c58\u0c5d\5\u01a6\u00d4\2\u0c59\u0c5a\7\26\2\2\u0c5a\u0c5c"+
		"\5\u01a6\u00d4\2\u0c5b\u0c59\3\2\2\2\u0c5c\u0c5f\3\2\2\2\u0c5d\u0c5b\3"+
		"\2\2\2\u0c5d\u0c5e\3\2\2\2\u0c5e\u0c61\3\2\2\2\u0c5f\u0c5d\3\2\2\2\u0c60"+
		"\u0c57\3\2\2\2\u0c60\u0c61\3\2\2\2\u0c61\u0c62\3\2\2\2\u0c62\u0c63\5\u019e"+
		"\u00d0\2\u0c63\u0c64\5\u0162\u00b2\2\u0c64\u0c66\5\u0166\u00b4\2\u0c65"+
		"\u0c67\5\u018c\u00c7\2\u0c66\u0c65\3\2\2\2\u0c66\u0c67\3\2\2\2\u0c67\u0c69"+
		"\3\2\2\2\u0c68\u0c6a\5\u018e\u00c8\2\u0c69\u0c68\3\2\2\2\u0c69\u0c6a\3"+
		"\2\2\2\u0c6a\u0c6c\3\2\2\2\u0c6b\u0c6d\5\u0190\u00c9\2\u0c6c\u0c6b\3\2"+
		"\2\2\u0c6c\u0c6d\3\2\2\2\u0c6d\u0c6f\3\2\2\2\u0c6e\u0c70\5\u01bc\u00df"+
		"\2\u0c6f\u0c6e\3\2\2\2\u0c6f\u0c70\3\2\2\2\u0c70\u0c72\3\2\2\2\u0c71\u0c73"+
		"\5\u01c0\u00e1\2\u0c72\u0c71\3\2\2\2\u0c72\u0c73\3\2\2\2\u0c73\u0c75\3"+
		"\2\2\2\u0c74\u0c76\5\u01c2\u00e2\2\u0c75\u0c74\3\2\2\2\u0c75\u0c76\3\2"+
		"\2\2\u0c76\u0c79\3\2\2\2\u0c77\u0c7a\5\u01ae\u00d8\2\u0c78\u0c7a\5\u01b2"+
		"\u00da\2\u0c79\u0c77\3\2\2\2\u0c79\u0c78\3\2\2\2\u0c79\u0c7a\3\2\2\2\u0c7a"+
		"\u0c7c\3\2\2\2\u0c7b\u0c7d\5\u01b4\u00db\2\u0c7c\u0c7b\3\2\2\2\u0c7c\u0c7d"+
		"\3\2\2\2\u0c7d\u01a3\3\2\2\2\u0c7e\u0c7f\7\u013b\2\2\u0c7f\u0c84\5\u01a6"+
		"\u00d4\2\u0c80\u0c81\7\26\2\2\u0c81\u0c83\5\u01a6\u00d4\2\u0c82\u0c80"+
		"\3\2\2\2\u0c83\u0c86\3\2\2\2\u0c84\u0c82\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85"+
		"\u0c88\3\2\2\2\u0c86\u0c84\3\2\2\2\u0c87\u0c7e\3\2\2\2\u0c87\u0c88\3\2"+
		"\2\2\u0c88\u0c89\3\2\2\2\u0c89\u0c92\5\u01b8\u00dd\2\u0c8a\u0c91\5\u01a8"+
		"\u00d5\2\u0c8b\u0c91\5\u01aa\u00d6\2\u0c8c\u0c91\5\u01ac\u00d7\2\u0c8d"+
		"\u0c91\5\u01ae\u00d8\2\u0c8e\u0c91\5\u01b2\u00da\2\u0c8f\u0c91\5\u01b4"+
		"\u00db\2\u0c90\u0c8a\3\2\2\2\u0c90\u0c8b\3\2\2\2\u0c90\u0c8c\3\2\2\2\u0c90"+
		"\u0c8d\3\2\2\2\u0c90\u0c8e\3\2\2\2\u0c90\u0c8f\3\2\2\2\u0c91\u0c94\3\2"+
		"\2\2\u0c92\u0c90\3\2\2\2\u0c92\u0c93\3\2\2\2\u0c93\u01a5\3\2\2\2\u0c94"+
		"\u0c92\3\2\2\2\u0c95\u0c96\5\u0144\u00a3\2\u0c96\u0c97\7\3\2\2\u0c97\u0c9c"+
		"\5\u013a\u009e\2\u0c98\u0c99\7\26\2\2\u0c99\u0c9b\5\u013a\u009e\2\u0c9a"+
		"\u0c98\3\2\2\2\u0c9b\u0c9e\3\2\2\2\u0c9c\u0c9a\3\2\2\2\u0c9c\u0c9d\3\2"+
		"\2\2\u0c9d\u0c9f\3\2\2\2\u0c9e\u0c9c\3\2\2\2\u0c9f\u0ca0\7\4\2\2\u0ca0"+
		"\u0ca1\7)\2\2\u0ca1\u0ca2\7\3\2\2\u0ca2\u0ca3\5\u01b8\u00dd\2\u0ca3\u0ca4"+
		"\7\4\2\2\u0ca4\u01a7\3\2\2\2\u0ca5\u0ca6\7\177\2\2\u0ca6\u0cb0\7\u012b"+
		"\2\2\u0ca7\u0ca8\7\u00c6\2\2\u0ca8\u0cad\5\u013a\u009e\2\u0ca9\u0caa\7"+
		"\26\2\2\u0caa\u0cac\5\u013a\u009e\2\u0cab\u0ca9\3\2\2\2\u0cac\u0caf\3"+
		"\2\2\2\u0cad\u0cab\3\2\2\2\u0cad\u0cae\3\2\2\2\u0cae\u0cb1\3\2\2\2\u0caf"+
		"\u0cad\3\2\2\2\u0cb0\u0ca7\3\2\2\2\u0cb0\u0cb1\3\2\2\2\u0cb1\u01a9\3\2"+
		"\2\2\u0cb2\u0cb3\7\177\2\2\u0cb3\u0cb4\7\u017c\2\2\u0cb4\u0cb5\7\u0171"+
		"\2\2\u0cb5\u01ab\3\2\2\2\u0cb6\u0cb7\7\u00cc\2\2\u0cb7\u0cb8\7\177\2\2"+
		"\u0cb8\u0cb9\7\30\2\2\u0cb9\u0cba\t.\2\2\u0cba\u01ad\3\2\2\2\u0cbb\u0cc6"+
		"\7\u013b\2\2\u0cbc\u0cbe\7\u018b\2\2\u0cbd\u0cbf\5\u01b0\u00d9\2\u0cbe"+
		"\u0cbd\3\2\2\2\u0cbe\u0cbf\3\2\2\2\u0cbf\u0cc7\3\2\2\2\u0cc0\u0cc2\7\u018c"+
		"\2\2\u0cc1\u0cc3\5\u01b0\u00d9\2\u0cc2\u0cc1\3\2\2\2\u0cc2\u0cc3\3\2\2"+
		"\2\u0cc3\u0cc7\3\2\2\2\u0cc4\u0cc7\7\u0154\2\2\u0cc5\u0cc7\7\u0199\2\2"+
		"\u0cc6\u0cbc\3\2\2\2\u0cc6\u0cc0\3\2\2\2\u0cc6\u0cc4\3\2\2\2\u0cc6\u0cc5"+
		"\3\2\2\2\u0cc7\u01af\3\2\2\2\u0cc8\u0cc9\7\u019a\2\2\u0cc9\u0cca\7\u0143"+
		"\2\2\u0cca\u0ccb\7\u00a2\2\2\u0ccb\u0ccc\t/\2\2\u0ccc\u0ccd\7\u0167\2"+
		"\2\u0ccd\u01b1\3\2\2\2\u0cce\u0ccf\7\u0191\2\2\u0ccf\u0cd0\7\u0166\2\2"+
		"\u0cd0\u0cd1\7U\2\2\u0cd1\u01b3\3\2\2\2\u0cd2\u0cd3\7\u00e8\2\2\u0cd3"+
		"\u0cd4\7\30\2\2\u0cd4\u01b5\3\2\2\2\u0cd5\u0cd6\7\3\2\2\u0cd6\u0cd7\5"+
		"\u01b8\u00dd\2\u0cd7\u0cd8\7\4\2\2\u0cd8\u01b7\3\2\2\2\u0cd9\u0cda\7\3"+
		"\2\2\u0cda\u0cdb\5\u01b8\u00dd\2\u0cdb\u0cdc\7\4\2\2\u0cdc\u0ce0\3\2\2"+
		"\2\u0cdd\u0ce0\5\u01a0\u00d1\2\u0cde\u0ce0\5\u01ba\u00de\2\u0cdf\u0cd9"+
		"\3\2\2\2\u0cdf\u0cdd\3\2\2\2\u0cdf\u0cde\3\2\2\2\u0ce0\u0cee\3\2\2\2\u0ce1"+
		"\u0ce3\t\60\2\2\u0ce2\u0ce4\t-\2\2\u0ce3\u0ce2\3\2\2\2\u0ce3\u0ce4\3\2"+
		"\2\2\u0ce4\u0cea\3\2\2\2\u0ce5\u0ceb\5\u01a0\u00d1\2\u0ce6\u0ce7\7\3\2"+
		"\2\u0ce7\u0ce8\5\u01b8\u00dd\2\u0ce8\u0ce9\7\4\2\2\u0ce9\u0ceb\3\2\2\2"+
		"\u0cea\u0ce5\3\2\2\2\u0cea\u0ce6\3\2\2\2\u0ceb\u0ced\3\2\2\2\u0cec\u0ce1"+
		"\3\2\2\2\u0ced\u0cf0\3\2\2\2\u0cee\u0cec\3\2\2\2\u0cee\u0cef\3\2\2\2\u0cef"+
		"\u0cf2\3\2\2\2\u0cf0\u0cee\3\2\2\2\u0cf1\u0cf3\5\u01bc\u00df\2\u0cf2\u0cf1"+
		"\3\2\2\2\u0cf2\u0cf3\3\2\2\2\u0cf3\u0cf5\3\2\2\2\u0cf4\u0cf6\5\u01c0\u00e1"+
		"\2\u0cf5\u0cf4\3\2\2\2\u0cf5\u0cf6\3\2\2\2\u0cf6\u0cf8\3\2\2\2\u0cf7\u0cf9"+
		"\5\u01c2\u00e2\2\u0cf8\u0cf7\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9\u01b9\3"+
		"\2\2\2\u0cfa\u0d07\7\u012f\2\2\u0cfb\u0d08\5\u0084C\2\u0cfc\u0cfd\7\3"+
		"\2\2\u0cfd\u0d02\5\u0084C\2\u0cfe\u0cff\7\26\2\2\u0cff\u0d01\5\u0084C"+
		"\2\u0d00\u0cfe\3\2\2\2\u0d01\u0d04\3\2\2\2\u0d02\u0d00\3\2\2\2\u0d02\u0d03"+
		"\3\2\2\2\u0d03\u0d05\3\2\2\2\u0d04\u0d02\3\2\2\2\u0d05\u0d06\7\4\2\2\u0d06"+
		"\u0d08\3\2\2\2\u0d07\u0cfb\3\2\2\2\u0d07\u0cfc\3\2\2\2\u0d08\u01bb\3\2"+
		"\2\2\u0d09\u0d0a\7\u00ce\2\2\u0d0a\u0d1e\7\65\2\2\u0d0b\u0d0d\5\u01be"+
		"\u00e0\2\u0d0c\u0d0e\t\24\2\2\u0d0d\u0d0c\3\2\2\2\u0d0d\u0d0e\3\2\2\2"+
		"\u0d0e\u0d16\3\2\2\2\u0d0f\u0d10\7\26\2\2\u0d10\u0d12\5\u01be\u00e0\2"+
		"\u0d11\u0d13\t\24\2\2\u0d12\u0d11\3\2\2\2\u0d12\u0d13\3\2\2\2\u0d13\u0d15"+
		"\3\2\2\2\u0d14\u0d0f\3\2\2\2\u0d15\u0d18\3\2\2\2\u0d16\u0d14\3\2\2\2\u0d16"+
		"\u0d17\3\2\2\2\u0d17\u0d1f\3\2\2\2\u0d18\u0d16\3\2\2\2\u0d19\u0d1a\7\u015f"+
		"\2\2\u0d1a\u0d1f\7\u010d\2\2\u0d1b\u0d1c\7\u00ce\2\2\u0d1c\u0d1d\7\u00c6"+
		"\2\2\u0d1d\u0d1f\5\u0144\u00a3\2\u0d1e\u0d0b\3\2\2\2\u0d1e\u0d19\3\2\2"+
		"\2\u0d1e\u0d1b\3\2\2\2\u0d1f\u01bd\3\2\2\2\u0d20\u0d24\5\u013a\u009e\2"+
		"\u0d21\u0d24\7\30\2\2\u0d22\u0d24\5\u0080A\2\u0d23\u0d20\3\2\2\2\u0d23"+
		"\u0d21\3\2\2\2\u0d23\u0d22\3\2\2\2\u0d24\u01bf\3\2\2\2\u0d25\u0d26\7\u00c7"+
		"\2\2\u0d26\u0d27\7\30\2\2\u0d27\u0d28\t.\2\2\u0d28\u01c1\3\2\2\2\u0d29"+
		"\u0d2a\7{\2\2\u0d2a\u0d2c\t\61\2\2\u0d2b\u0d2d\7\30\2\2\u0d2c\u0d2b\3"+
		"\2\2\2\u0d2c\u0d2d\3\2\2\2\u0d2d\u0d2e\3\2\2\2\u0d2e\u0d2f\t.\2\2\u0d2f"+
		"\u0d30\7\u0171\2\2\u0d30\u01c3\3\2\2\2\u0d31\u0d39\7\u02f4\2\2\u0d32\u0d39"+
		"\5\u01c6\u00e4\2\u0d33\u0d39\5\u00d8m\2\u0d34\u0d39\5\u00d4k\2\u0d35\u0d39"+
		"\5\u00b0Y\2\u0d36\u0d39\5\u00b2Z\2\u0d37\u0d39\5\u00d6l\2\u0d38\u0d31"+
		"\3\2\2\2\u0d38\u0d32\3\2\2\2\u0d38\u0d33\3\2\2\2\u0d38\u0d34\3\2\2\2\u0d38"+
		"\u0d35\3\2\2\2\u0d38\u0d36\3\2\2\2\u0d38\u0d37\3\2\2\2\u0d39\u01c5\3\2"+
		"\2\2\u0d3a\u0d3b\t\62\2\2\u0d3b\u01c7\3\2\2\2\u01a2\u01cb\u01cf\u01d2"+
		"\u01e3\u01e8\u01eb\u01f1\u01fb\u01fe\u0204\u0206\u020c\u0216\u0220\u0222"+
		"\u022a\u0233\u0239\u023d\u0248\u0250\u026a\u026c\u0277\u027c\u0281\u0284"+
		"\u0289\u028f\u0294\u029c\u029f\u02a7\u02af\u02b7\u02bd\u02c0\u02c3\u02c7"+
		"\u02cd\u02d1\u02d3\u02d8\u02de\u02e8\u02ec\u02f0\u02fb\u0300\u0303\u0308"+
		"\u0312\u0317\u031f\u0322\u0326\u032a\u032d\u0333\u0336\u033c\u0343\u0347"+
		"\u0350\u0354\u0358\u035f\u0363\u0368\u036b\u036e\u0374\u0378\u037a\u037f"+
		"\u0384\u0390\u0394\u0398\u039e\u03a2\u03ab\u03b7\u03bc\u03c5\u03cd\u03d1"+
		"\u03d4\u03d9\u03de\u03ea\u03f3\u03fe\u0402\u0406\u040f\u041b\u0427\u042c"+
		"\u0431\u0435\u0440\u0449\u044e\u0454\u0458\u045d\u0469\u0476\u047b\u0480"+
		"\u0483\u048b\u0492\u04a2\u04a6\u04b0\u04ba\u04bc\u04c3\u04c8\u04cd\u04cf"+
		"\u04d7\u04df\u04e5\u04ee\u04f4\u04fa\u04fe\u0503\u0505\u050e\u0514\u051c"+
		"\u0520\u0526\u0537\u053a\u0544\u054a\u054d\u0554\u055d\u0568\u056f\u0585"+
		"\u0590\u0596\u0599\u05a2\u05b2\u05b7\u05ba\u05be\u05c7\u05d3\u05d6\u05dd"+
		"\u05e8\u05ef\u0615\u061a\u061e\u062a\u0644\u0655\u065a\u0663\u066b\u0670"+
		"\u0674\u067b\u0687\u0690\u069d\u06a5\u06b1\u06b6\u06bf\u06c4\u06c8\u06cb"+
		"\u06d2\u06d8\u06f0\u06fe\u0700\u0702\u070f\u0711\u0719\u0722\u0729\u072e"+
		"\u0732\u0738\u0740\u0743\u0749\u074e\u0760\u0762\u076e\u0775\u077e\u0792"+
		"\u0797\u07a0\u07a6\u07ac\u07c8\u07ce\u07d4\u07d9\u07de\u07e2\u07e5\u07f0"+
		"\u07fb\u07fe\u0807\u080f\u0820\u082a\u0837\u0844\u084e\u0853\u0859\u0864"+
		"\u086c\u086f\u0874\u087a\u087e\u0885\u0889\u0896\u08a0\u08a8\u08c2\u08cc"+
		"\u08d6\u08e3\u08f0\u08f5\u08f9\u08ff\u0904\u0909\u0911\u0918\u091b\u0921"+
		"\u0928\u0933\u093d\u0943\u0949\u094e\u0952\u0955\u095a\u095d\u0963\u0968"+
		"\u096b\u0971\u0974\u097a\u097e\u0981\u0986\u098c\u0993\u0999\u09a0\u09a6"+
		"\u09ad\u09b4\u09b7\u09c8\u09dc\u09e0\u09e5\u09ec\u09f3\u09ff\u0a0e\u0a15"+
		"\u0a1d\u0a21\u0a27\u0a2a\u0a33\u0a37\u0a3c\u0a42\u0a46\u0a4f\u0a54\u0a5a"+
		"\u0a61\u0a65\u0a6b\u0a72\u0a76\u0a7a\u0a8d\u0a93\u0a9d\u0aa3\u0aa6\u0aab"+
		"\u0aad\u0ab4\u0ab9\u0abb\u0acb\u0ad1\u0adb\u0ae1\u0ae4\u0ae9\u0aeb\u0af2"+
		"\u0afb\u0b01\u0b03\u0b09\u0b0d\u0b1e\u0b2e\u0b31\u0b37\u0b3f\u0b4a\u0b52"+
		"\u0b58\u0b5e\u0b62\u0b67\u0b6c\u0b70\u0b75\u0b81\u0b8d\u0b91\u0b97\u0b9c"+
		"\u0ba0\u0ba6\u0ba9\u0bb0\u0bb8\u0bbd\u0bc1\u0bc6\u0bd2\u0bdc\u0be6\u0bf1"+
		"\u0bf7\u0bfb\u0c07\u0c0f\u0c13\u0c16\u0c1d\u0c2f\u0c36\u0c3e\u0c41\u0c46"+
		"\u0c49\u0c4c\u0c4f\u0c52\u0c55\u0c5d\u0c60\u0c66\u0c69\u0c6c\u0c6f\u0c72"+
		"\u0c75\u0c79\u0c7c\u0c84\u0c87\u0c90\u0c92\u0c9c\u0cad\u0cb0\u0cbe\u0cc2"+
		"\u0cc6\u0cdf\u0ce3\u0cea\u0cee\u0cf2\u0cf5\u0cf8\u0d02\u0d07\u0d0d\u0d12"+
		"\u0d16\u0d1e\u0d23\u0d2c\u0d38";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}