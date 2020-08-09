package de.tdrstudios.spawn;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class SpawnPlugin extends JavaPlugin {

    public static File ConfigFile;
    FileConfiguration config = this.getConfig();
    Location dummyloc;

    @Override
    public void onEnable() {



        System.out.println("[TDRStudios] Spawn Pl wird geladen!");
        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        initConfig();
    }

    @Override
    public void onDisable() {


    }

    public void initConfig() {
        config.addDefault("Spawnpoint: ", dummyloc);
        this.saveDefaultConfig();

    }


}
