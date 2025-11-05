package org.xszb.originjs.mixin;

import io.github.edwinmindcraft.apoli.api.component.IPowerContainer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static org.xszb.originjs.register.OriginjsRegisters.NO_NEED_FOOD;

@Mixin(FoodData.class)
public abstract class FoodDataMixin {
    @Shadow
    private int foodLevel;
    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void playerHook(Player player, CallbackInfo ci) {
        if (IPowerContainer.hasPower(player, NO_NEED_FOOD.get())) {
            if (this.foodLevel < 20) {
                this.foodLevel = 20;
            }
            ci.cancel();
        }
    }

}
