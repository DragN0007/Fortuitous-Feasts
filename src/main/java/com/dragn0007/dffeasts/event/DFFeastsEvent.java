package com.dragn0007.dffeasts.event;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = DFFeastsMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DFFeastsEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_ROSEMARY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_MINT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_CILANTRO.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_OREGANO.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_BELL_PEPPER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_BLACK_BEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_BRUSSELS_SPROUTS_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_CORN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_CELERY_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_CHILI_PEPPER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_BUTTERNUT_SQUASH_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_CUCUMBER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_CRANBERRY_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_GARLIC_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_GINGER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_GREEN_BEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_PURPLE_GRAPE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_RED_GRAPE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_JALEPENO_PEPPER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_KIDNEY_BEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_ONION_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_PEANUT_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_RADISH_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_RYE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_SOYBEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_SUGAR_BEET_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_STRAWBERRY_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_TOMATO_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_WHITE_GRAPE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WILD_ZUCCHINI_PLANT.get(), RenderType.cutout());

        //Crops
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.BELL_PEPPER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.JALEPENO_PEPPER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CHILI_PEPPER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CRANBERRY_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.BLUEBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.BLACKBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.RASPBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.WHITE_RASPBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.RADISH_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.ONION_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.GARLIC_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.TOMATO_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.RED_GRAPE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.PURPLE_GRAPE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.WHITE_GRAPE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.OREGANO_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.ROSEMARY_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.MINT_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CILANTRO_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.BLACK_BEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.BRUSSELS_SPROUTS_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.BUTTERNUT_SQUASH_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CELERY_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CORN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CUCUMBER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.GREEN_BEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.KIDNEY_BEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.PEANUT_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.GINGER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.RYE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.SOYBEAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.STRAWBERRY_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.SUGAR_BEET_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.ZUCCHINI_PLANT.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_ORANGE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_MANGO_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_COCONUT_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_POMEGRANATE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_AVOCADO_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_CHERRY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_PEAR_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_KIWI_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.DFF_LYCHEE_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.ORANGE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.MANGO_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.GRAPEFRUIT_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.COCONUT_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.POMEGRANATE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.AVOCADO_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CHERRY_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.PEAR_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.KIWI_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.LYCHEE_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.ORANGE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.MANGO_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.GRAPEFRUIT_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.COCONUT_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.POMEGRANATE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.AVOCADO_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CHERRY_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.PEAR_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.KIWI_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.LYCHEE_TRAPDOOR.get(), RenderType.cutout());

        //Leaves
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.ORANGE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.MANGO_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.GRAPEFRUIT_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.COCONUT_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.POMEGRANATE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.AVOCADO_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.CHERRY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.PEAR_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.KIWI_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.LYCHEE_LEAVES.get(), RenderType.cutout());


        //Animals
//        EntityRenderers.register(EntityTypes.DUCK.get(), DuckRender::new);
    }

    /*

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {

        event.put(EntityTypes.DUCK.get(), Duck.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.DUCK.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Duck::checkAnimalSpawnRules);
    }

     */
}




