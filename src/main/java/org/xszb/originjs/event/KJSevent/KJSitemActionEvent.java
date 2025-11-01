package org.xszb.originjs.event.KJSevent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.Event;
import org.apache.commons.lang3.mutable.Mutable;
import org.xszb.originjs.power.configuration.KJSitemActionPowerConfiguration;

public class KJSitemActionEvent extends Event {
    private final Mutable<ItemStack> items;
    private final Level level;
    private final String key;
    public KJSitemActionEvent(Mutable<ItemStack> item, Level level, KJSitemActionPowerConfiguration configuration) {
        this.items = item;
        this.level = level;
        this.key = configuration.key();
    }

    public Level getLevel() {
        return level;
    }

    public Mutable<ItemStack> getItems() {
        return items;
    }

    public String getKey() {
        return key;
    }
}