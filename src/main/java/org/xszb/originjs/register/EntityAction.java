package org.xszb.originjs.register;

import net.minecraftforge.registries.RegistryObject;
import org.xszb.originjs.power.action.KJSBientActionPower;
import org.xszb.originjs.power.action.KJSblockActionPower;
import org.xszb.originjs.power.action.KJSentActionPower;
import org.xszb.originjs.power.action.KJSitemActionPower;

public class EntityAction {
    public static final RegistryObject<KJSentActionPower> KJS_ENTITY_ACTION =
            OriginjsRegisters.ENTITY_ACTIONS.register(
                    "kjs_entity_action",
                    KJSentActionPower::new
            );

    public static final RegistryObject<KJSBientActionPower> KJS_BiENTITY_ACTION =
            OriginjsRegisters.BIENTITY_ACTIONS.register(
                    "kjs_bientity_action",
                    KJSBientActionPower::new
            );

    public static final RegistryObject<KJSitemActionPower> KJS_ITEM_ACTION =
            OriginjsRegisters.ITEM_ACTIONS.register(
                    "kjs_item_action",
                    KJSitemActionPower::new
            );

    public static final RegistryObject<KJSblockActionPower> KJS_BLOCK_ACTION =
            OriginjsRegisters.BLOCK_ACTIONS.register(
                    "kjs_block_action",
                    KJSblockActionPower::new
            );

    public static void bootstrap() {

    }
}
