package f;

import cn.pokemmo.util.collection.PrimitiveIntQueue;

/**
 * 兼容垫片 (Shim) - 紧凑型基本类型 int 环形队列 (Primitive Int Queue)
 * 实际实现已迁移至 {@link PrimitiveIntQueue}
 */
public final class RB extends PrimitiveIntQueue {
    public RB() { super(); }
    public RB(int capacity) { super(capacity); }
}
