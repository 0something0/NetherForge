package com.something0.netherforge;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.screen.ScreenHandlerContext;

public class NetherForgeGuiDescription extends SyncedGuiDescription {

    public NetherForgeGuiDescription(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {

        super(NetherForge.SCREEN_HANDLER_TYPE, syncId, playerInventory, getBlockInventory(context), getBlockPropertyDelegate(context));

        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300, 200);

        WItemSlot itemSlot = WItemSlot.of(blockInventory, 0);
        root.add(itemSlot, 4, 1);

        root.add(this.createPlayerInventoryPanel(), 0, 3);

        root.validate(this);
    }
}