package com.lancelotbronner.df.data;

public enum Quality {
	NORMAL("normal", "", "", 1.0f, 0, 1.f, 1.f, 1.f),
	WELL("well", "-", "-", 1.1f, 3, 1.2f, 1.2f, 1.2f),
	FINE("fine", "+", "+", 1.2f, 6, 1.4f, 1.4f, 1.4f),
	SUPERIOR("superior", "*", "*", 1.333f, 10, 1.6f, 1.6f, 1.6f),
	EXCEPTIONAL("exceptional", "≡", "≡", 1.5f, 15, 1.8f, 1.8f, 1.8f),
	MASTERWORK("masterwork", "☼", "☼", 2f, 30, 2.0f, 2.0f, 2.0f),
	ARTEFACT("artefact", "", "", 20f, 300, 2f, 3f, 2f),
	;

	public final String name;
	public final String prefix;
	public final String suffix;
	public final float valueMultiplier;
	public final int valueBonus;
	public final float sharpness;
	public final float protection;
	public final float miningSpeed;

	Quality(
		String name,
		String prefix,
		String suffix,
		float valueMultiplier,
		int valueBonus,
		float sharpness,
		float protection,
		float miningSpeed
	) {
		this.name = name;
		this.prefix = prefix;
		this.suffix = suffix;
		this.valueMultiplier = valueMultiplier;
		this.valueBonus = valueBonus;
		this.sharpness = sharpness;
		this.protection = protection;
		this.miningSpeed = miningSpeed;
	}
}
