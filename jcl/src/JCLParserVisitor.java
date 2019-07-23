// Generated from src/JCLParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JCLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JCLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JCLParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(JCLParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJcl(JCLParser.JclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execJCL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecJCL(JCLParser.ExecJCLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#procJCL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcJCL(JCLParser.ProcJCLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#procStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcStatement(JCLParser.ProcStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#defineSymbolicParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#definedSymbolicParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedSymbolicParameters(JCLParser.DefinedSymbolicParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#commentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStatement(JCLParser.CommentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#inlineComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineComment(JCLParser.InlineCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#stepName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepName(JCLParser.StepNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#procName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcName(JCLParser.ProcNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jclStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJclStep(JCLParser.JclStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecStatement(JCLParser.ExecStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execPgmStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecPgmStatement(JCLParser.ExecPgmStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execPgmClosure1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecPgmClosure1(JCLParser.ExecPgmClosure1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execPgmClosure2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecPgmClosure2(JCLParser.ExecPgmClosure2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execPgmClosure3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecPgmClosure3(JCLParser.ExecPgmClosure3Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execPgmClosure4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecPgmClosure4(JCLParser.ExecPgmClosure4Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execPgmClosure5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecPgmClosure5(JCLParser.ExecPgmClosure5Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execProcStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecProcStatement(JCLParser.ExecProcStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execProcClosure1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecProcClosure1(JCLParser.ExecProcClosure1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execProcClosure2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecProcClosure2(JCLParser.ExecProcClosure2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execProcClosure3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecProcClosure3(JCLParser.ExecProcClosure3Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execProcClosure4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecProcClosure4(JCLParser.ExecProcClosure4Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execProcClosure5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecProcClosure5(JCLParser.ExecProcClosure5Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParameter(JCLParser.ExecParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParameterOverrides}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParameterOverrides(JCLParser.ExecParameterOverridesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#stepAccountingInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepAccountingInformation(JCLParser.StepAccountingInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#stepAccountingInformationSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepAccountingInformationSimple(JCLParser.StepAccountingInformationSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#stepAccountingInformationMultiLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepAccountingInformationMultiLine(JCLParser.StepAccountingInformationMultiLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#stepAccountingString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepAccountingString(JCLParser.StepAccountingStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmACCT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmACCT(JCLParser.ExecParmACCTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmADDRSPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmADDRSPC(JCLParser.ExecParmADDRSPCContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmCCSID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmCCSID(JCLParser.ExecParmCCSIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmCOND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmCOND(JCLParser.ExecParmCONDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmDYNAMNBR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmDYNAMNBR(JCLParser.ExecParmDYNAMNBRContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmMEMLIMIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmMEMLIMIT(JCLParser.ExecParmMEMLIMITContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmPARM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmPARM(JCLParser.ExecParmPARMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmPARMDD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmPARMDD(JCLParser.ExecParmPARMDDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmPERFORM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmPERFORM(JCLParser.ExecParmPERFORMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmRD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmRD(JCLParser.ExecParmRDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmREGION}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmREGION(JCLParser.ExecParmREGIONContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmREGIONX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmREGIONX(JCLParser.ExecParmREGIONXContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmRLSTMOUT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmRLSTMOUT(JCLParser.ExecParmRLSTMOUTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmTIME}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmTIME(JCLParser.ExecParmTIMEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmTVSMSG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmTVSMSG(JCLParser.ExecParmTVSMSGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#execParmTVSAMCOM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecParmTVSAMCOM(JCLParser.ExecParmTVSAMCOMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdStatement(JCLParser.DdStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddStatementClosure1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdStatementClosure1(JCLParser.DdStatementClosure1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddStatementClosure2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdStatementClosure2(JCLParser.DdStatementClosure2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddStatementClosure3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdStatementClosure3(JCLParser.DdStatementClosure3Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddStatementClosure4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdStatementClosure4(JCLParser.DdStatementClosure4Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddStatementConcatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdStatementConcatenation(JCLParser.DdStatementConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddStatementAmalgamation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdStatementAmalgamation(JCLParser.DdStatementAmalgamationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdName(JCLParser.DdNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParameter(JCLParser.DdParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmACCODE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmACCODE(JCLParser.DdParmACCODEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP(JCLParser.DdParmAMPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmASTERISK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmASTERISK(JCLParser.DdParmASTERISKContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmASTERISK_DATA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmASTERISK_DATA(JCLParser.DdParmASTERISK_DATAContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAVGREC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAVGREC(JCLParser.DdParmAVGRECContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmBLKSIZE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmBLKSIZE(JCLParser.DdParmBLKSIZEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmBLKSZLIM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmBLKSZLIM(JCLParser.DdParmBLKSZLIMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmBURST}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmBURST(JCLParser.DdParmBURSTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmCCSID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmCCSID(JCLParser.DdParmCCSIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmCHARS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmCHARS(JCLParser.DdParmCHARSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmCHKPT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmCHKPT(JCLParser.DdParmCHKPTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmCNTL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmCNTL(JCLParser.DdParmCNTLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmCOPIES}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmCOPIES(JCLParser.DdParmCOPIESContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDATA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDATA(JCLParser.DdParmDATAContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDATACLAS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDATACLAS(JCLParser.DdParmDATACLASContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB(JCLParser.DdParmDCBContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_Parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_Parameter(JCLParser.DdParmDCB_ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BFALN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BFALN(JCLParser.DdParmDCB_BFALNContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BFTEK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BFTEK(JCLParser.DdParmDCB_BFTEKContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BLKSIZE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BLKSIZE(JCLParser.DdParmDCB_BLKSIZEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BUFIN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BUFIN(JCLParser.DdParmDCB_BUFINContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BUFL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BUFL(JCLParser.DdParmDCB_BUFLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BUFMAX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BUFMAX(JCLParser.DdParmDCB_BUFMAXContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BUFNO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BUFNO(JCLParser.DdParmDCB_BUFNOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BUFOFF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BUFOFF(JCLParser.DdParmDCB_BUFOFFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BUFOUT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BUFOUT(JCLParser.DdParmDCB_BUFOUTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_BUFSIZE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_BUFSIZE(JCLParser.DdParmDCB_BUFSIZEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_CPRI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_CPRI(JCLParser.DdParmDCB_CPRIContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_CYLOFL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_CYLOFL(JCLParser.DdParmDCB_CYLOFLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_DEN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_DEN(JCLParser.DdParmDCB_DENContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_DIAGNS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_DIAGNS(JCLParser.DdParmDCB_DIAGNSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_DSORG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_DSORG(JCLParser.DdParmDCB_DSORGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_EROPT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_EROPT(JCLParser.DdParmDCB_EROPTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_FUNC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_FUNC(JCLParser.DdParmDCB_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_GNCP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_GNCP(JCLParser.DdParmDCB_GNCPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_INTVL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_INTVL(JCLParser.DdParmDCB_INTVLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_IPLTXID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_IPLTXID(JCLParser.DdParmDCB_IPLTXIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_KEYLEN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_KEYLEN(JCLParser.DdParmDCB_KEYLENContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_LIMCT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_LIMCT(JCLParser.DdParmDCB_LIMCTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_LRECL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_LRECL(JCLParser.DdParmDCB_LRECLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_MODE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_MODE(JCLParser.DdParmDCB_MODEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_NCP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_NCP(JCLParser.DdParmDCB_NCPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_NTM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_NTM(JCLParser.DdParmDCB_NTMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_OPTCD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_OPTCD(JCLParser.DdParmDCB_OPTCDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_PCI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_PCI(JCLParser.DdParmDCB_PCIContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_PRTSP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_PRTSP(JCLParser.DdParmDCB_PRTSPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_RECFM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_RECFM(JCLParser.DdParmDCB_RECFMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_RESERVE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_RESERVE(JCLParser.DdParmDCB_RESERVEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_RKP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_RKP(JCLParser.DdParmDCB_RKPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_STACK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_STACK(JCLParser.DdParmDCB_STACKContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_THRESH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_THRESH(JCLParser.DdParmDCB_THRESHContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDCB_TRTCH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDCB_TRTCH(JCLParser.DdParmDCB_TRTCHContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDEST}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDEST(JCLParser.DdParmDESTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDISP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDISP(JCLParser.DdParmDISPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDISP_STATUS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDISP_STATUS(JCLParser.DdParmDISP_STATUSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDISP_NORMAL_TERM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDISP_NORMAL_TERM(JCLParser.DdParmDISP_NORMAL_TERMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDISP_ABNORMAL_TERM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDISP_ABNORMAL_TERM(JCLParser.DdParmDISP_ABNORMAL_TERMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDLM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDLM(JCLParser.DdParmDLMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDSID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDSID(JCLParser.DdParmDSIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDSKEYLBL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDSKEYLBL(JCLParser.DdParmDSKEYLBLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDSNAME}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDSNAME(JCLParser.DdParmDSNAMEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDSNTYPE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDSNTYPE(JCLParser.DdParmDSNTYPEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDUMMY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDUMMY(JCLParser.DdParmDUMMYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmDYNAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmDYNAM(JCLParser.DdParmDYNAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmEATTR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmEATTR(JCLParser.DdParmEATTRContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmEXPDT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmEXPDT(JCLParser.DdParmEXPDTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmFCB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmFCB(JCLParser.DdParmFCBContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmFILEDATA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmFILEDATA(JCLParser.DdParmFILEDATAContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmFLASH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmFLASH(JCLParser.DdParmFLASHContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmFREE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmFREE(JCLParser.DdParmFREEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmFREEVOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmFREEVOL(JCLParser.DdParmFREEVOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmGDGORDER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmGDGORDER(JCLParser.DdParmGDGORDERContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmHOLD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmHOLD(JCLParser.DdParmHOLDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmKEYLABL1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmKEYLABL1(JCLParser.DdParmKEYLABL1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmKEYLABL2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmKEYLABL2(JCLParser.DdParmKEYLABL2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmKEYENCD1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmKEYENCD1(JCLParser.DdParmKEYENCD1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmKEYENCD2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmKEYENCD2(JCLParser.DdParmKEYENCD2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmKEYLEN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmKEYLEN(JCLParser.DdParmKEYLENContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmKEYOFF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmKEYOFF(JCLParser.DdParmKEYOFFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmLABEL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmLABEL(JCLParser.DdParmLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmLGSTREAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmLGSTREAM(JCLParser.DdParmLGSTREAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmLIKE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmLIKE(JCLParser.DdParmLIKEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmLRECL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmLRECL(JCLParser.DdParmLRECLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmMAXGENS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmMAXGENS(JCLParser.DdParmMAXGENSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmMGMTCLAS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmMGMTCLAS(JCLParser.DdParmMGMTCLASContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmMODIFY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmMODIFY(JCLParser.DdParmMODIFYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmOUTLIM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmOUTLIM(JCLParser.DdParmOUTLIMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmOUTPUT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmOUTPUT(JCLParser.DdParmOUTPUTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmPATH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmPATH(JCLParser.DdParmPATHContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmPATHDISP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmPATHDISP(JCLParser.DdParmPATHDISPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmPATHMODE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmPATHMODE(JCLParser.DdParmPATHMODEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmPATHOPTS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmPATHOPTS(JCLParser.DdParmPATHOPTSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmPROTECT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmPROTECT(JCLParser.DdParmPROTECTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmRECFM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmRECFM(JCLParser.DdParmRECFMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmRECORG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmRECORG(JCLParser.DdParmRECORGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmREFDD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmREFDD(JCLParser.DdParmREFDDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmRETPD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmRETPD(JCLParser.DdParmRETPDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmRLS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmRLS(JCLParser.DdParmRLSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmROACCESS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmROACCESS(JCLParser.DdParmROACCESSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSECMODEL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSECMODEL(JCLParser.DdParmSECMODELContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSEGMENT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSEGMENT(JCLParser.DdParmSEGMENTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSPACE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSPACE(JCLParser.DdParmSPACEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSPIN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSPIN(JCLParser.DdParmSPINContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSTORCLAS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSTORCLAS(JCLParser.DdParmSTORCLASContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSUBSYS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSUBSYS(JCLParser.DdParmSUBSYSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSYMBOLS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSYMBOLS(JCLParser.DdParmSYMBOLSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSYMLIST}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSYMLIST(JCLParser.DdParmSYMLISTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmSYSOUT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmSYSOUT(JCLParser.DdParmSYSOUTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmTERM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmTERM(JCLParser.DdParmTERMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmUCS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmUCS(JCLParser.DdParmUCSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmUNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmUNIT(JCLParser.DdParmUNITContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmVOLUME}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmVOLUME(JCLParser.DdParmVOLUMEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmVolSer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmVolSer(JCLParser.DdParmVolSerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmVOLUME_SER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmVOLUME_SER(JCLParser.DdParmVOLUME_SERContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmVOLUME_REF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmVOLUME_REF(JCLParser.DdParmVOLUME_REFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_Parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_Parameter(JCLParser.DdParmAMP_ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_ACCBIAS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_ACCBIAS(JCLParser.DdParmAMP_ACCBIASContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_AMORG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_AMORG(JCLParser.DdParmAMP_AMORGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_BUFND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_BUFND(JCLParser.DdParmAMP_BUFNDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_BUFNI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_BUFNI(JCLParser.DdParmAMP_BUFNIContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_BUFSP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_BUFSP(JCLParser.DdParmAMP_BUFSPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_CROPS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_CROPS(JCLParser.DdParmAMP_CROPSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_FRLOG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_FRLOG(JCLParser.DdParmAMP_FRLOGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_MSG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_MSG(JCLParser.DdParmAMP_MSGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_OPTCD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_OPTCD(JCLParser.DdParmAMP_OPTCDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_RECFM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_RECFM(JCLParser.DdParmAMP_RECFMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_RMODE31}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_RMODE31(JCLParser.DdParmAMP_RMODE31Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_SMBDFR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_SMBDFR(JCLParser.DdParmAMP_SMBDFRContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_SMBHWT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_SMBHWT(JCLParser.DdParmAMP_SMBHWTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_SMBVSP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_SMBVSP(JCLParser.DdParmAMP_SMBVSPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_SMBVSPI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_SMBVSPI(JCLParser.DdParmAMP_SMBVSPIContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_STRNO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_STRNO(JCLParser.DdParmAMP_STRNOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_SYNAD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_SYNAD(JCLParser.DdParmAMP_SYNADContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmReferback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmReferback(JCLParser.DdParmReferbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_TRACE(JCLParser.DdParmAMP_TRACEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_Parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_TRACE_Parameter(JCLParser.DdParmAMP_TRACE_ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_HOOK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_TRACE_HOOK(JCLParser.DdParmAMP_TRACE_HOOKContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_ECODE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_TRACE_ECODE(JCLParser.DdParmAMP_TRACE_ECODEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_KEY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_TRACE_KEY(JCLParser.DdParmAMP_TRACE_KEYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_PARM1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_TRACE_PARM1(JCLParser.DdParmAMP_TRACE_PARM1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_PARM2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdParmAMP_TRACE_PARM2(JCLParser.DdParmAMP_TRACE_PARM2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#joblibStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoblibStatement(JCLParser.JoblibStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#joblibConcatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoblibConcatenation(JCLParser.JoblibConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#joblibAmalgamation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoblibAmalgamation(JCLParser.JoblibAmalgamationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#joblibParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoblibParameter(JCLParser.JoblibParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#syschkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyschkStatement(JCLParser.SyschkStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#syschkConcatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyschkConcatenation(JCLParser.SyschkConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#syschkAmalgamation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyschkAmalgamation(JCLParser.SyschkAmalgamationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#syschkParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyschkParameter(JCLParser.SyschkParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobCard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobCard(JCLParser.JobCardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobName(JCLParser.JobNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobAccountingInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobAccountingInformation(JCLParser.JobAccountingInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobAccountingInformationSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobAccountingInformationSimple(JCLParser.JobAccountingInformationSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobAccountingInformationMultiLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobAccountingInformationMultiLine(JCLParser.JobAccountingInformationMultiLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobAccountingString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobAccountingString(JCLParser.JobAccountingStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobProgrammerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobProgrammerName(JCLParser.JobProgrammerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobKeywordParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobKeywordParameter(JCLParser.JobKeywordParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmBYTES}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmBYTES(JCLParser.JobParmBYTESContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmCARDS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmCARDS(JCLParser.JobParmCARDSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmLINES}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmLINES(JCLParser.JobParmLINESContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmPAGES}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmPAGES(JCLParser.JobParmPAGESContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmADDRSPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmADDRSPC(JCLParser.JobParmADDRSPCContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmCCSID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmCCSID(JCLParser.JobParmCCSIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmCLASS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmCLASS(JCLParser.JobParmCLASSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmCOND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmCOND(JCLParser.JobParmCONDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmDSENQSHR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmDSENQSHR(JCLParser.JobParmDSENQSHRContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmEMAIL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmEMAIL(JCLParser.JobParmEMAILContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmGDGBIAS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmGDGBIAS(JCLParser.JobParmGDGBIASContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmGROUP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmGROUP(JCLParser.JobParmGROUPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmJESLOG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmJESLOG(JCLParser.JobParmJESLOGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmJOBRC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmJOBRC(JCLParser.JobParmJOBRCContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmMEMLIMIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmMEMLIMIT(JCLParser.JobParmMEMLIMITContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmMSGCLASS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmMSGCLASS(JCLParser.JobParmMSGCLASSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmMSGLEVEL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmMSGLEVEL(JCLParser.JobParmMSGLEVELContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmNOTIFY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmNOTIFY(JCLParser.JobParmNOTIFYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmPASSWORD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmPASSWORD(JCLParser.JobParmPASSWORDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmPERFORM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmPERFORM(JCLParser.JobParmPERFORMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmPRTY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmPRTY(JCLParser.JobParmPRTYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmRD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmRD(JCLParser.JobParmRDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmREGION}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmREGION(JCLParser.JobParmREGIONContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmREGIONX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmREGIONX(JCLParser.JobParmREGIONXContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmRESTART}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmRESTART(JCLParser.JobParmRESTARTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmSECLABEL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmSECLABEL(JCLParser.JobParmSECLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmSCHENV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmSCHENV(JCLParser.JobParmSCHENVContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmSYSAFF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmSYSAFF(JCLParser.JobParmSYSAFFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmSYSTEM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmSYSTEM(JCLParser.JobParmSYSTEMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmTIME}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmTIME(JCLParser.JobParmTIMEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmTYPRUN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmTYPRUN(JCLParser.JobParmTYPRUNContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmUJOBCORR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmUJOBCORR(JCLParser.JobParmUJOBCORRContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jobParmUSER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobParmUSER(JCLParser.JobParmUSERContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#commandStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandStatement(JCLParser.CommandStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#cntlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntlStatement(JCLParser.CntlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#endcntlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndcntlStatement(JCLParser.EndcntlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#cntlStatementAmalgamation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntlStatementAmalgamation(JCLParser.CntlStatementAmalgamationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(JCLParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JCLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(JCLParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#endifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndifStatement(JCLParser.EndifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(JCLParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#jcllibStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJcllibStatement(JCLParser.JcllibStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#notifyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStatement(JCLParser.NotifyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#yesOrNo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYesOrNo(JCLParser.YesOrNoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(JCLParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementParameter(JCLParser.OutputStatementParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementADDRESS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementADDRESS(JCLParser.OutputStatementADDRESSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementAFPPARMS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementAFPPARMS(JCLParser.OutputStatementAFPPARMSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementAFPSTATS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementAFPSTATS(JCLParser.OutputStatementAFPSTATSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementBUILDING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementBUILDING(JCLParser.OutputStatementBUILDINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementBURST}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementBURST(JCLParser.OutputStatementBURSTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCHARS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCHARS(JCLParser.OutputStatementCHARSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCKPTLINE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCKPTLINE(JCLParser.OutputStatementCKPTLINEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCKPTPAGE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCKPTPAGE(JCLParser.OutputStatementCKPTPAGEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCKPTSEC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCKPTSEC(JCLParser.OutputStatementCKPTSECContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCLASS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCLASS(JCLParser.OutputStatementCLASSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCOLORMAP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCOLORMAP(JCLParser.OutputStatementCOLORMAPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCOMPACT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCOMPACT(JCLParser.OutputStatementCOMPACTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCOMSETUP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCOMSETUP(JCLParser.OutputStatementCOMSETUPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCONTROL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCONTROL(JCLParser.OutputStatementCONTROLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCOPIES}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCOPIES(JCLParser.OutputStatementCOPIESContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementCOPYCNT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementCOPYCNT(JCLParser.OutputStatementCOPYCNTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementDATACK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementDATACK(JCLParser.OutputStatementDATACKContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementDDNAME}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementDDNAME(JCLParser.OutputStatementDDNAMEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementDEFAULT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementDEFAULT(JCLParser.OutputStatementDEFAULTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementDEPT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementDEPT(JCLParser.OutputStatementDEPTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementDEST}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementDEST(JCLParser.OutputStatementDESTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementDPAGELBL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementDPAGELBL(JCLParser.OutputStatementDPAGELBLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementDUPLEX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementDUPLEX(JCLParser.OutputStatementDUPLEXContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementFCB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementFCB(JCLParser.OutputStatementFCBContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementFLASH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementFLASH(JCLParser.OutputStatementFLASHContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementFORMDEF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementFORMDEF(JCLParser.OutputStatementFORMDEFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementFORMLEN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementFORMLEN(JCLParser.OutputStatementFORMLENContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementFORMS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementFORMS(JCLParser.OutputStatementFORMSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementFSSDATA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementFSSDATA(JCLParser.OutputStatementFSSDATAContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementGROUPID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementGROUPID(JCLParser.OutputStatementGROUPIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementINDEX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementINDEX(JCLParser.OutputStatementINDEXContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementINTRAY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementINTRAY(JCLParser.OutputStatementINTRAYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementJESDS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementJESDS(JCLParser.OutputStatementJESDSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementLINDEX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementLINDEX(JCLParser.OutputStatementLINDEXContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementLINECT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementLINECT(JCLParser.OutputStatementLINECTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementMAILBCC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementMAILBCC(JCLParser.OutputStatementMAILBCCContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementMAILCC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementMAILCC(JCLParser.OutputStatementMAILCCContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementMAILFILE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementMAILFILE(JCLParser.OutputStatementMAILFILEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementMAILFROM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementMAILFROM(JCLParser.OutputStatementMAILFROMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementMAILTO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementMAILTO(JCLParser.OutputStatementMAILTOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementMERGE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementMERGE(JCLParser.OutputStatementMERGEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementMODIFY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementMODIFY(JCLParser.OutputStatementMODIFYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementNAME}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementNAME(JCLParser.OutputStatementNAMEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementNOTIFY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementNOTIFY(JCLParser.OutputStatementNOTIFYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOFFSETXB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOFFSETXB(JCLParser.OutputStatementOFFSETXBContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOFFSETXF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOFFSETXF(JCLParser.OutputStatementOFFSETXFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOFFSETYB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOFFSETYB(JCLParser.OutputStatementOFFSETYBContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOFFSETYF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOFFSETYF(JCLParser.OutputStatementOFFSETYFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOFFSET_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOFFSET_unit(JCLParser.OutputStatementOFFSET_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOUTBIN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOUTBIN(JCLParser.OutputStatementOUTBINContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOUTDISP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOUTDISP(JCLParser.OutputStatementOUTDISPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOUTDISP_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOUTDISP_val(JCLParser.OutputStatementOUTDISP_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOVERLAYB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOVERLAYB(JCLParser.OutputStatementOVERLAYBContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOVERLAYF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOVERLAYF(JCLParser.OutputStatementOVERLAYFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementOVFL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementOVFL(JCLParser.OutputStatementOVFLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPAGEDEF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPAGEDEF(JCLParser.OutputStatementPAGEDEFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPIMSG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPIMSG(JCLParser.OutputStatementPIMSGContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPORTNO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPORTNO(JCLParser.OutputStatementPORTNOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPRMODE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPRMODE(JCLParser.OutputStatementPRMODEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPRTATTRS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPRTATTRS(JCLParser.OutputStatementPRTATTRSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPRTERROR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPRTERROR(JCLParser.OutputStatementPRTERRORContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPRTOPTNS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPRTOPTNS(JCLParser.OutputStatementPRTOPTNSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPRTQUEUE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPRTQUEUE(JCLParser.OutputStatementPRTQUEUEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementPRTY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementPRTY(JCLParser.OutputStatementPRTYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementREPLYTO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementREPLYTO(JCLParser.OutputStatementREPLYTOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementRESFMT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementRESFMT(JCLParser.OutputStatementRESFMTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementRETAINS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementRETAINS(JCLParser.OutputStatementRETAINSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementRETAINF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementRETAINF(JCLParser.OutputStatementRETAINFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementRETRYL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementRETRYL(JCLParser.OutputStatementRETRYLContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementRETRYT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementRETRYT(JCLParser.OutputStatementRETRYTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementROOM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementROOM(JCLParser.OutputStatementROOMContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementSYSAREA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementSYSAREA(JCLParser.OutputStatementSYSAREAContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementTHRESHLD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementTHRESHLD(JCLParser.OutputStatementTHRESHLDContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementTITLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementTITLE(JCLParser.OutputStatementTITLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementTRC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementTRC(JCLParser.OutputStatementTRCContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementUCS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementUCS(JCLParser.OutputStatementUCSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementUSERDATA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementUSERDATA(JCLParser.OutputStatementUSERDATAContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementUSERLIB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementUSERLIB(JCLParser.OutputStatementUSERLIBContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementUSERPATH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementUSERPATH(JCLParser.OutputStatementUSERPATHContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#outputStatementWRITER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatementWRITER(JCLParser.OutputStatementWRITERContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#pendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPendStatement(JCLParser.PendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleStatement(JCLParser.ScheduleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParameters(JCLParser.ScheduleParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParmAFTER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParmAFTER(JCLParser.ScheduleParmAFTERContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParmBEFORE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParmBEFORE(JCLParser.ScheduleParmBEFOREContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParmDELAY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParmDELAY(JCLParser.ScheduleParmDELAYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParmHOLDUNTIL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParmHOLDUNTIL(JCLParser.ScheduleParmHOLDUNTILContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParmJOBGROUP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParmJOBGROUP(JCLParser.ScheduleParmJOBGROUPContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParmSTARTBY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParmSTARTBY(JCLParser.ScheduleParmSTARTBYContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#scheduleParmWITH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleParmWITH(JCLParser.ScheduleParmWITHContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(JCLParser.SetStatementContext ctx);
}