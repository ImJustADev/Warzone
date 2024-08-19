package com.JustADev.Warzone.commands;

import com.JustADev.Warzone.CTFPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KitCommand implements CommandExecutor {

    private final CTFPlugin plugin;

    public KitCommand(CTFPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by a player.");
            return true;
        }

        Player player = (Player) sender;
        // Placeholder: Handle kit selection logic
        if (args.length > 0) {
            String kitName = args[0];
            player.sendMessage("You selected the " + kitName + " kit!");
        } else {
            player.sendMessage("Please specify a kit.");
        }

        return true;
    }
}
