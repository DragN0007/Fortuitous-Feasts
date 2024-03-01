package com.dragn0007.dffeasts.block.pixel_placement.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class PixelPlacerContainer extends Block implements EntityBlock {

    private static final Material MATERIAL = new Material(MaterialColor.NONE, false, false, false, false, false, false, PushReaction.DESTROY);


    public PixelPlacerContainer() {
        super(Properties.of(MATERIAL));
    }

    private PixelPlacerData getClosestPixelPlacer(Entity entity, PixelPlacerEntity decorContainer) {
        Vec3 from = entity.getEyePosition();
        Vec3 rot = entity.getViewVector(1f).scale(8d);
        Vec3 to = from.add(rot);

        for(PixelPlacerData data : decorContainer.pixelPlacerData) {
            VoxelShape shape = data.pixelPlacer.getVoxelShape(data.dir).move(data.pos.x, data.pos.y, data.pos.z);
            BlockHitResult blockHitResult = shape.clip(from, to, decorContainer.getBlockPos());
            if(blockHitResult != null && blockHitResult.getType() != HitResult.Type.MISS) {
                return data;
            }
        }
        return null;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        if(context instanceof EntityCollisionContext) {
            Entity entity = ((EntityCollisionContext) context).getEntity();
            BlockEntity blockEntity = blockGetter.getBlockEntity(pos);

            if(entity != null  && blockEntity instanceof PixelPlacerEntity) {
                PixelPlacerData data = getClosestPixelPlacer(entity, (PixelPlacerEntity) blockEntity);
                if(data != null) {
                    return data.pixelPlacer.getVoxelShape(data.dir).move(data.pos.x, data.pos.y, data.pos.z);
                }
            }
        }
        return Shapes.empty();
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if(blockEntity instanceof PixelPlacerEntity pixelPlacerEntity) {
            PixelPlacerData data = getClosestPixelPlacer(player, pixelPlacerEntity);
            if(data != null) {
                if(!level.isClientSide) {
                    if(!player.getAbilities().instabuild) {
                        level.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(data.pixelPlacer.asItem())));
                    }

                    if(!pixelPlacerEntity.removePixelPlacer(data)) {
                        return false;
                    }

                    level.removeBlockEntity(pos);
                }
                return super.onDestroyedByPlayer(data.pixelPlacer.defaultBlockState(), level, pos, player, willHarvest, fluid);
            }
        }
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PixelPlacerEntity(pos, state);
    }
}
