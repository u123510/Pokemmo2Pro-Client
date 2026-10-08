package f;

import cn.pokemmo.util.collection.PrimitiveIntArrayList;

/**
 * 兼容垫片 (Shim) - 紧凑型基本类型 int 动态数组 (Primitive Int Array List)
 * 实际实现已迁移至 {@link PrimitiveIntArrayList}
 */
public final class Nn0 extends PrimitiveIntArrayList {
    public Nn0() { super(); }
    public Nn0(int capacity) { super(capacity); }
    public Nn0(boolean mutable, int capacity) { super(mutable, capacity); }
    public Nn0(Nn0 other) { super(other); }
    public Nn0(int[] values) { super(values); }
    public Nn0(boolean mutable, int[] values, int offset, int length) {
        super(mutable, values, offset, length);
    }
}
