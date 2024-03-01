package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.util.DFFTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DFFRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public DFFRecipeMaker(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(DFFBlocksNoDatagen.CROP_BARREL.get())
                .define('A', Blocks.BARREL)
                .define('B', DFFTags.Items.CROP_ITEM)
                .pattern("BBB")
                .pattern(" A ")
                .unlockedBy("has_barrel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BARREL).build()))
                .save(pFinishedRecipeConsumer);
    }
}