
import java.util.*;
import java.util.logging.Logger;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent an arithmetic expression in a
conditional compilation statement.

<p>Two things of note: First, the initialization which includes
creation of a stack (an ArrayDeque) containing all the tokens in
the expression with the addition of grouping symbols to ensure
operator precedence, that is to say that 2 + 3 * 4 is 14 and not 20.

<p>Second, there is a state machine for evaluating the expression
and determining its value.
*/

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
	private Logger LOGGER = Logger.getLogger("TestIntegration");

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
		this.LOGGER.finer(this.myName + " varList = |" + varList + "|");
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
		
		this.LOGGER.finest(this.myName + " tokens    = |" + this.tokens + "|");
		ArrayList<CondCompToken> revTokens = new ArrayList<>(this.tokens);
		Collections.reverse(revTokens);
		this.LOGGER.finest(this.myName + " revTokens = |" + revTokens + "|");

		/*
		Quoting part of Wikipedia from https://en.wikipedia.org/wiki/Operator-precedence_parser#Alternative_methods

		Another approach is to first fully parenthesize the expression, inserting a number of parentheses around each operator, such that they lead to the correct precedence even when parsed with a linear, left-to-right parser. This algorithm was used in the early FORTRAN I compiler:[7]

		The Fortran I compiler would expand each operator with a sequence of parentheses. In a simplified form of the algorithm, it would

		. replace + and – with ))+(( and ))-((, respectively;
		. replace * and / with )*( and )/(, respectively;
		. add (( at the beginning of each expression and after each left parenthesis in the original expression; and
		. add )) at the end of the expression and before each right parenthesis in the original expression.

		Although not obvious, the algorithm was correct, and, in the words of Knuth, “The resulting formula is properly parenthesized, believe it or not.”[8]

		[7] Padua, David (2000). "The Fortran I Compiler" (PDF) <http://polaris.cs.uiuc.edu/publications/c1070.pdf>. Computing in Science & Engineering. 2 (1): 70–75. Bibcode:2000CSE.....2a..70P. <https://ui.adsabs.harvard.edu/abs/2000CSE.....2a..70P> doi:10.1109/5992.814661. <https://doi.org/10.1109%2F5992.814661>

		*/

//		A C implementation...

//		#include <stdio.h>
//		#include <string.h>
//
//		int main(int argc, char *argv[]) {
//			int i;
//			printf("((((");
//			for (i=1;i!=argc;i++) {
//				if (argv[i] && !argv[i][1]) {
//					switch (*argv[i]) {
//					case '(': printf("(((("); continue;
//					case ')': printf("))))"); continue;
//					case '^': printf(")^("); continue;
//					case '*': printf("))*(("); continue;
//					case '/': printf("))/(("); continue;
//					case '+':
//						if (i == 1 || strchr("(^*/+-", *argv[i-1]))
//							printf("+");
//						else
//							printf(")))+(((");
//						continue;
//					case '-':
//						if (i == 1 || strchr("(^*/+-", *argv[i-1]))
//							printf("-");
//						else
//							printf(")))-(((");
//						continue;
//					}
//				}
//				printf("%s", argv[i]);
//			}
//			printf("))))\n");
//			return 0;
//		}

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
				this.LOGGER.severe(
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

		this.LOGGER.fine(this.myName + " setValue() evals = |" + this.evals + "|");

		while(this.evals.peek() != null) {
			try {
				token = this.evals.pop();
			} catch (Exception e) {
				this.LOGGER.severe(
					"Exception " + e + " encountered"
					+ " in "
					+ this.myName
					+ "::setValue()");
				e.printStackTrace();
				System.exit(16);
			}
			this.LOGGER.finest(this.myName + " setValue()" + " token.getType() = " + token.getType());
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
					this.LOGGER.finest(this.myName + " setValue()" + " returning |" + result + "|");
					return(result);
				case ARITHMETIC_ATOM:
					if (arithmeticOp == null) {
						result = ((CondCompArithmeticAtom)token).getValue();
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

		this.LOGGER.finest(this.myName + " setValue()" + " returning |" + result + "|");
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
