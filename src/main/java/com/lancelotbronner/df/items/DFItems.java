package com.lancelotbronner.df.items;

import com.lancelotbronner.df.data.Gem;
import com.lancelotbronner.df.data.GemCut;
import com.lancelotbronner.df.data.Metal;
import com.lancelotbronner.df.data.Stone;
import com.lancelotbronner.df.utils.DFUtils;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DFItems {
	// Slashing Weapons
	// battle axes, short swords (also scimitars, scourges, great axes, halberds, long swords and two-handed swords)

	// Crushing Weapons
	// war hammers, maces, training weapon attacks (see below), melee attacks with crossbows (also flails, mauls, whips)

	// Piercing Weapons
	// spears, picks, crossbow bolts (also daggers, pikes, morningstar, arrows and blowdarts)

	// Ranged Weapons
	// crossbows (also bows and blowguns)

	// Tools
	// carving knife, boning knife, slicing knife, meat cleaver, carving fork
	// cauldron, ladle, bowl, mortar, pestle, nest box, jug, large pot, hive, honeycomb, pouch, minecart, wheelbarrow, step ladder, scroll rollers, book binding, scroll, quire, die/dice

	// Stones
	public static final Map<Stone, DeferredItem<Item>> STONE_BLOCKS = DFUtils.map(
		Stone.values(),
		DFItemUtils::block);
	// chunk/brick?

	// Gems
	public static final Map<Gem, DeferredItem<Item>> ROUGH_GEMS = Stream
		.of(Gem.values())
		.collect(Collectors.toMap(k -> k, DFItemUtils::boulder));
	public static final Map<Gem, Map<GemCut, DeferredItem<Item>>> CUT_GEMS = DFUtils.map(
		Gem.values(),
		gem -> DFUtils.map(GemCut.values(), cut -> DFItemUtils.cutGem(gem, cut)));

	// Metals
	public static final Map<Metal, DeferredItem<Item>> BARS = DFUtils.map(
		Metal.values(),
		DFItemUtils::bar);
	public static final Map<Metal, DeferredItem<Item>> CHAINS = DFUtils.map(
		Metal.values(),
		DFItemUtils::chains);
	public static final Map<Metal, DeferredItem<Item>> ANVILS = DFUtils.map(
		Metal.values(),
		DFItemUtils::anvil);
	public static final Map<Metal, DeferredItem<Item>> METAL_MECHANISMS = DFUtils.map(
		Metal.values(),
		DFItemUtils::mechanism);

	// Cloth
	//	public static final DeferredItem<Item> SILK_CLOTH = DFItemUtils.ingot(Metal.ALUMINUM);

	// Vermin
	//	public static final DeferredItem<Item> LIVE_LIZARD = DFItemUtils.live(Vermin.LIZARD);
	//	public static final DeferredItem<Item> DEAD_LIZARD = DFItemUtils.dead(Vermin.LIZARD);
	//	public static final DeferredItem<Item> LIZARD_SPAWN_EGG = DFItemUtils.spawn_egg(Vermin.LIZARD);

	// Shells
	//	public static final DeferredItem<Item> MOON_SNAIL_SHELL = DFItemUtils.shell(
	//		"shell/moon_snail",
	//		Pattern.SOLID,
	//		Color.RED);
	//	public static final DeferredItem<Item> SNAIL_SHELL = DFItemUtils.shell(
	//		"shell/snail",
	//		Pattern.SOLID,
	//		Color.BROWN);
	//	public static final DeferredItem<Item> DESERT_TORTOISE_SHELL = DFItemUtils.shell("shell/desert_tortoise",
	//		Pattern.SOLID,
	//		Color.BROWN);
	//	public static final DeferredItem<Item> GIANT_TORTOISE_SHELL = DFItemUtils.shell("shell/giant_tortoise",
	//		Pattern.SOLID,
	//		Color.ECRU);
	//	public static final DeferredItem<Item> ARMADILLO_SHELL = DFItemUtils.shell(
	//		"shell/armadillo",
	//		Pattern.MOTTLED,
	//		Color.GRAY,
	//		Color.PINK);
	//	public static final DeferredItem<Item> NAUTILUS_SHELL = DFItemUtils.shell(
	//		"shell/nautilus",
	//		Pattern.STRIPES,
	//		Color.BROWN,
	//		Color.WHITE);
	//	public static final DeferredItem<Item> COMMON_SNAPPING_TURTLE_SHELL = DFItemUtils.shell("shell/common_snapping_turtle",
	//		Pattern.SOLID,
	//		Color.GREEN_DARK);
	//	public static final DeferredItem<Item> ALLIGATOR_SNAPPING_TURTLE_SHELL = DFItemUtils.shell("shell/alligator_snapping_turtle",
	//		Pattern.SOLID,
	//		Color.GREEN_DARK);
	//	public static final DeferredItem<Item> POND_TURTLE_SHELL = DFItemUtils.shell(
	//		"shell/pond_turtle",
	//		Pattern.SOLID,
	//		Color.GREEN_DARK);
	//	public static final DeferredItem<Item> MUSSLE_SHELL = DFItemUtils.shell(
	//		"shell/mussel",
	//		Pattern.SOLID,
	//		Color.GRAY);
	//	public static final DeferredItem<Item> OYSTER_SHELL = DFItemUtils.shell(
	//		"shell/oyster",
	//		Pattern.SOLID,
	//		Color.GRAY);

	public static void register() {}
}
