
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a generic JCL statement whose primary purpose is
assisting in symbolic substitution during preprocessing.
*/

public class PPOp {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private String myType = null;
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
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.JobCardContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.NotifyStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.OutputStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.ScheduleStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.JclCommandStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
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

	/**
	Using the collection of SetSymbolValue passed in, resolve the Symbolic
	values, then store the resolved value locally.

	<p>The unused PPJob is to differentiate this method from the illegal (so
	to speak) method of the same name using non-preprocessing types.  If javac
	didn't throw away the type of a collection before resolving methods then
	the unused PPJob reference wouldn't be necessary.
	*/
	public void resolveParms(ArrayList<PPSetSymbolValue> sets, PPJob unused) {
		this.LOGGER.finer(this.myName + " " + this.myType + " resolveParms");

		for (PPSymbolic s: this.symbolics.keySet()) {
			s.resolve(sets);
			this.symbolics.put(s, s.getResolvedText());
		}
	}

	/**
	Generate an error message, this method should not be used, and only
	exists to make javac happy with PPJob being generated from Job.

	<p>The unused Job is to differentiate this method from the illegal (so
	to speak) method of the same name using non-preprocessing types.  If javac
	didn't throw away the type of a collection before resolving methods then
	the unused Job reference wouldn't be necessary.
	*/
	public void resolveParms(ArrayList<SetSymbolValue> sets, Job unused) {
		this.LOGGER.severe(
			this.myName 
			+ " " 
			+ this.myType 
			+ " resolveParms should not be executed by instances of Job"
			);
	}

	/**
	Return the local collection of symbolics.

	<p>The unused PPJob is to differentiate this method from the illegal (so
	to speak) method of the same name using non-preprocessing types.  If javac
	didn't throw away the type of a collection before resolving methods then
	the unused PPJob reference wouldn't be necessary.
	*/
	public ArrayList<PPSymbolic> collectSymbolics(PPJob unused) {
		this.LOGGER.finer(this.myName + " " + this.myType + " collectSymbolics");

		return new ArrayList<>(this.symbolics.keySet());
	}

	/**
	Generate an error message, this method should not be used, and only
	exists to make javac happy with PPJob being generated from Job.

	<p>The unused Job is to differentiate this method from the illegal (so
	to speak) method of the same name using non-preprocessing types.  If javac
	didn't throw away the type of a collection before resolving methods then
	the unused Job reference wouldn't be necessary.
	*/
	public ArrayList<Symbolic> collectSymbolics(Job unused) {
		this.LOGGER.severe(
			this.myName 
			+ " " 
			+ this.myType 
			+ " collectSymbolics should not be executed by instances of Job"
			);

		return new ArrayList<Symbolic>();
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(
			this.myName 
			+ " type = |"
			+ this.myType
			+ " fileName = |" 
			+ this.fileName 
			+ "| procName = |" 
			+ this.procName 
			+ "| symbolics = |" 
			+ symbolics 
			+ "|"
			);

		return buf.toString();
	}

}
