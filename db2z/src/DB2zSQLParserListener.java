// Generated from src/DB2zSQLParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DB2zSQLParser}.
 */
public interface DB2zSQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(DB2zSQLParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(DB2zSQLParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(DB2zSQLParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(DB2zSQLParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DB2zSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DB2zSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(DB2zSQLParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(DB2zSQLParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#statementName}.
	 * @param ctx the parse tree
	 */
	void enterStatementName(DB2zSQLParser.StatementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#statementName}.
	 * @param ctx the parse tree
	 */
	void exitStatementName(DB2zSQLParser.StatementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#descriptorName}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorName(DB2zSQLParser.DescriptorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#descriptorName}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorName(DB2zSQLParser.DescriptorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#holdability}.
	 * @param ctx the parse tree
	 */
	void enterHoldability(DB2zSQLParser.HoldabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#holdability}.
	 * @param ctx the parse tree
	 */
	void exitHoldability(DB2zSQLParser.HoldabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#returnability}.
	 * @param ctx the parse tree
	 */
	void enterReturnability(DB2zSQLParser.ReturnabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#returnability}.
	 * @param ctx the parse tree
	 */
	void exitReturnability(DB2zSQLParser.ReturnabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rowsetPositioning}.
	 * @param ctx the parse tree
	 */
	void enterRowsetPositioning(DB2zSQLParser.RowsetPositioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rowsetPositioning}.
	 * @param ctx the parse tree
	 */
	void exitRowsetPositioning(DB2zSQLParser.RowsetPositioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#notNullPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNotNullPhrase(DB2zSQLParser.NotNullPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#notNullPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNotNullPhrase(DB2zSQLParser.NotNullPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#allocateCursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterAllocateCursorStatement(DB2zSQLParser.AllocateCursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#allocateCursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitAllocateCursorStatement(DB2zSQLParser.AllocateCursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rsLocatorVariable}.
	 * @param ctx the parse tree
	 */
	void enterRsLocatorVariable(DB2zSQLParser.RsLocatorVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rsLocatorVariable}.
	 * @param ctx the parse tree
	 */
	void exitRsLocatorVariable(DB2zSQLParser.RsLocatorVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseStatement(DB2zSQLParser.AlterDatabaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseStatement(DB2zSQLParser.AlterDatabaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunctionStatement(DB2zSQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunctionStatement(DB2zSQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexStatement(DB2zSQLParser.AlterIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexStatement(DB2zSQLParser.AlterIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterMaskStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaskStatement(DB2zSQLParser.AlterMaskStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterMaskStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaskStatement(DB2zSQLParser.AlterMaskStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterPermissionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterPermissionStatement(DB2zSQLParser.AlterPermissionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterPermissionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterPermissionStatement(DB2zSQLParser.AlterPermissionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedureStatement(DB2zSQLParser.AlterProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedureStatement(DB2zSQLParser.AlterProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequenceStatement(DB2zSQLParser.AlterSequenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequenceStatement(DB2zSQLParser.AlterSequenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterStogroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterStogroupStatement(DB2zSQLParser.AlterStogroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterStogroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterStogroupStatement(DB2zSQLParser.AlterStogroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStatement(DB2zSQLParser.AlterTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStatement(DB2zSQLParser.AlterTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTablespaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespaceStatement(DB2zSQLParser.AlterTablespaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTablespaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespaceStatement(DB2zSQLParser.AlterTablespaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTriggerStatement(DB2zSQLParser.AlterTriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTriggerStatement(DB2zSQLParser.AlterTriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTrustedContextStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTrustedContextStatement(DB2zSQLParser.AlterTrustedContextStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTrustedContextStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTrustedContextStatement(DB2zSQLParser.AlterTrustedContextStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterViewStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewStatement(DB2zSQLParser.AlterViewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterViewStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewStatement(DB2zSQLParser.AlterViewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#associateLocatorsStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssociateLocatorsStatement(DB2zSQLParser.AssociateLocatorsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#associateLocatorsStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssociateLocatorsStatement(DB2zSQLParser.AssociateLocatorsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#beginDeclareSectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeginDeclareSectionStatement(DB2zSQLParser.BeginDeclareSectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#beginDeclareSectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeginDeclareSectionStatement(DB2zSQLParser.BeginDeclareSectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(DB2zSQLParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(DB2zSQLParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#closeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseStatement(DB2zSQLParser.CloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#closeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseStatement(DB2zSQLParser.CloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(DB2zSQLParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(DB2zSQLParser.CommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#commitStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommitStatement(DB2zSQLParser.CommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#commitStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommitStatement(DB2zSQLParser.CommitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#connectStatement}.
	 * @param ctx the parse tree
	 */
	void enterConnectStatement(DB2zSQLParser.ConnectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#connectStatement}.
	 * @param ctx the parse tree
	 */
	void exitConnectStatement(DB2zSQLParser.ConnectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createAliasStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateAliasStatement(DB2zSQLParser.CreateAliasStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createAliasStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateAliasStatement(DB2zSQLParser.CreateAliasStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createAuxiliaryTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateAuxiliaryTableStatement(DB2zSQLParser.CreateAuxiliaryTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createAuxiliaryTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateAuxiliaryTableStatement(DB2zSQLParser.CreateAuxiliaryTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseStatement(DB2zSQLParser.CreateDatabaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseStatement(DB2zSQLParser.CreateDatabaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatement(DB2zSQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatement(DB2zSQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalScalar}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementExternalScalar(DB2zSQLParser.CreateFunctionStatementExternalScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalScalar}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementExternalScalar(DB2zSQLParser.CreateFunctionStatementExternalScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementExternalTable(DB2zSQLParser.CreateFunctionStatementExternalTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementExternalTable(DB2zSQLParser.CreateFunctionStatementExternalTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementSourced}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementSourced(DB2zSQLParser.CreateFunctionStatementSourcedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementSourced}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementSourced(DB2zSQLParser.CreateFunctionStatementSourcedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementInlineSqlScalar}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementInlineSqlScalar(DB2zSQLParser.CreateFunctionStatementInlineSqlScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementInlineSqlScalar}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementInlineSqlScalar(DB2zSQLParser.CreateFunctionStatementInlineSqlScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createGlobalTemporaryTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateGlobalTemporaryTableStatement(DB2zSQLParser.CreateGlobalTemporaryTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createGlobalTemporaryTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateGlobalTemporaryTableStatement(DB2zSQLParser.CreateGlobalTemporaryTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexStatement(DB2zSQLParser.CreateIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexStatement(DB2zSQLParser.CreateIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createLobTablespaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateLobTablespaceStatement(DB2zSQLParser.CreateLobTablespaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createLobTablespaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateLobTablespaceStatement(DB2zSQLParser.CreateLobTablespaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createMaskStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaskStatement(DB2zSQLParser.CreateMaskStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createMaskStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaskStatement(DB2zSQLParser.CreateMaskStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createPermissionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreatePermissionStatement(DB2zSQLParser.CreatePermissionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createPermissionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreatePermissionStatement(DB2zSQLParser.CreatePermissionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedureStatement(DB2zSQLParser.CreateProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedureStatement(DB2zSQLParser.CreateProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createRoleStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateRoleStatement(DB2zSQLParser.CreateRoleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createRoleStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateRoleStatement(DB2zSQLParser.CreateRoleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequenceStatement(DB2zSQLParser.CreateSequenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequenceStatement(DB2zSQLParser.CreateSequenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createStogroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStogroupStatement(DB2zSQLParser.CreateStogroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createStogroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStogroupStatement(DB2zSQLParser.CreateStogroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(DB2zSQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(DB2zSQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTablespaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceStatement(DB2zSQLParser.CreateTablespaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTablespaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceStatement(DB2zSQLParser.CreateTablespaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTriggerStatement(DB2zSQLParser.CreateTriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTriggerStatement(DB2zSQLParser.CreateTriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTrustedContextStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrustedContextStatement(DB2zSQLParser.CreateTrustedContextStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTrustedContextStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrustedContextStatement(DB2zSQLParser.CreateTrustedContextStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTypeArrayStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeArrayStatement(DB2zSQLParser.CreateTypeArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTypeArrayStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeArrayStatement(DB2zSQLParser.CreateTypeArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTypeDistinctStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeDistinctStatement(DB2zSQLParser.CreateTypeDistinctStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTypeDistinctStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeDistinctStatement(DB2zSQLParser.CreateTypeDistinctStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateVariableStatement(DB2zSQLParser.CreateVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateVariableStatement(DB2zSQLParser.CreateVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createViewStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewStatement(DB2zSQLParser.CreateViewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createViewStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewStatement(DB2zSQLParser.CreateViewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareCursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursorStatement(DB2zSQLParser.DeclareCursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareCursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursorStatement(DB2zSQLParser.DeclareCursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareGlobalTemporaryTableStatement(DB2zSQLParser.DeclareGlobalTemporaryTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareGlobalTemporaryTableStatement(DB2zSQLParser.DeclareGlobalTemporaryTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareTableStatement(DB2zSQLParser.DeclareTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareTableStatement(DB2zSQLParser.DeclareTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareStatementStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStatementStatement(DB2zSQLParser.DeclareStatementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareStatementStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStatementStatement(DB2zSQLParser.DeclareStatementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariableStatement(DB2zSQLParser.DeclareVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariableStatement(DB2zSQLParser.DeclareVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(DB2zSQLParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(DB2zSQLParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#describeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStatement(DB2zSQLParser.DescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#describeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStatement(DB2zSQLParser.DescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#describeCursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeCursorStatement(DB2zSQLParser.DescribeCursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#describeCursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeCursorStatement(DB2zSQLParser.DescribeCursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#describeInputStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeInputStatement(DB2zSQLParser.DescribeInputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#describeInputStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeInputStatement(DB2zSQLParser.DescribeInputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#describeOutputStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeOutputStatement(DB2zSQLParser.DescribeOutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#describeOutputStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeOutputStatement(DB2zSQLParser.DescribeOutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#describeProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeProcedureStatement(DB2zSQLParser.DescribeProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#describeProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeProcedureStatement(DB2zSQLParser.DescribeProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#describeTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTableStatement(DB2zSQLParser.DescribeTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#describeTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTableStatement(DB2zSQLParser.DescribeTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropStatement(DB2zSQLParser.DropStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropStatement(DB2zSQLParser.DropStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#endDeclareSectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndDeclareSectionStatement(DB2zSQLParser.EndDeclareSectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#endDeclareSectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndDeclareSectionStatement(DB2zSQLParser.EndDeclareSectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#exchangeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExchangeStatement(DB2zSQLParser.ExchangeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#exchangeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExchangeStatement(DB2zSQLParser.ExchangeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(DB2zSQLParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(DB2zSQLParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#executeImmediateStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteImmediateStatement(DB2zSQLParser.ExecuteImmediateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#executeImmediateStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteImmediateStatement(DB2zSQLParser.ExecuteImmediateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#explainStatement}.
	 * @param ctx the parse tree
	 */
	void enterExplainStatement(DB2zSQLParser.ExplainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#explainStatement}.
	 * @param ctx the parse tree
	 */
	void exitExplainStatement(DB2zSQLParser.ExplainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fetchStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchStatement(DB2zSQLParser.FetchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fetchStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchStatement(DB2zSQLParser.FetchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#freeLocatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterFreeLocatorStatement(DB2zSQLParser.FreeLocatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#freeLocatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitFreeLocatorStatement(DB2zSQLParser.FreeLocatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void enterGetDiagnosticsStatement(DB2zSQLParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void exitGetDiagnosticsStatement(DB2zSQLParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantStatement(DB2zSQLParser.GrantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantStatement(DB2zSQLParser.GrantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#holdLocatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterHoldLocatorStatement(DB2zSQLParser.HoldLocatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#holdLocatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitHoldLocatorStatement(DB2zSQLParser.HoldLocatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(DB2zSQLParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(DB2zSQLParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(DB2zSQLParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(DB2zSQLParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelStatement(DB2zSQLParser.LabelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelStatement(DB2zSQLParser.LabelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#lockTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterLockTableStatement(DB2zSQLParser.LockTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#lockTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitLockTableStatement(DB2zSQLParser.LockTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void enterMergeStatement(DB2zSQLParser.MergeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void exitMergeStatement(DB2zSQLParser.MergeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#openStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenStatement(DB2zSQLParser.OpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#openStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenStatement(DB2zSQLParser.OpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStatement(DB2zSQLParser.PrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStatement(DB2zSQLParser.PrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#refreshTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTableStatement(DB2zSQLParser.RefreshTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#refreshTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTableStatement(DB2zSQLParser.RefreshTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#releaseConnectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseConnectionStatement(DB2zSQLParser.ReleaseConnectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#releaseConnectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseConnectionStatement(DB2zSQLParser.ReleaseConnectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#releaseSavepointStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseSavepointStatement(DB2zSQLParser.ReleaseSavepointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#releaseSavepointStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseSavepointStatement(DB2zSQLParser.ReleaseSavepointStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#renameStatement}.
	 * @param ctx the parse tree
	 */
	void enterRenameStatement(DB2zSQLParser.RenameStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#renameStatement}.
	 * @param ctx the parse tree
	 */
	void exitRenameStatement(DB2zSQLParser.RenameStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeStatement(DB2zSQLParser.RevokeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeStatement(DB2zSQLParser.RevokeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void enterRollbackStatement(DB2zSQLParser.RollbackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void exitRollbackStatement(DB2zSQLParser.RollbackStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void enterSavepointStatement(DB2zSQLParser.SavepointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void exitSavepointStatement(DB2zSQLParser.SavepointStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentStatement(DB2zSQLParser.SetAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentStatement(DB2zSQLParser.SetAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setConnectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetConnectionStatement(DB2zSQLParser.SetConnectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setConnectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetConnectionStatement(DB2zSQLParser.SetConnectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setEncryptionPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetEncryptionPasswordStatement(DB2zSQLParser.SetEncryptionPasswordStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setEncryptionPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetEncryptionPasswordStatement(DB2zSQLParser.SetEncryptionPasswordStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setPathStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPathStatement(DB2zSQLParser.SetPathStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setPathStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPathStatement(DB2zSQLParser.SetPathStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetSchemaStatement(DB2zSQLParser.SetSchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetSchemaStatement(DB2zSQLParser.SetSchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setSessionTimezoneStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetSessionTimezoneStatement(DB2zSQLParser.SetSessionTimezoneStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setSessionTimezoneStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetSessionTimezoneStatement(DB2zSQLParser.SetSessionTimezoneStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setSpecialRegisterStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetSpecialRegisterStatement(DB2zSQLParser.SetSpecialRegisterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setSpecialRegisterStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetSpecialRegisterStatement(DB2zSQLParser.SetSpecialRegisterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(DB2zSQLParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(DB2zSQLParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#transferOwnershipStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransferOwnershipStatement(DB2zSQLParser.TransferOwnershipStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#transferOwnershipStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransferOwnershipStatement(DB2zSQLParser.TransferOwnershipStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#truncateStatement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStatement(DB2zSQLParser.TruncateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#truncateStatement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStatement(DB2zSQLParser.TruncateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(DB2zSQLParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(DB2zSQLParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesStatement}.
	 * @param ctx the parse tree
	 */
	void enterValuesStatement(DB2zSQLParser.ValuesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesStatement}.
	 * @param ctx the parse tree
	 */
	void exitValuesStatement(DB2zSQLParser.ValuesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesIntoStatement}.
	 * @param ctx the parse tree
	 */
	void enterValuesIntoStatement(DB2zSQLParser.ValuesIntoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesIntoStatement}.
	 * @param ctx the parse tree
	 */
	void exitValuesIntoStatement(DB2zSQLParser.ValuesIntoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#wheneverStatement}.
	 * @param ctx the parse tree
	 */
	void enterWheneverStatement(DB2zSQLParser.WheneverStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#wheneverStatement}.
	 * @param ctx the parse tree
	 */
	void exitWheneverStatement(DB2zSQLParser.WheneverStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesIntoTargetVariable}.
	 * @param ctx the parse tree
	 */
	void enterValuesIntoTargetVariable(DB2zSQLParser.ValuesIntoTargetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesIntoTargetVariable}.
	 * @param ctx the parse tree
	 */
	void exitValuesIntoTargetVariable(DB2zSQLParser.ValuesIntoTargetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#ownedObject}.
	 * @param ctx the parse tree
	 */
	void enterOwnedObject(DB2zSQLParser.OwnedObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#ownedObject}.
	 * @param ctx the parse tree
	 */
	void exitOwnedObject(DB2zSQLParser.OwnedObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#newOwner}.
	 * @param ctx the parse tree
	 */
	void enterNewOwner(DB2zSQLParser.NewOwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#newOwner}.
	 * @param ctx the parse tree
	 */
	void exitNewOwner(DB2zSQLParser.NewOwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantCollectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantCollectionStatement(DB2zSQLParser.GrantCollectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantCollectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantCollectionStatement(DB2zSQLParser.GrantCollectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantDatabaseStatement(DB2zSQLParser.GrantDatabaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantDatabaseStatement(DB2zSQLParser.GrantDatabaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantFunctionOrProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantFunctionOrProcedureStatement(DB2zSQLParser.GrantFunctionOrProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantFunctionOrProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantFunctionOrProcedureStatement(DB2zSQLParser.GrantFunctionOrProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantPackageStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantPackageStatement(DB2zSQLParser.GrantPackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantPackageStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantPackageStatement(DB2zSQLParser.GrantPackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantPlanStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantPlanStatement(DB2zSQLParser.GrantPlanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantPlanStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantPlanStatement(DB2zSQLParser.GrantPlanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantSchemaStatement(DB2zSQLParser.GrantSchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantSchemaStatement(DB2zSQLParser.GrantSchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantSequenceStatement(DB2zSQLParser.GrantSequenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantSequenceStatement(DB2zSQLParser.GrantSequenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantSystemStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantSystemStatement(DB2zSQLParser.GrantSystemStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantSystemStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantSystemStatement(DB2zSQLParser.GrantSystemStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantTableStatement(DB2zSQLParser.GrantTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantTableStatement(DB2zSQLParser.GrantTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantTypeOrJarStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantTypeOrJarStatement(DB2zSQLParser.GrantTypeOrJarStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantTypeOrJarStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantTypeOrJarStatement(DB2zSQLParser.GrantTypeOrJarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantVariableStatement(DB2zSQLParser.GrantVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantVariableStatement(DB2zSQLParser.GrantVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantUseOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantUseOfStatement(DB2zSQLParser.GrantUseOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantUseOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantUseOfStatement(DB2zSQLParser.GrantUseOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeCollectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeCollectionStatement(DB2zSQLParser.RevokeCollectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeCollectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeCollectionStatement(DB2zSQLParser.RevokeCollectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeDatabaseStatement(DB2zSQLParser.RevokeDatabaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeDatabaseStatement(DB2zSQLParser.RevokeDatabaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeFunctionOrProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeFunctionOrProcedureStatement(DB2zSQLParser.RevokeFunctionOrProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeFunctionOrProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeFunctionOrProcedureStatement(DB2zSQLParser.RevokeFunctionOrProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokePackageStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokePackageStatement(DB2zSQLParser.RevokePackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokePackageStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokePackageStatement(DB2zSQLParser.RevokePackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokePlanStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokePlanStatement(DB2zSQLParser.RevokePlanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokePlanStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokePlanStatement(DB2zSQLParser.RevokePlanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeSchemaStatement(DB2zSQLParser.RevokeSchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeSchemaStatement(DB2zSQLParser.RevokeSchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeSequenceStatement(DB2zSQLParser.RevokeSequenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeSequenceStatement(DB2zSQLParser.RevokeSequenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeSystemStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeSystemStatement(DB2zSQLParser.RevokeSystemStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeSystemStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeSystemStatement(DB2zSQLParser.RevokeSystemStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeTableStatement(DB2zSQLParser.RevokeTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeTableStatement(DB2zSQLParser.RevokeTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeTypeOrJarStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeTypeOrJarStatement(DB2zSQLParser.RevokeTypeOrJarStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeTypeOrJarStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeTypeOrJarStatement(DB2zSQLParser.RevokeTypeOrJarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeVariableStatement(DB2zSQLParser.RevokeVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeVariableStatement(DB2zSQLParser.RevokeVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeUseOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeUseOfStatement(DB2zSQLParser.RevokeUseOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeUseOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeUseOfStatement(DB2zSQLParser.RevokeUseOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantUseOfTarget}.
	 * @param ctx the parse tree
	 */
	void enterGrantUseOfTarget(DB2zSQLParser.GrantUseOfTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantUseOfTarget}.
	 * @param ctx the parse tree
	 */
	void exitGrantUseOfTarget(DB2zSQLParser.GrantUseOfTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantVariableAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantVariableAuthority(DB2zSQLParser.GrantVariableAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantVariableAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantVariableAuthority(DB2zSQLParser.GrantVariableAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantTableAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantTableAuthority(DB2zSQLParser.GrantTableAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantTableAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantTableAuthority(DB2zSQLParser.GrantTableAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantSystemAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantSystemAuthority(DB2zSQLParser.GrantSystemAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantSystemAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantSystemAuthority(DB2zSQLParser.GrantSystemAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantSequenceAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantSequenceAuthority(DB2zSQLParser.GrantSequenceAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantSequenceAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantSequenceAuthority(DB2zSQLParser.GrantSequenceAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantSchemaAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantSchemaAuthority(DB2zSQLParser.GrantSchemaAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantSchemaAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantSchemaAuthority(DB2zSQLParser.GrantSchemaAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantPlanAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantPlanAuthority(DB2zSQLParser.GrantPlanAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantPlanAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantPlanAuthority(DB2zSQLParser.GrantPlanAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantPackageAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantPackageAuthority(DB2zSQLParser.GrantPackageAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantPackageAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantPackageAuthority(DB2zSQLParser.GrantPackageAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#packageSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPackageSpecification(DB2zSQLParser.PackageSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#packageSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPackageSpecification(DB2zSQLParser.PackageSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecification(DB2zSQLParser.FunctionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecification(DB2zSQLParser.FunctionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(DB2zSQLParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(DB2zSQLParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void enterWithGrantOption(DB2zSQLParser.WithGrantOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void exitWithGrantOption(DB2zSQLParser.WithGrantOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeByOption}.
	 * @param ctx the parse tree
	 */
	void enterRevokeByOption(DB2zSQLParser.RevokeByOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeByOption}.
	 * @param ctx the parse tree
	 */
	void exitRevokeByOption(DB2zSQLParser.RevokeByOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#revokeDependentPrivilegesOption}.
	 * @param ctx the parse tree
	 */
	void enterRevokeDependentPrivilegesOption(DB2zSQLParser.RevokeDependentPrivilegesOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#revokeDependentPrivilegesOption}.
	 * @param ctx the parse tree
	 */
	void exitRevokeDependentPrivilegesOption(DB2zSQLParser.RevokeDependentPrivilegesOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#grantDatabaseAuthority}.
	 * @param ctx the parse tree
	 */
	void enterGrantDatabaseAuthority(DB2zSQLParser.GrantDatabaseAuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#grantDatabaseAuthority}.
	 * @param ctx the parse tree
	 */
	void exitGrantDatabaseAuthority(DB2zSQLParser.GrantDatabaseAuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#statementInformation}.
	 * @param ctx the parse tree
	 */
	void enterStatementInformation(DB2zSQLParser.StatementInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#statementInformation}.
	 * @param ctx the parse tree
	 */
	void exitStatementInformation(DB2zSQLParser.StatementInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#statementInformationVariableEquate}.
	 * @param ctx the parse tree
	 */
	void enterStatementInformationVariableEquate(DB2zSQLParser.StatementInformationVariableEquateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#statementInformationVariableEquate}.
	 * @param ctx the parse tree
	 */
	void exitStatementInformationVariableEquate(DB2zSQLParser.StatementInformationVariableEquateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 */
	void enterStatementInformationItemName(DB2zSQLParser.StatementInformationItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 */
	void exitStatementInformationItemName(DB2zSQLParser.StatementInformationItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#conditionInformation}.
	 * @param ctx the parse tree
	 */
	void enterConditionInformation(DB2zSQLParser.ConditionInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#conditionInformation}.
	 * @param ctx the parse tree
	 */
	void exitConditionInformation(DB2zSQLParser.ConditionInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#conditionInformationVariableEquate}.
	 * @param ctx the parse tree
	 */
	void enterConditionInformationVariableEquate(DB2zSQLParser.ConditionInformationVariableEquateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#conditionInformationVariableEquate}.
	 * @param ctx the parse tree
	 */
	void exitConditionInformationVariableEquate(DB2zSQLParser.ConditionInformationVariableEquateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void enterConditionInformationItemName(DB2zSQLParser.ConditionInformationItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void exitConditionInformationItemName(DB2zSQLParser.ConditionInformationItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#connectionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void enterConnectionInformationItemName(DB2zSQLParser.ConnectionInformationItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#connectionInformationItemName}.
	 * @param ctx the parse tree
	 */
	void exitConnectionInformationItemName(DB2zSQLParser.ConnectionInformationItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#combinedInformation}.
	 * @param ctx the parse tree
	 */
	void enterCombinedInformation(DB2zSQLParser.CombinedInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#combinedInformation}.
	 * @param ctx the parse tree
	 */
	void exitCombinedInformation(DB2zSQLParser.CombinedInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#combinedInformationOption}.
	 * @param ctx the parse tree
	 */
	void enterCombinedInformationOption(DB2zSQLParser.CombinedInformationOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#combinedInformationOption}.
	 * @param ctx the parse tree
	 */
	void exitCombinedInformationOption(DB2zSQLParser.CombinedInformationOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fetchOrientation}.
	 * @param ctx the parse tree
	 */
	void enterFetchOrientation(DB2zSQLParser.FetchOrientationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fetchOrientation}.
	 * @param ctx the parse tree
	 */
	void exitFetchOrientation(DB2zSQLParser.FetchOrientationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rowPositioned}.
	 * @param ctx the parse tree
	 */
	void enterRowPositioned(DB2zSQLParser.RowPositionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rowPositioned}.
	 * @param ctx the parse tree
	 */
	void exitRowPositioned(DB2zSQLParser.RowPositionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rowsetPositioned}.
	 * @param ctx the parse tree
	 */
	void enterRowsetPositioned(DB2zSQLParser.RowsetPositionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rowsetPositioned}.
	 * @param ctx the parse tree
	 */
	void exitRowsetPositioned(DB2zSQLParser.RowsetPositionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#singleRowFetch}.
	 * @param ctx the parse tree
	 */
	void enterSingleRowFetch(DB2zSQLParser.SingleRowFetchContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#singleRowFetch}.
	 * @param ctx the parse tree
	 */
	void exitSingleRowFetch(DB2zSQLParser.SingleRowFetchContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fetchTargetVariable}.
	 * @param ctx the parse tree
	 */
	void enterFetchTargetVariable(DB2zSQLParser.FetchTargetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fetchTargetVariable}.
	 * @param ctx the parse tree
	 */
	void exitFetchTargetVariable(DB2zSQLParser.FetchTargetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#multipleRowFetch}.
	 * @param ctx the parse tree
	 */
	void enterMultipleRowFetch(DB2zSQLParser.MultipleRowFetchContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#multipleRowFetch}.
	 * @param ctx the parse tree
	 */
	void exitMultipleRowFetch(DB2zSQLParser.MultipleRowFetchContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#multipleRowFetchForClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleRowFetchForClause(DB2zSQLParser.MultipleRowFetchForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#multipleRowFetchForClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleRowFetchForClause(DB2zSQLParser.MultipleRowFetchForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#multipleRowFetchIntoClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleRowFetchIntoClause(DB2zSQLParser.MultipleRowFetchIntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#multipleRowFetchIntoClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleRowFetchIntoClause(DB2zSQLParser.MultipleRowFetchIntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#explainPlanClause}.
	 * @param ctx the parse tree
	 */
	void enterExplainPlanClause(DB2zSQLParser.ExplainPlanClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#explainPlanClause}.
	 * @param ctx the parse tree
	 */
	void exitExplainPlanClause(DB2zSQLParser.ExplainPlanClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#explainStmtcacheClause}.
	 * @param ctx the parse tree
	 */
	void enterExplainStmtcacheClause(DB2zSQLParser.ExplainStmtcacheClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#explainStmtcacheClause}.
	 * @param ctx the parse tree
	 */
	void exitExplainStmtcacheClause(DB2zSQLParser.ExplainStmtcacheClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#explainPackageClause}.
	 * @param ctx the parse tree
	 */
	void enterExplainPackageClause(DB2zSQLParser.ExplainPackageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#explainPackageClause}.
	 * @param ctx the parse tree
	 */
	void exitExplainPackageClause(DB2zSQLParser.ExplainPackageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#explainStabilizedDynamicQueryClause}.
	 * @param ctx the parse tree
	 */
	void enterExplainStabilizedDynamicQueryClause(DB2zSQLParser.ExplainStabilizedDynamicQueryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#explainStabilizedDynamicQueryClause}.
	 * @param ctx the parse tree
	 */
	void exitExplainStabilizedDynamicQueryClause(DB2zSQLParser.ExplainStabilizedDynamicQueryClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#packageScopeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPackageScopeSpecification(DB2zSQLParser.PackageScopeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#packageScopeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPackageScopeSpecification(DB2zSQLParser.PackageScopeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#collectionName}.
	 * @param ctx the parse tree
	 */
	void enterCollectionName(DB2zSQLParser.CollectionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#collectionName}.
	 * @param ctx the parse tree
	 */
	void exitCollectionName(DB2zSQLParser.CollectionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#packageScopePackageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageScopePackageName(DB2zSQLParser.PackageScopePackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#packageScopePackageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageScopePackageName(DB2zSQLParser.PackageScopePackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#versionName}.
	 * @param ctx the parse tree
	 */
	void enterVersionName(DB2zSQLParser.VersionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#versionName}.
	 * @param ctx the parse tree
	 */
	void exitVersionName(DB2zSQLParser.VersionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sourceRowData}.
	 * @param ctx the parse tree
	 */
	void enterSourceRowData(DB2zSQLParser.SourceRowDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sourceRowData}.
	 * @param ctx the parse tree
	 */
	void exitSourceRowData(DB2zSQLParser.SourceRowDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aliasDesignation}.
	 * @param ctx the parse tree
	 */
	void enterAliasDesignation(DB2zSQLParser.AliasDesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aliasDesignation}.
	 * @param ctx the parse tree
	 */
	void exitAliasDesignation(DB2zSQLParser.AliasDesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabaseClause(DB2zSQLParser.DropDatabaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropDatabaseClause}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabaseClause(DB2zSQLParser.DropDatabaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterDropFunctionClause(DB2zSQLParser.DropFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitDropFunctionClause(DB2zSQLParser.DropFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropIndexClause}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexClause(DB2zSQLParser.DropIndexClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropIndexClause}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexClause(DB2zSQLParser.DropIndexClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropMaskClause}.
	 * @param ctx the parse tree
	 */
	void enterDropMaskClause(DB2zSQLParser.DropMaskClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropMaskClause}.
	 * @param ctx the parse tree
	 */
	void exitDropMaskClause(DB2zSQLParser.DropMaskClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropPackageClause}.
	 * @param ctx the parse tree
	 */
	void enterDropPackageClause(DB2zSQLParser.DropPackageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropPackageClause}.
	 * @param ctx the parse tree
	 */
	void exitDropPackageClause(DB2zSQLParser.DropPackageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropPermissionClause}.
	 * @param ctx the parse tree
	 */
	void enterDropPermissionClause(DB2zSQLParser.DropPermissionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropPermissionClause}.
	 * @param ctx the parse tree
	 */
	void exitDropPermissionClause(DB2zSQLParser.DropPermissionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropProcedureClause}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedureClause(DB2zSQLParser.DropProcedureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropProcedureClause}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedureClause(DB2zSQLParser.DropProcedureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropRoleClause}.
	 * @param ctx the parse tree
	 */
	void enterDropRoleClause(DB2zSQLParser.DropRoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropRoleClause}.
	 * @param ctx the parse tree
	 */
	void exitDropRoleClause(DB2zSQLParser.DropRoleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropSequenceClause}.
	 * @param ctx the parse tree
	 */
	void enterDropSequenceClause(DB2zSQLParser.DropSequenceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropSequenceClause}.
	 * @param ctx the parse tree
	 */
	void exitDropSequenceClause(DB2zSQLParser.DropSequenceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropStogroupClause}.
	 * @param ctx the parse tree
	 */
	void enterDropStogroupClause(DB2zSQLParser.DropStogroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropStogroupClause}.
	 * @param ctx the parse tree
	 */
	void exitDropStogroupClause(DB2zSQLParser.DropStogroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropSynonymClause}.
	 * @param ctx the parse tree
	 */
	void enterDropSynonymClause(DB2zSQLParser.DropSynonymClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropSynonymClause}.
	 * @param ctx the parse tree
	 */
	void exitDropSynonymClause(DB2zSQLParser.DropSynonymClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropTableClause}.
	 * @param ctx the parse tree
	 */
	void enterDropTableClause(DB2zSQLParser.DropTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropTableClause}.
	 * @param ctx the parse tree
	 */
	void exitDropTableClause(DB2zSQLParser.DropTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropTablespaceClause}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespaceClause(DB2zSQLParser.DropTablespaceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropTablespaceClause}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespaceClause(DB2zSQLParser.DropTablespaceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropTriggerClause}.
	 * @param ctx the parse tree
	 */
	void enterDropTriggerClause(DB2zSQLParser.DropTriggerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropTriggerClause}.
	 * @param ctx the parse tree
	 */
	void exitDropTriggerClause(DB2zSQLParser.DropTriggerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropTrustedContextClause}.
	 * @param ctx the parse tree
	 */
	void enterDropTrustedContextClause(DB2zSQLParser.DropTrustedContextClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropTrustedContextClause}.
	 * @param ctx the parse tree
	 */
	void exitDropTrustedContextClause(DB2zSQLParser.DropTrustedContextClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterDropTypeClause(DB2zSQLParser.DropTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitDropTypeClause(DB2zSQLParser.DropTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropVariableClause}.
	 * @param ctx the parse tree
	 */
	void enterDropVariableClause(DB2zSQLParser.DropVariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropVariableClause}.
	 * @param ctx the parse tree
	 */
	void exitDropVariableClause(DB2zSQLParser.DropVariableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropViewClause}.
	 * @param ctx the parse tree
	 */
	void enterDropViewClause(DB2zSQLParser.DropViewClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropViewClause}.
	 * @param ctx the parse tree
	 */
	void exitDropViewClause(DB2zSQLParser.DropViewClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#packageDesignator}.
	 * @param ctx the parse tree
	 */
	void enterPackageDesignator(DB2zSQLParser.PackageDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#packageDesignator}.
	 * @param ctx the parse tree
	 */
	void exitPackageDesignator(DB2zSQLParser.PackageDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#describeUsingOption}.
	 * @param ctx the parse tree
	 */
	void enterDescribeUsingOption(DB2zSQLParser.DescribeUsingOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#describeUsingOption}.
	 * @param ctx the parse tree
	 */
	void exitDescribeUsingOption(DB2zSQLParser.DescribeUsingOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterDeclareGlobalTemporaryTableLikeClause(DB2zSQLParser.DeclareGlobalTemporaryTableLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitDeclareGlobalTemporaryTableLikeClause(DB2zSQLParser.DeclareGlobalTemporaryTableLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#onCommitClause}.
	 * @param ctx the parse tree
	 */
	void enterOnCommitClause(DB2zSQLParser.OnCommitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#onCommitClause}.
	 * @param ctx the parse tree
	 */
	void exitOnCommitClause(DB2zSQLParser.OnCommitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#loggedWithRollbackClause}.
	 * @param ctx the parse tree
	 */
	void enterLoggedWithRollbackClause(DB2zSQLParser.LoggedWithRollbackClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#loggedWithRollbackClause}.
	 * @param ctx the parse tree
	 */
	void exitLoggedWithRollbackClause(DB2zSQLParser.LoggedWithRollbackClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createViewCheckOptionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewCheckOptionClause(DB2zSQLParser.CreateViewCheckOptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createViewCheckOptionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewCheckOptionClause(DB2zSQLParser.CreateViewCheckOptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextDefaultRoleClause}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextDefaultRoleClause(DB2zSQLParser.TrustedContextDefaultRoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextDefaultRoleClause}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextDefaultRoleClause(DB2zSQLParser.TrustedContextDefaultRoleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextEnableDisableClause}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextEnableDisableClause(DB2zSQLParser.TrustedContextEnableDisableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextEnableDisableClause}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextEnableDisableClause(DB2zSQLParser.TrustedContextEnableDisableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextDefaultSecurityLabelClause}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextDefaultSecurityLabelClause(DB2zSQLParser.TrustedContextDefaultSecurityLabelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextDefaultSecurityLabelClause}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextDefaultSecurityLabelClause(DB2zSQLParser.TrustedContextDefaultSecurityLabelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextAttributesClause}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextAttributesClause(DB2zSQLParser.TrustedContextAttributesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextAttributesClause}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextAttributesClause(DB2zSQLParser.TrustedContextAttributesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextWithUseForClause}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextWithUseForClause(DB2zSQLParser.TrustedContextWithUseForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextWithUseForClause}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextWithUseForClause(DB2zSQLParser.TrustedContextWithUseForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextAttribute1}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextAttribute1(DB2zSQLParser.TrustedContextAttribute1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextAttribute1}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextAttribute1(DB2zSQLParser.TrustedContextAttribute1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextAttribute2}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextAttribute2(DB2zSQLParser.TrustedContextAttribute2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextAttribute2}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextAttribute2(DB2zSQLParser.TrustedContextAttribute2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextUseFor}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextUseFor(DB2zSQLParser.TrustedContextUseForContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextUseFor}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextUseFor(DB2zSQLParser.TrustedContextUseForContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#userOptions}.
	 * @param ctx the parse tree
	 */
	void enterUserOptions(DB2zSQLParser.UserOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#userOptions}.
	 * @param ctx the parse tree
	 */
	void exitUserOptions(DB2zSQLParser.UserOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggerDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTriggerDefinition(DB2zSQLParser.TriggerDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggerDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTriggerDefinition(DB2zSQLParser.TriggerDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggerActivationTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerActivationTime(DB2zSQLParser.TriggerActivationTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggerActivationTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerActivationTime(DB2zSQLParser.TriggerActivationTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(DB2zSQLParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(DB2zSQLParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggerGranularity}.
	 * @param ctx the parse tree
	 */
	void enterTriggerGranularity(DB2zSQLParser.TriggerGranularityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggerGranularity}.
	 * @param ctx the parse tree
	 */
	void exitTriggerGranularity(DB2zSQLParser.TriggerGranularityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggeredAction}.
	 * @param ctx the parse tree
	 */
	void enterTriggeredAction(DB2zSQLParser.TriggeredActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggeredAction}.
	 * @param ctx the parse tree
	 */
	void exitTriggeredAction(DB2zSQLParser.TriggeredActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlTriggerBody}.
	 * @param ctx the parse tree
	 */
	void enterSqlTriggerBody(DB2zSQLParser.SqlTriggerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlTriggerBody}.
	 * @param ctx the parse tree
	 */
	void exitSqlTriggerBody(DB2zSQLParser.SqlTriggerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggeredSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterTriggeredSqlStatement(DB2zSQLParser.TriggeredSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggeredSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitTriggeredSqlStatement(DB2zSQLParser.TriggeredSqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggerDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void enterTriggerDefinitionOption(DB2zSQLParser.TriggerDefinitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggerDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void exitTriggerDefinitionOption(DB2zSQLParser.TriggerDefinitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTableInClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableInClause(DB2zSQLParser.CreateTableInClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTableInClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableInClause(DB2zSQLParser.CreateTableInClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableColumnDefinition(DB2zSQLParser.CreateTableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableColumnDefinition(DB2zSQLParser.CreateTableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#editprocClause}.
	 * @param ctx the parse tree
	 */
	void enterEditprocClause(DB2zSQLParser.EditprocClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#editprocClause}.
	 * @param ctx the parse tree
	 */
	void exitEditprocClause(DB2zSQLParser.EditprocClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#validprocClause}.
	 * @param ctx the parse tree
	 */
	void enterValidprocClause(DB2zSQLParser.ValidprocClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#validprocClause}.
	 * @param ctx the parse tree
	 */
	void exitValidprocClause(DB2zSQLParser.ValidprocClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#auditClause}.
	 * @param ctx the parse tree
	 */
	void enterAuditClause(DB2zSQLParser.AuditClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#auditClause}.
	 * @param ctx the parse tree
	 */
	void exitAuditClause(DB2zSQLParser.AuditClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#obidClause}.
	 * @param ctx the parse tree
	 */
	void enterObidClause(DB2zSQLParser.ObidClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#obidClause}.
	 * @param ctx the parse tree
	 */
	void exitObidClause(DB2zSQLParser.ObidClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dataCaptureClause}.
	 * @param ctx the parse tree
	 */
	void enterDataCaptureClause(DB2zSQLParser.DataCaptureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dataCaptureClause}.
	 * @param ctx the parse tree
	 */
	void exitDataCaptureClause(DB2zSQLParser.DataCaptureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#restrictOnDropClause}.
	 * @param ctx the parse tree
	 */
	void enterRestrictOnDropClause(DB2zSQLParser.RestrictOnDropClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#restrictOnDropClause}.
	 * @param ctx the parse tree
	 */
	void exitRestrictOnDropClause(DB2zSQLParser.RestrictOnDropClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#ccsidClause1}.
	 * @param ctx the parse tree
	 */
	void enterCcsidClause1(DB2zSQLParser.CcsidClause1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#ccsidClause1}.
	 * @param ctx the parse tree
	 */
	void exitCcsidClause1(DB2zSQLParser.CcsidClause1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#ccsidClause2}.
	 * @param ctx the parse tree
	 */
	void enterCcsidClause2(DB2zSQLParser.CcsidClause2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#ccsidClause2}.
	 * @param ctx the parse tree
	 */
	void exitCcsidClause2(DB2zSQLParser.CcsidClause2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#cardinalityClause}.
	 * @param ctx the parse tree
	 */
	void enterCardinalityClause(DB2zSQLParser.CardinalityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#cardinalityClause}.
	 * @param ctx the parse tree
	 */
	void exitCardinalityClause(DB2zSQLParser.CardinalityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#appendClause}.
	 * @param ctx the parse tree
	 */
	void enterAppendClause(DB2zSQLParser.AppendClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#appendClause}.
	 * @param ctx the parse tree
	 */
	void exitAppendClause(DB2zSQLParser.AppendClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#memberClause}.
	 * @param ctx the parse tree
	 */
	void enterMemberClause(DB2zSQLParser.MemberClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#memberClause}.
	 * @param ctx the parse tree
	 */
	void exitMemberClause(DB2zSQLParser.MemberClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trackmodClause}.
	 * @param ctx the parse tree
	 */
	void enterTrackmodClause(DB2zSQLParser.TrackmodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trackmodClause}.
	 * @param ctx the parse tree
	 */
	void exitTrackmodClause(DB2zSQLParser.TrackmodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#pagenumClause}.
	 * @param ctx the parse tree
	 */
	void enterPagenumClause(DB2zSQLParser.PagenumClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#pagenumClause}.
	 * @param ctx the parse tree
	 */
	void exitPagenumClause(DB2zSQLParser.PagenumClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fieldprocClause}.
	 * @param ctx the parse tree
	 */
	void enterFieldprocClause(DB2zSQLParser.FieldprocClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fieldprocClause}.
	 * @param ctx the parse tree
	 */
	void exitFieldprocClause(DB2zSQLParser.FieldprocClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asSecurityLabelClause}.
	 * @param ctx the parse tree
	 */
	void enterAsSecurityLabelClause(DB2zSQLParser.AsSecurityLabelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asSecurityLabelClause}.
	 * @param ctx the parse tree
	 */
	void exitAsSecurityLabelClause(DB2zSQLParser.AsSecurityLabelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#implicitlyHiddenClause}.
	 * @param ctx the parse tree
	 */
	void enterImplicitlyHiddenClause(DB2zSQLParser.ImplicitlyHiddenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#implicitlyHiddenClause}.
	 * @param ctx the parse tree
	 */
	void exitImplicitlyHiddenClause(DB2zSQLParser.ImplicitlyHiddenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#inlineLengthClause}.
	 * @param ctx the parse tree
	 */
	void enterInlineLengthClause(DB2zSQLParser.InlineLengthClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#inlineLengthClause}.
	 * @param ctx the parse tree
	 */
	void exitInlineLengthClause(DB2zSQLParser.InlineLengthClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#copyOptions}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptions(DB2zSQLParser.CopyOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#copyOptions}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptions(DB2zSQLParser.CopyOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#copyOptionIdentity}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptionIdentity(DB2zSQLParser.CopyOptionIdentityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#copyOptionIdentity}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptionIdentity(DB2zSQLParser.CopyOptionIdentityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#copyOptionRowChangeTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptionRowChangeTimestamp(DB2zSQLParser.CopyOptionRowChangeTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#copyOptionRowChangeTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptionRowChangeTimestamp(DB2zSQLParser.CopyOptionRowChangeTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#copyOptionColumnDefaults}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptionColumnDefaults(DB2zSQLParser.CopyOptionColumnDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#copyOptionColumnDefaults}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptionColumnDefaults(DB2zSQLParser.CopyOptionColumnDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#copyOptionXmlTypeModifiers}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptionXmlTypeModifiers(DB2zSQLParser.CopyOptionXmlTypeModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#copyOptionXmlTypeModifiers}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptionXmlTypeModifiers(DB2zSQLParser.CopyOptionXmlTypeModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asResultTable}.
	 * @param ctx the parse tree
	 */
	void enterAsResultTable(DB2zSQLParser.AsResultTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asResultTable}.
	 * @param ctx the parse tree
	 */
	void exitAsResultTable(DB2zSQLParser.AsResultTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableAsResultTable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareGlobalTemporaryTableAsResultTable(DB2zSQLParser.DeclareGlobalTemporaryTableAsResultTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableAsResultTable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareGlobalTemporaryTableAsResultTable(DB2zSQLParser.DeclareGlobalTemporaryTableAsResultTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTableMaterializedQueryDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableMaterializedQueryDefinition(DB2zSQLParser.CreateTableMaterializedQueryDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTableMaterializedQueryDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableMaterializedQueryDefinition(DB2zSQLParser.CreateTableMaterializedQueryDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTableColumnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableColumnConstraint(DB2zSQLParser.CreateTableColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTableColumnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableColumnConstraint(DB2zSQLParser.CreateTableColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#organizationClause}.
	 * @param ctx the parse tree
	 */
	void enterOrganizationClause(DB2zSQLParser.OrganizationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#organizationClause}.
	 * @param ctx the parse tree
	 */
	void exitOrganizationClause(DB2zSQLParser.OrganizationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createGlobalTemporaryTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateGlobalTemporaryTableColumnDefinition(DB2zSQLParser.CreateGlobalTemporaryTableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createGlobalTemporaryTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateGlobalTemporaryTableColumnDefinition(DB2zSQLParser.CreateGlobalTemporaryTableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDeclareGlobalTemporaryTableColumnDefinition(DB2zSQLParser.DeclareGlobalTemporaryTableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDeclareGlobalTemporaryTableColumnDefinition(DB2zSQLParser.DeclareGlobalTemporaryTableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterDeclaration1}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration1(DB2zSQLParser.ParameterDeclaration1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterDeclaration1}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration1(DB2zSQLParser.ParameterDeclaration1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterDeclaration2}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration2(DB2zSQLParser.ParameterDeclaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterDeclaration2}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration2(DB2zSQLParser.ParameterDeclaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterDeclaration3}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration3(DB2zSQLParser.ParameterDeclaration3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterDeclaration3}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration3(DB2zSQLParser.ParameterDeclaration3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalScalarOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementExternalScalarOptions(DB2zSQLParser.CreateFunctionStatementExternalScalarOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalScalarOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementExternalScalarOptions(DB2zSQLParser.CreateFunctionStatementExternalScalarOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#externalNameOption1}.
	 * @param ctx the parse tree
	 */
	void enterExternalNameOption1(DB2zSQLParser.ExternalNameOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#externalNameOption1}.
	 * @param ctx the parse tree
	 */
	void exitExternalNameOption1(DB2zSQLParser.ExternalNameOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#externalNameOption2}.
	 * @param ctx the parse tree
	 */
	void enterExternalNameOption2(DB2zSQLParser.ExternalNameOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#externalNameOption2}.
	 * @param ctx the parse tree
	 */
	void exitExternalNameOption2(DB2zSQLParser.ExternalNameOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dynamicResultSetOption}.
	 * @param ctx the parse tree
	 */
	void enterDynamicResultSetOption(DB2zSQLParser.DynamicResultSetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dynamicResultSetOption}.
	 * @param ctx the parse tree
	 */
	void exitDynamicResultSetOption(DB2zSQLParser.DynamicResultSetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#languageOption1}.
	 * @param ctx the parse tree
	 */
	void enterLanguageOption1(DB2zSQLParser.LanguageOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#languageOption1}.
	 * @param ctx the parse tree
	 */
	void exitLanguageOption1(DB2zSQLParser.LanguageOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#languageOption2}.
	 * @param ctx the parse tree
	 */
	void enterLanguageOption2(DB2zSQLParser.LanguageOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#languageOption2}.
	 * @param ctx the parse tree
	 */
	void exitLanguageOption2(DB2zSQLParser.LanguageOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#languageOption3}.
	 * @param ctx the parse tree
	 */
	void enterLanguageOption3(DB2zSQLParser.LanguageOption3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#languageOption3}.
	 * @param ctx the parse tree
	 */
	void exitLanguageOption3(DB2zSQLParser.LanguageOption3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#languageOption4}.
	 * @param ctx the parse tree
	 */
	void enterLanguageOption4(DB2zSQLParser.LanguageOption4Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#languageOption4}.
	 * @param ctx the parse tree
	 */
	void exitLanguageOption4(DB2zSQLParser.LanguageOption4Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#languageOption5}.
	 * @param ctx the parse tree
	 */
	void enterLanguageOption5(DB2zSQLParser.LanguageOption5Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#languageOption5}.
	 * @param ctx the parse tree
	 */
	void exitLanguageOption5(DB2zSQLParser.LanguageOption5Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterStyleOption1}.
	 * @param ctx the parse tree
	 */
	void enterParameterStyleOption1(DB2zSQLParser.ParameterStyleOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterStyleOption1}.
	 * @param ctx the parse tree
	 */
	void exitParameterStyleOption1(DB2zSQLParser.ParameterStyleOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterStyleOption2}.
	 * @param ctx the parse tree
	 */
	void enterParameterStyleOption2(DB2zSQLParser.ParameterStyleOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterStyleOption2}.
	 * @param ctx the parse tree
	 */
	void exitParameterStyleOption2(DB2zSQLParser.ParameterStyleOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterStyleOption3}.
	 * @param ctx the parse tree
	 */
	void enterParameterStyleOption3(DB2zSQLParser.ParameterStyleOption3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterStyleOption3}.
	 * @param ctx the parse tree
	 */
	void exitParameterStyleOption3(DB2zSQLParser.ParameterStyleOption3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#deterministicOption}.
	 * @param ctx the parse tree
	 */
	void enterDeterministicOption(DB2zSQLParser.DeterministicOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#deterministicOption}.
	 * @param ctx the parse tree
	 */
	void exitDeterministicOption(DB2zSQLParser.DeterministicOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fencedOption}.
	 * @param ctx the parse tree
	 */
	void enterFencedOption(DB2zSQLParser.FencedOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fencedOption}.
	 * @param ctx the parse tree
	 */
	void exitFencedOption(DB2zSQLParser.FencedOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nullInputOption1}.
	 * @param ctx the parse tree
	 */
	void enterNullInputOption1(DB2zSQLParser.NullInputOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nullInputOption1}.
	 * @param ctx the parse tree
	 */
	void exitNullInputOption1(DB2zSQLParser.NullInputOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nullInputOption2}.
	 * @param ctx the parse tree
	 */
	void enterNullInputOption2(DB2zSQLParser.NullInputOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nullInputOption2}.
	 * @param ctx the parse tree
	 */
	void exitNullInputOption2(DB2zSQLParser.NullInputOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#debugOption}.
	 * @param ctx the parse tree
	 */
	void enterDebugOption(DB2zSQLParser.DebugOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#debugOption}.
	 * @param ctx the parse tree
	 */
	void exitDebugOption(DB2zSQLParser.DebugOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlDataOption1}.
	 * @param ctx the parse tree
	 */
	void enterSqlDataOption1(DB2zSQLParser.SqlDataOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlDataOption1}.
	 * @param ctx the parse tree
	 */
	void exitSqlDataOption1(DB2zSQLParser.SqlDataOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlDataOption2}.
	 * @param ctx the parse tree
	 */
	void enterSqlDataOption2(DB2zSQLParser.SqlDataOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlDataOption2}.
	 * @param ctx the parse tree
	 */
	void exitSqlDataOption2(DB2zSQLParser.SqlDataOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlDataOption3}.
	 * @param ctx the parse tree
	 */
	void enterSqlDataOption3(DB2zSQLParser.SqlDataOption3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlDataOption3}.
	 * @param ctx the parse tree
	 */
	void exitSqlDataOption3(DB2zSQLParser.SqlDataOption3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#externalActionOption}.
	 * @param ctx the parse tree
	 */
	void enterExternalActionOption(DB2zSQLParser.ExternalActionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#externalActionOption}.
	 * @param ctx the parse tree
	 */
	void exitExternalActionOption(DB2zSQLParser.ExternalActionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#packagePathOption}.
	 * @param ctx the parse tree
	 */
	void enterPackagePathOption(DB2zSQLParser.PackagePathOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#packagePathOption}.
	 * @param ctx the parse tree
	 */
	void exitPackagePathOption(DB2zSQLParser.PackagePathOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#scratchpadOption}.
	 * @param ctx the parse tree
	 */
	void enterScratchpadOption(DB2zSQLParser.ScratchpadOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#scratchpadOption}.
	 * @param ctx the parse tree
	 */
	void exitScratchpadOption(DB2zSQLParser.ScratchpadOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#finalCallOption}.
	 * @param ctx the parse tree
	 */
	void enterFinalCallOption(DB2zSQLParser.FinalCallOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#finalCallOption}.
	 * @param ctx the parse tree
	 */
	void exitFinalCallOption(DB2zSQLParser.FinalCallOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parallelOption1}.
	 * @param ctx the parse tree
	 */
	void enterParallelOption1(DB2zSQLParser.ParallelOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parallelOption1}.
	 * @param ctx the parse tree
	 */
	void exitParallelOption1(DB2zSQLParser.ParallelOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parallelOption2}.
	 * @param ctx the parse tree
	 */
	void enterParallelOption2(DB2zSQLParser.ParallelOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parallelOption2}.
	 * @param ctx the parse tree
	 */
	void exitParallelOption2(DB2zSQLParser.ParallelOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dbinfoOption}.
	 * @param ctx the parse tree
	 */
	void enterDbinfoOption(DB2zSQLParser.DbinfoOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dbinfoOption}.
	 * @param ctx the parse tree
	 */
	void exitDbinfoOption(DB2zSQLParser.DbinfoOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#cardinalityOption}.
	 * @param ctx the parse tree
	 */
	void enterCardinalityOption(DB2zSQLParser.CardinalityOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#cardinalityOption}.
	 * @param ctx the parse tree
	 */
	void exitCardinalityOption(DB2zSQLParser.CardinalityOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#collectionIdOption}.
	 * @param ctx the parse tree
	 */
	void enterCollectionIdOption(DB2zSQLParser.CollectionIdOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#collectionIdOption}.
	 * @param ctx the parse tree
	 */
	void exitCollectionIdOption(DB2zSQLParser.CollectionIdOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#wlmEnvironmentOption1}.
	 * @param ctx the parse tree
	 */
	void enterWlmEnvironmentOption1(DB2zSQLParser.WlmEnvironmentOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#wlmEnvironmentOption1}.
	 * @param ctx the parse tree
	 */
	void exitWlmEnvironmentOption1(DB2zSQLParser.WlmEnvironmentOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#wlmEnvironmentOption2}.
	 * @param ctx the parse tree
	 */
	void enterWlmEnvironmentOption2(DB2zSQLParser.WlmEnvironmentOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#wlmEnvironmentOption2}.
	 * @param ctx the parse tree
	 */
	void exitWlmEnvironmentOption2(DB2zSQLParser.WlmEnvironmentOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asuTimeOption}.
	 * @param ctx the parse tree
	 */
	void enterAsuTimeOption(DB2zSQLParser.AsuTimeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asuTimeOption}.
	 * @param ctx the parse tree
	 */
	void exitAsuTimeOption(DB2zSQLParser.AsuTimeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#stayResidentOption}.
	 * @param ctx the parse tree
	 */
	void enterStayResidentOption(DB2zSQLParser.StayResidentOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#stayResidentOption}.
	 * @param ctx the parse tree
	 */
	void exitStayResidentOption(DB2zSQLParser.StayResidentOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#programTypeOption}.
	 * @param ctx the parse tree
	 */
	void enterProgramTypeOption(DB2zSQLParser.ProgramTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#programTypeOption}.
	 * @param ctx the parse tree
	 */
	void exitProgramTypeOption(DB2zSQLParser.ProgramTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#securityOption}.
	 * @param ctx the parse tree
	 */
	void enterSecurityOption(DB2zSQLParser.SecurityOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#securityOption}.
	 * @param ctx the parse tree
	 */
	void exitSecurityOption(DB2zSQLParser.SecurityOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#stopAfterFailureOption}.
	 * @param ctx the parse tree
	 */
	void enterStopAfterFailureOption(DB2zSQLParser.StopAfterFailureOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#stopAfterFailureOption}.
	 * @param ctx the parse tree
	 */
	void exitStopAfterFailureOption(DB2zSQLParser.StopAfterFailureOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#runOptionsOption}.
	 * @param ctx the parse tree
	 */
	void enterRunOptionsOption(DB2zSQLParser.RunOptionsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#runOptionsOption}.
	 * @param ctx the parse tree
	 */
	void exitRunOptionsOption(DB2zSQLParser.RunOptionsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#commitOnReturnOption}.
	 * @param ctx the parse tree
	 */
	void enterCommitOnReturnOption(DB2zSQLParser.CommitOnReturnOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#commitOnReturnOption}.
	 * @param ctx the parse tree
	 */
	void exitCommitOnReturnOption(DB2zSQLParser.CommitOnReturnOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#specialRegistersOption}.
	 * @param ctx the parse tree
	 */
	void enterSpecialRegistersOption(DB2zSQLParser.SpecialRegistersOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#specialRegistersOption}.
	 * @param ctx the parse tree
	 */
	void exitSpecialRegistersOption(DB2zSQLParser.SpecialRegistersOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dispatchOption}.
	 * @param ctx the parse tree
	 */
	void enterDispatchOption(DB2zSQLParser.DispatchOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dispatchOption}.
	 * @param ctx the parse tree
	 */
	void exitDispatchOption(DB2zSQLParser.DispatchOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#securedOption}.
	 * @param ctx the parse tree
	 */
	void enterSecuredOption(DB2zSQLParser.SecuredOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#securedOption}.
	 * @param ctx the parse tree
	 */
	void exitSecuredOption(DB2zSQLParser.SecuredOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#specificNameOption1}.
	 * @param ctx the parse tree
	 */
	void enterSpecificNameOption1(DB2zSQLParser.SpecificNameOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#specificNameOption1}.
	 * @param ctx the parse tree
	 */
	void exitSpecificNameOption1(DB2zSQLParser.SpecificNameOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#specificNameOption2}.
	 * @param ctx the parse tree
	 */
	void enterSpecificNameOption2(DB2zSQLParser.SpecificNameOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#specificNameOption2}.
	 * @param ctx the parse tree
	 */
	void exitSpecificNameOption2(DB2zSQLParser.SpecificNameOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterOption1}.
	 * @param ctx the parse tree
	 */
	void enterParameterOption1(DB2zSQLParser.ParameterOption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterOption1}.
	 * @param ctx the parse tree
	 */
	void exitParameterOption1(DB2zSQLParser.ParameterOption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterOption2}.
	 * @param ctx the parse tree
	 */
	void enterParameterOption2(DB2zSQLParser.ParameterOption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterOption2}.
	 * @param ctx the parse tree
	 */
	void exitParameterOption2(DB2zSQLParser.ParameterOption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalTableOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementExternalTableOptions(DB2zSQLParser.CreateFunctionStatementExternalTableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalTableOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementExternalTableOptions(DB2zSQLParser.CreateFunctionStatementExternalTableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementSourcedOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementSourcedOptions(DB2zSQLParser.CreateFunctionStatementSourcedOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementSourcedOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementSourcedOptions(DB2zSQLParser.CreateFunctionStatementSourcedOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createFunctionStatementInlineSqlScalarOptions}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatementInlineSqlScalarOptions(DB2zSQLParser.CreateFunctionStatementInlineSqlScalarOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementInlineSqlScalarOptions}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatementInlineSqlScalarOptions(DB2zSQLParser.CreateFunctionStatementInlineSqlScalarOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sequenceAlias}.
	 * @param ctx the parse tree
	 */
	void enterSequenceAlias(DB2zSQLParser.SequenceAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sequenceAlias}.
	 * @param ctx the parse tree
	 */
	void exitSequenceAlias(DB2zSQLParser.SequenceAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(DB2zSQLParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(DB2zSQLParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#authorization}.
	 * @param ctx the parse tree
	 */
	void enterAuthorization(DB2zSQLParser.AuthorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#authorization}.
	 * @param ctx the parse tree
	 */
	void exitAuthorization(DB2zSQLParser.AuthorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#searchedDelete}.
	 * @param ctx the parse tree
	 */
	void enterSearchedDelete(DB2zSQLParser.SearchedDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#searchedDelete}.
	 * @param ctx the parse tree
	 */
	void exitSearchedDelete(DB2zSQLParser.SearchedDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#positionedDelete}.
	 * @param ctx the parse tree
	 */
	void enterPositionedDelete(DB2zSQLParser.PositionedDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#positionedDelete}.
	 * @param ctx the parse tree
	 */
	void exitPositionedDelete(DB2zSQLParser.PositionedDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#searchedUpdate}.
	 * @param ctx the parse tree
	 */
	void enterSearchedUpdate(DB2zSQLParser.SearchedUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#searchedUpdate}.
	 * @param ctx the parse tree
	 */
	void exitSearchedUpdate(DB2zSQLParser.SearchedUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#positionedUpdate}.
	 * @param ctx the parse tree
	 */
	void enterPositionedUpdate(DB2zSQLParser.PositionedUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#positionedUpdate}.
	 * @param ctx the parse tree
	 */
	void exitPositionedUpdate(DB2zSQLParser.PositionedUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sourceValues}.
	 * @param ctx the parse tree
	 */
	void enterSourceValues(DB2zSQLParser.SourceValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sourceValues}.
	 * @param ctx the parse tree
	 */
	void exitSourceValues(DB2zSQLParser.SourceValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesSingleRow}.
	 * @param ctx the parse tree
	 */
	void enterValuesSingleRow(DB2zSQLParser.ValuesSingleRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesSingleRow}.
	 * @param ctx the parse tree
	 */
	void exitValuesSingleRow(DB2zSQLParser.ValuesSingleRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesMultipleRow}.
	 * @param ctx the parse tree
	 */
	void enterValuesMultipleRow(DB2zSQLParser.ValuesMultipleRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesMultipleRow}.
	 * @param ctx the parse tree
	 */
	void exitValuesMultipleRow(DB2zSQLParser.ValuesMultipleRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#matchingCondition}.
	 * @param ctx the parse tree
	 */
	void enterMatchingCondition(DB2zSQLParser.MatchingConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#matchingCondition}.
	 * @param ctx the parse tree
	 */
	void exitMatchingCondition(DB2zSQLParser.MatchingConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#modificationOperation}.
	 * @param ctx the parse tree
	 */
	void enterModificationOperation(DB2zSQLParser.ModificationOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#modificationOperation}.
	 * @param ctx the parse tree
	 */
	void exitModificationOperation(DB2zSQLParser.ModificationOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#assignmentClause}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentClause(DB2zSQLParser.AssignmentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#assignmentClause}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentClause(DB2zSQLParser.AssignmentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setAssignmentClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentClause(DB2zSQLParser.SetAssignmentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setAssignmentClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentClause(DB2zSQLParser.SetAssignmentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#setAssignmentTargetVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentTargetVariable(DB2zSQLParser.SetAssignmentTargetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#setAssignmentTargetVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentTargetVariable(DB2zSQLParser.SetAssignmentTargetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#updateOperation}.
	 * @param ctx the parse tree
	 */
	void enterUpdateOperation(DB2zSQLParser.UpdateOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#updateOperation}.
	 * @param ctx the parse tree
	 */
	void exitUpdateOperation(DB2zSQLParser.UpdateOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#deleteOperation}.
	 * @param ctx the parse tree
	 */
	void enterDeleteOperation(DB2zSQLParser.DeleteOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#deleteOperation}.
	 * @param ctx the parse tree
	 */
	void exitDeleteOperation(DB2zSQLParser.DeleteOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#insertOperation}.
	 * @param ctx the parse tree
	 */
	void enterInsertOperation(DB2zSQLParser.InsertOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#insertOperation}.
	 * @param ctx the parse tree
	 */
	void exitInsertOperation(DB2zSQLParser.InsertOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#signalInformation}.
	 * @param ctx the parse tree
	 */
	void enterSignalInformation(DB2zSQLParser.SignalInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#signalInformation}.
	 * @param ctx the parse tree
	 */
	void exitSignalInformation(DB2zSQLParser.SignalInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesList1}.
	 * @param ctx the parse tree
	 */
	void enterValuesList1(DB2zSQLParser.ValuesList1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesList1}.
	 * @param ctx the parse tree
	 */
	void exitValuesList1(DB2zSQLParser.ValuesList1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesList2}.
	 * @param ctx the parse tree
	 */
	void enterValuesList2(DB2zSQLParser.ValuesList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesList2}.
	 * @param ctx the parse tree
	 */
	void exitValuesList2(DB2zSQLParser.ValuesList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesList3}.
	 * @param ctx the parse tree
	 */
	void enterValuesList3(DB2zSQLParser.ValuesList3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesList3}.
	 * @param ctx the parse tree
	 */
	void exitValuesList3(DB2zSQLParser.ValuesList3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesList4}.
	 * @param ctx the parse tree
	 */
	void enterValuesList4(DB2zSQLParser.ValuesList4Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesList4}.
	 * @param ctx the parse tree
	 */
	void exitValuesList4(DB2zSQLParser.ValuesList4Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#includeColumns}.
	 * @param ctx the parse tree
	 */
	void enterIncludeColumns(DB2zSQLParser.IncludeColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#includeColumns}.
	 * @param ctx the parse tree
	 */
	void exitIncludeColumns(DB2zSQLParser.IncludeColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#multipleRowInsert}.
	 * @param ctx the parse tree
	 */
	void enterMultipleRowInsert(DB2zSQLParser.MultipleRowInsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#multipleRowInsert}.
	 * @param ctx the parse tree
	 */
	void exitMultipleRowInsert(DB2zSQLParser.MultipleRowInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#regenerateClause}.
	 * @param ctx the parse tree
	 */
	void enterRegenerateClause(DB2zSQLParser.RegenerateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#regenerateClause}.
	 * @param ctx the parse tree
	 */
	void exitRegenerateClause(DB2zSQLParser.RegenerateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterIndexOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexOptions(DB2zSQLParser.AlterIndexOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterIndexOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexOptions(DB2zSQLParser.AlterIndexOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#bufferpoolOption}.
	 * @param ctx the parse tree
	 */
	void enterBufferpoolOption(DB2zSQLParser.BufferpoolOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#bufferpoolOption}.
	 * @param ctx the parse tree
	 */
	void exitBufferpoolOption(DB2zSQLParser.BufferpoolOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#closeOption}.
	 * @param ctx the parse tree
	 */
	void enterCloseOption(DB2zSQLParser.CloseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#closeOption}.
	 * @param ctx the parse tree
	 */
	void exitCloseOption(DB2zSQLParser.CloseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#copyOption}.
	 * @param ctx the parse tree
	 */
	void enterCopyOption(DB2zSQLParser.CopyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#copyOption}.
	 * @param ctx the parse tree
	 */
	void exitCopyOption(DB2zSQLParser.CopyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dssizeOption}.
	 * @param ctx the parse tree
	 */
	void enterDssizeOption(DB2zSQLParser.DssizeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dssizeOption}.
	 * @param ctx the parse tree
	 */
	void exitDssizeOption(DB2zSQLParser.DssizeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#piecesizeOption}.
	 * @param ctx the parse tree
	 */
	void enterPiecesizeOption(DB2zSQLParser.PiecesizeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#piecesizeOption}.
	 * @param ctx the parse tree
	 */
	void exitPiecesizeOption(DB2zSQLParser.PiecesizeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#clusterOption}.
	 * @param ctx the parse tree
	 */
	void enterClusterOption(DB2zSQLParser.ClusterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#clusterOption}.
	 * @param ctx the parse tree
	 */
	void exitClusterOption(DB2zSQLParser.ClusterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#paddedOption}.
	 * @param ctx the parse tree
	 */
	void enterPaddedOption(DB2zSQLParser.PaddedOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#paddedOption}.
	 * @param ctx the parse tree
	 */
	void exitPaddedOption(DB2zSQLParser.PaddedOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#compressOption}.
	 * @param ctx the parse tree
	 */
	void enterCompressOption(DB2zSQLParser.CompressOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#compressOption}.
	 * @param ctx the parse tree
	 */
	void exitCompressOption(DB2zSQLParser.CompressOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#defineOption}.
	 * @param ctx the parse tree
	 */
	void enterDefineOption(DB2zSQLParser.DefineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#defineOption}.
	 * @param ctx the parse tree
	 */
	void exitDefineOption(DB2zSQLParser.DefineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#locksizeOption}.
	 * @param ctx the parse tree
	 */
	void enterLocksizeOption(DB2zSQLParser.LocksizeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#locksizeOption}.
	 * @param ctx the parse tree
	 */
	void exitLocksizeOption(DB2zSQLParser.LocksizeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#lockmaxOption}.
	 * @param ctx the parse tree
	 */
	void enterLockmaxOption(DB2zSQLParser.LockmaxOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#lockmaxOption}.
	 * @param ctx the parse tree
	 */
	void exitLockmaxOption(DB2zSQLParser.LockmaxOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#enableDisableOption}.
	 * @param ctx the parse tree
	 */
	void enterEnableDisableOption(DB2zSQLParser.EnableDisableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#enableDisableOption}.
	 * @param ctx the parse tree
	 */
	void exitEnableDisableOption(DB2zSQLParser.EnableDisableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#loggedOption}.
	 * @param ctx the parse tree
	 */
	void enterLoggedOption(DB2zSQLParser.LoggedOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#loggedOption}.
	 * @param ctx the parse tree
	 */
	void exitLoggedOption(DB2zSQLParser.LoggedOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#notAtomicPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNotAtomicPhrase(DB2zSQLParser.NotAtomicPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#notAtomicPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNotAtomicPhrase(DB2zSQLParser.NotAtomicPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterIndexPartitionOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexPartitionOptions(DB2zSQLParser.AlterIndexPartitionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterIndexPartitionOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexPartitionOptions(DB2zSQLParser.AlterIndexPartitionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#usingSpecification1}.
	 * @param ctx the parse tree
	 */
	void enterUsingSpecification1(DB2zSQLParser.UsingSpecification1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#usingSpecification1}.
	 * @param ctx the parse tree
	 */
	void exitUsingSpecification1(DB2zSQLParser.UsingSpecification1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#freeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterFreeSpecification(DB2zSQLParser.FreeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#freeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitFreeSpecification(DB2zSQLParser.FreeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#gbpcacheSpecification}.
	 * @param ctx the parse tree
	 */
	void enterGbpcacheSpecification(DB2zSQLParser.GbpcacheSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#gbpcacheSpecification}.
	 * @param ctx the parse tree
	 */
	void exitGbpcacheSpecification(DB2zSQLParser.GbpcacheSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionElement}.
	 * @param ctx the parse tree
	 */
	void enterPartitionElement(DB2zSQLParser.PartitionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionElement}.
	 * @param ctx the parse tree
	 */
	void exitPartitionElement(DB2zSQLParser.PartitionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#applCompatValue}.
	 * @param ctx the parse tree
	 */
	void enterApplCompatValue(DB2zSQLParser.ApplCompatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#applCompatValue}.
	 * @param ctx the parse tree
	 */
	void exitApplCompatValue(DB2zSQLParser.ApplCompatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionLevel}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLevel(DB2zSQLParser.FunctionLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionLevel}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLevel(DB2zSQLParser.FunctionLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionParameterType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterType(DB2zSQLParser.FunctionParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionParameterType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterType(DB2zSQLParser.FunctionParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionDataType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDataType(DB2zSQLParser.FunctionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionDataType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDataType(DB2zSQLParser.FunctionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionBuiltInType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBuiltInType(DB2zSQLParser.FunctionBuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionBuiltInType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBuiltInType(DB2zSQLParser.FunctionBuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#procedureBuiltinType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBuiltinType(DB2zSQLParser.ProcedureBuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#procedureBuiltinType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBuiltinType(DB2zSQLParser.ProcedureBuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTypeArrayBuiltinType}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeArrayBuiltinType(DB2zSQLParser.CreateTypeArrayBuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTypeArrayBuiltinType}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeArrayBuiltinType(DB2zSQLParser.CreateTypeArrayBuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTypeArrayBuiltinType2}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeArrayBuiltinType2(DB2zSQLParser.CreateTypeArrayBuiltinType2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTypeArrayBuiltinType2}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeArrayBuiltinType2(DB2zSQLParser.CreateTypeArrayBuiltinType2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createVariableBuiltInType}.
	 * @param ctx the parse tree
	 */
	void enterCreateVariableBuiltInType(DB2zSQLParser.CreateVariableBuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createVariableBuiltInType}.
	 * @param ctx the parse tree
	 */
	void exitCreateVariableBuiltInType(DB2zSQLParser.CreateVariableBuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sourceDataType}.
	 * @param ctx the parse tree
	 */
	void enterSourceDataType(DB2zSQLParser.SourceDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sourceDataType}.
	 * @param ctx the parse tree
	 */
	void exitSourceDataType(DB2zSQLParser.SourceDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionOptionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOptionList(DB2zSQLParser.FunctionOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionOptionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOptionList(DB2zSQLParser.FunctionOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#procedureOptionList}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOptionList(DB2zSQLParser.ProcedureOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#procedureOptionList}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOptionList(DB2zSQLParser.ProcedureOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createProcedureOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedureOptionList(DB2zSQLParser.CreateProcedureOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createProcedureOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedureOptionList(DB2zSQLParser.CreateProcedureOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#procedureDataType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDataType(DB2zSQLParser.ProcedureDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#procedureDataType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDataType(DB2zSQLParser.ProcedureDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterSequenceOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequenceOptionList(DB2zSQLParser.AlterSequenceOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterSequenceOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequenceOptionList(DB2zSQLParser.AlterSequenceOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createSequenceOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequenceOptionList(DB2zSQLParser.CreateSequenceOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createSequenceOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequenceOptionList(DB2zSQLParser.CreateSequenceOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asTypeOption}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeOption(DB2zSQLParser.AsTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asTypeOption}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeOption(DB2zSQLParser.AsTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#startOption}.
	 * @param ctx the parse tree
	 */
	void enterStartOption(DB2zSQLParser.StartOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#startOption}.
	 * @param ctx the parse tree
	 */
	void exitStartOption(DB2zSQLParser.StartOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#restartOption}.
	 * @param ctx the parse tree
	 */
	void enterRestartOption(DB2zSQLParser.RestartOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#restartOption}.
	 * @param ctx the parse tree
	 */
	void exitRestartOption(DB2zSQLParser.RestartOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#incrementOption}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOption(DB2zSQLParser.IncrementOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#incrementOption}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOption(DB2zSQLParser.IncrementOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#minvalueOption}.
	 * @param ctx the parse tree
	 */
	void enterMinvalueOption(DB2zSQLParser.MinvalueOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#minvalueOption}.
	 * @param ctx the parse tree
	 */
	void exitMinvalueOption(DB2zSQLParser.MinvalueOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#maxvalueOption}.
	 * @param ctx the parse tree
	 */
	void enterMaxvalueOption(DB2zSQLParser.MaxvalueOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#maxvalueOption}.
	 * @param ctx the parse tree
	 */
	void exitMaxvalueOption(DB2zSQLParser.MaxvalueOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#cycleOption}.
	 * @param ctx the parse tree
	 */
	void enterCycleOption(DB2zSQLParser.CycleOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#cycleOption}.
	 * @param ctx the parse tree
	 */
	void exitCycleOption(DB2zSQLParser.CycleOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#cacheOption}.
	 * @param ctx the parse tree
	 */
	void enterCacheOption(DB2zSQLParser.CacheOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#cacheOption}.
	 * @param ctx the parse tree
	 */
	void exitCacheOption(DB2zSQLParser.CacheOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#orderOption}.
	 * @param ctx the parse tree
	 */
	void enterOrderOption(DB2zSQLParser.OrderOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#orderOption}.
	 * @param ctx the parse tree
	 */
	void exitOrderOption(DB2zSQLParser.OrderOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#keyLabelOption}.
	 * @param ctx the parse tree
	 */
	void enterKeyLabelOption(DB2zSQLParser.KeyLabelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#keyLabelOption}.
	 * @param ctx the parse tree
	 */
	void exitKeyLabelOption(DB2zSQLParser.KeyLabelOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dataclasOption}.
	 * @param ctx the parse tree
	 */
	void enterDataclasOption(DB2zSQLParser.DataclasOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dataclasOption}.
	 * @param ctx the parse tree
	 */
	void exitDataclasOption(DB2zSQLParser.DataclasOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#mgmtclasOption}.
	 * @param ctx the parse tree
	 */
	void enterMgmtclasOption(DB2zSQLParser.MgmtclasOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#mgmtclasOption}.
	 * @param ctx the parse tree
	 */
	void exitMgmtclasOption(DB2zSQLParser.MgmtclasOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#storclasOption}.
	 * @param ctx the parse tree
	 */
	void enterStorclasOption(DB2zSQLParser.StorclasOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#storclasOption}.
	 * @param ctx the parse tree
	 */
	void exitStorclasOption(DB2zSQLParser.StorclasOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterStogroupOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterStogroupOptionList(DB2zSQLParser.AlterStogroupOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterStogroupOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterStogroupOptionList(DB2zSQLParser.AlterStogroupOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTableOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableOptionList(DB2zSQLParser.AlterTableOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTableOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableOptionList(DB2zSQLParser.AlterTableOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTablespaceOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespaceOptionList(DB2zSQLParser.AlterTablespaceOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTablespaceOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespaceOptionList(DB2zSQLParser.AlterTablespaceOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createTablespaceOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceOptionList(DB2zSQLParser.CreateTablespaceOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createTablespaceOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceOptionList(DB2zSQLParser.CreateTablespaceOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#trustedContextOptionList}.
	 * @param ctx the parse tree
	 */
	void enterTrustedContextOptionList(DB2zSQLParser.TrustedContextOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#trustedContextOptionList}.
	 * @param ctx the parse tree
	 */
	void exitTrustedContextOptionList(DB2zSQLParser.TrustedContextOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#databaseOptionList}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseOptionList(DB2zSQLParser.DatabaseOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#databaseOptionList}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseOptionList(DB2zSQLParser.DatabaseOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createIndexOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexOptionList(DB2zSQLParser.CreateIndexOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createIndexOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexOptionList(DB2zSQLParser.CreateIndexOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#createLobTablespaceOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCreateLobTablespaceOptionList(DB2zSQLParser.CreateLobTablespaceOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#createLobTablespaceOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCreateLobTablespaceOptionList(DB2zSQLParser.CreateLobTablespaceOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#inDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void enterInDatabaseOption(DB2zSQLParser.InDatabaseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#inDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void exitInDatabaseOption(DB2zSQLParser.InDatabaseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#segsizeOption}.
	 * @param ctx the parse tree
	 */
	void enterSegsizeOption(DB2zSQLParser.SegsizeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#segsizeOption}.
	 * @param ctx the parse tree
	 */
	void exitSegsizeOption(DB2zSQLParser.SegsizeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#numpartsOption}.
	 * @param ctx the parse tree
	 */
	void enterNumpartsOption(DB2zSQLParser.NumpartsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#numpartsOption}.
	 * @param ctx the parse tree
	 */
	void exitNumpartsOption(DB2zSQLParser.NumpartsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionByGrowthSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByGrowthSpecification(DB2zSQLParser.PartitionByGrowthSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionByGrowthSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByGrowthSpecification(DB2zSQLParser.PartitionByGrowthSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionByRangeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByRangeSpecification(DB2zSQLParser.PartitionByRangeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionByRangeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByRangeSpecification(DB2zSQLParser.PartitionByRangeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionByRangePartitionPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByRangePartitionPhrase(DB2zSQLParser.PartitionByRangePartitionPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionByRangePartitionPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByRangePartitionPhrase(DB2zSQLParser.PartitionByRangePartitionPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#insertAlgorithmOption}.
	 * @param ctx the parse tree
	 */
	void enterInsertAlgorithmOption(DB2zSQLParser.InsertAlgorithmOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#insertAlgorithmOption}.
	 * @param ctx the parse tree
	 */
	void exitInsertAlgorithmOption(DB2zSQLParser.InsertAlgorithmOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#maxrowsOption}.
	 * @param ctx the parse tree
	 */
	void enterMaxrowsOption(DB2zSQLParser.MaxrowsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#maxrowsOption}.
	 * @param ctx the parse tree
	 */
	void exitMaxrowsOption(DB2zSQLParser.MaxrowsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#maxpartitionsOption}.
	 * @param ctx the parse tree
	 */
	void enterMaxpartitionsOption(DB2zSQLParser.MaxpartitionsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#maxpartitionsOption}.
	 * @param ctx the parse tree
	 */
	void exitMaxpartitionsOption(DB2zSQLParser.MaxpartitionsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#usingSpecification2}.
	 * @param ctx the parse tree
	 */
	void enterUsingSpecification2(DB2zSQLParser.UsingSpecification2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#usingSpecification2}.
	 * @param ctx the parse tree
	 */
	void exitUsingSpecification2(DB2zSQLParser.UsingSpecification2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmlIndexSpecification(DB2zSQLParser.XmlIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmlIndexSpecification(DB2zSQLParser.XmlIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlPatternClause}.
	 * @param ctx the parse tree
	 */
	void enterXmlPatternClause(DB2zSQLParser.XmlPatternClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlPatternClause}.
	 * @param ctx the parse tree
	 */
	void exitXmlPatternClause(DB2zSQLParser.XmlPatternClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterAttributesOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterAttributesOptions(DB2zSQLParser.AlterAttributesOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterAttributesOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterAttributesOptions(DB2zSQLParser.AlterAttributesOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#addAttributesOptions}.
	 * @param ctx the parse tree
	 */
	void enterAddAttributesOptions(DB2zSQLParser.AddAttributesOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#addAttributesOptions}.
	 * @param ctx the parse tree
	 */
	void exitAddAttributesOptions(DB2zSQLParser.AddAttributesOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dropAttributesOptions}.
	 * @param ctx the parse tree
	 */
	void enterDropAttributesOptions(DB2zSQLParser.DropAttributesOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dropAttributesOptions}.
	 * @param ctx the parse tree
	 */
	void exitDropAttributesOptions(DB2zSQLParser.DropAttributesOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#includeColumnPhrase}.
	 * @param ctx the parse tree
	 */
	void enterIncludeColumnPhrase(DB2zSQLParser.IncludeColumnPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#includeColumnPhrase}.
	 * @param ctx the parse tree
	 */
	void exitIncludeColumnPhrase(DB2zSQLParser.IncludeColumnPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#userClause}.
	 * @param ctx the parse tree
	 */
	void enterUserClause(DB2zSQLParser.UserClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#userClause}.
	 * @param ctx the parse tree
	 */
	void exitUserClause(DB2zSQLParser.UserClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#userClauseAddOptions}.
	 * @param ctx the parse tree
	 */
	void enterUserClauseAddOptions(DB2zSQLParser.UserClauseAddOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#userClauseAddOptions}.
	 * @param ctx the parse tree
	 */
	void exitUserClauseAddOptions(DB2zSQLParser.UserClauseAddOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#userClauseReplaceOptions}.
	 * @param ctx the parse tree
	 */
	void enterUserClauseReplaceOptions(DB2zSQLParser.UserClauseReplaceOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#userClauseReplaceOptions}.
	 * @param ctx the parse tree
	 */
	void exitUserClauseReplaceOptions(DB2zSQLParser.UserClauseReplaceOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#userClauseDropOptions}.
	 * @param ctx the parse tree
	 */
	void enterUserClauseDropOptions(DB2zSQLParser.UserClauseDropOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#userClauseDropOptions}.
	 * @param ctx the parse tree
	 */
	void exitUserClauseDropOptions(DB2zSQLParser.UserClauseDropOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#useOptions}.
	 * @param ctx the parse tree
	 */
	void enterUseOptions(DB2zSQLParser.UseOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#useOptions}.
	 * @param ctx the parse tree
	 */
	void exitUseOptions(DB2zSQLParser.UseOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterPartitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterPartitionClause(DB2zSQLParser.AlterPartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterPartitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterPartitionClause(DB2zSQLParser.AlterPartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#usingBlock}.
	 * @param ctx the parse tree
	 */
	void enterUsingBlock(DB2zSQLParser.UsingBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#usingBlock}.
	 * @param ctx the parse tree
	 */
	void exitUsingBlock(DB2zSQLParser.UsingBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#freeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFreeBlock(DB2zSQLParser.FreeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#freeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFreeBlock(DB2zSQLParser.FreeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#moveTableClause}.
	 * @param ctx the parse tree
	 */
	void enterMoveTableClause(DB2zSQLParser.MoveTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#moveTableClause}.
	 * @param ctx the parse tree
	 */
	void exitMoveTableClause(DB2zSQLParser.MoveTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#gbpcacheBlock}.
	 * @param ctx the parse tree
	 */
	void enterGbpcacheBlock(DB2zSQLParser.GbpcacheBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#gbpcacheBlock}.
	 * @param ctx the parse tree
	 */
	void exitGbpcacheBlock(DB2zSQLParser.GbpcacheBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aliasDesignator}.
	 * @param ctx the parse tree
	 */
	void enterAliasDesignator(DB2zSQLParser.AliasDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aliasDesignator}.
	 * @param ctx the parse tree
	 */
	void exitAliasDesignator(DB2zSQLParser.AliasDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#multipleColumnList}.
	 * @param ctx the parse tree
	 */
	void enterMultipleColumnList(DB2zSQLParser.MultipleColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#multipleColumnList}.
	 * @param ctx the parse tree
	 */
	void exitMultipleColumnList(DB2zSQLParser.MultipleColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(DB2zSQLParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(DB2zSQLParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(DB2zSQLParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(DB2zSQLParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinitionOptionList1}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableColumnDefinitionOptionList1(DB2zSQLParser.AlterTableColumnDefinitionOptionList1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinitionOptionList1}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableColumnDefinitionOptionList1(DB2zSQLParser.AlterTableColumnDefinitionOptionList1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinitionOptionList2}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableColumnDefinitionOptionList2(DB2zSQLParser.AlterTableColumnDefinitionOptionList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinitionOptionList2}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableColumnDefinitionOptionList2(DB2zSQLParser.AlterTableColumnDefinitionOptionList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(DB2zSQLParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(DB2zSQLParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#generatedClause}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedClause(DB2zSQLParser.GeneratedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#generatedClause}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedClause(DB2zSQLParser.GeneratedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#generatedClause2}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedClause2(DB2zSQLParser.GeneratedClause2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#generatedClause2}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedClause2(DB2zSQLParser.GeneratedClause2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asIdentityClause}.
	 * @param ctx the parse tree
	 */
	void enterAsIdentityClause(DB2zSQLParser.AsIdentityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asIdentityClause}.
	 * @param ctx the parse tree
	 */
	void exitAsIdentityClause(DB2zSQLParser.AsIdentityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asIdentityClauseOptionList}.
	 * @param ctx the parse tree
	 */
	void enterAsIdentityClauseOptionList(DB2zSQLParser.AsIdentityClauseOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asIdentityClauseOptionList}.
	 * @param ctx the parse tree
	 */
	void exitAsIdentityClauseOptionList(DB2zSQLParser.AsIdentityClauseOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asRowChangeTimestampClause}.
	 * @param ctx the parse tree
	 */
	void enterAsRowChangeTimestampClause(DB2zSQLParser.AsRowChangeTimestampClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asRowChangeTimestampClause}.
	 * @param ctx the parse tree
	 */
	void exitAsRowChangeTimestampClause(DB2zSQLParser.AsRowChangeTimestampClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asRowTransactionStartIDClause}.
	 * @param ctx the parse tree
	 */
	void enterAsRowTransactionStartIDClause(DB2zSQLParser.AsRowTransactionStartIDClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asRowTransactionStartIDClause}.
	 * @param ctx the parse tree
	 */
	void exitAsRowTransactionStartIDClause(DB2zSQLParser.AsRowTransactionStartIDClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asRowTransactionTimestampClause}.
	 * @param ctx the parse tree
	 */
	void enterAsRowTransactionTimestampClause(DB2zSQLParser.AsRowTransactionTimestampClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asRowTransactionTimestampClause}.
	 * @param ctx the parse tree
	 */
	void exitAsRowTransactionTimestampClause(DB2zSQLParser.AsRowTransactionTimestampClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#asGeneratedExpressionClause}.
	 * @param ctx the parse tree
	 */
	void enterAsGeneratedExpressionClause(DB2zSQLParser.AsGeneratedExpressionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#asGeneratedExpressionClause}.
	 * @param ctx the parse tree
	 */
	void exitAsGeneratedExpressionClause(DB2zSQLParser.AsGeneratedExpressionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nonDeterministicExpression}.
	 * @param ctx the parse tree
	 */
	void enterNonDeterministicExpression(DB2zSQLParser.NonDeterministicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nonDeterministicExpression}.
	 * @param ctx the parse tree
	 */
	void exitNonDeterministicExpression(DB2zSQLParser.NonDeterministicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nonDeterministicExpressionSessionVariable}.
	 * @param ctx the parse tree
	 */
	void enterNonDeterministicExpressionSessionVariable(DB2zSQLParser.NonDeterministicExpressionSessionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nonDeterministicExpressionSessionVariable}.
	 * @param ctx the parse tree
	 */
	void exitNonDeterministicExpressionSessionVariable(DB2zSQLParser.NonDeterministicExpressionSessionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#columnAlteration}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlteration(DB2zSQLParser.ColumnAlterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#columnAlteration}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlteration(DB2zSQLParser.ColumnAlterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#columnAlterationOptionList}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlterationOptionList(DB2zSQLParser.ColumnAlterationOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#columnAlterationOptionList}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlterationOptionList(DB2zSQLParser.ColumnAlterationOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alteredDataType}.
	 * @param ctx the parse tree
	 */
	void enterAlteredDataType(DB2zSQLParser.AlteredDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alteredDataType}.
	 * @param ctx the parse tree
	 */
	void exitAlteredDataType(DB2zSQLParser.AlteredDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(DB2zSQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(DB2zSQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(DB2zSQLParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(DB2zSQLParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sequenceDataType}.
	 * @param ctx the parse tree
	 */
	void enterSequenceDataType(DB2zSQLParser.SequenceDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sequenceDataType}.
	 * @param ctx the parse tree
	 */
	void exitSequenceDataType(DB2zSQLParser.SequenceDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sequenceBuiltInType}.
	 * @param ctx the parse tree
	 */
	void enterSequenceBuiltInType(DB2zSQLParser.SequenceBuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sequenceBuiltInType}.
	 * @param ctx the parse tree
	 */
	void exitSequenceBuiltInType(DB2zSQLParser.SequenceBuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlDataType}.
	 * @param ctx the parse tree
	 */
	void enterSqlDataType(DB2zSQLParser.SqlDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlDataType}.
	 * @param ctx the parse tree
	 */
	void exitSqlDataType(DB2zSQLParser.SqlDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlTypeModifier}.
	 * @param ctx the parse tree
	 */
	void enterXmlTypeModifier(DB2zSQLParser.XmlTypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlTypeModifier}.
	 * @param ctx the parse tree
	 */
	void exitXmlTypeModifier(DB2zSQLParser.XmlTypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlSchemaSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmlSchemaSpecification(DB2zSQLParser.XmlSchemaSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlSchemaSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmlSchemaSpecification(DB2zSQLParser.XmlSchemaSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlElementName}.
	 * @param ctx the parse tree
	 */
	void enterXmlElementName(DB2zSQLParser.XmlElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlElementName}.
	 * @param ctx the parse tree
	 */
	void exitXmlElementName(DB2zSQLParser.XmlElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#piName}.
	 * @param ctx the parse tree
	 */
	void enterPiName(DB2zSQLParser.PiNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#piName}.
	 * @param ctx the parse tree
	 */
	void exitPiName(DB2zSQLParser.PiNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#registeredXmlSchemaName}.
	 * @param ctx the parse tree
	 */
	void enterRegisteredXmlSchemaName(DB2zSQLParser.RegisteredXmlSchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#registeredXmlSchemaName}.
	 * @param ctx the parse tree
	 */
	void exitRegisteredXmlSchemaName(DB2zSQLParser.RegisteredXmlSchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#targetNamespace}.
	 * @param ctx the parse tree
	 */
	void enterTargetNamespace(DB2zSQLParser.TargetNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#targetNamespace}.
	 * @param ctx the parse tree
	 */
	void exitTargetNamespace(DB2zSQLParser.TargetNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#schemaLocation}.
	 * @param ctx the parse tree
	 */
	void enterSchemaLocation(DB2zSQLParser.SchemaLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#schemaLocation}.
	 * @param ctx the parse tree
	 */
	void exitSchemaLocation(DB2zSQLParser.SchemaLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#identityAlteration}.
	 * @param ctx the parse tree
	 */
	void enterIdentityAlteration(DB2zSQLParser.IdentityAlterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#identityAlteration}.
	 * @param ctx the parse tree
	 */
	void exitIdentityAlteration(DB2zSQLParser.IdentityAlterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#uniqueConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueConstraint(DB2zSQLParser.UniqueConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#uniqueConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueConstraint(DB2zSQLParser.UniqueConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#referentialConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferentialConstraint(DB2zSQLParser.ReferentialConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#referentialConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferentialConstraint(DB2zSQLParser.ReferentialConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#referencesClause}.
	 * @param ctx the parse tree
	 */
	void enterReferencesClause(DB2zSQLParser.ReferencesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#referencesClause}.
	 * @param ctx the parse tree
	 */
	void exitReferencesClause(DB2zSQLParser.ReferencesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraint(DB2zSQLParser.CheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraint(DB2zSQLParser.CheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitioningClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitioningClause(DB2zSQLParser.PartitioningClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitioningClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitioningClause(DB2zSQLParser.PartitioningClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpression(DB2zSQLParser.PartitionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpression(DB2zSQLParser.PartitionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionLimitKey}.
	 * @param ctx the parse tree
	 */
	void enterPartitionLimitKey(DB2zSQLParser.PartitionLimitKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionLimitKey}.
	 * @param ctx the parse tree
	 */
	void exitPartitionLimitKey(DB2zSQLParser.PartitionLimitKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitioningPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPartitioningPhrase(DB2zSQLParser.PartitioningPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitioningPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPartitioningPhrase(DB2zSQLParser.PartitioningPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionHashSpace}.
	 * @param ctx the parse tree
	 */
	void enterPartitionHashSpace(DB2zSQLParser.PartitionHashSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionHashSpace}.
	 * @param ctx the parse tree
	 */
	void exitPartitionHashSpace(DB2zSQLParser.PartitionHashSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterHashOrganization}.
	 * @param ctx the parse tree
	 */
	void enterAlterHashOrganization(DB2zSQLParser.AlterHashOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterHashOrganization}.
	 * @param ctx the parse tree
	 */
	void exitAlterHashOrganization(DB2zSQLParser.AlterHashOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitioningClauseElement}.
	 * @param ctx the parse tree
	 */
	void enterPartitioningClauseElement(DB2zSQLParser.PartitioningClauseElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitioningClauseElement}.
	 * @param ctx the parse tree
	 */
	void exitPartitioningClauseElement(DB2zSQLParser.PartitioningClauseElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(DB2zSQLParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(DB2zSQLParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rotatePartitionClause}.
	 * @param ctx the parse tree
	 */
	void enterRotatePartitionClause(DB2zSQLParser.RotatePartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rotatePartitionClause}.
	 * @param ctx the parse tree
	 */
	void exitRotatePartitionClause(DB2zSQLParser.RotatePartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#extraRowOption}.
	 * @param ctx the parse tree
	 */
	void enterExtraRowOption(DB2zSQLParser.ExtraRowOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#extraRowOption}.
	 * @param ctx the parse tree
	 */
	void exitExtraRowOption(DB2zSQLParser.ExtraRowOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#materializedQueryDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedQueryDefinition(DB2zSQLParser.MaterializedQueryDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#materializedQueryDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedQueryDefinition(DB2zSQLParser.MaterializedQueryDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#materializedQueryAlteration}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedQueryAlteration(DB2zSQLParser.MaterializedQueryAlterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#materializedQueryAlteration}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedQueryAlteration(DB2zSQLParser.MaterializedQueryAlterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#refreshableTableOptions}.
	 * @param ctx the parse tree
	 */
	void enterRefreshableTableOptions(DB2zSQLParser.RefreshableTableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#refreshableTableOptions}.
	 * @param ctx the parse tree
	 */
	void exitRefreshableTableOptions(DB2zSQLParser.RefreshableTableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dataInitiallyDeferredPhrase}.
	 * @param ctx the parse tree
	 */
	void enterDataInitiallyDeferredPhrase(DB2zSQLParser.DataInitiallyDeferredPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dataInitiallyDeferredPhrase}.
	 * @param ctx the parse tree
	 */
	void exitDataInitiallyDeferredPhrase(DB2zSQLParser.DataInitiallyDeferredPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#refreshDeferredPhrase}.
	 * @param ctx the parse tree
	 */
	void enterRefreshDeferredPhrase(DB2zSQLParser.RefreshDeferredPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#refreshDeferredPhrase}.
	 * @param ctx the parse tree
	 */
	void exitRefreshDeferredPhrase(DB2zSQLParser.RefreshDeferredPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#refreshableTableOptionsList}.
	 * @param ctx the parse tree
	 */
	void enterRefreshableTableOptionsList(DB2zSQLParser.RefreshableTableOptionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#refreshableTableOptionsList}.
	 * @param ctx the parse tree
	 */
	void exitRefreshableTableOptionsList(DB2zSQLParser.RefreshableTableOptionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#materializedQueryTableAlteration}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedQueryTableAlteration(DB2zSQLParser.MaterializedQueryTableAlterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#materializedQueryTableAlteration}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedQueryTableAlteration(DB2zSQLParser.MaterializedQueryTableAlterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#periodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPeriodDefinition(DB2zSQLParser.PeriodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#periodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPeriodDefinition(DB2zSQLParser.PeriodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableColumnDefinition(DB2zSQLParser.AlterTableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableColumnDefinition(DB2zSQLParser.AlterTableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#externalProgramName}.
	 * @param ctx the parse tree
	 */
	void enterExternalProgramName(DB2zSQLParser.ExternalProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#externalProgramName}.
	 * @param ctx the parse tree
	 */
	void exitExternalProgramName(DB2zSQLParser.ExternalProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void enterPackagePath(DB2zSQLParser.PackagePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void exitPackagePath(DB2zSQLParser.PackagePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#collectionID}.
	 * @param ctx the parse tree
	 */
	void enterCollectionID(DB2zSQLParser.CollectionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#collectionID}.
	 * @param ctx the parse tree
	 */
	void exitCollectionID(DB2zSQLParser.CollectionIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#runTimeOptions}.
	 * @param ctx the parse tree
	 */
	void enterRunTimeOptions(DB2zSQLParser.RunTimeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#runTimeOptions}.
	 * @param ctx the parse tree
	 */
	void exitRunTimeOptions(DB2zSQLParser.RunTimeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(DB2zSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(DB2zSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DB2zSQLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DB2zSQLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DB2zSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DB2zSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#keyExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyExpression(DB2zSQLParser.KeyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#keyExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyExpression(DB2zSQLParser.KeyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rowChangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowChangeExpression(DB2zSQLParser.RowChangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rowChangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowChangeExpression(DB2zSQLParser.RowChangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sequenceReference}.
	 * @param ctx the parse tree
	 */
	void enterSequenceReference(DB2zSQLParser.SequenceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sequenceReference}.
	 * @param ctx the parse tree
	 */
	void exitSequenceReference(DB2zSQLParser.SequenceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(DB2zSQLParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(DB2zSQLParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#scalarFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionInvocation(DB2zSQLParser.ScalarFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#scalarFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionInvocation(DB2zSQLParser.ScalarFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aggregateFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionInvocation(DB2zSQLParser.AggregateFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aggregateFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionInvocation(DB2zSQLParser.AggregateFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#regressionFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterRegressionFunctionInvocation(DB2zSQLParser.RegressionFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#regressionFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitRegressionFunctionInvocation(DB2zSQLParser.RegressionFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#externalFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExternalFunctionInvocation(DB2zSQLParser.ExternalFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#externalFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExternalFunctionInvocation(DB2zSQLParser.ExternalFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#labeledDuration}.
	 * @param ctx the parse tree
	 */
	void enterLabeledDuration(DB2zSQLParser.LabeledDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#labeledDuration}.
	 * @param ctx the parse tree
	 */
	void exitLabeledDuration(DB2zSQLParser.LabeledDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#durationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDurationSuffix(DB2zSQLParser.DurationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#durationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDurationSuffix(DB2zSQLParser.DurationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlCastSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmlCastSpecification(DB2zSQLParser.XmlCastSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlCastSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmlCastSpecification(DB2zSQLParser.XmlCastSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayElementSpecification}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementSpecification(DB2zSQLParser.ArrayElementSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayElementSpecification}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementSpecification(DB2zSQLParser.ArrayElementSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(DB2zSQLParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(DB2zSQLParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(DB2zSQLParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(DB2zSQLParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#olapSpecification}.
	 * @param ctx the parse tree
	 */
	void enterOlapSpecification(DB2zSQLParser.OlapSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#olapSpecification}.
	 * @param ctx the parse tree
	 */
	void exitOlapSpecification(DB2zSQLParser.OlapSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#orderedOlapSpecification}.
	 * @param ctx the parse tree
	 */
	void enterOrderedOlapSpecification(DB2zSQLParser.OrderedOlapSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#orderedOlapSpecification}.
	 * @param ctx the parse tree
	 */
	void exitOrderedOlapSpecification(DB2zSQLParser.OrderedOlapSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#olapSpecificationFunction}.
	 * @param ctx the parse tree
	 */
	void enterOlapSpecificationFunction(DB2zSQLParser.OlapSpecificationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#olapSpecificationFunction}.
	 * @param ctx the parse tree
	 */
	void exitOlapSpecificationFunction(DB2zSQLParser.OlapSpecificationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#lagFunction}.
	 * @param ctx the parse tree
	 */
	void enterLagFunction(DB2zSQLParser.LagFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#lagFunction}.
	 * @param ctx the parse tree
	 */
	void exitLagFunction(DB2zSQLParser.LagFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#leadFunction}.
	 * @param ctx the parse tree
	 */
	void enterLeadFunction(DB2zSQLParser.LeadFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#leadFunction}.
	 * @param ctx the parse tree
	 */
	void exitLeadFunction(DB2zSQLParser.LeadFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#respectNullsClause}.
	 * @param ctx the parse tree
	 */
	void enterRespectNullsClause(DB2zSQLParser.RespectNullsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#respectNullsClause}.
	 * @param ctx the parse tree
	 */
	void exitRespectNullsClause(DB2zSQLParser.RespectNullsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#windowPartitionClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowPartitionClause(DB2zSQLParser.WindowPartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#windowPartitionClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowPartitionClause(DB2zSQLParser.WindowPartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#windowOrderClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowOrderClause(DB2zSQLParser.WindowOrderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#windowOrderClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowOrderClause(DB2zSQLParser.WindowOrderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#windowOrderClauseQualifier}.
	 * @param ctx the parse tree
	 */
	void enterWindowOrderClauseQualifier(DB2zSQLParser.WindowOrderClauseQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#windowOrderClauseQualifier}.
	 * @param ctx the parse tree
	 */
	void exitWindowOrderClauseQualifier(DB2zSQLParser.WindowOrderClauseQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#numberingSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNumberingSpecification(DB2zSQLParser.NumberingSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#numberingSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNumberingSpecification(DB2zSQLParser.NumberingSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aggregationSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAggregationSpecification(DB2zSQLParser.AggregationSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aggregationSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAggregationSpecification(DB2zSQLParser.AggregationSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(DB2zSQLParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(DB2zSQLParser.AggregateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#regressionFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegressionFunction(DB2zSQLParser.RegressionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#regressionFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegressionFunction(DB2zSQLParser.RegressionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#olapColumnFunction}.
	 * @param ctx the parse tree
	 */
	void enterOlapColumnFunction(DB2zSQLParser.OlapColumnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#olapColumnFunction}.
	 * @param ctx the parse tree
	 */
	void exitOlapColumnFunction(DB2zSQLParser.OlapColumnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#firstValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterFirstValueFunction(DB2zSQLParser.FirstValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#firstValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitFirstValueFunction(DB2zSQLParser.FirstValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#lastValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterLastValueFunction(DB2zSQLParser.LastValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#lastValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitLastValueFunction(DB2zSQLParser.LastValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nthValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterNthValueFunction(DB2zSQLParser.NthValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nthValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitNthValueFunction(DB2zSQLParser.NthValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#ratioToReportFunction}.
	 * @param ctx the parse tree
	 */
	void enterRatioToReportFunction(DB2zSQLParser.RatioToReportFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#ratioToReportFunction}.
	 * @param ctx the parse tree
	 */
	void exitRatioToReportFunction(DB2zSQLParser.RatioToReportFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#listaggFunction}.
	 * @param ctx the parse tree
	 */
	void enterListaggFunction(DB2zSQLParser.ListaggFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#listaggFunction}.
	 * @param ctx the parse tree
	 */
	void exitListaggFunction(DB2zSQLParser.ListaggFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayaggFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrayaggFunction(DB2zSQLParser.ArrayaggFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayaggFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrayaggFunction(DB2zSQLParser.ArrayaggFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayaggOrdinaryFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrayaggOrdinaryFunction(DB2zSQLParser.ArrayaggOrdinaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayaggOrdinaryFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrayaggOrdinaryFunction(DB2zSQLParser.ArrayaggOrdinaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayaggAssociativeFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrayaggAssociativeFunction(DB2zSQLParser.ArrayaggAssociativeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayaggAssociativeFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrayaggAssociativeFunction(DB2zSQLParser.ArrayaggAssociativeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#correlationFunction}.
	 * @param ctx the parse tree
	 */
	void enterCorrelationFunction(DB2zSQLParser.CorrelationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#correlationFunction}.
	 * @param ctx the parse tree
	 */
	void exitCorrelationFunction(DB2zSQLParser.CorrelationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#covarianceFunction}.
	 * @param ctx the parse tree
	 */
	void enterCovarianceFunction(DB2zSQLParser.CovarianceFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#covarianceFunction}.
	 * @param ctx the parse tree
	 */
	void exitCovarianceFunction(DB2zSQLParser.CovarianceFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#covarianceSampFunction}.
	 * @param ctx the parse tree
	 */
	void enterCovarianceSampFunction(DB2zSQLParser.CovarianceSampFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#covarianceSampFunction}.
	 * @param ctx the parse tree
	 */
	void exitCovarianceSampFunction(DB2zSQLParser.CovarianceSampFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#cumeDistFunction}.
	 * @param ctx the parse tree
	 */
	void enterCumeDistFunction(DB2zSQLParser.CumeDistFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#cumeDistFunction}.
	 * @param ctx the parse tree
	 */
	void exitCumeDistFunction(DB2zSQLParser.CumeDistFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#percentileContFunction}.
	 * @param ctx the parse tree
	 */
	void enterPercentileContFunction(DB2zSQLParser.PercentileContFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#percentileContFunction}.
	 * @param ctx the parse tree
	 */
	void exitPercentileContFunction(DB2zSQLParser.PercentileContFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#percentileDiscFunction}.
	 * @param ctx the parse tree
	 */
	void enterPercentileDiscFunction(DB2zSQLParser.PercentileDiscFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#percentileDiscFunction}.
	 * @param ctx the parse tree
	 */
	void exitPercentileDiscFunction(DB2zSQLParser.PercentileDiscFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#percentRankFunction}.
	 * @param ctx the parse tree
	 */
	void enterPercentRankFunction(DB2zSQLParser.PercentRankFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#percentRankFunction}.
	 * @param ctx the parse tree
	 */
	void exitPercentRankFunction(DB2zSQLParser.PercentRankFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlaggFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlaggFunction(DB2zSQLParser.XmlaggFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlaggFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlaggFunction(DB2zSQLParser.XmlaggFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlaggOrderByClause}.
	 * @param ctx the parse tree
	 */
	void enterXmlaggOrderByClause(DB2zSQLParser.XmlaggOrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlaggOrderByClause}.
	 * @param ctx the parse tree
	 */
	void exitXmlaggOrderByClause(DB2zSQLParser.XmlaggOrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlaggOrderByOption}.
	 * @param ctx the parse tree
	 */
	void enterXmlaggOrderByOption(DB2zSQLParser.XmlaggOrderByOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlaggOrderByOption}.
	 * @param ctx the parse tree
	 */
	void exitXmlaggOrderByOption(DB2zSQLParser.XmlaggOrderByOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aggregateOrderByClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateOrderByClause(DB2zSQLParser.AggregateOrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aggregateOrderByClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateOrderByClause(DB2zSQLParser.AggregateOrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aggregateOrderByOption}.
	 * @param ctx the parse tree
	 */
	void enterAggregateOrderByOption(DB2zSQLParser.AggregateOrderByOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aggregateOrderByOption}.
	 * @param ctx the parse tree
	 */
	void exitAggregateOrderByOption(DB2zSQLParser.AggregateOrderByOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#windowAggregationGroupClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowAggregationGroupClause(DB2zSQLParser.WindowAggregationGroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#windowAggregationGroupClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowAggregationGroupClause(DB2zSQLParser.WindowAggregationGroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupStart}.
	 * @param ctx the parse tree
	 */
	void enterGroupStart(DB2zSQLParser.GroupStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupStart}.
	 * @param ctx the parse tree
	 */
	void exitGroupStart(DB2zSQLParser.GroupStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupBetween}.
	 * @param ctx the parse tree
	 */
	void enterGroupBetween(DB2zSQLParser.GroupBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupBetween}.
	 * @param ctx the parse tree
	 */
	void exitGroupBetween(DB2zSQLParser.GroupBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupEnd}.
	 * @param ctx the parse tree
	 */
	void enterGroupEnd(DB2zSQLParser.GroupEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupEnd}.
	 * @param ctx the parse tree
	 */
	void exitGroupEnd(DB2zSQLParser.GroupEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupBound1}.
	 * @param ctx the parse tree
	 */
	void enterGroupBound1(DB2zSQLParser.GroupBound1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupBound1}.
	 * @param ctx the parse tree
	 */
	void exitGroupBound1(DB2zSQLParser.GroupBound1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupBound2}.
	 * @param ctx the parse tree
	 */
	void enterGroupBound2(DB2zSQLParser.GroupBound2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupBound2}.
	 * @param ctx the parse tree
	 */
	void exitGroupBound2(DB2zSQLParser.GroupBound2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#unboundedPreceding}.
	 * @param ctx the parse tree
	 */
	void enterUnboundedPreceding(DB2zSQLParser.UnboundedPrecedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#unboundedPreceding}.
	 * @param ctx the parse tree
	 */
	void exitUnboundedPreceding(DB2zSQLParser.UnboundedPrecedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#unboundedFollowing}.
	 * @param ctx the parse tree
	 */
	void enterUnboundedFollowing(DB2zSQLParser.UnboundedFollowingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#unboundedFollowing}.
	 * @param ctx the parse tree
	 */
	void exitUnboundedFollowing(DB2zSQLParser.UnboundedFollowingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#boundedPreceding}.
	 * @param ctx the parse tree
	 */
	void enterBoundedPreceding(DB2zSQLParser.BoundedPrecedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#boundedPreceding}.
	 * @param ctx the parse tree
	 */
	void exitBoundedPreceding(DB2zSQLParser.BoundedPrecedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#boundedFollowing}.
	 * @param ctx the parse tree
	 */
	void enterBoundedFollowing(DB2zSQLParser.BoundedFollowingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#boundedFollowing}.
	 * @param ctx the parse tree
	 */
	void exitBoundedFollowing(DB2zSQLParser.BoundedFollowingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#currentRow}.
	 * @param ctx the parse tree
	 */
	void enterCurrentRow(DB2zSQLParser.CurrentRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#currentRow}.
	 * @param ctx the parse tree
	 */
	void exitCurrentRow(DB2zSQLParser.CurrentRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#scalarFunction}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunction(DB2zSQLParser.ScalarFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#scalarFunction}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunction(DB2zSQLParser.ScalarFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tableFunction}.
	 * @param ctx the parse tree
	 */
	void enterTableFunction(DB2zSQLParser.TableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tableFunction}.
	 * @param ctx the parse tree
	 */
	void exitTableFunction(DB2zSQLParser.TableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#specialRegister}.
	 * @param ctx the parse tree
	 */
	void enterSpecialRegister(DB2zSQLParser.SpecialRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#specialRegister}.
	 * @param ctx the parse tree
	 */
	void exitSpecialRegister(DB2zSQLParser.SpecialRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlelementFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlelementFunction(DB2zSQLParser.XmlelementFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlelementFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlelementFunction(DB2zSQLParser.XmlelementFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlforestFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlforestFunction(DB2zSQLParser.XmlforestFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlforestFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlforestFunction(DB2zSQLParser.XmlforestFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlmodifyFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlmodifyFunction(DB2zSQLParser.XmlmodifyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlmodifyFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlmodifyFunction(DB2zSQLParser.XmlmodifyFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlpiFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlpiFunction(DB2zSQLParser.XmlpiFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlpiFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlpiFunction(DB2zSQLParser.XmlpiFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlqueryFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlqueryFunction(DB2zSQLParser.XmlqueryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlqueryFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlqueryFunction(DB2zSQLParser.XmlqueryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlattributesFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlattributesFunction(DB2zSQLParser.XmlattributesFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlattributesFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlattributesFunction(DB2zSQLParser.XmlattributesFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlserializeFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlserializeFunction(DB2zSQLParser.XmlserializeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlserializeFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlserializeFunction(DB2zSQLParser.XmlserializeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlnamespaceFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespaceFunction(DB2zSQLParser.XmlnamespaceFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlnamespaceFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespaceFunction(DB2zSQLParser.XmlnamespaceFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlnamespaceOption}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespaceOption(DB2zSQLParser.XmlnamespaceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlnamespaceOption}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespaceOption(DB2zSQLParser.XmlnamespaceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlserializeFunctionOptions}.
	 * @param ctx the parse tree
	 */
	void enterXmlserializeFunctionOptions(DB2zSQLParser.XmlserializeFunctionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlserializeFunctionOptions}.
	 * @param ctx the parse tree
	 */
	void exitXmlserializeFunctionOptions(DB2zSQLParser.XmlserializeFunctionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlFunctionOptionClause}.
	 * @param ctx the parse tree
	 */
	void enterXmlFunctionOptionClause(DB2zSQLParser.XmlFunctionOptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlFunctionOptionClause}.
	 * @param ctx the parse tree
	 */
	void exitXmlFunctionOptionClause(DB2zSQLParser.XmlFunctionOptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlFunctionOption}.
	 * @param ctx the parse tree
	 */
	void enterXmlFunctionOption(DB2zSQLParser.XmlFunctionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlFunctionOption}.
	 * @param ctx the parse tree
	 */
	void exitXmlFunctionOption(DB2zSQLParser.XmlFunctionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#elementContentExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementContentExpression(DB2zSQLParser.ElementContentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#elementContentExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementContentExpression(DB2zSQLParser.ElementContentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void enterXqueryExpressionConstant(DB2zSQLParser.XqueryExpressionConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void exitXqueryExpressionConstant(DB2zSQLParser.XqueryExpressionConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xqueryArgument}.
	 * @param ctx the parse tree
	 */
	void enterXqueryArgument(DB2zSQLParser.XqueryArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xqueryArgument}.
	 * @param ctx the parse tree
	 */
	void exitXqueryArgument(DB2zSQLParser.XqueryArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmltableFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmltableFunctionSpecification(DB2zSQLParser.XmltableFunctionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmltableFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmltableFunctionSpecification(DB2zSQLParser.XmltableFunctionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rowXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void enterRowXqueryExpressionConstant(DB2zSQLParser.RowXqueryExpressionConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rowXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void exitRowXqueryExpressionConstant(DB2zSQLParser.RowXqueryExpressionConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rowXqueryArgument}.
	 * @param ctx the parse tree
	 */
	void enterRowXqueryArgument(DB2zSQLParser.RowXqueryArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rowXqueryArgument}.
	 * @param ctx the parse tree
	 */
	void exitRowXqueryArgument(DB2zSQLParser.RowXqueryArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xqueryContextItemExpression}.
	 * @param ctx the parse tree
	 */
	void enterXqueryContextItemExpression(DB2zSQLParser.XqueryContextItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xqueryContextItemExpression}.
	 * @param ctx the parse tree
	 */
	void exitXqueryContextItemExpression(DB2zSQLParser.XqueryContextItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xqueryVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterXqueryVariableExpression(DB2zSQLParser.XqueryVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xqueryVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitXqueryVariableExpression(DB2zSQLParser.XqueryVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlTableRegularColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableRegularColumnDefinition(DB2zSQLParser.XmlTableRegularColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlTableRegularColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableRegularColumnDefinition(DB2zSQLParser.XmlTableRegularColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(DB2zSQLParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(DB2zSQLParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#defaultClause1}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause1(DB2zSQLParser.DefaultClause1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#defaultClause1}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause1(DB2zSQLParser.DefaultClause1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#defaultClause2}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause2(DB2zSQLParser.DefaultClause2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#defaultClause2}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause2(DB2zSQLParser.DefaultClause2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#defaultClauseAllowables}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClauseAllowables(DB2zSQLParser.DefaultClauseAllowablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#defaultClauseAllowables}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClauseAllowables(DB2zSQLParser.DefaultClauseAllowablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#distinctTypeCastFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterDistinctTypeCastFunctionName(DB2zSQLParser.DistinctTypeCastFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#distinctTypeCastFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitDistinctTypeCastFunctionName(DB2zSQLParser.DistinctTypeCastFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#columnXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void enterColumnXqueryExpressionConstant(DB2zSQLParser.ColumnXqueryExpressionConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#columnXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void exitColumnXqueryExpressionConstant(DB2zSQLParser.ColumnXqueryExpressionConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlTableOrdinalityColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableOrdinalityColumnDefinition(DB2zSQLParser.XmlTableOrdinalityColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlTableOrdinalityColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableOrdinalityColumnDefinition(DB2zSQLParser.XmlTableOrdinalityColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlnamespacesDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespacesDeclaration(DB2zSQLParser.XmlnamespacesDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlnamespacesDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespacesDeclaration(DB2zSQLParser.XmlnamespacesDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlnamespacesFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespacesFunctionSpecification(DB2zSQLParser.XmlnamespacesFunctionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlnamespacesFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespacesFunctionSpecification(DB2zSQLParser.XmlnamespacesFunctionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlnamespacesFunctionArguments}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespacesFunctionArguments(DB2zSQLParser.XmlnamespacesFunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlnamespacesFunctionArguments}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespacesFunctionArguments(DB2zSQLParser.XmlnamespacesFunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#namespaceUri}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceUri(DB2zSQLParser.NamespaceUriContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#namespaceUri}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceUri(DB2zSQLParser.NamespaceUriContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterNamespacePrefix(DB2zSQLParser.NamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitNamespacePrefix(DB2zSQLParser.NamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#timeZoneSpecificExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneSpecificExpression(DB2zSQLParser.TimeZoneSpecificExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#timeZoneSpecificExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneSpecificExpression(DB2zSQLParser.TimeZoneSpecificExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#timeZoneExpressionSubset}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneExpressionSubset(DB2zSQLParser.TimeZoneExpressionSubsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#timeZoneExpressionSubset}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneExpressionSubset(DB2zSQLParser.TimeZoneExpressionSubsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(DB2zSQLParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(DB2zSQLParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#resultExpression}.
	 * @param ctx the parse tree
	 */
	void enterResultExpression(DB2zSQLParser.ResultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#resultExpression}.
	 * @param ctx the parse tree
	 */
	void exitResultExpression(DB2zSQLParser.ResultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#searchedWhenClause}.
	 * @param ctx the parse tree
	 */
	void enterSearchedWhenClause(DB2zSQLParser.SearchedWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#searchedWhenClause}.
	 * @param ctx the parse tree
	 */
	void exitSearchedWhenClause(DB2zSQLParser.SearchedWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#simpleWhenClause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleWhenClause(DB2zSQLParser.SimpleWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#simpleWhenClause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleWhenClause(DB2zSQLParser.SimpleWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#searchCondition}.
	 * @param ctx the parse tree
	 */
	void enterSearchCondition(DB2zSQLParser.SearchConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#searchCondition}.
	 * @param ctx the parse tree
	 */
	void exitSearchCondition(DB2zSQLParser.SearchConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#checkCondition}.
	 * @param ctx the parse tree
	 */
	void enterCheckCondition(DB2zSQLParser.CheckConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#checkCondition}.
	 * @param ctx the parse tree
	 */
	void exitCheckCondition(DB2zSQLParser.CheckConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DB2zSQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DB2zSQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#basicPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBasicPredicate(DB2zSQLParser.BasicPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#basicPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBasicPredicate(DB2zSQLParser.BasicPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#rowValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowValueExpression(DB2zSQLParser.RowValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#rowValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowValueExpression(DB2zSQLParser.RowValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#quantifiedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedPredicate(DB2zSQLParser.QuantifiedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#quantifiedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedPredicate(DB2zSQLParser.QuantifiedPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void enterArrayExistsPredicate(DB2zSQLParser.ArrayExistsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void exitArrayExistsPredicate(DB2zSQLParser.ArrayExistsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(DB2zSQLParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(DB2zSQLParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#distinctPredicate}.
	 * @param ctx the parse tree
	 */
	void enterDistinctPredicate(DB2zSQLParser.DistinctPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#distinctPredicate}.
	 * @param ctx the parse tree
	 */
	void exitDistinctPredicate(DB2zSQLParser.DistinctPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#existsPredicate}.
	 * @param ctx the parse tree
	 */
	void enterExistsPredicate(DB2zSQLParser.ExistsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#existsPredicate}.
	 * @param ctx the parse tree
	 */
	void exitExistsPredicate(DB2zSQLParser.ExistsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(DB2zSQLParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(DB2zSQLParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(DB2zSQLParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(DB2zSQLParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nullPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(DB2zSQLParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nullPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(DB2zSQLParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmlExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void enterXmlExistsPredicate(DB2zSQLParser.XmlExistsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmlExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void exitXmlExistsPredicate(DB2zSQLParser.XmlExistsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(DB2zSQLParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(DB2zSQLParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#castSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCastSpecification(DB2zSQLParser.CastSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#castSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCastSpecification(DB2zSQLParser.CastSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(DB2zSQLParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(DB2zSQLParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#castDataType}.
	 * @param ctx the parse tree
	 */
	void enterCastDataType(DB2zSQLParser.CastDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#castDataType}.
	 * @param ctx the parse tree
	 */
	void exitCastDataType(DB2zSQLParser.CastDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#castBuiltInType}.
	 * @param ctx the parse tree
	 */
	void enterCastBuiltInType(DB2zSQLParser.CastBuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#castBuiltInType}.
	 * @param ctx the parse tree
	 */
	void exitCastBuiltInType(DB2zSQLParser.CastBuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#integerInParens}.
	 * @param ctx the parse tree
	 */
	void enterIntegerInParens(DB2zSQLParser.IntegerInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#integerInParens}.
	 * @param ctx the parse tree
	 */
	void exitIntegerInParens(DB2zSQLParser.IntegerInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(DB2zSQLParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(DB2zSQLParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#ccsidQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCcsidQualifier(DB2zSQLParser.CcsidQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#ccsidQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCcsidQualifier(DB2zSQLParser.CcsidQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#forDataQualifier}.
	 * @param ctx the parse tree
	 */
	void enterForDataQualifier(DB2zSQLParser.ForDataQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#forDataQualifier}.
	 * @param ctx the parse tree
	 */
	void exitForDataQualifier(DB2zSQLParser.ForDataQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#distinctTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDistinctTypeName(DB2zSQLParser.DistinctTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#distinctTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDistinctTypeName(DB2zSQLParser.DistinctTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(DB2zSQLParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(DB2zSQLParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DB2zSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DB2zSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#ccsidValue}.
	 * @param ctx the parse tree
	 */
	void enterCcsidValue(DB2zSQLParser.CcsidValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#ccsidValue}.
	 * @param ctx the parse tree
	 */
	void exitCcsidValue(DB2zSQLParser.CcsidValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DB2zSQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DB2zSQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sourceColumnName}.
	 * @param ctx the parse tree
	 */
	void enterSourceColumnName(DB2zSQLParser.SourceColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sourceColumnName}.
	 * @param ctx the parse tree
	 */
	void exitSourceColumnName(DB2zSQLParser.SourceColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#targetColumnName}.
	 * @param ctx the parse tree
	 */
	void enterTargetColumnName(DB2zSQLParser.TargetColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#targetColumnName}.
	 * @param ctx the parse tree
	 */
	void exitTargetColumnName(DB2zSQLParser.TargetColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#newColumnName}.
	 * @param ctx the parse tree
	 */
	void enterNewColumnName(DB2zSQLParser.NewColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#newColumnName}.
	 * @param ctx the parse tree
	 */
	void exitNewColumnName(DB2zSQLParser.NewColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#beginColumnName}.
	 * @param ctx the parse tree
	 */
	void enterBeginColumnName(DB2zSQLParser.BeginColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#beginColumnName}.
	 * @param ctx the parse tree
	 */
	void exitBeginColumnName(DB2zSQLParser.BeginColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#endColumnName}.
	 * @param ctx the parse tree
	 */
	void enterEndColumnName(DB2zSQLParser.EndColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#endColumnName}.
	 * @param ctx the parse tree
	 */
	void exitEndColumnName(DB2zSQLParser.EndColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#correlationName}.
	 * @param ctx the parse tree
	 */
	void enterCorrelationName(DB2zSQLParser.CorrelationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#correlationName}.
	 * @param ctx the parse tree
	 */
	void exitCorrelationName(DB2zSQLParser.CorrelationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#locationName}.
	 * @param ctx the parse tree
	 */
	void enterLocationName(DB2zSQLParser.LocationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#locationName}.
	 * @param ctx the parse tree
	 */
	void exitLocationName(DB2zSQLParser.LocationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(DB2zSQLParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(DB2zSQLParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DB2zSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DB2zSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#alterTableName}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableName(DB2zSQLParser.AlterTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#alterTableName}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableName(DB2zSQLParser.AlterTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#auxTableName}.
	 * @param ctx the parse tree
	 */
	void enterAuxTableName(DB2zSQLParser.AuxTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#auxTableName}.
	 * @param ctx the parse tree
	 */
	void exitAuxTableName(DB2zSQLParser.AuxTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#historyTableName}.
	 * @param ctx the parse tree
	 */
	void enterHistoryTableName(DB2zSQLParser.HistoryTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#historyTableName}.
	 * @param ctx the parse tree
	 */
	void exitHistoryTableName(DB2zSQLParser.HistoryTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#cloneTableName}.
	 * @param ctx the parse tree
	 */
	void enterCloneTableName(DB2zSQLParser.CloneTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#cloneTableName}.
	 * @param ctx the parse tree
	 */
	void exitCloneTableName(DB2zSQLParser.CloneTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#archiveTableName}.
	 * @param ctx the parse tree
	 */
	void enterArchiveTableName(DB2zSQLParser.ArchiveTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#archiveTableName}.
	 * @param ctx the parse tree
	 */
	void exitArchiveTableName(DB2zSQLParser.ArchiveTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(DB2zSQLParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(DB2zSQLParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(DB2zSQLParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(DB2zSQLParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(DB2zSQLParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(DB2zSQLParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#planName}.
	 * @param ctx the parse tree
	 */
	void enterPlanName(DB2zSQLParser.PlanNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#planName}.
	 * @param ctx the parse tree
	 */
	void exitPlanName(DB2zSQLParser.PlanNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(DB2zSQLParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(DB2zSQLParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(DB2zSQLParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(DB2zSQLParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeName(DB2zSQLParser.ArrayTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeName(DB2zSQLParser.ArrayTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#jarName}.
	 * @param ctx the parse tree
	 */
	void enterJarName(DB2zSQLParser.JarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#jarName}.
	 * @param ctx the parse tree
	 */
	void exitJarName(DB2zSQLParser.JarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#savepointName}.
	 * @param ctx the parse tree
	 */
	void enterSavepointName(DB2zSQLParser.SavepointNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#savepointName}.
	 * @param ctx the parse tree
	 */
	void exitSavepointName(DB2zSQLParser.SavepointNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(DB2zSQLParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(DB2zSQLParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(DB2zSQLParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(DB2zSQLParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#routineVersionID}.
	 * @param ctx the parse tree
	 */
	void enterRoutineVersionID(DB2zSQLParser.RoutineVersionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#routineVersionID}.
	 * @param ctx the parse tree
	 */
	void exitRoutineVersionID(DB2zSQLParser.RoutineVersionIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#versionID}.
	 * @param ctx the parse tree
	 */
	void enterVersionID(DB2zSQLParser.VersionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#versionID}.
	 * @param ctx the parse tree
	 */
	void exitVersionID(DB2zSQLParser.VersionIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(DB2zSQLParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(DB2zSQLParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#maskName}.
	 * @param ctx the parse tree
	 */
	void enterMaskName(DB2zSQLParser.MaskNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#maskName}.
	 * @param ctx the parse tree
	 */
	void exitMaskName(DB2zSQLParser.MaskNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#permissionName}.
	 * @param ctx the parse tree
	 */
	void enterPermissionName(DB2zSQLParser.PermissionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#permissionName}.
	 * @param ctx the parse tree
	 */
	void exitPermissionName(DB2zSQLParser.PermissionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(DB2zSQLParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(DB2zSQLParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sequenceName}.
	 * @param ctx the parse tree
	 */
	void enterSequenceName(DB2zSQLParser.SequenceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sequenceName}.
	 * @param ctx the parse tree
	 */
	void exitSequenceName(DB2zSQLParser.SequenceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#memberName}.
	 * @param ctx the parse tree
	 */
	void enterMemberName(DB2zSQLParser.MemberNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#memberName}.
	 * @param ctx the parse tree
	 */
	void exitMemberName(DB2zSQLParser.MemberNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(DB2zSQLParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(DB2zSQLParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tablespaceName}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceName(DB2zSQLParser.TablespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tablespaceName}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceName(DB2zSQLParser.TablespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#acceleratorName}.
	 * @param ctx the parse tree
	 */
	void enterAcceleratorName(DB2zSQLParser.AcceleratorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#acceleratorName}.
	 * @param ctx the parse tree
	 */
	void exitAcceleratorName(DB2zSQLParser.AcceleratorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#catalogName}.
	 * @param ctx the parse tree
	 */
	void enterCatalogName(DB2zSQLParser.CatalogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#catalogName}.
	 * @param ctx the parse tree
	 */
	void exitCatalogName(DB2zSQLParser.CatalogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(DB2zSQLParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(DB2zSQLParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#contextName}.
	 * @param ctx the parse tree
	 */
	void enterContextName(DB2zSQLParser.ContextNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#contextName}.
	 * @param ctx the parse tree
	 */
	void exitContextName(DB2zSQLParser.ContextNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#authorizationName}.
	 * @param ctx the parse tree
	 */
	void enterAuthorizationName(DB2zSQLParser.AuthorizationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#authorizationName}.
	 * @param ctx the parse tree
	 */
	void exitAuthorizationName(DB2zSQLParser.AuthorizationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#profileName}.
	 * @param ctx the parse tree
	 */
	void enterProfileName(DB2zSQLParser.ProfileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#profileName}.
	 * @param ctx the parse tree
	 */
	void exitProfileName(DB2zSQLParser.ProfileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(DB2zSQLParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(DB2zSQLParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#seclabelName}.
	 * @param ctx the parse tree
	 */
	void enterSeclabelName(DB2zSQLParser.SeclabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#seclabelName}.
	 * @param ctx the parse tree
	 */
	void exitSeclabelName(DB2zSQLParser.SeclabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(DB2zSQLParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(DB2zSQLParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#addressValue}.
	 * @param ctx the parse tree
	 */
	void enterAddressValue(DB2zSQLParser.AddressValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#addressValue}.
	 * @param ctx the parse tree
	 */
	void exitAddressValue(DB2zSQLParser.AddressValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#jobnameValue}.
	 * @param ctx the parse tree
	 */
	void enterJobnameValue(DB2zSQLParser.JobnameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#jobnameValue}.
	 * @param ctx the parse tree
	 */
	void exitJobnameValue(DB2zSQLParser.JobnameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#servauthValue}.
	 * @param ctx the parse tree
	 */
	void enterServauthValue(DB2zSQLParser.ServauthValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#servauthValue}.
	 * @param ctx the parse tree
	 */
	void exitServauthValue(DB2zSQLParser.ServauthValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#encryptionValue}.
	 * @param ctx the parse tree
	 */
	void enterEncryptionValue(DB2zSQLParser.EncryptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#encryptionValue}.
	 * @param ctx the parse tree
	 */
	void exitEncryptionValue(DB2zSQLParser.EncryptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#bpName}.
	 * @param ctx the parse tree
	 */
	void enterBpName(DB2zSQLParser.BpNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#bpName}.
	 * @param ctx the parse tree
	 */
	void exitBpName(DB2zSQLParser.BpNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#stogroupName}.
	 * @param ctx the parse tree
	 */
	void enterStogroupName(DB2zSQLParser.StogroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#stogroupName}.
	 * @param ctx the parse tree
	 */
	void exitStogroupName(DB2zSQLParser.StogroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dcName}.
	 * @param ctx the parse tree
	 */
	void enterDcName(DB2zSQLParser.DcNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dcName}.
	 * @param ctx the parse tree
	 */
	void exitDcName(DB2zSQLParser.DcNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#mcName}.
	 * @param ctx the parse tree
	 */
	void enterMcName(DB2zSQLParser.McNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#mcName}.
	 * @param ctx the parse tree
	 */
	void exitMcName(DB2zSQLParser.McNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#scName}.
	 * @param ctx the parse tree
	 */
	void enterScName(DB2zSQLParser.ScNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#scName}.
	 * @param ctx the parse tree
	 */
	void exitScName(DB2zSQLParser.ScNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#volumeID}.
	 * @param ctx the parse tree
	 */
	void enterVolumeID(DB2zSQLParser.VolumeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#volumeID}.
	 * @param ctx the parse tree
	 */
	void exitVolumeID(DB2zSQLParser.VolumeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#keyLabelName}.
	 * @param ctx the parse tree
	 */
	void enterKeyLabelName(DB2zSQLParser.KeyLabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#keyLabelName}.
	 * @param ctx the parse tree
	 */
	void exitKeyLabelName(DB2zSQLParser.KeyLabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(DB2zSQLParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(DB2zSQLParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#specificName}.
	 * @param ctx the parse tree
	 */
	void enterSpecificName(DB2zSQLParser.SpecificNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#specificName}.
	 * @param ctx the parse tree
	 */
	void exitSpecificName(DB2zSQLParser.SpecificNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#hostLabel}.
	 * @param ctx the parse tree
	 */
	void enterHostLabel(DB2zSQLParser.HostLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#hostLabel}.
	 * @param ctx the parse tree
	 */
	void exitHostLabel(DB2zSQLParser.HostLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#hostVariable}.
	 * @param ctx the parse tree
	 */
	void enterHostVariable(DB2zSQLParser.HostVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#hostVariable}.
	 * @param ctx the parse tree
	 */
	void exitHostVariable(DB2zSQLParser.HostVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#hostIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterHostIdentifier(DB2zSQLParser.HostIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#hostIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitHostIdentifier(DB2zSQLParser.HostIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#hostStructure}.
	 * @param ctx the parse tree
	 */
	void enterHostStructure(DB2zSQLParser.HostStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#hostStructure}.
	 * @param ctx the parse tree
	 */
	void exitHostStructure(DB2zSQLParser.HostStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nullIndicator}.
	 * @param ctx the parse tree
	 */
	void enterNullIndicator(DB2zSQLParser.NullIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nullIndicator}.
	 * @param ctx the parse tree
	 */
	void exitNullIndicator(DB2zSQLParser.NullIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nullIndicatorStructure}.
	 * @param ctx the parse tree
	 */
	void enterNullIndicatorStructure(DB2zSQLParser.NullIndicatorStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nullIndicatorStructure}.
	 * @param ctx the parse tree
	 */
	void exitNullIndicatorStructure(DB2zSQLParser.NullIndicatorStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#globalVariableName}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableName(DB2zSQLParser.GlobalVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#globalVariableName}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableName(DB2zSQLParser.GlobalVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlParameterName}.
	 * @param ctx the parse tree
	 */
	void enterSqlParameterName(DB2zSQLParser.SqlParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlParameterName}.
	 * @param ctx the parse tree
	 */
	void exitSqlParameterName(DB2zSQLParser.SqlParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlVariableName}.
	 * @param ctx the parse tree
	 */
	void enterSqlVariableName(DB2zSQLParser.SqlVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlVariableName}.
	 * @param ctx the parse tree
	 */
	void exitSqlVariableName(DB2zSQLParser.SqlVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#transitionVariableName}.
	 * @param ctx the parse tree
	 */
	void enterTransitionVariableName(DB2zSQLParser.TransitionVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#transitionVariableName}.
	 * @param ctx the parse tree
	 */
	void exitTransitionVariableName(DB2zSQLParser.TransitionVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#synonym}.
	 * @param ctx the parse tree
	 */
	void enterSynonym(DB2zSQLParser.SynonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#synonym}.
	 * @param ctx the parse tree
	 */
	void exitSynonym(DB2zSQLParser.SynonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DB2zSQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DB2zSQLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(DB2zSQLParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(DB2zSQLParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#correlationClause}.
	 * @param ctx the parse tree
	 */
	void enterCorrelationClause(DB2zSQLParser.CorrelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#correlationClause}.
	 * @param ctx the parse tree
	 */
	void exitCorrelationClause(DB2zSQLParser.CorrelationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DB2zSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DB2zSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(DB2zSQLParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(DB2zSQLParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#singleTableReference}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableReference(DB2zSQLParser.SingleTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#singleTableReference}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableReference(DB2zSQLParser.SingleTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#periodSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPeriodSpecification(DB2zSQLParser.PeriodSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#periodSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPeriodSpecification(DB2zSQLParser.PeriodSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void enterPeriodClause(DB2zSQLParser.PeriodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void exitPeriodClause(DB2zSQLParser.PeriodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#nestedTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterNestedTableExpression(DB2zSQLParser.NestedTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#nestedTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitNestedTableExpression(DB2zSQLParser.NestedTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#dataChangeTableReference}.
	 * @param ctx the parse tree
	 */
	void enterDataChangeTableReference(DB2zSQLParser.DataChangeTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#dataChangeTableReference}.
	 * @param ctx the parse tree
	 */
	void exitDataChangeTableReference(DB2zSQLParser.DataChangeTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tableFunctionReference}.
	 * @param ctx the parse tree
	 */
	void enterTableFunctionReference(DB2zSQLParser.TableFunctionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tableFunctionReference}.
	 * @param ctx the parse tree
	 */
	void exitTableFunctionReference(DB2zSQLParser.TableFunctionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tableUdfCardinalityClause}.
	 * @param ctx the parse tree
	 */
	void enterTableUdfCardinalityClause(DB2zSQLParser.TableUdfCardinalityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tableUdfCardinalityClause}.
	 * @param ctx the parse tree
	 */
	void exitTableUdfCardinalityClause(DB2zSQLParser.TableUdfCardinalityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#typedCorrelationClause}.
	 * @param ctx the parse tree
	 */
	void enterTypedCorrelationClause(DB2zSQLParser.TypedCorrelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#typedCorrelationClause}.
	 * @param ctx the parse tree
	 */
	void exitTypedCorrelationClause(DB2zSQLParser.TypedCorrelationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#tableLocatorReference}.
	 * @param ctx the parse tree
	 */
	void enterTableLocatorReference(DB2zSQLParser.TableLocatorReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#tableLocatorReference}.
	 * @param ctx the parse tree
	 */
	void exitTableLocatorReference(DB2zSQLParser.TableLocatorReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#xmltableExpression}.
	 * @param ctx the parse tree
	 */
	void enterXmltableExpression(DB2zSQLParser.XmltableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#xmltableExpression}.
	 * @param ctx the parse tree
	 */
	void exitXmltableExpression(DB2zSQLParser.XmltableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#collectionDerivedTable}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDerivedTable(DB2zSQLParser.CollectionDerivedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#collectionDerivedTable}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDerivedTable(DB2zSQLParser.CollectionDerivedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(DB2zSQLParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(DB2zSQLParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fullJoinExpression}.
	 * @param ctx the parse tree
	 */
	void enterFullJoinExpression(DB2zSQLParser.FullJoinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fullJoinExpression}.
	 * @param ctx the parse tree
	 */
	void exitFullJoinExpression(DB2zSQLParser.FullJoinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(DB2zSQLParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(DB2zSQLParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#ordinaryArrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryArrayExpression(DB2zSQLParser.OrdinaryArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#ordinaryArrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryArrayExpression(DB2zSQLParser.OrdinaryArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#associativeArrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeArrayExpression(DB2zSQLParser.AssociativeArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#associativeArrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeArrayExpression(DB2zSQLParser.AssociativeArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DB2zSQLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DB2zSQLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(DB2zSQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(DB2zSQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(DB2zSQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(DB2zSQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(DB2zSQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(DB2zSQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupingExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupingExpression(DB2zSQLParser.GroupingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupingExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupingExpression(DB2zSQLParser.GroupingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupingSets}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSets(DB2zSQLParser.GroupingSetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupingSets}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSets(DB2zSQLParser.GroupingSetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#groupingSetsGroup}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSetsGroup(DB2zSQLParser.GroupingSetsGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#groupingSetsGroup}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSetsGroup(DB2zSQLParser.GroupingSetsGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#superGroups}.
	 * @param ctx the parse tree
	 */
	void enterSuperGroups(DB2zSQLParser.SuperGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#superGroups}.
	 * @param ctx the parse tree
	 */
	void exitSuperGroups(DB2zSQLParser.SuperGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#selectColumns}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumns(DB2zSQLParser.SelectColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#selectColumns}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumns(DB2zSQLParser.SelectColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#unpackedRow}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedRow(DB2zSQLParser.UnpackedRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#unpackedRow}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedRow(DB2zSQLParser.UnpackedRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(DB2zSQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(DB2zSQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#subSelect}.
	 * @param ctx the parse tree
	 */
	void enterSubSelect(DB2zSQLParser.SubSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#subSelect}.
	 * @param ctx the parse tree
	 */
	void exitSubSelect(DB2zSQLParser.SubSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoStatement(DB2zSQLParser.SelectIntoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoStatement(DB2zSQLParser.SelectIntoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(DB2zSQLParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(DB2zSQLParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#commonTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommonTableExpression(DB2zSQLParser.CommonTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#commonTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommonTableExpression(DB2zSQLParser.CommonTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#updateClause}.
	 * @param ctx the parse tree
	 */
	void enterUpdateClause(DB2zSQLParser.UpdateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#updateClause}.
	 * @param ctx the parse tree
	 */
	void exitUpdateClause(DB2zSQLParser.UpdateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#readOnlyClause}.
	 * @param ctx the parse tree
	 */
	void enterReadOnlyClause(DB2zSQLParser.ReadOnlyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#readOnlyClause}.
	 * @param ctx the parse tree
	 */
	void exitReadOnlyClause(DB2zSQLParser.ReadOnlyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#optimizeClause}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeClause(DB2zSQLParser.OptimizeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#optimizeClause}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeClause(DB2zSQLParser.OptimizeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#isolationClause}.
	 * @param ctx the parse tree
	 */
	void enterIsolationClause(DB2zSQLParser.IsolationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#isolationClause}.
	 * @param ctx the parse tree
	 */
	void exitIsolationClause(DB2zSQLParser.IsolationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(DB2zSQLParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(DB2zSQLParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#skipLockedDataClause}.
	 * @param ctx the parse tree
	 */
	void enterSkipLockedDataClause(DB2zSQLParser.SkipLockedDataClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#skipLockedDataClause}.
	 * @param ctx the parse tree
	 */
	void exitSkipLockedDataClause(DB2zSQLParser.SkipLockedDataClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#querynoClause}.
	 * @param ctx the parse tree
	 */
	void enterQuerynoClause(DB2zSQLParser.QuerynoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#querynoClause}.
	 * @param ctx the parse tree
	 */
	void exitQuerynoClause(DB2zSQLParser.QuerynoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#scalarFullSelect}.
	 * @param ctx the parse tree
	 */
	void enterScalarFullSelect(DB2zSQLParser.ScalarFullSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#scalarFullSelect}.
	 * @param ctx the parse tree
	 */
	void exitScalarFullSelect(DB2zSQLParser.ScalarFullSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fullSelect}.
	 * @param ctx the parse tree
	 */
	void enterFullSelect(DB2zSQLParser.FullSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fullSelect}.
	 * @param ctx the parse tree
	 */
	void exitFullSelect(DB2zSQLParser.FullSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void enterValuesClause(DB2zSQLParser.ValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void exitValuesClause(DB2zSQLParser.ValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(DB2zSQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(DB2zSQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sortKey}.
	 * @param ctx the parse tree
	 */
	void enterSortKey(DB2zSQLParser.SortKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sortKey}.
	 * @param ctx the parse tree
	 */
	void exitSortKey(DB2zSQLParser.SortKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(DB2zSQLParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(DB2zSQLParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void enterFetchClause(DB2zSQLParser.FetchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void exitFetchClause(DB2zSQLParser.FetchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DB2zSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DB2zSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#identifier1}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier1(DB2zSQLParser.Identifier1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#identifier1}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier1(DB2zSQLParser.Identifier1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DB2zSQLParser#sqlKeyword}.
	 * @param ctx the parse tree
	 */
	void enterSqlKeyword(DB2zSQLParser.SqlKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#sqlKeyword}.
	 * @param ctx the parse tree
	 */
	void exitSqlKeyword(DB2zSQLParser.SqlKeywordContext ctx);
}