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

                        entries.add(ModBlocks.MUFFIN_BLOCK);
                        entries.add(ModBlocks.MUFFIN_CUP_BLOCK);


                    }).build());
    public static void registerItemGroups(){
        DiemantsTest.LOGGER.info("Registering Item Groups for" + DiemantsTest.MOD_ID);
    }
}
