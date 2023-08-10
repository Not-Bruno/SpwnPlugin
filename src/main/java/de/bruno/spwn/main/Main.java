package de.bruno.spwn.main;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.bruno.spwn.commands.SpawnCommand;
import de.bruno.spwn.listener.JoinListener;

public class Main extends JavaPlugin {

	public static Main plugin;
	public FileConfiguration config;

	public void onEnable() {
		plugin = this;
		config = getConfig();

		if (!config.contains("Setup")) {
			SetupConfig(config);
		}

		if (config.getBoolean("Plugin.Enabled")) {
			if (config.getBoolean("Spawn.Command.Enabled")) {
				getCommand("h").setExecutor(new SpawnCommand());
				getCommand("hub").setExecutor(new SpawnCommand());
				getCommand("l").setExecutor(new SpawnCommand());
				getCommand("lobby").setExecutor(new SpawnCommand());
				getCommand("s").setExecutor(new SpawnCommand());
				getCommand("spawn").setExecutor(new SpawnCommand());
			}
			
			PluginManager manager = Bukkit.getPluginManager();
			manager.registerEvents(new JoinListener(), this);
			
		}
	}

	private void SetupConfig(FileConfiguration config) {
		config.set("isSetup", true);
		config.set("Plugin.Enabled", false);
		config.set("Spawn.Set", false);
		config.set("Spawn.Command.Enabled", false);
		config.set("Teleport.Message.Enabled", false);
		config.set("Teleport.Message", "You have been teleported to the spawn");
		saveConfig();
	}

	public static Main getPlugin() {
		return plugin;
	}

}
