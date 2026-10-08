package f;

import cn.pokemmo.graphics.g3d.material.Material;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.BM
 * 核心实现已迁移至 {@link cn.pokemmo.graphics.g3d.material.Material}
 */
public final class BM extends Material {
    public BM() {
        super();
    }

    public BM(String var1) {
        super(var1);
    }

    public BM(hf_1... var1) {
        super(var1);
    }

    public BM(String var1, hf_1... var2) {
        super(var1, var2);
    }

    public BM(es_1 var1) {
        super(var1);
    }

    public BM(String var1, es_1 var2) {
        super(var1, var2);
    }

    public BM(Material var1) {
        super(var1);
    }

    public BM(String var1, Material var2) {
        super(var1, var2);
    }

    public final BM Ll() {
        return new BM(this);
    }
}
