package org.xszb.originjs.event.KJSevent;

import net.minecraft.world.entity.Entity;
import net.minecraftforge.eventbus.api.Event;
import org.xszb.originjs.power.configuration.KJSBientConditionConfiguration;

public class KJSBiEntityConditionEvent extends Event {
    private final Entity entity;
    private final Entity target;
    private final String key;
    public boolean checkresult;

    public KJSBiEntityConditionEvent(Entity entity,Entity target, KJSBientConditionConfiguration configuration) {
        this.entity = entity;
        this.target = target;
        this.key = configuration.key();
        this.checkresult = false;
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

    public void setCheckResult(boolean result) {
        this.checkresult = result;
    }

    public boolean getCheckResult() {
        return this.checkresult;
    }
}