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
        }

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_RASPBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_WHITE_RASPBERRY_PLACED);
        }


        //CROPS
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


    }
}
