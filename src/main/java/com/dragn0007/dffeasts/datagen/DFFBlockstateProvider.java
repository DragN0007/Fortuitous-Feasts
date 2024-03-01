package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DFFBlockstateProvider extends BlockStateProvider {
    public DFFBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DFFeastsMain.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

        
    }

}
