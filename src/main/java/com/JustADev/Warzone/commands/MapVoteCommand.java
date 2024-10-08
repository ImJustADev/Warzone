package com.JustADev.Warzone.commands;

import com.JustADev.Warzone.CTFPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MapVoteCommand implements CommandExecutor {

    private final CTFPlugin plugin;

    public MapVoteCommand(CTFPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by a player.");
            return true;
        }

        Player player = (Player) sender;
        // Placeholder: Handle map voting logic
        player.sendMessage("You voted for a map!");

        return true;
    }
}
