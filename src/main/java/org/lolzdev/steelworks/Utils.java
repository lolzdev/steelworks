package org.lolzdev.steelworks;

import net.minecraft.util.Identifier;

public class Utils {
    public static String MODID = "steelworks";

    public static Identifier identifier(String name) {
        return Identifier.of(MODID, name);
    }
}
