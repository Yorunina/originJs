package org.xszb.originjs.power.configuration;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;


public record KJSblockActionPowerConfiguration(
        String key
) implements IDynamicFeatureConfiguration {

    public static final Codec<KJSblockActionPowerConfiguration> CODEC =
            RecordCodecBuilder.create((instance) ->
                    instance.group(
                            Codec.STRING
                                    .fieldOf("key")
                                    .forGetter(KJSblockActionPowerConfiguration::key)
                    ).apply(instance, KJSblockActionPowerConfiguration::new)
            );

}