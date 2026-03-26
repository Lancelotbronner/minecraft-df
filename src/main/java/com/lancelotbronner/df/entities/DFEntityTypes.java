package com.lancelotbronner.df.entities;

import com.lancelotbronner.df.data.Vermin;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public class DFEntityTypes {
	public static final Supplier<EntityType<VerminEntity>> LIZARD = VerminEntity.of(
		Vermin.LIZARD,
		builder -> builder);

	public static void register() {}
}
