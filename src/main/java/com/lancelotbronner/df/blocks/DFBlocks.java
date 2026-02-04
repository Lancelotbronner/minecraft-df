package com.lancelotbronner.df.blocks;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Stone;
import com.lancelotbronner.df.data.Wood;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.EnumMap;

public class DFBlocks {
	public static final EnumMap<Stone, DFStoneFamily> STONES = new EnumMap<>(Stone.class);
	public static final EnumMap<Wood, DFWoodFamily> WOODS = new EnumMap<>(Wood.class);

	static {
		for (Stone stone : Stone.values())
			STONES.put(stone, new DFStoneFamily(stone.name));
		for (Wood wood : Wood.values())
			WOODS.put(wood, new DFWoodFamily(wood.name));
	}

	public static void touch() {}

	public record DFWoodFamily(
		PlanksFamily planks, TreeFamily tree, FurnitureFamily furniture
	) {
		public DFWoodFamily(String name) {
			PlanksFamily planks = new PlanksFamily(name);
			TreeFamily tree = new TreeFamily(name);
			FurnitureFamily furniture = new FurnitureFamily(name, DFBlockSetType.WOOD);
			this(planks, tree, furniture);
		}

		public void generate(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
			planks.generate(blockModels, itemModels);
			tree.generate(blockModels, itemModels);
			furniture.generate(
				blockModels,
				itemModels,
				blockModels.familyWithExistingFullBlock(planks.planks.get()));
		}
	}

