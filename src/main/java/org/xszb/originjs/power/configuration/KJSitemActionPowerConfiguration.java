package org.xszb.originjs.power.configuration;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;


public record KJSitemActionPowerConfiguration(
        String key
) implements IDynamicFeatureConfiguration {

    public static final Codec<KJSitemActionPowerConfiguration> CODEC =
            RecordCodecBuilder.create((instance) ->
                    instance.group(
                            Codec.STRING
                                    .fieldOf("key")
                                    .forGetter(KJSitemActionPowerConfiguration::key)
                    ).apply(instance, KJSitemActionPowerConfiguration::new)
            );

}