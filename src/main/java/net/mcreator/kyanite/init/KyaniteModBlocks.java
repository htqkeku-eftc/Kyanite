/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kyanite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.kyanite.block.QingqingdodoblockBlock;
import net.mcreator.kyanite.block.GrindingbluecrystalblocksBlock;
import net.mcreator.kyanite.block.BluecrystaltreestemBlock;
import net.mcreator.kyanite.block.BluecrystaltreeleavesBlock;
import net.mcreator.kyanite.block.BluecrystalraworeBlock;
import net.mcreator.kyanite.block.BluecrystalblockBlock;
import net.mcreator.kyanite.block.BlueCrystalUnderwaterCubeBlock;
import net.mcreator.kyanite.block.BlueCrystalGrassCubeBlock;
import net.mcreator.kyanite.block.BlueCrystalEarthBlocksBlock;
import net.mcreator.kyanite.KyaniteMod;

import java.util.function.Function;

public class KyaniteModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(KyaniteMod.MODID);
	public static final DeferredBlock<Block> BLUECRYSTALRAWORE = register("bluecrystalrawore", BluecrystalraworeBlock::new);
	public static final DeferredBlock<Block> QINGQINGDODOBLOCK = register("qingqingdodoblock", QingqingdodoblockBlock::new);
	public static final DeferredBlock<Block> BLUECRYSTALBLOCK = register("bluecrystalblock", BluecrystalblockBlock::new);
	public static final DeferredBlock<Block> GRINDINGBLUECRYSTALBLOCKS = register("grindingbluecrystalblocks", GrindingbluecrystalblocksBlock::new);
	public static final DeferredBlock<Block> BLUE_CRYSTAL_EARTH_BLOCKS = register("blue_crystal_earth_blocks", BlueCrystalEarthBlocksBlock::new);
	public static final DeferredBlock<Block> BLUE_CRYSTAL_GRASS_CUBE = register("blue_crystal_grass_cube", BlueCrystalGrassCubeBlock::new);
	public static final DeferredBlock<Block> BLUE_CRYSTAL_UNDERWATER_CUBE = register("blue_crystal_underwater_cube", BlueCrystalUnderwaterCubeBlock::new);
	public static final DeferredBlock<Block> BLUECRYSTALTREESTEM = register("bluecrystaltreestem", BluecrystaltreestemBlock::new);
	public static final DeferredBlock<Block> BLUECRYSTALTREELEAVES = register("bluecrystaltreeleaves", BluecrystaltreeleavesBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}