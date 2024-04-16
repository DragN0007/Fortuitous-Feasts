package com.dragn0007.dffeasts.block;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.crop.BlackberryBlock;
import com.dragn0007.dffeasts.block.crop.BlueberryBlock;
import com.dragn0007.dffeasts.block.crop.RaspberryBlock;
import com.dragn0007.dffeasts.block.crop.WhiteRaspberryBlock;
import com.dragn0007.dffeasts.block.decorvox.CropBag;
import com.dragn0007.dffeasts.block.leaves.*;
import com.dragn0007.dffeasts.item.DFFItemGroup;
import com.dragn0007.dffeasts.item.DFFItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DFFBlocksNoDatagen {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DFFeastsMain.MODID);

    public static final RegistryObject<Block> CROP_BAG_VEGGIES = registerBlock("crop_bag_veggies",
            () -> new CropBag());
    public static final RegistryObject<Block> CROP_BAG_FRUITS = registerBlock("crop_bag_fruits",
            () -> new CropBag());

    public static final RegistryObject<Block> CROP_BARREL = registerBlock("crop_barrel",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));



    //TODO; Cakes
    public static final RegistryObject<Block> CHOCOLATE_CAKE = registerBlockWithoutItem("chocolate_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> YELLOW_CHOCOLATE_CAKE = registerBlockWithoutItem("yellow_chocolate_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CHERRY_CHOCOLATE_CAKE = registerBlockWithoutItem("cherry_chocolate_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> RED_VELVET_CAKE = registerBlockWithoutItem("red_velvet_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WHITE_CAKE = registerBlockWithoutItem("white_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> BLACKBERRY_CAKE = registerBlockWithoutItem("blackberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> BLUEBERRY_CAKE = registerBlockWithoutItem("blueberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CHERRY_CAKE = registerBlockWithoutItem("cherry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CRANBERRY_CAKE = registerBlockWithoutItem("cranberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> GRAPEFRUIT_CAKE = registerBlockWithoutItem("grapefruit_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> GREEN_GRAPE_CAKE = registerBlockWithoutItem("green_grape_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> RED_GRAPE_CAKE = registerBlockWithoutItem("red_grape_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PURPLE_GRAPE_CAKE = registerBlockWithoutItem("purple_grape_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> KIWI_CAKE = registerBlockWithoutItem("kiwi_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> LYCHEE_CAKE = registerBlockWithoutItem("lychee_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> MANGO_CAKE = registerBlockWithoutItem("mango_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> ORANGE_CAKE = registerBlockWithoutItem("orange_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PEAR_CAKE = registerBlockWithoutItem("pear_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> POMEGRANATE_CAKE = registerBlockWithoutItem("pomegranate_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> RASPBERRY_CAKE = registerBlockWithoutItem("raspberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> STRAWBERRY_CAKE = registerBlockWithoutItem("strawberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WHITE_RASPBERRY_CAKE = registerBlockWithoutItem("white_raspberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));


    //TODO; Trees/ Leaves
    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves",
            () -> new OrangeLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> MANGO_LEAVES = registerBlock("mango_leaves",
            () -> new MangoLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> COCONUT_LEAVES = registerBlock("coconut_leaves",
            () -> new CoconutLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> GRAPEFRUIT_LEAVES = registerBlock("grapefruit_leaves",
            () -> new GrapefruitLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> LYCHEE_LEAVES = registerBlock("lychee_leaves",
            () -> new LycheeLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            () -> new AvocadoLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> KIWI_LEAVES = registerBlock("kiwi_leaves",
            () -> new KiwiLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new CherryLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> PEAR_LEAVES = registerBlock("pear_leaves",
            () -> new PearLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> POMEGRANATE_LEAVES = registerBlock("pomegranate_leaves",
            () -> new PomegranateLeaves(Block.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));


    //TODO; Bushes
    public static final RegistryObject<Block> BLUEBERRY_BUSH = registerBlockWithoutItem("blueberry_bush",
            () -> new BlueberryBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> BLACKBERRY_BUSH = registerBlockWithoutItem("blackberry_bush",
            () -> new BlackberryBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> RASPBERRY_BUSH = registerBlockWithoutItem("raspberry_bush",
            () -> new RaspberryBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> WHITE_RASPBERRY_BUSH = registerBlockWithoutItem("white_raspberry_bush",
            () -> new WhiteRaspberryBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));




    protected static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    protected static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    protected static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        DFFItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(DFFItemGroup.DECOR_GROUP)));
    }

    protected static <T extends Block>RegistryObject<T> registerPlantBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerPlantBlockItem(name, toReturn);
        return toReturn;
    }
    protected static <T extends Block> void registerPlantBlockItem(String name, RegistryObject<T> block) {
        DFFItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(DFFItemGroup.CROP_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
