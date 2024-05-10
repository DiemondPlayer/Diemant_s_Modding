package net.diemond_player.diemants_test.effect;

import net.diemond_player.diemants_test.DiemantsTest;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect SLIMEY = registerStatusEffect("slimey",
            new SlimeyEffect(StatusEffectCategory.NEUTRAL, 0x36ebab));


    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(DiemantsTest.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        DiemantsTest.LOGGER.info("Registering Mod Effects for " + DiemantsTest.MOD_ID);
    }
}
