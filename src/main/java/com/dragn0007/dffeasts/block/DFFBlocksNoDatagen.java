package com.dragn0007.dffeasts.block;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.crop.BlackberryBlock;
import com.dragn0007.dffeasts.block.crop.BlueberryBlock;
import com.dragn0007.dffeasts.block.crop.RaspberryBlock;
import com.dragn0007.dffeasts.block.crop.WhiteRaspberryBlock;
import com.dragn0007.dffeasts.block.custom.AgeableCheeseBlock;
import com.dragn0007.dffeasts.block.decorvox.CropBag;
import com.dragn0007.dffeasts.block.leaves.*;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacer;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerItem;
import com.dragn0007.dffeasts.item.DFFItemGroup;
import com.dragn0007.dffeasts.item.DFFItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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


    //TODO; CHEESE
    public static final RegistryObject<Block> CHEDDAR_CHEESE_BLOCK = registerBlock("cheddar_cheese_block",
            () -> new AgeableCheeseBlock(Block.Properties.of(Material.CAKE)));



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

    private static <T extends PixelPlacer>RegistryObject<T> registerPixelPlacer(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        DFFItems.ITEMS.register("pixel_placement/" + name, () -> new PixelPlacerItem(toReturn.get(), new Item.Properties().tab(DFFItemGroup.DECOR_GROUP)));
        return toReturn;
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
