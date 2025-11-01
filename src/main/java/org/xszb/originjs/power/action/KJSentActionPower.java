package org.xszb.originjs.power.action;

import io.github.edwinmindcraft.apoli.api.power.factory.EntityAction;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import org.jetbrains.annotations.NotNull;
import org.xszb.originjs.event.KJSevent.KJSEntityActionEvent;
import org.xszb.originjs.power.configuration.KJSEntityActionEventConfiguration;

public class KJSentActionPower extends EntityAction<KJSEntityActionEventConfiguration> {
    public KJSentActionPower() {
        super(KJSEntityActionEventConfiguration.CODEC);
    }

    public void execute(KJSEntityActionEventConfiguration configuration, @NotNull Entity entity) {

        KJSEntityActionEvent event = new KJSEntityActionEvent(
                entity,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);

    }
}
