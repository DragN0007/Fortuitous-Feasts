package com.dragn0007.dffeasts.world.gen;

import com.dragn0007.dffeasts.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;

public class DFFFlowerGeneration {

    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(ForgeRegistries.Keys.BIOMES, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        //BUSHES
        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_BLUEBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_BLACKBERRY_PLACED);
            base.add(ModPlacedFeatures.DFF_RASPBERRY_PLACED);
            base.add(ModPlacedFeatures.DFF_WHITE_RASPBERRY_PLACED);
        }


        //HERBS
        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_ROSEMARY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_OREGANO_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.HOT)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_CILANTRO_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_MINT_PLACED);
        }




        if (types.contains(BiomeDictionary.Type.HOT)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_BELL_PEPPER_PLACED);
            base.add(ModPlacedFeatures.DFF_JALEPENO_PEPPER_PLACED);
            base.add(ModPlacedFeatures.DFF_GARLIC_PLACED);
            base.add(ModPlacedFeatures.DFF_GINGER_PLACED);
            base.add(ModPlacedFeatures.DFF_CHILI_PEPPER_PLANT_PLACED);
            base.add(ModPlacedFeatures.DFF_BUTTERNUT_SQUASH_PLACED);
            base.add(ModPlacedFeatures.DFF_CUCUMBER_PLACED);
            base.add(ModPlacedFeatures.DFF_CRANBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_BRUSSELS_SPROUTS_PLACED);
            base.add(ModPlacedFeatures.DFF_RYE_PLACED);
            base.add(ModPlacedFeatures.DFF_SOYBEAN_PLACED);
            base.add(ModPlacedFeatures.DFF_BLACK_BEAN_PLANT_PLACED);
            base.add(ModPlacedFeatures.DFF_ZUCCHINI_PLACED);
            base.add(ModPlacedFeatures.DFF_KIDNEY_BEAN_PLACED);
            base.add(ModPlacedFeatures.DFF_SUGAR_BEET_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_CORN_PLANT_PLACED);
            base.add(ModPlacedFeatures.DFF_CELERY_PLANT_PLACED);
            base.add(ModPlacedFeatures.DFF_GREEN_BEAN_PLACED);
            base.add(ModPlacedFeatures.DFF_PURPLE_GRAPE_PLACED);
            base.add(ModPlacedFeatures.DFF_RED_GRAPE_PLACED);
            base.add(ModPlacedFeatures.DFF_ONION_PLACED);
            base.add(ModPlacedFeatures.DFF_PEANUT_PLACED);
            base.add(ModPlacedFeatures.DFF_RADISH_PLACED);
            base.add(ModPlacedFeatures.DFF_STRAWBERRY_PLACED);
            base.add(ModPlacedFeatures.DFF_TOMATO_PLACED);
            base.add(ModPlacedFeatures.DFF_WHITE_GRAPE_PLACED);
        }


    }

}
