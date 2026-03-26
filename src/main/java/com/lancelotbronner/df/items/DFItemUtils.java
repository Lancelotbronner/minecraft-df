package com.lancelotbronner.df.items;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.*;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DFItemUtils {
	public static DeferredItem<Item> shell(String name, Pattern pattern, Color... colors) {
		return DwarfFortress.ITEMS.registerItem(name, Item::new);
	}

	public static DeferredItem<Item> boulder(Gem gem) {
		return DwarfFortress.ITEMS.registerItem(gem.name + "/boulder", Item::new, builder -> builder);
	}

	public static DeferredItem<Item> cutGem(Gem gem, GemCut cut) {
		return DwarfFortress.ITEMS.registerItem(
			gem.name + "/" + cut.name,
			Item::new,
			builder -> builder);
	}

	public static DeferredItem<Item> boulder(Stone stone) {
		return DwarfFortress.ITEMS.registerItem(
			stone.name + "/boulder",
			Item::new,
			builder -> builder);
	}

	public static DeferredItem<Item> block(Stone stone) {
		return DwarfFortress.ITEMS.registerItem(
			stone.name + "/block",
			Item::new,
			builder -> builder);
	}

	public static DeferredItem<Item> bar(Metal metal) {
		return DwarfFortress.ITEMS.registerItem(
			metal.name + "/bar",
			Item::new,
			builder -> builder);
	}

	public static DeferredItem<Item> chains(Metal metal) {
		return DwarfFortress.ITEMS.registerItem(
			metal.name + "/chains",
			Item::new,
			builder -> builder);
	}

	public static DeferredItem<Item> anvil(Metal metal) {
		return DwarfFortress.ITEMS.registerItem(
			metal.name + "/anvil",
			Item::new,
			builder -> builder);
	}

	public static DeferredItem<Item> mechanism(Metal metal) {
		return DwarfFortress.ITEMS.registerItem(
			metal.name + "/mechanism",
			Item::new,
			builder -> builder);
	}

	public static DeferredItem<Item> dead(Vermin vermin) {
		return DwarfFortress.ITEMS.registerItem(vermin.name, Item::new);
	}

	public static DeferredItem<Item> live(Vermin vermin) {
		return DwarfFortress.ITEMS.registerItem(vermin.name + "/live", Item::new);
	}

	public static DeferredItem<Item> spawn_egg(Vermin vermin) {
		return DwarfFortress.ITEMS.registerItem(vermin.name + "/spawn_egg", Item::new);
	}

	public static <K, V> Map<K, V> map(K[] values, Function<K, V> value) {
		return Stream.of(values).collect(Collectors.toMap(k -> k, value));
	}
}
