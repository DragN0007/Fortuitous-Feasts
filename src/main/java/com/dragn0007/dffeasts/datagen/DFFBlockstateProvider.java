package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DFFBlockstateProvider extends BlockStateProvider {
    public DFFBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DFFeastsMain.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        logBlock(DFFBlocks.ORANGE_LOG.get());

        simpleBlock(DFFBlocks.ORANGE_PLANKS.get());
        simpleBlockItem(DFFBlocks.ORANGE_PLANKS.get(), models().cubeAll(DFFBlocks.ORANGE_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get())));

        simpleBlock(DFFBlocks.ORANGE_SAPLING.get(), models().cross(DFFBlocks.ORANGE_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.ORANGE_SAPLING.get())));
    }

}
