/*Copyright (C) 2019 - 2021 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent a DD statement.

This class is used during preprocessing, at which time symbolics
are resolved and various other fixups are preformed so "actual"
lexing and parsing can proceed.
*/
public class PPDdStatement {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private String ddName = null;
	private String procName = null;
	private String fileName = null;
	private Boolean inProc = null;
	private JCLPPParser.DdStatementContext ddStmtCtx = null;
	private JCLPPParser.DdStatementConcatenationContext ddStmtConcatCtx = null;
	private List<JCLPPParser.DdParmASTERISK_DATAContext> ddSplatCtx = null;
	private ArrayList<String> blankParms = new ArrayList<>();
	private Hashtable<String, PPKeywordOrSymbolicWrapper> kosParms = new Hashtable<>();
	private Hashtable<String, PPSingleOrMultipleValueWrapper> somvParms = new Hashtable<>();
	private ArrayList<PPSymbolic> symbolics = new ArrayList<>();

	public static ArrayList<PPDdStatement> bunchOfThese(
			JCLPPParser.DdStatementAmalgamationContext ddStmtAmlgnCtx
			, String procName
			, String ddName
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<PPDdStatement> dds = new ArrayList<>();

		if (ddStmtAmlgnCtx.ddStatement() == null) {
		} else {
			dds.add(new PPDdStatement(ddStmtAmlgnCtx.ddStatement(), procName, ddName, fileName, LOGGER, CLI));
		}

		if (ddStmtAmlgnCtx.ddStatementConcatenation() == null) {
		} else {
			for (JCLPPParser.DdStatementConcatenationContext ddcCtx: ddStmtAmlgnCtx.ddStatementConcatenation()) {
				dds.add(new PPDdStatement(ddcCtx, procName, ddName, fileName, LOGGER, CLI));
			}
		}

		return dds;
	}

	public PPDdStatement(
			JCLPPParser.DdStatementContext ddStmtCtx
			, String procName
			, String ddName
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ddStmtCtx = ddStmtCtx;
		this.ddSplatCtx = ddStmtCtx.ddParmASTERISK_DATA();
		this.initialize(procName, ddName, fileName, LOGGER, CLI);
		this.initializeTediously(this.ddStmtCtx.ddParameter());
	}

	public PPDdStatement(
			JCLPPParser.DdStatementConcatenationContext ddStmtConcatCtx
			, String procName
			, String ddName
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ddStmtConcatCtx = ddStmtConcatCtx;
		this.ddSplatCtx = ddStmtConcatCtx.ddParmASTERISK_DATA();
		this.initialize(procName, ddName, fileName, LOGGER, CLI);
		this.initializeTediously(this.ddStmtConcatCtx.ddParameter());
	}

	private void initialize(
			String procName
			, String ddName
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.procName = procName;
		this.inProc = !(procName == null);
		this.fileName = fileName;
		this.ddName = ddName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	private void initializeTediously(List<JCLPPParser.DdParameterContext> ddParms) {
		/*
			The following bad idea is brought to you by the dozens of parameters of
			the DD statement.
		*/

		this.LOGGER.finest(this.myName + " " + this.ddName + " initializeTediously(" + ddParms + ")");
		for (JCLPPParser.DdParameterContext ddParm: ddParms) {
			if (ddParm.ddParmASTERISK() != null) {
				this.blankParms.add("ASTERISK");
				continue;
			}

			if (ddParm.ddParmDATA() != null) {
				this.blankParms.add("DATA");
				continue;
			}

			if (ddParm.ddParmDLM() != null) {
				PPKeywordOrSymbolicWrapper kosw = new PPKeywordOrSymbolicWrapper(ddParm.ddParmDLM().keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI);
				this.kosParms.put("DLM", kosw);
				continue;
			}

			if (ddParm.ddParmSYMBOLS() != null) {
				PPSingleOrMultipleValueWrapper somvw = new PPSingleOrMultipleValueWrapper(ddParm.ddParmSYMBOLS().singleOrMultipleValue(), this.procName, this.LOGGER, this.CLI);
				this.somvParms.put("SYMBOLS", somvw);
				continue;
			}

			if (ddParm.ddParmSYMLIST() != null) {
				PPSingleOrMultipleValueWrapper somvw = new PPSingleOrMultipleValueWrapper(ddParm.ddParmSYMLIST().singleOrMultipleValue(), this.procName, this.LOGGER, this.CLI);
				this.somvParms.put("SYMLIST", somvw);
				continue;
			}

			if (ddParm.SYMBOLIC() != null) {
				this.symbolics = PPSymbolic.bunchOfThese(ddParm.SYMBOLIC(), this.fileName, this.procName, this.LOGGER, this.CLI);
			}
		}
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		this.LOGGER.finest(this.myName + " resolveParms sets = |" + sets + "|");

		for (PPKeywordOrSymbolicWrapper kos: this.kosParms.values()) {
			kos.resolveParms(sets);
		}

		for (PPSingleOrMultipleValueWrapper somv: this.somvParms.values()) {
			somv.resolveParms(sets);
		}

		for (PPSymbolic s: this.symbolics) {
			s.resolve(sets);
		}
	}

	public ArrayList<PPSymbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " collectSymbolics");

		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		for (PPKeywordOrSymbolicWrapper k: kosParms.values()) {
			symbolics.addAll(k.collectSymbolics());
		}

		for (PPSingleOrMultipleValueWrapper s: somvParms.values()) {
			symbolics.addAll(s.collectSymbolics());
		}

		symbolics.addAll(this.symbolics);

		return symbolics;
	}

	public String getResolvedValue(String key) {
		if (kosParms.containsKey(key)) {
			return kosParms.get(key).getResolvedValue();
		} else if (somvParms.containsKey(key)) {
			return somvParms.get(key).getResolvedValue();
		} else {
			return key + " not found";
		}
	}

	/**
	Indicate whether or not this DD statement has instream
	data associated with it but does not include an asterisk
	parameter indicating the association was intended.

	This happens when someone codes...
	<code>
	//STEP0001 EXEC PGM=IEBGENER
	//SYSUT1   DD  DISP=OLD,DSN=ABC
	//SYSUT2   DD  DISP=(NEW,CATLG),
	//             DSN=XYZ,
	//             LRECL=80,RECFM=FB,
	//             SPACE=(TRK,1)
	//SYSPRINT DD  SYSOUT=*
	    GENERATE  MAXFLDS=3,MAXLITS=11
	    RECORD  FIELD=(10,'**********',,1),
	            FIELD=(5,1,HE,11),FIELD=(1,'=',,16)
	</code>
	...the control cards following SYSPRINT are erroneously
	associated with that DD statement because a SYSIN DD *
	DD was not coded.  Normally, JES adds that SYSIN, and
	now I must also.

	*/
	public Boolean hasUnattributedAsteriskData() {
		return (!this.blankParms.contains("ASTERISK")
				&& this.ddSplatCtx != null
				&& this.ddSplatCtx.size() > 0);
	}

	public Integer getAsteriskDataLine() {
		if (!this.hasUnattributedAsteriskData()) {
			throw new IllegalArgumentException(
				"this DD statement " + this.ddName
				+ " has no associated instream data");
		}

		return this.ddSplatCtx.get(0).getStart().getLine();
	}
}
