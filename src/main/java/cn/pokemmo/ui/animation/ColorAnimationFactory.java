package cn.pokemmo.ui.animation;

import f.pw_1;

/**
 * 色彩滤镜/着色动画工厂 (Color / Tint Animation Factory)
 * 编排多层收束、序列延时与并行补间的时间轴动作组合。
 *
 * 对应混淆类: f.N4
 */
public abstract class ColorAnimationFactory {

    /**
     * 编排色彩着色动画动作组合
     * 原始混淆方法: zr
     */
    public static pw_1 zr(pw_1 parent, pw_1 child, float delay) {
        return parent.xi0(child).mz0().mz0().TD0().p1(delay).Xf0();
    }

    public static pw_1 buildColorTint(pw_1 parent, pw_1 child, float delay) {
        return zr(parent, child, delay);
    }
}
