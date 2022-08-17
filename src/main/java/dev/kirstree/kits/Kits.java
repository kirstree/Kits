package dev.kirstree.kits;

import dev.kirstree.kits.handlers.KitCommands;
import dev.kirstree.kits.handlers.Listeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Kits extends JavaPlugin {

    public static HashMap<Integer, KitCommands.ArmourType> armourTypes = new HashMap<Integer, KitCommands.ArmourType>();

    @Override
    public void onEnable(){
        Bukkit.getLogger().info("Kits turning on...");

        Bukkit.getPluginManager().registerEvents(new Listeners(), this);
        Bukkit.getPluginCommand("kits").setExecutor(new KitCommands());
    }

    @Override
    public void onDisable(){

        Bukkit.getLogger().info("Kits turning off...");
    }
}
