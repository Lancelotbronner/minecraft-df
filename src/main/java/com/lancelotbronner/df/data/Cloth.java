package com.lancelotbronner.df.data;

public enum Cloth {
	SILK("silk", Color.GRAY),
	;

	public final String name;
	public final Color color;

	Cloth(String name, Color color) {
		this.name = name;
		this.color = color;
	}
}

