package com.lancelotbronner.df.data;

public enum Metal {
	// Pure
	ALUMINUM("aluminum", Color.WHITE),
	BISMUTH("bismuth", Color.HELIOTROPE),
	COPPER("copper", Color.COPPER),
	GOLD("gold", Color.GOLD),
	IRON("iron", Color.GRAY),
	LEAD("lead", Color.TAUPE_GRAY),
	NICKEL("nickel", Color.SILVER),
	PLATINUM("platinum", Color.WHITE),
	SILVER("silver", Color.SILVER),
	TIN("tin", Color.SILVER),
	ZINC("zinc", Color.SILVER),
	// Alloys
	BILLON("billon", Color.BROWN_PALE),
	BRONZE("bronze", Color.BRONZE),
	BRONZE_BISMUTH("bismuth_bronze", Color.TAN),
	BRONZE_BLACK("black_bronze", Color.BLACK),
	BRASS("brass", Color.BRASS),
	ELECTRUM("electrum", Color.OCHRE),
	PEWTER_FINE("fine_pewter", Color.SILVER),
	PEWTER_LAY("lay_pewter", Color.WHITE),
	PEWTER_TRIFLE("trifle_pewter", Color.TAUPE_GRAY),
	NICKEL_SILVER("nickel_silver", Color.WHITE),
	PIG_IRON("pig_iron", Color.TAUPE_GRAY),
	ROSE_GOLD("rose_gold", Color.PINK),
	STEEL("steel", Color.GRAY_BLUE),
	STERLING_SILER("sterling_silver", Color.WHITE),
	// Special
	ADAMANTINE("adamantine", Color.AQUA),
	DIVINE_BLIGHT("divine_blight", Color.RUST),
	DIVINE_CHAOS("divine_chaos", Color.RED),
	DIVINE_DARKNESS("divine_darkness", Color.BLACK),
	DIVINE_DAWN("divine_dawn", Color.YELLOW),
	DIVINE_DAY("divine_day", Color.WHITE),
	DIVINE_DEATH("divine_death", Color.BLUE_PALE),
	DIVINE_DEFORMITY("divine_deformity", Color.BLACK),
	DIVINE_DISEASE("divine_disease", Color.BLACK),
	DIVINE_EARTH("divine_earth", Color.SIENNA_BURNT),
	DIVINE_FIRE("divine_fire", Color.YELLOW),
	DIVINE_JEWELS("divine_jewels", Color.GREEN),
	DIVINE_LIGHT("divine_light", Color.WHITE),
	DIVINE_LIGHTNING("divine_lightning", Color.YELLOW),
	DIVINE_MOON("divine_moon", Color.CLEAR),
	DIVINE_MOUNTAINS("divine_mountains", Color.WHITE),
	DIVINE_MUCK("divine_muck", Color.BROWN),
	DIVINE_MUSIC("divine_music", Color.WHITE),
	DIVINE_NIGHT("divine_night", Color.BLACK),
	DIVINE_RAINBOWS("divine_rainbows", Color.CLEAR),
	DIVINE_SKY("divine_sky", Color.BLUE_SKY),
	DIVINE_STARS("divine_star", Color.WHITE),
	DIVINE_STORMS("divine_storm", Color.GRAY),
	DIVINE_SUN("divine_sun", Color.WHITE),
	DIVINE_THUNDER("divine_thunder", Color.GRAY),
	DIVINE_TORTURE("divine_torture", Color.BLACK),
	DIVINE_VOLCANOS("divine_volcanos", Color.RED)
	;

	public final String name;
	public final Color color;

	Metal(String name, Color color) {
		this.name = name;
		this.color = color;
	}
}
