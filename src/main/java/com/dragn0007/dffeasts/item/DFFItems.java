package com.dragn0007.dffeasts.item;


import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.item.custom.JuiceItem;
import com.dragn0007.dffeasts.item.custom.TeaItem;
import com.dragn0007.dffeasts.item.custom.AlcoholItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class DFFItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DFFeastsMain.MODID);

    //TODO; Food

    //Meals
    public static final RegistryObject<Item> BLOOMING_ONION = ITEMS.register("blooming_onion",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GARLIC_PARM_WINGS = ITEMS.register("garlic_parm_wings",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> SOUP = ITEMS.register("soup",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> VEGGIE_PLATTER = ITEMS.register("veggie_platter",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> VEGGIE_PASTA = ITEMS.register("veggie_pasta",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DUMPLINGS = ITEMS.register("dumplings",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHICKEN_PARM = ITEMS.register("chicken_parm",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MAC_N_CHEESE = ITEMS.register("mac_n_cheese",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> SAUSAGE_MAC = ITEMS.register("sausage_mac",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> SPAGHETTI = ITEMS.register("spaghetti",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> SPAGHETTI_AND_MEATBALLS = ITEMS.register("spaghetti_and_meatballs",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POT_ROAST = ITEMS.register("pot_roast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEANUT_BUTTER_JELLY = ITEMS.register("peanut_butter_jelly",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEANUT_BUTTER = ITEMS.register("peanut_butter",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> TOMATO_SOUP = ITEMS.register("tomato_soup",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> AVOCADO_TOAST = ITEMS.register("avocado_toast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MERMAID_TOAST = ITEMS.register("mermaid_toast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> LASAGNA = ITEMS.register("lasagna",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(18).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Pickled
    public static final RegistryObject<Item> PICKLES = ITEMS.register("pickles",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PICKLED_GARLIC = ITEMS.register("pickled_garlic",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PICKLED_GINGER = ITEMS.register("pickled_ginger",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PICKLED_PEPPERS = ITEMS.register("pickled_peppers",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PICKLED_RADISH = ITEMS.register("pickled_radish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PICKLED_OLIVES = ITEMS.register("pickled_olives",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Wrap
    public static final RegistryObject<Item> MEAT_CHEESE_WRAP = ITEMS.register("meat_cheese_wrap",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MEAT_WRAP = ITEMS.register("meat_wrap",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MEAT_VEGGIE_WRAP = ITEMS.register("meat_veggie_wrap",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> VEGGIE_WRAP = ITEMS.register("veggie_wrap",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Pie
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> LYCHEE_PIE = ITEMS.register("lychee_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MANGO_PIE = ITEMS.register("mango_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ORANGE_PIE = ITEMS.register("orange_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEAR_PIE = ITEMS.register("pear_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POMEGRANATE_PIE = ITEMS.register("pomegranate_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RASPBERRY_PIE = ITEMS.register("raspberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RED_GRAPE_PIE = ITEMS.register("red_grape_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PURPLE_GRAPE_PIE = ITEMS.register("purple_grape_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_PIE = ITEMS.register("strawberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> WHITE_RASPBERRY_PIE = ITEMS.register("white_raspberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLACKBERRY_PIE = ITEMS.register("blackberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLUEBERRY_PIE = ITEMS.register("blueberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHERRY_PIE = ITEMS.register("cherry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CRANBERRY_PIE = ITEMS.register("cranberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GRAPEFRUIT_PIE = ITEMS.register("grapefruit_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GREEN_GRAPE_PIE = ITEMS.register("green_grape_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> KIWI_PIE = ITEMS.register("kiwi_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRAGONFRUIT_PIE = ITEMS.register("dragonfruit_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PASSIONFRUIT_PIE = ITEMS.register("passionfruit_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Donut
    public static final RegistryObject<Item> PLAIN_DONUT = ITEMS.register("plain_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHOCOLATE_DONUT = ITEMS.register("chocolate_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POWDERED_DONUT = ITEMS.register("powdered_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHOCOLATE_POWDERED_DONUT = ITEMS.register("chocolate_powdered_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GLAZED_DONUT = ITEMS.register("glazed_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ICED_CHOCOLATE_DONUT = ITEMS.register("iced_chocolate_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHOCOLATE_GLAZED_DONUT = ITEMS.register("chocolate_glazed_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DOUBLE_CHOCOLATE_DONUT = ITEMS.register("double_chocolate_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_GLAZED_DONUT = ITEMS.register("strawberry_glazed_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_CHOCOLATE_DONUT = ITEMS.register("strawberry_chocolate_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> JELLY_DONUT = ITEMS.register("jelly_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEANUT_BUTTER_DONUT = ITEMS.register("peanut_butter_donut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).effect(new MobEffectInstance(MobEffects.HEAL, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Smoothie
    public static final RegistryObject<Item> LYCHEE_SMOOTHIE = ITEMS.register("lychee_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MANGO_SMOOTHIE = ITEMS.register("mango_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ORANGE_SMOOTHIE = ITEMS.register("orange_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEAR_SMOOTHIE = ITEMS.register("pear_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POMEGRANATE_SMOOTHIE = ITEMS.register("pomegranate_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RASPBERRY_SMOOTHIE = ITEMS.register("raspberry_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RED_GRAPE_SMOOTHIE = ITEMS.register("red_grape_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PURPLE_GRAPE_SMOOTHIE = ITEMS.register("purple_grape_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_SMOOTHIE = ITEMS.register("strawberry_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> WHITE_RASPBERRY_SMOOTHIE = ITEMS.register("white_raspberry_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLACKBERRY_SMOOTHIE = ITEMS.register("blackberry_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLUEBERRY_SMOOTHIE = ITEMS.register("blueberry_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHERRY_SMOOTHIE = ITEMS.register("cherry_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CRANBERRY_SMOOTHIE = ITEMS.register("cranberry_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GRAPEFRUIT_SMOOTHIE = ITEMS.register("grapefruit_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GREEN_GRAPE_SMOOTHIE = ITEMS.register("green_grape_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> KIWI_SMOOTHIE = ITEMS.register("kiwi_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRAGONFRUIT_SMOOTHIE = ITEMS.register("dragonfruit_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PASSIONFRUIT_SMOOTHIE = ITEMS.register("passionfruit_smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Cake
    public static final RegistryObject<Item> CHOCOLATE_CAKE = ITEMS.register("chocolate_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.CHOCOLATE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> YELLOW_CHOCOLATE_CAKE = ITEMS.register("yellow_chocolate_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.YELLOW_CHOCOLATE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> CHERRY_CHOCOLATE_CAKE = ITEMS.register("cherry_chocolate_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.CHERRY_CHOCOLATE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> RED_VELVET_CAKE = ITEMS.register("red_velvet_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.RED_VELVET_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> WHITE_CAKE = ITEMS.register("white_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.WHITE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> LYCHEE_CAKE = ITEMS.register("lychee_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.LYCHEE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> MANGO_CAKE = ITEMS.register("mango_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.MANGO_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> ORANGE_CAKE = ITEMS.register("orange_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.ORANGE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> PEAR_CAKE = ITEMS.register("pear_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.PEAR_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> POMEGRANATE_CAKE = ITEMS.register("pomegranate_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.POMEGRANATE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> RASPBERRY_CAKE = ITEMS.register("raspberry_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.RASPBERRY_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> RED_GRAPE_CAKE = ITEMS.register("red_grape_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.RED_GRAPE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> PURPLE_GRAPE_CAKE = ITEMS.register("purple_grape_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.PURPLE_GRAPE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> STRAWBERRY_CAKE = ITEMS.register("strawberry_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.STRAWBERRY_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> WHITE_RASPBERRY_CAKE = ITEMS.register("white_raspberry_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.WHITE_RASPBERRY_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> BLACKBERRY_CAKE = ITEMS.register("blackberry_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.BLACKBERRY_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> BLUEBERRY_CAKE = ITEMS.register("blueberry_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.BLUEBERRY_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> CHERRY_CAKE = ITEMS.register("cherry_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.CHERRY_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> CRANBERRY_CAKE = ITEMS.register("cranberry_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.CRANBERRY_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> GRAPEFRUIT_CAKE = ITEMS.register("grapefruit_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.GRAPEFRUIT_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> GREEN_GRAPE_CAKE = ITEMS.register("green_grape_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.GREEN_GRAPE_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));
    public static final RegistryObject<Item> KIWI_CAKE = ITEMS.register("kiwi_cake",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.KIWI_CAKE.get(), (new Item.Properties().tab(DFFItemGroup.FOOD_GROUP))));



    //Jam
    public static final RegistryObject<Item> APPLE_JAM = ITEMS.register("apple_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> LYCHEE_JAM = ITEMS.register("lychee_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MANGO_JAM = ITEMS.register("mango_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ORANGE_JAM = ITEMS.register("orange_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEAR_JAM = ITEMS.register("pear_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POMEGRANATE_JAM = ITEMS.register("pomegranate_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RASPBERRY_JAM = ITEMS.register("raspberry_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RED_GRAPE_JAM = ITEMS.register("red_grape_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PURPLE_GRAPE_JAM = ITEMS.register("purple_grape_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> WHITE_RASPBERRY_JAM = ITEMS.register("white_raspberry_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHERRY_JAM = ITEMS.register("cherry_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CRANBERRY_JAM = ITEMS.register("cranberry_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GRAPEFRUIT_JAM = ITEMS.register("grapefruit_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GREEN_GRAPE_JAM = ITEMS.register("green_grape_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> KIWI_JAM = ITEMS.register("kiwi_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRAGONFRUIT_JAM = ITEMS.register("dragonfruit_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PASSIONFRUIT_JAM = ITEMS.register("passionfruit_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Soda
    public static final RegistryObject<Item> LYCHEE_SODA = ITEMS.register("lychee_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MANGO_SODA = ITEMS.register("mango_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ORANGE_SODA = ITEMS.register("orange_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEAR_SODA = ITEMS.register("pear_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POMEGRANATE_SODA = ITEMS.register("pomegranate_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RASPBERRY_SODA = ITEMS.register("raspberry_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RED_GRAPE_SODA = ITEMS.register("red_grape_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PURPLE_GRAPE_SODA = ITEMS.register("purple_grape_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_SODA = ITEMS.register("strawberry_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> WHITE_RASPBERRY_SODA = ITEMS.register("white_raspberry_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLACKBERRY_SODA = ITEMS.register("blackberry_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLUEBERRY_SODA = ITEMS.register("blueberry_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHERRY_SODA = ITEMS.register("cherry_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CRANBERRY_SODA = ITEMS.register("cranberry_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GRAPEFRUIT_SODA = ITEMS.register("grapefruit_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GREEN_GRAPE_SODA = ITEMS.register("green_grape_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> KIWI_SODA = ITEMS.register("kiwi_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GINGER_SODA = ITEMS.register("ginger_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRAGONFRUIT_SODA = ITEMS.register("dragonfruit_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PASSIONFRUIT_SODA = ITEMS.register("passionfruit_soda",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Pastry
    public static final RegistryObject<Item> APPLE_PASTRY = ITEMS.register("apple_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> LYCHEE_PASTRY = ITEMS.register("lychee_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MANGO_PASTRY = ITEMS.register("mango_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ORANGE_PASTRY = ITEMS.register("orange_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEAR_PASTRY = ITEMS.register("pear_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POMEGRANATE_PASTRY = ITEMS.register("pomegranate_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RASPBERRY_PASTRY = ITEMS.register("raspberry_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RED_GRAPE_PASTRY = ITEMS.register("red_grape_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PURPLE_GRAPE_PASTRY = ITEMS.register("purple_grape_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_PASTRY = ITEMS.register("strawberry_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> WHITE_RASPBERRY_PASTRY = ITEMS.register("white_raspberry_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLACKBERRY_PASTRY = ITEMS.register("blackberry_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLUEBERRY_PASTRY = ITEMS.register("blueberry_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHERRY_PASTRY = ITEMS.register("cherry_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CRANBERRY_PASTRY = ITEMS.register("cranberry_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GRAPEFRUIT_PASTRY = ITEMS.register("grapefruit_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GREEN_GRAPE_PASTRY = ITEMS.register("green_grape_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> KIWI_PASTRY = ITEMS.register("kiwi_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRAGONFRUIT_PASTRY = ITEMS.register("dragonfruit_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PASSIONFRUIT_PASTRY = ITEMS.register("passionfruit_pastry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Juice
    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> LYCHEE_JUICE = ITEMS.register("lychee_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> MANGO_JUICE = ITEMS.register("mango_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> ORANGE_JUICE = ITEMS.register("orange_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> PEAR_JUICE = ITEMS.register("pear_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> POMEGRANATE_JUICE = ITEMS.register("pomegranate_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> RASPBERRY_JUICE = ITEMS.register("raspberry_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> RED_GRAPE_JUICE = ITEMS.register("red_grape_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> PURPLE_GRAPE_JUICE = ITEMS.register("purple_grape_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> WHITE_RASPBERRY_JUICE = ITEMS.register("white_raspberry_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> BLACKBERRY_JUICE = ITEMS.register("blackberry_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> CHERRY_JUICE = ITEMS.register("cherry_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> CRANBERRY_JUICE = ITEMS.register("cranberry_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> GRAPEFRUIT_JUICE = ITEMS.register("grapefruit_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> GREEN_GRAPE_JUICE = ITEMS.register("green_grape_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> KIWI_JUICE = ITEMS.register("kiwi_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> DRAGONFRUIT_JUICE = ITEMS.register("dragonfruit_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> PASSIONFRUIT_JUICE = ITEMS.register("passionfruit_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false)
            ));

    //Turnover
    public static final RegistryObject<Item> APPLE_TURNOVER = ITEMS.register("apple_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> LYCHEE_TURNOVER = ITEMS.register("lychee_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MANGO_TURNOVER = ITEMS.register("mango_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ORANGE_TURNOVER = ITEMS.register("orange_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PEAR_TURNOVER = ITEMS.register("pear_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> POMEGRANATE_TURNOVER = ITEMS.register("pomegranate_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RASPBERRY_TURNOVER = ITEMS.register("raspberry_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RED_GRAPE_TURNOVER = ITEMS.register("red_grape_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PURPLE_GRAPE_TURNOVER = ITEMS.register("purple_grape_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY_TURNOVER = ITEMS.register("strawberry_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> WHITE_RASPBERRY_TURNOVER = ITEMS.register("white_raspberry_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLACKBERRY_TURNOVER = ITEMS.register("blackberry_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BLUEBERRY_TURNOVER = ITEMS.register("blueberry_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHERRY_TURNOVER = ITEMS.register("cherry_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CRANBERRY_TURNOVER = ITEMS.register("cranberry_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GRAPEFRUIT_TURNOVER = ITEMS.register("grapefruit_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GREEN_GRAPE_TURNOVER = ITEMS.register("green_grape_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> KIWI_TURNOVER = ITEMS.register("kiwi_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRAGONFRUIT_TURNOVER = ITEMS.register("dragonfruit_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PASSIONFRUIT_TURNOVER = ITEMS.register("passionfruit_turnover",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1).effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Tea
    public static final RegistryObject<Item> LYCHEE_TEA = ITEMS.register("lychee_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> MANGO_TEA = ITEMS.register("mango_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> ORANGE_TEA = ITEMS.register("orange_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> PEAR_TEA = ITEMS.register("pear_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> POMEGRANATE_TEA = ITEMS.register("pomegranate_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> RASPBERRY_TEA = ITEMS.register("raspberry_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> RED_GRAPE_TEA = ITEMS.register("red_grape_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> PURPLE_GRAPE_TEA = ITEMS.register("purple_grape_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> STRAWBERRY_TEA = ITEMS.register("strawberry_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> WHITE_RASPBERRY_TEA = ITEMS.register("white_raspberry_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> BLACKBERRY_TEA = ITEMS.register("blackberry_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> BLUEBERRY_TEA = ITEMS.register("blueberry_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> CHERRY_TEA = ITEMS.register("cherry_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> CRANBERRY_TEA = ITEMS.register("cranberry_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> GRAPEFRUIT_TEA = ITEMS.register("grapefruit_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> GREEN_GRAPE_TEA = ITEMS.register("green_grape_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> KIWI_TEA = ITEMS.register("kiwi_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> DRAGONFRUIT_TEA = ITEMS.register("dragonfruit_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));
    public static final RegistryObject<Item> PASSIONFRUIT_TEA = ITEMS.register("passionfruit_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 0, true, false)
            ));

    //Sausage
    public static final RegistryObject<Item> BEEF_SAUSAGE = ITEMS.register("beef_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHICKEN_SAUSAGE = ITEMS.register("chicken_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MUTTON_SAUSAGE = ITEMS.register("mutton_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PORK_SAUSAGE = ITEMS.register("pork_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_BEEF_SAUSAGE = ITEMS.register("cooked_beef_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_CHICKEN_SAUSAGE = ITEMS.register("cooked_chicken_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_MUTTON_SAUSAGE = ITEMS.register("cooked_mutton_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_PORK_SAUSAGE = ITEMS.register("cooked_pork_sausage",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Cheese
    public static final RegistryObject<Item> CHEDDAR_CHEESE = ITEMS.register("cheddar_cheese",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MOZZARELLA_CHEESE = ITEMS.register("mozzarella_cheese",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PARMESAN_CHEESE = ITEMS.register("parmesan_cheese",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Wine
    public static final RegistryObject<Item> APPLE_WINE = ITEMS.register("apple_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> LYCHEE_WINE = ITEMS.register("lychee_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> MANGO_WINE = ITEMS.register("mango_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> ORANGE_WINE = ITEMS.register("orange_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> PEAR_WINE = ITEMS.register("pear_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> POMEGRANATE_WINE = ITEMS.register("pomegranate_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> RASPBERRY_WINE = ITEMS.register("raspberry_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> RED_GRAPE_WINE = ITEMS.register("red_grape_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> PURPLE_GRAPE_WINE = ITEMS.register("purple_grape_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> STRAWBERRY_WINE = ITEMS.register("strawberry_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> WHITE_RASPBERRY_WINE = ITEMS.register("white_raspberry_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> BLACKBERRY_WINE = ITEMS.register("blackberry_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> BLUEBERRY_WINE = ITEMS.register("blueberry_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> CHERRY_WINE = ITEMS.register("cherry_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> CRANBERRY_WINE = ITEMS.register("cranberry_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> GRAPEFRUIT_WINE = ITEMS.register("grapefruit_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> GREEN_GRAPE_WINE = ITEMS.register("green_grape_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> KIWI_WINE = ITEMS.register("kiwi_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> DRAGONFRUIT_WINE = ITEMS.register("dragonfruit_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> PASSIONFRUIT_WINE = ITEMS.register("passionfruit_wine",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));

    //Beer
    public static final RegistryObject<Item> APPLE_BEER = ITEMS.register("apple_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> LYCHEE_BEER = ITEMS.register("lychee_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> MANGO_BEER = ITEMS.register("mango_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> ORANGE_BEER = ITEMS.register("orange_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> PEAR_BEER = ITEMS.register("pear_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> POMEGRANATE_BEER = ITEMS.register("pomegranate_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> RASPBERRY_BEER = ITEMS.register("raspberry_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> RED_GRAPE_BEER = ITEMS.register("red_grape_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> PURPLE_GRAPE_BEER = ITEMS.register("purple_grape_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> STRAWBERRY_BEER = ITEMS.register("strawberry_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> WHITE_RASPBERRY_BEER = ITEMS.register("white_raspberry_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> BLACKBERRY_BEER = ITEMS.register("blackberry_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> BLUEBERRY_BEER = ITEMS.register("blueberry_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> CHERRY_BEER = ITEMS.register("cherry_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> CRANBERRY_BEER = ITEMS.register("cranberry_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> GRAPEFRUIT_BEER = ITEMS.register("grapefruit_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> GREEN_GRAPE_BEER = ITEMS.register("green_grape_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> KIWI_BEER = ITEMS.register("kiwi_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> DRAGONFRUIT_BEER = ITEMS.register("dragonfruit_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));
    public static final RegistryObject<Item> PASSIONFRUIT_BEER = ITEMS.register("passionfruit_beer",
            () -> new AlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 500, 0, true, false)
            ));

    //Roasted Veggie
    public static final RegistryObject<Item> ROASTED_BRUSSELS_SPROUTS = ITEMS.register("roasted_brussels_sprouts",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_BUTTERNUT_SQUASH = ITEMS.register("roasted_butternut_squash",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_CHILI_PEPPER = ITEMS.register("roasted_chili_pepper",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_CORN = ITEMS.register("roasted_corn",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_JALEPENO_PEPPER = ITEMS.register("roasted_jalepeno_pepper",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_CUCUMBER = ITEMS.register("roasted_cucumber",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_GREEN_BEANS = ITEMS.register("roasted_green_beans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_PEANUTS = ITEMS.register("roasted_peanuts",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_RADISH = ITEMS.register("roasted_radish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_TOMATO = ITEMS.register("roasted_tomato",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_ZUCCHINI = ITEMS.register("roasted_zucchini",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ROASTED_GARLIC = ITEMS.register("roasted_garlic",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //Dried Fruit
    public static final RegistryObject<Item> DRIED_LYCHEE = ITEMS.register("dried_lychee",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_MANGO = ITEMS.register("dried_mango",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_ORANGE = ITEMS.register("dried_orange",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_PEAR = ITEMS.register("dried_pear",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_POMEGRANATE = ITEMS.register("dried_pomegranate",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_RASPBERRY = ITEMS.register("dried_raspberry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_RED_GRAPES = ITEMS.register("dried_red_grapes",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_PURPLE_GRAPES = ITEMS.register("dried_purple_grapes",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_STRAWBERRY = ITEMS.register("dried_strawberry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_WHITE_RASPBERRY = ITEMS.register("dried_white_raspberry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_BLACKBERRY = ITEMS.register("dried_blackberry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_BLUEBERRIES = ITEMS.register("dried_blueberries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_CHERRIES = ITEMS.register("dried_cherries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_CRANBERRIES = ITEMS.register("dried_cranberries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_GRAPEFRUIT = ITEMS.register("dried_grapefruit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_GREEN_GRAPES = ITEMS.register("dried_green_grapes",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DRIED_KIWI = ITEMS.register("dried_kiwi",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F).build()).tab(DFFItemGroup.FOOD_GROUP)));

    //TODO; Ingredients
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHEESE_CURDS = ITEMS.register("cheese_curds",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PANKO = ITEMS.register("panko",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PASTA = ITEMS.register("pasta",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COCOA_POWDER = ITEMS.register("cocoa_powder",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PURIFIED_WATER = ITEMS.register("purified_water",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> TOFU = ITEMS.register("tofu",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_TOFU = ITEMS.register("cooked_tofu",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.FOOD_GROUP)));



    //TODO; Crops
    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> BELL_PEPPER = ITEMS.register("bell_pepper",
            () -> new ItemNameBlockItem(DFFBlocks.BELL_PEPPER_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.BLACKBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BLACK_BEANS = ITEMS.register("black_beans",
            () -> new ItemNameBlockItem(DFFBlocks.BLACK_BEAN_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.BLUEBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BRUSSELS_SPROUTS = ITEMS.register("brussels_sprouts",
            () -> new ItemNameBlockItem(DFFBlocks.BRUSSELS_SPROUTS_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BUTTERNUT_SQUASH = ITEMS.register("butternut_squash",
            () -> new ItemNameBlockItem(DFFBlocks.BUTTERNUT_SQUASH_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CELERY = ITEMS.register("celery",
            () -> new ItemNameBlockItem(DFFBlocks.CELERY_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> CHILI_PEPPER = ITEMS.register("chili_pepper",
            () -> new ItemNameBlockItem(DFFBlocks.CHILI_PEPPER_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_COCONUT_SAPLING.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new ItemNameBlockItem(DFFBlocks.CORN_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CRANBERRIES = ITEMS.register("cranberries",
            () -> new ItemNameBlockItem(DFFBlocks.CRANBERRY_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new ItemNameBlockItem(DFFBlocks.CUCUMBER_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new ItemNameBlockItem(DFFBlocks.GARLIC_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> GRAPEFRUIT = ITEMS.register("grapefruit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> PURPLE_GRAPES = ITEMS.register("purple_grapes",
            () -> new ItemNameBlockItem(DFFBlocks.PURPLE_GRAPE_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> RED_GRAPES = ITEMS.register("red_grapes",
            () -> new ItemNameBlockItem(DFFBlocks.RED_GRAPE_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> WHITE_GRAPES = ITEMS.register("white_grapes",
            () -> new ItemNameBlockItem(DFFBlocks.WHITE_GRAPE_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> GREEN_BEANS = ITEMS.register("green_beans",
            () -> new ItemNameBlockItem(DFFBlocks.GREEN_BEAN_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> GINGER = ITEMS.register("ginger",
            () -> new ItemNameBlockItem(DFFBlocks.GINGER_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> JALEPENO_PEPPER = ITEMS.register("jalepeno_pepper",
            () -> new ItemNameBlockItem(DFFBlocks.JALEPENO_PEPPER_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> KIDNEY_BEANS = ITEMS.register("kidney_beans",
            () -> new ItemNameBlockItem(DFFBlocks.KIDNEY_BEAN_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> KIWI = ITEMS.register("kiwi",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> LYCHEE = ITEMS.register("lychee",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new ItemNameBlockItem(DFFBlocks.ONION_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> PEANUTS = ITEMS.register("peanuts",
            () -> new ItemNameBlockItem(DFFBlocks.PEANUT_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new ItemNameBlockItem(DFFBlocks.RADISH_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.RASPBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> WHITE_RASPBERRY = ITEMS.register("white_raspberry",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.WHITE_RASPBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> RYE = ITEMS.register("rye",
            () -> new ItemNameBlockItem(DFFBlocks.RYE_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> SOYBEANS = ITEMS.register("soybeans",
            () -> new ItemNameBlockItem(DFFBlocks.SOYBEAN_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new ItemNameBlockItem(DFFBlocks.STRAWBERRY_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> SUGAR_BEET = ITEMS.register("sugar_beet",
            () -> new ItemNameBlockItem(DFFBlocks.SUGAR_BEET_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new ItemNameBlockItem(DFFBlocks.TOMATO_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> ZUCCHINI = ITEMS.register("zucchini",
            () -> new ItemNameBlockItem(DFFBlocks.ZUCCHINI_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> DRAGONFRUIT = ITEMS.register("dragonfruit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> PASSIONFRUIT = ITEMS.register("passionfruit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> CASHEWS = ITEMS.register("cashews",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_CASHEW_SAPLING.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_OLIVE_SAPLING.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_WALNUT_SAPLING.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> ALMONDS = ITEMS.register("almonds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_ALMOND_SAPLING.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));



    // Herbs
    public static final RegistryObject<Item> CILANTRO = ITEMS.register("cilantro",
            () -> new ItemNameBlockItem(DFFBlocks.CILANTRO_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new ItemNameBlockItem(DFFBlocks.MINT_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> OREGANO = ITEMS.register("oregano",
            () -> new ItemNameBlockItem(DFFBlocks.OREGANO_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> ROSEMARY = ITEMS.register("rosemary",
            () -> new ItemNameBlockItem(DFFBlocks.ROSEMARY_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));

    //TODO; Food


    //TODO; Drinks


    //TODO; Seeds
    public static final RegistryObject<Item> ORANGE_SEEDS = ITEMS.register("orange_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_ORANGE_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> GRAPEFRUIT_SEEDS = ITEMS.register("grapefruit_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> MANGO_SEED = ITEMS.register("mango_seed",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_MANGO_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> AVOCADO_PIT = ITEMS.register("avocado_pit",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_AVOCADO_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> KIWI_SEEDS = ITEMS.register("kiwi_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_KIWI_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> PEAR_SEEDS = ITEMS.register("pear_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_PEAR_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> LYCHEE_SEED = ITEMS.register("lychee_seed",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_LYCHEE_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CHERRY_PIT = ITEMS.register("cherry_pit",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_CHERRY_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> POMEGRANATE_SEEDS = ITEMS.register("pomegranate_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_POMEGRANATE_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BANANA_SEEDS = ITEMS.register("banana_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_BANANA_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> DRAGONFRUIT_SEEDS = ITEMS.register("dragonfruit_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_DRAGONFRUIT_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> PASSIONFRUIT_SEEDS = ITEMS.register("passionfruit_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.DFF_PASSIONFRUIT_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));


    public static final RegistryObject<Item> CROP_COIN = ITEMS.register("crop_coin",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.DECOR_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}