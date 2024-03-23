package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
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
        simpleBlock(DFFBlocks.DFF_ORANGE_SAPLING.get(), models().cross(DFFBlocks.DFF_ORANGE_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_ORANGE_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.ORANGE_FENCE.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_FENCE.get(), models().fenceInventory(DFFBlocks.ORANGE_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.ORANGE_FENCE_GATE.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_FENCE_GATE.get(), models().fenceGate(DFFBlocks.ORANGE_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get())));

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
        simpleBlock(DFFBlocks.DFF_COCONUT_SAPLING.get(), models().cross(DFFBlocks.DFF_COCONUT_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_COCONUT_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.COCONUT_FENCE.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_FENCE.get(), models().fenceInventory(DFFBlocks.COCONUT_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.COCONUT_FENCE_GATE.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_FENCE_GATE.get(), models().fenceGate(DFFBlocks.COCONUT_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get())));

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
        simpleBlock(DFFBlocks.DFF_MANGO_SAPLING.get(), models().cross(DFFBlocks.DFF_MANGO_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_MANGO_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.MANGO_FENCE.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_FENCE.get(), models().fenceInventory(DFFBlocks.MANGO_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.MANGO_FENCE_GATE.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_FENCE_GATE.get(), models().fenceGate(DFFBlocks.MANGO_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get())));

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
        simpleBlock(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get(), models().cross(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.GRAPEFRUIT_FENCE.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_FENCE.get(), models().fenceInventory(DFFBlocks.GRAPEFRUIT_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.GRAPEFRUIT_FENCE_GATE.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_FENCE_GATE.get(), models().fenceGate(DFFBlocks.GRAPEFRUIT_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));

        logBlock(DFFBlocks.AVOCADO_LOG.get());
        simpleBlock(DFFBlocks.AVOCADO_PLANKS.get());
        simpleBlockItem(DFFBlocks.AVOCADO_PLANKS.get(), models().cubeAll(DFFBlocks.AVOCADO_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.AVOCADO_STAIRS.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_STAIRS.get(), models().stairs(DFFBlocks.AVOCADO_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.AVOCADO_SLAB.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_SLAB.get(), models().slab(DFFBlocks.AVOCADO_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_AVOCADO_SAPLING.get(), models().cross(DFFBlocks.DFF_AVOCADO_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_AVOCADO_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.AVOCADO_FENCE.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_FENCE.get(), models().fenceInventory(DFFBlocks.AVOCADO_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.AVOCADO_FENCE_GATE.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_FENCE_GATE.get(), models().fenceGate(DFFBlocks.AVOCADO_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));

        logBlock(DFFBlocks.KIWI_LOG.get());
        simpleBlock(DFFBlocks.KIWI_PLANKS.get());
        simpleBlockItem(DFFBlocks.KIWI_PLANKS.get(), models().cubeAll(DFFBlocks.KIWI_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.KIWI_STAIRS.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_STAIRS.get(), models().stairs(DFFBlocks.KIWI_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.KIWI_SLAB.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_SLAB.get(), models().slab(DFFBlocks.KIWI_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_KIWI_SAPLING.get(), models().cross(DFFBlocks.DFF_KIWI_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_KIWI_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.KIWI_FENCE.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_FENCE.get(), models().fenceInventory(DFFBlocks.KIWI_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.KIWI_FENCE_GATE.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_FENCE_GATE.get(), models().fenceGate(DFFBlocks.KIWI_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get())));

        logBlock(DFFBlocks.LYCHEE_LOG.get());
        simpleBlock(DFFBlocks.LYCHEE_PLANKS.get());
        simpleBlockItem(DFFBlocks.LYCHEE_PLANKS.get(), models().cubeAll(DFFBlocks.LYCHEE_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.LYCHEE_STAIRS.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_STAIRS.get(), models().stairs(DFFBlocks.LYCHEE_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.LYCHEE_SLAB.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_SLAB.get(), models().slab(DFFBlocks.LYCHEE_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_LYCHEE_SAPLING.get(), models().cross(DFFBlocks.DFF_LYCHEE_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_LYCHEE_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.LYCHEE_FENCE.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_FENCE.get(), models().fenceInventory(DFFBlocks.LYCHEE_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.LYCHEE_FENCE_GATE.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_FENCE_GATE.get(), models().fenceGate(DFFBlocks.LYCHEE_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));

        logBlock(DFFBlocks.PEAR_LOG.get());
        simpleBlock(DFFBlocks.PEAR_PLANKS.get());
        simpleBlockItem(DFFBlocks.PEAR_PLANKS.get(), models().cubeAll(DFFBlocks.PEAR_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.PEAR_STAIRS.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_STAIRS.get(), models().stairs(DFFBlocks.PEAR_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.PEAR_SLAB.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_SLAB.get(), models().slab(DFFBlocks.PEAR_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_PEAR_SAPLING.get(), models().cross(DFFBlocks.DFF_PEAR_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_PEAR_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.PEAR_FENCE.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_FENCE.get(), models().fenceInventory(DFFBlocks.PEAR_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.PEAR_FENCE_GATE.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_FENCE_GATE.get(), models().fenceGate(DFFBlocks.PEAR_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get())));

        logBlock(DFFBlocks.POMEGRANATE_LOG.get());
        simpleBlock(DFFBlocks.POMEGRANATE_PLANKS.get());
        simpleBlockItem(DFFBlocks.POMEGRANATE_PLANKS.get(), models().cubeAll(DFFBlocks.POMEGRANATE_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.POMEGRANATE_STAIRS.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_STAIRS.get(), models().stairs(DFFBlocks.POMEGRANATE_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.POMEGRANATE_SLAB.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_SLAB.get(), models().slab(DFFBlocks.POMEGRANATE_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_POMEGRANATE_SAPLING.get(), models().cross(DFFBlocks.DFF_POMEGRANATE_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_POMEGRANATE_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.POMEGRANATE_FENCE.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_FENCE.get(), models().fenceInventory(DFFBlocks.POMEGRANATE_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.POMEGRANATE_FENCE_GATE.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_FENCE_GATE.get(), models().fenceGate(DFFBlocks.POMEGRANATE_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));

        logBlock(DFFBlocks.CHERRY_LOG.get());
        simpleBlock(DFFBlocks.CHERRY_PLANKS.get());
        simpleBlockItem(DFFBlocks.CHERRY_PLANKS.get(), models().cubeAll(DFFBlocks.CHERRY_PLANKS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.CHERRY_STAIRS.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_STAIRS.get(), models().stairs(DFFBlocks.CHERRY_STAIRS.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.CHERRY_SLAB.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_SLAB.get(), models().slab(DFFBlocks.CHERRY_SLAB.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_CHERRY_SAPLING.get(), models().cross(DFFBlocks.DFF_CHERRY_SAPLING.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.DFF_CHERRY_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.CHERRY_FENCE.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_FENCE.get(), models().fenceInventory(DFFBlocks.CHERRY_FENCE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.CHERRY_FENCE_GATE.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_FENCE_GATE.get(), models().fenceGate(DFFBlocks.CHERRY_FENCE_GATE.get().getRegistryName().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
    }

}
