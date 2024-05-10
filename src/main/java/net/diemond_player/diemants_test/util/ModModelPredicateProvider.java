package net.diemond_player.diemants_test.util;

import net.diemond_player.diemants_test.DiemantsTest;
import net.diemond_player.diemants_test.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {
    public static void registerModModels(){
        ModelPredicateProviderRegistry.register(ModItems.DATA_TABLET, new Identifier(DiemantsTest.MOD_ID, "on"),
                (stack, world, entity, seed) -> stack.hasNbt() ? 1f : 0f);
        registerBow(ModItems.SAPPHIRE_BOW);
    }

    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getActiveItem() != stack) {
                return 0.0f;
            }
            return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
        });
        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

    }
}
