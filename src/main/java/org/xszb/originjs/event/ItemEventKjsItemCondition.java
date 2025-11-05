package org.xszb.originjs.event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.xszb.originjs.event.KJSevent.KJSitemConditionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class ItemEventKjsItemCondition extends OriginEventJS {
    private KJSitemConditionEvent event;

    public ItemEventKjsItemCondition(KJSitemConditionEvent event) {
        this.event = event;
    }

    public ItemStack getItem() {
        return this.event.getItem();
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

    public Level getLevel() { return event.getLevel();}
}