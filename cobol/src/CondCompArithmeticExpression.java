
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompArithmeticExpression implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ctx = null;
	private List<CondCompSimpleArithmeticExpression> ccsaeList = null;
	private ArrayList<CondCompToken> tokens = new ArrayList<>();
	private ArrayDeque<CondCompToken> evals = new ArrayDeque<>();
	private ArrayList<CondCompVar> varList = null;
	private TerminalNode tn = null;
	private long sortKey = -1;
	private Integer value = null;
	private String text = null;

	public CondCompArithmeticExpression(
			CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ctx
			, ArrayList<CondCompVar> varList) {
		this.ctx = ctx;
		if (this.ctx.conditionalCompilationSimpleArithmeticExpression() != null) {
			List<CondCompSimpleArithmeticExpression> ccsaeList = 
				new CondCompSimpleArithmeticExpression.bunchOfThese(
					this.ctx.conditionalCompilationSimpleArithmeticExpression()
					, varList);
			for (CondCompSimpleArithmeticExpression ccsae: ccsaeList) {
				tokens.add(ccsae);
			}
		}

		if (this.ctx.LPARENCHAR() != null) {
			List<CondCompGroupOp> ccgoList = 
				new CondCompGroupOp.bunchOfthese(this.ctx.LPARENCHAR());
			for (CondCompGroupOp ccgo: ccgoList) {
				tokens.add(ccgo);
			}
		}

		if (this.ctx.RPARENCHAR() != null) {
			List<CondCompGroupOp> ccgoList = 
				new CondCompGroupOp.bunchOfthese(this.ctx.RPARENCHAR());
			for (CondCompGroupOp ccgo: ccgoList) {
				tokens.add(ccgo);
			}
		}

		if (this.ctx.conditionalCompilationArithmeticOp() != null) {
			List<CondCompArithOp> ccaoList = 
				new CondCompArithOp.bunchOfthese(this.ctx.conditionalCompilationArithmeticOp());
			for (CondCompArithOp ccao: ccaoList) {
				tokens.add(ccao);
			}
		}

		this.varList = varList;
		this.tokens.sort(Comparator.comparingLong(CondCompToken::getSortKey));

		StringBuilder sb = new StringBuilder();
		for (CondCompToken cct: tokens) {
			sb.append(cct);
		}
		this.text = sb.toString();

		/*
		Set up for setValue(), which wants a stack of tokens in the
		order they are to be evaluated, i.e. first token should be 
		on top of the stack.
		*/
		
		ArrayList<CondCompToken> revTokens = new ArrayList<>(this.tokens);
		Collections.reverse(revTokens);
		for (CondCompToken token: revTokens) {
			try {
				evals.push(token);
			} catch (Exception e) {
				TestIntegration.LOGGER.severe(
					"Exception " + e + " encountered"
					+ " in "
					+ this.myName
					+ " constructor");
				e.printStackTrace();
				System.exit(16);
			}
		}
	}

	private Integer setValue() {

	}

	public Integer getValue() {
		return this.value;
	}

}
