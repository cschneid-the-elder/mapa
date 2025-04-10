/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.logging.*;
import org.apache.commons.cli.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class serves two purposes, it encapsulates the parsing of command
line options and it gets passed around as a global repositor of those
option values.  It is growing into a utility class, which may bear
future refactoring.  Or not.
*/
public class TheCLI{
	public final Logger LOGGER = Logger.getLogger(Demo01.class.getName());
	public String[] args = null;
	public Options options = new Options();
	public CommandLineParser parser = new DefaultParser();
	public CommandLine line = null;
	public HelpFormatter formatter = new HelpFormatter();
	public ArrayList<String> fileNamesToProcess = new ArrayList<>();
	public ArrayList<String> staticProcPaths = new ArrayList<>();
	public Hashtable<String, String> mappedProcPaths = new Hashtable<>();
	public Hashtable<String, String> mappedCntlPaths = new Hashtable<>();
	public String outcsvFileName = null;
	public String outtreeFileName = null;
	public Boolean unitTest = false;
	public Boolean saveTemp = false;
	public Integer sanity = 20;
	public File setFile = null;
	public ArrayList<SetSymbolValue> setSym = new ArrayList<>();
	public ArrayList<PPSetSymbolValue> PPsetSym = new ArrayList<>();
	private String myName = this.getClass().getName();

