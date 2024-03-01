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

        ItemBlockRenderTypes.setRenderLayer(DFFBlocks.ORANGE_SAPLING.get(), RenderType.cutout());

        //Leaves
        ItemBlockRenderTypes.setRenderLayer(DFFBlocksNoDatagen.ORANGE_LEAVES.get(), RenderType.cutout());

    }

    @SubscribeEvent
    public static void entityRendererEvent(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(DFFBlocks.PIXEL_PLACER_ENTITY.get(), PixelPlacerEntityRenderer::new);
    }
}




