package org.lolzdev.steelworks.client.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import org.lolzdev.steelworks.Utils;
import org.lolzdev.steelworks.client.entities.SteamLocomotiveEntityRenderState;

public class SteamLocomotiveModel extends EntityModel<SteamLocomotiveEntityRenderState> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Utils.identifier("steam_locomotive"), "main");
	public final ModelPart main;

	public SteamLocomotiveModel(ModelPart root) {
        super(root);
        this.main = root.getChild("main");
	}

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bb_main = modelPartData.addChild("main", ModelPartBuilder.create().uv(-21, -14).cuboid(-8.0F, 0.0F, -8.0F, 16.0F, 2.0F, 16.0F, new Dilation(0.0F))
                .uv(-12, -12).cuboid(-1.0F, 2.0F, -8.0F, 2.0F, 5.0F, 14.0F, new Dilation(0.0F))
                .uv(-7, 0).cuboid(-8.0F, 2.0F, 6.0F, 16.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }


}