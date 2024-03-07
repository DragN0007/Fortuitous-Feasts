package com.dragn0007.dffeasts.event;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.block.pixel_placement.util.PixelPlacerEntityRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = DFFeastsMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DFFeastsEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        //Decor
        ResourceLocation resourceLocation = new ResourceLocation(DFFeastsMain.MODID, "null");
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.PIXEL_PLACER_CONTAINER.get(), RenderType.lineStrip());


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


        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.ORANGE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.MANGO_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.COCONUT_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.GRAPEFRUIT_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.POMEGRANATE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.AVOCADO_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.CHERRY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.PEAR_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.KIWI_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.LYCHEE_SAPLING.get(), RenderType.cutout());

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
    }

    @SubscribeEvent
    public static void entityRendererEvent(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(DFFBlocks.PIXEL_PLACER_ENTITY.get(), PixelPlacerEntityRenderer::new);
    }
}




