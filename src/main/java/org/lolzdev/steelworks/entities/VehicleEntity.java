package org.lolzdev.steelworks.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VehicleEntity extends AbstractMinecartEntity {
    public VehicleEntity(EntityType<? extends VehicleEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
    }

    @Override
    protected Item asItem() {
        return null;
    }

    @Override
    public boolean damage(ServerWorld world, DamageSource source, float amount) {
        return false;
    }

    @Override
    protected void readCustomData(ReadView view) {
        super.readCustomData(view);
    }

    @Override
    protected void writeCustomData(WriteView view) {
        super.writeCustomData(view);
    }

    @Override
    public ItemStack getPickBlockStack() {
        return null;
    }

    @Override
    public boolean isCollidable(@Nullable Entity entity) {
        return true;
    }

    @Override
    public void tick() {
        super.tick();
    }


}
