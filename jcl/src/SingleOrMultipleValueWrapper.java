
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SingleOrMultipleValueWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.SingleOrMultipleValueContext ctx = null;
	private ArrayList<KeywordOrSymbolicWrapper> kosw = new ArrayList<>();
	private ArrayList<EmbeddedEqualityWrapper> eew = new ArrayList<>();
	/**
	The ParameterString ArrayList in SingleOrMultipleValueWrapper is intended to
	assist in understanding JCL parameters with multiple values, e.g.
	DISP, UNIT, VOL, et. al.  It contains commas and parentheses which
	are used to delineate the various values any of which may be missing.
	Without this list, determining the difference betwee DISP=(&D) and
	DISP=(,&D) would be difficult if &D remains unresolved.
	*/
	private ArrayList<ParameterString> parameterStrings = new ArrayList<>();
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

		this.kosw.addAll(
			KeywordOrSymbolicWrapper.bunchOfThese(
				ctx.keywordOrSymbolic()
				, this.procName
				, this.LOGGER
				, this.CLI
			)
		);

		for (JCLParser.ParenListContext p: this.ctx.parenList()) {
			this.kosw.addAll(
				KeywordOrSymbolicWrapper.bunchOfThese(
					p.keywordOrSymbolic()
					, this.procName
					, this.LOGGER
					, this.CLI
				)
			);
		}

		this.eew.addAll(
			EmbeddedEqualityWrapper.bunchOfThese(
				this.ctx.embeddedEquality()
				, this.procName
				,  this.LOGGER
				, this.CLI
			)
		);

		this.buildParameterStrings();
	}

	private void buildParameterStrings() {
		for (KeywordOrSymbolicWrapper k: this.kosw) {
			this.parameterStrings.add(
				new ParameterString(
					k.getResolvedValue()
					, k.getSortKey()
					, this.LOGGER
					, this.CLI
				)
			);
		}

		this.addTerminalNodesToParameterStrings(this.ctx.COMMA());
		this.addTerminalNodesToParameterStrings(this.ctx.LPAREN());
		this.addTerminalNodesToParameterStrings(this.ctx.RPAREN());

		for (JCLParser.ParenListContext p: this.ctx.parenList()) {
			for (TerminalNode t: p.COMMA()) {
				this.addTerminalNodeToParameterStrings(t);
			}
			this.addTerminalNodeToParameterStrings(p.LPAREN());
			this.addTerminalNodeToParameterStrings(p.RPAREN());
		}
		
		this.parameterStrings.sort(Comparator.comparingLong(ParameterString::getSortKey));
	}

	private void addTerminalNodesToParameterStrings(List<TerminalNode> lt) {
		this.LOGGER.finer(this.myName + " addTerminalNodesToParameterStrings()");

		for (TerminalNode t: lt) {
			this.addTerminalNodeToParameterStrings(t);
		}
	}

	private void addTerminalNodeToParameterStrings(TerminalNode t) {
		this.LOGGER.finer(this.myName + " addTerminalNodeToParameterStrings()");

		this.parameterStrings.add(
			new ParameterString(
				t
				, this.LOGGER
				, this.CLI
			)
		);
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();

		for (KeywordOrSymbolicWrapper k: this.kosw) {
			buf.append(k.getResolvedValue());
			buf.append(" ");
		}

		return buf.toString();
	}

	public ArrayList<ParameterString> getParameterStrings() {
		return this.parameterStrings;
	}

	public String toString() {
		return this.myName + " procName = |" + this.procName + "| kosw = |" + this.kosw + "|";
	}
}
