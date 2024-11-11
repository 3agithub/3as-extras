package net.threeey.extras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.threeey.extras.ThreeEysExtras;
import net.threeey.extras.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup EXTRAS_INDUSTRALIZATION = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ThreeEysExtras.MOD_ID, "extras_industralization"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PLASTIC))
                    .displayName(Text.translatable("itemgroup.teextras.extras_industralization"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PLASTIC_BLOCK);
                        entries.add(ModItems.PLASTIC);
                        entries.add(ModBlocks.RAW_PLASTIC_BLOCK);
                        entries.add(ModItems.RAW_PLASTIC);
                    }).build());

    public static final ItemGroup EXTRAS_ORES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ThreeEysExtras.MOD_ID, "extras_ores"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.TIN_INGOT))
                    .displayName(Text.translatable("itemgroup.teextras.extras_ores"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                    }).build());

    public static void registerItemGroups() {
        ThreeEysExtras.LOGGER.info("Registering item groups for Extras");
    }
}
