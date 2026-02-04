package com.lancelotbronner.df.data;

public enum Ore {
	ADAMANTINE("raw_adamantine", Color.AQUA),
	ALUMINUM("native_aluminum", Color.IVORY),
	BISMUTHINITE("bismuthinite", Color.UMBER_BURNT),
	CASSITERITE("cassiterite", Color.GRAY),
	COPPER("native_copper", Color.COPPER),
	GALENA("galena", Color.SILVER),
	GARNIERITE("garnierite", Color.PERIWINKLE),
	GOLD("native_gold", Color.GOLD),
	HEMATITE("hematite", Color.MAROON),
	HORN_SILVER("horn_silver", Color.BRASS),
	LIMONITE("limonite", Color.SAFFRON),
	MAGNETITE("magnetite", Color.GRAY),
	MALACHITE("malachite", Color.TURQUOISE),
	PLATINUM("native_platinum", Color.SILVER),
	SILVER("native_silver", Color.SILVER),
	SPHALERITE("sphalerite", Color.PLUM),
	TETRAHEDRITE("tetrahedrite", Color.SILVER),
	;

	public final String name;
	public final Color color;

	Ore(String name, Color color) {
		this.name = name;
		this.color = color;
	}
}
