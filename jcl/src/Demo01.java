import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.nio.file.*;
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
		}
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
