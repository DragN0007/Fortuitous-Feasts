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