	public TheCLI(String[] args) throws Exception {

		this.args = args;

		Option file = new Option("file", true
			, "name of a single file to process, takes precedence over the fileList option");
		Option fileList = new Option("fileList", true
			, "name of a file containing a list of files to process");
		Option include = new Option("include", true
			, "name of a single path in which to locate cataloged procs and JCL INCLUDEs, takes precedence over the includeList option");
		Option includeList = new Option("includeList", true
			, "name of a comma-delimited file containing a list of paths in which to locate cataloged procs and JCL INCLUDEs and the PDS(E)s to which they correspond");
		Option set = new Option("set", true
			, "symbol=value to be used in resolving symbolics (ex: SYSUID=IBMUSER)");
		Option setList = new Option("setList", true
			, "name of a file containing symbol=value pairs (one per line) to be used in resolving symbolics (ex: SYSUID=IBMUSER)");
		Option cntlList = new Option("cntlList", true
			, "name of a comma-delimited file containing a list of paths in which to locate control statement members and the PDS(E)s to which they correspond");
		Option outcsv = new Option("outcsv", true
			, "name of a file in which to store the gathered information in csv format");
		Option outtree = new Option("outtree", true
			, "name of a file in which to store the gathered information in \"tree\" format");
		Option logLevel = new Option("logLevel", true
			, "logging level for this run {SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST}");
		Option unitTest = new Option("unitTest", false
			, "used to test lexer, parser, listeners, et. al");
		Option saveTemp = new Option("saveTemp", false
			, "save temporary files, used to test lexer, parser, listeners, et. al");
		Option sanity = new Option("sanity", true
			, "used to limit the number of iterations when resolving INCLUDEs {default = 20}");
		Option help = new Option("help", false, "print this message");

		this.options.addOption(file);
		this.options.addOption(fileList);
		this.options.addOption(include);
		this.options.addOption(includeList);
		this.options.addOption(set);
		this.options.addOption(setList);
		this.options.addOption(cntlList);
		this.options.addOption(outcsv);
		this.options.addOption(outtree);
		this.options.addOption(logLevel);
		this.options.addOption(unitTest);
		this.options.addOption(saveTemp);
		this.options.addOption(sanity);
		this.options.addOption(help);

		try {
			this.line = parser.parse( options, args );
		} catch( ParseException exp ) {
			this.LOGGER.severe( "Command line parsing failed.  Reason: " + exp.getMessage() );
			System.exit(16);
		}

		if (this.line.hasOption("help")) {
			this.formatter.printHelp( "Demo01", options, true );
			System.exit(0);
		}

		if (this.line.hasOption("file")) {
			this.fileNamesToProcess.add(this.line.getOptionValue("file"));
		} else if (this.line.hasOption("fileList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("fileList")));
			this.fileNamesToProcess.addAll(list);
		} else {
			this.LOGGER.info("Either the file or the fileList option must be provided");
			this.formatter.printHelp( "Demo01", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("include")) {
			this.staticProcPaths.add(this.line.getOptionValue("include"));
		} else if (this.line.hasOption("includeList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("includeList")));
			for (String rec: list) {
				if (rec.contains(",")) {
					String[] kv = rec.split(",");
					mappedProcPaths.put(kv[1], kv[0]);
				} else {
					this.staticProcPaths.add(rec);
				}
			}
		} else {
			this.LOGGER.info("Either the include or the includeList option must be provided");
			this.formatter.printHelp( "Demo01", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("set")) {
			this.setFile = this.writeSet();
		} else if (this.line.hasOption("setList")) {
			this.setFile = this.writeSetFile();
		}

		if (this.line.hasOption("cntlList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("cntlList")));
			for (String rec: list) {
				if (rec.contains(",")) {
					String[] kv = rec.split(",");
					mappedCntlPaths.put(kv[0], kv[1]);
					this.LOGGER.finest("CLI kv[0] = |" + kv[0] + "| kv[1] = |" + kv[1] + "|");
				}
			}
		} else {
			this.LOGGER.info("Control statements will not be processed");
		}

		if (this.line.hasOption("outcsv")) {
			this.outcsvFileName = this.line.getOptionValue("outcsv");
		}

		if (this.line.hasOption("outtree")) {
			this.outtreeFileName = this.line.getOptionValue("outtree");
		}

		if (this.line.hasOption("logLevel")) {
			switch(this.line.getOptionValue("logLevel")) {
				case "SEVERE":
					this.LOGGER.setLevel(Level.SEVERE);
					break;
				case "WARNING":
					this.LOGGER.setLevel(Level.WARNING);
					break;
				case "INFO":
					this.LOGGER.setLevel(Level.INFO);
					break;
				case "CONFIG":
					this.LOGGER.setLevel(Level.CONFIG);
					break;
				case "FINE":
					this.LOGGER.setLevel(Level.FINE);
					break;
				case "FINER":
					this.LOGGER.setLevel(Level.FINER);
					break;
				case "FINEST":
					this.LOGGER.setLevel(Level.FINEST);
					break;
				case "ALL":
					this.LOGGER.setLevel(Level.ALL);
					break;
				case "OFF":
					this.LOGGER.setLevel(Level.OFF);
					break;
				default:
					this.LOGGER.config("Unrecognized logLevel option " + this.line.getOptionValue("LogLevel"));
			}
		} else {
			this.LOGGER.setLevel(Level.INFO);
			this.LOGGER.info("Logging level set to " + this.LOGGER.getLevel());
		}

		if (this.line.hasOption("unitTest")) {
			this.unitTest = true;
			if (this.line.hasOption("logLevel")) {
				if (this.line.getOptionValue("logLevel").equals("FINE")
				||  this.line.getOptionValue("logLevel").equals("FINER")
				||  this.line.getOptionValue("logLevel").equals("FINEST")) {
				} else {
					this.LOGGER.setLevel(Level.FINE);
					this.LOGGER.info("overriding logLevel");
				}
			} else {
				this.LOGGER.setLevel(Level.FINE);
			}
			this.LOGGER.info("unit testing is in effect");
		}

		if (this.line.hasOption("saveTemp")) {
			this.saveTemp = true;
			this.LOGGER.info("temporary files will be preserved");
		}

		if (this.line.hasOption("sanity")) {
			this.sanity = Integer.parseInt(this.line.getOptionValue("sanity"));
		}

		/*
		Initial setup.  Get symbolics and their values as specified on command line.
		*/
		if (this.setFile != null) {
			this.PPsetSym = lookForPPSetSymbols(this.setFile.getCanonicalPath());
			this.setSym = lookForSetSymbols(this.setFile.getCanonicalPath());
		}

	}

	public int getSanity() {
		return sanity.intValue();
	}

	private File writeSet() throws IOException {
		String aString = this.line.getOptionValue("set");
		File tmpDir = this.newTempDir();
		File tmp = new File(tmpDir.toString() + File.separator + "set-" + UUID.randomUUID());
		tmp.deleteOnExit();
		PrintWriter out = new PrintWriter(tmp);
		out.printf("//UNUSED JOB\n");
		out.printf("// SET %s\n", aString);
		out.close();

		return tmp;
	}

	private File writeSetFile() throws IOException {
		String aString = new String();
		File aFile = new File(this.line.getOptionValue("setFile"));
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmpDir = this.newTempDir();
		File tmp = new File(tmpDir.toString() + File.separator + "set-" + UUID.randomUUID());
		tmp.deleteOnExit();
		PrintWriter out = new PrintWriter(tmp);
		out.printf("//UNUSED JOB\n");

		while ((aString = src.readLine()) != null) {
			out.printf("// SET %s\n", aString);
		}
		out.close();
		src.close();

		return tmp;
	}

	public File newTempDir() throws IOException {
		File tmpDir = Files.createTempDirectory("Demo01-").toFile();

		tmpDir.deleteOnExit();

		return tmpDir;
	}

	public ArrayList<PPSetSymbolValue> lookForPPSetSymbols(String fileName) throws IOException {
		this.LOGGER.fine("lookForSetSymbols");
		ArrayList<PPSetSymbolValue> sets = new ArrayList<>();
		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer lexer = new JCLPPLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		JCLPPParser parser = new JCLPPParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		PPSetSymbolValueListener listener = new PPSetSymbolValueListener(sets, fileName, this.LOGGER, this);
	
		this.LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

		return sets;
		
	}

	public ArrayList<SetSymbolValue> lookForSetSymbols(String fileName) throws IOException {
		this.LOGGER.fine("lookForSetSymbols");
		ArrayList<SetSymbolValue> sets = new ArrayList<>();
		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer lexer = new JCLLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		JCLParser parser = new JCLParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		SetSymbolValueListener listener = new SetSymbolValueListener(sets, fileName, this.LOGGER, this);
	
		this.LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

		return sets;
		
	}

	/**
	Used to create temporary directories.  Global.
	*/
	public File newTempDir(File baseDir, String prfx, Boolean saveTemp) {
		File tmpDir = null;
		try {
			tmpDir = Files.createTempDirectory(baseDir.toPath(), prfx).toFile();
		} catch (Exception e) {
			this.LOGGER.severe(this.myName + " Exception " + e + " encountered in newTempDir");
			e.printStackTrace();
			System.exit(16);
		}

		this.setPosixAttributes(tmpDir);

		if (saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	/**
	Used to set file attributes if necessary.  Global.
	*/
	public void setPosixAttributes(File aFile) {
		String attr = null;

		if (aFile.isDirectory()) {
			attr = "rwxr-x---";
		} else {
			attr = "rw-r-----";
		}

		if (aFile.toPath().getFileSystem().supportedFileAttributeViews().contains("posix")) {
			Set<PosixFilePermission> perms = PosixFilePermissions.fromString(attr);
			try {
				Files.setPosixFilePermissions(aFile.toPath(), perms);
			} catch (Exception e) {
				this.LOGGER.severe(this.myName + " Exception " + e + " encountered in setPosixAttributes");
				e.printStackTrace();
				System.exit(16);
			}
		}
	}
}
