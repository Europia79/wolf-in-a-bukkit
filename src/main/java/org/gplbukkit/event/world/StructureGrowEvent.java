package org.gplbukkit.event.world;

import java.util.List;
import org.gplbukkit.Location;
import org.gplbukkit.TreeType;
import org.gplbukkit.block.BlockState;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Event that is called when an organic structure attempts to grow (Sapling ->
 * Tree), (Mushroom -> Huge Mushroom), naturally or using bonemeal.
 */
public class StructureGrowEvent extends WorldEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    private final Location location;
    private final TreeType species;
    private final boolean bonemeal;
    private final Player player;
    private final List<BlockState> blocks;

    public StructureGrowEvent(final Location location, final TreeType species, final boolean bonemeal, final Player player, final List<BlockState> blocks) {
        super(location.getWorld());
        this.location = location;
        this.species = species;
        this.bonemeal = bonemeal;
        this.player = player;
        this.blocks = blocks;
    }

    /**
     * Gets the location of the structure.
     *
     * @return Location of the structure
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Gets the species type (birch, normal, pine, red mushroom, brown
     * mushroom)
     *
     * @return Structure species
     */
    public TreeType getSpecies() {
        return species;
    }

    /**
     * Checks if structure was grown using bonemeal.
     *
     * @return True if the structure was grown using bonemeal.
     */
    public boolean isFromBonemeal() {
        return bonemeal;
    }

    /**
     * Gets the player that created the structure.
     *
     * @return Player that created the structure, null if was not created
     *     manually
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets an ArrayList of all blocks associated with the structure.
     *
     * @return ArrayList of all blocks associated with the structure.
     */
    public List<BlockState> getBlocks() {
        return blocks;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
