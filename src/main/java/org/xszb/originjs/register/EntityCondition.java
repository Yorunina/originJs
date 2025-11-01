package org.xszb.originjs.register;

import net.minecraftforge.registries.RegistryObject;
import org.xszb.originjs.power.condition.KJSBientConditionPower;
import org.xszb.originjs.power.condition.KJSblockConditionPower;
import org.xszb.originjs.power.condition.KJSentConditionPower;
import org.xszb.originjs.power.condition.KJSitemConditionPower;

public class EntityCondition {
    public static final RegistryObject<KJSentConditionPower> KJS_ENTITY_CONDITIONS =
            OriginjsRegisters.ENTITY_CONDITIONS.register(
                    "kjs_entity_condition",
                    KJSentConditionPower::new
            );
    public static final RegistryObject<KJSBientConditionPower> KJS_BIENTITY_CONDITIONS =
            OriginjsRegisters.BIENTITY_CONDITIONS.register(
                    "kjs_bientity_condition",
                    KJSBientConditionPower::new
            );

    public static final RegistryObject<KJSitemConditionPower> KJS_ITEM_CONDITIONS =
            OriginjsRegisters.ITEM_CONDITIONS.register(
                    "kjs_item_condition",
                    KJSitemConditionPower::new
            );

    public static final RegistryObject<KJSblockConditionPower> KJS_BLOCK_CONDITIONS =
            OriginjsRegisters.BLOCK_CONDITIONS.register(
                    "kjs_block_condition",
                    KJSblockConditionPower::new
            );
    public static void bootstrap() {

    }
}
