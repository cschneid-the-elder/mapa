
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompArithmeticExpression {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ctx = null;
	private List<CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext> atoms = null;
	private ArrayList<CondCompToken> tokens = new ArrayList<>();
	private ArrayDeque<CondCompToken> evals = new ArrayDeque<>();
	private ArrayList<CondCompVar> varList = null;
	private Integer value = null;
	private String text = null;
	private long sortKey = -1;

	public static List<CondCompArithmeticExpression> bunchOfThese(
				List<CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext> ctxList
				, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompArithmeticExpression> ccaeList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ccae: ctxList) {
			ccaeList.add(new CondCompArithmeticExpression(ccae, varList));
		}

		return ccaeList;
	}

	public CondCompArithmeticExpression(
			CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ctx
			, ArrayList<CondCompVar> varList) {
		this.ctx = ctx;
		this.varList = varList;
		TestIntegration.LOGGER.finer(this.myName + " varList = |" + varList + "|");
		if (this.ctx.conditionalCompilationArithmeticAtom() != null) {
			tokens.addAll( 
				CondCompArithmeticAtom.bunchOfThese(
					this.ctx.conditionalCompilationArithmeticAtom()
					, varList));
		}

		if (this.ctx.LPARENCHAR() != null) {
			tokens.addAll(CondCompGroupOp.bunchOfThese(this.ctx.LPARENCHAR()));
		}

		if (this.ctx.RPARENCHAR() != null) {
			tokens.addAll(CondCompGroupOp.bunchOfThese(this.ctx.RPARENCHAR()));
		}

		if (this.ctx.conditionalCompilationArithmeticOp() != null) {
			tokens.addAll(CondCompArithOp.bunchOfThese(this.ctx.conditionalCompilationArithmeticOp()));
		}

		this.tokens.sort(Comparator.comparingLong(CondCompToken::getSortKey));

		StringBuilder sb = new StringBuilder();
		for (CondCompToken cct: tokens) {
			sb.append(cct);
		}
		this.text = sb.toString();
		this.sortKey = tokens.get(0).getSortKey();

		/*
		Set up for setValue(), which wants a stack of tokens in the
		order they are to be evaluated, i.e. first token should be 
		on top of the stack.
		*/
		
		TestIntegration.LOGGER.finest(this.myName + " tokens    = |" + this.tokens + "|");
		ArrayList<CondCompToken> revTokens = new ArrayList<>(this.tokens);
		Collections.reverse(revTokens);
		TestIntegration.LOGGER.finest(this.myName + " revTokens = |" + revTokens + "|");
		evals.push(new CondCompGroupOp(")"));
		evals.push(new CondCompGroupOp(")"));
		evals.push(new CondCompGroupOp(")"));
		evals.push(new CondCompGroupOp(")"));
		for (CondCompToken token: revTokens) {
			try {
				switch(token.getType()) {
					case GROUPOP_BEGIN:
						evals.push(new CondCompGroupOp("("));
						evals.push(new CondCompGroupOp("("));
						evals.push(token);
						break;
					case GROUPOP_END:
						evals.push(token);
						evals.push(new CondCompGroupOp(")"));
						evals.push(new CondCompGroupOp(")"));
						break;
					case NUMOP_MULTIPLY:
					case NUMOP_DIVIDE:
						evals.push(new CondCompGroupOp("("));
						evals.push(token);
						evals.push(new CondCompGroupOp(")"));
						break;
					case NUMOP_SUBTRACT:
					case NUMOP_ADD:
						evals.push(new CondCompGroupOp("("));
						evals.push(new CondCompGroupOp("("));
						evals.push(token);
						evals.push(new CondCompGroupOp(")"));
						evals.push(new CondCompGroupOp(")"));
						break;
					default:
						evals.push(token);
						break;
				}
			} catch (Exception e) {
				TestIntegration.LOGGER.severe(
					"Exception " + e + " encountered"
					+ " in "
					+ this.myName
					+ " constructor whilst pushing token "
                    + token
                    + " on to evals ArrayDeque");
				e.printStackTrace();
				System.exit(16);
			}
		}
		evals.push(new CondCompGroupOp("("));
		evals.push(new CondCompGroupOp("("));
		evals.push(new CondCompGroupOp("("));
		evals.push(new CondCompGroupOp("("));

		this.value = this.setValue();
	}

	@SuppressWarnings({"fallthrough"})
	private Integer setValue() {
		CondCompToken token = null;
		CondCompToken arithmeticOp = null;
		Integer result = null;

		TestIntegration.LOGGER.fine(this.myName + " setValue() evals = |" + this.evals + "|");

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
					Integer groupResult = this.setValue();
					if (arithmeticOp == null) {
						result = groupResult;
					} else {
						switch(arithmeticOp.getType()) {
							case NUMOP_MULTIPLY:
								result = result * groupResult;
								break;
							case NUMOP_SUBTRACT:
								result = result - groupResult;
								break;
							case NUMOP_ADD:
								result = result + groupResult;
								break;
							case NUMOP_DIVIDE:
								result = result / groupResult;
								break;
							default:
								break;
						}
					}
					break;
				case GROUPOP_END:
					TestIntegration.LOGGER.finest(this.myName + " setValue()" + " returning |" + result + "|");
					return(result);
				case ARITHMETIC_ATOM:
					if (arithmeticOp == null) {
						result = ((CondCompArithmeticAtom)token).getValue();
						//TestIntegration.LOGGER.finest(this.myName + " setValue()" + " returning |" + result + "|");
						//return(result);
					} else {
						switch(arithmeticOp.getType()) {
							case NUMOP_MULTIPLY:
								result = result * ((CondCompArithmeticAtom)token).getValue();
								break;
							case NUMOP_SUBTRACT:
								result = result - ((CondCompArithmeticAtom)token).getValue();
								break;
							case NUMOP_ADD:
								result = result + ((CondCompArithmeticAtom)token).getValue();
								break;
							case NUMOP_DIVIDE:
								result = result / ((CondCompArithmeticAtom)token).getValue();
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

	public long getSortKey() {
		return this.sortKey;
	}

	public String toString() {
		return this.text;
	}
}
