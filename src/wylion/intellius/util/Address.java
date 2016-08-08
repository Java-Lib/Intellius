package wylion.intellius.util;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerLoginEvent;

public class Address {
	public static Address networkData;
	public static Address getNetworkData() {
		return networkData;
	}
	
	public String getUserIp(Player player) {
		return player.getAddress().getAddress().getHostAddress().trim();
	}
	
	public String getUserIp(PlayerLoginEvent event) {
		return event.getAddress().getHostAddress().trim();
	}
	
	public Integer getUserPort(Player player) {
		return player.getAddress().getPort();
	}
}
