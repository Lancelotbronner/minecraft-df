package com.lancelotbronner.df.data;

import com.lancelotbronner.df.DwarfFortress;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;

public enum TextureSet {
	BOULDER_GEM1("boulders/gem1"),
	BOULDER_GEM2("boulders/gem2"),
	BOULDER_GEM3("boulders/gem3"),
	BOULDER_GEM4("boulders/gem4"),
	BOULDER_GEM5("boulders/gem5"),
	BOULDER_GEM6("boulders/gem6"),
	BOULDER_GLASS_LIGHT("boulders/glass_light"),
	BOULDER_GLASS_DARK("boulders/glass_dark"),
	BAGUETTE("gem/baguette"),
	BAGUETTE_TAPERED("gem/baguette_tapered"),
	BRILLIANT_ROUND("gem/brilliant_round"),
	BRILLIANT_SQUARE("gem/brilliant_square"),
	BRIOLETTE("gem/briolette"),
	CABOCHON_OVAL("gem/cabochon_oval"),
	CABOCHON_RECTANGULAR("gem/cabochon_rectangular"),
	CUSHION("gem/cushion"),
	CUSHION_CABOCHON("gem/cushion_cabochon"),
	EMERALD("gem/emerald"),
	MARQUISE("gem/marquise"),
	OCTAGON("gem/octagon"),
	OVAL("gem/oval"),
	PEAR("gem/pear"),
	POINT("gem/point"),
	RADIANT("gem/radiant"),
	ROSE("gem/rose"),
	SINGLE("gem/single"),
	SQUARE("gem/square"),
	TABLE("gem/table"),
	TRILLION("gem/trillion"),
	ANVIL("construction/anvil"),
	BAR("construction/bar"),
	BLOCK("construction/block"),
	BLOCKS("construction/blocks"),
	CHAINS("construction/chains"),
	ROPE("construction/rope"),
	MECHANISM("construction/mechanism"),
	POWDER("construction/powder"),
	SOAP("construction/soap"),
	LOGS("construction/logs"),
	;

	public final String path;

	TextureSet(String path) {
		this.path = path;
	}

	public enum Block {
		BLOCKS("blocks"),
		BRICKS("bricks"),
		COBBLESTONE("cobblestone"),
		DEEPSLATE_BRICKS("deepslate_bricks"),
		ENGRAVED("engraved"),
		MUD_BRICKS("mud_bricks"),
		NETHER_BRICKS("nether_bricks"),
		PRISMARINE_BRICKS("prismarine_bricks"),
		QUARTZ_BRICKS("quartz_bricks"),
		RESIN_BRICKS("resin_bricks"),
		STONE("stone"),
		STONE_BRICKS("stone_bricks"),
		TUFF_BRICKS("tuff_bricks"),
		;

		public final String path;

		Block(String path) {
			this.path = path;
		}

		public Material material(Color color) {
			return new Material(id(color));
		}

		public Identifier id(Color color) {
			return Identifier.fromNamespaceAndPath(
				DwarfFortress.MODID,
				"block/%s/%s".formatted(path, color.name));
		}
	}

	public enum Door {
		OAK_DOOR("oak"),
		MANGROVE_DOOR("mangrove"),
		IRON_DOOR("iron"),
		;

		public final String path;

		Door(String path) {
			this.path = path;
		}

		public Material top(Color color) {
			Identifier sprite = Identifier.fromNamespaceAndPath(
				DwarfFortress.MODID,
				"block/door/%s_top/%s".formatted(path, color.name));
			return new Material(sprite);
		}

		public Material bottom(Color color) {
			Identifier sprite = Identifier.fromNamespaceAndPath(
				DwarfFortress.MODID,
				"block/door/%s_bottom/%s".formatted(path, color.name));
			return new Material(sprite);
		}
	}
}
