package f;

import cn.pokemmo.util.collection.PrimitiveIdentityObjectMap;

/**
 * 兼容垫片 (Shim) - 引用相等性对象哈希映射 (Primitive Identity Object Map)
 * 实际实现已迁移至 {@link PrimitiveIdentityObjectMap}
 */
public final class EI extends PrimitiveIdentityObjectMap {
    public EI() { super(); }
    public EI(int capacity) { super(capacity); }
    public EI(int capacity, float loadFactor) { super(capacity, loadFactor); }
    public EI(EI source) { super(source); }
}
