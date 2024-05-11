package net.diemond_player.diemants_test.sound;

import com.google.common.io.Closer;
import net.diemond_player.diemants_test.DiemantsTest;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent METAL_DETECTOR_FOUND_ORE = registerSoundEvent("metal_detector_found_ore");

    public static final SoundEvent SAPPHIRE_LAMP_BREAK = registerSoundEvent("sapphire_lamp_break");
    public static final SoundEvent SAPPHIRE_LAMP_STEP = registerSoundEvent("sapphire_lamp_step");
    public static final SoundEvent SAPPHIRE_LAMP_PLACE = registerSoundEvent("sapphire_lamp_place");
    public static final SoundEvent SAPPHIRE_LAMP_HIT = registerSoundEvent("sapphire_lamp_hit");
    public static final SoundEvent SAPPHIRE_LAMP_FALL = registerSoundEvent("sapphire_lamp_fall");

    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");

    public static final BlockSoundGroup SAPPHIRE_LAMP_SOUNDS = new BlockSoundGroup(1f, 1f,
            SAPPHIRE_LAMP_BREAK, SAPPHIRE_LAMP_STEP, SAPPHIRE_LAMP_PLACE, SAPPHIRE_LAMP_HIT, SAPPHIRE_LAMP_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(DiemantsTest.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds() {
        DiemantsTest.LOGGER.info("Registering Mod Sounds for " + DiemantsTest.MOD_ID);
    }
}
