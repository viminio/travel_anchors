package de.castcrafter.travelanchors.config;

import org.moddingx.libx.annotation.config.RegisterConfig;
import org.moddingx.libx.config.Config;

@RegisterConfig(value = "client", client = true)
public class ClientConfig {
    
    @Config({
            "When this is set, wou won't be able to use the elevation feature of travel anchors",
            "but you'll teleport to the anchor you're looking at when jumping on another travel anchor",
            "This is a client option so each player can adjust it as they prefer."
    })
    public static boolean disable_elevation = false;
}