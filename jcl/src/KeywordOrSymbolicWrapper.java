
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**

This may be confusing.  A KeywordOrSymbolicContext instance contains zero
or more collections of each of three flavors of TerminalNode instances.

Each of those TerminalNode instances has attributes we store in an instance
of KeywordValueWrapper.

All of these TerminalNode instances combined are what we think of as the
"value" of this instance of KeywordOrSymbolicWrapper.

The original JCL may look like...

//STEPNAME EXEC PGM=A&B&C.D&E.FG

...where the values of &B, &C, and &E are set elsewhere.  In this case we
will have an ArrayList called kvw containing instances of KeywordValueWrapper
whose values are...

A
&B
&C
.
D
&E
.
F
G

...which facilitates substituting the values for &B, &C, and &E and then
assembling the intended value for the PGM= parameter of the EXEC statement.

There are rules governing the substitution.  Values assigned or nullified
on SET statements are overridden by values assigned or nullified on EXEC
or PROC statements.  See the IBM documentation for the SET statement for
examples.

*/
public class KeywordOrSymbolicWrapper {

	private JCLParser.KeywordOrSymbolicContext ctx = null;
	private ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;
	private Boolean parameterized = null;

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
			for (TerminalNode t: this.ctx.QUOTED_STRING_FRAGMENT()) {
				this.kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
					));
			}
		}

		if (this.ctx.KEYWORD_VALUE() == null 
		|| this.ctx.KEYWORD_VALUE().size() == 0) {
		} else {
			for (TerminalNode t: this.ctx.KEYWORD_VALUE()) {
				this.kvw.add(
					new KeywordValueWrapper(
						t.getSymbol().getText()
						, t.getSymbol().getLine()
						, t.getSymbol().getCharPositionInLine()
				));
			}
		}

		if (this.ctx.SYMBOLIC() == null 
		|| this.ctx.SYMBOLIC().size() == 0) {
			this.parameterized = false;
		} else {
			this.parameterized = true;
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

	public String getValue() {
		String aString = new String();

		for (KeywordValueWrapper k: this.kvw) {
			aString = aString.concat(k.getValue());
		}

		return aString;
	}

	public String toString() {
		String aString = new String();

		for (KeywordValueWrapper k: this.kvw) {
			aString = aString.concat(k.getValue());
		}

		return aString;
	}
}
