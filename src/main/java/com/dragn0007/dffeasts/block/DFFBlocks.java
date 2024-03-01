package com.dragn0007.dffeasts.block;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.crop.*;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacer;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerContainer;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerEntity;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerItem;
import com.dragn0007.dffeasts.item.DFFItemGroup;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.world.feature.tree.OrangeTreeGrower;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DFFBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DFFeastsMain.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES
            = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, DFFeastsMain.MODID);



    //TODO; Crops
    public static final RegistryObject<Block> BELL_PEPPER_PLANT = registerBlockWithoutItem("bell_pepper_plant",
            () -> new BellPepperBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> JALEPENO_PEPPER_PLANT = registerBlockWithoutItem("jalepeno_pepper_plant",
            () -> new JalepenoPepperBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> CHILI_PEPPER_PLANT = registerBlockWithoutItem("chili_pepper_plant",
            () -> new ChiliPepperBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> CRANBERRY_PLANT = registerBlockWithoutItem("cranberry_plant",
            () -> new CranberryBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> ONION_PLANT = registerBlockWithoutItem("onion_plant",
            () -> new OnionBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> GARLIC_PLANT = registerBlockWithoutItem("garlic_plant",
            () -> new GarlicBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> RADISH_PLANT = registerBlockWithoutItem("radish_plant",
            () -> new RadishBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> TOMATO_PLANT = registerBlockWithoutItem("tomato_plant",
            () -> new TomatoBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> RED_GRAPE_PLANT = registerBlockWithoutItem("red_grape_plant",
            () -> new RedGrapeBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> PURPLE_GRAPE_PLANT = registerBlockWithoutItem("purple_grape_plant",
            () -> new PurpleGrapeBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WHITE_GRAPE_PLANT = registerBlockWithoutItem("white_grape_plant",
            () -> new WhiteGrapeBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));


    //TODO; Trees
    public static final RegistryObject<RotatedPillarBlock> ORANGE_LOG = registerBlock("orange_log",
            () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> ORANGE_PLANKS = registerBlock("orange_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> ORANGE_SAPLING = registerBlockWithoutItem("orange_sapling",
            () -> new SaplingBlock(new OrangeTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));



    //TODO; Decor




    public static final RegistryObject<PixelPlacerContainer> PIXEL_PLACER_CONTAINER = BLOCKS.register("pixel_placer_container", PixelPlacerContainer::new);
    public static final RegistryObject<BlockEntityType<PixelPlacerEntity>> PIXEL_PLACER_ENTITY = BLOCK_ENTITIES.register("pixel_placer_container",
            () -> BlockEntityType.Builder.of(PixelPlacerEntity::new, PIXEL_PLACER_CONTAINER.get()).build(null));

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
        BLOCK_ENTITIES.register(eventBus);
    }
}
