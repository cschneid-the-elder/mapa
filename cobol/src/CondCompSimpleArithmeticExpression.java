
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompSimpleArithmeticExpression implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = CondCompTokenType.SIMPLE_ARITHMETIC_EXPRESSION;
	private CobolPreprocessorParser.ConditionalCompilationSimpleArithmeticExpressionContext ctx = null;
	private List<CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext> atoms = null;
	private CondCompArithOp op = null;
	private ArrayList<CondCompVar> varList = null;
	private TerminalNode tn = null;
	private long line = -1;
	private long sortKey = -1;
	private Integer value = null;

	public CondCompSimpleArithmeticExpression(
			CobolPreprocessorParser.ConditionalCompilationSimpleArithmeticExpressionContext ctx
			, ArrayList<CondCompVar> varList) {
		this.ctx = ctx;
		if (this.ctx.conditionalCompilationArithmeticOp() != null) {
			this.op = new CondCompArithOp(this.ctx.conditionalCompilationArithmeticOp());
		}
		this.atoms = this.ctx.conditionalCompilationArithmeticAtom();
		this.varList = varList;

		if (this.atoms == null) {
			throw new IllegalArgumentException(
				this.myName
				+ " ConditionalCompilationSimpleArithmeticExpressionContext"
				+ " with conditionalCompilationArithmeticAtom() == null");
		}

		if (this.atoms.size() == 0) {
			throw new IllegalArgumentException(
				this.myName
				+ " ConditionalCompilationSimpleArithmeticExpressionContext"
				+ " with conditionalCompilationArithmeticAtom().size() == 0");
		}

		for (CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext atom: this.atoms) {
			if (atom.IDENTIFIER() == null && atom.ZERO() == null && atom.literal() == null) {
				throw new IllegalArgumentException(
					this.myName
					+ " ConditionalCompilationArithmeticAtomContext"
					+ " with IDENTIFIER() == null && ZERO() == null && literal() == null");
			}
			if (atom.IDENTIFIER() != null) {
				if (atom.ZERO() != null || atom.literal() != null) {
					throw new IllegalArgumentException(
						this.myName
						+ " ConditionalCompilationArithmeticAtomContext"
						+ " with IDENTIFIER() != null && (ZERO() != null || literal() != null)");
				}
			}
			if (atom.ZERO() != null) {
				if (atom.IDENTIFIER() != null || atom.literal() != null) {
					throw new IllegalArgumentException(
						this.myName
						+ " ConditionalCompilationArithmeticAtomContext"
						+ " with ZERO() != null && (IDENTIFIER() != null || literal() != null)");
				}
			}
			if (atom.literal() != null) {
				if (atom.IDENTIFIER() != null || atom.ZERO() != null) {
					throw new IllegalArgumentException(
						this.myName
						+ " ConditionalCompilationArithmeticAtomContext"
						+ " with literal() != null && (ZERO() != null || IDENTIFIER() != null)");
				}
			}
			if (atom.literal() != null) {
				if (atom.literal().NUMERICLITERAL() == null) {
					throw new IllegalArgumentException(
						this.myName
						+ " ConditionalCompilationArithmeticAtomContext"
						+ " with literal().NUMERICLITERAL() == null");
				}
			}
						
		}

		if (this.atoms.get(0).IDENTIFIER() != null) {
			this.tn = this.atoms.get(0).IDENTIFIER();
		} else if (this.atoms.get(0).ZERO() != null) {
			this.tn = this.atoms.get(0).ZERO();
		} else {
			this.tn = this.atoms.get(0).literal().NUMERICLITERAL();
		}
		this.line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (this.line * (long)Integer.MAX_VALUE) + posn;
		this.setValue();
	}

	private void setValue() {
		if (this.atoms.size() == 1) {
			this.value = this.getAtomValue(0);
		} else {
			Integer arg1 = getAtomValue(0);
			Integer arg2 = getAtomValue(1);
			switch (op.getType()) {
				case NUMOP_MULTIPLY:
					this.value = arg1 * arg2;
					break;
				case NUMOP_SUBTRACT:
					this.value = arg1 - arg2;
					break;
				case NUMOP_ADD:
					this.value = arg1 + arg2;
					break;
				case NUMOP_DIVIDE:
					this.value = arg1 / arg2;
					break;
				default:
					throw new IllegalArgumentException(
						this.myName
						+ " CondCompArithOp set to unknown type"
						+ " at line "
						+ this.line
						);
			}
		}
	}

	private Integer getAtomValue(int i) {
		if (this.atoms.get(i).literal() != null) {
			return new Integer(this.atoms.get(i).literal().NUMERICLITERAL().getSymbol().getText());
		} else if (this.atoms.get(i).ZERO() != null) {
			return new Integer(0);
		} else {
			for (CondCompVar aVar: this.varList) {
				if (aVar.getVarName().equals(this.atoms.get(i).IDENTIFIER())) {
					return aVar.getIntValue();
				}
			}
			throw new IllegalArgumentException(
				this.myName
				+ " no value found for "
				+ this.atoms.get(i).IDENTIFIER()
				+ " @ line "
				+ this.line
				);
		}

	}

	public long getSortKey() {
		return this.sortKey;
	}

	public CondCompTokenType getType() {
		return this.type;
	}

	public Integer getValue() {
		return this.value;
	}
}
