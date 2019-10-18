
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class JobCardWrapper {

	private JCLParser.JobCardContext ctx = null;
	private JCLParser.JcllibStatementContext jcllib = null;
	private ArrayList<KeywordOrSymbolicWrapper> kywdList = new ArrayList<>();
	private String fileName = null;

	public JobCardWrapper(JCLParser.JobCardContext ctx, String fileName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {

	}

	public void addJcllib(JCLParser.JcllibStatementContext ctx) {
		Demo01.LOGGER.finest("JobCardWrapper addJcllib: " + this.ctx.jobName().NAME_FIELD().getSymbol().getText());
		List<JCLParser.KeywordOrSymbolicContext> kywdCtxList = ctx.singleOrMultipleValue().keywordOrSymbolic();
		Demo01.LOGGER.finest("JobCardWrapper addJcllib ctx.singleOrMultipleValue().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().keywordOrSymbolic());

		this.jcllib = ctx;
		if (kywdCtxList == null || kywdCtxList.size() == 0) {
			kywdCtxList = ctx.singleOrMultipleValue().parenList().keywordOrSymbolic();
			Demo01.LOGGER.finest("JobCardWrapper addJcllib ctx.singleOrMultipleValue().parenList().keywordOrSymbolic(): " + ctx.singleOrMultipleValue().parenList().keywordOrSymbolic());
		}

		for (JCLParser.KeywordOrSymbolicContext k: kywdCtxList) {
			Demo01.LOGGER.finest("JobCardWrapper addJcllib kywdCtxList k: " + k);
			Demo01.LOGGER.finest("JobCardWrapper addJcllib kywdCtxList k.KEYWORD_VALUE(): " + k.KEYWORD_VALUE());
			Demo01.LOGGER.finest("JobCardWrapper addJcllib kywdCtxList k.SYMBOLIC(): " + k.SYMBOLIC());
			Demo01.LOGGER.finest("JobCardWrapper addJcllib kywdCtxList k.QUOTED_STRING_FRAGMENT(): " + k.QUOTED_STRING_FRAGMENT());
			for (TerminalNode t: k.KEYWORD_VALUE()) {
				Demo01.LOGGER.finest("JobCardWrapper addJcllib kywdCtxList KEYWORD_VALUE() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.SYMBOLIC()) {
				Demo01.LOGGER.finest("JobCardWrapper addJcllib kywdCtxList SYMBOLIC() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
			for (TerminalNode t: k.QUOTED_STRING_FRAGMENT()) {
				Demo01.LOGGER.finest("JobCardWrapper addJcllib kywdCtxList QUOTED_STRING_FRAGMENT() t.getSymbol().getText(): " + t.getSymbol().getText());
			}
		}

		this.kywdList.addAll(KeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList));
	}

	public String toString() {
		return this.ctx.jobName().NAME_FIELD().getSymbol().getText() + " @ " + this.ctx.jobName().NAME_FIELD().getSymbol().getLine() + " in " + this.fileName;
	}
}
