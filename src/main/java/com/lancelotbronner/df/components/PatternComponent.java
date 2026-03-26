package com.lancelotbronner.df.components;

import com.lancelotbronner.df.data.Color;
import com.lancelotbronner.df.data.Pattern;

import java.util.List;

public record PatternComponent(Pattern pattern, List<Color> colors) {

}
