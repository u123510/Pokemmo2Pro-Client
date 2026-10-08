package f;

import cn.pokemmo.util.collection.PrimitiveShortArrayList;

/**
 * 兼容垫片 (Shim) - 紧凑型基本类型 short 动态数组 (Primitive Short Array List)
 * 实际实现已迁移至 {@link PrimitiveShortArrayList}
 */
public final class BB extends PrimitiveShortArrayList {
    public BB() { super(); }
    public BB(int var1) { super(var1); }
    public BB(boolean var1, int var2) { super(var1, var2); }
    public BB(BB var1) { super(var1); }
    public BB(short[] var1) { super(var1); }
    public BB(boolean var1, short[] var2, int var3, int var4) { super(var1, var2, var3, var4); }
}
