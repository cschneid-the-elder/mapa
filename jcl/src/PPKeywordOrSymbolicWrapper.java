
import java.util.*;
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

	private String myName = null;
	private JCLPPParser.KeywordOrSymbolicContext ctx = null;
	private ArrayList<PPKeywordValueWrapper> kvw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;
	private Boolean parameterized = null;

	public static ArrayList<PPKeywordOrSymbolicWrapper> bunchOfThese(List<JCLPPParser.KeywordOrSymbolicContext> ctxList) {
		ArrayList<PPKeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLPPParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new PPKeywordOrSymbolicWrapper(k, null));
		}

		Demo01.LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		Demo01.LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	public static ArrayList<PPKeywordOrSymbolicWrapper> bunchOfThese(List<JCLPPParser.KeywordOrSymbolicContext> ctxList, String procName) {
		ArrayList<PPKeywordOrSymbolicWrapper> kywdList = new ArrayList<>();

		for (JCLPPParser.KeywordOrSymbolicContext k: ctxList) {
			kywdList.add(new PPKeywordOrSymbolicWrapper(k, procName));
		}

		Demo01.LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		Demo01.LOGGER.finest("PPKeywordOrSymbolicWrapper bunchOfThese kywdList: " + kywdList);
		return kywdList;
	}

	public PPKeywordOrSymbolicWrapper(JCLPPParser.KeywordOrSymbolicContext ctx, String procName) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.kvw.addAll(PPKeywordValueWrapper.bunchOfThese(this.ctx));

		if (this.ctx.SYMBOLIC() == null 
		|| this.ctx.SYMBOLIC().size() == 0) {
			this.parameterized = false;
		} else {
			this.parameterized = true;
		}

		Demo01.LOGGER.finest(this.getClass().getName() + " kvw:");
		for (PPKeywordValueWrapper k: this.kvw) {
			Demo01.LOGGER.finest(k.toString());

		}
		kvw.sort(Comparator.comparingLong(PPKeywordValueWrapper::getSortKey));
	}

	public ArrayList<PPKeywordValueWrapper> resolvedParms() {
		Demo01.LOGGER.finer(myName + " resolvedParms");

		ArrayList<PPKeywordValueWrapper> kvw = new ArrayList<>();

		if (this.parameterized) {
			Demo01.LOGGER.finest(myName + " parameterized == true  - continuing");
		} else {
			Demo01.LOGGER.finest(myName + " parameterized == false - exiting");
			return kvw;
		}

		PPKeywordValueWrapper[] symbolic_kvw = 
			kvw.stream()
			.filter(k -> k.getType() == KeywordValueType.SYMBOLIC && k.isResolved())
			.toArray(PPKeywordValueWrapper[]::new);

		kvw.addAll(Arrays.asList(symbolic_kvw));
		return kvw;
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		Demo01.LOGGER.finer(myName + " resolveParms sets: " + sets);

		if (this.parameterized) {
			Demo01.LOGGER.finest(myName + " parameterized == true  - continuing");
		} else {
			Demo01.LOGGER.finest(myName + " parameterized == false - exiting");
			return;
		}

		Demo01.LOGGER.finest(myName + " resolveParms this: " + this);

		for(PPKeywordValueWrapper k: this.kvw) {
			k.resolve(sets);
		}

		/*
		PPKeywordValueWrapper[] symbolic_kvw = 
			kvw.stream()
			.filter(k -> k.getType() == KeywordValueType.SYMBOLIC)
			.toArray(PPKeywordValueWrapper[]::new);

		for(PPKeywordValueWrapper k: symbolic_kvw) {
			Demo01.LOGGER.finest(myName + " k: " + k);
			PPSetSymbolValue[] matching_sets =
				sets.stream()
				.filter(s -> s.getParmName().equals(k.getParmName()))
				.toArray(PPSetSymbolValue[]::new);
			for(PPSetSymbolValue s: matching_sets) {
				Demo01.LOGGER.finest(myName + " s: " + s);
				switch(s.getSetType()) {
					case SET:
						if ((this.inProc  
							&& !s.parmSetByExec(sets, this.procName) && !s.parmDefinedByProc(sets))
						|| (!this.inProc && !s.inProc && k.getLine() > s.getLine())
						) {
							k.setResolvedValue(s.getParmValue());
						}
						break;
					case PROC:
						if ((this.inProc && s.inProc && s.procName.equals(this.procName) 
							&& !s.parmSetByExec(sets, this.procName))
						) {
							k.setResolvedValue(s.getParmValue());
						}
						break;
					case EXEC:
						if (this.inProc) {
							k.setResolvedValue(s.getParmValue());
						}
						break;
					case SYS:
						k.setResolvedValue(s.getParmValue());
						break;
					default:
						break;
				}
			}
		}
		*/
	}
/*
	private Boolean parmSetByExec(ArrayList<PPSetSymbolValue> sets, PPSetSymbolValue v) {
		Boolean rc = false;

		for(PPSetSymbolValue s: sets) {
			if (s.getParmName().equals(v.getParmName())
			&& s.getSetType() == SetTypeOfSymbolValue.EXEC
			&& s.getProcBeingExecuted().equals(this.procName)
			&& s != v
			) {
				rc = true;
				break;
			}
		}

		return rc;
	}

	private Boolean parmDefinedByProc(ArrayList<PPSetSymbolValue> sets, PPSetSymbolValue v) {
		Boolean rc = false;

		for(PPSetSymbolValue s: sets) {
			if (s.getParmName().equals(v.getParmName())
			&& s.getSetType() == SetTypeOfSymbolValue.PROC
			&& s != v
			) {
				rc = true;
				break;
			}
		}

		return rc;
	}
*/
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
