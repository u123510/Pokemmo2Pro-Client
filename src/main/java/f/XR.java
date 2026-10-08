package f;

import cn.pokemmo.graphics.model.ModelKeyframeIndexResolver4f;

/**
 * 兼容垫片 (Shim) - 3D 动画关键帧四元索引解析器 (Model Keyframe Index Resolver 4f)
 * 实际实现已迁移至 {@link ModelKeyframeIndexResolver4f}
 */
public final class XR extends ModelKeyframeIndexResolver4f {
    public XR(float first, float second, float third, float fourth) {
        super(first, second, third, fourth);
    }
}
