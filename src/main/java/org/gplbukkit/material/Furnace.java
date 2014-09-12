package org.gplbukkit.material;

import org.gplbukkit.Material;
import org.gplbukkit.block.BlockFace;

/**
 * Represents a furnace.
 */
public class Furnace extends FurnaceAndDispenser {

    public Furnace() {
        super(Material.FURNACE);
    }

    /**
     * Instantiate a furnace facing in a particular direction.
     *
     * @param direction the direction the furnace's "opening" is facing
     */
    public Furnace(BlockFace direction) {
        this();
        setFacingDirection(direction);
    }

    /**
     *
     * @deprecated Magic value
     */
    @Deprecated
    public Furnace(final int type) {
        super(type);
    }

    public Furnace(final Material type) {
        super(type);
    }

    /**
     *
     * @deprecated Magic value
     */
    @Deprecated
    public Furnace(final int type, final byte data) {
        super(type, data);
    }

    /**
     *
     * @deprecated Magic value
     */
    @Deprecated
    public Furnace(final Material type, final byte data) {
        super(type, data);
    }

    @Override
    public Furnace clone() {
        return (Furnace) super.clone();
    }
}
