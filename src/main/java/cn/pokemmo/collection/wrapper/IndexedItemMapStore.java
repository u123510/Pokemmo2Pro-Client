package cn.pokemmo.collection.wrapper;

import f.w7_0;

/**
 * 物品索引哈希集合全局单例存储
 */
public class IndexedItemMapStore {
    public static final IndexedItemMapStore INSTANCE = new IndexedItemMapStore();
    public final w7_0 Nf;

    public IndexedItemMapStore() {
        this.Nf = new w7_0();
    }
}
