package com.lancelotbronner.df.components;

import com.lancelotbronner.df.data.GemCut;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

public record GemCutComponent(Identifier cut) {
	public static final Codec<GemCutComponent> CODEC = RecordCodecBuilder.create(instance -> instance
		.group(Identifier.CODEC.fieldOf("cut").forGetter(GemCutComponent::cut))
		.apply(instance, GemCutComponent::new));
	public static final StreamCodec<ByteBuf, GemCutComponent> STREAM_CODEC = StreamCodec.composite(Identifier.STREAM_CODEC,
		GemCutComponent::cut,
		GemCutComponent::new);
}
