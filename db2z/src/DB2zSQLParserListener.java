// Generated from src/DB2zSQLParser.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link DB2zSQLParser#usingSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUsingSpecification(DB2zSQLParser.UsingSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#usingSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUsingSpecification(DB2zSQLParser.UsingSpecificationContext ctx);
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
	 * Enter a parse tree produced by {@link DB2zSQLParser#forDataQualfier}.
	 * @param ctx the parse tree
	 */
	void enterForDataQualfier(DB2zSQLParser.ForDataQualfierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DB2zSQLParser#forDataQualfier}.
	 * @param ctx the parse tree
	 */
	void exitForDataQualfier(DB2zSQLParser.ForDataQualfierContext ctx);
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