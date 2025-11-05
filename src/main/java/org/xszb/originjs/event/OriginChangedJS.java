package org.xszb.originjs.event;

import dev.latvian.mods.kubejs.player.PlayerEventJS;
import io.github.edwinmindcraft.origins.api.origin.Origin;
import io.github.edwinmindcraft.origins.api.origin.OriginLayer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class OriginChangedJS extends PlayerEventJS {

    public final Level level;
    public final ServerPlayer entity;
    public final Player player;
    public final ResourceKey<OriginLayer> layer;
    public final ResourceKey<Origin> origin;


    public OriginChangedJS(ServerPlayer player, @NotNull ResourceKey<OriginLayer> layer, @NotNull ResourceKey<Origin> origin) {
        super();
        this.level = player.level();
        this.entity = player;
        this.player = player;
        this.layer = layer;
        this.origin = origin;
    }


    @Override
    public Level getLevel() {return this.level;}
    @Override
    public ServerPlayer getEntity() {
        return this.entity;
    }
    @Override
    public Player getPlayer() {
        return this.player;
    }
    public ResourceKey<OriginLayer> getOriginLayer() {
        return this.layer;
    }
    public ResourceKey<Origin> getOrigin() {
        return this.origin;
    }
}
