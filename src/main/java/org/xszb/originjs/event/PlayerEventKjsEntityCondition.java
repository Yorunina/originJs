package org.xszb.originjs.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.xszb.originjs.event.KJSevent.KJSEntityConditionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class PlayerEventKjsEntityCondition extends OriginEventJS {
    private KJSEntityConditionEvent event;

    public PlayerEventKjsEntityCondition(KJSEntityConditionEvent event) {
        this.event = event;
    }

    public Entity getEntity() {
        return this.event.getEntity();
    }

    public Object getKey() {
        return this.event.getKey();
    }

    public Object hasResult() {
        return this.event.getCheckResult();
    }

    public void setResult(boolean result) {
        this.event.setCheckResult(result);
    }

    public Level getLevel() { return event.getEntity().level();}
}