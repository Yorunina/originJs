package org.xszb.originjs.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.xszb.originjs.event.KJSevent.KJSEntityActionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class PlayerEventKjsEntityAction extends OriginEventJS {
    private KJSEntityActionEvent event;

    public PlayerEventKjsEntityAction(KJSEntityActionEvent event) {
        this.event = event;
    }

    public Entity getEntity() {
        return this.event.getEntity();
    }

    public Object getKey() {
        return this.event.getKey();
    }

    public Level getLevel() { return event.getEntity().level();}
}