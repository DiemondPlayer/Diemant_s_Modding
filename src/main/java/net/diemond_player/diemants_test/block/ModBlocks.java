package net.diemond_player.diemants_test.block;

import net.diemond_player.diemants_test.DiemantsTest;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MUFFIN_BLOCK = registerBlock("muffin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block MUFFIN_CUP_BLOCK = registerBlock("muffin_cup_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
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
