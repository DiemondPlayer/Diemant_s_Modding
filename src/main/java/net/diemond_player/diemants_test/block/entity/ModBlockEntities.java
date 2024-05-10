package net.diemond_player.diemants_test.block.entity;

import net.diemond_player.diemants_test.DiemantsTest;
import net.diemond_player.diemants_test.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<GemEmpoweringStationBlockEntity> GEM_EMPOWERING_STATION_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(DiemantsTest.MOD_ID, "gem_empowering_station_block_entity"),
                    FabricBlockEntityTypeBuilder.create(GemEmpoweringStationBlockEntity::new,
                            ModBlocks.GEM_EMPOWERING_STATION).build(null));

    public static void registerBlockEntities(){
        DiemantsTest.LOGGER.info("Registering Block Entities for " + DiemantsTest.MOD_ID);
    }
}
