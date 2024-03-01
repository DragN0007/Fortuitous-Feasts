package com.dragn0007.dffeasts.block.custom.decorvox;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class CropBag extends DecorRotatorCropBag {
    public CropBag() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(6, 5, 6, 10, 6, 10),
            Block.box(5, 0, 5, 11, 4, 11),
            Block.box(6.5, 4, 6.5, 9.5, 5, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(6, 5, 6, 10, 6, 10),
            Block.box(5, 0, 5, 11, 4, 11),
            Block.box(6.5, 4, 6.5, 9.5, 5, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(6, 5, 6, 10, 6, 10),
            Block.box(5, 0, 5, 11, 4, 11),
            Block.box(6.5, 4, 6.5, 9.5, 5, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(6, 5, 6, 10, 6, 10),
            Block.box(5, 0, 5, 11, 4, 11),
            Block.box(6.5, 4, 6.5, 9.5, 5, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
