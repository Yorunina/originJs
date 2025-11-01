package org.xszb.originjs.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.xszb.originjs.event.KJSevent.KJSBiEntityActionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class PlayerEventKjsBiEntityAction extends OriginEventJS {
    private KJSBiEntityActionEvent event;

    public PlayerEventKjsBiEntityAction(KJSBiEntityActionEvent event) {
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

    public Level getLevel() { return event.getEntity().level();}
}