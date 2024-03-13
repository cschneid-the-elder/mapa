
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerDirectiveSource {
	private String myName = this.getClass().getName();
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private CobolPreprocessorParser.CompilerDirectiveSourceContext ctx;
	private int startLine = -1;
	private int lastLine = Integer.MAX_VALUE;

	public CompilerDirectiveSource(
			CobolPreprocessorParser.CompilerDirectiveSourceContext ctx
			, Logger LOGGER
			, TheCLI CLI) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.startLine = this.ctx.start.getLine();
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getLastLine() {
		return this.lastLine;
	}
	
	public void setLastLine(int lastLine) {
		this.lastLine = lastLine;
	}
	
	public Boolean isFixed() {
		return this.ctx.SOURCE_FORMAT_FIXED_DIRECTIVE_1() != null 
			|| this.ctx.SOURCE_FORMAT_FIXED_DIRECTIVE() != null;
	}
	
	public Boolean isFree() {
		return this.ctx.SOURCE_FORMAT_FREE_DIRECTIVE_1() != null 
			|| this.ctx.SOURCE_FORMAT_FREE_DIRECTIVE() != null;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.myName);
		if (this.isFixed()) {
			sb.append(" fixed ");
		} else {
			sb.append(" free ");
		}
		sb.append(this.getStartLine());
		sb.append(" - ");
		sb.append(this.getLastLine());
		return sb.toString();
	}
}

