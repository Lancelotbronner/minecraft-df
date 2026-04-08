package com.lancelotbronner.df.materials;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Color;
import com.lancelotbronner.df.data.Material;
import com.lancelotbronner.df.data.MaterialCategory;
import com.lancelotbronner.df.data.Stone;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.Function;

public class DFMaterialUtils {
	public static DeferredHolder<Material, Material> register(Material material) {
		return DwarfFortress.MATERIALS.register(material.name(), () -> material);
	}

	public static DeferredHolder<Material, Material> stone(Stone stone) {
		return register(stone.name, MaterialCategory.STONE, stone.color, material -> material);
	}

	public static DeferredHolder<Material, Material> register(
		String name,
		MaterialCategory category,
		Color color,
		Function<Material.Builder, Material.Builder> build
	) {
		return DwarfFortress.MATERIALS.register(
			name,
			build.apply(new Material.Builder(name, category, color))::build);
	}
}
