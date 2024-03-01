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
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.BLUEBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> BRUSSELS_SPROUTS = ITEMS.register("brussels_sprouts",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> BUTTERNUT_SQUASH = ITEMS.register("butternut_squash",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> CELERY = ITEMS.register("celery",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> CHILI_PEPPER = ITEMS.register("chili_pepper",
            () -> new ItemNameBlockItem(DFFBlocks.CHILI_PEPPER_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> CRANBERRIES = ITEMS.register("cranberries",
            () -> new ItemNameBlockItem(DFFBlocks.CRANBERRY_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
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
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> JALEPENO_PEPPER = ITEMS.register("jalepeno_pepper",
            () -> new ItemNameBlockItem(DFFBlocks.JALEPENO_PEPPER_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
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
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new ItemNameBlockItem(DFFBlocks.RADISH_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.RASPBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> WHITE_RASPBERRY = ITEMS.register("white_raspberry",
            () -> new ItemNameBlockItem(DFFBlocksNoDatagen.WHITE_RASPBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> RYE = ITEMS.register("rye",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new ItemNameBlockItem(DFFBlocks.TOMATO_PLANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP))));
    public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> ZUCCHINI = ITEMS.register("zucchini",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> GINGER = ITEMS.register("ginger",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> BLACK_BEANS = ITEMS.register("black_beans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> KIDNEY_BEANS = ITEMS.register("kidney_beans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> SOYBEANS = ITEMS.register("soybeans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));

    // Herbs
    public static final RegistryObject<Item> CILANTRO = ITEMS.register("cilantro",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> OREGANO = ITEMS.register("oregano",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> PARSLEY = ITEMS.register("parsley",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));
    public static final RegistryObject<Item> ROSEMARY = ITEMS.register("rosemary",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(DFFItemGroup.CROP_GROUP)));

    //TODO; Food


    //TODO; Drinks


    //TODO; Seeds
//    public static final RegistryObject<Item> ORANGE_SEEDS = ITEMS.register("orange_seeds",
//            () -> new ItemNameBlockItem(DFFBlocks..get(), (new Item.Properties().tab(DFFItemGroup.CROP_GROUP))));


    public static final RegistryObject<Item> CROP_COIN = ITEMS.register("crop_coin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}