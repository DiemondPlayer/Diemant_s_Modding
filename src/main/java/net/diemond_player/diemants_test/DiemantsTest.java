package net.diemond_player.diemants_test;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.item.ModItemGroups;
import net.diemond_player.diemants_test.item.ModItems;
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
	}
}