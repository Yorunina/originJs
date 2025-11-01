package org.xszb.originjs.power.configuration;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;


public record KJSitemConditionPowerConfiguration(
        String key
) implements IDynamicFeatureConfiguration {

    public static final Codec<KJSitemConditionPowerConfiguration> CODEC =
            RecordCodecBuilder.create((instance) ->
                    instance.group(
                            Codec.STRING
                                    .fieldOf("key")
                                    .forGetter(KJSitemConditionPowerConfiguration::key)
                    ).apply(instance, KJSitemConditionPowerConfiguration::new)
            );

}