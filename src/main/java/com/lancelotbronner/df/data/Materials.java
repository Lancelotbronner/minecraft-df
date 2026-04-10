package com.lancelotbronner.df.data;

public enum Materials {
	// Sedimentary Stone
	CHALK("chalk", MaterialCategory.STONE, Color.BEIGE, 1, true, false),
	CHERT("chert", MaterialCategory.STONE, Color.TAUPE_PALE, 1, true, true),
	CLAYSTONE("claystone", MaterialCategory.STONE, Color.CHOCOLATE, 1, true, false),
	CONGLOMERATE("conglomerate", MaterialCategory.STONE, Color.TAUPE_ROSE, 1, true, false),
	DOLOMITE("dolomite", MaterialCategory.STONE, Color.PINK_PALE, 1, true, true),
	LIMESTONE("limestone", MaterialCategory.STONE, Color.SILVER, 1, true, false),
	MUDSTONE("mudstone", MaterialCategory.STONE, Color.GRAY, 1, true, false),
	ROCK_SALT("rock_salt", MaterialCategory.STONE, Color.PINK, 1, true, false),
	SANDSTONE("sandstone", MaterialCategory.STONE, Color.SAFFRON, 1, true, true),
	SHALE("shale", MaterialCategory.STONE, Color.TAUPE_MEDIUM, 1, true, false),
	SILTSTONE("siltstone", MaterialCategory.STONE, Color.ECRU, 1, true, false),
	// Igneous Intrusive Stone
	DIORITE("diorite", MaterialCategory.STONE, Color.SILVER, 1, true, false),
	GABBRO("gabbro", MaterialCategory.STONE, Color.GRAY, 1, true, true),
	GRANITE("granite", MaterialCategory.STONE, Color.CLEAR, 1, true, false),
	// Igneous Extrusive Stone
	ANDESITE("andesite", MaterialCategory.STONE, Color.GRAY, 1, true, false),
	BASALT("basalt", MaterialCategory.STONE, Color.TAUPE_GRAY, 1, true, true),
	DACITE("dacite", MaterialCategory.STONE, Color.SILVER, 1, true, false),
	OBSIDIAN("obsidian", MaterialCategory.STONE, Color.BLACK, 1, true, true),
	RHYOLITE("rhyolite", MaterialCategory.STONE, Color.BUFF, 1, true, false),
	// Metamorphic Stone
	GNEISS("gneiss", MaterialCategory.STONE, Color.FLAX, 1, true, false),
	MARBLE("marble", MaterialCategory.STONE, Color.WHITE, 1, true, false),
	PHYLLITE("phyllite", MaterialCategory.STONE, Color.GRAY, 1, true, false),
	QUARTZITE("quartzite", MaterialCategory.STONE, Color.LAVENDER_BLUSH, 1, true, true),
	SCHIST("schist", MaterialCategory.STONE, Color.CHESTNUT_DARK, 1, true, false),
	SLATE("slate", MaterialCategory.STONE, Color.RUSSET, 1, true, false),
	// Stone Pockets & Veins
	ALABASTER("alabaster", MaterialCategory.STONE, Color.IVORY, 1, false, false),
	ALUNITE("alunite", MaterialCategory.STONE, Color.PURPLE, 1, true, true),
	ANHYDRITE("anhydrite", MaterialCategory.STONE, Color.PERIWINKLE, 1, true, true),
	BAUXITE("bauxite", MaterialCategory.STONE, Color.VERMILION, 1, true, true),
	BITUMINOUS_COAL("bituminous_coal", MaterialCategory.STONE, Color.CHARCOAL, 1, false, false),
	BORAX("borax", MaterialCategory.STONE, Color.SILVER, 1, true, false),
	BRIMSTONE("brimstone", MaterialCategory.STONE, Color.YELLOW, 1, false, false),
	CALCITE("calcite", MaterialCategory.STONE, Color.FLAX, 1, true, true),
	CHROMITE("chromite", MaterialCategory.STONE, Color.INDIGO_DARK, 1, true, true),
	CINNABAR("cinnabar", MaterialCategory.STONE, Color.RED, 1, false, false),
	COBALTITE("cobaltite", MaterialCategory.STONE, Color.CHARCOAL, 1, true, false),
	CRYOLITE("cryolite", MaterialCategory.STONE, Color.BUFF, 1, true, false),
	GRAPHITE("graphite", MaterialCategory.STONE, Color.CHARCOAL, 1, false, false),
	GYPSUM("gypsum", MaterialCategory.STONE, Color.BUFF, 1, false, false),
	HORNBLENDE("hornblende", MaterialCategory.STONE, Color.GRAY, 1, true, false),
	ILMENITE("ilmenite", MaterialCategory.STONE, Color.TAN_DARK, 1, true, true),
	JET("jet", MaterialCategory.STONE, Color.BLUE_MIDNIGHT, 1, true, false),
	KAOLINITE("kaolinite", MaterialCategory.STONE, Color.PEARL, 1, true, true),
	CERULEAN("kimberlite", MaterialCategory.STONE, Color.CERULEAN, 1, true, false),
	LIGNITE("lignite", MaterialCategory.STONE, Color.GRAY_SLATE, 1, false, false),
	MARCASITE("marcasite", MaterialCategory.STONE, Color.GREEN_YELLOW, 1, false, false),
	MICA("mica", MaterialCategory.STONE, Color.SAFFRON, 1, true, true),
	MICROCLINE("microcline", MaterialCategory.STONE, Color.AQUA, 1, true, false),
	OLIVINE("olivine", MaterialCategory.STONE, Color.YELLOW_GREEN, 1, true, true),
	ORPIMENT("orpiment", MaterialCategory.STONE, Color.AMBER, 1, false, false),
	ORTHOCLASE("orthoclase", MaterialCategory.STONE, Color.CHESTNUT, 1, true, true),
	PERICLASE("periclase", MaterialCategory.STONE, Color.CHARTREUSE, 1, true, true),
	PETRIFIED_WOOD("pertrified_wood", MaterialCategory.STONE, Color.GOLDENROD, 1, true, true),
	PITCHBLENDE("pitchblende", MaterialCategory.STONE, Color.OLIVE, 1, true, true),
	PUDDINGSTONE("puddingstone", MaterialCategory.STONE, Color.SAFFRON, 1, true, false),
	PYROLUSITE("pyrolusite", MaterialCategory.STONE, Color.CHARCOAL, 1, false, false),
	REALGAR("realgar", MaterialCategory.STONE, Color.RED, 1, false, false),
	RUTILE("rutile", MaterialCategory.STONE, Color.FLAX, 1, true, true),
	SALTPETER("saltpeter", MaterialCategory.STONE, Color.IVORY, 1, false, false),
	SATINSPAR("satinspar", MaterialCategory.STONE, Color.IVORY, 1, false, false),
	SELENITE("selenite", MaterialCategory.STONE, Color.IVORY, 1, false, false),
	SERPENTINE("serpentine", MaterialCategory.STONE, Color.CHARTREUSE, 1, false, false),
	STIBNITE("stibnite", MaterialCategory.STONE, Color.CERULEAN, 1, false, false),
	SYLVITE("sylvite", MaterialCategory.STONE, Color.VERMILION, 1, true, false),
	TALC("talc", MaterialCategory.STONE, Color.BEIGE, 1, true, true),
	// Ores
	RAW_ADAMANTINE("raw_adamantine", MaterialCategory.ORE, Color.AQUA, 250, true, true),
	NATIVE_ALUMINUM("native_aluminum", MaterialCategory.ORE, Color.IVORY, 40, true, false),
	BISMUTHINITE("bismuthinite", MaterialCategory.ORE, Color.UMBER_BURNT, 1, true, false),
	CASSITERITE("cassiterite", MaterialCategory.ORE, Color.GRAY, 2, true, false),
	NATIVE_COPPER("native_copper", MaterialCategory.ORE, Color.COPPER, 2, true, false),
	GALENA("galena", MaterialCategory.ORE, Color.SILVER, 5, true, true),
	GARNIERITE("garnierite", MaterialCategory.ORE, Color.PERIWINKLE, 2, true, false),
	NATIVE_GOLD("native_gold", MaterialCategory.ORE, Color.GOLD, 30, true, false),
	HEMATITE("hematite", MaterialCategory.ORE, Color.MAROON, 8, true, true),
	HORN_SILVER("horn_silver", MaterialCategory.ORE, Color.BRASS, 10, false, false),
	LIMONITE("limonite", MaterialCategory.ORE, Color.SAFFRON, 8, true, false),
	MAGNETITE("magnetite", MaterialCategory.ORE, Color.GRAY, 8, true, true),
	MALACHITE("malachite", MaterialCategory.ORE, Color.TURQUOISE, 2, false, false),
	NATIVE_PLATINUM("native_platinum", MaterialCategory.ORE, Color.SILVER, 40, true, true),
	NATIVE_SILVER("native_silver", MaterialCategory.ORE, Color.SILVER, 10, true, false),
	SPHALERITE("sphalerite", MaterialCategory.ORE, Color.PLUM, 2, true, true),
	TETRAHEDRITE("tetrahedrite", MaterialCategory.ORE, Color.SILVER, 3, true, false),
	// Pure Metals
	ALUMINUM("aluminum", MaterialCategory.METAL, Color.WHITE, 40, true, false),
	BISMUTH("bismuth", MaterialCategory.METAL, Color.HELIOTROPE, 2, true, false),
	COPPER("copper", MaterialCategory.METAL, Color.COPPER, 2, true, false),
	GOLD("gold", MaterialCategory.METAL, Color.GOLD, 30, true, false),
	IRON("iron", MaterialCategory.METAL, Color.GRAY, 10, true, false),
	LEAD("lead", MaterialCategory.METAL, Color.TAUPE_GRAY, 2, true, false),
	NICKEL("nickel", MaterialCategory.METAL, Color.SILVER, 2, true, false),
	PLATINUM("platinum", MaterialCategory.METAL, Color.WHITE, 40, true, false),
	SILVER("silver", MaterialCategory.METAL, Color.SILVER, 10, true, false),
	TIN("tin", MaterialCategory.METAL, Color.SILVER, 2, true, false),
	ZINC("zinc", MaterialCategory.METAL, Color.SILVER, 2, true, false),
	// Alloys
	BILLON("billon", MaterialCategory.METAL, Color.BROWN_PALE, 6, true, false),
	BRONZE("bronze", MaterialCategory.METAL, Color.BRONZE, 5, true, false),
	BRONZE_BISMUTH("bismuth_bronze", MaterialCategory.METAL, Color.TAN, 6, true, false),
	BRONZE_BLACK("black_bronze", MaterialCategory.METAL, Color.BLACK, 11, true, false),
	BRASS("brass", MaterialCategory.METAL, Color.BRASS, 7, true, false),
	ELECTRUM("electrum", MaterialCategory.METAL, Color.OCHRE, 20, true, false),
	PEWTER_FINE("fine_pewter", MaterialCategory.METAL, Color.SILVER, 5, true, false),
	PEWTER_LAY("lay_pewter", MaterialCategory.METAL, Color.WHITE, 3, true, false),
	PEWTER_TRIFLE("trifle_pewter", MaterialCategory.METAL, Color.TAUPE_GRAY, 4, true, false),
	NICKEL_SILVER("nickel_silver", MaterialCategory.METAL, Color.WHITE, 3, true, false),
	PIG_IRON("pig_iron", MaterialCategory.METAL, Color.TAUPE_GRAY, 10, true, false),
	ROSE_GOLD("rose_gold", MaterialCategory.METAL, Color.PINK, 23, true, false),
	STEEL("steel", MaterialCategory.METAL, Color.GRAY_BLUE, 30, true, false),
	STERLING_SILER("sterling_silver", MaterialCategory.METAL, Color.WHITE, 8, true, false),
	// Special Metals
	ADAMANTINE("adamantine", MaterialCategory.METAL, Color.AQUA, 300, true, false),
	DIVINE_BLIGHT("divine_blight", MaterialCategory.METAL, Color.RUST, 300, true, false),
	DIVINE_CHAOS("divine_chaos", MaterialCategory.METAL, Color.RED, 300, true, false),
	DIVINE_DARKNESS("divine_darkness", MaterialCategory.METAL, Color.BLACK, 300, true, false),
	DIVINE_DAWN("divine_dawn", MaterialCategory.METAL, Color.YELLOW, 300, true, false),
	DIVINE_DAY("divine_day", MaterialCategory.METAL, Color.WHITE, 300, true, false),
	DIVINE_DEATH("divine_death", MaterialCategory.METAL, Color.BLUE_PALE, 300, true, false),
	DIVINE_DEFORMITY("divine_deformity", MaterialCategory.METAL, Color.BLACK, 300, true, false),
	DIVINE_DISEASE("divine_disease", MaterialCategory.METAL, Color.BLACK, 300, true, false),
	DIVINE_EARTH("divine_earth", MaterialCategory.METAL, Color.SIENNA_BURNT, 300, true, false),
	DIVINE_FIRE("divine_fire", MaterialCategory.METAL, Color.YELLOW, 300, true, false),
	DIVINE_JEWELS("divine_jewels", MaterialCategory.METAL, Color.GREEN, 300, true, false),
	DIVINE_LIGHT("divine_light", MaterialCategory.METAL, Color.WHITE, 300, true, false),
	DIVINE_LIGHTNING("divine_lightning", MaterialCategory.METAL, Color.YELLOW, 300, true, false),
	DIVINE_MOON("divine_moon", MaterialCategory.METAL, Color.CLEAR, 300, true, false),
	DIVINE_MOUNTAINS("divine_mountains", MaterialCategory.METAL, Color.WHITE, 300, true, false),
	DIVINE_MUCK("divine_muck", MaterialCategory.METAL, Color.BROWN, 300, true, false),
	DIVINE_MUSIC("divine_music", MaterialCategory.METAL, Color.WHITE, 300, true, false),
	DIVINE_NIGHT("divine_night", MaterialCategory.METAL, Color.BLACK, 300, true, false),
	DIVINE_RAINBOWS("divine_rainbows", MaterialCategory.METAL, Color.CLEAR, 300, true, false),
	DIVINE_SKY("divine_sky", MaterialCategory.METAL, Color.BLUE_SKY, 300, true, false),
	DIVINE_STARS("divine_star", MaterialCategory.METAL, Color.WHITE, 300, true, false),
	DIVINE_STORMS("divine_storm", MaterialCategory.METAL, Color.GRAY, 300, true, false),
	DIVINE_SUN("divine_sun", MaterialCategory.METAL, Color.WHITE, 300, true, false),
	DIVINE_THUNDER("divine_thunder", MaterialCategory.METAL, Color.GRAY, 300, true, false),
	DIVINE_TORTURE("divine_torture", MaterialCategory.METAL, Color.BLACK, 300, true, false),
	DIVINE_VOLCANOS("divine_volcanos", MaterialCategory.METAL, Color.RED, 300, true, false);

