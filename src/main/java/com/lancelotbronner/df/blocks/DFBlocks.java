package com.lancelotbronner.df.blocks;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Stone;
import com.lancelotbronner.df.data.Tree;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.EnumMap;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DFBlocks {
	public static final EnumMap<Stone, DFBlockFamilies.DFStoneFamily> STONES = new EnumMap<>(Stone.class);
	public static final EnumMap<Tree, DFBlockFamilies.DFWoodFamily> WOODS = new EnumMap<>(Tree.class);

	static {
		for (Stone stone : Stone.values())
			STONES.put(stone, new DFBlockFamilies.DFStoneFamily(stone.name));
		for (Tree tree : Tree.values())
			WOODS.put(tree, new DFBlockFamilies.DFWoodFamily(tree.name));
	}

	public static void generate() {}

	public static <B extends Block> DeferredBlock<B> register(
		String name,
		Function<BlockBehaviour.Properties, B> factory,
		UnaryOperator<BlockBehaviour.Properties> modify
	) {
		Identifier minecraftId = Identifier.fromNamespaceAndPath("minecraft", name);
		if (BuiltInRegistries.BLOCK.containsKey(minecraftId))
			return DeferredBlock.createBlock(minecraftId);
		DeferredBlock<B> block = DwarfFortress.BLOCKS.registerBlock(name, factory, modify);
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static <B extends Block> DeferredBlock<B> register(
		String name,
		Function<BlockBehaviour.Properties, B> factory
	) {
		return register(name, factory, UnaryOperator.identity());
	}


}
