
import java.util.*;
import java.util.logging.*;

public class EmbeddedEqualityWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.EmbeddedEqualityContext ctx = null;
	private KeywordOrSymbolicWrapper kywd = null;
	private SingleOrMultipleValueWrapper val = null;
	private String procName = null;
	private Boolean inProc = null;

	public static ArrayList<EmbeddedEqualityWrapper> bunchOfThese(
			List<JCLParser.EmbeddedEqualityContext> ctxList
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<EmbeddedEqualityWrapper> eewList = new ArrayList<>();

		for (JCLParser.EmbeddedEqualityContext e: ctxList) {
			eewList.add(new EmbeddedEqualityWrapper(e, procName, LOGGER, CLI));
		}

		LOGGER.finest("EmbeddedEqualityWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		LOGGER.finest("EmbeddedEqualityWrapper bunchOfThese eewList: " + eewList);
		return eewList;
	}

	public EmbeddedEqualityWrapper(
			JCLParser.EmbeddedEqualityContext ctx
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI);
		this.val = new SingleOrMultipleValueWrapper(ctx.singleOrMultipleValue(), this.procName, this.LOGGER, this.CLI);
	}

	public String getResolvedKywd() {
		StringBuffer buf = new StringBuffer();

		buf.append(this.kywd.getResolvedValue());

		return buf.toString();
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();

		buf.append(this.val.getResolvedValue());

		return buf.toString();
	}

	public String toString() {
		return 
			this.myName 
			+ " procName = |" 
			+ this.procName 
			+ "| kywd = |" 
			+ this.kywd 
			+ "| val = |" 
			+ this.val 
			+ "|";
	}
}
