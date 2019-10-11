
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class KeywordOrSymbolicWrapper {

	private JCLParser.KeywordOrSymbolicContext ctx = null;
	private ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = false;

	public KeywordOrSymbolicWrapper(JCLParser.KeywordOrSymbolicContext ctx, String procName) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = (procName == null);
		this.initialize();
	}

	private void initialize() {

		if (this.ctx.QUOTED_STRING_FRAGMENT() == null 
		|| this.ctx.QUOTED_STRING_FRAGMENT().size() == 0) {
		} else {
			String theText = new String();
			for (TerminalNode t: this.ctx.QUOTED_STRING_FRAGMENT()) {
				theText = theText.concat(t.getSymbol().getText());
			}
			this.kvw.add(
				new KeywordValueWrapper(
					theText
					, this.ctx.QUOTED_STRING_FRAGMENT().get(0).getSymbol().getLine()
					, this.ctx.QUOTED_STRING_FRAGMENT().get(0).getSymbol().getCharPositionInLine()
				));
		}

		if (this.ctx.KEYWORD_VALUE() == null 
		|| this.ctx.KEYWORD_VALUE().size() == 0) {
		} else {
			String theText = new String();
			for (TerminalNode t: this.ctx.KEYWORD_VALUE()) {
				theText = theText.concat(t.getSymbol().getText());
			}
			this.kvw.add(
				new KeywordValueWrapper(
					theText
					, this.ctx.KEYWORD_VALUE().get(0).getSymbol().getLine()
					, this.ctx.KEYWORD_VALUE().get(0).getSymbol().getCharPositionInLine()
			));
		}

		if (this.ctx.SYMBOLIC() == null 
		|| this.ctx.SYMBOLIC().size() == 0) {
		} else {
			for (TerminalNode t: this.ctx.SYMBOLIC()) {
				this.kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
				));
			}
		}

		Demo01.LOGGER.finest(this.getClass().getName() + " kvw:");
		for (KeywordValueWrapper k: this.kvw) {
			Demo01.LOGGER.finest(
				"value = |" 
				+ k.getValue() 
				+ "| line = |"
				+ k.getLine()
				+ "| posn = |"
				+ k.getPosn()
				+ "| sortKey = |"
				+ k.getSortKey()
				+ "|"
			);

		}
		kvw.sort(Comparator.comparingLong(KeywordValueWrapper::getSortKey));
	}

	public void resolveText(ArrayList<SetSymbolValue> sets) {
		for(SetSymbolValue s: sets) {
			switch(s.getSetType()) {
				case SET:
					if (this.inProc && s.inProc && s.procName.equals(this.procName)) {
					}
					break;
			}
		}
	}

	public String toString() {
		String aString = new String();

		for (KeywordValueWrapper k: this.kvw) {
			aString = aString.concat(k.getValue());
			/*if (k.hasNext()) {
				aString = aString.concat(" + ");
			}*/
		}

		return aString;
	}
}
