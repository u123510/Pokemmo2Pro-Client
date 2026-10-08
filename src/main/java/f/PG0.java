package f;

import cn.pokemmo.util.collection.ExternalizableBitSet;

/**
 * 兼容垫片 (Shim) - 可序列化紧凑位集合 (Externalizable BitSet)
 * 实际实现已迁移至 {@link ExternalizableBitSet}
 */
public final class PG0 extends ExternalizableBitSet {
    public PG0(int n) { super(n); }
}
