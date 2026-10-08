package f;

import cn.pokemmo.ui.animation.RotateAnimationFactory;

/**
 * 旋转动画工厂兼容门面 (Rotate Animation Factory Shim)
 * 核心逻辑与现代 API 已重构至 cn.pokemmo.ui.animation.RotateAnimationFactory
 */
public abstract class FB extends RotateAnimationFactory {

    public static pw_1 zd0(float delay) {
        return RotateAnimationFactory.zd0(delay);
    }
}
