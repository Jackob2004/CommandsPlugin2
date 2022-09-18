package me.shadow_warrior_.commandsplugin2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RepeatCommand implements CommandExecutor {
    @Override // commands with arguments
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;

            if (args.length == 0){
                player.sendMessage("You did not provide any arguments");
                player.sendMessage("Example: /repeat <message here>");
            }else if (args.length == 1){
                String word = args[0];
                player.sendMessage("Message: " + word);
            }else {
                StringBuilder builder = new StringBuilder();

                for (String arg : args) {
                    builder.append(arg);
                    builder.append(" ");
                }
                String finalMessage = builder.toString(); // take content of string builder and transform it to single string
                //finalMessage = finalMessage.stripTrailing(); removing white spaces
                player.sendMessage("Big message: " + finalMessage );
            }


        }
        return true;
    }
}
