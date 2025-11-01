package org.xszb.originjs.power.action;

import io.github.edwinmindcraft.apoli.api.power.factory.BlockAction;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import org.xszb.originjs.event.KJSevent.KJSblockActionEvent;
import org.xszb.originjs.power.configuration.KJSblockActionPowerConfiguration;

public class KJSblockActionPower extends BlockAction<KJSblockActionPowerConfiguration> {
    public KJSblockActionPower() {
        super(KJSblockActionPowerConfiguration.CODEC);
    }

    public void execute(KJSblockActionPowerConfiguration configuration, Level level, BlockPos pos, Direction direction) {

        KJSblockActionEvent event = new KJSblockActionEvent(
                pos,
                direction,
                level,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);

    }
}
