package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
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
        simpleItem(DFFItems.WALNUT.get());
        simpleItem(DFFItems.ZUCCHINI.get());

        simpleItem(DFFItems.OREGANO.get());
        simpleItem(DFFItems.ROSEMARY.get());
        simpleItem(DFFItems.CILANTRO.get());
        simpleItem(DFFItems.MINT.get());

        simpleItem(DFFItems.ORANGE_SEEDS.get());
        simpleItem(DFFItems.GRAPEFRUIT_SEEDS.get());
        simpleItem(DFFItems.MANGO_SEED.get());

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