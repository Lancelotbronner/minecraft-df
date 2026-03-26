package com.lancelotbronner.df.components;

import com.lancelotbronner.df.DwarfFortress;
import net.minecraft.core.component.DataComponentType;

import java.util.function.Supplier;

public class DFComponents {
	public static final Supplier<DataComponentType<GemCutComponent>> GEM_CUT = DwarfFortress.COMPONENTS.registerComponentType(
		"gem_cut", builder -> builder
			.persistent(GemCutComponent.CODEC)
			.networkSynchronized(GemCutComponent.STREAM_CODEC));

	public static final Supplier<DataComponentType<PaletteComponent>> PALETTE = DwarfFortress.COMPONENTS.registerComponentType(
		"palette",
		builder -> builder
			.persistent(PaletteComponent.CODEC)
			.networkSynchronized(PaletteComponent.STREAM_CODEC));

	public static final Supplier<DataComponentType<QualityComponent>> QUALITY = DwarfFortress.COMPONENTS.registerComponentType(
		"quality",
		builder -> builder
			.persistent(QualityComponent.CODEC)
			.networkSynchronized(QualityComponent.STREAM_CODEC));

	public static final Supplier<DataComponentType<ValueComponent>> VALUE = DwarfFortress.COMPONENTS.registerComponentType(
		"value",
		builder -> builder
			.persistent(ValueComponent.CODEC)
			.networkSynchronized(ValueComponent.STREAM_CODEC));

	public static void register() {}
}
