package com.lancelotbronner.df.blocks;

import com.lancelotbronner.df.datagen.MyModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.lancelotbronner.df.blocks.DFBlocks.register;

public class DFBlockFamilies {
	public final static String RECIPE_GROUP_PREFIX_WOODEN = "wooden";
	public final static String RECIPE_UNLOCKED_BY_HAS_PLANKS = "has_planks";

	public record DFWoodFamily(
		PlanksFamily planks, TreeFamily tree, FurnitureFamily furniture
	) {
		public DFWoodFamily(String name) {
			PlanksFamily planks = new PlanksFamily(name);
			TreeFamily tree = new TreeFamily(name);
			FurnitureFamily furniture = new FurnitureFamily();
			this(planks, tree, furniture);
		}

		public void generate(MyModelProvider.ModelGenerators generators) {
			planks.generate(generators);
			tree.generate(generators);
		}
	}

	public record TreeFamily(
		DeferredBlock<RotatedPillarBlock> log,
		DeferredBlock<RotatedPillarBlock> wood,
		DeferredBlock<RotatedPillarBlock> strippedLog,
		DeferredBlock<RotatedPillarBlock> strippedWood,
		DeferredBlock<TintedParticleLeavesBlock> leaves,
		DeferredBlock<SaplingBlock> sapling,
		DeferredBlock<FlowerPotBlock> pottedSapling
	) {
		public TreeFamily(String name) {
			DeferredBlock<RotatedPillarBlock> log = register(
				String.format("%s_log", name),
				RotatedPillarBlock::new,
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
			DeferredBlock<RotatedPillarBlock> wood = register(
				String.format("%s_wood", name),
				RotatedPillarBlock::new,
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
			DeferredBlock<RotatedPillarBlock> strippedLog = register(
				String.format(
					"stripped_%s_log",
					name),
				RotatedPillarBlock::new,
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
			DeferredBlock<RotatedPillarBlock> strippedWood = register(
				String.format(
					"stripped_%s_wood",
					name),
				RotatedPillarBlock::new,
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
			DeferredBlock<TintedParticleLeavesBlock> leaves = register(
				String.format(
					"%s_leaves",
					name),
				p -> new TintedParticleLeavesBlock(0.01f, p),
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
			DeferredBlock<SaplingBlock> sapling = register(
				String.format("%s_sapling", name),
				p -> new SaplingBlock(TreeGrower.BIRCH, p),
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
			DeferredBlock<FlowerPotBlock> pottedSapling = register(
				String.format("potted_%s_sapling", name),
				p -> new FlowerPotBlock(sapling.get(), p),
				p -> BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING));
			this(log, wood, strippedLog, strippedWood, leaves, sapling, pottedSapling);
		}

		public void generate(MyModelProvider.ModelGenerators generators) {
			generators
				.blockModels()
				.woodProvider(log.get())
				.logWithHorizontal(log.get())
				.wood(wood.get());
			generators
				.blockModels()
				.woodProvider(strippedLog.get())
				.logWithHorizontal(strippedLog.get())
				.wood(strippedWood.get());
			generators
				.blockModels()
				.createPlantWithDefaultItem(
					sapling.get(),
					pottedSapling.get(),
					BlockModelGenerators.PlantType.NOT_TINTED);
			//TODO: leaves tint color
			generators
				.blockModels()
				.createTintedLeaves(leaves.get(), TexturedModel.LEAVES, -12012264);
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
		DeferredBlock<WallSignBlock> wallSign,
		DeferredBlock<CeilingHangingSignBlock> hangingSign,
		DeferredBlock<WallHangingSignBlock> wallHangingSign
	) {
		public PlanksFamily(String name) {
			DeferredBlock<Block> planks = register(String.format("%s_planks", name), Block::new);
			DeferredBlock<SlabBlock> slab = register(
				String.format("%s_slab", name),
				SlabBlock::new);
			DeferredBlock<StairBlock> stairs = register(
				String.format("%s_stairs", name), p -> new StairBlock(
					planks
						.get()
						.defaultBlockState(), p));
			DeferredBlock<PressurePlateBlock> pressurePlate = register(
				String.format(
					"%s_pressure_plate",
					name),
				p -> new PressurePlateBlock(DFBlockSetType.WOOD, p));
			DeferredBlock<ButtonBlock> button = register(
				String.format("%s_button", name),
				p -> new ButtonBlock(DFBlockSetType.WOOD, 20, p));
			DeferredBlock<FenceBlock> fence = register(
				String.format("%s_fence", name),
				FenceBlock::new);
			DeferredBlock<FenceGateBlock> fenceGate = register(
				String.format("%s_fence_gate", name),
				p -> new FenceGateBlock(DFWoodType.GENERIC, p));
			DeferredBlock<StandingSignBlock> standingSign = register(
				String.format("%s_sign", name),
				p -> new StandingSignBlock(DFWoodType.GENERIC, p));
			DeferredBlock<WallSignBlock> wallSign = register(
				String.format("%s_wall_sign", name),
				p -> new WallSignBlock(DFWoodType.GENERIC, p));
			DeferredBlock<CeilingHangingSignBlock> hangingSign = register(
				String.format(
					"%s_hanging_sign",
					name),
				p -> new CeilingHangingSignBlock(DFWoodType.GENERIC, p));
			DeferredBlock<WallHangingSignBlock> wallHangingSign = register(
				String.format(
					"%s_wall_hanging_sign",
					name),
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
				wallSign,
				hangingSign,
				wallHangingSign);
		}

		public void generate(MyModelProvider.ModelGenerators generators) {
			var family = new BlockFamily.Builder(planks.get())
				.recipeGroupPrefix(RECIPE_GROUP_PREFIX_WOODEN)
				.recipeUnlockedBy(RECIPE_UNLOCKED_BY_HAS_PLANKS);
			if (generators.shouldGenerate(slab))
				family.slab(slab.get());
			if (generators.shouldGenerate(stairs))
				family.stairs(stairs.get());
			if (generators.shouldGenerate(pressurePlate))
				family.pressurePlate(pressurePlate.get());
			if (generators.shouldGenerate(button))
				family.button(button.get());
			if (generators.shouldGenerate(fence))
				family.fence(fence.get());
			if (generators.shouldGenerate(fenceGate))
				family.fenceGate(fenceGate.get());
			if (generators.shouldGenerate(standingSign) && generators.shouldGenerate(wallSign))
				family.sign(standingSign.get(), wallSign.get());
			generators
				.familyProviderFor(planks)
				.generateFor(family.getFamily());
			if (generators.shouldGenerate(hangingSign) && generators.shouldGenerate(wallHangingSign))
				generators
					.blockModels()
					.createHangingSign(planks.get(), hangingSign.get(), wallHangingSign.get());
			//TODO: this.createShelf(Blocks.ACACIA_SHELF, Blocks.STRIPPED_ACACIA_LOG);
		}
	}

	public record DFStoneFamily(
		StoneFamily rough,
		DeferredBlock<Block> roughEngraved,
		FurnitureFamily roughFurniture,
		StoneworkingFamily smooth,
		DeferredBlock<Block> smoothEngraved,
		StoneworkingFamily blocks,
		FurnitureFamily blocksFurniture,
		StoneFamily cobble,
		StoneFamily tiles
	) {
		public DFStoneFamily(String name) {
			String nameOfRough = String.format("rough_%s", name);
			String nameOfSmooth = String.format("smooth_%s", name);
			String nameOfBlocks = String.format("%s_bricks", name);

			// Rough Stone
			StoneFamily rough = new StoneFamily(nameOfRough);
			DeferredBlock<Block> roughEngraved = register(
				String.format("engraved_%s", nameOfRough),
				Block::new);
			FurnitureFamily roughFurniture = new FurnitureFamily();
			// Smooth Stone
			StoneworkingFamily smooth = new StoneworkingFamily(String.format("smooth_%s", name));
			DeferredBlock<Block> smoothEngraved = register(
				String.format(
					"engraved_%s",
					nameOfSmooth), Block::new);
			// Stone Blocks
			StoneworkingFamily blocks = new StoneworkingFamily(nameOfBlocks);
			FurnitureFamily blocksFurniture = new FurnitureFamily();
			// Cobble Stone
			StoneFamily cobble = new StoneFamily(String.format("%s_cobble", name));
			// Stone Tiles
			StoneFamily tiles = new StoneFamily(String.format("%s_tiles", name));
			this(
				rough,
				roughEngraved,
				roughFurniture,
				smooth,
				smoothEngraved,
				blocks,
				blocksFurniture,
				cobble,
				tiles);
		}

		public void generate(MyModelProvider.ModelGenerators generators) {
			rough.generate(generators);
			generators
				.blockModels()
				.familyWithExistingFullBlock(rough.stone.get())
				.fullBlockVariant(roughEngraved.get());
			smooth.generate(generators);
			generators
				.blockModels()
				.familyWithExistingFullBlock(rough.stone.get())
				.fullBlockVariant(smoothEngraved.get());
			blocks.generate(generators);
			cobble.generate(generators);
			tiles.generate(generators);
		}
	}

	public record StoneFamily(
		DeferredBlock<Block> stone,
		DeferredBlock<SlabBlock> slab,
		DeferredBlock<WallBlock> wall,
		DeferredBlock<StairBlock> stairs
	) {
		public StoneFamily(String name) {
			DeferredBlock<Block> block = register(name, Block::new);
			DeferredBlock<SlabBlock> slab = register(
				String.format("%s_slab", name),
				SlabBlock::new);
			DeferredBlock<WallBlock> wall = register(
				String.format("%s_wall", name),
				WallBlock::new);
			DeferredBlock<StairBlock> stairs = register(
				String.format("%s_stairs", name), p -> new StairBlock(
					block
						.get()
						.defaultBlockState(), p));
			this(block, slab, wall, stairs);
		}

		public void generate(MyModelProvider.ModelGenerators generators) {
			generators
				.blockModels()
				.family(stone.get())
				.slab(slab.get())
				.wall(wall.get())
				.stairs(stairs.get());
		}
	}

	public record StoneworkingFamily(
		StoneFamily structural,
		DeferredBlock<PressurePlateBlock> pressurePlate,
		DeferredBlock<ButtonBlock> button,
		DeferredBlock<TrapDoorBlock> hatch,
		DeferredBlock<DoorBlock> door
	) {
		public StoneworkingFamily(String name) {
			DeferredBlock<PressurePlateBlock> pressurePlate = register(
				String.format("%s_pressure_plate", name),
				p -> new PressurePlateBlock(DFBlockSetType.STONE, p));
			DeferredBlock<ButtonBlock> button = register(
				String.format("%s_button", name),
				p -> new ButtonBlock(DFBlockSetType.STONE, 20, p));
			DeferredBlock<TrapDoorBlock> hatch = register(
				String.format("%s_trapdoor", name),
				p -> new TrapDoorBlock(DFBlockSetType.STONE, p));
			DeferredBlock<DoorBlock> door = register(
				String.format("%s_door", name),
				p -> new DoorBlock(DFBlockSetType.STONE, p));
			this(new StoneFamily(name), pressurePlate, button, hatch, door);
		}

		public void generate(MyModelProvider.ModelGenerators generators) {
			structural.generate(generators);
			generators
				.blockModels()
				.familyWithExistingFullBlock(structural.stone.get())
				.pressurePlate(pressurePlate.get())
				.button(button.get())
				.door(door.get())
				.trapdoor(hatch.get());
		}
	}

	public record FurnitureFamily(
		//TODO: all non-Minecraft DF furniture
	) {}
}
