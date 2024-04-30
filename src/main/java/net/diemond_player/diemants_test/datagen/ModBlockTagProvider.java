package net.diemond_player.diemants_test.datagen;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.MUFFIN_BLOCK)
                .forceAddTag(BlockTags.REDSTONE_ORES);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.MUFFIN_BLOCK,
                        ModBlocks.MUFFIN_BLOCK_STAIRS,
                        ModBlocks.MUFFIN_BLOCK_SLAB,
                        ModBlocks.MUFFIN_BLOCK_BUTTON,
                        ModBlocks.MUFFIN_BLOCK_PRESSURE_PLATE,
                        ModBlocks.MUFFIN_CUP_BLOCK);
    }
}
