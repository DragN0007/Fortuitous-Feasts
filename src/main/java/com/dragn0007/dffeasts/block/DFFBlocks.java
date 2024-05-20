package com.dragn0007.dffeasts.block;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.crop.*;
import com.dragn0007.dffeasts.block.leaves.AlmondLeaves;
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


    //TODO; Wild Crops
    public static final RegistryObject<Block> WILD_BELL_PEPPER_PLANT = registerBlockWithoutItem("wild_bell_pepper_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_JALEPENO_PEPPER_PLANT = registerBlockWithoutItem("wild_jalepeno_pepper_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_CHILI_PEPPER_PLANT = registerBlockWithoutItem("wild_chili_pepper_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_CRANBERRY_PLANT = registerBlockWithoutItem("wild_cranberry_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_ONION_PLANT = registerBlockWithoutItem("wild_onion_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_GARLIC_PLANT = registerBlockWithoutItem("wild_garlic_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_RADISH_PLANT = registerBlockWithoutItem("wild_radish_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_TOMATO_PLANT = registerBlockWithoutItem("wild_tomato_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_RED_GRAPE_PLANT = registerBlockWithoutItem("wild_red_grape_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_PURPLE_GRAPE_PLANT = registerBlockWithoutItem("wild_purple_grape_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_WHITE_GRAPE_PLANT = registerBlockWithoutItem("wild_white_grape_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_BLACK_BEAN_PLANT = registerBlockWithoutItem("wild_black_bean_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_BRUSSELS_SPROUTS_PLANT = registerBlockWithoutItem("wild_brussels_sprouts_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_BUTTERNUT_SQUASH_PLANT = registerBlockWithoutItem("wild_butternut_squash_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_CELERY_PLANT = registerBlockWithoutItem("wild_celery_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_CORN_PLANT = registerBlockWithoutItem("wild_corn_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_CUCUMBER_PLANT = registerBlockWithoutItem("wild_cucumber_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_GINGER_PLANT = registerBlockWithoutItem("wild_ginger_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_GREEN_BEAN_PLANT = registerBlockWithoutItem("wild_green_bean_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_KIDNEY_BEAN_PLANT = registerBlockWithoutItem("wild_kidney_bean_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_PEANUT_PLANT = registerBlockWithoutItem("wild_peanut_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_RYE_PLANT = registerBlockWithoutItem("wild_rye_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_SOYBEAN_PLANT = registerBlockWithoutItem("wild_soybean_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_STRAWBERRY_PLANT = registerBlockWithoutItem("wild_strawberry_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_SUGAR_BEET_PLANT = registerBlockWithoutItem("wild_sugar_beet_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_ZUCCHINI_PLANT = registerBlockWithoutItem("wild_zucchini_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));



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
    public static final RegistryObject<Block> ORANGE_FENCE = registerBlock("orange_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_FENCE_GATE = registerBlock("orange_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_DOOR = registerBlock("orange_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> ORANGE_TRAPDOOR = registerBlock("orange_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> COCONUT_FENCE = registerBlock("coconut_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> COCONUT_FENCE_GATE = registerBlock("coconut_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> COCONUT_DOOR = registerBlock("coconut_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> COCONUT_TRAPDOOR = registerBlock("coconut_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> MANGO_FENCE = registerBlock("mango_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MANGO_FENCE_GATE = registerBlock("mango_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MANGO_DOOR = registerBlock("mango_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> MANGO_TRAPDOOR = registerBlock("mango_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> GRAPEFRUIT_FENCE = registerBlock("grapefruit_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAPEFRUIT_FENCE_GATE = registerBlock("grapefruit_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAPEFRUIT_DOOR = registerBlock("grapefruit_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> GRAPEFRUIT_TRAPDOOR = registerBlock("grapefruit_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> AVOCADO_FENCE = registerBlock("avocado_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> AVOCADO_FENCE_GATE = registerBlock("avocado_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> AVOCADO_DOOR = registerBlock("avocado_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> AVOCADO_TRAPDOOR = registerBlock("avocado_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> POMEGRANATE_FENCE = registerBlock("pomegranate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POMEGRANATE_FENCE_GATE = registerBlock("pomegranate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POMEGRANATE_DOOR = registerBlock("pomegranate_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> POMEGRANATE_TRAPDOOR = registerBlock("pomegranate_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> PEAR_FENCE = registerBlock("pear_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEAR_FENCE_GATE = registerBlock("pear_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEAR_DOOR = registerBlock("pear_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> PEAR_TRAPDOOR = registerBlock("pear_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> CHERRY_FENCE = registerBlock("cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHERRY_DOOR = registerBlock("cherry_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> LYCHEE_FENCE = registerBlock("lychee_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LYCHEE_FENCE_GATE = registerBlock("lychee_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LYCHEE_DOOR = registerBlock("lychee_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> LYCHEE_TRAPDOOR = registerBlock("lychee_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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
    public static final RegistryObject<Block> KIWI_FENCE = registerBlock("kiwi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> KIWI_FENCE_GATE = registerBlock("kiwi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> KIWI_DOOR = registerBlock("kiwi_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> KIWI_TRAPDOOR = registerBlock("kiwi_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));



    //Update 1.5
    public static final RegistryObject<RotatedPillarBlock> BANANA_LOG = registerBlock("banana_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BANANA_PLANKS = registerBlock("banana_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BANANA_STAIRS = registerBlock("banana_stairs",
            () -> new StairBlock(BANANA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BANANA_SLAB = registerBlock("banana_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_BANANA_SAPLING = registerBlockWithoutItem("dff_banana_sapling",
            () -> new SaplingBlock(new DFFBananaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BANANA_FENCE = registerBlock("banana_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BANANA_FENCE_GATE = registerBlock("banana_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BANANA_DOOR = registerBlock("banana_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> BANANA_TRAPDOOR = registerBlock("banana_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<RotatedPillarBlock> DRAGONFRUIT_LOG = registerBlock("dragonfruit_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> DRAGONFRUIT_PLANKS = registerBlock("dragonfruit_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DRAGONFRUIT_STAIRS = registerBlock("dragonfruit_stairs",
            () -> new StairBlock(DRAGONFRUIT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DRAGONFRUIT_SLAB = registerBlock("dragonfruit_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_DRAGONFRUIT_SAPLING = registerBlockWithoutItem("dff_dragonfruit_sapling",
            () -> new SaplingBlock(new DFFDragonfruitTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> DRAGONFRUIT_FENCE = registerBlock("dragonfruit_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DRAGONFRUIT_FENCE_GATE = registerBlock("dragonfruit_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DRAGONFRUIT_DOOR = registerBlock("dragonfruit_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> DRAGONFRUIT_TRAPDOOR = registerBlock("dragonfruit_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<RotatedPillarBlock> PASSIONFRUIT_LOG = registerBlock("passionfruit_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PASSIONFRUIT_PLANKS = registerBlock("passionfruit_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PASSIONFRUIT_STAIRS = registerBlock("passionfruit_stairs",
            () -> new StairBlock(PASSIONFRUIT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PASSIONFRUIT_SLAB = registerBlock("passionfruit_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_PASSIONFRUIT_SAPLING = registerBlockWithoutItem("dff_passionfruit_sapling",
            () -> new SaplingBlock(new DFFPassionfruitTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> PASSIONFRUIT_FENCE = registerBlock("passionfruit_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PASSIONFRUIT_FENCE_GATE = registerBlock("passionfruit_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PASSIONFRUIT_DOOR = registerBlock("passionfruit_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> PASSIONFRUIT_TRAPDOOR = registerBlock("passionfruit_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<RotatedPillarBlock> WALNUT_LOG = registerBlock("walnut_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WALNUT_STAIRS = registerBlock("walnut_stairs",
            () -> new StairBlock(WALNUT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WALNUT_SLAB = registerBlock("walnut_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_WALNUT_SAPLING = registerBlockWithoutItem("dff_walnut_sapling",
            () -> new SaplingBlock(new DFFWalnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> WALNUT_FENCE = registerBlock("walnut_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WALNUT_FENCE_GATE = registerBlock("walnut_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WALNUT_DOOR = registerBlock("walnut_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> WALNUT_TRAPDOOR = registerBlock("walnut_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<RotatedPillarBlock> ALMOND_LOG = registerBlock("almond_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ALMOND_PLANKS = registerBlock("almond_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALMOND_STAIRS = registerBlock("almond_stairs",
            () -> new StairBlock(ALMOND_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALMOND_SLAB = registerBlock("almond_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_ALMOND_SAPLING = registerBlockWithoutItem("dff_almond_sapling",
            () -> new SaplingBlock(new DFFAlmondTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ALMOND_FENCE = registerBlock("almond_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALMOND_FENCE_GATE = registerBlock("almond_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALMOND_DOOR = registerBlock("almond_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> ALMOND_TRAPDOOR = registerBlock("almond_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<RotatedPillarBlock> CASHEW_LOG = registerBlock("cashew_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CASHEW_PLANKS = registerBlock("cashew_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CASHEW_STAIRS = registerBlock("cashew_stairs",
            () -> new StairBlock(CASHEW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CASHEW_SLAB = registerBlock("cashew_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_CASHEW_SAPLING = registerBlockWithoutItem("dff_cashew_sapling",
            () -> new SaplingBlock(new DFFCashewTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> CASHEW_FENCE = registerBlock("cashew_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CASHEW_FENCE_GATE = registerBlock("cashew_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CASHEW_DOOR = registerBlock("cashew_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> CASHEW_TRAPDOOR = registerBlock("cashew_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<RotatedPillarBlock> OLIVE_LOG = registerBlock("olive_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OLIVE_PLANKS = registerBlock("olive_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLIVE_STAIRS = registerBlock("olive_stairs",
            () -> new StairBlock(OLIVE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLIVE_SLAB = registerBlock("olive_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> DFF_OLIVE_SAPLING = registerBlockWithoutItem("dff_olive_sapling",
            () -> new SaplingBlock(new DFFOliveTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> OLIVE_FENCE = registerBlock("olive_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLIVE_FENCE_GATE = registerBlock("olive_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLIVE_DOOR = registerBlock("olive_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> OLIVE_TRAPDOOR = registerBlock("olive_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));


    //TODO; Decor





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
        BLOCK_ENTITIES.register(eventBus);
    }
}
