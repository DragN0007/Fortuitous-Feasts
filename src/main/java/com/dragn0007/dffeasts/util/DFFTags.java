package com.dragn0007.dffeasts.util;

import com.dragn0007.dffeasts.DFFeastsMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class DFFTags {

    public static class Items {

        public static final TagKey<Item> MILK = forgeTag("milk");
        public static final TagKey<Item> WATER = forgeTag("water");
        public static final TagKey<Item> LEAVES = forgeTag("leaves");
        public static final TagKey<Item> CROPS = forgeTag("crops");
        public static final TagKey<Item> PAPERABLE_LOGS = forgeTag("paperable_logs");
        public static final TagKey<Item> SMOOTHIE_ICE = forgeTag("smoothie_ice");

        public static final TagKey<Item> WHEAT = forgeTag("wheat");
        public static final TagKey<Item> FLOUR = forgeTag("flour");
        public static final TagKey<Item> BERRIES = forgeTag("berries");
        public static final TagKey<Item> FRUITS = forgeTag("fruits");
        public static final TagKey<Item> HERBS = forgeTag("herbs");
        public static final TagKey<Item> VEGETABLES = forgeTag("vegetables");
        public static final TagKey<Item> COOKED_VEGETABLES = forgeTag("cooked_vegetables");
        public static final TagKey<Item> RAW_MEATS = forgeTag("raw_meats");
        public static final TagKey<Item> COOKED_MEATS = forgeTag("cooked_meats");
        public static final TagKey<Item> JAMS = forgeTag("jams");
        public static final TagKey<Item> NUTS = forgeTag("nuts");
        public static final TagKey<Item> TREE_FRUITS = forgeTag("tree_fruits");
        public static final TagKey<Item> DUMPLING_FILLING = forgeTag("dumpling_filling");
        public static final TagKey<Item> PEPPERS = forgeTag("peppers");
        public static final TagKey<Item> COOKED_SAUSAGE = forgeTag("cooked_sausage");
        public static final TagKey<Item> CHEESE = forgeTag("cheese");
        public static final TagKey<Item> COCOA = forgeTag("cocoa");
        public static final TagKey<Item> EGG = forgeTag("egg");

        public static final TagKey<Item> RAW_CHICKEN = forgeTag("raw_chicken");
        public static final TagKey<Item> RAW_PORK = forgeTag("raw_pork");
        public static final TagKey<Item> RAW_MUTTON = forgeTag("raw_mutton");
        public static final TagKey<Item> RAW_BEEF = forgeTag("raw_beef");
        public static final TagKey<Item> COOKED_CHICKEN = forgeTag("cooked_chicken");
        public static final TagKey<Item> COOKED_PORK = forgeTag("cooked_pork");
        public static final TagKey<Item> COOKED_MUTTON = forgeTag("cooked_mutton");
        public static final TagKey<Item> COOKED_BEEF = forgeTag("cooked_beef");

        public static final TagKey<Item> SUGAR = forgeTag("sugar");
        public static final TagKey<Item> BUTTER = forgeTag("butter");
        public static final TagKey<Item> PASTA = forgeTag("pasta");
        public static final TagKey<Item> DOUGH = forgeTag("dough");
        public static final TagKey<Item> SOYBEANS = forgeTag("soybeans");
        public static final TagKey<Item> ONION = forgeTag("onion");
        public static final TagKey<Item> TOMATO = forgeTag("tomato");
        public static final TagKey<Item> GRAPES = forgeTag("grapes");
        public static final TagKey<Item> STRAWBERRY = forgeTag("strawberry");
        public static final TagKey<Item> AVOCADO = forgeTag("avocado");
        public static final TagKey<Item> CORN = forgeTag("corn");
        public static final TagKey<Item> BEANS = forgeTag("beans");
        public static final TagKey<Item> GARLIC = forgeTag("garlic");
        public static final TagKey<Item> SALAD_INGREDIENTS = forgeTag("salad_ingredients");




        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(DFFeastsMain.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
