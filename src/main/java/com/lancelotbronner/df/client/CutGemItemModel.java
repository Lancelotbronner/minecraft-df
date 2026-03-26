//package com.lancelotbronner.df.client;
//
//import com.mojang.serialization.MapCodec;
//import net.minecraft.client.multiplayer.ClientLevel;
//import net.minecraft.client.renderer.item.ItemModel;
//import net.minecraft.client.renderer.item.ItemModelResolver;
//import net.minecraft.client.renderer.item.ItemStackRenderState;
//import net.minecraft.client.resources.model.cuboid.ItemModelGenerator;
//import net.minecraft.client.resources.model.sprite.SpriteGetter;
//import net.minecraft.resources.Identifier;
//import net.minecraft.world.entity.ItemOwner;
//import net.minecraft.world.item.ItemDisplayContext;
//import net.minecraft.world.item.ItemStack;
//import org.joml.Matrix4fc;
//import org.jspecify.annotations.Nullable;
//
//public record CutGemItemModel(SpriteGetter sprites) implements ItemModel {
//	@Override
//	public void update(
//		ItemStackRenderState state,
//		ItemStack stack,
//		ItemModelResolver itemModelResolver,
//		ItemDisplayContext itemDisplayContext,
//		@Nullable ClientLevel clientLevel,
//		@Nullable ItemOwner itemOwner,
//		int i
//	) {
//		ItemStackRenderState.LayerRenderState layerState = state.newLayer();
//
//		if (stack.hasFoil()) {
//			layerState.setFoilType(ItemStackRenderState.FoilType.STANDARD);
//			state.appendModelIdentityElement(ItemStackRenderState.FoilType.STANDARD);;
//			state.setAnimated();
//		}
//
//
//	}
//
//	public record Unbaked() implements ItemModel.Unbaked {
//		private static final MapCodec<Unbaked> CODEC = MapCodec.unit(new Unbaked());
//		private static final Identifier MODEL_ID = Identifier.withDefaultNamespace("item/generated");
//
//		@Override
//		public ItemModel bake(ItemModel.BakingContext context) {
//			// Get the baked quads and return
//			ModelBaker baker = context.blockModelBaker();
//			ResolvedModel resolvedModel = baker.getModel(this.model);
//			TextureSlots slots = resolvedModel.getTopTextureSlots();
//
//			return new RenderTypeModelWrapper(
//				resolvedModel.bakeTopGeometry(slots, baker, BlockModelRotation.X0_Y0).getAll(),
//				this.tints,
//				ModelRenderProperties.fromResolvedModel(baker, resolvedModel, slots),
//				this.type
//			);
//		}
//
//		@Override
//		public MapCodec<? extends ItemModel.Unbaked> type() {
//			return CODEC;
//		}
//
//		@Override
//		public ItemModel bake(BakingContext ctx, Matrix4fc matrix4fc) {
//			ctx.blockModelBaker().getModel(MODEL_ID);
//		}
//
//		@Override
//		public void resolveDependencies(Resolver resolver) {
//			resolver.markDependency(MODEL_ID);
//		}
//	}
//}
