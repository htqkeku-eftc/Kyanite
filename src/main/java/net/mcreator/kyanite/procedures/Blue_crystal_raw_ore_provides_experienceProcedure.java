package net.mcreator.kyanite.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.server.level.ServerLevel;

public class Blue_crystal_raw_ore_provides_experienceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.addFreshEntity(new ExperienceOrb(_level, (x + 0.5), (y + 1), (z + 0.5), 1));
	}
}