package com.something0.netherforge;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NetherForge implements ModInitializer {

	public static final NetherForgeBlock netherForge = new NetherForgeBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static ScreenHandlerType<NetherForgeGuiDescription> SCREEN_HANDLER_TYPE;
    public static BlockEntityType<NetherForgeBlockEntity> netherForgeBlockEntity;


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		SCREEN_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(netherForge.ID, (syncId, inventory) -> new NetherForgeGuiDescription(syncId, inventory, ScreenHandlerContext.EMPTY));

        Registry.register(Registry.BLOCK, new Identifier("netherforge", "netherforge"), netherForge);
		Registry.register(Registry.ITEM, new Identifier("netherforge", "netherforge"), new BlockItem(netherForge, new Item.Settings().group(ItemGroup.MISC)));
		netherForgeBlockEntity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "netherforge:netherforge", BlockEntityType.Builder.create(NetherForgeBlockEntity::new, netherForge).build(null));


	}
}
