package com.lancelotbronner.df.registries;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.GemCut;
import com.lancelotbronner.df.materials.Material;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.registries.RegistryBuilder;
import org.jetbrains.annotations.NotNull;

public class DFRegistries {
	public static final Registry<@NotNull GemCut> GEM_CUT = new RegistryBuilder<>(Keys.GEM_CUT).create();
	public static final Registry<@NotNull Material> MATERIAL = new RegistryBuilder<>(Keys.MATERIAL).create();

	public static final class Keys {
		public static final ResourceKey<@NotNull Registry<@NotNull GemCut>> GEM_CUT = key(
			"gem_cut");
		public static final ResourceKey<@NotNull Registry<@NotNull Material>> MATERIAL = key(
			"material");

		private static <T> ResourceKey<@NotNull Registry<@NotNull T>> key(String name) {
			return ResourceKey.createRegistryKey(DwarfFortress.id(name));
		}
	}
}
