package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
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
        stairsBlock((StairBlock) DFFBlocks.ORANGE_STAIRS.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_STAIRS.get(), models().stairs(DFFBlocks.ORANGE_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.ORANGE_SLAB.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_SLAB.get(), models().slab(DFFBlocks.ORANGE_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get())));
        simpleBlock(DFFBlocks.ORANGE_SAPLING.get(), models().cross(DFFBlocks.ORANGE_SAPLING.get().getRegistryName().getPath(),
        blockTexture(DFFBlocks.ORANGE_SAPLING.get())));

        logBlock(DFFBlocks.COCONUT_LOG.get());
        simpleBlock(DFFBlocks.COCONUT_PLANKS.get());
        simpleBlockItem(DFFBlocks.COCONUT_PLANKS.get(), models().cubeAll(DFFBlocks.COCONUT_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.COCONUT_STAIRS.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_STAIRS.get(), models().stairs(DFFBlocks.COCONUT_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.COCONUT_SLAB.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_SLAB.get(), models().slab(DFFBlocks.COCONUT_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        simpleBlock(DFFBlocks.COCONUT_SAPLING.get(), models().cross(DFFBlocks.COCONUT_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.COCONUT_SAPLING.get())));

        logBlock(DFFBlocks.MANGO_LOG.get());
        simpleBlock(DFFBlocks.MANGO_PLANKS.get());
        simpleBlockItem(DFFBlocks.MANGO_PLANKS.get(), models().cubeAll(DFFBlocks.MANGO_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.MANGO_STAIRS.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_STAIRS.get(), models().stairs(DFFBlocks.MANGO_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.MANGO_SLAB.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_SLAB.get(), models().slab(DFFBlocks.MANGO_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        simpleBlock(DFFBlocks.MANGO_SAPLING.get(), models().cross(DFFBlocks.MANGO_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.MANGO_SAPLING.get())));

        logBlock(DFFBlocks.GRAPEFRUIT_LOG.get());
        simpleBlock(DFFBlocks.GRAPEFRUIT_PLANKS.get());
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_PLANKS.get(), models().cubeAll(DFFBlocks.GRAPEFRUIT_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.GRAPEFRUIT_STAIRS.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_STAIRS.get(), models().stairs(DFFBlocks.GRAPEFRUIT_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.GRAPEFRUIT_SLAB.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_SLAB.get(), models().slab(DFFBlocks.GRAPEFRUIT_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        simpleBlock(DFFBlocks.GRAPEFRUIT_SAPLING.get(), models().cross(DFFBlocks.GRAPEFRUIT_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_SAPLING.get())));
    }

}
