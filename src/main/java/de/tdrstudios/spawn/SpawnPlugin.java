package de.tdrstudios.spawn;

import org.bukkit.plugin.java.JavaPlugin;

public class SpawnPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("[TDRStudios] Spawn Pl wird geladen!");
        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
    }

    @Override
    public void onDisable() {


    }


}
