package f;

import cn.pokemmo.ui.animation.FadeAnimationFactory;

/**
 * 淡入淡出动画工厂兼容门面 (Fade Animation Factory Shim)
 * 核心逻辑与现代 API 已重构至 cn.pokemmo.ui.animation.FadeAnimationFactory
 */
public abstract class A2 extends FadeAnimationFactory {

    public static pw_1 Kj0(pw_1 parent, pw_1 child, float delay) {
        return FadeAnimationFactory.Kj0(parent, child, delay);
    }
}
