package org.xszb.originjs.event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.apache.commons.lang3.mutable.Mutable;
import org.xszb.originjs.event.KJSevent.KJSitemActionEvent;
import org.xszb.originjs.event.KJSevent.OriginEventJS;

public class ItemEventKjsItemAction extends OriginEventJS {
    private KJSitemActionEvent event;

    public ItemEventKjsItemAction(KJSitemActionEvent event) {
        this.event = event;
    }

    public Mutable<ItemStack> getItems() {
        return this.event.getItems();
    }

    public Object getKey() {
        return this.event.getKey();
    }

    public Level getLevel() { return event.getLevel();}
}