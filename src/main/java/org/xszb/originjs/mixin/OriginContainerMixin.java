package org.xszb.originjs.mixin;

import io.github.edwinmindcraft.origins.api.origin.Origin;
import io.github.edwinmindcraft.origins.api.origin.OriginLayer;
import io.github.edwinmindcraft.origins.common.capabilities.OriginContainer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.xszb.originjs.event.OriginChangedJS;
import org.xszb.originjs.event.OriginJsEvent;

@Mixin(OriginContainer.class)
public abstract class OriginContainerMixin {

    @Shadow
    @Final
    private Player player;

    @Inject(at = {@At(
            value = "INVOKE",
            target = "Lio/github/apace100/origins/util/ChoseOriginCriterion;trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/resources/ResourceKey;)V")},
            method = {"setOriginInternal"},
            remap = false)
    public void SetOriginInternalMixin(@NotNull ResourceKey<OriginLayer> layer, @NotNull ResourceKey<Origin> origin, boolean handlePowers, CallbackInfo ci) {
        OriginJsEvent.OriginChanged.post(new OriginChangedJS((ServerPlayer) this.player, layer, origin));
    }
}
