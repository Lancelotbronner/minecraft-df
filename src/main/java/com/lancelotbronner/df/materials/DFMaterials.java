package com.lancelotbronner.df.materials;

import com.lancelotbronner.df.data.Color;
import com.lancelotbronner.df.data.Material;
import com.lancelotbronner.df.data.MaterialCategory;
import com.lancelotbronner.df.data.Stone;
import com.lancelotbronner.df.utils.DFUtils;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Map;

public class DFMaterials {
	public static final DeferredHolder<Material, Material> CHALK = DFMaterialUtils.register(
		"chalk",
		MaterialCategory.STONE,
		Color.BEIGE,
		builder -> builder
			.value(2)
			.meltingPoint(11485)
			.boilingPoint(14000)
			.specificHeat(800)
			.solidDensity(2710));
	public static final Map<Stone, DeferredHolder<Material, Material>> STONE = DFUtils.map(Stone.values(),
		DFMaterialUtils::stone);

	public static void register() {}
}
