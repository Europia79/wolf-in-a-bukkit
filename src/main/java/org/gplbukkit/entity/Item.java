package org.gplbukkit.entity;

import org.gplbukkit.inventory.ItemStack;

/**
 * Represents an Item.
 */
public interface Item extends Entity {

    /**
     * Gets the item stack associated with this item drop.
     *
     * @return An item stack.
     */
    public ItemStack getItemStack();

    /**
     * Sets the item stack associated with this item drop.
     *
     * @param stack An item stack.
     */
    public void setItemStack(ItemStack stack);

    /**
     * Gets the delay before this Item is available to be picked up by players
     *
     * @return Remaining delay
     */
    public int getPickupDelay();

    /**
     * Sets the delay before this Item is available to be picked up by players
     *
     * @param delay New delay
     */
    public void setPickupDelay(int delay);
}