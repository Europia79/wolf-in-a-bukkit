package org.gplbukkit.projectiles;

import org.gplbukkit.block.Block;

public interface BlockProjectileSource extends ProjectileSource {

    /**
     * Gets the block this projectile source belongs to.
     *
     * @return Block for the projectile source
     */
    public Block getBlock();
}
