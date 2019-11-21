
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent a DD statement.

*/
public class DdStatement {

	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private String ddName = null;
	private String procName = null;
	private Boolean inProc = null;
	private JCLParser.DdStatementContext ddStmtCtx = null;
	private JCLParser.DdStatementConcatenationContext ddStmtConcatCtx = null;
	private ArrayList<String> blankParms = new ArrayList<>();
	private Hashtable<String, KeywordOrSymbolicWrapper> kosParms = new Hashtable<>();
	private Hashtable<String, SingleOrMultipleValueWrapper> somvParms = new Hashtable<>();
	private Hashtable<String, DatasetNameWrapper> dsnParms = new Hashtable<>();
	private DispWrapper dispw = null;
	private DsidWrapper dsidw = null;

	public static ArrayList<DdStatement> bunchOfThese(JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx, String procName, String ddName) {
		ArrayList<DdStatement> dds = new ArrayList<>();

		if (ddStmtAmlgnCtx.ddStatement() == null) {
		} else {
			dds.add(new DdStatement(ddStmtAmlgnCtx.ddStatement(), procName, ddName));
		}

		if (ddStmtAmlgnCtx.ddStatementConcatenation() == null) {
		} else {
			for (JCLParser.DdStatementConcatenationContext ddcCtx: ddStmtAmlgnCtx.ddStatementConcatenation()) {
				dds.add(new DdStatement(ddcCtx, procName, ddName));
			}
		}

		return dds;
	}

	public DdStatement(JCLParser.DdStatementContext ddStmtCtx, String procName, String ddName) {
		this.ddStmtCtx = ddStmtCtx;
		this.initialize(procName, ddName);
		this.initializeTediously(this.ddStmtCtx.ddParameter());
	}

	public DdStatement(JCLParser.DdStatementConcatenationContext ddStmtConcatCtx, String procName, String ddName) {
		this.ddStmtConcatCtx = ddStmtConcatCtx;
		this.initialize(procName, ddName);
		this.initializeTediously(this.ddStmtConcatCtx.ddParameter());
	}

	private void initialize(String procName, String ddName) {
		this.myName = this.getClass().getName();
		this.procName = procName;
		this.inProc = !(procName == null);
		this.ddName = ddName;
	}

	private void initializeTediously(List<JCLParser.DdParameterContext> ddParms) {
		/*
			The following bad idea is brought to you by the dozens of parameters of
			the DD statement.
		*/
		for (JCLParser.DdParameterContext ddParm: ddParms) {
			if (ddParm.ddParmACCODE() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmACCODE().keywordOrSymbolic(), this.procName);
				this.kosParms.put("ACCODE", kosw);
				continue;
			}

			if (ddParm.ddParmAMP() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmAMP().singleOrMultipleValue(), this.procName);
				this.somvParms.put("AMP", somvw);
				continue;
			}

			if (ddParm.ddParmASTERISK() != null) {
				this.blankParms.add("ASTERISK");
				continue;
			}

