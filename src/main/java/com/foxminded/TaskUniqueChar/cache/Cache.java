package com.foxminded.TaskUniqueChar.cache;

import java.util.Map;

public interface Cache<T, K> {

    public Map<T, K> getCache();

    public void setCache(Map<T, K> inCache);

    public void putCache(T key, K value);

}
