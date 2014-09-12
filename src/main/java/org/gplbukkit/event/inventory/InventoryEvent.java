
package org.gplbukkit.event.inventory;

import java.util.List;

import org.gplbukkit.event.HandlerList;
import org.gplbukkit.entity.HumanEntity;
import org.gplbukkit.event.Event;
import org.gplbukkit.inventory.Inventory;
import org.gplbukkit.inventory.InventoryView;

/**
 * Represents a player related inventory event
 */
public class InventoryEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    protected InventoryView transaction;

    public InventoryEvent(InventoryView transaction) {
        this.transaction = transaction;
    }

    /**
     * Gets the primary Inventory involved in this transaction
     *
     * @return The upper inventory.
     */
    public Inventory getInventory() {
        return transaction.getTopInventory();
    }

    /**
     * Gets the list of players viewing the primary (upper) inventory involved
     * in this event
     *
     * @return A list of people viewing.
     */
    public List<HumanEntity> getViewers() {
        return transaction.getTopInventory().getViewers();
    }

    /**
     * Gets the view object itself
     *
     * @return InventoryView
     */
    public InventoryView getView() {
        return transaction;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}