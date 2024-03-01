package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = DFFeastsMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new DFFRecipeMaker(generator));
        generator.addProvider(new DFFLootTableProvider(generator));
        generator.addProvider(new DFFBlockstateProvider(generator, existingFileHelper));
        generator.addProvider(new DFFItemModelProvider(generator, existingFileHelper));
    }
}
