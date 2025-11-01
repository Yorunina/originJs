package org.xszb.originjs.event;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import org.xszb.originjs.event.KJSevent.KJSblockActionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class BlockEventKjsBlockAction extends OriginEventJS {
    private KJSblockActionEvent event;

    public BlockEventKjsBlockAction(KJSblockActionEvent event) {
        this.event = event;
    }

    public BlockPos getBlockPos() {
        return this.event.getBlockPos();
    }

    public Object getKey() {
        return this.event.getKey();
    }

    public LevelReader getLevel() {
        return this.event.getLevel();
    }

    public Direction getDirection() { return this.event.getDirection(); }
}