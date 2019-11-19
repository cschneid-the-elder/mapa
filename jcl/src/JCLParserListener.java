// Generated from src/JCLParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JCLParser}.
 */
public interface JCLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JCLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(JCLParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(JCLParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jcl}.
	 * @param ctx the parse tree
	 */
	void enterJcl(JCLParser.JclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jcl}.
	 * @param ctx the parse tree
	 */
	void exitJcl(JCLParser.JclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execJCL}.
	 * @param ctx the parse tree
	 */
	void enterExecJCL(JCLParser.ExecJCLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execJCL}.
	 * @param ctx the parse tree
	 */
	void exitExecJCL(JCLParser.ExecJCLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#procJCL}.
	 * @param ctx the parse tree
	 */
	void enterProcJCL(JCLParser.ProcJCLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#procJCL}.
	 * @param ctx the parse tree
	 */
	void exitProcJCL(JCLParser.ProcJCLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#procStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcStatement(JCLParser.ProcStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#procStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcStatement(JCLParser.ProcStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#defineSymbolicParameter}.
	 * @param ctx the parse tree
	 */
	void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#defineSymbolicParameter}.
	 * @param ctx the parse tree
	 */
	void exitDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#definedSymbolicParameters}.
	 * @param ctx the parse tree
	 */
	void enterDefinedSymbolicParameters(JCLParser.DefinedSymbolicParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#definedSymbolicParameters}.
	 * @param ctx the parse tree
	 */
	void exitDefinedSymbolicParameters(JCLParser.DefinedSymbolicParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(JCLParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(JCLParser.CommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#inlineComment}.
	 * @param ctx the parse tree
	 */
	void enterInlineComment(JCLParser.InlineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#inlineComment}.
	 * @param ctx the parse tree
	 */
	void exitInlineComment(JCLParser.InlineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#stepName}.
	 * @param ctx the parse tree
	 */
	void enterStepName(JCLParser.StepNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#stepName}.
	 * @param ctx the parse tree
	 */
	void exitStepName(JCLParser.StepNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#procName}.
	 * @param ctx the parse tree
	 */
	void enterProcName(JCLParser.ProcNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#procName}.
	 * @param ctx the parse tree
	 */
	void exitProcName(JCLParser.ProcNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jclStep}.
	 * @param ctx the parse tree
	 */
	void enterJclStep(JCLParser.JclStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jclStep}.
	 * @param ctx the parse tree
	 */
	void exitJclStep(JCLParser.JclStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#keywordOrSymbolic}.
	 * @param ctx the parse tree
	 */
	void enterKeywordOrSymbolic(JCLParser.KeywordOrSymbolicContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#keywordOrSymbolic}.
	 * @param ctx the parse tree
	 */
	void exitKeywordOrSymbolic(JCLParser.KeywordOrSymbolicContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#datasetName}.
	 * @param ctx the parse tree
	 */
	void enterDatasetName(JCLParser.DatasetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#datasetName}.
	 * @param ctx the parse tree
	 */
	void exitDatasetName(JCLParser.DatasetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecStatement(JCLParser.ExecStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecStatement(JCLParser.ExecStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execPgmStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecPgmStatement(JCLParser.ExecPgmStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execPgmStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecPgmStatement(JCLParser.ExecPgmStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execProcStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecProcStatement(JCLParser.ExecProcStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execProcStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecProcStatement(JCLParser.ExecProcStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execProcParm}.
	 * @param ctx the parse tree
	 */
	void enterExecProcParm(JCLParser.ExecProcParmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execProcParm}.
	 * @param ctx the parse tree
	 */
	void exitExecProcParm(JCLParser.ExecProcParmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParameter}.
	 * @param ctx the parse tree
	 */
	void enterExecParameter(JCLParser.ExecParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParameter}.
	 * @param ctx the parse tree
	 */
	void exitExecParameter(JCLParser.ExecParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParameterOverrides}.
	 * @param ctx the parse tree
	 */
	void enterExecParameterOverrides(JCLParser.ExecParameterOverridesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParameterOverrides}.
	 * @param ctx the parse tree
	 */
	void exitExecParameterOverrides(JCLParser.ExecParameterOverridesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmACCT}.
	 * @param ctx the parse tree
	 */
	void enterExecParmACCT(JCLParser.ExecParmACCTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmACCT}.
	 * @param ctx the parse tree
	 */
	void exitExecParmACCT(JCLParser.ExecParmACCTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void enterExecParmADDRSPC(JCLParser.ExecParmADDRSPCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void exitExecParmADDRSPC(JCLParser.ExecParmADDRSPCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmCCSID}.
	 * @param ctx the parse tree
	 */
	void enterExecParmCCSID(JCLParser.ExecParmCCSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmCCSID}.
	 * @param ctx the parse tree
	 */
	void exitExecParmCCSID(JCLParser.ExecParmCCSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmCOND}.
	 * @param ctx the parse tree
	 */
	void enterExecParmCOND(JCLParser.ExecParmCONDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmCOND}.
	 * @param ctx the parse tree
	 */
	void exitExecParmCOND(JCLParser.ExecParmCONDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmDYNAMNBR}.
	 * @param ctx the parse tree
	 */
	void enterExecParmDYNAMNBR(JCLParser.ExecParmDYNAMNBRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmDYNAMNBR}.
	 * @param ctx the parse tree
	 */
	void exitExecParmDYNAMNBR(JCLParser.ExecParmDYNAMNBRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void enterExecParmMEMLIMIT(JCLParser.ExecParmMEMLIMITContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void exitExecParmMEMLIMIT(JCLParser.ExecParmMEMLIMITContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmPARM}.
	 * @param ctx the parse tree
	 */
	void enterExecParmPARM(JCLParser.ExecParmPARMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmPARM}.
	 * @param ctx the parse tree
	 */
	void exitExecParmPARM(JCLParser.ExecParmPARMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmPARMDD}.
	 * @param ctx the parse tree
	 */
	void enterExecParmPARMDD(JCLParser.ExecParmPARMDDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmPARMDD}.
	 * @param ctx the parse tree
	 */
	void exitExecParmPARMDD(JCLParser.ExecParmPARMDDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void enterExecParmPERFORM(JCLParser.ExecParmPERFORMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void exitExecParmPERFORM(JCLParser.ExecParmPERFORMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmRD}.
	 * @param ctx the parse tree
	 */
	void enterExecParmRD(JCLParser.ExecParmRDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmRD}.
	 * @param ctx the parse tree
	 */
	void exitExecParmRD(JCLParser.ExecParmRDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmREGION}.
	 * @param ctx the parse tree
	 */
	void enterExecParmREGION(JCLParser.ExecParmREGIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmREGION}.
	 * @param ctx the parse tree
	 */
	void exitExecParmREGION(JCLParser.ExecParmREGIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void enterExecParmREGIONX(JCLParser.ExecParmREGIONXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void exitExecParmREGIONX(JCLParser.ExecParmREGIONXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmRLSTMOUT}.
	 * @param ctx the parse tree
	 */
	void enterExecParmRLSTMOUT(JCLParser.ExecParmRLSTMOUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmRLSTMOUT}.
	 * @param ctx the parse tree
	 */
	void exitExecParmRLSTMOUT(JCLParser.ExecParmRLSTMOUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmTIME}.
	 * @param ctx the parse tree
	 */
	void enterExecParmTIME(JCLParser.ExecParmTIMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmTIME}.
	 * @param ctx the parse tree
	 */
	void exitExecParmTIME(JCLParser.ExecParmTIMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmTVSMSG}.
	 * @param ctx the parse tree
	 */
	void enterExecParmTVSMSG(JCLParser.ExecParmTVSMSGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmTVSMSG}.
	 * @param ctx the parse tree
	 */
	void exitExecParmTVSMSG(JCLParser.ExecParmTVSMSGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmTVSAMCOM}.
	 * @param ctx the parse tree
	 */
	void enterExecParmTVSAMCOM(JCLParser.ExecParmTVSAMCOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmTVSAMCOM}.
	 * @param ctx the parse tree
	 */
	void exitExecParmTVSAMCOM(JCLParser.ExecParmTVSAMCOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdStatement(JCLParser.DdStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdStatement(JCLParser.DdStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddStatementConcatenation}.
	 * @param ctx the parse tree
	 */
	void enterDdStatementConcatenation(JCLParser.DdStatementConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddStatementConcatenation}.
	 * @param ctx the parse tree
	 */
	void exitDdStatementConcatenation(JCLParser.DdStatementConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddStatementAmalgamation}.
	 * @param ctx the parse tree
	 */
	void enterDdStatementAmalgamation(JCLParser.DdStatementAmalgamationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddStatementAmalgamation}.
	 * @param ctx the parse tree
	 */
	void exitDdStatementAmalgamation(JCLParser.DdStatementAmalgamationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddName}.
	 * @param ctx the parse tree
	 */
	void enterDdName(JCLParser.DdNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddName}.
	 * @param ctx the parse tree
	 */
	void exitDdName(JCLParser.DdNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParameter}.
	 * @param ctx the parse tree
	 */
	void enterDdParameter(JCLParser.DdParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParameter}.
	 * @param ctx the parse tree
	 */
	void exitDdParameter(JCLParser.DdParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmACCODE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmACCODE(JCLParser.DdParmACCODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmACCODE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmACCODE(JCLParser.DdParmACCODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP(JCLParser.DdParmAMPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP(JCLParser.DdParmAMPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmASTERISK}.
	 * @param ctx the parse tree
	 */
	void enterDdParmASTERISK(JCLParser.DdParmASTERISKContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmASTERISK}.
	 * @param ctx the parse tree
	 */
	void exitDdParmASTERISK(JCLParser.DdParmASTERISKContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmASTERISK_DATA}.
	 * @param ctx the parse tree
	 */
	void enterDdParmASTERISK_DATA(JCLParser.DdParmASTERISK_DATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmASTERISK_DATA}.
	 * @param ctx the parse tree
	 */
	void exitDdParmASTERISK_DATA(JCLParser.DdParmASTERISK_DATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAVGREC}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAVGREC(JCLParser.DdParmAVGRECContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAVGREC}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAVGREC(JCLParser.DdParmAVGRECContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBFALN}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBFALN(JCLParser.DdParmBFALNContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBFALN}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBFALN(JCLParser.DdParmBFALNContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBFTEK}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBFTEK(JCLParser.DdParmBFTEKContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBFTEK}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBFTEK(JCLParser.DdParmBFTEKContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBLKSIZE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBLKSIZE(JCLParser.DdParmBLKSIZEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBLKSIZE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBLKSIZE(JCLParser.DdParmBLKSIZEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBLKSZLIM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBLKSZLIM(JCLParser.DdParmBLKSZLIMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBLKSZLIM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBLKSZLIM(JCLParser.DdParmBLKSZLIMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBUFIN}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBUFIN(JCLParser.DdParmBUFINContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBUFIN}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBUFIN(JCLParser.DdParmBUFINContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBUFL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBUFL(JCLParser.DdParmBUFLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBUFL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBUFL(JCLParser.DdParmBUFLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBUFMAX}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBUFMAX(JCLParser.DdParmBUFMAXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBUFMAX}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBUFMAX(JCLParser.DdParmBUFMAXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBUFNO}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBUFNO(JCLParser.DdParmBUFNOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBUFNO}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBUFNO(JCLParser.DdParmBUFNOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBUFOFF}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBUFOFF(JCLParser.DdParmBUFOFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBUFOFF}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBUFOFF(JCLParser.DdParmBUFOFFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBUFOUT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBUFOUT(JCLParser.DdParmBUFOUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBUFOUT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBUFOUT(JCLParser.DdParmBUFOUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBUFSIZE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBUFSIZE(JCLParser.DdParmBUFSIZEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBUFSIZE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBUFSIZE(JCLParser.DdParmBUFSIZEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBURST}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBURST(JCLParser.DdParmBURSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBURST}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBURST(JCLParser.DdParmBURSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCCSID}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCCSID(JCLParser.DdParmCCSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCCSID}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCCSID(JCLParser.DdParmCCSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCHARS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCHARS(JCLParser.DdParmCHARSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCHARS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCHARS(JCLParser.DdParmCHARSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCHKPT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCHKPT(JCLParser.DdParmCHKPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCHKPT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCHKPT(JCLParser.DdParmCHKPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCNTL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCNTL(JCLParser.DdParmCNTLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCNTL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCNTL(JCLParser.DdParmCNTLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCOPIES}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCOPIES(JCLParser.DdParmCOPIESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCOPIES}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCOPIES(JCLParser.DdParmCOPIESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCPRI}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCPRI(JCLParser.DdParmCPRIContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCPRI}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCPRI(JCLParser.DdParmCPRIContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCYLOFL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCYLOFL(JCLParser.DdParmCYLOFLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCYLOFL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCYLOFL(JCLParser.DdParmCYLOFLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDATA}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDATA(JCLParser.DdParmDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDATA}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDATA(JCLParser.DdParmDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDATACLAS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDATACLAS(JCLParser.DdParmDATACLASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDATACLAS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDATACLAS(JCLParser.DdParmDATACLASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDCB}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDCB(JCLParser.DdParmDCBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDCB}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDCB(JCLParser.DdParmDCBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDCB_Parameter}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDCB_Parameter(JCLParser.DdParmDCB_ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDCB_Parameter}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDCB_Parameter(JCLParser.DdParmDCB_ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDDNAME}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDDNAME(JCLParser.DdParmDDNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDDNAME}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDDNAME(JCLParser.DdParmDDNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDEN}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDEN(JCLParser.DdParmDENContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDEN}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDEN(JCLParser.DdParmDENContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDEST}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDEST(JCLParser.DdParmDESTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDEST}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDEST(JCLParser.DdParmDESTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDIAGNS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDIAGNS(JCLParser.DdParmDIAGNSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDIAGNS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDIAGNS(JCLParser.DdParmDIAGNSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDISP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDISP(JCLParser.DdParmDISPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDISP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDISP(JCLParser.DdParmDISPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDISP_STATUS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDISP_STATUS(JCLParser.DdParmDISP_STATUSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDISP_STATUS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDISP_STATUS(JCLParser.DdParmDISP_STATUSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDISP_NORMAL_TERM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDISP_NORMAL_TERM(JCLParser.DdParmDISP_NORMAL_TERMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDISP_NORMAL_TERM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDISP_NORMAL_TERM(JCLParser.DdParmDISP_NORMAL_TERMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDISP_ABNORMAL_TERM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDISP_ABNORMAL_TERM(JCLParser.DdParmDISP_ABNORMAL_TERMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDISP_ABNORMAL_TERM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDISP_ABNORMAL_TERM(JCLParser.DdParmDISP_ABNORMAL_TERMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDLM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDLM(JCLParser.DdParmDLMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDLM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDLM(JCLParser.DdParmDLMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSID}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSID(JCLParser.DdParmDSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSID}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSID(JCLParser.DdParmDSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSKEYLBL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSKEYLBL(JCLParser.DdParmDSKEYLBLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSKEYLBL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSKEYLBL(JCLParser.DdParmDSKEYLBLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSNAME}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSNAME(JCLParser.DdParmDSNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSNAME}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSNAME(JCLParser.DdParmDSNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSNTYPE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSNTYPE(JCLParser.DdParmDSNTYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSNTYPE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSNTYPE(JCLParser.DdParmDSNTYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSORG}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSORG(JCLParser.DdParmDSORGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSORG}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSORG(JCLParser.DdParmDSORGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDUMMY}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDUMMY(JCLParser.DdParmDUMMYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDUMMY}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDUMMY(JCLParser.DdParmDUMMYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDYNAM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDYNAM(JCLParser.DdParmDYNAMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDYNAM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDYNAM(JCLParser.DdParmDYNAMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmEATTR}.
	 * @param ctx the parse tree
	 */
	void enterDdParmEATTR(JCLParser.DdParmEATTRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmEATTR}.
	 * @param ctx the parse tree
	 */
	void exitDdParmEATTR(JCLParser.DdParmEATTRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmEROPT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmEROPT(JCLParser.DdParmEROPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmEROPT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmEROPT(JCLParser.DdParmEROPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmEXPDT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmEXPDT(JCLParser.DdParmEXPDTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmEXPDT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmEXPDT(JCLParser.DdParmEXPDTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFCB}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFCB(JCLParser.DdParmFCBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFCB}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFCB(JCLParser.DdParmFCBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFILEDATA}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFILEDATA(JCLParser.DdParmFILEDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFILEDATA}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFILEDATA(JCLParser.DdParmFILEDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFLASH}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFLASH(JCLParser.DdParmFLASHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFLASH}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFLASH(JCLParser.DdParmFLASHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFREE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFREE(JCLParser.DdParmFREEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFREE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFREE(JCLParser.DdParmFREEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFREEVOL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFREEVOL(JCLParser.DdParmFREEVOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFREEVOL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFREEVOL(JCLParser.DdParmFREEVOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFUNC}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFUNC(JCLParser.DdParmFUNCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFUNC}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFUNC(JCLParser.DdParmFUNCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmGDGORDER}.
	 * @param ctx the parse tree
	 */
	void enterDdParmGDGORDER(JCLParser.DdParmGDGORDERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmGDGORDER}.
	 * @param ctx the parse tree
	 */
	void exitDdParmGDGORDER(JCLParser.DdParmGDGORDERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmGNCP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmGNCP(JCLParser.DdParmGNCPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmGNCP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmGNCP(JCLParser.DdParmGNCPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmHOLD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmHOLD(JCLParser.DdParmHOLDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmHOLD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmHOLD(JCLParser.DdParmHOLDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmINTVL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmINTVL(JCLParser.DdParmINTVLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmINTVL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmINTVL(JCLParser.DdParmINTVLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmIPLTXID}.
	 * @param ctx the parse tree
	 */
	void enterDdParmIPLTXID(JCLParser.DdParmIPLTXIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmIPLTXID}.
	 * @param ctx the parse tree
	 */
	void exitDdParmIPLTXID(JCLParser.DdParmIPLTXIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYLABL1}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYLABL1(JCLParser.DdParmKEYLABL1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYLABL1}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYLABL1(JCLParser.DdParmKEYLABL1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYLABL2}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYLABL2(JCLParser.DdParmKEYLABL2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYLABL2}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYLABL2(JCLParser.DdParmKEYLABL2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYENCD1}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYENCD1(JCLParser.DdParmKEYENCD1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYENCD1}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYENCD1(JCLParser.DdParmKEYENCD1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYENCD2}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYENCD2(JCLParser.DdParmKEYENCD2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYENCD2}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYENCD2(JCLParser.DdParmKEYENCD2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYLEN}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYLEN(JCLParser.DdParmKEYLENContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYLEN}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYLEN(JCLParser.DdParmKEYLENContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYOFF}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYOFF(JCLParser.DdParmKEYOFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYOFF}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYOFF(JCLParser.DdParmKEYOFFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLABEL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLABEL(JCLParser.DdParmLABELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLABEL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLABEL(JCLParser.DdParmLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLGSTREAM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLGSTREAM(JCLParser.DdParmLGSTREAMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLGSTREAM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLGSTREAM(JCLParser.DdParmLGSTREAMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLIKE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLIKE(JCLParser.DdParmLIKEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLIKE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLIKE(JCLParser.DdParmLIKEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLIMCT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLIMCT(JCLParser.DdParmLIMCTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLIMCT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLIMCT(JCLParser.DdParmLIMCTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLRECL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLRECL(JCLParser.DdParmLRECLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLRECL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLRECL(JCLParser.DdParmLRECLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmMAXGENS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmMAXGENS(JCLParser.DdParmMAXGENSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmMAXGENS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmMAXGENS(JCLParser.DdParmMAXGENSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmMGMTCLAS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmMGMTCLAS(JCLParser.DdParmMGMTCLASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmMGMTCLAS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmMGMTCLAS(JCLParser.DdParmMGMTCLASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmMODE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmMODE(JCLParser.DdParmMODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmMODE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmMODE(JCLParser.DdParmMODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmMODIFY}.
	 * @param ctx the parse tree
	 */
	void enterDdParmMODIFY(JCLParser.DdParmMODIFYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmMODIFY}.
	 * @param ctx the parse tree
	 */
	void exitDdParmMODIFY(JCLParser.DdParmMODIFYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmNCP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmNCP(JCLParser.DdParmNCPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmNCP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmNCP(JCLParser.DdParmNCPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmNTM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmNTM(JCLParser.DdParmNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmNTM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmNTM(JCLParser.DdParmNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmOPTCD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmOPTCD(JCLParser.DdParmOPTCDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmOPTCD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmOPTCD(JCLParser.DdParmOPTCDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmOUTLIM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmOUTLIM(JCLParser.DdParmOUTLIMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmOUTLIM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmOUTLIM(JCLParser.DdParmOUTLIMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmOUTPUT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmOUTPUT(JCLParser.DdParmOUTPUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmOUTPUT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmOUTPUT(JCLParser.DdParmOUTPUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATH}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATH(JCLParser.DdParmPATHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATH}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATH(JCLParser.DdParmPATHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATHDISP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATHDISP(JCLParser.DdParmPATHDISPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATHDISP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATHDISP(JCLParser.DdParmPATHDISPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATHMODE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATHMODE(JCLParser.DdParmPATHMODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATHMODE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATHMODE(JCLParser.DdParmPATHMODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATHOPTS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATHOPTS(JCLParser.DdParmPATHOPTSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATHOPTS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATHOPTS(JCLParser.DdParmPATHOPTSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPCI}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPCI(JCLParser.DdParmPCIContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPCI}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPCI(JCLParser.DdParmPCIContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPROTECT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPROTECT(JCLParser.DdParmPROTECTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPROTECT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPROTECT(JCLParser.DdParmPROTECTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPRTSP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPRTSP(JCLParser.DdParmPRTSPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPRTSP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPRTSP(JCLParser.DdParmPRTSPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRECFM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRECFM(JCLParser.DdParmRECFMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRECFM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRECFM(JCLParser.DdParmRECFMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRECORG}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRECORG(JCLParser.DdParmRECORGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRECORG}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRECORG(JCLParser.DdParmRECORGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmREFDD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmREFDD(JCLParser.DdParmREFDDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmREFDD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmREFDD(JCLParser.DdParmREFDDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRESERVE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRESERVE(JCLParser.DdParmRESERVEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRESERVE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRESERVE(JCLParser.DdParmRESERVEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRETPD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRETPD(JCLParser.DdParmRETPDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRETPD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRETPD(JCLParser.DdParmRETPDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRKP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRKP(JCLParser.DdParmRKPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRKP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRKP(JCLParser.DdParmRKPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRLS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRLS(JCLParser.DdParmRLSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRLS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRLS(JCLParser.DdParmRLSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmROACCESS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmROACCESS(JCLParser.DdParmROACCESSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmROACCESS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmROACCESS(JCLParser.DdParmROACCESSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSECMODEL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSECMODEL(JCLParser.DdParmSECMODELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSECMODEL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSECMODEL(JCLParser.DdParmSECMODELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSEGMENT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSEGMENT(JCLParser.DdParmSEGMENTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSEGMENT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSEGMENT(JCLParser.DdParmSEGMENTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE(JCLParser.DdParmSPACEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE(JCLParser.DdParmSPACEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_unit}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_unit(JCLParser.DdParmSPACE_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_unit}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_unit(JCLParser.DdParmSPACE_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_primary}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_primary(JCLParser.DdParmSPACE_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_primary}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_primary(JCLParser.DdParmSPACE_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_secondary}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_secondary(JCLParser.DdParmSPACE_secondaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_secondary}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_secondary(JCLParser.DdParmSPACE_secondaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_directory}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_directory(JCLParser.DdParmSPACE_directoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_directory}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_directory(JCLParser.DdParmSPACE_directoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_track_address}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_track_address(JCLParser.DdParmSPACE_track_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_track_address}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_track_address(JCLParser.DdParmSPACE_track_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_rlse}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_rlse(JCLParser.DdParmSPACE_rlseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_rlse}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_rlse(JCLParser.DdParmSPACE_rlseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_characteristics}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_characteristics(JCLParser.DdParmSPACE_characteristicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_characteristics}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_characteristics(JCLParser.DdParmSPACE_characteristicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE_round}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE_round(JCLParser.DdParmSPACE_roundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE_round}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE_round(JCLParser.DdParmSPACE_roundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPIN}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPIN(JCLParser.DdParmSPINContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPIN}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPIN(JCLParser.DdParmSPINContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSTACK}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSTACK(JCLParser.DdParmSTACKContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSTACK}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSTACK(JCLParser.DdParmSTACKContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSTORCLAS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSTORCLAS(JCLParser.DdParmSTORCLASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSTORCLAS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSTORCLAS(JCLParser.DdParmSTORCLASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSUBSYS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSUBSYS(JCLParser.DdParmSUBSYSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSUBSYS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSUBSYS(JCLParser.DdParmSUBSYSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSYMBOLS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSYMBOLS(JCLParser.DdParmSYMBOLSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSYMBOLS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSYMBOLS(JCLParser.DdParmSYMBOLSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSYMLIST}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSYMLIST(JCLParser.DdParmSYMLISTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSYMLIST}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSYMLIST(JCLParser.DdParmSYMLISTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSYSOUT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSYSOUT(JCLParser.DdParmSYSOUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSYSOUT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSYSOUT(JCLParser.DdParmSYSOUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#sysoutClass}.
	 * @param ctx the parse tree
	 */
	void enterSysoutClass(JCLParser.SysoutClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#sysoutClass}.
	 * @param ctx the parse tree
	 */
	void exitSysoutClass(JCLParser.SysoutClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#sysoutWriter}.
	 * @param ctx the parse tree
	 */
	void enterSysoutWriter(JCLParser.SysoutWriterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#sysoutWriter}.
	 * @param ctx the parse tree
	 */
	void exitSysoutWriter(JCLParser.SysoutWriterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#sysoutFormOrCase}.
	 * @param ctx the parse tree
	 */
	void enterSysoutFormOrCase(JCLParser.SysoutFormOrCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#sysoutFormOrCase}.
	 * @param ctx the parse tree
	 */
	void exitSysoutFormOrCase(JCLParser.SysoutFormOrCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmTERM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmTERM(JCLParser.DdParmTERMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmTERM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmTERM(JCLParser.DdParmTERMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmTHRESH}.
	 * @param ctx the parse tree
	 */
	void enterDdParmTHRESH(JCLParser.DdParmTHRESHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmTHRESH}.
	 * @param ctx the parse tree
	 */
	void exitDdParmTHRESH(JCLParser.DdParmTHRESHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmTRTCH}.
	 * @param ctx the parse tree
	 */
	void enterDdParmTRTCH(JCLParser.DdParmTRTCHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmTRTCH}.
	 * @param ctx the parse tree
	 */
	void exitDdParmTRTCH(JCLParser.DdParmTRTCHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUCS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUCS(JCLParser.DdParmUCSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUCS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUCS(JCLParser.DdParmUCSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUCS_code}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUCS_code(JCLParser.DdParmUCS_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUCS_code}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUCS_code(JCLParser.DdParmUCS_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUCS_fold}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUCS_fold(JCLParser.DdParmUCS_foldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUCS_fold}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUCS_fold(JCLParser.DdParmUCS_foldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUCS_verify}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUCS_verify(JCLParser.DdParmUCS_verifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUCS_verify}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUCS_verify(JCLParser.DdParmUCS_verifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUNIT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUNIT(JCLParser.DdParmUNITContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUNIT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUNIT(JCLParser.DdParmUNITContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUNIT_unit}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUNIT_unit(JCLParser.DdParmUNIT_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUNIT_unit}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUNIT_unit(JCLParser.DdParmUNIT_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUNIT_count}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUNIT_count(JCLParser.DdParmUNIT_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUNIT_count}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUNIT_count(JCLParser.DdParmUNIT_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUNIT_defer}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUNIT_defer(JCLParser.DdParmUNIT_deferContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUNIT_defer}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUNIT_defer(JCLParser.DdParmUNIT_deferContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUNIT_smshonor}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUNIT_smshonor(JCLParser.DdParmUNIT_smshonorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUNIT_smshonor}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUNIT_smshonor(JCLParser.DdParmUNIT_smshonorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME(JCLParser.DdParmVOLUMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME(JCLParser.DdParmVOLUMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVolSer}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVolSer(JCLParser.DdParmVolSerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVolSer}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVolSer(JCLParser.DdParmVolSerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME_SER}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME_SER(JCLParser.DdParmVOLUME_SERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME_SER}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME_SER(JCLParser.DdParmVOLUME_SERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME_REF}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME_REF(JCLParser.DdParmVOLUME_REFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME_REF}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME_REF(JCLParser.DdParmVOLUME_REFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME_private}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME_private(JCLParser.DdParmVOLUME_privateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME_private}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME_private(JCLParser.DdParmVOLUME_privateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME_retain}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME_retain(JCLParser.DdParmVOLUME_retainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME_retain}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME_retain(JCLParser.DdParmVOLUME_retainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME_seq_nb}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME_seq_nb(JCLParser.DdParmVOLUME_seq_nbContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME_seq_nb}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME_seq_nb(JCLParser.DdParmVOLUME_seq_nbContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME_count}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME_count(JCLParser.DdParmVOLUME_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME_count}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME_count(JCLParser.DdParmVOLUME_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#joblibStatement}.
	 * @param ctx the parse tree
	 */
	void enterJoblibStatement(JCLParser.JoblibStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#joblibStatement}.
	 * @param ctx the parse tree
	 */
	void exitJoblibStatement(JCLParser.JoblibStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#joblibConcatenation}.
	 * @param ctx the parse tree
	 */
	void enterJoblibConcatenation(JCLParser.JoblibConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#joblibConcatenation}.
	 * @param ctx the parse tree
	 */
	void exitJoblibConcatenation(JCLParser.JoblibConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#joblibAmalgamation}.
	 * @param ctx the parse tree
	 */
	void enterJoblibAmalgamation(JCLParser.JoblibAmalgamationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#joblibAmalgamation}.
	 * @param ctx the parse tree
	 */
	void exitJoblibAmalgamation(JCLParser.JoblibAmalgamationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#joblibParameter}.
	 * @param ctx the parse tree
	 */
	void enterJoblibParameter(JCLParser.JoblibParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#joblibParameter}.
	 * @param ctx the parse tree
	 */
	void exitJoblibParameter(JCLParser.JoblibParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#syschkStatement}.
	 * @param ctx the parse tree
	 */
	void enterSyschkStatement(JCLParser.SyschkStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#syschkStatement}.
	 * @param ctx the parse tree
	 */
	void exitSyschkStatement(JCLParser.SyschkStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#syschkConcatenation}.
	 * @param ctx the parse tree
	 */
	void enterSyschkConcatenation(JCLParser.SyschkConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#syschkConcatenation}.
	 * @param ctx the parse tree
	 */
	void exitSyschkConcatenation(JCLParser.SyschkConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#syschkAmalgamation}.
	 * @param ctx the parse tree
	 */
	void enterSyschkAmalgamation(JCLParser.SyschkAmalgamationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#syschkAmalgamation}.
	 * @param ctx the parse tree
	 */
	void exitSyschkAmalgamation(JCLParser.SyschkAmalgamationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#syschkParameter}.
	 * @param ctx the parse tree
	 */
	void enterSyschkParameter(JCLParser.SyschkParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#syschkParameter}.
	 * @param ctx the parse tree
	 */
	void exitSyschkParameter(JCLParser.SyschkParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobCard}.
	 * @param ctx the parse tree
	 */
	void enterJobCard(JCLParser.JobCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobCard}.
	 * @param ctx the parse tree
	 */
	void exitJobCard(JCLParser.JobCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobName}.
	 * @param ctx the parse tree
	 */
	void enterJobName(JCLParser.JobNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobName}.
	 * @param ctx the parse tree
	 */
	void exitJobName(JCLParser.JobNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobAccountingInformation}.
	 * @param ctx the parse tree
	 */
	void enterJobAccountingInformation(JCLParser.JobAccountingInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobAccountingInformation}.
	 * @param ctx the parse tree
	 */
	void exitJobAccountingInformation(JCLParser.JobAccountingInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobProgrammerName}.
	 * @param ctx the parse tree
	 */
	void enterJobProgrammerName(JCLParser.JobProgrammerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobProgrammerName}.
	 * @param ctx the parse tree
	 */
	void exitJobProgrammerName(JCLParser.JobProgrammerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobKeywordParameter}.
	 * @param ctx the parse tree
	 */
	void enterJobKeywordParameter(JCLParser.JobKeywordParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobKeywordParameter}.
	 * @param ctx the parse tree
	 */
	void exitJobKeywordParameter(JCLParser.JobKeywordParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmBYTES}.
	 * @param ctx the parse tree
	 */
	void enterJobParmBYTES(JCLParser.JobParmBYTESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmBYTES}.
	 * @param ctx the parse tree
	 */
	void exitJobParmBYTES(JCLParser.JobParmBYTESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCARDS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCARDS(JCLParser.JobParmCARDSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCARDS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCARDS(JCLParser.JobParmCARDSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmLINES}.
	 * @param ctx the parse tree
	 */
	void enterJobParmLINES(JCLParser.JobParmLINESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmLINES}.
	 * @param ctx the parse tree
	 */
	void exitJobParmLINES(JCLParser.JobParmLINESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPAGES}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPAGES(JCLParser.JobParmPAGESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPAGES}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPAGES(JCLParser.JobParmPAGESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void enterJobParmADDRSPC(JCLParser.JobParmADDRSPCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void exitJobParmADDRSPC(JCLParser.JobParmADDRSPCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCCSID}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCCSID(JCLParser.JobParmCCSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCCSID}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCCSID(JCLParser.JobParmCCSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCLASS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCLASS(JCLParser.JobParmCLASSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCLASS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCLASS(JCLParser.JobParmCLASSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCOND}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCOND(JCLParser.JobParmCONDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCOND}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCOND(JCLParser.JobParmCONDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmDSENQSHR}.
	 * @param ctx the parse tree
	 */
	void enterJobParmDSENQSHR(JCLParser.JobParmDSENQSHRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmDSENQSHR}.
	 * @param ctx the parse tree
	 */
	void exitJobParmDSENQSHR(JCLParser.JobParmDSENQSHRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmEMAIL}.
	 * @param ctx the parse tree
	 */
	void enterJobParmEMAIL(JCLParser.JobParmEMAILContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmEMAIL}.
	 * @param ctx the parse tree
	 */
	void exitJobParmEMAIL(JCLParser.JobParmEMAILContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmGDGBIAS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmGDGBIAS(JCLParser.JobParmGDGBIASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmGDGBIAS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmGDGBIAS(JCLParser.JobParmGDGBIASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmGROUP}.
	 * @param ctx the parse tree
	 */
	void enterJobParmGROUP(JCLParser.JobParmGROUPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmGROUP}.
	 * @param ctx the parse tree
	 */
	void exitJobParmGROUP(JCLParser.JobParmGROUPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmJESLOG}.
	 * @param ctx the parse tree
	 */
	void enterJobParmJESLOG(JCLParser.JobParmJESLOGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmJESLOG}.
	 * @param ctx the parse tree
	 */
	void exitJobParmJESLOG(JCLParser.JobParmJESLOGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmJOBRC}.
	 * @param ctx the parse tree
	 */
	void enterJobParmJOBRC(JCLParser.JobParmJOBRCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmJOBRC}.
	 * @param ctx the parse tree
	 */
	void exitJobParmJOBRC(JCLParser.JobParmJOBRCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void enterJobParmMEMLIMIT(JCLParser.JobParmMEMLIMITContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void exitJobParmMEMLIMIT(JCLParser.JobParmMEMLIMITContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmMSGCLASS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmMSGCLASS(JCLParser.JobParmMSGCLASSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmMSGCLASS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmMSGCLASS(JCLParser.JobParmMSGCLASSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmMSGLEVEL}.
	 * @param ctx the parse tree
	 */
	void enterJobParmMSGLEVEL(JCLParser.JobParmMSGLEVELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmMSGLEVEL}.
	 * @param ctx the parse tree
	 */
	void exitJobParmMSGLEVEL(JCLParser.JobParmMSGLEVELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmNOTIFY}.
	 * @param ctx the parse tree
	 */
	void enterJobParmNOTIFY(JCLParser.JobParmNOTIFYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmNOTIFY}.
	 * @param ctx the parse tree
	 */
	void exitJobParmNOTIFY(JCLParser.JobParmNOTIFYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#nameOrSymbolic}.
	 * @param ctx the parse tree
	 */
	void enterNameOrSymbolic(JCLParser.NameOrSymbolicContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#nameOrSymbolic}.
	 * @param ctx the parse tree
	 */
	void exitNameOrSymbolic(JCLParser.NameOrSymbolicContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPASSWORD}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPASSWORD(JCLParser.JobParmPASSWORDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPASSWORD}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPASSWORD(JCLParser.JobParmPASSWORDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPERFORM(JCLParser.JobParmPERFORMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPERFORM(JCLParser.JobParmPERFORMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPRTY}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPRTY(JCLParser.JobParmPRTYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPRTY}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPRTY(JCLParser.JobParmPRTYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmRD}.
	 * @param ctx the parse tree
	 */
	void enterJobParmRD(JCLParser.JobParmRDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmRD}.
	 * @param ctx the parse tree
	 */
	void exitJobParmRD(JCLParser.JobParmRDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmREGION}.
	 * @param ctx the parse tree
	 */
	void enterJobParmREGION(JCLParser.JobParmREGIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmREGION}.
	 * @param ctx the parse tree
	 */
	void exitJobParmREGION(JCLParser.JobParmREGIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void enterJobParmREGIONX(JCLParser.JobParmREGIONXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void exitJobParmREGIONX(JCLParser.JobParmREGIONXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmRESTART}.
	 * @param ctx the parse tree
	 */
	void enterJobParmRESTART(JCLParser.JobParmRESTARTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmRESTART}.
	 * @param ctx the parse tree
	 */
	void exitJobParmRESTART(JCLParser.JobParmRESTARTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSECLABEL}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSECLABEL(JCLParser.JobParmSECLABELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSECLABEL}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSECLABEL(JCLParser.JobParmSECLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSCHENV}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSCHENV(JCLParser.JobParmSCHENVContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSCHENV}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSCHENV(JCLParser.JobParmSCHENVContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSYSAFF}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSYSAFF(JCLParser.JobParmSYSAFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSYSAFF}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSYSAFF(JCLParser.JobParmSYSAFFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSYSTEM}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSYSTEM(JCLParser.JobParmSYSTEMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSYSTEM}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSYSTEM(JCLParser.JobParmSYSTEMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmTIME}.
	 * @param ctx the parse tree
	 */
	void enterJobParmTIME(JCLParser.JobParmTIMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmTIME}.
	 * @param ctx the parse tree
	 */
	void exitJobParmTIME(JCLParser.JobParmTIMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmTYPRUN}.
	 * @param ctx the parse tree
	 */
	void enterJobParmTYPRUN(JCLParser.JobParmTYPRUNContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmTYPRUN}.
	 * @param ctx the parse tree
	 */
	void exitJobParmTYPRUN(JCLParser.JobParmTYPRUNContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmUJOBCORR}.
	 * @param ctx the parse tree
	 */
	void enterJobParmUJOBCORR(JCLParser.JobParmUJOBCORRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmUJOBCORR}.
	 * @param ctx the parse tree
	 */
	void exitJobParmUJOBCORR(JCLParser.JobParmUJOBCORRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmUSER}.
	 * @param ctx the parse tree
	 */
	void enterJobParmUSER(JCLParser.JobParmUSERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmUSER}.
	 * @param ctx the parse tree
	 */
	void exitJobParmUSER(JCLParser.JobParmUSERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommandStatement(JCLParser.CommandStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommandStatement(JCLParser.CommandStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jclCommandStatement}.
	 * @param ctx the parse tree
	 */
	void enterJclCommandStatement(JCLParser.JclCommandStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jclCommandStatement}.
	 * @param ctx the parse tree
	 */
	void exitJclCommandStatement(JCLParser.JclCommandStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#cntlStatement}.
	 * @param ctx the parse tree
	 */
	void enterCntlStatement(JCLParser.CntlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#cntlStatement}.
	 * @param ctx the parse tree
	 */
	void exitCntlStatement(JCLParser.CntlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#endcntlStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndcntlStatement(JCLParser.EndcntlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#endcntlStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndcntlStatement(JCLParser.EndcntlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#cntlStatementAmalgamation}.
	 * @param ctx the parse tree
	 */
	void enterCntlStatementAmalgamation(JCLParser.CntlStatementAmalgamationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#cntlStatementAmalgamation}.
	 * @param ctx the parse tree
	 */
	void exitCntlStatementAmalgamation(JCLParser.CntlStatementAmalgamationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(JCLParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(JCLParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JCLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JCLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ifRelOp}.
	 * @param ctx the parse tree
	 */
	void enterIfRelOp(JCLParser.IfRelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ifRelOp}.
	 * @param ctx the parse tree
	 */
	void exitIfRelOp(JCLParser.IfRelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ifKeyword}.
	 * @param ctx the parse tree
	 */
	void enterIfKeyword(JCLParser.IfKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ifKeyword}.
	 * @param ctx the parse tree
	 */
	void exitIfKeyword(JCLParser.IfKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ifTest}.
	 * @param ctx the parse tree
	 */
	void enterIfTest(JCLParser.IfTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ifTest}.
	 * @param ctx the parse tree
	 */
	void exitIfTest(JCLParser.IfTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(JCLParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(JCLParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#endifStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndifStatement(JCLParser.EndifStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#endifStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndifStatement(JCLParser.EndifStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(JCLParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(JCLParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jcllibStatement}.
	 * @param ctx the parse tree
	 */
	void enterJcllibStatement(JCLParser.JcllibStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jcllibStatement}.
	 * @param ctx the parse tree
	 */
	void exitJcllibStatement(JCLParser.JcllibStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#notifyStatement}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStatement(JCLParser.NotifyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#notifyStatement}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStatement(JCLParser.NotifyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#notifyParms}.
	 * @param ctx the parse tree
	 */
	void enterNotifyParms(JCLParser.NotifyParmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#notifyParms}.
	 * @param ctx the parse tree
	 */
	void exitNotifyParms(JCLParser.NotifyParmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#notifyEMAIL}.
	 * @param ctx the parse tree
	 */
	void enterNotifyEMAIL(JCLParser.NotifyEMAILContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#notifyEMAIL}.
	 * @param ctx the parse tree
	 */
	void exitNotifyEMAIL(JCLParser.NotifyEMAILContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#notifyUSER}.
	 * @param ctx the parse tree
	 */
	void enterNotifyUSER(JCLParser.NotifyUSERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#notifyUSER}.
	 * @param ctx the parse tree
	 */
	void exitNotifyUSER(JCLParser.NotifyUSERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#notifyTYPE}.
	 * @param ctx the parse tree
	 */
	void enterNotifyTYPE(JCLParser.NotifyTYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#notifyTYPE}.
	 * @param ctx the parse tree
	 */
	void exitNotifyTYPE(JCLParser.NotifyTYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#notifyWHEN}.
	 * @param ctx the parse tree
	 */
	void enterNotifyWHEN(JCLParser.NotifyWHENContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#notifyWHEN}.
	 * @param ctx the parse tree
	 */
	void exitNotifyWHEN(JCLParser.NotifyWHENContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(JCLParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(JCLParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementParameter}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementParameter(JCLParser.OutputStatementParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementParameter}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementParameter(JCLParser.OutputStatementParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementADDRESS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementADDRESS(JCLParser.OutputStatementADDRESSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementADDRESS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementADDRESS(JCLParser.OutputStatementADDRESSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementAFPPARMS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementAFPPARMS(JCLParser.OutputStatementAFPPARMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementAFPPARMS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementAFPPARMS(JCLParser.OutputStatementAFPPARMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementAFPSTATS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementAFPSTATS(JCLParser.OutputStatementAFPSTATSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementAFPSTATS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementAFPSTATS(JCLParser.OutputStatementAFPSTATSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementBUILDING}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementBUILDING(JCLParser.OutputStatementBUILDINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementBUILDING}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementBUILDING(JCLParser.OutputStatementBUILDINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementBURST}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementBURST(JCLParser.OutputStatementBURSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementBURST}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementBURST(JCLParser.OutputStatementBURSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCHARS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCHARS(JCLParser.OutputStatementCHARSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCHARS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCHARS(JCLParser.OutputStatementCHARSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCKPTLINE}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCKPTLINE(JCLParser.OutputStatementCKPTLINEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCKPTLINE}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCKPTLINE(JCLParser.OutputStatementCKPTLINEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCKPTPAGE}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCKPTPAGE(JCLParser.OutputStatementCKPTPAGEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCKPTPAGE}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCKPTPAGE(JCLParser.OutputStatementCKPTPAGEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCKPTSEC}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCKPTSEC(JCLParser.OutputStatementCKPTSECContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCKPTSEC}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCKPTSEC(JCLParser.OutputStatementCKPTSECContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCLASS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCLASS(JCLParser.OutputStatementCLASSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCLASS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCLASS(JCLParser.OutputStatementCLASSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCOLORMAP}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCOLORMAP(JCLParser.OutputStatementCOLORMAPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCOLORMAP}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCOLORMAP(JCLParser.OutputStatementCOLORMAPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCOMPACT}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCOMPACT(JCLParser.OutputStatementCOMPACTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCOMPACT}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCOMPACT(JCLParser.OutputStatementCOMPACTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCOMSETUP}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCOMSETUP(JCLParser.OutputStatementCOMSETUPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCOMSETUP}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCOMSETUP(JCLParser.OutputStatementCOMSETUPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCONTROL}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCONTROL(JCLParser.OutputStatementCONTROLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCONTROL}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCONTROL(JCLParser.OutputStatementCONTROLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCOPIES}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCOPIES(JCLParser.OutputStatementCOPIESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCOPIES}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCOPIES(JCLParser.OutputStatementCOPIESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#copiesPayload}.
	 * @param ctx the parse tree
	 */
	void enterCopiesPayload(JCLParser.CopiesPayloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#copiesPayload}.
	 * @param ctx the parse tree
	 */
	void exitCopiesPayload(JCLParser.CopiesPayloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#copiesValueOrSymbolic}.
	 * @param ctx the parse tree
	 */
	void enterCopiesValueOrSymbolic(JCLParser.CopiesValueOrSymbolicContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#copiesValueOrSymbolic}.
	 * @param ctx the parse tree
	 */
	void exitCopiesValueOrSymbolic(JCLParser.CopiesValueOrSymbolicContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementCOPYCNT}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementCOPYCNT(JCLParser.OutputStatementCOPYCNTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementCOPYCNT}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementCOPYCNT(JCLParser.OutputStatementCOPYCNTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementDATACK}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementDATACK(JCLParser.OutputStatementDATACKContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementDATACK}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementDATACK(JCLParser.OutputStatementDATACKContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementDDNAME}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementDDNAME(JCLParser.OutputStatementDDNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementDDNAME}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementDDNAME(JCLParser.OutputStatementDDNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementDEFAULT}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementDEFAULT(JCLParser.OutputStatementDEFAULTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementDEFAULT}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementDEFAULT(JCLParser.OutputStatementDEFAULTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementDEPT}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementDEPT(JCLParser.OutputStatementDEPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementDEPT}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementDEPT(JCLParser.OutputStatementDEPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementDEST}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementDEST(JCLParser.OutputStatementDESTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementDEST}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementDEST(JCLParser.OutputStatementDESTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#destValue}.
	 * @param ctx the parse tree
	 */
	void enterDestValue(JCLParser.DestValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#destValue}.
	 * @param ctx the parse tree
	 */
	void exitDestValue(JCLParser.DestValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementDPAGELBL}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementDPAGELBL(JCLParser.OutputStatementDPAGELBLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementDPAGELBL}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementDPAGELBL(JCLParser.OutputStatementDPAGELBLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementDUPLEX}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementDUPLEX(JCLParser.OutputStatementDUPLEXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementDUPLEX}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementDUPLEX(JCLParser.OutputStatementDUPLEXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementFCB}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementFCB(JCLParser.OutputStatementFCBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementFCB}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementFCB(JCLParser.OutputStatementFCBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementFLASH}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementFLASH(JCLParser.OutputStatementFLASHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementFLASH}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementFLASH(JCLParser.OutputStatementFLASHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementFORMDEF}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementFORMDEF(JCLParser.OutputStatementFORMDEFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementFORMDEF}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementFORMDEF(JCLParser.OutputStatementFORMDEFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementFORMLEN}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementFORMLEN(JCLParser.OutputStatementFORMLENContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementFORMLEN}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementFORMLEN(JCLParser.OutputStatementFORMLENContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementFORMS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementFORMS(JCLParser.OutputStatementFORMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementFORMS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementFORMS(JCLParser.OutputStatementFORMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementFSSDATA}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementFSSDATA(JCLParser.OutputStatementFSSDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementFSSDATA}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementFSSDATA(JCLParser.OutputStatementFSSDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementGROUPID}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementGROUPID(JCLParser.OutputStatementGROUPIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementGROUPID}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementGROUPID(JCLParser.OutputStatementGROUPIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementINDEX}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementINDEX(JCLParser.OutputStatementINDEXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementINDEX}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementINDEX(JCLParser.OutputStatementINDEXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementINTRAY}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementINTRAY(JCLParser.OutputStatementINTRAYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementINTRAY}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementINTRAY(JCLParser.OutputStatementINTRAYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementJESDS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementJESDS(JCLParser.OutputStatementJESDSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementJESDS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementJESDS(JCLParser.OutputStatementJESDSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementLINDEX}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementLINDEX(JCLParser.OutputStatementLINDEXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementLINDEX}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementLINDEX(JCLParser.OutputStatementLINDEXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementLINECT}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementLINECT(JCLParser.OutputStatementLINECTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementLINECT}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementLINECT(JCLParser.OutputStatementLINECTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementMAILBCC}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementMAILBCC(JCLParser.OutputStatementMAILBCCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementMAILBCC}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementMAILBCC(JCLParser.OutputStatementMAILBCCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementMAILCC}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementMAILCC(JCLParser.OutputStatementMAILCCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementMAILCC}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementMAILCC(JCLParser.OutputStatementMAILCCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementMAILFILE}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementMAILFILE(JCLParser.OutputStatementMAILFILEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementMAILFILE}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementMAILFILE(JCLParser.OutputStatementMAILFILEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementMAILFROM}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementMAILFROM(JCLParser.OutputStatementMAILFROMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementMAILFROM}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementMAILFROM(JCLParser.OutputStatementMAILFROMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementMAILTO}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementMAILTO(JCLParser.OutputStatementMAILTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementMAILTO}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementMAILTO(JCLParser.OutputStatementMAILTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementMERGE}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementMERGE(JCLParser.OutputStatementMERGEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementMERGE}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementMERGE(JCLParser.OutputStatementMERGEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementMODIFY}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementMODIFY(JCLParser.OutputStatementMODIFYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementMODIFY}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementMODIFY(JCLParser.OutputStatementMODIFYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementNAME}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementNAME(JCLParser.OutputStatementNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementNAME}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementNAME(JCLParser.OutputStatementNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementNOTIFY}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementNOTIFY(JCLParser.OutputStatementNOTIFYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementNOTIFY}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementNOTIFY(JCLParser.OutputStatementNOTIFYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOFFSETXB}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOFFSETXB(JCLParser.OutputStatementOFFSETXBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOFFSETXB}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOFFSETXB(JCLParser.OutputStatementOFFSETXBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOFFSETXF}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOFFSETXF(JCLParser.OutputStatementOFFSETXFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOFFSETXF}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOFFSETXF(JCLParser.OutputStatementOFFSETXFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOFFSETYB}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOFFSETYB(JCLParser.OutputStatementOFFSETYBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOFFSETYB}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOFFSETYB(JCLParser.OutputStatementOFFSETYBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOFFSETYF}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOFFSETYF(JCLParser.OutputStatementOFFSETYFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOFFSETYF}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOFFSETYF(JCLParser.OutputStatementOFFSETYFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOUTBIN}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOUTBIN(JCLParser.OutputStatementOUTBINContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOUTBIN}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOUTBIN(JCLParser.OutputStatementOUTBINContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOUTDISP}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOUTDISP(JCLParser.OutputStatementOUTDISPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOUTDISP}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOUTDISP(JCLParser.OutputStatementOUTDISPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOVERLAYB}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOVERLAYB(JCLParser.OutputStatementOVERLAYBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOVERLAYB}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOVERLAYB(JCLParser.OutputStatementOVERLAYBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOVERLAYF}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOVERLAYF(JCLParser.OutputStatementOVERLAYFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOVERLAYF}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOVERLAYF(JCLParser.OutputStatementOVERLAYFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementOVFL}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementOVFL(JCLParser.OutputStatementOVFLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementOVFL}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementOVFL(JCLParser.OutputStatementOVFLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPAGEDEF}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPAGEDEF(JCLParser.OutputStatementPAGEDEFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPAGEDEF}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPAGEDEF(JCLParser.OutputStatementPAGEDEFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPIMSG}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPIMSG(JCLParser.OutputStatementPIMSGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPIMSG}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPIMSG(JCLParser.OutputStatementPIMSGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPORTNO}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPORTNO(JCLParser.OutputStatementPORTNOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPORTNO}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPORTNO(JCLParser.OutputStatementPORTNOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPRMODE}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPRMODE(JCLParser.OutputStatementPRMODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPRMODE}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPRMODE(JCLParser.OutputStatementPRMODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPRTATTRS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPRTATTRS(JCLParser.OutputStatementPRTATTRSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPRTATTRS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPRTATTRS(JCLParser.OutputStatementPRTATTRSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPRTERROR}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPRTERROR(JCLParser.OutputStatementPRTERRORContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPRTERROR}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPRTERROR(JCLParser.OutputStatementPRTERRORContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPRTOPTNS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPRTOPTNS(JCLParser.OutputStatementPRTOPTNSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPRTOPTNS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPRTOPTNS(JCLParser.OutputStatementPRTOPTNSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPRTQUEUE}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPRTQUEUE(JCLParser.OutputStatementPRTQUEUEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPRTQUEUE}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPRTQUEUE(JCLParser.OutputStatementPRTQUEUEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementPRTY}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementPRTY(JCLParser.OutputStatementPRTYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementPRTY}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementPRTY(JCLParser.OutputStatementPRTYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementREPLYTO}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementREPLYTO(JCLParser.OutputStatementREPLYTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementREPLYTO}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementREPLYTO(JCLParser.OutputStatementREPLYTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementRESFMT}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementRESFMT(JCLParser.OutputStatementRESFMTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementRESFMT}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementRESFMT(JCLParser.OutputStatementRESFMTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementRETAINS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementRETAINS(JCLParser.OutputStatementRETAINSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementRETAINS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementRETAINS(JCLParser.OutputStatementRETAINSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementRETAINF}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementRETAINF(JCLParser.OutputStatementRETAINFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementRETAINF}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementRETAINF(JCLParser.OutputStatementRETAINFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementRETRYL}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementRETRYL(JCLParser.OutputStatementRETRYLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementRETRYL}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementRETRYL(JCLParser.OutputStatementRETRYLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementRETRYT}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementRETRYT(JCLParser.OutputStatementRETRYTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementRETRYT}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementRETRYT(JCLParser.OutputStatementRETRYTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementROOM}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementROOM(JCLParser.OutputStatementROOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementROOM}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementROOM(JCLParser.OutputStatementROOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementSYSAREA}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementSYSAREA(JCLParser.OutputStatementSYSAREAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementSYSAREA}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementSYSAREA(JCLParser.OutputStatementSYSAREAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementTHRESHLD}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementTHRESHLD(JCLParser.OutputStatementTHRESHLDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementTHRESHLD}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementTHRESHLD(JCLParser.OutputStatementTHRESHLDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementTITLE}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementTITLE(JCLParser.OutputStatementTITLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementTITLE}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementTITLE(JCLParser.OutputStatementTITLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementTRC}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementTRC(JCLParser.OutputStatementTRCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementTRC}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementTRC(JCLParser.OutputStatementTRCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementUCS}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementUCS(JCLParser.OutputStatementUCSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementUCS}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementUCS(JCLParser.OutputStatementUCSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementUSERDATA}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementUSERDATA(JCLParser.OutputStatementUSERDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementUSERDATA}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementUSERDATA(JCLParser.OutputStatementUSERDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementUSERLIB}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementUSERLIB(JCLParser.OutputStatementUSERLIBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementUSERLIB}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementUSERLIB(JCLParser.OutputStatementUSERLIBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementUSERPATH}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementUSERPATH(JCLParser.OutputStatementUSERPATHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementUSERPATH}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementUSERPATH(JCLParser.OutputStatementUSERPATHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#outputStatementWRITER}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementWRITER(JCLParser.OutputStatementWRITERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#outputStatementWRITER}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementWRITER(JCLParser.OutputStatementWRITERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#pendStatement}.
	 * @param ctx the parse tree
	 */
	void enterPendStatement(JCLParser.PendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#pendStatement}.
	 * @param ctx the parse tree
	 */
	void exitPendStatement(JCLParser.PendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleStatement}.
	 * @param ctx the parse tree
	 */
	void enterScheduleStatement(JCLParser.ScheduleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleStatement}.
	 * @param ctx the parse tree
	 */
	void exitScheduleStatement(JCLParser.ScheduleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParameters}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParameters(JCLParser.ScheduleParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParameters}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParameters(JCLParser.ScheduleParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParmAFTER}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParmAFTER(JCLParser.ScheduleParmAFTERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParmAFTER}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParmAFTER(JCLParser.ScheduleParmAFTERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParmBEFORE}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParmBEFORE(JCLParser.ScheduleParmBEFOREContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParmBEFORE}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParmBEFORE(JCLParser.ScheduleParmBEFOREContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParmDELAY}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParmDELAY(JCLParser.ScheduleParmDELAYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParmDELAY}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParmDELAY(JCLParser.ScheduleParmDELAYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParmHOLDUNTIL}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParmHOLDUNTIL(JCLParser.ScheduleParmHOLDUNTILContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParmHOLDUNTIL}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParmHOLDUNTIL(JCLParser.ScheduleParmHOLDUNTILContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParmJOBGROUP}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParmJOBGROUP(JCLParser.ScheduleParmJOBGROUPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParmJOBGROUP}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParmJOBGROUP(JCLParser.ScheduleParmJOBGROUPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParmSTARTBY}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParmSTARTBY(JCLParser.ScheduleParmSTARTBYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParmSTARTBY}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParmSTARTBY(JCLParser.ScheduleParmSTARTBYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#scheduleParmWITH}.
	 * @param ctx the parse tree
	 */
	void enterScheduleParmWITH(JCLParser.ScheduleParmWITHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#scheduleParmWITH}.
	 * @param ctx the parse tree
	 */
	void exitScheduleParmWITH(JCLParser.ScheduleParmWITHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(JCLParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(JCLParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#setOperation}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(JCLParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#setOperation}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(JCLParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#xmitStatement}.
	 * @param ctx the parse tree
	 */
	void enterXmitStatement(JCLParser.XmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#xmitStatement}.
	 * @param ctx the parse tree
	 */
	void exitXmitStatement(JCLParser.XmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#xmitParameters}.
	 * @param ctx the parse tree
	 */
	void enterXmitParameters(JCLParser.XmitParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#xmitParameters}.
	 * @param ctx the parse tree
	 */
	void exitXmitParameters(JCLParser.XmitParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#xmitParmDEST}.
	 * @param ctx the parse tree
	 */
	void enterXmitParmDEST(JCLParser.XmitParmDESTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#xmitParmDEST}.
	 * @param ctx the parse tree
	 */
	void exitXmitParmDEST(JCLParser.XmitParmDESTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#xmitParmDLM}.
	 * @param ctx the parse tree
	 */
	void enterXmitParmDLM(JCLParser.XmitParmDLMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#xmitParmDLM}.
	 * @param ctx the parse tree
	 */
	void exitXmitParmDLM(JCLParser.XmitParmDLMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#xmitParmSUBCHARS}.
	 * @param ctx the parse tree
	 */
	void enterXmitParmSUBCHARS(JCLParser.XmitParmSUBCHARSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#xmitParmSUBCHARS}.
	 * @param ctx the parse tree
	 */
	void exitXmitParmSUBCHARS(JCLParser.XmitParmSUBCHARSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jesExecutionControlStatements}.
	 * @param ctx the parse tree
	 */
	void enterJesExecutionControlStatements(JCLParser.JesExecutionControlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jesExecutionControlStatements}.
	 * @param ctx the parse tree
	 */
	void exitJesExecutionControlStatements(JCLParser.JesExecutionControlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupStatement(JCLParser.JobGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupStatement(JCLParser.JobGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupAccountingString}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupAccountingString(JCLParser.JobGroupAccountingStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupAccountingString}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupAccountingString(JCLParser.JobGroupAccountingStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupAccountingInformation}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupAccountingInformation(JCLParser.JobGroupAccountingInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupAccountingInformation}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupAccountingInformation(JCLParser.JobGroupAccountingInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupAccountingInformationSimple}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupAccountingInformationSimple(JCLParser.JobGroupAccountingInformationSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupAccountingInformationSimple}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupAccountingInformationSimple(JCLParser.JobGroupAccountingInformationSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupAccountingInformationMultiLine}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupAccountingInformationMultiLine(JCLParser.JobGroupAccountingInformationMultiLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupAccountingInformationMultiLine}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupAccountingInformationMultiLine(JCLParser.JobGroupAccountingInformationMultiLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupProgrammerName}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupProgrammerName(JCLParser.JobGroupProgrammerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupProgrammerName}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupProgrammerName(JCLParser.JobGroupProgrammerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupParameters}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupParameters(JCLParser.JobGroupParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupParameters}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupParameters(JCLParser.JobGroupParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupEMAIL}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupEMAIL(JCLParser.JobGroupEMAILContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupEMAIL}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupEMAIL(JCLParser.JobGroupEMAILContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupOWNER}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupOWNER(JCLParser.JobGroupOWNERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupOWNER}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupOWNER(JCLParser.JobGroupOWNERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupGROUP}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupGROUP(JCLParser.JobGroupGROUPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupGROUP}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupGROUP(JCLParser.JobGroupGROUPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupPASSWORD}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupPASSWORD(JCLParser.JobGroupPASSWORDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupPASSWORD}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupPASSWORD(JCLParser.JobGroupPASSWORDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupSECLABEL}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupSECLABEL(JCLParser.JobGroupSECLABELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupSECLABEL}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupSECLABEL(JCLParser.JobGroupSECLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupTYPE}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupTYPE(JCLParser.JobGroupTYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupTYPE}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupTYPE(JCLParser.JobGroupTYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupHOLD}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupHOLD(JCLParser.JobGroupHOLDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupHOLD}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupHOLD(JCLParser.JobGroupHOLDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupERROR}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupERROR(JCLParser.JobGroupERRORContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupERROR}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupERROR(JCLParser.JobGroupERRORContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupCondition}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupCondition(JCLParser.JobGroupConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupCondition}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupCondition(JCLParser.JobGroupConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupERROR_RelOp}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupERROR_RelOp(JCLParser.JobGroupERROR_RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupERROR_RelOp}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupERROR_RelOp(JCLParser.JobGroupERROR_RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupERROR_Keyword}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupERROR_Keyword(JCLParser.JobGroupERROR_KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupERROR_Keyword}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupERROR_Keyword(JCLParser.JobGroupERROR_KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupERROR_Test}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupERROR_Test(JCLParser.JobGroupERROR_TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupERROR_Test}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupERROR_Test(JCLParser.JobGroupERROR_TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupONERROR}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupONERROR(JCLParser.JobGroupONERRORContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupONERROR}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupONERROR(JCLParser.JobGroupONERRORContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupSYSAFF}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupSYSAFF(JCLParser.JobGroupSYSAFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupSYSAFF}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupSYSAFF(JCLParser.JobGroupSYSAFFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupSYSTEM}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupSYSTEM(JCLParser.JobGroupSYSTEMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupSYSTEM}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupSYSTEM(JCLParser.JobGroupSYSTEMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobGroupSCHENV}.
	 * @param ctx the parse tree
	 */
	void enterJobGroupSCHENV(JCLParser.JobGroupSCHENVContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobGroupSCHENV}.
	 * @param ctx the parse tree
	 */
	void exitJobGroupSCHENV(JCLParser.JobGroupSCHENVContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#gJobStatement}.
	 * @param ctx the parse tree
	 */
	void enterGJobStatement(JCLParser.GJobStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#gJobStatement}.
	 * @param ctx the parse tree
	 */
	void exitGJobStatement(JCLParser.GJobStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#gJobParameters}.
	 * @param ctx the parse tree
	 */
	void enterGJobParameters(JCLParser.GJobParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#gJobParameters}.
	 * @param ctx the parse tree
	 */
	void exitGJobParameters(JCLParser.GJobParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#gJobFLUSHTYP}.
	 * @param ctx the parse tree
	 */
	void enterGJobFLUSHTYP(JCLParser.GJobFLUSHTYPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#gJobFLUSHTYP}.
	 * @param ctx the parse tree
	 */
	void exitGJobFLUSHTYP(JCLParser.GJobFLUSHTYPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobSetStatement}.
	 * @param ctx the parse tree
	 */
	void enterJobSetStatement(JCLParser.JobSetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobSetStatement}.
	 * @param ctx the parse tree
	 */
	void exitJobSetStatement(JCLParser.JobSetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobSetParameters}.
	 * @param ctx the parse tree
	 */
	void enterJobSetParameters(JCLParser.JobSetParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobSetParameters}.
	 * @param ctx the parse tree
	 */
	void exitJobSetParameters(JCLParser.JobSetParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobSetFLUSHTYP}.
	 * @param ctx the parse tree
	 */
	void enterJobSetFLUSHTYP(JCLParser.JobSetFLUSHTYPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobSetFLUSHTYP}.
	 * @param ctx the parse tree
	 */
	void exitJobSetFLUSHTYP(JCLParser.JobSetFLUSHTYPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#sJobStatement}.
	 * @param ctx the parse tree
	 */
	void enterSJobStatement(JCLParser.SJobStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#sJobStatement}.
	 * @param ctx the parse tree
	 */
	void exitSJobStatement(JCLParser.SJobStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#endSetStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndSetStatement(JCLParser.EndSetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#endSetStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndSetStatement(JCLParser.EndSetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#endGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndGroupStatement(JCLParser.EndGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#endGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndGroupStatement(JCLParser.EndGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#afterStatement}.
	 * @param ctx the parse tree
	 */
	void enterAfterStatement(JCLParser.AfterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#afterStatement}.
	 * @param ctx the parse tree
	 */
	void exitAfterStatement(JCLParser.AfterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#afterParameters}.
	 * @param ctx the parse tree
	 */
	void enterAfterParameters(JCLParser.AfterParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#afterParameters}.
	 * @param ctx the parse tree
	 */
	void exitAfterParameters(JCLParser.AfterParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#afterNAME}.
	 * @param ctx the parse tree
	 */
	void enterAfterNAME(JCLParser.AfterNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#afterNAME}.
	 * @param ctx the parse tree
	 */
	void exitAfterNAME(JCLParser.AfterNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#afterACTION}.
	 * @param ctx the parse tree
	 */
	void enterAfterACTION(JCLParser.AfterACTIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#afterACTION}.
	 * @param ctx the parse tree
	 */
	void exitAfterACTION(JCLParser.AfterACTIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#afterOTHERWISE}.
	 * @param ctx the parse tree
	 */
	void enterAfterOTHERWISE(JCLParser.AfterOTHERWISEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#afterOTHERWISE}.
	 * @param ctx the parse tree
	 */
	void exitAfterOTHERWISE(JCLParser.AfterOTHERWISEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#afterWHEN}.
	 * @param ctx the parse tree
	 */
	void enterAfterWHEN(JCLParser.AfterWHENContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#afterWHEN}.
	 * @param ctx the parse tree
	 */
	void exitAfterWHEN(JCLParser.AfterWHENContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#beforeStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeforeStatement(JCLParser.BeforeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#beforeStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeforeStatement(JCLParser.BeforeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#beforeParameters}.
	 * @param ctx the parse tree
	 */
	void enterBeforeParameters(JCLParser.BeforeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#beforeParameters}.
	 * @param ctx the parse tree
	 */
	void exitBeforeParameters(JCLParser.BeforeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#beforeNAME}.
	 * @param ctx the parse tree
	 */
	void enterBeforeNAME(JCLParser.BeforeNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#beforeNAME}.
	 * @param ctx the parse tree
	 */
	void exitBeforeNAME(JCLParser.BeforeNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#beforeACTION}.
	 * @param ctx the parse tree
	 */
	void enterBeforeACTION(JCLParser.BeforeACTIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#beforeACTION}.
	 * @param ctx the parse tree
	 */
	void exitBeforeACTION(JCLParser.BeforeACTIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#beforeOTHERWISE}.
	 * @param ctx the parse tree
	 */
	void enterBeforeOTHERWISE(JCLParser.BeforeOTHERWISEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#beforeOTHERWISE}.
	 * @param ctx the parse tree
	 */
	void exitBeforeOTHERWISE(JCLParser.BeforeOTHERWISEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#beforeWHEN}.
	 * @param ctx the parse tree
	 */
	void enterBeforeWHEN(JCLParser.BeforeWHENContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#beforeWHEN}.
	 * @param ctx the parse tree
	 */
	void exitBeforeWHEN(JCLParser.BeforeWHENContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#concurrentStatement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentStatement(JCLParser.ConcurrentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#concurrentStatement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentStatement(JCLParser.ConcurrentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#concurrentParameters}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentParameters(JCLParser.ConcurrentParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#concurrentParameters}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentParameters(JCLParser.ConcurrentParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#concurrentNAME}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentNAME(JCLParser.ConcurrentNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#concurrentNAME}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentNAME(JCLParser.ConcurrentNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#singleOrMultipleValue}.
	 * @param ctx the parse tree
	 */
	void enterSingleOrMultipleValue(JCLParser.SingleOrMultipleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#singleOrMultipleValue}.
	 * @param ctx the parse tree
	 */
	void exitSingleOrMultipleValue(JCLParser.SingleOrMultipleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#parenList}.
	 * @param ctx the parse tree
	 */
	void enterParenList(JCLParser.ParenListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#parenList}.
	 * @param ctx the parse tree
	 */
	void exitParenList(JCLParser.ParenListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2CntlStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2CntlStatement(JCLParser.Jes2CntlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2CntlStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2CntlStatement(JCLParser.Jes2CntlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmStatement(JCLParser.Jes2JobParmStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmStatement(JCLParser.Jes2JobParmStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmParameters}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmParameters(JCLParser.Jes2JobParmParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmParameters}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmParameters(JCLParser.Jes2JobParmParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmBURST}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmBURST(JCLParser.Jes2JobParmBURSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmBURST}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmBURST(JCLParser.Jes2JobParmBURSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmBYTES}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmBYTES(JCLParser.Jes2JobParmBYTESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmBYTES}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmBYTES(JCLParser.Jes2JobParmBYTESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmCARDS}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmCARDS(JCLParser.Jes2JobParmCARDSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmCARDS}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmCARDS(JCLParser.Jes2JobParmCARDSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmCOPIES}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmCOPIES(JCLParser.Jes2JobParmCOPIESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmCOPIES}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmCOPIES(JCLParser.Jes2JobParmCOPIESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmFORMS}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmFORMS(JCLParser.Jes2JobParmFORMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmFORMS}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmFORMS(JCLParser.Jes2JobParmFORMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmLINECT}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmLINECT(JCLParser.Jes2JobParmLINECTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmLINECT}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmLINECT(JCLParser.Jes2JobParmLINECTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmLINES}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmLINES(JCLParser.Jes2JobParmLINESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmLINES}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmLINES(JCLParser.Jes2JobParmLINESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmNOLOG}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmNOLOG(JCLParser.Jes2JobParmNOLOGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmNOLOG}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmNOLOG(JCLParser.Jes2JobParmNOLOGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmPAGES}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmPAGES(JCLParser.Jes2JobParmPAGESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmPAGES}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmPAGES(JCLParser.Jes2JobParmPAGESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmPROCLIB}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmPROCLIB(JCLParser.Jes2JobParmPROCLIBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmPROCLIB}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmPROCLIB(JCLParser.Jes2JobParmPROCLIBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmRESTART}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmRESTART(JCLParser.Jes2JobParmRESTARTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmRESTART}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmRESTART(JCLParser.Jes2JobParmRESTARTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmROOM}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmROOM(JCLParser.Jes2JobParmROOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmROOM}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmROOM(JCLParser.Jes2JobParmROOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmSYSAFF}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmSYSAFF(JCLParser.Jes2JobParmSYSAFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmSYSAFF}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmSYSAFF(JCLParser.Jes2JobParmSYSAFFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2JobParmTIME}.
	 * @param ctx the parse tree
	 */
	void enterJes2JobParmTIME(JCLParser.Jes2JobParmTIMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2JobParmTIME}.
	 * @param ctx the parse tree
	 */
	void exitJes2JobParmTIME(JCLParser.Jes2JobParmTIMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2MessageStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2MessageStatement(JCLParser.Jes2MessageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2MessageStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2MessageStatement(JCLParser.Jes2MessageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2MessageParameter}.
	 * @param ctx the parse tree
	 */
	void enterJes2MessageParameter(JCLParser.Jes2MessageParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2MessageParameter}.
	 * @param ctx the parse tree
	 */
	void exitJes2MessageParameter(JCLParser.Jes2MessageParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2NetAcctStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2NetAcctStatement(JCLParser.Jes2NetAcctStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2NetAcctStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2NetAcctStatement(JCLParser.Jes2NetAcctStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2NetAcctParameter}.
	 * @param ctx the parse tree
	 */
	void enterJes2NetAcctParameter(JCLParser.Jes2NetAcctParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2NetAcctParameter}.
	 * @param ctx the parse tree
	 */
	void exitJes2NetAcctParameter(JCLParser.Jes2NetAcctParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2NotifyStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2NotifyStatement(JCLParser.Jes2NotifyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2NotifyStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2NotifyStatement(JCLParser.Jes2NotifyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2NotifyParameter}.
	 * @param ctx the parse tree
	 */
	void enterJes2NotifyParameter(JCLParser.Jes2NotifyParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2NotifyParameter}.
	 * @param ctx the parse tree
	 */
	void exitJes2NotifyParameter(JCLParser.Jes2NotifyParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputStatement(JCLParser.Jes2OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputStatement(JCLParser.Jes2OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputParameters}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputParameters(JCLParser.Jes2OutputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputParameters}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputParameters(JCLParser.Jes2OutputParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputCONTINUATION}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputCONTINUATION(JCLParser.Jes2OutputCONTINUATIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputCONTINUATION}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputCONTINUATION(JCLParser.Jes2OutputCONTINUATIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputBURST}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputBURST(JCLParser.Jes2OutputBURSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputBURST}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputBURST(JCLParser.Jes2OutputBURSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputCHARS}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputCHARS(JCLParser.Jes2OutputCHARSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputCHARS}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputCHARS(JCLParser.Jes2OutputCHARSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputCKPTLNS}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputCKPTLNS(JCLParser.Jes2OutputCKPTLNSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputCKPTLNS}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputCKPTLNS(JCLParser.Jes2OutputCKPTLNSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputCKPTPGS}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputCKPTPGS(JCLParser.Jes2OutputCKPTPGSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputCKPTPGS}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputCKPTPGS(JCLParser.Jes2OutputCKPTPGSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputCOMPACT}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputCOMPACT(JCLParser.Jes2OutputCOMPACTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputCOMPACT}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputCOMPACT(JCLParser.Jes2OutputCOMPACTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputCOPIES}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputCOPIES(JCLParser.Jes2OutputCOPIESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputCOPIES}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputCOPIES(JCLParser.Jes2OutputCOPIESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputCOPYG}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputCOPYG(JCLParser.Jes2OutputCOPYGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputCOPYG}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputCOPYG(JCLParser.Jes2OutputCOPYGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputDEST}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputDEST(JCLParser.Jes2OutputDESTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputDEST}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputDEST(JCLParser.Jes2OutputDESTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputFCB}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputFCB(JCLParser.Jes2OutputFCBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputFCB}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputFCB(JCLParser.Jes2OutputFCBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputFLASH}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputFLASH(JCLParser.Jes2OutputFLASHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputFLASH}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputFLASH(JCLParser.Jes2OutputFLASHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputFLASHC}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputFLASHC(JCLParser.Jes2OutputFLASHCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputFLASHC}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputFLASHC(JCLParser.Jes2OutputFLASHCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputFORMS}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputFORMS(JCLParser.Jes2OutputFORMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputFORMS}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputFORMS(JCLParser.Jes2OutputFORMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputINDEX}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputINDEX(JCLParser.Jes2OutputINDEXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputINDEX}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputINDEX(JCLParser.Jes2OutputINDEXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputLINDEX}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputLINDEX(JCLParser.Jes2OutputLINDEXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputLINDEX}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputLINDEX(JCLParser.Jes2OutputLINDEXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputLINECT}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputLINECT(JCLParser.Jes2OutputLINECTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputLINECT}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputLINECT(JCLParser.Jes2OutputLINECTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputMODIFY}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputMODIFY(JCLParser.Jes2OutputMODIFYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputMODIFY}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputMODIFY(JCLParser.Jes2OutputMODIFYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputMODTRC}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputMODTRC(JCLParser.Jes2OutputMODTRCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputMODTRC}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputMODTRC(JCLParser.Jes2OutputMODTRCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2OutputUCS}.
	 * @param ctx the parse tree
	 */
	void enterJes2OutputUCS(JCLParser.Jes2OutputUCSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2OutputUCS}.
	 * @param ctx the parse tree
	 */
	void exitJes2OutputUCS(JCLParser.Jes2OutputUCSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2PriorityStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2PriorityStatement(JCLParser.Jes2PriorityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2PriorityStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2PriorityStatement(JCLParser.Jes2PriorityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2PriorityParameter}.
	 * @param ctx the parse tree
	 */
	void enterJes2PriorityParameter(JCLParser.Jes2PriorityParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2PriorityParameter}.
	 * @param ctx the parse tree
	 */
	void exitJes2PriorityParameter(JCLParser.Jes2PriorityParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2RouteStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2RouteStatement(JCLParser.Jes2RouteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2RouteStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2RouteStatement(JCLParser.Jes2RouteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2RouteParameter}.
	 * @param ctx the parse tree
	 */
	void enterJes2RouteParameter(JCLParser.Jes2RouteParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2RouteParameter}.
	 * @param ctx the parse tree
	 */
	void exitJes2RouteParameter(JCLParser.Jes2RouteParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2RoutePRINT}.
	 * @param ctx the parse tree
	 */
	void enterJes2RoutePRINT(JCLParser.Jes2RoutePRINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2RoutePRINT}.
	 * @param ctx the parse tree
	 */
	void exitJes2RoutePRINT(JCLParser.Jes2RoutePRINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2RoutePUNCH}.
	 * @param ctx the parse tree
	 */
	void enterJes2RoutePUNCH(JCLParser.Jes2RoutePUNCHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2RoutePUNCH}.
	 * @param ctx the parse tree
	 */
	void exitJes2RoutePUNCH(JCLParser.Jes2RoutePUNCHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2RouteXEQ}.
	 * @param ctx the parse tree
	 */
	void enterJes2RouteXEQ(JCLParser.Jes2RouteXEQContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2RouteXEQ}.
	 * @param ctx the parse tree
	 */
	void exitJes2RouteXEQ(JCLParser.Jes2RouteXEQContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2SetupStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2SetupStatement(JCLParser.Jes2SetupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2SetupStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2SetupStatement(JCLParser.Jes2SetupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2SignoffStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2SignoffStatement(JCLParser.Jes2SignoffStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2SignoffStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2SignoffStatement(JCLParser.Jes2SignoffStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2SignonStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2SignonStatement(JCLParser.Jes2SignonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2SignonStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2SignonStatement(JCLParser.Jes2SignonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2XEQStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2XEQStatement(JCLParser.Jes2XEQStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2XEQStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2XEQStatement(JCLParser.Jes2XEQStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jes2XMITStatement}.
	 * @param ctx the parse tree
	 */
	void enterJes2XMITStatement(JCLParser.Jes2XMITStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jes2XMITStatement}.
	 * @param ctx the parse tree
	 */
	void exitJes2XMITStatement(JCLParser.Jes2XMITStatementContext ctx);
}