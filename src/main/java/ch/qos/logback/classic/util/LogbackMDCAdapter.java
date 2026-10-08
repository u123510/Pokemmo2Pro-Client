package ch.qos.logback.classic.util;

import f.KX;
import f.Sm0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Deque;

public class LogbackMDCAdapter implements Sm0 {
    final ThreadLocal<Map<String, String>> readWriteThreadLocalMap = new ThreadLocal<>();
    final ThreadLocal<Map<String, String>> readOnlyThreadLocalMap = new ThreadLocal<>();
    private final KX threadLocalMapOfDeques = new KX();

    private void nullifyReadOnlyThreadLocalMap() {
        readOnlyThreadLocalMap.set(null);
    }

    @Override
    public void put(String key, String value) {
        if (key == null) throw new IllegalArgumentException("key cannot be null");
        Map<String, String> map = readWriteThreadLocalMap.get();
        if (map == null) {
            map = new HashMap<>();
            readWriteThreadLocalMap.set(map);
        }
        map.put(key, value);
        nullifyReadOnlyThreadLocalMap();
    }

    @Override
    public String get(String key) {
        Map<String, String> map = readWriteThreadLocalMap.get();
        return map == null || key == null ? null : map.get(key);
    }

    @Override
    public void remove(String key) {
        if (key == null) return;
        Map<String, String> map = readWriteThreadLocalMap.get();
        if (map != null) {
            map.remove(key);
            nullifyReadOnlyThreadLocalMap();
        }
    }

    public void clear() {
        readWriteThreadLocalMap.set(null);
        nullifyReadOnlyThreadLocalMap();
    }

    public Map<String, String> getPropertyMap() {
        Map<String, String> readOnly = readOnlyThreadLocalMap.get();
        if (readOnly == null) {
            Map<String, String> readWrite = readWriteThreadLocalMap.get();
            if (readWrite != null) {
                readOnly = Collections.unmodifiableMap(new HashMap<>(readWrite));
                readOnlyThreadLocalMap.set(readOnly);
            }
        }
        return readOnly;
    }

    public Map<String, String> getCopyOfContextMap() {
        Map<String, String> map = getPropertyMap();
        return map == null ? null : new HashMap<>(map);
    }

    public Set<String> getKeys() {
        Map<String, String> map = getPropertyMap();
        return map == null ? null : map.keySet();
    }

    public void setContextMap(Map<String, String> map) {
        if (map == null) readWriteThreadLocalMap.set(null);
        else readWriteThreadLocalMap.set(new HashMap<>(map));
        nullifyReadOnlyThreadLocalMap();
    }

    public void pushByKey(String key, String value) { threadLocalMapOfDeques.Wm0(key, value); }
    public String popByKey(String key) { return threadLocalMapOfDeques.WL0(key); }
    public Deque<String> getCopyOfDequeByKey(String key) { return threadLocalMapOfDeques.dm(key); }
    public void clearDequeByKey(String key) { threadLocalMapOfDeques.OB(key); }
}
