package net.diemond_player.diemants_test.datagen;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

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
        muffinBlockTexturePool.fence(ModBlocks.MUFFIN_BLOCK_FENCE);
        muffinBlockTexturePool.fenceGate(ModBlocks.MUFFIN_BLOCK_FENCE_GATE);
        muffinBlockTexturePool.wall(ModBlocks.MUFFIN_BLOCK_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.MUFFIN_BLOCK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MUFFIN_BLOCK_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUFFIN_CUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_MUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PAXEL, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_BOOTS);

    }
}
