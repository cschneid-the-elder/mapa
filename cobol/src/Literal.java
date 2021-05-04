
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**
*/

class Literal {

	private String myName = this.getClass().getName();
	private CobolParser.LiteralContext ctx = null;
	private String text = null;

	public static ArrayList<Literal> bunchOfThese(List<CobolParser.LiteralContext> ctxList) {
		ArrayList<Literal> aList = new ArrayList<>();

		for (CobolParser.LiteralContext aCtx: ctxList) {
			aList.add(new Literal(aCtx));
		}

		return aList;
	}

	public Literal(CobolParser.LiteralContext ctx) {
		this.ctx = ctx;
		this.text = this.ctx.NONNUMERICLITERAL().toString();
	}

	public String getText() {
		return this.text;
	}

}

