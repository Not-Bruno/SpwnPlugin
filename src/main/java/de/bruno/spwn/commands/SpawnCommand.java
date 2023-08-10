package de.bruno.spwn.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.bruno.spwn.main.Main;
import de.bruno.spwn.util.Color;

public class SpawnCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			FileConfiguration config = Main.getPlugin().getConfig();
			
			if (!config.getBoolean("Spawn.Set") || !config.getBoolean("Spawn.Set")) return false;
			
			if (args.length==1) {
				World world = Bukkit.getWorld(config.getString("Spawn.Wolrd"));
				double x = config.getDouble("Spawn.X");
				double y = config.getDouble("Spawn.Y");
				double z = config.getDouble("Spawn.Z");
				float yaw = (float) config.getDouble("Spawn.Yaw");
				float pitch = (float) config.getDouble("Spawn.Pitch");
				
				Location loc = new Location(world, x, y, z, yaw, pitch);
				player.teleport(loc);
				
				if (config.getBoolean("Teleport.Message.Enabled")) {
					player.sendMessage(Color.GREEN + config.getString("Teleport.Message"));
				}
				
			}
			
		}
		return false;
	}

}
