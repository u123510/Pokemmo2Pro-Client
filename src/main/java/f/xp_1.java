package f;

import cn.pokemmo.ui.twl.model.TwlHasCallback;

/**
 * 回调支持抽象兼容垫片
 * @see cn.pokemmo.ui.twl.model.TwlHasCallback
 */
public abstract class xp_1 extends TwlHasCallback {
    public Runnable[] RD0;

    @Override
    public final void Kj(Runnable runnable) {
        super.Kj(runnable);
        this.RD0 = this.callbacks;
    }

    @Override
    public final void j00(u1_0 listener) {
        super.j00(listener);
        this.RD0 = this.callbacks;
    }
}
