/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyanite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.kyanite.KyaniteMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class KyaniteModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KyaniteMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> KYANITE = REGISTRY.register("kyanite",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kyanite.kyanite")).icon(() -> new ItemStack(Blocks.SEA_LANTERN)).displayItems((parameters, tabData) -> {
				tabData.accept(KyaniteModItems.COARSEBLUESPAR.get());
				tabData.accept(KyaniteModBlocks.BLUECRYSTALRAWORE.get().asItem());
				tabData.accept(KyaniteModBlocks.QINGQINGDODOBLOCK.get().asItem());
				tabData.accept(KyaniteModItems.BLUECRYSTALINGOTFRAGMENTS.get());
				tabData.accept(KyaniteModItems.BLUECRYSTALINGOT.get());
				tabData.accept(KyaniteModItems.BLUECRYSTALPICKAXE.get());
				tabData.accept(KyaniteModItems.BLUECRYSTALGRAINS.get());
				tabData.accept(KyaniteModItems.BLUE_CRYSTAL_APPLE.get());
				tabData.accept(KyaniteModItems.BLUE_CRYSTAL_SWORD.get());
				tabData.accept(KyaniteModItems.BLUECRYSTALAXE.get());
				tabData.accept(KyaniteModItems.BLUECRYSTALSHOVEL.get());
				tabData.accept(KyaniteModItems.BLUECRYSTALHOE.get());
				tabData.accept(KyaniteModBlocks.BLUECRYSTALBLOCK.get().asItem());
				tabData.accept(KyaniteModBlocks.GRINDINGBLUECRYSTALBLOCKS.get().asItem());
				tabData.accept(KyaniteModBlocks.BLUE_CRYSTAL_EARTH_BLOCKS.get().asItem());
				tabData.accept(KyaniteModBlocks.BLUE_CRYSTAL_GRASS_CUBE.get().asItem());
				tabData.accept(KyaniteModBlocks.BLUE_CRYSTAL_UNDERWATER_CUBE.get().asItem());
				tabData.accept(KyaniteModBlocks.BLUECRYSTALTREESTEM.get().asItem());
				tabData.accept(KyaniteModBlocks.BLUECRYSTALTREELEAVES.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(KyaniteModItems.BLUECRYSTALPICKAXE.get());
			tabData.accept(KyaniteModItems.BLUE_CRYSTAL_SWORD.get());
			tabData.accept(KyaniteModItems.BLUECRYSTALAXE.get());
			tabData.accept(KyaniteModItems.BLUECRYSTALSHOVEL.get());
			tabData.accept(KyaniteModItems.BLUECRYSTALHOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(KyaniteModBlocks.BLUECRYSTALBLOCK.get().asItem());
			tabData.accept(KyaniteModBlocks.GRINDINGBLUECRYSTALBLOCKS.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(KyaniteModBlocks.BLUE_CRYSTAL_EARTH_BLOCKS.get().asItem());
			tabData.accept(KyaniteModBlocks.BLUE_CRYSTAL_GRASS_CUBE.get().asItem());
			tabData.accept(KyaniteModBlocks.BLUE_CRYSTAL_UNDERWATER_CUBE.get().asItem());
			tabData.accept(KyaniteModBlocks.BLUECRYSTALTREESTEM.get().asItem());
			tabData.accept(KyaniteModBlocks.BLUECRYSTALTREELEAVES.get().asItem());
		}
	}
}