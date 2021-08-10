package com.foxminded.TaskUniqueChar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.foxminded.TaskUniqueChar.logic.UniqueCharCounter;

class UniqueCharCounterTest {
    
    UniqueCharCounter charCounter;
    private String messageEx = assertThrows(NullPointerException.class, 
	    () -> charCounter.countNumberOfUniqueChar(null)).getMessage();
    
    @BeforeEach
    void init() {
	charCounter = new UniqueCharCounter();
    }

    @Test
    void testCountNumberOfUniqueChar_whenInDataValiNull() {
	assertNotNull(messageEx);
    }
    
}
