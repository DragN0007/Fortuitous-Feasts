package com.dragn0007.dffeasts.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class AgeableCheeseBlock extends AgeableCheeseBase {
        public static final int MAX_AGE = 15;
        public static final IntegerProperty AGE = BlockStateProperties.AGE_15;
//    private static final VoxelShape[] SHAPE = new VoxelShape[]{Block.box(1, 0, 2, 14, 5, 14)};
//    public VoxelShape getShape(BlockState p_52297_, BlockGetter p_52298_, BlockPos p_52299_, CollisionContext p_52300_) {
//        return SHAPE[p_52297_.getValue(this.getAgeProperty())];
//    }

        public AgeableCheeseBlock(BlockBehaviour.Properties p_52247_) {
            super(p_52247_);
            this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), Integer.valueOf(0)));
        }

        public IntegerProperty getAgeProperty() {
            return AGE;
        }

        public int getMaxAge() {
            return 15;
        }

        protected int getAge(BlockState p_52306_) {
            return p_52306_.getValue(this.getAgeProperty());
        }

        public BlockState getStateForAge(int p_52290_) {
            return this.defaultBlockState().setValue(this.getAgeProperty(), Integer.valueOf(p_52290_));
        }

        public boolean isMaxAge(BlockState p_52308_) {
            return p_52308_.getValue(this.getAgeProperty()) >= this.getMaxAge();
        }

        public boolean isRandomlyTicking(BlockState p_52288_) {
            return !this.isMaxAge(p_52288_);
        }

        public void randomTick(BlockState p_52292_, ServerLevel p_52293_, BlockPos p_52294_, Random p_52295_) {
            if (!p_52293_.isAreaLoaded(p_52294_, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
            if (p_52293_.getRawBrightness(p_52294_, 0) >= 9) {
                int i = this.getAge(p_52292_);
                if (i < this.getMaxAge()) {
                    float f = getGrowthSpeed(this, p_52293_, p_52294_);
                    if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(p_52293_, p_52294_, p_52292_, p_52295_.nextInt((int)(25.0F / f) + 1) == 0)) {
                        p_52293_.setBlock(p_52294_, this.getStateForAge(i + 1), 2);
                        net.minecraftforge.common.ForgeHooks.onCropsGrowPost(p_52293_, p_52294_, p_52292_);
                    }
                }
            }

        }

        public void ageCheese(Level p_52264_, BlockPos p_52265_, BlockState p_52266_) {
            int i = this.getAge(p_52266_);
            int j = this.getMaxAge();
            if (i > j) {
                i = j;
            }

            p_52264_.setBlock(p_52265_, this.getStateForAge(i), 2);
        }

        protected static float getGrowthSpeed(Block p_52273_, BlockGetter p_52274_, BlockPos p_52275_) {
            float f = 1.0F;
            BlockPos blockpos = p_52275_.below();

            for(int i = -1; i <= 1; ++i) {
                for(int j = -1; j <= 1; ++j) {
                    float f1 = 0.0F;
                    BlockState blockstate = p_52274_.getBlockState(blockpos.offset(i, 0, j));
                    if (blockstate.canSustainPlant(p_52274_, blockpos.offset(i, 0, j), net.minecraft.core.Direction.UP, (net.minecraftforge.common.IPlantable) p_52273_)) {
                        f1 = 1.0F;
                        if (blockstate.isFertile(p_52274_, p_52275_.offset(i, 0, j))) {
                            f1 = 3.0F;
                        }
                    }

                    if (i != 0 || j != 0) {
                        f1 /= 4.0F;
                    }

                    f += f1;
                }
            }

            BlockPos blockpos1 = p_52275_.north();
            BlockPos blockpos2 = p_52275_.south();
            BlockPos blockpos3 = p_52275_.west();
            BlockPos blockpos4 = p_52275_.east();
            boolean flag = p_52274_.getBlockState(blockpos3).is(p_52273_) || p_52274_.getBlockState(blockpos4).is(p_52273_);
            boolean flag1 = p_52274_.getBlockState(blockpos1).is(p_52273_) || p_52274_.getBlockState(blockpos2).is(p_52273_);
            if (flag && flag1) {
                f /= 2.0F;
            } else {
                boolean flag2 = p_52274_.getBlockState(blockpos3.north()).is(p_52273_) || p_52274_.getBlockState(blockpos4.north()).is(p_52273_) || p_52274_.getBlockState(blockpos4.south()).is(p_52273_) || p_52274_.getBlockState(blockpos3.south()).is(p_52273_);
                if (flag2) {
                    f /= 2.0F;
                }
            }

            return f;
        }

        public boolean canSurvive(BlockState p_52282_, LevelReader p_52283_, BlockPos p_52284_) {
            return (p_52283_.getRawBrightness(p_52284_, 0) >= 8 || p_52283_.canSeeSky(p_52284_)) && super.canSurvive(p_52282_, p_52283_, p_52284_);
        }

        public void entityInside(BlockState p_52277_, Level p_52278_, BlockPos p_52279_, Entity p_52280_) {
            if (p_52280_ instanceof Ravager && net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(p_52278_, p_52280_)) {
                p_52278_.destroyBlock(p_52279_, true, p_52280_);
            }

            super.entityInside(p_52277_, p_52278_, p_52279_, p_52280_);
        }

        protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_52286_) {
            p_52286_.add(AGE);
        }
}
