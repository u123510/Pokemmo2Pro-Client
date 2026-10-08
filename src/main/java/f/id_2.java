package f;

import cn.pokemmo.graphics.light.AmbientCubemap;

/**
 * 兼容垫片 (Shim) - 环境光立方体贴图光照基底 (Ambient Cubemap)
 * 实际实现已迁移至 {@link AmbientCubemap}
 */
public final class id_2 extends AmbientCubemap {
    public id_2() { super(); }
    public id_2(float[] fArray) { super(fArray); }
    public id_2(id_2 id_22) { super(id_22.l3); }
    
    public final id_2 Ve0(float f, float f2, float f3, float f4, float f5, float f6) {
        super.Ve0(f, f2, f3, f4, f5, f6);
        return this;
    }
}
