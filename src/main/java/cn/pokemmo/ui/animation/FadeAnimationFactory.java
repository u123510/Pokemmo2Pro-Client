package cn.pokemmo.ui.animation;

import f.pw_1;

/**
 * 淡入淡出/透明度动画工厂 (Fade / Opacity Animation Factory)
 * 编排串行延时与并行补间的时间轴动作组合。
 *
 * 对应混淆类: f.A2
 */
public abstract class FadeAnimationFactory {

    /**
     * 编排淡入淡出动画时间轴序列
     * 原始混淆方法: Kj0
     */
    public static pw_1 Kj0(pw_1 parent, pw_1 child, float delay) {
        return parent.xi0(child).TD0().p1(delay).Xf0();
    }

    public static pw_1 buildFadeSequence(pw_1 parent, pw_1 child, float delay) {
        return Kj0(parent, child, delay);
    }
}
