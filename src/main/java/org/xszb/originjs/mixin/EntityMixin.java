package org.xszb.originjs.mixin;

import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.xszb.originjs.origins.KubeJSOriginHelper;

@Mixin({Entity.class})
public class EntityMixin implements KubeJSOriginHelper {}
