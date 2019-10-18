
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class KeywordValueWrapper {

	private String value = null;
	private int line = -1;
	private int posn = -1;

	public static ArrayList<KeywordValueWrapper> bunchOfThese(List<JCLParser.KeywordOrSymbolicContext> ctxList) {		Demo01.LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());

		ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();

		for (JCLParser.KeywordOrSymbolicContext k: ctxList) {
			kvw.addAll(KeywordValueWrapper.bunchOfThese(k));
		}

		return kvw;
	}

	public static ArrayList<KeywordValueWrapper> bunchOfThese(JCLParser.KeywordOrSymbolicContext ctx) {
		ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();

		if (ctx.QUOTED_STRING_FRAGMENT() == null 
		|| ctx.QUOTED_STRING_FRAGMENT().size() == 0) {
		} else {
			Demo01.LOGGER.finest("KeywordValueWrapper bunchOfThese ctx.QUOTED_STRING_FRAGMENT().size(): " + ctx.QUOTED_STRING_FRAGMENT().size());
			for (TerminalNode t: ctx.QUOTED_STRING_FRAGMENT()) {
				kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
					));
			}
		}

		if (ctx.KEYWORD_VALUE() == null 
		|| ctx.KEYWORD_VALUE().size() == 0) {
		} else {
			Demo01.LOGGER.finest("KeywordValueWrapper bunchOfThese ctx.KEYWORD_VALUE().size(): " + ctx.KEYWORD_VALUE().size());
			for (TerminalNode t: ctx.KEYWORD_VALUE()) {
				kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
				));
			}
		}

		if (ctx.SYMBOLIC() == null 
		|| ctx.SYMBOLIC().size() == 0) {
		} else {
			Demo01.LOGGER.finest("KeywordValueWrapper bunchOfThese ctx.SYMBOLIC().size(): " + ctx.SYMBOLIC().size());
			for (TerminalNode t: ctx.SYMBOLIC()) {
				kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
				));
			}
		}

		return kvw;
	}

	public KeywordValueWrapper(String value, int line, int posn) {
		this.value = value;
		this.line = line;
		this.posn = posn;
	}

	public String getValue() {
		return this.value;
	}

	public int getLine() {
		return this.line;
	}

	public int getPosn() {
		return this.posn;
	}

	public long getSortKey() {
		return ((long)this.line * (long)Integer.MAX_VALUE) + this.posn;
	}
}
