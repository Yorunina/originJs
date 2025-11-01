package org.xszb.originjs.power.condition;

import io.github.edwinmindcraft.apoli.api.power.factory.ItemCondition;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import org.xszb.originjs.event.KJSevent.KJSitemConditionEvent;
import org.xszb.originjs.power.configuration.KJSitemConditionPowerConfiguration;

import javax.annotation.Nullable;

public class KJSitemConditionPower extends ItemCondition<KJSitemConditionPowerConfiguration> {
    public KJSitemConditionPower() {
        super(KJSitemConditionPowerConfiguration.CODEC);
    }
    public boolean check(KJSitemConditionPowerConfiguration configuration, @Nullable Level level, ItemStack item) {

        KJSitemConditionEvent event = new KJSitemConditionEvent(
                item,
                level,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);


        return event.getCheckResult();
    }
}
