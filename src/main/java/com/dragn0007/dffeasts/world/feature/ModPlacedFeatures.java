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
    public static final Holder<PlacedFeature> DFF_ORANGE_PLACED =
            PlacementUtils.register("dff_orange_placed",
                    ModConfigFeatures.DFF_ORANGE_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_COCONUT_PLACED =
            PlacementUtils.register("dff_coconut_placed",
                    ModConfigFeatures.DFF_COCONUT_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_MANGO_PLACED =
            PlacementUtils.register("dff_mango_placed",
                    ModConfigFeatures.DFF_MANGO_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_GRAPEFRUIT_PLACED =
            PlacementUtils.register("dff_grapefruit_placed",
                    ModConfigFeatures.DFF_GRAPEFRUIT_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_AVOCADO_PLACED =
            PlacementUtils.register("dff_dff_avocado_placed",
                    ModConfigFeatures.DFF_AVOCADO_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_PEAR_PLACED =
            PlacementUtils.register("dff_pear_placed",
                    ModConfigFeatures.DFF_PEAR_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_KIWI_PLACED =
            PlacementUtils.register("dff_kiwi_placed",
                    ModConfigFeatures.DFF_KIWI_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_CHERRY_PLACED =
            PlacementUtils.register("dff_cherry_placed",
                    ModConfigFeatures.DFF_CHERRY_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_POMEGRANATE_PLACED =
            PlacementUtils.register("dff_pomegranate_placed",
                    ModConfigFeatures.DFF_POMEGRANATE_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));
    public static final Holder<PlacedFeature> DFF_LYCHEE_PLACED =
            PlacementUtils.register("dff_lychee_placed",
                    ModConfigFeatures.DFF_LYCHEE_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));



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
