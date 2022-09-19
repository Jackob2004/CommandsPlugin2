package me.shadow_warrior_.commandsplugin2.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerMoveCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (args.length == 0){
                p.sendMessage("Wpisz nazwe gracza: /psm <player>");
            }else {
                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);
                if (target == null){
                    p.sendMessage("Ten gracz nie jest online");
                }else if (target.getFlySpeed() == -1){
                    p.sendMessage("Odblokowales ruchy gracza");
                    target.setFlySpeed(0);

                }else target.setFlySpeed(-1);

            }

        }

        return true;
    }


    }


