
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PPOp {

	private String myName = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private Hashtable<PPSymbolic, String> symbolics = new Hashtable<>();
	private Boolean inProc = false;
	private String procName = null;

	public PPOp(
		JCLPPParser.CommandStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		for (PPSymbolic s: PPSymbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
			symbolics.put(s, null);
		}
		this.initialize();
	}

	public PPOp(
		JCLPPParser.JobCardContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		for (PPSymbolic s: PPSymbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
			symbolics.put(s, null);
		}
		this.initialize();
	}

	public PPOp(
		JCLPPParser.NotifyStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		for (PPSymbolic s: PPSymbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
			symbolics.put(s, null);
		}
		this.initialize();
	}

	public PPOp(
		JCLPPParser.OutputStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		for (PPSymbolic s: PPSymbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
			symbolics.put(s, null);
		}
		this.initialize();
	}

	public PPOp(
		JCLPPParser.ScheduleStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		for (PPSymbolic s: PPSymbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
			symbolics.put(s, null);
		}
		this.initialize();
	}

	public PPOp(
		JCLPPParser.JclCommandStatementContext ctx
		, String fileName
		, String procName
		) {
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		for (PPSymbolic s: PPSymbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
			symbolics.put(s, null);
		}
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		for (PPSymbolic s: this.symbolics.keySet()) {
			s.resolve(sets);
			this.symbolics.put(s, s.getResolvedText());
		}
	}

	public ArrayList<PPSymbolic> collectSymbolics() {
		Demo01.LOGGER.finest(this.myName + " collectSymbolics");

		return new ArrayList<>(this.symbolics.keySet());
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
