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
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ORANGE = FeatureUtils.register("dff_orange",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.ORANGE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.ORANGE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> ORANGE_CHECKED =
            PlacementUtils.register("dff_orange_checked",
                    ORANGE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.ORANGE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ORANGE_SPAWN =
            FeatureUtils.register("dff_orange_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(ORANGE_CHECKED, 0.33333334F)), ORANGE_CHECKED));

    //Coconut
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> COCONUT = FeatureUtils.register("dff_coconut",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.COCONUT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.COCONUT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> COCONUT_CHECKED =
            PlacementUtils.register("dff_coconut_checked",
                    COCONUT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.COCONUT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> COCONUT_SPAWN =
            FeatureUtils.register("dff_coconut_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(COCONUT_CHECKED, 0.33333334F)), COCONUT_CHECKED));

    //Mango
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MANGO = FeatureUtils.register("dff_mango",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.MANGO_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.MANGO_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> MANGO_CHECKED =
            PlacementUtils.register("dff_mango_checked",
                    MANGO, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.MANGO_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MANGO_SPAWN =
            FeatureUtils.register("dff_mango_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(MANGO_CHECKED, 0.33333334F)), MANGO_CHECKED));

    //Grapefruit
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> GRAPEFRUIT = FeatureUtils.register("dff_grapefruit",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.GRAPEFRUIT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.GRAPEFRUIT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> GRAPEFRUIT_CHECKED =
            PlacementUtils.register("dff_grapefruit_checked",
                    GRAPEFRUIT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.GRAPEFRUIT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> GRAPEFRUIT_SPAWN =
            FeatureUtils.register("dff_grapefruit_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(GRAPEFRUIT_CHECKED, 0.33333334F)), GRAPEFRUIT_CHECKED));

    //Avocado
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> AVOCADO = FeatureUtils.register("dff_avocado",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.AVOCADO_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.AVOCADO_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> AVOCADO_CHECKED =
            PlacementUtils.register("dff_avocado_checked",
                    AVOCADO, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.AVOCADO_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> AVOCADO_SPAWN =
            FeatureUtils.register("dff_avocado_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(AVOCADO_CHECKED, 0.33333334F)), AVOCADO_CHECKED));

    //Cherry
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CHERRY = FeatureUtils.register("dff_cherry",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.CHERRY_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.CHERRY_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> CHERRY_CHECKED =
            PlacementUtils.register("dff_cherry_checked",
                    CHERRY, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.CHERRY_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CHERRY_SPAWN =
            FeatureUtils.register("dff_cherry_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(CHERRY_CHECKED, 0.33333334F)), CHERRY_CHECKED));

    //Pomegranate
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> POMEGRANATE = FeatureUtils.register("dff_pomegranate",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.POMEGRANATE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.POMEGRANATE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> POMEGRANATE_CHECKED =
            PlacementUtils.register("dff_pomegranate_checked",
                    POMEGRANATE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.POMEGRANATE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> POMEGRANATE_SPAWN =
            FeatureUtils.register("dff_pomegranate_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(POMEGRANATE_CHECKED, 0.33333334F)), POMEGRANATE_CHECKED));

    //Kiwi
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> KIWI = FeatureUtils.register("dff_kiwi",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.KIWI_LOG.get()),
            new StraightTrunkPlacer(1, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.KIWI_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> KIWI_CHECKED =
            PlacementUtils.register("dff_kiwi_checked",
                    KIWI, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.KIWI_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> KIWI_SPAWN =
            FeatureUtils.register("dff_kiwi_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(KIWI_CHECKED, 0.33333334F)), KIWI_CHECKED));

    //Lychee
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LYCHEE = FeatureUtils.register("dff_lychee",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.LYCHEE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.LYCHEE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> LYCHEE_CHECKED =
            PlacementUtils.register("dff_lychee_checked",
                    LYCHEE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.LYCHEE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> LYCHEE_SPAWN =
            FeatureUtils.register("lychee_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(LYCHEE_CHECKED, 0.33333334F)), LYCHEE_CHECKED));

    //Pear
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PEAR = FeatureUtils.register("dff_pear",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.PEAR_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.PEAR_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> PEAR_CHECKED =
            PlacementUtils.register("dff_pear_checked",
                    PEAR, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.PEAR_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> PEAR_SPAWN =
            FeatureUtils.register("dff_pear_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(PEAR_CHECKED, 0.33333334F)), PEAR_CHECKED));


    

    
    
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


