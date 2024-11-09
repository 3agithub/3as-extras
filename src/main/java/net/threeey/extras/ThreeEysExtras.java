package net.threeey.extras;

import net.fabricmc.api.ModInitializer;

import net.threeey.extras.block.ModBlocks;
import net.threeey.extras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreeEysExtras implements ModInitializer {
    public static final String MOD_ID = "teextras";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}