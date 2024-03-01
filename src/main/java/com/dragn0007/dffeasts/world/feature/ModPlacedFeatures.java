package com.dragn0007.dffeasts.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ModPlacedFeatures {

    //TREE
    public static final Holder<PlacedFeature> ORANGE_PLACED =
            PlacementUtils.register("orange_placed",
                    ModConfigFeatures.ORANGE_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.05F, 1)));


    //BUSHES
    public static final Holder<PlacedFeature> BLUEBERRY_PLACED =
            PlacementUtils.register("blueberry_placed",
                    ModConfigFeatures.BLUEBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> BLACKBERRY_PLACED =
            PlacementUtils.register("blackberry_placed",
                    ModConfigFeatures.BLACKBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> RASPBERRY_PLACED =
            PlacementUtils.register("raspberry_placed",
                    ModConfigFeatures.RASPBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> WHITE_RASPBERRY_PLACED =
            PlacementUtils.register("white_raspberry_placed",
                    ModConfigFeatures.WHITE_RASPBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


}
