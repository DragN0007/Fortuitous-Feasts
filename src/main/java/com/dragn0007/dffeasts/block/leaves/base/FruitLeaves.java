package com.dragn0007.dffeasts.block.leaves.base;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;

public class FruitLeaves extends Block implements net.minecraftforge.common.IPlantable {
    public FruitLeaves(Properties p_51021_) {
        super(p_51021_);
    }
    public BlockState updateShape(BlockState p_51032_, Direction p_51033_, BlockState p_51034_, LevelAccessor p_51035_, BlockPos p_51036_, BlockPos p_51037_) {
        return !p_51032_.canSurvive(p_51035_, p_51036_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_51032_, p_51033_, p_51034_, p_51035_, p_51036_, p_51037_);
    }
    public boolean propagatesSkylightDown(BlockState p_51039_, BlockGetter p_51040_, BlockPos p_51041_) {
        return p_51039_.getFluidState().isEmpty();
    }
    public boolean isPathfindable(BlockState p_51023_, BlockGetter p_51024_, BlockPos p_51025_, PathComputationType p_51026_) {
        return p_51026_ == PathComputationType.AIR && !this.hasCollision ? true : super.isPathfindable(p_51023_, p_51024_, p_51025_, p_51026_);
    }
    @Override
    public BlockState getPlant(BlockGetter world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return defaultBlockState();
        return state;
    }
}
