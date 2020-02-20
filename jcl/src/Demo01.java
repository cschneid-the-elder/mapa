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
	ArrayList<PPOp> stmts = new ArrayList<>();
	ArrayList<PPJob> rJobs = new ArrayList<>(); //jobs whose INCLUDEs have been resolved

	for (String aFileName: CLI.fileNamesToProcess) {
		LOGGER.info("Processing file " + aFileName);
		initialProcess(jobs, procs, stmts, aFileName);
		for (PPJob j: jobs) {
			LOGGER.info("Processing job " + j);
			j.resolveParmedIncludes(symbolics);
			LOGGER.finest(j + " stepsInNeedOfProc = " + j.stepsInNeedOfProc());
			File tmpJobDir = newTempDir();
			File tmpProcDir = newTempDir();
			File jobFile = rewriteJobAndSeparateInstreamProcs(j, tmpJobDir, tmpProcDir);
			/*
				Now must iteratively parse this job until all includes 
				are resolved -or- we have determined all that remain are 
				unresolvable includes.
			*/
			PPJob rJob = iterativelyResolveJobIncludes(j, tmpJobDir, tmpProcDir, jobFile);
			rJobs.add(rJob);
			iterativelyResolveJobProcs(rJob, tmpProcDir);
			rJob.resolveParms(symbolics);
			/*
				Includes are resolved to the extent possible.
				Now must rewrite job with resolved values for parms substituted.
				Merge with procs?
			*/
		}
	}


	LOGGER.info("Processing complete");
}

	public static void initialProcess(ArrayList<PPJob> jobs, ArrayList<PPProc> procs, ArrayList<PPOp> stmts, String fileName) throws IOException {
		LOGGER.fine("initialProcess");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer jcllexer = new JCLPPLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLPPParser jclparser = new JCLPPParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		PPListener jobListener = new PPListener(jobs, procs, stmts, fileName);
	
		LOGGER.finer("----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public static File rewriteJobAndSeparateInstreamProcs(PPJob job, File tmpJobDir, File tmpProcDir) throws IOException {
		/*
			Rewrite one job from the current file, separating any instream procs into their own
			files to be processed later.

			After this point the intent is to iteratively process the job until all INCLUDEs are
			resolved.  Potentially, an INCLUDE can contain other INCLUDEs, SETs, and EXECs.
		*/
		/*
			the plan...

			for each job, read a record from its file
				if the record number resides in an instream proc, skip it
				if the record number corresponds to a resolved include,
					skip writing the include, instead read the file it
					refers to and add that to the output in place of the include
				if the record number corresponds to a jclstep _not_ in stepsInNeedOfProc,
					open a new LineNumberReader on the jclstep's file
					read the proc, writing records to a new file
					if the record number corresponds to a resolved include,
						skip writing the include, instead read the file it
						refers to and add that to the output in place of the include
				write the record read to output
		*/
		LOGGER.fine("rewriteJobAndSeparateInstreamProcs job = |" + job + "| tmpJobDir = |" + tmpJobDir + "| tmpProcDir = |" + tmpProcDir + "|");

		File aFile = new File(job.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(tmpJobDir.toString() + File.separator + "job-" + job.getJobName() + "-" + job.getUUID());
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		LOGGER.finest("tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		PPProc aProc = null;
		File procTmp = null;
		PrintWriter procOut = null;
		while ((inLine = src.readLine()) != null) {
			if (job.lineIsInThisJob(src.getLineNumber())) {
			} else {
				continue;
			}
			aProc = job.instreamProcThisLineIsIn(src.getLineNumber());
			if (aProc == null) {
				if (procOut == null) {
				} else {
					procOut.close();
					procTmp = null;
					procOut = null;
				}
				PPIncludeStatement i = job.includeStatementAt(src.getLineNumber());
				if (i == null) {
					out.println(inLine);
				} else {
					if (writeTheIncludeContent(i, out, tmpProcDir, job.getJcllibStrings())) {
					} else {
						out.println(inLine);
					}
				}
			} else {
				if (procOut == null) {
					procTmp = new File(tmpProcDir.toString() + File.separator + aProc.getProcName());
					if (CLI.saveTemp) {
					} else {
						procTmp.deleteOnExit();
					}
					procOut = new PrintWriter(procTmp);
					LOGGER.finest("procTmp = |" + procTmp.getName() + "|");
				}
				procOut.println(inLine);
			}
			if (src.getLineNumber() == job.getEndLine()) break; //end of this job in this file
		}
		src.close();
		out.close();
		return tmp;
	}

	public static Boolean writeTheIncludeContent(
							PPIncludeStatement i
							, PrintWriter out
							, File tmpProcDir
							, ArrayList<String> jcllib)
						throws IOException {

		LOGGER.fine("writeTheIncludeContent i =|" + i + "| tmpProcDir = |" + tmpProcDir.getName() + "|");

		if (i.isResolved()) {
		} else {
			return false;
		}

		Boolean foundIt = true;
		String includeFile = i.getResolvedText();

		String includeFileFull = searchProcPathsFor(includeFile, tmpProcDir, jcllib);

		if (includeFileFull == null) {
			foundIt = false;
			//LOGGER.warning(includeFile + " not found in any path specified");
			//throw new FileNotFoundException(copyFile + " not found in any path specified");
		} else {
			List<String> list = 
				Files.readAllLines(Paths.get(includeFileFull));
			for (String line: list) out.println(line);
		}

		return foundIt;
	}

	public static void writeInstreamProcContent(
							Job job
							, Proc aProc
							, File tmpProcDir)
						throws IOException {

		LOGGER.fine("writeInstreamProcContent");
		File tmp = new File(tmpProcDir.toString() + File.separator + aProc.getProcName());
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		LOGGER.finest("out = |" + out + "|");

		File aFile = new File(job.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));

		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			if (src.getLineNumber() >= aProc.getStartLine()) out.println(inLine);
			if (src.getLineNumber() > aProc.getEndLine()) break;
		}

		src.close();
		out.close();
	}

	public static PPJob iterativelyResolveJobIncludes(PPJob j, File tmpJobDir, File tmpProcDir, File initialJobFile) throws IOException {
		LOGGER.fine("iterativelyResolveJobIncludes j = |" + j + "| tmpJobDir = |" + tmpJobDir.getName() + "| tmpProcDir = |" + tmpProcDir.getName() + "| initialJobFile = |" + initialJobFile.getName() + "|");

		PPJob aJob = j;
		File jobFile = initialJobFile;
		Boolean iterating = true;
		int sanity = 0;
		do {
			LOGGER.finest("jobFile = |" + jobFile.getName() + "|");
			ArrayList<PPIncludeStatement> includes_before = aJob.getAllUnresolvedIncludes();
			ArrayList<PPProc> dummyProcs = new ArrayList<>();
			ArrayList<PPJob> thisJob = new ArrayList<>();
			ArrayList<PPOp> dummyStmts = new ArrayList<>();
			subsequentProcess(thisJob, dummyProcs, dummyStmts, tmpJobDir.getCanonicalPath() + File.separator + jobFile.getName());
			thisJob.get(0).resolveParmedIncludes(symbolics);
			ArrayList<PPIncludeStatement> includes_after = thisJob.get(0).getAllUnresolvedIncludes();
			//are all includes from before still there after? yes = stop iterating
			LOGGER.finest("includes_before = " + includes_before);
			LOGGER.finest("includes_after  = " + includes_after);
			if (includes_after.size() == includes_before.size()) {
				LOGGER.finest("includes_after.size() == includes_before.size()");
				Boolean allContained = true;
				for (PPIncludeStatement ia: includes_after) {
					Boolean contains = false;
					for (PPIncludeStatement ib: includes_before) {
						if (ia.isProbablyTheSame(ib)) {
							LOGGER.finest("ia = |" + ia + "| ib = |" + ib + "| isProbablyTheSame");
							contains = true;
							break;
						}
					}
					allContained = allContained && contains;
				}
				if (allContained) {
					iterating = false;
				}
			} else {
				LOGGER.finest("includes_after.size() != includes_before.size()");
				iterating = true;
			}
			if (iterating) {
				aJob = thisJob.get(0);
				jobFile = aJob.rewriteJobWithIncludesResolved(tmpJobDir, tmpProcDir, CLI.saveTemp);
			}
			sanity++;
		} while(iterating && (sanity < 20));
		if (sanity >= 20) LOGGER.severe("sanity check failed for " + j);

		return aJob;
	}

	public static void subsequentProcess(ArrayList<PPJob> jobs, ArrayList<PPProc> procs, ArrayList<PPOp> stmts, String fileName) throws IOException {
		LOGGER.fine("subsequentProcess jobs = |" + jobs + "| procs = |" + procs + "| fileName = |" + fileName + "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer jcllexer = new JCLPPLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLPPParser jclparser = new JCLPPParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		PPListener jobListener = new PPListener(jobs, procs, stmts, fileName);
	
		LOGGER.finer("----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public static File rewriteJob(PPJob job, File tmpJobDir, File tmpProcDir) throws IOException {
		/*
			Rewrite one job from the current file.

			At this point the intent is to iteratively process the job until all INCLUDEs are
			resolved.  Potentially, an INCLUDE can contain other INCLUDEs, SETs, and EXECs.
		*/
		LOGGER.fine("rewriteJob job = |" + job + "| tmpJobDir = |" + tmpJobDir + "|");

		File aFile = new File(job.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(tmpJobDir.toString() + File.separator + "job-" + job.getJobName() + "-" + job.getUUID());
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		LOGGER.finest("tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			PPIncludeStatement i = job.includeStatementAt(src.getLineNumber());
			if (i == null) {
				out.println(inLine);
			} else {
				if (writeTheIncludeContent(i, out, tmpProcDir, job.getJcllibStrings())) {
				} else {
					out.println(inLine);
				}
			}
		}
		src.close();
		out.close();
		return tmp;
	}

	public static void iterativelyResolveJobProcs(PPJob job, File tmpProcDir) throws IOException {

		for (PPJclStep s: job.getSteps()) {
			if (!s.isExecProc()) continue;
			String procFileName = s.getProcExecuted();
		}
	}

	public static void writeTheProcContent(
							Job job
							, JclStep step
							, File tmpProcDir)
						throws IOException {

		/*
			Multiple steps may execute the same instream proc, must keep
			them separate but locatable.  Using proc UUID + step UUID to
			generate unique name.  Processing one job at a time, else we
			would need to append job UUID to ensure uniqueness.
		*/

		LOGGER.fine("writeTheProcContent");
		File tmp = new File(tmpProcDir.toString() + File.separator + "proc-" + step.getProc().getProcName() + "-" + step.getProc().getUUID() + "-" + step.getUUID());
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		LOGGER.finest("out = |" + out + "|");

		File aFile = new File(job.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));

		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			if (src.getLineNumber() >= step.getProc().getStartLine()) out.println(inLine);
			if (src.getLineNumber() > step.getProc().getEndLine()) break;
		}

		src.close();
		out.close();
		step.getProc().setFileName(out.toString());
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

	public static String searchProcPathsFor(String fileName, File tmpProcDir, ArrayList<String> jcllib) throws IOException {
		File aFile = new File(tmpProcDir.getName() + File.separator + fileName);
		if (aFile.exists()) {
			LOGGER.finer("searchProcPathsFor() found " + aFile.getCanonicalPath());
			return aFile.getCanonicalPath();
		}

		for (String lib: jcllib) {
			if (CLI.mappedProcPaths.containsKey(lib)) {
				aFile = new File(CLI.mappedProcPaths.get(lib) + File.separator + fileName);
				if (aFile.exists()) {
					LOGGER.finer("searchProcPathsFor() found " + aFile.getCanonicalPath());
					return aFile.getCanonicalPath();
				}
			}
		}

		for (String path: CLI.staticProcPaths) {
			aFile = new File(path + File.separator + fileName);
			if (aFile.exists()) {
				LOGGER.finer("searchProcPathsFor() found " + aFile.getCanonicalPath());
				return aFile.getCanonicalPath();
			}
		}

		LOGGER.warning("searchProcPathsFor() did not find " + fileName);
		return null;
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

	public static ArrayList<IncludeStatement> lookForIncludes(String fileName) throws IOException {
		LOGGER.fine("lookForIncludes");
		ArrayList<IncludeStatement> includes = new ArrayList<>();
		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer jcllexer = new JCLLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLParser jclparser = new JCLParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		IncludeStatementListener includeStatementListener = new IncludeStatementListener(includes, fileName);
	
		LOGGER.finer("----------walking tree with includeStatementListener");
	
		jclwalker.walk(includeStatementListener, jcltree);

		return includes;
		
	}

	public static ArrayList<JobCardWrapper> lookForJobs(String fileName) throws IOException {
		LOGGER.fine("lookForJobs");
		ArrayList<JobCardWrapper> jobs = new ArrayList<>();
		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer jcllexer = new JCLLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLParser jclparser = new JCLParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		JobCardListener jobCardListener = new JobCardListener(jobs, fileName);
	
		LOGGER.finer("----------walking tree with jobCardListener");
	
		jclwalker.walk(jobCardListener, jcltree);

		return jobs;
		
	}

	public static String setSymbolsOnIncludeStatements(
							ArrayList<SetSymbolValue> sets
							, ArrayList<IncludeStatement> includes
							, String fileName) 
						throws IOException {
		LOGGER.fine("setSymbolsOnIncludeStatements");
		LineNumberReader src = new LineNumberReader(new FileReader( new File(fileName)));
		File tmp = File.createTempFile("Demo01-", "-jcl", new File("./"));
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		PrintWriter out = new PrintWriter(tmp);
		String inLine = src.readLine();

		fileName = tmp.getPath();
		return fileName;
	}

}
