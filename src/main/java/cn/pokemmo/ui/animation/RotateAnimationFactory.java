package cn.pokemmo.ui.animation;

import f.pw_1;

/**
 * 旋转/角度动画工厂 (Rotate / Angle Animation Factory)
 * 构造根时间轴、延时并收束为并行的时间轴动作。
 *
 * 对应混淆类: f.FB
 */
public abstract class RotateAnimationFactory {

    /**
     * 构造旋转延时动画动作
     * 原始混淆方法: zd0
     */
    public static pw_1 zd0(float delay) {
        return pw_1.xC().Xf0().p1(delay).mz0().Xf0();
    }

    public static pw_1 buildRotateDelay(float delay) {
        return zd0(delay);
    }
}
