package org.gplbukkit.event.enchantment;

import java.util.HashMap;
import java.util.Map;

import org.gplbukkit.block.Block;
import org.gplbukkit.enchantments.Enchantment;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.event.inventory.InventoryEvent;
import org.gplbukkit.inventory.InventoryView;
import org.gplbukkit.inventory.ItemStack;

/**
 * Called when an ItemStack is successfully enchanted (currently at
 * enchantment table)
 */
public class EnchantItemEvent extends InventoryEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Block table;
    private final ItemStack item;
    private int level;
    private boolean cancelled;
    private final Map<Enchantment,Integer> enchants;
    private final Player enchanter;
    private int button;

    public EnchantItemEvent(final Player enchanter, final InventoryView view, final Block table, final ItemStack item, final int level, final Map<Enchantment, Integer> enchants, final int i) {
        super(view);
        this.enchanter = enchanter;
        this.table = table;
        this.item = item;
        this.level = level;
        this.enchants = new HashMap<Enchantment, Integer>(enchants);
        this.cancelled = false;
        this.button = i;
    }

    /**
     * Gets the player enchanting the item
     *
     * @return enchanting player
     */
    public Player getEnchanter() {
        return enchanter;
    }

    /**
     * Gets the block being used to enchant the item
     *
     * @return the block used for enchanting
     */
    public Block getEnchantBlock() {
        return table;
    }

    /**
     * Gets the item to be enchanted (can be modified)
     *
     * @return ItemStack of item
     */
    public ItemStack getItem() {
        return item;
    }

    /**
     * Get cost in exp levels of the enchantment
     *
     * @return experience level cost
     */
    public int getExpLevelCost() {
        return level;
    }

    /**
     * Set cost in exp levels of the enchantment
     *
     * @param level - cost in levels
     */
    public void setExpLevelCost(int level) {
        this.level = level;
    }

    /**
     * Get map of enchantment (levels, keyed by type) to be added to item
     * (modify map returned to change values). Note: Any enchantments not
     * allowed for the item will be ignored
     *
     * @return map of enchantment levels, keyed by enchantment
     */
    public Map<Enchantment, Integer> getEnchantsToAdd() {
        return enchants;
    }

    /**
     * Which button was pressed to initiate the enchanting.
     *
     * @return The button index (0, 1, or 2).
     */
    public int whichButton() {
        return button;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}