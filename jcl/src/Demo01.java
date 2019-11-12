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
		System.exit(16);
	}

	CLI = new TheCLI(args);
	String cwFileName = null; //current work file name
	ArrayList<SetSymbolValue> sets = new ArrayList<>();
	ArrayList<Proc> procs = new ArrayList<>();
	ArrayList<IncludeStatement> includes = new ArrayList<>();
	ArrayList<Job> jobs = new ArrayList<>();

	for (String aFileName: CLI.fileNamesToProcess) {
		LOGGER.info("Processing " + aFileName);
		initialProcess(jobs, procs, aFileName);
		for (Job j: jobs) {
			j.resolveParmedIncludes();
			LOGGER.finest(j + " stepsInNeedOfProc = " + j.stepsInNeedOfProc());
			File tmpJobDir = newTempDir();
			File tmpProcDir = newTempDir();
			rewriteJob(j, tmpJobDir, tmpProcDir);
			/*
				Now must iteratively parse this job until all includes and procs
				are resolved.
			*/
		}
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
	}


	LOGGER.info("Processing complete");
}

	public static void initialProcess(ArrayList<Job> jobs, ArrayList<Proc> procs, String fileName) throws IOException {
		LOGGER.fine("initialProcess");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer jcllexer = new JCLLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLParser jclparser = new JCLParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		JobListener jobListener = new JobListener(jobs, procs, fileName);
	
		LOGGER.finer("----------walking tree with JobListener");
	
		jclwalker.walk(jobListener, jcltree);

	}

	public static void rewriteJob(Job job, File tmpJobDir, File tmpProcDir) throws IOException {
		LOGGER.fine("rewriteJob job = |" + job + "| tmpJobDir = |" + tmpJobDir + "| tmpProcDir = |" + tmpProcDir + "|");

		ArrayList<JclStep> inNeedOfProc = job.stepsInNeedOfProc();
		File aFile = new File(job.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(tmpJobDir.toString() + File.separator + "job-" + job.getUUID());
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		LOGGER.finest("out = |" + out + "|");
		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			if (job.lineIsInInstreamProc(src.getLineNumber())) {
				/*
					Deliberately drop these lines, they will be picked up
					when the step executing the instream proc is processed.
				*/
			} else {
				IncludeStatement i = job.includeStatementAt(src.getLineNumber());
				if (i == null) {
					JclStep step = job.jclStepAt(src.getLineNumber());
					if (step == null) {
						out.println(inLine);
					} else {
							if (step.isExecProc() && !inNeedOfProc.contains(step)) {
							/*
								This step executed an instream proc, the content of
								which will now be written to a file external to the
								job, effectively making it appear as a cataloged
								proc in subsequent processing.
							*/
							writeTheProcContent(job, step, tmpProcDir);
						} else {
							out.println(inLine);
						}
					}
				} else {
					writeTheIncludeContent(i, out);
				}
				}
			if (src.getLineNumber() == job.getEndLine()) break; //end of this job in this file
		}
	}

	public static void writeTheIncludeContent(
							IncludeStatement i
							, PrintWriter out)
						throws IOException {

		LOGGER.fine("writeTheIncludeContent");
		String includeFileFull = null;
		String includeFile = i.getResolvedText();

		for (String path: CLI.copyPaths) {
			File aFile = new File(path + "/" + includeFile);
			if (aFile.exists()) {
				includeFileFull = path + "/" + includeFile;
				break;
			}
		}

		if (includeFileFull == null) {
			LOGGER.warning(includeFile + " not found in any path specified");
			//throw new FileNotFoundException(copyFile + " not found in any path specified");
		} else {
			List<String> list = 
				Files.readAllLines(Paths.get(includeFileFull));
			for (String line: list) out.println(line);
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
		File tmp = new File(tmpProcDir.toString() + File.separator + "proc-" + step.getProc().getUUID() + step.getUUID());
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
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-xr-x");
		FileAttribute<Set<PosixFilePermission>> attr =
			PosixFilePermissions.asFileAttribute(perms);
		File tmpDir = Files.createTempDirectory("Demo01-", attr).toFile();

		if (CLI.saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	public static ArrayList<SetSymbolValue> lookForSetSymbols(String fileName) throws IOException {
		LOGGER.fine("lookForSetSymbols");
		ArrayList<SetSymbolValue> sets = new ArrayList<>();
		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer jcllexer = new JCLLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLParser jclparser = new JCLParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		SetSymbolValueListener setSymbolValueListener = new SetSymbolValueListener(sets, fileName);
	
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
