package f;

import cn.pokemmo.graphics.material.attribute.BlendingAttribute;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.sh_0
 * 核心实现已迁移至 {@link cn.pokemmo.graphics.material.attribute.BlendingAttribute}
 */
public class sh_0 extends BlendingAttribute {
    public sh_0() {
        super();
    }

    public sh_0(boolean enabled, int source, int destination, float alpha) {
        super(enabled, source, destination, alpha);
    }

    public sh_0(int source, int destination, float alpha) {
        super(source, destination, alpha);
    }

    public sh_0(int source, int destination) {
        super(source, destination);
    }

    public sh_0(boolean enabled, float alpha) {
        super(enabled, alpha);
    }

    public sh_0(float alpha) {
        super(alpha);
    }

    public sh_0(BlendingAttribute other) {
        super(other);
    }

    @Override
    public hf_1 pD0() {
        return new sh_0(this);
    }
}
