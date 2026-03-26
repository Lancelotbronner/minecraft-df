package com.lancelotbronner.df.components;

import com.lancelotbronner.df.data.Quality;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

/// Stores the quality of an item.
public record QualityComponent(byte level) {
	public static final Codec<QualityComponent> CODEC = RecordCodecBuilder.create(instance -> instance
		.group(Codec.BYTE.fieldOf("level").forGetter(QualityComponent::level))
		.apply(instance, QualityComponent::new));
	public static final StreamCodec<ByteBuf, QualityComponent> STREAM_CODEC = StreamCodec.composite(
		ByteBufCodecs.BYTE,
		QualityComponent::level,
		QualityComponent::new);
}
