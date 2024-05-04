package net.diemond_player.diemants_test.item;

import net.diemond_player.diemants_test.DiemantsTest;
import net.diemond_player.diemants_test.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MUFFIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DiemantsTest.MOD_ID, "muffin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.muffin"))
                    .icon(() -> new ItemStack(ModItems.BROWN_MUFFIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BROWN_MUFFIN);
                        entries.add(ModItems.MUFFIN_CUP);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_SWORD);
                        entries.add(ModItems.SAPPHIRE_PAXEL);
                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);

                        entries.add(ModBlocks.MUFFIN_BLOCK);
                        entries.add(ModBlocks.MUFFIN_BLOCK_STAIRS);
                        entries.add(ModBlocks.MUFFIN_BLOCK_SLAB);
                        entries.add(ModBlocks.MUFFIN_BLOCK_BUTTON);
                        entries.add(ModBlocks.MUFFIN_BLOCK_PRESSURE_PLATE);
                        entries.add(ModBlocks.MUFFIN_BLOCK_FENCE);
                        entries.add(ModBlocks.MUFFIN_BLOCK_FENCE_GATE);
                        entries.add(ModBlocks.MUFFIN_BLOCK_WALL);
                        entries.add(ModBlocks.MUFFIN_BLOCK_DOOR);
                        entries.add(ModBlocks.MUFFIN_BLOCK_TRAPDOOR);
                        entries.add(ModBlocks.MUFFIN_CUP_BLOCK);
                        entries.add(ModBlocks.SOUND_BLOCK);


                    }).build());
    public static void registerItemGroups(){
        DiemantsTest.LOGGER.info("Registering Item Groups for" + DiemantsTest.MOD_ID);
    }
}
