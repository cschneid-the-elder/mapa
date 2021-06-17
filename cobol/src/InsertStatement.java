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
	private Integer targetLine = null;
	private ArrayList<String> src = new ArrayList<>();

	InsertStatement(
			CobolPreprocessorParser.CompilerDirectiveInsertContext ctx
			, Logger LOGGER
			) {
		this.LOGGER = LOGGER;
		this.ctx = ctx;
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
		this.targetLine = new Integer(this.ctx.NUMERICLITERAL().getText());
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

	public Integer getTargetLine() {
		return this.targetLine;
	}

	public Boolean appliesTo(Integer lineNb) {
		return (this.targetLine.compareTo(lineNb) == 0);
	}

	public void addSrc(String srcLine) {
		this.src.add(srcLine);
	}

	public ArrayList<String> getSrc() {
		return this.src;
	}

}
