import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerOptionsWrapper {

	private String myName = this.getClass().getName();
	public ParserRuleContext ctx = null;
	public CobolPreprocessorParser.CompilerOptionsContext coCtx = null;

	CompilerOptionsWrapper(CobolPreprocessorParser.CompilerOptionsContext ctx) {
		this.coCtx = ctx;
	}

	public int line() {
		if (this.coCtx.PROCESS() == null) {
			return this.coCtx.CBL().getSymbol().getLine();
		} else {
			return this.coCtx.PROCESS().getSymbol().getLine();
		}
	}
}
