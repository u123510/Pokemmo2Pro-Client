package ch.qos.logback.classic.turbo;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUMessageCache extends LinkedHashMap<String, Integer> {
    private static final long serialVersionUID = 1L;
    final int cacheSize;
    LRUMessageCache(int cacheSize) {
        super(cacheSize, 1.3333334f, true);
        if (cacheSize < 1) throw new IllegalArgumentException("Cache size cannot be smaller than 1");
        this.cacheSize = cacheSize;
    }
    public int getMessageCountAndThenIncrement(String message) {
        if (message == null) return 0;
        synchronized (this) {
            Integer count = super.get(message);
            if (count == null) count = 0;
            int result = count;
            super.put(message, count + 1);
            return result;
        }
    }
    @Override protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
        return size() > cacheSize;
    }
    @Override public synchronized void clear() { super.clear(); }
}
