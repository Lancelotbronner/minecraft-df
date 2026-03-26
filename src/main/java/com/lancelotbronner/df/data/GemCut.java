package com.lancelotbronner.df.data;

import com.lancelotbronner.df.DwarfFortress;
import net.minecraft.resources.Identifier;

/// See [Gem Cuts](https://dwarffortresswiki.org/index.php/Gem#Gem%20Cut)
public enum GemCut {
	BAGUETTE("baguette", TextureSet.BAGUETTE),
	BAGUETTE_TAPERED("baguette_tapered", TextureSet.BAGUETTE_TAPERED),
	BRILLIANT_ROUND("brilliant_round", TextureSet.BRILLIANT_ROUND),
	BRILLIANT_SQUARE("brilliant_square", TextureSet.BRILLIANT_SQUARE),
	BRIOLETTE("briolette", TextureSet.BRIOLETTE),
	CABOCHON_OVAL("cabochon_oval", TextureSet.CABOCHON_OVAL),
	CABOCHON_RECTANGULAR("cabochon_rectangular", TextureSet.CABOCHON_RECTANGULAR),
	CUSHION("cushion", TextureSet.CUSHION),
	CABOCHON_CUSHION("cushion_cabochon", TextureSet.CUSHION_CABOCHON),
	EMERALD("emerald", TextureSet.EMERALD),
	MARQUISE("marquise", TextureSet.MARQUISE),
	OCTAGON("octagon", TextureSet.OCTAGON),
	OVAL("oval", TextureSet.OVAL),
	PEAR("pear", TextureSet.PEAR),
	POINT("point", TextureSet.POINT),
	RADIANT("radiant", TextureSet.RADIANT),
	ROSE("rose", TextureSet.ROSE),
	SINGLE("single", TextureSet.SINGLE),
	SQUARE("square", TextureSet.SQUARE),
	TABLE("table", TextureSet.TABLE),
	TRILLION("trillion", TextureSet.TRILLION),
;
	public final String name;
	public final TextureSet texture;

	GemCut(String name, TextureSet texture) {
		this.name = name; this.texture = texture;
	}

	public Identifier id() {
		return DwarfFortress.id(name);
	}

	public static final GemCut DEFAULT = GemCut.SINGLE;
}