package wylion.intellius.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerSetOnFireEvent extends Event {
	
	public Player targetPlayer;
	public Player sender;
	
        public PlayerSetOnFireEvent(Player targetPlayer, Player sender) {
		this.targetPlayer = targetPlayer;
		this.sender = sender;
	}
	
	public Player getPlayer() {
		return targetPlayer;
	}
	
	public void setOnFire(Player targetPlayer, Player sender) {
    		if (!(sender instanceof Player)) {
      			sender.sendMessage(ChatColor.RED + "Only players can set other players on fire!");
      			return;
    		}
    
    		if (targetPlayer == null) {
      			sender.sendMessage(ChatColor.RED + "That player is not online.");
      			return;
    		} else {
      			sender.sendMessage(ChatColor.GREEN + targetPlayer.getName() + " has been set on fire for 60 seconds!");
      			targetPlayer.setFireTicks(1200);
      			return;
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
