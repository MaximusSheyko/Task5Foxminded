package com.foxminded.TaskUniqueChar.format;

import java.util.Set;

import com.foxminded.TaskUniqueChar.data.DataCharCounter;

public class Formatter implements com.foxminded.TaskUniqueChar.intarfaces.Formatter{
    
    private static final String ILLEGAL_EXCEPTION = "input data is null";
    
    @Override
    public String getForm(DataCharCounter data) throws IllegalArgumentException {
	if (data == null) {
	    throw new IllegalArgumentException(ILLEGAL_EXCEPTION);
	}
		
	var formTable = new StringBuilder();
	Set<String> keys = data.getSymbolAndAmountOfSymbols().keySet ();
	String spliterator = System.lineSeparator();

	formTable.append(data.getPreSplitString()).append(spliterator);

	keys.stream()
		.forEach(key -> formTable.append(String.format("'%s' -> %d%s", key,
		    data.getSymbolAndAmountOfSymbols().get(key), System.lineSeparator())));
	
	return formTable.toString();
    }
}
