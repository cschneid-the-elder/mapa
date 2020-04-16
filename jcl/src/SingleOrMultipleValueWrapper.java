
import java.util.*;
import java.util.logging.*;

public class SingleOrMultipleValueWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.SingleOrMultipleValueContext ctx = null;
	private ArrayList<KeywordOrSymbolicWrapper> kosw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;

	public SingleOrMultipleValueWrapper(
			JCLParser.SingleOrMultipleValueContext ctx
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
		this.kosw.addAll(KeywordOrSymbolicWrapper.bunchOfThese(ctx.keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI));
		this.kosw.addAll(KeywordOrSymbolicWrapper.bunchOfThese(ctx.parenList().keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI));
	}

	public String toString() {
		return this.myName + " procName = |" + this.procName + "| kosw = |" + this.kosw + "|";
	}
}
