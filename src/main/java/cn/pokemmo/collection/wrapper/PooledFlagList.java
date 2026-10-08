package cn.pokemmo.collection.wrapper;

import f.es_1;

/**
 * 带布尔标记的对象池列表包装器
 */
public class PooledFlagList {
    public final es_1 r10;
    public boolean as;

    public PooledFlagList() {
        this.r10 = new es_1();
    }
}
