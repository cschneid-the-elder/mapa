
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompArithmeticExpression {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ctx = null;
	private List<CondCompSimpleArithmeticExpression> ccsaeList = null;
	private ArrayList<CondCompToken> tokens = new ArrayList<>();
	private ArrayDeque<CondCompToken> evals = new ArrayDeque<>();
	private ArrayList<CondCompVar> varList = null;
	private Integer value = null;
	private String text = null;

	public CondCompArithmeticExpression(
			CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ctx
			, ArrayList<CondCompVar> varList) {
		this.ctx = ctx;
		TestIntegration.LOGGER.finer(this.myName + " varList = |" + varList + "|");
		if (this.ctx.conditionalCompilationSimpleArithmeticExpression() != null) {
			List<CondCompSimpleArithmeticExpression> ccsaeList = 
				CondCompSimpleArithmeticExpression.bunchOfThese(
					this.ctx.conditionalCompilationSimpleArithmeticExpression()
					, varList);
			for (CondCompSimpleArithmeticExpression ccsae: ccsaeList) {
				tokens.add(ccsae);
			}
		}

		if (this.ctx.LPARENCHAR() != null) {
			List<CondCompGroupOp> ccgoList = 
				CondCompGroupOp.bunchOfThese(this.ctx.LPARENCHAR());
			for (CondCompGroupOp ccgo: ccgoList) {
				tokens.add(ccgo);
			}
		}

		if (this.ctx.RPARENCHAR() != null) {
			List<CondCompGroupOp> ccgoList = 
				CondCompGroupOp.bunchOfThese(this.ctx.RPARENCHAR());
			for (CondCompGroupOp ccgo: ccgoList) {
				tokens.add(ccgo);
			}
		}

		if (this.ctx.conditionalCompilationArithmeticOp() != null) {
			List<CondCompArithOp> ccaoList = 
				CondCompArithOp.bunchOfThese(this.ctx.conditionalCompilationArithmeticOp());
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

		this.value = this.setValue();
	}

	@SuppressWarnings({"fallthrough"})
	private Integer setValue() {
		CondCompToken token = null;
		CondCompToken arithmeticOp = null;
		Integer result = null;

		TestIntegration.LOGGER.fine(this.myName + " setValue()");

		while(this.evals.peek() != null) {
			try {
				token = this.evals.pop();
			} catch (Exception e) {
				TestIntegration.LOGGER.severe(
					"Exception " + e + " encountered"
					+ " in "
					+ this.myName
					+ "::setValue()");
				e.printStackTrace();
				System.exit(16);
			}
			TestIntegration.LOGGER.finest(this.myName + " setValue()" + " token.getType() = " + token.getType());
			switch(token.getType()) {
				case GROUPOP_BEGIN:
					result = this.setValue();
					break;
				case GROUPOP_END:
					TestIntegration.LOGGER.finest(this.myName + " setValue()" + " returning |" + result + "|");
					return(result);
				case SIMPLE_ARITHMETIC_EXPRESSION:
					if (arithmeticOp == null) {
						result = ((CondCompSimpleArithmeticExpression)token).getValue();
					} else {
						switch(arithmeticOp.getType()) {
							case NUMOP_MULTIPLY:
								result = result * ((CondCompSimpleArithmeticExpression)token).getValue();
								break;
							case NUMOP_SUBTRACT:
								result = result - ((CondCompSimpleArithmeticExpression)token).getValue();
								break;
							case NUMOP_ADD:
								result = result + ((CondCompSimpleArithmeticExpression)token).getValue();
								break;
							case NUMOP_DIVIDE:
								result = result / ((CondCompSimpleArithmeticExpression)token).getValue();
								break;
							default:
								break;
						}
					}
					break;
				case NUMOP_MULTIPLY:
				case NUMOP_SUBTRACT:
				case NUMOP_ADD:
				case NUMOP_DIVIDE:
					arithmeticOp = token;
					break;
				default:
					break;
			}
		}

		TestIntegration.LOGGER.finest(this.myName + " setValue()" + " returning |" + result + "|");
		return result;
	}

	public Integer getValue() {
		return this.value;
	}

}
