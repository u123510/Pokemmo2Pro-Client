package f;

import cn.pokemmo.ui.animation.ColorAnimationFactory;

/**
 * 色彩着色动画工厂兼容门面 (Color Animation Factory Shim)
 * 核心逻辑与现代 API 已重构至 cn.pokemmo.ui.animation.ColorAnimationFactory
 */
public abstract class N4 extends ColorAnimationFactory {

    public static pw_1 zr(pw_1 parent, pw_1 child, float delay) {
        return ColorAnimationFactory.zr(parent, child, delay);
    }
}
