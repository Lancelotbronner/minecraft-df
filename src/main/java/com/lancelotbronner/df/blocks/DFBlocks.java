package com.lancelotbronner.df.blocks;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Stone;
import com.lancelotbronner.df.data.Tree;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.EnumMap;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static com.lancelotbronner.df.data.Stone.*;

@SuppressWarnings("unused")
public class DFBlocks {
	public static final EnumMap<Tree, DFBlockFamilies.DFWoodFamily> WOODS = new EnumMap<>(Tree.class);

	// chalk
	public static final DeferredBlock<Block> CHALK_ENGRAVED = DFBlockUtils.engraved(CHALK);
	public static final DeferredBlock<Block> CHALK_ROUGH = DFBlockUtils.rough(CHALK);
	public static final DeferredBlock<Block> CHALK_SMOOTH = DFBlockUtils.smooth(CHALK);
	public static final DeferredBlock<ButtonBlock> CHALK_BUTTON = DFBlockUtils.button(CHALK);
	public static final DeferredBlock<DoorBlock> CHALK_DOOR = DFBlockUtils.door(CHALK);
	public static final DeferredBlock<PressurePlateBlock> CHALK_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CHALK);
	public static final DeferredBlock<SlabBlock> CHALK_ROUGH_SLAB = DFBlockUtils.roughSlab(CHALK);
	public static final DeferredBlock<SlabBlock> CHALK_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CHALK);
	public static final DeferredBlock<StairBlock> CHALK_ROUGH_STAIRS = DFBlockUtils.roughStairs(CHALK, CHALK_ROUGH);
	public static final DeferredBlock<StairBlock> CHALK_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CHALK, CHALK_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CHALK_TRAPDOOR = DFBlockUtils.trapdoor(CHALK);
	public static final DeferredBlock<WallBlock> CHALK_ROUGH_WALL = DFBlockUtils.roughWall(CHALK);
	public static final DeferredBlock<WallBlock> CHALK_SMOOTH_WALL = DFBlockUtils.smoothWall(CHALK);

	// chert
	public static final DeferredBlock<Block> CHERT_ENGRAVED = DFBlockUtils.engraved(CHERT);
	public static final DeferredBlock<Block> CHERT_ROUGH = DFBlockUtils.rough(CHERT);
	public static final DeferredBlock<Block> CHERT_SMOOTH = DFBlockUtils.smooth(CHERT);
	public static final DeferredBlock<ButtonBlock> CHERT_BUTTON = DFBlockUtils.button(CHERT);
	public static final DeferredBlock<DoorBlock> CHERT_DOOR = DFBlockUtils.door(CHERT);
	public static final DeferredBlock<PressurePlateBlock> CHERT_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CHERT);
	public static final DeferredBlock<SlabBlock> CHERT_ROUGH_SLAB = DFBlockUtils.roughSlab(CHERT);
	public static final DeferredBlock<SlabBlock> CHERT_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CHERT);
	public static final DeferredBlock<StairBlock> CHERT_ROUGH_STAIRS = DFBlockUtils.roughStairs(CHERT, CHERT_ROUGH);
	public static final DeferredBlock<StairBlock> CHERT_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CHERT, CHERT_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CHERT_TRAPDOOR = DFBlockUtils.trapdoor(CHERT);
	public static final DeferredBlock<WallBlock> CHERT_ROUGH_WALL = DFBlockUtils.roughWall(CHERT);
	public static final DeferredBlock<WallBlock> CHERT_SMOOTH_WALL = DFBlockUtils.smoothWall(CHERT);

	// claystone
	public static final DeferredBlock<Block> CLAYSTONE_ENGRAVED = DFBlockUtils.engraved(CLAYSTONE);
	public static final DeferredBlock<Block> CLAYSTONE_ROUGH = DFBlockUtils.rough(CLAYSTONE);
	public static final DeferredBlock<Block> CLAYSTONE_SMOOTH = DFBlockUtils.smooth(CLAYSTONE);
	public static final DeferredBlock<ButtonBlock> CLAYSTONE_BUTTON = DFBlockUtils.button(CLAYSTONE);
	public static final DeferredBlock<DoorBlock> CLAYSTONE_DOOR = DFBlockUtils.door(CLAYSTONE);
	public static final DeferredBlock<PressurePlateBlock> CLAYSTONE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CLAYSTONE);
	public static final DeferredBlock<SlabBlock> CLAYSTONE_ROUGH_SLAB = DFBlockUtils.roughSlab(CLAYSTONE);
	public static final DeferredBlock<SlabBlock> CLAYSTONE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CLAYSTONE);
	public static final DeferredBlock<StairBlock> CLAYSTONE_ROUGH_STAIRS = DFBlockUtils.roughStairs(CLAYSTONE, CLAYSTONE_ROUGH);
	public static final DeferredBlock<StairBlock> CLAYSTONE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CLAYSTONE, CLAYSTONE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CLAYSTONE_TRAPDOOR = DFBlockUtils.trapdoor(CLAYSTONE);
	public static final DeferredBlock<WallBlock> CLAYSTONE_ROUGH_WALL = DFBlockUtils.roughWall(CLAYSTONE);
	public static final DeferredBlock<WallBlock> CLAYSTONE_SMOOTH_WALL = DFBlockUtils.smoothWall(CLAYSTONE);

	// conglomerate
	public static final DeferredBlock<Block> CONGLOMERATE_ENGRAVED = DFBlockUtils.engraved(CONGLOMERATE);
	public static final DeferredBlock<Block> CONGLOMERATE_ROUGH = DFBlockUtils.rough(CONGLOMERATE);
	public static final DeferredBlock<Block> CONGLOMERATE_SMOOTH = DFBlockUtils.smooth(CONGLOMERATE);
	public static final DeferredBlock<ButtonBlock> CONGLOMERATE_BUTTON = DFBlockUtils.button(CONGLOMERATE);
	public static final DeferredBlock<DoorBlock> CONGLOMERATE_DOOR = DFBlockUtils.door(CONGLOMERATE);
	public static final DeferredBlock<PressurePlateBlock> CONGLOMERATE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CONGLOMERATE);
	public static final DeferredBlock<SlabBlock> CONGLOMERATE_ROUGH_SLAB = DFBlockUtils.roughSlab(CONGLOMERATE);
	public static final DeferredBlock<SlabBlock> CONGLOMERATE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CONGLOMERATE);
	public static final DeferredBlock<StairBlock> CONGLOMERATE_ROUGH_STAIRS = DFBlockUtils.roughStairs(CONGLOMERATE, CONGLOMERATE_ROUGH);
	public static final DeferredBlock<StairBlock> CONGLOMERATE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CONGLOMERATE, CONGLOMERATE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CONGLOMERATE_TRAPDOOR = DFBlockUtils.trapdoor(CONGLOMERATE);
	public static final DeferredBlock<WallBlock> CONGLOMERATE_ROUGH_WALL = DFBlockUtils.roughWall(CONGLOMERATE);
	public static final DeferredBlock<WallBlock> CONGLOMERATE_SMOOTH_WALL = DFBlockUtils.smoothWall(CONGLOMERATE);

	// dolomite
	public static final DeferredBlock<Block> DOLOMITE_ENGRAVED = DFBlockUtils.engraved(DOLOMITE);
	public static final DeferredBlock<Block> DOLOMITE_ROUGH = DFBlockUtils.rough(DOLOMITE);
	public static final DeferredBlock<Block> DOLOMITE_SMOOTH = DFBlockUtils.smooth(DOLOMITE);
	public static final DeferredBlock<ButtonBlock> DOLOMITE_BUTTON = DFBlockUtils.button(DOLOMITE);
	public static final DeferredBlock<DoorBlock> DOLOMITE_DOOR = DFBlockUtils.door(DOLOMITE);
	public static final DeferredBlock<PressurePlateBlock> DOLOMITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(DOLOMITE);
	public static final DeferredBlock<SlabBlock> DOLOMITE_ROUGH_SLAB = DFBlockUtils.roughSlab(DOLOMITE);
	public static final DeferredBlock<SlabBlock> DOLOMITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(DOLOMITE);
	public static final DeferredBlock<StairBlock> DOLOMITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(DOLOMITE, DOLOMITE_ROUGH);
	public static final DeferredBlock<StairBlock> DOLOMITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(DOLOMITE, DOLOMITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> DOLOMITE_TRAPDOOR = DFBlockUtils.trapdoor(DOLOMITE);
	public static final DeferredBlock<WallBlock> DOLOMITE_ROUGH_WALL = DFBlockUtils.roughWall(DOLOMITE);
	public static final DeferredBlock<WallBlock> DOLOMITE_SMOOTH_WALL = DFBlockUtils.smoothWall(DOLOMITE);

	// limestone
	public static final DeferredBlock<Block> LIMESTONE_ENGRAVED = DFBlockUtils.engraved(LIMESTONE);
	public static final DeferredBlock<Block> LIMESTONE_ROUGH = DFBlockUtils.rough(LIMESTONE);
	public static final DeferredBlock<Block> LIMESTONE_SMOOTH = DFBlockUtils.smooth(LIMESTONE);
	public static final DeferredBlock<ButtonBlock> LIMESTONE_BUTTON = DFBlockUtils.button(LIMESTONE);
	public static final DeferredBlock<DoorBlock> LIMESTONE_DOOR = DFBlockUtils.door(LIMESTONE);
	public static final DeferredBlock<PressurePlateBlock> LIMESTONE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(LIMESTONE);
	public static final DeferredBlock<SlabBlock> LIMESTONE_ROUGH_SLAB = DFBlockUtils.roughSlab(LIMESTONE);
	public static final DeferredBlock<SlabBlock> LIMESTONE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(LIMESTONE);
	public static final DeferredBlock<StairBlock> LIMESTONE_ROUGH_STAIRS = DFBlockUtils.roughStairs(LIMESTONE, LIMESTONE_ROUGH);
	public static final DeferredBlock<StairBlock> LIMESTONE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(LIMESTONE, LIMESTONE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> LIMESTONE_TRAPDOOR = DFBlockUtils.trapdoor(LIMESTONE);
	public static final DeferredBlock<WallBlock> LIMESTONE_ROUGH_WALL = DFBlockUtils.roughWall(LIMESTONE);
	public static final DeferredBlock<WallBlock> LIMESTONE_SMOOTH_WALL = DFBlockUtils.smoothWall(LIMESTONE);

	// mudstone
	public static final DeferredBlock<Block> MUDSTONE_ENGRAVED = DFBlockUtils.engraved(MUDSTONE);
	public static final DeferredBlock<Block> MUDSTONE_ROUGH = DFBlockUtils.rough(MUDSTONE);
	public static final DeferredBlock<Block> MUDSTONE_SMOOTH = DFBlockUtils.smooth(MUDSTONE);
	public static final DeferredBlock<ButtonBlock> MUDSTONE_BUTTON = DFBlockUtils.button(MUDSTONE);
	public static final DeferredBlock<DoorBlock> MUDSTONE_DOOR = DFBlockUtils.door(MUDSTONE);
	public static final DeferredBlock<PressurePlateBlock> MUDSTONE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(MUDSTONE);
	public static final DeferredBlock<SlabBlock> MUDSTONE_ROUGH_SLAB = DFBlockUtils.roughSlab(MUDSTONE);
	public static final DeferredBlock<SlabBlock> MUDSTONE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(MUDSTONE);
	public static final DeferredBlock<StairBlock> MUDSTONE_ROUGH_STAIRS = DFBlockUtils.roughStairs(MUDSTONE, MUDSTONE_ROUGH);
	public static final DeferredBlock<StairBlock> MUDSTONE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(MUDSTONE, MUDSTONE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> MUDSTONE_TRAPDOOR = DFBlockUtils.trapdoor(MUDSTONE);
	public static final DeferredBlock<WallBlock> MUDSTONE_ROUGH_WALL = DFBlockUtils.roughWall(MUDSTONE);
	public static final DeferredBlock<WallBlock> MUDSTONE_SMOOTH_WALL = DFBlockUtils.smoothWall(MUDSTONE);

	// rock_salt
	public static final DeferredBlock<Block> ROCK_SALT_ENGRAVED = DFBlockUtils.engraved(ROCK_SALT);
	public static final DeferredBlock<Block> ROCK_SALT_ROUGH = DFBlockUtils.rough(ROCK_SALT);
	public static final DeferredBlock<Block> ROCK_SALT_SMOOTH = DFBlockUtils.smooth(ROCK_SALT);
	public static final DeferredBlock<ButtonBlock> ROCK_SALT_BUTTON = DFBlockUtils.button(ROCK_SALT);
	public static final DeferredBlock<DoorBlock> ROCK_SALT_DOOR = DFBlockUtils.door(ROCK_SALT);
	public static final DeferredBlock<PressurePlateBlock> ROCK_SALT_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ROCK_SALT);
	public static final DeferredBlock<SlabBlock> ROCK_SALT_ROUGH_SLAB = DFBlockUtils.roughSlab(ROCK_SALT);
	public static final DeferredBlock<SlabBlock> ROCK_SALT_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ROCK_SALT);
	public static final DeferredBlock<StairBlock> ROCK_SALT_ROUGH_STAIRS = DFBlockUtils.roughStairs(ROCK_SALT, ROCK_SALT_ROUGH);
	public static final DeferredBlock<StairBlock> ROCK_SALT_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ROCK_SALT, ROCK_SALT_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ROCK_SALT_TRAPDOOR = DFBlockUtils.trapdoor(ROCK_SALT);
	public static final DeferredBlock<WallBlock> ROCK_SALT_ROUGH_WALL = DFBlockUtils.roughWall(ROCK_SALT);
	public static final DeferredBlock<WallBlock> ROCK_SALT_SMOOTH_WALL = DFBlockUtils.smoothWall(ROCK_SALT);

	// sandstone
	public static final DeferredBlock<Block> SANDSTONE_ENGRAVED = DFBlockUtils.engraved(SANDSTONE);
	public static final DeferredBlock<Block> SANDSTONE_ROUGH = DFBlockUtils.rough(SANDSTONE);
	public static final DeferredBlock<Block> SANDSTONE_SMOOTH = DFBlockUtils.smooth(SANDSTONE);
	public static final DeferredBlock<ButtonBlock> SANDSTONE_BUTTON = DFBlockUtils.button(SANDSTONE);
	public static final DeferredBlock<DoorBlock> SANDSTONE_DOOR = DFBlockUtils.door(SANDSTONE);
	public static final DeferredBlock<PressurePlateBlock> SANDSTONE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SANDSTONE);
	public static final DeferredBlock<SlabBlock> SANDSTONE_ROUGH_SLAB = DFBlockUtils.roughSlab(SANDSTONE);
	public static final DeferredBlock<SlabBlock> SANDSTONE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SANDSTONE);
	public static final DeferredBlock<StairBlock> SANDSTONE_ROUGH_STAIRS = DFBlockUtils.roughStairs(SANDSTONE, SANDSTONE_ROUGH);
	public static final DeferredBlock<StairBlock> SANDSTONE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SANDSTONE, SANDSTONE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SANDSTONE_TRAPDOOR = DFBlockUtils.trapdoor(SANDSTONE);
	public static final DeferredBlock<WallBlock> SANDSTONE_ROUGH_WALL = DFBlockUtils.roughWall(SANDSTONE);
	public static final DeferredBlock<WallBlock> SANDSTONE_SMOOTH_WALL = DFBlockUtils.smoothWall(SANDSTONE);

	// shale
	public static final DeferredBlock<Block> SHALE_ENGRAVED = DFBlockUtils.engraved(SHALE);
	public static final DeferredBlock<Block> SHALE_ROUGH = DFBlockUtils.rough(SHALE);
	public static final DeferredBlock<Block> SHALE_SMOOTH = DFBlockUtils.smooth(SHALE);
	public static final DeferredBlock<ButtonBlock> SHALE_BUTTON = DFBlockUtils.button(SHALE);
	public static final DeferredBlock<DoorBlock> SHALE_DOOR = DFBlockUtils.door(SHALE);
	public static final DeferredBlock<PressurePlateBlock> SHALE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SHALE);
	public static final DeferredBlock<SlabBlock> SHALE_ROUGH_SLAB = DFBlockUtils.roughSlab(SHALE);
	public static final DeferredBlock<SlabBlock> SHALE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SHALE);
	public static final DeferredBlock<StairBlock> SHALE_ROUGH_STAIRS = DFBlockUtils.roughStairs(SHALE, SHALE_ROUGH);
	public static final DeferredBlock<StairBlock> SHALE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SHALE, SHALE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SHALE_TRAPDOOR = DFBlockUtils.trapdoor(SHALE);
	public static final DeferredBlock<WallBlock> SHALE_ROUGH_WALL = DFBlockUtils.roughWall(SHALE);
	public static final DeferredBlock<WallBlock> SHALE_SMOOTH_WALL = DFBlockUtils.smoothWall(SHALE);

	// siltstone
	public static final DeferredBlock<Block> SILTSTONE_ENGRAVED = DFBlockUtils.engraved(SILTSTONE);
	public static final DeferredBlock<Block> SILTSTONE_ROUGH = DFBlockUtils.rough(SILTSTONE);
	public static final DeferredBlock<Block> SILTSTONE_SMOOTH = DFBlockUtils.smooth(SILTSTONE);
	public static final DeferredBlock<ButtonBlock> SILTSTONE_BUTTON = DFBlockUtils.button(SILTSTONE);
	public static final DeferredBlock<DoorBlock> SILTSTONE_DOOR = DFBlockUtils.door(SILTSTONE);
	public static final DeferredBlock<PressurePlateBlock> SILTSTONE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SILTSTONE);
	public static final DeferredBlock<SlabBlock> SILTSTONE_ROUGH_SLAB = DFBlockUtils.roughSlab(SILTSTONE);
	public static final DeferredBlock<SlabBlock> SILTSTONE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SILTSTONE);
	public static final DeferredBlock<StairBlock> SILTSTONE_ROUGH_STAIRS = DFBlockUtils.roughStairs(SILTSTONE, SILTSTONE_ROUGH);
	public static final DeferredBlock<StairBlock> SILTSTONE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SILTSTONE, SILTSTONE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SILTSTONE_TRAPDOOR = DFBlockUtils.trapdoor(SILTSTONE);
	public static final DeferredBlock<WallBlock> SILTSTONE_ROUGH_WALL = DFBlockUtils.roughWall(SILTSTONE);
	public static final DeferredBlock<WallBlock> SILTSTONE_SMOOTH_WALL = DFBlockUtils.smoothWall(SILTSTONE);

	// diorite
	public static final DeferredBlock<Block> DIORITE_ENGRAVED = DFBlockUtils.engraved(DIORITE);
	public static final DeferredBlock<Block> DIORITE_ROUGH = DFBlockUtils.rough(DIORITE);
	public static final DeferredBlock<Block> DIORITE_SMOOTH = DFBlockUtils.smooth(DIORITE);
	public static final DeferredBlock<ButtonBlock> DIORITE_BUTTON = DFBlockUtils.button(DIORITE);
	public static final DeferredBlock<DoorBlock> DIORITE_DOOR = DFBlockUtils.door(DIORITE);
	public static final DeferredBlock<PressurePlateBlock> DIORITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(DIORITE);
	public static final DeferredBlock<SlabBlock> DIORITE_ROUGH_SLAB = DFBlockUtils.roughSlab(DIORITE);
	public static final DeferredBlock<SlabBlock> DIORITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(DIORITE);
	public static final DeferredBlock<StairBlock> DIORITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(DIORITE, DIORITE_ROUGH);
	public static final DeferredBlock<StairBlock> DIORITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(DIORITE, DIORITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> DIORITE_TRAPDOOR = DFBlockUtils.trapdoor(DIORITE);
	public static final DeferredBlock<WallBlock> DIORITE_ROUGH_WALL = DFBlockUtils.roughWall(DIORITE);
	public static final DeferredBlock<WallBlock> DIORITE_SMOOTH_WALL = DFBlockUtils.smoothWall(DIORITE);

	// gabbro
	public static final DeferredBlock<Block> GABBRO_ENGRAVED = DFBlockUtils.engraved(GABBRO);
	public static final DeferredBlock<Block> GABBRO_ROUGH = DFBlockUtils.rough(GABBRO);
	public static final DeferredBlock<Block> GABBRO_SMOOTH = DFBlockUtils.smooth(GABBRO);
	public static final DeferredBlock<ButtonBlock> GABBRO_BUTTON = DFBlockUtils.button(GABBRO);
	public static final DeferredBlock<DoorBlock> GABBRO_DOOR = DFBlockUtils.door(GABBRO);
	public static final DeferredBlock<PressurePlateBlock> GABBRO_PRESSURE_PLATE = DFBlockUtils.pressurePlate(GABBRO);
	public static final DeferredBlock<SlabBlock> GABBRO_ROUGH_SLAB = DFBlockUtils.roughSlab(GABBRO);
	public static final DeferredBlock<SlabBlock> GABBRO_SMOOTH_SLAB = DFBlockUtils.smoothSlab(GABBRO);
	public static final DeferredBlock<StairBlock> GABBRO_ROUGH_STAIRS = DFBlockUtils.roughStairs(GABBRO, GABBRO_ROUGH);
	public static final DeferredBlock<StairBlock> GABBRO_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(GABBRO, GABBRO_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> GABBRO_TRAPDOOR = DFBlockUtils.trapdoor(GABBRO);
	public static final DeferredBlock<WallBlock> GABBRO_ROUGH_WALL = DFBlockUtils.roughWall(GABBRO);
	public static final DeferredBlock<WallBlock> GABBRO_SMOOTH_WALL = DFBlockUtils.smoothWall(GABBRO);

	// granite
	public static final DeferredBlock<Block> GRANITE_ENGRAVED = DFBlockUtils.engraved(GRANITE);
	public static final DeferredBlock<Block> GRANITE_ROUGH = DFBlockUtils.rough(GRANITE);
	public static final DeferredBlock<Block> GRANITE_SMOOTH = DFBlockUtils.smooth(GRANITE);
	public static final DeferredBlock<ButtonBlock> GRANITE_BUTTON = DFBlockUtils.button(GRANITE);
	public static final DeferredBlock<DoorBlock> GRANITE_DOOR = DFBlockUtils.door(GRANITE);
	public static final DeferredBlock<PressurePlateBlock> GRANITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(GRANITE);
	public static final DeferredBlock<SlabBlock> GRANITE_ROUGH_SLAB = DFBlockUtils.roughSlab(GRANITE);
	public static final DeferredBlock<SlabBlock> GRANITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(GRANITE);
	public static final DeferredBlock<StairBlock> GRANITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(GRANITE, GRANITE_ROUGH);
	public static final DeferredBlock<StairBlock> GRANITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(GRANITE, GRANITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> GRANITE_TRAPDOOR = DFBlockUtils.trapdoor(GRANITE);
	public static final DeferredBlock<WallBlock> GRANITE_ROUGH_WALL = DFBlockUtils.roughWall(GRANITE);
	public static final DeferredBlock<WallBlock> GRANITE_SMOOTH_WALL = DFBlockUtils.smoothWall(GRANITE);

	// andesite
	public static final DeferredBlock<Block> ANDESITE_ENGRAVED = DFBlockUtils.engraved(ANDESITE);
	public static final DeferredBlock<Block> ANDESITE_ROUGH = DFBlockUtils.rough(ANDESITE);
	public static final DeferredBlock<Block> ANDESITE_SMOOTH = DFBlockUtils.smooth(ANDESITE);
	public static final DeferredBlock<ButtonBlock> ANDESITE_BUTTON = DFBlockUtils.button(ANDESITE);
	public static final DeferredBlock<DoorBlock> ANDESITE_DOOR = DFBlockUtils.door(ANDESITE);
	public static final DeferredBlock<PressurePlateBlock> ANDESITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ANDESITE);
	public static final DeferredBlock<SlabBlock> ANDESITE_ROUGH_SLAB = DFBlockUtils.roughSlab(ANDESITE);
	public static final DeferredBlock<SlabBlock> ANDESITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ANDESITE);
	public static final DeferredBlock<StairBlock> ANDESITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(ANDESITE, ANDESITE_ROUGH);
	public static final DeferredBlock<StairBlock> ANDESITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ANDESITE, ANDESITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ANDESITE_TRAPDOOR = DFBlockUtils.trapdoor(ANDESITE);
	public static final DeferredBlock<WallBlock> ANDESITE_ROUGH_WALL = DFBlockUtils.roughWall(ANDESITE);
	public static final DeferredBlock<WallBlock> ANDESITE_SMOOTH_WALL = DFBlockUtils.smoothWall(ANDESITE);

	// basalt
	public static final DeferredBlock<Block> BASALT_ENGRAVED = DFBlockUtils.engraved(BASALT);
	public static final DeferredBlock<Block> BASALT_ROUGH = DFBlockUtils.rough(BASALT);
	public static final DeferredBlock<Block> BASALT_SMOOTH = DFBlockUtils.smooth(BASALT);
	public static final DeferredBlock<ButtonBlock> BASALT_BUTTON = DFBlockUtils.button(BASALT);
	public static final DeferredBlock<DoorBlock> BASALT_DOOR = DFBlockUtils.door(BASALT);
	public static final DeferredBlock<PressurePlateBlock> BASALT_PRESSURE_PLATE = DFBlockUtils.pressurePlate(BASALT);
	public static final DeferredBlock<SlabBlock> BASALT_ROUGH_SLAB = DFBlockUtils.roughSlab(BASALT);
	public static final DeferredBlock<SlabBlock> BASALT_SMOOTH_SLAB = DFBlockUtils.smoothSlab(BASALT);
	public static final DeferredBlock<StairBlock> BASALT_ROUGH_STAIRS = DFBlockUtils.roughStairs(BASALT, BASALT_ROUGH);
	public static final DeferredBlock<StairBlock> BASALT_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(BASALT, BASALT_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> BASALT_TRAPDOOR = DFBlockUtils.trapdoor(BASALT);
	public static final DeferredBlock<WallBlock> BASALT_ROUGH_WALL = DFBlockUtils.roughWall(BASALT);
	public static final DeferredBlock<WallBlock> BASALT_SMOOTH_WALL = DFBlockUtils.smoothWall(BASALT);

	// dacite
	public static final DeferredBlock<Block> DACITE_ENGRAVED = DFBlockUtils.engraved(DACITE);
	public static final DeferredBlock<Block> DACITE_ROUGH = DFBlockUtils.rough(DACITE);
	public static final DeferredBlock<Block> DACITE_SMOOTH = DFBlockUtils.smooth(DACITE);
	public static final DeferredBlock<ButtonBlock> DACITE_BUTTON = DFBlockUtils.button(DACITE);
	public static final DeferredBlock<DoorBlock> DACITE_DOOR = DFBlockUtils.door(DACITE);
	public static final DeferredBlock<PressurePlateBlock> DACITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(DACITE);
	public static final DeferredBlock<SlabBlock> DACITE_ROUGH_SLAB = DFBlockUtils.roughSlab(DACITE);
	public static final DeferredBlock<SlabBlock> DACITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(DACITE);
	public static final DeferredBlock<StairBlock> DACITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(DACITE, DACITE_ROUGH);
	public static final DeferredBlock<StairBlock> DACITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(DACITE, DACITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> DACITE_TRAPDOOR = DFBlockUtils.trapdoor(DACITE);
	public static final DeferredBlock<WallBlock> DACITE_ROUGH_WALL = DFBlockUtils.roughWall(DACITE);
	public static final DeferredBlock<WallBlock> DACITE_SMOOTH_WALL = DFBlockUtils.smoothWall(DACITE);

	// obsidian
	public static final DeferredBlock<Block> OBSIDIAN_ENGRAVED = DFBlockUtils.engraved(OBSIDIAN);
	public static final DeferredBlock<Block> OBSIDIAN_ROUGH = DFBlockUtils.rough(OBSIDIAN);
	public static final DeferredBlock<Block> OBSIDIAN_SMOOTH = DFBlockUtils.smooth(OBSIDIAN);
	public static final DeferredBlock<ButtonBlock> OBSIDIAN_BUTTON = DFBlockUtils.button(OBSIDIAN);
	public static final DeferredBlock<DoorBlock> OBSIDIAN_DOOR = DFBlockUtils.door(OBSIDIAN);
	public static final DeferredBlock<PressurePlateBlock> OBSIDIAN_PRESSURE_PLATE = DFBlockUtils.pressurePlate(OBSIDIAN);
	public static final DeferredBlock<SlabBlock> OBSIDIAN_ROUGH_SLAB = DFBlockUtils.roughSlab(OBSIDIAN);
	public static final DeferredBlock<SlabBlock> OBSIDIAN_SMOOTH_SLAB = DFBlockUtils.smoothSlab(OBSIDIAN);
	public static final DeferredBlock<StairBlock> OBSIDIAN_ROUGH_STAIRS = DFBlockUtils.roughStairs(OBSIDIAN, OBSIDIAN_ROUGH);
	public static final DeferredBlock<StairBlock> OBSIDIAN_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(OBSIDIAN, OBSIDIAN_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> OBSIDIAN_TRAPDOOR = DFBlockUtils.trapdoor(OBSIDIAN);
	public static final DeferredBlock<WallBlock> OBSIDIAN_ROUGH_WALL = DFBlockUtils.roughWall(OBSIDIAN);
	public static final DeferredBlock<WallBlock> OBSIDIAN_SMOOTH_WALL = DFBlockUtils.smoothWall(OBSIDIAN);

	// rhyolite
	public static final DeferredBlock<Block> RHYOLITE_ENGRAVED = DFBlockUtils.engraved(RHYOLITE);
	public static final DeferredBlock<Block> RHYOLITE_ROUGH = DFBlockUtils.rough(RHYOLITE);
	public static final DeferredBlock<Block> RHYOLITE_SMOOTH = DFBlockUtils.smooth(RHYOLITE);
	public static final DeferredBlock<ButtonBlock> RHYOLITE_BUTTON = DFBlockUtils.button(RHYOLITE);
	public static final DeferredBlock<DoorBlock> RHYOLITE_DOOR = DFBlockUtils.door(RHYOLITE);
	public static final DeferredBlock<PressurePlateBlock> RHYOLITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(RHYOLITE);
	public static final DeferredBlock<SlabBlock> RHYOLITE_ROUGH_SLAB = DFBlockUtils.roughSlab(RHYOLITE);
	public static final DeferredBlock<SlabBlock> RHYOLITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(RHYOLITE);
	public static final DeferredBlock<StairBlock> RHYOLITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(RHYOLITE, RHYOLITE_ROUGH);
	public static final DeferredBlock<StairBlock> RHYOLITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(RHYOLITE, RHYOLITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> RHYOLITE_TRAPDOOR = DFBlockUtils.trapdoor(RHYOLITE);
	public static final DeferredBlock<WallBlock> RHYOLITE_ROUGH_WALL = DFBlockUtils.roughWall(RHYOLITE);
	public static final DeferredBlock<WallBlock> RHYOLITE_SMOOTH_WALL = DFBlockUtils.smoothWall(RHYOLITE);

	// gneiss
	public static final DeferredBlock<Block> GNEISS_ENGRAVED = DFBlockUtils.engraved(GNEISS);
	public static final DeferredBlock<Block> GNEISS_ROUGH = DFBlockUtils.rough(GNEISS);
	public static final DeferredBlock<Block> GNEISS_SMOOTH = DFBlockUtils.smooth(GNEISS);
	public static final DeferredBlock<ButtonBlock> GNEISS_BUTTON = DFBlockUtils.button(GNEISS);
	public static final DeferredBlock<DoorBlock> GNEISS_DOOR = DFBlockUtils.door(GNEISS);
	public static final DeferredBlock<PressurePlateBlock> GNEISS_PRESSURE_PLATE = DFBlockUtils.pressurePlate(GNEISS);
	public static final DeferredBlock<SlabBlock> GNEISS_ROUGH_SLAB = DFBlockUtils.roughSlab(GNEISS);
	public static final DeferredBlock<SlabBlock> GNEISS_SMOOTH_SLAB = DFBlockUtils.smoothSlab(GNEISS);
	public static final DeferredBlock<StairBlock> GNEISS_ROUGH_STAIRS = DFBlockUtils.roughStairs(GNEISS, GNEISS_ROUGH);
	public static final DeferredBlock<StairBlock> GNEISS_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(GNEISS, GNEISS_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> GNEISS_TRAPDOOR = DFBlockUtils.trapdoor(GNEISS);
	public static final DeferredBlock<WallBlock> GNEISS_ROUGH_WALL = DFBlockUtils.roughWall(GNEISS);
	public static final DeferredBlock<WallBlock> GNEISS_SMOOTH_WALL = DFBlockUtils.smoothWall(GNEISS);

	// marble
	public static final DeferredBlock<Block> MARBLE_ENGRAVED = DFBlockUtils.engraved(MARBLE);
	public static final DeferredBlock<Block> MARBLE_ROUGH = DFBlockUtils.rough(MARBLE);
	public static final DeferredBlock<Block> MARBLE_SMOOTH = DFBlockUtils.smooth(MARBLE);
	public static final DeferredBlock<ButtonBlock> MARBLE_BUTTON = DFBlockUtils.button(MARBLE);
	public static final DeferredBlock<DoorBlock> MARBLE_DOOR = DFBlockUtils.door(MARBLE);
	public static final DeferredBlock<PressurePlateBlock> MARBLE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(MARBLE);
	public static final DeferredBlock<SlabBlock> MARBLE_ROUGH_SLAB = DFBlockUtils.roughSlab(MARBLE);
	public static final DeferredBlock<SlabBlock> MARBLE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(MARBLE);
	public static final DeferredBlock<StairBlock> MARBLE_ROUGH_STAIRS = DFBlockUtils.roughStairs(MARBLE, MARBLE_ROUGH);
	public static final DeferredBlock<StairBlock> MARBLE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(MARBLE, MARBLE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> MARBLE_TRAPDOOR = DFBlockUtils.trapdoor(MARBLE);
	public static final DeferredBlock<WallBlock> MARBLE_ROUGH_WALL = DFBlockUtils.roughWall(MARBLE);
	public static final DeferredBlock<WallBlock> MARBLE_SMOOTH_WALL = DFBlockUtils.smoothWall(MARBLE);

	// phyllite
	public static final DeferredBlock<Block> PHYLLITE_ENGRAVED = DFBlockUtils.engraved(PHYLLITE);
	public static final DeferredBlock<Block> PHYLLITE_ROUGH = DFBlockUtils.rough(PHYLLITE);
	public static final DeferredBlock<Block> PHYLLITE_SMOOTH = DFBlockUtils.smooth(PHYLLITE);
	public static final DeferredBlock<ButtonBlock> PHYLLITE_BUTTON = DFBlockUtils.button(PHYLLITE);
	public static final DeferredBlock<DoorBlock> PHYLLITE_DOOR = DFBlockUtils.door(PHYLLITE);
	public static final DeferredBlock<PressurePlateBlock> PHYLLITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(PHYLLITE);
	public static final DeferredBlock<SlabBlock> PHYLLITE_ROUGH_SLAB = DFBlockUtils.roughSlab(PHYLLITE);
	public static final DeferredBlock<SlabBlock> PHYLLITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(PHYLLITE);
	public static final DeferredBlock<StairBlock> PHYLLITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(PHYLLITE, PHYLLITE_ROUGH);
	public static final DeferredBlock<StairBlock> PHYLLITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(PHYLLITE, PHYLLITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> PHYLLITE_TRAPDOOR = DFBlockUtils.trapdoor(PHYLLITE);
	public static final DeferredBlock<WallBlock> PHYLLITE_ROUGH_WALL = DFBlockUtils.roughWall(PHYLLITE);
	public static final DeferredBlock<WallBlock> PHYLLITE_SMOOTH_WALL = DFBlockUtils.smoothWall(PHYLLITE);

	// quartzite
	public static final DeferredBlock<Block> QUARTZITE_ENGRAVED = DFBlockUtils.engraved(QUARTZITE);
	public static final DeferredBlock<Block> QUARTZITE_ROUGH = DFBlockUtils.rough(QUARTZITE);
	public static final DeferredBlock<Block> QUARTZITE_SMOOTH = DFBlockUtils.smooth(QUARTZITE);
	public static final DeferredBlock<ButtonBlock> QUARTZITE_BUTTON = DFBlockUtils.button(QUARTZITE);
	public static final DeferredBlock<DoorBlock> QUARTZITE_DOOR = DFBlockUtils.door(QUARTZITE);
	public static final DeferredBlock<PressurePlateBlock> QUARTZITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(QUARTZITE);
	public static final DeferredBlock<SlabBlock> QUARTZITE_ROUGH_SLAB = DFBlockUtils.roughSlab(QUARTZITE);
	public static final DeferredBlock<SlabBlock> QUARTZITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(QUARTZITE);
	public static final DeferredBlock<StairBlock> QUARTZITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(QUARTZITE, QUARTZITE_ROUGH);
	public static final DeferredBlock<StairBlock> QUARTZITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(QUARTZITE, QUARTZITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> QUARTZITE_TRAPDOOR = DFBlockUtils.trapdoor(QUARTZITE);
	public static final DeferredBlock<WallBlock> QUARTZITE_ROUGH_WALL = DFBlockUtils.roughWall(QUARTZITE);
	public static final DeferredBlock<WallBlock> QUARTZITE_SMOOTH_WALL = DFBlockUtils.smoothWall(QUARTZITE);

	// schist
	public static final DeferredBlock<Block> SCHIST_ENGRAVED = DFBlockUtils.engraved(SCHIST);
	public static final DeferredBlock<Block> SCHIST_ROUGH = DFBlockUtils.rough(SCHIST);
	public static final DeferredBlock<Block> SCHIST_SMOOTH = DFBlockUtils.smooth(SCHIST);
	public static final DeferredBlock<ButtonBlock> SCHIST_BUTTON = DFBlockUtils.button(SCHIST);
	public static final DeferredBlock<DoorBlock> SCHIST_DOOR = DFBlockUtils.door(SCHIST);
	public static final DeferredBlock<PressurePlateBlock> SCHIST_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SCHIST);
	public static final DeferredBlock<SlabBlock> SCHIST_ROUGH_SLAB = DFBlockUtils.roughSlab(SCHIST);
	public static final DeferredBlock<SlabBlock> SCHIST_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SCHIST);
	public static final DeferredBlock<StairBlock> SCHIST_ROUGH_STAIRS = DFBlockUtils.roughStairs(SCHIST, SCHIST_ROUGH);
	public static final DeferredBlock<StairBlock> SCHIST_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SCHIST, SCHIST_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SCHIST_TRAPDOOR = DFBlockUtils.trapdoor(SCHIST);
	public static final DeferredBlock<WallBlock> SCHIST_ROUGH_WALL = DFBlockUtils.roughWall(SCHIST);
	public static final DeferredBlock<WallBlock> SCHIST_SMOOTH_WALL = DFBlockUtils.smoothWall(SCHIST);

	// slate
	public static final DeferredBlock<Block> SLATE_ENGRAVED = DFBlockUtils.engraved(SLATE);
	public static final DeferredBlock<Block> SLATE_ROUGH = DFBlockUtils.rough(SLATE);
	public static final DeferredBlock<Block> SLATE_SMOOTH = DFBlockUtils.smooth(SLATE);
	public static final DeferredBlock<ButtonBlock> SLATE_BUTTON = DFBlockUtils.button(SLATE);
	public static final DeferredBlock<DoorBlock> SLATE_DOOR = DFBlockUtils.door(SLATE);
	public static final DeferredBlock<PressurePlateBlock> SLATE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SLATE);
	public static final DeferredBlock<SlabBlock> SLATE_ROUGH_SLAB = DFBlockUtils.roughSlab(SLATE);
	public static final DeferredBlock<SlabBlock> SLATE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SLATE);
	public static final DeferredBlock<StairBlock> SLATE_ROUGH_STAIRS = DFBlockUtils.roughStairs(SLATE, SLATE_ROUGH);
	public static final DeferredBlock<StairBlock> SLATE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SLATE, SLATE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SLATE_TRAPDOOR = DFBlockUtils.trapdoor(SLATE);
	public static final DeferredBlock<WallBlock> SLATE_ROUGH_WALL = DFBlockUtils.roughWall(SLATE);
	public static final DeferredBlock<WallBlock> SLATE_SMOOTH_WALL = DFBlockUtils.smoothWall(SLATE);

	// alabaster
	public static final DeferredBlock<Block> ALABASTER_ENGRAVED = DFBlockUtils.engraved(ALABASTER);
	public static final DeferredBlock<Block> ALABASTER_ROUGH = DFBlockUtils.rough(ALABASTER);
	public static final DeferredBlock<Block> ALABASTER_SMOOTH = DFBlockUtils.smooth(ALABASTER);
	public static final DeferredBlock<ButtonBlock> ALABASTER_BUTTON = DFBlockUtils.button(ALABASTER);
	public static final DeferredBlock<DoorBlock> ALABASTER_DOOR = DFBlockUtils.door(ALABASTER);
	public static final DeferredBlock<PressurePlateBlock> ALABASTER_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ALABASTER);
	public static final DeferredBlock<SlabBlock> ALABASTER_ROUGH_SLAB = DFBlockUtils.roughSlab(ALABASTER);
	public static final DeferredBlock<SlabBlock> ALABASTER_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ALABASTER);
	public static final DeferredBlock<StairBlock> ALABASTER_ROUGH_STAIRS = DFBlockUtils.roughStairs(ALABASTER, ALABASTER_ROUGH);
	public static final DeferredBlock<StairBlock> ALABASTER_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ALABASTER, ALABASTER_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ALABASTER_TRAPDOOR = DFBlockUtils.trapdoor(ALABASTER);
	public static final DeferredBlock<WallBlock> ALABASTER_ROUGH_WALL = DFBlockUtils.roughWall(ALABASTER);
	public static final DeferredBlock<WallBlock> ALABASTER_SMOOTH_WALL = DFBlockUtils.smoothWall(ALABASTER);

	// alunite
	public static final DeferredBlock<Block> ALUNITE_ENGRAVED = DFBlockUtils.engraved(ALUNITE);
	public static final DeferredBlock<Block> ALUNITE_ROUGH = DFBlockUtils.rough(ALUNITE);
	public static final DeferredBlock<Block> ALUNITE_SMOOTH = DFBlockUtils.smooth(ALUNITE);
	public static final DeferredBlock<ButtonBlock> ALUNITE_BUTTON = DFBlockUtils.button(ALUNITE);
	public static final DeferredBlock<DoorBlock> ALUNITE_DOOR = DFBlockUtils.door(ALUNITE);
	public static final DeferredBlock<PressurePlateBlock> ALUNITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ALUNITE);
	public static final DeferredBlock<SlabBlock> ALUNITE_ROUGH_SLAB = DFBlockUtils.roughSlab(ALUNITE);
	public static final DeferredBlock<SlabBlock> ALUNITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ALUNITE);
	public static final DeferredBlock<StairBlock> ALUNITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(ALUNITE, ALUNITE_ROUGH);
	public static final DeferredBlock<StairBlock> ALUNITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ALUNITE, ALUNITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ALUNITE_TRAPDOOR = DFBlockUtils.trapdoor(ALUNITE);
	public static final DeferredBlock<WallBlock> ALUNITE_ROUGH_WALL = DFBlockUtils.roughWall(ALUNITE);
	public static final DeferredBlock<WallBlock> ALUNITE_SMOOTH_WALL = DFBlockUtils.smoothWall(ALUNITE);

	// anhydrite
	public static final DeferredBlock<Block> ANHYDRITE_ENGRAVED = DFBlockUtils.engraved(ANHYDRITE);
	public static final DeferredBlock<Block> ANHYDRITE_ROUGH = DFBlockUtils.rough(ANHYDRITE);
	public static final DeferredBlock<Block> ANHYDRITE_SMOOTH = DFBlockUtils.smooth(ANHYDRITE);
	public static final DeferredBlock<ButtonBlock> ANHYDRITE_BUTTON = DFBlockUtils.button(ANHYDRITE);
	public static final DeferredBlock<DoorBlock> ANHYDRITE_DOOR = DFBlockUtils.door(ANHYDRITE);
	public static final DeferredBlock<PressurePlateBlock> ANHYDRITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ANHYDRITE);
	public static final DeferredBlock<SlabBlock> ANHYDRITE_ROUGH_SLAB = DFBlockUtils.roughSlab(ANHYDRITE);
	public static final DeferredBlock<SlabBlock> ANHYDRITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ANHYDRITE);
	public static final DeferredBlock<StairBlock> ANHYDRITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(ANHYDRITE, ANHYDRITE_ROUGH);
	public static final DeferredBlock<StairBlock> ANHYDRITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ANHYDRITE, ANHYDRITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ANHYDRITE_TRAPDOOR = DFBlockUtils.trapdoor(ANHYDRITE);
	public static final DeferredBlock<WallBlock> ANHYDRITE_ROUGH_WALL = DFBlockUtils.roughWall(ANHYDRITE);
	public static final DeferredBlock<WallBlock> ANHYDRITE_SMOOTH_WALL = DFBlockUtils.smoothWall(ANHYDRITE);

	// bauxite
	public static final DeferredBlock<Block> BAUXITE_ENGRAVED = DFBlockUtils.engraved(BAUXITE);
	public static final DeferredBlock<Block> BAUXITE_ROUGH = DFBlockUtils.rough(BAUXITE);
	public static final DeferredBlock<Block> BAUXITE_SMOOTH = DFBlockUtils.smooth(BAUXITE);
	public static final DeferredBlock<ButtonBlock> BAUXITE_BUTTON = DFBlockUtils.button(BAUXITE);
	public static final DeferredBlock<DoorBlock> BAUXITE_DOOR = DFBlockUtils.door(BAUXITE);
	public static final DeferredBlock<PressurePlateBlock> BAUXITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(BAUXITE);
	public static final DeferredBlock<SlabBlock> BAUXITE_ROUGH_SLAB = DFBlockUtils.roughSlab(BAUXITE);
	public static final DeferredBlock<SlabBlock> BAUXITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(BAUXITE);
	public static final DeferredBlock<StairBlock> BAUXITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(BAUXITE, BAUXITE_ROUGH);
	public static final DeferredBlock<StairBlock> BAUXITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(BAUXITE, BAUXITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> BAUXITE_TRAPDOOR = DFBlockUtils.trapdoor(BAUXITE);
	public static final DeferredBlock<WallBlock> BAUXITE_ROUGH_WALL = DFBlockUtils.roughWall(BAUXITE);
	public static final DeferredBlock<WallBlock> BAUXITE_SMOOTH_WALL = DFBlockUtils.smoothWall(BAUXITE);

	// bituminous_coal
	public static final DeferredBlock<Block> BITUMINOUS_COAL_ENGRAVED = DFBlockUtils.engraved(BITUMINOUS_COAL);
	public static final DeferredBlock<Block> BITUMINOUS_COAL_ROUGH = DFBlockUtils.rough(BITUMINOUS_COAL);
	public static final DeferredBlock<Block> BITUMINOUS_COAL_SMOOTH = DFBlockUtils.smooth(BITUMINOUS_COAL);
	public static final DeferredBlock<ButtonBlock> BITUMINOUS_COAL_BUTTON = DFBlockUtils.button(BITUMINOUS_COAL);
	public static final DeferredBlock<DoorBlock> BITUMINOUS_COAL_DOOR = DFBlockUtils.door(BITUMINOUS_COAL);
	public static final DeferredBlock<PressurePlateBlock> BITUMINOUS_COAL_PRESSURE_PLATE = DFBlockUtils.pressurePlate(BITUMINOUS_COAL);
	public static final DeferredBlock<SlabBlock> BITUMINOUS_COAL_ROUGH_SLAB = DFBlockUtils.roughSlab(BITUMINOUS_COAL);
	public static final DeferredBlock<SlabBlock> BITUMINOUS_COAL_SMOOTH_SLAB = DFBlockUtils.smoothSlab(BITUMINOUS_COAL);
	public static final DeferredBlock<StairBlock> BITUMINOUS_COAL_ROUGH_STAIRS = DFBlockUtils.roughStairs(BITUMINOUS_COAL, BITUMINOUS_COAL_ROUGH);
	public static final DeferredBlock<StairBlock> BITUMINOUS_COAL_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(BITUMINOUS_COAL, BITUMINOUS_COAL_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> BITUMINOUS_COAL_TRAPDOOR = DFBlockUtils.trapdoor(BITUMINOUS_COAL);
	public static final DeferredBlock<WallBlock> BITUMINOUS_COAL_ROUGH_WALL = DFBlockUtils.roughWall(BITUMINOUS_COAL);
	public static final DeferredBlock<WallBlock> BITUMINOUS_COAL_SMOOTH_WALL = DFBlockUtils.smoothWall(BITUMINOUS_COAL);

	// borax
	public static final DeferredBlock<Block> BORAX_ENGRAVED = DFBlockUtils.engraved(BORAX);
	public static final DeferredBlock<Block> BORAX_ROUGH = DFBlockUtils.rough(BORAX);
	public static final DeferredBlock<Block> BORAX_SMOOTH = DFBlockUtils.smooth(BORAX);
	public static final DeferredBlock<ButtonBlock> BORAX_BUTTON = DFBlockUtils.button(BORAX);
	public static final DeferredBlock<DoorBlock> BORAX_DOOR = DFBlockUtils.door(BORAX);
	public static final DeferredBlock<PressurePlateBlock> BORAX_PRESSURE_PLATE = DFBlockUtils.pressurePlate(BORAX);
	public static final DeferredBlock<SlabBlock> BORAX_ROUGH_SLAB = DFBlockUtils.roughSlab(BORAX);
	public static final DeferredBlock<SlabBlock> BORAX_SMOOTH_SLAB = DFBlockUtils.smoothSlab(BORAX);
	public static final DeferredBlock<StairBlock> BORAX_ROUGH_STAIRS = DFBlockUtils.roughStairs(BORAX, BORAX_ROUGH);
	public static final DeferredBlock<StairBlock> BORAX_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(BORAX, BORAX_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> BORAX_TRAPDOOR = DFBlockUtils.trapdoor(BORAX);
	public static final DeferredBlock<WallBlock> BORAX_ROUGH_WALL = DFBlockUtils.roughWall(BORAX);
	public static final DeferredBlock<WallBlock> BORAX_SMOOTH_WALL = DFBlockUtils.smoothWall(BORAX);

	// brimstone
	public static final DeferredBlock<Block> BRIMSTONE_ENGRAVED = DFBlockUtils.engraved(BRIMSTONE);
	public static final DeferredBlock<Block> BRIMSTONE_ROUGH = DFBlockUtils.rough(BRIMSTONE);
	public static final DeferredBlock<Block> BRIMSTONE_SMOOTH = DFBlockUtils.smooth(BRIMSTONE);
	public static final DeferredBlock<ButtonBlock> BRIMSTONE_BUTTON = DFBlockUtils.button(BRIMSTONE);
	public static final DeferredBlock<DoorBlock> BRIMSTONE_DOOR = DFBlockUtils.door(BRIMSTONE);
	public static final DeferredBlock<PressurePlateBlock> BRIMSTONE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(BRIMSTONE);
	public static final DeferredBlock<SlabBlock> BRIMSTONE_ROUGH_SLAB = DFBlockUtils.roughSlab(BRIMSTONE);
	public static final DeferredBlock<SlabBlock> BRIMSTONE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(BRIMSTONE);
	public static final DeferredBlock<StairBlock> BRIMSTONE_ROUGH_STAIRS = DFBlockUtils.roughStairs(BRIMSTONE, BRIMSTONE_ROUGH);
	public static final DeferredBlock<StairBlock> BRIMSTONE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(BRIMSTONE, BRIMSTONE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> BRIMSTONE_TRAPDOOR = DFBlockUtils.trapdoor(BRIMSTONE);
	public static final DeferredBlock<WallBlock> BRIMSTONE_ROUGH_WALL = DFBlockUtils.roughWall(BRIMSTONE);
	public static final DeferredBlock<WallBlock> BRIMSTONE_SMOOTH_WALL = DFBlockUtils.smoothWall(BRIMSTONE);

	// calcite
	public static final DeferredBlock<Block> CALCITE_ENGRAVED = DFBlockUtils.engraved(CALCITE);
	public static final DeferredBlock<Block> CALCITE_ROUGH = DFBlockUtils.rough(CALCITE);
	public static final DeferredBlock<Block> CALCITE_SMOOTH = DFBlockUtils.smooth(CALCITE);
	public static final DeferredBlock<ButtonBlock> CALCITE_BUTTON = DFBlockUtils.button(CALCITE);
	public static final DeferredBlock<DoorBlock> CALCITE_DOOR = DFBlockUtils.door(CALCITE);
	public static final DeferredBlock<PressurePlateBlock> CALCITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CALCITE);
	public static final DeferredBlock<SlabBlock> CALCITE_ROUGH_SLAB = DFBlockUtils.roughSlab(CALCITE);
	public static final DeferredBlock<SlabBlock> CALCITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CALCITE);
	public static final DeferredBlock<StairBlock> CALCITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(CALCITE, CALCITE_ROUGH);
	public static final DeferredBlock<StairBlock> CALCITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CALCITE, CALCITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CALCITE_TRAPDOOR = DFBlockUtils.trapdoor(CALCITE);
	public static final DeferredBlock<WallBlock> CALCITE_ROUGH_WALL = DFBlockUtils.roughWall(CALCITE);
	public static final DeferredBlock<WallBlock> CALCITE_SMOOTH_WALL = DFBlockUtils.smoothWall(CALCITE);

	// chromite
	public static final DeferredBlock<Block> CHROMITE_ENGRAVED = DFBlockUtils.engraved(CHROMITE);
	public static final DeferredBlock<Block> CHROMITE_ROUGH = DFBlockUtils.rough(CHROMITE);
	public static final DeferredBlock<Block> CHROMITE_SMOOTH = DFBlockUtils.smooth(CHROMITE);
	public static final DeferredBlock<ButtonBlock> CHROMITE_BUTTON = DFBlockUtils.button(CHROMITE);
	public static final DeferredBlock<DoorBlock> CHROMITE_DOOR = DFBlockUtils.door(CHROMITE);
	public static final DeferredBlock<PressurePlateBlock> CHROMITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CHROMITE);
	public static final DeferredBlock<SlabBlock> CHROMITE_ROUGH_SLAB = DFBlockUtils.roughSlab(CHROMITE);
	public static final DeferredBlock<SlabBlock> CHROMITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CHROMITE);
	public static final DeferredBlock<StairBlock> CHROMITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(CHROMITE, CHROMITE_ROUGH);
	public static final DeferredBlock<StairBlock> CHROMITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CHROMITE, CHROMITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CHROMITE_TRAPDOOR = DFBlockUtils.trapdoor(CHROMITE);
	public static final DeferredBlock<WallBlock> CHROMITE_ROUGH_WALL = DFBlockUtils.roughWall(CHROMITE);
	public static final DeferredBlock<WallBlock> CHROMITE_SMOOTH_WALL = DFBlockUtils.smoothWall(CHROMITE);

	// cinnabar
	public static final DeferredBlock<Block> CINNABAR_ENGRAVED = DFBlockUtils.engraved(CINNABAR);
	public static final DeferredBlock<Block> CINNABAR_ROUGH = DFBlockUtils.rough(CINNABAR);
	public static final DeferredBlock<Block> CINNABAR_SMOOTH = DFBlockUtils.smooth(CINNABAR);
	public static final DeferredBlock<ButtonBlock> CINNABAR_BUTTON = DFBlockUtils.button(CINNABAR);
	public static final DeferredBlock<DoorBlock> CINNABAR_DOOR = DFBlockUtils.door(CINNABAR);
	public static final DeferredBlock<PressurePlateBlock> CINNABAR_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CINNABAR);
	public static final DeferredBlock<SlabBlock> CINNABAR_ROUGH_SLAB = DFBlockUtils.roughSlab(CINNABAR);
	public static final DeferredBlock<SlabBlock> CINNABAR_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CINNABAR);
	public static final DeferredBlock<StairBlock> CINNABAR_ROUGH_STAIRS = DFBlockUtils.roughStairs(CINNABAR, CINNABAR_ROUGH);
	public static final DeferredBlock<StairBlock> CINNABAR_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CINNABAR, CINNABAR_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CINNABAR_TRAPDOOR = DFBlockUtils.trapdoor(CINNABAR);
	public static final DeferredBlock<WallBlock> CINNABAR_ROUGH_WALL = DFBlockUtils.roughWall(CINNABAR);
	public static final DeferredBlock<WallBlock> CINNABAR_SMOOTH_WALL = DFBlockUtils.smoothWall(CINNABAR);

	// cobaltite
	public static final DeferredBlock<Block> COBALTITE_ENGRAVED = DFBlockUtils.engraved(COBALTITE);
	public static final DeferredBlock<Block> COBALTITE_ROUGH = DFBlockUtils.rough(COBALTITE);
	public static final DeferredBlock<Block> COBALTITE_SMOOTH = DFBlockUtils.smooth(COBALTITE);
	public static final DeferredBlock<ButtonBlock> COBALTITE_BUTTON = DFBlockUtils.button(COBALTITE);
	public static final DeferredBlock<DoorBlock> COBALTITE_DOOR = DFBlockUtils.door(COBALTITE);
	public static final DeferredBlock<PressurePlateBlock> COBALTITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(COBALTITE);
	public static final DeferredBlock<SlabBlock> COBALTITE_ROUGH_SLAB = DFBlockUtils.roughSlab(COBALTITE);
	public static final DeferredBlock<SlabBlock> COBALTITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(COBALTITE);
	public static final DeferredBlock<StairBlock> COBALTITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(COBALTITE, COBALTITE_ROUGH);
	public static final DeferredBlock<StairBlock> COBALTITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(COBALTITE, COBALTITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> COBALTITE_TRAPDOOR = DFBlockUtils.trapdoor(COBALTITE);
	public static final DeferredBlock<WallBlock> COBALTITE_ROUGH_WALL = DFBlockUtils.roughWall(COBALTITE);
	public static final DeferredBlock<WallBlock> COBALTITE_SMOOTH_WALL = DFBlockUtils.smoothWall(COBALTITE);

	// cryolite
	public static final DeferredBlock<Block> CRYOLITE_ENGRAVED = DFBlockUtils.engraved(CRYOLITE);
	public static final DeferredBlock<Block> CRYOLITE_ROUGH = DFBlockUtils.rough(CRYOLITE);
	public static final DeferredBlock<Block> CRYOLITE_SMOOTH = DFBlockUtils.smooth(CRYOLITE);
	public static final DeferredBlock<ButtonBlock> CRYOLITE_BUTTON = DFBlockUtils.button(CRYOLITE);
	public static final DeferredBlock<DoorBlock> CRYOLITE_DOOR = DFBlockUtils.door(CRYOLITE);
	public static final DeferredBlock<PressurePlateBlock> CRYOLITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CRYOLITE);
	public static final DeferredBlock<SlabBlock> CRYOLITE_ROUGH_SLAB = DFBlockUtils.roughSlab(CRYOLITE);
	public static final DeferredBlock<SlabBlock> CRYOLITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CRYOLITE);
	public static final DeferredBlock<StairBlock> CRYOLITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(CRYOLITE, CRYOLITE_ROUGH);
	public static final DeferredBlock<StairBlock> CRYOLITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CRYOLITE, CRYOLITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CRYOLITE_TRAPDOOR = DFBlockUtils.trapdoor(CRYOLITE);
	public static final DeferredBlock<WallBlock> CRYOLITE_ROUGH_WALL = DFBlockUtils.roughWall(CRYOLITE);
	public static final DeferredBlock<WallBlock> CRYOLITE_SMOOTH_WALL = DFBlockUtils.smoothWall(CRYOLITE);

	// graphite
	public static final DeferredBlock<Block> GRAPHITE_ENGRAVED = DFBlockUtils.engraved(GRAPHITE);
	public static final DeferredBlock<Block> GRAPHITE_ROUGH = DFBlockUtils.rough(GRAPHITE);
	public static final DeferredBlock<Block> GRAPHITE_SMOOTH = DFBlockUtils.smooth(GRAPHITE);
	public static final DeferredBlock<ButtonBlock> GRAPHITE_BUTTON = DFBlockUtils.button(GRAPHITE);
	public static final DeferredBlock<DoorBlock> GRAPHITE_DOOR = DFBlockUtils.door(GRAPHITE);
	public static final DeferredBlock<PressurePlateBlock> GRAPHITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(GRAPHITE);
	public static final DeferredBlock<SlabBlock> GRAPHITE_ROUGH_SLAB = DFBlockUtils.roughSlab(GRAPHITE);
	public static final DeferredBlock<SlabBlock> GRAPHITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(GRAPHITE);
	public static final DeferredBlock<StairBlock> GRAPHITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(GRAPHITE, GRAPHITE_ROUGH);
	public static final DeferredBlock<StairBlock> GRAPHITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(GRAPHITE, GRAPHITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> GRAPHITE_TRAPDOOR = DFBlockUtils.trapdoor(GRAPHITE);
	public static final DeferredBlock<WallBlock> GRAPHITE_ROUGH_WALL = DFBlockUtils.roughWall(GRAPHITE);
	public static final DeferredBlock<WallBlock> GRAPHITE_SMOOTH_WALL = DFBlockUtils.smoothWall(GRAPHITE);

	// gypsum
	public static final DeferredBlock<Block> GYPSUM_ENGRAVED = DFBlockUtils.engraved(GYPSUM);
	public static final DeferredBlock<Block> GYPSUM_ROUGH = DFBlockUtils.rough(GYPSUM);
	public static final DeferredBlock<Block> GYPSUM_SMOOTH = DFBlockUtils.smooth(GYPSUM);
	public static final DeferredBlock<ButtonBlock> GYPSUM_BUTTON = DFBlockUtils.button(GYPSUM);
	public static final DeferredBlock<DoorBlock> GYPSUM_DOOR = DFBlockUtils.door(GYPSUM);
	public static final DeferredBlock<PressurePlateBlock> GYPSUM_PRESSURE_PLATE = DFBlockUtils.pressurePlate(GYPSUM);
	public static final DeferredBlock<SlabBlock> GYPSUM_ROUGH_SLAB = DFBlockUtils.roughSlab(GYPSUM);
	public static final DeferredBlock<SlabBlock> GYPSUM_SMOOTH_SLAB = DFBlockUtils.smoothSlab(GYPSUM);
	public static final DeferredBlock<StairBlock> GYPSUM_ROUGH_STAIRS = DFBlockUtils.roughStairs(GYPSUM, GYPSUM_ROUGH);
	public static final DeferredBlock<StairBlock> GYPSUM_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(GYPSUM, GYPSUM_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> GYPSUM_TRAPDOOR = DFBlockUtils.trapdoor(GYPSUM);
	public static final DeferredBlock<WallBlock> GYPSUM_ROUGH_WALL = DFBlockUtils.roughWall(GYPSUM);
	public static final DeferredBlock<WallBlock> GYPSUM_SMOOTH_WALL = DFBlockUtils.smoothWall(GYPSUM);

	// hornblende
	public static final DeferredBlock<Block> HORNBLENDE_ENGRAVED = DFBlockUtils.engraved(HORNBLENDE);
	public static final DeferredBlock<Block> HORNBLENDE_ROUGH = DFBlockUtils.rough(HORNBLENDE);
	public static final DeferredBlock<Block> HORNBLENDE_SMOOTH = DFBlockUtils.smooth(HORNBLENDE);
	public static final DeferredBlock<ButtonBlock> HORNBLENDE_BUTTON = DFBlockUtils.button(HORNBLENDE);
	public static final DeferredBlock<DoorBlock> HORNBLENDE_DOOR = DFBlockUtils.door(HORNBLENDE);
	public static final DeferredBlock<PressurePlateBlock> HORNBLENDE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(HORNBLENDE);
	public static final DeferredBlock<SlabBlock> HORNBLENDE_ROUGH_SLAB = DFBlockUtils.roughSlab(HORNBLENDE);
	public static final DeferredBlock<SlabBlock> HORNBLENDE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(HORNBLENDE);
	public static final DeferredBlock<StairBlock> HORNBLENDE_ROUGH_STAIRS = DFBlockUtils.roughStairs(HORNBLENDE, HORNBLENDE_ROUGH);
	public static final DeferredBlock<StairBlock> HORNBLENDE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(HORNBLENDE, HORNBLENDE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> HORNBLENDE_TRAPDOOR = DFBlockUtils.trapdoor(HORNBLENDE);
	public static final DeferredBlock<WallBlock> HORNBLENDE_ROUGH_WALL = DFBlockUtils.roughWall(HORNBLENDE);
	public static final DeferredBlock<WallBlock> HORNBLENDE_SMOOTH_WALL = DFBlockUtils.smoothWall(HORNBLENDE);

	// ilmenite
	public static final DeferredBlock<Block> ILMENITE_ENGRAVED = DFBlockUtils.engraved(ILMENITE);
	public static final DeferredBlock<Block> ILMENITE_ROUGH = DFBlockUtils.rough(ILMENITE);
	public static final DeferredBlock<Block> ILMENITE_SMOOTH = DFBlockUtils.smooth(ILMENITE);
	public static final DeferredBlock<ButtonBlock> ILMENITE_BUTTON = DFBlockUtils.button(ILMENITE);
	public static final DeferredBlock<DoorBlock> ILMENITE_DOOR = DFBlockUtils.door(ILMENITE);
	public static final DeferredBlock<PressurePlateBlock> ILMENITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ILMENITE);
	public static final DeferredBlock<SlabBlock> ILMENITE_ROUGH_SLAB = DFBlockUtils.roughSlab(ILMENITE);
	public static final DeferredBlock<SlabBlock> ILMENITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ILMENITE);
	public static final DeferredBlock<StairBlock> ILMENITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(ILMENITE, ILMENITE_ROUGH);
	public static final DeferredBlock<StairBlock> ILMENITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ILMENITE, ILMENITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ILMENITE_TRAPDOOR = DFBlockUtils.trapdoor(ILMENITE);
	public static final DeferredBlock<WallBlock> ILMENITE_ROUGH_WALL = DFBlockUtils.roughWall(ILMENITE);
	public static final DeferredBlock<WallBlock> ILMENITE_SMOOTH_WALL = DFBlockUtils.smoothWall(ILMENITE);

	// jet
	public static final DeferredBlock<Block> JET_ENGRAVED = DFBlockUtils.engraved(JET);
	public static final DeferredBlock<Block> JET_ROUGH = DFBlockUtils.rough(JET);
	public static final DeferredBlock<Block> JET_SMOOTH = DFBlockUtils.smooth(JET);
	public static final DeferredBlock<ButtonBlock> JET_BUTTON = DFBlockUtils.button(JET);
	public static final DeferredBlock<DoorBlock> JET_DOOR = DFBlockUtils.door(JET);
	public static final DeferredBlock<PressurePlateBlock> JET_PRESSURE_PLATE = DFBlockUtils.pressurePlate(JET);
	public static final DeferredBlock<SlabBlock> JET_ROUGH_SLAB = DFBlockUtils.roughSlab(JET);
	public static final DeferredBlock<SlabBlock> JET_SMOOTH_SLAB = DFBlockUtils.smoothSlab(JET);
	public static final DeferredBlock<StairBlock> JET_ROUGH_STAIRS = DFBlockUtils.roughStairs(JET, JET_ROUGH);
	public static final DeferredBlock<StairBlock> JET_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(JET, JET_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> JET_TRAPDOOR = DFBlockUtils.trapdoor(JET);
	public static final DeferredBlock<WallBlock> JET_ROUGH_WALL = DFBlockUtils.roughWall(JET);
	public static final DeferredBlock<WallBlock> JET_SMOOTH_WALL = DFBlockUtils.smoothWall(JET);

	// kaolinite
	public static final DeferredBlock<Block> KAOLINITE_ENGRAVED = DFBlockUtils.engraved(KAOLINITE);
	public static final DeferredBlock<Block> KAOLINITE_ROUGH = DFBlockUtils.rough(KAOLINITE);
	public static final DeferredBlock<Block> KAOLINITE_SMOOTH = DFBlockUtils.smooth(KAOLINITE);
	public static final DeferredBlock<ButtonBlock> KAOLINITE_BUTTON = DFBlockUtils.button(KAOLINITE);
	public static final DeferredBlock<DoorBlock> KAOLINITE_DOOR = DFBlockUtils.door(KAOLINITE);
	public static final DeferredBlock<PressurePlateBlock> KAOLINITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(KAOLINITE);
	public static final DeferredBlock<SlabBlock> KAOLINITE_ROUGH_SLAB = DFBlockUtils.roughSlab(KAOLINITE);
	public static final DeferredBlock<SlabBlock> KAOLINITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(KAOLINITE);
	public static final DeferredBlock<StairBlock> KAOLINITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(KAOLINITE, KAOLINITE_ROUGH);
	public static final DeferredBlock<StairBlock> KAOLINITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(KAOLINITE, KAOLINITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> KAOLINITE_TRAPDOOR = DFBlockUtils.trapdoor(KAOLINITE);
	public static final DeferredBlock<WallBlock> KAOLINITE_ROUGH_WALL = DFBlockUtils.roughWall(KAOLINITE);
	public static final DeferredBlock<WallBlock> KAOLINITE_SMOOTH_WALL = DFBlockUtils.smoothWall(KAOLINITE);

	// kimberlite
	public static final DeferredBlock<Block> CERULEAN_ENGRAVED = DFBlockUtils.engraved(CERULEAN);
	public static final DeferredBlock<Block> CERULEAN_ROUGH = DFBlockUtils.rough(CERULEAN);
	public static final DeferredBlock<Block> CERULEAN_SMOOTH = DFBlockUtils.smooth(CERULEAN);
	public static final DeferredBlock<ButtonBlock> CERULEAN_BUTTON = DFBlockUtils.button(CERULEAN);
	public static final DeferredBlock<DoorBlock> CERULEAN_DOOR = DFBlockUtils.door(CERULEAN);
	public static final DeferredBlock<PressurePlateBlock> CERULEAN_PRESSURE_PLATE = DFBlockUtils.pressurePlate(CERULEAN);
	public static final DeferredBlock<SlabBlock> CERULEAN_ROUGH_SLAB = DFBlockUtils.roughSlab(CERULEAN);
	public static final DeferredBlock<SlabBlock> CERULEAN_SMOOTH_SLAB = DFBlockUtils.smoothSlab(CERULEAN);
	public static final DeferredBlock<StairBlock> CERULEAN_ROUGH_STAIRS = DFBlockUtils.roughStairs(CERULEAN, CERULEAN_ROUGH);
	public static final DeferredBlock<StairBlock> CERULEAN_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(CERULEAN, CERULEAN_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> CERULEAN_TRAPDOOR = DFBlockUtils.trapdoor(CERULEAN);
	public static final DeferredBlock<WallBlock> CERULEAN_ROUGH_WALL = DFBlockUtils.roughWall(CERULEAN);
	public static final DeferredBlock<WallBlock> CERULEAN_SMOOTH_WALL = DFBlockUtils.smoothWall(CERULEAN);

	// lignite
	public static final DeferredBlock<Block> LIGNITE_ENGRAVED = DFBlockUtils.engraved(LIGNITE);
	public static final DeferredBlock<Block> LIGNITE_ROUGH = DFBlockUtils.rough(LIGNITE);
	public static final DeferredBlock<Block> LIGNITE_SMOOTH = DFBlockUtils.smooth(LIGNITE);
	public static final DeferredBlock<ButtonBlock> LIGNITE_BUTTON = DFBlockUtils.button(LIGNITE);
	public static final DeferredBlock<DoorBlock> LIGNITE_DOOR = DFBlockUtils.door(LIGNITE);
	public static final DeferredBlock<PressurePlateBlock> LIGNITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(LIGNITE);
	public static final DeferredBlock<SlabBlock> LIGNITE_ROUGH_SLAB = DFBlockUtils.roughSlab(LIGNITE);
	public static final DeferredBlock<SlabBlock> LIGNITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(LIGNITE);
	public static final DeferredBlock<StairBlock> LIGNITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(LIGNITE, LIGNITE_ROUGH);
	public static final DeferredBlock<StairBlock> LIGNITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(LIGNITE, LIGNITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> LIGNITE_TRAPDOOR = DFBlockUtils.trapdoor(LIGNITE);
	public static final DeferredBlock<WallBlock> LIGNITE_ROUGH_WALL = DFBlockUtils.roughWall(LIGNITE);
	public static final DeferredBlock<WallBlock> LIGNITE_SMOOTH_WALL = DFBlockUtils.smoothWall(LIGNITE);

	// marcasite
	public static final DeferredBlock<Block> MARCASITE_ENGRAVED = DFBlockUtils.engraved(MARCASITE);
	public static final DeferredBlock<Block> MARCASITE_ROUGH = DFBlockUtils.rough(MARCASITE);
	public static final DeferredBlock<Block> MARCASITE_SMOOTH = DFBlockUtils.smooth(MARCASITE);
	public static final DeferredBlock<ButtonBlock> MARCASITE_BUTTON = DFBlockUtils.button(MARCASITE);
	public static final DeferredBlock<DoorBlock> MARCASITE_DOOR = DFBlockUtils.door(MARCASITE);
	public static final DeferredBlock<PressurePlateBlock> MARCASITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(MARCASITE);
	public static final DeferredBlock<SlabBlock> MARCASITE_ROUGH_SLAB = DFBlockUtils.roughSlab(MARCASITE);
	public static final DeferredBlock<SlabBlock> MARCASITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(MARCASITE);
	public static final DeferredBlock<StairBlock> MARCASITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(MARCASITE, MARCASITE_ROUGH);
	public static final DeferredBlock<StairBlock> MARCASITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(MARCASITE, MARCASITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> MARCASITE_TRAPDOOR = DFBlockUtils.trapdoor(MARCASITE);
	public static final DeferredBlock<WallBlock> MARCASITE_ROUGH_WALL = DFBlockUtils.roughWall(MARCASITE);
	public static final DeferredBlock<WallBlock> MARCASITE_SMOOTH_WALL = DFBlockUtils.smoothWall(MARCASITE);

	// mica
	public static final DeferredBlock<Block> MICA_ENGRAVED = DFBlockUtils.engraved(MICA);
	public static final DeferredBlock<Block> MICA_ROUGH = DFBlockUtils.rough(MICA);
	public static final DeferredBlock<Block> MICA_SMOOTH = DFBlockUtils.smooth(MICA);
	public static final DeferredBlock<ButtonBlock> MICA_BUTTON = DFBlockUtils.button(MICA);
	public static final DeferredBlock<DoorBlock> MICA_DOOR = DFBlockUtils.door(MICA);
	public static final DeferredBlock<PressurePlateBlock> MICA_PRESSURE_PLATE = DFBlockUtils.pressurePlate(MICA);
	public static final DeferredBlock<SlabBlock> MICA_ROUGH_SLAB = DFBlockUtils.roughSlab(MICA);
	public static final DeferredBlock<SlabBlock> MICA_SMOOTH_SLAB = DFBlockUtils.smoothSlab(MICA);
	public static final DeferredBlock<StairBlock> MICA_ROUGH_STAIRS = DFBlockUtils.roughStairs(MICA, MICA_ROUGH);
	public static final DeferredBlock<StairBlock> MICA_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(MICA, MICA_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> MICA_TRAPDOOR = DFBlockUtils.trapdoor(MICA);
	public static final DeferredBlock<WallBlock> MICA_ROUGH_WALL = DFBlockUtils.roughWall(MICA);
	public static final DeferredBlock<WallBlock> MICA_SMOOTH_WALL = DFBlockUtils.smoothWall(MICA);

	// microcline
	public static final DeferredBlock<Block> MICROCLINE_ENGRAVED = DFBlockUtils.engraved(MICROCLINE);
	public static final DeferredBlock<Block> MICROCLINE_ROUGH = DFBlockUtils.rough(MICROCLINE);
	public static final DeferredBlock<Block> MICROCLINE_SMOOTH = DFBlockUtils.smooth(MICROCLINE);
	public static final DeferredBlock<ButtonBlock> MICROCLINE_BUTTON = DFBlockUtils.button(MICROCLINE);
	public static final DeferredBlock<DoorBlock> MICROCLINE_DOOR = DFBlockUtils.door(MICROCLINE);
	public static final DeferredBlock<PressurePlateBlock> MICROCLINE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(MICROCLINE);
	public static final DeferredBlock<SlabBlock> MICROCLINE_ROUGH_SLAB = DFBlockUtils.roughSlab(MICROCLINE);
	public static final DeferredBlock<SlabBlock> MICROCLINE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(MICROCLINE);
	public static final DeferredBlock<StairBlock> MICROCLINE_ROUGH_STAIRS = DFBlockUtils.roughStairs(MICROCLINE, MICROCLINE_ROUGH);
	public static final DeferredBlock<StairBlock> MICROCLINE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(MICROCLINE, MICROCLINE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> MICROCLINE_TRAPDOOR = DFBlockUtils.trapdoor(MICROCLINE);
	public static final DeferredBlock<WallBlock> MICROCLINE_ROUGH_WALL = DFBlockUtils.roughWall(MICROCLINE);
	public static final DeferredBlock<WallBlock> MICROCLINE_SMOOTH_WALL = DFBlockUtils.smoothWall(MICROCLINE);

	// olivine
	public static final DeferredBlock<Block> OLIVINE_ENGRAVED = DFBlockUtils.engraved(OLIVINE);
	public static final DeferredBlock<Block> OLIVINE_ROUGH = DFBlockUtils.rough(OLIVINE);
	public static final DeferredBlock<Block> OLIVINE_SMOOTH = DFBlockUtils.smooth(OLIVINE);
	public static final DeferredBlock<ButtonBlock> OLIVINE_BUTTON = DFBlockUtils.button(OLIVINE);
	public static final DeferredBlock<DoorBlock> OLIVINE_DOOR = DFBlockUtils.door(OLIVINE);
	public static final DeferredBlock<PressurePlateBlock> OLIVINE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(OLIVINE);
	public static final DeferredBlock<SlabBlock> OLIVINE_ROUGH_SLAB = DFBlockUtils.roughSlab(OLIVINE);
	public static final DeferredBlock<SlabBlock> OLIVINE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(OLIVINE);
	public static final DeferredBlock<StairBlock> OLIVINE_ROUGH_STAIRS = DFBlockUtils.roughStairs(OLIVINE, OLIVINE_ROUGH);
	public static final DeferredBlock<StairBlock> OLIVINE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(OLIVINE, OLIVINE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> OLIVINE_TRAPDOOR = DFBlockUtils.trapdoor(OLIVINE);
	public static final DeferredBlock<WallBlock> OLIVINE_ROUGH_WALL = DFBlockUtils.roughWall(OLIVINE);
	public static final DeferredBlock<WallBlock> OLIVINE_SMOOTH_WALL = DFBlockUtils.smoothWall(OLIVINE);

	// orpiment
	public static final DeferredBlock<Block> ORPIMENT_ENGRAVED = DFBlockUtils.engraved(ORPIMENT);
	public static final DeferredBlock<Block> ORPIMENT_ROUGH = DFBlockUtils.rough(ORPIMENT);
	public static final DeferredBlock<Block> ORPIMENT_SMOOTH = DFBlockUtils.smooth(ORPIMENT);
	public static final DeferredBlock<ButtonBlock> ORPIMENT_BUTTON = DFBlockUtils.button(ORPIMENT);
	public static final DeferredBlock<DoorBlock> ORPIMENT_DOOR = DFBlockUtils.door(ORPIMENT);
	public static final DeferredBlock<PressurePlateBlock> ORPIMENT_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ORPIMENT);
	public static final DeferredBlock<SlabBlock> ORPIMENT_ROUGH_SLAB = DFBlockUtils.roughSlab(ORPIMENT);
	public static final DeferredBlock<SlabBlock> ORPIMENT_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ORPIMENT);
	public static final DeferredBlock<StairBlock> ORPIMENT_ROUGH_STAIRS = DFBlockUtils.roughStairs(ORPIMENT, ORPIMENT_ROUGH);
	public static final DeferredBlock<StairBlock> ORPIMENT_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ORPIMENT, ORPIMENT_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ORPIMENT_TRAPDOOR = DFBlockUtils.trapdoor(ORPIMENT);
	public static final DeferredBlock<WallBlock> ORPIMENT_ROUGH_WALL = DFBlockUtils.roughWall(ORPIMENT);
	public static final DeferredBlock<WallBlock> ORPIMENT_SMOOTH_WALL = DFBlockUtils.smoothWall(ORPIMENT);

	// orthoclase
	public static final DeferredBlock<Block> ORTHOCLASE_ENGRAVED = DFBlockUtils.engraved(ORTHOCLASE);
	public static final DeferredBlock<Block> ORTHOCLASE_ROUGH = DFBlockUtils.rough(ORTHOCLASE);
	public static final DeferredBlock<Block> ORTHOCLASE_SMOOTH = DFBlockUtils.smooth(ORTHOCLASE);
	public static final DeferredBlock<ButtonBlock> ORTHOCLASE_BUTTON = DFBlockUtils.button(ORTHOCLASE);
	public static final DeferredBlock<DoorBlock> ORTHOCLASE_DOOR = DFBlockUtils.door(ORTHOCLASE);
	public static final DeferredBlock<PressurePlateBlock> ORTHOCLASE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(ORTHOCLASE);
	public static final DeferredBlock<SlabBlock> ORTHOCLASE_ROUGH_SLAB = DFBlockUtils.roughSlab(ORTHOCLASE);
	public static final DeferredBlock<SlabBlock> ORTHOCLASE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(ORTHOCLASE);
	public static final DeferredBlock<StairBlock> ORTHOCLASE_ROUGH_STAIRS = DFBlockUtils.roughStairs(ORTHOCLASE, ORTHOCLASE_ROUGH);
	public static final DeferredBlock<StairBlock> ORTHOCLASE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(ORTHOCLASE, ORTHOCLASE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> ORTHOCLASE_TRAPDOOR = DFBlockUtils.trapdoor(ORTHOCLASE);
	public static final DeferredBlock<WallBlock> ORTHOCLASE_ROUGH_WALL = DFBlockUtils.roughWall(ORTHOCLASE);
	public static final DeferredBlock<WallBlock> ORTHOCLASE_SMOOTH_WALL = DFBlockUtils.smoothWall(ORTHOCLASE);

	// periclase
	public static final DeferredBlock<Block> PERICLASE_ENGRAVED = DFBlockUtils.engraved(PERICLASE);
	public static final DeferredBlock<Block> PERICLASE_ROUGH = DFBlockUtils.rough(PERICLASE);
	public static final DeferredBlock<Block> PERICLASE_SMOOTH = DFBlockUtils.smooth(PERICLASE);
	public static final DeferredBlock<ButtonBlock> PERICLASE_BUTTON = DFBlockUtils.button(PERICLASE);
	public static final DeferredBlock<DoorBlock> PERICLASE_DOOR = DFBlockUtils.door(PERICLASE);
	public static final DeferredBlock<PressurePlateBlock> PERICLASE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(PERICLASE);
	public static final DeferredBlock<SlabBlock> PERICLASE_ROUGH_SLAB = DFBlockUtils.roughSlab(PERICLASE);
	public static final DeferredBlock<SlabBlock> PERICLASE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(PERICLASE);
	public static final DeferredBlock<StairBlock> PERICLASE_ROUGH_STAIRS = DFBlockUtils.roughStairs(PERICLASE, PERICLASE_ROUGH);
	public static final DeferredBlock<StairBlock> PERICLASE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(PERICLASE, PERICLASE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> PERICLASE_TRAPDOOR = DFBlockUtils.trapdoor(PERICLASE);
	public static final DeferredBlock<WallBlock> PERICLASE_ROUGH_WALL = DFBlockUtils.roughWall(PERICLASE);
	public static final DeferredBlock<WallBlock> PERICLASE_SMOOTH_WALL = DFBlockUtils.smoothWall(PERICLASE);

	// pertrified_wood
	public static final DeferredBlock<Block> PETRIFIED_WOOD_ENGRAVED = DFBlockUtils.engraved(PETRIFIED_WOOD);
	public static final DeferredBlock<Block> PETRIFIED_WOOD_ROUGH = DFBlockUtils.rough(PETRIFIED_WOOD);
	public static final DeferredBlock<Block> PETRIFIED_WOOD_SMOOTH = DFBlockUtils.smooth(PETRIFIED_WOOD);
	public static final DeferredBlock<ButtonBlock> PETRIFIED_WOOD_BUTTON = DFBlockUtils.button(PETRIFIED_WOOD);
	public static final DeferredBlock<DoorBlock> PETRIFIED_WOOD_DOOR = DFBlockUtils.door(PETRIFIED_WOOD);
	public static final DeferredBlock<PressurePlateBlock> PETRIFIED_WOOD_PRESSURE_PLATE = DFBlockUtils.pressurePlate(PETRIFIED_WOOD);
	public static final DeferredBlock<SlabBlock> PETRIFIED_WOOD_ROUGH_SLAB = DFBlockUtils.roughSlab(PETRIFIED_WOOD);
	public static final DeferredBlock<SlabBlock> PETRIFIED_WOOD_SMOOTH_SLAB = DFBlockUtils.smoothSlab(PETRIFIED_WOOD);
	public static final DeferredBlock<StairBlock> PETRIFIED_WOOD_ROUGH_STAIRS = DFBlockUtils.roughStairs(PETRIFIED_WOOD, PETRIFIED_WOOD_ROUGH);
	public static final DeferredBlock<StairBlock> PETRIFIED_WOOD_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(PETRIFIED_WOOD, PETRIFIED_WOOD_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> PETRIFIED_WOOD_TRAPDOOR = DFBlockUtils.trapdoor(PETRIFIED_WOOD);
	public static final DeferredBlock<WallBlock> PETRIFIED_WOOD_ROUGH_WALL = DFBlockUtils.roughWall(PETRIFIED_WOOD);
	public static final DeferredBlock<WallBlock> PETRIFIED_WOOD_SMOOTH_WALL = DFBlockUtils.smoothWall(PETRIFIED_WOOD);

	// pitchblende
	public static final DeferredBlock<Block> PITCHBLENDE_ENGRAVED = DFBlockUtils.engraved(PITCHBLENDE);
	public static final DeferredBlock<Block> PITCHBLENDE_ROUGH = DFBlockUtils.rough(PITCHBLENDE);
	public static final DeferredBlock<Block> PITCHBLENDE_SMOOTH = DFBlockUtils.smooth(PITCHBLENDE);
	public static final DeferredBlock<ButtonBlock> PITCHBLENDE_BUTTON = DFBlockUtils.button(PITCHBLENDE);
	public static final DeferredBlock<DoorBlock> PITCHBLENDE_DOOR = DFBlockUtils.door(PITCHBLENDE);
	public static final DeferredBlock<PressurePlateBlock> PITCHBLENDE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(PITCHBLENDE);
	public static final DeferredBlock<SlabBlock> PITCHBLENDE_ROUGH_SLAB = DFBlockUtils.roughSlab(PITCHBLENDE);
	public static final DeferredBlock<SlabBlock> PITCHBLENDE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(PITCHBLENDE);
	public static final DeferredBlock<StairBlock> PITCHBLENDE_ROUGH_STAIRS = DFBlockUtils.roughStairs(PITCHBLENDE, PITCHBLENDE_ROUGH);
	public static final DeferredBlock<StairBlock> PITCHBLENDE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(PITCHBLENDE, PITCHBLENDE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> PITCHBLENDE_TRAPDOOR = DFBlockUtils.trapdoor(PITCHBLENDE);
	public static final DeferredBlock<WallBlock> PITCHBLENDE_ROUGH_WALL = DFBlockUtils.roughWall(PITCHBLENDE);
	public static final DeferredBlock<WallBlock> PITCHBLENDE_SMOOTH_WALL = DFBlockUtils.smoothWall(PITCHBLENDE);

	// puddingstone
	public static final DeferredBlock<Block> PUDDINGSTONE_ENGRAVED = DFBlockUtils.engraved(PUDDINGSTONE);
	public static final DeferredBlock<Block> PUDDINGSTONE_ROUGH = DFBlockUtils.rough(PUDDINGSTONE);
	public static final DeferredBlock<Block> PUDDINGSTONE_SMOOTH = DFBlockUtils.smooth(PUDDINGSTONE);
	public static final DeferredBlock<ButtonBlock> PUDDINGSTONE_BUTTON = DFBlockUtils.button(PUDDINGSTONE);
	public static final DeferredBlock<DoorBlock> PUDDINGSTONE_DOOR = DFBlockUtils.door(PUDDINGSTONE);
	public static final DeferredBlock<PressurePlateBlock> PUDDINGSTONE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(PUDDINGSTONE);
	public static final DeferredBlock<SlabBlock> PUDDINGSTONE_ROUGH_SLAB = DFBlockUtils.roughSlab(PUDDINGSTONE);
	public static final DeferredBlock<SlabBlock> PUDDINGSTONE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(PUDDINGSTONE);
	public static final DeferredBlock<StairBlock> PUDDINGSTONE_ROUGH_STAIRS = DFBlockUtils.roughStairs(PUDDINGSTONE, PUDDINGSTONE_ROUGH);
	public static final DeferredBlock<StairBlock> PUDDINGSTONE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(PUDDINGSTONE, PUDDINGSTONE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> PUDDINGSTONE_TRAPDOOR = DFBlockUtils.trapdoor(PUDDINGSTONE);
	public static final DeferredBlock<WallBlock> PUDDINGSTONE_ROUGH_WALL = DFBlockUtils.roughWall(PUDDINGSTONE);
	public static final DeferredBlock<WallBlock> PUDDINGSTONE_SMOOTH_WALL = DFBlockUtils.smoothWall(PUDDINGSTONE);

	// pyrolusite
	public static final DeferredBlock<Block> PYROLUSITE_ENGRAVED = DFBlockUtils.engraved(PYROLUSITE);
	public static final DeferredBlock<Block> PYROLUSITE_ROUGH = DFBlockUtils.rough(PYROLUSITE);
	public static final DeferredBlock<Block> PYROLUSITE_SMOOTH = DFBlockUtils.smooth(PYROLUSITE);
	public static final DeferredBlock<ButtonBlock> PYROLUSITE_BUTTON = DFBlockUtils.button(PYROLUSITE);
	public static final DeferredBlock<DoorBlock> PYROLUSITE_DOOR = DFBlockUtils.door(PYROLUSITE);
	public static final DeferredBlock<PressurePlateBlock> PYROLUSITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(PYROLUSITE);
	public static final DeferredBlock<SlabBlock> PYROLUSITE_ROUGH_SLAB = DFBlockUtils.roughSlab(PYROLUSITE);
	public static final DeferredBlock<SlabBlock> PYROLUSITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(PYROLUSITE);
	public static final DeferredBlock<StairBlock> PYROLUSITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(PYROLUSITE, PYROLUSITE_ROUGH);
	public static final DeferredBlock<StairBlock> PYROLUSITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(PYROLUSITE, PYROLUSITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> PYROLUSITE_TRAPDOOR = DFBlockUtils.trapdoor(PYROLUSITE);
	public static final DeferredBlock<WallBlock> PYROLUSITE_ROUGH_WALL = DFBlockUtils.roughWall(PYROLUSITE);
	public static final DeferredBlock<WallBlock> PYROLUSITE_SMOOTH_WALL = DFBlockUtils.smoothWall(PYROLUSITE);

	// realgar
	public static final DeferredBlock<Block> REALGAR_ENGRAVED = DFBlockUtils.engraved(REALGAR);
	public static final DeferredBlock<Block> REALGAR_ROUGH = DFBlockUtils.rough(REALGAR);
	public static final DeferredBlock<Block> REALGAR_SMOOTH = DFBlockUtils.smooth(REALGAR);
	public static final DeferredBlock<ButtonBlock> REALGAR_BUTTON = DFBlockUtils.button(REALGAR);
	public static final DeferredBlock<DoorBlock> REALGAR_DOOR = DFBlockUtils.door(REALGAR);
	public static final DeferredBlock<PressurePlateBlock> REALGAR_PRESSURE_PLATE = DFBlockUtils.pressurePlate(REALGAR);
	public static final DeferredBlock<SlabBlock> REALGAR_ROUGH_SLAB = DFBlockUtils.roughSlab(REALGAR);
	public static final DeferredBlock<SlabBlock> REALGAR_SMOOTH_SLAB = DFBlockUtils.smoothSlab(REALGAR);
	public static final DeferredBlock<StairBlock> REALGAR_ROUGH_STAIRS = DFBlockUtils.roughStairs(REALGAR, REALGAR_ROUGH);
	public static final DeferredBlock<StairBlock> REALGAR_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(REALGAR, REALGAR_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> REALGAR_TRAPDOOR = DFBlockUtils.trapdoor(REALGAR);
	public static final DeferredBlock<WallBlock> REALGAR_ROUGH_WALL = DFBlockUtils.roughWall(REALGAR);
	public static final DeferredBlock<WallBlock> REALGAR_SMOOTH_WALL = DFBlockUtils.smoothWall(REALGAR);

	// rutile
	public static final DeferredBlock<Block> RUTILE_ENGRAVED = DFBlockUtils.engraved(RUTILE);
	public static final DeferredBlock<Block> RUTILE_ROUGH = DFBlockUtils.rough(RUTILE);
	public static final DeferredBlock<Block> RUTILE_SMOOTH = DFBlockUtils.smooth(RUTILE);
	public static final DeferredBlock<ButtonBlock> RUTILE_BUTTON = DFBlockUtils.button(RUTILE);
	public static final DeferredBlock<DoorBlock> RUTILE_DOOR = DFBlockUtils.door(RUTILE);
	public static final DeferredBlock<PressurePlateBlock> RUTILE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(RUTILE);
	public static final DeferredBlock<SlabBlock> RUTILE_ROUGH_SLAB = DFBlockUtils.roughSlab(RUTILE);
	public static final DeferredBlock<SlabBlock> RUTILE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(RUTILE);
	public static final DeferredBlock<StairBlock> RUTILE_ROUGH_STAIRS = DFBlockUtils.roughStairs(RUTILE, RUTILE_ROUGH);
	public static final DeferredBlock<StairBlock> RUTILE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(RUTILE, RUTILE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> RUTILE_TRAPDOOR = DFBlockUtils.trapdoor(RUTILE);
	public static final DeferredBlock<WallBlock> RUTILE_ROUGH_WALL = DFBlockUtils.roughWall(RUTILE);
	public static final DeferredBlock<WallBlock> RUTILE_SMOOTH_WALL = DFBlockUtils.smoothWall(RUTILE);

	// saltpeter
	public static final DeferredBlock<Block> SALTPETER_ENGRAVED = DFBlockUtils.engraved(SALTPETER);
	public static final DeferredBlock<Block> SALTPETER_ROUGH = DFBlockUtils.rough(SALTPETER);
	public static final DeferredBlock<Block> SALTPETER_SMOOTH = DFBlockUtils.smooth(SALTPETER);
	public static final DeferredBlock<ButtonBlock> SALTPETER_BUTTON = DFBlockUtils.button(SALTPETER);
	public static final DeferredBlock<DoorBlock> SALTPETER_DOOR = DFBlockUtils.door(SALTPETER);
	public static final DeferredBlock<PressurePlateBlock> SALTPETER_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SALTPETER);
	public static final DeferredBlock<SlabBlock> SALTPETER_ROUGH_SLAB = DFBlockUtils.roughSlab(SALTPETER);
	public static final DeferredBlock<SlabBlock> SALTPETER_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SALTPETER);
	public static final DeferredBlock<StairBlock> SALTPETER_ROUGH_STAIRS = DFBlockUtils.roughStairs(SALTPETER, SALTPETER_ROUGH);
	public static final DeferredBlock<StairBlock> SALTPETER_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SALTPETER, SALTPETER_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SALTPETER_TRAPDOOR = DFBlockUtils.trapdoor(SALTPETER);
	public static final DeferredBlock<WallBlock> SALTPETER_ROUGH_WALL = DFBlockUtils.roughWall(SALTPETER);
	public static final DeferredBlock<WallBlock> SALTPETER_SMOOTH_WALL = DFBlockUtils.smoothWall(SALTPETER);

	// satinspar
	public static final DeferredBlock<Block> SATINSPAR_ENGRAVED = DFBlockUtils.engraved(SATINSPAR);
	public static final DeferredBlock<Block> SATINSPAR_ROUGH = DFBlockUtils.rough(SATINSPAR);
	public static final DeferredBlock<Block> SATINSPAR_SMOOTH = DFBlockUtils.smooth(SATINSPAR);
	public static final DeferredBlock<ButtonBlock> SATINSPAR_BUTTON = DFBlockUtils.button(SATINSPAR);
	public static final DeferredBlock<DoorBlock> SATINSPAR_DOOR = DFBlockUtils.door(SATINSPAR);
	public static final DeferredBlock<PressurePlateBlock> SATINSPAR_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SATINSPAR);
	public static final DeferredBlock<SlabBlock> SATINSPAR_ROUGH_SLAB = DFBlockUtils.roughSlab(SATINSPAR);
	public static final DeferredBlock<SlabBlock> SATINSPAR_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SATINSPAR);
	public static final DeferredBlock<StairBlock> SATINSPAR_ROUGH_STAIRS = DFBlockUtils.roughStairs(SATINSPAR, SATINSPAR_ROUGH);
	public static final DeferredBlock<StairBlock> SATINSPAR_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SATINSPAR, SATINSPAR_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SATINSPAR_TRAPDOOR = DFBlockUtils.trapdoor(SATINSPAR);
	public static final DeferredBlock<WallBlock> SATINSPAR_ROUGH_WALL = DFBlockUtils.roughWall(SATINSPAR);
	public static final DeferredBlock<WallBlock> SATINSPAR_SMOOTH_WALL = DFBlockUtils.smoothWall(SATINSPAR);

	// selenite
	public static final DeferredBlock<Block> SELENITE_ENGRAVED = DFBlockUtils.engraved(SELENITE);
	public static final DeferredBlock<Block> SELENITE_ROUGH = DFBlockUtils.rough(SELENITE);
	public static final DeferredBlock<Block> SELENITE_SMOOTH = DFBlockUtils.smooth(SELENITE);
	public static final DeferredBlock<ButtonBlock> SELENITE_BUTTON = DFBlockUtils.button(SELENITE);
	public static final DeferredBlock<DoorBlock> SELENITE_DOOR = DFBlockUtils.door(SELENITE);
	public static final DeferredBlock<PressurePlateBlock> SELENITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SELENITE);
	public static final DeferredBlock<SlabBlock> SELENITE_ROUGH_SLAB = DFBlockUtils.roughSlab(SELENITE);
	public static final DeferredBlock<SlabBlock> SELENITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SELENITE);
	public static final DeferredBlock<StairBlock> SELENITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(SELENITE, SELENITE_ROUGH);
	public static final DeferredBlock<StairBlock> SELENITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SELENITE, SELENITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SELENITE_TRAPDOOR = DFBlockUtils.trapdoor(SELENITE);
	public static final DeferredBlock<WallBlock> SELENITE_ROUGH_WALL = DFBlockUtils.roughWall(SELENITE);
	public static final DeferredBlock<WallBlock> SELENITE_SMOOTH_WALL = DFBlockUtils.smoothWall(SELENITE);

	// serpentine
	public static final DeferredBlock<Block> SERPENTINE_ENGRAVED = DFBlockUtils.engraved(SERPENTINE);
	public static final DeferredBlock<Block> SERPENTINE_ROUGH = DFBlockUtils.rough(SERPENTINE);
	public static final DeferredBlock<Block> SERPENTINE_SMOOTH = DFBlockUtils.smooth(SERPENTINE);
	public static final DeferredBlock<ButtonBlock> SERPENTINE_BUTTON = DFBlockUtils.button(SERPENTINE);
	public static final DeferredBlock<DoorBlock> SERPENTINE_DOOR = DFBlockUtils.door(SERPENTINE);
	public static final DeferredBlock<PressurePlateBlock> SERPENTINE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SERPENTINE);
	public static final DeferredBlock<SlabBlock> SERPENTINE_ROUGH_SLAB = DFBlockUtils.roughSlab(SERPENTINE);
	public static final DeferredBlock<SlabBlock> SERPENTINE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SERPENTINE);
	public static final DeferredBlock<StairBlock> SERPENTINE_ROUGH_STAIRS = DFBlockUtils.roughStairs(SERPENTINE, SERPENTINE_ROUGH);
	public static final DeferredBlock<StairBlock> SERPENTINE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SERPENTINE, SERPENTINE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SERPENTINE_TRAPDOOR = DFBlockUtils.trapdoor(SERPENTINE);
	public static final DeferredBlock<WallBlock> SERPENTINE_ROUGH_WALL = DFBlockUtils.roughWall(SERPENTINE);
	public static final DeferredBlock<WallBlock> SERPENTINE_SMOOTH_WALL = DFBlockUtils.smoothWall(SERPENTINE);

	// stibnite
	public static final DeferredBlock<Block> STIBNITE_ENGRAVED = DFBlockUtils.engraved(STIBNITE);
	public static final DeferredBlock<Block> STIBNITE_ROUGH = DFBlockUtils.rough(STIBNITE);
	public static final DeferredBlock<Block> STIBNITE_SMOOTH = DFBlockUtils.smooth(STIBNITE);
	public static final DeferredBlock<ButtonBlock> STIBNITE_BUTTON = DFBlockUtils.button(STIBNITE);
	public static final DeferredBlock<DoorBlock> STIBNITE_DOOR = DFBlockUtils.door(STIBNITE);
	public static final DeferredBlock<PressurePlateBlock> STIBNITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(STIBNITE);
	public static final DeferredBlock<SlabBlock> STIBNITE_ROUGH_SLAB = DFBlockUtils.roughSlab(STIBNITE);
	public static final DeferredBlock<SlabBlock> STIBNITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(STIBNITE);
	public static final DeferredBlock<StairBlock> STIBNITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(STIBNITE, STIBNITE_ROUGH);
	public static final DeferredBlock<StairBlock> STIBNITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(STIBNITE, STIBNITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> STIBNITE_TRAPDOOR = DFBlockUtils.trapdoor(STIBNITE);
	public static final DeferredBlock<WallBlock> STIBNITE_ROUGH_WALL = DFBlockUtils.roughWall(STIBNITE);
	public static final DeferredBlock<WallBlock> STIBNITE_SMOOTH_WALL = DFBlockUtils.smoothWall(STIBNITE);

	// sylvite
	public static final DeferredBlock<Block> SYLVITE_ENGRAVED = DFBlockUtils.engraved(SYLVITE);
	public static final DeferredBlock<Block> SYLVITE_ROUGH = DFBlockUtils.rough(SYLVITE);
	public static final DeferredBlock<Block> SYLVITE_SMOOTH = DFBlockUtils.smooth(SYLVITE);
	public static final DeferredBlock<ButtonBlock> SYLVITE_BUTTON = DFBlockUtils.button(SYLVITE);
	public static final DeferredBlock<DoorBlock> SYLVITE_DOOR = DFBlockUtils.door(SYLVITE);
	public static final DeferredBlock<PressurePlateBlock> SYLVITE_PRESSURE_PLATE = DFBlockUtils.pressurePlate(SYLVITE);
	public static final DeferredBlock<SlabBlock> SYLVITE_ROUGH_SLAB = DFBlockUtils.roughSlab(SYLVITE);
	public static final DeferredBlock<SlabBlock> SYLVITE_SMOOTH_SLAB = DFBlockUtils.smoothSlab(SYLVITE);
	public static final DeferredBlock<StairBlock> SYLVITE_ROUGH_STAIRS = DFBlockUtils.roughStairs(SYLVITE, SYLVITE_ROUGH);
	public static final DeferredBlock<StairBlock> SYLVITE_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(SYLVITE, SYLVITE_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> SYLVITE_TRAPDOOR = DFBlockUtils.trapdoor(SYLVITE);
	public static final DeferredBlock<WallBlock> SYLVITE_ROUGH_WALL = DFBlockUtils.roughWall(SYLVITE);
	public static final DeferredBlock<WallBlock> SYLVITE_SMOOTH_WALL = DFBlockUtils.smoothWall(SYLVITE);

	// talc
	public static final DeferredBlock<Block> TALC_ENGRAVED = DFBlockUtils.engraved(TALC);
	public static final DeferredBlock<Block> TALC_ROUGH = DFBlockUtils.rough(TALC);
	public static final DeferredBlock<Block> TALC_SMOOTH = DFBlockUtils.smooth(TALC);
	public static final DeferredBlock<ButtonBlock> TALC_BUTTON = DFBlockUtils.button(TALC);
	public static final DeferredBlock<DoorBlock> TALC_DOOR = DFBlockUtils.door(TALC);
	public static final DeferredBlock<PressurePlateBlock> TALC_PRESSURE_PLATE = DFBlockUtils.pressurePlate(TALC);
	public static final DeferredBlock<SlabBlock> TALC_ROUGH_SLAB = DFBlockUtils.roughSlab(TALC);
	public static final DeferredBlock<SlabBlock> TALC_SMOOTH_SLAB = DFBlockUtils.smoothSlab(TALC);
	public static final DeferredBlock<StairBlock> TALC_ROUGH_STAIRS = DFBlockUtils.roughStairs(TALC, TALC_ROUGH);
	public static final DeferredBlock<StairBlock> TALC_SMOOTH_STAIRS = DFBlockUtils.smoothStairs(TALC, TALC_SMOOTH);
	public static final DeferredBlock<TrapDoorBlock> TALC_TRAPDOOR = DFBlockUtils.trapdoor(TALC);
	public static final DeferredBlock<WallBlock> TALC_ROUGH_WALL = DFBlockUtils.roughWall(TALC);
	public static final DeferredBlock<WallBlock> TALC_SMOOTH_WALL = DFBlockUtils.smoothWall(TALC);


	static {
		for (Tree tree : Tree.values())
			WOODS.put(tree, new DFBlockFamilies.DFWoodFamily(tree.name));
	}

	public static void generate() {}

	public static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, B> factory) {
		return register(name, factory, UnaryOperator.identity());
	}

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


}
