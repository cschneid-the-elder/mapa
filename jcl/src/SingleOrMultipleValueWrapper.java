
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents the parser construct singleOrMultipleValue, which
is intended to accomodate a wide range of JCL statement parameter values...

<p><ul>
<li><code>PARM=VAL</code>
<li><code>PARM=(VAL)</code>
<li><code>PARM=(VAL,VAL,VAL)</code>
<li><code>PARM=((VAL,VAL),VAL)</code>
<li><code>PARM=(VAL,(VAL,VAL))</code>
<li><code>PARM=(,(,VAL))</code>
<li><code>PARM=A=B</code>
<li><code>PARM=(VAL,A=B)</code>
<li><code>PARM=(VAL,,A=B)</code>
<li><code>PARM=(,,,A=B)</code>
<li><code>PARM=(,VAL,,A=B)</code>
</ul><p>

*/
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
	<code>DISP</code>, <code>UNIT</code>, <code>VOL</code>, et. al.  It contains 
	commas and parentheses which
	are used to delineate the various values any of which may be missing.
	Without this list, determining the difference between <code>DISP=(&D)</code> and
	<code>DISP=(,&D)</code> would be difficult if <code>&D</code> remains unresolved.
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

		//TODO add this.eew
		
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

	/**
	Classes implementing wrappers for DD statement parameters can use
	this method to retrieve an ordered collection of parameter strings 
	which can be used to create meaningful data structures.
	*/
	public ArrayList<ParameterString> getParameterStrings() {
		return this.parameterStrings;
	}

	public String toString() {
		return this.myName + " procName = |" + this.procName + "| kosw = |" + this.kosw + "|";
	}
}
