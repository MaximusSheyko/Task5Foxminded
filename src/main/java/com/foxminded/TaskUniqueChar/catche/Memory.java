package com.foxminded.TaskUniqueChar.catche;

import java.util.HashMap;
import java.util.Map;

public class Memory implements Cache<String, String> {

    private Map<String, String> cacheMemory = new HashMap<>();

    @Override
    public Map<String, String> getCache() {
	return this.cacheMemory;
    }

    @Override
    public void setCache(Map<String, String> inCache) {
	this.cacheMemory = inCache;
    }

    @Override
    public void putCache(String key, String value) {
	this.cacheMemory.put(key, value);
    }
}