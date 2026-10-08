package f;

import cn.pokemmo.ui.twl.renderer.TwlAnimationState;

/**
 * 界面动画状态机兼容垫片
 * @see cn.pokemmo.ui.twl.renderer.TwlAnimationState
 */
public final class KG0 extends TwlAnimationState {
    public KG0(KG0 parent, int initialCapacity) {
        super(parent, initialCapacity);
    }

    public KG0(KG0 parent) {
        super(parent, 16);
    }
}
