package me.shadow_warrior_.commandsplugin2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.isInvulnerable()){
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "God mod disabled");
            }else {
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "God mod enabled");
            }

        }


        return true;
    }
}
