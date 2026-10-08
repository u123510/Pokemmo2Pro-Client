package ch.qos.logback.classic.util;

import f.KX;
import f.Sm0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Deque;

public class LogbackMDCAdapterSimple implements Sm0 {
    final ThreadLocal<Map<String, String>> threadLocalUnmodifiableMap;
    private final KX threadLocalMapOfDeques;

    public LogbackMDCAdapterSimple() {
        threadLocalUnmodifiableMap = new ThreadLocal<>();
        threadLocalMapOfDeques = new KX();
    }

    private Map<String, String> duplicateMap(Map<String, String> map) {
        return map == null ? new HashMap<>() : new HashMap<>(map);
    }

    private void makeUnmodifiableAndThreadLocalSet(Map<String, String> map) {
        threadLocalUnmodifiableMap.set(Collections.unmodifiableMap(map));
    }

    @Override
    public void put(String key, String value) {
        if (key == null) throw new IllegalArgumentException("key cannot be null");
        Map<String, String> map = duplicateMap(threadLocalUnmodifiableMap.get());
        map.put(key, value);
        makeUnmodifiableAndThreadLocalSet(map);
    }

    @Override
    public void remove(String key) {
        if (key == null) return;
        Map<String, String> current = threadLocalUnmodifiableMap.get();
        if (current == null) return;
        Map<String, String> map = duplicateMap(current);
        map.remove(key);
        makeUnmodifiableAndThreadLocalSet(map);
    }

    public void clear() {
        threadLocalUnmodifiableMap.remove();
    }

    @Override
    public String get(String key) {
        Map<String, String> map = threadLocalUnmodifiableMap.get();
        return map == null || key == null ? null : map.get(key);
    }

    public Map<String, String> getPropertyMap() {
        return threadLocalUnmodifiableMap.get();
    }

    public Set<String> getKeys() {
        Map<String, String> map = getPropertyMap();
        return map == null ? null : map.keySet();
    }

    public Map<String, String> getCopyOfContextMap() {
        return duplicateMap(threadLocalUnmodifiableMap.get());
    }

    public void setContextMap(Map<String, String> map) {
        makeUnmodifiableAndThreadLocalSet(duplicateMap(map));
    }

    public void pushByKey(String key, String value) {
        threadLocalMapOfDeques.Wm0(key, value);
    }

    public String popByKey(String key) {
        return threadLocalMapOfDeques.WL0(key);
    }

    public Deque<String> getCopyOfDequeByKey(String key) {
        return threadLocalMapOfDeques.dm(key);
    }

    public void clearDequeByKey(String key) {
        threadLocalMapOfDeques.OB(key);
    }
}
