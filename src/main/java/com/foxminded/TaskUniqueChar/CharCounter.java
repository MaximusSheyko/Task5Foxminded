package com.foxminded.TaskUniqueChar;

import com.foxminded.TaskUniqueChar.catche.Memory;
import com.foxminded.TaskUniqueChar.format.Formatter;
import com.foxminded.TaskUniqueChar.logic.UniqueCharCounter;

import java.util.ArrayList;
import java.util.List;

public class CharCounter {
    private Memory cache;
    private UniqueCharCounter charCounter;
    private Formatter form;
    private List<String> resultCount = new ArrayList<>();

    private String getResultCount() {
	var totalResult = new StringBuilder();

	for (String result : resultCount) {
	    totalResult.append(result);
	}

	return totalResult.toString();
    }

    public CharCounter(Memory cache, UniqueCharCounter charCounter, Formatter form) {
	this.cache = cache;
	this.charCounter = charCounter;
	this.form = form;
    }

    public String showNumberOfCharacters(String... strings) throws IllegalAccessException {
	if (strings == null) {
	    throw new IllegalAccessException("input dates is null");
	}

	for (String str : strings) {
	    if (cache.getCache().containsKey(str)) {
		resultCount.add(cache.getCache().get(str));
	    } else {
		resultCount.add(form.getForm(charCounter.countNumberOfUniqueChar(str)));
		cache.putCache(str, form.getForm(charCounter.countNumberOfUniqueChar(str)));
	    }
	}

	return getResultCount();
    }
}
