
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class PPJob {

	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLPPParser.JobCardContext jobCardCtx = null;
	private JCLPPParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<PPKeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<PPProc> procs  = new ArrayList<>();
	private ArrayList<PPSetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<PPIncludeStatement> includes = new ArrayList<>();
	private ArrayList<PPJclStep> steps = new ArrayList<>();
	private String fileName = null;
	private String jobName = null;
	private int startLine = -1;
	private int endLine = -1;

	public PPJob(JCLPPParser.JobCardContext ctx, String fileName) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.initialize();
		Demo01.LOGGER.finer(this.myName + " " + this.jobName + " instantiated from " + this.fileName);
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.startLine = this.jobCardCtx.JOB().getSymbol().getLine();
		this.jobName = this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText();
	}

	public void addJcllib(JCLPPParser.JcllibStatementContext ctx) {
		Demo01.LOGGER.finest(this.myName + " addJcllib: " + this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText());
		List<JCLPPParser.KeywordOrSymbolicContext> kywdCtxList = ctx.singleOrMultipleValue().keywordOrSymbolic();
		Demo01.LOGGER.finest(this.myName + " addJcllib ctx.singleOrMultipleValue().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().keywordOrSymbolic());

		this.jcllibCtx = ctx;
		if (kywdCtxList == null || kywdCtxList.size() == 0) {
			kywdCtxList = ctx.singleOrMultipleValue().parenList().keywordOrSymbolic();
			Demo01.LOGGER.finest(this.myName + " addJcllib ctx.singleOrMultipleValue().parenList().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().parenList().keywordOrSymbolic());
		}

		for (JCLPPParser.KeywordOrSymbolicContext k: kywdCtxList) {
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k: " + k);
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k.KEYWORD_VALUE(): " + k.KEYWORD_VALUE());
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k.SYMBOLIC(): " + k.SYMBOLIC());
			Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList k.QUOTED_STRING_FRAGMENT(): " + k.QUOTED_STRING_FRAGMENT());
			for (TerminalNode t: k.KEYWORD_VALUE()) {
				Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList KEYWORD_VALUE() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.SYMBOLIC()) {
				Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList SYMBOLIC() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.QUOTED_STRING_FRAGMENT()) {
				Demo01.LOGGER.finest(this.myName + " addJcllib kywdCtxList QUOTED_STRING_FRAGMENT() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
		}

		this.jcllib.addAll(PPKeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList));
	}

	public void setEndLine(int aLine) {
		this.endLine = aLine;
	}

	public void addInstreamProc(PPProc iProc) {
		this.procs.add(iProc);
	}

	public void addSymbolic(PPSetSymbolValue symbolic) {
		this.symbolics.add(symbolic);
	}

	public void addInclude(PPIncludeStatement include) {
		this.includes.add(include);
	}

	public void addJclStep(PPJclStep step) {
		this.steps.add(step);
		if (step.isExecProc()) {
			for (PPProc p: procs) {
				if (step.getProcExecuted().equals(p.getProcName())) {
					step.setProc(p);
					break;
				}
			}
		}
	}

	public void resolveParmedIncludes(ArrayList<PPSetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(this.myName + " resolveParmedIncludes " + this + " symbolics = |" + symbolics + "|");
		ArrayList<PPSetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
		mergedSymbolics.addAll(this.symbolics);

		for (PPIncludeStatement i: this.includes) {
			i.resolveParms(mergedSymbolics);
		}
		Demo01.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);

	}

	public void resolveParms(ArrayList<PPSetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(this.myName + " resolveParms " + this + " symbolics = |" + symbolics + "|");


		for (PPJclStep step: this.steps) {
			ArrayList<PPSetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
			for (PPSetSymbolValue s: this.symbolics) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSymbolics.add(s);
				}
			}
			step.resolveParms(mergedSymbolics);
		}
	}

	public ArrayList<PPJclStep> stepsInNeedOfProc() {
		ArrayList<PPJclStep> stepsInNeed = new ArrayList<>();

		for (PPJclStep step: this.steps) {
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

		for (PPProc p: this.procs) {
			b = p.containsLine(aLine) && (p.getFileName().equals(this.fileName));
			if (b) break;
		}

		return b;
	}

	public PPProc instreamProcThisLineIsIn(int aLine) {
		PPProc aProc = null;

		for (PPProc p: this.procs) {
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

	public PPIncludeStatement includeStatementAt(int aLine) {
		for (PPIncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public PPJclStep jclStepAt(int aLine) {
		for (PPJclStep j: steps) {
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

	public String getJobName() {
		return this.jobName;
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public ArrayList<PPJclStep> getSteps() {
		return this.steps;
	}

	public ArrayList<PPIncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public ArrayList<PPIncludeStatement> getAllUnresolvedIncludes() {
		PPIncludeStatement[] unresolved_includes = 
				this.getAllIncludes().stream()
				.filter(i -> !i.isResolved())
				.toArray(PPIncludeStatement[]::new);
		return new ArrayList<PPIncludeStatement>(Arrays.asList(unresolved_includes));
	}

	public ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (PPKeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
	}

	public String toString() {
		return this.getJobName() + " @ " + this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getLine() + " in " + this.fileName;
	}
}

