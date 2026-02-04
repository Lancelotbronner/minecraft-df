package com.lancelotbronner.df.blocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DFBlockSetType {
	public final static BlockSetType WOOD = new BlockSetType(
		"df:wood",
		true,
		true,
		true,
		BlockSetType.PressurePlateSensitivity.EVERYTHING,
		SoundType.WOOD,
		SoundEvents.WOODEN_DOOR_CLOSE,
		SoundEvents.WOODEN_DOOR_OPEN,
		SoundEvents.WOODEN_TRAPDOOR_CLOSE,
		SoundEvents.WOODEN_TRAPDOOR_OPEN,
		SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF,
		SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON,
		SoundEvents.WOODEN_BUTTON_CLICK_OFF,
		SoundEvents.WOODEN_BUTTON_CLICK_ON);
	//TODO: Stone door sounds
	public final static BlockSetType STONE = new BlockSetType(
		"df:stone",
		true,
		true,
		false,
		BlockSetType.PressurePlateSensitivity.MOBS,
		SoundType.STONE,
		SoundEvents.IRON_DOOR_CLOSE,
		SoundEvents.IRON_DOOR_OPEN,
		SoundEvents.IRON_TRAPDOOR_CLOSE,
		SoundEvents.IRON_TRAPDOOR_OPEN,
		SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF,
		SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
		SoundEvents.STONE_BUTTON_CLICK_OFF,
		SoundEvents.STONE_BUTTON_CLICK_ON);
}
