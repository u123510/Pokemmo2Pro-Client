package f;

import cn.pokemmo.collection.list.FastArray;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.es_1
 * 核心实现已迁移至 {@link cn.pokemmo.collection.list.FastArray}
 */
public class es_1 extends FastArray {
    public es_1() {
        super();
    }

    public es_1(int capacity) {
        super(capacity);
    }

    public es_1(boolean ordered, int capacity) {
        super(ordered, capacity);
    }

    public es_1(boolean ordered, int capacity, Class arrayType) {
        super(ordered, capacity, arrayType);
    }

    public es_1(Class arrayType) {
        super(arrayType);
    }

    public es_1(es_1 array) {
        super(array);
    }

    public es_1(FastArray array) {
        super(array);
    }

    public es_1(Object[] array) {
        super(array);
    }

    public es_1(boolean ordered, Object[] array, int start, int count) {
        super(ordered, array, start, count);
    }

    public static es_1 r30(Object... array) {
        return new es_1(array);
    }

    public boolean fp0(es_1 array, boolean identity) {
        return super.fp0((cn.pokemmo.collection.list.FastArray) array, identity);
    }
}
