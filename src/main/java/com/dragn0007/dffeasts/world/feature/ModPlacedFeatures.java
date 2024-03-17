package com.dragn0007.dffeasts.world.feature;

import com.dragn0007.dffeasts.util.config.DFFeastsCommonConfig;
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
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_COCONUT_PLACED =
            PlacementUtils.register("dff_coconut_placed",
                    ModConfigFeatures.DFF_COCONUT_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_MANGO_PLACED =
            PlacementUtils.register("dff_mango_placed",
                    ModConfigFeatures.DFF_MANGO_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_GRAPEFRUIT_PLACED =
            PlacementUtils.register("dff_grapefruit_placed",
                    ModConfigFeatures.DFF_GRAPEFRUIT_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_AVOCADO_PLACED =
            PlacementUtils.register("dff_dff_avocado_placed",
                    ModConfigFeatures.DFF_AVOCADO_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_PEAR_PLACED =
            PlacementUtils.register("dff_pear_placed",
                    ModConfigFeatures.DFF_PEAR_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_KIWI_PLACED =
            PlacementUtils.register("dff_kiwi_placed",
                    ModConfigFeatures.DFF_KIWI_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_CHERRY_PLACED =
            PlacementUtils.register("dff_cherry_placed",
                    ModConfigFeatures.DFF_CHERRY_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_POMEGRANATE_PLACED =
            PlacementUtils.register("dff_pomegranate_placed",
                    ModConfigFeatures.DFF_POMEGRANATE_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));
    public static final Holder<PlacedFeature> DFF_LYCHEE_PLACED =
            PlacementUtils.register("dff_lychee_placed",
                    ModConfigFeatures.DFF_LYCHEE_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, DFFeastsCommonConfig.FRUIT_TREE_TRIES.get(), 1)));



    //BUSHES
    public static final Holder<PlacedFeature> DFF_BLUEBERRY_PLACED =
            PlacementUtils.register("dff_blueberry_placed",
                    ModConfigFeatures.DFF_BLUEBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_BLACKBERRY_PLACED =
            PlacementUtils.register("dff_blackberry_placed",
                    ModConfigFeatures.DFF_BLACKBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_RASPBERRY_PLACED =
            PlacementUtils.register("dff_raspberry_placed",
                    ModConfigFeatures.DFF_RASPBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_WHITE_RASPBERRY_PLACED =
            PlacementUtils.register("dff_white_raspberry_placed",
                    ModConfigFeatures.DFF_WHITE_RASPBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


    //CROPS
    public static final Holder<PlacedFeature> DFF_ROSEMARY_PLACED =
            PlacementUtils.register("dff_rosemary_placed",
                    ModConfigFeatures.DFF_ROSEMARY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> DFF_OREGANO_PLACED =
            PlacementUtils.register("dff_oregano_placed",
                    ModConfigFeatures.DFF_OREGANO,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> DFF_CILANTRO_PLACED =
            PlacementUtils.register("dff_cilantro_placed",
                    ModConfigFeatures.DFF_CILANTRO,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> DFF_MINT_PLACED =
            PlacementUtils.register("dff_mint_placed",
                    ModConfigFeatures.DFF_MINT,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


}
