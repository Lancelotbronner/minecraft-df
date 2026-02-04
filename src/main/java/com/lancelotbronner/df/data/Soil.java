package com.lancelotbronner.df.data;

public enum Soil {
	// Topsoil
	LOAM("loam", Color.SILVER),
	LOAMY_SAND("loamy_sand", Color.PEARL),
	PEAT("peat", Color.MAROON),
	SANDY_CLAY_LOAM("sandy_clay_loam", Color.FLAX),
	SANDY_LOAM("sandy_loam", Color.BUFF),
	SILT("silt", Color.ECRU),
	SILTY_CLAY_LOAM("silty_clay_loam", Color.GOLD),
	SILT_LOAM("silt_loam", Color.BEIGE),
	// Ocean Floor
	PELAGIC_CLAY("pelagic_clay", Color.CHARCOAL),
	SILICEOUS_OOZE("siliceous_ooze", Color.BLUE_MIDNIGHT),
	CALCAREOUS_OOZE("calcareous_ooze", Color.TAUPE_PURPLE),
	// Sand
	SAND_TAN("sand", Color.TAN),
	SAND_BLACK("black_sand", Color.TAUPE_DARK),
	SAND_RED("red_sand", Color.VERMILION),
	SAND_WHITE("white_sand", Color.IVORY),
	SAND_YELLOW("yellow_sand", Color.YELLOW),
	// Clay
	CLAY("clay", Color.BRASS),
	CLAY_LOAM("clay_loam", Color.ECRU),
	SANDY_CLAY("sandy_clay", Color.PEARL),
	SILTY_CLAY("silty_clay", Color.TAN_DARK),
	FIRE_CLAY("fire_clay", Color.RUST),
	;

	public final String name;
	public final Color color;

	Soil(String name, Color color) {
		this.name = name;
		this.color = color;
	}
}
