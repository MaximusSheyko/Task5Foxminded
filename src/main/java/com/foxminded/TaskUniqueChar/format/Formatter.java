package com.foxminded.TaskUniqueChar.format;

import com.foxminded.TaskUniqueChar.data.DataCharCounter;

public class Formatter implements com.foxminded.TaskUniqueChar.intarfaces.Formatter{
    
    public static final String ILLEGAL_EX = "input data is null";
    
    @Override
    public String getForm(DataCharCounter data) throws IllegalAccessException {
	if (data == null) {
	    throw new IllegalAccessException(ILLEGAL_EX);
	}
		
	var form = new StringBuilder();
	String spliterator = System.lineSeparator();

	form.append(data.getPreSplitString()).append(spliterator);

	for (int count = 0; data.getSymbols().size() > count; count++) {
	    form.append(String.format("'%s' -> %d%s", data.getSymbols().get(count),
		    data.getAmountOfSymbols().get(count), System.lineSeparator()));
	}

	return form.toString();
    }
}
