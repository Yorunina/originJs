package org.xszb.originjs.power.action;

import io.github.edwinmindcraft.apoli.api.power.factory.BiEntityAction;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import org.xszb.originjs.event.KJSevent.KJSBiEntityActionEvent;
import org.xszb.originjs.power.configuration.KJSBiEntityActionEventConfiguration;

public class KJSBientActionPower extends BiEntityAction<KJSBiEntityActionEventConfiguration> {
    public KJSBientActionPower() {
        super(KJSBiEntityActionEventConfiguration.CODEC);
    }

    public void execute(KJSBiEntityActionEventConfiguration configuration, Entity entity,Entity target) {

        KJSBiEntityActionEvent event = new KJSBiEntityActionEvent(
                entity,
                target,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);

    }
}
