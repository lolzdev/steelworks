package org.lolzdev.steelworks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.EntityRendererFactories;
import org.lolzdev.steelworks.client.entities.SteamLocomotiveRenderer;
import org.lolzdev.steelworks.client.models.SteamLocomotiveModel;
import org.lolzdev.steelworks.entities.Entities;

public class SteelworksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererFactories.register(Entities.STEAM_LOCOMOTIVE_ENTITY_ENTITY, SteamLocomotiveRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(SteamLocomotiveModel.MODEL_LAYER, SteamLocomotiveModel::getTexturedModelData);
    }
}
