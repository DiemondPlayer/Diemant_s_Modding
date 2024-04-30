package net.diemond_player.diemants_test.util;

import net.diemond_player.diemants_test.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){

        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.MUFFIN_CUP, 50);
    }

}
