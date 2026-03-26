package com.lancelotbronner.df.data;

public enum Pattern {
	SOLID("solid", 1),
	SPOTS("spots", 0),
	STRIPES("stripes", 0),
	MOTTLED("mottled", 0),
	/// Usually only draws the third color, if less than 3 are given it's described as transparent.
	IRIS_EYE("eye/iris", 3),
	/// Usually only draws the second color, if less than 3 are given it's described as transparent.
	PUPIL_EYE("eye/pupil", 3),
	;

	public final String name;
	/// The number of colors this pattern takes, or 0 if it takes any number.
	public final byte colors;

	Pattern(String name, int colors) {
		this.name = name;
		this.colors = (byte) colors;
	}
}
