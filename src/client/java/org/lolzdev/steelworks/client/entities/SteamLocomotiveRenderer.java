package org.lolzdev.steelworks.client.entities;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.command.ModelCommandRenderer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.lolzdev.steelworks.Utils;
import org.lolzdev.steelworks.client.models.SteamLocomotiveModel;
import org.lolzdev.steelworks.entities.SteamLocomotiveEntity;

public class SteamLocomotiveRenderer extends EntityRenderer<SteamLocomotiveEntity, SteamLocomotiveEntityRenderState> {
    private final SteamLocomotiveModel model;

    public SteamLocomotiveRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new SteamLocomotiveModel(context.getPart(SteamLocomotiveModel.MODEL_LAYER));
    }

    @Override
    public SteamLocomotiveEntityRenderState createRenderState() {
        return new SteamLocomotiveEntityRenderState();
    }

    @Override
    public void render(SteamLocomotiveEntityRenderState renderState, MatrixStack matrices, OrderedRenderCommandQueue queue, CameraRenderState cameraState) {
        super.render(renderState, matrices, queue, cameraState);
        matrices.push();
        queue.submitModel(this.model, renderState, matrices, this.model.getLayer(Utils.identifier("steam_locomotive")), renderState.light, OverlayTexture.DEFAULT_UV, renderState.outlineColor, null);
        matrices.pop();
    }
}
