import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

/**
Top level of a COBOL static code analysis tool.  Static code analysis
is always going to be limited, but this tool will attempt to aid the
user in getting a feel for the "shape" of a code base by tracking the
call tree.
<p>
This tool will not be able to determine which module is being called
if the called module's name is obtained at run time from an external
data store (via SQL or I/O or JCL PARM=).
<p>
The intent here is to obtain a hierarchical map of the Data Division,
then a list of CALLs in the Procedure Division, then match the two for
<code>CALL identifier</code> syntax.
<p>
This can get interesting, as we must also attempt to determine values
assigned to the identifier via <code>MOVE</code> and any 88-levels that
are <code>SET</code>.
<p>
So, first map the Data Division, then get a list of CALLs, then match 
the two, storing the Data Division node in the list of CALLs.  Then,
for all Data Division nodes, attempt to determine what values are
assigned at run time.
<p>
Finally, store calling module, called module (to the extent it can be
determined) and anything else that seems useful.
<p><p>
Syntax: <code>java -jar CallTree.jar -help</code>


*/

public class TestIntegration{

public static final Logger LOGGER = Logger.getLogger(TestIntegration.class.getName());
public static ArrayList<DDNode> dataNodes = new ArrayList<>();
public static TheCLI CLI = null;
public static File baseDir = null; // keep all temp files contained here

public static void main(String[] args) throws Exception {

	Handler fileHandler  = null;

	System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tc] %4$s: %5$s%n");

	try {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		fileHandler = new FileHandler("./TestIntegration-" + LocalDateTime.now().format(df) +".log");
		fileHandler.setFormatter(new SimpleFormatter());
		LOGGER.addHandler(fileHandler);
		fileHandler.setLevel(Level.ALL);
		LOGGER.setLevel(Level.ALL);
		LOGGER.info("Logger Name: " + LOGGER.getName());
	} catch (Exception e) {
		LOGGER.severe("Exception " + e + " encountered");
		System.exit(16);
	}

	CLI = new TheCLI(args, LOGGER);
	baseDir = newTempDir(); // keep all temp files contained here
	String fileName = null;
	ArrayList<CobolSource> allTheCobolSource = new ArrayList<>();
	Boolean pass = true;
	Boolean idDivFound = false;
	int failCount = 0;

	for (String aFileName: CLI.fileNamesToProcess) {
		LOGGER.info("Processing " + aFileName);
		CobolSource cblSrc = new CobolSource(aFileName, baseDir, LOGGER, CLI);
		if (cblSrc.isCobol()) {
			allTheCobolSource.add(cblSrc);
			if (CLI.unitTest) {
				if (!testFor(aFileName, cblSrc.getDataNodes(), cblSrc.getCalledNodes())) failCount++;
			}
		}
		LOGGER.fine(aFileName + " calls " + cblSrc.getCalledNodes().size() + " modules");
	}

	if (failCount > 0) LOGGER.info("----> At least one unit test failed");

	if (CLI.outFileName != null) {
		LOGGER.info("writing to " + CLI.outFileName);
		File outFile = new File(CLI.outFileName);
		PrintWriter pw = new PrintWriter(outFile);
		LOGGER.finest("writing output");
		for (CobolSource cs: allTheCobolSource) {
			LOGGER.finest(cs.toString());
			cs.writeOn(pw);
		}
		pw.close();
	}

