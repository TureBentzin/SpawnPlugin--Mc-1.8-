package de.tdrstudios.spawn.commands;

import de.tdrstudios.spawn.Prefix;
import org.bukkit.entity.Player;

public class Pmsg {

    public static void send(Player p, String msg) {
        p.sendMessage(Prefix.getPrefix() + msg);
        System.out.println("SpawnSystem -> " + p.getDisplayName() + " " + msg);
    }
}
