package net.diemond_player.diemants_test.screen;

import net.diemond_player.diemants_test.DiemantsTest;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<GemEmpoweringStationScreenHandler> GEM_EMPOWERING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(DiemantsTest.MOD_ID, "gem_empowering_screen_handler"),
                    new ExtendedScreenHandlerType<>(GemEmpoweringStationScreenHandler::new));
    public static void registerScreenHandlers() {
        DiemantsTest.LOGGER.info("Registering Screen Handlers for " + DiemantsTest.MOD_ID);
    }
}
