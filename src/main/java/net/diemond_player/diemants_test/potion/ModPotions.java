package net.diemond_player.diemants_test.potion;

import net.diemond_player.diemants_test.DiemantsTest;
import net.diemond_player.diemants_test.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final Potion SLIMEY_POTION = registerPotion("slimey_potion",
            new Potion(new StatusEffectInstance(ModEffects.SLIMEY, 200, 0)));

    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(DiemantsTest.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        DiemantsTest.LOGGER.info("Registering Potions for " + DiemantsTest.MOD_ID);
    }
}
