package f;

import cn.pokemmo.graphics.material.attribute.DepthTestAttribute;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ma_1
 * 核心实现已迁移至 {@link cn.pokemmo.graphics.material.attribute.DepthTestAttribute}
 */
public class ma_1 extends DepthTestAttribute {
    public ma_1() {
        super();
    }

    public ma_1(boolean value) {
        super(value);
    }

    public ma_1(int value) {
        super(value);
    }

    public ma_1(int value, boolean enabled) {
        super(value, enabled);
    }

    public ma_1(int value, float first, float second) {
        super(value, first, second);
    }

    public ma_1(int value, float first, float second, boolean enabled) {
        super(value, first, second, enabled);
    }

    public ma_1(long type, int value, float first, float second, boolean enabled) {
        super(type, value, first, second, enabled);
    }

    public ma_1(DepthTestAttribute other) {
        super(other);
    }

    @Override
    public hf_1 pD0() {
        return new ma_1(this);
    }
}
