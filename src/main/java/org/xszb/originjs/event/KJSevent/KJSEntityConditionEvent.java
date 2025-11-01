package org.xszb.originjs.event.KJSevent;

import net.minecraft.world.entity.Entity;
import net.minecraftforge.eventbus.api.Event;
import org.xszb.originjs.power.configuration.KJSentConditionPowerConfiguration;

public class KJSEntityConditionEvent extends Event {
    private final Entity entity;
    private final String key;
    public boolean checkresult;

    public KJSEntityConditionEvent(Entity entity, KJSentConditionPowerConfiguration configuration) {
        this.entity = entity;
        this.key = configuration.key();
        this.checkresult = false;
    }

    // Getters
    public Entity getEntity() {
        return entity;
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