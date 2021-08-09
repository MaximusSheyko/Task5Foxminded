package com.foxminded.TaskUniqueChar.data;

import java.util.ArrayList;
import java.util.List;

public class DataCharCounter {
    List<String> symbols = new ArrayList<>();
    List<Integer> amountOfSymbols = new ArrayList<>();
    String preSplitString;

    public List<String> getSymbols() {
	return symbols;
    }

    public void setSymbols(List<String> symbols) {
	this.symbols = symbols;
    }

    public void addSymbols(String symbol) {
	this.symbols.add(symbol);
    }

    public List<Integer> getAmountOfSymbols() {
	return amountOfSymbols;
    }

    public void setAmountOfSymbols(List<Integer> amountOfSymbols) {
	this.amountOfSymbols = amountOfSymbols;
    }

    public void addAmountOfSymbols(Integer count) {
	this.amountOfSymbols.add(count);
    }

    public String getPreSplitString() {
	return preSplitString;
    }

    public void setPreSplitString(String preSplitString) {
	this.preSplitString = preSplitString;
    }
}
