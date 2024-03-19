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




    public static final Holder<PlacedFeature> DFF_BELL_PEPPER_PLACED =
           PlacementUtils.register("dff_bell_pepper_placed",
                    ModConfigFeatures.DFF_BELL_PEPPER,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_BLACK_BEAN_PLANT_PLACED =
           PlacementUtils.register("dff_black_bean_placed",
                   ModConfigFeatures.DFF_BLACK_BEAN_PLANT,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_BRUSSELS_SPROUTS_PLACED =
           PlacementUtils.register("dff_brussels_sprouts_placed",
                   ModConfigFeatures.DFF_BRUSSELS_SPROUTS,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_CORN_PLANT_PLACED =
           PlacementUtils.register("dff_corn_placed",
                   ModConfigFeatures.DFF_CORN_PLANT,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_CELERY_PLANT_PLACED =
           PlacementUtils.register("dff_celery_placed",
                   ModConfigFeatures.DFF_CELERY_PLANT,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_CHILI_PEPPER_PLANT_PLACED =
           PlacementUtils.register("dff_chili_pepper_placed",
                   ModConfigFeatures.DFF_CHILI_PEPPER_PLANT,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_BUTTERNUT_SQUASH_PLACED =
           PlacementUtils.register("dff_butternut_squash_placed",
                   ModConfigFeatures.DFF_BUTTERNUT_SQUASH,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_CUCUMBER_PLACED =
           PlacementUtils.register("dff_cucumber_placed",
                   ModConfigFeatures.DFF_CUCUMBER,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_CRANBERRY_PLACED =
           PlacementUtils.register("dff_cranberry_placed",
                   ModConfigFeatures.DFF_CRANBERRY,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_GARLIC_PLACED =
           PlacementUtils.register("dff_garlic_placed",
                   ModConfigFeatures.DFF_GARLIC,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_GINGER_PLACED =
           PlacementUtils.register("dff_ginger_placed",
                   ModConfigFeatures.DFF_GINGER,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_GREEN_BEAN_PLACED =
           PlacementUtils.register("dff_green_bean_placed",
                   ModConfigFeatures.DFF_GREEN_BEAN,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_PURPLE_GRAPE_PLACED =
           PlacementUtils.register("dff_purple_grape_placed",
                   ModConfigFeatures.DFF_PURPLE_GRAPE,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_RED_GRAPE_PLACED =
           PlacementUtils.register("dff_red_grape_placed",
                   ModConfigFeatures.DFF_RED_GRAPE,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_JALEPENO_PEPPER_PLACED =
           PlacementUtils.register("dff_jalepeno_pepper_placed",
                   ModConfigFeatures.DFF_JALEPENO_PEPPER,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_KIDNEY_BEAN_PLACED =
           PlacementUtils.register("dff_kidney_bean_placed",
                   ModConfigFeatures.DFF_KIDNEY_BEAN,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_ONION_PLACED =
           PlacementUtils.register("dff_onion_placed",
                   ModConfigFeatures.DFF_ONION,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_PEANUT_PLACED =
           PlacementUtils.register("dff_peanut_placed",
                   ModConfigFeatures.DFF_PEANUT,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_RADISH_PLACED =
           PlacementUtils.register("dff_radish_placed",
                   ModConfigFeatures.DFF_RADISH,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_RYE_PLACED =
           PlacementUtils.register("dff_rye_placed",
                   ModConfigFeatures.DFF_RYE,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_SOYBEAN_PLACED =
           PlacementUtils.register("dff_soybean_placed",
                   ModConfigFeatures.DFF_SOYBEAN,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_SUGAR_BEET_PLACED =
           PlacementUtils.register("dff_sugar_beet_placed",
                   ModConfigFeatures.DFF_SUGAR_BEET,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_STRAWBERRY_PLACED =
           PlacementUtils.register("dff_strawberry_placed",
                   ModConfigFeatures.DFF_STRAWBERRY,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_TOMATO_PLACED =
           PlacementUtils.register("dff_tomato_placed",
                   ModConfigFeatures.DFF_TOMATO,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_WHITE_GRAPE_PLACED =
           PlacementUtils.register("dff_white_grape_placed",
                   ModConfigFeatures.DFF_WHITE_GRAPE,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DFF_ZUCCHINI_PLACED =
           PlacementUtils.register("dff_zucchini_placed",
                   ModConfigFeatures.DFF_ZUCCHINI,
                   RarityFilter.onAverageOnceEvery(28),
                   InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


}
