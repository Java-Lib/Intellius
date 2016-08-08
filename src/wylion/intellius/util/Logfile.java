package wylion.intellius.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import wylion.intellius.main.Intellius;

public class Logfile {
	public static final Logger logger = Logger.getLogger("Minecraft");
	public Logfile() {
		throw new AssertionError();
	}
	
	public static void log(Level level, String message, boolean raw) {
		logger.log(level, (raw ? "" : "[" + Intellius.PROJECT + "]: ") + message);
	}
	
	public static void info(String message) {
		log(Level.INFO, message, false);
	}
	
	public static void warning(String message) {
		log(Level.WARNING, message, false);
	}
	
	public static void severe(String message) {
		log(Level.SEVERE, message, false);
	}
}
