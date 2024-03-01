package com.dragn0007.dffeasts.world;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.world.gen.DFFFlowerGeneration;
import com.dragn0007.dffeasts.world.gen.DFFTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = DFFeastsMain.MODID)
public class DFFWorldEvents {
    @SubscribeEvent
            public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
    DFFFlowerGeneration.generateFlowers(event);
    DFFTreeGeneration.generateTrees(event);
    }
}
