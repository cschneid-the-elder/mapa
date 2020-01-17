
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PPOp {

	private String myName = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private Hashtable<Symbolic, String> symbolics = new Hashtable<>();
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
		for (Symbolic s: Symbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
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
		for (Symbolic s: Symbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
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
		for (Symbolic s: Symbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
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
		for (Symbolic s: Symbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
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
		for (Symbolic s: Symbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
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
		for (Symbolic s: Symbolic.bunchOfThese(ctx.SYMBOLIC(), fileName, procName)) {
			symbolics.put(s, null);
		}
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		for (Symbolic s: this.symbolics.keySet()) {
			s.resolve(sets);
			this.symbolics.put(s, s.getResolvedText());
		}
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(this.myName + " fileName: |" + this.fileName + "| procName: |" + this.procName + "| symbolics: |" + symbolics + "|");

		/*for (Symbolic s: this.symbolics.keySet()) {
			buf.append(
				"| symbolic: |"
				+ s.getText() 
				+ "| line: |" 
				+ s.getLine() 
				+ "| posn: |" 
				+ s.getPosn()
				+ "|"
			);
		}*/

		return buf.toString();
	}

}
