package com.dragn0007.dffeasts;

import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.entity.villager.FeastsFarmer;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.util.config.DFFeastsCommonConfig;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.dragn0007.dffeasts.DFFeastsMain.MODID;

@Mod(MODID)
public class DFFeastsMain
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "dffeasts";

    public DFFeastsMain()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        DFFItems.register(eventBus);
        DFFBlocks.register(eventBus);
        DFFBlocksNoDatagen.register(eventBus);
        FeastsFarmer.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DFFeastsCommonConfig.SPEC, "fortuitousfeasts-common.toml");
    }


    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FeastsFarmer.registerPOIs();
        });
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    }

    private void processIMC(final InterModProcessEvent event)
    {
    }
}