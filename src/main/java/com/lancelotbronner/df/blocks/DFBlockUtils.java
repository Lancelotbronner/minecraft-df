package com.lancelotbronner.df.blocks;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Stone;
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

	public static DeferredBlock<Block> rough(Stone stone) {
		String name = String.format("rough_%s", stone.name);
		DeferredBlock<Block> block = DwarfFortress.BLOCKS.registerBlock(name, Block::new);
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<Block> smooth(Stone stone) {
		String name = String.format("smooth_%s", stone.name);
		DeferredBlock<Block> block = DwarfFortress.BLOCKS.registerBlock(name, Block::new);
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<Block> engraved(Stone stone) {
		String name = String.format("engraved_%s", stone.name);
		DeferredBlock<Block> block = DwarfFortress.BLOCKS.registerBlock(name, Block::new);
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
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

	public static DeferredBlock<FlowerPotBlock> pottedPlant(String name, DeferredBlock<? extends Block> plant) {
		name = String.format("potted_%s", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, plant, p));
	}

	public static DeferredBlock<SlabBlock> slab(String name, Block template) {
		name = String.format("%s_slab", name);
		return DwarfFortress.BLOCKS.registerBlock(name, SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(template));
	}

	public static DeferredBlock<SlabBlock> smoothSlab(Stone stone) {
		String name = String.format("smooth_%s_slab", stone.name);
		DeferredBlock<SlabBlock> block = DwarfFortress.BLOCKS.registerBlock(
			name,
			SlabBlock::new,
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<SlabBlock> roughSlab(Stone stone) {
		String name = String.format("rough_%s_slab", stone.name);
		DeferredBlock<SlabBlock> block = DwarfFortress.BLOCKS.registerBlock(
			name,
			SlabBlock::new,
			() -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<StairBlock> stairs(String name, DeferredBlock<Block> base) {
		name = String.format("%s_stairs", name);
		return DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new StairBlock(base.get().defaultBlockState(), p),
			() -> BlockBehaviour.Properties.ofFullCopy(base.get()));
	}

	public static DeferredBlock<StairBlock> roughStairs(Stone stone, DeferredBlock<Block> base) {
		String name = String.format("rough_%s_stairs", stone.name);
		DeferredBlock<StairBlock> block = DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new StairBlock(base.get().defaultBlockState(), p),
			() -> BlockBehaviour.Properties.ofFullCopy(base.get()));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<StairBlock> smoothStairs(Stone stone, DeferredBlock<Block> base) {
		String name = String.format("smooth_%s_stairs", stone.name);
		DeferredBlock<StairBlock> block = DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new StairBlock(base.get().defaultBlockState(), p),
			() -> BlockBehaviour.Properties.ofFullCopy(base.get()));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<WallBlock> wall(String name) {
		name = String.format("%s_wall", name);
		return DwarfFortress.BLOCKS.registerBlock(name, WallBlock::new);
	}

	public static DeferredBlock<WallBlock> roughWall(Stone stone) {
		String name = String.format("rough_%s_wall", stone.name);
		DeferredBlock<WallBlock> block = DwarfFortress.BLOCKS.registerBlock(name, WallBlock::new);
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<WallBlock> smoothWall(Stone stone) {
		String name = String.format("smooth_%s_wall", stone.name);
		DeferredBlock<WallBlock> block = DwarfFortress.BLOCKS.registerBlock(name, WallBlock::new);
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<FenceBlock> fence(String name) {
		name = String.format("%s_fence", name);
		return DwarfFortress.BLOCKS.registerBlock(name, FenceBlock::new);
	}

	public static DeferredBlock<FenceGateBlock> fenceGate(String name, WoodType woodType) {
		name = String.format("%s_fence_gate", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new FenceGateBlock(woodType, p));
	}

	public static DeferredBlock<PressurePlateBlock> pressurePlate(String name, BlockSetType blockSetType) {
		name = String.format("%s_pressure_plate", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new PressurePlateBlock(blockSetType, p));
	}

	public static DeferredBlock<PressurePlateBlock> pressurePlate(
		Stone stone
	) {
		String name = String.format("%s_pressure_plate", stone.name);
		DeferredBlock<PressurePlateBlock> block = DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new PressurePlateBlock(DFBlockSetType.STONE, p));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<ButtonBlock> button(String name, BlockSetType blockSetType, int ticksToStayPressed) {
		name = String.format("%s_button", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new ButtonBlock(blockSetType, ticksToStayPressed, p));
	}

	public static DeferredBlock<ButtonBlock> button(
		Stone stone
	) {
		String name = String.format("%s_button", stone.name);
		DeferredBlock<ButtonBlock> block = DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new ButtonBlock(DFBlockSetType.STONE, 20, p));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<TrapDoorBlock> trapdoor(String name, BlockSetType blockSetType) {
		name = String.format("%s_trapdoor", name);
		DeferredBlock<TrapDoorBlock> block = DwarfFortress.BLOCKS.registerBlock(name, p -> new TrapDoorBlock(blockSetType, p));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<TrapDoorBlock> trapdoor(
		Stone stone
	) {
		String name = String.format("%s_trapdoor", stone.name);
		DeferredBlock<TrapDoorBlock> block = DwarfFortress.BLOCKS.registerBlock(
			name,
			p -> new TrapDoorBlock(DFBlockSetType.STONE, p));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<DoorBlock> door(String name, BlockSetType blockSetType) {
		name = String.format("%s_door", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new DoorBlock(blockSetType, p));
	}

	public static DeferredBlock<DoorBlock> door(
		Stone stone
	) {
		String name = String.format("%s_door", stone.name);
		DeferredBlock<DoorBlock> block = DwarfFortress.BLOCKS.registerBlock(name, p -> new DoorBlock(DFBlockSetType.STONE, p));
		DwarfFortress.ITEMS.registerSimpleBlockItem(name, block);
		return block;
	}

	public static DeferredBlock<StandingSignBlock> standingSign(String name, WoodType woodType) {
		name = String.format("%s_sign", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new StandingSignBlock(woodType, p));
	}

	public static DeferredBlock<WallSignBlock> wallSign(String name, WoodType woodType) {
		name = String.format("%s_wall_sign", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new WallSignBlock(woodType, p));
	}

	public static DeferredBlock<CeilingHangingSignBlock> ceilingHangingSign(String name, WoodType woodType) {
		name = String.format("%s_hanging_sign", name);
		return DwarfFortress.BLOCKS.registerBlock(name, p -> new CeilingHangingSignBlock(woodType, p));
	}

	public static DeferredBlock<WallHangingSignBlock> wallHangingSign(String name, WoodType woodType) {
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
