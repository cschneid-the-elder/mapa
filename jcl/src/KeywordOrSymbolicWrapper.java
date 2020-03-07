
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**

This may be confusing.  A KeywordOrSymbolicContext instance contains zero
or more collections of each of three flavors of TerminalNode instances.

Each of those TerminalNode instances has attributes we store in an instance
of KeywordValueWrapper.

All of these TerminalNode instances combined are what we think of as the
"value" of this instance of KeywordOrSymbolicWrapper.

The original JCL may look like...

//STEPNAME EXEC PGM=A&B&C.D&E.FG

...where the values of &B, &C, and &E are set elsewhere.  In this case we
will have an ArrayList called kvw containing instances of KeywordValueWrapper
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
public class KeywordOrSymbolicWrapper {

	private String myName = null;
	private JCLParser.KeywordOrSymbolicContext ctx = null;
	private ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;
	private Boolean parameterized = null;

	public static ArrayList<KeywordOrSymbolicWrapper> bunchOfThese(List<JCLParser.KeywordOrSymbolicContext> ctxList) {
		ArrayList<KeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new KeywordOrSymbolicWrapper(k, null));
		}

		Demo01.LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		Demo01.LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	public static ArrayList<KeywordOrSymbolicWrapper> bunchOfThese(List<JCLParser.KeywordOrSymbolicContext> ctxList, String procName) {
		ArrayList<KeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new KeywordOrSymbolicWrapper(k, procName));
		}

		Demo01.LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		Demo01.LOGGER.finest("KeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	public KeywordOrSymbolicWrapper(JCLParser.KeywordOrSymbolicContext ctx, String procName) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.kvw.addAll(KeywordValueWrapper.bunchOfThese(this.ctx));

		if (this.ctx.SYMBOLIC() == null 
		|| this.ctx.SYMBOLIC().size() == 0) {
			this.parameterized = false;
		} else {
			this.parameterized = true;
		}

		Demo01.LOGGER.finest(this.getClass().getName() + " kvw:");
		for (KeywordValueWrapper k: this.kvw) {
			Demo01.LOGGER.finest(k.toString());

		}
		kvw.sort(Comparator.comparingLong(KeywordValueWrapper::getSortKey));
	}

	public ArrayList<KeywordValueWrapper> resolvedParms() {
		Demo01.LOGGER.finer(myName + " resolvedParms");

		ArrayList<KeywordValueWrapper> kvw = new ArrayList<>();

		if (this.parameterized) {
			Demo01.LOGGER.finest(myName + " parameterized == true  - continuing");
		} else {
			Demo01.LOGGER.finest(myName + " parameterized == false - exiting");
			return kvw;
		}

		KeywordValueWrapper[] symbolic_kvw = 
			kvw.stream()
			.filter(k -> k.getType() == KeywordValueType.SYMBOLIC && k.isResolved())
			.toArray(KeywordValueWrapper[]::new);

		kvw.addAll(Arrays.asList(symbolic_kvw));
		return kvw;
	}

	public void resolveParms(ArrayList<SetSymbolValue> sets) {
		Demo01.LOGGER.finer(myName + " resolveParms sets: " + sets);

		if (this.parameterized) {
			Demo01.LOGGER.finest(myName + " parameterized == true  - continuing");
		} else {
			Demo01.LOGGER.finest(myName + " parameterized == false - exiting");
			return;
		}

		Demo01.LOGGER.finest(myName + " resolveParms this: " + this);

		for(KeywordValueWrapper k: this.kvw) {
			k.resolve(sets);
		}

	}

	public String getValue() {
		StringBuffer buf = new StringBuffer();

		for (KeywordValueWrapper k: this.kvw) {
			buf.append(k.getValue());
		}

		return buf.toString();
	}

	public Boolean isResolved() {
		Boolean b = true;

		for (KeywordValueWrapper k: this.kvw) {
			b = b && k.isResolved();
			if (!b) break;
		}

		return b;
	}

	public Boolean isParameterized() {
		return this.parameterized;
	}

	public ArrayList<Symbolic> collectSymbolics() {

		KeywordValueWrapper[] symbolic_kvw = 
			kvw.stream()
			.filter(k -> k.getType() == KeywordValueType.SYMBOLIC && k.isResolved())
			.toArray(KeywordValueWrapper[]::new);

		ArrayList<Symbolic> sym = new ArrayList<>();
		for (KeywordValueWrapper k: symbolic_kvw) {
			sym.add(k.getSymbolic());
		}

		return sym;
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

	public String toString() {
		StringBuffer buf = new StringBuffer();

		for (KeywordValueWrapper k: this.kvw) {
			buf.append(k.getValue());
		}

		buf.append(" procName: |" + this.procName + "| inProc: |" + this.inProc + "|");

		return buf.toString();
	}
}
