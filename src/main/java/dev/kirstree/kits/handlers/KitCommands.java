package dev.kirstree.kits.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class KitCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            kits((Player) sender);
            return true;
        } else {
            Bukkit.getLogger().info("You must be in game to execute this command.");
        }
        return true;
    }

    private static Inventory kitsGui;

    public static Inventory getKitsGui(){
        return kitsGui;
    }

    private void kits(Player p){

        kitsGui = Bukkit.createInventory(null, InventoryType.CHEST, ChatColor.AQUA + "Select a kit");

        ArmourTypes leather = new ArmourTypes( "Leather", Material.LEATHER_CHESTPLATE, ChatColor.RED);
        ArmourTypes gold = new ArmourTypes("Gold", Material.GOLDEN_CHESTPLATE, ChatColor.GOLD);
        ArmourTypes iron = new ArmourTypes("Iron", Material.IRON_CHESTPLATE, ChatColor.GRAY);
        ArmourTypes diamond = new ArmourTypes("Diamond", Material.DIAMOND_CHESTPLATE, ChatColor.AQUA);
        ArmourTypes netherite = new ArmourTypes("Netherite", Material.NETHERITE_CHESTPLATE, ChatColor.DARK_PURPLE);

        ItemStack grayPane = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta grayPaneMeta = grayPane.getItemMeta();
        assert grayPaneMeta != null;
        grayPaneMeta.setDisplayName("-----");
        grayPane.setItemMeta(grayPaneMeta);

        kitsGui.setItem(11, leather);
        kitsGui.setItem(12, gold);
        kitsGui.setItem(13, iron);
        kitsGui.setItem(14, diamond);
        kitsGui.setItem(15, netherite);
    }


    public static class ArmourTypes extends ItemStack {
        public String name;
        public Material material;
        public ChatColor color;

        public ArmourTypes(String name, Material material, ChatColor color) {
            this.name = name;
            this.material = material;
            this.color = color;


        }
    }



}
