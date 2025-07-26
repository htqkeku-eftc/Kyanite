package net.mcreator.kyanite.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BlueCrystalUnderwaterCubeBlock extends Block {
	public BlueCrystalUnderwaterCubeBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.MUD).strength(7f, 8f).lightLevel(s -> 4).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 13;
	}
}