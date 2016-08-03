package speriments.intellius.util;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class Settings {
	public static Settings settings = new Settings();
	public static FileConfiguration config;
	public static Plugin plugin;
	public static File cfile;
	public static Settings getSettings() {
		return settings;
	}
	
	public static void load() {
		cfile = new File(plugin.getDataFolder(), "config.yml");
		config = plugin.getConfig();
		if (!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();
		}
		
		if (!cfile.exists()) {
			try {
				cfile.createNewFile();
			} catch (Exception e) {
				Logfile.severe("Unable to create the configuration.");
			}
		}
	}
	
	 public FileConfiguration getConfig() { 
		 return config;
	 }
	 
	 public void saveConfig() {
		 try {
			 config.save(cfile);
		 } catch (IOException e) {
			 Logfile.severe("Could not save the configuration!");
		 }
	 }
	 
	    public void reloadConfig() {
	        config = YamlConfiguration.loadConfiguration(cfile);
	    }	 
}
