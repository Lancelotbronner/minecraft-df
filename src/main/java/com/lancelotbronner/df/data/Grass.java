package com.lancelotbronner.df.data;

import org.jspecify.annotations.Nullable;

public enum Grass {
	// Wet, Dry
	ARROW_BAMBOO("arrow_bamboo", null),
	BENTGRASS("bentgrass", null),
	BABY_TOES_SUCCULENT("baby_toes_succulent", Color.WHITE),
	BLUE_SEDGE("blue_sedge", null),
	BUBBLE_BULBS("bubble_bulbs", null),
	CARPETGRASS("carpetgrass", null),
	CATTAIL("cattail", null),
	CLOUDBERRY("cloudberry", Color.WHITE),
	COMMON_REED("common_reed", null),
	COTTONGRASS("cottongrass", Color.WHITE),
	DALLISGRASS("dallisgrass", null),
	DOGS_TOOTH_GRASS("dogs_tooth_grass", null),
	DOWNY_GRASS("downy_grass", null),
	DROPSEED_GRASS("dropseed_grass", null),
	FESCUE_GRASS("fescue_grass", null),
	FIELD_SEDGE("field_sedge", null),
	GOLDEN_BAMBOO("golden_bamboo", null),
	GRAMA("grama", null),
	HAIR_GRASS("hair_grass", null),
	HEDGE_BAMBOO("hedge_bamboo", null),
	KNOTGRASS("knotgrass", null),
	MARSH_TISTLE("marsh_tistle", Color.FOXGLOVE),
	MEADOW_GRASS("meadow_grass", null),
	MEADOWSWEET("meadowsweet", Color.WHITE),
	MOUNTAIN_AVENS("mountain_avens", Color.WHITE),
	NEEDLE_GRASS("needle_grass", null),
	PEBBLE_PLANT("pebble_plant", Color.YELLOW),
	PURPLE_MOOR_GRASS("purple_moor_grass", null),
	REEDGRASS("reedgrass", null),
	RUSH("rush", Color.BROWN),
	RYEGRASS("ryegrass", null),
	SATINTAIL("satintail", null),
	SAWGRASS("sawgrass", null),
	STARRING_EYEBALL("staring_eyeball", null),
	VELVET_GRASS("velvet_grass", null),
	WHITE_MOUNTAIN_HEATHER("white_mountain_heather", null),
	WORMY_TENDRIL("wormy_tendril", null),
	ZOYSIA("zoysia", null),
	// Caverns
	CAVE_MOSS("cave_moss", null),
	FLOOR_FUNGUS("floor_fungus", null),
	UNDERLICHEN("underlichen", null),
	;

	public final String name;
	public final @Nullable Color flower;

	Grass(String name, @Nullable Color flower) {
		this.name = name;
		this.flower = flower;
	}
}
