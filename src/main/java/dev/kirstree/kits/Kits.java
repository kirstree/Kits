package dev.kirstree.kits;

import dev.kirstree.kits.handlers.KitCommands;
import dev.kirstree.kits.handlers.listeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Kits extends JavaPlugin {

    @Override
    public void onEnable(){
        Bukkit.getLogger().info("Kits turning on...");

        Bukkit.getPluginManager().registerEvents(new listeners(), this);
        Bukkit.getPluginCommand("kits").setExecutor(new KitCommands());
    }

    @Override
    public void onDisable(){

        Bukkit.getLogger().info("Kits turning off...");
    }
}
