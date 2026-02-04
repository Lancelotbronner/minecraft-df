package com.lancelotbronner.df.datagen;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.blocks.DFBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
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
		for (DFBlocks.DFStoneFamily family : DFBlocks.STONES.values())
			family.generate(blockModels, itemModels);
		for (DFBlocks.DFWoodFamily family : DFBlocks.WOODS.values())
			family.generate(blockModels, itemModels);
	}
}
