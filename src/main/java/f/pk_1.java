package f;

import cn.pokemmo.ui.animation.TranslateAnimationFactory;

/**
 * 平移动画工厂兼容门面 (Translate Animation Factory Shim)
 * 核心逻辑与现代 API 已重构至 cn.pokemmo.ui.animation.TranslateAnimationFactory
 */
public abstract class pk_1 extends TranslateAnimationFactory {

    public static pw_1 el(pw_1 parent, pw_1 child) {
        return TranslateAnimationFactory.el(parent, child);
    }
}
