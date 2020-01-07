package me.ford.temp123;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * TempBiomeChangePlugin
 */
public class TempBiomeChangePlugin extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        Location loc = player.getLocation();
        World world = loc.getWorld();
        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();
        sender.sendMessage("Current biome:" + world.getBiome(x, y, z));
        Biome biome = Biome.END_BARRENS;
        sender.sendMessage("Changing to:" + biome);
        world.setBiome(x, y, z, biome);
        sender.sendMessage("Resulting biome:" + world.getBiome(x, y, z));
        return true;
    }
    
}