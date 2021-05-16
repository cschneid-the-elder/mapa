// Generated from src/SQLParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(SQLParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(SQLParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declareCursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursorStatement(SQLParser.DeclareCursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(SQLParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#statementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementName(SQLParser.StatementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#holdability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoldability(SQLParser.HoldabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#returnability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnability(SQLParser.ReturnabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rowsetPositioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsetPositioning(SQLParser.RowsetPositioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declareTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareTableStatement(SQLParser.DeclareTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#notNullPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNullPhrase(SQLParser.NotNullPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declareStatementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStatementStatement(SQLParser.DeclareStatementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#allocateCursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocateCursorStatement(SQLParser.AllocateCursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rsLocatorVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsLocatorVariable(SQLParser.RsLocatorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseStatement(SQLParser.AlterDatabaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionStatement(SQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexStatement(SQLParser.AlterIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterMaskStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaskStatement(SQLParser.AlterMaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterPermissionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPermissionStatement(SQLParser.AlterPermissionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#searchedDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedDelete(SQLParser.SearchedDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#positionedDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionedDelete(SQLParser.PositionedDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SQLParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(SQLParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeStatement(SQLParser.MergeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#searchedUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedUpdate(SQLParser.SearchedUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#positionedUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionedUpdate(SQLParser.PositionedUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(SQLParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sourceValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceValues(SQLParser.SourceValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesSingleRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesSingleRow(SQLParser.ValuesSingleRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesMultipleRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesMultipleRow(SQLParser.ValuesMultipleRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#matchingCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingCondition(SQLParser.MatchingConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#modificationOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificationOperation(SQLParser.ModificationOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assignmentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentClause(SQLParser.AssignmentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#updateOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateOperation(SQLParser.UpdateOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#deleteOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteOperation(SQLParser.DeleteOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insertOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOperation(SQLParser.InsertOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalStatement(SQLParser.SignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signalInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalInformation(SQLParser.SignalInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesList1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList1(SQLParser.ValuesList1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesList2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList2(SQLParser.ValuesList2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesList3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList3(SQLParser.ValuesList3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesList4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList4(SQLParser.ValuesList4Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#includeColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeColumns(SQLParser.IncludeColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#multipleRowInsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleRowInsert(SQLParser.MultipleRowInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#regenerateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegenerateClause(SQLParser.RegenerateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterIndexOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexOptions(SQLParser.AlterIndexOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterIndexPartitionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexPartitionOptions(SQLParser.AlterIndexPartitionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#usingSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingSpecification(SQLParser.UsingSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#freeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeSpecification(SQLParser.FreeSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#gbpcacheSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGbpcacheSpecification(SQLParser.GbpcacheSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partitionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionElement(SQLParser.PartitionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#applCompatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplCompatValue(SQLParser.ApplCompatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLevel(SQLParser.FunctionLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(SQLParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#optionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionList(SQLParser.OptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#externalProgramName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalProgramName(SQLParser.ExternalProgramNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#packagePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagePath(SQLParser.PackagePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collectionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionID(SQLParser.CollectionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#runTimeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunTimeOptions(SQLParser.RunTimeOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SQLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rowChangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowChangeExpression(SQLParser.RowChangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sequenceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceReference(SQLParser.SequenceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInvocation(SQLParser.FunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#scalarFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionInvocation(SQLParser.ScalarFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregateFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionInvocation(SQLParser.AggregateFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#regressionFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegressionFunctionInvocation(SQLParser.RegressionFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#externalFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalFunctionInvocation(SQLParser.ExternalFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#labeledDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledDuration(SQLParser.LabeledDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlCastSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlCastSpecification(SQLParser.XmlCastSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayElementSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementSpecification(SQLParser.ArrayElementSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(SQLParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(SQLParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#olapSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapSpecification(SQLParser.OlapSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderedOlapSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedOlapSpecification(SQLParser.OrderedOlapSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#olapSpecificationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapSpecificationFunction(SQLParser.OlapSpecificationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lagFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLagFunction(SQLParser.LagFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#leadFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadFunction(SQLParser.LeadFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#respectNullsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespectNullsClause(SQLParser.RespectNullsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#windowPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowPartitionClause(SQLParser.WindowPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#windowOrderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowOrderClause(SQLParser.WindowOrderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#windowOrderClauseQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowOrderClauseQualifier(SQLParser.WindowOrderClauseQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#numberingSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberingSpecification(SQLParser.NumberingSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregationSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationSpecification(SQLParser.AggregationSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunction(SQLParser.AggregateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#regressionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegressionFunction(SQLParser.RegressionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#olapColumnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapColumnFunction(SQLParser.OlapColumnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#firstValueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstValueFunction(SQLParser.FirstValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lastValueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastValueFunction(SQLParser.LastValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#nthValueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNthValueFunction(SQLParser.NthValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ratioToReportFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRatioToReportFunction(SQLParser.RatioToReportFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#windowAggregationGroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowAggregationGroupClause(SQLParser.WindowAggregationGroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupStart(SQLParser.GroupStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBetween(SQLParser.GroupBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupEnd(SQLParser.GroupEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupBound1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBound1(SQLParser.GroupBound1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupBound2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBound2(SQLParser.GroupBound2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unboundedPreceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedPreceding(SQLParser.UnboundedPrecedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unboundedFollowing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedFollowing(SQLParser.UnboundedFollowingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#boundedPreceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedPreceding(SQLParser.BoundedPrecedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#boundedFollowing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedFollowing(SQLParser.BoundedFollowingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#currentRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRow(SQLParser.CurrentRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#scalarFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunction(SQLParser.ScalarFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunction(SQLParser.TableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#specialRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialRegister(SQLParser.SpecialRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmltableFunctionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltableFunctionSpecification(SQLParser.XmltableFunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rowXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowXqueryExpressionConstant(SQLParser.RowXqueryExpressionConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rowXqueryArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowXqueryArgument(SQLParser.RowXqueryArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xqueryContextItemExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryContextItemExpression(SQLParser.XqueryContextItemExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xqueryVariableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqueryVariableExpression(SQLParser.XqueryVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlTableRegularColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableRegularColumnDefinition(SQLParser.XmlTableRegularColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(SQLParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defaultClauseAllowables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClauseAllowables(SQLParser.DefaultClauseAllowablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#distinctTypeCastFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctTypeCastFunctionName(SQLParser.DistinctTypeCastFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnXqueryExpressionConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnXqueryExpressionConstant(SQLParser.ColumnXqueryExpressionConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlTableOrdinalityColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableOrdinalityColumnDefinition(SQLParser.XmlTableOrdinalityColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlnamespacesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespacesDeclaration(SQLParser.XmlnamespacesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlnamespacesFunctionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespacesFunctionSpecification(SQLParser.XmlnamespacesFunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlnamespacesFunctionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespacesFunctionArguments(SQLParser.XmlnamespacesFunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#namespaceUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceUri(SQLParser.NamespaceUriContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#namespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacePrefix(SQLParser.NamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#timeZoneSpecificExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneSpecificExpression(SQLParser.TimeZoneSpecificExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#timeZoneExpressionSubset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneExpressionSubset(SQLParser.TimeZoneExpressionSubsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(SQLParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#resultExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultExpression(SQLParser.ResultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#searchedWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedWhenClause(SQLParser.SearchedWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#simpleWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleWhenClause(SQLParser.SimpleWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#searchCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchCondition(SQLParser.SearchConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#basicPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicPredicate(SQLParser.BasicPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rowValueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowValueExpression(SQLParser.RowValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#quantifiedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedPredicate(SQLParser.QuantifiedPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayExistsPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExistsPredicate(SQLParser.ArrayExistsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#betweenPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(SQLParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#distinctPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctPredicate(SQLParser.DistinctPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#existsPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsPredicate(SQLParser.ExistsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(SQLParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#likePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(SQLParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#nullPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(SQLParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlExistsPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlExistsPredicate(SQLParser.XmlExistsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(SQLParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#castSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastSpecification(SQLParser.CastSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(SQLParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#builtInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInType(SQLParser.BuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#integerInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerInParens(SQLParser.IntegerInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(SQLParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ccsidQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCcsidQualifier(SQLParser.CcsidQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#forDataQualfier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDataQualfier(SQLParser.ForDataQualfierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#distinctTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctTypeName(SQLParser.DistinctTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SQLParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ccsidValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCcsidValue(SQLParser.CcsidValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#newColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewColumnName(SQLParser.NewColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#correlationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelationName(SQLParser.CorrelationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#locationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationName(SQLParser.LocationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(SQLParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(SQLParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#maskName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaskName(SQLParser.MaskNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#permissionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermissionName(SQLParser.PermissionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(SQLParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#catalogName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogName(SQLParser.CatalogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#bpName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpName(SQLParser.BpNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#stogroupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStogroupName(SQLParser.StogroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SQLParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#specificName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificName(SQLParser.SpecificNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#hostVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostVariable(SQLParser.HostVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#hostIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostIdentifier(SQLParser.HostIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#hostStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostStructure(SQLParser.HostStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SQLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(SQLParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#correlationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelationClause(SQLParser.CorrelationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(SQLParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#singleTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableReference(SQLParser.SingleTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#periodSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodSpecification(SQLParser.PeriodSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#periodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodClause(SQLParser.PeriodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#nestedTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedTableExpression(SQLParser.NestedTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dataChangeTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataChangeTableReference(SQLParser.DataChangeTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableFunctionReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionReference(SQLParser.TableFunctionReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableUdfCardinalityClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableUdfCardinalityClause(SQLParser.TableUdfCardinalityClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#typedCorrelationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedCorrelationClause(SQLParser.TypedCorrelationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableLocatorReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLocatorReference(SQLParser.TableLocatorReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmltableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltableExpression(SQLParser.XmltableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collectionDerivedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionDerivedTable(SQLParser.CollectionDerivedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(SQLParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fullJoinExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullJoinExpression(SQLParser.FullJoinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(SQLParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordinaryArrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryArrayExpression(SQLParser.OrdinaryArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#associativeArrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativeArrayExpression(SQLParser.AssociativeArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SQLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingExpression(SQLParser.GroupingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupingSets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSets(SQLParser.GroupingSetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupingSetsGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSetsGroup(SQLParser.GroupingSetsGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#superGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperGroups(SQLParser.SuperGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumns(SQLParser.SelectColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unpackedRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedRow(SQLParser.UnpackedRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#subSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSelect(SQLParser.SubSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoStatement(SQLParser.SelectIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SQLParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#commonTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonTableExpression(SQLParser.CommonTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#updateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateClause(SQLParser.UpdateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#readOnlyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadOnlyClause(SQLParser.ReadOnlyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#optimizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeClause(SQLParser.OptimizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#isolationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationClause(SQLParser.IsolationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(SQLParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#skipLockedDataClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipLockedDataClause(SQLParser.SkipLockedDataClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#querynoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerynoClause(SQLParser.QuerynoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#scalarFullSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFullSelect(SQLParser.ScalarFullSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fullSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullSelect(SQLParser.FullSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesClause(SQLParser.ValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sortKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortKey(SQLParser.SortKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(SQLParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fetchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchClause(SQLParser.FetchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sqlKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlKeyword(SQLParser.SqlKeywordContext ctx);
}