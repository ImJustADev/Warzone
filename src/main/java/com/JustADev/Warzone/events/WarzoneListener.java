package com.JustADev.Warzone.events;

import com.JustADev.Warzone.CTFPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WarzoneListener implements Listener {

    private final CTFPlugin plugin;

    public WarzoneListener(CTFPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Placeholder: Handle player joining the Warzone
        event.getPlayer().sendMessage("Welcome to the Warzone!");
    }
}
