
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PPopSymbolic {

	private String myName = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private KeywordOrSymbolicWrapper kywd = null;
	public Boolean inProc = false;
	public String procName = null;

	public PPopSymbolic(
		JCLPPParser.CommandStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		this.initialize();
	}

	public PPopSymbolic(
		JCLPPParser.JobCardContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		this.initialize();
	}

	public PPopSymbolic(
		JCLPPParser.NotifyStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		this.initialize();
	}

	public PPopSymbolic(
		JCLPPParser.OutputStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		this.initialize();
	}

	public PPopSymbolic(
		JCLPPParser.ScheduleStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		this.initialize();
	}

	public PPopSymbolic(
		JCLPPParser.JclCommandStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
	}

	public String getOriginalText() {
		if (this.originalText == null) {
			this.originalText = kywd.getValue();
		}

		return this.originalText;
	}

	public String getResolvedText() {
		return this.kywd.getResolvedValue();
	}

	public void resolveParms(ArrayList<SetSymbolValue> sets) {
		this.kywd.resolveParms(sets);
	}

	public Boolean isResolved() {
		return this.kywd.isResolved();
	}

	public Boolean isProbablyTheSame(IncludeStatement i) {
		return this.getOriginalText().equals(i.getOriginalText());
	}

	public String toString() {
		return 
			this.myName 
			+ " fileName: |" 
			+ this.fileName 
			+ "| line: |" 
			+ this.getLine() 
			+ "| posn: |" 
			+ this.getPosn() 
			+ "| originalText: |" 
			+ this.getOriginalText() 
			+ "| resolvedText: |"
			+ this.getResolvedText()
			+ "| inProc: |" 
			+ this.inProc + "|"
		;
	}

}
