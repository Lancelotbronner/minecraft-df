package com.lancelotbronner.df.registries;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.GemCut;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.registries.RegistryBuilder;
import org.jetbrains.annotations.NotNull;

public class DFRegistries {
	public static final Registry<@NotNull GemCut> GEM_CUTS = new RegistryBuilder<>(Keys.GEM_CUTS).create();

	public static final class Keys {
		public static final ResourceKey<@NotNull Registry<@NotNull GemCut>> GEM_CUTS = key(
			"gem_cuts");

		private static <T> ResourceKey<@NotNull Registry<@NotNull T>> key(String name) {
			return ResourceKey.createRegistryKey(DwarfFortress.id(name));
		}
	}
}
