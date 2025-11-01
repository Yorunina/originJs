package org.xszb.originjs.power.condition;

import io.github.edwinmindcraft.apoli.api.power.factory.BiEntityCondition;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import org.xszb.originjs.event.KJSevent.KJSBiEntityConditionEvent;
import org.xszb.originjs.power.configuration.KJSBientConditionConfiguration;

public class KJSBientConditionPower extends BiEntityCondition<KJSBientConditionConfiguration> {
    public KJSBientConditionPower() {
        super(KJSBientConditionConfiguration.CODEC);
    }
    public boolean check(KJSBientConditionConfiguration configuration, Entity entity ,Entity target) {

        KJSBiEntityConditionEvent event = new KJSBiEntityConditionEvent(
                entity,
                target,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);


        return event.getCheckResult();
    }
}
