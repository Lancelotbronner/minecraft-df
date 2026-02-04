package com.lancelotbronner.df.blocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class DFWoodType {
	public final static WoodType GENERIC = new WoodType(
		"df:wood",
		DFBlockSetType.WOOD,
		SoundType.WOOD,
		SoundType.HANGING_SIGN,
		SoundEvents.FENCE_GATE_CLOSE,
		SoundEvents.FENCE_GATE_OPEN);
}
