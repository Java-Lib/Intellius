package speriments.intellius.util;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class Commander {
	public static String NOPERMS = null;
	public static String ONLYCONSOLE = null;
	public static String ONLYPLAYER = null;
	public static void noPermsMsg(String message) {
		if (NOPERMS.equalsIgnoreCase(null)) {
			NOPERMS.equals(ChatColor.GRAY + "NOPERMS isn't set.");
		} else {
			NOPERMS = message;
		}
	}
	
	public static void onlyConsoleMsg(String message) {
		if (ONLYCONSOLE.equalsIgnoreCase(null)) {
			ONLYCONSOLE.equals(ChatColor.GRAY + "ONLYCONSOLE isn't set.");
		} else {
			ONLYCONSOLE = message;
		}
	}

	public static void onlyPlayerMsg(String message) {
		if (ONLYPLAYER.equalsIgnoreCase(null)) {
			ONLYPLAYER.equals(ChatColor.GRAY + "ONLYPLAYER isn't set.");
		} else {
			ONLYPLAYER = message;
		}
	}
	
	abstract public boolean run(CommandSender sender, Player player, String label, String[] args);
}
