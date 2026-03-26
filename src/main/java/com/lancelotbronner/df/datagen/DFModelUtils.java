package com.lancelotbronner.df.datagen;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Color;
import com.lancelotbronner.df.data.TextureSet;
import net.minecraft.client.renderer.item.CuboidItemModelWrapper;

import java.util.Collections;
import java.util.Optional;

public class DFModelUtils {
	public static CuboidItemModelWrapper.Unbaked cuboid(String... id) {
		return new CuboidItemModelWrapper.Unbaked(
			DwarfFortress.id("item", id),
			Optional.empty(),
			Collections.emptyList());
	}

	public static CuboidItemModelWrapper.Unbaked cuboid(TextureSet texture, Color color) {
		return cuboid(texture.path, color.name);
	}
}
