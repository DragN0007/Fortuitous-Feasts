package com.dragn0007.dffeasts;

import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.entity.villager.FeastsFarmer;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.util.config.DFFeastsCommonConfig;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.ComposterBlock;
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

        ComposterBlock.COMPOSTABLES.put(DFFItems.AVOCADO.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.BLUEBERRIES.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.BLACKBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.BUTTERNUT_SQUASH.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.BRUSSELS_SPROUTS.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.BELL_PEPPER.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.BLACK_BEANS.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CHERRIES.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CORN.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CUCUMBER.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CHILI_PEPPER.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CRANBERRIES.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CELERY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.COCONUT.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CILANTRO.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.GRAPEFRUIT.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.GARLIC.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.GREEN_BEANS.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.GINGER.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.JALEPENO_PEPPER.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.KIWI.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.KIDNEY_BEANS.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.LYCHEE.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.MANGO.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.MINT.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.ONION.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.ORANGE.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.OREGANO.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.PEAR.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.PURPLE_GRAPES.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.PEANUTS.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.PEAR.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.POMEGRANATE.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.RASPBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.RADISH.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.RED_GRAPES.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.RYE.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.ROSEMARY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.STRAWBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.SUGAR_BEET.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.SOYBEANS.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.TOMATO.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.WHITE_GRAPES.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.WHITE_RASPBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.ZUCCHINI.get(), 0.5F);

        ComposterBlock.COMPOSTABLES.put(DFFItems.ORANGE_SEEDS.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.POMEGRANATE_SEEDS.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.MANGO_SEED.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.CHERRY_PIT.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.AVOCADO_PIT.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.GRAPEFRUIT_SEEDS.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.KIWI_SEEDS.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.PEAR_SEEDS.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(DFFItems.LYCHEE_SEED.get(), 0.2F);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    }

    private void processIMC(final InterModProcessEvent event)
    {
    }
}