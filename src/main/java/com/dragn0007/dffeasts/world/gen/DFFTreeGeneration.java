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

public class DFFTreeGeneration {

    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(ForgeRegistries.Keys.BIOMES, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);


        if (types.contains(BiomeDictionary.Type.HOT)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_ORANGE_PLACED);
            base.add(ModPlacedFeatures.DFF_GRAPEFRUIT_PLACED);
            base.add(ModPlacedFeatures.DFF_PASSIONFRUIT_PLACED);
            base.add(ModPlacedFeatures.DFF_BANANA_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.JUNGLE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_AVOCADO_PLACED);
            base.add(ModPlacedFeatures.DFF_LYCHEE_PLACED);
            base.add(ModPlacedFeatures.DFF_POMEGRANATE_PLACED);
            base.add(ModPlacedFeatures.DFF_MANGO_PLACED);
            base.add(ModPlacedFeatures.DFF_COCONUT_PLACED);
            base.add(ModPlacedFeatures.DFF_DRAGONFRUIT_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DFF_KIWI_PLACED);
            base.add(ModPlacedFeatures.DFF_CHERRY_PLACED);
            base.add(ModPlacedFeatures.DFF_PEAR_PLACED);
            base.add(ModPlacedFeatures.DFF_WALNUT_PLACED);
            base.add(ModPlacedFeatures.DFF_CASHEW_PLACED);
            base.add(ModPlacedFeatures.DFF_ALMOND_PLACED);
            base.add(ModPlacedFeatures.DFF_OLIVE_PLACED);
        }


        }
    }

