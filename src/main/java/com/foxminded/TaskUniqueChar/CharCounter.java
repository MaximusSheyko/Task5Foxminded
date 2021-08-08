package com.foxminded.TaskUniqueChar;

public class CharCounter {
    private Cache cache;
    private UniqueCharCounter charCounter;
    public static int COUNT_CALL_CACHE = 0;

    public CharCounter(Cache cache, UniqueCharCounter charCounter) {
	this.cache = cache;
	this.charCounter = charCounter;
    }

    public void showNumberOfCharacters(String... strings) throws IllegalAccessException {
	if (strings == null) {
	    throw new IllegalAccessException("string is null");
	}

	var result = new StringBuilder();

	for (String str : strings) {
	    if (cache.getCacheMemory().containsKey(str)) {
		COUNT_CALL_CACHE++;
		result.append(cache.getCacheMemory().get(str));
	    } else {
		result.append(charCounter.countNumberOfUniqueChar(str));
		cache.getCacheMemory().put(str, charCounter.countNumberOfUniqueChar(str));
	    }
	}
    }
}
