package de.bruno.spwn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.bruno.spwn.main.Main;
import de.bruno.spwn.util.Color;

public class SetupCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			FileConfiguration config = Main.getPlugin().getConfig();
			if (player.hasPermission("op")) {
				if (args.length==0) {
					player.sendMessage(setupMessage());
					
				}  else if (args.length>=1) {
					if (args[1].equalsIgnoreCase("spawn")) {
						config.set("Spawn.World", player.getWorld().getName());
						config.set("Spawn.X", player.getLocation().getX());
						config.set("Spawn.Y", player.getLocation().getY());
						config.set("Spawn.Z", player.getLocation().getZ());
						config.set("Spawn.Yaw", player.getLocation().getYaw());
						config.set("Spawn.Pitch", player.getLocation().getPitch());
						config.set("Spawn.Set", true);
						Main.getPlugin().saveConfig();
						player.sendMessage(Color.GREEN + "Spawnpoint set to your current Position!");
					
						// Spawn Command set true||false //
					} else if (args[1].equalsIgnoreCase("spawn_command")) {
						if (args[2].equalsIgnoreCase("enable")) {
							config.set("Spawn.Command.Enabled", true);
							player.sendMessage(Color.GREEN + "Spawn command enabled! " + Color.RED_BOLD + "Please reload the Server!");
						}else if (args[2].equalsIgnoreCase("disable")) {
							config.set("Spawn.Command.Enabled", false);
							player.sendMessage(Color.GREEN + "Spawn command disabled! " + Color.RED_BOLD + "Please reload the Server!");
						}
						
						// Teleport Message enable disable
					} else if (args[1].equalsIgnoreCase("tpmsg")) {
						if (args[2].equalsIgnoreCase("enable")) {
							config.set("Teleport.Message.Enabled", true);
							player.sendMessage(Color.GREEN + "Teleport Message enabled");
						} else if (args[2].equalsIgnoreCase("disable")) {
							config.set("Teleport.Message.Enabled", false);
							player.sendMessage(Color.GREEN + "Teleport Message disabled");
						} else if (args.length>2) {
							// Teleport message
							StringBuffer buffer = new StringBuffer();
							for (int i=3; i<args.length; i++) {
								buffer.append(args[i]);
							}
							String newMessage = buffer.toString();
							config.set("Teleport.Message", newMessage);
							player.sendMessage(Color.GREEN + "Teleport message updated!");
						}
						
						// enable or Disable Plugin
					} else if (args[1].equalsIgnoreCase("plugin")) {
						if (args[2].equalsIgnoreCase("enable")) {
							player.sendMessage(Color.GREEN + "Plugin enabled! " + Color.RED_BOLD + "Please reload the Server!");
							config.set("Plugin.Enabled", false);
						} else if (args[2].equalsIgnoreCase("disable")) {
							config.set("Plugin.Enabled", false);
							player.sendMessage(Color.GREEN + "Plugin disabled! " + Color.RED_BOLD + "Please reload the Server!");
						}
						
						// show configuration
					} else if (args[1].equalsIgnoreCase("show")) {
						player.sendMessage(showConfiguration());
					}
				}
			}
			Main.getPlugin().saveConfig();
		}
		return false;
		
	}
	
	private String showConfiguration() {
		FileConfiguration config = Main.getPlugin().getConfig();
		String message = Color.PURPLE_BOLD + Color.UNDERLINED + "Your Configuration" + Color.RESET + "\n"
				+ Color.R_GREEN + "> " + Color.ORANGE_BOLD + "Plugin Enabled - " + Color.R_ORANGE + config.getString("Plugin.Enabled") + "\n"
				+ Color.R_GREEN + "> " + Color.ORANGE_BOLD + "Spawn set - " + Color.R_ORANGE + config.getString("Spawn.Set") + "\n"
				+ Color.R_GREEN + "> " + Color.ORANGE_BOLD + "Spawn Command Enabled - " + Color.R_ORANGE + config.getString("Spawn.Command.Enabled") + "\n"
				+ Color.R_GREEN + "> " + Color.ORANGE_BOLD + "Teleport Message Enabled - " + Color.R_ORANGE + config.getString("Teleport.Message.Enabled") + "\n"
				+ Color.R_GREEN + "> " + Color.ORANGE_BOLD + "Teleport Message - " + Color.R_ORANGE + config.getString("Teleport.Message") + "\n"
						+ "";
		return message;
	}
	
	private String setupMessage() {
		String message = Color.PURPLE_BOLD+Color.UNDERLINED+"Setup" + "\n"
				+ Color.R_GREEN + Color.BOLD +"> " + Color.R_ORANGE + Color.BOLD + "/setup spawn" + Color.R_ORANGE + " Set Spawn Locatin to your Current Position" + "\n"
				+ Color.R_GREEN + Color.BOLD +"> " + Color.R_ORANGE + Color.BOLD + "/setup spawn_command <enable/disable>" + Color.R_ORANGE + " Enable or disable the Spawn command /h, /hub, /l, /lobby, /s and /spawn "+Color.RED_BOLD+ " Need a Server reload!" + Color.RESET + "\n"
				+ Color.R_GREEN + Color.BOLD +"> " + Color.R_ORANGE + Color.BOLD + "/setup tpmsg <enable/diable>" + Color.R_ORANGE + " Activate ore Deactivate custom Message after TP to Spawn" + "\n"
				+ Color.R_GREEN + Color.BOLD +"> " + Color.R_ORANGE + Color.BOLD + "/setup tpmsg <Message>" + Color.R_ORANGE + " Set custom Joinmessage" + "\n"
				+ Color.R_GREEN + Color.BOLD +"> " + Color.R_ORANGE + Color.BOLD + "/setup plugin <enable/diable>" + Color.R_ORANGE + " Enable or disable the Plugin"+Color.RED_BOLD+ " Need a Server reload!" + Color.RESET + "\n"
				+ Color.R_GREEN + Color.BOLD +"> " + Color.R_ORANGE + Color.BOLD + "/setup show" + Color.R_ORANGE + " Set Spawn Locatin to your Current Position" + "\n"
						+ "";
		return message;
	}
}