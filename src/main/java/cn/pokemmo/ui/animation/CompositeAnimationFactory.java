package cn.pokemmo.ui.animation;

import f.pw_1;

/**
 * 复合/暂停动画组合工厂 (Composite / Pause Animation Factory)
 * 编排复合动作与节点收束。
 *
 * 对应混淆类: f.Zw0
 */
public abstract class CompositeAnimationFactory {

    /**
     * 编排复合动画动作
     * 原始混淆方法: H
     */
    public static pw_1 H(pw_1 parent, pw_1 child) {
        return parent.xi0(child).mz0().Xf0().mz0();
    }

    public static pw_1 buildComposite(pw_1 parent, pw_1 child) {
        return H(parent, child);
    }
}
