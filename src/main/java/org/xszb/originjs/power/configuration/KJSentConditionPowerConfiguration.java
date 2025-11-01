package org.xszb.originjs.power.configuration;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;


public record KJSentConditionPowerConfiguration(
        String key
) implements IDynamicFeatureConfiguration {

    public static final Codec<KJSentConditionPowerConfiguration> CODEC =
            RecordCodecBuilder.create((instance) ->
                    instance.group(
                            Codec.STRING
                                    .fieldOf("key")
                                    .forGetter(KJSentConditionPowerConfiguration::key)
                    ).apply(instance, KJSentConditionPowerConfiguration::new)
            );

}