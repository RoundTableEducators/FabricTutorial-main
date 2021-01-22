package com.limeislimey.davensmod.registry;

import com.limeislimey.davensmod.DavensMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CRYSTAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(DavensMod.MOD_ID, "crystal"), CRYSTAL);



    }

}
