
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class KeywordValueWrapper {

	private String value = null;
	private int line = -1;
	private int posn = -1;
	private KeywordValueType type = null;

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
						, KeywordValueType.QUOTED_STRING
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
						, KeywordValueType.UNQUOTED_STRING
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
						, KeywordValueType.SYMBOLIC
				));
			}
		}

		if (ctx.QS_AMPERSAND() == null 
		|| ctx.QS_AMPERSAND().size() == 0) {
		} else {
			Demo01.LOGGER.finest("KeywordValueWrapper bunchOfThese ctx.QS_AMPERSAND().size(): " + ctx.QS_AMPERSAND().size());
			for (TerminalNode t: ctx.QS_AMPERSAND()) {
				kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
						, KeywordValueType.AMPERSAND
				));
			}
		}

		if (ctx.QS_SQUOTE2() == null 
		|| ctx.QS_SQUOTE2().size() == 0) {
		} else {
			Demo01.LOGGER.finest("KeywordValueWrapper bunchOfThese ctx.QS_SQUOTE2().size(): " + ctx.QS_SQUOTE2().size());
			for (TerminalNode t: ctx.QS_SQUOTE2()) {
				kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
						, KeywordValueType.SINGLE_QUOTE
				));
			}
		}

		return kvw;
	}

	public KeywordValueWrapper(String value, int line, int posn, KeywordValueType type) {
		this.value = value;
		this.line = line;
		this.posn = posn;
		this.type = type;
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

	public KeywordValueType getType() {
		return this.type;
	}

	public Boolean isParm() {
		return this.type == KeywordValueType.SYMBOLIC;
	}

	public long getSortKey() {
		return ((long)this.line * (long)Integer.MAX_VALUE) + this.posn;
	}
}
