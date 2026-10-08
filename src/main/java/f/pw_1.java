package f;

import cn.pokemmo.ui.animation.AnimationTimeline;

/**
 * 动画时间轴兼容门面 (Animation Timeline Shim)
 * 核心逻辑与现代 API 已全面重构至 cn.pokemmo.ui.animation.AnimationTimeline
 */
public final class pw_1 extends AnimationTimeline {

    public pw_1() {
        super();
    }

    public static pw_1 xC() {
        return AnimationTimeline.xC();
    }

    public static pw_1 gb0() {
        return AnimationTimeline.gb0();
    }
}
