package net.diemond_player.diemants_test.datagen;

import net.diemond_player.diemants_test.block.ModBlocks;
import net.diemond_player.diemants_test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BROWN_MUFFIN)
                .pattern("WWW")
                .pattern("SEM")
                .pattern("WWW")
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('E', Items.EGG)
                .input('M', ModItems.MUFFIN_CUP)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.MUFFIN_CUP), conditionsFromItem(ModItems.MUFFIN_CUP))
                .offerTo(exporter, new Identifier("brown_muffin_actual_recipe"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,
                ModItems.BROWN_MUFFIN, RecipeCategory.MISC, ModBlocks.MUFFIN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,
                ModItems.MUFFIN_CUP, RecipeCategory.MISC, ModBlocks.MUFFIN_CUP_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUFFIN_BLOCK_SLAB, ModBlocks.MUFFIN_BLOCK);

        offerPressurePlateRecipe(exporter, ModBlocks.MUFFIN_BLOCK_PRESSURE_PLATE, ModBlocks.MUFFIN_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUFFIN_BLOCK_STAIRS, 4)
                .pattern("M  ")
                .pattern("MM ")
                .pattern("MMM")
                .input('M', ModBlocks.MUFFIN_BLOCK)
                .criterion(hasItem(ModBlocks.MUFFIN_BLOCK), conditionsFromItem(ModBlocks.MUFFIN_BLOCK))
                .offerTo(exporter, new Identifier("muffin_block_stairs"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUFFIN_BLOCK_BUTTON)
                .input(ModBlocks.MUFFIN_BLOCK, 1)
                .criterion(hasItem(ModBlocks.MUFFIN_BLOCK), conditionsFromItem(ModBlocks.MUFFIN_BLOCK))
                .offerTo(exporter, new Identifier("muffin_block_button"));

    }
}
