package dev.kirstree.kits;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Kits extends JavaPlugin {

    @Override
    public void onEnable(){
        
        Bukkit.getLogger().info("Kits turning on...");
    }

    @Override
    public void onDisable(){

        Bukkit.getLogger().info("Kits turning off...");
    }
}
