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
	DIVINE_BLIGHT("divine/blight", Color.RUST),
	DIVINE_CHAOS("divine/chaos", Color.RED),
	DIVINE_DARKNESS("divine/darkness", Color.BLACK),
	DIVINE_DAWN("divine/dawn", Color.YELLOW),
	DIVINE_DAY("divine/day", Color.WHITE),
	DIVINE_DEATH("divine/death", Color.BLUE_PALE),
	DIVINE_DEFORMITY("divine/deformity", Color.BLACK),
	DIVINE_DISEASE("divine/disease", Color.BLACK),
	DIVINE_EARTH("divine/earth", Color.BURNT_SIENNA),
	DIVINE_FIRE("divine/fire", Color.YELLOW),
	DIVINE_JEWELS("divine/jewels", Color.GREEN),
	DIVINE_LIGHT("divine/light", Color.WHITE),
	DIVINE_LIGHTNING("divine/lightning", Color.YELLOW),
	DIVINE_MOON("divine/moon", Color.CLEAR),
	DIVINE_MOUNTAINS("divine/mountains", Color.WHITE),
	DIVINE_MUCK("divine/muck", Color.BROWN),
	DIVINE_MUSIC("divine/music", Color.WHITE),
	DIVINE_NIGHT("divine/night", Color.BLACK),
	DIVINE_RAINBOWS("divine/rainbows", Color.CLEAR),
	DIVINE_SKY("divine/sky", Color.BLUE_SKY),
	DIVINE_STARS("divine/star", Color.WHITE),
	DIVINE_STORMS("divine/storm", Color.GRAY),
	DIVINE_SUN("divine/sun", Color.WHITE),
	DIVINE_THUNDER("divine/thunder", Color.GRAY),
	DIVINE_TORTURE("divine/torture", Color.BLACK),
	DIVINE_VOLCANOS("divine/volcanos", Color.RED)
	;

	public final String name;
	public final Color color;

	Metal(String name, Color color) {
		this.name = name;
		this.color = color;
	}
}
