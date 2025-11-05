package org.xszb.originjs.mixin;

import io.github.edwinmindcraft.apoli.api.component.IPowerContainer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static org.xszb.originjs.register.OriginjsRegisters.UNDEAD_MOB_TYPE;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    public LivingEntityMixin(EntityType<?> type, Level world) {
        super(type, world);
    }

    @Inject(method = "getMobType()Lnet/minecraft/world/entity/MobType;", at = @At("HEAD"), cancellable = true)
    public void getMobType(CallbackInfoReturnable<MobType> cir) {
        if (IPowerContainer.hasPower(this, UNDEAD_MOB_TYPE.get())) {
            cir.setReturnValue(MobType.UNDEAD);
        }
    }
}
