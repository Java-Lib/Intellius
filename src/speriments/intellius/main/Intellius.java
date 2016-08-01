package speriments.intellius.main;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import speriments.intellius.util.Data;
import speriments.intellius.util.Logfile;

public class Intellius extends JavaPlugin {
	
	public static final String PROJECT = "Intellius";
	public static final String AUTHOR = "Speriments";
	public static final String VERSION = "1.0";
	public static final String DESCRIPTION = "A Bukkit Library used for coding plugins.";
	public static final Server server = Bukkit.getServer();
	public static Plugin instance;
	public static Intellius main;
	
	public static Intellius getPlugin() {
		return main;
	}
	
	@Override
	public void onEnable() {
		Logfile.info("{PROJECT} by {AUTHOR} running v{VERSION} was loaded."
		       .replace("{PROJECT}", PROJECT)
		       .replace("{AUTHOR}", AUTHOR)
		       .replace("{VERSION}", VERSION));
		if (Data.getData().getProjectName().equalsIgnoreCase(null)) {
			Logfile.info("There are no Intellius plugins to initialize.");
		} else {
			Logfile.info("Initialized plugin: " + Data.getData().getProjectName());
		}
	}
	
	@Override
	public void onDisable() {
		Logfile.info("{PROJECT} by {AUTHOR} running v{VERSION} was unloaded."
		       .replace("{PROJECT}", PROJECT)
		       .replace("{AUTHOR}", AUTHOR)
		       .replace("{VERSION}", VERSION));
		if (!Data.getData().getProjectName().equalsIgnoreCase(null)) {
			Logfile.info("Uninitialized plugin: " + Data.getData().getProjectName());
		}		
	}
}
