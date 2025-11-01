package org.xszb.originjs.event;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.NonNullSupplier;
import org.xszb.originjs.event.KJSevent.KJSblockConditionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class BlockEventKjsBlockCondition extends OriginEventJS {
    private KJSblockConditionEvent event;

    public BlockEventKjsBlockCondition(KJSblockConditionEvent event) {
        this.event = event;
    }

    public BlockPos getBlockPos() {
        return this.event.getBlockPos();
    }

    public Object getKey() {
        return this.event.getKey();
    }

    public Object hasResult() {
        return this.event.getCheckResult();
    }

    public void setResult(boolean result) {
        this.event.setCheckResult(result);
        this.event.setCanceled(true);
    }

    public LevelReader getLevelReader() {
        return this.event.getLevelReader();
    }

    public NonNullSupplier<BlockState> getBlockState() {
        return this.event.getBlockState();
    }
}