package org.gplbukkit.event.world;

import org.gplbukkit.Chunk;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a chunk is loaded
 */
public class ChunkLoadEvent extends ChunkEvent {
    private static final HandlerList handlers = new HandlerList();
    private final boolean newChunk;

    public ChunkLoadEvent(final Chunk chunk, final boolean newChunk) {
        super(chunk);
        this.newChunk = newChunk;
    }

    /**
     * Gets if this chunk was newly created or not.
     * <p>
     * Note that if this chunk is new, it will not be populated at this time.
     *
     * @return true if the chunk is new, otherwise false
     */
    public boolean isNewChunk() {
        return newChunk;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
