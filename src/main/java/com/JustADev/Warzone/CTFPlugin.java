package com.JustADev.Warzone;

import com.JustADev.Warzone.commands.KitCommand;
import com.JustADev.Warzone.commands.MapVoteCommand;
import com.JustADev.Warzone.events.LobbyListener;
import com.JustADev.Warzone.events.WarzoneListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class CTFPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Load configuration
        saveDefaultConfig();
        String serverType = Objects.requireNonNull(getConfig().getString("server-type")).toUpperCase();

        // Initialize based on server type
        if ("LOBBY".equals(serverType)) {
            getLogger().info("Initializing Lobby components...");
            setupLobbyFeatures();
        } else if ("WARZONE".equals(serverType)) {
            getLogger().info("Initializing Warzone components...");
            setupWarzoneFeatures();
        } else {
            getLogger().severe("Invalid server type specified in config.yml!");
            getServer().getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("CTF Plugin has been disabled!");
        // Perform any necessary cleanup
    }

    private void setupLobbyFeatures() {
        // Register the /vote command
        Objects.requireNonNull(getCommand("vote")).setExecutor(new MapVoteCommand(this));

        // Register the /kit command
        Objects.requireNonNull(getCommand("kit")).setExecutor(new KitCommand(this));

        // Register event listeners specific to the Lobby
        getServer().getPluginManager().registerEvents(new LobbyListener(this), this);

        getLogger().info("Lobby features initialized.");
    }

    private void setupWarzoneFeatures() {
        // Register the /vote command (if needed in Warzone)
        Objects.requireNonNull(getCommand("vote")).setExecutor(new MapVoteCommand(this));

        // Register the /kit command
        Objects.requireNonNull(getCommand("kit")).setExecutor(new KitCommand(this));

        // Register event listeners specific to the Warzone
        getServer().getPluginManager().registerEvents(new WarzoneListener(this), this);

        getLogger().info("Warzone features initialized.");
    }
}
