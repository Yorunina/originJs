package org.xszb.originjs.event.KJSevent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.Event;
import org.xszb.originjs.power.configuration.KJSitemConditionPowerConfiguration;

public class KJSitemConditionEvent extends Event {
    private final ItemStack item;
    private final Level level;
    private final String key;
    public boolean checkresult;

    public KJSitemConditionEvent(ItemStack item, Level level, KJSitemConditionPowerConfiguration configuration) {
        this.item = item;
        this.level = level;
        this.key = configuration.key();
        this.checkresult = false;
    }

    public Level getLevel() {
        return level;
    }

    public ItemStack getItem() {
        return item;
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