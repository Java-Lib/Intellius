package speriments.intellius.util;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;

public class Manager {
	public static final PluginManager pm = Bukkit.getPluginManager();
	public static final Server server = Bukkit.getServer();
	public static Bukkit bukkit;
	public static Server getServer() {
		return server;
	}
	
	public static Bukkit getBukkit() {
		return bukkit;
	}
	
	public static PluginManager getPluginManager() {
		return pm;
	}
}
