import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class InsertStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	private Logger LOGGER = null;
	private CobolPreprocessorParser.CompilerDirectiveInsertContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_INSERT;
	private int startLine = -1;
	private int endLine = -1;
	private int targetLine = -1;
	private ArrayList<String> src = new ArrayList<>();

	InsertStatement(
			CobolPreprocessorParser.CompilerDirectiveInsertContext ctx
			, Logger LOGGER
			) {
		this.LOGGER = LOGGER;
		this.ctx = ctx;
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
		Integer i = new Integer(this.ctx.NUMERICLITERAL().getText());
		this.targetLine = i.intValue();
	}

	public int getLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	public int getTargetLine() {
		return this.targetLine;
	}

	public void addSrc(String srcLine) {
		this.src.add(srcLine);
	}

	public ArrayList<String> getSrc() {
		return this.src;
	}

}
