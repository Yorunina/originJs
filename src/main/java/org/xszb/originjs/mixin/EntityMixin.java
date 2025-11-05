package org.xszb.originjs.mixin;

import io.github.edwinmindcraft.apoli.api.component.IPowerContainer;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.xszb.originjs.origins.KubeJSOriginHelper;

import static org.xszb.originjs.register.OriginjsRegisters.NO_NEED_AIR;

@Mixin({Entity.class})
public abstract class EntityMixin implements KubeJSOriginHelper {
    @Shadow
    public abstract int getMaxAirSupply();

    @Shadow @Final
    protected SynchedEntityData entityData;

    @Shadow @Final private static EntityDataAccessor<Integer> DATA_AIR_SUPPLY_ID;


    @Inject(method = "setAirSupply", at = @At("HEAD"), cancellable = true)
    private void preventAirSupply(int air, CallbackInfo ci) {
        if (IPowerContainer.hasPower((Entity) (Object) this, NO_NEED_AIR.get())) {
            this.entityData.set(DATA_AIR_SUPPLY_ID, this.getMaxAirSupply());
            ci.cancel();
        }
    }
}
