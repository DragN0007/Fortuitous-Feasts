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
        public static final TagKey<Item> CROPS = forgeTag("dffcrops");
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
        public static final TagKey<Item> SALAD_INGREDIENTS = forgeTag("salad_ingredients");

        public static final TagKey<Item> SUGAR = forgeTag("sugar");
        public static final TagKey<Item> BUTTER = forgeTag("butter");
        public static final TagKey<Item> PASTA = forgeTag("pasta");
        public static final TagKey<Item> DOUGH = forgeTag("dough");



        public static final TagKey<Item> SOYBEAN = forgeTag("soybean");
        public static final TagKey<Item> ONION = forgeTag("onion");
        public static final TagKey<Item> TOMATO = forgeTag("tomato");
        public static final TagKey<Item> GRAPE = forgeTag("grape");
        public static final TagKey<Item> STRAWBERRY = forgeTag("strawberry");
        public static final TagKey<Item> AVOCADO = forgeTag("avocado");
        public static final TagKey<Item> CORN = forgeTag("corn");
        public static final TagKey<Item> BEAN = forgeTag("bean");
        public static final TagKey<Item> GARLIC = forgeTag("garlic");
        public static final TagKey<Item> PEPPER = forgeTag("pepper");
        public static final TagKey<Item> BELLPEPPER = forgeTag("bellpepper");
        public static final TagKey<Item> BLACKBERRY = forgeTag("blackberry");
        public static final TagKey<Item> BLUEBERRY = forgeTag("blueberry");
        public static final TagKey<Item> CRANBERRY = forgeTag("cranberry");
        public static final TagKey<Item> GRAPEFRUIT = forgeTag("grapefruit");
        public static final TagKey<Item> GREENBEAN = forgeTag("greenbean");
        public static final TagKey<Item> ORANGE = forgeTag("orange");
        public static final TagKey<Item> RASPBERRY = forgeTag("raspberry");
        public static final TagKey<Item> WHITERASPBERRY = forgeTag("whiteraspberry");
        public static final TagKey<Item> JALEPENOPEPPER = forgeTag("jalepenopepper");
        public static final TagKey<Item> CHILIPEPPER = forgeTag("chilipepper");
        public static final TagKey<Item> MANGO = forgeTag("mango");
        public static final TagKey<Item> RADISH = forgeTag("radish");
        public static final TagKey<Item> COCONUT = forgeTag("coconut");
        public static final TagKey<Item> BRUSSELSSPROUT = forgeTag("brusselssprout");
        public static final TagKey<Item> BUTTERNUTSQUASH = forgeTag("butternutsquash");
        public static final TagKey<Item> CELERY = forgeTag("celery");
        public static final TagKey<Item> CHERRY = forgeTag("cherry");
        public static final TagKey<Item> CUCUMBER = forgeTag("cucumber");
        public static final TagKey<Item> GINGER = forgeTag("ginger");
        public static final TagKey<Item> KIWI = forgeTag("kiwi");
        public static final TagKey<Item> LYCHEE = forgeTag("lychee");
        public static final TagKey<Item> PEANUT = forgeTag("peanut");
        public static final TagKey<Item> PEAR = forgeTag("pear");
        public static final TagKey<Item> POMEGRANATE = forgeTag("pomegranate");
        public static final TagKey<Item> RYE = forgeTag("rye");
        public static final TagKey<Item> ZUCCHINI = forgeTag("zucchini");
        public static final TagKey<Item> SUGARBEET = forgeTag("sugarbeet");
        public static final TagKey<Item> BANANA = forgeTag("banana");
        public static final TagKey<Item> DRAGONFRUIT = forgeTag("dragonfruit");
        public static final TagKey<Item> PASSIONFRUIT = forgeTag("passionfruit");
        public static final TagKey<Item> WALNUT = forgeTag("walnut");
        public static final TagKey<Item> CASHEW = forgeTag("cashew");
        public static final TagKey<Item> ALMOND = forgeTag("almond");
        public static final TagKey<Item> OLIVE = forgeTag("olive");




        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(DFFeastsMain.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
