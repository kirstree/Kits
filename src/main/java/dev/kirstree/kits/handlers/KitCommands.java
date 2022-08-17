package dev.kirstree.kits.handlers;

import dev.kirstree.kits.Kits;
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

        ArmourType leather = new ArmourType( "Leather", 11, Material.LEATHER_CHESTPLATE, ChatColor.RED);
        ArmourType gold = new ArmourType("Gold", 12, Material.GOLDEN_CHESTPLATE, ChatColor.GOLD);
        ArmourType iron = new ArmourType("Iron", 13, Material.IRON_CHESTPLATE, ChatColor.GRAY);
        ArmourType diamond = new ArmourType("Diamond", 14, Material.DIAMOND_CHESTPLATE, ChatColor.AQUA);
        ArmourType netherite = new ArmourType("Netherite",15, Material.NETHERITE_CHESTPLATE, ChatColor.DARK_PURPLE);

        for(int i = 0; i < 26; i++) {
            if(Kits.armourTypes.containsKey(i)){
                kitsGui.setItem(i, guiButton(Kits.armourTypes.get(i)));
            }
            else {
                kitsGui.setItem(i, guiBlankButton());
            }
        }

        p.openInventory(kitsGui);
    }

    private static ItemStack guiButton(ArmourType armourType) {
        ItemStack itemstack = new ItemStack(armourType.material, 1);
        ItemMeta meta = itemstack.getItemMeta();
        assert meta != null;
        meta.setDisplayName(armourType.color + armourType.name);
        itemstack.setItemMeta(meta);
        return itemstack;
    }
    private static ItemStack guiBlankButton() {
        ItemStack itemstack = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = itemstack.getItemMeta();
        assert meta != null;
        meta.setDisplayName("----");
        itemstack.setItemMeta(meta);
        return itemstack;
    }


    public static class ArmourType extends ItemStack {
        public String name;
        public Material material;
        public ChatColor color;

        public ArmourType(String name, int slotNumber, Material material, ChatColor color) {
            this.name = name;
            this.material = material;
            this.color = color;
            Kits.armourTypes.put(slotNumber, this);


        }
    }
}
