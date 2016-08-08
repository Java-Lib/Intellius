package wylion.intellius.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import wylion.intellius.main.Intellius;

public class Utility {
    public static String colorify(String messageToConvert) {
        return ChatColor.translateAlternateColorCodes('&', messageToConvert);
    }
	
	public static void broadcaster(String message, ChatColor color) {
		new BukkitRunnable() {
			@Override
			public void run() {
				Logfile.info(message);
				for (Player player : Bukkit.getOnlinePlayers()) {
					player.sendMessage((color == null ? "" : color) + message);
				}
			}
		}.runTask(Intellius.instance);
	}
	
	public static void broadcaster(String message) {
		new BukkitRunnable() {
			@Override
			public void run() {
				Utility.broadcaster(message, null);
			}
		}.runTask(Intellius.instance);
	}
	
	public static void repeaterBroadcast(String message, int repeats) {
		for (int i = 0; i < repeats; i++) {
			Logfile.info("Repeater has been used for broadcast.");
			Utility.broadcaster(message);
		}
	}
	
	public static void repeaterPlayer(CommandSender sender, String message, int repeats) {
		for (int i = 0; i < repeats; i++) {
			Logfile.info("Repeater has been used for players.");
			sender.sendMessage(message);
		}
	}
}
