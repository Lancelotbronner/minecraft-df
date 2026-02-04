package com.lancelotbronner.df.data;

/// See https://dwarffortresswiki.org/index.php/Gem#Gem%20Cut
public enum GemCut {
	BAGUETTE("baguette"),
	BAGUETTE_TAPERED("baguette/tapered"),
	BRILLIANT_ROUND("brilliant/round"),
	BRILLIANT_SQUARE("brilliant/square"),
	BRIOLETTE("briolette"),
	CABOCHON_CUSHION("cabochon/cushion"),
	CABOCHON_OVAL("cabochon/oval"),
	CABOCHON_RECTANGULAR("cabochon/rectangular"),
	CUSHION("cushion"),
	EMERALD("emerald"),
	MARQUISE("marquise"),
	OCTAGON("octagon"),
	OVAL("oval"),
	PEAR("pear"),
	POINT("point"),
	RADIANT("radiant"),
	ROSE("rose"),
	SINGLE("single"),
	SQUARE("square"),
	TABLE("table"),
	TRILLION("trillion"),
;
	public final String name;

	GemCut(String name) {
		this.name = name;
	}
}
