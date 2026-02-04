package com.lancelotbronner.df.data;

public enum Stone {
	// Sedimentary
	CHALK("chalk", Color.BEIGE, true, false),
	CHERT("chert", Color.TAUPE_PALE, true, true),
	CLAYSTONE("claystone", Color.CHOCOLATE, true, false),
	CONGLOMERATE("conglomerate", Color.TAUPE_ROSE, true, false),
	DOLOMITE("dolomite", Color.PINK_PALE, true, true),
	LIMESTONE("limestone", Color.SILVER, true, false),
	MUDSTONE("mudstone", Color.GRAY, true, false),
	ROCK_SALT("rock_salt", Color.PINK, true, false),
	SANDSTONE("sandstone", Color.SAFFRON, true, true),
	SHALE("shale", Color.TAUPE_MEDIUM, true, false),
	SILTSTONE("siltstone", Color.ECRU, true, false),
	// Igneous Intrusive
	DIORITE("diorite", Color.SILVER, true, false),
	GABBRO("gabbro", Color.GRAY, true, true),
	GRANITE("granite", Color.CLEAR, true, false),
	// Igneous Extrusive
	ANDESITE("andesite", Color.GRAY, true, false),
	BASALT("basalt", Color.TAUPE_GRAY, true, true),
	DACITE("dacite", Color.SILVER, true, false),
	OBSIDIAN("obsidian", Color.BLACK, true, true),
	RHYOLITE("rhyolite", Color.BUFF, true, false),
	// Metamorphic
	GNEISS("gneiss", Color.FLAX, true, false),
	MARBLE("marble", Color.WHITE, true, false),
	PHYLLITE("phyllite", Color.GRAY, true, false),
	QUARTZITE("quartzite", Color.LAVENDER_BLUSH, true, true),
	SCHIST("schist", Color.CHESTNUT_DARK, true, false),
	SLATE("slate", Color.RUSSET, true, false),
	// Pockets & Veins
	ALABASTER("alabaster", Color.IVORY, false, false),
	ALUNITE("alunite", Color.PURPLE, true, true),
	ANHYDRITE("anhydrite", Color.PERIWINKLE, true, true),
	BAUXITE("bauxite", Color.VERMILION, true, true),
	BITUMINOUS_COAL("bituminous_coal", Color.CHARCOAL, false, false),
	BORAX("borax", Color.SILVER, true, false),
	BRIMSTONE("brimstone", Color.YELLOW, false, false),
	CALCITE("calcite", Color.FLAX, true, true),
	CHROMITE("chromite", Color.INDIGO_DARK, true, true),
	CINNABAR("cinnabar", Color.RED, false, false),
	COBALTITE("cobaltite", Color.CHARCOAL, true, false),
	CRYOLITE("cryolite", Color.BUFF, true, false),
	GRAPHITE("graphite", Color.CHARCOAL, false, false),
	GYPSUM("gypsum", Color.BUFF, false, false),
	HORNBLENDE("hornblende", Color.GRAY, true, false),
	ILMENITE("ilmenite", Color.TAN_DARK, true, true),
	JET("jet", Color.BLUE_MIDNIGHT, true, false),
	KAOLINITE("kaolinite", Color.PEARL, true, true),
	CERULEAN("kimberlite", Color.CERULEAN, true, false),
	LIGNITE("lignite", Color.SLATE_GRAY, false, false),
	MARCASITE("marcasite", Color.GREEN_YELLOW, false, false),
	MICA("mica", Color.SAFFRON, true, true),
	MICROCLINE("microcline", Color.AQUA, true, false),
	OLIVINE("olivine", Color.YELLOW_GREEN, true, true),
	ORPIMENT("orpiment", Color.AMBER, false, false),
	ORTHOCLASE("orthoclase", Color.CHESTNUT, true, true),
	PERICLASE("periclase", Color.CHARTREUSE, true, true),
	PETRIFIED_WOOD("pertrified_wood", Color.GOLDENROD, true, true),
	PITCHBLENDE("pitchblende", Color.OLIVE, true, true),
	PUDDINGSTONE("puddingstone", Color.SAFFRON, true, false),
	PYROLUSITE("pyrolusite", Color.CHARCOAL, false, false),
	REALGAR("realgar", Color.RED, false, false),
	RUTILE("rutile", Color.FLAX, true, true),
	SALTPETER("saltpeter", Color.IVORY, false, false),
	SATINSPAR("satinspar", Color.IVORY, false, false),
	SELENITE("selenite", Color.IVORY, false, false),
	SERPENTINE("serpentine", Color.CHARTREUSE, false, false),
	STIBNITE("stibnite", Color.CERULEAN, false, false),
	SYLVITE("sylvite", Color.VERMILION, true, false),
	TALC("talc", Color.BEIGE, true, true),
	;

	public final String name;
	public final Color color;
	public final boolean isFireSafe;
	public final boolean isMagmaSafe;

	Stone(String name, Color color, boolean isFireSafe, boolean isMagmaSafe) {
		this.name = name;
		this.color = color;
		this.isFireSafe = isFireSafe;
		this.isMagmaSafe = isMagmaSafe;
	}
}
