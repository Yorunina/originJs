package org.xszb.originjs.power.condition;

import io.github.edwinmindcraft.apoli.api.power.factory.EntityCondition;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import org.xszb.originjs.event.KJSevent.KJSEntityConditionEvent;
import org.xszb.originjs.power.configuration.KJSentConditionPowerConfiguration;

public class KJSentConditionPower extends EntityCondition<KJSentConditionPowerConfiguration> {
    public KJSentConditionPower() {
        super(KJSentConditionPowerConfiguration.CODEC);
    }
    public boolean check(KJSentConditionPowerConfiguration configuration, Entity entity) {

        KJSEntityConditionEvent event = new KJSEntityConditionEvent(
                entity,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);

        return event.getCheckResult();
    }
}
