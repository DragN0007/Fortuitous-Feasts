package com.dragn0007.dffeasts.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class DFFeastsCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Float> FRUIT_TREE_TRIES;
    public static final ForgeConfigSpec.ConfigValue<Integer> BUSH_TRIES;
    public static final ForgeConfigSpec.ConfigValue<Integer> HERB_TRIES;
    public static final ForgeConfigSpec.ConfigValue<Integer> CROP_TRIES;

//    public static final ForgeConfigSpec.ConfigValue<Integer> FEASTS_FARMER_BARREL;

    public static final ForgeConfigSpec.ConfigValue<Integer> BERRY_PRICE;
    public static final ForgeConfigSpec.ConfigValue<Integer> CROP_BAG_PRICE;
    public static final ForgeConfigSpec.ConfigValue<Integer> CROP_PRICE;
    public static final ForgeConfigSpec.ConfigValue<Integer> IRON_INGOT_PRICE;
    public static final ForgeConfigSpec.ConfigValue<Integer> GOLD_INGOT_PRICE;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_PRICE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_PRICE;

    static {
        BUILDER.push("Configs for DragN's Fortuitous Feasts!");


        FRUIT_TREE_TRIES = BUILDER.comment("How many times should fruit trees try to spawn in one area? Default is 0.01.")
                .define("Fruit Tree Tries", 0.01F);

        BUSH_TRIES = BUILDER.comment("How many times should berry bushes try to spawn in one area? Default is 10.")
                .define("Berry Bush Tries", 10);

        HERB_TRIES = BUILDER.comment("How many times should herbs try to spawn in one area? Default is 6.")
                .define("Herb Tries", 6);

        CROP_TRIES = BUILDER.comment("How often should Wild Crops spawn? Default is 1. Change to 4-8 for best natural spawning. May cause crashing if turned to 0.")
                .define("Wild Crop Tries", 1);



//        FEASTS_FARMER_BARREL = BUILDER.comment("Should players be able to create a Feasts Farmer using a Crop Barrel? * 1 = True, 0 = False")
//                .define("Feasts Farmer Job from Crop Barrel", 1);



        BERRY_PRICE = BUILDER.comment("How much should 4 Wild Berries cost? Default is 2 Crop Coins. *Turn this to 0 to make this trade unusable.")
                .define("Feasts Farmer Wild Berries Cost", 2);

        CROP_BAG_PRICE = BUILDER.comment("How much should 1 Crop Bag cost? Default is 6 Crop Coins. *Turn this to 0 to make this trade unusable.")
                .define("Feasts Farmer Crop Bag Cost", 6);

        CROP_PRICE = BUILDER.comment("How much should 1 Crop cost? Default is 2 Crop Coins. *Turn this to 0 to make this trade unusable.")
                .define("Feasts Farmer Crop Cost", 2);

        IRON_INGOT_PRICE = BUILDER.comment("How much should 1 Iron Ingot cost? Default is 32 Crop Coins. *Turn this to 0 to make this trade unusable.")
                .define("Feasts Farmer Iron Ingot Cost", 32);

        GOLD_INGOT_PRICE = BUILDER.comment("How much should 1 Gold Ingot cost? Default is 48 Crop Coins. *Turn this to 0 to make this trade unusable.")
                .define("Feasts Farmer Gold Ingot Cost", 48);

        EMERALD_PRICE = BUILDER.comment("How much should 1 Emerald cost? Default is 64 Crop Coins. *Turn this to 0 to make this trade unusable.")
                .define("Feasts Farmer Emerald Cost", 64);

        DIAMOND_PRICE = BUILDER.comment("How much should 1 Diamond cost? Default is 96 Crop Coins. *Turn this to 0 to make this trade unusable.")
                .define("Feasts Farmer Diamond Cost", 96);



        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
