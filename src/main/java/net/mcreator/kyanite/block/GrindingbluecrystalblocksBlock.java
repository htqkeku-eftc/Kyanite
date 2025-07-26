package net.mcreator.kyanite.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class GrindingbluecrystalblocksBlock extends Block {
	public GrindingbluecrystalblocksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(25f, 15f).lightLevel(s -> 5).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 10;
	}
}