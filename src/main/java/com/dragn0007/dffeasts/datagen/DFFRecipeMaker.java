package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.util.DFFTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DFFRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public DFFRecipeMaker(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_SEEDS.get())
                .requires(DFFItems.ORANGE.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.ORANGE_PLANKS.get(), 4)
                .requires(DFFBlocks.ORANGE_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.ORANGE_STAIRS.get(), 4)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.ORANGE_SLAB.get(), 3)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_SEED.get())
                .requires(DFFItems.MANGO.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.MANGO_PLANKS.get(), 4)
                .requires(DFFBlocks.MANGO_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.MANGO_STAIRS.get(), 4)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.MANGO_SLAB.get(), 3)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFBlocks.COCONUT_PLANKS.get(), 4)
                .requires(DFFBlocks.COCONUT_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.COCONUT_STAIRS.get(), 4)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.COCONUT_SLAB.get(), 3)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_SEEDS.get())
                .requires(DFFItems.GRAPEFRUIT.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.GRAPEFRUIT_PLANKS.get(), 4)
                .requires(DFFBlocks.GRAPEFRUIT_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.GRAPEFRUIT_STAIRS.get(), 4)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.GRAPEFRUIT_SLAB.get(), 3)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);




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