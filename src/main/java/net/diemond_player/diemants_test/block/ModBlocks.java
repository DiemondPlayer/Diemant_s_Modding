package net.diemond_player.diemants_test.block;

import net.diemond_player.diemants_test.DiemantsTest;
import net.diemond_player.diemants_test.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MUFFIN_BLOCK = registerBlock("muffin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block MUFFIN_BLOCK_STAIRS = registerBlock("muffin_block_stairs",
            new StairsBlock(ModBlocks.MUFFIN_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block MUFFIN_BLOCK_SLAB = registerBlock("muffin_block_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block MUFFIN_BLOCK_BUTTON = registerBlock("muffin_block_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK), BlockSetType.BIRCH, 10, true));
    public static final Block MUFFIN_BLOCK_FENCE = registerBlock("muffin_block_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block MUFFIN_BLOCK_FENCE_GATE = registerBlock("muffin_block_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK), WoodType.OAK));
    public static final Block MUFFIN_BLOCK_WALL = registerBlock("muffin_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block MUFFIN_BLOCK_PRESSURE_PLATE = registerBlock("muffin_block_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.HAY_BLOCK), BlockSetType.BIRCH));
    public static final Block MUFFIN_BLOCK_DOOR = registerBlock("muffin_block_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.BIRCH));
    public static final Block MUFFIN_BLOCK_TRAPDOOR = registerBlock("muffin_block_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.BIRCH));
    public static final Block MUFFIN_CUP_BLOCK = registerBlock("muffin_cup_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DiemantsTest.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(DiemantsTest.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        DiemantsTest.LOGGER.info("Registering Mod Blocks for" + DiemantsTest.MOD_ID);
    }
}
