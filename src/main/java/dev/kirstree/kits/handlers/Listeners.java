package dev.kirstree.kits.handlers;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class Listeners implements Listener {

    private static ItemStack enchantment(ItemStack itemStack, Enchantment enchantment) {
        ItemMeta meta = Objects.requireNonNull(itemStack.getItemMeta());
        meta.addEnchant(enchantment,1, true);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {

        if (e.getInventory() == (KitCommands.getKitsGui())) {
            Player p = (Player) e.getWhoClicked();

            switch (e.getSlot()) {
                case 11: {
                    p.closeInventory();
                    ItemStack leatherHelmet = enchantment(new ItemStack(Material.LEATHER_HELMET), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack leatherChest = enchantment(new ItemStack(Material.LEATHER_CHESTPLATE), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack leatherLeggings = enchantment(new ItemStack(Material.LEATHER_LEGGINGS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack leatherBoots = enchantment(new ItemStack(Material.LEATHER_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack woodenSword = enchantment(new ItemStack(Material.WOODEN_SWORD), Enchantment.DAMAGE_ALL);
                    p.getInventory().addItem(leatherBoots, leatherChest, leatherHelmet, leatherLeggings, woodenSword);
                    break;
                }
                case 12: {
                    p.closeInventory();
                    ItemStack goldHelmet = enchantment(new ItemStack(Material.GOLDEN_HELMET), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack goldChest = enchantment(new ItemStack(Material.GOLDEN_CHESTPLATE), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack goldLeggings = enchantment(new ItemStack(Material.GOLDEN_LEGGINGS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack goldBoots = enchantment(new ItemStack(Material.GOLDEN_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack goldSword = enchantment(new ItemStack(Material.GOLDEN_SWORD), Enchantment.DAMAGE_ALL);
                    p.getInventory().addItem(goldBoots, goldChest, goldHelmet, goldLeggings, goldSword);
                    break;
                }
                case 13: {
                    p.closeInventory();
                    ItemStack ironHelmet = enchantment(new ItemStack(Material.IRON_HELMET), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack ironChest = enchantment(new ItemStack(Material.IRON_CHESTPLATE), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack ironLeggings = enchantment(new ItemStack(Material.IRON_LEGGINGS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack ironBoots = enchantment(new ItemStack(Material.IRON_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack ironSword = enchantment(new ItemStack(Material.IRON_SWORD), Enchantment.DAMAGE_ALL);
                    p.getInventory().addItem(ironBoots, ironChest, ironHelmet, ironLeggings, ironSword);
                    break;
                }
                case 14: {
                    p.closeInventory();
                    ItemStack diamondHelmet = enchantment(new ItemStack(Material.DIAMOND_HELMET), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack diamondChest = enchantment(new ItemStack(Material.DIAMOND_CHESTPLATE), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack diamondLeggings = enchantment(new ItemStack(Material.DIAMOND_LEGGINGS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack diamondBoots = enchantment(new ItemStack(Material.DIAMOND_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack diamondSword = enchantment(new ItemStack(Material.DIAMOND_SWORD), Enchantment.DAMAGE_ALL);
                    p.getInventory().addItem(diamondBoots, diamondChest, diamondHelmet, diamondLeggings, diamondSword);
                    break;
                }
                case 15: {
                    p.closeInventory();
                    ItemStack netheriteHelmet = enchantment(new ItemStack(Material.NETHERITE_HELMET), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack netheriteChest = enchantment(new ItemStack(Material.NETHERITE_CHESTPLATE), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack netheriteLeggings = enchantment(new ItemStack(Material.NETHERITE_LEGGINGS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack netheriteBoots = enchantment(new ItemStack(Material.NETHERITE_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL);
                    ItemStack netheriteSword = enchantment(new ItemStack(Material.NETHERITE_SWORD), Enchantment.DAMAGE_ALL);
                    p.getInventory().addItem(netheriteBoots, netheriteChest, netheriteHelmet, netheriteLeggings, netheriteSword);
                    break;
                }
            }
        }
    }
}


