package cn.pokemmo.ui.animation;

import f.pw_1;

/**
 * 平移动画工厂 (Translate / Position Animation Factory)
 * 编排嵌套群组回溯与并行时间轴动作组合。
 *
 * 对应混淆类: f.pk_1 (pK)
 */
public abstract class TranslateAnimationFactory {

    /**
     * 编排平移动画动作组合
     * 原始混淆方法: el
     */
    public static pw_1 el(pw_1 parent, pw_1 child) {
        return parent.xi0(child).mz0().mz0().mz0().Xf0();
    }

    public static pw_1 buildTranslate(pw_1 parent, pw_1 child) {
        return el(parent, child);
    }
}
