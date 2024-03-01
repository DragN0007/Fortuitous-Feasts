package com.dragn0007.dffeasts.block.pixel_placement.util;

import com.dragn0007.dffeasts.block.DFFBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PixelPlacerEntity extends BlockEntity {

    public final List<PixelPlacerData> pixelPlacerData = new ArrayList<>();

    public PixelPlacerEntity(BlockPos pos, BlockState state) {
        super(DFFBlocks.PIXEL_PLACER_ENTITY.get(), pos, state);
    }

    public void addPixelPlacer(Vec3 pos, Direction dir, PixelPlacer pixelPlacer) {
        pixelPlacerData.add(new PixelPlacerData(pos, dir, pixelPlacer));
        this.setChanged();
        this.level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
    }

    public boolean removePixelPlacer(PixelPlacerData data) {
        pixelPlacerData.remove(data);
        this.setChanged();
        this.level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
        return pixelPlacerData.size() == 0;
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        ListTag listTag = new ListTag();
        pixelPlacerData.forEach(d -> listTag.add(PixelPlacerData.pack(d)));
        tag.put("PixelPlacerData", listTag);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        ListTag decorTag = (ListTag) tag.get("PixelPlacerData");
        decorTag.forEach(t -> pixelPlacerData.add(PixelPlacerData.unpack((CompoundTag) t)));
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return this.saveWithoutMetadata();
    }
}
