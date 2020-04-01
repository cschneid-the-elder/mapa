
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PPOp {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private HashMap<PPSymbolic, String> symbolics = new HashMap<>();
	private Boolean inProc = false;
	private String procName = null;

	public PPOp(
		JCLPPParser.CommandStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.JobCardContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.NotifyStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.OutputStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.ScheduleStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.JclCommandStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	private void initialize(
			String fileName
			, String procName
			, List<org.antlr.v4.runtime.tree.TerminalNode> tn
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.myName = this.getClass().getName();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		for (PPSymbolic s: PPSymbolic.bunchOfThese(tn, fileName, procName, LOGGER, CLI)) {
			symbolics.put(s, null);
		}
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets, PPJob unused) {
		for (PPSymbolic s: this.symbolics.keySet()) {
			s.resolve(sets);
			this.symbolics.put(s, s.getResolvedText());
		}
	}

	public void resolveParms(ArrayList<SetSymbolValue> sets, Job unused) {
		this.LOGGER.severe(this.myName + " resolveParms should not be executed by instances of Job");
	}

	public ArrayList<PPSymbolic> collectSymbolics(PPJob unused) {
		this.LOGGER.finest(this.myName + " collectSymbolics");

		return new ArrayList<>(this.symbolics.keySet());
	}

	public ArrayList<Symbolic> collectSymbolics(Job unused) {
		this.LOGGER.severe(this.myName + " collectSymbolics should not be executed by instances of Job");

		return new ArrayList<Symbolic>();
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(
			this.myName 
			+ " fileName: |" 
			+ this.fileName 
			+ "| procName: |" 
			+ this.procName 
			+ "| symbolics: |" 
			+ symbolics 
			+ "|"
			);

		return buf.toString();
	}

}
