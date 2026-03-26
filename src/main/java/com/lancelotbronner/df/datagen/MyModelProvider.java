package com.lancelotbronner.df.datagen;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.blocks.DFBlockFamily;
import com.lancelotbronner.df.blocks.DFBlocks;
import com.lancelotbronner.df.data.*;
import com.lancelotbronner.df.items.DFItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jspecify.annotations.NonNull;

import java.util.Map;

import static net.minecraft.client.data.models.BlockModelGenerators.TEXTURED_MODELS;

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

		for (var entry : DFBlocks.WOODS.entrySet()) {
			DwarfFortress.LOGGER.info("Generating {} wood", entry.getKey().name);
			entry.getValue().generate(generators);
		}

		for (TextureSet tex : TextureSet.values())
			for (Color color : Color.values()) {
				Identifier id = DwarfFortress.id("item", tex.path, color.name);
				ModelTemplates.FLAT_ITEM.create(
					id,
					new TextureMapping().put(TextureSlot.LAYER0, new Material(id)),
					itemModels.modelOutput);
			}

		// Generate stones
		for (Stone stone : Stone.values()) {
			// Generate blocks
			itemModels.itemModelOutput.accept(
				DFItems.STONE_BLOCKS.get(stone).get(),
				DFModelUtils.cuboid(TextureSet.BLOCK, stone.color));
		}

		// Generate metals
		for (Metal metal : Metal.values()) {
			// Generate bars, chains, anvil, mechanisms
			itemModels.itemModelOutput.accept(
				DFItems.BARS.get(metal).get(),
				DFModelUtils.cuboid(TextureSet.BAR, metal.color));
			itemModels.itemModelOutput.accept(
				DFItems.CHAINS.get(metal).get(),
				DFModelUtils.cuboid(TextureSet.CHAINS, metal.color));
			itemModels.itemModelOutput.accept(
				DFItems.ANVILS.get(metal).get(),
				DFModelUtils.cuboid(TextureSet.ANVIL, metal.color));
			itemModels.itemModelOutput.accept(
				DFItems.METAL_MECHANISMS.get(metal).get(),
				DFModelUtils.cuboid(TextureSet.MECHANISM, metal.color));
		}

		// Generate gems
		for (Gem gem : Gem.values()) {
			Map<GemCut, DeferredItem<Item>> map = DFItems.CUT_GEMS.get(gem);

			// Generate the rough gem item
			itemModels.itemModelOutput.accept(
				DFItems.ROUGH_GEMS.get(gem).get(),
				DFModelUtils.cuboid(gem.texture, gem.color));

			for (GemCut cut : GemCut.values())
				// Generate each cut variant of the item
				itemModels.itemModelOutput.accept(
					map.get(cut).get(),
					DFModelUtils.cuboid(cut.texture, gem.color));
		}

		generators.familyOf(Stone.CHALK, DFBlockFamily.ROUGH_CHALK, true);
		generators.familyOf(Stone.CHALK, DFBlockFamily.SMOOTH_CHALK, true);
		generators.familyOf(Stone.CHERT, DFBlockFamily.ROUGH_CHERT, true);
		generators.familyOf(Stone.CHERT, DFBlockFamily.SMOOTH_CHERT, true);
		generators.familyOf(Stone.CLAYSTONE, DFBlockFamily.ROUGH_CLAYSTONE, true);
		generators.familyOf(Stone.CLAYSTONE, DFBlockFamily.SMOOTH_CLAYSTONE, true);
		generators.familyOf(Stone.CONGLOMERATE, DFBlockFamily.ROUGH_CONGLOMERATE, true);
		generators.familyOf(Stone.CONGLOMERATE, DFBlockFamily.SMOOTH_CONGLOMERATE, true);
		generators.familyOf(Stone.DOLOMITE, DFBlockFamily.ROUGH_DOLOMITE, true);
		generators.familyOf(Stone.DOLOMITE, DFBlockFamily.SMOOTH_DOLOMITE, true);
		generators.familyOf(Stone.LIMESTONE, DFBlockFamily.ROUGH_LIMESTONE, true);
		generators.familyOf(Stone.LIMESTONE, DFBlockFamily.SMOOTH_LIMESTONE, true);
		generators.familyOf(Stone.MUDSTONE, DFBlockFamily.ROUGH_MUDSTONE, true);
		generators.familyOf(Stone.MUDSTONE, DFBlockFamily.SMOOTH_MUDSTONE, true);
		generators.familyOf(Stone.ROCK_SALT, DFBlockFamily.ROUGH_ROCK_SALT, true);
		generators.familyOf(Stone.ROCK_SALT, DFBlockFamily.SMOOTH_ROCK_SALT, true);
		generators.familyOf(Stone.SANDSTONE, DFBlockFamily.ROUGH_SANDSTONE, true);
		generators.familyOf(Stone.SANDSTONE, DFBlockFamily.SMOOTH_SANDSTONE, true);
		generators.familyOf(Stone.SHALE, DFBlockFamily.ROUGH_SHALE, true);
		generators.familyOf(Stone.SHALE, DFBlockFamily.SMOOTH_SHALE, true);
		generators.familyOf(Stone.SILTSTONE, DFBlockFamily.ROUGH_SILTSTONE, true);
		generators.familyOf(Stone.SILTSTONE, DFBlockFamily.SMOOTH_SILTSTONE, true);
		generators.familyOf(Stone.DIORITE, DFBlockFamily.ROUGH_DIORITE, true);
		generators.familyOf(Stone.DIORITE, DFBlockFamily.SMOOTH_DIORITE, true);
		generators.familyOf(Stone.GABBRO, DFBlockFamily.ROUGH_GABBRO, true);
		generators.familyOf(Stone.GABBRO, DFBlockFamily.SMOOTH_GABBRO, true);
		generators.familyOf(Stone.GRANITE, DFBlockFamily.ROUGH_GRANITE, true);
		generators.familyOf(Stone.GRANITE, DFBlockFamily.SMOOTH_GRANITE, true);
		generators.familyOf(Stone.ANDESITE, DFBlockFamily.ROUGH_ANDESITE, true);
		generators.familyOf(Stone.ANDESITE, DFBlockFamily.SMOOTH_ANDESITE, true);
		generators.familyOf(Stone.BASALT, DFBlockFamily.ROUGH_BASALT, true);
		generators.familyOf(Stone.BASALT, DFBlockFamily.SMOOTH_BASALT, true);
		generators.familyOf(Stone.DACITE, DFBlockFamily.ROUGH_DACITE, true);
		generators.familyOf(Stone.DACITE, DFBlockFamily.SMOOTH_DACITE, true);
		generators.familyOf(Stone.OBSIDIAN, DFBlockFamily.ROUGH_OBSIDIAN, true);
		generators.familyOf(Stone.OBSIDIAN, DFBlockFamily.SMOOTH_OBSIDIAN, true);
		generators.familyOf(Stone.RHYOLITE, DFBlockFamily.ROUGH_RHYOLITE, true);
		generators.familyOf(Stone.RHYOLITE, DFBlockFamily.SMOOTH_RHYOLITE, true);
		generators.familyOf(Stone.GNEISS, DFBlockFamily.ROUGH_GNEISS, true);
		generators.familyOf(Stone.GNEISS, DFBlockFamily.SMOOTH_GNEISS, true);
		generators.familyOf(Stone.MARBLE, DFBlockFamily.ROUGH_MARBLE, true);
		generators.familyOf(Stone.MARBLE, DFBlockFamily.SMOOTH_MARBLE, true);
		generators.familyOf(Stone.PHYLLITE, DFBlockFamily.ROUGH_PHYLLITE, true);
		generators.familyOf(Stone.PHYLLITE, DFBlockFamily.SMOOTH_PHYLLITE, true);
		generators.familyOf(Stone.QUARTZITE, DFBlockFamily.ROUGH_QUARTZITE, true);
		generators.familyOf(Stone.QUARTZITE, DFBlockFamily.SMOOTH_QUARTZITE, true);
		generators.familyOf(Stone.SCHIST, DFBlockFamily.ROUGH_SCHIST, true);
		generators.familyOf(Stone.SCHIST, DFBlockFamily.SMOOTH_SCHIST, true);
		generators.familyOf(Stone.SLATE, DFBlockFamily.ROUGH_SLATE, true);
		generators.familyOf(Stone.SLATE, DFBlockFamily.SMOOTH_SLATE, true);
		generators.familyOf(Stone.ALABASTER, DFBlockFamily.ROUGH_ALABASTER, true);
		generators.familyOf(Stone.ALABASTER, DFBlockFamily.SMOOTH_ALABASTER, true);
		generators.familyOf(Stone.ALUNITE, DFBlockFamily.ROUGH_ALUNITE, true);
		generators.familyOf(Stone.ALUNITE, DFBlockFamily.SMOOTH_ALUNITE, true);
		generators.familyOf(Stone.ANHYDRITE, DFBlockFamily.ROUGH_ANHYDRITE, true);
		generators.familyOf(Stone.ANHYDRITE, DFBlockFamily.SMOOTH_ANHYDRITE, true);
		generators.familyOf(Stone.BAUXITE, DFBlockFamily.ROUGH_BAUXITE, true);
		generators.familyOf(Stone.BAUXITE, DFBlockFamily.SMOOTH_BAUXITE, true);
		generators.familyOf(Stone.BITUMINOUS_COAL, DFBlockFamily.ROUGH_BITUMINOUS_COAL, true);
		generators.familyOf(Stone.BITUMINOUS_COAL, DFBlockFamily.SMOOTH_BITUMINOUS_COAL, true);
		generators.familyOf(Stone.BORAX, DFBlockFamily.ROUGH_BORAX, true);
		generators.familyOf(Stone.BORAX, DFBlockFamily.SMOOTH_BORAX, true);
		generators.familyOf(Stone.BRIMSTONE, DFBlockFamily.ROUGH_BRIMSTONE, true);
		generators.familyOf(Stone.BRIMSTONE, DFBlockFamily.SMOOTH_BRIMSTONE, true);
		generators.familyOf(Stone.CALCITE, DFBlockFamily.ROUGH_CALCITE, true);
		generators.familyOf(Stone.CALCITE, DFBlockFamily.SMOOTH_CALCITE, true);
		generators.familyOf(Stone.CHROMITE, DFBlockFamily.ROUGH_CHROMITE, true);
		generators.familyOf(Stone.CHROMITE, DFBlockFamily.SMOOTH_CHROMITE, true);
		generators.familyOf(Stone.CINNABAR, DFBlockFamily.ROUGH_CINNABAR, true);
		generators.familyOf(Stone.CINNABAR, DFBlockFamily.SMOOTH_CINNABAR, true);
		generators.familyOf(Stone.COBALTITE, DFBlockFamily.ROUGH_COBALTITE, true);
		generators.familyOf(Stone.COBALTITE, DFBlockFamily.SMOOTH_COBALTITE, true);
		generators.familyOf(Stone.CRYOLITE, DFBlockFamily.ROUGH_CRYOLITE, true);
		generators.familyOf(Stone.CRYOLITE, DFBlockFamily.SMOOTH_CRYOLITE, true);
		generators.familyOf(Stone.GRAPHITE, DFBlockFamily.ROUGH_GRAPHITE, true);
		generators.familyOf(Stone.GRAPHITE, DFBlockFamily.SMOOTH_GRAPHITE, true);
		generators.familyOf(Stone.GYPSUM, DFBlockFamily.ROUGH_GYPSUM, true);
		generators.familyOf(Stone.GYPSUM, DFBlockFamily.SMOOTH_GYPSUM, true);
		generators.familyOf(Stone.HORNBLENDE, DFBlockFamily.ROUGH_HORNBLENDE, true);
		generators.familyOf(Stone.HORNBLENDE, DFBlockFamily.SMOOTH_HORNBLENDE, true);
		generators.familyOf(Stone.ILMENITE, DFBlockFamily.ROUGH_ILMENITE, true);
		generators.familyOf(Stone.ILMENITE, DFBlockFamily.SMOOTH_ILMENITE, true);
		generators.familyOf(Stone.JET, DFBlockFamily.ROUGH_JET, true);
		generators.familyOf(Stone.JET, DFBlockFamily.SMOOTH_JET, true);
		generators.familyOf(Stone.KAOLINITE, DFBlockFamily.ROUGH_KAOLINITE, true);
		generators.familyOf(Stone.KAOLINITE, DFBlockFamily.SMOOTH_KAOLINITE, true);
		generators.familyOf(Stone.CERULEAN, DFBlockFamily.ROUGH_CERULEAN, true);
		generators.familyOf(Stone.CERULEAN, DFBlockFamily.SMOOTH_CERULEAN, true);
		generators.familyOf(Stone.LIGNITE, DFBlockFamily.ROUGH_LIGNITE, true);
		generators.familyOf(Stone.LIGNITE, DFBlockFamily.SMOOTH_LIGNITE, true);
		generators.familyOf(Stone.MARCASITE, DFBlockFamily.ROUGH_MARCASITE, true);
		generators.familyOf(Stone.MARCASITE, DFBlockFamily.SMOOTH_MARCASITE, true);
		generators.familyOf(Stone.MICA, DFBlockFamily.ROUGH_MICA, true);
		generators.familyOf(Stone.MICA, DFBlockFamily.SMOOTH_MICA, true);
		generators.familyOf(Stone.MICROCLINE, DFBlockFamily.ROUGH_MICROCLINE, true);
		generators.familyOf(Stone.MICROCLINE, DFBlockFamily.SMOOTH_MICROCLINE, true);
		generators.familyOf(Stone.OLIVINE, DFBlockFamily.ROUGH_OLIVINE, true);
		generators.familyOf(Stone.OLIVINE, DFBlockFamily.SMOOTH_OLIVINE, true);
		generators.familyOf(Stone.ORPIMENT, DFBlockFamily.ROUGH_ORPIMENT, true);
		generators.familyOf(Stone.ORPIMENT, DFBlockFamily.SMOOTH_ORPIMENT, true);
		generators.familyOf(Stone.ORTHOCLASE, DFBlockFamily.ROUGH_ORTHOCLASE, true);
		generators.familyOf(Stone.ORTHOCLASE, DFBlockFamily.SMOOTH_ORTHOCLASE, true);
		generators.familyOf(Stone.PERICLASE, DFBlockFamily.ROUGH_PERICLASE, true);
		generators.familyOf(Stone.PERICLASE, DFBlockFamily.SMOOTH_PERICLASE, true);
		generators.familyOf(Stone.PETRIFIED_WOOD, DFBlockFamily.ROUGH_PETRIFIED_WOOD, true);
		generators.familyOf(Stone.PETRIFIED_WOOD, DFBlockFamily.SMOOTH_PETRIFIED_WOOD, true);
		generators.familyOf(Stone.PITCHBLENDE, DFBlockFamily.ROUGH_PITCHBLENDE, true);
		generators.familyOf(Stone.PITCHBLENDE, DFBlockFamily.SMOOTH_PITCHBLENDE, true);
		generators.familyOf(Stone.PUDDINGSTONE, DFBlockFamily.ROUGH_PUDDINGSTONE, true);
		generators.familyOf(Stone.PUDDINGSTONE, DFBlockFamily.SMOOTH_PUDDINGSTONE, true);
		generators.familyOf(Stone.PYROLUSITE, DFBlockFamily.ROUGH_PYROLUSITE, true);
		generators.familyOf(Stone.PYROLUSITE, DFBlockFamily.SMOOTH_PYROLUSITE, true);
		generators.familyOf(Stone.REALGAR, DFBlockFamily.ROUGH_REALGAR, true);
		generators.familyOf(Stone.REALGAR, DFBlockFamily.SMOOTH_REALGAR, true);
		generators.familyOf(Stone.RUTILE, DFBlockFamily.ROUGH_RUTILE, true);
		generators.familyOf(Stone.RUTILE, DFBlockFamily.SMOOTH_RUTILE, true);
		generators.familyOf(Stone.SALTPETER, DFBlockFamily.ROUGH_SALTPETER, true);
		generators.familyOf(Stone.SALTPETER, DFBlockFamily.SMOOTH_SALTPETER, true);
		generators.familyOf(Stone.SATINSPAR, DFBlockFamily.ROUGH_SATINSPAR, true);
		generators.familyOf(Stone.SATINSPAR, DFBlockFamily.SMOOTH_SATINSPAR, true);
		generators.familyOf(Stone.SELENITE, DFBlockFamily.ROUGH_SELENITE, true);
		generators.familyOf(Stone.SELENITE, DFBlockFamily.SMOOTH_SELENITE, true);
		generators.familyOf(Stone.SERPENTINE, DFBlockFamily.ROUGH_SERPENTINE, true);
		generators.familyOf(Stone.SERPENTINE, DFBlockFamily.SMOOTH_SERPENTINE, true);
		generators.familyOf(Stone.STIBNITE, DFBlockFamily.ROUGH_STIBNITE, true);
		generators.familyOf(Stone.STIBNITE, DFBlockFamily.SMOOTH_STIBNITE, true);
		generators.familyOf(Stone.SYLVITE, DFBlockFamily.ROUGH_SYLVITE, true);
		generators.familyOf(Stone.SYLVITE, DFBlockFamily.SMOOTH_SYLVITE, true);
		generators.familyOf(Stone.TALC, DFBlockFamily.ROUGH_TALC, true);
		generators.familyOf(Stone.TALC, DFBlockFamily.SMOOTH_TALC, true);
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
			return !block.getId().getNamespace().equals("minecraft");
		}

		public BlockModelGenerators.BlockFamilyProvider familyOf(
			Stone stone,
			BlockFamily family,
			boolean isCustomBlock
		) {
			Material material = stone.texture.material(stone.color);
			TextureMapping mapping = new TextureMapping()
				.put(DFTextureSlot.DOOR_BOTTOM, stone.door.bottom(stone.color))
				.put(DFTextureSlot.DOOR_TOP, stone.door.top(stone.color))
				.put(TextureSlot.ALL, material);
			BlockModelGenerators.BlockFamilyProvider provider = blockModels.new BlockFamilyProvider(
				mapping);
			if (isCustomBlock) {
				Block block = family.getBaseBlock();
				ModelTemplate template = TEXTURED_MODELS
					.getOrDefault(block, TexturedModel.CUBE.get(block))
					.getTemplate();
				provider.fullBlock(block, template);
			}
			return provider.generateFor(family);
		}
	}

}