package net.tigerclan.KingLinkTiger.CreativeOnJoin;

import java.util.logging.Logger;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener{

	/* Starting some derpy global Variables */
	long timestamp = (System.currentTimeMillis()/1000);

	Logger log;
	JoinListener(Logger _log){
		log = _log;
	}
	@EventHandler
	public void onPlayerDeath(PlayerJoinEvent event){
		event.getPlayer().setGameMode(GameMode.CREATIVE);
		event.getPlayer().sendMessage("You are now in creative mode.");
	}
}
