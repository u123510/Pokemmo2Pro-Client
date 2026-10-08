package cn.pokemmo.ui.twl.model;

import f.a7_0;
import f.p7_0;
import f.u1_0;

/**
 * 回调支持抽象基类 (HasCallback)
 */
public abstract class TwlHasCallback implements p7_0 {
    public Runnable[] callbacks;

    @Override
    public void Kj(Runnable runnable) {
        this.callbacks = (Runnable[]) a7_0.gE(this.callbacks, runnable, Runnable.class);
    }

    @Override
    public void j00(u1_0 listener) {
        this.callbacks = (Runnable[]) a7_0.tp0(listener, this.callbacks);
    }

    public Runnable[] getCallbacks() {
        return this.callbacks;
    }

    public void addCallback(Runnable runnable) {
        Kj(runnable);
    }

    public void removeCallback(u1_0 listener) {
        j00(listener);
    }
}
