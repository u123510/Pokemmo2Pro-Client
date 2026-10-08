package cn.pokemmo.ui.animation;

import f.pw_1;

/**
 * 缩放动画工厂 (Scale / Size Animation Factory)
 * 编排节点收束与并行展开的时间轴动作组合。
 *
 * 对应混淆类: f.HB
 */
public abstract class ScaleAnimationFactory {

    /**
     * 编排缩放动画动作组合
     * 原始混淆方法: p30
     */
    public static pw_1 p30(pw_1 parent, pw_1 child) {
        return parent.xi0(child).mz0().Xf0();
    }

    public static pw_1 buildScale(pw_1 parent, pw_1 child) {
        return p30(parent, child);
    }
}
