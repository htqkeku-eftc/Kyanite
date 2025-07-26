package net.mcreator.kyanite.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.kyanite.procedures.Blue_crystal_raw_ore_provides_experienceProcedure;

public class BluecrystalraworeBlock extends Block {
	public BluecrystalraworeBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(9f, 10f).lightLevel(s -> 3).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 13;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		Blue_crystal_raw_ore_provides_experienceProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}