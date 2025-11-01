package org.xszb.originjs.event.KJSevent;

import net.minecraft.world.entity.Entity;
import net.minecraftforge.eventbus.api.Event;
import org.xszb.originjs.power.configuration.KJSEntityActionEventConfiguration;

public class KJSEntityActionEvent extends Event {
    private final Entity entity;
    private final String key;

    public KJSEntityActionEvent(Entity entity, KJSEntityActionEventConfiguration configuration) {
        this.entity = entity;
        this.key = configuration.key();
    }

    // Getters
    public Entity getEntity() {
        return entity;
    }

    public String getKey() {
        return key;
    }

}