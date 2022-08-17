package dev.kirstree.kits.handlers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class listeners implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {

        if (e.getInventory() == (KitCommands.getKitsGui())) {
            Player p = (Player) e.getWhoClicked();

            switch (e.getSlot()) {
                case 11: {
                    p.closeInventory();
                    ItemStack leatherChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                    //add rest of armour
                    break;
                }
                case 12: {
                    //add more crap
                }
            }
        }
    }
}