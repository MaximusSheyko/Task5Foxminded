package com.foxminded.TaskUniqueChar;

import java.util.HashMap;

public class Cache {
    private HashMap<String, String> cacheMemory = new HashMap<>();

    public HashMap<String, String> getCacheMemory() {
	return cacheMemory;
    }

    public void setCacheMemory(HashMap<String, String> cacheMemory) {
	this.cacheMemory = cacheMemory;
    }

    public void putMap(String key, String value) {
	this.cacheMemory.put(key, value);
    }
}