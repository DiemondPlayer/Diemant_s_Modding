package net.diemond_player.diemants_test.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent BROWN_MUFFIN = new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).
            statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 120, 1), 0.2f).build();
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();

}
