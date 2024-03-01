package com.dragn0007.dffeasts.world.feature;


import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfigFeatures {


    //Orange
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ORANGE = FeatureUtils.register("orange",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.ORANGE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.ORANGE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> ORANGE_CHECKED =
            PlacementUtils.register("orange_checked",
                    ORANGE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.ORANGE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ORANGE_SPAWN =
            FeatureUtils.register("orange_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(ORANGE_CHECKED, 0.33333334F)), ORANGE_CHECKED));

    //Coconut
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> COCONUT = FeatureUtils.register("coconut",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.COCONUT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.COCONUT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> COCONUT_CHECKED =
            PlacementUtils.register("coconut_checked",
                    COCONUT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.COCONUT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> COCONUT_SPAWN =
            FeatureUtils.register("coconut_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(COCONUT_CHECKED, 0.33333334F)), COCONUT_CHECKED));
    
    
    
    
    
    
    //Wild Berry
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BLUEBERRY =
            FeatureUtils.register("blueberry", Feature.FLOWER,
                    new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.BLUEBERRY_BUSH.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BLACKBERRY =
            FeatureUtils.register("blackberry", Feature.FLOWER,
                    new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.BLACKBERRY_BUSH.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> RASPBERRY =
            FeatureUtils.register("raspberry", Feature.FLOWER,
                    new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.RASPBERRY_BUSH.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WHITE_RASPBERRY =
            FeatureUtils.register("white_raspberry", Feature.FLOWER,
                    new RandomPatchConfiguration(8, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.WHITE_RASPBERRY_BUSH.get())))));


}


