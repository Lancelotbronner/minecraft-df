//package com.lancelotbronner.df.client.renderer;
//
//import com.lancelotbronner.df.components.DFComponents;
//import com.mojang.blaze3d.vertex.PoseStack;
//import com.mojang.serialization.MapCodec;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.SubmitNodeCollector;
//import net.minecraft.client.renderer.item.ItemModel;
//import net.minecraft.client.renderer.special.SpecialModelRenderer;
//import net.minecraft.client.resources.model.sprite.SpriteGetter;
//import net.minecraft.client.resources.model.sprite.SpriteId;
//import net.minecraft.resources.Identifier;
//import net.minecraft.world.item.ItemStack;
//import org.joml.Vector3fc;
//import org.jspecify.annotations.Nullable;
//import org.jspecify.annotations.NonNull;
//
//import java.util.function.Consumer;
//
//public record CutGemRenderer(SpriteGetter sprites) implements SpecialModelRenderer<SpriteId> {
//	public static final ItemModel MODEL = Minecraft.getInstance().getModelManager().getItemModel(Identifier.withDefaultNamespace("item/generated"));
//
//	@Nullable
//	public SpriteId extractArgument(ItemStack stack) {
//		return stack.get(DFComponents.GEM_CUT);
//	}
//
//	@Override
//	public void submit(SpriteId sprite, @NonNull PoseStack poseStack, SubmitNodeCollector collector, int lightCoords, int overlayCoords, boolean hasFoil, int outlineColor) {
////		collector.submitModel(
////			this.model, Unit.INSTANCE,
////			poseStack, this.material.renderType(barVisible ? RenderType::entityCutout : RenderType::entitySolid),
////			lightCoords, overlayCoords, -1, this.materialSet.get(this.material), outlineColor, null
////		);
//		collector.submitModel(MODEL, 0, poseStack, lightCoords, overlayCoords, 0, sprite, sprites, outlineColor, null);
//	}
//
//	@Override
//	public void getExtents(Consumer<Vector3fc> consumer) {
//
//	}
//
//	public record Unbaked() implements SpecialModelRenderer.Unbaked {
//		public static final MapCodec<Unbaked> CODEC = MapCodec.unit(new Unbaked());
//
//		@Override
//		public @NonNull MapCodec<Unbaked> type() {
//			return CODEC;
//		}
//
//		@Override
//		public SpecialModelRenderer<?> bake(SpecialModelRenderer.BakingContext ctx) {
//			return new CutGemRenderer(ctx.sprites());
//		}
//	}
//}
