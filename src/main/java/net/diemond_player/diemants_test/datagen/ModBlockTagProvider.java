package net.diemond_player.diemants_test.datagen;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.MUFFIN_BLOCK)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.MUFFIN_BLOCK,
                        ModBlocks.MUFFIN_BLOCK_STAIRS,
                        ModBlocks.MUFFIN_BLOCK_SLAB,
                        ModBlocks.MUFFIN_BLOCK_BUTTON,
                        ModBlocks.MUFFIN_BLOCK_PRESSURE_PLATE,
                        ModBlocks.MUFFIN_BLOCK_FENCE,
                        ModBlocks.MUFFIN_BLOCK_FENCE_GATE,
                        ModBlocks.MUFFIN_BLOCK_WALL,
                        ModBlocks.MUFFIN_BLOCK_DOOR,
                        ModBlocks.MUFFIN_BLOCK_TRAPDOOR,
                        ModBlocks.MUFFIN_CUP_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.MUFFIN_BLOCK_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.MUFFIN_BLOCK_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.MUFFIN_BLOCK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.MUFFIN_BLOCK_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.MUFFIN_BLOCK_TRAPDOOR);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.MUFFIN_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.PAXEL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE);
    }
}
