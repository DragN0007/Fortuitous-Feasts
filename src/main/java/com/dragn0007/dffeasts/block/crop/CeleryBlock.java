package com.dragn0007.dffeasts.block.crop;

import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.item.DFFItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CeleryBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    public CeleryBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return DFFBlocks.CELERY_PLANT.get().defaultBlockState();
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return DFFItems.CELERY.get();
    }
}
