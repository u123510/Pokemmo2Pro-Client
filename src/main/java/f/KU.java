package f;

import cn.pokemmo.util.collection.IdentityObjectList;

/**
 * 兼容垫片 (Shim) - 对象引用相等性动态列表 (Identity Object List)
 * 实际实现已迁移至 {@link IdentityObjectList}
 */
public final class KU extends IdentityObjectList {
    public KU() { super(); }
    public KU(es_1 es_12) { super(es_12); }
    public KU(boolean bl, int n, Class clazz) { super(bl, n, clazz); }
    public KU(boolean bl, int n) { super(bl, n); }
    public KU(boolean bl, Object[] objectArray, int n, int n2) { super(bl, objectArray, n, n2); }
    public KU(Class clazz) { super(clazz); }
    public KU(int n) { super(n); }
    public KU(Object[] objectArray) { super(objectArray); }
}
