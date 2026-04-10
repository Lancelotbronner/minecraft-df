package com.lancelotbronner.df.materials;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Materials;
import com.lancelotbronner.df.utils.DFUtils;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Map;

public class DFMaterials {
	public static final Map<Materials, DeferredHolder<Material, Material>> BUILTIN = DFUtils.map(
		Materials.values(), m -> DwarfFortress.MATERIALS.register(
			m.name,
			() -> new Material(m.name, m.category, m.color, m.value, m.isFireSafe, m.isMagmaSafe)));

	public static void register() {}
}
