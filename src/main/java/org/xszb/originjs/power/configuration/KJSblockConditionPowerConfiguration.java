package org.xszb.originjs.power.configuration;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.edwinmindcraft.apoli.api.IDynamicFeatureConfiguration;


public record KJSblockConditionPowerConfiguration(
        String key
) implements IDynamicFeatureConfiguration {

    public static final Codec<KJSblockConditionPowerConfiguration> CODEC =
            RecordCodecBuilder.create((instance) ->
                    instance.group(
                            Codec.STRING
                                    .fieldOf("key")
                                    .forGetter(KJSblockConditionPowerConfiguration::key)
                    ).apply(instance, KJSblockConditionPowerConfiguration::new)
            );

}