package com.lancelotbronner.df.components;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

/// Stores the value of an item.
public record ValueComponent(int value) {
	public static final Codec<ValueComponent> CODEC = RecordCodecBuilder.create(instance -> instance
		.group(Codec.INT.fieldOf("value").forGetter(ValueComponent::value))
		.apply(instance, ValueComponent::new));
	public static final StreamCodec<ByteBuf, ValueComponent> STREAM_CODEC = StreamCodec.composite(ByteBufCodecs.VAR_INT,
		ValueComponent::value,
		ValueComponent::new);
}
