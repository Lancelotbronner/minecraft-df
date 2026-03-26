package com.lancelotbronner.df.components;

import com.lancelotbronner.df.data.Color;
import com.lancelotbronner.df.data.GemCut;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;

public record PaletteComponent(Identifier color) {
	public static final Codec<PaletteComponent> CODEC = RecordCodecBuilder.create(instance -> instance
		.group(Identifier.CODEC.fieldOf("color").forGetter(PaletteComponent::color))
		.apply(instance, PaletteComponent::new));
	public static final StreamCodec<ByteBuf, PaletteComponent> STREAM_CODEC = StreamCodec.composite(Identifier.STREAM_CODEC,
		PaletteComponent::color,
		PaletteComponent::new);
}
