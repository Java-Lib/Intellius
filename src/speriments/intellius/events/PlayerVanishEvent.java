package speriments.intellius.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerVanishEvent extends Event {
	public Player player;
	public String vanish;
	
	public PlayerVanishEvent(Player player, String vanish) {
		this.player = player;
		this.vanish = vanish;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setVanish(Player player, boolean trueOrFalse) {
		if (trueOrFalse == true) {
			player.hidePlayer(player);
		} else {
			player.showPlayer(player);
		}
	}
	
	private static final HandlerList handlers = new HandlerList();
	 
	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
}
