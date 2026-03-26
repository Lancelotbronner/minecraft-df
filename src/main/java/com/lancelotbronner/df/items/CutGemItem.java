package com.lancelotbronner.df.items;

import com.lancelotbronner.df.components.DFComponents;
import com.lancelotbronner.df.components.GemCutComponent;
import com.lancelotbronner.df.data.GemCut;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class CutGemItem extends Item {
	public CutGemItem(Properties properties) {
		super(properties);
		properties.component(DFComponents.GEM_CUT.get(), new GemCutComponent(GemCut.DEFAULT.id()));
	}
}
