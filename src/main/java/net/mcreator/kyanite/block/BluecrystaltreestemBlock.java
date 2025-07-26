package net.mcreator.kyanite.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BluecrystaltreestemBlock extends Block {
	public BluecrystaltreestemBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(7f).lightLevel(s -> 3).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 14;
	}
}