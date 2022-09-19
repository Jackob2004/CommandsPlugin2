package me.shadow_warrior_.commandsplugin2;

import me.shadow_warrior_.commandsplugin2.commands.FeedCommand;
import me.shadow_warrior_.commandsplugin2.commands.GodCommand;
import me.shadow_warrior_.commandsplugin2.commands.PlayerMoveCommand;
import me.shadow_warrior_.commandsplugin2.commands.RepeatCommand;
import me.shadow_warrior_.commandsplugin2.listener.onMoveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandsPlugin2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("god").setExecutor(new GodCommand()); // registering a new command
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("repeat").setExecutor(new RepeatCommand());
        getCommand("psm").setExecutor(new PlayerMoveCommand());
        getServer().getPluginManager().registerEvents(new onMoveListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