	LOGGER.info("Processing complete");
}

	/**
	Create a directory to hold temporary files used in processing.  This way,
	they're all confined together and can be easily disposed of if the
	<code>-saveTemp</code> option was requested.
	*/
	public static File newTempDir() throws IOException {
		File tmpDir = Files.createTempDirectory("CallTree-").toFile();
		CLI.setPosixAttributes(tmpDir);

		if (CLI.saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	/**
	This method is executed if the -unitTest option is requested.  It may
	not meet your definition of unit test, but it serves mine.

	<p>The goal is to examine the results of all processing for given
	modules and compare them to known correct results.  Those known correct
	results are hard-coded here.

	<p>It's awful, I know, but try not to look at it.  Or think about it.
	You're thinking about it now aren't you?
	*/
	public static Boolean testFor(String fileName
						, ArrayList<DDNode> dataNodes
						, ArrayList<CallWrapper> calledNodes
						) {

		LOGGER.fine("Executing unit tests for " + fileName);
		Boolean rc = false;
		String bareName = fileName.substring(fileName.lastIndexOf("/") + 1, fileName.lastIndexOf("."));
		int failCount = 0;

		switch(bareName) {
			case "testantlr001":
			case "testantlr101":
			case "testantlr201":
			case "testantlr301":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (calledNodes.size() == 0) {
					//do nothing
				} else {
					LOGGER.info("FAIL " + fileName);
					LOGGER.fine("FAIL " + fileName + " test - calledNodes.size() != 0");
					LOGGER.fine(fileName + " calledNodes.size() = " + calledNodes.size());
					LOGGER.fine(fileName + " calledNodes = " + calledNodes);
					failCount++;
				}
				break;
			case "testantlr002":
			case "testantlr102":
			case "testantlr202":
			case "testantlr302":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr003":
			case "testantlr103":
			case "testantlr203":
			case "testantlr303":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr004":
			case "testantlr104":
			case "testantlr204":
			case "testantlr304":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr005":
			case "testantlr105":
			case "testantlr205":
			case "testantlr305":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr006":
			case "testantlr106":
			case "testantlr206":
			case "testantlr306":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr007":
			case "testantlr107":
			case "testantlr207":
			case "testantlr307":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr008":
			case "testantlr108":
			case "testantlr208":
			case "testantlr308":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr009":
			case "testantlr109":
			case "testantlr209":
			case "testantlr309":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr010":
			case "testantlr110":
			case "testantlr210":
			case "testantlr310":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.SQLCALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr011":
			case "testantlr111":
			case "testantlr211":
			case "testantlr311":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr012":
			case "testantlr112":
			case "testantlr212":
			case "testantlr312":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr013":
			case "testantlr113":
			case "testantlr213":
			case "testantlr313":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.SQLCALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr014":
			case "testantlr114":
			case "testantlr214":
			case "testantlr314":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr015":
			case "testantlr115":
			case "testantlr215":
			case "testantlr315":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr016":
			case "testantlr116":
			case "testantlr216":
			case "testantlr316":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0004", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr017":
			case "testantlr117":
			case "testantlr217":
			case "testantlr317":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0005", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr018":
			case "testantlr118":
			case "testantlr218":
			case "testantlr318":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMO0010", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr019":
			case "testantlr119":
			case "testantlr219":
			case "testantlr319":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMN0010", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr020":
			case "testantlr120":
			case "testantlr220":
			case "testantlr320":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMK0008", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr021":
			case "testantlr121":
			case "testantlr221":
			case "testantlr321":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr022":
			case "testantlr122":
			case "testantlr222":
			case "testantlr322":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(77), "AA-FROM-COPY", dataNodes)) failCount++;
				break;
			case "testantlr023":
			case "testantlr123":
			case "testantlr223":
			case "testantlr323":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "PGM-0004", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0004", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr024":
			case "testantlr124":
			case "testantlr224":
			case "testantlr324":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "X", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "V99", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "B9", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "Z", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9", dataNodes)) failCount++;
				break;
			case "testantlr025":
			case "testantlr125":
			case "testantlr225":
			case "testantlr325":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "X", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "V99", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "B9", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "Z", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMP3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMP5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMP3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMP5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMPU3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMPU5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMPU3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMPU5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5-V", dataNodes)) failCount++;
				break;
			case "testantlr026":
			case "testantlr126":
			case "testantlr226":
			case "testantlr326":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "B", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "C", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5-V", dataNodes)) failCount++;
				break;
			case "testantlr027":
			case "testantlr127":
			case "testantlr227":
			case "testantlr327":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "X", dataNodes)) failCount++;
				break;
			case "testantlr028":
			case "testantlr128":
			case "testantlr228":
			case "testantlr328":
				if (!testDD002(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "MYNAME", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "X", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(01), "LOCAL-WORK-AREAS", dataNodes, DataLocation.LOCALSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "Y", dataNodes, DataLocation.LOCALSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(01), "PARM-DATA", dataNodes, DataLocation.LINKAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "PARM-DATA-LEN", dataNodes, DataLocation.LINKAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "PARM-DATA-VAL", dataNodes, DataLocation.LINKAGE)) failCount++;
				break;
			case "testantlr029":
			case "testantlr129":
			case "testantlr229":
			case "testantlr329":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMK0008", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMO0010", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0004", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0004", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				break;
			case "testantlr030":
			case "testantlr130":
			case "testantlr230":
			case "testantlr330":
			case "testantlr031":
			case "testantlr131":
			case "testantlr231":
			case "testantlr331":
			case "testantlr032":
			case "testantlr132":
			case "testantlr232":
			case "testantlr332":
			case "testantlr033":
			case "testantlr133":
			case "testantlr233":
			case "testantlr333":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "CEE3ABD", CallType.CALLBYLITERAL, calledNodes, 1)) failCount++;
				break;
			case "testantlr034":
			case "testantlr134":
			case "testantlr234":
			case "testantlr334":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr035":
			case "testantlr135":
			case "testantlr235":
			case "testantlr335":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr036":
			case "testantlr136":
			case "testantlr236":
			case "testantlr336":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr037":
			case "testantlr137":
			case "testantlr237":
			case "testantlr337":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr038":
			case "testantlr138":
			case "testantlr238":
			case "testantlr338":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr039":
			case "testantlr139":
			case "testantlr239":
			case "testantlr339":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr040":
			case "testantlr140":
			case "testantlr240":
			case "testantlr340":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr041":
			case "testantlr141":
			case "testantlr241":
			case "testantlr341":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr042":
			case "testantlr142":
			case "testantlr242":
			case "testantlr342":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr043":
			case "testantlr143":
			case "testantlr243":
			case "testantlr343":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0009", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr044":
			case "testantlr144":
			case "testantlr244":
			case "testantlr344":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0003", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				break;
			case "testantlr045":
			case "testantlr145":
			case "testantlr245":
			case "testantlr345":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0009", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr046":
			case "testantlr146":
			case "testantlr246":
			case "testantlr346":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr047":
			case "testantlr147":
			case "testantlr247":
			case "testantlr347":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes, 2)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0003", CallType.CALLBYIDENTIFIER, calledNodes, 2)) failCount++;
				break;
			case "testantlr048":
			case "testantlr148":
			case "testantlr248":
			case "testantlr348":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr049":
			case "testantlr149":
			case "testantlr249":
			case "testantlr349":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0003", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0004", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0005", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0006", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0007", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0008", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "JULIA", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "ELIOT", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PENNY", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "MARGOT", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "ALICE", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				break;
			case "testantlr050":
			case "testantlr150":
			case "testantlr250":
			case "testantlr350":
				if (!testCall001(fileName, bareName, "D#IS#7", CallType.CALLBYLITERAL, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "E#IS#9", CallType.CALLBYLITERAL, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "F#IS#7", CallType.CALLBYLITERAL, calledNodes, 3)) failCount++;
				break;
			case "testantlr051":
			case "testantlr151":
			case "testantlr251":
			case "testantlr351":
				if (!testCall001(fileName, bareName, "PGM0001A", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				if (!testCall001(fileName, bareName, "PGM0001D", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				if (!testCall001(fileName, bareName, "PGM0001E", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				if (!testCall001(fileName, bareName, "PGM0001G", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				break;
			case "testantlr052":
			case "testantlr152":
			case "testantlr252":
			case "testantlr352":
				if (!testCall001(fileName, bareName, "OTHER#1", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "VAR1#2", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "VAR2#3", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "IGYARCH4", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "IGYCICS5", CallType.CICSXCTLBYLITERAL, calledNodes, 5)) failCount++;
				break;
			case "testantlr053":
			case "testantlr153":
			case "testantlr253":
			case "testantlr353":
				if (!testCall001(fileName, bareName, "PGM00003", CallType.CALLBYLITERAL, calledNodes, 2)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00009", CallType.CALLBYLITERAL, calledNodes, 2)) failCount++;
				break;
			case "testantlr054":
			case "testantlr154":
			case "testantlr254":
			case "testantlr354":
				if (!testCall001(fileName, bareName, "PGM00004", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00005", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00009", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00011", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00016", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00018", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				break;
			case "testantlr055":
			case "testantlr155":
			case "testantlr255":
			case "testantlr355":
				if (!testCall001(fileName, bareName, "PGM00004", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00005", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00010", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00011", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00013", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				break;
			case "testantlr056":
			case "testantlr156":
			case "testantlr256":
			case "testantlr356":
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "WS-COUNT", dataNodes)) failCount++;
				break;
			case "testantlr057":
			case "testantlr157":
			case "testantlr257":
			case "testantlr357":
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "WS-POINTER", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "WS-COUNT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "SOME-DATA", dataNodes)) failCount++;
				break;
			case "testantlr058":
			case "testantlr158":
			case "testantlr258":
			case "testantlr358":
				if (!testDD002(fileName, bareName, new Integer(77), "PENNY-ADIYODI", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(77), "KADY-ORLOFF-DIAZ", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(77), "ZELDA-SCHIFF", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(77), "HENRY-FOGG", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(01), "WS-WORK-AREAS", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "W1-TEXT01", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "WS-TEXT02", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "W1-TEXT03", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				break;
			case "testantlr059":
			case "testantlr159":
			case "testantlr259":
			case "testantlr359":
				if (!testDD002(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "COUNTER", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				break;
			default:
				LOGGER.info("NONE " + fileName);
				LOGGER.fine("NONE " + fileName + " test - no tests defined");
				break;
		}

		if (failCount == 0) rc = true;
		return rc;
	}

	public static Boolean testCall001(String fileName
						, String bareName
						, String callee
						, CallType ty
						, ArrayList<CallWrapper> calledNodes
						) {
		Boolean rc = false;

		if (calledNodes.size() == 1) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.size() != 1");
			LOGGER.fine(fileName + " calledNodes.size() = " + calledNodes.size());
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		if (rc && calledNodes.get(0).calledModuleNames.size() == 1) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.get(0).calledModuleNames.size() != 1");
			if (calledNodes.size() > 0) {
				LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames.size() = " + calledNodes.get(0).calledModuleNames.size());
				LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames = " + calledNodes.get(0).calledModuleNames);
			}
		} 

		if (rc) {
			rc = false;
			for (CallWrapper cw: calledNodes) {
				if (cw.includes(bareName, callee, ty)) {
					rc = true;
					break;
				}
			} 
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.includes(" + callee + ") == false");
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		return rc;
	}

	public static Boolean testCall001(String fileName
						, String bareName
						, String callee
						, CallType ty
						, ArrayList<CallWrapper> calledNodes
						, int count
						) {
		Boolean rc = false;

		if (calledNodes.size() == count) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.size() != " + count);
			LOGGER.fine(fileName + " calledNodes.size() = " + calledNodes.size());
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		if (rc && calledNodes.get(0).calledModuleNames.size() == 1) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.get(0).calledModuleNames.size() != 1");
			LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames.size() = " + calledNodes.get(0).calledModuleNames.size());
			LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames = " + calledNodes.get(0).calledModuleNames);
		} 

		if (rc) {
			rc = false;
			for (CallWrapper cw: calledNodes) {
				if (cw.includes(bareName, callee, ty)) {
					rc = true;
					break;
				}
			} 
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.includes(" + callee + ") == false");
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		return rc;
	}

	public static Boolean testDD001(String fileName
						, String bareName
						, Integer level
						, String identifier
						, ArrayList<DDNode> dataNodes) {
		Boolean rc = false;

		for (DDNode node: dataNodes) {
			if (node.level.equals(level) && node.identifier.equals(identifier)) {
				rc = true;
				LOGGER.fine(identifier + " node found");
				break;
			} else {
				LOGGER.fine(node.level + " != " + level + " || " + node.identifier + " != " + identifier);
			}
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - no dataNode found " + level + " " + identifier);
			LOGGER.fine("dataNodes = " + dataNodes);
		}

		return rc;
	}

	public static Boolean testDD002(String fileName
						, String bareName
						, Integer level
						, String identifier
						, ArrayList<DDNode> dataNodes
						, DataLocation locn) {
		Boolean rc = false;

		for (DDNode node: dataNodes) {
			if (node.level.equals(level) && node.identifier.equals(identifier) && node.locn == locn) {
				rc = true;
				LOGGER.fine(identifier + " node found");
				break;
			} else {
				LOGGER.finest(node.level + " != " + level + " || " + node.identifier + " != " + identifier + " || " + node.locn + " != " + locn);
			}
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - no dataNode found " + level + " " + identifier + " " + locn);
			LOGGER.finest("dataNodes = " + dataNodes);
		}

		return rc;
	}

}
