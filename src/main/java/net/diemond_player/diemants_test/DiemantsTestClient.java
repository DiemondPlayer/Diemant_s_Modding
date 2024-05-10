package net.diemond_player.diemants_test;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.item.ModItems;
import net.diemond_player.diemants_test.item.custom.CustomDyeItem;
import net.diemond_player.diemants_test.screen.GemEmpoweringStationScreen;
import net.diemond_player.diemants_test.screen.ModScreenHandlers;
import net.diemond_player.diemants_test.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;

public class DiemantsTestClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MUFFIN_BLOCK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MUFFIN_BLOCK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAULIFLOWER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PETUNIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PETUNIA, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GEM_EMPOWERING_STATION, RenderLayer.getCutout());

        registerItemColor(ModItems.CUSTOM_DYE);
        ModModelPredicateProvider.registerModModels();
        HandledScreens.register(ModScreenHandlers.GEM_EMPOWERING_SCREEN_HANDLER, GemEmpoweringStationScreen::new);
    }

    private void registerItemColor(Item item) {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem) ((Object) stack.getItem())).getColor(stack), item);
    }
}
