package com.JustADev.Warzone;

import org.bukkit.plugin.java.JavaPlugin;

public class CTFPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("CTF Plugin has been enabled!");
        // Register commands, events, and initialize other plugin components here
    }

    @Override
    public void onDisable() {
        getLogger().info("CTF Plugin has been disabled!");
        // Clean up resources here
    }
}
