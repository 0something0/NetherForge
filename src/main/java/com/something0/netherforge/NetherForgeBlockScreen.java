package com.something0.netherforge;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;

public class NetherForgeBlockScreen extends CottonInventoryScreen<NetherForgeGuiDescription> {
/*
    public NetherForgeBlockScreen(NetherForgeGuiDescription gui, PlayerInventory inventory, Text title) {

        super(gui, inventory.player, title);

    }
*/
        public NetherForgeBlockScreen(NetherForgeGuiDescription gui, PlayerEntity player, Text title) {
            super(gui, player, title);
        }

}
