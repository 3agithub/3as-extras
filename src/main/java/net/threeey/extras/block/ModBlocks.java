package net.threeey.extras.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.threeey.extras.ThreeEysExtras;

public class ModBlocks {

    public static final Block PLASTIC_BLOCK = registerBlock("plastic_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE)
                    .strength(2.3f, 6.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block RAW_PLASTIC_BLOCK = registerBlock("raw_plastic_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY)
                    .strength(3.5f, 7.5f).sounds(BlockSoundGroup.WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItemMethod(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ThreeEysExtras.MOD_ID, name), block);
    }

    private static void registerBlockItemMethod(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ThreeEysExtras.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ThreeEysExtras.LOGGER.info("Registering mod blocks for Extras");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PLASTIC_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RAW_PLASTIC_BLOCK);
        });
    }
}
