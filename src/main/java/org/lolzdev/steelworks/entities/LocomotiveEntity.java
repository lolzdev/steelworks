package org.lolzdev.steelworks.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.lolzdev.steelworks.vehicles.VehicleDirection;

public class LocomotiveEntity extends VehicleEntity {
    protected Vec3d pushVec = Vec3d.ZERO;
    protected double speed = 0.0;
    protected VehicleDirection direction = VehicleDirection.FORWARD;

    public LocomotiveEntity(EntityType<? extends LocomotiveEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean isSelfPropelling() {
        return true;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        Vec3d pushVec = new Vec3d(speed, 0.0, speed);
        this.pushVec = this.direction == VehicleDirection.FORWARD ? pushVec : pushVec.negate();
    }

    public void setDirection(VehicleDirection direction) {
        this.direction = direction;
        setSpeed(this.speed);
    }

    @Override
    protected Vec3d applySlowdown(Vec3d velocity) {
        Vec3d vec3d;
        if (this.pushVec.lengthSquared() > 1.0E-7) {
            this.pushVec = this.pushVec.horizontalLengthSquared() > 1.0E-4 && velocity.horizontalLengthSquared() > 0.001 ? this.pushVec.projectOnto(velocity).normalize().multiply(this.pushVec.length()) : this.pushVec;
            vec3d = velocity.multiply(0.8, 0.0F, 0.8).add(this.pushVec);
        } else {
            vec3d = velocity.multiply(0.98, 0.0F, 0.98);
        }

        return super.applySlowdown(vec3d);
    }

    @Override
    public void tick() {
        super.tick();

        this.getEntityWorld().addParticleClient(ParticleTypes.LARGE_SMOKE, this.getX(), this.getY() + 0.8, this.getZ(), (double)0.0F, (double)0.0F, (double)0.0F);
    }

    @Override
    public ActionResult interact(PlayerEntity player, Hand hand) {
        if (player.isHolding(Items.STICK)) {
            this.setSpeed(0.05);
        } else
        if (player.isHolding(Items.STONE_SHOVEL)) {
            this.setDirection(this.direction.getOpposite());
        }
        return ActionResult.SUCCESS;
    }
}
