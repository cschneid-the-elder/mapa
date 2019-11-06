
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class Job {

	private String myName = null;
	private JCLParser.JobCardContext jobCardCtx = null;
	private JCLParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<Proc> procs  = new ArrayList<>();
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private String fileName = null;

	public Job(JCLParser.JobCardContext ctx, String fileName) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
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

	public void resolveParmedIncludes() {
		Demo01.LOGGER.finest(myName + " resolveParmedIncludes " + this);
		for (IncludeStatement i: includes) {
			i.resolveParms(symbolics);
		}
		Demo01.LOGGER.finest(myName + " includes (after resolving): " + includes);

		Demo01.LOGGER.finest(myName + " resolveParmedIncludes resolving steps " + steps);
		for (JclStep s: steps) {
			s.resolveParmedIncludes(symbolics);
		}
	}

	public ArrayList<JclStep> stepsInNeedOfProc() {
		ArrayList<JclStep> stepsInNeed = new ArrayList<>();

		for (JclStep step: this.steps) {
			if (step.isExecProc()) {
				if (step.needsCatalogedProc()) {
					stepsInNeed.add(step);
				} else {
					stepsInNeed.addAll(step.getProc().stepsInNeedOfProc());
				} 
			}
		}

		return stepsInNeed;
	}

	public String toString() {
		return this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText() + " @ " + this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getLine() + " in " + this.fileName;
	}
}

