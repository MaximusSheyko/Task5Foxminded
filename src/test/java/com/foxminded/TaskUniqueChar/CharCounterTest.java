package com.foxminded.TaskUniqueChar;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.foxminded.TaskUniqueChar.cache.Memory;
import com.foxminded.TaskUniqueChar.format.Formatter;
import com.foxminded.TaskUniqueChar.logic.UniqueCharCounter;

@RunWith(MockitoJUnitRunner.class)
class CharCounterTest {
    @Mock
    private Formatter form;
    @Mock
    private Memory memory;
    @Mock
    private UniqueCharCounter counter;
    @InjectMocks
    private CharCounter facade;
    
    @BeforeEach
    void init() {
	form = mock(Formatter.class);
	memory = mock(Memory.class);
	counter = mock(UniqueCharCounter.class);
	facade = new CharCounter(memory, counter, form);
    }
    
    @Test
    void testShowNumberOfCharacters() throws IllegalAccessException {
	
	facade.showNumberOfCharacters("some", "some");
	
	verify(counter, times(4)).countNumberOfUniqueChar("some");
	verify(form, times(4)).getForm(counter.countNumberOfUniqueChar("some"));
    }

}
