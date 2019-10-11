
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class IncludeStatement {

	private JCLParser.IncludeStatementContext ctx = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private KeywordOrSymbolicWrapper kywd = null;
	private int line = -1;  // 1 to n
	private int posn = -1;  // 0 to n-1
	public Boolean inProc = false;
	public String procName = null;

	public IncludeStatement(
		JCLParser.IncludeStatementContext ctx
		, String fileName
		, Boolean inProc
		, String procName
		) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = inProc;
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
	}

	private int getLine() {
		if (line == -1) {
			if (this.ctx.INCLUDE_PARM_MEMBER() == null) {
				Demo01.LOGGER.severe(
					this.getClass().getName() 
					+ "getLine() found " 
					+ this.ctx.getClass().getName() 
					+ "INCLUDE_PARM_MEMBER() == null"
				);
			} else {
				line = this.ctx.INCLUDE_PARM_MEMBER().getSymbol().getLine();
			}
		}

		return line;
	}

	private int getPosn() {
		if (posn == -1) {
			if (this.ctx.EQUAL() == null) {
				Demo01.LOGGER.severe(
					this.getClass().getName() 
					+ "getPosn() found " 
					+ this.ctx.getClass().getName() 
					+ "EQUAL() == null"
				);
			} else {
				posn = this.ctx.EQUAL().getSymbol().getCharPositionInLine() + 1;
			}
		}

		return posn;
	}

	private String getOriginalText() {
		if (this.originalText == null) {
			this.originalText = kywd.toString();
		}

		return this.originalText;
	}

	public String toString() {
		return 
			this.ctx.getClass().getName() 
			+ " fileName: |" 
			+ this.fileName 
			+ "| line: |" 
			+ this.getLine() 
			+ "| posn: |" 
			+ this.getPosn() 
			+ "| text: |" 
			+ this.getOriginalText() 
			+ "| inProc: |" 
			+ this.inProc + "|"
		;
	}

}
