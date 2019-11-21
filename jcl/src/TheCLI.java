import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.*;
import org.apache.commons.cli.*;

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
	public String outFileName = null;
	public Boolean unitTest = false;
	public Boolean saveTemp = false;
	public File setFile = null;

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
		Option out = new Option("out", true
			, "name of a file in which to store the gathered information");
		Option logLevel = new Option("logLevel", true
			, "logging level for this run {SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST}");
		Option unitTest = new Option("unitTest", false
			, "used to test lexer, parser, listeners, et. al");
		Option saveTemp = new Option("saveTemp", false
			, "save temporary files, used to test lexer, parser, listeners, et. al");
		Option help = new Option("help", false, "print this message");

		this.options.addOption(file);
		this.options.addOption(fileList);
		this.options.addOption(include);
		this.options.addOption(includeList);
		this.options.addOption(set);
		this.options.addOption(setList);
		this.options.addOption(out);
		this.options.addOption(logLevel);
		this.options.addOption(unitTest);
		this.options.addOption(saveTemp);
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

		if (this.line.hasOption("out")) {
			this.outFileName = this.line.getOptionValue("out");
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

}
