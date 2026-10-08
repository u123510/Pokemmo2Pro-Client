package cn.pokemmo.collection.wrapper;

import java.util.concurrent.ConcurrentHashMap;

public class GlobalConcurrentMapHolder {
    public static final GlobalConcurrentMapHolder V9 = new GlobalConcurrentMapHolder();
    public final ConcurrentHashMap HA;

    public GlobalConcurrentMapHolder() {
        this.HA = new ConcurrentHashMap();
    }
}