	public static final Materials[] STONE = { CHALK, CHERT, CLAYSTONE, CONGLOMERATE, DOLOMITE, LIMESTONE, MUDSTONE, ROCK_SALT, SANDSTONE, SHALE, SILTSTONE, DIORITE, GABBRO, GRANITE, ANDESITE, BASALT, DACITE, OBSIDIAN, RHYOLITE, GNEISS, MARBLE, PHYLLITE, QUARTZITE, SCHIST, SLATE, ALABASTER, ALUNITE, ANHYDRITE, BAUXITE, BITUMINOUS_COAL, BORAX, BRIMSTONE, CALCITE, CHROMITE, CINNABAR, COBALTITE, CRYOLITE, GRAPHITE, GYPSUM, HORNBLENDE, ILMENITE, JET, KAOLINITE, CERULEAN, LIGNITE, MARCASITE, MICA, MICROCLINE, OLIVINE, ORPIMENT, ORTHOCLASE, PERICLASE, PETRIFIED_WOOD, PITCHBLENDE, PUDDINGSTONE, PYROLUSITE, REALGAR, RUTILE, SALTPETER, SATINSPAR, SELENITE, SERPENTINE, STIBNITE, SYLVITE, TALC, };
	public static final Materials[] ORE = { RAW_ADAMANTINE, NATIVE_ALUMINUM, BISMUTHINITE, CASSITERITE, NATIVE_COPPER, GALENA, GARNIERITE, NATIVE_GOLD, HEMATITE, HORN_SILVER, LIMONITE, MAGNETITE, MALACHITE, NATIVE_PLATINUM, NATIVE_SILVER, SPHALERITE, TETRAHEDRITE, };
	public static final Materials[] METAL = { ALUMINUM, BISMUTH, COPPER, GOLD, IRON, LEAD, NICKEL, PLATINUM, SILVER, TIN, ZINC, BILLON, BRONZE, BRONZE_BISMUTH, BRONZE_BLACK, BRASS, ELECTRUM, PEWTER_FINE, PEWTER_LAY, PEWTER_TRIFLE, NICKEL_SILVER, PIG_IRON, ROSE_GOLD, STEEL, STERLING_SILER, ADAMANTINE, DIVINE_BLIGHT, DIVINE_CHAOS, DIVINE_DARKNESS, DIVINE_DAWN, DIVINE_DAY, DIVINE_DEATH, DIVINE_DEFORMITY, DIVINE_DISEASE, DIVINE_EARTH, DIVINE_FIRE, DIVINE_JEWELS, DIVINE_LIGHT, DIVINE_LIGHTNING, DIVINE_MOON, DIVINE_MOUNTAINS, DIVINE_MUCK, DIVINE_MUSIC, DIVINE_NIGHT, DIVINE_RAINBOWS, DIVINE_SKY, DIVINE_STARS, DIVINE_STORMS, DIVINE_SUN, DIVINE_THUNDER, DIVINE_TORTURE, DIVINE_VOLCANOS, };
	public final String name;
	public final MaterialCategory category;
	public final Color color;
	public final short value;
	public final boolean isFireSafe;
	public final boolean isMagmaSafe;
	public final TextureSet boulder = TextureSet.BOULDER_GEM1;

	Materials(
		String name,
		MaterialCategory category,
		Color color,
		int value,
		boolean isFireSafe,
		boolean isMagmaSafe
	) {
		this.name = name;
		this.category = category;
		this.color = color;
		this.value = (short) value;
		this.isFireSafe = isFireSafe;
		this.isMagmaSafe = isMagmaSafe;
	}
}
