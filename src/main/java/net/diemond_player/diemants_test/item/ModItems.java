package net.diemond_player.diemants_test.item;

import net.diemond_player.diemants_test.DiemantsTest;
import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.item.custom.*;
import net.diemond_player.diemants_test.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BROWN_MUFFIN = registerItem("brown_muffin",
            new MuffinItem(new FabricItemSettings().food(ModFoodComponents.BROWN_MUFFIN)));
    public static final Item MUFFIN_CUP = registerItem("muffin_cup",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new ModPoisonSwordItem(ModToolMaterials.SAPPHIRE, 10, 2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterials.SAPPHIRE, 10, 2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE, 10, 2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterials.SAPPHIRE, 10, 2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterials.SAPPHIRE, 10, 2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_PAXEL = registerItem("sapphire_paxel",
            new PaxelItem(ModToolMaterials.SAPPHIRE, 10, 2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SAPPHIRE_HORSE_ARMOR = registerItem("sapphire_horse_armor",
            new HorseArmorItem(14, "sapphire", new FabricItemSettings()));
    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().maxCount(1)));
    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new AliasedBlockItem(ModBlocks.CAULIFLOWER_CROP, new FabricItemSettings()));
    public static final Item CUSTOM_DYE = registerItem("custom_dye",
            new CustomDyeItem(new FabricItemSettings()));
    public static final Item RADIATION_STAFF = registerItem("radiation_staff",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_BOW = registerItem("sapphire_bow",
            new BowItem(new FabricItemSettings().maxDamage(300)));
    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new MusicDiscItem(9, ModSounds.BAR_BRAWL, new FabricItemSettings().maxCount(1), 122));

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

    // 07 05 2024 влад и мета тут были
}
