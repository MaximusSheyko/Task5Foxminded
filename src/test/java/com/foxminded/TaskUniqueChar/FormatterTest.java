package com.foxminded.TaskUniqueChar;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.foxminded.TaskUniqueChar.data.DataCharCounter;
import com.foxminded.TaskUniqueChar.format.Formatter;

class FormatterTest {

    Formatter form;
    DataCharCounter data;
    private String messageEx = assertThrows(NullPointerException.class, () -> form.getForm(null)).getMessage();
    private String outputString = "sm" + System.lineSeparator()
    	+ "'s' -> 1" + System.lineSeparator() + "'m' -> 1" + System.lineSeparator();

    @BeforeEach
    void init() {
	form = new Formatter();
	data = new DataCharCounter();
    }

    @Test
    void testGetForm_whenInDataIsNull() {
	assertNotNull(messageEx);
    }
    
    
    @Test
    void testGetForm_whenDataIsValid() throws IllegalAccessException {
	List<String> testSymbols = Arrays.asList("s", "m");
	List<Integer> testNumbers = Arrays.asList(1, 1);
	
	data.setPreSplitString("sm");
	data.setSymbols(testSymbols);
	data.setAmountOfSymbols(testNumbers);
	
	assertNotNull(form.getForm(data));
	assertEquals(outputString, form.getForm(data));
    }
    
    
}
