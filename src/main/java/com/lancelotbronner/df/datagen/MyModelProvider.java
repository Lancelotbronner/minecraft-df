package com.lancelotbronner.df.datagen;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.blocks.DFBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jspecify.annotations.NonNull;

public class MyModelProvider extends ModelProvider {
	public MyModelProvider(PackOutput output) {
		super(output, DwarfFortress.MODID);
	}

	@Override
	protected void registerModels(
		@NonNull BlockModelGenerators blockModels,
		@NonNull ItemModelGenerators itemModels
	) {
		ModelGenerators generators = new ModelGenerators(blockModels, itemModels);

		for (var entry : DFBlocks.STONES.entrySet()) {
			DwarfFortress.LOGGER.info("Generating {} stone", entry.getKey().name);
			entry
				.getValue()
				.generate(generators);
		}
		for (var entry : DFBlocks.WOODS.entrySet()) {
			DwarfFortress.LOGGER.info("Generating {} wood", entry.getKey().name);
			entry
				.getValue()
				.generate(generators);
		}
	}

	public record ModelGenerators(
		BlockModelGenerators blockModels, ItemModelGenerators itemModels
	) {
		public BlockModelGenerators.BlockFamilyProvider familyProviderFor(
			DeferredBlock<Block> block
		) {
			if (shouldGenerate(block))
				return blockModels.family(block.get());
			return blockModels.familyWithExistingFullBlock(block.get());
		}

		public boolean shouldGenerate(DeferredBlock<? extends Block> block) {
			return !block
				.getId()
				.getNamespace()
				.equals("minecraft");
		}
	}
}
