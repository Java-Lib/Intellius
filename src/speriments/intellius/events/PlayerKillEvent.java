package speriments.intellius.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerKillEvent {
  public Player targetPlayer;
  public Player sender;
	
	public PlayerKillEvent(Player player, Player sender) {
		this.targetPlayer = targetPlayer;
		this.sender = sender;
	}
	
	public Player getPlayer() {
		return targetPlayer;
	}
	
	public void killPlayer(Player targetPlayer, Player sender) {
    if (!(sender instanceof Player)) {
      sender.sendMessage(ChatColor.RED + "Only players can kill other players!");
      return true;
    }
    
    if (target == null) {
      sender.sendMessage(ChatColor.RED + targetPlayer + " is not currently online.");
      return true;
    } else {
      targetPlayer.setHealth(0.0D);
      sender.sendMessage(ChatColor.GREEN + targetPlayer + " has been killed!");
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
