package net.diemond_player.diemants_test.item;

import net.diemond_player.diemants_test.DiemantsTest;
import net.diemond_player.diemants_test.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BROWN_MUFFIN = registerItem("brown_muffin",
            new Item(new FabricItemSettings()));
    public static final Item MUFFIN_CUP = registerItem("muffin_cup",
            new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries){
        entries.add(BROWN_MUFFIN);
        entries.add(MUFFIN_CUP);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(DiemantsTest.MOD_ID, name), item);
    }
    public static void registerModItems(){
        DiemantsTest.LOGGER.info("Registering Mod Items for" + DiemantsTest.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
    }
}
