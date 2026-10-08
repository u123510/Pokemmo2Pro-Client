package cn.pokemmo.util.logging;

import java.util.Map;

public interface MDCAdapter {
    void put(String key, String val);

    String get(String key);

    void remove(String key);

    Map getCopyOfContextMap();
}
