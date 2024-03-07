package com.dragn0007.dffeasts.item;


import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
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
            () -> new ItemNameBlockItem(DFFBlocks.COCONUT_SAPLING.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
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
//    public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut",
//            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> ZUCCHINI = ITEMS.register("zucchini",
            () -> new ItemNameBlockItem(DFFBlocks.ZUCCHINI_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));

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
            () -> new ItemNameBlockItem(DFFBlocks.ORANGE_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> GRAPEFRUIT_SEEDS = ITEMS.register("grapefruit_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.GRAPEFRUIT_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> MANGO_SEED = ITEMS.register("mango_seed",
            () -> new ItemNameBlockItem(DFFBlocks.MANGO_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> AVOCADO_PIT = ITEMS.register("avocado_pit",
            () -> new ItemNameBlockItem(DFFBlocks.AVOCADO_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> KIWI_SEEDS = ITEMS.register("kiwi_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.KIWI_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> PEAR_SEEDS = ITEMS.register("pear_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.PEAR_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> LYCHEE_SEED = ITEMS.register("lychee_seed",
            () -> new ItemNameBlockItem(DFFBlocks.LYCHEE_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CHERRY_PIT = ITEMS.register("cherry_pit",
            () -> new ItemNameBlockItem(DFFBlocks.CHERRY_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> POMEGRANATE_SEEDS = ITEMS.register("pomegranate_seeds",
            () -> new ItemNameBlockItem(DFFBlocks.POMEGRANATE_SAPLING.get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));


    public static final RegistryObject<Item> CROP_COIN = ITEMS.register("crop_coin",
            () -> new Item(new Item.Properties().tab(DFFItemGroup.DECOR_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}