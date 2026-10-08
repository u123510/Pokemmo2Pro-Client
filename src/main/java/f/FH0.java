package f;

import cn.pokemmo.graphics.math.Vector4fParameter;

/**
 * 兼容垫片 (Shim) - 4维浮点向量与边界参数 (Vector4f Parameter)
 * 实际实现已迁移至 {@link Vector4fParameter}
 */
public class FH0 extends Vector4fParameter {
    public FH0() { super(); }
    public FH0(float first, float second, float third, float fourth) {
        super(first, second, third, fourth);
    }
}
