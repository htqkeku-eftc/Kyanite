/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyanite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kyanite.item.CoarsebluesparItem;
import net.mcreator.kyanite.item.BluecrystalshovelItem;
import net.mcreator.kyanite.item.BluecrystalpickaxeItem;
import net.mcreator.kyanite.item.BluecrystalingotfragmentsItem;
import net.mcreator.kyanite.item.BluecrystalingotItem;
import net.mcreator.kyanite.item.BluecrystalhoeItem;
import net.mcreator.kyanite.item.BluecrystalgrainsItem;
import net.mcreator.kyanite.item.BluecrystalaxeItem;
import net.mcreator.kyanite.item.BlueCrystalSwordItem;
import net.mcreator.kyanite.item.BlueCrystalAppleItem;
import net.mcreator.kyanite.KyaniteMod;

import java.util.function.Function;

public class KyaniteModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(KyaniteMod.MODID);
	public static final DeferredItem<Item> COARSEBLUESPAR = register("coarsebluespar", CoarsebluesparItem::new);
	public static final DeferredItem<Item> BLUECRYSTALRAWORE = block(KyaniteModBlocks.BLUECRYSTALRAWORE, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> QINGQINGDODOBLOCK = block(KyaniteModBlocks.QINGQINGDODOBLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	public static final DeferredItem<Item> BLUECRYSTALINGOTFRAGMENTS = register("bluecrystalingotfragments", BluecrystalingotfragmentsItem::new);
	public static final DeferredItem<Item> BLUECRYSTALINGOT = register("bluecrystalingot", BluecrystalingotItem::new);
	public static final DeferredItem<Item> BLUECRYSTALPICKAXE = register("bluecrystalpickaxe", BluecrystalpickaxeItem::new);
	public static final DeferredItem<Item> BLUECRYSTALGRAINS = register("bluecrystalgrains", BluecrystalgrainsItem::new);
	public static final DeferredItem<Item> BLUE_CRYSTAL_APPLE = register("blue_crystal_apple", BlueCrystalAppleItem::new);
	public static final DeferredItem<Item> BLUE_CRYSTAL_SWORD = register("blue_crystal_sword", BlueCrystalSwordItem::new);
	public static final DeferredItem<Item> BLUECRYSTALAXE = register("bluecrystalaxe", BluecrystalaxeItem::new);
	public static final DeferredItem<Item> BLUECRYSTALSHOVEL = register("bluecrystalshovel", BluecrystalshovelItem::new);
	public static final DeferredItem<Item> BLUECRYSTALHOE = register("bluecrystalhoe", BluecrystalhoeItem::new);
	public static final DeferredItem<Item> BLUECRYSTALBLOCK = block(KyaniteModBlocks.BLUECRYSTALBLOCK, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
	public static final DeferredItem<Item> GRINDINGBLUECRYSTALBLOCKS = block(KyaniteModBlocks.GRINDINGBLUECRYSTALBLOCKS, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
	public static final DeferredItem<Item> BLUE_CRYSTAL_EARTH_BLOCKS = block(KyaniteModBlocks.BLUE_CRYSTAL_EARTH_BLOCKS, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> BLUE_CRYSTAL_GRASS_CUBE = block(KyaniteModBlocks.BLUE_CRYSTAL_GRASS_CUBE, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
	public static final DeferredItem<Item> BLUE_CRYSTAL_UNDERWATER_CUBE = block(KyaniteModBlocks.BLUE_CRYSTAL_UNDERWATER_CUBE, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> BLUECRYSTALTREESTEM = block(KyaniteModBlocks.BLUECRYSTALTREESTEM);
	public static final DeferredItem<Item> BLUECRYSTALTREELEAVES = block(KyaniteModBlocks.BLUECRYSTALTREELEAVES);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}