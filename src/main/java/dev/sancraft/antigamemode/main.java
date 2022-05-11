package dev.sancraft.antigamemode;

import dev.sancraft.antigamemode.Listener.gamemodeChangeListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

  @Override
  public void onEnable() {
    Bukkit.getConsoleSender().sendMessage("§aAntiGamemode by Sancraft is now enabled!");
    PluginManager pluginManager = Bukkit.getPluginManager();
    pluginManager.registerEvents(new gamemodeChangeListener(), this);
  }

  @Override
  public void onDisable() {
    Bukkit.getConsoleSender().sendMessage("§cAntiGamemode by Sancraft is now disabled!");
  }
}
