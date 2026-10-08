package f;

import java.util.List;
import cn.pokemmo.util.collection.PrimitiveIntCompactHashSet;

/**
 * 兼容垫片 (Shim) - 紧凑型原生整型开放哈希集合 (Primitive Int Compact Hash Set)
 * 实际实现已迁移至 {@link PrimitiveIntCompactHashSet}
 */
public final class ld_0 extends PrimitiveIntCompactHashSet {
    public ld_0() { super(); }
    public ld_0(int i) { super(i); }
    public ld_0(List list) { super(list); }
}
