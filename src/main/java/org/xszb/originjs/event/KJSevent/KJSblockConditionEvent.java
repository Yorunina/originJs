package org.xszb.originjs.event.KJSevent;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.eventbus.api.Event;
import org.xszb.originjs.power.configuration.KJSblockConditionPowerConfiguration;

public class KJSblockConditionEvent extends Event {
    private final BlockPos blockpos;
    private final LevelReader levelreader;
    private final NonNullSupplier<BlockState> blockstate;
    private final String key;
    public boolean checkresult;

    public KJSblockConditionEvent(BlockPos position, LevelReader reader, NonNullSupplier<BlockState> stateGetter, KJSblockConditionPowerConfiguration configuration) {
        this.blockpos = position;
        this.levelreader = reader;
        this.blockstate = stateGetter;
        this.key = configuration.key();
        this.checkresult = false;
    }

    public BlockPos getBlockPos() { return blockpos;}

    public LevelReader getLevelReader() {
        return levelreader;
    }

    public NonNullSupplier<BlockState> getBlockState() {
        return blockstate;
    }

    public String getKey() {
        return key;
    }

    public void setCheckResult(boolean result) {
        this.checkresult = result;
    }

    public boolean getCheckResult() {
        return this.checkresult;
    }
}