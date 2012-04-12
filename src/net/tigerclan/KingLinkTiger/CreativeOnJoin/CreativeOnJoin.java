package net.tigerclan.KingLinkTiger.CreativeOnJoin;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class CreativeOnJoin extends JavaPlugin{
    
    	
    	public static CreativeOnJoin plugin;
    	
    	public final Logger logger = Logger.getLogger("Minecraft");
    	
    	public void onDisable(){
    		this.logger.info("CreativeOnJoin is now disabled");
    	}
    	
        public void onEnable() {
        	getServer().getPluginManager().registerEvents(new JoinListener(this.getLogger()), this);

        }
}
