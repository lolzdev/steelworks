package org.lolzdev.steelworks.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import org.lolzdev.steelworks.Utils;

public class Entities {
    public static final EntityType<SteamLocomotiveEntity> STEAM_LOCOMOTIVE_ENTITY_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Utils.identifier("steam_locomotive"),
            EntityType.Builder.create(SteamLocomotiveEntity::new, SpawnGroup.MISC)
                    .dimensions(1.0f, 0.6f)
                    .build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Utils.identifier("steam_locomotive")))
    );
}
