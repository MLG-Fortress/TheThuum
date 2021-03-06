package com.reilaos.bukkit.TheThuum.shouts;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

/**
 * Created by RoboMWM on 2/4/2017.
 * @see com.reilaos.bukkit.TheThuum.Shared#getAreaOfEffect(Player, int, int)
 */
public class ShoutAreaOfEffectEvent extends Event
{
    // Custom Event Requirements
    private static final HandlerList handlers = new HandlerList();
    public static HandlerList getHandlerList() {
        return handlers;
    }
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    List<Entity> affectedEntities;
    Player player;

    public ShoutAreaOfEffectEvent(List<Entity> affectedEntities, Player player)
    {
        this.affectedEntities = affectedEntities;
        this.player = player;
    }

    public List<Entity> getAffectedEntities()
    {
        return this.affectedEntities;
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setAffectedEntities(List<Entity> newAffectedEntities)
    {
        this.affectedEntities = newAffectedEntities;
    }
}
