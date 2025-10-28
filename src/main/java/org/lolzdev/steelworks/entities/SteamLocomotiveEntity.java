package org.lolzdev.steelworks.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class SteamLocomotiveEntity extends LocomotiveEntity {
    public SteamLocomotiveEntity(EntityType<? extends SteamLocomotiveEntity> entity, World world) {
        super(entity, world);
    }
}
