package org.xszb.originjs.power.condition;

import io.github.edwinmindcraft.apoli.api.power.factory.BlockCondition;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.NonNullSupplier;
import org.xszb.originjs.event.KJSevent.KJSblockConditionEvent;
import org.xszb.originjs.power.configuration.KJSblockConditionPowerConfiguration;


public class KJSblockConditionPower extends BlockCondition<KJSblockConditionPowerConfiguration> {
    public KJSblockConditionPower() {
        super(KJSblockConditionPowerConfiguration.CODEC);
    }
    public boolean check(KJSblockConditionPowerConfiguration configuration, LevelReader reader, BlockPos position, NonNullSupplier<BlockState> stateGetter) {

        KJSblockConditionEvent event = new KJSblockConditionEvent(
                position,
                reader,
                stateGetter,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);


        return event.getCheckResult();
    }
}
