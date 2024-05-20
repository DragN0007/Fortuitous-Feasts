package com.dragn0007.dffeasts.world.feature;


import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.util.config.DFFeastsCommonConfig;
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

    //1.5

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_DRAGONFRUIT = FeatureUtils.register("dff_dragonfruit",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.DRAGONFRUIT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.DRAGONFRUIT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_DRAGONFRUIT_CHECKED =
            PlacementUtils.register("dff_dragonfruit_checked",
                    DFF_DRAGONFRUIT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.DRAGONFRUIT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_DRAGONFRUIT_SPAWN =
            FeatureUtils.register("dff_dragonfruit_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_DRAGONFRUIT_CHECKED, 0.33333334F)), DFF_DRAGONFRUIT_CHECKED));


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_PASSIONFRUIT = FeatureUtils.register("dff_passionfruit",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.PASSIONFRUIT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.PASSIONFRUIT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_PASSIONFRUIT_CHECKED =
            PlacementUtils.register("dff_passionfruit_checked",
                    DFF_PASSIONFRUIT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.PASSIONFRUIT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_PASSIONFRUIT_SPAWN =
            FeatureUtils.register("dff_passionfruit_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_PASSIONFRUIT_CHECKED, 0.33333334F)), DFF_PASSIONFRUIT_CHECKED));


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_BANANA = FeatureUtils.register("dff_banana",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.BANANA_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.BANANA_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_BANANA_CHECKED =
            PlacementUtils.register("dff_banana_checked",
                    DFF_BANANA, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.BANANA_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_BANANA_SPAWN =
            FeatureUtils.register("dff_banana_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_BANANA_CHECKED, 0.33333334F)), DFF_BANANA_CHECKED));


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_WALNUT = FeatureUtils.register("dff_walnut",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.WALNUT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.WALNUT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_WALNUT_CHECKED =
            PlacementUtils.register("dff_walnut_checked",
                    DFF_WALNUT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.WALNUT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_WALNUT_SPAWN =
            FeatureUtils.register("dff_walnut_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_WALNUT_CHECKED, 0.33333334F)), DFF_WALNUT_CHECKED));


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_CASHEW = FeatureUtils.register("dff_cashew",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.CASHEW_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.CASHEW_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_CASHEW_CHECKED =
            PlacementUtils.register("dff_cashew_checked",
                    DFF_CASHEW, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.CASHEW_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_CASHEW_SPAWN =
            FeatureUtils.register("dff_cashew_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_CASHEW_CHECKED, 0.33333334F)), DFF_CASHEW_CHECKED));


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_ALMOND = FeatureUtils.register("dff_almond",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.ALMOND_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.ALMOND_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_ALMOND_CHECKED =
            PlacementUtils.register("dff_almond_checked",
                    DFF_ALMOND, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.ALMOND_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_ALMOND_SPAWN =
            FeatureUtils.register("dff_almond_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_ALMOND_CHECKED, 0.33333334F)), DFF_ALMOND_CHECKED));


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_OLIVE = FeatureUtils.register("dff_olive",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.OLIVE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.OLIVE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_OLIVE_CHECKED =
            PlacementUtils.register("dff_olive_checked",
                    DFF_OLIVE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.OLIVE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_OLIVE_SPAWN =
            FeatureUtils.register("dff_olive_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_OLIVE_CHECKED, 0.33333334F)), DFF_OLIVE_CHECKED));





    //Orange
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_ORANGE = FeatureUtils.register("dff_orange",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.ORANGE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.ORANGE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_ORANGE_CHECKED =
            PlacementUtils.register("dff_orange_checked",
                    DFF_ORANGE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.ORANGE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_ORANGE_SPAWN =
            FeatureUtils.register("dff_orange_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_ORANGE_CHECKED, 0.33333334F)), DFF_ORANGE_CHECKED));

    //Coconut
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_COCONUT = FeatureUtils.register("dff_coconut",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.COCONUT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.COCONUT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_COCONUT_CHECKED =
            PlacementUtils.register("dff_coconut_checked",
                    DFF_COCONUT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.COCONUT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_COCONUT_SPAWN =
            FeatureUtils.register("dff_coconut_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_COCONUT_CHECKED, 0.33333334F)), DFF_COCONUT_CHECKED));

    //Mango
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_MANGO = FeatureUtils.register("dff_mango",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.MANGO_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.MANGO_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_MANGO_CHECKED =
            PlacementUtils.register("dff_mango_checked",
                    DFF_MANGO, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.MANGO_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_MANGO_SPAWN =
            FeatureUtils.register("dff_mango_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_MANGO_CHECKED, 0.33333334F)), DFF_MANGO_CHECKED));

    //Grapefruit
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_GRAPEFRUIT = FeatureUtils.register("dff_grapefruit",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.GRAPEFRUIT_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.GRAPEFRUIT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_GRAPEFRUIT_CHECKED =
            PlacementUtils.register("dff_grapefruit_checked",
                    DFF_GRAPEFRUIT, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.GRAPEFRUIT_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_GRAPEFRUIT_SPAWN =
            FeatureUtils.register("dff_grapefruit_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_GRAPEFRUIT_CHECKED, 0.33333334F)), DFF_GRAPEFRUIT_CHECKED));

    //Avocado
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_AVOCADO = FeatureUtils.register("dff_avocado",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.AVOCADO_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.AVOCADO_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_AVOCADO_CHECKED =
            PlacementUtils.register("dff_avocado_checked",
                    DFF_AVOCADO, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.AVOCADO_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_AVOCADO_SPAWN =
            FeatureUtils.register("dff_avocado_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_AVOCADO_CHECKED, 0.33333334F)), DFF_AVOCADO_CHECKED));

    //Cherry
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_CHERRY = FeatureUtils.register("dff_cherry",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.CHERRY_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.CHERRY_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_CHERRY_CHECKED =
            PlacementUtils.register("dff_cherry_checked",
                    DFF_CHERRY, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.CHERRY_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_CHERRY_SPAWN =
            FeatureUtils.register("dff_cherry_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_CHERRY_CHECKED, 0.33333334F)), DFF_CHERRY_CHECKED));

    //Pomegranate
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_POMEGRANATE = FeatureUtils.register("dff_pomegranate",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.POMEGRANATE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.POMEGRANATE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_POMEGRANATE_CHECKED =
            PlacementUtils.register("dff_pomegranate_checked",
                    DFF_POMEGRANATE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.POMEGRANATE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_POMEGRANATE_SPAWN =
            FeatureUtils.register("dff_pomegranate_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_POMEGRANATE_CHECKED, 0.33333334F)), DFF_POMEGRANATE_CHECKED));

    //Kiwi
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_KIWI = FeatureUtils.register("dff_kiwi",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.KIWI_LOG.get()),
            new StraightTrunkPlacer(1, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.KIWI_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_KIWI_CHECKED =
            PlacementUtils.register("dff_kiwi_checked",
                    DFF_KIWI, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.KIWI_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_KIWI_SPAWN =
            FeatureUtils.register("dff_kiwi_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_KIWI_CHECKED, 0.33333334F)), DFF_KIWI_CHECKED));

    //Lychee
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_LYCHEE = FeatureUtils.register("dff_lychee",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.LYCHEE_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.LYCHEE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_LYCHEE_CHECKED =
            PlacementUtils.register("dff_lychee_checked",
                    DFF_LYCHEE, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.LYCHEE_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_LYCHEE_SPAWN =
            FeatureUtils.register("lychee_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_LYCHEE_CHECKED, 0.33333334F)), DFF_LYCHEE_CHECKED));

    //Pear
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DFF_PEAR = FeatureUtils.register("dff_pear",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DFFBlocks.PEAR_LOG.get()),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(DFFBlocksNoDatagen.PEAR_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> DFF_PEAR_CHECKED =
            PlacementUtils.register("dff_pear_checked",
                    DFF_PEAR, PlacementUtils.filteredByBlockSurvival(DFFBlocksNoDatagen.PEAR_LEAVES.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DFF_PEAR_SPAWN =
            FeatureUtils.register("dff_pear_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(DFF_PEAR_CHECKED, 0.33333334F)), DFF_PEAR_CHECKED));


    

    
    
    //Wild Berry
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_BLUEBERRY =
            FeatureUtils.register("dff_blueberry", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.BUSH_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.BLUEBERRY_BUSH.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_BLACKBERRY =
            FeatureUtils.register("dff_blackberry", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.BUSH_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.BLACKBERRY_BUSH.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_RASPBERRY =
            FeatureUtils.register("dff_raspberry", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.BUSH_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.RASPBERRY_BUSH.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_WHITE_RASPBERRY =
            FeatureUtils.register("dff_white_raspberry", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.BUSH_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.WHITE_RASPBERRY_BUSH.get())))));


    //Crop
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_ROSEMARY =
            FeatureUtils.register("dff_rosemary", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.HERB_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_ROSEMARY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_OREGANO =
            FeatureUtils.register("dff_oregano", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.HERB_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_OREGANO.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_CILANTRO =
            FeatureUtils.register("dff_cilantro", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.HERB_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CILANTRO.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_MINT =
            FeatureUtils.register("dff_mint", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.HERB_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_MINT.get())))));



    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_BELL_PEPPER =
            FeatureUtils.register("dff_bell_pepper", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BELL_PEPPER_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_BLACK_BEAN_PLANT =
            FeatureUtils.register("dff_black_bean", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BLACK_BEAN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_BRUSSELS_SPROUTS =
            FeatureUtils.register("dff_brussels_sprouts", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BRUSSELS_SPROUTS_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_CORN_PLANT =
            FeatureUtils.register("dff_corn", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CORN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_CELERY_PLANT =
            FeatureUtils.register("dff_celery", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CELERY_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_CHILI_PEPPER_PLANT =
            FeatureUtils.register("dff_chili_pepper", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CHILI_PEPPER_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_BUTTERNUT_SQUASH =
            FeatureUtils.register("dff_butternut_squash", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BUTTERNUT_SQUASH_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_CUCUMBER =
            FeatureUtils.register("dff_cucumber", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CUCUMBER_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_CRANBERRY =
            FeatureUtils.register("dff_cranberry", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CRANBERRY_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_GARLIC =
            FeatureUtils.register("dff_garlic", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_GARLIC_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_GINGER =
            FeatureUtils.register("dff_ginger", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_GINGER_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_GREEN_BEAN =
            FeatureUtils.register("dff_green_bean", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_GREEN_BEAN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_PURPLE_GRAPE =
            FeatureUtils.register("dff_purple_grape", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_PURPLE_GRAPE_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_RED_GRAPE =
            FeatureUtils.register("dff_red_grape", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_RED_GRAPE_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_JALEPENO_PEPPER =
            FeatureUtils.register("dff_jalepeno_pepper", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_JALEPENO_PEPPER_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_KIDNEY_BEAN =
            FeatureUtils.register("dff_kidney_bean", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_KIDNEY_BEAN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_ONION =
            FeatureUtils.register("dff_onion", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_ONION_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_PEANUT =
            FeatureUtils.register("dff_peanut", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_PEANUT_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_RADISH =
            FeatureUtils.register("dff_radish", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_RADISH_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_RYE =
            FeatureUtils.register("dff_rye", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_RYE_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_SOYBEAN =
            FeatureUtils.register("dff_soybean", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_SOYBEAN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_SUGAR_BEET =
            FeatureUtils.register("dff_sugar_beet", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_SUGAR_BEET_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_STRAWBERRY =
            FeatureUtils.register("dff_strawberry", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_STRAWBERRY_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_TOMATO =
            FeatureUtils.register("dff_tomato", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_TOMATO_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_WHITE_GRAPE =
            FeatureUtils.register("dff_white_grape", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_WHITE_GRAPE_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DFF_ZUCCHINI =
            FeatureUtils.register("dff_zucchini", Feature.FLOWER,
                    new RandomPatchConfiguration(DFFeastsCommonConfig.CROP_TRIES.get(), 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_ZUCCHINI_PLANT.get())))));

}


