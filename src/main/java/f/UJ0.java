package f;

import cn.pokemmo.util.collection.PrimitiveFloatArrayList;

/**
 * 兼容垫片 (Shim) - 紧凑型基本类型 float 动态数组 (Primitive Float Array List)
 * 实际实现已迁移至 {@link PrimitiveFloatArrayList}
 */
public final class UJ0 extends PrimitiveFloatArrayList {
    public UJ0() { super(); }
    public UJ0(int var1) { super(var1); }
    public UJ0(boolean var1, int var2) { super(var1, var2); }
    public UJ0(UJ0 var1) { super(var1); }
    public UJ0(float[] var1) { super(var1); }
    public UJ0(boolean var1, float[] var2, int var3, int var4) {
        super(var1, var2, var3, var4);
    }
}
