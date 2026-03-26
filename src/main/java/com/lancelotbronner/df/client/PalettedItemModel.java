//package com.lancelotbronner.df.client;
//
//import com.mojang.serialization.MapCodec;
//import com.mojang.serialization.codecs.RecordCodecBuilder;
//import net.minecraft.client.multiplayer.ClientLevel;
//import net.minecraft.client.renderer.item.ItemModel;
//import net.minecraft.client.renderer.item.ItemModelResolver;
//import net.minecraft.client.renderer.item.ItemStackRenderState;
//import net.minecraft.client.renderer.texture.TextureAtlasSprite;
//import net.minecraft.client.resources.model.ResolvedModel;
//import net.minecraft.client.resources.model.geometry.BakedQuad;
//import net.minecraft.client.resources.model.sprite.Material;
//import net.minecraft.client.resources.model.sprite.SpriteId;
//import net.minecraft.core.Direction;
//import net.minecraft.data.AtlasIds;
//import net.minecraft.resources.Identifier;
//import net.minecraft.world.entity.ItemOwner;
//import net.minecraft.world.item.ItemDisplayContext;
//import net.minecraft.world.item.ItemStack;
//import net.neoforged.neoforge.client.model.quad.MutableQuad;
//import org.joml.Matrix4fc;
//import org.jspecify.annotations.NonNull;
//import org.jspecify.annotations.Nullable;
//
//public record PalettedItemModel(ResolvedModel model, TextureAtlasSprite sprite)
//	implements ItemModel {
//	@Override
//	public void update(
//		ItemStackRenderState state,
//		ItemStack stack,
//		@NonNull ItemModelResolver itemModelResolver,
//		@NonNull ItemDisplayContext itemDisplayContext,
//		@Nullable ClientLevel clientLevel,
//		@Nullable ItemOwner itemOwner,
//		int i
//	) {
//		ItemStackRenderState.LayerRenderState layerState = state.newLayer();
//
//		if (stack.hasFoil()) {
//			layerState.setFoilType(ItemStackRenderState.FoilType.STANDARD);
//			state.appendModelIdentityElement(ItemStackRenderState.FoilType.STANDARD);
//			state.setAnimated();
//		}
//
//		ItemStackRenderState.LayerRenderState layer = state.newLayer();
//		layer.prepareQuadList().add(this.bakedSpriteQuads());
//		layer.setUsesBlockLight(false);
//	}
//
//	BakedQuad bakedSpriteQuads() {
//		MutableQuad mutableQuad = new MutableQuad();
//		mutableQuad.setSprite(new Material.Baked(sprite, false), sprite.transparency());
//		mutableQuad.setCubeFaceFromSpriteCoords(Direction.NORTH, 0, 0, 1, 1, 0);
//		mutableQuad.bakeUvsFromPosition();
//		return mutableQuad.toBakedQuad();
//	}
//
//	public record Unbaked(Identifier texture) implements ItemModel.Unbaked {
//		public static final MapCodec<Unbaked> CODEC = RecordCodecBuilder.create(instance -> instance
//			.group(Identifier.CODEC.fieldOf("texture").forGetter(Unbaked::texture))
//			.apply(instance, Unbaked::new));
//		private static final Identifier MODEL_ID = Identifier.withDefaultNamespace("item/generated");
//
//		@Override
//		public @NonNull MapCodec<? extends ItemModel.Unbaked> type() {
//			return CODEC;
//		}
//
//		@Override
//		public @NonNull PalettedItemModel bake(BakingContext ctx, @NonNull Matrix4fc matrix4fc) {
//			ResolvedModel model = ctx.blockModelBaker().getModel(MODEL_ID);
//			TextureAtlasSprite sprite = ctx.sprites().get(new SpriteId(AtlasIds.ITEMS, texture));
//			return new PalettedItemModel(model, sprite);
//		}
//
//		@Override
//		public void resolveDependencies(Resolver resolver) {
//			resolver.markDependency(MODEL_ID);
//		}
//	}
//}
//
