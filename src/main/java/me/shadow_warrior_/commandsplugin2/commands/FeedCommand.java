package me.shadow_warrior_.commandsplugin2.commands;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission("commandsplugin2.feed")) { // permission
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.YELLOW + "Now you are full");
            }else p.sendMessage("You do not have the permission to that command");
        }

        return true;
    }
}
