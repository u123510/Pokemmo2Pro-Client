package f;

import cn.pokemmo.math.geometry.Vector3f;

/**
 * 3D 向量实体兼容门面 (Vector3f Shim)
 * 核心实现已迁移至 cn.pokemmo.math.geometry.Vector3f
 */
/**
 * 兼容垫片 (Shim) - 原始混淆类: f.C8
 * 核心实现已迁移至 {@link cn.pokemmo.math.geometry.Vector3f}
 */
public final class C8 extends Vector3f {
    private static final long serialVersionUID = 3840054589595372522L;

    public C8() {
        super();
    }

    public C8(float var1, float var2, float var3) {
        super(var1, var2, var3);
    }

    public C8(C8 var1) {
        super(var1);
    }

    public C8(Vector3f var1) {
        super(var1);
    }

    public C8(float[] var1) {
        super(var1);
    }

    public C8(Bp0 var1, float var2) {
        super(var1, var2);
    }
}
