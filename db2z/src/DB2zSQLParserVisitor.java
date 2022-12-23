// Generated from src/DB2zSQLParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DB2zSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DB2zSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(DB2zSQLParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(DB2zSQLParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(DB2zSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(DB2zSQLParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#statementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementName(DB2zSQLParser.StatementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#descriptorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptorName(DB2zSQLParser.DescriptorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#holdability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoldability(DB2zSQLParser.HoldabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#returnability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnability(DB2zSQLParser.ReturnabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rowsetPositioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsetPositioning(DB2zSQLParser.RowsetPositioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#notNullPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNullPhrase(DB2zSQLParser.NotNullPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#allocateCursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocateCursorStatement(DB2zSQLParser.AllocateCursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rsLocatorVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsLocatorVariable(DB2zSQLParser.RsLocatorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseStatement(DB2zSQLParser.AlterDatabaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionStatement(DB2zSQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexStatement(DB2zSQLParser.AlterIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterMaskStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaskStatement(DB2zSQLParser.AlterMaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterPermissionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPermissionStatement(DB2zSQLParser.AlterPermissionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedureStatement(DB2zSQLParser.AlterProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterSequenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequenceStatement(DB2zSQLParser.AlterSequenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterStogroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStogroupStatement(DB2zSQLParser.AlterStogroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStatement(DB2zSQLParser.AlterTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTablespaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespaceStatement(DB2zSQLParser.AlterTablespaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTriggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTriggerStatement(DB2zSQLParser.AlterTriggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTrustedContextStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTrustedContextStatement(DB2zSQLParser.AlterTrustedContextStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewStatement(DB2zSQLParser.AlterViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#associateLocatorsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociateLocatorsStatement(DB2zSQLParser.AssociateLocatorsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#beginDeclareSectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginDeclareSectionStatement(DB2zSQLParser.BeginDeclareSectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(DB2zSQLParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#closeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStatement(DB2zSQLParser.CloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#commentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStatement(DB2zSQLParser.CommentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#commitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitStatement(DB2zSQLParser.CommitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#connectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectStatement(DB2zSQLParser.ConnectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createAliasStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAliasStatement(DB2zSQLParser.CreateAliasStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createAuxiliaryTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAuxiliaryTableStatement(DB2zSQLParser.CreateAuxiliaryTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseStatement(DB2zSQLParser.CreateDatabaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatement(DB2zSQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalScalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementExternalScalar(DB2zSQLParser.CreateFunctionStatementExternalScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementExternalTable(DB2zSQLParser.CreateFunctionStatementExternalTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementSourced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementSourced(DB2zSQLParser.CreateFunctionStatementSourcedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementInlineSqlScalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementInlineSqlScalar(DB2zSQLParser.CreateFunctionStatementInlineSqlScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createGlobalTemporaryTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGlobalTemporaryTableStatement(DB2zSQLParser.CreateGlobalTemporaryTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexStatement(DB2zSQLParser.CreateIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createLobTablespaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLobTablespaceStatement(DB2zSQLParser.CreateLobTablespaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createMaskStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaskStatement(DB2zSQLParser.CreateMaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createPermissionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePermissionStatement(DB2zSQLParser.CreatePermissionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createProcedureSQLPLStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedureSQLPLStatement(DB2zSQLParser.CreateProcedureSQLPLStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedureStatement(DB2zSQLParser.CreateProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createRoleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoleStatement(DB2zSQLParser.CreateRoleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequenceStatement(DB2zSQLParser.CreateSequenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createStogroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStogroupStatement(DB2zSQLParser.CreateStogroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(DB2zSQLParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTablespaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceStatement(DB2zSQLParser.CreateTablespaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTriggerStatement(DB2zSQLParser.CreateTriggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTrustedContextStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrustedContextStatement(DB2zSQLParser.CreateTrustedContextStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTypeArrayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeArrayStatement(DB2zSQLParser.CreateTypeArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTypeDistinctStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeDistinctStatement(DB2zSQLParser.CreateTypeDistinctStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateVariableStatement(DB2zSQLParser.CreateVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewStatement(DB2zSQLParser.CreateViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareCursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursorStatement(DB2zSQLParser.DeclareCursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGlobalTemporaryTableStatement(DB2zSQLParser.DeclareGlobalTemporaryTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareTableStatement(DB2zSQLParser.DeclareTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareStatementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStatementStatement(DB2zSQLParser.DeclareStatementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariableStatement(DB2zSQLParser.DeclareVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(DB2zSQLParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#describeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeStatement(DB2zSQLParser.DescribeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#describeCursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeCursorStatement(DB2zSQLParser.DescribeCursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#describeInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeInputStatement(DB2zSQLParser.DescribeInputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#describeOutputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeOutputStatement(DB2zSQLParser.DescribeOutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#describeProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeProcedureStatement(DB2zSQLParser.DescribeProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#describeTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTableStatement(DB2zSQLParser.DescribeTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatement(DB2zSQLParser.DropStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#endDeclareSectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndDeclareSectionStatement(DB2zSQLParser.EndDeclareSectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#exchangeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExchangeStatement(DB2zSQLParser.ExchangeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#executeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStatement(DB2zSQLParser.ExecuteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#executeImmediateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteImmediateStatement(DB2zSQLParser.ExecuteImmediateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#explainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStatement(DB2zSQLParser.ExplainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fetchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchStatement(DB2zSQLParser.FetchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#freeLocatorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeLocatorStatement(DB2zSQLParser.FreeLocatorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#getDiagnosticsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetDiagnosticsStatement(DB2zSQLParser.GetDiagnosticsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStatement(DB2zSQLParser.GrantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#holdLocatorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoldLocatorStatement(DB2zSQLParser.HoldLocatorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(DB2zSQLParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(DB2zSQLParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#labelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStatement(DB2zSQLParser.LabelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#lockTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTableStatement(DB2zSQLParser.LockTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeStatement(DB2zSQLParser.MergeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#openStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStatement(DB2zSQLParser.OpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#prepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStatement(DB2zSQLParser.PrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#refreshTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTableStatement(DB2zSQLParser.RefreshTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#releaseConnectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseConnectionStatement(DB2zSQLParser.ReleaseConnectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#releaseSavepointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseSavepointStatement(DB2zSQLParser.ReleaseSavepointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#renameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameStatement(DB2zSQLParser.RenameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeStatement(DB2zSQLParser.RevokeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rollbackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackStatement(DB2zSQLParser.RollbackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#savepointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointStatement(DB2zSQLParser.SavepointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentStatement(DB2zSQLParser.SetAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setConnectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConnectionStatement(DB2zSQLParser.SetConnectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setEncryptionPasswordStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEncryptionPasswordStatement(DB2zSQLParser.SetEncryptionPasswordStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setPathStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPathStatement(DB2zSQLParser.SetPathStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setSchemaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSchemaStatement(DB2zSQLParser.SetSchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setSessionTimezoneStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSessionTimezoneStatement(DB2zSQLParser.SetSessionTimezoneStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setSpecialRegisterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSpecialRegisterStatement(DB2zSQLParser.SetSpecialRegisterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#signalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalStatement(DB2zSQLParser.SignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#transferOwnershipStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransferOwnershipStatement(DB2zSQLParser.TransferOwnershipStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#truncateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStatement(DB2zSQLParser.TruncateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(DB2zSQLParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesStatement(DB2zSQLParser.ValuesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesIntoStatement(DB2zSQLParser.ValuesIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#wheneverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWheneverStatement(DB2zSQLParser.WheneverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesIntoTargetVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesIntoTargetVariable(DB2zSQLParser.ValuesIntoTargetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#ownedObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnedObject(DB2zSQLParser.OwnedObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#newOwner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewOwner(DB2zSQLParser.NewOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantCollectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantCollectionStatement(DB2zSQLParser.GrantCollectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantDatabaseStatement(DB2zSQLParser.GrantDatabaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantFunctionOrProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantFunctionOrProcedureStatement(DB2zSQLParser.GrantFunctionOrProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantPackageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantPackageStatement(DB2zSQLParser.GrantPackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantPlanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantPlanStatement(DB2zSQLParser.GrantPlanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantSchemaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantSchemaStatement(DB2zSQLParser.GrantSchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantSequenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantSequenceStatement(DB2zSQLParser.GrantSequenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantSystemStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantSystemStatement(DB2zSQLParser.GrantSystemStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantTableStatement(DB2zSQLParser.GrantTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantTypeOrJarStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantTypeOrJarStatement(DB2zSQLParser.GrantTypeOrJarStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantVariableStatement(DB2zSQLParser.GrantVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantUseOfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantUseOfStatement(DB2zSQLParser.GrantUseOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeCollectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeCollectionStatement(DB2zSQLParser.RevokeCollectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeDatabaseStatement(DB2zSQLParser.RevokeDatabaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeFunctionOrProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeFunctionOrProcedureStatement(DB2zSQLParser.RevokeFunctionOrProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokePackageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokePackageStatement(DB2zSQLParser.RevokePackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokePlanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokePlanStatement(DB2zSQLParser.RevokePlanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeSchemaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeSchemaStatement(DB2zSQLParser.RevokeSchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeSequenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeSequenceStatement(DB2zSQLParser.RevokeSequenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeSystemStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeSystemStatement(DB2zSQLParser.RevokeSystemStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeTableStatement(DB2zSQLParser.RevokeTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeTypeOrJarStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeTypeOrJarStatement(DB2zSQLParser.RevokeTypeOrJarStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeVariableStatement(DB2zSQLParser.RevokeVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeUseOfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeUseOfStatement(DB2zSQLParser.RevokeUseOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantUseOfTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantUseOfTarget(DB2zSQLParser.GrantUseOfTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantVariableAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantVariableAuthority(DB2zSQLParser.GrantVariableAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantTableAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantTableAuthority(DB2zSQLParser.GrantTableAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantSystemAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantSystemAuthority(DB2zSQLParser.GrantSystemAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantSequenceAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantSequenceAuthority(DB2zSQLParser.GrantSequenceAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantSchemaAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantSchemaAuthority(DB2zSQLParser.GrantSchemaAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantPlanAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantPlanAuthority(DB2zSQLParser.GrantPlanAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantPackageAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantPackageAuthority(DB2zSQLParser.GrantPackageAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageSpecification(DB2zSQLParser.PackageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecification(DB2zSQLParser.FunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(DB2zSQLParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#withGrantOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithGrantOption(DB2zSQLParser.WithGrantOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeByOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeByOption(DB2zSQLParser.RevokeByOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#revokeDependentPrivilegesOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeDependentPrivilegesOption(DB2zSQLParser.RevokeDependentPrivilegesOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#grantDatabaseAuthority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantDatabaseAuthority(DB2zSQLParser.GrantDatabaseAuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#statementInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInformation(DB2zSQLParser.StatementInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#statementInformationVariableEquate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInformationVariableEquate(DB2zSQLParser.StatementInformationVariableEquateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#statementInformationItemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInformationItemName(DB2zSQLParser.StatementInformationItemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#conditionInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionInformation(DB2zSQLParser.ConditionInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#conditionInformationVariableEquate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionInformationVariableEquate(DB2zSQLParser.ConditionInformationVariableEquateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#conditionInformationItemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionInformationItemName(DB2zSQLParser.ConditionInformationItemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#connectionInformationItemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionInformationItemName(DB2zSQLParser.ConnectionInformationItemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#combinedInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinedInformation(DB2zSQLParser.CombinedInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#combinedInformationOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinedInformationOption(DB2zSQLParser.CombinedInformationOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fetchOrientation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchOrientation(DB2zSQLParser.FetchOrientationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rowPositioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowPositioned(DB2zSQLParser.RowPositionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rowsetPositioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsetPositioned(DB2zSQLParser.RowsetPositionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#singleRowFetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRowFetch(DB2zSQLParser.SingleRowFetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fetchTargetVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchTargetVariable(DB2zSQLParser.FetchTargetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#multipleRowFetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleRowFetch(DB2zSQLParser.MultipleRowFetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#multipleRowFetchForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleRowFetchForClause(DB2zSQLParser.MultipleRowFetchForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#multipleRowFetchIntoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleRowFetchIntoClause(DB2zSQLParser.MultipleRowFetchIntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#explainPlanClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainPlanClause(DB2zSQLParser.ExplainPlanClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#explainStmtcacheClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStmtcacheClause(DB2zSQLParser.ExplainStmtcacheClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#explainPackageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainPackageClause(DB2zSQLParser.ExplainPackageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#explainStabilizedDynamicQueryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStabilizedDynamicQueryClause(DB2zSQLParser.ExplainStabilizedDynamicQueryClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packageScopeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageScopeSpecification(DB2zSQLParser.PackageScopeSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#collectionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionName(DB2zSQLParser.CollectionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packageScopePackageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageScopePackageName(DB2zSQLParser.PackageScopePackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#versionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionName(DB2zSQLParser.VersionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sourceRowData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceRowData(DB2zSQLParser.SourceRowDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aliasDesignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDesignation(DB2zSQLParser.AliasDesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropDatabaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabaseClause(DB2zSQLParser.DropDatabaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunctionClause(DB2zSQLParser.DropFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexClause(DB2zSQLParser.DropIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropMaskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMaskClause(DB2zSQLParser.DropMaskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropPackageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPackageClause(DB2zSQLParser.DropPackageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropPermissionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPermissionClause(DB2zSQLParser.DropPermissionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropProcedureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedureClause(DB2zSQLParser.DropProcedureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropRoleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoleClause(DB2zSQLParser.DropRoleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropSequenceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSequenceClause(DB2zSQLParser.DropSequenceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropStogroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStogroupClause(DB2zSQLParser.DropStogroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropSynonymClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSynonymClause(DB2zSQLParser.DropSynonymClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableClause(DB2zSQLParser.DropTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropTablespaceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespaceClause(DB2zSQLParser.DropTablespaceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropTriggerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTriggerClause(DB2zSQLParser.DropTriggerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropTrustedContextClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrustedContextClause(DB2zSQLParser.DropTrustedContextClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTypeClause(DB2zSQLParser.DropTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropVariableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropVariableClause(DB2zSQLParser.DropVariableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropViewClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropViewClause(DB2zSQLParser.DropViewClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packageDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDesignator(DB2zSQLParser.PackageDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#describeUsingOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeUsingOption(DB2zSQLParser.DescribeUsingOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGlobalTemporaryTableLikeClause(DB2zSQLParser.DeclareGlobalTemporaryTableLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#onCommitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommitClause(DB2zSQLParser.OnCommitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#loggedWithRollbackClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoggedWithRollbackClause(DB2zSQLParser.LoggedWithRollbackClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createViewCheckOptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewCheckOptionClause(DB2zSQLParser.CreateViewCheckOptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextDefaultRoleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextDefaultRoleClause(DB2zSQLParser.TrustedContextDefaultRoleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextEnableDisableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextEnableDisableClause(DB2zSQLParser.TrustedContextEnableDisableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextDefaultSecurityLabelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextDefaultSecurityLabelClause(DB2zSQLParser.TrustedContextDefaultSecurityLabelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextAttributesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextAttributesClause(DB2zSQLParser.TrustedContextAttributesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextWithUseForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextWithUseForClause(DB2zSQLParser.TrustedContextWithUseForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextAttribute1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextAttribute1(DB2zSQLParser.TrustedContextAttribute1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextAttribute2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextAttribute2(DB2zSQLParser.TrustedContextAttribute2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextUseFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextUseFor(DB2zSQLParser.TrustedContextUseForContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#userOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOptions(DB2zSQLParser.UserOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggerDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerDefinition(DB2zSQLParser.TriggerDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggerActivationTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerActivationTime(DB2zSQLParser.TriggerActivationTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(DB2zSQLParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggerGranularity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerGranularity(DB2zSQLParser.TriggerGranularityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggeredAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggeredAction(DB2zSQLParser.TriggeredActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlTriggerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlTriggerBody(DB2zSQLParser.SqlTriggerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggeredSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggeredSqlStatement(DB2zSQLParser.TriggeredSqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggerDefinitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerDefinitionOption(DB2zSQLParser.TriggerDefinitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTableInClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableInClause(DB2zSQLParser.CreateTableInClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#customVolatileClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomVolatileClause(DB2zSQLParser.CustomVolatileClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTableColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableColumnDefinition(DB2zSQLParser.CreateTableColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#editprocClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditprocClause(DB2zSQLParser.EditprocClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#validprocClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidprocClause(DB2zSQLParser.ValidprocClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#auditClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuditClause(DB2zSQLParser.AuditClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#obidClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObidClause(DB2zSQLParser.ObidClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dataCaptureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCaptureClause(DB2zSQLParser.DataCaptureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#restrictOnDropClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrictOnDropClause(DB2zSQLParser.RestrictOnDropClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#ccsidClause1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCcsidClause1(DB2zSQLParser.CcsidClause1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#ccsidClause2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCcsidClause2(DB2zSQLParser.CcsidClause2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#cardinalityClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinalityClause(DB2zSQLParser.CardinalityClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#appendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendClause(DB2zSQLParser.AppendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#memberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberClause(DB2zSQLParser.MemberClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trackmodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackmodClause(DB2zSQLParser.TrackmodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#pagenumClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPagenumClause(DB2zSQLParser.PagenumClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fieldprocClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldprocClause(DB2zSQLParser.FieldprocClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asSecurityLabelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsSecurityLabelClause(DB2zSQLParser.AsSecurityLabelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#implicitlyHiddenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitlyHiddenClause(DB2zSQLParser.ImplicitlyHiddenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#inlineLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineLengthClause(DB2zSQLParser.InlineLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#copyOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptions(DB2zSQLParser.CopyOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#copyOptionIdentity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptionIdentity(DB2zSQLParser.CopyOptionIdentityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#copyOptionRowChangeTimestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptionRowChangeTimestamp(DB2zSQLParser.CopyOptionRowChangeTimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#copyOptionColumnDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptionColumnDefaults(DB2zSQLParser.CopyOptionColumnDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#copyOptionXmlTypeModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptionXmlTypeModifiers(DB2zSQLParser.CopyOptionXmlTypeModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asResultTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsResultTable(DB2zSQLParser.AsResultTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableAsResultTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGlobalTemporaryTableAsResultTable(DB2zSQLParser.DeclareGlobalTemporaryTableAsResultTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTableMaterializedQueryDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableMaterializedQueryDefinition(DB2zSQLParser.CreateTableMaterializedQueryDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTableColumnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableColumnConstraint(DB2zSQLParser.CreateTableColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#organizationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrganizationClause(DB2zSQLParser.OrganizationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createGlobalTemporaryTableColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGlobalTemporaryTableColumnDefinition(DB2zSQLParser.CreateGlobalTemporaryTableColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#declareGlobalTemporaryTableColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGlobalTemporaryTableColumnDefinition(DB2zSQLParser.DeclareGlobalTemporaryTableColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterDeclaration1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration1(DB2zSQLParser.ParameterDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterDeclaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration2(DB2zSQLParser.ParameterDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterDeclaration3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration3(DB2zSQLParser.ParameterDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalScalarOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementExternalScalarOptions(DB2zSQLParser.CreateFunctionStatementExternalScalarOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#externalNameOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalNameOption1(DB2zSQLParser.ExternalNameOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#externalNameOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalNameOption2(DB2zSQLParser.ExternalNameOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dynamicResultSetOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicResultSetOption(DB2zSQLParser.DynamicResultSetOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#languageOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageOption1(DB2zSQLParser.LanguageOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#languageOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageOption2(DB2zSQLParser.LanguageOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#languageOption3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageOption3(DB2zSQLParser.LanguageOption3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#languageOption4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageOption4(DB2zSQLParser.LanguageOption4Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#languageOption5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageOption5(DB2zSQLParser.LanguageOption5Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterStyleOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterStyleOption1(DB2zSQLParser.ParameterStyleOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterStyleOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterStyleOption2(DB2zSQLParser.ParameterStyleOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterStyleOption3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterStyleOption3(DB2zSQLParser.ParameterStyleOption3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#deterministicOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterministicOption(DB2zSQLParser.DeterministicOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fencedOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFencedOption(DB2zSQLParser.FencedOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nullInputOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullInputOption1(DB2zSQLParser.NullInputOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nullInputOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullInputOption2(DB2zSQLParser.NullInputOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#debugOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugOption(DB2zSQLParser.DebugOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlDataOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDataOption1(DB2zSQLParser.SqlDataOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlDataOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDataOption2(DB2zSQLParser.SqlDataOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlDataOption3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDataOption3(DB2zSQLParser.SqlDataOption3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlDataOption4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDataOption4(DB2zSQLParser.SqlDataOption4Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#externalActionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalActionOption(DB2zSQLParser.ExternalActionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packagePathOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagePathOption(DB2zSQLParser.PackagePathOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#scratchpadOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScratchpadOption(DB2zSQLParser.ScratchpadOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#finalCallOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalCallOption(DB2zSQLParser.FinalCallOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parallelOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelOption1(DB2zSQLParser.ParallelOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parallelOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelOption2(DB2zSQLParser.ParallelOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dbinfoOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbinfoOption(DB2zSQLParser.DbinfoOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#cardinalityOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinalityOption(DB2zSQLParser.CardinalityOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#collectionIdOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionIdOption(DB2zSQLParser.CollectionIdOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#wlmEnvironmentOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWlmEnvironmentOption1(DB2zSQLParser.WlmEnvironmentOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#wlmEnvironmentOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWlmEnvironmentOption2(DB2zSQLParser.WlmEnvironmentOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#wlmEnvironmentOption3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWlmEnvironmentOption3(DB2zSQLParser.WlmEnvironmentOption3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asuTimeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsuTimeOption(DB2zSQLParser.AsuTimeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#stayResidentOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStayResidentOption(DB2zSQLParser.StayResidentOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#programTypeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramTypeOption(DB2zSQLParser.ProgramTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#securityOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityOption(DB2zSQLParser.SecurityOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#stopAfterFailureOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopAfterFailureOption(DB2zSQLParser.StopAfterFailureOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#runOptionsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunOptionsOption(DB2zSQLParser.RunOptionsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#commitOnReturnOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitOnReturnOption(DB2zSQLParser.CommitOnReturnOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#specialRegistersOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialRegistersOption(DB2zSQLParser.SpecialRegistersOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dispatchOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispatchOption(DB2zSQLParser.DispatchOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#securedOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuredOption(DB2zSQLParser.SecuredOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#specificNameOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificNameOption1(DB2zSQLParser.SpecificNameOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#specificNameOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificNameOption2(DB2zSQLParser.SpecificNameOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterOption1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterOption1(DB2zSQLParser.ParameterOption1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterOption2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterOption2(DB2zSQLParser.ParameterOption2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementExternalTableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementExternalTableOptions(DB2zSQLParser.CreateFunctionStatementExternalTableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementSourcedOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementSourcedOptions(DB2zSQLParser.CreateFunctionStatementSourcedOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createFunctionStatementInlineSqlScalarOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatementInlineSqlScalarOptions(DB2zSQLParser.CreateFunctionStatementInlineSqlScalarOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sequenceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceAlias(DB2zSQLParser.SequenceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(DB2zSQLParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#authorization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorization(DB2zSQLParser.AuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#searchedDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedDelete(DB2zSQLParser.SearchedDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#positionedDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionedDelete(DB2zSQLParser.PositionedDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#searchedUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedUpdate(DB2zSQLParser.SearchedUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#positionedUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionedUpdate(DB2zSQLParser.PositionedUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sourceValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceValues(DB2zSQLParser.SourceValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesSingleRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesSingleRow(DB2zSQLParser.ValuesSingleRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesMultipleRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesMultipleRow(DB2zSQLParser.ValuesMultipleRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#matchingCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingCondition(DB2zSQLParser.MatchingConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#modificationOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificationOperation(DB2zSQLParser.ModificationOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#assignmentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentClause(DB2zSQLParser.AssignmentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setAssignmentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentClause(DB2zSQLParser.SetAssignmentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#setAssignmentTargetVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentTargetVariable(DB2zSQLParser.SetAssignmentTargetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#updateOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateOperation(DB2zSQLParser.UpdateOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#deleteOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteOperation(DB2zSQLParser.DeleteOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#insertOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOperation(DB2zSQLParser.InsertOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#signalInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalInformation(DB2zSQLParser.SignalInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesList1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList1(DB2zSQLParser.ValuesList1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesList2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList2(DB2zSQLParser.ValuesList2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesList3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList3(DB2zSQLParser.ValuesList3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesList4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList4(DB2zSQLParser.ValuesList4Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#includeColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeColumns(DB2zSQLParser.IncludeColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#multipleRowInsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleRowInsert(DB2zSQLParser.MultipleRowInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#regenerateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegenerateClause(DB2zSQLParser.RegenerateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterIndexOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexOptions(DB2zSQLParser.AlterIndexOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#bufferpoolOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBufferpoolOption(DB2zSQLParser.BufferpoolOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#closeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseOption(DB2zSQLParser.CloseOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#copyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOption(DB2zSQLParser.CopyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dssizeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDssizeOption(DB2zSQLParser.DssizeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#piecesizeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiecesizeOption(DB2zSQLParser.PiecesizeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#clusterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterOption(DB2zSQLParser.ClusterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#paddedOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddedOption(DB2zSQLParser.PaddedOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#compressOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompressOption(DB2zSQLParser.CompressOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#defineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineOption(DB2zSQLParser.DefineOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#locksizeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocksizeOption(DB2zSQLParser.LocksizeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#lockmaxOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockmaxOption(DB2zSQLParser.LockmaxOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#enableDisableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableDisableOption(DB2zSQLParser.EnableDisableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#loggedOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoggedOption(DB2zSQLParser.LoggedOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#notAtomicPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotAtomicPhrase(DB2zSQLParser.NotAtomicPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterIndexPartitionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexPartitionOptions(DB2zSQLParser.AlterIndexPartitionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#usingSpecification1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingSpecification1(DB2zSQLParser.UsingSpecification1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#freeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeSpecification(DB2zSQLParser.FreeSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#gbpcacheSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGbpcacheSpecification(DB2zSQLParser.GbpcacheSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionElement(DB2zSQLParser.PartitionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#applCompatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplCompatValue(DB2zSQLParser.ApplCompatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLevel(DB2zSQLParser.FunctionLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionParameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterType(DB2zSQLParser.FunctionParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDataType(DB2zSQLParser.FunctionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionBuiltInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBuiltInType(DB2zSQLParser.FunctionBuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#procedureBuiltinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBuiltinType(DB2zSQLParser.ProcedureBuiltinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTypeArrayBuiltinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeArrayBuiltinType(DB2zSQLParser.CreateTypeArrayBuiltinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTypeArrayBuiltinType2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeArrayBuiltinType2(DB2zSQLParser.CreateTypeArrayBuiltinType2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createVariableBuiltInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateVariableBuiltInType(DB2zSQLParser.CreateVariableBuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sourceDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceDataType(DB2zSQLParser.SourceDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOptionList(DB2zSQLParser.FunctionOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#procedureOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOptionList(DB2zSQLParser.ProcedureOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createProcedureOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedureOptionList(DB2zSQLParser.CreateProcedureOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createProcedureSQLPLOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedureSQLPLOptionList(DB2zSQLParser.CreateProcedureSQLPLOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#commitOnReturnOptionSQLPL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitOnReturnOptionSQLPL(DB2zSQLParser.CommitOnReturnOptionSQLPLContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#schemaQualifierOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaQualifierOption(DB2zSQLParser.SchemaQualifierOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#currentDataOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDataOption(DB2zSQLParser.CurrentDataOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#immediateWriteOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediateWriteOption(DB2zSQLParser.ImmediateWriteOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#explainOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOption(DB2zSQLParser.ExplainOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#reoptOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReoptOption(DB2zSQLParser.ReoptOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packageOwnerOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOwnerOption(DB2zSQLParser.PackageOwnerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#deferPrepareOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferPrepareOption(DB2zSQLParser.DeferPrepareOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#degreeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegreeOption(DB2zSQLParser.DegreeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dynamicRulesOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicRulesOption(DB2zSQLParser.DynamicRulesOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#concurrentAccessOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrentAccessOption(DB2zSQLParser.ConcurrentAccessOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#applicationEncodingOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationEncodingOption(DB2zSQLParser.ApplicationEncodingOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#isolationLevelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevelOption(DB2zSQLParser.IsolationLevelOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#keepDynamicOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepDynamicOption(DB2zSQLParser.KeepDynamicOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#opthintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpthintOption(DB2zSQLParser.OpthintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlPathOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlPathOption(DB2zSQLParser.SqlPathOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlPathOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlPathOptionList(DB2zSQLParser.SqlPathOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#queryAccelerationOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryAccelerationOption(DB2zSQLParser.QueryAccelerationOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#getAccelArchiveOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAccelArchiveOption(DB2zSQLParser.GetAccelArchiveOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#accelerationOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccelerationOption(DB2zSQLParser.AccelerationOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#releaseAtOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseAtOption(DB2zSQLParser.ReleaseAtOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#businessTimeSensitiveOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBusinessTimeSensitiveOption(DB2zSQLParser.BusinessTimeSensitiveOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#systemTimeSensitiveOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemTimeSensitiveOption(DB2zSQLParser.SystemTimeSensitiveOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#archiveSensitiveOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchiveSensitiveOption(DB2zSQLParser.ArchiveSensitiveOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#applcompatOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplcompatOption(DB2zSQLParser.ApplcompatOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#validateOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateOption(DB2zSQLParser.ValidateOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#roundingOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingOption(DB2zSQLParser.RoundingOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dateFormatOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateFormatOption(DB2zSQLParser.DateFormatOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#timeFormatOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeFormatOption(DB2zSQLParser.TimeFormatOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#decimalOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalOption(DB2zSQLParser.DecimalOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#forUpdateOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateOption(DB2zSQLParser.ForUpdateOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#concentrateStatementsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcentrateStatementsOption(DB2zSQLParser.ConcentrateStatementsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#acceleratorOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceleratorOption(DB2zSQLParser.AcceleratorOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#procedureDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDataType(DB2zSQLParser.ProcedureDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterSequenceOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequenceOptionList(DB2zSQLParser.AlterSequenceOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createSequenceOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequenceOptionList(DB2zSQLParser.CreateSequenceOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asTypeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeOption(DB2zSQLParser.AsTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#startOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartOption(DB2zSQLParser.StartOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#restartOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestartOption(DB2zSQLParser.RestartOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#incrementOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOption(DB2zSQLParser.IncrementOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#minvalueOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinvalueOption(DB2zSQLParser.MinvalueOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#maxvalueOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxvalueOption(DB2zSQLParser.MaxvalueOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#cycleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleOption(DB2zSQLParser.CycleOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#cacheOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheOption(DB2zSQLParser.CacheOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#orderOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderOption(DB2zSQLParser.OrderOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#keyLabelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyLabelOption(DB2zSQLParser.KeyLabelOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dataclasOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataclasOption(DB2zSQLParser.DataclasOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#mgmtclasOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMgmtclasOption(DB2zSQLParser.MgmtclasOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#storclasOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorclasOption(DB2zSQLParser.StorclasOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterStogroupOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStogroupOptionList(DB2zSQLParser.AlterStogroupOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTableOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableOptionList(DB2zSQLParser.AlterTableOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTablespaceOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespaceOptionList(DB2zSQLParser.AlterTablespaceOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createTablespaceOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceOptionList(DB2zSQLParser.CreateTablespaceOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#trustedContextOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrustedContextOptionList(DB2zSQLParser.TrustedContextOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#databaseOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseOptionList(DB2zSQLParser.DatabaseOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createIndexOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexOptionList(DB2zSQLParser.CreateIndexOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#createLobTablespaceOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLobTablespaceOptionList(DB2zSQLParser.CreateLobTablespaceOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#inDatabaseOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInDatabaseOption(DB2zSQLParser.InDatabaseOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#segsizeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegsizeOption(DB2zSQLParser.SegsizeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#numpartsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumpartsOption(DB2zSQLParser.NumpartsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionByGrowthSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByGrowthSpecification(DB2zSQLParser.PartitionByGrowthSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionByRangeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByRangeSpecification(DB2zSQLParser.PartitionByRangeSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionByRangePartitionPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByRangePartitionPhrase(DB2zSQLParser.PartitionByRangePartitionPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#insertAlgorithmOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertAlgorithmOption(DB2zSQLParser.InsertAlgorithmOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#maxrowsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxrowsOption(DB2zSQLParser.MaxrowsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#maxpartitionsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxpartitionsOption(DB2zSQLParser.MaxpartitionsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#usingSpecification2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingSpecification2(DB2zSQLParser.UsingSpecification2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#stogroupOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStogroupOptions(DB2zSQLParser.StogroupOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlIndexSpecification(DB2zSQLParser.XmlIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlPatternClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlPatternClause(DB2zSQLParser.XmlPatternClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterAttributesOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAttributesOptions(DB2zSQLParser.AlterAttributesOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#addAttributesOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddAttributesOptions(DB2zSQLParser.AddAttributesOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dropAttributesOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAttributesOptions(DB2zSQLParser.DropAttributesOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#includeColumnPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeColumnPhrase(DB2zSQLParser.IncludeColumnPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#userClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserClause(DB2zSQLParser.UserClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#userClauseAddOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserClauseAddOptions(DB2zSQLParser.UserClauseAddOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#userClauseReplaceOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserClauseReplaceOptions(DB2zSQLParser.UserClauseReplaceOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#userClauseDropOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserClauseDropOptions(DB2zSQLParser.UserClauseDropOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#useOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseOptions(DB2zSQLParser.UseOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPartitionClause(DB2zSQLParser.AlterPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#usingBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingBlock(DB2zSQLParser.UsingBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#freeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeBlock(DB2zSQLParser.FreeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#moveTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveTableClause(DB2zSQLParser.MoveTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#gbpcacheBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGbpcacheBlock(DB2zSQLParser.GbpcacheBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aliasDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDesignator(DB2zSQLParser.AliasDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#multipleColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleColumnList(DB2zSQLParser.MultipleColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(DB2zSQLParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(DB2zSQLParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinitionOptionList1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableColumnDefinitionOptionList1(DB2zSQLParser.AlterTableColumnDefinitionOptionList1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinitionOptionList2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableColumnDefinitionOptionList2(DB2zSQLParser.AlterTableColumnDefinitionOptionList2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(DB2zSQLParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#generatedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedClause(DB2zSQLParser.GeneratedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#generatedClause2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedClause2(DB2zSQLParser.GeneratedClause2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asIdentityClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsIdentityClause(DB2zSQLParser.AsIdentityClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asIdentityClauseOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsIdentityClauseOptionList(DB2zSQLParser.AsIdentityClauseOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asRowChangeTimestampClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsRowChangeTimestampClause(DB2zSQLParser.AsRowChangeTimestampClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asRowTransactionStartIDClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsRowTransactionStartIDClause(DB2zSQLParser.AsRowTransactionStartIDClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asRowTransactionTimestampClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsRowTransactionTimestampClause(DB2zSQLParser.AsRowTransactionTimestampClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#asGeneratedExpressionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsGeneratedExpressionClause(DB2zSQLParser.AsGeneratedExpressionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nonDeterministicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDeterministicExpression(DB2zSQLParser.NonDeterministicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nonDeterministicExpressionSessionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDeterministicExpressionSessionVariable(DB2zSQLParser.NonDeterministicExpressionSessionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#columnAlteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlteration(DB2zSQLParser.ColumnAlterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#columnAlterationOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlterationOptionList(DB2zSQLParser.ColumnAlterationOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alteredDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteredDataType(DB2zSQLParser.AlteredDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(DB2zSQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#builtInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInType(DB2zSQLParser.BuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sequenceDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceDataType(DB2zSQLParser.SequenceDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sequenceBuiltInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceBuiltInType(DB2zSQLParser.SequenceBuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDataType(DB2zSQLParser.SqlDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlTypeModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTypeModifier(DB2zSQLParser.XmlTypeModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlSchemaSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlSchemaSpecification(DB2zSQLParser.XmlSchemaSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlElementName(DB2zSQLParser.XmlElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#piName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiName(DB2zSQLParser.PiNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#registeredXmlSchemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisteredXmlSchemaName(DB2zSQLParser.RegisteredXmlSchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#targetNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetNamespace(DB2zSQLParser.TargetNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#schemaLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaLocation(DB2zSQLParser.SchemaLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#identityAlteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityAlteration(DB2zSQLParser.IdentityAlterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#uniqueConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueConstraint(DB2zSQLParser.UniqueConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#referentialConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferentialConstraint(DB2zSQLParser.ReferentialConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#referencesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencesClause(DB2zSQLParser.ReferencesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#checkConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraint(DB2zSQLParser.CheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitioningClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitioningClause(DB2zSQLParser.PartitioningClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpression(DB2zSQLParser.PartitionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionLimitKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionLimitKey(DB2zSQLParser.PartitionLimitKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitioningPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitioningPhrase(DB2zSQLParser.PartitioningPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionHashSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionHashSpace(DB2zSQLParser.PartitionHashSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterHashOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterHashOrganization(DB2zSQLParser.AlterHashOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitioningClauseElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitioningClauseElement(DB2zSQLParser.PartitioningClauseElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(DB2zSQLParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rotatePartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotatePartitionClause(DB2zSQLParser.RotatePartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#extraRowOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraRowOption(DB2zSQLParser.ExtraRowOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#materializedQueryDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterializedQueryDefinition(DB2zSQLParser.MaterializedQueryDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#materializedQueryAlteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterializedQueryAlteration(DB2zSQLParser.MaterializedQueryAlterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#refreshableTableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshableTableOptions(DB2zSQLParser.RefreshableTableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dataInitiallyDeferredPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataInitiallyDeferredPhrase(DB2zSQLParser.DataInitiallyDeferredPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#refreshDeferredPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshDeferredPhrase(DB2zSQLParser.RefreshDeferredPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#refreshableTableOptionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshableTableOptionsList(DB2zSQLParser.RefreshableTableOptionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#materializedQueryTableAlteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterializedQueryTableAlteration(DB2zSQLParser.MaterializedQueryTableAlterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#periodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodDefinition(DB2zSQLParser.PeriodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTableColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableColumnDefinition(DB2zSQLParser.AlterTableColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#externalProgramName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalProgramName(DB2zSQLParser.ExternalProgramNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packagePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagePath(DB2zSQLParser.PackagePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#collectionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionID(DB2zSQLParser.CollectionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#runTimeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunTimeOptions(DB2zSQLParser.RunTimeOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(DB2zSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(DB2zSQLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DB2zSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#keyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyExpression(DB2zSQLParser.KeyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rowChangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowChangeExpression(DB2zSQLParser.RowChangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sequenceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceReference(DB2zSQLParser.SequenceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInvocation(DB2zSQLParser.FunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#scalarFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionInvocation(DB2zSQLParser.ScalarFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aggregateFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionInvocation(DB2zSQLParser.AggregateFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#regressionFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegressionFunctionInvocation(DB2zSQLParser.RegressionFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#externalFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalFunctionInvocation(DB2zSQLParser.ExternalFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#labeledDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledDuration(DB2zSQLParser.LabeledDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#durationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurationSuffix(DB2zSQLParser.DurationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlCastSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlCastSpecification(DB2zSQLParser.XmlCastSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayElementSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementSpecification(DB2zSQLParser.ArrayElementSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(DB2zSQLParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(DB2zSQLParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#olapSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapSpecification(DB2zSQLParser.OlapSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#orderedOlapSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedOlapSpecification(DB2zSQLParser.OrderedOlapSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#olapSpecificationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapSpecificationFunction(DB2zSQLParser.OlapSpecificationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#lagFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLagFunction(DB2zSQLParser.LagFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#leadFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadFunction(DB2zSQLParser.LeadFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#respectNullsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespectNullsClause(DB2zSQLParser.RespectNullsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#windowPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowPartitionClause(DB2zSQLParser.WindowPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#windowOrderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowOrderClause(DB2zSQLParser.WindowOrderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#windowOrderClauseQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowOrderClauseQualifier(DB2zSQLParser.WindowOrderClauseQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#numberingSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberingSpecification(DB2zSQLParser.NumberingSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aggregationSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationSpecification(DB2zSQLParser.AggregationSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunction(DB2zSQLParser.AggregateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#regressionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegressionFunction(DB2zSQLParser.RegressionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#olapColumnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapColumnFunction(DB2zSQLParser.OlapColumnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#firstValueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstValueFunction(DB2zSQLParser.FirstValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#lastValueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastValueFunction(DB2zSQLParser.LastValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nthValueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNthValueFunction(DB2zSQLParser.NthValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#ratioToReportFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRatioToReportFunction(DB2zSQLParser.RatioToReportFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#listaggFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaggFunction(DB2zSQLParser.ListaggFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayaggFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayaggFunction(DB2zSQLParser.ArrayaggFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayaggOrdinaryFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayaggOrdinaryFunction(DB2zSQLParser.ArrayaggOrdinaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayaggAssociativeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayaggAssociativeFunction(DB2zSQLParser.ArrayaggAssociativeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#correlationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelationFunction(DB2zSQLParser.CorrelationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#covarianceFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovarianceFunction(DB2zSQLParser.CovarianceFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#covarianceSampFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovarianceSampFunction(DB2zSQLParser.CovarianceSampFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#cumeDistFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCumeDistFunction(DB2zSQLParser.CumeDistFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#percentileContFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentileContFunction(DB2zSQLParser.PercentileContFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#percentileDiscFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentileDiscFunction(DB2zSQLParser.PercentileDiscFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#percentRankFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentRankFunction(DB2zSQLParser.PercentRankFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlaggFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlaggFunction(DB2zSQLParser.XmlaggFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlaggOrderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlaggOrderByClause(DB2zSQLParser.XmlaggOrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlaggOrderByOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlaggOrderByOption(DB2zSQLParser.XmlaggOrderByOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aggregateOrderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateOrderByClause(DB2zSQLParser.AggregateOrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aggregateOrderByOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateOrderByOption(DB2zSQLParser.AggregateOrderByOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#windowAggregationGroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowAggregationGroupClause(DB2zSQLParser.WindowAggregationGroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupStart(DB2zSQLParser.GroupStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBetween(DB2zSQLParser.GroupBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupEnd(DB2zSQLParser.GroupEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupBound1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBound1(DB2zSQLParser.GroupBound1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupBound2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBound2(DB2zSQLParser.GroupBound2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#unboundedPreceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedPreceding(DB2zSQLParser.UnboundedPrecedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#unboundedFollowing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedFollowing(DB2zSQLParser.UnboundedFollowingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#boundedPreceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedPreceding(DB2zSQLParser.BoundedPrecedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#boundedFollowing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedFollowing(DB2zSQLParser.BoundedFollowingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#currentRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRow(DB2zSQLParser.CurrentRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#scalarFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunction(DB2zSQLParser.ScalarFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tableFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunction(DB2zSQLParser.TableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#specialRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialRegister(DB2zSQLParser.SpecialRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiAnalogyFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiAnalogyFunction(DB2zSQLParser.AiAnalogyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiFunctionExpression(DB2zSQLParser.AiFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiAnalogyFunctionSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiAnalogyFunctionSource(DB2zSQLParser.AiAnalogyFunctionSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiAnalogyFunctionTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiAnalogyFunctionTarget(DB2zSQLParser.AiAnalogyFunctionTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiAnalogyFunctionSource1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiAnalogyFunctionSource1(DB2zSQLParser.AiAnalogyFunctionSource1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiAnalogyFunctionSource2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiAnalogyFunctionSource2(DB2zSQLParser.AiAnalogyFunctionSource2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiAnalogyFunctionTarget1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiAnalogyFunctionTarget1(DB2zSQLParser.AiAnalogyFunctionTarget1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiAnalogyFunctionTarget2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiAnalogyFunctionTarget2(DB2zSQLParser.AiAnalogyFunctionTarget2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiSemanticClusterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiSemanticClusterFunction(DB2zSQLParser.AiSemanticClusterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiSemanticClusterMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiSemanticClusterMemberExpression(DB2zSQLParser.AiSemanticClusterMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiSemanticClusterClusteringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiSemanticClusterClusteringExpression(DB2zSQLParser.AiSemanticClusterClusteringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiSimilarityFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiSimilarityFunction(DB2zSQLParser.AiSimilarityFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiSimilarityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiSimilarityExpression(DB2zSQLParser.AiSimilarityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiSimilarityExpression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiSimilarityExpression1(DB2zSQLParser.AiSimilarityExpression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aiSimilarityExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAiSimilarityExpression2(DB2zSQLParser.AiSimilarityExpression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlelementFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlelementFunction(DB2zSQLParser.XmlelementFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlforestFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlforestFunction(DB2zSQLParser.XmlforestFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlmodifyFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlmodifyFunction(DB2zSQLParser.XmlmodifyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlpiFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlpiFunction(DB2zSQLParser.XmlpiFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlqueryFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlqueryFunction(DB2zSQLParser.XmlqueryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlattributesFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlattributesFunction(DB2zSQLParser.XmlattributesFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlserializeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserializeFunction(DB2zSQLParser.XmlserializeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlnamespaceFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespaceFunction(DB2zSQLParser.XmlnamespaceFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlnamespaceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespaceOption(DB2zSQLParser.XmlnamespaceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlserializeFunctionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserializeFunctionOptions(DB2zSQLParser.XmlserializeFunctionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlFunctionOptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlFunctionOptionClause(DB2zSQLParser.XmlFunctionOptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlFunctionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlFunctionOption(DB2zSQLParser.XmlFunctionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#elementContentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementContentExpression(DB2zSQLParser.ElementContentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xqueryExpressionConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryExpressionConstant(DB2zSQLParser.XqueryExpressionConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xqueryArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryArgument(DB2zSQLParser.XqueryArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmltableFunctionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltableFunctionSpecification(DB2zSQLParser.XmltableFunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rowXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowXqueryExpressionConstant(DB2zSQLParser.RowXqueryExpressionConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rowXqueryArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowXqueryArgument(DB2zSQLParser.RowXqueryArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xqueryContextItemExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryContextItemExpression(DB2zSQLParser.XqueryContextItemExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xqueryVariableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryVariableExpression(DB2zSQLParser.XqueryVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlTableRegularColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableRegularColumnDefinition(DB2zSQLParser.XmlTableRegularColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(DB2zSQLParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#defaultClause1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause1(DB2zSQLParser.DefaultClause1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#defaultClause2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause2(DB2zSQLParser.DefaultClause2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#defaultClauseAllowables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClauseAllowables(DB2zSQLParser.DefaultClauseAllowablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#distinctTypeCastFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctTypeCastFunctionName(DB2zSQLParser.DistinctTypeCastFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#columnXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnXqueryExpressionConstant(DB2zSQLParser.ColumnXqueryExpressionConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlTableOrdinalityColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableOrdinalityColumnDefinition(DB2zSQLParser.XmlTableOrdinalityColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlnamespacesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespacesDeclaration(DB2zSQLParser.XmlnamespacesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlnamespacesFunctionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespacesFunctionSpecification(DB2zSQLParser.XmlnamespacesFunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlnamespacesFunctionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespacesFunctionArguments(DB2zSQLParser.XmlnamespacesFunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#namespaceUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceUri(DB2zSQLParser.NamespaceUriContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#namespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacePrefix(DB2zSQLParser.NamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#timeZoneSpecificExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneSpecificExpression(DB2zSQLParser.TimeZoneSpecificExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#timeZoneExpressionSubset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneExpressionSubset(DB2zSQLParser.TimeZoneExpressionSubsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(DB2zSQLParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#resultExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultExpression(DB2zSQLParser.ResultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#searchedWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedWhenClause(DB2zSQLParser.SearchedWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#simpleWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleWhenClause(DB2zSQLParser.SimpleWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#searchCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchCondition(DB2zSQLParser.SearchConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#checkCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckCondition(DB2zSQLParser.CheckConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(DB2zSQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#basicPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicPredicate(DB2zSQLParser.BasicPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#rowValueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowValueExpression(DB2zSQLParser.RowValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#quantifiedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedPredicate(DB2zSQLParser.QuantifiedPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayExistsPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExistsPredicate(DB2zSQLParser.ArrayExistsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(DB2zSQLParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#distinctPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctPredicate(DB2zSQLParser.DistinctPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#existsPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsPredicate(DB2zSQLParser.ExistsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(DB2zSQLParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#likePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(DB2zSQLParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nullPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(DB2zSQLParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmlExistsPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlExistsPredicate(DB2zSQLParser.XmlExistsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(DB2zSQLParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#castSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastSpecification(DB2zSQLParser.CastSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(DB2zSQLParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#castDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastDataType(DB2zSQLParser.CastDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#castBuiltInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastBuiltInType(DB2zSQLParser.CastBuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#integerInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerInParens(DB2zSQLParser.IntegerInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(DB2zSQLParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#ccsidQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCcsidQualifier(DB2zSQLParser.CcsidQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#forDataQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDataQualifier(DB2zSQLParser.ForDataQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#distinctTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctTypeName(DB2zSQLParser.DistinctTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(DB2zSQLParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DB2zSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#ccsidValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCcsidValue(DB2zSQLParser.CcsidValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DB2zSQLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sourceColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceColumnName(DB2zSQLParser.SourceColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#targetColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetColumnName(DB2zSQLParser.TargetColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#newColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewColumnName(DB2zSQLParser.NewColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#beginColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginColumnName(DB2zSQLParser.BeginColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#endColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndColumnName(DB2zSQLParser.EndColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#correlationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelationName(DB2zSQLParser.CorrelationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#locationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationName(DB2zSQLParser.LocationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(DB2zSQLParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DB2zSQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#alterTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableName(DB2zSQLParser.AlterTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#auxTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxTableName(DB2zSQLParser.AuxTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#historyTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistoryTableName(DB2zSQLParser.HistoryTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#cloneTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneTableName(DB2zSQLParser.CloneTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#archiveTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchiveTableName(DB2zSQLParser.ArchiveTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(DB2zSQLParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#programName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramName(DB2zSQLParser.ProgramNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(DB2zSQLParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#planName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanName(DB2zSQLParser.PlanNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(DB2zSQLParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(DB2zSQLParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#arrayTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeName(DB2zSQLParser.ArrayTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#jarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJarName(DB2zSQLParser.JarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#savepointName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointName(DB2zSQLParser.SavepointNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(DB2zSQLParser.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(DB2zSQLParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#routineVersionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineVersionID(DB2zSQLParser.RoutineVersionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#versionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionID(DB2zSQLParser.VersionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(DB2zSQLParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#maskName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaskName(DB2zSQLParser.MaskNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#permissionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermissionName(DB2zSQLParser.PermissionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(DB2zSQLParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sequenceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceName(DB2zSQLParser.SequenceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#memberName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberName(DB2zSQLParser.MemberNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(DB2zSQLParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tablespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespaceName(DB2zSQLParser.TablespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#acceleratorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceleratorName(DB2zSQLParser.AcceleratorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#catalogName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogName(DB2zSQLParser.CatalogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(DB2zSQLParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#contextName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextName(DB2zSQLParser.ContextNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#authorizationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorizationName(DB2zSQLParser.AuthorizationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#profileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfileName(DB2zSQLParser.ProfileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(DB2zSQLParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#seclabelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeclabelName(DB2zSQLParser.SeclabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(DB2zSQLParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#addressValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressValue(DB2zSQLParser.AddressValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#jobnameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobnameValue(DB2zSQLParser.JobnameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#servauthValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServauthValue(DB2zSQLParser.ServauthValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#encryptionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptionValue(DB2zSQLParser.EncryptionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#bpName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpName(DB2zSQLParser.BpNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#stogroupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStogroupName(DB2zSQLParser.StogroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcName(DB2zSQLParser.DcNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#mcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMcName(DB2zSQLParser.McNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#scName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScName(DB2zSQLParser.ScNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#volumeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVolumeID(DB2zSQLParser.VolumeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#keyLabelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyLabelName(DB2zSQLParser.KeyLabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(DB2zSQLParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#specificName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificName(DB2zSQLParser.SpecificNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#hostLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostLabel(DB2zSQLParser.HostLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#hostVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostVariable(DB2zSQLParser.HostVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#hostIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostIdentifier(DB2zSQLParser.HostIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#hostStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostStructure(DB2zSQLParser.HostStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nullIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullIndicator(DB2zSQLParser.NullIndicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nullIndicatorStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullIndicatorStructure(DB2zSQLParser.NullIndicatorStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#globalVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariableName(DB2zSQLParser.GlobalVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlParameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlParameterName(DB2zSQLParser.SqlParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlVariableName(DB2zSQLParser.SqlVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#transitionVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionVariableName(DB2zSQLParser.TransitionVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynonym(DB2zSQLParser.SynonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DB2zSQLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(DB2zSQLParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#correlationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelationClause(DB2zSQLParser.CorrelationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DB2zSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(DB2zSQLParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#singleTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableReference(DB2zSQLParser.SingleTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#periodSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodSpecification(DB2zSQLParser.PeriodSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#periodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodClause(DB2zSQLParser.PeriodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#nestedTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedTableExpression(DB2zSQLParser.NestedTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#dataChangeTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataChangeTableReference(DB2zSQLParser.DataChangeTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tableFunctionReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionReference(DB2zSQLParser.TableFunctionReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tableUdfCardinalityClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableUdfCardinalityClause(DB2zSQLParser.TableUdfCardinalityClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#typedCorrelationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedCorrelationClause(DB2zSQLParser.TypedCorrelationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#tableLocatorReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLocatorReference(DB2zSQLParser.TableLocatorReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#xmltableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltableExpression(DB2zSQLParser.XmltableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#collectionDerivedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionDerivedTable(DB2zSQLParser.CollectionDerivedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(DB2zSQLParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fullJoinExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullJoinExpression(DB2zSQLParser.FullJoinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(DB2zSQLParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#ordinaryArrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryArrayExpression(DB2zSQLParser.OrdinaryArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#associativeArrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativeArrayExpression(DB2zSQLParser.AssociativeArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DB2zSQLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DB2zSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(DB2zSQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(DB2zSQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingExpression(DB2zSQLParser.GroupingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupingSets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSets(DB2zSQLParser.GroupingSetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#groupingSetsGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSetsGroup(DB2zSQLParser.GroupingSetsGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#superGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperGroups(DB2zSQLParser.SuperGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#selectColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumns(DB2zSQLParser.SelectColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#unpackedRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedRow(DB2zSQLParser.UnpackedRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(DB2zSQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#subSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSelect(DB2zSQLParser.SubSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoStatement(DB2zSQLParser.SelectIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(DB2zSQLParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#commonTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonTableExpression(DB2zSQLParser.CommonTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#updateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateClause(DB2zSQLParser.UpdateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#readOnlyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadOnlyClause(DB2zSQLParser.ReadOnlyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#optimizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeClause(DB2zSQLParser.OptimizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#isolationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationClause(DB2zSQLParser.IsolationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(DB2zSQLParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#skipLockedDataClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipLockedDataClause(DB2zSQLParser.SkipLockedDataClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#querynoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerynoClause(DB2zSQLParser.QuerynoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#scalarFullSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFullSelect(DB2zSQLParser.ScalarFullSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fullSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullSelect(DB2zSQLParser.FullSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#valuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesClause(DB2zSQLParser.ValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(DB2zSQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sortKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortKey(DB2zSQLParser.SortKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(DB2zSQLParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#fetchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchClause(DB2zSQLParser.FetchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DB2zSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#identifier1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier1(DB2zSQLParser.Identifier1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlidentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlidentifier(DB2zSQLParser.SqlidentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DB2zSQLParser#sqlKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlKeyword(DB2zSQLParser.SqlKeywordContext ctx);
}