package f;

import cn.pokemmo.ui.animation.AnimationTween;

/**
 * 补间动画实体兼容门面 (Animation Tween Shim)
 * 核心逻辑与现代 API 已全面重构至 cn.pokemmo.ui.animation.AnimationTween
 */
/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ao_1
 * 核心实现已迁移至 {@link cn.pokemmo.ui.animation.AnimationTween}
 */
public final class ao_1 extends AnimationTween {

    public ao_1() {
        super();
    }

    public static ao_1 DX(Object target, int attribute, float duration) {
        return AnimationTween.DX(target, attribute, duration);
    }

    public static ao_1 yp(int attribute, Object target) {
        return AnimationTween.yp(attribute, target);
    }

    public static ao_1 pc(LB0 timelineCallback) {
        return AnimationTween.pc(timelineCallback);
    }

    public static void xZ() {
        AnimationTween.xZ();
    }
}
