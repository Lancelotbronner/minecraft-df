package com.lancelotbronner.df.data;

import com.lancelotbronner.df.utils.Temperature;

public record Material(
	String name,
	MaterialCategory category,
	Color color,
	short ignitePoint,
	short meltingPoint,
	short boilingPoint,
	short specHeat,
	short solidDensity
) {
	public static class Builder {
		String name;
		MaterialCategory category;
		Color color;
		short value = 0;
		short ignitePoint = Temperature.NONE;
		short meltingPoint = -1;
		short boilingPoint = -1;
		short specHeat = 100;
		short solidDensity = Temperature.NONE;

		public Builder(String name, MaterialCategory category, Color color) {
			this.name = name;
			this.category = category;
			this.color = color;
		}

		public Material build() {
			return new Material(
				name,
				category,
				color,
				ignitePoint,
				meltingPoint,
				boilingPoint,
				specHeat,
				solidDensity);
		}

		public Builder value(int value) {
			this.value = (short) value;
			return this;
		}

		public Builder ignitePoint(int temp) {
			ignitePoint = (short) temp;
			return this;
		}

		public Builder meltingPoint(int temp) {
			meltingPoint = (short) temp;
			return this;
		}

		public Builder boilingPoint(int temp) {
			boilingPoint = (short) temp;
			return this;
		}

		/// Rate at which the material heats up or cools down (in J⋅kg−1⋅K−1.)
		public Builder specificHeat(int temp) {
			specHeat = (short) temp;
			return this;
		}

		/// Specifies the density (in kg/m³) of the material when in solid form.
		/// Also affects combat calculations; affects blunt-force damage and ability of weak-in-impact-yield blunt attacks to pierce armor.
		public Builder solidDensity(int temp) {
			solidDensity = (short) temp;
			return this;
		}
	}
}

