package net.diemond_player.diemants_test.datagen;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MUFFIN_BLOCK);
        addDrop(ModBlocks.MUFFIN_BLOCK_STAIRS);
        addDrop(ModBlocks.MUFFIN_BLOCK_SLAB, slabDrops(ModBlocks.MUFFIN_BLOCK_SLAB));
        addDrop(ModBlocks.MUFFIN_BLOCK_BUTTON);
        addDrop(ModBlocks.MUFFIN_BLOCK_PRESSURE_PLATE);
        addDrop(ModBlocks.MUFFIN_CUP_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);

    }
}
