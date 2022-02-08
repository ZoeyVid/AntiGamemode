package dev.sancraft.antigamemode.Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class gamemodeChangeListener implements Listener {

    @EventHandler
    public void onGamemodeChange(PlayerGameModeChangeEvent event) {
        if(!event.getNewGameMode().equals(GameMode.SURVIVAL)) {
            if (!event.getPlayer().isOp()) {
             event.setCancelled(true);
             for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                if (player.isOp()) {
                    player.sendMessage(ChatColor.DARK_RED + "Es wurde versucht den Spieler " + event.getPlayer().getName() + " in einen anderen Gamemode zu wechselen!");
                }
            }
}
        }
    }
}
