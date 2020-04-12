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

	File baseDir = newTempDir(); // keep all temp files contained here
	int fileNb = 0;
	BufferedWriter outcsv = null;

	if (CLI.outcsvFileName == null) {
	} else {
        outcsv = new BufferedWriter(new FileWriter(CLI.outcsvFileName));
	}

	for (String aFileName: CLI.fileNamesToProcess) {
		LOGGER.info("Processing file " + aFileName);
		fileNb++;
		ArrayList<PPProc> procsPP = new ArrayList<>();
		ArrayList<PPJob> jobsPP = new ArrayList<>();
		int jobNb = 0;
		lexAndParsePP(jobsPP, procsPP, aFileName, fileNb);
		for (PPJob j: jobsPP) {
			jobNb++;
			LOGGER.info("Processing job " + j);
			j.resolveParmedIncludes();
			LOGGER.finest(j + " stepsInNeedOfProc = " + j.stepsInNeedOfProc());
			File jobFile = j.rewriteJobAndSeparateInstreamProcs(baseDir);
			/*
				Now must iteratively parse this job until all INCLUDEs 
				are resolved.  Unresolvable INCLUDEs generate a warning.
			*/
			PPJob rJob = j.iterativelyResolveIncludes(jobFile);
			/*
				Symbolic parms may have had values SET inside an INCLUDE,
				so only now the INCLUDEs have been resolved can the symbolics 
				be resolved.
			*/
			rJob.resolveParms();
			/*
				Now must rewrite job with resolved values for parms substituted.
			*/
			File finalJobFile = rJob.rewriteWithParmsResolved();
			rJob.resolveProcs();
			/*
				Now transition from preprocessing to lexing/parsing resolved JCL.
			*/
			ArrayList<Proc> procs = new ArrayList<>();
			ArrayList<Job> jobs = new ArrayList<>();
			lexAndParse(jobs, procs, finalJobFile.getPath(), fileNb);
			jobs.get(0).setTmpDirs(baseDir, rJob.getJobDir(), rJob.getProcDir());
			jobs.get(0).setOrdNb(rJob.getOrdNb());
			jobs.get(0).lexAndParseProcs();
			if (CLI.outcsvFileName == null) {
			} else {
				StringBuffer sb = new StringBuffer();
				sb.append(System.getProperty("line.separator"));
				jobs.get(0).toCSV(sb);
		        outcsv.write(sb.toString());
				LOGGER.fine(sb.toString());
			}
		}
	}

	if (CLI.outcsvFileName == null) {
	} else {
        outcsv.flush();
        outcsv.close();
	}

	LOGGER.info("Processing complete");
}

	public static void lexAndParsePP(
					ArrayList<PPJob> jobs
					, ArrayList<PPProc> procs
					, String fileName
					, int fileNb
					) throws IOException {
		LOGGER.fine("lexAndParsePP jobs = |" + jobs + "| procs = |" + procs + "| fileName = |" + fileName + "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer jcllexer = new JCLPPLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLPPParser jclparser = new JCLPPParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		PPListener jobListener = new PPListener(jobs, procs, fileName, fileNb, LOGGER, CLI);
	
		LOGGER.finer("----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public static void lexAndParse(
					ArrayList<Job> jobs
					, ArrayList<Proc> procs
					, String fileName
					, int fileNb
					) throws IOException {
		LOGGER.fine("lexAndParse jobs = |" + jobs + "| procs = |" + procs + "| fileName = |" + fileName + "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer jcllexer = new JCLLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLParser jclparser = new JCLParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		JobListener jobListener = new JobListener(jobs, procs, fileName, fileNb, LOGGER, CLI);
	
		LOGGER.finer("----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

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

}
