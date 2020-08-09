package de.tdrstudios.spawn;

import lombok.Getter;
import lombok.Setter;

public class Prefix {
    @Getter
    @Setter
    public static String prefix = "[SpawnSystem] ";


    @Getter
    @Setter
    public static String noPerms = prefix + "You dont have Permission to do that!";
}
