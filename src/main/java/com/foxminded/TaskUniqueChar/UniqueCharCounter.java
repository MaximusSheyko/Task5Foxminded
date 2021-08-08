package com.foxminded.TaskUniqueChar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UniqueCharCounter {

    public String countNumberOfUniqueChar(String someStr) throws IllegalAccessException {
	if (someStr == null) {
	    throw new IllegalAccessException("input string is null");
	}

	final String empty = "";
	var resultStr = new StringBuilder();

	List<String> symbols = Arrays.stream(someStr.split(empty)).distinct().toList();

	for (String symbol : symbols) {
	    int countSymbol = (int) Stream.of(someStr.split("")).filter(symbol::equals).count();

	    resultStr.append(String.format("'%s' -> %d%s", symbol, countSymbol, System.lineSeparator()));
	}

	return someStr + System.lineSeparator() + resultStr.toString();
    }
}
