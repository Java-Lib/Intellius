package wylion.intellius.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerWarpEvent extends Event {
	public Player player;
	public Location location;
	public String name;
	
	public PlayerWarpEvent(Player player, Location location, String name) {
		this.player = player;
		this.location = location;
		this.name = name;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public String getName() {
		return name;
	}
	
	private static final HandlerList handlers = new HandlerList();
	 
	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
}
