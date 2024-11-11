package net.threeey.extras.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.threeey.extras.ThreeEysExtras;

public class ModBlocks {

    public static final Block PLASTIC_BLOCK = registerBlock("plastic_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(2.3f, 6.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block RAW_PLASTIC_BLOCK = registerBlock("raw_plastic_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(3.5f, 7.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

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
    }
}
