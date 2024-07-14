package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.item.DFFItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DFFItemModelProvider extends ItemModelProvider {
    public DFFItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DFFeastsMain.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Update 1.7
        simpleItem(DFFItems.CHOCOLATE_CHIP_COOKIE.get());
        simpleItem(DFFItems.CRANBERRY_COOKIE.get());
        simpleItem(DFFItems.DOUBLE_CHOCOLATE_CHIP_COOKIE.get());
        simpleItem(DFFItems.ICED_SUGAR_COOKIE.get());
        simpleItem(DFFItems.PEANUT_BUTTER_COOKIE.get());
        simpleItem(DFFItems.STRAWBERRY_CHEESECAKE_COOKIE.get());
        simpleItem(DFFItems.SUGAR_COOKIE.get());

        //Update 1.6
        simpleItem(DFFItems.APPLE_BEER.get());
        simpleItem(DFFItems.BLACKBERRY_BEER.get());
        simpleItem(DFFItems.BLUEBERRY_BEER.get());
        simpleItem(DFFItems.CRANBERRY_BEER.get());
        simpleItem(DFFItems.GRAPEFRUIT_BEER.get());
        simpleItem(DFFItems.ORANGE_BEER.get());
        simpleItem(DFFItems.PURPLE_GRAPE_BEER.get());
        simpleItem(DFFItems.RASPBERRY_BEER.get());
        simpleItem(DFFItems.RED_GRAPE_BEER.get());
        simpleItem(DFFItems.STRAWBERRY_BEER.get());
        simpleItem(DFFItems.GREEN_GRAPE_BEER.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_BEER.get());
        simpleItem(DFFItems.MANGO_BEER.get());
        simpleItem(DFFItems.CHERRY_BEER.get());
        simpleItem(DFFItems.KIWI_BEER.get());
        simpleItem(DFFItems.LYCHEE_BEER.get());
        simpleItem(DFFItems.PEAR_BEER.get());
        simpleItem(DFFItems.POMEGRANATE_BEER.get());
        simpleItem(DFFItems.DRAGONFRUIT_BEER.get());
        simpleItem(DFFItems.PASSIONFRUIT_BEER.get());



        //Update 1.5

        simpleItem(DFFItems.DRAGONFRUIT_TURNOVER.get());
        simpleItem(DFFItems.PASSIONFRUIT_TURNOVER.get());
        simpleItem(DFFItems.PICKLED_OLIVES.get());
        simpleItem(DFFItems.DRAGONFRUIT_PIE.get());
        simpleItem(DFFItems.PASSIONFRUIT_PIE.get());
        simpleItem(DFFItems.DRAGONFRUIT_JAM.get());
        simpleItem(DFFItems.PASSIONFRUIT_JAM.get());
        simpleItem(DFFItems.DRAGONFRUIT_PASTRY.get());
        simpleItem(DFFItems.PASSIONFRUIT_PASTRY.get());
        simpleItem(DFFItems.DRAGONFRUIT_JUICE.get());
        simpleItem(DFFItems.PASSIONFRUIT_JUICE.get());
        simpleItem(DFFItems.DRAGONFRUIT_WINE.get());
        simpleItem(DFFItems.PASSIONFRUIT_WINE.get());
        simpleItem(DFFItems.DRAGONFRUIT_SODA.get());
        simpleItem(DFFItems.PASSIONFRUIT_SODA.get());
        simpleItem(DFFItems.DRAGONFRUIT_SMOOTHIE.get());
        simpleItem(DFFItems.PASSIONFRUIT_SMOOTHIE.get());
        simpleItem(DFFItems.DRAGONFRUIT_TEA.get());
        simpleItem(DFFItems.PASSIONFRUIT_TEA.get());
        simpleItem(DFFItems.WALNUT.get());
        simpleItem(DFFItems.BANANA.get());
        simpleItem(DFFItems.DRAGONFRUIT.get());
        simpleItem(DFFItems.PASSIONFRUIT.get());
        simpleItem(DFFItems.CASHEWS.get());
        simpleItem(DFFItems.ALMONDS.get());
        simpleItem(DFFItems.OLIVES.get());
        simpleItem(DFFItems.BANANA_SEEDS.get());
        simpleItem(DFFItems.DRAGONFRUIT_SEEDS.get());
        simpleItem(DFFItems.PASSIONFRUIT_SEEDS.get());




        //1.0

        simpleItem(DFFItems.DOUGH.get());
        simpleItem(DFFItems.COCOA_POWDER.get());
        simpleItem(DFFItems.MILK_BOTTLE.get());
        simpleItem(DFFItems.FLOUR.get());
        simpleItem(DFFItems.PASTA.get());
        simpleItem(DFFItems.PANKO.get());
        simpleItem(DFFItems.PURIFIED_WATER.get());
        simpleItem(DFFItems.BUTTER.get());
        simpleItem(DFFItems.CHEESE_CURDS.get());
        simpleItem(DFFItems.TOFU.get());
        simpleItem(DFFItems.COOKED_TOFU.get());


        simpleItem(DFFItems.APPLE_TURNOVER.get());
        simpleItem(DFFItems.BLACKBERRY_TURNOVER.get());
        simpleItem(DFFItems.BLUEBERRY_TURNOVER.get());
        simpleItem(DFFItems.CRANBERRY_TURNOVER.get());
        simpleItem(DFFItems.GRAPEFRUIT_TURNOVER.get());
        simpleItem(DFFItems.ORANGE_TURNOVER.get());
        simpleItem(DFFItems.PURPLE_GRAPE_TURNOVER.get());
        simpleItem(DFFItems.RASPBERRY_TURNOVER.get());
        simpleItem(DFFItems.RED_GRAPE_TURNOVER.get());
        simpleItem(DFFItems.STRAWBERRY_TURNOVER.get());
        simpleItem(DFFItems.GREEN_GRAPE_TURNOVER.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_TURNOVER.get());
        simpleItem(DFFItems.MANGO_TURNOVER.get());
        simpleItem(DFFItems.CHERRY_TURNOVER.get());
        simpleItem(DFFItems.KIWI_TURNOVER.get());
        simpleItem(DFFItems.LYCHEE_TURNOVER.get());
        simpleItem(DFFItems.PEAR_TURNOVER.get());
        simpleItem(DFFItems.POMEGRANATE_TURNOVER.get());

        simpleItem(DFFItems.CHOCOLATE_CAKE.get());
        simpleItem(DFFItems.YELLOW_CHOCOLATE_CAKE.get());
        simpleItem(DFFItems.CHERRY_CHOCOLATE_CAKE.get());
        simpleItem(DFFItems.RED_VELVET_CAKE.get());
        simpleItem(DFFItems.WHITE_CAKE.get());
        simpleItem(DFFItems.BLACKBERRY_CAKE.get());
        simpleItem(DFFItems.BLUEBERRY_CAKE.get());
        simpleItem(DFFItems.CRANBERRY_CAKE.get());
        simpleItem(DFFItems.GRAPEFRUIT_CAKE.get());
        simpleItem(DFFItems.ORANGE_CAKE.get());
        simpleItem(DFFItems.PURPLE_GRAPE_CAKE.get());
        simpleItem(DFFItems.RASPBERRY_CAKE.get());
        simpleItem(DFFItems.RED_GRAPE_CAKE.get());
        simpleItem(DFFItems.STRAWBERRY_CAKE.get());
        simpleItem(DFFItems.GREEN_GRAPE_CAKE.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_CAKE.get());
        simpleItem(DFFItems.MANGO_CAKE.get());
        simpleItem(DFFItems.CHERRY_CAKE.get());
        simpleItem(DFFItems.KIWI_CAKE.get());
        simpleItem(DFFItems.LYCHEE_CAKE.get());
        simpleItem(DFFItems.PEAR_CAKE.get());
        simpleItem(DFFItems.POMEGRANATE_CAKE.get());

        simpleItem(DFFItems.PARMESAN_CHEESE.get());
        simpleItem(DFFItems.CHEDDAR_CHEESE.get());
        simpleItem(DFFItems.MOZZARELLA_CHEESE.get());

        simpleItem(DFFItems.VEGGIE_PASTA.get());
        simpleItem(DFFItems.VEGGIE_PLATTER.get());
        simpleItem(DFFItems.SOUP.get());
        simpleItem(DFFItems.BLOOMING_ONION.get());
        simpleItem(DFFItems.GARLIC_PARM_WINGS.get());
        simpleItem(DFFItems.DUMPLINGS.get());
        simpleItem(DFFItems.CHICKEN_PARM.get());
        simpleItem(DFFItems.MAC_N_CHEESE.get());
        simpleItem(DFFItems.PEANUT_BUTTER.get());
        simpleItem(DFFItems.PEANUT_BUTTER_JELLY.get());
        simpleItem(DFFItems.POT_ROAST.get());
        simpleItem(DFFItems.SAUSAGE_MAC.get());
        simpleItem(DFFItems.SPAGHETTI.get());
        simpleItem(DFFItems.SPAGHETTI_AND_MEATBALLS.get());
        simpleItem(DFFItems.TOMATO_SOUP.get());
        simpleItem(DFFItems.AVOCADO_TOAST.get());
        simpleItem(DFFItems.MERMAID_TOAST.get());
        simpleItem(DFFItems.LASAGNA.get());

        simpleItem(DFFItems.PICKLES.get());
        simpleItem(DFFItems.PICKLED_GARLIC.get());
        simpleItem(DFFItems.PICKLED_GINGER.get());
        simpleItem(DFFItems.PICKLED_PEPPERS.get());
        simpleItem(DFFItems.PICKLED_RADISH.get());

        simpleItem(DFFItems.MEAT_WRAP.get());
        simpleItem(DFFItems.MEAT_CHEESE_WRAP.get());
        simpleItem(DFFItems.MEAT_VEGGIE_WRAP.get());
        simpleItem(DFFItems.VEGGIE_WRAP.get());

        simpleItem(DFFItems.BEEF_SAUSAGE.get());
        simpleItem(DFFItems.CHICKEN_SAUSAGE.get());
        simpleItem(DFFItems.MUTTON_SAUSAGE.get());
        simpleItem(DFFItems.PORK_SAUSAGE.get());
        simpleItem(DFFItems.COOKED_BEEF_SAUSAGE.get());
        simpleItem(DFFItems.COOKED_CHICKEN_SAUSAGE.get());
        simpleItem(DFFItems.COOKED_MUTTON_SAUSAGE.get());
        simpleItem(DFFItems.COOKED_PORK_SAUSAGE.get());

        simpleItem(DFFItems.ROASTED_BRUSSELS_SPROUTS.get());
        simpleItem(DFFItems.ROASTED_BUTTERNUT_SQUASH.get());
        simpleItem(DFFItems.ROASTED_CORN.get());
        simpleItem(DFFItems.ROASTED_CHILI_PEPPER.get());
        simpleItem(DFFItems.ROASTED_CUCUMBER.get());
        simpleItem(DFFItems.ROASTED_PEANUTS.get());
        simpleItem(DFFItems.ROASTED_JALEPENO_PEPPER.get());
        simpleItem(DFFItems.ROASTED_RADISH.get());
        simpleItem(DFFItems.ROASTED_ZUCCHINI.get());
        simpleItem(DFFItems.ROASTED_TOMATO.get());
        simpleItem(DFFItems.ROASTED_GREEN_BEANS.get());
        simpleItem(DFFItems.ROASTED_GARLIC.get());

        simpleItem(DFFItems.APPLE_PIE.get());
        simpleItem(DFFItems.BLACKBERRY_PIE.get());
        simpleItem(DFFItems.BLUEBERRY_PIE.get());
        simpleItem(DFFItems.CRANBERRY_PIE.get());
        simpleItem(DFFItems.GRAPEFRUIT_PIE.get());
        simpleItem(DFFItems.ORANGE_PIE.get());
        simpleItem(DFFItems.PURPLE_GRAPE_PIE.get());
        simpleItem(DFFItems.RASPBERRY_PIE.get());
        simpleItem(DFFItems.RED_GRAPE_PIE.get());
        simpleItem(DFFItems.STRAWBERRY_PIE.get());
        simpleItem(DFFItems.GREEN_GRAPE_PIE.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_PIE.get());
        simpleItem(DFFItems.MANGO_PIE.get());
        simpleItem(DFFItems.CHERRY_PIE.get());
        simpleItem(DFFItems.KIWI_PIE.get());
        simpleItem(DFFItems.LYCHEE_PIE.get());
        simpleItem(DFFItems.PEAR_PIE.get());
        simpleItem(DFFItems.POMEGRANATE_PIE.get());

        simpleItem(DFFItems.APPLE_JAM.get());
        simpleItem(DFFItems.BLACKBERRY_JAM.get());
        simpleItem(DFFItems.BLUEBERRY_JAM.get());
        simpleItem(DFFItems.CRANBERRY_JAM.get());
        simpleItem(DFFItems.GRAPEFRUIT_JAM.get());
        simpleItem(DFFItems.ORANGE_JAM.get());
        simpleItem(DFFItems.PURPLE_GRAPE_JAM.get());
        simpleItem(DFFItems.RASPBERRY_JAM.get());
        simpleItem(DFFItems.RED_GRAPE_JAM.get());
        simpleItem(DFFItems.STRAWBERRY_JAM.get());
        simpleItem(DFFItems.GREEN_GRAPE_JAM.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_JAM.get());
        simpleItem(DFFItems.MANGO_JAM.get());
        simpleItem(DFFItems.CHERRY_JAM.get());
        simpleItem(DFFItems.KIWI_JAM.get());
        simpleItem(DFFItems.LYCHEE_JAM.get());
        simpleItem(DFFItems.PEAR_JAM.get());
        simpleItem(DFFItems.POMEGRANATE_JAM.get());

        simpleItem(DFFItems.APPLE_PASTRY.get());
        simpleItem(DFFItems.BLACKBERRY_PASTRY.get());
        simpleItem(DFFItems.BLUEBERRY_PASTRY.get());
        simpleItem(DFFItems.CRANBERRY_PASTRY.get());
        simpleItem(DFFItems.GRAPEFRUIT_PASTRY.get());
        simpleItem(DFFItems.ORANGE_PASTRY.get());
        simpleItem(DFFItems.PURPLE_GRAPE_PASTRY.get());
        simpleItem(DFFItems.RASPBERRY_PASTRY.get());
        simpleItem(DFFItems.RED_GRAPE_PASTRY.get());
        simpleItem(DFFItems.STRAWBERRY_PASTRY.get());
        simpleItem(DFFItems.GREEN_GRAPE_PASTRY.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_PASTRY.get());
        simpleItem(DFFItems.MANGO_PASTRY.get());
        simpleItem(DFFItems.CHERRY_PASTRY.get());
        simpleItem(DFFItems.KIWI_PASTRY.get());
        simpleItem(DFFItems.LYCHEE_PASTRY.get());
        simpleItem(DFFItems.PEAR_PASTRY.get());
        simpleItem(DFFItems.POMEGRANATE_PASTRY.get());

        simpleItem(DFFItems.BLACKBERRY_SODA.get());
        simpleItem(DFFItems.BLUEBERRY_SODA.get());
        simpleItem(DFFItems.CRANBERRY_SODA.get());
        simpleItem(DFFItems.GRAPEFRUIT_SODA.get());
        simpleItem(DFFItems.ORANGE_SODA.get());
        simpleItem(DFFItems.PURPLE_GRAPE_SODA.get());
        simpleItem(DFFItems.RASPBERRY_SODA.get());
        simpleItem(DFFItems.RED_GRAPE_SODA.get());
        simpleItem(DFFItems.STRAWBERRY_SODA.get());
        simpleItem(DFFItems.GREEN_GRAPE_SODA.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_SODA.get());
        simpleItem(DFFItems.MANGO_SODA.get());
        simpleItem(DFFItems.CHERRY_SODA.get());
        simpleItem(DFFItems.KIWI_SODA.get());
        simpleItem(DFFItems.LYCHEE_SODA.get());
        simpleItem(DFFItems.PEAR_SODA.get());
        simpleItem(DFFItems.POMEGRANATE_SODA.get());
        simpleItem(DFFItems.GINGER_SODA.get());

        simpleItem(DFFItems.BLACKBERRY_SMOOTHIE.get());
        simpleItem(DFFItems.BLUEBERRY_SMOOTHIE.get());
        simpleItem(DFFItems.CRANBERRY_SMOOTHIE.get());
        simpleItem(DFFItems.GRAPEFRUIT_SMOOTHIE.get());
        simpleItem(DFFItems.ORANGE_SMOOTHIE.get());
        simpleItem(DFFItems.PURPLE_GRAPE_SMOOTHIE.get());
        simpleItem(DFFItems.RASPBERRY_SMOOTHIE.get());
        simpleItem(DFFItems.RED_GRAPE_SMOOTHIE.get());
        simpleItem(DFFItems.STRAWBERRY_SMOOTHIE.get());
        simpleItem(DFFItems.GREEN_GRAPE_SMOOTHIE.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_SMOOTHIE.get());
        simpleItem(DFFItems.MANGO_SMOOTHIE.get());
        simpleItem(DFFItems.CHERRY_SMOOTHIE.get());
        simpleItem(DFFItems.KIWI_SMOOTHIE.get());
        simpleItem(DFFItems.LYCHEE_SMOOTHIE.get());
        simpleItem(DFFItems.PEAR_SMOOTHIE.get());
        simpleItem(DFFItems.POMEGRANATE_SMOOTHIE.get());

        simpleItem(DFFItems.DRIED_BLACKBERRY.get());
        simpleItem(DFFItems.DRIED_BLUEBERRIES.get());
        simpleItem(DFFItems.DRIED_CRANBERRIES.get());
        simpleItem(DFFItems.DRIED_GRAPEFRUIT.get());
        simpleItem(DFFItems.DRIED_ORANGE.get());
        simpleItem(DFFItems.DRIED_PURPLE_GRAPES.get());
        simpleItem(DFFItems.DRIED_RASPBERRY.get());
        simpleItem(DFFItems.DRIED_RED_GRAPES.get());
        simpleItem(DFFItems.DRIED_STRAWBERRY.get());
        simpleItem(DFFItems.DRIED_GREEN_GRAPES.get());
        simpleItem(DFFItems.DRIED_WHITE_RASPBERRY.get());
        simpleItem(DFFItems.DRIED_MANGO.get());
        simpleItem(DFFItems.DRIED_CHERRIES.get());
        simpleItem(DFFItems.DRIED_KIWI.get());
        simpleItem(DFFItems.DRIED_LYCHEE.get());
        simpleItem(DFFItems.DRIED_PEAR.get());
        simpleItem(DFFItems.DRIED_POMEGRANATE.get());

        simpleItem(DFFItems.APPLE_JUICE.get());
        simpleItem(DFFItems.BLACKBERRY_JUICE.get());
        simpleItem(DFFItems.BLUEBERRY_JUICE.get());
        simpleItem(DFFItems.CRANBERRY_JUICE.get());
        simpleItem(DFFItems.GRAPEFRUIT_JUICE.get());
        simpleItem(DFFItems.ORANGE_JUICE.get());
        simpleItem(DFFItems.PURPLE_GRAPE_JUICE.get());
        simpleItem(DFFItems.RASPBERRY_JUICE.get());
        simpleItem(DFFItems.RED_GRAPE_JUICE.get());
        simpleItem(DFFItems.STRAWBERRY_JUICE.get());
        simpleItem(DFFItems.GREEN_GRAPE_JUICE.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_JUICE.get());
        simpleItem(DFFItems.MANGO_JUICE.get());
        simpleItem(DFFItems.CHERRY_JUICE.get());
        simpleItem(DFFItems.KIWI_JUICE.get());
        simpleItem(DFFItems.LYCHEE_JUICE.get());
        simpleItem(DFFItems.PEAR_JUICE.get());
        simpleItem(DFFItems.POMEGRANATE_JUICE.get());

        simpleItem(DFFItems.BLACKBERRY_TEA.get());
        simpleItem(DFFItems.BLUEBERRY_TEA.get());
        simpleItem(DFFItems.CRANBERRY_TEA.get());
        simpleItem(DFFItems.GRAPEFRUIT_TEA.get());
        simpleItem(DFFItems.ORANGE_TEA.get());
        simpleItem(DFFItems.PURPLE_GRAPE_TEA.get());
        simpleItem(DFFItems.RASPBERRY_TEA.get());
        simpleItem(DFFItems.RED_GRAPE_TEA.get());
        simpleItem(DFFItems.STRAWBERRY_TEA.get());
        simpleItem(DFFItems.GREEN_GRAPE_TEA.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_TEA.get());
        simpleItem(DFFItems.MANGO_TEA.get());
        simpleItem(DFFItems.CHERRY_TEA.get());
        simpleItem(DFFItems.KIWI_TEA.get());
        simpleItem(DFFItems.LYCHEE_TEA.get());
        simpleItem(DFFItems.PEAR_TEA.get());
        simpleItem(DFFItems.POMEGRANATE_TEA.get());

        simpleItem(DFFItems.APPLE_WINE.get());
        simpleItem(DFFItems.BLACKBERRY_WINE.get());
        simpleItem(DFFItems.BLUEBERRY_WINE.get());
        simpleItem(DFFItems.CRANBERRY_WINE.get());
        simpleItem(DFFItems.GRAPEFRUIT_WINE.get());
        simpleItem(DFFItems.ORANGE_WINE.get());
        simpleItem(DFFItems.PURPLE_GRAPE_WINE.get());
        simpleItem(DFFItems.RASPBERRY_WINE.get());
        simpleItem(DFFItems.RED_GRAPE_WINE.get());
        simpleItem(DFFItems.STRAWBERRY_WINE.get());
        simpleItem(DFFItems.GREEN_GRAPE_WINE.get());
        simpleItem(DFFItems.WHITE_RASPBERRY_WINE.get());
        simpleItem(DFFItems.MANGO_WINE.get());
        simpleItem(DFFItems.CHERRY_WINE.get());
        simpleItem(DFFItems.KIWI_WINE.get());
        simpleItem(DFFItems.LYCHEE_WINE.get());
        simpleItem(DFFItems.PEAR_WINE.get());
        simpleItem(DFFItems.POMEGRANATE_WINE.get());

        simpleItem(DFFItems.PLAIN_DONUT.get());
        simpleItem(DFFItems.CHOCOLATE_DONUT.get());
        simpleItem(DFFItems.POWDERED_DONUT.get());
        simpleItem(DFFItems.CHOCOLATE_POWDERED_DONUT.get());
        simpleItem(DFFItems.GLAZED_DONUT.get());
        simpleItem(DFFItems.ICED_CHOCOLATE_DONUT.get());
        simpleItem(DFFItems.CHOCOLATE_GLAZED_DONUT.get());
        simpleItem(DFFItems.DOUBLE_CHOCOLATE_DONUT.get());
        simpleItem(DFFItems.STRAWBERRY_GLAZED_DONUT.get());
        simpleItem(DFFItems.STRAWBERRY_CHOCOLATE_DONUT.get());
        simpleItem(DFFItems.JELLY_DONUT.get());
        simpleItem(DFFItems.PEANUT_BUTTER_DONUT.get());


        simpleItem(DFFItems.BELL_PEPPER.get());
        simpleItem(DFFItems.BLACKBERRY.get());
        simpleItem(DFFItems.BLUEBERRIES.get());
        simpleItem(DFFItems.CORN.get());
        simpleItem(DFFItems.CRANBERRIES.get());
        simpleItem(DFFItems.GARLIC.get());
        simpleItem(DFFItems.GRAPEFRUIT.get());
        simpleItem(DFFItems.GREEN_BEANS.get());
        simpleItem(DFFItems.ONION.get());
        simpleItem(DFFItems.ORANGE.get());
        simpleItem(DFFItems.PURPLE_GRAPES.get());
        simpleItem(DFFItems.RASPBERRY.get());
        simpleItem(DFFItems.RED_GRAPES.get());
        simpleItem(DFFItems.STRAWBERRY.get());
        simpleItem(DFFItems.WHITE_GRAPES.get());
        simpleItem(DFFItems.WHITE_RASPBERRY.get());
        simpleItem(DFFItems.JALEPENO_PEPPER.get());
        simpleItem(DFFItems.CHILI_PEPPER.get());
        simpleItem(DFFItems.MANGO.get());
        simpleItem(DFFItems.TOMATO.get());
        simpleItem(DFFItems.RADISH.get());
        simpleItem(DFFItems.COCONUT.get());
        simpleItem(DFFItems.SOYBEANS.get());
        simpleItem(DFFItems.AVOCADO.get());
        simpleItem(DFFItems.BRUSSELS_SPROUTS.get());
        simpleItem(DFFItems.BUTTERNUT_SQUASH.get());
        simpleItem(DFFItems.CELERY.get());
        simpleItem(DFFItems.CHERRIES.get());
        simpleItem(DFFItems.CUCUMBER.get());
        simpleItem(DFFItems.GINGER.get());
        simpleItem(DFFItems.KIDNEY_BEANS.get());
        simpleItem(DFFItems.BLACK_BEANS.get());
        simpleItem(DFFItems.KIWI.get());
        simpleItem(DFFItems.LYCHEE.get());
        simpleItem(DFFItems.PEANUTS.get());
        simpleItem(DFFItems.PEAR.get());
        simpleItem(DFFItems.POMEGRANATE.get());
        simpleItem(DFFItems.RYE.get());
        simpleItem(DFFItems.ZUCCHINI.get());
        simpleItem(DFFItems.SUGAR_BEET.get());

        simpleItem(DFFItems.OREGANO.get());
        simpleItem(DFFItems.ROSEMARY.get());
        simpleItem(DFFItems.CILANTRO.get());
        simpleItem(DFFItems.MINT.get());

        simpleItem(DFFItems.ORANGE_SEEDS.get());
        simpleItem(DFFItems.GRAPEFRUIT_SEEDS.get());
        simpleItem(DFFItems.MANGO_SEED.get());
        simpleItem(DFFItems.AVOCADO_PIT.get());
        simpleItem(DFFItems.CHERRY_PIT.get());
        simpleItem(DFFItems.KIWI_SEEDS.get());
        simpleItem(DFFItems.LYCHEE_SEED.get());
        simpleItem(DFFItems.PEAR_SEEDS.get());
        simpleItem(DFFItems.POMEGRANATE_SEEDS.get());

        simpleItem(DFFItems.CROP_COIN.get());
    }

     private ItemModelBuilder simpleSpriteBlockItem(Block block) {
        return withExistingParent(block.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DFFeastsMain.MODID,"block/" + block.getRegistryName().getPath()));
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DFFeastsMain.MODID,"items/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DFFeastsMain.MODID,"items/" + item.getRegistryName().getPath()));
    }
}