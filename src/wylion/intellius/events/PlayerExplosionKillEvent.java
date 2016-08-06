package wylion.intellius.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerExplosionKillEvent extends Event {
  	
  	public Player targetPlayer;
  	public Player sender;
  	public float explosionPower = 4F;
	
	public PlayerExplosionKillEvent(Player targetPlayer, Player sender, float explosionPower) {
		this.targetPlayer = targetPlayer;
		this.sender = sender;
		this.explosionPower = explosionPower;
	}
	
	public Player getPlayer() {
		return targetPlayer;
	}
	
	public void killPlayer(Player targetPlayer, Player sender, float explosionPower) {
    		if (!(sender instanceof Player)) {
      			sender.sendMessage(ChatColor.RED + "Only players can kill other players!");
      			return;
    		}
    
    		if (targetPlayer == null) {
      			sender.sendMessage(ChatColor.RED + "That player is not online.");
      			return;
    		} else {
            		targetPlayer.getWorld().createExplosion(targetPlayer.getLocation(), explosionPower);
      			targetPlayer.setHealth(0.0D);
      			sender.sendMessage(ChatColor.GREEN + targetPlayer.getName() + " has been killed by an explosion!");
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
