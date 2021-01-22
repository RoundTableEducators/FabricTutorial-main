package com.limeislimey.davensmod;

import com.limeislimey.davensmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class DavensMod implements ModInitializer {

    public static final String MOD_ID = "davensmod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();

    }
}
