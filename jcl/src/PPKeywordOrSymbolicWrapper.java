
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**

This may be confusing.  A KeywordOrSymbolicContext instance contains zero
or more collections of each of three flavors of TerminalNode instances.

Each of those TerminalNode instances has attributes we store in an instance
of PPKeywordValueWrapper.

All of these TerminalNode instances combined are what we think of as the
"value" of this instance of PPKeywordOrSymbolicWrapper.

The original JCL may look like...

//STEPNAME EXEC PGM=A&B&C.D&E.FG

...where the values of &B, &C, and &E are set elsewhere.  In this case we
will have an ArrayList called kvw containing instances of PPKeywordValueWrapper
whose values are...

A
&B
&C
.
D
&E
.
F
G

...which facilitates substituting the values for &B, &C, and &E and then
assembling the intended value for the PGM= parameter of the EXEC statement.

There are rules governing the substitution.  Values assigned or nullified
on SET statements are overridden by values assigned or nullified on EXEC
or PROC statements.  See the IBM documentation for the SET statement for
examples.

*/
public class PPKeywordOrSymbolicWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLPPParser.KeywordOrSymbolicContext ctx = null;
	private ArrayList<PPKeywordValueWrapper> kvw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;
	private Boolean parameterized = null;

	public static ArrayList<PPKeywordOrSymbolicWrapper> bunchOfThese(
			List<JCLPPParser.KeywordOrSymbolicContext> ctxList
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<PPKeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLPPParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new PPKeywordOrSymbolicWrapper(k, null, LOGGER, CLI));
		}

		LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	public static ArrayList<PPKeywordOrSymbolicWrapper> bunchOfThese(
			List<JCLPPParser.KeywordOrSymbolicContext> ctxList
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<PPKeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLPPParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new PPKeywordOrSymbolicWrapper(k, procName, LOGGER, CLI));
		}

		LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	public PPKeywordOrSymbolicWrapper(
			JCLPPParser.KeywordOrSymbolicContext ctx
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
		this.kvw.addAll(PPKeywordValueWrapper.bunchOfThese(this.ctx, this.procName, this.LOGGER, this.CLI));

		if (this.ctx.SYMBOLIC() == null 
		|| this.ctx.SYMBOLIC().size() == 0) {
			this.parameterized = false;
		} else {
			this.parameterized = true;
		}

		this.LOGGER.finest(this.getClass().getName() + " kvw:");
		for (PPKeywordValueWrapper k: this.kvw) {
			this.LOGGER.finest(k.toString());

		}
		kvw.sort(Comparator.comparingLong(PPKeywordValueWrapper::getSortKey));
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		this.LOGGER.fine(myName + " resolveParms this = |" + this + "| sets = |" + sets + "|");

		if (this.parameterized) {
			this.LOGGER.finer(myName + " parameterized == true  - continuing");
		} else {
			this.LOGGER.finer(myName + " parameterized == false - exiting");
			return;
		}

		for(PPKeywordValueWrapper k: this.kvw) {
			k.resolve(sets);
		}

	}

	public String getValue() {
		StringBuffer buf = new StringBuffer();

		for (PPKeywordValueWrapper k: this.kvw) {
			buf.append(k.getValue());
		}

		return buf.toString();
	}

	public Boolean isResolved() {
		Boolean b = true;

		for (PPKeywordValueWrapper k: this.kvw) {
			b = b && k.isResolved();
			if (!b) break;
		}

		return b;
	}

	public Boolean isParameterized() {
		return this.parameterized;
	}

	public ArrayList<PPSymbolic> collectSymbolics() {

		PPKeywordValueWrapper[] symbolic_kvw = 
			kvw.stream()
			.filter(k -> k.getType() == KeywordValueType.SYMBOLIC && k.isResolved())
			.toArray(PPKeywordValueWrapper[]::new);

		ArrayList<PPSymbolic> sym = new ArrayList<>();
		for (PPKeywordValueWrapper k: symbolic_kvw) {
			sym.add(k.getSymbolic());
		}

		return sym;
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();
		PPKeywordValueWrapper prev = null;

		for (PPKeywordValueWrapper k: this.kvw) {
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

	public String toString() {
		StringBuffer buf = new StringBuffer();

		for (PPKeywordValueWrapper k: this.kvw) {
			buf.append(k.getValue());
		}

		buf.append(" procName: |" + this.procName + "| inProc: |" + this.inProc + "|");

		return buf.toString();
	}
}
