// Generated from src/SQLParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(SQLParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(SQLParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(SQLParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(SQLParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declareCursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursorStatement(SQLParser.DeclareCursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declareCursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursorStatement(SQLParser.DeclareCursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(SQLParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(SQLParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#statementName}.
	 * @param ctx the parse tree
	 */
	void enterStatementName(SQLParser.StatementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#statementName}.
	 * @param ctx the parse tree
	 */
	void exitStatementName(SQLParser.StatementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#holdability}.
	 * @param ctx the parse tree
	 */
	void enterHoldability(SQLParser.HoldabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#holdability}.
	 * @param ctx the parse tree
	 */
	void exitHoldability(SQLParser.HoldabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#returnability}.
	 * @param ctx the parse tree
	 */
	void enterReturnability(SQLParser.ReturnabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#returnability}.
	 * @param ctx the parse tree
	 */
	void exitReturnability(SQLParser.ReturnabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rowsetPositioning}.
	 * @param ctx the parse tree
	 */
	void enterRowsetPositioning(SQLParser.RowsetPositioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rowsetPositioning}.
	 * @param ctx the parse tree
	 */
	void exitRowsetPositioning(SQLParser.RowsetPositioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declareTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareTableStatement(SQLParser.DeclareTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declareTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareTableStatement(SQLParser.DeclareTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#notNullPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNotNullPhrase(SQLParser.NotNullPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#notNullPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNotNullPhrase(SQLParser.NotNullPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declareStatementStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStatementStatement(SQLParser.DeclareStatementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declareStatementStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStatementStatement(SQLParser.DeclareStatementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#allocateCursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterAllocateCursorStatement(SQLParser.AllocateCursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#allocateCursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitAllocateCursorStatement(SQLParser.AllocateCursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rsLocatorVariable}.
	 * @param ctx the parse tree
	 */
	void enterRsLocatorVariable(SQLParser.RsLocatorVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rsLocatorVariable}.
	 * @param ctx the parse tree
	 */
	void exitRsLocatorVariable(SQLParser.RsLocatorVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseStatement(SQLParser.AlterDatabaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseStatement(SQLParser.AlterDatabaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunctionStatement(SQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunctionStatement(SQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexStatement(SQLParser.AlterIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexStatement(SQLParser.AlterIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterMaskStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaskStatement(SQLParser.AlterMaskStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterMaskStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaskStatement(SQLParser.AlterMaskStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterPermissionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterPermissionStatement(SQLParser.AlterPermissionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterPermissionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterPermissionStatement(SQLParser.AlterPermissionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#searchedDelete}.
	 * @param ctx the parse tree
	 */
	void enterSearchedDelete(SQLParser.SearchedDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#searchedDelete}.
	 * @param ctx the parse tree
	 */
	void exitSearchedDelete(SQLParser.SearchedDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#positionedDelete}.
	 * @param ctx the parse tree
	 */
	void enterPositionedDelete(SQLParser.PositionedDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#positionedDelete}.
	 * @param ctx the parse tree
	 */
	void exitPositionedDelete(SQLParser.PositionedDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SQLParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SQLParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(SQLParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(SQLParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void enterMergeStatement(SQLParser.MergeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void exitMergeStatement(SQLParser.MergeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#searchedUpdate}.
	 * @param ctx the parse tree
	 */
	void enterSearchedUpdate(SQLParser.SearchedUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#searchedUpdate}.
	 * @param ctx the parse tree
	 */
	void exitSearchedUpdate(SQLParser.SearchedUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#positionedUpdate}.
	 * @param ctx the parse tree
	 */
	void enterPositionedUpdate(SQLParser.PositionedUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#positionedUpdate}.
	 * @param ctx the parse tree
	 */
	void exitPositionedUpdate(SQLParser.PositionedUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(SQLParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(SQLParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sourceValues}.
	 * @param ctx the parse tree
	 */
	void enterSourceValues(SQLParser.SourceValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sourceValues}.
	 * @param ctx the parse tree
	 */
	void exitSourceValues(SQLParser.SourceValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesSingleRow}.
	 * @param ctx the parse tree
	 */
	void enterValuesSingleRow(SQLParser.ValuesSingleRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesSingleRow}.
	 * @param ctx the parse tree
	 */
	void exitValuesSingleRow(SQLParser.ValuesSingleRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesMultipleRow}.
	 * @param ctx the parse tree
	 */
	void enterValuesMultipleRow(SQLParser.ValuesMultipleRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesMultipleRow}.
	 * @param ctx the parse tree
	 */
	void exitValuesMultipleRow(SQLParser.ValuesMultipleRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#matchingCondition}.
	 * @param ctx the parse tree
	 */
	void enterMatchingCondition(SQLParser.MatchingConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#matchingCondition}.
	 * @param ctx the parse tree
	 */
	void exitMatchingCondition(SQLParser.MatchingConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#modificationOperation}.
	 * @param ctx the parse tree
	 */
	void enterModificationOperation(SQLParser.ModificationOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#modificationOperation}.
	 * @param ctx the parse tree
	 */
	void exitModificationOperation(SQLParser.ModificationOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assignmentClause}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentClause(SQLParser.AssignmentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assignmentClause}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentClause(SQLParser.AssignmentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#updateOperation}.
	 * @param ctx the parse tree
	 */
	void enterUpdateOperation(SQLParser.UpdateOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#updateOperation}.
	 * @param ctx the parse tree
	 */
	void exitUpdateOperation(SQLParser.UpdateOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#deleteOperation}.
	 * @param ctx the parse tree
	 */
	void enterDeleteOperation(SQLParser.DeleteOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#deleteOperation}.
	 * @param ctx the parse tree
	 */
	void exitDeleteOperation(SQLParser.DeleteOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insertOperation}.
	 * @param ctx the parse tree
	 */
	void enterInsertOperation(SQLParser.InsertOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insertOperation}.
	 * @param ctx the parse tree
	 */
	void exitInsertOperation(SQLParser.InsertOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(SQLParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(SQLParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signalInformation}.
	 * @param ctx the parse tree
	 */
	void enterSignalInformation(SQLParser.SignalInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signalInformation}.
	 * @param ctx the parse tree
	 */
	void exitSignalInformation(SQLParser.SignalInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesList1}.
	 * @param ctx the parse tree
	 */
	void enterValuesList1(SQLParser.ValuesList1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesList1}.
	 * @param ctx the parse tree
	 */
	void exitValuesList1(SQLParser.ValuesList1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesList2}.
	 * @param ctx the parse tree
	 */
	void enterValuesList2(SQLParser.ValuesList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesList2}.
	 * @param ctx the parse tree
	 */
	void exitValuesList2(SQLParser.ValuesList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesList3}.
	 * @param ctx the parse tree
	 */
	void enterValuesList3(SQLParser.ValuesList3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesList3}.
	 * @param ctx the parse tree
	 */
	void exitValuesList3(SQLParser.ValuesList3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesList4}.
	 * @param ctx the parse tree
	 */
	void enterValuesList4(SQLParser.ValuesList4Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesList4}.
	 * @param ctx the parse tree
	 */
	void exitValuesList4(SQLParser.ValuesList4Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#includeColumns}.
	 * @param ctx the parse tree
	 */
	void enterIncludeColumns(SQLParser.IncludeColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#includeColumns}.
	 * @param ctx the parse tree
	 */
	void exitIncludeColumns(SQLParser.IncludeColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#multipleRowInsert}.
	 * @param ctx the parse tree
	 */
	void enterMultipleRowInsert(SQLParser.MultipleRowInsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#multipleRowInsert}.
	 * @param ctx the parse tree
	 */
	void exitMultipleRowInsert(SQLParser.MultipleRowInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#regenerateClause}.
	 * @param ctx the parse tree
	 */
	void enterRegenerateClause(SQLParser.RegenerateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#regenerateClause}.
	 * @param ctx the parse tree
	 */
	void exitRegenerateClause(SQLParser.RegenerateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterIndexOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexOptions(SQLParser.AlterIndexOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterIndexOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexOptions(SQLParser.AlterIndexOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterIndexPartitionOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexPartitionOptions(SQLParser.AlterIndexPartitionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterIndexPartitionOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexPartitionOptions(SQLParser.AlterIndexPartitionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#usingSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUsingSpecification(SQLParser.UsingSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#usingSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUsingSpecification(SQLParser.UsingSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#freeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterFreeSpecification(SQLParser.FreeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#freeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitFreeSpecification(SQLParser.FreeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#gbpcacheSpecification}.
	 * @param ctx the parse tree
	 */
	void enterGbpcacheSpecification(SQLParser.GbpcacheSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#gbpcacheSpecification}.
	 * @param ctx the parse tree
	 */
	void exitGbpcacheSpecification(SQLParser.GbpcacheSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partitionElement}.
	 * @param ctx the parse tree
	 */
	void enterPartitionElement(SQLParser.PartitionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partitionElement}.
	 * @param ctx the parse tree
	 */
	void exitPartitionElement(SQLParser.PartitionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#applCompatValue}.
	 * @param ctx the parse tree
	 */
	void enterApplCompatValue(SQLParser.ApplCompatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#applCompatValue}.
	 * @param ctx the parse tree
	 */
	void exitApplCompatValue(SQLParser.ApplCompatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionLevel}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLevel(SQLParser.FunctionLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionLevel}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLevel(SQLParser.FunctionLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(SQLParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(SQLParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#optionList}.
	 * @param ctx the parse tree
	 */
	void enterOptionList(SQLParser.OptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#optionList}.
	 * @param ctx the parse tree
	 */
	void exitOptionList(SQLParser.OptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#externalProgramName}.
	 * @param ctx the parse tree
	 */
	void enterExternalProgramName(SQLParser.ExternalProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#externalProgramName}.
	 * @param ctx the parse tree
	 */
	void exitExternalProgramName(SQLParser.ExternalProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void enterPackagePath(SQLParser.PackagePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void exitPackagePath(SQLParser.PackagePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collectionID}.
	 * @param ctx the parse tree
	 */
	void enterCollectionID(SQLParser.CollectionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collectionID}.
	 * @param ctx the parse tree
	 */
	void exitCollectionID(SQLParser.CollectionIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#runTimeOptions}.
	 * @param ctx the parse tree
	 */
	void enterRunTimeOptions(SQLParser.RunTimeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#runTimeOptions}.
	 * @param ctx the parse tree
	 */
	void exitRunTimeOptions(SQLParser.RunTimeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SQLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SQLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rowChangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowChangeExpression(SQLParser.RowChangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rowChangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowChangeExpression(SQLParser.RowChangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sequenceReference}.
	 * @param ctx the parse tree
	 */
	void enterSequenceReference(SQLParser.SequenceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sequenceReference}.
	 * @param ctx the parse tree
	 */
	void exitSequenceReference(SQLParser.SequenceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(SQLParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(SQLParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#scalarFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionInvocation(SQLParser.ScalarFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#scalarFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionInvocation(SQLParser.ScalarFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggregateFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionInvocation(SQLParser.AggregateFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggregateFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionInvocation(SQLParser.AggregateFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#regressionFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterRegressionFunctionInvocation(SQLParser.RegressionFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#regressionFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitRegressionFunctionInvocation(SQLParser.RegressionFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#externalFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExternalFunctionInvocation(SQLParser.ExternalFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#externalFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExternalFunctionInvocation(SQLParser.ExternalFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#labeledDuration}.
	 * @param ctx the parse tree
	 */
	void enterLabeledDuration(SQLParser.LabeledDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#labeledDuration}.
	 * @param ctx the parse tree
	 */
	void exitLabeledDuration(SQLParser.LabeledDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlCastSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmlCastSpecification(SQLParser.XmlCastSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlCastSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmlCastSpecification(SQLParser.XmlCastSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayElementSpecification}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementSpecification(SQLParser.ArrayElementSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayElementSpecification}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementSpecification(SQLParser.ArrayElementSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(SQLParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(SQLParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(SQLParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(SQLParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#olapSpecification}.
	 * @param ctx the parse tree
	 */
	void enterOlapSpecification(SQLParser.OlapSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#olapSpecification}.
	 * @param ctx the parse tree
	 */
	void exitOlapSpecification(SQLParser.OlapSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderedOlapSpecification}.
	 * @param ctx the parse tree
	 */
	void enterOrderedOlapSpecification(SQLParser.OrderedOlapSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderedOlapSpecification}.
	 * @param ctx the parse tree
	 */
	void exitOrderedOlapSpecification(SQLParser.OrderedOlapSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#olapSpecificationFunction}.
	 * @param ctx the parse tree
	 */
	void enterOlapSpecificationFunction(SQLParser.OlapSpecificationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#olapSpecificationFunction}.
	 * @param ctx the parse tree
	 */
	void exitOlapSpecificationFunction(SQLParser.OlapSpecificationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lagFunction}.
	 * @param ctx the parse tree
	 */
	void enterLagFunction(SQLParser.LagFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lagFunction}.
	 * @param ctx the parse tree
	 */
	void exitLagFunction(SQLParser.LagFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#leadFunction}.
	 * @param ctx the parse tree
	 */
	void enterLeadFunction(SQLParser.LeadFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#leadFunction}.
	 * @param ctx the parse tree
	 */
	void exitLeadFunction(SQLParser.LeadFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#respectNullsClause}.
	 * @param ctx the parse tree
	 */
	void enterRespectNullsClause(SQLParser.RespectNullsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#respectNullsClause}.
	 * @param ctx the parse tree
	 */
	void exitRespectNullsClause(SQLParser.RespectNullsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#windowPartitionClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowPartitionClause(SQLParser.WindowPartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#windowPartitionClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowPartitionClause(SQLParser.WindowPartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#windowOrderClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowOrderClause(SQLParser.WindowOrderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#windowOrderClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowOrderClause(SQLParser.WindowOrderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#windowOrderClauseQualifier}.
	 * @param ctx the parse tree
	 */
	void enterWindowOrderClauseQualifier(SQLParser.WindowOrderClauseQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#windowOrderClauseQualifier}.
	 * @param ctx the parse tree
	 */
	void exitWindowOrderClauseQualifier(SQLParser.WindowOrderClauseQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#numberingSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNumberingSpecification(SQLParser.NumberingSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#numberingSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNumberingSpecification(SQLParser.NumberingSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggregationSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAggregationSpecification(SQLParser.AggregationSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggregationSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAggregationSpecification(SQLParser.AggregationSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(SQLParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(SQLParser.AggregateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#regressionFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegressionFunction(SQLParser.RegressionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#regressionFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegressionFunction(SQLParser.RegressionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#olapColumnFunction}.
	 * @param ctx the parse tree
	 */
	void enterOlapColumnFunction(SQLParser.OlapColumnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#olapColumnFunction}.
	 * @param ctx the parse tree
	 */
	void exitOlapColumnFunction(SQLParser.OlapColumnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#firstValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterFirstValueFunction(SQLParser.FirstValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#firstValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitFirstValueFunction(SQLParser.FirstValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lastValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterLastValueFunction(SQLParser.LastValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lastValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitLastValueFunction(SQLParser.LastValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#nthValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterNthValueFunction(SQLParser.NthValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#nthValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitNthValueFunction(SQLParser.NthValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ratioToReportFunction}.
	 * @param ctx the parse tree
	 */
	void enterRatioToReportFunction(SQLParser.RatioToReportFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ratioToReportFunction}.
	 * @param ctx the parse tree
	 */
	void exitRatioToReportFunction(SQLParser.RatioToReportFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#windowAggregationGroupClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowAggregationGroupClause(SQLParser.WindowAggregationGroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#windowAggregationGroupClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowAggregationGroupClause(SQLParser.WindowAggregationGroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupStart}.
	 * @param ctx the parse tree
	 */
	void enterGroupStart(SQLParser.GroupStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupStart}.
	 * @param ctx the parse tree
	 */
	void exitGroupStart(SQLParser.GroupStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupBetween}.
	 * @param ctx the parse tree
	 */
	void enterGroupBetween(SQLParser.GroupBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupBetween}.
	 * @param ctx the parse tree
	 */
	void exitGroupBetween(SQLParser.GroupBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupEnd}.
	 * @param ctx the parse tree
	 */
	void enterGroupEnd(SQLParser.GroupEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupEnd}.
	 * @param ctx the parse tree
	 */
	void exitGroupEnd(SQLParser.GroupEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupBound1}.
	 * @param ctx the parse tree
	 */
	void enterGroupBound1(SQLParser.GroupBound1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupBound1}.
	 * @param ctx the parse tree
	 */
	void exitGroupBound1(SQLParser.GroupBound1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupBound2}.
	 * @param ctx the parse tree
	 */
	void enterGroupBound2(SQLParser.GroupBound2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupBound2}.
	 * @param ctx the parse tree
	 */
	void exitGroupBound2(SQLParser.GroupBound2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unboundedPreceding}.
	 * @param ctx the parse tree
	 */
	void enterUnboundedPreceding(SQLParser.UnboundedPrecedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unboundedPreceding}.
	 * @param ctx the parse tree
	 */
	void exitUnboundedPreceding(SQLParser.UnboundedPrecedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unboundedFollowing}.
	 * @param ctx the parse tree
	 */
	void enterUnboundedFollowing(SQLParser.UnboundedFollowingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unboundedFollowing}.
	 * @param ctx the parse tree
	 */
	void exitUnboundedFollowing(SQLParser.UnboundedFollowingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#boundedPreceding}.
	 * @param ctx the parse tree
	 */
	void enterBoundedPreceding(SQLParser.BoundedPrecedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#boundedPreceding}.
	 * @param ctx the parse tree
	 */
	void exitBoundedPreceding(SQLParser.BoundedPrecedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#boundedFollowing}.
	 * @param ctx the parse tree
	 */
	void enterBoundedFollowing(SQLParser.BoundedFollowingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#boundedFollowing}.
	 * @param ctx the parse tree
	 */
	void exitBoundedFollowing(SQLParser.BoundedFollowingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#currentRow}.
	 * @param ctx the parse tree
	 */
	void enterCurrentRow(SQLParser.CurrentRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#currentRow}.
	 * @param ctx the parse tree
	 */
	void exitCurrentRow(SQLParser.CurrentRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#scalarFunction}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunction(SQLParser.ScalarFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#scalarFunction}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunction(SQLParser.ScalarFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableFunction}.
	 * @param ctx the parse tree
	 */
	void enterTableFunction(SQLParser.TableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableFunction}.
	 * @param ctx the parse tree
	 */
	void exitTableFunction(SQLParser.TableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#specialRegister}.
	 * @param ctx the parse tree
	 */
	void enterSpecialRegister(SQLParser.SpecialRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#specialRegister}.
	 * @param ctx the parse tree
	 */
	void exitSpecialRegister(SQLParser.SpecialRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmltableFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmltableFunctionSpecification(SQLParser.XmltableFunctionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmltableFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmltableFunctionSpecification(SQLParser.XmltableFunctionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rowXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void enterRowXqueryExpressionConstant(SQLParser.RowXqueryExpressionConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rowXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void exitRowXqueryExpressionConstant(SQLParser.RowXqueryExpressionConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rowXqueryArgument}.
	 * @param ctx the parse tree
	 */
	void enterRowXqueryArgument(SQLParser.RowXqueryArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rowXqueryArgument}.
	 * @param ctx the parse tree
	 */
	void exitRowXqueryArgument(SQLParser.RowXqueryArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xqueryContextItemExpression}.
	 * @param ctx the parse tree
	 */
	void enterXqueryContextItemExpression(SQLParser.XqueryContextItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xqueryContextItemExpression}.
	 * @param ctx the parse tree
	 */
	void exitXqueryContextItemExpression(SQLParser.XqueryContextItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xqueryVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterXqueryVariableExpression(SQLParser.XqueryVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xqueryVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitXqueryVariableExpression(SQLParser.XqueryVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlTableRegularColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableRegularColumnDefinition(SQLParser.XmlTableRegularColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlTableRegularColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableRegularColumnDefinition(SQLParser.XmlTableRegularColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(SQLParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(SQLParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defaultClauseAllowables}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClauseAllowables(SQLParser.DefaultClauseAllowablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defaultClauseAllowables}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClauseAllowables(SQLParser.DefaultClauseAllowablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#distinctTypeCastFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterDistinctTypeCastFunctionName(SQLParser.DistinctTypeCastFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#distinctTypeCastFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitDistinctTypeCastFunctionName(SQLParser.DistinctTypeCastFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void enterColumnXqueryExpressionConstant(SQLParser.ColumnXqueryExpressionConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 */
	void exitColumnXqueryExpressionConstant(SQLParser.ColumnXqueryExpressionConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlTableOrdinalityColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableOrdinalityColumnDefinition(SQLParser.XmlTableOrdinalityColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlTableOrdinalityColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableOrdinalityColumnDefinition(SQLParser.XmlTableOrdinalityColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlnamespacesDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespacesDeclaration(SQLParser.XmlnamespacesDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlnamespacesDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespacesDeclaration(SQLParser.XmlnamespacesDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlnamespacesFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespacesFunctionSpecification(SQLParser.XmlnamespacesFunctionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlnamespacesFunctionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespacesFunctionSpecification(SQLParser.XmlnamespacesFunctionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlnamespacesFunctionArguments}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespacesFunctionArguments(SQLParser.XmlnamespacesFunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlnamespacesFunctionArguments}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespacesFunctionArguments(SQLParser.XmlnamespacesFunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#namespaceUri}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceUri(SQLParser.NamespaceUriContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#namespaceUri}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceUri(SQLParser.NamespaceUriContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterNamespacePrefix(SQLParser.NamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitNamespacePrefix(SQLParser.NamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#timeZoneSpecificExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneSpecificExpression(SQLParser.TimeZoneSpecificExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#timeZoneSpecificExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneSpecificExpression(SQLParser.TimeZoneSpecificExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#timeZoneExpressionSubset}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneExpressionSubset(SQLParser.TimeZoneExpressionSubsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#timeZoneExpressionSubset}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneExpressionSubset(SQLParser.TimeZoneExpressionSubsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SQLParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SQLParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#resultExpression}.
	 * @param ctx the parse tree
	 */
	void enterResultExpression(SQLParser.ResultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#resultExpression}.
	 * @param ctx the parse tree
	 */
	void exitResultExpression(SQLParser.ResultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#searchedWhenClause}.
	 * @param ctx the parse tree
	 */
	void enterSearchedWhenClause(SQLParser.SearchedWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#searchedWhenClause}.
	 * @param ctx the parse tree
	 */
	void exitSearchedWhenClause(SQLParser.SearchedWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#simpleWhenClause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleWhenClause(SQLParser.SimpleWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#simpleWhenClause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleWhenClause(SQLParser.SimpleWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#searchCondition}.
	 * @param ctx the parse tree
	 */
	void enterSearchCondition(SQLParser.SearchConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#searchCondition}.
	 * @param ctx the parse tree
	 */
	void exitSearchCondition(SQLParser.SearchConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#basicPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBasicPredicate(SQLParser.BasicPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#basicPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBasicPredicate(SQLParser.BasicPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rowValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowValueExpression(SQLParser.RowValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rowValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowValueExpression(SQLParser.RowValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#quantifiedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedPredicate(SQLParser.QuantifiedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#quantifiedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedPredicate(SQLParser.QuantifiedPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void enterArrayExistsPredicate(SQLParser.ArrayExistsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void exitArrayExistsPredicate(SQLParser.ArrayExistsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(SQLParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(SQLParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#distinctPredicate}.
	 * @param ctx the parse tree
	 */
	void enterDistinctPredicate(SQLParser.DistinctPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#distinctPredicate}.
	 * @param ctx the parse tree
	 */
	void exitDistinctPredicate(SQLParser.DistinctPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#existsPredicate}.
	 * @param ctx the parse tree
	 */
	void enterExistsPredicate(SQLParser.ExistsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#existsPredicate}.
	 * @param ctx the parse tree
	 */
	void exitExistsPredicate(SQLParser.ExistsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(SQLParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(SQLParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(SQLParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(SQLParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#nullPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(SQLParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#nullPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(SQLParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void enterXmlExistsPredicate(SQLParser.XmlExistsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlExistsPredicate}.
	 * @param ctx the parse tree
	 */
	void exitXmlExistsPredicate(SQLParser.XmlExistsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(SQLParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(SQLParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#castSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCastSpecification(SQLParser.CastSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#castSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCastSpecification(SQLParser.CastSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(SQLParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(SQLParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(SQLParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(SQLParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#integerInParens}.
	 * @param ctx the parse tree
	 */
	void enterIntegerInParens(SQLParser.IntegerInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#integerInParens}.
	 * @param ctx the parse tree
	 */
	void exitIntegerInParens(SQLParser.IntegerInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(SQLParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(SQLParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ccsidQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCcsidQualifier(SQLParser.CcsidQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ccsidQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCcsidQualifier(SQLParser.CcsidQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#forDataQualfier}.
	 * @param ctx the parse tree
	 */
	void enterForDataQualfier(SQLParser.ForDataQualfierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#forDataQualfier}.
	 * @param ctx the parse tree
	 */
	void exitForDataQualfier(SQLParser.ForDataQualfierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#distinctTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDistinctTypeName(SQLParser.DistinctTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#distinctTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDistinctTypeName(SQLParser.DistinctTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SQLParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SQLParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ccsidValue}.
	 * @param ctx the parse tree
	 */
	void enterCcsidValue(SQLParser.CcsidValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ccsidValue}.
	 * @param ctx the parse tree
	 */
	void exitCcsidValue(SQLParser.CcsidValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#newColumnName}.
	 * @param ctx the parse tree
	 */
	void enterNewColumnName(SQLParser.NewColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#newColumnName}.
	 * @param ctx the parse tree
	 */
	void exitNewColumnName(SQLParser.NewColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#correlationName}.
	 * @param ctx the parse tree
	 */
	void enterCorrelationName(SQLParser.CorrelationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#correlationName}.
	 * @param ctx the parse tree
	 */
	void exitCorrelationName(SQLParser.CorrelationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#locationName}.
	 * @param ctx the parse tree
	 */
	void enterLocationName(SQLParser.LocationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#locationName}.
	 * @param ctx the parse tree
	 */
	void exitLocationName(SQLParser.LocationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQLParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQLParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(SQLParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(SQLParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#maskName}.
	 * @param ctx the parse tree
	 */
	void enterMaskName(SQLParser.MaskNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#maskName}.
	 * @param ctx the parse tree
	 */
	void exitMaskName(SQLParser.MaskNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#permissionName}.
	 * @param ctx the parse tree
	 */
	void enterPermissionName(SQLParser.PermissionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#permissionName}.
	 * @param ctx the parse tree
	 */
	void exitPermissionName(SQLParser.PermissionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(SQLParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(SQLParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#catalogName}.
	 * @param ctx the parse tree
	 */
	void enterCatalogName(SQLParser.CatalogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#catalogName}.
	 * @param ctx the parse tree
	 */
	void exitCatalogName(SQLParser.CatalogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#bpName}.
	 * @param ctx the parse tree
	 */
	void enterBpName(SQLParser.BpNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#bpName}.
	 * @param ctx the parse tree
	 */
	void exitBpName(SQLParser.BpNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stogroupName}.
	 * @param ctx the parse tree
	 */
	void enterStogroupName(SQLParser.StogroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stogroupName}.
	 * @param ctx the parse tree
	 */
	void exitStogroupName(SQLParser.StogroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SQLParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SQLParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#specificName}.
	 * @param ctx the parse tree
	 */
	void enterSpecificName(SQLParser.SpecificNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#specificName}.
	 * @param ctx the parse tree
	 */
	void exitSpecificName(SQLParser.SpecificNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#hostVariable}.
	 * @param ctx the parse tree
	 */
	void enterHostVariable(SQLParser.HostVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#hostVariable}.
	 * @param ctx the parse tree
	 */
	void exitHostVariable(SQLParser.HostVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#hostIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterHostIdentifier(SQLParser.HostIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#hostIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitHostIdentifier(SQLParser.HostIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#hostStructure}.
	 * @param ctx the parse tree
	 */
	void enterHostStructure(SQLParser.HostStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#hostStructure}.
	 * @param ctx the parse tree
	 */
	void exitHostStructure(SQLParser.HostStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SQLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(SQLParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(SQLParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#correlationClause}.
	 * @param ctx the parse tree
	 */
	void enterCorrelationClause(SQLParser.CorrelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#correlationClause}.
	 * @param ctx the parse tree
	 */
	void exitCorrelationClause(SQLParser.CorrelationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SQLParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SQLParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#singleTableReference}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableReference(SQLParser.SingleTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#singleTableReference}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableReference(SQLParser.SingleTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#periodSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPeriodSpecification(SQLParser.PeriodSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#periodSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPeriodSpecification(SQLParser.PeriodSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void enterPeriodClause(SQLParser.PeriodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void exitPeriodClause(SQLParser.PeriodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#nestedTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterNestedTableExpression(SQLParser.NestedTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#nestedTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitNestedTableExpression(SQLParser.NestedTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dataChangeTableReference}.
	 * @param ctx the parse tree
	 */
	void enterDataChangeTableReference(SQLParser.DataChangeTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dataChangeTableReference}.
	 * @param ctx the parse tree
	 */
	void exitDataChangeTableReference(SQLParser.DataChangeTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableFunctionReference}.
	 * @param ctx the parse tree
	 */
	void enterTableFunctionReference(SQLParser.TableFunctionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableFunctionReference}.
	 * @param ctx the parse tree
	 */
	void exitTableFunctionReference(SQLParser.TableFunctionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableUdfCardinalityClause}.
	 * @param ctx the parse tree
	 */
	void enterTableUdfCardinalityClause(SQLParser.TableUdfCardinalityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableUdfCardinalityClause}.
	 * @param ctx the parse tree
	 */
	void exitTableUdfCardinalityClause(SQLParser.TableUdfCardinalityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#typedCorrelationClause}.
	 * @param ctx the parse tree
	 */
	void enterTypedCorrelationClause(SQLParser.TypedCorrelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typedCorrelationClause}.
	 * @param ctx the parse tree
	 */
	void exitTypedCorrelationClause(SQLParser.TypedCorrelationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableLocatorReference}.
	 * @param ctx the parse tree
	 */
	void enterTableLocatorReference(SQLParser.TableLocatorReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableLocatorReference}.
	 * @param ctx the parse tree
	 */
	void exitTableLocatorReference(SQLParser.TableLocatorReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmltableExpression}.
	 * @param ctx the parse tree
	 */
	void enterXmltableExpression(SQLParser.XmltableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmltableExpression}.
	 * @param ctx the parse tree
	 */
	void exitXmltableExpression(SQLParser.XmltableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collectionDerivedTable}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDerivedTable(SQLParser.CollectionDerivedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collectionDerivedTable}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDerivedTable(SQLParser.CollectionDerivedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(SQLParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(SQLParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fullJoinExpression}.
	 * @param ctx the parse tree
	 */
	void enterFullJoinExpression(SQLParser.FullJoinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fullJoinExpression}.
	 * @param ctx the parse tree
	 */
	void exitFullJoinExpression(SQLParser.FullJoinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(SQLParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(SQLParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordinaryArrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryArrayExpression(SQLParser.OrdinaryArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordinaryArrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryArrayExpression(SQLParser.OrdinaryArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#associativeArrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeArrayExpression(SQLParser.AssociativeArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#associativeArrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeArrayExpression(SQLParser.AssociativeArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SQLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SQLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupingExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupingExpression(SQLParser.GroupingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupingExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupingExpression(SQLParser.GroupingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupingSets}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSets(SQLParser.GroupingSetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupingSets}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSets(SQLParser.GroupingSetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupingSetsGroup}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSetsGroup(SQLParser.GroupingSetsGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupingSetsGroup}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSetsGroup(SQLParser.GroupingSetsGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#superGroups}.
	 * @param ctx the parse tree
	 */
	void enterSuperGroups(SQLParser.SuperGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#superGroups}.
	 * @param ctx the parse tree
	 */
	void exitSuperGroups(SQLParser.SuperGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectColumns}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumns(SQLParser.SelectColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectColumns}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumns(SQLParser.SelectColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unpackedRow}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedRow(SQLParser.UnpackedRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unpackedRow}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedRow(SQLParser.UnpackedRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#subSelect}.
	 * @param ctx the parse tree
	 */
	void enterSubSelect(SQLParser.SubSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#subSelect}.
	 * @param ctx the parse tree
	 */
	void exitSubSelect(SQLParser.SubSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoStatement(SQLParser.SelectIntoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoStatement(SQLParser.SelectIntoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SQLParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SQLParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#commonTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommonTableExpression(SQLParser.CommonTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#commonTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommonTableExpression(SQLParser.CommonTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#updateClause}.
	 * @param ctx the parse tree
	 */
	void enterUpdateClause(SQLParser.UpdateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#updateClause}.
	 * @param ctx the parse tree
	 */
	void exitUpdateClause(SQLParser.UpdateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#readOnlyClause}.
	 * @param ctx the parse tree
	 */
	void enterReadOnlyClause(SQLParser.ReadOnlyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#readOnlyClause}.
	 * @param ctx the parse tree
	 */
	void exitReadOnlyClause(SQLParser.ReadOnlyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#optimizeClause}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeClause(SQLParser.OptimizeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#optimizeClause}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeClause(SQLParser.OptimizeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#isolationClause}.
	 * @param ctx the parse tree
	 */
	void enterIsolationClause(SQLParser.IsolationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#isolationClause}.
	 * @param ctx the parse tree
	 */
	void exitIsolationClause(SQLParser.IsolationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(SQLParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(SQLParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#skipLockedDataClause}.
	 * @param ctx the parse tree
	 */
	void enterSkipLockedDataClause(SQLParser.SkipLockedDataClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#skipLockedDataClause}.
	 * @param ctx the parse tree
	 */
	void exitSkipLockedDataClause(SQLParser.SkipLockedDataClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#querynoClause}.
	 * @param ctx the parse tree
	 */
	void enterQuerynoClause(SQLParser.QuerynoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#querynoClause}.
	 * @param ctx the parse tree
	 */
	void exitQuerynoClause(SQLParser.QuerynoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#scalarFullSelect}.
	 * @param ctx the parse tree
	 */
	void enterScalarFullSelect(SQLParser.ScalarFullSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#scalarFullSelect}.
	 * @param ctx the parse tree
	 */
	void exitScalarFullSelect(SQLParser.ScalarFullSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fullSelect}.
	 * @param ctx the parse tree
	 */
	void enterFullSelect(SQLParser.FullSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fullSelect}.
	 * @param ctx the parse tree
	 */
	void exitFullSelect(SQLParser.FullSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void enterValuesClause(SQLParser.ValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void exitValuesClause(SQLParser.ValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sortKey}.
	 * @param ctx the parse tree
	 */
	void enterSortKey(SQLParser.SortKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sortKey}.
	 * @param ctx the parse tree
	 */
	void exitSortKey(SQLParser.SortKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(SQLParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(SQLParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void enterFetchClause(SQLParser.FetchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void exitFetchClause(SQLParser.FetchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sqlKeyword}.
	 * @param ctx the parse tree
	 */
	void enterSqlKeyword(SQLParser.SqlKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sqlKeyword}.
	 * @param ctx the parse tree
	 */
	void exitSqlKeyword(SQLParser.SqlKeywordContext ctx);
}