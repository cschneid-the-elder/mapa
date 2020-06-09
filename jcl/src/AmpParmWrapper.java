/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents the individual values of the AMP DD statement
parameter.
*/
public class AmpParmWrapper {

	private String myName = this.getClass().getName();
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private ArrayList<ParameterString> parameterStrings = new ArrayList<>();
	private String value = null;
	private String type = null;
	private Hashtable<String, String> traceParms = new Hashtable<>();

	public AmpParmWrapper(
			JCLDDAMPParser.AccbiasContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.ACCBIAS().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.AccbiasContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	private void initialize() {
		this.parameterStrings.sort(Comparator.comparingLong(ParameterString::getSortKey));
		StringBuffer sb = new StringBuffer();
		for (ParameterString ps: this.parameterStrings) {
			sb.append(ps.getValue());
		}
		this.value = sb.toString();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.AmorgContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.AMORG().getText();
		this.value = new String();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.BufndContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.BUFND().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.BufndContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.BufniContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.BUFNI().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.BufniContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.BufspContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.BUFSP().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.BufspContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.CropsContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.CROPS().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.CropsContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.FrlogContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.FRLOG().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.FrlogContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.MsgContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.MSG().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.MsgContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.OptcdContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.OPTCD().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.OptcdContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.RecfmContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.RECFM().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.RecfmContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.Rmode31Context ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.RMODE31().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.Rmode31Context ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.SmbdfrContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.SMBDFR().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.SmbdfrContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.SmbhwtContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.SMBHWT().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.SmbhwtContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.SmbvspContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.SMBVSP().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.SmbvspContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.SmbvspiContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.SMBVSPI().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.SmbvspiContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.StrnoContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.STRNO().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.StrnoContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.SynadContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.SYNAD().getText();
		this.initialize(ctx);
	}

	private void initialize(JCLDDAMPParser.SynadContext ctx) {
		this.parameterStrings.addAll(
				ParameterString.bunchOfThese(
					ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI)
		);
		this.initialize();
	}

	public AmpParmWrapper(
			JCLDDAMPParser.TraceContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.type = ctx.TRACE().getText();
		this.value = new String();

		for (JCLDDAMPParser.TraceParameterContext tpc: ctx.traceParameter()) {
			if (tpc.traceHook() != null) {
				this.initialize(tpc.traceHook());
			} else if (tpc.traceEcode() != null) {
				this.initialize(tpc.traceEcode());
			} else if (tpc.traceKey() != null) {
				this.initialize(tpc.traceKey());
			} else if (tpc.traceParm1() != null) {
				this.initialize(tpc.traceParm1());
			} else if (tpc.traceParm2() != null) {
				this.initialize(tpc.traceParm2());
			}
		}
	}

	private void initialize(JCLDDAMPParser.TraceHookContext ctx) {
		ArrayList<ParameterString> ps = new ArrayList<>();

		ps.addAll(ParameterString.bunchOfThese(ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI));
		ps.addAll(ParameterString.bunchOfThese(ctx.COMMA(), this.LOGGER, this.CLI));
		ps.add(new ParameterString(ctx.LPAREN(), this.LOGGER, this.CLI));
		ps.add(new ParameterString(ctx.RPAREN(), this.LOGGER, this.CLI));
		ps.sort(Comparator.comparingLong(ParameterString::getSortKey));
		StringBuffer sb = new StringBuffer();
		for (ParameterString ps2: ps) {
			sb.append(ps2.getValue());
		}
		this.traceParms.put(ctx.HOOK().getText(), sb.toString());
	}

	private void initialize(JCLDDAMPParser.TraceEcodeContext ctx) {
		ArrayList<ParameterString> ps = new ArrayList<>();

		ps.addAll(ParameterString.bunchOfThese(ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI));
		ps.sort(Comparator.comparingLong(ParameterString::getSortKey));
		StringBuffer sb = new StringBuffer();
		for (ParameterString ps2: ps) {
			sb.append(ps2.getValue());
		}
		this.traceParms.put(ctx.ECODE().getText(), sb.toString());
	}

	private void initialize(JCLDDAMPParser.TraceKeyContext ctx) {
		ArrayList<ParameterString> ps = new ArrayList<>();

		ps.addAll(ParameterString.bunchOfThese(ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI));
		if (ctx.DASH() != null) {
			ps.add(new ParameterString(ctx.DASH(), this.LOGGER, this.CLI));
		}
		ps.sort(Comparator.comparingLong(ParameterString::getSortKey));
		StringBuffer sb = new StringBuffer();
		for (ParameterString ps2: ps) {
			sb.append(ps2.getValue());
		}
		this.traceParms.put(ctx.KEY().getText(), sb.toString());
	}

	private void initialize(JCLDDAMPParser.TraceParm1Context ctx) {
		ArrayList<ParameterString> ps = new ArrayList<>();

		ps.addAll(ParameterString.bunchOfThese(ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI));
		ps.sort(Comparator.comparingLong(ParameterString::getSortKey));
		StringBuffer sb = new StringBuffer();
		for (ParameterString ps2: ps) {
			sb.append(ps2.getValue());
		}
		this.traceParms.put(ctx.PARM1().getText(), sb.toString());
	}

	private void initialize(JCLDDAMPParser.TraceParm2Context ctx) {
		ArrayList<ParameterString> ps = new ArrayList<>();

		ps.addAll(ParameterString.bunchOfThese(ctx.KEYWORD_VALUE(), this.LOGGER, this.CLI));
		ps.sort(Comparator.comparingLong(ParameterString::getSortKey));
		StringBuffer sb = new StringBuffer();
		for (ParameterString ps2: ps) {
			sb.append(ps2.getValue());
		}
		this.traceParms.put(ctx.PARM2().getText(), sb.toString());
	}

	public void toCSV(StringBuffer csvOut, UUID parentUUID) {

		if (this.traceParms.isEmpty()) {
			csvOut.append(System.getProperty("line.separator"));
			csvOut.append("AMP");
			csvOut.append(",");
			csvOut.append(parentUUID.toString());
			csvOut.append(",");
			csvOut.append(UUID.randomUUID().toString());
			csvOut.append(",");
			csvOut.append(this.type);
			csvOut.append(",");
			csvOut.append(this.value);
		} else {
			this.traceParms.forEach((k, v) -> {
				csvOut.append(System.getProperty("line.separator"));
				csvOut.append("AMP");
				csvOut.append(",");
				csvOut.append(parentUUID.toString());
				csvOut.append(",");
				csvOut.append(UUID.randomUUID().toString());
				csvOut.append(",");
				csvOut.append(this.type + ":" + k);
				csvOut.append(",");
				csvOut.append(v);
			});
		}
	}

	public String toString() {
		return this.myName + " " + this.type + " " + this.value;
	}
}
