package f;

import cn.pokemmo.ui.animation.ScaleAnimationFactory;

/**
 * 缩放动画工厂兼容门面 (Scale Animation Factory Shim)
 * 核心逻辑与现代 API 已重构至 cn.pokemmo.ui.animation.ScaleAnimationFactory
 */
public abstract class HB extends ScaleAnimationFactory {

    public static pw_1 p30(pw_1 parent, pw_1 child) {
        return ScaleAnimationFactory.p30(parent, child);
    }
}
