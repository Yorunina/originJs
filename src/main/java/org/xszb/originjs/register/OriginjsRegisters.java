package org.xszb.originjs.register;

import io.github.edwinmindcraft.apoli.api.power.factory.*;
import io.github.edwinmindcraft.apoli.api.power.factory.EntityAction;
import io.github.edwinmindcraft.apoli.api.power.factory.EntityCondition;
import io.github.edwinmindcraft.apoli.api.registry.ApoliRegistries;
import io.github.edwinmindcraft.apoli.common.power.DummyPower;
import io.github.edwinmindcraft.apoli.common.registry.ApoliRegisters;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.xszb.originjs.Originjs;

public class OriginjsRegisters {

    public static final DeferredRegister<EntityCondition<?>> ENTITY_CONDITIONS;
    public static final DeferredRegister<ItemCondition<?>> ITEM_CONDITIONS;
    public static final DeferredRegister<BlockCondition<?>> BLOCK_CONDITIONS;
    public static final DeferredRegister<BiomeCondition<?>> BIOME_CONDITIONS;
    public static final DeferredRegister<EntityAction<?>> ENTITY_ACTIONS;
    public static final DeferredRegister<ItemAction<?>> ITEM_ACTIONS;
    public static final DeferredRegister<BlockAction<?>> BLOCK_ACTIONS;
    public static final DeferredRegister<BiEntityCondition<?>> BIENTITY_CONDITIONS;
    public static final DeferredRegister<BiEntityAction<?>> BIENTITY_ACTIONS;

    public static final RegistryObject<DummyPower> NO_NEED_FOOD = ApoliRegisters.POWER_FACTORIES.register("no_need_food", DummyPower::new);
    public static final RegistryObject<DummyPower> NO_NEED_AIR = ApoliRegisters.POWER_FACTORIES.register("no_need_air", DummyPower::new);
    public static final RegistryObject<DummyPower> UNDEAD_MOB_TYPE = ApoliRegisters.POWER_FACTORIES.register("undead_mob_type", DummyPower::new);

    public static void initialize(IEventBus bus) {
        ENTITY_CONDITIONS.register(bus);
        ITEM_CONDITIONS.register(bus);
        BLOCK_CONDITIONS.register(bus);
        BIOME_CONDITIONS.register(bus);
        ENTITY_ACTIONS.register(bus);
        ITEM_ACTIONS.register(bus);
        BLOCK_ACTIONS.register(bus);
        BIENTITY_CONDITIONS.register(bus);
        BIENTITY_ACTIONS.register(bus);

        org.xszb.originjs.register.EntityAction.bootstrap();
        org.xszb.originjs.register.EntityCondition.bootstrap();
    }
    static {
        ENTITY_CONDITIONS = DeferredRegister.create(ApoliRegistries.ENTITY_CONDITION_KEY.location(), Originjs.MODID);
        ITEM_CONDITIONS = DeferredRegister.create(ApoliRegistries.ITEM_CONDITION_KEY.location(), Originjs.MODID);
        BLOCK_CONDITIONS = DeferredRegister.create(ApoliRegistries.BLOCK_CONDITION_KEY.location(), Originjs.MODID);
        BIOME_CONDITIONS = DeferredRegister.create(ApoliRegistries.BIOME_CONDITION_KEY.location(), Originjs.MODID);
        ENTITY_ACTIONS = DeferredRegister.create(ApoliRegistries.ENTITY_ACTION_KEY.location(), Originjs.MODID);
        ITEM_ACTIONS = DeferredRegister.create(ApoliRegistries.ITEM_ACTION_KEY.location(), Originjs.MODID);
        BLOCK_ACTIONS = DeferredRegister.create(ApoliRegistries.BLOCK_ACTION_KEY.location(), Originjs.MODID);
        BIENTITY_CONDITIONS = DeferredRegister.create(ApoliRegistries.BIENTITY_CONDITION_KEY.location(), Originjs.MODID);
        BIENTITY_ACTIONS = DeferredRegister.create(ApoliRegistries.BIENTITY_ACTION_KEY.location(), Originjs.MODID);
    }
}
