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
	public void load() {
		Logfile.info("{PROJECT} by {AUTHOR} running v{VERSION} was loaded!"
			.replace("{PROJECT}", PROJECT)
			.replace("{AUTHOR}", AUTHOR)
			.replace("{VERSION}", VERSION));
	}
	
	@Override
	public void onEnable() {
		Logfile.info("{PROJECT} by {AUTHOR} running v{VERSION} was enabled!"
		       .replace("{PROJECT}", PROJECT)
		       .replace("{AUTHOR}", AUTHOR)
		       .replace("{VERSION}", VERSION));
		if (Data.getData().getProjectName().equalsIgnoreCase(null)) {
			Logfile.severe("There are no Intellius plugins to initialize!");
			Logfile.severe("Disabling Intellius v{VERSION}...".replace("{VERSION}", VERSION));
			onDisable();
		} else {
			Logfile.info("Initialized plugin: " + Data.getData().getProjectName());
		}
	}
	
	@Override
	public void onDisable() {
		Logfile.info("{PROJECT} by {AUTHOR} running v{VERSION} was disabled!"
		       .replace("{PROJECT}", PROJECT)
		       .replace("{AUTHOR}", AUTHOR)
		       .replace("{VERSION}", VERSION));
		if (!Data.getData().getProjectName().equalsIgnoreCase(null)) {
			Logfile.info("Uninitialized plugin: " + Data.getData().getProjectName());
		}		
	}
}
