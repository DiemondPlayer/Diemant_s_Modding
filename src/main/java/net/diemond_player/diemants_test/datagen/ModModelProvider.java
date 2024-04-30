package net.diemond_player.diemants_test.datagen;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool muffinBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MUFFIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUFFIN_CUP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        muffinBlockTexturePool.stairs(ModBlocks.MUFFIN_BLOCK_STAIRS);
        muffinBlockTexturePool.slab(ModBlocks.MUFFIN_BLOCK_SLAB);
        muffinBlockTexturePool.button(ModBlocks.MUFFIN_BLOCK_BUTTON);
        muffinBlockTexturePool.pressurePlate(ModBlocks.MUFFIN_BLOCK_PRESSURE_PLATE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUFFIN_CUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_MUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

    }
}
