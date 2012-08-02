package com.codisimus.plugins.buttonwarp;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
 
public class WarpEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private String warpName;
    private Player player;
 
    public WarpEvent(String warp, Player p) {
    	warpName = warp;
    	player = p;
    }
 
    public String getWarp() {
        return warpName;
    }
    
    public Player getPlayer() {
    	return player;
    }
 
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}