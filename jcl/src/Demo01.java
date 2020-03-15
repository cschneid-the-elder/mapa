import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**


*/

public class Demo01{

public static final Logger LOGGER = Logger.getLogger(Demo01.class.getName());
public static TheCLI CLI = null;
public static ArrayList<PPSetSymbolValue> symbolics = new ArrayList<>();

public static void main(String[] args) throws Exception {

	/*
	Housekeeping.  Set up a logger to log messages to a file.
	*/
	Handler fileHandler  = null;

	System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tc] %4$s: %5$s%n");

	try {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		fileHandler = new FileHandler("./" + Demo01.class.getName() + "-" + LocalDateTime.now().format(df) +".log");
		fileHandler.setFormatter(new SimpleFormatter());
		LOGGER.addHandler(fileHandler);
		fileHandler.setLevel(Level.ALL);
		LOGGER.setLevel(Level.ALL);
		LOGGER.info("Logger Name: " + LOGGER.getName());
	} catch (Exception e) {
		LOGGER.severe("Exception " + e + " encountered");
		e.printStackTrace();
		System.exit(16);
	}

	/*
	Housekeeping.  Parse command line options.
	*/
	CLI = new TheCLI(args);

	/*
	Initial setup.  Get symbolics and their values as specified on command line.
	*/
	if (CLI.setFile != null) {
		symbolics = lookForSetSymbols(CLI.setFile.getCanonicalPath());
	}

	ArrayList<PPProc> procs = new ArrayList<>();
	ArrayList<PPJob> jobs = new ArrayList<>();
	ArrayList<PPJob> rJobs = new ArrayList<>(); //jobs whose INCLUDEs have been resolved
	File baseDir = newTempDir(); // Use later for temp job/proc root

	for (String aFileName: CLI.fileNamesToProcess) {
		LOGGER.info("Processing file " + aFileName);
		lexAndParse(jobs, procs, aFileName);
		for (PPJob j: jobs) {
			LOGGER.info("Processing job " + j);
			j.resolveParmedIncludes(symbolics);
			LOGGER.finest(j + " stepsInNeedOfProc = " + j.stepsInNeedOfProc());
			File jobFile = j.rewriteJobAndSeparateInstreamProcs(baseDir);
			/*
				Now must iteratively parse this job until all includes 
				are resolved -or- we have determined all that remain are 
				unresolvable includes.
			*/
			PPJob rJob = j.iterativelyResolveIncludes(jobFile);
			rJobs.add(rJob);
			//iterativelyResolveJobProcs(rJob, tmpProcDir); //doesn't appear to have done anything
			rJob.resolveParms(symbolics);
			/*
				Includes are resolved to the extent possible.
				Now must rewrite job with resolved values for parms substituted.
				Merge with procs?
			*/
			rJob.rewriteWithParmsResolved();
		}
	}


	LOGGER.info("Processing complete");
}

	public static void lexAndParse(ArrayList<PPJob> jobs, ArrayList<PPProc> procs, String fileName) throws IOException {
		LOGGER.fine("lexAndParse jobs = |" + jobs + "| procs = |" + procs + "| fileName = |" + fileName + "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer jcllexer = new JCLPPLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLPPParser jclparser = new JCLPPParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		PPListener jobListener = new PPListener(jobs, procs, fileName, LOGGER, CLI);
	
		LOGGER.finer("----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public static void iterativelyResolveJobProcs(PPJob job, File tmpProcDir) throws IOException {

		for (PPJclStep s: job.getSteps()) {
			if (!s.isExecProc()) continue;
			String procFileName = s.getProcExecuted();
		}
	}

	public static File newTempDir() throws IOException {
		/*
			It's possible the file permissions are superfluous.  The code would be more
			portable without them.  TODO maybe remove the code setting file permissions.
		*/
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x---");
		FileAttribute<Set<PosixFilePermission>> attr =
			PosixFilePermissions.asFileAttribute(perms);
		File tmpDir = Files.createTempDirectory("Demo01-", attr).toFile();

		if (CLI.saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	public static ArrayList<PPSetSymbolValue> lookForSetSymbols(String fileName) throws IOException {
		LOGGER.fine("lookForSetSymbols");
		ArrayList<PPSetSymbolValue> sets = new ArrayList<>();
		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer jcllexer = new JCLPPLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLPPParser jclparser = new JCLPPParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		PPSetSymbolValueListener setSymbolValueListener = new PPSetSymbolValueListener(sets, fileName);
	
		LOGGER.finer("----------walking tree with setSymbolValueListener");
	
		jclwalker.walk(setSymbolValueListener, jcltree);

		return sets;
		
	}

}
