package org.xszb.originjs.event.KJSevent;

import net.minecraft.world.entity.Entity;
import net.minecraftforge.eventbus.api.Event;
import org.xszb.originjs.power.configuration.KJSBiEntityActionEventConfiguration;

public class KJSBiEntityActionEvent extends Event {
    private final Entity entity;
    private final Entity target;
    private final String key;

    public KJSBiEntityActionEvent(Entity entity,Entity target, KJSBiEntityActionEventConfiguration configuration) {
        this.entity = entity;
        this.target = target;
        this.key = configuration.key();
    }

    // Getters
    public Entity getEntity() {
        return entity;
    }

    public Entity getTarget() {
        return target;
    }

    public String getKey() {
        return key;
    }

}