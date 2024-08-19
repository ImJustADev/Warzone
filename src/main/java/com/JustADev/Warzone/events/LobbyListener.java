package com.JustADev.Warzone.events;

import com.JustADev.Warzone.CTFPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LobbyListener implements Listener {

    private final CTFPlugin plugin;

    public LobbyListener(CTFPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Placeholder: Handle player joining the lobby
        event.getPlayer().sendMessage("Welcome to the Lobby!");
    }
}
