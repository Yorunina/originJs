package org.xszb.originjs.event.KJSevent;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.Event;
import org.xszb.originjs.power.configuration.KJSblockActionPowerConfiguration;

public class KJSblockActionEvent extends Event {
    private final Level level;
    private final BlockPos blockPos;
    private final Direction direction;
    private final String key;
    public KJSblockActionEvent(BlockPos pos, Direction direction, Level level, KJSblockActionPowerConfiguration configuration) {
        this.blockPos = pos;
        this.direction = direction;
        this.level = level;
        this.key = configuration.key();
    }

    public Level getLevel() {
        return level;
    }

    public BlockPos getBlockPos() {return blockPos;}

    public Direction getDirection() {return direction;}

    public String getKey() {
        return key;
    }
}