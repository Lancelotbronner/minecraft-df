package com.lancelotbronner.df.materials;

import com.lancelotbronner.df.data.Color;
import com.lancelotbronner.df.data.MaterialCategory;

public record Material(
	String name,
	MaterialCategory category,
	Color color,
	short value,
	boolean isFlammable,
	boolean isMagmaSafe
) {}