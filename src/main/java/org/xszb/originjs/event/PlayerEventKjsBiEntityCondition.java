package org.xszb.originjs.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.xszb.originjs.event.KJSevent.KJSBiEntityConditionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class PlayerEventKjsBiEntityCondition extends OriginEventJS {
    private KJSBiEntityConditionEvent event;

    public PlayerEventKjsBiEntityCondition(KJSBiEntityConditionEvent event) {
        this.event = event;
    }

    public Entity getEntity() {
        return this.event.getEntity();
    }

    public Entity getTarget() {
        return this.event.getTarget();
    }

    public Object getKey() {
        return this.event.getKey();
    }

    public Object hasResult() {
        return this.event.getCheckResult();
    }

    public void setResult(boolean result) {
        this.event.setCheckResult(result);
        this.event.setCanceled(true);
    }

    public Level getLevel() { return event.getEntity().level();}
}