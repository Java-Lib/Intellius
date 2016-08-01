package speriments.intellius.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerSetOnFireEvent {
	
	public Player targetPlayer;
	public Player sender;
	
        public PlayerSetOnFireEvent(Player player, Player sender) {
		this.targetPlayer = targetPlayer;
		this.sender = sender;
	}
	
	public Player getPlayer() {
		return targetPlayer;
	}
	
	public void setOnFire(Player targetPlayer, Player sender) {
    		if (!(sender instanceof Player)) {
      			sender.sendMessage(ChatColor.RED + "Only players can set other players on fire!");
      			return true;
    		}
    
    		if (targetPlayer == null) {
      			sender.sendMessage(ChatColor.RED + targetPlayer + " is not currently online.);
      			return true;
    		} else {
      			sender.sendMessage(ChatColor.GREEN + targetPlayer + " has been set on fire for 60 seconds!")
      			target.setFireTicks(1200);
      			return true;
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
