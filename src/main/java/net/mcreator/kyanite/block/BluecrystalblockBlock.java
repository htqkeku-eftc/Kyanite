package net.mcreator.kyanite.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BluecrystalblockBlock extends Block {
	public BluecrystalblockBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(30f, 20f).lightLevel(s -> 3).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 13;
	}
}