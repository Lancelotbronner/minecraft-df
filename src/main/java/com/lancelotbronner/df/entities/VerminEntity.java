package com.lancelotbronner.df.entities;

import com.lancelotbronner.df.DwarfFortress;
import com.lancelotbronner.df.data.Vermin;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NonNull;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class VerminEntity extends AmbientCreature {
	public final Vermin kind;

	protected VerminEntity(EntityType<VerminEntity> type, Level level, Vermin kind) {
		super(type, level);
		this.kind = kind;
	}

	public static Supplier<EntityType<VerminEntity>> of(
		Vermin kind,
		UnaryOperator<EntityType.Builder<VerminEntity>> builder
	) {
		return DwarfFortress.ENTITY_TYPES.registerEntityType(
			kind.name,
			new EntityType.EntityFactory<>() {
				@Override
				public @NonNull VerminEntity create(EntityType<VerminEntity> a, Level b) {
					return new VerminEntity(a, b, kind);
				}
			},
			MobCategory.AMBIENT,
			b -> builder.apply(b.sized(0.1f, 0.2f).spawnDimensionsScale(2.0f)));
	}
}
