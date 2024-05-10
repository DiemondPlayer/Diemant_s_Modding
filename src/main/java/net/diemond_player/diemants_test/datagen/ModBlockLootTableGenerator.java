package net.diemond_player.diemants_test.datagen;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.block.custom.CauliflowerCropBlock;
import net.diemond_player.diemants_test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

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
        addDrop(ModBlocks.MUFFIN_BLOCK_FENCE);
        addDrop(ModBlocks.MUFFIN_BLOCK_FENCE_GATE);
        addDrop(ModBlocks.MUFFIN_BLOCK_WALL);
        addDrop(ModBlocks.MUFFIN_BLOCK_TRAPDOOR);
        addDrop(ModBlocks.MUFFIN_BLOCK_DOOR, doorDrops(ModBlocks.MUFFIN_BLOCK_DOOR));
        addDrop(ModBlocks.MUFFIN_CUP_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP).properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, 6));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder2));
    }
}
