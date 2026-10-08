package cn.pokemmo.ui.twl.renderer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * TWL 动画与组件渲染状态键 (AnimationState.StateKey)
 * 原始混淆类: f.MD0
 */
public class TwlStateKey {
    public static final HashMap<String, TwlStateKey> KEY_CACHE = new HashMap<>();
    public static final ArrayList<TwlStateKey> KEY_LIST = new ArrayList<>();

    public final String name;
    public final int id;

    public TwlStateKey(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static synchronized TwlStateKey get(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name");
        }
        TwlStateKey key = KEY_CACHE.get(name);
        if (key == null) {
            key = new TwlStateKey(name, KEY_CACHE.size());
            KEY_CACHE.put(name, key);
            KEY_LIST.add(key);
        }
        return key;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof TwlStateKey && this.id == ((TwlStateKey) other).id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