	public record TreeFamily(
		DeferredBlock<RotatedPillarBlock> log,
		DeferredBlock<RotatedPillarBlock> strippedLog,
		DeferredBlock<RotatedPillarBlock> strippedWood,
		DeferredBlock<TintedParticleLeavesBlock> leaves,
		DeferredBlock<SaplingBlock> sapling
	) {
		public TreeFamily(String name) {
			DeferredBlock<RotatedPillarBlock> log = DwarfFortress.BLOCKS.registerBlock(
				name,
				RotatedPillarBlock::new,
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
			DeferredBlock<RotatedPillarBlock> strippedLog = DwarfFortress.BLOCKS.registerBlock(
				name,
				RotatedPillarBlock::new,
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
			DeferredBlock<RotatedPillarBlock> strippedWood = DwarfFortress.BLOCKS.registerBlock(
				name,
				RotatedPillarBlock::new,
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
			DeferredBlock<TintedParticleLeavesBlock> leaves = DwarfFortress.BLOCKS.registerBlock(
				name,
				p -> new TintedParticleLeavesBlock(0.01f, p),
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
			DeferredBlock<SaplingBlock> sapling = DwarfFortress.BLOCKS.registerBlock(
				name,
				p -> new SaplingBlock(TreeGrower.BIRCH, p),
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
			this(log, strippedLog, strippedWood, leaves, sapling);
		}

		public void generate(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
			blockModels.createRotatableColumn(log.get());
			blockModels.createRotatableColumn(strippedLog.get());
			blockModels.createRotatableColumn(strippedWood.get());
		}
	}

	public record PlanksFamily(
		DeferredBlock<Block> planks,
		DeferredBlock<SlabBlock> slab,
		DeferredBlock<StairBlock> stairs,
		DeferredBlock<PressurePlateBlock> pressurePlate,
		DeferredBlock<ButtonBlock> button,
		DeferredBlock<FenceBlock> fence,
		DeferredBlock<FenceGateBlock> fenceGate,
		DeferredBlock<StandingSignBlock> standingSign,
		DeferredBlock<CeilingHangingSignBlock> hangingSign,
		DeferredBlock<WallHangingSignBlock> wallHangingSign
	) {
		public PlanksFamily(String name) {
			DeferredBlock<Block> planks = DwarfFortress.BLOCKS.registerBlock(name, Block::new);
			DeferredBlock<SlabBlock> slab = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_slab",
					name), SlabBlock::new);
			DeferredBlock<StairBlock> stairs = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_stairs", name), p -> new StairBlock(
					planks
						.get()
						.defaultBlockState(), p));
			DeferredBlock<PressurePlateBlock> pressurePlate = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_pressure_plate", name),
				p -> new PressurePlateBlock(DFBlockSetType.WOOD, p));
			DeferredBlock<ButtonBlock> button = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_button",
					name), p -> new ButtonBlock(DFBlockSetType.WOOD, 20, p));
			DeferredBlock<FenceBlock> fence = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_fence",
					name), FenceBlock::new);
			DeferredBlock<FenceGateBlock> fenceGate = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_fence_gate",
					name),
				p -> new FenceGateBlock(DFWoodType.GENERIC, p));
			DeferredBlock<StandingSignBlock> standingSign = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_sign", name),
				p -> new StandingSignBlock(DFWoodType.GENERIC, p));
			DeferredBlock<CeilingHangingSignBlock> hangingSign = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_hanging_sign", name),
				p -> new CeilingHangingSignBlock(DFWoodType.GENERIC, p));
			DeferredBlock<WallHangingSignBlock> wallHangingSign = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_hanging_sign", name),
				p -> new WallHangingSignBlock(DFWoodType.GENERIC, p));
			this(
				planks,
				slab,
				stairs,
				pressurePlate,
				button,
				fence,
				fenceGate,
				standingSign,
				hangingSign,
				wallHangingSign);
		}

		public void generate(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
			blockModels
				.family(planks.get())
				.slab(slab.get())
				.stairs(stairs.get())
				.pressurePlate(pressurePlate.get())
				.button(button.get())
				.fence(fence.get())
				.fenceGate(fenceGate.get())
				.sign(standingSign.get());
			blockModels.createHangingSign(planks.get(), hangingSign.get(), wallHangingSign.get());
		}
	}

	public record DFStoneFamily(
		StoneFamily rough,
		StoneFamily smooth,
		CobblestoneFamily cobble,
		CobblestoneFamily blocks,
		CobblestoneFamily tiles,
		FurnitureFamily roughFurniture,
		FurnitureFamily blocksFurniture
	) {
		public DFStoneFamily(String name) {
			String nameOfRough = String.format("rough_%s", name);
			String nameOfBlocks = String.format("%s_bricks", name);
			StoneFamily rough = new StoneFamily(nameOfRough);
			StoneFamily smooth = new StoneFamily(String.format("smooth_%s", name));
			CobblestoneFamily cobble = new CobblestoneFamily(String.format("%s_cobble", name));
			CobblestoneFamily blocks = new CobblestoneFamily(nameOfBlocks);
			CobblestoneFamily tiles = new CobblestoneFamily(String.format("%s_tiles", name));
			FurnitureFamily roughFurniture = new FurnitureFamily(nameOfRough, DFBlockSetType.STONE);
			FurnitureFamily blocksFurniture = new FurnitureFamily(
				nameOfBlocks,
				DFBlockSetType.STONE);
			this(rough, smooth, cobble, blocks, tiles, roughFurniture, blocksFurniture);
		}

		public void generate(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
			rough.generate(blockModels, itemModels);
			smooth.generate(blockModels, itemModels);
			cobble.generate(blockModels, itemModels);
			blocks.generate(blockModels, itemModels);
			tiles.generate(blockModels, itemModels);
			roughFurniture.generate(
				blockModels,
				itemModels,
				blockModels.familyWithExistingFullBlock(rough.cobblestone.block.get()));
			blocksFurniture.generate(
				blockModels,
				itemModels,
				blockModels.familyWithExistingFullBlock(blocks.block.get()));
		}
	}

	public record CobblestoneFamily(
		DeferredBlock<Block> block,
		DeferredBlock<SlabBlock> slab,
		DeferredBlock<WallBlock> wall,
		DeferredBlock<StairBlock> stairs
	) {
		public CobblestoneFamily(String name) {
			DeferredBlock<Block> block = DwarfFortress.BLOCKS.registerBlock(name, Block::new);
			DeferredBlock<SlabBlock> slab = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_slab",
					name), SlabBlock::new);
			DeferredBlock<WallBlock> wall = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_wall",
					name), WallBlock::new);
			DeferredBlock<StairBlock> stairs = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_stairs", name), p -> new StairBlock(
					block
						.get()
						.defaultBlockState(), p));
			this(block, slab, wall, stairs);
		}

		public void generate(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
			blockModels
				.family(block.get())
				.slab(slab.get())
				.wall(wall.get())
				.stairs(stairs.get());
		}
	}

	public record StoneFamily(
		CobblestoneFamily cobblestone, DeferredBlock<Block> engraved
	) {
		public StoneFamily(String name) {
			DeferredBlock<Block> engraved = DwarfFortress.BLOCKS.registerBlock(
				String.format("engraved_%s",
					name), Block::new);
			this(new CobblestoneFamily(name), engraved);
		}

		public void generate(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
			blockModels
				.familyWithExistingFullBlock(cobblestone.block.get())
				.fullBlockVariant(engraved.get());
		}
	}

	public record FurnitureFamily(
		DeferredBlock<PressurePlateBlock> pressurePlate,
		DeferredBlock<ButtonBlock> button,
		DeferredBlock<TrapDoorBlock> hatch,
		DeferredBlock<DoorBlock> door
		//TODO: all other furniture
	) {
		public FurnitureFamily(String name, BlockSetType blockSetType) {
			DeferredBlock<PressurePlateBlock> pressurePlate = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_pressure_plate", name),
				p -> new PressurePlateBlock(blockSetType, p));
			DeferredBlock<ButtonBlock> button = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_button",
					name), p -> new ButtonBlock(blockSetType, 20, p));
			DeferredBlock<TrapDoorBlock> hatch = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_trapdoor",
					name), p -> new TrapDoorBlock(blockSetType, p));
			DeferredBlock<DoorBlock> door = DwarfFortress.BLOCKS.registerBlock(
				String.format("%s_door",
					name), p -> new DoorBlock(blockSetType, p));
			this(pressurePlate, button, hatch, door);
		}

		public void generate(
			BlockModelGenerators blockModels,
			ItemModelGenerators itemModels,
			BlockModelGenerators.BlockFamilyProvider blockFamily
		) {
			blockFamily
				.pressurePlate(pressurePlate.get())
				.button(button.get())
				.door(door.get())
				.trapdoor(hatch.get());
		}
	}
}
