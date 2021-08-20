package com.foxminded.TaskUniqueChar.data;

import java.util.HashMap;
import java.util.Map;

public class DataCharCounter {
    
    private Map<String, Integer> symbolAndAmountOfSymbols = new HashMap<>();
    private String preSplitString;
 
    public Map<String, Integer> getSymbolAndAmountOfSymbols() {
        return symbolAndAmountOfSymbols;
    }

    public void putSymbolAndAmountOfSymbols(String key, Integer amountOfSymbols) {
        this.symbolAndAmountOfSymbols.put(key, amountOfSymbols);
    }

    public String getPreSplitString() {
	return preSplitString;
    }

    public void setPreSplitString(String preSplitString) {
	this.preSplitString = preSplitString;
    }
}
