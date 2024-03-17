package com.dragn0007.dffeasts.block;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.crop.*;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacer;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerContainer;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerEntity;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerItem;
import com.dragn0007.dffeasts.item.DFFItemGroup;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.world.feature.tree.*;
import net.minecraft.world.effect.MobEffects;
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

    /*
    public static final RegistryObject<Block> _PLANT = registerBlockWithoutItem("_plant",
            () -> new PlantBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    */

    //TODO; Wild Herbs
    public static final RegistryObject<FlowerBlock> WILD_ROSEMARY = registerBlockWithoutItem("wild_rosemary",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_CILANTRO = registerBlockWithoutItem("wild_cilantro",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_OREGANO = registerBlockWithoutItem("wild_oregano",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_MINT = registerBlockWithoutItem("wild_mint",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));

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
    public static final RegistryObject<Block> BLACK_BEAN_PLANT = registerBlockWithoutItem("black_bean_plant",
            () -> new BlackBeanBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> BRUSSELS_SPROUTS_PLANT = registerBlockWithoutItem("brussels_sprouts_plant",
            () -> new BrusselsSproutsBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> BUTTERNUT_SQUASH_PLANT = registerBlockWithoutItem("butternut_squash_plant",
            () -> new ButternutSquashBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> CELERY_PLANT = registerBlockWithoutItem("celery_plant",
            () -> new CeleryBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> CORN_PLANT = registerBlockWithoutItem("corn_plant",
            () -> new CornBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> CUCUMBER_PLANT = registerBlockWithoutItem("cucumber_plant",
            () -> new CucumberBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> GINGER_PLANT = registerBlockWithoutItem("ginger_plant",
            () -> new GingerBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> GREEN_BEAN_PLANT = registerBlockWithoutItem("green_bean_plant",
            () -> new GreenBeanBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> KIDNEY_BEAN_PLANT = registerBlockWithoutItem("kidney_bean_plant",
            () -> new KidneyBeanBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> PEANUT_PLANT = registerBlockWithoutItem("peanut_plant",
            () -> new PeanutBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> RYE_PLANT = registerBlockWithoutItem("rye_plant",
            () -> new RyeBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> SOYBEAN_PLANT = registerBlockWithoutItem("soybean_plant",
            () -> new SoybeanBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> STRAWBERRY_PLANT = registerBlockWithoutItem("strawberry_plant",
            () -> new StrawberryBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> SUGAR_BEET_PLANT = registerBlockWithoutItem("sugar_beet_plant",
            () -> new SugarBeetBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> ZUCCHINI_PLANT = registerBlockWithoutItem("zucchini_plant",
            () -> new ZucchiniBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));

    public static final RegistryObject<Block> CILANTRO_PLANT = registerBlockWithoutItem("cilantro_plant",
            () -> new CilantroBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> OREGANO_PLANT = registerBlockWithoutItem("oregano_plant",
            () -> new OreganoBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> ROSEMARY_PLANT = registerBlockWithoutItem("rosemary_plant",
            () -> new RosemaryBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> MINT_PLANT = registerBlockWithoutItem("mint_plant",
            () -> new MintBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));


    //TODO; Trees
    public static final RegistryObject<RotatedPillarBlock> ORANGE_LOG = registerBlock("orange_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ORANGE_PLANKS = registerBlock("orange_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAIRS = registerBlock("orange_stairs",
            () -> new StairBlock(ORANGE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_SLAB = registerBlock("orange_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_ORANGE_SAPLING = registerBlockWithoutItem("dff_orange_sapling",
            () -> new SaplingBlock(new DFFOrangeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> COCONUT_LOG = registerBlock("coconut_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> COCONUT_PLANKS = registerBlock("coconut_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> COCONUT_STAIRS = registerBlock("coconut_stairs",
            () -> new StairBlock(COCONUT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> COCONUT_SLAB = registerBlock("coconut_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_COCONUT_SAPLING = registerBlockWithoutItem("dff_coconut_sapling",
            () -> new SaplingBlock(new DFFCoconutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> MANGO_LOG = registerBlock("mango_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MANGO_PLANKS = registerBlock("mango_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MANGO_STAIRS = registerBlock("mango_stairs",
            () -> new StairBlock(MANGO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MANGO_SLAB = registerBlock("mango_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_MANGO_SAPLING = registerBlockWithoutItem("dff_mango_sapling",
            () -> new SaplingBlock(new DFFMangoTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> GRAPEFRUIT_LOG = registerBlock("grapefruit_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GRAPEFRUIT_PLANKS = registerBlock("grapefruit_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAPEFRUIT_STAIRS = registerBlock("grapefruit_stairs",
            () -> new StairBlock(GRAPEFRUIT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAPEFRUIT_SLAB = registerBlock("grapefruit_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_GRAPEFRUIT_SAPLING = registerBlockWithoutItem("dff_grapefruit_sapling",
            () -> new SaplingBlock(new DFFGrapefruitTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> AVOCADO_LOG = registerBlock("avocado_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> AVOCADO_PLANKS = registerBlock("avocado_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> AVOCADO_STAIRS = registerBlock("avocado_stairs",
            () -> new StairBlock(AVOCADO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> AVOCADO_SLAB = registerBlock("avocado_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_AVOCADO_SAPLING = registerBlockWithoutItem("dff_avocado_sapling",
            () -> new SaplingBlock(new DFFAvocadoTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> POMEGRANATE_LOG = registerBlock("pomegranate_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> POMEGRANATE_PLANKS = registerBlock("pomegranate_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POMEGRANATE_STAIRS = registerBlock("pomegranate_stairs",
            () -> new StairBlock(POMEGRANATE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POMEGRANATE_SLAB = registerBlock("pomegranate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_POMEGRANATE_SAPLING = registerBlockWithoutItem("dff_pomegranate_sapling",
            () -> new SaplingBlock(new DFFPomegranateTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> PEAR_LOG = registerBlock("pear_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PEAR_PLANKS = registerBlock("pear_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEAR_STAIRS = registerBlock("pear_stairs",
            () -> new StairBlock(PEAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEAR_SLAB = registerBlock("pear_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_PEAR_SAPLING = registerBlockWithoutItem("dff_pear_sapling",
            () -> new SaplingBlock(new DFFPearTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> CHERRY_LOG = registerBlock("cherry_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CHERRY_PLANKS = registerBlock("cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHERRY_STAIRS = registerBlock("cherry_stairs",
            () -> new StairBlock(CHERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHERRY_SLAB = registerBlock("cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_CHERRY_SAPLING = registerBlockWithoutItem("dff_cherry_sapling",
            () -> new SaplingBlock(new DFFCherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> LYCHEE_LOG = registerBlock("lychee_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> LYCHEE_PLANKS = registerBlock("lychee_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LYCHEE_STAIRS = registerBlock("lychee_stairs",
            () -> new StairBlock(LYCHEE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LYCHEE_SLAB = registerBlock("lychee_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_LYCHEE_SAPLING = registerBlockWithoutItem("dff_lychee_sapling",
            () -> new SaplingBlock(new DFFLycheeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> KIWI_LOG = registerBlock("kiwi_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> KIWI_PLANKS = registerBlock("kiwi_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> KIWI_STAIRS = registerBlock("kiwi_stairs",
            () -> new StairBlock(KIWI_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> KIWI_SLAB = registerBlock("kiwi_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_KIWI_SAPLING = registerBlockWithoutItem("dff_kiwi_sapling",
            () -> new SaplingBlock(new DFFKiwiTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


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
