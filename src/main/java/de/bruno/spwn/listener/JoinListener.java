package de.bruno.spwn.listener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.bruno.spwn.main.Main;

public class JoinListener implements Listener{
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		FileConfiguration config = Main.getPlugin().getConfig();
		
		if (!config.getBoolean("Plugin.Enabled") || !config.getBoolean("Spawn.Set")) return;
		
		World world = Bukkit.getWorld(config.getString("Spawn.Wolrd"));
		double x = config.getDouble("Spawn.X");
		double y = config.getDouble("Spawn.Y");
		double z = config.getDouble("Spawn.Z");
		float yaw = (float) config.getDouble("Spawn.Yaw");
		float pitch = (float) config.getDouble("Spawn.Pitch");
		
		Location location = new Location(world, x, y, z, yaw, pitch);
		player.teleport(location);
	}
}
