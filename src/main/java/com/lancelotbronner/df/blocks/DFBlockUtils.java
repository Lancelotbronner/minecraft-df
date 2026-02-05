package com.lancelotbronner.df.blocks;

import com.lancelotbronner.df.DwarfFortress;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;

public class DFBlockUtils {
	public static DeferredBlock<Block> block(String name) {
		return DwarfFortress.BLOCKS.registerBlock(name, Block::new);
	}

	public static DeferredBlock<Block> planks(String name) {
		name = String.format("%s_planks", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			Block::new,
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
	}

	public static DeferredBlock<RotatedPillarBlock> log(String name) {
		name = String.format("%s_log", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			RotatedPillarBlock::new,
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
	}

	public static DeferredBlock<RotatedPillarBlock> strippedLog(String name) {
		name = String.format("stripped_%s_log", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			RotatedPillarBlock::new,
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
	}

	public static DeferredBlock<RotatedPillarBlock> wood(String name) {
		name = String.format("%s_wood", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			RotatedPillarBlock::new,
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
	}

	public static DeferredBlock<RotatedPillarBlock> strippedWood(String name) {
		name = String.format("stripped_%s_wood", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			RotatedPillarBlock::new,
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
	}

	public static DeferredBlock<TintedParticleLeavesBlock> leaves(String name) {
		name = String.format("%s_leaves", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new TintedParticleLeavesBlock(0.01f, p),
			p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
	}

	public static DeferredBlock<SaplingBlock> sapling(String name, TreeGrower tree) {
		name = String.format("%s_sapling", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new SaplingBlock(tree, p),
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
	}

	public static DeferredBlock<FlowerPotBlock> pottedPlant(
		String name,
		DeferredBlock<? extends Block> plant
	) {
		name = String.format("potted_%s", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, plant, p));
	}

	public static DeferredBlock<SlabBlock> slab(String name, Block template) {
		name = String.format("%s_slab", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			SlabBlock::new,
			() -> BlockBehaviour.Properties.ofFullCopy(template));
	}

	public static DeferredBlock<StairBlock> stairs(String name, Block base) {
		name = String.format("%s_stairs", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new StairBlock(base.defaultBlockState(), p),
			() -> BlockBehaviour.Properties.ofFullCopy(base));
	}

	public static DeferredBlock<WallBlock> wall(String name) {
		name = String.format("%s_wall", name);
		return DwarfFortress.BLOCKS.registerBlock(name, WallBlock::new);
	}

	public static DeferredBlock<FenceBlock> fence(String name) {
		name = String.format("%s_fence", name);
		return DwarfFortress.BLOCKS.registerBlock(name, FenceBlock::new);
	}

	public static DeferredBlock<FenceGateBlock> fenceGate(String name, WoodType woodType) {
		name = String.format("%s_fence_gate", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new FenceGateBlock(woodType, p));
	}

	public static DeferredBlock<PressurePlateBlock> pressurePlate(
		String name,
		BlockSetType blockSetType
	) {
		name = String.format("%s_pressure_plate", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new PressurePlateBlock(blockSetType, p));
	}

	public static DeferredBlock<ButtonBlock> button(
		String name,
		BlockSetType blockSetType,
		int ticksToStayPressed
	) {
		name = String.format("%s_button", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new ButtonBlock(blockSetType, ticksToStayPressed, p));
	}

	public static DeferredBlock<StandingSignBlock> standingSign(String name, WoodType woodType) {
		name = String.format("%s_sign", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new StandingSignBlock(woodType, p));
	}

	public static DeferredBlock<WallSignBlock> wallSign(String name, WoodType woodType) {
		name = String.format("%s_wall_sign", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new WallSignBlock(woodType, p));
	}

	public static DeferredBlock<CeilingHangingSignBlock> ceilingHangingSign(
		String name,
		WoodType woodType
	) {
		name = String.format("%s_hanging_sign", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new CeilingHangingSignBlock(woodType, p));
	}

	public static DeferredBlock<WallHangingSignBlock> wallHangingSign(
		String name,
		WoodType woodType
	) {
		name = String.format("%s_wall_hanging_sign", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new WallHangingSignBlock(woodType, p));
	}

	//	public static DeferredTree tree(Tree tree) {
	//		var deferredPlanks = planks(tree.name);
	//		var planks = deferredPlanks.get();
	//		return new DeferredTree(
	//			tree,
	//			slab(tree.name, planks),
	//			stairs(tree.name, planks),
	//			pressurePlate(tree.name)
	//		);
	//	}
	//
	//	public record DeferredTree(
	//		Tree tree,
	//		DeferredBlock<Block> planks,
	//		DeferredBlock<SlabBlock> slab,
	//		DeferredBlock<StairBlock> stairs,
	//		DeferredBlock<PressurePlateBlock> pressurePlate,
	//		DeferredBlock<ButtonBlock> button,
	//		DeferredBlock<FenceBlock> fence,
	//		DeferredBlock<FenceGateBlock> fenceGate,
	//		DeferredBlock<StandingSignBlock> standingSign,
	//		DeferredBlock<WallSignBlock> wallSign,
	//		DeferredBlock<CeilingHangingSignBlock> hangingSign,
	//		DeferredBlock<WallHangingSignBlock> wallHangingSign,
	//		DeferredBlock<RotatedPillarBlock> log,
	//		DeferredBlock<RotatedPillarBlock> strippedLog,
	//		DeferredBlock<RotatedPillarBlock> wood,
	//		DeferredBlock<RotatedPillarBlock> strippedWood,
	//		DeferredBlock<TintedParticleLeavesBlock> leaves,
	//		DeferredBlock<SaplingBlock> sapling,
	//		DeferredBlock<FlowerPotBlock> pottedSapling
	//	) {}
}
