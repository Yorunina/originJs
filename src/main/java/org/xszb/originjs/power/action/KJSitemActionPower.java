package org.xszb.originjs.power.action;

import io.github.edwinmindcraft.apoli.api.power.factory.ItemAction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import org.apache.commons.lang3.mutable.Mutable;
import org.xszb.originjs.event.KJSevent.KJSitemActionEvent;
import org.xszb.originjs.power.configuration.KJSitemActionPowerConfiguration;

import javax.annotation.Nullable;

public class KJSitemActionPower extends ItemAction<KJSitemActionPowerConfiguration> {
    public KJSitemActionPower() {
        super(KJSitemActionPowerConfiguration.CODEC);
    }

    public void execute(KJSitemActionPowerConfiguration configuration, @Nullable Level level, Mutable<ItemStack> mutable) {

        KJSitemActionEvent event = new KJSitemActionEvent(
                mutable,
                level,
                configuration
        );

        MinecraftForge.EVENT_BUS.post(event);

    }
}
