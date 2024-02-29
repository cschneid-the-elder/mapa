/*
Copyright (C) 2021 - 2024 Craig Schneiderwent.  Portions copyright (C)
2023 Martijn Rutte.  Portions copyright (C) 2023 - 2024 Maarten van Haasteren.
All rights reserved.

The authors accept no liability for damages of any kind resulting from the use
of this software.  Use at your own risk.

This software may be modified and distributed under the terms
of the MIT license. See the LICENSE file for details.

Db2 for z/OS Version 12 documentation served as the original source 
material.

The ALTER FUNCTION variations (external), (inlined SQL scalar), and
(SQL table) are all variations on each other and are contained in
the alterFunctionStatement rule.

The rule signalStatement is not a full implementation of the syntax
of the SIGNAL statement, but a subset that is possible to embed in
an application program.  Look to sqlplSignalStatement for the SQL/PL
implementation.

The rule trustedContextOptionList does not strictly match its
syntax diagram, for reasons documented with the rule.

The rule executeImmediateStatement only partially implements the
syntax of the EXECUTE IMMEDIATE	statement in order to avoid
implementing a grammar for the entire PL/I language here.  The same
is true of the prepareStatement rule.

I do not know if the SQL statement 
ALTER PROCEDURE (SQL - external)
will work with this grammar.  It's been deprecated but the syntax
is similar enough to a regular external stored procedure that it
might work.

*/


parser grammar DB2zSQLParser;

options {tokenVocab=DB2zSQLLexer;}

startRule
	: (
	sqlStatement* 
	| (sqlplProcedureStatement SQL_STATEMENT_TERMINATOR+)* 
	)
	EOF
	;

/*
The order of the releaseSavepointStatement and
releaseConnectionStatement rules is significant. In order
for savepoints to be recognized correctly the former
must come before the latter.
*/
sqlStatement
	: EXEC_SQL?
	(
	query
	| allocateCursorStatement
	| alterDatabaseStatement
	| alterFunctionStatement
	| alterIndexStatement
	| alterMaskStatement
	| alterPermissionStatement
	| alterProcedureStatement
	| alterProcedureSQLPLStatement
	| alterSequenceStatement
	| alterStogroupStatement
	| alterTableStatement
	| alterTablespaceStatement
	| alterTriggerStatement
	| alterTriggerAdvancedStatement
	| alterTrustedContextStatement
	| alterViewStatement
	| associateLocatorsStatement
	| beginDeclareSectionStatement
	| callStatement
	| closeStatement
	| commitStatement
	| commentStatement
	| connectStatement
	| createAliasStatement
	| createAuxiliaryTableStatement
	| createDatabaseStatement
	| createFunctionStatement
	| createGlobalTemporaryTableStatement
	| createIndexStatement
	| createLobTablespaceStatement
	| createMaskStatement
	| createPermissionStatement
	| createProcedureStatement
	| createProcedureSQLPLStatement
	| createRoleStatement
	| createSequenceStatement
	| createStogroupStatement
	| createTableStatement
	| createTablespaceStatement
	| createTriggerStatement
	| createTriggerAdvancedStatement
	| createTrustedContextStatement
	| createTypeArrayStatement
	| createTypeDistinctStatement
	| createVariableStatement
	| createViewStatement
	| declareCursorStatement
	| declareGlobalTemporaryTableStatement
	| declareTableStatement
	| declareVariableStatement
	| declareStatementStatement
	| deleteStatement
	| describeStatement
	| dropStatement
	| endDeclareSectionStatement
	| exchangeStatement
	| executeStatement
	| executeImmediateStatement
	| explainStatement
	| fetchStatement
	| freeLocatorStatement
	| getDiagnosticsStatement
	| grantStatement
	| holdLocatorStatement
	| includeStatement
	| insertStatement
	| labelStatement
	| lockTableStatement
	| mergeStatement
	| openStatement
	| prepareStatement
	| refreshTableStatement
	| releaseSavepointStatement
	| releaseConnectionStatement
	| renameStatement
	| revokeStatement
	| rollbackStatement
	| savepointStatement
	| setConnectionStatement
	| setEncryptionPasswordStatement
	| setPathStatement
	| setSchemaStatement
	| setSessionTimezoneStatement
	| setSpecialRegisterStatement
	| setAssignmentStatement
	| signalStatement
	| transferOwnershipStatement
	| truncateStatement
	| updateStatement
	| valuesIntoStatement
	| wheneverStatement
	)
	(SQL_STATEMENT_TERMINATOR+ | SEMICOLON+ | (END_EXEC DOT?) | EOF)
	;

/*
Added sqlplStartLabel 2023-06-05.  Pesky GOTO needs a target.
*/
sqlplProcedureStatement
	: (sqlplControlStatement
	| (sqlplStartLabel? allocateCursorStatement)
	| (sqlplStartLabel? alterDatabaseStatement)
	| (sqlplStartLabel? alterFunctionStatement)
	| (sqlplStartLabel? alterIndexStatement)
	| (sqlplStartLabel? alterMaskStatement)
	| (sqlplStartLabel? alterPermissionStatement)
	| (sqlplStartLabel? alterProcedureStatement)
	| (sqlplStartLabel? alterProcedureSQLPLStatement)
	| (sqlplStartLabel? alterSequenceStatement)
	| (sqlplStartLabel? alterStogroupStatement)
	| (sqlplStartLabel? alterTableStatement)
	| (sqlplStartLabel? alterTablespaceStatement)
	| (sqlplStartLabel? alterTriggerStatement)
	| (sqlplStartLabel? alterTrustedContextStatement)
	| (sqlplStartLabel? alterViewStatement)
	| (sqlplStartLabel? associateLocatorsStatement)
	| beginDeclareSectionStatement
	| (sqlplStartLabel? callStatement)
	| (sqlplStartLabel? closeStatement)
	| (sqlplStartLabel? commitStatement)
	| commentStatement
	| (sqlplStartLabel? connectStatement)
	| (sqlplStartLabel? createAliasStatement)
	| (sqlplStartLabel? createDatabaseStatement)
	| (sqlplStartLabel? createFunctionStatement)
	| (sqlplStartLabel? createGlobalTemporaryTableStatement)
	| (sqlplStartLabel? createIndexStatement)
	| (sqlplStartLabel? createLobTablespaceStatement)
	| (sqlplStartLabel? createMaskStatement)
	| (sqlplStartLabel? createPermissionStatement)
	| (sqlplStartLabel? createProcedureStatement)
	| (sqlplStartLabel? createRoleStatement)
	| (sqlplStartLabel? createSequenceStatement)
	| (sqlplStartLabel? createStogroupStatement)
	| (sqlplStartLabel? createTableStatement)
	| (sqlplStartLabel? createTablespaceStatement)
	| (sqlplStartLabel? createTriggerStatement)
	| (sqlplStartLabel? createTrustedContextStatement)
	| (sqlplStartLabel? createTypeArrayStatement)
	| (sqlplStartLabel? createTypeDistinctStatement)
	| (sqlplStartLabel? createVariableStatement)
	| (sqlplStartLabel? createViewStatement)
	| (sqlplStartLabel? declareCursorStatement)
	| (sqlplStartLabel? declareGlobalTemporaryTableStatement)
	| (sqlplStartLabel? deleteStatement)
	| (sqlplStartLabel? describeStatement)
	| (sqlplStartLabel? dropStatement)
	| (sqlplStartLabel? exchangeStatement)
	| (sqlplStartLabel? executeStatement)
	| (sqlplStartLabel? executeImmediateStatement)
	| (sqlplStartLabel? explainStatement)
	| (sqlplStartLabel? fetchStatement)
	| (sqlplStartLabel? getDiagnosticsStatement)
	| (sqlplStartLabel? grantStatement)
	| (sqlplStartLabel? insertStatement)
	| (sqlplStartLabel? labelStatement)
	| (sqlplStartLabel? lockTableStatement)
	| (sqlplStartLabel? mergeStatement)
	| (sqlplStartLabel? openStatement)
	| (sqlplStartLabel? prepareStatement)
	| (sqlplStartLabel? refreshTableStatement)
	| (sqlplStartLabel? releaseSavepointStatement)
	| (sqlplStartLabel? releaseConnectionStatement)
	| (sqlplStartLabel? renameStatement)
	| (sqlplStartLabel? revokeStatement)
	| (sqlplStartLabel? rollbackStatement)
	| (sqlplStartLabel? savepointStatement)
	| (sqlplStartLabel? selectIntoStatement)
	| (sqlplStartLabel? setConnectionStatement)
	| (sqlplStartLabel? setAssignmentStatement)
	| (sqlplStartLabel? setSpecialRegisterStatement)
	| (sqlplStartLabel? truncateStatement)
	| (sqlplStartLabel? updateStatement)
	| (sqlplStartLabel? valuesIntoStatement)
	)
	;

sqlplControlStatement
	: (sqlplAssignmentStatement
	| sqlplCallStatement
	| sqlplCaseStatement
	| sqlplCompoundStatement
	| sqlplForStatement
	| sqlplGotoStatement
	| sqlplIfStatement
	| sqlplIterateStatement
	| sqlplLeaveStatement
	| sqlplLoopStatement
	| sqlplRepeatStatement
	| sqlplResignalStatement
	| sqlplReturnStatement
	| sqlplSignalStatement
	| sqlplWhileStatement
	)
	;

query
	: (
	subSelect
	| fullSelect
	| selectStatement
	| selectIntoStatement
	)
	;

cursorName
	: identifier
	;

statementName
	: identifier
	;

descriptorName
	: hostVariable
	;

holdability
	: ((WITHOUT HOLD) | (WITH HOLD))
	;

returnability
	: ((WITHOUT RETURN) | (WITH RETURN ((TO CALLER) | (TO CLIENT))?))
	;

rowsetPositioning
	: ((WITHOUT ROWSET POSITIONING) | (WITH ROWSET POSITIONING))
	;

notNullPhrase
	: ((NOT NULL) | (NOT NULL WITH DEFAULT))
	;

allocateCursorStatement
	: (ALLOCATE cursorName CURSOR FOR RESULT SET rsLocatorVariable)
	;

/*
This used to just be hostVariable, correction noted by Martijn Rutte 2023-06-05.
*/
rsLocatorVariable
	: variable
	;

alterDatabaseStatement
	: (
	ALTER DATABASE databaseName
	(bufferpoolOption
	| (INDEXBP bpName)
	| (STOGROUP stogroupName)
	| (CCSID ccsidValue))+
	)
	;

alterFunctionStatement
	: (
	alterFunctionStatementExternal
	| alterFunctionStatementCompiledSqlScalar
	| alterFunctionStatementInlineSqlScalar
	| alterFunctionStatementSqlTable
	)
	;

alterFunctionStatementExternal
	: (
	ALTER 
	functionDesignator1
	functionExternalOptionList+
	)
	;

alterFunctionStatementCompiledSqlScalar
	: (
	ALTER 
	functionDesignator2
		((ALTER? alterWhichFunction1? functionCompiledSqlScalarOptionList+)
		| (REPLACE alterWhichFunction2? 
			functionCompiledSqlScalarRoutineSpecification)
		| (ADD versionOption
			functionCompiledSqlScalarRoutineSpecification)
		| (ACTIVATE versionOption)
		| (REGENERATE alterWhichFunction2 applicationCompatibilityPhrase?)
		| (DROP versionOption)
		)
	)
	;

alterWhichFunction1
	: ((ACTIVE VERSION) | (ALL VERSIONS) | versionOption)
	;

alterWhichFunction2
	: ((ACTIVE VERSION) | versionOption)
	;

functionCompiledSqlScalarRoutineSpecification
	: (
	LPAREN (parameterDeclaration2 (COMMA parameterDeclaration2)*)? RPAREN
	functionReturnsClause
	functionCompiledSqlScalarOptionList*
	sqlRoutineBody
	)
	;

alterFunctionStatementInlineSqlScalar
	: (
	ALTER 
	functionDesignator2
	functionInlineSqlScalarOptionList+
	)
	;

alterFunctionStatementSqlTable
	: (
	ALTER 
	functionDesignator2
	RESTRICT
	functionSqlTableOptionList+
	)
	;

functionReturnsClause
	: (RETURNS functionDataType)
	;

functionDesignator1
	: (
	((FUNCTION functionName (LPAREN functionParameterType (COMMA functionParameterType)* RPAREN)?) 
	| (SPECIFIC FUNCTION specificName))
	)
	;

functionDesignator2
	: (
	((FUNCTION functionName (LPAREN functionDataType (COMMA functionDataType)* RPAREN)?) 
	| (SPECIFIC FUNCTION specificName))
	)
	;

/*
Alternate syntax says the COMMA between alterIndexPartitionOptions
is optional.  2023-05-24
*/
alterIndexStatement
	: (
	ALTER INDEX indexName regenerateClause?
	alterIndexOptions*
	(alterIndexPartitionOptions (COMMA? alterIndexPartitionOptions)*)?
	)
	;

alterMaskStatement
	: (
	ALTER MASK maskName (ENABLE | DISABLE | regenerateClause)
	)
	;

alterPermissionStatement
	: (
	ALTER PERMISSION permissionName (ENABLE | DISABLE | regenerateClause)
	)
	;

alterProcedureStatement
	: (
	ALTER PROCEDURE procedureName procedureOptionList+
	)
	;

alterProcedureSQLPLStatement
	: (
	ALTER PROCEDURE procedureName (
		(ALTER? alterWhichProcedureSQLPL1? procedureSQLPLOptionList+)
		| (REPLACE alterWhichProcedureSQLPL2? 
			(LPAREN parameterDeclaration3 (COMMA parameterDeclaration3)* RPAREN)?
			procedureSQLPLOptionList*
			sqlRoutineBody)
		| (ADD versionOption
			(LPAREN parameterDeclaration3 (COMMA parameterDeclaration3)* RPAREN)?
			procedureSQLPLOptionList*
			sqlRoutineBody)
		| (ACTIVATE versionOption)
		| (REGENERATE alterWhichProcedureSQLPL2 applicationCompatibilityPhrase?)
		| (DROP versionOption)
		)
	)
	;

alterWhichProcedureSQLPL1
	: ((ACTIVE VERSION) | (ALL VERSIONS) | versionOption)
	;

alterWhichProcedureSQLPL2
	: ((ACTIVE VERSION) | versionOption)
	;

applicationCompatibilityPhrase
	: (USING APPLICATION COMPATIBILITY applCompatValue)
	;

/*
Per Martijn Rutte, the alterSequenceOptionList can optionally be
comma separated.  2023-05-23.
*/	
alterSequenceStatement
	: (
	ALTER SEQUENCE sequenceName alterSequenceOptionList (COMMA? alterSequenceOptionList)*
	)
	;

alterStogroupStatement
	: (
	ALTER STOGROUP stogroupName alterStogroupOptionList+
	)
	;

alterTableStatement
	: (
	ALTER TABLE alterTableName alterTableOptionList+
	)
	;

/*
2022-11-04 Changed subrule operator for alterPartitionClause from
? (0 or 1 allowed) to * (0 or more allowed) per documentation.
Noticed whilst working on issue 125.
*/
alterTablespaceStatement
	: (
	ALTER TABLESPACE (databaseName DOT)? tablespaceName 
	alterTablespaceOptionList* 
	alterPartitionClause*
	moveTableClause?
	)
	;

alterTriggerStatement
	: (
	ALTER TRIGGER triggerName NOT? SECURED
	)
	;

alterTriggerAdvancedStatement
	: (
	ALTER TRIGGER triggerName (
		(ALTER? alterWhichTrigger2? triggerAdvancedDefinitionOptionList+)
		| (REPLACE alterWhichTrigger2? triggerSpecification)
		| (ADD versionOption triggerSpecification)
		| (ACTIVATE versionOption)
		| (REGENERATE alterWhichTrigger2? alterTriggerAdvancedApplicationCompatibility?)
		| (DROP versionOption)
		)
	)
	;

alterWhichTrigger1
	: ((ACTIVE VERSION) | (ALL VERSIONS) | versionOption)
	;

alterWhichTrigger2
	: ((ACTIVE VERSION) | versionOption)
	;

alterTriggerAdvancedApplicationCompatibility
	: (USING APPLICATION COMPATIBILITY applCompatValue)
	;

triggerSpecification
	: (
	triggerAdvancedActivationTime triggerEvent ON tableName
	triggerAdvancedReferencingPhrase?
	triggerGranularity triggerAdvancedDefinitionOptionList* triggeredAdvancedAction
	)
	;

alterTrustedContextStatement
	: (
	ALTER TRUSTED CONTEXT contextName trustedContextOptionList+
	)
	;

alterViewStatement
	: (
	ALTER VIEW viewName REGENERATE
	(USING APPLICATION COMPATIBILITY applCompatValue)?
	)
	;

associateLocatorsStatement
	: (
	ASSOCIATE (RESULT SET)? (LOCATOR | LOCATORS) 
	LPAREN rsLocatorVariable (COMMA rsLocatorVariable)* RPAREN
	WITH PROCEDURE (procedureName | hostVariable)
	)
	;

beginDeclareSectionStatement
	: (BEGIN DECLARE SECTION)
	;

/*
Note this is not the same as sqlplCallStatement.  Among other things,
the syntax...

	CALL XYZ()

...is allowed here and not there.  I do not make the rules, I merely
code to what is documented.
*/
callStatement
	: (
	CALL (procedureName | hostVariable)
	(LPAREN (callArgumentList | (USING DESCRIPTOR hostVariable))? RPAREN)?
	)
	;

callArgument
	: (expression | NULL | (TABLE tableName) | dsnutilArgument3)
	;

/*
Here begins an "embedded" parser just for SYSPROC.DSNUTILx's third parameter.

This goes on for a bit, ~4500 lines or so.
*/

dsnutilArgument3
	: (DSNUTIL_OPEN_APOS dsnutilArgument3Text* DSNUTIL_CLOSE_APOS)
	| (DSNUTIL_OPEN_QUOTE dsnutilArgument3Text* DSNUTIL_CLOSE_QUOTE)
	;

dsnutilUCSDsn
	: (
	DSNUTIL_DSN_CHAR+
	| DSNUTIL_DSN_WS_CHAR+
	| (DSNUTIL_DSN_OPEN_APOS DSNUTIL_APOS_CHAR+ DSNUTIL_APOS)
	| (DSNUTIL_DSN_DOUBLE_APOS DSNUTIL_DOUBLE_APOS_CHAR+ DSNUTIL_DOUBLE_APOS1)
	| (DSNUTIL_DSN_WS_OPEN_APOS DSNUTIL_APOS_CHAR+ DSNUTIL_APOS)
	| (DSNUTIL_DSN_WS_OPEN_QUOTE DSNUTIL_QUOTE_CHAR DSNUTIL_QUOTE1)
	| (DSNUTIL_DSN_WS_DOUBLE_APOS DSNUTIL_DOUBLE_APOS_CHAR+ DSNUTIL_DOUBLE_APOS1)
	| (DSNUTIL_DSN_LPAREN (DSNUTIL_PAREN_IDENTIFIER | DSNUTIL_PAREN_DOT)+ dsnutilUCSDsnMemberName? DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_LPAREN DSNUTIL_PAREN_OPEN_APOS DSNUTIL_APOS_CHAR+ dsnutilUCSDsnMemberName? DSNUTIL_APOS DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_WS_LPAREN (DSNUTIL_PAREN_IDENTIFIER | DSNUTIL_PAREN_DOT)+ dsnutilUCSDsnMemberName? DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_LPAREN DSNUTIL_DSN_OPEN_APOS DSNUTIL_APOS_CHAR+ DSNUTIL_APOS DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_LPAREN DSNUTIL_DSN_DOUBLE_APOS DSNUTIL_DOUBLE_APOS_CHAR+ DSNUTIL_DOUBLE_APOS1 DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_LPAREN DSNUTIL_PAREN_DOUBLE_APOS DSNUTIL_DOUBLE_APOS_CHAR+ DSNUTIL_DOUBLE_APOS1 DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_WS_LPAREN DSNUTIL_PAREN_DOUBLE_APOS DSNUTIL_DOUBLE_APOS_CHAR+ DSNUTIL_DOUBLE_APOS1 DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_WS_LPAREN DSNUTIL_PAREN_OPEN_APOS DSNUTIL_APOS_CHAR+ DSNUTIL_APOS DSNUTIL_RPAREN1)
	| (DSNUTIL_DSN_WS_LPAREN DSNUTIL_PAREN_OPEN_QUOTE DSNUTIL_QUOTE_CHAR DSNUTIL_QUOTE1 DSNUTIL_RPAREN1)
	)
	;

dsnutilUCSDsnMemberName
	: (DSNUTIL_LPAREN1 DSNUTIL_PAREN_IDENTIFIER DSNUTIL_RPAREN1)
	;

dsnutilUCSBackup
	: DSNUTIL_BACKUP DSNUTIL_SYSTEM (DSNUTIL_FULL | DSNUTIL_DATA_ONLY)?
	dsnutilUCSAlternatecpOption?
	(DSNUTIL_DBBSG dsnutilUCSArgInParens)?
	(DSNUTIL_LGBSG dsnutilUCSArgInParens)?
	((DSNUTIL_ESTABLISH | DSNUTIL_END)? DSNUTIL_FCINCREMENTAL)?
	dsnutilUCSReplicationCopyOption?
	;

dsnutilUCSAlternatecpOption
	: (
	DSNUTIL_ALTERNATE_CP dsnutilUCSArgInParens
	)
	;

dsnutilUCSReplicationCopyOption
	: (
	DSNUTIL_FORCE 
	| (DSNUTIL_DUMP dsnutilUCSDumpclassSpec? DSNUTIL_FORCE?) 
	| (DSNUTIL_DUMPONLY (DSNUTIL_TOKEN dsnutilUCSArgInParens)? dsnutilUCSDumpclassSpec?)
	)
	;
	
dsnutilUCSDumpclassSpec
	: (DSNUTIL_DUMPCLASS dsnutilUCSArgList1)
	;

dsnutilUCSCatmaint
	: (
	DSNUTIL_CATMAINT DSNUTIL_UPDATE
	((DSNUTIL_LEVEL dsnutilUCSArgInParens)
	| dsnutilUCSUnlddnSpec
	| dsnutilUCSSwitchSpec
	| dsnutilUCSUtilxSpec)
	)
	;

dsnutilUCSUnlddnSpec
	: (
	DSNUTIL_UNLDDN
	(dsnutilUCSCatmaintActionToken
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSCatmaintActionToken DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSCatmaintActionToken
	: (
	(dsnutilUCSArg
	| DSNUTIL_MINUS
	| DSNUTIL_EQUAL
	| DSNUTIL_PLUS)+
	)
	;

dsnutilUCSSwitchSpec
	: (
	((DSNUTIL_SCHEMA (DSNUTIL_SWITCH dsnutilUCSArgList1)+)
	| (DSNUTIL_OWNER_FROM dsnutilUCSArgList1) DSNUTIL_TO_ROLE)
	(DSNUTIL_VCAT (DSNUTIL_SWITCH dsnutilUCSArgList1)+)?
	)
	;

dsnutilUCSUtilxSpec
	: (
	DSNUTIL_UTILX 
	((DSNUTIL_BASIC | DSNUTIL_EXTENDED | DSNUTIL_RESET)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_BASIC | DSNUTIL_EXTENDED | DSNUTIL_RESET) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSCheckData
	: (
	DSNUTIL_CHECK_DATA 
	dsnutilUCSTablespacePhrase+ 
	dsnutilUCSXMLTablespacePhrase?
	dsnutilUCSCheckDataOptions*
	)
	;

dsnutilUCSTablespacePhrase
	: (dsnutilUCSQualifiedTablespaceNameWithLit dsnutilUCSPartOption1?)
	;

dsnutilUCSIndexPhrase
	: (dsnutilUCSQualifiedIndexName dsnutilUCSPartOption1?)
	;

dsnutilUCSXMLTablespacePhrase
	: (DSNUTIL_INCLUDE DSNUTIL_XML DSNUTIL_TABLESPACES (DSNUTIL_ALL | dsnutilUCSXMLSpec)?)
	;

dsnutilUCSXMLSpec
	: (
	DSNUTIL_LPAREN 
	dsnutilUCSXMLSpecTableOrTablespace (DSNUTIL_COMMA dsnutilUCSXMLSpecTableOrTablespace)*
	(DSNUTIL_DB_TS_RPAREN | DSNUTIL_RPAREN1)
	)
	;

dsnutilUCSXMLSpecTableOrTablespace
	: (
	(DSNUTIL_PAREN_TABLESPACE dsnutilUCSQualifiedTablespaceName)
	| (DSNUTIL_PAREN_TABLE dsnutilUCSQualifiedTableName DSNUTIL_PAREN_XMLCOLUMN dsnutilUCSColumnName)
	)
	;

dsnutilUCSCheckDataOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSShrlevelOption
	| dsnutilUCSDrainWaitOption
	| dsnutilUCSRetryOption
	| dsnutilUCSRetryDelayOption
	| dsnutilUCSScopeOption
	| dsnutilUCSCheckDataAuxerror
	| dsnutilUCSCheckDataLoberror
	| dsnutilUCSCheckDataXmlerror
	| dsnutilUCSCheckDataForException
	| dsnutilUCSCheckDataDelete
	| dsnutilUCSExceptions
	| dsnutilUCSCheckDataErrddn
	| dsnutilUCSCheckDataWorkddn
	| dsnutilUCSPunchddnOption
	| dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	)
	;

dsnutilUCSCloneOption
	: (DSNUTIL_CLONE)
	;

dsnutilUCSShrlevelOption
	: (
	DSNUTIL_SHRLEVEL 
	((DSNUTIL_REFERENCE | DSNUTIL_CHANGE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_REFERENCE | DSNUTIL_CHANGE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSDrainWaitOption
	: (DSNUTIL_DRAIN_WAIT dsnutilUCSArgOptionalParens)
	;

dsnutilUCSRetryOption
	: (DSNUTIL_RETRY dsnutilUCSArgOptionalParens)
	;

dsnutilUCSRetryDelayOption
	: (DSNUTIL_RETRY_DELAY dsnutilUCSArgOptionalParens)
	;

/*
Optional parentheses added per Martijn Rutte 2024-02-02.
The parentheses are not in the syntax diagram in IBM's documentation
as of this date but are tolerated by DB2.
*/
dsnutilUCSScopeOption
	: (DSNUTIL_SCOPE dsnutilUCSArgOptionalParens)
	;

dsnutilUCSCheckDataAuxerror
	: (
	DSNUTIL_AUXERROR 
	((DSNUTIL_REPORT | DSNUTIL_INVALIDATE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_REPORT | DSNUTIL_INVALIDATE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSCheckDataLoberror
	: (
	DSNUTIL_LOBERROR 
	((DSNUTIL_REPORT | DSNUTIL_INVALIDATE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_REPORT | DSNUTIL_INVALIDATE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSCheckDataXmlerror
	: (
	DSNUTIL_XMLERROR 
	((DSNUTIL_REPORT | DSNUTIL_INVALIDATE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_REPORT | DSNUTIL_INVALIDATE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSCheckDataForException
	: (
	DSNUTIL_FOR DSNUTIL_EXCEPTION
	(DSNUTIL_IN dsnutilUCSQualifiedTableName DSNUTIL_USE dsnutilUCSQualifiedTableName)+
	)
	;

dsnutilUCSCheckDataDelete
	: (
	DSNUTIL_DELETE 
	(dsnutilUCSYesOrNo
	| (DSNUTIL_YES dsnutilUCSLogOption)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_YES DSNUTIL_RPAREN1 dsnutilUCSLogOption))
	)
	;

/*
Optional parentheses added per Martijn Rutte 2023-11-03.  The
parentheses are not in the syntax diagram in IBM's documentation
as of this date but are tolerated by DB2.
*/
dsnutilUCSYesOrNo
	: (
	((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_YES | DSNUTIL_NO) DSNUTIL_RPAREN1)
	|
	DSNUTIL_YES | DSNUTIL_NO
	)
	;

dsnutilUCSLogOption
	: (DSNUTIL_LOG dsnutilUCSYesOrNo)
	;

dsnutilUCSExceptions
	: (DSNUTIL_EXCEPTIONS dsnutilUCSArgOptionalParens)
	;

/*
Optional parentheses added per Martijn Rutte 2024-02-02.
The parentheses are not in the syntax diagram in IBM's documentation
as of this date but are tolerated by DB2.
*/
dsnutilUCSCheckDataErrddn
	: (DSNUTIL_ERRDDN dsnutilUCSArgOptionalParens)
	;

/*
Optional parentheses added per Martijn Rutte 2024-02-02 via the
addition of dsnutilUCSArgList2.
The parentheses are not in the syntax diagram in IBM's documentation
as of this date but are tolerated by DB2.
*/
dsnutilUCSCheckDataWorkddn
	: (
	DSNUTIL_WORKDDN
	(dsnutilUCSArgList2?
	| (dsnutilUCSArg (DSNUTIL_COMMA dsnutilUCSArg)?) 
	| (dsnutilUCSArg? (DSNUTIL_COMMA dsnutilUCSArg)))
	)
	;

/*
Optional parentheses added per Martijn Rutte 2023-11-10.
The parentheses are not in the syntax diagram in IBM's documentation
as of this date but are tolerated by DB2.
*/
dsnutilUCSPunchddnOption
	: (DSNUTIL_PUNCHDDN dsnutilUCSArgOptionalParens)
	;

/*
Optional parentheses added per Martijn Rutte 2024-02-02.
The parentheses are not in the syntax diagram in IBM's documentation
as of this date but are tolerated by DB2.
*/
dsnutilUCSSortdevtOption
	: (DSNUTIL_SORTDEVT dsnutilUCSArgOptionalParens)
	;

dsnutilUCSSortnumOption
	: (DSNUTIL_SORTNUM dsnutilUCSArgOptionalParens)
	;

dsnutilUCSParallelOption
	: (DSNUTIL_PARALLEL dsnutilUCSArgOptionalParens)
	;

dsnutilUCSParallelOption2
	: (DSNUTIL_PARALLEL dsnutilUCSArgOptionalParens?)
	;

dsnutilUCSParallelOption3
	: (DSNUTIL_PARALLEL dsnutilUCSArgOptionalParens)
	;

dsnutilUCSCheckIndex
	: (
		(
		(DSNUTIL_CHECK_INDEX_LIST dsnutilUCSArgOptionalParens) 
		| (DSNUTIL_CHECK_INDEX_OPEN_PAREN dsnutilUCSIndexPhrase (DSNUTIL_COMMA dsnutilUCSIndexPhrase)* DSNUTIL_RPAREN1) 
		| (DSNUTIL_CHECK_INDEX_ALL dsnutilUCSTablespacePhrase)
		)
	dsnutilUCSCheckIndexOptions*
	)
	;

dsnutilUCSCheckIndexOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSShrlevelOption
	| dsnutilUCSDrainWaitOption
	| dsnutilUCSRetryOption
	| dsnutilUCSRetryDelayOption
	| dsnutilUCSScopeOption
	| dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	| dsnutilUCSParallelOption
	)
	;

dsnutilUCSCheckLob
	: (
	DSNUTIL_CHECK_LOB dsnutilUCSTablespacePhrase
	dsnutilUCSCheckLobOptions*
	)
	;

dsnutilUCSCheckLobOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSShrlevelOption
	| dsnutilUCSDrainWaitOption
	| dsnutilUCSRetryOption
	| dsnutilUCSRetryDelayOption
	| dsnutilUCSExceptions
	| dsnutilUCSPunchddnOption
	| dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	)
	;

dsnutilUCSCopy
	: (
	DSNUTIL_COPY 
	(dsnutilUCSCopySpec | dsnutilUCSConcurrentSpec | dsnutilUCSFilterddnSpec) 
	dsnutilUCSCloneOption? 
	dsnutilUCSShrlevelOption? 
	dsnutilUCSScopeOption?
	)
	;

/*
This does not match the syntax diagram, as there are
discrepencies between the syntax diagram and the examples.
*/
dsnutilUCSCopySpec
	: dsnutilUCSCopySpecOptions*
	(
		(dsnutilUCSListNameWithLit 
		dsnutilUCSCopySpecOptions* 
		dsnutilUCSDatasetSpec? 
		dsnutilUCSFullOrChangelimit?) 
		| ((dsnutilUCSTablespaceSpec | dsnutilUCSIndexspaceSpec) 
		(dsnutilUCSFullOrChangelimit | dsnutilUCSDsnumOption | dsnutilUCSDatasetSpec)*)+
	)
	dsnutilUCSCopySpecOptions*
	;

dsnutilUCSDsnumOption
	: (
	DSNUTIL_DSNUM 
	((DSNUTIL_ALL | dsnutilUCSArg)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_ALL | dsnutilUCSArg) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSCopySpecOptions
	: (
	dsnutilUCSParallelOption2
	| dsnutilUCSTapeunitsOption
	| dsnutilUCSCheckpageOption
	| dsnutilUCSSystempagesOption
	| dsnutilUCSFlashcopyOption
	| dsnutilUCSCloneOption 
	| dsnutilUCSShrlevelOption 
	| dsnutilUCSScopeOption
	)
	;

dsnutilUCSTapeunitsOption
	: (DSNUTIL_TAPEUNITS dsnutilUCSArgOptionalParens)
	;

dsnutilUCSCheckpageOption
	: (DSNUTIL_CHECKPAGE | DSNUTIL_NOCHECKPAGE)
	;

dsnutilUCSSystempagesOption
	: (DSNUTIL_SYSTEMPAGES dsnutilUCSYesOrNo)
	;

dsnutilUCSFlashcopyOption
	: (
	DSNUTIL_FLASHCOPY
	(DSNUTIL_NO
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NO DSNUTIL_RPAREN1)
	| ((DSNUTIL_YES | DSNUTIL_CONSISTENT) (DSNUTIL_FCCOPYDDN dsnutilUCSArgInParens)?)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_YES | DSNUTIL_CONSISTENT) DSNUTIL_RPAREN1 (DSNUTIL_FCCOPYDDN dsnutilUCSArgInParens)?))
	)
	;

dsnutilUCSFullOrChangelimit
	: ((DSNUTIL_FULL dsnutilUCSYesOrNo) | dsnutilUCSChangelimitSpec)
	;

dsnutilUCSConcurrentSpec
	: ((dsnutilUCSListNameWithLit dsnutilUCSDatasetSpec) 
	| ((dsnutilUCSTablespaceCopySpec | dsnutilUCSIndexspaceCopySpec) dsnutilUCSDatasetSpec)+)
	DSNUTIL_CONCURRENT
	;

dsnutilUCSFilterddnSpec
	: (dsnutilUCSListNameWithLit 
	| ((dsnutilUCSTablespaceCopySpec | dsnutilUCSIndexspaceCopySpec))+)
	(dsnutilUCSDatasetSpec 
	| (DSNUTIL_FILTERDDN dsnutilUCSArgInParens)
	| DSNUTIL_CONCURRENT)*
	;

dsnutilUCSDatasetSpec
	: ((dsnutilUCSCopyddnOption dsnutilUCSRecoveryddnOption2?)
	| dsnutilUCSRecoveryddnOption2)
	;

dsnutilUCSChangelimitSpec
	: (DSNUTIL_CHANGELIMIT dsnutilUCSArgList1 DSNUTIL_REPORTONLY?)
	;

dsnutilUCSTablespaceSpec
	: (dsnutilUCSQualifiedTablespaceNameWithLit dsnutilUCSPartOption1?)
	;

dsnutilUCSTablespaceCopySpec
	: (dsnutilUCSTablespaceSpec dsnutilUCSDsnumOption?)
	;

dsnutilUCSIndexspaceSpec
	: (dsnutilUCSQualifiedIndexspaceNameWithLit
	| dsnutilUCSQualifiedIndexNameWithLit)
	;

dsnutilUCSIndexspaceCopySpec
	: (dsnutilUCSIndexspaceSpec dsnutilUCSDsnumOption?)
	;

dsnutilUCSCopyToCopy
	: (
	DSNUTIL_COPYTOCOPY
	((dsnutilUCSListNameWithLit dsnutilUCSFromCopySpec? dsnutilUCSDatasetSpec?)
	| ((dsnutilUCSTablespaceCopySpec | dsnutilUCSIndexspaceCopySpec) dsnutilUCSFromCopySpec? dsnutilUCSDatasetSpec?)+)
	DSNUTIL_CLONE?
	)
	;

dsnutilUCSFromCopySpec
	: (
	DSNUTIL_FROMLASTCOPY
	| DSNUTIL_FROMLASTFULLCOPY
	| DSNUTIL_FROMLASTINCRCOPY
	| DSNUTIL_FROMLASTFLASHCOPY
	| dsnutilUCSFromCopyDsnOption
	)
	;

dsnutilUCSFromCopyDsnOption
	: (
	DSNUTIL_FROMCOPY 
	dsnutilUCSDsn 
	(DSNUTIL_FROMVOLUME 
		(DSNUTIL_CATALOG 
		| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CATALOG DSNUTIL_RPAREN1)
		| (dsnutilUCSArg (DSNUTIL_FROMSEQNO dsnutilUCSArgOptionalParens)?)
		| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSArg DSNUTIL_RPAREN1 (DSNUTIL_FROMSEQNO dsnutilUCSArgOptionalParens)?)
		)
	)?
	)
	;

dsnutilUCSDiagnose
	: (DSNUTIL_DIAGNOSE (dsnutilUCSDiagnoseStatement+ | DSNUTIL_END))
	;

dsnutilUCSDiagnoseStatement
	: (
	(DSNUTIL_TYPE dsnutilUCSArgList1)
	| (DSNUTIL_ALLDUMPS dsnutilUCSArgList1?)
	| (DSNUTIL_NODUMPS dsnutilUCSArgList1?)
	| dsnutilUCSDiagnoseDisplayStatement
	| dsnutilUCSDiagnoseWaitStatement
	| dsnutilUCSDiagnoseAbendStatement
	)
	;

dsnutilUCSDiagnoseDisplayStatement
	: (
	DSNUTIL_DISPLAY
	((DSNUTIL_OBD dsnutilUCSQualifiedTablespaceName 
		(DSNUTIL_ALL | DSNUTIL_TABLES | DSNUTIL_INDEXES)? DSNUTIL_CLONE?)
	| DSNUTIL_SYSUTIL
	| DSNUTIL_MEPL
	| DSNUTIL_AVAILABLE
	| DSNUTIL_RBLP
	| (DSNUTIL_DBET 
		((DSNUTIL_DATABASE dsnutilUCSDatabaseName)
		| dsnutilUCSQualifiedTablespaceNameWithLit
		| dsnutilUCSQualifiedIndexNameWithLit)
		DSNUTIL_CLONE?))
	)
	;

dsnutilUCSDiagnoseWaitStatement
	: (DSNUTIL_WAIT dsnutilUCSDiagnoseMessageOrTraceID+)
	;

dsnutilUCSDiagnoseAbendStatement
	: (DSNUTIL_ABEND dsnutilUCSDiagnoseMessageOrTraceID DSNUTIL_NODUMP?)
	;

dsnutilUCSDiagnoseMessageOrTraceID
	: ((DSNUTIL_MESSAGE dsnutilUCSArgOptionalParens (DSNUTIL_INSTANCE dsnutilUCSArgOptionalParens)?)
	| (DSNUTIL_TRACEID dsnutilUCSArgOptionalParens (DSNUTIL_INSTANCE dsnutilUCSArgOptionalParens)?))
	;

dsnutilUCSExecSql
	: (DSNUTIL_EXEC_SQL 
	(alterDatabaseStatement
	| alterFunctionStatement
	| alterIndexStatement
	| alterMaskStatement
	| alterPermissionStatement
	| alterProcedureStatement
	| alterProcedureSQLPLStatement
	| alterSequenceStatement
	| alterStogroupStatement
	| alterTableStatement
	| alterTablespaceStatement
	| alterTriggerStatement
	| alterTriggerAdvancedStatement
	| alterTrustedContextStatement
	| alterViewStatement
	| commitStatement
	| commentStatement
	| createAliasStatement
	| createAuxiliaryTableStatement
	| createDatabaseStatement
	| createFunctionStatement
	| createGlobalTemporaryTableStatement
	| createIndexStatement
	| createLobTablespaceStatement
	| createMaskStatement
	| createPermissionStatement
	| createProcedureStatement
	| createProcedureSQLPLStatement
	| createRoleStatement
	| createSequenceStatement
	| createStogroupStatement
	| createTableStatement
	| createTablespaceStatement
	| createTriggerStatement
	| createTriggerAdvancedStatement
	| createTrustedContextStatement
	| createTypeArrayStatement
	| createTypeDistinctStatement
	| createVariableStatement
	| createViewStatement
	| declareCursorStatement
	| deleteStatement
	| dropStatement
	| explainStatement
	| grantStatement
	| insertStatement
	| labelStatement
	| renameStatement
	| revokeStatement
	| setSpecialRegisterStatement
	| updateStatement)
	DSNUTIL_ENDEXEC
	)
	;

dsnutilUCSListdef
	: (
	DSNUTIL_LISTDEF dsnutilUCSListName
	dsnutilUCSListdefContents+
	)
	;

dsnutilUCSListdefContents
	: (
	(DSNUTIL_INCLUDE | DSNUTIL_EXCLUDE) dsnutilUCSListdefOptions+
	)
	;

dsnutilUCSListdefOptions
	: (
	dsnutilUCSListdefTablespacesOption
	| dsnutilUCSListdefIndexspacesOption
	| dsnutilUCSListdefInitialObjectSpecOption
	| dsnutilUCSListdefClonedOption
	| dsnutilUCSListdefDefinedOption
	| dsnutilUCSListdefRIOption
	| dsnutilUCSListdefAuxiliaryIndicatorOption
	| dsnutilUCSListdefHistoryOrArchiveOption
	| dsnutilUCSListdefBasicOption
	| dsnutilUCSListdefExtendedOption
	)
	;

dsnutilUCSListdefTablespacesOption
	: (
	DSNUTIL_TABLESPACES
	)
	;

dsnutilUCSListdefIndexspacesOption
	: (
	DSNUTIL_INDEXSPACES (DSNUTIL_COPY dsnutilUCSYesOrNo)?
	)
	;

dsnutilUCSListdefInitialObjectSpecOption
	: (
	dsnutilUCSListNameWithLit | dsnutilUCSInitialObjectSpec
	)
	;

dsnutilUCSListdefClonedOption
	: (
	DSNUTIL_CLONED dsnutilUCSYesOrNo
	)
	;

dsnutilUCSListdefDefinedOption
	: (
	DSNUTIL_DEFINED 
	((DSNUTIL_YES | DSNUTIL_NO | DSNUTIL_ALL)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_YES | DSNUTIL_NO | DSNUTIL_ALL) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSListdefRIOption
	: (
	DSNUTIL_RI
	)
	;

dsnutilUCSListdefAuxiliaryIndicatorOption
	: (
	DSNUTIL_BASE | DSNUTIL_LOB | DSNUTIL_XML | DSNUTIL_ALL
	)
	;

dsnutilUCSListdefHistoryOrArchiveOption
	: (
	DSNUTIL_HISTORY | DSNUTIL_ARCHIVE
	)
	;

dsnutilUCSListdefBasicOption
	: (
	DSNUTIL_BASIC dsnutilUCSYesOrNo
	)
	;

dsnutilUCSListdefExtendedOption
	: (
	DSNUTIL_EXTENDED dsnutilUCSYesOrNo
	)
	;

dsnutilUCSInitialObjectSpec
	: (
	(DSNUTIL_DATABASE dsnutilUCSDatabaseName)
	| dsnutilUCSQualifiedTablespaceNameWithLit
	| dsnutilUCSQualifiedIndexspaceNameWithLit
	| dsnutilUCSQualifiedTableNameWithLit
	| dsnutilUCSQualifiedIndexNameWithLit
	) (DSNUTIL_PARTLEVEL dsnutilUCSArgList1?)?
	;

/*
It appears, from the examples, that load options can both
precede and succeed the into-table-spec.  This is contrary
to the syntax diagram.
*/
dsnutilUCSLoad
	: (
	(DSNUTIL_LOAD | DSNUTIL_LOAD_DATA) 
	dsnutilUCSLoadOptions*
	dsnutilUCSIntoTableSpec+
	dsnutilUCSLoadOptions*
	)
	;

dsnutilUCSLoadOptions
	: (
	dsnutilUCSLoadInddnOption
	| dsnutilUCSPreformatOption
	| dsnutilUCSLoadCopydictionaryOption
	| dsnutilUCSLoadPresortedOption
	| dsnutilUCSParallelOption2
	| dsnutilUCSLoadPresortOption
	| dsnutilUCSLoadRowformatOption
	| dsnutilUCSRbalrsnConversionOption
	| dsnutilUCSLoadResumeOption
	| dsnutilUCSFlashcopyOption
	| dsnutilUCSLoadKeepdictionaryOption
	| dsnutilUCSReuseOption
	| dsnutilUCSLoadLogOption
	| dsnutilUCSLoadNocopypendOption
	| dsnutilUCSLoadWorkddnOption
	| dsnutilUCSLoadSortkeysOption
	| dsnutilUCSFormatSpec
	| dsnutilUCSLoadFloatOption
	| dsnutilUCSEAUOption
	| dsnutilUCSCCSIDOption
	| dsnutilUCSNosubsOption
	| dsnutilUCSLoadEnforceOption
	| dsnutilUCSNocheckpendOption
	| dsnutilUCSLoadErrddnOption
	| dsnutilUCSLoadMapddnOption
	| dsnutilUCSLoadDiscarddnOption
	| dsnutilUCSLoadDiscardsOption
	| dsnutilUCSBackoutOption
	| dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	| dsnutilUCSLoadContinueifOption
	| dsnutilUCSLoadIgnoreOption
	| dsnutilUCSLoadDecfloatOption
	| dsnutilUCSLoadOverrideOption
	| dsnutilUCSOverrideSpecAlternateSyntax
	| dsnutilUCSLoadDrainOption
	| dsnutilUCSLoadIndexdeferOption
	| dsnutilUCSImplicitTZOption
	| dsnutilUCSLoadUpdmaxassignedvalOption
	| dsnutilUCSLoadDefineauxOption
	| dsnutilUCSForceOption
	| dsnutilUCSLoadKeepEmptyPagesOption
	)
	;

dsnutilUCSLoadInddnOption
	: (
	(DSNUTIL_INDDN (dsnutilUCSArgOptionalParens | dsnutilUCSArgList1) (DSNUTIL_DISCARDDN dsnutilUCSArgOptionalParens)?) 
	| (DSNUTIL_INCURSOR dsnutilUCSArgOptionalParens)
	)
	;

dsnutilUCSPreformatOption
	: (
	DSNUTIL_PREFORMAT
	)
	;

dsnutilUCSLoadCopydictionaryOption
	: (
	DSNUTIL_COPYDICTIONARY dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLoadPresortedOption
	: (
	DSNUTIL_PRESORTED dsnutilUCSYesOrNo
	)
	;

dsnutilUCSLoadPresortOption
	: (
	DSNUTIL_PRESORT
	)
	;

dsnutilUCSLoadRowformatOption
	: (
	DSNUTIL_ROWFORMAT 
	((DSNUTIL_RRF | DSNUTIL_BRF)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_RRF | DSNUTIL_BRF) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSRbalrsnConversionOption
	: (
	DSNUTIL_RBALRSN_CONVERSION 
	((DSNUTIL_EXTENDED | DSNUTIL_NONE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_EXTENDED | DSNUTIL_NONE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSLoadResumeOption
	: (
	dsnutilUCSLoadResumeSpec
	)
	;

dsnutilUCSLoadKeepdictionaryOption
	: (
	DSNUTIL_KEEPDICTIONARY
	)
	;

dsnutilUCSReuseOption
	: (
	DSNUTIL_REUSE
	)
	;

dsnutilUCSLoadLogOption
	: (
	DSNUTIL_LOG dsnutilUCSYesOrNo
	)
	;

/*
Made into separate option per Martijn Rutte 2023-22-10.
*/
dsnutilUCSLoadNocopypendOption
	: (
	DSNUTIL_NOCOPYPEND
	)
	;

dsnutilUCSLoadWorkddnOption
	: (
	dsnutilUCSWorkddnSpec
	)
	;

dsnutilUCSLoadSortkeysOption
	: (
	DSNUTIL_SORTKEYS
	((DSNUTIL_NO | dsnutilUCSArg)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_NO | dsnutilUCSArg) DSNUTIL_RPAREN1)
	)?
	)
	;

dsnutilUCSLoadFloatOption
	: (
	DSNUTIL_FLOAT dsnutilUCSArgInParens
	)
	;

dsnutilUCSEAUOption
	: (
	DSNUTIL_EBCDIC | DSNUTIL_ASCII | DSNUTIL_UNICODE
	)
	;

dsnutilUCSCCSIDOption
	: (
	DSNUTIL_CCSID dsnutilUCSArgList1
	)
	;

dsnutilUCSCCSIDPhrase
	: (
	DSNUTIL_CCSID dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSNosubsOption
	: (
	DSNUTIL_NOSUBS
	)
	;

dsnutilUCSLoadEnforceOption
	: (
	DSNUTIL_ENFORCE
	((DSNUTIL_CONSTRAINTS | DSNUTIL_NO)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_CONSTRAINTS | DSNUTIL_NO) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSNocheckpendOption
	: (
	DSNUTIL_NOCHECKPEND
	)
	;

dsnutilUCSLoadErrddnOption
	: (
	DSNUTIL_ERRDDN dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLoadMapddnOption
	: (
	DSNUTIL_MAPDDN dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLoadDiscarddnOption
	: (
	DSNUTIL_DISCARDDN dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLoadDiscardsOption
	: (
	DSNUTIL_DISCARDS dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSBackoutOption
	: (
	DSNUTIL_BACKOUT dsnutilUCSYesOrNo?
	)
	;

dsnutilUCSLoadContinueifOption
	: (
	DSNUTIL_CONTINUEIF dsnutilUCSArgInParens DSNUTIL_EQUAL dsnutilUCSArg
	)
	;

dsnutilUCSLoadIgnoreOption
	: (
	dsnutilUCSIgnoreSpec
	)
	;

dsnutilUCSLoadDecfloatOption
	: (
	dsnutilUCSDecfloatSpec
	)
	;

dsnutilUCSLoadOverrideOption
	: (
	dsnutilUCSOverrideSpec
	)
	;

dsnutilUCSLoadDrainOption
	: (
	dsnutilUCSDrainSpec
	)
	;

dsnutilUCSLoadIndexdeferOption
	: (
	DSNUTIL_INDEXDEFER 
	((DSNUTIL_NONE | DSNUTIL_NPI | DSNUTIL_ALL) 
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_NONE | DSNUTIL_NPI | DSNUTIL_ALL) DSNUTIL_RPAREN1))
	DSNUTIL_NONUNIQUE?
	)
	;

dsnutilUCSImplicitTZOption
	: (
	DSNUTIL_IMPLICIT_TZ dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLoadUpdmaxassignedvalOption
	: (
	DSNUTIL_UPDMAXASSIGNEDVAL dsnutilUCSYesOrNo
	)
	;

dsnutilUCSLoadDefineauxOption
	: (
	DSNUTIL_DEFINEAUX dsnutilUCSYesOrNo
	)
	;

dsnutilUCSForceOption
	: (
	DSNUTIL_FORCE 
	((DSNUTIL_NONE | DSNUTIL_READERS | DSNUTIL_ALL)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_NONE | DSNUTIL_READERS | DSNUTIL_ALL) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSLoadKeepEmptyPagesOption
	: (
	DSNUTIL_KEEP_EMPTY_PAGES dsnutilUCSYesOrNo
	)
	;

dsnutilUCSLoadResumeSpec
	: (
	dsnutilUCSLoadResumeSpecOptions
	)
	;

dsnutilUCSLoadResumeSpecOptions
	: (
	(DSNUTIL_RESUME dsnutilUCSYesOrNo)
	| (DSNUTIL_RESUME DSNUTIL_LPAREN dsnutilUCSYesOrNo DSNUTIL_RPAREN1)
	| dsnutilUCSLoadResumeSpecShrlevelOption
	| dsnutilUCSLoadCopySpec
	| dsnutilUCSLoadResumeSpecReplaceOption
	| dsnutilUCSStatisticsSpec
	)
	;

dsnutilUCSLoadResumeSpecReplaceOption
	: (
	DSNUTIL_REPLACE
	)
	;

dsnutilUCSLoadResumeSpecShrlevelOption
	: (
	DSNUTIL_SHRLEVEL
	(dsnutilUCSLoadResumeSpecShrlevelOptions
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSLoadResumeSpecShrlevelOptions DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSLoadResumeSpecShrlevelOptions
	: (
	DSNUTIL_NONE 
	| DSNUTIL_REFERENCE
	| DSNUTIL_CHANGE
	)
	;

dsnutilUCSLoadCopySpec
	: ((dsnutilUCSCopyddnOption dsnutilUCSRecoveryddnOption2?)
	| dsnutilUCSRecoveryddnOption2)
	;

dsnutilUCSStatisticsSpec
	: (
	DSNUTIL_STATISTICS
	dsnutilUCSStatTableSpec?
	dsnutilUCSStatIndexSpec1?
	dsnutilUCSStatisticsSpecOptions*
	)
	;

dsnutilUCSStatisticsSpecOptions
	: (
	dsnutilUCSReportOption
	| dsnutilUCSUpdateOption
	| dsnutilUCSStatclgmemsrtOption
	| dsnutilUCSInvalidatecacheOption
	| dsnutilUCSHistoryOption
	| dsnutilUCSForcerollupOption
	)
	;

dsnutilUCSReportOption
	: (
	DSNUTIL_REPORT dsnutilUCSYesOrNo
	)
	;

dsnutilUCSUpdateOption
	: (
	DSNUTIL_UPDATE
	((DSNUTIL_ALL | DSNUTIL_ACCESSPATH | DSNUTIL_SPACE | DSNUTIL_NONE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_ALL | DSNUTIL_ACCESSPATH | DSNUTIL_SPACE | DSNUTIL_NONE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSStatclgmemsrtOption
	: (
	DSNUTIL_STATCLGMEMSRT dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSInvalidatecacheOption
	: (
	DSNUTIL_INVALIDATECACHE dsnutilUCSYesOrNo
	)
	;

dsnutilUCSHistoryOption
	: (
	DSNUTIL_HISTORY 
	((DSNUTIL_ALL | DSNUTIL_ACCESSPATH | DSNUTIL_SPACE | DSNUTIL_NONE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_ALL | DSNUTIL_ACCESSPATH | DSNUTIL_SPACE | DSNUTIL_NONE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSForcerollupOption
	: (
	DSNUTIL_FORCEROLLUP dsnutilUCSYesOrNo
	)
	;

dsnutilUCSStatTableSpec
	: (
	dsnutilUCSStatTableSpecIndividual
	| dsnutilUCSStatTableSpecOneOfMany+
	)
	;

dsnutilUCSStatTableSpecIndividual
	: (
	dsnutilUCSStatTableSpecName1 dsnutilUCSSampleSpec1? dsnutilUCSUseProfile?
	)
	;

dsnutilUCSStatTableSpecOneOfMany
	: (
	dsnutilUCSStatTableSpecName2 dsnutilUCSTableStatsSpec*
	)
	;
/*
Modified per Martijn Rutte 2023-11-03 to make parentheses optional.  This
syntax is tolerated by DB2 but not mentioned in the IBM documentation as
of this date.
*/
dsnutilUCSStatTableSpecName1
	: (
	DSNUTIL_TABLE dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSStatTableSpecName2
	: (
	DSNUTIL_TABLE DSNUTIL_DB_TS_LPAREN dsnutilUCSQualifiedTableName DSNUTIL_RPAREN1
	)
	;

dsnutilUCSTableStatsSpec
	: (
	dsnutilUCSSampleSpec1
	| dsnutilUCSTableStatsColumnAll
	| dsnutilUCSTableStatsColumnListAll
	| dsnutilUCSColgroupList 
	| dsnutilUCSUseProfile
	)
	;

dsnutilUCSTableStatsColumnAll
	: (
	DSNUTIL_COLUMN 
	(DSNUTIL_ALL
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_ALL DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSTableStatsColumnListAll
	: (
	DSNUTIL_COLUMN
	(DSNUTIL_LPAREN | DSNUTIL_LPAREN1) 
	dsnutilUCSColumnList 
	DSNUTIL_RPAREN1
	)
	;

dsnutilUCSColgroupList
	: (
	dsnutilUCSColgroupSpec (DSNUTIL_COMMA dsnutilUCSColgroupSpec)*
	)
	;

dsnutilUCSColgroupSpec
	: (
	DSNUTIL_COLGROUP (DSNUTIL_LPAREN dsnutilUCSColumnList DSNUTIL_RPAREN1) dsnutilUCSColgroupStatsSpec*
	)
	;

dsnutilUCSUseProfile
	: (
	DSNUTIL_USE DSNUTIL_PROFILE
	)
	;

dsnutilUCSColumnList
	: (
	dsnutilUCSColumnName 
	(DSNUTIL_COMMA dsnutilUCSColumnName)*
	)
	;

dsnutilUCSSampleSpec1
	: (
	dsnutilUCSSampleOption
	| dsnutilUCSTablesampleOption1
	)
	;

dsnutilUCSSampleSpec2
	: (
	dsnutilUCSSampleOption
	| dsnutilUCSTablesampleOption2
	)
	;

dsnutilUCSSampleOption
	: (
	DSNUTIL_SAMPLE dsnutilUCSArgOptionalParens?
	)
	;

dsnutilUCSTablesampleOption1
	: (
	DSNUTIL_TABLESAMPLE DSNUTIL_SYSTEM 
	((DSNUTIL_AUTO | DSNUTIL_NONE | dsnutilUCSArg)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_AUTO | DSNUTIL_NONE | dsnutilUCSArg) DSNUTIL_RPAREN1)
	)?
	dsnutilUCSRepeatableOption?
	)
	;

dsnutilUCSTablesampleOption2
	: (
	DSNUTIL_TABLESAMPLE DSNUTIL_SYSTEM
	((DSNUTIL_AUTO | DSNUTIL_NONE | dsnutilUCSArg)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_AUTO | DSNUTIL_NONE | dsnutilUCSArg) DSNUTIL_RPAREN1)
	)?
	dsnutilUCSRepeatableOption?
	)
	;

dsnutilUCSRepeatableOption
	: (
	DSNUTIL_REPEATABLE dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSColgroupStatsSpec
	: (
	dsnutilUCSFreqval2 | dsnutilUCSHistogram2
	)
	;

dsnutilUCSStatIndexSpec1
	: (
	DSNUTIL_INDEX 
	(dsnutilUCSStatsIndexSpecJustOne
	| (DSNUTIL_DB_TS_LPAREN dsnutilUCSStatsIndexSpecList1 DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSStatIndexSpec2
	: (
	DSNUTIL_INDEX 
	(dsnutilUCSStatsIndexSpecJustOne
	| (DSNUTIL_DB_TS_LPAREN dsnutilUCSStatsIndexSpecList2 DSNUTIL_RPAREN1))
	)
	;

/*
Modified per Martijn Rutte 2023-11-03 to make parentheses optional.  This
syntax is tolerated by DB2 but not mentioned in the IBM documentation as
of this date.
*/
dsnutilUCSStatsIndexSpecJustOne
	: (
	(
		(DSNUTIL_DB_TS_LPAREN (dsnutilUCSQualifiedIndexName | DSNUTIL_ALL) DSNUTIL_RPAREN1)
	|
		(dsnutilUCSQualifiedIndexName | DSNUTIL_ALL)
	)
	dsnutilUCSCorrelationStatsSpec*
	)
	;

dsnutilUCSStatsIndexSpecList1
	: (
	dsnutilUCSStatsIndexNameAndStats1
	(DSNUTIL_COMMA dsnutilUCSStatsIndexNameAndStats1)*
	)
	;

dsnutilUCSStatsIndexSpecList2
	: (
	dsnutilUCSStatsIndexNameAndStats2
	(DSNUTIL_COMMA dsnutilUCSStatsIndexNameAndStats2)*
	)
	;

dsnutilUCSStatsIndexNameAndStats1
	: (
	dsnutilUCSQualifiedIndexName 
	dsnutilUCSCorrelationStatsSpec*
	)
	;

dsnutilUCSStatsIndexNameAndStats2
	: (
	dsnutilUCSQualifiedIndexName
	dsnutilUCSPartOption1?
	dsnutilUCSCorrelationStatsSpec*
	)
	;

/*
KEYCARD is deprecated.
*/
dsnutilUCSCorrelationStatsSpec
	: (
	DSNUTIL_KEYCARD //{notifyErrorListeners("KEYCARD has been deprecated as of DB2 10");}
	| dsnutilUCSFreqval1 
	| dsnutilUCSHistogram1
	)
	;

dsnutilUCSFreqval1
	: (
	DSNUTIL_FREQVAL 
	DSNUTIL_NUMCOLS dsnutilUCSArgOptionalParens 
	(DSNUTIL_COUNT dsnutilUCSArgOptionalParens dsnutilUCSCountOptions?)?
	)
	;

dsnutilUCSFreqval2
	: (
	DSNUTIL_FREQVAL 
	(DSNUTIL_COUNT dsnutilUCSArgOptionalParens dsnutilUCSCountOptions?)?
	)
	;

dsnutilUCSHistogram1
	: (
	DSNUTIL_HISTOGRAM 
	(DSNUTIL_NUMCOLS dsnutilUCSArgOptionalParens (DSNUTIL_NUMQUANTILES dsnutilUCSArgOptionalParens)?)?
	)
	;

dsnutilUCSHistogram2
	: (
	DSNUTIL_HISTOGRAM 
	(DSNUTIL_NUMQUANTILES dsnutilUCSArgOptionalParens)?
	)
	;

dsnutilUCSCountOptions
	: (
	DSNUTIL_MOST
	| DSNUTIL_BOTH
	| DSNUTIL_LEAST
	)
	;

/*
Allow for WORKDDN arguments to not be enclosed in parentheses per
Martijn Rutte 2023-10-24.  This is tolerated by DB2 13 but is
not documented as far back as DB2 v6.
*/
dsnutilUCSWorkddnSpec
	: (
	DSNUTIL_WORKDDN
	(dsnutilUCSArgList2?
	| (dsnutilUCSArg (DSNUTIL_COMMA dsnutilUCSArg)?) 
	| (dsnutilUCSArg? (DSNUTIL_COMMA dsnutilUCSArg)))
	)
	;

dsnutilUCSFormatSpec
	: (
	DSNUTIL_FORMAT dsnutilUCSFormatSpecOptions
	)
	;

dsnutilUCSFormatSpecOptions
	: (
	DSNUTIL_UNLOAD
	| DSNUTIL_SQLDS
	| DSNUTIL_INTERNAL
	| dsnutilUCSDelimitedOption
	| dsnutilUCSSpannedOption
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_UNLOAD | DSNUTIL_SQLDS | DSNUTIL_INTERNAL) DSNUTIL_RPAREN1)
	)
	;

dsnutilUCSSpannedOption
	: (
	DSNUTIL_SPANNED dsnutilUCSYesOrNo
	)
	;

dsnutilUCSDelimitedOption
	: (
	DSNUTIL_DELIMITED dsnutilUCSDelimitedOptions*
	)
	;

dsnutilUCSDelimitedOptions
	: (
	(DSNUTIL_COLDEL dsnutilUCSArgOptionalParens)
	| (DSNUTIL_CHARDEL dsnutilUCSArgOptionalParens)
	| (DSNUTIL_DECPT dsnutilUCSArgOptionalParens)
	)
	;

dsnutilUCSIgnoreSpec
	: (
	DSNUTIL_IGNORE DSNUTIL_LPAREN dsnutilUCSIgnoreSpecOption DSNUTIL_RPAREN1
	)
	;

dsnutilUCSIgnoreSpecOption
	: (
	DSNUTIL_PAREN_WHEN
	| DSNUTIL_PART
	| DSNUTIL_CONV
	| DSNUTIL_VALPROC
	| DSNUTIL_IDERROR
	| DSNUTIL_DUPKEY
	)
	;

dsnutilUCSDecfloatSpec
	: (
	DSNUTIL_DECFLOAT_ROUNDMODE 
	(dsnutilUCSDecfloatSpecOption
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSDecfloatSpecOption DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSDecfloatSpecOption
	: (
	DSNUTIL_ROUND_CEILING
	| DSNUTIL_ROUND_DOWN
	| DSNUTIL_ROUND_FLOOR
	| DSNUTIL_ROUND_HALF_DOWN
	| DSNUTIL_ROUND_HALF_EVEN
	| DSNUTIL_ROUND_HALF_UP
	| DSNUTIL_ROUND_UP
	)
	;

dsnutilUCSOverrideSpec
	: (
	DSNUTIL_OVERRIDE DSNUTIL_LPAREN 
	dsnutilUCSOverrideSpecOption (DSNUTIL_COMMA dsnutilUCSOverrideSpecOption)* 
	DSNUTIL_RPAREN1
	)
	;

dsnutilUCSOverrideSpecOption
	: (
	DSNUTIL_SYSTEMPERIOD
	| DSNUTIL_IDENTITY
	| DSNUTIL_TRANSID
	| DSNUTIL_NONDETERMINISTIC
	| DSNUTIL_ROWCHANGE
	)
	;

dsnutilUCSOverrideSpecAlternateSyntax
	: (
	DSNUTIL_IDENTITYOVERRIDE
	| DSNUTIL_PERIODOVERRIDE
	| DSNUTIL_TRANSIDOVERRIDE
	)
	;

dsnutilUCSDrainSpec
	: (
	dsnutilUCSDrainWaitOption
	| dsnutilUCSRetryOption
	| dsnutilUCSRetryDelayOption
	| dsnutilUCSSwitchtimeOption
	)
	;

dsnutilUCSLabeledDurationExpression
	: (
	(DSNUTIL_CURRENT_DATE | (DSNUTIL_CURRENT_TIMESTAMP DSNUTIL_WITH_TIME_ZONE?))
	((DSNUTIL_PLUS | DSNUTIL_MINUS) dsnutilUCSArg dsnutilDurationSuffix)+
	)
	;

dsnutilUCSSwitchtimeOption
	: (
	DSNUTIL_SWITCHTIME 
	(DSNUTIL_NONE 
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NONE DSNUTIL_RPAREN1)
	| ((dsnutilUCSTimestamp | dsnutilUCSLabeledDurationExpression) dsnutilUCSNewmaxroOption?)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (dsnutilUCSTimestamp | dsnutilUCSLabeledDurationExpression) DSNUTIL_RPAREN1 dsnutilUCSNewmaxroOption?))
	)
	;

dsnutilUCSNewmaxroOption
	: (
	DSNUTIL_NEWMAXRO 
	((DSNUTIL_NONE | dsnutilUCSArg)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_NONE | dsnutilUCSArg) DSNUTIL_RPAREN1))
	)
	;

dsnutilDurationSuffix
	: (
	DSNUTIL_YEAR
	| DSNUTIL_YEARS
	| DSNUTIL_MONTH
	| DSNUTIL_MONTHS
	| DSNUTIL_DAY
	| DSNUTIL_DAYS
	| DSNUTIL_HOUR
	| DSNUTIL_HOURS
	| DSNUTIL_MINUTE
	| DSNUTIL_MINUTES
	| DSNUTIL_SECOND
	| DSNUTIL_SECONDS
	| DSNUTIL_MICROSECOND
	| DSNUTIL_MICROSECONDS
	)
	;

dsnutilUCSIntoTableSpec
	: (
	DSNUTIL_INTO dsnutilUCSQualifiedTableNameWithLit
	dsnutilUCSIntoTableSpecOptions*
	)
	;

dsnutilUCSIntoTableSpecOptions
	: (
	dsnutilUCSIgnoreFieldsOption
	| dsnutilUCSPartOption1
	| dsnutilUCSIntoTableSpecPreformatOption
	| dsnutilUCSIntoTableResumeSpec
	| dsnutilUCSIntoTableSpecDDNOption
	| dsnutilUCSIntoTableSpecNumrecsOption
	| dsnutilUCSIntoTableSpecWhenOption
	| dsnutilUCSLoadFieldListOption
	)
	;

dsnutilUCSPartOption1
	: (DSNUTIL_PART dsnutilUCSArgOptionalParens)
	;

dsnutilUCSPartOption2
	: (
	DSNUTIL_PART dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSIntoTableSpecPreformatOption
	: (DSNUTIL_PREFORMAT)
	;

dsnutilUCSIntoTableSpecDDNOption
	: (
	(DSNUTIL_INDDN (dsnutilUCSArgOptionalParens | dsnutilUCSArgList1) (DSNUTIL_DISCARDDN dsnutilUCSArgOptionalParens)?) 
	| (DSNUTIL_INCURSOR dsnutilUCSArgOptionalParens)
	)
	;

dsnutilUCSIntoTableSpecNumrecsOption
	: (DSNUTIL_NUMRECS dsnutilUCSArgOptionalParens)
	;

dsnutilUCSIntoTableSpecWhenOption
	: (
	DSNUTIL_WHEN 
	((DSNUTIL_SQLDS DSNUTIL_EQUAL dsnutilUCSArg) 
	| dsnutilUCSFieldSelectionCriterion)
	)
	;

dsnutilUCSLoadFieldListOption
	: (
	DSNUTIL_LPAREN 
	dsnutilUCSLoadFieldSpecification 
	(DSNUTIL_COMMA dsnutilUCSLoadFieldSpecification)* 
	DSNUTIL_RPAREN1
	)
	;

dsnutilUCSUnloadFieldListOption
	: (
	DSNUTIL_LPAREN 
	dsnutilUCSUnloadFieldSpecification 
	(DSNUTIL_COMMA dsnutilUCSUnloadFieldSpecification)* 
	DSNUTIL_RPAREN1
	)
	;

dsnutilUCSIgnoreFieldsOption
	: (
	DSNUTIL_IGNOREFIELDS dsnutilUCSYesOrNo
	)
	;

dsnutilUCSIntoTableResumeSpec
	: (
	dsnutilUCSIntoTableResumeSpecOptions
	)
	;

dsnutilUCSIntoTableResumeSpecOptions
	: (
	(DSNUTIL_RESUME dsnutilUCSYesOrNo)
	| (DSNUTIL_REPLACE DSNUTIL_REUSE?)
	| dsnutilUCSLoadCopySpec
	| DSNUTIL_KEEPDICTIONARY
	)
	;

dsnutilUCSFieldSelectionCriterion
	: (
	(dsnutilUCSFieldNameSpec | dsnutilUCSArgInParens) DSNUTIL_EQUAL dsnutilUCSArg
	)
	;

dsnutilUCSLoadFieldSpecification
	: (
	dsnutilUCSFieldNameSpec
	dsnutilUCSLoadFieldSpecificationType?
	(dsnutilUCSNullif | dsnutilUCSDefaultif)?
	)
	;

dsnutilUCSUnloadFieldSpecification
	: (
	dsnutilUCSFieldNameSpec
	dsnutilUCSUnloadFieldSpecificationType?
	)
	;

dsnutilUCSLoadFieldSpecificationType
	: (
	dsnutilUCSLoadFieldSpecificationChar
	| dsnutilUCSLoadFieldSpecificationVarchar
	| dsnutilUCSFieldSpecificationGraphic
	| dsnutilUCSFieldSpecificationVargraphic
	| dsnutilUCSFieldSpecificationSmallint
	| dsnutilUCSFieldSpecificationInteger
	| dsnutilUCSFieldSpecificationBigint
	| dsnutilUCSFieldSpecificationBinary
	| dsnutilUCSFieldSpecificationVarbinary
	| dsnutilUCSLoadDecimalSpec
	| dsnutilUCSFieldSpecificationFloat
	| dsnutilUCSFieldSpecificationDate
	| dsnutilUCSFieldSpecificationTime
	| dsnutilUCSFieldSpecificationTimestamp
	| dsnutilUCSFieldSpecificationTimestampWithTimeZone
	| dsnutilUCSFieldSpecificationRowid
	| dsnutilUCSLoadFieldSpecificationBlob
	| dsnutilUCSLoadFieldSpecificationClob
	| dsnutilUCSLoadFieldSpecificationDbclob
	| dsnutilUCSFieldSpecificationDecfloat
	| dsnutilUCSFieldSpecificationXml
	)
	;

dsnutilUCSUnloadFieldSpecificationType
	: (
	dsnutilUCSUnloadFieldSpecificationChar
	| dsnutilUCSUnloadFieldSpecificationVarchar
	| dsnutilUCSFieldSpecificationGraphic
	| dsnutilUCSFieldSpecificationVargraphic
	| dsnutilUCSFieldSpecificationSmallint
	| dsnutilUCSFieldSpecificationInteger
	| dsnutilUCSFieldSpecificationBigint
	| dsnutilUCSFieldSpecificationBinary
	| dsnutilUCSFieldSpecificationVarbinary
	| dsnutilUCSStripSpec
	| dsnutilUCSUnloadDecimalSpec
	| dsnutilUCSFieldSpecificationFloat
	| dsnutilUCSFieldSpecificationDouble
	| dsnutilUCSFieldSpecificationReal
	| dsnutilUCSFieldSpecificationDate
	| dsnutilUCSFieldSpecificationTime
	| dsnutilUCSFieldSpecificationTimestamp
	| dsnutilUCSFieldSpecificationTimestampWithTimeZone
	| dsnutilUCSUnloadFieldSpecificationConstant
	| dsnutilUCSFieldSpecificationRowid
	| dsnutilUCSUnloadFieldSpecificationBlob
	| dsnutilUCSUnloadFieldSpecificationClob
	| dsnutilUCSUnloadFieldSpecificationDbclob
	| dsnutilUCSFieldSpecificationDecfloat
	| dsnutilUCSFieldSpecificationXml
	)
	;

/*
Having a length in parentheses isn't noted in the syntax diagram
but it is in the examples.  And I'm allowing a strip-spec because
as long as I have to make things up, I'm going to make things up
that seem correct to me.
*/
dsnutilUCSLoadFieldSpecificationChar
	: (
	(DSNUTIL_CHAR | DSNUTIL_CHARACTER)
		(
		(DSNUTIL_BIT dsnutilUCSArgInParens dsnutilUCSStripSpec*)
		| (dsnutilUCSCCSIDPhrase dsnutilUCSStripSpec*)
		| (DSNUTIL_MIXED dsnutilUCSStripSpec*)
		| (DSNUTIL_BLOBF dsnutilUCSBlobfOptions*)
		| (DSNUTIL_CLOBF dsnutilUCSClobfOptions*)
		| (DSNUTIL_DBCLOBF dsnutilUCSDbclobfOptions*)
		| (dsnutilUCSArgInParens dsnutilUCSStripSpec*)
		)?
	)
	;

dsnutilUCSUnloadFieldSpecificationChar
	: (
	(DSNUTIL_CHAR | DSNUTIL_CHARACTER)
	dsnutilUCSArgInParens?
	((DSNUTIL_TRUNCATE dsnutilUCSCCSIDPhrase?)
	| dsnutilUCSUnloadClobfSpec
	| (dsnutilUCSCCSIDPhrase DSNUTIL_TRUNCATE?))
	)
	;

dsnutilUCSUnloadClobfSpec
	: (
	((DSNUTIL_DBCLOBF dsnutilUCSCCSIDPhrase)
	| (DSNUTIL_CLOBF dsnutilUCSCCSIDPhrase)
	| DSNUTIL_BLOBF)
	dsnutilUCSTemplateName
	DSNUTIL_BINARYXML?
	)
	;

dsnutilUCSLoadFieldSpecificationVarchar
	: (
	DSNUTIL_VARCHAR
		(
		DSNUTIL_BIT
		| dsnutilUCSCCSIDPhrase
		| DSNUTIL_MIXED
		| (DSNUTIL_BLOBF dsnutilUCSBlobfOptions*)
		| (DSNUTIL_CLOBF dsnutilUCSClobfOptions*)
		| (DSNUTIL_DBCLOBF dsnutilUCSDbclobfOptions*)
		| dsnutilUCSArgInParens
		)?
	dsnutilUCSStripSpec?
	)
	;

dsnutilUCSUnloadFieldSpecificationVarchar
	: (
	DSNUTIL_VARCHAR
	dsnutilUCSArgInParens?
	((dsnutilUCSStripSpec dsnutilUCSCCSIDPhrase?)
	| dsnutilUCSUnloadClobfSpec
	| (dsnutilUCSCCSIDPhrase dsnutilUCSStripSpec?))
	)
	;

dsnutilUCSFieldSpecificationGraphic
	: (
	DSNUTIL_GRAPHIC dsnutilUCSGraphicOptions*
	)
	;

dsnutilUCSFieldSpecificationVargraphic
	: (
	DSNUTIL_VARGRAPHIC dsnutilUCSVargraphicOptions*
	)
	;

dsnutilUCSFieldSpecificationSmallint
	:(
	DSNUTIL_SMALLINT
	)
	;

dsnutilUCSFieldSpecificationInteger
	: (
	(DSNUTIL_INTEGER | DSNUTIL_INT) dsnutilUCSIntegerOptions*
	)
	;

dsnutilUCSFieldSpecificationBigint
	: (
	DSNUTIL_BIGINT
	)
	;

dsnutilUCSFieldSpecificationBinary
	: (
	DSNUTIL_BINARY dsnutilUCSBinaryOptions*
	)
	;

dsnutilUCSFieldSpecificationVarbinary
	: (
	(DSNUTIL_VARBINARY | (DSNUTIL_BINARY DSNUTIL_VARYING)) dsnutilUCSStripSpec*
	)
	;

dsnutilUCSFieldSpecificationFloat
	: (
	DSNUTIL_FLOAT dsnutilUCSFloatOptions*
	)
	;

dsnutilUCSFieldSpecificationDouble
	: (
	DSNUTIL_DOUBLE
	)
	;

dsnutilUCSFieldSpecificationReal
	: (
	DSNUTIL_REAL
	)
	;

dsnutilUCSFieldSpecificationDate
	: (
	DSNUTIL_DATE
	(DSNUTIL_DATE_P | (DSNUTIL_EXTERNAL dsnutilUCSArgInParens?))
	)
	;

dsnutilUCSFieldSpecificationTime
	: (
	DSNUTIL_TIME DSNUTIL_EXTERNAL dsnutilUCSArgInParens?
	)
	;

dsnutilUCSFieldSpecificationTimestamp
	: (
	DSNUTIL_TIMESTAMP DSNUTIL_EXTERNAL dsnutilUCSArgInParens?
	)
	;

dsnutilUCSFieldSpecificationTimestampWithTimeZone
	: (
	DSNUTIL_TIMESTAMP_WITH_TIME_ZONE DSNUTIL_EXTERNAL dsnutilUCSArgInParens?
	)
	;

dsnutilUCSUnloadFieldSpecificationConstant
	: (
	DSNUTIL_CONSTANT dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSFieldSpecificationRowid
	: (
	DSNUTIL_ROWID
	)
	;

dsnutilUCSLoadFieldSpecificationBlob
	: (
	DSNUTIL_BLOB 
	)
	;

dsnutilUCSUnloadFieldSpecificationBlob
	: (
	DSNUTIL_BLOB 
	dsnutilUCSArgInParens? 
	DSNUTIL_TRUNCATE?
	)
	;

dsnutilUCSLoadFieldSpecificationClob
	: (
	DSNUTIL_CLOB dsnutilUCSClobOptions*
	)
	;

dsnutilUCSUnloadFieldSpecificationClob
	: (
	DSNUTIL_CLOB
	dsnutilUCSArgInParens? 
	DSNUTIL_TRUNCATE?
	dsnutilUCSCCSIDPhrase?
	)
	;

dsnutilUCSLoadFieldSpecificationDbclob
	: (
	DSNUTIL_DBCLOB dsnutilUCSCCSIDPhrase?
	)
	;

dsnutilUCSUnloadFieldSpecificationDbclob
	: (
	DSNUTIL_DBCLOB
	dsnutilUCSArgInParens? 
	DSNUTIL_TRUNCATE?
	dsnutilUCSCCSIDPhrase?
	)
	;

dsnutilUCSFieldSpecificationDecfloat
	: (
	DSNUTIL_DECFLOAT dsnutilUCSDecfloatOptions*
	)
	;

dsnutilUCSFieldSpecificationXml
	: (
	DSNUTIL_XML dsnutilUCSXmlOptions*
	)
	;

dsnutilUCSNullif
	: (
	DSNUTIL_NULLIF 
	(dsnutilUCSFieldSelectionCriterion
	| (DSNUTIL_LPAREN1 dsnutilUCSFieldSelectionCriterion (DSNUTIL_RPAREN1 | DSNUTIL_DB_TS_RPAREN)))
	)
	;

dsnutilUCSDefaultif
	: (
	DSNUTIL_DEFAULTIF 
	(dsnutilUCSDefaultifCondition
	| (DSNUTIL_LPAREN1 dsnutilUCSDefaultifCondition (DSNUTIL_RPAREN1 | DSNUTIL_DB_TS_RPAREN)))
	)
	;

dsnutilUCSXmlOptions
	: (
	dsnutilUCSPreserveWhitespace
	| DSNUTIL_BINARYXML
	)
	;

dsnutilUCSDecfloatOptions
	: (
	DSNUTIL_EXTERNAL
	| dsnutilUCSArgInParens
	)
	;

dsnutilUCSClobOptions
	: (
	DSNUTIL_MIXED
	| dsnutilUCSCCSIDPhrase
	)
	;

dsnutilUCSFloatOptions
	: (
	DSNUTIL_EXTERNAL
	| dsnutilUCSArgInParens
	)
	;

/*
A * after dsnutilUCSStripSpec is not necessary because
this rule is itself followed by a *.
*/
dsnutilUCSBinaryOptions
	: (
	dsnutilUCSArgInParens
	| dsnutilUCSStripSpec
	)
	;

dsnutilUCSIntegerOptions
	: (
	DSNUTIL_EXTERNAL
	| dsnutilUCSArgInParens
	)
	;

/*
A * after dsnutilUCSStripSpec is not necessary because
this rule is itself followed by a *.
*/
dsnutilUCSVargraphicOptions
	: (
	dsnutilUCSStripSpec
	| dsnutilUCSCCSIDPhrase
	)
	;

/*
A * after dsnutilUCSStripSpec is not necessary because
this rule is itself followed by a *.
*/
dsnutilUCSGraphicOptions
	: (
	DSNUTIL_EXTERNAL
	| dsnutilUCSArgInParens
	| dsnutilUCSStripSpec
	| dsnutilUCSCCSIDPhrase
	)
	;

dsnutilUCSBlobfOptions
	: (
	dsnutilUCSPreserveWhitespace
	| DSNUTIL_BINARYXML
	)
	;

dsnutilUCSClobfOptions
	: (
	DSNUTIL_MIXED
	| dsnutilUCSPreserveWhitespace
	| dsnutilUCSCCSIDPhrase
	)
	;

dsnutilUCSDbclobfOptions
	: (
	dsnutilUCSPreserveWhitespace
	| dsnutilUCSCCSIDPhrase
	)
	;

dsnutilUCSPreserveWhitespace
	: (DSNUTIL_PRESERVE DSNUTIL_WHITESPACE)
	;

dsnutilUCSFieldNameSpec
	: (
	dsnutilUCSFieldName dsnutilUCSFieldNameOptions*
	)
	;

dsnutilUCSFieldNameOptions
	: (
	dsnutilUCSFieldNamePositionOption
	| dsnutilUCSFieldNameConstantifOption
	| dsnutilUCSFieldNameConstantOption
	)
	;

dsnutilUCSFieldNamePositionOption
	: (DSNUTIL_POSITION dsnutilUCSArgInParens)
	;

dsnutilUCSFieldNameConstantifOption
	: (DSNUTIL_CONSTANTIF dsnutilUCSFieldSelectionCriterion)
	;

dsnutilUCSFieldNameConstantOption
	: (DSNUTIL_CONSTANT dsnutilUCSArgInParens)
	;

dsnutilUCSStripSpec
	: (
	(DSNUTIL_STRIP (DSNUTIL_BOTH | DSNUTIL_TRAILING | DSNUTIL_LEADING)? dsnutilUCSArg?)
	| DSNUTIL_TRUNCATE
	)
	;

dsnutilUCSLoadDecimalSpec
	: (
	DSNUTIL_DECIMAL
	(DSNUTIL_PACKED | DSNUTIL_ZONED | (DSNUTIL_EXTERNAL (dsnutilUCSArgList1)?))
	)
	;

dsnutilUCSUnloadDecimalSpec
	: (
	DSNUTIL_DECIMAL
	(DSNUTIL_PACKED | DSNUTIL_ZONED | DSNUTIL_EXTERNAL)?
	dsnutilUCSArgList1?
	)
	;

dsnutilUCSDefaultifCondition
	: (
	DSNUTIL_CONV_ERROR
	| ((dsnutilUCSFieldName | dsnutilUCSArgInParens) (DSNUTIL_EQUAL | DSNUTIL_NOT_EQUAL) dsnutilUCSArg)
	)
	;

dsnutilUCSMergecopy
	: (
	DSNUTIL_MERGECOPY
	dsnutilUCSMergecopyListOrTablespace
	dsnutilUCSMergecopyOptions*
	)
	;

dsnutilUCSMergecopyListOrTablespace
	: (
	dsnutilUCSListNameWithLit | (dsnutilUCSQualifiedTablespaceNameWithLit dsnutilUCSDsnumOption?)
	)
	;

dsnutilUCSMergecopyOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSMergecopyWorkddnOption
	| dsnutilUCSNewcopyOption
	| dsnutilUCSCopyddnOption
	| dsnutilUCSRecoveryddnOption1
	)
	;

dsnutilUCSMergecopyWorkddnOption
	: (
	DSNUTIL_WORKDDN dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSNewcopyOption
	: (
	DSNUTIL_NEWCOPY dsnutilUCSYesOrNo
	)
	;

/*
Allow for argument in optional parentheses per Martijn Rutte
2023-10-24.
*/
dsnutilUCSCopyddnOption
	: (
	DSNUTIL_COPYDDN 
	(dsnutilUCSArg
	| dsnutilUCSArgList2
	| dsnutilUCSArgOptionalParens)
	)
	;

dsnutilUCSRecoveryddnOption1
	: (
	DSNUTIL_RECOVERYDDN dsnutilUCSArgList1
	)
	;

dsnutilUCSRecoveryddnOption2
	: (
	DSNUTIL_RECOVERYDDN dsnutilUCSArgList2
	)
	;

dsnutilUCSModifyRecovery
	: (
	DSNUTIL_MODIFY DSNUTIL_RECOVERY
	dsnutilUCSModifyRecoveryListOrTablespace
	dsnutilUCSModifyRecoveryOptions*
	)
	;

dsnutilUCSModifyRecoveryListOrTablespace
	: (
	(dsnutilUCSListNameWithLit | dsnutilUCSQualifiedTablespaceNameWithLit) dsnutilUCSDsnumOption?
	)
	;

dsnutilUCSModifyRecoveryOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSModifyRecoveryDeleteOption
	| dsnutilUCSModifyRecoveryRetainOption
	| dsnutilUCSModifyRecoveryDeletedsOption
	| dsnutilUCSModifyRecoveryNocopypendOption
	)
	;

dsnutilUCSModifyRecoveryDeleteOption
	: (
	DSNUTIL_DELETE
	(DSNUTIL_AGE | DSNUTIL_DATE) dsnutilUCSArgOptionalParens?
	dsnutilUCSModifyRecoveryFlashcopy?
	)
	;

dsnutilUCSModifyRecoveryFlashcopy
	: (
	DSNUTIL_FLASHCOPY
	(DSNUTIL_ONLY
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_ONLY DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSModifyRecoveryDeletedsOption
	: (
	DSNUTIL_DELETEDS
	)
	;

dsnutilUCSModifyRecoveryRetainOption
	: (
	DSNUTIL_RETAIN
	((DSNUTIL_LAST dsnutilUCSArgInParens dsnutilUCSModifyRecoveryFlashcopy?)
	| DSNUTIL_LOGLIMIT
	| (DSNUTIL_GDGLIMIT ((DSNUTIL_LAST dsnutilUCSArgInParens) | DSNUTIL_LOGLIMIT)?)
	| (DSNUTIL_GDGLIMIT (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_LOGLIMIT DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSModifyRecoveryNocopypendOption
	: (
	DSNUTIL_NOCOPYPEND
	)
	;

dsnutilUCSModifyStatistics
	: (
	DSNUTIL_MODIFY DSNUTIL_STATISTICS
	dsnutilUCSModifyStatisticsListOrTablespaceEtAl
	dsnutilUCSModifyStatisticsOptions*
	)
	;

dsnutilUCSModifyStatisticsListOrTablespaceEtAl
	: (
	dsnutilUCSListNameWithLit 
	| dsnutilUCSQualifiedTablespaceNameWithLit
	| dsnutilUCSQualifiedIndexspaceNameWithLit
	| dsnutilUCSQualifiedIndexNameWithLit
	)
	;

dsnutilUCSModifyStatisticsOptions
	: (
	dsnutilUCSModifyStatisticsDeleteOption
	| dsnutilUCSModifyStatisticsAgeOption
	| dsnutilUCSModifyStatisticsDateOption
	)
	;

dsnutilUCSModifyStatisticsDeleteOption 
	: (
	DSNUTIL_DELETE 
	((DSNUTIL_ALL | DSNUTIL_ACCESSPATH | DSNUTIL_SPACE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_ALL | DSNUTIL_ACCESSPATH | DSNUTIL_SPACE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSModifyStatisticsAgeOption
	: (
	DSNUTIL_AGE dsnutilUCSArgOptionalParens?
	)
	;

dsnutilUCSModifyStatisticsDateOption
	: (
	DSNUTIL_DATE dsnutilUCSArgOptionalParens?
	)
	;

dsnutilUCSOptions
	: (
	DSNUTIL_OPTIONS
	dsnutilUCSOptionsProcessingOptionsSpec*
	)
	;

dsnutilUCSOptionsOff
	: (
	DSNUTIL_OFF
	)
	;

dsnutilUCSOptionsKey
	: (
	DSNUTIL_KEY dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSOptionsProcessingOptionsSpec
	: (
	dsnutilUCSOptionsPreviewOption
	| dsnutilUCSOptionsListdefddOption
	| dsnutilUCSOptionsTemplateddOption
	| dsnutilUCSOptionsFilszOption
	| dsnutilUCSOptionsEventSpecOption
	| dsnutilUCSOptionsOff
	| dsnutilUCSOptionsKey
	)
	;

dsnutilUCSOptionsPreviewOption
	: (
	DSNUTIL_PREVIEW
	)
	;

dsnutilUCSOptionsListdefddOption
	: (
	DSNUTIL_LISTDEFDD dsnutilUCSArgOptionalParens
	)
	;

/*
Fix by Martijn Rutte, contrary to IBM documentation as of 2023-10-20
the TEMPLATEDD argument can optionally be enclosed in parentheses.
*/
dsnutilUCSOptionsTemplateddOption
	: (
	DSNUTIL_TEMPLATEDD dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSOptionsFilszOption
	: (
	DSNUTIL_FILSZ dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSOptionsEventSpecOption
	: (
	DSNUTIL_EVENT
	((DSNUTIL_LPAREN dsnutilUCSOptionsEventSpecOptionOptions (DSNUTIL_COMMA? dsnutilUCSOptionsEventSpecOptionOptions)? DSNUTIL_RPAREN1)
	| (dsnutilUCSOptionsEventSpecOptionOptions (DSNUTIL_COMMA? dsnutilUCSOptionsEventSpecOptionOptions)?))
	)
	;

dsnutilUCSOptionsEventSpecOptionOptions
	: (
	dsnutilUCSOptionsEventItemerrOption
	| dsnutilUCSOptionsEventWarningOption
	)
	;

dsnutilUCSOptionsEventItemerrOption
	: (
	DSNUTIL_ITEMERROR (DSNUTIL_COMMA? (DSNUTIL_HALT | DSNUTIL_SKIP))
	)
	;

dsnutilUCSOptionsEventWarningOption
	: (
	DSNUTIL_WARNING (DSNUTIL_COMMA? (DSNUTIL_RC0 | DSNUTIL_RC4 | DSNUTIL_RC8))
	)
	;

dsnutilUCSQuiesce
	: (
	DSNUTIL_QUIESCE
	dsnutilUCSQuiesceListOrTablespaceEtAl
	dsnutilUCSQuiesceOptions*
	)
	;

dsnutilUCSQuiesceListOrTablespaceEtAl
	: (
	dsnutilUCSListNameWithLit 
	| ((dsnutilUCSQualifiedTablespaceNameWithLit dsnutilUCSPartOption1?)
	| (DSNUTIL_TABLESPACESET dsnutilUCSQualifiedTablespaceNameWithLit))+
	)
	;

dsnutilUCSQuiesceOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSQuiesceWriteOption
	)
	;

dsnutilUCSQuiesceWriteOption
	: (
	DSNUTIL_WRITE dsnutilUCSYesOrNo
	)
	;

dsnutilUCSRebuildIndex
	: (
	DSNUTIL_REBUILD
	dsnutilUCSRebuildIndexSpec
	dsnutilUCSRebuildIndexOptions*
	)
	;

dsnutilUCSRebuildIndexSpec
	: (
	dsnutilUCSRebuildIndexSpecIndex
	| dsnutilUCSRebuildIndexSpecIndexspace
	)
	;

dsnutilUCSRebuildIndexSpecIndex
	: (
	(DSNUTIL_INDEX DSNUTIL_DB_TS_LPAREN dsnutilUCSIndexSpec (DSNUTIL_COMMA dsnutilUCSIndexSpec)* DSNUTIL_RPAREN1)
	| (DSNUTIL_INDEX dsnutilUCSAllInParens dsnutilUCSTablespaceSpec)
	| (DSNUTIL_INDEX_LIST dsnutilUCSListName)
	)
	;

dsnutilUCSAllInParens
	: (
	DSNUTIL_DB_TS_LPAREN DSNUTIL_ALL DSNUTIL_RPAREN1
	)
	;

dsnutilUCSRebuildIndexSpecIndexspace
	: (
	(DSNUTIL_INDEXSPACE DSNUTIL_DB_TS_LPAREN dsnutilUCSRebuildIndexIndexspaceSpec (DSNUTIL_COMMA dsnutilUCSRebuildIndexIndexspaceSpec)*) DSNUTIL_RPAREN1
	| (DSNUTIL_INDEXSPACE dsnutilUCSAllInParens dsnutilUCSTablespaceSpec)
	| (DSNUTIL_INDEXSPACE_LIST dsnutilUCSListName)
	)
	;
	
dsnutilUCSIndexSpec
	: (
	dsnutilUCSQualifiedIndexName dsnutilUCSPartOption1?
	)
	;

dsnutilUCSRebuildIndexIndexspaceSpec
	: (
	dsnutilUCSQualifiedIndexspaceName dsnutilUCSPartOption1?
	)
	;

dsnutilUCSRebuildIndexOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSRebuildIndexShrlevelOption
	| dsnutilUCSDrainWaitOption
	| dsnutilUCSRetryOption
	| dsnutilUCSRetryDelayOption
	| dsnutilUCSScopeOption
	| dsnutilUCSReuseOption
	| dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	| dsnutilUCSFlashcopyOption
	| dsnutilUCSRebuildIndexParallelOption
	| dsnutilUCSRbalrsnConversionOption
	| dsnutilUCSRebuildIndexStatsSpec
	)
	;

dsnutilUCSRebuildIndexShrlevelOption
	: (
	DSNUTIL_SHRLEVEL 
	((DSNUTIL_REFERENCE | (DSNUTIL_CHANGE dsnutilUCSRebuildIndexChangeSpec*))
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_REFERENCE DSNUTIL_RPAREN1)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1 dsnutilUCSRebuildIndexChangeSpec*))
	)
	;

dsnutilUCSRebuildIndexChangeSpec
	: (
	dsnutilUCSMaxroOption
	| dsnutilUCSLonglogOption
	| dsnutilUCSDelayOption
	)
	;

dsnutilUCSMaxroOption
	: (
	DSNUTIL_MAXRO dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLonglogOption
	: (
	DSNUTIL_LONGLOG 
	((DSNUTIL_CONTINUE | DSNUTIL_TERM | DSNUTIL_DRAIN)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_CONTINUE | DSNUTIL_TERM | DSNUTIL_DRAIN) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSDelayOption
	: (
	DSNUTIL_DELAY dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSRebuildIndexStatsSpec
	: (
	DSNUTIL_STATISTICS
	dsnutilUCSRebuildIndexStatsSpecOptions*
	)
	;

dsnutilUCSRebuildIndexStatsSpecOptions
	: (
	dsnutilUCSReportOption
	| dsnutilUCSUpdateOption
	| dsnutilUCSInvalidatecacheOption
	| dsnutilUCSHistoryOption
	| dsnutilUCSForcerollupOption
	| dsnutilUCSCorrelationStatsSpec
	)
	;

dsnutilUCSRebuildIndexParallelOption
	: (DSNUTIL_PARALLEL dsnutilUCSArgInParens)
	;

dsnutilUCSRecover
	: (
	DSNUTIL_RECOVER
	(((dsnutilUCSListNameWithLit | (dsnutilUCSRecoverObjectSpec dsnutilUCSDsnumOption?)+) dsnutilUCSRecoverListOptionsSpec*)
	| dsnutilUCSRecoverOptionsSpec
	| dsnutilUCSRecoverFromMultiSpec
	| dsnutilUCSRecoverFromSpec
	| (dsnutilUCSRecoverObjectSpec DSNUTIL_PAGE dsnutilUCSArgOptionalParens DSNUTIL_CONTINUE?))
	dsnutilUCSRecoverSiteOption?
	dsnutilUCSLograngesOption?
	)
	;

dsnutilUCSLograngesOption
	: (
	DSNUTIL_LOGRANGES dsnutilUCSYesOrNo
	)
	;

dsnutilUCSRecoverListOptionsSpec
	: (
	dsnutilUCSBackoutOption
	| dsnutilUCSVerifysetOption
	| dsnutilUCSEnforceOption
	| dsnutilUCSTorbaOption
	| dsnutilUCSRecoverNonLogonlyOptionsSpec
	| dsnutilUCSLogonlyOption
	| dsnutilUCSScopeOption2
	| dsnutilUCSRecoverSiteOption
	)
	;

dsnutilUCSRecoverSiteOption
	: (
	DSNUTIL_LOCALSITE | DSNUTIL_RECOVERYSITE
	)
	;

dsnutilUCSScopeOption2
	: (
	DSNUTIL_SCOPE 
	((DSNUTIL_UPDATED | DSNUTIL_ALL)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_UPDATED | DSNUTIL_ALL) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSRecoverOptionsSpec
	:(
	dsnutilUCSRecoverObjectSpec
	dsnutilUCSDsnumOption?
	((DSNUTIL_TOCOPY dsnutilUCSDsn dsnutilUCSRecoverImageCopySpec? dsnutilUCSRecoverTocopyOptionsSpec*)
	| (DSNUTIL_TOLASTCOPY dsnutilUCSRecoverTocopyOptionsSpec*)
	| (DSNUTIL_TOLASTFULLCOPY dsnutilUCSRecoverTocopyOptionsSpec*)
	| (DSNUTIL_ERROR DSNUTIL_RANGE))
	)
	;

dsnutilUCSRecoverObjectSpec
	: (
	dsnutilUCSRecoverObjectSpecTablespace
	| dsnutilUCSRecoverObjectSpecIndexpace
	| dsnutilUCSRecoverObjectSpecIndex
	)
	;

dsnutilUCSRecoverObjectSpecTablespace
	: (
	dsnutilUCSQualifiedTablespaceNameWithLit 
	)
	;

dsnutilUCSRecoverObjectSpecIndexpace
	: (
	dsnutilUCSQualifiedIndexspaceNameWithLit 
	)
	;

dsnutilUCSRecoverObjectSpecIndex
	: (
	dsnutilUCSQualifiedIndexNameWithLit
	)
	;

dsnutilUCSRecoverFromMultiSpec
	: (
	(dsnutilUCSRecoverFromSpecTablespace
	| dsnutilUCSRecoverFromSpecIndexspace
	| dsnutilUCSRecoverFromSpecIndex
	| dsnutilUCSRecoverFromMultiSpecOptions)+
	)
	;

dsnutilUCSRecoverFromMultiSpecOptions
	: (
	dsnutilUCSVerifysetOption
	| dsnutilUCSEnforceOption
	| dsnutilUCSTorbaOption
	| dsnutilUCSRecoverNonLogonlyOptionsSpec
	| dsnutilUCSLogonlyOption
	)
	;

dsnutilUCSVerifysetOption
	: (
	DSNUTIL_VERIFYSET dsnutilUCSYesOrNo
	)
	;

dsnutilUCSEnforceOption
	: (
	DSNUTIL_ENFORCE dsnutilUCSYesOrNo
	)
	;

dsnutilUCSTorbaOption
	: (
	(DSNUTIL_TORBA | DSNUTIL_TOLOGPOINT) dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLogonlyOption
	: (
	DSNUTIL_LOGONLY
	)
	;

dsnutilUCSRecoverNonLogonlyOptionsSpec
	: (
	dsnutilUCSReuseOption
	| dsnutilUCSCurrentCopyOnlyOption
	| dsnutilUCSParallelOption2
	| dsnutilUCSTapeunitsOption
	| dsnutilUCSRestorebeforeOption
	| dsnutilUCSFromdumpOption
	| dsnutilUCSFlashcopyPprcpOption
 	| dsnutilUCSAlternatecpOption
	)
	;

dsnutilUCSCurrentCopyOnlyOption
	: (
	DSNUTIL_CURRENTCOPYONLY
	)
	;

dsnutilUCSRestorebeforeOption
	: (
	DSNUTIL_RESTOREBEFORE dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSFromdumpOption
	: (
	DSNUTIL_FROMDUMP dsnutilUCSDumpclassSpec?
	)
	;

dsnutilUCSRecoverFromSpec
	: (
	(dsnutilUCSRecoverFromSpecTablespace
	| dsnutilUCSRecoverFromSpecIndexspace
	| dsnutilUCSRecoverFromSpecIndex)
	dsnutilUCSRecoverFromSpecTocopy
	)
	;

dsnutilUCSRecoverFromSpecTablespace
	: (
	dsnutilUCSQualifiedTablespaceNameWithLit 
	dsnutilUCSDsnumOption?
	dsnutilUCSRecoverFromSpecTablespaceFrom?
	)
	;

dsnutilUCSRecoverFromSpecTablespaceFrom
	: (
	DSNUTIL_FROM
	dsnutilUCSQualifiedTablespaceName
	dsnutilUCSDsnumOption?
	)
	;

dsnutilUCSRecoverFromSpecIndexspace
	: (
	dsnutilUCSQualifiedIndexspaceNameWithLit 
	dsnutilUCSDsnumOption?
	dsnutilUCSRecoverFromSpecIndexspaceFrom?
	)
	;

dsnutilUCSRecoverFromSpecIndexspaceFrom
	: (
	DSNUTIL_FROM
	dsnutilUCSQualifiedIndexspaceName
	dsnutilUCSDsnumOption?
	)
	;

dsnutilUCSRecoverFromSpecIndex
	: (
	dsnutilUCSQualifiedIndexNameWithLit
	dsnutilUCSDsnumOption?
	dsnutilUCSRecoverFromSpecIndexFrom?
	)
	;

dsnutilUCSRecoverFromSpecIndexFrom
	: (
	DSNUTIL_FROM
	dsnutilUCSQualifiedIndexName
	dsnutilUCSDsnumOption?
	)
	;

dsnutilUCSRecoverFromSpecTocopy
	:(
	(DSNUTIL_TOCOPY dsnutilUCSDsn dsnutilUCSRecoverImageCopySpec? dsnutilUCSRecoverTocopyOptionsSpec*)
	| (DSNUTIL_TOLASTCOPY dsnutilUCSRecoverTocopyOptionsSpec*)
	| (DSNUTIL_TOLASTFULLCOPY dsnutilUCSRecoverTocopyOptionsSpec*)
	)
	;

dsnutilUCSRecoverTocopyOptionsSpec
	: (
	dsnutilUCSReuseOption
	| dsnutilUCSRecoverCurrentcopyonlyOption
	| dsnutilUCSRecoverEnforceOption
	| dsnutilUCSRecoverNosyscopyOption
	| dsnutilUCSFlashcopyPprcpOption
	)
	;

dsnutilUCSRecoverCurrentcopyonlyOption
	: (
	DSNUTIL_CURRENTCOPYONLY
	)
	;

dsnutilUCSRecoverEnforceOption
	: (
	DSNUTIL_ENFORCE dsnutilUCSYesOrNo
	)
	;

dsnutilUCSRecoverNosyscopyOption
	: (
	DSNUTIL_NOSYSCOPY 
	((DSNUTIL_INLCOPY | DSNUTIL_FCCOPY)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_INLCOPY | DSNUTIL_FCCOPY) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSFlashcopyPprcpOption
	: (
	DSNUTIL_FLASHCOPY_PPRCP
	(dsnutilUCSFlashcopyPprcpOptionOptions
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSFlashcopyPprcpOptionOptions DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSFlashcopyPprcpOptionOptions
	: (
	DSNUTIL_NO 
	| DSNUTIL_PMNO 
	| DSNUTIL_PMPREF 
	| DSNUTIL_PMREQ
	)
	;

dsnutilUCSRecoverImageCopySpec
	: (
	DSNUTIL_TOVOLUME
	(DSNUTIL_CATALOG
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CATALOG DSNUTIL_RPAREN1)
	| (dsnutilUCSVolSer (DSNUTIL_TOSEQNO dsnutilUCSVolSeqNo)?)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSVolSer DSNUTIL_RPAREN1 (DSNUTIL_TOSEQNO dsnutilUCSVolSeqNo)?)
	| (dsnutilUCSVolSer DSNUTIL_TOSEQNO (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSVolSeqNo DSNUTIL_RPAREN1)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSVolSer DSNUTIL_RPAREN1 DSNUTIL_TOSEQNO (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSVolSeqNo DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSReorgIndex
	: (
	DSNUTIL_REORG
	((DSNUTIL_INDEX_LIST dsnutilUCSListName)
	| dsnutilUCSReorgIndexIndexNameSpec)
	dsnutilUCSReorgIndexOptions*
	)
	;

dsnutilUCSReorgIndexOptions
	: (
	dsnutilUCSReuseOption
	| dsnutilUCSCloneOption
	| dsnutilUCSReorgIndexShrlevelOption
	| dsnutilUCSForceOption
	| dsnutilUCSReorgIndexLeafdistlimitOption
	| dsnutilUCSReorgIndexUnloadOption
	| dsnutilUCSReorgIndexStatsSpec
	| dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	| dsnutilUCSReorgIndexWorkddnOption
	| dsnutilUCSPreformatOption
	| dsnutilUCSFlashcopyOption
	| dsnutilUCSRbalrsnConversionOption
	| dsnutilUCSReorgIndexNosysut1Option
	| dsnutilUCSParallelOption2
	)
	;

dsnutilUCSReorgIndexShrlevelOption
	: (
	DSNUTIL_SHRLEVEL
	(DSNUTIL_NONE
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NONE DSNUTIL_RPAREN1)
	| (DSNUTIL_REFERENCE (dsnutilUCSDeadlineOption | dsnutilUCSReorgIndexDrainSpec)*)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_REFERENCE DSNUTIL_RPAREN1 (dsnutilUCSDeadlineOption | dsnutilUCSReorgIndexDrainSpec)*)
	| (DSNUTIL_CHANGE (dsnutilUCSDeadlineOption | dsnutilUCSReorgIndexDrainSpec | dsnutilUCSChangeSpec)*)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1 (dsnutilUCSDeadlineOption | dsnutilUCSReorgIndexDrainSpec | dsnutilUCSChangeSpec)*))
	dsnutilUCSFastswitchOption?
	)
	;

dsnutilUCSFastswitchOption
	: (
	DSNUTIL_FASTSWITCH dsnutilUCSYesOrNo
	)
	;

dsnutilUCSReorgIndexLeafdistlimitOption
	: (
	DSNUTIL_LEAFDISTLIMIT dsnutilUCSArgOptionalParens? DSNUTIL_REPORTONLY?
	)
	;

dsnutilUCSReorgIndexUnloadOption
	: (
	DSNUTIL_UNLOAD 
	((DSNUTIL_CONTINUE | DSNUTIL_PAUSE | DSNUTIL_ONLY)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_CONTINUE | DSNUTIL_PAUSE | DSNUTIL_ONLY) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSReorgIndexStatsSpec
	: (
	DSNUTIL_STATISTICS
	dsnutilUCSReorgIndexStatsSpecOptions+
	)
	;

dsnutilUCSReorgIndexStatsSpecOptions
	: (
	dsnutilUCSReportOption
	| dsnutilUCSUpdateOption
	| dsnutilUCSInvalidatecacheOption
	| dsnutilUCSHistoryOption
	| dsnutilUCSForcerollupOption
	| dsnutilUCSCorrelationStatsSpec
	)
	;

dsnutilUCSReorgIndexIndexNameSpec
	: (
	(dsnutilUCSQualifiedIndexNameWithLit
	| dsnutilUCSQualifiedIndexspaceNameWithLit)
	dsnutilUCSPartOption1?
	)
	;

dsnutilUCSReorgIndexDrainSpec
	: (
	dsnutilUCSDrainWaitOption
	| dsnutilUCSRetryOption
	| dsnutilUCSRetryDelayOption
	| dsnutilUCSTimeoutOption
	)
	;

dsnutilUCSTimeoutOption
	: (
	DSNUTIL_TIMEOUT 
	((DSNUTIL_TERM | DSNUTIL_ABEND)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_TERM | DSNUTIL_ABEND) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSReorgIndexWorkddnOption
	: (
	DSNUTIL_WORKDDN dsnutilUCSArgInParens
	)
	;

dsnutilUCSReorgIndexNosysut1Option
	: (
	DSNUTIL_NOSYSUT1
	)
	;

dsnutilUCSChangeSpec
	: (
	dsnutilUCSMaxroOption
	| dsnutilUCSDrainOption
	| dsnutilUCSLonglogOption
	| dsnutilUCSDelayOption
	| dsnutilUCSLograngesOption
	| dsnutilUCSLastlogOption
	| dsnutilUCSSwitchtimeOption
	)
	;

dsnutilUCSLastlogOption
	: (
	DSNUTIL_LASTLOG dsnutilUCSYesOrNo
	)
	;

dsnutilUCSDrainOption
	: (
	DSNUTIL_DRAIN 
	((DSNUTIL_ALL | DSNUTIL_WRITERS)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_ALL | DSNUTIL_WRITERS) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSDeadlineOption
	: (
	DSNUTIL_DEADLINE
	((DSNUTIL_NONE | dsnutilUCSTimestamp | dsnutilUCSLabeledDurationExpression)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_NONE | dsnutilUCSTimestamp | dsnutilUCSLabeledDurationExpression) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSReorgTablespace
	: (
	DSNUTIL_REORG 
	((DSNUTIL_TABLESPACE_LIST dsnutilUCSListName (DSNUTIL_LISTPARTS dsnutilUCSArgOptionalParens)?)
	| (dsnutilUCSQualifiedTablespaceNameWithLit (DSNUTIL_PART dsnutilUCSArgList1)?))
	dsnutilUCSReorgTablespaceOptions*
	)
	;

/*
It turns out that dsnutilUCSReorgTablespaceSortkeysOption being tolerated
but ignored has implications for other options.  For example, dsnutilUCSChangeSpec
is only part of two other (SHRLEVEL) options.  Because we may see the
SORTKEYS token interspersed with other tokens recognized as part of the
SHRLEVEL option, the parser believes it has hit the end of the SHRLEVEL
option.  So dsnutilUCSChangeSpec and dsnutilUCSMapSpec (et. al) must be 
included here on their own.

It is also possible that the syntax diagram is simply not communicating its
intent to me, and options which appear to be embedded in other options are
in fact independent.
*/
dsnutilUCSReorgTablespaceOptions
	: (
	dsnutilUCSCloneOption
	| dsnutilUCSReuseOption
	| dsnutilUCSScopeOption
	| dsnutilUCSRebalanceOption
	| dsnutilUCSLogOption
	| dsnutilUCSDropPartOption
	| dsnutilUCSSortdataOption
	| dsnutilUCSNosysrecOption
	| dsnutilUCSReorgTablespaceCopySpec
	| dsnutilUCSAutoestspaceOption
	| dsnutilUCSReorgTablespaceShrlevelSpec
	| dsnutilUCSForceOption
	| dsnutilUCSSortnpsiOption
	| dsnutilUCSOffposlimitSpec
	| dsnutilUCSReorgUnloadSpec
	| dsnutilUCSKeepdictionaryOption
	| dsnutilUCSStatisticsSpec
	| dsnutilUCSPunchddnOption
	| dsnutilUCSDiscarddnOption
	| dsnutilUCSUnlddnOption
	| dsnutilUCSSortSpec
	| dsnutilUCSPreformatOption
	| dsnutilUCSRowformatOption
	| dsnutilUCSRbalrsnConversionOption
	| dsnutilUCSDiscardSpec
	| dsnutilUCSParallelOption2
	| dsnutilUCSInitcddsSpec
	| dsnutilUCSNocheckpendOption
	| dsnutilUCSReorgTablespaceSortkeysOption
	| dsnutilUCSReorgTablespaceDrainSpec
	| dsnutilUCSChangeSpec
	| dsnutilUCSMapSpec
	| dsnutilUCSFastswitchOption 
	| dsnutilUCSAuxOption
	| dsnutilUCSFlashcopyOption
	)
	;


/*
As of DB2 8 this option is ignored, but apparently
still tolerated as of DB2 13.
*/
dsnutilUCSReorgTablespaceSortkeysOption
	: (
	DSNUTIL_SORTKEYS
	)
	;

dsnutilUCSRowformatOption
	: (
	DSNUTIL_ROWFORMAT 
	((DSNUTIL_RRF | DSNUTIL_BRF)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_RRF | DSNUTIL_BRF) DSNUTIL_RPAREN1))
	)
	;

/*
Allow for argument in optional paretheses per Martijn Rutte
2023-10-24.  This is tolerated by DB2 13 but is not documented.
*/
dsnutilUCSUnlddnOption
	: (
	DSNUTIL_UNLDDN dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSDiscarddnOption
	: (
	DSNUTIL_DISCARDDN dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSReorgUnloadSpec
	: (
	dsnutilUCSUnloadContinuePauseOnlySpec
	| dsnutilUCSUnloadExternalSpec
	)
	;

dsnutilUCSUnloadContinuePauseOnlySpec
	: (
	DSNUTIL_UNLOAD 
	((DSNUTIL_CONTINUE | DSNUTIL_PAUSE | DSNUTIL_ONLY) 
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_CONTINUE | DSNUTIL_PAUSE | DSNUTIL_ONLY) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSKeepdictionaryOption
	: (
	DSNUTIL_KEEPDICTIONARY 
	)
	;

dsnutilUCSUnloadOnlySpec
	: (
	DSNUTIL_UNLOAD 
	(DSNUTIL_ONLY
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_ONLY DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSSortnpsiOption
	: (
	DSNUTIL_SORTNPSI 
	((DSNUTIL_AUTO | DSNUTIL_YES | DSNUTIL_NO | dsnutilUCSArg)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_AUTO | DSNUTIL_YES | DSNUTIL_NO | dsnutilUCSArg) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSReorgTablespaceShrlevelSpec
	: (
	dsnutilUCSShrlevelNoneSpec
	| ((dsnutilUCSShrlevelReferenceSpec1 | dsnutilUCSShrlevelChangeSpec1) 
		(dsnutilUCSFastswitchOption | dsnutilUCSAuxOption)*)
	)
	;

dsnutilUCSAuxOption
	: (
	DSNUTIL_AUX dsnutilUCSYesOrNo
	)
	;

dsnutilUCSAutoestspaceOption
	: (
	DSNUTIL_AUTOESTSPACE dsnutilUCSYesOrNo
	)
	;

dsnutilUCSNosysrecOption
	: (
	DSNUTIL_NOSYSREC
	)
	;

dsnutilUCSSortdataOption
	: (
	(DSNUTIL_SORTDATA (DSNUTIL_NO (DSNUTIL_RECLUSTER dsnutilUCSYesOrNo)?)?)
	| (DSNUTIL_SORTDATA (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NO DSNUTIL_RPAREN1 (DSNUTIL_RECLUSTER dsnutilUCSYesOrNo)?)
	)
	;

dsnutilUCSDropPartOption
	: (
	DSNUTIL_DROP_PART dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSRebalanceOption
	: (
	DSNUTIL_REBALANCE
	(DSNUTIL_SORTCLUSTER dsnutilUCSYesOrNo)?
	)
	;

dsnutilUCSReorgTablespaceCopySpec
	: (
	(dsnutilUCSCopyddnOption dsnutilUCSRecoveryddnOption2?)
	| dsnutilUCSRecoveryddnOption2
	| dsnutilUCSIclimitDasdOption
	| dsnutilUCSIclimitTapeOption
	)
	;

dsnutilUCSIclimitDasdOption
	: (
	DSNUTIL_ICLIMIT_DASD dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSIclimitTapeOption
	: (
	DSNUTIL_ICLIMIT_TAPE dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSShrlevelNoneSpec
	: (
	DSNUTIL_SHRLEVEL 
	(DSNUTIL_NONE
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NONE DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSShrlevelReferenceSpec1
	: (
	DSNUTIL_SHRLEVEL 
	(DSNUTIL_REFERENCE
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_REFERENCE DSNUTIL_RPAREN1))
	(dsnutilUCSDeadlineOption
	| dsnutilUCSReorgTablespaceDrainSpec
	| dsnutilUCSChangeSpec)*
	)
	;

dsnutilUCSShrlevelReferenceSpec2
	: (
	DSNUTIL_SHRLEVEL 
	(DSNUTIL_REFERENCE
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_REFERENCE DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSShrlevelChangeSpec1
	: (
	DSNUTIL_SHRLEVEL 
	(DSNUTIL_CHANGE
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1))
	(dsnutilUCSDeadlineOption
	| dsnutilUCSReorgTablespaceDrainSpec
	| dsnutilUCSChangeSpec
	| dsnutilUCSMapSpec)*
	)
	;

/*
(DSNUTIL_SHRLEVEL DSNUTIL_CHANGE) option on its own added per
Martijn Rutte 2023-10-24.  This syntax is tolerated by DB2 13
but is not documented.
*/
dsnutilUCSShrlevelChangeSpec2
	: (
	(DSNUTIL_SHRLEVEL DSNUTIL_CHANGE DSNUTIL_REGISTER DSNUTIL_YES)
	| (DSNUTIL_SHRLEVEL (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1 DSNUTIL_REGISTER DSNUTIL_YES)
	| (DSNUTIL_SHRLEVEL DSNUTIL_CHANGE DSNUTIL_REGISTER (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_YES DSNUTIL_RPAREN1)
	| (DSNUTIL_SHRLEVEL (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1 DSNUTIL_REGISTER (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_YES DSNUTIL_RPAREN1)
	| ((DSNUTIL_SHRLEVEL DSNUTIL_CHANGE)? DSNUTIL_REGISTER DSNUTIL_NO)
	| ((DSNUTIL_SHRLEVEL (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1)? DSNUTIL_REGISTER DSNUTIL_NO)
	| ((DSNUTIL_SHRLEVEL DSNUTIL_CHANGE)? DSNUTIL_REGISTER (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NO DSNUTIL_RPAREN1)
	| ((DSNUTIL_SHRLEVEL (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1)? DSNUTIL_REGISTER (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NO DSNUTIL_RPAREN1)
	| (DSNUTIL_SHRLEVEL DSNUTIL_CHANGE)
	| (DSNUTIL_SHRLEVEL (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1)
	)
	;

/*
Moved  DSNUTIL_SKIP_LOCKED_DATA? from dsnutilUCSShrlevelChangeSpec3 
to dsnutilUCSIsolationCSOption for clarity per Martijn Rutte 2023-11-03.
*/
dsnutilUCSShrlevelChangeSpec3
	: (
	DSNUTIL_SHRLEVEL 
	(DSNUTIL_CHANGE
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1))
	((dsnutilUCSIsolationCSOption)
	| (dsnutilUCSIsolationUROption dsnutilUCSRegisterOption))
	)
	;

dsnutilUCSIsolationCSOption
	: (
	DSNUTIL_ISOLATION 
	(DSNUTIL_CS
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CS DSNUTIL_RPAREN1))
	DSNUTIL_SKIP_LOCKED_DATA?
	)
	;

dsnutilUCSIsolationUROption
	: (
	DSNUTIL_ISOLATION 
	(DSNUTIL_UR
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_UR DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSRegisterOption
	: (
	DSNUTIL_REGISTER dsnutilUCSYesOrNo
	)
	;

dsnutilUCSReorgTablespaceDrainSpec
	: (
	dsnutilUCSDrainWaitOption
	| dsnutilUCSRetryOption
	| dsnutilUCSRetryDelayOption
	| dsnutilUCSTimeoutOption
	| dsnutilUCSLograngesOption
	| dsnutilUCSDrainAllpartsOption
	| dsnutilUCSSwitchtimeOption
	)
	;

dsnutilUCSDrainAllpartsOption
	: (
	DSNUTIL_DRAIN_ALLPARTS dsnutilUCSYesOrNo
	)
	;

dsnutilUCSMapSpec
	: (
	(DSNUTIL_MAPPINGTABLE 
		(dsnutilUCSQualifiedTableName 
		| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSQualifiedTableName DSNUTIL_RPAREN1)))
	| (DSNUTIL_MAPPINGDATABASE 
		(dsnutilUCSDatabaseName
		| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSDatabaseName DSNUTIL_RPAREN1)))
	)
	;

/*
DB2 13 documentation indicates this is deprecated.
*/
dsnutilUCSOffposlimitSpec
	: (
	(DSNUTIL_OFFPOSLIMIT dsnutilUCSArgOptionalParens?)
	//{notifyErrorListeners("OFFPOSLIMIT has been deprecated as of DB2 13");}
	| (DSNUTIL_INDREFLIMIT dsnutilUCSArgOptionalParens?)
	  //{notifyErrorListeners("INDEREFLIMIT has been deprecated as of DB2 13");}
	| DSNUTIL_REPORTONLY
	  //{notifyErrorListeners("REPORTONLY has been deprecated as of DB2 13");}
	)
	;

dsnutilUCSUnloadExternalSpec
	: (
	DSNUTIL_UNLOAD 
	(DSNUTIL_EXTERNAL
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_EXTERNAL DSNUTIL_RPAREN1))
	(dsnutilUCSNopadOption1 | dsnutilUCSFromTableSpec1)*
	)
	;

dsnutilUCSSortSpec
	: (
	dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	)
	;

dsnutilUCSDiscardSpec
	: (
	DSNUTIL_DISCARD
	(dsnutilUCSNopadOption1
	| dsnutilUCSFromTableSpec1)*
	)
	;

dsnutilUCSFromTableSpec1
	: (
	DSNUTIL_FROM_TABLE
	dsnutilUCSQualifiedTableName
	dsnutilUCSWhenCondition?
	)
	;

dsnutilUCSWhenCondition
	: (
	DSNUTIL_WHEN 
	DSNUTIL_WHEN_LPAREN 
	NOT? predicate 
	((AND | OR) NOT? LPAREN* predicate RPAREN*)* 
	RPAREN
	)
	;

dsnutilUCSFromTableSpec2
	: (
	DSNUTIL_FROM_TABLE
	dsnutilUCSQualifiedTableName
	dsnutilUCSFromTableSpec2Options*
	dsnutilUCSWhenCondition?
	)
	;

dsnutilUCSFromTableSpec2Options
	: (
	dsnutilUCSSampleOption
	| dsnutilUCSTableSpec2LimitOption
	| dsnutilUCSHeaderOption
	| dsnutilUCSUnloadFieldListOption
	)
	;

dsnutilUCSTableSpec2LimitOption
	: (
	DSNUTIL_LIMIT dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSHeaderOption
	: (
	DSNUTIL_HEADER
	(DSNUTIL_OBID
	| DSNUTIL_NONE
	| (DSNUTIL_CONST dsnutilUCSArgOptionalParens))
	)
	;

dsnutilUCSNopadOption1
	: (
	DSNUTIL_NOPAD dsnutilUCSYesOrNo
	)
	;

dsnutilUCSNopadOption2
	: (
	DSNUTIL_NOPAD
	)
	;

dsnutilUCSInitcddsSpec
	: (
	DSNUTIL_INITCDDS
	(DSNUTIL_NO
	| (DSNUTIL_YES dsnutilUCSSearchtimeOption?))
	)
	;

dsnutilUCSSearchtimeOption
	: (
	DSNUTIL_SEARCHTIME DSNUTIL_LPAREN
	(DSNUTIL_NONE
	| dsnutilUCSTimestamp
	| dsnutilUCSLabeledDurationExpression)
	DSNUTIL_RPAREN1
	)
	;

dsnutilUCSTimestamp
	: (
	((DSNUTIL_IDENTIFIER | DSNUTIL_MINUS)+
	| (DSNUTIL_PAREN_NUMBER | DSNUTIL_PAREN_IDENTIFIER | DSNUTIL_PAREN_DOT | DSNUTIL_MINUS)+)
	)
	;

dsnutilUCSFieldName
	: dsnutilUCSArg
	;

dsnutilUCSListName
	: dsnutilUCSArg
	;

dsnutilUCSListNameWithLit
	: (DSNUTIL_LIST dsnutilUCSListName)
	;

dsnutilUCSVolSer
	: dsnutilUCSArg
	;

dsnutilUCSVolSeqNo
	: dsnutilUCSArg
	;

dsnutilUCSRepair
	: (
	DSNUTIL_REPAIR DSNUTIL_OBJECT? (DSNUTIL_LOG dsnutilUCSYesOrNo)?
	dsnutilUCSRepairOptions+
	dsnutilUCSCloneOption?
	)
	;

dsnutilUCSRepairOptions
	: (
	dsnutilUCSLocateBlock
	| 	dsnutilUCSRepairSetStatement
	| 	dsnutilUCSDbdStatement
	| 	dsnutilUCSLevelidStatement
	| 	dsnutilUCSCatalogStatement
	| 	dsnutilUCSSystempagesStatement
	| 	dsnutilUCSWritelogStatement
	)
	;

dsnutilUCSLocateBlock
	: (
	DSNUTIL_LOCATE
	(((dsnutilUCSLocateTablespaceSpec | dsnutilUCSLocateIndexSpec) dsnutilUCSLocateOptions+ (DSNUTIL_SHRLEVEL DSNUTIL_CHANGE)?)
	| dsnutilUCSLobTablespaceSpec
	| dsnutilUCSXmlTablespaceSpec)
	)
	;

dsnutilUCSLocateOptions
	: (
	dsnutilUCSVerifyStatement
	| dsnutilUCSReplaceStatement
	| dsnutilUCSRepairDeleteStatement
	| dsnutilUCSDumpStatement
	)
	;


//TODO add RID and PAGE options from DB2 13 FL100 locate-table-space-spec
dsnutilUCSLocateTablespaceSpec
	: (
	dsnutilUCSQualifiedTablespaceNameWithLit
	(dsnutilUCSLocateTablespaceSpecPageOption
	| dsnutilUCSLocateTablespaceSpecKeyOption
	| dsnutilUCSLocateTablespaceSpecRidOption
	| dsnutilUCSLocateTablespaceSpecPartOption)
	)
	;

dsnutilUCSLocateTablespaceSpecKeyOption
	: (
	DSNUTIL_KEY dsnutilUCSArgOptionalParens dsnutilUCSQualifiedIndexNameWithLit
	)
	;

dsnutilUCSLocateTablespaceSpecRidOption
	: (
	DSNUTIL_RID 
	(DSNUTIL_HEX_LIT
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_HEX_LIT DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSLocateTablespaceSpecPageOption
	: (
	DSNUTIL_PAGE 
	(DSNUTIL_HEX_LIT
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_HEX_LIT DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSLocateTablespaceSpecPartOption
	: (
	dsnutilUCSPartOption2? dsnutilUCSPageOption
	)
	;

dsnutilUCSPageOption
	: (
	DSNUTIL_PAGE dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSLocateIndexSpec
	: (
	(dsnutilUCSQualifiedIndexNameWithLit
	| dsnutilUCSQualifiedIndexspaceNameWithLit)
	dsnutilUCSPartOption2?
	dsnutilUCSPageOption
	)
	;

dsnutilUCSLobTablespaceSpec
	: (
	DSNUTIL_TABLESPACE
	dsnutilUCSQualifiedXmlTablespacename
	dsnutilUCSRowidOption
	dsnutilUCSVersionOption
	(dsnutilUCSRepairDeleteStatement | dsnutilUCSDumpStatement)
	)
	;

dsnutilUCSRowidOption
	: (
	DSNUTIL_ROWID dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSVersionOption
	: (
	DSNUTIL_VERSION dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSXmlTablespaceSpec
	: (
	DSNUTIL_TABLESPACE
	dsnutilUCSQualifiedXmlTablespacename
	dsnutilUCSDocidOption
	dsnutilUCSRepairDeleteStatement
	)
	;

dsnutilUCSDocidOption
	: (
	DSNUTIL_DOCID dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSVerifyStatement
	: (
	DSNUTIL_VERIFY
	dsnutilUCSRepairOffsetOption? dsnutilUCSRepairDataOption+
	)
	;

dsnutilUCSReplaceStatement
	: (
	DSNUTIL_REPLACE
	(DSNUTIL_RESET
	| (dsnutilUCSRepairOffsetOption | dsnutilUCSRepairDataOption)+)
	)
	;

dsnutilUCSRepairDataOption
	: (
	DSNUTIL_DATA dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSRepairDeleteStatement
	: (
	DSNUTIL_DELETE 
	(DSNUTIL_DATAONLY
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_DATAONLY DSNUTIL_RPAREN1))?
	)
	;

dsnutilUCSDumpStatement
	: (
	DSNUTIL_DUMP
	dsnutilUCSDumpStatementOptions+
	)
	;

dsnutilUCSDumpStatementOptions
	: (
	dsnutilUCSRepairOffsetOption
	| dsnutilUCSDumpLengthOption
	| dsnutilUCSDumpPagesOption
	| dsnutilUCSDumpMapOption
	| dsnutilUCSDumpDataOption
	)
	;

dsnutilUCSRepairOffsetOption
	: (
	DSNUTIL_OFFSET dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSDumpLengthOption
	: (
	DSNUTIL_LENGTH dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSDumpPagesOption
	: (
	DSNUTIL_PAGES dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSDumpMapOption
	: (
	DSNUTIL_MAP dsnutilUCSArgOptionalParens?
	)
	;

dsnutilUCSDumpDataOption
	: (
	DSNUTIL_DATA dsnutilUCSArgOptionalParens?
	)
	;

dsnutilUCSRepairSetStatement
	: (
	DSNUTIL_SET
	(dsnutilUCSRepairSetTablespace
	| dsnutilUCSRepairSetIndex
	| dsnutilUCSRepairSetIndexspace)
	)
	;

dsnutilUCSRepairSetTablespace
	: (
	dsnutilUCSQualifiedTablespaceNameWithLit
	dsnutilUCSPartOption2?
	dsnutilUCSRepairSetTablespaceOptions?
	)
	;

dsnutilUCSRepairSetIndex
	: (
	DSNUTIL_INDEX 
	((DSNUTIL_DB_TS_LPAREN dsnutilUCSQualifiedIndexName dsnutilUCSPartOption2? DSNUTIL_RPAREN1)
	| (dsnutilUCSAllInParens dsnutilUCSQualifiedTablespaceNameWithLit))
	dsnutilUCSRepairSetIndexOptions?
	)
	;

dsnutilUCSRepairSetIndexspace
	: (
	DSNUTIL_INDEXSPACE 
	((DSNUTIL_DB_TS_LPAREN dsnutilUCSQualifiedIndexspaceName dsnutilUCSPartOption2? DSNUTIL_RPAREN1)
	| (dsnutilUCSAllInParens dsnutilUCSQualifiedTablespaceNameWithLit))
	dsnutilUCSRepairSetIndexOptions?
	)
	;

dsnutilUCSRepairSetTablespaceOptions
	: (
	DSNUTIL_NOCOPYPEND
	| DSNUTIL_NORCVRPEND
	| DSNUTIL_NOCHECKPEND
	| DSNUTIL_NOAUXWARN
	| DSNUTIL_NOAUXCHKP
	| DSNUTIL_NOAREORPENDSTAR
	| DSNUTIL_NOAREORPEND
	| DSNUTIL_PRO
	| DSNUTIL_NOPRO
	)
	;

dsnutilUCSRepairSetIndexOptions
	: (
	DSNUTIL_NOCOPYPEND
	| DSNUTIL_NORCVRPEND
	| DSNUTIL_NORBDPEND
	| DSNUTIL_NOCHECKPEND
	| DSNUTIL_NOAREORPENDSTAR
	| DSNUTIL_NOAREORPEND
	| DSNUTIL_RBDPEND
	| DSNUTIL_PSRBDPEND
	)
	;

dsnutilUCSDbdStatement
	: (
	DSNUTIL_DBD
	((DSNUTIL_DROP DSNUTIL_DATABASE dsnutilUCSDatabaseName DSNUTIL_DBID dsnutilUCSArgOptionalParens)
	| ((DSNUTIL_TEST | DSNUTIL_DIAGNOSE | DSNUTIL_REBUILD) DSNUTIL_DATABASE dsnutilUCSDatabaseName (DSNUTIL_OUTDDN dsnutilUCSArgOptionalParens)?))
	)
	;

dsnutilUCSLevelidStatement
	: (
	DSNUTIL_LEVELID
	(dsnutilUCSQualifiedTablespaceNameWithLit
	| dsnutilUCSQualifiedIndexNameWithLit
	| dsnutilUCSQualifiedIndexspaceNameWithLit)
	dsnutilUCSPartOption2?
	)
	;

dsnutilUCSCatalogStatement
	: (
	DSNUTIL_CATALOG
	(dsnutilUCSQualifiedTablespaceNameWithLit
	| dsnutilUCSQualifiedIndexNameWithLit
	| dsnutilUCSQualifiedIndexspaceNameWithLit)
	DSNUTIL_TEST?
	)
	;

dsnutilUCSSystempagesStatement
	: (
	DSNUTIL_INSERTVERSIONPAGES
	DSNUTIL_SETCURRENTVERSION?
	dsnutilUCSQualifiedTablespaceNameWithLit
	((DSNUTIL_SHRLEVEL DSNUTIL_CHANGE)
	| (DSNUTIL_SHRLEVEL (DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_CHANGE DSNUTIL_RPAREN1))?
	)
	;

dsnutilUCSWritelogStatement
	: (
	DSNUTIL_WRITELOG
	dsnutilUCSQualifiedTablespaceNameWithLit
	dsnutilUCSWritelogStatementOptions+
	)
	;

dsnutilUCSWritelogStatementOptions
	: (
	dsnutilUCSPartOption2
	| dsnutilUCSWritelogTypeOption
	| dsnutilUCSWritelogSubtypeOption
	| dsnutilUCSWritelogTextOption
	)
	;

dsnutilUCSWritelogTypeOption
	: (
	DSNUTIL_TYPE dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSWritelogSubtypeOption
	: (
	DSNUTIL_SUBTYPE dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSWritelogTextOption
	: (
	DSNUTIL_TEXT dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSReport
	: (
	DSNUTIL_REPORT
	((DSNUTIL_RECOVERY (dsnutilUCSReportTablespaceListOption | dsnutilUCSReportIndexListOption) dsnutilUCSInfoOptionsSpec*)
	| dsnutilUCSReportTablespacesetOption)
	)
	;

dsnutilUCSReportIndexListOption
	: (
	dsnutilUCSReportIndexspaceListSpec
	| dsnutilUCSReportIndexListSpec
	)
	;

dsnutilUCSReportTablespaceListOption
	: (
	dsnutilUCSReportTablespaceListSpec (DSNUTIL_INDEX dsnutilUCSArgOptionalParens)?
	)
	;

dsnutilUCSReportTablespacesetOption
	: (
	DSNUTIL_TABLESPACESET dsnutilUCSQualifiedTablespaceNameWithLit
	(DSNUTIL_SHOWDSNS | DSNUTIL_SHOWKEYLABEL)*
	)
	;

dsnutilUCSReportTablespaceListSpec
	: (
	dsnutilUCSQualifiedTablespaceNameWithLit
	| (DSNUTIL_TABLESPACE_LIST dsnutilUCSListName)
	)
	;

dsnutilUCSReportIndexspaceListSpec
	: (
	dsnutilUCSQualifiedIndexspaceNameWithLit
	| (DSNUTIL_INDEXSPACE_LIST dsnutilUCSListName)
	)
	;

dsnutilUCSReportIndexListSpec
	: (
	dsnutilUCSQualifiedIndexNameWithLit
	| (DSNUTIL_INDEX_LIST dsnutilUCSListName)
	)
	;

dsnutilUCSInfoOptionsSpec
	: (
	dsnutilUCSDsnumOption
	| dsnutilUCSCurrentOption
	| dsnutilUCSSummaryOption
	| dsnutilUCSLocalsiteOption
	| dsnutilUCSRecoverysiteOption
	| dsnutilUCSArchlogOption
	)
	;

dsnutilUCSCurrentOption
	: (
	DSNUTIL_CURRENT
	)
	;

dsnutilUCSSummaryOption
	: (
	DSNUTIL_SUMMARY
	)
	;

dsnutilUCSLocalsiteOption
	: (
	DSNUTIL_LOCALSITE
	)
	;

dsnutilUCSRecoverysiteOption
	: (
	DSNUTIL_RECOVERYSITE
	)
	;

dsnutilUCSArchlogOption
	: (
	DSNUTIL_ARCHLOG dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSRestoreSystem
	: (
	DSNUTIL_RESTORE_SYSTEM
	(dsnutilUCSReportNonlogonlySpec*
	| dsnutilUCSReportLogonlySpec)
	)
	;

dsnutilUCSReportLogonlySpec
	: (
	DSNUTIL_LOGONLY
	dsnutilUCSSwitchVcatOption?
	)
	;

dsnutilUCSSwitchVcatOption
	: (
	DSNUTIL_SWITCH_VCAT
	(DSNUTIL_SYSVALUEDDN dsnutilUCSArgInParens)?
	)
	;

/*
This doesn't, strictly speaking, conform to the syntax diagram.  But
ANTLR has a problem (as do I) with coding something with no required
parameters.  So I code it this way, then make them all optional with
a * parameter where they're used.
*/
dsnutilUCSReportNonlogonlySpec
	: (
	dsnutilUCSAlternatecpOption 
	| dsnutilUCSRestorebeforeOption
	| dsnutilUCSReportFromdumpSpec 
	| dsnutilUCSFlashcopyPprcpOption
	)
	;

dsnutilUCSReportFromdumpSpec
	: (
	DSNUTIL_FROMDUMP
	dsnutilUCSReportFromdumpOptions*
	)
	;

dsnutilUCSReportFromdumpOptions
	: (
	dsnutilUCSReportFromdumpDumpclassOption
	| dsnutilUCSReportFromdumpRsaOption
	| dsnutilUCSReportFromdumpTapeunitsOption
	)
	;

dsnutilUCSReportFromdumpDumpclassOption
	: (
	DSNUTIL_DUMPCLASS dsnutilUCSArgInParens
	)
	;

dsnutilUCSReportFromdumpRsaOption
	: (
	DSNUTIL_RSA dsnutilUCSArgInParens
	)
	;

/*
Ignored since DB2 V1R12.  That's what the documentation says.
*/
dsnutilUCSReportFromdumpTapeunitsOption
	: (
	DSNUTIL_TAPEUNITS dsnutilUCSArgInParens?
	)
	;

dsnutilUCSRunstats
	: (
	DSNUTIL_RUNSTATS
	(dsnutilUCSRunstatsIndex
	| dsnutilUCSRunstatsTablespace)
	)
	;

dsnutilUCSRunstatsIndex
	: (
	((DSNUTIL_INDEX_LIST dsnutilUCSListName dsnutilUCSCorrelationStatsSpec*)
	| (DSNUTIL_INDEX dsnutilUCSRunstatsIndexListSpec)
	| (DSNUTIL_INDEX dsnutilUCSRunstatsIndexTablespaceSpec))
	dsnutilUCSRunstatsIndexOptions*
	)
	;

dsnutilUCSRunstatsIndexListSpec
	: (
	DSNUTIL_DB_TS_LPAREN
	dsnutilUCSRunstatsIndexAndSpecs
	(DSNUTIL_COMMA dsnutilUCSRunstatsIndexAndSpecs)*
	DSNUTIL_RPAREN1
	)
	;

dsnutilUCSRunstatsIndexAndSpecs
	: (
	dsnutilUCSQualifiedIndexName dsnutilUCSPartOption1? dsnutilUCSCorrelationStatsSpec*
	)
	;

dsnutilUCSRunstatsIndexTablespaceSpec
	: (
	dsnutilUCSAllInParens
	dsnutilUCSQualifiedTablespaceNameWithLit
	dsnutilUCSCorrelationStatsSpec*
	)
	;

dsnutilUCSRunstatsIndexOptions
	: (
	dsnutilUCSShrlevelChangeSpec2
	| dsnutilUCSShrlevelReferenceSpec2
	| dsnutilUCSReportOption
	| dsnutilUCSUpdateOption
	| dsnutilUCSSortdevtOption
	| dsnutilUCSSortnumOption
	| dsnutilUCSHistoryOption
	| dsnutilUCSForcerollupOption
	| dsnutilUCSInvalidatecacheOption
	)
	;

dsnutilUCSRunstatsTablespace
	: (
	((DSNUTIL_TABLESPACE_LIST dsnutilUCSListName)
	| (DSNUTIL_TABLESPACE dsnutilUCSRunstatsTablespaceSpec))
	dsnutilUCSInvalidatecacheOption?
	(dsnutilUCSRunstatsTablespaceStatisticsSpec*
	| dsnutilUCSRunstatsResetAccesspath)
	)
	;

dsnutilUCSRunstatsResetAccesspath
	: (
	DSNUTIL_RESET_ACCESSPATH
	(DSNUTIL_HISTORY DSNUTIL_ACCESSPATH)?
	)
	;

dsnutilUCSRunstatsTablespaceSpec
	: (
	dsnutilUCSQualifiedTablespaceName
	(dsnutilUCSPartOption1 dsnutilUCSForcerollupOption?)?
	)
	;
/*
Added dsnutilUCSInvalidatecacheOption per Martijn Rutte 2023-11-03.

This isn't currently documented, but DB2 tolerates it.
*/
dsnutilUCSRunstatsTablespaceStatisticsSpec
	: (
	dsnutilUCSRunstatsTableSpec
	| dsnutilUCSRunstatsTableListSpec
	| dsnutilUCSStatIndexSpec2
	| dsnutilUCSShrlevelChangeSpec2
	| dsnutilUCSShrlevelReferenceSpec2
	| dsnutilUCSStatclgmemsrtOption
	| dsnutilUCSSortdevtOption
	| dsnutilUCSHistoryOption
	| dsnutilUCSUpdateOption
	| dsnutilUCSReportOption
	| dsnutilUCSInvalidatecacheOption
	)
	;

dsnutilUCSRunstatsTableSpec
	: (
	DSNUTIL_TABLE dsnutilUCSAllInParens? dsnutilUCSAllTablesSpec*
	)
	;

dsnutilUCSRunstatsTableListSpec
	: (
	dsnutilUCSRunstatsTableAndSpecs
	(DSNUTIL_COMMA dsnutilUCSRunstatsTableAndSpecs)*
	)
	;

dsnutilUCSRunstatsTableAndSpecs
	: (
	DSNUTIL_TABLE 
	DSNUTIL_DB_TS_LPAREN dsnutilUCSQualifiedTableName DSNUTIL_RPAREN1 
	dsnutilUCSNamedTablesSpec*
	)
	;

dsnutilUCSAllTablesSpec
	: (
	dsnutilUCSDeleteProfileOption
	| dsnutilUCSSampleSpec2
	| dsnutilUCSUseProfileSpec
	)
	;

dsnutilUCSNamedTablesSpec
	: (
	dsnutilUCSDeleteProfileOption
	| dsnutilUCSSampleSpec2
	| dsnutilUCSUseProfileSpec
	| dsnutilUCSColumnSpec
	| dsnutilUCSColgroupSpec
	| dsnutilUCSSetProfileSpec
	)
	;

dsnutilUCSColumnSpec
	: (
	((DSNUTIL_COLUMN dsnutilUCSArgInParens)
	| (DSNUTIL_COLUMN DSNUTIL_LPAREN dsnutilUCSColumnList DSNUTIL_RPAREN1))
	dsnutilUCSSortnumOption?
	)
	;

dsnutilUCSDeleteProfileOption
	: (
	DSNUTIL_DELETE 
	(DSNUTIL_PROFILE
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_PROFILE DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSUseProfileSpec
	: (
	dsnutilUCSUseProfile dsnutilUCSIncludeNpi?
	)
	;

dsnutilUCSIncludeNpi
	: (
	DSNUTIL_INCLUDE 
	(DSNUTIL_NPI
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) DSNUTIL_NPI DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSSetProfileSpec
	: (
	(DSNUTIL_SET DSNUTIL_PROFILE DSNUTIL_FROM_EXISTING_STATS?)
	| (DSNUTIL_UPDATE DSNUTIL_PROFILE)
	)
	;

dsnutilUCSStospace
	: (
	DSNUTIL_STOSPACE DSNUTIL_STOGROUP
	(dsnutilUCSArgOptionalParens
	| dsnutilUCSArgList1)
	)
	;

/*
TODO this appears to be unused 2024-02-04.
*/
dsnutilUCSStogroupName
	: dsnutilUCSArg
	;

dsnutilUCSTemplate
	: (
	DSNUTIL_TEMPLATE dsnutilUCSTemplateName
	(dsnutilUCSDsnExpression
	| dsnutilUCSPathExpression)
	)
	;

dsnutilUCSDsnExpression
	: (
	 dsnutilUCSDsnOptions+
	)
	;

dsnutilUCSDsnOptions
	: (
	dsnutilUCSDsnWithLit
	| dsnutilUCSDsnCommonOptions 
	| dsnutilUCSDsnDiskOptions
	| dsnutilUCSDsnTapeOptions
	| dsnutilUCSDsnSubsysSpec
	)
	;

dsnutilUCSDsnWithLit
	: (
	DSNUTIL_DSN dsnutilUCSDsn
	)
	;

dsnutilUCSDsnCommonOptions
	: (
	dsnutilUCSDsnUnitOption
	| dsnutilUCSDsnModelDcbOption
	| dsnutilUCSDsnBufnoOption
	| dsnurtilUCSDsnDataclasOption
	| dsnutilUCSDsnMgmtclasOption
	| dsnutilUCSDsnStorclasOption
	| dsnutilUCSDsnRetpdOption
	| dsnutilUCSDsnVolumesOption
	| dsnutilUCSDsnVolcntOption
	| dsnutilUCSDsnUncntOption
	| dsnutilUCSDsnGdgLimitOption
	| dsnutilUCSDsnDispOption
	| dsnutilUCSDsnLimitOption
	| dsnutilUCSDsnTimeOption
	| dsnutilUCSDsnBlkszlimOption
	)
	;

dsnutilUCSDsnDiskOptions
	: (
	dsnutilUCSDsnSpaceOption
	| dsnutilUCSDsnPctprimeOption
	| dsnutilUCSDsnMaxprimeOption
	| dsnutilUCSDsnNbrsecndOption
	| dsnutilUCSDsnDirOption
	| dsnutilUCSDsnDsntypeOption
	| dsnutilUCSDsnEattrOption
	)
	;

dsnutilUCSDsnTapeOptions
	: (
	dsnutilUCSDsnStackOption
	| dsnutilUCSDsnTrtchOption
	)
	;

dsnutilUCSDsnSubsysSpec
	: (
	dsnutilUCSDsnSubsysOption
	dsnutilUCSDsnLreclOption
	dsnutilUCSDsnRecfmOption
	)
	;

dsnutilUCSPathExpression
	: (
	DSNUTIL_PATH dsnutilUCSPathName dsnutilUCSPathOptions*
	)
	;

dsnutilUCSPathOptions
	: (
	dsnutilUCSPathFiledataOption
	| dsnutilUCSDsnRecfmOption
	| dsnutilUCSDsnLreclOption
	| dsnutilUCSPathPathoptsOption
	| dsnutilUCSPathPathmodeOption
	| dsnutilUCSPathPathdispOption
	)
	;

dsnutilUCSDsnUnitOption
	: (DSNUTIL_UNIT ((DSNUTIL_EQUAL? dsnutilUCSArg) | dsnutilUCSArgInParens))
	;

dsnutilUCSDsnModelDcbOption
	: (DSNUTIL_MODELDCB dsnutilUCSDsn)
	;

dsnutilUCSDsnBufnoOption
	: (DSNUTIL_BUFNO dsnutilUCSArgOptionalParens)
	;

dsnurtilUCSDsnDataclasOption
	: (DSNUTIL_DATACLAS dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnMgmtclasOption
	: (DSNUTIL_MGMTCLAS dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnStorclasOption
	: (DSNUTIL_STORCLAS dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnRetpdOption
	: ((DSNUTIL_RETPD | DSNUTIL_EXPDL) dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnVolumesOption
	: (DSNUTIL_VOLUMES dsnutilUCSArgList1)
	;

dsnutilUCSDsnVolcntOption
	: (DSNUTIL_VOLCNT dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnUncntOption
	: (DSNUTIL_UNCNT dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnGdgLimitOption
	: (DSNUTIL_GDGLIMIT dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnDispOption
	: (DSNUTIL_DISP dsnutilUCSArgList1)
	;

dsnutilUCSDsnLimitOption
	: (DSNUTIL_LIMIT dsnutilUCSArgList3)
	;

dsnutilUCSDsnTimeOption
	: (DSNUTIL_TIME dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnBlkszlimOption
	: (
	DSNUTIL_BLKSZLIM 
	((dsnutilUCSArg DSNUTIL_BLKSZLIM_SUFFIX?)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (dsnutilUCSArg DSNUTIL_BLKSZLIM_SUFFIX?) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSDsnSpaceOption
	: (DSNUTIL_SPACE dsnutilUCSArgList1? dsnutilUCSArg)
	;

dsnutilUCSDsnPctprimeOption
	: (DSNUTIL_PCTPRIME dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnMaxprimeOption
	: (DSNUTIL_MAXPRIME dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnNbrsecndOption
	: (DSNUTIL_NBRSECND dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnDirOption
	: (DSNUTIL_DIR dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnDsntypeOption
	: (DSNUTIL_DSNTYPE (dsnutilUCSDsnDsntype | dsnutilUCSArgInParens))
	;

dsnutilUCSDsnDsntype
	: (DSNUTIL_LIBRARY
	| DSNUTIL_PDS
	| DSNUTIL_HFS
	| DSNUTIL_NULL
	| DSNUTIL_BASIC
	| DSNUTIL_LARGE
	| DSNUTIL_EXTREQ
	| DSNUTIL_EXTPREF)
	;

dsnutilUCSDsnEattrOption
	: DSNUTIL_EATTR
	;

dsnutilUCSDsnStackOption
	: (DSNUTIL_STACK dsnutilUCSYesOrNo)
	;

dsnutilUCSDsnTrtchOption
	: (
	DSNUTIL_TRTCH 
	(DSNUTIL_NONE | DSNUTIL_COMP | DSNUTIL_NOCOMP | dsnutilUCSArgInParens)
	)
	;

dsnutilUCSDsnSubsysOption
	: (DSNUTIL_SUBSYS dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnLreclOption
	: (DSNUTIL_LRECL dsnutilUCSArgOptionalParens)
	;

dsnutilUCSDsnRecfmOption
	: (DSNUTIL_RECFM dsnutilUCSArgOptionalParens)
	;

dsnutilUCSPathFiledataOption
	: (
	DSNUTIL_FILEDATA 
	((DSNUTIL_RECORD | DSNUTIL_TEXT | DSNUTIL_BINARY)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_RECORD | DSNUTIL_TEXT | DSNUTIL_BINARY) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSPathPathoptsOption
	: (DSNUTIL_PATHOPTS dsnutilUCSArgList1)
	;

dsnutilUCSPathPathmodeOption
	: (DSNUTIL_PATHMODE dsnutilUCSArgList1)
	;

dsnutilUCSPathPathdispOption
	: (DSNUTIL_PATHDISP dsnutilUCSArgList1)
	;

dsnutilUCSTemplateName
	: dsnutilUCSArg
	;

dsnutilUCSPathName
	: dsnutilUCSArg
	;

dsnutilUCSUnload
	: (
	((DSNUTIL_UNLOAD_DATA dsnutilUCSFromTableSpec2+)
	| (DSNUTIL_UNLOAD dsnutilUCSUnloadSourceSpec dsnutilUCSFromTableSpec2*)
	| (DSNUTIL_UNLOAD dsnutilUCSListNameWithLit))
	dsnutilUCSUnloadSpec*
	)
	;

dsnutilUCSUnloadSpec
	: (
	dsnutilUCSPunchddnOption
	| dsnutilUCSUnlddnOption
	| dsnutilUCSEAUOption
	| dsnutilUCSCCSIDOption
	| dsnutilUCSNosubsOption
	| dsnutilUCSNopadOption2
	| dsnutilUCSSpannedOption
	| dsnutilUCSFormatSpec
	| dsnutilUCSDelimitedOption
	| dsnutilUCSUnloadFloatOption
	| dsnutilUCSMaxerrOption
	| dsnutilUCSShrlevelChangeSpec3
	| dsnutilUCSShrlevelReferenceSpec2
	| dsnutilUCSDecfloatSpec
	| dsnutilUCSImplicitTZOption
	| dsnutilUCSParallelOption3
	| dsnutilUCSCloneOption
	)
	;

/*
Alternate syntax without FROM added per Martijn Rutte 2023-11-10.
*/
dsnutilUCSUnloadSourceSpec
	: (
	(DSNUTIL_FROM_TABLESPACE | DSNUTIL_TABLESPACE) dsnutilUCSQualifiedTablespaceName (DSNUTIL_PART dsnutilUCSArgOptionalParens)?
	(dsnutilUCSFromCopyDsnOption | dsnutilUCSFromCopyDdnOption)?
	)
	;

dsnutilUCSFromCopyDdnOption
	: (
	DSNUTIL_FROMCOPYDDN dsnutilUCSDdname
	)
	;

dsnutilUCSUnloadFloatOption
	: (
	DSNUTIL_FLOAT 
	((DSNUTIL_S390 | DSNUTIL_IEEE)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) (DSNUTIL_S390 | DSNUTIL_IEEE) DSNUTIL_RPAREN1))
	)
	;

dsnutilUCSMaxerrOption
	: (
	DSNUTIL_MAXERR dsnutilUCSArgOptionalParens
	)
	;

dsnutilUCSDdname
	: dsnutilUCSArg
	;

dsnutilUCSDatabaseObjectName
	: (
	DSNUTIL_DB_TS_IDENTIFIER
	| DSNUTIL_PAREN_IDENTIFIER
	| (DSNUTIL_DB_TS_APOS DSNUTIL_APOS_CHAR+ DSNUTIL_APOS)
	| (DSNUTIL_DB_TS_QUOTE DSNUTIL_QUOTE_CHAR+ DSNUTIL_QUOTE1)
	| (DSNUTIL_PAREN_OPEN_APOS DSNUTIL_APOS_CHAR+ DSNUTIL_APOS)
	| (DSNUTIL_PAREN_OPEN_QUOTE DSNUTIL_QUOTE_CHAR+ DSNUTIL_QUOTE1)
	)
	;

dsnutilUCSDatabaseName
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSTablespaceName
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSTableName
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSSchemaName
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSColumnName
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSCreatorID
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSIndexName
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSIndexspaceName
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSXmlTablespacename
	: dsnutilUCSDatabaseObjectName
	;

dsnutilUCSQualifiedTablespaceName
	: ((dsnutilUCSDatabaseName (DSNUTIL_DB_TS_DOT | DSNUTIL_PAREN_DOT))? dsnutilUCSTablespaceName)
	;

dsnutilUCSQualifiedTablespaceNameWithLit
	: (DSNUTIL_TABLESPACE dsnutilUCSQualifiedTablespaceName)
	;

dsnutilUCSQualifiedTableName
	: ((dsnutilUCSSchemaName (DSNUTIL_DB_TS_DOT | DSNUTIL_PAREN_DOT))? dsnutilUCSTableName)
	;

dsnutilUCSQualifiedTableNameWithLit
	: (DSNUTIL_TABLE dsnutilUCSQualifiedTableName)
	;

dsnutilUCSQualifiedIndexName
	: ((dsnutilUCSCreatorID (DSNUTIL_DB_TS_DOT | DSNUTIL_PAREN_DOT))? dsnutilUCSIndexName)
	;

dsnutilUCSQualifiedIndexNameWithLit
	: (DSNUTIL_INDEX dsnutilUCSQualifiedIndexName)
	;

dsnutilUCSQualifiedIndexspaceName
	: ((dsnutilUCSDatabaseName (DSNUTIL_DB_TS_DOT | DSNUTIL_PAREN_DOT))? dsnutilUCSIndexspaceName)
	;

dsnutilUCSQualifiedIndexspaceNameWithLit
	: (DSNUTIL_INDEXSPACE dsnutilUCSQualifiedIndexspaceName)
	;

dsnutilUCSQualifiedXmlTablespacename
	: ((dsnutilUCSDatabaseName (DSNUTIL_DB_TS_DOT | DSNUTIL_PAREN_DOT))? dsnutilUCSXmlTablespacename)
	;


dsnutilArgument3Text
	: (
	dsnutilUCSBackup
	| dsnutilUCSCatmaint
	| dsnutilUCSCheckData
	| dsnutilUCSCheckIndex
	| dsnutilUCSCheckLob
	| dsnutilUCSCopy
	| dsnutilUCSCopyToCopy
	| dsnutilUCSDiagnose
	| dsnutilUCSExecSql
	| dsnutilUCSListdef
	| dsnutilUCSLoad
	| dsnutilUCSMergecopy
	| dsnutilUCSModifyRecovery
	| dsnutilUCSModifyStatistics
	| dsnutilUCSOptions
	| dsnutilUCSQuiesce
	| dsnutilUCSRebuildIndex
	| dsnutilUCSRecover
	| dsnutilUCSReorgIndex
	| dsnutilUCSReorgTablespace
	| dsnutilUCSRepair
	| dsnutilUCSReport
	| dsnutilUCSRestoreSystem
	| dsnutilUCSRunstats
	| dsnutilUCSStospace
	| dsnutilUCSTemplate
	| dsnutilUCSUnload
	)
	;

/*
Keywords defined in the lexer that could also be arguments for
other keywords must be added here.  For example, someone might
use WORKDDN as the ddname for the WORKDDN keyword.  Or maybe
someone wants the list they define with LISTDEF to be named LIST.

Bear in mind that all these keywords come out of the "embedded"
lexer for the SYSPROC.DSNUTILx stored procedure's third parameter,
so "normal" DB2z SQL keywords need not be listed here.
*/
dsnutilUCSKeyword
	: (
	DSNUTIL_ABEND
	| DSNUTIL_ACCESSPATH
	| DSNUTIL_ALL
	| DSNUTIL_ALLDUMPS
	| DSNUTIL_ALTERNATE_CP
	| DSNUTIL_ARCHIVE
	| DSNUTIL_ARCHLOG
	| DSNUTIL_ASCII
	| DSNUTIL_AUTO
	| DSNUTIL_AUTOESTSPACE
	| DSNUTIL_AUX
	| DSNUTIL_AUXERROR
	| DSNUTIL_AUXONLY
	| DSNUTIL_AVAILABLE
	| DSNUTIL_BACKOUT
	| DSNUTIL_BACKUP
	| DSNUTIL_BASE
	| DSNUTIL_BASIC
	| DSNUTIL_BIGINT
	| DSNUTIL_BINARY
	| DSNUTIL_BINARYXML
	| DSNUTIL_BIT
	| DSNUTIL_BLKSZLIM
	| DSNUTIL_BLOB
	| DSNUTIL_BLOBF
	| DSNUTIL_BOTH
	| DSNUTIL_BRF
	| DSNUTIL_BUFNO
	| DSNUTIL_CATALOG
	| DSNUTIL_CATMAINT
	| DSNUTIL_CCSID
	| DSNUTIL_CHANGE
	| DSNUTIL_CHANGELIMIT
	| DSNUTIL_CHAR
	| DSNUTIL_CHARACTER
	| DSNUTIL_CHARDEL
	| DSNUTIL_CHECKPAGE
	| DSNUTIL_CLOB
	| DSNUTIL_CLOBF
	| DSNUTIL_CLONE
	| DSNUTIL_CLONED
	| DSNUTIL_COLDEL
	| DSNUTIL_COLGROUP
	| DSNUTIL_COLUMN
	| DSNUTIL_COMP
	| DSNUTIL_CONCURRENT
	| DSNUTIL_CONSISTENT
	| DSNUTIL_CONST
	| DSNUTIL_CONSTANT
	| DSNUTIL_CONSTANTIF
	| DSNUTIL_CONSTRAINTS
	| DSNUTIL_CONTINUE
	| DSNUTIL_CONTINUEIF
	| DSNUTIL_CONV_ERROR
	| DSNUTIL_COPY
	| DSNUTIL_COPYDDN
	| DSNUTIL_COPYDICTIONARY
	| DSNUTIL_COPYTOCOPY
	| DSNUTIL_COUNT
	| DSNUTIL_CS
	| DSNUTIL_CURRENT
	| DSNUTIL_CURRENTCOPYONLY
	| DSNUTIL_CURRENT_DATE
	| DSNUTIL_CURRENT_TIMESTAMP
	| DSNUTIL_DATA
	| DSNUTIL_DATABASE
	| DSNUTIL_DATACLAS
	| DSNUTIL_DATA_ONLY
	| DSNUTIL_DATAONLY
	| DSNUTIL_DATE
	| DSNUTIL_DATE_P
	| DSNUTIL_DAY
	| DSNUTIL_DAYS
	| DSNUTIL_DBBSG
	| DSNUTIL_DBCLOB
	| DSNUTIL_DBCLOBF
	| DSNUTIL_DBD
	| DSNUTIL_DBET
	| DSNUTIL_DBID
	| DSNUTIL_DEADLINE
	| DSNUTIL_DECFLOAT
	| DSNUTIL_DECFLOAT_ROUNDMODE
	| DSNUTIL_DECIMAL
	| DSNUTIL_DECPT
	| DSNUTIL_DEFAULTIF
	| DSNUTIL_DEFER
	| DSNUTIL_DEFINEAUX
	| DSNUTIL_DEFINED
	| DSNUTIL_DELAY
	| DSNUTIL_DELETE
	| DSNUTIL_DELIMITED
	| DSNUTIL_DIAGNOSE
	| DSNUTIL_DIR
	| DSNUTIL_DISCARD
	| DSNUTIL_DISCARDDN
	| DSNUTIL_DISCARDS
	| DSNUTIL_DISP
	| DSNUTIL_DISPLAY
	| DSNUTIL_DOCID
	| DSNUTIL_DOUBLE
	| DSNUTIL_DRAIN
	| DSNUTIL_DRAIN_ALLPARTS
	| DSNUTIL_DRAIN_WAIT
	| DSNUTIL_DROP
	| DSNUTIL_DROP_PART
	| DSNUTIL_DSN
	| DSNUTIL_DSNTYPE
	| DSNUTIL_DSNUM
	| DSNUTIL_DUMP
	| DSNUTIL_DUMPCLASS
	| DSNUTIL_DUMPONLY
	| DSNUTIL_EATTR
	| DSNUTIL_EBCDIC
	| DSNUTIL_END
	| DSNUTIL_ENFORCE
	| DSNUTIL_ERRDDN
	| DSNUTIL_ERROR
	| DSNUTIL_ESTABLISH
	| DSNUTIL_EVENT
	| DSNUTIL_EXCEPTION
	| DSNUTIL_EXCEPTIONS
	| DSNUTIL_EXCLUDE
	| DSNUTIL_EXPDL
	| DSNUTIL_EXTENDED
	| DSNUTIL_EXTERNAL
	| DSNUTIL_EXTPREF
	| DSNUTIL_EXTREQ
	| DSNUTIL_FASTSWITCH
	| DSNUTIL_FCCOPY
	| DSNUTIL_FCCOPYDDN
	| DSNUTIL_FCINCREMENTAL
	| DSNUTIL_FILEDATA
	| DSNUTIL_FILSZ
	| DSNUTIL_FILTERDDN
	| DSNUTIL_FLASHCOPY
	| DSNUTIL_FLASHCOPY_PPRCP
	| DSNUTIL_FLOAT
	| DSNUTIL_FOR
	| DSNUTIL_FORCE
	| DSNUTIL_FORCEROLLUP
	| DSNUTIL_FORMAT
	| DSNUTIL_FREQVAL
	| DSNUTIL_FROM
	| DSNUTIL_FROMCOPY
	| DSNUTIL_FROMCOPYDDN
	| DSNUTIL_FROMDUMP
	| DSNUTIL_FROMLASTCOPY
	| DSNUTIL_FROMLASTFLASHCOPY
	| DSNUTIL_FROMLASTFULLCOPY
	| DSNUTIL_FROMLASTINCRCOPY
	| DSNUTIL_FROMSEQNO
	| DSNUTIL_FROMVOLUME
	| DSNUTIL_FULL
	| DSNUTIL_GDGLIMIT
	| DSNUTIL_GRAPHIC
	| DSNUTIL_HALT
	| DSNUTIL_HEADER
	| DSNUTIL_HFS
	| DSNUTIL_HISTOGRAM
	| DSNUTIL_HISTORY
	| DSNUTIL_HOUR
	| DSNUTIL_HOURS
	| DSNUTIL_ICLIMIT_DASD
	| DSNUTIL_ICLIMIT_TAPE
	| DSNUTIL_IDENTITYOVERRIDE
	| DSNUTIL_IEEE
	| DSNUTIL_IGNORE
	| DSNUTIL_IGNOREFIELDS
	| DSNUTIL_IMPLICIT_TZ
	| DSNUTIL_INCLUDE
	| DSNUTIL_INCURSOR
	| DSNUTIL_INDDN
	| DSNUTIL_INDEX
	| DSNUTIL_INDEXDEFER
	| DSNUTIL_INDEXES
	| DSNUTIL_INDEXSPACE
	| DSNUTIL_INDEXSPACES
	| DSNUTIL_INDREFLIMIT
	| DSNUTIL_INITCDDS
	| DSNUTIL_INLCOPY
	| DSNUTIL_INSERTVERSIONPAGES
	| DSNUTIL_INSTANCE
	| DSNUTIL_INT
	| DSNUTIL_INTEGER
	| DSNUTIL_INTERNAL
	| DSNUTIL_INTO
	| DSNUTIL_INVALIDATE
	| DSNUTIL_INVALIDATECACHE
	| DSNUTIL_ISOLATION
	| DSNUTIL_ITEMERROR
	| DSNUTIL_KEEPDICTIONARY
	| DSNUTIL_KEEP_EMPTY_PAGES
	| DSNUTIL_KEY
	| DSNUTIL_KEYCARD
	| DSNUTIL_LARGE
	| DSNUTIL_LAST
	| DSNUTIL_LASTLOG
	| DSNUTIL_LEADING
	| DSNUTIL_LEAFDISTLIMIT
	| DSNUTIL_LEAST
	| DSNUTIL_LENGTH
	| DSNUTIL_LEVEL
	| DSNUTIL_LEVELID
	| DSNUTIL_LGBSG
	| DSNUTIL_LIBRARY
	| DSNUTIL_LIMIT
	| DSNUTIL_LIST
	| DSNUTIL_LISTDEF
	| DSNUTIL_LISTDEFDD
	| DSNUTIL_LISTPARTS
	| DSNUTIL_LOAD
	| DSNUTIL_LOB
	| DSNUTIL_LOBERROR
	| DSNUTIL_LOCALSITE
	| DSNUTIL_LOCATE
	| DSNUTIL_LOG
	| DSNUTIL_LOGLIMIT
	| DSNUTIL_LOGONLY
	| DSNUTIL_LOGRANGES
	| DSNUTIL_LONGLOG
	| DSNUTIL_LRECL
	| DSNUTIL_MAP
	| DSNUTIL_MAPDDN
	| DSNUTIL_MAPPINGDATABASE
	| DSNUTIL_MAPPINGTABLE
	| DSNUTIL_MAXERR
	| DSNUTIL_MAXPRIME
	| DSNUTIL_MAXRO
	| DSNUTIL_MEPL
	| DSNUTIL_MESSAGE
	| DSNUTIL_MGMTCLAS
	| DSNUTIL_MICROSECOND
	| DSNUTIL_MICROSECONDS
	| DSNUTIL_MINUS
	| DSNUTIL_MINUTE
	| DSNUTIL_MINUTES
	| DSNUTIL_MIXED
	| DSNUTIL_MODELDCB
	| DSNUTIL_MONTH
	| DSNUTIL_MONTHS
	| DSNUTIL_MOST
	| DSNUTIL_NBRSECND
	| DSNUTIL_NEWMAXRO
	| DSNUTIL_NO
	| DSNUTIL_NOAREORPEND
	| DSNUTIL_NOAREORPENDSTAR
	| DSNUTIL_NOAUXCHKP
	| DSNUTIL_NOAUXWARN
	| DSNUTIL_NOCHECKPAGE
	| DSNUTIL_NOCHECKPEND
	| DSNUTIL_NOCOMP
	| DSNUTIL_NOCOPYPEND
	| DSNUTIL_NODUMP
	| DSNUTIL_NODUMPS
	| DSNUTIL_NONE
	| DSNUTIL_NONUNIQUE
	| DSNUTIL_NOPAD
	| DSNUTIL_NOPRO
	| DSNUTIL_NORBDPEND
	| DSNUTIL_NORCVRPEND
	| DSNUTIL_NOSUBS
	| DSNUTIL_NOSYSCOPY
	| DSNUTIL_NOSYSREC
	| DSNUTIL_NOSYSUT1
	| DSNUTIL_NPI
	| DSNUTIL_NULL
	| DSNUTIL_NULLIF
	| DSNUTIL_NUMCOLS
	| DSNUTIL_NUMQUANTILES
	| DSNUTIL_NUMRECS
	| DSNUTIL_OBD
	| DSNUTIL_OBID
	| DSNUTIL_OBJECT
	| DSNUTIL_OFF
	| DSNUTIL_OFFPOSLIMIT
	| DSNUTIL_OFFSET
	| DSNUTIL_ONLY
	| DSNUTIL_OPTIONS
	| DSNUTIL_OUTDDN
	| DSNUTIL_OVERRIDE
	| DSNUTIL_PACKED
	| DSNUTIL_PAGE
	| DSNUTIL_PAGES
	| DSNUTIL_PARALLEL
	| DSNUTIL_PAREN_DOT
	| DSNUTIL_PART
	| DSNUTIL_PARTLEVEL
	| DSNUTIL_PATH
	| DSNUTIL_PATHDISP
	| DSNUTIL_PATHMODE
	| DSNUTIL_PATHOPTS
	| DSNUTIL_PAUSE
	| DSNUTIL_PCTPRIME
	| DSNUTIL_PDS
	| DSNUTIL_PENDING
	| DSNUTIL_PERIODOVERRIDE
	| DSNUTIL_PLUS
	| DSNUTIL_PMNO
	| DSNUTIL_PMPREF
	| DSNUTIL_PMREQ
	| DSNUTIL_POSITION
	| DSNUTIL_PREFORMAT
	| DSNUTIL_PRESERVE
	| DSNUTIL_PRESORT
	| DSNUTIL_PRESORTED
	| DSNUTIL_PREVIEW
	| DSNUTIL_PRO
	| DSNUTIL_PROFILE
	| DSNUTIL_PSRBDPEND
	| DSNUTIL_PUNCHDDN
	| DSNUTIL_QUIESCE
	| DSNUTIL_RANGE
	| DSNUTIL_RBALRSN_CONVERSION
	| DSNUTIL_RBDPEND
	| DSNUTIL_RBLP
	| DSNUTIL_RC0
	| DSNUTIL_RC4
	| DSNUTIL_RC8
	| DSNUTIL_READERS
	| DSNUTIL_REAL
	| DSNUTIL_REBALANCE
	| DSNUTIL_REBUILD
	| DSNUTIL_RECFM
	| DSNUTIL_RECLUSTER
	| DSNUTIL_RECORD
	| DSNUTIL_RECOVER
	| DSNUTIL_RECOVERYDDN
	| DSNUTIL_RECOVERYSITE
	| DSNUTIL_REFERENCE
	| DSNUTIL_REFONLY
	| DSNUTIL_REGISTER
	| DSNUTIL_REPAIR
	| DSNUTIL_REPEATABLE
	| DSNUTIL_REPLACE
	| DSNUTIL_REPLACE
	| DSNUTIL_REPORT
	| DSNUTIL_REPORTONLY
	| DSNUTIL_RESET
	| DSNUTIL_RESTOREBEFORE
	| DSNUTIL_RESUME
	| DSNUTIL_RETAIN
	| DSNUTIL_RETPD
	| DSNUTIL_RETRY
	| DSNUTIL_RETRY_DELAY
	| DSNUTIL_REUSE
	| DSNUTIL_RI
	| DSNUTIL_ROUND_CEILING
	| DSNUTIL_ROUND_DOWN
	| DSNUTIL_ROUND_FLOOR
	| DSNUTIL_ROUND_HALF_DOWN
	| DSNUTIL_ROUND_HALF_EVEN
	| DSNUTIL_ROUND_HALF_UP
	| DSNUTIL_ROUND_UP
	| DSNUTIL_ROWFORMAT
	| DSNUTIL_ROWID
	| DSNUTIL_RRF
	| DSNUTIL_RSA
	| DSNUTIL_RUNSTATS
	| DSNUTIL_SAMPLE
	| DSNUTIL_SCHEMA
	| DSNUTIL_SCOPE
	| DSNUTIL_SEARCHTIME
	| DSNUTIL_SECOND
	| DSNUTIL_SECONDS
	| DSNUTIL_SET
	| DSNUTIL_SETCURRENTVERSION
	| DSNUTIL_SHOWDSNS
	| DSNUTIL_SHOWKEYLABEL
	| DSNUTIL_SHRLEVEL
	| DSNUTIL_SKIP
	| DSNUTIL_SMALLINT
	| DSNUTIL_SORTCLUSTER
	| DSNUTIL_SORTDATA
	| DSNUTIL_SORTDEVT
	| DSNUTIL_SORTKEYS
	| DSNUTIL_SORTNPSI
	| DSNUTIL_SORTNUM
	| DSNUTIL_SPACE
	| DSNUTIL_SPANNED
	| DSNUTIL_SQLDS
	| DSNUTIL_STACK
	| DSNUTIL_STATCLGMEMSRT
	| DSNUTIL_STATISTICS
	| DSNUTIL_STOGROUP
	| DSNUTIL_STORCLAS
	| DSNUTIL_STOSPACE
	| DSNUTIL_STRIP
	| DSNUTIL_SUBSYS
	| DSNUTIL_SUBTYPE
	| DSNUTIL_SUMMARY
	| DSNUTIL_SWITCH
	| DSNUTIL_SWITCHTIME
	| DSNUTIL_SYSTEM
	| DSNUTIL_SYSTEMPAGES
	| DSNUTIL_SYSUTIL
	| DSNUTIL_SYSVALUEDDN
	| DSNUTIL_S390
	| DSNUTIL_TABLE
	| DSNUTIL_TABLES
	| DSNUTIL_TABLESAMPLE
	| DSNUTIL_TABLESPACE
	| DSNUTIL_TABLESPACES
	| DSNUTIL_TABLESPACESET
	| DSNUTIL_TAPEUNITS
	| DSNUTIL_TEMPLATE
	| DSNUTIL_TEMPLATEDD
	| DSNUTIL_TERM
	| DSNUTIL_TEST
	| DSNUTIL_TEXT
	| DSNUTIL_TIME
	| DSNUTIL_TIMEOUT
	| DSNUTIL_TIMESTAMP
	| DSNUTIL_TOCOPY
	| DSNUTIL_TOKEN
	| DSNUTIL_TOLASTCOPY
	| DSNUTIL_TOLASTFULLCOPY
	| DSNUTIL_TOLOGPOINT
	| DSNUTIL_TORBA
	| DSNUTIL_TOSEQNO
	| DSNUTIL_TOVOLUME
	| DSNUTIL_TRACEID
	| DSNUTIL_TRAILING
	| DSNUTIL_TRANSIDOVERRIDE
	| DSNUTIL_TRTCH
	| DSNUTIL_TRUNCATE
	| DSNUTIL_TYPE
	| DSNUTIL_UNCNT
	| DSNUTIL_UNICODE
	| DSNUTIL_UNIT
	| DSNUTIL_UNLDDN
	| DSNUTIL_UNLOAD
	| DSNUTIL_UPDATE
	| DSNUTIL_UPDATED
	| DSNUTIL_UPDMAXASSIGNEDVAL
	| DSNUTIL_UR
	| DSNUTIL_USE
	| DSNUTIL_UTILX
	| DSNUTIL_VARBINARY
	| DSNUTIL_VARCHAR
	| DSNUTIL_VARGRAPHIC
	| DSNUTIL_VARYING
	| DSNUTIL_VCAT
	| DSNUTIL_VERIFY
	| DSNUTIL_VERIFYSET
	| DSNUTIL_VERSION
	| DSNUTIL_VOLCNT
	| DSNUTIL_VOLUMES
	| DSNUTIL_WAIT
	| DSNUTIL_WARNING
	| DSNUTIL_WHEN
	| DSNUTIL_WHITESPACE
	| DSNUTIL_WORKDDN
	| DSNUTIL_WRITE
	| DSNUTIL_WRITELOG
	| DSNUTIL_WRITERS
	| DSNUTIL_XML
	| DSNUTIL_XMLERROR
	| DSNUTIL_XMLSCHEMA
	| DSNUTIL_XMLSCHEMAONLY
	| DSNUTIL_YEAR
	| DSNUTIL_YEARS
	| DSNUTIL_YES
	| DSNUTIL_ZONED
	)
	;

dsnutilUCSArg
	: (
	(
	DSNUTIL_PAREN_DOT
	| DSNUTIL_DOUBLE_APOS_CHAR
	| DSNUTIL_APOS_CHAR
	| DSNUTIL_QUOTE_CHAR)+
	| dsnutilUCSKeyword
	| DSNUTIL_HEX_LIT
	| DSNUTIL_IDENTIFIER
	| DSNUTIL_PAREN_IDENTIFIER
	| DSNUTIL_DB_TS_IDENTIFIER
	| DSNUTIL_DB_TS_HEX_LIT
	| DSNUTIL_PAREN_NUMBER
	| (DSNUTIL_PAREN_NUMBER DSNUTIL_PAREN_COLON DSNUTIL_PAREN_NUMBER)
	| (DSNUTIL_DB_TS_APOS DSNUTIL_APOS_CHAR* DSNUTIL_APOS)
	| (DSNUTIL_PAREN_OPEN_APOS DSNUTIL_APOS_CHAR* DSNUTIL_APOS)
	| (DSNUTIL_PAREN_OPEN_QUOTE DSNUTIL_QUOTE_CHAR* DSNUTIL_QUOTE1)
	| (DSNUTIL_PAREN_IDENTIFIER DSNUTIL_PAREN_OPEN_APOS DSNUTIL_APOS_CHAR+ DSNUTIL_APOS)
	)
	;

dsnutilUCSArgList1
	: ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSArg (DSNUTIL_COMMA dsnutilUCSArg)* DSNUTIL_RPAREN1)
	;

dsnutilUCSArgList2
	: (((DSNUTIL_LPAREN | DSNUTIL_LPAREN1) dsnutilUCSArg (DSNUTIL_COMMA dsnutilUCSArg)* DSNUTIL_RPAREN1)
	| ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1) DSNUTIL_COMMA dsnutilUCSArg DSNUTIL_RPAREN1))
	;

dsnutilUCSArgList3
	: ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1) dsnutilUCSArg dsnutilUCSArg? (DSNUTIL_COMMA dsnutilUCSArg)* DSNUTIL_RPAREN1)
	;

/*
Added DSNUTIL_DB_TS_LPAREN to make TEMPLATEDD argument in optional
parentheses work.  2023-10-20
*/
dsnutilUCSArgInParens
	: ((DSNUTIL_LPAREN | DSNUTIL_LPAREN1 | DSNUTIL_DB_TS_LPAREN) dsnutilUCSArg DSNUTIL_RPAREN1)
	;

dsnutilUCSArgOptionalParens
	: (dsnutilUCSArg | dsnutilUCSArgInParens)
	;

/*
Here ends the "embedded" parser just for SYSPROC.DSNUTILx's third parameter.
*/

callArgumentList
	: (callArgument (COMMA callArgument)*)
	;

closeStatement
	: (CLOSE cursorName)
	;

commentStatement
	: (
	COMMENT ON ((
	(aliasDesignator
	| (COLUMN tableName DOT columnName)
	| (functionDesignator ((ACTIVE VERSION) | (VERSION routineVersionID))?)
	| (INDEX indexName)
	| (PACKAGE packageDesignator)
	| (PLAN planName)
	| (PROCEDURE procedureName ((ACTIVE VERSION) | (VERSION routineVersionID))?)
	| (ROLE roleName)
	| (SEQUENCE sequenceName)
	| (TABLE tableName)
	| (TRIGGER triggerName ((ACTIVE VERSION) | (VERSION routineVersionID))?)
	| (TRUSTED CONTEXT contextName)
	| (TYPE typeName)
	| (MASK maskName)
	| (PERMISSION permissionName)
	| (VARIABLE variableName))
	IS NONNUMERICLITERAL)
	| multipleColumnList)
	)
	;

commitStatement
	: (COMMIT WORK?)
	;

connectStatement
	: (
	CONNECT (
	(TO (locationName | hostVariable) authorization?)
	| RESET
	| authorization)?
	)
	;

createAliasStatement
	: (
	CREATE PUBLIC? ALIAS (sequenceAlias | tableAlias)
	)
	;

createAuxiliaryTableStatement
	: (
	CREATE (AUX | AUXILIARY) TABLE auxTableName IN (databaseName DOT)? tablespaceName
	STORES tableName appendClause? COLUMN columnName PART INTEGERLITERAL
	)
	;

createDatabaseStatement
	: (
	CREATE DATABASE databaseName databaseOptionList*
	)
	;

createFunctionStatement
	: (
	createFunctionStatementExternalScalar
	| createFunctionStatementExternalTable
	| createFunctionStatementSourced
	| createFunctionStatementInlineSqlScalar
	| createFunctionStatementCompiledSqlScalar
	| createFunctionStatementSqlTable
	)
	;

createFunctionStatementExternalScalar
	: (
	CREATE FUNCTION functionName
	LPAREN (parameterDeclaration1 (COMMA parameterDeclaration1)*)? RPAREN
	createFunctionStatementExternalScalarReturnsPhrase
	createFunctionStatementExternalScalarOptions+
	)
	;

createFunctionStatementExternalScalarReturnsPhrase
	: (
	RETURNS 
		((functionDataType (AS LOCATOR)?)
		| (functionDataType CAST FROM functionDataType (AS LOCATOR)?))
	)
	;

createFunctionStatementExternalTable
	: (
	CREATE FUNCTION functionName
	LPAREN (parameterDeclaration1 (COMMA parameterDeclaration1)*)? RPAREN
	createFunctionStatementExternalTableReturnsPhrase
	createFunctionStatementExternalTableOptions+
	)
	;

createFunctionStatementExternalTableReturnsPhrase
	:(
	RETURNS 
		((TABLE LPAREN externalTableFunctionColumn (COMMA externalTableFunctionColumn)* RPAREN)
		| (GENERIC TABLE))
	)
	;

externalTableFunctionColumn
	: (
	columnName functionDataType (AS LOCATOR)?
	)
	;

createFunctionStatementSourced
	: (
	CREATE FUNCTION functionName
	LPAREN (parameterDeclaration1 (COMMA parameterDeclaration1)*)? RPAREN
	createFunctionStatementSourcedReturnsPhrase
	createFunctionStatementSourcedOptions*
	createFunctionStatementSourcedSourcePhrase
	)
	;

createFunctionStatementSourcedReturnsPhrase
	: (RETURNS functionDataType (AS LOCATOR)?)
	;

createFunctionStatementSourcedSourcePhrase
	: (
	SOURCE 
		((functionName LPAREN parameterDeclaration1 (COMMA parameterDeclaration1)* RPAREN)
		| specificNameOption2)
	)
	;

createFunctionStatementInlineSqlScalar
	: (
	CREATE FUNCTION functionName
	LPAREN ((parameterDeclaration1 (COMMA parameterDeclaration1)*)?) RPAREN
	((WRAPPED obfuscatedStatementText) | inlineSqlScalarFunctionDefinition)
	)
	;

createFunctionStatementCompiledSqlScalar
	: (
	CREATE FUNCTION functionName
	LPAREN ((parameterDeclaration2 (COMMA parameterDeclaration2)*)?) RPAREN
	((WRAPPED obfuscatedStatementText) | compiledSqlScalarFunctionDefinition)
	)
	;

createFunctionStatementSqlTable
	: (
	CREATE FUNCTION functionName
	LPAREN ((parameterDeclaration2 (COMMA parameterDeclaration2)*)?) RPAREN
	((WRAPPED obfuscatedStatementText) | sqlTableFunctionDefinition)
	)
	;

createGlobalTemporaryTableStatement
	: (
	CREATE GLOBAL TEMPORARY TABLE tableName
	((LPAREN createGlobalTemporaryTableColumnDefinition (COMMA createGlobalTemporaryTableColumnDefinition)* RPAREN)
	| (LIKE tableName))
	ccsidClause1?
	)
	;

/*
Added syntax for TYPE 1 and TYPE 2 indexes per Martijn
Rutte 2023-05-24.
*/
createIndexStatement
	: (
	CREATE (TYPE (INTEGERLITERAL))? (UNIQUE (WHERE NOT NULL)?)? INDEX indexName ON
		((tableName LPAREN 
		(columnName | keyExpression) (ASC | DESC | RANDOM)?
		(COMMA (columnName | keyExpression) (ASC | DESC | RANDOM)?)*
		(COMMA BUSINESS_TIME (WITH | WITHOUT) OVERLAPS)?
		RPAREN)
		| (auxTableName))
	createIndexOptionList*
	)
	/*{
		if ($TYPE.text != null) {
			notifyErrorListeners("TYPE has been deprecated as of DB2 8");
		}
	}*/
	;

createLobTablespaceStatement
	: (
	CREATE LOB TABLESPACE tablespaceName createLobTablespaceOptionList*
	)
	;

createMaskStatement
	: (
	CREATE MASK maskName ON tableName (AS? correlationName)?
	FOR COLUMN columnName RETURN caseExpression enableDisableOption?
	)
	;

createPermissionStatement
	: (
	CREATE PERMISSION permissionName ON tableName (AS? correlationName)?
	FOR ROWS WHERE searchCondition ENFORCED FOR ALL ACCESS enableDisableOption?
	)
	;

/*
Note that...

	((WRAPPED obfuscatedStatementText) | sqlRoutineBody)

...must be in that order.  Reversing the order makes WRAPPED 
match sqlRoutineBody because WRAPPED is a sqlKeyword.  This
is incorrect and misleading.
*/
createProcedureSQLPLStatement
	: (
	CREATE (OR REPLACE)? PROCEDURE procedureName
	(LPAREN (parameterDeclaration3 (COMMA parameterDeclaration3)*)? RPAREN)?
	versionOption?
	(procedureSQLPLOptionList* languageOption1? procedureSQLPLOptionList*)
	((WRAPPED obfuscatedStatementText) | sqlRoutineBody)
	)
	;

sqlRoutineBody
	: probablySQLPL+
	;

obfuscatedStatementText
	: (identifier | COLON | UNIDENTIFIED)+
	;

probablySQLPL
	: (sqlplProcedureStatement SEMICOLON*)
	;

createProcedureStatement
	: (
	CREATE (OR REPLACE)? PROCEDURE procedureName
	(LPAREN (parameterDeclaration3 (COMMA parameterDeclaration3)*)? RPAREN)?
	(createProcedureOptionList* languageOption5 createProcedureOptionList*)
	)
	;

createRoleStatement
	: (
	CREATE ROLE roleName
	)
	;

/*
Per Martijn Rutte, the createSequenceOptionList can optionally be
comma separated. 2023-05-23.
*/	
createSequenceStatement
	: (
	CREATE SEQUENCE sequenceName createSequenceOptionList (COMMA? createSequenceOptionList)*
	)
	;

createStogroupStatement
	: (
	CREATE STOGROUP stogroupName
	(VOLUMES 
		(LPAREN (volumeID | NONNUMERICLITERAL | SPLAT) 
		(COMMA (volumeID | NONNUMERICLITERAL | SPLAT))* 
		RPAREN))?
	VCAT catalogName
	dataclasOption?
	mgmtclasOption?
	storclasOption?
	keyLabelOption?
	)
	;

/*
Moved options to createTableOptions rule so they could
be in any order.  Suggested by Martijn Rutte 2023-01-10.
*/
createTableStatement
	: (
	CREATE TABLE tableName
		(
			(LPAREN
				(createTableColumnDefinition
				| periodDefinition
				| uniqueConstraint
				| referentialConstraint
				| checkConstraint)
				(COMMA
				(createTableColumnDefinition
				| periodDefinition
				| uniqueConstraint
				| referentialConstraint
				| checkConstraint))*
			RPAREN)
			| (LIKE tableName copyOptions?)
			| (asResultTable copyOptions?)
			| createTableMaterializedQueryDefinition
		)
	createTableOptions*
	)
	;

createTableOptions
	: (
	createTableInClause
	| partitioningClause
	| organizationClause
	| editprocClause
	| validprocClause
	| auditClause
	| obidClause
	| dataCaptureClause
	| restrictOnDropClause
	| ccsidClause1
	| cardinalityClause
	| loggedOption
	| compressOption
	| appendClause
	| dssizeOption
	| bufferpoolOption
	| memberClause
	| trackmodClause
	| pagenumClause
	| keyLabelOption
	)
	;

createTablespaceStatement
	: (
	CREATE TABLESPACE tablespaceName 
	createTablespaceOptionList* 
	)
	;

/*
The syntax accepts WRAPPED obfuscatedStatementText, but not
in a static SQL context so it is not supported here.
*/
createTriggerStatement
	: (
	CREATE TRIGGER triggerName triggerDefinition
	)
	;

createTriggerAdvancedStatement
	: (
	CREATE (OR REPLACE)? TRIGGER triggerName triggerAdvancedDefinition
	)
	;

createTrustedContextStatement
	: (
	CREATE TRUSTED CONTEXT contextName
	BASED UPON CONNECTION USING SYSTEM AUTHID authorizationName
	(trustedContextDefaultRoleClause
	| trustedContextEnableDisableClause
	| trustedContextDefaultSecurityLabelClause
	| trustedContextAttributesClause
	| trustedContextWithUseForClause)+
	)
	;

createTypeArrayStatement
	: (
	CREATE TYPE arrayTypeName AS createTypeArrayBuiltinType 
	ARRAY OPENSQBRACKET (INTEGERLITERAL | createTypeArrayBuiltinType2) CLOSESQBRACKET
	)
	;

createTypeDistinctStatement
	: (
	CREATE TYPE distinctTypeName AS sourceDataType (INLINE LENGTH INTEGERLITERAL)?
	)
	;

createVariableStatement
	: (
	CREATE VARIABLE variableName 
	(createVariableBuiltInType | arrayTypeName) 
	(DEFAULT (NULL | INTEGERLITERAL | NONNUMERICLITERAL | specialRegister))?
	)
	;

/*
The...

	(LPAREN columnName (COMMA columnName)* RPAREN)

...has been made optional, as it should be per the documentation.

Noted by Martijn Rutte 2023-01-10.

*/
createViewStatement
	: (
	CREATE VIEW viewName 
	(LPAREN columnName (COMMA columnName)* RPAREN)? AS
	(WITH commonTableExpression (COMMA commonTableExpression)*)?
	fullSelect
	createViewCheckOptionClause?
	)
	;

declareCursorStatement
	: (
	DECLARE cursorName
	((NO SCROLL) | ((ASENSITIVE | INSENSITIVE | (SENSITIVE (DYNAMIC | STATIC))) SCROLL))?
	CURSOR (holdability | returnability | rowsetPositioning)* FOR (selectStatement | statementName)
	)
	;

/*
copyOptionColumnDefaults added per Martijn Rutte 2023-10-24
*/
declareGlobalTemporaryTableStatement
	: (
	DECLARE GLOBAL TEMPORARY TABLE tableName
		((LPAREN declareGlobalTemporaryTableColumnDefinition 
			(COMMA declareGlobalTemporaryTableColumnDefinition)* RPAREN)
		| declareGlobalTemporaryTableLikeClause
		| declareGlobalTemporaryTableAsResultTable)
		(ccsidClause1
		| onCommitClause
		| copyOptionColumnDefaults
		| loggedWithRollbackClause)*
	)
	;

declareTableStatement
	: (
	DECLARE tableName TABLE LPAREN
	(columnName dataType notNullPhrase?)
	(COMMA columnName dataType notNullPhrase?)*
	RPAREN
	)
	;

declareStatementStatement
	: (DECLARE statementName (COMMA statementName)* STATEMENT)
	;

declareVariableStatement
	: (
	DECLARE hostVariable (COMMA hostVariable)* VARIABLE
	((ccsidClause1 forDataQualifier) | ccsidClause1 | forDataQualifier | ccsidClause2)?
	)
	;

deleteStatement
	: (searchedDelete | positionedDelete)
	;

describeStatement
	: (
	describeCursorStatement
	| describeInputStatement
	| describeOutputStatement
	| describeProcedureStatement
	| describeTableStatement
	)
	;

describeCursorStatement
	: (
	DESCRIBE CURSOR (cursorName | hostVariable) INTO descriptorName
	)
	;

describeInputStatement
	: (
	DESCRIBE INPUT statementName INTO descriptorName
	)
	;

describeOutputStatement
	: (
	DESCRIBE OUTPUT? statementName INTO descriptorName describeUsingOption?
	)
	;

describeProcedureStatement
	: (
	DESCRIBE PROCEDURE (procedureName | hostVariable) INTO descriptorName
	)
	;

describeTableStatement
	: (
	DESCRIBE TABLE hostVariable INTO descriptorName describeUsingOption?
	)
	;

dropStatement
	: (
	DROP
		(aliasDesignation
		| dropDatabaseClause
		| dropFunctionClause
		| dropIndexClause
		| dropMaskClause
		| dropPackageClause
		| dropPermissionClause
		| dropProcedureClause
		| dropRoleClause
		| dropSequenceClause
		| dropStogroupClause
		| dropSynonymClause
		| dropTableClause
		| dropTablespaceClause
		| dropTriggerClause
		| dropTrustedContextClause
		| dropTypeClause
		| dropVariableClause
		| dropViewClause)
	)
	;

endDeclareSectionStatement
	: (END DECLARE SECTION)
	;

exchangeStatement
	: (EXCHANGE DATA BETWEEN TABLE tableName AND tableName)
	;

/*
The USING part of an EXECUTE statement is optional, per Martijn Rutte.
*/
executeStatement
	: (
	EXECUTE statementName 
		((USING (variable | arrayElementSpecification) (COMMA (variable | arrayElementSpecification))*)
		| (USING DESCRIPTOR descriptorName)
		| sourceRowData)?
	)
	;

/*
This rule _almost_ covers the syntax.  The NONNUMERICLITERAL 
token corresponds to what the documentation refers to as 
string-expression, which "is any PL/I expression that yields 
a string."  I'm not going to implement a grammar for the 
entire PL/I language here.

*/
executeImmediateStatement
	: (EXECUTE IMMEDIATE (variable | NONNUMERICLITERAL))
	;

explainStatement
	: (
	EXPLAIN
		(explainPlanClause
		| explainStmtcacheClause
		| explainPackageClause
		| explainStabilizedDynamicQueryClause)
	)
	;

/*
The syntax diagram in the documentation lists fetchOrientation
as required.  It is optional here because one of its variants is 
optional.
*/
fetchStatement
	: (
	FETCH (INSENSITIVE | SENSITIVE)? (WITH CONTINUE)? 
	fetchOrientation? FROM? cursorName
	(singleRowFetch | multipleRowFetch)?
	)
	;

freeLocatorStatement
	: (FREE LOCATOR hostVariable (COMMA hostVariable)*)
	;

getDiagnosticsStatement
	: (
	GET (CURRENT | STACKED)? DIAGNOSTICS
	(statementInformation | conditionInformation | combinedInformation)
	)
	;

grantStatement
	: (
	grantCollectionStatement
	| grantDatabaseStatement
	| grantFunctionOrProcedureStatement	
	| grantPackageStatement
	| grantPlanStatement
	| grantSchemaStatement
	| grantSequenceStatement
	| grantSystemStatement
	| grantTableStatement
	| grantTypeOrJarStatement
	| grantVariableStatement
	| grantUseOfStatement
	)
	;

holdLocatorStatement
	: (HOLD LOCATOR hostVariable (COMMA hostVariable)*)
	;

includeStatement
	: (INCLUDE memberName)
	;

insertStatement
	: (
	INSERT INTO tableName (LPAREN columnName (COMMA columnName)* RPAREN)?
	includeColumns?
	(OVERRIDING USER VALUE)?
	((VALUES (valuesList1 |
		(LPAREN valuesList1 (COMMA valuesList1)* RPAREN)))
	| ((WITH commonTableExpression (COMMA commonTableExpression)*)?
		fullSelect isolationClause? querynoClause?)
	| multipleRowInsert)
	)
	;

labelStatement
	: (
	LABEL ON
	((((TABLE tableName)
	| (ALIAS aliasName)
	| (COLUMN tableName DOT columnName))
	IS NONNUMERICLITERAL)
	| (tableName LPAREN 
		columnName IS NONNUMERICLITERAL 
		(COMMA columnName IS NONNUMERICLITERAL)* 
		RPAREN))
	)
	;

lockTableStatement
	: (
	LOCK TABLE tableName ((PARTITION | PART) INTEGERLITERAL)? IN (SHARE | EXCLUSIVE) MODE_
	)
	;

mergeStatement
	: (
	MERGE INTO tableName correlationClause? includeColumns?
	USING ((LPAREN* tableReference RPAREN*) | sourceValues) ON searchCondition
	(WHEN matchingCondition THEN (modificationOperation | signalStatement))+ (ELSE IGNORE)?
	notAtomicPhrase?
	querynoClause?
	)
	;

openStatement
	: (
	OPEN cursorName 
	((USING variable (COMMA variable)*)
	| (USING DESCRIPTOR descriptorName))?
	)
	;

/*
This is incomplete, as the FROM string-expression phrase is
not implemented because it is specific to PL/I, string-expression
can be any valid PL/I string expression, and I'm not going to 
implement the entirety of the PL/I language here.
*/
prepareStatement
	: (
	PREPARE statementName 
	(INTO descriptorName (USING (NAMES | LABELS | ANY | BOTH))?)?
	(ATTRIBUTES hostVariable)? FROM variable
	)
	;

refreshTableStatement
	: (
	REFRESH TABLE tableName (QUERYNO INTEGERLITERAL)?
	)
	;

releaseConnectionStatement
	: (
	RELEASE (CURRENT | (ALL SQL?) | locationName | hostVariable)
	)
	;

releaseSavepointStatement
	: (RELEASE TO? SAVEPOINT savepointName)
	;

renameStatement
	: (
	RENAME ((TABLE? tableName TO tableName) | (INDEX indexName TO indexName))
	)
	;

revokeStatement
	: (
	revokeCollectionStatement
	| revokeDatabaseStatement
	| revokeFunctionOrProcedureStatement	
	| revokePackageStatement
	| revokePlanStatement
	| revokeSchemaStatement
	| revokeSequenceStatement
	| revokeSystemStatement
	| revokeTableStatement
	| revokeTypeOrJarStatement
	| revokeVariableStatement
	| revokeUseOfStatement
	)
	;

rollbackStatement
	: (ROLLBACK WORK? (TO SAVEPOINT savepointName?)?)
	;

savepointStatement
	: (
	SAVEPOINT savepointName UNIQUE?
	((ON ROLLBACK RETAIN CURSORS) | (ON ROLLBACK RETAIN LOCKS))+
	)
	;

setAssignmentStatement
	: (
	SET setAssignmentClause
	)
	;

setConnectionStatement
	: (SET CONNECTION (locationName | hostVariable))
	;

/*
The SET statement for this particular special register does not
conform to the pattern set by all the others.  There's always one.
*/
setEncryptionPasswordStatement
	: (
	SET ENCRYPTION_PASSWORD EQ? (NONNUMERICLITERAL | variable)
	(WITH HINT EQ? (NONNUMERICLITERAL | variable))?
	)
	;

/*
PATH is a token.  CURRENT PATH is a token.  Sometimes the former
is a synonym for the latter.  And sometimes not.
*/
setPathStatement
	: (SET (PATH | CURRENT_PATH) EQ? expression (COMMA? expression)*)
	;

/*
SCHEMA is a token.  CURRENT SCHEMA is a token, as is CURRENT_SCHEMA which
is considered equivalent.  Sometimes the former is a synonym for either of
the latter.  And sometimes not.
*/
setSchemaStatement
	: (SET (SCHEMA | CURRENT_SCHEMA) EQ? expression)
	;

/*
SESSIONTIMEZONE, SESSION TIME ZONE, SESSION TIMEZONE, TIME ZONE,
and TIMEZONE are all synonyms for each other in this context.
Changing the lexer rule for SESSION_TIME_ZONE to match all of
the above broke other things that expect TIME and ZONE to be
separate tokens.  So here we are.
*/
setSessionTimezoneStatement
	: (SET (SESSION_TIME_ZONE | (TIME ZONE) | TIMEZONE) EQ? (variable | NONNUMERICLITERAL))
	;

setSpecialRegisterStatement
	: (
	(SET specialRegister EQ? (expression | NULL) (COMMA? expression)*)
	| (SET CURRENT? LOCK (TIMEOUT | MODE_) (TO | EQ)? currentLockTimeoutOptions)
	)
	;

currentLockTimeoutOptions
	: (
	(NOT? WAIT)
	| NULL
	| (WAIT? INTEGERLITERAL)
	|  setAssignmentTargetVariable
	)
	;

signalStatement
	: (
	SIGNAL SQLSTATE VALUE? NONNUMERICLITERAL signalInformation?
	)
	;

transferOwnershipStatement
	: (
	TRANSFER OWNERSHIP OF ownedObject TO newOwner REVOKE PRIVILEGES
	)
	;

truncateStatement
	: (
	TRUNCATE TABLE? tableName ((DROP | REUSE) STORAGE)?
	((IGNORE | (RESTRICT WHEN)) DELETE TRIGGERS)?
	IMMEDIATE?
	)
	;

updateStatement
	: (searchedUpdate | positionedUpdate)
	;

valuesStatement
	: (
	VALUES (expression | (LPAREN expression (COMMA expression)* RPAREN))
	)
	;

valuesIntoStatement
	: (
	VALUES 
	(expression | NULL | (LPAREN (expression | NULL) (COMMA (expression | NULL))* RPAREN))
	INTO ((valuesIntoTargetVariable (COMMA valuesIntoTargetVariable)*) | arrayElementSpecification)
	)
	;

wheneverStatement
	: (
	WHENEVER ((NOT FOUND) | SQLERROR | SQLWARNING)
	(CONTINUE | ((GOTO | (GO TO)) COLON? hostLabel))
	)
	;

/*
These happen to be the same right now.  Taking advantage of that,
but insulating myself against future changes too.
*/
valuesIntoTargetVariable
	: (setAssignmentTargetVariable)
	;

ownedObject
	: (
	(DATABASE databaseName)
	| (INDEX indexName)
	| (STOGROUP stogroupName)
	| (TABLE tableName)
	| (TABLESPACE (databaseName DOT)? tablespaceName)
	| (VIEW viewName)
	)
	;

newOwner
	: (
	(ROLE roleName)
	| (USER authorizationName)
	| (SESSION_USER)
	)
	;

grantCollectionStatement
	: (
	GRANT (CREATE | PACKADM) (ON | IN) COLLECTION
	((collectionID (COMMA collectionID)*) | SPLAT) TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantDatabaseStatement
	: (
	GRANT grantDatabaseAuthority (COMMA grantDatabaseAuthority)*
	ON DATABASE databaseName (COMMA databaseName)* TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantFunctionOrProcedureStatement
	: (
	GRANT EXECUTE ON
		((FUNCTION functionSpecification (COMMA functionSpecification)*)
		| (FUNCTION SPLAT)
		| (SPECIFIC FUNCTION specificName (COMMA specificName)*)
		| (PROCEDURE ((procedureName (COMMA procedureName)*) | SPLAT)))
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantPackageStatement
	: (
	GRANT (ALL | (grantPackageAuthority (COMMA grantPackageAuthority)*))
	ON PACKAGE packageSpecification (COMMA packageSpecification)*
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantPlanStatement
	: (
	GRANT grantPlanAuthority (COMMA grantPlanAuthority)*
	ON PLAN planName (COMMA planName)*
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantSchemaStatement
	: (
	GRANT grantSchemaAuthority (COMMA grantSchemaAuthority)*
	ON SCHEMA (SPLAT | (schemaName (COMMA schemaName)*))
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantSequenceStatement
	: (
	GRANT grantSequenceAuthority (COMMA grantSequenceAuthority)*
	ON SEQUENCE sequenceName (COMMA sequenceName)*
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantSystemStatement
	: (
	GRANT grantSystemAuthority (COMMA grantSystemAuthority)*
	(ON SYSTEM)?
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;
/*
Corrected to allow comma separated list of tables per Michel A. G. Poppema 2023-05-23.
*/
grantTableStatement
	: (
	GRANT grantTableAuthority (COMMA grantTableAuthority)*
	ON TABLE? tableName (COMMA tableName)*
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantTypeOrJarStatement
	: (
	GRANT USAGE ON
	(((DATA | DISTINCT)? TYPE typeName (COMMA typeName)*)
	| (JAR jarName (COMMA jarName)*))
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantVariableStatement
	: (
	GRANT grantVariableAuthority (COMMA grantVariableAuthority)*
	ON VARIABLE variableName (COMMA variableName)*
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

grantUseOfStatement
	: (
	GRANT USE OF grantUseOfTarget
	TO
	grantee (COMMA grantee)*
	withGrantOption?
	)
	;

revokeCollectionStatement
	: (
	REVOKE (CREATE | PACKADM) (ON | IN) COLLECTION
	((collectionID (COMMA collectionID)*) | SPLAT) FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

revokeDatabaseStatement
	: (
	REVOKE grantDatabaseAuthority (COMMA grantDatabaseAuthority)*
	ON DATABASE databaseName (COMMA databaseName)* FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

revokeFunctionOrProcedureStatement
	: (
	REVOKE EXECUTE ON
		((FUNCTION functionSpecification (COMMA functionSpecification)*)
		| (FUNCTION SPLAT)
		| (SPECIFIC FUNCTION specificName (COMMA specificName)*)
		| (PROCEDURE ((procedureName (COMMA procedureName)*) | SPLAT)))
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	RESTRICT?
	)
	;

revokePackageStatement
	: (
	REVOKE (ALL | (grantPackageAuthority (COMMA grantPackageAuthority)*))
	ON PACKAGE packageSpecification (COMMA packageSpecification)*
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

revokePlanStatement
	: (
	REVOKE grantPlanAuthority (COMMA grantPlanAuthority)*
	ON PLAN planName (COMMA planName)*
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

revokeSchemaStatement
	: (
	REVOKE grantSchemaAuthority (COMMA grantSchemaAuthority)*
	ON SCHEMA (SPLAT | (schemaName (COMMA schemaName)*))
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

revokeSequenceStatement
	: (
	REVOKE grantSequenceAuthority (COMMA grantSequenceAuthority)*
	ON SEQUENCE sequenceName (COMMA sequenceName)*
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	RESTRICT?
	)
	;

revokeSystemStatement
	: (
	REVOKE grantSystemAuthority (COMMA grantSystemAuthority)*
	(ON SYSTEM)?
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

revokeTableStatement
	: (
	REVOKE grantTableAuthority (COMMA grantTableAuthority)*
	ON TABLE? tableName
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

revokeTypeOrJarStatement
	: (
	REVOKE USAGE ON
	(((DATA | DISTINCT)? TYPE typeName (COMMA typeName)*)
	| (JAR jarName (COMMA jarName)*))
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	RESTRICT?
	)
	;

/*
The syntax diagram in the documentation says the RESTRICT option 
comes before the revokeDependentPrivilegesOption in this
particular case.
*/
revokeVariableStatement
	: (
	REVOKE grantVariableAuthority (COMMA grantVariableAuthority)*
	ON VARIABLE variableName (COMMA variableName)*
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	RESTRICT?
	revokeDependentPrivilegesOption?
	)
	;

revokeUseOfStatement
	: (
	REVOKE USE OF grantUseOfTarget
	FROM
	grantee (COMMA grantee)*
	revokeByOption?
	revokeDependentPrivilegesOption?
	)
	;

/*
Changed from SQLIDENTIFIER COLON to identifier2 COLON to allow
SQL "reserved words" to be used as labels.
Noted by Martijn Rutte 2023-06-05.
*/
sqlplStartLabel
	: identifier2 COLON
	;

/*
Changed from SQLIDENTIFIER COLON to identifier2 COLON to allow
SQL "reserved words" to be used as labels.
Noted by Martijn Rutte 2023-06-05.
*/
sqlplEndLabel
	: identifier2
	;

sqlplAssignmentStatement
	: (sqlplStartLabel? setAssignmentStatement)
	;

sqlplCallStatement
	: (sqlplStartLabel? CALL procedureName sqlplCallArgumentList?)
	;

sqlplCaseStatement
	: (sqlplStartLabel? CASE 
	(sqlplCaseSimpleWhenClause | sqlplCaseSearchedWhenClause)
	sqlplCaseElseClause?
	END_CASE)
	;

sqlplCompoundStatement
	: (sqlplStartLabel? BEGIN sqlplCompoundAtomicClause?
	sqlplCompoundInitialDeclarations*
	sqlplStatementDeclaration*
	sqlplDeclareCursorStatement*
	sqlplHandlerDeclaration*
	(sqlplProcedureStatement SEMICOLON?)*
	END sqlplEndLabel? SEMICOLON?)
	;

sqlplForStatement
	: (sqlplStartLabel? FOR 
	(forLoopName AS)?
	(cursorName CURSOR holdability? FOR)?
	selectStatement DO (sqlplProcedureStatement SEMICOLON)+
	END_FOR sqlplEndLabel?)
	;

sqlplGotoStatement
	: (sqlplStartLabel? GOTO sqlplEndLabel SEMICOLON?)
	;

sqlplIfStatement
	: (sqlplStartLabel? IF searchCondition THEN
	(sqlplProcedureStatement SEMICOLON)+
	sqlplIfElseIfPhrase*
	sqlplIfElsePhrase?
	END_IF
	SEMICOLON?
	)
	;

sqlplIfElseIfPhrase
	: (ELSEIF searchCondition THEN (sqlplProcedureStatement SEMICOLON)+)
	;

sqlplIfElsePhrase
	: (ELSE (sqlplProcedureStatement SEMICOLON)+)
	;

sqlplIterateStatement
	: (sqlplStartLabel? ITERATE sqlplEndLabel SEMICOLON?)
	;

sqlplLeaveStatement
	: (sqlplStartLabel? LEAVE sqlplEndLabel SEMICOLON?)
	;

sqlplLoopStatement
	: (sqlplStartLabel? LOOP (sqlplProcedureStatement SEMICOLON)+
	END_LOOP sqlplEndLabel?
	SEMICOLON?
	)
	;

sqlplRepeatStatement
	: (sqlplStartLabel? REPEAT (sqlplProcedureStatement SEMICOLON)+
	UNTIL searchCondition
	END_REPEAT sqlplEndLabel?
	SEMICOLON?
	)
	;

sqlplResignalStatement
	: (sqlplStartLabel? RESIGNAL 
	sqlplResignalValue sqlplResignalInformation?
	SEMICOLON?
	)
	;

sqlplReturnStatement
	: (sqlplStartLabel? RETURN (expression | NULL | fullSelect)?
	SEMICOLON?
	)
	;

sqlplSignalStatement
	: (sqlplStartLabel? SIGNAL 
	sqlplSignalValue sqlplSignalInformation?
	SEMICOLON?
	)
	;

sqlplWhileStatement
	: (sqlplStartLabel? WHILE searchCondition DO
	(sqlplProcedureStatement SEMICOLON)+
	END_WHILE sqlplEndLabel?
	SEMICOLON?
	)
	;

forLoopName
	: identifier
	;

/*
The documentation says the second part of the conditional should read...

	(SQLSTATE VALUE? (literal | sqlVariableName | sqlParameterName))

...but the definition of sqlVariableName and sqlParameterName are such
that there is no way to distinguish between them in this context.
*/
sqlplSignalValue
	: (sqlConditionName | (SQLSTATE VALUE? (literal | sqlVariableName)))
	;

/*
MESSAGE_TEXT can be set to a literal or a sqlVariableName, the latter was
noted by Martijn Rutte 2023-06-05.
*/
sqlplSignalInformation
	: ((SET MESSAGE_TEXT EQ (literal | sqlVariableName)) | (LPAREN literal RPAREN))
	;

sqlplResignalValue
	: sqlplSignalValue
	;

sqlplResignalInformation
	: (SET MESSAGE_TEXT EQ literal)
	;

sqlplCompoundInitialDeclarations
	: ((sqlplVariableDeclaration SEMICOLON)
	| (sqlplConditionDeclaration SEMICOLON)
	| (sqlplReturnCodesDeclaration SEMICOLON))
	;

/*
Changed...

		| (dataType sqlplVariableDataTypeModifier?))

...to...

		| (procedureDataType sqlplVariableDataTypeModifier?))

...as Martijn Rutte noticed on 01-Feb-2024 that the syntactically
valid..

    DECLARE W_S_Q_L_I_D         CHAR(128) CCSID EBCDIC FOR SBCS DATA;
    DECLARE W_SQLTEXT   CHAR(100) CCSID EBCDIC FOR SBCS DATA DEFAULT '1' ;

...failed to parse.
*/
sqlplVariableDeclaration
	: (DECLARE sqlVariableName (COMMA sqlVariableName)*
		((RESULT_SET_LOCATOR VARYING)
		| (procedureDataType sqlplVariableDataTypeModifier?))
	)
	;

sqlplConditionDeclaration
	: (DECLARE sqlConditionName CONDITION FOR (SQLSTATE VALUE?)? literal)
	;

sqlplReturnCodesDeclaration
	: (DECLARE 
		((SQLSTATE ((CHAR | CHARACTER) LPAREN INTEGERLITERAL RPAREN DEFAULT literal))
		| (SQLCODE (INT | INTEGER) DEFAULT INTEGERLITERAL))
	)
	;

sqlplStatementDeclaration
	: (DECLARE statementName (COMMA statementName)* STATEMENT)
	;

sqlplDeclareCursorStatement
	: (declareCursorStatement SEMICOLON)
	;

sqlplHandlerDeclaration
	: (DECLARE (CONTINUE | EXIT) HANDLER FOR 
	(sqlplHandlerSpecificConditionList | sqlplHandlerGeneralConditionList) 
	sqlplProcedureStatement
	SEMICOLON?
	)
	;

sqlplHandlerSpecificConditionList
	: (sqlplHandlerSpecificCondition (COMMA sqlplHandlerSpecificCondition)*)
	;

sqlplHandlerSpecificCondition
	: ((SQLSTATE VALUE? literal) | sqlConditionName)
	;

sqlplHandlerGeneralConditionList
	: (sqlplHandlerGeneralCondition (COMMA sqlplHandlerGeneralCondition)*)
	;

sqlplHandlerGeneralCondition
	: (SQLEXCEPTION | SQLWARNING | (NOT FOUND))
	;

sqlplVariableDataTypeModifier
	: ((DEFAULT | CONSTANT) (NULL | literal))
	;
	
sqlplCompoundAtomicClause
	: (NOT? ATOMIC)
	;

sqlplCallArgumentList
	: (LPAREN sqlplCallArgument (COMMA sqlplCallArgument)* RPAREN)
	;

sqlplCallArgument
	: (sqlVariableName
		| sqlParameterName
		| expression
		| NULL
	)
	;

sqlplCaseSimpleWhenClause
	: (expression (WHEN expression THEN (sqlplProcedureStatement SEMICOLON)+)+)
	;

sqlplCaseSearchedWhenClause
	: ((WHEN searchCondition THEN (sqlplProcedureStatement SEMICOLON)+)+)
	;

sqlplCaseElseClause
	: (ELSE (sqlplProcedureStatement SEMICOLON)+)
	;

grantUseOfTarget
	: (
	(BUFFERPOOL bpName (COMMA bpName)*)
	| (ALL BUFFERPOOLS)
	| (STOGROUP stogroupName (COMMA stogroupName)*)
	| (TABLESPACE (databaseName DOT)? tablespaceName (COMMA (databaseName DOT)? tablespaceName)*)
	)
	;

grantVariableAuthority
	: (
	(ALL PRIVILEGES?)
	| READ
	| WRITE
	)
	;

grantTableAuthority
	: (
	(ALL PRIVILEGES?)
	| ALTER
	| DELETE
	| INDEX
	| INSERT
	| (REFERENCES (LPAREN columnName (COMMA columnName)* RPAREN)?)
	| SELECT
	| TRIGGER
	| UNLOAD
	| (UPDATE (LPAREN columnName (COMMA columnName)* RPAREN)?)
	)
	;

grantSystemAuthority
	: (
	ACCESSCTRL
	| ARCHIVE
	| BINDADD
	| BINDAGENT
	| BSDS
	| CREATEALIAS
	| CREATEDBA
	| CREATEDBC
	| CREATESG
	| CREATETMTAB
	| CREATE_SECURE_OBJECT
	| DATAACCESS
	| (DBADM ((WITH | WITHOUT) ACCESSCTRL)? ((WITH | WITHOUT) DATAACCESS)?)
	| DEBUGSESSION
	| DISPLAY
	| EXPLAIN
	| MONITOR1
	| MONITOR2
	| RECOVER
	| SQLADM
	| STOPALL
	| STOSPACE
	| SYSADM
	| SYSCTRL
	| SYSOPR
	| TRACE
	)
	;

grantSequenceAuthority
	: (
	ALTER
	| USAGE
	)
	;

grantSchemaAuthority
	: (
	ALTERIN
	| CREATEIN
	| DROPIN
	)
	;

grantPlanAuthority
	: (
	BIND
	| EXECUTE
	)
	;

grantPackageAuthority
	: (
	BIND
	| COPY
	| EXECUTE
	| RUN
	)
	;

/*
It turns out that if the collectionID is in quotes and the
packageName is in quotes that they and the DOT don't match
individually, but collectively they match as NONNUMERICLITERAL.
Discovered by Martijn Rutte 2023-06-12.
*/
packageSpecification
	: (
	(collectionID DOT (packageName | SPLAT)) | NONNUMERICLITERAL
	)
	;

functionSpecification
	: (
	functionName (LPAREN functionParameterType (COMMA functionParameterType)* RPAREN)?
	)
	;

grantee
	: (authorizationName | (ROLE roleName) | PUBLIC)
	;

withGrantOption
	: (WITH GRANT OPTION)
	;

revokeByOption
	: (
	BY 
		(ALL 
		| ((authorizationName | (ROLE roleName)) 
			(COMMA (authorizationName | (ROLE roleName)))*))
	)
	;

revokeDependentPrivilegesOption
	: (NOT? INCLUDING DEPENDENT PRIVILEGES)
	;

grantDatabaseAuthority
	: (
	DBADM
	| DBCTRL
	| DBMAINT
	| CREATETAB
	| CREATETS
	| DISPLAYDB
	| DROP
	| IMAGCOPY
	| LOAD
	| RECOVERDB
	| REORG
	| REPAIR
	| STARTDB
	| STATS
	| STOPDB
	)
	;

statementInformation
	: (
	(statementInformationVariableEquate (COMMA statementInformationVariableEquate)*)
	| (variable EQ DB2_GET_DIAGNOSTICS_DIAGNOSTICS)
	| (variable EQ DB2_SQL_NESTING_LEVEL)
	)
	;

statementInformationVariableEquate
	: (variable EQ statementInformationItemName)
	;

/*
	| DB2_GET_DIAGNOSTICS_DIAGNOSTICS
	| DB2_SQL_NESTING_LEVEL

are here because even though they aren't included in what the
documentation lists as statement-information-item-name, they
are included individually where those items are listed.

I suspect, from the syntax diagram, one can only list them 
alone, without other items.  Regardless, I'm including them
here for simplicity's sake.
*/

statementInformationItemName
	: (
	DB2_LAST_ROW
	| DB2_NUMBER_PARAMETER_MARKERS
	| DB2_NUMBER_RESULT_SETS
	| DB2_NUMBER_ROWS
	| DB2_RETURN_STATUS
	| DB2_SQL_ATTR_CURSOR_HOLD
	| DB2_SQL_ATTR_CURSOR_ROWSET
	| DB2_SQL_ATTR_CURSOR_SCROLLABLE
	| DB2_SQL_ATTR_CURSOR_SENSITIVITY
	| DB2_SQL_ATTR_CURSOR_TYPE
	| MORE_
	| NUMBER
	| ROW_COUNT
	| DB2_GET_DIAGNOSTICS_DIAGNOSTICS
	| DB2_SQL_NESTING_LEVEL
	)
	;

conditionInformation
	: (
	CONDITION (variable | INTEGERLITERAL) 
	conditionInformationVariableEquate (COMMA conditionInformationVariableEquate)*
	)
	;

conditionInformationVariableEquate
	: (variable EQ (conditionInformationItemName | connectionInformationItemName))
	;

conditionInformationItemName
	: (
	CATALOG_NAME
	| CONDITION_NUMBER
	| CURSOR_NAME
	| DB2_ERROR_CODE1
	| DB2_ERROR_CODE2
	| DB2_ERROR_CODE3
	| DB2_ERROR_CODE4
	| DB2_INTERNAL_ERROR_POINTER
	| DB2_LINE_NUMBER
	| DB2_MESSAGE_ID
	| DB2_MODULE_DETECTING_ERROR
	| DB2_ORDINAL_TOKEN_n
	| DB2_REASON_CODE
	| DB2_RETURNED_SQLCODE
	| DB2_ROW_NUMBER
	| DB2_SQLERRD_SET
	| DB2_SQLERRD1
	| DB2_SQLERRD2
	| DB2_SQLERRD3
	| DB2_SQLERRD4
	| DB2_SQLERRD5
	| DB2_SQLERRD6
	| DB2_TOKEN_COUNT
	| MESSAGE_TEXT
	| RETURNED_SQLSTATE
	| SERVER_NAME
	)
	;

connectionInformationItemName
	: (
	DB2_AUTHENTICATION_TYPE
	| DB2_AUTHORIZATION_ID
	| DB2_CONNECTION_STATE
	| DB2_CONNECTION_STATUS
	| DB2_ENCRYPTION_TYPE
	| DB2_SERVER_CLASS_NAME
	| DB2_PRODUCT_ID
	)
	;

combinedInformation
	: (
	variable EQ ALL
	combinedInformationOption (COMMA combinedInformationOption)*
	)
	;

combinedInformationOption
	: (
	STATEMENT
	| ((CONDITION | CONNECTION) (variable | INTEGERLITERAL)?)
	)
	;

fetchOrientation
	: (BEFORE | AFTER | rowPositioned | rowsetPositioned)
	;

rowPositioned
	: (
	NEXT
	| PRIOR
	| FIRST
	| LAST
	| (CURRENT CONTINUE?)
	| (ABSOLUTE (hostVariable | INTEGERLITERAL))
	| (RELATIVE (hostVariable | INTEGERLITERAL))
	)
	;

rowsetPositioned
	: (
	(NEXT ROWSET)
	| (PRIOR ROWSET)
	| (FIRST ROWSET)
	| (LAST ROWSET)
	| (CURRENT  ROWSET)
	| (ROWSET STARTING AT (ABSOLUTE | RELATIVE) (hostVariable | INTEGERLITERAL))
	)
	;

singleRowFetch
	: (
	(INTO ((fetchTargetVariable (COMMA fetchTargetVariable)*) | arrayElementSpecification))
	| ((INTO | USING) DESCRIPTOR descriptorName)
	)
	;
/*
The target variable in this clause could be any of {global-variable-name,
host-variable-name, SQL-parameter-name, SQL-variable-name, 
transition-variable-name} all of which conform to the variableName rule
save for host-variable-name; thus we confine the rule to just those two.
*/

fetchTargetVariable
	: (variable | hostVariable)
	;

/*
The syntax diagram in the documentation shows that both of these
clauses are optional.  In ANTLR terms, this means an error of the
form "rule can match the empty string."  So my interpretation is
to have a rule that allows one, the other, or both, and then the
entire rule is optional in the fetchStatement rule. 
*/
multipleRowFetch
	: (
	(multipleRowFetchForClause? multipleRowFetchIntoClause)
	| (multipleRowFetchForClause multipleRowFetchIntoClause?)
	| (multipleRowFetchForClause multipleRowFetchIntoClause)
	)
	;

multipleRowFetchForClause
	: (FOR (hostVariable | INTEGERLITERAL) ROWS)
	;

multipleRowFetchIntoClause
	: ((INTO hostVariable (COMMA hostVariable)*) | ((INTO | USING) DESCRIPTOR descriptorName))
	;

explainPlanClause
	: (
	(PLAN | ALL) (SET QUERYNO EQ INTEGERLITERAL)? FOR
	(query | insertStatement | mergeStatement | searchedDelete | searchedUpdate)
	)
	;

explainStmtcacheClause
	: (
	STMTCACHE
		(ALL
		| (STMTID (hostVariable | INTEGERLITERAL))
		| (STMTTOKEN (hostVariable | NONNUMERICLITERAL)))
	)
	;

explainPackageClause
	: (
	PACKAGE packageScopeSpecification
	)
	;

explainStabilizedDynamicQueryClause
	: (
	STABILIZED DYNAMIC QUERY STMTID
	(hostVariable | INTEGERLITERAL)
	(COPY NONNUMERICLITERAL)?
	)
	;

packageScopeSpecification
	: (
	COLLECTION collectionName
	PACKAGE packageScopePackageName
	(VERSION versionName)?
	(COPY NONNUMERICLITERAL)?
	)
	;

collectionName
	: (:hostVariable | NONNUMERICLITERAL)
	;

packageScopePackageName
	: (:hostVariable | NONNUMERICLITERAL)
	;

versionName
	: (:hostVariable | NONNUMERICLITERAL)
	;


/*
For purposes of this grammar there is no difference between a
host-variable and a host-variable-array.  The first option in
the sourceRowData rule allows either, but only for former is 
coded as its rule will also match the latter.
*/
sourceRowData
	: (
	((USING hostVariable (COMMA hostVariable)*)
	| (USING DESCRIPTOR descriptorName))
	(FOR (INTEGERLITERAL | hostVariable) ROWS)?
	)
	;

aliasDesignation
	: (PUBLIC? ALIAS aliasName (FOR (TABLE | SEQUENCE))?)
	;

dropDatabaseClause
	: (DATABASE databaseName)
	;

dropFunctionClause
	: (
		(FUNCTION functionName
			(LPAREN functionParameterType (COMMA functionParameterType)* RPAREN)?
			RESTRICT?)
		| (SPECIFIC FUNCTION specificName RESTRICT?)
	)
	;

dropIndexClause
	: (INDEX indexName)
	;

dropMaskClause
	: (MASK maskName)
	;

dropPackageClause
	: (PACKAGE packageDesignator)
	;

dropPermissionClause
	: (PERMISSION permissionName)
	;

dropProcedureClause
	: (PROCEDURE procedureName RESTRICT?)
	;

dropRoleClause
	: (ROLE roleName RESTRICT?)
	;

dropSequenceClause
	: (SEQUENCE sequenceName RESTRICT?)
	;

dropStogroupClause
	: (STOGROUP stogroupName)
	;

dropSynonymClause
	: (SYNONYM synonym)
	;

dropTableClause
	: (TABLE tableName)
	;

dropTablespaceClause
	: (TABLESPACE (databaseName DOT)? tablespaceName)
	;

/*
Added RESTRICT? per Martijn Rutte 2023-05-23.
*/
dropTriggerClause
	: (TRIGGER triggerName RESTRICT?)
	;

dropTrustedContextClause
	: (TRUSTED CONTEXT contextName)
	;

dropTypeClause
	: (TYPE typeName RESTRICT?)
	;

dropVariableClause
	: (VARIABLE variableName RESTRICT?)
	;

dropViewClause
	: (VIEW viewName)
	;

packageDesignator
	: (collectionID DOT packageName (VERSION? versionID)?)
	;

describeUsingOption
	: (USING (NAMES | LABELS | ANY | BOTH))
	;

declareGlobalTemporaryTableLikeClause
	: (LIKE tableName copyOptions?)
	;

onCommitClause
	: (ON COMMIT ((DELETE ROWS) | (PRESERVE ROWS) | (DROP TABLE)))
	;

loggedWithRollbackClause
	: (
	LOGGED
	| (NOT LOGGED (ON ROLLBACK (DELETE | PRESERVE) ROWS)?)
	)
	;

createViewCheckOptionClause
	: (WITH (CASCADED | LOCAL)? CHECK OPTION)
	;

trustedContextDefaultRoleClause
	: (
	(NO DEFAULT ROLE)
	| (DEFAULT ROLE roleName ((WITHOUT ROLE AS OBJECT OWNER) | (WITH ROLE AS OBJECT OWNER AND QUALIFIER))?)
	)
	;

trustedContextEnableDisableClause
	: (DISABLE | ENABLE)
	;

trustedContextDefaultSecurityLabelClause
	: ((NO DEFAULT SECURITY LABEL) | (DEFAULT SECURITY LABEL seclabelName))
	;

trustedContextAttributesClause
	: (
	ATTRIBUTES 
	LPAREN 
	((trustedContextAttribute1 (COMMA trustedContextAttribute1)*)
	| (trustedContextAttribute2 (COMMA trustedContextAttribute2)*))
	RPAREN
	)
	;

trustedContextWithUseForClause
	: (WITH USE FOR trustedContextUseFor (COMMA trustedContextUseFor)*)
	;

trustedContextAttribute1
	: (
	(ADDRESS addressValue)
	| (ENCRYPTION encryptionValue)
	| (SERVAUTH servauthValue)
	)
	;

trustedContextAttribute2
	: (
	(JOBNAME jobnameValue)
	)
	;

trustedContextUseFor
	: (
	(authorizationName userOptions*)
	| (EXTERNAL SECURITY PROFILE profileName userOptions*)
	| (PUBLIC (WITH | WITHOUT) AUTHENTICATION)
	)
	;

userOptions
	: (
	(ROLE roleName)
	| (SECURITY LABEL seclabelName)
	| ((WITH | WITHOUT) AUTHENTICATION)
	)
	;

triggerDefinition
	: (
	triggerActivationTime triggerEvent ON tableName
	triggerReferencingPhrase?
	triggerGranularity MODE_ DB2SQL triggerDefinitionOption? triggeredAction
	)
	;

triggerAdvancedDefinition
	: (
	versionOption?
	triggerAdvancedActivationTime triggerEvent ON tableName
	triggerAdvancedReferencingPhrase?
	triggerGranularity triggerAdvancedDefinitionOptionList* triggeredAdvancedAction
	)
	;

triggerReferencingPhrase
	: (REFERENCING
		((OLD | NEW | OLD_TABLE | NEW_TABLE | (OLD TABLE) | (NEW TABLE)) AS? correlationName)+)
	;
	
triggerAdvancedReferencingPhrase
	: (REFERENCING
		(((OLD ROW?) | (NEW ROW?) | OLD_TABLE | NEW_TABLE | (OLD TABLE) | (NEW TABLE)) AS? correlationName)+)
	;
	
triggerActivationTime
	: (
	(NO CASCADE BEFORE)
	| AFTER
	| (INSTEAD OF)
	)
	;

triggerAdvancedActivationTime
	: (
	((NO CASCADE)? BEFORE)
	| AFTER
	| (INSTEAD OF)
	)
	;

triggerEvent
	: (
	INSERT
	| DELETE
	| (UPDATE (OF columnName (COMMA columnName)*)?)
	)
	;

triggerGranularity
	: (
	(FOR EACH STATEMENT)
	| (FOR EACH ROW)
	)
	;

triggeredAction
	: (
	(WHEN LPAREN searchCondition RPAREN)? sqlTriggerBody
	)
	;

triggeredAdvancedAction
	: (
	(WHEN LPAREN searchCondition RPAREN)? sqlTriggerAdvancedBody
	)
	;

sqlTriggerBody
	: (
	triggeredSqlStatement
	| (BEGIN ATOMIC (triggeredSqlStatement SEMICOLON)+ END)
	)
	;

sqlTriggerAdvancedBody
	: (
	(triggeredAdvancedSqlStatement SEMICOLON)
	| sqlplControlStatement
	)
	;

triggeredSqlStatement
	: (
	callStatement
	| searchedDelete
	| ((commonTableExpression)? fullSelect)
	| insertStatement
	| mergeStatement
	| refreshTableStatement
	| setAssignmentStatement
	| signalStatement
	| truncateStatement
	| searchedUpdate
	| valuesStatement
	)
	;

triggeredAdvancedSqlStatement
	: (
	callStatement
	| searchedDelete
	| getDiagnosticsStatement
	| insertStatement
	| mergeStatement
	| refreshTableStatement
	| setAssignmentStatement
	| signalStatement
	| truncateStatement
	| searchedUpdate
	| valuesStatement
	)
	;

triggerDefinitionOption
	: (
	(NOT SECURED)
	| SECURED
	)
	;

triggerAdvancedDefinitionOptionList
	: (
	debugOption
	| schemaQualifierOption
	| asuTimeOption
	| wlmEnvironmentOption3
	| currentDataOption
	| concurrentAccessOption
	| dynamicRulesOption
	| applicationEncodingOption
	| explainOption
	| immediateWriteOption
	| isolationLevelOption
	| opthintOption
	| sqlPathOption
	| releaseAtOption
	| roundingOption
	| dateFormatOption
	| decimalOption
	| timeFormatOption
	| forUpdateOption
	| securedOption
	| businessTimeSensitiveOption
	| systemTimeSensitiveOption
	| archiveSensitiveOption
	| applcompatOption
	| concentrateStatementsOption
	)
	;

createTableInClause
	: (
	(customVolatileClause? IN (databaseName DOT)? tablespaceName customVolatileClause?)
	| (customVolatileClause? IN DATABASE databaseName customVolatileClause?)
	| (customVolatileClause? IN ACCELERATOR acceleratorName customVolatileClause?)
	)
	;

/*
Optional CARDINALITY added 2023-01-10.
*/
customVolatileClause
	: (NOT? VOLATILE CARDINALITY?)
	;

/*
Restructured per observation by Michel A. G. Poppema 2023-05-26.
Added columnDefinitionOptions as they can be in any order, previous
implementation enforced an order incorrectly.
*/
createTableColumnDefinition
	: (
	columnName dataType?
	columnDefinitionOptions*
	)
	;

/*
Added forDataQualifier as it can appear after NOT NULL and
still be syntactically valid, contrary to the syntax diagram.

Per Martijn Rutte 2023-06-05.
*/
columnDefinitionOptions
	: (
	(NOT NULL)
	| generatedClause
	| createTableColumnConstraint
	| defaultClause
	| fieldprocClause
	| asSecurityLabelClause
	| implicitlyHiddenClause
	| inlineLengthClause
	| forDataQualifier
	)
	;

editprocClause
	: (EDITPROC programName ((WITH | WITHOUT) ROW ATTRIBUTES)?)
	;

/*
NULL is only valid for ALTER TABLE.
*/
validprocClause
	: (VALIDPROC (programName | NULL))
	;

auditClause
	: (AUDIT (NONE | CHANGES | ALL))
	;

obidClause
	: (OBID INTEGERLITERAL)
	;

dataCaptureClause
	: (DATA CAPTURE (NONE | CHANGES))
	;

restrictOnDropClause
	: (WITH RESTRICT ON DROP)
	;

ccsidClause1
	: (CCSID (ASCII | EBCDIC | UNICODE)?)
	;

ccsidClause2
	: (CCSID INTEGERLITERAL)
	;

cardinalityClause
	: (NOT? VOLATILE CARDINALITY?)
	;

appendClause
	: (APPEND (YES | NO))
	;

memberClause
	: (MEMBER CLUSTER)
	;

trackmodClause
	: (TRACKMOD (YES | NO))
	;

pagenumClause
	: (PAGENUM (RELATIVE | ABSOLUTE))
	;

/*
Arguments to programName are options, noted when testing new
implementation of createTableColumnDefinition 2023-05-26.
*/
fieldprocClause
	: (FIELDPROC programName (LPAREN literal (COMMA literal)* RPAREN)?)
	;

asSecurityLabelClause
	: (AS SECURITY LABEL)
	;

implicitlyHiddenClause
	: (IMPLICITLY HIDDEN_)
	;

inlineLengthClause
	: (INLINE LENGTH INTEGERLITERAL)
	;

copyOptions
	: (
		(
		copyOptionIdentity
		| copyOptionRowChangeTimestamp
		| copyOptionColumnDefaults
		| copyOptionXmlTypeModifiers
		)+
	)
	;

copyOptionIdentity
	: ((EXCLUDING | INCLUDING) IDENTITY (COLUMN ATTRIBUTES)?)
	;

copyOptionRowChangeTimestamp
	: ((EXCLUDING | INCLUDING) ROW CHANGE TIMESTAMP (COLUMN ATTRIBUTES)?)
	;

copyOptionColumnDefaults
	: (
		((EXCLUDING | INCLUDING) COLUMN? DEFAULTS)
		| (USING TYPE DEFAULTS)
	)
	;

copyOptionXmlTypeModifiers
	: (EXCLUDING XML TYPE MODIFIERS)
	;

/*
Corrected to make the list of columns in parentheses optional.
Noted by Martijn Rutte 2023-05-23.
*/
asResultTable
	: (
	(LPAREN (columnName (COMMA columnName)*) RPAREN)? AS
	LPAREN fullSelect RPAREN
	WITH NO DATA
	)
	;

declareGlobalTemporaryTableAsResultTable
	: (
	AS LPAREN fullSelect RPAREN
	WITH NO DATA
	)
	;

createTableMaterializedQueryDefinition
	: (
	(LPAREN columnName (COMMA columnName)* RPAREN)? 
	AS materializedQueryDefinition
	)
	;

createTableColumnConstraint
	: (
	(CONSTRAINT constraintName)?
		(
			(PRIMARY KEY)
			| UNIQUE
			| referencesClause
			| (CHECK LPAREN checkCondition RPAREN)
		)
	)
	;

/*
Deprecated as of Db2 12.
*/
//#KMG
organizationClause
	: (
	ORGANIZE BY HASH UNIQUE
	LPAREN columnName (COMMA columnName)* RPAREN
	(HASH SPACE INTEGERLITERAL? sqlidentifier)?
	)
	/*{
		notifyErrorListeners("ORGANIZE has been deprecated as of DB2 12");
	}*/
	;

createGlobalTemporaryTableColumnDefinition
	: (
	columnName dataType (NOT NULL)?
	)
	;

declareGlobalTemporaryTableColumnDefinition
	: (
	columnName dataType 
	(defaultClause1
	| generatedClause2
	| (NOT NULL))* 
	)
	;

parameterDeclaration1
	: (
	parameterName? ((functionDataType (AS LOCATOR)?) | (TABLE LIKE tableName (AS LOCATOR)?))
	)
	;

parameterDeclaration2
	: (
	parameterName functionDataType
	)
	;

/*
I cannot find where it is documented that (IN | OUT | INOUT)? is allowed
following the procedureDataType but apparently it is.
*/
parameterDeclaration3
	: (
	(IN | OUT | INOUT)? parameterName? procedureDataType (AS LOCATOR)? (IN | OUT | INOUT)?
	)
	;

createFunctionStatementExternalScalarOptions
	: (
	externalNameOption1
	| languageOption3
	| parameterStyleOption2
	| deterministicOption
	| fencedOption
	| nullInputOption1
	| sqlDataOption3
	| externalActionOption
	| packagePathOption
	| scratchpadOption
	| finalCallOption
	| parallelOption2
	| dbinfoOption
	| cardinalityOption
	| collectionIdOption
	| wlmEnvironmentOption1
	| asuTimeOption
	| stayResidentOption
	| programTypeOption
	| securityOption
	| stopAfterFailureOption
	| runOptionsOption
	| specialRegistersOption
	| dispatchOption
	| securedOption
	| specificNameOption1
	| parameterOption1
	)
	;

//
externalNameOption1
	: (EXTERNAL (NAME (externalProgramName | identifier))?)
	;

externalNameOption2
	: (EXTERNAL NAME (externalProgramName | identifier))
	;

dynamicResultSetOption
	: (DYNAMIC? RESULT (SET |SETS) INTEGERLITERAL)
	;

languageOption1
	: (LANGUAGE SQL)
	;

languageOption2
	: (LANGUAGE (ASSEMBLE | C_ | COBOL | PLI))
	;

languageOption3
	: (LANGUAGE (ASSEMBLE | C_ | COBOL | JAVA | PLI))
	;

languageOption4
	: (LANGUAGE (ASSEMBLE | C_ | COBOL | JAVA | PLI | SQL))
	;

languageOption5
	: (LANGUAGE (ASSEMBLE | C_ | COBOL | JAVA | PLI | REXX))
	;

parameterStyleOption1
	: (PARAMETER STYLE SQL)
	;

parameterStyleOption2
	: (PARAMETER STYLE (SQL | JAVA))
	;

parameterStyleOption3
	: (PARAMETER STYLE (SQL | DB2SQL | (STANDARD CALL) | GENERAL | (SIMPLE CALL) | ((GENERAL | (SIMPLE CALL)) WITH NULLS) | JAVA))
	;

deterministicOption
	: ((NOT? DETERMINISTIC) | (NOT? VARIANT))
	;

fencedOption
	: (FENCED)
	;

nullInputOption1
	: ((RETURNS NULL ON NULL INPUT) | (CALLED ON NULL INPUT) | (NULL CALL))
	;

nullInputOption2
	: ((CALLED ON NULL INPUT) | (NULL CALL))
	;

nullInputOption3
	: ((RETURNS NULL ON NULL INPUT) | (CALLED ON NULL INPUT))
	;

nullInputOption4
	: (CALLED ON NULL INPUT)
	;

debugOption
	: ((DISALLOW | ALLOW | DISABLE) DEBUG MODE_)
	;

sqlDataOption1
	: ((READS SQL DATA) | (CONTAINS SQL))
	;

sqlDataOption2
	: ((READS SQL DATA) | (CONTAINS SQL) | (NO SQL))
	;

sqlDataOption3
	: ((MODIFIES SQL DATA) | (READS SQL DATA) | (CONTAINS SQL) | (NO SQL))
	;

sqlDataOption4
	: ((MODIFIES SQL DATA) | (READS SQL DATA) | (CONTAINS SQL))
	;

externalActionOption
	: (NO? EXTERNAL ACTION)
	;

packagePathOption
	: ((PACKAGE PATH packagePath) | (NO PACKAGE PATH))
	;

scratchpadOption
	: ((NO SCRATCHPAD) | (SCRATCHPAD INTEGERLITERAL))
	;

finalCallOption
	: (NO? FINAL CALL)
	;

parallelOption1
	: (DISALLOW PARALLEL)
	;

parallelOption2
	: ((ALLOW | DISALLOW) PARALLEL)
	;

dbinfoOption
	: (NO? DBINFO)
	;

cardinalityOption
	: (CARDINALITY INTEGERLITERAL)
	;

collectionIdOption
	: ((NO COLLID) | (COLLID collectionID))
	;

wlmEnvironmentOption1
	: (WLM ENVIRONMENT (identifier | (LPAREN identifier RPAREN)))
	;

wlmEnvironmentOption2
	: (WLM ENVIRONMENT (identifier | (LPAREN identifier COMMA SPLAT RPAREN)))
	;

wlmEnvironmentOption3
	: (WLM ENVIRONMENT FOR DEBUG MODE_ identifier)
	;

asuTimeOption
	: (ASUTIME ((NO LIMIT) | (LIMIT INTEGERLITERAL)))
	;

stayResidentOption
	: (STAY RESIDENT (NO | YES))
	;

programTypeOption
	: (PROGRAM TYPE (SUB | MAIN))
	;

securityOption
	: (SECURITY (DB2 | USER | DEFINER))
	;

stopAfterFailureOption
	: ((STOP AFTER SYSTEM DEFAULT FAILURES) | (STOP AFTER INTEGERLITERAL FAILURES) | (CONTINUE AFTER FAILURE))
	;

runOptionsOption
	: (RUN OPTIONS runTimeOptions)
	;

commitOnReturnOption
	: (COMMIT ON RETURN (YES | NO))
	;

specialRegistersOption
	: ((INHERIT | DEFAULT) SPECIAL REGISTERS)
	;

specialRegistersOption2
	: (INHERIT SPECIAL REGISTERS)
	;

dispatchOption
	: (STATIC DISPATCH)
	;

securedOption
	: (NOT? SECURED)
	;

specificNameOption1
	: (SPECIFIC specificName?)
	;

specificNameOption2
	: (SPECIFIC specificName)
	;

parameterOption1
	: (PARAMETER 
		(ccsidClause1
		| (VARCHAR (NULTERM | STRUCTURE)))+)
	;

parameterOption2
	: (PARAMETER ccsidClause1)
	;

//

createFunctionStatementExternalTableOptions
	: (
	externalNameOption1
	| languageOption2
	| parameterStyleOption1
	| deterministicOption
	| fencedOption
	| nullInputOption1
	| sqlDataOption2
	| externalActionOption
	| packagePathOption
	| scratchpadOption
	| finalCallOption
	| parallelOption1
	| dbinfoOption
	| cardinalityOption
	| collectionIdOption
	| wlmEnvironmentOption1
	| asuTimeOption
	| stayResidentOption
	| programTypeOption
	| securityOption
	| stopAfterFailureOption
	| runOptionsOption
	| specialRegistersOption
	| dispatchOption
	| securedOption
	| specificNameOption1
	| parameterOption1
	)
	;

createFunctionStatementSourcedOptions
	: (
	specificNameOption2
	| parameterOption2
	)
	;

/*
Added ccsidClause1 and forDataQualifier per Martijn Rutte 2023-05-23.
This allows the forDataQualifier and ccsidClause1 phrases to be
reversed from how they are defined in functionBuiltInType.
*/
inlineSqlScalarFunctionDefinition
	: (
	RETURNS functionDataType 
	(forDataQualifier ccsidClause1)? 
	languageOption1?
	createFunctionStatementInlineSqlScalarOptions+
	sqlRoutineBody
	)
	;

createFunctionStatementInlineSqlScalarOptions
	: (
	deterministicOption
	| nullInputOption1
	| sqlDataOption1
	| externalActionOption
	| dispatchOption
	| securedOption
	| specificNameOption1
	| parameterOption2
	)
	;

/*
Added ccsidClause1 and forDataQualifier per Martijn Rutte 2023-05-23.
This allows the forDataQualifier and ccsidClause1 phrases to be
reversed from how they are defined in functionBuiltInType.
*/
compiledSqlScalarFunctionDefinition
	: (
	RETURNS functionDataType 
	(forDataQualifier ccsidClause1)? 
	versionOption?
	createFunctionStatementCompiledSqlScalarOptions+
	sqlRoutineBody
	)
	;

createFunctionStatementCompiledSqlScalarOptions
	: (
	languageOption1
	| specificNameOption1
	| deterministicOption
	| externalActionOption
	| sqlDataOption4
	| nullInputOption1
	| dispatchOption
	| parallelOption2
	| debugOption
	| parameterOption2
	| parameterStyleOption1
	| schemaQualifierOption
	| packageOwnerOption
	| asuTimeOption
	| specialRegistersOption
	| wlmEnvironmentOption3
	| currentDataOption
	| degreeOption
	| concurrentAccessOption
	| dynamicRulesOption
	| applicationEncodingOption
	| explainOption
	| immediateWriteOption
	| isolationLevelOption
	| opthintOption
	| queryAccelerationOption
	| getAccelArchiveOption
	| accelerationOption
	| acceleratorOption
	| sqlPathOption
	| reoptOption
	| validateOption
	| roundingOption
	| dateFormatOption
	| decimalOption
	| forUpdateOption
	| timeFormatOption
	| securedOption
	| businessTimeSensitiveOption
	| systemTimeSensitiveOption
	| archiveSensitiveOption
	| applcompatOption
	| concentrateStatementsOption
	)
	;

/*
Added columnName to go with functionDataType.  My omission, found by
Martijn Rutte 2023-06-12.

Modified to use sqlTableReturnStatement as sqlRoutineBody was
simply incorrect according to the documentation.  Found by Martijn
Rutte 2023-07-06.
*/
sqlTableFunctionDefinition
	: (
	RETURNS TABLE LPAREN columnName functionDataType (COMMA columnName functionDataType)* RPAREN
	createFunctionStatementSqlTableOptions+
	sqlTableReturnStatement
	)
	;

createFunctionStatementSqlTableOptions
	: (
	languageOption1
	| specificNameOption1
	| deterministicOption
	| externalActionOption
	| sqlDataOption1
	| nullInputOption1
	| specialRegistersOption
	| dispatchOption
	| cardinalityOption
	| parameterOption2
	| securedOption
	)
	;

/*

Applied fix from Martijn Rutte 2024-01-25, which was to
insert...

	(WITH commonTableExpression (COMMA commonTableExpression)*)?

...into both "branches" of this rule.

*/
sqlTableReturnStatement
	: ((BEGIN sqlplCompoundAtomicClause? 
	RETURN (WITH commonTableExpression (COMMA commonTableExpression)*)? fullSelect SEMICOLON? 
	END SEMICOLON?)
	| (RETURN (WITH commonTableExpression (COMMA commonTableExpression)*)? fullSelect SEMICOLON?))
	;

sequenceAlias
	: (
	aliasName FOR SEQUENCE sequenceName
	)
	;

tableAlias
	: (
	aliasName FOR TABLE? tableName
	)
	;

authorization
	: (USER hostVariable USING hostVariable)
	;

/*
Alternate syntax allows omission of FROM.  (WHERE searchCondition) should
be optional, i.e. DELETE T1; is a valid statement.
Noted by Martijn Rutte 2023-01-09.
*/
searchedDelete
	: (
	DELETE FROM? tableName periodClause? AS? correlationName? includeColumns?
	(SET assignmentClause)? (WHERE searchCondition)? fetchClause?
	(isolationClause | skipLockedDataClause)* querynoClause?
	)
	;

/*
Alternate syntax allows omission of FROM.  Noted by Martijn Rutte 2023-01-09.
*/
positionedDelete
	: (
	DELETE FROM? tableName AS? correlationName? WHERE CURRENT OF cursorName
	(FOR ROW (hostVariable | INTEGERLITERAL) OF ROWSET)?
	)
	;

searchedUpdate
	: (
	UPDATE tableName periodClause? AS? correlationName? includeColumns?
	SET assignmentClause (WHERE searchCondition)? 
	(isolationClause | skipLockedDataClause)* querynoClause?
	)
	;

positionedUpdate
	: (
	UPDATE tableName AS? correlationName? 
	SET assignmentClause
	WHERE CURRENT OF cursorName
	(FOR ROW (hostVariable | INTEGERLITERAL) OF ROWSET)?
	)
	;

sourceValues
	: (
	LPAREN VALUES 
	(valuesSingleRow | valuesMultipleRow) 
	RPAREN 
	AS? correlationName 
	LPAREN columnName (COMMA columnName)* RPAREN
	)
	;

valuesSingleRow
	: (
	valuesList3 | (LPAREN valuesList3 (COMMA valuesList3)* RPAREN)
	)
	;

valuesMultipleRow
	: (
	valuesList4 | (LPAREN valuesList4 (COMMA valuesList4)* RPAREN)
	FOR (hostVariable | INTEGERLITERAL) ROWS
	)
	;

matchingCondition
	: (
	NOT? MATCHED (AND searchCondition)?
	)
	;

modificationOperation
	: (updateOperation | deleteOperation | insertOperation)
	;

assignmentClause
	: (
	(columnName EQ valuesList1 (COMMA columnName EQ valuesList1)*)
	| (LPAREN columnName (COMMA columnName)* 
		RPAREN EQ 
		LPAREN ((valuesList1 (COMMA valuesList1)*) | fullSelect)
		RPAREN)
	)
	;

setAssignmentClause
	: (
	(arrayElementSpecification EQ (expression | NULL))
	| (setAssignmentTargetVariable EQ valuesList1 (COMMA setAssignmentTargetVariable EQ valuesList1)*)
	| (LPAREN setAssignmentTargetVariable (COMMA setAssignmentTargetVariable)* 
		RPAREN EQ 
		LPAREN 
			(((valuesList1 (COMMA valuesList1)*) | fullSelect)
			| subSelect
			| (VALUES valuesList1)
			| (VALUES LPAREN valuesList1 (COMMA valuesList1)* RPAREN))
		RPAREN)
	| (setAssignmentTargetVariable EQ arrayConstructor)
	)
	;

setAssignmentTargetVariable
	: (
	globalVariableName
	| hostVariable
	| sqlParameterName
	| sqlVariableName
	| transitionVariableName
	)
	;

updateOperation
	: (
	UPDATE SET assignmentClause (COMMA assignmentClause)*
	)
	;

deleteOperation
	: (DELETE)
	;

insertOperation
	: (
	INSERT LPAREN columnName (COMMA columnName)* RPAREN
	VALUES (valuesList1 |
		(LPAREN valuesList1 (COMMA valuesList1)* RPAREN))
	)
	;

signalInformation
	: (
	(SET MESSAGE_TEXT EQ expression (operator expression)*)
	| (LPAREN NONNUMERICLITERAL RPAREN)
	)
	;

/*
Changed...

	(expression (operator expression)*)

...to...

	(expression ((operator expression) | INTEGERLITERAL)*)
	
...on 2023-01-03 to deal with hitherto unseen syntax...

	INSERT INTO WEATHER VALUES
		(NEWCW.CITY, 
		1.8*NEWCW.TEMPC+32)

...where +32 was lexed as a single token, breaking the
parser rule valuesList1.  I don't have access to a DB2
instance to test if this is a problem with the test case
or not, so here we are.  If you're writing an interpreter
you'll have to deal with this modified rule's handling
of an optional operator.
*/
valuesList1
	: (
	(expression ((operator expression) | INTEGERLITERAL)*)
	| DEFAULT 
	| NULL
	)
	;

valuesList2
	: (expression | hostVariable | DEFAULT | NULL)
	;

valuesList3
	: (expression | NULL)
	;

valuesList4
	: (expression | hostVariable | NULL)
	;

includeColumns
	: (INCLUDE LPAREN columnName dataType (COMMA columnName dataType)* RPAREN)
	;

multipleRowInsert
	: (
	VALUES (valuesList2 | (LPAREN valuesList2 (COMMA valuesList2)* RPAREN))
	(FOR (hostVariable | INTEGERLITERAL) ROWS)?
	(ATOMIC | notAtomicPhrase)
	)
	;

regenerateClause
	: (REGENERATE (USING APPLICATION COMPATIBILITY applCompatValue)?)
	;

/*
2022-11-04 Issue 125 Changed usingSpecification1 to usingBlock for consistency.
*/
alterIndexOptions
	:(
	bufferpoolOption
	| closeOption
	| copyOption
	| dssizeOption
	| piecesizeOption
	| usingBlock
	| freeSpecification
	| gbpcacheSpecification
	| clusterOption
	| paddedOption
	| compressOption
	| (ADD
		((COLUMN
		LPAREN
		columnName (ASC | DESC | RANDOM)?
		RPAREN)
		| (INCLUDE COLUMN LPAREN columnName RPAREN))
	  )
	)
	;

//
bufferpoolOption
	: (BUFFERPOOL bpName)
	;

closeOption
	: (CLOSE (YES | NO))
	;

copyOption
	: (COPY (YES | NO))
	;

dssizeOption
	: (
	(DSSIZE INTEGERLITERAL SQLIDENTIFIER)
	{
		int dssizeVal = $INTEGERLITERAL.int;
		int line = $DSSIZE.line;
		String sqlident = $SQLIDENTIFIER.text;
		if (!sqlident.toUpperCase().endsWith("G")) {
			notifyErrorListeners($SQLIDENTIFIER, "DSSIZE value must end with G", null);
		}
		if ((dssizeVal == 0) || (dssizeVal & -dssizeVal) != dssizeVal) {
			notifyErrorListeners($INTEGERLITERAL, "DSSIZE value must be a power of 2", null);
		}
		if ((dssizeVal < 1) || (dssizeVal > 256)) {
			notifyErrorListeners($INTEGERLITERAL, "DSSIZE value must be in the range [1-256]", null);
		}
	}
	| (DSSIZE SQLIDENTIFIER)
	{
		int line = $DSSIZE.line;
		int dssizeVal = 0;
		String sqlident = $SQLIDENTIFIER.text;
		if (!sqlident.toUpperCase().endsWith("G")) {
			notifyErrorListeners($SQLIDENTIFIER, "DSSIZE value must end with G", null);
		}
		String sqlidentVal = sqlident.substring(0, sqlident.length() - 1);
		try {
			dssizeVal = Integer.parseInt(sqlidentVal.trim());
			if ((dssizeVal == 0) || ((dssizeVal & -dssizeVal) != dssizeVal)) {
				notifyErrorListeners($SQLIDENTIFIER, "DSSIZE value must be a power of 2", null);
			}
			if ((dssizeVal < 1) || (dssizeVal > 256)) {
				notifyErrorListeners($SQLIDENTIFIER, "DSSIZE value must be in the range [1-256]", null);
			}
		} catch (NumberFormatException e) {
			notifyErrorListeners($SQLIDENTIFIER, "DSSIZE contains illegal value " + sqlidentVal, null);
		}
	}
	)
	;

/*
The optional INTEGERLITERAL has been added because it turns
out that both...

PIECESIZE 4K

...and...

PIECESIZE 4 K

...are syntactically correct.  Documentation correction
request submitted to IBM on 05-Aug-2022.

IBM responded to the documentation correction request on
17-Aug-2022, noting that in _any_ place the syntax
<integer>[K|M|G] was allowed, whitespace was allowed
between the <integer> and the [K|M|G].  IBM indicated they
would be updating their documentation to reflect this.

All such changes tagged with #KMG
*/
piecesizeOption
	: (PIECESIZE INTEGERLITERAL? sqlidentifier)
	;

clusterOption
	: (NOT? CLUSTER)
	;

paddedOption
	: (NOT? PADDED)
	;

compressOption
	: (COMPRESS ((YES (FIXEDLENGTH | HUFFMAN)?) | NO))
	;

defineOption
	: (DEFINE (YES | NO))
	;

locksizeOption
	: (LOCKSIZE (ANY | TABLESPACE | TABLE | PAGE | ROW | LOB))
	;

lockmaxOption
	: (LOCKMAX (SYSTEM | INTEGERLITERAL))
	;

enableDisableOption
	: (ENABLE | DISABLE)
	;

/*
Although the latter two options are "supported as alternatives,
they are not the preferred syntax."
*/
loggedOption
	: ((NOT? LOGGED) | (LOG NO) | (LOG YES))
	;

notAtomicPhrase
	: (NOT ATOMIC CONTINUE ON SQLEXCEPTION)
	;

/*
2022-11-04 Issue 125 Changed usingSpecification1 to usingBlock for consistency.
2023-05-24 Alternate syntax says ALTER is optional.
*/
alterIndexPartitionOptions
	: (
	ALTER? partitionElement
		(usingBlock
		| freeSpecification+
		| gbpcacheSpecification
		| dssizeOption)*
	)
	;

usingSpecification1
	: (
	(USING ((VCAT catalogName) | (STOGROUP stogroupName)))
	| (PRIQTY INTEGERLITERAL)
	| (SECQTY INTEGERLITERAL)
	| (ERASE (YES | NO))
	)
	;

freeSpecification
	: (
	(FREEPAGE INTEGERLITERAL)
	| (PCTFREE INTEGERLITERAL)
	)
	;

gbpcacheSpecification
	: (
	GBPCACHE (CHANGED | ALL | SYSTEM | NONE)
	)
	;

/*
Updated to include alternate syntax per Martijn Rutte 2023-05-24.
*/
partitionElement
	: (
	(PARTITION | PART) INTEGERLITERAL
	(((ENDING AT?) | VALUES) LPAREN 
		(literal | MAXVALUE | MINVALUE) (COMMA (literal | MAXVALUE | MINVALUE))* 
	RPAREN INCLUSIVE?)?
	)
	;
applCompatValue
	: APPLCOMPAT_LEVEL
	;

functionLevel
	: sqlidentifier
	;

functionParameterType
	: (functionDataType (AS LOCATOR)?)
	;

functionDataType
	: (functionBuiltInType | distinctTypeName)
	;

/*
TODO

I suspect that...

ccsidClause1? forDataQualifier?

...need to be changed to...

(ccsidClause1 | forDataQualifier)*

...as they were for procedureBuiltInType on 2023-05-24.
*/
functionBuiltInType
	: (
	SMALLINT
	| INTEGER
	| INT
	| BIGINT
	| ((DECIMAL | DEC | NUMERIC) (integerInParens | (LPAREN RPAREN))?)
	| (DECFLOAT (integerInParens | (LPAREN RPAREN))?)
	| (FLOAT (integerInParens | (LPAREN RPAREN))?)
	| REAL
	| (DOUBLE PRECISION?)
	| ((((CHARACTER | CHAR) VARYING? ) | VARCHAR) (length | (LPAREN RPAREN))? ccsidClause1? forDataQualifier?)
	| ((((CHARACTER | CHAR) LARGE OBJECT) | CLOB) (length | (LPAREN RPAREN))? ccsidClause1? forDataQualifier?)
	| ((GRAPHIC | VARGRAPHIC | DBCLOB) (length | (LPAREN RPAREN))? ccsidClause1?)
	| (BINARY (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY VARYING?) | VARBINARY) (integerInParens | (LPAREN RPAREN)))
	| (((BINARY LARGE OBJECT) | BLOB) length?)
	| DATE
	| TIME
	| (TIMESTAMP integerInParens? ((WITH | WITHOUT) TIME ZONE)?)
	| ROWID
	| XML
	)
	;

/*
Changed CHAR and CLOB from ccsidClause1? forDataQualifier? to
(ccsidClause1 | forDataQualifier)* to allow the clauses to be
in any order.  2023-05-24
*/
procedureBuiltinType
	: (
	SMALLINT
	| INTEGER
	| INT
	| BIGINT
	| ((DECIMAL | DEC | NUMERIC) (integerInParens | (LPAREN RPAREN))?)
	| (DECFLOAT (integerInParens | (LPAREN RPAREN))?)
	| (FLOAT (integerInParens | (LPAREN RPAREN))?)
	| REAL
	| (DOUBLE PRECISION?)
	| ((((CHARACTER | CHAR) VARYING? ) | VARCHAR) (length | (LPAREN RPAREN))? (ccsidClause1 | forDataQualifier)*)
	| ((((CHARACTER | CHAR) LARGE OBJECT) | CLOB) (length | (LPAREN RPAREN))? (ccsidClause1 | forDataQualifier)*)
	| ((GRAPHIC | VARGRAPHIC | DBCLOB) (length | (LPAREN RPAREN))? ccsidClause1?)
	| (BINARY (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY VARYING?) | VARBINARY) (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY LARGE OBJECT) | BLOB) length?)
	| DATE
	| TIME
	| (TIMESTAMP integerInParens? ((WITH | WITHOUT) TIME ZONE)?)
	| ROWID
	)
	;

createTypeArrayBuiltinType
	: (
	SMALLINT
	| INTEGER
	| INT
	| BIGINT
	| ((DECIMAL | DEC | NUMERIC) (integerInParens | (LPAREN RPAREN)))
	| (DECFLOAT (integerInParens | (LPAREN RPAREN)))
	| (FLOAT (integerInParens | (LPAREN RPAREN)))
	| REAL
	| (DOUBLE PRECISION?)
	| ((((CHARACTER | CHAR) VARYING? ) | VARCHAR) length? ccsidClause1? forDataQualifier?)
	| ((((CHARACTER | CHAR) LARGE OBJECT) | CLOB) length? ccsidClause1? forDataQualifier?)
	| ((GRAPHIC | VARGRAPHIC | DBCLOB) (length | (LPAREN RPAREN))? ccsidClause1?)
	| (BINARY (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY VARYING?) | VARBINARY) (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY LARGE OBJECT) | BLOB) length?)
	| DATE
	| TIME
	| (TIMESTAMP integerInParens? ((WITH | WITHOUT) TIME ZONE)?)
	)
	;

createTypeArrayBuiltinType2
	: (
	INTEGER
	| INT
	| ((((CHARACTER | CHAR) VARYING? ) | VARCHAR) length? ccsidClause1? forDataQualifier?)
	)
	;

createVariableBuiltInType
	: (
	SMALLINT
	| INTEGER
	| INT
	| BIGINT
	| ((DECIMAL | DEC | NUMERIC) (integerInParens | (LPAREN RPAREN)))
	| (DECFLOAT (integerInParens | (LPAREN RPAREN)))
	| (FLOAT (integerInParens | (LPAREN RPAREN)))
	| REAL
	| (DOUBLE PRECISION?)
	| ((((CHARACTER | CHAR) VARYING? ) | VARCHAR) length? forDataQualifier?)
	| ((((CHARACTER | CHAR) LARGE OBJECT) | CLOB) length? forDataQualifier?)
	| ((GRAPHIC | VARGRAPHIC | DBCLOB) length?)
	| (BINARY (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY VARYING?) | VARBINARY) (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY LARGE OBJECT) | BLOB) length?)
	| DATE
	| TIME
	| (TIMESTAMP integerInParens? ((WITH | WITHOUT) TIME ZONE)?)
	)
	;

sourceDataType
	: procedureBuiltinType
	;

functionExternalOptionList
	: (
	externalNameOption2
	| languageOption4
	| parameterStyleOption2
	| deterministicOption
	| nullInputOption3
	| sqlDataOption3
	| externalActionOption
	| packagePathOption
	| scratchpadOption
	| finalCallOption
	| parallelOption2
	| dbinfoOption
	| cardinalityOption
	| collectionIdOption
	| wlmEnvironmentOption2
	| asuTimeOption
	| stayResidentOption
	| programTypeOption
	| securityOption
	| stopAfterFailureOption
	| runOptionsOption
	| specialRegistersOption
	| dispatchOption
	| securedOption
	)
	;

functionCompiledSqlScalarOptionList
	: (
	deterministicOption
	| externalActionOption
	| sqlDataOption4
	| nullInputOption3
	| dispatchOption
	| parallelOption2
	| debugOption
	| schemaQualifierOption
	| packageOwnerOption
	| asuTimeOption
	| specialRegistersOption
	| wlmEnvironmentOption3
	| currentDataOption
	| degreeOption
	| concurrentAccessOption
	| dynamicRulesOption
	| applicationEncodingOption
	| explainOption
	| immediateWriteOption
	| isolationLevelOption
	| opthintOption
	| sqlPathOption
	| queryAccelerationOption
	| getAccelArchiveOption
	| accelerationOption
	| acceleratorOption
	| releaseAtOption
	| reoptOption
	| validateOption
	| roundingOption
	| dateFormatOption
	| decimalOption
	| forUpdateOption
	| timeFormatOption
	| securedOption
	| businessTimeSensitiveOption
	| systemTimeSensitiveOption
	| archiveSensitiveOption
	| applcompatOption
	| concentrateStatementsOption
	)
	;

functionInlineSqlScalarOptionList
	: (
	deterministicOption
	| externalActionOption
	| sqlDataOption1
	| dispatchOption
	| nullInputOption4
	| securedOption
	)
	;

functionSqlTableOptionList
	: (
	deterministicOption
	| externalActionOption
	| sqlDataOption1
	| nullInputOption4
	| specialRegistersOption2
	| dispatchOption
	| cardinalityOption
	| securedOption
	)
	;

/*
Changed hard-coded debugOption and nullInputOption2
to use their parser rule equivalents.  Hopefully this
isn't too painful for anyone.
*/
procedureOptionList
	: (
	dynamicResultSetOption
	| parameterOption1
	| externalNameOption2
	| languageOption5
	| parameterStyleOption3
	| deterministicOption
	| packagePathOption
	| sqlDataOption3
	| dbinfoOption
	| collectionIdOption
	| wlmEnvironmentOption2
	| asuTimeOption
	| stayResidentOption
	| programTypeOption
	| securityOption
	| runOptionsOption
	| commitOnReturnOption
	| specialRegistersOption
	| nullInputOption2
	| stopAfterFailureOption
	| debugOption
	)
	;

/*
Removed languageOption5 from createProcedureOptionList so a
distinction could be made between external (mandatory languageOption5) 
and native SQL (optional languageOption1) stored procedures.
*/
createProcedureOptionList
	: (
	specificNameOption2
	| dynamicResultSetOption
	| parameterOption1
	| externalNameOption1
	| sqlDataOption3
	| parameterStyleOption3
	| deterministicOption
	| packagePathOption
	| fencedOption
	| dbinfoOption
	| collectionIdOption
	| wlmEnvironmentOption2
	| asuTimeOption
	| stayResidentOption
	| programTypeOption
	| securityOption
	| runOptionsOption
	| commitOnReturnOption
	| specialRegistersOption
	| nullInputOption2
	| stopAfterFailureOption
	| debugOption
	)
	;

procedureSQLPLOptionList
	: (
	specificNameOption2
	| deterministicOption
	| sqlDataOption4
	| nullInputOption2
	| dynamicResultSetOption
	| debugOption
	| parameterOption2
	| schemaQualifierOption
	| packageOwnerOption
	| asuTimeOption
	| commitOnReturnOptionSQLPL
	| specialRegistersOption
	| wlmEnvironmentOption3
	| deferPrepareOption
	| currentDataOption
	| degreeOption
	| concurrentAccessOption
	| dynamicRulesOption
	| applicationEncodingOption
	| explainOption
	| immediateWriteOption
	| isolationLevelOption
	| keepDynamicOption
	| opthintOption
	| sqlPathOption
	| queryAccelerationOption
	| getAccelArchiveOption
	| accelerationOption
	| acceleratorOption
	| releaseAtOption
	| reoptOption
	| validateOption
	| roundingOption
	| dateFormatOption
	| decimalOption
	| forUpdateOption
	| timeFormatOption
	| businessTimeSensitiveOption
	| systemTimeSensitiveOption
	| archiveSensitiveOption
	| applcompatOption
	| concentrateStatementsOption
	| externalNameOption1    //deprecated as of db2 13
	  //{notifyErrorListeners("EXTERNAL has been deprecated as of DB2 13");}
	| fencedOption           //deprecated as of db2 13
	  //{notifyErrorListeners("FENCED has been deprecated as of DB2 13");}
	| dbinfoOption           //for compatibility only
	  //{notifyErrorListeners("DBINFO is tolerated for compatibility purposes only");}
	| collectionIdOption     //for compatibility only
	  //{notifyErrorListeners("COLLID is tolerated for compatibility purposes only");}
	| stopAfterFailureOption //for compatibility only
	  //{notifyErrorListeners("STOP AFTER ... FAILURES / CONTINUE AFTER FAILURE is tolerated for compatibility purposes only");}
	| stayResidentOption     //for compatibility only
	  //{notifyErrorListeners("STAY RESIDENT is tolerated for compatibility purposes only");}
	| programTypeOption      //for compatibility only
	  //{notifyErrorListeners("PROGRAM TYPE is tolerated for compatibility purposes only");}
	| securityOption         //for compatibility only
	  //{notifyErrorListeners("SECURITY is tolerated for compatibility purposes only");}
	| runOptionsOption       //for compatibility only
	  //{notifyErrorListeners("RUN OPTIONS is tolerated for compatibility purposes only");}
	)
	;

versionOption
	: (VERSION (identifier | literal))
	;

commitOnReturnOptionSQLPL
	: (AUTONOMOUS | commitOnReturnOption)
	;

schemaQualifierOption
	: (QUALIFIER schemaName)
	;

currentDataOption
	: (CURRENT DATA (YES | NO))
	;

immediateWriteOption
	: ((WITH | WITHOUT) IMMEDIATE WRITE)
	;

explainOption
	: ((WITH | WITHOUT) EXPLAIN)
	;

reoptOption
	: (REOPT (NONE | ALWAYS | ONCE))
	;

packageOwnerOption
	: (PACKAGE OWNER authorizationName (AS (ROLE | USER))?)
	;

deferPrepareOption
	: ((DEFER PREPARE) | (NODEFER PREPARE))
	;

degreeOption
	: (DEGREE (ANY | INTEGERLITERAL))
	;

dynamicRulesOption
	: (DYNAMICRULES
		( RUN
		| BIND
		| DEFINEBIND
		| DEFINERUN
		| INVOKEBIND
		| INVOKERUN
		)
	)
	;

concurrentAccessOption
	: (CONCURRENT ACCESS RESOLUTION
		((USE CURRENTLY COMMITTED) | (WAIT FOR OUTCOME))
	)
	;

applicationEncodingOption
	: (APPLICATION ENCODING SCHEME (ASCII | EBCDIC | UNICODE))
	;

isolationLevelOption
	: (ISOLATION LEVEL (CS | RS | RR | UR))
	;

keepDynamicOption
	: ((WITH | WITHOUT) KEEP DYNAMIC)
	;

opthintOption
	: (OPTHINT NONNUMERICLITERAL)
	;

sqlPathOption
	: (SQL PATH sqlPathOptionItem (COMMA sqlPathOptionItem)*)
	;
	
sqlPathOptionItem
	: ((SYSTEM PATH) | (SESSION USER) | USER | SQLIDENTIFIER | NONNUMERICLITERAL)
	;

queryAccelerationOption
	: (QUERY ACCELERATION queryAccelerationOptionItem)
	;

queryAccelerationOptionItem
	: (NONE
	| ENABLE
	| (ENABLE WITH FAILBACK)
	| ELIGIBLE
	| ALL
	)
	;

getAccelArchiveOption
	: (GET_ACCEL_ARCHIVE (NO | YES))
	;

accelerationOption
	: (ACCELERATION WAITFORDATA NUMERICLITERAL)
	;

releaseAtOption
	: (RELEASE AT (COMMIT | DEALLOCATE))
	;

businessTimeSensitiveOption
	: (BUSINESS_TIME SENSITIVE (YES | NO))
	;

systemTimeSensitiveOption
	: (SYSTEM_TIME SENSITIVE (YES | NO))
	;

archiveSensitiveOption
	: (ARCHIVE SENSITIVE (YES | NO))
	;

applcompatOption
	: (APPLCOMPAT applCompatValue)
	;

validateOption
	: (VALIDATE (RUN | BIND))
	;

roundingOption
	: (ROUNDING roundingOptionItem)
	;

roundingOptionItem
	: ( DEC_ROUND_CEILING
	| DEC_ROUND_DOWN
	| DEC_ROUND_FLOOR
	| DEC_ROUND_HALF_DOWN
	| DEC_ROUND_HALF_EVEN
	| DEC_ROUND_HALF_UP
	| DEC_ROUND_UP
	)
	;

dateFormatOption
	: (DATE FORMAT dateTimeFormatOptionItem)
	;

dateTimeFormatOptionItem
	: (ISO | EUR | USA | JIS | LOCAL)
	;

timeFormatOption
	: (TIME FORMAT dateTimeFormatOptionItem)
	;

decimalOption
	: (DECIMAL LPAREN INTEGERLITERAL (COMMA INTEGERLITERAL)? RPAREN)
	;

forUpdateOption
	: (FOR UPDATE CLAUSE (REQUIRED | OPTIONAL))
	;

concentrateStatementsOption
	: (CONCENTRATE STATEMENTS (OFF | (WITH LITERALS)))
	;

acceleratorOption
	: (ACCELERATOR acceleratorName)
	;

procedureDataType
	: (procedureBuiltinType | distinctTypeName)
	;

alterSequenceOptionList
	: (
	restartOption
	| incrementOption
	| minvalueOption
	| maxvalueOption
	| cycleOption
	| cacheOption
	| orderOption
	)
	;

createSequenceOptionList
	: (
	asTypeOption
	| startOption
	| incrementOption
	| minvalueOption
	| maxvalueOption
	| cycleOption
	| cacheOption
	| orderOption
	)
	;

asTypeOption
	: (AS sequenceDataType)
	;

/*
Non-integer literals allowed, noted by Martijn Rutte 2023-05-23.
*/
startOption
	: (START WITH (NUMERICLITERAL | INTEGERLITERAL))
	;

restartOption
	: (RESTART (WITH INTEGERLITERAL)?)
	;

incrementOption
	: (INCREMENT BY (NUMERICLITERAL | INTEGERLITERAL))
	;

minvalueOption
	: (NOMINVALUE | (NO MINVALUE) | (MINVALUE (NUMERICLITERAL | INTEGERLITERAL)))
	;

maxvalueOption
	: (NOMAXVALUE | (NO MAXVALUE) | (MAXVALUE (NUMERICLITERAL | INTEGERLITERAL)))
	;

cycleOption
	: (NOCYCLE | (NO? CYCLE))
	;

cacheOption
	: (NOCACHE | (NO CACHE) | (CACHE INTEGERLITERAL))
	;

orderOption
	: (NOORDER | (NO? ORDER))
	;

keyLabelOption
	: ((NO KEY LABEL) | (KEY LABEL keyLabelName))
	;

dataclasOption
	: (DATACLAS dcName)
	;

mgmtclasOption
	: (MGMTCLAS mcName)
	;

storclasOption
	: (STORCLAS scName)
	;

//

alterStogroupOptionList
	: (
	(ADD VOLUMES LPAREN volumeID (COMMA volumeID)* RPAREN)
	| (ADD VOLUMES LPAREN NONNUMERICLITERAL (COMMA NONNUMERICLITERAL)* RPAREN)
	| (REMOVE VOLUMES LPAREN volumeID (COMMA volumeID)* RPAREN)
	| (REMOVE VOLUMES LPAREN NONNUMERICLITERAL (COMMA NONNUMERICLITERAL)* RPAREN)
	| keyLabelOption
	| dataclasOption
	| mgmtclasOption
	| storclasOption
	)
	;

/*
Added..

	| (referentialConstraint)

...as it seems to be allowed on its own.  Noted by Martijn Rutte 2023-01-10.

Added..

	| (uniqueConstraint)

...as it seems to be allowed on its own.  Noted by Martijn Rutte 2023-05-23.
*/
alterTableOptionList
	: (
	(ADD COLUMN? alterTableColumnDefinition)
	| (ALTER COLUMN? columnAlteration)
	| (RENAME COLUMN sourceColumnName TO targetColumnName)
	| (DROP COLUMN? columnName RESTRICT)
	| (ADD periodDefinition)
	| (ADD (uniqueConstraint | referentialConstraint | checkConstraint))
	| (uniqueConstraint)
	| (referentialConstraint)
	| (DROP ((PRIMARY KEY) | ((UNIQUE | (FOREIGN KEY) | CHECK | CONSTRAINT) constraintName)))
	| (ADD partitioningClause)
	| (ADD PARTITION partitionClause)
	| (ALTER PARTITION INTEGERLITERAL partitionClause)
	| (ROTATE PARTITION (FIRST | INTEGERLITERAL) TO LAST rotatePartitionClause)
	| (DROP ORGANIZATION)
	| (alterHashOrganization)
	| (ADD SYSTEM? VERSIONING USE HISTORY TABLE historyTableName extraRowOption?)
	| (DROP SYSTEM? VERSIONING)
	| (ADD ((MATERIALIZED QUERY) | QUERY)? materializedQueryDefinition)
	| (ALTER MATERIALIZED? QUERY materializedQueryAlteration)
	| (DROP MATERIALIZED? QUERY)
	| dataCaptureClause
	| cardinalityClause
	| (ADD CLONE cloneTableName)
	| (DROP CLONE)
	| (ADD RESTRICT ON DROP)
	| (DROP RESTRICT ON DROP)
	| ((ACTIVATE | DEACTIVATE) ROW ACCESS CONTROL)
	| ((ACTIVATE | DEACTIVATE) COLUMN ACCESS CONTROL)
	| appendClause
	| auditClause
	| validprocClause
	| (ENABLE ARCHIVE USE archiveTableName)
	| (DISABLE ARCHIVE)
	| (NO KEY LABEL)
	| (KEY LABEL keyLabelName)
	)
	;

alterTablespaceOptionList
	: (
	bufferpoolOption
	| ccsidClause2
	| closeOption
	| compressOption
	| (DROP PENDING CHANGES)
	| dssizeOption
	| insertAlgorithmOption
	| lockmaxOption
	| locksizeOption
	| loggedOption
	| maxrowsOption
	| maxpartitionsOption
	| (MEMBER CLUSTER (YES | NO))
	| segsizeOption
	| trackmodClause
	| (usingBlock)
	| (freeBlock)
	| (gbpcacheBlock)
	| (PAGENUM RELATIVE)
	)
	;

/*
2022-11-01 Maarten van Haasteren noticed this rule should
reference usingSpecification2 instead of usingBlock.
2023-01-10 Martijn Rutte noticed this rule should allow
pagenumClause on its own and not just as part of
partitionByRangeSpecification.
*/
createTablespaceOptionList
	: (
	inDatabaseOption
	| bufferpoolOption
	| partitionByGrowthSpecification
	| partitionByRangeSpecification
	| segsizeOption
	| ccsidClause1
	| closeOption
	| compressOption
	| defineOption
	| freeBlock
	| gbpcacheBlock
	| insertAlgorithmOption
	| lockmaxOption
	| locksizeOption
	| loggedOption
	| maxrowsOption
	| maxpartitionsOption
	| memberClause
	| trackmodClause
	| pagenumClause
	| usingSpecification2
	)
	;

/*
This rule does not strictly follow the syntax diagram, as the diagram
is at odds with at least one example and arguably with the narrative.

More specifically, it is unclear where the ALTER keyword is required,
and so this rule makes it optional where its use seems to me to be
ambiguously documented.
*/
trustedContextOptionList
	: (
	(ALTER SYSTEM AUTHID authorizationName)
	| (ALTER NO DEFAULT ROLE)
	| (ALTER DEFAULT ROLE roleName 
		((WITHOUT ROLE AS OBJECT OWNER) | (WITH ROLE AS OBJECT OWNER AND QUALIFIER))?)
	| (ALTER? ENABLE)
	| (ALTER? DISABLE)
	| (ALTER? NO DEFAULT SECURITY LABEL)
	| (ALTER? DEFAULT SECURITY LABEL seclabelName)
	| (ALTER ATTRIBUTES LPAREN alterAttributesOptions (COMMA alterAttributesOptions)* RPAREN)
	| (ADD ATTRIBUTES LPAREN addAttributesOptions (COMMA addAttributesOptions)* RPAREN)
	| (DROP ATTRIBUTES LPAREN dropAttributesOptions (COMMA dropAttributesOptions)* RPAREN)
	| userClause
	)
	;

databaseOptionList
	: (
	bufferpoolOption
	| (INDEXBP bpName)
	| (AS WORKFILE (FOR memberName)?)
	| (STOGROUP ( SYSDEFLT | stogroupName)?)
	| ccsidClause1
	)
	;

createIndexOptionList
	: (
	(xmlIndexSpecification)
	| includeColumnPhrase
	| clusterOption
	| (PARTITIONED)
	| paddedOption
	| compressOption
	| usingSpecification2
	| freeSpecification
	| gbpcacheSpecification
	| defineOption
	| ((INCLUDE | EXCLUDE) NULL KEYS)
	| ((PARTITION BY RANGE?)? LPAREN
		partitionElement (usingSpecification2 | freeSpecification | gbpcacheSpecification | dssizeOption)*
		(COMMA partitionElement (usingSpecification2 | freeSpecification | gbpcacheSpecification | dssizeOption)*)* RPAREN)
	| bufferpoolOption
	| closeOption
	| (DEFER (NO | YES))
	| dssizeOption
	| piecesizeOption
	| copyOption
	)
	;

createLobTablespaceOptionList
	: (
	inDatabaseOption
	| bufferpoolOption
	| closeOption
	| compressOption
	| defineOption
	| dssizeOption
	| gbpcacheSpecification
	| insertAlgorithmOption
	| lockmaxOption
	| locksizeOption
	| loggedOption
	| usingSpecification2
	)
	;

inDatabaseOption
	: (IN databaseName)
	;

segsizeOption
	: (SEGSIZE INTEGERLITERAL)
	;

numpartsOption
	: (NUMPARTS INTEGERLITERAL)
	;

partitionByGrowthSpecification
	: (
	(maxpartitionsOption numpartsOption?)
	| dssizeOption
	)
	;

partitionByRangeSpecification
	: (
	numpartsOption
		(
			(LPAREN 
			(partitionByRangePartitionPhrase (COMMA partitionByRangePartitionPhrase)*)*
			RPAREN)
		|	pagenumClause
		|	dssizeOption
		)*
	)
	;

/*
2022-11-02 Maarten van Haasteren noticed this rule should
reference usingSpecification2 instead of usingBlock.
*/
partitionByRangePartitionPhrase
	: (
	(PARTITION | PART) INTEGERLITERAL
		(
		usingSpecification2
		| freeBlock
		| gbpcacheBlock
		| compressOption
		| trackmodClause
		| dssizeOption
		)*
	)
	;

insertAlgorithmOption
	: (INSERT ALGORITHM INTEGERLITERAL)
	;

maxrowsOption
	: (MAXROWS INTEGERLITERAL)
	;

maxpartitionsOption
	: (MAXPARTITIONS INTEGERLITERAL)
	;

usingSpecification2
	: (
	USING
		((STOGROUP stogroupName stogroupOptions*)
		| (VCAT catalogName))
	)
	;

/*
Refactored these options out of usingSpecification2 per
suggestion by Martijn Rutte 2022-12-06.  More concise
processing via SonarQube.
*/
stogroupOptions
	: (
	(PRIQTY INTEGERLITERAL)
	| (SECQTY INTEGERLITERAL)
	| (ERASE (NO | YES))
	)
	;

xmlIndexSpecification
	: (
	GENERATE (KEY | KEYS) USING XMLPATTERN xmlPatternClause AS SQL sqlDataType
	)
	;

/*
An xmlPatternClause has nontrivial syntax, but for purposes of this
grammar it is simply a quoted string.  It probably warrants a grammar
of its own.
*/
xmlPatternClause
	: NONNUMERICLITERAL
	;

alterAttributesOptions
	: (
	(ADDRESS addressValue)
	| (ENCRYPTION encryptionValue)
	| (SERVAUTH servauthValue)
	| (JOBNAME jobnameValue)
	)
	;

addAttributesOptions
	: (
	(ADDRESS addressValue)
	| (SERVAUTH servauthValue)
	| (JOBNAME jobnameValue)
	)
	;

dropAttributesOptions
	: (
	(ADDRESS addressValue?)
	| (SERVAUTH servauthValue?)
	| (JOBNAME jobnameValue?)
	)
	;

includeColumnPhrase
	: (INCLUDE LPAREN columnName (COMMA columnName)* RPAREN)
	;

userClause
	: (
	(ADD USE FOR userClauseAddOptions (COMMA userClauseAddOptions)*)
	| (REPLACE USE FOR userClauseReplaceOptions (COMMA userClauseReplaceOptions)*)
	| (DROP USE FOR userClauseDropOptions (COMMA userClauseDropOptions)*)
	)
	;

userClauseAddOptions
	: (
	(authorizationName useOptions?)
	| (EXTERNAL SECURITY PROFILE profileName useOptions?)
	| (PUBLIC (WITH | WITHOUT) AUTHENTICATION)
	)
	;

userClauseReplaceOptions
	: (userClauseAddOptions)
	;

userClauseDropOptions
	: (
	(authorizationName)
	| (EXTERNAL SECURITY PROFILE profileName)
	| (PUBLIC)
	)
	;

useOptions
	: (
	(ROLE roleName)? (SECURITY LABEL seclabelName)? (WITH | WITHOUT) AUTHENTICATION
	)
	;

alterPartitionClause
	: (
	((ALTER? PARTITION) | PART) INTEGERLITERAL
		( (usingBlock)
		| (freeBlock)
		| (gbpcacheBlock)
		| compressOption
		| dssizeOption
		| trackmodClause
		)+
	)
	;

usingBlock
	: (
	usingSpecification1+
	)
	;

/*
Removed '+' modifier per suggestion by Martijn Rutte 2022-12-14
as its absence makes rule processing easier.
*/
freeBlock
	: (
	((FREEPAGE INTEGERLITERAL)
	| (PCTFREE INTEGERLITERAL)
	| (PCTFREE (INTEGERLITERAL? FOR UPDATE INTEGERLITERAL)?)
	)
	)
	;

moveTableClause
	: (
	MOVE TABLE tableName TO TABLESPACE (databaseName DOT)? tablespaceName
	)
	;

gbpcacheBlock
	: (
	GBPCACHE (CHANGED | ALL | SYSTEM | NONE)
	)
	;

aliasDesignator
	: (
	PUBLIC? ALIAS aliasName FOR (TABLE | SEQUENCE)
	)
	;

multipleColumnList
	: (
	tableName LPAREN
	columnName IS NONNUMERICLITERAL
	(COMMA columnName IS NONNUMERICLITERAL)*
	RPAREN
	)
	;

functionDesignator
	: (
	(FUNCTION functionName (LPAREN (parameterType (COMMA parameterType)*)? RPAREN)?)
	| (SPECIFIC FUNCTION specificName)
	)
	;

parameterType
	: (dataType (AS LOCATOR)?)
	;

alterTableColumnDefinitionOptionList1
	: (
	(defaultClause1)
	| (NOT NULL)
	| (columnConstraint)
	| (generatedClause)
	| implicitlyHiddenClause
	| asSecurityLabelClause
	| fieldprocClause
	| inlineLengthClause
	)
	;

/*
Changed to refer to defaultClause instead of defaultClause2
as these are identical.
*/
alterTableColumnDefinitionOptionList2
	: (
	(defaultClause)
	| (NOT NULL)
	| (columnConstraint)
	| (generatedClause)
	| implicitlyHiddenClause
	| asSecurityLabelClause
	| fieldprocClause
	| inlineLengthClause
	)
	;

columnConstraint
	: (referencesClause | checkConstraint)
	;

/*
Made...

	(asIdentityClause | asRowChangeTimestampClause)

...optional as it was not by by mistake.  Noted by Martijn Rutte 2023-01-10.
*/
generatedClause
	: (
	(GENERATED (ALWAYS | (BY DEFAULT))? (asIdentityClause | asRowChangeTimestampClause)?)
	| (GENERATED ALWAYS?
		(asRowTransactionStartIDClause 
		| asRowTransactionTimestampClause 
		| asGeneratedExpressionClause))
	)
	;

generatedClause2
	: (GENERATED (ALWAYS | (BY DEFAULT)) asIdentityClause?)
	;

asIdentityClause
	: (
	AS IDENTITY (LPAREN 
	asIdentityClauseOptionList (COMMA? asIdentityClauseOptionList)* 
	RPAREN)?
	)
	;

asIdentityClauseOptionList
	: (
	startOption
	| incrementOption
	| minvalueOption
	| maxvalueOption
	| cycleOption
	| cacheOption
	| orderOption
	)
	;

asRowChangeTimestampClause
	: (FOR EACH ROW ON UPDATE AS ROW CHANGE TIMESTAMP)
	;

asRowTransactionStartIDClause
	: (AS TRANSACTION START ID)
	;

asRowTransactionTimestampClause
	: (AS ROW (BEGIN | START | END))
	;

asGeneratedExpressionClause
	: (AS LPAREN nonDeterministicExpression RPAREN)
	;

nonDeterministicExpression
	: (
	(DATA CHANGE OPERATION)
	| specialRegister
	| nonDeterministicExpressionSessionVariable
	)
	;

nonDeterministicExpressionSessionVariable
	: (
	(SYSIBM DOT PACKAGE_NAME)
	| (SYSIBM DOT PACKAGE_SCHEMA)
	| (SYSIBM DOT PACKAGE_VERSION)
	)
	;

columnAlteration
	: (columnName columnAlterationOptionList+)
	;

columnAlterationOptionList
	: (
	(SET DATA TYPE alteredDataType (INLINE LENGTH INTEGERLITERAL)?)
	| (SET defaultClause)
	| (SET INLINE LENGTH INTEGERLITERAL)
	| (SET GENERATED (ALWAYS | (BY DEFAULT)) identityAlteration?)
	| (identityAlteration)
	| (SET GENERATED ALWAYS? (asRowTransactionTimestampClause | asRowTransactionStartIDClause))
	| (DROP DEFAULT)
	)
	;

/*
In the IBM documentation, alteredDataType differs from dataType in that
it is a proper subset thereof.  The dataType rule includes a provision 
for CCSID on CHAR, VARCHAR, CLOB, GRAPHIC, VARGRAPHIC, and DBCLOB types
which is absent from the alteredDataType rule.  For purposes of this
grammar, a difference which makes no difference is no difference.
*/
alteredDataType
	: dataType
	;

/*
The difference between dataType and castDataType is in the coding
of the CCSID and FOR ... DATA qualifiers.  Sneaky.
*/
dataType
	: (builtInType | distinctTypeName)
	;

builtInType
	: (
	SMALLINT
	| INTEGER
	| INT
	| BIGINT
	| ((DECIMAL | DEC | NUMERIC) (integerInParens | (LPAREN RPAREN))?)
	| (DECFLOAT (integerInParens | (LPAREN RPAREN))?)
	| (FLOAT (integerInParens | (LPAREN RPAREN))?)
	| REAL
	| (DOUBLE PRECISION?)
	| ((((CHARACTER | CHAR) VARYING? ) | VARCHAR) (length | (LPAREN RPAREN))? (forDataQualifier | ccsidClause2)?)
	| ((((CHARACTER | CHAR) LARGE OBJECT) | CLOB) (length | (LPAREN RPAREN))? (forDataQualifier | ccsidClause2)?)
	| ((GRAPHIC | VARGRAPHIC | DBCLOB) (length | (LPAREN RPAREN))? ccsidClause2?)
	| (BINARY (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY VARYING?) | VARBINARY) (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY LARGE OBJECT) | BLOB) length?)
	| DATE
	| TIME
	| (TIMESTAMP integerInParens? ((WITH | WITHOUT) TIME ZONE)?)
	| ROWID
	| (XML (LPAREN xmlTypeModifier RPAREN)?)
	)
	;

sequenceDataType
	: (sequenceBuiltInType | distinctTypeName)
	;

sequenceBuiltInType
	: (
	SMALLINT
	| INTEGER
	| INT
	| BIGINT
	| ((DECIMAL | DEC | NUMERIC) integerInParens?)
	)
	;

sqlDataType
	: (
	(VARCHAR LPAREN INTEGERLITERAL RPAREN)
	| (DECFLOAT (LPAREN INTEGERLITERAL RPAREN)?)
	| DATE
	| (TIMESTAMP (LPAREN INTEGERLITERAL RPAREN)?)
	)
	;

xmlTypeModifier
	: (
	XMLSCHEMA 
	xmlSchemaSpecification (ELEMENT xmlElementName)?
	(COMMA xmlSchemaSpecification (ELEMENT xmlElementName)?)*
	)
	;

xmlSchemaSpecification
	: (
	(ID registeredXmlSchemaName)
	| (((URL targetNamespace) | (NO NAMESPACE)) (LOCATION schemaLocation)?)
	)
	;

/*
Documentation is a bit sketchy on details for the following
four items.  Examples would be nice.
*/
xmlElementName
	: (identifier | literal)
	;

piName
	: (NONNUMERICLITERAL)
	;

registeredXmlSchemaName
	: (
	SYSXSR DOT sqlidentifier
	)
	;

targetNamespace
	: (NONNUMERICLITERAL)
	;

schemaLocation
	: (NONNUMERICLITERAL)
	;

identityAlteration
	: (
	(RESTART (WITH INTEGERLITERAL)?)
	| (SET incrementOption)
	| (SET minvalueOption)
	| (SET maxvalueOption)
	| (SET cycleOption)
	| (SET cacheOption)
	| (SET orderOption)
	)
	;

uniqueConstraint
	: (
	(CONSTRAINT constraintName)? 
	((PRIMARY KEY) | UNIQUE) 
	LPAREN
	columnName (COMMA columnName)* 
	(COMMA BUSINESS_TIME WITHOUT OVERLAPS)? 
	RPAREN
	)
	;

referentialConstraint
	: (
	((CONSTRAINT constraintName FOREIGN KEY) | (FOREIGN KEY constraintName?))
	LPAREN
	columnName (PERIOD BUSINESS_TIME)? (COMMA columnName (PERIOD BUSINESS_TIME)?)* 
	RPAREN
	referencesClause
	)
	;

referencesClause
	: (
	REFERENCES tableName 
	(LPAREN
	columnName (PERIOD BUSINESS_TIME)? (COMMA columnName (PERIOD BUSINESS_TIME)?)* 
	RPAREN)?
	(ON DELETE (RESTRICT | (NO ACTION) | CASCADE | (SET NULL)))? 
	(NOT? ENFORCED)?
	(ENABLE QUERY OPTIMIZATION)?	
	)
	;

checkConstraint
	: (
	(CONSTRAINT constraintName)? CHECK LPAREN checkCondition RPAREN
	)
	;

//#KMG
partitioningClause
	: (
	PARTITION BY 
		((RANGE? 
		LPAREN 
		partitionExpression (COMMA partitionExpression)* 
		RPAREN
		LPAREN
		partitioningClauseElement (COMMA partitioningClauseElement)*
		RPAREN)
		| (SIZE (EVERY INTEGERLITERAL? sqlidentifier)?))
	)
	;

/*
Made...

	(ASC | DESC)

...optional because it wasn't and it should be.  Found by Martijn Rutte 2022-01-09.
*/
partitionExpression
	: (
	columnName (NULLS LAST)? (ASC | DESC)?
	)
	;

/*
Changed...

	(INTEGERLITERAL | MAXVALUE | MINVALUE)

...to...

	(literal | MAXVALUE | MINVALUE)

...because the literal must match the data type of the column
it references.  Found by Martijn Rutte 2022-01-09.
*/
partitionLimitKey
	: (literal | MAXVALUE | MINVALUE)
	;

/*
The partitionHashSpace rule can be before the INCLUSIVE token in
the create table statement, or after the INCLUSIVE token in the
alter table statement.  Also, it's deprecated as of Db2 12.
*/
partitioningPhrase
	: (ENDING AT? LPAREN partitionLimitKey (COMMA partitionLimitKey)* RPAREN partitionHashSpace? INCLUSIVE? partitionHashSpace?)
	;

//deprecated as of Db2 12
//#KMG
partitionHashSpace
	: (HASH SPACE INTEGERLITERAL? sqlidentifier)
	//{notifyErrorListeners("HASH SPACEs are deprecated as of DB2 12");}
	;

//deprecated as of Db2 12
//#KMG
alterHashOrganization
	: (
	(ADD ORGANIZE BY HASH UNIQUE LPAREN columnName (COMMA columnName)* RPAREN HASH SPACE INTEGERLITERAL? sqlidentifier)
	| (ALTER ORGANIZATION SET HASH SPACE INTEGERLITERAL? sqlidentifier)
	)
	//{notifyErrorListeners("HASH SPACEs are deprecated as of DB2 12");}
	;

partitioningClauseElement
	: (
	PARTITION INTEGERLITERAL partitioningPhrase
	)
	;

partitionClause
	: (
	partitioningPhrase | partitionHashSpace
	)
	;

rotatePartitionClause
	: (partitioningPhrase RESET)
	;

extraRowOption
	: (ON DELETE ADD EXTRA ROW)
	;

materializedQueryDefinition
	: (
	LPAREN fullSelect RPAREN refreshableTableOptions
	)
	;

materializedQueryAlteration
	: (SET refreshableTableOptionsList+)
	;

refreshableTableOptions
	: (dataInitiallyDeferredPhrase refreshDeferredPhrase refreshableTableOptionsList*)
	;

dataInitiallyDeferredPhrase
	: (DATA INITIALLY DEFERRED)
	;

refreshDeferredPhrase
	: (REFRESH DEFERRED)
	;

refreshableTableOptionsList
	: (
	(MAINTAINED BY (SYSTEM | USER))
	| (enableDisableOption QUERY OPTIMIZATION)
	)
	;

materializedQueryTableAlteration
	: (SET refreshableTableOptionsList+)
	;

/*
Made (EXCLUSIVE | INCLUSIVE) optional as per documentation.  Noted
by Martijn Rutte 2023-05-23.
*/
periodDefinition
	: (
	PERIOD FOR?
	((SYSTEM_TIME LPAREN beginColumnName COMMA endColumnName RPAREN)
	| (BUSINESS_TIME LPAREN beginColumnName COMMA endColumnName (EXCLUSIVE | INCLUSIVE)? RPAREN))
	)
	;

alterTableColumnDefinition
	: (
	(columnName builtInType alterTableColumnDefinitionOptionList1*)
	| (columnName distinctTypeName alterTableColumnDefinitionOptionList2*)
	)
	;

externalProgramName
	: (identifier | NONNUMERICLITERAL)
	;

packagePath
	: (
	collectionID
	| SESSION_USER
	| USER
	| (CURRENT PACKAGE PATH)
	| (CURRENT PATH)
	| hostVariable
	| NONNUMERICLITERAL
	)
	;

collectionID
	: identifier
	;

runTimeOptions
	: NONNUMERICLITERAL
	;

comparisonOperator
	: (EQ | GT | LT | GE | LE | NE)
	;

operator
	: (SPLAT | PLUS | MINUS | SLASH | CONCAT | CONCATOP)
	;

/*
Note that arrayConstructor must precede arrayElementSpecification
in the expression rule.  Otherwise the former is mistaken for
the latter.

Note that sequenceReference must precede columnName in the expression
rule.  Otherwise the former is mistaken for the latter.

Made expression optional in ((operator | INTEGERLITERAL) expression?)
per Martijn Rutte 2023-05-23.  This allows for...

  SET C1 = SUBSTR(C2,LENGTH(C2)-1);

...due to the -1 being output from the lexer as one token (INTEGERLITERAL)
instead of two (operator INTEGERLITERAL).
*/
expression
	: (
	functionInvocation
	| LPAREN expression RPAREN
	| labeledDuration
	| literal
	| specialRegister
	| sequenceReference
	| columnName
	| hostVariable
	| scalarFullSelect
	| timeZoneSpecificExpression
	| caseExpression
	| castSpecification
	| xmlCastSpecification
	| xmlParseSpecification
	| arrayConstructor
	| arrayElementSpecification
	| olapSpecification
	| rowChangeExpression
	| ((operator | INTEGERLITERAL) expression)
	| ((functionInvocation
		| LPAREN expression RPAREN
		| labeledDuration
		| literal
		| specialRegister
		| columnName
		| hostVariable
		| scalarFullSelect
		| timeZoneSpecificExpression
		| caseExpression
		| castSpecification
		| xmlCastSpecification
		| xmlParseSpecification
		| arrayElementSpecification
		| arrayConstructor
		| olapSpecification
		| rowChangeExpression
		| sequenceReference)
		((operator | INTEGERLITERAL) expression?)*)
	)
	;

keyExpression
	: (expression)
	;

rowChangeExpression
	: ROW CHANGE (TIMESTAMP | TOKEN) FOR tableName
	;

/*
Alternate syntax added per Michel A. G. Poppema 2023-05-23.
*/
sequenceReference
	: ((((NEXT | PREVIOUS) VALUE) | NEXTVAL | PREVVAL) FOR sequenceName)
	| (sequenceName DOT (NEXTVAL | CURRVAL))
	;

functionInvocation
	: (
	scalarFunctionInvocation
	| aggregateFunctionInvocation
	| regressionFunctionInvocation
	| externalFunctionInvocation
	)
	;

scalarFunctionInvocation
	: (
	xmlattributesFunction
	| xmlelementFunction
	| xmlforestFunction
	| xmlmodifyFunction
	| xmlnamespaceFunction
	| xmlpiFunction
	| xmlqueryFunction
	| xmlserializeFunction
	| aiAnalogyFunction
	| aiSemanticClusterFunction
	| aiSimilarityFunction
	| extractFunction
	| ((schemaName DOT)? scalarFunction LPAREN (expression (COMMA expression)*)? RPAREN (AS NONNUMERICLITERAL)?)
	)
	;

/*
Extract function added per Martijn Rutte 2023-05-23.
*/
extractFunction
	: (
	EXTRACT LPAREN 
	(datePrefix | timePrefix | timezonePrefix)
	FROM 
	expression
	RPAREN
	)
	;

datePrefix
	: (
	YEAR
	| MONTH
	| DAY
	)
	;

timePrefix
	: (
	HOUR
	| MINUTE
	| SECOND
	)
	;

timezonePrefix
	: (
	HOUR
	| MINUTE
	| SECOND
	| TIMEZONE_HOUR
	| TIMEZONE_MINUTE
	)
	;

/*
That DISTINCT should be (ALL | DISTINCT) noted on 2023-06-05.
*/
aggregateFunctionInvocation
	: (
	arrayaggFunction
	| correlationFunction
	| covarianceFunction
	| covarianceSampFunction
	| cumeDistFunction
	| listaggFunction
	| percentileContFunction
	| percentileDiscFunction
	| percentRankFunction
	| xmlaggFunction
	| ((schemaName DOT)? aggregateFunction LPAREN (ALL | DISTINCT)? (expression | SPLAT) RPAREN)
	)
	;

regressionFunctionInvocation
	: ((schemaName DOT)? regressionFunction
	LPAREN
	expression COMMA expression
	RPAREN)
	;

/*
Function arguments made optional per observation by Martijn Rutte 2023-06-05.
*/
externalFunctionInvocation
	: ((schemaName DOT)? sqlidentifier
	LPAREN
	(expression (COMMA expression)*)?
	RPAREN)
	;

labeledDuration
	: (
	(functionInvocation
	| (LPAREN expression RPAREN)
	| INTEGERLITERAL
	| columnName
	| variable)
	durationSuffix
	)
	;

durationSuffix
	: (
	YEAR
	| YEARS
	| MONTH
	| MONTHS
	| DAY
	| DAYS
	| HOUR
	| HOURS
	| MINUTE
	| MINUTES
	| SECOND
	| SECONDS
	| MICROSECOND
	| MICROSECONDS
	)
	;

/*
Corrected to add LPAREN and RPAREN per Martijn Rutte's discovery
that XMLCAST invocations did not parse correctly.  2023-01-24
*/
xmlCastSpecification
	: XMLCAST LPAREN (expression | NULL | parameterMarker) AS dataType RPAREN
	;

xmlParseSpecification
	: XMLPARSE LPAREN DOCUMENT expression ((STRIP | PRESERVE) WHITESPACE)? RPAREN
	;

arrayElementSpecification
	: arrayExpression OPENSQBRACKET arrayIndex CLOSESQBRACKET
	;

arrayIndex
	: expression (operator? expression)*
	;

arrayConstructor
	: ARRAY
	OPENSQBRACKET
	(
	QUESTIONMARK
	| fullSelect
	| ((expression | NULL) (COMMA (expression | NULL))*)
	)
	CLOSESQBRACKET
	;
	
olapSpecification
	: orderedOlapSpecification
	| numberingSpecification
	| aggregationSpecification
	;

orderedOlapSpecification
	: olapSpecificationFunction
	OVER LPAREN windowPartitionClause? windowOrderClause RPAREN
	;

olapSpecificationFunction
	: (
	(CUME_DIST LPAREN RPAREN)
	| (PERCENT_RANK LPAREN RPAREN)
	| (RANK LPAREN RPAREN)
	| (DENSE_RANK LPAREN RPAREN)
	| (NTILE LPAREN expression RPAREN)
	| lagFunction
	| leadFunction
	)
	;

lagFunction
	: LAG LPAREN expression 
	(
	COMMA INTEGERLITERAL 
		(COMMA expression 
			(COMMA ((RESPECT NULLS) | (IGNORE NULLS)))?)? RPAREN
	)
	;

leadFunction
	: LEAD LPAREN expression 
	(
	COMMA INTEGERLITERAL 
		(COMMA expression 
			(COMMA respectNullsClause)?)? RPAREN
	)
	;

respectNullsClause
	: ((RESPECT NULLS) | (IGNORE NULLS))
	;

windowPartitionClause
	: (PARTITION BY expression (COMMA expression)*)
	;

windowOrderClause
	: ORDER BY expression windowOrderClauseQualifier? (COMMA expression windowOrderClauseQualifier?)*
	;

windowOrderClauseQualifier
	: (ASC | DESC) (NULLS (FIRST | LAST))?
	;

numberingSpecification
	: ROW_NUMBER LPAREN RPAREN OVER LPAREN windowPartitionClause? windowOrderClause? RPAREN
	;

aggregationSpecification
	: (aggregateFunctionInvocation | olapColumnFunction) OVER LPAREN windowPartitionClause?
	((RANGE BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING)
	| (windowOrderClause ((RANGE BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) | windowAggregationGroupClause)?))?
	RPAREN
	;

aggregateFunction
	: (
	ARRAY_AGG
	| AVG
	| CORR
	| CORRELATION
	| COUNT
	| COUNT_BIG
	| COVAR_POP
	| COVARIANCE
	| COVAR
	| COVAR_SAMP
	| COVARIANCE_SAMP
	| CUME_DIST
	| GROUPING
	| LISTAGG
	| MAX
	| MEDIAN
	| MIN
	| PERCENTILE_CONT
	| PERCENTILE_DISC
	| PERCENT_RANK
	| STDDEV_POP
	| STDDEV
	| STDDEV_SAMP
	| SUM
	| VAR_POP
	| VARIANCE
	| VAR
	| VAR_SAMP
	| VARIANCE_SAMP
	| XMLAGG
	)
	;

regressionFunction
	: (
	REGR_AVGX
	| REGR_AVGY
	| REGR_COUNT
	| REGR_INTERCEPT
	| REGR_ICPT
	| REGR_R2
	| REGR_SLOPE
	| REGR_SXX
	| REGR_SXY
	| REGR_SYY
	)
	;

olapColumnFunction
	: (
	firstValueFunction
	| lastValueFunction
	| nthValueFunction
	| ratioToReportFunction
	)
	;

firstValueFunction
	: (FIRST_VALUE LPAREN expression (COMMA respectNullsClause)? RPAREN)
	;

lastValueFunction
	: (LAST_VALUE LPAREN expression (COMMA respectNullsClause)? RPAREN)
	;

nthValueFunction
	: (NTH_VALUE LPAREN expression COMMA INTEGERLITERAL RPAREN)
	;

ratioToReportFunction
	: (RATIO_TO_REPORT LPAREN expression RPAREN)
	;

listaggFunction
	: (
	LISTAGG LPAREN (ALL | DISTINCT)? expression (COMMA NONNUMERICLITERAL)? RPAREN
	(WITHIN GROUP LPAREN 
		ORDER BY sortKey (ASC | DESC)? (COMMA sortKey (ASC | DESC)?)* 
	RPAREN)?
	)
	;

arrayaggFunction
	: (arrayaggOrdinaryFunction | arrayaggAssociativeFunction)
	;

arrayaggOrdinaryFunction
	: (
	ARRAY_AGG LPAREN expression
	(ORDER BY sortKey (ASC | DESC)? (COMMA sortKey (ASC | DESC)?)*)?
	RPAREN
	)
	;

arrayaggAssociativeFunction
	: (
	ARRAY_AGG LPAREN expression (COMMA expression)? RPAREN
	)
	;

correlationFunction
	: ((CORR | CORRELATION) LPAREN expression COMMA expression RPAREN)
	;

covarianceFunction
	: ((COVAR_POP | COVARIANCE | COVAR) LPAREN expression COMMA expression RPAREN)
	;

covarianceSampFunction
	: ((COVAR_SAMP | COVARIANCE_SAMP) LPAREN expression COMMA expression RPAREN)
	;

cumeDistFunction
	: (
	CUME_DIST LPAREN
	expression (COMMA expression)*
	RPAREN 
	WITHIN GROUP LPAREN aggregateOrderByClause RPAREN
	)
	;

percentileContFunction
	: (
	PERCENTILE_CONT LPAREN expression RPAREN
	WITHIN GROUP LPAREN ORDER BY expression (ASC | DESC)? RPAREN
	)
	;

percentileDiscFunction
	: (
	PERCENTILE_DISC LPAREN expression RPAREN
	WITHIN GROUP LPAREN ORDER BY expression (ASC | DESC)? RPAREN
	)
	;

percentRankFunction
	: (
	PERCENT_RANK LPAREN
	expression (COMMA expression)*
	RPAREN 
	WITHIN GROUP LPAREN aggregateOrderByClause RPAREN
	)
	;

xmlaggFunction
	: (XMLAGG LPAREN expression xmlaggOrderByClause? RPAREN)
	;

xmlaggOrderByClause
	: (ORDER BY xmlaggOrderByOption (COMMA xmlaggOrderByOption)*)
	;

xmlaggOrderByOption
	: (expression (ASC | DESC)?)
	;

aggregateOrderByClause
	: (ORDER BY aggregateOrderByOption (COMMA aggregateOrderByOption)*)
	;

aggregateOrderByOption
	: (sortKey (ASC | DESC)? (NULLS (LAST | FIRST))?)
	;

windowAggregationGroupClause
	: (ROWS | RANGE) (groupStart | groupBetween | groupEnd)
	;

groupStart
	: (unboundedPreceding | boundedPreceding | currentRow)
	;

groupBetween
	: BETWEEN groupBound1 AND groupBound2
	;

groupEnd
	: (unboundedFollowing | boundedFollowing)
	;

groupBound1
	: (unboundedPreceding | boundedPreceding | boundedFollowing | currentRow)
	;

groupBound2
	: (unboundedFollowing | boundedPreceding | boundedFollowing | currentRow)
	;

unboundedPreceding
	: UNBOUNDED PRECEDING
	;

unboundedFollowing
	: UNBOUNDED FOLLOWING
	;

boundedPreceding
	: INTEGERLITERAL PRECEDING
	;

boundedFollowing
	: INTEGERLITERAL FOLLOWING
	;

currentRow
	: CURRENT ROW
	;

/*
Added MAX and MIN 2023-06-05
*/
scalarFunction
	: (
	ABS
	| ABSVAL
	| ACOS
	| ADD_DAYS
	| ADD_MONTHS
	| AI_ANALOGY
	| AI_SEMANTIC_CLUSTER
	| AI_SIMILARITY
	| ARRAY_DELETE
	| ARRAY_FIRST
	| ARRAY_LAST
	| ARRAY_NEXT
	| ARRAY_PRIOR
	| ARRAY_TRIM
	| ASCII
	| ASCII_CHR
	| ASCIISTR
	| ASCII_STR
	| ASIN
	| ATAN
	| ATAN2
	| ATANH
	| BIGINT
	| BINARY
	| BITAND
	| BITANDNOT
	| BITNOT
	| BITOR
	| BITXOR
	| BLOB
	| BTRIM
	| CARDINALITY
	| CCSID_ENCODING
	| CEIL
	| CEILING
	| CHAR
	| CHAR9
	| CHARACTER_LENGTH
	| CHAR_LENGTH
	| CHR
	| CLOB
	| COALESCE
	| COLLATION_KEY
	| COMPARE_DECFLOAT
	| CONCAT
	| CONTAINS
	| COS
	| COSH
	| DATE
	| DAY
	| DAYOFMONTH
	| DAYOFWEEK
	| DAYOFWEEK_ISO
	| DAYOFYEAR
	| DAYS
	| DAYS_BETWEEN
	| DBCLOB
	| DEC
	| DECFLOAT
	| DECFLOAT_FORMAT
	| DECFLOAT_SORTKEY
	| DECIMAL
	| DECODE
	| DECRYPT_BINARY
	| DECRYPT_BIT
	| DECRYPT_CHAR
	| DECRYPT_DATAKEY_BIGINT
	| DECRYPT_DATAKEY_BIT
	| DECRYPT_DATAKEY_CLOB
	| DECRYPT_DATAKEY_DBCLOB
	| DECRYPT_DATAKEY_DECIMAL
	| DECRYPT_DATAKEY_INTEGER
	| DECRYPT_DATAKEY_VARCHAR
	| DECRYPT_DATAKEY_VARGRAPHIC
	| DECRYPT_DB
	| DEGREES
	| DIFFERENCE
	| DIGITS
	| DOUBLE
	| DOUBLE_PRECISION
	| DSN_XMLVALIDATE
	| EBCDIC_CHR
	| EBCDIC_STR
	| ENCRYPT_DATAKEY
	| ENCRYPT_TDES
	| EXP
	| EXTRACT
	| FLOAT
	| FLOOR
	| GENERATE_UNIQUE
	| GENERATE_UNIQUE_BINARY
	| GETHINT
	| GETVARIABLE
	| GRAPHIC
	| GREATEST
	| HASH
	| HASH_CRC32
	| HASH_MD5
	| HASH_SHA1
	| HASH_SHA256
	| HEX
	| HOUR
	| IDENTITY_VAL_LOCAL
	| IFNULL
	| INSERT
	| INSTR
	| INT
	| INTEGER
	| JULIAN_DAY
	| LAST_DAY
	| LCASE
	| LEAST
	| LEFT
	| LENGTH
	| LN
	| LOCATE
	| LOCATE_IN_STRING
	| LOG10
	| LOWER
	| LPAD
	| LTRIM
	| MAX
	| MAX_CARDINALITY
	| MICROSECOND
	| MIDNIGHT_SECONDS
	| MIN
	| MINUTE
	| MOD
	| MONTH
	| MONTHS_BETWEEN
	| MQREAD
	| MQREADCLOB
	| MQRECEIVE
	| MQRECEIVECLOB
	| MQSEND
	| MULTIPLY_ALT
	| NEXT_DAY
	| NEXT_MONTH
	| NORMALIZE_DECFLOAT
	| NORMALIZE_STRING
	| NULLIF
	| NVL
	| OVERLAY
	| PACK
	| POSITION
	| POSSTR
	| POW
	| POWER
	| QUANTIZE
	| QUARTER
	| RADIANS
	| RAISE_ERROR
	| RAND
	| RANDOM
	| REAL
	| REGEXP_COUNT
	| REGEXP_INSTR
	| REGEXP_LIKE
	| REGEXP_REPLACE
	| REGEXP_SUBSTR
	| REPEAT
	| REPLACE
	| RID
	| RIGHT
	| ROUND
	| ROUND_TIMESTAMP
	| ROWID
	| RPAD
	| RTRIM
	| SCORE
	| SECOND
	| SIGN
	| SIN
	| SINH
	| SMALLINT
	| SOAPHTTPC
	| SOAPHTTPNC
	| SOAPHTTPNV
	| SOAPHTTPV
	| SOUNDEX
	| SPACE
	| SQRT
	| STRIP
	| STRLEFT
	| STRPOS
	| STRRIGHT
	| SUBSTR
	| SUBSTRING
	| TAN
	| TANH
	| TIME
	| TIMESTAMP
	| TIMESTAMPADD
	| TIMESTAMPDIFF
	| TIMESTAMP_FORMAT
	| TIMESTAMP_ISO
	| TIMESTAMP_TZ
	| TO_CHAR
	| TO_CLOB
	| TO_DATE
	| TO_NUMBER
	| TOTALORDER
	| TO_TIMESTAMP
	| TRANSLATE
	| TRIM
	| TRIM_ARRAY
	| TRUNC
	| TRUNCATE
	| TRUNC_TIMESTAMP
	| UCASE
	| UNICODE
	| UNICODE_STR
	| UNISTR
	| UPPER
	| VALUE
	| VARBINARY
	| VARCHAR
	| VARCHAR9
	| VARCHAR_BIT_FORMAT
	| VARCHAR_FORMAT
	| VARGRAPHIC
	| VERIFY_GROUP_FOR_USER
	| VERIFY_ROLE_FOR_USER
	| VERIFY_TRUSTED_CONTEXT_ROLE_FOR_USER
	| WEEK
	| WEEK_ISO
	| WRAP
	| XMLATTRIBUTES
	| XMLCOMMENT
	| XMLCONCAT
	| XMLDOCUMENT
	| XMLELEMENT
	| XMLFOREST
	| XMLMODIFY
	| XMLNAMESPACES
	| XMLPARSE
	| XMLPI
	| XMLQUERY
	| XMLSERIALIZE
	| XMLTEXT
	| XMLXSROBJECTID
	| XSLTRANSFORM
	| YEAR
	)
	;

tableFunction
	: (
	ADMIN_TASK_LIST
	| ADMIN_TASK_OUTPUT
	| ADMIN_TASK_STATUS
	| BLOCKING_THREADS
	| MQREADALL
	| MQREADALLCLOB
	| MQRECEIVEALL
	| MQRECEIVEALLCLOB
	| XMLTABLE
	)
	;
	
specialRegister
	: (
	CURRENT_ACCELERATOR
	| CURRENT_APPLICATION_COMPATIBILITY
	| CURRENT_APPLICATION_ENCODING_SCHEME
	| CURRENT_CLIENT_ACCTNG
	| CURRENT_CLIENT_APPLNAME
	| CURRENT_CLIENT_CORR_TOKEN
	| CURRENT_CLIENT_USERID
	| CURRENT_CLIENT_WRKSTNNAME
	| CURRENT_DATE
	| CURRENT_DEBUG_MODE
	| CURRENT_DECFLOAT_ROUNDING_MODE
	| CURRENT_DEGREE
	| CURRENT_EXPLAIN_MODE
	| CURRENT_GET_ACCEL_ARCHIVE
	| CURRENT_LOCALE_LC_CTYPE
	| CURRENT_MAINTAINED_TABLE_TYPES_FOR_OPTIMIZATION
	| CURRENT_MEMBER
	| CURRENT_OPTIMIZATION_HINT
	| CURRENT_PACKAGE_PATH
	| CURRENT_PACKAGESET
	| CURRENT_PATH
	| CURRENT_PRECISION
	| CURRENT_QUERY_ACCELERATION
	| CURRENT_QUERY_ACCELERATION_WAITFORDATA
	| CURRENT_REFRESH_AGE
	| CURRENT_ROUTINE_VERSION
	| CURRENT_RULES
	| CURRENT_SCHEMA
	| CURRENT_SERVER
	| CURRENT_SQLID
	| CURRENT_TEMPORAL_BUSINESS_TIME
	| CURRENT_TEMPORAL_SYSTEM_TIME
	| CURRENT_TIME
	| CURRENT_TIMESTAMP
	| CURRENT_TIME_ZONE
	| ENCRYPTION_PASSWORD
	| SESSION_TIME_ZONE
	| SESSION_USER
	| USER
	)
	;

aiAnalogyFunction
	: (
	AI_ANALOGY LPAREN
	aiAnalogyFunctionSource1 COMMA
	aiAnalogyFunctionTarget1 COMMA
	aiAnalogyFunctionSource2 COMMA
	aiAnalogyFunctionTarget2 
	RPAREN
	)
	;

aiFunctionExpression
	: (expression (USING (MODEL COLUMN)? columnName)?)
	;

aiAnalogyFunctionSource
	: aiFunctionExpression
	;

aiAnalogyFunctionTarget
	: aiFunctionExpression
	;

aiAnalogyFunctionSource1
	: aiAnalogyFunctionSource
	;

aiAnalogyFunctionSource2
	: aiAnalogyFunctionSource
	;

aiAnalogyFunctionTarget1
	: aiAnalogyFunctionTarget
	;

aiAnalogyFunctionTarget2
	: aiAnalogyFunctionTarget
	;

aiSemanticClusterFunction
	: (
	AI_SEMANTIC_CLUSTER LPAREN
	aiSemanticClusterMemberExpression COMMA
	aiSemanticClusterClusteringExpression
	(COMMA aiSemanticClusterClusteringExpression)*
	RPAREN
	)
	;

aiSemanticClusterMemberExpression
	: aiFunctionExpression
	;

aiSemanticClusterClusteringExpression
	: expression
	;

aiSimilarityFunction
	: (
	AI_SIMILARITY LPAREN
	aiSimilarityExpression1 COMMA
	aiSimilarityExpression2
	RPAREN
	)
	;

aiSimilarityExpression
	: aiFunctionExpression
	;

aiSimilarityExpression1
	: aiSimilarityExpression
	;

aiSimilarityExpression2
	: aiSimilarityExpression
	;

xmlelementFunction
	: (
	XMLELEMENT LPAREN NAME xmlElementName
	(COMMA xmlnamespacesDeclaration)?
	(COMMA xmlattributesFunction)?
	(COMMA expression)*
	xmlFunctionOptionClause?
	RPAREN
	)
	;

xmlforestFunction
	: (
	XMLFOREST LPAREN xmlnamespaceFunction?
	elementContentExpression (AS xmlElementName)?
	(COMMA elementContentExpression (AS xmlElementName)?)*
	xmlFunctionOptionClause?
	RPAREN
	)
	;

xmlmodifyFunction
	: (
	XMLMODIFY LPAREN expression
	(COMMA expression AS (NONNUMERICLITERAL | identifier))*
	RPAREN
	)
	;

xmlpiFunction
	: (
	XMLPI LPAREN NAME piName (COMMA expression)? RPAREN
	)
	;

xmlqueryFunction
	: (
	XMLQUERY LPAREN xqueryExpressionConstant
	(PASSING (BY REF)? xqueryArgument (COMMA xqueryArgument)*)?
	(RETURNING SEQUENCE (BY REF)?)? (EMPTY ON EMPTY)?
	RPAREN
	)
	;

xmlattributesFunction
	: (
	XMLATTRIBUTES LPAREN 
	expression AS NONNUMERICLITERAL (COMMA expression AS NONNUMERICLITERAL)*
	RPAREN
	)
	;

xmlserializeFunction
	: (
	XMLSERIALIZE LPAREN CONTENT? expression AS dataType
	xmlserializeFunctionOptions*
	RPAREN
	)
	;

xmlnamespaceFunction
	: (
	XMLNAMESPACES LPAREN xmlnamespaceOption (COMMA xmlnamespaceOption)* RPAREN
	)
	;

xmlnamespaceOption
	: (
	(namespaceUri AS namespacePrefix)
	| (DEFAULT namespaceUri)
	| (NO DEFAULT)
	)
	;

xmlserializeFunctionOptions
	: (
	(VERSION NONNUMERICLITERAL)
	| ((EXCLUDING | INCLUDING) XMLDECLARATION)
	)
	;

xmlFunctionOptionClause
	: (
	OPTION xmlFunctionOption+
	)
	;

xmlFunctionOption
	: (
	((EMPTY | NULL) ON NULL)
	| (XMLBINARY USING? (BASE64 | HEX))
	)
	;

elementContentExpression
	: (expression)
	;

xqueryExpressionConstant
	: (NONNUMERICLITERAL)
	;

xqueryArgument
	: (xqueryContextItemExpression | (xqueryVariableExpression AS (identifier | NONNUMERICLITERAL)))
	;

/*
Added SQL? before COLUMNS per Martijn Rutte 2023-06-12.  This isn't in
the IBM documentation for the XMLTABLE function, but if DB2z accepts
it, we add it here.
*/
xmltableFunctionSpecification
	: (
	XMLTABLE
	LPAREN
	(xmlnamespacesDeclaration COMMA)?
	rowXqueryExpressionConstant
	(PASSING (BY REF)? rowXqueryArgument (COMMA rowXqueryArgument)*)?
	(SQL? COLUMNS (xmlTableRegularColumnDefinition | xmlTableOrdinalityColumnDefinition)
		(COMMA (xmlTableRegularColumnDefinition | xmlTableOrdinalityColumnDefinition))*)?
	RPAREN
	)
	;

rowXqueryExpressionConstant
	: (NONNUMERICLITERAL)
	;

rowXqueryArgument
	: (
	(xqueryContextItemExpression | (xqueryVariableExpression AS (identifier | NONNUMERICLITERAL)))
	)
	;

xqueryContextItemExpression
	: (expression)
	;

xqueryVariableExpression
	: (expression)
	;

/*
Changed optionality of (defaultClause | (PATH columnXqueryExpressionConstant))
from ? to * because you can have one, the other, both, or neither.  IBM
documentation says you can have one, the other, or neither.  If DB2z accepts
it we put it here.
*/
xmlTableRegularColumnDefinition
	: (
	columnName
	dataType
	(defaultClause | (PATH columnXqueryExpressionConstant))*
	)
	;

/*
Made...

	(defaultClauseAllowables
	| (distinctTypeCastFunctionName LPAREN defaultClauseAllowables RPAREN))

...optional because it wasn't by my mistake.  Noted by Martijn Rutte 2023-01-09.

TODO: It's possible the second half, with distinctTypeCastFunctionName, is
simply not necessary given the addition of scalarFunctionInvocation to
defaultClauseAllowables.
*/
defaultClause
	: (
	WITH? DEFAULT
	(defaultClauseAllowables
	| (distinctTypeCastFunctionName LPAREN defaultClauseAllowables RPAREN))?
	)
	;

defaultClause1
	: (
	WITH? DEFAULT defaultClauseAllowables?
	)
	;

/*
Added scalarFunctionInvocation to allow what IBM documentation refers to
as cast-function-name.  Need noted by Martijn Rutte 2023-06-05.
*/
defaultClauseAllowables
	: (
	literal
	| SESSION_USER
	| USER
	| CURRENT_SQLID
	| NULL
	| scalarFunctionInvocation
	)
	;

distinctTypeCastFunctionName
	: (identifier DOT identifier)
	;

/*
castFunction
	: (
	castSpecification
	| scalarFunctionInvocation
	| charFunctionSpecification
	| clobFunctionSpecification
	| dbclobFunctionSpecification
	| graphicFunctionSpecification1
	| graphicFunctionSpecification2
	| vargraphicFunctionSpecification1
	| vargraphicFunctionSpecification2
	)
	;

expressionAndCodeUnitsArguments
	: (
	expression 
	(COMMA INTEGERLITERAL (COMMA (CODEUNITS16 | CODEUNITS32 | OCTETS))?)?
	)
	;

clobFunctionSpecification
	: (
	CLOB
	LPAREN
	expressionAndCodeUnitsArguments
	RPAREN
	)
	;

dbclobFunctionSpecification
	: (
	DBCLOB
	LPAREN
	expressionAndCodeUnitsArguments
	RPAREN
	)
	;

graphicFunctionSpecification1
	: (
	GRAPHIC
	LPAREN
	expressionAndCodeUnitsArguments
	RPAREN
	)
	;

graphicFunctionSpecification2
	: (
	GRAPHIC
	LPAREN
	expression 
	NONNUMERICLITERAL?
	RPAREN
	)
	;

vargraphicFunctionSpecification1
	: (
	GRAPHIC
	LPAREN
	expressionAndCodeUnitsArguments
	RPAREN
	)
	;

vargraphicFunctionSpecification2
	: (
	GRAPHIC
	LPAREN
	expression 
	NONNUMERICLITERAL?
	RPAREN
	)
	;
*/

columnXqueryExpressionConstant
	: (NONNUMERICLITERAL)
	;

xmlTableOrdinalityColumnDefinition
	: (columnName FOR ORDINALITY)
	;

xmlnamespacesDeclaration
	: (
	xmlnamespacesFunctionSpecification
	(COMMA xmlnamespacesFunctionSpecification)*
	)
	;

xmlnamespacesFunctionSpecification
	: (
	XMLNAMESPACES
	LPAREN
	xmlnamespacesFunctionArguments
	(COMMA xmlnamespacesFunctionArguments)*
	RPAREN
	)
	;

xmlnamespacesFunctionArguments
	: (
	((namespaceUri AS namespacePrefix)
	| (DEFAULT namespaceUri)
	| (NO DEFAULT))
	)
	;

namespaceUri
	: NONNUMERICLITERAL
	;

namespacePrefix
	: NONNUMERICLITERAL
	;

/*
Added integerInParens? and | ((WITH | WITHOUT) TIME ZONE) per
Martijn Rutte 2023-05-23.
*/
timeZoneSpecificExpression
	: timeZoneExpressionSubset
	integerInParens?
	((AT LOCAL) | (AT TIME ZONE timeZoneExpressionSubset) | ((WITH | WITHOUT) TIME ZONE))
	;

/*
Added (LPAREN expression RPAREN) per documentation. 2023-05-23
*/
timeZoneExpressionSubset
	: (
	functionInvocation
	| literal
	| columnName
	| hostVariable
	| specialRegister
	| scalarFullSelect
	| caseExpression
	| castSpecification
	| (LPAREN expression RPAREN)
	)
	;

/*
END changed to (END | END_CASE) per Martijn Rutte 2023-06-05.
*/
caseExpression
	: CASE
	(searchedWhenClause+ | simpleWhenClause)
	((ELSE NULL) | (ELSE resultExpression))?
	(END | END_CASE)
	;

resultExpression
	: expression
	;

searchedWhenClause
	: (
	WHEN searchCondition THEN (resultExpression | NULL)
	)
	;

simpleWhenClause
	: (
	expression
	(WHEN expression THEN (resultExpression | NULL))+
	)
	;

searchCondition
	: NOT?
	((predicate (SELECTIVITY NUMERICLITERAL)?) | (LPAREN searchCondition RPAREN))
	((AND | OR) NOT? (predicate | (LPAREN searchCondition RPAREN)))*
	;

checkCondition
	: (searchCondition)
	;

predicate
	: basicPredicate
	| quantifiedPredicate
	| arrayExistsPredicate
	| betweenPredicate
	| distinctPredicate
	| existsPredicate
	| inPredicate
	| likePredicate
	| nullPredicate
	| xmlExistsPredicate
	;

basicPredicate
	: ((expression comparisonOperator expression)
	| (rowValueExpression comparisonOperator rowValueExpression))
	;

rowValueExpression
	: LPAREN expression
	(COMMA expression)*
	RPAREN
	;

quantifiedPredicate
	: ((expression comparisonOperator (SOME | ANY | ALL) LPAREN fullSelect RPAREN)
	| (rowValueExpression EQ (SOME | ANY) LPAREN fullSelect RPAREN)
	| (rowValueExpression NE ALL LPAREN fullSelect RPAREN))
	;

arrayExistsPredicate
	: ARRAY_EXISTS
	LPAREN
	arrayExpression
	INTEGERLITERAL
	RPAREN
	;

betweenPredicate
	: expression NOT? BETWEEN expression AND expression
	;

distinctPredicate
	: expression IS NOT? DISTINCT FROM expression
	;

existsPredicate
	: EXISTS LPAREN fullSelect RPAREN
	;

inPredicate
	: expression NOT? IN (
	(LPAREN fullSelect RPAREN)
	| (LPAREN expression (COMMA expression)* RPAREN)
	)
	;

likePredicate
	: expression NOT? LIKE expression (ESCAPE expression)?
	;

nullPredicate
	: expression ((IS NOT? NULL) | ISNULL | NOTNULL)
	;

xmlExistsPredicate
	: XMLEXISTS
	LPAREN
	NONNUMERICLITERAL
	(PASSING (BY REF)? expression (COMMA expression)*)?
	RPAREN
	;

arrayExpression
	: variable
	| castSpecification
	;

castSpecification
	: CAST
	LPAREN
	(expression | NULL | parameterMarker)
	AS
	castDataType
	RPAREN
	;

parameterMarker
	: QUESTIONMARK
	;

castDataType
	: (
	castBuiltInType
	| distinctTypeName
	| arrayType
	)
	;

/*
Modified to allow forDataQualifier on its own per Martijn Rutte 2023-05-24.
*/
castBuiltInType
	: (
	SMALLINT
	| INTEGER
	| INT
	| BIGINT
	| ((DECIMAL | DEC | NUMERIC) (integerInParens | (LPAREN RPAREN)))
	| (DECFLOAT (integerInParens | (LPAREN RPAREN)))
	| (FLOAT (integerInParens | (LPAREN RPAREN)))
	| REAL
	| (DOUBLE PRECISION?)
	| ((((CHARACTER | CHAR) VARYING? ) | VARCHAR) (length | (LPAREN RPAREN))? (ccsidQualifier | forDataQualifier)?)
	| ((((CHARACTER | CHAR) LARGE OBJECT) | CLOB) (length | (LPAREN RPAREN))? (ccsidQualifier | forDataQualifier)?)
	| ((GRAPHIC | VARGRAPHIC | DBCLOB) (length | (LPAREN RPAREN))? ccsidQualifier?)
	| (BINARY (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY VARYING?) | VARBINARY) (integerInParens | (LPAREN RPAREN))?)
	| (((BINARY LARGE OBJECT) | BLOB) length?)
	| DATE
	| TIME
	| (TIMESTAMP integerInParens? ((WITH | WITHOUT) TIME ZONE)?)
	| ROWID
	| XML
	)
	;

integerInParens
	: (LPAREN INTEGERLITERAL (COMMA INTEGERLITERAL)? RPAREN)
	;

/*
It turns out the lengthQualifier of K or M or G gets lexed
as being part of the INTEGERLITERAL and becomes an SQLIDENTIFIER.

It also turns out that...

1024
1K
1 K

...are all syntactically correct.  So we can see an INTEGERLITERAL,
an INTEGERLITERAL followed by an sqlidentifier, or an sqlidentifier.
*/
//#KMG
length
	: (
	LPAREN
	(INTEGERLITERAL | (INTEGERLITERAL sqlidentifier) | sqlidentifier)
	(CODEUNITS16 | CODEUNITS32 | OCTETS)?
	RPAREN
	)
	;

ccsidQualifier
	: (
	CCSID
	(((ASCII | EBCDIC | UNICODE) forDataQualifier?) | INTEGERLITERAL)
	)
	;

forDataQualifier
	: (FOR (SBCS | MIXED | BIT) DATA)
	;

distinctTypeName
	: (schemaName DOT)? identifier
	;

arrayType
	: identifier
	;

literal
	: NUMERICLITERAL
	| NONNUMERICLITERAL
	| INTEGERLITERAL
	;

ccsidValue
	: INTEGERLITERAL
	;

columnName
	: (((correlationName | tableName) DOT)? identifier1)
	;

sourceColumnName
	: columnName
	;

targetColumnName
	: columnName
	;

newColumnName
	: identifier
	;

beginColumnName
	: identifier
	;

endColumnName
	: identifier
	;

correlationName
	: identifier
	;

locationName
//	: (identifier | NUMERICLITERAL | INTEGERLITERAL) (DOT? (identifier | NUMERICLITERAL | INTEGERLITERAL))*
	: sqlidentifier
	;

schemaName
	: identifier1
	;

tableName
	: (((locationName DOT schemaName DOT) | (schemaName DOT))? identifier)
	;

alterTableName
	: (((locationName DOT schemaName DOT) | (schemaName DOT))? identifier)
	;

auxTableName
	: (((locationName DOT schemaName DOT) | (schemaName DOT))? identifier)
	;

historyTableName
	: tableName
	;

cloneTableName
	: tableName
	;

archiveTableName
	: tableName
	;

viewName
	: ((locationName DOT schemaName DOT) | (schemaName DOT))? identifier correlationName?
	;

programName
	: identifier
	;

packageName
	: identifier
	;

planName
	: identifier
	;

typeName
	: ((schemaName DOT)? identifier)
	;

variableName
	: ((schemaName DOT)? identifier)
	;

arrayTypeName
	: ((schemaName DOT)? identifier)
	;

jarName
	: ((schemaName DOT)? identifier)
	;

savepointName
	: identifier
	;

aliasName
	: (schemaName DOT)? identifier
	;

constraintName
	: identifier
	;

routineVersionID
	: (identifier | NUMERICLITERAL | INTEGERLITERAL) (DOT? (identifier | NUMERICLITERAL | INTEGERLITERAL))*
	;

versionID
	: (identifier | NUMERICLITERAL | INTEGERLITERAL) (DOT? (identifier | NUMERICLITERAL | INTEGERLITERAL))*
	;

indexName
	: (schemaName DOT)? identifier
	;

maskName
	: (schemaName DOT)? identifier
	;

permissionName
	: (schemaName DOT)? identifier
	;

procedureName
	: ((locationName DOT schemaName DOT) | (schemaName DOT))? identifier
	;

sequenceName
	: (schemaName DOT)? identifier
	;

memberName
	: identifier
	;

databaseName
	: identifier
	;

tablespaceName
	: identifier
	;

acceleratorName
	: identifier
	;

catalogName
	: identifier
	;

/*
Added (schemaName DOT)? per Martijn Rutte 2023-05-23.
*/
triggerName
	: (schemaName DOT)? identifier
	;

contextName
	: identifier
	;

authorizationName
	: identifier
	;

profileName
	: identifier
	;

roleName
	: identifier
	;

seclabelName
	: identifier
	;

parameterName
	: identifier
	;

addressValue
	: NONNUMERICLITERAL
	;

jobnameValue
	: NONNUMERICLITERAL
	;

servauthValue
	: NONNUMERICLITERAL
	;

encryptionValue
	: NONNUMERICLITERAL
	;

bpName
	: identifier
	;

stogroupName
	: identifier
	;

dcName
	: identifier
	;

mcName
	: identifier
	;

scName
	: identifier
	;

volumeID
	: identifier
	;

keyLabelName
	: (identifier | NONNUMERICLITERAL)
	;

functionName
	: (schemaName DOT)? identifier
	;

specificName
	: (schemaName DOT)? identifier
	;

hostLabel
	: (INTEGERLITERAL | identifier) (INTEGERLITERAL | (MINUS identifier))*
	;

hostVariable
	: COLON (hostStructure DOT)? hostIdentifier (INDICATOR? COLON (nullIndicatorStructure DOT)? nullIndicator)?
	;

hostIdentifier
	: (INTEGERLITERAL | identifier) (INTEGERLITERAL | (MINUS identifier))*
	;

hostStructure
	: (INTEGERLITERAL | identifier) (INTEGERLITERAL | (MINUS identifier))*
	;

nullIndicator
	: (INTEGERLITERAL | identifier) (INTEGERLITERAL | (MINUS identifier))*
	;

nullIndicatorStructure
	: (INTEGERLITERAL | identifier) (INTEGERLITERAL | (MINUS identifier))*
	;

globalVariableName
	: ((schemaName DOT)? identifier1)
	;

sqlParameterName
	: ((schemaName DOT)? identifier1)
	;

sqlVariableName
	: ((schemaName DOT)? identifier1)
	;

sqlConditionName
	: identifier1
	;

transitionVariableName
	: columnName
	;

synonym
	: identifier
	;

/*
Trigger variables, global variables, SQL variables, all
these conform to the pattern (schemaName DOT)? identifier.
*/
variable
	: ((schemaName DOT)? identifier)
	| hostVariable
	;

intoClause
	: INTO
	(variable | arrayElementSpecification)
	(COMMA variable)*
	;

correlationClause
	: AS?
	correlationName
	(LPAREN
	newColumnName
	(COMMA newColumnName)*
	RPAREN)?
	;

/*	
fromClause
	: FROM
	tableName correlationClause?
	(COMMA tableName correlationClause?)*
	;
*/

fromClause
	: (
	FROM
	((LPAREN* tableReference RPAREN*) | collectionDerivedTable)
	(COMMA ((LPAREN* tableReference RPAREN*) | collectionDerivedTable))*
	)
	;

tableReference
	: (
	singleTableReference
	| nestedTableExpression
	| dataChangeTableReference
	| tableFunctionReference
	| tableLocatorReference
	| xmltableExpression
	| collectionDerivedTable
//	| joinedTable
/*
The following is brought to you by the ANTLR 4.9.2 message
"The following sets of rules are mutually left-recursive [tableReference, joinedTable]"
*/

	| ((singleTableReference 
		| nestedTableExpression 
		| tableFunctionReference 
		| tableLocatorReference 
		| xmltableExpression 
		| collectionDerivedTable 
		| (LPAREN+ tableReference RPAREN+)
		| ((singleTableReference 
			| nestedTableExpression 
			| tableFunctionReference 
			| tableLocatorReference 
			| xmltableExpression 
			| (LPAREN+ tableReference RPAREN+)
			| collectionDerivedTable)
				(INNER | ((LEFT | RIGHT | FULL) OUTER?))? JOIN
						tableReference ON joinCondition))
		((INNER | ((LEFT | RIGHT | FULL) OUTER?))? JOIN
					tableReference ON joinCondition)+)
	| ((singleTableReference 
		| nestedTableExpression 
		| tableFunctionReference 
		| tableLocatorReference 
		| xmltableExpression 
		| collectionDerivedTable 
		| (LPAREN+ tableReference RPAREN+)
		| ((singleTableReference 
			| nestedTableExpression 
			| tableFunctionReference 
			| tableLocatorReference 
			| xmltableExpression 
			| (LPAREN+ tableReference RPAREN+)
			| collectionDerivedTable)
				(INNER | ((LEFT | RIGHT | FULL) OUTER?))? JOIN
					tableReference ON joinCondition)) CROSS JOIN tableReference)
	| (LPAREN+ tableReference RPAREN+)
	)
	;

singleTableReference
	: (tableName AS? correlationName? periodSpecification* correlationClause?)
	;

periodSpecification
	: (
	FOR (SYSTEM_TIME | BUSINESS_TIME) 
	((AS OF expression) | (FROM expression TO expression) | (BETWEEN expression AND expression))
	)
	;

periodClause
	: (
	FOR PORTION OF BUSINESS_TIME 
	((FROM expression TO expression) | (BETWEEN expression AND expression))
	)
	;

nestedTableExpression
	: (TABLE? LPAREN fullSelect RPAREN correlationClause?)
	;

/*
This was previously quite embarrassingly wrong.  Thankfully,
Martijn Rutte provided a test case and we found a solution 2023-05-23.
*/
dataChangeTableReference
	: (
	((FINAL TABLE LPAREN insertStatement RPAREN)
	| ((FINAL | OLD) TABLE LPAREN searchedUpdate RPAREN)
	| (OLD TABLE LPAREN searchedDelete RPAREN)
	| (FINAL TABLE LPAREN mergeStatement RPAREN))
	correlationClause?
	)
	;

/**/

tableFunctionReference
	: (
	TABLE LPAREN 
	(schemaName DOT)?
	(scalarFunction | aggregateFunction | regressionFunction | tableFunction | identifier)
	LPAREN
	((expression | (TABLE tableName)) (COMMA (expression | (TABLE tableName)))*)?
	RPAREN
	tableUdfCardinalityClause?
	RPAREN
	(correlationClause | typedCorrelationClause)?
	)
	;

tableUdfCardinalityClause
	: (
	CARDINALITY MULTIPLIER? (INTEGERLITERAL | NUMERICLITERAL)
	)
	;

typedCorrelationClause
	: (
	AS? correlationName LPAREN columnName dataType (COMMA columnName dataType)* RPAREN
	)
	;

tableLocatorReference
	: (
	TABLE
	LPAREN
	identifier
	LIKE
	tableName
	RPAREN
	correlationName?
	)
	;

xmltableExpression
	: (xmltableFunctionSpecification correlationClause?)
	;

/*
correlationClause
	: (AS? correlationName (LPAREN columnName (COMMA columnName)* RPAREN)?)
	;
*/

collectionDerivedTable
	: (
	UNNEST
	LPAREN
	(ordinaryArrayExpression | associativeArrayExpression)
	(COMMA (ordinaryArrayExpression | associativeArrayExpression))*
	RPAREN
	(WITH ORDINALITY)?
	correlationClause?
	)
	;

/* moved to the interior of tableReference due to mutual left-recursion error
joinedTable
	: (
	(tableReference
	(INNER | ((LEFT | RIGHT | FULL) OUTER?))
	JOIN
	tableReference ON joinCondition)
	| (tableReference CROSS JOIN tableReference)
	| (LPAREN joinedTable RPAREN)
	)
	;
*/

joinCondition
	: (
	searchCondition
	| (fullJoinExpression EQ fullJoinExpression)
	)
	;

fullJoinExpression
	: (
	(columnName
	| castFunction
	| (COALESCE LPAREN (columnName | castFunction) (COMMA (columnName | castFunction))* RPAREN))
	)
	;

castFunction
	: (castSpecification)
	;

ordinaryArrayExpression
	: (expression)
	;

associativeArrayExpression
	: (expression)
	;

comparison
	: columnName comparisonOperator (columnName | literal)
	;

whereClause
	: WHERE searchCondition
	;

groupByClause
	: GROUP BY
	(groupingExpression | groupingSets | superGroups)
	;

havingClause
	: HAVING searchCondition
	;

groupingExpression
	: (expression (COMMA expression)*)
	;

groupingSets
	: GROUPING SETS groupingSetsGroup
	;

groupingSetsGroup
	: LPAREN 
	(groupingSetsGroup | groupingExpression | superGroups) 
	(COMMA (groupingSetsGroup | groupingExpression | superGroups))* 
	RPAREN
	;

superGroups
	: (
	((ROLLUP | CUBE) LPAREN groupingExpression RPAREN)
	| (LPAREN RPAREN)
	)
	;

selectColumns
	: (
	(expression ((operator expression) | INTEGERLITERAL)* (AS? (newColumnName | NONNUMERICLITERAL))?)
	| (tableName DOT SPLAT)
	| unpackedRow
	)
	;

unpackedRow
	: (
	UNPACK LPAREN expression RPAREN DOT SPLAT AS 
	LPAREN 
	columnName dataType (COMMA columnName dataType)* 
	RPAREN
	)
	;

selectClause
	: (
	SELECT
	(ALL | DISTINCT)?
	(SPLAT | (selectColumns (COMMA selectColumns)*))
	)
	;

subSelect
	: (
	selectClause
	fromClause
	whereClause?
	groupByClause?
	havingClause?
	orderByClause?
	offsetClause?
	fetchClause?
	)
	;

selectIntoStatement
	: (
	(WITH commonTableExpression (COMMA commonTableExpression)*)?
	selectClause
	intoClause
	fromClause
	whereClause?
	groupByClause?
	havingClause?
	orderByClause?
	offsetClause?
	fetchClause?
	(isolationClause | skipLockedDataClause | optimizeClause)*
	querynoClause?
	)
	;

selectStatement
	: (
	(WITH commonTableExpression (COMMA commonTableExpression)*)?
	fullSelect
	(
	updateClause
	| readOnlyClause
	| optimizeClause
	| isolationClause 
	| skipLockedDataClause
	| querynoClause
	)*
	)
	;

/*
Made...

	(LPAREN columnName (COMMA columnName)* RPAREN)

...optional, as it should be per the documentation.  Noted
by Martijn Rutte 2023-01-10.
*/
commonTableExpression
	: tableName 
	(LPAREN columnName (COMMA columnName)* RPAREN)?
	AS LPAREN fullSelect RPAREN
	;

updateClause
	: (FOR UPDATE (OF columnName (COMMA columnName)*)?)
	;

readOnlyClause
	: (FOR READ ONLY)
	;

optimizeClause
	: OPTIMIZE FOR INTEGERLITERAL (ROW | ROWS)
	;

isolationClause
	: WITH 
	(
	(RR lockClause?)
	| (RS lockClause?)
	| CS
	| UR
	)
	;

lockClause
	: (USE AND KEEP (EXCLUSIVE | UPDATE | SHARE) LOCKS)
	;

skipLockedDataClause
	: (SKIP_ LOCKED DATA)
	;

querynoClause
	: (QUERYNO INTEGERLITERAL)
	;

scalarFullSelect
	: LPAREN
	fullSelect
	RPAREN
	;

fullSelect
	: ((LPAREN fullSelect RPAREN) | subSelect | valuesClause)
	((UNION | EXCEPT | INTERSECT) (DISTINCT | ALL)? (subSelect | (LPAREN fullSelect RPAREN)))*
	orderByClause?
	offsetClause?
	fetchClause?
	;

valuesClause
	: VALUES
	(sequenceReference
	| (LPAREN sequenceReference (COMMA sequenceReference)* RPAREN))
	;

orderByClause
	: ORDER BY 
	(
	(sortKey (ASC | DESC)? (COMMA sortKey (ASC | DESC)?)*)
	| (INPUT SEQUENCE)
	| (ORDER OF tableName)
	)
	;

sortKey
	: (columnName | INTEGERLITERAL | expression)
	;

offsetClause
	: OFFSET INTEGERLITERAL (ROW | ROWS)
	;

/*
LIMIT syntax added per Martijn Rutte 2023-05-22.

INTEGERLITERAL changed to (variable | INTEGERLITERAL) in first
alternative per Martijn Rutte 2023-06-05.
*/
fetchClause
	: (FETCH (FIRST | NEXT) (variable | INTEGERLITERAL)? (ROW | ROWS) ONLY)
	| (LIMIT INTEGERLITERAL ((OFFSET INTEGERLITERAL) | (COMMA INTEGERLITERAL))?)
	;

identifier
	: sqlidentifier
	| sqlKeyword
	| specialRegister
	| scalarFunction
	| aggregateFunction
	| regressionFunction
	| tableFunction
	;

identifier1
	: sqlidentifier
	| sqlKeyword
	| scalarFunction
	| aggregateFunction
	| regressionFunction
	| tableFunction
	;

identifier2
	: SQLIDENTIFIER
	| USER
	| sqlKeyword
	| scalarFunction
	| aggregateFunction
	| regressionFunction
	| tableFunction
	;

sqlidentifier
	: (SQLIDENTIFIER | NONNUMERICLITERAL)
	;
	
sqlKeyword
	: (
	  ABSOLUTE
	| ACCELERATION
	| ACCELERATOR
	| ACCESS
	| ACCESSCTRL
	| ACTION
	| ACTIVATE
	| ACTIVE
	| ADD
	| ADDRESS
	| AFTER
	| ALGORITHM
	| ALIAS
	| ALL
	| ALLOCATE
	| ALLOW
	| ALTER
	| ALTERAND
	| ALTERIN
	| ALWAYS
	| AND
	| ANY
	| APPEND
	| APPLCOMPAT
	| APPLICATION
	| ARCHIVE
	| ARRAY
	| ARRAY_AGG
	| ARRAY_EXISTS
	| AS
	| ASC
	| ASCII
	| ASENSITIVE
	| ASSEMBLE
	| ASSOCIATE
	| ASUTIME
	| AT
	| ATOMIC
	| ATTRIBUTES
	| AUDIT
	| AUTHENTICATION
	| AUTHID
	| AUTONOMOUS
	| AUX
	| AUXILIARY
	| AVG
	| BASE64
	| BASED
	| BEFORE
	| BEGIN
	| BETWEEN
	| BIGINT
	| BINARY
	| BIND
	| BINDADD
	| BINDAGENT
	| BIT
	| BLOB
	| BOTH
	| BSDS
	| BUFFERPOOL
	| BUFFERPOOLS
	| BUSINESS
	| BUSINESS_TIME
	| BY
	| C_
	| CACHE
	| CALL
	| CALLED
	| CALLER
	| CAPTURE
	| CASCADE
	| CASCADED
	| CASE
	| CAST
	| CATALOG_NAME
	| CCSID
	| CHANGE
	| CHANGED
	| CHANGES
	| CHAR
	| CHARACTER
	| CHECK
	| CLAUSE
	| CLIENT
	| CLOB
	| CLONE
	| CLOSE
	| CLUSTER
	| COBOL
	| CODEUNITS16
	| CODEUNITS32
	| COLLECTION
	| COLLID
	| COLUMN
	| COLUMNS
	| COMMENT
	| COMMIT
	| COMMITTED
	| COMPATIBILITY
	| COMPRESS
	| CONCAT
	| CONCENTRATE
	| CONCURRENT
	| CONDITION
	| CONDITION_NUMBER
	| CONNECT
	| CONNECTION
	| CONSTANT
	| CONSTRAINT
	| CONTAINS
	| CONTENT
	| CONTEXT
	| CONTINUE
	| CONTROL
	| COPY
	| CORR
	| CORRELATION
	| COVAR
	| COVARIANCE
	| COVARIANCE_SAMP
	| COVAR_POP
	| COVAR_SAMP
	| CREATE
	| CREATEALIAS
	| CREATEDBA
	| CREATEDBC
	| CREATEIN
	| CREATE_SECURE_OBJECT
	| CREATESG
	| CREATETAB
	| CREATETMTAB
	| CREATETS
	| CROSS
	| CS
	| CUBE
	| CUME_DIST
	| CURRENT
	| CURRENT_DATE
	| CURRENTLY
	| CURRENT_PATH
	| CURRENT_SCHEMA
	| CURRENT_SERVER
	| CURRENT_TIME
	| CURRENT_TIMESTAMP
	| CURRENT_TIME_ZONE
	| CURRVAL
	| CURSOR
	| CURSOR_NAME
	| CURSORS
	| CYCLE
	| DATA
	| DATAACCESS
	| DATABASE
	| DATACLAS
	| DATE
	| DAY
	| DAYS
	| DB2
	| DB2_AUTHENTICATION_TYPE
	| DB2_AUTHORIZATION_ID
	| DB2_CONNECTION_STATE
	| DB2_CONNECTION_STATUS
	| DB2_ENCRYPTION_TYPE
	| DB2_ERROR_CODE1
	| DB2_ERROR_CODE2
	| DB2_ERROR_CODE3
	| DB2_ERROR_CODE4
	| DB2_GET_DIAGNOSTICS_DIAGNOSTICS
	| DB2_INTERNAL_ERROR_POINTER
	| DB2_LAST_ROW
	| DB2_LINE_NUMBER
	| DB2_MESSAGE_ID
	| DB2_MODULE_DETECTING_ERROR
	| DB2_NUMBER_PARAMETER_MARKERS
	| DB2_NUMBER_RESULT_SETS
	| DB2_NUMBER_ROWS
	| DB2_ORDINAL_TOKEN_
	| DB2_PRODUCT_ID
	| DB2_REASON_CODE
	| DB2_RETURNED_SQLCODE
	| DB2_RETURN_STATUS
	| DB2_ROW_NUMBER
	| DB2_SERVER_CLASS_NAME
	| DB2SQL
	| DB2_SQL_ATTR_CURSOR_HOLD
	| DB2_SQL_ATTR_CURSOR_ROWSET
	| DB2_SQL_ATTR_CURSOR_SCROLLABLE
	| DB2_SQL_ATTR_CURSOR_SENSITIVITY
	| DB2_SQL_ATTR_CURSOR_TYPE
	| DB2_SQLERRD1
	| DB2_SQLERRD2
	| DB2_SQLERRD3
	| DB2_SQLERRD4
	| DB2_SQLERRD5
	| DB2_SQLERRD6
	| DB2_SQLERRD_SET
	| DB2_SQL_NESTING_LEVEL
	| DB2_TOKEN_COUNT
	| DBADM
	| DBCLOB
	| DBCTRL
	| DBINFO
	| DBMAINT
	| DEACTIVATE
	| DEALLOCATE
	| DEBUG
	| DEBUGSESSION
	| DEC
	| DECFLOAT
	| DECIMAL
	| DECLARE
	| DEC_ROUND_CEILING
	| DEC_ROUND_DOWN
	| DEC_ROUND_FLOOR
	| DEC_ROUND_HALF_DOWN
	| DEC_ROUND_HALF_EVEN
	| DEC_ROUND_HALF_UP
	| DEC_ROUND_UP
	| DEFAULT
	| DEFAULTS
	| DEFER
	| DEFERRED
	| DEFINE
	| DEFINEBIND
	| DEFINER
	| DEFINERUN
	| DEGREE
	| DELETE
	| DENSE_RANK
	| DEPENDENT
	| DESC
	| DESCRIBE
	| DESCRIPTOR
	| DETERMINISTIC
	| DIAGNOSTICS
	| DISABLE
	| DISALLOW
	| DISPATCH
	| DISPLAY
	| DISPLAYDB
	| DISTINCT
	| DO
	| DOCUMENT
	| DOUBLE
	| DROP
	| DROPIN
	| DSSIZE
	| DYNAMIC
	| DYNAMICRULES
	| EACH
	| EBCDIC
	| EDITPROC
	| ELEMENT
	| ELIGIBLE
	| ELSE
	| ELSEIF
	| EMPTY
	| ENABLE
	| ENCODING
	| ENCRYPTION
	| END
	| END_EXEC
	| ENDING
	| ENFORCED
	| ENVIRONMENT
	| ERASE
	| ESCAPE
	| EUR
	| EVERY
	| EXCEPT
	| EXCEPTION
	| EXCHANGE
	| EXCLUDE
	| EXCLUDING
	| EXCLUSIVE
	| EXEC_SQL
	| EXECUTE
	| EXISTS
	| EXIT
	| EXPLAIN
	| EXTERNAL
	| EXTRA
	| FAILBACK
	| FAILURE
	| FAILURES
	| FENCED
	| FETCH
	| FIELDPROC
	| FINAL
	| FIRST
	| FIRST_VALUE
	| FIXEDLENGTH
	| FLOAT
	| FOLLOWING
	| FOR
	| FOREIGN
	| FORMAT
	| FOUND
	| FREE
	| FREEPAGE
	| FROM
	| FULL
	| FUNCTION
	| GBPCACHE
	| GENERAL
	| GENERATE
	| GENERATED
	| GENERIC
	| GET
	| GET_ACCEL_ARCHIVE
	| GLOBAL
	| GO
	| GOTO
	| GRANT
	| GRAPHIC
	| GROUP
	| GROUPING
	| HANDLER
	| HAVING
	| HIDDEN_
	| HINT
	| HISTORY
	| HOLD
	| HOUR
	| HOURS
	| HUFFMAN
	| ID
	| IDENTITY
	| IF
	| IGNORE
	| IMAGCOPY
	| IMMEDIATE
	| IMPLICITLY
	| IN
	| INCLUDE
	| INCLUDING
	| INCLUSIVE
	| INCREMENT
	| INDEX
	| INDEXBP
	| INDICATOR
	| INHERIT
	| INITIALLY
	| INLINE
	| INNER
	| INOUT
	| INPUT
	| INSENSITIVE
	| INSERT
	| INSTEAD
	| INT
	| INTEGER
	| INTERSECT
	| INTO
	| INVOKEBIND
	| INVOKERUN
	| IS
	| ISNULL
	| ISO
	| ISOBID
	| ISOLATION
	| ITERATE
	| JAR
	| JAVA
	| JIS
	| JOBNAME
	| JOIN
	| KEEP
	| KEY
	| KEYS
	| LABEL
	| LABELS
	| LAG
	| LANGUAGE
	| LARGE
	| LAST
	| LAST_VALUE
	| LC_CTYPE
	| LEAD
	| LEAVE
	| LEFT
	| LEVEL
	| LIKE
	| LIMIT
	| LISTAGG
	| LITERALS
	| LOAD
	| LOB
	| LOCAL
	| LOCALE
	| LOCATION
	| LOCATOR
	| LOCATORS
	| LOCK
	| LOCKED
	| LOCKMAX
	| LOCKS
	| LOCKSIZE
	| LOG
	| LOGGED
	| LONG
	| LOOP
	| MAIN
	| MAINTAINED
	| MASK
	| MATCHED
	| MATERIALIZED
	| MAXPARTITIONS
	| MAXROWS
	| MAXVALUE
	| MEDIAN
	| MEMBER
	| MERGE
	| MESSAGE_TEXT
	| MGMTCLAS
	| MICROSECOND
	| MICROSECONDS
	| MINUTE
	| MINUTES
	| MINVALUE
	| MIXED
	| MODE_
	| MODEL
	| MODIFIERS
	| MODIFIES
	| MONITOR1
	| MONITOR2
	| MONTH
	| MONTHS
	| MORE_
	| MOVE
	| MULTIPLIER
	| NAME
	| NAMES
	| NAMESPACE
	| NEW
	| NEW_TABLE
	| NEXT
	| NEXTVAL
	| NO
	| NOCACHE
	| NODEFER
	| NOMAXVALUE
	| NOMINVALUE
	| NONE
	| NOORDER
	| NOT
	| NOTNULL
	| NTH_VALUE
	| NTILE
	| NULL
	| NULLS
	| NULTERM
	| NUMBER
	| NUMERIC
	| NUMPARTS
	| OBID
	| OBJECT
	| OCTETS
	| OF
	| OFFSET
	| OLD
	| OLD_TABLE
	| ON
	| ONCE
	| ONLY
	| OPEN
	| OPERATION
	| OPTHINT
	| OPTIMIZATION
	| OPTIMIZE
	| OPTION
	| OPTIONAL
	| OPTIONS
	| OR
	| ORDER
	| ORDINALITY
	| ORGANIZATION
	| ORGANIZE
	| OUT
	| OUTCOME
	| OUTER
	| OUTPUT
	| OVER
	| OVERLAPS
	| OVERRIDING
	| OWNER
	| OWNERSHIP
	| PACKADM
	| PACKAGE
	| PACKAGE_NAME
	| PACKAGE_SCHEMA
	| PACKAGE_VERSION
	| PADDED
	| PAGE
	| PAGENUM
	| PARALLEL
	| PARAMETER
	| PART
	| PARTITION
	| PARTITIONED
	| PARTITIONING
	| PASSING
	| PASSWORD
	| PATH
	| PCTFREE
	| PENDING
	| PERCENTILE_CONT
	| PERCENTILE_DISC
	| PERCENT_RANK
	| PERIOD
	| PERMISSION
	| PIECESIZE
	| PLAN
	| PLI
	| PORTION
	| POSITIONING
	| PRECEDING
	| PRECISION
	| PREPARE
	| PRESERVE
	| PREVIOUS
	| PREVVAL
	| PRIMARY
	| PRIOR
	| PRIQTY
	| PRIVILEGES
	| PROCEDURE
	| PROFILE
	| PROGRAM
	| PSID
	| PUBLIC
	| QUALIFIER
	| QUERY
	| QUERYNO
	| RANGE
	| RANK
	| RATIO_TO_REPORT
	| READ
	| READS
	| REAL
	| RECOVER
	| RECOVERDB
	| REF
	| REFERENCE
	| REFERENCES
	| REFERENCING
	| REFRESH
	| REGENERATE
	| REGISTERS
	| REGR_AVGX
	| REGR_AVGY
	| REGR_COUNT
	| REGR_ICPT
	| REGR_INTERCEPT
	| REGR_R2
	| REGR_SLOPE
	| REGR_SXX
	| REGR_SXY
	| REGR_SYY
	| RELATIVE
	| RELEASE
	| REMOVE
	| RENAME
	| REOPT
	| REORG
	| REPAIR
	| REPEAT
	| REQUIRED
	| RESET
	| RESIDENT
	| RESIGNAL
	| RESOLUTION
	| RESPECT
	| RESTART
	| RESTRICT
	| RESULT
	| RESULT_SET_LOCATOR
	| RETAIN
	| RETURN
	| RETURNED_SQLSTATE
	| RETURNING
	| RETURNS
	| REUSE
	| REVOKE
	| REXX
	| RIGHT
	| ROLE
	| ROLLBACK
	| ROLLUP
	| ROTATE
	| ROUND_CEILING
	| ROUND_DOWN
	| ROUND_FLOOR
	| ROUND_HALF_DOWN
	| ROUND_HALF_EVEN
	| ROUND_HALF_UP
	| ROUNDING
	| ROUND_UP
	| ROW
	| ROW_COUNT
	| ROWID
	| ROW_NUMBER
	| ROWS
	| ROWSET
	| RR
	| RS
	| RUN
	| SAVEPOINT
	| SBCS
	| SCHEMA
	| SCHEME
	| SCRATCHPAD
	| SCROLL
	| SECOND
	| SECONDS
	| SECQTY
	| SECTION
	| SECURED
	| SECURITY
	| SEGSIZE
	| SELECT
	| SELECTIVITY
	| SENSITIVE
	| SEQUENCE
	| SERVAUTH
	| SERVER_NAME
	| SESSION
	| SESSION_USER
	| SET
	| SETS
	| SHARE
	| SIGNAL
	| SIMPLE
	| SIZE
	| SKIP_
	| SMALLINT
	| SOME
	| SOURCE
	| SPECIAL
	| SPECIFIC
	| SQL
	| SQLADM
	| SQLCODE
	| SQLERROR
	| SQLEXCEPTION
	| SQLID
	| SQLSTATE
	| SQLWARNING
	| STABILIZED
	| STACKED
	| STANDARD
	| START
	| STARTDB
	| STARTING
	| STATEMENT
	| STATEMENTS
	| STATIC
	| STATS
	| STAY
	| STDDEV
	| STDDEV_POP
	| STDDEV_SAMP
	| STMTCACHE
	| STMTID
	| STMTTOKEN
	| STOGROUP
	| STOP
	| STOPALL
	| STOPDB
	| STORAGE
	| STORCLAS
	| STORES
	| STOSPACE
	| STRUCTURE
	| STYLE
	| SUB
	| SUM
	| SUMMARY
	| SYNONYM
	| SYSADM
	| SYSCTRL
	| SYSDATE
	| SYSDEFLT
	| SYSIBM
	| SYSOPR
	| SYSTEM
	| SYSTEM_TIME
	| SYSTIMESTAMP
	| SYSXSR
	| TABLE
	| TABLESPACE
	| TEMPORARY
	| THEN
	| TIME
	| TIMESTAMP
	| TIMEZONE
	| TO
	| TOKEN
	| TRACE
	| TRACKMOD
	| TRANSACTION
	| TRANSFER
	| TRIGGER
	| TRIGGERS
	| TRUNCATE
	| TRUSTED
	| TYPE
	| UNBOUNDED
	| UNDO
	| UNICODE
	| UNION
	| UNIQUE
	| UNLOAD
	| UNNEST
	| UNPACK
	| UNTIL
	| UPDATE
	| UPON
	| UR
	| URL
	| USA
	| USAGE
	| USE
	| USER
	| USING
	| VALIDATE
	| VALIDPROC
	| VALUE
	| VALUES
	| VAR
	| VARBINARY
	| VARCHAR
	| VARGRAPHIC
	| VARIABLE
	| VARIANCE
	| VARIANCE_SAMP
	| VARIANT
	| VAR_POP
	| VAR_SAMP
	| VARYING
	| VCAT
	| VERSION
	| VERSIONING
	| VERSIONS
	| VIEW
	| VOLATILE
	| VOLUMES
	| WAIT
	| WAITFORDATA
	| WHEN
	| WHENEVER
	| WHERE
	| WHILE
	| WITH
	| WITHIN
	| WITHOUT
	| WLM
	| WORK
	| WORKFILE
	| WRAPPED
	| WRITE
	| XML
	| XMLAGG
	| XMLBINARY
	| XMLCAST
	| XMLDECLARATION
	| XMLEXISTS
	| XMLNAMESPACES
	| XMLPATTERN
	| XMLSCHEMA
	| YEAR
	| YEARS
	| YES
	| ZONE	)
	;


