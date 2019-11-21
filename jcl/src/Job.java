
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class Job {

	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLParser.JobCardContext jobCardCtx = null;
	private JCLParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<Proc> procs  = new ArrayList<>();
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private String fileName = null;
	private int startLine = -1;
	private int endLine = -1;

	public Job(JCLParser.JobCardContext ctx, String fileName) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.startLine = this.jobCardCtx.JOB().getSymbol().getLine();
	}

	public void addJcllib(JCLParser.JcllibStatementContext ctx) {
		Demo01.LOGGER.finest(myName + " addJcllib: " + this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText());
		List<JCLParser.KeywordOrSymbolicContext> kywdCtxList = ctx.singleOrMultipleValue().keywordOrSymbolic();
		Demo01.LOGGER.finest(myName + " addJcllib ctx.singleOrMultipleValue().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().keywordOrSymbolic());

		this.jcllibCtx = ctx;
		if (kywdCtxList == null || kywdCtxList.size() == 0) {
			kywdCtxList = ctx.singleOrMultipleValue().parenList().keywordOrSymbolic();
			Demo01.LOGGER.finest(myName + " addJcllib ctx.singleOrMultipleValue().parenList().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().parenList().keywordOrSymbolic());
		}

		for (JCLParser.KeywordOrSymbolicContext k: kywdCtxList) {
			Demo01.LOGGER.finest(myName + " addJcllib kywdCtxList k: " + k);
			Demo01.LOGGER.finest(myName + " addJcllib kywdCtxList k.KEYWORD_VALUE(): " + k.KEYWORD_VALUE());
			Demo01.LOGGER.finest(myName + " addJcllib kywdCtxList k.SYMBOLIC(): " + k.SYMBOLIC());
			Demo01.LOGGER.finest(myName + " addJcllib kywdCtxList k.QUOTED_STRING_FRAGMENT(): " + k.QUOTED_STRING_FRAGMENT());
			for (TerminalNode t: k.KEYWORD_VALUE()) {
				Demo01.LOGGER.finest(myName + " addJcllib kywdCtxList KEYWORD_VALUE() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.SYMBOLIC()) {
				Demo01.LOGGER.finest(myName + " addJcllib kywdCtxList SYMBOLIC() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.QUOTED_STRING_FRAGMENT()) {
				Demo01.LOGGER.finest(myName + " addJcllib kywdCtxList QUOTED_STRING_FRAGMENT() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
		}

		this.jcllib.addAll(KeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList));
	}

	public void setEndLine(int aLine) {
		this.endLine = aLine;
	}

	public void addInstreamProc(Proc iProc) {
		this.procs.add(iProc);
	}

	public void addSymbolic(SetSymbolValue symbolic) {
		this.symbolics.add(symbolic);
	}

	public void addInclude(IncludeStatement include) {
		this.includes.add(include);
	}

	public void addJclStep(JclStep step) {
		this.steps.add(step);
		if (step.isExecProc()) {
			for (Proc p: procs) {
				if (step.getProcExecuted().equals(p.getProcName())) {
					step.setProc(p);
					break;
				}
			}
		}
	}

	public void resolveParmedIncludes(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(myName + " resolveParmedIncludes " + this + " symbolics = |" + symbolics + "|");
		ArrayList<SetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
		mergedSymbolics.addAll(this.symbolics);

		for (IncludeStatement i: this.includes) {
			i.resolveParms(mergedSymbolics);
		}
		Demo01.LOGGER.finest(myName + " includes (after resolving): " + this.includes);

		Demo01.LOGGER.finest(myName + " resolveParmedIncludes resolving steps " + this.steps);
		for (JclStep s: this.steps) {
			s.resolveParmedIncludes(mergedSymbolics);
		}
	}

	public void resolveParms(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(myName + " resolveParms " + this + " symbolics = |" + symbolics + "|");


		for (JclStep step: this.steps) {
			ArrayList<SetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
			for (SetSymbolValue s: this.symbolics) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSymbolics.add(s);
				}
			}
			step.resolveParms(mergedSymbolics);
		}
	}

	public ArrayList<JclStep> stepsInNeedOfProc() {
		ArrayList<JclStep> stepsInNeed = new ArrayList<>();

		for (JclStep step: this.steps) {
			if (step.isExecProc()) {
				if (step.needsProc()) {
					stepsInNeed.add(step);
				} else {
					stepsInNeed.addAll(step.getProc().stepsInNeedOfProc());
				} 
			}
		}

		return stepsInNeed;
	}

	public Boolean lineIsInInstreamProc(int aLine) {
		Boolean b = false;

		for (Proc p: this.procs) {
			b = p.containsLine(aLine) && (p.getFileName().equals(this.fileName));
			if (b) break;
		}

		return b;
	}

	public Proc instreamProcThisLineIsIn(int aLine) {
		Proc aProc = null;

		for (Proc p: this.procs) {
			if (p.containsLine(aLine) && (p.getFileName().equals(this.fileName))) {
				aProc = p;
				break;
			}
		}

		return aProc;
	}

	public Boolean lineIsInThisJob(int aLine) {
		return ((aLine >= this.startLine) && (aLine <= this.endLine));
	}

	public IncludeStatement includeStatementAt(int aLine) {
		for (IncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		for (JclStep s: steps) {
			IncludeStatement i = s.includeStatementAt(aLine);
			if (i != null) return i;
		}
		return null;
	}

	public JclStep jclStepAt(int aLine) {
		for (JclStep j: steps) {
			if (j.getLine() == aLine) return j;
		}

		return null;
	}

	public String getFileName() {
		return this.fileName;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public ArrayList<JclStep> getSteps() {
		return this.steps;
	}

	public ArrayList<IncludeStatement> getAllIncludes() {
		ArrayList<IncludeStatement> i = new ArrayList<>(this.includes);

		for (JclStep s: steps) {
			i.addAll(s.getIncludes());
		}

		return i;
	}

	public ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (KeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
	}

	public String getJobName() {
		return this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText();
	}

	public String toString() {
		return this.getJobName() + " @ " + this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getLine() + " in " + this.fileName;
	}
}

