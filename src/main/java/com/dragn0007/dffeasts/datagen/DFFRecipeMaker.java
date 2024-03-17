package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.util.DFFTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DFFRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public DFFRecipeMaker(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BRUSSELS_SPROUTS.get()), DFFItems.ROASTED_BRUSSELS_SPROUTS.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_brussels_sprouts_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BRUSSELS_SPROUTS.get()), DFFItems.ROASTED_BRUSSELS_SPROUTS.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_brussels_sprouts_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BUTTERNUT_SQUASH.get()), DFFItems.ROASTED_BUTTERNUT_SQUASH.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_butternut_squash_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BUTTERNUT_SQUASH.get()), DFFItems.ROASTED_BUTTERNUT_SQUASH.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_butternut_squash_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CHILI_PEPPER.get()), DFFItems.ROASTED_CHILI_PEPPER.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_chili_pepper_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CHILI_PEPPER.get()), DFFItems.ROASTED_CHILI_PEPPER.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_chili_pepper_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CORN.get()), DFFItems.ROASTED_CORN.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_corn_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CORN.get()), DFFItems.ROASTED_CORN.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_corn_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CUCUMBER.get()), DFFItems.ROASTED_CUCUMBER.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_cucumber_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CUCUMBER.get()), DFFItems.ROASTED_CUCUMBER.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_cucumber_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.GARLIC.get()), DFFItems.ROASTED_GARLIC.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_garlic_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.GARLIC.get()), DFFItems.ROASTED_GARLIC.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_garlic_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.GREEN_BEANS.get()), DFFItems.ROASTED_GREEN_BEANS.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_green_beans_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.GREEN_BEANS.get()), DFFItems.ROASTED_GREEN_BEANS.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_green_beans_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.JALEPENO_PEPPER.get()), DFFItems.ROASTED_JALEPENO_PEPPER.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_jalepeno_pepper_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.JALEPENO_PEPPER.get()), DFFItems.ROASTED_JALEPENO_PEPPER.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_jalepeno_pepper_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.RADISH.get()), DFFItems.ROASTED_RADISH.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_radish_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.RADISH.get()), DFFItems.ROASTED_RADISH.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_radish_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.ZUCCHINI.get()), DFFItems.ROASTED_ZUCCHINI.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_zucchini_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.ZUCCHINI.get()), DFFItems.ROASTED_ZUCCHINI.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_zucchini_campfire_cooking"));


        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BLACKBERRY.get()), DFFItems.DRIED_BLACKBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blackberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BLACKBERRY.get()), DFFItems.DRIED_BLACKBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blackberry_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BLUEBERRIES.get()), DFFItems.DRIED_BLUEBERRIES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blueberries_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BLUEBERRIES.get()), DFFItems.BLUEBERRIES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blueberries_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CHERRIES.get()), DFFItems.DRIED_CHERRIES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cherries_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CHERRIES.get()), DFFItems.DRIED_CHERRIES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cherries_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CRANBERRIES.get()), DFFItems.DRIED_CRANBERRIES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cranberries_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CRANBERRIES.get()), DFFItems.DRIED_CRANBERRIES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cranberries_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.GRAPEFRUIT.get()), DFFItems.DRIED_GRAPEFRUIT.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_grapefruit_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.GRAPEFRUIT.get()), DFFItems.DRIED_GRAPEFRUIT.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_grapefruit_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.KIWI.get()), DFFItems.DRIED_KIWI.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_kiwi_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.KIWI.get()), DFFItems.DRIED_KIWI.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_kiwi_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.LYCHEE.get()), DFFItems.DRIED_LYCHEE.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_lychee_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.LYCHEE.get()), DFFItems.DRIED_LYCHEE.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_lychee_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.MANGO.get()), DFFItems.DRIED_MANGO.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_mango_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.MANGO.get()), DFFItems.DRIED_MANGO.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_mango_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.ORANGE.get()), DFFItems.DRIED_ORANGE.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_orange_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.ORANGE.get()), DFFItems.DRIED_ORANGE.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_orange_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.PEAR.get()), DFFItems.DRIED_PEAR.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_pear_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.PEAR.get()), DFFItems.DRIED_PEAR.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_pear_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.WHITE_GRAPES.get()), DFFItems.DRIED_GREEN_GRAPES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_green_grapes_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.WHITE_GRAPES.get()), DFFItems.DRIED_GREEN_GRAPES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_green_grapes_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.PURPLE_GRAPES.get()), DFFItems.DRIED_PURPLE_GRAPES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_purple_grapes_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.PURPLE_GRAPES.get()), DFFItems.DRIED_PURPLE_GRAPES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_purple_grapes_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.RED_GRAPES.get()), DFFItems.DRIED_RED_GRAPES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_red_grapes_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.RED_GRAPES.get()), DFFItems.DRIED_RED_GRAPES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_red_grapes_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.RASPBERRY.get()), DFFItems.DRIED_RASPBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_raspberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.RASPBERRY.get()), DFFItems.DRIED_RASPBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_raspberry_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.WHITE_RASPBERRY.get()), DFFItems.DRIED_WHITE_RASPBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_white_raspberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.WHITE_RASPBERRY.get()), DFFItems.DRIED_WHITE_RASPBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_white_raspberry_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.STRAWBERRY.get()), DFFItems.DRIED_STRAWBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_strawberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.STRAWBERRY.get()), DFFItems.DRIED_STRAWBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_strawberry_campfire_cooking"));



        //TODO; Meals
        ShapelessRecipeBuilder.shapeless(DFFItems.DUMPLINGS.get(), 2)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.DUMPLING_FILLING)
                .requires(DFFTags.Items.DUMPLING_FILLING)
                .requires(DFFTags.Items.DUMPLING_FILLING)
                .requires(DFFItems.DOUGH.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POT_ROAST.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFTags.Items.VEGETABLES)
                .requires(DFFItems.GARLIC.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MAC_N_CHEESE.get())
                .requires(DFFTags.Items.CHEESE)
                .requires(DFFItems.PASTA.get())
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PASTA.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.SAUSAGE_MAC.get())
                .requires(DFFItems.MAC_N_CHEESE.get())
                .requires(DFFTags.Items.COOKED_SAUSAGE)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PASTA.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.SPAGHETTI_AND_MEATBALLS.get())
                .requires(DFFItems.TOMATO_SOUP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.PASTA.get())
                .requires(DFFItems.GARLIC.get())
                .requires(DFFTags.Items.COOKED_MEATS)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PASTA.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.SPAGHETTI.get())
                .requires(DFFItems.TOMATO_SOUP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.PASTA.get())
                .requires(DFFItems.GARLIC.get())
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PASTA.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEANUT_BUTTER_JELLY.get())
                .requires(DFFItems.PEANUT_BUTTER.get())
                .requires(DFFTags.Items.JAMS)
                .requires(Items.BREAD)
                .requires(Items.BREAD)
                .unlockedBy("has_bread", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BREAD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHICKEN_PARM.get())
                .requires(DFFItems.PARMESAN_CHEESE.get())
                .requires(DFFItems.PASTA.get())
                .requires(DFFItems.TOMATO_SOUP.get())
                .requires(Items.COOKED_CHICKEN)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PASTA.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEANUT_BUTTER.get(), 4)
                .requires(DFFItems.PEANUTS.get())
                .requires(DFFItems.PEANUTS.get())
                .unlockedBy("has_peanuts", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PEANUTS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.TOMATO_SOUP.get(), 4)
                .requires(DFFItems.TOMATO.get())
                .requires(DFFItems.TOMATO.get())
                .requires(DFFItems.ONION.get())
                .requires(DFFTags.Items.HERBS)
                .unlockedBy("has_tomatoes", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.TOMATO.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.AVOCADO_TOAST.get(), 2)
                .requires(DFFItems.AVOCADO.get())
                .requires(Items.BREAD)
                .requires(DFFItems.BUTTER.get())
                .unlockedBy("has_avocado", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.AVOCADO.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MERMAID_TOAST.get(), 2)
                .requires(DFFItems.AVOCADO.get())
                .requires(Items.BREAD)
                .requires(DFFItems.BUTTER.get())
                .requires(Items.BEETROOT)
                .requires(Items.KELP)
                .requires(DFFItems.BLUEBERRIES.get())
                .unlockedBy("has_avocado", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.AVOCADO.get())
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Wrap
        ShapelessRecipeBuilder.shapeless(DFFItems.MEAT_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFItems.DOUGH.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MEAT_CHEESE_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFItems.DOUGH.get())
                .requires(DFFTags.Items.CHEESE)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MEAT_VEGGIE_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFItems.DOUGH.get())
                .requires(DFFTags.Items.VEGETABLES)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.VEGGIE_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.VEGETABLES)
                .requires(DFFItems.DOUGH.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Sausage
        ShapelessRecipeBuilder.shapeless(DFFItems.BEEF_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(Items.BEEF)
                .requires(Items.BEEF)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BEEF_SAUSAGE.get()), DFFItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_beef_sausage", has(DFFItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_beef_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.BEEF_SAUSAGE.get()), DFFItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_beef_sausage", has(DFFItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_beef_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BEEF_SAUSAGE.get()), DFFItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_beef_sausage", has(DFFItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_beef_sausage_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(DFFItems.CHICKEN_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(Items.CHICKEN)
                .requires(Items.CHICKEN)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CHICKEN_SAUSAGE.get()), DFFItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_chicken_sausage", has(DFFItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_chicken_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.CHICKEN_SAUSAGE.get()), DFFItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_chicken_sausage", has(DFFItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_chicken_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CHICKEN_SAUSAGE.get()), DFFItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_chicken_sausage", has(DFFItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_chicken_sausage_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(DFFItems.MUTTON_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(Items.MUTTON)
                .requires(Items.MUTTON)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.MUTTON_SAUSAGE.get()), DFFItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_mutton_sausage", has(DFFItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_mutton_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.MUTTON_SAUSAGE.get()), DFFItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_mutton_sausage", has(DFFItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_mutton_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.MUTTON_SAUSAGE.get()), DFFItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_mutton_sausage", has(DFFItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_mutton_sausage_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(DFFItems.PORK_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(Items.PORKCHOP)
                .requires(Items.PORKCHOP)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.PORK_SAUSAGE.get()), DFFItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_pork_sausage", has(DFFItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_pork_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.PORK_SAUSAGE.get()), DFFItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_pork_sausage", has(DFFItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_pork_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.PORK_SAUSAGE.get()), DFFItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_pork_sausage", has(DFFItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_pork_sausage_campfire_cooking"));



        //TODO; Pickled Veggies
        ShapelessRecipeBuilder.shapeless(DFFItems.PICKLED_GARLIC.get(), 2)
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFItems.GARLIC.get())
                .requires(DFFItems.GARLIC.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PICKLED_RADISH.get(), 2)
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFItems.GARLIC.get())
                .requires(DFFItems.RADISH.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PICKLED_PEPPERS.get(), 2)
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFItems.GARLIC.get())
                .requires(DFFTags.Items.PEPPERS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PICKLED_GINGER.get(), 2)
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFItems.GARLIC.get())
                .requires(DFFItems.GINGER.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PICKLES.get(), 2)
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFItems.GARLIC.get())
                .requires(DFFTags.Items.VEGETABLES)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Donuts
        ShapelessRecipeBuilder.shapeless(DFFItems.PLAIN_DONUT.get(), 2)
                .requires(Items.SUGAR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.DOUGH.get())
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.DOUGH.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POWDERED_DONUT.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.JELLY_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFTags.Items.JAMS)
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GLAZED_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHOCOLATE_GLAZED_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.COCOA_POWDER.get())
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_GLAZED_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHOCOLATE_DONUT.get(), 2)
                .requires(Items.SUGAR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.COCOA_POWDER.get())
                .requires(DFFItems.DOUGH.get())
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.DOUGH.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHOCOLATE_POWDERED_DONUT.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ICED_CHOCOLATE_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                       .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.DOUBLE_CHOCOLATE_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.COCOA_POWDER.get())
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                       .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_CHOCOLATE_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                       .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEANUT_BUTTER_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.PEANUT_BUTTER.get())
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);





        //TODO; Pie
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.BLACKBERRY.get())
                .requires(DFFItems.BLACKBERRY.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.BLUEBERRIES.get())
                .requires(DFFItems.BLUEBERRIES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.CRANBERRIES.get())
                .requires(DFFItems.CRANBERRIES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.CHERRIES.get())
                .requires(DFFItems.CHERRIES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.STRAWBERRY.get())
                .requires(DFFItems.STRAWBERRY.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.GRAPEFRUIT.get())
                .requires(DFFItems.GRAPEFRUIT.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.POMEGRANATE.get())
                .requires(DFFItems.POMEGRANATE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.WHITE_GRAPES.get())
                .requires(DFFItems.WHITE_GRAPES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.KIWI.get())
                .requires(DFFItems.KIWI.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.LYCHEE.get())
                .requires(DFFItems.LYCHEE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.MANGO.get())
                .requires(DFFItems.MANGO.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.ORANGE.get())
                .requires(DFFItems.ORANGE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.PEAR.get())
                .requires(DFFItems.PEAR.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.PURPLE_GRAPES.get())
                .requires(DFFItems.PURPLE_GRAPES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.RASPBERRY.get())
                .requires(DFFItems.RASPBERRY.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.RED_GRAPES.get())
                .requires(DFFItems.RED_GRAPES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_PIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BUTTER.get())
                .requires(DFFItems.WHITE_RASPBERRY.get())
                .requires(DFFItems.WHITE_RASPBERRY.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Smoothie
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_SMOOTHIE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Wine
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_WINE.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Tea
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_TEA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Jam
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.BLACKBERRY.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.BLUEBERRIES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.CRANBERRIES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.CHERRIES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.STRAWBERRY.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.GRAPEFRUIT.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_JAM.get())
                .requires(Items.SUGAR)

                .requires(DFFItems.POMEGRANATE.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.WHITE_GRAPES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.KIWI.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.LYCHEE.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.MANGO.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.ORANGE.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.PEAR.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.PURPLE_GRAPES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.RASPBERRY.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.RED_GRAPES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_JAM.get())
                .requires(Items.SUGAR)
                .requires(DFFItems.WHITE_RASPBERRY.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Juice
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.BLACKBERRY.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.BLUEBERRIES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.CRANBERRIES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.CHERRIES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.STRAWBERRY.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.GRAPEFRUIT.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)

                .requires(DFFItems.POMEGRANATE.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.WHITE_GRAPES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.KIWI.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.LYCHEE.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.MANGO.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.ORANGE.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.PEAR.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.PURPLE_GRAPES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.RASPBERRY.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.RED_GRAPES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_JUICE.get())
                 .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.WHITE_RASPBERRY.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Soda
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_SODA.get())
                .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_SODA.get())
                 .requires(Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Pastry
        ShapelessRecipeBuilder.shapeless(DFFItems.BLACKBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.BLACKBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BLUEBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.BLUEBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CRANBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.CRANBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.CHERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.STRAWBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GRAPEFRUIT_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.GRAPEFRUIT_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.POMEGRANATE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.GREEN_GRAPE_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.GREEN_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.KIWI_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.LYCHEE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MANGO_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.MANGO_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.ORANGE_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.ORANGE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.PEAR_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURPLE_GRAPE_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.PURPLE_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RASPBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.RASPBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.RED_GRAPE_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.RED_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(DFFItems.WHITE_RASPBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFItems.WHITE_RASPBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Ingredient
        ShapelessRecipeBuilder.shapeless(DFFItems.COCOA_POWDER.get(), 4)
                .requires(Items.COCOA_BEANS)
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PURIFIED_WATER.get(), 16)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WATER_BUCKET)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.FLOUR.get(), 3)
                .requires(DFFTags.Items.WHEAT)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.DOUGH.get(), 4)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WHEAT)
                .requires(DFFTags.Items.WATER)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.BUTTER.get(), 6)
                .requires(DFFTags.Items.MILK)
                .unlockedBy("has_milk", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.MILK)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.TOFU.get(), 3)
                .requires(DFFItems.SOYBEANS.get())
                .requires(DFFItems.SOYBEANS.get())
                .requires(DFFItems.SOYBEANS.get())
                .unlockedBy("has_soybeans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.SOYBEANS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PANKO.get(), 6)
                .requires(Items.BREAD)
                .unlockedBy("has_bread", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BREAD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.CHEDDAR_CHEESE.get(), 3)
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CILANTRO.get())
                .unlockedBy("has_cheese_curds", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHEESE_CURDS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PARMESAN_CHEESE.get(), 3)
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.ROSEMARY.get())
                .unlockedBy("has_cheese_curds", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHEESE_CURDS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.MOZZARELLA_CHEESE.get(), 3)
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFTags.Items.WATER)
                .unlockedBy("has_cheese_curds", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHEESE_CURDS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFItems.PASTA.get(), 4)
                .requires(DFFItems.DOUGH.get())
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.DOUGH.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.TOFU.get()), DFFItems.COOKED_TOFU.get(), 0.35F, 100)
                .unlockedBy("has_tofu", has(DFFItems.TOFU.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_tofu_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.TOFU.get()), DFFItems.COOKED_TOFU.get(), 0.35F, 200)
                .unlockedBy("has_tofu", has(DFFItems.TOFU.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_tofu_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.TOFU.get()), DFFItems.COOKED_TOFU.get(), 0.35F, 600)
                .unlockedBy("has_tofu", has(DFFItems.TOFU.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_tofu_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.DOUGH.get()), Items.BREAD, 0.35F, 100)
                .unlockedBy("has_dough", has(DFFItems.DOUGH.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "pasta_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.DOUGH.get()), Items.BREAD, 0.35F, 200)
                .unlockedBy("has_dough", has(DFFItems.DOUGH.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "pasta_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.DOUGH.get()), Items.BREAD, 0.35F, 600)
                .unlockedBy("has_dough", has(DFFItems.DOUGH.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "pasta_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.MILK), DFFItems.CHEESE_CURDS.get(), 0.35F, 100)
                .unlockedBy("has_milk", has(DFFTags.Items.MILK)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cheese_curds_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFTags.Items.MILK), DFFItems.CHEESE_CURDS.get(), 0.35F, 200)
                .unlockedBy("has_milk", has(DFFTags.Items.MILK)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cheese_curds_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.MILK), DFFItems.CHEESE_CURDS.get(), 0.35F, 600)
                .unlockedBy("has_milk", has(DFFTags.Items.MILK)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cheese_curds_campfire_cooking"));



        //TODO; Wood
        ShapelessRecipeBuilder.shapeless(DFFItems.CHERRY_PIT.get())
                .requires(DFFItems.CHERRIES.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.CHERRY_PLANKS.get(), 4)
                .requires(DFFBlocks.CHERRY_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.CHERRY_STAIRS.get(), 4)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.CHERRY_SLAB.get(), 3)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFItems.AVOCADO_PIT.get())
                .requires(DFFItems.AVOCADO.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.AVOCADO_PLANKS.get(), 4)
                .requires(DFFBlocks.AVOCADO_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.AVOCADO_STAIRS.get(), 4)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.AVOCADO_SLAB.get(), 3)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFItems.LYCHEE_SEED.get())
                .requires(DFFItems.LYCHEE.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.LYCHEE_PLANKS.get(), 4)
                .requires(DFFBlocks.LYCHEE_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.LYCHEE_STAIRS.get(), 4)
                .define('A', DFFBlocks.LYCHEE_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.LYCHEE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.LYCHEE_SLAB.get(), 3)
                .define('A', DFFBlocks.LYCHEE_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.LYCHEE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFItems.KIWI_SEEDS.get())
                .requires(DFFItems.KIWI.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.KIWI_PLANKS.get(), 4)
                .requires(DFFBlocks.KIWI_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.KIWI_STAIRS.get(), 4)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.KIWI_SLAB.get(), 3)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFItems.PEAR_SEEDS.get())
                .requires(DFFItems.PEAR.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.PEAR_PLANKS.get(), 4)
                .requires(DFFBlocks.PEAR_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.PEAR_STAIRS.get(), 4)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.PEAR_SLAB.get(), 3)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(DFFItems.POMEGRANATE_SEEDS.get())
                .requires(DFFItems.POMEGRANATE.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DFFBlocks.POMEGRANATE_PLANKS.get(), 4)
                .requires(DFFBlocks.POMEGRANATE_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.POMEGRANATE_STAIRS.get(), 4)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DFFBlocks.POMEGRANATE_SLAB.get(), 3)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


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



        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ROTTEN_FLESH), Items.LEATHER, 0.35F, 200)
                .unlockedBy("has_rotten_flesh", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ROTTEN_FLESH).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(Items.PAPER, 12)
                .requires(DFFTags.Items.PAPERABLE_LOGS)
                .requires(DFFTags.Items.PAPERABLE_LOGS)
                .unlockedBy("has_paperable_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PAPERABLE_LOGS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(Items.SUGAR, 4)
                .requires(DFFItems.SUGAR_BEET.get())
                .unlockedBy("has_sugar_beet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.SUGAR_BEET.get())
                        .build()))
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