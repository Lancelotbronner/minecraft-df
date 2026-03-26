//package com.lancelotbronner.df.client;
//
//import com.lancelotbronner.df.components.DFComponents;
//import com.lancelotbronner.df.data.Color;
//import com.mojang.blaze3d.vertex.PoseStack;
//import com.mojang.serialization.MapCodec;
//import com.mojang.serialization.codecs.RecordCodecBuilder;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.SubmitNodeCollector;
//import net.minecraft.client.renderer.item.ItemModel;
//import net.minecraft.client.renderer.special.SpecialModelRenderer;
//import net.minecraft.client.resources.model.sprite.SpriteGetter;
//import net.minecraft.client.resources.model.sprite.SpriteId;
//import net.minecraft.resources.Identifier;
//import net.minecraft.world.item.ItemStack;
//import org.joml.Vector3fc;
//import org.jspecify.annotations.NonNull;
//import org.jspecify.annotations.Nullable;
//
//import java.util.function.Consumer;
//
//public record PalettedSpecialRenderer(SpriteGetter sprites, Identifier texture) implements SpecialModelRenderer<SpriteId> {
//	public static final Identifier ATLAS = Identifier.fromNamespaceAndPath("minecraft", "items");
//	// I can't use this because its an ItemModel not a Model, how do I find that model?
//	public static final ItemModel MODEL = Minecraft
//		.getInstance().getModelManager().getItemModel(Identifier.withDefaultNamespace("item/generated"));
//
//	@Nullable
//	public SpriteId extractArgument(ItemStack stack) {
//		Color color = stack.get(DFComponents.PALETTE).color();
//		Identifier tex = texture.withPath(p -> "%s/%s".formatted(p, color.name));
//		return new SpriteId(ATLAS, tex);
//	}
//
//	@Override
//	public void submit(SpriteId sprite, @NonNull PoseStack poseStack, SubmitNodeCollector collector, int lightCoords, int overlayCoords, boolean hasFoil, int outlineColor) {
//		// ok I got my sprite.. now what?
//		collector.submitModel(MODEL, 0, poseStack, lightCoords, overlayCoords, 0, sprite, sprites, outlineColor, null);
//	}
//
//	@Override
//	public void getExtents(Consumer<Vector3fc> consumer) {
//		// what do I even do here?
//	}
//
//	public record Unbaked(Identifier texture) implements SpecialModelRenderer.Unbaked<SpriteId> {
//		// why this no work? reason: no instance(s) of type variable(s) exist so that Object conforms to Unbaked
//		public static final MapCodec<Unbaked> CODEC = RecordCodecBuilder.create(instance -> instance
//			.group(Identifier.CODEC.fieldOf("texture").forGetter(Unbaked::texture))
//			.apply(instance, Unbaked::new));
//
//		@Override
//		public @NonNull MapCodec<Unbaked> type() {
//			return CODEC;
//		}
//
//		@Override
//		public SpecialModelRenderer<SpriteId> bake(SpecialModelRenderer.BakingContext ctx) {
//			return new PalettedSpecialRenderer(ctx.sprites(), texture);
//		}
//	}
//}
//
