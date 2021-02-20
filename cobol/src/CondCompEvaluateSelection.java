import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompEvaluateSelection {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.ConditionalCompilationEvaluateSelectionContext ctx = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ccaeCtx = null;
	private TerminalNode identifier = null;
	private CobolPreprocessorParser.LiteralContext literalCtx = null;
	private TerminalNode numericLiteral = null;
	private TerminalNode nonNumericLiteral = null;
	private CondCompArithmeticExpression ccae = null;
	private String text = null;

	public CondCompEvaluateSelection (
				CobolPreprocessorParser.ConditionalCompilationEvaluateSelectionContext ctx
				, ArrayList<CondCompVar> varList) {
		this.ctx = ctx;
		this.ccaeCtx = ctx.conditionalCompilationArithmeticExpression();
		this.ccae = new CondCompArithmeticExpression(this.ccaeCtx, varList);
		this.identifier = this.ctx.IDENTIFIER();
		this.literalCtx = this.ctx.literal();
		if (this.literalCtx != null) {
			this.numericLiteral = this.literalCtx.NUMERICLITERAL();
			this.nonNumericLiteral = this.literalCtx.NONNUMERICLITERAL();
		}

	}

}
