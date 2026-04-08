package com.lancelotbronner.df.utils;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class DFUtils {
	public static <K, V> Map<K, V> map(K[] values, Function<K, V> value) {
		return Stream.of(values).collect(Collectors.toMap(k -> k, value));
	}
}