			if (ddParm.ddParmAVGREC() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmAVGREC().keywordOrSymbolic(), this.procName);
				this.kosParms.put("AVGREC", kosw);
				continue;
			}

			if (ddParm.ddParmBLKSZLIM() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmBLKSZLIM().keywordOrSymbolic(), this.procName);
				this.kosParms.put("BLKSZLIM", kosw);
				continue;
			}

			if (ddParm.ddParmBURST() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmBURST().keywordOrSymbolic(), this.procName);
				this.kosParms.put("BURST", kosw);
				continue;
			}

			if (ddParm.ddParmCCSID() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmCCSID().keywordOrSymbolic(), this.procName);
				this.kosParms.put("CCSID", kosw);
				continue;
			}

			if (ddParm.ddParmCHARS() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmCHARS().singleOrMultipleValue(), this.procName);
				this.somvParms.put("CHARS", somvw);
				continue;
			}

			if (ddParm.ddParmCHKPT() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmCHKPT().keywordOrSymbolic(), this.procName);
				this.kosParms.put("CHKPT", kosw);
				continue;
			}

			if (ddParm.ddParmCNTL() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmCNTL().keywordOrSymbolic(), this.procName);
				this.kosParms.put("CNTL", kosw);
				continue;
			}

			if (ddParm.ddParmDATA() != null) {
				this.blankParms.add("DATA");
				continue;
			}

			if (ddParm.ddParmDATACLAS() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDATACLAS().keywordOrSymbolic(), this.procName);
				this.kosParms.put("DATACLAS", kosw);
				continue;
			}

			if (ddParm.ddParmDDNAME() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDDNAME().keywordOrSymbolic(), this.procName);
				this.kosParms.put("DDNAME", kosw);
				continue;
			}

			if (ddParm.ddParmDEST() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDEST().keywordOrSymbolic(), this.procName);
				this.kosParms.put("DEST", kosw);
				continue;
			}

			if (ddParm.ddParmDISP() != null) {
				this.dispw = new DispWrapper(ddParm.ddParmDISP(), this.procName);
				continue;
			}

			if (ddParm.ddParmDLM() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDLM().keywordOrSymbolic(), this.procName);
				this.kosParms.put("DLM", kosw);
				continue;
			}

			if (ddParm.ddParmDSID() != null) {
				this.dsidw = new DsidWrapper(ddParm.ddParmDSID(), this.procName);
				continue;
			}

			if (ddParm.ddParmDSKEYLBL() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDSKEYLBL().keywordOrSymbolic(), this.procName);
				this.kosParms.put("DSKEYLBL", kosw);
				continue;
			}

			if (ddParm.ddParmDSNAME() != null) {
				DatasetNameWrapper dsnw = new DatasetNameWrapper(ddParm.ddParmDSNAME().datasetName(), this.procName);
				this.dsnParms.put("DSNAME", dsnw);
				continue;
			}

			if (ddParm.ddParmDSNTYPE() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmDSNTYPE().singleOrMultipleValue(), this.procName);
				this.somvParms.put("DSNTYPE", somvw);
				continue;
			}

			if (ddParm.ddParmDUMMY() != null) {
				this.blankParms.add("DUMMY");
				continue;
			}

			if (ddParm.ddParmDYNAM() != null) {
				this.blankParms.add("DYNAM");
				continue;
			}

			if (ddParm.ddParmEATTR() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmEATTR().keywordOrSymbolic(), this.procName);
				this.kosParms.put("EATTR", kosw);
				continue;
			}

			if (ddParm.ddParmEXPDT() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmEXPDT().keywordOrSymbolic(), this.procName);
				this.kosParms.put("EXPDT", kosw);
				continue;
			}

			if (ddParm.ddParmFCB() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmFCB().singleOrMultipleValue(), this.procName);
				this.somvParms.put("FCB", somvw);
				continue;
			}

			if (ddParm.ddParmFILEDATA() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmFILEDATA().keywordOrSymbolic(), this.procName);
				this.kosParms.put("FILEDATA", kosw);
				continue;
			}

			if (ddParm.ddParmFLASH() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmFLASH().singleOrMultipleValue(), this.procName);
				this.somvParms.put("FLASH", somvw);
				continue;
			}

			if (ddParm.ddParmFREE() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmFREE().keywordOrSymbolic(), this.procName);
				this.kosParms.put("FREE", kosw);
				continue;
			}

			if (ddParm.ddParmFREEVOL() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmFREEVOL().keywordOrSymbolic(), this.procName);
				this.kosParms.put("FREEVOL", kosw);
				continue;
			}

			if (ddParm.ddParmGDGORDER() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmGDGORDER().keywordOrSymbolic(), this.procName);
				this.kosParms.put("GDGORDER", kosw);
				continue;
			}

			if (ddParm.ddParmHOLD() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmHOLD().keywordOrSymbolic(), this.procName);
				this.kosParms.put("HOLD", kosw);
				continue;
			}

			if (ddParm.ddParmKEYOFF() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmKEYOFF().keywordOrSymbolic(), this.procName);
				this.kosParms.put("KEYOFF", kosw);
				continue;
			}

			if (ddParm.ddParmLGSTREAM() != null) {
				DatasetNameWrapper dsnw = new DatasetNameWrapper(ddParm.ddParmLGSTREAM().datasetName(), this.procName);
				this.dsnParms.put("LGSTREAM", dsnw);
				continue;
			}

			if (ddParm.ddParmLIKE() != null) {
				DatasetNameWrapper dsnw = new DatasetNameWrapper(ddParm.ddParmLIKE().datasetName(), this.procName);
				this.dsnParms.put("LIKE", dsnw);
				continue;
			}

			if (ddParm.ddParmMAXGENS() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmMAXGENS().keywordOrSymbolic(), this.procName);
				this.kosParms.put("MAXGENS", kosw);
				continue;
			}

			if (ddParm.ddParmMGMTCLAS() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmMGMTCLAS().keywordOrSymbolic(), this.procName);
				this.kosParms.put("MGMTCLAS", kosw);
				continue;
			}

			if (ddParm.ddParmMODIFY() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmMODIFY().singleOrMultipleValue(), this.procName);
				this.somvParms.put("MODIFY", somvw);
				continue;
			}

			if (ddParm.ddParmOUTLIM() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmOUTLIM().keywordOrSymbolic(), this.procName);
				this.kosParms.put("OUTLIM", kosw);
				continue;
			}

			if (ddParm.ddParmPATH() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmPATH().keywordOrSymbolic(), this.procName);
				this.kosParms.put("PATH", kosw);
				continue;
			}

			if (ddParm.ddParmPROTECT() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmPROTECT().keywordOrSymbolic(), this.procName);
				this.kosParms.put("PROTECT", kosw);
				continue;
			}

			if (ddParm.ddParmRECORG() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmRECORG().keywordOrSymbolic(), this.procName);
				this.kosParms.put("RECORG", kosw);
				continue;
			}

			if (ddParm.ddParmREFDD() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmREFDD().keywordOrSymbolic(), this.procName);
				this.kosParms.put("REFDD", kosw);
				continue;
			}

			if (ddParm.ddParmRETPD() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmRETPD().keywordOrSymbolic(), this.procName);
				this.kosParms.put("RETPD", kosw);
				continue;
			}

			if (ddParm.ddParmRLS() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmRLS().keywordOrSymbolic(), this.procName);
				this.kosParms.put("RLS", kosw);
				continue;
			}

			if (ddParm.ddParmROACCESS() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmROACCESS().singleOrMultipleValue(), this.procName);
				this.somvParms.put("ROACCESS", somvw);
				continue;
			}

			if (ddParm.ddParmSECMODEL() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmSECMODEL().singleOrMultipleValue(), this.procName);
				this.somvParms.put("SECMODEL", somvw);
				continue;
			}

			if (ddParm.ddParmSEGMENT() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmSEGMENT().keywordOrSymbolic(), this.procName);
				this.kosParms.put("SEGMENT", kosw);
				continue;
			}

			if (ddParm.ddParmSPIN() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmSPIN().singleOrMultipleValue(), this.procName);
				this.somvParms.put("SPIN", somvw);
				continue;
			}

			if (ddParm.ddParmSTORCLAS() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmSTORCLAS().keywordOrSymbolic(), this.procName);
				this.kosParms.put("STORCLAS", kosw);
				continue;
			}

			if (ddParm.ddParmSUBSYS() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmSUBSYS().singleOrMultipleValue(), this.procName);
				this.somvParms.put("SUBSYS", somvw);
				continue;
			}

			if (ddParm.ddParmSYMBOLS() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmSYMBOLS().singleOrMultipleValue(), this.procName);
				this.somvParms.put("SYMBOLS", somvw);
				continue;
			}

			if (ddParm.ddParmSYMLIST() != null) {
				SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmSYMLIST().singleOrMultipleValue(), this.procName);
				this.somvParms.put("SYMLIST", somvw);
				continue;
			}

			if (ddParm.ddParmTERM() != null) {
				KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmTERM().keywordOrSymbolic(), this.procName);
				this.kosParms.put("TERM", kosw);
				continue;
			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBFALN() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBFALN().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BFALN", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBFTEK() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBFTEK().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BFTEK", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBLKSIZE() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBLKSIZE().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BLKSIZE", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBUFIN() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBUFIN().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BUFIN", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBUFL() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBUFL().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BUFL", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBUFMAX() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBUFMAX().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BUFMAX", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBUFNO() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBUFNO().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BUFNO", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBUFOFF() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBUFOFF().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BUFOFF", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBUFOUT() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBUFOUT().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BUFOUT", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmBUFSIZE() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmBUFSIZE().keywordOrSymbolic(), this.procName);
					this.kosParms.put("BUFSIZE", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmCPRI() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmCPRI().keywordOrSymbolic(), this.procName);
					this.kosParms.put("CPRI", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmCYLOFL() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmCYLOFL().keywordOrSymbolic(), this.procName);
					this.kosParms.put("CYLOFL", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmDEN() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmDEN().keywordOrSymbolic(), this.procName);
					this.kosParms.put("DEN", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmDIAGNS() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmDIAGNS().keywordOrSymbolic(), this.procName);
					this.kosParms.put("DIAGNS", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmDSORG() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmDSORG().keywordOrSymbolic(), this.procName);
					this.kosParms.put("DSORG", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmEROPT() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmEROPT().keywordOrSymbolic(), this.procName);
					this.kosParms.put("EROPT", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmFUNC() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmFUNC().keywordOrSymbolic(), this.procName);
					this.kosParms.put("FUNC", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmGNCP() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmGNCP().keywordOrSymbolic(), this.procName);
					this.kosParms.put("GNCP", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmINTVL() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmINTVL().keywordOrSymbolic(), this.procName);
					this.kosParms.put("INTVL", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmIPLTXID() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmIPLTXID().keywordOrSymbolic(), this.procName);
					this.kosParms.put("IPLTXID", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmKEYLEN() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmKEYLEN().keywordOrSymbolic(), this.procName);
					this.kosParms.put("KEYLEN", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmLIMCT() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmLIMCT().keywordOrSymbolic(), this.procName);
					this.kosParms.put("LIMCT", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmLRECL() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmLRECL().keywordOrSymbolic(), this.procName);
					this.kosParms.put("LRECL", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmMODE() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmMODE().keywordOrSymbolic(), this.procName);
					this.kosParms.put("MODE", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmNCP() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmNCP().keywordOrSymbolic(), this.procName);
					this.kosParms.put("NCP", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmNTM() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmNTM().keywordOrSymbolic(), this.procName);
					this.kosParms.put("NTM", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmOPTCD() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmOPTCD().keywordOrSymbolic(), this.procName);
					this.kosParms.put("OPTCD", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmPCI() != null) {
					SingleOrMultipleValueWrapper somvw = new SingleOrMultipleValueWrapper(ddParm.ddParmDCB_Parameter().ddParmPCI().singleOrMultipleValue(), this.procName);
					this.somvParms.put("PCI", somvw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmPRTSP() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmPRTSP().keywordOrSymbolic(), this.procName);
					this.kosParms.put("PRTSP", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmRECFM() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmRECFM().keywordOrSymbolic(), this.procName);
					this.kosParms.put("RECFM", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmRKP() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmRKP().keywordOrSymbolic(), this.procName);
					this.kosParms.put("RKP", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmSTACK() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmSTACK().keywordOrSymbolic(), this.procName);
					this.kosParms.put("STACK", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmTHRESH() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmTHRESH().keywordOrSymbolic(), this.procName);
					this.kosParms.put("THRESH", kosw);
					continue;
				}

			}

			if (ddParm.ddParmDCB_Parameter() != null) {
				if (ddParm.ddParmDCB_Parameter().ddParmTRTCH() != null) {
					KeywordOrSymbolicWrapper kosw = new KeywordOrSymbolicWrapper(ddParm.ddParmDCB_Parameter().ddParmTRTCH().keywordOrSymbolic(), this.procName);
					this.kosParms.put("TRTCH", kosw);
					continue;
				}

			}
		}
	}

	public void resolveParms(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(this.myName + " resolveParms symbolics = |" + symbolics + "|");

		for (KeywordOrSymbolicWrapper kos: this.kosParms.values()) {
			kos.resolveParms(symbolics);
		}

		for (SingleOrMultipleValueWrapper somv: this.somvParms.values()) {
			somv.resolveParms(symbolics);
		}

		for (DatasetNameWrapper dsn: this.dsnParms.values()) {
			dsn.resolveParms(symbolics);
		}
	}

	public String getResolvedValue(String key) {
		if (kosParms.containsKey(key)) {
			return kosParms.get(key).getResolvedValue();
		} else if (somvParms.containsKey(key)) {
			return somvParms.get(key).getResolvedValue();
		} else if (dsnParms.containsKey(key)) {
			return dsnParms.get(key).getResolvedValue();
		} else {
			return key + " not found";
		}
	}

}
