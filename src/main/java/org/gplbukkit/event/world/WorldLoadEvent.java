package org.gplbukkit.event.world;

import org.gplbukkit.World;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a World is loaded
 */
public class WorldLoadEvent extends WorldEvent {
    private static final HandlerList handlers = new HandlerList();

    public WorldLoadEvent(final World world) {
        super(world);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}