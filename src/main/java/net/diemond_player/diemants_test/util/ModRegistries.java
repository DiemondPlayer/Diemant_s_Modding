package net.diemond_player.diemants_test.util;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.command.ReturnHomeCommand;
import net.diemond_player.diemants_test.command.SetHomeCommand;
import net.diemond_player.diemants_test.event.PlayerCopyHandler;
import net.diemond_player.diemants_test.item.ModItems;
import net.diemond_player.diemants_test.villager.ModVillagers;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {

    public static void registerModStuffs(){
        registerModCompostables();
        registerFuels();
        registerCommands();
        registerEvents();
        registerCustomTrades();
    }

    private static void registerFuels(){

        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.MUFFIN_CUP, 50);
    }

    private static void registerModCompostables(){
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER_SEEDS, 0.2f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER, 0.5f);
    }

    private static void registerCommands(){
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.PRISMARINE_SHARD, 3), 6, 2,0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.NOTE_BLOCK, 3), 6, 2,0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 23),
                            new ItemStack(Items.MUSIC_DISC_CAT, 3), 6, 2,0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 1), 6, 2,0.02f
                    ));
                });
    }
    private static void registerEvents(){
        ServerPlayerEvents.COPY_FROM.register(new PlayerCopyHandler());
    }
}
