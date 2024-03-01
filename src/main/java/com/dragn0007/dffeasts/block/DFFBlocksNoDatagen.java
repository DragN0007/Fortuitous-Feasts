package com.dragn0007.dffeasts.block;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.crop.BlackberryBlock;
import com.dragn0007.dffeasts.block.crop.BlueberryBlock;
import com.dragn0007.dffeasts.block.crop.RaspberryBlock;
import com.dragn0007.dffeasts.block.crop.WhiteRaspberryBlock;
import com.dragn0007.dffeasts.block.custom.decorvox.CropBag;
import com.dragn0007.dffeasts.block.leaves.OrangeLeaves;
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


    //TODO; Trees/ Leaves
    public static final RegistryObject<Block> ORANGE_LEAVES = registerPlantBlock("orange_leaves",
            () -> new OrangeLeaves(Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));

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
