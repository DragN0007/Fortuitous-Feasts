package com.dragn0007.dffeasts.world.feature;


import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModConfigFeatures {

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


