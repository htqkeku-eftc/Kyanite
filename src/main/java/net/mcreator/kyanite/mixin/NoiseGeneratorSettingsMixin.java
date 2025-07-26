package net.mcreator.kyanite.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.kyanite.init.KyaniteModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements KyaniteModBiomes.KyaniteModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> kyanite_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.kyanite_dimensionTypeReference != null) {
			retval = KyaniteModBiomes.adaptSurfaceRule(retval, this.kyanite_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setkyaniteDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.kyanite_dimensionTypeReference = dimensionType;
	}
}