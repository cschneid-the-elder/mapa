
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents the parser construct keywordOrSymbolic which encapsulates
a quoted string, a string, or a symbolic parameter.

<p>This may be confusing.  A KeywordOrSymbolicContext instance contains zero
or more collections of each of three flavors of TerminalNode instances.

<p>Each of those TerminalNode instances has attributes we store in an instance
of KeywordValueWrapper.

<p>All of these TerminalNode instances combined are what we think of as the
"value" of this instance of KeywordOrSymbolicWrapper.

<p>The original JCL may look like...

<code>//STEPNAME EXEC PGM=A&B&C.D&E.FG</code>

<p>...where the values of &B, &C, and &E are set elsewhere.  In this case we
will have an ArrayList called kvw containing instances of KeywordValueWrapper
whose values are...

<p><ul>
<li>A
<li>&B
<li>&C
<li>.
<li>D
<li>&E
<li>.
<li>F
<li>G
</ul>

<p>...which facilitates substituting the values for &B, &C, and &E and then
assembling the intended value for the PGM= parameter of the EXEC statement.

<p>There are rules governing the substitution.  Values assigned or nullified
on SET statements are overridden by values assigned or nullified on EXEC
or PROC statements.  See the IBM documentation for the SET statement for
examples.

*/
public class KeywordOrSymbolicWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.KeywordOrSymbolicContext ctx = null;
	private ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;
	private Boolean parameterized = null;

	public static ArrayList<KeywordOrSymbolicWrapper> bunchOfThese(
			List<JCLParser.KeywordOrSymbolicContext> ctxList
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<KeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new KeywordOrSymbolicWrapper(k, null, LOGGER, CLI));
		}

		LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	/**
	Factory method to return a bunch of instances of this class given 
	a List of KeywordOrSymbolicContext instances from which to instantiate 
	them.
	*/
	public static ArrayList<KeywordOrSymbolicWrapper> bunchOfThese(
			List<JCLParser.KeywordOrSymbolicContext> ctxList
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<KeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new KeywordOrSymbolicWrapper(k, procName, LOGGER, CLI));
		}

		LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	public KeywordOrSymbolicWrapper(
			JCLParser.KeywordOrSymbolicContext ctx
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		if (this.ctx == null) {
			StringBuffer sb = new StringBuffer();
			for (StackTraceElement ste: new Throwable().getStackTrace()) {
				sb.append(ste.toString());
				sb.append(System.getProperty("line.separator"));
			}
			this.LOGGER.finest(
				this.getClass().getName()
				+ " KeywordOrSymbolicContext supplied is null, arriving via..."
				+ System.getProperty("line.separator")
				+ sb.toString()
				);
		} else {
			this.initialize();
		}
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.kvw.addAll(KeywordValueWrapper.bunchOfThese(this.ctx, this.procName, this.LOGGER, this.CLI));

		if (this.ctx.SYMBOLIC() == null 
		|| this.ctx.SYMBOLIC().size() == 0) {
			this.parameterized = false;
		} else {
			this.parameterized = true;
		}

		this.LOGGER.finest(this.getClass().getName() + " kvw:");
		for (KeywordValueWrapper k: this.kvw) {
			this.LOGGER.finest(k.toString());

		}
		kvw.sort(Comparator.comparingLong(KeywordValueWrapper::getSortKey));
	}

	public ArrayList<KeywordValueWrapper> getKeywordValueWrappers() {
		return this.kvw;
	}

	public String getValue() {
		StringBuffer buf = new StringBuffer();

		for (KeywordValueWrapper k: this.kvw) {
			buf.append(k.getValue());
		}

		return buf.toString();
	}

	public Boolean isParameterized() {
		return this.parameterized;
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();
		KeywordValueWrapper prev = null;

		for (KeywordValueWrapper k: this.kvw) {
			if (prev != null && prev.isParm() && prev.isResolved() && k.getValue().equals(".")) {
				/*
					Given...

					SET B=2,D=4,F=6,H=8

					...a value of...

					A&B.C&D..E&F.G&H

					...should resolve to...

					A2C4.E6G8

					More generally, a dot "." following a symbolic is a delimiter
					and not part of the symbolic or what follows.
				*/
			} else {
				buf.append(k.getResolvedValue());
			}
			prev = k;
		}

		return buf.toString();
	}

	/**
	Return the sortKey of the first element of this instance's collection of
	KeywordValueWrappers.  The collection is a continuous set of values 
	from the JCL, so the sortKey of the first element is sufficient to task.
	*/
	public long getSortKey() {
		return this.kvw.get(0).getSortKey();
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();

		for (KeywordValueWrapper k: this.kvw) {
			buf.append(k.getValue());
		}

		buf.append(" procName: |" + this.procName + "| inProc: |" + this.inProc + "|");

		return buf.toString();
	}
}
