package com.foxminded.TaskUniqueChar.logic;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import com.foxminded.TaskUniqueChar.data.DataCharCounter;

public class UniqueCharCounter {
    
    private static final String ILLEGAL_EXCEPTION = "input data is null";
    private static final String SPLITERATOR = "";
    
    public DataCharCounter countNumberOfUniqueChar(String inString) throws IllegalAccessException {
	if (inString == null) {
	    throw new IllegalAccessException(ILLEGAL_EXCEPTION);
	}

	var data = new DataCharCounter();
	
	data.setPreSplitString(inString);
	List<String> symbols = Arrays.stream(inString.split(SPLITERATOR))
		.distinct()
		.toList();
	symbols.stream().
		forEach(symbol ->  data.putSymbolAndAmountOfSymbols(symbol, countSymbols(symbol, inString)));
	
	return data;
    }
    
    private int countSymbols (String symbol, String originString) {
	return (int) Stream.of(originString.split(SPLITERATOR))
		.filter(symbol::equals).count();
    }
}
