package com.lancelotbronner.df.blocks;

import net.minecraft.data.BlockFamily;

import static com.lancelotbronner.df.blocks.DFBlocks.*;

public class DFBlockFamily {
	// chalk
	public final static BlockFamily ROUGH_CHALK = new BlockFamily.Builder(DFBlocks.CHALK_ROUGH.get())
		.slab(DFBlocks.CHALK_ROUGH_SLAB.get())
		.stairs(CHALK_ROUGH_STAIRS.get())
		.wall(CHALK_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CHALK = new BlockFamily.Builder(CHALK_SMOOTH.get())
		.button(CHALK_BUTTON.get())
		.chiseled(CHALK_ENGRAVED.get())
		.door(CHALK_DOOR.get())
		.pressurePlate(CHALK_PRESSURE_PLATE.get())
		.slab(CHALK_SMOOTH_SLAB.get())
		.stairs(CHALK_SMOOTH_STAIRS.get())
		.trapdoor(CHALK_TRAPDOOR.get())
		.wall(CHALK_SMOOTH_WALL.get())
		.getFamily();

	// chert
	public final static BlockFamily ROUGH_CHERT = new BlockFamily.Builder(DFBlocks.CHERT_ROUGH.get())
		.slab(DFBlocks.CHERT_ROUGH_SLAB.get())
		.stairs(CHERT_ROUGH_STAIRS.get())
		.wall(CHERT_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CHERT = new BlockFamily.Builder(CHERT_SMOOTH.get())
		.button(CHERT_BUTTON.get())
		.chiseled(CHERT_ENGRAVED.get())
		.door(CHERT_DOOR.get())
		.pressurePlate(CHERT_PRESSURE_PLATE.get())
		.slab(CHERT_SMOOTH_SLAB.get())
		.stairs(CHERT_SMOOTH_STAIRS.get())
		.trapdoor(CHERT_TRAPDOOR.get())
		.wall(CHERT_SMOOTH_WALL.get())
		.getFamily();

	// claystone
	public final static BlockFamily ROUGH_CLAYSTONE = new BlockFamily.Builder(DFBlocks.CLAYSTONE_ROUGH.get())
		.slab(DFBlocks.CLAYSTONE_ROUGH_SLAB.get())
		.stairs(CLAYSTONE_ROUGH_STAIRS.get())
		.wall(CLAYSTONE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CLAYSTONE = new BlockFamily.Builder(CLAYSTONE_SMOOTH.get())
		.button(CLAYSTONE_BUTTON.get())
		.chiseled(CLAYSTONE_ENGRAVED.get())
		.door(CLAYSTONE_DOOR.get())
		.pressurePlate(CLAYSTONE_PRESSURE_PLATE.get())
		.slab(CLAYSTONE_SMOOTH_SLAB.get())
		.stairs(CLAYSTONE_SMOOTH_STAIRS.get())
		.trapdoor(CLAYSTONE_TRAPDOOR.get())
		.wall(CLAYSTONE_SMOOTH_WALL.get())
		.getFamily();

	// conglomerate
	public final static BlockFamily ROUGH_CONGLOMERATE = new BlockFamily.Builder(DFBlocks.CONGLOMERATE_ROUGH.get())
		.slab(DFBlocks.CONGLOMERATE_ROUGH_SLAB.get())
		.stairs(CONGLOMERATE_ROUGH_STAIRS.get())
		.wall(CONGLOMERATE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CONGLOMERATE = new BlockFamily.Builder(
		CONGLOMERATE_SMOOTH.get())
		.button(CONGLOMERATE_BUTTON.get())
		.chiseled(CONGLOMERATE_ENGRAVED.get())
		.door(CONGLOMERATE_DOOR.get())
		.pressurePlate(CONGLOMERATE_PRESSURE_PLATE.get())
		.slab(CONGLOMERATE_SMOOTH_SLAB.get())
		.stairs(CONGLOMERATE_SMOOTH_STAIRS.get())
		.trapdoor(CONGLOMERATE_TRAPDOOR.get())
		.wall(CONGLOMERATE_SMOOTH_WALL.get())
		.getFamily();

	// dolomite
	public final static BlockFamily ROUGH_DOLOMITE = new BlockFamily.Builder(DFBlocks.DOLOMITE_ROUGH.get())
		.slab(DFBlocks.DOLOMITE_ROUGH_SLAB.get())
		.stairs(DOLOMITE_ROUGH_STAIRS.get())
		.wall(DOLOMITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_DOLOMITE = new BlockFamily.Builder(DOLOMITE_SMOOTH.get())
		.button(DOLOMITE_BUTTON.get())
		.chiseled(DOLOMITE_ENGRAVED.get())
		.door(DOLOMITE_DOOR.get())
		.pressurePlate(DOLOMITE_PRESSURE_PLATE.get())
		.slab(DOLOMITE_SMOOTH_SLAB.get())
		.stairs(DOLOMITE_SMOOTH_STAIRS.get())
		.trapdoor(DOLOMITE_TRAPDOOR.get())
		.wall(DOLOMITE_SMOOTH_WALL.get())
		.getFamily();

	// limestone
	public final static BlockFamily ROUGH_LIMESTONE = new BlockFamily.Builder(DFBlocks.LIMESTONE_ROUGH.get())
		.slab(DFBlocks.LIMESTONE_ROUGH_SLAB.get())
		.stairs(LIMESTONE_ROUGH_STAIRS.get())
		.wall(LIMESTONE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_LIMESTONE = new BlockFamily.Builder(LIMESTONE_SMOOTH.get())
		.button(LIMESTONE_BUTTON.get())
		.chiseled(LIMESTONE_ENGRAVED.get())
		.door(LIMESTONE_DOOR.get())
		.pressurePlate(LIMESTONE_PRESSURE_PLATE.get())
		.slab(LIMESTONE_SMOOTH_SLAB.get())
		.stairs(LIMESTONE_SMOOTH_STAIRS.get())
		.trapdoor(LIMESTONE_TRAPDOOR.get())
		.wall(LIMESTONE_SMOOTH_WALL.get())
		.getFamily();

	// mudstone
	public final static BlockFamily ROUGH_MUDSTONE = new BlockFamily.Builder(DFBlocks.MUDSTONE_ROUGH.get())
		.slab(DFBlocks.MUDSTONE_ROUGH_SLAB.get())
		.stairs(MUDSTONE_ROUGH_STAIRS.get())
		.wall(MUDSTONE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_MUDSTONE = new BlockFamily.Builder(MUDSTONE_SMOOTH.get())
		.button(MUDSTONE_BUTTON.get())
		.chiseled(MUDSTONE_ENGRAVED.get())
		.door(MUDSTONE_DOOR.get())
		.pressurePlate(MUDSTONE_PRESSURE_PLATE.get())
		.slab(MUDSTONE_SMOOTH_SLAB.get())
		.stairs(MUDSTONE_SMOOTH_STAIRS.get())
		.trapdoor(MUDSTONE_TRAPDOOR.get())
		.wall(MUDSTONE_SMOOTH_WALL.get())
		.getFamily();

	// rock_salt
	public final static BlockFamily ROUGH_ROCK_SALT = new BlockFamily.Builder(DFBlocks.ROCK_SALT_ROUGH.get())
		.slab(DFBlocks.ROCK_SALT_ROUGH_SLAB.get())
		.stairs(ROCK_SALT_ROUGH_STAIRS.get())
		.wall(ROCK_SALT_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ROCK_SALT = new BlockFamily.Builder(ROCK_SALT_SMOOTH.get())
		.button(ROCK_SALT_BUTTON.get())
		.chiseled(ROCK_SALT_ENGRAVED.get())
		.door(ROCK_SALT_DOOR.get())
		.pressurePlate(ROCK_SALT_PRESSURE_PLATE.get())
		.slab(ROCK_SALT_SMOOTH_SLAB.get())
		.stairs(ROCK_SALT_SMOOTH_STAIRS.get())
		.trapdoor(ROCK_SALT_TRAPDOOR.get())
		.wall(ROCK_SALT_SMOOTH_WALL.get())
		.getFamily();

	// sandstone
	public final static BlockFamily ROUGH_SANDSTONE = new BlockFamily.Builder(DFBlocks.SANDSTONE_ROUGH.get())
		.slab(DFBlocks.SANDSTONE_ROUGH_SLAB.get())
		.stairs(SANDSTONE_ROUGH_STAIRS.get())
		.wall(SANDSTONE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SANDSTONE = new BlockFamily.Builder(SANDSTONE_SMOOTH.get())
		.button(SANDSTONE_BUTTON.get())
		.chiseled(SANDSTONE_ENGRAVED.get())
		.door(SANDSTONE_DOOR.get())
		.pressurePlate(SANDSTONE_PRESSURE_PLATE.get())
		.slab(SANDSTONE_SMOOTH_SLAB.get())
		.stairs(SANDSTONE_SMOOTH_STAIRS.get())
		.trapdoor(SANDSTONE_TRAPDOOR.get())
		.wall(SANDSTONE_SMOOTH_WALL.get())
		.getFamily();

	// shale
	public final static BlockFamily ROUGH_SHALE = new BlockFamily.Builder(DFBlocks.SHALE_ROUGH.get())
		.slab(DFBlocks.SHALE_ROUGH_SLAB.get())
		.stairs(SHALE_ROUGH_STAIRS.get())
		.wall(SHALE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SHALE = new BlockFamily.Builder(SHALE_SMOOTH.get())
		.button(SHALE_BUTTON.get())
		.chiseled(SHALE_ENGRAVED.get())
		.door(SHALE_DOOR.get())
		.pressurePlate(SHALE_PRESSURE_PLATE.get())
		.slab(SHALE_SMOOTH_SLAB.get())
		.stairs(SHALE_SMOOTH_STAIRS.get())
		.trapdoor(SHALE_TRAPDOOR.get())
		.wall(SHALE_SMOOTH_WALL.get())
		.getFamily();

	// siltstone
	public final static BlockFamily ROUGH_SILTSTONE = new BlockFamily.Builder(DFBlocks.SILTSTONE_ROUGH.get())
		.slab(DFBlocks.SILTSTONE_ROUGH_SLAB.get())
		.stairs(SILTSTONE_ROUGH_STAIRS.get())
		.wall(SILTSTONE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SILTSTONE = new BlockFamily.Builder(SILTSTONE_SMOOTH.get())
		.button(SILTSTONE_BUTTON.get())
		.chiseled(SILTSTONE_ENGRAVED.get())
		.door(SILTSTONE_DOOR.get())
		.pressurePlate(SILTSTONE_PRESSURE_PLATE.get())
		.slab(SILTSTONE_SMOOTH_SLAB.get())
		.stairs(SILTSTONE_SMOOTH_STAIRS.get())
		.trapdoor(SILTSTONE_TRAPDOOR.get())
		.wall(SILTSTONE_SMOOTH_WALL.get())
		.getFamily();

	// diorite
	public final static BlockFamily ROUGH_DIORITE = new BlockFamily.Builder(DFBlocks.DIORITE_ROUGH.get())
		.slab(DFBlocks.DIORITE_ROUGH_SLAB.get())
		.stairs(DIORITE_ROUGH_STAIRS.get())
		.wall(DIORITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_DIORITE = new BlockFamily.Builder(DIORITE_SMOOTH.get())
		.button(DIORITE_BUTTON.get())
		.chiseled(DIORITE_ENGRAVED.get())
		.door(DIORITE_DOOR.get())
		.pressurePlate(DIORITE_PRESSURE_PLATE.get())
		.slab(DIORITE_SMOOTH_SLAB.get())
		.stairs(DIORITE_SMOOTH_STAIRS.get())
		.trapdoor(DIORITE_TRAPDOOR.get())
		.wall(DIORITE_SMOOTH_WALL.get())
		.getFamily();

	// gabbro
	public final static BlockFamily ROUGH_GABBRO = new BlockFamily.Builder(DFBlocks.GABBRO_ROUGH.get())
		.slab(DFBlocks.GABBRO_ROUGH_SLAB.get())
		.stairs(GABBRO_ROUGH_STAIRS.get())
		.wall(GABBRO_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_GABBRO = new BlockFamily.Builder(GABBRO_SMOOTH.get())
		.button(GABBRO_BUTTON.get())
		.chiseled(GABBRO_ENGRAVED.get())
		.door(GABBRO_DOOR.get())
		.pressurePlate(GABBRO_PRESSURE_PLATE.get())
		.slab(GABBRO_SMOOTH_SLAB.get())
		.stairs(GABBRO_SMOOTH_STAIRS.get())
		.trapdoor(GABBRO_TRAPDOOR.get())
		.wall(GABBRO_SMOOTH_WALL.get())
		.getFamily();

	// granite
	public final static BlockFamily ROUGH_GRANITE = new BlockFamily.Builder(DFBlocks.GRANITE_ROUGH.get())
		.slab(DFBlocks.GRANITE_ROUGH_SLAB.get())
		.stairs(GRANITE_ROUGH_STAIRS.get())
		.wall(GRANITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_GRANITE = new BlockFamily.Builder(GRANITE_SMOOTH.get())
		.button(GRANITE_BUTTON.get())
		.chiseled(GRANITE_ENGRAVED.get())
		.door(GRANITE_DOOR.get())
		.pressurePlate(GRANITE_PRESSURE_PLATE.get())
		.slab(GRANITE_SMOOTH_SLAB.get())
		.stairs(GRANITE_SMOOTH_STAIRS.get())
		.trapdoor(GRANITE_TRAPDOOR.get())
		.wall(GRANITE_SMOOTH_WALL.get())
		.getFamily();

	// andesite
	public final static BlockFamily ROUGH_ANDESITE = new BlockFamily.Builder(DFBlocks.ANDESITE_ROUGH.get())
		.slab(DFBlocks.ANDESITE_ROUGH_SLAB.get())
		.stairs(ANDESITE_ROUGH_STAIRS.get())
		.wall(ANDESITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ANDESITE = new BlockFamily.Builder(ANDESITE_SMOOTH.get())
		.button(ANDESITE_BUTTON.get())
		.chiseled(ANDESITE_ENGRAVED.get())
		.door(ANDESITE_DOOR.get())
		.pressurePlate(ANDESITE_PRESSURE_PLATE.get())
		.slab(ANDESITE_SMOOTH_SLAB.get())
		.stairs(ANDESITE_SMOOTH_STAIRS.get())
		.trapdoor(ANDESITE_TRAPDOOR.get())
		.wall(ANDESITE_SMOOTH_WALL.get())
		.getFamily();

	// basalt
	public final static BlockFamily ROUGH_BASALT = new BlockFamily.Builder(DFBlocks.BASALT_ROUGH.get())
		.slab(DFBlocks.BASALT_ROUGH_SLAB.get())
		.stairs(BASALT_ROUGH_STAIRS.get())
		.wall(BASALT_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_BASALT = new BlockFamily.Builder(BASALT_SMOOTH.get())
		.button(BASALT_BUTTON.get())
		.chiseled(BASALT_ENGRAVED.get())
		.door(BASALT_DOOR.get())
		.pressurePlate(BASALT_PRESSURE_PLATE.get())
		.slab(BASALT_SMOOTH_SLAB.get())
		.stairs(BASALT_SMOOTH_STAIRS.get())
		.trapdoor(BASALT_TRAPDOOR.get())
		.wall(BASALT_SMOOTH_WALL.get())
		.getFamily();

	// dacite
	public final static BlockFamily ROUGH_DACITE = new BlockFamily.Builder(DFBlocks.DACITE_ROUGH.get())
		.slab(DFBlocks.DACITE_ROUGH_SLAB.get())
		.stairs(DACITE_ROUGH_STAIRS.get())
		.wall(DACITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_DACITE = new BlockFamily.Builder(DACITE_SMOOTH.get())
		.button(DACITE_BUTTON.get())
		.chiseled(DACITE_ENGRAVED.get())
		.door(DACITE_DOOR.get())
		.pressurePlate(DACITE_PRESSURE_PLATE.get())
		.slab(DACITE_SMOOTH_SLAB.get())
		.stairs(DACITE_SMOOTH_STAIRS.get())
		.trapdoor(DACITE_TRAPDOOR.get())
		.wall(DACITE_SMOOTH_WALL.get())
		.getFamily();

	// obsidian
	public final static BlockFamily ROUGH_OBSIDIAN = new BlockFamily.Builder(DFBlocks.OBSIDIAN_ROUGH.get())
		.slab(DFBlocks.OBSIDIAN_ROUGH_SLAB.get())
		.stairs(OBSIDIAN_ROUGH_STAIRS.get())
		.wall(OBSIDIAN_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_OBSIDIAN = new BlockFamily.Builder(OBSIDIAN_SMOOTH.get())
		.button(OBSIDIAN_BUTTON.get())
		.chiseled(OBSIDIAN_ENGRAVED.get())
		.door(OBSIDIAN_DOOR.get())
		.pressurePlate(OBSIDIAN_PRESSURE_PLATE.get())
		.slab(OBSIDIAN_SMOOTH_SLAB.get())
		.stairs(OBSIDIAN_SMOOTH_STAIRS.get())
		.trapdoor(OBSIDIAN_TRAPDOOR.get())
		.wall(OBSIDIAN_SMOOTH_WALL.get())
		.getFamily();

	// rhyolite
	public final static BlockFamily ROUGH_RHYOLITE = new BlockFamily.Builder(DFBlocks.RHYOLITE_ROUGH.get())
		.slab(DFBlocks.RHYOLITE_ROUGH_SLAB.get())
		.stairs(RHYOLITE_ROUGH_STAIRS.get())
		.wall(RHYOLITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_RHYOLITE = new BlockFamily.Builder(RHYOLITE_SMOOTH.get())
		.button(RHYOLITE_BUTTON.get())
		.chiseled(RHYOLITE_ENGRAVED.get())
		.door(RHYOLITE_DOOR.get())
		.pressurePlate(RHYOLITE_PRESSURE_PLATE.get())
		.slab(RHYOLITE_SMOOTH_SLAB.get())
		.stairs(RHYOLITE_SMOOTH_STAIRS.get())
		.trapdoor(RHYOLITE_TRAPDOOR.get())
		.wall(RHYOLITE_SMOOTH_WALL.get())
		.getFamily();

	// gneiss
	public final static BlockFamily ROUGH_GNEISS = new BlockFamily.Builder(DFBlocks.GNEISS_ROUGH.get())
		.slab(DFBlocks.GNEISS_ROUGH_SLAB.get())
		.stairs(GNEISS_ROUGH_STAIRS.get())
		.wall(GNEISS_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_GNEISS = new BlockFamily.Builder(GNEISS_SMOOTH.get())
		.button(GNEISS_BUTTON.get())
		.chiseled(GNEISS_ENGRAVED.get())
		.door(GNEISS_DOOR.get())
		.pressurePlate(GNEISS_PRESSURE_PLATE.get())
		.slab(GNEISS_SMOOTH_SLAB.get())
		.stairs(GNEISS_SMOOTH_STAIRS.get())
		.trapdoor(GNEISS_TRAPDOOR.get())
		.wall(GNEISS_SMOOTH_WALL.get())
		.getFamily();

	// marble
	public final static BlockFamily ROUGH_MARBLE = new BlockFamily.Builder(DFBlocks.MARBLE_ROUGH.get())
		.slab(DFBlocks.MARBLE_ROUGH_SLAB.get())
		.stairs(MARBLE_ROUGH_STAIRS.get())
		.wall(MARBLE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_MARBLE = new BlockFamily.Builder(MARBLE_SMOOTH.get())
		.button(MARBLE_BUTTON.get())
		.chiseled(MARBLE_ENGRAVED.get())
		.door(MARBLE_DOOR.get())
		.pressurePlate(MARBLE_PRESSURE_PLATE.get())
		.slab(MARBLE_SMOOTH_SLAB.get())
		.stairs(MARBLE_SMOOTH_STAIRS.get())
		.trapdoor(MARBLE_TRAPDOOR.get())
		.wall(MARBLE_SMOOTH_WALL.get())
		.getFamily();

	// phyllite
	public final static BlockFamily ROUGH_PHYLLITE = new BlockFamily.Builder(DFBlocks.PHYLLITE_ROUGH.get())
		.slab(DFBlocks.PHYLLITE_ROUGH_SLAB.get())
		.stairs(PHYLLITE_ROUGH_STAIRS.get())
		.wall(PHYLLITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_PHYLLITE = new BlockFamily.Builder(PHYLLITE_SMOOTH.get())
		.button(PHYLLITE_BUTTON.get())
		.chiseled(PHYLLITE_ENGRAVED.get())
		.door(PHYLLITE_DOOR.get())
		.pressurePlate(PHYLLITE_PRESSURE_PLATE.get())
		.slab(PHYLLITE_SMOOTH_SLAB.get())
		.stairs(PHYLLITE_SMOOTH_STAIRS.get())
		.trapdoor(PHYLLITE_TRAPDOOR.get())
		.wall(PHYLLITE_SMOOTH_WALL.get())
		.getFamily();

	// quartzite
	public final static BlockFamily ROUGH_QUARTZITE = new BlockFamily.Builder(DFBlocks.QUARTZITE_ROUGH.get())
		.slab(DFBlocks.QUARTZITE_ROUGH_SLAB.get())
		.stairs(QUARTZITE_ROUGH_STAIRS.get())
		.wall(QUARTZITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_QUARTZITE = new BlockFamily.Builder(QUARTZITE_SMOOTH.get())
		.button(QUARTZITE_BUTTON.get())
		.chiseled(QUARTZITE_ENGRAVED.get())
		.door(QUARTZITE_DOOR.get())
		.pressurePlate(QUARTZITE_PRESSURE_PLATE.get())
		.slab(QUARTZITE_SMOOTH_SLAB.get())
		.stairs(QUARTZITE_SMOOTH_STAIRS.get())
		.trapdoor(QUARTZITE_TRAPDOOR.get())
		.wall(QUARTZITE_SMOOTH_WALL.get())
		.getFamily();

	// schist
	public final static BlockFamily ROUGH_SCHIST = new BlockFamily.Builder(DFBlocks.SCHIST_ROUGH.get())
		.slab(DFBlocks.SCHIST_ROUGH_SLAB.get())
		.stairs(SCHIST_ROUGH_STAIRS.get())
		.wall(SCHIST_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SCHIST = new BlockFamily.Builder(SCHIST_SMOOTH.get())
		.button(SCHIST_BUTTON.get())
		.chiseled(SCHIST_ENGRAVED.get())
		.door(SCHIST_DOOR.get())
		.pressurePlate(SCHIST_PRESSURE_PLATE.get())
		.slab(SCHIST_SMOOTH_SLAB.get())
		.stairs(SCHIST_SMOOTH_STAIRS.get())
		.trapdoor(SCHIST_TRAPDOOR.get())
		.wall(SCHIST_SMOOTH_WALL.get())
		.getFamily();

	// slate
	public final static BlockFamily ROUGH_SLATE = new BlockFamily.Builder(DFBlocks.SLATE_ROUGH.get())
		.slab(DFBlocks.SLATE_ROUGH_SLAB.get())
		.stairs(SLATE_ROUGH_STAIRS.get())
		.wall(SLATE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SLATE = new BlockFamily.Builder(SLATE_SMOOTH.get())
		.button(SLATE_BUTTON.get())
		.chiseled(SLATE_ENGRAVED.get())
		.door(SLATE_DOOR.get())
		.pressurePlate(SLATE_PRESSURE_PLATE.get())
		.slab(SLATE_SMOOTH_SLAB.get())
		.stairs(SLATE_SMOOTH_STAIRS.get())
		.trapdoor(SLATE_TRAPDOOR.get())
		.wall(SLATE_SMOOTH_WALL.get())
		.getFamily();

	// alabaster
	public final static BlockFamily ROUGH_ALABASTER = new BlockFamily.Builder(DFBlocks.ALABASTER_ROUGH.get())
		.slab(DFBlocks.ALABASTER_ROUGH_SLAB.get())
		.stairs(ALABASTER_ROUGH_STAIRS.get())
		.wall(ALABASTER_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ALABASTER = new BlockFamily.Builder(ALABASTER_SMOOTH.get())
		.button(ALABASTER_BUTTON.get())
		.chiseled(ALABASTER_ENGRAVED.get())
		.door(ALABASTER_DOOR.get())
		.pressurePlate(ALABASTER_PRESSURE_PLATE.get())
		.slab(ALABASTER_SMOOTH_SLAB.get())
		.stairs(ALABASTER_SMOOTH_STAIRS.get())
		.trapdoor(ALABASTER_TRAPDOOR.get())
		.wall(ALABASTER_SMOOTH_WALL.get())
		.getFamily();

	// alunite
	public final static BlockFamily ROUGH_ALUNITE = new BlockFamily.Builder(DFBlocks.ALUNITE_ROUGH.get())
		.slab(DFBlocks.ALUNITE_ROUGH_SLAB.get())
		.stairs(ALUNITE_ROUGH_STAIRS.get())
		.wall(ALUNITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ALUNITE = new BlockFamily.Builder(ALUNITE_SMOOTH.get())
		.button(ALUNITE_BUTTON.get())
		.chiseled(ALUNITE_ENGRAVED.get())
		.door(ALUNITE_DOOR.get())
		.pressurePlate(ALUNITE_PRESSURE_PLATE.get())
		.slab(ALUNITE_SMOOTH_SLAB.get())
		.stairs(ALUNITE_SMOOTH_STAIRS.get())
		.trapdoor(ALUNITE_TRAPDOOR.get())
		.wall(ALUNITE_SMOOTH_WALL.get())
		.getFamily();

	// anhydrite
	public final static BlockFamily ROUGH_ANHYDRITE = new BlockFamily.Builder(DFBlocks.ANHYDRITE_ROUGH.get())
		.slab(DFBlocks.ANHYDRITE_ROUGH_SLAB.get())
		.stairs(ANHYDRITE_ROUGH_STAIRS.get())
		.wall(ANHYDRITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ANHYDRITE = new BlockFamily.Builder(ANHYDRITE_SMOOTH.get())
		.button(ANHYDRITE_BUTTON.get())
		.chiseled(ANHYDRITE_ENGRAVED.get())
		.door(ANHYDRITE_DOOR.get())
		.pressurePlate(ANHYDRITE_PRESSURE_PLATE.get())
		.slab(ANHYDRITE_SMOOTH_SLAB.get())
		.stairs(ANHYDRITE_SMOOTH_STAIRS.get())
		.trapdoor(ANHYDRITE_TRAPDOOR.get())
		.wall(ANHYDRITE_SMOOTH_WALL.get())
		.getFamily();

	// bauxite
	public final static BlockFamily ROUGH_BAUXITE = new BlockFamily.Builder(DFBlocks.BAUXITE_ROUGH.get())
		.slab(DFBlocks.BAUXITE_ROUGH_SLAB.get())
		.stairs(BAUXITE_ROUGH_STAIRS.get())
		.wall(BAUXITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_BAUXITE = new BlockFamily.Builder(BAUXITE_SMOOTH.get())
		.button(BAUXITE_BUTTON.get())
		.chiseled(BAUXITE_ENGRAVED.get())
		.door(BAUXITE_DOOR.get())
		.pressurePlate(BAUXITE_PRESSURE_PLATE.get())
		.slab(BAUXITE_SMOOTH_SLAB.get())
		.stairs(BAUXITE_SMOOTH_STAIRS.get())
		.trapdoor(BAUXITE_TRAPDOOR.get())
		.wall(BAUXITE_SMOOTH_WALL.get())
		.getFamily();

	// bituminous_coal
	public final static BlockFamily ROUGH_BITUMINOUS_COAL = new BlockFamily.Builder(DFBlocks.BITUMINOUS_COAL_ROUGH.get())
		.slab(DFBlocks.BITUMINOUS_COAL_ROUGH_SLAB.get())
		.stairs(BITUMINOUS_COAL_ROUGH_STAIRS.get())
		.wall(BITUMINOUS_COAL_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_BITUMINOUS_COAL = new BlockFamily.Builder(
		BITUMINOUS_COAL_SMOOTH.get())
		.button(BITUMINOUS_COAL_BUTTON.get())
		.chiseled(BITUMINOUS_COAL_ENGRAVED.get())
		.door(BITUMINOUS_COAL_DOOR.get())
		.pressurePlate(BITUMINOUS_COAL_PRESSURE_PLATE.get())
		.slab(BITUMINOUS_COAL_SMOOTH_SLAB.get())
		.stairs(BITUMINOUS_COAL_SMOOTH_STAIRS.get())
		.trapdoor(BITUMINOUS_COAL_TRAPDOOR.get())
		.wall(BITUMINOUS_COAL_SMOOTH_WALL.get())
		.getFamily();

	// borax
	public final static BlockFamily ROUGH_BORAX = new BlockFamily.Builder(DFBlocks.BORAX_ROUGH.get())
		.slab(DFBlocks.BORAX_ROUGH_SLAB.get())
		.stairs(BORAX_ROUGH_STAIRS.get())
		.wall(BORAX_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_BORAX = new BlockFamily.Builder(BORAX_SMOOTH.get())
		.button(BORAX_BUTTON.get())
		.chiseled(BORAX_ENGRAVED.get())
		.door(BORAX_DOOR.get())
		.pressurePlate(BORAX_PRESSURE_PLATE.get())
		.slab(BORAX_SMOOTH_SLAB.get())
		.stairs(BORAX_SMOOTH_STAIRS.get())
		.trapdoor(BORAX_TRAPDOOR.get())
		.wall(BORAX_SMOOTH_WALL.get())
		.getFamily();

	// brimstone
	public final static BlockFamily ROUGH_BRIMSTONE = new BlockFamily.Builder(DFBlocks.BRIMSTONE_ROUGH.get())
		.slab(DFBlocks.BRIMSTONE_ROUGH_SLAB.get())
		.stairs(BRIMSTONE_ROUGH_STAIRS.get())
		.wall(BRIMSTONE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_BRIMSTONE = new BlockFamily.Builder(BRIMSTONE_SMOOTH.get())
		.button(BRIMSTONE_BUTTON.get())
		.chiseled(BRIMSTONE_ENGRAVED.get())
		.door(BRIMSTONE_DOOR.get())
		.pressurePlate(BRIMSTONE_PRESSURE_PLATE.get())
		.slab(BRIMSTONE_SMOOTH_SLAB.get())
		.stairs(BRIMSTONE_SMOOTH_STAIRS.get())
		.trapdoor(BRIMSTONE_TRAPDOOR.get())
		.wall(BRIMSTONE_SMOOTH_WALL.get())
		.getFamily();

	// calcite
	public final static BlockFamily ROUGH_CALCITE = new BlockFamily.Builder(DFBlocks.CALCITE_ROUGH.get())
		.slab(DFBlocks.CALCITE_ROUGH_SLAB.get())
		.stairs(CALCITE_ROUGH_STAIRS.get())
		.wall(CALCITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CALCITE = new BlockFamily.Builder(CALCITE_SMOOTH.get())
		.button(CALCITE_BUTTON.get())
		.chiseled(CALCITE_ENGRAVED.get())
		.door(CALCITE_DOOR.get())
		.pressurePlate(CALCITE_PRESSURE_PLATE.get())
		.slab(CALCITE_SMOOTH_SLAB.get())
		.stairs(CALCITE_SMOOTH_STAIRS.get())
		.trapdoor(CALCITE_TRAPDOOR.get())
		.wall(CALCITE_SMOOTH_WALL.get())
		.getFamily();

	// chromite
	public final static BlockFamily ROUGH_CHROMITE = new BlockFamily.Builder(DFBlocks.CHROMITE_ROUGH.get())
		.slab(DFBlocks.CHROMITE_ROUGH_SLAB.get())
		.stairs(CHROMITE_ROUGH_STAIRS.get())
		.wall(CHROMITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CHROMITE = new BlockFamily.Builder(CHROMITE_SMOOTH.get())
		.button(CHROMITE_BUTTON.get())
		.chiseled(CHROMITE_ENGRAVED.get())
		.door(CHROMITE_DOOR.get())
		.pressurePlate(CHROMITE_PRESSURE_PLATE.get())
		.slab(CHROMITE_SMOOTH_SLAB.get())
		.stairs(CHROMITE_SMOOTH_STAIRS.get())
		.trapdoor(CHROMITE_TRAPDOOR.get())
		.wall(CHROMITE_SMOOTH_WALL.get())
		.getFamily();

	// cinnabar
	public final static BlockFamily ROUGH_CINNABAR = new BlockFamily.Builder(DFBlocks.CINNABAR_ROUGH.get())
		.slab(DFBlocks.CINNABAR_ROUGH_SLAB.get())
		.stairs(CINNABAR_ROUGH_STAIRS.get())
		.wall(CINNABAR_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CINNABAR = new BlockFamily.Builder(CINNABAR_SMOOTH.get())
		.button(CINNABAR_BUTTON.get())
		.chiseled(CINNABAR_ENGRAVED.get())
		.door(CINNABAR_DOOR.get())
		.pressurePlate(CINNABAR_PRESSURE_PLATE.get())
		.slab(CINNABAR_SMOOTH_SLAB.get())
		.stairs(CINNABAR_SMOOTH_STAIRS.get())
		.trapdoor(CINNABAR_TRAPDOOR.get())
		.wall(CINNABAR_SMOOTH_WALL.get())
		.getFamily();

	// cobaltite
	public final static BlockFamily ROUGH_COBALTITE = new BlockFamily.Builder(DFBlocks.COBALTITE_ROUGH.get())
		.slab(DFBlocks.COBALTITE_ROUGH_SLAB.get())
		.stairs(COBALTITE_ROUGH_STAIRS.get())
		.wall(COBALTITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_COBALTITE = new BlockFamily.Builder(COBALTITE_SMOOTH.get())
		.button(COBALTITE_BUTTON.get())
		.chiseled(COBALTITE_ENGRAVED.get())
		.door(COBALTITE_DOOR.get())
		.pressurePlate(COBALTITE_PRESSURE_PLATE.get())
		.slab(COBALTITE_SMOOTH_SLAB.get())
		.stairs(COBALTITE_SMOOTH_STAIRS.get())
		.trapdoor(COBALTITE_TRAPDOOR.get())
		.wall(COBALTITE_SMOOTH_WALL.get())
		.getFamily();

	// cryolite
	public final static BlockFamily ROUGH_CRYOLITE = new BlockFamily.Builder(DFBlocks.CRYOLITE_ROUGH.get())
		.slab(DFBlocks.CRYOLITE_ROUGH_SLAB.get())
		.stairs(CRYOLITE_ROUGH_STAIRS.get())
		.wall(CRYOLITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CRYOLITE = new BlockFamily.Builder(CRYOLITE_SMOOTH.get())
		.button(CRYOLITE_BUTTON.get())
		.chiseled(CRYOLITE_ENGRAVED.get())
		.door(CRYOLITE_DOOR.get())
		.pressurePlate(CRYOLITE_PRESSURE_PLATE.get())
		.slab(CRYOLITE_SMOOTH_SLAB.get())
		.stairs(CRYOLITE_SMOOTH_STAIRS.get())
		.trapdoor(CRYOLITE_TRAPDOOR.get())
		.wall(CRYOLITE_SMOOTH_WALL.get())
		.getFamily();

	// graphite
	public final static BlockFamily ROUGH_GRAPHITE = new BlockFamily.Builder(DFBlocks.GRAPHITE_ROUGH.get())
		.slab(DFBlocks.GRAPHITE_ROUGH_SLAB.get())
		.stairs(GRAPHITE_ROUGH_STAIRS.get())
		.wall(GRAPHITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_GRAPHITE = new BlockFamily.Builder(GRAPHITE_SMOOTH.get())
		.button(GRAPHITE_BUTTON.get())
		.chiseled(GRAPHITE_ENGRAVED.get())
		.door(GRAPHITE_DOOR.get())
		.pressurePlate(GRAPHITE_PRESSURE_PLATE.get())
		.slab(GRAPHITE_SMOOTH_SLAB.get())
		.stairs(GRAPHITE_SMOOTH_STAIRS.get())
		.trapdoor(GRAPHITE_TRAPDOOR.get())
		.wall(GRAPHITE_SMOOTH_WALL.get())
		.getFamily();

	// gypsum
	public final static BlockFamily ROUGH_GYPSUM = new BlockFamily.Builder(DFBlocks.GYPSUM_ROUGH.get())
		.slab(DFBlocks.GYPSUM_ROUGH_SLAB.get())
		.stairs(GYPSUM_ROUGH_STAIRS.get())
		.wall(GYPSUM_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_GYPSUM = new BlockFamily.Builder(GYPSUM_SMOOTH.get())
		.button(GYPSUM_BUTTON.get())
		.chiseled(GYPSUM_ENGRAVED.get())
		.door(GYPSUM_DOOR.get())
		.pressurePlate(GYPSUM_PRESSURE_PLATE.get())
		.slab(GYPSUM_SMOOTH_SLAB.get())
		.stairs(GYPSUM_SMOOTH_STAIRS.get())
		.trapdoor(GYPSUM_TRAPDOOR.get())
		.wall(GYPSUM_SMOOTH_WALL.get())
		.getFamily();

	// hornblende
	public final static BlockFamily ROUGH_HORNBLENDE = new BlockFamily.Builder(DFBlocks.HORNBLENDE_ROUGH.get())
		.slab(DFBlocks.HORNBLENDE_ROUGH_SLAB.get())
		.stairs(HORNBLENDE_ROUGH_STAIRS.get())
		.wall(HORNBLENDE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_HORNBLENDE = new BlockFamily.Builder(HORNBLENDE_SMOOTH.get())
		.button(HORNBLENDE_BUTTON.get())
		.chiseled(HORNBLENDE_ENGRAVED.get())
		.door(HORNBLENDE_DOOR.get())
		.pressurePlate(HORNBLENDE_PRESSURE_PLATE.get())
		.slab(HORNBLENDE_SMOOTH_SLAB.get())
		.stairs(HORNBLENDE_SMOOTH_STAIRS.get())
		.trapdoor(HORNBLENDE_TRAPDOOR.get())
		.wall(HORNBLENDE_SMOOTH_WALL.get())
		.getFamily();

	// ilmenite
	public final static BlockFamily ROUGH_ILMENITE = new BlockFamily.Builder(DFBlocks.ILMENITE_ROUGH.get())
		.slab(DFBlocks.ILMENITE_ROUGH_SLAB.get())
		.stairs(ILMENITE_ROUGH_STAIRS.get())
		.wall(ILMENITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ILMENITE = new BlockFamily.Builder(ILMENITE_SMOOTH.get())
		.button(ILMENITE_BUTTON.get())
		.chiseled(ILMENITE_ENGRAVED.get())
		.door(ILMENITE_DOOR.get())
		.pressurePlate(ILMENITE_PRESSURE_PLATE.get())
		.slab(ILMENITE_SMOOTH_SLAB.get())
		.stairs(ILMENITE_SMOOTH_STAIRS.get())
		.trapdoor(ILMENITE_TRAPDOOR.get())
		.wall(ILMENITE_SMOOTH_WALL.get())
		.getFamily();

	// jet
	public final static BlockFamily ROUGH_JET = new BlockFamily.Builder(DFBlocks.JET_ROUGH.get())
		.slab(DFBlocks.JET_ROUGH_SLAB.get())
		.stairs(JET_ROUGH_STAIRS.get())
		.wall(JET_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_JET = new BlockFamily.Builder(JET_SMOOTH.get())
		.button(JET_BUTTON.get())
		.chiseled(JET_ENGRAVED.get())
		.door(JET_DOOR.get())
		.pressurePlate(JET_PRESSURE_PLATE.get())
		.slab(JET_SMOOTH_SLAB.get())
		.stairs(JET_SMOOTH_STAIRS.get())
		.trapdoor(JET_TRAPDOOR.get())
		.wall(JET_SMOOTH_WALL.get())
		.getFamily();

	// kaolinite
	public final static BlockFamily ROUGH_KAOLINITE = new BlockFamily.Builder(DFBlocks.KAOLINITE_ROUGH.get())
		.slab(DFBlocks.KAOLINITE_ROUGH_SLAB.get())
		.stairs(KAOLINITE_ROUGH_STAIRS.get())
		.wall(KAOLINITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_KAOLINITE = new BlockFamily.Builder(KAOLINITE_SMOOTH.get())
		.button(KAOLINITE_BUTTON.get())
		.chiseled(KAOLINITE_ENGRAVED.get())
		.door(KAOLINITE_DOOR.get())
		.pressurePlate(KAOLINITE_PRESSURE_PLATE.get())
		.slab(KAOLINITE_SMOOTH_SLAB.get())
		.stairs(KAOLINITE_SMOOTH_STAIRS.get())
		.trapdoor(KAOLINITE_TRAPDOOR.get())
		.wall(KAOLINITE_SMOOTH_WALL.get())
		.getFamily();

	// kimberlite
	public final static BlockFamily ROUGH_CERULEAN = new BlockFamily.Builder(DFBlocks.CERULEAN_ROUGH.get())
		.slab(DFBlocks.CERULEAN_ROUGH_SLAB.get())
		.stairs(CERULEAN_ROUGH_STAIRS.get())
		.wall(CERULEAN_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_CERULEAN = new BlockFamily.Builder(CERULEAN_SMOOTH.get())
		.button(CERULEAN_BUTTON.get())
		.chiseled(CERULEAN_ENGRAVED.get())
		.door(CERULEAN_DOOR.get())
		.pressurePlate(CERULEAN_PRESSURE_PLATE.get())
		.slab(CERULEAN_SMOOTH_SLAB.get())
		.stairs(CERULEAN_SMOOTH_STAIRS.get())
		.trapdoor(CERULEAN_TRAPDOOR.get())
		.wall(CERULEAN_SMOOTH_WALL.get())
		.getFamily();

	// lignite
	public final static BlockFamily ROUGH_LIGNITE = new BlockFamily.Builder(DFBlocks.LIGNITE_ROUGH.get())
		.slab(DFBlocks.LIGNITE_ROUGH_SLAB.get())
		.stairs(LIGNITE_ROUGH_STAIRS.get())
		.wall(LIGNITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_LIGNITE = new BlockFamily.Builder(LIGNITE_SMOOTH.get())
		.button(LIGNITE_BUTTON.get())
		.chiseled(LIGNITE_ENGRAVED.get())
		.door(LIGNITE_DOOR.get())
		.pressurePlate(LIGNITE_PRESSURE_PLATE.get())
		.slab(LIGNITE_SMOOTH_SLAB.get())
		.stairs(LIGNITE_SMOOTH_STAIRS.get())
		.trapdoor(LIGNITE_TRAPDOOR.get())
		.wall(LIGNITE_SMOOTH_WALL.get())
		.getFamily();

	// marcasite
	public final static BlockFamily ROUGH_MARCASITE = new BlockFamily.Builder(DFBlocks.MARCASITE_ROUGH.get())
		.slab(DFBlocks.MARCASITE_ROUGH_SLAB.get())
		.stairs(MARCASITE_ROUGH_STAIRS.get())
		.wall(MARCASITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_MARCASITE = new BlockFamily.Builder(MARCASITE_SMOOTH.get())
		.button(MARCASITE_BUTTON.get())
		.chiseled(MARCASITE_ENGRAVED.get())
		.door(MARCASITE_DOOR.get())
		.pressurePlate(MARCASITE_PRESSURE_PLATE.get())
		.slab(MARCASITE_SMOOTH_SLAB.get())
		.stairs(MARCASITE_SMOOTH_STAIRS.get())
		.trapdoor(MARCASITE_TRAPDOOR.get())
		.wall(MARCASITE_SMOOTH_WALL.get())
		.getFamily();

	// mica
	public final static BlockFamily ROUGH_MICA = new BlockFamily.Builder(DFBlocks.MICA_ROUGH.get())
		.slab(DFBlocks.MICA_ROUGH_SLAB.get())
		.stairs(MICA_ROUGH_STAIRS.get())
		.wall(MICA_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_MICA = new BlockFamily.Builder(MICA_SMOOTH.get())
		.button(MICA_BUTTON.get())
		.chiseled(MICA_ENGRAVED.get())
		.door(MICA_DOOR.get())
		.pressurePlate(MICA_PRESSURE_PLATE.get())
		.slab(MICA_SMOOTH_SLAB.get())
		.stairs(MICA_SMOOTH_STAIRS.get())
		.trapdoor(MICA_TRAPDOOR.get())
		.wall(MICA_SMOOTH_WALL.get())
		.getFamily();

	// microcline
	public final static BlockFamily ROUGH_MICROCLINE = new BlockFamily.Builder(DFBlocks.MICROCLINE_ROUGH.get())
		.slab(DFBlocks.MICROCLINE_ROUGH_SLAB.get())
		.stairs(MICROCLINE_ROUGH_STAIRS.get())
		.wall(MICROCLINE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_MICROCLINE = new BlockFamily.Builder(MICROCLINE_SMOOTH.get())
		.button(MICROCLINE_BUTTON.get())
		.chiseled(MICROCLINE_ENGRAVED.get())
		.door(MICROCLINE_DOOR.get())
		.pressurePlate(MICROCLINE_PRESSURE_PLATE.get())
		.slab(MICROCLINE_SMOOTH_SLAB.get())
		.stairs(MICROCLINE_SMOOTH_STAIRS.get())
		.trapdoor(MICROCLINE_TRAPDOOR.get())
		.wall(MICROCLINE_SMOOTH_WALL.get())
		.getFamily();

	// olivine
	public final static BlockFamily ROUGH_OLIVINE = new BlockFamily.Builder(DFBlocks.OLIVINE_ROUGH.get())
		.slab(DFBlocks.OLIVINE_ROUGH_SLAB.get())
		.stairs(OLIVINE_ROUGH_STAIRS.get())
		.wall(OLIVINE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_OLIVINE = new BlockFamily.Builder(OLIVINE_SMOOTH.get())
		.button(OLIVINE_BUTTON.get())
		.chiseled(OLIVINE_ENGRAVED.get())
		.door(OLIVINE_DOOR.get())
		.pressurePlate(OLIVINE_PRESSURE_PLATE.get())
		.slab(OLIVINE_SMOOTH_SLAB.get())
		.stairs(OLIVINE_SMOOTH_STAIRS.get())
		.trapdoor(OLIVINE_TRAPDOOR.get())
		.wall(OLIVINE_SMOOTH_WALL.get())
		.getFamily();

	// orpiment
	public final static BlockFamily ROUGH_ORPIMENT = new BlockFamily.Builder(DFBlocks.ORPIMENT_ROUGH.get())
		.slab(DFBlocks.ORPIMENT_ROUGH_SLAB.get())
		.stairs(ORPIMENT_ROUGH_STAIRS.get())
		.wall(ORPIMENT_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ORPIMENT = new BlockFamily.Builder(ORPIMENT_SMOOTH.get())
		.button(ORPIMENT_BUTTON.get())
		.chiseled(ORPIMENT_ENGRAVED.get())
		.door(ORPIMENT_DOOR.get())
		.pressurePlate(ORPIMENT_PRESSURE_PLATE.get())
		.slab(ORPIMENT_SMOOTH_SLAB.get())
		.stairs(ORPIMENT_SMOOTH_STAIRS.get())
		.trapdoor(ORPIMENT_TRAPDOOR.get())
		.wall(ORPIMENT_SMOOTH_WALL.get())
		.getFamily();

	// orthoclase
	public final static BlockFamily ROUGH_ORTHOCLASE = new BlockFamily.Builder(DFBlocks.ORTHOCLASE_ROUGH.get())
		.slab(DFBlocks.ORTHOCLASE_ROUGH_SLAB.get())
		.stairs(ORTHOCLASE_ROUGH_STAIRS.get())
		.wall(ORTHOCLASE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_ORTHOCLASE = new BlockFamily.Builder(ORTHOCLASE_SMOOTH.get())
		.button(ORTHOCLASE_BUTTON.get())
		.chiseled(ORTHOCLASE_ENGRAVED.get())
		.door(ORTHOCLASE_DOOR.get())
		.pressurePlate(ORTHOCLASE_PRESSURE_PLATE.get())
		.slab(ORTHOCLASE_SMOOTH_SLAB.get())
		.stairs(ORTHOCLASE_SMOOTH_STAIRS.get())
		.trapdoor(ORTHOCLASE_TRAPDOOR.get())
		.wall(ORTHOCLASE_SMOOTH_WALL.get())
		.getFamily();

	// periclase
	public final static BlockFamily ROUGH_PERICLASE = new BlockFamily.Builder(DFBlocks.PERICLASE_ROUGH.get())
		.slab(DFBlocks.PERICLASE_ROUGH_SLAB.get())
		.stairs(PERICLASE_ROUGH_STAIRS.get())
		.wall(PERICLASE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_PERICLASE = new BlockFamily.Builder(PERICLASE_SMOOTH.get())
		.button(PERICLASE_BUTTON.get())
		.chiseled(PERICLASE_ENGRAVED.get())
		.door(PERICLASE_DOOR.get())
		.pressurePlate(PERICLASE_PRESSURE_PLATE.get())
		.slab(PERICLASE_SMOOTH_SLAB.get())
		.stairs(PERICLASE_SMOOTH_STAIRS.get())
		.trapdoor(PERICLASE_TRAPDOOR.get())
		.wall(PERICLASE_SMOOTH_WALL.get())
		.getFamily();

	// pertrified_wood
	public final static BlockFamily ROUGH_PETRIFIED_WOOD = new BlockFamily.Builder(DFBlocks.PETRIFIED_WOOD_ROUGH.get())
		.slab(DFBlocks.PETRIFIED_WOOD_ROUGH_SLAB.get())
		.stairs(PETRIFIED_WOOD_ROUGH_STAIRS.get())
		.wall(PETRIFIED_WOOD_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_PETRIFIED_WOOD = new BlockFamily.Builder(
		PETRIFIED_WOOD_SMOOTH.get())
		.button(PETRIFIED_WOOD_BUTTON.get())
		.chiseled(PETRIFIED_WOOD_ENGRAVED.get())
		.door(PETRIFIED_WOOD_DOOR.get())
		.pressurePlate(PETRIFIED_WOOD_PRESSURE_PLATE.get())
		.slab(PETRIFIED_WOOD_SMOOTH_SLAB.get())
		.stairs(PETRIFIED_WOOD_SMOOTH_STAIRS.get())
		.trapdoor(PETRIFIED_WOOD_TRAPDOOR.get())
		.wall(PETRIFIED_WOOD_SMOOTH_WALL.get())
		.getFamily();

	// pitchblende
	public final static BlockFamily ROUGH_PITCHBLENDE = new BlockFamily.Builder(DFBlocks.PITCHBLENDE_ROUGH.get())
		.slab(DFBlocks.PITCHBLENDE_ROUGH_SLAB.get())
		.stairs(PITCHBLENDE_ROUGH_STAIRS.get())
		.wall(PITCHBLENDE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_PITCHBLENDE = new BlockFamily.Builder(PITCHBLENDE_SMOOTH.get())
		.button(PITCHBLENDE_BUTTON.get())
		.chiseled(PITCHBLENDE_ENGRAVED.get())
		.door(PITCHBLENDE_DOOR.get())
		.pressurePlate(PITCHBLENDE_PRESSURE_PLATE.get())
		.slab(PITCHBLENDE_SMOOTH_SLAB.get())
		.stairs(PITCHBLENDE_SMOOTH_STAIRS.get())
		.trapdoor(PITCHBLENDE_TRAPDOOR.get())
		.wall(PITCHBLENDE_SMOOTH_WALL.get())
		.getFamily();

	// puddingstone
	public final static BlockFamily ROUGH_PUDDINGSTONE = new BlockFamily.Builder(DFBlocks.PUDDINGSTONE_ROUGH.get())
		.slab(DFBlocks.PUDDINGSTONE_ROUGH_SLAB.get())
		.stairs(PUDDINGSTONE_ROUGH_STAIRS.get())
		.wall(PUDDINGSTONE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_PUDDINGSTONE = new BlockFamily.Builder(
		PUDDINGSTONE_SMOOTH.get())
		.button(PUDDINGSTONE_BUTTON.get())
		.chiseled(PUDDINGSTONE_ENGRAVED.get())
		.door(PUDDINGSTONE_DOOR.get())
		.pressurePlate(PUDDINGSTONE_PRESSURE_PLATE.get())
		.slab(PUDDINGSTONE_SMOOTH_SLAB.get())
		.stairs(PUDDINGSTONE_SMOOTH_STAIRS.get())
		.trapdoor(PUDDINGSTONE_TRAPDOOR.get())
		.wall(PUDDINGSTONE_SMOOTH_WALL.get())
		.getFamily();

	// pyrolusite
	public final static BlockFamily ROUGH_PYROLUSITE = new BlockFamily.Builder(DFBlocks.PYROLUSITE_ROUGH.get())
		.slab(DFBlocks.PYROLUSITE_ROUGH_SLAB.get())
		.stairs(PYROLUSITE_ROUGH_STAIRS.get())
		.wall(PYROLUSITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_PYROLUSITE = new BlockFamily.Builder(PYROLUSITE_SMOOTH.get())
		.button(PYROLUSITE_BUTTON.get())
		.chiseled(PYROLUSITE_ENGRAVED.get())
		.door(PYROLUSITE_DOOR.get())
		.pressurePlate(PYROLUSITE_PRESSURE_PLATE.get())
		.slab(PYROLUSITE_SMOOTH_SLAB.get())
		.stairs(PYROLUSITE_SMOOTH_STAIRS.get())
		.trapdoor(PYROLUSITE_TRAPDOOR.get())
		.wall(PYROLUSITE_SMOOTH_WALL.get())
		.getFamily();

	// realgar
	public final static BlockFamily ROUGH_REALGAR = new BlockFamily.Builder(DFBlocks.REALGAR_ROUGH.get())
		.slab(DFBlocks.REALGAR_ROUGH_SLAB.get())
		.stairs(REALGAR_ROUGH_STAIRS.get())
		.wall(REALGAR_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_REALGAR = new BlockFamily.Builder(REALGAR_SMOOTH.get())
		.button(REALGAR_BUTTON.get())
		.chiseled(REALGAR_ENGRAVED.get())
		.door(REALGAR_DOOR.get())
		.pressurePlate(REALGAR_PRESSURE_PLATE.get())
		.slab(REALGAR_SMOOTH_SLAB.get())
		.stairs(REALGAR_SMOOTH_STAIRS.get())
		.trapdoor(REALGAR_TRAPDOOR.get())
		.wall(REALGAR_SMOOTH_WALL.get())
		.getFamily();

	// rutile
	public final static BlockFamily ROUGH_RUTILE = new BlockFamily.Builder(DFBlocks.RUTILE_ROUGH.get())
		.slab(DFBlocks.RUTILE_ROUGH_SLAB.get())
		.stairs(RUTILE_ROUGH_STAIRS.get())
		.wall(RUTILE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_RUTILE = new BlockFamily.Builder(RUTILE_SMOOTH.get())
		.button(RUTILE_BUTTON.get())
		.chiseled(RUTILE_ENGRAVED.get())
		.door(RUTILE_DOOR.get())
		.pressurePlate(RUTILE_PRESSURE_PLATE.get())
		.slab(RUTILE_SMOOTH_SLAB.get())
		.stairs(RUTILE_SMOOTH_STAIRS.get())
		.trapdoor(RUTILE_TRAPDOOR.get())
		.wall(RUTILE_SMOOTH_WALL.get())
		.getFamily();

	// saltpeter
	public final static BlockFamily ROUGH_SALTPETER = new BlockFamily.Builder(DFBlocks.SALTPETER_ROUGH.get())
		.slab(DFBlocks.SALTPETER_ROUGH_SLAB.get())
		.stairs(SALTPETER_ROUGH_STAIRS.get())
		.wall(SALTPETER_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SALTPETER = new BlockFamily.Builder(SALTPETER_SMOOTH.get())
		.button(SALTPETER_BUTTON.get())
		.chiseled(SALTPETER_ENGRAVED.get())
		.door(SALTPETER_DOOR.get())
		.pressurePlate(SALTPETER_PRESSURE_PLATE.get())
		.slab(SALTPETER_SMOOTH_SLAB.get())
		.stairs(SALTPETER_SMOOTH_STAIRS.get())
		.trapdoor(SALTPETER_TRAPDOOR.get())
		.wall(SALTPETER_SMOOTH_WALL.get())
		.getFamily();

	// satinspar
	public final static BlockFamily ROUGH_SATINSPAR = new BlockFamily.Builder(DFBlocks.SATINSPAR_ROUGH.get())
		.slab(DFBlocks.SATINSPAR_ROUGH_SLAB.get())
		.stairs(SATINSPAR_ROUGH_STAIRS.get())
		.wall(SATINSPAR_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SATINSPAR = new BlockFamily.Builder(SATINSPAR_SMOOTH.get())
		.button(SATINSPAR_BUTTON.get())
		.chiseled(SATINSPAR_ENGRAVED.get())
		.door(SATINSPAR_DOOR.get())
		.pressurePlate(SATINSPAR_PRESSURE_PLATE.get())
		.slab(SATINSPAR_SMOOTH_SLAB.get())
		.stairs(SATINSPAR_SMOOTH_STAIRS.get())
		.trapdoor(SATINSPAR_TRAPDOOR.get())
		.wall(SATINSPAR_SMOOTH_WALL.get())
		.getFamily();

	// selenite
	public final static BlockFamily ROUGH_SELENITE = new BlockFamily.Builder(DFBlocks.SELENITE_ROUGH.get())
		.slab(DFBlocks.SELENITE_ROUGH_SLAB.get())
		.stairs(SELENITE_ROUGH_STAIRS.get())
		.wall(SELENITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SELENITE = new BlockFamily.Builder(SELENITE_SMOOTH.get())
		.button(SELENITE_BUTTON.get())
		.chiseled(SELENITE_ENGRAVED.get())
		.door(SELENITE_DOOR.get())
		.pressurePlate(SELENITE_PRESSURE_PLATE.get())
		.slab(SELENITE_SMOOTH_SLAB.get())
		.stairs(SELENITE_SMOOTH_STAIRS.get())
		.trapdoor(SELENITE_TRAPDOOR.get())
		.wall(SELENITE_SMOOTH_WALL.get())
		.getFamily();

	// serpentine
	public final static BlockFamily ROUGH_SERPENTINE = new BlockFamily.Builder(DFBlocks.SERPENTINE_ROUGH.get())
		.slab(DFBlocks.SERPENTINE_ROUGH_SLAB.get())
		.stairs(SERPENTINE_ROUGH_STAIRS.get())
		.wall(SERPENTINE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SERPENTINE = new BlockFamily.Builder(SERPENTINE_SMOOTH.get())
		.button(SERPENTINE_BUTTON.get())
		.chiseled(SERPENTINE_ENGRAVED.get())
		.door(SERPENTINE_DOOR.get())
		.pressurePlate(SERPENTINE_PRESSURE_PLATE.get())
		.slab(SERPENTINE_SMOOTH_SLAB.get())
		.stairs(SERPENTINE_SMOOTH_STAIRS.get())
		.trapdoor(SERPENTINE_TRAPDOOR.get())
		.wall(SERPENTINE_SMOOTH_WALL.get())
		.getFamily();

	// stibnite
	public final static BlockFamily ROUGH_STIBNITE = new BlockFamily.Builder(DFBlocks.STIBNITE_ROUGH.get())
		.slab(DFBlocks.STIBNITE_ROUGH_SLAB.get())
		.stairs(STIBNITE_ROUGH_STAIRS.get())
		.wall(STIBNITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_STIBNITE = new BlockFamily.Builder(STIBNITE_SMOOTH.get())
		.button(STIBNITE_BUTTON.get())
		.chiseled(STIBNITE_ENGRAVED.get())
		.door(STIBNITE_DOOR.get())
		.pressurePlate(STIBNITE_PRESSURE_PLATE.get())
		.slab(STIBNITE_SMOOTH_SLAB.get())
		.stairs(STIBNITE_SMOOTH_STAIRS.get())
		.trapdoor(STIBNITE_TRAPDOOR.get())
		.wall(STIBNITE_SMOOTH_WALL.get())
		.getFamily();

	// sylvite
	public final static BlockFamily ROUGH_SYLVITE = new BlockFamily.Builder(DFBlocks.SYLVITE_ROUGH.get())
		.slab(DFBlocks.SYLVITE_ROUGH_SLAB.get())
		.stairs(SYLVITE_ROUGH_STAIRS.get())
		.wall(SYLVITE_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_SYLVITE = new BlockFamily.Builder(SYLVITE_SMOOTH.get())
		.button(SYLVITE_BUTTON.get())
		.chiseled(SYLVITE_ENGRAVED.get())
		.door(SYLVITE_DOOR.get())
		.pressurePlate(SYLVITE_PRESSURE_PLATE.get())
		.slab(SYLVITE_SMOOTH_SLAB.get())
		.stairs(SYLVITE_SMOOTH_STAIRS.get())
		.trapdoor(SYLVITE_TRAPDOOR.get())
		.wall(SYLVITE_SMOOTH_WALL.get())
		.getFamily();

	// talc
	public final static BlockFamily ROUGH_TALC = new BlockFamily.Builder(DFBlocks.TALC_ROUGH.get())
		.slab(DFBlocks.TALC_ROUGH_SLAB.get())
		.stairs(TALC_ROUGH_STAIRS.get())
		.wall(TALC_ROUGH_WALL.get())
		.getFamily();
	public final static BlockFamily SMOOTH_TALC = new BlockFamily.Builder(TALC_SMOOTH.get())
		.button(TALC_BUTTON.get())
		.chiseled(TALC_ENGRAVED.get())
		.door(TALC_DOOR.get())
		.pressurePlate(TALC_PRESSURE_PLATE.get())
		.slab(TALC_SMOOTH_SLAB.get())
		.stairs(TALC_SMOOTH_STAIRS.get())
		.trapdoor(TALC_TRAPDOOR.get())
		.wall(TALC_SMOOTH_WALL.get())
		.getFamily();

}
