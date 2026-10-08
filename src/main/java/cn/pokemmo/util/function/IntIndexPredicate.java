package cn.pokemmo.util.function;

import f.com4__3;

public interface IntIndexPredicate extends com4__3 {
    boolean testIndex(int index);

    default boolean Vn(int var1) {
        return testIndex(var1);
    }
}
