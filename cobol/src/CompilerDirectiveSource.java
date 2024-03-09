
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerDirectiveSource {
	private String myName = this.getClass().getName();
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private CompilerDirectiveSourceContext ctx;

	public CompilerDirectiveSource(
			CompilerDirectiveSourceContext ctx
			, Logger LOGGER
			, TheCLI CLI) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public int getStartLine() {
		return this.ctx.start.getLine();
	}

	public Boolean isFixed() {
		return this.ctx.SOURCE_FORMAT_FIXED_DIRECTIVE_1() != null 
			|| this.ctx.SOURCE_FORMAT_FIXED_DIRECTIVE() != null;
	}
	
	public Boolean isFree() {
		return this.ctx.SOURCE_FORMAT_FREE_DIRECTIVE_1() != null 
			|| this.ctx.SOURCE_FORMAT_FREE_DIRECTIVE() != null;
	}
	
}

