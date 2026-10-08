package cn.pokemmo.ui.widget.component;

import f.le0_2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class WidgetHierarchyCache {
    public static final ConcurrentHashMap kD0 = new ConcurrentHashMap();
    public static final WidgetHierarchyCache iL = new WidgetHierarchyCache();

    public WidgetHierarchyCache() {
    }

    public static List AI(Class<?> ignored) {
        return new ArrayList();
    }

    public static List DO(Class<?> ignored) {
        return new ArrayList();
    }

    public static List z1(Class<?> type) {
        return (List) kD0.computeIfAbsent(type, key -> AI((Class<?>) key));
    }

    public synchronized void IT(le0_2 value) {
        List list = (List) kD0.computeIfAbsent(value.getClass(), key -> DO((Class<?>) key));
        list.add(value);
    }
}
