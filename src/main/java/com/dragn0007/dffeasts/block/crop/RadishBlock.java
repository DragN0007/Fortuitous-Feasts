package com.dragn0007.dffeasts.block.crop;

import com.dragn0007.dffeasts.item.DFFItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class RadishBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    public RadishBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return DFFItems.RADISH.get();
    }
}
