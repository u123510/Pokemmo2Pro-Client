package cn.pokemmo.util.concurrent;

import java.util.HashMap;
import java.util.Map;

public class InheritableMapThreadLocal extends InheritableThreadLocal {
    @Override
    public Object childValue(Object parentValue) {
        Map map = (Map) parentValue;
        return map == null ? null : new HashMap(map);
    }
}
