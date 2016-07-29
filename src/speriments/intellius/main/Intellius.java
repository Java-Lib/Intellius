package speriments.intellius.main;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Intellius extends JavaPlugin {
	public static final String PROJECT = "Intellius";
	public static final String AUTHOR = "Speriments";
	public static final String VERSION = "Intellius is currently version 1.0";
	public static final String DESCRIPTION = "A Bukkit Library used for coding plugins.";
	public static final Server server = Bukkit.getServer();
	public static Plugin instance;
	public static Intellius main;
	public static Intellius getPlugin() {
		return main;
	}
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
}
