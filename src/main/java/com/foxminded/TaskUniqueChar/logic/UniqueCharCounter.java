package com.foxminded.TaskUniqueChar.logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import com.foxminded.TaskUniqueChar.data.DataCharCounter;

public class UniqueCharCounter {
    
    public static final String ILLEGAL_EX = "input data is null";
    
    public DataCharCounter countNumberOfUniqueChar(String inString) throws IllegalAccessException {
	if (inString == null) {
	    throw new IllegalAccessException(ILLEGAL_EX);
	}

	var data = new DataCharCounter();
	final var spliterator = "";
	List<String> symbols = Arrays.stream(inString.split(spliterator)).distinct().toList();

	data.setPreSplitString(inString);

	for (String symbol : symbols) {
	    int countSymbol = (int) Stream.of(inString.split(spliterator)).filter(symbol::equals).count();

	    data.addSymbols(symbol);
	    data.addAmountOfSymbols(countSymbol);
	}

	return data;
    }
}
