package com.something0.netherforge;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class NetherForgeClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //ScreenRegistry.register(NetherForge.SCREEN_HANDLER_TYPE, NetherForgeGuiDescription::new);

        ScreenRegistry.register(NetherForge.SCREEN_HANDLER_TYPE, (gui, inventory, title) -> new NetherForgeBlockScreen(gui, inventory, title));
      //  ScreenProviderRegistry.INSTANCE.registerFactory(NetherForgeBlock.ID, (syncId, id, player, buf) -> new NetherForgeGuiDescription(()));
    }
}
