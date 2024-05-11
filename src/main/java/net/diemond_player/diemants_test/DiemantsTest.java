package net.diemond_player.diemants_test;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.block.entity.ModBlockEntities;
import net.diemond_player.diemants_test.effect.ModEffects;
import net.diemond_player.diemants_test.enchantment.ModEnchantments;
import net.diemond_player.diemants_test.item.ModItemGroups;
import net.diemond_player.diemants_test.item.ModItems;
import net.diemond_player.diemants_test.potion.ModPotions;
import net.diemond_player.diemants_test.recipe.ModRecipes;
import net.diemond_player.diemants_test.screen.ModScreenHandlers;
import net.diemond_player.diemants_test.sound.ModSounds;
import net.diemond_player.diemants_test.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiemantsTest implements ModInitializer {
	public static final String MOD_ID = "diemants_test";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantments();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModSounds.registerSounds();
		ModRecipes.registerRecipes();
	}
}